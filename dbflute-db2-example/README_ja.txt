
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for DB2 and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[DB2]
create database dfexdb using codeset UTF-8 territory JP

[DBFlute]
TODO jflute


# ========================================================================================
#                                                                                     Memo
#                                                                                     ====
SQLState Dictionary
http://publib.boulder.ibm.com/infocenter/db2luw/v8/index.jsp?topic=/com.ibm.db2.udb.doc/core/rsql0400.htm


# ========================================================================================
#                                                                            Demo Resource
#                                                                            =============
alter table MEMBER_ADDRESS alter ADDRESS set data type VARCHAR(400);  

drop procedure SP_IN_OUT_RETURN;
-- #df:begin#
create procedure SP_IN_OUT_RETURN(
  in v_in_varchar varchar(200)
  , out v_out_varchar varchar(200)
  , inout v_inout_varchar varchar(200)
) language sql
begin
  set v_out_varchar = 'clubdb2';
  set v_inout_varchar = 'quux';
  return 1;
end
-- #df:end#

