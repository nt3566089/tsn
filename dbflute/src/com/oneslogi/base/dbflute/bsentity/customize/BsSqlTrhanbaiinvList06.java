package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTrhanbaiinvList06. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PID, PCD, TOTAL, TAXTOTA, INOUTKBN
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
 * Long pid = entity.getPid();
 * String pcd = entity.getPcd();
 * Long total = entity.getTotal();
 * Long taxtota = entity.getTaxtota();
 * String inoutkbn = entity.getInoutkbn();
 * entity.setPid(pid);
 * entity.setPcd(pcd);
 * entity.setTotal(total);
 * entity.setTaxtota(taxtota);
 * entity.setInoutkbn(inoutkbn);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTrhanbaiinvList06 extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PID: {bigint(19)} */
    protected Long _pid;

    /** PCD: {varchar(30)} */
    protected String _pcd;

    /** TOTAL: {bigint(19)} */
    protected Long _total;

    /** TAXTOTA: {bigint(19)} */
    protected Long _taxtota;

    /** INOUTKBN: {varchar(30)} */
    protected String _inoutkbn;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTrhanbaiinvList06Dbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTrhanbaiinvList06";
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
        if (obj instanceof BsSqlTrhanbaiinvList06) {
            BsSqlTrhanbaiinvList06 other = (BsSqlTrhanbaiinvList06)obj;
            if (!xSV(_pid, other._pid)) { return false; }
            if (!xSV(_pcd, other._pcd)) { return false; }
            if (!xSV(_total, other._total)) { return false; }
            if (!xSV(_taxtota, other._taxtota)) { return false; }
            if (!xSV(_inoutkbn, other._inoutkbn)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pid);
        hs = xCH(hs, _pcd);
        hs = xCH(hs, _total);
        hs = xCH(hs, _taxtota);
        hs = xCH(hs, _inoutkbn);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pid));
        sb.append(dm).append(xfND(_pcd));
        sb.append(dm).append(xfND(_total));
        sb.append(dm).append(xfND(_taxtota));
        sb.append(dm).append(xfND(_inoutkbn));
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
    public SqlTrhanbaiinvList06 clone() {
        return (SqlTrhanbaiinvList06)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] PCD: {varchar(30)} <br>
     * @return The value of the column 'PCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPcd() {
        checkSpecifiedProperty("pcd");
        return convertEmptyToNull(_pcd);
    }

    /**
     * [set] PCD: {varchar(30)} <br>
     * @param pcd The value of the column 'PCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPcd(String pcd) {
        registerModifiedProperty("pcd");
        _pcd = pcd;
    }

    /**
     * [get] TOTAL: {bigint(19)} <br>
     * @return The value of the column 'TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotal() {
        checkSpecifiedProperty("total");
        return _total;
    }

    /**
     * [set] TOTAL: {bigint(19)} <br>
     * @param total The value of the column 'TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotal(Long total) {
        registerModifiedProperty("total");
        _total = total;
    }

    /**
     * [get] TAXTOTA: {bigint(19)} <br>
     * @return The value of the column 'TAXTOTA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTaxtota() {
        checkSpecifiedProperty("taxtota");
        return _taxtota;
    }

    /**
     * [set] TAXTOTA: {bigint(19)} <br>
     * @param taxtota The value of the column 'TAXTOTA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaxtota(Long taxtota) {
        registerModifiedProperty("taxtota");
        _taxtota = taxtota;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * @return The value of the column 'INOUTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutkbn() {
        checkSpecifiedProperty("inoutkbn");
        return convertEmptyToNull(_inoutkbn);
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutkbn(String inoutkbn) {
        registerModifiedProperty("inoutkbn");
        _inoutkbn = inoutkbn;
    }
}
