package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlCardboardMoveHistoryList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSYMBOL_ID, RECEIVE_PLAN_H_ID, SYMBOL_MAKE_NO, DAMAGE_FLG_CD, DAMAGE_FLG, LOCATION_CD, LOC_GROUP_CD, LOC_GROUP, DESTINATION_CD, DESTINATION_NM, RECEIVE_DATE, SHIP_DATE, SYMBOL_ITEM_CD, PRODUCT_NM, LOT1, SYMBOL_LOT4, SYMBOL_LOT3_CD, SYMBOL_LOT3, SYMBOL_PRINTER_NO, SYMBOL_PRODUCT_MARK, STOCK_TYPE_CD, OTHERLOT1, CASE_ITF_NO, CASE_BARCODE_VALIANT, CASE_LOT4, CASE_CENTER_NO, CASE_PACK_NO, CASE_PACK_TIME, FROM_ADDRESS1, CARRIER_NAME, CARRIER_WB_NO, CARRIER_NO, CARRIER_S_NAME, OPEN_FLG_CD, OPEN_FLG, MAKER_CASE_NO, RESTQTY_BOWL, RESTQTY_CARTON, UNIT1, UNIT2, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlCardboardMoveHistoryListDto implements Serializable {

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
    /** TRSYMBOL_ID: {bigint(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** SYMBOL_MAKE_NO: {varchar(30)} */
    @JsonKey
    protected String _symbolMakeNo;

    /** DAMAGE_FLG_CD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _damageFlgCd;

    /** DAMAGE_FLG: {int(10)} */
    @JsonKey
    protected String _damageFlg;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** LOC_GROUP_CD: {varchar(30)} */
    @JsonKey
    protected String _locGroupCd;

    /** LOC_GROUP: {int(10)} */
    @JsonKey
    protected String _locGroup;

    /** DESTINATION_CD: {varchar(60)} */
    @JsonKey
    protected String _destinationCd;

    /** DESTINATION_NM: {varchar(255)} */
    @JsonKey
    protected String _destinationNm;

    /** RECEIVE_DATE: {varchar(8)} */
    @JsonKey
    protected String _receiveDate;

    /** SHIP_DATE: {varchar(8)} */
    @JsonKey
    protected String _shipDate;

    /** SYMBOL_ITEM_CD: {varchar(30)} */
    @JsonKey
    protected String _symbolItemCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** LOT1: {varchar(30)} */
    @JsonKey
    protected String _lot1;

    /** SYMBOL_LOT4: {varchar(30)} */
    @JsonKey
    protected String _symbolLot4;

    /** SYMBOL_LOT3_CD: {varchar(30)} */
    @JsonKey
    protected String _symbolLot3Cd;

    /** SYMBOL_LOT3: {int(10)} */
    @JsonKey
    protected String _symbolLot3;

    /** SYMBOL_PRINTER_NO: {varchar(30)} */
    @JsonKey
    protected String _symbolPrinterNo;

    /** SYMBOL_PRODUCT_MARK: {varchar(30)} */
    @JsonKey
    protected String _symbolProductMark;

    /** STOCK_TYPE_CD: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** OTHERLOT1: {int(10)} */
    @JsonKey
    protected String _otherlot1;

    /** CASE_ITF_NO: {varchar(30)} */
    @JsonKey
    protected String _caseItfNo;

    /** CASE_BARCODE_VALIANT: {varchar(30)} */
    @JsonKey
    protected String _caseBarcodeValiant;

    /** CASE_LOT4: {varchar(30)} */
    @JsonKey
    protected String _caseLot4;

    /** CASE_CENTER_NO: {varchar(30)} */
    @JsonKey
    protected String _caseCenterNo;

    /** CASE_PACK_NO: {varchar(30)} */
    @JsonKey
    protected String _casePackNo;

    /** CASE_PACK_TIME: {varchar(30)} */
    @JsonKey
    protected String _casePackTime;

    /** FROM_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _fromAddress1;

    /** CARRIER_NAME: {varchar(255)} */
    @JsonKey
    protected String _carrierName;

    /** CARRIER_WB_NO: {varchar(60)} */
    @JsonKey
    protected String _carrierWbNo;

    /** CARRIER_NO: {varchar(60)} */
    @JsonKey
    protected String _carrierNo;

    /** CARRIER_S_NAME: {varchar(100)} */
    @JsonKey
    protected String _carrierSName;

    /** OPEN_FLG_CD: {char(1)} */
    @JsonKey
    protected String _openFlgCd;

    /** OPEN_FLG: {int(10)} */
    @JsonKey
    protected String _openFlg;

    /** MAKER_CASE_NO: {varchar(60)} */
    @JsonKey
    protected String _makerCaseNo;

    /** RESTQTY_BOWL: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restqtyBowl;

    /** RESTQTY_CARTON: {int(10)} */
    @JsonKey
    protected java.math.BigDecimal _restqtyCarton;

    /** UNIT1: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit2;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlCardboardMoveHistoryListDto() {
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
        if (other == null || !(other instanceof BsSqlCardboardMoveHistoryListDto)) { return false; }
        final BsSqlCardboardMoveHistoryListDto otherEntity = (BsSqlCardboardMoveHistoryListDto)other;
        if (!helpComparingValue(getTrsymbolId(), otherEntity.getTrsymbolId())) { return false; }
        if (!helpComparingValue(getReceivePlanHId(), otherEntity.getReceivePlanHId())) { return false; }
        if (!helpComparingValue(getSymbolMakeNo(), otherEntity.getSymbolMakeNo())) { return false; }
        if (!helpComparingValue(getDamageFlgCd(), otherEntity.getDamageFlgCd())) { return false; }
        if (!helpComparingValue(getDamageFlg(), otherEntity.getDamageFlg())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getLocGroupCd(), otherEntity.getLocGroupCd())) { return false; }
        if (!helpComparingValue(getLocGroup(), otherEntity.getLocGroup())) { return false; }
        if (!helpComparingValue(getDestinationCd(), otherEntity.getDestinationCd())) { return false; }
        if (!helpComparingValue(getDestinationNm(), otherEntity.getDestinationNm())) { return false; }
        if (!helpComparingValue(getReceiveDate(), otherEntity.getReceiveDate())) { return false; }
        if (!helpComparingValue(getShipDate(), otherEntity.getShipDate())) { return false; }
        if (!helpComparingValue(getSymbolItemCd(), otherEntity.getSymbolItemCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getLot1(), otherEntity.getLot1())) { return false; }
        if (!helpComparingValue(getSymbolLot4(), otherEntity.getSymbolLot4())) { return false; }
        if (!helpComparingValue(getSymbolLot3Cd(), otherEntity.getSymbolLot3Cd())) { return false; }
        if (!helpComparingValue(getSymbolLot3(), otherEntity.getSymbolLot3())) { return false; }
        if (!helpComparingValue(getSymbolPrinterNo(), otherEntity.getSymbolPrinterNo())) { return false; }
        if (!helpComparingValue(getSymbolProductMark(), otherEntity.getSymbolProductMark())) { return false; }
        if (!helpComparingValue(getStockTypeCd(), otherEntity.getStockTypeCd())) { return false; }
        if (!helpComparingValue(getOtherlot1(), otherEntity.getOtherlot1())) { return false; }
        if (!helpComparingValue(getCaseItfNo(), otherEntity.getCaseItfNo())) { return false; }
        if (!helpComparingValue(getCaseBarcodeValiant(), otherEntity.getCaseBarcodeValiant())) { return false; }
        if (!helpComparingValue(getCaseLot4(), otherEntity.getCaseLot4())) { return false; }
        if (!helpComparingValue(getCaseCenterNo(), otherEntity.getCaseCenterNo())) { return false; }
        if (!helpComparingValue(getCasePackNo(), otherEntity.getCasePackNo())) { return false; }
        if (!helpComparingValue(getCasePackTime(), otherEntity.getCasePackTime())) { return false; }
        if (!helpComparingValue(getFromAddress1(), otherEntity.getFromAddress1())) { return false; }
        if (!helpComparingValue(getCarrierName(), otherEntity.getCarrierName())) { return false; }
        if (!helpComparingValue(getCarrierWbNo(), otherEntity.getCarrierWbNo())) { return false; }
        if (!helpComparingValue(getCarrierNo(), otherEntity.getCarrierNo())) { return false; }
        if (!helpComparingValue(getCarrierSName(), otherEntity.getCarrierSName())) { return false; }
        if (!helpComparingValue(getOpenFlgCd(), otherEntity.getOpenFlgCd())) { return false; }
        if (!helpComparingValue(getOpenFlg(), otherEntity.getOpenFlg())) { return false; }
        if (!helpComparingValue(getMakerCaseNo(), otherEntity.getMakerCaseNo())) { return false; }
        if (!helpComparingValue(getRestqtyBowl(), otherEntity.getRestqtyBowl())) { return false; }
        if (!helpComparingValue(getRestqtyCarton(), otherEntity.getRestqtyCarton())) { return false; }
        if (!helpComparingValue(getUnit1(), otherEntity.getUnit1())) { return false; }
        if (!helpComparingValue(getUnit2(), otherEntity.getUnit2())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlCardboardMoveHistoryList");
        result = xCH(result, getTrsymbolId());
        result = xCH(result, getReceivePlanHId());
        result = xCH(result, getSymbolMakeNo());
        result = xCH(result, getDamageFlgCd());
        result = xCH(result, getDamageFlg());
        result = xCH(result, getLocationCd());
        result = xCH(result, getLocGroupCd());
        result = xCH(result, getLocGroup());
        result = xCH(result, getDestinationCd());
        result = xCH(result, getDestinationNm());
        result = xCH(result, getReceiveDate());
        result = xCH(result, getShipDate());
        result = xCH(result, getSymbolItemCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getLot1());
        result = xCH(result, getSymbolLot4());
        result = xCH(result, getSymbolLot3Cd());
        result = xCH(result, getSymbolLot3());
        result = xCH(result, getSymbolPrinterNo());
        result = xCH(result, getSymbolProductMark());
        result = xCH(result, getStockTypeCd());
        result = xCH(result, getOtherlot1());
        result = xCH(result, getCaseItfNo());
        result = xCH(result, getCaseBarcodeValiant());
        result = xCH(result, getCaseLot4());
        result = xCH(result, getCaseCenterNo());
        result = xCH(result, getCasePackNo());
        result = xCH(result, getCasePackTime());
        result = xCH(result, getFromAddress1());
        result = xCH(result, getCarrierName());
        result = xCH(result, getCarrierWbNo());
        result = xCH(result, getCarrierNo());
        result = xCH(result, getCarrierSName());
        result = xCH(result, getOpenFlgCd());
        result = xCH(result, getOpenFlg());
        result = xCH(result, getMakerCaseNo());
        result = xCH(result, getRestqtyBowl());
        result = xCH(result, getRestqtyCarton());
        result = xCH(result, getUnit1());
        result = xCH(result, getUnit2());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
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
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getSymbolMakeNo());
        sb.append(c).append(getDamageFlgCd());
        sb.append(c).append(getDamageFlg());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocGroupCd());
        sb.append(c).append(getLocGroup());
        sb.append(c).append(getDestinationCd());
        sb.append(c).append(getDestinationNm());
        sb.append(c).append(getReceiveDate());
        sb.append(c).append(getShipDate());
        sb.append(c).append(getSymbolItemCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getLot1());
        sb.append(c).append(getSymbolLot4());
        sb.append(c).append(getSymbolLot3Cd());
        sb.append(c).append(getSymbolLot3());
        sb.append(c).append(getSymbolPrinterNo());
        sb.append(c).append(getSymbolProductMark());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getCaseItfNo());
        sb.append(c).append(getCaseBarcodeValiant());
        sb.append(c).append(getCaseLot4());
        sb.append(c).append(getCaseCenterNo());
        sb.append(c).append(getCasePackNo());
        sb.append(c).append(getCasePackTime());
        sb.append(c).append(getFromAddress1());
        sb.append(c).append(getCarrierName());
        sb.append(c).append(getCarrierWbNo());
        sb.append(c).append(getCarrierNo());
        sb.append(c).append(getCarrierSName());
        sb.append(c).append(getOpenFlgCd());
        sb.append(c).append(getOpenFlg());
        sb.append(c).append(getMakerCaseNo());
        sb.append(c).append(getRestqtyBowl());
        sb.append(c).append(getRestqtyCarton());
        sb.append(c).append(getUnit1());
        sb.append(c).append(getUnit2());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSYMBOL_ID: {bigint(19)} <br>
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {bigint(19)} <br>
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] SYMBOL_MAKE_NO: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_MAKE_NO'. (NullAllowed)
     */
    public String getSymbolMakeNo() {
        return _symbolMakeNo;
    }

    /**
     * [set] SYMBOL_MAKE_NO: {varchar(30)} <br>
     * @param symbolMakeNo The value of the column 'SYMBOL_MAKE_NO'. (NullAllowed)
     */
    public void setSymbolMakeNo(String symbolMakeNo) {
        __modifiedProperties.add("symbolMakeNo");
        this._symbolMakeNo = symbolMakeNo;
    }

    /**
     * [get] DAMAGE_FLG_CD: {decimal(16, 6)} <br>
     * @return The value of the column 'DAMAGE_FLG_CD'. (NullAllowed)
     */
    public java.math.BigDecimal getDamageFlgCd() {
        return _damageFlgCd;
    }

    /**
     * [set] DAMAGE_FLG_CD: {decimal(16, 6)} <br>
     * @param damageFlgCd The value of the column 'DAMAGE_FLG_CD'. (NullAllowed)
     */
    public void setDamageFlgCd(java.math.BigDecimal damageFlgCd) {
        __modifiedProperties.add("damageFlgCd");
        this._damageFlgCd = damageFlgCd;
    }

    /**
     * [get] DAMAGE_FLG: {int(10)} <br>
     * @return The value of the column 'DAMAGE_FLG'. (NullAllowed)
     */
    public String getDamageFlg() {
        return _damageFlg;
    }

    /**
     * [set] DAMAGE_FLG: {int(10)} <br>
     * @param damageFlg The value of the column 'DAMAGE_FLG'. (NullAllowed)
     */
    public void setDamageFlg(String damageFlg) {
        __modifiedProperties.add("damageFlg");
        this._damageFlg = damageFlg;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOC_GROUP_CD: {varchar(30)} <br>
     * @return The value of the column 'LOC_GROUP_CD'. (NullAllowed)
     */
    public String getLocGroupCd() {
        return _locGroupCd;
    }

    /**
     * [set] LOC_GROUP_CD: {varchar(30)} <br>
     * @param locGroupCd The value of the column 'LOC_GROUP_CD'. (NullAllowed)
     */
    public void setLocGroupCd(String locGroupCd) {
        __modifiedProperties.add("locGroupCd");
        this._locGroupCd = locGroupCd;
    }

    /**
     * [get] LOC_GROUP: {int(10)} <br>
     * @return The value of the column 'LOC_GROUP'. (NullAllowed)
     */
    public String getLocGroup() {
        return _locGroup;
    }

    /**
     * [set] LOC_GROUP: {int(10)} <br>
     * @param locGroup The value of the column 'LOC_GROUP'. (NullAllowed)
     */
    public void setLocGroup(String locGroup) {
        __modifiedProperties.add("locGroup");
        this._locGroup = locGroup;
    }

    /**
     * [get] DESTINATION_CD: {varchar(60)} <br>
     * @return The value of the column 'DESTINATION_CD'. (NullAllowed)
     */
    public String getDestinationCd() {
        return _destinationCd;
    }

    /**
     * [set] DESTINATION_CD: {varchar(60)} <br>
     * @param destinationCd The value of the column 'DESTINATION_CD'. (NullAllowed)
     */
    public void setDestinationCd(String destinationCd) {
        __modifiedProperties.add("destinationCd");
        this._destinationCd = destinationCd;
    }

    /**
     * [get] DESTINATION_NM: {varchar(255)} <br>
     * @return The value of the column 'DESTINATION_NM'. (NullAllowed)
     */
    public String getDestinationNm() {
        return _destinationNm;
    }

    /**
     * [set] DESTINATION_NM: {varchar(255)} <br>
     * @param destinationNm The value of the column 'DESTINATION_NM'. (NullAllowed)
     */
    public void setDestinationNm(String destinationNm) {
        __modifiedProperties.add("destinationNm");
        this._destinationNm = destinationNm;
    }

    /**
     * [get] RECEIVE_DATE: {varchar(8)} <br>
     * @return The value of the column 'RECEIVE_DATE'. (NullAllowed)
     */
    public String getReceiveDate() {
        return _receiveDate;
    }

    /**
     * [set] RECEIVE_DATE: {varchar(8)} <br>
     * @param receiveDate The value of the column 'RECEIVE_DATE'. (NullAllowed)
     */
    public void setReceiveDate(String receiveDate) {
        __modifiedProperties.add("receiveDate");
        this._receiveDate = receiveDate;
    }

    /**
     * [get] SHIP_DATE: {varchar(8)} <br>
     * @return The value of the column 'SHIP_DATE'. (NullAllowed)
     */
    public String getShipDate() {
        return _shipDate;
    }

    /**
     * [set] SHIP_DATE: {varchar(8)} <br>
     * @param shipDate The value of the column 'SHIP_DATE'. (NullAllowed)
     */
    public void setShipDate(String shipDate) {
        __modifiedProperties.add("shipDate");
        this._shipDate = shipDate;
    }

    /**
     * [get] SYMBOL_ITEM_CD: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_ITEM_CD'. (NullAllowed)
     */
    public String getSymbolItemCd() {
        return _symbolItemCd;
    }

    /**
     * [set] SYMBOL_ITEM_CD: {varchar(30)} <br>
     * @param symbolItemCd The value of the column 'SYMBOL_ITEM_CD'. (NullAllowed)
     */
    public void setSymbolItemCd(String symbolItemCd) {
        __modifiedProperties.add("symbolItemCd");
        this._symbolItemCd = symbolItemCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] LOT1: {varchar(30)} <br>
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(30)} <br>
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] SYMBOL_LOT4: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_LOT4'. (NullAllowed)
     */
    public String getSymbolLot4() {
        return _symbolLot4;
    }

    /**
     * [set] SYMBOL_LOT4: {varchar(30)} <br>
     * @param symbolLot4 The value of the column 'SYMBOL_LOT4'. (NullAllowed)
     */
    public void setSymbolLot4(String symbolLot4) {
        __modifiedProperties.add("symbolLot4");
        this._symbolLot4 = symbolLot4;
    }

    /**
     * [get] SYMBOL_LOT3_CD: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_LOT3_CD'. (NullAllowed)
     */
    public String getSymbolLot3Cd() {
        return _symbolLot3Cd;
    }

    /**
     * [set] SYMBOL_LOT3_CD: {varchar(30)} <br>
     * @param symbolLot3Cd The value of the column 'SYMBOL_LOT3_CD'. (NullAllowed)
     */
    public void setSymbolLot3Cd(String symbolLot3Cd) {
        __modifiedProperties.add("symbolLot3Cd");
        this._symbolLot3Cd = symbolLot3Cd;
    }

    /**
     * [get] SYMBOL_LOT3: {int(10)} <br>
     * @return The value of the column 'SYMBOL_LOT3'. (NullAllowed)
     */
    public String getSymbolLot3() {
        return _symbolLot3;
    }

    /**
     * [set] SYMBOL_LOT3: {int(10)} <br>
     * @param symbolLot3 The value of the column 'SYMBOL_LOT3'. (NullAllowed)
     */
    public void setSymbolLot3(String symbolLot3) {
        __modifiedProperties.add("symbolLot3");
        this._symbolLot3 = symbolLot3;
    }

    /**
     * [get] SYMBOL_PRINTER_NO: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_PRINTER_NO'. (NullAllowed)
     */
    public String getSymbolPrinterNo() {
        return _symbolPrinterNo;
    }

    /**
     * [set] SYMBOL_PRINTER_NO: {varchar(30)} <br>
     * @param symbolPrinterNo The value of the column 'SYMBOL_PRINTER_NO'. (NullAllowed)
     */
    public void setSymbolPrinterNo(String symbolPrinterNo) {
        __modifiedProperties.add("symbolPrinterNo");
        this._symbolPrinterNo = symbolPrinterNo;
    }

    /**
     * [get] SYMBOL_PRODUCT_MARK: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_PRODUCT_MARK'. (NullAllowed)
     */
    public String getSymbolProductMark() {
        return _symbolProductMark;
    }

    /**
     * [set] SYMBOL_PRODUCT_MARK: {varchar(30)} <br>
     * @param symbolProductMark The value of the column 'SYMBOL_PRODUCT_MARK'. (NullAllowed)
     */
    public void setSymbolProductMark(String symbolProductMark) {
        __modifiedProperties.add("symbolProductMark");
        this._symbolProductMark = symbolProductMark;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] OTHERLOT1: {int(10)} <br>
     * @return The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public String getOtherlot1() {
        return _otherlot1;
    }

    /**
     * [set] OTHERLOT1: {int(10)} <br>
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public void setOtherlot1(String otherlot1) {
        __modifiedProperties.add("otherlot1");
        this._otherlot1 = otherlot1;
    }

    /**
     * [get] CASE_ITF_NO: {varchar(30)} <br>
     * @return The value of the column 'CASE_ITF_NO'. (NullAllowed)
     */
    public String getCaseItfNo() {
        return _caseItfNo;
    }

    /**
     * [set] CASE_ITF_NO: {varchar(30)} <br>
     * @param caseItfNo The value of the column 'CASE_ITF_NO'. (NullAllowed)
     */
    public void setCaseItfNo(String caseItfNo) {
        __modifiedProperties.add("caseItfNo");
        this._caseItfNo = caseItfNo;
    }

    /**
     * [get] CASE_BARCODE_VALIANT: {varchar(30)} <br>
     * @return The value of the column 'CASE_BARCODE_VALIANT'. (NullAllowed)
     */
    public String getCaseBarcodeValiant() {
        return _caseBarcodeValiant;
    }

    /**
     * [set] CASE_BARCODE_VALIANT: {varchar(30)} <br>
     * @param caseBarcodeValiant The value of the column 'CASE_BARCODE_VALIANT'. (NullAllowed)
     */
    public void setCaseBarcodeValiant(String caseBarcodeValiant) {
        __modifiedProperties.add("caseBarcodeValiant");
        this._caseBarcodeValiant = caseBarcodeValiant;
    }

    /**
     * [get] CASE_LOT4: {varchar(30)} <br>
     * @return The value of the column 'CASE_LOT4'. (NullAllowed)
     */
    public String getCaseLot4() {
        return _caseLot4;
    }

    /**
     * [set] CASE_LOT4: {varchar(30)} <br>
     * @param caseLot4 The value of the column 'CASE_LOT4'. (NullAllowed)
     */
    public void setCaseLot4(String caseLot4) {
        __modifiedProperties.add("caseLot4");
        this._caseLot4 = caseLot4;
    }

    /**
     * [get] CASE_CENTER_NO: {varchar(30)} <br>
     * @return The value of the column 'CASE_CENTER_NO'. (NullAllowed)
     */
    public String getCaseCenterNo() {
        return _caseCenterNo;
    }

    /**
     * [set] CASE_CENTER_NO: {varchar(30)} <br>
     * @param caseCenterNo The value of the column 'CASE_CENTER_NO'. (NullAllowed)
     */
    public void setCaseCenterNo(String caseCenterNo) {
        __modifiedProperties.add("caseCenterNo");
        this._caseCenterNo = caseCenterNo;
    }

    /**
     * [get] CASE_PACK_NO: {varchar(30)} <br>
     * @return The value of the column 'CASE_PACK_NO'. (NullAllowed)
     */
    public String getCasePackNo() {
        return _casePackNo;
    }

    /**
     * [set] CASE_PACK_NO: {varchar(30)} <br>
     * @param casePackNo The value of the column 'CASE_PACK_NO'. (NullAllowed)
     */
    public void setCasePackNo(String casePackNo) {
        __modifiedProperties.add("casePackNo");
        this._casePackNo = casePackNo;
    }

    /**
     * [get] CASE_PACK_TIME: {varchar(30)} <br>
     * @return The value of the column 'CASE_PACK_TIME'. (NullAllowed)
     */
    public String getCasePackTime() {
        return _casePackTime;
    }

    /**
     * [set] CASE_PACK_TIME: {varchar(30)} <br>
     * @param casePackTime The value of the column 'CASE_PACK_TIME'. (NullAllowed)
     */
    public void setCasePackTime(String casePackTime) {
        __modifiedProperties.add("casePackTime");
        this._casePackTime = casePackTime;
    }

    /**
     * [get] FROM_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'FROM_ADDRESS1'. (NullAllowed)
     */
    public String getFromAddress1() {
        return _fromAddress1;
    }

    /**
     * [set] FROM_ADDRESS1: {varchar(255)} <br>
     * @param fromAddress1 The value of the column 'FROM_ADDRESS1'. (NullAllowed)
     */
    public void setFromAddress1(String fromAddress1) {
        __modifiedProperties.add("fromAddress1");
        this._fromAddress1 = fromAddress1;
    }

    /**
     * [get] CARRIER_NAME: {varchar(255)} <br>
     * @return The value of the column 'CARRIER_NAME'. (NullAllowed)
     */
    public String getCarrierName() {
        return _carrierName;
    }

    /**
     * [set] CARRIER_NAME: {varchar(255)} <br>
     * @param carrierName The value of the column 'CARRIER_NAME'. (NullAllowed)
     */
    public void setCarrierName(String carrierName) {
        __modifiedProperties.add("carrierName");
        this._carrierName = carrierName;
    }

    /**
     * [get] CARRIER_WB_NO: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_WB_NO'. (NullAllowed)
     */
    public String getCarrierWbNo() {
        return _carrierWbNo;
    }

    /**
     * [set] CARRIER_WB_NO: {varchar(60)} <br>
     * @param carrierWbNo The value of the column 'CARRIER_WB_NO'. (NullAllowed)
     */
    public void setCarrierWbNo(String carrierWbNo) {
        __modifiedProperties.add("carrierWbNo");
        this._carrierWbNo = carrierWbNo;
    }

    /**
     * [get] CARRIER_NO: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NO'. (NullAllowed)
     */
    public String getCarrierNo() {
        return _carrierNo;
    }

    /**
     * [set] CARRIER_NO: {varchar(60)} <br>
     * @param carrierNo The value of the column 'CARRIER_NO'. (NullAllowed)
     */
    public void setCarrierNo(String carrierNo) {
        __modifiedProperties.add("carrierNo");
        this._carrierNo = carrierNo;
    }

    /**
     * [get] CARRIER_S_NAME: {varchar(100)} <br>
     * @return The value of the column 'CARRIER_S_NAME'. (NullAllowed)
     */
    public String getCarrierSName() {
        return _carrierSName;
    }

    /**
     * [set] CARRIER_S_NAME: {varchar(100)} <br>
     * @param carrierSName The value of the column 'CARRIER_S_NAME'. (NullAllowed)
     */
    public void setCarrierSName(String carrierSName) {
        __modifiedProperties.add("carrierSName");
        this._carrierSName = carrierSName;
    }

    /**
     * [get] OPEN_FLG_CD: {char(1)} <br>
     * @return The value of the column 'OPEN_FLG_CD'. (NullAllowed)
     */
    public String getOpenFlgCd() {
        return _openFlgCd;
    }

    /**
     * [set] OPEN_FLG_CD: {char(1)} <br>
     * @param openFlgCd The value of the column 'OPEN_FLG_CD'. (NullAllowed)
     */
    public void setOpenFlgCd(String openFlgCd) {
        __modifiedProperties.add("openFlgCd");
        this._openFlgCd = openFlgCd;
    }

    /**
     * [get] OPEN_FLG: {int(10)} <br>
     * @return The value of the column 'OPEN_FLG'. (NullAllowed)
     */
    public String getOpenFlg() {
        return _openFlg;
    }

    /**
     * [set] OPEN_FLG: {int(10)} <br>
     * @param openFlg The value of the column 'OPEN_FLG'. (NullAllowed)
     */
    public void setOpenFlg(String openFlg) {
        __modifiedProperties.add("openFlg");
        this._openFlg = openFlg;
    }

    /**
     * [get] MAKER_CASE_NO: {varchar(60)} <br>
     * @return The value of the column 'MAKER_CASE_NO'. (NullAllowed)
     */
    public String getMakerCaseNo() {
        return _makerCaseNo;
    }

    /**
     * [set] MAKER_CASE_NO: {varchar(60)} <br>
     * @param makerCaseNo The value of the column 'MAKER_CASE_NO'. (NullAllowed)
     */
    public void setMakerCaseNo(String makerCaseNo) {
        __modifiedProperties.add("makerCaseNo");
        this._makerCaseNo = makerCaseNo;
    }

    /**
     * [get] RESTQTY_BOWL: {decimal(16, 6)} <br>
     * @return The value of the column 'RESTQTY_BOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqtyBowl() {
        return _restqtyBowl;
    }

    /**
     * [set] RESTQTY_BOWL: {decimal(16, 6)} <br>
     * @param restqtyBowl The value of the column 'RESTQTY_BOWL'. (NullAllowed)
     */
    public void setRestqtyBowl(java.math.BigDecimal restqtyBowl) {
        __modifiedProperties.add("restqtyBowl");
        this._restqtyBowl = restqtyBowl;
    }

    /**
     * [get] RESTQTY_CARTON: {int(10)} <br>
     * @return The value of the column 'RESTQTY_CARTON'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqtyCarton() {
        return _restqtyCarton;
    }

    /**
     * [set] RESTQTY_CARTON: {int(10)} <br>
     * @param restqtyCarton The value of the column 'RESTQTY_CARTON'. (NullAllowed)
     */
    public void setRestqtyCarton(java.math.BigDecimal restqtyCarton) {
        __modifiedProperties.add("restqtyCarton");
        this._restqtyCarton = restqtyCarton;
    }

    /**
     * [get] UNIT1: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT1'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit1() {
        return _unit1;
    }

    /**
     * [set] UNIT1: {decimal(16, 6)} <br>
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        __modifiedProperties.add("unit1");
        this._unit1 = unit1;
    }

    /**
     * [get] UNIT2: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT2'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit2() {
        return _unit2;
    }

    /**
     * [set] UNIT2: {decimal(16, 6)} <br>
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        __modifiedProperties.add("unit2");
        this._unit2 = unit2;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

}
