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
 * The base class for typed parameter-bean of SqlTrhanbaiinvDiffQtyList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlTrhanbaiinvDiffQtyList</span>" on TTrhanbaiinvBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlTrhanbaiinvDiffQtyListPmb implements ListHandlingPmb<TTrhanbaiinvBhv, SqlTrhanbaiinvDiffQtyList>, EntityHandlingPmb<TTrhanbaiinvBhv, SqlTrhanbaiinvDiffQtyList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of systemDt. */
    protected String _systemDt;

    /** The parameter of inoutKbn. */
    protected String _inoutKbn;

    /** The parameter of yearMoth01. */
    protected String _yearMoth01;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlTrhanbaiinvDiffQtyList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlTrhanbaiinvDiffQtyList</span>" on TTrhanbaiinvBhv.
     */
    public BsSqlTrhanbaiinvDiffQtyListPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlTrhanbaiinvDiffQtyList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlTrhanbaiinvDiffQtyList> getEntityType() { return SqlTrhanbaiinvDiffQtyList.class; }

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
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_systemDt);
        sb.append(dm).append(_inoutKbn);
        sb.append(dm).append(_yearMoth01);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] systemDt <br>
     * @return The value of systemDt. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSystemDt() {
        return filterStringParameter(_systemDt);
    }

    /**
     * [set] systemDt <br>
     * @param systemDt The value of systemDt. (NullAllowed)
     */
    public void setSystemDt(String systemDt) {
        _systemDt = systemDt;
    }

    /**
     * [get] inoutKbn <br>
     * @return The value of inoutKbn. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInoutKbn() {
        return filterStringParameter(_inoutKbn);
    }

    /**
     * [set] inoutKbn <br>
     * @param inoutKbn The value of inoutKbn. (NullAllowed)
     */
    public void setInoutKbn(String inoutKbn) {
        _inoutKbn = inoutKbn;
    }

    /**
     * [get] yearMoth01 <br>
     * @return The value of yearMoth01. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getYearMoth01() {
        return filterStringParameter(_yearMoth01);
    }

    /**
     * [set] yearMoth01 <br>
     * @param yearMoth01 The value of yearMoth01. (NullAllowed)
     */
    public void setYearMoth01(String yearMoth01) {
        _yearMoth01 = yearMoth01;
    }
}
