package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlBondedShippingRelationListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PICKBATCHKEY, WORKALLOCATEID, PICKDATE, LISTKBN, PRINTEDFLG, LISTKBN_NM, PRINTEDFLG_NM, CENTER_CD, CENTER_ABBR, CLIENT_CD, CLIENT_ABBR
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
public abstract class BsSqlBondedShippingRelationListPrintDto implements Serializable {

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
    /** PICKBATCHKEY: {bigint(19)} */
    @JsonKey
    protected Long _pickbatchkey;

    /** WORKALLOCATEID: {bigint(19)} */
    @JsonKey
    protected Long _workallocateid;

    /** PICKDATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _pickdate;

    /** LISTKBN: {varchar(100)} */
    @JsonKey
    protected String _listkbn;

    /** PRINTEDFLG: {char(1)} */
    @JsonKey
    protected String _printedflg;

    /** LISTKBN_NM: {varchar(100)} */
    @JsonKey
    protected String _listkbnNm;

    /** PRINTEDFLG_NM: {varchar(100)} */
    @JsonKey
    protected String _printedflgNm;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _centerAbbr;

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
    public BsSqlBondedShippingRelationListPrintDto() {
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
        if (other == null || !(other instanceof BsSqlBondedShippingRelationListPrintDto)) { return false; }
        final BsSqlBondedShippingRelationListPrintDto otherEntity = (BsSqlBondedShippingRelationListPrintDto)other;
        if (!helpComparingValue(getPickbatchkey(), otherEntity.getPickbatchkey())) { return false; }
        if (!helpComparingValue(getWorkallocateid(), otherEntity.getWorkallocateid())) { return false; }
        if (!helpComparingValue(getPickdate(), otherEntity.getPickdate())) { return false; }
        if (!helpComparingValue(getListkbn(), otherEntity.getListkbn())) { return false; }
        if (!helpComparingValue(getPrintedflg(), otherEntity.getPrintedflg())) { return false; }
        if (!helpComparingValue(getListkbnNm(), otherEntity.getListkbnNm())) { return false; }
        if (!helpComparingValue(getPrintedflgNm(), otherEntity.getPrintedflgNm())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
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
        result = xCH(result, "SqlBondedShippingRelationListPrint");
        result = xCH(result, getPickbatchkey());
        result = xCH(result, getWorkallocateid());
        result = xCH(result, getPickdate());
        result = xCH(result, getListkbn());
        result = xCH(result, getPrintedflg());
        result = xCH(result, getListkbnNm());
        result = xCH(result, getPrintedflgNm());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterAbbr());
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
        sb.append(c).append(getPickbatchkey());
        sb.append(c).append(getWorkallocateid());
        sb.append(c).append(getPickdate());
        sb.append(c).append(getListkbn());
        sb.append(c).append(getPrintedflg());
        sb.append(c).append(getListkbnNm());
        sb.append(c).append(getPrintedflgNm());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterAbbr());
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
     * [get] PICKBATCHKEY: {bigint(19)} <br>
     * @return The value of the column 'PICKBATCHKEY'. (NullAllowed)
     */
    public Long getPickbatchkey() {
        return _pickbatchkey;
    }

    /**
     * [set] PICKBATCHKEY: {bigint(19)} <br>
     * @param pickbatchkey The value of the column 'PICKBATCHKEY'. (NullAllowed)
     */
    public void setPickbatchkey(Long pickbatchkey) {
        __modifiedProperties.add("pickbatchkey");
        this._pickbatchkey = pickbatchkey;
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
     * [get] PICKDATE: {datetime2(26, 6)} <br>
     * @return The value of the column 'PICKDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPickdate() {
        return _pickdate;
    }

    /**
     * [set] PICKDATE: {datetime2(26, 6)} <br>
     * @param pickdate The value of the column 'PICKDATE'. (NullAllowed)
     */
    public void setPickdate(java.sql.Timestamp pickdate) {
        __modifiedProperties.add("pickdate");
        this._pickdate = pickdate;
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
     * [get] PRINTEDFLG: {char(1)} <br>
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public String getPrintedflg() {
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {char(1)} <br>
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        __modifiedProperties.add("printedflg");
        this._printedflg = printedflg;
    }

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
     * [get] PRINTEDFLG_NM: {varchar(100)} <br>
     * @return The value of the column 'PRINTEDFLG_NM'. (NullAllowed)
     */
    public String getPrintedflgNm() {
        return _printedflgNm;
    }

    /**
     * [set] PRINTEDFLG_NM: {varchar(100)} <br>
     * @param printedflgNm The value of the column 'PRINTEDFLG_NM'. (NullAllowed)
     */
    public void setPrintedflgNm(String printedflgNm) {
        __modifiedProperties.add("printedflgNm");
        this._printedflgNm = printedflgNm;
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
