package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTrhanbaiinvList05. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PID, PCD, TOTAL
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
 * entity.setPid(pid);
 * entity.setPcd(pcd);
 * entity.setTotal(total);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTrhanbaiinvList05 extends AbstractEntity implements CustomizeEntity {

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

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTrhanbaiinvList05Dbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTrhanbaiinvList05";
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
        if (obj instanceof BsSqlTrhanbaiinvList05) {
            BsSqlTrhanbaiinvList05 other = (BsSqlTrhanbaiinvList05)obj;
            if (!xSV(_pid, other._pid)) { return false; }
            if (!xSV(_pcd, other._pcd)) { return false; }
            if (!xSV(_total, other._total)) { return false; }
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
    public SqlTrhanbaiinvList05 clone() {
        return (SqlTrhanbaiinvList05)super.clone();
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
}
