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
 * The abstract condition-query of VENDOR_LARGE_NAME_90123456_REF.
 * @author oracleman
 */
public abstract class AbstractBsVendorLargeName90123456RefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorLargeName90123456RefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_LARGE_NAME_90123456_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName90123RefId The value of vendorLargeName90123RefId as equal. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName90123RefId_Equal(Long vendorLargeName90123RefId) {
        doSetVendorLargeName90123RefId_Equal(vendorLargeName90123RefId);
    }

    protected void doSetVendorLargeName90123RefId_Equal(Long vendorLargeName90123RefId) {
        regVendorLargeName90123RefId(CK_EQ, vendorLargeName90123RefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName90123RefId The value of vendorLargeName90123RefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName90123RefId_GreaterThan(Long vendorLargeName90123RefId) {
        regVendorLargeName90123RefId(CK_GT, vendorLargeName90123RefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName90123RefId The value of vendorLargeName90123RefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName90123RefId_LessThan(Long vendorLargeName90123RefId) {
        regVendorLargeName90123RefId(CK_LT, vendorLargeName90123RefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName90123RefId The value of vendorLargeName90123RefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName90123RefId_GreaterEqual(Long vendorLargeName90123RefId) {
        regVendorLargeName90123RefId(CK_GE, vendorLargeName90123RefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName90123RefId The value of vendorLargeName90123RefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName90123RefId_LessEqual(Long vendorLargeName90123RefId) {
        regVendorLargeName90123RefId(CK_LE, vendorLargeName90123RefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of vendorLargeName90123RefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorLargeName90123RefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorLargeName90123RefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendorLargeName90123RefId(), "VENDOR_LARGE_NAME_90123_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName90123RefIdList The collection of vendorLargeName90123RefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName90123RefId_InScope(Collection<Long> vendorLargeName90123RefIdList) {
        doSetVendorLargeName90123RefId_InScope(vendorLargeName90123RefIdList);
    }

    protected void doSetVendorLargeName90123RefId_InScope(Collection<Long> vendorLargeName90123RefIdList) {
        regINS(CK_INS, cTL(vendorLargeName90123RefIdList), getCValueVendorLargeName90123RefId(), "VENDOR_LARGE_NAME_90123_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName90123RefIdList The collection of vendorLargeName90123RefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName90123RefId_NotInScope(Collection<Long> vendorLargeName90123RefIdList) {
        doSetVendorLargeName90123RefId_NotInScope(vendorLargeName90123RefIdList);
    }

    protected void doSetVendorLargeName90123RefId_NotInScope(Collection<Long> vendorLargeName90123RefIdList) {
        regINS(CK_NINS, cTL(vendorLargeName90123RefIdList), getCValueVendorLargeName90123RefId(), "VENDOR_LARGE_NAME_90123_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorLargeName90123RefId_IsNull() { regVendorLargeName90123RefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorLargeName90123RefId_IsNotNull() { regVendorLargeName90123RefId(CK_ISNN, DOBJ); }

    protected void regVendorLargeName90123RefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendorLargeName90123RefId(), "VENDOR_LARGE_NAME_90123_REF_ID"); }
    protected abstract ConditionValue getCValueVendorLargeName90123RefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName901RefName The value of vendorLargeName901RefName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName901RefName_Equal(String vendorLargeName901RefName) {
        doSetVendorLargeName901RefName_Equal(fRES(vendorLargeName901RefName));
    }

    protected void doSetVendorLargeName901RefName_Equal(String vendorLargeName901RefName) {
        regVendorLargeName901RefName(CK_EQ, vendorLargeName901RefName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName901RefName The value of vendorLargeName901RefName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName901RefName_NotEqual(String vendorLargeName901RefName) {
        doSetVendorLargeName901RefName_NotEqual(fRES(vendorLargeName901RefName));
    }

    protected void doSetVendorLargeName901RefName_NotEqual(String vendorLargeName901RefName) {
        regVendorLargeName901RefName(CK_NES, vendorLargeName901RefName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName901RefNameList The collection of vendorLargeName901RefName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName901RefName_InScope(Collection<String> vendorLargeName901RefNameList) {
        doSetVendorLargeName901RefName_InScope(vendorLargeName901RefNameList);
    }

    public void doSetVendorLargeName901RefName_InScope(Collection<String> vendorLargeName901RefNameList) {
        regINS(CK_INS, cTL(vendorLargeName901RefNameList), getCValueVendorLargeName901RefName(), "VENDOR_LARGE_NAME_901_REF_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName901RefNameList The collection of vendorLargeName901RefName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName901RefName_NotInScope(Collection<String> vendorLargeName901RefNameList) {
        doSetVendorLargeName901RefName_NotInScope(vendorLargeName901RefNameList);
    }

    public void doSetVendorLargeName901RefName_NotInScope(Collection<String> vendorLargeName901RefNameList) {
        regINS(CK_NINS, cTL(vendorLargeName901RefNameList), getCValueVendorLargeName901RefName(), "VENDOR_LARGE_NAME_901_REF_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName901RefName The value of vendorLargeName901RefName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName901RefName_PrefixSearch(String vendorLargeName901RefName) {
        setVendorLargeName901RefName_LikeSearch(vendorLargeName901RefName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)} <br />
     * <pre>e.g. setVendorLargeName901RefName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vendorLargeName901RefName The value of vendorLargeName901RefName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVendorLargeName901RefName_LikeSearch(String vendorLargeName901RefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vendorLargeName901RefName), getCValueVendorLargeName901RefName(), "VENDOR_LARGE_NAME_901_REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName901RefName The value of vendorLargeName901RefName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVendorLargeName901RefName_NotLikeSearch(String vendorLargeName901RefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vendorLargeName901RefName), getCValueVendorLargeName901RefName(), "VENDOR_LARGE_NAME_901_REF_NAME", likeSearchOption);
    }

    protected void regVendorLargeName901RefName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendorLargeName901RefName(), "VENDOR_LARGE_NAME_901_REF_NAME"); }
    protected abstract ConditionValue getCValueVendorLargeName901RefName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as equal. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_Equal(Long vendorLargeName901234567Id) {
        doSetVendorLargeName901234567Id_Equal(vendorLargeName901234567Id);
    }

    protected void doSetVendorLargeName901234567Id_Equal(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_EQ, vendorLargeName901234567Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_GreaterThan(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_GT, vendorLargeName901234567Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_LessThan(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_LT, vendorLargeName901234567Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_GreaterEqual(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_GE, vendorLargeName901234567Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_LessEqual(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_LE, vendorLargeName901234567Id);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @param minNumber The min number of vendorLargeName901234567Id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorLargeName901234567Id. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorLargeName901234567Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @param vendorLargeName901234567IdList The collection of vendorLargeName901234567Id as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName901234567Id_InScope(Collection<Long> vendorLargeName901234567IdList) {
        doSetVendorLargeName901234567Id_InScope(vendorLargeName901234567IdList);
    }

    protected void doSetVendorLargeName901234567Id_InScope(Collection<Long> vendorLargeName901234567IdList) {
        regINS(CK_INS, cTL(vendorLargeName901234567IdList), getCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @param vendorLargeName901234567IdList The collection of vendorLargeName901234567Id as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName901234567Id_NotInScope(Collection<Long> vendorLargeName901234567IdList) {
        doSetVendorLargeName901234567Id_NotInScope(vendorLargeName901234567IdList);
    }

    protected void doSetVendorLargeName901234567Id_NotInScope(Collection<Long> vendorLargeName901234567IdList) {
        regINS(CK_NINS, cTL(vendorLargeName901234567IdList), getCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select VENDOR_LARGE_NAME_901234567_ID from VENDOR_LARGE_NAME_901234567890 where ...)} <br />
     * VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @param subQuery The sub-query of VendorLargeName901234567890 for 'in-scope'. (NotNull)
     */
    public void inScopeVendorLargeName901234567890(SubQuery<VendorLargeName901234567890CB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepVendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName901234567890");
    }
    public abstract String keepVendorLargeName901234567Id_InScopeRelation_VendorLargeName901234567890(VendorLargeName901234567890CQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select VENDOR_LARGE_NAME_901234567_ID from VENDOR_LARGE_NAME_901234567890 where ...)} <br />
     * VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @param subQuery The sub-query of VendorLargeName901234567890 for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorLargeName901234567890(SubQuery<VendorLargeName901234567890CB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName901234567890");
    }
    public abstract String keepVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName901234567890(VendorLargeName901234567890CQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     */
    public void setVendorLargeName901234567Id_IsNull() { regVendorLargeName901234567Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     */
    public void setVendorLargeName901234567Id_IsNotNull() { regVendorLargeName901234567Id(CK_ISNN, DOBJ); }

    protected void regVendorLargeName901234567Id(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID"); }
    protected abstract ConditionValue getCValueVendorLargeName901234567Id();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName90123456RefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), VendorLargeName90123456RefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName90123456RefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), VendorLargeName90123456RefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName90123456RefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), VendorLargeName90123456RefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName90123456RefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), VendorLargeName90123456RefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName90123456RefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), VendorLargeName90123456RefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName90123456RefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), VendorLargeName90123456RefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName90123456RefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorLargeName90123456RefCQ sq);

    protected VendorLargeName90123456RefCB xcreateScalarConditionCB() {
        VendorLargeName90123456RefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorLargeName90123456RefCB xcreateScalarConditionPartitionByCB() {
        VendorLargeName90123456RefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorLargeName90123456RefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "VENDOR_LARGE_NAME_90123_REF_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorLargeName90123456RefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorLargeName90123456RefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorLargeName90123456RefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VENDOR_LARGE_NAME_90123_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorLargeName90123456RefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorLargeName90123456RefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorLargeName90123456RefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorLargeName90123456RefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorLargeName90123456RefCQ sq);

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
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
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
    protected VendorLargeName90123456RefCB newMyCB() {
        return new VendorLargeName90123456RefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return VendorLargeName90123456RefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
