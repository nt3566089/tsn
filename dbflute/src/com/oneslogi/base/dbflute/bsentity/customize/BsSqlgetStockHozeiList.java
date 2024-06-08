package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlgetStockHozeiList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LID, PID, PCD, LOT1, LOT4, LOT2, SUMCHARGE, SUMALLOC
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
 * Long lid = entity.getLid();
 * Long pid = entity.getPid();
 * String pcd = entity.getPcd();
 * String lot1 = entity.getLot1();
 * String lot4 = entity.getLot4();
 * String lot2 = entity.getLot2();
 * java.math.BigDecimal sumcharge = entity.getSumcharge();
 * java.math.BigDecimal sumalloc = entity.getSumalloc();
 * entity.setLid(lid);
 * entity.setPid(pid);
 * entity.setPcd(pcd);
 * entity.setLot1(lot1);
 * entity.setLot4(lot4);
 * entity.setLot2(lot2);
 * entity.setSumcharge(sumcharge);
 * entity.setSumalloc(sumalloc);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlgetStockHozeiList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LID: {bigint(19)} */
    protected Long _lid;

    /** PID: {bigint(19)} */
    protected Long _pid;

    /** PCD: {varchar(100)} */
    protected String _pcd;

    /** LOT1: {varchar(255)} */
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT2: {varchar(255)} */
    protected String _lot2;

    /** SUMCHARGE: {decimal(38, 6)} */
    protected java.math.BigDecimal _sumcharge;

    /** SUMALLOC: {decimal(38, 6)} */
    protected java.math.BigDecimal _sumalloc;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlgetStockHozeiListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlgetStockHozeiList";
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
        if (obj instanceof BsSqlgetStockHozeiList) {
            BsSqlgetStockHozeiList other = (BsSqlgetStockHozeiList)obj;
            if (!xSV(_lid, other._lid)) { return false; }
            if (!xSV(_pid, other._pid)) { return false; }
            if (!xSV(_pcd, other._pcd)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_lot2, other._lot2)) { return false; }
            if (!xSV(_sumcharge, other._sumcharge)) { return false; }
            if (!xSV(_sumalloc, other._sumalloc)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lid);
        hs = xCH(hs, _pid);
        hs = xCH(hs, _pcd);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _lot2);
        hs = xCH(hs, _sumcharge);
        hs = xCH(hs, _sumalloc);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lid));
        sb.append(dm).append(xfND(_pid));
        sb.append(dm).append(xfND(_pcd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_sumcharge));
        sb.append(dm).append(xfND(_sumalloc));
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
    public SqlgetStockHozeiList clone() {
        return (SqlgetStockHozeiList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LID: {bigint(19)} <br>
     * @return The value of the column 'LID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLid() {
        checkSpecifiedProperty("lid");
        return _lid;
    }

    /**
     * [set] LID: {bigint(19)} <br>
     * @param lid The value of the column 'LID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLid(Long lid) {
        registerModifiedProperty("lid");
        _lid = lid;
    }

    /**
     * [get] PID: {bigint(19)} <br>
     * @return The value of the column 'PID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPid() {
        checkSpecifiedProperty("pid");
        return _pid;
    }

    /**
     * [set] PID: {bigint(19)} <br>
     * @param pid The value of the column 'PID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPid(Long pid) {
        registerModifiedProperty("pid");
        _pid = pid;
    }

    /**
     * [get] PCD: {varchar(100)} <br>
     * @return The value of the column 'PCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPcd() {
        checkSpecifiedProperty("pcd");
        return convertEmptyToNull(_pcd);
    }

    /**
     * [set] PCD: {varchar(100)} <br>
     * @param pcd The value of the column 'PCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPcd(String pcd) {
        registerModifiedProperty("pcd");
        _pcd = pcd;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] SUMCHARGE: {decimal(38, 6)} <br>
     * @return The value of the column 'SUMCHARGE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumcharge() {
        checkSpecifiedProperty("sumcharge");
        return _sumcharge;
    }

    /**
     * [set] SUMCHARGE: {decimal(38, 6)} <br>
     * @param sumcharge The value of the column 'SUMCHARGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumcharge(java.math.BigDecimal sumcharge) {
        registerModifiedProperty("sumcharge");
        _sumcharge = sumcharge;
    }

    /**
     * [get] SUMALLOC: {decimal(38, 6)} <br>
     * @return The value of the column 'SUMALLOC'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumalloc() {
        checkSpecifiedProperty("sumalloc");
        return _sumalloc;
    }

    /**
     * [set] SUMALLOC: {decimal(38, 6)} <br>
     * @param sumalloc The value of the column 'SUMALLOC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumalloc(java.math.BigDecimal sumalloc) {
        registerModifiedProperty("sumalloc");
        _sumalloc = sumalloc;
    }
}
