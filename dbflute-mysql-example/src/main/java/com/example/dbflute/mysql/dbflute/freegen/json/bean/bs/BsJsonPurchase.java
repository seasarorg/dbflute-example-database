package com.example.dbflute.mysql.dbflute.freegen.json.bean.bs;

import java.io.Serializable;
import com.example.dbflute.mysql.dbflute.freegen.json.bean.ex.*;

/**
 * purchase table
 * @author FreeGen
 */
public class BsJsonPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PURCHASE_ID */
    protected Integer purchaseId;

    /** MEMBER_ID */
    protected Integer memberId;

    /** JSON_MEMBER */
    protected JsonMember jsonMember;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer value) {
        purchaseId = value;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer value) {
        memberId = value;
    }

    public JsonMember getJsonMember() {
        return jsonMember;
    }

    public void setJsonMember(JsonMember value) {
        jsonMember = value;
    }

}
