package com.example.dbflute.oracle.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.bs.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of SYNONYM_MEMBER.
 * @author oracleman
 */
public class SynonymMemberCIQ extends AbstractBsSynonymMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSynonymMemberCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SynonymMemberCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSynonymMemberCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueMemberId() { return _myCQ.getMemberId(); }
    public String keepMemberId_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_InScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_SynonymMemberLoginList(sq); }
    public String keepMemberId_InScopeRelation_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_SynonymMemberWithdrawalAsOne(sq); }
    public String keepMemberId_NotInScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_SynonymMemberLoginList(sq); }
    public String keepMemberId_NotInScopeRelation_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_SynonymMemberWithdrawalAsOne(sq); }
    public String keepMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueMemberName() { return _myCQ.getMemberName(); }
    protected ConditionValue getCValueMemberAccount() { return _myCQ.getMemberAccount(); }
    protected ConditionValue getCValueMemberStatusCode() { return _myCQ.getMemberStatusCode(); }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberStatus(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberStatus(sq); }
    protected ConditionValue getCValueFormalizedDatetime() { return _myCQ.getFormalizedDatetime(); }
    protected ConditionValue getCValueBirthdate() { return _myCQ.getBirthdate(); }
    protected ConditionValue getCValueRegisterDatetime() { return _myCQ.getRegisterDatetime(); }
    protected ConditionValue getCValueRegisterUser() { return _myCQ.getRegisterUser(); }
    protected ConditionValue getCValueRegisterProcess() { return _myCQ.getRegisterProcess(); }
    protected ConditionValue getCValueUpdateDatetime() { return _myCQ.getUpdateDatetime(); }
    protected ConditionValue getCValueUpdateUser() { return _myCQ.getUpdateUser(); }
    protected ConditionValue getCValueUpdateProcess() { return _myCQ.getUpdateProcess(); }
    protected ConditionValue getCValueVersionNo() { return _myCQ.getVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(SynonymMemberCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SynonymMemberCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SynonymMemberCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SynonymMemberCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(SynonymMemberCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SynonymMemberCB.class.getName(); }
    protected String xinCQ() { return SynonymMemberCQ.class.getName(); }
}
