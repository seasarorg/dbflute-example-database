package com.example.dbflute.db2.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.db2.dbflute.cbean.*;
import com.example.dbflute.db2.dbflute.cbean.cq.bs.*;
import com.example.dbflute.db2.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of ALIAS_EXCEPT.
 * @author DBFlute(AutoGenerator)
 */
public class AliasExceptCIQ extends AbstractBsAliasExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsAliasExceptCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AliasExceptCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsAliasExceptCQ myCQ) {
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
    protected ConditionValue getCValueExceptId() { return _myCQ.getExceptId(); }
    public String keepExceptId_ExistsReferrer_AliasRefExceptList(AliasRefExceptCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepExceptId_NotExistsReferrer_AliasRefExceptList(AliasRefExceptCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepExceptId_InScopeRelation_AliasRefExceptList(AliasRefExceptCQ sq)
    { return _myCQ.keepExceptId_InScopeRelation_AliasRefExceptList(sq); }
    public String keepExceptId_NotInScopeRelation_AliasRefExceptList(AliasRefExceptCQ sq)
    { return _myCQ.keepExceptId_NotInScopeRelation_AliasRefExceptList(sq); }
    public String keepExceptId_SpecifyDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepExceptId_QueryDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepExceptId_QueryDerivedReferrer_AliasRefExceptListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueExceptName() { return _myCQ.getExceptName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(AliasExceptCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(AliasExceptCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(AliasExceptCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(AliasExceptCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(AliasExceptCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return AliasExceptCB.class.getName(); }
    protected String xinCQ() { return AliasExceptCQ.class.getName(); }
}
