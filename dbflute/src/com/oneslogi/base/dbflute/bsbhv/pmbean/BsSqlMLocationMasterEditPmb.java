package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.paging.SimplePagingBean;
import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlMLocationMasterEdit. <br>
 * This is related to "<span style="color: #AD4747">selectSqlMLocationMasterEdit</span>" on MLocationBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlMLocationMasterEditPmb extends SimplePagingBean implements EntityHandlingPmb<MLocationBhv, SqlMLocationMasterEdit>, AutoPagingHandlingPmb<MLocationBhv, SqlMLocationMasterEdit>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of locationId. */
    protected Long _locationId;

    /** The parameter of replenishProductId. */
    protected Long _replenishProductId;

    /** The parameter of replenishStockTypeId. */
    protected Long _replenishStockTypeId;

    /** The parameter of replenishDepositId. */
    protected Long _replenishDepositId;

    /** The parameter of replenishPProductShapeId. */
    protected Long _replenishPProductShapeId;

    /** The parameter of maxStoreProductShapeId. */
    protected Long _maxStoreProductShapeId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlMLocationMasterEdit. <br>
     * This is related to "<span style="color: #AD4747">selectSqlMLocationMasterEdit</span>" on MLocationBhv.
     */
    public BsSqlMLocationMasterEditPmb() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlMLocationMasterEdit"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlMLocationMasterEdit> getEntityType() { return SqlMLocationMasterEdit.class; }

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
        sb.append(dm).append(_locationId);
        sb.append(dm).append(_replenishProductId);
        sb.append(dm).append(_replenishStockTypeId);
        sb.append(dm).append(_replenishDepositId);
        sb.append(dm).append(_replenishPProductShapeId);
        sb.append(dm).append(_maxStoreProductShapeId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] locationId <br>
     * @return The value of locationId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] locationId <br>
     * @param locationId The value of locationId. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        _locationId = locationId;
    }

    /**
     * [get] replenishProductId <br>
     * @return The value of replenishProductId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getReplenishProductId() {
        return _replenishProductId;
    }

    /**
     * [set] replenishProductId <br>
     * @param replenishProductId The value of replenishProductId. (NullAllowed)
     */
    public void setReplenishProductId(Long replenishProductId) {
        _replenishProductId = replenishProductId;
    }

    /**
     * [get] replenishStockTypeId <br>
     * @return The value of replenishStockTypeId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getReplenishStockTypeId() {
        return _replenishStockTypeId;
    }

    /**
     * [set] replenishStockTypeId <br>
     * @param replenishStockTypeId The value of replenishStockTypeId. (NullAllowed)
     */
    public void setReplenishStockTypeId(Long replenishStockTypeId) {
        _replenishStockTypeId = replenishStockTypeId;
    }

    /**
     * [get] replenishDepositId <br>
     * @return The value of replenishDepositId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getReplenishDepositId() {
        return _replenishDepositId;
    }

    /**
     * [set] replenishDepositId <br>
     * @param replenishDepositId The value of replenishDepositId. (NullAllowed)
     */
    public void setReplenishDepositId(Long replenishDepositId) {
        _replenishDepositId = replenishDepositId;
    }

    /**
     * [get] replenishPProductShapeId <br>
     * @return The value of replenishPProductShapeId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getReplenishPProductShapeId() {
        return _replenishPProductShapeId;
    }

    /**
     * [set] replenishPProductShapeId <br>
     * @param replenishPProductShapeId The value of replenishPProductShapeId. (NullAllowed)
     */
    public void setReplenishPProductShapeId(Long replenishPProductShapeId) {
        _replenishPProductShapeId = replenishPProductShapeId;
    }

    /**
     * [get] maxStoreProductShapeId <br>
     * @return The value of maxStoreProductShapeId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getMaxStoreProductShapeId() {
        return _maxStoreProductShapeId;
    }

    /**
     * [set] maxStoreProductShapeId <br>
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId. (NullAllowed)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        _maxStoreProductShapeId = maxStoreProductShapeId;
    }
}
