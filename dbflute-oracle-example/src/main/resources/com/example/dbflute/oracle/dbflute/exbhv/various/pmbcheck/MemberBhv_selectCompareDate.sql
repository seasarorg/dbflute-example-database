
-- !CompareDatePmb!
-- !!Long memberId!!
-- !!Date birthdateFrom!!
-- !!Timestamp formalizedDatetimeFrom!!

select *
  from MEMBER member
 /*BEGIN*/where
   /*IF pmb.memberId != null*/member.MEMBER_ID = /*pmb.memberId*/3/*END*/
   /*IF pmb.birthdateFrom != null*/and member.BIRTHDATE >= /*pmb.birthdateFrom*/'1965-04-12 00:00:00'/*END*/
   /*IF pmb.formalizedDatetimeFrom != null*/and member.FORMALIZED_DATETIME >= /*pmb.formalizedDatetimeFrom*/'1965-04-12 12:34:56'/*END*/
 /*END*/