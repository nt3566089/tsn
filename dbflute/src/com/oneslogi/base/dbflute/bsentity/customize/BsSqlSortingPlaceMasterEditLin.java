package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlSortingPlaceMasterEditLin. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LINCD, LINNM, LINBLK1, LINBLK2, LINBLK3, HDRDBOXRSFID, PKGRT, SPRPRSID, DEL_FLG, CLIN_ID, VERSION_NO, CENTER_ID
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
 * String lincd = entity.getLincd();
 * String linnm = entity.getLinnm();
 * String linblk1 = entity.getLinblk1();
 * String linblk2 = entity.getLinblk2();
 * String linblk3 = entity.getLinblk3();
 * String hdrdboxrsfid = entity.getHdrdboxrsfid();
 * Long pkgrt = entity.getPkgrt();
 * String sprprsid = entity.getSprprsid();
 * String delFlg = entity.getDelFlg();
 * Long clinId = entity.getClinId();
 * Long versionNo = entity.getVersionNo();
 * Long centerId = entity.getCenterId();
 * entity.setLincd(lincd);
 * entity.setLinnm(linnm);
 * entity.setLinblk1(linblk1);
 * entity.setLinblk2(linblk2);
 * entity.setLinblk3(linblk3);
 * entity.setHdrdboxrsfid(hdrdboxrsfid);
 * entity.setPkgrt(pkgrt);
 * entity.setSprprsid(sprprsid);
 * entity.setDelFlg(delFlg);
 * entity.setClinId(clinId);
 * entity.setVersionNo(versionNo);
 * entity.setCenterId(centerId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlSortingPlaceMasterEditLin extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LINCD: {varchar(30)} */
    protected String _lincd;

    /** LINNM: {varchar(30)} */
    protected String _linnm;

    /** LINBLK1: {varchar(30)} */
    protected String _linblk1;

    /** LINBLK2: {varchar(30)} */
    protected String _linblk2;

    /** LINBLK3: {varchar(30)} */
    protected String _linblk3;

    /** HDRDBOXRSFID: {char(1)} */
    protected String _hdrdboxrsfid;

    /** PKGRT: {bigint(19)} */
    protected Long _pkgrt;

    /** SPRPRSID: {varchar(30)} */
    protected String _sprprsid;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** CLIN_ID: {bigint(19)} */
    protected Long _clinId;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlSortingPlaceMasterEditLinDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlSortingPlaceMasterEditLin";
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
        if (obj instanceof BsSqlSortingPlaceMasterEditLin) {
            BsSqlSortingPlaceMasterEditLin other = (BsSqlSortingPlaceMasterEditLin)obj;
            if (!xSV(_lincd, other._lincd)) { return false; }
            if (!xSV(_linnm, other._linnm)) { return false; }
            if (!xSV(_linblk1, other._linblk1)) { return false; }
            if (!xSV(_linblk2, other._linblk2)) { return false; }
            if (!xSV(_linblk3, other._linblk3)) { return false; }
            if (!xSV(_hdrdboxrsfid, other._hdrdboxrsfid)) { return false; }
            if (!xSV(_pkgrt, other._pkgrt)) { return false; }
            if (!xSV(_sprprsid, other._sprprsid)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_clinId, other._clinId)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
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
        hs = xCH(hs, _lincd);
        hs = xCH(hs, _linnm);
        hs = xCH(hs, _linblk1);
        hs = xCH(hs, _linblk2);
        hs = xCH(hs, _linblk3);
        hs = xCH(hs, _hdrdboxrsfid);
        hs = xCH(hs, _pkgrt);
        hs = xCH(hs, _sprprsid);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _clinId);
        hs = xCH(hs, _versionNo);
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
        sb.append(dm).append(xfND(_lincd));
        sb.append(dm).append(xfND(_linnm));
        sb.append(dm).append(xfND(_linblk1));
        sb.append(dm).append(xfND(_linblk2));
        sb.append(dm).append(xfND(_linblk3));
        sb.append(dm).append(xfND(_hdrdboxrsfid));
        sb.append(dm).append(xfND(_pkgrt));
        sb.append(dm).append(xfND(_sprprsid));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_clinId));
        sb.append(dm).append(xfND(_versionNo));
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
    public SqlSortingPlaceMasterEditLin clone() {
        return (SqlSortingPlaceMasterEditLin)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LINCD: {varchar(30)} <br>
     * @return The value of the column 'LINCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLincd() {
        checkSpecifiedProperty("lincd");
        return convertEmptyToNull(_lincd);
    }

    /**
     * [set] LINCD: {varchar(30)} <br>
     * @param lincd The value of the column 'LINCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLincd(String lincd) {
        registerModifiedProperty("lincd");
        _lincd = lincd;
    }

    /**
     * [get] LINNM: {varchar(30)} <br>
     * @return The value of the column 'LINNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinnm() {
        checkSpecifiedProperty("linnm");
        return convertEmptyToNull(_linnm);
    }

    /**
     * [set] LINNM: {varchar(30)} <br>
     * @param linnm The value of the column 'LINNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinnm(String linnm) {
        registerModifiedProperty("linnm");
        _linnm = linnm;
    }

    /**
     * [get] LINBLK1: {varchar(30)} <br>
     * @return The value of the column 'LINBLK1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk1() {
        checkSpecifiedProperty("linblk1");
        return convertEmptyToNull(_linblk1);
    }

    /**
     * [set] LINBLK1: {varchar(30)} <br>
     * @param linblk1 The value of the column 'LINBLK1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk1(String linblk1) {
        registerModifiedProperty("linblk1");
        _linblk1 = linblk1;
    }

    /**
     * [get] LINBLK2: {varchar(30)} <br>
     * @return The value of the column 'LINBLK2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk2() {
        checkSpecifiedProperty("linblk2");
        return convertEmptyToNull(_linblk2);
    }

    /**
     * [set] LINBLK2: {varchar(30)} <br>
     * @param linblk2 The value of the column 'LINBLK2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk2(String linblk2) {
        registerModifiedProperty("linblk2");
        _linblk2 = linblk2;
    }

    /**
     * [get] LINBLK3: {varchar(30)} <br>
     * @return The value of the column 'LINBLK3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk3() {
        checkSpecifiedProperty("linblk3");
        return convertEmptyToNull(_linblk3);
    }

    /**
     * [set] LINBLK3: {varchar(30)} <br>
     * @param linblk3 The value of the column 'LINBLK3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk3(String linblk3) {
        registerModifiedProperty("linblk3");
        _linblk3 = linblk3;
    }

    /**
     * [get] HDRDBOXRSFID: {char(1)} <br>
     * @return The value of the column 'HDRDBOXRSFID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdrdboxrsfid() {
        checkSpecifiedProperty("hdrdboxrsfid");
        return convertEmptyToNull(_hdrdboxrsfid);
    }

    /**
     * [set] HDRDBOXRSFID: {char(1)} <br>
     * @param hdrdboxrsfid The value of the column 'HDRDBOXRSFID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdrdboxrsfid(String hdrdboxrsfid) {
        registerModifiedProperty("hdrdboxrsfid");
        _hdrdboxrsfid = hdrdboxrsfid;
    }

    /**
     * [get] PKGRT: {bigint(19)} <br>
     * @return The value of the column 'PKGRT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPkgrt() {
        checkSpecifiedProperty("pkgrt");
        return _pkgrt;
    }

    /**
     * [set] PKGRT: {bigint(19)} <br>
     * @param pkgrt The value of the column 'PKGRT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPkgrt(Long pkgrt) {
        registerModifiedProperty("pkgrt");
        _pkgrt = pkgrt;
    }

    /**
     * [get] SPRPRSID: {varchar(30)} <br>
     * @return The value of the column 'SPRPRSID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSprprsid() {
        checkSpecifiedProperty("sprprsid");
        return convertEmptyToNull(_sprprsid);
    }

    /**
     * [set] SPRPRSID: {varchar(30)} <br>
     * @param sprprsid The value of the column 'SPRPRSID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprprsid(String sprprsid) {
        registerModifiedProperty("sprprsid");
        _sprprsid = sprprsid;
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
     * [get] CLIN_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClinId() {
        checkSpecifiedProperty("clinId");
        return _clinId;
    }

    /**
     * [set] CLIN_ID: {bigint(19)} <br>
     * @param clinId The value of the column 'CLIN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClinId(Long clinId) {
        registerModifiedProperty("clinId");
        _clinId = clinId;
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
}
