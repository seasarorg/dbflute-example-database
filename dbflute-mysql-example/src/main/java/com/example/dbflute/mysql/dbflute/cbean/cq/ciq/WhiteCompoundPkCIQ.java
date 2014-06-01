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
 * The condition-query for in-line of white_compound_pk.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkCIQ extends AbstractBsWhiteCompoundPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteCompoundPkCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteCompoundPkCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteCompoundPkCQ myCQ) {
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
    protected ConditionValue getCValuePkFirstId() { return _myCQ.getPkFirstId(); }
    protected ConditionValue getCValuePkSecondId() { return _myCQ.getPkSecondId(); }
    public String keepPkSecondId_InScopeRelation_WhiteCompoundReferredPrimary(WhiteCompoundReferredPrimaryCQ sq)
    { return _myCQ.keepPkSecondId_InScopeRelation_WhiteCompoundReferredPrimary(sq); }
    public String keepPkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary(WhiteCompoundReferredPrimaryCQ sq)
    { return _myCQ.keepPkSecondId_NotInScopeRelation_WhiteCompoundReferredPrimary(sq); }
    protected ConditionValue getCValuePkName() { return _myCQ.getPkName(); }
    protected ConditionValue getCValueReferredId() { return _myCQ.getReferredId(); }
    public String keepReferredId_InScopeRelation_WhiteCompoundReferredNormally(WhiteCompoundReferredNormallyCQ sq)
    { return _myCQ.keepReferredId_InScopeRelation_WhiteCompoundReferredNormally(sq); }
    public String keepReferredId_NotInScopeRelation_WhiteCompoundReferredNormally(WhiteCompoundReferredNormallyCQ sq)
    { return _myCQ.keepReferredId_NotInScopeRelation_WhiteCompoundReferredNormally(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteCompoundPkCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xinCQ() { return WhiteCompoundPkCQ.class.getName(); }
}
