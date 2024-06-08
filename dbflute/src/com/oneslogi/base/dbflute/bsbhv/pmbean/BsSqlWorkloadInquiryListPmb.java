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
 * The base class for typed parameter-bean of SqlWorkloadInquiryList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlWorkloadInquiryList</span>" on TTrworkBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlWorkloadInquiryListPmb extends SimplePagingBean implements EntityHandlingPmb<TTrworkBhv, SqlWorkloadInquiryList>, AutoPagingHandlingPmb<TTrworkBhv, SqlWorkloadInquiryList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of sequenceno. */
    protected List<Long> _sequenceno;

    /** The parameter of cultureId. */
    protected Long _cultureId;

    /** The parameter of centerCd. */
    protected String _centerCd;

    /** The parameter of clientCd. */
    protected String _clientCd;

    /** The parameter of taskType. */
    protected String _taskType;

    /** The parameter of taskTypeDetail. */
    protected String _taskTypeDetail;

    /** The parameter of workDt. */
    protected String _workDt;

    /** The parameter of workTimeFrom. */
    protected String _workTimeFrom;

    /** The parameter of workTimeTo. */
    protected String _workTimeTo;

    /** The parameter of startendType. */
    protected String _startendType;

    /** The parameter of usercd:likePrefix. */
    protected String _usercd;

    /** The option of like-search for usercd. */
    protected LikeSearchOption _usercdInternalLikeSearchOption;

    /** The parameter of userNm:likePrefix. */
    protected String _userNm;

    /** The option of like-search for userNm. */
    protected LikeSearchOption _userNmInternalLikeSearchOption;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlWorkloadInquiryList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlWorkloadInquiryList</span>" on TTrworkBhv.
     */
    public BsSqlWorkloadInquiryListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlWorkloadInquiryList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlWorkloadInquiryList> getEntityType() { return SqlWorkloadInquiryList.class; }

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
        sb.append(dm).append(_sequenceno);
        sb.append(dm).append(_cultureId);
        sb.append(dm).append(_centerCd);
        sb.append(dm).append(_clientCd);
        sb.append(dm).append(_taskType);
        sb.append(dm).append(_taskTypeDetail);
        sb.append(dm).append(_workDt);
        sb.append(dm).append(_workTimeFrom);
        sb.append(dm).append(_workTimeTo);
        sb.append(dm).append(_startendType);
        sb.append(dm).append(_usercd);
        sb.append(dm).append(_userNm);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] sequenceno <br>
     * @return The value of sequenceno. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<Long> getSequenceno() {
        return _sequenceno;
    }

    /**
     * [set] sequenceno <br>
     * @param sequenceno The value of sequenceno. (NullAllowed)
     */
    public void setSequenceno(List<Long> sequenceno) {
        _sequenceno = sequenceno;
    }

    /**
     * [get] cultureId <br>
     * @return The value of cultureId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] cultureId <br>
     * @param cultureId The value of cultureId. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        _cultureId = cultureId;
    }

    /**
     * [get] centerCd <br>
     * @return The value of centerCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCenterCd() {
        return filterStringParameter(_centerCd);
    }

    /**
     * [set] centerCd <br>
     * @param centerCd The value of centerCd. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        _centerCd = centerCd;
    }

    /**
     * [get] clientCd <br>
     * @return The value of clientCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getClientCd() {
        return filterStringParameter(_clientCd);
    }

    /**
     * [set] clientCd <br>
     * @param clientCd The value of clientCd. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        _clientCd = clientCd;
    }

    /**
     * [get] taskType <br>
     * @return The value of taskType. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTaskType() {
        return filterStringParameter(_taskType);
    }

    /**
     * [set] taskType <br>
     * @param taskType The value of taskType. (NullAllowed)
     */
    public void setTaskType(String taskType) {
        _taskType = taskType;
    }

    /**
     * [get] taskTypeDetail <br>
     * @return The value of taskTypeDetail. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTaskTypeDetail() {
        return filterStringParameter(_taskTypeDetail);
    }

    /**
     * [set] taskTypeDetail <br>
     * @param taskTypeDetail The value of taskTypeDetail. (NullAllowed)
     */
    public void setTaskTypeDetail(String taskTypeDetail) {
        _taskTypeDetail = taskTypeDetail;
    }

    /**
     * [get] workDt <br>
     * @return The value of workDt. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getWorkDt() {
        return filterStringParameter(_workDt);
    }

    /**
     * [set] workDt <br>
     * @param workDt The value of workDt. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        _workDt = workDt;
    }

    /**
     * [get] workTimeFrom <br>
     * @return The value of workTimeFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getWorkTimeFrom() {
        return filterStringParameter(_workTimeFrom);
    }

    /**
     * [set] workTimeFrom <br>
     * @param workTimeFrom The value of workTimeFrom. (NullAllowed)
     */
    public void setWorkTimeFrom(String workTimeFrom) {
        _workTimeFrom = workTimeFrom;
    }

    /**
     * [get] workTimeTo <br>
     * @return The value of workTimeTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getWorkTimeTo() {
        return filterStringParameter(_workTimeTo);
    }

    /**
     * [set] workTimeTo <br>
     * @param workTimeTo The value of workTimeTo. (NullAllowed)
     */
    public void setWorkTimeTo(String workTimeTo) {
        _workTimeTo = workTimeTo;
    }

    /**
     * [get] startendType <br>
     * @return The value of startendType. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getStartendType() {
        return filterStringParameter(_startendType);
    }

    /**
     * [set] startendType <br>
     * @param startendType The value of startendType. (NullAllowed)
     */
    public void setStartendType(String startendType) {
        _startendType = startendType;
    }

    /**
     * [get] usercd:likePrefix <br>
     * @return The value of usercd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getUsercd() {
        return filterStringParameter(_usercd);
    }

    /**
     * [set as prefixSearch] usercd:likePrefix <br>
     * @param usercd The value of usercd. (NullAllowed)
     */
    public void setUsercd_PrefixSearch(String usercd) {
        _usercd = usercd;
        _usercdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for usercd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for usercd. (NullAllowed)
     */
    public LikeSearchOption getUsercdInternalLikeSearchOption() {
        return _usercdInternalLikeSearchOption;
    }

    /**
     * [get] userNm:likePrefix <br>
     * @return The value of userNm. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getUserNm() {
        return filterStringParameter(_userNm);
    }

    /**
     * [set as prefixSearch] userNm:likePrefix <br>
     * @param userNm The value of userNm. (NullAllowed)
     */
    public void setUserNm_PrefixSearch(String userNm) {
        _userNm = userNm;
        _userNmInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for userNm. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for userNm. (NullAllowed)
     */
    public LikeSearchOption getUserNmInternalLikeSearchOption() {
        return _userNmInternalLikeSearchOption;
    }
}
