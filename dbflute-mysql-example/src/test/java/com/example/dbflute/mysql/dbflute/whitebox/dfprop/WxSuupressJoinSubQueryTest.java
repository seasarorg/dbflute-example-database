package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.exception.ConditionInvokingFailureException;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyOneDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyOneOneDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqOneDbm;
import com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqManyCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqManyOneCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqManyOneOneCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteSuppressJoinSqOneCB;
import com.example.dbflute.mysql.dbflute.cbean.nss.WhiteSuppressJoinSqManyNss;
import com.example.dbflute.mysql.dbflute.cbean.nss.WhiteSuppressJoinSqManyOneNss;
import com.example.dbflute.mysql.dbflute.cbean.nss.WhiteSuppressJoinSqNss;
import com.example.dbflute.mysql.dbflute.cbean.nss.WhiteSuppressJoinSqOneNss;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyOneBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSq;
import com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSqMany;
import com.example.dbflute.mysql.dbflute.exentity.WhiteSuppressJoinSqManyOne;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5G (2014/05/27 Tuesday)
 */
public class WxSuupressJoinSubQueryTest extends UnitContainerTestCase {

    private WhiteSuppressJoinSqBhv whiteSuppressJoinSqBhv;
    private WhiteSuppressJoinSqManyBhv whiteSuppressJoinSqManyBhv;
    private WhiteSuppressJoinSqManyOneBhv whiteSuppressJoinSqManyOneBhv;

    // ===================================================================================
    //                                                                                Join
    //                                                                                ====
    public void test_suppressJoin_ManyToOne() {
        // ## Arrange ##
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
        WhiteSuppressJoinSqManyDbm dbm = WhiteSuppressJoinSqManyDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSq().getForeignPropertyName();

        // ## Act ##
        try {
            cb.invokeSetupSelect(foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (ConditionInvokingFailureException e) {
            log(e.getMessage());
        }
        // ## Act ##
        try {
            checkNss(WhiteSuppressJoinSqManyNss.class, foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }

        // ## Act ##
        ListResultBean<WhiteSuppressJoinSqMany> ls = whiteSuppressJoinSqManyBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasZeroElement(ls);
    }

    public void test_suppressJoin_ManyToOneToOne() throws Exception {
        // ## Arrange ##
        WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
        WhiteSuppressJoinSqManyOneDbm dbm = WhiteSuppressJoinSqManyOneDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSqManyOneOne().getForeignPropertyName();

        // ## Act ##
        cb.invokeSetupSelect(foreignPropertyName);
        checkNss(WhiteSuppressJoinSqManyOneNss.class, foreignPropertyName);
        ListResultBean<WhiteSuppressJoinSqManyOne> ls = whiteSuppressJoinSqManyOneBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasZeroElement(ls);
    }

    public void test_suppressJoin_OneToOne_asOne() {
        // ## Arrange ##
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
        WhiteSuppressJoinSqDbm dbm = WhiteSuppressJoinSqDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSqOneAsOne().getForeignPropertyName();

        // ## Act ##
        try {
            cb.invokeSetupSelect(foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (ConditionInvokingFailureException e) {
            log(e.getMessage());
        }
        // ## Act ##
        try {
            checkNss(WhiteSuppressJoinSqNss.class, foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }
    }

    public void test_suppressJoin_OneToOne_fkroot() {
        // ## Arrange ##
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
        WhiteSuppressJoinSqOneDbm dbm = WhiteSuppressJoinSqOneDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSq().getForeignPropertyName();

        // ## Act ##
        try {
            cb.invokeSetupSelect(foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (ConditionInvokingFailureException e) {
            log(e.getMessage());
        }
        // ## Act ##
        try {
            checkNss(WhiteSuppressJoinSqOneNss.class, foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }
    }

    public void test_suppressJoin_OneToOneToOne() {
        // ## Arrange ##
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
        WhiteSuppressJoinSqOneDbm dbm = WhiteSuppressJoinSqOneDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSqOneAddi().getForeignPropertyName();

        // ## Act ##
        try {
            cb.invokeSetupSelect(foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (ConditionInvokingFailureException e) {
            log(e.getMessage());
        }
        // ## Act ##
        try {
            checkNss(WhiteSuppressJoinSqOneNss.class, foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }
    }

    protected void checkNss(Class<?> nssType, String foreignPropertyName) throws NoSuchMethodException {
        nssType.getMethod("with" + Srl.initCap(foreignPropertyName), (Class[]) null);
    }

    // ===================================================================================
    //                                                                            SubQuery
    //                                                                            ========
    public void test_suppressSubQuery_OneToMany() {
        // ## Arrange ##
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
        String referrerPropertyName = WhiteSuppressJoinSqDbm.getInstance().referrerWhiteSuppressJoinSqManyList()
                .getReferrerPropertyName();

        // ## Act ##
        try {
            // ## Assert ##
            checkExists(cb.query().getClass(), referrerPropertyName);
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }

        // ## Act ##
        ListResultBean<WhiteSuppressJoinSq> ls = whiteSuppressJoinSqBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasZeroElement(ls);
    }

    public void test_suppressSubQuery_OneToOne_noSuppress() {
        // ## Arrange ##
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
        cb.query().existsWhiteSuppressJoinSqOneAsOne(new SubQuery<WhiteSuppressJoinSqOneCB>() {
            public void query(WhiteSuppressJoinSqOneCB subCB) {
            }
        });

        // ## Act ##
        ListResultBean<WhiteSuppressJoinSq> ls = whiteSuppressJoinSqBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasZeroElement(ls);
    }

    public void test_suppressSubQuery_ManyToOneToOne() throws Exception {
        // ## Arrange ##
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
        WhiteSuppressJoinSqManyOneOneDbm dbm = WhiteSuppressJoinSqManyOneOneDbm.getInstance();
        String referrerPropertyName = dbm.referrerWhiteSuppressJoinSqManyOneList().getReferrerPropertyName();

        // ## Act ##
        try {
            // ## Assert ##
            checkExists(cb.query().getClass(), referrerPropertyName);
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }
    }

    protected void checkExists(Class<?> cqType, String referrerPropertyName) throws NoSuchMethodException {
        cqType.getMethod("exists" + Srl.initCap(referrerPropertyName), new Class[] { SubQuery.class });
    }
}