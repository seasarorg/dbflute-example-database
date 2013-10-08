package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberSecurity;
import com.example.dbflute.mysql.dbflute.exentity.MemberStatus;
import com.example.dbflute.mysql.dbflute.nogen.cache.CachedMemberSecurity;
import com.example.dbflute.mysql.dbflute.nogen.cache.CachedMemberStatus;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.1B (2011/10/14 Friday)
 */
public class WxRelationalNullObjectTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;
    private MemberSecurityBhv memberSecurityBhv;

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        CachedMemberStatus.clear();
        CachedMemberSecurity.clear();
    }

    // ===================================================================================
    //                                                                           ManyToOne
    //                                                                           =========
    public void test_NullObject_cached_ManyToOne() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberStatus> statusList = memberStatusBhv.selectList(new MemberStatusCB());
        for (MemberStatus status : statusList) {
            CachedMemberStatus.put(status);
        }
        Member member = memberBhv.selectByPKValueWithDeletedCheck(3);

        // ## Act ##
        MemberStatus status = member.getMemberStatus();

        // ## Assert ##
        log("status = " + status);
        assertNotNull(status);
        assertEquals(member.getMemberStatusCode(), status.getMemberStatusCode());
    }

    public void test_NullObject_setupSelect_ManyToOne() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberStatus> statusList = memberStatusBhv.selectList(new MemberStatusCB());
        for (MemberStatus status : statusList) {
            status.setMemberStatusName("foo");
            CachedMemberStatus.put(status);
        }
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.fetchFirst(1);
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Act ##
        MemberStatus status = member.getMemberStatus();

        // ## Assert ##
        log("status = " + status);
        assertNotNull(status);
        assertEquals(member.getMemberStatusCode(), status.getMemberStatusCode());
        assertEquals(CDef.MemberStatus.Formalized.alias(), status.getMemberStatusName());
    }

    // ===================================================================================
    //                                                                            OneToOne
    //                                                                            ========
    public void test_NullObject_cached_OneToOne() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberSecurity> securityList = memberSecurityBhv.selectList(new MemberSecurityCB());
        for (MemberSecurity security : securityList) {
            CachedMemberSecurity.put(security);
        }
        Member member = memberBhv.selectByPKValueWithDeletedCheck(3);

        // ## Act ##
        MemberSecurity security = member.getMemberSecurityAsOne();

        // ## Assert ##
        log("security = " + security);
        assertNotNull(security);
        assertEquals(member.getMemberId(), security.getMemberId());
    }
}
