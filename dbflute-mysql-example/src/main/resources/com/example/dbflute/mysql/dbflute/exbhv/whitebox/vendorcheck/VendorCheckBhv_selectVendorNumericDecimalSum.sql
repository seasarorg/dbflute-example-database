/*
 [df:title]
 Vendor Numeric Decimal Summary Select
 
 [df:description]
 The SQL selects summary of numeric decimal.
*/
-- #VendorCheckDecimalSum#

select sum(vendor.TYPE_OF_NUMERIC_DECIMAL) as DECIMAL_DIGIT_SUM
  from VENDOR_CHECK vendor
