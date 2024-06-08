package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlDrcdizqaList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_ID, ZZMATNR, LINBLK, LOCID, SRRNK, SROPRTCNT, DED, PSTNID, ZQACP, ZQACTQA, UNIT1, UNIT2, LOCATION_ID
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
 * Long productId = entity.getProductId();
 * String zzmatnr = entity.getZzmatnr();
 * String linblk = entity.getLinblk();
 * String locid = entity.getLocid();
 * Long srrnk = entity.getSrrnk();
 * Long sroprtcnt = entity.getSroprtcnt();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * Long zqacp = entity.getZqacp();
 * Long zqactqa = entity.getZqactqa();
 * java.math.BigDecimal unit1 = entity.getUnit1();
 * java.math.BigDecimal unit2 = entity.getUnit2();
 * Long locationId = entity.getLocationId();
 * entity.setProductId(productId);
 * entity.setZzmatnr(zzmatnr);
 * entity.setLinblk(linblk);
 * entity.setLocid(locid);
 * entity.setSrrnk(srrnk);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setZqacp(zqacp);
 * entity.setZqactqa(zqactqa);
 * entity.setUnit1(unit1);
 * entity.setUnit2(unit2);
 * entity.setLocationId(locationId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlDrcdizqaList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** ZZMATNR: {varchar(30)} */
    protected String _zzmatnr;

    /** LINBLK: {varchar(30)} */
    protected String _linblk;

    /** LOCID: {varchar(30)} */
    protected String _locid;

    /** SRRNK: {bigint(19)} */
    protected Long _srrnk;

    /** SROPRTCNT: {bigint(19)} */
    protected Long _sroprtcnt;

    /** DED: {varchar(30)} */
    protected String _ded;

    /** PSTNID: {varchar(30)} */
    protected String _pstnid;

    /** ZQACP: {bigint(19)} */
    protected Long _zqacp;

    /** ZQACTQA: {bigint(19)} */
    protected Long _zqactqa;

    /** UNIT1: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit2;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlDrcdizqaListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlDrcdizqaList";
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
        if (obj instanceof BsSqlDrcdizqaList) {
            BsSqlDrcdizqaList other = (BsSqlDrcdizqaList)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_zzmatnr, other._zzmatnr)) { return false; }
            if (!xSV(_linblk, other._linblk)) { return false; }
            if (!xSV(_locid, other._locid)) { return false; }
            if (!xSV(_srrnk, other._srrnk)) { return false; }
            if (!xSV(_sroprtcnt, other._sroprtcnt)) { return false; }
            if (!xSV(_ded, other._ded)) { return false; }
            if (!xSV(_pstnid, other._pstnid)) { return false; }
            if (!xSV(_zqacp, other._zqacp)) { return false; }
            if (!xSV(_zqactqa, other._zqactqa)) { return false; }
            if (!xSV(_unit1, other._unit1)) { return false; }
            if (!xSV(_unit2, other._unit2)) { return false; }
            if (!xSV(_locationId, other._locationId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        hs = xCH(hs, _zzmatnr);
        hs = xCH(hs, _linblk);
        hs = xCH(hs, _locid);
        hs = xCH(hs, _srrnk);
        hs = xCH(hs, _sroprtcnt);
        hs = xCH(hs, _ded);
        hs = xCH(hs, _pstnid);
        hs = xCH(hs, _zqacp);
        hs = xCH(hs, _zqactqa);
        hs = xCH(hs, _unit1);
        hs = xCH(hs, _unit2);
        hs = xCH(hs, _locationId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_zzmatnr));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_locid));
        sb.append(dm).append(xfND(_srrnk));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_zqacp));
        sb.append(dm).append(xfND(_zqactqa));
        sb.append(dm).append(xfND(_unit1));
        sb.append(dm).append(xfND(_unit2));
        sb.append(dm).append(xfND(_locationId));
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
    public SqlDrcdizqaList clone() {
        return (SqlDrcdizqaList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * @return The value of the column 'ZZMATNR'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzmatnr() {
        checkSpecifiedProperty("zzmatnr");
        return convertEmptyToNull(_zzmatnr);
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzmatnr(String zzmatnr) {
        registerModifiedProperty("zzmatnr");
        _zzmatnr = zzmatnr;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * @return The value of the column 'LINBLK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk() {
        checkSpecifiedProperty("linblk");
        return convertEmptyToNull(_linblk);
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * @param linblk The value of the column 'LINBLK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk(String linblk) {
        registerModifiedProperty("linblk");
        _linblk = linblk;
    }

    /**
     * [get] LOCID: {varchar(30)} <br>
     * @return The value of the column 'LOCID'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocid() {
        checkSpecifiedProperty("locid");
        return convertEmptyToNull(_locid);
    }

    /**
     * [set] LOCID: {varchar(30)} <br>
     * @param locid The value of the column 'LOCID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocid(String locid) {
        registerModifiedProperty("locid");
        _locid = locid;
    }

    /**
     * [get] SRRNK: {bigint(19)} <br>
     * @return The value of the column 'SRRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrrnk() {
        checkSpecifiedProperty("srrnk");
        return _srrnk;
    }

    /**
     * [set] SRRNK: {bigint(19)} <br>
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrrnk(Long srrnk) {
        registerModifiedProperty("srrnk");
        _srrnk = srrnk;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * @return The value of the column 'SROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSroprtcnt() {
        checkSpecifiedProperty("sroprtcnt");
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        registerModifiedProperty("sroprtcnt");
        _sroprtcnt = sroprtcnt;
    }

    /**
     * [get] DED: {varchar(30)} <br>
     * @return The value of the column 'DED'. (NullAllowed even if selected: for no constraint)
     */
    public String getDed() {
        checkSpecifiedProperty("ded");
        return convertEmptyToNull(_ded);
    }

    /**
     * [set] DED: {varchar(30)} <br>
     * @param ded The value of the column 'DED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDed(String ded) {
        registerModifiedProperty("ded");
        _ded = ded;
    }

    /**
     * [get] PSTNID: {varchar(30)} <br>
     * @return The value of the column 'PSTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPstnid() {
        checkSpecifiedProperty("pstnid");
        return convertEmptyToNull(_pstnid);
    }

    /**
     * [set] PSTNID: {varchar(30)} <br>
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPstnid(String pstnid) {
        registerModifiedProperty("pstnid");
        _pstnid = pstnid;
    }

    /**
     * [get] ZQACP: {bigint(19)} <br>
     * @return The value of the column 'ZQACP'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZqacp() {
        checkSpecifiedProperty("zqacp");
        return _zqacp;
    }

    /**
     * [set] ZQACP: {bigint(19)} <br>
     * @param zqacp The value of the column 'ZQACP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZqacp(Long zqacp) {
        registerModifiedProperty("zqacp");
        _zqacp = zqacp;
    }

    /**
     * [get] ZQACTQA: {bigint(19)} <br>
     * @return The value of the column 'ZQACTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZqactqa() {
        checkSpecifiedProperty("zqactqa");
        return _zqactqa;
    }

    /**
     * [set] ZQACTQA: {bigint(19)} <br>
     * @param zqactqa The value of the column 'ZQACTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZqactqa(Long zqactqa) {
        registerModifiedProperty("zqactqa");
        _zqactqa = zqactqa;
    }

    /**
     * [get] UNIT1: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnit1() {
        checkSpecifiedProperty("unit1");
        return _unit1;
    }

    /**
     * [set] UNIT1: {decimal(16, 6)} <br>
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        registerModifiedProperty("unit1");
        _unit1 = unit1;
    }

    /**
     * [get] UNIT2: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnit2() {
        checkSpecifiedProperty("unit2");
        return _unit2;
    }

    /**
     * [set] UNIT2: {decimal(16, 6)} <br>
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        registerModifiedProperty("unit2");
        _unit2 = unit2;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }
}
