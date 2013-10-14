package com.example.dbflute.db2.dbflute.exbhv.pmbean;

import com.example.dbflute.db2.dbflute.bsbhv.pmbean.BsSpInOutReturnPmb;

/**
 * <!-- df:beginClassDescription -->
 * The typed parameter-bean of SpInOutReturn. <br />
 * This is related to "<span style="color: #AD4747">DFEXDB.SP_IN_OUT_RETURN</span>".
 * <!-- df:endClassDescription -->
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SpInOutReturnPmb extends BsSpInOutReturnPmb {

    public static final String returnValue_PROCEDURE_PARAMETER = "return, -1";

    /** returnValue */
    protected Integer _returnValue;

    @Override
    public String toString() {
        return super.toString() + "+return=" + _returnValue;
    }

    /**
     * [get] returnValue <br />
     * @return The value of returnValue. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public Integer getReturnValue() {
        return _returnValue;
    }

    /**
     * [set] returnValue <br />
     * @param returnValue The value of returnValue. (Nullable)
     */
    public void setReturnValue(Integer returnValue) {
        _returnValue = returnValue;
    }
}
