/*
 [df:title]
 Force Withdrawal Update
 
 [df:description]
 This SQL is normal update.
*/
update MEMBER set MEMBER_STATUS_CODE = 'WDL'
 where MEMBER_NAME like /*pmb*/'S' || '%'
