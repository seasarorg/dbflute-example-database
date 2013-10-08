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
 * The condition-query for in-line of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCIQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorCheckCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorCheckCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorCheckCQ myCQ) {
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
    protected ConditionValue getCValueVendorCheckId() { return _myCQ.getVendorCheckId(); }
    protected ConditionValue getCValueTypeOfChar() { return _myCQ.getTypeOfChar(); }
    protected ConditionValue getCValueTypeOfVarchar() { return _myCQ.getTypeOfVarchar(); }
    protected ConditionValue getCValueTypeOfText() { return _myCQ.getTypeOfText(); }
    protected ConditionValue getCValueTypeOfTinytext() { return _myCQ.getTypeOfTinytext(); }
    protected ConditionValue getCValueTypeOfMediumtext() { return _myCQ.getTypeOfMediumtext(); }
    protected ConditionValue getCValueTypeOfLongtext() { return _myCQ.getTypeOfLongtext(); }
    protected ConditionValue getCValueTypeOfNumericDecimal() { return _myCQ.getTypeOfNumericDecimal(); }
    protected ConditionValue getCValueTypeOfNumericInteger() { return _myCQ.getTypeOfNumericInteger(); }
    protected ConditionValue getCValueTypeOfNumericBigint() { return _myCQ.getTypeOfNumericBigint(); }
    protected ConditionValue getCValueTypeOfDecimalDecimal() { return _myCQ.getTypeOfDecimalDecimal(); }
    protected ConditionValue getCValueTypeOfDecimalInteger() { return _myCQ.getTypeOfDecimalInteger(); }
    protected ConditionValue getCValueTypeOfDecimalBigint() { return _myCQ.getTypeOfDecimalBigint(); }
    protected ConditionValue getCValueTypeOfInteger() { return _myCQ.getTypeOfInteger(); }
    protected ConditionValue getCValueTypeOfBigint() { return _myCQ.getTypeOfBigint(); }
    protected ConditionValue getCValueTypeOfFloat() { return _myCQ.getTypeOfFloat(); }
    protected ConditionValue getCValueTypeOfDouble() { return _myCQ.getTypeOfDouble(); }
    protected ConditionValue getCValueTypeOfDate() { return _myCQ.getTypeOfDate(); }
    protected ConditionValue getCValueTypeOfDatetime() { return _myCQ.getTypeOfDatetime(); }
    protected ConditionValue getCValueTypeOfTimestamp() { return _myCQ.getTypeOfTimestamp(); }
    protected ConditionValue getCValueTypeOfTime() { return _myCQ.getTypeOfTime(); }
    protected ConditionValue getCValueTypeOfYear() { return _myCQ.getTypeOfYear(); }
    protected ConditionValue getCValueTypeOfBoolean() { return _myCQ.getTypeOfBoolean(); }
    protected ConditionValue getCValueTypeOfBlob() { return _myCQ.getTypeOfBlob(); }
    protected ConditionValue getCValueTypeOfTinyblob() { return _myCQ.getTypeOfTinyblob(); }
    protected ConditionValue getCValueTypeOfMediumblob() { return _myCQ.getTypeOfMediumblob(); }
    protected ConditionValue getCValueTypeOfLongblob() { return _myCQ.getTypeOfLongblob(); }
    protected ConditionValue getCValueTypeOfBinary() { return _myCQ.getTypeOfBinary(); }
    protected ConditionValue getCValueTypeOfVarbinary() { return _myCQ.getTypeOfVarbinary(); }
    protected ConditionValue getCValueTypeOfEnum() { return _myCQ.getTypeOfEnum(); }
    protected ConditionValue getCValueTypeOfSet() { return _myCQ.getTypeOfSet(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(VendorCheckCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorCheckCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorCheckCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(VendorCheckCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorCheckCB.class.getName(); }
    protected String xinCQ() { return VendorCheckCQ.class.getName(); }
}
