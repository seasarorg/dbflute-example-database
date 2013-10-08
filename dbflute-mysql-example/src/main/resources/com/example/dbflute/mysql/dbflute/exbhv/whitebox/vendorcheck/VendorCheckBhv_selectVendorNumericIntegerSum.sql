/*
 [df:title]
 Vendor Numeric Integer Summary Select
 
 [df:description]
 The SQL selects summary of numeric integer.
*/
-- #VendorCheckIntegerSum#

select sum(vendor.TYPE_OF_NUMERIC_INTEGER) as INTEGER_NON_DIGIT_SUM
  from VENDOR_CHECK vendor
