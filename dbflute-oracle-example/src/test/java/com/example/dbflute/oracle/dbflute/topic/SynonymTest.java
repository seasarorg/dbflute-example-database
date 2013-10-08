package com.example.dbflute.oracle.dbflute.topic;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;

import com.example.dbflute.oracle.dbflute.cbean.SynonymNextLinkSecretCB;
import com.example.dbflute.oracle.dbflute.cbean.SynonymRefExceptCB;
import com.example.dbflute.oracle.dbflute.cbean.VendorSynonymMemberCB;
import com.example.dbflute.oracle.dbflute.cbean.WhiteRefTargetCB;
import com.example.dbflute.oracle.dbflute.exbhv.SynonymExceptBhv;
import com.example.dbflute.oracle.dbflute.exbhv.SynonymNextLinkSecretBhv;
import com.example.dbflute.oracle.dbflute.exbhv.SynonymRefExceptBhv;
import com.example.dbflute.oracle.dbflute.exbhv.VendorSynonymMemberBhv;
import com.example.dbflute.oracle.dbflute.exbhv.WhiteRefTargetBhv;
import com.example.dbflute.oracle.dbflute.exbhv.WhiteTargetBhv;
import com.example.dbflute.oracle.dbflute.exentity.SynonymExcept;
import com.example.dbflute.oracle.dbflute.exentity.SynonymNextLinkSecret;
import com.example.dbflute.oracle.dbflute.exentity.SynonymRefExcept;
import com.example.dbflute.oracle.dbflute.exentity.VendorSynonymMember;
import com.example.dbflute.oracle.dbflute.exentity.WhiteRefTarget;
import com.example.dbflute.oracle.dbflute.exentity.WhiteTarget;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class SynonymTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorSynonymMemberBhv vendorSynonymMemberBhv;
    private SynonymExceptBhv synonymExceptBhv;
    private SynonymRefExceptBhv synonymRefExceptBhv;
    private SynonymNextLinkSecretBhv synonymNextLinkSecretBhv;
    private WhiteTargetBhv whiteTargetBhv;
    private WhiteRefTargetBhv whiteRefTargetBhv;

    // ===================================================================================
    //                                                                             Synonym
    //                                                                             =======
    public void test_selectList_Synonym() {
        // ## Arrange ##
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
        cb.setupSelect_MemberStatus();
        cb.setupSelect_SynonymMemberWithdrawalAsOne();
        cb.query().myselfInScope(new SubQuery<VendorSynonymMemberCB>() {
            public void query(VendorSynonymMemberCB subCB) {
                subCB.query().setMemberName_PrefixSearch("S");
                subCB.union(new UnionQuery<VendorSynonymMemberCB>() {
                    public void query(VendorSynonymMemberCB unionCB) {
                        unionCB.query().setMemberStatusCode_Equal_Withdrawal();
                    }
                });
            }
        });

        // ## Act ##
        final ListResultBean<VendorSynonymMember> memberList = vendorSynonymMemberBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        boolean existsWithdrawal = false;
        for (VendorSynonymMember member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
            assertNotNull(member.getMemberStatus());
            if (member.getSynonymMemberWithdrawalAsOne() != null) {
                existsWithdrawal = true;
            }
        }
        assertTrue(existsWithdrawal);
    }

    public void test_selectList_SynonymRelation_TableExcept_SynonymOnly() {
        // ## Arrange ##
        SynonymExcept synonymVendorExcept = new SynonymExcept();
        synonymVendorExcept.setExceptId(3L);
        synonymVendorExcept.setExceptName("ExceptName");
        synonymExceptBhv.insert(synonymVendorExcept);

        SynonymRefExcept synonymWhiteRefExcept = new SynonymRefExcept();
        synonymWhiteRefExcept.setRefExceptId(5L);
        synonymWhiteRefExcept.setExceptId(3L);
        synonymRefExceptBhv.insert(synonymWhiteRefExcept);

        SynonymRefExceptCB cb = new SynonymRefExceptCB();
        cb.setupSelect_SynonymExcept();

        // ## Act ##
        final ListResultBean<SynonymRefExcept> memberList = synonymRefExceptBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (SynonymRefExcept ref : memberList) {
            log(ref);
            SynonymExcept foreign = ref.getSynonymExcept();
            assertNotNull(foreign);
        }
    }

    public void test_selectList_SynonymRelation_TableTarget_SynonymExceot() {
        // ## Arrange ##
        WhiteTarget vendorTarget = new WhiteTarget();
        vendorTarget.setTargetId(3L);
        vendorTarget.setTargetName("TargetName");
        whiteTargetBhv.insert(vendorTarget);

        WhiteRefTarget vendorRefTarget = new WhiteRefTarget();
        vendorRefTarget.setRefTargetId(5L);
        vendorRefTarget.setTargetId(3L);
        whiteRefTargetBhv.insert(vendorRefTarget);

        WhiteRefTargetCB cb = new WhiteRefTargetCB();
        cb.setupSelect_WhiteTarget();

        // ## Act ##
        final ListResultBean<WhiteRefTarget> memberList = whiteRefTargetBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (WhiteRefTarget ref : memberList) {
            log(ref);
            WhiteTarget foreign = ref.getWhiteTarget();
            assertNotNull(foreign);
        }
    }

    public void test_selectList_DBLinkSynonym() {
        // ## Arrange ##
        SynonymNextLinkSecret secret = new SynonymNextLinkSecret();
        secret.setSecretCode("ABC");
        secret.setSecretName("ABC_NAME");
        synonymNextLinkSecretBhv.insert(secret);

        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
        cb.query().setSecretCode_Equal("ABC");

        // ## Act ##
        SynonymNextLinkSecret actual = synonymNextLinkSecretBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual);
        assertEquals("ABC", actual.getSecretCode());
        assertEquals("ABC_NAME", actual.getSecretName());
    }
}