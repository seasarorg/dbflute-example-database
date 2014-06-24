/*
 [df:title]
 The example for select using options
 
 [df:description]
 Point:
   o The option of like search (like, likePrefix, likeContain, likeSuffix)
   o The option of from-to search (fromDate, toDate)
   o The option of classifications for ParameterBean (cls(...))
   o The auto option of classifications for CustomizeEntity 
   o The option of relations between ParameterBean and table columns (ref(...))
   o How to set several options (...|...)
*/
-- #df:entity#

-- !df:pmb!
-- !!Integer memberId!!
-- !!String memberName:likePrefix!!
-- !!String memberAccount:like!!
-- !!Date fromFormalizedDate:fromDate!!
-- !!Date toFormalizedDate:toDate!!
-- !!String memberStatusCode:cls(MemberStatus)!!
-- !!Integer displayOrder:ref(MemberStatus)!!
-- !!Date birthdate:fromDate|ref(Member.MEMBER_BIRTHDAY)!!
-- !!String status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE)!!

select member.MEMBER_ID
     , member.MEMBER_NAME
     , member.MEMBER_BIRTHDAY
     , member.MEMBER_FORMALIZED_DATETIME
     , member.MEMBER_STATUS_CODE -- for Classification Test of Sql2Entity
     , memberStatus.MEMBER_STATUS_NAME
     , memberStatus.DISPLAY_ORDER as STATUS_DISPLAY_ORDER -- for Alias Name Test
     , 0 as DUMMY_FLG -- for Classification Test of Sql2Entity
     , 0 as DUMMY_NOFLG -- for Classification Test of Sql2Entity
  from MEMBER member
    left outer join MEMBER_STATUS memberStatus
      on member.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
 /*BEGIN*/
 where
   /*IF pmb.memberId != null*/
   member.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*IF pmb.memberName != null*/
   and member.MEMBER_NAME like /*pmb.memberName*/'S%'
   /*END*/
   /*IF pmb.memberAccount != null*/
   and member.MEMBER_ACCOUNT like /*pmb.memberAccount*/'%v%'
   /*END*/
   /*IF pmb.memberStatusCode != null*/
   and member.MEMBER_STATUS_CODE = /*pmb.memberStatusCode*/'WDL'
   /*END*/
 /*END*/
 order by member.MEMBER_ID asc
