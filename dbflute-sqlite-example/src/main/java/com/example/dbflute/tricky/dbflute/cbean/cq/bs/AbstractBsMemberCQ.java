package com.example.dbflute.tricky.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.tricky.dbflute.allcommon.*;
import com.example.dbflute.tricky.dbflute.cbean.*;
import com.example.dbflute.tricky.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
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
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberAddressList(MemberAddressCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberLoginList</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberLoginList for 'exists'. (NotNull)
     */
    public void existsMemberLoginList(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberLoginList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberLoginList(MemberLoginCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_SECURITY where ...)} <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberSecurityAsOne</span>(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberSecurityAsOne for 'exists'. (NotNull)
     */
    public void existsMemberSecurityAsOne(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberSecurityAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberSecurityAsOne");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberServiceList</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberServiceList for 'exists'. (NotNull)
     */
    public void existsMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberServiceList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberServiceList(MemberServiceCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberWithdrawalAsOne</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberWithdrawalAsOne for 'exists'. (NotNull)
     */
    public void existsMemberWithdrawalAsOne(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberWithdrawalAsOne");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsPurchaseList</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchaseList for 'exists'. (NotNull)
     */
    public void existsPurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_ExistsReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepMemberId_ExistsReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberAddressList(MemberAddressCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberLoginList</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsMemberLoginList(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberLoginList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberLoginList(MemberLoginCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_SECURITY where ...)} <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberSecurityAsOne</span>(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberSecurityAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMemberSecurityAsOne(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberSecurityAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberSecurityAsOne");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberServiceList</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberServiceList for 'not exists'. (NotNull)
     */
    public void notExistsMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberServiceList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberServiceList(MemberServiceCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberWithdrawalAsOne</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberWithdrawalAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMemberWithdrawalAsOne(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberWithdrawalAsOne");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsPurchaseList</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_PurchaseList for 'not exists'. (NotNull)
     */
    public void notExistsPurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotExistsReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepMemberId_NotExistsReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberAddressList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList");
    }
    public abstract String keepMemberId_InScopeRelation_MemberAddressList(MemberAddressCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * @param subQuery The sub-query of MemberLoginList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberLoginList(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberLoginList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList");
    }
    public abstract String keepMemberId_InScopeRelation_MemberLoginList(MemberLoginCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_SECURITY where ...)} <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param subQuery The sub-query of MemberSecurityAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeMemberSecurityAsOne(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberSecurityAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberSecurityAsOne");
    }
    public abstract String keepMemberId_InScopeRelation_MemberSecurityAsOne(MemberSecurityCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @param subQuery The sub-query of MemberServiceList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberServiceList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceList");
    }
    public abstract String keepMemberId_InScopeRelation_MemberServiceList(MemberServiceCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param subQuery The sub-query of MemberWithdrawalAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeMemberWithdrawalAsOne(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_MemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberWithdrawalAsOne");
    }
    public abstract String keepMemberId_InScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * @param subQuery The sub-query of PurchaseList for 'in-scope'. (NotNull)
     */
    public void inScopePurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_PurchaseList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepMemberId_InScopeRelation_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberAddressList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberAddressList(MemberAddressCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * @param subQuery The sub-query of MemberLoginList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberLoginList(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberLoginList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberLoginList(MemberLoginCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_SECURITY where ...)} <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param subQuery The sub-query of MemberSecurityAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberSecurityAsOne(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberSecurityAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberSecurityAsOne");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberSecurityAsOne(MemberSecurityCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @param subQuery The sub-query of MemberServiceList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberServiceList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceList");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberServiceList(MemberServiceCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param subQuery The sub-query of MemberWithdrawalAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberWithdrawalAsOne(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberWithdrawalAsOne");
    }
    public abstract String keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * @param subQuery The sub-query of PurchaseList for 'not in-scope'. (NotNull)
     */
    public void notInScopePurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_PurchaseList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepMemberId_NotInScopeRelation_PurchaseList(PurchaseCQ subQuery);

    public void xsderiveMemberAddressList(String function, SubQuery<MemberAddressCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ subQuery);

    public void xsderiveMemberLoginList(String function, SubQuery<MemberLoginCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_MemberLoginList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ subQuery);

    public void xsderiveMemberServiceList(String function, SubQuery<MemberServiceCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_MemberServiceList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberServiceList(MemberServiceCQ subQuery);

    public void xsderivePurchaseList(String function, SubQuery<PurchaseCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_SpecifyDerivedReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList", aliasName, option);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
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
            public void setup(String function, SubQuery<MemberAddressCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberAddressList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberAddressList(String function, SubQuery<MemberAddressCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberAddressCB>", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_MemberAddressList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberAddressList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_LOGIN where ...)} <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberLoginList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberLoginCB> derivedMemberLoginList() {
        return xcreateQDRFunctionMemberLoginList();
    }
    protected HpQDRFunction<MemberLoginCB> xcreateQDRFunctionMemberLoginList() {
        return new HpQDRFunction<MemberLoginCB>(new HpQDRSetupper<MemberLoginCB>() {
            public void setup(String function, SubQuery<MemberLoginCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberLoginList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberLoginList(String function, SubQuery<MemberLoginCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_MemberLoginList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberLoginList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_SERVICE where ...)} <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberServiceList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberServiceCB> derivedMemberServiceList() {
        return xcreateQDRFunctionMemberServiceList();
    }
    protected HpQDRFunction<MemberServiceCB> xcreateQDRFunctionMemberServiceList() {
        return new HpQDRFunction<MemberServiceCB>(new HpQDRSetupper<MemberServiceCB>() {
            public void setup(String function, SubQuery<MemberServiceCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberServiceList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberServiceList(String function, SubQuery<MemberServiceCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_MemberServiceList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_MemberServiceListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "memberServiceList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberServiceList(MemberServiceCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberServiceListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from PURCHASE where ...)} <br />
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedPurchaseList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PurchaseCB> derivedPurchaseList() {
        return xcreateQDRFunctionPurchaseList();
    }
    protected HpQDRFunction<PurchaseCB> xcreateQDRFunctionPurchaseList() {
        return new HpQDRFunction<PurchaseCB>(new HpQDRSetupper<PurchaseCB>() {
            public void setup(String function, SubQuery<PurchaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderivePurchaseList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderivePurchaseList(String function, SubQuery<PurchaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_QueryDerivedReferrer_PurchaseList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMemberId_QueryDerivedReferrer_PurchaseListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "purchaseList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_PurchaseList(PurchaseCQ subQuery);
    public abstract String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey k, Object v) { regQ(k, v, getCValueMemberId(), "MEMBER_ID"); }
    abstract protected ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberName The value of memberName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberName The value of memberName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotEqual(String memberName) {
        doSetMemberName_NotEqual(fRES(memberName));
    }

    protected void doSetMemberName_NotEqual(String memberName) {
        regMemberName(CK_NES, memberName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberNameList The collection of memberName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_InScope(Collection<String> memberNameList) {
        doSetMemberName_InScope(memberNameList);
    }

    public void doSetMemberName_InScope(Collection<String> memberNameList) {
        regINS(CK_INS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberNameList The collection of memberName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotInScope(Collection<String> memberNameList) {
        doSetMemberName_NotInScope(memberNameList);
    }

    public void doSetMemberName_NotInScope(Collection<String> memberNameList) {
        regINS(CK_NINS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberName The value of memberName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        setMemberName_LikeSearch(memberName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    protected void regMemberName(ConditionKey k, Object v) { regQ(k, v, getCValueMemberName(), "MEMBER_NAME"); }
    abstract protected ConditionValue getCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccount The value of memberAccount as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_Equal(String memberAccount) {
        doSetMemberAccount_Equal(fRES(memberAccount));
    }

    /**
     * Equal(=). As the empty-string. And OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     */
    public void setMemberAccount_Equal_EmptyString() {
        doSetMemberAccount_Equal("");
    }

    protected void doSetMemberAccount_Equal(String memberAccount) {
        regMemberAccount(CK_EQ, memberAccount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccount The value of memberAccount as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_NotEqual(String memberAccount) {
        doSetMemberAccount_NotEqual(fRES(memberAccount));
    }

    /**
     * NotEqual(&lt;&gt;). As the empty-string. And OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     */
    public void setMemberAccount_NotEqual_EmptyString() {
        doSetMemberAccount_NotEqual("");
    }

    protected void doSetMemberAccount_NotEqual(String memberAccount) {
        regMemberAccount(CK_NES, memberAccount);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccountList The collection of memberAccount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_InScope(Collection<String> memberAccountList) {
        doSetMemberAccount_InScope(memberAccountList);
    }

    public void doSetMemberAccount_InScope(Collection<String> memberAccountList) {
        regINS(CK_INS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccountList The collection of memberAccount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_NotInScope(Collection<String> memberAccountList) {
        doSetMemberAccount_NotInScope(memberAccountList);
    }

    public void doSetMemberAccount_NotInScope(Collection<String> memberAccountList) {
        regINS(CK_NINS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccount The value of memberAccount as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_PrefixSearch(String memberAccount) {
        setMemberAccount_LikeSearch(memberAccount, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberAccount_LikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberAccount_NotLikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    protected void regMemberAccount(ConditionKey k, Object v) { regQ(k, v, getCValueMemberAccount(), "MEMBER_ACCOUNT"); }
    abstract protected ConditionValue getCValueMemberAccount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As ProvisionalMember (PRV). And OnlyOnceRegistered. <br />
     * Provisional Member
     */
    public void setMemberStatusCode_Equal_ProvisionalMember() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.ProvisionalMember);
    }

    /**
     * Equal(=). As FormalizedMember (FML). And OnlyOnceRegistered. <br />
     * Formalized Member
     */
    public void setMemberStatusCode_Equal_FormalizedMember() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.FormalizedMember);
    }

    /**
     * Equal(=). As WithdrawalMember (WDL). And OnlyOnceRegistered. <br />
     * Withdrawal Member
     */
    public void setMemberStatusCode_Equal_WithdrawalMember() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.WithdrawalMember);
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, memberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As ProvisionalMember (PRV). And OnlyOnceRegistered. <br />
     * Provisional Member
     */
    public void setMemberStatusCode_NotEqual_ProvisionalMember() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.ProvisionalMember);
    }

    /**
     * NotEqual(&lt;&gt;). As FormalizedMember (FML). And OnlyOnceRegistered. <br />
     * Formalized Member
     */
    public void setMemberStatusCode_NotEqual_FormalizedMember() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.FormalizedMember);
    }

    /**
     * NotEqual(&lt;&gt;). As WithdrawalMember (WDL). And OnlyOnceRegistered. <br />
     * Withdrawal Member
     */
    public void setMemberStatusCode_NotEqual_WithdrawalMember() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.WithdrawalMember);
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, memberStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_InScope(cTStrL(cdefList));
    }

    public void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'in-scope'. (NotNull)
     */
    public void inScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery<MemberStatusCB>", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberStatusCode_InScopeRelation_MemberStatus(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", subQueryPropertyName, "memberStatus");
    }
    public abstract String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery<MemberStatusCB>", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberStatusCode_NotInScopeRelation_MemberStatus(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", subQueryPropertyName, "memberStatus");
    }
    public abstract String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ subQuery);

    protected void regMemberStatusCode(ConditionKey k, Object v) { regQ(k, v, getCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    abstract protected ConditionValue getCValueMemberStatusCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_Equal(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_EQ,  formalizedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_GreaterThan(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_GT,  formalizedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_LessThan(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_LT,  formalizedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_GreaterEqual(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_GE,  formalizedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_LessEqual(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_LE, formalizedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * <pre>e.g. setFormalizedDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFormalizedDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueFormalizedDatetime(), "FORMALIZED_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of formalizedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of formalizedDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setFormalizedDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setFormalizedDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetimeList The collection of formalizedDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFormalizedDatetime_InScope(Collection<java.sql.Timestamp> formalizedDatetimeList) {
        doSetFormalizedDatetime_InScope(formalizedDatetimeList);
    }

    protected void doSetFormalizedDatetime_InScope(Collection<java.sql.Timestamp> formalizedDatetimeList) {
        regINS(CK_INS, cTL(formalizedDatetimeList), getCValueFormalizedDatetime(), "FORMALIZED_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetimeList The collection of formalizedDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFormalizedDatetime_NotInScope(Collection<java.sql.Timestamp> formalizedDatetimeList) {
        doSetFormalizedDatetime_NotInScope(formalizedDatetimeList);
    }

    protected void doSetFormalizedDatetime_NotInScope(Collection<java.sql.Timestamp> formalizedDatetimeList) {
        regINS(CK_NINS, cTL(formalizedDatetimeList), getCValueFormalizedDatetime(), "FORMALIZED_DATETIME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     */
    public void setFormalizedDatetime_IsNull() { regFormalizedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     */
    public void setFormalizedDatetime_IsNotNull() { regFormalizedDatetime(CK_ISNN, DOBJ); }

    protected void regFormalizedDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueFormalizedDatetime(), "FORMALIZED_DATETIME"); }
    abstract protected ConditionValue getCValueFormalizedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as equal. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_Equal(java.util.Date birthdate) {
        regBirthdate(CK_EQ,  fCTPD(birthdate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_GreaterThan(java.util.Date birthdate) {
        regBirthdate(CK_GT,  fCTPD(birthdate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_LessThan(java.util.Date birthdate) {
        regBirthdate(CK_LT,  fCTPD(birthdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_GreaterEqual(java.util.Date birthdate) {
        regBirthdate(CK_GE,  fCTPD(birthdate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_LessEqual(java.util.Date birthdate) {
        regBirthdate(CK_LE, fCTPD(birthdate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * <pre>e.g. setBirthdate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBirthdate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueBirthdate(), "BIRTHDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of birthdate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of birthdate. (NullAllowed: if null, no to-condition)
     */
    public void setBirthdate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setBirthdate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdateList The collection of birthdate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBirthdate_InScope(Collection<java.util.Date> birthdateList) {
        doSetBirthdate_InScope(birthdateList);
    }

    protected void doSetBirthdate_InScope(Collection<java.util.Date> birthdateList) {
        regINS(CK_INS, cTL(birthdateList), getCValueBirthdate(), "BIRTHDATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdateList The collection of birthdate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBirthdate_NotInScope(Collection<java.util.Date> birthdateList) {
        doSetBirthdate_NotInScope(birthdateList);
    }

    protected void doSetBirthdate_NotInScope(Collection<java.util.Date> birthdateList) {
        regINS(CK_NINS, cTL(birthdateList), getCValueBirthdate(), "BIRTHDATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     */
    public void setBirthdate_IsNull() { regBirthdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BIRTHDATE: {DATE(2000000000, 10)}
     */
    public void setBirthdate_IsNotNull() { regBirthdate(CK_ISNN, DOBJ); }

    protected void regBirthdate(ConditionKey k, Object v) { regQ(k, v, getCValueBirthdate(), "BIRTHDATE"); }
    abstract protected ConditionValue getCValueBirthdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberRegisterDatetime_Equal(java.sql.Timestamp memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_EQ,  memberRegisterDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberRegisterDatetime_GreaterThan(java.sql.Timestamp memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_GT,  memberRegisterDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberRegisterDatetime_LessThan(java.sql.Timestamp memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_LT,  memberRegisterDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberRegisterDatetime_GreaterEqual(java.sql.Timestamp memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_GE,  memberRegisterDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberRegisterDatetime_LessEqual(java.sql.Timestamp memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_LE, memberRegisterDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setMemberRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setMemberRegisterDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueMemberRegisterDatetime(), "MEMBER_REGISTER_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of memberRegisterDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of memberRegisterDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setMemberRegisterDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setMemberRegisterDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetimeList The collection of memberRegisterDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterDatetime_InScope(Collection<java.sql.Timestamp> memberRegisterDatetimeList) {
        doSetMemberRegisterDatetime_InScope(memberRegisterDatetimeList);
    }

    protected void doSetMemberRegisterDatetime_InScope(Collection<java.sql.Timestamp> memberRegisterDatetimeList) {
        regINS(CK_INS, cTL(memberRegisterDatetimeList), getCValueMemberRegisterDatetime(), "MEMBER_REGISTER_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetimeList The collection of memberRegisterDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterDatetime_NotInScope(Collection<java.sql.Timestamp> memberRegisterDatetimeList) {
        doSetMemberRegisterDatetime_NotInScope(memberRegisterDatetimeList);
    }

    protected void doSetMemberRegisterDatetime_NotInScope(Collection<java.sql.Timestamp> memberRegisterDatetimeList) {
        regINS(CK_NINS, cTL(memberRegisterDatetimeList), getCValueMemberRegisterDatetime(), "MEMBER_REGISTER_DATETIME");
    }

    protected void regMemberRegisterDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueMemberRegisterDatetime(), "MEMBER_REGISTER_DATETIME"); }
    abstract protected ConditionValue getCValueMemberRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUser The value of memberRegisterUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterUser_Equal(String memberRegisterUser) {
        doSetMemberRegisterUser_Equal(fRES(memberRegisterUser));
    }

    protected void doSetMemberRegisterUser_Equal(String memberRegisterUser) {
        regMemberRegisterUser(CK_EQ, memberRegisterUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUser The value of memberRegisterUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterUser_NotEqual(String memberRegisterUser) {
        doSetMemberRegisterUser_NotEqual(fRES(memberRegisterUser));
    }

    protected void doSetMemberRegisterUser_NotEqual(String memberRegisterUser) {
        regMemberRegisterUser(CK_NES, memberRegisterUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUserList The collection of memberRegisterUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterUser_InScope(Collection<String> memberRegisterUserList) {
        doSetMemberRegisterUser_InScope(memberRegisterUserList);
    }

    public void doSetMemberRegisterUser_InScope(Collection<String> memberRegisterUserList) {
        regINS(CK_INS, cTL(memberRegisterUserList), getCValueMemberRegisterUser(), "MEMBER_REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUserList The collection of memberRegisterUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterUser_NotInScope(Collection<String> memberRegisterUserList) {
        doSetMemberRegisterUser_NotInScope(memberRegisterUserList);
    }

    public void doSetMemberRegisterUser_NotInScope(Collection<String> memberRegisterUserList) {
        regINS(CK_NINS, cTL(memberRegisterUserList), getCValueMemberRegisterUser(), "MEMBER_REGISTER_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUser The value of memberRegisterUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterUser_PrefixSearch(String memberRegisterUser) {
        setMemberRegisterUser_LikeSearch(memberRegisterUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setMemberRegisterUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberRegisterUser The value of memberRegisterUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberRegisterUser_LikeSearch(String memberRegisterUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberRegisterUser), getCValueMemberRegisterUser(), "MEMBER_REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUser The value of memberRegisterUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberRegisterUser_NotLikeSearch(String memberRegisterUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberRegisterUser), getCValueMemberRegisterUser(), "MEMBER_REGISTER_USER", likeSearchOption);
    }

    protected void regMemberRegisterUser(ConditionKey k, Object v) { regQ(k, v, getCValueMemberRegisterUser(), "MEMBER_REGISTER_USER"); }
    abstract protected ConditionValue getCValueMemberRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcess The value of memberRegisterProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterProcess_Equal(String memberRegisterProcess) {
        doSetMemberRegisterProcess_Equal(fRES(memberRegisterProcess));
    }

    protected void doSetMemberRegisterProcess_Equal(String memberRegisterProcess) {
        regMemberRegisterProcess(CK_EQ, memberRegisterProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcess The value of memberRegisterProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterProcess_NotEqual(String memberRegisterProcess) {
        doSetMemberRegisterProcess_NotEqual(fRES(memberRegisterProcess));
    }

    protected void doSetMemberRegisterProcess_NotEqual(String memberRegisterProcess) {
        regMemberRegisterProcess(CK_NES, memberRegisterProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcessList The collection of memberRegisterProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterProcess_InScope(Collection<String> memberRegisterProcessList) {
        doSetMemberRegisterProcess_InScope(memberRegisterProcessList);
    }

    public void doSetMemberRegisterProcess_InScope(Collection<String> memberRegisterProcessList) {
        regINS(CK_INS, cTL(memberRegisterProcessList), getCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcessList The collection of memberRegisterProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterProcess_NotInScope(Collection<String> memberRegisterProcessList) {
        doSetMemberRegisterProcess_NotInScope(memberRegisterProcessList);
    }

    public void doSetMemberRegisterProcess_NotInScope(Collection<String> memberRegisterProcessList) {
        regINS(CK_NINS, cTL(memberRegisterProcessList), getCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcess The value of memberRegisterProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberRegisterProcess_PrefixSearch(String memberRegisterProcess) {
        setMemberRegisterProcess_LikeSearch(memberRegisterProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setMemberRegisterProcess_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberRegisterProcess The value of memberRegisterProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberRegisterProcess_LikeSearch(String memberRegisterProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberRegisterProcess), getCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcess The value of memberRegisterProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberRegisterProcess_NotLikeSearch(String memberRegisterProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberRegisterProcess), getCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS", likeSearchOption);
    }

    protected void regMemberRegisterProcess(ConditionKey k, Object v) { regQ(k, v, getCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS"); }
    abstract protected ConditionValue getCValueMemberRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberUpdateDatetime_Equal(java.sql.Timestamp memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_EQ,  memberUpdateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberUpdateDatetime_GreaterThan(java.sql.Timestamp memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_GT,  memberUpdateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberUpdateDatetime_LessThan(java.sql.Timestamp memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_LT,  memberUpdateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberUpdateDatetime_GreaterEqual(java.sql.Timestamp memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_GE,  memberUpdateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberUpdateDatetime_LessEqual(java.sql.Timestamp memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_LE, memberUpdateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setMemberUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberUpdateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberUpdateDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setMemberUpdateDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueMemberUpdateDatetime(), "MEMBER_UPDATE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of memberUpdateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of memberUpdateDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setMemberUpdateDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setMemberUpdateDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetimeList The collection of memberUpdateDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateDatetime_InScope(Collection<java.sql.Timestamp> memberUpdateDatetimeList) {
        doSetMemberUpdateDatetime_InScope(memberUpdateDatetimeList);
    }

    protected void doSetMemberUpdateDatetime_InScope(Collection<java.sql.Timestamp> memberUpdateDatetimeList) {
        regINS(CK_INS, cTL(memberUpdateDatetimeList), getCValueMemberUpdateDatetime(), "MEMBER_UPDATE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetimeList The collection of memberUpdateDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> memberUpdateDatetimeList) {
        doSetMemberUpdateDatetime_NotInScope(memberUpdateDatetimeList);
    }

    protected void doSetMemberUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> memberUpdateDatetimeList) {
        regINS(CK_NINS, cTL(memberUpdateDatetimeList), getCValueMemberUpdateDatetime(), "MEMBER_UPDATE_DATETIME");
    }

    protected void regMemberUpdateDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueMemberUpdateDatetime(), "MEMBER_UPDATE_DATETIME"); }
    abstract protected ConditionValue getCValueMemberUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUser The value of memberUpdateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateUser_Equal(String memberUpdateUser) {
        doSetMemberUpdateUser_Equal(fRES(memberUpdateUser));
    }

    protected void doSetMemberUpdateUser_Equal(String memberUpdateUser) {
        regMemberUpdateUser(CK_EQ, memberUpdateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUser The value of memberUpdateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateUser_NotEqual(String memberUpdateUser) {
        doSetMemberUpdateUser_NotEqual(fRES(memberUpdateUser));
    }

    protected void doSetMemberUpdateUser_NotEqual(String memberUpdateUser) {
        regMemberUpdateUser(CK_NES, memberUpdateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUserList The collection of memberUpdateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateUser_InScope(Collection<String> memberUpdateUserList) {
        doSetMemberUpdateUser_InScope(memberUpdateUserList);
    }

    public void doSetMemberUpdateUser_InScope(Collection<String> memberUpdateUserList) {
        regINS(CK_INS, cTL(memberUpdateUserList), getCValueMemberUpdateUser(), "MEMBER_UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUserList The collection of memberUpdateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateUser_NotInScope(Collection<String> memberUpdateUserList) {
        doSetMemberUpdateUser_NotInScope(memberUpdateUserList);
    }

    public void doSetMemberUpdateUser_NotInScope(Collection<String> memberUpdateUserList) {
        regINS(CK_NINS, cTL(memberUpdateUserList), getCValueMemberUpdateUser(), "MEMBER_UPDATE_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUser The value of memberUpdateUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateUser_PrefixSearch(String memberUpdateUser) {
        setMemberUpdateUser_LikeSearch(memberUpdateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setMemberUpdateUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberUpdateUser The value of memberUpdateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberUpdateUser_LikeSearch(String memberUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberUpdateUser), getCValueMemberUpdateUser(), "MEMBER_UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUser The value of memberUpdateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberUpdateUser_NotLikeSearch(String memberUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberUpdateUser), getCValueMemberUpdateUser(), "MEMBER_UPDATE_USER", likeSearchOption);
    }

    protected void regMemberUpdateUser(ConditionKey k, Object v) { regQ(k, v, getCValueMemberUpdateUser(), "MEMBER_UPDATE_USER"); }
    abstract protected ConditionValue getCValueMemberUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcess The value of memberUpdateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateProcess_Equal(String memberUpdateProcess) {
        doSetMemberUpdateProcess_Equal(fRES(memberUpdateProcess));
    }

    protected void doSetMemberUpdateProcess_Equal(String memberUpdateProcess) {
        regMemberUpdateProcess(CK_EQ, memberUpdateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcess The value of memberUpdateProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateProcess_NotEqual(String memberUpdateProcess) {
        doSetMemberUpdateProcess_NotEqual(fRES(memberUpdateProcess));
    }

    protected void doSetMemberUpdateProcess_NotEqual(String memberUpdateProcess) {
        regMemberUpdateProcess(CK_NES, memberUpdateProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcessList The collection of memberUpdateProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateProcess_InScope(Collection<String> memberUpdateProcessList) {
        doSetMemberUpdateProcess_InScope(memberUpdateProcessList);
    }

    public void doSetMemberUpdateProcess_InScope(Collection<String> memberUpdateProcessList) {
        regINS(CK_INS, cTL(memberUpdateProcessList), getCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcessList The collection of memberUpdateProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateProcess_NotInScope(Collection<String> memberUpdateProcessList) {
        doSetMemberUpdateProcess_NotInScope(memberUpdateProcessList);
    }

    public void doSetMemberUpdateProcess_NotInScope(Collection<String> memberUpdateProcessList) {
        regINS(CK_NINS, cTL(memberUpdateProcessList), getCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcess The value of memberUpdateProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberUpdateProcess_PrefixSearch(String memberUpdateProcess) {
        setMemberUpdateProcess_LikeSearch(memberUpdateProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setMemberUpdateProcess_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberUpdateProcess The value of memberUpdateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberUpdateProcess_LikeSearch(String memberUpdateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberUpdateProcess), getCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcess The value of memberUpdateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberUpdateProcess_NotLikeSearch(String memberUpdateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberUpdateProcess), getCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS", likeSearchOption);
    }

    protected void regMemberUpdateProcess(ConditionKey k, Object v) { regQ(k, v, getCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS"); }
    abstract protected ConditionValue getCValueMemberUpdateProcess();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey k, Object v) { regQ(k, v, getCValueVersionNo(), "VERSION_NO"); }
    abstract protected ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<MemberCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<MemberCB>(new HpSSQSetupper<MemberCB>() {
            public void setup(String function, SubQuery<MemberCB> subQuery, HpSSQOption<MemberCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<MemberCB> subQuery, String operand, HpSSQOption<MemberCB> option) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(MemberCQ subQuery);

    protected MemberCB xcreateScalarConditionCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected MemberCB xcreateScalarConditionPartitionByCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<MemberCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(MemberCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<MemberCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<MemberCB>(new HpQDRSetupper<MemberCB>() {
            public void setup(String function, SubQuery<MemberCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<MemberCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(MemberCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(MemberCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(MemberCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return MemberCB.class.getName(); }
    protected String xabCQ() { return MemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
