package com.example.dbflute.mysql.dbflute.freegen.json.bean.bs;

import java.io.Serializable;

/**
 * member table
 * @author FreeGen
 */
public class BsJsonMemberStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_STATUS_CODE */
    protected String memberStatusCode;

    /** MEMBER_STATUS_NAME */
    protected String memberStatusName;

    // [Referrers] *comment only
    // o JSON_MEMBER

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getMemberStatusCode() {
        return memberStatusCode;
    }

    public void setMemberStatusCode(String value) {
        memberStatusCode = value;
    }

    public String getMemberStatusName() {
        return memberStatusName;
    }

    public void setMemberStatusName(String value) {
        memberStatusName = value;
    }

}
