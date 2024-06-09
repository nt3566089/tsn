package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of W_SGL_ROW_SHIP_INSP_B as TABLE. <br>
 * 単行出荷検品ワークボディ
 * <pre>
 * [primary-key]
 *     SGL_ROW_SHIP_INSP_B_ID
 *
 * [column]
 *     SGL_ROW_SHIP_INSP_B_ID, SGL_ROW_SHIP_INSP_H_ID, PICKING_H_ID, USER_ID, INSPECTED_NUM, INSPECTION_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SGL_ROW_SHIP_INSP_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_PICKING_H, W_SGL_ROW_SHIP_INSP_H, B_USER, B_CLASS_DTL(ByInspectionFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tPickingH, wSglRowShipInspH, bUser, bClassDtlByInspectionFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWSglRowShipInspBDto implements Serializable {

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
    /** SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sglRowShipInspBId;

    /** SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H} */
    @JsonKey
    protected Long _sglRowShipInspHId;

    /** PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H} */
    @JsonKey
    protected Long _pickingHId;

    /** USER_ID: {IX, bigint(19), FK to B_USER} */
    @JsonKey
    protected Long _userId;

    /** INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _inspectedNum;

    /** INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} */
    @JsonKey
    protected String _inspectionFlg;

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
    public BsWSglRowShipInspBDto() {
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
    protected TPickingHDto _tPickingH;

    public TPickingHDto getTPickingH() {
        return _tPickingH;
    }

    public void setTPickingH(TPickingHDto tPickingH) {
        this._tPickingH = tPickingH;
    }

    protected WSglRowShipInspHDto _wSglRowShipInspH;

    public WSglRowShipInspHDto getWSglRowShipInspH() {
        return _wSglRowShipInspH;
    }

    public void setWSglRowShipInspH(WSglRowShipInspHDto wSglRowShipInspH) {
        this._wSglRowShipInspH = wSglRowShipInspH;
    }

    protected BUserDto _bUser;

    public BUserDto getBUser() {
        return _bUser;
    }

    public void setBUser(BUserDto bUser) {
        this._bUser = bUser;
    }

    protected BClassDtlDto _bClassDtlByInspectionFlg;

    public BClassDtlDto getBClassDtlByInspectionFlg() {
        return _bClassDtlByInspectionFlg;
    }

    public void setBClassDtlByInspectionFlg(BClassDtlDto bClassDtlByInspectionFlg) {
        this._bClassDtlByInspectionFlg = bClassDtlByInspectionFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWSglRowShipInspBDto)) { return false; }
        final BsWSglRowShipInspBDto otherEntity = (BsWSglRowShipInspBDto)other;
        if (!helpComparingValue(getSglRowShipInspBId(), otherEntity.getSglRowShipInspBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_SGL_ROW_SHIP_INSP_B");
        result = xCH(result, getSglRowShipInspBId());
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
        sb.append(c).append(getSglRowShipInspBId());
        sb.append(c).append(getSglRowShipInspHId());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getUserId());
        sb.append(c).append(getInspectedNum());
        sb.append(c).append(getInspectionFlg());
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
     * [get] SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 単行出荷検品ワークボディID
     * @return The value of the column 'SGL_ROW_SHIP_INSP_B_ID'. (NullAllowed)
     */
    public Long getSglRowShipInspBId() {
        return _sglRowShipInspBId;
    }

    /**
     * [set] SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 単行出荷検品ワークボディID
     * @param sglRowShipInspBId The value of the column 'SGL_ROW_SHIP_INSP_B_ID'. (NullAllowed)
     */
    public void setSglRowShipInspBId(Long sglRowShipInspBId) {
        __modifiedProperties.add("sglRowShipInspBId");
        this._sglRowShipInspBId = sglRowShipInspBId;
    }

    /**
     * [get] SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H} <br>
     * 単行出荷検品ワークヘッダID
     * @return The value of the column 'SGL_ROW_SHIP_INSP_H_ID'. (NullAllowed)
     */
    public Long getSglRowShipInspHId() {
        return _sglRowShipInspHId;
    }

    /**
     * [set] SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H} <br>
     * 単行出荷検品ワークヘッダID
     * @param sglRowShipInspHId The value of the column 'SGL_ROW_SHIP_INSP_H_ID'. (NullAllowed)
     */
    public void setSglRowShipInspHId(Long sglRowShipInspHId) {
        __modifiedProperties.add("sglRowShipInspHId");
        this._sglRowShipInspHId = sglRowShipInspHId;
    }

    /**
     * [get] PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
    }

    /**
     * [get] USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * ユーザID
     * @return The value of the column 'USER_ID'. (NullAllowed)
     */
    public Long getUserId() {
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * ユーザID
     * @param userId The value of the column 'USER_ID'. (NullAllowed)
     */
    public void setUserId(Long userId) {
        __modifiedProperties.add("userId");
        this._userId = userId;
    }

    /**
     * [get] INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数
     * @return The value of the column 'INSPECTED_NUM'. (NullAllowed)
     */
    public Long getInspectedNum() {
        return _inspectedNum;
    }

    /**
     * [set] INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数
     * @param inspectedNum The value of the column 'INSPECTED_NUM'. (NullAllowed)
     */
    public void setInspectedNum(Long inspectedNum) {
        __modifiedProperties.add("inspectedNum");
        this._inspectedNum = inspectedNum;
    }

    /**
     * [get] INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @return The value of the column 'INSPECTION_FLG'. (NullAllowed)
     */
    public String getInspectionFlg() {
        return _inspectionFlg;
    }

    /**
     * [set] INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param inspectionFlg The value of the column 'INSPECTION_FLG'. (NullAllowed)
     */
    public void setInspectionFlg(String inspectionFlg) {
        __modifiedProperties.add("inspectionFlg");
        this._inspectionFlg = inspectionFlg;
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
