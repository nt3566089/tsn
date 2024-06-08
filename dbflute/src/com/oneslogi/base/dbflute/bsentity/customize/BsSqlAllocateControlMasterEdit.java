package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlAllocateControlMasterEdit. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFPICKCTL_ID, PRODUCT_CD, PRODUCT_NM, PICKFRDATE, PICKTODATE, VALIDTYPE, PICKRANK1, PICKRANK2, PICKRANK3, PICKRANK4, PICKRANK5, UPD_DT, UPD_USER, CLIENT_CD, CLIENT_ID, CENTER_CD, CENTER_ID, VERSION_NO, DEL_FLG
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
 * String pickrank1 = entity.getPickrank1();
 * String pickrank2 = entity.getPickrank2();
 * String pickrank3 = entity.getPickrank3();
 * String pickrank4 = entity.getPickrank4();
 * String pickrank5 = entity.getPickrank5();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String clientCd = entity.getClientCd();
 * Long clientId = entity.getClientId();
 * String centerCd = entity.getCenterCd();
 * Long centerId = entity.getCenterId();
 * Long versionNo = entity.getVersionNo();
 * String delFlg = entity.getDelFlg();
 * entity.setMfpickctlId(mfpickctlId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setPickfrdate(pickfrdate);
 * entity.setPicktodate(picktodate);
 * entity.setValidtype(validtype);
 * entity.setPickrank1(pickrank1);
 * entity.setPickrank2(pickrank2);
 * entity.setPickrank3(pickrank3);
 * entity.setPickrank4(pickrank4);
 * entity.setPickrank5(pickrank5);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setClientCd(clientCd);
 * entity.setClientId(clientId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterId(centerId);
 * entity.setVersionNo(versionNo);
 * entity.setDelFlg(delFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlAllocateControlMasterEdit extends AbstractEntity implements CustomizeEntity {

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

    /** PICKRANK1: {varchar(30)} */
    protected String _pickrank1;

    /** PICKRANK2: {varchar(30)} */
    protected String _pickrank2;

    /** PICKRANK3: {varchar(30)} */
    protected String _pickrank3;

    /** PICKRANK4: {varchar(30)} */
    protected String _pickrank4;

    /** PICKRANK5: {varchar(30)} */
    protected String _pickrank5;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlAllocateControlMasterEditDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlAllocateControlMasterEdit";
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
        if (obj instanceof BsSqlAllocateControlMasterEdit) {
            BsSqlAllocateControlMasterEdit other = (BsSqlAllocateControlMasterEdit)obj;
            if (!xSV(_mfpickctlId, other._mfpickctlId)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_pickfrdate, other._pickfrdate)) { return false; }
            if (!xSV(_picktodate, other._picktodate)) { return false; }
            if (!xSV(_validtype, other._validtype)) { return false; }
            if (!xSV(_pickrank1, other._pickrank1)) { return false; }
            if (!xSV(_pickrank2, other._pickrank2)) { return false; }
            if (!xSV(_pickrank3, other._pickrank3)) { return false; }
            if (!xSV(_pickrank4, other._pickrank4)) { return false; }
            if (!xSV(_pickrank5, other._pickrank5)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
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
        hs = xCH(hs, _pickrank1);
        hs = xCH(hs, _pickrank2);
        hs = xCH(hs, _pickrank3);
        hs = xCH(hs, _pickrank4);
        hs = xCH(hs, _pickrank5);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _delFlg);
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
        sb.append(dm).append(xfND(_pickrank1));
        sb.append(dm).append(xfND(_pickrank2));
        sb.append(dm).append(xfND(_pickrank3));
        sb.append(dm).append(xfND(_pickrank4));
        sb.append(dm).append(xfND(_pickrank5));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_delFlg));
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
    public SqlAllocateControlMasterEdit clone() {
        return (SqlAllocateControlMasterEdit)super.clone();
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
}
