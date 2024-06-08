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
 * The base class for typed parameter-bean of SqlGetPlannedSortingQty. <br>
 * This is related to "<span style="color: #AD4747">selectSqlGetPlannedSortingQty</span>" on TTrassortorderBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlGetPlannedSortingQtyPmb implements ListHandlingPmb<TTrassortorderBhv, SqlGetPlannedSortingQty>, EntityHandlingPmb<TTrassortorderBhv, SqlGetPlannedSortingQty>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of warehouseCd. */
    protected String _warehouseCd;

    /** The parameter of sotedUnit. */
    protected String _sotedUnit;

    /** The parameter of sotedLoc. */
    protected String _sotedLoc;

    /** The parameter of itemCd. */
    protected String _itemCd;

    /** The parameter of shiporder. */
    protected Long _shiporder;

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
     * Constructor for the typed parameter-bean of SqlGetPlannedSortingQty. <br>
     * This is related to "<span style="color: #AD4747">selectSqlGetPlannedSortingQty</span>" on TTrassortorderBhv.
     */
    public BsSqlGetPlannedSortingQtyPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlGetPlannedSortingQty"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlGetPlannedSortingQty> getEntityType() { return SqlGetPlannedSortingQty.class; }

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
        sb.append(dm).append(_warehouseCd);
        sb.append(dm).append(_sotedUnit);
        sb.append(dm).append(_sotedLoc);
        sb.append(dm).append(_itemCd);
        sb.append(dm).append(_shiporder);
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
     * [get] warehouseCd <br>
     * @return The value of warehouseCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getWarehouseCd() {
        return filterStringParameter(_warehouseCd);
    }

    /**
     * [set] warehouseCd <br>
     * @param warehouseCd The value of warehouseCd. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        _warehouseCd = warehouseCd;
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
     * [get] sotedLoc <br>
     * @return The value of sotedLoc. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSotedLoc() {
        return filterStringParameter(_sotedLoc);
    }

    /**
     * [set] sotedLoc <br>
     * @param sotedLoc The value of sotedLoc. (NullAllowed)
     */
    public void setSotedLoc(String sotedLoc) {
        _sotedLoc = sotedLoc;
    }

    /**
     * [get] itemCd <br>
     * @return The value of itemCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getItemCd() {
        return filterStringParameter(_itemCd);
    }

    /**
     * [set] itemCd <br>
     * @param itemCd The value of itemCd. (NullAllowed)
     */
    public void setItemCd(String itemCd) {
        _itemCd = itemCd;
    }

    /**
     * [get] shiporder <br>
     * @return The value of shiporder. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getShiporder() {
        return _shiporder;
    }

    /**
     * [set] shiporder <br>
     * @param shiporder The value of shiporder. (NullAllowed)
     */
    public void setShiporder(Long shiporder) {
        _shiporder = shiporder;
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
