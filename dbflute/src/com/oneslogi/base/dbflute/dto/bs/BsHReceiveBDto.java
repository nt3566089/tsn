package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of H_RECEIVE_B as TABLE. <br>
 * 入荷ボディ履歴
 * <pre>
 * [primary-key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, STORE_RECORD_H_ID, STOCK_ID, PLAN_NUM, PROCESS_NO, STORE_DT, STORE_NUM, STORE_FLG, STORE_LOCATION_ID, STORE_LOCATION_CD, STORE_LOCATION_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     H_STOCK, H_RECEIVE_H, B_CLASS_DTL(ByStoreFlg), H_RECEIVE_SPARE(AsOne)
 *
 * [referrer-table]
 *     H_RECEIVE_SPARE
 *
 * [foreign-property]
 *     hStock, hReceiveH, bClassDtlByStoreFlg, hReceiveSpareAsOne
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsHReceiveBDto implements Serializable {

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
    /** STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _storeRecordBId;

    /** STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H} */
    @JsonKey
    protected Long _storeRecordHId;

    /** STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} */
    @JsonKey
    protected Long _stockId;

    /** PLAN_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _planNum;

    /** PROCESS_NO: {varchar(30)} */
    @JsonKey
    protected String _processNo;

    /** STORE_DT: {IX, varchar(8)} */
    @JsonKey
    protected String _storeDt;

    /** STORE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _storeNum;

    /** STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} */
    @JsonKey
    protected String _storeFlg;

    /** STORE_LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _storeLocationId;

    /** STORE_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _storeLocationCd;

    /** STORE_LOCATION_NM: {varchar(60)} */
    @JsonKey
    protected String _storeLocationNm;

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
    public BsHReceiveBDto() {
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
    protected HStockDto _hStock;

    public HStockDto getHStock() {
        return _hStock;
    }

    public void setHStock(HStockDto hStock) {
        this._hStock = hStock;
    }

    protected HReceiveHDto _hReceiveH;

    public HReceiveHDto getHReceiveH() {
        return _hReceiveH;
    }

    public void setHReceiveH(HReceiveHDto hReceiveH) {
        this._hReceiveH = hReceiveH;
    }

    protected BClassDtlDto _bClassDtlByStoreFlg;

    public BClassDtlDto getBClassDtlByStoreFlg() {
        return _bClassDtlByStoreFlg;
    }

    public void setBClassDtlByStoreFlg(BClassDtlDto bClassDtlByStoreFlg) {
        this._bClassDtlByStoreFlg = bClassDtlByStoreFlg;
    }

    protected HReceiveSpareDto _hReceiveSpareAsOne;

    public HReceiveSpareDto getHReceiveSpareAsOne() {
        return _hReceiveSpareAsOne;
    }

    public void setHReceiveSpareAsOne(HReceiveSpareDto HReceiveSpareAsOne) {
        this._hReceiveSpareAsOne = HReceiveSpareAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsHReceiveBDto)) { return false; }
        final BsHReceiveBDto otherEntity = (BsHReceiveBDto)other;
        if (!helpComparingValue(getStoreRecordBId(), otherEntity.getStoreRecordBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "H_RECEIVE_B");
        result = xCH(result, getStoreRecordBId());
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
        sb.append(c).append(getStoreRecordBId());
        sb.append(c).append(getStoreRecordHId());
        sb.append(c).append(getStockId());
        sb.append(c).append(getPlanNum());
        sb.append(c).append(getProcessNo());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getStoreNum());
        sb.append(c).append(getStoreFlg());
        sb.append(c).append(getStoreLocationId());
        sb.append(c).append(getStoreLocationCd());
        sb.append(c).append(getStoreLocationNm());
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
     * [get] STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績ボディID
     * @return The value of the column 'STORE_RECORD_B_ID'. (NullAllowed)
     */
    public Long getStoreRecordBId() {
        return _storeRecordBId;
    }

    /**
     * [set] STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績ボディID
     * @param storeRecordBId The value of the column 'STORE_RECORD_B_ID'. (NullAllowed)
     */
    public void setStoreRecordBId(Long storeRecordBId) {
        __modifiedProperties.add("storeRecordBId");
        this._storeRecordBId = storeRecordBId;
    }

    /**
     * [get] STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H} <br>
     * 入庫実績ヘッダID
     * @return The value of the column 'STORE_RECORD_H_ID'. (NullAllowed)
     */
    public Long getStoreRecordHId() {
        return _storeRecordHId;
    }

    /**
     * [set] STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H} <br>
     * 入庫実績ヘッダID
     * @param storeRecordHId The value of the column 'STORE_RECORD_H_ID'. (NullAllowed)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        __modifiedProperties.add("storeRecordHId");
        this._storeRecordHId = storeRecordHId;
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
     * [get] PLAN_NUM: {decimal(16, 6)} <br>
     * 予定数
     * @return The value of the column 'PLAN_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPlanNum() {
        return _planNum;
    }

    /**
     * [set] PLAN_NUM: {decimal(16, 6)} <br>
     * 予定数
     * @param planNum The value of the column 'PLAN_NUM'. (NullAllowed)
     */
    public void setPlanNum(java.math.BigDecimal planNum) {
        __modifiedProperties.add("planNum");
        this._planNum = planNum;
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
     * [get] STORE_DT: {IX, varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] STORE_DT: {IX, varchar(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] STORE_NUM: {decimal(16, 6)} <br>
     * 入庫数
     * @return The value of the column 'STORE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getStoreNum() {
        return _storeNum;
    }

    /**
     * [set] STORE_NUM: {decimal(16, 6)} <br>
     * 入庫数
     * @param storeNum The value of the column 'STORE_NUM'. (NullAllowed)
     */
    public void setStoreNum(java.math.BigDecimal storeNum) {
        __modifiedProperties.add("storeNum");
        this._storeNum = storeNum;
    }

    /**
     * [get] STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 入庫格納フラグ
     * @return The value of the column 'STORE_FLG'. (NullAllowed)
     */
    public String getStoreFlg() {
        return _storeFlg;
    }

    /**
     * [set] STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 入庫格納フラグ
     * @param storeFlg The value of the column 'STORE_FLG'. (NullAllowed)
     */
    public void setStoreFlg(String storeFlg) {
        __modifiedProperties.add("storeFlg");
        this._storeFlg = storeFlg;
    }

    /**
     * [get] STORE_LOCATION_ID: {bigint(19)} <br>
     * 入庫格納ロケーションID
     * @return The value of the column 'STORE_LOCATION_ID'. (NullAllowed)
     */
    public Long getStoreLocationId() {
        return _storeLocationId;
    }

    /**
     * [set] STORE_LOCATION_ID: {bigint(19)} <br>
     * 入庫格納ロケーションID
     * @param storeLocationId The value of the column 'STORE_LOCATION_ID'. (NullAllowed)
     */
    public void setStoreLocationId(Long storeLocationId) {
        __modifiedProperties.add("storeLocationId");
        this._storeLocationId = storeLocationId;
    }

    /**
     * [get] STORE_LOCATION_CD: {varchar(30)} <br>
     * 入庫格納ロケーションCD
     * @return The value of the column 'STORE_LOCATION_CD'. (NullAllowed)
     */
    public String getStoreLocationCd() {
        return _storeLocationCd;
    }

    /**
     * [set] STORE_LOCATION_CD: {varchar(30)} <br>
     * 入庫格納ロケーションCD
     * @param storeLocationCd The value of the column 'STORE_LOCATION_CD'. (NullAllowed)
     */
    public void setStoreLocationCd(String storeLocationCd) {
        __modifiedProperties.add("storeLocationCd");
        this._storeLocationCd = storeLocationCd;
    }

    /**
     * [get] STORE_LOCATION_NM: {varchar(60)} <br>
     * 入庫格納ロケーション名称
     * @return The value of the column 'STORE_LOCATION_NM'. (NullAllowed)
     */
    public String getStoreLocationNm() {
        return _storeLocationNm;
    }

    /**
     * [set] STORE_LOCATION_NM: {varchar(60)} <br>
     * 入庫格納ロケーション名称
     * @param storeLocationNm The value of the column 'STORE_LOCATION_NM'. (NullAllowed)
     */
    public void setStoreLocationNm(String storeLocationNm) {
        __modifiedProperties.add("storeLocationNm");
        this._storeLocationNm = storeLocationNm;
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
