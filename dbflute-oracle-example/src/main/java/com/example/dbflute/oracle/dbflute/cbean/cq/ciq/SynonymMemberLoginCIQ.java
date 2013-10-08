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
 * The condition-query for in-line of SYNONYM_MEMBER_LOGIN.
 * @author oracleman
 */
public class SynonymMemberLoginCIQ extends AbstractBsSynonymMemberLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSynonymMemberLoginCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SynonymMemberLoginCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSynonymMemberLoginCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
    protected ConditionValue getCValueMemberLoginId() { return _myCQ.getMemberLoginId(); }
    protected ConditionValue getCValueMemberId() { return _myCQ.getMemberId(); }
    public String keepMemberId_InScopeRelation_MemberVendorSynonym(MemberVendorSynonymCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberVendorSynonym(sq); }
    public String keepMemberId_NotInScopeRelation_MemberVendorSynonym(MemberVendorSynonymCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberVendorSynonym(sq); }
    protected ConditionValue getCValueLoginDatetime() { return _myCQ.getLoginDatetime(); }
    protected ConditionValue getCValueMobileLoginFlg() { return _myCQ.getMobileLoginFlg(); }
    protected ConditionValue getCValueLoginMemberStatusCode() { return _myCQ.getLoginMemberStatusCode(); }
    public String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq)
    { return _myCQ.keepLoginMemberStatusCode_InScopeRelation_MemberStatus(sq); }
    public String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq)
    { return _myCQ.keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(SynonymMemberLoginCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SynonymMemberLoginCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SynonymMemberLoginCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SynonymMemberLoginCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(SynonymMemberLoginCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SynonymMemberLoginCB.class.getName(); }
    protected String xinCQ() { return SynonymMemberLoginCQ.class.getName(); }
}
