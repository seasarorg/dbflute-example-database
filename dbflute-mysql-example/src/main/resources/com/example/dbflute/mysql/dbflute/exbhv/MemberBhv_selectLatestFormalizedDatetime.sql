/*
 [df:title]
 The example for selecting scalar value
 
 [df:description]
 You can use a scalar type as result type
 if the select clause has only one column. 
*/
-- #df:entity#
-- +scalar+

-- !df:pmb!

select max(mb.FORMALIZED_DATETIME) as MAX_VALUE from MEMBER mb