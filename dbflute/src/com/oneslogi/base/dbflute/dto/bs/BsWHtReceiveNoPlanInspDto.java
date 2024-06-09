package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of W_HT_RECEIVE_NO_PLAN_INSP as TABLE. <br>
 * 予定無し入荷ワーク
 * <pre>
 * [primary-key]
 *     HT_RECEIVE_NO_PLAN_INSP_ID
 *
 * [column]
 *     HT_RECEIVE_NO_PLAN_INSP_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, WAREHOUSE_ID, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, DEPOSIT_ID, DEPOSIT_NM, PROCESS_TYPE_ID, PROCESS_TYPE_NM, STOCK_TYPE_ID, STOCK_TYPE_NM, CLIENT_RECEIVE_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, PIECE_QTY_RCV, RCV_LOC_ID, RCV_LOC_CD, RCV_LOC_NM, HT_WORK_NO, STORE_NO, LOT_ID, LOT, LIMIT_DT, LABEL_SELECT, WORK_START_DT, WORK_END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_RECEIVE_NO_PLAN_INSP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT, M_CUSTOMER, T_LOT, M_PROCESS_TYPE, M_PRODUCT, M_LOCATION, M_STOCK_TYPE, M_WAREHOUSE
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient, mCustomerByDepositId, tLot, mProcessType, mProduct, mLocation, mStockType, mCustomerBySupplierId, mWarehouse
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWHtReceiveNoPlanInspDto implements Serializable {

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
    /** HT_RECEIVE_NO_PLAN_INSP_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _htReceiveNoPlanInspId;

    /** MAC_ADDRESS: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _macAddress;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} */
    @JsonKey
    protected Long _warehouseId;

    /** PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** JAN_CD: {varchar(30)} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** DEPOSIT_ID: {bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _depositId;

    /** DEPOSIT_NM: {varchar(60)} */
    @JsonKey
    protected String _depositNm;

    /** PROCESS_TYPE_ID: {bigint(19), FK to M_PROCESS_TYPE} */
    @JsonKey
    protected Long _processTypeId;

    /** PROCESS_TYPE_NM: {varchar(60)} */
    @JsonKey
    protected String _processTypeNm;

    /** STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} */
    @JsonKey
    protected Long _stockTypeId;

    /** STOCK_TYPE_NM: {varchar(60)} */
    @JsonKey
    protected String _stockTypeNm;

    /** CLIENT_RECEIVE_NO: {varchar(30)} */
    @JsonKey
    protected String _clientReceiveNo;

    /** SUPPLIER_ID: {bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _supplierId;

    /** SUPPLIER_CD: {varchar(30)} */
    @JsonKey
    protected String _supplierCd;

    /** SUPPLIER_NM: {varchar(60)} */
    @JsonKey
    protected String _supplierNm;

    /** PIECE_QTY_RCV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pieceQtyRcv;

    /** RCV_LOC_ID: {bigint(19), FK to M_LOCATION} */
    @JsonKey
    protected Long _rcvLocId;

    /** RCV_LOC_CD: {varchar(30)} */
    @JsonKey
    protected String _rcvLocCd;

    /** RCV_LOC_NM: {varchar(60)} */
    @JsonKey
    protected String _rcvLocNm;

    /** HT_WORK_NO: {varchar(30)} */
    @JsonKey
    protected String _htWorkNo;

    /** STORE_NO: {varchar(30)} */
    @JsonKey
    protected String _storeNo;

    /** LOT_ID: {bigint(19), FK to T_LOT} */
    @JsonKey
    protected Long _lotId;

    /** LOT: {varchar(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {varchar(8)} */
    @JsonKey
    protected String _limitDt;

    /** LABEL_SELECT: {varchar(30)} */
    @JsonKey
    protected String _labelSelect;

    /** WORK_START_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _workStartDt;

    /** WORK_END_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _workEndDt;

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
    public BsWHtReceiveNoPlanInspDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCustomerDto _mCustomerByDepositId;

    public MCustomerDto getMCustomerByDepositId() {
        return _mCustomerByDepositId;
    }

    public void setMCustomerByDepositId(MCustomerDto mCustomerByDepositId) {
        this._mCustomerByDepositId = mCustomerByDepositId;
    }

    protected TLotDto _tLot;

    public TLotDto getTLot() {
        return _tLot;
    }

    public void setTLot(TLotDto tLot) {
        this._tLot = tLot;
    }

    protected MProcessTypeDto _mProcessType;

    public MProcessTypeDto getMProcessType() {
        return _mProcessType;
    }

    public void setMProcessType(MProcessTypeDto mProcessType) {
        this._mProcessType = mProcessType;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWHtReceiveNoPlanInspDto)) { return false; }
        final BsWHtReceiveNoPlanInspDto otherEntity = (BsWHtReceiveNoPlanInspDto)other;
        if (!helpComparingValue(getHtReceiveNoPlanInspId(), otherEntity.getHtReceiveNoPlanInspId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_HT_RECEIVE_NO_PLAN_INSP");
        result = xCH(result, getHtReceiveNoPlanInspId());
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
        sb.append(c).append(getHtReceiveNoPlanInspId());
        sb.append(c).append(getMacAddress());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getDepositNm());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getProcessTypeNm());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getStockTypeNm());
        sb.append(c).append(getClientReceiveNo());
        sb.append(c).append(getSupplierId());
        sb.append(c).append(getSupplierCd());
        sb.append(c).append(getSupplierNm());
        sb.append(c).append(getPieceQtyRcv());
        sb.append(c).append(getRcvLocId());
        sb.append(c).append(getRcvLocCd());
        sb.append(c).append(getRcvLocNm());
        sb.append(c).append(getHtWorkNo());
        sb.append(c).append(getStoreNo());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getLabelSelect());
        sb.append(c).append(getWorkStartDt());
        sb.append(c).append(getWorkEndDt());
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
     * [get] HT_RECEIVE_NO_PLAN_INSP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 予定無し入荷ワークID
     * @return The value of the column 'HT_RECEIVE_NO_PLAN_INSP_ID'. (NullAllowed)
     */
    public Long getHtReceiveNoPlanInspId() {
        return _htReceiveNoPlanInspId;
    }

    /**
     * [set] HT_RECEIVE_NO_PLAN_INSP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 予定無し入荷ワークID
     * @param htReceiveNoPlanInspId The value of the column 'HT_RECEIVE_NO_PLAN_INSP_ID'. (NullAllowed)
     */
    public void setHtReceiveNoPlanInspId(Long htReceiveNoPlanInspId) {
        __modifiedProperties.add("htReceiveNoPlanInspId");
        this._htReceiveNoPlanInspId = htReceiveNoPlanInspId;
    }

    /**
     * [get] MAC_ADDRESS: {IX, NotNull, varchar(30)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public String getMacAddress() {
        return _macAddress;
    }

    /**
     * [set] MAC_ADDRESS: {IX, NotNull, varchar(30)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public void setMacAddress(String macAddress) {
        __modifiedProperties.add("macAddress");
        this._macAddress = macAddress;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(Long warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] DEPOSIT_ID: {bigint(19), FK to M_CUSTOMER} <br>
     * 預託在庫区分ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public Long getDepositId() {
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {bigint(19), FK to M_CUSTOMER} <br>
     * 預託在庫区分ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public void setDepositId(Long depositId) {
        __modifiedProperties.add("depositId");
        this._depositId = depositId;
    }

    /**
     * [get] DEPOSIT_NM: {varchar(60)} <br>
     * 預託在庫区分名称
     * @return The value of the column 'DEPOSIT_NM'. (NullAllowed)
     */
    public String getDepositNm() {
        return _depositNm;
    }

    /**
     * [set] DEPOSIT_NM: {varchar(60)} <br>
     * 預託在庫区分名称
     * @param depositNm The value of the column 'DEPOSIT_NM'. (NullAllowed)
     */
    public void setDepositNm(String depositNm) {
        __modifiedProperties.add("depositNm");
        this._depositNm = depositNm;
    }

    /**
     * [get] PROCESS_TYPE_ID: {bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] PROCESS_TYPE_NM: {varchar(60)} <br>
     * 処理区分名称
     * @return The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public String getProcessTypeNm() {
        return _processTypeNm;
    }

    /**
     * [set] PROCESS_TYPE_NM: {varchar(60)} <br>
     * 処理区分名称
     * @param processTypeNm The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public void setProcessTypeNm(String processTypeNm) {
        __modifiedProperties.add("processTypeNm");
        this._processTypeNm = processTypeNm;
    }

    /**
     * [get] STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] STOCK_TYPE_NM: {varchar(60)} <br>
     * 在庫区分名称
     * @return The value of the column 'STOCK_TYPE_NM'. (NullAllowed)
     */
    public String getStockTypeNm() {
        return _stockTypeNm;
    }

    /**
     * [set] STOCK_TYPE_NM: {varchar(60)} <br>
     * 在庫区分名称
     * @param stockTypeNm The value of the column 'STOCK_TYPE_NM'. (NullAllowed)
     */
    public void setStockTypeNm(String stockTypeNm) {
        __modifiedProperties.add("stockTypeNm");
        this._stockTypeNm = stockTypeNm;
    }

    /**
     * [get] CLIENT_RECEIVE_NO: {varchar(30)} <br>
     * 顧客入荷指示No.
     * @return The value of the column 'CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public String getClientReceiveNo() {
        return _clientReceiveNo;
    }

    /**
     * [set] CLIENT_RECEIVE_NO: {varchar(30)} <br>
     * 顧客入荷指示No.
     * @param clientReceiveNo The value of the column 'CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public void setClientReceiveNo(String clientReceiveNo) {
        __modifiedProperties.add("clientReceiveNo");
        this._clientReceiveNo = clientReceiveNo;
    }

    /**
     * [get] SUPPLIER_ID: {bigint(19), FK to M_CUSTOMER} <br>
     * 仕入先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public Long getSupplierId() {
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {bigint(19), FK to M_CUSTOMER} <br>
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
     * [get] SUPPLIER_NM: {varchar(60)} <br>
     * 仕入先名称
     * @return The value of the column 'SUPPLIER_NM'. (NullAllowed)
     */
    public String getSupplierNm() {
        return _supplierNm;
    }

    /**
     * [set] SUPPLIER_NM: {varchar(60)} <br>
     * 仕入先名称
     * @param supplierNm The value of the column 'SUPPLIER_NM'. (NullAllowed)
     */
    public void setSupplierNm(String supplierNm) {
        __modifiedProperties.add("supplierNm");
        this._supplierNm = supplierNm;
    }

    /**
     * [get] PIECE_QTY_RCV: {decimal(16, 6)} <br>
     * 入荷検収数量
     * @return The value of the column 'PIECE_QTY_RCV'. (NullAllowed)
     */
    public java.math.BigDecimal getPieceQtyRcv() {
        return _pieceQtyRcv;
    }

    /**
     * [set] PIECE_QTY_RCV: {decimal(16, 6)} <br>
     * 入荷検収数量
     * @param pieceQtyRcv The value of the column 'PIECE_QTY_RCV'. (NullAllowed)
     */
    public void setPieceQtyRcv(java.math.BigDecimal pieceQtyRcv) {
        __modifiedProperties.add("pieceQtyRcv");
        this._pieceQtyRcv = pieceQtyRcv;
    }

    /**
     * [get] RCV_LOC_ID: {bigint(19), FK to M_LOCATION} <br>
     * 入庫ロケーションID
     * @return The value of the column 'RCV_LOC_ID'. (NullAllowed)
     */
    public Long getRcvLocId() {
        return _rcvLocId;
    }

    /**
     * [set] RCV_LOC_ID: {bigint(19), FK to M_LOCATION} <br>
     * 入庫ロケーションID
     * @param rcvLocId The value of the column 'RCV_LOC_ID'. (NullAllowed)
     */
    public void setRcvLocId(Long rcvLocId) {
        __modifiedProperties.add("rcvLocId");
        this._rcvLocId = rcvLocId;
    }

    /**
     * [get] RCV_LOC_CD: {varchar(30)} <br>
     * 入庫ロケーションCD
     * @return The value of the column 'RCV_LOC_CD'. (NullAllowed)
     */
    public String getRcvLocCd() {
        return _rcvLocCd;
    }

    /**
     * [set] RCV_LOC_CD: {varchar(30)} <br>
     * 入庫ロケーションCD
     * @param rcvLocCd The value of the column 'RCV_LOC_CD'. (NullAllowed)
     */
    public void setRcvLocCd(String rcvLocCd) {
        __modifiedProperties.add("rcvLocCd");
        this._rcvLocCd = rcvLocCd;
    }

    /**
     * [get] RCV_LOC_NM: {varchar(60)} <br>
     * 入庫ロケーション名称
     * @return The value of the column 'RCV_LOC_NM'. (NullAllowed)
     */
    public String getRcvLocNm() {
        return _rcvLocNm;
    }

    /**
     * [set] RCV_LOC_NM: {varchar(60)} <br>
     * 入庫ロケーション名称
     * @param rcvLocNm The value of the column 'RCV_LOC_NM'. (NullAllowed)
     */
    public void setRcvLocNm(String rcvLocNm) {
        __modifiedProperties.add("rcvLocNm");
        this._rcvLocNm = rcvLocNm;
    }

    /**
     * [get] HT_WORK_NO: {varchar(30)} <br>
     * ＨＴ作業ＮＯ
     * @return The value of the column 'HT_WORK_NO'. (NullAllowed)
     */
    public String getHtWorkNo() {
        return _htWorkNo;
    }

    /**
     * [set] HT_WORK_NO: {varchar(30)} <br>
     * ＨＴ作業ＮＯ
     * @param htWorkNo The value of the column 'HT_WORK_NO'. (NullAllowed)
     */
    public void setHtWorkNo(String htWorkNo) {
        __modifiedProperties.add("htWorkNo");
        this._htWorkNo = htWorkNo;
    }

    /**
     * [get] STORE_NO: {varchar(30)} <br>
     * 入庫ＮＯ
     * @return The value of the column 'STORE_NO'. (NullAllowed)
     */
    public String getStoreNo() {
        return _storeNo;
    }

    /**
     * [set] STORE_NO: {varchar(30)} <br>
     * 入庫ＮＯ
     * @param storeNo The value of the column 'STORE_NO'. (NullAllowed)
     */
    public void setStoreNo(String storeNo) {
        __modifiedProperties.add("storeNo");
        this._storeNo = storeNo;
    }

    /**
     * [get] LOT_ID: {bigint(19), FK to T_LOT} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19), FK to T_LOT} <br>
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
     * [get] LABEL_SELECT: {varchar(30)} <br>
     * ラベル選択
     * @return The value of the column 'LABEL_SELECT'. (NullAllowed)
     */
    public String getLabelSelect() {
        return _labelSelect;
    }

    /**
     * [set] LABEL_SELECT: {varchar(30)} <br>
     * ラベル選択
     * @param labelSelect The value of the column 'LABEL_SELECT'. (NullAllowed)
     */
    public void setLabelSelect(String labelSelect) {
        __modifiedProperties.add("labelSelect");
        this._labelSelect = labelSelect;
    }

    /**
     * [get] WORK_START_DT: {datetime2(26, 6)} <br>
     * 開始時間
     * @return The value of the column 'WORK_START_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkStartDt() {
        return _workStartDt;
    }

    /**
     * [set] WORK_START_DT: {datetime2(26, 6)} <br>
     * 開始時間
     * @param workStartDt The value of the column 'WORK_START_DT'. (NullAllowed)
     */
    public void setWorkStartDt(java.sql.Timestamp workStartDt) {
        __modifiedProperties.add("workStartDt");
        this._workStartDt = workStartDt;
    }

    /**
     * [get] WORK_END_DT: {datetime2(26, 6)} <br>
     * 終了時間
     * @return The value of the column 'WORK_END_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkEndDt() {
        return _workEndDt;
    }

    /**
     * [set] WORK_END_DT: {datetime2(26, 6)} <br>
     * 終了時間
     * @param workEndDt The value of the column 'WORK_END_DT'. (NullAllowed)
     */
    public void setWorkEndDt(java.sql.Timestamp workEndDt) {
        __modifiedProperties.add("workEndDt");
        this._workEndDt = workEndDt;
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
