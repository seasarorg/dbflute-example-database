package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.Date;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.exception.DBMetaNotFoundException;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WhiteImplicitReverseFkRefDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WhiteImplicitReverseFkSuppressDbm;
import com.example.dbflute.mysql.dbflute.cbean.MemberAddressCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitReverseFkCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitReverseFkRefCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitReverseFkSuppressCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteSelfReferenceCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitReverseFkBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitReverseFkRefBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitReverseFkSuppressBhv;
import com.example.dbflute.mysql.dbflute.exentity.MemberAddress;
import com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitReverseFk;
import com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitReverseFkRef;
import com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitReverseFkSuppress;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneImplicitReverseFKTest extends UnitContainerTestCase {

    private MemberAddressBhv memberAddressBhv;
    private WhiteImplicitReverseFkBhv whiteImplicitReverseFkBhv;
    private WhiteImplicitReverseFkRefBhv whiteImplicitReverseFkRefBhv;
    private WhiteImplicitReverseFkSuppressBhv whiteImplicitReverseFkSuppressBhv;

    // ===================================================================================
    //                                                                  Implicit ReverseFK
    //                                                                  ==================
    public void test_BizOneToOne_implicitReverseFK_alreadyExists() {
        // ## Arrange ##
        MemberAddressCB cb = new MemberAddressCB();
        cb.setupSelect_Member();

        // ## Act ##
        ListResultBean<MemberAddress> addressList = memberAddressBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(addressList);
        for (MemberAddress address : addressList) {
            log(address);
            assertNotNull(address.getMember());
        }
    }

    public void test_BizOneToOne_implicitReverseFK_specify() {
        // ## Arrange ##
        Date targetDate = currentDate();
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
        cb.setupSelect_WhiteImplicitReverseFkRefWithImplicitReverseFK(targetDate);
        cb.setupSelect_WhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(targetDate);
        cb.specify().specifyWhiteImplicitReverseFkRefWithImplicitReverseFK().columnValidBeginDate();
        cb.specify().specifyWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK().columnValidBeginDate();
        cb.specify().derivedWhiteImplicitReverseFkRefList().max(new SubQuery<WhiteImplicitReverseFkRefCB>() {
            public void query(WhiteImplicitReverseFkRefCB subCB) {
                subCB.specify().columnValidBeginDate();
            }
        }, WhiteImplicitReverseFk.ALIAS_maxBeginDate);
        cb.query().existsWhiteImplicitReverseFkRefList(new SubQuery<WhiteImplicitReverseFkRefCB>() {
            public void query(WhiteImplicitReverseFkRefCB subCB) {
            }
        });

        // ## Act ##
        ListResultBean<WhiteImplicitReverseFk> fkList = whiteImplicitReverseFkBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(fkList);
        assertContainsAll(cb.toDisplaySql(), ") as MAX_BEGIN_DATE", "exists");
    }

    public void test_BizOneToOne_implicitReverseFK_with() {
        // ## Arrange ##
        WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
        cb.setupSelect_WhiteImplicitReverseFk();

        // ## Act ##
        ListResultBean<WhiteImplicitReverseFkRef> fkList = whiteImplicitReverseFkRefBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(fkList);
    }

    public void test_BizOneToOne_implicitReverseFK_suppress() {
        // ## Arrange ##
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();

        // ## Act ##
        ListResultBean<WhiteImplicitReverseFkSuppress> fkList = whiteImplicitReverseFkSuppressBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(fkList);
        assert_isSuppressImplicitReverseFK_noFK();
    }

    protected void assert_isSuppressImplicitReverseFK_noFK() {
        // ## Arrange ##
        WhiteImplicitReverseFkSuppressDbm dbm = WhiteImplicitReverseFkSuppressDbm.getInstance();
        try {
            // ## Act ##
            dbm.findForeignInfo(WhiteImplicitReverseFkRefDbm.getInstance().getTablePropertyName());

            // ## Assert ##
            fail();
        } catch (DBMetaNotFoundException e) {
            log(e.getMessage());
        }
    }

    public void test_BizOneToOne_implicitReverseFK_reverseAsOne() {
        // ## Arrange ##
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
        cb.setupSelect_WhiteSelfReferenceRefOneAsOne();
        cb.setupSelect_WhiteSelfReferenceRefOneByParentId();

        // ## Act & Assert ##
        log(ln() + cb.toDisplaySql()); // expect no exception
        assert_isSuppressImplicitReverseFK_noFK();
    }
}