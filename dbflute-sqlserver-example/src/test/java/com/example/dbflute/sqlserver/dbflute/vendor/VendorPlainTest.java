package com.example.dbflute.sqlserver.dbflute.vendor;

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
import java.util.List;

import javax.sql.DataSource;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.sqlserver.dbflute.allcommon.CDef;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberCB;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.sqlserver.dbflute.cbean.cq.MemberStatusCQ;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.sqlserver.dbflute.exentity.Member;
import com.example.dbflute.sqlserver.dbflute.exentity.MemberStatus;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.8.2 (2008/10/23 Thursday)
 */
public class VendorPlainTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;

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
        member.setBirthdate(DfTypeUtil.toTimestamp("-2009/12/25"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPKValue(member.getMemberId());
        DateFormat df = new SimpleDateFormat("Gyyyy/MM/dd");
        log(df.format(actual.getBirthdate()));
        assertFalse(DfTypeUtil.isDateBC(actual.getBirthdate())); // cannot handle BC date
        assertTrue(df.format(actual.getBirthdate()).contains("2009/12/26")); // Oops?
    }

    public void test_BC_datetime() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setFormalizedDatetime_IsNotNull();
        cb.fetchFirst(1);
        cb.addOrderBy_PK_Asc();
        Member member = memberBhv.selectEntity(cb);
        member.setFormalizedDatetime(DfTypeUtil.toTimestamp("-2009/12/25 12:34:56.147"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPKValue(member.getMemberId());
        DateFormat df = new SimpleDateFormat("Gyyyy/MM/dd HH:mm:dd.SSS");
        log(df.format(actual.getFormalizedDatetime()));
        assertFalse(DfTypeUtil.isDateBC(actual.getFormalizedDatetime())); // cannot handle BC date
        assertTrue(df.format(actual.getFormalizedDatetime()).contains("2009/12/26")); // Oops?
    }

    // ===================================================================================
    //                                                                          Short Char
    //                                                                          ==========
    public void test_shortChar_inout_trimmed_value() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB";
        String name = "ShortTest";
        Integer order = 96473;
        MemberStatus memberStatus = new MemberStatus();
        memberStatus.setMemberStatusCode(code); // char
        memberStatus.setMemberStatusName(name); // varchar
        memberStatus.setDescription("foo");
        memberStatus.setDisplayOrder(order);
        memberStatusBhv.insert(memberStatus);

        MemberStatusCB cb = new MemberStatusCB();
        cb.query().setMemberStatusCode_Equal(code + " ");

        // ## Act ##
        MemberStatus actual = memberStatusBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code + " ", actual.getMemberStatusCode()); // DB remains it
        assertEquals(name, actual.getMemberStatusName());
    }

    public void test_shortChar_inout_filled_value() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB ";
        String name = "ShortTest";
        Integer order = 96473;
        MemberStatus memberStatus = new MemberStatus();
        memberStatus.setMemberStatusCode(code); // char
        memberStatus.setMemberStatusName(name); // varchar
        memberStatus.setDescription("foo");
        memberStatus.setDisplayOrder(order);
        memberStatusBhv.insert(memberStatus);

        MemberStatusCB cb = new MemberStatusCB();
        cb.query().setMemberStatusCode_Equal(code);

        // ## Act ##
        MemberStatus actual = memberStatusBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code, actual.getMemberStatusCode()); // DB remains it
        assertEquals(name, actual.getMemberStatusName());
    }

    public void test_shortChar_condition() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB ";
        String name = "ShortTest";
        Integer order = 96473; // should be unique order
        MemberStatus memberStatus = new MemberStatus();
        memberStatus.setMemberStatusCode(code); // char
        memberStatus.setMemberStatusName(name); // varchar
        memberStatus.setDescription("foo");
        memberStatus.setDisplayOrder(order);
        memberStatusBhv.insert(memberStatus);

        MemberStatusCB cb = new MemberStatusCB() {
            // internal manipulation (Don't mimic it)
            @Override
            protected MemberStatusCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName,
                    int nestLevel) {
                return new MemberStatusCQ(childQuery, sqlClause, aliasName, nestLevel) {
                    @Override
                    protected String hSC(String propertyName, String value, Integer size, String modeCode) {
                        return value; // do nothing for not depending on shortCharHandlingMode
                    }
                };
            }
        };
        cb.query().setMemberStatusCode_Equal(code.trim());
        assertTrue(cb.toDisplaySql().contains("'AB'"));

        // ## Act ##
        MemberStatus actual = memberStatusBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code, actual.getMemberStatusCode());
        assertEquals(name, actual.getMemberStatusName());
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
        try {
            executeEnumBindSql(TestPlainStatus.FML);

            // ## Assert ##
            fail();
        } catch (SQLException e) {
            // OK
            log(e.getMessage());
        }
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
    public void test_CallableStatement_ResultSet_parameter() throws SQLException {
        doTest_CallableResultSet("{call SP_RESULT_SET_PARAMETER(?)}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                cs.setNull(1, Types.OTHER);
                cs.registerOutParameter(1, Types.OTHER);
                try {
                    boolean executed = cs.execute();

                    fail("executed = " + executed);
                } catch (SQLException e) {
                    // may be unsupported
                    // refer to ProcedureTest for details
                    log(e.getMessage());
                }
                return null; //cs.getObject(1);
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertNull(rs);
            }
        });
    }

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
        doTest_CallableResultSet("{? = call SP_RETURN_RESULT_SET_MORE('FML')}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                cs.registerOutParameter(1, Types.INTEGER);
                boolean executed = cs.execute();
                log("executed = " + executed);
                assertTrue(executed);
                assertNotNull(cs.getResultSet());
                assertTrue(cs.getMoreResults());
                return cs.getResultSet();
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
                assertFalse(cs.getMoreResults());
                assertNull(cs.getResultSet());
                String returnValue = cs.getString(1);
                log("returnValue = " + returnValue);
                assertEquals("0", returnValue);
            }
        });
    }

    public void test_CallableStatement_ResultSet_tableFunction_with() throws SQLException {
        doTest_CallableResultSet("select * from FN_RETURN_TABLE(?)", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                cs.setString(1, "FML");
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

    private void doTest_CallableResultSet(String sql, CallableResultSetCallback callback) throws SQLException {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall(sql);
            rs = callback.call(cs);
            if (rs != null) { // null means the procedure cannot be called
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
            }
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
