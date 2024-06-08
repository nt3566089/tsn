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
 * The base class for typed parameter-bean of SqlGetSortedCasesQty. <br>
 * This is related to "<span style="color: #AD4747">selectSqlGetSortedCasesQty</span>" on TTrcasedetailBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlGetSortedCasesQtyPmb implements ListHandlingPmb<TTrcasedetailBhv, SqlGetSortedCasesQty>, EntityHandlingPmb<TTrcasedetailBhv, SqlGetSortedCasesQty>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of assortedIndex. */
    protected Long _assortedIndex;

    /** The parameter of sotedUnit. */
    protected String _sotedUnit;

    /** The parameter of assortedUnit. */
    protected String _assortedUnit;

    /** The parameter of inventoryBId. */
    protected Long _inventoryBId;

    /** The parameter of locationCd. */
    protected String _locationCd;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlGetSortedCasesQty. <br>
     * This is related to "<span style="color: #AD4747">selectSqlGetSortedCasesQty</span>" on TTrcasedetailBhv.
     */
    public BsSqlGetSortedCasesQtyPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlGetSortedCasesQty"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlGetSortedCasesQty> getEntityType() { return SqlGetSortedCasesQty.class; }

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
        sb.append(dm).append(_assortedIndex);
        sb.append(dm).append(_sotedUnit);
        sb.append(dm).append(_assortedUnit);
        sb.append(dm).append(_inventoryBId);
        sb.append(dm).append(_locationCd);
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
     * [get] assortedIndex <br>
     * @return The value of assortedIndex. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getAssortedIndex() {
        return _assortedIndex;
    }

    /**
     * [set] assortedIndex <br>
     * @param assortedIndex The value of assortedIndex. (NullAllowed)
     */
    public void setAssortedIndex(Long assortedIndex) {
        _assortedIndex = assortedIndex;
    }

    /**
     * [get] sotedUnit <br>
     * @return The value of sotedUnit. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSotedUnit() {
        return filterStringParameter(_sotedUnit);
    }

    /**
     * [set] sotedUnit <br>
     * @param sotedUnit The value of sotedUnit. (NullAllowed)
     */
    public void setSotedUnit(String sotedUnit) {
        _sotedUnit = sotedUnit;
    }

    /**
     * [get] assortedUnit <br>
     * @return The value of assortedUnit. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getAssortedUnit() {
        return filterStringParameter(_assortedUnit);
    }

    /**
     * [set] assortedUnit <br>
     * @param assortedUnit The value of assortedUnit. (NullAllowed)
     */
    public void setAssortedUnit(String assortedUnit) {
        _assortedUnit = assortedUnit;
    }

    /**
     * [get] inventoryBId <br>
     * @return The value of inventoryBId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] inventoryBId <br>
     * @param inventoryBId The value of inventoryBId. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] locationCd <br>
     * @return The value of locationCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLocationCd() {
        return filterStringParameter(_locationCd);
    }

    /**
     * [set] locationCd <br>
     * @param locationCd The value of locationCd. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        _locationCd = locationCd;
    }
}
