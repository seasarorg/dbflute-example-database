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
 * The condition-query for in-line of white_perrotta_over_trace.
 * @author DBFlute(AutoGenerator)
 */
public class WhitePerrottaOverTraceCIQ extends AbstractBsWhitePerrottaOverTraceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhitePerrottaOverTraceCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhitePerrottaOverTraceCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhitePerrottaOverTraceCQ myCQ) {
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
    protected ConditionValue getCValueTraceId() { return _myCQ.getTraceId(); }
    protected ConditionValue getCValuePreviousProductId() { return _myCQ.getPreviousProductId(); }
    public String keepPreviousProductId_InScopeRelation_WhitePerrottaOverProductByPreviousProductId(WhitePerrottaOverProductCQ sq)
    { return _myCQ.keepPreviousProductId_InScopeRelation_WhitePerrottaOverProductByPreviousProductId(sq); }
    public String keepPreviousProductId_NotInScopeRelation_WhitePerrottaOverProductByPreviousProductId(WhitePerrottaOverProductCQ sq)
    { return _myCQ.keepPreviousProductId_NotInScopeRelation_WhitePerrottaOverProductByPreviousProductId(sq); }
    protected ConditionValue getCValueNextProductId() { return _myCQ.getNextProductId(); }
    public String keepNextProductId_InScopeRelation_WhitePerrottaOverProductByNextProductId(WhitePerrottaOverProductCQ sq)
    { return _myCQ.keepNextProductId_InScopeRelation_WhitePerrottaOverProductByNextProductId(sq); }
    public String keepNextProductId_NotInScopeRelation_WhitePerrottaOverProductByNextProductId(WhitePerrottaOverProductCQ sq)
    { return _myCQ.keepNextProductId_NotInScopeRelation_WhitePerrottaOverProductByNextProductId(sq); }
    protected ConditionValue getCValueTraceTypeCode() { return _myCQ.getTraceTypeCode(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhitePerrottaOverTraceCB.class.getName(); }
    protected String xinCQ() { return WhitePerrottaOverTraceCQ.class.getName(); }
}
