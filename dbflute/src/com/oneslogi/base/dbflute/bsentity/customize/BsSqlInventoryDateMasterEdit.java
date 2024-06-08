package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryDateMasterEdit. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFINVOPERATION_ID, CENTER_ID, CENTER_CD, CLIENT_ID, CLIENT_CD, TARGET_DATE, TARGET_DATE_EDIT, SUNDAY_FLG, INV_DATE, INV_DATE_EDIT, VERSION_NO
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
 * Long mfinvoperationId = entity.getMfinvoperationId();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String targetDate = entity.getTargetDate();
 * Integer targetDateEdit = entity.getTargetDateEdit();
 * String sundayFlg = entity.getSundayFlg();
 * String invDate = entity.getInvDate();
 * Integer invDateEdit = entity.getInvDateEdit();
 * Long versionNo = entity.getVersionNo();
 * entity.setMfinvoperationId(mfinvoperationId);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setTargetDate(targetDate);
 * entity.setTargetDateEdit(targetDateEdit);
 * entity.setSundayFlg(sundayFlg);
 * entity.setInvDate(invDate);
 * entity.setInvDateEdit(invDateEdit);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryDateMasterEdit extends AbstractEntity implements CustomizeEntity {

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

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** TARGET_DATE: {varchar(8)} */
    protected String _targetDate;

    /** TARGET_DATE_EDIT: {int(10)} */
    protected Integer _targetDateEdit;

    /** SUNDAY_FLG: {char(1)} */
    protected String _sundayFlg;

    /** INV_DATE: {varchar(8)} */
    protected String _invDate;

    /** INV_DATE_EDIT: {int(10)} */
    protected Integer _invDateEdit;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryDateMasterEditDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryDateMasterEdit";
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
        if (obj instanceof BsSqlInventoryDateMasterEdit) {
            BsSqlInventoryDateMasterEdit other = (BsSqlInventoryDateMasterEdit)obj;
            if (!xSV(_mfinvoperationId, other._mfinvoperationId)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_targetDate, other._targetDate)) { return false; }
            if (!xSV(_targetDateEdit, other._targetDateEdit)) { return false; }
            if (!xSV(_sundayFlg, other._sundayFlg)) { return false; }
            if (!xSV(_invDate, other._invDate)) { return false; }
            if (!xSV(_invDateEdit, other._invDateEdit)) { return false; }
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
        hs = xCH(hs, _mfinvoperationId);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _targetDate);
        hs = xCH(hs, _targetDateEdit);
        hs = xCH(hs, _sundayFlg);
        hs = xCH(hs, _invDate);
        hs = xCH(hs, _invDateEdit);
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
        sb.append(dm).append(xfND(_mfinvoperationId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_targetDate));
        sb.append(dm).append(xfND(_targetDateEdit));
        sb.append(dm).append(xfND(_sundayFlg));
        sb.append(dm).append(xfND(_invDate));
        sb.append(dm).append(xfND(_invDateEdit));
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
    public SqlInventoryDateMasterEdit clone() {
        return (SqlInventoryDateMasterEdit)super.clone();
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
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
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
    public Integer getTargetDateEdit() {
        checkSpecifiedProperty("targetDateEdit");
        return _targetDateEdit;
    }

    /**
     * [set] TARGET_DATE_EDIT: {int(10)} <br>
     * @param targetDateEdit The value of the column 'TARGET_DATE_EDIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTargetDateEdit(Integer targetDateEdit) {
        registerModifiedProperty("targetDateEdit");
        _targetDateEdit = targetDateEdit;
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
    public Integer getInvDateEdit() {
        checkSpecifiedProperty("invDateEdit");
        return _invDateEdit;
    }

    /**
     * [set] INV_DATE_EDIT: {int(10)} <br>
     * @param invDateEdit The value of the column 'INV_DATE_EDIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvDateEdit(Integer invDateEdit) {
        registerModifiedProperty("invDateEdit");
        _invDateEdit = invDateEdit;
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
