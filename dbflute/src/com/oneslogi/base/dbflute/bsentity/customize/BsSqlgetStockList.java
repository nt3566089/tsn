package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlgetStockList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LID, PID, PCD, SUMCHARGE, SUMALLOC
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
 * java.math.BigDecimal sumcharge = entity.getSumcharge();
 * java.math.BigDecimal sumalloc = entity.getSumalloc();
 * entity.setLid(lid);
 * entity.setPid(pid);
 * entity.setPcd(pcd);
 * entity.setSumcharge(sumcharge);
 * entity.setSumalloc(sumalloc);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlgetStockList extends AbstractEntity implements CustomizeEntity {

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

    /** SUMCHARGE: {decimal(38, 6)} */
    protected java.math.BigDecimal _sumcharge;

    /** SUMALLOC: {decimal(38, 6)} */
    protected java.math.BigDecimal _sumalloc;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlgetStockListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlgetStockList";
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
        if (obj instanceof BsSqlgetStockList) {
            BsSqlgetStockList other = (BsSqlgetStockList)obj;
            if (!xSV(_lid, other._lid)) { return false; }
            if (!xSV(_pid, other._pid)) { return false; }
            if (!xSV(_pcd, other._pcd)) { return false; }
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
    public SqlgetStockList clone() {
        return (SqlgetStockList)super.clone();
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
