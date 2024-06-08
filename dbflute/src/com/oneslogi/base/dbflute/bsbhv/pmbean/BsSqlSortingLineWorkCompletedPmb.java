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
 * The base class for typed parameter-bean of SqlSortingLineWorkCompleted. <br>
 * This is related to "<span style="color: #AD4747">selectSqlSortingLineWorkCompleted</span>" on TInventoryHBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlSortingLineWorkCompletedPmb implements ListHandlingPmb<TInventoryHBhv, SqlSortingLineWorkCompleted>, EntityHandlingPmb<TInventoryHBhv, SqlSortingLineWorkCompleted>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of inventoryInstKbn. */
    protected String _inventoryInstKbn;

    /** The parameter of inventoryDt. */
    protected String _inventoryDt;

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
     * Constructor for the typed parameter-bean of SqlSortingLineWorkCompleted. <br>
     * This is related to "<span style="color: #AD4747">selectSqlSortingLineWorkCompleted</span>" on TInventoryHBhv.
     */
    public BsSqlSortingLineWorkCompletedPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlSortingLineWorkCompleted"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlSortingLineWorkCompleted> getEntityType() { return SqlSortingLineWorkCompleted.class; }

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
        sb.append(dm).append(_inventoryInstKbn);
        sb.append(dm).append(_inventoryDt);
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
     * [get] inventoryInstKbn <br>
     * @return The value of inventoryInstKbn. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInventoryInstKbn() {
        return filterStringParameter(_inventoryInstKbn);
    }

    /**
     * [set] inventoryInstKbn <br>
     * @param inventoryInstKbn The value of inventoryInstKbn. (NullAllowed)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        _inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] inventoryDt <br>
     * @return The value of inventoryDt. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInventoryDt() {
        return filterStringParameter(_inventoryDt);
    }

    /**
     * [set] inventoryDt <br>
     * @param inventoryDt The value of inventoryDt. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        _inventoryDt = inventoryDt;
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
