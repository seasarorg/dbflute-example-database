
-- =======================================================================================
--                                                                           Except/Target
--                                                                           =============

-- for the test of main schema except
CREATE TABLE WHITE_EXCEPT
(
	EXCEPT_ID NUMBER(16) NOT NULL PRIMARY KEY,
	EXCEPT_NAME VARCHAR2(256)
)  ;

-- for the test of main schema target
CREATE TABLE WHITE_TARGET
(
	TARGET_ID NUMBER(16) NOT NULL PRIMARY KEY,
	TARGET_NAME VARCHAR2(256)
)  ;

-- for the test of main schema except reference
CREATE TABLE WHITE_REF_EXCEPT
(
	REF_EXCEPT_ID NUMBER(16) NOT NULL PRIMARY KEY,
	EXCEPT_ID NUMBER(16) NOT NULL
)  ;
ALTER TABLE WHITE_REF_EXCEPT ADD CONSTRAINT FK_WHITE_REF_EXCEPT
	FOREIGN KEY (EXCEPT_ID) REFERENCES WHITE_EXCEPT (EXCEPT_ID) ;

-- for the test of additional schema except reference
CREATE TABLE WHITE_REF_NEXT_EXCEPT
(
	REF_NEXT_EXCEPT_ID NUMBER(16) NOT NULL PRIMARY KEY,
	NEXT_EXCEPT_CODE CHAR(3) NOT NULL
)  ;
ALTER TABLE WHITE_REF_NEXT_EXCEPT ADD CONSTRAINT FK_WHITE_REF_NEXT_EXCEPT
	FOREIGN KEY (NEXT_EXCEPT_CODE) REFERENCES /*$nextSchema*/.NEXT_SCHEMA_SECRET_AUTH (SECRET_AUTH_CODE) ;

-- for the test of main schema target reference
CREATE TABLE WHITE_REF_TARGET
(
	REF_TARGET_ID NUMBER(16) NOT NULL PRIMARY KEY,
	TARGET_ID NUMBER(16) NOT NULL
)  ;
ALTER TABLE WHITE_REF_TARGET ADD CONSTRAINT FK_WHITE_REF_TARGET
	FOREIGN KEY (TARGET_ID) REFERENCES WHITE_TARGET (TARGET_ID) ;

-- for the test of additional schema target reference
CREATE TABLE WHITE_REF_NEXT_TARGET
(
	REF_NEXT_TARGET_ID NUMBER(16) NOT NULL PRIMARY KEY,
	NEXT_TARGET_CODE CHAR(3) NOT NULL
)  ;
ALTER TABLE WHITE_REF_NEXT_TARGET ADD CONSTRAINT FK_WHITE_REF_NEXT_TARGET
	FOREIGN KEY (NEXT_TARGET_CODE) REFERENCES /*$nextSchema*/.NEXT_SCHEMA_PRODUCT_STATUS (PRODUCT_STATUS_CODE) ;

-- =======================================================================================
--                                                                               Same Name
--                                                                               =========
-- for the test of synonym for same-name table
CREATE TABLE WHITE_SAME_NAME
(
	SAME_NAME_ID NUMBER(16) NOT NULL PRIMARY KEY,
	SAME_NAME_NAME VARCHAR(50) NOT NULL
)  ;

CREATE TABLE WHITE_SAME_NAME_REF_REF
(
	REF_REF_ID NUMBER(16) NOT NULL PRIMARY KEY,
	REF_REF_NAME VARCHAR(100) NOT NULL,
	REF_REF_DATE DATE NOT NULL
)  ;

-- =======================================================================================
--                                                                            UniqueKey FK
--                                                                            ============
-- /= = = = = = = = = = = = = = = = = = 
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

-- =======================================================================================
--                                                                              Diff World
--                                                                              ==========
-- for the test of craft diff
CREATE TABLE WHITE_DIFF_WORLD(
	DIFF_WORLD_ID NUMBER(16) NOT NULL PRIMARY KEY,
	DIFF_WORLD_NAME VARCHAR(50) NOT NULL
)  ;
