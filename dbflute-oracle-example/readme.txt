
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for Buri and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This project needs maven2 so you should prepare 'M2Eclipse'.

[JDBC]
Put ojdbc5.jar to both 'lib' and 'dbflute_exampledb/extlib' and 'dbflute_nextexampledb/extlib'.

[Oracle]
/= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
This example requires two schemas 'exampledb' and 'nextexampledb'.
= = = = = = = = = =/
The exampledb and nextexampledb will be created by ReplaceSchema task. (contains creating user)
But if a password of your 'system' user is different from 'orcl',
Modify the password on additionalUserMap in replaceSchemaDefinitionMap.dfprop.

Are you ready? OK, execute the ReplaceSchema task!
At first execute the ReplaceSchema task for dbflute_nextexampledb
Then after, execute the ReplaceSchema task for dbflute_exampledb

-- * * * * * * * * * * *
-- If ORA-01536 occurred
-- * * * * * * * * * * *
-- [By system user]
alter user exampledb quota unlimited on users;
alter user nextexampledb quota unlimited on users;

[DBFlute Client]
The DBFlute client 'dbflute_nextexampledb' has ReplaceSchema and Doc tasks only.
The exampledb uses their tables by the function 'additionalSchema'.


# ========================================================================================
#                                                                                     Memo
#                                                                                     ====
-- Synonym for Package Procedure has several problems:
-- o Cannot specify a schema name for a package procedure. Why?
-- CREATE SYNONYM VD_SYNONYM_NEXT_PKG_PROCEDURE FOR NEXTEXAMPLE.NEXTPKG.SP_NEXT_PKG_NO_PARAMETER;
--   ==> ORA-00933
-- o Cannot execute the synonym. Why?
-- call VD_SYNONYM_NEXT_PKG_PROCEDURE();
--   ==> ORA-04045
