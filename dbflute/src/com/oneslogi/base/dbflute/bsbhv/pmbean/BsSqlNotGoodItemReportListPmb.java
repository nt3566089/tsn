package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlNotGoodItemReportList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlNotGoodItemReportList</span>" on MClientBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlNotGoodItemReportListPmb implements ListHandlingPmb<MClientBhv, SqlNotGoodItemReportList>, EntityHandlingPmb<MClientBhv, SqlNotGoodItemReportList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of invDate. */
    protected String _invDate;

    /** The parameter of printCount. */
    protected Long _printCount;

    /** The parameter of emptyFlag. */
    protected String _emptyFlag;

    /** The parameter of userCd. */
    protected String _userCd;

    /** The parameter of inoutkbn. */
    protected String _inoutkbn;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlNotGoodItemReportList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlNotGoodItemReportList</span>" on MClientBhv.
     */
    public BsSqlNotGoodItemReportListPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlNotGoodItemReportList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlNotGoodItemReportList> getEntityType() { return SqlNotGoodItemReportList.class; }

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
        sb.append(dm).append(_invDate);
        sb.append(dm).append(_printCount);
        sb.append(dm).append(_emptyFlag);
        sb.append(dm).append(_userCd);
        sb.append(dm).append(_inoutkbn);
        sb.append(dm).append(_centerId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] invDate <br>
     * @return The value of invDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInvDate() {
        return filterStringParameter(_invDate);
    }

    /**
     * [set] invDate <br>
     * @param invDate The value of invDate. (NullAllowed)
     */
    public void setInvDate(String invDate) {
        _invDate = invDate;
    }

    /**
     * [get] printCount <br>
     * @return The value of printCount. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getPrintCount() {
        return _printCount;
    }

    /**
     * [set] printCount <br>
     * @param printCount The value of printCount. (NullAllowed)
     */
    public void setPrintCount(Long printCount) {
        _printCount = printCount;
    }

    /**
     * [get] emptyFlag <br>
     * @return The value of emptyFlag. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getEmptyFlag() {
        return filterStringParameter(_emptyFlag);
    }

    /**
     * [set] emptyFlag <br>
     * @param emptyFlag The value of emptyFlag. (NullAllowed)
     */
    public void setEmptyFlag(String emptyFlag) {
        _emptyFlag = emptyFlag;
    }

    /**
     * [get] userCd <br>
     * @return The value of userCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getUserCd() {
        return filterStringParameter(_userCd);
    }

    /**
     * [set] userCd <br>
     * @param userCd The value of userCd. (NullAllowed)
     */
    public void setUserCd(String userCd) {
        _userCd = userCd;
    }

    /**
     * [get] inoutkbn <br>
     * @return The value of inoutkbn. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInoutkbn() {
        return filterStringParameter(_inoutkbn);
    }

    /**
     * [set] inoutkbn <br>
     * @param inoutkbn The value of inoutkbn. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        _inoutkbn = inoutkbn;
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
