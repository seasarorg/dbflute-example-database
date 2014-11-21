/*
 [df:title]
 Simple Member Select
 
 [df:description]
 This SQL is the most basic example for outsideSql.
 It uses CustomizeEntity and ParameterBean.
*/
-- #df:entity#

-- !df:pmb!
-- !!Integer memberId!!
-- !!String memberName:likePrefix!!
-- !!Date birthdate!!

select mb.MEMBER_ID
     , mb.MEMBER_NAME
     , mb.BIRTHDATE
     , stat.MEMBER_STATUS_NAME
  from MEMBER mb
    left outer join MEMBER_STATUS stat
      on mb.MEMBER_STATUS_CODE = stat.MEMBER_STATUS_CODE
 /*BEGIN*/
 where
   /*IF pmb.memberId != null*/
   mb.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*IF pmb.memberName != null*/
   and mb.MEMBER_NAME like /*pmb.memberName*/'S%'
   /*END*/
   /*IF pmb.birthdate != null*/
   and mb.BIRTHDATE = /*pmb.birthdate*/'1966-09-15'
   /*END*/
 /*END*/
 order by mb.BIRTHDATE desc, mb.MEMBER_ID asc
