
-- For the test about a sequence not related to a table.
-- This sequence must be dropped when executing replace-schema task.
CREATE SEQUENCE SEQ_NOT_RELATED_TO_TABLE START WITH 1 INCREMENT BY 1;

-- for the test of sequence cache on this DBMS
-- (A line comment after semicolon is NG at DB2)
CREATE SEQUENCE SEQ_MEMBER_LOGIN START WITH 1 INCREMENT BY 4;
CREATE SEQUENCE SEQ_PURCHASE START WITH 1 INCREMENT BY 1;
