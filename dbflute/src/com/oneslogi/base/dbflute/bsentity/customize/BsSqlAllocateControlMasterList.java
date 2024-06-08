package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlAllocateControlMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFPICKCTL_ID, PRODUCT_CD, PRODUCT_NM, PICKFRDATE, PICKTODATE, VALIDTYPE, VALIDTYPE_NM, PICKRANK1, PICKRANK1_NM, PICKRANK2, PICKRANK2_NM, PICKRANK3, PICKRANK3_NM, PICKRANK4, PICKRANK4_NM, PICKRANK5, PICKRANK5_NM, UPD_DT, UPD_USER, CLIENT_CD, CLIENT_NM, CLIENT_ID, CENTER_CD, CENTER_NM, VERSION_NO
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
 * Long mfpickctlId = entity.getMfpickctlId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String pickfrdate = entity.getPickfrdate();
 * String picktodate = entity.getPicktodate();
 * String validtype = entity.getValidtype();
 * String validtypeNm = entity.getValidtypeNm();
 * String pickrank1 = entity.getPickrank1();
 * String pickrank1Nm = entity.getPickrank1Nm();
 * String pickrank2 = entity.getPickrank2();
 * String pickrank2Nm = entity.getPickrank2Nm();
 * String pickrank3 = entity.getPickrank3();
 * String pickrank3Nm = entity.getPickrank3Nm();
 * String pickrank4 = entity.getPickrank4();
 * String pickrank4Nm = entity.getPickrank4Nm();
 * String pickrank5 = entity.getPickrank5();
 * String pickrank5Nm = entity.getPickrank5Nm();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long clientId = entity.getClientId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * Long versionNo = entity.getVersionNo();
 * entity.setMfpickctlId(mfpickctlId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setPickfrdate(pickfrdate);
 * entity.setPicktodate(picktodate);
 * entity.setValidtype(validtype);
 * entity.setValidtypeNm(validtypeNm);
 * entity.setPickrank1(pickrank1);
 * entity.setPickrank1Nm(pickrank1Nm);
 * entity.setPickrank2(pickrank2);
 * entity.setPickrank2Nm(pickrank2Nm);
 * entity.setPickrank3(pickrank3);
 * entity.setPickrank3Nm(pickrank3Nm);
 * entity.setPickrank4(pickrank4);
 * entity.setPickrank4Nm(pickrank4Nm);
 * entity.setPickrank5(pickrank5);
 * entity.setPickrank5Nm(pickrank5Nm);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setClientId(clientId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlAllocateControlMasterList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFPICKCTL_ID: {bigint(19)} */
    protected Long _mfpickctlId;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** PICKFRDATE: {varchar(8)} */
    protected String _pickfrdate;

    /** PICKTODATE: {varchar(8)} */
    protected String _picktodate;

    /** VALIDTYPE: {varchar(30)} */
    protected String _validtype;

    /** VALIDTYPE_NM: {int(10)} */
    protected String _validtypeNm;

    /** PICKRANK1: {varchar(30)} */
    protected String _pickrank1;

    /** PICKRANK1_NM: {int(10)} */
    protected String _pickrank1Nm;

    /** PICKRANK2: {varchar(30)} */
    protected String _pickrank2;

    /** PICKRANK2_NM: {int(10)} */
    protected String _pickrank2Nm;

    /** PICKRANK3: {varchar(30)} */
    protected String _pickrank3;

    /** PICKRANK3_NM: {int(10)} */
    protected String _pickrank3Nm;

    /** PICKRANK4: {varchar(30)} */
    protected String _pickrank4;

    /** PICKRANK4_NM: {int(10)} */
    protected String _pickrank4Nm;

    /** PICKRANK5: {varchar(30)} */
    protected String _pickrank5;

    /** PICKRANK5_NM: {int(10)} */
    protected String _pickrank5Nm;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlAllocateControlMasterListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlAllocateControlMasterList";
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
        if (obj instanceof BsSqlAllocateControlMasterList) {
            BsSqlAllocateControlMasterList other = (BsSqlAllocateControlMasterList)obj;
            if (!xSV(_mfpickctlId, other._mfpickctlId)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_pickfrdate, other._pickfrdate)) { return false; }
            if (!xSV(_picktodate, other._picktodate)) { return false; }
            if (!xSV(_validtype, other._validtype)) { return false; }
            if (!xSV(_validtypeNm, other._validtypeNm)) { return false; }
            if (!xSV(_pickrank1, other._pickrank1)) { return false; }
            if (!xSV(_pickrank1Nm, other._pickrank1Nm)) { return false; }
            if (!xSV(_pickrank2, other._pickrank2)) { return false; }
            if (!xSV(_pickrank2Nm, other._pickrank2Nm)) { return false; }
            if (!xSV(_pickrank3, other._pickrank3)) { return false; }
            if (!xSV(_pickrank3Nm, other._pickrank3Nm)) { return false; }
            if (!xSV(_pickrank4, other._pickrank4)) { return false; }
            if (!xSV(_pickrank4Nm, other._pickrank4Nm)) { return false; }
            if (!xSV(_pickrank5, other._pickrank5)) { return false; }
            if (!xSV(_pickrank5Nm, other._pickrank5Nm)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mfpickctlId);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _pickfrdate);
        hs = xCH(hs, _picktodate);
        hs = xCH(hs, _validtype);
        hs = xCH(hs, _validtypeNm);
        hs = xCH(hs, _pickrank1);
        hs = xCH(hs, _pickrank1Nm);
        hs = xCH(hs, _pickrank2);
        hs = xCH(hs, _pickrank2Nm);
        hs = xCH(hs, _pickrank3);
        hs = xCH(hs, _pickrank3Nm);
        hs = xCH(hs, _pickrank4);
        hs = xCH(hs, _pickrank4Nm);
        hs = xCH(hs, _pickrank5);
        hs = xCH(hs, _pickrank5Nm);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _versionNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mfpickctlId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_pickfrdate));
        sb.append(dm).append(xfND(_picktodate));
        sb.append(dm).append(xfND(_validtype));
        sb.append(dm).append(xfND(_validtypeNm));
        sb.append(dm).append(xfND(_pickrank1));
        sb.append(dm).append(xfND(_pickrank1Nm));
        sb.append(dm).append(xfND(_pickrank2));
        sb.append(dm).append(xfND(_pickrank2Nm));
        sb.append(dm).append(xfND(_pickrank3));
        sb.append(dm).append(xfND(_pickrank3Nm));
        sb.append(dm).append(xfND(_pickrank4));
        sb.append(dm).append(xfND(_pickrank4Nm));
        sb.append(dm).append(xfND(_pickrank5));
        sb.append(dm).append(xfND(_pickrank5Nm));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_versionNo));
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
    public SqlAllocateControlMasterList clone() {
        return (SqlAllocateControlMasterList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFPICKCTL_ID: {bigint(19)} <br>
     * @return The value of the column 'MFPICKCTL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMfpickctlId() {
        checkSpecifiedProperty("mfpickctlId");
        return _mfpickctlId;
    }

    /**
     * [set] MFPICKCTL_ID: {bigint(19)} <br>
     * @param mfpickctlId The value of the column 'MFPICKCTL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMfpickctlId(Long mfpickctlId) {
        registerModifiedProperty("mfpickctlId");
        _mfpickctlId = mfpickctlId;
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
     * [get] PICKFRDATE: {varchar(8)} <br>
     * @return The value of the column 'PICKFRDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickfrdate() {
        checkSpecifiedProperty("pickfrdate");
        return convertEmptyToNull(_pickfrdate);
    }

    /**
     * [set] PICKFRDATE: {varchar(8)} <br>
     * @param pickfrdate The value of the column 'PICKFRDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickfrdate(String pickfrdate) {
        registerModifiedProperty("pickfrdate");
        _pickfrdate = pickfrdate;
    }

    /**
     * [get] PICKTODATE: {varchar(8)} <br>
     * @return The value of the column 'PICKTODATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicktodate() {
        checkSpecifiedProperty("picktodate");
        return convertEmptyToNull(_picktodate);
    }

    /**
     * [set] PICKTODATE: {varchar(8)} <br>
     * @param picktodate The value of the column 'PICKTODATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicktodate(String picktodate) {
        registerModifiedProperty("picktodate");
        _picktodate = picktodate;
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
     * [get] VALIDTYPE_NM: {int(10)} <br>
     * @return The value of the column 'VALIDTYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getValidtypeNm() {
        checkSpecifiedProperty("validtypeNm");
        return convertEmptyToNull(_validtypeNm);
    }

    /**
     * [set] VALIDTYPE_NM: {int(10)} <br>
     * @param validtypeNm The value of the column 'VALIDTYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValidtypeNm(String validtypeNm) {
        registerModifiedProperty("validtypeNm");
        _validtypeNm = validtypeNm;
    }

    /**
     * [get] PICKRANK1: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank1() {
        checkSpecifiedProperty("pickrank1");
        return convertEmptyToNull(_pickrank1);
    }

    /**
     * [set] PICKRANK1: {varchar(30)} <br>
     * @param pickrank1 The value of the column 'PICKRANK1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank1(String pickrank1) {
        registerModifiedProperty("pickrank1");
        _pickrank1 = pickrank1;
    }

    /**
     * [get] PICKRANK1_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK1_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank1Nm() {
        checkSpecifiedProperty("pickrank1Nm");
        return convertEmptyToNull(_pickrank1Nm);
    }

    /**
     * [set] PICKRANK1_NM: {int(10)} <br>
     * @param pickrank1Nm The value of the column 'PICKRANK1_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank1Nm(String pickrank1Nm) {
        registerModifiedProperty("pickrank1Nm");
        _pickrank1Nm = pickrank1Nm;
    }

    /**
     * [get] PICKRANK2: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank2() {
        checkSpecifiedProperty("pickrank2");
        return convertEmptyToNull(_pickrank2);
    }

    /**
     * [set] PICKRANK2: {varchar(30)} <br>
     * @param pickrank2 The value of the column 'PICKRANK2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank2(String pickrank2) {
        registerModifiedProperty("pickrank2");
        _pickrank2 = pickrank2;
    }

    /**
     * [get] PICKRANK2_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK2_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank2Nm() {
        checkSpecifiedProperty("pickrank2Nm");
        return convertEmptyToNull(_pickrank2Nm);
    }

    /**
     * [set] PICKRANK2_NM: {int(10)} <br>
     * @param pickrank2Nm The value of the column 'PICKRANK2_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank2Nm(String pickrank2Nm) {
        registerModifiedProperty("pickrank2Nm");
        _pickrank2Nm = pickrank2Nm;
    }

    /**
     * [get] PICKRANK3: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK3'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank3() {
        checkSpecifiedProperty("pickrank3");
        return convertEmptyToNull(_pickrank3);
    }

    /**
     * [set] PICKRANK3: {varchar(30)} <br>
     * @param pickrank3 The value of the column 'PICKRANK3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank3(String pickrank3) {
        registerModifiedProperty("pickrank3");
        _pickrank3 = pickrank3;
    }

    /**
     * [get] PICKRANK3_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK3_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank3Nm() {
        checkSpecifiedProperty("pickrank3Nm");
        return convertEmptyToNull(_pickrank3Nm);
    }

    /**
     * [set] PICKRANK3_NM: {int(10)} <br>
     * @param pickrank3Nm The value of the column 'PICKRANK3_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank3Nm(String pickrank3Nm) {
        registerModifiedProperty("pickrank3Nm");
        _pickrank3Nm = pickrank3Nm;
    }

    /**
     * [get] PICKRANK4: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK4'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank4() {
        checkSpecifiedProperty("pickrank4");
        return convertEmptyToNull(_pickrank4);
    }

    /**
     * [set] PICKRANK4: {varchar(30)} <br>
     * @param pickrank4 The value of the column 'PICKRANK4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank4(String pickrank4) {
        registerModifiedProperty("pickrank4");
        _pickrank4 = pickrank4;
    }

    /**
     * [get] PICKRANK4_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK4_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank4Nm() {
        checkSpecifiedProperty("pickrank4Nm");
        return convertEmptyToNull(_pickrank4Nm);
    }

    /**
     * [set] PICKRANK4_NM: {int(10)} <br>
     * @param pickrank4Nm The value of the column 'PICKRANK4_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank4Nm(String pickrank4Nm) {
        registerModifiedProperty("pickrank4Nm");
        _pickrank4Nm = pickrank4Nm;
    }

    /**
     * [get] PICKRANK5: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK5'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank5() {
        checkSpecifiedProperty("pickrank5");
        return convertEmptyToNull(_pickrank5);
    }

    /**
     * [set] PICKRANK5: {varchar(30)} <br>
     * @param pickrank5 The value of the column 'PICKRANK5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank5(String pickrank5) {
        registerModifiedProperty("pickrank5");
        _pickrank5 = pickrank5;
    }

    /**
     * [get] PICKRANK5_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK5_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank5Nm() {
        checkSpecifiedProperty("pickrank5Nm");
        return convertEmptyToNull(_pickrank5Nm);
    }

    /**
     * [set] PICKRANK5_NM: {int(10)} <br>
     * @param pickrank5Nm The value of the column 'PICKRANK5_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank5Nm(String pickrank5Nm) {
        registerModifiedProperty("pickrank5Nm");
        _pickrank5Nm = pickrank5Nm;
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
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
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
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
