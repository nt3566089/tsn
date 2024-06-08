package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlPalletDtlFractionPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSOLISTKEY, SHIPSCHDATE, FAX1, CARRIERSNAME, RMANO, OWNERSONO, LOT2, LOT4, OTHERLOT3, LOT3, SOPALLETNO, IFITEMCD, LOT1, LOT4_CNT, LOT1_CNT, EXPECT_CASE_QTY, EXPECT_CARTON_QTY, OTHERLOT3_CNT, CENTER_ABBR, CUSTOMER_ABBR, PRODUCT_CD, PRODUCT_ABBR, OTHERREFNO1, PRICE2, USERNUM3, TRANSPORTPRIORITY
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
public abstract class BsSqlPalletDtlFractionPrintDto implements Serializable {

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
    /** TRSOLISTKEY: {bigint(19)} */
    @JsonKey
    protected Long _trsolistkey;

    /** SHIPSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _shipschdate;

    /** FAX1: {varchar(60)} */
    @JsonKey
    protected String _fax1;

    /** CARRIERSNAME: {varchar(100)} */
    @JsonKey
    protected String _carriersname;

    /** RMANO: {varchar(60)} */
    @JsonKey
    protected String _rmano;

    /** OWNERSONO: {varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** OTHERLOT3: {varchar(60)} */
    @JsonKey
    protected String _otherlot3;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** SOPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _sopalletno;

    /** IFITEMCD: {varchar(30)} */
    @JsonKey
    protected String _ifitemcd;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT4_CNT: {int(10)} */
    @JsonKey
    protected Integer _lot4Cnt;

    /** LOT1_CNT: {int(10)} */
    @JsonKey
    protected Integer _lot1Cnt;

    /** EXPECT_CASE_QTY: {decimal(18)} */
    @JsonKey
    protected java.math.BigDecimal _expectCaseQty;

    /** EXPECT_CARTON_QTY: {decimal(18)} */
    @JsonKey
    protected java.math.BigDecimal _expectCartonQty;

    /** OTHERLOT3_CNT: {int(10)} */
    @JsonKey
    protected Integer _otherlot3Cnt;

    /** CENTER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _centerAbbr;

    /** CUSTOMER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _customerAbbr;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** OTHERREFNO1: {varchar(100)} */
    @JsonKey
    protected String _otherrefno1;

    /** PRICE2: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _price2;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

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
    public BsSqlPalletDtlFractionPrintDto() {
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
        if (other == null || !(other instanceof BsSqlPalletDtlFractionPrintDto)) { return false; }
        final BsSqlPalletDtlFractionPrintDto otherEntity = (BsSqlPalletDtlFractionPrintDto)other;
        if (!helpComparingValue(getTrsolistkey(), otherEntity.getTrsolistkey())) { return false; }
        if (!helpComparingValue(getShipschdate(), otherEntity.getShipschdate())) { return false; }
        if (!helpComparingValue(getFax1(), otherEntity.getFax1())) { return false; }
        if (!helpComparingValue(getCarriersname(), otherEntity.getCarriersname())) { return false; }
        if (!helpComparingValue(getRmano(), otherEntity.getRmano())) { return false; }
        if (!helpComparingValue(getOwnersono(), otherEntity.getOwnersono())) { return false; }
        if (!helpComparingValue(getLot2(), otherEntity.getLot2())) { return false; }
        if (!helpComparingValue(getLot4(), otherEntity.getLot4())) { return false; }
        if (!helpComparingValue(getOtherlot3(), otherEntity.getOtherlot3())) { return false; }
        if (!helpComparingValue(getLot3(), otherEntity.getLot3())) { return false; }
        if (!helpComparingValue(getSopalletno(), otherEntity.getSopalletno())) { return false; }
        if (!helpComparingValue(getIfitemcd(), otherEntity.getIfitemcd())) { return false; }
        if (!helpComparingValue(getLot1(), otherEntity.getLot1())) { return false; }
        if (!helpComparingValue(getLot4Cnt(), otherEntity.getLot4Cnt())) { return false; }
        if (!helpComparingValue(getLot1Cnt(), otherEntity.getLot1Cnt())) { return false; }
        if (!helpComparingValue(getExpectCaseQty(), otherEntity.getExpectCaseQty())) { return false; }
        if (!helpComparingValue(getExpectCartonQty(), otherEntity.getExpectCartonQty())) { return false; }
        if (!helpComparingValue(getOtherlot3Cnt(), otherEntity.getOtherlot3Cnt())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getCustomerAbbr(), otherEntity.getCustomerAbbr())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getOtherrefno1(), otherEntity.getOtherrefno1())) { return false; }
        if (!helpComparingValue(getPrice2(), otherEntity.getPrice2())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        if (!helpComparingValue(getTransportpriority(), otherEntity.getTransportpriority())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlPalletDtlFractionPrint");
        result = xCH(result, getTrsolistkey());
        result = xCH(result, getShipschdate());
        result = xCH(result, getFax1());
        result = xCH(result, getCarriersname());
        result = xCH(result, getRmano());
        result = xCH(result, getOwnersono());
        result = xCH(result, getLot2());
        result = xCH(result, getLot4());
        result = xCH(result, getOtherlot3());
        result = xCH(result, getLot3());
        result = xCH(result, getSopalletno());
        result = xCH(result, getIfitemcd());
        result = xCH(result, getLot1());
        result = xCH(result, getLot4Cnt());
        result = xCH(result, getLot1Cnt());
        result = xCH(result, getExpectCaseQty());
        result = xCH(result, getExpectCartonQty());
        result = xCH(result, getOtherlot3Cnt());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getCustomerAbbr());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getOtherrefno1());
        result = xCH(result, getPrice2());
        result = xCH(result, getUsernum3());
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
        sb.append(c).append(getTrsolistkey());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getFax1());
        sb.append(c).append(getCarriersname());
        sb.append(c).append(getRmano());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot4());
        sb.append(c).append(getOtherlot3());
        sb.append(c).append(getLot3());
        sb.append(c).append(getSopalletno());
        sb.append(c).append(getIfitemcd());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot4Cnt());
        sb.append(c).append(getLot1Cnt());
        sb.append(c).append(getExpectCaseQty());
        sb.append(c).append(getExpectCartonQty());
        sb.append(c).append(getOtherlot3Cnt());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getCustomerAbbr());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getPrice2());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getTransportpriority());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] CARRIERSNAME: {varchar(100)} <br>
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public String getCarriersname() {
        return _carriersname;
    }

    /**
     * [set] CARRIERSNAME: {varchar(100)} <br>
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public void setCarriersname(String carriersname) {
        __modifiedProperties.add("carriersname");
        this._carriersname = carriersname;
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
     * [get] OTHERLOT3: {varchar(60)} <br>
     * @return The value of the column 'OTHERLOT3'. (NullAllowed)
     */
    public String getOtherlot3() {
        return _otherlot3;
    }

    /**
     * [set] OTHERLOT3: {varchar(60)} <br>
     * @param otherlot3 The value of the column 'OTHERLOT3'. (NullAllowed)
     */
    public void setOtherlot3(String otherlot3) {
        __modifiedProperties.add("otherlot3");
        this._otherlot3 = otherlot3;
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
     * [get] SOPALLETNO: {varchar(30)} <br>
     * @return The value of the column 'SOPALLETNO'. (NullAllowed)
     */
    public String getSopalletno() {
        return _sopalletno;
    }

    /**
     * [set] SOPALLETNO: {varchar(30)} <br>
     * @param sopalletno The value of the column 'SOPALLETNO'. (NullAllowed)
     */
    public void setSopalletno(String sopalletno) {
        __modifiedProperties.add("sopalletno");
        this._sopalletno = sopalletno;
    }

    /**
     * [get] IFITEMCD: {varchar(30)} <br>
     * @return The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public String getIfitemcd() {
        return _ifitemcd;
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public void setIfitemcd(String ifitemcd) {
        __modifiedProperties.add("ifitemcd");
        this._ifitemcd = ifitemcd;
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
     * [get] LOT4_CNT: {int(10)} <br>
     * @return The value of the column 'LOT4_CNT'. (NullAllowed)
     */
    public Integer getLot4Cnt() {
        return _lot4Cnt;
    }

    /**
     * [set] LOT4_CNT: {int(10)} <br>
     * @param lot4Cnt The value of the column 'LOT4_CNT'. (NullAllowed)
     */
    public void setLot4Cnt(Integer lot4Cnt) {
        __modifiedProperties.add("lot4Cnt");
        this._lot4Cnt = lot4Cnt;
    }

    /**
     * [get] LOT1_CNT: {int(10)} <br>
     * @return The value of the column 'LOT1_CNT'. (NullAllowed)
     */
    public Integer getLot1Cnt() {
        return _lot1Cnt;
    }

    /**
     * [set] LOT1_CNT: {int(10)} <br>
     * @param lot1Cnt The value of the column 'LOT1_CNT'. (NullAllowed)
     */
    public void setLot1Cnt(Integer lot1Cnt) {
        __modifiedProperties.add("lot1Cnt");
        this._lot1Cnt = lot1Cnt;
    }

    /**
     * [get] EXPECT_CASE_QTY: {decimal(18)} <br>
     * @return The value of the column 'EXPECT_CASE_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectCaseQty() {
        return _expectCaseQty;
    }

    /**
     * [set] EXPECT_CASE_QTY: {decimal(18)} <br>
     * @param expectCaseQty The value of the column 'EXPECT_CASE_QTY'. (NullAllowed)
     */
    public void setExpectCaseQty(java.math.BigDecimal expectCaseQty) {
        __modifiedProperties.add("expectCaseQty");
        this._expectCaseQty = expectCaseQty;
    }

    /**
     * [get] EXPECT_CARTON_QTY: {decimal(18)} <br>
     * @return The value of the column 'EXPECT_CARTON_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectCartonQty() {
        return _expectCartonQty;
    }

    /**
     * [set] EXPECT_CARTON_QTY: {decimal(18)} <br>
     * @param expectCartonQty The value of the column 'EXPECT_CARTON_QTY'. (NullAllowed)
     */
    public void setExpectCartonQty(java.math.BigDecimal expectCartonQty) {
        __modifiedProperties.add("expectCartonQty");
        this._expectCartonQty = expectCartonQty;
    }

    /**
     * [get] OTHERLOT3_CNT: {int(10)} <br>
     * @return The value of the column 'OTHERLOT3_CNT'. (NullAllowed)
     */
    public Integer getOtherlot3Cnt() {
        return _otherlot3Cnt;
    }

    /**
     * [set] OTHERLOT3_CNT: {int(10)} <br>
     * @param otherlot3Cnt The value of the column 'OTHERLOT3_CNT'. (NullAllowed)
     */
    public void setOtherlot3Cnt(Integer otherlot3Cnt) {
        __modifiedProperties.add("otherlot3Cnt");
        this._otherlot3Cnt = otherlot3Cnt;
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
     * [get] OTHERREFNO1: {varchar(100)} <br>
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(100)} <br>
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
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
