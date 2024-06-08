package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlReceiveStatusProgress. <br>
 * This is related to "<span style="color: #AD4747">selectSqlReceiveStatusProgress</span>" on TReceivePlanHBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlReceiveStatusProgressPmb implements ListHandlingPmb<TReceivePlanHBhv, SqlReceiveStatusProgress>, EntityHandlingPmb<TReceivePlanHBhv, SqlReceiveStatusProgress>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of planSupplierCd:likePrefix. */
    protected String _planSupplierCd;

    /** The option of like-search for planSupplierCd. */
    protected LikeSearchOption _planSupplierCdInternalLikeSearchOption;

    /** The parameter of receivePlanDtFrom. */
    protected String _receivePlanDtFrom;

    /** The parameter of receivePlanDtTo. */
    protected String _receivePlanDtTo;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlReceiveStatusProgress. <br>
     * This is related to "<span style="color: #AD4747">selectSqlReceiveStatusProgress</span>" on TReceivePlanHBhv.
     */
    public BsSqlReceiveStatusProgressPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlReceiveStatusProgress"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlReceiveStatusProgress> getEntityType() { return SqlReceiveStatusProgress.class; }

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

    protected void assertLikeSearchOptionValid(String name, LikeSearchOption option) { PmbCustodial.assertLikeSearchOptionValid(name, option); }

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
        sb.append(dm).append(_planSupplierCd);
        sb.append(dm).append(_receivePlanDtFrom);
        sb.append(dm).append(_receivePlanDtTo);
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
     * [get] planSupplierCd:likePrefix <br>
     * @return The value of planSupplierCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPlanSupplierCd() {
        return filterStringParameter(_planSupplierCd);
    }

    /**
     * [set as prefixSearch] planSupplierCd:likePrefix <br>
     * @param planSupplierCd The value of planSupplierCd. (NullAllowed)
     */
    public void setPlanSupplierCd_PrefixSearch(String planSupplierCd) {
        _planSupplierCd = planSupplierCd;
        _planSupplierCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for planSupplierCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for planSupplierCd. (NullAllowed)
     */
    public LikeSearchOption getPlanSupplierCdInternalLikeSearchOption() {
        return _planSupplierCdInternalLikeSearchOption;
    }

    /**
     * [get] receivePlanDtFrom <br>
     * @return The value of receivePlanDtFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceivePlanDtFrom() {
        return filterStringParameter(_receivePlanDtFrom);
    }

    /**
     * [set] receivePlanDtFrom <br>
     * @param receivePlanDtFrom The value of receivePlanDtFrom. (NullAllowed)
     */
    public void setReceivePlanDtFrom(String receivePlanDtFrom) {
        _receivePlanDtFrom = receivePlanDtFrom;
    }

    /**
     * [get] receivePlanDtTo <br>
     * @return The value of receivePlanDtTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceivePlanDtTo() {
        return filterStringParameter(_receivePlanDtTo);
    }

    /**
     * [set] receivePlanDtTo <br>
     * @param receivePlanDtTo The value of receivePlanDtTo. (NullAllowed)
     */
    public void setReceivePlanDtTo(String receivePlanDtTo) {
        _receivePlanDtTo = receivePlanDtTo;
    }
}
