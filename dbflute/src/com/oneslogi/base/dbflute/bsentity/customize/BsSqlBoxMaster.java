package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlBoxMaster. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     BOX_CD, BOX_NM, BOX_TYPE, BOX_TYPE_NM, BXWEIGHT, BXOSZL, BXOSZW, BXOSZH, LENGTH, WIDTH, HEIGHT, BXCPY, VOLUME_RATE, DEL_FLG, DEL_FLG_NM, VERSION_NO, BOX_ID, CENTER_ID
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
 * String boxCd = entity.getBoxCd();
 * String boxNm = entity.getBoxNm();
 * String boxType = entity.getBoxType();
 * String boxTypeNm = entity.getBoxTypeNm();
 * java.math.BigDecimal bxweight = entity.getBxweight();
 * Long bxoszl = entity.getBxoszl();
 * Long bxoszw = entity.getBxoszw();
 * Long bxoszh = entity.getBxoszh();
 * java.math.BigDecimal length = entity.getLength();
 * java.math.BigDecimal width = entity.getWidth();
 * java.math.BigDecimal height = entity.getHeight();
 * java.math.BigDecimal bxcpy = entity.getBxcpy();
 * Long volumeRate = entity.getVolumeRate();
 * String delFlg = entity.getDelFlg();
 * String delFlgNm = entity.getDelFlgNm();
 * Long versionNo = entity.getVersionNo();
 * Long boxId = entity.getBoxId();
 * Long centerId = entity.getCenterId();
 * entity.setBoxCd(boxCd);
 * entity.setBoxNm(boxNm);
 * entity.setBoxType(boxType);
 * entity.setBoxTypeNm(boxTypeNm);
 * entity.setBxweight(bxweight);
 * entity.setBxoszl(bxoszl);
 * entity.setBxoszw(bxoszw);
 * entity.setBxoszh(bxoszh);
 * entity.setLength(length);
 * entity.setWidth(width);
 * entity.setHeight(height);
 * entity.setBxcpy(bxcpy);
 * entity.setVolumeRate(volumeRate);
 * entity.setDelFlg(delFlg);
 * entity.setDelFlgNm(delFlgNm);
 * entity.setVersionNo(versionNo);
 * entity.setBoxId(boxId);
 * entity.setCenterId(centerId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlBoxMaster extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BOX_CD: {varchar(30)} */
    protected String _boxCd;

    /** BOX_NM: {varchar(60)} */
    protected String _boxNm;

    /** BOX_TYPE: {varchar(30)} */
    protected String _boxType;

    /** BOX_TYPE_NM: {int(10)} */
    protected String _boxTypeNm;

    /** BXWEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _bxweight;

    /** BXOSZL: {bigint(19)} */
    protected Long _bxoszl;

    /** BXOSZW: {bigint(19)} */
    protected Long _bxoszw;

    /** BXOSZH: {bigint(19)} */
    protected Long _bxoszh;

    /** LENGTH: {decimal(16, 6)} */
    protected java.math.BigDecimal _length;

    /** WIDTH: {decimal(16, 6)} */
    protected java.math.BigDecimal _width;

    /** HEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _height;

    /** BXCPY: {float(15)} */
    protected java.math.BigDecimal _bxcpy;

    /** VOLUME_RATE: {bigint(19)} */
    protected Long _volumeRate;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** DEL_FLG_NM: {int(10)} */
    protected String _delFlgNm;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** BOX_ID: {bigint(19)} */
    protected Long _boxId;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlBoxMasterDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlBoxMaster";
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
        if (obj instanceof BsSqlBoxMaster) {
            BsSqlBoxMaster other = (BsSqlBoxMaster)obj;
            if (!xSV(_boxCd, other._boxCd)) { return false; }
            if (!xSV(_boxNm, other._boxNm)) { return false; }
            if (!xSV(_boxType, other._boxType)) { return false; }
            if (!xSV(_boxTypeNm, other._boxTypeNm)) { return false; }
            if (!xSV(_bxweight, other._bxweight)) { return false; }
            if (!xSV(_bxoszl, other._bxoszl)) { return false; }
            if (!xSV(_bxoszw, other._bxoszw)) { return false; }
            if (!xSV(_bxoszh, other._bxoszh)) { return false; }
            if (!xSV(_length, other._length)) { return false; }
            if (!xSV(_width, other._width)) { return false; }
            if (!xSV(_height, other._height)) { return false; }
            if (!xSV(_bxcpy, other._bxcpy)) { return false; }
            if (!xSV(_volumeRate, other._volumeRate)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_delFlgNm, other._delFlgNm)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_boxId, other._boxId)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _boxCd);
        hs = xCH(hs, _boxNm);
        hs = xCH(hs, _boxType);
        hs = xCH(hs, _boxTypeNm);
        hs = xCH(hs, _bxweight);
        hs = xCH(hs, _bxoszl);
        hs = xCH(hs, _bxoszw);
        hs = xCH(hs, _bxoszh);
        hs = xCH(hs, _length);
        hs = xCH(hs, _width);
        hs = xCH(hs, _height);
        hs = xCH(hs, _bxcpy);
        hs = xCH(hs, _volumeRate);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _delFlgNm);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _boxId);
        hs = xCH(hs, _centerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_boxCd));
        sb.append(dm).append(xfND(_boxNm));
        sb.append(dm).append(xfND(_boxType));
        sb.append(dm).append(xfND(_boxTypeNm));
        sb.append(dm).append(xfND(_bxweight));
        sb.append(dm).append(xfND(_bxoszl));
        sb.append(dm).append(xfND(_bxoszw));
        sb.append(dm).append(xfND(_bxoszh));
        sb.append(dm).append(xfND(_length));
        sb.append(dm).append(xfND(_width));
        sb.append(dm).append(xfND(_height));
        sb.append(dm).append(xfND(_bxcpy));
        sb.append(dm).append(xfND(_volumeRate));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_delFlgNm));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_boxId));
        sb.append(dm).append(xfND(_centerId));
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
    public SqlBoxMaster clone() {
        return (SqlBoxMaster)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BOX_CD: {varchar(30)} <br>
     * @return The value of the column 'BOX_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxCd() {
        checkSpecifiedProperty("boxCd");
        return convertEmptyToNull(_boxCd);
    }

    /**
     * [set] BOX_CD: {varchar(30)} <br>
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxCd(String boxCd) {
        registerModifiedProperty("boxCd");
        _boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {varchar(60)} <br>
     * @return The value of the column 'BOX_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNm() {
        checkSpecifiedProperty("boxNm");
        return convertEmptyToNull(_boxNm);
    }

    /**
     * [set] BOX_NM: {varchar(60)} <br>
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNm(String boxNm) {
        registerModifiedProperty("boxNm");
        _boxNm = boxNm;
    }

    /**
     * [get] BOX_TYPE: {varchar(30)} <br>
     * @return The value of the column 'BOX_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxType() {
        checkSpecifiedProperty("boxType");
        return convertEmptyToNull(_boxType);
    }

    /**
     * [set] BOX_TYPE: {varchar(30)} <br>
     * @param boxType The value of the column 'BOX_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxType(String boxType) {
        registerModifiedProperty("boxType");
        _boxType = boxType;
    }

    /**
     * [get] BOX_TYPE_NM: {int(10)} <br>
     * @return The value of the column 'BOX_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxTypeNm() {
        checkSpecifiedProperty("boxTypeNm");
        return convertEmptyToNull(_boxTypeNm);
    }

    /**
     * [set] BOX_TYPE_NM: {int(10)} <br>
     * @param boxTypeNm The value of the column 'BOX_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxTypeNm(String boxTypeNm) {
        registerModifiedProperty("boxTypeNm");
        _boxTypeNm = boxTypeNm;
    }

    /**
     * [get] BXWEIGHT: {decimal(16, 6)} <br>
     * @return The value of the column 'BXWEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBxweight() {
        checkSpecifiedProperty("bxweight");
        return _bxweight;
    }

    /**
     * [set] BXWEIGHT: {decimal(16, 6)} <br>
     * @param bxweight The value of the column 'BXWEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxweight(java.math.BigDecimal bxweight) {
        registerModifiedProperty("bxweight");
        _bxweight = bxweight;
    }

    /**
     * [get] BXOSZL: {bigint(19)} <br>
     * @return The value of the column 'BXOSZL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszl() {
        checkSpecifiedProperty("bxoszl");
        return _bxoszl;
    }

    /**
     * [set] BXOSZL: {bigint(19)} <br>
     * @param bxoszl The value of the column 'BXOSZL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszl(Long bxoszl) {
        registerModifiedProperty("bxoszl");
        _bxoszl = bxoszl;
    }

    /**
     * [get] BXOSZW: {bigint(19)} <br>
     * @return The value of the column 'BXOSZW'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszw() {
        checkSpecifiedProperty("bxoszw");
        return _bxoszw;
    }

    /**
     * [set] BXOSZW: {bigint(19)} <br>
     * @param bxoszw The value of the column 'BXOSZW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszw(Long bxoszw) {
        registerModifiedProperty("bxoszw");
        _bxoszw = bxoszw;
    }

    /**
     * [get] BXOSZH: {bigint(19)} <br>
     * @return The value of the column 'BXOSZH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszh() {
        checkSpecifiedProperty("bxoszh");
        return _bxoszh;
    }

    /**
     * [set] BXOSZH: {bigint(19)} <br>
     * @param bxoszh The value of the column 'BXOSZH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszh(Long bxoszh) {
        registerModifiedProperty("bxoszh");
        _bxoszh = bxoszh;
    }

    /**
     * [get] LENGTH: {decimal(16, 6)} <br>
     * @return The value of the column 'LENGTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getLength() {
        checkSpecifiedProperty("length");
        return _length;
    }

    /**
     * [set] LENGTH: {decimal(16, 6)} <br>
     * @param length The value of the column 'LENGTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength(java.math.BigDecimal length) {
        registerModifiedProperty("length");
        _length = length;
    }

    /**
     * [get] WIDTH: {decimal(16, 6)} <br>
     * @return The value of the column 'WIDTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWidth() {
        checkSpecifiedProperty("width");
        return _width;
    }

    /**
     * [set] WIDTH: {decimal(16, 6)} <br>
     * @param width The value of the column 'WIDTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth(java.math.BigDecimal width) {
        registerModifiedProperty("width");
        _width = width;
    }

    /**
     * [get] HEIGHT: {decimal(16, 6)} <br>
     * @return The value of the column 'HEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getHeight() {
        checkSpecifiedProperty("height");
        return _height;
    }

    /**
     * [set] HEIGHT: {decimal(16, 6)} <br>
     * @param height The value of the column 'HEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight(java.math.BigDecimal height) {
        registerModifiedProperty("height");
        _height = height;
    }

    /**
     * [get] BXCPY: {float(15)} <br>
     * @return The value of the column 'BXCPY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBxcpy() {
        checkSpecifiedProperty("bxcpy");
        return _bxcpy;
    }

    /**
     * [set] BXCPY: {float(15)} <br>
     * @param bxcpy The value of the column 'BXCPY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxcpy(java.math.BigDecimal bxcpy) {
        registerModifiedProperty("bxcpy");
        _bxcpy = bxcpy;
    }

    /**
     * [get] VOLUME_RATE: {bigint(19)} <br>
     * @return The value of the column 'VOLUME_RATE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVolumeRate() {
        checkSpecifiedProperty("volumeRate");
        return _volumeRate;
    }

    /**
     * [set] VOLUME_RATE: {bigint(19)} <br>
     * @param volumeRate The value of the column 'VOLUME_RATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVolumeRate(Long volumeRate) {
        registerModifiedProperty("volumeRate");
        _volumeRate = volumeRate;
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
     * [get] BOX_ID: {bigint(19)} <br>
     * @return The value of the column 'BOX_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxId() {
        checkSpecifiedProperty("boxId");
        return _boxId;
    }

    /**
     * [set] BOX_ID: {bigint(19)} <br>
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxId(Long boxId) {
        registerModifiedProperty("boxId");
        _boxId = boxId;
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
}
