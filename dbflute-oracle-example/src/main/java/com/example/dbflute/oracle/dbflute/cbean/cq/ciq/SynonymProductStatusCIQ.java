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
 * The condition-query for in-line of SYNONYM_PRODUCT_STATUS.
 * @author oracleman
 */
public class SynonymProductStatusCIQ extends AbstractBsSynonymProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSynonymProductStatusCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SynonymProductStatusCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSynonymProductStatusCQ myCQ) {
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
    protected ConditionValue getCValueProductStatusCode() { return _myCQ.getProductStatusCode(); }
    public String keepProductStatusCode_ExistsReferrer_SynonymProductList(SynonymProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductStatusCode_NotExistsReferrer_SynonymProductList(SynonymProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductStatusCode_InScopeRelation_SynonymProductList(SynonymProductCQ sq)
    { return _myCQ.keepProductStatusCode_InScopeRelation_SynonymProductList(sq); }
    public String keepProductStatusCode_NotInScopeRelation_SynonymProductList(SynonymProductCQ sq)
    { return _myCQ.keepProductStatusCode_NotInScopeRelation_SynonymProductList(sq); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_SynonymProductList(SynonymProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_SynonymProductList(SynonymProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_SynonymProductListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueProductStatusName() { return _myCQ.getProductStatusName(); }
    protected ConditionValue getCValueDisplayOrder() { return _myCQ.getDisplayOrder(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(SynonymProductStatusCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SynonymProductStatusCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SynonymProductStatusCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SynonymProductStatusCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(SynonymProductStatusCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SynonymProductStatusCB.class.getName(); }
    protected String xinCQ() { return SynonymProductStatusCQ.class.getName(); }
}
