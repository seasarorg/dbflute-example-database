
-- =======================================================================================
--                                                                                   Basic
--                                                                                   =====
-- #df:begin#
create procedure dbo.SP_NO_PARAMETER
as
  return 1
-- #df:end#

-- #df:begin#
create procedure dbo.SP_IN_OUT_PARAMETER
    @v_in_varchar varchar(10)
    , @v_out_varchar varchar(10) output
    , @v_inout_varchar varchar(10) output
as
  set @v_out_varchar = @v_inout_varchar
  set @v_inout_varchar = @v_in_varchar
-- #df:end#

-- #df:begin#
create procedure dbo.SP_IN_OUT_RETURN
    @v_in_varchar varchar(10)
    , @v_out_varchar varchar(10) output
    , @v_inout_varchar varchar(10) output
as 
  set @v_out_varchar = 'qux'
  set @v_inout_varchar = 'quux'
  return 1
-- #df:end#

-- #df:begin#
create procedure dbo.SP_VARIOUS_TYPE_PARAMETER
    @v_in_varchar varchar(10)
    , @v_out_nvarchar nvarchar(10) output
    , @v_out_char char(3) output
    , @v_in_text text
    , @v_out_text text output
    , @vv_in_numeric_integer numeric(5, 0)
    , @vv_in_numeric_bigint numeric(12, 0)
    , @vv_in_numeric_decimal numeric(5, 3)
    , @vv_inout_integer integer output
    , @vv_out_bigint bigint output
    , @vvv_in_datetime datetime
    , @vvv_out_datetime datetime output
    , @vvvv_in_uniqueidentifier uniqueidentifier
as
  set @v_out_nvarchar = @v_in_varchar
  set @v_out_char = 'qux'
  set @v_out_text = @v_in_text
  set @vv_out_bigint = @vv_inout_integer
  set @vv_inout_integer = 6789
  set @vvv_out_datetime = getdate()
-- #df:end#

-- =======================================================================================
--                                                                     ResultSet Parameter
--                                                                     ===================
-- #df:begin#
-- it may be unsupported
-- refer to ProcedureTest for details
create procedure dbo.SP_RESULT_SET_PARAMETER
    @v_cursor cursor varying output
as
  set @v_cursor = cursor for
  select * from MEMBER;
  open @v_cursor
-- #df:end#

-- =======================================================================================
--                                                                        Return ResultSet
--                                                                        ================
-- #df:begin#
create procedure dbo.SP_RETURN_RESULT_SET AS
select * from MEMBER;
-- #df:end#

-- #df:begin#
create procedure dbo.SP_RETURN_RESULT_SET_MORE
    @statusCode char(3)
as
select * from MEMBER where MEMBER_STATUS_CODE = @statusCode;
select * from MEMBER_STATUS where MEMBER_STATUS_CODE = @statusCode;
-- #df:end#

-- #df:begin#
create procedure dbo.SP_RETURN_RESULT_SET_WITH
    @v_in_char char(3)
    , @v_out_varchar varchar(10) output
    , @v_inout_varchar varchar(10) output
    , @v_in_integer integer
    , @v_in_bigint bigint
    , @v_in_numeric_decimal numeric(5, 3)
    , @v_in_numeric_integer numeric(5)
    , @v_in_numeric_bigint numeric(12)
    , @v_in_datetime datetime
    , @v_in_uuid uniqueidentifier
as 
  set @v_out_varchar = 'qux'
  set @v_inout_varchar = 'quux'
select * from MEMBER where MEMBER_STATUS_CODE = @v_in_char;
  return 1
-- #df:end#

-- =======================================================================================
--                                                                                  Naming
--                                                                                  ======
-- #df:begin#
create procedure dbo.SpCamelCaseProcedure
    @fooParam varchar(10)
    , @BarParam varchar(10)
    , @vDonParam varchar(10) output
    , @VHeeParam varchar(10)
    , @Poo_ParamName varchar(10) output
as 
  set @vDonParam = 'qux'
  set @Poo_ParamName = 'quux'
-- #df:end#

-- =======================================================================================
--                                                                                Function
--                                                                                ========
-- #df:begin#
create function dbo.FN_NO_PARAMETER()
returns integer 
as
begin
  return 1
end
-- #df:end#

-- #df:begin#
create function dbo.FN_IN_OUT_PARAMETER(@v_in_varchar varchar(32))
returns varchar(32) 
as
begin
  return @v_in_varchar
end
-- #df:end#

-- #df:begin#
create function dbo.FN_RETURN_TABLE(@status char(3))
returns @member table (
    MEMBER_ID integer
    , MEMBER_NAME varchar(200)
    , MEMBER_STATUS_CODE char(3)
) 
as
begin
  insert into @member
  select MEMBER_ID, MEMBER_NAME, MEMBER_STATUS_CODE
    from MEMBER
   where MEMBER_STATUS_CODE = @status
  return
end
-- #df:end#
