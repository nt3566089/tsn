package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlBondedShippingRelationListPrintGetId. <br>
 * This is related to "<span style="color: #AD4747">selectSqlBondedShippingRelationListPrintGetId</span>" on TTrsolistBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlBondedShippingRelationListPrintGetIdPmb implements ListHandlingPmb<TTrsolistBhv, SqlBondedShippingRelationListPrintGetId>, EntityHandlingPmb<TTrsolistBhv, SqlBondedShippingRelationListPrintGetId>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of printedflg. */
    protected String _printedflg;

    /** The parameter of listkbn. */
    protected String _listkbn;

    /** The parameter of workallocateid. */
    protected Long _workallocateid;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of pickbatchkey. */
    protected Long _pickbatchkey;

    /** The parameter of pickdate. */
    protected java.sql.Timestamp _pickdate;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlBondedShippingRelationListPrintGetId. <br>
     * This is related to "<span style="color: #AD4747">selectSqlBondedShippingRelationListPrintGetId</span>" on TTrsolistBhv.
     */
    public BsSqlBondedShippingRelationListPrintGetIdPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlBondedShippingRelationListPrintGetId"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlBondedShippingRelationListPrintGetId> getEntityType() { return SqlBondedShippingRelationListPrintGetId.class; }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_printedflg);
        sb.append(dm).append(_listkbn);
        sb.append(dm).append(_workallocateid);
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_pickbatchkey);
        sb.append(dm).append(_pickdate);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] printedflg <br>
     * @return The value of printedflg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPrintedflg() {
        return filterStringParameter(_printedflg);
    }

    /**
     * [set] printedflg <br>
     * @param printedflg The value of printedflg. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        _printedflg = printedflg;
    }

    /**
     * [get] listkbn <br>
     * @return The value of listkbn. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getListkbn() {
        return filterStringParameter(_listkbn);
    }

    /**
     * [set] listkbn <br>
     * @param listkbn The value of listkbn. (NullAllowed)
     */
    public void setListkbn(String listkbn) {
        _listkbn = listkbn;
    }

    /**
     * [get] workallocateid <br>
     * @return The value of workallocateid. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getWorkallocateid() {
        return _workallocateid;
    }

    /**
     * [set] workallocateid <br>
     * @param workallocateid The value of workallocateid. (NullAllowed)
     */
    public void setWorkallocateid(Long workallocateid) {
        _workallocateid = workallocateid;
    }

    /**
     * [get] centerId <br>
     * @return The value of centerId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] centerId <br>
     * @param centerId The value of centerId. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        _centerId = centerId;
    }

    /**
     * [get] clientId <br>
     * @return The value of clientId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] clientId <br>
     * @param clientId The value of clientId. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        _clientId = clientId;
    }

    /**
     * [get] pickbatchkey <br>
     * @return The value of pickbatchkey. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getPickbatchkey() {
        return _pickbatchkey;
    }

    /**
     * [set] pickbatchkey <br>
     * @param pickbatchkey The value of pickbatchkey. (NullAllowed)
     */
    public void setPickbatchkey(Long pickbatchkey) {
        _pickbatchkey = pickbatchkey;
    }

    /**
     * [get] pickdate <br>
     * @return The value of pickdate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getPickdate() {
        return _pickdate;
    }

    /**
     * [set] pickdate <br>
     * @param pickdate The value of pickdate. (NullAllowed)
     */
    public void setPickdate(java.sql.Timestamp pickdate) {
        _pickdate = pickdate;
    }
}
