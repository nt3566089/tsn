package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTrhanbaiinvAssortList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PCD, USERNUM4, TOTAL
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
 * String pcd = entity.getPcd();
 * Long usernum4 = entity.getUsernum4();
 * java.math.BigDecimal total = entity.getTotal();
 * entity.setPcd(pcd);
 * entity.setUsernum4(usernum4);
 * entity.setTotal(total);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTrhanbaiinvAssortList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PCD: {varchar(60)} */
    protected String _pcd;

    /** USERNUM4: {bigint(19)} */
    protected Long _usernum4;

    /** TOTAL: {decimal(38, 6)} */
    protected java.math.BigDecimal _total;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTrhanbaiinvAssortListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTrhanbaiinvAssortList";
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
        if (obj instanceof BsSqlTrhanbaiinvAssortList) {
            BsSqlTrhanbaiinvAssortList other = (BsSqlTrhanbaiinvAssortList)obj;
            if (!xSV(_pcd, other._pcd)) { return false; }
            if (!xSV(_usernum4, other._usernum4)) { return false; }
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
        hs = xCH(hs, _pcd);
        hs = xCH(hs, _usernum4);
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
        sb.append(dm).append(xfND(_pcd));
        sb.append(dm).append(xfND(_usernum4));
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
    public SqlTrhanbaiinvAssortList clone() {
        return (SqlTrhanbaiinvAssortList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PCD: {varchar(60)} <br>
     * @return The value of the column 'PCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPcd() {
        checkSpecifiedProperty("pcd");
        return convertEmptyToNull(_pcd);
    }

    /**
     * [set] PCD: {varchar(60)} <br>
     * @param pcd The value of the column 'PCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPcd(String pcd) {
        registerModifiedProperty("pcd");
        _pcd = pcd;
    }

    /**
     * [get] USERNUM4: {bigint(19)} <br>
     * @return The value of the column 'USERNUM4'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum4() {
        checkSpecifiedProperty("usernum4");
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {bigint(19)} <br>
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum4(Long usernum4) {
        registerModifiedProperty("usernum4");
        _usernum4 = usernum4;
    }

    /**
     * [get] TOTAL: {decimal(38, 6)} <br>
     * @return The value of the column 'TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotal() {
        checkSpecifiedProperty("total");
        return _total;
    }

    /**
     * [set] TOTAL: {decimal(38, 6)} <br>
     * @param total The value of the column 'TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotal(java.math.BigDecimal total) {
        registerModifiedProperty("total");
        _total = total;
    }
}
