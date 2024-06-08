package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryBInvCreate. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_KEY, INVENTORY_DT, PRODUCT_CD, LOCATION_CD, MANUFACTURE_DATE, TRMANUFACTUREDATEDETAIL_ID, CENTER_ID, CLIENT_ID, CENTER_CD, OWNER_CD, INVENTORY_KBN, LINE_BLOCK, INVENTORY_DATE, BF_MANUFACTURE_DATE, AF_MANUFACTURE_DATE, DESIGN_FLG, VERSION_NO
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
public abstract class BsSqlInventoryBInvCreateDto implements Serializable {

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
    /** INVENTORY_B_ID: {bigint(19)} */
    @JsonKey
    protected Long _inventoryBId;

    /** INVENTORY_KEY: {varchar(30)} */
    @JsonKey
    protected String _inventoryKey;

    /** INVENTORY_DT: {varchar(8)} */
    @JsonKey
    protected String _inventoryDt;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** MANUFACTURE_DATE: {varchar(8)} */
    @JsonKey
    protected String _manufactureDate;

    /** TRMANUFACTUREDATEDETAIL_ID: {bigint(19)} */
    @JsonKey
    protected Long _trmanufacturedatedetailId;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** OWNER_CD: {varchar(30)} */
    @JsonKey
    protected String _ownerCd;

    /** INVENTORY_KBN: {varchar(30)} */
    @JsonKey
    protected String _inventoryKbn;

    /** LINE_BLOCK: {varchar(30)} */
    @JsonKey
    protected String _lineBlock;

    /** INVENTORY_DATE: {varchar(8)} */
    @JsonKey
    protected String _inventoryDate;

    /** BF_MANUFACTURE_DATE: {varchar(8)} */
    @JsonKey
    protected String _bfManufactureDate;

    /** AF_MANUFACTURE_DATE: {varchar(8)} */
    @JsonKey
    protected String _afManufactureDate;

    /** DESIGN_FLG: {varchar(30)} */
    @JsonKey
    protected String _designFlg;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryBInvCreateDto() {
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
        if (other == null || !(other instanceof BsSqlInventoryBInvCreateDto)) { return false; }
        final BsSqlInventoryBInvCreateDto otherEntity = (BsSqlInventoryBInvCreateDto)other;
        if (!helpComparingValue(getInventoryBId(), otherEntity.getInventoryBId())) { return false; }
        if (!helpComparingValue(getInventoryKey(), otherEntity.getInventoryKey())) { return false; }
        if (!helpComparingValue(getInventoryDt(), otherEntity.getInventoryDt())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getManufactureDate(), otherEntity.getManufactureDate())) { return false; }
        if (!helpComparingValue(getTrmanufacturedatedetailId(), otherEntity.getTrmanufacturedatedetailId())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getOwnerCd(), otherEntity.getOwnerCd())) { return false; }
        if (!helpComparingValue(getInventoryKbn(), otherEntity.getInventoryKbn())) { return false; }
        if (!helpComparingValue(getLineBlock(), otherEntity.getLineBlock())) { return false; }
        if (!helpComparingValue(getInventoryDate(), otherEntity.getInventoryDate())) { return false; }
        if (!helpComparingValue(getBfManufactureDate(), otherEntity.getBfManufactureDate())) { return false; }
        if (!helpComparingValue(getAfManufactureDate(), otherEntity.getAfManufactureDate())) { return false; }
        if (!helpComparingValue(getDesignFlg(), otherEntity.getDesignFlg())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryBInvCreate");
        result = xCH(result, getInventoryBId());
        result = xCH(result, getInventoryKey());
        result = xCH(result, getInventoryDt());
        result = xCH(result, getProductCd());
        result = xCH(result, getLocationCd());
        result = xCH(result, getManufactureDate());
        result = xCH(result, getTrmanufacturedatedetailId());
        result = xCH(result, getCenterId());
        result = xCH(result, getClientId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getOwnerCd());
        result = xCH(result, getInventoryKbn());
        result = xCH(result, getLineBlock());
        result = xCH(result, getInventoryDate());
        result = xCH(result, getBfManufactureDate());
        result = xCH(result, getAfManufactureDate());
        result = xCH(result, getDesignFlg());
        result = xCH(result, getVersionNo());
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
        sb.append(c).append(getInventoryBId());
        sb.append(c).append(getInventoryKey());
        sb.append(c).append(getInventoryDt());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getManufactureDate());
        sb.append(c).append(getTrmanufacturedatedetailId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getOwnerCd());
        sb.append(c).append(getInventoryKbn());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getInventoryDate());
        sb.append(c).append(getBfManufactureDate());
        sb.append(c).append(getAfManufactureDate());
        sb.append(c).append(getDesignFlg());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {bigint(19)} <br>
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        __modifiedProperties.add("inventoryBId");
        this._inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_KEY: {varchar(30)} <br>
     * @return The value of the column 'INVENTORY_KEY'. (NullAllowed)
     */
    public String getInventoryKey() {
        return _inventoryKey;
    }

    /**
     * [set] INVENTORY_KEY: {varchar(30)} <br>
     * @param inventoryKey The value of the column 'INVENTORY_KEY'. (NullAllowed)
     */
    public void setInventoryKey(String inventoryKey) {
        __modifiedProperties.add("inventoryKey");
        this._inventoryKey = inventoryKey;
    }

    /**
     * [get] INVENTORY_DT: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public String getInventoryDt() {
        return _inventoryDt;
    }

    /**
     * [set] INVENTORY_DT: {varchar(8)} <br>
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        __modifiedProperties.add("inventoryDt");
        this._inventoryDt = inventoryDt;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] MANUFACTURE_DATE: {varchar(8)} <br>
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getManufactureDate() {
        return _manufactureDate;
    }

    /**
     * [set] MANUFACTURE_DATE: {varchar(8)} <br>
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setManufactureDate(String manufactureDate) {
        __modifiedProperties.add("manufactureDate");
        this._manufactureDate = manufactureDate;
    }

    /**
     * [get] TRMANUFACTUREDATEDETAIL_ID: {bigint(19)} <br>
     * @return The value of the column 'TRMANUFACTUREDATEDETAIL_ID'. (NullAllowed)
     */
    public Long getTrmanufacturedatedetailId() {
        return _trmanufacturedatedetailId;
    }

    /**
     * [set] TRMANUFACTUREDATEDETAIL_ID: {bigint(19)} <br>
     * @param trmanufacturedatedetailId The value of the column 'TRMANUFACTUREDATEDETAIL_ID'. (NullAllowed)
     */
    public void setTrmanufacturedatedetailId(Long trmanufacturedatedetailId) {
        __modifiedProperties.add("trmanufacturedatedetailId");
        this._trmanufacturedatedetailId = trmanufacturedatedetailId;
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
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] OWNER_CD: {varchar(30)} <br>
     * @return The value of the column 'OWNER_CD'. (NullAllowed)
     */
    public String getOwnerCd() {
        return _ownerCd;
    }

    /**
     * [set] OWNER_CD: {varchar(30)} <br>
     * @param ownerCd The value of the column 'OWNER_CD'. (NullAllowed)
     */
    public void setOwnerCd(String ownerCd) {
        __modifiedProperties.add("ownerCd");
        this._ownerCd = ownerCd;
    }

    /**
     * [get] INVENTORY_KBN: {varchar(30)} <br>
     * @return The value of the column 'INVENTORY_KBN'. (NullAllowed)
     */
    public String getInventoryKbn() {
        return _inventoryKbn;
    }

    /**
     * [set] INVENTORY_KBN: {varchar(30)} <br>
     * @param inventoryKbn The value of the column 'INVENTORY_KBN'. (NullAllowed)
     */
    public void setInventoryKbn(String inventoryKbn) {
        __modifiedProperties.add("inventoryKbn");
        this._inventoryKbn = inventoryKbn;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] INVENTORY_DATE: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DATE'. (NullAllowed)
     */
    public String getInventoryDate() {
        return _inventoryDate;
    }

    /**
     * [set] INVENTORY_DATE: {varchar(8)} <br>
     * @param inventoryDate The value of the column 'INVENTORY_DATE'. (NullAllowed)
     */
    public void setInventoryDate(String inventoryDate) {
        __modifiedProperties.add("inventoryDate");
        this._inventoryDate = inventoryDate;
    }

    /**
     * [get] BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * @return The value of the column 'BF_MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getBfManufactureDate() {
        return _bfManufactureDate;
    }

    /**
     * [set] BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * @param bfManufactureDate The value of the column 'BF_MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setBfManufactureDate(String bfManufactureDate) {
        __modifiedProperties.add("bfManufactureDate");
        this._bfManufactureDate = bfManufactureDate;
    }

    /**
     * [get] AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * @return The value of the column 'AF_MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getAfManufactureDate() {
        return _afManufactureDate;
    }

    /**
     * [set] AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * @param afManufactureDate The value of the column 'AF_MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setAfManufactureDate(String afManufactureDate) {
        __modifiedProperties.add("afManufactureDate");
        this._afManufactureDate = afManufactureDate;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public String getDesignFlg() {
        return _designFlg;
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public void setDesignFlg(String designFlg) {
        __modifiedProperties.add("designFlg");
        this._designFlg = designFlg;
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

}
