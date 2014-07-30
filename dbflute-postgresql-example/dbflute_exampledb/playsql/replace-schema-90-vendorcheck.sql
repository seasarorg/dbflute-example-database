
-- =======================================================================================
--                                                                            Vendor Check
--                                                                            ============
create table VENDOR_CHECK (
	VENDOR_CHECK_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	TYPE_OF_CHAR char(3),
	TYPE_OF_VARCHAR varchar,
	TYPE_OF_VC_ARRAY varchar[],
	TYPE_OF_TEXT TEXT,
	TYPE_OF_NUMERIC_INTEGER NUMERIC(5, 0),
	TYPE_OF_NUMERIC_BIGINT NUMERIC(12, 0),
	TYPE_OF_NUMERIC_DECIMAL NUMERIC(5, 3),
	TYPE_OF_DECIMAL decimal,
	TYPE_OF_INT8 int8,
	TYPE_OF_INT_ARRAY int8[],
	TYPE_OF_INT4 int4,
	TYPE_OF_BIGINT bigint,
	TYPE_OF_REAL real,
	TYPE_OF_FLOAT float,
	TYPE_OF_MONEY money,
	TYPE_OF_DATE date,
	TYPE_OF_TIMESTAMP timestamp,
	TYPE_OF_TIME time,
	TYPE_OF_TIMETZ timetz,
	TYPE_OF_INTERVAL interval,
	TYPE_OF_BOOL bool,
	TYPE_OF_BIT bit,
	TYPE_OF_BYTEA bytea,
	TYPE_OF_OID oid,
	TYPE_OF_UUID uuid,
	TYPE_OF_XML xml
) ;

-- for the test of Array type
insert into vendor_check (type_of_vc_array, vendor_check_id)
 values ('{aaa, bbb, ccc}', 34567);
insert into vendor_check (type_of_int_array, vendor_check_id)
 values ('{1, 2, 3}', 34568);

-- =======================================================================================
--                                                                              Large Data
--                                                                              ==========
-- for the test of large data
-- creating index is executed at take-finally
-- because of large data registered at load-data 
create table VENDOR_LARGE_DATA
(
	LARGE_DATA_ID BIGINT NOT NULL PRIMARY KEY,
	STRING_INDEX VARCHAR(200) NOT NULL,
	STRING_NO_INDEX VARCHAR(200) NOT NULL,
	STRING_UNIQUE_INDEX VARCHAR(200) NOT NULL,
	INTFLG_INDEX INTEGER NOT NULL,
	NUMERIC_INTEGER_INDEX NUMERIC(8, 0) NOT NULL,
	NUMERIC_INTEGER_NO_INDEX NUMERIC(8, 0) NOT NULL,
	UNIQUE (STRING_UNIQUE_INDEX)
);

create table VENDOR_LARGE_DATA_REF
(
	LARGE_DATA_REF_ID BIGINT NOT NULL PRIMARY KEY,
	LARGE_DATA_ID BIGINT NOT NULL,
	DATE_INDEX DATE NOT NULL,
	DATE_NO_INDEX DATE NOT NULL,
	TIMESTAMP_INDEX timestamp(3) NOT NULL,
	TIMESTAMP_NO_INDEX timestamp(3) NOT NULL,
	NULLABLE_DECIMAL_INDEX NUMERIC(12, 3),
	NULLABLE_DECIMAL_NO_INDEX NUMERIC(12, 3),
	SELF_PARENT_ID BIGINT
);


-- =======================================================================================
--                                                                                    UUID
--                                                                                    ====
create table VENDOR_UUID_FOO
(
	FOO_ID uuid NOT NULL PRIMARY KEY,
	FOO_NAME varchar NOT NULL,
	BAR_ID uuid NOT NULL
) ;

create table VENDOR_UUID_BAR
(
	BAR_ID uuid NOT NULL PRIMARY KEY,
	BAR_NAME varchar NOT NULL
) ;

alter table VENDOR_UUID_FOO add constraint FK_VENDOR_UUID_FOO_BAR 
	foreign key (BAR_ID) references VENDOR_UUID_BAR (BAR_ID) ;


-- =======================================================================================
--                                                                                 DATE PK
--                                                                                 =======
create table VENDOR_DATE_PK
(
	FOO_DATE date NOT NULL PRIMARY KEY,
	FOO_NAME varchar NOT NULL
) ;

create table VENDOR_DATE_FK
(
	BAR_ID integer NOT NULL PRIMARY KEY,
	BAR_DATE date NOT NULL
) ;

alter table VENDOR_DATE_FK add constraint FK_VENDOR_DATE_FK_PK 
	foreign key (BAR_DATE) references VENDOR_DATE_PK (FOO_DATE) ;


-- =======================================================================================
--                                                                                 Inherit
--                                                                                 =======
create table VENDOR_INHERIT_INU (
    INU_ID integer NOT NULL PRIMARY KEY,
    INU_NAME varchar NOT NULL,
    INU_DATE date
);

create table VENDOR_INHERIT_NEKO (
    NEKO_ID integer NOT NULL PRIMARY KEY,
    NEKO_NAME varchar NOT NULL,
    NEKO_DATE date
) inherits (VENDOR_INHERIT_INU);


-- =======================================================================================
--                                                                               Partition
--                                                                               =========
create table VENDOR_PART_MAN (
    PART_MAN_ID integer NOT NULL PRIMARY KEY,
    PART_MAN_NAME varchar NOT NULL,
    PART_MAN_POINT integer NOT NULL,
    PART_MAN_DATE date
);

create table VENDOR_PART_MAN_HIGH (
    like VENDOR_PART_MAN including indexes including defaults including constraints,
    check(70 <= PART_MAN_POINT and PART_MAN_POINT <= 100)
) inherits (VENDOR_PART_MAN);

-- #df:begin#
create function PART_MAN_INSERT_TRIGGER() returns trigger as
$BODY$
begin
  execute 'insert into VENDOR_PART_MAN_HIGH values(($1).*)' USING new;
  return null;
end;
$BODY$
LANGUAGE plpgsql;
-- #df:end#

create trigger PART_MAN_INSERT_TRIGGER BEFORE INSERT OR UPDATE ON VENDOR_PART_MAN
   for each row execute procedure PART_MAN_INSERT_TRIGGER();


-- =======================================================================================
--                                                                             Name Crisis
--                                                                             ===========
create table VENDOR_$_DOLLAR (
	VENDOR_$_DOLLAR_ID INTEGER NOT NULL PRIMARY KEY,
	VENDOR_$_DOLLAR_NAME VARCHAR(64)
) ;

create table "VENDOR-NON COMPILABLE" (
	"NON-COMPILABLE ID" INTEGER NOT NULL PRIMARY KEY,
	"NON COMPILABLE-NAME" VARCHAR(64),
	"PARENT-ID" INTEGER,
	"Next_ParentID" INTEGER
) ;

alter table "VENDOR-NON COMPILABLE" add constraint FK_VENDOR_NON_COMPPILABLE_SELF
	foreign key ("PARENT-ID") references "VENDOR-NON COMPILABLE" ("NON-COMPILABLE ID") ;

alter table "VENDOR-NON COMPILABLE" add constraint "Fk_Vendor_ForeignKey_NAME_CaseCrisis"
	foreign key ("Next_ParentID") references "VENDOR-NON COMPILABLE" ("NON-COMPILABLE ID") ;

create index "Ix_Vendor_Index_NAME_CaseCrisis" on "VENDOR-NON COMPILABLE"("Next_ParentID");
