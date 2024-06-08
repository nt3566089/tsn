package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_BONDED_WMS_RECEIVE_PLAN as TABLE. <br>
 * 入庫予定データ受信テーブル
 * <pre>
 * [primary-key]
 *     BONDED_WMS_RECEIVE_PLAN_ID
 *
 * [column]
 *     BONDED_WMS_RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, NOTES, SBWAREHOUSECD, SUPPLIERRCVNO, RCVSCHDATE, CARRIERNO, SHIPTOCD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, EXPECTQTY1, FROMFAX, BATJMFYM, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, BL_NO, CARRIERNAME, FROMEMAIL, ARRIVALPORTDATE, SHIPNAME, BATDELINO, BATDELIDETAILNO, BATWAREHOUSECD, BATKEEPWAREHOUSECD, BATPARTNERNORCV, BATPARTNERNOSND, BATDELIDETAILNUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_WMS_RECEIVE_PLAN_ID
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
public abstract class BsEBondedWmsReceivePlanDto implements Serializable {

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
    /** BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _bondedWmsReceivePlanId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** SBWAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _sbwarehousecd;

    /** SUPPLIERRCVNO: {varchar(255)} */
    @JsonKey
    protected String _supplierrcvno;

    /** RCVSCHDATE: {varchar(255)} */
    @JsonKey
    protected String _rcvschdate;

    /** CARRIERNO: {varchar(255)} */
    @JsonKey
    protected String _carrierno;

    /** SHIPTOCD: {varchar(255)} */
    @JsonKey
    protected String _shiptocd;

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

    /** EXPECTQTY1: {varchar(255)} */
    @JsonKey
    protected String _expectqty1;

    /** FROMFAX: {varchar(255)} */
    @JsonKey
    protected String _fromfax;

    /** BATJMFYM: {varchar(255)} */
    @JsonKey
    protected String _batjmfym;

    /** CARRIERSNAME: {varchar(255)} */
    @JsonKey
    protected String _carriersname;

    /** CARRIERWBNO: {varchar(255)} */
    @JsonKey
    protected String _carrierwbno;

    /** FOREIGNCARGOFLG: {varchar(255)} */
    @JsonKey
    protected String _foreigncargoflg;

    /** BL_NO: {varchar(255)} */
    @JsonKey
    protected String _blNo;

    /** CARRIERNAME: {varchar(255)} */
    @JsonKey
    protected String _carriername;

    /** FROMEMAIL: {varchar(255)} */
    @JsonKey
    protected String _fromemail;

    /** ARRIVALPORTDATE: {varchar(255)} */
    @JsonKey
    protected String _arrivalportdate;

    /** SHIPNAME: {varchar(255)} */
    @JsonKey
    protected String _shipname;

    /** BATDELINO: {varchar(255)} */
    @JsonKey
    protected String _batdelino;

    /** BATDELIDETAILNO: {varchar(255)} */
    @JsonKey
    protected String _batdelidetailno;

    /** BATWAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _batwarehousecd;

    /** BATKEEPWAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _batkeepwarehousecd;

    /** BATPARTNERNORCV: {varchar(255)} */
    @JsonKey
    protected String _batpartnernorcv;

    /** BATPARTNERNOSND: {varchar(255)} */
    @JsonKey
    protected String _batpartnernosnd;

    /** BATDELIDETAILNUM: {varchar(255)} */
    @JsonKey
    protected String _batdelidetailnum;

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
    public BsEBondedWmsReceivePlanDto() {
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
        if (other == null || !(other instanceof BsEBondedWmsReceivePlanDto)) { return false; }
        final BsEBondedWmsReceivePlanDto otherEntity = (BsEBondedWmsReceivePlanDto)other;
        if (!helpComparingValue(getBondedWmsReceivePlanId(), otherEntity.getBondedWmsReceivePlanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_BONDED_WMS_RECEIVE_PLAN");
        result = xCH(result, getBondedWmsReceivePlanId());
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
        sb.append(c).append(getBondedWmsReceivePlanId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getNotes());
        sb.append(c).append(getSbwarehousecd());
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getRcvschdate());
        sb.append(c).append(getCarrierno());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot1());
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getFromfax());
        sb.append(c).append(getBatjmfym());
        sb.append(c).append(getCarriersname());
        sb.append(c).append(getCarrierwbno());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getBlNo());
        sb.append(c).append(getCarriername());
        sb.append(c).append(getFromemail());
        sb.append(c).append(getArrivalportdate());
        sb.append(c).append(getShipname());
        sb.append(c).append(getBatdelino());
        sb.append(c).append(getBatdelidetailno());
        sb.append(c).append(getBatwarehousecd());
        sb.append(c).append(getBatkeepwarehousecd());
        sb.append(c).append(getBatpartnernorcv());
        sb.append(c).append(getBatpartnernosnd());
        sb.append(c).append(getBatdelidetailnum());
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
     * [get] BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫予定データ受信ID
     * @return The value of the column 'BONDED_WMS_RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public Long getBondedWmsReceivePlanId() {
        return _bondedWmsReceivePlanId;
    }

    /**
     * [set] BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫予定データ受信ID
     * @param bondedWmsReceivePlanId The value of the column 'BONDED_WMS_RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public void setBondedWmsReceivePlanId(Long bondedWmsReceivePlanId) {
        __modifiedProperties.add("bondedWmsReceivePlanId");
        this._bondedWmsReceivePlanId = bondedWmsReceivePlanId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 入庫予定拡張管理番号
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 入庫予定拡張管理番号
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫コード
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public String getSbwarehousecd() {
        return _sbwarehousecd;
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫コード
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        __modifiedProperties.add("sbwarehousecd");
        this._sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public String getSupplierrcvno() {
        return _supplierrcvno;
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        __modifiedProperties.add("supplierrcvno");
        this._supplierrcvno = supplierrcvno;
    }

    /**
     * [get] RCVSCHDATE: {varchar(255)} <br>
     * 受入予定年月日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public String getRcvschdate() {
        return _rcvschdate;
    }

    /**
     * [set] RCVSCHDATE: {varchar(255)} <br>
     * 受入予定年月日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public void setRcvschdate(String rcvschdate) {
        __modifiedProperties.add("rcvschdate");
        this._rcvschdate = rcvschdate;
    }

    /**
     * [get] CARRIERNO: {varchar(255)} <br>
     * コンテナNO
     * @return The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public String getCarrierno() {
        return _carrierno;
    }

    /**
     * [set] CARRIERNO: {varchar(255)} <br>
     * コンテナNO
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public void setCarrierno(String carrierno) {
        __modifiedProperties.add("carrierno");
        this._carrierno = carrierno;
    }

    /**
     * [get] SHIPTOCD: {varchar(255)} <br>
     * 受地コード
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {varchar(255)} <br>
     * 受地コード
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者コード
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者コード
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
     * [get] EXPECTQTY1: {varchar(255)} <br>
     * 個数（個装）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public String getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {varchar(255)} <br>
     * 個数（個装）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(String expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] FROMFAX: {varchar(255)} <br>
     * ラインNO
     * @return The value of the column 'FROMFAX'. (NullAllowed)
     */
    public String getFromfax() {
        return _fromfax;
    }

    /**
     * [set] FROMFAX: {varchar(255)} <br>
     * ラインNO
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed)
     */
    public void setFromfax(String fromfax) {
        __modifiedProperties.add("fromfax");
        this._fromfax = fromfax;
    }

    /**
     * [get] BATJMFYM: {varchar(255)} <br>
     * BATJ製造月記号
     * @return The value of the column 'BATJMFYM'. (NullAllowed)
     */
    public String getBatjmfym() {
        return _batjmfym;
    }

    /**
     * [set] BATJMFYM: {varchar(255)} <br>
     * BATJ製造月記号
     * @param batjmfym The value of the column 'BATJMFYM'. (NullAllowed)
     */
    public void setBatjmfym(String batjmfym) {
        __modifiedProperties.add("batjmfym");
        this._batjmfym = batjmfym;
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
     * OrderNO
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public String getCarrierwbno() {
        return _carrierwbno;
    }

    /**
     * [set] CARRIERWBNO: {varchar(255)} <br>
     * OrderNO
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public void setCarrierwbno(String carrierwbno) {
        __modifiedProperties.add("carrierwbno");
        this._carrierwbno = carrierwbno;
    }

    /**
     * [get] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 入庫時内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public String getForeigncargoflg() {
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 入庫時内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        __modifiedProperties.add("foreigncargoflg");
        this._foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] BL_NO: {varchar(255)} <br>
     * BL_NO
     * @return The value of the column 'BL_NO'. (NullAllowed)
     */
    public String getBlNo() {
        return _blNo;
    }

    /**
     * [set] BL_NO: {varchar(255)} <br>
     * BL_NO
     * @param blNo The value of the column 'BL_NO'. (NullAllowed)
     */
    public void setBlNo(String blNo) {
        __modifiedProperties.add("blNo");
        this._blNo = blNo;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * 連携項目
     * @return The value of the column 'CARRIERNAME'. (NullAllowed)
     */
    public String getCarriername() {
        return _carriername;
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * 連携項目
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed)
     */
    public void setCarriername(String carriername) {
        __modifiedProperties.add("carriername");
        this._carriername = carriername;
    }

    /**
     * [get] FROMEMAIL: {varchar(255)} <br>
     * 依頼番号
     * @return The value of the column 'FROMEMAIL'. (NullAllowed)
     */
    public String getFromemail() {
        return _fromemail;
    }

    /**
     * [set] FROMEMAIL: {varchar(255)} <br>
     * 依頼番号
     * @param fromemail The value of the column 'FROMEMAIL'. (NullAllowed)
     */
    public void setFromemail(String fromemail) {
        __modifiedProperties.add("fromemail");
        this._fromemail = fromemail;
    }

    /**
     * [get] ARRIVALPORTDATE: {varchar(255)} <br>
     * 入港日
     * @return The value of the column 'ARRIVALPORTDATE'. (NullAllowed)
     */
    public String getArrivalportdate() {
        return _arrivalportdate;
    }

    /**
     * [set] ARRIVALPORTDATE: {varchar(255)} <br>
     * 入港日
     * @param arrivalportdate The value of the column 'ARRIVALPORTDATE'. (NullAllowed)
     */
    public void setArrivalportdate(String arrivalportdate) {
        __modifiedProperties.add("arrivalportdate");
        this._arrivalportdate = arrivalportdate;
    }

    /**
     * [get] SHIPNAME: {varchar(255)} <br>
     * 船名
     * @return The value of the column 'SHIPNAME'. (NullAllowed)
     */
    public String getShipname() {
        return _shipname;
    }

    /**
     * [set] SHIPNAME: {varchar(255)} <br>
     * 船名
     * @param shipname The value of the column 'SHIPNAME'. (NullAllowed)
     */
    public void setShipname(String shipname) {
        __modifiedProperties.add("shipname");
        this._shipname = shipname;
    }

    /**
     * [get] BATDELINO: {varchar(255)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @return The value of the column 'BATDELINO'. (NullAllowed)
     */
    public String getBatdelino() {
        return _batdelino;
    }

    /**
     * [set] BATDELINO: {varchar(255)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @param batdelino The value of the column 'BATDELINO'. (NullAllowed)
     */
    public void setBatdelino(String batdelino) {
        __modifiedProperties.add("batdelino");
        this._batdelino = batdelino;
    }

    /**
     * [get] BATDELIDETAILNO: {varchar(255)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @return The value of the column 'BATDELIDETAILNO'. (NullAllowed)
     */
    public String getBatdelidetailno() {
        return _batdelidetailno;
    }

    /**
     * [set] BATDELIDETAILNO: {varchar(255)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @param batdelidetailno The value of the column 'BATDELIDETAILNO'. (NullAllowed)
     */
    public void setBatdelidetailno(String batdelidetailno) {
        __modifiedProperties.add("batdelidetailno");
        this._batdelidetailno = batdelidetailno;
    }

    /**
     * [get] BATWAREHOUSECD: {varchar(255)} <br>
     * ＢＡＴ搬入依頼拠点コード
     * @return The value of the column 'BATWAREHOUSECD'. (NullAllowed)
     */
    public String getBatwarehousecd() {
        return _batwarehousecd;
    }

    /**
     * [set] BATWAREHOUSECD: {varchar(255)} <br>
     * ＢＡＴ搬入依頼拠点コード
     * @param batwarehousecd The value of the column 'BATWAREHOUSECD'. (NullAllowed)
     */
    public void setBatwarehousecd(String batwarehousecd) {
        __modifiedProperties.add("batwarehousecd");
        this._batwarehousecd = batwarehousecd;
    }

    /**
     * [get] BATKEEPWAREHOUSECD: {varchar(255)} <br>
     * ＢＡＴ搬入依頼保管場所コード
     * @return The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed)
     */
    public String getBatkeepwarehousecd() {
        return _batkeepwarehousecd;
    }

    /**
     * [set] BATKEEPWAREHOUSECD: {varchar(255)} <br>
     * ＢＡＴ搬入依頼保管場所コード
     * @param batkeepwarehousecd The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed)
     */
    public void setBatkeepwarehousecd(String batkeepwarehousecd) {
        __modifiedProperties.add("batkeepwarehousecd");
        this._batkeepwarehousecd = batkeepwarehousecd;
    }

    /**
     * [get] BATPARTNERNORCV: {varchar(255)} <br>
     * パートナー番号（受信）
     * @return The value of the column 'BATPARTNERNORCV'. (NullAllowed)
     */
    public String getBatpartnernorcv() {
        return _batpartnernorcv;
    }

    /**
     * [set] BATPARTNERNORCV: {varchar(255)} <br>
     * パートナー番号（受信）
     * @param batpartnernorcv The value of the column 'BATPARTNERNORCV'. (NullAllowed)
     */
    public void setBatpartnernorcv(String batpartnernorcv) {
        __modifiedProperties.add("batpartnernorcv");
        this._batpartnernorcv = batpartnernorcv;
    }

    /**
     * [get] BATPARTNERNOSND: {varchar(255)} <br>
     * パートナー番号（送信）
     * @return The value of the column 'BATPARTNERNOSND'. (NullAllowed)
     */
    public String getBatpartnernosnd() {
        return _batpartnernosnd;
    }

    /**
     * [set] BATPARTNERNOSND: {varchar(255)} <br>
     * パートナー番号（送信）
     * @param batpartnernosnd The value of the column 'BATPARTNERNOSND'. (NullAllowed)
     */
    public void setBatpartnernosnd(String batpartnernosnd) {
        __modifiedProperties.add("batpartnernosnd");
        this._batpartnernosnd = batpartnernosnd;
    }

    /**
     * [get] BATDELIDETAILNUM: {varchar(255)} <br>
     * 伝票番号
     * @return The value of the column 'BATDELIDETAILNUM'. (NullAllowed)
     */
    public String getBatdelidetailnum() {
        return _batdelidetailnum;
    }

    /**
     * [set] BATDELIDETAILNUM: {varchar(255)} <br>
     * 伝票番号
     * @param batdelidetailnum The value of the column 'BATDELIDETAILNUM'. (NullAllowed)
     */
    public void setBatdelidetailnum(String batdelidetailnum) {
        __modifiedProperties.add("batdelidetailnum");
        this._batdelidetailnum = batdelidetailnum;
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
