SELECT order_id as "invoiceId", Bestellung as "orderId", shipping_lable as "shippingId", Kunden_vorname as "firstname", Kunden_name as "lastname", Kunden_email as "email" FROM mage_custom_order WHERE Status = "complete" and Datum_Lieferung > :from and Datum_Lieferung < :until