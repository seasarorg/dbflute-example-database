package com.example.dbflute.mysql.friends.seasar.batch;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.unit.core.PlainTestCase;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchController;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchException;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchInvoker;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchReturn;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchStarter;
import com.example.dbflute.mysql.friends.seasar.batch.appimpl.BatchS2ContainerStarter;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class BatchStarterTest extends PlainTestCase {

    public void test_container_fire() {
        // ## Arrange ##
        if (SingletonS2ContainerFactory.hasContainer()) {
            SingletonS2ContainerFactory.destroy();
        }
        BatchS2ContainerStarter starter = new BatchS2ContainerStarter(BatchReturn.create(9));
        starter.noexit(); // for test

        // ## Act ##
        starter.fire(new String[] { "exampleBC", "S" });

        // ## Assert ##
        assertEquals(0, starter.getExitCode());
    }

    public void test_fire_basicExecution() {
        // ## Arrange ##
        final String expectedComponentName = "batch-test";
        final BatchReturn defaultBatchReturn = BatchReturn.create(9);
        final List<String> markList = new ArrayList<String>();
        final BatchStarter starter = new BatchStarter(defaultBatchReturn) {
            @Override
            protected void initializeContainer() {
                markList.add("initializeContainer");
            }

            @Override
            protected BatchController getBatchController(String batchComponentName) {
                markList.add("getBatchController");
                assertEquals(expectedComponentName, batchComponentName);
                return new BatchController() {
                    public void execute(List<String> argList) throws BatchException {
                        markList.add("BatchController.execute");
                    }
                };
            }

            @Override
            protected BatchInvoker getBatchInvoker() {
                markList.add("getBatchInvoker");
                return new BatchInvoker() {
                    public void invoke(String componentKey, BatchController controller, List<String> argList)
                            throws BatchException {
                        controller.execute(argList);
                    }
                };
            }

            @Override
            protected void existIfNeeds() {
                throw new UnsupportedOperationException("Because it's for test!");
            }
        };

        // ## Act ##
        starter.fire(new String[] { expectedComponentName });

        // ## Assert ##
        assertEquals("initializeContainer", markList.get(0));
        assertEquals("getBatchController", markList.get(1));
        assertEquals("getBatchInvoker", markList.get(2));
        assertEquals("BatchController.execute", markList.get(3));
    }

    public void test_fire_basicExecution_arguments() {
        // ## Arrange ##
        final String expectedComponentName = "batch-test";
        final BatchReturn defaultBatchReturn = BatchReturn.create(9);
        final List<String> markList = new ArrayList<String>();
        final BatchStarter starter = new BatchStarter(defaultBatchReturn) {
            @Override
            protected void initializeContainer() {
                markList.add("initializeContainer");
            }

            @Override
            protected BatchController getBatchController(String batchComponentName) {
                markList.add("getBatchController");
                assertEquals(expectedComponentName, batchComponentName);
                return new BatchController() {
                    public void execute(List<String> argList) throws BatchException {
                        markList.add("BatchController.execute");
                        assertEquals("foo", argList.get(0));
                        assertEquals("bar", argList.get(1));
                    }
                };
            }

            @Override
            protected BatchInvoker getBatchInvoker() {
                markList.add("getBatchInvoker");
                return new BatchInvoker() {
                    public void invoke(String componentKey, BatchController controller, List<String> argList)
                            throws BatchException {
                        controller.execute(argList);
                    }
                };
            }

            @Override
            protected void existIfNeeds() {
                throw new UnsupportedOperationException("Because it's for test!");
            }
        };

        // ## Act ##
        starter.fire(new String[] { expectedComponentName, "foo", "bar" });

        // ## Assert ##
        assertEquals("initializeContainer", markList.get(0));
        assertEquals("getBatchController", markList.get(1));
        assertEquals("getBatchInvoker", markList.get(2));
        assertEquals("BatchController.execute", markList.get(3));
    }

    public void test_fire_basicExecution_BatchException() {
        // ## Arrange ##
        final String expectedComponentName = "batch-test";
        final BatchReturn defaultBatchReturn = BatchReturn.create(9);
        final BatchReturn expectedBatchReturn = BatchReturn.create(123);
        final List<String> markList = new ArrayList<String>();
        final BatchStarter starter = new BatchStarter(defaultBatchReturn) {
            @Override
            protected void initializeContainer() {
                markList.add("initializeContainer");
            }

            @Override
            protected BatchController getBatchController(String batchComponentName) {
                markList.add("getBatchController");
                assertEquals(expectedComponentName, batchComponentName);
                return new BatchController() {
                    public void execute(List<String> argList) throws BatchException {
                        throw new BatchException("ExceptionTest", expectedBatchReturn);
                    }
                };
            }

            @Override
            protected BatchInvoker getBatchInvoker() {
                markList.add("getBatchInvoker");
                return new BatchInvoker() {
                    public void invoke(String componentKey, BatchController controller, List<String> argList)
                            throws BatchException {
                        controller.execute(argList);
                    }
                };
            }

            @Override
            protected void existIfNeeds() {
                markList.add("existIfNeeds");
            }
        };

        // ## Act ##
        starter.fire(new String[] { expectedComponentName });

        // ## Assert ##
        assertEquals(expectedBatchReturn.getBatchReturnCode(), starter.getExitCode());
        assertEquals("initializeContainer", markList.get(0));
        assertEquals("getBatchController", markList.get(1));
        assertEquals("getBatchInvoker", markList.get(2));
        assertEquals("existIfNeeds", markList.get(3));
    }

    public void test_fire_basicExecution_RuntimeException() {
        // ## Arrange ##
        final String expectedComponentName = "batch-test";
        final BatchReturn defaultBatchReturn = BatchReturn.create(9);
        final List<String> markList = new ArrayList<String>();
        final BatchStarter starter = new BatchStarter(defaultBatchReturn) {
            @Override
            protected void initializeContainer() {
                markList.add("initializeContainer");
            }

            @Override
            protected BatchController getBatchController(String batchComponentName) {
                markList.add("getBatchController");
                assertEquals(expectedComponentName, batchComponentName);
                return new BatchController() {
                    public void execute(List<String> argList) throws BatchException {
                        throw new RuntimeException("ExceptionTest");
                    }
                };
            }

            @Override
            protected BatchInvoker getBatchInvoker() {
                markList.add("getBatchInvoker");
                return new BatchInvoker() {
                    public void invoke(String componentKey, BatchController controller, List<String> argList)
                            throws BatchException {
                        controller.execute(argList);
                    }
                };
            }

            @Override
            protected void existIfNeeds() {
                markList.add("existIfNeeds");
            }
        };

        // ## Act ##
        starter.fire(new String[] { expectedComponentName });

        // ## Assert ##
        assertEquals(defaultBatchReturn.getBatchReturnCode(), starter.getExitCode());
        assertEquals("initializeContainer", markList.get(0));
        assertEquals("getBatchController", markList.get(1));
        assertEquals("getBatchInvoker", markList.get(2));
        assertEquals("existIfNeeds", markList.get(3));
    }
}
