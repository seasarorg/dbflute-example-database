package com.example.dbflute.postgresql.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.bs.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSameNameRefCIQ extends AbstractBsWhiteSameNameRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteSameNameRefCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteSameNameRefCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteSameNameRefCQ myCQ) {
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
    protected ConditionValue getCValueSameNameRefId() { return _myCQ.getSameNameRefId(); }
    protected ConditionValue getCValueSameNameId() { return _myCQ.getSameNameId(); }
    public String keepSameNameId_InScopeRelation_WhiteSameName(WhiteSameNameCQ sq)
    { return _myCQ.keepSameNameId_InScopeRelation_WhiteSameName(sq); }
    public String keepSameNameId_NotInScopeRelation_WhiteSameName(WhiteSameNameCQ sq)
    { return _myCQ.keepSameNameId_NotInScopeRelation_WhiteSameName(sq); }
    protected ConditionValue getCValueNextSameNameId() { return _myCQ.getNextSameNameId(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteSameNameRefCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteSameNameRefCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteSameNameRefCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteSameNameRefCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteSameNameRefCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteSameNameRefCB.class.getName(); }
    protected String xinCQ() { return WhiteSameNameRefCQ.class.getName(); }
}
