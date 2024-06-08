package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRRCVEXTEND as TABLE. <br>
 * 入庫予定拡張情報
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, SBWAREHOUSECD, IINO, RCVSCHDATE, CARRIERNO, WAREHOUSECD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, LOT2, EXPECTQTY1, FROMFAX, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, FROMREFNAME, CARRIERNAME, CUSTORDERNO, ARRIVALPORTDATE, SHIPNAME, BATDELINO, BATDELIDETAILNO, BATWAREHOUSECD, BATKEEPWAREHOUSECD, BATPARTNERNORCV, BATPARTNERNOSND, BATDELIDETAILNUM, BATNO, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_TRRCV
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tTrrcv
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrrcvextendDto implements Serializable {

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
    /** RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV} */
    @JsonKey
    protected Long _receivePlanHId;

    /** SBWAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _sbwarehousecd;

    /** IINO: {varchar(30)} */
    @JsonKey
    protected String _iino;

    /** RCVSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _rcvschdate;

    /** CARRIERNO: {varchar(60)} */
    @JsonKey
    protected String _carrierno;

    /** WAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** OTHERREFNO1: {varchar(60)} */
    @JsonKey
    protected String _otherrefno1;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** EXPECTQTY1: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _expectqty1;

    /** FROMFAX: {varchar(60)} */
    @JsonKey
    protected String _fromfax;

    /** CARRIERSNAME: {varchar(100)} */
    @JsonKey
    protected String _carriersname;

    /** CARRIERWBNO: {varchar(60)} */
    @JsonKey
    protected String _carrierwbno;

    /** FOREIGNCARGOFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _foreigncargoflg;

    /** FROMREFNAME: {varchar(60)} */
    @JsonKey
    protected String _fromrefname;

    /** CARRIERNAME: {varchar(255)} */
    @JsonKey
    protected String _carriername;

    /** CUSTORDERNO: {varchar(60)} */
    @JsonKey
    protected String _custorderno;

    /** ARRIVALPORTDATE: {varchar(8)} */
    @JsonKey
    protected String _arrivalportdate;

    /** SHIPNAME: {varchar(100)} */
    @JsonKey
    protected String _shipname;

    /** BATDELINO: {varchar(30)} */
    @JsonKey
    protected String _batdelino;

    /** BATDELIDETAILNO: {bigint(19)} */
    @JsonKey
    protected Long _batdelidetailno;

    /** BATWAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _batwarehousecd;

    /** BATKEEPWAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _batkeepwarehousecd;

    /** BATPARTNERNORCV: {varchar(30)} */
    @JsonKey
    protected String _batpartnernorcv;

    /** BATPARTNERNOSND: {varchar(30)} */
    @JsonKey
    protected String _batpartnernosnd;

    /** BATDELIDETAILNUM: {bigint(19)} */
    @JsonKey
    protected Long _batdelidetailnum;

    /** BATNO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _batno;

    /** VA_EXTDATA1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata3;

    /** NV_EXTDATA1: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata1;

    /** NV_EXTDATA2: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata2;

    /** NV_EXTDATA3: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata3;

    /** NM_EXTDATA1: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata1;

    /** NM_EXTDATA2: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata2;

    /** NM_EXTDATA3: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata3;

    /** DT_EXTDATA1: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata2;

    /** DT_EXTDATA3: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata3;

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
    public BsTTrrcvextendDto() {
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
    protected TTrrcvDto _tTrrcv;

    public TTrrcvDto getTTrrcv() {
        return _tTrrcv;
    }

    public void setTTrrcv(TTrrcvDto tTrrcv) {
        this._tTrrcv = tTrrcv;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrrcvextendDto)) { return false; }
        final BsTTrrcvextendDto otherEntity = (BsTTrrcvextendDto)other;
        if (!helpComparingValue(getReceivePlanHId(), otherEntity.getReceivePlanHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRRCVEXTEND");
        result = xCH(result, getReceivePlanHId());
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
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getSbwarehousecd());
        sb.append(c).append(getIino());
        sb.append(c).append(getRcvschdate());
        sb.append(c).append(getCarrierno());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getFromfax());
        sb.append(c).append(getCarriersname());
        sb.append(c).append(getCarrierwbno());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getFromrefname());
        sb.append(c).append(getCarriername());
        sb.append(c).append(getCustorderno());
        sb.append(c).append(getArrivalportdate());
        sb.append(c).append(getShipname());
        sb.append(c).append(getBatdelino());
        sb.append(c).append(getBatdelidetailno());
        sb.append(c).append(getBatwarehousecd());
        sb.append(c).append(getBatkeepwarehousecd());
        sb.append(c).append(getBatpartnernorcv());
        sb.append(c).append(getBatpartnernosnd());
        sb.append(c).append(getBatdelidetailnum());
        sb.append(c).append(getBatno());
        sb.append(c).append(getVaExtdata1());
        sb.append(c).append(getVaExtdata2());
        sb.append(c).append(getVaExtdata3());
        sb.append(c).append(getNvExtdata1());
        sb.append(c).append(getNvExtdata2());
        sb.append(c).append(getNvExtdata3());
        sb.append(c).append(getNmExtdata1());
        sb.append(c).append(getNmExtdata2());
        sb.append(c).append(getNmExtdata3());
        sb.append(c).append(getDtExtdata1());
        sb.append(c).append(getDtExtdata2());
        sb.append(c).append(getDtExtdata3());
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
     * [get] RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] SBWAREHOUSECD: {varchar(30)} <br>
     * 保税倉庫CD
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public String getSbwarehousecd() {
        return _sbwarehousecd;
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(30)} <br>
     * 保税倉庫CD
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        __modifiedProperties.add("sbwarehousecd");
        this._sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] IINO: {varchar(30)} <br>
     * 保税管理番号
     * @return The value of the column 'IINO'. (NullAllowed)
     */
    public String getIino() {
        return _iino;
    }

    /**
     * [set] IINO: {varchar(30)} <br>
     * 保税管理番号
     * @param iino The value of the column 'IINO'. (NullAllowed)
     */
    public void setIino(String iino) {
        __modifiedProperties.add("iino");
        this._iino = iino;
    }

    /**
     * [get] RCVSCHDATE: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public String getRcvschdate() {
        return _rcvschdate;
    }

    /**
     * [set] RCVSCHDATE: {varchar(8)} <br>
     * 受入予定日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public void setRcvschdate(String rcvschdate) {
        __modifiedProperties.add("rcvschdate");
        this._rcvschdate = rcvschdate;
    }

    /**
     * [get] CARRIERNO: {varchar(60)} <br>
     * コンテナNo.
     * @return The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public String getCarrierno() {
        return _carrierno;
    }

    /**
     * [set] CARRIERNO: {varchar(60)} <br>
     * コンテナNo.
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public void setCarrierno(String carrierno) {
        __modifiedProperties.add("carrierno");
        this._carrierno = carrierno;
    }

    /**
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * 特販業者CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * 特販業者CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
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
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] EXPECTQTY1: {decimal(16, 6)} <br>
     * 個数（個装）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {decimal(16, 6)} <br>
     * 個数（個装）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(java.math.BigDecimal expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] FROMFAX: {varchar(60)} <br>
     * ラインNo.
     * @return The value of the column 'FROMFAX'. (NullAllowed)
     */
    public String getFromfax() {
        return _fromfax;
    }

    /**
     * [set] FROMFAX: {varchar(60)} <br>
     * ラインNo.
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed)
     */
    public void setFromfax(String fromfax) {
        __modifiedProperties.add("fromfax");
        this._fromfax = fromfax;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100)} <br>
     * SRC_CD
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public String getCarriersname() {
        return _carriersname;
    }

    /**
     * [set] CARRIERSNAME: {varchar(100)} <br>
     * SRC_CD
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public void setCarriersname(String carriersname) {
        __modifiedProperties.add("carriersname");
        this._carriersname = carriersname;
    }

    /**
     * [get] CARRIERWBNO: {varchar(60)} <br>
     * オーダーNo.
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public String getCarrierwbno() {
        return _carrierwbno;
    }

    /**
     * [set] CARRIERWBNO: {varchar(60)} <br>
     * オーダーNo.
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public void setCarrierwbno(String carrierwbno) {
        __modifiedProperties.add("carrierwbno");
        this._carrierwbno = carrierwbno;
    }

    /**
     * [get] FOREIGNCARGOFLG: {decimal(16, 6)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getForeigncargoflg() {
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {decimal(16, 6)} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public void setForeigncargoflg(java.math.BigDecimal foreigncargoflg) {
        __modifiedProperties.add("foreigncargoflg");
        this._foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] FROMREFNAME: {varchar(60)} <br>
     * B/LNo.
     * @return The value of the column 'FROMREFNAME'. (NullAllowed)
     */
    public String getFromrefname() {
        return _fromrefname;
    }

    /**
     * [set] FROMREFNAME: {varchar(60)} <br>
     * B/LNo.
     * @param fromrefname The value of the column 'FROMREFNAME'. (NullAllowed)
     */
    public void setFromrefname(String fromrefname) {
        __modifiedProperties.add("fromrefname");
        this._fromrefname = fromrefname;
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
     * [get] CUSTORDERNO: {varchar(60)} <br>
     * 依頼番号
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public String getCustorderno() {
        return _custorderno;
    }

    /**
     * [set] CUSTORDERNO: {varchar(60)} <br>
     * 依頼番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public void setCustorderno(String custorderno) {
        __modifiedProperties.add("custorderno");
        this._custorderno = custorderno;
    }

    /**
     * [get] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'ARRIVALPORTDATE'. (NullAllowed)
     */
    public String getArrivalportdate() {
        return _arrivalportdate;
    }

    /**
     * [set] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @param arrivalportdate The value of the column 'ARRIVALPORTDATE'. (NullAllowed)
     */
    public void setArrivalportdate(String arrivalportdate) {
        __modifiedProperties.add("arrivalportdate");
        this._arrivalportdate = arrivalportdate;
    }

    /**
     * [get] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @return The value of the column 'SHIPNAME'. (NullAllowed)
     */
    public String getShipname() {
        return _shipname;
    }

    /**
     * [set] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @param shipname The value of the column 'SHIPNAME'. (NullAllowed)
     */
    public void setShipname(String shipname) {
        __modifiedProperties.add("shipname");
        this._shipname = shipname;
    }

    /**
     * [get] BATDELINO: {varchar(30)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @return The value of the column 'BATDELINO'. (NullAllowed)
     */
    public String getBatdelino() {
        return _batdelino;
    }

    /**
     * [set] BATDELINO: {varchar(30)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @param batdelino The value of the column 'BATDELINO'. (NullAllowed)
     */
    public void setBatdelino(String batdelino) {
        __modifiedProperties.add("batdelino");
        this._batdelino = batdelino;
    }

    /**
     * [get] BATDELIDETAILNO: {bigint(19)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @return The value of the column 'BATDELIDETAILNO'. (NullAllowed)
     */
    public Long getBatdelidetailno() {
        return _batdelidetailno;
    }

    /**
     * [set] BATDELIDETAILNO: {bigint(19)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @param batdelidetailno The value of the column 'BATDELIDETAILNO'. (NullAllowed)
     */
    public void setBatdelidetailno(Long batdelidetailno) {
        __modifiedProperties.add("batdelidetailno");
        this._batdelidetailno = batdelidetailno;
    }

    /**
     * [get] BATWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼拠点CD
     * @return The value of the column 'BATWAREHOUSECD'. (NullAllowed)
     */
    public String getBatwarehousecd() {
        return _batwarehousecd;
    }

    /**
     * [set] BATWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼拠点CD
     * @param batwarehousecd The value of the column 'BATWAREHOUSECD'. (NullAllowed)
     */
    public void setBatwarehousecd(String batwarehousecd) {
        __modifiedProperties.add("batwarehousecd");
        this._batwarehousecd = batwarehousecd;
    }

    /**
     * [get] BATKEEPWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼保管場所CD
     * @return The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed)
     */
    public String getBatkeepwarehousecd() {
        return _batkeepwarehousecd;
    }

    /**
     * [set] BATKEEPWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼保管場所CD
     * @param batkeepwarehousecd The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed)
     */
    public void setBatkeepwarehousecd(String batkeepwarehousecd) {
        __modifiedProperties.add("batkeepwarehousecd");
        this._batkeepwarehousecd = batkeepwarehousecd;
    }

    /**
     * [get] BATPARTNERNORCV: {varchar(30)} <br>
     * パートナー番号（受信）
     * @return The value of the column 'BATPARTNERNORCV'. (NullAllowed)
     */
    public String getBatpartnernorcv() {
        return _batpartnernorcv;
    }

    /**
     * [set] BATPARTNERNORCV: {varchar(30)} <br>
     * パートナー番号（受信）
     * @param batpartnernorcv The value of the column 'BATPARTNERNORCV'. (NullAllowed)
     */
    public void setBatpartnernorcv(String batpartnernorcv) {
        __modifiedProperties.add("batpartnernorcv");
        this._batpartnernorcv = batpartnernorcv;
    }

    /**
     * [get] BATPARTNERNOSND: {varchar(30)} <br>
     * パートナー番号（送信）
     * @return The value of the column 'BATPARTNERNOSND'. (NullAllowed)
     */
    public String getBatpartnernosnd() {
        return _batpartnernosnd;
    }

    /**
     * [set] BATPARTNERNOSND: {varchar(30)} <br>
     * パートナー番号（送信）
     * @param batpartnernosnd The value of the column 'BATPARTNERNOSND'. (NullAllowed)
     */
    public void setBatpartnernosnd(String batpartnernosnd) {
        __modifiedProperties.add("batpartnernosnd");
        this._batpartnernosnd = batpartnernosnd;
    }

    /**
     * [get] BATDELIDETAILNUM: {bigint(19)} <br>
     * 伝票番号
     * @return The value of the column 'BATDELIDETAILNUM'. (NullAllowed)
     */
    public Long getBatdelidetailnum() {
        return _batdelidetailnum;
    }

    /**
     * [set] BATDELIDETAILNUM: {bigint(19)} <br>
     * 伝票番号
     * @param batdelidetailnum The value of the column 'BATDELIDETAILNUM'. (NullAllowed)
     */
    public void setBatdelidetailnum(Long batdelidetailnum) {
        __modifiedProperties.add("batdelidetailnum");
        this._batdelidetailnum = batdelidetailnum;
    }

    /**
     * [get] BATNO: {decimal(16, 6)} <br>
     * ＢＡＴ管理番号
     * @return The value of the column 'BATNO'. (NullAllowed)
     */
    public java.math.BigDecimal getBatno() {
        return _batno;
    }

    /**
     * [set] BATNO: {decimal(16, 6)} <br>
     * ＢＡＴ管理番号
     * @param batno The value of the column 'BATNO'. (NullAllowed)
     */
    public void setBatno(java.math.BigDecimal batno) {
        __modifiedProperties.add("batno");
        this._batno = batno;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public String getVaExtdata2() {
        return _vaExtdata2;
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public void setVaExtdata2(String vaExtdata2) {
        __modifiedProperties.add("vaExtdata2");
        this._vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public String getVaExtdata3() {
        return _vaExtdata3;
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public void setVaExtdata3(String vaExtdata3) {
        __modifiedProperties.add("vaExtdata3");
        this._vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public String getNvExtdata1() {
        return _nvExtdata1;
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public void setNvExtdata1(String nvExtdata1) {
        __modifiedProperties.add("nvExtdata1");
        this._nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_EXTDATA2'. (NullAllowed)
     */
    public String getNvExtdata2() {
        return _nvExtdata2;
    }

    /**
     * [set] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_EXTDATA2'. (NullAllowed)
     */
    public void setNvExtdata2(String nvExtdata2) {
        __modifiedProperties.add("nvExtdata2");
        this._nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_EXTDATA3'. (NullAllowed)
     */
    public String getNvExtdata3() {
        return _nvExtdata3;
    }

    /**
     * [set] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_EXTDATA3'. (NullAllowed)
     */
    public void setNvExtdata3(String nvExtdata3) {
        __modifiedProperties.add("nvExtdata3");
        this._nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public Long getNmExtdata1() {
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        __modifiedProperties.add("nmExtdata1");
        this._nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_EXTDATA2'. (NullAllowed)
     */
    public Long getNmExtdata2() {
        return _nmExtdata2;
    }

    /**
     * [set] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_EXTDATA2'. (NullAllowed)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        __modifiedProperties.add("nmExtdata2");
        this._nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_EXTDATA3'. (NullAllowed)
     */
    public Long getNmExtdata3() {
        return _nmExtdata3;
    }

    /**
     * [set] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_EXTDATA3'. (NullAllowed)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        __modifiedProperties.add("nmExtdata3");
        this._nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public String getDtExtdata1() {
        return _dtExtdata1;
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public void setDtExtdata1(String dtExtdata1) {
        __modifiedProperties.add("dtExtdata1");
        this._dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public String getDtExtdata2() {
        return _dtExtdata2;
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public void setDtExtdata2(String dtExtdata2) {
        __modifiedProperties.add("dtExtdata2");
        this._dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_EXTDATA3'. (NullAllowed)
     */
    public String getDtExtdata3() {
        return _dtExtdata3;
    }

    /**
     * [set] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_EXTDATA3'. (NullAllowed)
     */
    public void setDtExtdata3(String dtExtdata3) {
        __modifiedProperties.add("dtExtdata3");
        this._dtExtdata3 = dtExtdata3;
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
