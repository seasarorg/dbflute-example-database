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
 * The condition-query for in-line of white_pg_reserv.
 * @author DBFlute(AutoGenerator)
 */
public class WhitePgReservCIQ extends AbstractBsWhitePgReservCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhitePgReservCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhitePgReservCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhitePgReservCQ myCQ) {
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
    protected ConditionValue getCValueClassSynonym() { return _myCQ.getClassSynonym(); }
    public String keepClassSynonym_ExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClassSynonym_NotExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClassSynonym_InScopeRelation_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { return _myCQ.keepClassSynonym_InScopeRelation_WhitePgReservRefList(sq); }
    public String keepClassSynonym_NotInScopeRelation_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { return _myCQ.keepClassSynonym_NotInScopeRelation_WhitePgReservRefList(sq); }
    public String keepClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueCaseSynonym() { return _myCQ.getCaseSynonym(); }
    protected ConditionValue getCValuePackageSynonym() { return _myCQ.getPackageSynonym(); }
    protected ConditionValue getCValueDefaultSynonym() { return _myCQ.getDefaultSynonym(); }
    protected ConditionValue getCValueNewSynonym() { return _myCQ.getNewSynonym(); }
    protected ConditionValue getCValueNativeSynonym() { return _myCQ.getNativeSynonym(); }
    protected ConditionValue getCValueVoidSynonym() { return _myCQ.getVoidSynonym(); }
    protected ConditionValue getCValuePublicSynonym() { return _myCQ.getPublicSynonym(); }
    protected ConditionValue getCValueProtectedSynonym() { return _myCQ.getProtectedSynonym(); }
    protected ConditionValue getCValuePrivateSynonym() { return _myCQ.getPrivateSynonym(); }
    protected ConditionValue getCValueInterfaceSynonym() { return _myCQ.getInterfaceSynonym(); }
    protected ConditionValue getCValueAbstractSynonym() { return _myCQ.getAbstractSynonym(); }
    protected ConditionValue getCValueFinalSynonym() { return _myCQ.getFinalSynonym(); }
    protected ConditionValue getCValueFinallySynonym() { return _myCQ.getFinallySynonym(); }
    protected ConditionValue getCValueReturnSynonym() { return _myCQ.getReturnSynonym(); }
    protected ConditionValue getCValueDoubleSynonym() { return _myCQ.getDoubleSynonym(); }
    protected ConditionValue getCValueFloatSynonym() { return _myCQ.getFloatSynonym(); }
    protected ConditionValue getCValueShortSynonym() { return _myCQ.getShortSynonym(); }
    protected ConditionValue getCValueType() { return _myCQ.getType(); }
    protected ConditionValue getCValueReservName() { return _myCQ.getReservName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhitePgReservCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhitePgReservCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhitePgReservCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhitePgReservCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhitePgReservCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhitePgReservCB.class.getName(); }
    protected String xinCQ() { return WhitePgReservCQ.class.getName(); }
}
