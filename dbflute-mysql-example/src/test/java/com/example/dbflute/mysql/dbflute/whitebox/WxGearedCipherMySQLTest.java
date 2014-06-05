package com.example.dbflute.mysql.dbflute.whitebox;

import java.security.MessageDigest;
import java.sql.Timestamp;
import java.util.Date;

import org.seasar.dbflute.bhv.UpdateOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.ManualOrderBean;
import org.seasar.dbflute.cbean.ScalarQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.cbean.coption.RangeOfOption;
import org.seasar.dbflute.cbean.coption.ScalarSelectOption;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteGearedCipherCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteGearedCipherBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberSecurity;
import com.example.dbflute.mysql.dbflute.exentity.MemberStatus;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.dbflute.exentity.WhiteGearedCipher;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.8.2 (2011/04/04 Monday)
 */
public class WxGearedCipherMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;
    private MemberSecurityBhv memberSecurityBhv;
    private PurchaseBhv purchaseBhv;
    private WhiteGearedCipherBhv whiteGearedCipherBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_select_query_Equal_encryptOnly() throws Exception {
        // ## Arrange ##
        MemberSecurity security = encryptLoginPassword();
        String encryptedPwd = security.getLoginPassword();
        MemberSecurityCB cb = new MemberSecurityCB();
        cb.query().setLoginPassword_Equal(encryptedPwd);

        // ## Act ##
        MemberSecurity actual = memberSecurityBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String loginPassword = actual.getLoginPassword();
        log(security.getMemberId() + ", " + loginPassword);
        MessageDigest digest = MessageDigest.getInstance("SHA1");
        digest.update(encryptedPwd.getBytes("UTF-8"));
        String expected = hash(digest.digest());
        assertEquals(expected, loginPassword);
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.contains(displaySql, "dfloc.LOGIN_PASSWORD = sha1('cipher')"));
    }

    public void test_select_query_Equal_invertible() throws Exception {
        // ## Arrange ##
        Member member = encryptUpdateUser();
        String encryptedUser = member.getUpdateUser();
        MemberCB cb = new MemberCB();
        cb.query().setUpdateUser_Equal(encryptedUser);

        // ## Act ##
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String actualUpdateUser = actual.getUpdateUser();
        log(member.getMemberId() + ", " + actualUpdateUser);
        assertEquals(encryptedUser, actualUpdateUser);
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.contains(displaySql, "dfloc.UPDATE_USER = hex(aes_encrypt('cipher', 'himitsu'))"));
    }

    public void test_select_query_GreaterLess_invertible() throws Exception {
        // ## Arrange ##
        Member member = encryptUpdateUser();
        String encryptedUser = member.getUpdateUser();
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(member.getMemberId());
        cb.query().setUpdateUser_GreaterThan("aipher");
        cb.query().setUpdateUser_LessThan("wipher");

        // ## Act ##
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String actualUpdateUser = actual.getUpdateUser();
        log(member.getMemberId() + ", " + actualUpdateUser);
        assertEquals(encryptedUser, actualUpdateUser);
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.containsAll(displaySql, "aes_decrypt", "'aipher'", "'wipher'", "'himitsu'"));
        assertFalse(Srl.containsAny(displaySql, "aes_encrypt", "'cipher'"));
    }

    public void test_select_query_NotEqual_encryptOnly() throws Exception {
        // ## Arrange ##
        MemberSecurity encrypted = encryptLoginPassword();
        Integer encryptedMemberId = encrypted.getMemberId();
        String plainPassword = encrypted.getLoginPassword();
        MemberSecurityCB cb = new MemberSecurityCB();
        cb.query().setLoginPassword_NotEqual(plainPassword);

        // ## Act ##
        ListResultBean<MemberSecurity> securityList = memberSecurityBhv.selectList(cb);

        // ## Assert ##
        MessageDigest digest = MessageDigest.getInstance("SHA1");
        digest.update(plainPassword.getBytes("UTF-8"));
        String expected = hash(digest.digest());
        for (MemberSecurity security : securityList) {
            String loginPassword = security.getLoginPassword();
            Integer memberId = security.getMemberId();
            log(memberId + ", " + loginPassword + " | expected=" + expected);
            assertNotSame(encryptedMemberId, memberId);
            assertNotSame(expected, loginPassword);
        }
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "dfloc.LOGIN_PASSWORD <> sha1('cipher')"));
    }

    // ===================================================================================
    //                                                                          LikeSearch
    //                                                                          ==========
    public void test_LikeSearch_encryptOnly() throws Exception {
        // ## Arrange ##
        encryptUpdateUser();
        MemberSecurityCB cb = new MemberSecurityCB();
        LikeSearchOption option = new LikeSearchOption().likeContain();
        cb.query().setLoginPassword_LikeSearch("1", option); // to encrypted string

        // ## Act ##
        memberSecurityBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "dfloc.LOGIN_PASSWORD like '%1%' escape '|'"));
    }

    public void test_LikeSearch_invertible() throws Exception {
        // ## Arrange ##
        Member member = encryptUpdateUser();
        String encryptedUser = member.getUpdateUser();
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(member.getMemberId());
        cb.query().setUpdateUser_LikeSearch("ci", new LikeSearchOption().likePrefix());
        cb.query().setUpdateUser_GreaterThan("aipher");
        cb.query().setUpdateUser_LessThan("wipher");

        // ## Act ##
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String actualUpdateUser = actual.getUpdateUser();
        log(member.getMemberId() + ", " + actualUpdateUser);
        assertEquals(encryptedUser, actualUpdateUser);
        String sql = cb.toDisplaySql();
        String decryptExp = "convert(aes_decrypt(unhex(dfloc.UPDATE_USER), 'himitsu') using utf8)";
        assertTrue(Srl.contains(sql, "and " + decryptExp + " like 'ci%' escape '|'"));
    }

    public void test_LikeSearch_CompoundColumn_encryptOnly() throws Exception {
        // ## Arrange ##
        encryptUpdateUser();
        MemberCB cb = new MemberCB();
        LikeSearchOption option = new LikeSearchOption().likeContain();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        option.addCompoundColumn(dreamCruiseCB.specify().columnUpdateUser());
        cb.query().queryMemberSecurityAsOne().setLoginPassword_LikeSearch("cipher", option);
        cb.query().setUpdateUser_GreaterThan("aipher");
        cb.query().setUpdateUser_LessThan("wipher");

        // ## Act ##
        memberBhv.selectEntityWithDeletedCheck(cb); // expect no exception

        // ## Assert ##
        String sql = cb.toDisplaySql();
        String decryptExp = "convert(aes_decrypt(unhex(dfloc.UPDATE_USER), 'himitsu') using utf8)";
        StringBuilder sb = new StringBuilder();
        sb.append(".LOGIN_PASSWORD, ").append(decryptExp);
        sb.append(") like '%cipher%' escape '|'");
        assertTrue(Srl.contains(sql, sb.toString()));
    }

    public void test_LikeSearch_CompoundColumn_invertible_basic() throws Exception {
        // ## Arrange ##
        Member member = encryptUpdateUser();
        String encryptedUser = member.getUpdateUser();
        MemberCB cb = new MemberCB();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().setMemberId_Equal(member.getMemberId());
        LikeSearchOption option = new LikeSearchOption().likePrefix();
        option.addCompoundColumn(dreamCruiseCB.specify().columnMemberAccount());
        cb.query().setUpdateUser_LikeSearch("ci", option);
        cb.query().setUpdateUser_GreaterThan("aipher");
        cb.query().setUpdateUser_LessThan("wipher");

        // ## Act ##
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String actualUpdateUser = actual.getUpdateUser();
        log(member.getMemberId() + ", " + actualUpdateUser);
        assertEquals(encryptedUser, actualUpdateUser);
        String decryptExp = "convert(aes_decrypt(unhex(dfloc.UPDATE_USER), 'himitsu') using utf8)";
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "and concat(" + decryptExp + ", dfloc.MEMBER_ACCOUNT) like 'ci%' escape '|'"));
    }

    public void test_LikeSearch_CompoundColumn_invertible_more() throws Exception {
        // ## Arrange ##
        Member member = encryptUpdateUser();
        String encryptedUser = member.getUpdateUser();
        MemberCB cb = new MemberCB();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().setMemberId_Equal(member.getMemberId());
        LikeSearchOption option = new LikeSearchOption().likeContain();
        option.addCompoundColumn(dreamCruiseCB.specify().columnMemberAccount());
        option.addCompoundColumn(dreamCruiseCB.specify().columnUpdateUser());
        option.addCompoundColumn(dreamCruiseCB.specify().specifyMemberSecurityAsOne().columnLoginPassword());
        cb.query().setUpdateUser_LikeSearch("pher", option);
        cb.query().setUpdateUser_GreaterThan("aipher");
        cb.query().setUpdateUser_LessThan("wipher");

        // ## Act ##
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String actualUpdateUser = actual.getUpdateUser();
        log(member.getMemberId() + ", " + actualUpdateUser);
        assertEquals(encryptedUser, actualUpdateUser);
        String sql = cb.toDisplaySql();
        String decryptExp = "convert(aes_decrypt(unhex(dfloc.UPDATE_USER), 'himitsu') using utf8)";
        // MEMBER_ACCOUNT is not encrypt target
        String front = "and concat(" + decryptExp + ", dfloc.MEMBER_ACCOUNT, " + decryptExp + ", ";
        String rear = ".LOGIN_PASSWORD) like '%pher%' escape '|'"; // LOGIN_PASSWORD is non-invertible
        assertTrue(Srl.containsAll(sql, front, rear));
    }

    // ===================================================================================
    //                                                                             RangeOf
    //                                                                             =======
    public void test_RangeOf_invertible() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPurchasePrice(999999999);
        purchaseBhv.updateNonstrict(purchase);
        PurchaseCB cb = new PurchaseCB();
        cb.query().setPurchaseId_Equal(3L);
        RangeOfOption option = new RangeOfOption();
        cb.query().setPurchasePrice_RangeOf(999999999, 999999999, option);

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(999999999, actual.getPurchasePrice());
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.contains(displaySql, "and (dfloc.PURCHASE_PRICE - 13) >= 999999999"));
        assertTrue(Srl.contains(displaySql, "and (dfloc.PURCHASE_PRICE - 13) <= 999999999"));
    }

    public void test_RangeOf_orIsNull_invertible() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPurchasePrice(999999999);
        purchaseBhv.updateNonstrict(purchase);
        PurchaseCB cb = new PurchaseCB();
        cb.query().setPurchaseId_Equal(3L);
        RangeOfOption option = new RangeOfOption().orIsNull();
        cb.query().setPurchasePrice_RangeOf(999999999, 999999999, option);

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(999999999, actual.getPurchasePrice());
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "and ((dfloc.PURCHASE_PRICE - 13) >= 999999999 or dfloc.PURCHASE_PRICE is null)"));
        assertTrue(Srl.contains(sql, "and ((dfloc.PURCHASE_PRICE - 13) <= 999999999 or dfloc.PURCHASE_PRICE is null)"));
    }

    public void test_RangeOf_Calculation_invertible() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPurchaseCount(999999999); // count!
        purchaseBhv.updateNonstrict(purchase);
        PurchaseCB cb = new PurchaseCB();
        PurchaseCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().setPurchaseId_Equal(3L);
        RangeOfOption option = new RangeOfOption();
        option.plus(dreamCruiseCB.specify().columnPurchaseCount());
        option.minus(dreamCruiseCB.specify().columnPurchasePrice());
        cb.query().setPurchasePrice_RangeOf(999999999, 999999999, option);

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(999999999, actual.getPurchaseCount());
        String sql = cb.toDisplaySql();
        String decryptExp = "(dfloc.PURCHASE_PRICE - 13)";
        String leftExp = "(" + decryptExp + " + dfloc.PURCHASE_COUNT) - " + decryptExp;
        assertTrue(Srl.contains(sql, leftExp + " >= 999999999"));
        assertTrue(Srl.contains(sql, leftExp + " <= 999999999"));
    }

    // ===================================================================================
    //                                                                         ColumnQuery
    //                                                                         ===========
    public void test_ColumnQuery_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.columnQuery(new SpecifyQuery<PurchaseCB>() {
            public void specify(PurchaseCB cb) {
                cb.specify().columnPurchasePrice();
            }
        }).greaterThan(new SpecifyQuery<PurchaseCB>() {
            public void specify(PurchaseCB cb) {
                cb.specify().columnPurchasePrice();
            }
        });

        // ## Act ##
        purchaseBhv.selectList(cb);

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains("(dfloc.PURCHASE_PRICE - 13) > (dfloc.PURCHASE_PRICE - 13)"));
    }

    public void test_ColumnQuery_calculation_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.columnQuery(new SpecifyQuery<PurchaseCB>() {
            public void specify(PurchaseCB cb) {
                cb.specify().columnPurchasePrice();
            }
        }).greaterThan(new SpecifyQuery<PurchaseCB>() {
            public void specify(PurchaseCB cb) {
                cb.specify().columnPurchasePrice();
            }
        }).multiply(3);

        // ## Act ##
        purchaseBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains("(dfloc.PURCHASE_PRICE - 13) > (dfloc.PURCHASE_PRICE - 13) * 3"));
    }

    public void test_ColumnQuery_calculation_dream() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        final PurchaseCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.columnQuery(new SpecifyQuery<PurchaseCB>() {
            public void specify(PurchaseCB cb) {
                cb.specify().columnPurchasePrice();
            }
        }).greaterThan(new SpecifyQuery<PurchaseCB>() {
            public void specify(PurchaseCB cb) {
                cb.overTheWaves(dreamCruiseCB.specify().columnPurchasePrice());
            }
        }).multiply(3).plus(dreamCruiseCB.specify().columnPurchasePrice());

        // ## Act ##
        purchaseBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        String decryptExp = "(dfloc.PURCHASE_PRICE - 13)";
        String expected = decryptExp + " > (" + decryptExp + " * 3) + " + decryptExp;
        assertTrue(displaySql.contains(expected));
    }

    public void test_ColumnQuery_uses_DerivedReferrer_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        }).greaterThan(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        });

        // ## Act ##
        memberBhv.selectList(cb);

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertEquals(2, Srl.count(displaySql, "(select max((sub1loc.PURCHASE_PRICE - 13))"));
    }

    public void test_ColumnQuery_uses_DerivedReferrer_calculation() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        }).greaterThan(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        }).multiply(3);

        // ## Act ##
        memberBhv.selectList(cb);

        // ## Assert ##
        String displaySql = cb.toDisplaySql();
        assertEquals(2, Srl.count(displaySql, "(select max((sub1loc.PURCHASE_PRICE - 13))"));
        assertTrue(displaySql.contains(") * 3"));
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public void test_ScalarCondition_basic() throws Exception {
        // ## Arrange ##
        encryptPurchasePriceAll();
        PurchaseCB cb = new PurchaseCB();
        cb.query().scalar_Equal().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice();
            }
        });
        cb.query().queryMember().setMemberStatusCode_Equal_Provisional();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertFalse(purchaseList.isEmpty());
        for (Purchase purchase : purchaseList) {
            log(purchase.getPurchaseId() + ", " + purchase.getPurchasePrice());
            assertEquals(Integer.valueOf(1000), purchase.getPurchasePrice());
        }
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains("(dfloc.PURCHASE_PRICE - 13) ="));
        assertTrue(displaySql.contains("max((sub1loc.PURCHASE_PRICE - 13))"));
    }

    // ===================================================================================
    //                                                            (Specify)DerivedReferrer
    //                                                            ========================
    public void test_SpecifyDerivedReferrer_basic() throws Exception {
        {
            // ## Arrange ##
            Purchase purchase = encryptPurchasePriceAll();
            MemberCB cb = new MemberCB();
            cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                public void query(PurchaseCB subCB) {
                    subCB.specify().columnPurchasePrice();
                }
            }, Member.ALIAS_productKindCount);
            cb.query().setMemberId_Equal(3);

            // ## Act ##
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Integer maxPrice = actual.getProductKindCount();
            log(actual.getMemberId() + ", " + maxPrice);
            assertEquals(purchase.getPurchasePrice(), maxPrice);
            assertTrue(Srl.containsAll(cb.toDisplaySql(), "- 13"));
        }
    }

    public void test_SpecifyDerivedReferrer_nested() throws Exception {
        // ## Arrange ##
        Purchase purchase = encryptPurchasePriceAll();
        MemberStatusCB cb = new MemberStatusCB();
        cb.specify().derivedMemberList().max(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        }, MemberStatus.ALIAS_maxPurchasePrice);
        cb.query().setMemberStatusCode_Equal_Formalized();

        // ## Act ##
        MemberStatus actual = memberStatusBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        Integer maxPrice = actual.getMaxPurchasePrice();
        log(actual.getMemberStatusName() + ", " + maxPrice);
        assertEquals(purchase.getPurchasePrice(), maxPrice);
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "- 13"));
    }

    public void test_SpecifyDerivedReferrer_union() throws Exception {
        // ## Arrange ##
        Purchase purchase = encryptPurchasePriceAll();
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice();
                subCB.query().setPurchaseCount_GreaterEqual(2);
                subCB.union(new UnionQuery<PurchaseCB>() {
                    public void query(PurchaseCB unionCB) {
                        unionCB.query().setPaymentCompleteFlg_Equal_True();
                    }
                });
            }
        }, Member.ALIAS_productKindCount);
        cb.query().setMemberId_Equal(3);

        // ## Act ##
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        Integer maxPrice = actual.getProductKindCount();
        log(actual.getMemberId() + ", " + maxPrice);
        assertEquals(purchase.getPurchasePrice(), maxPrice);
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "- 13"));
    }

    public void test_SpecifyDerivedReferrer_nested_union() throws Exception {
        // ## Arrange ##
        Purchase purchase = encryptPurchasePriceAll();
        MemberStatusCB cb = new MemberStatusCB();
        cb.specify().derivedMemberList().max(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                        subCB.query().setPurchaseCount_GreaterEqual(2);
                        subCB.union(new UnionQuery<PurchaseCB>() {
                            public void query(PurchaseCB unionCB) {
                                unionCB.query().setPaymentCompleteFlg_Equal_True();
                            }
                        });
                    }
                }, null);
            }
        }, MemberStatus.ALIAS_maxPurchasePrice);
        cb.query().setMemberStatusCode_Equal_Formalized();

        // ## Act ##
        MemberStatus actual = memberStatusBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        Integer maxPrice = actual.getMaxPurchasePrice();
        log(actual.getMemberStatusName() + ", " + maxPrice);
        assertEquals(purchase.getPurchasePrice(), maxPrice);
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "- 13"));
    }

    // ===================================================================================
    //                                                              (Query)DerivedReferrer
    //                                                              ======================
    public void test_QueryDerivedReferrer_basic() throws Exception {
        // ## Arrange ##
        encryptPurchasePriceAll();
        MemberCB cb = new MemberCB();
        cb.query().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice();
            }
        }).equal(1000);
        cb.query().setMemberId_Equal(3);

        // ## Act ##
        memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "- 13"));
    }

    // ===================================================================================
    //                                                                        ScalarSelect
    //                                                                        ============
    public void test_ScalarSelect_option_basic() {
        // ## Arrange ##
        int coalesce = 7849238;

        // ## Act ##
        Integer max = purchaseBhv.scalarSelect(Integer.class).max(new ScalarQuery<PurchaseCB>() {
            public void query(PurchaseCB cb) {
                cb.specify().columnPurchasePrice();
                cb.query().setPurchasePrice_LessThan(-1);
            }
        }, new ScalarSelectOption().coalesce(coalesce));

        // ## Assert ##
        assertEquals(Integer.valueOf(coalesce), max);
    }

    // ===================================================================================
    //                                                                             OrderBy
    //                                                                             =======
    public void test_OrderBy_basic() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPurchasePrice(999999999);
        purchaseBhv.updateNonstrict(purchase);
        PurchaseCB cb = new PurchaseCB();
        cb.query().setPurchaseId_Equal(3L);
        RangeOfOption option = new RangeOfOption();
        cb.query().setPurchasePrice_RangeOf(999999999, 999999999, option);
        cb.query().addOrderBy_PurchasePrice_Asc();

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(999999999, actual.getPurchasePrice());
        String displaySql = cb.toDisplaySql();
        assertTrue(Srl.contains(displaySql, "and (dfloc.PURCHASE_PRICE - 13) >= 999999999"));
        assertTrue(Srl.contains(displaySql, "and (dfloc.PURCHASE_PRICE - 13) <= 999999999"));
        assertTrue(Srl.contains(displaySql, "(dfloc.PURCHASE_PRICE - 13) asc"));
    }

    public void test_OrderBy_manualOrder_basic() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPurchasePrice(999999999);
        purchaseBhv.updateNonstrict(purchase);
        PurchaseCB cb = new PurchaseCB();
        cb.query().setPurchaseId_Equal(3L);
        RangeOfOption option = new RangeOfOption();
        cb.query().setPurchasePrice_RangeOf(999999999, 999999999, option);
        ManualOrderBean mob = new ManualOrderBean();
        mob.acceptOrderValueList(newArrayList("cipher", "wipher"));
        cb.query().addOrderBy_PurchasePrice_Asc().withManualOrder(mob);
        cb.query().queryMember().addOrderBy_UpdateUser_Asc();

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(999999999, actual.getPurchasePrice());
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "when (dfloc.PURCHASE_PRICE - 13) = 'cipher' then 0"));
        assertTrue(Srl.contains(sql, "when (dfloc.PURCHASE_PRICE - 13) = 'wipher' then 1"));
        assertTrue(Srl.contains(sql, "convert(aes_decrypt(unhex(dfrel_0.UPDATE_USER), 'himitsu') using utf8) asc"));
    }

    public void test_OrderBy_manualOrder_dream() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPurchasePrice(999999999);
        purchaseBhv.updateNonstrict(purchase);
        PurchaseCB cb = new PurchaseCB();
        cb.query().setPurchaseId_Equal(3L);
        RangeOfOption option = new RangeOfOption();
        cb.query().setPurchasePrice_RangeOf(999999999, 999999999, option);
        PurchaseCB dreamCruiseCB = cb.dreamCruiseCB();
        ManualOrderBean mob = new ManualOrderBean();
        mob.plus(dreamCruiseCB.specify().columnPurchasePrice());
        mob.minus(dreamCruiseCB.specify().columnPurchasePrice());
        cb.query().addOrderBy_PurchaseCount_Asc().withManualOrder(mob);
        cb.query().queryMember().addOrderBy_UpdateUser_Asc();

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(999999999, actual.getPurchasePrice());
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql,
                "(dfloc.PURCHASE_COUNT + (dfloc.PURCHASE_PRICE - 13)) - (dfloc.PURCHASE_PRICE - 13)"));
        assertTrue(Srl.contains(sql, "convert(aes_decrypt(unhex(dfrel_0.UPDATE_USER), 'himitsu') using utf8) asc"));
    }

    // ===================================================================================
    //                                                                         TakeFinally
    //                                                                         ===========
    public void test_select_encrypted_by_TakeFinally() throws Exception {
        // ## Arrange ##
        MemberSecurityCB cb = new MemberSecurityCB();

        // ## Act ##
        ListResultBean<MemberSecurity> memberList = memberSecurityBhv.selectList(cb);

        // ## Assert ##
        for (MemberSecurity security : memberList) {
            log(security.getMemberId() + ", " + security.getLoginPassword());
        }
    }

    // ===================================================================================
    //                                                                         TypeMapping
    //                                                                         ===========
    public void test_typeMapping_basic() throws Exception {
        // ## Arrange ##
        WhiteGearedCipher inserted = new WhiteGearedCipher();
        String expectedVarchar = "foo";
        int expectedInteger = 6;
        Date expectedDate = toDate("2014/09/26");
        Timestamp expectedDatetime = toTimestamp("2014/03/03 12:34:56");
        inserted.setCipherVarchar(expectedVarchar);
        inserted.setCipherInteger(expectedInteger);
        inserted.setCipherDate(expectedDate);
        inserted.setCipherDatetime(expectedDatetime);
        whiteGearedCipherBhv.insert(inserted);

        WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
        cb.query().setCipherId_Equal(inserted.getCipherId());

        // ## Act ##
        WhiteGearedCipher cipher = whiteGearedCipherBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(expectedVarchar, cipher.getCipherVarchar());
        assertEquals(expectedInteger, cipher.getCipherInteger());
        assertEquals(expectedDate, cipher.getCipherDate());
        assertEquals(expectedDatetime, cipher.getCipherDatetime());
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected MemberSecurity encryptLoginPassword() {
        MemberSecurity security = new MemberSecurity();
        security.setMemberId(3);
        security.setLoginPassword("cipher");
        memberSecurityBhv.updateNonstrict(security);
        return security;
    }

    protected Member encryptUpdateUser() {
        Member security = new Member();
        security.disableCommonColumnAutoSetup();
        security.setMemberId(3);
        security.setUpdateUser("cipher");
        memberBhv.updateNonstrict(security);
        return security;
    }

    protected Purchase encryptPurchasePriceAll() {
        PurchaseCB cb = new PurchaseCB();
        Purchase purchase = new Purchase();
        purchase.setPurchasePrice(1000);
        UpdateOption<PurchaseCB> option = new UpdateOption<PurchaseCB>();
        option.allowNonQueryUpdate();
        purchaseBhv.varyingQueryUpdate(purchase, cb, option);
        return purchase;
    }

    protected String hash(byte[] digested) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digested.length; i++) {
            if ((0xff & digested[i]) < 0x10) {
                sb.append("0" + Integer.toHexString((0xFF & digested[i])));
            } else {
                sb.append(Integer.toHexString(0xFF & digested[i]));
            }
        }
        return sb.toString();
    }
}
