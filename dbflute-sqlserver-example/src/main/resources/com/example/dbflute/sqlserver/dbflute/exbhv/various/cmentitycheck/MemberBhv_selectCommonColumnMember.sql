-- #CommonColumnMember#

select member.MEMBER_ID
     , member.MEMBER_NAME
     , member.REGISTER_DATETIME
     , member.REGISTER_USER
     , member.REGISTER_PROCESS
     , member.UPDATE_DATETIME
     , member.UPDATE_USER
     , member.UPDATE_PROCESS
  from MEMBER member
 order by member.MEMBER_ID asc
