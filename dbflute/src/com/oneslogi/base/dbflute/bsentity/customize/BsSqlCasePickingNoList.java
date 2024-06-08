package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlCasePickingNoList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     center_id, case_picking_no, packing_status, packing_status_nm, user_cd, user_nm
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
 * Long centerId = entity.getCenterId();
 * String casePickingNo = entity.getCasePickingNo();
 * String packingStatus = entity.getPackingStatus();
 * String packingStatusNm = entity.getPackingStatusNm();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * entity.setCenterId(centerId);
 * entity.setCasePickingNo(casePickingNo);
 * entity.setPackingStatus(packingStatus);
 * entity.setPackingStatusNm(packingStatusNm);
 * entity.setUserCd(userCd);
 * entity.setUserNm(userNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlCasePickingNoList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** center_id: {bigint(19)} */
    protected Long _centerId;

    /** case_picking_no: {varchar(30)} */
    protected String _casePickingNo;

    /** packing_status: {varchar(30)} */
    protected String _packingStatus;

    /** packing_status_nm: {varchar(100)} */
    protected String _packingStatusNm;

    /** user_cd: {varchar(255)} */
    protected String _userCd;

    /** user_nm: {varchar(60)} */
    protected String _userNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlCasePickingNoListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlCasePickingNoList";
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
        if (obj instanceof BsSqlCasePickingNoList) {
            BsSqlCasePickingNoList other = (BsSqlCasePickingNoList)obj;
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_casePickingNo, other._casePickingNo)) { return false; }
            if (!xSV(_packingStatus, other._packingStatus)) { return false; }
            if (!xSV(_packingStatusNm, other._packingStatusNm)) { return false; }
            if (!xSV(_userCd, other._userCd)) { return false; }
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
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _casePickingNo);
        hs = xCH(hs, _packingStatus);
        hs = xCH(hs, _packingStatusNm);
        hs = xCH(hs, _userCd);
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
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_casePickingNo));
        sb.append(dm).append(xfND(_packingStatus));
        sb.append(dm).append(xfND(_packingStatusNm));
        sb.append(dm).append(xfND(_userCd));
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
    public SqlCasePickingNoList clone() {
        return (SqlCasePickingNoList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] center_id: {bigint(19)} <br>
     * @return The value of the column 'center_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] center_id: {bigint(19)} <br>
     * @param centerId The value of the column 'center_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] case_picking_no: {varchar(30)} <br>
     * @return The value of the column 'case_picking_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePickingNo() {
        checkSpecifiedProperty("casePickingNo");
        return convertEmptyToNull(_casePickingNo);
    }

    /**
     * [set] case_picking_no: {varchar(30)} <br>
     * @param casePickingNo The value of the column 'case_picking_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePickingNo(String casePickingNo) {
        registerModifiedProperty("casePickingNo");
        _casePickingNo = casePickingNo;
    }

    /**
     * [get] packing_status: {varchar(30)} <br>
     * @return The value of the column 'packing_status'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingStatus() {
        checkSpecifiedProperty("packingStatus");
        return convertEmptyToNull(_packingStatus);
    }

    /**
     * [set] packing_status: {varchar(30)} <br>
     * @param packingStatus The value of the column 'packing_status'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingStatus(String packingStatus) {
        registerModifiedProperty("packingStatus");
        _packingStatus = packingStatus;
    }

    /**
     * [get] packing_status_nm: {varchar(100)} <br>
     * @return The value of the column 'packing_status_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingStatusNm() {
        checkSpecifiedProperty("packingStatusNm");
        return convertEmptyToNull(_packingStatusNm);
    }

    /**
     * [set] packing_status_nm: {varchar(100)} <br>
     * @param packingStatusNm The value of the column 'packing_status_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingStatusNm(String packingStatusNm) {
        registerModifiedProperty("packingStatusNm");
        _packingStatusNm = packingStatusNm;
    }

    /**
     * [get] user_cd: {varchar(255)} <br>
     * @return The value of the column 'user_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserCd() {
        checkSpecifiedProperty("userCd");
        return convertEmptyToNull(_userCd);
    }

    /**
     * [set] user_cd: {varchar(255)} <br>
     * @param userCd The value of the column 'user_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserCd(String userCd) {
        registerModifiedProperty("userCd");
        _userCd = userCd;
    }

    /**
     * [get] user_nm: {varchar(60)} <br>
     * @return The value of the column 'user_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserNm() {
        checkSpecifiedProperty("userNm");
        return convertEmptyToNull(_userNm);
    }

    /**
     * [set] user_nm: {varchar(60)} <br>
     * @param userNm The value of the column 'user_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserNm(String userNm) {
        registerModifiedProperty("userNm");
        _userNm = userNm;
    }
}
