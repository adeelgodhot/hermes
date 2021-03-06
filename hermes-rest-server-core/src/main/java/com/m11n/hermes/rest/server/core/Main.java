package com.m11n.hermes.rest.server.core;

import com.m11n.hermes.rest.server.core.config.JettyCorsConfig;
import com.m11n.hermes.rest.server.core.config.JettyJerseyConfig;
import com.m11n.hermes.rest.server.core.config.JettyShiroConfig;
import com.m11n.hermes.rest.server.core.config.LogConfig;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.util.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.net.URI;
import java.util.Arrays;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {

        LogConfig.configure();

        try {
            OptHelper optHelper = new OptHelper(args);

            if(optHelper.hasHelp()) {
                optHelper.printHelp();
                return;
            }

            System.setProperty("hermes.domain", optHelper.getDomain());
            System.setProperty("hermes.host", optHelper.getHost());
            System.setProperty("hermes.port", optHelper.getPort()+"");

            // NOTE: see here for more details https://github.com/Atmosphere/atmosphere/issues/1424
            System.setProperty("javax.servlet.request.encoding", optHelper.getEncoding());
            System.setProperty("javax.servlet.response.encoding", optHelper.getEncoding());
            System.setProperty("file.encoding", optHelper.getEncoding());
            System.setProperty("org.apache.camel.default.charset", optHelper.getEncoding());

            logger.info("Encoding set to: {}", optHelper.getEncoding());

            JettyJerseyConfig.checkAgentArg(args, optHelper.hasComsat());

            Server server = new Server();
            ServerConnector connector = new ServerConnector(server);
            connector.setHost(optHelper.getHost());
            connector.setPort(optHelper.getPort());

            // NOTE: extremely important! Otherwise random zip closed exceptions!
            Resource.setDefaultUseCaches(false);

            // TODO: make this configurable (basically "behind proxy" configuration)?
            HttpConfiguration configuration = new HttpConfiguration();
            configuration.setSendServerVersion(false);
            configuration.setSendXPoweredBy(false);
            configuration.setOutputBufferSize(65536);
            configuration.setRequestHeaderSize(16384);
            configuration.setResponseHeaderSize(16384);
            //configuration.addCustomizer(new ForwardedRequestCustomizer());

            HttpConnectionFactory httpConnectionFactory = new HttpConnectionFactory(configuration);

            connector.setConnectionFactories(Arrays.<ConnectionFactory>asList(httpConnectionFactory));
            //connector.setIdleTimeout(180000);

            server.setConnectors(new Connector[]{connector});

            ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
            context.setContextPath("/");
            if(optHelper.hasComsat()) {
                try {
                    context.setClassLoader((ClassLoader)Class.forName(JettyJerseyConfig.COMSAT_JETTY_CLASSLOADER).newInstance());
                } catch(Exception e) {
                    logger.error(e.toString(), e);
                }
            }

            HandlerCollection handlers = new HandlerCollection();

            DefaultHandler defaultHandler = new DefaultHandler();
            defaultHandler.setServeIcon(false);
            defaultHandler.setShowContexts(false);

            // static content
            ResourceHandler resourceHandler = new ResourceHandler();
            resourceHandler.setDirectoriesListed(true);
            resourceHandler.setWelcomeFiles(new String[]{"index.html"});
            resourceHandler.setBaseResource(Resource.newClassPathResource("/www", false, false));

            //handlers.setHandlers(new Handler[]{resourceHandler, context, defaultHandler});
            handlers.setHandlers(new Handler[]{resourceHandler, context});

            server.setHandler(handlers);

            // TODO: do this in configuration
            if(optHelper.hasSecurity()) {
                JettyShiroConfig.addFilter(context, optHelper.getSecurity());
            }

            if(optHelper.hasCors()) {
                JettyCorsConfig.addFilter(context, optHelper.getCors());
            }

            if(optHelper.hasJersey()) {
                JettyJerseyConfig.addServlet(context, optHelper.getJersey(), optHelper.hasComsat());
            }

            server.start();

            if(optHelper.hasDebug()) {
                server.dump(System.err);
            }

            if(Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                try {
                    String url = "http://" + optHelper.getHost() + ":" + optHelper.getPort();

                    logger.info("Opening default browser at: {}", url);

                    desktop.browse(new URI(url));
                } catch (Exception e) {
                    logger.error(e.toString(), e);
                }
            }

            server.join();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
