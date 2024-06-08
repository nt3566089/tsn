package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShippingPalleteInfoList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     STS, SOPALLETNO, SHIPSCHDATE, OWNERORDERNO, ORDERTYPE, CUSTORDERNO, RMANO, OWNERSONO, SHIPDATE, ExpectQty1Style1, ExpectQty1Style2, SHIPTOCD, SHIPTONAME, OTHERREFNO1, PALLETKEY, SOID
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
public abstract class BsSqlShippingPalleteInfoListDto implements Serializable {

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
    /** STS: {varchar(30)} */
    @JsonKey
    protected String _sts;

    /** SOPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _sopalletno;

    /** SHIPSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _shipschdate;

    /** OWNERORDERNO: {varchar(60)} */
    @JsonKey
    protected String _ownerorderno;

    /** ORDERTYPE: {varchar(60)} */
    @JsonKey
    protected String _ordertype;

    /** CUSTORDERNO: {varchar(60)} */
    @JsonKey
    protected String _custorderno;

    /** RMANO: {varchar(60)} */
    @JsonKey
    protected String _rmano;

    /** OWNERSONO: {varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** SHIPDATE: {varchar(8)} */
    @JsonKey
    protected String _shipdate;

    /** ExpectQty1Style1: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _expectQty1Style1;

    /** ExpectQty1Style2: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _expectQty1Style2;

    /** SHIPTOCD: {varchar(60)} */
    @JsonKey
    protected String _shiptocd;

    /** SHIPTONAME: {varchar(255)} */
    @JsonKey
    protected String _shiptoname;

    /** OTHERREFNO1: {varchar(60)} */
    @JsonKey
    protected String _otherrefno1;

    /** PALLETKEY: {varchar(30)} */
    @JsonKey
    protected String _palletkey;

    /** SOID: {bigint(19)} */
    @JsonKey
    protected Long _soid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShippingPalleteInfoListDto() {
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
        if (other == null || !(other instanceof BsSqlShippingPalleteInfoListDto)) { return false; }
        final BsSqlShippingPalleteInfoListDto otherEntity = (BsSqlShippingPalleteInfoListDto)other;
        if (!helpComparingValue(getSts(), otherEntity.getSts())) { return false; }
        if (!helpComparingValue(getSopalletno(), otherEntity.getSopalletno())) { return false; }
        if (!helpComparingValue(getShipschdate(), otherEntity.getShipschdate())) { return false; }
        if (!helpComparingValue(getOwnerorderno(), otherEntity.getOwnerorderno())) { return false; }
        if (!helpComparingValue(getOrdertype(), otherEntity.getOrdertype())) { return false; }
        if (!helpComparingValue(getCustorderno(), otherEntity.getCustorderno())) { return false; }
        if (!helpComparingValue(getRmano(), otherEntity.getRmano())) { return false; }
        if (!helpComparingValue(getOwnersono(), otherEntity.getOwnersono())) { return false; }
        if (!helpComparingValue(getShipdate(), otherEntity.getShipdate())) { return false; }
        if (!helpComparingValue(getExpectQty1Style1(), otherEntity.getExpectQty1Style1())) { return false; }
        if (!helpComparingValue(getExpectQty1Style2(), otherEntity.getExpectQty1Style2())) { return false; }
        if (!helpComparingValue(getShiptocd(), otherEntity.getShiptocd())) { return false; }
        if (!helpComparingValue(getShiptoname(), otherEntity.getShiptoname())) { return false; }
        if (!helpComparingValue(getOtherrefno1(), otherEntity.getOtherrefno1())) { return false; }
        if (!helpComparingValue(getPalletkey(), otherEntity.getPalletkey())) { return false; }
        if (!helpComparingValue(getSoid(), otherEntity.getSoid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShippingPalleteInfoList");
        result = xCH(result, getSts());
        result = xCH(result, getSopalletno());
        result = xCH(result, getShipschdate());
        result = xCH(result, getOwnerorderno());
        result = xCH(result, getOrdertype());
        result = xCH(result, getCustorderno());
        result = xCH(result, getRmano());
        result = xCH(result, getOwnersono());
        result = xCH(result, getShipdate());
        result = xCH(result, getExpectQty1Style1());
        result = xCH(result, getExpectQty1Style2());
        result = xCH(result, getShiptocd());
        result = xCH(result, getShiptoname());
        result = xCH(result, getOtherrefno1());
        result = xCH(result, getPalletkey());
        result = xCH(result, getSoid());
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
        sb.append(c).append(getSts());
        sb.append(c).append(getSopalletno());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getOwnerorderno());
        sb.append(c).append(getOrdertype());
        sb.append(c).append(getCustorderno());
        sb.append(c).append(getRmano());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getShipdate());
        sb.append(c).append(getExpectQty1Style1());
        sb.append(c).append(getExpectQty1Style2());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getShiptoname());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getPalletkey());
        sb.append(c).append(getSoid());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STS: {varchar(30)} <br>
     * @return The value of the column 'STS'. (NullAllowed)
     */
    public String getSts() {
        return _sts;
    }

    /**
     * [set] STS: {varchar(30)} <br>
     * @param sts The value of the column 'STS'. (NullAllowed)
     */
    public void setSts(String sts) {
        __modifiedProperties.add("sts");
        this._sts = sts;
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
     * [get] OWNERORDERNO: {varchar(60)} <br>
     * @return The value of the column 'OWNERORDERNO'. (NullAllowed)
     */
    public String getOwnerorderno() {
        return _ownerorderno;
    }

    /**
     * [set] OWNERORDERNO: {varchar(60)} <br>
     * @param ownerorderno The value of the column 'OWNERORDERNO'. (NullAllowed)
     */
    public void setOwnerorderno(String ownerorderno) {
        __modifiedProperties.add("ownerorderno");
        this._ownerorderno = ownerorderno;
    }

    /**
     * [get] ORDERTYPE: {varchar(60)} <br>
     * @return The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public String getOrdertype() {
        return _ordertype;
    }

    /**
     * [set] ORDERTYPE: {varchar(60)} <br>
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public void setOrdertype(String ordertype) {
        __modifiedProperties.add("ordertype");
        this._ordertype = ordertype;
    }

    /**
     * [get] CUSTORDERNO: {varchar(60)} <br>
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public String getCustorderno() {
        return _custorderno;
    }

    /**
     * [set] CUSTORDERNO: {varchar(60)} <br>
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public void setCustorderno(String custorderno) {
        __modifiedProperties.add("custorderno");
        this._custorderno = custorderno;
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
     * [get] SHIPDATE: {varchar(8)} <br>
     * @return The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public String getShipdate() {
        return _shipdate;
    }

    /**
     * [set] SHIPDATE: {varchar(8)} <br>
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public void setShipdate(String shipdate) {
        __modifiedProperties.add("shipdate");
        this._shipdate = shipdate;
    }

    /**
     * [get] ExpectQty1Style1: {decimal(38, 6)} <br>
     * @return The value of the column 'ExpectQty1Style1'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectQty1Style1() {
        return _expectQty1Style1;
    }

    /**
     * [set] ExpectQty1Style1: {decimal(38, 6)} <br>
     * @param expectQty1Style1 The value of the column 'ExpectQty1Style1'. (NullAllowed)
     */
    public void setExpectQty1Style1(java.math.BigDecimal expectQty1Style1) {
        __modifiedProperties.add("expectQty1Style1");
        this._expectQty1Style1 = expectQty1Style1;
    }

    /**
     * [get] ExpectQty1Style2: {decimal(38, 6)} <br>
     * @return The value of the column 'ExpectQty1Style2'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectQty1Style2() {
        return _expectQty1Style2;
    }

    /**
     * [set] ExpectQty1Style2: {decimal(38, 6)} <br>
     * @param expectQty1Style2 The value of the column 'ExpectQty1Style2'. (NullAllowed)
     */
    public void setExpectQty1Style2(java.math.BigDecimal expectQty1Style2) {
        __modifiedProperties.add("expectQty1Style2");
        this._expectQty1Style2 = expectQty1Style2;
    }

    /**
     * [get] SHIPTOCD: {varchar(60)} <br>
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {varchar(60)} <br>
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] SHIPTONAME: {varchar(255)} <br>
     * @return The value of the column 'SHIPTONAME'. (NullAllowed)
     */
    public String getShiptoname() {
        return _shiptoname;
    }

    /**
     * [set] SHIPTONAME: {varchar(255)} <br>
     * @param shiptoname The value of the column 'SHIPTONAME'. (NullAllowed)
     */
    public void setShiptoname(String shiptoname) {
        __modifiedProperties.add("shiptoname");
        this._shiptoname = shiptoname;
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
     * [get] PALLETKEY: {varchar(30)} <br>
     * @return The value of the column 'PALLETKEY'. (NullAllowed)
     */
    public String getPalletkey() {
        return _palletkey;
    }

    /**
     * [set] PALLETKEY: {varchar(30)} <br>
     * @param palletkey The value of the column 'PALLETKEY'. (NullAllowed)
     */
    public void setPalletkey(String palletkey) {
        __modifiedProperties.add("palletkey");
        this._palletkey = palletkey;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * @return The value of the column 'SOID'. (NullAllowed)
     */
    public Long getSoid() {
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * @param soid The value of the column 'SOID'. (NullAllowed)
     */
    public void setSoid(Long soid) {
        __modifiedProperties.add("soid");
        this._soid = soid;
    }

}
