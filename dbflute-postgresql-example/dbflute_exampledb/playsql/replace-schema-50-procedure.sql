
-- =======================================================================================
--                                                                                   Basic
--                                                                                   =====
-- PostgreSQL's function needs a parameter or a return parameter
-- so SP_NO_PARAMETER does not exist

-- #df:begin#
create or replace function SP_IN_OUT_PARAMETER(
  v_in_varchar in varchar
  , v_out_varchar out varchar
  , v_inout_varchar inout varchar
) as
$BODY$
begin
  v_out_varchar := v_inout_varchar;
  v_inout_varchar := v_in_varchar;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- #df:begin#
create or replace function SP_RETURN_PARAMETER()
returns integer as
$BODY$
begin
  return 1;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- #df:begin#
create or replace function SP_VARIOUS_TYPE_PARAMETER(
  v_in_varchar in varchar
  , v_out_varchar out varchar
  , v_out_char out char
  , v_in_text in text
  , v_out_text out text
  , vv_in_numeric_integer in numeric(5, 0)
  , vv_in_numeric_bigint in numeric(12, 0)
  , vv_in_numeric_decimal in numeric(5, 3)
  , vv_out_decimal out decimal
  , vv_out_integer out integer
  , vv_inout_integer inout integer
  , vv_out_bigint out bigint
  , vv_inout_bigint inout bigint
  , vvv_in_date in date
  , vvv_out_timestamp out timestamp
  , vvv_in_time in time
  , vvvv_in_bool in bool
  , vvvv_in_bytea in bytea
  , vvvv_in_oid in oid
  , vvvv_in_uuid in uuid
) as
$BODY$
begin
  v_out_varchar := v_in_varchar;
  v_out_char := 'qux';
  v_out_text := v_in_text;
  vv_out_decimal := 987.654;
  vv_out_bigint := vv_inout_integer;
  vv_inout_integer := vv_inout_bigint;
  vv_inout_bigint := vv_out_integer;
  vv_out_integer := 6789;
  vvv_out_timestamp := current_timestamp;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- =======================================================================================
--                                                                     ResultSet Parameter
--                                                                     ===================
-- #df:begin#
create or replace function SP_RESULT_SET_PARAMETER(cur_member out refcursor)
as
$BODY$
begin
  open cur_member for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- #df:begin#
create or replace function SP_RESULT_SET_PARAMETER_MORE(
  cur_member out refcursor
  , cur_member_status out refcursor
) as
$BODY$
begin
  open cur_member for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
     from MEMBER;
  open cur_member_status for select * from MEMBER_STATUS;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- =======================================================================================
--                                                                        Return ResultSet
--                                                                        ================
-- #df:begin#
create or replace function SP_RETURN_RESULT_SET()
returns refcursor as
$BODY$
declare
  cur_member refcursor;
begin
  open cur_member for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER;
  return cur_member;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- #df:begin#
create or replace function SP_RETURN_RESULT_SET_WITH(
  v_in_char in char
  , v_out_varchar in varchar
  , v_inout_varchar in varchar
) returns refcursor as
$BODY$
declare
  cur_member refcursor;
begin
  open cur_member for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER
     where MEMBER_STATUS_CODE = v_in_char;
  return cur_member;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- =======================================================================================
--                                                                             Transaction
--                                                                             ===========
-- #df:begin#
-- test for being called from Sql2Entity and Application Execution
create or replace function SP_TRANSACTION_INHERIT()
returns integer as
$BODY$
begin
  delete from MEMBER_LOGIN;
  return 1;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- =======================================================================================
--                                                                                  Naming
--                                                                                  ======
-- #df:begin#
create or replace function SpCamelCaseProcedure(
  fooParam in varchar
  , BarParam in varchar
  , vDonParam out varchar
  , VHeeParam in varchar
  , Poo_ParamName out varchar
) as
$BODY$
begin
  vDonParam := 'ddd';
  Poo_ParamName := 'eee';
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#
