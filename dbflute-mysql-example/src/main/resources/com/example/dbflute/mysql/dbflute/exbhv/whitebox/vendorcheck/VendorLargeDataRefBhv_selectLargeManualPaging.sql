/*
 [df:title]
 Large Data with ManualPaging
 
 [df:description]
 test of large data
*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
select ref.*
-- ELSE select count(*)
/*END*/
  from VENDOR_LARGE_DATA_REF ref
 /*IF pmb.zeroData*/
 where ref.LARGE_DATA_REF_ID > 999999 -- to avoid selecting large data in Sql2Entity
 /*END*/
 /*IF pmb.isPaging()*/
 limit /*pmb.pageStartIndex*/80, /*pmb.fetchSize*/20
 /*END*/

