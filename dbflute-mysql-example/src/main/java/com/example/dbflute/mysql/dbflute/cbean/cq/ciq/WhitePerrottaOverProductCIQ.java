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
 * The condition-query for in-line of white_perrotta_over_product.
 * @author DBFlute(AutoGenerator)
 */
public class WhitePerrottaOverProductCIQ extends AbstractBsWhitePerrottaOverProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhitePerrottaOverProductCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhitePerrottaOverProductCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhitePerrottaOverProductCQ myCQ) {
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
    protected ConditionValue getCValueProductId() { return _myCQ.getProductId(); }
    public String keepProductId_ExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_InScopeRelation_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_WhitePerrottaOverMemberList(sq); }
    public String keepProductId_InScopeRelation_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_WhitePerrottaOverTraceByNextProductIdList(sq); }
    public String keepProductId_InScopeRelation_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_WhitePerrottaOverTraceByPreviousProductIdList(sq); }
    public String keepProductId_NotInScopeRelation_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_WhitePerrottaOverMemberList(sq); }
    public String keepProductId_NotInScopeRelation_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_WhitePerrottaOverTraceByNextProductIdList(sq); }
    public String keepProductId_NotInScopeRelation_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_WhitePerrottaOverTraceByPreviousProductIdList(sq); }
    public String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueProductName() { return _myCQ.getProductName(); }
    protected ConditionValue getCValueProductNestedCode() { return _myCQ.getProductNestedCode(); }
    public String keepProductNestedCode_InScopeRelation_WhitePerrottaOverProductNested(WhitePerrottaOverProductNestedCQ sq)
    { return _myCQ.keepProductNestedCode_InScopeRelation_WhitePerrottaOverProductNested(sq); }
    public String keepProductNestedCode_NotInScopeRelation_WhitePerrottaOverProductNested(WhitePerrottaOverProductNestedCQ sq)
    { return _myCQ.keepProductNestedCode_NotInScopeRelation_WhitePerrottaOverProductNested(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhitePerrottaOverProductCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhitePerrottaOverProductCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhitePerrottaOverProductCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhitePerrottaOverProductCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhitePerrottaOverProductCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhitePerrottaOverProductCB.class.getName(); }
    protected String xinCQ() { return WhitePerrottaOverProductCQ.class.getName(); }
}
