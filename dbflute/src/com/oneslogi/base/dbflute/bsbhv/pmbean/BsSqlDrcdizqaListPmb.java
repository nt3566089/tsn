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
 * The base class for typed parameter-bean of SqlDrcdizqaList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlDrcdizqaList</span>" on TDrcdizqaBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlDrcdizqaListPmb extends SimplePagingBean implements EntityHandlingPmb<TDrcdizqaBhv, SqlDrcdizqaList>, AutoPagingHandlingPmb<TDrcdizqaBhv, SqlDrcdizqaList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of lineBlock. */
    protected String _lineBlock;

    /** The parameter of ded. */
    protected String _ded;

    /** The parameter of pstnid. */
    protected String _pstnid;

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
     * Constructor for the typed parameter-bean of SqlDrcdizqaList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlDrcdizqaList</span>" on TDrcdizqaBhv.
     */
    public BsSqlDrcdizqaListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlDrcdizqaList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlDrcdizqaList> getEntityType() { return SqlDrcdizqaList.class; }

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
        sb.append(dm).append(_lineBlock);
        sb.append(dm).append(_ded);
        sb.append(dm).append(_pstnid);
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
     * [get] lineBlock <br>
     * @return The value of lineBlock. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLineBlock() {
        return filterStringParameter(_lineBlock);
    }

    /**
     * [set] lineBlock <br>
     * @param lineBlock The value of lineBlock. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        _lineBlock = lineBlock;
    }

    /**
     * [get] ded <br>
     * @return The value of ded. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDed() {
        return filterStringParameter(_ded);
    }

    /**
     * [set] ded <br>
     * @param ded The value of ded. (NullAllowed)
     */
    public void setDed(String ded) {
        _ded = ded;
    }

    /**
     * [get] pstnid <br>
     * @return The value of pstnid. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPstnid() {
        return filterStringParameter(_pstnid);
    }

    /**
     * [set] pstnid <br>
     * @param pstnid The value of pstnid. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        _pstnid = pstnid;
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
