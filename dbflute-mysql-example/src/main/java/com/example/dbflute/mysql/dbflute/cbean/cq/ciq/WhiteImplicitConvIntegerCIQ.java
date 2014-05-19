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
 * The condition-query for in-line of white_implicit_conv_integer.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitConvIntegerCIQ extends AbstractBsWhiteImplicitConvIntegerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteImplicitConvIntegerCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteImplicitConvIntegerCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteImplicitConvIntegerCQ myCQ) {
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
    protected ConditionValue getCValueImplicitConvIntegerId() { return _myCQ.getImplicitConvIntegerId(); }
    public String keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq)
    { return _myCQ.keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericList(sq); }
    public String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { return _myCQ.keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringList(sq); }
    public String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq)
    { return _myCQ.keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericList(sq); }
    public String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { return _myCQ.keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringList(sq); }
    public String keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueImplicitConvNumericId() { return _myCQ.getImplicitConvNumericId(); }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric(WhiteImplicitConvNumericCQ sq)
    { return _myCQ.keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric(sq); }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric(WhiteImplicitConvNumericCQ sq)
    { return _myCQ.keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric(sq); }
    protected ConditionValue getCValueImplicitConvStringId() { return _myCQ.getImplicitConvStringId(); }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq)
    { return _myCQ.keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(sq); }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq)
    { return _myCQ.keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(sq); }
    protected ConditionValue getCValueImplicitConvName() { return _myCQ.getImplicitConvName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteImplicitConvIntegerCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteImplicitConvIntegerCB.class.getName(); }
    protected String xinCQ() { return WhiteImplicitConvIntegerCQ.class.getName(); }
}
