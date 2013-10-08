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
 * The condition-query for in-line of NEXT_SCHEMA_PRODUCT_STATUS.
 * @author oracleman
 */
public class NextSchemaProductStatusCIQ extends AbstractBsNextSchemaProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsNextSchemaProductStatusCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public NextSchemaProductStatusCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsNextSchemaProductStatusCQ myCQ) {
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
    protected ConditionValue getCValueProductStatusCode() { return _myCQ.getProductStatusCode(); }
    public String keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductStatusCode_ExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductStatusCode_InScopeRelation_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq)
    { return _myCQ.keepProductStatusCode_InScopeRelation_WhiteRefNextTargetList(sq); }
    public String keepProductStatusCode_InScopeRelation_NextSchemaProductList(NextSchemaProductCQ sq)
    { return _myCQ.keepProductStatusCode_InScopeRelation_NextSchemaProductList(sq); }
    public String keepProductStatusCode_NotInScopeRelation_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq)
    { return _myCQ.keepProductStatusCode_NotInScopeRelation_WhiteRefNextTargetList(sq); }
    public String keepProductStatusCode_NotInScopeRelation_NextSchemaProductList(NextSchemaProductCQ sq)
    { return _myCQ.keepProductStatusCode_NotInScopeRelation_NextSchemaProductList(sq); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueProductStatusName() { return _myCQ.getProductStatusName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(NextSchemaProductStatusCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(NextSchemaProductStatusCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(NextSchemaProductStatusCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(NextSchemaProductStatusCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(NextSchemaProductStatusCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return NextSchemaProductStatusCB.class.getName(); }
    protected String xinCQ() { return NextSchemaProductStatusCQ.class.getName(); }
}
