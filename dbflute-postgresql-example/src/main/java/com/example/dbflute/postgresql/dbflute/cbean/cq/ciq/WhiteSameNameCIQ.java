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
 * The condition-query for in-line of white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSameNameCIQ extends AbstractBsWhiteSameNameCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteSameNameCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteSameNameCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteSameNameCQ myCQ) {
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
    protected ConditionValue getCValueSameNameId() { return _myCQ.getSameNameId(); }
    public String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSameNameId_InScopeRelation_WhiteSameNameRefList(WhiteSameNameRefCQ sq)
    { return _myCQ.keepSameNameId_InScopeRelation_WhiteSameNameRefList(sq); }
    public String keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(WhiteSameNameRefCQ sq)
    { return _myCQ.keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(sq); }
    public String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueSameNameName() { return _myCQ.getSameNameName(); }
    protected ConditionValue getCValueSameNameInteger() { return _myCQ.getSameNameInteger(); }
    protected ConditionValue getCValueNextSchemaProductId() { return _myCQ.getNextSchemaProductId(); }
    public String keepNextSchemaProductId_InScopeRelation_NextSchemaProduct(NextSchemaProductCQ sq)
    { return _myCQ.keepNextSchemaProductId_InScopeRelation_NextSchemaProduct(sq); }
    public String keepNextSchemaProductId_NotInScopeRelation_NextSchemaProduct(NextSchemaProductCQ sq)
    { return _myCQ.keepNextSchemaProductId_NotInScopeRelation_NextSchemaProduct(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteSameNameCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteSameNameCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteSameNameCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteSameNameCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteSameNameCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteSameNameCB.class.getName(); }
    protected String xinCQ() { return WhiteSameNameCQ.class.getName(); }
}
