package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of (隣の秘密で権限あり)SYNONYM_NEXT_SECRET_AUTH as SYNONYM. <br />
 * シノニムで見えてOK。まあ権限あるから結局直接見えるけど
 * <pre>
 * [primary-key]
 *     SECRET_AUTH_CODE
 * 
 * [column]
 *     SECRET_AUTH_CODE, SECRET_AUTH_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String secretAuthCode = entity.getSecretAuthCode();
 * String secretAuthName = entity.getSecretAuthName();
 * entity.setSecretAuthCode(secretAuthCode);
 * entity.setSecretAuthName(secretAuthName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymNextSecretAuth extends AbstractEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)} */
    protected String _secretAuthCode;

    /** (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)} */
    protected String _secretAuthName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SYNONYM_NEXT_SECRET_AUTH";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymNextSecretAuth";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getSecretAuthCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSynonymNextSecretAuth) {
            BsSynonymNextSecretAuth other = (BsSynonymNextSecretAuth)obj;
            if (!xSV(_secretAuthCode, other._secretAuthCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _secretAuthCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_secretAuthCode));
        sb.append(dm).append(xfND(_secretAuthName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String myutilDatePattern() {
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SynonymNextSecretAuth clone() {
        return (SynonymNextSecretAuth)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)} <br />
     * 隣の商品を秘密するかもしれない
     * @return The value of the column 'SECRET_AUTH_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretAuthCode() {
        checkSpecifiedProperty("secretAuthCode");
        return _secretAuthCode;
    }

    /**
     * [set] (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)} <br />
     * 隣の商品を秘密するかもしれない
     * @param secretAuthCode The value of the column 'SECRET_AUTH_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecretAuthCode(String secretAuthCode) {
        registerModifiedProperty("secretAuthCode");
        _secretAuthCode = secretAuthCode;
    }

    /**
     * [get] (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)} <br />
     * @return The value of the column 'SECRET_AUTH_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretAuthName() {
        checkSpecifiedProperty("secretAuthName");
        return _secretAuthName;
    }

    /**
     * [set] (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)} <br />
     * @param secretAuthName The value of the column 'SECRET_AUTH_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSecretAuthName(String secretAuthName) {
        registerModifiedProperty("secretAuthName");
        _secretAuthName = secretAuthName;
    }
}
