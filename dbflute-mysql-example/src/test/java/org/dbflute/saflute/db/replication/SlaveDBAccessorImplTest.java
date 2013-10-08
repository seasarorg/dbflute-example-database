package org.dbflute.saflute.db.replication;

import org.seasar.extension.datasource.DataSourceFactory;

import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class SlaveDBAccessorImplTest extends UnitContainerTestCase {

    private DataSourceFactory dataSourceFactory;

    public void test_accessFixedly() throws Exception {
        // ## Arrange ##
        final String expectedName = "slave";
        SlaveDBAccessor accessor = new SlaveDBAccessorImpl();
        inject(accessor);

        // ## Act ##
        String result = accessor.accessFixedly(new SlaveDBCallback<String>() {
            public String callback() {
                String current = dataSourceFactory.getSelectableDataSourceName();
                log("current name = " + current);
                assertEquals(expectedName, current);
                return "returnValue";
            }
        });

        // ## Assert ##
        assertEquals("returnValue", result);
    }

    public void test_accessRandomFifty_true() throws Exception {
        // ## Arrange ##
        final String expectedName = "slave";
        SlaveDBAccessor accessor = new SlaveDBAccessorImpl() {
            @Override
            protected boolean isRandomFiftyHit(long determinationNumber) {
                return true;
            }
        };
        inject(accessor);

        // ## Act ##
        String result = accessor.accessRandomFifty(new SlaveDBCallback<String>() {
            public String callback() {
                String current = dataSourceFactory.getSelectableDataSourceName();
                log("current name = " + current);
                assertEquals(expectedName, current);
                return "returnValue";
            }
        }, 0);

        // ## Assert ##
        assertEquals("returnValue", result);
    }

    public void test_accessRandomFifty_false() throws Exception {
        // ## Arrange ##
        SlaveDBAccessor accessor = new SlaveDBAccessorImpl() {
            @Override
            protected boolean isRandomFiftyHit(long determinationNumber) {
                return false;
            }
        };
        inject(accessor);

        // ## Act ##
        String result = accessor.accessRandomFifty(new SlaveDBCallback<String>() {
            public String callback() {
                String current = dataSourceFactory.getSelectableDataSourceName();
                log("current name = " + current);
                assertNull(current); // means default
                return "returnValue";
            }
        }, 0);

        // ## Assert ##
        assertEquals("returnValue", result);
    }

    public void test_isRandomFiftyHit() {
        // ## Arrange ##
        SlaveDBAccessorImpl accessor = new SlaveDBAccessorImpl();

        // ## Act ##
        boolean existsTrue = false;
        boolean existsFalse = false;
        while (true) {
            boolean actual = accessor.isRandomFiftyHit(System.currentTimeMillis());
            if (actual) {
                existsTrue = true;
            } else {
                existsFalse = true;
            }

            // ## Assert ##
            if (existsTrue && existsFalse) {
                break;
            }
        }
    }
}
