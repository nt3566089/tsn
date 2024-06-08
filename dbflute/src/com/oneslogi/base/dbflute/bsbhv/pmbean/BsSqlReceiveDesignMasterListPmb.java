package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.paging.SimplePagingBean;
import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlReceiveDesignMasterList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlReceiveDesignMasterList</span>" on MMfrcvdesignBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlReceiveDesignMasterListPmb extends SimplePagingBean implements EntityHandlingPmb<MMfrcvdesignBhv, SqlReceiveDesignMasterList>, AutoPagingHandlingPmb<MMfrcvdesignBhv, SqlReceiveDesignMasterList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of productCd:likePrefix. */
    protected String _productCd;

    /** The option of like-search for productCd. */
    protected LikeSearchOption _productCdInternalLikeSearchOption;

    /** The parameter of validType. */
    protected String _validType;

    /** The parameter of upDate. */
    protected String _upDate;

    /** The parameter of rcvfrDateFrom. */
    protected String _rcvfrDateFrom;

    /** The parameter of rcvfrDateTo. */
    protected String _rcvfrDateTo;

    /** The parameter of rcvtoDateFrom. */
    protected String _rcvtoDateFrom;

    /** The parameter of rcvtoDateTo. */
    protected String _rcvtoDateTo;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlReceiveDesignMasterList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlReceiveDesignMasterList</span>" on MMfrcvdesignBhv.
     */
    public BsSqlReceiveDesignMasterListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlReceiveDesignMasterList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlReceiveDesignMasterList> getEntityType() { return SqlReceiveDesignMasterList.class; }

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
        sb.append(dm).append(_productCd);
        sb.append(dm).append(_validType);
        sb.append(dm).append(_upDate);
        sb.append(dm).append(_rcvfrDateFrom);
        sb.append(dm).append(_rcvfrDateTo);
        sb.append(dm).append(_rcvtoDateFrom);
        sb.append(dm).append(_rcvtoDateTo);
        sb.append(dm).append(_clientId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] productCd:likePrefix <br>
     * @return The value of productCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getProductCd() {
        return filterStringParameter(_productCd);
    }

    /**
     * [set as prefixSearch] productCd:likePrefix <br>
     * @param productCd The value of productCd. (NullAllowed)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        _productCd = productCd;
        _productCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for productCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for productCd. (NullAllowed)
     */
    public LikeSearchOption getProductCdInternalLikeSearchOption() {
        return _productCdInternalLikeSearchOption;
    }

    /**
     * [get] validType <br>
     * @return The value of validType. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getValidType() {
        return filterStringParameter(_validType);
    }

    /**
     * [set] validType <br>
     * @param validType The value of validType. (NullAllowed)
     */
    public void setValidType(String validType) {
        _validType = validType;
    }

    /**
     * [get] upDate <br>
     * @return The value of upDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getUpDate() {
        return filterStringParameter(_upDate);
    }

    /**
     * [set] upDate <br>
     * @param upDate The value of upDate. (NullAllowed)
     */
    public void setUpDate(String upDate) {
        _upDate = upDate;
    }

    /**
     * [get] rcvfrDateFrom <br>
     * @return The value of rcvfrDateFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getRcvfrDateFrom() {
        return filterStringParameter(_rcvfrDateFrom);
    }

    /**
     * [set] rcvfrDateFrom <br>
     * @param rcvfrDateFrom The value of rcvfrDateFrom. (NullAllowed)
     */
    public void setRcvfrDateFrom(String rcvfrDateFrom) {
        _rcvfrDateFrom = rcvfrDateFrom;
    }

    /**
     * [get] rcvfrDateTo <br>
     * @return The value of rcvfrDateTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getRcvfrDateTo() {
        return filterStringParameter(_rcvfrDateTo);
    }

    /**
     * [set] rcvfrDateTo <br>
     * @param rcvfrDateTo The value of rcvfrDateTo. (NullAllowed)
     */
    public void setRcvfrDateTo(String rcvfrDateTo) {
        _rcvfrDateTo = rcvfrDateTo;
    }

    /**
     * [get] rcvtoDateFrom <br>
     * @return The value of rcvtoDateFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getRcvtoDateFrom() {
        return filterStringParameter(_rcvtoDateFrom);
    }

    /**
     * [set] rcvtoDateFrom <br>
     * @param rcvtoDateFrom The value of rcvtoDateFrom. (NullAllowed)
     */
    public void setRcvtoDateFrom(String rcvtoDateFrom) {
        _rcvtoDateFrom = rcvtoDateFrom;
    }

    /**
     * [get] rcvtoDateTo <br>
     * @return The value of rcvtoDateTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getRcvtoDateTo() {
        return filterStringParameter(_rcvtoDateTo);
    }

    /**
     * [set] rcvtoDateTo <br>
     * @param rcvtoDateTo The value of rcvtoDateTo. (NullAllowed)
     */
    public void setRcvtoDateTo(String rcvtoDateTo) {
        _rcvtoDateTo = rcvtoDateTo;
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
