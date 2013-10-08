-- #df:checkEnv(ut, diffworld, diffready)#

-- #df:changeUser(system)#
-- #df:checkUser(mainSchema, mainUser)#
create user /*$dfprop.mainUser*/ identified by /*$dfprop.mainPassword*/;

-- #df:reviveUser()#
-- #df:checkUser(grant)#
grant connect to /*$dfprop.mainUser*/;
grant resource to /*$dfprop.mainUser*/;
grant create view to /*$dfprop.mainUser*/;
grant create synonym to /*$dfprop.mainUser*/;
grant create database link to /*$dfprop.mainUser*/;
grant create public database link to /*$dfprop.mainUser*/;
grant create materialized view to /*$dfprop.mainUser*/;

-- #df:reviveUser()#
-- #df:checkUser(grant)#
grant SELECT on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT to /*$dfprop.mainUser*/;
grant INSERT on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT to /*$dfprop.mainUser*/;
grant UPDATE on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT to /*$dfprop.mainUser*/;
grant DELETE on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT to /*$dfprop.mainUser*/;

grant SELECT on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT_STATUS to /*$dfprop.mainUser*/;
grant INSERT on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT_STATUS to /*$dfprop.mainUser*/;
grant UPDATE on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT_STATUS to /*$dfprop.mainUser*/;
grant DELETE on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT_STATUS to /*$dfprop.mainUser*/;
grant REFERENCES on /*$nextSchema*/.NEXT_SCHEMA_PRODUCT_STATUS to /*$dfprop.mainUser*/;

grant SELECT on /*$nextSchema*/.NEXT_SCHEMA_SECRET_AUTH to /*$dfprop.mainUser*/;
grant REFERENCES on /*$nextSchema*/.NEXT_SCHEMA_SECRET_AUTH to /*$dfprop.mainUser*/;

grant SELECT on /*$nextSchema*/.NEXT_SYNONYM_PRODUCT to /*$dfprop.mainUser*/;
grant SELECT on /*$nextSchema*/.NEXT_SYNONYM_SECRET_AUTH to /*$dfprop.mainUser*/;
grant SELECT on /*$nextSchema*/.SEQ_NEXT_SCHEMA_PRODUCT to /*$dfprop.mainUser*/;

grant EXECUTE on /*$nextSchema*/.SP_NEXT_NO_PARAMETER to /*$dfprop.mainUser*/;
grant EXECUTE on /*$nextSchema*/.FN_NEXT_NO_PARAMETER to /*$dfprop.mainUser*/;
grant EXECUTE on /*$nextSchema*/.FN_NEXT_SYNONYM_SAME_NAME to /*$dfprop.mainUser*/;
grant EXECUTE on /*$nextSchema*/.NEXT_PKG to /*$dfprop.mainUser*/;
grant EXECUTE on /*$nextSchema*/.NEXT_SYNONYM_NO_PARAMETER to /*$dfprop.mainUser*/;
grant EXECUTE on /*$nextSchema*/.NEXT_SYNONYM_IN_OUT_PARAMETER to /*$dfprop.mainUser*/;
grant EXECUTE on /*$nextSchema*/.SP_NEXT_STRUCT_PARAMETER to /*$dfprop.mainUser*/;
grant EXECUTE on /*$nextSchema*/.NEXT_FOO_BEAN to /*$dfprop.mainUser*/;

-- REF only here because of the synonym reference
grant SELECT on /*$nextSchema*/.WHITE_SAME_NAME to /*$dfprop.mainUser*/;
grant REFERENCES on /*$nextSchema*/.WHITE_SAME_NAME to /*$dfprop.mainUser*/;
grant SELECT on /*$nextSchema*/.WHITE_SAME_NAME_REF to /*$dfprop.mainUser*/;
grant REFERENCES on /*$nextSchema*/.WHITE_SAME_NAME_REF to /*$dfprop.mainUser*/;
grant SELECT on /*$nextSchema*/.WHITE_SAME_NAME_REF_REF to /*$dfprop.mainUser*/;
grant REFERENCES on /*$nextSchema*/.WHITE_SAME_NAME_REF_REF to /*$dfprop.mainUser*/;
