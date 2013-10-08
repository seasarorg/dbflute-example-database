package com.example.dbflute.mysql.dbflute.freegen;

import java.io.Serializable;

/**
 * @author FreeGen
 */
public class FooDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /** name=FOO_ID camelize=FooId, capCamelName=FooId */
    protected Integer fooId;

    /** name=FOO_NAME camelize=FooName, capCamelName=FooName */
    protected String fooName;

    public Integer getFooId() {
        return fooId;
    }

    public void setFooId(Integer value) {
        fooId = value;
    }

    public String getFooName() {
        return fooName;
    }

    public void setFooName(String value) {
        fooName = value;
    }
}
