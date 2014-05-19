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
 * The condition-query for in-line of white_split_multiple_fk_base.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSplitMultipleFkBaseCIQ extends AbstractBsWhiteSplitMultipleFkBaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteSplitMultipleFkBaseCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteSplitMultipleFkBaseCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteSplitMultipleFkBaseCQ myCQ) {
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
    protected ConditionValue getCValueBaseId() { return _myCQ.getBaseId(); }
    public String keepBaseId_ExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBaseId_NotExistsReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBaseId_InScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq)
    { return _myCQ.keepBaseId_InScopeRelation_WhiteSplitMultipleFkChildList(sq); }
    public String keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq)
    { return _myCQ.keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkChildList(sq); }
    public String keepBaseId_SpecifyDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildList(WhiteSplitMultipleFkChildCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBaseId_QueryDerivedReferrer_WhiteSplitMultipleFkChildListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueFirstId() { return _myCQ.getFirstId(); }
    protected ConditionValue getCValueNextId() { return _myCQ.getNextId(); }
    public String keepNextId_InScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ sq)
    { return _myCQ.keepNextId_InScopeRelation_WhiteSplitMultipleFkNext(sq); }
    public String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkNext(WhiteSplitMultipleFkNextCQ sq)
    { return _myCQ.keepNextId_NotInScopeRelation_WhiteSplitMultipleFkNext(sq); }
    protected ConditionValue getCValueSplitName() { return _myCQ.getSplitName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteSplitMultipleFkBaseCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteSplitMultipleFkBaseCB.class.getName(); }
    protected String xinCQ() { return WhiteSplitMultipleFkBaseCQ.class.getName(); }
}
