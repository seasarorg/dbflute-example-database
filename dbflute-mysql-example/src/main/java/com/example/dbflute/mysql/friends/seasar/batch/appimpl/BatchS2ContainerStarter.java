package com.example.dbflute.mysql.friends.seasar.batch.appimpl;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchController;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchInvoker;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchReturn;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchStarter;

/**
 * Batch starter for executing batch controllers using S2Container. <br />
 * This doesn't have scheduling system. Executing only.
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class BatchS2ContainerStarter extends BatchStarter {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BatchS2ContainerStarter(BatchReturn defaultBatchReturn) {
        super(defaultBatchReturn);
    }

    // ===================================================================================
    //                                                         Container Handling Override
    //                                                         ===========================
    @Override
    protected void initializeContainer() {
        SingletonS2ContainerFactory.setConfigPath("batch.dicon");
        SingletonS2ContainerFactory.init();
    }

    @Override
    protected BatchInvoker getBatchInvoker() {
        return SingletonS2Container.getComponent(BatchInvoker.class);
    }

    @Override
    protected BatchController getBatchController(String componentKey) {
        return SingletonS2Container.getComponent(componentKey);
    }
}
