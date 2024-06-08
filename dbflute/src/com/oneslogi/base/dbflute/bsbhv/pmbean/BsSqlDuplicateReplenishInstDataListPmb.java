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
 * The base class for typed parameter-bean of SqlDuplicateReplenishInstDataList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlDuplicateReplenishInstDataList</span>" on WReplenishInstInputBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlDuplicateReplenishInstDataListPmb implements ListHandlingPmb<WReplenishInstInputBhv, SqlDuplicateReplenishInstDataList>, EntityHandlingPmb<WReplenishInstInputBhv, SqlDuplicateReplenishInstDataList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of receiveCd. */
    protected String _receiveCd;

    /** The parameter of centerCd. */
    protected String _centerCd;

    /** The parameter of clientCd. */
    protected String _clientCd;

    /** The parameter of flexlnsNo. */
    protected String _flexlnsNo;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlDuplicateReplenishInstDataList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlDuplicateReplenishInstDataList</span>" on WReplenishInstInputBhv.
     */
    public BsSqlDuplicateReplenishInstDataListPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlDuplicateReplenishInstDataList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlDuplicateReplenishInstDataList> getEntityType() { return SqlDuplicateReplenishInstDataList.class; }

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
        sb.append(dm).append(_receiveCd);
        sb.append(dm).append(_centerCd);
        sb.append(dm).append(_clientCd);
        sb.append(dm).append(_flexlnsNo);
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] receiveCd <br>
     * @return The value of receiveCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceiveCd() {
        return filterStringParameter(_receiveCd);
    }

    /**
     * [set] receiveCd <br>
     * @param receiveCd The value of receiveCd. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        _receiveCd = receiveCd;
    }

    /**
     * [get] centerCd <br>
     * @return The value of centerCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCenterCd() {
        return filterStringParameter(_centerCd);
    }

    /**
     * [set] centerCd <br>
     * @param centerCd The value of centerCd. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        _centerCd = centerCd;
    }

    /**
     * [get] clientCd <br>
     * @return The value of clientCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getClientCd() {
        return filterStringParameter(_clientCd);
    }

    /**
     * [set] clientCd <br>
     * @param clientCd The value of clientCd. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        _clientCd = clientCd;
    }

    /**
     * [get] flexlnsNo <br>
     * @return The value of flexlnsNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getFlexlnsNo() {
        return filterStringParameter(_flexlnsNo);
    }

    /**
     * [set] flexlnsNo <br>
     * @param flexlnsNo The value of flexlnsNo. (NullAllowed)
     */
    public void setFlexlnsNo(String flexlnsNo) {
        _flexlnsNo = flexlnsNo;
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
}
