
-- =======================================================================================
--                                                                                 DB Link
--                                                                                 =======
create database link NEXT_LINK connect to /*$nextUser*/ identified by /*$nextPassword*/ using '/*$nextService*/';
create database link SELF_LINK using '/*$nextService*/';

