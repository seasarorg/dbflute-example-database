
-- =======================================================================================
--                                                                               Procedure
--                                                                               =========
-- #df:begin#
create procedure SP_NO_PARAMETER
language sql
begin
end
-- #df:end#

-- #df:begin#
create procedure SP_IN_OUT_PARAMETER(
  in v_in_varchar varchar(200)
  , out v_out_varchar varchar(200)
  , inout v_inout_varchar varchar(200)
) language sql
begin
  set v_out_varchar = v_inout_varchar;
  set v_inout_varchar = v_in_varchar;
end
-- #df:end#

-- #df:begin#
create procedure SP_IN_OUT_RETURN(
  in v_in_varchar varchar(200)
  , out v_out_varchar varchar(200)
  , inout v_inout_varchar varchar(200)
) language sql
begin
  set v_out_varchar = 'qux';
  set v_inout_varchar = 'quux';
  return 1;
end
-- #df:end#

-- #df:begin#
create procedure SP_VARIOUS_TYPE_PARAMETER(
  in v_in_varchar varchar(32)
  , out v_out_varchar varchar(32)
  , out v_out_char char(4)
  , in v_in_clob clob
  , out v_out_clob clob
  , in vv_in_numeric_integer numeric(5, 0)
  , in vv_in_numeric_bigint numeric(12, 0)
  , in vv_in_numeric_decimal numeric(5, 3)
  , inout vv_inout_integer integer
  , out vv_out_bigint bigint
  , in vvv_in_date date
  , out vvv_out_timestamp timestamp
) language sql
begin
  set v_out_varchar = v_in_varchar;
  set v_out_char = 'qux';
  set v_out_clob = v_in_clob;
  set vv_out_bigint = vv_inout_integer;
  set vv_inout_integer = 6789;
  set vvv_out_timestamp = current_timestamp;
end
-- #df:end#

-- =======================================================================================
--                                                                        Return ResultSet
--                                                                        ================
-- #df:begin#
create procedure SP_RETURN_RESULT_SET()
dynamic result sets 1
language sql
begin
  declare cur_member cursor with return for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER;
  open cur_member;
end
-- #df:end#


-- #df:begin#
create procedure SP_RETURN_RESULT_SET_MORE()
dynamic result sets 2
language sql
begin
  declare cur_member cursor with return for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER;
  declare cur_member_status cursor with return for
    select * from MEMBER_STATUS;
  open cur_member;
  open cur_member_status;
end
-- #df:end#

-- #df:begin#
-- not allowed with out-parameter and return
create procedure SP_RETURN_RESULT_SET_WITH(in v_in_char char(3))
dynamic result sets 2
language sql
begin
  declare cur_member cursor with return for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER where MEMBER_STATUS_CODE = v_in_char;
  declare cur_member_status cursor with return for
    select * from MEMBER_STATUS
     where MEMBER_STATUS_CODE = v_in_char;
  open cur_member;
  open cur_member_status;
end
-- #df:end#

-- =======================================================================================
--                                                                                Function
--                                                                                ========
-- unsupported yet, cannot create, why?
-- #df:begin#
--create function FN_NO_PARAMETER
--returns varchar(200)
--language sql
--begin
--  return 'FN_NO_PARAMETER';
--end
-- #df:end#

-- #df:begin#
--create function FN_IN_OUT_PARAMETER(
--  v_in_varchar varchar(200)
--  , v_out_varchar varchar(200)
--  , v_inout_varchar varchar(200)
--) returns varchar(200)
--language sql
--begin
--  return 'FN_IN_OUT_PARAMETER';
--end
-- #df:end#
