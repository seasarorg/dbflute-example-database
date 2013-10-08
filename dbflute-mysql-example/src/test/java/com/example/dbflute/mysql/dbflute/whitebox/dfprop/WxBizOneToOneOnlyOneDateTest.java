package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.Date;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.MemberAddressCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberAddress;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneOnlyOneDateTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private MemberAddressBhv memberAddressBhv;

    public void test_OnlyOneDate_basic() throws Exception {
        // ## Arrange ##
        Date currentDate = currentDate();
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsOnlyOneDate(currentDate);
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        MemberCB expectedCB = new MemberCB();
        expectedCB.setupSelect_MemberAddressAsValid(currentDate);
        expectedCB.query().addOrderBy_MemberId_Asc();
        ListResultBean<Member> expectedList = memberBhv.selectList(expectedCB);
        // assert detail just in case
        assertEquals(expectedList.size(), memberList.size());
        boolean exists = false;
        for (int i = 0; i < memberList.size(); i++) {
            Member expected = expectedList.get(i);
            Member member = memberList.get(i);
            MemberAddress address = member.getMemberAddressAsOnlyOneDate();
            log(member.getMemberName() + ", " + address);
            assertEquals(expected, member);
            MemberAddress expectedAddress = expected.getMemberAddressAsValid();
            if (!(expectedAddress == null && address != null)) {
                // if e.g. only 2003-2007 exists, different result
                exists = true;
                assertEquals(expectedAddress, address);
            }
        }
        assertTrue(exists);
        assertEquals(expectedList, memberList);
    }

    public void test_OnlyOneDate_query() throws Exception {
        // ## Arrange ##
        Date currentDate = currentDate();
        MemberAddressCB cb = new MemberAddressCB();
        cb.setupSelect_Member().withMemberAddressAsOnlyOneDate(currentDate);
        cb.query().queryMember().queryMemberAddressAsOnlyOneDate(currentDate).setMemberAddressId_IsNotNull();

        // ## Act ##
        ListResultBean<MemberAddress> addressList = memberAddressBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(addressList);
        for (MemberAddress address : addressList) {
            log(address.getMember().getMemberAddressAsOnlyOneDate());
        }
    }
}