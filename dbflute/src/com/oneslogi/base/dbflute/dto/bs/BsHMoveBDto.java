package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of H_MOVE_B as TABLE. <br>
 * 在庫移動ボディ履歴
 * <pre>
 * [primary-key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, INOUT_TYPE, STOCK_ID, PROCESS_NO, MOVE_DT, MOVE_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     H_MOVE_H, H_STOCK, B_CLASS_DTL(ByInoutType)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     hMoveH, hStock, bClassDtlByInoutType
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsHMoveBDto implements Serializable {

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
    /** MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _moveRecordBId;

    /** MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to H_MOVE_H} */
    @JsonKey
    protected Long _moveInstHId;

    /** INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType} */
    @JsonKey
    protected String _inoutType;

    /** STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} */
    @JsonKey
    protected Long _stockId;

    /** PROCESS_NO: {varchar(30)} */
    @JsonKey
    protected String _processNo;

    /** MOVE_DT: {IX, varchar(8)} */
    @JsonKey
    protected String _moveDt;

    /** MOVE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _moveNum;

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
    public BsHMoveBDto() {
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
    protected HMoveHDto _hMoveH;

    public HMoveHDto getHMoveH() {
        return _hMoveH;
    }

    public void setHMoveH(HMoveHDto hMoveH) {
        this._hMoveH = hMoveH;
    }

    protected HStockDto _hStock;

    public HStockDto getHStock() {
        return _hStock;
    }

    public void setHStock(HStockDto hStock) {
        this._hStock = hStock;
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
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsHMoveBDto)) { return false; }
        final BsHMoveBDto otherEntity = (BsHMoveBDto)other;
        if (!helpComparingValue(getMoveRecordBId(), otherEntity.getMoveRecordBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "H_MOVE_B");
        result = xCH(result, getMoveRecordBId());
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
        sb.append(c).append(getMoveRecordBId());
        sb.append(c).append(getMoveInstHId());
        sb.append(c).append(getInoutType());
        sb.append(c).append(getStockId());
        sb.append(c).append(getProcessNo());
        sb.append(c).append(getMoveDt());
        sb.append(c).append(getMoveNum());
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
     * [get] MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫移動実績ボディID
     * @return The value of the column 'MOVE_RECORD_B_ID'. (NullAllowed)
     */
    public Long getMoveRecordBId() {
        return _moveRecordBId;
    }

    /**
     * [set] MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫移動実績ボディID
     * @param moveRecordBId The value of the column 'MOVE_RECORD_B_ID'. (NullAllowed)
     */
    public void setMoveRecordBId(Long moveRecordBId) {
        __modifiedProperties.add("moveRecordBId");
        this._moveRecordBId = moveRecordBId;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to H_MOVE_H} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public Long getMoveInstHId() {
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to H_MOVE_H} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public void setMoveInstHId(Long moveInstHId) {
        __modifiedProperties.add("moveInstHId");
        this._moveInstHId = moveInstHId;
    }

    /**
     * [get] INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @return The value of the column 'INOUT_TYPE'. (NullAllowed)
     */
    public String getInoutType() {
        return _inoutType;
    }

    /**
     * [set] INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param inoutType The value of the column 'INOUT_TYPE'. (NullAllowed)
     */
    public void setInoutType(String inoutType) {
        __modifiedProperties.add("inoutType");
        this._inoutType = inoutType;
    }

    /**
     * [get] STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] PROCESS_NO: {varchar(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public String getProcessNo() {
        return _processNo;
    }

    /**
     * [set] PROCESS_NO: {varchar(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public void setProcessNo(String processNo) {
        __modifiedProperties.add("processNo");
        this._processNo = processNo;
    }

    /**
     * [get] MOVE_DT: {IX, varchar(8)} <br>
     * 移動日
     * @return The value of the column 'MOVE_DT'. (NullAllowed)
     */
    public String getMoveDt() {
        return _moveDt;
    }

    /**
     * [set] MOVE_DT: {IX, varchar(8)} <br>
     * 移動日
     * @param moveDt The value of the column 'MOVE_DT'. (NullAllowed)
     */
    public void setMoveDt(String moveDt) {
        __modifiedProperties.add("moveDt");
        this._moveDt = moveDt;
    }

    /**
     * [get] MOVE_NUM: {decimal(16, 6)} <br>
     * 在庫移動実績数
     * @return The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNum() {
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {decimal(16, 6)} <br>
     * 在庫移動実績数
     * @param moveNum The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        __modifiedProperties.add("moveNum");
        this._moveNum = moveNum;
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
