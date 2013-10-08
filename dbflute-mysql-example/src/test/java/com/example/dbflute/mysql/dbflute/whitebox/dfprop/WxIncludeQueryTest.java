package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.Date;
import java.util.List;

import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.coption.FromToOption;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.exception.ConditionInvokingFailureException;
import org.seasar.dbflute.util.DfCollectionUtil;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.0C (2011/08/23 Tuesday)
 */
public class WxIncludeQueryTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                        NormalColumn
    //                                                                        ============
    public void test_NormalColumn_String_included() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act & Assert ##
        // [included]
        // expect no exception
        cb.localCQ().invokeQuery("MEMBER_NAME", "Equal", "foo");
        cb.localCQ().invokeQuery("MEMBER_NAME", "NotEqual", "foo");
        cb.localCQ().invokeQuery("MEMBER_NAME", "InScope", DfCollectionUtil.newArrayList("foo"));
        cb.localCQ().invokeQuery("MEMBER_NAME", "NotInScope", DfCollectionUtil.newArrayList("bar"));
        cb.localCQ().invokeQuery("MEMBER_NAME", "PrefixSearch", "foo");
        cb.localCQ().invokeQuery("MEMBER_NAME", "LikeSearch", "foo", new LikeSearchOption().likeContain());
        cb.localCQ().invokeQuery("MEMBER_NAME", "NotLikeSearch", "foo", new LikeSearchOption().likeContain());

        // [excluded]
        doTest_invokeQuery_excluded(cb, "MEMBER_NAME", "foo", "GreaterThan", "LessThan", "GreaterEqual", "LessEqual");
    }

    public void test_NormalColumn_Date_included() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act & Assert ##
        // [included]
        // expect no exception
        cb.localCQ().invokeQuery("BIRTHDATE", "Equal", currentDate());
        cb.localCQ().invokeQuery("BIRTHDATE", "GreaterThan", currentDate());
        cb.localCQ().invokeQuery("BIRTHDATE", "LessThan", currentDate());
        cb.localCQ().invokeQuery("BIRTHDATE", "GreaterEqual", currentDate());
        cb.localCQ().invokeQuery("BIRTHDATE", "LessEqual", currentDate());
        List<Date> fromToList = DfCollectionUtil.newArrayList(currentDate(), currentDate());
        cb.localCQ().invokeQuery("BIRTHDATE", "FromTo", fromToList, new FromToOption().compareAsDate());
        cb.localCQ().invokeQuery("BIRTHDATE", "DateFromTo", fromToList);
        cb.localCQ().invokeQuery("BIRTHDATE", "IsNull", new Object());
        cb.localCQ().invokeQuery("BIRTHDATE", "IsNotNull", new Object());

        // [excluded]
        doTest_invokeQuery_excluded(cb, "BIRTHDATE", "2011/11/11", "NotEqual", "InScope", "NotInScope");
    }

    // ===================================================================================
    //                                                                        CommonColumn
    //                                                                        ============
    public void test_CommonColumn_String_excluded() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act & Assert ##
        // [included]
        // expect no exception
        cb.localCQ().invokeQuery("REGISTER_USER", "Equal", "foo");

        // [excluded]
        String name = "REGISTER_USER";
        doTest_invokeQuery_excluded(cb, name, "foo", "NotEqual");
        doTest_invokeQuery_excluded(cb, name, "foo", "GreaterThan", "LessThan", "GreaterEqual", "LessEqual");
        doTest_invokeQuery_excluded(cb, name, "foo", "InScope", "NotInScope");
        doTest_invokeQuery_excluded(cb, name, "foo", "PrefixSearch", "LikeSearch", "NotLikeSearch");
    }

    public void test_CommonColumn_Date_excluded() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act & Assert ##
        // [included]
        // expect no exception
        cb.localCQ().invokeQuery("REGISTER_DATETIME", "Equal", currentTimestamp());

        // [excluded]
        String name = "REGISTER_DATETIME";
        doTest_invokeQuery_excluded(cb, name, "2011/11/23", "NotEqual");
        doTest_invokeQuery_excluded(cb, name, "2011/11/23", "GreaterThan", "LessThan", "GreaterEqual", "LessEqual");
        doTest_invokeQuery_excluded(cb, name, "2011/11/23", "InScope", "NotInScope");
        doTest_invokeQuery_excluded(cb, name, "2011/11/23", "FromTo", "DateFromTo");
    }

    // ===================================================================================
    //                                                                           VersionNo
    //                                                                           =========
    public void test_VersionNo_Number_excluded() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act & Assert ##
        // [included]
        // expect no exception
        cb.localCQ().invokeQuery("VERSION_NO", "Equal", 1L);

        // [excluded]
        doTest_invokeQuery_excluded(cb, "VERSION_NO", 1, "NotEqual");
        doTest_invokeQuery_excluded(cb, "VERSION_NO", 1, "GreaterThan", "LessThan", "GreaterEqual", "LessEqual");
        doTest_invokeQuery_excluded(cb, "VERSION_NO", 1, "InScope", "NotInScope");
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void doTest_invokeQuery_excluded(ConditionBean cb, String columnName, Object value, String... ckeys) {
        for (String ckey : ckeys) {
            // ## Act ##
            try {
                cb.localCQ().invokeQuery(columnName, ckey, value);

                // ## Assert ##
                fail();
            } catch (ConditionInvokingFailureException e) {
                // OK
                log(e.getMessage());
                assertTrue(e.getMessage().contains("Not found the method"));
            }
        }
    }
}
