package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShippingPalleteDetailInfoList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SYMBOLLINENO, RCVKEY, SYMBOLMAKENO, PRODUCT_CD, PRODUCT_NM, LOT1, LOT4, LOT3, LOT2, STOCK_TYPE_CD, MAKERCASENO, RECEIVEDATE, TOTALQTY, FOREIGNCARGOFLG, IFITEMCD, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM
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
public abstract class BsSqlShippingPalleteDetailInfoListDto implements Serializable {

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
    /** SYMBOLLINENO: {bigint(19)} */
    @JsonKey
    protected Long _symbollineno;

    /** RCVKEY: {bigint(19)} */
    @JsonKey
    protected Long _rcvkey;

    /** SYMBOLMAKENO: {varchar(30)} */
    @JsonKey
    protected String _symbolmakeno;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** STOCK_TYPE_CD: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** MAKERCASENO: {varchar(60)} */
    @JsonKey
    protected String _makercaseno;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** TOTALQTY: {decimal(38)} */
    @JsonKey
    protected java.math.BigDecimal _totalqty;

    /** FOREIGNCARGOFLG: {char(1)} */
    @JsonKey
    protected String _foreigncargoflg;

    /** IFITEMCD: {varchar(30)} */
    @JsonKey
    protected String _ifitemcd;

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
    public BsSqlShippingPalleteDetailInfoListDto() {
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
        if (other == null || !(other instanceof BsSqlShippingPalleteDetailInfoListDto)) { return false; }
        final BsSqlShippingPalleteDetailInfoListDto otherEntity = (BsSqlShippingPalleteDetailInfoListDto)other;
        if (!helpComparingValue(getSymbollineno(), otherEntity.getSymbollineno())) { return false; }
        if (!helpComparingValue(getRcvkey(), otherEntity.getRcvkey())) { return false; }
        if (!helpComparingValue(getSymbolmakeno(), otherEntity.getSymbolmakeno())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getLot1(), otherEntity.getLot1())) { return false; }
        if (!helpComparingValue(getLot4(), otherEntity.getLot4())) { return false; }
        if (!helpComparingValue(getLot3(), otherEntity.getLot3())) { return false; }
        if (!helpComparingValue(getLot2(), otherEntity.getLot2())) { return false; }
        if (!helpComparingValue(getStockTypeCd(), otherEntity.getStockTypeCd())) { return false; }
        if (!helpComparingValue(getMakercaseno(), otherEntity.getMakercaseno())) { return false; }
        if (!helpComparingValue(getReceivedate(), otherEntity.getReceivedate())) { return false; }
        if (!helpComparingValue(getTotalqty(), otherEntity.getTotalqty())) { return false; }
        if (!helpComparingValue(getForeigncargoflg(), otherEntity.getForeigncargoflg())) { return false; }
        if (!helpComparingValue(getIfitemcd(), otherEntity.getIfitemcd())) { return false; }
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
        result = xCH(result, "SqlShippingPalleteDetailInfoList");
        result = xCH(result, getSymbollineno());
        result = xCH(result, getRcvkey());
        result = xCH(result, getSymbolmakeno());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getLot1());
        result = xCH(result, getLot4());
        result = xCH(result, getLot3());
        result = xCH(result, getLot2());
        result = xCH(result, getStockTypeCd());
        result = xCH(result, getMakercaseno());
        result = xCH(result, getReceivedate());
        result = xCH(result, getTotalqty());
        result = xCH(result, getForeigncargoflg());
        result = xCH(result, getIfitemcd());
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
        sb.append(c).append(getSymbollineno());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getSymbolmakeno());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot2());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getMakercaseno());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getTotalqty());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getIfitemcd());
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
     * [get] SYMBOLLINENO: {bigint(19)} <br>
     * @return The value of the column 'SYMBOLLINENO'. (NullAllowed)
     */
    public Long getSymbollineno() {
        return _symbollineno;
    }

    /**
     * [set] SYMBOLLINENO: {bigint(19)} <br>
     * @param symbollineno The value of the column 'SYMBOLLINENO'. (NullAllowed)
     */
    public void setSymbollineno(Long symbollineno) {
        __modifiedProperties.add("symbollineno");
        this._symbollineno = symbollineno;
    }

    /**
     * [get] RCVKEY: {bigint(19)} <br>
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public Long getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {bigint(19)} <br>
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(Long rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] SYMBOLMAKENO: {varchar(30)} <br>
     * @return The value of the column 'SYMBOLMAKENO'. (NullAllowed)
     */
    public String getSymbolmakeno() {
        return _symbolmakeno;
    }

    /**
     * [set] SYMBOLMAKENO: {varchar(30)} <br>
     * @param symbolmakeno The value of the column 'SYMBOLMAKENO'. (NullAllowed)
     */
    public void setSymbolmakeno(String symbolmakeno) {
        __modifiedProperties.add("symbolmakeno");
        this._symbolmakeno = symbolmakeno;
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
     * [get] MAKERCASENO: {varchar(60)} <br>
     * @return The value of the column 'MAKERCASENO'. (NullAllowed)
     */
    public String getMakercaseno() {
        return _makercaseno;
    }

    /**
     * [set] MAKERCASENO: {varchar(60)} <br>
     * @param makercaseno The value of the column 'MAKERCASENO'. (NullAllowed)
     */
    public void setMakercaseno(String makercaseno) {
        __modifiedProperties.add("makercaseno");
        this._makercaseno = makercaseno;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] TOTALQTY: {decimal(38)} <br>
     * @return The value of the column 'TOTALQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalqty() {
        return _totalqty;
    }

    /**
     * [set] TOTALQTY: {decimal(38)} <br>
     * @param totalqty The value of the column 'TOTALQTY'. (NullAllowed)
     */
    public void setTotalqty(java.math.BigDecimal totalqty) {
        __modifiedProperties.add("totalqty");
        this._totalqty = totalqty;
    }

    /**
     * [get] FOREIGNCARGOFLG: {char(1)} <br>
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public String getForeigncargoflg() {
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {char(1)} <br>
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        __modifiedProperties.add("foreigncargoflg");
        this._foreigncargoflg = foreigncargoflg;
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
