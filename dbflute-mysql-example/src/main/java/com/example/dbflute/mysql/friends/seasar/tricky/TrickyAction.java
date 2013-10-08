package com.example.dbflute.mysql.friends.seasar.tricky;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

/**
 * @author jflute
 */
public class TrickyAction {

    protected TrickyFlute _trickyFlute;

    public TrickyFlute getTrickyFlute() {
        return _trickyFlute;
    }

    @Binding(bindingType = BindingType.MUST)
    public void setTrickyFlute(TrickyFlute trickyFlute) {
        this._trickyFlute = trickyFlute;
    }
}
