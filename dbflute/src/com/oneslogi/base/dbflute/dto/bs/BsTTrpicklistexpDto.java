package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRPICKLISTEXP as TABLE. <br>
 * 山出しリスト拡張情報
 * <pre>
 * [primary-key]
 *     T_TRPICKLISTEXP_ID
 *
 * [column]
 *     T_TRPICKLISTEXP_ID, T_TRPICKLIST_ID, PICKLIST_KEY, PICKLIST_G_NO, CASE_CD, DUMMY_CASE_KBN, READ_SD_KBN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_TR_PICKLIST
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tTrPicklist
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrpicklistexpDto implements Serializable {

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
    /** T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)} */
    @JsonKey
    protected Long _tTrpicklistexpId;

    /** T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST} */
    @JsonKey
    protected Long _tTrpicklistId;

    /** PICKLIST_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _picklistKey;

    /** PICKLIST_G_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _picklistGNo;

    /** CASE_CD: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _caseCd;

    /** DUMMY_CASE_KBN: {char(1)} */
    @JsonKey
    protected String _dummyCaseKbn;

    /** READ_SD_KBN: {char(1)} */
    @JsonKey
    protected String _readSdKbn;

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
    public BsTTrpicklistexpDto() {
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
    protected TTrPicklistDto _tTrPicklist;

    public TTrPicklistDto getTTrPicklist() {
        return _tTrPicklist;
    }

    public void setTTrPicklist(TTrPicklistDto tTrPicklist) {
        this._tTrPicklist = tTrPicklist;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrpicklistexpDto)) { return false; }
        final BsTTrpicklistexpDto otherEntity = (BsTTrpicklistexpDto)other;
        if (!helpComparingValue(getTTrpicklistexpId(), otherEntity.getTTrpicklistexpId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRPICKLISTEXP");
        result = xCH(result, getTTrpicklistexpId());
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
        sb.append(c).append(getTTrpicklistexpId());
        sb.append(c).append(getTTrpicklistId());
        sb.append(c).append(getPicklistKey());
        sb.append(c).append(getPicklistGNo());
        sb.append(c).append(getCaseCd());
        sb.append(c).append(getDummyCaseKbn());
        sb.append(c).append(getReadSdKbn());
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
     * [get] T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)} <br>
     * 山出しリスト拡張ID
     * @return The value of the column 'T_TRPICKLISTEXP_ID'. (NullAllowed)
     */
    public Long getTTrpicklistexpId() {
        return _tTrpicklistexpId;
    }

    /**
     * [set] T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)} <br>
     * 山出しリスト拡張ID
     * @param tTrpicklistexpId The value of the column 'T_TRPICKLISTEXP_ID'. (NullAllowed)
     */
    public void setTTrpicklistexpId(Long tTrpicklistexpId) {
        __modifiedProperties.add("TTrpicklistexpId");
        this._tTrpicklistexpId = tTrpicklistexpId;
    }

    /**
     * [get] T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST} <br>
     * 山出しリストID
     * @return The value of the column 'T_TRPICKLIST_ID'. (NullAllowed)
     */
    public Long getTTrpicklistId() {
        return _tTrpicklistId;
    }

    /**
     * [set] T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST} <br>
     * 山出しリストID
     * @param tTrpicklistId The value of the column 'T_TRPICKLIST_ID'. (NullAllowed)
     */
    public void setTTrpicklistId(Long tTrpicklistId) {
        __modifiedProperties.add("TTrpicklistId");
        this._tTrpicklistId = tTrpicklistId;
    }

    /**
     * [get] PICKLIST_KEY: {NotNull, bigint(19)} <br>
     * 山出しリストNo.
     * @return The value of the column 'PICKLIST_KEY'. (NullAllowed)
     */
    public Long getPicklistKey() {
        return _picklistKey;
    }

    /**
     * [set] PICKLIST_KEY: {NotNull, bigint(19)} <br>
     * 山出しリストNo.
     * @param picklistKey The value of the column 'PICKLIST_KEY'. (NullAllowed)
     */
    public void setPicklistKey(Long picklistKey) {
        __modifiedProperties.add("picklistKey");
        this._picklistKey = picklistKey;
    }

    /**
     * [get] PICKLIST_G_NO: {NotNull, bigint(19)} <br>
     * 山出しリスト明細行No.
     * @return The value of the column 'PICKLIST_G_NO'. (NullAllowed)
     */
    public Long getPicklistGNo() {
        return _picklistGNo;
    }

    /**
     * [set] PICKLIST_G_NO: {NotNull, bigint(19)} <br>
     * 山出しリスト明細行No.
     * @param picklistGNo The value of the column 'PICKLIST_G_NO'. (NullAllowed)
     */
    public void setPicklistGNo(Long picklistGNo) {
        __modifiedProperties.add("picklistGNo");
        this._picklistGNo = picklistGNo;
    }

    /**
     * [get] CASE_CD: {NotNull, bigint(19)} <br>
     * ケースCD
     * @return The value of the column 'CASE_CD'. (NullAllowed)
     */
    public Long getCaseCd() {
        return _caseCd;
    }

    /**
     * [set] CASE_CD: {NotNull, bigint(19)} <br>
     * ケースCD
     * @param caseCd The value of the column 'CASE_CD'. (NullAllowed)
     */
    public void setCaseCd(Long caseCd) {
        __modifiedProperties.add("caseCd");
        this._caseCd = caseCd;
    }

    /**
     * [get] DUMMY_CASE_KBN: {char(1)} <br>
     * ダミーケース作成区分
     * @return The value of the column 'DUMMY_CASE_KBN'. (NullAllowed)
     */
    public String getDummyCaseKbn() {
        return _dummyCaseKbn;
    }

    /**
     * [set] DUMMY_CASE_KBN: {char(1)} <br>
     * ダミーケース作成区分
     * @param dummyCaseKbn The value of the column 'DUMMY_CASE_KBN'. (NullAllowed)
     */
    public void setDummyCaseKbn(String dummyCaseKbn) {
        __modifiedProperties.add("dummyCaseKbn");
        this._dummyCaseKbn = dummyCaseKbn;
    }

    /**
     * [get] READ_SD_KBN: {char(1)} <br>
     * SD読込区分
     * @return The value of the column 'READ_SD_KBN'. (NullAllowed)
     */
    public String getReadSdKbn() {
        return _readSdKbn;
    }

    /**
     * [set] READ_SD_KBN: {char(1)} <br>
     * SD読込区分
     * @param readSdKbn The value of the column 'READ_SD_KBN'. (NullAllowed)
     */
    public void setReadSdKbn(String readSdKbn) {
        __modifiedProperties.add("readSdKbn");
        this._readSdKbn = readSdKbn;
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
