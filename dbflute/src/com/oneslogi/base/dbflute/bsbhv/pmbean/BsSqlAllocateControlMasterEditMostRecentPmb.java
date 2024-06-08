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
 * The base class for typed parameter-bean of SqlAllocateControlMasterEditMostRecent. <br>
 * This is related to "<span style="color: #AD4747">selectSqlAllocateControlMasterEditMostRecent</span>" on MMfpickctlBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlAllocateControlMasterEditMostRecentPmb extends SimplePagingBean implements EntityHandlingPmb<MMfpickctlBhv, SqlAllocateControlMasterEditMostRecent>, AutoPagingHandlingPmb<MMfpickctlBhv, SqlAllocateControlMasterEditMostRecent>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of productCd. */
    protected String _productCd;

    /** The parameter of pickfrdate. */
    protected String _pickfrdate;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlAllocateControlMasterEditMostRecent. <br>
     * This is related to "<span style="color: #AD4747">selectSqlAllocateControlMasterEditMostRecent</span>" on MMfpickctlBhv.
     */
    public BsSqlAllocateControlMasterEditMostRecentPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlAllocateControlMasterEditMostRecent"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlAllocateControlMasterEditMostRecent> getEntityType() { return SqlAllocateControlMasterEditMostRecent.class; }

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
        sb.append(dm).append(_productCd);
        sb.append(dm).append(_pickfrdate);
        sb.append(dm).append(_clientId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] productCd <br>
     * @return The value of productCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getProductCd() {
        return filterStringParameter(_productCd);
    }

    /**
     * [set] productCd <br>
     * @param productCd The value of productCd. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        _productCd = productCd;
    }

    /**
     * [get] pickfrdate <br>
     * @return The value of pickfrdate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickfrdate() {
        return filterStringParameter(_pickfrdate);
    }

    /**
     * [set] pickfrdate <br>
     * @param pickfrdate The value of pickfrdate. (NullAllowed)
     */
    public void setPickfrdate(String pickfrdate) {
        _pickfrdate = pickfrdate;
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
