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
 * The base class for typed parameter-bean of SqlMLocationMasterOutput. <br>
 * This is related to "<span style="color: #AD4747">selectSqlMLocationMasterOutput</span>" on MLocationBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlMLocationMasterOutputPmb extends SimplePagingBean implements EntityHandlingPmb<MLocationBhv, SqlMLocationMasterOutput>, AutoPagingHandlingPmb<MLocationBhv, SqlMLocationMasterOutput>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of locGroup. */
    protected String _locGroup;

    /** The parameter of locationCd:likePrefix. */
    protected String _locationCd;

    /** The option of like-search for locationCd. */
    protected LikeSearchOption _locationCdInternalLikeSearchOption;

    /** The parameter of delFlg. */
    protected String _delFlg;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlMLocationMasterOutput. <br>
     * This is related to "<span style="color: #AD4747">selectSqlMLocationMasterOutput</span>" on MLocationBhv.
     */
    public BsSqlMLocationMasterOutputPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlMLocationMasterOutput"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlMLocationMasterOutput> getEntityType() { return SqlMLocationMasterOutput.class; }

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
        sb.append(dm).append(_locGroup);
        sb.append(dm).append(_locationCd);
        sb.append(dm).append(_delFlg);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_centerId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] locGroup <br>
     * @return The value of locGroup. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLocGroup() {
        return filterStringParameter(_locGroup);
    }

    /**
     * [set] locGroup <br>
     * @param locGroup The value of locGroup. (NullAllowed)
     */
    public void setLocGroup(String locGroup) {
        _locGroup = locGroup;
    }

    /**
     * [get] locationCd:likePrefix <br>
     * @return The value of locationCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLocationCd() {
        return filterStringParameter(_locationCd);
    }

    /**
     * [set as prefixSearch] locationCd:likePrefix <br>
     * @param locationCd The value of locationCd. (NullAllowed)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        _locationCd = locationCd;
        _locationCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for locationCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for locationCd. (NullAllowed)
     */
    public LikeSearchOption getLocationCdInternalLikeSearchOption() {
        return _locationCdInternalLikeSearchOption;
    }

    /**
     * [get] delFlg <br>
     * @return The value of delFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDelFlg() {
        return filterStringParameter(_delFlg);
    }

    /**
     * [set] delFlg <br>
     * @param delFlg The value of delFlg. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        _delFlg = delFlg;
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
