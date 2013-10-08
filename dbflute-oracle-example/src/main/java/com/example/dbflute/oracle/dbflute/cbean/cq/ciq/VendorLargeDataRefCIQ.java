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
 * The condition-query for in-line of VENDOR_LARGE_DATA_REF.
 * @author oracleman
 */
public class VendorLargeDataRefCIQ extends AbstractBsVendorLargeDataRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorLargeDataRefCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorLargeDataRefCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorLargeDataRefCQ myCQ) {
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
    protected ConditionValue getCValueLargeDataRefId() { return _myCQ.getLargeDataRefId(); }
    public String keepLargeDataRefId_ExistsReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLargeDataRefId_NotExistsReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLargeDataRefId_InScopeRelation_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq)
    { return _myCQ.keepLargeDataRefId_InScopeRelation_VendorLargeDataRefSelfList(sq); }
    public String keepLargeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq)
    { return _myCQ.keepLargeDataRefId_NotInScopeRelation_VendorLargeDataRefSelfList(sq); }
    public String keepLargeDataRefId_SpecifyDerivedReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfList(VendorLargeDataRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLargeDataRefId_QueryDerivedReferrer_VendorLargeDataRefSelfListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueLargeDataId() { return _myCQ.getLargeDataId(); }
    public String keepLargeDataId_InScopeRelation_VendorLargeData(VendorLargeDataCQ sq)
    { return _myCQ.keepLargeDataId_InScopeRelation_VendorLargeData(sq); }
    public String keepLargeDataId_NotInScopeRelation_VendorLargeData(VendorLargeDataCQ sq)
    { return _myCQ.keepLargeDataId_NotInScopeRelation_VendorLargeData(sq); }
    protected ConditionValue getCValueDateIndex() { return _myCQ.getDateIndex(); }
    protected ConditionValue getCValueDateNoIndex() { return _myCQ.getDateNoIndex(); }
    protected ConditionValue getCValueTimestampIndex() { return _myCQ.getTimestampIndex(); }
    protected ConditionValue getCValueTimestampNoIndex() { return _myCQ.getTimestampNoIndex(); }
    protected ConditionValue getCValueNullableDecimalIndex() { return _myCQ.getNullableDecimalIndex(); }
    protected ConditionValue getCValueNullableDecimalNoIndex() { return _myCQ.getNullableDecimalNoIndex(); }
    protected ConditionValue getCValueSelfParentId() { return _myCQ.getSelfParentId(); }
    public String keepSelfParentId_InScopeRelation_VendorLargeDataRefSelf(VendorLargeDataRefCQ sq)
    { return _myCQ.keepSelfParentId_InScopeRelation_VendorLargeDataRefSelf(sq); }
    public String keepSelfParentId_NotInScopeRelation_VendorLargeDataRefSelf(VendorLargeDataRefCQ sq)
    { return _myCQ.keepSelfParentId_NotInScopeRelation_VendorLargeDataRefSelf(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(VendorLargeDataRefCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorLargeDataRefCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorLargeDataRefCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorLargeDataRefCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(VendorLargeDataRefCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorLargeDataRefCB.class.getName(); }
    protected String xinCQ() { return VendorLargeDataRefCQ.class.getName(); }
}
