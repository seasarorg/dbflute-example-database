package com.example.dbflute.mysql.friends.seasar.batch.appimpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class BatchUntreatedMemberInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private Integer memberId;
    private String causeText;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    private BatchUntreatedMemberInfo() {
    }

    public static BatchUntreatedMemberInfo createAsDirect(Integer memberId, String causeText) {
        final BatchUntreatedMemberInfo info = new BatchUntreatedMemberInfo();
        info.setMemberId(memberId);
        info.setCauseText(causeText);
        return info;
    }

    public static BatchUntreatedMemberInfo createAsStandard(Integer memberId, String msg, Throwable e) {
        final BatchUntreatedMemberInfo info = new BatchUntreatedMemberInfo();
        info.setMemberId(memberId);
        info.setCauseText(msg + "\n" + getStackTrace(e));
        return info;
    }

    private static final String getStackTrace(Throwable e) {
        if (e == null) {
            String msg = "The argument 'e' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        StringWriter sw = null;
        try {
            sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            return sw.toString();
        } finally {
            if (sw != null) {
                try {
                    sw.close();
                } catch (IOException ignored) {
                }
            }
        }
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "{" + memberId + ": " + causeText + "}";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getCauseText() {
        return causeText;
    }

    public void setCauseText(String causeText) {
        this.causeText = causeText;
    }
}
