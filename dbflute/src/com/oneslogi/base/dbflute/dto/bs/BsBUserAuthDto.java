package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_USER_AUTH as TABLE. <br>
 * ユーザ認証マスタ
 * <pre>
 * [primary-key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, PASSWORD, SALT, PASSWORD_RESET, PASSWORD_MODIFIED_DATE, LAST_LOGIN_DATE, LAST_FAILED_LOGIN_DATE, FAILED_LOGIN_ATTEMPTS, LOCKOUT, LOCKOUT_DATE, AVAILABLE_START_DATE, AVAILABLE_END_DATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_USER, B_CLASS_DTL(ByPasswordReset)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bUser, bClassDtlByPasswordReset, bClassDtlByLockout
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBUserAuthDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** USER_ID: {PK, NotNull, bigint(19), FK to B_USER} */
    @JsonKey
    protected Long _userId;

    /** PASSWORD: {varchar(255)} */
    @JsonKey
    protected String _password;

    /** SALT: {UQ, NotNull, varchar(100)} */
    @JsonKey
    protected String _salt;

    /** PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} */
    @JsonKey
    protected String _passwordReset;

    /** PASSWORD_MODIFIED_DATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _passwordModifiedDate;

    /** LAST_LOGIN_DATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _lastLoginDate;

    /** LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _lastFailedLoginDate;

    /** FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _failedLoginAttempts;

    /** LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} */
    @JsonKey
    protected String _lockout;

    /** LOCKOUT_DATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _lockoutDate;

    /** AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _availableStartDate;

    /** AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _availableEndDate;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBUserAuthDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected BUserDto _bUser;

    public BUserDto getBUser() {
        return _bUser;
    }

    public void setBUser(BUserDto bUser) {
        this._bUser = bUser;
    }

    protected BClassDtlDto _bClassDtlByPasswordReset;

    public BClassDtlDto getBClassDtlByPasswordReset() {
        return _bClassDtlByPasswordReset;
    }

    public void setBClassDtlByPasswordReset(BClassDtlDto bClassDtlByPasswordReset) {
        this._bClassDtlByPasswordReset = bClassDtlByPasswordReset;
    }

    protected BClassDtlDto _bClassDtlByLockout;

    public BClassDtlDto getBClassDtlByLockout() {
        return _bClassDtlByLockout;
    }

    public void setBClassDtlByLockout(BClassDtlDto bClassDtlByLockout) {
        this._bClassDtlByLockout = bClassDtlByLockout;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBUserAuthDto)) { return false; }
        final BsBUserAuthDto otherEntity = (BsBUserAuthDto)other;
        if (!helpComparingValue(getUserId(), otherEntity.getUserId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_USER_AUTH");
        result = xCH(result, getUserId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getUserId());
        sb.append(c).append(getPassword());
        sb.append(c).append(getSalt());
        sb.append(c).append(getPasswordReset());
        sb.append(c).append(getPasswordModifiedDate());
        sb.append(c).append(getLastLoginDate());
        sb.append(c).append(getLastFailedLoginDate());
        sb.append(c).append(getFailedLoginAttempts());
        sb.append(c).append(getLockout());
        sb.append(c).append(getLockoutDate());
        sb.append(c).append(getAvailableStartDate());
        sb.append(c).append(getAvailableEndDate());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, NotNull, bigint(19), FK to B_USER} <br>
     * ユーザID
     * @return The value of the column 'USER_ID'. (NullAllowed)
     */
    public Long getUserId() {
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, NotNull, bigint(19), FK to B_USER} <br>
     * ユーザID
     * @param userId The value of the column 'USER_ID'. (NullAllowed)
     */
    public void setUserId(Long userId) {
        __modifiedProperties.add("userId");
        this._userId = userId;
    }

    /**
     * [get] PASSWORD: {varchar(255)} <br>
     * パスワード
     * @return The value of the column 'PASSWORD'. (NullAllowed)
     */
    public String getPassword() {
        return _password;
    }

    /**
     * [set] PASSWORD: {varchar(255)} <br>
     * パスワード
     * @param password The value of the column 'PASSWORD'. (NullAllowed)
     */
    public void setPassword(String password) {
        __modifiedProperties.add("password");
        this._password = password;
    }

    /**
     * [get] SALT: {UQ, NotNull, varchar(100)} <br>
     * ソルト
     * @return The value of the column 'SALT'. (NullAllowed)
     */
    public String getSalt() {
        return _salt;
    }

    /**
     * [set] SALT: {UQ, NotNull, varchar(100)} <br>
     * ソルト
     * @param salt The value of the column 'SALT'. (NullAllowed)
     */
    public void setSalt(String salt) {
        __modifiedProperties.add("salt");
        this._salt = salt;
    }

    /**
     * [get] PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @return The value of the column 'PASSWORD_RESET'. (NullAllowed)
     */
    public String getPasswordReset() {
        return _passwordReset;
    }

    /**
     * [set] PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @param passwordReset The value of the column 'PASSWORD_RESET'. (NullAllowed)
     */
    public void setPasswordReset(String passwordReset) {
        __modifiedProperties.add("passwordReset");
        this._passwordReset = passwordReset;
    }

    /**
     * [get] PASSWORD_MODIFIED_DATE: {datetime2(26, 6)} <br>
     * パスワード変更日時
     * @return The value of the column 'PASSWORD_MODIFIED_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPasswordModifiedDate() {
        return _passwordModifiedDate;
    }

    /**
     * [set] PASSWORD_MODIFIED_DATE: {datetime2(26, 6)} <br>
     * パスワード変更日時
     * @param passwordModifiedDate The value of the column 'PASSWORD_MODIFIED_DATE'. (NullAllowed)
     */
    public void setPasswordModifiedDate(java.sql.Timestamp passwordModifiedDate) {
        __modifiedProperties.add("passwordModifiedDate");
        this._passwordModifiedDate = passwordModifiedDate;
    }

    /**
     * [get] LAST_LOGIN_DATE: {datetime2(26, 6)} <br>
     * 最終ログイン日時
     * @return The value of the column 'LAST_LOGIN_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getLastLoginDate() {
        return _lastLoginDate;
    }

    /**
     * [set] LAST_LOGIN_DATE: {datetime2(26, 6)} <br>
     * 最終ログイン日時
     * @param lastLoginDate The value of the column 'LAST_LOGIN_DATE'. (NullAllowed)
     */
    public void setLastLoginDate(java.sql.Timestamp lastLoginDate) {
        __modifiedProperties.add("lastLoginDate");
        this._lastLoginDate = lastLoginDate;
    }

    /**
     * [get] LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)} <br>
     * 最終ログイン失敗日時
     * @return The value of the column 'LAST_FAILED_LOGIN_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getLastFailedLoginDate() {
        return _lastFailedLoginDate;
    }

    /**
     * [set] LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)} <br>
     * 最終ログイン失敗日時
     * @param lastFailedLoginDate The value of the column 'LAST_FAILED_LOGIN_DATE'. (NullAllowed)
     */
    public void setLastFailedLoginDate(java.sql.Timestamp lastFailedLoginDate) {
        __modifiedProperties.add("lastFailedLoginDate");
        this._lastFailedLoginDate = lastFailedLoginDate;
    }

    /**
     * [get] FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]} <br>
     * ログイン失敗回数
     * @return The value of the column 'FAILED_LOGIN_ATTEMPTS'. (NullAllowed)
     */
    public Long getFailedLoginAttempts() {
        return _failedLoginAttempts;
    }

    /**
     * [set] FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]} <br>
     * ログイン失敗回数
     * @param failedLoginAttempts The value of the column 'FAILED_LOGIN_ATTEMPTS'. (NullAllowed)
     */
    public void setFailedLoginAttempts(Long failedLoginAttempts) {
        __modifiedProperties.add("failedLoginAttempts");
        this._failedLoginAttempts = failedLoginAttempts;
    }

    /**
     * [get] LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @return The value of the column 'LOCKOUT'. (NullAllowed)
     */
    public String getLockout() {
        return _lockout;
    }

    /**
     * [set] LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @param lockout The value of the column 'LOCKOUT'. (NullAllowed)
     */
    public void setLockout(String lockout) {
        __modifiedProperties.add("lockout");
        this._lockout = lockout;
    }

    /**
     * [get] LOCKOUT_DATE: {datetime2(26, 6)} <br>
     * ロックアウト日時
     * @return The value of the column 'LOCKOUT_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getLockoutDate() {
        return _lockoutDate;
    }

    /**
     * [set] LOCKOUT_DATE: {datetime2(26, 6)} <br>
     * ロックアウト日時
     * @param lockoutDate The value of the column 'LOCKOUT_DATE'. (NullAllowed)
     */
    public void setLockoutDate(java.sql.Timestamp lockoutDate) {
        __modifiedProperties.add("lockoutDate");
        this._lockoutDate = lockoutDate;
    }

    /**
     * [get] AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)} <br>
     * 利用可能開始日
     * @return The value of the column 'AVAILABLE_START_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAvailableStartDate() {
        return _availableStartDate;
    }

    /**
     * [set] AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)} <br>
     * 利用可能開始日
     * @param availableStartDate The value of the column 'AVAILABLE_START_DATE'. (NullAllowed)
     */
    public void setAvailableStartDate(java.sql.Timestamp availableStartDate) {
        __modifiedProperties.add("availableStartDate");
        this._availableStartDate = availableStartDate;
    }

    /**
     * [get] AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)} <br>
     * 利用可能終了日
     * @return The value of the column 'AVAILABLE_END_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAvailableEndDate() {
        return _availableEndDate;
    }

    /**
     * [set] AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)} <br>
     * 利用可能終了日
     * @param availableEndDate The value of the column 'AVAILABLE_END_DATE'. (NullAllowed)
     */
    public void setAvailableEndDate(java.sql.Timestamp availableEndDate) {
        __modifiedProperties.add("availableEndDate");
        this._availableEndDate = availableEndDate;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
