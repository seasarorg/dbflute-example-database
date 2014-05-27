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
 * The condition-query for in-line of white_suppress_join_sq_many_one.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqManyOneCIQ extends AbstractBsWhiteSuppressJoinSqManyOneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteSuppressJoinSqManyOneCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteSuppressJoinSqManyOneCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteSuppressJoinSqManyOneCQ myCQ) {
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
    protected ConditionValue getCValueManyOneId() { return _myCQ.getManyOneId(); }
    public String keepManyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepManyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepManyOneId_InScopeRelation_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq)
    { return _myCQ.keepManyOneId_InScopeRelation_WhiteSuppressJoinSqManyList(sq); }
    public String keepManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq)
    { return _myCQ.keepManyOneId_NotInScopeRelation_WhiteSuppressJoinSqManyList(sq); }
    public String keepManyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueManyOneName() { return _myCQ.getManyOneName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteSuppressJoinSqManyOneCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyOneCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteSuppressJoinSqManyOneCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteSuppressJoinSqManyOneCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteSuppressJoinSqManyOneCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteSuppressJoinSqManyOneCB.class.getName(); }
    protected String xinCQ() { return WhiteSuppressJoinSqManyOneCQ.class.getName(); }
}
