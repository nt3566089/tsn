package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRSYMBOL as TABLE. <br>
 * 段ボール情報
 * <pre>
 * [primary-key]
 *     TRSYMBOL_ID
 *
 * [column]
 *     TRSYMBOL_ID, CASECD, PRODUCT_CD, ITEMCD, PRODUCT_CD_CASE, PRODUCT_CD_IN, LOT3, DESIGNCD_IN, DESIGNCD_CASE, LOT4, LOT1, LOT2, SYMBOLLINENO, OWNERCD, STOCK_TYPE_CD, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, DAMAGEFLG, RECEIVE_PLAN_H_ID, RECEIVE_PLAN_B_ID, RCVLINENO, SENDRCVKEY, MAKERCASENO, SYMBOLSTS, SYMBOLADDFLG, PRINTEDFLG, SYMBOLSNDDATE, SYMBOLPASTDATE, SYMBOLPALLETONDATE, RECEIVEDATE, PALLET_ID, BASE_PALLET_ID, PARENTPALLETUPDDATE, PRINTINGDATE, LOCATION_ID, RESTQTY, RECEIVEDQTY, DISTRIBUTIONCD, TRANSPORTCD, ORDERNO, RCV_PALLET_ID, SYMBOLFACTORYCD, SYMBOLITEMCD, SYMBOLSKU, SYMBOLRECEIVECD, SYMBOLPRODUCTMARK, SYMBOLORDERNO, SYMBOLPRINTERNO, SYMBOLMAKENO, SYMBOLLOT4, SYMBOLMAKETIME, SYMBOLCIRCULATIONID, SYMBOLRCVKEY, SYMBOLLOT3, QRData, TREXAMRESULT_ID, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, DATETIME, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, MIXEDFLG, SHIPPEDFLG, CASECREATETYPE, CREATEDATETIME, InitNum, ParentCaseCd, TR_PICKLIST_ID, PicklistGNo, RecombDatetime, ReprintedFlg, TraceSts, CLIENT_ID, BATJPRODUCTIONYM, COMETODATE, RCVPALLETNO, TAXPALLETNO, SHTYPECD, CENTER_ID, RESTCTN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     T_CENTER_SYMBOL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     tCenterSymbolList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrsymbolDto implements Serializable {

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
    /** TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** CASECD: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _casecd;

    /** PRODUCT_CD: {IX, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** ITEMCD: {varchar(30)} */
    @JsonKey
    protected String _itemcd;

    /** PRODUCT_CD_CASE: {IX+, varchar(30)} */
    @JsonKey
    protected String _productCdCase;

    /** PRODUCT_CD_IN: {varchar(30)} */
    @JsonKey
    protected String _productCdIn;

    /** LOT3: {varchar(30)} */
    @JsonKey
    protected String _lot3;

    /** DESIGNCD_IN: {varchar(30)} */
    @JsonKey
    protected String _designcdIn;

    /** DESIGNCD_CASE: {varchar(30)} */
    @JsonKey
    protected String _designcdCase;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT1: {varchar(30)} */
    @JsonKey
    protected String _lot1;

    /** LOT2: {varchar(30)} */
    @JsonKey
    protected String _lot2;

    /** SYMBOLLINENO: {bigint(19)} */
    @JsonKey
    protected Long _symbollineno;

    /** OWNERCD: {varchar(30)} */
    @JsonKey
    protected String _ownercd;

    /** STOCK_TYPE_CD: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** FOREIGNCARGOFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _customsreleaseflg;

    /** DAMAGEFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _damageflg;

    /** RECEIVE_PLAN_H_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** RECEIVE_PLAN_B_ID: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _receivePlanBId;

    /** RCVLINENO: {bigint(19)} */
    @JsonKey
    protected Long _rcvlineno;

    /** SENDRCVKEY: {IX, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sendrcvkey;

    /** MAKERCASENO: {varchar(60)} */
    @JsonKey
    protected String _makercaseno;

    /** SYMBOLSTS: {NotNull, varchar(30)} */
    @JsonKey
    protected String _symbolsts;

    /** SYMBOLADDFLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _symboladdflg;

    /** PRINTEDFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _printedflg;

    /** SYMBOLSNDDATE: {varchar(8)} */
    @JsonKey
    protected String _symbolsnddate;

    /** SYMBOLPASTDATE: {varchar(8)} */
    @JsonKey
    protected String _symbolpastdate;

    /** SYMBOLPALLETONDATE: {varchar(8)} */
    @JsonKey
    protected String _symbolpalletondate;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** PALLET_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _palletId;

    /** BASE_PALLET_ID: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _basePalletId;

    /** PARENTPALLETUPDDATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _parentpalletupddate;

    /** PRINTINGDATE: {varchar(8)} */
    @JsonKey
    protected String _printingdate;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** RESTQTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restqty;

    /** RECEIVEDQTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _receivedqty;

    /** DISTRIBUTIONCD: {varchar(30)} */
    @JsonKey
    protected String _distributioncd;

    /** TRANSPORTCD: {varchar(30)} */
    @JsonKey
    protected String _transportcd;

    /** ORDERNO: {varchar(30)} */
    @JsonKey
    protected String _orderno;

    /** RCV_PALLET_ID: {bigint(19)} */
    @JsonKey
    protected Long _rcvPalletId;

    /** SYMBOLFACTORYCD: {IX+, varchar(30)} */
    @JsonKey
    protected String _symbolfactorycd;

    /** SYMBOLITEMCD: {varchar(30)} */
    @JsonKey
    protected String _symbolitemcd;

    /** SYMBOLSKU: {varchar(30)} */
    @JsonKey
    protected String _symbolsku;

    /** SYMBOLRECEIVECD: {varchar(30)} */
    @JsonKey
    protected String _symbolreceivecd;

    /** SYMBOLPRODUCTMARK: {varchar(30)} */
    @JsonKey
    protected String _symbolproductmark;

    /** SYMBOLORDERNO: {varchar(30)} */
    @JsonKey
    protected String _symbolorderno;

    /** SYMBOLPRINTERNO: {varchar(30)} */
    @JsonKey
    protected String _symbolprinterno;

    /** SYMBOLMAKENO: {varchar(30)} */
    @JsonKey
    protected String _symbolmakeno;

    /** SYMBOLLOT4: {varchar(30)} */
    @JsonKey
    protected String _symbollot4;

    /** SYMBOLMAKETIME: {varchar(30)} */
    @JsonKey
    protected String _symbolmaketime;

    /** SYMBOLCIRCULATIONID: {varchar(30)} */
    @JsonKey
    protected String _symbolcirculationid;

    /** SYMBOLRCVKEY: {bigint(19)} */
    @JsonKey
    protected Long _symbolrcvkey;

    /** SYMBOLLOT3: {varchar(30)} */
    @JsonKey
    protected String _symbollot3;

    /** QRData: {varchar(255)} */
    @JsonKey
    protected String _qrdata;

    /** TREXAMRESULT_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _trexamresultId;

    /** CASEITFNO: {varchar(30)} */
    @JsonKey
    protected String _caseitfno;

    /** CASEBARCODEVALIANT: {varchar(30)} */
    @JsonKey
    protected String _casebarcodevaliant;

    /** CASELOT4: {varchar(30)} */
    @JsonKey
    protected String _caselot4;

    /** DATETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _datetime;

    /** CASECENTERNO: {varchar(30)} */
    @JsonKey
    protected String _casecenterno;

    /** CASEPACKNO: {varchar(30)} */
    @JsonKey
    protected String _casepackno;

    /** CASEPACKTIME: {varchar(30)} */
    @JsonKey
    protected String _casepacktime;

    /** CASEBARCODE: {IX, varchar(60)} */
    @JsonKey
    protected String _casebarcode;

    /** MIXEDFLG: {char(1), default=[(0)]} */
    @JsonKey
    protected String _mixedflg;

    /** SHIPPEDFLG: {char(1), default=[(0)]} */
    @JsonKey
    protected String _shippedflg;

    /** CASECREATETYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _casecreatetype;

    /** CREATEDATETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _createdatetime;

    /** InitNum: {bigint(19)} */
    @JsonKey
    protected Long _initnum;

    /** ParentCaseCd: {bigint(19)} */
    @JsonKey
    protected Long _parentcasecd;

    /** TR_PICKLIST_ID: {bigint(19)} */
    @JsonKey
    protected Long _trPicklistId;

    /** PicklistGNo: {bigint(19)} */
    @JsonKey
    protected Long _picklistgno;

    /** RecombDatetime: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _recombdatetime;

    /** ReprintedFlg: {varchar(30)} */
    @JsonKey
    protected String _reprintedflg;

    /** TraceSts: {bigint(19)} */
    @JsonKey
    protected Long _tracests;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** BATJPRODUCTIONYM: {varchar(30)} */
    @JsonKey
    protected String _batjproductionym;

    /** COMETODATE: {varchar(8)} */
    @JsonKey
    protected String _cometodate;

    /** RCVPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _rcvpalletno;

    /** TAXPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _taxpalletno;

    /** SHTYPECD: {varchar(30)} */
    @JsonKey
    protected String _shtypecd;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** RESTCTN: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restctn;

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
    public BsTTrsymbolDto() {
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
    protected List<TCenterSymbolDto> _tCenterSymbolList;

    public List<TCenterSymbolDto> getTCenterSymbolList() {
        if (_tCenterSymbolList == null) { _tCenterSymbolList = new ArrayList<TCenterSymbolDto>(); }
        return _tCenterSymbolList;
    }

    public void setTCenterSymbolList(List<TCenterSymbolDto> tCenterSymbolList) {
        this._tCenterSymbolList = tCenterSymbolList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrsymbolDto)) { return false; }
        final BsTTrsymbolDto otherEntity = (BsTTrsymbolDto)other;
        if (!helpComparingValue(getTrsymbolId(), otherEntity.getTrsymbolId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSYMBOL");
        result = xCH(result, getTrsymbolId());
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
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getCasecd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemcd());
        sb.append(c).append(getProductCdCase());
        sb.append(c).append(getProductCdIn());
        sb.append(c).append(getLot3());
        sb.append(c).append(getDesigncdIn());
        sb.append(c).append(getDesigncdCase());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getSymbollineno());
        sb.append(c).append(getOwnercd());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getCustomsreleaseflg());
        sb.append(c).append(getDamageflg());
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getReceivePlanBId());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getSendrcvkey());
        sb.append(c).append(getMakercaseno());
        sb.append(c).append(getSymbolsts());
        sb.append(c).append(getSymboladdflg());
        sb.append(c).append(getPrintedflg());
        sb.append(c).append(getSymbolsnddate());
        sb.append(c).append(getSymbolpastdate());
        sb.append(c).append(getSymbolpalletondate());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getPalletId());
        sb.append(c).append(getBasePalletId());
        sb.append(c).append(getParentpalletupddate());
        sb.append(c).append(getPrintingdate());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getRestqty());
        sb.append(c).append(getReceivedqty());
        sb.append(c).append(getDistributioncd());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getOrderno());
        sb.append(c).append(getRcvPalletId());
        sb.append(c).append(getSymbolfactorycd());
        sb.append(c).append(getSymbolitemcd());
        sb.append(c).append(getSymbolsku());
        sb.append(c).append(getSymbolreceivecd());
        sb.append(c).append(getSymbolproductmark());
        sb.append(c).append(getSymbolorderno());
        sb.append(c).append(getSymbolprinterno());
        sb.append(c).append(getSymbolmakeno());
        sb.append(c).append(getSymbollot4());
        sb.append(c).append(getSymbolmaketime());
        sb.append(c).append(getSymbolcirculationid());
        sb.append(c).append(getSymbolrcvkey());
        sb.append(c).append(getSymbollot3());
        sb.append(c).append(getQrdata());
        sb.append(c).append(getTrexamresultId());
        sb.append(c).append(getCaseitfno());
        sb.append(c).append(getCasebarcodevaliant());
        sb.append(c).append(getCaselot4());
        sb.append(c).append(getDatetime());
        sb.append(c).append(getCasecenterno());
        sb.append(c).append(getCasepackno());
        sb.append(c).append(getCasepacktime());
        sb.append(c).append(getCasebarcode());
        sb.append(c).append(getMixedflg());
        sb.append(c).append(getShippedflg());
        sb.append(c).append(getCasecreatetype());
        sb.append(c).append(getCreatedatetime());
        sb.append(c).append(getInitnum());
        sb.append(c).append(getParentcasecd());
        sb.append(c).append(getTrPicklistId());
        sb.append(c).append(getPicklistgno());
        sb.append(c).append(getRecombdatetime());
        sb.append(c).append(getReprintedflg());
        sb.append(c).append(getTracests());
        sb.append(c).append(getClientId());
        sb.append(c).append(getBatjproductionym());
        sb.append(c).append(getCometodate());
        sb.append(c).append(getRcvpalletno());
        sb.append(c).append(getTaxpalletno());
        sb.append(c).append(getShtypecd());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getRestctn());
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
     * [get] TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] CASECD: {NotNull, bigint(19)} <br>
     * ケースCD
     * @return The value of the column 'CASECD'. (NullAllowed)
     */
    public Long getCasecd() {
        return _casecd;
    }

    /**
     * [set] CASECD: {NotNull, bigint(19)} <br>
     * ケースCD
     * @param casecd The value of the column 'CASECD'. (NullAllowed)
     */
    public void setCasecd(Long casecd) {
        __modifiedProperties.add("casecd");
        this._casecd = casecd;
    }

    /**
     * [get] PRODUCT_CD: {IX, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {IX, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed)
     */
    public String getItemcd() {
        return _itemcd;
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed)
     */
    public void setItemcd(String itemcd) {
        __modifiedProperties.add("itemcd");
        this._itemcd = itemcd;
    }

    /**
     * [get] PRODUCT_CD_CASE: {IX+, varchar(30)} <br>
     * 銘柄CD(ケース)
     * @return The value of the column 'PRODUCT_CD_CASE'. (NullAllowed)
     */
    public String getProductCdCase() {
        return _productCdCase;
    }

    /**
     * [set] PRODUCT_CD_CASE: {IX+, varchar(30)} <br>
     * 銘柄CD(ケース)
     * @param productCdCase The value of the column 'PRODUCT_CD_CASE'. (NullAllowed)
     */
    public void setProductCdCase(String productCdCase) {
        __modifiedProperties.add("productCdCase");
        this._productCdCase = productCdCase;
    }

    /**
     * [get] PRODUCT_CD_IN: {varchar(30)} <br>
     * 銘柄CD(入庫時)
     * @return The value of the column 'PRODUCT_CD_IN'. (NullAllowed)
     */
    public String getProductCdIn() {
        return _productCdIn;
    }

    /**
     * [set] PRODUCT_CD_IN: {varchar(30)} <br>
     * 銘柄CD(入庫時)
     * @param productCdIn The value of the column 'PRODUCT_CD_IN'. (NullAllowed)
     */
    public void setProductCdIn(String productCdIn) {
        __modifiedProperties.add("productCdIn");
        this._productCdIn = productCdIn;
    }

    /**
     * [get] LOT3: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(30)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分(入庫時)
     * @return The value of the column 'DESIGNCD_IN'. (NullAllowed)
     */
    public String getDesigncdIn() {
        return _designcdIn;
    }

    /**
     * [set] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分(入庫時)
     * @param designcdIn The value of the column 'DESIGNCD_IN'. (NullAllowed)
     */
    public void setDesigncdIn(String designcdIn) {
        __modifiedProperties.add("designcdIn");
        this._designcdIn = designcdIn;
    }

    /**
     * [get] DESIGNCD_CASE: {varchar(30)} <br>
     * デザイン区分(ケース)
     * @return The value of the column 'DESIGNCD_CASE'. (NullAllowed)
     */
    public String getDesigncdCase() {
        return _designcdCase;
    }

    /**
     * [set] DESIGNCD_CASE: {varchar(30)} <br>
     * デザイン区分(ケース)
     * @param designcdCase The value of the column 'DESIGNCD_CASE'. (NullAllowed)
     */
    public void setDesigncdCase(String designcdCase) {
        __modifiedProperties.add("designcdCase");
        this._designcdCase = designcdCase;
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
     * [get] LOT1: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(30)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(30)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] SYMBOLLINENO: {bigint(19)} <br>
     * 段ボール番号
     * @return The value of the column 'SYMBOLLINENO'. (NullAllowed)
     */
    public Long getSymbollineno() {
        return _symbollineno;
    }

    /**
     * [set] SYMBOLLINENO: {bigint(19)} <br>
     * 段ボール番号
     * @param symbollineno The value of the column 'SYMBOLLINENO'. (NullAllowed)
     */
    public void setSymbollineno(Long symbollineno) {
        __modifiedProperties.add("symbollineno");
        this._symbollineno = symbollineno;
    }

    /**
     * [get] OWNERCD: {varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNERCD'. (NullAllowed)
     */
    public String getOwnercd() {
        return _ownercd;
    }

    /**
     * [set] OWNERCD: {varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownercd The value of the column 'OWNERCD'. (NullAllowed)
     */
    public void setOwnercd(String ownercd) {
        __modifiedProperties.add("ownercd");
        this._ownercd = ownercd;
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
     * [get] CUSTOMSRELEASEFLG: {decimal(16, 6)} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getCustomsreleaseflg() {
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {decimal(16, 6)} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public void setCustomsreleaseflg(java.math.BigDecimal customsreleaseflg) {
        __modifiedProperties.add("customsreleaseflg");
        this._customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] DAMAGEFLG: {decimal(16, 6)} <br>
     * 詰合せ状態
     * @return The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getDamageflg() {
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {decimal(16, 6)} <br>
     * 詰合せ状態
     * @param damageflg The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public void setDamageflg(java.math.BigDecimal damageflg) {
        __modifiedProperties.add("damageflg");
        this._damageflg = damageflg;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {decimal(16, 6)} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public java.math.BigDecimal getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {decimal(16, 6)} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(java.math.BigDecimal receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
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
     * [get] SENDRCVKEY: {IX, decimal(16, 6)} <br>
     * 送信入庫キー
     * @return The value of the column 'SENDRCVKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSendrcvkey() {
        return _sendrcvkey;
    }

    /**
     * [set] SENDRCVKEY: {IX, decimal(16, 6)} <br>
     * 送信入庫キー
     * @param sendrcvkey The value of the column 'SENDRCVKEY'. (NullAllowed)
     */
    public void setSendrcvkey(java.math.BigDecimal sendrcvkey) {
        __modifiedProperties.add("sendrcvkey");
        this._sendrcvkey = sendrcvkey;
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
     * [get] SYMBOLSTS: {NotNull, varchar(30)} <br>
     * 段ボールステータス
     * @return The value of the column 'SYMBOLSTS'. (NullAllowed)
     */
    public String getSymbolsts() {
        return _symbolsts;
    }

    /**
     * [set] SYMBOLSTS: {NotNull, varchar(30)} <br>
     * 段ボールステータス
     * @param symbolsts The value of the column 'SYMBOLSTS'. (NullAllowed)
     */
    public void setSymbolsts(String symbolsts) {
        __modifiedProperties.add("symbolsts");
        this._symbolsts = symbolsts;
    }

    /**
     * [get] SYMBOLADDFLG: {NotNull, varchar(30)} <br>
     * シンボル作成元フラグ
     * @return The value of the column 'SYMBOLADDFLG'. (NullAllowed)
     */
    public String getSymboladdflg() {
        return _symboladdflg;
    }

    /**
     * [set] SYMBOLADDFLG: {NotNull, varchar(30)} <br>
     * シンボル作成元フラグ
     * @param symboladdflg The value of the column 'SYMBOLADDFLG'. (NullAllowed)
     */
    public void setSymboladdflg(String symboladdflg) {
        __modifiedProperties.add("symboladdflg");
        this._symboladdflg = symboladdflg;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public String getPrintedflg() {
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        __modifiedProperties.add("printedflg");
        this._printedflg = printedflg;
    }

    /**
     * [get] SYMBOLSNDDATE: {varchar(8)} <br>
     * シンボル送信日
     * @return The value of the column 'SYMBOLSNDDATE'. (NullAllowed)
     */
    public String getSymbolsnddate() {
        return _symbolsnddate;
    }

    /**
     * [set] SYMBOLSNDDATE: {varchar(8)} <br>
     * シンボル送信日
     * @param symbolsnddate The value of the column 'SYMBOLSNDDATE'. (NullAllowed)
     */
    public void setSymbolsnddate(String symbolsnddate) {
        __modifiedProperties.add("symbolsnddate");
        this._symbolsnddate = symbolsnddate;
    }

    /**
     * [get] SYMBOLPASTDATE: {varchar(8)} <br>
     * シンボル貼付日
     * @return The value of the column 'SYMBOLPASTDATE'. (NullAllowed)
     */
    public String getSymbolpastdate() {
        return _symbolpastdate;
    }

    /**
     * [set] SYMBOLPASTDATE: {varchar(8)} <br>
     * シンボル貼付日
     * @param symbolpastdate The value of the column 'SYMBOLPASTDATE'. (NullAllowed)
     */
    public void setSymbolpastdate(String symbolpastdate) {
        __modifiedProperties.add("symbolpastdate");
        this._symbolpastdate = symbolpastdate;
    }

    /**
     * [get] SYMBOLPALLETONDATE: {varchar(8)} <br>
     * パレタイザ投入日
     * @return The value of the column 'SYMBOLPALLETONDATE'. (NullAllowed)
     */
    public String getSymbolpalletondate() {
        return _symbolpalletondate;
    }

    /**
     * [set] SYMBOLPALLETONDATE: {varchar(8)} <br>
     * パレタイザ投入日
     * @param symbolpalletondate The value of the column 'SYMBOLPALLETONDATE'. (NullAllowed)
     */
    public void setSymbolpalletondate(String symbolpalletondate) {
        __modifiedProperties.add("symbolpalletondate");
        this._symbolpalletondate = symbolpalletondate;
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
     * [get] PALLET_ID: {IX, bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public Long getPalletId() {
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {IX, bigint(19)} <br>
     * パレットはり紙情報ID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public void setPalletId(Long palletId) {
        __modifiedProperties.add("palletId");
        this._palletId = palletId;
    }

    /**
     * [get] BASE_PALLET_ID: {decimal(16, 6)} <br>
     * 親パレットはり紙情報ID
     * @return The value of the column 'BASE_PALLET_ID'. (NullAllowed)
     */
    public java.math.BigDecimal getBasePalletId() {
        return _basePalletId;
    }

    /**
     * [set] BASE_PALLET_ID: {decimal(16, 6)} <br>
     * 親パレットはり紙情報ID
     * @param basePalletId The value of the column 'BASE_PALLET_ID'. (NullAllowed)
     */
    public void setBasePalletId(java.math.BigDecimal basePalletId) {
        __modifiedProperties.add("basePalletId");
        this._basePalletId = basePalletId;
    }

    /**
     * [get] PARENTPALLETUPDDATE: {datetime2(26, 6)} <br>
     * 親パレット管理番号更新日時
     * @return The value of the column 'PARENTPALLETUPDDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getParentpalletupddate() {
        return _parentpalletupddate;
    }

    /**
     * [set] PARENTPALLETUPDDATE: {datetime2(26, 6)} <br>
     * 親パレット管理番号更新日時
     * @param parentpalletupddate The value of the column 'PARENTPALLETUPDDATE'. (NullAllowed)
     */
    public void setParentpalletupddate(java.sql.Timestamp parentpalletupddate) {
        __modifiedProperties.add("parentpalletupddate");
        this._parentpalletupddate = parentpalletupddate;
    }

    /**
     * [get] PRINTINGDATE: {varchar(8)} <br>
     * パレットはり紙作成日
     * @return The value of the column 'PRINTINGDATE'. (NullAllowed)
     */
    public String getPrintingdate() {
        return _printingdate;
    }

    /**
     * [set] PRINTINGDATE: {varchar(8)} <br>
     * パレットはり紙作成日
     * @param printingdate The value of the column 'PRINTINGDATE'. (NullAllowed)
     */
    public void setPrintingdate(String printingdate) {
        __modifiedProperties.add("printingdate");
        this._printingdate = printingdate;
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
     * [get] RESTQTY: {decimal(16, 6)} <br>
     * 残数量（個装）
     * @return The value of the column 'RESTQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqty() {
        return _restqty;
    }

    /**
     * [set] RESTQTY: {decimal(16, 6)} <br>
     * 残数量（個装）
     * @param restqty The value of the column 'RESTQTY'. (NullAllowed)
     */
    public void setRestqty(java.math.BigDecimal restqty) {
        __modifiedProperties.add("restqty");
        this._restqty = restqty;
    }

    /**
     * [get] RECEIVEDQTY: {decimal(16, 6)} <br>
     * 入庫実績数量（個装）
     * @return The value of the column 'RECEIVEDQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getReceivedqty() {
        return _receivedqty;
    }

    /**
     * [set] RECEIVEDQTY: {decimal(16, 6)} <br>
     * 入庫実績数量（個装）
     * @param receivedqty The value of the column 'RECEIVEDQTY'. (NullAllowed)
     */
    public void setReceivedqty(java.math.BigDecimal receivedqty) {
        __modifiedProperties.add("receivedqty");
        this._receivedqty = receivedqty;
    }

    /**
     * [get] DISTRIBUTIONCD: {varchar(30)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public String getDistributioncd() {
        return _distributioncd;
    }

    /**
     * [set] DISTRIBUTIONCD: {varchar(30)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public void setDistributioncd(String distributioncd) {
        __modifiedProperties.add("distributioncd");
        this._distributioncd = distributioncd;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed)
     */
    public String getOrderno() {
        return _orderno;
    }

    /**
     * [set] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed)
     */
    public void setOrderno(String orderno) {
        __modifiedProperties.add("orderno");
        this._orderno = orderno;
    }

    /**
     * [get] RCV_PALLET_ID: {bigint(19)} <br>
     * 入庫パレットID
     * @return The value of the column 'RCV_PALLET_ID'. (NullAllowed)
     */
    public Long getRcvPalletId() {
        return _rcvPalletId;
    }

    /**
     * [set] RCV_PALLET_ID: {bigint(19)} <br>
     * 入庫パレットID
     * @param rcvPalletId The value of the column 'RCV_PALLET_ID'. (NullAllowed)
     */
    public void setRcvPalletId(Long rcvPalletId) {
        __modifiedProperties.add("rcvPalletId");
        this._rcvPalletId = rcvPalletId;
    }

    /**
     * [get] SYMBOLFACTORYCD: {IX+, varchar(30)} <br>
     * 二次元コードの工場コード
     * @return The value of the column 'SYMBOLFACTORYCD'. (NullAllowed)
     */
    public String getSymbolfactorycd() {
        return _symbolfactorycd;
    }

    /**
     * [set] SYMBOLFACTORYCD: {IX+, varchar(30)} <br>
     * 二次元コードの工場コード
     * @param symbolfactorycd The value of the column 'SYMBOLFACTORYCD'. (NullAllowed)
     */
    public void setSymbolfactorycd(String symbolfactorycd) {
        __modifiedProperties.add("symbolfactorycd");
        this._symbolfactorycd = symbolfactorycd;
    }

    /**
     * [get] SYMBOLITEMCD: {varchar(30)} <br>
     * 二次元コードの銘柄コード
     * @return The value of the column 'SYMBOLITEMCD'. (NullAllowed)
     */
    public String getSymbolitemcd() {
        return _symbolitemcd;
    }

    /**
     * [set] SYMBOLITEMCD: {varchar(30)} <br>
     * 二次元コードの銘柄コード
     * @param symbolitemcd The value of the column 'SYMBOLITEMCD'. (NullAllowed)
     */
    public void setSymbolitemcd(String symbolitemcd) {
        __modifiedProperties.add("symbolitemcd");
        this._symbolitemcd = symbolitemcd;
    }

    /**
     * [get] SYMBOLSKU: {varchar(30)} <br>
     * 二次元コードのＳＫＵ
     * @return The value of the column 'SYMBOLSKU'. (NullAllowed)
     */
    public String getSymbolsku() {
        return _symbolsku;
    }

    /**
     * [set] SYMBOLSKU: {varchar(30)} <br>
     * 二次元コードのＳＫＵ
     * @param symbolsku The value of the column 'SYMBOLSKU'. (NullAllowed)
     */
    public void setSymbolsku(String symbolsku) {
        __modifiedProperties.add("symbolsku");
        this._symbolsku = symbolsku;
    }

    /**
     * [get] SYMBOLRECEIVECD: {varchar(30)} <br>
     * 二次元コードの仕向地コード
     * @return The value of the column 'SYMBOLRECEIVECD'. (NullAllowed)
     */
    public String getSymbolreceivecd() {
        return _symbolreceivecd;
    }

    /**
     * [set] SYMBOLRECEIVECD: {varchar(30)} <br>
     * 二次元コードの仕向地コード
     * @param symbolreceivecd The value of the column 'SYMBOLRECEIVECD'. (NullAllowed)
     */
    public void setSymbolreceivecd(String symbolreceivecd) {
        __modifiedProperties.add("symbolreceivecd");
        this._symbolreceivecd = symbolreceivecd;
    }

    /**
     * [get] SYMBOLPRODUCTMARK: {varchar(30)} <br>
     * 二次元コードの製造記号
     * @return The value of the column 'SYMBOLPRODUCTMARK'. (NullAllowed)
     */
    public String getSymbolproductmark() {
        return _symbolproductmark;
    }

    /**
     * [set] SYMBOLPRODUCTMARK: {varchar(30)} <br>
     * 二次元コードの製造記号
     * @param symbolproductmark The value of the column 'SYMBOLPRODUCTMARK'. (NullAllowed)
     */
    public void setSymbolproductmark(String symbolproductmark) {
        __modifiedProperties.add("symbolproductmark");
        this._symbolproductmark = symbolproductmark;
    }

    /**
     * [get] SYMBOLORDERNO: {varchar(30)} <br>
     * 二次元コードの発注番号
     * @return The value of the column 'SYMBOLORDERNO'. (NullAllowed)
     */
    public String getSymbolorderno() {
        return _symbolorderno;
    }

    /**
     * [set] SYMBOLORDERNO: {varchar(30)} <br>
     * 二次元コードの発注番号
     * @param symbolorderno The value of the column 'SYMBOLORDERNO'. (NullAllowed)
     */
    public void setSymbolorderno(String symbolorderno) {
        __modifiedProperties.add("symbolorderno");
        this._symbolorderno = symbolorderno;
    }

    /**
     * [get] SYMBOLPRINTERNO: {varchar(30)} <br>
     * 二次元コードの号機（印字機）
     * @return The value of the column 'SYMBOLPRINTERNO'. (NullAllowed)
     */
    public String getSymbolprinterno() {
        return _symbolprinterno;
    }

    /**
     * [set] SYMBOLPRINTERNO: {varchar(30)} <br>
     * 二次元コードの号機（印字機）
     * @param symbolprinterno The value of the column 'SYMBOLPRINTERNO'. (NullAllowed)
     */
    public void setSymbolprinterno(String symbolprinterno) {
        __modifiedProperties.add("symbolprinterno");
        this._symbolprinterno = symbolprinterno;
    }

    /**
     * [get] SYMBOLMAKENO: {varchar(30)} <br>
     * 二次元コードの生出番号
     * @return The value of the column 'SYMBOLMAKENO'. (NullAllowed)
     */
    public String getSymbolmakeno() {
        return _symbolmakeno;
    }

    /**
     * [set] SYMBOLMAKENO: {varchar(30)} <br>
     * 二次元コードの生出番号
     * @param symbolmakeno The value of the column 'SYMBOLMAKENO'. (NullAllowed)
     */
    public void setSymbolmakeno(String symbolmakeno) {
        __modifiedProperties.add("symbolmakeno");
        this._symbolmakeno = symbolmakeno;
    }

    /**
     * [get] SYMBOLLOT4: {varchar(30)} <br>
     * 二次元コードの製造年月日
     * @return The value of the column 'SYMBOLLOT4'. (NullAllowed)
     */
    public String getSymbollot4() {
        return _symbollot4;
    }

    /**
     * [set] SYMBOLLOT4: {varchar(30)} <br>
     * 二次元コードの製造年月日
     * @param symbollot4 The value of the column 'SYMBOLLOT4'. (NullAllowed)
     */
    public void setSymbollot4(String symbollot4) {
        __modifiedProperties.add("symbollot4");
        this._symbollot4 = symbollot4;
    }

    /**
     * [get] SYMBOLMAKETIME: {varchar(30)} <br>
     * 二次元コードの実製造時間
     * @return The value of the column 'SYMBOLMAKETIME'. (NullAllowed)
     */
    public String getSymbolmaketime() {
        return _symbolmaketime;
    }

    /**
     * [set] SYMBOLMAKETIME: {varchar(30)} <br>
     * 二次元コードの実製造時間
     * @param symbolmaketime The value of the column 'SYMBOLMAKETIME'. (NullAllowed)
     */
    public void setSymbolmaketime(String symbolmaketime) {
        __modifiedProperties.add("symbolmaketime");
        this._symbolmaketime = symbolmaketime;
    }

    /**
     * [get] SYMBOLCIRCULATIONID: {varchar(30)} <br>
     * 二次元コードの流通識別コード
     * @return The value of the column 'SYMBOLCIRCULATIONID'. (NullAllowed)
     */
    public String getSymbolcirculationid() {
        return _symbolcirculationid;
    }

    /**
     * [set] SYMBOLCIRCULATIONID: {varchar(30)} <br>
     * 二次元コードの流通識別コード
     * @param symbolcirculationid The value of the column 'SYMBOLCIRCULATIONID'. (NullAllowed)
     */
    public void setSymbolcirculationid(String symbolcirculationid) {
        __modifiedProperties.add("symbolcirculationid");
        this._symbolcirculationid = symbolcirculationid;
    }

    /**
     * [get] SYMBOLRCVKEY: {bigint(19)} <br>
     * 二次元コードの入荷予定ヘッダID
     * @return The value of the column 'SYMBOLRCVKEY'. (NullAllowed)
     */
    public Long getSymbolrcvkey() {
        return _symbolrcvkey;
    }

    /**
     * [set] SYMBOLRCVKEY: {bigint(19)} <br>
     * 二次元コードの入荷予定ヘッダID
     * @param symbolrcvkey The value of the column 'SYMBOLRCVKEY'. (NullAllowed)
     */
    public void setSymbolrcvkey(Long symbolrcvkey) {
        __modifiedProperties.add("symbolrcvkey");
        this._symbolrcvkey = symbolrcvkey;
    }

    /**
     * [get] SYMBOLLOT3: {varchar(30)} <br>
     * 二次元コードのデザイン区分
     * @return The value of the column 'SYMBOLLOT3'. (NullAllowed)
     */
    public String getSymbollot3() {
        return _symbollot3;
    }

    /**
     * [set] SYMBOLLOT3: {varchar(30)} <br>
     * 二次元コードのデザイン区分
     * @param symbollot3 The value of the column 'SYMBOLLOT3'. (NullAllowed)
     */
    public void setSymbollot3(String symbollot3) {
        __modifiedProperties.add("symbollot3");
        this._symbollot3 = symbollot3;
    }

    /**
     * [get] QRData: {varchar(255)} <br>
     * ２次元データ
     * @return The value of the column 'QRData'. (NullAllowed)
     */
    public String getQrdata() {
        return _qrdata;
    }

    /**
     * [set] QRData: {varchar(255)} <br>
     * ２次元データ
     * @param qrdata The value of the column 'QRData'. (NullAllowed)
     */
    public void setQrdata(String qrdata) {
        __modifiedProperties.add("qrdata");
        this._qrdata = qrdata;
    }

    /**
     * [get] TREXAMRESULT_ID: {IX, bigint(19)} <br>
     * 検査実績ID
     * @return The value of the column 'TREXAMRESULT_ID'. (NullAllowed)
     */
    public Long getTrexamresultId() {
        return _trexamresultId;
    }

    /**
     * [set] TREXAMRESULT_ID: {IX, bigint(19)} <br>
     * 検査実績ID
     * @param trexamresultId The value of the column 'TREXAMRESULT_ID'. (NullAllowed)
     */
    public void setTrexamresultId(Long trexamresultId) {
        __modifiedProperties.add("trexamresultId");
        this._trexamresultId = trexamresultId;
    }

    /**
     * [get] CASEITFNO: {varchar(30)} <br>
     * ITFNo.
     * @return The value of the column 'CASEITFNO'. (NullAllowed)
     */
    public String getCaseitfno() {
        return _caseitfno;
    }

    /**
     * [set] CASEITFNO: {varchar(30)} <br>
     * ITFNo.
     * @param caseitfno The value of the column 'CASEITFNO'. (NullAllowed)
     */
    public void setCaseitfno(String caseitfno) {
        __modifiedProperties.add("caseitfno");
        this._caseitfno = caseitfno;
    }

    /**
     * [get] CASEBARCODEVALIANT: {varchar(30)} <br>
     * Barcode Valiant
     * @return The value of the column 'CASEBARCODEVALIANT'. (NullAllowed)
     */
    public String getCasebarcodevaliant() {
        return _casebarcodevaliant;
    }

    /**
     * [set] CASEBARCODEVALIANT: {varchar(30)} <br>
     * Barcode Valiant
     * @param casebarcodevaliant The value of the column 'CASEBARCODEVALIANT'. (NullAllowed)
     */
    public void setCasebarcodevaliant(String casebarcodevaliant) {
        __modifiedProperties.add("casebarcodevaliant");
        this._casebarcodevaliant = casebarcodevaliant;
    }

    /**
     * [get] CASELOT4: {varchar(30)} <br>
     * 実製造年月日
     * @return The value of the column 'CASELOT4'. (NullAllowed)
     */
    public String getCaselot4() {
        return _caselot4;
    }

    /**
     * [set] CASELOT4: {varchar(30)} <br>
     * 実製造年月日
     * @param caselot4 The value of the column 'CASELOT4'. (NullAllowed)
     */
    public void setCaselot4(String caselot4) {
        __modifiedProperties.add("caselot4");
        this._caselot4 = caselot4;
    }

    /**
     * [get] DATETIME: {datetime2(26, 6)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getDatetime() {
        return _datetime;
    }

    /**
     * [set] DATETIME: {datetime2(26, 6)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed)
     */
    public void setDatetime(java.sql.Timestamp datetime) {
        __modifiedProperties.add("datetime");
        this._datetime = datetime;
    }

    /**
     * [get] CASECENTERNO: {varchar(30)} <br>
     * 拠点No.
     * @return The value of the column 'CASECENTERNO'. (NullAllowed)
     */
    public String getCasecenterno() {
        return _casecenterno;
    }

    /**
     * [set] CASECENTERNO: {varchar(30)} <br>
     * 拠点No.
     * @param casecenterno The value of the column 'CASECENTERNO'. (NullAllowed)
     */
    public void setCasecenterno(String casecenterno) {
        __modifiedProperties.add("casecenterno");
        this._casecenterno = casecenterno;
    }

    /**
     * [get] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo.
     * @return The value of the column 'CASEPACKNO'. (NullAllowed)
     */
    public String getCasepackno() {
        return _casepackno;
    }

    /**
     * [set] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo.
     * @param casepackno The value of the column 'CASEPACKNO'. (NullAllowed)
     */
    public void setCasepackno(String casepackno) {
        __modifiedProperties.add("casepackno");
        this._casepackno = casepackno;
    }

    /**
     * [get] CASEPACKTIME: {varchar(30)} <br>
     * ケースパッキング時間
     * @return The value of the column 'CASEPACKTIME'. (NullAllowed)
     */
    public String getCasepacktime() {
        return _casepacktime;
    }

    /**
     * [set] CASEPACKTIME: {varchar(30)} <br>
     * ケースパッキング時間
     * @param casepacktime The value of the column 'CASEPACKTIME'. (NullAllowed)
     */
    public void setCasepacktime(String casepacktime) {
        __modifiedProperties.add("casepacktime");
        this._casepacktime = casepacktime;
    }

    /**
     * [get] CASEBARCODE: {IX, varchar(60)} <br>
     * 段ボールバーコード
     * @return The value of the column 'CASEBARCODE'. (NullAllowed)
     */
    public String getCasebarcode() {
        return _casebarcode;
    }

    /**
     * [set] CASEBARCODE: {IX, varchar(60)} <br>
     * 段ボールバーコード
     * @param casebarcode The value of the column 'CASEBARCODE'. (NullAllowed)
     */
    public void setCasebarcode(String casebarcode) {
        __modifiedProperties.add("casebarcode");
        this._casebarcode = casebarcode;
    }

    /**
     * [get] MIXEDFLG: {char(1), default=[(0)]} <br>
     * 開封フラグ
     * @return The value of the column 'MIXEDFLG'. (NullAllowed)
     */
    public String getMixedflg() {
        return _mixedflg;
    }

    /**
     * [set] MIXEDFLG: {char(1), default=[(0)]} <br>
     * 開封フラグ
     * @param mixedflg The value of the column 'MIXEDFLG'. (NullAllowed)
     */
    public void setMixedflg(String mixedflg) {
        __modifiedProperties.add("mixedflg");
        this._mixedflg = mixedflg;
    }

    /**
     * [get] SHIPPEDFLG: {char(1), default=[(0)]} <br>
     * 出庫済フラグ
     * @return The value of the column 'SHIPPEDFLG'. (NullAllowed)
     */
    public String getShippedflg() {
        return _shippedflg;
    }

    /**
     * [set] SHIPPEDFLG: {char(1), default=[(0)]} <br>
     * 出庫済フラグ
     * @param shippedflg The value of the column 'SHIPPEDFLG'. (NullAllowed)
     */
    public void setShippedflg(String shippedflg) {
        __modifiedProperties.add("shippedflg");
        this._shippedflg = shippedflg;
    }

    /**
     * [get] CASECREATETYPE: {NotNull, varchar(30)} <br>
     * ケース作成区分
     * @return The value of the column 'CASECREATETYPE'. (NullAllowed)
     */
    public String getCasecreatetype() {
        return _casecreatetype;
    }

    /**
     * [set] CASECREATETYPE: {NotNull, varchar(30)} <br>
     * ケース作成区分
     * @param casecreatetype The value of the column 'CASECREATETYPE'. (NullAllowed)
     */
    public void setCasecreatetype(String casecreatetype) {
        __modifiedProperties.add("casecreatetype");
        this._casecreatetype = casecreatetype;
    }

    /**
     * [get] CREATEDATETIME: {datetime2(26, 6)} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getCreatedatetime() {
        return _createdatetime;
    }

    /**
     * [set] CREATEDATETIME: {datetime2(26, 6)} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public void setCreatedatetime(java.sql.Timestamp createdatetime) {
        __modifiedProperties.add("createdatetime");
        this._createdatetime = createdatetime;
    }

    /**
     * [get] InitNum: {bigint(19)} <br>
     * ケース初期数量
     * @return The value of the column 'InitNum'. (NullAllowed)
     */
    public Long getInitnum() {
        return _initnum;
    }

    /**
     * [set] InitNum: {bigint(19)} <br>
     * ケース初期数量
     * @param initnum The value of the column 'InitNum'. (NullAllowed)
     */
    public void setInitnum(Long initnum) {
        __modifiedProperties.add("initnum");
        this._initnum = initnum;
    }

    /**
     * [get] ParentCaseCd: {bigint(19)} <br>
     * 親ケースCD
     * @return The value of the column 'ParentCaseCd'. (NullAllowed)
     */
    public Long getParentcasecd() {
        return _parentcasecd;
    }

    /**
     * [set] ParentCaseCd: {bigint(19)} <br>
     * 親ケースCD
     * @param parentcasecd The value of the column 'ParentCaseCd'. (NullAllowed)
     */
    public void setParentcasecd(Long parentcasecd) {
        __modifiedProperties.add("parentcasecd");
        this._parentcasecd = parentcasecd;
    }

    /**
     * [get] TR_PICKLIST_ID: {bigint(19)} <br>
     * 山出しリストID
     * @return The value of the column 'TR_PICKLIST_ID'. (NullAllowed)
     */
    public Long getTrPicklistId() {
        return _trPicklistId;
    }

    /**
     * [set] TR_PICKLIST_ID: {bigint(19)} <br>
     * 山出しリストID
     * @param trPicklistId The value of the column 'TR_PICKLIST_ID'. (NullAllowed)
     */
    public void setTrPicklistId(Long trPicklistId) {
        __modifiedProperties.add("trPicklistId");
        this._trPicklistId = trPicklistId;
    }

    /**
     * [get] PicklistGNo: {bigint(19)} <br>
     * 山出しリスト明細行№
     * @return The value of the column 'PicklistGNo'. (NullAllowed)
     */
    public Long getPicklistgno() {
        return _picklistgno;
    }

    /**
     * [set] PicklistGNo: {bigint(19)} <br>
     * 山出しリスト明細行№
     * @param picklistgno The value of the column 'PicklistGNo'. (NullAllowed)
     */
    public void setPicklistgno(Long picklistgno) {
        __modifiedProperties.add("picklistgno");
        this._picklistgno = picklistgno;
    }

    /**
     * [get] RecombDatetime: {datetime2(26, 6)} <br>
     * 最終組替日時
     * @return The value of the column 'RecombDatetime'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getRecombdatetime() {
        return _recombdatetime;
    }

    /**
     * [set] RecombDatetime: {datetime2(26, 6)} <br>
     * 最終組替日時
     * @param recombdatetime The value of the column 'RecombDatetime'. (NullAllowed)
     */
    public void setRecombdatetime(java.sql.Timestamp recombdatetime) {
        __modifiedProperties.add("recombdatetime");
        this._recombdatetime = recombdatetime;
    }

    /**
     * [get] ReprintedFlg: {varchar(30)} <br>
     * 再印刷区分
     * @return The value of the column 'ReprintedFlg'. (NullAllowed)
     */
    public String getReprintedflg() {
        return _reprintedflg;
    }

    /**
     * [set] ReprintedFlg: {varchar(30)} <br>
     * 再印刷区分
     * @param reprintedflg The value of the column 'ReprintedFlg'. (NullAllowed)
     */
    public void setReprintedflg(String reprintedflg) {
        __modifiedProperties.add("reprintedflg");
        this._reprintedflg = reprintedflg;
    }

    /**
     * [get] TraceSts: {bigint(19)} <br>
     * 追跡状態
     * @return The value of the column 'TraceSts'. (NullAllowed)
     */
    public Long getTracests() {
        return _tracests;
    }

    /**
     * [set] TraceSts: {bigint(19)} <br>
     * 追跡状態
     * @param tracests The value of the column 'TraceSts'. (NullAllowed)
     */
    public void setTracests(Long tracests) {
        __modifiedProperties.add("tracests");
        this._tracests = tracests;
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
     * [get] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @return The value of the column 'BATJPRODUCTIONYM'. (NullAllowed)
     */
    public String getBatjproductionym() {
        return _batjproductionym;
    }

    /**
     * [set] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @param batjproductionym The value of the column 'BATJPRODUCTIONYM'. (NullAllowed)
     */
    public void setBatjproductionym(String batjproductionym) {
        __modifiedProperties.add("batjproductionym");
        this._batjproductionym = batjproductionym;
    }

    /**
     * [get] COMETODATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'COMETODATE'. (NullAllowed)
     */
    public String getCometodate() {
        return _cometodate;
    }

    /**
     * [set] COMETODATE: {varchar(8)} <br>
     * 入港日
     * @param cometodate The value of the column 'COMETODATE'. (NullAllowed)
     */
    public void setCometodate(String cometodate) {
        __modifiedProperties.add("cometodate");
        this._cometodate = cometodate;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public String getRcvpalletno() {
        return _rcvpalletno;
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public void setRcvpalletno(String rcvpalletno) {
        __modifiedProperties.add("rcvpalletno");
        this._rcvpalletno = rcvpalletno;
    }

    /**
     * [get] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @return The value of the column 'TAXPALLETNO'. (NullAllowed)
     */
    public String getTaxpalletno() {
        return _taxpalletno;
    }

    /**
     * [set] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @param taxpalletno The value of the column 'TAXPALLETNO'. (NullAllowed)
     */
    public void setTaxpalletno(String taxpalletno) {
        __modifiedProperties.add("taxpalletno");
        this._taxpalletno = taxpalletno;
    }

    /**
     * [get] SHTYPECD: {varchar(30)} <br>
     * 輸送形態CD
     * @return The value of the column 'SHTYPECD'. (NullAllowed)
     */
    public String getShtypecd() {
        return _shtypecd;
    }

    /**
     * [set] SHTYPECD: {varchar(30)} <br>
     * 輸送形態CD
     * @param shtypecd The value of the column 'SHTYPECD'. (NullAllowed)
     */
    public void setShtypecd(String shtypecd) {
        __modifiedProperties.add("shtypecd");
        this._shtypecd = shtypecd;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] RESTCTN: {decimal(16, 6)} <br>
     * 残数量（カートン）
     * @return The value of the column 'RESTCTN'. (NullAllowed)
     */
    public java.math.BigDecimal getRestctn() {
        return _restctn;
    }

    /**
     * [set] RESTCTN: {decimal(16, 6)} <br>
     * 残数量（カートン）
     * @param restctn The value of the column 'RESTCTN'. (NullAllowed)
     */
    public void setRestctn(java.math.BigDecimal restctn) {
        __modifiedProperties.add("restctn");
        this._restctn = restctn;
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
