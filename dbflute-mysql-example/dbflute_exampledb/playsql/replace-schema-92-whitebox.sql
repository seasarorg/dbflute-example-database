
-- /= = = = = = = = = = = = = = = = = = = = = =
-- for the test of only one-to-one table
-- = = = = = = = = = =/
CREATE TABLE WHITE_ONLY_ONE_TO_ONE_FROM(
    FROM_ID BIGINT AUTO_INCREMENT NOT NULL,
    FROM_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (FROM_ID)
);

CREATE TABLE WHITE_ONLY_ONE_TO_ONE_TO(
    TO_ID BIGINT AUTO_INCREMENT NOT NULL,
    TO_NAME VARCHAR(200) NOT NULL,
    FROM_ID BIGINT NOT NULL,
    PRIMARY KEY (TO_ID),
    UNIQUE (FROM_ID)
);

ALTER TABLE WHITE_ONLY_ONE_TO_ONE_TO ADD CONSTRAINT FK_WHITE_ONLY_ONE_TO_ONE_TO_FROM
	FOREIGN KEY (FROM_ID)
	REFERENCES WHITE_ONLY_ONE_TO_ONE_FROM (FROM_ID);

-- /= = = = = = = = = = = = = = = = = = = = = =
-- for the test of over relation, referrer over
-- = = = = = = = = = =/
CREATE TABLE WHITE_PURCHASE_REFERRER(
    PURCHASE_REFERRER_ID BIGINT AUTO_INCREMENT NOT NULL,
    PURCHASE_REFERRER_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (PURCHASE_REFERRER_ID)
);

ALTER TABLE WHITE_PURCHASE_REFERRER ADD CONSTRAINT FK_WHITE_PURCHASE_REFERRER
	FOREIGN KEY (PURCHASE_REFERRER_ID)
	REFERENCES PURCHASE (PURCHASE_ID);

-- /= = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of over relation, split multiple FK
-- = = = = = = = = = =/
CREATE TABLE WHITE_SPLIT_MULTIPLE_FK_BASE(
    BASE_ID BIGINT NOT NULL,
    FIRST_ID INTEGER NOT NULL,
    NEXT_ID BIGINT NOT NULL,
    SPLIT_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (BASE_ID)
);

CREATE TABLE WHITE_SPLIT_MULTIPLE_FK_NEXT(
    NEXT_ID BIGINT NOT NULL,
    SECOND_CODE CHAR(3) NOT NULL,
    PRIMARY KEY (NEXT_ID)
);

CREATE TABLE WHITE_SPLIT_MULTIPLE_FK_REF(
    FIRST_ID INTEGER NOT NULL,
    SECOND_CODE CHAR(3) NOT NULL,
    REF_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (FIRST_ID, SECOND_CODE)
);

CREATE TABLE WHITE_SPLIT_MULTIPLE_FK_CHILD(
    CHILD_ID BIGINT NOT NULL,
    BASE_ID BIGINT NOT NULL,
    CHILD_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (CHILD_ID)
);

ALTER TABLE WHITE_SPLIT_MULTIPLE_FK_BASE ADD CONSTRAINT FK_WHITE_SPLIT_MULTIPLE_FK_NEXT
	FOREIGN KEY (NEXT_ID)
	REFERENCES WHITE_SPLIT_MULTIPLE_FK_NEXT (NEXT_ID) ;

ALTER TABLE WHITE_SPLIT_MULTIPLE_FK_CHILD ADD CONSTRAINT FK_WHITE_SPLIT_MULTIPLE_FK_BASE
	FOREIGN KEY (BASE_ID)
	REFERENCES WHITE_SPLIT_MULTIPLE_FK_BASE (BASE_ID) ;

-- /= = = = = = = = = = = = = = = = = =
-- for the test of implicit reverse FK
-- = = = = = = = = = =/
CREATE TABLE WHITE_IMPLICIT_REVERSE_FK(
    WHITE_IMPLICIT_REVERSE_FK_ID INTEGER AUTO_INCREMENT NOT NULL,
    WHITE_IMPLICIT_REVERSE_FK_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (WHITE_IMPLICIT_REVERSE_FK_ID)
);

CREATE TABLE WHITE_IMPLICIT_REVERSE_FK_REF(
    WHITE_IMPLICIT_REVERSE_FK_REF_ID INTEGER AUTO_INCREMENT NOT NULL,
    WHITE_IMPLICIT_REVERSE_FK_ID INTEGER NOT NULL,
    VALID_BEGIN_DATE DATE NOT NULL,
    VALID_END_DATE DATE NOT NULL,
    PRIMARY KEY (WHITE_IMPLICIT_REVERSE_FK_REF_ID),
    UNIQUE (WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE)
);

CREATE TABLE WHITE_IMPLICIT_REVERSE_FK_SUPPRESS(
    WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID INTEGER AUTO_INCREMENT NOT NULL,
    WHITE_IMPLICIT_REVERSE_FK_ID INTEGER NOT NULL,
    VALID_BEGIN_DATE DATE NOT NULL,
    VALID_END_DATE DATE NOT NULL,
    PRIMARY KEY (WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID),
    UNIQUE (WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE)
);

-- /= = = = = = = = = = = = = = = = = = = =
-- for the test of compound primary key
-- = = = = = = = = = =/
CREATE TABLE WHITE_COMPOUND_REFERRED_NORMALLY (
	REFERRED_ID INTEGER NOT NULL,
	REFERRED_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (REFERRED_ID)
) ;

CREATE TABLE WHITE_COMPOUND_REFERRED_PRIMARY (
	REFERRED_ID INTEGER NOT NULL,
	REFERRED_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (REFERRED_ID)
) ;

CREATE TABLE WHITE_COMPOUND_PK (
	PK_FIRST_ID INTEGER NOT NULL,
	PK_SECOND_ID INTEGER NOT NULL,
	PK_NAME VARCHAR(200) NOT NULL,
	REFERRED_ID INTEGER NOT NULL,
	PRIMARY KEY (PK_FIRST_ID, PK_SECOND_ID),
	UNIQUE (PK_SECOND_ID, REFERRED_ID),
	UNIQUE (PK_SECOND_ID, PK_FIRST_ID)
) ;

CREATE TABLE WHITE_COMPOUND_PK_REF (
	MULTIPLE_FIRST_ID INTEGER NOT NULL,
	MULTIPLE_SECOND_ID INTEGER NOT NULL,
	REF_FIRST_ID INTEGER NOT NULL,
	REF_SECOND_ID INTEGER NOT NULL,
	REF_NAME VARCHAR(50) NOT NULL,
	PRIMARY KEY (MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID)
) ;

ALTER TABLE WHITE_COMPOUND_PK_REF ADD CONSTRAINT FK_WHITE_COMPOUND_PK_REF
	FOREIGN KEY (REF_FIRST_ID, REF_SECOND_ID)
	REFERENCES WHITE_COMPOUND_PK (PK_FIRST_ID, PK_SECOND_ID) ;

-- for the test of multiple compound key
CREATE TABLE WHITE_COMPOUND_PK_REF_NEST (
	COMPOUND_PK_REF_NEST_ID INTEGER NOT NULL PRIMARY KEY,
	FOO_MULTIPLE_ID INTEGER NOT NULL,
	BAR_MULTIPLE_ID INTEGER NOT NULL,
	QUX_MULTIPLE_ID INTEGER NOT NULL,
	NEST_NAME VARCHAR(50) NOT NULL
) ;

ALTER TABLE WHITE_COMPOUND_PK_REF_NEST ADD CONSTRAINT FK_WHITE_COMPOUND_PK_REF_NEST_FOO_BAR
	FOREIGN KEY (FOO_MULTIPLE_ID, BAR_MULTIPLE_ID)
	REFERENCES WHITE_COMPOUND_PK_REF (MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID) ;

ALTER TABLE WHITE_COMPOUND_PK_REF_NEST ADD CONSTRAINT FK_WHITE_COMPOUND_PK_REF_NEST_BAR_QUX
	FOREIGN KEY (BAR_MULTIPLE_ID, QUX_MULTIPLE_ID)
	REFERENCES WHITE_COMPOUND_PK_REF (MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID) ;

-- for the test of correlated fixed condition
CREATE TABLE WHITE_COMPOUND_PK_REF_MANY (
	MULTIPLE_FIRST_ID INTEGER NOT NULL,
	MULTIPLE_SECOND_ID INTEGER NOT NULL,
	REF_MANY_FIRST_ID INTEGER NOT NULL,
	REF_MANY_SECOND_ID INTEGER NOT NULL,
	REF_MANY_CODE CHAR(3) NOT NULL,
	REF_MANY_NAME VARCHAR(50) NOT NULL,
	REF_MANY_DATETIME DATETIME NOT NULL,
	PRIMARY KEY (MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID)
) ;

-- /= = = = = = = = = = = = = = = 
-- for the test of unique-key FK
-- = = = = = = = = = =/
CREATE TABLE WHITE_UQ_FK (
	UQ_FK_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	UQ_FK_CODE CHAR(3) NOT NULL,
	UNIQUE (UQ_FK_CODE)
) ;

CREATE TABLE WHITE_UQ_FK_REF (
	UQ_FK_REF_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	FK_TO_PK_ID NUMERIC(16) NOT NULL,
	FK_TO_UQ_CODE CHAR(3) NOT NULL,
	COMPOUND_UQ_FIRST_CODE CHAR(3) NOT NULL,
	COMPOUND_UQ_SECOND_CODE CHAR(3) NOT NULL,
	UNIQUE (COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE)
) ;

ALTER TABLE WHITE_UQ_FK_REF ADD CONSTRAINT FK_WHITE_UQ_FK_REF_PK
	FOREIGN KEY (FK_TO_PK_ID) REFERENCES WHITE_UQ_FK (UQ_FK_ID) ;

ALTER TABLE WHITE_UQ_FK_REF ADD CONSTRAINT FK_WHITE_UQ_FK_REF_UQ
	FOREIGN KEY (FK_TO_UQ_CODE) REFERENCES WHITE_UQ_FK (UQ_FK_CODE) ;

-- for the test of compound unique key
-- and the test of same name key
CREATE TABLE WHITE_UQ_FK_REF_NEST (
	UQ_FK_REF_NEST_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	COMPOUND_UQ_FIRST_CODE CHAR(3) NOT NULL,
	COMPOUND_UQ_SECOND_CODE CHAR(3) NOT NULL
) ;

ALTER TABLE WHITE_UQ_FK_REF_NEST ADD CONSTRAINT FK_WHITE_UQ_FK_REF_NEST_UQ
	FOREIGN KEY (COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE)
	REFERENCES WHITE_UQ_FK_REF (COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE) ;

CREATE TABLE WHITE_UQ_FK_WITHOUT_PK (
	UQ_FK_CODE CHAR(3) NOT NULL,
	UQ_FK_NAME VARCHAR(64) NOT NULL,
	UNIQUE (UQ_FK_CODE)
) ;

CREATE TABLE WHITE_UQ_FK_WITHOUT_PK_REF (
	UQ_FK_REF_ID NUMERIC(16) NOT NULL,
	FK_TO_UQ_CODE CHAR(3) NOT NULL
) ;

ALTER TABLE WHITE_UQ_FK_WITHOUT_PK_REF ADD CONSTRAINT FK_WHITE_UQ_FK_WITHOUT_PK_REF
	FOREIGN KEY (FK_TO_UQ_CODE) REFERENCES WHITE_UQ_FK_WITHOUT_PK (UQ_FK_CODE) ;

-- /= = = = = = = = = = = = = = = = = = = = = = 
-- for the test of unique key as classification
-- = = = = = = = = = =/
CREATE TABLE WHITE_UQ_CLASSIFICATION (
	UQ_CLS_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	UQ_CLS_CODE CHAR(3) NOT NULL,
	UNIQUE (UQ_CLS_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = 
-- for the test of no-primary-key table
-- = = = = = = = = = =/
CREATE TABLE WHITE_NO_PK (
	NO_PK_ID NUMERIC(16) NOT NULL,
	NO_PK_NAME VARCHAR(32),
	NO_PK_INTEGER INTEGER
) ;

CREATE VIEW WHITE_NO_PK_RELATION as
select product.PRODUCT_ID
     , product.PRODUCT_NAME
     , product.PRODUCT_HANDLE_CODE
     , product.PRODUCT_STATUS_CODE
     , (select max(purchase.PURCHASE_DATETIME)
          from PURCHASE purchase
         where purchase.PRODUCT_ID = product.PRODUCT_ID
       ) as LATEST_PURCHASE_DATETIME
  from PRODUCT product
;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of variant relation (biz-many-to-one)
-- = = = = = = = = = =/
CREATE TABLE WHITE_VARIANT_RELATION_MASTER_FOO(
    MASTER_FOO_ID BIGINT NOT NULL,
    MASTER_FOO_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (MASTER_FOO_ID)
);

CREATE TABLE WHITE_VARIANT_RELATION_MASTER_BAR(
    MASTER_BAR_ID BIGINT NOT NULL,
    MASTER_BAR_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (MASTER_BAR_ID)
);

CREATE TABLE WHITE_VARIANT_RELATION_MASTER_QUX(
    MASTER_QUX_ID BIGINT NOT NULL,
    MASTER_QUX_NAME VARCHAR(200) NOT NULL,
    QUX_TYPE_CODE CHAR(3) NOT NULL,
    PRIMARY KEY (MASTER_QUX_ID)
);

CREATE TABLE WHITE_VARIANT_RELATION_MASTER_CORGE(
    MASTER_CORGE_ID BIGINT NOT NULL,
    MASTER_CORGE_NAME VARCHAR(200) NOT NULL,
    CORGE_TYPE_CODE CHAR(3) NOT NULL,
    PRIMARY KEY (MASTER_CORGE_ID)
);

CREATE TABLE WHITE_VARIANT_RELATION_REFERRER(
    REFERRER_ID BIGINT NOT NULL,
    VARIANT_MASTER_ID BIGINT NOT NULL,
    MASTER_TYPE_CODE CHAR(3) NOT NULL,
    PRIMARY KEY (REFERRER_ID)
);

-- /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of all-in-one table classification (biz-many-to-one)
-- = = = = = = = = = =/
CREATE TABLE WHITE_ALL_IN_ONE_CLS_CATEGORY (
	CLS_CATEGORY_CODE CHAR(3) NOT NULL,
	CLS_CATEGORY_NAME VARCHAR(20) NOT NULL,
	DESCRIPTION VARCHAR(50) NOT NULL,
	PRIMARY KEY (CLS_CATEGORY_CODE)
) ;

CREATE TABLE WHITE_ALL_IN_ONE_CLS_ELEMENT (
	CLS_CATEGORY_CODE CHAR(3) NOT NULL,
	CLS_ELEMENT_CODE CHAR(3) NOT NULL,
	CLS_ELEMENT_NAME VARCHAR(20) NOT NULL,
	ATTRIBUTE_EXP TEXT NOT NULL,
	PRIMARY KEY (CLS_CATEGORY_CODE, CLS_ELEMENT_CODE)
) ;

ALTER TABLE WHITE_ALL_IN_ONE_CLS_ELEMENT ADD CONSTRAINT FK_WHITE_ALL_IN_ONE_CLS_ELEMENT_CATEGORY
	FOREIGN KEY (CLS_CATEGORY_CODE)
	REFERENCES WHITE_ALL_IN_ONE_CLS_CATEGORY (CLS_CATEGORY_CODE) ;

-- also for the test of no implicit reverse FK
CREATE TABLE WHITE_ALL_IN_ONE_CLS_COMPOUND_PK_REF (
	FOO_CODE CHAR(3) NOT NULL,
	BAR_CODE CHAR(3) NOT NULL,
	QUX_CODE CHAR(3) NOT NULL,
	PRIMARY KEY (FOO_CODE, BAR_CODE, QUX_CODE)
) ;

CREATE TABLE WHITE_ALL_IN_ONE_CLS_NORMAL_COL_REF (
	CLS_REF_ID INTEGER NOT NULL,
	FOO_CODE CHAR(3) NOT NULL,
	BAR_CODE CHAR(3) NOT NULL,
	QUX_CODE CHAR(3) NOT NULL,
	PRIMARY KEY (FOO_CODE, BAR_CODE, QUX_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of columnExcept on databaseInfoMap.dfprop
-- = = = = = = = = = =/
CREATE TABLE WHITE_COLUMN_EXCEPT (
	EXCEPT_COLUMN_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	COLUMN_EXCEPT_TEST INTEGER -- actually NOT except
) ;

CREATE TABLE WHITE_COLUMN_EXCEPT_GEN_ONLY (
	GEN_ONLY_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	GEN_ONLY_NAME VARCHAR(200) NOT NULL,
	THIS_IS_GEN_ONLY VARCHAR(200)
) ;

-- /= = = = = = = = = = = = = = = = = = =
-- for the test of MyselfInScopeSubQuery
-- = = = = = = = = = =/
CREATE TABLE WHITE_MYSELF (
	MYSELF_ID integer NOT NULL PRIMARY KEY,
	MYSELF_NAME varchar(80) NOT NULL
) ;

CREATE TABLE WHITE_MYSELF_CHECK ( 
	MYSELF_CHECK_ID integer NOT NULL PRIMARY KEY,
	MYSELF_CHECK_NAME varchar(80) NOT NULL,
	MYSELF_ID integer
) ;

ALTER TABLE WHITE_MYSELF_CHECK ADD CONSTRAINT FK_WHITE_MYSELF_CHECK_SELF
	FOREIGN KEY (MYSELF_ID) REFERENCES WHITE_MYSELF (MYSELF_ID) ;

-- /= = = = = = = = = = = = = = = = = = 
-- for the test of self reference
-- = = = = = = = = = =/
CREATE TABLE WHITE_SELF_REFERENCE (
	SELF_REFERENCE_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	SELF_REFERENCE_NAME VARCHAR(200) NOT NULL,
	PARENT_ID NUMERIC(16)
) ;

ALTER TABLE WHITE_SELF_REFERENCE ADD CONSTRAINT FK_WHITE_SELF_REFERENCE_PARENT
	FOREIGN KEY (PARENT_ID) REFERENCES WHITE_SELF_REFERENCE (SELF_REFERENCE_ID) ;

CREATE TABLE WHITE_SELF_REFERENCE_REF_ONE (
	SELF_REFERENCE_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	SELF_REFERENCE_REF_ONE_NAME VARCHAR(200) NOT NULL
) ;

ALTER TABLE WHITE_SELF_REFERENCE_REF_ONE ADD CONSTRAINT FK_WHITE_SELF_REFERENCE_REF_ONE
	FOREIGN KEY (SELF_REFERENCE_ID) REFERENCES WHITE_SELF_REFERENCE (SELF_REFERENCE_ID) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of binary data type (e.g. image file)
-- = = = = = = = = = =/
CREATE TABLE WHITE_BINARY (
	BINARY_ID BIGINT AUTO_INCREMENT NOT NULL,
	BINARY_DATA BINARY,
	BLOB_DATA BLOB,
	PRIMARY KEY (BINARY_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of implicit conversion foreign key
-- = = = = = = = = = =/
CREATE TABLE WHITE_IMPLICIT_CONV_INTEGER (
	IMPLICIT_CONV_INTEGER_ID INTEGER NOT NULL,
	IMPLICIT_CONV_NUMERIC_ID INTEGER NOT NULL,
	IMPLICIT_CONV_STRING_ID INTEGER NOT NULL,
	IMPLICIT_CONV_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (IMPLICIT_CONV_INTEGER_ID)
) ;

CREATE TABLE WHITE_IMPLICIT_CONV_NUMERIC (
	IMPLICIT_CONV_NUMERIC_ID NUMERIC(20, 0) NOT NULL,
	IMPLICIT_CONV_INTEGER_ID NUMERIC(20, 0) NOT NULL,
	IMPLICIT_CONV_STRING_ID NUMERIC(20, 0) NOT NULL,
	IMPLICIT_CONV_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (IMPLICIT_CONV_NUMERIC_ID)
) ;

CREATE TABLE WHITE_IMPLICIT_CONV_STRING (
	IMPLICIT_CONV_STRING_ID VARCHAR(10) NOT NULL,
	IMPLICIT_CONV_INTEGER_ID VARCHAR(10) NOT NULL,
	IMPLICIT_CONV_NUMERIC_ID VARCHAR(10) NOT NULL,
	IMPLICIT_CONV_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (IMPLICIT_CONV_STRING_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of suppress join/subquery foreign key
-- = = = = = = = = = =/
CREATE TABLE WHITE_SUPPRESS_JOIN_SQ (
	SUPPRESS_JOIN_SQ_ID INTEGER NOT NULL,
	SUPPRESS_JOIN_SQ_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (SUPPRESS_JOIN_SQ_ID)
) ;

CREATE TABLE WHITE_SUPPRESS_JOIN_SQ_MANY (
	MANY_ID INTEGER NOT NULL,
	MANY_NAME VARCHAR(200) NOT NULL,
	SUPPRESS_JOIN_SQ_ID INTEGER NOT NULL,
	MANY_ONE_ID INTEGER NOT NULL,
	PRIMARY KEY (MANY_ID)
) ;

CREATE TABLE WHITE_SUPPRESS_JOIN_SQ_MANY_ONE (
	MANY_ONE_ID INTEGER NOT NULL,
	MANY_ONE_NAME VARCHAR(200) NOT NULL,
	MANY_ONE_ONE_ID INTEGER NOT NULL,
	PRIMARY KEY (MANY_ONE_ID)
) ;

CREATE TABLE WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE (
	MANY_ONE_ONE_ID INTEGER NOT NULL,
	MANY_ONE_ONE_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (MANY_ONE_ONE_ID)
) ;

CREATE TABLE WHITE_SUPPRESS_JOIN_SQ_ONE (
	ONE_ID INTEGER NOT NULL,
	ONE_NAME VARCHAR(200) NOT NULL,
	SUPPRESS_JOIN_SQ_ID INTEGER NOT NULL,
	ONE_ADDI_ID INTEGER NOT NULL,
	PRIMARY KEY (ONE_ID),
	UNIQUE (SUPPRESS_JOIN_SQ_ID)
) ;

CREATE TABLE WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI (
	ONE_ADDI_ID INTEGER NOT NULL,
	ONE_ADDI_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (ONE_ADDI_ID)
) ;

ALTER TABLE WHITE_SUPPRESS_JOIN_SQ_MANY ADD CONSTRAINT FK_WHITE_SUPPRESS_JOIN_SQ_MANY
	FOREIGN KEY (SUPPRESS_JOIN_SQ_ID) REFERENCES WHITE_SUPPRESS_JOIN_SQ (SUPPRESS_JOIN_SQ_ID) ;

ALTER TABLE WHITE_SUPPRESS_JOIN_SQ_MANY ADD CONSTRAINT FK_WHITE_SUPPRESS_JOIN_SQ_MANY_ONE
	FOREIGN KEY (MANY_ONE_ID) REFERENCES WHITE_SUPPRESS_JOIN_SQ_MANY_ONE (MANY_ONE_ID) ;

ALTER TABLE WHITE_SUPPRESS_JOIN_SQ_MANY_ONE ADD CONSTRAINT FK_WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE
	FOREIGN KEY (MANY_ONE_ONE_ID) REFERENCES WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE (MANY_ONE_ONE_ID) ;

ALTER TABLE WHITE_SUPPRESS_JOIN_SQ_ONE ADD CONSTRAINT FK_WHITE_SUPPRESS_JOIN_SQ_ONE
	FOREIGN KEY (SUPPRESS_JOIN_SQ_ID) REFERENCES WHITE_SUPPRESS_JOIN_SQ (SUPPRESS_JOIN_SQ_ID) ;

-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of table except generate-only
-- = = = = = = = = = =/
-- except completely (no getting meta data)
CREATE TABLE WHITE_TABLE_EXCEPT_NOMETA (
	NOMETA_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	NOMETA_NAME VARCHAR(200) NOT NULL
) ;

-- generated referred from generate-only table
CREATE TABLE WHITE_TABLE_EXCEPT_GEN_HEAD (
	GEN_HEAD_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	GEN_HEAD_NAME VARCHAR(200) NOT NULL,
	NOMETA_ID NUMERIC(16)
) ;

ALTER TABLE WHITE_TABLE_EXCEPT_GEN_HEAD ADD CONSTRAINT FK_WHITE_TABLE_EXCEPT_GEN_HEAD_NOMETA
	FOREIGN KEY (NOMETA_ID) REFERENCES WHITE_TABLE_EXCEPT_NOMETA (NOMETA_ID) ;

-- except generate-only referring generated table
CREATE TABLE WHITE_TABLE_EXCEPT_GEN_ONLY (
	GEN_ONLY_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	GEN_ONLY_NAME VARCHAR(200) NOT NULL,
	GEN_HEAD_ID NUMERIC(16),
	NOMETA_ID NUMERIC(16)
) ;

ALTER TABLE WHITE_TABLE_EXCEPT_GEN_ONLY ADD CONSTRAINT FK_WHITE_TABLE_EXCEPT_GEN_ONLY_HEAD
	FOREIGN KEY (GEN_HEAD_ID) REFERENCES WHITE_TABLE_EXCEPT_GEN_HEAD (GEN_HEAD_ID) ;

ALTER TABLE WHITE_TABLE_EXCEPT_GEN_ONLY ADD CONSTRAINT FK_WHITE_TABLE_EXCEPT_GEN_ONLY_NOMETA
	FOREIGN KEY (NOMETA_ID) REFERENCES WHITE_TABLE_EXCEPT_NOMETA (NOMETA_ID) ;

-- generated referring except gen-only
CREATE TABLE WHITE_TABLE_EXCEPT_GEN_REF (
	GEN_REF_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	GEN_REF_NAME VARCHAR(200) NOT NULL,
	GEN_ONLY_ID NUMERIC(16)
) ;

ALTER TABLE WHITE_TABLE_EXCEPT_GEN_REF ADD CONSTRAINT FK_WHITE_TABLE_EXCEPT_GEN_REF_ONLY
	FOREIGN KEY (GEN_ONLY_ID) REFERENCES WHITE_TABLE_EXCEPT_GEN_ONLY (GEN_ONLY_ID) ;

-- /= = = = = = = = = = = = = = = = = =
-- for the test of point type-mapping
-- = = = = = = = = = =/
CREATE TABLE WHITE_POINT_TYPE_MAPPING (
	POINT_TYPE_MAPPING_ID NUMERIC(16) NOT NULL,
	POINT_TYPE_MAPPING_MEMBER_NAME VARCHAR(32),
	POINT_TYPE_MAPPING_PRICE_COUNT INTEGER,
	POINT_TYPE_MAPPING_SALE_DATE BIGINT,
	POINT_TYPE_MAPPING_WANTED_DATETIME DATETIME,
	PRIMARY KEY (POINT_TYPE_MAPPING_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of include query of condition-bean 
-- = = = = = = = = = =/
CREATE TABLE WHITE_INCLUDE_QUERY (
	INCLUDE_QUERY_ID BIGINT AUTO_INCREMENT NOT NULL,
	INCLUDE_QUERY_INTEGER INTEGER,
	INCLUDE_QUERY_VARCHAR VARCHAR(100),
	INCLUDE_QUERY_DATE DATE,
	INCLUDE_QUERY_DATETIME DATETIME,
	PRIMARY KEY (INCLUDE_QUERY_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema delimiter data loading
-- = = = = = = = = = =/
CREATE TABLE WHITE_DELIMITER (
	DELIMITER_ID BIGINT AUTO_INCREMENT NOT NULL,
	NUMBER_NULLABLE INTEGER,
	STRING_CONVERTED VARCHAR(200),
	STRING_NON_CONVERTED VARCHAR(200),
	DATE_DEFAULT DATE NOT NULL,
	PRIMARY KEY (DELIMITER_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema excel data loading
-- = = = = = = = = = =/
CREATE TABLE WHITE_XLS_MAN (
	XLS_MAN_ID BIGINT AUTO_INCREMENT NOT NULL,
	STRING_CONVERTED VARCHAR(200),
	TIMESTAMP_CONVERTED DATETIME,
	PRIMARY KEY (XLS_MAN_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema logging for LoadData
-- = = = = = = = = = =/
CREATE TABLE WHITE_LOAD_DATA (
	LOAD_DATA_ID BIGINT NOT NULL,
	LOAD_DATA_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (LOAD_DATA_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema logging for LoadData
-- = = = = = = = = = =/
CREATE TABLE WHITE_SUPPRESS_DEF_CHECK (
	DEF_CHECK_ID BIGINT NOT NULL,
	DEF_CHECK_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (DEF_CHECK_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of date adjustment for LoadData
-- = = = = = = = = = =/
CREATE TABLE WHITE_DATE_ADJUSTMENT (
	DATE_ADJUSTMENT_ID BIGINT NOT NULL,
	ADJUSTED_DATE DATE COMMENT 'adjusted',
	ADJUSTED_DATETIME DATETIME,
	ADJUSTED_TIME TIME,
	ADJUSTED_INTEGER INTEGER,
	ADJUSTED_NAMED_STRING_LONG BIGINT COMMENT 'adjusted',
	ADJUSTED_NAMED_TYPED_LONG BIGINT COMMENT 'adjusted',
	ADJUSTED_PINPOINT_STRING_LONG BIGINT COMMENT 'adjusted',
	ADJUSTED_PINPOINT_TYPED_LONG BIGINT COMMENT 'adjusted',
	ADJUSTED_PLAIN_LONG BIGINT,
	ADJUSTED_STRING VARCHAR(32),
	PRIMARY KEY (DATE_ADJUSTMENT_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of escaped dfprop
-- = = = = = = = = = =/
CREATE TABLE WHITE_ESCAPED_DFPROP (
	ESCAPED_DFPROP_CODE CHAR(3) NOT NULL,
	ESCAPED_DFPROP_NAME VARCHAR(20),
	PRIMARY KEY (ESCAPED_DFPROP_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of escaped java-doc comment
-- = = = = = = = = = =/
CREATE TABLE WHITE_ESCAPED_JAVA_DOC (
	ESCAPED_JAVA_DOC_CODE CHAR(3) NOT NULL,
	ESCAPED_JAVA_DOC_NAME VARCHAR(20),
	PRIMARY KEY (ESCAPED_JAVA_DOC_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of line separator comment
-- = = = = = = = = = =/
CREATE TABLE WHITE_LINE_SEP_COMMENT (
	LINE_SEP_COMMENT_CODE CHAR(3) NOT NULL,
	LINE_SEP_COMMENT_NAME VARCHAR(20),
	PRIMARY KEY (LINE_SEP_COMMENT_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of deprecated classification element
-- = = = = = = = = = =/
CREATE TABLE WHITE_DEPRECATED_CLS_ELEMENT (
	DEPRECATED_CLS_ELEMENT_CODE CHAR(3) NOT NULL,
	DEPRECATED_CLS_ELEMENT_NAME VARCHAR(20),
	PRIMARY KEY (DEPRECATED_CLS_ELEMENT_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of DB comment
-- = = = = = = = = = =/
CREATE TABLE WHITE_DB_COMMENT (
	DB_COMMENT_CODE CHAR(3) NOT NULL COMMENT 'Normal: this is normal comment.',
	DB_COMMENT_NAME VARCHAR(20) COMMENT 'JavaDocHeadache: e.g. /*BEGIN*/, @ @foo <br />',
	PRIMARY KEY (DB_COMMENT_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = 
-- for the test of quoted table name
-- = = = = = = = = = =/
CREATE TABLE WHITE_QUOTED (
	"SELECT" INTEGER NOT NULL PRIMARY KEY,
	"FROM" VARCHAR(200)
) ;

CREATE TABLE WHITE_QUOTED_REF (
	"WHERE" INTEGER NOT NULL PRIMARY KEY,
	"ORDER" INTEGER
) ;

ALTER TABLE WHITE_QUOTED_REF ADD CONSTRAINT FK_WHITE_QUOTED_REF
	FOREIGN KEY ("ORDER") REFERENCES WHITE_QUOTED ("SELECT") ;

-- /= = = = = = = = = = = = = = = = = = = =
-- for the test of program reservation word
-- = = = = = = = = = =/
CREATE TABLE WHITE_PG_RESERV (
	CLASS integer NOT NULL PRIMARY KEY,
	"CASE" integer,
	PACKAGE integer,
	"DEFAULT" integer,
	NEW integer,
	NATIVE integer,
	VOID integer,
	PUBLIC integer,
	PROTECTED integer,
	PRIVATE integer,
	INTERFACE integer,
	ABSTRACT integer,
	FINAL integer,
	FINALLY integer,
	"RETURN" integer,
	"DOUBLE" integer,
	"FLOAT" integer,
	SHORT integer,
	TYPE char(3),
	RESERV_NAME varchar(32) NOT NULL
) ;

CREATE TABLE WHITE_PG_RESERV_REF (
	REF_ID integer NOT NULL PRIMARY KEY,
	CLASS integer
) ;

ALTER TABLE WHITE_PG_RESERV_REF ADD CONSTRAINT FK_WHITE_PG_RESERV_REF_CLASS
	FOREIGN KEY (CLASS) REFERENCES WHITE_PG_RESERV (CLASS) ;
