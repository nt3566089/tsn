package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_BONDED_RECEIVE_RECORD_SEND as TABLE. <br>
 * 入庫実績送信テーブル（需給）
 * <pre>
 * [primary-key]
 *     BONDED_RECEIVE_RECORD_SEND_ID
 *
 * [column]
 *     BONDED_RECEIVE_RECORD_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, FROMSUB, SBWAREHOUSECD, REFNO, RECEIVE_PLAN_DT, CARRIERNO, WAREHOUSE_CD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, RECEIVEDQTY1_SUM, LOT2, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, OTHERLOT1, RECORD_TYPE, DOM_REFNO, JTTSFLG, SEQNO, TRANSPORT_TYPE, RECEIVEDATE, RECEIVEDATETIME, LOTNO, RECEIVEDQTY2_SUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_RECEIVE_RECORD_SEND_ID
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
public abstract class BsEBondedReceiveRecordSendDto implements Serializable {

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
    /** BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _bondedReceiveRecordSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _workFlg;

    /** CENTER_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** FROMSUB: {NotNull, char(1)} */
    @JsonKey
    protected String _fromsub;

    /** SBWAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _sbwarehousecd;

    /** REFNO: {varchar(255)} */
    @JsonKey
    protected String _refno;

    /** RECEIVE_PLAN_DT: {varchar(255)} */
    @JsonKey
    protected String _receivePlanDt;

    /** CARRIERNO: {varchar(255)} */
    @JsonKey
    protected String _carrierno;

    /** WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _warehouseCd;

    /** OTHERREFNO1: {varchar(255)} */
    @JsonKey
    protected String _otherrefno1;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** LOT3: {varchar(255)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(255)} */
    @JsonKey
    protected String _lot4;

    /** LOT1: {varchar(255)} */
    @JsonKey
    protected String _lot1;

    /** RECEIVEDQTY1_SUM: {varchar(255)} */
    @JsonKey
    protected String _receivedqty1Sum;

    /** LOT2: {varchar(255)} */
    @JsonKey
    protected String _lot2;

    /** CARRIERSNAME: {varchar(255)} */
    @JsonKey
    protected String _carriersname;

    /** CARRIERWBNO: {varchar(255)} */
    @JsonKey
    protected String _carrierwbno;

    /** FOREIGNCARGOFLG: {varchar(255)} */
    @JsonKey
    protected String _foreigncargoflg;

    /** OTHERLOT1: {varchar(255)} */
    @JsonKey
    protected String _otherlot1;

    /** RECORD_TYPE: {varchar(255)} */
    @JsonKey
    protected String _recordType;

    /** DOM_REFNO: {varchar(255)} */
    @JsonKey
    protected String _domRefno;

    /** JTTSFLG: {varchar(255)} */
    @JsonKey
    protected String _jttsflg;

    /** SEQNO: {varchar(255)} */
    @JsonKey
    protected String _seqno;

    /** TRANSPORT_TYPE: {varchar(255)} */
    @JsonKey
    protected String _transportType;

    /** RECEIVEDATE: {varchar(255)} */
    @JsonKey
    protected String _receivedate;

    /** RECEIVEDATETIME: {varchar(255)} */
    @JsonKey
    protected String _receivedatetime;

    /** LOTNO: {varchar(255)} */
    @JsonKey
    protected String _lotno;

    /** RECEIVEDQTY2_SUM: {varchar(255)} */
    @JsonKey
    protected String _receivedqty2Sum;

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
    public BsEBondedReceiveRecordSendDto() {
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
        if (other == null || !(other instanceof BsEBondedReceiveRecordSendDto)) { return false; }
        final BsEBondedReceiveRecordSendDto otherEntity = (BsEBondedReceiveRecordSendDto)other;
        if (!helpComparingValue(getBondedReceiveRecordSendId(), otherEntity.getBondedReceiveRecordSendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_BONDED_RECEIVE_RECORD_SEND");
        result = xCH(result, getBondedReceiveRecordSendId());
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
        sb.append(c).append(getBondedReceiveRecordSendId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getFromsub());
        sb.append(c).append(getSbwarehousecd());
        sb.append(c).append(getRefno());
        sb.append(c).append(getReceivePlanDt());
        sb.append(c).append(getCarrierno());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot1());
        sb.append(c).append(getReceivedqty1Sum());
        sb.append(c).append(getLot2());
        sb.append(c).append(getCarriersname());
        sb.append(c).append(getCarrierwbno());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getRecordType());
        sb.append(c).append(getDomRefno());
        sb.append(c).append(getJttsflg());
        sb.append(c).append(getSeqno());
        sb.append(c).append(getTransportType());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getReceivedatetime());
        sb.append(c).append(getLotno());
        sb.append(c).append(getReceivedqty2Sum());
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
     * [get] BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績送信テーブル（需給）ID
     * @return The value of the column 'BONDED_RECEIVE_RECORD_SEND_ID'. (NullAllowed)
     */
    public Long getBondedReceiveRecordSendId() {
        return _bondedReceiveRecordSendId;
    }

    /**
     * [set] BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績送信テーブル（需給）ID
     * @param bondedReceiveRecordSendId The value of the column 'BONDED_RECEIVE_RECORD_SEND_ID'. (NullAllowed)
     */
    public void setBondedReceiveRecordSendId(Long bondedReceiveRecordSendId) {
        __modifiedProperties.add("bondedReceiveRecordSendId");
        this._bondedReceiveRecordSendId = bondedReceiveRecordSendId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public Long getSendRowId() {
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public void setSendRowId(Long sendRowId) {
        __modifiedProperties.add("sendRowId");
        this._sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] FROMSUB: {NotNull, char(1)} <br>
     * 入庫経路区分
     * @return The value of the column 'FROMSUB'. (NullAllowed)
     */
    public String getFromsub() {
        return _fromsub;
    }

    /**
     * [set] FROMSUB: {NotNull, char(1)} <br>
     * 入庫経路区分
     * @param fromsub The value of the column 'FROMSUB'. (NullAllowed)
     */
    public void setFromsub(String fromsub) {
        __modifiedProperties.add("fromsub");
        this._fromsub = fromsub;
    }

    /**
     * [get] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public String getSbwarehousecd() {
        return _sbwarehousecd;
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        __modifiedProperties.add("sbwarehousecd");
        this._sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] REFNO: {varchar(255)} <br>
     * 整理番号
     * @return The value of the column 'REFNO'. (NullAllowed)
     */
    public String getRefno() {
        return _refno;
    }

    /**
     * [set] REFNO: {varchar(255)} <br>
     * 整理番号
     * @param refno The value of the column 'REFNO'. (NullAllowed)
     */
    public void setRefno(String refno) {
        __modifiedProperties.add("refno");
        this._refno = refno;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public String getReceivePlanDt() {
        return _receivePlanDt;
    }

    /**
     * [set] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        __modifiedProperties.add("receivePlanDt");
        this._receivePlanDt = receivePlanDt;
    }

    /**
     * [get] CARRIERNO: {varchar(255)} <br>
     * コンテナNo
     * @return The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public String getCarrierno() {
        return _carrierno;
    }

    /**
     * [set] CARRIERNO: {varchar(255)} <br>
     * コンテナNo
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public void setCarrierno(String carrierno) {
        __modifiedProperties.add("carrierno");
        this._carrierno = carrierno;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(255)} <br>
     * 製造年月
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(255)} <br>
     * 製造年月
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] RECEIVEDQTY1_SUM: {varchar(255)} <br>
     * 個数
     * @return The value of the column 'RECEIVEDQTY1_SUM'. (NullAllowed)
     */
    public String getReceivedqty1Sum() {
        return _receivedqty1Sum;
    }

    /**
     * [set] RECEIVEDQTY1_SUM: {varchar(255)} <br>
     * 個数
     * @param receivedqty1Sum The value of the column 'RECEIVEDQTY1_SUM'. (NullAllowed)
     */
    public void setReceivedqty1Sum(String receivedqty1Sum) {
        __modifiedProperties.add("receivedqty1Sum");
        this._receivedqty1Sum = receivedqty1Sum;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] CARRIERSNAME: {varchar(255)} <br>
     * SRC_CD
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public String getCarriersname() {
        return _carriersname;
    }

    /**
     * [set] CARRIERSNAME: {varchar(255)} <br>
     * SRC_CD
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public void setCarriersname(String carriersname) {
        __modifiedProperties.add("carriersname");
        this._carriersname = carriersname;
    }

    /**
     * [get] CARRIERWBNO: {varchar(255)} <br>
     * オーダーNo
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public String getCarrierwbno() {
        return _carrierwbno;
    }

    /**
     * [set] CARRIERWBNO: {varchar(255)} <br>
     * オーダーNo
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public void setCarrierwbno(String carrierwbno) {
        __modifiedProperties.add("carrierwbno");
        this._carrierwbno = carrierwbno;
    }

    /**
     * [get] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public String getForeigncargoflg() {
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        __modifiedProperties.add("foreigncargoflg");
        this._foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] OTHERLOT1: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public String getOtherlot1() {
        return _otherlot1;
    }

    /**
     * [set] OTHERLOT1: {varchar(255)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public void setOtherlot1(String otherlot1) {
        __modifiedProperties.add("otherlot1");
        this._otherlot1 = otherlot1;
    }

    /**
     * [get] RECORD_TYPE: {varchar(255)} <br>
     * レコード区分
     * @return The value of the column 'RECORD_TYPE'. (NullAllowed)
     */
    public String getRecordType() {
        return _recordType;
    }

    /**
     * [set] RECORD_TYPE: {varchar(255)} <br>
     * レコード区分
     * @param recordType The value of the column 'RECORD_TYPE'. (NullAllowed)
     */
    public void setRecordType(String recordType) {
        __modifiedProperties.add("recordType");
        this._recordType = recordType;
    }

    /**
     * [get] DOM_REFNO: {varchar(255)} <br>
     * 国産用整理番号
     * @return The value of the column 'DOM_REFNO'. (NullAllowed)
     */
    public String getDomRefno() {
        return _domRefno;
    }

    /**
     * [set] DOM_REFNO: {varchar(255)} <br>
     * 国産用整理番号
     * @param domRefno The value of the column 'DOM_REFNO'. (NullAllowed)
     */
    public void setDomRefno(String domRefno) {
        __modifiedProperties.add("domRefno");
        this._domRefno = domRefno;
    }

    /**
     * [get] JTTSFLG: {varchar(255)} <br>
     * JT/TS区分
     * @return The value of the column 'JTTSFLG'. (NullAllowed)
     */
    public String getJttsflg() {
        return _jttsflg;
    }

    /**
     * [set] JTTSFLG: {varchar(255)} <br>
     * JT/TS区分
     * @param jttsflg The value of the column 'JTTSFLG'. (NullAllowed)
     */
    public void setJttsflg(String jttsflg) {
        __modifiedProperties.add("jttsflg");
        this._jttsflg = jttsflg;
    }

    /**
     * [get] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed)
     */
    public String getSeqno() {
        return _seqno;
    }

    /**
     * [set] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed)
     */
    public void setSeqno(String seqno) {
        __modifiedProperties.add("seqno");
        this._seqno = seqno;
    }

    /**
     * [get] TRANSPORT_TYPE: {varchar(255)} <br>
     * 輸送種別
     * @return The value of the column 'TRANSPORT_TYPE'. (NullAllowed)
     */
    public String getTransportType() {
        return _transportType;
    }

    /**
     * [set] TRANSPORT_TYPE: {varchar(255)} <br>
     * 輸送種別
     * @param transportType The value of the column 'TRANSPORT_TYPE'. (NullAllowed)
     */
    public void setTransportType(String transportType) {
        __modifiedProperties.add("transportType");
        this._transportType = transportType;
    }

    /**
     * [get] RECEIVEDATE: {varchar(255)} <br>
     * 入庫登録年月日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] RECEIVEDATE: {varchar(255)} <br>
     * 入庫登録年月日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] RECEIVEDATETIME: {varchar(255)} <br>
     * 入庫登録時刻
     * @return The value of the column 'RECEIVEDATETIME'. (NullAllowed)
     */
    public String getReceivedatetime() {
        return _receivedatetime;
    }

    /**
     * [set] RECEIVEDATETIME: {varchar(255)} <br>
     * 入庫登録時刻
     * @param receivedatetime The value of the column 'RECEIVEDATETIME'. (NullAllowed)
     */
    public void setReceivedatetime(String receivedatetime) {
        __modifiedProperties.add("receivedatetime");
        this._receivedatetime = receivedatetime;
    }

    /**
     * [get] LOTNO: {varchar(255)} <br>
     * ロット番号
     * @return The value of the column 'LOTNO'. (NullAllowed)
     */
    public String getLotno() {
        return _lotno;
    }

    /**
     * [set] LOTNO: {varchar(255)} <br>
     * ロット番号
     * @param lotno The value of the column 'LOTNO'. (NullAllowed)
     */
    public void setLotno(String lotno) {
        __modifiedProperties.add("lotno");
        this._lotno = lotno;
    }

    /**
     * [get] RECEIVEDQTY2_SUM: {varchar(255)} <br>
     * 数量
     * @return The value of the column 'RECEIVEDQTY2_SUM'. (NullAllowed)
     */
    public String getReceivedqty2Sum() {
        return _receivedqty2Sum;
    }

    /**
     * [set] RECEIVEDQTY2_SUM: {varchar(255)} <br>
     * 数量
     * @param receivedqty2Sum The value of the column 'RECEIVEDQTY2_SUM'. (NullAllowed)
     */
    public void setReceivedqty2Sum(String receivedqty2Sum) {
        __modifiedProperties.add("receivedqty2Sum");
        this._receivedqty2Sum = receivedqty2Sum;
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
