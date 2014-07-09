package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of VENDOR-NON COMPILABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendor_non_compilableCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendor_non_compilableCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
        return "VENDOR-NON COMPILABLE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as equal. (NullAllowed: if null, no condition)
     */
    public void setNon_compilable_id_Equal(Integer non_compilable_id) {
        doSetNon_compilable_id_Equal(non_compilable_id);
    }

    protected void doSetNon_compilable_id_Equal(Integer non_compilable_id) {
        regNon_compilable_id(CK_EQ, non_compilable_id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNon_compilable_id_GreaterThan(Integer non_compilable_id) {
        regNon_compilable_id(CK_GT, non_compilable_id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNon_compilable_id_LessThan(Integer non_compilable_id) {
        regNon_compilable_id(CK_LT, non_compilable_id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNon_compilable_id_GreaterEqual(Integer non_compilable_id) {
        regNon_compilable_id(CK_GE, non_compilable_id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNon_compilable_id_LessEqual(Integer non_compilable_id) {
        regNon_compilable_id(CK_LE, non_compilable_id);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param minNumber The min number of non_compilable_id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of non_compilable_id. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNon_compilable_id_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNon_compilable_id(), "NON-COMPILABLE ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_idList The collection of non_compilable_id as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNon_compilable_id_InScope(Collection<Integer> non_compilable_idList) {
        doSetNon_compilable_id_InScope(non_compilable_idList);
    }

    protected void doSetNon_compilable_id_InScope(Collection<Integer> non_compilable_idList) {
        regINS(CK_INS, cTL(non_compilable_idList), getCValueNon_compilable_id(), "NON-COMPILABLE ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_idList The collection of non_compilable_id as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNon_compilable_id_NotInScope(Collection<Integer> non_compilable_idList) {
        doSetNon_compilable_id_NotInScope(non_compilable_idList);
    }

    protected void doSetNon_compilable_id_NotInScope(Collection<Integer> non_compilable_idList) {
        regINS(CK_NINS, cTL(non_compilable_idList), getCValueNon_compilable_id(), "NON-COMPILABLE ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select Next_ParentID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsVendor_non_compilableByNextParentidSelfList</span>(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Vendor_non_compilableByNextParentidSelfList for 'exists'. (NotNull)
     */
    public void existsVendor_non_compilableByNextParentidSelfList(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByNextParentidSelfList(cb.query());
        registerExistsReferrer(cb.query(), "NON-COMPILABLE ID", "Next_ParentID", pp, "vendor_non_compilableByNextParentidSelfList");
    }
    public abstract String keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PARENT-ID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsVendor_non_compilableByParent_idSelfList</span>(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Vendor_non_compilableByParent_idSelfList for 'exists'. (NotNull)
     */
    public void existsVendor_non_compilableByParent_idSelfList(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByParent_idSelfList(cb.query());
        registerExistsReferrer(cb.query(), "NON-COMPILABLE ID", "PARENT-ID", pp, "vendor_non_compilableByParent_idSelfList");
    }
    public abstract String keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select Next_ParentID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsVendor_non_compilableByNextParentidSelfList</span>(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Non_compilable_id_NotExistsReferrer_Vendor_non_compilableByNextParentidSelfList for 'not exists'. (NotNull)
     */
    public void notExistsVendor_non_compilableByNextParentidSelfList(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByNextParentidSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "NON-COMPILABLE ID", "Next_ParentID", pp, "vendor_non_compilableByNextParentidSelfList");
    }
    public abstract String keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PARENT-ID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsVendor_non_compilableByParent_idSelfList</span>(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Non_compilable_id_NotExistsReferrer_Vendor_non_compilableByParent_idSelfList for 'not exists'. (NotNull)
     */
    public void notExistsVendor_non_compilableByParent_idSelfList(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByParent_idSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "NON-COMPILABLE ID", "PARENT-ID", pp, "vendor_non_compilableByParent_idSelfList");
    }
    public abstract String keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select Next_ParentID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfAsOne'.
     * @param subQuery The sub-query of Vendor_non_compilableByNextParentidSelfList for 'in-scope'. (NotNull)
     */
    public void inScopeVendor_non_compilableByNextParentidSelfList(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_InScopeRelation_Vendor_non_compilableByNextParentidSelfList(cb.query());
        registerInScopeRelation(cb.query(), "NON-COMPILABLE ID", "Next_ParentID", pp, "vendor_non_compilableByNextParentidSelfList");
    }
    public abstract String keepNon_compilable_id_InScopeRelation_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT-ID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfAsOne'.
     * @param subQuery The sub-query of Vendor_non_compilableByParent_idSelfList for 'in-scope'. (NotNull)
     */
    public void inScopeVendor_non_compilableByParent_idSelfList(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_InScopeRelation_Vendor_non_compilableByParent_idSelfList(cb.query());
        registerInScopeRelation(cb.query(), "NON-COMPILABLE ID", "PARENT-ID", pp, "vendor_non_compilableByParent_idSelfList");
    }
    public abstract String keepNon_compilable_id_InScopeRelation_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select Next_ParentID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfAsOne'.
     * @param subQuery The sub-query of Vendor_non_compilableByNextParentidSelfList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendor_non_compilableByNextParentidSelfList(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableByNextParentidSelfList(cb.query());
        registerNotInScopeRelation(cb.query(), "NON-COMPILABLE ID", "Next_ParentID", pp, "vendor_non_compilableByNextParentidSelfList");
    }
    public abstract String keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT-ID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfAsOne'.
     * @param subQuery The sub-query of Vendor_non_compilableByParent_idSelfList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendor_non_compilableByParent_idSelfList(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableByParent_idSelfList(cb.query());
        registerNotInScopeRelation(cb.query(), "NON-COMPILABLE ID", "PARENT-ID", pp, "vendor_non_compilableByParent_idSelfList");
    }
    public abstract String keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);

    public void xsderiveVendor_non_compilableByNextParentidSelfList(String fn, SubQuery<Vendor_non_compilableCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "NON-COMPILABLE ID", "Next_ParentID", pp, "vendor_non_compilableByNextParentidSelfList", al, op);
    }
    public abstract String keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);

    public void xsderiveVendor_non_compilableByParent_idSelfList(String fn, SubQuery<Vendor_non_compilableCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByParent_idSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "NON-COMPILABLE ID", "PARENT-ID", pp, "vendor_non_compilableByParent_idSelfList", al, op);
    }
    public abstract String keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedVendor_non_compilableByNextParentidSelfList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<Vendor_non_compilableCB> derivedVendor_non_compilableByNextParentidSelfList() {
        return xcreateQDRFunctionVendor_non_compilableByNextParentidSelfList();
    }
    protected HpQDRFunction<Vendor_non_compilableCB> xcreateQDRFunctionVendor_non_compilableByNextParentidSelfList() {
        return new HpQDRFunction<Vendor_non_compilableCB>(new HpQDRSetupper<Vendor_non_compilableCB>() {
            public void setup(String fn, SubQuery<Vendor_non_compilableCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveVendor_non_compilableByNextParentidSelfList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveVendor_non_compilableByNextParentidSelfList(String fn, SubQuery<Vendor_non_compilableCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(cb.query()); String prpp = keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "NON-COMPILABLE ID", "Next_ParentID", sqpp, "vendor_non_compilableByNextParentidSelfList", rd, vl, prpp, op);
    }
    public abstract String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);
    public abstract String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedVendor_non_compilableByParent_idSelfList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<Vendor_non_compilableCB> derivedVendor_non_compilableByParent_idSelfList() {
        return xcreateQDRFunctionVendor_non_compilableByParent_idSelfList();
    }
    protected HpQDRFunction<Vendor_non_compilableCB> xcreateQDRFunctionVendor_non_compilableByParent_idSelfList() {
        return new HpQDRFunction<Vendor_non_compilableCB>(new HpQDRSetupper<Vendor_non_compilableCB>() {
            public void setup(String fn, SubQuery<Vendor_non_compilableCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveVendor_non_compilableByParent_idSelfList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveVendor_non_compilableByParent_idSelfList(String fn, SubQuery<Vendor_non_compilableCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfList(cb.query()); String prpp = keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "NON-COMPILABLE ID", "PARENT-ID", sqpp, "vendor_non_compilableByParent_idSelfList", rd, vl, prpp, op);
    }
    public abstract String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);
    public abstract String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     */
    public void setNon_compilable_id_IsNull() { regNon_compilable_id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     */
    public void setNon_compilable_id_IsNotNull() { regNon_compilable_id(CK_ISNN, DOBJ); }

    protected void regNon_compilable_id(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNon_compilable_id(), "NON-COMPILABLE ID"); }
    protected abstract ConditionValue getCValueNon_compilable_id();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNon_compilable_name_Equal(String non_compilable_name) {
        doSetNon_compilable_name_Equal(fRES(non_compilable_name));
    }

    protected void doSetNon_compilable_name_Equal(String non_compilable_name) {
        regNon_compilable_name(CK_EQ, non_compilable_name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNon_compilable_name_NotEqual(String non_compilable_name) {
        doSetNon_compilable_name_NotEqual(fRES(non_compilable_name));
    }

    protected void doSetNon_compilable_name_NotEqual(String non_compilable_name) {
        regNon_compilable_name(CK_NES, non_compilable_name);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_nameList The collection of non_compilable_name as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNon_compilable_name_InScope(Collection<String> non_compilable_nameList) {
        doSetNon_compilable_name_InScope(non_compilable_nameList);
    }

    public void doSetNon_compilable_name_InScope(Collection<String> non_compilable_nameList) {
        regINS(CK_INS, cTL(non_compilable_nameList), getCValueNon_compilable_name(), "NON COMPILABLE-NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_nameList The collection of non_compilable_name as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNon_compilable_name_NotInScope(Collection<String> non_compilable_nameList) {
        doSetNon_compilable_name_NotInScope(non_compilable_nameList);
    }

    public void doSetNon_compilable_name_NotInScope(Collection<String> non_compilable_nameList) {
        regINS(CK_NINS, cTL(non_compilable_nameList), getCValueNon_compilable_name(), "NON COMPILABLE-NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setNon_compilable_name_PrefixSearch(String non_compilable_name) {
        setNon_compilable_name_LikeSearch(non_compilable_name, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)} <br />
     * <pre>e.g. setNon_compilable_name_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param non_compilable_name The value of non_compilable_name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNon_compilable_name_LikeSearch(String non_compilable_name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(non_compilable_name), getCValueNon_compilable_name(), "NON COMPILABLE-NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNon_compilable_name_NotLikeSearch(String non_compilable_name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(non_compilable_name), getCValueNon_compilable_name(), "NON COMPILABLE-NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     */
    public void setNon_compilable_name_IsNull() { regNon_compilable_name(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     */
    public void setNon_compilable_name_IsNullOrEmpty() { regNon_compilable_name(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NON COMPILABLE-NAME: {varchar(64)}
     */
    public void setNon_compilable_name_IsNotNull() { regNon_compilable_name(CK_ISNN, DOBJ); }

    protected void regNon_compilable_name(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNon_compilable_name(), "NON COMPILABLE-NAME"); }
    protected abstract ConditionValue getCValueNon_compilable_name();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as equal. (NullAllowed: if null, no condition)
     */
    public void setParent_id_Equal(Integer parent_id) {
        doSetParent_id_Equal(parent_id);
    }

    protected void doSetParent_id_Equal(Integer parent_id) {
        regParent_id(CK_EQ, parent_id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setParent_id_GreaterThan(Integer parent_id) {
        regParent_id(CK_GT, parent_id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as lessThan. (NullAllowed: if null, no condition)
     */
    public void setParent_id_LessThan(Integer parent_id) {
        regParent_id(CK_LT, parent_id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setParent_id_GreaterEqual(Integer parent_id) {
        regParent_id(CK_GE, parent_id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setParent_id_LessEqual(Integer parent_id) {
        regParent_id(CK_LE, parent_id);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param minNumber The min number of parent_id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of parent_id. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setParent_id_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueParent_id(), "PARENT-ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_idList The collection of parent_id as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParent_id_InScope(Collection<Integer> parent_idList) {
        doSetParent_id_InScope(parent_idList);
    }

    protected void doSetParent_id_InScope(Collection<Integer> parent_idList) {
        regINS(CK_INS, cTL(parent_idList), getCValueParent_id(), "PARENT-ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_idList The collection of parent_id as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParent_id_NotInScope(Collection<Integer> parent_idList) {
        doSetParent_id_NotInScope(parent_idList);
    }

    protected void doSetParent_id_NotInScope(Collection<Integer> parent_idList) {
        regINS(CK_NINS, cTL(parent_idList), getCValueParent_id(), "PARENT-ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT-ID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
     * @param subQuery The sub-query of Vendor_non_compilableByParent_idSelf for 'in-scope'. (NotNull)
     */
    public void inScopeVendor_non_compilableByParent_idSelf(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepParent_id_InScopeRelation_Vendor_non_compilableByParent_idSelf(cb.query());
        registerInScopeRelation(cb.query(), "PARENT-ID", "NON-COMPILABLE ID", pp, "vendor_non_compilableByParent_idSelf");
    }
    public abstract String keepParent_id_InScopeRelation_Vendor_non_compilableByParent_idSelf(Vendor_non_compilableCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT-ID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
     * @param subQuery The sub-query of Vendor_non_compilableByParent_idSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendor_non_compilableByParent_idSelf(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepParent_id_NotInScopeRelation_Vendor_non_compilableByParent_idSelf(cb.query());
        registerNotInScopeRelation(cb.query(), "PARENT-ID", "NON-COMPILABLE ID", pp, "vendor_non_compilableByParent_idSelf");
    }
    public abstract String keepParent_id_NotInScopeRelation_Vendor_non_compilableByParent_idSelf(Vendor_non_compilableCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     */
    public void setParent_id_IsNull() { regParent_id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     */
    public void setParent_id_IsNotNull() { regParent_id(CK_ISNN, DOBJ); }

    protected void regParent_id(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueParent_id(), "PARENT-ID"); }
    protected abstract ConditionValue getCValueParent_id();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as equal. (NullAllowed: if null, no condition)
     */
    public void setNextParentid_Equal(Integer nextParentid) {
        doSetNextParentid_Equal(nextParentid);
    }

    protected void doSetNextParentid_Equal(Integer nextParentid) {
        regNextParentid(CK_EQ, nextParentid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNextParentid_GreaterThan(Integer nextParentid) {
        regNextParentid(CK_GT, nextParentid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNextParentid_LessThan(Integer nextParentid) {
        regNextParentid(CK_LT, nextParentid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNextParentid_GreaterEqual(Integer nextParentid) {
        regNextParentid(CK_GE, nextParentid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNextParentid_LessEqual(Integer nextParentid) {
        regNextParentid(CK_LE, nextParentid);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param minNumber The min number of nextParentid. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextParentid. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNextParentid_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNextParentid(), "Next_ParentID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentidList The collection of nextParentid as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextParentid_InScope(Collection<Integer> nextParentidList) {
        doSetNextParentid_InScope(nextParentidList);
    }

    protected void doSetNextParentid_InScope(Collection<Integer> nextParentidList) {
        regINS(CK_INS, cTL(nextParentidList), getCValueNextParentid(), "Next_ParentID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentidList The collection of nextParentid as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextParentid_NotInScope(Collection<Integer> nextParentidList) {
        doSetNextParentid_NotInScope(nextParentidList);
    }

    protected void doSetNextParentid_NotInScope(Collection<Integer> nextParentidList) {
        regINS(CK_NINS, cTL(nextParentidList), getCValueNextParentid(), "Next_ParentID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select Next_ParentID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
     * @param subQuery The sub-query of Vendor_non_compilableByNextParentidSelf for 'in-scope'. (NotNull)
     */
    public void inScopeVendor_non_compilableByNextParentidSelf(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextParentid_InScopeRelation_Vendor_non_compilableByNextParentidSelf(cb.query());
        registerInScopeRelation(cb.query(), "Next_ParentID", "NON-COMPILABLE ID", pp, "vendor_non_compilableByNextParentidSelf");
    }
    public abstract String keepNextParentid_InScopeRelation_Vendor_non_compilableByNextParentidSelf(Vendor_non_compilableCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select Next_ParentID from VENDOR-NON COMPILABLE where ...)} <br />
     * VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
     * @param subQuery The sub-query of Vendor_non_compilableByNextParentidSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendor_non_compilableByNextParentidSelf(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextParentid_NotInScopeRelation_Vendor_non_compilableByNextParentidSelf(cb.query());
        registerNotInScopeRelation(cb.query(), "Next_ParentID", "NON-COMPILABLE ID", pp, "vendor_non_compilableByNextParentidSelf");
    }
    public abstract String keepNextParentid_NotInScopeRelation_Vendor_non_compilableByNextParentidSelf(Vendor_non_compilableCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     */
    public void setNextParentid_IsNull() { regNextParentid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     */
    public void setNextParentid_IsNotNull() { regNextParentid(CK_ISNN, DOBJ); }

    protected void regNextParentid(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNextParentid(), "Next_ParentID"); }
    protected abstract ConditionValue getCValueNextParentid();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor_non_compilableCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, Vendor_non_compilableCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor_non_compilableCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, Vendor_non_compilableCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor_non_compilableCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, Vendor_non_compilableCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor_non_compilableCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, Vendor_non_compilableCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor_non_compilableCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, Vendor_non_compilableCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor_non_compilableCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, Vendor_non_compilableCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(Vendor_non_compilableCQ sq);

    protected Vendor_non_compilableCB xcreateScalarConditionCB() {
        Vendor_non_compilableCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected Vendor_non_compilableCB xcreateScalarConditionPartitionByCB() {
        Vendor_non_compilableCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<Vendor_non_compilableCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "NON-COMPILABLE ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(Vendor_non_compilableCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<Vendor_non_compilableCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(Vendor_non_compilableCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NON-COMPILABLE ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(Vendor_non_compilableCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(Vendor_non_compilableCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<Vendor_non_compilableCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(Vendor_non_compilableCQ sq);

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
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return conditionValue; // non escape
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new PostgreSQLMatchLikeSearch();
    }

    @Override
    protected org.seasar.dbflute.dbway.ExtensionOperand xgetPostgreSQLMatchOperand() {
        return DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                          Compatible
    //                                                                          ==========
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected Vendor_non_compilableCB newMyCB() {
        return new Vendor_non_compilableCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return Vendor_non_compilableCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
