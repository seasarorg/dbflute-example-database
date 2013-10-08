-- #VendorCheckDecimalSum#

select sum(vendor.TYPE_OF_NUMBER_DECIMAL) as DECIMAL_DIGIT_SUM
  from VENDOR_CHECK vendor
