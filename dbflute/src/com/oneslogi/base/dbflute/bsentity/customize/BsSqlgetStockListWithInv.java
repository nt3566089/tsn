package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlgetStockListWithInv. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PCD, TOTAL
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
 * java.math.BigDecimal total = entity.getTotal();
 * entity.setPcd(pcd);
 * entity.setTotal(total);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlgetStockListWithInv extends AbstractEntity implements CustomizeEntity {

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

    /** TOTAL: {decimal(38, 6)} */
    protected java.math.BigDecimal _total;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlgetStockListWithInvDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlgetStockListWithInv";
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
        if (obj instanceof BsSqlgetStockListWithInv) {
            BsSqlgetStockListWithInv other = (BsSqlgetStockListWithInv)obj;
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
    public SqlgetStockListWithInv clone() {
        return (SqlgetStockListWithInv)super.clone();
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
