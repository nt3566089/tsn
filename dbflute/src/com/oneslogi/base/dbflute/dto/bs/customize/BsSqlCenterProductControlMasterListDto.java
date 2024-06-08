package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlCenterProductControlMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFWH_ITEM_ID, PRODUCT_CD, PRODUCT_NM, SLOTLOCNAME, PICKLOCNAME, UPD_DT, UPD_USER, TRANSPORTPRIORITY, USERNUM3, USERNUM1
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
public abstract class BsSqlCenterProductControlMasterListDto implements Serializable {

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
    /** MFWH_ITEM_ID: {bigint(19)} */
    @JsonKey
    protected Long _mfwhItemId;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** SLOTLOCNAME: {varchar(255)} */
    @JsonKey
    protected String _slotlocname;

    /** PICKLOCNAME: {varchar(255)} */
    @JsonKey
    protected String _picklocname;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** TRANSPORTPRIORITY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _transportpriority;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** USERNUM1: {bigint(19)} */
    @JsonKey
    protected Long _usernum1;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlCenterProductControlMasterListDto() {
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
        if (other == null || !(other instanceof BsSqlCenterProductControlMasterListDto)) { return false; }
        final BsSqlCenterProductControlMasterListDto otherEntity = (BsSqlCenterProductControlMasterListDto)other;
        if (!helpComparingValue(getMfwhItemId(), otherEntity.getMfwhItemId())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getSlotlocname(), otherEntity.getSlotlocname())) { return false; }
        if (!helpComparingValue(getPicklocname(), otherEntity.getPicklocname())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getTransportpriority(), otherEntity.getTransportpriority())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        if (!helpComparingValue(getUsernum1(), otherEntity.getUsernum1())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlCenterProductControlMasterList");
        result = xCH(result, getMfwhItemId());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getSlotlocname());
        result = xCH(result, getPicklocname());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getTransportpriority());
        result = xCH(result, getUsernum3());
        result = xCH(result, getUsernum1());
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
        sb.append(c).append(getMfwhItemId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getSlotlocname());
        sb.append(c).append(getPicklocname());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getTransportpriority());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getUsernum1());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFWH_ITEM_ID: {bigint(19)} <br>
     * @return The value of the column 'MFWH_ITEM_ID'. (NullAllowed)
     */
    public Long getMfwhItemId() {
        return _mfwhItemId;
    }

    /**
     * [set] MFWH_ITEM_ID: {bigint(19)} <br>
     * @param mfwhItemId The value of the column 'MFWH_ITEM_ID'. (NullAllowed)
     */
    public void setMfwhItemId(Long mfwhItemId) {
        __modifiedProperties.add("mfwhItemId");
        this._mfwhItemId = mfwhItemId;
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
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] SLOTLOCNAME: {varchar(255)} <br>
     * @return The value of the column 'SLOTLOCNAME'. (NullAllowed)
     */
    public String getSlotlocname() {
        return _slotlocname;
    }

    /**
     * [set] SLOTLOCNAME: {varchar(255)} <br>
     * @param slotlocname The value of the column 'SLOTLOCNAME'. (NullAllowed)
     */
    public void setSlotlocname(String slotlocname) {
        __modifiedProperties.add("slotlocname");
        this._slotlocname = slotlocname;
    }

    /**
     * [get] PICKLOCNAME: {varchar(255)} <br>
     * @return The value of the column 'PICKLOCNAME'. (NullAllowed)
     */
    public String getPicklocname() {
        return _picklocname;
    }

    /**
     * [set] PICKLOCNAME: {varchar(255)} <br>
     * @param picklocname The value of the column 'PICKLOCNAME'. (NullAllowed)
     */
    public void setPicklocname(String picklocname) {
        __modifiedProperties.add("picklocname");
        this._picklocname = picklocname;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public java.math.BigDecimal getTransportpriority() {
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        __modifiedProperties.add("transportpriority");
        this._transportpriority = transportpriority;
    }

    /**
     * [get] USERNUM3: {bigint(19)} <br>
     * @return The value of the column 'USERNUM3'. (NullAllowed)
     */
    public Long getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19)} <br>
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed)
     */
    public void setUsernum3(Long usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
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

}
