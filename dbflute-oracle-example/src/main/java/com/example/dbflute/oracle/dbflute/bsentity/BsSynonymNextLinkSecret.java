package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of SYNONYM_NEXT_LINK_SECRET as SYNONYM. <br />
 * <pre>
 * [primary-key]
 *     SECRET_CODE
 * 
 * [column]
 *     SECRET_CODE, SECRET_NAME, SECRET_AUTH_CODE
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
 * String secretCode = entity.getSecretCode();
 * String secretName = entity.getSecretName();
 * String secretAuthCode = entity.getSecretAuthCode();
 * entity.setSecretCode(secretCode);
 * entity.setSecretName(secretName);
 * entity.setSecretAuthCode(secretAuthCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymNextLinkSecret extends AbstractEntity {

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
    /** SECRET_CODE: {PK, NotNull, CHAR(3)} */
    protected String _secretCode;

    /** SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} */
    protected String _secretName;

    /** SECRET_AUTH_CODE: {CHAR(3)} */
    protected String _secretAuthCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SYNONYM_NEXT_LINK_SECRET";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymNextLinkSecret";
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
        if (getSecretCode() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param secretName : UQ, NotNull, VARCHAR2(50). (NotNull)
     */
    public void uniqueBy(String secretName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("secretName");
        setSecretName(secretName);
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
        if (obj instanceof BsSynonymNextLinkSecret) {
            BsSynonymNextLinkSecret other = (BsSynonymNextLinkSecret)obj;
            if (!xSV(_secretCode, other._secretCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _secretCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_secretCode));
        sb.append(dm).append(xfND(_secretName));
        sb.append(dm).append(xfND(_secretAuthCode));
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
    public SynonymNextLinkSecret clone() {
        return (SynonymNextLinkSecret)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SECRET_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'SECRET_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretCode() {
        checkSpecifiedProperty("secretCode");
        return _secretCode;
    }

    /**
     * [set] SECRET_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param secretCode The value of the column 'SECRET_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecretCode(String secretCode) {
        __modifiedProperties.addPropertyName("secretCode");
        _secretCode = secretCode;
    }

    /**
     * [get] SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @return The value of the column 'SECRET_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretName() {
        checkSpecifiedProperty("secretName");
        return _secretName;
    }

    /**
     * [set] SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @param secretName The value of the column 'SECRET_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSecretName(String secretName) {
        __modifiedProperties.addPropertyName("secretName");
        _secretName = secretName;
    }

    /**
     * [get] SECRET_AUTH_CODE: {CHAR(3)} <br />
     * @return The value of the column 'SECRET_AUTH_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSecretAuthCode() {
        checkSpecifiedProperty("secretAuthCode");
        return _secretAuthCode;
    }

    /**
     * [set] SECRET_AUTH_CODE: {CHAR(3)} <br />
     * @param secretAuthCode The value of the column 'SECRET_AUTH_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSecretAuthCode(String secretAuthCode) {
        __modifiedProperties.addPropertyName("secretAuthCode");
        _secretAuthCode = secretAuthCode;
    }
}
