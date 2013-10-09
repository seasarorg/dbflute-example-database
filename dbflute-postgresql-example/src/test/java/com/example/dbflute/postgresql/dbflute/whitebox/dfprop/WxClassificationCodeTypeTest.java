package com.example.dbflute.postgresql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.jdbc.ClassificationCodeType;
import org.seasar.dbflute.s2dao.valuetype.TnValueTypes;

import com.example.dbflute.postgresql.dbflute.allcommon.CDef;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.3 (2009/08/01 Saturdayy)
 */
public class WxClassificationCodeTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                          ColumnInfo
    //                                                                          ==========
    public void test_dataType() {
        // ## Arrange ##
        ClassificationCodeType numberType = ClassificationCodeType.Number;
        ClassificationCodeType stringType = ClassificationCodeType.String;
        ClassificationCodeType booleanType = ClassificationCodeType.Boolean;

        // ## Act & Assert ##
        assertEquals(numberType, CDef.Flg.True.meta().codeType()); // as specified
        assertEquals(stringType, CDef.MemberStatus.Formalized.meta().codeType()); // as default
        assertEquals(booleanType, CDef.TrueFalse.True.meta().codeType()); // as specified
        assertEquals(TnValueTypes.CLASSIFICATION, TnValueTypes.getValueType(CDef.Flg.True));
    }
}