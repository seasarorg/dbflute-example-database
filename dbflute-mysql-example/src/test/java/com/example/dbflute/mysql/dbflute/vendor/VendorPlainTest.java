package com.example.dbflute.mysql.dbflute.vendor;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.sql.DataSource;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.VendorCheckCB;
import com.example.dbflute.mysql.dbflute.cbean.cq.VendorCheckCQ;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.VendorCheck;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.1 (2009/11/17 Tuesday)
 */
public class VendorPlainTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                             BC Date
    //                                                                             =======
    public void test_BC_date() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_IsNotNull();
        cb.fetchFirst(1);
        cb.addOrderBy_PK_Asc();
        Member member = memberBhv.selectEntity(cb);
        member.setBirthdate(DfTypeUtil.toSqlDate("BC1234/12/25"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPKValue(member.getMemberId());
        DateFormat df = new SimpleDateFormat("Gyyyy/MM/dd");
        log(df.format(actual.getBirthdate()));
        assertFalse(DfTypeUtil.isDateBC(actual.getBirthdate())); // cannot handle BC date
        assertTrue(df.format(actual.getBirthdate()).contains("1234/12/25"));
    }

    public void test_BC_datetime() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setFormalizedDatetime_IsNotNull();
        cb.fetchFirst(1);
        cb.addOrderBy_PK_Asc();
        Member member = memberBhv.selectEntity(cb);
        member.setFormalizedDatetime(DfTypeUtil.toTimestamp("BC1234/12/25 12:34:56.147"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPKValue(member.getMemberId());
        DateFormat df = new SimpleDateFormat("Gyyyy/MM/dd HH:mm:dd.SSS");
        log(df.format(actual.getFormalizedDatetime()));
        assertFalse(DfTypeUtil.isDateBC(actual.getFormalizedDatetime())); // cannot handle BC date
        assertTrue(df.format(actual.getFormalizedDatetime()).contains("1234/12/25"));
    }

    public void test_BC_test_precondition_also_JDK_test() {
        // ## Arrange ##
        String beforeExp = "BC0001/12/31 23:59:59.999";
        String afterExp = "0001/01/01 00:00:00.000";

        // ## Act ##
        Date before = DfTypeUtil.toDate(beforeExp);
        Date after = DfTypeUtil.toDate(afterExp);
        int beforeEra = DfTypeUtil.toCalendar(before).get(Calendar.ERA);
        int afterEra = DfTypeUtil.toCalendar(after).get(Calendar.ERA);

        // ## Assert ##
        log("before time = " + before.getTime());
        log("after  time = " + after.getTime());
        log("before era  = " + beforeEra);
        log("after  era  = " + afterEra);
        assertEquals(GregorianCalendar.BC, beforeEra);
        assertEquals(GregorianCalendar.AD, afterEra);
        assertTrue("before=" + before.getTime(), DfTypeUtil.isDateBC(before));
        assertFalse("after=" + after.getTime(), DfTypeUtil.isDateBC(after));
        DfTypeUtil.addDateMillisecond(before, 1);
        assertEquals(after.getTime(), before.getTime());
    }

    // ===================================================================================
    //                                                                          Short Char
    //                                                                          ==========
    public void test_shortChar_inout_trimmed_value() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code + " ");

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code, actual.getTypeOfChar()); // DB trims it
    }

    public void test_shortChar_inout_filled_value() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB ";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code);

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code.trim(), actual.getTypeOfChar()); // DB trims it
    }

    public void test_shortChar_condition() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB ";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB() {
            // internal manipulation (Don't mimic it)
            @Override
            protected VendorCheckCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName,
                    int nestLevel) {
                return new VendorCheckCQ(childQuery, sqlClause, aliasName, nestLevel) {
                    @Override
                    protected String hSC(String propertyName, String value, Integer size, String modeCode) {
                        return value; // do nothing for not depending on shortCharHandlingMode
                    }
                };
            }
        };
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code.trim());
        assertTrue(cb.toDisplaySql().contains("'AB'"));

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code.trim(), actual.getTypeOfChar());
    }

    // ===================================================================================
    //                                                                  Plain ENUM Binding
    //                                                                  ==================
    public void test_plain_enum_binding() throws SQLException {
        // ## Arrange ##
        List<Integer> prepared = executeEnumBindSql(CDef.MemberStatus.Formalized.code());
        assertFalse(prepared.isEmpty());
        log(prepared);

        // ## Act ##
        List<Integer> resultList = executeEnumBindSql(TestPlainStatus.FML);

        // ## Assert ##
        log(resultList);
        assertTrue(resultList.isEmpty());
    }

    private List<Integer> executeEnumBindSql(Object value) throws SQLException {
        DataSource ds = getDataSource();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = ds.getConnection();
            String sql = "select * from MEMBER where MEMBER_STATUS_CODE = ?";
            log(sql);
            ps = conn.prepareStatement(sql);
            ps.setObject(1, value);
            rs = ps.executeQuery();
            List<Integer> idList = new ArrayList<Integer>();
            while (rs.next()) {
                idList.add(rs.getInt("MEMBER_ID"));
            }
            return idList;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private static enum TestPlainStatus {
        FML, PRV, WDL
    }

    // ===================================================================================
    //                                                                   CallableStatement
    //                                                                   =================
    public void test_CallableStatement_ResultSet_returnValue() throws SQLException {
        doTest_CallableResultSet("{call SP_RETURN_RESULT_SET()}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                boolean executed = cs.execute();
                log("executed = " + executed);
                assertTrue(executed);
                return cs.getResultSet();
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertFalse(cs.getMoreResults());
                assertNull(cs.getResultSet());
            }
        });
    }

    public void test_CallableStatement_ResultSet_returnValue_more() throws SQLException {
        doTest_CallableResultSet("{call SP_RETURN_RESULT_SET_MORE()}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                boolean executed = cs.execute();
                log("executed = " + executed);
                assertTrue(executed);
                return cs.getResultSet();
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertTrue(cs.getMoreResults());
                assertNotNull(cs.getResultSet());
                assertFalse(cs.getMoreResults());
            }
        });
    }

    public void test_CallableStatement_ResultSet_returnValue_with() throws SQLException {
        doTest_CallableResultSet("{call SP_RETURN_RESULT_SET_WITH(?, ?, ?)}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                cs.setString(1, CDef.MemberStatus.Formalized.code());
                cs.registerOutParameter(2, Types.VARCHAR);
                cs.setString(3, "ccc");
                boolean executed = cs.execute();
                log("executed = " + executed);
                assertTrue(executed);
                return cs.getResultSet();
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertTrue(cs.getMoreResults());
                assertNotNull(cs.getResultSet());
                assertFalse(cs.getMoreResults());
                assertNull(cs.getResultSet());
            }
        });
    }

    private void doTest_CallableResultSet(String sql, CallableResultSetCallback callback) throws SQLException {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall(sql);
            rs = callback.call(cs);
            assertNotNull(rs);
            boolean exists = false;
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(rs.getString(1));
                exists = true;
            }
            log("first columns = " + sb);
            assertTrue(exists);
            callback.post(cs, rs);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private static interface CallableResultSetCallback {
        ResultSet call(CallableStatement cs) throws SQLException;

        void post(CallableStatement cs, ResultSet rs) throws SQLException;
    }

    // ===================================================================================
    //                                                                           ResultSet
    //                                                                           =========
    public void test_ResultSet_defaultResultSetType() throws SQLException {
        String sql = "select * from VENDOR_CHECK";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            int resultSetType = rs.getType();
            log("/* * * * * * * * * * * * * * * * * *");
            if (resultSetType == ResultSet.TYPE_FORWARD_ONLY) {
                log("resultSetType=TYPE_FORWARD_ONLY");
            } else if (resultSetType == ResultSet.TYPE_SCROLL_INSENSITIVE) {
                log("resultSetType=TYPE_SCROLL_INSENSITIVE");
            } else if (resultSetType == ResultSet.TYPE_SCROLL_SENSITIVE) {
                log("resultSetType=TYPE_SCROLL_SENSITIVE");
            } else {
                log("resultSetType=UNKNOWN:" + resultSetType);
            }
            log("* * * * * * * * * */");
            assertEquals(ResultSet.TYPE_FORWARD_ONLY, resultSetType);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
