package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of VENDOR_LARGE_DATA_REF.
 * @author oracleman
 */
public abstract class AbstractBsVendorLargeDataRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorLargeDataRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "VENDOR_LARGE_DATA_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataRefId The value of largeDataRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setLargeDataRefId_Equal(Long largeDataRefId) {
        doSetLargeDataRefId_Equal(largeDataRefId);
    }

    protected void doSetLargeDataRefId_Equal(Long largeDataRefId) {
        regLargeDataRefId(CK_EQ, largeDataRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataRefId The value of largeDataRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataRefId_GreaterThan(Long largeDataRefId) {
        regLargeDataRefId(CK_GT, largeDataRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataRefId The value of largeDataRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataRefId_LessThan(Long largeDataRefId) {
        regLargeDataRefId(CK_LT, largeDataRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataRefId The value of largeDataRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataRefId_GreaterEqual(Long largeDataRefId) {
        regLargeDataRefId(CK_GE, largeDataRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataRefId The value of largeDataRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataRefId_LessEqual(Long largeDataRefId) {
        regLargeDataRefId(CK_LE, largeDataRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @param minNumber The min number of largeDataRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of largeDataRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLargeDataRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLargeDataRefId(), "LARGE_DATA_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataRefIdList The collection of largeDataRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataRefId_InScope(Collection<Long> largeDataRefIdList) {
        doSetLargeDataRefId_InScope(largeDataRefIdList);
    }

    protected void doSetLargeDataRefId_InScope(Collection<Long> largeDataRefIdList) {
        regINS(CK_INS, cTL(largeDataRefIdList), getCValueLargeDataRefId(), "LARGE_DATA_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataRefIdList The collection of largeDataRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataRefId_NotInScope(Collection<Long> largeDataRefIdList) {
        doSetLargeDataRefId_NotInScope(largeDataRefIdList);
    }

    protected void doSetLargeDataRefId_NotInScope(Collection<Long> largeDataRefIdList) {
        regINS(CK_NINS, cTL(largeDataRefIdList), getCValueLargeDataRefId(), "LARGE_DATA_REF_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select SELF_PARENT_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsVendorLargeDataRefSelfList</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorLargeDataRefSelfList for 'exists'. (NotNull)
     */
    public void existsVendorLargeDataRefSelfList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "LARGE_DATA_REF_ID", "SELF_PARENT_ID", subQueryPropertyName, "vendorLargeDataRefSelfList");
    }
    public abstract String keepLargeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select SELF_PARENT_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsVendorLargeDataRefSelfList</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LargeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList for 'not exists'. (NotNull)
     */
    public void notExistsVendorLargeDataRefSelfList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "LARGE_DATA_REF_ID", "SELF_PARENT_ID", subQueryPropertyName, "vendorLargeDataRefSelfList");
    }
    public abstract String keepLargeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SELF_PARENT_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfAsOne'.
     * @param subQuery The sub-query of VendorLargeDataRefSelfList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorLargeDataRefSelfList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataRefId_InScopeRelation_VendorLargeDataRefSelfList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LARGE_DATA_REF_ID", "SELF_PARENT_ID", subQueryPropertyName, "vendorLargeDataRefSelfList");
    }
    public abstract String keepLargeDataRefId_InScopeRelation_VendorLargeDataRefSelfList(VendorLargeDataRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SELF_PARENT_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfAsOne'.
     * @param subQuery The sub-query of VendorLargeDataRefSelfList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorLargeDataRefSelfList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LARGE_DATA_REF_ID", "SELF_PARENT_ID", subQueryPropertyName, "vendorLargeDataRefSelfList");
    }
    public abstract String keepLargeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList(VendorLargeDataRefCQ subQuery);

    public void xsderiveVendorLargeDataRefSelfList(String function, SubQuery<VendorLargeDataRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LARGE_DATA_REF_ID", "SELF_PARENT_ID", subQueryPropertyName, "vendorLargeDataRefSelfList", aliasName, option);
    }
    public abstract String keepLargeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedVendorLargeDataRefSelfList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorLargeDataRefCB> derivedVendorLargeDataRefSelfList() {
        return xcreateQDRFunctionVendorLargeDataRefSelfList();
    }
    protected HpQDRFunction<VendorLargeDataRefCB> xcreateQDRFunctionVendorLargeDataRefSelfList() {
        return new HpQDRFunction<VendorLargeDataRefCB>(new HpQDRSetupper<VendorLargeDataRefCB>() {
            public void setup(String function, SubQuery<VendorLargeDataRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveVendorLargeDataRefSelfList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveVendorLargeDataRefSelfList(String function, SubQuery<VendorLargeDataRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LARGE_DATA_REF_ID", "SELF_PARENT_ID", subQueryPropertyName, "vendorLargeDataRefSelfList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ subQuery);
    public abstract String keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     */
    public void setLargeDataRefId_IsNull() { regLargeDataRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     */
    public void setLargeDataRefId_IsNotNull() { regLargeDataRefId(CK_ISNN, DOBJ); }

    protected void regLargeDataRefId(ConditionKey k, Object v) { regQ(k, v, getCValueLargeDataRefId(), "LARGE_DATA_REF_ID"); }
    abstract protected ConditionValue getCValueLargeDataRefId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @param largeDataId The value of largeDataId as equal. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_Equal(Long largeDataId) {
        doSetLargeDataId_Equal(largeDataId);
    }

    protected void doSetLargeDataId_Equal(Long largeDataId) {
        regLargeDataId(CK_EQ, largeDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @param largeDataId The value of largeDataId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_GreaterThan(Long largeDataId) {
        regLargeDataId(CK_GT, largeDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @param largeDataId The value of largeDataId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_LessThan(Long largeDataId) {
        regLargeDataId(CK_LT, largeDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @param largeDataId The value of largeDataId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_GreaterEqual(Long largeDataId) {
        regLargeDataId(CK_GE, largeDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @param largeDataId The value of largeDataId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_LessEqual(Long largeDataId) {
        regLargeDataId(CK_LE, largeDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @param minNumber The min number of largeDataId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of largeDataId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLargeDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLargeDataId(), "LARGE_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @param largeDataIdList The collection of largeDataId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataId_InScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_InScope(largeDataIdList);
    }

    protected void doSetLargeDataId_InScope(Collection<Long> largeDataIdList) {
        regINS(CK_INS, cTL(largeDataIdList), getCValueLargeDataId(), "LARGE_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @param largeDataIdList The collection of largeDataId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_NotInScope(largeDataIdList);
    }

    protected void doSetLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        regINS(CK_NINS, cTL(largeDataIdList), getCValueLargeDataId(), "LARGE_DATA_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LARGE_DATA_ID from VENDOR_LARGE_DATA where ...)} <br />
     * VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @param subQuery The sub-query of VendorLargeData for 'in-scope'. (NotNull)
     */
    public void inScopeVendorLargeData(SubQuery<VendorLargeDataCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataCB>", subQuery);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataId_InScopeRelation_VendorLargeData(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "vendorLargeData");
    }
    public abstract String keepLargeDataId_InScopeRelation_VendorLargeData(VendorLargeDataCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LARGE_DATA_ID from VENDOR_LARGE_DATA where ...)} <br />
     * VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @param subQuery The sub-query of VendorLargeData for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorLargeData(SubQuery<VendorLargeDataCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataCB>", subQuery);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataId_NotInScopeRelation_VendorLargeData(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "vendorLargeData");
    }
    public abstract String keepLargeDataId_NotInScopeRelation_VendorLargeData(VendorLargeDataCQ subQuery);

    protected void regLargeDataId(ConditionKey k, Object v) { regQ(k, v, getCValueLargeDataId(), "LARGE_DATA_ID"); }
    abstract protected ConditionValue getCValueLargeDataId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @param dateIndex The value of dateIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setDateIndex_Equal(java.util.Date dateIndex) {
        regDateIndex(CK_EQ,  fCTPD(dateIndex));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @param dateIndex The value of dateIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDateIndex_GreaterThan(java.util.Date dateIndex) {
        regDateIndex(CK_GT,  fCTPD(dateIndex));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @param dateIndex The value of dateIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDateIndex_LessThan(java.util.Date dateIndex) {
        regDateIndex(CK_LT,  fCTPD(dateIndex));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @param dateIndex The value of dateIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDateIndex_GreaterEqual(java.util.Date dateIndex) {
        regDateIndex(CK_GE,  fCTPD(dateIndex));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @param dateIndex The value of dateIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDateIndex_LessEqual(java.util.Date dateIndex) {
        regDateIndex(CK_LE, fCTPD(dateIndex));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * <pre>e.g. setDateIndex_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateIndex. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateIndex. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDateIndex_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueDateIndex(), "DATE_INDEX", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of dateIndex. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of dateIndex. (NullAllowed: if null, no to-condition)
     */
    public void setDateIndex_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDateIndex_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regDateIndex(ConditionKey k, Object v) { regQ(k, v, getCValueDateIndex(), "DATE_INDEX"); }
    abstract protected ConditionValue getCValueDateIndex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @param dateNoIndex The value of dateNoIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setDateNoIndex_Equal(java.util.Date dateNoIndex) {
        regDateNoIndex(CK_EQ,  fCTPD(dateNoIndex));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @param dateNoIndex The value of dateNoIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDateNoIndex_GreaterThan(java.util.Date dateNoIndex) {
        regDateNoIndex(CK_GT,  fCTPD(dateNoIndex));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @param dateNoIndex The value of dateNoIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDateNoIndex_LessThan(java.util.Date dateNoIndex) {
        regDateNoIndex(CK_LT,  fCTPD(dateNoIndex));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @param dateNoIndex The value of dateNoIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDateNoIndex_GreaterEqual(java.util.Date dateNoIndex) {
        regDateNoIndex(CK_GE,  fCTPD(dateNoIndex));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @param dateNoIndex The value of dateNoIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDateNoIndex_LessEqual(java.util.Date dateNoIndex) {
        regDateNoIndex(CK_LE, fCTPD(dateNoIndex));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * <pre>e.g. setDateNoIndex_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateNoIndex. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateNoIndex. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDateNoIndex_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueDateNoIndex(), "DATE_NO_INDEX", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of dateNoIndex. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of dateNoIndex. (NullAllowed: if null, no to-condition)
     */
    public void setDateNoIndex_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDateNoIndex_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regDateNoIndex(ConditionKey k, Object v) { regQ(k, v, getCValueDateNoIndex(), "DATE_NO_INDEX"); }
    abstract protected ConditionValue getCValueDateNoIndex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampIndex The value of timestampIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setTimestampIndex_Equal(java.sql.Timestamp timestampIndex) {
        regTimestampIndex(CK_EQ,  timestampIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampIndex The value of timestampIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampIndex_GreaterThan(java.sql.Timestamp timestampIndex) {
        regTimestampIndex(CK_GT,  timestampIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampIndex The value of timestampIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampIndex_LessThan(java.sql.Timestamp timestampIndex) {
        regTimestampIndex(CK_LT,  timestampIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampIndex The value of timestampIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampIndex_GreaterEqual(java.sql.Timestamp timestampIndex) {
        regTimestampIndex(CK_GE,  timestampIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampIndex The value of timestampIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampIndex_LessEqual(java.sql.Timestamp timestampIndex) {
        regTimestampIndex(CK_LE, timestampIndex);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>e.g. setTimestampIndex_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampIndex. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampIndex. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTimestampIndex_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueTimestampIndex(), "TIMESTAMP_INDEX", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of timestampIndex. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of timestampIndex. (NullAllowed: if null, no to-condition)
     */
    public void setTimestampIndex_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setTimestampIndex_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regTimestampIndex(ConditionKey k, Object v) { regQ(k, v, getCValueTimestampIndex(), "TIMESTAMP_INDEX"); }
    abstract protected ConditionValue getCValueTimestampIndex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampNoIndex The value of timestampNoIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setTimestampNoIndex_Equal(java.sql.Timestamp timestampNoIndex) {
        regTimestampNoIndex(CK_EQ,  timestampNoIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampNoIndex The value of timestampNoIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampNoIndex_GreaterThan(java.sql.Timestamp timestampNoIndex) {
        regTimestampNoIndex(CK_GT,  timestampNoIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampNoIndex The value of timestampNoIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampNoIndex_LessThan(java.sql.Timestamp timestampNoIndex) {
        regTimestampNoIndex(CK_LT,  timestampNoIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampNoIndex The value of timestampNoIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampNoIndex_GreaterEqual(java.sql.Timestamp timestampNoIndex) {
        regTimestampNoIndex(CK_GE,  timestampNoIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param timestampNoIndex The value of timestampNoIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampNoIndex_LessEqual(java.sql.Timestamp timestampNoIndex) {
        regTimestampNoIndex(CK_LE, timestampNoIndex);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>e.g. setTimestampNoIndex_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampNoIndex. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampNoIndex. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTimestampNoIndex_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueTimestampNoIndex(), "TIMESTAMP_NO_INDEX", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of timestampNoIndex. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of timestampNoIndex. (NullAllowed: if null, no to-condition)
     */
    public void setTimestampNoIndex_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setTimestampNoIndex_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regTimestampNoIndex(ConditionKey k, Object v) { regQ(k, v, getCValueTimestampNoIndex(), "TIMESTAMP_NO_INDEX"); }
    abstract protected ConditionValue getCValueTimestampNoIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @param nullableDecimalIndex The value of nullableDecimalIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalIndex_Equal(java.math.BigDecimal nullableDecimalIndex) {
        doSetNullableDecimalIndex_Equal(nullableDecimalIndex);
    }

    protected void doSetNullableDecimalIndex_Equal(java.math.BigDecimal nullableDecimalIndex) {
        regNullableDecimalIndex(CK_EQ, nullableDecimalIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @param nullableDecimalIndex The value of nullableDecimalIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalIndex_GreaterThan(java.math.BigDecimal nullableDecimalIndex) {
        regNullableDecimalIndex(CK_GT, nullableDecimalIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @param nullableDecimalIndex The value of nullableDecimalIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalIndex_LessThan(java.math.BigDecimal nullableDecimalIndex) {
        regNullableDecimalIndex(CK_LT, nullableDecimalIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @param nullableDecimalIndex The value of nullableDecimalIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalIndex_GreaterEqual(java.math.BigDecimal nullableDecimalIndex) {
        regNullableDecimalIndex(CK_GE, nullableDecimalIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @param nullableDecimalIndex The value of nullableDecimalIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalIndex_LessEqual(java.math.BigDecimal nullableDecimalIndex) {
        regNullableDecimalIndex(CK_LE, nullableDecimalIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @param minNumber The min number of nullableDecimalIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nullableDecimalIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNullableDecimalIndex_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNullableDecimalIndex(), "NULLABLE_DECIMAL_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @param nullableDecimalIndexList The collection of nullableDecimalIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNullableDecimalIndex_InScope(Collection<java.math.BigDecimal> nullableDecimalIndexList) {
        doSetNullableDecimalIndex_InScope(nullableDecimalIndexList);
    }

    protected void doSetNullableDecimalIndex_InScope(Collection<java.math.BigDecimal> nullableDecimalIndexList) {
        regINS(CK_INS, cTL(nullableDecimalIndexList), getCValueNullableDecimalIndex(), "NULLABLE_DECIMAL_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @param nullableDecimalIndexList The collection of nullableDecimalIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNullableDecimalIndex_NotInScope(Collection<java.math.BigDecimal> nullableDecimalIndexList) {
        doSetNullableDecimalIndex_NotInScope(nullableDecimalIndexList);
    }

    protected void doSetNullableDecimalIndex_NotInScope(Collection<java.math.BigDecimal> nullableDecimalIndexList) {
        regINS(CK_NINS, cTL(nullableDecimalIndexList), getCValueNullableDecimalIndex(), "NULLABLE_DECIMAL_INDEX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     */
    public void setNullableDecimalIndex_IsNull() { regNullableDecimalIndex(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     */
    public void setNullableDecimalIndex_IsNotNull() { regNullableDecimalIndex(CK_ISNN, DOBJ); }

    protected void regNullableDecimalIndex(ConditionKey k, Object v) { regQ(k, v, getCValueNullableDecimalIndex(), "NULLABLE_DECIMAL_INDEX"); }
    abstract protected ConditionValue getCValueNullableDecimalIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @param nullableDecimalNoIndex The value of nullableDecimalNoIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalNoIndex_Equal(java.math.BigDecimal nullableDecimalNoIndex) {
        doSetNullableDecimalNoIndex_Equal(nullableDecimalNoIndex);
    }

    protected void doSetNullableDecimalNoIndex_Equal(java.math.BigDecimal nullableDecimalNoIndex) {
        regNullableDecimalNoIndex(CK_EQ, nullableDecimalNoIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @param nullableDecimalNoIndex The value of nullableDecimalNoIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalNoIndex_GreaterThan(java.math.BigDecimal nullableDecimalNoIndex) {
        regNullableDecimalNoIndex(CK_GT, nullableDecimalNoIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @param nullableDecimalNoIndex The value of nullableDecimalNoIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalNoIndex_LessThan(java.math.BigDecimal nullableDecimalNoIndex) {
        regNullableDecimalNoIndex(CK_LT, nullableDecimalNoIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @param nullableDecimalNoIndex The value of nullableDecimalNoIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalNoIndex_GreaterEqual(java.math.BigDecimal nullableDecimalNoIndex) {
        regNullableDecimalNoIndex(CK_GE, nullableDecimalNoIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @param nullableDecimalNoIndex The value of nullableDecimalNoIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNullableDecimalNoIndex_LessEqual(java.math.BigDecimal nullableDecimalNoIndex) {
        regNullableDecimalNoIndex(CK_LE, nullableDecimalNoIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @param minNumber The min number of nullableDecimalNoIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nullableDecimalNoIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNullableDecimalNoIndex_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNullableDecimalNoIndex(), "NULLABLE_DECIMAL_NO_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @param nullableDecimalNoIndexList The collection of nullableDecimalNoIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNullableDecimalNoIndex_InScope(Collection<java.math.BigDecimal> nullableDecimalNoIndexList) {
        doSetNullableDecimalNoIndex_InScope(nullableDecimalNoIndexList);
    }

    protected void doSetNullableDecimalNoIndex_InScope(Collection<java.math.BigDecimal> nullableDecimalNoIndexList) {
        regINS(CK_INS, cTL(nullableDecimalNoIndexList), getCValueNullableDecimalNoIndex(), "NULLABLE_DECIMAL_NO_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @param nullableDecimalNoIndexList The collection of nullableDecimalNoIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNullableDecimalNoIndex_NotInScope(Collection<java.math.BigDecimal> nullableDecimalNoIndexList) {
        doSetNullableDecimalNoIndex_NotInScope(nullableDecimalNoIndexList);
    }

    protected void doSetNullableDecimalNoIndex_NotInScope(Collection<java.math.BigDecimal> nullableDecimalNoIndexList) {
        regINS(CK_NINS, cTL(nullableDecimalNoIndexList), getCValueNullableDecimalNoIndex(), "NULLABLE_DECIMAL_NO_INDEX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     */
    public void setNullableDecimalNoIndex_IsNull() { regNullableDecimalNoIndex(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     */
    public void setNullableDecimalNoIndex_IsNotNull() { regNullableDecimalNoIndex(CK_ISNN, DOBJ); }

    protected void regNullableDecimalNoIndex(ConditionKey k, Object v) { regQ(k, v, getCValueNullableDecimalNoIndex(), "NULLABLE_DECIMAL_NO_INDEX"); }
    abstract protected ConditionValue getCValueNullableDecimalNoIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @param selfParentId The value of selfParentId as equal. (NullAllowed: if null, no condition)
     */
    public void setSelfParentId_Equal(Long selfParentId) {
        doSetSelfParentId_Equal(selfParentId);
    }

    protected void doSetSelfParentId_Equal(Long selfParentId) {
        regSelfParentId(CK_EQ, selfParentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @param selfParentId The value of selfParentId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSelfParentId_GreaterThan(Long selfParentId) {
        regSelfParentId(CK_GT, selfParentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @param selfParentId The value of selfParentId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSelfParentId_LessThan(Long selfParentId) {
        regSelfParentId(CK_LT, selfParentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @param selfParentId The value of selfParentId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSelfParentId_GreaterEqual(Long selfParentId) {
        regSelfParentId(CK_GE, selfParentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @param selfParentId The value of selfParentId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSelfParentId_LessEqual(Long selfParentId) {
        regSelfParentId(CK_LE, selfParentId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @param minNumber The min number of selfParentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of selfParentId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSelfParentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSelfParentId(), "SELF_PARENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @param selfParentIdList The collection of selfParentId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfParentId_InScope(Collection<Long> selfParentIdList) {
        doSetSelfParentId_InScope(selfParentIdList);
    }

    protected void doSetSelfParentId_InScope(Collection<Long> selfParentIdList) {
        regINS(CK_INS, cTL(selfParentIdList), getCValueSelfParentId(), "SELF_PARENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @param selfParentIdList The collection of selfParentId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfParentId_NotInScope(Collection<Long> selfParentIdList) {
        doSetSelfParentId_NotInScope(selfParentIdList);
    }

    protected void doSetSelfParentId_NotInScope(Collection<Long> selfParentIdList) {
        regINS(CK_NINS, cTL(selfParentIdList), getCValueSelfParentId(), "SELF_PARENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SELF_PARENT_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @param subQuery The sub-query of VendorLargeDataRefSelf for 'in-scope'. (NotNull)
     */
    public void inScopeVendorLargeDataRefSelf(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSelfParentId_InScopeRelation_VendorLargeDataRefSelf(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "SELF_PARENT_ID", "LARGE_DATA_REF_ID", subQueryPropertyName, "vendorLargeDataRefSelf");
    }
    public abstract String keepSelfParentId_InScopeRelation_VendorLargeDataRefSelf(VendorLargeDataRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SELF_PARENT_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @param subQuery The sub-query of VendorLargeDataRefSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorLargeDataRefSelf(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSelfParentId_NotInScopeRelation_VendorLargeDataRefSelf(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "SELF_PARENT_ID", "LARGE_DATA_REF_ID", subQueryPropertyName, "vendorLargeDataRefSelf");
    }
    public abstract String keepSelfParentId_NotInScopeRelation_VendorLargeDataRefSelf(VendorLargeDataRefCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     */
    public void setSelfParentId_IsNull() { regSelfParentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     */
    public void setSelfParentId_IsNotNull() { regSelfParentId(CK_ISNN, DOBJ); }

    protected void regSelfParentId(ConditionKey k, Object v) { regQ(k, v, getCValueSelfParentId(), "SELF_PARENT_ID"); }
    abstract protected ConditionValue getCValueSelfParentId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorLargeDataRefCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorLargeDataRefCB>(new HpSSQSetupper<VendorLargeDataRefCB>() {
            public void setup(String function, SubQuery<VendorLargeDataRefCB> subQuery, HpSSQOption<VendorLargeDataRefCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorLargeDataRefCB> subQuery, String operand, HpSSQOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(VendorLargeDataRefCQ subQuery);

    protected VendorLargeDataRefCB xcreateScalarConditionCB() {
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorLargeDataRefCB xcreateScalarConditionPartitionByCB() {
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<VendorLargeDataRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "LARGE_DATA_REF_ID", "LARGE_DATA_REF_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(VendorLargeDataRefCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorLargeDataRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorLargeDataRefCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorLargeDataRefCB>(new HpQDRSetupper<VendorLargeDataRefCB>() {
            public void setup(String function, SubQuery<VendorLargeDataRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<VendorLargeDataRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "LARGE_DATA_REF_ID", "LARGE_DATA_REF_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(VendorLargeDataRefCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(VendorLargeDataRefCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorLargeDataRefCQ subQuery);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br />
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return VendorLargeDataRefCB.class.getName(); }
    protected String xabCQ() { return VendorLargeDataRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
