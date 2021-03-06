package com.example.dbflute.tricky.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.tricky.dbflute.cbean.*;
import com.example.dbflute.tricky.dbflute.cbean.cq.bs.*;
import com.example.dbflute.tricky.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryCIQ extends AbstractBsProductCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsProductCategoryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ProductCategoryCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsProductCategoryCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueProductCategoryCode() { return _myCQ.getProductCategoryCode(); }
    protected ConditionValue getCValueProductCategoryName() { return _myCQ.getProductCategoryName(); }
    protected ConditionValue getCValueParentCategoryCode() { return _myCQ.getParentCategoryCode(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(ProductCategoryCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ProductCategoryCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ProductCategoryCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ProductCategoryCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(ProductCategoryCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ProductCategoryCB.class.getName(); }
    protected String xinCQ() { return ProductCategoryCQ.class.getName(); }
}
