package com.example.dbflute.postgresql.mytype;

/**
 * Simple example of extending Array Type.
 * @author jflute
 */
public class MyXML {

    protected String xmlString;

    public MyXML setup(String xmlString) {
        this.xmlString = xmlString;
        return this;
    }

    public String getArrayString() {
        return xmlString;
    }

    public void setArrayString(String arrayString) {
        this.xmlString = arrayString;
    }
    
    @Override
    public String toString() {
        return xmlString != null ? xmlString : "<empty />";
    }
}
