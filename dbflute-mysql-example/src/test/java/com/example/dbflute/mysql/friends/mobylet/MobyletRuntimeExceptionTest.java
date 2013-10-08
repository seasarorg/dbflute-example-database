package com.example.dbflute.mysql.friends.mobylet;

import org.mobylet.core.MobyletRuntimeException;
import org.seasar.dbflute.unit.core.PlainTestCase;

/**
 * @author jflute
 */
public class MobyletRuntimeExceptionTest extends PlainTestCase {

    public void test_getCause() throws Exception {
        // ## Arrange ##
        IllegalStateException cause = new IllegalStateException("cause");
        MobyletRuntimeException ex = new MobyletRuntimeException("test", cause);

        // ## Act ##
        Throwable actual = ex.getCause();

        // ## Assert ##
        assertEquals(cause, actual);
    }
}
