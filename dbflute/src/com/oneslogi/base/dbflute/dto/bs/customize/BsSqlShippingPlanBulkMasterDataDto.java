package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShippingPlanBulkMasterData. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPPING_INST_H_ID, SHIPPING_INST_B_ID, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SUPPLY_DELIVERY_FLG, DELIVERY_CUSTOMER_ID, DELIVERY_CUSTOMER_CD, DELIVERY_CUSTOMER_NM, DELIVERY_ZIP_CD, DELIVERY_TEL_NO, DELIVERY_ADDRESS1, DELIVERY_ADDRESS2, DELIVERY_ADDRESS3, DELIVERY_DELIVERY_FLG, DELIVERY_ONETIME_FLG, CLIENT_CENTER_ID, MCLIENT_CENTER_CENTER_ID, MCLIENT_CENTER_CLIENT_ID, MCLIENT_CENTER_CUSTOMER_ID, MCENTER_CENTER_ID, MCUSTOMER_CC_CUSTOMER_ID, MZIP_ZIP_ID, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, MDELIV_COURSE_CARRIER_ID, MCARRIER_CARRIER_CD, MCARRIER_DEL_FLG, DEPOSIT_CUSTOMER_ID, DEPOSIT_CUSTOMER_CD, DEPOSIT_CUSTOMER_NM, DEPOSIT_DEPOSIT_FLG, STOCK_TYPE_ID, STOCK_TYPE_CD, MPRODUCT_PRODUCT_ID, MPRODUCT_PRODUCT_CD, MPRODUCT_PRODUCT_NM, MS_DECIMAL_EXIST_FLG, MW_WAREHOUSE_ID, MW_WAREHOUSE_CD, MW_WAREHOUSE_NM, ML_LOCATION_ID, ML_LOCATION_CD, ML_LOCATION_NM, MZ_MW_WAREHOUSE_ID, MZ_MW_WAREHOUSE_CD, CENTER_CUSTOMER_ID, DELIV_COURSE_ID_BY_CUSTOMER, CENTER_ID, DELIV_COURSE_CD_BY_CUSTOMER
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
public abstract class BsSqlShippingPlanBulkMasterDataDto implements Serializable {

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
    /** SHIPPING_INST_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _shippingInstHId;

    /** SHIPPING_INST_B_ID: {bigint(19)} */
    @JsonKey
    protected Long _shippingInstBId;

    /** SUPPLY_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(60)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** SUPPLY_DELIVERY_FLG: {char(1)} */
    @JsonKey
    protected String _supplyDeliveryFlg;

    /** DELIVERY_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _deliveryCustomerId;

    /** DELIVERY_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _deliveryCustomerCd;

    /** DELIVERY_CUSTOMER_NM: {varchar(60)} */
    @JsonKey
    protected String _deliveryCustomerNm;

    /** DELIVERY_ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _deliveryZipCd;

    /** DELIVERY_TEL_NO: {varchar(30)} */
    @JsonKey
    protected String _deliveryTelNo;

    /** DELIVERY_ADDRESS1: {varchar(60)} */
    @JsonKey
    protected String _deliveryAddress1;

    /** DELIVERY_ADDRESS2: {varchar(60)} */
    @JsonKey
    protected String _deliveryAddress2;

    /** DELIVERY_ADDRESS3: {varchar(60)} */
    @JsonKey
    protected String _deliveryAddress3;

    /** DELIVERY_DELIVERY_FLG: {char(1)} */
    @JsonKey
    protected String _deliveryDeliveryFlg;

    /** DELIVERY_ONETIME_FLG: {char(1)} */
    @JsonKey
    protected String _deliveryOnetimeFlg;

    /** CLIENT_CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientCenterId;

    /** MCLIENT_CENTER_CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _mclientCenterCenterId;

    /** MCLIENT_CENTER_CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _mclientCenterClientId;

    /** MCLIENT_CENTER_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _mclientCenterCustomerId;

    /** MCENTER_CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _mcenterCenterId;

    /** MCUSTOMER_CC_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _mcustomerCcCustomerId;

    /** MZIP_ZIP_ID: {bigint(19)} */
    @JsonKey
    protected Long _mzipZipId;

    /** DELIVERY_COURSE_ID: {bigint(19)} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** MDELIV_COURSE_CARRIER_ID: {bigint(19)} */
    @JsonKey
    protected Long _mdelivCourseCarrierId;

    /** MCARRIER_CARRIER_CD: {varchar(30)} */
    @JsonKey
    protected String _mcarrierCarrierCd;

    /** MCARRIER_DEL_FLG: {char(1)} */
    @JsonKey
    protected String _mcarrierDelFlg;

    /** DEPOSIT_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _depositCustomerId;

    /** DEPOSIT_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _depositCustomerCd;

    /** DEPOSIT_CUSTOMER_NM: {varchar(60)} */
    @JsonKey
    protected String _depositCustomerNm;

    /** DEPOSIT_DEPOSIT_FLG: {char(1)} */
    @JsonKey
    protected String _depositDepositFlg;

    /** STOCK_TYPE_ID: {bigint(19)} */
    @JsonKey
    protected Long _stockTypeId;

    /** STOCK_TYPE_CD: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** MPRODUCT_PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _mproductProductId;

    /** MPRODUCT_PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _mproductProductCd;

    /** MPRODUCT_PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _mproductProductNm;

    /** MS_DECIMAL_EXIST_FLG: {char(1)} */
    @JsonKey
    protected String _msDecimalExistFlg;

    /** MW_WAREHOUSE_ID: {bigint(19)} */
    @JsonKey
    protected Long _mwWarehouseId;

    /** MW_WAREHOUSE_CD: {varchar(30)} */
    @JsonKey
    protected String _mwWarehouseCd;

    /** MW_WAREHOUSE_NM: {varchar(60)} */
    @JsonKey
    protected String _mwWarehouseNm;

    /** ML_LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _mlLocationId;

    /** ML_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _mlLocationCd;

    /** ML_LOCATION_NM: {varchar(60)} */
    @JsonKey
    protected String _mlLocationNm;

    /** MZ_MW_WAREHOUSE_ID: {bigint(19)} */
    @JsonKey
    protected Long _mzMwWarehouseId;

    /** MZ_MW_WAREHOUSE_CD: {varchar(30)} */
    @JsonKey
    protected String _mzMwWarehouseCd;

    /** CENTER_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerCustomerId;

    /** DELIV_COURSE_ID_BY_CUSTOMER: {bigint(19)} */
    @JsonKey
    protected Long _delivCourseIdByCustomer;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** DELIV_COURSE_CD_BY_CUSTOMER: {varchar(30)} */
    @JsonKey
    protected String _delivCourseCdByCustomer;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShippingPlanBulkMasterDataDto() {
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
        if (other == null || !(other instanceof BsSqlShippingPlanBulkMasterDataDto)) { return false; }
        final BsSqlShippingPlanBulkMasterDataDto otherEntity = (BsSqlShippingPlanBulkMasterDataDto)other;
        if (!helpComparingValue(getShippingInstHId(), otherEntity.getShippingInstHId())) { return false; }
        if (!helpComparingValue(getShippingInstBId(), otherEntity.getShippingInstBId())) { return false; }
        if (!helpComparingValue(getSupplyCustomerId(), otherEntity.getSupplyCustomerId())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getSupplyDeliveryFlg(), otherEntity.getSupplyDeliveryFlg())) { return false; }
        if (!helpComparingValue(getDeliveryCustomerId(), otherEntity.getDeliveryCustomerId())) { return false; }
        if (!helpComparingValue(getDeliveryCustomerCd(), otherEntity.getDeliveryCustomerCd())) { return false; }
        if (!helpComparingValue(getDeliveryCustomerNm(), otherEntity.getDeliveryCustomerNm())) { return false; }
        if (!helpComparingValue(getDeliveryZipCd(), otherEntity.getDeliveryZipCd())) { return false; }
        if (!helpComparingValue(getDeliveryTelNo(), otherEntity.getDeliveryTelNo())) { return false; }
        if (!helpComparingValue(getDeliveryAddress1(), otherEntity.getDeliveryAddress1())) { return false; }
        if (!helpComparingValue(getDeliveryAddress2(), otherEntity.getDeliveryAddress2())) { return false; }
        if (!helpComparingValue(getDeliveryAddress3(), otherEntity.getDeliveryAddress3())) { return false; }
        if (!helpComparingValue(getDeliveryDeliveryFlg(), otherEntity.getDeliveryDeliveryFlg())) { return false; }
        if (!helpComparingValue(getDeliveryOnetimeFlg(), otherEntity.getDeliveryOnetimeFlg())) { return false; }
        if (!helpComparingValue(getClientCenterId(), otherEntity.getClientCenterId())) { return false; }
        if (!helpComparingValue(getMclientCenterCenterId(), otherEntity.getMclientCenterCenterId())) { return false; }
        if (!helpComparingValue(getMclientCenterClientId(), otherEntity.getMclientCenterClientId())) { return false; }
        if (!helpComparingValue(getMclientCenterCustomerId(), otherEntity.getMclientCenterCustomerId())) { return false; }
        if (!helpComparingValue(getMcenterCenterId(), otherEntity.getMcenterCenterId())) { return false; }
        if (!helpComparingValue(getMcustomerCcCustomerId(), otherEntity.getMcustomerCcCustomerId())) { return false; }
        if (!helpComparingValue(getMzipZipId(), otherEntity.getMzipZipId())) { return false; }
        if (!helpComparingValue(getDeliveryCourseId(), otherEntity.getDeliveryCourseId())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getMdelivCourseCarrierId(), otherEntity.getMdelivCourseCarrierId())) { return false; }
        if (!helpComparingValue(getMcarrierCarrierCd(), otherEntity.getMcarrierCarrierCd())) { return false; }
        if (!helpComparingValue(getMcarrierDelFlg(), otherEntity.getMcarrierDelFlg())) { return false; }
        if (!helpComparingValue(getDepositCustomerId(), otherEntity.getDepositCustomerId())) { return false; }
        if (!helpComparingValue(getDepositCustomerCd(), otherEntity.getDepositCustomerCd())) { return false; }
        if (!helpComparingValue(getDepositCustomerNm(), otherEntity.getDepositCustomerNm())) { return false; }
        if (!helpComparingValue(getDepositDepositFlg(), otherEntity.getDepositDepositFlg())) { return false; }
        if (!helpComparingValue(getStockTypeId(), otherEntity.getStockTypeId())) { return false; }
        if (!helpComparingValue(getStockTypeCd(), otherEntity.getStockTypeCd())) { return false; }
        if (!helpComparingValue(getMproductProductId(), otherEntity.getMproductProductId())) { return false; }
        if (!helpComparingValue(getMproductProductCd(), otherEntity.getMproductProductCd())) { return false; }
        if (!helpComparingValue(getMproductProductNm(), otherEntity.getMproductProductNm())) { return false; }
        if (!helpComparingValue(getMsDecimalExistFlg(), otherEntity.getMsDecimalExistFlg())) { return false; }
        if (!helpComparingValue(getMwWarehouseId(), otherEntity.getMwWarehouseId())) { return false; }
        if (!helpComparingValue(getMwWarehouseCd(), otherEntity.getMwWarehouseCd())) { return false; }
        if (!helpComparingValue(getMwWarehouseNm(), otherEntity.getMwWarehouseNm())) { return false; }
        if (!helpComparingValue(getMlLocationId(), otherEntity.getMlLocationId())) { return false; }
        if (!helpComparingValue(getMlLocationCd(), otherEntity.getMlLocationCd())) { return false; }
        if (!helpComparingValue(getMlLocationNm(), otherEntity.getMlLocationNm())) { return false; }
        if (!helpComparingValue(getMzMwWarehouseId(), otherEntity.getMzMwWarehouseId())) { return false; }
        if (!helpComparingValue(getMzMwWarehouseCd(), otherEntity.getMzMwWarehouseCd())) { return false; }
        if (!helpComparingValue(getCenterCustomerId(), otherEntity.getCenterCustomerId())) { return false; }
        if (!helpComparingValue(getDelivCourseIdByCustomer(), otherEntity.getDelivCourseIdByCustomer())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getDelivCourseCdByCustomer(), otherEntity.getDelivCourseCdByCustomer())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShippingPlanBulkMasterData");
        result = xCH(result, getShippingInstHId());
        result = xCH(result, getShippingInstBId());
        result = xCH(result, getSupplyCustomerId());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getSupplyDeliveryFlg());
        result = xCH(result, getDeliveryCustomerId());
        result = xCH(result, getDeliveryCustomerCd());
        result = xCH(result, getDeliveryCustomerNm());
        result = xCH(result, getDeliveryZipCd());
        result = xCH(result, getDeliveryTelNo());
        result = xCH(result, getDeliveryAddress1());
        result = xCH(result, getDeliveryAddress2());
        result = xCH(result, getDeliveryAddress3());
        result = xCH(result, getDeliveryDeliveryFlg());
        result = xCH(result, getDeliveryOnetimeFlg());
        result = xCH(result, getClientCenterId());
        result = xCH(result, getMclientCenterCenterId());
        result = xCH(result, getMclientCenterClientId());
        result = xCH(result, getMclientCenterCustomerId());
        result = xCH(result, getMcenterCenterId());
        result = xCH(result, getMcustomerCcCustomerId());
        result = xCH(result, getMzipZipId());
        result = xCH(result, getDeliveryCourseId());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getMdelivCourseCarrierId());
        result = xCH(result, getMcarrierCarrierCd());
        result = xCH(result, getMcarrierDelFlg());
        result = xCH(result, getDepositCustomerId());
        result = xCH(result, getDepositCustomerCd());
        result = xCH(result, getDepositCustomerNm());
        result = xCH(result, getDepositDepositFlg());
        result = xCH(result, getStockTypeId());
        result = xCH(result, getStockTypeCd());
        result = xCH(result, getMproductProductId());
        result = xCH(result, getMproductProductCd());
        result = xCH(result, getMproductProductNm());
        result = xCH(result, getMsDecimalExistFlg());
        result = xCH(result, getMwWarehouseId());
        result = xCH(result, getMwWarehouseCd());
        result = xCH(result, getMwWarehouseNm());
        result = xCH(result, getMlLocationId());
        result = xCH(result, getMlLocationCd());
        result = xCH(result, getMlLocationNm());
        result = xCH(result, getMzMwWarehouseId());
        result = xCH(result, getMzMwWarehouseCd());
        result = xCH(result, getCenterCustomerId());
        result = xCH(result, getDelivCourseIdByCustomer());
        result = xCH(result, getCenterId());
        result = xCH(result, getDelivCourseCdByCustomer());
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
        sb.append(c).append(getShippingInstHId());
        sb.append(c).append(getShippingInstBId());
        sb.append(c).append(getSupplyCustomerId());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getSupplyDeliveryFlg());
        sb.append(c).append(getDeliveryCustomerId());
        sb.append(c).append(getDeliveryCustomerCd());
        sb.append(c).append(getDeliveryCustomerNm());
        sb.append(c).append(getDeliveryZipCd());
        sb.append(c).append(getDeliveryTelNo());
        sb.append(c).append(getDeliveryAddress1());
        sb.append(c).append(getDeliveryAddress2());
        sb.append(c).append(getDeliveryAddress3());
        sb.append(c).append(getDeliveryDeliveryFlg());
        sb.append(c).append(getDeliveryOnetimeFlg());
        sb.append(c).append(getClientCenterId());
        sb.append(c).append(getMclientCenterCenterId());
        sb.append(c).append(getMclientCenterClientId());
        sb.append(c).append(getMclientCenterCustomerId());
        sb.append(c).append(getMcenterCenterId());
        sb.append(c).append(getMcustomerCcCustomerId());
        sb.append(c).append(getMzipZipId());
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getMdelivCourseCarrierId());
        sb.append(c).append(getMcarrierCarrierCd());
        sb.append(c).append(getMcarrierDelFlg());
        sb.append(c).append(getDepositCustomerId());
        sb.append(c).append(getDepositCustomerCd());
        sb.append(c).append(getDepositCustomerNm());
        sb.append(c).append(getDepositDepositFlg());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getMproductProductId());
        sb.append(c).append(getMproductProductCd());
        sb.append(c).append(getMproductProductNm());
        sb.append(c).append(getMsDecimalExistFlg());
        sb.append(c).append(getMwWarehouseId());
        sb.append(c).append(getMwWarehouseCd());
        sb.append(c).append(getMwWarehouseNm());
        sb.append(c).append(getMlLocationId());
        sb.append(c).append(getMlLocationCd());
        sb.append(c).append(getMlLocationNm());
        sb.append(c).append(getMzMwWarehouseId());
        sb.append(c).append(getMzMwWarehouseCd());
        sb.append(c).append(getCenterCustomerId());
        sb.append(c).append(getDelivCourseIdByCustomer());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getDelivCourseCdByCustomer());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public Long getShippingInstHId() {
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {bigint(19)} <br>
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        __modifiedProperties.add("shippingInstHId");
        this._shippingInstHId = shippingInstHId;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public Long getShippingInstBId() {
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {bigint(19)} <br>
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        __modifiedProperties.add("shippingInstBId");
        this._shippingInstBId = shippingInstBId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getSupplyCustomerId() {
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        __modifiedProperties.add("supplyCustomerId");
        this._supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] SUPPLY_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'SUPPLY_DELIVERY_FLG'. (NullAllowed)
     */
    public String getSupplyDeliveryFlg() {
        return _supplyDeliveryFlg;
    }

    /**
     * [set] SUPPLY_DELIVERY_FLG: {char(1)} <br>
     * @param supplyDeliveryFlg The value of the column 'SUPPLY_DELIVERY_FLG'. (NullAllowed)
     */
    public void setSupplyDeliveryFlg(String supplyDeliveryFlg) {
        __modifiedProperties.add("supplyDeliveryFlg");
        this._supplyDeliveryFlg = supplyDeliveryFlg;
    }

    /**
     * [get] DELIVERY_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIVERY_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getDeliveryCustomerId() {
        return _deliveryCustomerId;
    }

    /**
     * [set] DELIVERY_CUSTOMER_ID: {bigint(19)} <br>
     * @param deliveryCustomerId The value of the column 'DELIVERY_CUSTOMER_ID'. (NullAllowed)
     */
    public void setDeliveryCustomerId(Long deliveryCustomerId) {
        __modifiedProperties.add("deliveryCustomerId");
        this._deliveryCustomerId = deliveryCustomerId;
    }

    /**
     * [get] DELIVERY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDeliveryCustomerCd() {
        return _deliveryCustomerCd;
    }

    /**
     * [set] DELIVERY_CUSTOMER_CD: {varchar(30)} <br>
     * @param deliveryCustomerCd The value of the column 'DELIVERY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setDeliveryCustomerCd(String deliveryCustomerCd) {
        __modifiedProperties.add("deliveryCustomerCd");
        this._deliveryCustomerCd = deliveryCustomerCd;
    }

    /**
     * [get] DELIVERY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDeliveryCustomerNm() {
        return _deliveryCustomerNm;
    }

    /**
     * [set] DELIVERY_CUSTOMER_NM: {varchar(60)} <br>
     * @param deliveryCustomerNm The value of the column 'DELIVERY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDeliveryCustomerNm(String deliveryCustomerNm) {
        __modifiedProperties.add("deliveryCustomerNm");
        this._deliveryCustomerNm = deliveryCustomerNm;
    }

    /**
     * [get] DELIVERY_ZIP_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_ZIP_CD'. (NullAllowed)
     */
    public String getDeliveryZipCd() {
        return _deliveryZipCd;
    }

    /**
     * [set] DELIVERY_ZIP_CD: {varchar(30)} <br>
     * @param deliveryZipCd The value of the column 'DELIVERY_ZIP_CD'. (NullAllowed)
     */
    public void setDeliveryZipCd(String deliveryZipCd) {
        __modifiedProperties.add("deliveryZipCd");
        this._deliveryZipCd = deliveryZipCd;
    }

    /**
     * [get] DELIVERY_TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_TEL_NO'. (NullAllowed)
     */
    public String getDeliveryTelNo() {
        return _deliveryTelNo;
    }

    /**
     * [set] DELIVERY_TEL_NO: {varchar(30)} <br>
     * @param deliveryTelNo The value of the column 'DELIVERY_TEL_NO'. (NullAllowed)
     */
    public void setDeliveryTelNo(String deliveryTelNo) {
        __modifiedProperties.add("deliveryTelNo");
        this._deliveryTelNo = deliveryTelNo;
    }

    /**
     * [get] DELIVERY_ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_ADDRESS1'. (NullAllowed)
     */
    public String getDeliveryAddress1() {
        return _deliveryAddress1;
    }

    /**
     * [set] DELIVERY_ADDRESS1: {varchar(60)} <br>
     * @param deliveryAddress1 The value of the column 'DELIVERY_ADDRESS1'. (NullAllowed)
     */
    public void setDeliveryAddress1(String deliveryAddress1) {
        __modifiedProperties.add("deliveryAddress1");
        this._deliveryAddress1 = deliveryAddress1;
    }

    /**
     * [get] DELIVERY_ADDRESS2: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_ADDRESS2'. (NullAllowed)
     */
    public String getDeliveryAddress2() {
        return _deliveryAddress2;
    }

    /**
     * [set] DELIVERY_ADDRESS2: {varchar(60)} <br>
     * @param deliveryAddress2 The value of the column 'DELIVERY_ADDRESS2'. (NullAllowed)
     */
    public void setDeliveryAddress2(String deliveryAddress2) {
        __modifiedProperties.add("deliveryAddress2");
        this._deliveryAddress2 = deliveryAddress2;
    }

    /**
     * [get] DELIVERY_ADDRESS3: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_ADDRESS3'. (NullAllowed)
     */
    public String getDeliveryAddress3() {
        return _deliveryAddress3;
    }

    /**
     * [set] DELIVERY_ADDRESS3: {varchar(60)} <br>
     * @param deliveryAddress3 The value of the column 'DELIVERY_ADDRESS3'. (NullAllowed)
     */
    public void setDeliveryAddress3(String deliveryAddress3) {
        __modifiedProperties.add("deliveryAddress3");
        this._deliveryAddress3 = deliveryAddress3;
    }

    /**
     * [get] DELIVERY_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'DELIVERY_DELIVERY_FLG'. (NullAllowed)
     */
    public String getDeliveryDeliveryFlg() {
        return _deliveryDeliveryFlg;
    }

    /**
     * [set] DELIVERY_DELIVERY_FLG: {char(1)} <br>
     * @param deliveryDeliveryFlg The value of the column 'DELIVERY_DELIVERY_FLG'. (NullAllowed)
     */
    public void setDeliveryDeliveryFlg(String deliveryDeliveryFlg) {
        __modifiedProperties.add("deliveryDeliveryFlg");
        this._deliveryDeliveryFlg = deliveryDeliveryFlg;
    }

    /**
     * [get] DELIVERY_ONETIME_FLG: {char(1)} <br>
     * @return The value of the column 'DELIVERY_ONETIME_FLG'. (NullAllowed)
     */
    public String getDeliveryOnetimeFlg() {
        return _deliveryOnetimeFlg;
    }

    /**
     * [set] DELIVERY_ONETIME_FLG: {char(1)} <br>
     * @param deliveryOnetimeFlg The value of the column 'DELIVERY_ONETIME_FLG'. (NullAllowed)
     */
    public void setDeliveryOnetimeFlg(String deliveryOnetimeFlg) {
        __modifiedProperties.add("deliveryOnetimeFlg");
        this._deliveryOnetimeFlg = deliveryOnetimeFlg;
    }

    /**
     * [get] CLIENT_CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_CENTER_ID'. (NullAllowed)
     */
    public Long getClientCenterId() {
        return _clientCenterId;
    }

    /**
     * [set] CLIENT_CENTER_ID: {bigint(19)} <br>
     * @param clientCenterId The value of the column 'CLIENT_CENTER_ID'. (NullAllowed)
     */
    public void setClientCenterId(Long clientCenterId) {
        __modifiedProperties.add("clientCenterId");
        this._clientCenterId = clientCenterId;
    }

    /**
     * [get] MCLIENT_CENTER_CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCLIENT_CENTER_CENTER_ID'. (NullAllowed)
     */
    public Long getMclientCenterCenterId() {
        return _mclientCenterCenterId;
    }

    /**
     * [set] MCLIENT_CENTER_CENTER_ID: {bigint(19)} <br>
     * @param mclientCenterCenterId The value of the column 'MCLIENT_CENTER_CENTER_ID'. (NullAllowed)
     */
    public void setMclientCenterCenterId(Long mclientCenterCenterId) {
        __modifiedProperties.add("mclientCenterCenterId");
        this._mclientCenterCenterId = mclientCenterCenterId;
    }

    /**
     * [get] MCLIENT_CENTER_CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'MCLIENT_CENTER_CLIENT_ID'. (NullAllowed)
     */
    public Long getMclientCenterClientId() {
        return _mclientCenterClientId;
    }

    /**
     * [set] MCLIENT_CENTER_CLIENT_ID: {bigint(19)} <br>
     * @param mclientCenterClientId The value of the column 'MCLIENT_CENTER_CLIENT_ID'. (NullAllowed)
     */
    public void setMclientCenterClientId(Long mclientCenterClientId) {
        __modifiedProperties.add("mclientCenterClientId");
        this._mclientCenterClientId = mclientCenterClientId;
    }

    /**
     * [get] MCLIENT_CENTER_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCLIENT_CENTER_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getMclientCenterCustomerId() {
        return _mclientCenterCustomerId;
    }

    /**
     * [set] MCLIENT_CENTER_CUSTOMER_ID: {bigint(19)} <br>
     * @param mclientCenterCustomerId The value of the column 'MCLIENT_CENTER_CUSTOMER_ID'. (NullAllowed)
     */
    public void setMclientCenterCustomerId(Long mclientCenterCustomerId) {
        __modifiedProperties.add("mclientCenterCustomerId");
        this._mclientCenterCustomerId = mclientCenterCustomerId;
    }

    /**
     * [get] MCENTER_CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCENTER_CENTER_ID'. (NullAllowed)
     */
    public Long getMcenterCenterId() {
        return _mcenterCenterId;
    }

    /**
     * [set] MCENTER_CENTER_ID: {bigint(19)} <br>
     * @param mcenterCenterId The value of the column 'MCENTER_CENTER_ID'. (NullAllowed)
     */
    public void setMcenterCenterId(Long mcenterCenterId) {
        __modifiedProperties.add("mcenterCenterId");
        this._mcenterCenterId = mcenterCenterId;
    }

    /**
     * [get] MCUSTOMER_CC_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCUSTOMER_CC_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getMcustomerCcCustomerId() {
        return _mcustomerCcCustomerId;
    }

    /**
     * [set] MCUSTOMER_CC_CUSTOMER_ID: {bigint(19)} <br>
     * @param mcustomerCcCustomerId The value of the column 'MCUSTOMER_CC_CUSTOMER_ID'. (NullAllowed)
     */
    public void setMcustomerCcCustomerId(Long mcustomerCcCustomerId) {
        __modifiedProperties.add("mcustomerCcCustomerId");
        this._mcustomerCcCustomerId = mcustomerCcCustomerId;
    }

    /**
     * [get] MZIP_ZIP_ID: {bigint(19)} <br>
     * @return The value of the column 'MZIP_ZIP_ID'. (NullAllowed)
     */
    public Long getMzipZipId() {
        return _mzipZipId;
    }

    /**
     * [set] MZIP_ZIP_ID: {bigint(19)} <br>
     * @param mzipZipId The value of the column 'MZIP_ZIP_ID'. (NullAllowed)
     */
    public void setMzipZipId(Long mzipZipId) {
        __modifiedProperties.add("mzipZipId");
        this._mzipZipId = mzipZipId;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] MDELIV_COURSE_CARRIER_ID: {bigint(19)} <br>
     * @return The value of the column 'MDELIV_COURSE_CARRIER_ID'. (NullAllowed)
     */
    public Long getMdelivCourseCarrierId() {
        return _mdelivCourseCarrierId;
    }

    /**
     * [set] MDELIV_COURSE_CARRIER_ID: {bigint(19)} <br>
     * @param mdelivCourseCarrierId The value of the column 'MDELIV_COURSE_CARRIER_ID'. (NullAllowed)
     */
    public void setMdelivCourseCarrierId(Long mdelivCourseCarrierId) {
        __modifiedProperties.add("mdelivCourseCarrierId");
        this._mdelivCourseCarrierId = mdelivCourseCarrierId;
    }

    /**
     * [get] MCARRIER_CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'MCARRIER_CARRIER_CD'. (NullAllowed)
     */
    public String getMcarrierCarrierCd() {
        return _mcarrierCarrierCd;
    }

    /**
     * [set] MCARRIER_CARRIER_CD: {varchar(30)} <br>
     * @param mcarrierCarrierCd The value of the column 'MCARRIER_CARRIER_CD'. (NullAllowed)
     */
    public void setMcarrierCarrierCd(String mcarrierCarrierCd) {
        __modifiedProperties.add("mcarrierCarrierCd");
        this._mcarrierCarrierCd = mcarrierCarrierCd;
    }

    /**
     * [get] MCARRIER_DEL_FLG: {char(1)} <br>
     * @return The value of the column 'MCARRIER_DEL_FLG'. (NullAllowed)
     */
    public String getMcarrierDelFlg() {
        return _mcarrierDelFlg;
    }

    /**
     * [set] MCARRIER_DEL_FLG: {char(1)} <br>
     * @param mcarrierDelFlg The value of the column 'MCARRIER_DEL_FLG'. (NullAllowed)
     */
    public void setMcarrierDelFlg(String mcarrierDelFlg) {
        __modifiedProperties.add("mcarrierDelFlg");
        this._mcarrierDelFlg = mcarrierDelFlg;
    }

    /**
     * [get] DEPOSIT_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'DEPOSIT_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getDepositCustomerId() {
        return _depositCustomerId;
    }

    /**
     * [set] DEPOSIT_CUSTOMER_ID: {bigint(19)} <br>
     * @param depositCustomerId The value of the column 'DEPOSIT_CUSTOMER_ID'. (NullAllowed)
     */
    public void setDepositCustomerId(Long depositCustomerId) {
        __modifiedProperties.add("depositCustomerId");
        this._depositCustomerId = depositCustomerId;
    }

    /**
     * [get] DEPOSIT_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DEPOSIT_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDepositCustomerCd() {
        return _depositCustomerCd;
    }

    /**
     * [set] DEPOSIT_CUSTOMER_CD: {varchar(30)} <br>
     * @param depositCustomerCd The value of the column 'DEPOSIT_CUSTOMER_CD'. (NullAllowed)
     */
    public void setDepositCustomerCd(String depositCustomerCd) {
        __modifiedProperties.add("depositCustomerCd");
        this._depositCustomerCd = depositCustomerCd;
    }

    /**
     * [get] DEPOSIT_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'DEPOSIT_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDepositCustomerNm() {
        return _depositCustomerNm;
    }

    /**
     * [set] DEPOSIT_CUSTOMER_NM: {varchar(60)} <br>
     * @param depositCustomerNm The value of the column 'DEPOSIT_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDepositCustomerNm(String depositCustomerNm) {
        __modifiedProperties.add("depositCustomerNm");
        this._depositCustomerNm = depositCustomerNm;
    }

    /**
     * [get] DEPOSIT_DEPOSIT_FLG: {char(1)} <br>
     * @return The value of the column 'DEPOSIT_DEPOSIT_FLG'. (NullAllowed)
     */
    public String getDepositDepositFlg() {
        return _depositDepositFlg;
    }

    /**
     * [set] DEPOSIT_DEPOSIT_FLG: {char(1)} <br>
     * @param depositDepositFlg The value of the column 'DEPOSIT_DEPOSIT_FLG'. (NullAllowed)
     */
    public void setDepositDepositFlg(String depositDepositFlg) {
        __modifiedProperties.add("depositDepositFlg");
        this._depositDepositFlg = depositDepositFlg;
    }

    /**
     * [get] STOCK_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {bigint(19)} <br>
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] MPRODUCT_PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'MPRODUCT_PRODUCT_ID'. (NullAllowed)
     */
    public Long getMproductProductId() {
        return _mproductProductId;
    }

    /**
     * [set] MPRODUCT_PRODUCT_ID: {bigint(19)} <br>
     * @param mproductProductId The value of the column 'MPRODUCT_PRODUCT_ID'. (NullAllowed)
     */
    public void setMproductProductId(Long mproductProductId) {
        __modifiedProperties.add("mproductProductId");
        this._mproductProductId = mproductProductId;
    }

    /**
     * [get] MPRODUCT_PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'MPRODUCT_PRODUCT_CD'. (NullAllowed)
     */
    public String getMproductProductCd() {
        return _mproductProductCd;
    }

    /**
     * [set] MPRODUCT_PRODUCT_CD: {varchar(100)} <br>
     * @param mproductProductCd The value of the column 'MPRODUCT_PRODUCT_CD'. (NullAllowed)
     */
    public void setMproductProductCd(String mproductProductCd) {
        __modifiedProperties.add("mproductProductCd");
        this._mproductProductCd = mproductProductCd;
    }

    /**
     * [get] MPRODUCT_PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'MPRODUCT_PRODUCT_NM'. (NullAllowed)
     */
    public String getMproductProductNm() {
        return _mproductProductNm;
    }

    /**
     * [set] MPRODUCT_PRODUCT_NM: {varchar(255)} <br>
     * @param mproductProductNm The value of the column 'MPRODUCT_PRODUCT_NM'. (NullAllowed)
     */
    public void setMproductProductNm(String mproductProductNm) {
        __modifiedProperties.add("mproductProductNm");
        this._mproductProductNm = mproductProductNm;
    }

    /**
     * [get] MS_DECIMAL_EXIST_FLG: {char(1)} <br>
     * @return The value of the column 'MS_DECIMAL_EXIST_FLG'. (NullAllowed)
     */
    public String getMsDecimalExistFlg() {
        return _msDecimalExistFlg;
    }

    /**
     * [set] MS_DECIMAL_EXIST_FLG: {char(1)} <br>
     * @param msDecimalExistFlg The value of the column 'MS_DECIMAL_EXIST_FLG'. (NullAllowed)
     */
    public void setMsDecimalExistFlg(String msDecimalExistFlg) {
        __modifiedProperties.add("msDecimalExistFlg");
        this._msDecimalExistFlg = msDecimalExistFlg;
    }

    /**
     * [get] MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'MW_WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getMwWarehouseId() {
        return _mwWarehouseId;
    }

    /**
     * [set] MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @param mwWarehouseId The value of the column 'MW_WAREHOUSE_ID'. (NullAllowed)
     */
    public void setMwWarehouseId(Long mwWarehouseId) {
        __modifiedProperties.add("mwWarehouseId");
        this._mwWarehouseId = mwWarehouseId;
    }

    /**
     * [get] MW_WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'MW_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getMwWarehouseCd() {
        return _mwWarehouseCd;
    }

    /**
     * [set] MW_WAREHOUSE_CD: {varchar(30)} <br>
     * @param mwWarehouseCd The value of the column 'MW_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setMwWarehouseCd(String mwWarehouseCd) {
        __modifiedProperties.add("mwWarehouseCd");
        this._mwWarehouseCd = mwWarehouseCd;
    }

    /**
     * [get] MW_WAREHOUSE_NM: {varchar(60)} <br>
     * @return The value of the column 'MW_WAREHOUSE_NM'. (NullAllowed)
     */
    public String getMwWarehouseNm() {
        return _mwWarehouseNm;
    }

    /**
     * [set] MW_WAREHOUSE_NM: {varchar(60)} <br>
     * @param mwWarehouseNm The value of the column 'MW_WAREHOUSE_NM'. (NullAllowed)
     */
    public void setMwWarehouseNm(String mwWarehouseNm) {
        __modifiedProperties.add("mwWarehouseNm");
        this._mwWarehouseNm = mwWarehouseNm;
    }

    /**
     * [get] ML_LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'ML_LOCATION_ID'. (NullAllowed)
     */
    public Long getMlLocationId() {
        return _mlLocationId;
    }

    /**
     * [set] ML_LOCATION_ID: {bigint(19)} <br>
     * @param mlLocationId The value of the column 'ML_LOCATION_ID'. (NullAllowed)
     */
    public void setMlLocationId(Long mlLocationId) {
        __modifiedProperties.add("mlLocationId");
        this._mlLocationId = mlLocationId;
    }

    /**
     * [get] ML_LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'ML_LOCATION_CD'. (NullAllowed)
     */
    public String getMlLocationCd() {
        return _mlLocationCd;
    }

    /**
     * [set] ML_LOCATION_CD: {varchar(30)} <br>
     * @param mlLocationCd The value of the column 'ML_LOCATION_CD'. (NullAllowed)
     */
    public void setMlLocationCd(String mlLocationCd) {
        __modifiedProperties.add("mlLocationCd");
        this._mlLocationCd = mlLocationCd;
    }

    /**
     * [get] ML_LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'ML_LOCATION_NM'. (NullAllowed)
     */
    public String getMlLocationNm() {
        return _mlLocationNm;
    }

    /**
     * [set] ML_LOCATION_NM: {varchar(60)} <br>
     * @param mlLocationNm The value of the column 'ML_LOCATION_NM'. (NullAllowed)
     */
    public void setMlLocationNm(String mlLocationNm) {
        __modifiedProperties.add("mlLocationNm");
        this._mlLocationNm = mlLocationNm;
    }

    /**
     * [get] MZ_MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'MZ_MW_WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getMzMwWarehouseId() {
        return _mzMwWarehouseId;
    }

    /**
     * [set] MZ_MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @param mzMwWarehouseId The value of the column 'MZ_MW_WAREHOUSE_ID'. (NullAllowed)
     */
    public void setMzMwWarehouseId(Long mzMwWarehouseId) {
        __modifiedProperties.add("mzMwWarehouseId");
        this._mzMwWarehouseId = mzMwWarehouseId;
    }

    /**
     * [get] MZ_MW_WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'MZ_MW_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getMzMwWarehouseCd() {
        return _mzMwWarehouseCd;
    }

    /**
     * [set] MZ_MW_WAREHOUSE_CD: {varchar(30)} <br>
     * @param mzMwWarehouseCd The value of the column 'MZ_MW_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setMzMwWarehouseCd(String mzMwWarehouseCd) {
        __modifiedProperties.add("mzMwWarehouseCd");
        this._mzMwWarehouseCd = mzMwWarehouseCd;
    }

    /**
     * [get] CENTER_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCenterCustomerId() {
        return _centerCustomerId;
    }

    /**
     * [set] CENTER_CUSTOMER_ID: {bigint(19)} <br>
     * @param centerCustomerId The value of the column 'CENTER_CUSTOMER_ID'. (NullAllowed)
     */
    public void setCenterCustomerId(Long centerCustomerId) {
        __modifiedProperties.add("centerCustomerId");
        this._centerCustomerId = centerCustomerId;
    }

    /**
     * [get] DELIV_COURSE_ID_BY_CUSTOMER: {bigint(19)} <br>
     * @return The value of the column 'DELIV_COURSE_ID_BY_CUSTOMER'. (NullAllowed)
     */
    public Long getDelivCourseIdByCustomer() {
        return _delivCourseIdByCustomer;
    }

    /**
     * [set] DELIV_COURSE_ID_BY_CUSTOMER: {bigint(19)} <br>
     * @param delivCourseIdByCustomer The value of the column 'DELIV_COURSE_ID_BY_CUSTOMER'. (NullAllowed)
     */
    public void setDelivCourseIdByCustomer(Long delivCourseIdByCustomer) {
        __modifiedProperties.add("delivCourseIdByCustomer");
        this._delivCourseIdByCustomer = delivCourseIdByCustomer;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] DELIV_COURSE_CD_BY_CUSTOMER: {varchar(30)} <br>
     * @return The value of the column 'DELIV_COURSE_CD_BY_CUSTOMER'. (NullAllowed)
     */
    public String getDelivCourseCdByCustomer() {
        return _delivCourseCdByCustomer;
    }

    /**
     * [set] DELIV_COURSE_CD_BY_CUSTOMER: {varchar(30)} <br>
     * @param delivCourseCdByCustomer The value of the column 'DELIV_COURSE_CD_BY_CUSTOMER'. (NullAllowed)
     */
    public void setDelivCourseCdByCustomer(String delivCourseCdByCustomer) {
        __modifiedProperties.add("delivCourseCdByCustomer");
        this._delivCourseCdByCustomer = delivCourseCdByCustomer;
    }

}
