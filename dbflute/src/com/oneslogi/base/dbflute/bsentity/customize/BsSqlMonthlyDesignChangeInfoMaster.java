package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlMonthlyDesignChangeInfoMaster. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_CD, PRODUCT_NM, SOTEDUNIT, SOTEDUNIT_NM, LIMITDATE, DESIGNFLG, DESIGNFLG_NM, SOTEDLOC, PICKLISTKEY, PICKLISTGNO, UPD_DT, UPD_USER, DEL_FLG, DEL_FLG_NM, MFMONTHCHG_ID, VERSION_NO, CENTER_ID, SORT
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
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String sotedunit = entity.getSotedunit();
 * String sotedunitNm = entity.getSotedunitNm();
 * String limitdate = entity.getLimitdate();
 * String designflg = entity.getDesignflg();
 * String designflgNm = entity.getDesignflgNm();
 * String sotedloc = entity.getSotedloc();
 * Long picklistkey = entity.getPicklistkey();
 * Long picklistgno = entity.getPicklistgno();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String delFlg = entity.getDelFlg();
 * String delFlgNm = entity.getDelFlgNm();
 * Long mfmonthchgId = entity.getMfmonthchgId();
 * Long versionNo = entity.getVersionNo();
 * Long centerId = entity.getCenterId();
 * Integer sort = entity.getSort();
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setSotedunit(sotedunit);
 * entity.setSotedunitNm(sotedunitNm);
 * entity.setLimitdate(limitdate);
 * entity.setDesignflg(designflg);
 * entity.setDesignflgNm(designflgNm);
 * entity.setSotedloc(sotedloc);
 * entity.setPicklistkey(picklistkey);
 * entity.setPicklistgno(picklistgno);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setDelFlg(delFlg);
 * entity.setDelFlgNm(delFlgNm);
 * entity.setMfmonthchgId(mfmonthchgId);
 * entity.setVersionNo(versionNo);
 * entity.setCenterId(centerId);
 * entity.setSort(sort);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlMonthlyDesignChangeInfoMaster extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** SOTEDUNIT: {varchar(30)} */
    protected String _sotedunit;

    /** SOTEDUNIT_NM: {int(10)} */
    protected String _sotedunitNm;

    /** LIMITDATE: {varchar(8)} */
    protected String _limitdate;

    /** DESIGNFLG: {varchar(30)} */
    protected String _designflg;

    /** DESIGNFLG_NM: {int(10)} */
    protected String _designflgNm;

    /** SOTEDLOC: {varchar(30)} */
    protected String _sotedloc;

    /** PICKLISTKEY: {bigint(19)} */
    protected Long _picklistkey;

    /** PICKLISTGNO: {bigint(19)} */
    protected Long _picklistgno;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** DEL_FLG_NM: {int(10)} */
    protected String _delFlgNm;

    /** MFMONTHCHG_ID: {bigint(19)} */
    protected Long _mfmonthchgId;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** SORT: {int(10)} */
    protected Integer _sort;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlMonthlyDesignChangeInfoMasterDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlMonthlyDesignChangeInfoMaster";
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
        if (obj instanceof BsSqlMonthlyDesignChangeInfoMaster) {
            BsSqlMonthlyDesignChangeInfoMaster other = (BsSqlMonthlyDesignChangeInfoMaster)obj;
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_sotedunit, other._sotedunit)) { return false; }
            if (!xSV(_sotedunitNm, other._sotedunitNm)) { return false; }
            if (!xSV(_limitdate, other._limitdate)) { return false; }
            if (!xSV(_designflg, other._designflg)) { return false; }
            if (!xSV(_designflgNm, other._designflgNm)) { return false; }
            if (!xSV(_sotedloc, other._sotedloc)) { return false; }
            if (!xSV(_picklistkey, other._picklistkey)) { return false; }
            if (!xSV(_picklistgno, other._picklistgno)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_delFlgNm, other._delFlgNm)) { return false; }
            if (!xSV(_mfmonthchgId, other._mfmonthchgId)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_sort, other._sort)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _sotedunit);
        hs = xCH(hs, _sotedunitNm);
        hs = xCH(hs, _limitdate);
        hs = xCH(hs, _designflg);
        hs = xCH(hs, _designflgNm);
        hs = xCH(hs, _sotedloc);
        hs = xCH(hs, _picklistkey);
        hs = xCH(hs, _picklistgno);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _delFlgNm);
        hs = xCH(hs, _mfmonthchgId);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _sort);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_sotedunit));
        sb.append(dm).append(xfND(_sotedunitNm));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_designflg));
        sb.append(dm).append(xfND(_designflgNm));
        sb.append(dm).append(xfND(_sotedloc));
        sb.append(dm).append(xfND(_picklistkey));
        sb.append(dm).append(xfND(_picklistgno));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_delFlgNm));
        sb.append(dm).append(xfND(_mfmonthchgId));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_sort));
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
    public SqlMonthlyDesignChangeInfoMaster clone() {
        return (SqlMonthlyDesignChangeInfoMaster)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] SOTEDUNIT: {varchar(30)} <br>
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotedunit() {
        checkSpecifiedProperty("sotedunit");
        return convertEmptyToNull(_sotedunit);
    }

    /**
     * [set] SOTEDUNIT: {varchar(30)} <br>
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedunit(String sotedunit) {
        registerModifiedProperty("sotedunit");
        _sotedunit = sotedunit;
    }

    /**
     * [get] SOTEDUNIT_NM: {int(10)} <br>
     * @return The value of the column 'SOTEDUNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotedunitNm() {
        checkSpecifiedProperty("sotedunitNm");
        return convertEmptyToNull(_sotedunitNm);
    }

    /**
     * [set] SOTEDUNIT_NM: {int(10)} <br>
     * @param sotedunitNm The value of the column 'SOTEDUNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedunitNm(String sotedunitNm) {
        registerModifiedProperty("sotedunitNm");
        _sotedunitNm = sotedunitNm;
    }

    /**
     * [get] LIMITDATE: {varchar(8)} <br>
     * @return The value of the column 'LIMITDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {varchar(8)} <br>
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
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
     * [get] DESIGNFLG_NM: {int(10)} <br>
     * @return The value of the column 'DESIGNFLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignflgNm() {
        checkSpecifiedProperty("designflgNm");
        return convertEmptyToNull(_designflgNm);
    }

    /**
     * [set] DESIGNFLG_NM: {int(10)} <br>
     * @param designflgNm The value of the column 'DESIGNFLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignflgNm(String designflgNm) {
        registerModifiedProperty("designflgNm");
        _designflgNm = designflgNm;
    }

    /**
     * [get] SOTEDLOC: {varchar(30)} <br>
     * @return The value of the column 'SOTEDLOC'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotedloc() {
        checkSpecifiedProperty("sotedloc");
        return convertEmptyToNull(_sotedloc);
    }

    /**
     * [set] SOTEDLOC: {varchar(30)} <br>
     * @param sotedloc The value of the column 'SOTEDLOC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedloc(String sotedloc) {
        registerModifiedProperty("sotedloc");
        _sotedloc = sotedloc;
    }

    /**
     * [get] PICKLISTKEY: {bigint(19)} <br>
     * @return The value of the column 'PICKLISTKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPicklistkey() {
        checkSpecifiedProperty("picklistkey");
        return _picklistkey;
    }

    /**
     * [set] PICKLISTKEY: {bigint(19)} <br>
     * @param picklistkey The value of the column 'PICKLISTKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklistkey(Long picklistkey) {
        registerModifiedProperty("picklistkey");
        _picklistkey = picklistkey;
    }

    /**
     * [get] PICKLISTGNO: {bigint(19)} <br>
     * @return The value of the column 'PICKLISTGNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPicklistgno() {
        checkSpecifiedProperty("picklistgno");
        return _picklistgno;
    }

    /**
     * [set] PICKLISTGNO: {bigint(19)} <br>
     * @param picklistgno The value of the column 'PICKLISTGNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklistgno(Long picklistgno) {
        registerModifiedProperty("picklistgno");
        _picklistgno = picklistgno;
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
     * [get] MFMONTHCHG_ID: {bigint(19)} <br>
     * @return The value of the column 'MFMONTHCHG_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMfmonthchgId() {
        checkSpecifiedProperty("mfmonthchgId");
        return _mfmonthchgId;
    }

    /**
     * [set] MFMONTHCHG_ID: {bigint(19)} <br>
     * @param mfmonthchgId The value of the column 'MFMONTHCHG_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMfmonthchgId(Long mfmonthchgId) {
        registerModifiedProperty("mfmonthchgId");
        _mfmonthchgId = mfmonthchgId;
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
     * [get] SORT: {int(10)} <br>
     * @return The value of the column 'SORT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSort() {
        checkSpecifiedProperty("sort");
        return _sort;
    }

    /**
     * [set] SORT: {int(10)} <br>
     * @param sort The value of the column 'SORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSort(Integer sort) {
        registerModifiedProperty("sort");
        _sort = sort;
    }
}
