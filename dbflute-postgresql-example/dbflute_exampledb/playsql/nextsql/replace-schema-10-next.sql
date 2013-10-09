
CREATE TABLE NEXT_SCHEMA_PRODUCT(
	PRODUCT_ID serial NOT NULL primary key,
	PRODUCT_NAME varchar(200) NOT NULL
);

-- for the test of increment sequence on ReplaceSchema
insert into NEXT_SCHEMA_PRODUCT(PRODUCT_NAME) values('NAME1');
insert into NEXT_SCHEMA_PRODUCT(PRODUCT_NAME) values('NAME2');
insert into NEXT_SCHEMA_PRODUCT(PRODUCT_NAME) values('NAME3');

-- for the test of same name as next schema's
CREATE TABLE WHITE_SAME_NAME (
	SAME_NAME_ID integer NOT NULL PRIMARY KEY,
	SAME_NAME_NAME varchar(100),
	SAME_NAME_LONG bigint
);

CREATE TABLE WHITE_SAME_NAME_REF (
	SAME_NAME_REF_ID bigint NOT NULL PRIMARY KEY,
	SAME_NAME_ID integer NOT NULL,
	NEXT_REF_DATE DATE
);

ALTER TABLE WHITE_SAME_NAME_REF ADD CONSTRAINT FK_WHITE_SAME_NAME_REF
	FOREIGN KEY (SAME_NAME_ID)
	REFERENCES WHITE_SAME_NAME (SAME_NAME_ID);

-- #df:begin#
create or replace function SP_NEXT_NO_PARAMETER()
returns integer as
$BODY$
begin
  return 1;
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#

-- #df:begin#
create or replace function SP_NEXT_IN_OUT_PARAMETER(
  v_in_varchar in varchar
  , v_out_varchar out varchar
  , v_inout_varchar out varchar)
as
$BODY$
begin
  v_out_varchar := 'ddd';
  v_inout_varchar := 'eee';
end;
$BODY$ LANGUAGE 'plpgsql';
-- #df:end#
