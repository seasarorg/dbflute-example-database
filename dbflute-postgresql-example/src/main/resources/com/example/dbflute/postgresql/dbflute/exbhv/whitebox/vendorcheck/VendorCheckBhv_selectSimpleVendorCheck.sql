-- #SimpleVendorCheck#

-- !df:pmb!
-- !!Boolean typeOfBoolean:cls(TrueFalse)!!

select vendor.VENDOR_CHECK_ID
     , vendor.TYPE_OF_VARCHAR
     , vendor.TYPE_OF_VC_ARRAY
     , vendor.TYPE_OF_TEXT
     , vendor.TYPE_OF_NUMERIC_INTEGER
     , vendor.TYPE_OF_NUMERIC_BIGINT
     , vendor.TYPE_OF_NUMERIC_DECIMAL
     , vendor.TYPE_OF_DECIMAL
     , vendor.TYPE_OF_BIGINT
     , vendor.TYPE_OF_INT8
     , vendor.TYPE_OF_INT_ARRAY
     , vendor.TYPE_OF_INT4
     , vendor.TYPE_OF_MONEY
     , vendor.TYPE_OF_DATE
     , vendor.TYPE_OF_TIME
     , vendor.TYPE_OF_TIMESTAMP
     , vendor.TYPE_OF_INTERVAL
     , vendor.TYPE_OF_TIMETZ
     , vendor.TYPE_OF_BOOL
     , vendor.TYPE_OF_BIT
     , vendor.TYPE_OF_BYTEA
     , vendor.TYPE_OF_UUID
     , vendor.TYPE_OF_OID
     , vendor.TYPE_OF_XML
  from VENDOR_CHECK vendor
