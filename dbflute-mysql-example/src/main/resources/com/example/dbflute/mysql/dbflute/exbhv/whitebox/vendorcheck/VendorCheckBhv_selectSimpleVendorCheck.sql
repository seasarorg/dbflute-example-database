/*
 [df:title]
 Simple Vendor Check Select
 
 [df:description]
 The SQL selects several DB types.
*/
-- #df:entity#
-- !df:pmb!

select vendor.VENDOR_CHECK_ID
     , vendor.TYPE_OF_TEXT
     , vendor.TYPE_OF_NUMERIC_DECIMAL
     , vendor.TYPE_OF_NUMERIC_INTEGER
     , vendor.TYPE_OF_NUMERIC_BIGINT
     , vendor.TYPE_OF_BOOLEAN
     , vendor.TYPE_OF_BLOB
  from VENDOR_CHECK vendor
