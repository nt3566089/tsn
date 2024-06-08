package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlReceivePlanBulkMasterData. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, RECEIVE_PLAN_B_ID, PRODUCT_ID, LOCATION_ID, LOC_ZONE_WAREHOUSE_ID, MW_WAREHOUSE_ID, SUPPLY_CUSTOMER_ID, SUPPLY_VENDOR_FLG, DEPOSIT_CUSTOMER_ID, DEPOSIT_FLG, DECIMAL_EXIST_FLG
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
public abstract class BsSqlReceivePlanBulkMasterDataDto implements Serializable {

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
    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** RECEIVE_PLAN_B_ID: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanBId;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOC_ZONE_WAREHOUSE_ID: {bigint(19)} */
    @JsonKey
    protected Long _locZoneWarehouseId;

    /** MW_WAREHOUSE_ID: {bigint(19)} */
    @JsonKey
    protected Long _mwWarehouseId;

    /** SUPPLY_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _supplyCustomerId;

    /** SUPPLY_VENDOR_FLG: {char(1)} */
    @JsonKey
    protected String _supplyVendorFlg;

    /** DEPOSIT_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _depositCustomerId;

    /** DEPOSIT_FLG: {char(1), classification=DepositFlg} */
    @JsonKey
    protected String _depositFlg;

    /** DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg} */
    @JsonKey
    protected String _decimalExistFlg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlReceivePlanBulkMasterDataDto() {
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
        if (other == null || !(other instanceof BsSqlReceivePlanBulkMasterDataDto)) { return false; }
        final BsSqlReceivePlanBulkMasterDataDto otherEntity = (BsSqlReceivePlanBulkMasterDataDto)other;
        if (!helpComparingValue(getReceivePlanHId(), otherEntity.getReceivePlanHId())) { return false; }
        if (!helpComparingValue(getReceivePlanBId(), otherEntity.getReceivePlanBId())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getLocationId(), otherEntity.getLocationId())) { return false; }
        if (!helpComparingValue(getLocZoneWarehouseId(), otherEntity.getLocZoneWarehouseId())) { return false; }
        if (!helpComparingValue(getMwWarehouseId(), otherEntity.getMwWarehouseId())) { return false; }
        if (!helpComparingValue(getSupplyCustomerId(), otherEntity.getSupplyCustomerId())) { return false; }
        if (!helpComparingValue(getSupplyVendorFlg(), otherEntity.getSupplyVendorFlg())) { return false; }
        if (!helpComparingValue(getDepositCustomerId(), otherEntity.getDepositCustomerId())) { return false; }
        if (!helpComparingValue(getDepositFlg(), otherEntity.getDepositFlg())) { return false; }
        if (!helpComparingValue(getDecimalExistFlg(), otherEntity.getDecimalExistFlg())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlReceivePlanBulkMasterData");
        result = xCH(result, getReceivePlanHId());
        result = xCH(result, getReceivePlanBId());
        result = xCH(result, getProductId());
        result = xCH(result, getLocationId());
        result = xCH(result, getLocZoneWarehouseId());
        result = xCH(result, getMwWarehouseId());
        result = xCH(result, getSupplyCustomerId());
        result = xCH(result, getSupplyVendorFlg());
        result = xCH(result, getDepositCustomerId());
        result = xCH(result, getDepositFlg());
        result = xCH(result, getDecimalExistFlg());
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
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getReceivePlanBId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocZoneWarehouseId());
        sb.append(c).append(getMwWarehouseId());
        sb.append(c).append(getSupplyCustomerId());
        sb.append(c).append(getSupplyVendorFlg());
        sb.append(c).append(getDepositCustomerId());
        sb.append(c).append(getDepositFlg());
        sb.append(c).append(getDecimalExistFlg());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public Long getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {bigint(19)} <br>
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOC_ZONE_WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'LOC_ZONE_WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getLocZoneWarehouseId() {
        return _locZoneWarehouseId;
    }

    /**
     * [set] LOC_ZONE_WAREHOUSE_ID: {bigint(19)} <br>
     * @param locZoneWarehouseId The value of the column 'LOC_ZONE_WAREHOUSE_ID'. (NullAllowed)
     */
    public void setLocZoneWarehouseId(Long locZoneWarehouseId) {
        __modifiedProperties.add("locZoneWarehouseId");
        this._locZoneWarehouseId = locZoneWarehouseId;
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
     * [get] SUPPLY_VENDOR_FLG: {char(1)} <br>
     * @return The value of the column 'SUPPLY_VENDOR_FLG'. (NullAllowed)
     */
    public String getSupplyVendorFlg() {
        return _supplyVendorFlg;
    }

    /**
     * [set] SUPPLY_VENDOR_FLG: {char(1)} <br>
     * @param supplyVendorFlg The value of the column 'SUPPLY_VENDOR_FLG'. (NullAllowed)
     */
    public void setSupplyVendorFlg(String supplyVendorFlg) {
        __modifiedProperties.add("supplyVendorFlg");
        this._supplyVendorFlg = supplyVendorFlg;
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
     * [get] DEPOSIT_FLG: {char(1), classification=DepositFlg} <br>
     * // cls(DepositFlg)
     * @return The value of the column 'DEPOSIT_FLG'. (NullAllowed)
     */
    public String getDepositFlg() {
        return _depositFlg;
    }

    /**
     * [set] DEPOSIT_FLG: {char(1), classification=DepositFlg} <br>
     * // cls(DepositFlg)
     * @param depositFlg The value of the column 'DEPOSIT_FLG'. (NullAllowed)
     */
    public void setDepositFlg(String depositFlg) {
        __modifiedProperties.add("depositFlg");
        this._depositFlg = depositFlg;
    }

    /**
     * [get] DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg} <br>
     * // cls(DecimalExistFlg)
     * @return The value of the column 'DECIMAL_EXIST_FLG'. (NullAllowed)
     */
    public String getDecimalExistFlg() {
        return _decimalExistFlg;
    }

    /**
     * [set] DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg} <br>
     * // cls(DecimalExistFlg)
     * @param decimalExistFlg The value of the column 'DECIMAL_EXIST_FLG'. (NullAllowed)
     */
    public void setDecimalExistFlg(String decimalExistFlg) {
        __modifiedProperties.add("decimalExistFlg");
        this._decimalExistFlg = decimalExistFlg;
    }

}
