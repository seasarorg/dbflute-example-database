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
 * The condition-query for in-line of vendor_constraint_name_auto_ref.
 * @author DBFlute(AutoGenerator)
 */
public class VendorConstraintNameAutoRefCIQ extends AbstractBsVendorConstraintNameAutoRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorConstraintNameAutoRefCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorConstraintNameAutoRefCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorConstraintNameAutoRefCQ myCQ) {
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
    protected ConditionValue getCValueConstraintNameAutoRefId() { return _myCQ.getConstraintNameAutoRefId(); }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return _myCQ.getConstraintNameAutoFooId(); }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(VendorConstraintNameAutoFooCQ sq)
    { return _myCQ.keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(sq); }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(VendorConstraintNameAutoFooCQ sq)
    { return _myCQ.keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(sq); }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return _myCQ.getConstraintNameAutoBarId(); }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(VendorConstraintNameAutoBarCQ sq)
    { return _myCQ.keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(sq); }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(VendorConstraintNameAutoBarCQ sq)
    { return _myCQ.keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(sq); }
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return _myCQ.getConstraintNameAutoQuxId(); }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(VendorConstraintNameAutoQuxCQ sq)
    { return _myCQ.keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(sq); }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(VendorConstraintNameAutoQuxCQ sq)
    { return _myCQ.keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(sq); }
    protected ConditionValue getCValueConstraintNameAutoCorgeId() { return _myCQ.getConstraintNameAutoCorgeId(); }
    protected ConditionValue getCValueConstraintNameAutoUnique() { return _myCQ.getConstraintNameAutoUnique(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(VendorConstraintNameAutoRefCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorConstraintNameAutoRefCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorConstraintNameAutoRefCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorConstraintNameAutoRefCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(VendorConstraintNameAutoRefCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorConstraintNameAutoRefCB.class.getName(); }
    protected String xinCQ() { return VendorConstraintNameAutoRefCQ.class.getName(); }
}
