package com.example.dbflute.postgresql.dbflute.vendor;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfResourceUtil;
import org.seasar.dbflute.util.DfTraceViewUtil;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.VendorLargeDataDbm;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.VendorLargeDataRefDbm;
import com.example.dbflute.postgresql.dbflute.cbean.VendorLargeDataCB;
import com.example.dbflute.postgresql.dbflute.cbean.VendorLargeDataRefCB;
import com.example.dbflute.postgresql.dbflute.exbhv.VendorLargeDataBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.VendorLargeDataRefBhv;
import com.example.dbflute.postgresql.dbflute.exentity.VendorLargeData;
import com.example.dbflute.postgresql.dbflute.exentity.VendorLargeDataRef;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * The test of vendor's large data handling.
 * <p>
 * These test cases should work if the data does not exist
 * because large data files for ReplaceSchema is treated as SVN-ignore.
 * </p>
 * @author jflute
 * @since 0.9.7.6 (2010/11/12 Friday)
 */
public class VendorLargeDataTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorLargeDataBhv vendorLargeDataBhv;
    private VendorLargeDataRefBhv vendorLargeDataRefBhv;

    // ===================================================================================
    //                                                              Test Data Confirmation
    //                                                              ======================
    public void test_confirmation() throws Exception {
        int mainCount = vendorLargeDataBhv.selectCount(new VendorLargeDataCB());
        int refCount = vendorLargeDataRefBhv.selectCount(new VendorLargeDataRefCB());
        log("VendorLargeData    : " + mainCount);
        log("VendorLargeDataRef : " + refCount);
    }

    // ===================================================================================
    //                                                                        Large Paging
    //                                                                        ============
    public void test_paging_largePageNumber() throws Exception {
        // ## Arrange ##
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        int countAll = vendorLargeDataRefBhv.selectCount(cb);
        cb.paging(20, 30000);

        // ## Act ##
        PagingResultBean<VendorLargeDataRef> page = vendorLargeDataRefBhv.selectPage(cb);

        // ## Assert ##
        if (!page.isEmpty()) { // because large data is not required
            assertHasAnyElement(page);
            assertEquals(20, page.size());
            assertEquals(countAll, page.getAllRecordCount());
        }
    }

    // ===================================================================================
    //                                                     QueryRelation or with InnerJoin
    //                                                     ===============================
    public void test_QueryRelation_or_with_InnerJoin_basic() throws Exception {
        // ## Arrange ##
        final Date fromDate = DfTypeUtil.toDate("2010/11/17");
        final Date toDate = new Date(fromDate.getTime());
        DfTypeUtil.addDateDay(toDate, 7);

        // ## Act ##
        compareByRef(new Callback<VendorLargeDataRefCB>() {

            public void exec(VendorLargeDataRefCB cb) {
                vendorLargeDataRefBhv.selectCount(cb);
            }

            public VendorLargeDataRefCB first() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().queryVendorLargeDataRefSelf().setDateIndex_DateFromTo(fromDate, toDate);
                return cb;
            }

            public VendorLargeDataRefCB second() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().queryVendorLargeDataRefSelf().setDateIndex_DateFromTo(fromDate, toDate);
                cb.query().queryVendorLargeDataRefSelf().innerJoin();
                return cb;
            }
        }, "QueryRelation", "with InnerJoin");
    }

    // ===================================================================================
    //                                                              OnClause or InlineView
    //                                                              ======================
    public void test_OnClause_or_InlineView_basic() throws Exception {
        // ## Arrange ##
        final Date fromDate = DfTypeUtil.toDate("2010/11/17");
        final Date toDate = new Date(fromDate.getTime());
        DfTypeUtil.addDateDay(toDate, 7);

        // ## Act ##
        compareByRef(new Callback<VendorLargeDataRefCB>() {

            public void exec(VendorLargeDataRefCB cb) {
                vendorLargeDataRefBhv.selectList(cb);
            }

            public VendorLargeDataRefCB first() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.setupSelect_VendorLargeDataRefSelf();
                cb.query().queryVendorLargeDataRefSelf().on().setDateNoIndex_DateFromTo(fromDate, toDate);
                cb.query().setTimestampIndex_DateFromTo(fromDate, toDate);
                return cb;
            }

            public VendorLargeDataRefCB second() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.setupSelect_VendorLargeDataRefSelf();
                cb.query().queryVendorLargeDataRefSelf().inline().setDateNoIndex_DateFromTo(fromDate, toDate);
                cb.query().setTimestampIndex_DateFromTo(fromDate, toDate);
                return cb;
            }
        }, "OnClause", "InlineView");
    }

    // ===================================================================================
    //                                                          OrScopeQuery or UnionQuery
    //                                                          ==========================
    public void test_OrScopeQuery_or_UnionQuery_basic() throws Exception {
        // ## Arrange ##
        final Date fromDate = DfTypeUtil.toDate("2010/11/17");
        final Date toDate = new Date(fromDate.getTime());
        DfTypeUtil.addDateDay(toDate, 7);

        // ## Act ##
        compareByRef(new Callback<VendorLargeDataRefCB>() {

            public void exec(VendorLargeDataRefCB cb) {
                vendorLargeDataRefBhv.selectCount(cb);
            }

            public VendorLargeDataRefCB first() {
                // select dflocal.LARGE_DATA_REF_ID as c1, dflocal.LARGE_DATA_ID as c2, ... 
                //   from VENDOR_LARGE_DATA_REF dflocal 
                //  where ((dflocal.DATE_INDEX >= date '2010-11-05' and dflocal.DATE_INDEX < date '2010-11-09')
                //      or dflocal.LARGE_DATA_ID = 3
                //     ) 
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.orScopeQuery(new OrQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB orCB) {
                        orCB.orScopeQueryAndPart(new AndQuery<VendorLargeDataRefCB>() {
                            public void query(VendorLargeDataRefCB andPartCB) {
                                andPartCB.query().setDateIndex_DateFromTo(fromDate, toDate);
                            }
                        });
                        orCB.query().setLargeDataId_Equal(3L);
                    }
                });
                return cb;
            }

            public VendorLargeDataRefCB second() {
                // select dflocal.LARGE_DATA_REF_ID as c1, dflocal.LARGE_DATA_ID as c2, ... 
                //   from VENDOR_LARGE_DATA_REF dflocal 
                //  where dflocal.DATE_INDEX >= date '2010-11-05'
                //    and dflocal.DATE_INDEX < date '2010-11-09'
                //  union 
                // select dflocal.LARGE_DATA_REF_ID as c1, dflocal.LARGE_DATA_ID as c2, ... 
                //   from VENDOR_LARGE_DATA_REF dflocal 
                //  where dflocal.LARGE_DATA_ID = 3 
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().setDateIndex_DateFromTo(fromDate, toDate);
                cb.union(new UnionQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB unionCB) {
                        unionCB.query().setLargeDataId_Equal(3L);
                    }
                });
                return cb;
            }
        }, "OrScopeQuery", "UnionQuery");
    }

    // ===================================================================================
    //                                                   ExistsReferrer or InScopeRelation
    //                                                   =================================
    public void test_ExistsReferrer_or_InScopeRelation_noCondition() throws Exception {
        // ## Arrange ##
        final List<Long> largeDataIdList = DfCollectionUtil.newArrayList();
        for (int i = 0; i < 20; i++) {
            largeDataIdList.add(Long.valueOf(i + 1));
        }

        // ## Act ##
        compareByMain(new Callback<VendorLargeDataCB>() {

            public void exec(VendorLargeDataCB cb) {
                vendorLargeDataBhv.selectCount(cb);
            }

            public VendorLargeDataCB first() {
                VendorLargeDataCB cb = new VendorLargeDataCB();
                cb.query().setLargeDataId_InScope(largeDataIdList);
                cb.query().existsVendorLargeDataRefList(new SubQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB subCB) {
                    }
                });
                return cb;
            }

            public VendorLargeDataCB second() {
                VendorLargeDataCB cb = new VendorLargeDataCB();
                cb.query().setLargeDataId_InScope(largeDataIdList);
                cb.query().inScopeVendorLargeDataRefList(new SubQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB subCB) {
                    }
                });
                return cb;
            }
        }, "ExistsReferrer", "InScopeRelation");
    }

    public void test_ExistsExistsReferrer_or_InScopeRelation_noIndexCondition() throws Exception {
        // ## Arrange ##
        final List<Long> largeDataIdList = DfCollectionUtil.newArrayList();
        for (int i = 0; i < 20; i++) {
            largeDataIdList.add(Long.valueOf(i + 1));
        }

        // ## Act ##
        compareByMain(new Callback<VendorLargeDataCB>() {

            public void exec(VendorLargeDataCB cb) {
                vendorLargeDataBhv.selectCount(cb);
            }

            public VendorLargeDataCB first() {
                VendorLargeDataCB cb = new VendorLargeDataCB();
                cb.query().setLargeDataId_InScope(largeDataIdList);
                cb.query().existsVendorLargeDataRefList(new SubQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB subCB) {
                        subCB.query().setDateNoIndex_GreaterEqual(currentDate());
                    }
                });
                return cb;
            }

            public VendorLargeDataCB second() {
                VendorLargeDataCB cb = new VendorLargeDataCB();
                cb.query().setLargeDataId_InScope(largeDataIdList);
                cb.query().inScopeVendorLargeDataRefList(new SubQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB subCB) {
                        subCB.query().setDateNoIndex_GreaterEqual(currentDate());
                    }
                });
                return cb;
            }
        }, "ExistsReferrer", "InScopeRelation");
    }

    // ===================================================================================
    //                                                                        Index or not
    //                                                                        ============
    public void test_Index_or_not_Date() throws Exception {
        // ## Arrange ##
        final Date fromDate = DfTypeUtil.toDate("2010-01-01");
        final Date toDate = DfTypeUtil.toDate("2010-02-01");

        // ## Act ##
        compareIndexByRef(new Callback<VendorLargeDataRefCB>() {

            public void exec(VendorLargeDataRefCB cb) {
                vendorLargeDataRefBhv.selectCount(cb);
            }

            public VendorLargeDataRefCB first() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().setDateIndex_DateFromTo(fromDate, toDate);
                return cb;
            }

            public VendorLargeDataRefCB second() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().setDateNoIndex_DateFromTo(fromDate, toDate);
                return cb;
            }
        });
    }

    // ===================================================================================
    //                                                                      Compare Helper
    //                                                                      ==============
    protected static interface Callback<CB extends ConditionBean> {
        void exec(CB cb);

        CB first();

        CB second();
    }

    protected void compareByMain(Callback<VendorLargeDataCB> callback, String first, String second) throws Exception {
        xcompare(callback, first, second);
    }

    protected void compareByRef(Callback<VendorLargeDataRefCB> callback, String first, String second) throws Exception {
        xcompare(callback, first, second);
    }

    protected void compareIndexByMain(Callback<VendorLargeDataCB> callback) throws Exception {
        xcompare(callback, "useIndex", "noIndex");
    }

    protected void compareIndexByRef(Callback<VendorLargeDataRefCB> callback) throws Exception {
        xcompare(callback, "useIndex", "noIndex");
    }

    protected <CB extends ConditionBean> void xcompare(Callback<CB> callback, String first, String second)
            throws Exception {
        // ## Arrange ##
        int totalTryCount = 20;

        // ## Act ##
        String firstResult;
        String secondResult;
        {
            CB firstCB = callback.first();
            CB secondCB = callback.second();

            // ignored (for initialization)
            callback.exec(firstCB);
            callback.exec(secondCB);

            long firstTotal = 0;
            long secondTotal = 0;
            for (int i = 0; i < totalTryCount; i++) {
                boolean firstTime = (i % 2 == 0);
                long before = currentDate().getTime();
                CB currentCB = firstTime ? firstCB : secondCB;
                callback.exec(currentCB);
                long after = currentDate().getTime();
                if (firstTime) {
                    firstTotal = firstTotal + (after - before);
                } else {
                    secondTotal = secondTotal + (after - before);
                }
            }
            firstResult = DfTraceViewUtil.convertToPerformanceView(firstTotal / (totalTryCount / 2));
            secondResult = DfTraceViewUtil.convertToPerformanceView(secondTotal / (totalTryCount / 2));
        }
        log(first + " = " + firstResult);
        log(second + " = " + secondResult);
    }

    // ===================================================================================
    //                                                                    Large Data Maker
    //                                                                    ================
    // You can make large data as TSV files for ReplaceSchema.
    // Switch the first method definition and execute it
    // and the data can be registered when ReplaceSchema.
    // (The TSV files are SVN-ignored)
    public void test_making_TSV() throws Exception {
    //protected void invalid_now() throws Exception {
        final int dataSize = 120003;
        final int refSize = 1000000;
        final String outputDir;
        {
            String canonicalPath = DfResourceUtil.getBuildDir(this.getClass()).getCanonicalPath();
            outputDir = canonicalPath + "/../../dbflute_exampledb/playsql/data/ut/tsv/UTF-8";
        }
        final List<VendorLargeData> dataList = new ArrayList<VendorLargeData>();
        for (int i = 0; i < dataSize; i++) {
            int currentId = (i + 1);
            VendorLargeData data = new VendorLargeData();
            data.setLargeDataId(Long.valueOf(currentId));
            data.setStringIndex("foo" + (currentId % 1000));
            data.setStringNoIndex(data.getStringIndex());
            data.setStringUniqueIndex("foo" + currentId);
            data.setIntflgIndex(currentId % 2);
            data.setNumericIntegerIndex(currentId);
            data.setNumericIntegerNoIndex(data.getNumericIntegerIndex());
            dataList.add(data);
        }
        writeLargeData(dataList, outputDir, dataSize);
        writeLargeDataRef(dataList, outputDir, dataSize, refSize);
    }

    protected void writeLargeData(List<VendorLargeData> dataList, String outputDir, int dataSize) throws Exception {
        final String path = outputDir + "/90-VENDOR_LARGE_DATA.tsv";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            final List<ColumnInfo> columnInfoList = VendorLargeDataDbm.getInstance().getColumnInfoList();
            int index = 0;
            for (ColumnInfo columnInfo : columnInfoList) {
                bw.write((index > 0 ? "\t" : "") + columnInfo.getColumnDbName());
                ++index;
            }
            log("...Writing LargeData(" + dataSize + ")");
            for (VendorLargeData data : dataList) {
                bw.write(ln() + buildRecord(VendorLargeDataDbm.getInstance().extractAllColumnMap(data)));
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    protected void writeLargeDataRef(List<VendorLargeData> dataList, String outputDir, int dataSize, int refSize)
            throws Exception {
        final Calendar baseDateCal = DfTypeUtil.toCalendar("1900/01/01");
        final Calendar baseTimestampCal = DfTypeUtil.toCalendar("1970/01/01 00:00:00");
        final String path = outputDir + "/92-VENDOR_LARGE_DATA_REF.tsv";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            final List<ColumnInfo> columnInfoList = VendorLargeDataRefDbm.getInstance().getColumnInfoList();
            int index = 0;
            for (ColumnInfo columnInfo : columnInfoList) {
                bw.write((index > 0 ? "\t" : "") + columnInfo.getColumnDbName());
                ++index;
            }
            log("...Writing LargeDataRef(" + refSize + ")");
            Long selfParentId = null;
            for (int i = 0; i < refSize; i++) {
                int currentId = (i + 1);
                VendorLargeDataRef ref = new VendorLargeDataRef();
                ref.setLargeDataRefId(Long.valueOf(currentId));
                ref.setLargeDataId(dataList.get(currentId % dataSize).getLargeDataId());
                ref.setDateIndex(DfTypeUtil.toDate(baseDateCal));
                ref.setDateNoIndex(ref.getDateIndex());
                ref.setTimestampIndex(DfTypeUtil.toTimestamp(baseTimestampCal));
                ref.setTimestampNoIndex(ref.getTimestampIndex());
                if ((currentId % 3) == 0) {
                    ref.setNullableDecimalIndex(new BigDecimal(currentId + "." + (currentId % 1000)));
                    ref.setNullableDecimalNoIndex(ref.getNullableDecimalIndex());
                }
                if (currentId % 10 == 1) { // means parent
                    selfParentId = ref.getLargeDataRefId();
                } else if (selfParentId != null) {
                    ref.setSelfParentId(selfParentId);
                }
                bw.write(ln() + buildRecord(VendorLargeDataRefDbm.getInstance().extractAllColumnMap(ref)));

                baseDateCal.add(Calendar.DATE, 1);
                baseTimestampCal.add(Calendar.HOUR, 4);
                baseTimestampCal.add(Calendar.SECOND, 20);
                baseTimestampCal.add(Calendar.MILLISECOND, 6);
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    protected String buildRecord(Map<String, Object> columnValueMap) {
        StringBuilder sb = new StringBuilder();
        Set<Entry<String, Object>> entrySet = columnValueMap.entrySet();
        int index = 0;
        for (Entry<String, Object> entry : entrySet) {
            Object value = entry.getValue();
            if (index > 0) {
                sb.append("\t");
            }
            if (value == null) {
                sb.append("");
            } else if (value instanceof Timestamp) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd HH:mm:ss.SSS"));
            } else if (value instanceof java.util.Date) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd"));
            } else {
                sb.append(value);
            }
            ++index;
        }
        return sb.toString();
    }
}
