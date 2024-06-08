package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_MESSAGE as TABLE. <br>
 * メッセージマスタ
 * <pre>
 * [primary-key]
 *     MESSAGE_ID
 *
 * [column]
 *     MESSAGE_ID, MESSAGE_CD, MESSAGE_NM, MESSAGE_ABBR, MESSAGE_TYPE, SYSTEM_TYPE, CULTURE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MESSAGE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CULTURE, B_CLASS_DTL(ByMessageType), M_HT_MESSAGE(AsOne)
 *
 * [referrer-table]
 *     M_HT_MESSAGE
 *
 * [foreign-property]
 *     bCulture, bClassDtlByMessageType, bClassDtlBySystemType, mHtMessageAsOne
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBMessageDto implements Serializable {

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
    /** MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _messageId;

    /** MESSAGE_CD: {UQ+, varchar(100)} */
    @JsonKey
    protected String _messageCd;

    /** MESSAGE_NM: {varchar(4000)} */
    @JsonKey
    protected String _messageNm;

    /** MESSAGE_ABBR: {varchar(4000)} */
    @JsonKey
    protected String _messageAbbr;

    /** MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} */
    @JsonKey
    protected String _messageType;

    /** SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} */
    @JsonKey
    protected String _systemType;

    /** CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} */
    @JsonKey
    protected Long _cultureId;

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
    public BsBMessageDto() {
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
    protected BCultureDto _bCulture;

    public BCultureDto getBCulture() {
        return _bCulture;
    }

    public void setBCulture(BCultureDto bCulture) {
        this._bCulture = bCulture;
    }

    protected BClassDtlDto _bClassDtlByMessageType;

    public BClassDtlDto getBClassDtlByMessageType() {
        return _bClassDtlByMessageType;
    }

    public void setBClassDtlByMessageType(BClassDtlDto bClassDtlByMessageType) {
        this._bClassDtlByMessageType = bClassDtlByMessageType;
    }

    protected BClassDtlDto _bClassDtlBySystemType;

    public BClassDtlDto getBClassDtlBySystemType() {
        return _bClassDtlBySystemType;
    }

    public void setBClassDtlBySystemType(BClassDtlDto bClassDtlBySystemType) {
        this._bClassDtlBySystemType = bClassDtlBySystemType;
    }

    protected MHtMessageDto _mHtMessageAsOne;

    public MHtMessageDto getMHtMessageAsOne() {
        return _mHtMessageAsOne;
    }

    public void setMHtMessageAsOne(MHtMessageDto MHtMessageAsOne) {
        this._mHtMessageAsOne = MHtMessageAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBMessageDto)) { return false; }
        final BsBMessageDto otherEntity = (BsBMessageDto)other;
        if (!helpComparingValue(getMessageId(), otherEntity.getMessageId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_MESSAGE");
        result = xCH(result, getMessageId());
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
        sb.append(c).append(getMessageId());
        sb.append(c).append(getMessageCd());
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getMessageAbbr());
        sb.append(c).append(getMessageType());
        sb.append(c).append(getSystemType());
        sb.append(c).append(getCultureId());
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
     * [get] MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メッセージID
     * @return The value of the column 'MESSAGE_ID'. (NullAllowed)
     */
    public Long getMessageId() {
        return _messageId;
    }

    /**
     * [set] MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メッセージID
     * @param messageId The value of the column 'MESSAGE_ID'. (NullAllowed)
     */
    public void setMessageId(Long messageId) {
        __modifiedProperties.add("messageId");
        this._messageId = messageId;
    }

    /**
     * [get] MESSAGE_CD: {UQ+, varchar(100)} <br>
     * メッセージCD
     * @return The value of the column 'MESSAGE_CD'. (NullAllowed)
     */
    public String getMessageCd() {
        return _messageCd;
    }

    /**
     * [set] MESSAGE_CD: {UQ+, varchar(100)} <br>
     * メッセージCD
     * @param messageCd The value of the column 'MESSAGE_CD'. (NullAllowed)
     */
    public void setMessageCd(String messageCd) {
        __modifiedProperties.add("messageCd");
        this._messageCd = messageCd;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * メッセージ
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public String getMessageNm() {
        return _messageNm;
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * メッセージ
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public void setMessageNm(String messageNm) {
        __modifiedProperties.add("messageNm");
        this._messageNm = messageNm;
    }

    /**
     * [get] MESSAGE_ABBR: {varchar(4000)} <br>
     * メッセージ略称
     * @return The value of the column 'MESSAGE_ABBR'. (NullAllowed)
     */
    public String getMessageAbbr() {
        return _messageAbbr;
    }

    /**
     * [set] MESSAGE_ABBR: {varchar(4000)} <br>
     * メッセージ略称
     * @param messageAbbr The value of the column 'MESSAGE_ABBR'. (NullAllowed)
     */
    public void setMessageAbbr(String messageAbbr) {
        __modifiedProperties.add("messageAbbr");
        this._messageAbbr = messageAbbr;
    }

    /**
     * [get] MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @return The value of the column 'MESSAGE_TYPE'. (NullAllowed)
     */
    public String getMessageType() {
        return _messageType;
    }

    /**
     * [set] MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @param messageType The value of the column 'MESSAGE_TYPE'. (NullAllowed)
     */
    public void setMessageType(String messageType) {
        __modifiedProperties.add("messageType");
        this._messageType = messageType;
    }

    /**
     * [get] SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public String getSystemType() {
        return _systemType;
    }

    /**
     * [set] SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public void setSystemType(String systemType) {
        __modifiedProperties.add("systemType");
        this._systemType = systemType;
    }

    /**
     * [get] CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        __modifiedProperties.add("cultureId");
        this._cultureId = cultureId;
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
