package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.bhv.UpdateOption;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;

import com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.1 (2012/12/15 Saturday)
 */
public class WxBhvDreamCruiseUpdateMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private PurchaseBhv purchaseBhv;
    private boolean originallyCheckCountBeforeQueryUpdate;

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    @Override
    public void setUp() throws Exception {
        super.setUp();
        originallyCheckCountBeforeQueryUpdate = DBFluteConfig.getInstance().isQueryUpdateCountPreCheck();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setQueryUpdateCountPreCheck(false);
    }

    @Override
    public void tearDown() throws Exception {
        DBFluteConfig.getInstance().setQueryUpdateCountPreCheck(originallyCheckCountBeforeQueryUpdate);
        DBFluteConfig.getInstance().unlock();
        super.tearDown();
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    public void test_varyingUpdate_SelfCalculation_DreamCruise_plain() {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPaymentCompleteFlg_True();

        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            // ## Act ##
            UpdateOption<PurchaseCB> option = new UpdateOption<PurchaseCB>();
            option.self(new SpecifyQuery<PurchaseCB>() {
                public void specify(PurchaseCB cb) {
                    cb.specify().columnPurchasePrice();
                }
            }).multiply(new PurchaseCB().dreamCruiseCB().specify().columnPurchaseCount());
            purchaseBhv.varyingUpdateNonstrict(purchase, option);

            // ## Assert ##
            assertHasOnlyOneElement(infoList);
            SqlLogInfo info = infoList.get(0);
            String sql = info.getDisplaySql();
            assertTrue(sql.contains("set PURCHASE_PRICE = ((PURCHASE_PRICE - 13) * PURCHASE_COUNT + 13)"));
            assertTrue(sql.contains(", VERSION_NO = VERSION_NO + 1"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    public void test_varyingQueryUpdate_SelfCalculation_DreamCruise_plain() {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPaymentCompleteFlg_True();

        PurchaseCB cb = new PurchaseCB();
        cb.query().setPaymentCompleteFlg_Equal_True();

        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });
            // ## Act ##
            PurchaseCB dreamCruiseCB = cb.dreamCruiseCB();
            UpdateOption<PurchaseCB> option = new UpdateOption<PurchaseCB>();
            option.self(new SpecifyQuery<PurchaseCB>() {
                public void specify(PurchaseCB cb) {
                    cb.specify().columnPurchasePrice();
                }
            }).multiply(dreamCruiseCB.specify().columnPurchaseCount());
            int updatedCount = purchaseBhv.varyingQueryUpdate(purchase, cb, option);

            // ## Assert ##
            assertNotSame(0, updatedCount);
            assertHasOnlyOneElement(infoList);
            SqlLogInfo info = infoList.get(0);
            String sql = info.getDisplaySql();
            assertTrue(sql.contains("set PURCHASE_PRICE = ((PURCHASE_PRICE - 13) * PURCHASE_COUNT + 13)"));
            assertTrue(sql.contains(", VERSION_NO = VERSION_NO + 1"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_varyingQueryUpdate_SelfCalculation_DreamCruise_joined() {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPaymentCompleteFlg_True();

        PurchaseCB cb = new PurchaseCB();
        cb.query().queryMember().setMemberStatusCode_Equal_Formalized();
        cb.query().setPaymentCompleteFlg_Equal_True();

        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });
            // ## Act ##
            PurchaseCB dreamCruiseCB = cb.dreamCruiseCB();
            UpdateOption<PurchaseCB> option = new UpdateOption<PurchaseCB>();
            option.self(new SpecifyQuery<PurchaseCB>() {
                public void specify(PurchaseCB cb) {
                    cb.specify().columnPurchasePrice();
                }
            }).multiply(dreamCruiseCB.specify().columnPurchaseCount())
                    .divide(dreamCruiseCB.specify().specifyMember().columnMemberId());
            int updatedCount = purchaseBhv.varyingQueryUpdate(purchase, cb, option);

            // ## Assert ##
            assertNotSame(0, updatedCount);
            assertHasOnlyOneElement(infoList);
            SqlLogInfo info = infoList.get(0);
            String sql = info.getDisplaySql();
            String left = "set dfloc.PURCHASE_PRICE";
            assertTrue(sql.contains(left
                    + " = (((dfloc.PURCHASE_PRICE - 13) * dfloc.PURCHASE_COUNT) / dfrel_0.MEMBER_ID + 13)"));
            assertTrue(sql.contains(", dfloc.VERSION_NO = dfloc.VERSION_NO + 1"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }
}
