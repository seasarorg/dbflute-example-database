package com.example.dbflute.postgresql.dbflute.bsbhv.cursor;

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
    /** DB name of member_id. */
    public static final String DB_NAME_member_id = "member_id";

    /** DB name of member_name. */
    public static final String DB_NAME_member_name = "member_name";

    /** DB name of birthdate. */
    public static final String DB_NAME_birthdate = "birthdate";

    /** DB name of formalized_datetime. */
    public static final String DB_NAME_formalized_datetime = "formalized_datetime";

    /** DB name of purchase_summary. */
    public static final String DB_NAME_purchase_summary = "purchase_summary";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtMemberId = vt(Integer.class);
    protected ValueType _vtMemberName = vt(String.class);
    protected ValueType _vtBirthdate = vt(java.util.Date.class);
    protected ValueType _vtFormalizedDatetime = vt(java.sql.Timestamp.class);
    protected ValueType _vtPurchaseSummary = vt(Long.class);

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
     * [get] member_id: {int4(10)} <br />
     * @return The value of memberId. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Integer getMemberId() throws SQLException {
        return (Integer)_vtMemberId.getValue(_rs, DB_NAME_member_id);
    }

    /**
     * [get] member_name: {varchar(200)} <br />
     * @return The value of memberName. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public String getMemberName() throws SQLException {
        return (String)_vtMemberName.getValue(_rs, DB_NAME_member_name);
    }

    /**
     * [get] birthdate: {date(13)} <br />
     * @return The value of birthdate. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.util.Date getBirthdate() throws SQLException {
        return (java.util.Date)_vtBirthdate.getValue(_rs, DB_NAME_birthdate);
    }

    /**
     * [get] formalized_datetime: {timestamp(26, 3)} <br />
     * @return The value of formalizedDatetime. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.sql.Timestamp getFormalizedDatetime() throws SQLException {
        return (java.sql.Timestamp)_vtFormalizedDatetime.getValue(_rs, DB_NAME_formalized_datetime);
    }

    /**
     * [get] purchase_summary: {int8(19)} <br />
     * @return The value of purchaseSummary. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Long getPurchaseSummary() throws SQLException {
        return (Long)_vtPurchaseSummary.getValue(_rs, DB_NAME_purchase_summary);
    }

}
