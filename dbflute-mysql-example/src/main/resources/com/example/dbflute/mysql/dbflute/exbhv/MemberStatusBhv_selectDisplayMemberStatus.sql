/*
 [df:title]
 Display Ordered MemberStatus Select
 
 [df:description]
 This SQL is simple select.
*/
select memberStatus.MEMBER_STATUS_CODE
     , memberStatus.MEMBER_STATUS_NAME
     , memberStatus.DISPLAY_ORDER
  from MEMBER_STATUS memberStatus
 order by memberStatus.DISPLAY_ORDER asc
