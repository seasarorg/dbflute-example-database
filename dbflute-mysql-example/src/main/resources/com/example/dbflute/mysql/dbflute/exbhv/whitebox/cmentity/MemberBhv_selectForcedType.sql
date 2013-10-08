/*
 [df:title]
 Forced Type Select
 
 [df:description]
 The customize entity has forced type column.
*/
-- #df:entity#
-- ##java.math.BigInteger MAX_MEMBER_ID##

select max(member.MEMBER_ID) as MAX_MEMBER_ID
  from MEMBER member
