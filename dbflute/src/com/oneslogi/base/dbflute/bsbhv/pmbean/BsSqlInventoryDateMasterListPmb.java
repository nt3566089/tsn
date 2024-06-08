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
 * The base class for typed parameter-bean of SqlInventoryDateMasterList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlInventoryDateMasterList</span>" on MMfinvoperationBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlInventoryDateMasterListPmb extends SimplePagingBean implements EntityHandlingPmb<MMfinvoperationBhv, SqlInventoryDateMasterList>, AutoPagingHandlingPmb<MMfinvoperationBhv, SqlInventoryDateMasterList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of targetDate:likePrefix. */
    protected String _targetDate;

    /** The option of like-search for targetDate. */
    protected LikeSearchOption _targetDateInternalLikeSearchOption;

    /** The parameter of sundayFlg. */
    protected String _sundayFlg;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlInventoryDateMasterList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlInventoryDateMasterList</span>" on MMfinvoperationBhv.
     */
    public BsSqlInventoryDateMasterListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlInventoryDateMasterList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlInventoryDateMasterList> getEntityType() { return SqlInventoryDateMasterList.class; }

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
        sb.append(dm).append(_targetDate);
        sb.append(dm).append(_sundayFlg);
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
     * [get] targetDate:likePrefix <br>
     * @return The value of targetDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTargetDate() {
        return filterStringParameter(_targetDate);
    }

    /**
     * [set as prefixSearch] targetDate:likePrefix <br>
     * @param targetDate The value of targetDate. (NullAllowed)
     */
    public void setTargetDate_PrefixSearch(String targetDate) {
        _targetDate = targetDate;
        _targetDateInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for targetDate. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for targetDate. (NullAllowed)
     */
    public LikeSearchOption getTargetDateInternalLikeSearchOption() {
        return _targetDateInternalLikeSearchOption;
    }

    /**
     * [get] sundayFlg <br>
     * @return The value of sundayFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSundayFlg() {
        return filterStringParameter(_sundayFlg);
    }

    /**
     * [set] sundayFlg <br>
     * @param sundayFlg The value of sundayFlg. (NullAllowed)
     */
    public void setSundayFlg(String sundayFlg) {
        _sundayFlg = sundayFlg;
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
