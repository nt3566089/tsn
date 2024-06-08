package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRPICKRESULT as TABLE. <br>
 * 棚出明細
 * <pre>
 * [primary-key]
 *     PICKING_DETAIL_ID
 *
 * [column]
 *     PICKING_DETAIL_ID, WORKALLOCATEID, FLOOR, LISTKBN, LOCATION_ID, LOT_ID, PALLET_ID, CENTER_SYMBOL_ID, PICKEDQTY1, SORTEDQTY1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_DETAIL_ID
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
public abstract class BsTTrpickresultDto implements Serializable {

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
    /** PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _pickingDetailId;

    /** WORKALLOCATEID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _workallocateid;

    /** FLOOR: {NotNull, varchar(30)} */
    @JsonKey
    protected String _floor;

    /** LISTKBN: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _listkbn;

    /** LOCATION_ID: {NotNull, varchar(30)} */
    @JsonKey
    protected String _locationId;

    /** LOT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** PALLET_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _palletId;

    /** CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerSymbolId;

    /** PICKEDQTY1: {bigint(19)} */
    @JsonKey
    protected Long _pickedqty1;

    /** SORTEDQTY1: {bigint(19)} */
    @JsonKey
    protected Long _sortedqty1;

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
    public BsTTrpickresultDto() {
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
        if (other == null || !(other instanceof BsTTrpickresultDto)) { return false; }
        final BsTTrpickresultDto otherEntity = (BsTTrpickresultDto)other;
        if (!helpComparingValue(getPickingDetailId(), otherEntity.getPickingDetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRPICKRESULT");
        result = xCH(result, getPickingDetailId());
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
        sb.append(c).append(getPickingDetailId());
        sb.append(c).append(getWorkallocateid());
        sb.append(c).append(getFloor());
        sb.append(c).append(getListkbn());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLotId());
        sb.append(c).append(getPalletId());
        sb.append(c).append(getCenterSymbolId());
        sb.append(c).append(getPickedqty1());
        sb.append(c).append(getSortedqty1());
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
     * [get] PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚出明細ID
     * @return The value of the column 'PICKING_DETAIL_ID'. (NullAllowed)
     */
    public Long getPickingDetailId() {
        return _pickingDetailId;
    }

    /**
     * [set] PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚出明細ID
     * @param pickingDetailId The value of the column 'PICKING_DETAIL_ID'. (NullAllowed)
     */
    public void setPickingDetailId(Long pickingDetailId) {
        __modifiedProperties.add("pickingDetailId");
        this._pickingDetailId = pickingDetailId;
    }

    /**
     * [get] WORKALLOCATEID: {NotNull, bigint(19)} <br>
     * 棚出しリストキー
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public Long getWorkallocateid() {
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {NotNull, bigint(19)} <br>
     * 棚出しリストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public void setWorkallocateid(Long workallocateid) {
        __modifiedProperties.add("workallocateid");
        this._workallocateid = workallocateid;
    }

    /**
     * [get] FLOOR: {NotNull, varchar(30)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {NotNull, varchar(30)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] LISTKBN: {NotNull, bigint(19)} <br>
     * 単品・端数区分
     * @return The value of the column 'LISTKBN'. (NullAllowed)
     */
    public Long getListkbn() {
        return _listkbn;
    }

    /**
     * [set] LISTKBN: {NotNull, bigint(19)} <br>
     * 単品・端数区分
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed)
     */
    public void setListkbn(Long listkbn) {
        __modifiedProperties.add("listkbn");
        this._listkbn = listkbn;
    }

    /**
     * [get] LOCATION_ID: {NotNull, varchar(30)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public String getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, varchar(30)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(String locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] PALLET_ID: {IX, NotNull, bigint(19)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public Long getPalletId() {
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {IX, NotNull, bigint(19)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public void setPalletId(Long palletId) {
        __modifiedProperties.add("palletId");
        this._palletId = palletId;
    }

    /**
     * [get] CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public Long getCenterSymbolId() {
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public void setCenterSymbolId(Long centerSymbolId) {
        __modifiedProperties.add("centerSymbolId");
        this._centerSymbolId = centerSymbolId;
    }

    /**
     * [get] PICKEDQTY1: {bigint(19)} <br>
     * ピッキング済数量
     * @return The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public Long getPickedqty1() {
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {bigint(19)} <br>
     * ピッキング済数量
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public void setPickedqty1(Long pickedqty1) {
        __modifiedProperties.add("pickedqty1");
        this._pickedqty1 = pickedqty1;
    }

    /**
     * [get] SORTEDQTY1: {bigint(19)} <br>
     * 仕分済数量
     * @return The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public Long getSortedqty1() {
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {bigint(19)} <br>
     * 仕分済数量
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public void setSortedqty1(Long sortedqty1) {
        __modifiedProperties.add("sortedqty1");
        this._sortedqty1 = sortedqty1;
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
