package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryList. <br>
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long usernum1 = entity.getUsernum1();
 * String inventoryInstKbn = entity.getInventoryInstKbn();
 * Long productId = entity.getProductId();
 * java.math.BigDecimal invExpectNum = entity.getInvExpectNum();
 * java.math.BigDecimal inventoryNum = entity.getInventoryNum();
 * java.math.BigDecimal storingSystemStockNum = entity.getStoringSystemStockNum();
 * java.math.BigDecimal sortSystemStockNum = entity.getSortSystemStockNum();
 * java.math.BigDecimal sortedSystemInventory = entity.getSortedSystemInventory();
 * java.math.BigDecimal remoteIslandSystemInventory = entity.getRemoteIslandSystemInventory();
 * Long goodItemSystemStockNum = entity.getGoodItemSystemStockNum();
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setUsernum1(usernum1);
 * entity.setInventoryInstKbn(inventoryInstKbn);
 * entity.setProductId(productId);
 * entity.setInvExpectNum(invExpectNum);
 * entity.setInventoryNum(inventoryNum);
 * entity.setStoringSystemStockNum(storingSystemStockNum);
 * entity.setSortSystemStockNum(sortSystemStockNum);
 * entity.setSortedSystemInventory(sortedSystemInventory);
 * entity.setRemoteIslandSystemInventory(remoteIslandSystemInventory);
 * entity.setGoodItemSystemStockNum(goodItemSystemStockNum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** USERNUM1: {bigint(19)} */
    protected Long _usernum1;

    /** INVENTORY_INST_KBN: {varchar(30)} */
    protected String _inventoryInstKbn;

    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** INV_EXPECT_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _invExpectNum;

    /** INVENTORY_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _inventoryNum;

    /** STORING_SYSTEM_STOCK_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _storingSystemStockNum;

    /** SORT_SYSTEM_STOCK_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _sortSystemStockNum;

    /** SORTED_SYSTEM_INVENTORY: {decimal(38, 6)} */
    protected java.math.BigDecimal _sortedSystemInventory;

    /** REMOTE_ISLAND_SYSTEM_INVENTORY: {decimal(38, 6)} */
    protected java.math.BigDecimal _remoteIslandSystemInventory;

    /** GOOD_ITEM_SYSTEM_STOCK_NUM: {bigint(19)} */
    protected Long _goodItemSystemStockNum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryList";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlInventoryList) {
            BsSqlInventoryList other = (BsSqlInventoryList)obj;
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_usernum1, other._usernum1)) { return false; }
            if (!xSV(_inventoryInstKbn, other._inventoryInstKbn)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_invExpectNum, other._invExpectNum)) { return false; }
            if (!xSV(_inventoryNum, other._inventoryNum)) { return false; }
            if (!xSV(_storingSystemStockNum, other._storingSystemStockNum)) { return false; }
            if (!xSV(_sortSystemStockNum, other._sortSystemStockNum)) { return false; }
            if (!xSV(_sortedSystemInventory, other._sortedSystemInventory)) { return false; }
            if (!xSV(_remoteIslandSystemInventory, other._remoteIslandSystemInventory)) { return false; }
            if (!xSV(_goodItemSystemStockNum, other._goodItemSystemStockNum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _usernum1);
        hs = xCH(hs, _inventoryInstKbn);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _invExpectNum);
        hs = xCH(hs, _inventoryNum);
        hs = xCH(hs, _storingSystemStockNum);
        hs = xCH(hs, _sortSystemStockNum);
        hs = xCH(hs, _sortedSystemInventory);
        hs = xCH(hs, _remoteIslandSystemInventory);
        hs = xCH(hs, _goodItemSystemStockNum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_usernum1));
        sb.append(dm).append(xfND(_inventoryInstKbn));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_invExpectNum));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_storingSystemStockNum));
        sb.append(dm).append(xfND(_sortSystemStockNum));
        sb.append(dm).append(xfND(_sortedSystemInventory));
        sb.append(dm).append(xfND(_remoteIslandSystemInventory));
        sb.append(dm).append(xfND(_goodItemSystemStockNum));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlInventoryList clone() {
        return (SqlInventoryList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] USERNUM1: {bigint(19)} <br>
     * @return The value of the column 'USERNUM1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum1() {
        checkSpecifiedProperty("usernum1");
        return _usernum1;
    }

    /**
     * [set] USERNUM1: {bigint(19)} <br>
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum1(Long usernum1) {
        registerModifiedProperty("usernum1");
        _usernum1 = usernum1;
    }

    /**
     * [get] INVENTORY_INST_KBN: {varchar(30)} <br>
     * @return The value of the column 'INVENTORY_INST_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryInstKbn() {
        checkSpecifiedProperty("inventoryInstKbn");
        return convertEmptyToNull(_inventoryInstKbn);
    }

    /**
     * [set] INVENTORY_INST_KBN: {varchar(30)} <br>
     * @param inventoryInstKbn The value of the column 'INVENTORY_INST_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        registerModifiedProperty("inventoryInstKbn");
        _inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] INV_EXPECT_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'INV_EXPECT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvExpectNum() {
        checkSpecifiedProperty("invExpectNum");
        return _invExpectNum;
    }

    /**
     * [set] INV_EXPECT_NUM: {decimal(38, 6)} <br>
     * @param invExpectNum The value of the column 'INV_EXPECT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvExpectNum(java.math.BigDecimal invExpectNum) {
        registerModifiedProperty("invExpectNum");
        _invExpectNum = invExpectNum;
    }

    /**
     * [get] INVENTORY_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {decimal(38, 6)} <br>
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] STORING_SYSTEM_STOCK_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'STORING_SYSTEM_STOCK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStoringSystemStockNum() {
        checkSpecifiedProperty("storingSystemStockNum");
        return _storingSystemStockNum;
    }

    /**
     * [set] STORING_SYSTEM_STOCK_NUM: {decimal(38, 6)} <br>
     * @param storingSystemStockNum The value of the column 'STORING_SYSTEM_STOCK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoringSystemStockNum(java.math.BigDecimal storingSystemStockNum) {
        registerModifiedProperty("storingSystemStockNum");
        _storingSystemStockNum = storingSystemStockNum;
    }

    /**
     * [get] SORT_SYSTEM_STOCK_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'SORT_SYSTEM_STOCK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSortSystemStockNum() {
        checkSpecifiedProperty("sortSystemStockNum");
        return _sortSystemStockNum;
    }

    /**
     * [set] SORT_SYSTEM_STOCK_NUM: {decimal(38, 6)} <br>
     * @param sortSystemStockNum The value of the column 'SORT_SYSTEM_STOCK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortSystemStockNum(java.math.BigDecimal sortSystemStockNum) {
        registerModifiedProperty("sortSystemStockNum");
        _sortSystemStockNum = sortSystemStockNum;
    }

    /**
     * [get] SORTED_SYSTEM_INVENTORY: {decimal(38, 6)} <br>
     * @return The value of the column 'SORTED_SYSTEM_INVENTORY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSortedSystemInventory() {
        checkSpecifiedProperty("sortedSystemInventory");
        return _sortedSystemInventory;
    }

    /**
     * [set] SORTED_SYSTEM_INVENTORY: {decimal(38, 6)} <br>
     * @param sortedSystemInventory The value of the column 'SORTED_SYSTEM_INVENTORY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortedSystemInventory(java.math.BigDecimal sortedSystemInventory) {
        registerModifiedProperty("sortedSystemInventory");
        _sortedSystemInventory = sortedSystemInventory;
    }

    /**
     * [get] REMOTE_ISLAND_SYSTEM_INVENTORY: {decimal(38, 6)} <br>
     * @return The value of the column 'REMOTE_ISLAND_SYSTEM_INVENTORY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRemoteIslandSystemInventory() {
        checkSpecifiedProperty("remoteIslandSystemInventory");
        return _remoteIslandSystemInventory;
    }

    /**
     * [set] REMOTE_ISLAND_SYSTEM_INVENTORY: {decimal(38, 6)} <br>
     * @param remoteIslandSystemInventory The value of the column 'REMOTE_ISLAND_SYSTEM_INVENTORY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemoteIslandSystemInventory(java.math.BigDecimal remoteIslandSystemInventory) {
        registerModifiedProperty("remoteIslandSystemInventory");
        _remoteIslandSystemInventory = remoteIslandSystemInventory;
    }

    /**
     * [get] GOOD_ITEM_SYSTEM_STOCK_NUM: {bigint(19)} <br>
     * @return The value of the column 'GOOD_ITEM_SYSTEM_STOCK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGoodItemSystemStockNum() {
        checkSpecifiedProperty("goodItemSystemStockNum");
        return _goodItemSystemStockNum;
    }

    /**
     * [set] GOOD_ITEM_SYSTEM_STOCK_NUM: {bigint(19)} <br>
     * @param goodItemSystemStockNum The value of the column 'GOOD_ITEM_SYSTEM_STOCK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGoodItemSystemStockNum(Long goodItemSystemStockNum) {
        registerModifiedProperty("goodItemSystemStockNum");
        _goodItemSystemStockNum = goodItemSystemStockNum;
    }
}
