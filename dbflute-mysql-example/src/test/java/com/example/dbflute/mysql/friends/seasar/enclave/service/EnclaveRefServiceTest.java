package com.example.dbflute.mysql.friends.seasar.enclave.service;

import com.example.dbflute.mysql.friends.seasar.enclave.service.EnclaveRefService;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class EnclaveRefServiceTest extends UnitContainerTestCase {

    private EnclaveRefService enclaveRefService;

    public void test_checkIndirectJdbcComponentInjection() throws Exception {
        // ## Arrange ##
        // ## Act ##
        // ## Assert ##
        enclaveRefService.checkIndirectJdbcComponentInjection(); // expect no exception
    }
}
