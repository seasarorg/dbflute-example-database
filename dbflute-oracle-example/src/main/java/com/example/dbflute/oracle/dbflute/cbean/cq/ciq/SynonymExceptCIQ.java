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
 * The condition-query for in-line of SYNONYM_EXCEPT.
 * @author oracleman
 */
public class SynonymExceptCIQ extends AbstractBsSynonymExceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSynonymExceptCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SynonymExceptCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSynonymExceptCQ myCQ) {
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
    protected ConditionValue getCValueExceptId() { return _myCQ.getExceptId(); }
    public String keepExceptId_ExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepExceptId_NotExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepExceptId_InScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ sq)
    { return _myCQ.keepExceptId_InScopeRelation_SynonymRefExceptList(sq); }
    public String keepExceptId_NotInScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ sq)
    { return _myCQ.keepExceptId_NotInScopeRelation_SynonymRefExceptList(sq); }
    public String keepExceptId_SpecifyDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepExceptId_QueryDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueExceptName() { return _myCQ.getExceptName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(SynonymExceptCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SynonymExceptCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SynonymExceptCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SynonymExceptCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(SynonymExceptCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SynonymExceptCB.class.getName(); }
    protected String xinCQ() { return SynonymExceptCQ.class.getName(); }
}
