package com.example.dbflute.mysql.dbflute.freegen.solr.bean.bs;

import java.io.Serializable;

/**
 * @author FreeGen
 */
public class BsSolrFooBean implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** foo_unique_id (string) */
    protected String fooUniqueId;

    /** foo_id (tlong) */
    protected Long fooId;

    /** footer_id (tlong) */
    protected Long footerId;

    /** foo_type_cd (string) */
    protected String fooTypeCd;

    /** foo_manage_key (text_cjk) */
    protected String fooManageKey;

    /** foo_name (text_cjk) */
    protected String fooName;

    /** foo_memo (text_cjk) */
    protected String fooMemo;

    /** foo_datetime (tdate) */
    protected java.util.Date fooDatetime;

    /** foo_category_cd (string) */
    protected String[] fooCategoryCd;

    /** foo_category_group_cd (string) */
    protected String[] fooCategoryGroupCd;

    /** foo_display_no (string) */
    protected String[] fooDisplayNo;

    /** dynamic field: _foo_ (tint) cap=foo, Foo */
    protected Integer[] dynamic_foo_dynamic;

    /** dynamic field: _bar (tint) cap=bar, Bar */
    protected Integer[] dynamic_bar;

    /** dynamic field: qux_ (tlong) cap=qux, Qux */
    protected Long[] qux_dynamic;

    /** dynamic field: foo__bar (tlong) cap=fooBar, FooBar */
    protected Long[] foo_dynamic_bar;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getFooUniqueId() {
        return fooUniqueId;
    }

    public void setFooUniqueId(String value) {
        fooUniqueId = value;
    }

    public Long getFooId() {
        return fooId;
    }

    public void setFooId(Long value) {
        fooId = value;
    }

    public Long getFooterId() {
        return footerId;
    }

    public void setFooterId(Long value) {
        footerId = value;
    }

    public String getFooTypeCd() {
        return fooTypeCd;
    }

    public void setFooTypeCd(String value) {
        fooTypeCd = value;
    }

    public String getFooManageKey() {
        return fooManageKey;
    }

    public void setFooManageKey(String value) {
        fooManageKey = value;
    }

    public String getFooName() {
        return fooName;
    }

    public void setFooName(String value) {
        fooName = value;
    }

    public String getFooMemo() {
        return fooMemo;
    }

    public void setFooMemo(String value) {
        fooMemo = value;
    }

    public java.util.Date getFooDatetime() {
        return fooDatetime;
    }

    public void setFooDatetime(java.util.Date value) {
        fooDatetime = value;
    }

    public String[] getFooCategoryCd() {
        return fooCategoryCd;
    }

    public void setFooCategoryCd(String[] value) {
        fooCategoryCd = value;
    }

    public String[] getFooCategoryGroupCd() {
        return fooCategoryGroupCd;
    }

    public void setFooCategoryGroupCd(String[] value) {
        fooCategoryGroupCd = value;
    }

    public String[] getFooDisplayNo() {
        return fooDisplayNo;
    }

    public void setFooDisplayNo(String[] value) {
        fooDisplayNo = value;
    }

    // dynamic field: _foo_ (tint)
    // dynamic field: _bar (tint)
    // dynamic field: qux_ (tlong)
    // dynamic field: foo__bar (tlong)
}
