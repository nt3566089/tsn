package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlOrderPickingDataList. <br>
 * <pre>
 * [primary-key]
 *     product_id
 *
 * [column]
 *     center_id, shipping_packing_no, stock_id, box_cd, box_nm, product_cd, product_nm, jan_cd, location_cd, location_nm, picking_num, picking_work_no, client_cd, client_nm, center_cd, center_nm, warehouse_cd, warehouse_abbr, work_dt, deliv_dt, delivery_course_cd, delivery_course_nm, carrier_cd, carrier_nm, supply_customer_cd, supply_customer_nm, picking_batch_no, client_shipping_no, wms_shipping_slip_no, picking_work_message, zone_picking_order, zone_cd, zone_nm, location_picking_order, limit_dt, lot, store_label_no, store_dt, client_id, stock_type_cd, stock_type_nm, charge_num, product_id
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
public abstract class BsSqlOrderPickingDataListDto implements Serializable {

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

    /** shipping_packing_no: {varchar(30)} */
    @JsonKey
    protected String _shippingPackingNo;

    /** stock_id: {bigint(19)} */
    @JsonKey
    protected Long _stockId;

    /** box_cd: {varchar(30)} */
    @JsonKey
    protected String _boxCd;

    /** box_nm: {varchar(60)} */
    @JsonKey
    protected String _boxNm;

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

    /** picking_num: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pickingNum;

    /** picking_work_no: {varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

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

    /** warehouse_abbr: {varchar(60)} */
    @JsonKey
    protected String _warehouseAbbr;

    /** work_dt: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** deliv_dt: {varchar(8)} */
    @JsonKey
    protected String _delivDt;

    /** delivery_course_cd: {varchar(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** delivery_course_nm: {varchar(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** carrier_cd: {varchar(30)} */
    @JsonKey
    protected String _carrierCd;

    /** carrier_nm: {varchar(60)} */
    @JsonKey
    protected String _carrierNm;

    /** supply_customer_cd: {varchar(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** supply_customer_nm: {varchar(60)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** picking_batch_no: {varchar(30)} */
    @JsonKey
    protected String _pickingBatchNo;

    /** client_shipping_no: {varchar(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** wms_shipping_slip_no: {varchar(30)} */
    @JsonKey
    protected String _wmsShippingSlipNo;

    /** picking_work_message: {varchar(255)} */
    @JsonKey
    protected String _pickingWorkMessage;

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

    /** charge_num: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum;

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
    public BsSqlOrderPickingDataListDto() {
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
        if (other == null || !(other instanceof BsSqlOrderPickingDataListDto)) { return false; }
        final BsSqlOrderPickingDataListDto otherEntity = (BsSqlOrderPickingDataListDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlOrderPickingDataList");
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
        sb.append(c).append(getShippingPackingNo());
        sb.append(c).append(getStockId());
        sb.append(c).append(getBoxCd());
        sb.append(c).append(getBoxNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getPickingNum());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getWarehouseAbbr());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getWmsShippingSlipNo());
        sb.append(c).append(getPickingWorkMessage());
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
        sb.append(c).append(getChargeNum());
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
     * [get] shipping_packing_no: {varchar(30)} <br>
     * @return The value of the column 'shipping_packing_no'. (NullAllowed)
     */
    public String getShippingPackingNo() {
        return _shippingPackingNo;
    }

    /**
     * [set] shipping_packing_no: {varchar(30)} <br>
     * @param shippingPackingNo The value of the column 'shipping_packing_no'. (NullAllowed)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        __modifiedProperties.add("shippingPackingNo");
        this._shippingPackingNo = shippingPackingNo;
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
     * [get] box_cd: {varchar(30)} <br>
     * @return The value of the column 'box_cd'. (NullAllowed)
     */
    public String getBoxCd() {
        return _boxCd;
    }

    /**
     * [set] box_cd: {varchar(30)} <br>
     * @param boxCd The value of the column 'box_cd'. (NullAllowed)
     */
    public void setBoxCd(String boxCd) {
        __modifiedProperties.add("boxCd");
        this._boxCd = boxCd;
    }

    /**
     * [get] box_nm: {varchar(60)} <br>
     * @return The value of the column 'box_nm'. (NullAllowed)
     */
    public String getBoxNm() {
        return _boxNm;
    }

    /**
     * [set] box_nm: {varchar(60)} <br>
     * @param boxNm The value of the column 'box_nm'. (NullAllowed)
     */
    public void setBoxNm(String boxNm) {
        __modifiedProperties.add("boxNm");
        this._boxNm = boxNm;
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
     * [get] picking_num: {decimal(38, 6)} <br>
     * @return The value of the column 'picking_num'. (NullAllowed)
     */
    public java.math.BigDecimal getPickingNum() {
        return _pickingNum;
    }

    /**
     * [set] picking_num: {decimal(38, 6)} <br>
     * @param pickingNum The value of the column 'picking_num'. (NullAllowed)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        __modifiedProperties.add("pickingNum");
        this._pickingNum = pickingNum;
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
     * [get] warehouse_abbr: {varchar(60)} <br>
     * @return The value of the column 'warehouse_abbr'. (NullAllowed)
     */
    public String getWarehouseAbbr() {
        return _warehouseAbbr;
    }

    /**
     * [set] warehouse_abbr: {varchar(60)} <br>
     * @param warehouseAbbr The value of the column 'warehouse_abbr'. (NullAllowed)
     */
    public void setWarehouseAbbr(String warehouseAbbr) {
        __modifiedProperties.add("warehouseAbbr");
        this._warehouseAbbr = warehouseAbbr;
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
     * [get] deliv_dt: {varchar(8)} <br>
     * @return The value of the column 'deliv_dt'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] deliv_dt: {varchar(8)} <br>
     * @param delivDt The value of the column 'deliv_dt'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] delivery_course_cd: {varchar(30)} <br>
     * @return The value of the column 'delivery_course_cd'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] delivery_course_cd: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'delivery_course_cd'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] delivery_course_nm: {varchar(60)} <br>
     * @return The value of the column 'delivery_course_nm'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] delivery_course_nm: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'delivery_course_nm'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] carrier_cd: {varchar(30)} <br>
     * @return The value of the column 'carrier_cd'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] carrier_cd: {varchar(30)} <br>
     * @param carrierCd The value of the column 'carrier_cd'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] carrier_nm: {varchar(60)} <br>
     * @return The value of the column 'carrier_nm'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] carrier_nm: {varchar(60)} <br>
     * @param carrierNm The value of the column 'carrier_nm'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] supply_customer_cd: {varchar(30)} <br>
     * @return The value of the column 'supply_customer_cd'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] supply_customer_cd: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'supply_customer_cd'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] supply_customer_nm: {varchar(60)} <br>
     * @return The value of the column 'supply_customer_nm'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] supply_customer_nm: {varchar(60)} <br>
     * @param supplyCustomerNm The value of the column 'supply_customer_nm'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
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
     * [get] client_shipping_no: {varchar(30)} <br>
     * @return The value of the column 'client_shipping_no'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] client_shipping_no: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'client_shipping_no'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
    }

    /**
     * [get] wms_shipping_slip_no: {varchar(30)} <br>
     * @return The value of the column 'wms_shipping_slip_no'. (NullAllowed)
     */
    public String getWmsShippingSlipNo() {
        return _wmsShippingSlipNo;
    }

    /**
     * [set] wms_shipping_slip_no: {varchar(30)} <br>
     * @param wmsShippingSlipNo The value of the column 'wms_shipping_slip_no'. (NullAllowed)
     */
    public void setWmsShippingSlipNo(String wmsShippingSlipNo) {
        __modifiedProperties.add("wmsShippingSlipNo");
        this._wmsShippingSlipNo = wmsShippingSlipNo;
    }

    /**
     * [get] picking_work_message: {varchar(255)} <br>
     * @return The value of the column 'picking_work_message'. (NullAllowed)
     */
    public String getPickingWorkMessage() {
        return _pickingWorkMessage;
    }

    /**
     * [set] picking_work_message: {varchar(255)} <br>
     * @param pickingWorkMessage The value of the column 'picking_work_message'. (NullAllowed)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        __modifiedProperties.add("pickingWorkMessage");
        this._pickingWorkMessage = pickingWorkMessage;
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
     * [get] charge_num: {decimal(16, 6)} <br>
     * @return The value of the column 'charge_num'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum() {
        return _chargeNum;
    }

    /**
     * [set] charge_num: {decimal(16, 6)} <br>
     * @param chargeNum The value of the column 'charge_num'. (NullAllowed)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        __modifiedProperties.add("chargeNum");
        this._chargeNum = chargeNum;
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
