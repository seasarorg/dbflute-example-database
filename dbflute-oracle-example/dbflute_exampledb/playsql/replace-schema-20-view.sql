
CREATE VIEW SUMMARY_PRODUCT AS
select product.PRODUCT_ID
     , product.PRODUCT_NAME
     , product.PRODUCT_STATUS_CODE
     , (select max(purchase.PURCHASE_DATETIME)
          from PURCHASE purchase
         where purchase.PRODUCT_ID = product.PRODUCT_ID
       ) as LATEST_PURCHASE_DATETIME
  from PRODUCT product
;
