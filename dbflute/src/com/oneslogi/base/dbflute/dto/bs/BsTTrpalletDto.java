package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRPALLET as TABLE. <br>
 * パレットはり紙情報
 * <pre>
 * [primary-key]
 *     TRPALLET_ID
 *
 * [column]
 *     TRPALLET_ID, PALLET_NO, LOT_ID, RECEIVE_PLAN_H_ID, RCVLINENO, PRINTEDFLG, PRINTINGDATE, FIRMCARRYNO, TRANSPORTNO, SOURCECD, SCHDATE, RECEIVECD, RCVDATE, RECEIVEDATE, LOCATION_ID, PRODUCT_CD, LOT3, MANUFACTURE_DATE, BATARTICLESIGN, STOCK_TYPE_CD, RECEIVEQTYCASE, RECEIVEQTYBOWL, RECEIVEQTY, RESTQTYCASE, RESTQTYBOWL, RESTQTY, ALLOCQTY1, FULLPALLETFLG, PALLETSTS, PLURALPRODUCTIONKBN, PALLETCUTTINGKBN, RCVPALLETNO, PALLETADDFLG, ACCEPTUSERCD, ACCEPTDATE, CLIENT_ID, CENTER_ID, RECEIVE_PLAN_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     T_PALLET
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     tPalletList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrpalletDto implements Serializable {

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
    /** TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trpalletId;

    /** PALLET_NO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _palletNo;

    /** LOT_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** RCVLINENO: {bigint(19)} */
    @JsonKey
    protected Long _rcvlineno;

    /** PRINTEDFLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _printedflg;

    /** PRINTINGDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _printingdate;

    /** FIRMCARRYNO: {varchar(30)} */
    @JsonKey
    protected String _firmcarryno;

    /** TRANSPORTNO: {varchar(30)} */
    @JsonKey
    protected String _transportno;

    /** SOURCECD: {varchar(30)} */
    @JsonKey
    protected String _sourcecd;

    /** SCHDATE: {varchar(8)} */
    @JsonKey
    protected String _schdate;

    /** RECEIVECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _receivecd;

    /** RCVDATE: {varchar(8)} */
    @JsonKey
    protected String _rcvdate;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** LOT3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _lot3;

    /** MANUFACTURE_DATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _manufactureDate;

    /** BATARTICLESIGN: {varchar(30)} */
    @JsonKey
    protected String _batarticlesign;

    /** STOCK_TYPE_CD: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _receiveqtycase;

    /** RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _receiveqtybowl;

    /** RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _receiveqty;

    /** RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _restqtycase;

    /** RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _restqtybowl;

    /** RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _restqty;

    /** ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _allocqty1;

    /** FULLPALLETFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _fullpalletflg;

    /** PALLETSTS: {NotNull, varchar(30), default=[(0)]} */
    @JsonKey
    protected String _palletsts;

    /** PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _pluralproductionkbn;

    /** PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _palletcuttingkbn;

    /** RCVPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _rcvpalletno;

    /** PALLETADDFLG: {varchar(30), default=[(2)]} */
    @JsonKey
    protected String _palletaddflg;

    /** ACCEPTUSERCD: {varchar(30)} */
    @JsonKey
    protected String _acceptusercd;

    /** ACCEPTDATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _acceptdate;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** RECEIVE_PLAN_B_ID: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanBId;

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
    public BsTTrpalletDto() {
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
    protected List<TPalletDto> _tPalletList;

    public List<TPalletDto> getTPalletList() {
        if (_tPalletList == null) { _tPalletList = new ArrayList<TPalletDto>(); }
        return _tPalletList;
    }

    public void setTPalletList(List<TPalletDto> tPalletList) {
        this._tPalletList = tPalletList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrpalletDto)) { return false; }
        final BsTTrpalletDto otherEntity = (BsTTrpalletDto)other;
        if (!helpComparingValue(getTrpalletId(), otherEntity.getTrpalletId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRPALLET");
        result = xCH(result, getTrpalletId());
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
        sb.append(c).append(getTrpalletId());
        sb.append(c).append(getPalletNo());
        sb.append(c).append(getLotId());
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getPrintedflg());
        sb.append(c).append(getPrintingdate());
        sb.append(c).append(getFirmcarryno());
        sb.append(c).append(getTransportno());
        sb.append(c).append(getSourcecd());
        sb.append(c).append(getSchdate());
        sb.append(c).append(getReceivecd());
        sb.append(c).append(getRcvdate());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot3());
        sb.append(c).append(getManufactureDate());
        sb.append(c).append(getBatarticlesign());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getReceiveqtycase());
        sb.append(c).append(getReceiveqtybowl());
        sb.append(c).append(getReceiveqty());
        sb.append(c).append(getRestqtycase());
        sb.append(c).append(getRestqtybowl());
        sb.append(c).append(getRestqty());
        sb.append(c).append(getAllocqty1());
        sb.append(c).append(getFullpalletflg());
        sb.append(c).append(getPalletsts());
        sb.append(c).append(getPluralproductionkbn());
        sb.append(c).append(getPalletcuttingkbn());
        sb.append(c).append(getRcvpalletno());
        sb.append(c).append(getPalletaddflg());
        sb.append(c).append(getAcceptusercd());
        sb.append(c).append(getAcceptdate());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getReceivePlanBId());
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
     * [get] TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public Long getTrpalletId() {
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public void setTrpalletId(Long trpalletId) {
        __modifiedProperties.add("trpalletId");
        this._trpalletId = trpalletId;
    }

    /**
     * [get] PALLET_NO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLET_NO'. (NullAllowed)
     */
    public java.math.BigDecimal getPalletNo() {
        return _palletNo;
    }

    /**
     * [set] PALLET_NO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @param palletNo The value of the column 'PALLET_NO'. (NullAllowed)
     */
    public void setPalletNo(java.math.BigDecimal palletNo) {
        __modifiedProperties.add("palletNo");
        this._palletNo = palletNo;
    }

    /**
     * [get] LOT_ID: {IX, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
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
     * [get] RCVLINENO: {bigint(19)} <br>
     * 入庫キー行番号
     * @return The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public Long getRcvlineno() {
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {bigint(19)} <br>
     * 入庫キー行番号
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public void setRcvlineno(Long rcvlineno) {
        __modifiedProperties.add("rcvlineno");
        this._rcvlineno = rcvlineno;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, varchar(30)} <br>
     * はり紙印刷区分
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public String getPrintedflg() {
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {NotNull, varchar(30)} <br>
     * はり紙印刷区分
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        __modifiedProperties.add("printedflg");
        this._printedflg = printedflg;
    }

    /**
     * [get] PRINTINGDATE: {NotNull, varchar(8)} <br>
     * パレットはり紙作成日
     * @return The value of the column 'PRINTINGDATE'. (NullAllowed)
     */
    public String getPrintingdate() {
        return _printingdate;
    }

    /**
     * [set] PRINTINGDATE: {NotNull, varchar(8)} <br>
     * パレットはり紙作成日
     * @param printingdate The value of the column 'PRINTINGDATE'. (NullAllowed)
     */
    public void setPrintingdate(String printingdate) {
        __modifiedProperties.add("printingdate");
        this._printingdate = printingdate;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public String getFirmcarryno() {
        return _firmcarryno;
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public void setFirmcarryno(String firmcarryno) {
        __modifiedProperties.add("firmcarryno");
        this._firmcarryno = firmcarryno;
    }

    /**
     * [get] TRANSPORTNO: {varchar(30)} <br>
     * 整理番号
     * @return The value of the column 'TRANSPORTNO'. (NullAllowed)
     */
    public String getTransportno() {
        return _transportno;
    }

    /**
     * [set] TRANSPORTNO: {varchar(30)} <br>
     * 整理番号
     * @param transportno The value of the column 'TRANSPORTNO'. (NullAllowed)
     */
    public void setTransportno(String transportno) {
        __modifiedProperties.add("transportno");
        this._transportno = transportno;
    }

    /**
     * [get] SOURCECD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCECD'. (NullAllowed)
     */
    public String getSourcecd() {
        return _sourcecd;
    }

    /**
     * [set] SOURCECD: {varchar(30)} <br>
     * 発送元CD
     * @param sourcecd The value of the column 'SOURCECD'. (NullAllowed)
     */
    public void setSourcecd(String sourcecd) {
        __modifiedProperties.add("sourcecd");
        this._sourcecd = sourcecd;
    }

    /**
     * [get] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed)
     */
    public String getSchdate() {
        return _schdate;
    }

    /**
     * [set] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed)
     */
    public void setSchdate(String schdate) {
        __modifiedProperties.add("schdate");
        this._schdate = schdate;
    }

    /**
     * [get] RECEIVECD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'RECEIVECD'. (NullAllowed)
     */
    public String getReceivecd() {
        return _receivecd;
    }

    /**
     * [set] RECEIVECD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @param receivecd The value of the column 'RECEIVECD'. (NullAllowed)
     */
    public void setReceivecd(String receivecd) {
        __modifiedProperties.add("receivecd");
        this._receivecd = receivecd;
    }

    /**
     * [get] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (NullAllowed)
     */
    public String getRcvdate() {
        return _rcvdate;
    }

    /**
     * [set] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (NullAllowed)
     */
    public void setRcvdate(String rcvdate) {
        __modifiedProperties.add("rcvdate");
        this._rcvdate = rcvdate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫年月日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫年月日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOT3: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getManufactureDate() {
        return _manufactureDate;
    }

    /**
     * [set] MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setManufactureDate(String manufactureDate) {
        __modifiedProperties.add("manufactureDate");
        this._manufactureDate = manufactureDate;
    }

    /**
     * [get] BATARTICLESIGN: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'BATARTICLESIGN'. (NullAllowed)
     */
    public String getBatarticlesign() {
        return _batarticlesign;
    }

    /**
     * [set] BATARTICLESIGN: {varchar(30)} <br>
     * 製造記号
     * @param batarticlesign The value of the column 'BATARTICLESIGN'. (NullAllowed)
     */
    public void setBatarticlesign(String batarticlesign) {
        __modifiedProperties.add("batarticlesign");
        this._batarticlesign = batarticlesign;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（ケース）
     * @return The value of the column 'RECEIVEQTYCASE'. (NullAllowed)
     */
    public java.math.BigDecimal getReceiveqtycase() {
        return _receiveqtycase;
    }

    /**
     * [set] RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（ケース）
     * @param receiveqtycase The value of the column 'RECEIVEQTYCASE'. (NullAllowed)
     */
    public void setReceiveqtycase(java.math.BigDecimal receiveqtycase) {
        __modifiedProperties.add("receiveqtycase");
        this._receiveqtycase = receiveqtycase;
    }

    /**
     * [get] RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（カートン）
     * @return The value of the column 'RECEIVEQTYBOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getReceiveqtybowl() {
        return _receiveqtybowl;
    }

    /**
     * [set] RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（カートン）
     * @param receiveqtybowl The value of the column 'RECEIVEQTYBOWL'. (NullAllowed)
     */
    public void setReceiveqtybowl(java.math.BigDecimal receiveqtybowl) {
        __modifiedProperties.add("receiveqtybowl");
        this._receiveqtybowl = receiveqtybowl;
    }

    /**
     * [get] RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装入庫時数量
     * @return The value of the column 'RECEIVEQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getReceiveqty() {
        return _receiveqty;
    }

    /**
     * [set] RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装入庫時数量
     * @param receiveqty The value of the column 'RECEIVEQTY'. (NullAllowed)
     */
    public void setReceiveqty(java.math.BigDecimal receiveqty) {
        __modifiedProperties.add("receiveqty");
        this._receiveqty = receiveqty;
    }

    /**
     * [get] RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（ケース）
     * @return The value of the column 'RESTQTYCASE'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqtycase() {
        return _restqtycase;
    }

    /**
     * [set] RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（ケース）
     * @param restqtycase The value of the column 'RESTQTYCASE'. (NullAllowed)
     */
    public void setRestqtycase(java.math.BigDecimal restqtycase) {
        __modifiedProperties.add("restqtycase");
        this._restqtycase = restqtycase;
    }

    /**
     * [get] RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（カートン）
     * @return The value of the column 'RESTQTYBOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqtybowl() {
        return _restqtybowl;
    }

    /**
     * [set] RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（カートン）
     * @param restqtybowl The value of the column 'RESTQTYBOWL'. (NullAllowed)
     */
    public void setRestqtybowl(java.math.BigDecimal restqtybowl) {
        __modifiedProperties.add("restqtybowl");
        this._restqtybowl = restqtybowl;
    }

    /**
     * [get] RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装残数量
     * @return The value of the column 'RESTQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqty() {
        return _restqty;
    }

    /**
     * [set] RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装残数量
     * @param restqty The value of the column 'RESTQTY'. (NullAllowed)
     */
    public void setRestqty(java.math.BigDecimal restqty) {
        __modifiedProperties.add("restqty");
        this._restqty = restqty;
    }

    /**
     * [get] ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当数量
     * @return The value of the column 'ALLOCQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocqty1() {
        return _allocqty1;
    }

    /**
     * [set] ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当数量
     * @param allocqty1 The value of the column 'ALLOCQTY1'. (NullAllowed)
     */
    public void setAllocqty1(java.math.BigDecimal allocqty1) {
        __modifiedProperties.add("allocqty1");
        this._allocqty1 = allocqty1;
    }

    /**
     * [get] FULLPALLETFLG: {NotNull, char(1), default=[(0)]} <br>
     * 単品パレットフラグ
     * @return The value of the column 'FULLPALLETFLG'. (NullAllowed)
     */
    public String getFullpalletflg() {
        return _fullpalletflg;
    }

    /**
     * [set] FULLPALLETFLG: {NotNull, char(1), default=[(0)]} <br>
     * 単品パレットフラグ
     * @param fullpalletflg The value of the column 'FULLPALLETFLG'. (NullAllowed)
     */
    public void setFullpalletflg(String fullpalletflg) {
        __modifiedProperties.add("fullpalletflg");
        this._fullpalletflg = fullpalletflg;
    }

    /**
     * [get] PALLETSTS: {NotNull, varchar(30), default=[(0)]} <br>
     * パレットはり紙ステータス
     * @return The value of the column 'PALLETSTS'. (NullAllowed)
     */
    public String getPalletsts() {
        return _palletsts;
    }

    /**
     * [set] PALLETSTS: {NotNull, varchar(30), default=[(0)]} <br>
     * パレットはり紙ステータス
     * @param palletsts The value of the column 'PALLETSTS'. (NullAllowed)
     */
    public void setPalletsts(String palletsts) {
        __modifiedProperties.add("palletsts");
        this._palletsts = palletsts;
    }

    /**
     * [get] PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} <br>
     * 複数製造月日区分
     * @return The value of the column 'PLURALPRODUCTIONKBN'. (NullAllowed)
     */
    public String getPluralproductionkbn() {
        return _pluralproductionkbn;
    }

    /**
     * [set] PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} <br>
     * 複数製造月日区分
     * @param pluralproductionkbn The value of the column 'PLURALPRODUCTIONKBN'. (NullAllowed)
     */
    public void setPluralproductionkbn(String pluralproductionkbn) {
        __modifiedProperties.add("pluralproductionkbn");
        this._pluralproductionkbn = pluralproductionkbn;
    }

    /**
     * [get] PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} <br>
     * パレット分割区分
     * @return The value of the column 'PALLETCUTTINGKBN'. (NullAllowed)
     */
    public String getPalletcuttingkbn() {
        return _palletcuttingkbn;
    }

    /**
     * [set] PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} <br>
     * パレット分割区分
     * @param palletcuttingkbn The value of the column 'PALLETCUTTINGKBN'. (NullAllowed)
     */
    public void setPalletcuttingkbn(String palletcuttingkbn) {
        __modifiedProperties.add("palletcuttingkbn");
        this._palletcuttingkbn = palletcuttingkbn;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（08需給）
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public String getRcvpalletno() {
        return _rcvpalletno;
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（08需給）
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public void setRcvpalletno(String rcvpalletno) {
        __modifiedProperties.add("rcvpalletno");
        this._rcvpalletno = rcvpalletno;
    }

    /**
     * [get] PALLETADDFLG: {varchar(30), default=[(2)]} <br>
     * はり紙作成フラグ
     * @return The value of the column 'PALLETADDFLG'. (NullAllowed)
     */
    public String getPalletaddflg() {
        return _palletaddflg;
    }

    /**
     * [set] PALLETADDFLG: {varchar(30), default=[(2)]} <br>
     * はり紙作成フラグ
     * @param palletaddflg The value of the column 'PALLETADDFLG'. (NullAllowed)
     */
    public void setPalletaddflg(String palletaddflg) {
        __modifiedProperties.add("palletaddflg");
        this._palletaddflg = palletaddflg;
    }

    /**
     * [get] ACCEPTUSERCD: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @return The value of the column 'ACCEPTUSERCD'. (NullAllowed)
     */
    public String getAcceptusercd() {
        return _acceptusercd;
    }

    /**
     * [set] ACCEPTUSERCD: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @param acceptusercd The value of the column 'ACCEPTUSERCD'. (NullAllowed)
     */
    public void setAcceptusercd(String acceptusercd) {
        __modifiedProperties.add("acceptusercd");
        this._acceptusercd = acceptusercd;
    }

    /**
     * [get] ACCEPTDATE: {datetime2(26, 6)} <br>
     * 受入検品日時
     * @return The value of the column 'ACCEPTDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAcceptdate() {
        return _acceptdate;
    }

    /**
     * [set] ACCEPTDATE: {datetime2(26, 6)} <br>
     * 受入検品日時
     * @param acceptdate The value of the column 'ACCEPTDATE'. (NullAllowed)
     */
    public void setAcceptdate(java.sql.Timestamp acceptdate) {
        __modifiedProperties.add("acceptdate");
        this._acceptdate = acceptdate;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {bigint(19)} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public Long getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {bigint(19)} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
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
