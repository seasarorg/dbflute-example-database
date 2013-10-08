package com.example.dbflute.mysql.friends.seasar.batch.appimpl;

import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchReturn;

/**
 * Batch main class for executing batch controllers. <br />
 * This doesn't have scheduling system. Executing only.
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class BatchMain {

    public static void main(String[] args) {
        final BatchReturn defaultError = BatchReturn.create(9);
        final BatchS2ContainerStarter starter = new BatchS2ContainerStarter(defaultError);
        starter.fire(args);
    }
}
