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
 * The condition-query for in-line of WHITE_REF_TARGET.
 * @author oracleman
 */
public class WhiteRefTargetCIQ extends AbstractBsWhiteRefTargetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteRefTargetCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteRefTargetCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteRefTargetCQ myCQ) {
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
    protected ConditionValue getCValueRefTargetId() { return _myCQ.getRefTargetId(); }
    protected ConditionValue getCValueTargetId() { return _myCQ.getTargetId(); }
    public String keepTargetId_InScopeRelation_WhiteTarget(WhiteTargetCQ sq)
    { return _myCQ.keepTargetId_InScopeRelation_WhiteTarget(sq); }
    public String keepTargetId_NotInScopeRelation_WhiteTarget(WhiteTargetCQ sq)
    { return _myCQ.keepTargetId_NotInScopeRelation_WhiteTarget(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(WhiteRefTargetCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteRefTargetCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteRefTargetCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteRefTargetCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteRefTargetCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteRefTargetCB.class.getName(); }
    protected String xinCQ() { return WhiteRefTargetCQ.class.getName(); }
}
