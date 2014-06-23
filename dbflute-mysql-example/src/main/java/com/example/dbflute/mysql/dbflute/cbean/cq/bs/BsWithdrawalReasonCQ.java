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
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of withdrawal_reason.
 * @author DBFlute(AutoGenerator)
 */
public class BsWithdrawalReasonCQ extends AbstractBsWithdrawalReasonCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWithdrawalReasonCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue getWithdrawalReasonCode()
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected ConditionValue getCValueWithdrawalReasonCode() { return getWithdrawalReasonCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonText;
    public ConditionValue getWithdrawalReasonText()
    { if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
      return _withdrawalReasonText; }
    protected ConditionValue getCValueWithdrawalReasonText() { return getWithdrawalReasonText(); }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WithdrawalReasonCB.class.getName(); }
    protected String xCQ() { return WithdrawalReasonCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
