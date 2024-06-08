package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlSortingPlaceMasterEditBlk. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CBLK_ID, BLKCD, BLKNM, LOCIDFRNK, VERSION_NO, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, HDRDBOXRSFID, PKGRT, SPRPRSID, DEL_FLG, CENTER_ID
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
 * Long cblkId = entity.getCblkId();
 * String blkcd = entity.getBlkcd();
 * String blknm = entity.getBlknm();
 * String locidfrnk = entity.getLocidfrnk();
 * Long versionNo = entity.getVersionNo();
 * Long locidfbrctg1 = entity.getLocidfbrctg1();
 * Long locidfbrctg2 = entity.getLocidfbrctg2();
 * Long locidfbrctg3 = entity.getLocidfbrctg3();
 * Long locidfbrctg4 = entity.getLocidfbrctg4();
 * Long locidfbrctg5 = entity.getLocidfbrctg5();
 * Long locidfbrctg6 = entity.getLocidfbrctg6();
 * Long locidfbrctg7 = entity.getLocidfbrctg7();
 * Long locidfbrctg8 = entity.getLocidfbrctg8();
 * Long locidfbrctg9 = entity.getLocidfbrctg9();
 * Long locidfbrctg10 = entity.getLocidfbrctg10();
 * String hdrdboxrsfid = entity.getHdrdboxrsfid();
 * Long pkgrt = entity.getPkgrt();
 * String sprprsid = entity.getSprprsid();
 * String delFlg = entity.getDelFlg();
 * Long centerId = entity.getCenterId();
 * entity.setCblkId(cblkId);
 * entity.setBlkcd(blkcd);
 * entity.setBlknm(blknm);
 * entity.setLocidfrnk(locidfrnk);
 * entity.setVersionNo(versionNo);
 * entity.setLocidfbrctg1(locidfbrctg1);
 * entity.setLocidfbrctg2(locidfbrctg2);
 * entity.setLocidfbrctg3(locidfbrctg3);
 * entity.setLocidfbrctg4(locidfbrctg4);
 * entity.setLocidfbrctg5(locidfbrctg5);
 * entity.setLocidfbrctg6(locidfbrctg6);
 * entity.setLocidfbrctg7(locidfbrctg7);
 * entity.setLocidfbrctg8(locidfbrctg8);
 * entity.setLocidfbrctg9(locidfbrctg9);
 * entity.setLocidfbrctg10(locidfbrctg10);
 * entity.setHdrdboxrsfid(hdrdboxrsfid);
 * entity.setPkgrt(pkgrt);
 * entity.setSprprsid(sprprsid);
 * entity.setDelFlg(delFlg);
 * entity.setCenterId(centerId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlSortingPlaceMasterEditBlk extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CBLK_ID: {bigint(19)} */
    protected Long _cblkId;

    /** BLKCD: {varchar(30)} */
    protected String _blkcd;

    /** BLKNM: {varchar(30)} */
    protected String _blknm;

    /** LOCIDFRNK: {char(1)} */
    protected String _locidfrnk;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** LOCIDFBRCTG1: {bigint(19)} */
    protected Long _locidfbrctg1;

    /** LOCIDFBRCTG2: {bigint(19)} */
    protected Long _locidfbrctg2;

    /** LOCIDFBRCTG3: {bigint(19)} */
    protected Long _locidfbrctg3;

    /** LOCIDFBRCTG4: {bigint(19)} */
    protected Long _locidfbrctg4;

    /** LOCIDFBRCTG5: {bigint(19)} */
    protected Long _locidfbrctg5;

    /** LOCIDFBRCTG6: {bigint(19)} */
    protected Long _locidfbrctg6;

    /** LOCIDFBRCTG7: {bigint(19)} */
    protected Long _locidfbrctg7;

    /** LOCIDFBRCTG8: {bigint(19)} */
    protected Long _locidfbrctg8;

    /** LOCIDFBRCTG9: {bigint(19)} */
    protected Long _locidfbrctg9;

    /** LOCIDFBRCTG10: {bigint(19)} */
    protected Long _locidfbrctg10;

    /** HDRDBOXRSFID: {char(1)} */
    protected String _hdrdboxrsfid;

    /** PKGRT: {bigint(19)} */
    protected Long _pkgrt;

    /** SPRPRSID: {varchar(30)} */
    protected String _sprprsid;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlSortingPlaceMasterEditBlkDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlSortingPlaceMasterEditBlk";
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
        if (obj instanceof BsSqlSortingPlaceMasterEditBlk) {
            BsSqlSortingPlaceMasterEditBlk other = (BsSqlSortingPlaceMasterEditBlk)obj;
            if (!xSV(_cblkId, other._cblkId)) { return false; }
            if (!xSV(_blkcd, other._blkcd)) { return false; }
            if (!xSV(_blknm, other._blknm)) { return false; }
            if (!xSV(_locidfrnk, other._locidfrnk)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_locidfbrctg1, other._locidfbrctg1)) { return false; }
            if (!xSV(_locidfbrctg2, other._locidfbrctg2)) { return false; }
            if (!xSV(_locidfbrctg3, other._locidfbrctg3)) { return false; }
            if (!xSV(_locidfbrctg4, other._locidfbrctg4)) { return false; }
            if (!xSV(_locidfbrctg5, other._locidfbrctg5)) { return false; }
            if (!xSV(_locidfbrctg6, other._locidfbrctg6)) { return false; }
            if (!xSV(_locidfbrctg7, other._locidfbrctg7)) { return false; }
            if (!xSV(_locidfbrctg8, other._locidfbrctg8)) { return false; }
            if (!xSV(_locidfbrctg9, other._locidfbrctg9)) { return false; }
            if (!xSV(_locidfbrctg10, other._locidfbrctg10)) { return false; }
            if (!xSV(_hdrdboxrsfid, other._hdrdboxrsfid)) { return false; }
            if (!xSV(_pkgrt, other._pkgrt)) { return false; }
            if (!xSV(_sprprsid, other._sprprsid)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
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
        hs = xCH(hs, _cblkId);
        hs = xCH(hs, _blkcd);
        hs = xCH(hs, _blknm);
        hs = xCH(hs, _locidfrnk);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _locidfbrctg1);
        hs = xCH(hs, _locidfbrctg2);
        hs = xCH(hs, _locidfbrctg3);
        hs = xCH(hs, _locidfbrctg4);
        hs = xCH(hs, _locidfbrctg5);
        hs = xCH(hs, _locidfbrctg6);
        hs = xCH(hs, _locidfbrctg7);
        hs = xCH(hs, _locidfbrctg8);
        hs = xCH(hs, _locidfbrctg9);
        hs = xCH(hs, _locidfbrctg10);
        hs = xCH(hs, _hdrdboxrsfid);
        hs = xCH(hs, _pkgrt);
        hs = xCH(hs, _sprprsid);
        hs = xCH(hs, _delFlg);
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
        sb.append(dm).append(xfND(_cblkId));
        sb.append(dm).append(xfND(_blkcd));
        sb.append(dm).append(xfND(_blknm));
        sb.append(dm).append(xfND(_locidfrnk));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_locidfbrctg1));
        sb.append(dm).append(xfND(_locidfbrctg2));
        sb.append(dm).append(xfND(_locidfbrctg3));
        sb.append(dm).append(xfND(_locidfbrctg4));
        sb.append(dm).append(xfND(_locidfbrctg5));
        sb.append(dm).append(xfND(_locidfbrctg6));
        sb.append(dm).append(xfND(_locidfbrctg7));
        sb.append(dm).append(xfND(_locidfbrctg8));
        sb.append(dm).append(xfND(_locidfbrctg9));
        sb.append(dm).append(xfND(_locidfbrctg10));
        sb.append(dm).append(xfND(_hdrdboxrsfid));
        sb.append(dm).append(xfND(_pkgrt));
        sb.append(dm).append(xfND(_sprprsid));
        sb.append(dm).append(xfND(_delFlg));
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
    public SqlSortingPlaceMasterEditBlk clone() {
        return (SqlSortingPlaceMasterEditBlk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CBLK_ID: {bigint(19)} <br>
     * @return The value of the column 'CBLK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCblkId() {
        checkSpecifiedProperty("cblkId");
        return _cblkId;
    }

    /**
     * [set] CBLK_ID: {bigint(19)} <br>
     * @param cblkId The value of the column 'CBLK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCblkId(Long cblkId) {
        registerModifiedProperty("cblkId");
        _cblkId = cblkId;
    }

    /**
     * [get] BLKCD: {varchar(30)} <br>
     * @return The value of the column 'BLKCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlkcd() {
        checkSpecifiedProperty("blkcd");
        return convertEmptyToNull(_blkcd);
    }

    /**
     * [set] BLKCD: {varchar(30)} <br>
     * @param blkcd The value of the column 'BLKCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlkcd(String blkcd) {
        registerModifiedProperty("blkcd");
        _blkcd = blkcd;
    }

    /**
     * [get] BLKNM: {varchar(30)} <br>
     * @return The value of the column 'BLKNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlknm() {
        checkSpecifiedProperty("blknm");
        return convertEmptyToNull(_blknm);
    }

    /**
     * [set] BLKNM: {varchar(30)} <br>
     * @param blknm The value of the column 'BLKNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlknm(String blknm) {
        registerModifiedProperty("blknm");
        _blknm = blknm;
    }

    /**
     * [get] LOCIDFRNK: {char(1)} <br>
     * @return The value of the column 'LOCIDFRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocidfrnk() {
        checkSpecifiedProperty("locidfrnk");
        return convertEmptyToNull(_locidfrnk);
    }

    /**
     * [set] LOCIDFRNK: {char(1)} <br>
     * @param locidfrnk The value of the column 'LOCIDFRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfrnk(String locidfrnk) {
        registerModifiedProperty("locidfrnk");
        _locidfrnk = locidfrnk;
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
     * [get] LOCIDFBRCTG1: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg1() {
        checkSpecifiedProperty("locidfbrctg1");
        return _locidfbrctg1;
    }

    /**
     * [set] LOCIDFBRCTG1: {bigint(19)} <br>
     * @param locidfbrctg1 The value of the column 'LOCIDFBRCTG1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg1(Long locidfbrctg1) {
        registerModifiedProperty("locidfbrctg1");
        _locidfbrctg1 = locidfbrctg1;
    }

    /**
     * [get] LOCIDFBRCTG2: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg2() {
        checkSpecifiedProperty("locidfbrctg2");
        return _locidfbrctg2;
    }

    /**
     * [set] LOCIDFBRCTG2: {bigint(19)} <br>
     * @param locidfbrctg2 The value of the column 'LOCIDFBRCTG2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg2(Long locidfbrctg2) {
        registerModifiedProperty("locidfbrctg2");
        _locidfbrctg2 = locidfbrctg2;
    }

    /**
     * [get] LOCIDFBRCTG3: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg3() {
        checkSpecifiedProperty("locidfbrctg3");
        return _locidfbrctg3;
    }

    /**
     * [set] LOCIDFBRCTG3: {bigint(19)} <br>
     * @param locidfbrctg3 The value of the column 'LOCIDFBRCTG3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg3(Long locidfbrctg3) {
        registerModifiedProperty("locidfbrctg3");
        _locidfbrctg3 = locidfbrctg3;
    }

    /**
     * [get] LOCIDFBRCTG4: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG4'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg4() {
        checkSpecifiedProperty("locidfbrctg4");
        return _locidfbrctg4;
    }

    /**
     * [set] LOCIDFBRCTG4: {bigint(19)} <br>
     * @param locidfbrctg4 The value of the column 'LOCIDFBRCTG4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg4(Long locidfbrctg4) {
        registerModifiedProperty("locidfbrctg4");
        _locidfbrctg4 = locidfbrctg4;
    }

    /**
     * [get] LOCIDFBRCTG5: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG5'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg5() {
        checkSpecifiedProperty("locidfbrctg5");
        return _locidfbrctg5;
    }

    /**
     * [set] LOCIDFBRCTG5: {bigint(19)} <br>
     * @param locidfbrctg5 The value of the column 'LOCIDFBRCTG5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg5(Long locidfbrctg5) {
        registerModifiedProperty("locidfbrctg5");
        _locidfbrctg5 = locidfbrctg5;
    }

    /**
     * [get] LOCIDFBRCTG6: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG6'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg6() {
        checkSpecifiedProperty("locidfbrctg6");
        return _locidfbrctg6;
    }

    /**
     * [set] LOCIDFBRCTG6: {bigint(19)} <br>
     * @param locidfbrctg6 The value of the column 'LOCIDFBRCTG6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg6(Long locidfbrctg6) {
        registerModifiedProperty("locidfbrctg6");
        _locidfbrctg6 = locidfbrctg6;
    }

    /**
     * [get] LOCIDFBRCTG7: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG7'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg7() {
        checkSpecifiedProperty("locidfbrctg7");
        return _locidfbrctg7;
    }

    /**
     * [set] LOCIDFBRCTG7: {bigint(19)} <br>
     * @param locidfbrctg7 The value of the column 'LOCIDFBRCTG7'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg7(Long locidfbrctg7) {
        registerModifiedProperty("locidfbrctg7");
        _locidfbrctg7 = locidfbrctg7;
    }

    /**
     * [get] LOCIDFBRCTG8: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG8'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg8() {
        checkSpecifiedProperty("locidfbrctg8");
        return _locidfbrctg8;
    }

    /**
     * [set] LOCIDFBRCTG8: {bigint(19)} <br>
     * @param locidfbrctg8 The value of the column 'LOCIDFBRCTG8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg8(Long locidfbrctg8) {
        registerModifiedProperty("locidfbrctg8");
        _locidfbrctg8 = locidfbrctg8;
    }

    /**
     * [get] LOCIDFBRCTG9: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG9'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg9() {
        checkSpecifiedProperty("locidfbrctg9");
        return _locidfbrctg9;
    }

    /**
     * [set] LOCIDFBRCTG9: {bigint(19)} <br>
     * @param locidfbrctg9 The value of the column 'LOCIDFBRCTG9'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg9(Long locidfbrctg9) {
        registerModifiedProperty("locidfbrctg9");
        _locidfbrctg9 = locidfbrctg9;
    }

    /**
     * [get] LOCIDFBRCTG10: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG10'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg10() {
        checkSpecifiedProperty("locidfbrctg10");
        return _locidfbrctg10;
    }

    /**
     * [set] LOCIDFBRCTG10: {bigint(19)} <br>
     * @param locidfbrctg10 The value of the column 'LOCIDFBRCTG10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg10(Long locidfbrctg10) {
        registerModifiedProperty("locidfbrctg10");
        _locidfbrctg10 = locidfbrctg10;
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
