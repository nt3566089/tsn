package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_LOCATION as TABLE. <br>
 * ロケーションマスタ受信
 * <pre>
 * [primary-key]
 *     LOCATION_ID
 *
 * [column]
 *     LOCATION_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_CD, LOCATION_CD, LOCATION_NM, WAREHOUSE_CD, ZONE_CD, LOCATION_TYPE, PICKING_LOCATION_FLG, ALLOC_NG_FLG, PICKING_ORDER, ALLOC_ORDER, CLIENT_CD, REPLENISH_PRODUCT_CD, REPLENISH_STOCK_TYPE_CD, REPLENISH_DEPOSIT_CD, REPLENISH_P_NUM, REPLENISH_P_PRODUCT_SHAPE_CD, MAX_STORE_NUM, MAX_STORE_PRODUCT_SHAPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsELocationDto implements Serializable {

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

    /** RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** CENTER_CD: {varchar(255)} */
    @JsonKey
    protected String _centerCd;

    /** LOCATION_CD: {varchar(255)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {varchar(255)} */
    @JsonKey
    protected String _locationNm;

    /** WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _warehouseCd;

    /** ZONE_CD: {varchar(255)} */
    @JsonKey
    protected String _zoneCd;

    /** LOCATION_TYPE: {varchar(255)} */
    @JsonKey
    protected String _locationType;

    /** PICKING_LOCATION_FLG: {varchar(255), default=[1]} */
    @JsonKey
    protected String _pickingLocationFlg;

    /** ALLOC_NG_FLG: {varchar(255), default=[0]} */
    @JsonKey
    protected String _allocNgFlg;

    /** PICKING_ORDER: {varchar(255)} */
    @JsonKey
    protected String _pickingOrder;

    /** ALLOC_ORDER: {varchar(255)} */
    @JsonKey
    protected String _allocOrder;

    /** CLIENT_CD: {varchar(255)} */
    @JsonKey
    protected String _clientCd;

    /** REPLENISH_PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _replenishProductCd;

    /** REPLENISH_STOCK_TYPE_CD: {varchar(255)} */
    @JsonKey
    protected String _replenishStockTypeCd;

    /** REPLENISH_DEPOSIT_CD: {varchar(255)} */
    @JsonKey
    protected String _replenishDepositCd;

    /** REPLENISH_P_NUM: {varchar(255)} */
    @JsonKey
    protected String _replenishPNum;

    /** REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)} */
    @JsonKey
    protected String _replenishPProductShapeCd;

    /** MAX_STORE_NUM: {varchar(255)} */
    @JsonKey
    protected String _maxStoreNum;

    /** MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)} */
    @JsonKey
    protected String _maxStoreProductShapeCd;

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
    public BsELocationDto() {
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
        if (other == null || !(other instanceof BsELocationDto)) { return false; }
        final BsELocationDto otherEntity = (BsELocationDto)other;
        if (!helpComparingValue(getLocationId(), otherEntity.getLocationId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_LOCATION");
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
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getZoneCd());
        sb.append(c).append(getLocationType());
        sb.append(c).append(getPickingLocationFlg());
        sb.append(c).append(getAllocNgFlg());
        sb.append(c).append(getPickingOrder());
        sb.append(c).append(getAllocOrder());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getReplenishProductCd());
        sb.append(c).append(getReplenishStockTypeCd());
        sb.append(c).append(getReplenishDepositCd());
        sb.append(c).append(getReplenishPNum());
        sb.append(c).append(getReplenishPProductShapeCd());
        sb.append(c).append(getMaxStoreNum());
        sb.append(c).append(getMaxStoreProductShapeCd());
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
     * ロケーションマスタ受信ID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロケーションマスタ受信ID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] LOCATION_CD: {varchar(255)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(255)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {varchar(255)} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {varchar(255)} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] ZONE_CD: {varchar(255)} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public String getZoneCd() {
        return _zoneCd;
    }

    /**
     * [set] ZONE_CD: {varchar(255)} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public void setZoneCd(String zoneCd) {
        __modifiedProperties.add("zoneCd");
        this._zoneCd = zoneCd;
    }

    /**
     * [get] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション種別
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public String getLocationType() {
        return _locationType;
    }

    /**
     * [set] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション種別
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public void setLocationType(String locationType) {
        __modifiedProperties.add("locationType");
        this._locationType = locationType;
    }

    /**
     * [get] PICKING_LOCATION_FLG: {varchar(255), default=[1]} <br>
     * ピックロケフラグ
     * @return The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed)
     */
    public String getPickingLocationFlg() {
        return _pickingLocationFlg;
    }

    /**
     * [set] PICKING_LOCATION_FLG: {varchar(255), default=[1]} <br>
     * ピックロケフラグ
     * @param pickingLocationFlg The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed)
     */
    public void setPickingLocationFlg(String pickingLocationFlg) {
        __modifiedProperties.add("pickingLocationFlg");
        this._pickingLocationFlg = pickingLocationFlg;
    }

    /**
     * [get] ALLOC_NG_FLG: {varchar(255), default=[0]} <br>
     * 引当禁止フラグ
     * @return The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public String getAllocNgFlg() {
        return _allocNgFlg;
    }

    /**
     * [set] ALLOC_NG_FLG: {varchar(255), default=[0]} <br>
     * 引当禁止フラグ
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        __modifiedProperties.add("allocNgFlg");
        this._allocNgFlg = allocNgFlg;
    }

    /**
     * [get] PICKING_ORDER: {varchar(255)} <br>
     * ピッキング順序
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public String getPickingOrder() {
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {varchar(255)} <br>
     * ピッキング順序
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public void setPickingOrder(String pickingOrder) {
        __modifiedProperties.add("pickingOrder");
        this._pickingOrder = pickingOrder;
    }

    /**
     * [get] ALLOC_ORDER: {varchar(255)} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public String getAllocOrder() {
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {varchar(255)} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public void setAllocOrder(String allocOrder) {
        __modifiedProperties.add("allocOrder");
        this._allocOrder = allocOrder;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] REPLENISH_PRODUCT_CD: {varchar(255)} <br>
     * 補充商品CD
     * @return The value of the column 'REPLENISH_PRODUCT_CD'. (NullAllowed)
     */
    public String getReplenishProductCd() {
        return _replenishProductCd;
    }

    /**
     * [set] REPLENISH_PRODUCT_CD: {varchar(255)} <br>
     * 補充商品CD
     * @param replenishProductCd The value of the column 'REPLENISH_PRODUCT_CD'. (NullAllowed)
     */
    public void setReplenishProductCd(String replenishProductCd) {
        __modifiedProperties.add("replenishProductCd");
        this._replenishProductCd = replenishProductCd;
    }

    /**
     * [get] REPLENISH_STOCK_TYPE_CD: {varchar(255)} <br>
     * 補充在庫区分CD
     * @return The value of the column 'REPLENISH_STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getReplenishStockTypeCd() {
        return _replenishStockTypeCd;
    }

    /**
     * [set] REPLENISH_STOCK_TYPE_CD: {varchar(255)} <br>
     * 補充在庫区分CD
     * @param replenishStockTypeCd The value of the column 'REPLENISH_STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setReplenishStockTypeCd(String replenishStockTypeCd) {
        __modifiedProperties.add("replenishStockTypeCd");
        this._replenishStockTypeCd = replenishStockTypeCd;
    }

    /**
     * [get] REPLENISH_DEPOSIT_CD: {varchar(255)} <br>
     * 補充預託CD
     * @return The value of the column 'REPLENISH_DEPOSIT_CD'. (NullAllowed)
     */
    public String getReplenishDepositCd() {
        return _replenishDepositCd;
    }

    /**
     * [set] REPLENISH_DEPOSIT_CD: {varchar(255)} <br>
     * 補充預託CD
     * @param replenishDepositCd The value of the column 'REPLENISH_DEPOSIT_CD'. (NullAllowed)
     */
    public void setReplenishDepositCd(String replenishDepositCd) {
        __modifiedProperties.add("replenishDepositCd");
        this._replenishDepositCd = replenishDepositCd;
    }

    /**
     * [get] REPLENISH_P_NUM: {varchar(255)} <br>
     * 補充点
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public String getReplenishPNum() {
        return _replenishPNum;
    }

    /**
     * [set] REPLENISH_P_NUM: {varchar(255)} <br>
     * 補充点
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public void setReplenishPNum(String replenishPNum) {
        __modifiedProperties.add("replenishPNum");
        this._replenishPNum = replenishPNum;
    }

    /**
     * [get] REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)} <br>
     * 補充点商品荷姿CD
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_CD'. (NullAllowed)
     */
    public String getReplenishPProductShapeCd() {
        return _replenishPProductShapeCd;
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)} <br>
     * 補充点商品荷姿CD
     * @param replenishPProductShapeCd The value of the column 'REPLENISH_P_PRODUCT_SHAPE_CD'. (NullAllowed)
     */
    public void setReplenishPProductShapeCd(String replenishPProductShapeCd) {
        __modifiedProperties.add("replenishPProductShapeCd");
        this._replenishPProductShapeCd = replenishPProductShapeCd;
    }

    /**
     * [get] MAX_STORE_NUM: {varchar(255)} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public String getMaxStoreNum() {
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {varchar(255)} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public void setMaxStoreNum(String maxStoreNum) {
        __modifiedProperties.add("maxStoreNum");
        this._maxStoreNum = maxStoreNum;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)} <br>
     * 最大格納数商品荷姿CD
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_CD'. (NullAllowed)
     */
    public String getMaxStoreProductShapeCd() {
        return _maxStoreProductShapeCd;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)} <br>
     * 最大格納数商品荷姿CD
     * @param maxStoreProductShapeCd The value of the column 'MAX_STORE_PRODUCT_SHAPE_CD'. (NullAllowed)
     */
    public void setMaxStoreProductShapeCd(String maxStoreProductShapeCd) {
        __modifiedProperties.add("maxStoreProductShapeCd");
        this._maxStoreProductShapeCd = maxStoreProductShapeCd;
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
