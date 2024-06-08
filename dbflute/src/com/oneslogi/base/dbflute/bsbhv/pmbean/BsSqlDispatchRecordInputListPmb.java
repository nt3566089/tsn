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
 * The base class for typed parameter-bean of SqlDispatchRecordInputList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlDispatchRecordInputList</span>" on TCcopamBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlDispatchRecordInputListPmb extends SimplePagingBean implements EntityHandlingPmb<TCcopamBhv, SqlDispatchRecordInputList>, AutoPagingHandlingPmb<TCcopamBhv, SqlDispatchRecordInputList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of systemDt. */
    protected String _systemDt;

    /** The parameter of tdrelayid. */
    protected String _tdrelayid;

    /** The parameter of stcd. */
    protected String _stcd;

    /** The parameter of snno3:likePrefix. */
    protected String _snno3;

    /** The option of like-search for snno3. */
    protected LikeSearchOption _snno3InternalLikeSearchOption;

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
     * Constructor for the typed parameter-bean of SqlDispatchRecordInputList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlDispatchRecordInputList</span>" on TCcopamBhv.
     */
    public BsSqlDispatchRecordInputListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlDispatchRecordInputList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlDispatchRecordInputList> getEntityType() { return SqlDispatchRecordInputList.class; }

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
        sb.append(dm).append(_systemDt);
        sb.append(dm).append(_tdrelayid);
        sb.append(dm).append(_stcd);
        sb.append(dm).append(_snno3);
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
     * [get] systemDt <br>
     * @return The value of systemDt. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSystemDt() {
        return filterStringParameter(_systemDt);
    }

    /**
     * [set] systemDt <br>
     * @param systemDt The value of systemDt. (NullAllowed)
     */
    public void setSystemDt(String systemDt) {
        _systemDt = systemDt;
    }

    /**
     * [get] tdrelayid <br>
     * @return The value of tdrelayid. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTdrelayid() {
        return filterStringParameter(_tdrelayid);
    }

    /**
     * [set] tdrelayid <br>
     * @param tdrelayid The value of tdrelayid. (NullAllowed)
     */
    public void setTdrelayid(String tdrelayid) {
        _tdrelayid = tdrelayid;
    }

    /**
     * [get] stcd <br>
     * @return The value of stcd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getStcd() {
        return filterStringParameter(_stcd);
    }

    /**
     * [set] stcd <br>
     * @param stcd The value of stcd. (NullAllowed)
     */
    public void setStcd(String stcd) {
        _stcd = stcd;
    }

    /**
     * [get] snno3:likePrefix <br>
     * @return The value of snno3. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSnno3() {
        return filterStringParameter(_snno3);
    }

    /**
     * [set as prefixSearch] snno3:likePrefix <br>
     * @param snno3 The value of snno3. (NullAllowed)
     */
    public void setSnno3_PrefixSearch(String snno3) {
        _snno3 = snno3;
        _snno3InternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for snno3. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for snno3. (NullAllowed)
     */
    public LikeSearchOption getSnno3InternalLikeSearchOption() {
        return _snno3InternalLikeSearchOption;
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
