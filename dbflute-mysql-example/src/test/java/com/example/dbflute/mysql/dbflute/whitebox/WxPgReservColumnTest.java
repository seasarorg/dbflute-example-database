package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.WhitePgReservCB;
import com.example.dbflute.mysql.dbflute.cbean.WhitePgReservRefCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhitePgReservBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhitePgReservRefBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhitePgReserv;
import com.example.dbflute.mysql.dbflute.exentity.WhitePgReservRef;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.5 (2010/10/11 Monday)
 */
public class WxPgReservColumnTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhitePgReservBhv whitePgReservBhv;
    private WhitePgReservRefBhv whitePgReservRefBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_PgReserv_CB_with_relation() {
        // ## Arrange ##
        registerTestData();
        WhitePgReservRefCB cb = new WhitePgReservRefCB();
        cb.setupSelect_WhitePgReserv();

        // ## Act ##
        ListResultBean<WhitePgReservRef> refList = whitePgReservRefBhv.selectList(cb);

        // ## Assert ##
        boolean exists = false;
        for (WhitePgReservRef ref : refList) {
            WhitePgReserv reserv = ref.getWhitePgReserv();
            if (reserv != null) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_PgReserv_insert_update() {
        // ## Arrange ##
        WhitePgReserv reserv = new WhitePgReserv();
        reserv.setClassSynonym(1);
        reserv.setCaseSynonym(2);
        reserv.setPackageSynonym(3);
        reserv.setDefaultSynonym(4);
        reserv.setNewSynonym(5);
        reserv.setNativeSynonym(6);
        reserv.setVoidSynonym(7);
        reserv.setPublicSynonym(8);
        reserv.setProtectedSynonym(9);
        reserv.setPrivateSynonym(10);
        reserv.setInterfaceSynonym(11);
        reserv.setAbstractSynonym(12);
        reserv.setFinalSynonym(13);
        reserv.setFinallySynonym(14);
        reserv.setReturnSynonym(15);
        reserv.setDoubleSynonym(16);
        reserv.setFloatSynonym(17);
        reserv.setShortSynonym(18);
        reserv.setType("TST");
        reserv.setReservName("inserted");

        // ## Act ##
        whitePgReservBhv.insert(reserv);
        reserv.setReservName("updated");
        whitePgReservBhv.update(reserv);
        WhitePgReserv actual = whitePgReservBhv.selectByPKValueWithDeletedCheck(reserv.getClassSynonym());

        // ## Assert ##
        log(actual);
        assertEquals("TST", actual.getType());
        assertEquals("updated", actual.getReservName());
    }

    public void test_PgReserv_queryUpdate() {
        // ## Arrange ##
        WhitePgReserv reserv = new WhitePgReserv();
        reserv.setClassSynonym(3);
        reserv.setReservName("inserted");

        // ## Act & Assert ##
        WhitePgReservCB cb = new WhitePgReservCB();
        cb.query().setClassSynonym_IsNotNull();
        whitePgReservBhv.queryUpdate(reserv, cb); // expect no exception
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_PgReserv_LoadReferrer() {
        // ## Arrange ##
        registerTestData();
        WhitePgReservCB cb = new WhitePgReservCB();

        // ## Act ##
        ListResultBean<WhitePgReserv> reservList = whitePgReservBhv.selectList(cb);
        whitePgReservBhv.loadWhitePgReservRefList(reservList, new ConditionBeanSetupper<WhitePgReservRefCB>() {
            public void setup(WhitePgReservRefCB cb) {
            }
        });

        // ## Assert ##
        boolean exists = false;
        for (WhitePgReserv reserv : reservList) {
            List<WhitePgReservRef> refList = reserv.getWhitePgReservRefList();
            if (!refList.isEmpty()) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void registerTestData() {
        WhitePgReserv reserv = new WhitePgReserv();
        reserv.setClassSynonym(99991);
        reserv.setReservName("inserted");
        whitePgReservBhv.insert(reserv);
        {
            WhitePgReservRef ref = new WhitePgReservRef();
            ref.setRefId(88881);
            ref.setClassSynonym(99991);
            whitePgReservRefBhv.insert(ref);
        }
        {
            WhitePgReservRef ref = new WhitePgReservRef();
            ref.setRefId(88882);
            ref.setClassSynonym(99991);
            whitePgReservRefBhv.insert(ref);
        }
    }
}
