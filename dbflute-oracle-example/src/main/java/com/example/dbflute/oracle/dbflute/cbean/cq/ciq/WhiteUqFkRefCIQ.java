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
 * The condition-query for in-line of WHITE_UQ_FK_REF.
 * @author oracleman
 */
public class WhiteUqFkRefCIQ extends AbstractBsWhiteUqFkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteUqFkRefCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteUqFkRefCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteUqFkRefCQ myCQ) {
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
    protected ConditionValue getCValueUqFkRefId() { return _myCQ.getUqFkRefId(); }
    protected ConditionValue getCValueFkToPkId() { return _myCQ.getFkToPkId(); }
    public String keepFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ sq)
    { return _myCQ.keepFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId(sq); }
    public String keepFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ sq)
    { return _myCQ.keepFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId(sq); }
    protected ConditionValue getCValueFkToUqCode() { return _myCQ.getFkToUqCode(); }
    public String keepFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ sq)
    { return _myCQ.keepFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode(sq); }
    public String keepFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ sq)
    { return _myCQ.keepFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode(sq); }
    protected ConditionValue getCValueCompoundUqFirstCode() { return _myCQ.getCompoundUqFirstCode(); }
    protected ConditionValue getCValueCompoundUqSecondCode() { return _myCQ.getCompoundUqSecondCode(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteUqFkRefCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteUqFkRefCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteUqFkRefCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteUqFkRefCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteUqFkRefCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteUqFkRefCB.class.getName(); }
    protected String xinCQ() { return WhiteUqFkRefCQ.class.getName(); }
}
