
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for PostgreSQL and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This example uses Maven2 so prepare your maven2 environment. (For example, Q4E)


[PostgreSQL]
1. Prepare PostgreSQL
Download and Install 

2. Create role and database and schema

  2-1. execute following DDLs

CREATE ROLE exampledb LOGIN ENCRYPTED PASSWORD 'md58b8407a3c943c9993bc71dd1f83e0566'
  NOINHERIT CREATEDB
   VALID UNTIL 'infinity';

CREATE DATABASE exampledb WITH ENCODING='UTF8' OWNER=exampledb;

  2-2. create Schema 'nextschema'

3. Execute ReplaceSchema task

  3-1. execute dbflute_exampledb/replace-schema.sh|bat

