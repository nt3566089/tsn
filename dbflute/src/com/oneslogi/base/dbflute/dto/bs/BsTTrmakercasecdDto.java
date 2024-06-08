package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRMAKERCASECD as TABLE. <br>
 * メーカーケースコード情報
 * <pre>
 * [primary-key]
 *     TRMAKERCASECD_ID
 *
 * [column]
 *     TRMAKERCASECD_ID, SEQNO, RECEIVE_PLAN_H_ID, WAREHOUSECD, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, CARRIERNO, CARRIERWBNO, NUMBER_OF_PALLETS, SSCC, CASENO, MAKERCASENO, LOT4, RESULTFLG, RECEIVEDFLG, IFRECEIVEDFLG, SYMBOLNO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRMAKERCASECD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrmakercasecdDto implements Serializable {

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
    /** TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trmakercasecdId;

    /** SEQNO: {bigint(19)} */
    @JsonKey
    protected Long _seqno;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** WAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** SENDER_LOCATION: {varchar(30)} */
    @JsonKey
    protected String _senderLocation;

    /** RECEIVER_LOCATION: {varchar(30)} */
    @JsonKey
    protected String _receiverLocation;

    /** SHIPMENT_ID: {varchar(30)} */
    @JsonKey
    protected String _shipmentId;

    /** SHIPMENT_DATE: {varchar(30)} */
    @JsonKey
    protected String _shipmentDate;

    /** CARRIERNO: {varchar(30)} */
    @JsonKey
    protected String _carrierno;

    /** CARRIERWBNO: {varchar(30)} */
    @JsonKey
    protected String _carrierwbno;

    /** NUMBER_OF_PALLETS: {varchar(30)} */
    @JsonKey
    protected String _numberOfPallets;

    /** SSCC: {varchar(30)} */
    @JsonKey
    protected String _sscc;

    /** CASENO: {varchar(30)} */
    @JsonKey
    protected String _caseno;

    /** MAKERCASENO: {varchar(60)} */
    @JsonKey
    protected String _makercaseno;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** RESULTFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _resultflg;

    /** RECEIVEDFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _receivedflg;

    /** IFRECEIVEDFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _ifreceivedflg;

    /** SYMBOLNO: {bigint(19)} */
    @JsonKey
    protected Long _symbolno;

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
    public BsTTrmakercasecdDto() {
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
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrmakercasecdDto)) { return false; }
        final BsTTrmakercasecdDto otherEntity = (BsTTrmakercasecdDto)other;
        if (!helpComparingValue(getTrmakercasecdId(), otherEntity.getTrmakercasecdId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRMAKERCASECD");
        result = xCH(result, getTrmakercasecdId());
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
        sb.append(c).append(getTrmakercasecdId());
        sb.append(c).append(getSeqno());
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getSenderLocation());
        sb.append(c).append(getReceiverLocation());
        sb.append(c).append(getShipmentId());
        sb.append(c).append(getShipmentDate());
        sb.append(c).append(getCarrierno());
        sb.append(c).append(getCarrierwbno());
        sb.append(c).append(getNumberOfPallets());
        sb.append(c).append(getSscc());
        sb.append(c).append(getCaseno());
        sb.append(c).append(getMakercaseno());
        sb.append(c).append(getLot4());
        sb.append(c).append(getResultflg());
        sb.append(c).append(getReceivedflg());
        sb.append(c).append(getIfreceivedflg());
        sb.append(c).append(getSymbolno());
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
     * [get] TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メーカーケースCD情報ID
     * @return The value of the column 'TRMAKERCASECD_ID'. (NullAllowed)
     */
    public Long getTrmakercasecdId() {
        return _trmakercasecdId;
    }

    /**
     * [set] TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メーカーケースCD情報ID
     * @param trmakercasecdId The value of the column 'TRMAKERCASECD_ID'. (NullAllowed)
     */
    public void setTrmakercasecdId(Long trmakercasecdId) {
        __modifiedProperties.add("trmakercasecdId");
        this._trmakercasecdId = trmakercasecdId;
    }

    /**
     * [get] SEQNO: {bigint(19)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed)
     */
    public Long getSeqno() {
        return _seqno;
    }

    /**
     * [set] SEQNO: {bigint(19)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed)
     */
    public void setSeqno(Long seqno) {
        __modifiedProperties.add("seqno");
        this._seqno = seqno;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @return The value of the column 'SENDER_LOCATION'. (NullAllowed)
     */
    public String getSenderLocation() {
        return _senderLocation;
    }

    /**
     * [set] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @param senderLocation The value of the column 'SENDER_LOCATION'. (NullAllowed)
     */
    public void setSenderLocation(String senderLocation) {
        __modifiedProperties.add("senderLocation");
        this._senderLocation = senderLocation;
    }

    /**
     * [get] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @return The value of the column 'RECEIVER_LOCATION'. (NullAllowed)
     */
    public String getReceiverLocation() {
        return _receiverLocation;
    }

    /**
     * [set] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @param receiverLocation The value of the column 'RECEIVER_LOCATION'. (NullAllowed)
     */
    public void setReceiverLocation(String receiverLocation) {
        __modifiedProperties.add("receiverLocation");
        this._receiverLocation = receiverLocation;
    }

    /**
     * [get] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @return The value of the column 'SHIPMENT_ID'. (NullAllowed)
     */
    public String getShipmentId() {
        return _shipmentId;
    }

    /**
     * [set] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @param shipmentId The value of the column 'SHIPMENT_ID'. (NullAllowed)
     */
    public void setShipmentId(String shipmentId) {
        __modifiedProperties.add("shipmentId");
        this._shipmentId = shipmentId;
    }

    /**
     * [get] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日（YYYYMMDDhhmmss）
     * @return The value of the column 'SHIPMENT_DATE'. (NullAllowed)
     */
    public String getShipmentDate() {
        return _shipmentDate;
    }

    /**
     * [set] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日（YYYYMMDDhhmmss）
     * @param shipmentDate The value of the column 'SHIPMENT_DATE'. (NullAllowed)
     */
    public void setShipmentDate(String shipmentDate) {
        __modifiedProperties.add("shipmentDate");
        this._shipmentDate = shipmentDate;
    }

    /**
     * [get] CARRIERNO: {varchar(30)} <br>
     * コンテナNO
     * @return The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public String getCarrierno() {
        return _carrierno;
    }

    /**
     * [set] CARRIERNO: {varchar(30)} <br>
     * コンテナNO
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public void setCarrierno(String carrierno) {
        __modifiedProperties.add("carrierno");
        this._carrierno = carrierno;
    }

    /**
     * [get] CARRIERWBNO: {varchar(30)} <br>
     * オーダーNO
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public String getCarrierwbno() {
        return _carrierwbno;
    }

    /**
     * [set] CARRIERWBNO: {varchar(30)} <br>
     * オーダーNO
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public void setCarrierwbno(String carrierwbno) {
        __modifiedProperties.add("carrierwbno");
        this._carrierwbno = carrierwbno;
    }

    /**
     * [get] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed)
     */
    public String getNumberOfPallets() {
        return _numberOfPallets;
    }

    /**
     * [set] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @param numberOfPallets The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed)
     */
    public void setNumberOfPallets(String numberOfPallets) {
        __modifiedProperties.add("numberOfPallets");
        this._numberOfPallets = numberOfPallets;
    }

    /**
     * [get] SSCC: {varchar(30)} <br>
     * sscc
     * @return The value of the column 'SSCC'. (NullAllowed)
     */
    public String getSscc() {
        return _sscc;
    }

    /**
     * [set] SSCC: {varchar(30)} <br>
     * sscc
     * @param sscc The value of the column 'SSCC'. (NullAllowed)
     */
    public void setSscc(String sscc) {
        __modifiedProperties.add("sscc");
        this._sscc = sscc;
    }

    /**
     * [get] CASENO: {varchar(30)} <br>
     * ケース番号
     * @return The value of the column 'CASENO'. (NullAllowed)
     */
    public String getCaseno() {
        return _caseno;
    }

    /**
     * [set] CASENO: {varchar(30)} <br>
     * ケース番号
     * @param caseno The value of the column 'CASENO'. (NullAllowed)
     */
    public void setCaseno(String caseno) {
        __modifiedProperties.add("caseno");
        this._caseno = caseno;
    }

    /**
     * [get] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKERCASENO'. (NullAllowed)
     */
    public String getMakercaseno() {
        return _makercaseno;
    }

    /**
     * [set] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @param makercaseno The value of the column 'MAKERCASENO'. (NullAllowed)
     */
    public void setMakercaseno(String makercaseno) {
        __modifiedProperties.add("makercaseno");
        this._makercaseno = makercaseno;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] RESULTFLG: {NotNull, char(1)} <br>
     * 貼付実績フラグ
     * @return The value of the column 'RESULTFLG'. (NullAllowed)
     */
    public String getResultflg() {
        return _resultflg;
    }

    /**
     * [set] RESULTFLG: {NotNull, char(1)} <br>
     * 貼付実績フラグ
     * @param resultflg The value of the column 'RESULTFLG'. (NullAllowed)
     */
    public void setResultflg(String resultflg) {
        __modifiedProperties.add("resultflg");
        this._resultflg = resultflg;
    }

    /**
     * [get] RECEIVEDFLG: {NotNull, char(1)} <br>
     * 予定情報受信済フラグ
     * @return The value of the column 'RECEIVEDFLG'. (NullAllowed)
     */
    public String getReceivedflg() {
        return _receivedflg;
    }

    /**
     * [set] RECEIVEDFLG: {NotNull, char(1)} <br>
     * 予定情報受信済フラグ
     * @param receivedflg The value of the column 'RECEIVEDFLG'. (NullAllowed)
     */
    public void setReceivedflg(String receivedflg) {
        __modifiedProperties.add("receivedflg");
        this._receivedflg = receivedflg;
    }

    /**
     * [get] IFRECEIVEDFLG: {NotNull, char(1)} <br>
     * IFファイル受信済フラグ
     * @return The value of the column 'IFRECEIVEDFLG'. (NullAllowed)
     */
    public String getIfreceivedflg() {
        return _ifreceivedflg;
    }

    /**
     * [set] IFRECEIVEDFLG: {NotNull, char(1)} <br>
     * IFファイル受信済フラグ
     * @param ifreceivedflg The value of the column 'IFRECEIVEDFLG'. (NullAllowed)
     */
    public void setIfreceivedflg(String ifreceivedflg) {
        __modifiedProperties.add("ifreceivedflg");
        this._ifreceivedflg = ifreceivedflg;
    }

    /**
     * [get] SYMBOLNO: {bigint(19)} <br>
     * シンボル管理番号
     * @return The value of the column 'SYMBOLNO'. (NullAllowed)
     */
    public Long getSymbolno() {
        return _symbolno;
    }

    /**
     * [set] SYMBOLNO: {bigint(19)} <br>
     * シンボル管理番号
     * @param symbolno The value of the column 'SYMBOLNO'. (NullAllowed)
     */
    public void setSymbolno(Long symbolno) {
        __modifiedProperties.add("symbolno");
        this._symbolno = symbolno;
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
