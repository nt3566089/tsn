package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryDateMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFINVOPERATION_ID, TARGET_DATE, TARGET_DATE_EDIT, SUNDAY_FLG_NM, SUNDAY_FLG, INV_DATE, INV_DATE_EDIT, UPD_DT, UPD_USER, USER_NM
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
 * Long mfinvoperationId = entity.getMfinvoperationId();
 * String targetDate = entity.getTargetDate();
 * String targetDateEdit = entity.getTargetDateEdit();
 * String sundayFlgNm = entity.getSundayFlgNm();
 * String sundayFlg = entity.getSundayFlg();
 * String invDate = entity.getInvDate();
 * String invDateEdit = entity.getInvDateEdit();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String userNm = entity.getUserNm();
 * entity.setMfinvoperationId(mfinvoperationId);
 * entity.setTargetDate(targetDate);
 * entity.setTargetDateEdit(targetDateEdit);
 * entity.setSundayFlgNm(sundayFlgNm);
 * entity.setSundayFlg(sundayFlg);
 * entity.setInvDate(invDate);
 * entity.setInvDateEdit(invDateEdit);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUserNm(userNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryDateMasterList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFINVOPERATION_ID: {bigint(19)} */
    protected Long _mfinvoperationId;

    /** TARGET_DATE: {varchar(8)} */
    protected String _targetDate;

    /** TARGET_DATE_EDIT: {int(10)} */
    protected String _targetDateEdit;

    /** SUNDAY_FLG_NM: {int(10)} */
    protected String _sundayFlgNm;

    /** SUNDAY_FLG: {char(1)} */
    protected String _sundayFlg;

    /** INV_DATE: {varchar(8)} */
    protected String _invDate;

    /** INV_DATE_EDIT: {int(10)} */
    protected String _invDateEdit;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** USER_NM: {varchar(60)} */
    protected String _userNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryDateMasterListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryDateMasterList";
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
        if (obj instanceof BsSqlInventoryDateMasterList) {
            BsSqlInventoryDateMasterList other = (BsSqlInventoryDateMasterList)obj;
            if (!xSV(_mfinvoperationId, other._mfinvoperationId)) { return false; }
            if (!xSV(_targetDate, other._targetDate)) { return false; }
            if (!xSV(_targetDateEdit, other._targetDateEdit)) { return false; }
            if (!xSV(_sundayFlgNm, other._sundayFlgNm)) { return false; }
            if (!xSV(_sundayFlg, other._sundayFlg)) { return false; }
            if (!xSV(_invDate, other._invDate)) { return false; }
            if (!xSV(_invDateEdit, other._invDateEdit)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mfinvoperationId);
        hs = xCH(hs, _targetDate);
        hs = xCH(hs, _targetDateEdit);
        hs = xCH(hs, _sundayFlgNm);
        hs = xCH(hs, _sundayFlg);
        hs = xCH(hs, _invDate);
        hs = xCH(hs, _invDateEdit);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _userNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mfinvoperationId));
        sb.append(dm).append(xfND(_targetDate));
        sb.append(dm).append(xfND(_targetDateEdit));
        sb.append(dm).append(xfND(_sundayFlgNm));
        sb.append(dm).append(xfND(_sundayFlg));
        sb.append(dm).append(xfND(_invDate));
        sb.append(dm).append(xfND(_invDateEdit));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_userNm));
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
    public SqlInventoryDateMasterList clone() {
        return (SqlInventoryDateMasterList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFINVOPERATION_ID: {bigint(19)} <br>
     * @return The value of the column 'MFINVOPERATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMfinvoperationId() {
        checkSpecifiedProperty("mfinvoperationId");
        return _mfinvoperationId;
    }

    /**
     * [set] MFINVOPERATION_ID: {bigint(19)} <br>
     * @param mfinvoperationId The value of the column 'MFINVOPERATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMfinvoperationId(Long mfinvoperationId) {
        registerModifiedProperty("mfinvoperationId");
        _mfinvoperationId = mfinvoperationId;
    }

    /**
     * [get] TARGET_DATE: {varchar(8)} <br>
     * @return The value of the column 'TARGET_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTargetDate() {
        checkSpecifiedProperty("targetDate");
        return convertEmptyToNull(_targetDate);
    }

    /**
     * [set] TARGET_DATE: {varchar(8)} <br>
     * @param targetDate The value of the column 'TARGET_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTargetDate(String targetDate) {
        registerModifiedProperty("targetDate");
        _targetDate = targetDate;
    }

    /**
     * [get] TARGET_DATE_EDIT: {int(10)} <br>
     * @return The value of the column 'TARGET_DATE_EDIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTargetDateEdit() {
        checkSpecifiedProperty("targetDateEdit");
        return convertEmptyToNull(_targetDateEdit);
    }

    /**
     * [set] TARGET_DATE_EDIT: {int(10)} <br>
     * @param targetDateEdit The value of the column 'TARGET_DATE_EDIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTargetDateEdit(String targetDateEdit) {
        registerModifiedProperty("targetDateEdit");
        _targetDateEdit = targetDateEdit;
    }

    /**
     * [get] SUNDAY_FLG_NM: {int(10)} <br>
     * @return The value of the column 'SUNDAY_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSundayFlgNm() {
        checkSpecifiedProperty("sundayFlgNm");
        return convertEmptyToNull(_sundayFlgNm);
    }

    /**
     * [set] SUNDAY_FLG_NM: {int(10)} <br>
     * @param sundayFlgNm The value of the column 'SUNDAY_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSundayFlgNm(String sundayFlgNm) {
        registerModifiedProperty("sundayFlgNm");
        _sundayFlgNm = sundayFlgNm;
    }

    /**
     * [get] SUNDAY_FLG: {char(1)} <br>
     * @return The value of the column 'SUNDAY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSundayFlg() {
        checkSpecifiedProperty("sundayFlg");
        return convertEmptyToNull(_sundayFlg);
    }

    /**
     * [set] SUNDAY_FLG: {char(1)} <br>
     * @param sundayFlg The value of the column 'SUNDAY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSundayFlg(String sundayFlg) {
        registerModifiedProperty("sundayFlg");
        _sundayFlg = sundayFlg;
    }

    /**
     * [get] INV_DATE: {varchar(8)} <br>
     * @return The value of the column 'INV_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvDate() {
        checkSpecifiedProperty("invDate");
        return convertEmptyToNull(_invDate);
    }

    /**
     * [set] INV_DATE: {varchar(8)} <br>
     * @param invDate The value of the column 'INV_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvDate(String invDate) {
        registerModifiedProperty("invDate");
        _invDate = invDate;
    }

    /**
     * [get] INV_DATE_EDIT: {int(10)} <br>
     * @return The value of the column 'INV_DATE_EDIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvDateEdit() {
        checkSpecifiedProperty("invDateEdit");
        return convertEmptyToNull(_invDateEdit);
    }

    /**
     * [set] INV_DATE_EDIT: {int(10)} <br>
     * @param invDateEdit The value of the column 'INV_DATE_EDIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvDateEdit(String invDateEdit) {
        registerModifiedProperty("invDateEdit");
        _invDateEdit = invDateEdit;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] USER_NM: {varchar(60)} <br>
     * @return The value of the column 'USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserNm() {
        checkSpecifiedProperty("userNm");
        return convertEmptyToNull(_userNm);
    }

    /**
     * [set] USER_NM: {varchar(60)} <br>
     * @param userNm The value of the column 'USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserNm(String userNm) {
        registerModifiedProperty("userNm");
        _userNm = userNm;
    }
}
