
-- =======================================================================================
--                                                                              After Case
--                                                                              ==========

PURGE RECYCLEBIN;


-- =======================================================================================
--                                                                       Materialized View
--                                                                       =================
CREATE MATERIALIZED VIEW SUMMARY_MEMBER_PURCHASE
refresh complete
on commit
AS
select purchase.MEMBER_ID
     , sum(purchase.PURCHASE_PRICE) as ALLSUM_PURCHASE_PRICE
     , max(purchase.PURCHASE_DATETIME) as LATEST_PURCHASE_DATETIME
  from PURCHASE purchase
 group by purchase.MEMBER_ID
;
comment on materialized view SUMMARY_MEMBER_PURCHASE is '会員購入さまりまてびゅー: まてびゅーのコメントはALL_MVIEW_COMMENTSだって';


-- =======================================================================================
--                                                                        Assert Test Data
--                                                                        ================
-- #df:assertCountZero#
select count(*)
  from MEMBER
 where MEMBER_STATUS_CODE = 'FML'
   and FORMALIZED_DATETIME is null
;

-- #df:assertListZero#
select member.MEMBER_ID, member.MEMBER_NAME
  from MEMBER member
 where member.MEMBER_STATUS_CODE = 'WDL'
   and not exists (select withdrawal.MEMBER_ID
                     from MEMBER_WITHDRAWAL withdrawal
                    where withdrawal.MEMBER_ID = member.MEMBER_ID
       )
;

-- =======================================================================================
--                                                                    Index for Large Data
--                                                                    ====================
-- creating index after loading large data 
ALTER TABLE VENDOR_LARGE_DATA_REF ADD CONSTRAINT FK_VENDOR_LARGE_DATA_REF_DATA 
	FOREIGN KEY (LARGE_DATA_ID) REFERENCES VENDOR_LARGE_DATA (LARGE_DATA_ID) ;

ALTER TABLE VENDOR_LARGE_DATA_REF ADD CONSTRAINT FK_VENDOR_LARGE_DATA_REF_SELF 
	FOREIGN KEY (SELF_PARENT_ID) REFERENCES VENDOR_LARGE_DATA_REF (LARGE_DATA_REF_ID) ;

CREATE INDEX IX_LARGE_DATA_STRING ON VENDOR_LARGE_DATA(STRING_INDEX) ;
CREATE INDEX IX_LARGE_DATA_NUMERIC_INTEGER ON VENDOR_LARGE_DATA(NUMERIC_INTEGER_INDEX) ;

CREATE INDEX IX_LARGE_DATA_REF_LARGE ON VENDOR_LARGE_DATA_REF(LARGE_DATA_ID) ;
CREATE INDEX IX_LARGE_DATA_REF_DATE ON VENDOR_LARGE_DATA_REF(DATE_INDEX) ;
CREATE INDEX IX_LARGE_DATA_REF_TIMESTAMP ON VENDOR_LARGE_DATA_REF(TIMESTAMP_INDEX) ;
CREATE INDEX IX_LARGE_DATA_REF_NULLABLE_DEC ON VENDOR_LARGE_DATA_REF(NULLABLE_DECIMAL_INDEX) ;

analyze table VENDOR_LARGE_DATA COMPUTE STATISTICS;
analyze table VENDOR_LARGE_DATA_REF COMPUTE STATISTICS;
