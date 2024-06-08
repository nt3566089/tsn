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
 * The base class for typed parameter-bean of SqlInstKeyPrint. <br>
 * This is related to "<span style="color: #AD4747">selectSqlInstKeyPrint</span>" on TInventoryInstBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlInstKeyPrintPmb extends SimplePagingBean implements EntityHandlingPmb<TInventoryInstBhv, SqlInstKeyPrint>, AutoPagingHandlingPmb<TInventoryInstBhv, SqlInstKeyPrint>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of inventoryInstKbn. */
    protected String _inventoryInstKbn;

    /** The parameter of inventoryKey. */
    protected Long _inventoryKey;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlInstKeyPrint. <br>
     * This is related to "<span style="color: #AD4747">selectSqlInstKeyPrint</span>" on TInventoryInstBhv.
     */
    public BsSqlInstKeyPrintPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlInstKeyPrint"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlInstKeyPrint> getEntityType() { return SqlInstKeyPrint.class; }

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
        sb.append(dm).append(_inventoryKey);
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
     * [get] inventoryKey <br>
     * @return The value of inventoryKey. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getInventoryKey() {
        return _inventoryKey;
    }

    /**
     * [set] inventoryKey <br>
     * @param inventoryKey The value of inventoryKey. (NullAllowed)
     */
    public void setInventoryKey(Long inventoryKey) {
        _inventoryKey = inventoryKey;
    }
}
