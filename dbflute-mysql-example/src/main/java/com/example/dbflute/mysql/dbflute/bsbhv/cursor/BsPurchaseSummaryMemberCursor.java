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
package com.example.dbflute.mysql.dbflute.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.dbflute.jdbc.ValueType;
import org.seasar.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of PurchaseSummaryMember. <br />
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseSummaryMemberCursor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of MEMBER_ID. */
    public static final String DB_NAME_MEMBER_ID = "MEMBER_ID";

    /** DB name of MEMBER_NAME. */
    public static final String DB_NAME_MEMBER_NAME = "MEMBER_NAME";

    /** DB name of BIRTHDATE. */
    public static final String DB_NAME_BIRTHDATE = "BIRTHDATE";

    /** DB name of FORMALIZED_DATETIME. */
    public static final String DB_NAME_FORMALIZED_DATETIME = "FORMALIZED_DATETIME";

    /** DB name of PURCHASE_SUMMARY. */
    public static final String DB_NAME_PURCHASE_SUMMARY = "PURCHASE_SUMMARY";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtMemberId = vt(Integer.class);
    protected ValueType _vtMemberName = vt(String.class);
    protected ValueType _vtBirthdate = vt(java.util.Date.class);
    protected ValueType _vtFormalizedDatetime = vt(java.sql.Timestamp.class);
    protected ValueType _vtPurchaseSummary = vt(java.math.BigDecimal.class);

    protected ValueType vt(Class<?> type) {
        return TnValueTypes.getValueType(type);
    }

    protected ValueType vt(Class<?> type, String name) {
        ValueType valueType = TnValueTypes.getPluginValueType(name);
        return valueType != null ? valueType : vt(type);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseSummaryMemberCursor() {
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /**
     * Accept the result set.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     */
    public void accept(ResultSet rs) {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /**
     * Get the wrapped cursor (result set).
     * @return The instance of result set. (NotNull)
     */
    public ResultSet cursor() {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /**
     * Move to next result.
     * @return Is exist next result.
     * @throws SQLException
     */
    public boolean next() throws SQLException {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] (会員ID)MEMBER_ID: {INT(11), refers to member.MEMBER_ID} <br />
     * 会員を識別するID。連番として基本的に自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。<br />
     * // unique key of this result
     * @return The value of memberId. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Integer getMemberId() throws SQLException {
        return (Integer)_vtMemberId.getValue(_rs, DB_NAME_MEMBER_ID);
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to member.MEMBER_NAME} <br />
     * 会員のフルネームの名称。
     * @return The value of memberName. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public String getMemberName() throws SQLException {
        return (String)_vtMemberName.getValue(_rs, DB_NAME_MEMBER_NAME);
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(10), refers to member.BIRTHDATE} <br />
     * 必須項目ではないので、このデータがない会員もいる。
     * @return The value of birthdate. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.util.Date getBirthdate() throws SQLException {
        return (java.util.Date)_vtBirthdate.getValue(_rs, DB_NAME_BIRTHDATE);
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {DATETIME(19), refers to member.FORMALIZED_DATETIME} <br />
     * 会員が正式に確定した日時。一度確定したら更新されない。<br />
     * 仮会員のときはnull。
     * @return The value of formalizedDatetime. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.sql.Timestamp getFormalizedDatetime() throws SQLException {
        return (java.sql.Timestamp)_vtFormalizedDatetime.getValue(_rs, DB_NAME_FORMALIZED_DATETIME);
    }

    /**
     * [get] PURCHASE_SUMMARY: {DECIMAL(32)} <br />
     * // sum of purchase count
     * @return The value of purchaseSummary. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.math.BigDecimal getPurchaseSummary() throws SQLException {
        return (java.math.BigDecimal)_vtPurchaseSummary.getValue(_rs, DB_NAME_PURCHASE_SUMMARY);
    }

}
