package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_INVENTORY_B as TABLE. <br>
 * 棚卸ボディ
 * <pre>
 * [primary-key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_H_ID, STOCK_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_NUM, INPUT_TYPE, STOCK_ADJUST_FLG, MOVE_INST_H_ID, PRODUCT_CD, FIRMTRANSPORT_CD, MANUFACTURE_DT, MANUFACTURE_SYMBOL, FCFLG, DIFFQTY_HENPIN, DIFFQTY_TAXREFOND, SUFFERER_QTY, MONTH_STATUSSU, BLUK_RECIVED_QTY, REFUNDITEM_QTY, INVENTORY_INPUT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CUSTOMER, T_INVENTORY_H, M_LOCATION, T_LOT, T_MOVE_INST_H, M_PRODUCT, M_SHAPE, T_STOCK, M_STOCK_TYPE, T_STORE_NO, M_WAREHOUSE, B_CLASS_DTL(ByInputType), T_INVENTORY_R(AsOne)
 *
 * [referrer-table]
 *     T_INVENTORY_INP_HIST, T_INVENTORY_R
 *
 * [foreign-property]
 *     mCustomerByDepositId, tInventoryH, mLocation, tLot, tMoveInstH, mProduct, mShape, tStock, mStockType, tStoreNo, mCustomerBySupplierId, mWarehouse, bClassDtlByInputType, bClassDtlByStockAdjustFlg, tInventoryRAsOne
 *
 * [referrer-property]
 *     tInventoryInpHistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTInventoryBDto implements Serializable {

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
    /** INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _inventoryBId;

    /** INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} */
    @JsonKey
    protected Long _inventoryHId;

    /** STOCK_ID: {IX, bigint(19), FK to T_STOCK} */
    @JsonKey
    protected Long _stockId;

    /** WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE} */
    @JsonKey
    protected Long _warehouseId;

    /** PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} */
    @JsonKey
    protected Long _stockTypeId;

    /** LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} */
    @JsonKey
    protected Long _locationId;

    /** DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _depositId;

    /** LOT_ID: {IX, bigint(19), FK to T_LOT} */
    @JsonKey
    protected Long _lotId;

    /** LOT: {varchar(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {varchar(8)} */
    @JsonKey
    protected String _limitDt;

    /** STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO} */
    @JsonKey
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {IX, varchar(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    @JsonKey
    protected String _storeDt;

    /** SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _supplierId;

    /** SUPPLIER_CD: {varchar(30)} */
    @JsonKey
    protected String _supplierCd;

    /** SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} */
    @JsonKey
    protected Long _shapeId;

    /** UNIT_NUM: {bigint(19)} */
    @JsonKey
    protected Long _unitNum;

    /** CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum;

    /** ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    /** MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _moveNum;

    /** INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _inventoryNum;

    /** INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} */
    @JsonKey
    protected String _inputType;

    /** STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} */
    @JsonKey
    protected String _stockAdjustFlg;

    /** MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H} */
    @JsonKey
    protected Long _moveInstHId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** FIRMTRANSPORT_CD: {varchar(30)} */
    @JsonKey
    protected String _firmtransportCd;

    /** MANUFACTURE_DT: {varchar(8)} */
    @JsonKey
    protected String _manufactureDt;

    /** MANUFACTURE_SYMBOL: {varchar(30)} */
    @JsonKey
    protected String _manufactureSymbol;

    /** FCFLG: {varchar(30)} */
    @JsonKey
    protected String _fcflg;

    /** DIFFQTY_HENPIN: {bigint(19)} */
    @JsonKey
    protected Long _diffqtyHenpin;

    /** DIFFQTY_TAXREFOND: {bigint(19)} */
    @JsonKey
    protected Long _diffqtyTaxrefond;

    /** SUFFERER_QTY: {bigint(19)} */
    @JsonKey
    protected Long _suffererQty;

    /** MONTH_STATUSSU: {bigint(19)} */
    @JsonKey
    protected Long _monthStatussu;

    /** BLUK_RECIVED_QTY: {bigint(19)} */
    @JsonKey
    protected Long _blukRecivedQty;

    /** REFUNDITEM_QTY: {bigint(19)} */
    @JsonKey
    protected Long _refunditemQty;

    /** INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _inventoryInputFlg;

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
    public BsTInventoryBDto() {
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
    protected MCustomerDto _mCustomerByDepositId;

    public MCustomerDto getMCustomerByDepositId() {
        return _mCustomerByDepositId;
    }

    public void setMCustomerByDepositId(MCustomerDto mCustomerByDepositId) {
        this._mCustomerByDepositId = mCustomerByDepositId;
    }

    protected TInventoryHDto _tInventoryH;

    public TInventoryHDto getTInventoryH() {
        return _tInventoryH;
    }

    public void setTInventoryH(TInventoryHDto tInventoryH) {
        this._tInventoryH = tInventoryH;
    }

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected TLotDto _tLot;

    public TLotDto getTLot() {
        return _tLot;
    }

    public void setTLot(TLotDto tLot) {
        this._tLot = tLot;
    }

    protected TMoveInstHDto _tMoveInstH;

    public TMoveInstHDto getTMoveInstH() {
        return _tMoveInstH;
    }

    public void setTMoveInstH(TMoveInstHDto tMoveInstH) {
        this._tMoveInstH = tMoveInstH;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected MShapeDto _mShape;

    public MShapeDto getMShape() {
        return _mShape;
    }

    public void setMShape(MShapeDto mShape) {
        this._mShape = mShape;
    }

    protected TStockDto _tStock;

    public TStockDto getTStock() {
        return _tStock;
    }

    public void setTStock(TStockDto tStock) {
        this._tStock = tStock;
    }

    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected TStoreNoDto _tStoreNo;

    public TStoreNoDto getTStoreNo() {
        return _tStoreNo;
    }

    public void setTStoreNo(TStoreNoDto tStoreNo) {
        this._tStoreNo = tStoreNo;
    }

    protected MCustomerDto _mCustomerBySupplierId;

    public MCustomerDto getMCustomerBySupplierId() {
        return _mCustomerBySupplierId;
    }

    public void setMCustomerBySupplierId(MCustomerDto mCustomerBySupplierId) {
        this._mCustomerBySupplierId = mCustomerBySupplierId;
    }

    protected MWarehouseDto _mWarehouse;

    public MWarehouseDto getMWarehouse() {
        return _mWarehouse;
    }

    public void setMWarehouse(MWarehouseDto mWarehouse) {
        this._mWarehouse = mWarehouse;
    }

    protected BClassDtlDto _bClassDtlByInputType;

    public BClassDtlDto getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    public void setBClassDtlByInputType(BClassDtlDto bClassDtlByInputType) {
        this._bClassDtlByInputType = bClassDtlByInputType;
    }

    protected BClassDtlDto _bClassDtlByStockAdjustFlg;

    public BClassDtlDto getBClassDtlByStockAdjustFlg() {
        return _bClassDtlByStockAdjustFlg;
    }

    public void setBClassDtlByStockAdjustFlg(BClassDtlDto bClassDtlByStockAdjustFlg) {
        this._bClassDtlByStockAdjustFlg = bClassDtlByStockAdjustFlg;
    }

    protected TInventoryRDto _tInventoryRAsOne;

    public TInventoryRDto getTInventoryRAsOne() {
        return _tInventoryRAsOne;
    }

    public void setTInventoryRAsOne(TInventoryRDto TInventoryRAsOne) {
        this._tInventoryRAsOne = TInventoryRAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TInventoryInpHistDto> _tInventoryInpHistList;

    public List<TInventoryInpHistDto> getTInventoryInpHistList() {
        if (_tInventoryInpHistList == null) { _tInventoryInpHistList = new ArrayList<TInventoryInpHistDto>(); }
        return _tInventoryInpHistList;
    }

    public void setTInventoryInpHistList(List<TInventoryInpHistDto> tInventoryInpHistList) {
        this._tInventoryInpHistList = tInventoryInpHistList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTInventoryBDto)) { return false; }
        final BsTInventoryBDto otherEntity = (BsTInventoryBDto)other;
        if (!helpComparingValue(getInventoryBId(), otherEntity.getInventoryBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_INVENTORY_B");
        result = xCH(result, getInventoryBId());
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
        sb.append(c).append(getInventoryBId());
        sb.append(c).append(getInventoryHId());
        sb.append(c).append(getStockId());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getStoreNoId());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getSupplierId());
        sb.append(c).append(getSupplierCd());
        sb.append(c).append(getShapeId());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getChargeNum());
        sb.append(c).append(getAllocNum());
        sb.append(c).append(getMoveNum());
        sb.append(c).append(getInventoryNum());
        sb.append(c).append(getInputType());
        sb.append(c).append(getStockAdjustFlg());
        sb.append(c).append(getMoveInstHId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getFirmtransportCd());
        sb.append(c).append(getManufactureDt());
        sb.append(c).append(getManufactureSymbol());
        sb.append(c).append(getFcflg());
        sb.append(c).append(getDiffqtyHenpin());
        sb.append(c).append(getDiffqtyTaxrefond());
        sb.append(c).append(getSuffererQty());
        sb.append(c).append(getMonthStatussu());
        sb.append(c).append(getBlukRecivedQty());
        sb.append(c).append(getRefunditemQty());
        sb.append(c).append(getInventoryInputFlg());
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
     * [get] INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        __modifiedProperties.add("inventoryBId");
        this._inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public Long getInventoryHId() {
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public void setInventoryHId(Long inventoryHId) {
        __modifiedProperties.add("inventoryHId");
        this._inventoryHId = inventoryHId;
    }

    /**
     * [get] STOCK_ID: {IX, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(Long warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public Long getDepositId() {
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public void setDepositId(Long depositId) {
        __modifiedProperties.add("depositId");
        this._depositId = depositId;
    }

    /**
     * [get] LOT_ID: {IX, bigint(19), FK to T_LOT} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, bigint(19), FK to T_LOT} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {varchar(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {varchar(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO} <br>
     * 入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (NullAllowed)
     */
    public Long getStoreNoId() {
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO} <br>
     * 入庫No.ID
     * @param storeNoId The value of the column 'STORE_NO_ID'. (NullAllowed)
     */
    public void setStoreNoId(Long storeNoId) {
        __modifiedProperties.add("storeNoId");
        this._storeNoId = storeNoId;
    }

    /**
     * [get] STORE_LABEL_NO: {IX, varchar(30)} <br>
     * 入庫ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public String getStoreLabelNo() {
        return _storeLabelNo;
    }

    /**
     * [set] STORE_LABEL_NO: {IX, varchar(30)} <br>
     * 入庫ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        __modifiedProperties.add("storeLabelNo");
        this._storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] STORE_DT: {varchar(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 仕入先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public Long getSupplierId() {
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 仕入先ID
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public void setSupplierId(Long supplierId) {
        __modifiedProperties.add("supplierId");
        this._supplierId = supplierId;
    }

    /**
     * [get] SUPPLIER_CD: {varchar(30)} <br>
     * 仕入先CD
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public String getSupplierCd() {
        return _supplierCd;
    }

    /**
     * [set] SUPPLIER_CD: {varchar(30)} <br>
     * 仕入先CD
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public void setSupplierCd(String supplierCd) {
        __modifiedProperties.add("supplierCd");
        this._supplierCd = supplierCd;
    }

    /**
     * [get] SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public Long getShapeId() {
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public void setShapeId(Long shapeId) {
        __modifiedProperties.add("shapeId");
        this._shapeId = shapeId;
    }

    /**
     * [get] UNIT_NUM: {bigint(19)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public Long getUnitNum() {
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {bigint(19)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public void setUnitNum(Long unitNum) {
        __modifiedProperties.add("unitNum");
        this._unitNum = unitNum;
    }

    /**
     * [get] CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当可能数
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum() {
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当可能数
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        __modifiedProperties.add("chargeNum");
        this._chargeNum = chargeNum;
    }

    /**
     * [get] ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当済数
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum() {
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当済数
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        __modifiedProperties.add("allocNum");
        this._allocNum = allocNum;
    }

    /**
     * [get] MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 移動中数
     * @return The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNum() {
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 移動中数
     * @param moveNum The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        __modifiedProperties.add("moveNum");
        this._moveNum = moveNum;
    }

    /**
     * [get] INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 棚卸数
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInventoryNum() {
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 棚卸数
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        __modifiedProperties.add("inventoryNum");
        this._inventoryNum = inventoryNum;
    }

    /**
     * [get] INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * [set] INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public void setInputType(String inputType) {
        __modifiedProperties.add("inputType");
        this._inputType = inputType;
    }

    /**
     * [get] STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @return The value of the column 'STOCK_ADJUST_FLG'. (NullAllowed)
     */
    public String getStockAdjustFlg() {
        return _stockAdjustFlg;
    }

    /**
     * [set] STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param stockAdjustFlg The value of the column 'STOCK_ADJUST_FLG'. (NullAllowed)
     */
    public void setStockAdjustFlg(String stockAdjustFlg) {
        __modifiedProperties.add("stockAdjustFlg");
        this._stockAdjustFlg = stockAdjustFlg;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public Long getMoveInstHId() {
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public void setMoveInstHId(Long moveInstHId) {
        __modifiedProperties.add("moveInstHId");
        this._moveInstHId = moveInstHId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] FIRMTRANSPORT_CD: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMTRANSPORT_CD'. (NullAllowed)
     */
    public String getFirmtransportCd() {
        return _firmtransportCd;
    }

    /**
     * [set] FIRMTRANSPORT_CD: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmtransportCd The value of the column 'FIRMTRANSPORT_CD'. (NullAllowed)
     */
    public void setFirmtransportCd(String firmtransportCd) {
        __modifiedProperties.add("firmtransportCd");
        this._firmtransportCd = firmtransportCd;
    }

    /**
     * [get] MANUFACTURE_DT: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DT'. (NullAllowed)
     */
    public String getManufactureDt() {
        return _manufactureDt;
    }

    /**
     * [set] MANUFACTURE_DT: {varchar(8)} <br>
     * 製造年月日
     * @param manufactureDt The value of the column 'MANUFACTURE_DT'. (NullAllowed)
     */
    public void setManufactureDt(String manufactureDt) {
        __modifiedProperties.add("manufactureDt");
        this._manufactureDt = manufactureDt;
    }

    /**
     * [get] MANUFACTURE_SYMBOL: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURE_SYMBOL'. (NullAllowed)
     */
    public String getManufactureSymbol() {
        return _manufactureSymbol;
    }

    /**
     * [set] MANUFACTURE_SYMBOL: {varchar(30)} <br>
     * 製造記号
     * @param manufactureSymbol The value of the column 'MANUFACTURE_SYMBOL'. (NullAllowed)
     */
    public void setManufactureSymbol(String manufactureSymbol) {
        __modifiedProperties.add("manufactureSymbol");
        this._manufactureSymbol = manufactureSymbol;
    }

    /**
     * [get] FCFLG: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'FCFLG'. (NullAllowed)
     */
    public String getFcflg() {
        return _fcflg;
    }

    /**
     * [set] FCFLG: {varchar(30)} <br>
     * 内外区分
     * @param fcflg The value of the column 'FCFLG'. (NullAllowed)
     */
    public void setFcflg(String fcflg) {
        __modifiedProperties.add("fcflg");
        this._fcflg = fcflg;
    }

    /**
     * [get] DIFFQTY_HENPIN: {bigint(19)} <br>
     * 累計過不足数_返品
     * @return The value of the column 'DIFFQTY_HENPIN'. (NullAllowed)
     */
    public Long getDiffqtyHenpin() {
        return _diffqtyHenpin;
    }

    /**
     * [set] DIFFQTY_HENPIN: {bigint(19)} <br>
     * 累計過不足数_返品
     * @param diffqtyHenpin The value of the column 'DIFFQTY_HENPIN'. (NullAllowed)
     */
    public void setDiffqtyHenpin(Long diffqtyHenpin) {
        __modifiedProperties.add("diffqtyHenpin");
        this._diffqtyHenpin = diffqtyHenpin;
    }

    /**
     * [get] DIFFQTY_TAXREFOND: {bigint(19)} <br>
     * 累計過不足数_国税還付品
     * @return The value of the column 'DIFFQTY_TAXREFOND'. (NullAllowed)
     */
    public Long getDiffqtyTaxrefond() {
        return _diffqtyTaxrefond;
    }

    /**
     * [set] DIFFQTY_TAXREFOND: {bigint(19)} <br>
     * 累計過不足数_国税還付品
     * @param diffqtyTaxrefond The value of the column 'DIFFQTY_TAXREFOND'. (NullAllowed)
     */
    public void setDiffqtyTaxrefond(Long diffqtyTaxrefond) {
        __modifiedProperties.add("diffqtyTaxrefond");
        this._diffqtyTaxrefond = diffqtyTaxrefond;
    }

    /**
     * [get] SUFFERER_QTY: {bigint(19)} <br>
     * り災品
     * @return The value of the column 'SUFFERER_QTY'. (NullAllowed)
     */
    public Long getSuffererQty() {
        return _suffererQty;
    }

    /**
     * [set] SUFFERER_QTY: {bigint(19)} <br>
     * り災品
     * @param suffererQty The value of the column 'SUFFERER_QTY'. (NullAllowed)
     */
    public void setSuffererQty(Long suffererQty) {
        __modifiedProperties.add("suffererQty");
        this._suffererQty = suffererQty;
    }

    /**
     * [get] MONTH_STATUSSU: {bigint(19)} <br>
     * 不適品ラベル作成個装数
     * @return The value of the column 'MONTH_STATUSSU'. (NullAllowed)
     */
    public Long getMonthStatussu() {
        return _monthStatussu;
    }

    /**
     * [set] MONTH_STATUSSU: {bigint(19)} <br>
     * 不適品ラベル作成個装数
     * @param monthStatussu The value of the column 'MONTH_STATUSSU'. (NullAllowed)
     */
    public void setMonthStatussu(Long monthStatussu) {
        __modifiedProperties.add("monthStatussu");
        this._monthStatussu = monthStatussu;
    }

    /**
     * [get] BLUK_RECIVED_QTY: {bigint(19)} <br>
     * 一括登録個装数
     * @return The value of the column 'BLUK_RECIVED_QTY'. (NullAllowed)
     */
    public Long getBlukRecivedQty() {
        return _blukRecivedQty;
    }

    /**
     * [set] BLUK_RECIVED_QTY: {bigint(19)} <br>
     * 一括登録個装数
     * @param blukRecivedQty The value of the column 'BLUK_RECIVED_QTY'. (NullAllowed)
     */
    public void setBlukRecivedQty(Long blukRecivedQty) {
        __modifiedProperties.add("blukRecivedQty");
        this._blukRecivedQty = blukRecivedQty;
    }

    /**
     * [get] REFUNDITEM_QTY: {bigint(19)} <br>
     * 国税還付品数
     * @return The value of the column 'REFUNDITEM_QTY'. (NullAllowed)
     */
    public Long getRefunditemQty() {
        return _refunditemQty;
    }

    /**
     * [set] REFUNDITEM_QTY: {bigint(19)} <br>
     * 国税還付品数
     * @param refunditemQty The value of the column 'REFUNDITEM_QTY'. (NullAllowed)
     */
    public void setRefunditemQty(Long refunditemQty) {
        __modifiedProperties.add("refunditemQty");
        this._refunditemQty = refunditemQty;
    }

    /**
     * [get] INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]} <br>
     * 入力フラグ
     * @return The value of the column 'INVENTORY_INPUT_FLG'. (NullAllowed)
     */
    public String getInventoryInputFlg() {
        return _inventoryInputFlg;
    }

    /**
     * [set] INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]} <br>
     * 入力フラグ
     * @param inventoryInputFlg The value of the column 'INVENTORY_INPUT_FLG'. (NullAllowed)
     */
    public void setInventoryInputFlg(String inventoryInputFlg) {
        __modifiedProperties.add("inventoryInputFlg");
        this._inventoryInputFlg = inventoryInputFlg;
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
