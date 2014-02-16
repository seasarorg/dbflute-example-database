/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.bs.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of vendor_constraint_name_auto_bar.
 * @author DBFlute(AutoGenerator)
 */
public class VendorConstraintNameAutoBarCIQ extends AbstractBsVendorConstraintNameAutoBarCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorConstraintNameAutoBarCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorConstraintNameAutoBarCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorConstraintNameAutoBarCQ myCQ) {
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
    protected ConditionValue getCValueConstraintNameAutoBarId() { return _myCQ.getConstraintNameAutoBarId(); }
    public String keepConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq)
    { return _myCQ.keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList(sq); }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq)
    { return _myCQ.keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList(sq); }
    public String keepConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(VendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueConstraintNameAutoBarName() { return _myCQ.getConstraintNameAutoBarName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorConstraintNameAutoBarCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorConstraintNameAutoBarCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorConstraintNameAutoBarCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorConstraintNameAutoBarCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(VendorConstraintNameAutoBarCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorConstraintNameAutoBarCB.class.getName(); }
    protected String xinCQ() { return VendorConstraintNameAutoBarCQ.class.getName(); }
}
