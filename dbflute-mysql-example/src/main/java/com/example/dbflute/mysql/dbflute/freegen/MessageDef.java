package com.example.dbflute.mysql.dbflute.freegen;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * @author FreeGen
 */
public class MessageDef implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("application");

    /** , name=ErrorsHeader, variable=0 */
    public static final String ERRORS_HEADER = "errors.header";
    /**
     * value=&lt;font color="red"&gt;&lt;ul&gt;
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsHeader() { // <font color="red"><ul>
        return MessageFormat.format(BUNDLE.getString(ERRORS_HEADER), (Object[])null);
    }

    /** , name=ErrorsFooter, variable=0 */
    public static final String ERRORS_FOOTER = "errors.footer";
    /**
     * value=&lt;/ul&gt;&lt;/font&gt;
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsFooter() { // </ul></font>
        return MessageFormat.format(BUNDLE.getString(ERRORS_FOOTER), (Object[])null);
    }

    /** , name=ErrorsPrefix, variable=0 */
    public static final String ERRORS_PREFIX = "errors.prefix";
    /**
     * value=&lt;li&gt;
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsPrefix() { // <li>
        return MessageFormat.format(BUNDLE.getString(ERRORS_PREFIX), (Object[])null);
    }

    /** , name=ErrorsSuffix, variable=0 */
    public static final String ERRORS_SUFFIX = "errors.suffix";
    /**
     * value=&lt;/li&gt;
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsSuffix() { // </li>
        return MessageFormat.format(BUNDLE.getString(ERRORS_SUFFIX), (Object[])null);
    }

    /** , name=ErrorsInvalid, variable=1 */
    public static final String ERRORS_INVALID = "errors.invalid";
    /**
     * value={0}が不正です。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsInvalid(String arg0) { // {0}が不正です。
        return MessageFormat.format(BUNDLE.getString(ERRORS_INVALID), arg0);
    }

    /** , name=ErrorsMaxlength, variable=2 */
    public static final String ERRORS_MAXLENGTH = "errors.maxlength";
    /**
     * value={0}の長さが最大値({1})を超えています。
     * @param arg0
     * @param arg1
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsMaxlength(String arg0, String arg1) { // {0}の長さが最大値({1})を超えています。
        return MessageFormat.format(BUNDLE.getString(ERRORS_MAXLENGTH), arg0, arg1);
    }

    /** , name=ErrorsMinlength, variable=2 */
    public static final String ERRORS_MINLENGTH = "errors.minlength";
    /**
     * value={0}の長さが最小値({1})未満です。
     * @param arg0
     * @param arg1
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsMinlength(String arg0, String arg1) { // {0}の長さが最小値({1})未満です。
        return MessageFormat.format(BUNDLE.getString(ERRORS_MINLENGTH), arg0, arg1);
    }

    /** , name=ErrorsMaxbytelength, variable=2 */
    public static final String ERRORS_MAXBYTELENGTH = "errors.maxbytelength";
    /**
     * value={0}のバイト長が最大値({1})を超えています。
     * @param arg0
     * @param arg1
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsMaxbytelength(String arg0, String arg1) { // {0}のバイト長が最大値({1})を超えています。
        return MessageFormat.format(BUNDLE.getString(ERRORS_MAXBYTELENGTH), arg0, arg1);
    }

    /** , name=ErrorsMinbytelength, variable=2 */
    public static final String ERRORS_MINBYTELENGTH = "errors.minbytelength";
    /**
     * value={0}のバイト長が最小値({1})未満です。
     * @param arg0
     * @param arg1
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsMinbytelength(String arg0, String arg1) { // {0}のバイト長が最小値({1})未満です。
        return MessageFormat.format(BUNDLE.getString(ERRORS_MINBYTELENGTH), arg0, arg1);
    }

    /** , name=ErrorsRange, variable=3 */
    public static final String ERRORS_RANGE = "errors.range";
    /**
     * value={0}は{1}と{2}の間でなければいけません。
     * @param arg0
     * @param arg1
     * @param arg2
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsRange(String arg0, String arg1, String arg2) { // {0}は{1}と{2}の間でなければいけません。
        return MessageFormat.format(BUNDLE.getString(ERRORS_RANGE), arg0, arg1, arg2);
    }

    /** , name=ErrorsRequired, variable=1 */
    public static final String ERRORS_REQUIRED = "errors.required";
    /**
     * value={0}は必須です。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsRequired(String arg0) { // {0}は必須です。
        return MessageFormat.format(BUNDLE.getString(ERRORS_REQUIRED), arg0);
    }

    /** , name=ErrorsByte, variable=1 */
    public static final String ERRORS_BYTE = "errors.byte";
    /**
     * value={0}はバイトでなければいけません。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsByte(String arg0) { // {0}はバイトでなければいけません。
        return MessageFormat.format(BUNDLE.getString(ERRORS_BYTE), arg0);
    }

    /** , name=ErrorsDate, variable=1 */
    public static final String ERRORS_DATE = "errors.date";
    /**
     * value={0}は日付でなければいけません
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsDate(String arg0) { // {0}は日付でなければいけません
        return MessageFormat.format(BUNDLE.getString(ERRORS_DATE), arg0);
    }

    /** , name=ErrorsDouble, variable=0 */
    public static final String ERRORS_DOUBLE = "errors.double";
    /**
     * value=
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsDouble() { // 
        return MessageFormat.format(BUNDLE.getString(ERRORS_DOUBLE), (Object[])null);
    }

    /** , name=ErrorsFloat, variable=0 */
    public static final String ERRORS_FLOAT = "errors.float";
    /**
     * value=
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsFloat() { // 
        return MessageFormat.format(BUNDLE.getString(ERRORS_FLOAT), (Object[])null);
    }

    /** , name=ErrorsInteger, variable=1 */
    public static final String ERRORS_INTEGER = "errors.integer";
    /**
     * value={0}は雀数でなければいけません。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsInteger(String arg0) { // {0}は雀数でなければいけません。
        return MessageFormat.format(BUNDLE.getString(ERRORS_INTEGER), arg0);
    }

    /** , name=ErrorsLong, variable=1 */
    public static final String ERRORS_LONG = "errors.long";
    /**
     * value={0}は長整数でなければいけません。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsLong(String arg0) { // {0}は長整数でなければいけません。
        return MessageFormat.format(BUNDLE.getString(ERRORS_LONG), arg0);
    }

    /** , name=ErrorsShort, variable=1 */
    public static final String ERRORS_SHORT = "errors.short";
    /**
     * value={0}は短整数でなければいけません。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsShort(String arg0) { // {0}は短整数でなければいけません。
        return MessageFormat.format(BUNDLE.getString(ERRORS_SHORT), arg0);
    }

    /** , name=ErrorsCreditcard, variable=1 */
    public static final String ERRORS_CREDITCARD = "errors.creditcard";
    /**
     * value={0}はクレジットカード番号として不正です。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsCreditcard(String arg0) { // {0}はクレジットカード番号として不正です。
        return MessageFormat.format(BUNDLE.getString(ERRORS_CREDITCARD), arg0);
    }

    /** , name=ErrorsEmail, variable=1 */
    public static final String ERRORS_EMAIL = "errors.email";
    /**
     * value={0}はメールアドレスとして不正です。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsEmail(String arg0) { // {0}はメールアドレスとして不正です。
        return MessageFormat.format(BUNDLE.getString(ERRORS_EMAIL), arg0);
    }

    /** , name=ErrorsUrl, variable=1 */
    public static final String ERRORS_URL = "errors.url";
    /**
     * value={0}はURLとして不正です。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsUrl(String arg0) { // {0}はURLとして不正です。
        return MessageFormat.format(BUNDLE.getString(ERRORS_URL), arg0);
    }

    /** , name=ErrorsUploadSize, variable=2 */
    public static final String ERRORS_UPLOAD_SIZE = "errors.upload.size";
    /**
     * value=上限が{1}バイトなのに実際は{0}バイトだったのでアップロードできませんでした。
     * @param arg1
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsUploadSize(String arg1, String arg0) { // 上限が{1}バイトなのに実際は{0}バイトだったのでアップロードできませんでした。
        return MessageFormat.format(BUNDLE.getString(ERRORS_UPLOAD_SIZE), arg1, arg0);
    }

    /** , name=ErrorsDateStrict, variable=1 */
    public static final String ERRORS_DATE_STRICT = "errors.date.strict";
    /**
     * value={0}は厳密な日付（形式=2008/01/02）でなければいけません。
     * @param arg0
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsDateStrict(String arg0) { // {0}は厳密な日付（形式=2008/01/02）でなければいけません。
        return MessageFormat.format(BUNDLE.getString(ERRORS_DATE_STRICT), arg0);
    }

    /** EntityAlreadyDeletedException, OptimistickLock Message, name=ErrorsAlreadyDelete, variable=0 */
    public static final String ERRORS_ALREADY_DELETE = "errors.already.delete";
    /**
     * value=entityが既に削除済みです。
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsAlreadyDelete() { // entityが既に削除済みです。
        return MessageFormat.format(BUNDLE.getString(ERRORS_ALREADY_DELETE), (Object[])null);
    }

    /** EntityAlreadyExistsException, OptimistickLock Message, name=ErrorsAlreadyExist, variable=0 */
    public static final String ERRORS_ALREADY_EXIST = "errors.already.exist";
    /**
     * value=entityが既に登録済みです。
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsAlreadyExist() { // entityが既に登録済みです。
        return MessageFormat.format(BUNDLE.getString(ERRORS_ALREADY_EXIST), (Object[])null);
    }
}
