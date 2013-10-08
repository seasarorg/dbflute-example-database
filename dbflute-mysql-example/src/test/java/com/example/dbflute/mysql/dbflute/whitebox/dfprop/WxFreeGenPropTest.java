package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.unit.core.PlainTestCase;

import com.example.dbflute.mysql.dbflute.freegen.MessageDef;

/**
 * @author jflute
 */
public class WxFreeGenPropTest extends PlainTestCase {

    public void test_getMessage_noArg() throws Exception {
        // ## Arrange ##
        // ## Act ##
        String text = MessageDef.getErrorsAlreadyDelete();

        // ## Assert ##
        log(text);
        assertEquals("entityが既に削除済みです。", text);
    }

    public void test_getMessage_withArg() throws Exception {
        // ## Arrange ##
        // ## Act ##
        String text = MessageDef.getErrorsCreditcard("foo");

        // ## Assert ##
        log(text);
        assertEquals("fooはクレジットカード番号として不正です。", text);
    }
}