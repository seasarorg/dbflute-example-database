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
 * The condition-query for in-line of VENDOR_LARGE_NAME_901234567890.
 * @author oracleman
 */
public class VendorLargeName901234567890CIQ extends AbstractBsVendorLargeName901234567890CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorLargeName901234567890CQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorLargeName901234567890CIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorLargeName901234567890CQ myCQ) {
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
    protected ConditionValue getCValueVendorLargeName901234567Id() { return _myCQ.getVendorLargeName901234567Id(); }
    public String keepVendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepVendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepVendorLargeName901234567Id_InScopeRelation_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq)
    { return _myCQ.keepVendorLargeName901234567Id_InScopeRelation_VendorLargeName90123456RefList(sq); }
    public String keepVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq)
    { return _myCQ.keepVendorLargeName901234567Id_NotInScopeRelation_VendorLargeName90123456RefList(sq); }
    public String keepVendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueVendorLargeName9012345Name() { return _myCQ.getVendorLargeName9012345Name(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorLargeName901234567890CQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorLargeName901234567890CQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorLargeName901234567890CQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorLargeName901234567890CQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(VendorLargeName901234567890CQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorLargeName901234567890CB.class.getName(); }
    protected String xinCQ() { return VendorLargeName901234567890CQ.class.getName(); }
}
