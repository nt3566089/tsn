package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_ITEM_VALID as TABLE. <br>
 * 項目検証マスタ
 * <pre>
 * [primary-key]
 *     ITEM_ID
 *
 * [column]
 *     ITEM_ID, INPUT_LIMIT, LIMIT_MESSAGE_CD, MIN_CHARS, MAX_CHARS, MIN_NUMBER, MAX_NUMBER, INTEGER_LENGTH, DECIMAL_LENGTH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_ITEM
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bItem
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBItemValidDto implements Serializable {

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
    /** ITEM_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ITEM} */
    @JsonKey
    protected Long _itemId;

    /** INPUT_LIMIT: {varchar(100)} */
    @JsonKey
    protected String _inputLimit;

    /** LIMIT_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _limitMessageCd;

    /** MIN_CHARS: {bigint(19)} */
    @JsonKey
    protected Long _minChars;

    /** MAX_CHARS: {bigint(19)} */
    @JsonKey
    protected Long _maxChars;

    /** MIN_NUMBER: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _minNumber;

    /** MAX_NUMBER: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _maxNumber;

    /** INTEGER_LENGTH: {bigint(19)} */
    @JsonKey
    protected Long _integerLength;

    /** DECIMAL_LENGTH: {bigint(19)} */
    @JsonKey
    protected Long _decimalLength;

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
    public BsBItemValidDto() {
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
    protected BItemDto _bItem;

    public BItemDto getBItem() {
        return _bItem;
    }

    public void setBItem(BItemDto bItem) {
        this._bItem = bItem;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBItemValidDto)) { return false; }
        final BsBItemValidDto otherEntity = (BsBItemValidDto)other;
        if (!helpComparingValue(getItemId(), otherEntity.getItemId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_ITEM_VALID");
        result = xCH(result, getItemId());
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
        sb.append(c).append(getItemId());
        sb.append(c).append(getInputLimit());
        sb.append(c).append(getLimitMessageCd());
        sb.append(c).append(getMinChars());
        sb.append(c).append(getMaxChars());
        sb.append(c).append(getMinNumber());
        sb.append(c).append(getMaxNumber());
        sb.append(c).append(getIntegerLength());
        sb.append(c).append(getDecimalLength());
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
     * [get] ITEM_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ITEM} <br>
     * 項目ID
     * @return The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public Long getItemId() {
        return _itemId;
    }

    /**
     * [set] ITEM_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ITEM} <br>
     * 項目ID
     * @param itemId The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public void setItemId(Long itemId) {
        __modifiedProperties.add("itemId");
        this._itemId = itemId;
    }

    /**
     * [get] INPUT_LIMIT: {varchar(100)} <br>
     * 文字入力制限
     * @return The value of the column 'INPUT_LIMIT'. (NullAllowed)
     */
    public String getInputLimit() {
        return _inputLimit;
    }

    /**
     * [set] INPUT_LIMIT: {varchar(100)} <br>
     * 文字入力制限
     * @param inputLimit The value of the column 'INPUT_LIMIT'. (NullAllowed)
     */
    public void setInputLimit(String inputLimit) {
        __modifiedProperties.add("inputLimit");
        this._inputLimit = inputLimit;
    }

    /**
     * [get] LIMIT_MESSAGE_CD: {varchar(100)} <br>
     * 制限メッセージCD
     * @return The value of the column 'LIMIT_MESSAGE_CD'. (NullAllowed)
     */
    public String getLimitMessageCd() {
        return _limitMessageCd;
    }

    /**
     * [set] LIMIT_MESSAGE_CD: {varchar(100)} <br>
     * 制限メッセージCD
     * @param limitMessageCd The value of the column 'LIMIT_MESSAGE_CD'. (NullAllowed)
     */
    public void setLimitMessageCd(String limitMessageCd) {
        __modifiedProperties.add("limitMessageCd");
        this._limitMessageCd = limitMessageCd;
    }

    /**
     * [get] MIN_CHARS: {bigint(19)} <br>
     * 最小文字数
     * @return The value of the column 'MIN_CHARS'. (NullAllowed)
     */
    public Long getMinChars() {
        return _minChars;
    }

    /**
     * [set] MIN_CHARS: {bigint(19)} <br>
     * 最小文字数
     * @param minChars The value of the column 'MIN_CHARS'. (NullAllowed)
     */
    public void setMinChars(Long minChars) {
        __modifiedProperties.add("minChars");
        this._minChars = minChars;
    }

    /**
     * [get] MAX_CHARS: {bigint(19)} <br>
     * 最大文字数
     * @return The value of the column 'MAX_CHARS'. (NullAllowed)
     */
    public Long getMaxChars() {
        return _maxChars;
    }

    /**
     * [set] MAX_CHARS: {bigint(19)} <br>
     * 最大文字数
     * @param maxChars The value of the column 'MAX_CHARS'. (NullAllowed)
     */
    public void setMaxChars(Long maxChars) {
        __modifiedProperties.add("maxChars");
        this._maxChars = maxChars;
    }

    /**
     * [get] MIN_NUMBER: {decimal(16, 6)} <br>
     * 最小値
     * @return The value of the column 'MIN_NUMBER'. (NullAllowed)
     */
    public java.math.BigDecimal getMinNumber() {
        return _minNumber;
    }

    /**
     * [set] MIN_NUMBER: {decimal(16, 6)} <br>
     * 最小値
     * @param minNumber The value of the column 'MIN_NUMBER'. (NullAllowed)
     */
    public void setMinNumber(java.math.BigDecimal minNumber) {
        __modifiedProperties.add("minNumber");
        this._minNumber = minNumber;
    }

    /**
     * [get] MAX_NUMBER: {decimal(16, 6)} <br>
     * 最大値
     * @return The value of the column 'MAX_NUMBER'. (NullAllowed)
     */
    public java.math.BigDecimal getMaxNumber() {
        return _maxNumber;
    }

    /**
     * [set] MAX_NUMBER: {decimal(16, 6)} <br>
     * 最大値
     * @param maxNumber The value of the column 'MAX_NUMBER'. (NullAllowed)
     */
    public void setMaxNumber(java.math.BigDecimal maxNumber) {
        __modifiedProperties.add("maxNumber");
        this._maxNumber = maxNumber;
    }

    /**
     * [get] INTEGER_LENGTH: {bigint(19)} <br>
     * 整数桁数
     * @return The value of the column 'INTEGER_LENGTH'. (NullAllowed)
     */
    public Long getIntegerLength() {
        return _integerLength;
    }

    /**
     * [set] INTEGER_LENGTH: {bigint(19)} <br>
     * 整数桁数
     * @param integerLength The value of the column 'INTEGER_LENGTH'. (NullAllowed)
     */
    public void setIntegerLength(Long integerLength) {
        __modifiedProperties.add("integerLength");
        this._integerLength = integerLength;
    }

    /**
     * [get] DECIMAL_LENGTH: {bigint(19)} <br>
     * 小数桁数
     * @return The value of the column 'DECIMAL_LENGTH'. (NullAllowed)
     */
    public Long getDecimalLength() {
        return _decimalLength;
    }

    /**
     * [set] DECIMAL_LENGTH: {bigint(19)} <br>
     * 小数桁数
     * @param decimalLength The value of the column 'DECIMAL_LENGTH'. (NullAllowed)
     */
    public void setDecimalLength(Long decimalLength) {
        __modifiedProperties.add("decimalLength");
        this._decimalLength = decimalLength;
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
