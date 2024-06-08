package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlCenterProductControlMasterList. <br>
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
 * Long mfwhItemId = entity.getMfwhItemId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String slotlocname = entity.getSlotlocname();
 * String picklocname = entity.getPicklocname();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * java.math.BigDecimal transportpriority = entity.getTransportpriority();
 * Long usernum3 = entity.getUsernum3();
 * Long usernum1 = entity.getUsernum1();
 * entity.setMfwhItemId(mfwhItemId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setSlotlocname(slotlocname);
 * entity.setPicklocname(picklocname);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setTransportpriority(transportpriority);
 * entity.setUsernum3(usernum3);
 * entity.setUsernum1(usernum1);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlCenterProductControlMasterList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFWH_ITEM_ID: {bigint(19)} */
    protected Long _mfwhItemId;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** SLOTLOCNAME: {varchar(255)} */
    protected String _slotlocname;

    /** PICKLOCNAME: {varchar(255)} */
    protected String _picklocname;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** TRANSPORTPRIORITY: {decimal(16, 6)} */
    protected java.math.BigDecimal _transportpriority;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** USERNUM1: {bigint(19)} */
    protected Long _usernum1;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlCenterProductControlMasterListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlCenterProductControlMasterList";
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
        if (obj instanceof BsSqlCenterProductControlMasterList) {
            BsSqlCenterProductControlMasterList other = (BsSqlCenterProductControlMasterList)obj;
            if (!xSV(_mfwhItemId, other._mfwhItemId)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_slotlocname, other._slotlocname)) { return false; }
            if (!xSV(_picklocname, other._picklocname)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_transportpriority, other._transportpriority)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_usernum1, other._usernum1)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mfwhItemId);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _slotlocname);
        hs = xCH(hs, _picklocname);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _transportpriority);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _usernum1);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mfwhItemId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_slotlocname));
        sb.append(dm).append(xfND(_picklocname));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_transportpriority));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_usernum1));
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
    public SqlCenterProductControlMasterList clone() {
        return (SqlCenterProductControlMasterList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFWH_ITEM_ID: {bigint(19)} <br>
     * @return The value of the column 'MFWH_ITEM_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMfwhItemId() {
        checkSpecifiedProperty("mfwhItemId");
        return _mfwhItemId;
    }

    /**
     * [set] MFWH_ITEM_ID: {bigint(19)} <br>
     * @param mfwhItemId The value of the column 'MFWH_ITEM_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMfwhItemId(Long mfwhItemId) {
        registerModifiedProperty("mfwhItemId");
        _mfwhItemId = mfwhItemId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] SLOTLOCNAME: {varchar(255)} <br>
     * @return The value of the column 'SLOTLOCNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlotlocname() {
        checkSpecifiedProperty("slotlocname");
        return convertEmptyToNull(_slotlocname);
    }

    /**
     * [set] SLOTLOCNAME: {varchar(255)} <br>
     * @param slotlocname The value of the column 'SLOTLOCNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlotlocname(String slotlocname) {
        registerModifiedProperty("slotlocname");
        _slotlocname = slotlocname;
    }

    /**
     * [get] PICKLOCNAME: {varchar(255)} <br>
     * @return The value of the column 'PICKLOCNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicklocname() {
        checkSpecifiedProperty("picklocname");
        return convertEmptyToNull(_picklocname);
    }

    /**
     * [set] PICKLOCNAME: {varchar(255)} <br>
     * @param picklocname The value of the column 'PICKLOCNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklocname(String picklocname) {
        registerModifiedProperty("picklocname");
        _picklocname = picklocname;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransportpriority() {
        checkSpecifiedProperty("transportpriority");
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        registerModifiedProperty("transportpriority");
        _transportpriority = transportpriority;
    }

    /**
     * [get] USERNUM3: {bigint(19)} <br>
     * @return The value of the column 'USERNUM3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum3() {
        checkSpecifiedProperty("usernum3");
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19)} <br>
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum3(Long usernum3) {
        registerModifiedProperty("usernum3");
        _usernum3 = usernum3;
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
}
