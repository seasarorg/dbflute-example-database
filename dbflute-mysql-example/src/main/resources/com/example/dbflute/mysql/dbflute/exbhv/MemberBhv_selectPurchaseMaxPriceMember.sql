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
       member.MEMBER_ID -- // unique key of this result
     , member.MEMBER_NAME
     , (select max(purchase.PURCHASE_PRICE)
          from PURCHASE purchase
         where purchase.MEMBER_ID = member.MEMBER_ID
       ) as PURCHASE_MAX_PRICE -- // max of purchase price
     , memberStatus.MEMBER_STATUS_NAME
  from MEMBER member
    left outer join MEMBER_STATUS memberStatus
      on member.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
 /*BEGIN*/
 where
   /*IF pmb.memberId != null*/
   member.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*FOR pmb.memberNameList*//*FIRST*/and (/*END*/
     /*NEXT 'or '*/member.MEMBER_NAME like /*#current*/'S%'
   /*LAST*/)/*END*//*END*/
 /*END*/
 order by PURCHASE_MAX_PRICE desc, member.MEMBER_ID asc
 limit /*pmb.pageStartIndex*/80, /*pmb.fetchSize*/20
-- ELSE select found_rows()
/*END*/