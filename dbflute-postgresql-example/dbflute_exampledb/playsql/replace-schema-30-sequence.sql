
-- for the test about a sequence not related to a table
-- this sequence must be dropped when executing replace-schema task
CREATE SEQUENCE SEQ_NOT_RELATED_TO_TABLE START 1 INCREMENT 1;

-- for the test of sequence cache on this DBMS
CREATE SEQUENCE SEQ_PURCHASE START 1 INCREMENT 6; -- increment way

-- for the test of sub-column sequence related to a normal column
CREATE SEQUENCE SEQ_SUB_DISPLAY_ORDER START 1 INCREMENT 1;
CREATE SEQUENCE SEQ_SUB_PURCHASE_COUNT START 1 INCREMENT 1;