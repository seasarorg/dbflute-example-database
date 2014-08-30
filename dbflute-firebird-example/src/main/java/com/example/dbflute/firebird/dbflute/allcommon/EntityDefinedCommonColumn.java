package com.example.dbflute.firebird.dbflute.allcommon;

import org.seasar.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of tableNameRegisterDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.sql.Timestamp getTableNameRegisterDatetime();

    /**
     * Set the value of tableNameRegisterDatetime.
     * @param tableNameRegisterDatetime The instance of the property type. (NullAllowed)
     */
    void setTableNameRegisterDatetime(java.sql.Timestamp tableNameRegisterDatetime);

    /**
     * Get the value of tableNameRegisterUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getTableNameRegisterUser();

    /**
     * Set the value of tableNameRegisterUser.
     * @param tableNameRegisterUser The instance of the property type. (NullAllowed)
     */
    void setTableNameRegisterUser(String tableNameRegisterUser);

    /**
     * Get the value of tableNameRegisterProcess.
     * @return The instance of the property type. (NullAllowed)
     */
    String getTableNameRegisterProcess();

    /**
     * Set the value of tableNameRegisterProcess.
     * @param tableNameRegisterProcess The instance of the property type. (NullAllowed)
     */
    void setTableNameRegisterProcess(String tableNameRegisterProcess);

    /**
     * Get the value of tableNameUpdateDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.sql.Timestamp getTableNameUpdateDatetime();

    /**
     * Set the value of tableNameUpdateDatetime.
     * @param tableNameUpdateDatetime The instance of the property type. (NullAllowed)
     */
    void setTableNameUpdateDatetime(java.sql.Timestamp tableNameUpdateDatetime);

    /**
     * Get the value of tableNameUpdateUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getTableNameUpdateUser();

    /**
     * Set the value of tableNameUpdateUser.
     * @param tableNameUpdateUser The instance of the property type. (NullAllowed)
     */
    void setTableNameUpdateUser(String tableNameUpdateUser);

    /**
     * Get the value of tableNameUpdateProcess.
     * @return The instance of the property type. (NullAllowed)
     */
    String getTableNameUpdateProcess();

    /**
     * Set the value of tableNameUpdateProcess.
     * @param tableNameUpdateProcess The instance of the property type. (NullAllowed)
     */
    void setTableNameUpdateProcess(String tableNameUpdateProcess);

    /**
	 * Enable common column auto set up. <br />
	 * It's only for after disable because the default is enabled.
	 */
    void enableCommonColumnAutoSetup();

    /**
	 * Disable common column auto set up. <br />
	 * This is an old style. You can get the same process
	 * by varyingInsert() and varyingUpdate() and so on.
	 */
    void disableCommonColumnAutoSetup();

    /**
	 * Can the entity set up common column by auto? (basically for Framework)
	 * @return The determination, true or false.
	 */
	boolean canCommonColumnAutoSetup();
}
