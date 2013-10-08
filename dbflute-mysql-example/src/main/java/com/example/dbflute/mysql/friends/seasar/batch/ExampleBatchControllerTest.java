package com.example.dbflute.mysql.friends.seasar.batch;

import com.example.dbflute.mysql.friends.seasar.batch.unit.BatchAllThroughTestCase;

/**
 * @author jflute
 * @since 0.9.5.2 (2009/07/15 Wednesday)
 */
public class ExampleBatchControllerTest extends BatchAllThroughTestCase {

    public void test_dummy() { // for suppressing warning
    }

    // add "test_" to method name as prefix temporarily for executing
    public void container_fire() {
        // ## Arrange ##
        String componentKey = "exampleBC";

        // ## Act ##
        fire(new String[] { componentKey, "S" }, new Arrangement() {
            public void callback() {
                // ## Arrange ##
                log("...Changing table data for test");
            }
        }, new Assertion() {
            public void callback(Throwable exception) {
                // ## Assert ##
                log("...Asserting table data as result");
                throwExceptionIfNotNull(exception);
            }
        });
    }
}
