
CREATE TABLE VENDOR_CHECK (
	VENDOR_CHECK_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	TYPE_OF_VARCHAR varchar(32),
	TYPE_OF_NVARCHAR nvarchar(32),
	TYPE_OF_TEXT text,
	TYPE_OF_NUMERIC_DECIMAL numeric(5, 3),
	TYPE_OF_NUMERIC_INTEGER numeric(5, 0),
	TYPE_OF_NUMERIC_BIGINT numeric(12, 0),
	TYPE_OF_SMALLINTEGER smallint,
	TYPE_OF_INTEGER integer,
	TYPE_OF_BIGINT bigint,
	TYPE_OF_MONEY money,
	TYPE_OF_SMALLMONEY smallmoney,
	TYPE_OF_DATETIME datetime,
	TYPE_OF_SMALLDATETIME smalldatetime,
	TYPE_OF_BIT bit,
	TYPE_OF_BINARY binary(3000),
	TYPE_OF_VARBINARY varbinary(3000),
	TYPE_OF_UNIQUEIDENTIFIER uniqueidentifier,
	TYPE_OF_XML xml
)  ;


CREATE TABLE VENDOR_SYMMETRIC (
	VENDOR_SYMMETRIC_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	PLAIN_TEXT nvarchar(100),
	ENCRYPTED_DATA varbinary(max)
);

if exists (select * from sys.symmetric_keys where [name] like '%SYMMETRIC_CHECK_KEY%')
drop symmetric key SYMMETRIC_CHECK_KEY
;

create symmetric key SYMMETRIC_CHECK_KEY
  with algorithm = DES
    encryption by password = 'himitsu'
;

open symmetric key SYMMETRIC_CHECK_KEY decryption by password = 'himitsu'
;

-- #df:begin##
insert into VENDOR_SYMMETRIC(VENDOR_SYMMETRIC_ID, PLAIN_TEXT, ENCRYPTED_DATA)
 values(1, 'foo', EncryptByKey(Key_GUID('SYMMETRIC_CHECK_KEY'), N'bar'))
-- #df:end##
