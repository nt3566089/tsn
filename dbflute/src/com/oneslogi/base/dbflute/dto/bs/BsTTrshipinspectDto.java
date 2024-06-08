package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSHIPINSPECT as TABLE. <br>
 * 出庫検品
 * <pre>
 * [primary-key]
 *     SHIPPING_INSPECTION_ID
 *
 * [column]
 *     SHIPPING_INSPECTION_ID, SHIPINSPECTKEY, PICKING_INST_DETAIL_ID, TAGCD, ROOTPACKKEY, PACKKEY, SHIPPING_INSPECTION_REMAINING_ID, SOID, SODETAILID, DELIVERYGROUPKEY, WBKEY, WAREHOUSECD, PRODUCT_ID, LOT_ID, INSPECTEDQTY1, INSPECTUSERCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INSPECTION_ID
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
public abstract class BsTTrshipinspectDto implements Serializable {

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
    /** SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shippingInspectionId;

    /** SHIPINSPECTKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _shipinspectkey;

    /** PICKING_INST_DETAIL_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _pickingInstDetailId;

    /** TAGCD: {varchar(30)} */
    @JsonKey
    protected String _tagcd;

    /** ROOTPACKKEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _rootpackkey;

    /** PACKKEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _packkey;

    /** SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)} */
    @JsonKey
    protected Long _shippingInspectionRemainingId;

    /** SOID: {IX+, NotNull, bigint(19)} */
    @JsonKey
    protected Long _soid;

    /** SODETAILID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sodetailid;

    /** DELIVERYGROUPKEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _deliverygroupkey;

    /** WBKEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _wbkey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** PRODUCT_ID: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _productId;

    /** LOT_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _inspectedqty1;

    /** INSPECTUSERCD: {varchar(30)} */
    @JsonKey
    protected String _inspectusercd;

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
    public BsTTrshipinspectDto() {
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
        if (other == null || !(other instanceof BsTTrshipinspectDto)) { return false; }
        final BsTTrshipinspectDto otherEntity = (BsTTrshipinspectDto)other;
        if (!helpComparingValue(getShippingInspectionId(), otherEntity.getShippingInspectionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSHIPINSPECT");
        result = xCH(result, getShippingInspectionId());
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
        sb.append(c).append(getShippingInspectionId());
        sb.append(c).append(getShipinspectkey());
        sb.append(c).append(getPickingInstDetailId());
        sb.append(c).append(getTagcd());
        sb.append(c).append(getRootpackkey());
        sb.append(c).append(getPackkey());
        sb.append(c).append(getShippingInspectionRemainingId());
        sb.append(c).append(getSoid());
        sb.append(c).append(getSodetailid());
        sb.append(c).append(getDeliverygroupkey());
        sb.append(c).append(getWbkey());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getLotId());
        sb.append(c).append(getInspectedqty1());
        sb.append(c).append(getInspectusercd());
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
     * [get] SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫検品ID
     * @return The value of the column 'SHIPPING_INSPECTION_ID'. (NullAllowed)
     */
    public Long getShippingInspectionId() {
        return _shippingInspectionId;
    }

    /**
     * [set] SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫検品ID
     * @param shippingInspectionId The value of the column 'SHIPPING_INSPECTION_ID'. (NullAllowed)
     */
    public void setShippingInspectionId(Long shippingInspectionId) {
        __modifiedProperties.add("shippingInspectionId");
        this._shippingInspectionId = shippingInspectionId;
    }

    /**
     * [get] SHIPINSPECTKEY: {NotNull, bigint(19)} <br>
     * 出庫検品Ｋｅｙ
     * @return The value of the column 'SHIPINSPECTKEY'. (NullAllowed)
     */
    public Long getShipinspectkey() {
        return _shipinspectkey;
    }

    /**
     * [set] SHIPINSPECTKEY: {NotNull, bigint(19)} <br>
     * 出庫検品Ｋｅｙ
     * @param shipinspectkey The value of the column 'SHIPINSPECTKEY'. (NullAllowed)
     */
    public void setShipinspectkey(Long shipinspectkey) {
        __modifiedProperties.add("shipinspectkey");
        this._shipinspectkey = shipinspectkey;
    }

    /**
     * [get] PICKING_INST_DETAIL_ID: {IX, bigint(19)} <br>
     * ピッキング指示明細ID
     * @return The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed)
     */
    public Long getPickingInstDetailId() {
        return _pickingInstDetailId;
    }

    /**
     * [set] PICKING_INST_DETAIL_ID: {IX, bigint(19)} <br>
     * ピッキング指示明細ID
     * @param pickingInstDetailId The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed)
     */
    public void setPickingInstDetailId(Long pickingInstDetailId) {
        __modifiedProperties.add("pickingInstDetailId");
        this._pickingInstDetailId = pickingInstDetailId;
    }

    /**
     * [get] TAGCD: {varchar(30)} <br>
     * 仕分タグCD
     * @return The value of the column 'TAGCD'. (NullAllowed)
     */
    public String getTagcd() {
        return _tagcd;
    }

    /**
     * [set] TAGCD: {varchar(30)} <br>
     * 仕分タグCD
     * @param tagcd The value of the column 'TAGCD'. (NullAllowed)
     */
    public void setTagcd(String tagcd) {
        __modifiedProperties.add("tagcd");
        this._tagcd = tagcd;
    }

    /**
     * [get] ROOTPACKKEY: {IX, bigint(19)} <br>
     * ルート梱包Ｋｅｙ
     * @return The value of the column 'ROOTPACKKEY'. (NullAllowed)
     */
    public Long getRootpackkey() {
        return _rootpackkey;
    }

    /**
     * [set] ROOTPACKKEY: {IX, bigint(19)} <br>
     * ルート梱包Ｋｅｙ
     * @param rootpackkey The value of the column 'ROOTPACKKEY'. (NullAllowed)
     */
    public void setRootpackkey(Long rootpackkey) {
        __modifiedProperties.add("rootpackkey");
        this._rootpackkey = rootpackkey;
    }

    /**
     * [get] PACKKEY: {IX, bigint(19)} <br>
     * 梱包Ｋｅｙ
     * @return The value of the column 'PACKKEY'. (NullAllowed)
     */
    public Long getPackkey() {
        return _packkey;
    }

    /**
     * [set] PACKKEY: {IX, bigint(19)} <br>
     * 梱包Ｋｅｙ
     * @param packkey The value of the column 'PACKKEY'. (NullAllowed)
     */
    public void setPackkey(Long packkey) {
        __modifiedProperties.add("packkey");
        this._packkey = packkey;
    }

    /**
     * [get] SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)} <br>
     * 出庫検品残ID
     * @return The value of the column 'SHIPPING_INSPECTION_REMAINING_ID'. (NullAllowed)
     */
    public Long getShippingInspectionRemainingId() {
        return _shippingInspectionRemainingId;
    }

    /**
     * [set] SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)} <br>
     * 出庫検品残ID
     * @param shippingInspectionRemainingId The value of the column 'SHIPPING_INSPECTION_REMAINING_ID'. (NullAllowed)
     */
    public void setShippingInspectionRemainingId(Long shippingInspectionRemainingId) {
        __modifiedProperties.add("shippingInspectionRemainingId");
        this._shippingInspectionRemainingId = shippingInspectionRemainingId;
    }

    /**
     * [get] SOID: {IX+, NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed)
     */
    public Long getSoid() {
        return _soid;
    }

    /**
     * [set] SOID: {IX+, NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed)
     */
    public void setSoid(Long soid) {
        __modifiedProperties.add("soid");
        this._soid = soid;
    }

    /**
     * [get] SODETAILID: {NotNull, bigint(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (NullAllowed)
     */
    public Long getSodetailid() {
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {NotNull, bigint(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (NullAllowed)
     */
    public void setSodetailid(Long sodetailid) {
        __modifiedProperties.add("sodetailid");
        this._sodetailid = sodetailid;
    }

    /**
     * [get] DELIVERYGROUPKEY: {IX, bigint(19)} <br>
     * 配送グループＫｅｙ
     * @return The value of the column 'DELIVERYGROUPKEY'. (NullAllowed)
     */
    public Long getDeliverygroupkey() {
        return _deliverygroupkey;
    }

    /**
     * [set] DELIVERYGROUPKEY: {IX, bigint(19)} <br>
     * 配送グループＫｅｙ
     * @param deliverygroupkey The value of the column 'DELIVERYGROUPKEY'. (NullAllowed)
     */
    public void setDeliverygroupkey(Long deliverygroupkey) {
        __modifiedProperties.add("deliverygroupkey");
        this._deliverygroupkey = deliverygroupkey;
    }

    /**
     * [get] WBKEY: {IX, bigint(19)} <br>
     * 送り状Ｋｅｙ
     * @return The value of the column 'WBKEY'. (NullAllowed)
     */
    public Long getWbkey() {
        return _wbkey;
    }

    /**
     * [set] WBKEY: {IX, bigint(19)} <br>
     * 送り状Ｋｅｙ
     * @param wbkey The value of the column 'WBKEY'. (NullAllowed)
     */
    public void setWbkey(Long wbkey) {
        __modifiedProperties.add("wbkey");
        this._wbkey = wbkey;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, varchar(30)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public String getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, varchar(30)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(String productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] LOT_ID: {IX, NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @return The value of the column 'INSPECTEDQTY1'. (NullAllowed)
     */
    public Long getInspectedqty1() {
        return _inspectedqty1;
    }

    /**
     * [set] INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @param inspectedqty1 The value of the column 'INSPECTEDQTY1'. (NullAllowed)
     */
    public void setInspectedqty1(Long inspectedqty1) {
        __modifiedProperties.add("inspectedqty1");
        this._inspectedqty1 = inspectedqty1;
    }

    /**
     * [get] INSPECTUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @return The value of the column 'INSPECTUSERCD'. (NullAllowed)
     */
    public String getInspectusercd() {
        return _inspectusercd;
    }

    /**
     * [set] INSPECTUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @param inspectusercd The value of the column 'INSPECTUSERCD'. (NullAllowed)
     */
    public void setInspectusercd(String inspectusercd) {
        __modifiedProperties.add("inspectusercd");
        this._inspectusercd = inspectusercd;
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
