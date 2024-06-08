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
 * The base class for typed parameter-bean of SqlELocationList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlELocationList</span>" on ELocationBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlELocationListPmb extends SimplePagingBean implements EntityHandlingPmb<ELocationBhv, SqlELocationList>, AutoPagingHandlingPmb<ELocationBhv, SqlELocationList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of receiveCd. */
    protected String _receiveCd;

    /** The parameter of errorFlg. */
    protected String _errorFlg;

    /** The parameter of importFlg. */
    protected String _importFlg;

    /** The parameter of cultureId. */
    protected Long _cultureId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlELocationList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlELocationList</span>" on ELocationBhv.
     */
    public BsSqlELocationListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlELocationList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlELocationList> getEntityType() { return SqlELocationList.class; }

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
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_receiveCd);
        sb.append(dm).append(_errorFlg);
        sb.append(dm).append(_importFlg);
        sb.append(dm).append(_cultureId);
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
     * [get] receiveCd <br>
     * @return The value of receiveCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceiveCd() {
        return filterStringParameter(_receiveCd);
    }

    /**
     * [set] receiveCd <br>
     * @param receiveCd The value of receiveCd. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        _receiveCd = receiveCd;
    }

    /**
     * [get] errorFlg <br>
     * @return The value of errorFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getErrorFlg() {
        return filterStringParameter(_errorFlg);
    }

    /**
     * [set] errorFlg <br>
     * @param errorFlg The value of errorFlg. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        _errorFlg = errorFlg;
    }

    /**
     * [get] importFlg <br>
     * @return The value of importFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getImportFlg() {
        return filterStringParameter(_importFlg);
    }

    /**
     * [set] importFlg <br>
     * @param importFlg The value of importFlg. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        _importFlg = importFlg;
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
