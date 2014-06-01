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
 * The condition-query for in-line of white_implicit_conv_numeric.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitConvNumericCIQ extends AbstractBsWhiteImplicitConvNumericCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteImplicitConvNumericCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteImplicitConvNumericCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteImplicitConvNumericCQ myCQ) {
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
    protected ConditionValue getCValueImplicitConvNumericId() { return _myCQ.getImplicitConvNumericId(); }
    public String keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq)
    { return _myCQ.keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList(sq); }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { return _myCQ.keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList(sq); }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq)
    { return _myCQ.keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList(sq); }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { return _myCQ.keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList(sq); }
    public String keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueImplicitConvIntegerId() { return _myCQ.getImplicitConvIntegerId(); }
    public String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq)
    { return _myCQ.keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger(sq); }
    public String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq)
    { return _myCQ.keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(sq); }
    protected ConditionValue getCValueImplicitConvStringId() { return _myCQ.getImplicitConvStringId(); }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq)
    { return _myCQ.keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(sq); }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq)
    { return _myCQ.keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(sq); }
    protected ConditionValue getCValueImplicitConvName() { return _myCQ.getImplicitConvName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteImplicitConvNumericCB.class.getName(); }
    protected String xinCQ() { return WhiteImplicitConvNumericCQ.class.getName(); }
}
