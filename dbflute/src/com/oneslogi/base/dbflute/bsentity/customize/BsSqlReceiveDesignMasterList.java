package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlReceiveDesignMasterList. <br>
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
 * Long mfrcvdesignId = entity.getMfrcvdesignId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String rcvfrdate = entity.getRcvfrdate();
 * String rcvtodate = entity.getRcvtodate();
 * String validtype = entity.getValidtype();
 * String validTypeNm = entity.getValidTypeNm();
 * String distributioncd = entity.getDistributioncd();
 * String distributionCdNm = entity.getDistributionCdNm();
 * String designflg = entity.getDesignflg();
 * String designFlgNm = entity.getDesignFlgNm();
 * String delFlg = entity.getDelFlg();
 * String delFlgNm = entity.getDelFlgNm();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * Long usernum3 = entity.getUsernum3();
 * entity.setMfrcvdesignId(mfrcvdesignId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setRcvfrdate(rcvfrdate);
 * entity.setRcvtodate(rcvtodate);
 * entity.setValidtype(validtype);
 * entity.setValidTypeNm(validTypeNm);
 * entity.setDistributioncd(distributioncd);
 * entity.setDistributionCdNm(distributionCdNm);
 * entity.setDesignflg(designflg);
 * entity.setDesignFlgNm(designFlgNm);
 * entity.setDelFlg(delFlg);
 * entity.setDelFlgNm(delFlgNm);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUsernum3(usernum3);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlReceiveDesignMasterList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFRCVDESIGN_ID: {bigint(19)} */
    protected Long _mfrcvdesignId;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** RCVFRDATE: {varchar(8)} */
    protected String _rcvfrdate;

    /** RCVTODATE: {varchar(8)} */
    protected String _rcvtodate;

    /** VALIDTYPE: {varchar(30)} */
    protected String _validtype;

    /** VALID_TYPE_NM: {int(10)} */
    protected String _validTypeNm;

    /** DISTRIBUTIONCD: {varchar(30)} */
    protected String _distributioncd;

    /** DISTRIBUTION_CD_NM: {int(10)} */
    protected String _distributionCdNm;

    /** DESIGNFLG: {varchar(30)} */
    protected String _designflg;

    /** DESIGN_FLG_NM: {int(10)} */
    protected String _designFlgNm;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** DEL_FLG_NM: {int(10)} */
    protected String _delFlgNm;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlReceiveDesignMasterListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlReceiveDesignMasterList";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsSqlReceiveDesignMasterList) {
            BsSqlReceiveDesignMasterList other = (BsSqlReceiveDesignMasterList)obj;
            if (!xSV(_mfrcvdesignId, other._mfrcvdesignId)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_rcvfrdate, other._rcvfrdate)) { return false; }
            if (!xSV(_rcvtodate, other._rcvtodate)) { return false; }
            if (!xSV(_validtype, other._validtype)) { return false; }
            if (!xSV(_validTypeNm, other._validTypeNm)) { return false; }
            if (!xSV(_distributioncd, other._distributioncd)) { return false; }
            if (!xSV(_distributionCdNm, other._distributionCdNm)) { return false; }
            if (!xSV(_designflg, other._designflg)) { return false; }
            if (!xSV(_designFlgNm, other._designFlgNm)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_delFlgNm, other._delFlgNm)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_addUser, other._addUser)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mfrcvdesignId);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _rcvfrdate);
        hs = xCH(hs, _rcvtodate);
        hs = xCH(hs, _validtype);
        hs = xCH(hs, _validTypeNm);
        hs = xCH(hs, _distributioncd);
        hs = xCH(hs, _distributionCdNm);
        hs = xCH(hs, _designflg);
        hs = xCH(hs, _designFlgNm);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _delFlgNm);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _addUser);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _usernum3);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mfrcvdesignId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_rcvfrdate));
        sb.append(dm).append(xfND(_rcvtodate));
        sb.append(dm).append(xfND(_validtype));
        sb.append(dm).append(xfND(_validTypeNm));
        sb.append(dm).append(xfND(_distributioncd));
        sb.append(dm).append(xfND(_distributionCdNm));
        sb.append(dm).append(xfND(_designflg));
        sb.append(dm).append(xfND(_designFlgNm));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_delFlgNm));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_usernum3));
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
    public SqlReceiveDesignMasterList clone() {
        return (SqlReceiveDesignMasterList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFRCVDESIGN_ID: {bigint(19)} <br>
     * @return The value of the column 'MFRCVDESIGN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMfrcvdesignId() {
        checkSpecifiedProperty("mfrcvdesignId");
        return _mfrcvdesignId;
    }

    /**
     * [set] MFRCVDESIGN_ID: {bigint(19)} <br>
     * @param mfrcvdesignId The value of the column 'MFRCVDESIGN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMfrcvdesignId(Long mfrcvdesignId) {
        registerModifiedProperty("mfrcvdesignId");
        _mfrcvdesignId = mfrcvdesignId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
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
     * [get] RCVFRDATE: {varchar(8)} <br>
     * @return The value of the column 'RCVFRDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvfrdate() {
        checkSpecifiedProperty("rcvfrdate");
        return convertEmptyToNull(_rcvfrdate);
    }

    /**
     * [set] RCVFRDATE: {varchar(8)} <br>
     * @param rcvfrdate The value of the column 'RCVFRDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvfrdate(String rcvfrdate) {
        registerModifiedProperty("rcvfrdate");
        _rcvfrdate = rcvfrdate;
    }

    /**
     * [get] RCVTODATE: {varchar(8)} <br>
     * @return The value of the column 'RCVTODATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvtodate() {
        checkSpecifiedProperty("rcvtodate");
        return convertEmptyToNull(_rcvtodate);
    }

    /**
     * [set] RCVTODATE: {varchar(8)} <br>
     * @param rcvtodate The value of the column 'RCVTODATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvtodate(String rcvtodate) {
        registerModifiedProperty("rcvtodate");
        _rcvtodate = rcvtodate;
    }

    /**
     * [get] VALIDTYPE: {varchar(30)} <br>
     * @return The value of the column 'VALIDTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getValidtype() {
        checkSpecifiedProperty("validtype");
        return convertEmptyToNull(_validtype);
    }

    /**
     * [set] VALIDTYPE: {varchar(30)} <br>
     * @param validtype The value of the column 'VALIDTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValidtype(String validtype) {
        registerModifiedProperty("validtype");
        _validtype = validtype;
    }

    /**
     * [get] VALID_TYPE_NM: {int(10)} <br>
     * @return The value of the column 'VALID_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getValidTypeNm() {
        checkSpecifiedProperty("validTypeNm");
        return convertEmptyToNull(_validTypeNm);
    }

    /**
     * [set] VALID_TYPE_NM: {int(10)} <br>
     * @param validTypeNm The value of the column 'VALID_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValidTypeNm(String validTypeNm) {
        registerModifiedProperty("validTypeNm");
        _validTypeNm = validTypeNm;
    }

    /**
     * [get] DISTRIBUTIONCD: {varchar(30)} <br>
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistributioncd() {
        checkSpecifiedProperty("distributioncd");
        return convertEmptyToNull(_distributioncd);
    }

    /**
     * [set] DISTRIBUTIONCD: {varchar(30)} <br>
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistributioncd(String distributioncd) {
        registerModifiedProperty("distributioncd");
        _distributioncd = distributioncd;
    }

    /**
     * [get] DISTRIBUTION_CD_NM: {int(10)} <br>
     * @return The value of the column 'DISTRIBUTION_CD_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistributionCdNm() {
        checkSpecifiedProperty("distributionCdNm");
        return convertEmptyToNull(_distributionCdNm);
    }

    /**
     * [set] DISTRIBUTION_CD_NM: {int(10)} <br>
     * @param distributionCdNm The value of the column 'DISTRIBUTION_CD_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistributionCdNm(String distributionCdNm) {
        registerModifiedProperty("distributionCdNm");
        _distributionCdNm = distributionCdNm;
    }

    /**
     * [get] DESIGNFLG: {varchar(30)} <br>
     * @return The value of the column 'DESIGNFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignflg() {
        checkSpecifiedProperty("designflg");
        return convertEmptyToNull(_designflg);
    }

    /**
     * [set] DESIGNFLG: {varchar(30)} <br>
     * @param designflg The value of the column 'DESIGNFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignflg(String designflg) {
        registerModifiedProperty("designflg");
        _designflg = designflg;
    }

    /**
     * [get] DESIGN_FLG_NM: {int(10)} <br>
     * @return The value of the column 'DESIGN_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignFlgNm() {
        checkSpecifiedProperty("designFlgNm");
        return convertEmptyToNull(_designFlgNm);
    }

    /**
     * [set] DESIGN_FLG_NM: {int(10)} <br>
     * @param designFlgNm The value of the column 'DESIGN_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignFlgNm(String designFlgNm) {
        registerModifiedProperty("designFlgNm");
        _designFlgNm = designFlgNm;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] DEL_FLG_NM: {int(10)} <br>
     * @return The value of the column 'DEL_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlgNm() {
        checkSpecifiedProperty("delFlgNm");
        return convertEmptyToNull(_delFlgNm);
    }

    /**
     * [set] DEL_FLG_NM: {int(10)} <br>
     * @param delFlgNm The value of the column 'DEL_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlgNm(String delFlgNm) {
        registerModifiedProperty("delFlgNm");
        _delFlgNm = delFlgNm;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
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
}
