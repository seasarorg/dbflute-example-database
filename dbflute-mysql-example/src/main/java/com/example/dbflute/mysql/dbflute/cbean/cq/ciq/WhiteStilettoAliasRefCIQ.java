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
 * The condition-query for in-line of white_stiletto_alias_ref.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteStilettoAliasRefCIQ extends AbstractBsWhiteStilettoAliasRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteStilettoAliasRefCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteStilettoAliasRefCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteStilettoAliasRefCQ myCQ) {
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
    protected ConditionValue getCValueRefId() { return _myCQ.getRefId(); }
    protected ConditionValue getCValueFoo0() { return _myCQ.getFoo0(); }
    protected ConditionValue getCValueFoo1() { return _myCQ.getFoo1(); }
    protected ConditionValue getCValueFoo2() { return _myCQ.getFoo2(); }
    protected ConditionValue getCValueFoo3() { return _myCQ.getFoo3(); }
    protected ConditionValue getCValueFoo4() { return _myCQ.getFoo4(); }
    protected ConditionValue getCValueBar0() { return _myCQ.getBar0(); }
    protected ConditionValue getCValueQux0() { return _myCQ.getQux0(); }
    protected ConditionValue getCValueC21() { return _myCQ.getC21(); }
    protected ConditionValue getCValueC22() { return _myCQ.getC22(); }
    protected ConditionValue getCValueC23() { return _myCQ.getC23(); }
    protected ConditionValue getCValueStilettoAliasId() { return _myCQ.getStilettoAliasId(); }
    public String keepStilettoAliasId_InScopeRelation_WhiteStilettoAlias(WhiteStilettoAliasCQ sq)
    { return _myCQ.keepStilettoAliasId_InScopeRelation_WhiteStilettoAlias(sq); }
    public String keepStilettoAliasId_NotInScopeRelation_WhiteStilettoAlias(WhiteStilettoAliasCQ sq)
    { return _myCQ.keepStilettoAliasId_NotInScopeRelation_WhiteStilettoAlias(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteStilettoAliasRefCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteStilettoAliasRefCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteStilettoAliasRefCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteStilettoAliasRefCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteStilettoAliasRefCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteStilettoAliasRefCB.class.getName(); }
    protected String xinCQ() { return WhiteStilettoAliasRefCQ.class.getName(); }
}
