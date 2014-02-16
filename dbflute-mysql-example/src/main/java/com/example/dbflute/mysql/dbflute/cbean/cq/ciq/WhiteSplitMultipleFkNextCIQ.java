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
 * The condition-query for in-line of white_split_multiple_fk_next.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSplitMultipleFkNextCIQ extends AbstractBsWhiteSplitMultipleFkNextCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteSplitMultipleFkNextCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteSplitMultipleFkNextCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteSplitMultipleFkNextCQ myCQ) {
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
    protected ConditionValue getCValueNextId() { return _myCQ.getNextId(); }
    public String keepNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepNextId_InScopeRelation_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq)
    { return _myCQ.keepNextId_InScopeRelation_WhiteSplitMultipleFkBaseList(sq); }
    public String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq)
    { return _myCQ.keepNextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList(sq); }
    public String keepNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueSecondCode() { return _myCQ.getSecondCode(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteSplitMultipleFkNextCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteSplitMultipleFkNextCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteSplitMultipleFkNextCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteSplitMultipleFkNextCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteSplitMultipleFkNextCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteSplitMultipleFkNextCB.class.getName(); }
    protected String xinCQ() { return WhiteSplitMultipleFkNextCQ.class.getName(); }
}
