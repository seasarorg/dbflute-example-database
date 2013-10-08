package com.example.dbflute.oracle.dbflute.whitebox.dfprop;

import com.example.dbflute.oracle.dbflute.cbean.MemberCB;
import com.example.dbflute.oracle.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.oracle.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.OptionMemberPmb;
import com.example.dbflute.oracle.dbflute.exentity.MemberStatus;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.1 (2009/11/17 Tuesday)
 */
public class WxShortCharHandlingRFillTest extends UnitContainerTestCase {

    private MemberStatusBhv memberStatusBhv;

    public void test_shortChar_conditionBean_rfill() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act ##
        cb.query().setMemberStatusCode_Equal("AB");

        // ## Assert ##
        assertEquals("AB ", cb.query().getMemberStatusCode().getFixedQuery().get("equal"));
    }

    public void test_shortChar_conditionBean_rfill_select() {
        // ## Arrange ##
        MemberStatus memberStatus = new MemberStatus();
        memberStatus.setMemberStatusCode("AB ");
        memberStatus.setMemberStatusName("ShortTest "); // varchar
        memberStatus.setDescription("foo");
        memberStatus.setDisplayOrder(99L);
        memberStatusBhv.insert(memberStatus);

        MemberStatusCB cb = new MemberStatusCB();
        cb.query().setMemberStatusCode_Equal("AB");

        // ## Act ##
        MemberStatus actual = memberStatusBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("ShortTest ", actual.getMemberStatusName()); // varchar
        assertEquals("AB ", actual.getMemberStatusCode());
    }

    public void test_shortChar_parameterBean_rfill() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        pmb.setMemberStatusCode("AB");
        pmb.setStatus("AB");

        // ## Assert ##
        assertEquals("AB", pmb.getMemberStatusCode());
        assertEquals("AB ", pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfill_null() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        pmb.setMemberStatusCode(null);
        pmb.setStatus(null);

        // ## Assert ##
        assertNull(pmb.getMemberStatusCode());
        assertNull(pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfill_empty() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        pmb.setMemberStatusCode("");
        pmb.setStatus("");

        // ## Assert ##
        assertNull(pmb.getMemberStatusCode());
        assertNull(pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfill_oneSpace() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        pmb.setMemberStatusCode(" ");
        pmb.setStatus(" ");

        // ## Assert ##
        assertEquals(" ", pmb.getMemberStatusCode());
        assertEquals("   ", pmb.getStatus());
    }
}
