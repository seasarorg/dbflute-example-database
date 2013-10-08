/*
 [df:title]
 Purchase Summary Member Select
 
 [df:description]
 This SQL is cursor select.
*/
-- #df:entity#
-- +cursor+

-- !df:pmb!
-- !!List<String> memberNameList:likeContain!!
-- !!String memberStatusCode:cls(MemberStatus)!!
-- !!Timestamp formalizedDatetime!!

select member.MEMBER_ID -- // unique key of this result
     , member.MEMBER_NAME
     , member.BIRTHDATE
     , member.FORMALIZED_DATETIME
     , (select sum(purchase.PURCHASE_COUNT)
          from PURCHASE purchase
         where purchase.MEMBER_ID = member.MEMBER_ID
       ) as PURCHASE_SUMMARY -- // sum of purchase count
  from MEMBER member
 /*BEGIN*/
 where
   /*FOR pmb.memberNameList*/
   /*NEXT 'and '*/member.MEMBER_NAME like /*#current*/'S%'
   /*END*/
   /*IF pmb.memberStatusCode != null*/
   and member.MEMBER_STATUS_CODE = /*pmb.memberStatusCode*/'FML'
   /*END*/
   /*IF pmb.formalizedDatetime != null*/
   and member.FORMALIZED_DATETIME >= /*pmb.formalizedDatetime*/'2003-09-23 12:34:56.147'
   /*END*/
 /*END*/
 order by PURCHASE_SUMMARY desc