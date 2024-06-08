package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlWReplenishInstInputDataList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     FLEXLNS_NO, SCH_DATE, SUPPLIER_CD, RCV_DATE, SHIP_CD, ITEM_CD, MANUFACTURE_DATE, DESIGN_CD, QTY, FLEX_UPD_USER_CD, REPLENISH_INST_INPUT_ID, VERSION_NO, OTHERCD1, OTHERCD2
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsSqlWReplenishInstInputDataListDto implements Serializable {

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
    /** FLEXLNS_NO: {varchar(255)} */
    @JsonKey
    protected String _flexlnsNo;

    /** SCH_DATE: {varchar(255)} */
    @JsonKey
    protected String _schDate;

    /** SUPPLIER_CD: {varchar(255)} */
    @JsonKey
    protected String _supplierCd;

    /** RCV_DATE: {varchar(255)} */
    @JsonKey
    protected String _rcvDate;

    /** SHIP_CD: {varchar(255)} */
    @JsonKey
    protected String _shipCd;

    /** ITEM_CD: {varchar(255)} */
    @JsonKey
    protected String _itemCd;

    /** MANUFACTURE_DATE: {varchar(255)} */
    @JsonKey
    protected String _manufactureDate;

    /** DESIGN_CD: {varchar(255)} */
    @JsonKey
    protected String _designCd;

    /** QTY: {varchar(255)} */
    @JsonKey
    protected String _qty;

    /** FLEX_UPD_USER_CD: {varchar(255)} */
    @JsonKey
    protected String _flexUpdUserCd;

    /** REPLENISH_INST_INPUT_ID: {bigint(19)} */
    @JsonKey
    protected Long _replenishInstInputId;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** OTHERCD1: {varchar(30)} */
    @JsonKey
    protected String _othercd1;

    /** OTHERCD2: {varchar(30)} */
    @JsonKey
    protected String _othercd2;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlWReplenishInstInputDataListDto() {
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
        if (other == null || !(other instanceof BsSqlWReplenishInstInputDataListDto)) { return false; }
        final BsSqlWReplenishInstInputDataListDto otherEntity = (BsSqlWReplenishInstInputDataListDto)other;
        if (!helpComparingValue(getFlexlnsNo(), otherEntity.getFlexlnsNo())) { return false; }
        if (!helpComparingValue(getSchDate(), otherEntity.getSchDate())) { return false; }
        if (!helpComparingValue(getSupplierCd(), otherEntity.getSupplierCd())) { return false; }
        if (!helpComparingValue(getRcvDate(), otherEntity.getRcvDate())) { return false; }
        if (!helpComparingValue(getShipCd(), otherEntity.getShipCd())) { return false; }
        if (!helpComparingValue(getItemCd(), otherEntity.getItemCd())) { return false; }
        if (!helpComparingValue(getManufactureDate(), otherEntity.getManufactureDate())) { return false; }
        if (!helpComparingValue(getDesignCd(), otherEntity.getDesignCd())) { return false; }
        if (!helpComparingValue(getQty(), otherEntity.getQty())) { return false; }
        if (!helpComparingValue(getFlexUpdUserCd(), otherEntity.getFlexUpdUserCd())) { return false; }
        if (!helpComparingValue(getReplenishInstInputId(), otherEntity.getReplenishInstInputId())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getOthercd1(), otherEntity.getOthercd1())) { return false; }
        if (!helpComparingValue(getOthercd2(), otherEntity.getOthercd2())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlWReplenishInstInputDataList");
        result = xCH(result, getFlexlnsNo());
        result = xCH(result, getSchDate());
        result = xCH(result, getSupplierCd());
        result = xCH(result, getRcvDate());
        result = xCH(result, getShipCd());
        result = xCH(result, getItemCd());
        result = xCH(result, getManufactureDate());
        result = xCH(result, getDesignCd());
        result = xCH(result, getQty());
        result = xCH(result, getFlexUpdUserCd());
        result = xCH(result, getReplenishInstInputId());
        result = xCH(result, getVersionNo());
        result = xCH(result, getOthercd1());
        result = xCH(result, getOthercd2());
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
        sb.append(c).append(getFlexlnsNo());
        sb.append(c).append(getSchDate());
        sb.append(c).append(getSupplierCd());
        sb.append(c).append(getRcvDate());
        sb.append(c).append(getShipCd());
        sb.append(c).append(getItemCd());
        sb.append(c).append(getManufactureDate());
        sb.append(c).append(getDesignCd());
        sb.append(c).append(getQty());
        sb.append(c).append(getFlexUpdUserCd());
        sb.append(c).append(getReplenishInstInputId());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getOthercd1());
        sb.append(c).append(getOthercd2());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FLEXLNS_NO: {varchar(255)} <br>
     * @return The value of the column 'FLEXLNS_NO'. (NullAllowed)
     */
    public String getFlexlnsNo() {
        return _flexlnsNo;
    }

    /**
     * [set] FLEXLNS_NO: {varchar(255)} <br>
     * @param flexlnsNo The value of the column 'FLEXLNS_NO'. (NullAllowed)
     */
    public void setFlexlnsNo(String flexlnsNo) {
        __modifiedProperties.add("flexlnsNo");
        this._flexlnsNo = flexlnsNo;
    }

    /**
     * [get] SCH_DATE: {varchar(255)} <br>
     * @return The value of the column 'SCH_DATE'. (NullAllowed)
     */
    public String getSchDate() {
        return _schDate;
    }

    /**
     * [set] SCH_DATE: {varchar(255)} <br>
     * @param schDate The value of the column 'SCH_DATE'. (NullAllowed)
     */
    public void setSchDate(String schDate) {
        __modifiedProperties.add("schDate");
        this._schDate = schDate;
    }

    /**
     * [get] SUPPLIER_CD: {varchar(255)} <br>
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public String getSupplierCd() {
        return _supplierCd;
    }

    /**
     * [set] SUPPLIER_CD: {varchar(255)} <br>
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public void setSupplierCd(String supplierCd) {
        __modifiedProperties.add("supplierCd");
        this._supplierCd = supplierCd;
    }

    /**
     * [get] RCV_DATE: {varchar(255)} <br>
     * @return The value of the column 'RCV_DATE'. (NullAllowed)
     */
    public String getRcvDate() {
        return _rcvDate;
    }

    /**
     * [set] RCV_DATE: {varchar(255)} <br>
     * @param rcvDate The value of the column 'RCV_DATE'. (NullAllowed)
     */
    public void setRcvDate(String rcvDate) {
        __modifiedProperties.add("rcvDate");
        this._rcvDate = rcvDate;
    }

    /**
     * [get] SHIP_CD: {varchar(255)} <br>
     * @return The value of the column 'SHIP_CD'. (NullAllowed)
     */
    public String getShipCd() {
        return _shipCd;
    }

    /**
     * [set] SHIP_CD: {varchar(255)} <br>
     * @param shipCd The value of the column 'SHIP_CD'. (NullAllowed)
     */
    public void setShipCd(String shipCd) {
        __modifiedProperties.add("shipCd");
        this._shipCd = shipCd;
    }

    /**
     * [get] ITEM_CD: {varchar(255)} <br>
     * @return The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public String getItemCd() {
        return _itemCd;
    }

    /**
     * [set] ITEM_CD: {varchar(255)} <br>
     * @param itemCd The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public void setItemCd(String itemCd) {
        __modifiedProperties.add("itemCd");
        this._itemCd = itemCd;
    }

    /**
     * [get] MANUFACTURE_DATE: {varchar(255)} <br>
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getManufactureDate() {
        return _manufactureDate;
    }

    /**
     * [set] MANUFACTURE_DATE: {varchar(255)} <br>
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setManufactureDate(String manufactureDate) {
        __modifiedProperties.add("manufactureDate");
        this._manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_CD: {varchar(255)} <br>
     * @return The value of the column 'DESIGN_CD'. (NullAllowed)
     */
    public String getDesignCd() {
        return _designCd;
    }

    /**
     * [set] DESIGN_CD: {varchar(255)} <br>
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed)
     */
    public void setDesignCd(String designCd) {
        __modifiedProperties.add("designCd");
        this._designCd = designCd;
    }

    /**
     * [get] QTY: {varchar(255)} <br>
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public String getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(String qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] FLEX_UPD_USER_CD: {varchar(255)} <br>
     * @return The value of the column 'FLEX_UPD_USER_CD'. (NullAllowed)
     */
    public String getFlexUpdUserCd() {
        return _flexUpdUserCd;
    }

    /**
     * [set] FLEX_UPD_USER_CD: {varchar(255)} <br>
     * @param flexUpdUserCd The value of the column 'FLEX_UPD_USER_CD'. (NullAllowed)
     */
    public void setFlexUpdUserCd(String flexUpdUserCd) {
        __modifiedProperties.add("flexUpdUserCd");
        this._flexUpdUserCd = flexUpdUserCd;
    }

    /**
     * [get] REPLENISH_INST_INPUT_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_INST_INPUT_ID'. (NullAllowed)
     */
    public Long getReplenishInstInputId() {
        return _replenishInstInputId;
    }

    /**
     * [set] REPLENISH_INST_INPUT_ID: {bigint(19)} <br>
     * @param replenishInstInputId The value of the column 'REPLENISH_INST_INPUT_ID'. (NullAllowed)
     */
    public void setReplenishInstInputId(Long replenishInstInputId) {
        __modifiedProperties.add("replenishInstInputId");
        this._replenishInstInputId = replenishInstInputId;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] OTHERCD1: {varchar(30)} <br>
     * @return The value of the column 'OTHERCD1'. (NullAllowed)
     */
    public String getOthercd1() {
        return _othercd1;
    }

    /**
     * [set] OTHERCD1: {varchar(30)} <br>
     * @param othercd1 The value of the column 'OTHERCD1'. (NullAllowed)
     */
    public void setOthercd1(String othercd1) {
        __modifiedProperties.add("othercd1");
        this._othercd1 = othercd1;
    }

    /**
     * [get] OTHERCD2: {varchar(30)} <br>
     * @return The value of the column 'OTHERCD2'. (NullAllowed)
     */
    public String getOthercd2() {
        return _othercd2;
    }

    /**
     * [set] OTHERCD2: {varchar(30)} <br>
     * @param othercd2 The value of the column 'OTHERCD2'. (NullAllowed)
     */
    public void setOthercd2(String othercd2) {
        __modifiedProperties.add("othercd2");
        this._othercd2 = othercd2;
    }

}
