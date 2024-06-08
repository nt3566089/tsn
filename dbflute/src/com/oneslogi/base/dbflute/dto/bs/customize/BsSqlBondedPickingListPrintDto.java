package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlBondedPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     FLOOR, WORKALLOCATEID, LOT3, OTHERLOT1, LOT1, LOT2, LOT4, LISTKBN, PALLET_QTY, CASE_QTY, SORT_RECEIVED_CASE_QTY, SORT_RECEIVED_CARTON_QTY, PICKED_PALLET_QTY, PICKED_CASE_QTY, PICKED_CARTON_QTY, CLIENT_NM, MIN_SHIPSCHDATE, MAX_SHIPSCHDATE, CENTER_CD, CENTER_ABBR, CLIENT_ABBR, PRODUCT_CD, PRODUCT_ABBR, USERNUM3, OTHERCD3, USER_CD, USER_NM, LOCATION_CD
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
public abstract class BsSqlBondedPickingListPrintDto implements Serializable {

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
    /** FLOOR: {varchar(30)} */
    @JsonKey
    protected String _floor;

    /** WORKALLOCATEID: {bigint(19)} */
    @JsonKey
    protected Long _workallocateid;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** OTHERLOT1: {varchar(60)} */
    @JsonKey
    protected String _otherlot1;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LISTKBN: {char(1)} */
    @JsonKey
    protected String _listkbn;

    /** PALLET_QTY: {bigint(19)} */
    @JsonKey
    protected java.math.BigDecimal _palletQty;

    /** CASE_QTY: {decimal(36, 6)} */
    @JsonKey
    protected java.math.BigDecimal _caseQty;

    /** SORT_RECEIVED_CASE_QTY: {decimal(37, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sortReceivedCaseQty;

    /** SORT_RECEIVED_CARTON_QTY: {bigint(19)} */
    @JsonKey
    protected java.math.BigDecimal _sortReceivedCartonQty;

    /** PICKED_PALLET_QTY: {bigint(19)} */
    @JsonKey
    protected java.math.BigDecimal _pickedPalletQty;

    /** PICKED_CASE_QTY: {bigint(19)} */
    @JsonKey
    protected java.math.BigDecimal _pickedCaseQty;

    /** PICKED_CARTON_QTY: {bigint(19)} */
    @JsonKey
    protected java.math.BigDecimal _pickedCartonQty;

    /** CLIENT_NM: {varchar(3)} */
    @JsonKey
    protected String _clientNm;

    /** MIN_SHIPSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _minShipschdate;

    /** MAX_SHIPSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _maxShipschdate;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _centerAbbr;

    /** CLIENT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _clientAbbr;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** OTHERCD3: {varchar(30)} */
    @JsonKey
    protected String _othercd3;

    /** USER_CD: {varchar(30)} */
    @JsonKey
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlBondedPickingListPrintDto() {
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
        if (other == null || !(other instanceof BsSqlBondedPickingListPrintDto)) { return false; }
        final BsSqlBondedPickingListPrintDto otherEntity = (BsSqlBondedPickingListPrintDto)other;
        if (!helpComparingValue(getFloor(), otherEntity.getFloor())) { return false; }
        if (!helpComparingValue(getWorkallocateid(), otherEntity.getWorkallocateid())) { return false; }
        if (!helpComparingValue(getLot3(), otherEntity.getLot3())) { return false; }
        if (!helpComparingValue(getOtherlot1(), otherEntity.getOtherlot1())) { return false; }
        if (!helpComparingValue(getLot1(), otherEntity.getLot1())) { return false; }
        if (!helpComparingValue(getLot2(), otherEntity.getLot2())) { return false; }
        if (!helpComparingValue(getLot4(), otherEntity.getLot4())) { return false; }
        if (!helpComparingValue(getListkbn(), otherEntity.getListkbn())) { return false; }
        if (!helpComparingValue(getPalletQty(), otherEntity.getPalletQty())) { return false; }
        if (!helpComparingValue(getCaseQty(), otherEntity.getCaseQty())) { return false; }
        if (!helpComparingValue(getSortReceivedCaseQty(), otherEntity.getSortReceivedCaseQty())) { return false; }
        if (!helpComparingValue(getSortReceivedCartonQty(), otherEntity.getSortReceivedCartonQty())) { return false; }
        if (!helpComparingValue(getPickedPalletQty(), otherEntity.getPickedPalletQty())) { return false; }
        if (!helpComparingValue(getPickedCaseQty(), otherEntity.getPickedCaseQty())) { return false; }
        if (!helpComparingValue(getPickedCartonQty(), otherEntity.getPickedCartonQty())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getMinShipschdate(), otherEntity.getMinShipschdate())) { return false; }
        if (!helpComparingValue(getMaxShipschdate(), otherEntity.getMaxShipschdate())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getClientAbbr(), otherEntity.getClientAbbr())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        if (!helpComparingValue(getOthercd3(), otherEntity.getOthercd3())) { return false; }
        if (!helpComparingValue(getUserCd(), otherEntity.getUserCd())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlBondedPickingListPrint");
        result = xCH(result, getFloor());
        result = xCH(result, getWorkallocateid());
        result = xCH(result, getLot3());
        result = xCH(result, getOtherlot1());
        result = xCH(result, getLot1());
        result = xCH(result, getLot2());
        result = xCH(result, getLot4());
        result = xCH(result, getListkbn());
        result = xCH(result, getPalletQty());
        result = xCH(result, getCaseQty());
        result = xCH(result, getSortReceivedCaseQty());
        result = xCH(result, getSortReceivedCartonQty());
        result = xCH(result, getPickedPalletQty());
        result = xCH(result, getPickedCaseQty());
        result = xCH(result, getPickedCartonQty());
        result = xCH(result, getClientNm());
        result = xCH(result, getMinShipschdate());
        result = xCH(result, getMaxShipschdate());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getClientAbbr());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getUsernum3());
        result = xCH(result, getOthercd3());
        result = xCH(result, getUserCd());
        result = xCH(result, getUserNm());
        result = xCH(result, getLocationCd());
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
        sb.append(c).append(getFloor());
        sb.append(c).append(getWorkallocateid());
        sb.append(c).append(getLot3());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot4());
        sb.append(c).append(getListkbn());
        sb.append(c).append(getPalletQty());
        sb.append(c).append(getCaseQty());
        sb.append(c).append(getSortReceivedCaseQty());
        sb.append(c).append(getSortReceivedCartonQty());
        sb.append(c).append(getPickedPalletQty());
        sb.append(c).append(getPickedCaseQty());
        sb.append(c).append(getPickedCartonQty());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getMinShipschdate());
        sb.append(c).append(getMaxShipschdate());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getClientAbbr());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getOthercd3());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getLocationCd());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FLOOR: {varchar(30)} <br>
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {varchar(30)} <br>
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] WORKALLOCATEID: {bigint(19)} <br>
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public Long getWorkallocateid() {
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {bigint(19)} <br>
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public void setWorkallocateid(Long workallocateid) {
        __modifiedProperties.add("workallocateid");
        this._workallocateid = workallocateid;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * @return The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public String getOtherlot1() {
        return _otherlot1;
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public void setOtherlot1(String otherlot1) {
        __modifiedProperties.add("otherlot1");
        this._otherlot1 = otherlot1;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] LISTKBN: {char(1)} <br>
     * @return The value of the column 'LISTKBN'. (NullAllowed)
     */
    public String getListkbn() {
        return _listkbn;
    }

    /**
     * [set] LISTKBN: {char(1)} <br>
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed)
     */
    public void setListkbn(String listkbn) {
        __modifiedProperties.add("listkbn");
        this._listkbn = listkbn;
    }

    /**
     * [get] PALLET_QTY: {bigint(19)} <br>
     * @return The value of the column 'PALLET_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getPalletQty() {
        return _palletQty;
    }

    /**
     * [set] PALLET_QTY: {bigint(19)} <br>
     * @param palletQty The value of the column 'PALLET_QTY'. (NullAllowed)
     */
    public void setPalletQty(java.math.BigDecimal palletQty) {
        __modifiedProperties.add("palletQty");
        this._palletQty = palletQty;
    }

    /**
     * [get] CASE_QTY: {decimal(36, 6)} <br>
     * @return The value of the column 'CASE_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getCaseQty() {
        return _caseQty;
    }

    /**
     * [set] CASE_QTY: {decimal(36, 6)} <br>
     * @param caseQty The value of the column 'CASE_QTY'. (NullAllowed)
     */
    public void setCaseQty(java.math.BigDecimal caseQty) {
        __modifiedProperties.add("caseQty");
        this._caseQty = caseQty;
    }

    /**
     * [get] SORT_RECEIVED_CASE_QTY: {decimal(37, 6)} <br>
     * @return The value of the column 'SORT_RECEIVED_CASE_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getSortReceivedCaseQty() {
        return _sortReceivedCaseQty;
    }

    /**
     * [set] SORT_RECEIVED_CASE_QTY: {decimal(37, 6)} <br>
     * @param sortReceivedCaseQty The value of the column 'SORT_RECEIVED_CASE_QTY'. (NullAllowed)
     */
    public void setSortReceivedCaseQty(java.math.BigDecimal sortReceivedCaseQty) {
        __modifiedProperties.add("sortReceivedCaseQty");
        this._sortReceivedCaseQty = sortReceivedCaseQty;
    }

    /**
     * [get] SORT_RECEIVED_CARTON_QTY: {bigint(19)} <br>
     * @return The value of the column 'SORT_RECEIVED_CARTON_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getSortReceivedCartonQty() {
        return _sortReceivedCartonQty;
    }

    /**
     * [set] SORT_RECEIVED_CARTON_QTY: {bigint(19)} <br>
     * @param sortReceivedCartonQty The value of the column 'SORT_RECEIVED_CARTON_QTY'. (NullAllowed)
     */
    public void setSortReceivedCartonQty(java.math.BigDecimal sortReceivedCartonQty) {
        __modifiedProperties.add("sortReceivedCartonQty");
        this._sortReceivedCartonQty = sortReceivedCartonQty;
    }

    /**
     * [get] PICKED_PALLET_QTY: {bigint(19)} <br>
     * @return The value of the column 'PICKED_PALLET_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getPickedPalletQty() {
        return _pickedPalletQty;
    }

    /**
     * [set] PICKED_PALLET_QTY: {bigint(19)} <br>
     * @param pickedPalletQty The value of the column 'PICKED_PALLET_QTY'. (NullAllowed)
     */
    public void setPickedPalletQty(java.math.BigDecimal pickedPalletQty) {
        __modifiedProperties.add("pickedPalletQty");
        this._pickedPalletQty = pickedPalletQty;
    }

    /**
     * [get] PICKED_CASE_QTY: {bigint(19)} <br>
     * @return The value of the column 'PICKED_CASE_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getPickedCaseQty() {
        return _pickedCaseQty;
    }

    /**
     * [set] PICKED_CASE_QTY: {bigint(19)} <br>
     * @param pickedCaseQty The value of the column 'PICKED_CASE_QTY'. (NullAllowed)
     */
    public void setPickedCaseQty(java.math.BigDecimal pickedCaseQty) {
        __modifiedProperties.add("pickedCaseQty");
        this._pickedCaseQty = pickedCaseQty;
    }

    /**
     * [get] PICKED_CARTON_QTY: {bigint(19)} <br>
     * @return The value of the column 'PICKED_CARTON_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getPickedCartonQty() {
        return _pickedCartonQty;
    }

    /**
     * [set] PICKED_CARTON_QTY: {bigint(19)} <br>
     * @param pickedCartonQty The value of the column 'PICKED_CARTON_QTY'. (NullAllowed)
     */
    public void setPickedCartonQty(java.math.BigDecimal pickedCartonQty) {
        __modifiedProperties.add("pickedCartonQty");
        this._pickedCartonQty = pickedCartonQty;
    }

    /**
     * [get] CLIENT_NM: {varchar(3)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(3)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] MIN_SHIPSCHDATE: {varchar(8)} <br>
     * @return The value of the column 'MIN_SHIPSCHDATE'. (NullAllowed)
     */
    public String getMinShipschdate() {
        return _minShipschdate;
    }

    /**
     * [set] MIN_SHIPSCHDATE: {varchar(8)} <br>
     * @param minShipschdate The value of the column 'MIN_SHIPSCHDATE'. (NullAllowed)
     */
    public void setMinShipschdate(String minShipschdate) {
        __modifiedProperties.add("minShipschdate");
        this._minShipschdate = minShipschdate;
    }

    /**
     * [get] MAX_SHIPSCHDATE: {varchar(8)} <br>
     * @return The value of the column 'MAX_SHIPSCHDATE'. (NullAllowed)
     */
    public String getMaxShipschdate() {
        return _maxShipschdate;
    }

    /**
     * [set] MAX_SHIPSCHDATE: {varchar(8)} <br>
     * @param maxShipschdate The value of the column 'MAX_SHIPSCHDATE'. (NullAllowed)
     */
    public void setMaxShipschdate(String maxShipschdate) {
        __modifiedProperties.add("maxShipschdate");
        this._maxShipschdate = maxShipschdate;
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
     * [get] CENTER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public String getCenterAbbr() {
        return _centerAbbr;
    }

    /**
     * [set] CENTER_ABBR: {varchar(60)} <br>
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public void setCenterAbbr(String centerAbbr) {
        __modifiedProperties.add("centerAbbr");
        this._centerAbbr = centerAbbr;
    }

    /**
     * [get] CLIENT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed)
     */
    public String getClientAbbr() {
        return _clientAbbr;
    }

    /**
     * [set] CLIENT_ABBR: {varchar(60)} <br>
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed)
     */
    public void setClientAbbr(String clientAbbr) {
        __modifiedProperties.add("clientAbbr");
        this._clientAbbr = clientAbbr;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] USERNUM3: {bigint(19)} <br>
     * @return The value of the column 'USERNUM3'. (NullAllowed)
     */
    public Long getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19)} <br>
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed)
     */
    public void setUsernum3(Long usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
    }

    /**
     * [get] OTHERCD3: {varchar(30)} <br>
     * @return The value of the column 'OTHERCD3'. (NullAllowed)
     */
    public String getOthercd3() {
        return _othercd3;
    }

    /**
     * [set] OTHERCD3: {varchar(30)} <br>
     * @param othercd3 The value of the column 'OTHERCD3'. (NullAllowed)
     */
    public void setOthercd3(String othercd3) {
        __modifiedProperties.add("othercd3");
        this._othercd3 = othercd3;
    }

    /**
     * [get] USER_CD: {varchar(30)} <br>
     * @return The value of the column 'USER_CD'. (NullAllowed)
     */
    public String getUserCd() {
        return _userCd;
    }

    /**
     * [set] USER_CD: {varchar(30)} <br>
     * @param userCd The value of the column 'USER_CD'. (NullAllowed)
     */
    public void setUserCd(String userCd) {
        __modifiedProperties.add("userCd");
        this._userCd = userCd;
    }

    /**
     * [get] USER_NM: {varchar(60)} <br>
     * @return The value of the column 'USER_NM'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] USER_NM: {varchar(60)} <br>
     * @param userNm The value of the column 'USER_NM'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
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

}
