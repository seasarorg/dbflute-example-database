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
 * The condition-query for in-line of white_self_reference_ref_one.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceRefOneCIQ extends AbstractBsWhiteSelfReferenceRefOneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteSelfReferenceRefOneCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteSelfReferenceRefOneCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteSelfReferenceRefOneCQ myCQ) {
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
    protected ConditionValue getCValueSelfReferenceId() { return _myCQ.getSelfReferenceId(); }
    public String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSelfReferenceId_InScopeRelation_WhiteSelfReference(WhiteSelfReferenceCQ sq)
    { return _myCQ.keepSelfReferenceId_InScopeRelation_WhiteSelfReference(sq); }
    public String keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq)
    { return _myCQ.keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceByParentIdList(sq); }
    public String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReference(WhiteSelfReferenceCQ sq)
    { return _myCQ.keepSelfReferenceId_NotInScopeRelation_WhiteSelfReference(sq); }
    public String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq)
    { return _myCQ.keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceByParentIdList(sq); }
    public String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdList(WhiteSelfReferenceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceByParentIdListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueSelfReferenceRefOneName() { return _myCQ.getSelfReferenceRefOneName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(WhiteSelfReferenceRefOneCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteSelfReferenceRefOneCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteSelfReferenceRefOneCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteSelfReferenceRefOneCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteSelfReferenceRefOneCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteSelfReferenceRefOneCB.class.getName(); }
    protected String xinCQ() { return WhiteSelfReferenceRefOneCQ.class.getName(); }
}
