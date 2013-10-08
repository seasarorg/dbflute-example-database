package com.example.dbflute.oracle.dbflute.topic;

import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.oracle.dbflute.cbean.ProductStatusCB;
import com.example.dbflute.oracle.dbflute.cbean.SummaryMemberPurchaseCB;
import com.example.dbflute.oracle.dbflute.cbean.SummaryProductCB;
import com.example.dbflute.oracle.dbflute.exbhv.ProductStatusBhv;
import com.example.dbflute.oracle.dbflute.exbhv.SummaryMemberPurchaseBhv;
import com.example.dbflute.oracle.dbflute.exbhv.SummaryProductBhv;
import com.example.dbflute.oracle.dbflute.exentity.ProductStatus;
import com.example.dbflute.oracle.dbflute.exentity.SummaryMemberPurchase;
import com.example.dbflute.oracle.dbflute.exentity.SummaryProduct;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.7.7 (2008/07/23 Wednesday)
 */
public class ViewTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private SummaryProductBhv summaryProductBhv;
    private SummaryMemberPurchaseBhv summaryMemberPurchaseBhv;
    private ProductStatusBhv productStatusBhv;

    // ===================================================================================
    //                                                                       Relation Test
    //                                                                       =============
    public void test_setupSelect() {
        // ## Arrange ##
        SummaryProductCB cb = new SummaryProductCB();
        cb.setupSelect_ProductStatus();

        // ## Act ##
        ListResultBean<SummaryProduct> productList = summaryProductBhv.selectList(cb);

        // ## Assert ##
        for (SummaryProduct product : productList) {
            assertNotNull(product.getProductStatus());
        }
    }

    public void test_foreign_loadReferrer() {
        // ## Arrange ##
        ProductStatusCB cb = new ProductStatusCB();
        ListResultBean<ProductStatus> productStatusList = productStatusBhv.selectList(cb);

        // ## Act ##
        productStatusBhv.loadSummaryProductList(productStatusList, new ConditionBeanSetupper<SummaryProductCB>() {
            public void setup(SummaryProductCB cb) {
                cb.query().addOrderBy_LatestPurchaseDatetime_Desc();
            }
        });

        // ## Assert ##
        boolean existsSummaryProduct = false;
        for (ProductStatus productStatus : productStatusList) {
            log(productStatus);
            List<SummaryProduct> summaryProductList = productStatus.getSummaryProductList();
            for (SummaryProduct summaryProduct : summaryProductList) {
                log("    " + summaryProduct.toString());
                existsSummaryProduct = true;
            }
        }
        assertTrue(existsSummaryProduct);
    }

    // ===================================================================================
    //                                                                   Materialized View
    //                                                                   =================
    public void test_selectList_materialized_view() {
        // ## Arrange ##
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();

        // ## Act ##
        ListResultBean<SummaryMemberPurchase> mempurList = summaryMemberPurchaseBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mempurList.size());
        for (SummaryMemberPurchase member : mempurList) {
            log(member.toString());
        }
    }
}
