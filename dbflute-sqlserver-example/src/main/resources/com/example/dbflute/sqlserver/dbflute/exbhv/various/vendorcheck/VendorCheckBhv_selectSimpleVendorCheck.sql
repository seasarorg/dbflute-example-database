-- #SimpleVendorCheck#

select vendor.VENDOR_CHECK_ID
     , vendor.TYPE_OF_NUMERIC_DECIMAL
     , vendor.TYPE_OF_NUMERIC_INTEGER
     , vendor.TYPE_OF_NUMERIC_BIGINT
     , vendor.TYPE_OF_TEXT
     , vendor.TYPE_OF_DATETIME
     , vendor.TYPE_OF_SMALLDATETIME
     , vendor.TYPE_OF_BIT
     , vendor.TYPE_OF_UNIQUEIDENTIFIER
  from VENDOR_CHECK vendor
