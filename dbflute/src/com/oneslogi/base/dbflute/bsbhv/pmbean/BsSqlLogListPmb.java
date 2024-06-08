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
 * The base class for typed parameter-bean of SqlLogList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlLogList</span>" on BLogBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlLogListPmb extends SimplePagingBean implements EntityHandlingPmb<BLogBhv, SqlLogList>, AutoPagingHandlingPmb<BLogBhv, SqlLogList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of logStatus. */
    protected String _logStatus;

    /** The parameter of processDtFrom. */
    protected String _processDtFrom;

    /** The parameter of processDtTo. */
    protected String _processDtTo;

    /** The parameter of pgm:likeContain. */
    protected String _pgm;

    /** The option of like-search for pgm. */
    protected LikeSearchOption _pgmInternalLikeSearchOption;

    /** The parameter of attribute1. */
    protected String _attribute1;

    /** The parameter of attribute2. */
    protected String _attribute2;

    /** The parameter of attribute3. */
    protected String _attribute3;

    /** The parameter of attribute4. */
    protected String _attribute4;

    /** The parameter of attribute5. */
    protected String _attribute5;

    /** The parameter of cultureId. */
    protected Long _cultureId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlLogList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlLogList</span>" on BLogBhv.
     */
    public BsSqlLogListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlLogList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlLogList> getEntityType() { return SqlLogList.class; }

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
        sb.append(dm).append(_logStatus);
        sb.append(dm).append(_processDtFrom);
        sb.append(dm).append(_processDtTo);
        sb.append(dm).append(_pgm);
        sb.append(dm).append(_attribute1);
        sb.append(dm).append(_attribute2);
        sb.append(dm).append(_attribute3);
        sb.append(dm).append(_attribute4);
        sb.append(dm).append(_attribute5);
        sb.append(dm).append(_cultureId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] logStatus <br>
     * @return The value of logStatus. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLogStatus() {
        return filterStringParameter(_logStatus);
    }

    /**
     * [set] logStatus <br>
     * @param logStatus The value of logStatus. (NullAllowed)
     */
    public void setLogStatus(String logStatus) {
        _logStatus = logStatus;
    }

    /**
     * [get] processDtFrom <br>
     * @return The value of processDtFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getProcessDtFrom() {
        return filterStringParameter(_processDtFrom);
    }

    /**
     * [set] processDtFrom <br>
     * @param processDtFrom The value of processDtFrom. (NullAllowed)
     */
    public void setProcessDtFrom(String processDtFrom) {
        _processDtFrom = processDtFrom;
    }

    /**
     * [get] processDtTo <br>
     * @return The value of processDtTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getProcessDtTo() {
        return filterStringParameter(_processDtTo);
    }

    /**
     * [set] processDtTo <br>
     * @param processDtTo The value of processDtTo. (NullAllowed)
     */
    public void setProcessDtTo(String processDtTo) {
        _processDtTo = processDtTo;
    }

    /**
     * [get] pgm:likeContain <br>
     * @return The value of pgm. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPgm() {
        return filterStringParameter(_pgm);
    }

    /**
     * [set as containSearch] pgm:likeContain <br>
     * @param pgm The value of pgm. (NullAllowed)
     */
    public void setPgm_ContainSearch(String pgm) {
        _pgm = pgm;
        _pgmInternalLikeSearchOption = new LikeSearchOption().likeContain();
    }

    /**
     * Get the internal option of likeSearch for pgm. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for pgm. (NullAllowed)
     */
    public LikeSearchOption getPgmInternalLikeSearchOption() {
        return _pgmInternalLikeSearchOption;
    }

    /**
     * [get] attribute1 <br>
     * @return The value of attribute1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getAttribute1() {
        return filterStringParameter(_attribute1);
    }

    /**
     * [set] attribute1 <br>
     * @param attribute1 The value of attribute1. (NullAllowed)
     */
    public void setAttribute1(String attribute1) {
        _attribute1 = attribute1;
    }

    /**
     * [get] attribute2 <br>
     * @return The value of attribute2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getAttribute2() {
        return filterStringParameter(_attribute2);
    }

    /**
     * [set] attribute2 <br>
     * @param attribute2 The value of attribute2. (NullAllowed)
     */
    public void setAttribute2(String attribute2) {
        _attribute2 = attribute2;
    }

    /**
     * [get] attribute3 <br>
     * @return The value of attribute3. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getAttribute3() {
        return filterStringParameter(_attribute3);
    }

    /**
     * [set] attribute3 <br>
     * @param attribute3 The value of attribute3. (NullAllowed)
     */
    public void setAttribute3(String attribute3) {
        _attribute3 = attribute3;
    }

    /**
     * [get] attribute4 <br>
     * @return The value of attribute4. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getAttribute4() {
        return filterStringParameter(_attribute4);
    }

    /**
     * [set] attribute4 <br>
     * @param attribute4 The value of attribute4. (NullAllowed)
     */
    public void setAttribute4(String attribute4) {
        _attribute4 = attribute4;
    }

    /**
     * [get] attribute5 <br>
     * @return The value of attribute5. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getAttribute5() {
        return filterStringParameter(_attribute5);
    }

    /**
     * [set] attribute5 <br>
     * @param attribute5 The value of attribute5. (NullAllowed)
     */
    public void setAttribute5(String attribute5) {
        _attribute5 = attribute5;
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
}
