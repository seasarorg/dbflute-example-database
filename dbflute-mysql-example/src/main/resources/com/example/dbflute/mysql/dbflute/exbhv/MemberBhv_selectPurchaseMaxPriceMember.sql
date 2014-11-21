/*
 [df:title]
 Manual Paging Example for MySQL
 
 [df:description]
 This SQL uses 'sql_calc_found_rows & found_rows()'.
*/
-- #df:entity#

-- !df:pmb extends Paging!
-- !!Integer memberId!!
-- !!List<String> memberNameList:likePrefix!!

/*IF pmb.isPaging()*/
select sql_calc_found_rows
       mb.MEMBER_ID -- // unique key of this result
     , mb.MEMBER_NAME
     , (select max(pur.PURCHASE_PRICE)
          from PURCHASE pur
         where pur.MEMBER_ID = mb.MEMBER_ID
       ) as PURCHASE_MAX_PRICE -- // max of purchase price
     , stat.MEMBER_STATUS_NAME
  from MEMBER mb
    left outer join MEMBER_STATUS stat
      on mb.MEMBER_STATUS_CODE = stat.MEMBER_STATUS_CODE
 /*BEGIN*/
 where
   /*IF pmb.memberId != null*/
   mb.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*FOR pmb.memberNameList*//*FIRST*/and (/*END*/
     /*NEXT 'or '*/mb.MEMBER_NAME like /*#current*/'S%'
   /*LAST*/)/*END*//*END*/
 /*END*/
 order by PURCHASE_MAX_PRICE desc, mb.MEMBER_ID asc
 limit /*pmb.pageStartIndex*/80, /*pmb.fetchSize*/20
-- ELSE select found_rows()
/*END*/