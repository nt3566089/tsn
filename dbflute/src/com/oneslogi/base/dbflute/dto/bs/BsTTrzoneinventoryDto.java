package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRZONEINVENTORY as TABLE. <br>
 * ゾーン別在庫情報
 * <pre>
 * [primary-key]
 *     TRZONEINVENTORYKEY, WAREHOUSECD, FLOOR, ZONE
 *
 * [column]
 *     TRZONEINVENTORYKEY, WAREHOUSECD, FLOOR, ZONE, PALLETCAPACITY, PALLETSPACE, ZONEINVFLG, QTY1ALLOCATED, RCVQTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsTTrzoneinventoryDto implements Serializable {

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
    /** TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _trzoneinventorykey;

    /** WAREHOUSECD: {PK, NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** FLOOR: {PK, NotNull, varchar(60)} */
    @JsonKey
    protected String _floor;

    /** ZONE: {PK, NotNull, varchar(60)} */
    @JsonKey
    protected String _zone;

    /** PALLETCAPACITY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _palletcapacity;

    /** PALLETSPACE: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _palletspace;

    /** ZONEINVFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _zoneinvflg;

    /** QTY1ALLOCATED: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qty1allocated;

    /** RCVQTY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _rcvqty;

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
    public BsTTrzoneinventoryDto() {
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
        if (other == null || !(other instanceof BsTTrzoneinventoryDto)) { return false; }
        final BsTTrzoneinventoryDto otherEntity = (BsTTrzoneinventoryDto)other;
        if (!helpComparingValue(getTrzoneinventorykey(), otherEntity.getTrzoneinventorykey())) { return false; }
        if (!helpComparingValue(getWarehousecd(), otherEntity.getWarehousecd())) { return false; }
        if (!helpComparingValue(getFloor(), otherEntity.getFloor())) { return false; }
        if (!helpComparingValue(getZone(), otherEntity.getZone())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRZONEINVENTORY");
        result = xCH(result, getTrzoneinventorykey());
        result = xCH(result, getWarehousecd());
        result = xCH(result, getFloor());
        result = xCH(result, getZone());
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
        sb.append(c).append(getTrzoneinventorykey());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getFloor());
        sb.append(c).append(getZone());
        sb.append(c).append(getPalletcapacity());
        sb.append(c).append(getPalletspace());
        sb.append(c).append(getZoneinvflg());
        sb.append(c).append(getQty1allocated());
        sb.append(c).append(getRcvqty());
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
     * [get] TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ゾーン別在庫キー
     * @return The value of the column 'TRZONEINVENTORYKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getTrzoneinventorykey() {
        return _trzoneinventorykey;
    }

    /**
     * [set] TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ゾーン別在庫キー
     * @param trzoneinventorykey The value of the column 'TRZONEINVENTORYKEY'. (NullAllowed)
     */
    public void setTrzoneinventorykey(java.math.BigDecimal trzoneinventorykey) {
        __modifiedProperties.add("trzoneinventorykey");
        this._trzoneinventorykey = trzoneinventorykey;
    }

    /**
     * [get] WAREHOUSECD: {PK, NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {PK, NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] FLOOR: {PK, NotNull, varchar(60)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {PK, NotNull, varchar(60)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] ZONE: {PK, NotNull, varchar(60)} <br>
     * ゾーン
     * @return The value of the column 'ZONE'. (NullAllowed)
     */
    public String getZone() {
        return _zone;
    }

    /**
     * [set] ZONE: {PK, NotNull, varchar(60)} <br>
     * ゾーン
     * @param zone The value of the column 'ZONE'. (NullAllowed)
     */
    public void setZone(String zone) {
        __modifiedProperties.add("zone");
        this._zone = zone;
    }

    /**
     * [get] PALLETCAPACITY: {decimal(16, 6)} <br>
     * 許容パレット枚数
     * @return The value of the column 'PALLETCAPACITY'. (NullAllowed)
     */
    public java.math.BigDecimal getPalletcapacity() {
        return _palletcapacity;
    }

    /**
     * [set] PALLETCAPACITY: {decimal(16, 6)} <br>
     * 許容パレット枚数
     * @param palletcapacity The value of the column 'PALLETCAPACITY'. (NullAllowed)
     */
    public void setPalletcapacity(java.math.BigDecimal palletcapacity) {
        __modifiedProperties.add("palletcapacity");
        this._palletcapacity = palletcapacity;
    }

    /**
     * [get] PALLETSPACE: {decimal(16, 6)} <br>
     * 空きパレット数
     * @return The value of the column 'PALLETSPACE'. (NullAllowed)
     */
    public java.math.BigDecimal getPalletspace() {
        return _palletspace;
    }

    /**
     * [set] PALLETSPACE: {decimal(16, 6)} <br>
     * 空きパレット数
     * @param palletspace The value of the column 'PALLETSPACE'. (NullAllowed)
     */
    public void setPalletspace(java.math.BigDecimal palletspace) {
        __modifiedProperties.add("palletspace");
        this._palletspace = palletspace;
    }

    /**
     * [get] ZONEINVFLG: {decimal(16, 6)} <br>
     * 引当済在庫有無フラグ
     * @return The value of the column 'ZONEINVFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getZoneinvflg() {
        return _zoneinvflg;
    }

    /**
     * [set] ZONEINVFLG: {decimal(16, 6)} <br>
     * 引当済在庫有無フラグ
     * @param zoneinvflg The value of the column 'ZONEINVFLG'. (NullAllowed)
     */
    public void setZoneinvflg(java.math.BigDecimal zoneinvflg) {
        __modifiedProperties.add("zoneinvflg");
        this._zoneinvflg = zoneinvflg;
    }

    /**
     * [get] QTY1ALLOCATED: {decimal(16, 6)} <br>
     * 引当済在庫数量
     * @return The value of the column 'QTY1ALLOCATED'. (NullAllowed)
     */
    public java.math.BigDecimal getQty1allocated() {
        return _qty1allocated;
    }

    /**
     * [set] QTY1ALLOCATED: {decimal(16, 6)} <br>
     * 引当済在庫数量
     * @param qty1allocated The value of the column 'QTY1ALLOCATED'. (NullAllowed)
     */
    public void setQty1allocated(java.math.BigDecimal qty1allocated) {
        __modifiedProperties.add("qty1allocated");
        this._qty1allocated = qty1allocated;
    }

    /**
     * [get] RCVQTY: {decimal(16, 6), default=[(0)]} <br>
     * 格納予定数量
     * @return The value of the column 'RCVQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvqty() {
        return _rcvqty;
    }

    /**
     * [set] RCVQTY: {decimal(16, 6), default=[(0)]} <br>
     * 格納予定数量
     * @param rcvqty The value of the column 'RCVQTY'. (NullAllowed)
     */
    public void setRcvqty(java.math.BigDecimal rcvqty) {
        __modifiedProperties.add("rcvqty");
        this._rcvqty = rcvqty;
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
