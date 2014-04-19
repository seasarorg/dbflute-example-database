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
 * The abstract condition-query of VENDOR_LARGE_NAME_901234567890.
 * @author oracleman
 */
public abstract class AbstractBsVendorLargeName901234567890CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorLargeName901234567890CQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_LARGE_NAME_901234567890";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
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
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_GreaterThan(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_GT, vendorLargeName901234567Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_LessThan(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_LT, vendorLargeName901234567Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_GreaterEqual(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_GE, vendorLargeName901234567Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorLargeName901234567Id_LessEqual(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_LE, vendorLargeName901234567Id);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of vendorLargeName901234567Id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorLargeName901234567Id. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorLargeName901234567Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
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
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567IdList The collection of vendorLargeName901234567Id as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName901234567Id_NotInScope(Collection<Long> vendorLargeName901234567IdList) {
        doSetVendorLargeName901234567Id_NotInScope(vendorLargeName901234567IdList);
    }

    protected void doSetVendorLargeName901234567Id_NotInScope(Collection<Long> vendorLargeName901234567IdList) {
        regINS(CK_NINS, cTL(vendorLargeName901234567IdList), getCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select VENDOR_LARGE_NAME_901234567_ID from VENDOR_LARGE_NAME_90123456_REF where ...)} <br />
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsVendorLargeName90123456RefList</span>(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorLargeName90123456RefList for 'exists'. (NotNull)
     */
    public void existsVendorLargeName90123456RefList(SubQuery<VendorLargeName90123456RefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepVendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName90123456RefList");
    }
    public abstract String keepVendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select VENDOR_LARGE_NAME_901234567_ID from VENDOR_LARGE_NAME_90123456_REF where ...)} <br />
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsVendorLargeName90123456RefList</span>(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorLargeName90123456RefList(SubQuery<VendorLargeName90123456RefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepVendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName90123456RefList");
    }
    public abstract String keepVendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select VENDOR_LARGE_NAME_901234567_ID from VENDOR_LARGE_NAME_90123456_REF where ...)} <br />
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefAsOne'.
     * @param subQuery The sub-query of VendorLargeName90123456RefList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorLargeName90123456RefList(SubQuery<VendorLargeName90123456RefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepVendorLargeName901234567Id_InScopeRelation_VendorLargeName90123456RefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName90123456RefList");
    }
    public abstract String keepVendorLargeName901234567Id_InScopeRelation_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select VENDOR_LARGE_NAME_901234567_ID from VENDOR_LARGE_NAME_90123456_REF where ...)} <br />
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefAsOne'.
     * @param subQuery The sub-query of VendorLargeName90123456RefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorLargeName90123456RefList(SubQuery<VendorLargeName90123456RefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName90123456RefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName90123456RefList");
    }
    public abstract String keepVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);

    public void xsderiveVendorLargeName90123456RefList(String fn, SubQuery<VendorLargeName90123456RefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepVendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName90123456RefList", al, op);
    }
    public abstract String keepVendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from VENDOR_LARGE_NAME_90123456_REF where ...)} <br />
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedVendorLargeName90123456RefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void query(VendorLargeName90123456RefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorLargeName90123456RefCB> derivedVendorLargeName90123456RefList() {
        return xcreateQDRFunctionVendorLargeName90123456RefList();
    }
    protected HpQDRFunction<VendorLargeName90123456RefCB> xcreateQDRFunctionVendorLargeName90123456RefList() {
        return new HpQDRFunction<VendorLargeName90123456RefCB>(new HpQDRSetupper<VendorLargeName90123456RefCB>() {
            public void setup(String fn, SubQuery<VendorLargeName90123456RefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveVendorLargeName90123456RefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveVendorLargeName90123456RefList(String fn, SubQuery<VendorLargeName90123456RefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList(cb.query()); // for saving query-value.
        String prpp = keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", sqpp, "vendorLargeName90123456RefList", rd, vl, prpp, op);
    }
    public abstract String keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);
    public abstract String keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorLargeName901234567Id_IsNull() { regVendorLargeName901234567Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorLargeName901234567Id_IsNotNull() { regVendorLargeName901234567Id(CK_ISNN, DOBJ); }

    protected void regVendorLargeName901234567Id(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID"); }
    protected abstract ConditionValue getCValueVendorLargeName901234567Id();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName9012345Name_Equal(String vendorLargeName9012345Name) {
        doSetVendorLargeName9012345Name_Equal(fRES(vendorLargeName9012345Name));
    }

    protected void doSetVendorLargeName9012345Name_Equal(String vendorLargeName9012345Name) {
        regVendorLargeName9012345Name(CK_EQ, vendorLargeName9012345Name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName9012345Name_NotEqual(String vendorLargeName9012345Name) {
        doSetVendorLargeName9012345Name_NotEqual(fRES(vendorLargeName9012345Name));
    }

    protected void doSetVendorLargeName9012345Name_NotEqual(String vendorLargeName9012345Name) {
        regVendorLargeName9012345Name(CK_NES, vendorLargeName9012345Name);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345NameList The collection of vendorLargeName9012345Name as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName9012345Name_InScope(Collection<String> vendorLargeName9012345NameList) {
        doSetVendorLargeName9012345Name_InScope(vendorLargeName9012345NameList);
    }

    public void doSetVendorLargeName9012345Name_InScope(Collection<String> vendorLargeName9012345NameList) {
        regINS(CK_INS, cTL(vendorLargeName9012345NameList), getCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345NameList The collection of vendorLargeName9012345Name as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName9012345Name_NotInScope(Collection<String> vendorLargeName9012345NameList) {
        doSetVendorLargeName9012345Name_NotInScope(vendorLargeName9012345NameList);
    }

    public void doSetVendorLargeName9012345Name_NotInScope(Collection<String> vendorLargeName9012345NameList) {
        regINS(CK_NINS, cTL(vendorLargeName9012345NameList), getCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorLargeName9012345Name_PrefixSearch(String vendorLargeName9012345Name) {
        setVendorLargeName9012345Name_LikeSearch(vendorLargeName9012345Name, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)} <br />
     * <pre>e.g. setVendorLargeName9012345Name_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVendorLargeName9012345Name_LikeSearch(String vendorLargeName9012345Name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vendorLargeName9012345Name), getCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVendorLargeName9012345Name_NotLikeSearch(String vendorLargeName9012345Name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vendorLargeName9012345Name), getCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME", likeSearchOption);
    }

    protected void regVendorLargeName9012345Name(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME"); }
    protected abstract ConditionValue getCValueVendorLargeName9012345Name();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void query(VendorLargeName901234567890CB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName901234567890CB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), VendorLargeName901234567890CB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void query(VendorLargeName901234567890CB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName901234567890CB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), VendorLargeName901234567890CB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void query(VendorLargeName901234567890CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName901234567890CB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), VendorLargeName901234567890CB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void query(VendorLargeName901234567890CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName901234567890CB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), VendorLargeName901234567890CB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void query(VendorLargeName901234567890CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName901234567890CB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), VendorLargeName901234567890CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void query(VendorLargeName901234567890CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeName901234567890CB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), VendorLargeName901234567890CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName901234567890CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorLargeName901234567890CQ sq);

    protected VendorLargeName901234567890CB xcreateScalarConditionCB() {
        VendorLargeName901234567890CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorLargeName901234567890CB xcreateScalarConditionPartitionByCB() {
        VendorLargeName901234567890CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorLargeName901234567890CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "VENDOR_LARGE_NAME_901234567_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorLargeName901234567890CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorLargeName901234567890CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorLargeName901234567890CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VENDOR_LARGE_NAME_901234567_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorLargeName901234567890CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorLargeName901234567890CB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorLargeName901234567890CQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorLargeName901234567890CB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorLargeName901234567890CQ sq);

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
    protected VendorLargeName901234567890CB newMyCB() {
        return new VendorLargeName901234567890CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return VendorLargeName901234567890CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
