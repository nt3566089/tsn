package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTTrassortorderList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     DIRECTIONORDERKEY, DIRECTIONORDERGNO, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
 * Long directionorderkey = entity.getDirectionorderkey();
 * Long directionordergno = entity.getDirectionordergno();
 * Long versionNo = entity.getVersionNo();
 * entity.setDirectionorderkey(directionorderkey);
 * entity.setDirectionordergno(directionordergno);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTTrassortorderList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DIRECTIONORDERKEY: {bigint(19)} */
    protected Long _directionorderkey;

    /** DIRECTIONORDERGNO: {bigint(19)} */
    protected Long _directionordergno;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTTrassortorderListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTTrassortorderList";
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
        if (obj instanceof BsSqlTTrassortorderList) {
            BsSqlTTrassortorderList other = (BsSqlTTrassortorderList)obj;
            if (!xSV(_directionorderkey, other._directionorderkey)) { return false; }
            if (!xSV(_directionordergno, other._directionordergno)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _directionorderkey);
        hs = xCH(hs, _directionordergno);
        hs = xCH(hs, _versionNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_directionorderkey));
        sb.append(dm).append(xfND(_directionordergno));
        sb.append(dm).append(xfND(_versionNo));
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
    public SqlTTrassortorderList clone() {
        return (SqlTTrassortorderList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DIRECTIONORDERKEY: {bigint(19)} <br>
     * @return The value of the column 'DIRECTIONORDERKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDirectionorderkey() {
        checkSpecifiedProperty("directionorderkey");
        return _directionorderkey;
    }

    /**
     * [set] DIRECTIONORDERKEY: {bigint(19)} <br>
     * @param directionorderkey The value of the column 'DIRECTIONORDERKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionorderkey(Long directionorderkey) {
        registerModifiedProperty("directionorderkey");
        _directionorderkey = directionorderkey;
    }

    /**
     * [get] DIRECTIONORDERGNO: {bigint(19)} <br>
     * @return The value of the column 'DIRECTIONORDERGNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDirectionordergno() {
        checkSpecifiedProperty("directionordergno");
        return _directionordergno;
    }

    /**
     * [set] DIRECTIONORDERGNO: {bigint(19)} <br>
     * @param directionordergno The value of the column 'DIRECTIONORDERGNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionordergno(Long directionordergno) {
        registerModifiedProperty("directionordergno");
        _directionordergno = directionordergno;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
