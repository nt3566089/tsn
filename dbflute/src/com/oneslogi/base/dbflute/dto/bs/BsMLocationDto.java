package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_LOCATION as TABLE. <br>
 * ロケーションマスタ
 * <pre>
 * [primary-key]
 *     LOCATION_ID
 *
 * [column]
 *     LOCATION_ID, CENTER_ID, ZONE_ID, LOCATION_CD, LOCATION_NM, PICKING_LOCATION_FLG, PICKING_ORDER, LOCATION_TYPE, ALLOC_ORDER, ALLOC_NG_FLG, REPLENISH_PRODUCT_ID, REPLENISH_STOCK_TYPE_ID, REPLENISH_DEPOSIT_ID, REPLENISH_P_NUM, REPLENISH_P_PRODUCT_SHAPE_ID, MAX_STORE_NUM, MAX_STORE_PRODUCT_SHAPE_ID, LocGroup, PALLETECAPACITY, CAPACITY, LINBLK, LOCID, PRODUCT_ID, SPLREVUN, SPLREVCTQA, BSSPLPT, TOSPLMD, PRESPLMD, VIRTUALLOCFLG, RootOutSeq, FLOOR, ZNE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_PRODUCT_SHAPE, M_PRODUCT, M_ZONE, M_STOCK_TYPE, M_CUSTOMER, M_CENTER, B_CLASS_DTL(ByAllocNgFlg)
 *
 * [referrer-table]
 *     T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_MOVE_RECORD_B, T_RECEIVE_PLAN_B, T_SHIPPING_INST_B, T_STOCK, T_STORE_RECORD_B, T_TRPICKDETAIL, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SHIPPING_PICKING
 *
 * [foreign-property]
 *     mProductShapeByMaxStoreProductShapeId, mProduct, mZone, mProductShapeByReplenishPProductShapeId, mStockType, mCustomer, mCenter, bClassDtlByAllocNgFlg, bClassDtlByDelFlg, bClassDtlByLocationType, bClassDtlByPickingLocationFlg
 *
 * [referrer-property]
 *     tAllocInstBList, tInventoryBList, tMoveInstBList, tMoveRecordBList, tReceivePlanBList, tShippingInstBList, tStockList, tStoreRecordBList, tTrpickdetailList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingPickingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMLocationDto implements Serializable {

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
    /** LOCATION_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _locationId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** ZONE_ID: {IX, NotNull, bigint(19), FK to M_ZONE} */
    @JsonKey
    protected Long _zoneId;

    /** LOCATION_CD: {+UQ, IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {varchar(60)} */
    @JsonKey
    protected String _locationNm;

    /** PICKING_LOCATION_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} */
    @JsonKey
    protected String _pickingLocationFlg;

    /** PICKING_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _pickingOrder;

    /** LOCATION_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=LocationType} */
    @JsonKey
    protected String _locationType;

    /** ALLOC_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _allocOrder;

    /** ALLOC_NG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} */
    @JsonKey
    protected String _allocNgFlg;

    /** REPLENISH_PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _replenishProductId;

    /** REPLENISH_STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} */
    @JsonKey
    protected Long _replenishStockTypeId;

    /** REPLENISH_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _replenishDepositId;

    /** REPLENISH_P_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _replenishPNum;

    /** REPLENISH_P_PRODUCT_SHAPE_ID: {IX, bigint(19), FK to M_PRODUCT_SHAPE} */
    @JsonKey
    protected Long _replenishPProductShapeId;

    /** MAX_STORE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _maxStoreNum;

    /** MAX_STORE_PRODUCT_SHAPE_ID: {IX, bigint(19), FK to M_PRODUCT_SHAPE} */
    @JsonKey
    protected Long _maxStoreProductShapeId;

    /** LocGroup: {varchar(30)} */
    @JsonKey
    protected String _locgroup;

    /** PALLETECAPACITY: {bigint(19)} */
    @JsonKey
    protected Long _palletecapacity;

    /** CAPACITY: {bigint(19)} */
    @JsonKey
    protected Long _capacity;

    /** LINBLK: {varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** LOCID: {varchar(30)} */
    @JsonKey
    protected String _locid;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** SPLREVUN: {varchar(30)} */
    @JsonKey
    protected String _splrevun;

    /** SPLREVCTQA: {bigint(19)} */
    @JsonKey
    protected Long _splrevctqa;

    /** BSSPLPT: {varchar(30)} */
    @JsonKey
    protected String _bssplpt;

    /** TOSPLMD: {varchar(30)} */
    @JsonKey
    protected String _tosplmd;

    /** PRESPLMD: {varchar(30)} */
    @JsonKey
    protected String _presplmd;

    /** VIRTUALLOCFLG: {char(1)} */
    @JsonKey
    protected String _virtuallocflg;

    /** RootOutSeq: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rootoutseq;

    /** FLOOR: {varchar(30)} */
    @JsonKey
    protected String _floor;

    /** ZNE: {varchar(30)} */
    @JsonKey
    protected String _zne;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
    public BsMLocationDto() {
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
    protected MProductShapeDto _mProductShapeByMaxStoreProductShapeId;

    public MProductShapeDto getMProductShapeByMaxStoreProductShapeId() {
        return _mProductShapeByMaxStoreProductShapeId;
    }

    public void setMProductShapeByMaxStoreProductShapeId(MProductShapeDto mProductShapeByMaxStoreProductShapeId) {
        this._mProductShapeByMaxStoreProductShapeId = mProductShapeByMaxStoreProductShapeId;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected MZoneDto _mZone;

    public MZoneDto getMZone() {
        return _mZone;
    }

    public void setMZone(MZoneDto mZone) {
        this._mZone = mZone;
    }

    protected MProductShapeDto _mProductShapeByReplenishPProductShapeId;

    public MProductShapeDto getMProductShapeByReplenishPProductShapeId() {
        return _mProductShapeByReplenishPProductShapeId;
    }

    public void setMProductShapeByReplenishPProductShapeId(MProductShapeDto mProductShapeByReplenishPProductShapeId) {
        this._mProductShapeByReplenishPProductShapeId = mProductShapeByReplenishPProductShapeId;
    }

    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected BClassDtlDto _bClassDtlByAllocNgFlg;

    public BClassDtlDto getBClassDtlByAllocNgFlg() {
        return _bClassDtlByAllocNgFlg;
    }

    public void setBClassDtlByAllocNgFlg(BClassDtlDto bClassDtlByAllocNgFlg) {
        this._bClassDtlByAllocNgFlg = bClassDtlByAllocNgFlg;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected BClassDtlDto _bClassDtlByLocationType;

    public BClassDtlDto getBClassDtlByLocationType() {
        return _bClassDtlByLocationType;
    }

    public void setBClassDtlByLocationType(BClassDtlDto bClassDtlByLocationType) {
        this._bClassDtlByLocationType = bClassDtlByLocationType;
    }

    protected BClassDtlDto _bClassDtlByPickingLocationFlg;

    public BClassDtlDto getBClassDtlByPickingLocationFlg() {
        return _bClassDtlByPickingLocationFlg;
    }

    public void setBClassDtlByPickingLocationFlg(BClassDtlDto bClassDtlByPickingLocationFlg) {
        this._bClassDtlByPickingLocationFlg = bClassDtlByPickingLocationFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TAllocInstBDto> _tAllocInstBList;

    public List<TAllocInstBDto> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = new ArrayList<TAllocInstBDto>(); }
        return _tAllocInstBList;
    }

    public void setTAllocInstBList(List<TAllocInstBDto> tAllocInstBList) {
        this._tAllocInstBList = tAllocInstBList;
    }

    protected List<TInventoryBDto> _tInventoryBList;

    public List<TInventoryBDto> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBList;
    }

    public void setTInventoryBList(List<TInventoryBDto> tInventoryBList) {
        this._tInventoryBList = tInventoryBList;
    }

    protected List<TMoveInstBDto> _tMoveInstBList;

    public List<TMoveInstBDto> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBList;
    }

    public void setTMoveInstBList(List<TMoveInstBDto> tMoveInstBList) {
        this._tMoveInstBList = tMoveInstBList;
    }

    protected List<TMoveRecordBDto> _tMoveRecordBList;

    public List<TMoveRecordBDto> getTMoveRecordBList() {
        if (_tMoveRecordBList == null) { _tMoveRecordBList = new ArrayList<TMoveRecordBDto>(); }
        return _tMoveRecordBList;
    }

    public void setTMoveRecordBList(List<TMoveRecordBDto> tMoveRecordBList) {
        this._tMoveRecordBList = tMoveRecordBList;
    }

    protected List<TReceivePlanBDto> _tReceivePlanBList;

    public List<TReceivePlanBDto> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = new ArrayList<TReceivePlanBDto>(); }
        return _tReceivePlanBList;
    }

    public void setTReceivePlanBList(List<TReceivePlanBDto> tReceivePlanBList) {
        this._tReceivePlanBList = tReceivePlanBList;
    }

    protected List<TShippingInstBDto> _tShippingInstBList;

    public List<TShippingInstBDto> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = new ArrayList<TShippingInstBDto>(); }
        return _tShippingInstBList;
    }

    public void setTShippingInstBList(List<TShippingInstBDto> tShippingInstBList) {
        this._tShippingInstBList = tShippingInstBList;
    }

    protected List<TStockDto> _tStockList;

    public List<TStockDto> getTStockList() {
        if (_tStockList == null) { _tStockList = new ArrayList<TStockDto>(); }
        return _tStockList;
    }

    public void setTStockList(List<TStockDto> tStockList) {
        this._tStockList = tStockList;
    }

    protected List<TStoreRecordBDto> _tStoreRecordBList;

    public List<TStoreRecordBDto> getTStoreRecordBList() {
        if (_tStoreRecordBList == null) { _tStoreRecordBList = new ArrayList<TStoreRecordBDto>(); }
        return _tStoreRecordBList;
    }

    public void setTStoreRecordBList(List<TStoreRecordBDto> tStoreRecordBList) {
        this._tStoreRecordBList = tStoreRecordBList;
    }

    protected List<TTrpickdetailDto> _tTrpickdetailList;

    public List<TTrpickdetailDto> getTTrpickdetailList() {
        if (_tTrpickdetailList == null) { _tTrpickdetailList = new ArrayList<TTrpickdetailDto>(); }
        return _tTrpickdetailList;
    }

    public void setTTrpickdetailList(List<TTrpickdetailDto> tTrpickdetailList) {
        this._tTrpickdetailList = tTrpickdetailList;
    }

    protected List<WHtInventoryInputProdDto> _wHtInventoryInputProdList;

    public List<WHtInventoryInputProdDto> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = new ArrayList<WHtInventoryInputProdDto>(); }
        return _wHtInventoryInputProdList;
    }

    public void setWHtInventoryInputProdList(List<WHtInventoryInputProdDto> wHtInventoryInputProdList) {
        this._wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    protected List<WHtReceiveInspectionDto> _wHtReceiveInspectionList;

    public List<WHtReceiveInspectionDto> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = new ArrayList<WHtReceiveInspectionDto>(); }
        return _wHtReceiveInspectionList;
    }

    public void setWHtReceiveInspectionList(List<WHtReceiveInspectionDto> wHtReceiveInspectionList) {
        this._wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    protected List<WHtReceiveNoPlanInspDto> _wHtReceiveNoPlanInspList;

    public List<WHtReceiveNoPlanInspDto> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = new ArrayList<WHtReceiveNoPlanInspDto>(); }
        return _wHtReceiveNoPlanInspList;
    }

    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInspDto> wHtReceiveNoPlanInspList) {
        this._wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    protected List<WHtReceiveStoreDto> _wHtReceiveStoreList;

    public List<WHtReceiveStoreDto> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = new ArrayList<WHtReceiveStoreDto>(); }
        return _wHtReceiveStoreList;
    }

    public void setWHtReceiveStoreList(List<WHtReceiveStoreDto> wHtReceiveStoreList) {
        this._wHtReceiveStoreList = wHtReceiveStoreList;
    }

    protected List<WHtShippingPickingDto> _wHtShippingPickingList;

    public List<WHtShippingPickingDto> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = new ArrayList<WHtShippingPickingDto>(); }
        return _wHtShippingPickingList;
    }

    public void setWHtShippingPickingList(List<WHtShippingPickingDto> wHtShippingPickingList) {
        this._wHtShippingPickingList = wHtShippingPickingList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMLocationDto)) { return false; }
        final BsMLocationDto otherEntity = (BsMLocationDto)other;
        if (!helpComparingValue(getLocationId(), otherEntity.getLocationId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_LOCATION");
        result = xCH(result, getLocationId());
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
        sb.append(c).append(getLocationId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getZoneId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getPickingLocationFlg());
        sb.append(c).append(getPickingOrder());
        sb.append(c).append(getLocationType());
        sb.append(c).append(getAllocOrder());
        sb.append(c).append(getAllocNgFlg());
        sb.append(c).append(getReplenishProductId());
        sb.append(c).append(getReplenishStockTypeId());
        sb.append(c).append(getReplenishDepositId());
        sb.append(c).append(getReplenishPNum());
        sb.append(c).append(getReplenishPProductShapeId());
        sb.append(c).append(getMaxStoreNum());
        sb.append(c).append(getMaxStoreProductShapeId());
        sb.append(c).append(getLocgroup());
        sb.append(c).append(getPalletecapacity());
        sb.append(c).append(getCapacity());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getLocid());
        sb.append(c).append(getProductId());
        sb.append(c).append(getSplrevun());
        sb.append(c).append(getSplrevctqa());
        sb.append(c).append(getBssplpt());
        sb.append(c).append(getTosplmd());
        sb.append(c).append(getPresplmd());
        sb.append(c).append(getVirtuallocflg());
        sb.append(c).append(getRootoutseq());
        sb.append(c).append(getFloor());
        sb.append(c).append(getZne());
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
     * [get] LOCATION_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] ZONE_ID: {IX, NotNull, bigint(19), FK to M_ZONE} <br>
     * ゾーンID
     * @return The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public Long getZoneId() {
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {IX, NotNull, bigint(19), FK to M_ZONE} <br>
     * ゾーンID
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public void setZoneId(Long zoneId) {
        __modifiedProperties.add("zoneId");
        this._zoneId = zoneId;
    }

    /**
     * [get] LOCATION_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {varchar(60)} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {varchar(60)} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] PICKING_LOCATION_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @return The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed)
     */
    public String getPickingLocationFlg() {
        return _pickingLocationFlg;
    }

    /**
     * [set] PICKING_LOCATION_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @param pickingLocationFlg The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed)
     */
    public void setPickingLocationFlg(String pickingLocationFlg) {
        __modifiedProperties.add("pickingLocationFlg");
        this._pickingLocationFlg = pickingLocationFlg;
    }

    /**
     * [get] PICKING_ORDER: {bigint(19)} <br>
     * ピッキング順序
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public Long getPickingOrder() {
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {bigint(19)} <br>
     * ピッキング順序
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public void setPickingOrder(Long pickingOrder) {
        __modifiedProperties.add("pickingOrder");
        this._pickingOrder = pickingOrder;
    }

    /**
     * [get] LOCATION_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public String getLocationType() {
        return _locationType;
    }

    /**
     * [set] LOCATION_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public void setLocationType(String locationType) {
        __modifiedProperties.add("locationType");
        this._locationType = locationType;
    }

    /**
     * [get] ALLOC_ORDER: {bigint(19)} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public Long getAllocOrder() {
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {bigint(19)} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public void setAllocOrder(Long allocOrder) {
        __modifiedProperties.add("allocOrder");
        this._allocOrder = allocOrder;
    }

    /**
     * [get] ALLOC_NG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @return The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public String getAllocNgFlg() {
        return _allocNgFlg;
    }

    /**
     * [set] ALLOC_NG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        __modifiedProperties.add("allocNgFlg");
        this._allocNgFlg = allocNgFlg;
    }

    /**
     * [get] REPLENISH_PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} <br>
     * 補充商品ID
     * @return The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed)
     */
    public Long getReplenishProductId() {
        return _replenishProductId;
    }

    /**
     * [set] REPLENISH_PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} <br>
     * 補充商品ID
     * @param replenishProductId The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed)
     */
    public void setReplenishProductId(Long replenishProductId) {
        __modifiedProperties.add("replenishProductId");
        this._replenishProductId = replenishProductId;
    }

    /**
     * [get] REPLENISH_STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 補充在庫区分ID
     * @return The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getReplenishStockTypeId() {
        return _replenishStockTypeId;
    }

    /**
     * [set] REPLENISH_STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 補充在庫区分ID
     * @param replenishStockTypeId The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setReplenishStockTypeId(Long replenishStockTypeId) {
        __modifiedProperties.add("replenishStockTypeId");
        this._replenishStockTypeId = replenishStockTypeId;
    }

    /**
     * [get] REPLENISH_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 補充預託ID
     * @return The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed)
     */
    public Long getReplenishDepositId() {
        return _replenishDepositId;
    }

    /**
     * [set] REPLENISH_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 補充預託ID
     * @param replenishDepositId The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed)
     */
    public void setReplenishDepositId(Long replenishDepositId) {
        __modifiedProperties.add("replenishDepositId");
        this._replenishDepositId = replenishDepositId;
    }

    /**
     * [get] REPLENISH_P_NUM: {decimal(16, 6)} <br>
     * 補充点
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getReplenishPNum() {
        return _replenishPNum;
    }

    /**
     * [set] REPLENISH_P_NUM: {decimal(16, 6)} <br>
     * 補充点
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public void setReplenishPNum(java.math.BigDecimal replenishPNum) {
        __modifiedProperties.add("replenishPNum");
        this._replenishPNum = replenishPNum;
    }

    /**
     * [get] REPLENISH_P_PRODUCT_SHAPE_ID: {IX, bigint(19), FK to M_PRODUCT_SHAPE} <br>
     * 補充点商品荷姿ID
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getReplenishPProductShapeId() {
        return _replenishPProductShapeId;
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_ID: {IX, bigint(19), FK to M_PRODUCT_SHAPE} <br>
     * 補充点商品荷姿ID
     * @param replenishPProductShapeId The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setReplenishPProductShapeId(Long replenishPProductShapeId) {
        __modifiedProperties.add("replenishPProductShapeId");
        this._replenishPProductShapeId = replenishPProductShapeId;
    }

    /**
     * [get] MAX_STORE_NUM: {decimal(16, 6)} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getMaxStoreNum() {
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {decimal(16, 6)} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public void setMaxStoreNum(java.math.BigDecimal maxStoreNum) {
        __modifiedProperties.add("maxStoreNum");
        this._maxStoreNum = maxStoreNum;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_ID: {IX, bigint(19), FK to M_PRODUCT_SHAPE} <br>
     * 最大格納数商品荷姿ID
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getMaxStoreProductShapeId() {
        return _maxStoreProductShapeId;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_ID: {IX, bigint(19), FK to M_PRODUCT_SHAPE} <br>
     * 最大格納数商品荷姿ID
     * @param maxStoreProductShapeId The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        __modifiedProperties.add("maxStoreProductShapeId");
        this._maxStoreProductShapeId = maxStoreProductShapeId;
    }

    /**
     * [get] LocGroup: {varchar(30)} <br>
     * ロケーショングループ
     * @return The value of the column 'LocGroup'. (NullAllowed)
     */
    public String getLocgroup() {
        return _locgroup;
    }

    /**
     * [set] LocGroup: {varchar(30)} <br>
     * ロケーショングループ
     * @param locgroup The value of the column 'LocGroup'. (NullAllowed)
     */
    public void setLocgroup(String locgroup) {
        __modifiedProperties.add("locgroup");
        this._locgroup = locgroup;
    }

    /**
     * [get] PALLETECAPACITY: {bigint(19)} <br>
     * 許容パレット枚数
     * @return The value of the column 'PALLETECAPACITY'. (NullAllowed)
     */
    public Long getPalletecapacity() {
        return _palletecapacity;
    }

    /**
     * [set] PALLETECAPACITY: {bigint(19)} <br>
     * 許容パレット枚数
     * @param palletecapacity The value of the column 'PALLETECAPACITY'. (NullAllowed)
     */
    public void setPalletecapacity(Long palletecapacity) {
        __modifiedProperties.add("palletecapacity");
        this._palletecapacity = palletecapacity;
    }

    /**
     * [get] CAPACITY: {bigint(19)} <br>
     * 許容個数
     * @return The value of the column 'CAPACITY'. (NullAllowed)
     */
    public Long getCapacity() {
        return _capacity;
    }

    /**
     * [set] CAPACITY: {bigint(19)} <br>
     * 許容個数
     * @param capacity The value of the column 'CAPACITY'. (NullAllowed)
     */
    public void setCapacity(Long capacity) {
        __modifiedProperties.add("capacity");
        this._capacity = capacity;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * ライン/ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed)
     */
    public String getLinblk() {
        return _linblk;
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * ライン/ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed)
     */
    public void setLinblk(String linblk) {
        __modifiedProperties.add("linblk");
        this._linblk = linblk;
    }

    /**
     * [get] LOCID: {varchar(30)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCID'. (NullAllowed)
     */
    public String getLocid() {
        return _locid;
    }

    /**
     * [set] LOCID: {varchar(30)} <br>
     * ロケーション区分
     * @param locid The value of the column 'LOCID'. (NullAllowed)
     */
    public void setLocid(String locid) {
        __modifiedProperties.add("locid");
        this._locid = locid;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] SPLREVUN: {varchar(30)} <br>
     * 補充切り上げ単位
     * @return The value of the column 'SPLREVUN'. (NullAllowed)
     */
    public String getSplrevun() {
        return _splrevun;
    }

    /**
     * [set] SPLREVUN: {varchar(30)} <br>
     * 補充切り上げ単位
     * @param splrevun The value of the column 'SPLREVUN'. (NullAllowed)
     */
    public void setSplrevun(String splrevun) {
        __modifiedProperties.add("splrevun");
        this._splrevun = splrevun;
    }

    /**
     * [get] SPLREVCTQA: {bigint(19)} <br>
     * 補充切り上げカートン
     * @return The value of the column 'SPLREVCTQA'. (NullAllowed)
     */
    public Long getSplrevctqa() {
        return _splrevctqa;
    }

    /**
     * [set] SPLREVCTQA: {bigint(19)} <br>
     * 補充切り上げカートン
     * @param splrevctqa The value of the column 'SPLREVCTQA'. (NullAllowed)
     */
    public void setSplrevctqa(Long splrevctqa) {
        __modifiedProperties.add("splrevctqa");
        this._splrevctqa = splrevctqa;
    }

    /**
     * [get] BSSPLPT: {varchar(30)} <br>
     * 基本補充量
     * @return The value of the column 'BSSPLPT'. (NullAllowed)
     */
    public String getBssplpt() {
        return _bssplpt;
    }

    /**
     * [set] BSSPLPT: {varchar(30)} <br>
     * 基本補充量
     * @param bssplpt The value of the column 'BSSPLPT'. (NullAllowed)
     */
    public void setBssplpt(String bssplpt) {
        __modifiedProperties.add("bssplpt");
        this._bssplpt = bssplpt;
    }

    /**
     * [get] TOSPLMD: {varchar(30)} <br>
     * 当日補充方式
     * @return The value of the column 'TOSPLMD'. (NullAllowed)
     */
    public String getTosplmd() {
        return _tosplmd;
    }

    /**
     * [set] TOSPLMD: {varchar(30)} <br>
     * 当日補充方式
     * @param tosplmd The value of the column 'TOSPLMD'. (NullAllowed)
     */
    public void setTosplmd(String tosplmd) {
        __modifiedProperties.add("tosplmd");
        this._tosplmd = tosplmd;
    }

    /**
     * [get] PRESPLMD: {varchar(30)} <br>
     * 事前補充方式
     * @return The value of the column 'PRESPLMD'. (NullAllowed)
     */
    public String getPresplmd() {
        return _presplmd;
    }

    /**
     * [set] PRESPLMD: {varchar(30)} <br>
     * 事前補充方式
     * @param presplmd The value of the column 'PRESPLMD'. (NullAllowed)
     */
    public void setPresplmd(String presplmd) {
        __modifiedProperties.add("presplmd");
        this._presplmd = presplmd;
    }

    /**
     * [get] VIRTUALLOCFLG: {char(1)} <br>
     * 論理ロケーションフラグ
     * @return The value of the column 'VIRTUALLOCFLG'. (NullAllowed)
     */
    public String getVirtuallocflg() {
        return _virtuallocflg;
    }

    /**
     * [set] VIRTUALLOCFLG: {char(1)} <br>
     * 論理ロケーションフラグ
     * @param virtuallocflg The value of the column 'VIRTUALLOCFLG'. (NullAllowed)
     */
    public void setVirtuallocflg(String virtuallocflg) {
        __modifiedProperties.add("virtuallocflg");
        this._virtuallocflg = virtuallocflg;
    }

    /**
     * [get] RootOutSeq: {decimal(16, 6)} <br>
     * 出庫ルート順
     * @return The value of the column 'RootOutSeq'. (NullAllowed)
     */
    public java.math.BigDecimal getRootoutseq() {
        return _rootoutseq;
    }

    /**
     * [set] RootOutSeq: {decimal(16, 6)} <br>
     * 出庫ルート順
     * @param rootoutseq The value of the column 'RootOutSeq'. (NullAllowed)
     */
    public void setRootoutseq(java.math.BigDecimal rootoutseq) {
        __modifiedProperties.add("rootoutseq");
        this._rootoutseq = rootoutseq;
    }

    /**
     * [get] FLOOR: {varchar(30)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {varchar(30)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] ZNE: {varchar(30)} <br>
     * ゾーン
     * @return The value of the column 'ZNE'. (NullAllowed)
     */
    public String getZne() {
        return _zne;
    }

    /**
     * [set] ZNE: {varchar(30)} <br>
     * ゾーン
     * @param zne The value of the column 'ZNE'. (NullAllowed)
     */
    public void setZne(String zne) {
        __modifiedProperties.add("zne");
        this._zne = zne;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
