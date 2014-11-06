package com.example.dbflute.postgresql.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;

import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5 (2009/04/30 Thursday)
 */
public class WxBhvQueryUpdatePostgreSQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    public void test_queryUpdate_basic() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("queryUpdate()");
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();

        // ## Act ##
        int updatedCount = memberBhv.queryUpdate(member, cb);

        // ## Assert ##
        assertNotSame(0, updatedCount);
        MemberCB actualCB = new MemberCB();
        actualCB.query().setMemberName_Equal("queryUpdate()");
        actualCB.query().setMemberStatusCode_Equal_Provisional();
        actualCB.query().setFormalizedDatetime_IsNull();
        actualCB.query().setUpdateUser_Equal(getAccessContext().getAccessUser()); // common column
        ListResultBean<Member> actualList = memberBhv.selectList(actualCB);
        assertEquals(actualList.size(), updatedCount);
    }

    public void test_queryUpdate_OuterJoin() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("queryUpdate");
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");
        cb.query().queryMemberStatus().setDisplayOrder_GreaterEqual(2);
        ListResultBean<Member> beforeList = memberBhv.selectList(cb);

        // ## Act ##
        memberBhv.queryUpdate(member, cb);

        // ## Assert ##
        MemberCB actualCB = new MemberCB();
        actualCB.query().setMemberName_Equal("queryUpdate");
        ListResultBean<Member> actualList = memberBhv.selectList(actualCB);
        assertEquals(beforeList.size(), actualList.size());
        assertHasAnyElement(actualList);
        for (Member actual : actualList) {
            assertEquals("queryUpdate", actual.getMemberName());
            assertTrue(actual.isMemberStatusCodeProvisional());
            assertNull(actual.getFormalizedDatetime());
        }
    }

    public void test_queryUpdate_Union() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("queryUpdate");
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberStatusCode_Equal_Withdrawal();
            }
        });

        // ## Act ##
        int updated = memberBhv.queryUpdate(member, cb);

        // ## Assert ##
        MemberCB actualCB = new MemberCB();
        actualCB.query().setMemberName_Equal("queryUpdate");
        assertEquals(memberBhv.selectCount(actualCB), updated);
    }

    public void test_queryUpdate_ExistsReferrer() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchasePrice_GreaterEqual(2000);
            }
        });

        // ## Act ##
        int updatedCount = memberBhv.queryUpdate(member, cb);

        // ## Assert ##
        MemberCB actualCB = new MemberCB();
        actualCB.query().setMemberStatusCode_Equal_Provisional();
        actualCB.query().setFormalizedDatetime_IsNull();
        actualCB.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchasePrice_GreaterEqual(2000);
            }
        });
        assertEquals(memberBhv.selectCount(actualCB), updatedCount);
    }

    // ===================================================================================
    //                                                                        Query Delete
    //                                                                        ============
    public void test_queryDelete_basic() {
        // ## Arrange ##
        deleteMemberReferrer(); // for Test

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();

        // ## Act ##
        int deletedCount = memberBhv.queryDelete(cb);

        // ## Assert ##
        assertNotSame(0, deletedCount);
        assertEquals(0, memberBhv.selectCount(cb));
    }

    public void test_queryDelete_OuterJoin() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().queryMemberStatus().setMemberStatusName_PrefixSearch("S");

        // ## Act ##
        int deleted = memberBhv.queryDelete(cb);

        // ## Assert ##
        assertEquals(0, deleted);
    }

    public void test_queryDelete_Union() {
        // ## Arrange ##
        deleteMemberReferrer();
        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberStatusCode_Equal_Withdrawal();
            }
        });

        // ## Act ##
        memberBhv.queryDelete(cb);

        // ## Assert ##
        assertEquals(0, memberBhv.selectCount(cb));
    }

    public void test_queryDelete_ExistsReferrer() {
        // ## Arrange ##
        deleteMemberReferrer();
        MemberCB cb = new MemberCB();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchasePrice_GreaterEqual(2000);
            }
        });

        // ## Act ##
        int deleted = memberBhv.queryDelete(cb);

        // ## Assert ##
        assertEquals(memberBhv.selectCount(cb), deleted);
    }
}
