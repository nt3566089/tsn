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
 * The base class for typed parameter-bean of SqlTCcopamPrintUsed. <br>
 * This is related to "<span style="color: #AD4747">selectSqlTCcopamPrintUsed</span>" on TCcopamBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlTCcopamPrintUsedPmb implements ListHandlingPmb<TCcopamBhv, SqlTCcopamPrintUsed>, EntityHandlingPmb<TCcopamBhv, SqlTCcopamPrintUsed>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of systemDt. */
    protected String _systemDt;

    /** The parameter of tdrelayid. */
    protected String _tdrelayid;

    /** The parameter of controlNo. */
    protected Long _controlNo;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlTCcopamPrintUsed. <br>
     * This is related to "<span style="color: #AD4747">selectSqlTCcopamPrintUsed</span>" on TCcopamBhv.
     */
    public BsSqlTCcopamPrintUsedPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlTCcopamPrintUsed"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlTCcopamPrintUsed> getEntityType() { return SqlTCcopamPrintUsed.class; }

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
        sb.append(dm).append(_systemDt);
        sb.append(dm).append(_tdrelayid);
        sb.append(dm).append(_controlNo);
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
     * [get] controlNo <br>
     * @return The value of controlNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] controlNo <br>
     * @param controlNo The value of controlNo. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        _controlNo = controlNo;
    }
}
