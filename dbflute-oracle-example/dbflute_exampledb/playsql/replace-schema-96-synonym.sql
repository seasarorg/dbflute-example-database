
-- =======================================================================================
--                                                                             Basic Table
--                                                                             ===========
-- Two synonyms for the problem 'Duplicate Column of Synonym' at 2009/02/21
-- It's a strange behavior of Oracle JDBC driver.
-- DatabaseMetaData.getColumns() returns Table's with Synonym's.
CREATE SYNONYM VENDOR_SYNONYM_MEMBER FOR MEMBER;
CREATE SYNONYM MEMBER_VENDOR_SYNONYM FOR MEMBER;

CREATE SYNONYM SYNONYM_MEMBER FOR MEMBER;
CREATE SYNONYM SYNONYM_MEMBER_LOGIN FOR MEMBER_LOGIN;
CREATE SYNONYM SYNONYM_MEMBER_WITHDRAWAL FOR MEMBER_WITHDRAWAL;
CREATE SYNONYM SYNONYM_PRODUCT FOR PRODUCT;
CREATE SYNONYM SYNONYM_PRODUCT_STATUS FOR PRODUCT_STATUS;
CREATE SYNONYM SYNONYM_EXCEPT FOR WHITE_EXCEPT;
CREATE SYNONYM SYNONYM_REF_EXCEPT FOR WHITE_REF_EXCEPT;
CREATE SYNONYM SYNONYM_TARGET FOR WHITE_TARGET;
CREATE SYNONYM SYNONYM_REF_TARGET FOR WHITE_REF_TARGET;

-- for the test of synonym referring to the same-name table as one on this schema
-- LoadDataReverse is unsupported in this pattern so comment it out
-- CREATE SYNONYM SYNONYM_NEXT_SAME_NAME_DIFF FOR /*$nextSchema*/.WHITE_SAME_NAME_REF_REF;

-- for the test of synonym referring to the table that has FK to same-name table
CREATE SYNONYM SYNONYM_NEXT_SAME_NAME_FK FOR /*$nextSchema*/.WHITE_SAME_NAME_REF;

-- =======================================================================================
--                                                                            DBLink Table
--                                                                            ============
CREATE SYNONYM SYNONYM_NEXT_LINK_TABLE FOR NEXT_SCHEMA_PRODUCT@NEXT_LINK;
CREATE SYNONYM SYNONYM_NEXT_LINK_SYNONYM FOR NEXT_SYNONYM_PRODUCT@NEXT_LINK;
CREATE SYNONYM SYNONYM_NEXT_LINK_SECRET for NEXT_SCHEMA_SECRET@NEXT_LINK;

-- =======================================================================================
--                                                                         Basic Procedure
--                                                                         ===============
-- main schema
CREATE SYNONYM SYNONYM_PROCEDURE_IN_OUT FOR SP_IN_OUT_PARAMETER;

-- next schema
CREATE SYNONYM SYNONYM_NEXT_SECRET_AUTH for NEXTEXAMPLEDB.NEXT_SCHEMA_SECRET_AUTH;
CREATE SYNONYM SYNONYM_NEXT_SEQUENCE FOR NEXTEXAMPLEDB.SEQ_NEXT_SCHEMA_PRODUCT;
CREATE SYNONYM SYNONYM_NEXT_PROCEDURE FOR NEXTEXAMPLEDB.SP_NEXT_NO_PARAMETER;
CREATE SYNONYM SYNONYM_NEXT_FUNCTION FOR NEXTEXAMPLEDB.FN_NEXT_NO_PARAMETER;

-- =======================================================================================
--                                                                       Package Procedure
--                                                                       =================
-- Synonym for Package Procedure has several problems.
--  o Synonym meta data does not have its schema info
--  o Oracle cannot execute Synonym for Package Procedure *fundamental problem 
CREATE SYNONYM SYNONYM_MAIN_PKG_PROCEDURE_NOP FOR MAIN_PKG.SP_PKG_NO_PARAMETER;
CREATE SYNONYM SYNONYM_MAIN_PKG_PROCEDURE_PRM FOR MAIN_PKG.SP_PKG_IN_OUT_PARAMETER;
CREATE SYNONYM SYNONYM_NEXT_PKG_PROCEDURE_NOP FOR NEXT_PKG.SP_PKG_NO_PARAMETER;
CREATE SYNONYM SYNONYM_NEXT_PKG_PROCEDURE_PRM FOR NEXT_PKG.SP_PKG_IN_OUT_PARAMETER;

-- =======================================================================================
--                                                                        DBLink Procedure
--                                                                        ================
-- can generate with several restriction (e.g. no Struct)
CREATE SYNONYM SYNONYM_NEXT_LINK_PROCEDURE for SP_NEXT_IN_OUT_PARAMETER@NEXT_LINK;
CREATE SYNONYM SYNONYM_NEXT_LINK_PROCSYN for NEXT_SYNONYM_IN_OUT_PARAMETER@NEXT_LINK;

-- this has same problems as Synonym for Package Procedure
CREATE SYNONYM SYNONYM_NEXT_LINK_PROCPKG_NOP for NEXT_PKG.SP_PKG_NO_PARAMETER@NEXT_LINK;
CREATE SYNONYM SYNONYM_NEXT_LINK_PROCPKG_PRM for NEXT_PKG.SP_PKG_IN_OUT_PARAMETER@NEXT_LINK;

-- =======================================================================================
--                                                                          Basic Function
--                                                                          ==============
CREATE SYNONYM FN_NEXT_SYNONYM_SAME_NAME FOR NEXTEXAMPLEDB.FN_NEXT_SYNONYM_SAME_NAME;
