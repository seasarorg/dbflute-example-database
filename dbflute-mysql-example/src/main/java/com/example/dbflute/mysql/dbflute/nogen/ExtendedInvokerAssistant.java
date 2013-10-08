package com.example.dbflute.mysql.dbflute.nogen;

import org.seasar.dbflute.exception.factory.DefaultSQLExceptionHandlerFactory;
import org.seasar.dbflute.exception.factory.ExceptionMessageBuilder;
import org.seasar.dbflute.exception.factory.SQLExceptionHandlerFactory;
import org.seasar.dbflute.exception.handler.SQLExceptionHandler;
import org.seasar.dbflute.exception.handler.SQLExceptionResource;

import com.example.dbflute.mysql.dbflute.allcommon.ImplementedInvokerAssistant;

/**
 * @author jflute
 */
public class ExtendedInvokerAssistant extends ImplementedInvokerAssistant {

    // ===================================================================================
    //                                                                    Environment Type
    //                                                                    ================
    private static volatile boolean _realEnvironment = false;

    private static boolean isRealEnvironment() {
        return _realEnvironment;
    }

    // utility variable for test-friendliness (NOT related to this example of extension)
    public static synchronized void setRealEnvironment(boolean realEnvironment) {
        _realEnvironment = realEnvironment;
    }

    // ===================================================================================
    //                                                        SQLException Handler Factory
    //                                                        ============================
    @Override
    public SQLExceptionHandlerFactory assistSQLExceptionHandlerFactory() {
        return new ExtendedSQLExceptionHandlerFactory();
    }

    public static class ExtendedSQLExceptionHandlerFactory extends DefaultSQLExceptionHandlerFactory {
        @Override
        public SQLExceptionHandler create() {
            return new SQLExceptionHandler() {
                @Override
                protected void setupTargetSqlElement(ExceptionMessageBuilder br, SQLExceptionResource resource) {
                    if (isRealEnvironment()) {
                        // for the test of using executedSql instead of displaySql
                        final String executedSql = resource.getExecutedSql();
                        if (executedSql != null) {
                            br.addItem("Executed SQL");
                            br.addElement(executedSql);
                            br.addElement("*NOT use displaySql for security");
                        }
                    } else {
                        super.setupTargetSqlElement(br, resource);
                    }
                }
            };
        }
    }
}
