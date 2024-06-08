package com.oneslogi.base.dbflute.allcommon;

import org.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of delFlg.
     * @return The instance of the property type. (NullAllowed)
     */
    String getDelFlg();

    /**
     * Set the value of delFlg.
     * @param delFlg The instance of the property type. (NullAllowed)
     */
    void setDelFlg(String delFlg);

    /**
     * Set the value of delFlg as $0. <br>
     * $0: 未削除
     */
    void setDelFlg_$0();

    /**
     * Is the value of delFlg '$0'? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    boolean isDelFlg$0();

    /**
     * Set the value of delFlg as $1. <br>
     * $1: 削除済
     */
    void setDelFlg_$1();

    /**
     * Is the value of delFlg '$1'? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    boolean isDelFlg$1();

    /**
     * Get the value of versionNo.
     * @return The instance of the property type. (NullAllowed)
     */
    Long getVersionNo();

    /**
     * Set the value of versionNo.
     * @param versionNo The instance of the property type. (NullAllowed)
     */
    void setVersionNo(Long versionNo);

    /**
     * Get the value of controlNo.
     * @return The instance of the property type. (NullAllowed)
     */
    Long getControlNo();

    /**
     * Set the value of controlNo.
     * @param controlNo The instance of the property type. (NullAllowed)
     */
    void setControlNo(Long controlNo);

    /**
     * Get the value of addDt.
     * @return The instance of the property type. (NullAllowed)
     */
    java.sql.Timestamp getAddDt();

    /**
     * Set the value of addDt.
     * @param addDt The instance of the property type. (NullAllowed)
     */
    void setAddDt(java.sql.Timestamp addDt);

    /**
     * Get the value of addUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getAddUser();

    /**
     * Set the value of addUser.
     * @param addUser The instance of the property type. (NullAllowed)
     */
    void setAddUser(String addUser);

    /**
     * Get the value of addProcess.
     * @return The instance of the property type. (NullAllowed)
     */
    String getAddProcess();

    /**
     * Set the value of addProcess.
     * @param addProcess The instance of the property type. (NullAllowed)
     */
    void setAddProcess(String addProcess);

    /**
     * Get the value of updDt.
     * @return The instance of the property type. (NullAllowed)
     */
    java.sql.Timestamp getUpdDt();

    /**
     * Set the value of updDt.
     * @param updDt The instance of the property type. (NullAllowed)
     */
    void setUpdDt(java.sql.Timestamp updDt);

    /**
     * Get the value of updUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUpdUser();

    /**
     * Set the value of updUser.
     * @param updUser The instance of the property type. (NullAllowed)
     */
    void setUpdUser(String updUser);

    /**
     * Get the value of updProcess.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUpdProcess();

    /**
     * Set the value of updProcess.
     * @param updProcess The instance of the property type. (NullAllowed)
     */
    void setUpdProcess(String updProcess);
}
