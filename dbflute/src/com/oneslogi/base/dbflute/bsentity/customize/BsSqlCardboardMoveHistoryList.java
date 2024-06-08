package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlCardboardMoveHistoryList. <br>
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trsymbolId = entity.getTrsymbolId();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * String symbolMakeNo = entity.getSymbolMakeNo();
 * java.math.BigDecimal damageFlgCd = entity.getDamageFlgCd();
 * String damageFlg = entity.getDamageFlg();
 * String locationCd = entity.getLocationCd();
 * String locGroupCd = entity.getLocGroupCd();
 * String locGroup = entity.getLocGroup();
 * String destinationCd = entity.getDestinationCd();
 * String destinationNm = entity.getDestinationNm();
 * String receiveDate = entity.getReceiveDate();
 * String shipDate = entity.getShipDate();
 * String symbolItemCd = entity.getSymbolItemCd();
 * String productNm = entity.getProductNm();
 * String lot1 = entity.getLot1();
 * String symbolLot4 = entity.getSymbolLot4();
 * String symbolLot3Cd = entity.getSymbolLot3Cd();
 * String symbolLot3 = entity.getSymbolLot3();
 * String symbolPrinterNo = entity.getSymbolPrinterNo();
 * String symbolProductMark = entity.getSymbolProductMark();
 * String stockTypeCd = entity.getStockTypeCd();
 * String otherlot1 = entity.getOtherlot1();
 * String caseItfNo = entity.getCaseItfNo();
 * String caseBarcodeValiant = entity.getCaseBarcodeValiant();
 * String caseLot4 = entity.getCaseLot4();
 * String caseCenterNo = entity.getCaseCenterNo();
 * String casePackNo = entity.getCasePackNo();
 * String casePackTime = entity.getCasePackTime();
 * String fromAddress1 = entity.getFromAddress1();
 * String carrierName = entity.getCarrierName();
 * String carrierWbNo = entity.getCarrierWbNo();
 * String carrierNo = entity.getCarrierNo();
 * String carrierSName = entity.getCarrierSName();
 * String openFlgCd = entity.getOpenFlgCd();
 * String openFlg = entity.getOpenFlg();
 * String makerCaseNo = entity.getMakerCaseNo();
 * java.math.BigDecimal restqtyBowl = entity.getRestqtyBowl();
 * java.math.BigDecimal restqtyCarton = entity.getRestqtyCarton();
 * java.math.BigDecimal unit1 = entity.getUnit1();
 * java.math.BigDecimal unit2 = entity.getUnit2();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * entity.setTrsymbolId(trsymbolId);
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setSymbolMakeNo(symbolMakeNo);
 * entity.setDamageFlgCd(damageFlgCd);
 * entity.setDamageFlg(damageFlg);
 * entity.setLocationCd(locationCd);
 * entity.setLocGroupCd(locGroupCd);
 * entity.setLocGroup(locGroup);
 * entity.setDestinationCd(destinationCd);
 * entity.setDestinationNm(destinationNm);
 * entity.setReceiveDate(receiveDate);
 * entity.setShipDate(shipDate);
 * entity.setSymbolItemCd(symbolItemCd);
 * entity.setProductNm(productNm);
 * entity.setLot1(lot1);
 * entity.setSymbolLot4(symbolLot4);
 * entity.setSymbolLot3Cd(symbolLot3Cd);
 * entity.setSymbolLot3(symbolLot3);
 * entity.setSymbolPrinterNo(symbolPrinterNo);
 * entity.setSymbolProductMark(symbolProductMark);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setOtherlot1(otherlot1);
 * entity.setCaseItfNo(caseItfNo);
 * entity.setCaseBarcodeValiant(caseBarcodeValiant);
 * entity.setCaseLot4(caseLot4);
 * entity.setCaseCenterNo(caseCenterNo);
 * entity.setCasePackNo(casePackNo);
 * entity.setCasePackTime(casePackTime);
 * entity.setFromAddress1(fromAddress1);
 * entity.setCarrierName(carrierName);
 * entity.setCarrierWbNo(carrierWbNo);
 * entity.setCarrierNo(carrierNo);
 * entity.setCarrierSName(carrierSName);
 * entity.setOpenFlgCd(openFlgCd);
 * entity.setOpenFlg(openFlg);
 * entity.setMakerCaseNo(makerCaseNo);
 * entity.setRestqtyBowl(restqtyBowl);
 * entity.setRestqtyCarton(restqtyCarton);
 * entity.setUnit1(unit1);
 * entity.setUnit2(unit2);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlCardboardMoveHistoryList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSYMBOL_ID: {bigint(19)} */
    protected Long _trsymbolId;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    protected Long _receivePlanHId;

    /** SYMBOL_MAKE_NO: {varchar(30)} */
    protected String _symbolMakeNo;

    /** DAMAGE_FLG_CD: {decimal(16, 6)} */
    protected java.math.BigDecimal _damageFlgCd;

    /** DAMAGE_FLG: {int(10)} */
    protected String _damageFlg;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** LOC_GROUP_CD: {varchar(30)} */
    protected String _locGroupCd;

    /** LOC_GROUP: {int(10)} */
    protected String _locGroup;

    /** DESTINATION_CD: {varchar(60)} */
    protected String _destinationCd;

    /** DESTINATION_NM: {varchar(255)} */
    protected String _destinationNm;

    /** RECEIVE_DATE: {varchar(8)} */
    protected String _receiveDate;

    /** SHIP_DATE: {varchar(8)} */
    protected String _shipDate;

    /** SYMBOL_ITEM_CD: {varchar(30)} */
    protected String _symbolItemCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** LOT1: {varchar(30)} */
    protected String _lot1;

    /** SYMBOL_LOT4: {varchar(30)} */
    protected String _symbolLot4;

    /** SYMBOL_LOT3_CD: {varchar(30)} */
    protected String _symbolLot3Cd;

    /** SYMBOL_LOT3: {int(10)} */
    protected String _symbolLot3;

    /** SYMBOL_PRINTER_NO: {varchar(30)} */
    protected String _symbolPrinterNo;

    /** SYMBOL_PRODUCT_MARK: {varchar(30)} */
    protected String _symbolProductMark;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** OTHERLOT1: {int(10)} */
    protected String _otherlot1;

    /** CASE_ITF_NO: {varchar(30)} */
    protected String _caseItfNo;

    /** CASE_BARCODE_VALIANT: {varchar(30)} */
    protected String _caseBarcodeValiant;

    /** CASE_LOT4: {varchar(30)} */
    protected String _caseLot4;

    /** CASE_CENTER_NO: {varchar(30)} */
    protected String _caseCenterNo;

    /** CASE_PACK_NO: {varchar(30)} */
    protected String _casePackNo;

    /** CASE_PACK_TIME: {varchar(30)} */
    protected String _casePackTime;

    /** FROM_ADDRESS1: {varchar(255)} */
    protected String _fromAddress1;

    /** CARRIER_NAME: {varchar(255)} */
    protected String _carrierName;

    /** CARRIER_WB_NO: {varchar(60)} */
    protected String _carrierWbNo;

    /** CARRIER_NO: {varchar(60)} */
    protected String _carrierNo;

    /** CARRIER_S_NAME: {varchar(100)} */
    protected String _carrierSName;

    /** OPEN_FLG_CD: {char(1)} */
    protected String _openFlgCd;

    /** OPEN_FLG: {int(10)} */
    protected String _openFlg;

    /** MAKER_CASE_NO: {varchar(60)} */
    protected String _makerCaseNo;

    /** RESTQTY_BOWL: {decimal(16, 6)} */
    protected java.math.BigDecimal _restqtyBowl;

    /** RESTQTY_CARTON: {int(10)} */
    protected java.math.BigDecimal _restqtyCarton;

    /** UNIT1: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit2;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlCardboardMoveHistoryListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlCardboardMoveHistoryList";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlCardboardMoveHistoryList) {
            BsSqlCardboardMoveHistoryList other = (BsSqlCardboardMoveHistoryList)obj;
            if (!xSV(_trsymbolId, other._trsymbolId)) { return false; }
            if (!xSV(_receivePlanHId, other._receivePlanHId)) { return false; }
            if (!xSV(_symbolMakeNo, other._symbolMakeNo)) { return false; }
            if (!xSV(_damageFlgCd, other._damageFlgCd)) { return false; }
            if (!xSV(_damageFlg, other._damageFlg)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_locGroupCd, other._locGroupCd)) { return false; }
            if (!xSV(_locGroup, other._locGroup)) { return false; }
            if (!xSV(_destinationCd, other._destinationCd)) { return false; }
            if (!xSV(_destinationNm, other._destinationNm)) { return false; }
            if (!xSV(_receiveDate, other._receiveDate)) { return false; }
            if (!xSV(_shipDate, other._shipDate)) { return false; }
            if (!xSV(_symbolItemCd, other._symbolItemCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_symbolLot4, other._symbolLot4)) { return false; }
            if (!xSV(_symbolLot3Cd, other._symbolLot3Cd)) { return false; }
            if (!xSV(_symbolLot3, other._symbolLot3)) { return false; }
            if (!xSV(_symbolPrinterNo, other._symbolPrinterNo)) { return false; }
            if (!xSV(_symbolProductMark, other._symbolProductMark)) { return false; }
            if (!xSV(_stockTypeCd, other._stockTypeCd)) { return false; }
            if (!xSV(_otherlot1, other._otherlot1)) { return false; }
            if (!xSV(_caseItfNo, other._caseItfNo)) { return false; }
            if (!xSV(_caseBarcodeValiant, other._caseBarcodeValiant)) { return false; }
            if (!xSV(_caseLot4, other._caseLot4)) { return false; }
            if (!xSV(_caseCenterNo, other._caseCenterNo)) { return false; }
            if (!xSV(_casePackNo, other._casePackNo)) { return false; }
            if (!xSV(_casePackTime, other._casePackTime)) { return false; }
            if (!xSV(_fromAddress1, other._fromAddress1)) { return false; }
            if (!xSV(_carrierName, other._carrierName)) { return false; }
            if (!xSV(_carrierWbNo, other._carrierWbNo)) { return false; }
            if (!xSV(_carrierNo, other._carrierNo)) { return false; }
            if (!xSV(_carrierSName, other._carrierSName)) { return false; }
            if (!xSV(_openFlgCd, other._openFlgCd)) { return false; }
            if (!xSV(_openFlg, other._openFlg)) { return false; }
            if (!xSV(_makerCaseNo, other._makerCaseNo)) { return false; }
            if (!xSV(_restqtyBowl, other._restqtyBowl)) { return false; }
            if (!xSV(_restqtyCarton, other._restqtyCarton)) { return false; }
            if (!xSV(_unit1, other._unit1)) { return false; }
            if (!xSV(_unit2, other._unit2)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsymbolId);
        hs = xCH(hs, _receivePlanHId);
        hs = xCH(hs, _symbolMakeNo);
        hs = xCH(hs, _damageFlgCd);
        hs = xCH(hs, _damageFlg);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _locGroupCd);
        hs = xCH(hs, _locGroup);
        hs = xCH(hs, _destinationCd);
        hs = xCH(hs, _destinationNm);
        hs = xCH(hs, _receiveDate);
        hs = xCH(hs, _shipDate);
        hs = xCH(hs, _symbolItemCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _symbolLot4);
        hs = xCH(hs, _symbolLot3Cd);
        hs = xCH(hs, _symbolLot3);
        hs = xCH(hs, _symbolPrinterNo);
        hs = xCH(hs, _symbolProductMark);
        hs = xCH(hs, _stockTypeCd);
        hs = xCH(hs, _otherlot1);
        hs = xCH(hs, _caseItfNo);
        hs = xCH(hs, _caseBarcodeValiant);
        hs = xCH(hs, _caseLot4);
        hs = xCH(hs, _caseCenterNo);
        hs = xCH(hs, _casePackNo);
        hs = xCH(hs, _casePackTime);
        hs = xCH(hs, _fromAddress1);
        hs = xCH(hs, _carrierName);
        hs = xCH(hs, _carrierWbNo);
        hs = xCH(hs, _carrierNo);
        hs = xCH(hs, _carrierSName);
        hs = xCH(hs, _openFlgCd);
        hs = xCH(hs, _openFlg);
        hs = xCH(hs, _makerCaseNo);
        hs = xCH(hs, _restqtyBowl);
        hs = xCH(hs, _restqtyCarton);
        hs = xCH(hs, _unit1);
        hs = xCH(hs, _unit2);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trsymbolId));
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_symbolMakeNo));
        sb.append(dm).append(xfND(_damageFlgCd));
        sb.append(dm).append(xfND(_damageFlg));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locGroupCd));
        sb.append(dm).append(xfND(_locGroup));
        sb.append(dm).append(xfND(_destinationCd));
        sb.append(dm).append(xfND(_destinationNm));
        sb.append(dm).append(xfND(_receiveDate));
        sb.append(dm).append(xfND(_shipDate));
        sb.append(dm).append(xfND(_symbolItemCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_symbolLot4));
        sb.append(dm).append(xfND(_symbolLot3Cd));
        sb.append(dm).append(xfND(_symbolLot3));
        sb.append(dm).append(xfND(_symbolPrinterNo));
        sb.append(dm).append(xfND(_symbolProductMark));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_caseItfNo));
        sb.append(dm).append(xfND(_caseBarcodeValiant));
        sb.append(dm).append(xfND(_caseLot4));
        sb.append(dm).append(xfND(_caseCenterNo));
        sb.append(dm).append(xfND(_casePackNo));
        sb.append(dm).append(xfND(_casePackTime));
        sb.append(dm).append(xfND(_fromAddress1));
        sb.append(dm).append(xfND(_carrierName));
        sb.append(dm).append(xfND(_carrierWbNo));
        sb.append(dm).append(xfND(_carrierNo));
        sb.append(dm).append(xfND(_carrierSName));
        sb.append(dm).append(xfND(_openFlgCd));
        sb.append(dm).append(xfND(_openFlg));
        sb.append(dm).append(xfND(_makerCaseNo));
        sb.append(dm).append(xfND(_restqtyBowl));
        sb.append(dm).append(xfND(_restqtyCarton));
        sb.append(dm).append(xfND(_unit1));
        sb.append(dm).append(xfND(_unit2));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlCardboardMoveHistoryList clone() {
        return (SqlCardboardMoveHistoryList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSYMBOL_ID: {bigint(19)} <br>
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrsymbolId() {
        checkSpecifiedProperty("trsymbolId");
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {bigint(19)} <br>
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsymbolId(Long trsymbolId) {
        registerModifiedProperty("trsymbolId");
        _trsymbolId = trsymbolId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] SYMBOL_MAKE_NO: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_MAKE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolMakeNo() {
        checkSpecifiedProperty("symbolMakeNo");
        return convertEmptyToNull(_symbolMakeNo);
    }

    /**
     * [set] SYMBOL_MAKE_NO: {varchar(30)} <br>
     * @param symbolMakeNo The value of the column 'SYMBOL_MAKE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolMakeNo(String symbolMakeNo) {
        registerModifiedProperty("symbolMakeNo");
        _symbolMakeNo = symbolMakeNo;
    }

    /**
     * [get] DAMAGE_FLG_CD: {decimal(16, 6)} <br>
     * @return The value of the column 'DAMAGE_FLG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDamageFlgCd() {
        checkSpecifiedProperty("damageFlgCd");
        return _damageFlgCd;
    }

    /**
     * [set] DAMAGE_FLG_CD: {decimal(16, 6)} <br>
     * @param damageFlgCd The value of the column 'DAMAGE_FLG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDamageFlgCd(java.math.BigDecimal damageFlgCd) {
        registerModifiedProperty("damageFlgCd");
        _damageFlgCd = damageFlgCd;
    }

    /**
     * [get] DAMAGE_FLG: {int(10)} <br>
     * @return The value of the column 'DAMAGE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDamageFlg() {
        checkSpecifiedProperty("damageFlg");
        return convertEmptyToNull(_damageFlg);
    }

    /**
     * [set] DAMAGE_FLG: {int(10)} <br>
     * @param damageFlg The value of the column 'DAMAGE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDamageFlg(String damageFlg) {
        registerModifiedProperty("damageFlg");
        _damageFlg = damageFlg;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] LOC_GROUP_CD: {varchar(30)} <br>
     * @return The value of the column 'LOC_GROUP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocGroupCd() {
        checkSpecifiedProperty("locGroupCd");
        return convertEmptyToNull(_locGroupCd);
    }

    /**
     * [set] LOC_GROUP_CD: {varchar(30)} <br>
     * @param locGroupCd The value of the column 'LOC_GROUP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocGroupCd(String locGroupCd) {
        registerModifiedProperty("locGroupCd");
        _locGroupCd = locGroupCd;
    }

    /**
     * [get] LOC_GROUP: {int(10)} <br>
     * @return The value of the column 'LOC_GROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocGroup() {
        checkSpecifiedProperty("locGroup");
        return convertEmptyToNull(_locGroup);
    }

    /**
     * [set] LOC_GROUP: {int(10)} <br>
     * @param locGroup The value of the column 'LOC_GROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocGroup(String locGroup) {
        registerModifiedProperty("locGroup");
        _locGroup = locGroup;
    }

    /**
     * [get] DESTINATION_CD: {varchar(60)} <br>
     * @return The value of the column 'DESTINATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationCd() {
        checkSpecifiedProperty("destinationCd");
        return convertEmptyToNull(_destinationCd);
    }

    /**
     * [set] DESTINATION_CD: {varchar(60)} <br>
     * @param destinationCd The value of the column 'DESTINATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationCd(String destinationCd) {
        registerModifiedProperty("destinationCd");
        _destinationCd = destinationCd;
    }

    /**
     * [get] DESTINATION_NM: {varchar(255)} <br>
     * @return The value of the column 'DESTINATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm() {
        checkSpecifiedProperty("destinationNm");
        return convertEmptyToNull(_destinationNm);
    }

    /**
     * [set] DESTINATION_NM: {varchar(255)} <br>
     * @param destinationNm The value of the column 'DESTINATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm(String destinationNm) {
        registerModifiedProperty("destinationNm");
        _destinationNm = destinationNm;
    }

    /**
     * [get] RECEIVE_DATE: {varchar(8)} <br>
     * @return The value of the column 'RECEIVE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDate() {
        checkSpecifiedProperty("receiveDate");
        return convertEmptyToNull(_receiveDate);
    }

    /**
     * [set] RECEIVE_DATE: {varchar(8)} <br>
     * @param receiveDate The value of the column 'RECEIVE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDate(String receiveDate) {
        registerModifiedProperty("receiveDate");
        _receiveDate = receiveDate;
    }

    /**
     * [get] SHIP_DATE: {varchar(8)} <br>
     * @return The value of the column 'SHIP_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipDate() {
        checkSpecifiedProperty("shipDate");
        return convertEmptyToNull(_shipDate);
    }

    /**
     * [set] SHIP_DATE: {varchar(8)} <br>
     * @param shipDate The value of the column 'SHIP_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipDate(String shipDate) {
        registerModifiedProperty("shipDate");
        _shipDate = shipDate;
    }

    /**
     * [get] SYMBOL_ITEM_CD: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_ITEM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolItemCd() {
        checkSpecifiedProperty("symbolItemCd");
        return convertEmptyToNull(_symbolItemCd);
    }

    /**
     * [set] SYMBOL_ITEM_CD: {varchar(30)} <br>
     * @param symbolItemCd The value of the column 'SYMBOL_ITEM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolItemCd(String symbolItemCd) {
        registerModifiedProperty("symbolItemCd");
        _symbolItemCd = symbolItemCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] LOT1: {varchar(30)} <br>
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(30)} <br>
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] SYMBOL_LOT4: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolLot4() {
        checkSpecifiedProperty("symbolLot4");
        return convertEmptyToNull(_symbolLot4);
    }

    /**
     * [set] SYMBOL_LOT4: {varchar(30)} <br>
     * @param symbolLot4 The value of the column 'SYMBOL_LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolLot4(String symbolLot4) {
        registerModifiedProperty("symbolLot4");
        _symbolLot4 = symbolLot4;
    }

    /**
     * [get] SYMBOL_LOT3_CD: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_LOT3_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolLot3Cd() {
        checkSpecifiedProperty("symbolLot3Cd");
        return convertEmptyToNull(_symbolLot3Cd);
    }

    /**
     * [set] SYMBOL_LOT3_CD: {varchar(30)} <br>
     * @param symbolLot3Cd The value of the column 'SYMBOL_LOT3_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolLot3Cd(String symbolLot3Cd) {
        registerModifiedProperty("symbolLot3Cd");
        _symbolLot3Cd = symbolLot3Cd;
    }

    /**
     * [get] SYMBOL_LOT3: {int(10)} <br>
     * @return The value of the column 'SYMBOL_LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolLot3() {
        checkSpecifiedProperty("symbolLot3");
        return convertEmptyToNull(_symbolLot3);
    }

    /**
     * [set] SYMBOL_LOT3: {int(10)} <br>
     * @param symbolLot3 The value of the column 'SYMBOL_LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolLot3(String symbolLot3) {
        registerModifiedProperty("symbolLot3");
        _symbolLot3 = symbolLot3;
    }

    /**
     * [get] SYMBOL_PRINTER_NO: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_PRINTER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolPrinterNo() {
        checkSpecifiedProperty("symbolPrinterNo");
        return convertEmptyToNull(_symbolPrinterNo);
    }

    /**
     * [set] SYMBOL_PRINTER_NO: {varchar(30)} <br>
     * @param symbolPrinterNo The value of the column 'SYMBOL_PRINTER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolPrinterNo(String symbolPrinterNo) {
        registerModifiedProperty("symbolPrinterNo");
        _symbolPrinterNo = symbolPrinterNo;
    }

    /**
     * [get] SYMBOL_PRODUCT_MARK: {varchar(30)} <br>
     * @return The value of the column 'SYMBOL_PRODUCT_MARK'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolProductMark() {
        checkSpecifiedProperty("symbolProductMark");
        return convertEmptyToNull(_symbolProductMark);
    }

    /**
     * [set] SYMBOL_PRODUCT_MARK: {varchar(30)} <br>
     * @param symbolProductMark The value of the column 'SYMBOL_PRODUCT_MARK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolProductMark(String symbolProductMark) {
        registerModifiedProperty("symbolProductMark");
        _symbolProductMark = symbolProductMark;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] OTHERLOT1: {int(10)} <br>
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {int(10)} <br>
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] CASE_ITF_NO: {varchar(30)} <br>
     * @return The value of the column 'CASE_ITF_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseItfNo() {
        checkSpecifiedProperty("caseItfNo");
        return convertEmptyToNull(_caseItfNo);
    }

    /**
     * [set] CASE_ITF_NO: {varchar(30)} <br>
     * @param caseItfNo The value of the column 'CASE_ITF_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseItfNo(String caseItfNo) {
        registerModifiedProperty("caseItfNo");
        _caseItfNo = caseItfNo;
    }

    /**
     * [get] CASE_BARCODE_VALIANT: {varchar(30)} <br>
     * @return The value of the column 'CASE_BARCODE_VALIANT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseBarcodeValiant() {
        checkSpecifiedProperty("caseBarcodeValiant");
        return convertEmptyToNull(_caseBarcodeValiant);
    }

    /**
     * [set] CASE_BARCODE_VALIANT: {varchar(30)} <br>
     * @param caseBarcodeValiant The value of the column 'CASE_BARCODE_VALIANT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseBarcodeValiant(String caseBarcodeValiant) {
        registerModifiedProperty("caseBarcodeValiant");
        _caseBarcodeValiant = caseBarcodeValiant;
    }

    /**
     * [get] CASE_LOT4: {varchar(30)} <br>
     * @return The value of the column 'CASE_LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseLot4() {
        checkSpecifiedProperty("caseLot4");
        return convertEmptyToNull(_caseLot4);
    }

    /**
     * [set] CASE_LOT4: {varchar(30)} <br>
     * @param caseLot4 The value of the column 'CASE_LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseLot4(String caseLot4) {
        registerModifiedProperty("caseLot4");
        _caseLot4 = caseLot4;
    }

    /**
     * [get] CASE_CENTER_NO: {varchar(30)} <br>
     * @return The value of the column 'CASE_CENTER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseCenterNo() {
        checkSpecifiedProperty("caseCenterNo");
        return convertEmptyToNull(_caseCenterNo);
    }

    /**
     * [set] CASE_CENTER_NO: {varchar(30)} <br>
     * @param caseCenterNo The value of the column 'CASE_CENTER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseCenterNo(String caseCenterNo) {
        registerModifiedProperty("caseCenterNo");
        _caseCenterNo = caseCenterNo;
    }

    /**
     * [get] CASE_PACK_NO: {varchar(30)} <br>
     * @return The value of the column 'CASE_PACK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePackNo() {
        checkSpecifiedProperty("casePackNo");
        return convertEmptyToNull(_casePackNo);
    }

    /**
     * [set] CASE_PACK_NO: {varchar(30)} <br>
     * @param casePackNo The value of the column 'CASE_PACK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePackNo(String casePackNo) {
        registerModifiedProperty("casePackNo");
        _casePackNo = casePackNo;
    }

    /**
     * [get] CASE_PACK_TIME: {varchar(30)} <br>
     * @return The value of the column 'CASE_PACK_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePackTime() {
        checkSpecifiedProperty("casePackTime");
        return convertEmptyToNull(_casePackTime);
    }

    /**
     * [set] CASE_PACK_TIME: {varchar(30)} <br>
     * @param casePackTime The value of the column 'CASE_PACK_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePackTime(String casePackTime) {
        registerModifiedProperty("casePackTime");
        _casePackTime = casePackTime;
    }

    /**
     * [get] FROM_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'FROM_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromAddress1() {
        checkSpecifiedProperty("fromAddress1");
        return convertEmptyToNull(_fromAddress1);
    }

    /**
     * [set] FROM_ADDRESS1: {varchar(255)} <br>
     * @param fromAddress1 The value of the column 'FROM_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromAddress1(String fromAddress1) {
        registerModifiedProperty("fromAddress1");
        _fromAddress1 = fromAddress1;
    }

    /**
     * [get] CARRIER_NAME: {varchar(255)} <br>
     * @return The value of the column 'CARRIER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierName() {
        checkSpecifiedProperty("carrierName");
        return convertEmptyToNull(_carrierName);
    }

    /**
     * [set] CARRIER_NAME: {varchar(255)} <br>
     * @param carrierName The value of the column 'CARRIER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierName(String carrierName) {
        registerModifiedProperty("carrierName");
        _carrierName = carrierName;
    }

    /**
     * [get] CARRIER_WB_NO: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_WB_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierWbNo() {
        checkSpecifiedProperty("carrierWbNo");
        return convertEmptyToNull(_carrierWbNo);
    }

    /**
     * [set] CARRIER_WB_NO: {varchar(60)} <br>
     * @param carrierWbNo The value of the column 'CARRIER_WB_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierWbNo(String carrierWbNo) {
        registerModifiedProperty("carrierWbNo");
        _carrierWbNo = carrierWbNo;
    }

    /**
     * [get] CARRIER_NO: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNo() {
        checkSpecifiedProperty("carrierNo");
        return convertEmptyToNull(_carrierNo);
    }

    /**
     * [set] CARRIER_NO: {varchar(60)} <br>
     * @param carrierNo The value of the column 'CARRIER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNo(String carrierNo) {
        registerModifiedProperty("carrierNo");
        _carrierNo = carrierNo;
    }

    /**
     * [get] CARRIER_S_NAME: {varchar(100)} <br>
     * @return The value of the column 'CARRIER_S_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierSName() {
        checkSpecifiedProperty("carrierSName");
        return convertEmptyToNull(_carrierSName);
    }

    /**
     * [set] CARRIER_S_NAME: {varchar(100)} <br>
     * @param carrierSName The value of the column 'CARRIER_S_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierSName(String carrierSName) {
        registerModifiedProperty("carrierSName");
        _carrierSName = carrierSName;
    }

    /**
     * [get] OPEN_FLG_CD: {char(1)} <br>
     * @return The value of the column 'OPEN_FLG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOpenFlgCd() {
        checkSpecifiedProperty("openFlgCd");
        return convertEmptyToNull(_openFlgCd);
    }

    /**
     * [set] OPEN_FLG_CD: {char(1)} <br>
     * @param openFlgCd The value of the column 'OPEN_FLG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOpenFlgCd(String openFlgCd) {
        registerModifiedProperty("openFlgCd");
        _openFlgCd = openFlgCd;
    }

    /**
     * [get] OPEN_FLG: {int(10)} <br>
     * @return The value of the column 'OPEN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOpenFlg() {
        checkSpecifiedProperty("openFlg");
        return convertEmptyToNull(_openFlg);
    }

    /**
     * [set] OPEN_FLG: {int(10)} <br>
     * @param openFlg The value of the column 'OPEN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOpenFlg(String openFlg) {
        registerModifiedProperty("openFlg");
        _openFlg = openFlg;
    }

    /**
     * [get] MAKER_CASE_NO: {varchar(60)} <br>
     * @return The value of the column 'MAKER_CASE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakerCaseNo() {
        checkSpecifiedProperty("makerCaseNo");
        return convertEmptyToNull(_makerCaseNo);
    }

    /**
     * [set] MAKER_CASE_NO: {varchar(60)} <br>
     * @param makerCaseNo The value of the column 'MAKER_CASE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakerCaseNo(String makerCaseNo) {
        registerModifiedProperty("makerCaseNo");
        _makerCaseNo = makerCaseNo;
    }

    /**
     * [get] RESTQTY_BOWL: {decimal(16, 6)} <br>
     * @return The value of the column 'RESTQTY_BOWL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestqtyBowl() {
        checkSpecifiedProperty("restqtyBowl");
        return _restqtyBowl;
    }

    /**
     * [set] RESTQTY_BOWL: {decimal(16, 6)} <br>
     * @param restqtyBowl The value of the column 'RESTQTY_BOWL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestqtyBowl(java.math.BigDecimal restqtyBowl) {
        registerModifiedProperty("restqtyBowl");
        _restqtyBowl = restqtyBowl;
    }

    /**
     * [get] RESTQTY_CARTON: {int(10)} <br>
     * @return The value of the column 'RESTQTY_CARTON'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestqtyCarton() {
        checkSpecifiedProperty("restqtyCarton");
        return _restqtyCarton;
    }

    /**
     * [set] RESTQTY_CARTON: {int(10)} <br>
     * @param restqtyCarton The value of the column 'RESTQTY_CARTON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestqtyCarton(java.math.BigDecimal restqtyCarton) {
        registerModifiedProperty("restqtyCarton");
        _restqtyCarton = restqtyCarton;
    }

    /**
     * [get] UNIT1: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnit1() {
        checkSpecifiedProperty("unit1");
        return _unit1;
    }

    /**
     * [set] UNIT1: {decimal(16, 6)} <br>
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        registerModifiedProperty("unit1");
        _unit1 = unit1;
    }

    /**
     * [get] UNIT2: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnit2() {
        checkSpecifiedProperty("unit2");
        return _unit2;
    }

    /**
     * [set] UNIT2: {decimal(16, 6)} <br>
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        registerModifiedProperty("unit2");
        _unit2 = unit2;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }
}
