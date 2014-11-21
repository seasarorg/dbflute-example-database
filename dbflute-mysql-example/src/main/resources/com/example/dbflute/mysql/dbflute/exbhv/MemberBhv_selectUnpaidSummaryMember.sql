/*
 [df:title]
 Unpaid Summary Member Select
 
 [df:description]
 This SQL is auto-paging select.
*/
-- #df:entity#
-- *UNPAID_MAN_ID*

-- !df:pmb extends Paging!
-- !!Integer memberId!!
-- !!String memberName!!
-- !!String memberStatusCode:cls(MemberStatus)!!
-- !!boolean unpaidMemberOnly!!

/*IF pmb.isPaging()*/
select mb.MEMBER_ID as UNPAID_MAN_ID
     , mb.MEMBER_NAME as UNPAID_MAN_NAME
     , (select sum(pur.PURCHASE_PRICE)
          from PURCHASE pur
         where pur.MEMBER_ID = mb.MEMBER_ID
           and pur.PAYMENT_COMPLETE_FLG = 0
       ) as UNPAID_PRICE_SUMMARY
     , stat.MEMBER_STATUS_NAME as STATUS_NAME
-- ELSE select count(*)
/*END*/
  from MEMBER mb
    /*IF pmb.isPaging()*/
    left outer join MEMBER_STATUS stat
      on mb.MEMBER_STATUS_CODE = stat.MEMBER_STATUS_CODE
    /*END*/
 /*BEGIN*/where
   /*IF pmb.memberId != null*/mb.MEMBER_ID = /*pmb.memberId*/3/*END*/
   /*IF pmb.memberName != null*/and mb.MEMBER_NAME like /*pmb.memberName*/'S' || '%'/*END*/
   /*IF pmb.memberStatusCode != null*/and mb.MEMBER_STATUS_CODE = /*pmb.memberStatusCode*/'FML'/*END*/
   /*IF pmb.unpaidMemberOnly*/
   and exists (select 'yes'
                 from PURCHASE purchase
                where purchase.MEMBER_ID = mb.MEMBER_ID
                  and purchase.PAYMENT_COMPLETE_FLG = 0
       )
   /*END*/
 /*END*/
 /*IF pmb.isPaging()*/
 order by UNPAID_PRICE_SUMMARY desc, mb.MEMBER_ID asc
 /*END*/
