package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShippingLoadingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPSCHDATE, TRSOLISTKEY, CENTER_CD, OWNERSONO, PHONENO, SHIPTOCD, DELIVNAME, CUSTOMER_CD, RMANO, OTHERREFNO1, ORDERTYPE, FAX1, PRICE2, NOTES, PRODUCT_CD, LOT3, LOT1, LOT4, EXPECTQTY1, EXPECTQTY2, CENTER_ABBR, CUSTOMER_ABBR, PRODUCT_ABBR, USERNUM3, USER_CD, USER_NM, OTHERREFNO1_NM, ORDERTYPE_NM, OTHERLOT2_CNT, TRANSPORTPRIORITY
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
public abstract class BsSqlShippingLoadingListPrintDto implements Serializable {

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
    /** SHIPSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _shipschdate;

    /** TRSOLISTKEY: {bigint(19)} */
    @JsonKey
    protected Long _trsolistkey;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** OWNERSONO: {varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** PHONENO: {varchar(60)} */
    @JsonKey
    protected String _phoneno;

    /** SHIPTOCD: {varchar(30)} */
    @JsonKey
    protected String _shiptocd;

    /** DELIVNAME: {varchar(255)} */
    @JsonKey
    protected String _delivname;

    /** CUSTOMER_CD: {varchar(60)} */
    @JsonKey
    protected String _customerCd;

    /** RMANO: {varchar(60)} */
    @JsonKey
    protected String _rmano;

    /** OTHERREFNO1: {varchar(60)} */
    @JsonKey
    protected String _otherrefno1;

    /** ORDERTYPE: {varchar(30)} */
    @JsonKey
    protected String _ordertype;

    /** FAX1: {varchar(60)} */
    @JsonKey
    protected String _fax1;

    /** PRICE2: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _price2;

    /** NOTES: {varchar(30)} */
    @JsonKey
    protected String _notes;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** LOT3: {varchar(255)} */
    @JsonKey
    protected String _lot3;

    /** LOT1: {varchar(255)} */
    @JsonKey
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** EXPECTQTY1: {decimal(18)} */
    @JsonKey
    protected java.math.BigDecimal _expectqty1;

    /** EXPECTQTY2: {decimal(18)} */
    @JsonKey
    protected java.math.BigDecimal _expectqty2;

    /** CENTER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _centerAbbr;

    /** CUSTOMER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _customerAbbr;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** USER_CD: {varchar(30)} */
    @JsonKey
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** OTHERREFNO1_NM: {varchar(100)} */
    @JsonKey
    protected String _otherrefno1Nm;

    /** ORDERTYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _ordertypeNm;

    /** OTHERLOT2_CNT: {int(10)} */
    @JsonKey
    protected Integer _otherlot2Cnt;

    /** TRANSPORTPRIORITY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _transportpriority;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShippingLoadingListPrintDto() {
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
        if (other == null || !(other instanceof BsSqlShippingLoadingListPrintDto)) { return false; }
        final BsSqlShippingLoadingListPrintDto otherEntity = (BsSqlShippingLoadingListPrintDto)other;
        if (!helpComparingValue(getShipschdate(), otherEntity.getShipschdate())) { return false; }
        if (!helpComparingValue(getTrsolistkey(), otherEntity.getTrsolistkey())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getOwnersono(), otherEntity.getOwnersono())) { return false; }
        if (!helpComparingValue(getPhoneno(), otherEntity.getPhoneno())) { return false; }
        if (!helpComparingValue(getShiptocd(), otherEntity.getShiptocd())) { return false; }
        if (!helpComparingValue(getDelivname(), otherEntity.getDelivname())) { return false; }
        if (!helpComparingValue(getCustomerCd(), otherEntity.getCustomerCd())) { return false; }
        if (!helpComparingValue(getRmano(), otherEntity.getRmano())) { return false; }
        if (!helpComparingValue(getOtherrefno1(), otherEntity.getOtherrefno1())) { return false; }
        if (!helpComparingValue(getOrdertype(), otherEntity.getOrdertype())) { return false; }
        if (!helpComparingValue(getFax1(), otherEntity.getFax1())) { return false; }
        if (!helpComparingValue(getPrice2(), otherEntity.getPrice2())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getLot3(), otherEntity.getLot3())) { return false; }
        if (!helpComparingValue(getLot1(), otherEntity.getLot1())) { return false; }
        if (!helpComparingValue(getLot4(), otherEntity.getLot4())) { return false; }
        if (!helpComparingValue(getExpectqty1(), otherEntity.getExpectqty1())) { return false; }
        if (!helpComparingValue(getExpectqty2(), otherEntity.getExpectqty2())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getCustomerAbbr(), otherEntity.getCustomerAbbr())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        if (!helpComparingValue(getUserCd(), otherEntity.getUserCd())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        if (!helpComparingValue(getOtherrefno1Nm(), otherEntity.getOtherrefno1Nm())) { return false; }
        if (!helpComparingValue(getOrdertypeNm(), otherEntity.getOrdertypeNm())) { return false; }
        if (!helpComparingValue(getOtherlot2Cnt(), otherEntity.getOtherlot2Cnt())) { return false; }
        if (!helpComparingValue(getTransportpriority(), otherEntity.getTransportpriority())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShippingLoadingListPrint");
        result = xCH(result, getShipschdate());
        result = xCH(result, getTrsolistkey());
        result = xCH(result, getCenterCd());
        result = xCH(result, getOwnersono());
        result = xCH(result, getPhoneno());
        result = xCH(result, getShiptocd());
        result = xCH(result, getDelivname());
        result = xCH(result, getCustomerCd());
        result = xCH(result, getRmano());
        result = xCH(result, getOtherrefno1());
        result = xCH(result, getOrdertype());
        result = xCH(result, getFax1());
        result = xCH(result, getPrice2());
        result = xCH(result, getNotes());
        result = xCH(result, getProductCd());
        result = xCH(result, getLot3());
        result = xCH(result, getLot1());
        result = xCH(result, getLot4());
        result = xCH(result, getExpectqty1());
        result = xCH(result, getExpectqty2());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getCustomerAbbr());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getUsernum3());
        result = xCH(result, getUserCd());
        result = xCH(result, getUserNm());
        result = xCH(result, getOtherrefno1Nm());
        result = xCH(result, getOrdertypeNm());
        result = xCH(result, getOtherlot2Cnt());
        result = xCH(result, getTransportpriority());
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
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getTrsolistkey());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getPhoneno());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getDelivname());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getRmano());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getOrdertype());
        sb.append(c).append(getFax1());
        sb.append(c).append(getPrice2());
        sb.append(c).append(getNotes());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot4());
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getExpectqty2());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getCustomerAbbr());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getOtherrefno1Nm());
        sb.append(c).append(getOrdertypeNm());
        sb.append(c).append(getOtherlot2Cnt());
        sb.append(c).append(getTransportpriority());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPSCHDATE: {varchar(8)} <br>
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public String getShipschdate() {
        return _shipschdate;
    }

    /**
     * [set] SHIPSCHDATE: {varchar(8)} <br>
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public void setShipschdate(String shipschdate) {
        __modifiedProperties.add("shipschdate");
        this._shipschdate = shipschdate;
    }

    /**
     * [get] TRSOLISTKEY: {bigint(19)} <br>
     * @return The value of the column 'TRSOLISTKEY'. (NullAllowed)
     */
    public Long getTrsolistkey() {
        return _trsolistkey;
    }

    /**
     * [set] TRSOLISTKEY: {bigint(19)} <br>
     * @param trsolistkey The value of the column 'TRSOLISTKEY'. (NullAllowed)
     */
    public void setTrsolistkey(Long trsolistkey) {
        __modifiedProperties.add("trsolistkey");
        this._trsolistkey = trsolistkey;
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
     * [get] OWNERSONO: {varchar(60)} <br>
     * @return The value of the column 'OWNERSONO'. (NullAllowed)
     */
    public String getOwnersono() {
        return _ownersono;
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed)
     */
    public void setOwnersono(String ownersono) {
        __modifiedProperties.add("ownersono");
        this._ownersono = ownersono;
    }

    /**
     * [get] PHONENO: {varchar(60)} <br>
     * @return The value of the column 'PHONENO'. (NullAllowed)
     */
    public String getPhoneno() {
        return _phoneno;
    }

    /**
     * [set] PHONENO: {varchar(60)} <br>
     * @param phoneno The value of the column 'PHONENO'. (NullAllowed)
     */
    public void setPhoneno(String phoneno) {
        __modifiedProperties.add("phoneno");
        this._phoneno = phoneno;
    }

    /**
     * [get] SHIPTOCD: {varchar(30)} <br>
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] DELIVNAME: {varchar(255)} <br>
     * @return The value of the column 'DELIVNAME'. (NullAllowed)
     */
    public String getDelivname() {
        return _delivname;
    }

    /**
     * [set] DELIVNAME: {varchar(255)} <br>
     * @param delivname The value of the column 'DELIVNAME'. (NullAllowed)
     */
    public void setDelivname(String delivname) {
        __modifiedProperties.add("delivname");
        this._delivname = delivname;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(60)} <br>
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {varchar(60)} <br>
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * @return The value of the column 'RMANO'. (NullAllowed)
     */
    public String getRmano() {
        return _rmano;
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * @param rmano The value of the column 'RMANO'. (NullAllowed)
     */
    public void setRmano(String rmano) {
        __modifiedProperties.add("rmano");
        this._rmano = rmano;
    }

    /**
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
    }

    /**
     * [get] ORDERTYPE: {varchar(30)} <br>
     * @return The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public String getOrdertype() {
        return _ordertype;
    }

    /**
     * [set] ORDERTYPE: {varchar(30)} <br>
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public void setOrdertype(String ordertype) {
        __modifiedProperties.add("ordertype");
        this._ordertype = ordertype;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * @return The value of the column 'FAX1'. (NullAllowed)
     */
    public String getFax1() {
        return _fax1;
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * @param fax1 The value of the column 'FAX1'. (NullAllowed)
     */
    public void setFax1(String fax1) {
        __modifiedProperties.add("fax1");
        this._fax1 = fax1;
    }

    /**
     * [get] PRICE2: {decimal(16, 6)} <br>
     * @return The value of the column 'PRICE2'. (NullAllowed)
     */
    public java.math.BigDecimal getPrice2() {
        return _price2;
    }

    /**
     * [set] PRICE2: {decimal(16, 6)} <br>
     * @param price2 The value of the column 'PRICE2'. (NullAllowed)
     */
    public void setPrice2(java.math.BigDecimal price2) {
        __modifiedProperties.add("price2");
        this._price2 = price2;
    }

    /**
     * [get] NOTES: {varchar(30)} <br>
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {varchar(30)} <br>
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
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
     * [get] LOT3: {varchar(255)} <br>
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(255)} <br>
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
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
     * [get] EXPECTQTY1: {decimal(18)} <br>
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {decimal(18)} <br>
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(java.math.BigDecimal expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] EXPECTQTY2: {decimal(18)} <br>
     * @return The value of the column 'EXPECTQTY2'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectqty2() {
        return _expectqty2;
    }

    /**
     * [set] EXPECTQTY2: {decimal(18)} <br>
     * @param expectqty2 The value of the column 'EXPECTQTY2'. (NullAllowed)
     */
    public void setExpectqty2(java.math.BigDecimal expectqty2) {
        __modifiedProperties.add("expectqty2");
        this._expectqty2 = expectqty2;
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
     * [get] CUSTOMER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CUSTOMER_ABBR'. (NullAllowed)
     */
    public String getCustomerAbbr() {
        return _customerAbbr;
    }

    /**
     * [set] CUSTOMER_ABBR: {varchar(60)} <br>
     * @param customerAbbr The value of the column 'CUSTOMER_ABBR'. (NullAllowed)
     */
    public void setCustomerAbbr(String customerAbbr) {
        __modifiedProperties.add("customerAbbr");
        this._customerAbbr = customerAbbr;
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
     * [get] OTHERREFNO1_NM: {varchar(100)} <br>
     * @return The value of the column 'OTHERREFNO1_NM'. (NullAllowed)
     */
    public String getOtherrefno1Nm() {
        return _otherrefno1Nm;
    }

    /**
     * [set] OTHERREFNO1_NM: {varchar(100)} <br>
     * @param otherrefno1Nm The value of the column 'OTHERREFNO1_NM'. (NullAllowed)
     */
    public void setOtherrefno1Nm(String otherrefno1Nm) {
        __modifiedProperties.add("otherrefno1Nm");
        this._otherrefno1Nm = otherrefno1Nm;
    }

    /**
     * [get] ORDERTYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'ORDERTYPE_NM'. (NullAllowed)
     */
    public String getOrdertypeNm() {
        return _ordertypeNm;
    }

    /**
     * [set] ORDERTYPE_NM: {varchar(100)} <br>
     * @param ordertypeNm The value of the column 'ORDERTYPE_NM'. (NullAllowed)
     */
    public void setOrdertypeNm(String ordertypeNm) {
        __modifiedProperties.add("ordertypeNm");
        this._ordertypeNm = ordertypeNm;
    }

    /**
     * [get] OTHERLOT2_CNT: {int(10)} <br>
     * @return The value of the column 'OTHERLOT2_CNT'. (NullAllowed)
     */
    public Integer getOtherlot2Cnt() {
        return _otherlot2Cnt;
    }

    /**
     * [set] OTHERLOT2_CNT: {int(10)} <br>
     * @param otherlot2Cnt The value of the column 'OTHERLOT2_CNT'. (NullAllowed)
     */
    public void setOtherlot2Cnt(Integer otherlot2Cnt) {
        __modifiedProperties.add("otherlot2Cnt");
        this._otherlot2Cnt = otherlot2Cnt;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public java.math.BigDecimal getTransportpriority() {
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        __modifiedProperties.add("transportpriority");
        this._transportpriority = transportpriority;
    }

}
