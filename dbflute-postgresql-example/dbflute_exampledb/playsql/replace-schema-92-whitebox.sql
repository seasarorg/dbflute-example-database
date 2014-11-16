
-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of Non PrimaryKey Insert
-- = = = = = = = = = =/
CREATE TABLE WHITE_NOT_PK (
    NOT_PK_ID bigint NOT NULL,
    NOT_PK_NAME varchar,
    NOT_PK_INTEGER integer
);

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema excel data loading
-- = = = = = = = = = =/
CREATE TABLE WHITE_XLS_MAN (
    XLS_MAN_ID bigint NOT NULL PRIMARY KEY,
    STRING_CONVERTED varchar,
    TIMESTAMP_ZERO_DEFAULT_MILLIS timestamp(3),
    TIMESTAMP_ZERO_PREFIX_MILLIS timestamp(3),
    TIMESTAMP_ZERO_SUFFIX_MILLIS timestamp(3)
);

-- /= = = = = = = = = = = = = = = = = = = =
-- for the test of compound primary key
-- = = = = = = = = = =/
CREATE TABLE WHITE_COMPOUND_PK (
    PK_FIRST_ID INTEGER NOT NULL,
    PK_SECOND_ID INTEGER NOT NULL,
    PK_NAME VARCHAR(200) NOT NULL,
    primary key (PK_FIRST_ID, PK_SECOND_ID)
);

CREATE TABLE WHITE_COMPOUND_PK_REF (
    MULTIPLE_FIRST_ID INTEGER NOT NULL,
    MULTIPLE_SECOND_ID INTEGER NOT NULL,
    REF_FIRST_ID INTEGER NOT NULL,
    REF_SECOND_ID INTEGER NOT NULL,
    primary key (MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID)
);

ALTER TABLE WHITE_COMPOUND_PK_REF ADD CONSTRAINT FK_WHITE_COMPOUND_PK_REF
    FOREIGN KEY (REF_FIRST_ID, REF_SECOND_ID)
    REFERENCES WHITE_COMPOUND_PK (PK_FIRST_ID, PK_SECOND_ID);

CREATE TABLE WHITE_COMPOUND_PK_WRONG_ORDER (
    FIRST_ID INTEGER NOT NULL,
    SECOND_ID INTEGER NOT NULL,
    THIRD_ID INTEGER NOT NULL,
    WRONG_NAME VARCHAR(200),
    primary key (FIRST_ID, THIRD_ID, SECOND_ID)
);

-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of same name as next schema's
-- = = = = = = = = = =/
CREATE TABLE WHITE_SAME_NAME (
    SAME_NAME_ID bigint NOT NULL PRIMARY KEY,
    SAME_NAME_NAME varchar(200),
    SAME_NAME_INTEGER integer,
    NEXT_SCHEMA_PRODUCT_ID integer
);

CREATE TABLE WHITE_SAME_NAME_REF (
    SAME_NAME_REF_ID INTEGER NOT NULL PRIMARY KEY,
    SAME_NAME_ID bigint NOT NULL,
    NEXT_SAME_NAME_ID bigint NOT NULL
);

ALTER TABLE WHITE_SAME_NAME_REF ADD CONSTRAINT FK_WHITE_SAME_NAME_REF
    FOREIGN KEY (SAME_NAME_ID)
    REFERENCES WHITE_SAME_NAME (SAME_NAME_ID);

-- FK to next-schema needs AdditionalDrop of ReplaceSchema but cannot do it.
-- It throws "An I/O error occured while sending to the backend." exception...Why?
-- ALTER TABLE WHITE_SAME_NAME ADD CONSTRAINT FK_WHITE_SAME_NAME_PRODUCT
--     FOREIGN KEY (NEXT_SCHEMA_PRODUCT_ID)
--     REFERENCES nextschema.NEXT_SCHEMA_PRODUCT (PRODUCT_ID);

-- *same-name and same-structure foreign key is unsupported
-- ALTER TABLE WHITE_SAME_NAME_REF ADD CONSTRAINT FK_WHITE_SAME_NAME_REF_NEXT
--     FOREIGN KEY (NEXT_SAME_NAME_ID)
--     REFERENCES nextschema.WHITE_SAME_NAME (SAME_NAME_ID);
