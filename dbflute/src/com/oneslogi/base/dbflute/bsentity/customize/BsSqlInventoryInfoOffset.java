package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryInfoOffset. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     HEADID, INFOID, INFOVERSION, OFFSETID, OFFSETCASECD, OFFSETCUTCASECD, OFFSETDTLNO, OFFSETINSTNO, OFFSETINSTBRANCHNO, OFFSETVERSION
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
 * Long headid = entity.getHeadid();
 * Long infoid = entity.getInfoid();
 * Long infoversion = entity.getInfoversion();
 * Long offsetid = entity.getOffsetid();
 * java.math.BigDecimal offsetcasecd = entity.getOffsetcasecd();
 * java.math.BigDecimal offsetcutcasecd = entity.getOffsetcutcasecd();
 * Long offsetdtlno = entity.getOffsetdtlno();
 * Long offsetinstno = entity.getOffsetinstno();
 * Long offsetinstbranchno = entity.getOffsetinstbranchno();
 * Long offsetversion = entity.getOffsetversion();
 * entity.setHeadid(headid);
 * entity.setInfoid(infoid);
 * entity.setInfoversion(infoversion);
 * entity.setOffsetid(offsetid);
 * entity.setOffsetcasecd(offsetcasecd);
 * entity.setOffsetcutcasecd(offsetcutcasecd);
 * entity.setOffsetdtlno(offsetdtlno);
 * entity.setOffsetinstno(offsetinstno);
 * entity.setOffsetinstbranchno(offsetinstbranchno);
 * entity.setOffsetversion(offsetversion);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryInfoOffset extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** HEADID: {bigint(19)} */
    protected Long _headid;

    /** INFOID: {bigint(19)} */
    protected Long _infoid;

    /** INFOVERSION: {bigint(19)} */
    protected Long _infoversion;

    /** OFFSETID: {bigint(19)} */
    protected Long _offsetid;

    /** OFFSETCASECD: {decimal(16, 6)} */
    protected java.math.BigDecimal _offsetcasecd;

    /** OFFSETCUTCASECD: {decimal(16, 6)} */
    protected java.math.BigDecimal _offsetcutcasecd;

    /** OFFSETDTLNO: {bigint(19)} */
    protected Long _offsetdtlno;

    /** OFFSETINSTNO: {bigint(19)} */
    protected Long _offsetinstno;

    /** OFFSETINSTBRANCHNO: {bigint(19)} */
    protected Long _offsetinstbranchno;

    /** OFFSETVERSION: {bigint(19)} */
    protected Long _offsetversion;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryInfoOffsetDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryInfoOffset";
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
        if (obj instanceof BsSqlInventoryInfoOffset) {
            BsSqlInventoryInfoOffset other = (BsSqlInventoryInfoOffset)obj;
            if (!xSV(_headid, other._headid)) { return false; }
            if (!xSV(_infoid, other._infoid)) { return false; }
            if (!xSV(_infoversion, other._infoversion)) { return false; }
            if (!xSV(_offsetid, other._offsetid)) { return false; }
            if (!xSV(_offsetcasecd, other._offsetcasecd)) { return false; }
            if (!xSV(_offsetcutcasecd, other._offsetcutcasecd)) { return false; }
            if (!xSV(_offsetdtlno, other._offsetdtlno)) { return false; }
            if (!xSV(_offsetinstno, other._offsetinstno)) { return false; }
            if (!xSV(_offsetinstbranchno, other._offsetinstbranchno)) { return false; }
            if (!xSV(_offsetversion, other._offsetversion)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _headid);
        hs = xCH(hs, _infoid);
        hs = xCH(hs, _infoversion);
        hs = xCH(hs, _offsetid);
        hs = xCH(hs, _offsetcasecd);
        hs = xCH(hs, _offsetcutcasecd);
        hs = xCH(hs, _offsetdtlno);
        hs = xCH(hs, _offsetinstno);
        hs = xCH(hs, _offsetinstbranchno);
        hs = xCH(hs, _offsetversion);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_headid));
        sb.append(dm).append(xfND(_infoid));
        sb.append(dm).append(xfND(_infoversion));
        sb.append(dm).append(xfND(_offsetid));
        sb.append(dm).append(xfND(_offsetcasecd));
        sb.append(dm).append(xfND(_offsetcutcasecd));
        sb.append(dm).append(xfND(_offsetdtlno));
        sb.append(dm).append(xfND(_offsetinstno));
        sb.append(dm).append(xfND(_offsetinstbranchno));
        sb.append(dm).append(xfND(_offsetversion));
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
    public SqlInventoryInfoOffset clone() {
        return (SqlInventoryInfoOffset)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HEADID: {bigint(19)} <br>
     * @return The value of the column 'HEADID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getHeadid() {
        checkSpecifiedProperty("headid");
        return _headid;
    }

    /**
     * [set] HEADID: {bigint(19)} <br>
     * @param headid The value of the column 'HEADID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeadid(Long headid) {
        registerModifiedProperty("headid");
        _headid = headid;
    }

    /**
     * [get] INFOID: {bigint(19)} <br>
     * @return The value of the column 'INFOID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInfoid() {
        checkSpecifiedProperty("infoid");
        return _infoid;
    }

    /**
     * [set] INFOID: {bigint(19)} <br>
     * @param infoid The value of the column 'INFOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInfoid(Long infoid) {
        registerModifiedProperty("infoid");
        _infoid = infoid;
    }

    /**
     * [get] INFOVERSION: {bigint(19)} <br>
     * @return The value of the column 'INFOVERSION'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInfoversion() {
        checkSpecifiedProperty("infoversion");
        return _infoversion;
    }

    /**
     * [set] INFOVERSION: {bigint(19)} <br>
     * @param infoversion The value of the column 'INFOVERSION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInfoversion(Long infoversion) {
        registerModifiedProperty("infoversion");
        _infoversion = infoversion;
    }

    /**
     * [get] OFFSETID: {bigint(19)} <br>
     * @return The value of the column 'OFFSETID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOffsetid() {
        checkSpecifiedProperty("offsetid");
        return _offsetid;
    }

    /**
     * [set] OFFSETID: {bigint(19)} <br>
     * @param offsetid The value of the column 'OFFSETID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOffsetid(Long offsetid) {
        registerModifiedProperty("offsetid");
        _offsetid = offsetid;
    }

    /**
     * [get] OFFSETCASECD: {decimal(16, 6)} <br>
     * @return The value of the column 'OFFSETCASECD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOffsetcasecd() {
        checkSpecifiedProperty("offsetcasecd");
        return _offsetcasecd;
    }

    /**
     * [set] OFFSETCASECD: {decimal(16, 6)} <br>
     * @param offsetcasecd The value of the column 'OFFSETCASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOffsetcasecd(java.math.BigDecimal offsetcasecd) {
        registerModifiedProperty("offsetcasecd");
        _offsetcasecd = offsetcasecd;
    }

    /**
     * [get] OFFSETCUTCASECD: {decimal(16, 6)} <br>
     * @return The value of the column 'OFFSETCUTCASECD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOffsetcutcasecd() {
        checkSpecifiedProperty("offsetcutcasecd");
        return _offsetcutcasecd;
    }

    /**
     * [set] OFFSETCUTCASECD: {decimal(16, 6)} <br>
     * @param offsetcutcasecd The value of the column 'OFFSETCUTCASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOffsetcutcasecd(java.math.BigDecimal offsetcutcasecd) {
        registerModifiedProperty("offsetcutcasecd");
        _offsetcutcasecd = offsetcutcasecd;
    }

    /**
     * [get] OFFSETDTLNO: {bigint(19)} <br>
     * @return The value of the column 'OFFSETDTLNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOffsetdtlno() {
        checkSpecifiedProperty("offsetdtlno");
        return _offsetdtlno;
    }

    /**
     * [set] OFFSETDTLNO: {bigint(19)} <br>
     * @param offsetdtlno The value of the column 'OFFSETDTLNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOffsetdtlno(Long offsetdtlno) {
        registerModifiedProperty("offsetdtlno");
        _offsetdtlno = offsetdtlno;
    }

    /**
     * [get] OFFSETINSTNO: {bigint(19)} <br>
     * @return The value of the column 'OFFSETINSTNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOffsetinstno() {
        checkSpecifiedProperty("offsetinstno");
        return _offsetinstno;
    }

    /**
     * [set] OFFSETINSTNO: {bigint(19)} <br>
     * @param offsetinstno The value of the column 'OFFSETINSTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOffsetinstno(Long offsetinstno) {
        registerModifiedProperty("offsetinstno");
        _offsetinstno = offsetinstno;
    }

    /**
     * [get] OFFSETINSTBRANCHNO: {bigint(19)} <br>
     * @return The value of the column 'OFFSETINSTBRANCHNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOffsetinstbranchno() {
        checkSpecifiedProperty("offsetinstbranchno");
        return _offsetinstbranchno;
    }

    /**
     * [set] OFFSETINSTBRANCHNO: {bigint(19)} <br>
     * @param offsetinstbranchno The value of the column 'OFFSETINSTBRANCHNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOffsetinstbranchno(Long offsetinstbranchno) {
        registerModifiedProperty("offsetinstbranchno");
        _offsetinstbranchno = offsetinstbranchno;
    }

    /**
     * [get] OFFSETVERSION: {bigint(19)} <br>
     * @return The value of the column 'OFFSETVERSION'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOffsetversion() {
        checkSpecifiedProperty("offsetversion");
        return _offsetversion;
    }

    /**
     * [set] OFFSETVERSION: {bigint(19)} <br>
     * @param offsetversion The value of the column 'OFFSETVERSION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOffsetversion(Long offsetversion) {
        registerModifiedProperty("offsetversion");
        _offsetversion = offsetversion;
    }
}
