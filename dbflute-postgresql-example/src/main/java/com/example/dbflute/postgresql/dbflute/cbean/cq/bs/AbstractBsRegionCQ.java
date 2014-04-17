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
 * The abstract condition-query of region.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsRegionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsRegionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "region";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     * @param regionId The value of regionId as equal. (NullAllowed: if null, no condition)
     */
    public void setRegionId_Equal(Integer regionId) {
        doSetRegionId_Equal(regionId);
    }

    protected void doSetRegionId_Equal(Integer regionId) {
        regRegionId(CK_EQ, regionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     * @param regionId The value of regionId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegionId_GreaterThan(Integer regionId) {
        regRegionId(CK_GT, regionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     * @param regionId The value of regionId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegionId_LessThan(Integer regionId) {
        regRegionId(CK_LT, regionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     * @param regionId The value of regionId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegionId_GreaterEqual(Integer regionId) {
        regRegionId(CK_GE, regionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     * @param regionId The value of regionId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegionId_LessEqual(Integer regionId) {
        regRegionId(CK_LE, regionId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of regionId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of regionId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRegionId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRegionId(), "region_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     * @param regionIdList The collection of regionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_InScope(Collection<Integer> regionIdList) {
        doSetRegionId_InScope(regionIdList);
    }

    protected void doSetRegionId_InScope(Collection<Integer> regionIdList) {
        regINS(CK_INS, cTL(regionIdList), getCValueRegionId(), "region_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     * @param regionIdList The collection of regionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_NotInScope(Collection<Integer> regionIdList) {
        doSetRegionId_NotInScope(regionIdList);
    }

    protected void doSetRegionId_NotInScope(Collection<Integer> regionIdList) {
        regINS(CK_NINS, cTL(regionIdList), getCValueRegionId(), "region_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select region_id from member_address where ...)} <br />
     * (会員住所情報)member_address by region_id, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    public void existsMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepRegionId_ExistsReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "region_id", "region_id", pp, "memberAddressList");
    }
    public abstract String keepRegionId_ExistsReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select region_id from member_address where ...)} <br />
     * (会員住所情報)member_address by region_id, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of RegionId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepRegionId_NotExistsReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "region_id", "region_id", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotExistsReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select region_id from member_address where ...)} <br />
     * (会員住所情報)member_address by region_id, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepRegionId_InScopeRelation_MemberAddressList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "region_id", "region_id", pp, "memberAddressList");
    }
    public abstract String keepRegionId_InScopeRelation_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select region_id from member_address where ...)} <br />
     * (会員住所情報)member_address by region_id, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepRegionId_NotInScopeRelation_MemberAddressList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "region_id", "region_id", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotInScopeRelation_MemberAddressList(MemberAddressCQ sq);

    public void xsderiveMemberAddressList(String fn, SubQuery<MemberAddressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepRegionId_SpecifyDerivedReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "region_id", "region_id", pp, "memberAddressList", al, op);
    }
    public abstract String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from member_address where ...)} <br />
     * (会員住所情報)member_address by region_id, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberAddressList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberAddressCB> derivedMemberAddressList() {
        return xcreateQDRFunctionMemberAddressList();
    }
    protected HpQDRFunction<MemberAddressCB> xcreateQDRFunctionMemberAddressList() {
        return new HpQDRFunction<MemberAddressCB>(new HpQDRSetupper<MemberAddressCB>() {
            public void setup(String fn, SubQuery<MemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMemberAddressList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMemberAddressList(String fn, SubQuery<MemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepRegionId_QueryDerivedReferrer_MemberAddressList(cb.query()); // for saving query-value.
        String prpp = keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "region_id", "region_id", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ sq);
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     */
    public void setRegionId_IsNull() { regRegionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (地域ID)region_id: {PK, NotNull, int4(10)}
     */
    public void setRegionId_IsNotNull() { regRegionId(CK_ISNN, DOBJ); }

    protected void regRegionId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegionId(), "region_id"); }
    protected abstract ConditionValue getCValueRegionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (地域名称)region_name: {NotNull, varchar(50)}
     * @param regionName The value of regionName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_Equal(String regionName) {
        doSetRegionName_Equal(fRES(regionName));
    }

    protected void doSetRegionName_Equal(String regionName) {
        regRegionName(CK_EQ, regionName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (地域名称)region_name: {NotNull, varchar(50)}
     * @param regionName The value of regionName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_NotEqual(String regionName) {
        doSetRegionName_NotEqual(fRES(regionName));
    }

    protected void doSetRegionName_NotEqual(String regionName) {
        regRegionName(CK_NES, regionName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (地域名称)region_name: {NotNull, varchar(50)}
     * @param regionNameList The collection of regionName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_InScope(Collection<String> regionNameList) {
        doSetRegionName_InScope(regionNameList);
    }

    public void doSetRegionName_InScope(Collection<String> regionNameList) {
        regINS(CK_INS, cTL(regionNameList), getCValueRegionName(), "region_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (地域名称)region_name: {NotNull, varchar(50)}
     * @param regionNameList The collection of regionName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_NotInScope(Collection<String> regionNameList) {
        doSetRegionName_NotInScope(regionNameList);
    }

    public void doSetRegionName_NotInScope(Collection<String> regionNameList) {
        regINS(CK_NINS, cTL(regionNameList), getCValueRegionName(), "region_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)region_name: {NotNull, varchar(50)}
     * @param regionName The value of regionName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_PrefixSearch(String regionName) {
        setRegionName_LikeSearch(regionName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)region_name: {NotNull, varchar(50)} <br />
     * <pre>e.g. setRegionName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regionName The value of regionName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegionName_LikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regionName), getCValueRegionName(), "region_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)region_name: {NotNull, varchar(50)}
     * @param regionName The value of regionName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegionName_NotLikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regionName), getCValueRegionName(), "region_name", likeSearchOption);
    }

    protected void regRegionName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegionName(), "region_name"); }
    protected abstract ConditionValue getCValueRegionName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), RegionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(RegionCQ sq);

    protected RegionCB xcreateScalarConditionCB() {
        RegionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected RegionCB xcreateScalarConditionPartitionByCB() {
        RegionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RegionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = new RegionCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "region_id";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RegionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RegionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(RegionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = new RegionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "region_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RegionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<RegionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        RegionCB cb = new RegionCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RegionCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<RegionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        RegionCB cb = new RegionCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(RegionCQ sq);

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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected RegionCB newMyCB() {
        return new RegionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return RegionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
