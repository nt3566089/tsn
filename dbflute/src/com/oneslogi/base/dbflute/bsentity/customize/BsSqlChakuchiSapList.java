package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlChakuchiSapList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RLYBSCD, RLYBSSNM
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
 * String rlybscd = entity.getRlybscd();
 * String rlybssnm = entity.getRlybssnm();
 * entity.setRlybscd(rlybscd);
 * entity.setRlybssnm(rlybssnm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlChakuchiSapList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RLYBSCD: {varchar(30)} */
    protected String _rlybscd;

    /** RLYBSSNM: {varchar(30)} */
    protected String _rlybssnm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlChakuchiSapListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlChakuchiSapList";
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
        if (obj instanceof BsSqlChakuchiSapList) {
            BsSqlChakuchiSapList other = (BsSqlChakuchiSapList)obj;
            if (!xSV(_rlybscd, other._rlybscd)) { return false; }
            if (!xSV(_rlybssnm, other._rlybssnm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _rlybscd);
        hs = xCH(hs, _rlybssnm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_rlybscd));
        sb.append(dm).append(xfND(_rlybssnm));
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
    public SqlChakuchiSapList clone() {
        return (SqlChakuchiSapList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RLYBSCD: {varchar(30)} <br>
     * @return The value of the column 'RLYBSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybscd() {
        checkSpecifiedProperty("rlybscd");
        return convertEmptyToNull(_rlybscd);
    }

    /**
     * [set] RLYBSCD: {varchar(30)} <br>
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybscd(String rlybscd) {
        registerModifiedProperty("rlybscd");
        _rlybscd = rlybscd;
    }

    /**
     * [get] RLYBSSNM: {varchar(30)} <br>
     * @return The value of the column 'RLYBSSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybssnm() {
        checkSpecifiedProperty("rlybssnm");
        return convertEmptyToNull(_rlybssnm);
    }

    /**
     * [set] RLYBSSNM: {varchar(30)} <br>
     * @param rlybssnm The value of the column 'RLYBSSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybssnm(String rlybssnm) {
        registerModifiedProperty("rlybssnm");
        _rlybssnm = rlybssnm;
    }
}
