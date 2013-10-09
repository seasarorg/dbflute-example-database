package com.example.dbflute.postgresql.dbflute.whitebox;

import java.util.List;

import org.seasar.dbflute.exception.DangerousResultSizeException;
import org.seasar.dbflute.exception.FetchingOverSafetySizeException;

import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpReturnResultSetPmb;
import com.example.dbflute.postgresql.dbflute.exentity.customize.SpReturnResultSetReturnValue;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxProcedureCheckTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    public void test_call_safetyResult_dangerous() {
        // ## Arrange ##
        SpReturnResultSetPmb pmb = new SpReturnResultSetPmb();
        pmb.checkSafetyResult(5);

        // ## Act ##
        try {
            memberBhv.outsideSql().call(pmb);

            // ## Assert ##
            fail();
        } catch (DangerousResultSizeException e) {
            // OK
            log(e.getMessage());
            assertEquals(5, e.getSafetyMaxResultSize());
            assertEquals(FetchingOverSafetySizeException.class, e.getCause().getClass());
        }
    }

    public void test_call_safetyResult_safety() {
        // ## Arrange ##
        int maxSize;
        {
            SpReturnResultSetPmb pmb = new SpReturnResultSetPmb();
            memberBhv.outsideSql().call(pmb); // expect no exception
            maxSize = pmb.getReturnValue().size();
        }
        SpReturnResultSetPmb pmb = new SpReturnResultSetPmb();
        pmb.checkSafetyResult(maxSize);

        // ## Act ##
        memberBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        List<SpReturnResultSetReturnValue> returnValue = pmb.getReturnValue();
        assertEquals(maxSize, returnValue.size());
    }
}
