Update mage_custom_order set typ = "ebay_paypal" where method =  "m2epropayment" and length(Paypal_id_ebay) > 4;
Update mage_custom_order set typ = "ebay_vorkasse" where method =  "m2epropayment" and length(Paypal_id_ebay) < 4;
Update mage_custom_order set typ = "Shop_paypal" where method =  "paypal_express" and length(Paypal_id_shop) > 4;
Update mage_custom_order set typ = "Shop_vorkasse" where method =  "banktransfer";
Update mage_custom_order set typ = "Shop_Nachnahme" where method =  "cashondelivery";
Update mage_custom_order set typ = "Shop_Nachnahme" where method =  "phoenix_cashondelivery";
Update mage_custom_order set typ = "Shop_Rechnung" where method =  "invoice";
Update mage_custom_order set typ = "ebay_paypal" where method =  "m2epropayment" and length(Paypal_id_ebay) > 4;
Update mage_custom_order set typ = "Shop_sofort" where method =  "pnsofort" ;
Update mage_custom_order set typ = "ebay_vorkasse" where method =  "m2epropayment" and ebay_order_id is not null and Paypal_id_ebay is null;
Update mage_custom_order set typ = "Amazon" where method =  "m2epropayment" and Kunden_email LIKE "%amazon.de";
Update mage_custom_order as a left join l_carb_shop_de.mage_sales_flat_order_payment  as b on a.order_id =b.parent_id set typ = "ebay_paypal" where a.method =  "m2epropayment" and b.additional_data LIKE "%PayPal%" and a.typ IS NULL ;
Update mage_custom_order set typ = "ebay_vorkasse" where method =  "m2epropayment" and typ is null and Status = "complete";