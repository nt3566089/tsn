package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_ID, CLIENT_ID, USERNUM1, INVENTORY_INST_KBN, PRODUCT_ID, INV_EXPECT_NUM, INVENTORY_NUM, STORING_SYSTEM_STOCK_NUM, SORT_SYSTEM_STOCK_NUM, SORTED_SYSTEM_INVENTORY, REMOTE_ISLAND_SYSTEM_INVENTORY, GOOD_ITEM_SYSTEM_STOCK_NUM
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
public abstract class BsSqlInventoryListDto implements Serializable {

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
    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** USERNUM1: {bigint(19)} */
    @JsonKey
    protected Long _usernum1;

    /** INVENTORY_INST_KBN: {varchar(30)} */
    @JsonKey
    protected String _inventoryInstKbn;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** INV_EXPECT_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _invExpectNum;

    /** INVENTORY_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _inventoryNum;

    /** STORING_SYSTEM_STOCK_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _storingSystemStockNum;

    /** SORT_SYSTEM_STOCK_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sortSystemStockNum;

    /** SORTED_SYSTEM_INVENTORY: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sortedSystemInventory;

    /** REMOTE_ISLAND_SYSTEM_INVENTORY: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _remoteIslandSystemInventory;

    /** GOOD_ITEM_SYSTEM_STOCK_NUM: {bigint(19)} */
    @JsonKey
    protected Long _goodItemSystemStockNum;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryListDto() {
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
        if (other == null || !(other instanceof BsSqlInventoryListDto)) { return false; }
        final BsSqlInventoryListDto otherEntity = (BsSqlInventoryListDto)other;
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getUsernum1(), otherEntity.getUsernum1())) { return false; }
        if (!helpComparingValue(getInventoryInstKbn(), otherEntity.getInventoryInstKbn())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getInvExpectNum(), otherEntity.getInvExpectNum())) { return false; }
        if (!helpComparingValue(getInventoryNum(), otherEntity.getInventoryNum())) { return false; }
        if (!helpComparingValue(getStoringSystemStockNum(), otherEntity.getStoringSystemStockNum())) { return false; }
        if (!helpComparingValue(getSortSystemStockNum(), otherEntity.getSortSystemStockNum())) { return false; }
        if (!helpComparingValue(getSortedSystemInventory(), otherEntity.getSortedSystemInventory())) { return false; }
        if (!helpComparingValue(getRemoteIslandSystemInventory(), otherEntity.getRemoteIslandSystemInventory())) { return false; }
        if (!helpComparingValue(getGoodItemSystemStockNum(), otherEntity.getGoodItemSystemStockNum())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryList");
        result = xCH(result, getCenterId());
        result = xCH(result, getClientId());
        result = xCH(result, getUsernum1());
        result = xCH(result, getInventoryInstKbn());
        result = xCH(result, getProductId());
        result = xCH(result, getInvExpectNum());
        result = xCH(result, getInventoryNum());
        result = xCH(result, getStoringSystemStockNum());
        result = xCH(result, getSortSystemStockNum());
        result = xCH(result, getSortedSystemInventory());
        result = xCH(result, getRemoteIslandSystemInventory());
        result = xCH(result, getGoodItemSystemStockNum());
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
        sb.append(c).append(getClientId());
        sb.append(c).append(getUsernum1());
        sb.append(c).append(getInventoryInstKbn());
        sb.append(c).append(getProductId());
        sb.append(c).append(getInvExpectNum());
        sb.append(c).append(getInventoryNum());
        sb.append(c).append(getStoringSystemStockNum());
        sb.append(c).append(getSortSystemStockNum());
        sb.append(c).append(getSortedSystemInventory());
        sb.append(c).append(getRemoteIslandSystemInventory());
        sb.append(c).append(getGoodItemSystemStockNum());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] USERNUM1: {bigint(19)} <br>
     * @return The value of the column 'USERNUM1'. (NullAllowed)
     */
    public Long getUsernum1() {
        return _usernum1;
    }

    /**
     * [set] USERNUM1: {bigint(19)} <br>
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed)
     */
    public void setUsernum1(Long usernum1) {
        __modifiedProperties.add("usernum1");
        this._usernum1 = usernum1;
    }

    /**
     * [get] INVENTORY_INST_KBN: {varchar(30)} <br>
     * @return The value of the column 'INVENTORY_INST_KBN'. (NullAllowed)
     */
    public String getInventoryInstKbn() {
        return _inventoryInstKbn;
    }

    /**
     * [set] INVENTORY_INST_KBN: {varchar(30)} <br>
     * @param inventoryInstKbn The value of the column 'INVENTORY_INST_KBN'. (NullAllowed)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        __modifiedProperties.add("inventoryInstKbn");
        this._inventoryInstKbn = inventoryInstKbn;
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
     * [get] INV_EXPECT_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'INV_EXPECT_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvExpectNum() {
        return _invExpectNum;
    }

    /**
     * [set] INV_EXPECT_NUM: {decimal(38, 6)} <br>
     * @param invExpectNum The value of the column 'INV_EXPECT_NUM'. (NullAllowed)
     */
    public void setInvExpectNum(java.math.BigDecimal invExpectNum) {
        __modifiedProperties.add("invExpectNum");
        this._invExpectNum = invExpectNum;
    }

    /**
     * [get] INVENTORY_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInventoryNum() {
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {decimal(38, 6)} <br>
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        __modifiedProperties.add("inventoryNum");
        this._inventoryNum = inventoryNum;
    }

    /**
     * [get] STORING_SYSTEM_STOCK_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'STORING_SYSTEM_STOCK_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getStoringSystemStockNum() {
        return _storingSystemStockNum;
    }

    /**
     * [set] STORING_SYSTEM_STOCK_NUM: {decimal(38, 6)} <br>
     * @param storingSystemStockNum The value of the column 'STORING_SYSTEM_STOCK_NUM'. (NullAllowed)
     */
    public void setStoringSystemStockNum(java.math.BigDecimal storingSystemStockNum) {
        __modifiedProperties.add("storingSystemStockNum");
        this._storingSystemStockNum = storingSystemStockNum;
    }

    /**
     * [get] SORT_SYSTEM_STOCK_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'SORT_SYSTEM_STOCK_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getSortSystemStockNum() {
        return _sortSystemStockNum;
    }

    /**
     * [set] SORT_SYSTEM_STOCK_NUM: {decimal(38, 6)} <br>
     * @param sortSystemStockNum The value of the column 'SORT_SYSTEM_STOCK_NUM'. (NullAllowed)
     */
    public void setSortSystemStockNum(java.math.BigDecimal sortSystemStockNum) {
        __modifiedProperties.add("sortSystemStockNum");
        this._sortSystemStockNum = sortSystemStockNum;
    }

    /**
     * [get] SORTED_SYSTEM_INVENTORY: {decimal(38, 6)} <br>
     * @return The value of the column 'SORTED_SYSTEM_INVENTORY'. (NullAllowed)
     */
    public java.math.BigDecimal getSortedSystemInventory() {
        return _sortedSystemInventory;
    }

    /**
     * [set] SORTED_SYSTEM_INVENTORY: {decimal(38, 6)} <br>
     * @param sortedSystemInventory The value of the column 'SORTED_SYSTEM_INVENTORY'. (NullAllowed)
     */
    public void setSortedSystemInventory(java.math.BigDecimal sortedSystemInventory) {
        __modifiedProperties.add("sortedSystemInventory");
        this._sortedSystemInventory = sortedSystemInventory;
    }

    /**
     * [get] REMOTE_ISLAND_SYSTEM_INVENTORY: {decimal(38, 6)} <br>
     * @return The value of the column 'REMOTE_ISLAND_SYSTEM_INVENTORY'. (NullAllowed)
     */
    public java.math.BigDecimal getRemoteIslandSystemInventory() {
        return _remoteIslandSystemInventory;
    }

    /**
     * [set] REMOTE_ISLAND_SYSTEM_INVENTORY: {decimal(38, 6)} <br>
     * @param remoteIslandSystemInventory The value of the column 'REMOTE_ISLAND_SYSTEM_INVENTORY'. (NullAllowed)
     */
    public void setRemoteIslandSystemInventory(java.math.BigDecimal remoteIslandSystemInventory) {
        __modifiedProperties.add("remoteIslandSystemInventory");
        this._remoteIslandSystemInventory = remoteIslandSystemInventory;
    }

    /**
     * [get] GOOD_ITEM_SYSTEM_STOCK_NUM: {bigint(19)} <br>
     * @return The value of the column 'GOOD_ITEM_SYSTEM_STOCK_NUM'. (NullAllowed)
     */
    public Long getGoodItemSystemStockNum() {
        return _goodItemSystemStockNum;
    }

    /**
     * [set] GOOD_ITEM_SYSTEM_STOCK_NUM: {bigint(19)} <br>
     * @param goodItemSystemStockNum The value of the column 'GOOD_ITEM_SYSTEM_STOCK_NUM'. (NullAllowed)
     */
    public void setGoodItemSystemStockNum(Long goodItemSystemStockNum) {
        __modifiedProperties.add("goodItemSystemStockNum");
        this._goodItemSystemStockNum = goodItemSystemStockNum;
    }

}
