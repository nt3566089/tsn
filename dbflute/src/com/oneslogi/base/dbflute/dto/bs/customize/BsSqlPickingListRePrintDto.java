package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlPickingListRePrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LISTKBN_NM, CENTER_CD, CENTER_ABBR, SHIPPING_LIST_PRINT_ID, PRINTDATETIME, SHIPSCHDATE, WORKALLOCATEID, OWNERORDERNO, ORDERTYPE_NM, CUSTORDERNO, RMANO, OWNERSONO, SHIPTOCD, DELIVNAME, TRSOLISTSTS_NM, SOPALLETNO, LOCATION_CD, LISTKBN, SOKEY, SOID, CLIENT_CD, CLIENT_ABBR
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
public abstract class BsSqlPickingListRePrintDto implements Serializable {

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
    /** LISTKBN_NM: {varchar(100)} */
    @JsonKey
    protected String _listkbnNm;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _centerAbbr;

    /** SHIPPING_LIST_PRINT_ID: {bigint(19)} */
    @JsonKey
    protected Long _shippingListPrintId;

    /** PRINTDATETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _printdatetime;

    /** SHIPSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _shipschdate;

    /** WORKALLOCATEID: {bigint(19)} */
    @JsonKey
    protected Long _workallocateid;

    /** OWNERORDERNO: {varchar(60)} */
    @JsonKey
    protected String _ownerorderno;

    /** ORDERTYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _ordertypeNm;

    /** CUSTORDERNO: {varchar(60)} */
    @JsonKey
    protected String _custorderno;

    /** RMANO: {varchar(60)} */
    @JsonKey
    protected String _rmano;

    /** OWNERSONO: {varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** SHIPTOCD: {varchar(60)} */
    @JsonKey
    protected String _shiptocd;

    /** DELIVNAME: {varchar(255)} */
    @JsonKey
    protected String _delivname;

    /** TRSOLISTSTS_NM: {varchar(100)} */
    @JsonKey
    protected String _trsoliststsNm;

    /** SOPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _sopalletno;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** LISTKBN: {varchar(100)} */
    @JsonKey
    protected String _listkbn;

    /** SOKEY: {bigint(19)} */
    @JsonKey
    protected Long _sokey;

    /** SOID: {bigint(19)} */
    @JsonKey
    protected Long _soid;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _clientAbbr;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlPickingListRePrintDto() {
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
        if (other == null || !(other instanceof BsSqlPickingListRePrintDto)) { return false; }
        final BsSqlPickingListRePrintDto otherEntity = (BsSqlPickingListRePrintDto)other;
        if (!helpComparingValue(getListkbnNm(), otherEntity.getListkbnNm())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getShippingListPrintId(), otherEntity.getShippingListPrintId())) { return false; }
        if (!helpComparingValue(getPrintdatetime(), otherEntity.getPrintdatetime())) { return false; }
        if (!helpComparingValue(getShipschdate(), otherEntity.getShipschdate())) { return false; }
        if (!helpComparingValue(getWorkallocateid(), otherEntity.getWorkallocateid())) { return false; }
        if (!helpComparingValue(getOwnerorderno(), otherEntity.getOwnerorderno())) { return false; }
        if (!helpComparingValue(getOrdertypeNm(), otherEntity.getOrdertypeNm())) { return false; }
        if (!helpComparingValue(getCustorderno(), otherEntity.getCustorderno())) { return false; }
        if (!helpComparingValue(getRmano(), otherEntity.getRmano())) { return false; }
        if (!helpComparingValue(getOwnersono(), otherEntity.getOwnersono())) { return false; }
        if (!helpComparingValue(getShiptocd(), otherEntity.getShiptocd())) { return false; }
        if (!helpComparingValue(getDelivname(), otherEntity.getDelivname())) { return false; }
        if (!helpComparingValue(getTrsoliststsNm(), otherEntity.getTrsoliststsNm())) { return false; }
        if (!helpComparingValue(getSopalletno(), otherEntity.getSopalletno())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getListkbn(), otherEntity.getListkbn())) { return false; }
        if (!helpComparingValue(getSokey(), otherEntity.getSokey())) { return false; }
        if (!helpComparingValue(getSoid(), otherEntity.getSoid())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientAbbr(), otherEntity.getClientAbbr())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlPickingListRePrint");
        result = xCH(result, getListkbnNm());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getShippingListPrintId());
        result = xCH(result, getPrintdatetime());
        result = xCH(result, getShipschdate());
        result = xCH(result, getWorkallocateid());
        result = xCH(result, getOwnerorderno());
        result = xCH(result, getOrdertypeNm());
        result = xCH(result, getCustorderno());
        result = xCH(result, getRmano());
        result = xCH(result, getOwnersono());
        result = xCH(result, getShiptocd());
        result = xCH(result, getDelivname());
        result = xCH(result, getTrsoliststsNm());
        result = xCH(result, getSopalletno());
        result = xCH(result, getLocationCd());
        result = xCH(result, getListkbn());
        result = xCH(result, getSokey());
        result = xCH(result, getSoid());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientAbbr());
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
        sb.append(c).append(getListkbnNm());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getShippingListPrintId());
        sb.append(c).append(getPrintdatetime());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getWorkallocateid());
        sb.append(c).append(getOwnerorderno());
        sb.append(c).append(getOrdertypeNm());
        sb.append(c).append(getCustorderno());
        sb.append(c).append(getRmano());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getDelivname());
        sb.append(c).append(getTrsoliststsNm());
        sb.append(c).append(getSopalletno());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getListkbn());
        sb.append(c).append(getSokey());
        sb.append(c).append(getSoid());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientAbbr());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LISTKBN_NM: {varchar(100)} <br>
     * @return The value of the column 'LISTKBN_NM'. (NullAllowed)
     */
    public String getListkbnNm() {
        return _listkbnNm;
    }

    /**
     * [set] LISTKBN_NM: {varchar(100)} <br>
     * @param listkbnNm The value of the column 'LISTKBN_NM'. (NullAllowed)
     */
    public void setListkbnNm(String listkbnNm) {
        __modifiedProperties.add("listkbnNm");
        this._listkbnNm = listkbnNm;
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
     * [get] SHIPPING_LIST_PRINT_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_LIST_PRINT_ID'. (NullAllowed)
     */
    public Long getShippingListPrintId() {
        return _shippingListPrintId;
    }

    /**
     * [set] SHIPPING_LIST_PRINT_ID: {bigint(19)} <br>
     * @param shippingListPrintId The value of the column 'SHIPPING_LIST_PRINT_ID'. (NullAllowed)
     */
    public void setShippingListPrintId(Long shippingListPrintId) {
        __modifiedProperties.add("shippingListPrintId");
        this._shippingListPrintId = shippingListPrintId;
    }

    /**
     * [get] PRINTDATETIME: {datetime2(26, 6)} <br>
     * @return The value of the column 'PRINTDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPrintdatetime() {
        return _printdatetime;
    }

    /**
     * [set] PRINTDATETIME: {datetime2(26, 6)} <br>
     * @param printdatetime The value of the column 'PRINTDATETIME'. (NullAllowed)
     */
    public void setPrintdatetime(java.sql.Timestamp printdatetime) {
        __modifiedProperties.add("printdatetime");
        this._printdatetime = printdatetime;
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
     * [get] TRSOLISTSTS_NM: {varchar(100)} <br>
     * @return The value of the column 'TRSOLISTSTS_NM'. (NullAllowed)
     */
    public String getTrsoliststsNm() {
        return _trsoliststsNm;
    }

    /**
     * [set] TRSOLISTSTS_NM: {varchar(100)} <br>
     * @param trsoliststsNm The value of the column 'TRSOLISTSTS_NM'. (NullAllowed)
     */
    public void setTrsoliststsNm(String trsoliststsNm) {
        __modifiedProperties.add("trsoliststsNm");
        this._trsoliststsNm = trsoliststsNm;
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
     * [get] LISTKBN: {varchar(100)} <br>
     * @return The value of the column 'LISTKBN'. (NullAllowed)
     */
    public String getListkbn() {
        return _listkbn;
    }

    /**
     * [set] LISTKBN: {varchar(100)} <br>
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed)
     */
    public void setListkbn(String listkbn) {
        __modifiedProperties.add("listkbn");
        this._listkbn = listkbn;
    }

    /**
     * [get] SOKEY: {bigint(19)} <br>
     * @return The value of the column 'SOKEY'. (NullAllowed)
     */
    public Long getSokey() {
        return _sokey;
    }

    /**
     * [set] SOKEY: {bigint(19)} <br>
     * @param sokey The value of the column 'SOKEY'. (NullAllowed)
     */
    public void setSokey(Long sokey) {
        __modifiedProperties.add("sokey");
        this._sokey = sokey;
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

}
