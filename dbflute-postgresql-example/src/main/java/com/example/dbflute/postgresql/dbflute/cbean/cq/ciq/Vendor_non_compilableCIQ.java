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
 * The condition-query for in-line of VENDOR-NON COMPILABLE.
 * @author DBFlute(AutoGenerator)
 */
public class Vendor_non_compilableCIQ extends AbstractBsVendor_non_compilableCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendor_non_compilableCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public Vendor_non_compilableCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendor_non_compilableCQ myCQ) {
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
    protected ConditionValue getCValueNon_compilable_id() { return _myCQ.getNon_compilable_id(); }
    public String keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepNon_compilable_id_InScopeRelation_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq)
    { return _myCQ.keepNon_compilable_id_InScopeRelation_Vendor_non_compilableByNextParentidSelfList(sq); }
    public String keepNon_compilable_id_InScopeRelation_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq)
    { return _myCQ.keepNon_compilable_id_InScopeRelation_Vendor_non_compilableByParent_idSelfList(sq); }
    public String keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq)
    { return _myCQ.keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableByNextParentidSelfList(sq); }
    public String keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq)
    { return _myCQ.keepNon_compilable_id_NotInScopeRelation_Vendor_non_compilableByParent_idSelfList(sq); }
    public String keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueNon_compilable_name() { return _myCQ.getNon_compilable_name(); }
    protected ConditionValue getCValueParent_id() { return _myCQ.getParent_id(); }
    public String keepParent_id_InScopeRelation_Vendor_non_compilableByParent_idSelf(Vendor_non_compilableCQ sq)
    { return _myCQ.keepParent_id_InScopeRelation_Vendor_non_compilableByParent_idSelf(sq); }
    public String keepParent_id_NotInScopeRelation_Vendor_non_compilableByParent_idSelf(Vendor_non_compilableCQ sq)
    { return _myCQ.keepParent_id_NotInScopeRelation_Vendor_non_compilableByParent_idSelf(sq); }
    protected ConditionValue getCValueNextParentid() { return _myCQ.getNextParentid(); }
    public String keepNextParentid_InScopeRelation_Vendor_non_compilableByNextParentidSelf(Vendor_non_compilableCQ sq)
    { return _myCQ.keepNextParentid_InScopeRelation_Vendor_non_compilableByNextParentidSelf(sq); }
    public String keepNextParentid_NotInScopeRelation_Vendor_non_compilableByNextParentidSelf(Vendor_non_compilableCQ sq)
    { return _myCQ.keepNextParentid_NotInScopeRelation_Vendor_non_compilableByNextParentidSelf(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(Vendor_non_compilableCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(Vendor_non_compilableCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(Vendor_non_compilableCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(Vendor_non_compilableCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(Vendor_non_compilableCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return Vendor_non_compilableCB.class.getName(); }
    protected String xinCQ() { return Vendor_non_compilableCQ.class.getName(); }
}
