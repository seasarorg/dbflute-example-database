
-- #df:assertCountZero#
select count(*)
  from MEMBER
 where MEMBER_STATUS_CODE = 'FML'
   and FORMALIZED_DATETIME is null
;

-- #df:assertListZero#
select member.MEMBER_ID, member.MEMBER_NAME
  from MEMBER member
 where member.MEMBER_STATUS_CODE = 'WDL'
   and not exists (select withdrawal.MEMBER_ID
                     from MEMBER_WITHDRAWAL withdrawal
                    where withdrawal.MEMBER_ID = member.MEMBER_ID
       )
;

-- #df:assertListZero#
select member.MEMBER_ID as MEMBER_ID
     , count(member.MEMBER_ID) as SELECTED_COUNT
     , min(address.MEMBER_ADDRESS_ID) as MIN_ADDRESS_ID
     , max(address.MEMBER_ADDRESS_ID) as MAX_ADDRESS_ID
     , CURRENT_TIMESTAMP as TARGET_DATE
  from MEMBER member
    left outer join MEMBER_ADDRESS address
      on member.MEMBER_ID = address.MEMBER_ID
     and address.VALID_BEGIN_DATE <= CURRENT_TIMESTAMP
     and address.VALID_END_DATE >= CURRENT_TIMESTAMP
 group by member.MEMBER_ID
   having count(member.MEMBER_ID) > 1 
;

-- #df:assertListExists#
select member.MEMBER_ID, member.MEMBER_NAME
  from MEMBER member
 where member.BIRTHDATE is null
;

-- #df:assertListExists#
select cast(objtype as nvarchar(500)) as OBJECT_TYPE
     , cast(objname as nvarchar(500)) as TABLE_NAME
     , cast(value as nvarchar(4000)) as COMMENTS
  from fn_listextendedproperty('MS_Description', 'schema', 'dbo', 'table', default, default, default)
 order by TABLE_NAME asc
;

-- #df:assertListExists#
select cast(objname as nvarchar(500)) as COLUMN_NAME, cast(value as nvarchar(4000)) as COMMENTS
  from fn_listextendedproperty('MS_Description', 'schema', 'dbo', 'table', 'MEMBER', 'column', default)
 order by COLUMN_NAME asc
;