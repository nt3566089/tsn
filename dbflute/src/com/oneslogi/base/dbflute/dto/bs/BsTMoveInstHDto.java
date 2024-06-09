package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_MOVE_INST_H as TABLE. <br>
 * 在庫移動指示ヘッダ
 * <pre>
 * [primary-key]
 *     MOVE_INST_H_ID
 *
 * [column]
 *     MOVE_INST_H_ID, CLIENT_ID, CENTER_ID, INST_DT, MOVE_SLIP_NO, PROCESS_TYPE_ID, MOVE_INST_STATUS, INPUT_TYPE, MOVE_INST_COMMENT, SOURCE_BATCH_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT, M_PROCESS_TYPE, B_CLASS_DTL(ByInputType), T_MOVE_INST_R(AsOne)
 *
 * [referrer-table]
 *     T_INVENTORY_B, T_MOVE_INST_B, T_MOVE_RECORD_B, T_MOVE_INST_R
 *
 * [foreign-property]
 *     mCenter, mClient, mProcessType, bClassDtlByInputType, bClassDtlByMoveInstStatus, tMoveInstRAsOne
 *
 * [referrer-property]
 *     tInventoryBList, tMoveInstBList, tMoveRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTMoveInstHDto implements Serializable {

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
    /** MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _moveInstHId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** INST_DT: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _instDt;

    /** MOVE_SLIP_NO: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _moveSlipNo;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    @JsonKey
    protected Long _processTypeId;

    /** MOVE_INST_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} */
    @JsonKey
    protected String _moveInstStatus;

    /** INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} */
    @JsonKey
    protected String _inputType;

    /** MOVE_INST_COMMENT: {varchar(255)} */
    @JsonKey
    protected String _moveInstComment;

    /** SOURCE_BATCH_NO: {varchar(30)} */
    @JsonKey
    protected String _sourceBatchNo;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
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
    public BsTMoveInstHDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MProcessTypeDto _mProcessType;

    public MProcessTypeDto getMProcessType() {
        return _mProcessType;
    }

    public void setMProcessType(MProcessTypeDto mProcessType) {
        this._mProcessType = mProcessType;
    }

    protected BClassDtlDto _bClassDtlByInputType;

    public BClassDtlDto getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    public void setBClassDtlByInputType(BClassDtlDto bClassDtlByInputType) {
        this._bClassDtlByInputType = bClassDtlByInputType;
    }

    protected BClassDtlDto _bClassDtlByMoveInstStatus;

    public BClassDtlDto getBClassDtlByMoveInstStatus() {
        return _bClassDtlByMoveInstStatus;
    }

    public void setBClassDtlByMoveInstStatus(BClassDtlDto bClassDtlByMoveInstStatus) {
        this._bClassDtlByMoveInstStatus = bClassDtlByMoveInstStatus;
    }

    protected TMoveInstRDto _tMoveInstRAsOne;

    public TMoveInstRDto getTMoveInstRAsOne() {
        return _tMoveInstRAsOne;
    }

    public void setTMoveInstRAsOne(TMoveInstRDto TMoveInstRAsOne) {
        this._tMoveInstRAsOne = TMoveInstRAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TInventoryBDto> _tInventoryBList;

    public List<TInventoryBDto> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBList;
    }

    public void setTInventoryBList(List<TInventoryBDto> tInventoryBList) {
        this._tInventoryBList = tInventoryBList;
    }

    protected List<TMoveInstBDto> _tMoveInstBList;

    public List<TMoveInstBDto> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBList;
    }

    public void setTMoveInstBList(List<TMoveInstBDto> tMoveInstBList) {
        this._tMoveInstBList = tMoveInstBList;
    }

    protected List<TMoveRecordBDto> _tMoveRecordBList;

    public List<TMoveRecordBDto> getTMoveRecordBList() {
        if (_tMoveRecordBList == null) { _tMoveRecordBList = new ArrayList<TMoveRecordBDto>(); }
        return _tMoveRecordBList;
    }

    public void setTMoveRecordBList(List<TMoveRecordBDto> tMoveRecordBList) {
        this._tMoveRecordBList = tMoveRecordBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTMoveInstHDto)) { return false; }
        final BsTMoveInstHDto otherEntity = (BsTMoveInstHDto)other;
        if (!helpComparingValue(getMoveInstHId(), otherEntity.getMoveInstHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_MOVE_INST_H");
        result = xCH(result, getMoveInstHId());
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
        sb.append(c).append(getMoveInstHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getInstDt());
        sb.append(c).append(getMoveSlipNo());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getMoveInstStatus());
        sb.append(c).append(getInputType());
        sb.append(c).append(getMoveInstComment());
        sb.append(c).append(getSourceBatchNo());
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
     * [get] MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public Long getMoveInstHId() {
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public void setMoveInstHId(Long moveInstHId) {
        __modifiedProperties.add("moveInstHId");
        this._moveInstHId = moveInstHId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] INST_DT: {IX, NotNull, varchar(8)} <br>
     * 指示日
     * @return The value of the column 'INST_DT'. (NullAllowed)
     */
    public String getInstDt() {
        return _instDt;
    }

    /**
     * [set] INST_DT: {IX, NotNull, varchar(8)} <br>
     * 指示日
     * @param instDt The value of the column 'INST_DT'. (NullAllowed)
     */
    public void setInstDt(String instDt) {
        __modifiedProperties.add("instDt");
        this._instDt = instDt;
    }

    /**
     * [get] MOVE_SLIP_NO: {IX, NotNull, varchar(30)} <br>
     * WMS在庫移動伝票No.
     * @return The value of the column 'MOVE_SLIP_NO'. (NullAllowed)
     */
    public String getMoveSlipNo() {
        return _moveSlipNo;
    }

    /**
     * [set] MOVE_SLIP_NO: {IX, NotNull, varchar(30)} <br>
     * WMS在庫移動伝票No.
     * @param moveSlipNo The value of the column 'MOVE_SLIP_NO'. (NullAllowed)
     */
    public void setMoveSlipNo(String moveSlipNo) {
        __modifiedProperties.add("moveSlipNo");
        this._moveSlipNo = moveSlipNo;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] MOVE_INST_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @return The value of the column 'MOVE_INST_STATUS'. (NullAllowed)
     */
    public String getMoveInstStatus() {
        return _moveInstStatus;
    }

    /**
     * [set] MOVE_INST_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @param moveInstStatus The value of the column 'MOVE_INST_STATUS'. (NullAllowed)
     */
    public void setMoveInstStatus(String moveInstStatus) {
        __modifiedProperties.add("moveInstStatus");
        this._moveInstStatus = moveInstStatus;
    }

    /**
     * [get] INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * [set] INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public void setInputType(String inputType) {
        __modifiedProperties.add("inputType");
        this._inputType = inputType;
    }

    /**
     * [get] MOVE_INST_COMMENT: {varchar(255)} <br>
     * 在庫移動指示備考
     * @return The value of the column 'MOVE_INST_COMMENT'. (NullAllowed)
     */
    public String getMoveInstComment() {
        return _moveInstComment;
    }

    /**
     * [set] MOVE_INST_COMMENT: {varchar(255)} <br>
     * 在庫移動指示備考
     * @param moveInstComment The value of the column 'MOVE_INST_COMMENT'. (NullAllowed)
     */
    public void setMoveInstComment(String moveInstComment) {
        __modifiedProperties.add("moveInstComment");
        this._moveInstComment = moveInstComment;
    }

    /**
     * [get] SOURCE_BATCH_NO: {varchar(30)} <br>
     * 指示元バッチNo.
     * @return The value of the column 'SOURCE_BATCH_NO'. (NullAllowed)
     */
    public String getSourceBatchNo() {
        return _sourceBatchNo;
    }

    /**
     * [set] SOURCE_BATCH_NO: {varchar(30)} <br>
     * 指示元バッチNo.
     * @param sourceBatchNo The value of the column 'SOURCE_BATCH_NO'. (NullAllowed)
     */
    public void setSourceBatchNo(String sourceBatchNo) {
        __modifiedProperties.add("sourceBatchNo");
        this._sourceBatchNo = sourceBatchNo;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
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
