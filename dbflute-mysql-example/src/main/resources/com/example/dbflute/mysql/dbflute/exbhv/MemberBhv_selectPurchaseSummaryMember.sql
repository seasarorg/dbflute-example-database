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

select mb.MEMBER_ID -- // unique key of this result
     , mb.MEMBER_NAME
     , mb.BIRTHDATE
     , mb.FORMALIZED_DATETIME
     , (select sum(pur.PURCHASE_COUNT)
          from PURCHASE pur
         where pur.MEMBER_ID = mb.MEMBER_ID
       ) as PURCHASE_SUMMARY -- // sum of purchase count
  from MEMBER mb
 /*BEGIN*/
 where
   /*FOR pmb.memberNameList*/
   /*NEXT 'and '*/mb.MEMBER_NAME like /*#current*/'%vi%'
   /*END*/
   /*IF pmb.memberStatusCode != null*/
   and mb.MEMBER_STATUS_CODE = /*pmb.memberStatusCode*/'FML'
   /*END*/
   /*IF pmb.formalizedDatetime != null*/
   and mb.FORMALIZED_DATETIME >= /*pmb.formalizedDatetime*/'2003-09-23 12:34:56.147'
   /*END*/
 /*END*/
 order by PURCHASE_SUMMARY desc