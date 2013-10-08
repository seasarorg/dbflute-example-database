
-- =======================================================================================
--                                                                                  System
--                                                                                  ======
-- #df:changeUser(system)#
-- #df:checkUser()#
create user /*$mainUser*/ identified by /*$mainPassword*/;
grant connect to /*$mainUser*/;
grant resource to /*$mainUser*/;
grant create view to /*$mainUser*/;
grant create synonym to /*$mainUser*/;

-- =======================================================================================
--                                                                                   Table
--                                                                                   =====
-- #df:backToMainUser()#
CREATE TABLE NEXT_SCHEMA_PRODUCT(
	PRODUCT_ID NUMBER(16) NOT NULL PRIMARY KEY,
	PRODUCT_NAME VARCHAR(50) NOT NULL,
	PRODUCT_HANDLE_CODE VARCHAR(100) NOT NULL,
	PRODUCT_STATUS_CODE CHAR(3) NOT NULL,
	REGISTER_DATETIME DATE NOT NULL,
	REGISTER_USER VARCHAR(200) NOT NULL,
	REGISTER_PROCESS VARCHAR(200) NOT NULL,
	UPDATE_DATETIME DATE NOT NULL,
	UPDATE_USER VARCHAR(200) NOT NULL,
	UPDATE_PROCESS VARCHAR(200) NOT NULL,
	VERSION_NO NUMBER(38) NOT NULL
)  ;

CREATE TABLE NEXT_SCHEMA_PRODUCT_STATUS(
	PRODUCT_STATUS_CODE CHAR(3) NOT NULL PRIMARY KEY,
	PRODUCT_STATUS_NAME VARCHAR(50) NOT NULL
)  ;

CREATE TABLE NEXT_SCHEMA_SECRET(
	SECRET_CODE CHAR(3) NOT NULL PRIMARY KEY,
	SECRET_NAME VARCHAR(50) NOT NULL,
	SECRET_AUTH_CODE CHAR(3)
)  ;

CREATE TABLE NEXT_SCHEMA_SECRET_AUTH(
	SECRET_AUTH_CODE CHAR(3) NOT NULL PRIMARY KEY,
	SECRET_AUTH_NAME VARCHAR(50) NOT NULL
)  ;

ALTER TABLE NEXT_SCHEMA_PRODUCT ADD CONSTRAINT FK_NEXT_SCHEMA_PRODUCT 
	FOREIGN KEY (PRODUCT_STATUS_CODE) REFERENCES NEXT_SCHEMA_PRODUCT_STATUS (PRODUCT_STATUS_CODE) ;

ALTER TABLE NEXT_SCHEMA_SECRET ADD CONSTRAINT FK_NEXT_SCHEMA_SECRET
	FOREIGN KEY (SECRET_AUTH_CODE) REFERENCES NEXT_SCHEMA_SECRET_AUTH (SECRET_AUTH_CODE) ;

ALTER TABLE NEXT_SCHEMA_PRODUCT_STATUS ADD CONSTRAINT UQ_NEXT_SCHEMA_PRODUCT_STATUS UNIQUE (PRODUCT_STATUS_NAME) ;
ALTER TABLE NEXT_SCHEMA_SECRET ADD CONSTRAINT UQ_NEXT_SCHEMA_SECRET UNIQUE (SECRET_NAME) ;

CREATE SEQUENCE SEQ_NEXT_SCHEMA_PRODUCT START WITH 1000 INCREMENT BY 1;

-- for the test of synonym for same-name table
CREATE TABLE WHITE_SAME_NAME
(
	SAME_NAME_ID NUMBER(16) NOT NULL PRIMARY KEY,
	SAME_NAME_NAME VARCHAR(50) NOT NULL
)  ;
CREATE TABLE WHITE_SAME_NAME_REF
(
	REF_ID NUMBER(16) NOT NULL PRIMARY KEY,
	REF_NAME VARCHAR(50) NOT NULL,
	SAME_NAME_ID NUMBER(16)
)  ;
CREATE TABLE WHITE_SAME_NAME_REF_REF
(
	REF_REF_ID NUMBER(16) NOT NULL PRIMARY KEY,
	REF_REF_NAME VARCHAR(50) NOT NULL,
	REF_REF_COUNT INTEGER NOT NULL,
	REF_ID NUMBER(16)
)  ;
ALTER TABLE WHITE_SAME_NAME_REF ADD CONSTRAINT FK_WHITE_SAME_NAME_REF
	FOREIGN KEY (SAME_NAME_ID) REFERENCES WHITE_SAME_NAME (SAME_NAME_ID) ;
ALTER TABLE WHITE_SAME_NAME_REF_REF ADD CONSTRAINT FK_WHITE_SAME_NAME_REF_REF
	FOREIGN KEY (REF_ID) REFERENCES WHITE_SAME_NAME_REF (REF_ID) ;

-- =======================================================================================
--                                                                                 Comment
--                                                                                 =======
comment on table NEXT_SCHEMA_PRODUCT is '隣のスキーマ:隣のベーシックなテーブル';
comment on table NEXT_SCHEMA_PRODUCT_STATUS is '隣のスキステ:これのみえてよい';
comment on table NEXT_SCHEMA_SECRET is '隣の秘密で権限なし:隣から見えちゃだめ。だけどデータリンクならしょうがない';
comment on table NEXT_SCHEMA_SECRET_AUTH is '隣の秘密で権限あり:シノニムで見えてOK。まあ権限あるから結局直接見えるけど';
comment on column NEXT_SCHEMA_PRODUCT.PRODUCT_ID is '隣の商品ID:隣のベーシックなPK';
comment on column NEXT_SCHEMA_PRODUCT.PRODUCT_NAME is '隣の商品名称:隣のベーシックなName';
comment on column NEXT_SCHEMA_SECRET_AUTH.SECRET_AUTH_CODE is '隣の秘密２コード:隣の商品を秘密するかもしれない';
comment on column NEXT_SCHEMA_SECRET_AUTH.SECRET_AUTH_NAME is '隣の秘密２名称:';

-- =======================================================================================
--                                                                         Basic Procedure
--                                                                         ===============
-- #df:begin#
create or replace procedure SP_NEXT_NO_PARAMETER
as
begin
  dbms_output.put_line('foo');
end SP_NEXT_NO_PARAMETER;
-- #df:end#

-- #df:begin#
create or replace procedure SP_NEXT_IN_OUT_PARAMETER(
  v_in_varchar in varchar2
  , v_out_varchar out varchar2
  , v_inout_varchar in out varchar2) as
begin
  dbms_output.put_line(v_in_varchar);
  dbms_output.put_line(v_out_varchar);
  dbms_output.put_line(v_inout_varchar);
  v_out_varchar := v_inout_varchar;
  v_inout_varchar := v_in_varchar;
end SP_NEXT_IN_OUT_PARAMETER;
/
-- #df:end#

-- #df:begin#
create or replace package NEXT_PKG as
  procedure SP_PKG_NO_PARAMETER;
  procedure SP_PKG_IN_OUT_PARAMETER(v_in_varchar in varchar2
                                  , v_out_varchar out varchar2
                                  , v_inout_varchar in out varchar2);
end;
-- #df:end#

-- =======================================================================================
--                                                                       Package Procedure
--                                                                       =================
-- #df:begin#
create or replace package body NEXT_PKG as
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
--                                                                          Basic Function
--                                                                          ==============
-- #df:begin#
create or replace function FN_NEXT_NO_PARAMETER
return varchar2 as
begin
  return 'FN_NEXT_NO_PARAMETER';
end FN_NEXT_NO_PARAMETER;
-- #df:end#

-- #df:begin#
create or replace function FN_NEXT_SYNONYM_SAME_NAME
return varchar2 as
begin
  return 'FN_NEXT_SYNONYM_SAME_NAME';
end FN_NEXT_SYNONYM_SAME_NAME;
-- #df:end#

create type NEXT_VARCHAR2_TABLE is table of VARCHAR2(100);

-- =======================================================================================
--                                                                         Great Procedure
--                                                                         ===============
-- #df:begin#
create or replace procedure SP_NEXT_TABLE_PARAMETER(
  v_in_varchar_array in NEXT_VARCHAR2_TABLE
  , v_out_varchar_array out NEXT_VARCHAR2_TABLE
) as
begin
  v_out_varchar_array := v_in_varchar_array;
end SP_NEXT_TABLE_PARAMETER;
/
-- #df:end#

create type NEXT_FOO_BEAN as object (
  FOO_ID        NUMBER(8),
  FOO_NAME      VARCHAR2(20),
  FOO_DECIMAL   NUMBER(5, 3),
  FOO_DATE      DATE,
  FOO_TIMESTAMP TIMESTAMP(3),
  FOO_CLOB      CLOB
);

-- #df:begin#
create or replace procedure SP_NEXT_STRUCT_PARAMETER(
  v_in_foo_bean in NEXT_FOO_BEAN
  , v_out_foo_bean out NEXT_FOO_BEAN
) as
begin
  v_out_foo_bean := v_in_foo_bean;
end SP_NEXT_STRUCT_PARAMETER;
/
-- #df:end#

-- =======================================================================================
--                                                                                 Synonym
--                                                                                 =======
CREATE SYNONYM NEXT_SYNONYM_PRODUCT FOR NEXT_SCHEMA_PRODUCT;
CREATE SYNONYM NEXT_SYNONYM_NO_PARAMETER FOR SP_NEXT_NO_PARAMETER;
CREATE SYNONYM NEXT_SYNONYM_IN_OUT_PARAMETER FOR SP_NEXT_IN_OUT_PARAMETER;
CREATE SYNONYM NEXT_SYNONYM_SECRET FOR NEXT_SCHEMA_SECRET;
CREATE SYNONYM NEXT_SYNONYM_SECRET_AUTH FOR NEXT_SCHEMA_SECRET_AUTH;
