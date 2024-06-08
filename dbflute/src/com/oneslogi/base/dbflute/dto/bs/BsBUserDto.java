package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_USER as TABLE. <br>
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
 * [foreign-table]
 *     B_ROLE_GRP, B_CULTURE, B_CLASS_DTL(ByDelFlg), B_USER_AUTH(AsOne), M_USER_LOGIN(AsOne)
 *
 * [referrer-table]
 *     M_USER_CENTER, M_USER_CLIENT, M_USER_DEPOSIT, T_EC_ORDER_R, T_INVENTORY_R, T_MOVE_INST_R, T_PACKING_R, T_PICKING_R, T_RECEIVE_PLAN_R, T_STORE_NO_R, T_STORE_RECORD_R, W_SGL_ROW_SHIP_INSP_B, T_PACKING_H, B_USER_AUTH, M_USER_LOGIN
 *
 * [foreign-property]
 *     bRoleGrp, bCulture, bClassDtlByDelFlg, bUserAuthAsOne, mUserLoginAsOne
 *
 * [referrer-property]
 *     mUserCenterList, mUserClientList, mUserDepositList, tEcOrderRList, tInventoryRList, tMoveInstRList, tPackingRByTagOutUserIdList, tPackingRByInspectionOutUserIdList, tPackingRByStwOutUserIdList, tPickingRByPl1OutUserIdList, tPickingRByCaseOutUserIdList, tPickingRByShippingRecordOutUserIdList, tPickingRByPl2OutUserIdList, tPickingRBySlipOutUserIdList, tPickingRByPackingOutUserIdList, tReceivePlanRList, tStoreNoRList, tStoreRecordRList, wSglRowShipInspBList, tPackingHByUpdUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBUserDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** USER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _userId;

    /** USER_CD: {UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _userCd;

    /** USER_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} */
    @JsonKey
    protected Long _cultureId;

    /** ROLE_GRP_ID: {IX, bigint(19), FK to B_ROLE_GRP} */
    @JsonKey
    protected Long _roleGrpId;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBUserDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected BRoleGrpDto _bRoleGrp;

    public BRoleGrpDto getBRoleGrp() {
        return _bRoleGrp;
    }

    public void setBRoleGrp(BRoleGrpDto bRoleGrp) {
        this._bRoleGrp = bRoleGrp;
    }

    protected BCultureDto _bCulture;

    public BCultureDto getBCulture() {
        return _bCulture;
    }

    public void setBCulture(BCultureDto bCulture) {
        this._bCulture = bCulture;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected BUserAuthDto _bUserAuthAsOne;

    public BUserAuthDto getBUserAuthAsOne() {
        return _bUserAuthAsOne;
    }

    public void setBUserAuthAsOne(BUserAuthDto BUserAuthAsOne) {
        this._bUserAuthAsOne = BUserAuthAsOne;
    }

    protected MUserLoginDto _mUserLoginAsOne;

    public MUserLoginDto getMUserLoginAsOne() {
        return _mUserLoginAsOne;
    }

    public void setMUserLoginAsOne(MUserLoginDto MUserLoginAsOne) {
        this._mUserLoginAsOne = MUserLoginAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MUserCenterDto> _mUserCenterList;

    public List<MUserCenterDto> getMUserCenterList() {
        if (_mUserCenterList == null) { _mUserCenterList = new ArrayList<MUserCenterDto>(); }
        return _mUserCenterList;
    }

    public void setMUserCenterList(List<MUserCenterDto> mUserCenterList) {
        this._mUserCenterList = mUserCenterList;
    }

    protected List<MUserClientDto> _mUserClientList;

    public List<MUserClientDto> getMUserClientList() {
        if (_mUserClientList == null) { _mUserClientList = new ArrayList<MUserClientDto>(); }
        return _mUserClientList;
    }

    public void setMUserClientList(List<MUserClientDto> mUserClientList) {
        this._mUserClientList = mUserClientList;
    }

    protected List<MUserDepositDto> _mUserDepositList;

    public List<MUserDepositDto> getMUserDepositList() {
        if (_mUserDepositList == null) { _mUserDepositList = new ArrayList<MUserDepositDto>(); }
        return _mUserDepositList;
    }

    public void setMUserDepositList(List<MUserDepositDto> mUserDepositList) {
        this._mUserDepositList = mUserDepositList;
    }

    protected List<TEcOrderRDto> _tEcOrderRList;

    public List<TEcOrderRDto> getTEcOrderRList() {
        if (_tEcOrderRList == null) { _tEcOrderRList = new ArrayList<TEcOrderRDto>(); }
        return _tEcOrderRList;
    }

    public void setTEcOrderRList(List<TEcOrderRDto> tEcOrderRList) {
        this._tEcOrderRList = tEcOrderRList;
    }

    protected List<TInventoryRDto> _tInventoryRList;

    public List<TInventoryRDto> getTInventoryRList() {
        if (_tInventoryRList == null) { _tInventoryRList = new ArrayList<TInventoryRDto>(); }
        return _tInventoryRList;
    }

    public void setTInventoryRList(List<TInventoryRDto> tInventoryRList) {
        this._tInventoryRList = tInventoryRList;
    }

    protected List<TMoveInstRDto> _tMoveInstRList;

    public List<TMoveInstRDto> getTMoveInstRList() {
        if (_tMoveInstRList == null) { _tMoveInstRList = new ArrayList<TMoveInstRDto>(); }
        return _tMoveInstRList;
    }

    public void setTMoveInstRList(List<TMoveInstRDto> tMoveInstRList) {
        this._tMoveInstRList = tMoveInstRList;
    }

    protected List<TPackingRDto> _tPackingRByTagOutUserIdList;

    public List<TPackingRDto> getTPackingRByTagOutUserIdList() {
        if (_tPackingRByTagOutUserIdList == null) { _tPackingRByTagOutUserIdList = new ArrayList<TPackingRDto>(); }
        return _tPackingRByTagOutUserIdList;
    }

    public void setTPackingRByTagOutUserIdList(List<TPackingRDto> tPackingRByTagOutUserIdList) {
        this._tPackingRByTagOutUserIdList = tPackingRByTagOutUserIdList;
    }

    protected List<TPackingRDto> _tPackingRByInspectionOutUserIdList;

    public List<TPackingRDto> getTPackingRByInspectionOutUserIdList() {
        if (_tPackingRByInspectionOutUserIdList == null) { _tPackingRByInspectionOutUserIdList = new ArrayList<TPackingRDto>(); }
        return _tPackingRByInspectionOutUserIdList;
    }

    public void setTPackingRByInspectionOutUserIdList(List<TPackingRDto> tPackingRByInspectionOutUserIdList) {
        this._tPackingRByInspectionOutUserIdList = tPackingRByInspectionOutUserIdList;
    }

    protected List<TPackingRDto> _tPackingRByStwOutUserIdList;

    public List<TPackingRDto> getTPackingRByStwOutUserIdList() {
        if (_tPackingRByStwOutUserIdList == null) { _tPackingRByStwOutUserIdList = new ArrayList<TPackingRDto>(); }
        return _tPackingRByStwOutUserIdList;
    }

    public void setTPackingRByStwOutUserIdList(List<TPackingRDto> tPackingRByStwOutUserIdList) {
        this._tPackingRByStwOutUserIdList = tPackingRByStwOutUserIdList;
    }

    protected List<TPickingRDto> _tPickingRByPl1OutUserIdList;

    public List<TPickingRDto> getTPickingRByPl1OutUserIdList() {
        if (_tPickingRByPl1OutUserIdList == null) { _tPickingRByPl1OutUserIdList = new ArrayList<TPickingRDto>(); }
        return _tPickingRByPl1OutUserIdList;
    }

    public void setTPickingRByPl1OutUserIdList(List<TPickingRDto> tPickingRByPl1OutUserIdList) {
        this._tPickingRByPl1OutUserIdList = tPickingRByPl1OutUserIdList;
    }

    protected List<TPickingRDto> _tPickingRByCaseOutUserIdList;

    public List<TPickingRDto> getTPickingRByCaseOutUserIdList() {
        if (_tPickingRByCaseOutUserIdList == null) { _tPickingRByCaseOutUserIdList = new ArrayList<TPickingRDto>(); }
        return _tPickingRByCaseOutUserIdList;
    }

    public void setTPickingRByCaseOutUserIdList(List<TPickingRDto> tPickingRByCaseOutUserIdList) {
        this._tPickingRByCaseOutUserIdList = tPickingRByCaseOutUserIdList;
    }

    protected List<TPickingRDto> _tPickingRByShippingRecordOutUserIdList;

    public List<TPickingRDto> getTPickingRByShippingRecordOutUserIdList() {
        if (_tPickingRByShippingRecordOutUserIdList == null) { _tPickingRByShippingRecordOutUserIdList = new ArrayList<TPickingRDto>(); }
        return _tPickingRByShippingRecordOutUserIdList;
    }

    public void setTPickingRByShippingRecordOutUserIdList(List<TPickingRDto> tPickingRByShippingRecordOutUserIdList) {
        this._tPickingRByShippingRecordOutUserIdList = tPickingRByShippingRecordOutUserIdList;
    }

    protected List<TPickingRDto> _tPickingRByPl2OutUserIdList;

    public List<TPickingRDto> getTPickingRByPl2OutUserIdList() {
        if (_tPickingRByPl2OutUserIdList == null) { _tPickingRByPl2OutUserIdList = new ArrayList<TPickingRDto>(); }
        return _tPickingRByPl2OutUserIdList;
    }

    public void setTPickingRByPl2OutUserIdList(List<TPickingRDto> tPickingRByPl2OutUserIdList) {
        this._tPickingRByPl2OutUserIdList = tPickingRByPl2OutUserIdList;
    }

    protected List<TPickingRDto> _tPickingRBySlipOutUserIdList;

    public List<TPickingRDto> getTPickingRBySlipOutUserIdList() {
        if (_tPickingRBySlipOutUserIdList == null) { _tPickingRBySlipOutUserIdList = new ArrayList<TPickingRDto>(); }
        return _tPickingRBySlipOutUserIdList;
    }

    public void setTPickingRBySlipOutUserIdList(List<TPickingRDto> tPickingRBySlipOutUserIdList) {
        this._tPickingRBySlipOutUserIdList = tPickingRBySlipOutUserIdList;
    }

    protected List<TPickingRDto> _tPickingRByPackingOutUserIdList;

    public List<TPickingRDto> getTPickingRByPackingOutUserIdList() {
        if (_tPickingRByPackingOutUserIdList == null) { _tPickingRByPackingOutUserIdList = new ArrayList<TPickingRDto>(); }
        return _tPickingRByPackingOutUserIdList;
    }

    public void setTPickingRByPackingOutUserIdList(List<TPickingRDto> tPickingRByPackingOutUserIdList) {
        this._tPickingRByPackingOutUserIdList = tPickingRByPackingOutUserIdList;
    }

    protected List<TReceivePlanRDto> _tReceivePlanRList;

    public List<TReceivePlanRDto> getTReceivePlanRList() {
        if (_tReceivePlanRList == null) { _tReceivePlanRList = new ArrayList<TReceivePlanRDto>(); }
        return _tReceivePlanRList;
    }

    public void setTReceivePlanRList(List<TReceivePlanRDto> tReceivePlanRList) {
        this._tReceivePlanRList = tReceivePlanRList;
    }

    protected List<TStoreNoRDto> _tStoreNoRList;

    public List<TStoreNoRDto> getTStoreNoRList() {
        if (_tStoreNoRList == null) { _tStoreNoRList = new ArrayList<TStoreNoRDto>(); }
        return _tStoreNoRList;
    }

    public void setTStoreNoRList(List<TStoreNoRDto> tStoreNoRList) {
        this._tStoreNoRList = tStoreNoRList;
    }

    protected List<TStoreRecordRDto> _tStoreRecordRList;

    public List<TStoreRecordRDto> getTStoreRecordRList() {
        if (_tStoreRecordRList == null) { _tStoreRecordRList = new ArrayList<TStoreRecordRDto>(); }
        return _tStoreRecordRList;
    }

    public void setTStoreRecordRList(List<TStoreRecordRDto> tStoreRecordRList) {
        this._tStoreRecordRList = tStoreRecordRList;
    }

    protected List<WSglRowShipInspBDto> _wSglRowShipInspBList;

    public List<WSglRowShipInspBDto> getWSglRowShipInspBList() {
        if (_wSglRowShipInspBList == null) { _wSglRowShipInspBList = new ArrayList<WSglRowShipInspBDto>(); }
        return _wSglRowShipInspBList;
    }

    public void setWSglRowShipInspBList(List<WSglRowShipInspBDto> wSglRowShipInspBList) {
        this._wSglRowShipInspBList = wSglRowShipInspBList;
    }

    protected List<TPackingHDto> _tPackingHByUpdUserList;

    public List<TPackingHDto> getTPackingHByUpdUserList() {
        if (_tPackingHByUpdUserList == null) { _tPackingHByUpdUserList = new ArrayList<TPackingHDto>(); }
        return _tPackingHByUpdUserList;
    }

    public void setTPackingHByUpdUserList(List<TPackingHDto> tPackingHByUpdUserList) {
        this._tPackingHByUpdUserList = tPackingHByUpdUserList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBUserDto)) { return false; }
        final BsBUserDto otherEntity = (BsBUserDto)other;
        if (!helpComparingValue(getUserId(), otherEntity.getUserId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_USER");
        result = xCH(result, getUserId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getUserId());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getCultureId());
        sb.append(c).append(getRoleGrpId());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ユーザID
     * @return The value of the column 'USER_ID'. (NullAllowed)
     */
    public Long getUserId() {
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ユーザID
     * @param userId The value of the column 'USER_ID'. (NullAllowed)
     */
    public void setUserId(Long userId) {
        __modifiedProperties.add("userId");
        this._userId = userId;
    }

    /**
     * [get] USER_CD: {UQ, NotNull, varchar(30)} <br>
     * ユーザCD
     * @return The value of the column 'USER_CD'. (NullAllowed)
     */
    public String getUserCd() {
        return _userCd;
    }

    /**
     * [set] USER_CD: {UQ, NotNull, varchar(30)} <br>
     * ユーザCD
     * @param userCd The value of the column 'USER_CD'. (NullAllowed)
     */
    public void setUserCd(String userCd) {
        __modifiedProperties.add("userCd");
        this._userCd = userCd;
    }

    /**
     * [get] USER_NM: {NotNull, varchar(60)} <br>
     * ユーザ名
     * @return The value of the column 'USER_NM'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] USER_NM: {NotNull, varchar(60)} <br>
     * ユーザ名
     * @param userNm The value of the column 'USER_NM'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
    }

    /**
     * [get] CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        __modifiedProperties.add("cultureId");
        this._cultureId = cultureId;
    }

    /**
     * [get] ROLE_GRP_ID: {IX, bigint(19), FK to B_ROLE_GRP} <br>
     * 権限グループID
     * @return The value of the column 'ROLE_GRP_ID'. (NullAllowed)
     */
    public Long getRoleGrpId() {
        return _roleGrpId;
    }

    /**
     * [set] ROLE_GRP_ID: {IX, bigint(19), FK to B_ROLE_GRP} <br>
     * 権限グループID
     * @param roleGrpId The value of the column 'ROLE_GRP_ID'. (NullAllowed)
     */
    public void setRoleGrpId(Long roleGrpId) {
        __modifiedProperties.add("roleGrpId");
        this._roleGrpId = roleGrpId;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
