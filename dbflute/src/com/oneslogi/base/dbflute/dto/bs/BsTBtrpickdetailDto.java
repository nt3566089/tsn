package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_BTRPICKDETAIL as TABLE. <br>
 * ピッキング指示明細
 * <pre>
 * [primary-key]
 *     PICKING_INST_DETAIL_ID
 *
 * [column]
 *     PICKING_INST_DETAIL_ID, PICKING_INST_ID, PICKBATCHLINENO, SOID, SODETAILID, STS, PRODUCT_ID, IF_PRODUCT_ID, LOT_ID, LOCATION_ID, LOCGROUP, LOCTYPE, PICKTYPE, ALLOCTYPE, TAGCD, ACTUALTAGCD, FROM_LOCATION_ID, FROMTAGCD, TO_LOCATION_ID, TOTAGCD, EXPECTQTY1, PICKEDQTY1, PALLETTYPE, SORTEDQTY1, SHIPPEDQTY1, RCVKEY, RCVLINENO, PICKUSERCD, LOTRESERVEFLG, LABELPRINTEDFLG, ALLOCSTYLETYPE, FULLPALLETKEY, PICKINGUNIT, WORKALLOCATEID, WORKALLOCATENAME, ALERTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_DETAIL_ID
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
public abstract class BsTBtrpickdetailDto implements Serializable {

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
    /** PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _pickingInstDetailId;

    /** PICKING_INST_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pickingInstId;

    /** PICKBATCHLINENO: {bigint(19)} */
    @JsonKey
    protected Long _pickbatchlineno;

    /** SOID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _soid;

    /** SODETAILID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _sodetailid;

    /** STS: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _sts;

    /** PRODUCT_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** IF_PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _ifProductId;

    /** LOT_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** LOCATION_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOCGROUP: {varchar(60)} */
    @JsonKey
    protected String _locgroup;

    /** LOCTYPE: {varchar(30)} */
    @JsonKey
    protected String _loctype;

    /** PICKTYPE: {varchar(30)} */
    @JsonKey
    protected String _picktype;

    /** ALLOCTYPE: {varchar(30)} */
    @JsonKey
    protected String _alloctype;

    /** TAGCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _tagcd;

    /** ACTUALTAGCD: {varchar(30)} */
    @JsonKey
    protected String _actualtagcd;

    /** FROM_LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _fromLocationId;

    /** FROMTAGCD: {varchar(30)} */
    @JsonKey
    protected String _fromtagcd;

    /** TO_LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _toLocationId;

    /** TOTAGCD: {varchar(30)} */
    @JsonKey
    protected String _totagcd;

    /** EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _expectqty1;

    /** PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _pickedqty1;

    /** PALLETTYPE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _pallettype;

    /** SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sortedqty1;

    /** SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _shippedqty1;

    /** RCVKEY: {IX+, bigint(19)} */
    @JsonKey
    protected Long _rcvkey;

    /** RCVLINENO: {bigint(19)} */
    @JsonKey
    protected Long _rcvlineno;

    /** PICKUSERCD: {varchar(30)} */
    @JsonKey
    protected String _pickusercd;

    /** LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _lotreserveflg;

    /** LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _labelprintedflg;

    /** ALLOCSTYLETYPE: {bigint(19)} */
    @JsonKey
    protected Long _allocstyletype;

    /** FULLPALLETKEY: {bigint(19)} */
    @JsonKey
    protected Long _fullpalletkey;

    /** PICKINGUNIT: {bigint(19)} */
    @JsonKey
    protected Long _pickingunit;

    /** WORKALLOCATEID: {IX, bigint(19)} */
    @JsonKey
    protected Long _workallocateid;

    /** WORKALLOCATENAME: {varchar(100)} */
    @JsonKey
    protected String _workallocatename;

    /** ALERTFLG: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _alertflg;

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
    public BsTBtrpickdetailDto() {
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
        if (other == null || !(other instanceof BsTBtrpickdetailDto)) { return false; }
        final BsTBtrpickdetailDto otherEntity = (BsTBtrpickdetailDto)other;
        if (!helpComparingValue(getPickingInstDetailId(), otherEntity.getPickingInstDetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_BTRPICKDETAIL");
        result = xCH(result, getPickingInstDetailId());
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
        sb.append(c).append(getPickingInstDetailId());
        sb.append(c).append(getPickingInstId());
        sb.append(c).append(getPickbatchlineno());
        sb.append(c).append(getSoid());
        sb.append(c).append(getSodetailid());
        sb.append(c).append(getSts());
        sb.append(c).append(getProductId());
        sb.append(c).append(getIfProductId());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocgroup());
        sb.append(c).append(getLoctype());
        sb.append(c).append(getPicktype());
        sb.append(c).append(getAlloctype());
        sb.append(c).append(getTagcd());
        sb.append(c).append(getActualtagcd());
        sb.append(c).append(getFromLocationId());
        sb.append(c).append(getFromtagcd());
        sb.append(c).append(getToLocationId());
        sb.append(c).append(getTotagcd());
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getPickedqty1());
        sb.append(c).append(getPallettype());
        sb.append(c).append(getSortedqty1());
        sb.append(c).append(getShippedqty1());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getPickusercd());
        sb.append(c).append(getLotreserveflg());
        sb.append(c).append(getLabelprintedflg());
        sb.append(c).append(getAllocstyletype());
        sb.append(c).append(getFullpalletkey());
        sb.append(c).append(getPickingunit());
        sb.append(c).append(getWorkallocateid());
        sb.append(c).append(getWorkallocatename());
        sb.append(c).append(getAlertflg());
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
     * [get] PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示明細ID
     * @return The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed)
     */
    public Long getPickingInstDetailId() {
        return _pickingInstDetailId;
    }

    /**
     * [set] PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示明細ID
     * @param pickingInstDetailId The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed)
     */
    public void setPickingInstDetailId(Long pickingInstDetailId) {
        __modifiedProperties.add("pickingInstDetailId");
        this._pickingInstDetailId = pickingInstDetailId;
    }

    /**
     * [get] PICKING_INST_ID: {NotNull, bigint(19)} <br>
     * ピッキング指示ID
     * @return The value of the column 'PICKING_INST_ID'. (NullAllowed)
     */
    public Long getPickingInstId() {
        return _pickingInstId;
    }

    /**
     * [set] PICKING_INST_ID: {NotNull, bigint(19)} <br>
     * ピッキング指示ID
     * @param pickingInstId The value of the column 'PICKING_INST_ID'. (NullAllowed)
     */
    public void setPickingInstId(Long pickingInstId) {
        __modifiedProperties.add("pickingInstId");
        this._pickingInstId = pickingInstId;
    }

    /**
     * [get] PICKBATCHLINENO: {bigint(19)} <br>
     * 引当バッチ行№
     * @return The value of the column 'PICKBATCHLINENO'. (NullAllowed)
     */
    public Long getPickbatchlineno() {
        return _pickbatchlineno;
    }

    /**
     * [set] PICKBATCHLINENO: {bigint(19)} <br>
     * 引当バッチ行№
     * @param pickbatchlineno The value of the column 'PICKBATCHLINENO'. (NullAllowed)
     */
    public void setPickbatchlineno(Long pickbatchlineno) {
        __modifiedProperties.add("pickbatchlineno");
        this._pickbatchlineno = pickbatchlineno;
    }

    /**
     * [get] SOID: {NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed)
     */
    public Long getSoid() {
        return _soid;
    }

    /**
     * [set] SOID: {NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed)
     */
    public void setSoid(Long soid) {
        __modifiedProperties.add("soid");
        this._soid = soid;
    }

    /**
     * [get] SODETAILID: {IX, NotNull, bigint(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (NullAllowed)
     */
    public Long getSodetailid() {
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {IX, NotNull, bigint(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (NullAllowed)
     */
    public void setSodetailid(Long sodetailid) {
        __modifiedProperties.add("sodetailid");
        this._sodetailid = sodetailid;
    }

    /**
     * [get] STS: {IX, NotNull, bigint(19)} <br>
     * 出荷ステータス
     * @return The value of the column 'STS'. (NullAllowed)
     */
    public Long getSts() {
        return _sts;
    }

    /**
     * [set] STS: {IX, NotNull, bigint(19)} <br>
     * 出荷ステータス
     * @param sts The value of the column 'STS'. (NullAllowed)
     */
    public void setSts(Long sts) {
        __modifiedProperties.add("sts");
        this._sts = sts;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] IF_PRODUCT_ID: {bigint(19)} <br>
     * I/F銘柄ID
     * @return The value of the column 'IF_PRODUCT_ID'. (NullAllowed)
     */
    public Long getIfProductId() {
        return _ifProductId;
    }

    /**
     * [set] IF_PRODUCT_ID: {bigint(19)} <br>
     * I/F銘柄ID
     * @param ifProductId The value of the column 'IF_PRODUCT_ID'. (NullAllowed)
     */
    public void setIfProductId(Long ifProductId) {
        __modifiedProperties.add("ifProductId");
        this._ifProductId = ifProductId;
    }

    /**
     * [get] LOT_ID: {IX, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] LOCATION_ID: {IX, NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOCGROUP: {varchar(60)} <br>
     * ロケグループ
     * @return The value of the column 'LOCGROUP'. (NullAllowed)
     */
    public String getLocgroup() {
        return _locgroup;
    }

    /**
     * [set] LOCGROUP: {varchar(60)} <br>
     * ロケグループ
     * @param locgroup The value of the column 'LOCGROUP'. (NullAllowed)
     */
    public void setLocgroup(String locgroup) {
        __modifiedProperties.add("locgroup");
        this._locgroup = locgroup;
    }

    /**
     * [get] LOCTYPE: {varchar(30)} <br>
     * ロケタイプ
     * @return The value of the column 'LOCTYPE'. (NullAllowed)
     */
    public String getLoctype() {
        return _loctype;
    }

    /**
     * [set] LOCTYPE: {varchar(30)} <br>
     * ロケタイプ
     * @param loctype The value of the column 'LOCTYPE'. (NullAllowed)
     */
    public void setLoctype(String loctype) {
        __modifiedProperties.add("loctype");
        this._loctype = loctype;
    }

    /**
     * [get] PICKTYPE: {varchar(30)} <br>
     * ピッキングタイプ
     * @return The value of the column 'PICKTYPE'. (NullAllowed)
     */
    public String getPicktype() {
        return _picktype;
    }

    /**
     * [set] PICKTYPE: {varchar(30)} <br>
     * ピッキングタイプ
     * @param picktype The value of the column 'PICKTYPE'. (NullAllowed)
     */
    public void setPicktype(String picktype) {
        __modifiedProperties.add("picktype");
        this._picktype = picktype;
    }

    /**
     * [get] ALLOCTYPE: {varchar(30)} <br>
     * 引当タイプ
     * @return The value of the column 'ALLOCTYPE'. (NullAllowed)
     */
    public String getAlloctype() {
        return _alloctype;
    }

    /**
     * [set] ALLOCTYPE: {varchar(30)} <br>
     * 引当タイプ
     * @param alloctype The value of the column 'ALLOCTYPE'. (NullAllowed)
     */
    public void setAlloctype(String alloctype) {
        __modifiedProperties.add("alloctype");
        this._alloctype = alloctype;
    }

    /**
     * [get] TAGCD: {NotNull, varchar(30)} <br>
     * タグCD
     * @return The value of the column 'TAGCD'. (NullAllowed)
     */
    public String getTagcd() {
        return _tagcd;
    }

    /**
     * [set] TAGCD: {NotNull, varchar(30)} <br>
     * タグCD
     * @param tagcd The value of the column 'TAGCD'. (NullAllowed)
     */
    public void setTagcd(String tagcd) {
        __modifiedProperties.add("tagcd");
        this._tagcd = tagcd;
    }

    /**
     * [get] ACTUALTAGCD: {varchar(30)} <br>
     * 実績タグCD
     * @return The value of the column 'ACTUALTAGCD'. (NullAllowed)
     */
    public String getActualtagcd() {
        return _actualtagcd;
    }

    /**
     * [set] ACTUALTAGCD: {varchar(30)} <br>
     * 実績タグCD
     * @param actualtagcd The value of the column 'ACTUALTAGCD'. (NullAllowed)
     */
    public void setActualtagcd(String actualtagcd) {
        __modifiedProperties.add("actualtagcd");
        this._actualtagcd = actualtagcd;
    }

    /**
     * [get] FROM_LOCATION_ID: {bigint(19)} <br>
     * ＦｒｏｍロケID
     * @return The value of the column 'FROM_LOCATION_ID'. (NullAllowed)
     */
    public Long getFromLocationId() {
        return _fromLocationId;
    }

    /**
     * [set] FROM_LOCATION_ID: {bigint(19)} <br>
     * ＦｒｏｍロケID
     * @param fromLocationId The value of the column 'FROM_LOCATION_ID'. (NullAllowed)
     */
    public void setFromLocationId(Long fromLocationId) {
        __modifiedProperties.add("fromLocationId");
        this._fromLocationId = fromLocationId;
    }

    /**
     * [get] FROMTAGCD: {varchar(30)} <br>
     * ＦｒｏｍタグCD
     * @return The value of the column 'FROMTAGCD'. (NullAllowed)
     */
    public String getFromtagcd() {
        return _fromtagcd;
    }

    /**
     * [set] FROMTAGCD: {varchar(30)} <br>
     * ＦｒｏｍタグCD
     * @param fromtagcd The value of the column 'FROMTAGCD'. (NullAllowed)
     */
    public void setFromtagcd(String fromtagcd) {
        __modifiedProperties.add("fromtagcd");
        this._fromtagcd = fromtagcd;
    }

    /**
     * [get] TO_LOCATION_ID: {bigint(19)} <br>
     * ＴｏロケID
     * @return The value of the column 'TO_LOCATION_ID'. (NullAllowed)
     */
    public Long getToLocationId() {
        return _toLocationId;
    }

    /**
     * [set] TO_LOCATION_ID: {bigint(19)} <br>
     * ＴｏロケID
     * @param toLocationId The value of the column 'TO_LOCATION_ID'. (NullAllowed)
     */
    public void setToLocationId(Long toLocationId) {
        __modifiedProperties.add("toLocationId");
        this._toLocationId = toLocationId;
    }

    /**
     * [get] TOTAGCD: {varchar(30)} <br>
     * ＴｏタグCD
     * @return The value of the column 'TOTAGCD'. (NullAllowed)
     */
    public String getTotagcd() {
        return _totagcd;
    }

    /**
     * [set] TOTAGCD: {varchar(30)} <br>
     * ＴｏタグCD
     * @param totagcd The value of the column 'TOTAGCD'. (NullAllowed)
     */
    public void setTotagcd(String totagcd) {
        __modifiedProperties.add("totagcd");
        this._totagcd = totagcd;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング予定数量１（バラ）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public Long getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング予定数量１（バラ）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(Long expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量１（バラ）
     * @return The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public Long getPickedqty1() {
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量１（バラ）
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public void setPickedqty1(Long pickedqty1) {
        __modifiedProperties.add("pickedqty1");
        this._pickedqty1 = pickedqty1;
    }

    /**
     * [get] PALLETTYPE: {NotNull, bigint(19), default=[(0)]} <br>
     * 単品・端数区分
     * @return The value of the column 'PALLETTYPE'. (NullAllowed)
     */
    public Long getPallettype() {
        return _pallettype;
    }

    /**
     * [set] PALLETTYPE: {NotNull, bigint(19), default=[(0)]} <br>
     * 単品・端数区分
     * @param pallettype The value of the column 'PALLETTYPE'. (NullAllowed)
     */
    public void setPallettype(Long pallettype) {
        __modifiedProperties.add("pallettype");
        this._pallettype = pallettype;
    }

    /**
     * [get] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @return The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public Long getSortedqty1() {
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public void setSortedqty1(Long sortedqty1) {
        __modifiedProperties.add("sortedqty1");
        this._sortedqty1 = sortedqty1;
    }

    /**
     * [get] SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 出庫実績数量１（バラ）
     * @return The value of the column 'SHIPPEDQTY1'. (NullAllowed)
     */
    public Long getShippedqty1() {
        return _shippedqty1;
    }

    /**
     * [set] SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 出庫実績数量１（バラ）
     * @param shippedqty1 The value of the column 'SHIPPEDQTY1'. (NullAllowed)
     */
    public void setShippedqty1(Long shippedqty1) {
        __modifiedProperties.add("shippedqty1");
        this._shippedqty1 = shippedqty1;
    }

    /**
     * [get] RCVKEY: {IX+, bigint(19)} <br>
     * クロスドック入庫予定ヘッダID
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public Long getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {IX+, bigint(19)} <br>
     * クロスドック入庫予定ヘッダID
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(Long rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] RCVLINENO: {bigint(19)} <br>
     * クロスドック入庫予定ボディID
     * @return The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public Long getRcvlineno() {
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {bigint(19)} <br>
     * クロスドック入庫予定ボディID
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public void setRcvlineno(Long rcvlineno) {
        __modifiedProperties.add("rcvlineno");
        this._rcvlineno = rcvlineno;
    }

    /**
     * [get] PICKUSERCD: {varchar(30)} <br>
     * ピッキング担当者
     * @return The value of the column 'PICKUSERCD'. (NullAllowed)
     */
    public String getPickusercd() {
        return _pickusercd;
    }

    /**
     * [set] PICKUSERCD: {varchar(30)} <br>
     * ピッキング担当者
     * @param pickusercd The value of the column 'PICKUSERCD'. (NullAllowed)
     */
    public void setPickusercd(String pickusercd) {
        __modifiedProperties.add("pickusercd");
        this._pickusercd = pickusercd;
    }

    /**
     * [get] LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * ロット指定フラグ
     * @return The value of the column 'LOTRESERVEFLG'. (NullAllowed)
     */
    public Long getLotreserveflg() {
        return _lotreserveflg;
    }

    /**
     * [set] LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * ロット指定フラグ
     * @param lotreserveflg The value of the column 'LOTRESERVEFLG'. (NullAllowed)
     */
    public void setLotreserveflg(Long lotreserveflg) {
        __modifiedProperties.add("lotreserveflg");
        this._lotreserveflg = lotreserveflg;
    }

    /**
     * [get] LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * 棚出リスト出力済区分
     * @return The value of the column 'LABELPRINTEDFLG'. (NullAllowed)
     */
    public Long getLabelprintedflg() {
        return _labelprintedflg;
    }

    /**
     * [set] LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * 棚出リスト出力済区分
     * @param labelprintedflg The value of the column 'LABELPRINTEDFLG'. (NullAllowed)
     */
    public void setLabelprintedflg(Long labelprintedflg) {
        __modifiedProperties.add("labelprintedflg");
        this._labelprintedflg = labelprintedflg;
    }

    /**
     * [get] ALLOCSTYLETYPE: {bigint(19)} <br>
     * 引当単位タイプ
     * @return The value of the column 'ALLOCSTYLETYPE'. (NullAllowed)
     */
    public Long getAllocstyletype() {
        return _allocstyletype;
    }

    /**
     * [set] ALLOCSTYLETYPE: {bigint(19)} <br>
     * 引当単位タイプ
     * @param allocstyletype The value of the column 'ALLOCSTYLETYPE'. (NullAllowed)
     */
    public void setAllocstyletype(Long allocstyletype) {
        __modifiedProperties.add("allocstyletype");
        this._allocstyletype = allocstyletype;
    }

    /**
     * [get] FULLPALLETKEY: {bigint(19)} <br>
     * フルパレットキー
     * @return The value of the column 'FULLPALLETKEY'. (NullAllowed)
     */
    public Long getFullpalletkey() {
        return _fullpalletkey;
    }

    /**
     * [set] FULLPALLETKEY: {bigint(19)} <br>
     * フルパレットキー
     * @param fullpalletkey The value of the column 'FULLPALLETKEY'. (NullAllowed)
     */
    public void setFullpalletkey(Long fullpalletkey) {
        __modifiedProperties.add("fullpalletkey");
        this._fullpalletkey = fullpalletkey;
    }

    /**
     * [get] PICKINGUNIT: {bigint(19)} <br>
     * ピッキング単位
     * @return The value of the column 'PICKINGUNIT'. (NullAllowed)
     */
    public Long getPickingunit() {
        return _pickingunit;
    }

    /**
     * [set] PICKINGUNIT: {bigint(19)} <br>
     * ピッキング単位
     * @param pickingunit The value of the column 'PICKINGUNIT'. (NullAllowed)
     */
    public void setPickingunit(Long pickingunit) {
        __modifiedProperties.add("pickingunit");
        this._pickingunit = pickingunit;
    }

    /**
     * [get] WORKALLOCATEID: {IX, bigint(19)} <br>
     * 棚出リストキー
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public Long getWorkallocateid() {
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {IX, bigint(19)} <br>
     * 棚出リストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public void setWorkallocateid(Long workallocateid) {
        __modifiedProperties.add("workallocateid");
        this._workallocateid = workallocateid;
    }

    /**
     * [get] WORKALLOCATENAME: {varchar(100)} <br>
     * 作業割付名称
     * @return The value of the column 'WORKALLOCATENAME'. (NullAllowed)
     */
    public String getWorkallocatename() {
        return _workallocatename;
    }

    /**
     * [set] WORKALLOCATENAME: {varchar(100)} <br>
     * 作業割付名称
     * @param workallocatename The value of the column 'WORKALLOCATENAME'. (NullAllowed)
     */
    public void setWorkallocatename(String workallocatename) {
        __modifiedProperties.add("workallocatename");
        this._workallocatename = workallocatename;
    }

    /**
     * [get] ALERTFLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング不足フラグ
     * @return The value of the column 'ALERTFLG'. (NullAllowed)
     */
    public Long getAlertflg() {
        return _alertflg;
    }

    /**
     * [set] ALERTFLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング不足フラグ
     * @param alertflg The value of the column 'ALERTFLG'. (NullAllowed)
     */
    public void setAlertflg(Long alertflg) {
        __modifiedProperties.add("alertflg");
        this._alertflg = alertflg;
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
