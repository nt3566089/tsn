package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlAllocateControlMasterLast. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFPICKCTL_ID, PICKFRDATE, PICKTODATE, VALIDTYPE, VERSION_NO
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
 * Long mfpickctlId = entity.getMfpickctlId();
 * String pickfrdate = entity.getPickfrdate();
 * String picktodate = entity.getPicktodate();
 * String validtype = entity.getValidtype();
 * Long versionNo = entity.getVersionNo();
 * entity.setMfpickctlId(mfpickctlId);
 * entity.setPickfrdate(pickfrdate);
 * entity.setPicktodate(picktodate);
 * entity.setValidtype(validtype);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlAllocateControlMasterLast extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFPICKCTL_ID: {bigint(19)} */
    protected Long _mfpickctlId;

    /** PICKFRDATE: {varchar(8)} */
    protected String _pickfrdate;

    /** PICKTODATE: {varchar(8)} */
    protected String _picktodate;

    /** VALIDTYPE: {varchar(30)} */
    protected String _validtype;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlAllocateControlMasterLastDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlAllocateControlMasterLast";
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
        if (obj instanceof BsSqlAllocateControlMasterLast) {
            BsSqlAllocateControlMasterLast other = (BsSqlAllocateControlMasterLast)obj;
            if (!xSV(_mfpickctlId, other._mfpickctlId)) { return false; }
            if (!xSV(_pickfrdate, other._pickfrdate)) { return false; }
            if (!xSV(_picktodate, other._picktodate)) { return false; }
            if (!xSV(_validtype, other._validtype)) { return false; }
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
        hs = xCH(hs, _mfpickctlId);
        hs = xCH(hs, _pickfrdate);
        hs = xCH(hs, _picktodate);
        hs = xCH(hs, _validtype);
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
        sb.append(dm).append(xfND(_mfpickctlId));
        sb.append(dm).append(xfND(_pickfrdate));
        sb.append(dm).append(xfND(_picktodate));
        sb.append(dm).append(xfND(_validtype));
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
    public SqlAllocateControlMasterLast clone() {
        return (SqlAllocateControlMasterLast)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFPICKCTL_ID: {bigint(19)} <br>
     * @return The value of the column 'MFPICKCTL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMfpickctlId() {
        checkSpecifiedProperty("mfpickctlId");
        return _mfpickctlId;
    }

    /**
     * [set] MFPICKCTL_ID: {bigint(19)} <br>
     * @param mfpickctlId The value of the column 'MFPICKCTL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMfpickctlId(Long mfpickctlId) {
        registerModifiedProperty("mfpickctlId");
        _mfpickctlId = mfpickctlId;
    }

    /**
     * [get] PICKFRDATE: {varchar(8)} <br>
     * @return The value of the column 'PICKFRDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickfrdate() {
        checkSpecifiedProperty("pickfrdate");
        return convertEmptyToNull(_pickfrdate);
    }

    /**
     * [set] PICKFRDATE: {varchar(8)} <br>
     * @param pickfrdate The value of the column 'PICKFRDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickfrdate(String pickfrdate) {
        registerModifiedProperty("pickfrdate");
        _pickfrdate = pickfrdate;
    }

    /**
     * [get] PICKTODATE: {varchar(8)} <br>
     * @return The value of the column 'PICKTODATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicktodate() {
        checkSpecifiedProperty("picktodate");
        return convertEmptyToNull(_picktodate);
    }

    /**
     * [set] PICKTODATE: {varchar(8)} <br>
     * @param picktodate The value of the column 'PICKTODATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicktodate(String picktodate) {
        registerModifiedProperty("picktodate");
        _picktodate = picktodate;
    }

    /**
     * [get] VALIDTYPE: {varchar(30)} <br>
     * @return The value of the column 'VALIDTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getValidtype() {
        checkSpecifiedProperty("validtype");
        return convertEmptyToNull(_validtype);
    }

    /**
     * [set] VALIDTYPE: {varchar(30)} <br>
     * @param validtype The value of the column 'VALIDTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValidtype(String validtype) {
        registerModifiedProperty("validtype");
        _validtype = validtype;
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
