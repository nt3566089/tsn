package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_RETURNED_EXCHANGE as TABLE. <br>
 * 返品取替品実績送信テーブル
 * <pre>
 * [primary-key]
 *     RETURNED_EXCHANGE_ID
 *
 * [column]
 *     RETURNED_EXCHANGE_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, RCVTYPE, SYHN_KBN, RECORD_TYPE, SUPPLIERRCVNO, SEQNO, WORK_TYPE, OTHERREFNO1, RMANO, OTHERREFNO3, SUPPLIERCD, FROMADDRESS2, FROMADDRESS1, IFITEMCD, RECEIVEDQTY1, PRICE_WHOLESALE, LOT2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETURNED_EXCHANGE_ID
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
public abstract class BsEReturnedExchangeDto implements Serializable {

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
    /** RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _returnedExchangeId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _workFlg;

    /** CENTER_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** RCVTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _rcvtype;

    /** SYHN_KBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _syhnKbn;

    /** RECORD_TYPE: {varchar(255)} */
    @JsonKey
    protected String _recordType;

    /** SUPPLIERRCVNO: {varchar(255)} */
    @JsonKey
    protected String _supplierrcvno;

    /** SEQNO: {varchar(255)} */
    @JsonKey
    protected String _seqno;

    /** WORK_TYPE: {varchar(255)} */
    @JsonKey
    protected String _workType;

    /** OTHERREFNO1: {varchar(255)} */
    @JsonKey
    protected String _otherrefno1;

    /** RMANO: {varchar(255)} */
    @JsonKey
    protected String _rmano;

    /** OTHERREFNO3: {varchar(255)} */
    @JsonKey
    protected String _otherrefno3;

    /** SUPPLIERCD: {varchar(255)} */
    @JsonKey
    protected String _suppliercd;

    /** FROMADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _fromaddress2;

    /** FROMADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _fromaddress1;

    /** IFITEMCD: {varchar(255)} */
    @JsonKey
    protected String _ifitemcd;

    /** RECEIVEDQTY1: {varchar(255)} */
    @JsonKey
    protected String _receivedqty1;

    /** PRICE_WHOLESALE: {varchar(255)} */
    @JsonKey
    protected String _priceWholesale;

    /** LOT2: {varchar(255)} */
    @JsonKey
    protected String _lot2;

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
    public BsEReturnedExchangeDto() {
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
        if (other == null || !(other instanceof BsEReturnedExchangeDto)) { return false; }
        final BsEReturnedExchangeDto otherEntity = (BsEReturnedExchangeDto)other;
        if (!helpComparingValue(getReturnedExchangeId(), otherEntity.getReturnedExchangeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_RETURNED_EXCHANGE");
        result = xCH(result, getReturnedExchangeId());
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
        sb.append(c).append(getReturnedExchangeId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getRcvtype());
        sb.append(c).append(getSyhnKbn());
        sb.append(c).append(getRecordType());
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getSeqno());
        sb.append(c).append(getWorkType());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getRmano());
        sb.append(c).append(getOtherrefno3());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getFromaddress2());
        sb.append(c).append(getFromaddress1());
        sb.append(c).append(getIfitemcd());
        sb.append(c).append(getReceivedqty1());
        sb.append(c).append(getPriceWholesale());
        sb.append(c).append(getLot2());
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
     * [get] RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品取替品実績送信ID
     * @return The value of the column 'RETURNED_EXCHANGE_ID'. (NullAllowed)
     */
    public Long getReturnedExchangeId() {
        return _returnedExchangeId;
    }

    /**
     * [set] RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品取替品実績送信ID
     * @param returnedExchangeId The value of the column 'RETURNED_EXCHANGE_ID'. (NullAllowed)
     */
    public void setReturnedExchangeId(Long returnedExchangeId) {
        __modifiedProperties.add("returnedExchangeId");
        this._returnedExchangeId = returnedExchangeId;
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
     * [get] WORK_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[(0)]} <br>
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
     * [get] RCVTYPE: {NotNull, varchar(30)} <br>
     * 返品/取替区分(返品、取替)
     * @return The value of the column 'RCVTYPE'. (NullAllowed)
     */
    public String getRcvtype() {
        return _rcvtype;
    }

    /**
     * [set] RCVTYPE: {NotNull, varchar(30)} <br>
     * 返品/取替区分(返品、取替)
     * @param rcvtype The value of the column 'RCVTYPE'. (NullAllowed)
     */
    public void setRcvtype(String rcvtype) {
        __modifiedProperties.add("rcvtype");
        this._rcvtype = rcvtype;
    }

    /**
     * [get] SYHN_KBN: {NotNull, varchar(30)} <br>
     * 銘柄区分
     * @return The value of the column 'SYHN_KBN'. (NullAllowed)
     */
    public String getSyhnKbn() {
        return _syhnKbn;
    }

    /**
     * [set] SYHN_KBN: {NotNull, varchar(30)} <br>
     * 銘柄区分
     * @param syhnKbn The value of the column 'SYHN_KBN'. (NullAllowed)
     */
    public void setSyhnKbn(String syhnKbn) {
        __modifiedProperties.add("syhnKbn");
        this._syhnKbn = syhnKbn;
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
     * [get] SUPPLIERRCVNO: {varchar(255)} <br>
     * 伝票番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public String getSupplierrcvno() {
        return _supplierrcvno;
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(255)} <br>
     * 伝票番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        __modifiedProperties.add("supplierrcvno");
        this._supplierrcvno = supplierrcvno;
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
     * [get] WORK_TYPE: {varchar(255)} <br>
     * 処理区分
     * @return The value of the column 'WORK_TYPE'. (NullAllowed)
     */
    public String getWorkType() {
        return _workType;
    }

    /**
     * [set] WORK_TYPE: {varchar(255)} <br>
     * 処理区分
     * @param workType The value of the column 'WORK_TYPE'. (NullAllowed)
     */
    public void setWorkType(String workType) {
        __modifiedProperties.add("workType");
        this._workType = workType;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * お得意様CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
    }

    /**
     * [get] RMANO: {varchar(255)} <br>
     * 販売年月日
     * @return The value of the column 'RMANO'. (NullAllowed)
     */
    public String getRmano() {
        return _rmano;
    }

    /**
     * [set] RMANO: {varchar(255)} <br>
     * 販売年月日
     * @param rmano The value of the column 'RMANO'. (NullAllowed)
     */
    public void setRmano(String rmano) {
        __modifiedProperties.add("rmano");
        this._rmano = rmano;
    }

    /**
     * [get] OTHERREFNO3: {varchar(255)} <br>
     * 返品区分
     * @return The value of the column 'OTHERREFNO3'. (NullAllowed)
     */
    public String getOtherrefno3() {
        return _otherrefno3;
    }

    /**
     * [set] OTHERREFNO3: {varchar(255)} <br>
     * 返品区分
     * @param otherrefno3 The value of the column 'OTHERREFNO3'. (NullAllowed)
     */
    public void setOtherrefno3(String otherrefno3) {
        __modifiedProperties.add("otherrefno3");
        this._otherrefno3 = otherrefno3;
    }

    /**
     * [get] SUPPLIERCD: {varchar(255)} <br>
     * 配達拠点CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public String getSuppliercd() {
        return _suppliercd;
    }

    /**
     * [set] SUPPLIERCD: {varchar(255)} <br>
     * 配達拠点CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public void setSuppliercd(String suppliercd) {
        __modifiedProperties.add("suppliercd");
        this._suppliercd = suppliercd;
    }

    /**
     * [get] FROMADDRESS2: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'FROMADDRESS2'. (NullAllowed)
     */
    public String getFromaddress2() {
        return _fromaddress2;
    }

    /**
     * [set] FROMADDRESS2: {varchar(255)} <br>
     * 方面CD
     * @param fromaddress2 The value of the column 'FROMADDRESS2'. (NullAllowed)
     */
    public void setFromaddress2(String fromaddress2) {
        __modifiedProperties.add("fromaddress2");
        this._fromaddress2 = fromaddress2;
    }

    /**
     * [get] FROMADDRESS1: {varchar(255)} <br>
     * 内外
     * @return The value of the column 'FROMADDRESS1'. (NullAllowed)
     */
    public String getFromaddress1() {
        return _fromaddress1;
    }

    /**
     * [set] FROMADDRESS1: {varchar(255)} <br>
     * 内外
     * @param fromaddress1 The value of the column 'FROMADDRESS1'. (NullAllowed)
     */
    public void setFromaddress1(String fromaddress1) {
        __modifiedProperties.add("fromaddress1");
        this._fromaddress1 = fromaddress1;
    }

    /**
     * [get] IFITEMCD: {varchar(255)} <br>
     * 銘柄CD(実績)
     * @return The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public String getIfitemcd() {
        return _ifitemcd;
    }

    /**
     * [set] IFITEMCD: {varchar(255)} <br>
     * 銘柄CD(実績)
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public void setIfitemcd(String ifitemcd) {
        __modifiedProperties.add("ifitemcd");
        this._ifitemcd = ifitemcd;
    }

    /**
     * [get] RECEIVEDQTY1: {varchar(255)} <br>
     * 入庫実績数(個装換算)
     * @return The value of the column 'RECEIVEDQTY1'. (NullAllowed)
     */
    public String getReceivedqty1() {
        return _receivedqty1;
    }

    /**
     * [set] RECEIVEDQTY1: {varchar(255)} <br>
     * 入庫実績数(個装換算)
     * @param receivedqty1 The value of the column 'RECEIVEDQTY1'. (NullAllowed)
     */
    public void setReceivedqty1(String receivedqty1) {
        __modifiedProperties.add("receivedqty1");
        this._receivedqty1 = receivedqty1;
    }

    /**
     * [get] PRICE_WHOLESALE: {varchar(255)} <br>
     * 不足本数(実績)
     * @return The value of the column 'PRICE_WHOLESALE'. (NullAllowed)
     */
    public String getPriceWholesale() {
        return _priceWholesale;
    }

    /**
     * [set] PRICE_WHOLESALE: {varchar(255)} <br>
     * 不足本数(実績)
     * @param priceWholesale The value of the column 'PRICE_WHOLESALE'. (NullAllowed)
     */
    public void setPriceWholesale(String priceWholesale) {
        __modifiedProperties.add("priceWholesale");
        this._priceWholesale = priceWholesale;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * 状態CD(実績)
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * 状態CD(実績)
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
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
