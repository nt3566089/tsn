package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlMCbrctgDropDownList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     BRCTG, BRCTGNM
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
 * Long brctg = entity.getBrctg();
 * String brctgnm = entity.getBrctgnm();
 * entity.setBrctg(brctg);
 * entity.setBrctgnm(brctgnm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlMCbrctgDropDownList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BRCTG: {bigint(19)} */
    protected Long _brctg;

    /** BRCTGNM: {varchar(30)} */
    protected String _brctgnm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlMCbrctgDropDownListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlMCbrctgDropDownList";
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
        if (obj instanceof BsSqlMCbrctgDropDownList) {
            BsSqlMCbrctgDropDownList other = (BsSqlMCbrctgDropDownList)obj;
            if (!xSV(_brctg, other._brctg)) { return false; }
            if (!xSV(_brctgnm, other._brctgnm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _brctg);
        hs = xCH(hs, _brctgnm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_brctg));
        sb.append(dm).append(xfND(_brctgnm));
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
    public SqlMCbrctgDropDownList clone() {
        return (SqlMCbrctgDropDownList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BRCTG: {bigint(19)} <br>
     * @return The value of the column 'BRCTG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBrctg() {
        checkSpecifiedProperty("brctg");
        return _brctg;
    }

    /**
     * [set] BRCTG: {bigint(19)} <br>
     * @param brctg The value of the column 'BRCTG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrctg(Long brctg) {
        registerModifiedProperty("brctg");
        _brctg = brctg;
    }

    /**
     * [get] BRCTGNM: {varchar(30)} <br>
     * @return The value of the column 'BRCTGNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrctgnm() {
        checkSpecifiedProperty("brctgnm");
        return convertEmptyToNull(_brctgnm);
    }

    /**
     * [set] BRCTGNM: {varchar(30)} <br>
     * @param brctgnm The value of the column 'BRCTGNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrctgnm(String brctgnm) {
        registerModifiedProperty("brctgnm");
        _brctgnm = brctgnm;
    }
}
