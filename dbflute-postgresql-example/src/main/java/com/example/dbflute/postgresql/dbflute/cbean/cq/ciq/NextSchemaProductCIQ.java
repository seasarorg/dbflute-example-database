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
 * The condition-query for in-line of next_schema_product.
 * @author DBFlute(AutoGenerator)
 */
public class NextSchemaProductCIQ extends AbstractBsNextSchemaProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsNextSchemaProductCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public NextSchemaProductCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsNextSchemaProductCQ myCQ) {
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
    protected ConditionValue getCValueProductId() { return _myCQ.getProductId(); }
    public String keepProductId_ExistsReferrer_WhiteSameNameList(WhiteSameNameCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WhiteSameNameList(WhiteSameNameCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_InScopeRelation_WhiteSameNameList(WhiteSameNameCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_WhiteSameNameList(sq); }
    public String keepProductId_NotInScopeRelation_WhiteSameNameList(WhiteSameNameCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_WhiteSameNameList(sq); }
    public String keepProductId_SpecifyDerivedReferrer_WhiteSameNameList(WhiteSameNameCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WhiteSameNameList(WhiteSameNameCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WhiteSameNameListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueProductName() { return _myCQ.getProductName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(NextSchemaProductCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(NextSchemaProductCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(NextSchemaProductCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(NextSchemaProductCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(NextSchemaProductCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return NextSchemaProductCB.class.getName(); }
    protected String xinCQ() { return NextSchemaProductCQ.class.getName(); }
}
