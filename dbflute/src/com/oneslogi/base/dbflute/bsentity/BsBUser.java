package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of B_USER as TABLE. <br>
 * ユーザマスタ
 * <pre>
 * [primary-key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, USER_CD, USER_NM, CULTURE_ID, ROLE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ROLE_GRP, B_CULTURE, B_CLASS_DTL(ByDelFlg), B_USER_AUTH(AsOne), M_USER_LOGIN(AsOne)
 *
 * [referrer table]
 *     M_USER_CENTER, M_USER_CLIENT, M_USER_DEPOSIT, T_EC_ORDER_R, T_INVENTORY_R, T_MOVE_INST_R, T_PACKING_R, T_PICKING_R, T_RECEIVE_PLAN_R, T_STORE_NO_R, T_STORE_RECORD_R, W_SGL_ROW_SHIP_INSP_B, T_PACKING_H, B_USER_AUTH, M_USER_LOGIN
 *
 * [foreign property]
 *     bRoleGrp, bCulture, bClassDtlByDelFlg, bUserAuthAsOne, mUserLoginAsOne
 *
 * [referrer property]
 *     mUserCenterList, mUserClientList, mUserDepositList, tEcOrderRList, tInventoryRList, tMoveInstRList, tPackingRByTagOutUserIdList, tPackingRByInspectionOutUserIdList, tPackingRByStwOutUserIdList, tPickingRByPl1OutUserIdList, tPickingRByCaseOutUserIdList, tPickingRByShippingRecordOutUserIdList, tPickingRByPl2OutUserIdList, tPickingRBySlipOutUserIdList, tPickingRByPackingOutUserIdList, tReceivePlanRList, tStoreNoRList, tStoreRecordRList, wSglRowShipInspBList, tPackingHByUpdUserList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long userId = entity.getUserId();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * Long cultureId = entity.getCultureId();
 * Long roleGrpId = entity.getRoleGrpId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setUserId(userId);
 * entity.setUserCd(userCd);
 * entity.setUserNm(userNm);
 * entity.setCultureId(cultureId);
 * entity.setRoleGrpId(roleGrpId);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBUser extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _userId;

    /** USER_CD: {UQ, NotNull, varchar(30)} */
    protected String _userCd;

    /** USER_NM: {NotNull, varchar(60)} */
    protected String _userNm;

    /** CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} */
    protected Long _cultureId;

    /** ROLE_GRP_ID: {IX, bigint(19), FK to B_ROLE_GRP} */
    protected Long _roleGrpId;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "B_USER";
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
        if (_userId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param userCd : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String userCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("userCd");
        setUserCd(userCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** B_ROLE_GRP by my ROLE_GRP_ID, named 'BRoleGrp'. */
    protected BRoleGrp _bRoleGrp;

    /**
     * [get] B_ROLE_GRP by my ROLE_GRP_ID, named 'BRoleGrp'. <br>
     * @return The entity of foreign property 'BRoleGrp'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BRoleGrp getBRoleGrp() {
        return _bRoleGrp;
    }

    /**
     * [set] B_ROLE_GRP by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @param bRoleGrp The entity of foreign property 'BRoleGrp'. (NullAllowed)
     */
    public void setBRoleGrp(BRoleGrp bRoleGrp) {
        _bRoleGrp = bRoleGrp;
    }

    /** B_CULTURE by my CULTURE_ID, named 'BCulture'. */
    protected BCulture _bCulture;

    /**
     * [get] B_CULTURE by my CULTURE_ID, named 'BCulture'. <br>
     * @return The entity of foreign property 'BCulture'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BCulture getBCulture() {
        return _bCulture;
    }

    /**
     * [set] B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param bCulture The entity of foreign property 'BCulture'. (NullAllowed)
     */
    public void setBCulture(BCulture bCulture) {
        _bCulture = bCulture;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    /** B_USER_AUTH by USER_ID, named 'BUserAuthAsOne'. */
    protected BUserAuth _bUserAuthAsOne;

    /**
     * [get] B_USER_AUTH by USER_ID, named 'BUserAuthAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'BUserAuthAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public BUserAuth getBUserAuthAsOne() {
        return _bUserAuthAsOne;
    }

    /**
     * [set] B_USER_AUTH by USER_ID, named 'BUserAuthAsOne'.
     * @param BUserAuthAsOne The entity of foreign property(referrer-as-one) 'BUserAuthAsOne'. (NullAllowed)
     */
    public void setBUserAuthAsOne(BUserAuth BUserAuthAsOne) {
        _bUserAuthAsOne = BUserAuthAsOne;
    }

    /** M_USER_LOGIN by USER_ID, named 'MUserLoginAsOne'. */
    protected MUserLogin _mUserLoginAsOne;

    /**
     * [get] M_USER_LOGIN by USER_ID, named 'MUserLoginAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MUserLoginAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MUserLogin getMUserLoginAsOne() {
        return _mUserLoginAsOne;
    }

    /**
     * [set] M_USER_LOGIN by USER_ID, named 'MUserLoginAsOne'.
     * @param MUserLoginAsOne The entity of foreign property(referrer-as-one) 'MUserLoginAsOne'. (NullAllowed)
     */
    public void setMUserLoginAsOne(MUserLogin MUserLoginAsOne) {
        _mUserLoginAsOne = MUserLoginAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_USER_CENTER by USER_ID, named 'MUserCenterList'. */
    protected List<MUserCenter> _mUserCenterList;

    /**
     * [get] M_USER_CENTER by USER_ID, named 'MUserCenterList'.
     * @return The entity list of referrer property 'MUserCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserCenter> getMUserCenterList() {
        if (_mUserCenterList == null) { _mUserCenterList = newReferrerList(); }
        return _mUserCenterList;
    }

    /**
     * [set] M_USER_CENTER by USER_ID, named 'MUserCenterList'.
     * @param mUserCenterList The entity list of referrer property 'MUserCenterList'. (NullAllowed)
     */
    public void setMUserCenterList(List<MUserCenter> mUserCenterList) {
        _mUserCenterList = mUserCenterList;
    }

    /** M_USER_CLIENT by USER_ID, named 'MUserClientList'. */
    protected List<MUserClient> _mUserClientList;

    /**
     * [get] M_USER_CLIENT by USER_ID, named 'MUserClientList'.
     * @return The entity list of referrer property 'MUserClientList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserClient> getMUserClientList() {
        if (_mUserClientList == null) { _mUserClientList = newReferrerList(); }
        return _mUserClientList;
    }

    /**
     * [set] M_USER_CLIENT by USER_ID, named 'MUserClientList'.
     * @param mUserClientList The entity list of referrer property 'MUserClientList'. (NullAllowed)
     */
    public void setMUserClientList(List<MUserClient> mUserClientList) {
        _mUserClientList = mUserClientList;
    }

    /** M_USER_DEPOSIT by USER_ID, named 'MUserDepositList'. */
    protected List<MUserDeposit> _mUserDepositList;

    /**
     * [get] M_USER_DEPOSIT by USER_ID, named 'MUserDepositList'.
     * @return The entity list of referrer property 'MUserDepositList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserDeposit> getMUserDepositList() {
        if (_mUserDepositList == null) { _mUserDepositList = newReferrerList(); }
        return _mUserDepositList;
    }

    /**
     * [set] M_USER_DEPOSIT by USER_ID, named 'MUserDepositList'.
     * @param mUserDepositList The entity list of referrer property 'MUserDepositList'. (NullAllowed)
     */
    public void setMUserDepositList(List<MUserDeposit> mUserDepositList) {
        _mUserDepositList = mUserDepositList;
    }

    /** T_EC_ORDER_R by STATEMENT_OUT_USER_ID, named 'TEcOrderRList'. */
    protected List<TEcOrderR> _tEcOrderRList;

    /**
     * [get] T_EC_ORDER_R by STATEMENT_OUT_USER_ID, named 'TEcOrderRList'.
     * @return The entity list of referrer property 'TEcOrderRList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderR> getTEcOrderRList() {
        if (_tEcOrderRList == null) { _tEcOrderRList = newReferrerList(); }
        return _tEcOrderRList;
    }

    /**
     * [set] T_EC_ORDER_R by STATEMENT_OUT_USER_ID, named 'TEcOrderRList'.
     * @param tEcOrderRList The entity list of referrer property 'TEcOrderRList'. (NullAllowed)
     */
    public void setTEcOrderRList(List<TEcOrderR> tEcOrderRList) {
        _tEcOrderRList = tEcOrderRList;
    }

    /** T_INVENTORY_R by TWL_OUT_USER_ID, named 'TInventoryRList'. */
    protected List<TInventoryR> _tInventoryRList;

    /**
     * [get] T_INVENTORY_R by TWL_OUT_USER_ID, named 'TInventoryRList'.
     * @return The entity list of referrer property 'TInventoryRList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryR> getTInventoryRList() {
        if (_tInventoryRList == null) { _tInventoryRList = newReferrerList(); }
        return _tInventoryRList;
    }

    /**
     * [set] T_INVENTORY_R by TWL_OUT_USER_ID, named 'TInventoryRList'.
     * @param tInventoryRList The entity list of referrer property 'TInventoryRList'. (NullAllowed)
     */
    public void setTInventoryRList(List<TInventoryR> tInventoryRList) {
        _tInventoryRList = tInventoryRList;
    }

    /** T_MOVE_INST_R by INST_OUT_USER_ID, named 'TMoveInstRList'. */
    protected List<TMoveInstR> _tMoveInstRList;

    /**
     * [get] T_MOVE_INST_R by INST_OUT_USER_ID, named 'TMoveInstRList'.
     * @return The entity list of referrer property 'TMoveInstRList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstR> getTMoveInstRList() {
        if (_tMoveInstRList == null) { _tMoveInstRList = newReferrerList(); }
        return _tMoveInstRList;
    }

    /**
     * [set] T_MOVE_INST_R by INST_OUT_USER_ID, named 'TMoveInstRList'.
     * @param tMoveInstRList The entity list of referrer property 'TMoveInstRList'. (NullAllowed)
     */
    public void setTMoveInstRList(List<TMoveInstR> tMoveInstRList) {
        _tMoveInstRList = tMoveInstRList;
    }

    /** T_PACKING_R by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdList'. */
    protected List<TPackingR> _tPackingRByTagOutUserIdList;

    /**
     * [get] T_PACKING_R by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdList'.
     * @return The entity list of referrer property 'TPackingRByTagOutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingR> getTPackingRByTagOutUserIdList() {
        if (_tPackingRByTagOutUserIdList == null) { _tPackingRByTagOutUserIdList = newReferrerList(); }
        return _tPackingRByTagOutUserIdList;
    }

    /**
     * [set] T_PACKING_R by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdList'.
     * @param tPackingRByTagOutUserIdList The entity list of referrer property 'TPackingRByTagOutUserIdList'. (NullAllowed)
     */
    public void setTPackingRByTagOutUserIdList(List<TPackingR> tPackingRByTagOutUserIdList) {
        _tPackingRByTagOutUserIdList = tPackingRByTagOutUserIdList;
    }

    /** T_PACKING_R by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdList'. */
    protected List<TPackingR> _tPackingRByInspectionOutUserIdList;

    /**
     * [get] T_PACKING_R by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdList'.
     * @return The entity list of referrer property 'TPackingRByInspectionOutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingR> getTPackingRByInspectionOutUserIdList() {
        if (_tPackingRByInspectionOutUserIdList == null) { _tPackingRByInspectionOutUserIdList = newReferrerList(); }
        return _tPackingRByInspectionOutUserIdList;
    }

    /**
     * [set] T_PACKING_R by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdList'.
     * @param tPackingRByInspectionOutUserIdList The entity list of referrer property 'TPackingRByInspectionOutUserIdList'. (NullAllowed)
     */
    public void setTPackingRByInspectionOutUserIdList(List<TPackingR> tPackingRByInspectionOutUserIdList) {
        _tPackingRByInspectionOutUserIdList = tPackingRByInspectionOutUserIdList;
    }

    /** T_PACKING_R by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdList'. */
    protected List<TPackingR> _tPackingRByStwOutUserIdList;

    /**
     * [get] T_PACKING_R by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdList'.
     * @return The entity list of referrer property 'TPackingRByStwOutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingR> getTPackingRByStwOutUserIdList() {
        if (_tPackingRByStwOutUserIdList == null) { _tPackingRByStwOutUserIdList = newReferrerList(); }
        return _tPackingRByStwOutUserIdList;
    }

    /**
     * [set] T_PACKING_R by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdList'.
     * @param tPackingRByStwOutUserIdList The entity list of referrer property 'TPackingRByStwOutUserIdList'. (NullAllowed)
     */
    public void setTPackingRByStwOutUserIdList(List<TPackingR> tPackingRByStwOutUserIdList) {
        _tPackingRByStwOutUserIdList = tPackingRByStwOutUserIdList;
    }

    /** T_PICKING_R by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdList'. */
    protected List<TPickingR> _tPickingRByPl1OutUserIdList;

    /**
     * [get] T_PICKING_R by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdList'.
     * @return The entity list of referrer property 'TPickingRByPl1OutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingR> getTPickingRByPl1OutUserIdList() {
        if (_tPickingRByPl1OutUserIdList == null) { _tPickingRByPl1OutUserIdList = newReferrerList(); }
        return _tPickingRByPl1OutUserIdList;
    }

    /**
     * [set] T_PICKING_R by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdList'.
     * @param tPickingRByPl1OutUserIdList The entity list of referrer property 'TPickingRByPl1OutUserIdList'. (NullAllowed)
     */
    public void setTPickingRByPl1OutUserIdList(List<TPickingR> tPickingRByPl1OutUserIdList) {
        _tPickingRByPl1OutUserIdList = tPickingRByPl1OutUserIdList;
    }

    /** T_PICKING_R by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdList'. */
    protected List<TPickingR> _tPickingRByCaseOutUserIdList;

    /**
     * [get] T_PICKING_R by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdList'.
     * @return The entity list of referrer property 'TPickingRByCaseOutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingR> getTPickingRByCaseOutUserIdList() {
        if (_tPickingRByCaseOutUserIdList == null) { _tPickingRByCaseOutUserIdList = newReferrerList(); }
        return _tPickingRByCaseOutUserIdList;
    }

    /**
     * [set] T_PICKING_R by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdList'.
     * @param tPickingRByCaseOutUserIdList The entity list of referrer property 'TPickingRByCaseOutUserIdList'. (NullAllowed)
     */
    public void setTPickingRByCaseOutUserIdList(List<TPickingR> tPickingRByCaseOutUserIdList) {
        _tPickingRByCaseOutUserIdList = tPickingRByCaseOutUserIdList;
    }

    /** T_PICKING_R by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdList'. */
    protected List<TPickingR> _tPickingRByShippingRecordOutUserIdList;

    /**
     * [get] T_PICKING_R by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdList'.
     * @return The entity list of referrer property 'TPickingRByShippingRecordOutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingR> getTPickingRByShippingRecordOutUserIdList() {
        if (_tPickingRByShippingRecordOutUserIdList == null) { _tPickingRByShippingRecordOutUserIdList = newReferrerList(); }
        return _tPickingRByShippingRecordOutUserIdList;
    }

    /**
     * [set] T_PICKING_R by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdList'.
     * @param tPickingRByShippingRecordOutUserIdList The entity list of referrer property 'TPickingRByShippingRecordOutUserIdList'. (NullAllowed)
     */
    public void setTPickingRByShippingRecordOutUserIdList(List<TPickingR> tPickingRByShippingRecordOutUserIdList) {
        _tPickingRByShippingRecordOutUserIdList = tPickingRByShippingRecordOutUserIdList;
    }

    /** T_PICKING_R by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdList'. */
    protected List<TPickingR> _tPickingRByPl2OutUserIdList;

    /**
     * [get] T_PICKING_R by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdList'.
     * @return The entity list of referrer property 'TPickingRByPl2OutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingR> getTPickingRByPl2OutUserIdList() {
        if (_tPickingRByPl2OutUserIdList == null) { _tPickingRByPl2OutUserIdList = newReferrerList(); }
        return _tPickingRByPl2OutUserIdList;
    }

    /**
     * [set] T_PICKING_R by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdList'.
     * @param tPickingRByPl2OutUserIdList The entity list of referrer property 'TPickingRByPl2OutUserIdList'. (NullAllowed)
     */
    public void setTPickingRByPl2OutUserIdList(List<TPickingR> tPickingRByPl2OutUserIdList) {
        _tPickingRByPl2OutUserIdList = tPickingRByPl2OutUserIdList;
    }

    /** T_PICKING_R by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdList'. */
    protected List<TPickingR> _tPickingRBySlipOutUserIdList;

    /**
     * [get] T_PICKING_R by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdList'.
     * @return The entity list of referrer property 'TPickingRBySlipOutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingR> getTPickingRBySlipOutUserIdList() {
        if (_tPickingRBySlipOutUserIdList == null) { _tPickingRBySlipOutUserIdList = newReferrerList(); }
        return _tPickingRBySlipOutUserIdList;
    }

    /**
     * [set] T_PICKING_R by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdList'.
     * @param tPickingRBySlipOutUserIdList The entity list of referrer property 'TPickingRBySlipOutUserIdList'. (NullAllowed)
     */
    public void setTPickingRBySlipOutUserIdList(List<TPickingR> tPickingRBySlipOutUserIdList) {
        _tPickingRBySlipOutUserIdList = tPickingRBySlipOutUserIdList;
    }

    /** T_PICKING_R by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdList'. */
    protected List<TPickingR> _tPickingRByPackingOutUserIdList;

    /**
     * [get] T_PICKING_R by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdList'.
     * @return The entity list of referrer property 'TPickingRByPackingOutUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingR> getTPickingRByPackingOutUserIdList() {
        if (_tPickingRByPackingOutUserIdList == null) { _tPickingRByPackingOutUserIdList = newReferrerList(); }
        return _tPickingRByPackingOutUserIdList;
    }

    /**
     * [set] T_PICKING_R by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdList'.
     * @param tPickingRByPackingOutUserIdList The entity list of referrer property 'TPickingRByPackingOutUserIdList'. (NullAllowed)
     */
    public void setTPickingRByPackingOutUserIdList(List<TPickingR> tPickingRByPackingOutUserIdList) {
        _tPickingRByPackingOutUserIdList = tPickingRByPackingOutUserIdList;
    }

    /** T_RECEIVE_PLAN_R by RPL_OUT_USER_ID, named 'TReceivePlanRList'. */
    protected List<TReceivePlanR> _tReceivePlanRList;

    /**
     * [get] T_RECEIVE_PLAN_R by RPL_OUT_USER_ID, named 'TReceivePlanRList'.
     * @return The entity list of referrer property 'TReceivePlanRList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanR> getTReceivePlanRList() {
        if (_tReceivePlanRList == null) { _tReceivePlanRList = newReferrerList(); }
        return _tReceivePlanRList;
    }

    /**
     * [set] T_RECEIVE_PLAN_R by RPL_OUT_USER_ID, named 'TReceivePlanRList'.
     * @param tReceivePlanRList The entity list of referrer property 'TReceivePlanRList'. (NullAllowed)
     */
    public void setTReceivePlanRList(List<TReceivePlanR> tReceivePlanRList) {
        _tReceivePlanRList = tReceivePlanRList;
    }

    /** T_STORE_NO_R by TWL_OUT_USER_ID, named 'TStoreNoRList'. */
    protected List<TStoreNoR> _tStoreNoRList;

    /**
     * [get] T_STORE_NO_R by TWL_OUT_USER_ID, named 'TStoreNoRList'.
     * @return The entity list of referrer property 'TStoreNoRList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreNoR> getTStoreNoRList() {
        if (_tStoreNoRList == null) { _tStoreNoRList = newReferrerList(); }
        return _tStoreNoRList;
    }

    /**
     * [set] T_STORE_NO_R by TWL_OUT_USER_ID, named 'TStoreNoRList'.
     * @param tStoreNoRList The entity list of referrer property 'TStoreNoRList'. (NullAllowed)
     */
    public void setTStoreNoRList(List<TStoreNoR> tStoreNoRList) {
        _tStoreNoRList = tStoreNoRList;
    }

    /** T_STORE_RECORD_R by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRList'. */
    protected List<TStoreRecordR> _tStoreRecordRList;

    /**
     * [get] T_STORE_RECORD_R by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRList'.
     * @return The entity list of referrer property 'TStoreRecordRList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordR> getTStoreRecordRList() {
        if (_tStoreRecordRList == null) { _tStoreRecordRList = newReferrerList(); }
        return _tStoreRecordRList;
    }

    /**
     * [set] T_STORE_RECORD_R by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRList'.
     * @param tStoreRecordRList The entity list of referrer property 'TStoreRecordRList'. (NullAllowed)
     */
    public void setTStoreRecordRList(List<TStoreRecordR> tStoreRecordRList) {
        _tStoreRecordRList = tStoreRecordRList;
    }

    /** W_SGL_ROW_SHIP_INSP_B by USER_ID, named 'WSglRowShipInspBList'. */
    protected List<WSglRowShipInspB> _wSglRowShipInspBList;

    /**
     * [get] W_SGL_ROW_SHIP_INSP_B by USER_ID, named 'WSglRowShipInspBList'.
     * @return The entity list of referrer property 'WSglRowShipInspBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspB> getWSglRowShipInspBList() {
        if (_wSglRowShipInspBList == null) { _wSglRowShipInspBList = newReferrerList(); }
        return _wSglRowShipInspBList;
    }

    /**
     * [set] W_SGL_ROW_SHIP_INSP_B by USER_ID, named 'WSglRowShipInspBList'.
     * @param wSglRowShipInspBList The entity list of referrer property 'WSglRowShipInspBList'. (NullAllowed)
     */
    public void setWSglRowShipInspBList(List<WSglRowShipInspB> wSglRowShipInspBList) {
        _wSglRowShipInspBList = wSglRowShipInspBList;
    }

    /** T_PACKING_H by UPD_USER, named 'TPackingHByUpdUserList'. */
    protected List<TPackingH> _tPackingHByUpdUserList;

    /**
     * [get] T_PACKING_H by UPD_USER, named 'TPackingHByUpdUserList'.
     * @return The entity list of referrer property 'TPackingHByUpdUserList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHByUpdUserList() {
        if (_tPackingHByUpdUserList == null) { _tPackingHByUpdUserList = newReferrerList(); }
        return _tPackingHByUpdUserList;
    }

    /**
     * [set] T_PACKING_H by UPD_USER, named 'TPackingHByUpdUserList'.
     * @param tPackingHByUpdUserList The entity list of referrer property 'TPackingHByUpdUserList'. (NullAllowed)
     */
    public void setTPackingHByUpdUserList(List<TPackingH> tPackingHByUpdUserList) {
        _tPackingHByUpdUserList = tPackingHByUpdUserList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBUser) {
            BsBUser other = (BsBUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bRoleGrp != null)
        { sb.append(li).append(xbRDS(_bRoleGrp, "bRoleGrp")); }
        if (_bCulture != null)
        { sb.append(li).append(xbRDS(_bCulture, "bCulture")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bUserAuthAsOne != null)
        { sb.append(li).append(xbRDS(_bUserAuthAsOne, "bUserAuthAsOne")); }
        if (_mUserLoginAsOne != null)
        { sb.append(li).append(xbRDS(_mUserLoginAsOne, "mUserLoginAsOne")); }
        if (_mUserCenterList != null) { for (MUserCenter et : _mUserCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserCenterList")); } } }
        if (_mUserClientList != null) { for (MUserClient et : _mUserClientList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserClientList")); } } }
        if (_mUserDepositList != null) { for (MUserDeposit et : _mUserDepositList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserDepositList")); } } }
        if (_tEcOrderRList != null) { for (TEcOrderR et : _tEcOrderRList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tEcOrderRList")); } } }
        if (_tInventoryRList != null) { for (TInventoryR et : _tInventoryRList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryRList")); } } }
        if (_tMoveInstRList != null) { for (TMoveInstR et : _tMoveInstRList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstRList")); } } }
        if (_tPackingRByTagOutUserIdList != null) { for (TPackingR et : _tPackingRByTagOutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingRByTagOutUserIdList")); } } }
        if (_tPackingRByInspectionOutUserIdList != null) { for (TPackingR et : _tPackingRByInspectionOutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingRByInspectionOutUserIdList")); } } }
        if (_tPackingRByStwOutUserIdList != null) { for (TPackingR et : _tPackingRByStwOutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingRByStwOutUserIdList")); } } }
        if (_tPickingRByPl1OutUserIdList != null) { for (TPickingR et : _tPickingRByPl1OutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingRByPl1OutUserIdList")); } } }
        if (_tPickingRByCaseOutUserIdList != null) { for (TPickingR et : _tPickingRByCaseOutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingRByCaseOutUserIdList")); } } }
        if (_tPickingRByShippingRecordOutUserIdList != null) { for (TPickingR et : _tPickingRByShippingRecordOutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingRByShippingRecordOutUserIdList")); } } }
        if (_tPickingRByPl2OutUserIdList != null) { for (TPickingR et : _tPickingRByPl2OutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingRByPl2OutUserIdList")); } } }
        if (_tPickingRBySlipOutUserIdList != null) { for (TPickingR et : _tPickingRBySlipOutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingRBySlipOutUserIdList")); } } }
        if (_tPickingRByPackingOutUserIdList != null) { for (TPickingR et : _tPickingRByPackingOutUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingRByPackingOutUserIdList")); } } }
        if (_tReceivePlanRList != null) { for (TReceivePlanR et : _tReceivePlanRList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanRList")); } } }
        if (_tStoreNoRList != null) { for (TStoreNoR et : _tStoreNoRList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreNoRList")); } } }
        if (_tStoreRecordRList != null) { for (TStoreRecordR et : _tStoreRecordRList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordRList")); } } }
        if (_wSglRowShipInspBList != null) { for (WSglRowShipInspB et : _wSglRowShipInspBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wSglRowShipInspBList")); } } }
        if (_tPackingHByUpdUserList != null) { for (TPackingH et : _tPackingHByUpdUserList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingHByUpdUserList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_cultureId));
        sb.append(dm).append(xfND(_roleGrpId));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_bRoleGrp != null)
        { sb.append(dm).append("bRoleGrp"); }
        if (_bCulture != null)
        { sb.append(dm).append("bCulture"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bUserAuthAsOne != null)
        { sb.append(dm).append("bUserAuthAsOne"); }
        if (_mUserLoginAsOne != null)
        { sb.append(dm).append("mUserLoginAsOne"); }
        if (_mUserCenterList != null && !_mUserCenterList.isEmpty())
        { sb.append(dm).append("mUserCenterList"); }
        if (_mUserClientList != null && !_mUserClientList.isEmpty())
        { sb.append(dm).append("mUserClientList"); }
        if (_mUserDepositList != null && !_mUserDepositList.isEmpty())
        { sb.append(dm).append("mUserDepositList"); }
        if (_tEcOrderRList != null && !_tEcOrderRList.isEmpty())
        { sb.append(dm).append("tEcOrderRList"); }
        if (_tInventoryRList != null && !_tInventoryRList.isEmpty())
        { sb.append(dm).append("tInventoryRList"); }
        if (_tMoveInstRList != null && !_tMoveInstRList.isEmpty())
        { sb.append(dm).append("tMoveInstRList"); }
        if (_tPackingRByTagOutUserIdList != null && !_tPackingRByTagOutUserIdList.isEmpty())
        { sb.append(dm).append("tPackingRByTagOutUserIdList"); }
        if (_tPackingRByInspectionOutUserIdList != null && !_tPackingRByInspectionOutUserIdList.isEmpty())
        { sb.append(dm).append("tPackingRByInspectionOutUserIdList"); }
        if (_tPackingRByStwOutUserIdList != null && !_tPackingRByStwOutUserIdList.isEmpty())
        { sb.append(dm).append("tPackingRByStwOutUserIdList"); }
        if (_tPickingRByPl1OutUserIdList != null && !_tPickingRByPl1OutUserIdList.isEmpty())
        { sb.append(dm).append("tPickingRByPl1OutUserIdList"); }
        if (_tPickingRByCaseOutUserIdList != null && !_tPickingRByCaseOutUserIdList.isEmpty())
        { sb.append(dm).append("tPickingRByCaseOutUserIdList"); }
        if (_tPickingRByShippingRecordOutUserIdList != null && !_tPickingRByShippingRecordOutUserIdList.isEmpty())
        { sb.append(dm).append("tPickingRByShippingRecordOutUserIdList"); }
        if (_tPickingRByPl2OutUserIdList != null && !_tPickingRByPl2OutUserIdList.isEmpty())
        { sb.append(dm).append("tPickingRByPl2OutUserIdList"); }
        if (_tPickingRBySlipOutUserIdList != null && !_tPickingRBySlipOutUserIdList.isEmpty())
        { sb.append(dm).append("tPickingRBySlipOutUserIdList"); }
        if (_tPickingRByPackingOutUserIdList != null && !_tPickingRByPackingOutUserIdList.isEmpty())
        { sb.append(dm).append("tPickingRByPackingOutUserIdList"); }
        if (_tReceivePlanRList != null && !_tReceivePlanRList.isEmpty())
        { sb.append(dm).append("tReceivePlanRList"); }
        if (_tStoreNoRList != null && !_tStoreNoRList.isEmpty())
        { sb.append(dm).append("tStoreNoRList"); }
        if (_tStoreRecordRList != null && !_tStoreRecordRList.isEmpty())
        { sb.append(dm).append("tStoreRecordRList"); }
        if (_wSglRowShipInspBList != null && !_wSglRowShipInspBList.isEmpty())
        { sb.append(dm).append("wSglRowShipInspBList"); }
        if (_tPackingHByUpdUserList != null && !_tPackingHByUpdUserList.isEmpty())
        { sb.append(dm).append("tPackingHByUpdUserList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BUser clone() {
        return (BUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ユーザID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ユーザID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] USER_CD: {UQ, NotNull, varchar(30)} <br>
     * ユーザCD
     * @return The value of the column 'USER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getUserCd() {
        checkSpecifiedProperty("userCd");
        return convertEmptyToNull(_userCd);
    }

    /**
     * [set] USER_CD: {UQ, NotNull, varchar(30)} <br>
     * ユーザCD
     * @param userCd The value of the column 'USER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setUserCd(String userCd) {
        registerModifiedProperty("userCd");
        _userCd = userCd;
    }

    /**
     * [get] USER_NM: {NotNull, varchar(60)} <br>
     * ユーザ名
     * @return The value of the column 'USER_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getUserNm() {
        checkSpecifiedProperty("userNm");
        return convertEmptyToNull(_userNm);
    }

    /**
     * [set] USER_NM: {NotNull, varchar(60)} <br>
     * ユーザ名
     * @param userNm The value of the column 'USER_NM'. (basically NotNull if update: for the constraint)
     */
    public void setUserNm(String userNm) {
        registerModifiedProperty("userNm");
        _userNm = userNm;
    }

    /**
     * [get] CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCultureId() {
        checkSpecifiedProperty("cultureId");
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCultureId(Long cultureId) {
        registerModifiedProperty("cultureId");
        _cultureId = cultureId;
    }

    /**
     * [get] ROLE_GRP_ID: {IX, bigint(19), FK to B_ROLE_GRP} <br>
     * 権限グループID
     * @return The value of the column 'ROLE_GRP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRoleGrpId() {
        checkSpecifiedProperty("roleGrpId");
        return _roleGrpId;
    }

    /**
     * [set] ROLE_GRP_ID: {IX, bigint(19), FK to B_ROLE_GRP} <br>
     * 権限グループID
     * @param roleGrpId The value of the column 'ROLE_GRP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRoleGrpId(Long roleGrpId) {
        registerModifiedProperty("roleGrpId");
        _roleGrpId = roleGrpId;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
