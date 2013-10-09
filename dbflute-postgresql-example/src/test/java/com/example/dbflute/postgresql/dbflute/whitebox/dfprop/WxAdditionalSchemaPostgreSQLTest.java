package com.example.dbflute.postgresql.dbflute.whitebox.dfprop;

import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.helper.HandyDate;

import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.postgresql.dbflute.cbean.NextschemaWhiteSameNameCB;
import com.example.dbflute.postgresql.dbflute.cbean.NextschemaWhiteSameNameRefCB;
import com.example.dbflute.postgresql.dbflute.cbean.WhiteSameNameCB;
import com.example.dbflute.postgresql.dbflute.exbhv.NextschemaWhiteSameNameBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.NextschemaWhiteSameNameRefBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.WhiteSameNameBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpNextNoParameterPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpReturnParameterPmb;
import com.example.dbflute.postgresql.dbflute.exentity.NextschemaWhiteSameName;
import com.example.dbflute.postgresql.dbflute.exentity.NextschemaWhiteSameNameRef;
import com.example.dbflute.postgresql.dbflute.exentity.WhiteSameName;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.8 (2010/04/18 Sunday)
 */
public class WxAdditionalSchemaPostgreSQLTest extends UnitContainerTestCase {

    private WhiteSameNameBhv whiteSameNameBhv;
    private NextschemaWhiteSameNameBhv nextschemaWhiteSameNameBhv;
    private NextschemaWhiteSameNameRefBhv nextschemaWhiteSameNameRefBhv;

    // ===================================================================================
    //                                                                      SqlName Prefix
    //                                                                      ==============
    public void test_SqlNamePrefix_table() {
        assertFalse(MemberDbm.getInstance().getTableSqlName().toString().contains("."));
    }

    public void test_SqlNamePrefix_procedure() {
        assertFalse(new SpReturnParameterPmb().getProcedureName().contains("."));
        assertTrue(new SpNextNoParameterPmb().getProcedureName().contains("."));
    }

    // ===================================================================================
    //                                                                       SameNameTable
    //                                                                       =============
    public void test_SameNameTable_main_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteSameNameCB cb = new WhiteSameNameCB();

        // ## Act ##
        ListResultBean<WhiteSameName> mainList = whiteSameNameBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteSameName main : mainList) {
            log(main);
            assertNotNull(main.getSameNameName());
            assertNotNull(main.getSameNameInteger());
        }
    }

    public void test_SameNameTable_main_nextBridge() {
        // ## Arrange ##
        registerTestData();
        WhiteSameNameCB cb = new WhiteSameNameCB();
        cb.setupSelect_NextSchemaProduct();

        // ## Act ##
        ListResultBean<WhiteSameName> mainList = whiteSameNameBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteSameName main : mainList) {
            assertNotNull(main.getNextSchemaProduct());
        }
    }

    public void test_SameNameTable_next_LoadReferrer() {
        // ## Arrange ##
        registerTestData();
        NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();

        // ## Act ##
        ListResultBean<NextschemaWhiteSameName> mainList = nextschemaWhiteSameNameBhv.selectList(cb);
        nextschemaWhiteSameNameBhv.loadWhiteSameNameRefList(mainList,
                new ConditionBeanSetupper<NextschemaWhiteSameNameRefCB>() {
                    public void setup(NextschemaWhiteSameNameRefCB cb) {
                        cb.setupSelect_WhiteSameName();
                    }
                });

        // ## Assert ##
        assertHasAnyElement(mainList); // expect no exception for now
        for (NextschemaWhiteSameName main : mainList) {
            List<NextschemaWhiteSameNameRef> refList = main.getWhiteSameNameRefList();
            assertHasAnyElement(refList);
        }
    }

    public void test_SameNameTable_next_SetupSelect() {
        // ## Arrange ##
        registerTestData();
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
        cb.setupSelect_WhiteSameName();

        // ## Act ##
        ListResultBean<NextschemaWhiteSameNameRef> refList = nextschemaWhiteSameNameRefBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        for (NextschemaWhiteSameNameRef ref : refList) {
            assertNotNull(ref.getWhiteSameName());
        }
    }

    protected void registerTestData() {
        {
            WhiteSameName main = new WhiteSameName();
            main.setSameNameId(1L);
            main.setSameNameName("main1");
            main.setSameNameInteger(123546);
            main.setNextSchemaProductId(1);
            whiteSameNameBhv.insert(main);
        }
        {
            NextschemaWhiteSameName main = new NextschemaWhiteSameName();
            main.setSameNameId(101);
            main.setSameNameName("nextmain1");
            main.setSameNameLong(456789L);
            nextschemaWhiteSameNameBhv.insert(main);
        }
        {
            NextschemaWhiteSameNameRef ref = new NextschemaWhiteSameNameRef();
            ref.setSameNameRefId(111L);
            ref.setSameNameId(101);
            ref.setNextRefDate(new HandyDate("2013/07/06").getDate());
            nextschemaWhiteSameNameRefBhv.insert(ref);
        }
    }
}