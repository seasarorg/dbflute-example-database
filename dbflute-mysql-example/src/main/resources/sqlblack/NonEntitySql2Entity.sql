/*
 [df:title]
 Non Entity OutsideSql (Sql2Entity)
 
 [df:description]
 use Sql2Entity
*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

select member.MEMBER_ID
     , member.MEMBER_NAME
  from MEMBER member
    left outer join MEMBER_STATUS memberStatus
      on member.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
 /*BEGIN*/where
   /*IF pmb.memberId != null*/member.MEMBER_ID = /*pmb.memberId*/3/*END*/
   /*IF pmb.memberName != null*/and member.MEMBER_NAME like /*pmb.memberName*/'S'/*END*/
 /*END*/
 order by member.MEMBER_ID asc
