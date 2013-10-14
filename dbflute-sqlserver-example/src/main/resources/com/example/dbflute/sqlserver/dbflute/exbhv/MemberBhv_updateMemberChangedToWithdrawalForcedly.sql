
-- !df:pmb!
-- !!AutoDetect!!

update MEMBER set MEMBER_STATUS_CODE = 'WDL'
 where MEMBER_NAME like /*pmb.memberName*/'S%'
