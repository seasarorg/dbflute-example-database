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
 * The condition-query for in-line of white_self_reference.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceCIQ extends AbstractBsWhiteSelfReferenceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteSelfReferenceCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteSelfReferenceCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteSelfReferenceCQ myCQ) {
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
    public String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOneCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOneCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq)
    { return _myCQ.keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceSelfList(sq); }
    public String keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOneCQ sq)
    { return _myCQ.keepSelfReferenceId_InScopeRelation_WhiteSelfReferenceRefOneAsOne(sq); }
    public String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq)
    { return _myCQ.keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceSelfList(sq); }
    public String keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOneCQ sq)
    { return _myCQ.keepSelfReferenceId_NotInScopeRelation_WhiteSelfReferenceRefOneAsOne(sq); }
    public String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueSelfReferenceName() { return _myCQ.getSelfReferenceName(); }
    protected ConditionValue getCValueParentId() { return _myCQ.getParentId(); }
    public String keepParentId_InScopeRelation_WhiteSelfReferenceSelf(WhiteSelfReferenceCQ sq)
    { return _myCQ.keepParentId_InScopeRelation_WhiteSelfReferenceSelf(sq); }
    public String keepParentId_NotInScopeRelation_WhiteSelfReferenceSelf(WhiteSelfReferenceCQ sq)
    { return _myCQ.keepParentId_NotInScopeRelation_WhiteSelfReferenceSelf(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteSelfReferenceCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteSelfReferenceCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteSelfReferenceCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteSelfReferenceCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteSelfReferenceCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteSelfReferenceCB.class.getName(); }
    protected String xinCQ() { return WhiteSelfReferenceCQ.class.getName(); }
}
