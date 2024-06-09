package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_STOCK_INOUT as TABLE. <br>
 * 在庫受払
 * <pre>
 * [primary-key]
 *     STOCK_INOUT_ID
 *
 * [column]
 *     STOCK_INOUT_ID, FS_STOCK_INOUT_ID, BF_STOCK_INOUT_ID, MOVE_RECORD_B_ID, STORE_RECORD_B_ID, ALLOC_INST_B_ID, PROCESS_DT, PROCESS_TYPE_ID, PROCESS_NO, CORRECT_TYPE, STOCK_ID, INOUT_TYPE, STOCK_INOUT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_INOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_ALLOC_INST_B, T_STOCK_INOUT, T_MOVE_RECORD_B, M_PROCESS_TYPE, T_STOCK, T_STORE_RECORD_B, B_CLASS_DTL(ByCorrectType)
 *
 * [referrer-table]
 *     T_STOCK_INOUT
 *
 * [foreign-property]
 *     tAllocInstB, tStockInoutByBfStockInoutIdSelf, tStockInoutByFsStockInoutIdSelf, tMoveRecordB, mProcessType, tStock, tStoreRecordB, bClassDtlByCorrectType, bClassDtlByInoutType
 *
 * [referrer-property]
 *     tStockInoutByBfStockInoutIdSelfList, tStockInoutByFsStockInoutIdSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTStockInoutDto implements Serializable {

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
    /** STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _stockInoutId;

    /** FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} */
    @JsonKey
    protected Long _fsStockInoutId;

    /** BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} */
    @JsonKey
    protected Long _bfStockInoutId;

    /** MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B} */
    @JsonKey
    protected Long _moveRecordBId;

    /** STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B} */
    @JsonKey
    protected Long _storeRecordBId;

    /** ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} */
    @JsonKey
    protected Long _allocInstBId;

    /** PROCESS_DT: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _processDt;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    @JsonKey
    protected Long _processTypeId;

    /** PROCESS_NO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _processNo;

    /** CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} */
    @JsonKey
    protected String _correctType;

    /** STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK} */
    @JsonKey
    protected Long _stockId;

    /** INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} */
    @JsonKey
    protected String _inoutType;

    /** STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _stockInoutNum;

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
    public BsTStockInoutDto() {
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
    protected TAllocInstBDto _tAllocInstB;

    public TAllocInstBDto getTAllocInstB() {
        return _tAllocInstB;
    }

    public void setTAllocInstB(TAllocInstBDto tAllocInstB) {
        this._tAllocInstB = tAllocInstB;
    }

    protected TStockInoutDto _tStockInoutByBfStockInoutIdSelf;

    public TStockInoutDto getTStockInoutByBfStockInoutIdSelf() {
        return _tStockInoutByBfStockInoutIdSelf;
    }

    public void setTStockInoutByBfStockInoutIdSelf(TStockInoutDto tStockInoutByBfStockInoutIdSelf) {
        this._tStockInoutByBfStockInoutIdSelf = tStockInoutByBfStockInoutIdSelf;
    }

    protected TStockInoutDto _tStockInoutByFsStockInoutIdSelf;

    public TStockInoutDto getTStockInoutByFsStockInoutIdSelf() {
        return _tStockInoutByFsStockInoutIdSelf;
    }

    public void setTStockInoutByFsStockInoutIdSelf(TStockInoutDto tStockInoutByFsStockInoutIdSelf) {
        this._tStockInoutByFsStockInoutIdSelf = tStockInoutByFsStockInoutIdSelf;
    }

    protected TMoveRecordBDto _tMoveRecordB;

    public TMoveRecordBDto getTMoveRecordB() {
        return _tMoveRecordB;
    }

    public void setTMoveRecordB(TMoveRecordBDto tMoveRecordB) {
        this._tMoveRecordB = tMoveRecordB;
    }

    protected MProcessTypeDto _mProcessType;

    public MProcessTypeDto getMProcessType() {
        return _mProcessType;
    }

    public void setMProcessType(MProcessTypeDto mProcessType) {
        this._mProcessType = mProcessType;
    }

    protected TStockDto _tStock;

    public TStockDto getTStock() {
        return _tStock;
    }

    public void setTStock(TStockDto tStock) {
        this._tStock = tStock;
    }

    protected TStoreRecordBDto _tStoreRecordB;

    public TStoreRecordBDto getTStoreRecordB() {
        return _tStoreRecordB;
    }

    public void setTStoreRecordB(TStoreRecordBDto tStoreRecordB) {
        this._tStoreRecordB = tStoreRecordB;
    }

    protected BClassDtlDto _bClassDtlByCorrectType;

    public BClassDtlDto getBClassDtlByCorrectType() {
        return _bClassDtlByCorrectType;
    }

    public void setBClassDtlByCorrectType(BClassDtlDto bClassDtlByCorrectType) {
        this._bClassDtlByCorrectType = bClassDtlByCorrectType;
    }

    protected BClassDtlDto _bClassDtlByInoutType;

    public BClassDtlDto getBClassDtlByInoutType() {
        return _bClassDtlByInoutType;
    }

    public void setBClassDtlByInoutType(BClassDtlDto bClassDtlByInoutType) {
        this._bClassDtlByInoutType = bClassDtlByInoutType;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TStockInoutDto> _tStockInoutByBfStockInoutIdSelfList;

    public List<TStockInoutDto> getTStockInoutByBfStockInoutIdSelfList() {
        if (_tStockInoutByBfStockInoutIdSelfList == null) { _tStockInoutByBfStockInoutIdSelfList = new ArrayList<TStockInoutDto>(); }
        return _tStockInoutByBfStockInoutIdSelfList;
    }

    public void setTStockInoutByBfStockInoutIdSelfList(List<TStockInoutDto> tStockInoutByBfStockInoutIdSelfList) {
        this._tStockInoutByBfStockInoutIdSelfList = tStockInoutByBfStockInoutIdSelfList;
    }

    protected List<TStockInoutDto> _tStockInoutByFsStockInoutIdSelfList;

    public List<TStockInoutDto> getTStockInoutByFsStockInoutIdSelfList() {
        if (_tStockInoutByFsStockInoutIdSelfList == null) { _tStockInoutByFsStockInoutIdSelfList = new ArrayList<TStockInoutDto>(); }
        return _tStockInoutByFsStockInoutIdSelfList;
    }

    public void setTStockInoutByFsStockInoutIdSelfList(List<TStockInoutDto> tStockInoutByFsStockInoutIdSelfList) {
        this._tStockInoutByFsStockInoutIdSelfList = tStockInoutByFsStockInoutIdSelfList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTStockInoutDto)) { return false; }
        final BsTStockInoutDto otherEntity = (BsTStockInoutDto)other;
        if (!helpComparingValue(getStockInoutId(), otherEntity.getStockInoutId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_STOCK_INOUT");
        result = xCH(result, getStockInoutId());
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
        sb.append(c).append(getStockInoutId());
        sb.append(c).append(getFsStockInoutId());
        sb.append(c).append(getBfStockInoutId());
        sb.append(c).append(getMoveRecordBId());
        sb.append(c).append(getStoreRecordBId());
        sb.append(c).append(getAllocInstBId());
        sb.append(c).append(getProcessDt());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getProcessNo());
        sb.append(c).append(getCorrectType());
        sb.append(c).append(getStockId());
        sb.append(c).append(getInoutType());
        sb.append(c).append(getStockInoutNum());
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
     * [get] STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫受払ID
     * @return The value of the column 'STOCK_INOUT_ID'. (NullAllowed)
     */
    public Long getStockInoutId() {
        return _stockInoutId;
    }

    /**
     * [set] STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫受払ID
     * @param stockInoutId The value of the column 'STOCK_INOUT_ID'. (NullAllowed)
     */
    public void setStockInoutId(Long stockInoutId) {
        __modifiedProperties.add("stockInoutId");
        this._stockInoutId = stockInoutId;
    }

    /**
     * [get] FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} <br>
     * 初回在庫受払ID
     * @return The value of the column 'FS_STOCK_INOUT_ID'. (NullAllowed)
     */
    public Long getFsStockInoutId() {
        return _fsStockInoutId;
    }

    /**
     * [set] FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} <br>
     * 初回在庫受払ID
     * @param fsStockInoutId The value of the column 'FS_STOCK_INOUT_ID'. (NullAllowed)
     */
    public void setFsStockInoutId(Long fsStockInoutId) {
        __modifiedProperties.add("fsStockInoutId");
        this._fsStockInoutId = fsStockInoutId;
    }

    /**
     * [get] BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} <br>
     * 前回在庫受払ID
     * @return The value of the column 'BF_STOCK_INOUT_ID'. (NullAllowed)
     */
    public Long getBfStockInoutId() {
        return _bfStockInoutId;
    }

    /**
     * [set] BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} <br>
     * 前回在庫受払ID
     * @param bfStockInoutId The value of the column 'BF_STOCK_INOUT_ID'. (NullAllowed)
     */
    public void setBfStockInoutId(Long bfStockInoutId) {
        __modifiedProperties.add("bfStockInoutId");
        this._bfStockInoutId = bfStockInoutId;
    }

    /**
     * [get] MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B} <br>
     * 在庫移動実績ボディID
     * @return The value of the column 'MOVE_RECORD_B_ID'. (NullAllowed)
     */
    public Long getMoveRecordBId() {
        return _moveRecordBId;
    }

    /**
     * [set] MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B} <br>
     * 在庫移動実績ボディID
     * @param moveRecordBId The value of the column 'MOVE_RECORD_B_ID'. (NullAllowed)
     */
    public void setMoveRecordBId(Long moveRecordBId) {
        __modifiedProperties.add("moveRecordBId");
        this._moveRecordBId = moveRecordBId;
    }

    /**
     * [get] STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B} <br>
     * 入庫実績ボディID
     * @return The value of the column 'STORE_RECORD_B_ID'. (NullAllowed)
     */
    public Long getStoreRecordBId() {
        return _storeRecordBId;
    }

    /**
     * [set] STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B} <br>
     * 入庫実績ボディID
     * @param storeRecordBId The value of the column 'STORE_RECORD_B_ID'. (NullAllowed)
     */
    public void setStoreRecordBId(Long storeRecordBId) {
        __modifiedProperties.add("storeRecordBId");
        this._storeRecordBId = storeRecordBId;
    }

    /**
     * [get] ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public Long getAllocInstBId() {
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} <br>
     * 引当指示ボディID
     * @param allocInstBId The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public void setAllocInstBId(Long allocInstBId) {
        __modifiedProperties.add("allocInstBId");
        this._allocInstBId = allocInstBId;
    }

    /**
     * [get] PROCESS_DT: {IX, NotNull, varchar(8)} <br>
     * 処理日
     * @return The value of the column 'PROCESS_DT'. (NullAllowed)
     */
    public String getProcessDt() {
        return _processDt;
    }

    /**
     * [set] PROCESS_DT: {IX, NotNull, varchar(8)} <br>
     * 処理日
     * @param processDt The value of the column 'PROCESS_DT'. (NullAllowed)
     */
    public void setProcessDt(String processDt) {
        __modifiedProperties.add("processDt");
        this._processDt = processDt;
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
     * [get] PROCESS_NO: {NotNull, varchar(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public String getProcessNo() {
        return _processNo;
    }

    /**
     * [set] PROCESS_NO: {NotNull, varchar(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public void setProcessNo(String processNo) {
        __modifiedProperties.add("processNo");
        this._processNo = processNo;
    }

    /**
     * [get] CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @return The value of the column 'CORRECT_TYPE'. (NullAllowed)
     */
    public String getCorrectType() {
        return _correctType;
    }

    /**
     * [set] CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param correctType The value of the column 'CORRECT_TYPE'. (NullAllowed)
     */
    public void setCorrectType(String correctType) {
        __modifiedProperties.add("correctType");
        this._correctType = correctType;
    }

    /**
     * [get] STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @return The value of the column 'INOUT_TYPE'. (NullAllowed)
     */
    public String getInoutType() {
        return _inoutType;
    }

    /**
     * [set] INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param inoutType The value of the column 'INOUT_TYPE'. (NullAllowed)
     */
    public void setInoutType(String inoutType) {
        __modifiedProperties.add("inoutType");
        this._inoutType = inoutType;
    }

    /**
     * [get] STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 受払数
     * @return The value of the column 'STOCK_INOUT_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getStockInoutNum() {
        return _stockInoutNum;
    }

    /**
     * [set] STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 受払数
     * @param stockInoutNum The value of the column 'STOCK_INOUT_NUM'. (NullAllowed)
     */
    public void setStockInoutNum(java.math.BigDecimal stockInoutNum) {
        __modifiedProperties.add("stockInoutNum");
        this._stockInoutNum = stockInoutNum;
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
