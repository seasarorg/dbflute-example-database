package com.example.dbflute.mysql.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.WhiteStilettoAliasRefCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteStilettoAliasBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteStilettoAliasRefBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteStilettoAlias;
import com.example.dbflute.mysql.dbflute.exentity.WhiteStilettoAliasRef;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5J (2014/07/23 Wednesday)
 */
public class WxStilettoAliasTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteStilettoAliasBhv whiteStilettoAliasBhv;
    private WhiteStilettoAliasRefBhv whiteStilettoAliasRefBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_select_query_Equal_encryptOnly() throws Exception {
        // ## Arrange ##
        registerTestData();

        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
        cb.setupSelect_WhiteStilettoAlias();
        cb.addOrderBy_PK_Asc();

        // ## Act ##
        ListResultBean<WhiteStilettoAliasRef> refList = whiteStilettoAliasRefBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        int number = 1;
        for (WhiteStilettoAliasRef ref : refList) {
            WhiteStilettoAlias alias = ref.getWhiteStilettoAlias();
            log(ref, alias);
            assertEquals("1-" + number + ":foo0", ref.getFoo0());
            assertEquals("1-" + number + ":foo1", ref.getFoo1());
            assertEquals("1-" + number + ":foo2", ref.getFoo2());
            assertEquals("1-" + number + ":foo3", ref.getFoo3());
            assertEquals("1-" + number + ":foo4", ref.getFoo4());
            assertEquals("1:foo0", alias.getFoo());
            assertEquals("1:foo1", alias.getFoo1());
            assertEquals("1:foo2", alias.getFoo2());
            assertEquals("1:foo3", alias.getFoo3());
            assertEquals("1:foo4", alias.getFoo4());
            ++number;
        }
    }

    protected void registerTestData() {
        {
            WhiteStilettoAlias alias = new WhiteStilettoAlias();
            alias.setStilettoAliasId(1);
            alias.setFoo("1:foo0");
            alias.setFoo1("1:foo1");
            alias.setFoo2("1:foo2");
            alias.setFoo3("1:foo3");
            alias.setFoo4("1:foo4");
            whiteStilettoAliasBhv.insert(alias);

            {
                WhiteStilettoAliasRef ref = new WhiteStilettoAliasRef();
                ref.setRefId(1);
                ref.setFoo0("1-1:foo0");
                ref.setFoo1("1-1:foo1");
                ref.setFoo2("1-1:foo2");
                ref.setFoo3("1-1:foo3");
                ref.setFoo4("1-1:foo4");
                ref.setStilettoAliasId(1);
                whiteStilettoAliasRefBhv.insert(ref);
            }
            {
                WhiteStilettoAliasRef ref = new WhiteStilettoAliasRef();
                ref.setRefId(2);
                ref.setFoo0("1-2:foo0");
                ref.setFoo1("1-2:foo1");
                ref.setFoo2("1-2:foo2");
                ref.setFoo3("1-2:foo3");
                ref.setFoo4("1-2:foo4");
                ref.setStilettoAliasId(1);
                whiteStilettoAliasRefBhv.insert(ref);
            }
        }
    }
}
