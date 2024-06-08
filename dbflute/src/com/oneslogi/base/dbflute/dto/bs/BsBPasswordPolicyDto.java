package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of B_PASSWORD_POLICY as TABLE. <br>
 * パスワードポリシーマスタ
 * <pre>
 * [primary-key]
 *     PASSWORD_POLICY_ID
 *
 * [column]
 *     PASSWORD_POLICY_ID, PASSWORD_POLICY_NM, FIRST_CHANGE_CONTROL, MIN_LENGTH, MIN_ALPHA, MIN_LOWER_CASE, MIN_UPPER_CASE, MIN_NUMBERS, MIN_SYMBOL, MAX_AGE, MAX_FAILURE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PASSWORD_POLICY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBPasswordPolicyDto implements Serializable {

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
    /** PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _passwordPolicyId;

    /** PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)} */
    @JsonKey
    protected String _passwordPolicyNm;

    /** FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]} */
    @JsonKey
    protected String _firstChangeControl;

    /** MIN_LENGTH: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _minLength;

    /** MIN_ALPHA: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _minAlpha;

    /** MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _minLowerCase;

    /** MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _minUpperCase;

    /** MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _minNumbers;

    /** MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _minSymbol;

    /** MAX_AGE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _maxAge;

    /** MAX_FAILURE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _maxFailure;

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
    public BsBPasswordPolicyDto() {
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
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBPasswordPolicyDto)) { return false; }
        final BsBPasswordPolicyDto otherEntity = (BsBPasswordPolicyDto)other;
        if (!helpComparingValue(getPasswordPolicyId(), otherEntity.getPasswordPolicyId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_PASSWORD_POLICY");
        result = xCH(result, getPasswordPolicyId());
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
        sb.append(c).append(getPasswordPolicyId());
        sb.append(c).append(getPasswordPolicyNm());
        sb.append(c).append(getFirstChangeControl());
        sb.append(c).append(getMinLength());
        sb.append(c).append(getMinAlpha());
        sb.append(c).append(getMinLowerCase());
        sb.append(c).append(getMinUpperCase());
        sb.append(c).append(getMinNumbers());
        sb.append(c).append(getMinSymbol());
        sb.append(c).append(getMaxAge());
        sb.append(c).append(getMaxFailure());
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
     * [get] PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パスワードポリシーID
     * @return The value of the column 'PASSWORD_POLICY_ID'. (NullAllowed)
     */
    public Long getPasswordPolicyId() {
        return _passwordPolicyId;
    }

    /**
     * [set] PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パスワードポリシーID
     * @param passwordPolicyId The value of the column 'PASSWORD_POLICY_ID'. (NullAllowed)
     */
    public void setPasswordPolicyId(Long passwordPolicyId) {
        __modifiedProperties.add("passwordPolicyId");
        this._passwordPolicyId = passwordPolicyId;
    }

    /**
     * [get] PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)} <br>
     * パスワードポリシー名称
     * @return The value of the column 'PASSWORD_POLICY_NM'. (NullAllowed)
     */
    public String getPasswordPolicyNm() {
        return _passwordPolicyNm;
    }

    /**
     * [set] PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)} <br>
     * パスワードポリシー名称
     * @param passwordPolicyNm The value of the column 'PASSWORD_POLICY_NM'. (NullAllowed)
     */
    public void setPasswordPolicyNm(String passwordPolicyNm) {
        __modifiedProperties.add("passwordPolicyNm");
        this._passwordPolicyNm = passwordPolicyNm;
    }

    /**
     * [get] FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]} <br>
     * 初回変更制御
     * @return The value of the column 'FIRST_CHANGE_CONTROL'. (NullAllowed)
     */
    public String getFirstChangeControl() {
        return _firstChangeControl;
    }

    /**
     * [set] FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]} <br>
     * 初回変更制御
     * @param firstChangeControl The value of the column 'FIRST_CHANGE_CONTROL'. (NullAllowed)
     */
    public void setFirstChangeControl(String firstChangeControl) {
        __modifiedProperties.add("firstChangeControl");
        this._firstChangeControl = firstChangeControl;
    }

    /**
     * [get] MIN_LENGTH: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小桁数
     * @return The value of the column 'MIN_LENGTH'. (NullAllowed)
     */
    public Long getMinLength() {
        return _minLength;
    }

    /**
     * [set] MIN_LENGTH: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小桁数
     * @param minLength The value of the column 'MIN_LENGTH'. (NullAllowed)
     */
    public void setMinLength(Long minLength) {
        __modifiedProperties.add("minLength");
        this._minLength = minLength;
    }

    /**
     * [get] MIN_ALPHA: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小英字桁数
     * @return The value of the column 'MIN_ALPHA'. (NullAllowed)
     */
    public Long getMinAlpha() {
        return _minAlpha;
    }

    /**
     * [set] MIN_ALPHA: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小英字桁数
     * @param minAlpha The value of the column 'MIN_ALPHA'. (NullAllowed)
     */
    public void setMinAlpha(Long minAlpha) {
        __modifiedProperties.add("minAlpha");
        this._minAlpha = minAlpha;
    }

    /**
     * [get] MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小小文字桁数
     * @return The value of the column 'MIN_LOWER_CASE'. (NullAllowed)
     */
    public Long getMinLowerCase() {
        return _minLowerCase;
    }

    /**
     * [set] MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小小文字桁数
     * @param minLowerCase The value of the column 'MIN_LOWER_CASE'. (NullAllowed)
     */
    public void setMinLowerCase(Long minLowerCase) {
        __modifiedProperties.add("minLowerCase");
        this._minLowerCase = minLowerCase;
    }

    /**
     * [get] MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小大文字桁数
     * @return The value of the column 'MIN_UPPER_CASE'. (NullAllowed)
     */
    public Long getMinUpperCase() {
        return _minUpperCase;
    }

    /**
     * [set] MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小大文字桁数
     * @param minUpperCase The value of the column 'MIN_UPPER_CASE'. (NullAllowed)
     */
    public void setMinUpperCase(Long minUpperCase) {
        __modifiedProperties.add("minUpperCase");
        this._minUpperCase = minUpperCase;
    }

    /**
     * [get] MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小数字桁数
     * @return The value of the column 'MIN_NUMBERS'. (NullAllowed)
     */
    public Long getMinNumbers() {
        return _minNumbers;
    }

    /**
     * [set] MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小数字桁数
     * @param minNumbers The value of the column 'MIN_NUMBERS'. (NullAllowed)
     */
    public void setMinNumbers(Long minNumbers) {
        __modifiedProperties.add("minNumbers");
        this._minNumbers = minNumbers;
    }

    /**
     * [get] MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小記号桁数
     * @return The value of the column 'MIN_SYMBOL'. (NullAllowed)
     */
    public Long getMinSymbol() {
        return _minSymbol;
    }

    /**
     * [set] MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小記号桁数
     * @param minSymbol The value of the column 'MIN_SYMBOL'. (NullAllowed)
     */
    public void setMinSymbol(Long minSymbol) {
        __modifiedProperties.add("minSymbol");
        this._minSymbol = minSymbol;
    }

    /**
     * [get] MAX_AGE: {NotNull, bigint(19), default=[(0)]} <br>
     * 有効期限
     * @return The value of the column 'MAX_AGE'. (NullAllowed)
     */
    public Long getMaxAge() {
        return _maxAge;
    }

    /**
     * [set] MAX_AGE: {NotNull, bigint(19), default=[(0)]} <br>
     * 有効期限
     * @param maxAge The value of the column 'MAX_AGE'. (NullAllowed)
     */
    public void setMaxAge(Long maxAge) {
        __modifiedProperties.add("maxAge");
        this._maxAge = maxAge;
    }

    /**
     * [get] MAX_FAILURE: {NotNull, bigint(19), default=[(0)]} <br>
     * 失敗回数
     * @return The value of the column 'MAX_FAILURE'. (NullAllowed)
     */
    public Long getMaxFailure() {
        return _maxFailure;
    }

    /**
     * [set] MAX_FAILURE: {NotNull, bigint(19), default=[(0)]} <br>
     * 失敗回数
     * @param maxFailure The value of the column 'MAX_FAILURE'. (NullAllowed)
     */
    public void setMaxFailure(Long maxFailure) {
        __modifiedProperties.add("maxFailure");
        this._maxFailure = maxFailure;
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
