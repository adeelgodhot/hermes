#!/bin/sh
export JPDA_OPTS=""

if [ $1 = "true" ];
then
    echo "[INFO] Remote debugging enabled"
    sleep 3s
    export JPDA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005"
fi

export HERMES_LOG_PREFIX=spaddo
export HERMES_CONFIG_BASE=file:../hermes-test/src/main/resources
export HERMES_CONFIG="$HERMES_CONFIG_BASE/hermes.properties"
export COMMON_CONFIG="$HERMES_CONFIG_BASE/common.properties"
#java -Dlogback.configurationFile=$HERMES_CONFIG_BASE/logback.xml -Dhermes.config="$HERMES_CONFIG" $JPDA_OPTS -Xmx1g -Xms1g -Xss64m -XX:+UseG1GC -XX:MaxGCPauseMillis=20 -XX:InitiatingHeapOccupancyPercent=35 -jar target/hermes-rest-server-1.0.3-SNAPSHOT-shaded.jar --port "8080" --security "/*" --jersey "/api/*" --cors "/api/*"
#java -Dlogback.configurationFile=$HERMES_CONFIG_BASE/logback.xml -Dhermes.config="$HERMES_CONFIG" $JPDA_OPTS -Xmx1g -Xms1g -Xss64m -XX:+UseG1GC -XX:MaxGCPauseMillis=20 -XX:InitiatingHeapOccupancyPercent=35 -jar target/hermes-rest-server-1.0.3-SNAPSHOT-shaded.jar --port "8080" --jersey "/api/*" --cors "/api/*"
#-agentlib:TakipiAgent
java -Dspring.profiles.active="debug" -Dlogback.configurationFile=$HERMES_CONFIG_BASE/logback.xml -Dhermes.config="$HERMES_CONFIG" -Dcommon.config="$COMMON_CONFIG" $JPDA_OPTS -Xmx512m -Xms512m -jar target/hermes-rest-server-ui-1.0.5-SNAPSHOT-shaded.jar --port "8081" --jersey "/api/*" --cors "/api/*"
