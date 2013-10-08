package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.HashSet;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.util.DfTypeUtil;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberAddress;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneBasicTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                     Second Relation
    //                                                                     ===============
    public void test_secondRelation_same() {
        // ## Arrange ##
        int countAll = memberBhv.selectCount(new MemberCB());
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsValid(DfTypeUtil.toDate("2009/12/12"));
        cb.setupSelect_MemberAddressAsValidBefore(DfTypeUtil.toDate("2009/12/12"));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            MemberAddress addressAsValid = member.getMemberAddressAsValid();
            MemberAddress addressAsValidBefore = member.getMemberAddressAsValidBefore();
            log(member.getMemberName() + ", " + addressAsValid);
            assertEquals(addressAsValid, addressAsValidBefore);
        }
        assertEquals(countAll, memberList.size());
    }

    public void test_secondRelation_diff() {
        // ## Arrange ##
        int countAll = memberBhv.selectCount(new MemberCB());
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsValid(DfTypeUtil.toDate("2009/12/12"));
        cb.setupSelect_MemberAddressAsValidBefore(DfTypeUtil.toDate("2001/04/28"));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean exists = false;
        for (Member member : memberList) {
            MemberAddress addressAsValid = member.getMemberAddressAsValid();
            MemberAddress addressAsValidBefore = member.getMemberAddressAsValidBefore();
            if (addressAsValid != null) {
                if (!addressAsValid.equals(addressAsValidBefore)) {
                    log(member.getMemberName() + ", " + addressAsValid.getAddress() + ", "
                            + (addressAsValidBefore != null ? addressAsValidBefore.getAddress() : "null"));
                    exists = true;
                }
            }
        }
        assertTrue(exists);
        assertEquals(countAll, memberList.size());
    }

    // ===================================================================================
    //                                                                        CDef Binding
    //                                                                        ============
    public void test_CDefBinding() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsLoginStatus(CDef.MemberStatus.Formalized);
        cb.query().setMemberAccount_Equal("noexist");
        final HashSet<String> markSet = new HashSet<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                // ## Assert ##
                markSet.add("handle");
                assertTrue(info.getDisplaySql().contains("LOGIN_MEMBER_STATUS_CODE = 'FML'"));
            }
        });

        try {
            // ## Act ##
            ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

            // ## Assert ##
            assertHasZeroElement(memberList);
            assertTrue(markSet.contains("handle"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                           IfComment
    //                                                                           =========
    public void test_IfComment_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsIfComment(currentDate(), CDef.Region.千葉).withRegion();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        boolean exists = false;
        for (Member member : memberList) {
            MemberAddress address = member.getMemberAddressAsIfComment();
            if (address != null) {
                log(address + ", " + address.getRegion().getRegionName());
                assertTrue(address.isRegionId千葉());
                exists = true;
            }
        }
        assertTrue(exists);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsIgnoreCase(sql, "REGION_ID = '" + CDef.Region.千葉.code() + "'"));
    }

    public void test_IfComment_false() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsIfComment(currentDate(), null).withRegion();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        boolean exists = false;
        boolean existsMainRegion = false;
        boolean existsOtherRegion = false;
        for (Member member : memberList) {
            MemberAddress address = member.getMemberAddressAsIfComment();
            if (address != null) {
                log(address + ", " + address.getRegion().getRegionName());
                if (address.isRegionId千葉()) {
                    existsMainRegion = true;
                } else {
                    existsOtherRegion = true;
                }
                exists = true;
            }
        }
        assertTrue(exists);
        assertTrue(existsMainRegion);
        assertTrue(existsOtherRegion);
        String sql = cb.toDisplaySql();
        assertFalse(Srl.containsIgnoreCase(sql, "REGION_ID = '" + CDef.Region.千葉.code() + "'"));
    }
}