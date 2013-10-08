package com.example.dbflute.mysql.friends.seasar.tricky;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jflute
 */
public class TrickyFlute {

    protected String _mark;

    public static class Builder {

        private final HttpServletRequest _request;

        public Builder(HttpServletRequest request) {
            _request = request;
        }

        public TrickyFlute build() {
            Object attribute = _request.getAttribute("foo");
            if (attribute != null) {
                throw new IllegalStateException("Oh, NO!");
            }
            TrickyFlute trickyFlute = new TrickyFlute();
            trickyFlute.setMark("build()");
            return trickyFlute;
        }
    }

    public String getMark() {
        return _mark;
    }

    public void setMark(String mark) {
        this._mark = mark;
    }
}
