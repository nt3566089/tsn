package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlReceiveDesignMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFRCVDESIGN_ID, PRODUCT_CD, PRODUCT_NM, RCVFRDATE, RCVTODATE, VALIDTYPE, VALID_TYPE_NM, DISTRIBUTIONCD, DISTRIBUTION_CD_NM, DESIGNFLG, DESIGN_FLG_NM, DEL_FLG, DEL_FLG_NM, ADD_DT, ADD_USER, UPD_DT, UPD_USER, USERNUM3
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
public abstract class BsSqlReceiveDesignMasterListDto implements Serializable {

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
    /** MFRCVDESIGN_ID: {bigint(19)} */
    @JsonKey
    protected Long _mfrcvdesignId;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** RCVFRDATE: {varchar(8)} */
    @JsonKey
    protected String _rcvfrdate;

    /** RCVTODATE: {varchar(8)} */
    @JsonKey
    protected String _rcvtodate;

    /** VALIDTYPE: {varchar(30)} */
    @JsonKey
    protected String _validtype;

    /** VALID_TYPE_NM: {int(10)} */
    @JsonKey
    protected String _validTypeNm;

    /** DISTRIBUTIONCD: {varchar(30)} */
    @JsonKey
    protected String _distributioncd;

    /** DISTRIBUTION_CD_NM: {int(10)} */
    @JsonKey
    protected String _distributionCdNm;

    /** DESIGNFLG: {varchar(30)} */
    @JsonKey
    protected String _designflg;

    /** DESIGN_FLG_NM: {int(10)} */
    @JsonKey
    protected String _designFlgNm;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** DEL_FLG_NM: {int(10)} */
    @JsonKey
    protected String _delFlgNm;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlReceiveDesignMasterListDto() {
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
        if (other == null || !(other instanceof BsSqlReceiveDesignMasterListDto)) { return false; }
        final BsSqlReceiveDesignMasterListDto otherEntity = (BsSqlReceiveDesignMasterListDto)other;
        if (!helpComparingValue(getMfrcvdesignId(), otherEntity.getMfrcvdesignId())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getRcvfrdate(), otherEntity.getRcvfrdate())) { return false; }
        if (!helpComparingValue(getRcvtodate(), otherEntity.getRcvtodate())) { return false; }
        if (!helpComparingValue(getValidtype(), otherEntity.getValidtype())) { return false; }
        if (!helpComparingValue(getValidTypeNm(), otherEntity.getValidTypeNm())) { return false; }
        if (!helpComparingValue(getDistributioncd(), otherEntity.getDistributioncd())) { return false; }
        if (!helpComparingValue(getDistributionCdNm(), otherEntity.getDistributionCdNm())) { return false; }
        if (!helpComparingValue(getDesignflg(), otherEntity.getDesignflg())) { return false; }
        if (!helpComparingValue(getDesignFlgNm(), otherEntity.getDesignFlgNm())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getDelFlgNm(), otherEntity.getDelFlgNm())) { return false; }
        if (!helpComparingValue(getAddDt(), otherEntity.getAddDt())) { return false; }
        if (!helpComparingValue(getAddUser(), otherEntity.getAddUser())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlReceiveDesignMasterList");
        result = xCH(result, getMfrcvdesignId());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getRcvfrdate());
        result = xCH(result, getRcvtodate());
        result = xCH(result, getValidtype());
        result = xCH(result, getValidTypeNm());
        result = xCH(result, getDistributioncd());
        result = xCH(result, getDistributionCdNm());
        result = xCH(result, getDesignflg());
        result = xCH(result, getDesignFlgNm());
        result = xCH(result, getDelFlg());
        result = xCH(result, getDelFlgNm());
        result = xCH(result, getAddDt());
        result = xCH(result, getAddUser());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getUsernum3());
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
        sb.append(c).append(getMfrcvdesignId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getRcvfrdate());
        sb.append(c).append(getRcvtodate());
        sb.append(c).append(getValidtype());
        sb.append(c).append(getValidTypeNm());
        sb.append(c).append(getDistributioncd());
        sb.append(c).append(getDistributionCdNm());
        sb.append(c).append(getDesignflg());
        sb.append(c).append(getDesignFlgNm());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getDelFlgNm());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUsernum3());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFRCVDESIGN_ID: {bigint(19)} <br>
     * @return The value of the column 'MFRCVDESIGN_ID'. (NullAllowed)
     */
    public Long getMfrcvdesignId() {
        return _mfrcvdesignId;
    }

    /**
     * [set] MFRCVDESIGN_ID: {bigint(19)} <br>
     * @param mfrcvdesignId The value of the column 'MFRCVDESIGN_ID'. (NullAllowed)
     */
    public void setMfrcvdesignId(Long mfrcvdesignId) {
        __modifiedProperties.add("mfrcvdesignId");
        this._mfrcvdesignId = mfrcvdesignId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
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
     * [get] RCVFRDATE: {varchar(8)} <br>
     * @return The value of the column 'RCVFRDATE'. (NullAllowed)
     */
    public String getRcvfrdate() {
        return _rcvfrdate;
    }

    /**
     * [set] RCVFRDATE: {varchar(8)} <br>
     * @param rcvfrdate The value of the column 'RCVFRDATE'. (NullAllowed)
     */
    public void setRcvfrdate(String rcvfrdate) {
        __modifiedProperties.add("rcvfrdate");
        this._rcvfrdate = rcvfrdate;
    }

    /**
     * [get] RCVTODATE: {varchar(8)} <br>
     * @return The value of the column 'RCVTODATE'. (NullAllowed)
     */
    public String getRcvtodate() {
        return _rcvtodate;
    }

    /**
     * [set] RCVTODATE: {varchar(8)} <br>
     * @param rcvtodate The value of the column 'RCVTODATE'. (NullAllowed)
     */
    public void setRcvtodate(String rcvtodate) {
        __modifiedProperties.add("rcvtodate");
        this._rcvtodate = rcvtodate;
    }

    /**
     * [get] VALIDTYPE: {varchar(30)} <br>
     * @return The value of the column 'VALIDTYPE'. (NullAllowed)
     */
    public String getValidtype() {
        return _validtype;
    }

    /**
     * [set] VALIDTYPE: {varchar(30)} <br>
     * @param validtype The value of the column 'VALIDTYPE'. (NullAllowed)
     */
    public void setValidtype(String validtype) {
        __modifiedProperties.add("validtype");
        this._validtype = validtype;
    }

    /**
     * [get] VALID_TYPE_NM: {int(10)} <br>
     * @return The value of the column 'VALID_TYPE_NM'. (NullAllowed)
     */
    public String getValidTypeNm() {
        return _validTypeNm;
    }

    /**
     * [set] VALID_TYPE_NM: {int(10)} <br>
     * @param validTypeNm The value of the column 'VALID_TYPE_NM'. (NullAllowed)
     */
    public void setValidTypeNm(String validTypeNm) {
        __modifiedProperties.add("validTypeNm");
        this._validTypeNm = validTypeNm;
    }

    /**
     * [get] DISTRIBUTIONCD: {varchar(30)} <br>
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public String getDistributioncd() {
        return _distributioncd;
    }

    /**
     * [set] DISTRIBUTIONCD: {varchar(30)} <br>
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public void setDistributioncd(String distributioncd) {
        __modifiedProperties.add("distributioncd");
        this._distributioncd = distributioncd;
    }

    /**
     * [get] DISTRIBUTION_CD_NM: {int(10)} <br>
     * @return The value of the column 'DISTRIBUTION_CD_NM'. (NullAllowed)
     */
    public String getDistributionCdNm() {
        return _distributionCdNm;
    }

    /**
     * [set] DISTRIBUTION_CD_NM: {int(10)} <br>
     * @param distributionCdNm The value of the column 'DISTRIBUTION_CD_NM'. (NullAllowed)
     */
    public void setDistributionCdNm(String distributionCdNm) {
        __modifiedProperties.add("distributionCdNm");
        this._distributionCdNm = distributionCdNm;
    }

    /**
     * [get] DESIGNFLG: {varchar(30)} <br>
     * @return The value of the column 'DESIGNFLG'. (NullAllowed)
     */
    public String getDesignflg() {
        return _designflg;
    }

    /**
     * [set] DESIGNFLG: {varchar(30)} <br>
     * @param designflg The value of the column 'DESIGNFLG'. (NullAllowed)
     */
    public void setDesignflg(String designflg) {
        __modifiedProperties.add("designflg");
        this._designflg = designflg;
    }

    /**
     * [get] DESIGN_FLG_NM: {int(10)} <br>
     * @return The value of the column 'DESIGN_FLG_NM'. (NullAllowed)
     */
    public String getDesignFlgNm() {
        return _designFlgNm;
    }

    /**
     * [set] DESIGN_FLG_NM: {int(10)} <br>
     * @param designFlgNm The value of the column 'DESIGN_FLG_NM'. (NullAllowed)
     */
    public void setDesignFlgNm(String designFlgNm) {
        __modifiedProperties.add("designFlgNm");
        this._designFlgNm = designFlgNm;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] DEL_FLG_NM: {int(10)} <br>
     * @return The value of the column 'DEL_FLG_NM'. (NullAllowed)
     */
    public String getDelFlgNm() {
        return _delFlgNm;
    }

    /**
     * [set] DEL_FLG_NM: {int(10)} <br>
     * @param delFlgNm The value of the column 'DEL_FLG_NM'. (NullAllowed)
     */
    public void setDelFlgNm(String delFlgNm) {
        __modifiedProperties.add("delFlgNm");
        this._delFlgNm = delFlgNm;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
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

}
