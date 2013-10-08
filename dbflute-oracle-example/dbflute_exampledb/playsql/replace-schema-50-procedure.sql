
-- =======================================================================================
--                                                                                   Basic
--                                                                                   =====
-- #df:begin#
create or replace procedure SP_NO_PARAMETER
as
begin
  dbms_output.put_line('foo');
end SP_NO_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace procedure SP_IN_OUT_PARAMETER(
  v_in_varchar in varchar2
  , v_out_varchar out varchar2
  , v_inout_varchar in out varchar2) as
begin
  dbms_output.put_line(v_in_varchar);
  dbms_output.put_line(v_out_varchar);
  dbms_output.put_line(v_inout_varchar);
  v_out_varchar := v_inout_varchar;
  v_inout_varchar := v_in_varchar;
end SP_IN_OUT_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace procedure SP_NULL_OUT_PARAMETER(
  v_out_varchar out varchar2
  , v_out_integer out integer
  , v_out_number out number
  , v_out_date out date) as
begin
  dbms_output.put_line(v_out_varchar);
  dbms_output.put_line(v_out_integer);
  dbms_output.put_line(v_out_number);
  dbms_output.put_line(v_out_date);
  v_out_varchar := null;
  v_out_integer := null;
  v_out_number := null;
  v_out_date := null;
end SP_NULL_OUT_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace procedure SP_VARIOUS_TYPE_PARAMETER(
  v_in_varchar in varchar2
  , v_out_nvarchar out nvarchar2
  , v_out_char out char
  , v_in_clob in clob
  , v_out_clob out clob
  , vv_in_number_integer in number
  , vv_in_number_bigint in number
  , vv_in_number_decimal in number
  , vv_out_decimal out number
  , vv_inout_integer in out integer
  , vv_out_bigint out integer
  , vvv_in_date in date
  , vvv_out_timestamp out timestamp
) as
begin
  v_out_nvarchar := v_in_varchar;
  v_out_char := 'qux';
  v_out_clob := v_in_clob;
  vv_out_decimal := 987.654;
  vv_out_bigint := vv_inout_integer;
  vv_inout_integer := 789;
  vvv_out_timestamp := sysdate;
end SP_VARIOUS_TYPE_PARAMETER;
/
-- #df:end#

-- /- - - - - - - - - - - - - - - - - - - - - - - - -
-- Oracle cannot use overload in no package procedure
-- - - - - - - - - - -/

-- =======================================================================================
--                                                                     ResultSet Parameter
--                                                                     ===================
-- #df:begin#
create or replace procedure SP_RESULT_SET_PARAMETER(cur_member out sys_refcursor)
as
begin
  open cur_member for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER;
end SP_RESULT_SET_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace procedure SP_RESULT_SET_PARAMETER_MORE(
  cur_member out sys_refcursor
  , cur_member_status out sys_refcursor
) as
begin
  open cur_member for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER;
  open cur_member_status for
    select *
      from MEMBER_STATUS;
end SP_RESULT_SET_PARAMETER_MORE;
/
-- #df:end#

-- #df:begin#
create or replace procedure SP_RESULT_SET_PARAMETER_WITH(
  cur_member out sys_refcursor
  , cur_member_status out sys_refcursor
  , v_in_char in char
  , v_out_varchar out varchar2
  , v_inout_varchar in out varchar2
  , v_in_number in number
  , v_in_date in date
  , v_in_timestamp in timestamp)
as
begin
  open cur_member for
    select MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE
      from MEMBER
     where MEMBER_STATUS_CODE = v_in_char;
  open cur_member_status for
    select *
      from MEMBER_STATUS
     where MEMBER_STATUS_CODE = v_in_char;
end SP_RESULT_SET_PARAMETER_WITH;
/
-- #df:end#

-- =======================================================================================
--                                                                       Package Procedure
--                                                                       =================
-- #df:begin#
create or replace package MAIN_PKG as
  procedure SP_PKG_NO_PARAMETER;
  procedure SP_PKG_IN_OUT_PARAMETER(v_in_varchar in varchar2
                                  , v_out_varchar out varchar2
                                  , v_inout_varchar in out varchar2);
end;
-- #df:end#

-- #df:begin#
create or replace package body MAIN_PKG as
procedure SP_PKG_NO_PARAMETER is
begin
  dbms_output.put_line('foo');
end SP_PKG_NO_PARAMETER;
procedure SP_PKG_IN_OUT_PARAMETER(v_in_varchar in varchar2
                                , v_out_varchar out varchar2
                                , v_inout_varchar in out varchar2) is
begin
  dbms_output.put_line(v_in_varchar);
  dbms_output.put_line(v_out_varchar);
  dbms_output.put_line(v_inout_varchar);
  v_out_varchar := 'qux';
  v_inout_varchar := 'quux';
end SP_PKG_IN_OUT_PARAMETER;
end;
-- #df:end#

-- #df:begin#
create or replace package SAME_PKG as
  procedure SP_PKG_NO_PARAMETER;
  procedure SP_PKG_IN_OUT_PARAMETER(v_in_varchar in varchar2
                                  , v_out_varchar out varchar2
                                  , v_inout_varchar in out varchar2);
end;
-- #df:end#

-- #df:begin#
create or replace package body SAME_PKG as
procedure SP_PKG_NO_PARAMETER is
begin
  dbms_output.put_line('foo');
end SP_PKG_NO_PARAMETER;
procedure SP_PKG_IN_OUT_PARAMETER(v_in_varchar in varchar2
                                , v_out_varchar out varchar2
                                , v_inout_varchar in out varchar2) is
begin
  dbms_output.put_line(v_in_varchar);
  dbms_output.put_line(v_out_varchar);
  dbms_output.put_line(v_inout_varchar);
  v_out_varchar := 'qux';
  v_inout_varchar := 'quux';
end SP_PKG_IN_OUT_PARAMETER;
end;
-- #df:end#

-- =======================================================================================
--                                                                                Overload
--                                                                                ========
-- basically unsupported on DBFlute
-- you should use new procedures that call overload procedures 
-- #df:begin#
create or replace package OVERLOAD_PKG as
  procedure SP_OVERLOAD_PARAMETER(v_in_varchar in varchar2
                                , v_out_varchar out varchar2);
  procedure SP_OVERLOAD_PARAMETER(v_in_varchar in varchar2
                                , v_out_varchar out varchar2
                                , v_inout_varchar in out varchar2);
  procedure SP_OVERLOAD_INTERRUPT(v_in_varchar in varchar2
                                , v_out_varchar out varchar2);
  procedure SP_OVERLOAD_PARAMETER(v_in_number in number
                                , v_out_number out number);
end;
-- #df:end#

-- #df:begin#
create or replace package body OVERLOAD_PKG as
procedure SP_OVERLOAD_PARAMETER(v_in_varchar in varchar2
                                , v_out_varchar out varchar2) is
begin
  dbms_output.put_line(v_in_varchar);
  dbms_output.put_line(v_out_varchar);
  v_out_varchar := 'baz';
end SP_OVERLOAD_PARAMETER;
procedure SP_OVERLOAD_PARAMETER(v_in_varchar in varchar2
                              , v_out_varchar out varchar2
                              , v_inout_varchar in out varchar2) is
begin
  dbms_output.put_line(v_in_varchar);
  dbms_output.put_line(v_out_varchar);
  dbms_output.put_line(v_inout_varchar);
  v_out_varchar := 'qux';
  v_inout_varchar := 'quux';
end SP_OVERLOAD_PARAMETER;
procedure SP_OVERLOAD_INTERRUPT(v_in_varchar in varchar2
                              , v_out_varchar out varchar2) is
begin
  dbms_output.put_line(v_in_varchar);
  dbms_output.put_line(v_out_varchar);
  v_out_varchar := 'baz';
end SP_OVERLOAD_INTERRUPT;
procedure SP_OVERLOAD_PARAMETER(v_in_number in number
                                , v_out_number out number) is
begin
  dbms_output.put_line(v_in_number);
  dbms_output.put_line(v_out_number);
  v_out_number := 3;
end SP_OVERLOAD_PARAMETER;
end;
-- #df:end#

-- =======================================================================================
--                                                                              Array Type
--                                                                              ==========
create type VARCHAR2_TABLE is table of VARCHAR2(100);

-- #df:begin#
create or replace procedure SP_TABLE_MANUAL_PARAMETER(
  v_in_varchar_array in VARCHAR2_TABLE
  , v_out_varchar_array out VARCHAR2_TABLE
) as
begin
  v_out_varchar_array := v_in_varchar_array;
end SP_TABLE_MANUAL_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace procedure SP_TABLE_PACKED_PARAMETER(
  v_in_date_array in DBMS_SQL.DATE_TABLE
  , v_out_date_array out DBMS_SQL.DATE_TABLE
) as
begin
  v_out_date_array := v_in_date_array;
end SP_TABLE_PACKED_PARAMETER;
/
-- #df:end#

create type NUMBER_VARRAY is VARRAY(10) of NUMBER(8);

-- #df:begin#
create or replace procedure SP_VARRAY_MANUAL_PARAMETER(
  v_in_number_array in NUMBER_VARRAY
  , v_out_number_array out NUMBER_VARRAY
) as
begin
  v_out_number_array := v_in_number_array;
end SP_VARRAY_MANUAL_PARAMETER;
/
-- #df:end#

create type VARCHAR2_NESTED_TABLE is table of VARCHAR2_TABLE;

-- #df:begin#
create or replace procedure SP_TABLE_NESTED_PARAMETER(
  v_in_varchar_array_array in VARCHAR2_NESTED_TABLE
  , v_out_varchar_array_array out VARCHAR2_NESTED_TABLE
) as
begin
  v_out_varchar_array_array := v_in_varchar_array_array;
end SP_TABLE_NESTED_PARAMETER;
/
-- #df:end#

create type CLOB_TABLE is table of CLOB;

-- #df:begin#
create or replace procedure SP_TABLE_VARIOUS_PARAMETER(
  v_in_clob_array in CLOB_TABLE
  , v_out_clob_array out CLOB_TABLE
) as
begin
  v_out_clob_array := v_in_clob_array;
end SP_TABLE_VARIOUS_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace procedure SP_TABLE_NEXT_PARAMETER(
  v_in_varchar_array in NEXTEXAMPLEDB.NEXT_VARCHAR2_TABLE
  , v_out_varchar_array out NEXTEXAMPLEDB.NEXT_VARCHAR2_TABLE
) as
begin
  v_out_varchar_array := v_in_varchar_array;
end SP_TABLE_NEXT_PARAMETER;
/
-- #df:end#

CREATE SYNONYM SYNONYM_VARCHAR2_BEAN FOR VARCHAR2_TABLE;

-- #df:begin#
create or replace procedure SP_TABLE_SYNONYM_PARAMETER(
  v_in_varchar_array in SYNONYM_VARCHAR2_BEAN
  , v_out_varchar_array out SYNONYM_VARCHAR2_BEAN
) as
begin
  v_out_varchar_array := v_in_varchar_array;
end SP_TABLE_SYNONYM_PARAMETER;
/
-- #df:end#

-- =======================================================================================
--                                                                             Struct Type
--                                                                             ===========
create type FOO_BEAN as object (
  FOO_ID        NUMBER(8),
  FOO_NAME      VARCHAR2(20),
  FOO_DECIMAL   NUMBER(5, 3),
  FOO_DATE      DATE,
  FOO_TIMESTAMP TIMESTAMP(3),
  FOO_CLOB      CLOB
);

create type BAR_BEAN as object (
  BAR_ID        NUMBER(8),
  BAR_NAME      VARCHAR2(20),
  BAR_DECIMAL   NUMBER(5, 3),
  BAR_DATE      DATE,
  BAR_TIMESTAMP TIMESTAMP(3),
  BAR_CLOB      CLOB
);

create type CORGE_BEAN as object (
  CORGE_ID        NUMBER(8),
  CORGE_NAME      VARCHAR2(20),
  CORGE_DECIMAL   NUMBER(5, 3),
  CORGE_DATE      DATE,
  CORGE_TIMESTAMP TIMESTAMP(3),
  CORGE_CLOB      CLOB
);

-- #df:begin#
create or replace procedure SP_STRUCT_BASIC_PARAMETER(
  v_in_foo_bean in FOO_BEAN
  , v_out_foo_bean out FOO_BEAN
) as
begin
  v_out_foo_bean := v_in_foo_bean;
end SP_STRUCT_BASIC_PARAMETER;
/
-- #df:end#

create type FOO_TABLE is table of FOO_BEAN;

-- #df:begin#
create or replace procedure SP_STRUCT_LIST_PARAMETER(
  v_in_foo_list in FOO_TABLE
  , v_out_foo_list out FOO_TABLE
) as
begin
  v_out_foo_list := v_in_foo_list;
end SP_STRUCT_LIST_PARAMETER;
/
-- #df:end#

create type BAR_TABLE is table of BAR_BEAN;
create type BAZ_TABLE is table of BAR_TABLE;
create type QUX_TABLE is table of NUMBER(12);
create type QUUX_TABLE is table of NUMBER(12);
create type CORGE_TABLE is table of CORGE_BEAN;

create type NESTED_BAZ_BEAN as object (
  BAZ_ID   NUMBER(8),
  BAZ_NAME VARCHAR2(20),
  BAZ_DATE DATE,
  BAZ_LIST BAZ_TABLE
  -- could not define self reference
  --,BAZ_SELF    NESTED_BAZ_BEAN
);

create type NESTED_BAR_BEAN as object (
  BAR_ID    NUMBER(8),
  BAR_NAME  VARCHAR2(20),
  BAR_DATE  DATE,
  BAR_LIST  BAR_TABLE,
  BAZ_BEAN1 NESTED_BAZ_BEAN,
  BAZ_BEAN2 NESTED_BAZ_BEAN,
  QUX_LIST  QUX_TABLE,
  QUUX_LIST QUUX_TABLE
);

create type NESTED_FOO_BEAN as object (
  FOO_ID     NUMBER(8),
  FOO_NAME   VARCHAR2(20),
  FOO_DATE   DATE,
  BAR_BEAN   NESTED_BAR_BEAN,
  QUX_LIST   QUX_TABLE,
  QUUX_LIST  QUUX_TABLE,
  CORGE_LIST CORGE_TABLE
);

-- #df:begin#
create or replace procedure SP_STRUCT_NESTED_PARAMETER(
  v_in_foo_bean in NESTED_FOO_BEAN
  , v_out_foo_bean out NESTED_FOO_BEAN
) as
begin
  v_out_foo_bean := v_in_foo_bean;
end SP_STRUCT_NESTED_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace procedure SP_STRUCT_NEXT_PARAMETER(
  v_in_foo_bean in NEXTEXAMPLEDB.NEXT_FOO_BEAN
  , v_out_foo_bean out NEXTEXAMPLEDB.NEXT_FOO_BEAN
) as
begin
  v_out_foo_bean := v_in_foo_bean;
end SP_STRUCT_NEXT_PARAMETER;
/
-- #df:end#

CREATE SYNONYM SYNONYM_FOO_BEAN FOR FOO_BEAN;

-- #df:begin#
create or replace procedure SP_STRUCT_SYNONYM_PARAMETER(
  v_in_foo_bean in SYNONYM_FOO_BEAN
  , v_out_foo_bean out SYNONYM_FOO_BEAN
) as
begin
  v_out_foo_bean := v_in_foo_bean;
end SP_STRUCT_SYNONYM_PARAMETER;
/
-- #df:end#

-- =======================================================================================
--                                                                             Transaction
--                                                                             ===========
-- #df:begin#
-- test for being called from Sql2Entity and Application Execution
create or replace procedure SP_TRANSACTION_INHERIT
as
begin
  delete from MEMBER_LOGIN;
end SP_TRANSACTION_INHERIT;
/
-- #df:end#

-- =======================================================================================
--                                                                          Irregular Case
--                                                                          ==============
-- #df:begin#
/*
 The Oracle procedure, which has 'char' type parameter
 and executes SQL in its statement, causes a strange error.
 (ORA-01460, SQLState=72000, ErrorCode=1460)
 on Oracle 10g XE connected by ojdbc5.jar.
 If you don't use JDBC escape, you can execute this.
 So override ProcedurePmb's isEscapeStatement() if you need.
*/
create or replace procedure SP_ORACLE_CHAR_INOUT_PARAMETER(v_inout_char in out char) as
v1 varchar2(30);
begin
  dbms_output.put_line(v_inout_char);
  v_inout_char := 'FML';
  select MEMBER_STATUS_NAME into v1 from MEMBER_STATUS
   where MEMBER_STATUS_CODE = v_inout_char;
end SP_ORACLE_CHAR_INOUT_PARAMETER;
/
-- #df:end#

-- =======================================================================================
--                                                                                Function
--                                                                                ========
-- #df:begin#
create or replace function FN_NO_PARAMETER
return varchar2 as
begin
  return 'FN_NO_PARAMETER';
end FN_NO_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace function FN_IN_OUT_PARAMETER(
  v_in_varchar in varchar2
  , v_out_varchar out varchar2
  , v_inout_varchar in out varchar2
) return varchar2 as
begin
  dbms_output.put_line(v_in_varchar);
  dbms_output.put_line(v_out_varchar);
  dbms_output.put_line(v_inout_varchar);
  v_out_varchar := 'qux';
  v_inout_varchar := 'quux';
  return 'FN_IN_OUT_PARAMETER';
end FN_IN_OUT_PARAMETER;
/
-- #df:end#
