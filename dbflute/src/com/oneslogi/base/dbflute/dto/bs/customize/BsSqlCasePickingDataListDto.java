package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlCasePickingDataList. <br>
 * <pre>
 * [primary-key]
 *     product_id
 *
 * [column]
 *     center_id, case_picking_no, stock_id, product_cd, product_nm, jan_cd, location_cd, location_nm, sum_picking_num, picking_work_no, warehouse_nm, client_cd, client_nm, center_cd, center_nm, warehouse_cd, work_dt, picking_batch_no, zone_picking_order, zone_cd, zone_nm, location_picking_order, limit_dt, lot, store_label_no, store_dt, client_id, stock_type_cd, stock_type_nm, product_id
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlCasePickingDataListDto implements Serializable {

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
    /** center_id: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** case_picking_no: {varchar(30)} */
    @JsonKey
    protected String _casePickingNo;

    /** stock_id: {bigint(19)} */
    @JsonKey
    protected Long _stockId;

    /** product_cd: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** product_nm: {varchar(60)} */
    @JsonKey
    protected String _productNm;

    /** jan_cd: {varchar(30)} */
    @JsonKey
    protected String _janCd;

    /** location_cd: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** location_nm: {varchar(60)} */
    @JsonKey
    protected String _locationNm;

    /** sum_picking_num: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sumPickingNum;

    /** picking_work_no: {varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** warehouse_nm: {varchar(60)} */
    @JsonKey
    protected String _warehouseNm;

    /** client_cd: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** client_nm: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** center_cd: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** center_nm: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** warehouse_cd: {varchar(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** work_dt: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** picking_batch_no: {varchar(30)} */
    @JsonKey
    protected String _pickingBatchNo;

    /** zone_picking_order: {bigint(19)} */
    @JsonKey
    protected Long _zonePickingOrder;

    /** zone_cd: {varchar(30)} */
    @JsonKey
    protected String _zoneCd;

    /** zone_nm: {varchar(60)} */
    @JsonKey
    protected String _zoneNm;

    /** location_picking_order: {bigint(19)} */
    @JsonKey
    protected Long _locationPickingOrder;

    /** limit_dt: {varchar(8)} */
    @JsonKey
    protected String _limitDt;

    /** lot: {varchar(30)} */
    @JsonKey
    protected String _lot;

    /** store_label_no: {varchar(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** store_dt: {varchar(8)} */
    @JsonKey
    protected String _storeDt;

    /** client_id: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** stock_type_cd: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** stock_type_nm: {varchar(100)} */
    @JsonKey
    protected String _stockTypeNm;

    /** product_id: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} */
    @JsonKey
    protected Long _productId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlCasePickingDataListDto() {
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
        if (other == null || !(other instanceof BsSqlCasePickingDataListDto)) { return false; }
        final BsSqlCasePickingDataListDto otherEntity = (BsSqlCasePickingDataListDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlCasePickingDataList");
        result = xCH(result, getProductId());
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
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCasePickingNo());
        sb.append(c).append(getStockId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getSumPickingNum());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getWarehouseNm());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getZonePickingOrder());
        sb.append(c).append(getZoneCd());
        sb.append(c).append(getZoneNm());
        sb.append(c).append(getLocationPickingOrder());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getLot());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getClientId());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getStockTypeNm());
        sb.append(c).append(getProductId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] center_id: {bigint(19)} <br>
     * @return The value of the column 'center_id'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] center_id: {bigint(19)} <br>
     * @param centerId The value of the column 'center_id'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] case_picking_no: {varchar(30)} <br>
     * @return The value of the column 'case_picking_no'. (NullAllowed)
     */
    public String getCasePickingNo() {
        return _casePickingNo;
    }

    /**
     * [set] case_picking_no: {varchar(30)} <br>
     * @param casePickingNo The value of the column 'case_picking_no'. (NullAllowed)
     */
    public void setCasePickingNo(String casePickingNo) {
        __modifiedProperties.add("casePickingNo");
        this._casePickingNo = casePickingNo;
    }

    /**
     * [get] stock_id: {bigint(19)} <br>
     * @return The value of the column 'stock_id'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] stock_id: {bigint(19)} <br>
     * @param stockId The value of the column 'stock_id'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] product_cd: {varchar(100)} <br>
     * @return The value of the column 'product_cd'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] product_cd: {varchar(100)} <br>
     * @param productCd The value of the column 'product_cd'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] product_nm: {varchar(60)} <br>
     * @return The value of the column 'product_nm'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] product_nm: {varchar(60)} <br>
     * @param productNm The value of the column 'product_nm'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] jan_cd: {varchar(30)} <br>
     * @return The value of the column 'jan_cd'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] jan_cd: {varchar(30)} <br>
     * @param janCd The value of the column 'jan_cd'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] location_cd: {varchar(30)} <br>
     * @return The value of the column 'location_cd'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] location_cd: {varchar(30)} <br>
     * @param locationCd The value of the column 'location_cd'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] location_nm: {varchar(60)} <br>
     * @return The value of the column 'location_nm'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] location_nm: {varchar(60)} <br>
     * @param locationNm The value of the column 'location_nm'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] sum_picking_num: {decimal(38, 6)} <br>
     * @return The value of the column 'sum_picking_num'. (NullAllowed)
     */
    public java.math.BigDecimal getSumPickingNum() {
        return _sumPickingNum;
    }

    /**
     * [set] sum_picking_num: {decimal(38, 6)} <br>
     * @param sumPickingNum The value of the column 'sum_picking_num'. (NullAllowed)
     */
    public void setSumPickingNum(java.math.BigDecimal sumPickingNum) {
        __modifiedProperties.add("sumPickingNum");
        this._sumPickingNum = sumPickingNum;
    }

    /**
     * [get] picking_work_no: {varchar(30)} <br>
     * @return The value of the column 'picking_work_no'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] picking_work_no: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'picking_work_no'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] warehouse_nm: {varchar(60)} <br>
     * @return The value of the column 'warehouse_nm'. (NullAllowed)
     */
    public String getWarehouseNm() {
        return _warehouseNm;
    }

    /**
     * [set] warehouse_nm: {varchar(60)} <br>
     * @param warehouseNm The value of the column 'warehouse_nm'. (NullAllowed)
     */
    public void setWarehouseNm(String warehouseNm) {
        __modifiedProperties.add("warehouseNm");
        this._warehouseNm = warehouseNm;
    }

    /**
     * [get] client_cd: {varchar(30)} <br>
     * @return The value of the column 'client_cd'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] client_cd: {varchar(30)} <br>
     * @param clientCd The value of the column 'client_cd'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] client_nm: {varchar(60)} <br>
     * @return The value of the column 'client_nm'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] client_nm: {varchar(60)} <br>
     * @param clientNm The value of the column 'client_nm'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] center_cd: {varchar(30)} <br>
     * @return The value of the column 'center_cd'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] center_cd: {varchar(30)} <br>
     * @param centerCd The value of the column 'center_cd'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] center_nm: {varchar(60)} <br>
     * @return The value of the column 'center_nm'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] center_nm: {varchar(60)} <br>
     * @param centerNm The value of the column 'center_nm'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] warehouse_cd: {varchar(30)} <br>
     * @return The value of the column 'warehouse_cd'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] warehouse_cd: {varchar(30)} <br>
     * @param warehouseCd The value of the column 'warehouse_cd'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] work_dt: {varchar(8)} <br>
     * @return The value of the column 'work_dt'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] work_dt: {varchar(8)} <br>
     * @param workDt The value of the column 'work_dt'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] picking_batch_no: {varchar(30)} <br>
     * @return The value of the column 'picking_batch_no'. (NullAllowed)
     */
    public String getPickingBatchNo() {
        return _pickingBatchNo;
    }

    /**
     * [set] picking_batch_no: {varchar(30)} <br>
     * @param pickingBatchNo The value of the column 'picking_batch_no'. (NullAllowed)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        __modifiedProperties.add("pickingBatchNo");
        this._pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] zone_picking_order: {bigint(19)} <br>
     * @return The value of the column 'zone_picking_order'. (NullAllowed)
     */
    public Long getZonePickingOrder() {
        return _zonePickingOrder;
    }

    /**
     * [set] zone_picking_order: {bigint(19)} <br>
     * @param zonePickingOrder The value of the column 'zone_picking_order'. (NullAllowed)
     */
    public void setZonePickingOrder(Long zonePickingOrder) {
        __modifiedProperties.add("zonePickingOrder");
        this._zonePickingOrder = zonePickingOrder;
    }

    /**
     * [get] zone_cd: {varchar(30)} <br>
     * @return The value of the column 'zone_cd'. (NullAllowed)
     */
    public String getZoneCd() {
        return _zoneCd;
    }

    /**
     * [set] zone_cd: {varchar(30)} <br>
     * @param zoneCd The value of the column 'zone_cd'. (NullAllowed)
     */
    public void setZoneCd(String zoneCd) {
        __modifiedProperties.add("zoneCd");
        this._zoneCd = zoneCd;
    }

    /**
     * [get] zone_nm: {varchar(60)} <br>
     * @return The value of the column 'zone_nm'. (NullAllowed)
     */
    public String getZoneNm() {
        return _zoneNm;
    }

    /**
     * [set] zone_nm: {varchar(60)} <br>
     * @param zoneNm The value of the column 'zone_nm'. (NullAllowed)
     */
    public void setZoneNm(String zoneNm) {
        __modifiedProperties.add("zoneNm");
        this._zoneNm = zoneNm;
    }

    /**
     * [get] location_picking_order: {bigint(19)} <br>
     * @return The value of the column 'location_picking_order'. (NullAllowed)
     */
    public Long getLocationPickingOrder() {
        return _locationPickingOrder;
    }

    /**
     * [set] location_picking_order: {bigint(19)} <br>
     * @param locationPickingOrder The value of the column 'location_picking_order'. (NullAllowed)
     */
    public void setLocationPickingOrder(Long locationPickingOrder) {
        __modifiedProperties.add("locationPickingOrder");
        this._locationPickingOrder = locationPickingOrder;
    }

    /**
     * [get] limit_dt: {varchar(8)} <br>
     * @return The value of the column 'limit_dt'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] limit_dt: {varchar(8)} <br>
     * @param limitDt The value of the column 'limit_dt'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] lot: {varchar(30)} <br>
     * @return The value of the column 'lot'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] lot: {varchar(30)} <br>
     * @param lot The value of the column 'lot'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] store_label_no: {varchar(30)} <br>
     * @return The value of the column 'store_label_no'. (NullAllowed)
     */
    public String getStoreLabelNo() {
        return _storeLabelNo;
    }

    /**
     * [set] store_label_no: {varchar(30)} <br>
     * @param storeLabelNo The value of the column 'store_label_no'. (NullAllowed)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        __modifiedProperties.add("storeLabelNo");
        this._storeLabelNo = storeLabelNo;
    }

    /**
     * [get] store_dt: {varchar(8)} <br>
     * @return The value of the column 'store_dt'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] store_dt: {varchar(8)} <br>
     * @param storeDt The value of the column 'store_dt'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] client_id: {bigint(19)} <br>
     * @return The value of the column 'client_id'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] client_id: {bigint(19)} <br>
     * @param clientId The value of the column 'client_id'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] stock_type_cd: {varchar(30)} <br>
     * @return The value of the column 'stock_type_cd'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] stock_type_cd: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'stock_type_cd'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] stock_type_nm: {varchar(100)} <br>
     * @return The value of the column 'stock_type_nm'. (NullAllowed)
     */
    public String getStockTypeNm() {
        return _stockTypeNm;
    }

    /**
     * [set] stock_type_nm: {varchar(100)} <br>
     * @param stockTypeNm The value of the column 'stock_type_nm'. (NullAllowed)
     */
    public void setStockTypeNm(String stockTypeNm) {
        __modifiedProperties.add("stockTypeNm");
        this._stockTypeNm = stockTypeNm;
    }

    /**
     * [get] product_id: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @return The value of the column 'product_id'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] product_id: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @param productId The value of the column 'product_id'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

}
