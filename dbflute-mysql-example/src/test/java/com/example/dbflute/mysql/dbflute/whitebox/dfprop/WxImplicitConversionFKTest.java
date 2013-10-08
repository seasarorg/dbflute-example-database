package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;

import com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitConvIntegerCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitConvNumericCB;
import com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitConvStringCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitConvIntegerBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitConvNumericBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitConvStringBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitConvInteger;
import com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitConvNumeric;
import com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitConvString;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.0C (2011/08/20 Saturday)
 */
public class WxImplicitConversionFKTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteImplicitConvIntegerBhv whiteImplicitConvIntegerBhv;
    private WhiteImplicitConvNumericBhv whiteImplicitConvNumericBhv;
    private WhiteImplicitConvStringBhv whiteImplicitConvStringBhv;

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    public void test_SetupSelect_Integer() {
        // ## Arrange ##
        xregisterTestData();
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
        cb.setupSelect_WhiteImplicitConvString();
        cb.setupSelect_WhiteImplicitConvNumeric();

        // ## Act ##
        List<WhiteImplicitConvInteger> integerList = whiteImplicitConvIntegerBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(integerList);
        for (WhiteImplicitConvInteger integer : integerList) {
            WhiteImplicitConvNumeric numeric = integer.getWhiteImplicitConvNumeric();
            assertNotNull(numeric);
            assertNotNull(numeric.getImplicitConvNumericId());
            WhiteImplicitConvString string = integer.getWhiteImplicitConvString();
            assertNotNull(string);
            assertNotNull(string.getImplicitConvStringId());
            log(integer.getImplicitConvIntegerId() + ", " + numeric.getImplicitConvNumericId() + ", "
                    + string.getImplicitConvStringId());
        }
    }

    public void test_SetupSelect_Numeric() {
        // ## Arrange ##
        xregisterTestData();
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
        cb.setupSelect_WhiteImplicitConvInteger();
        cb.setupSelect_WhiteImplicitConvString();

        // ## Act ##
        List<WhiteImplicitConvNumeric> numericList = whiteImplicitConvNumericBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(numericList);
        for (WhiteImplicitConvNumeric numeric : numericList) {
            WhiteImplicitConvInteger integer = numeric.getWhiteImplicitConvInteger();
            assertNotNull(integer);
            assertNotNull(integer.getImplicitConvIntegerId());
            WhiteImplicitConvString string = numeric.getWhiteImplicitConvString();
            assertNotNull(string);
            assertNotNull(string.getImplicitConvStringId());
            log(numeric.getImplicitConvNumericId() + ", " + integer.getImplicitConvIntegerId() + ", "
                    + string.getImplicitConvStringId());
        }
    }

    public void test_SetupSelect_String() {
        // ## Arrange ##
        xregisterTestData();
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
        cb.setupSelect_WhiteImplicitConvInteger();
        cb.setupSelect_WhiteImplicitConvNumeric();

        // ## Act ##
        List<WhiteImplicitConvString> stringList = whiteImplicitConvStringBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(stringList);
        for (WhiteImplicitConvString string : stringList) {
            WhiteImplicitConvInteger integer = string.getWhiteImplicitConvInteger();
            assertNotNull(integer);
            assertNotNull(integer.getImplicitConvIntegerId());
            WhiteImplicitConvNumeric numeric = string.getWhiteImplicitConvNumeric();
            assertNotNull(numeric);
            assertNotNull(numeric.getImplicitConvNumericId());
            log(string.getImplicitConvStringId() + ", " + numeric.getImplicitConvNumericId() + ", "
                    + integer.getImplicitConvIntegerId());
        }
    }

    // ===================================================================================
    //                                                                        LoadReferrer
    //                                                                        ============
    public void test_LoadReferrer_Integer() {
        // ## Arrange ##
        xregisterTestData();
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();

        // ## Act ##
        List<WhiteImplicitConvInteger> integerList = whiteImplicitConvIntegerBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(integerList);
        whiteImplicitConvIntegerBhv.loadWhiteImplicitConvNumericList(integerList,
                new ConditionBeanSetupper<WhiteImplicitConvNumericCB>() {
                    public void setup(WhiteImplicitConvNumericCB cb) {
                    }
                });
        whiteImplicitConvIntegerBhv.loadWhiteImplicitConvStringList(integerList,
                new ConditionBeanSetupper<WhiteImplicitConvStringCB>() {
                    public void setup(WhiteImplicitConvStringCB cb) {
                    }
                });
        boolean existsNumeric = false;
        boolean existsString = false;
        for (WhiteImplicitConvInteger integer : integerList) {
            List<WhiteImplicitConvNumeric> numericList = integer.getWhiteImplicitConvNumericList();
            if (!numericList.isEmpty()) {
                existsNumeric = true;
            }
            for (WhiteImplicitConvNumeric numeric : numericList) {
                assertNotNull(numeric.getImplicitConvNumericId());
            }
            List<WhiteImplicitConvString> stringList = integer.getWhiteImplicitConvStringList();
            if (!stringList.isEmpty()) {
                existsString = true;
            }
            for (WhiteImplicitConvString string : stringList) {
                assertNotNull(string.getImplicitConvStringId());
            }
        }
        assertTrue(existsNumeric);
        assertTrue(existsString);
    }

    public void test_LoadReferrer_Numeric() {
        // ## Arrange ##
        xregisterTestData();
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();

        // ## Act ##
        List<WhiteImplicitConvNumeric> numericList = whiteImplicitConvNumericBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(numericList);
        whiteImplicitConvNumericBhv.loadWhiteImplicitConvIntegerList(numericList,
                new ConditionBeanSetupper<WhiteImplicitConvIntegerCB>() {
                    public void setup(WhiteImplicitConvIntegerCB cb) {
                    }
                });
        whiteImplicitConvNumericBhv.loadWhiteImplicitConvStringList(numericList,
                new ConditionBeanSetupper<WhiteImplicitConvStringCB>() {
                    public void setup(WhiteImplicitConvStringCB cb) {
                    }
                });
        boolean existsInteger = false;
        boolean existsString = false;
        for (WhiteImplicitConvNumeric numeric : numericList) {
            List<WhiteImplicitConvInteger> integerList = numeric.getWhiteImplicitConvIntegerList();
            if (!integerList.isEmpty()) {
                existsInteger = true;
            }
            for (WhiteImplicitConvInteger integer : integerList) {
                assertNotNull(integer.getImplicitConvIntegerId());
            }
            List<WhiteImplicitConvString> stringList = numeric.getWhiteImplicitConvStringList();
            if (!stringList.isEmpty()) {
                existsString = true;
            }
            for (WhiteImplicitConvString string : stringList) {
                assertNotNull(string.getImplicitConvStringId());
            }
        }
        assertTrue(existsInteger);
        assertTrue(existsString);
    }

    public void test_LoadReferrer_String() {
        // ## Arrange ##
        xregisterTestData();
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();

        // ## Act ##
        List<WhiteImplicitConvString> stringList = whiteImplicitConvStringBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(stringList);
        whiteImplicitConvStringBhv.loadWhiteImplicitConvIntegerList(stringList,
                new ConditionBeanSetupper<WhiteImplicitConvIntegerCB>() {
                    public void setup(WhiteImplicitConvIntegerCB cb) {
                    }
                });
        whiteImplicitConvStringBhv.loadWhiteImplicitConvNumericList(stringList,
                new ConditionBeanSetupper<WhiteImplicitConvNumericCB>() {
                    public void setup(WhiteImplicitConvNumericCB cb) {
                    }
                });
        boolean existsInteger = false;
        boolean existsNumeric = false;
        for (WhiteImplicitConvString string : stringList) {
            List<WhiteImplicitConvInteger> integerList = string.getWhiteImplicitConvIntegerList();
            if (!integerList.isEmpty()) {
                existsInteger = true;
            }
            for (WhiteImplicitConvInteger integer : integerList) {
                assertNotNull(integer.getImplicitConvIntegerId());
            }
            List<WhiteImplicitConvNumeric> numericList = string.getWhiteImplicitConvNumericList();
            if (!numericList.isEmpty()) {
                existsNumeric = true;
            }
            for (WhiteImplicitConvNumeric numeric : numericList) {
                assertNotNull(numeric.getImplicitConvNumericId());
            }
        }
        assertTrue(existsInteger);
        assertTrue(existsNumeric);
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private void xregisterTestData() {
        xregisterIntegerList();
        xregisterNumericList();
        xregisterStringList();
    }

    private List<WhiteImplicitConvInteger> xregisterIntegerList() {
        List<WhiteImplicitConvInteger> mainList = new ArrayList<WhiteImplicitConvInteger>();
        mainList.add(xdoRegisterImplicitConvInteger(1, 10, 100));
        mainList.add(xdoRegisterImplicitConvInteger(2, 10, 100));
        mainList.add(xdoRegisterImplicitConvInteger(3, 10, 100));
        mainList.add(xdoRegisterImplicitConvInteger(4, 40, 400));
        mainList.add(xdoRegisterImplicitConvInteger(5, 40, 400));
        mainList.add(xdoRegisterImplicitConvInteger(6, 40, 400));
        return mainList;
    }

    private List<WhiteImplicitConvNumeric> xregisterNumericList() {
        List<WhiteImplicitConvNumeric> mainList = new ArrayList<WhiteImplicitConvNumeric>();
        mainList.add(xdoRegisterImplicitConvNumeric("10", "1", "100"));
        mainList.add(xdoRegisterImplicitConvNumeric("20", "1", "100"));
        mainList.add(xdoRegisterImplicitConvNumeric("30", "1", "100"));
        mainList.add(xdoRegisterImplicitConvNumeric("40", "4", "400"));
        mainList.add(xdoRegisterImplicitConvNumeric("50", "4", "400"));
        mainList.add(xdoRegisterImplicitConvNumeric("60", "4", "400"));
        return mainList;
    }

    private List<WhiteImplicitConvString> xregisterStringList() {
        List<WhiteImplicitConvString> mainList = new ArrayList<WhiteImplicitConvString>();
        mainList.add(xdoRegisterImplicitConvString("100", "1", "10"));
        mainList.add(xdoRegisterImplicitConvString("200", "1", "10"));
        mainList.add(xdoRegisterImplicitConvString("300", "1", "10"));
        mainList.add(xdoRegisterImplicitConvString("400", "4", "40"));
        mainList.add(xdoRegisterImplicitConvString("500", "4", "40"));
        mainList.add(xdoRegisterImplicitConvString("600", "4", "40"));
        return mainList;
    }

    private WhiteImplicitConvInteger xdoRegisterImplicitConvInteger(Integer integerId, Integer numeridId,
            Integer stringId) {
        WhiteImplicitConvInteger main = new WhiteImplicitConvInteger();
        main.setImplicitConvIntegerId(integerId);
        main.setImplicitConvNumericId(numeridId);
        main.setImplicitConvStringId(stringId);
        main.setImplicitConvName("Integer");
        whiteImplicitConvIntegerBhv.insert(main);
        return main;
    }

    private WhiteImplicitConvNumeric xdoRegisterImplicitConvNumeric(String numeridId, String integerId, String stringId) {
        WhiteImplicitConvNumeric main = new WhiteImplicitConvNumeric();
        main.setImplicitConvNumericId(new BigDecimal(numeridId));
        main.setImplicitConvIntegerId(new BigDecimal(integerId));
        main.setImplicitConvStringId(new BigDecimal(stringId));
        main.setImplicitConvName("BigDecimal");
        whiteImplicitConvNumericBhv.insert(main);
        return main;
    }

    private WhiteImplicitConvString xdoRegisterImplicitConvString(String stringId, String integerId, String numeridId) {
        WhiteImplicitConvString main = new WhiteImplicitConvString();
        main.setImplicitConvStringId(stringId);
        main.setImplicitConvIntegerId(integerId);
        main.setImplicitConvNumericId(numeridId);
        main.setImplicitConvName("String");
        whiteImplicitConvStringBhv.insert(main);
        return main;
    }
}
