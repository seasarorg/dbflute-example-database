package com.example.dbflute.sqlserver.dbflute.whitebox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.seasar.dbflute.bhv.InsertOption;
import org.seasar.dbflute.bhv.QueryInsertSetupper;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyExistsException;
import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberCB;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberBhv;
import com.example.dbflute.sqlserver.dbflute.exentity.Member;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.8 (2010/12/16 Thursday)
 */
public class WxSQLServerDisableIdentityTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_varyingInsert_disablePrimaryKeyIdentity_basic_Tx() throws Exception {
        // ## Arrange ##
        Integer directId = 99999;
        Member member = new Member();
        member.setMemberId(directId);
        member.setMemberName("foo");
        member.setMemberAccount("foo");
        member.setMemberStatusCode_Formalized();
        InsertOption<MemberCB> option = new InsertOption<MemberCB>().disablePrimaryKeyIdentity();

        // ## Act ##
        if (member.getDBMeta().hasIdentity()) { // mainly
            memberBhv.varyingInsert(member, option);
        } else {
            try {
                memberBhv.varyingInsert(member, option);
                fail();
            } catch (IllegalStateException e) {
                // OK
                log(e.getMessage());
                return;
            }
        }

        // ## Assert ##
        Member actual = memberBhv.selectByPKValueWithDeletedCheck(directId);
        assertEquals(directId, member.getMemberId());
        assertEquals(directId, actual.getMemberId());
        assertEquals("foo", actual.getMemberName());
        assertEquals(actual.getVersionNo(), member.getVersionNo());

        // ## Act ##
        try {
            member.setMemberName("bar");
            member.setMemberAccount("bar");
            memberBhv.varyingInsert(member, option);

            // ## Assert ##
            fail();
        } catch (EntityAlreadyExistsException e) {
            // OK
            log(e.getMessage());
        }

        // ## Act ##
        member.setMemberName("qux");
        member.setMemberAccount("qux");
        memberBhv.varyingInsert(member, new InsertOption<MemberCB>()); // back to identity

        // ## Assert ##
        assertNotNull(member.getMemberId());
        assertNotSame(directId, member.getMemberId());

        // ## Act ##
        member.setMemberName("quux");
        member.setMemberAccount("quux");
        memberBhv.insert(member); // back to identity

        // ## Assert ##
        assertNotNull(member.getMemberId());
        assertNotSame(directId, member.getMemberId());
    }

    // ===================================================================================
    //                                                                        Batch Insert
    //                                                                        ============
    public void test_varyingBatchInsert_disablePrimaryKeyIdentity_Tx() throws Exception {
        // ## Arrange ##
        List<Member> memberList = new ArrayList<Member>();
        {
            Member member = new Member();
            member.setMemberId(99991);
            member.setMemberName("foo1");
            member.setMemberAccount("foo1");
            member.setMemberStatusCode_Formalized();
            memberList.add(member);
        }
        {
            Member member = new Member();
            member.setMemberId(99992);
            member.setMemberName("foo2");
            member.setMemberAccount("foo2");
            member.setMemberStatusCode_Formalized();
            memberList.add(member);
        }
        InsertOption<MemberCB> option = new InsertOption<MemberCB>().disablePrimaryKeyIdentity();

        // ## Act ##
        if (MemberDbm.getInstance().hasIdentity()) { // mainly
            memberBhv.varyingBatchInsert(memberList, option);
        } else {
            try {
                memberBhv.varyingBatchInsert(memberList, option);
                fail();
            } catch (IllegalStateException e) {
                // OK
                log(e.getMessage());
                return;
            }
        }

        // ## Assert ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(Arrays.asList(memberList.get(0).getMemberId(), memberList.get(1).getMemberId()));
        ListResultBean<Member> actualList = memberBhv.selectList(cb);
        assertNotSame(0, actualList.size());
        assertEquals(Integer.valueOf(99991), memberList.get(0).getMemberId());
        assertEquals(Integer.valueOf(99992), memberList.get(1).getMemberId());
        assertEquals(Integer.valueOf(99991), actualList.get(0).getMemberId());
        assertEquals(Integer.valueOf(99992), actualList.get(1).getMemberId());

        // ## Act ##
        try {
            int index = 1;
            for (Member member : memberList) {
                member.setMemberName("bar" + index);
                member.setMemberAccount("bar" + index);
                ++index;
            }
            memberBhv.varyingBatchInsert(memberList, option);

            // ## Assert ##
            fail();
        } catch (EntityAlreadyExistsException e) {
            // OK
            log(e.getMessage());
        }

        // ## Act ##
        {
            int index = 1;
            for (Member member : memberList) {
                member.setMemberName("qux" + index);
                member.setMemberAccount("qux" + index);
                ++index;
            }
            memberBhv.varyingBatchInsert(memberList, new InsertOption<MemberCB>()); // back to identity

            // ## Assert ##
            assertEquals(Integer.valueOf(99991), memberList.get(0).getMemberId());
            assertEquals(Integer.valueOf(99992), memberList.get(1).getMemberId());
            assertNotSame(Integer.valueOf(99991), actualList.get(0).getMemberId());
            assertNotSame(Integer.valueOf(99992), actualList.get(1).getMemberId());
        }

        // ## Act ##
        {
            int index = 1;
            for (Member member : memberList) {
                member.setMemberName("quux" + index);
                member.setMemberAccount("quux" + index);
                ++index;
            }
            memberBhv.batchInsert(memberList); // back to identity

            // ## Assert ##
            assertEquals(Integer.valueOf(99991), memberList.get(0).getMemberId());
            assertEquals(Integer.valueOf(99992), memberList.get(1).getMemberId());
            assertNotSame(Integer.valueOf(99991), actualList.get(0).getMemberId());
            assertNotSame(Integer.valueOf(99992), actualList.get(1).getMemberId());
        }
    }

    // ===================================================================================
    //                                                                        Query Insert
    //                                                                        ============
    public void test_queryInsert_IdentityEnabled_Tx() {
        // ## Arrange ##
        // ## Act ##
        try {
            memberBhv.queryInsert(new QueryInsertSetupper<Member, MemberCB>() {
                public ConditionBean setup(Member entity, MemberCB intoCB) {
                    MemberStatusCB cb = new MemberStatusCB();
                    intoCB.specify().columnMemberId().mappedFrom(cb.specify().columnDisplayOrder());
                    intoCB.specify().columnMemberName().mappedFrom(cb.specify().columnMemberStatusName());
                    intoCB.specify().columnMemberAccount().mappedFrom(cb.specify().columnMemberStatusCode());
                    entity.setMemberStatusCode_Provisional();
                    return cb;
                }
            });

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            assertFalse(e instanceof EntityAlreadyExistsException);
            log(e.getMessage());
        }
    }

    public void test_varyingQueryInsert_IdentityDisabled_Tx() {
        // ## Arrange ##
        // ## Act ##
        try {
            memberBhv.varyingQueryInsert(new QueryInsertSetupper<Member, MemberCB>() {
                public ConditionBean setup(Member entity, MemberCB intoCB) {
                    MemberStatusCB cb = new MemberStatusCB();
                    intoCB.specify().columnMemberId().mappedFrom(cb.specify().columnDisplayOrder());
                    intoCB.specify().columnMemberName().mappedFrom(cb.specify().columnMemberStatusName());
                    intoCB.specify().columnMemberAccount().mappedFrom(cb.specify().columnMemberStatusCode());
                    entity.setMemberStatusCode_Provisional();
                    return cb;
                }
            }, new InsertOption<MemberCB>().disablePrimaryKeyIdentity());

            // ## Assert ##
            fail();
        } catch (EntityAlreadyExistsException e) {
            // OK
            log(e.getMessage());
        }
    }
}