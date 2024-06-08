package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlReceiveRecordList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SUPPLIERRCVNO, SUPPLIERCD, WAREHOUSE_CD, ITEMCD, EXPECTQTY1_SUM
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
public abstract class BsSqlReceiveRecordListDto implements Serializable {

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
    /** SUPPLIERRCVNO: {varchar(60)} */
    @JsonKey
    protected String _supplierrcvno;

    /** SUPPLIERCD: {varchar(30)} */
    @JsonKey
    protected String _suppliercd;

    /** WAREHOUSE_CD: {varchar(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** ITEMCD: {varchar(30)} */
    @JsonKey
    protected String _itemcd;

    /** EXPECTQTY1_SUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _expectqty1Sum;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlReceiveRecordListDto() {
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
        if (other == null || !(other instanceof BsSqlReceiveRecordListDto)) { return false; }
        final BsSqlReceiveRecordListDto otherEntity = (BsSqlReceiveRecordListDto)other;
        if (!helpComparingValue(getSupplierrcvno(), otherEntity.getSupplierrcvno())) { return false; }
        if (!helpComparingValue(getSuppliercd(), otherEntity.getSuppliercd())) { return false; }
        if (!helpComparingValue(getWarehouseCd(), otherEntity.getWarehouseCd())) { return false; }
        if (!helpComparingValue(getItemcd(), otherEntity.getItemcd())) { return false; }
        if (!helpComparingValue(getExpectqty1Sum(), otherEntity.getExpectqty1Sum())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlReceiveRecordList");
        result = xCH(result, getSupplierrcvno());
        result = xCH(result, getSuppliercd());
        result = xCH(result, getWarehouseCd());
        result = xCH(result, getItemcd());
        result = xCH(result, getExpectqty1Sum());
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
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getItemcd());
        sb.append(c).append(getExpectqty1Sum());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public String getSupplierrcvno() {
        return _supplierrcvno;
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        __modifiedProperties.add("supplierrcvno");
        this._supplierrcvno = supplierrcvno;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public String getSuppliercd() {
        return _suppliercd;
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public void setSuppliercd(String suppliercd) {
        __modifiedProperties.add("suppliercd");
        this._suppliercd = suppliercd;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(30)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed)
     */
    public String getItemcd() {
        return _itemcd;
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed)
     */
    public void setItemcd(String itemcd) {
        __modifiedProperties.add("itemcd");
        this._itemcd = itemcd;
    }

    /**
     * [get] EXPECTQTY1_SUM: {decimal(38, 6)} <br>
     * @return The value of the column 'EXPECTQTY1_SUM'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectqty1Sum() {
        return _expectqty1Sum;
    }

    /**
     * [set] EXPECTQTY1_SUM: {decimal(38, 6)} <br>
     * @param expectqty1Sum The value of the column 'EXPECTQTY1_SUM'. (NullAllowed)
     */
    public void setExpectqty1Sum(java.math.BigDecimal expectqty1Sum) {
        __modifiedProperties.add("expectqty1Sum");
        this._expectqty1Sum = expectqty1Sum;
    }

}
