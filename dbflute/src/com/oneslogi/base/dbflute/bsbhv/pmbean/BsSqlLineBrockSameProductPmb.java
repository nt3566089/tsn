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
 * The base class for typed parameter-bean of SqlLineBrockSameProduct. <br>
 * This is related to "<span style="color: #AD4747">selectSqlLineBrockSameProduct</span>" on MLocationBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlLineBrockSameProductPmb extends SimplePagingBean implements EntityHandlingPmb<MLocationBhv, SqlLineBrockSameProduct>, AutoPagingHandlingPmb<MLocationBhv, SqlLineBrockSameProduct>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of lincd. */
    protected String _lincd;

    /** The parameter of blkcd1. */
    protected String _blkcd1;

    /** The parameter of blkcd2. */
    protected String _blkcd2;

    /** The parameter of blkcd3. */
    protected String _blkcd3;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlLineBrockSameProduct. <br>
     * This is related to "<span style="color: #AD4747">selectSqlLineBrockSameProduct</span>" on MLocationBhv.
     */
    public BsSqlLineBrockSameProductPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlLineBrockSameProduct"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlLineBrockSameProduct> getEntityType() { return SqlLineBrockSameProduct.class; }

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
        sb.append(dm).append(_lincd);
        sb.append(dm).append(_blkcd1);
        sb.append(dm).append(_blkcd2);
        sb.append(dm).append(_blkcd3);
        sb.append(dm).append(_centerId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] lincd <br>
     * @return The value of lincd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLincd() {
        return filterStringParameter(_lincd);
    }

    /**
     * [set] lincd <br>
     * @param lincd The value of lincd. (NullAllowed)
     */
    public void setLincd(String lincd) {
        _lincd = lincd;
    }

    /**
     * [get] blkcd1 <br>
     * @return The value of blkcd1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBlkcd1() {
        return filterStringParameter(_blkcd1);
    }

    /**
     * [set] blkcd1 <br>
     * @param blkcd1 The value of blkcd1. (NullAllowed)
     */
    public void setBlkcd1(String blkcd1) {
        _blkcd1 = blkcd1;
    }

    /**
     * [get] blkcd2 <br>
     * @return The value of blkcd2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBlkcd2() {
        return filterStringParameter(_blkcd2);
    }

    /**
     * [set] blkcd2 <br>
     * @param blkcd2 The value of blkcd2. (NullAllowed)
     */
    public void setBlkcd2(String blkcd2) {
        _blkcd2 = blkcd2;
    }

    /**
     * [get] blkcd3 <br>
     * @return The value of blkcd3. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBlkcd3() {
        return filterStringParameter(_blkcd3);
    }

    /**
     * [set] blkcd3 <br>
     * @param blkcd3 The value of blkcd3. (NullAllowed)
     */
    public void setBlkcd3(String blkcd3) {
        _blkcd3 = blkcd3;
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
}
