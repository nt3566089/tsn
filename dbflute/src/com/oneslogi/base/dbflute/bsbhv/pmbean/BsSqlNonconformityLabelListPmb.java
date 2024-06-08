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
 * The base class for typed parameter-bean of SqlNonconformityLabelList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlNonconformityLabelList</span>" on TTrbaditemcaseBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlNonconformityLabelListPmb extends SimplePagingBean implements EntityHandlingPmb<TTrbaditemcaseBhv, SqlNonconformityLabelList>, AutoPagingHandlingPmb<TTrbaditemcaseBhv, SqlNonconformityLabelList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of dtExtdata1. */
    protected String _dtExtdata1;

    /** The parameter of inoutkbn. */
    protected String _inoutkbn;

    /** The parameter of vaExtdata2. */
    protected String _vaExtdata2;

    /** The parameter of createddateFrom. */
    protected String _createddateFrom;

    /** The parameter of createddateTo. */
    protected String _createddateTo;

    /** The parameter of targetmon:likePrefix. */
    protected String _targetmon;

    /** The option of like-search for targetmon. */
    protected LikeSearchOption _targetmonInternalLikeSearchOption;

    /** The parameter of reprintedflg. */
    protected String _reprintedflg;

    /** The parameter of itemcd:likePrefix. */
    protected String _itemcd;

    /** The option of like-search for itemcd. */
    protected LikeSearchOption _itemcdInternalLikeSearchOption;

    /** The parameter of baditemcd. */
    protected Long _baditemcd;

    /** The parameter of todayPrintOnlyFlg. */
    protected String _todayPrintOnlyFlg;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlNonconformityLabelList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlNonconformityLabelList</span>" on TTrbaditemcaseBhv.
     */
    public BsSqlNonconformityLabelListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlNonconformityLabelList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlNonconformityLabelList> getEntityType() { return SqlNonconformityLabelList.class; }

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
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_dtExtdata1);
        sb.append(dm).append(_inoutkbn);
        sb.append(dm).append(_vaExtdata2);
        sb.append(dm).append(_createddateFrom);
        sb.append(dm).append(_createddateTo);
        sb.append(dm).append(_targetmon);
        sb.append(dm).append(_reprintedflg);
        sb.append(dm).append(_itemcd);
        sb.append(dm).append(_baditemcd);
        sb.append(dm).append(_todayPrintOnlyFlg);
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
     * [get] dtExtdata1 <br>
     * @return The value of dtExtdata1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDtExtdata1() {
        return filterStringParameter(_dtExtdata1);
    }

    /**
     * [set] dtExtdata1 <br>
     * @param dtExtdata1 The value of dtExtdata1. (NullAllowed)
     */
    public void setDtExtdata1(String dtExtdata1) {
        _dtExtdata1 = dtExtdata1;
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
     * [get] vaExtdata2 <br>
     * @return The value of vaExtdata2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVaExtdata2() {
        return filterStringParameter(_vaExtdata2);
    }

    /**
     * [set] vaExtdata2 <br>
     * @param vaExtdata2 The value of vaExtdata2. (NullAllowed)
     */
    public void setVaExtdata2(String vaExtdata2) {
        _vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] createddateFrom <br>
     * @return The value of createddateFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCreateddateFrom() {
        return filterStringParameter(_createddateFrom);
    }

    /**
     * [set] createddateFrom <br>
     * @param createddateFrom The value of createddateFrom. (NullAllowed)
     */
    public void setCreateddateFrom(String createddateFrom) {
        _createddateFrom = createddateFrom;
    }

    /**
     * [get] createddateTo <br>
     * @return The value of createddateTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCreateddateTo() {
        return filterStringParameter(_createddateTo);
    }

    /**
     * [set] createddateTo <br>
     * @param createddateTo The value of createddateTo. (NullAllowed)
     */
    public void setCreateddateTo(String createddateTo) {
        _createddateTo = createddateTo;
    }

    /**
     * [get] targetmon:likePrefix <br>
     * @return The value of targetmon. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTargetmon() {
        return filterStringParameter(_targetmon);
    }

    /**
     * [set as prefixSearch] targetmon:likePrefix <br>
     * @param targetmon The value of targetmon. (NullAllowed)
     */
    public void setTargetmon_PrefixSearch(String targetmon) {
        _targetmon = targetmon;
        _targetmonInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for targetmon. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for targetmon. (NullAllowed)
     */
    public LikeSearchOption getTargetmonInternalLikeSearchOption() {
        return _targetmonInternalLikeSearchOption;
    }

    /**
     * [get] reprintedflg <br>
     * @return The value of reprintedflg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReprintedflg() {
        return filterStringParameter(_reprintedflg);
    }

    /**
     * [set] reprintedflg <br>
     * @param reprintedflg The value of reprintedflg. (NullAllowed)
     */
    public void setReprintedflg(String reprintedflg) {
        _reprintedflg = reprintedflg;
    }

    /**
     * [get] itemcd:likePrefix <br>
     * @return The value of itemcd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getItemcd() {
        return filterStringParameter(_itemcd);
    }

    /**
     * [set as prefixSearch] itemcd:likePrefix <br>
     * @param itemcd The value of itemcd. (NullAllowed)
     */
    public void setItemcd_PrefixSearch(String itemcd) {
        _itemcd = itemcd;
        _itemcdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for itemcd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for itemcd. (NullAllowed)
     */
    public LikeSearchOption getItemcdInternalLikeSearchOption() {
        return _itemcdInternalLikeSearchOption;
    }

    /**
     * [get] baditemcd <br>
     * @return The value of baditemcd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getBaditemcd() {
        return _baditemcd;
    }

    /**
     * [set] baditemcd <br>
     * @param baditemcd The value of baditemcd. (NullAllowed)
     */
    public void setBaditemcd(Long baditemcd) {
        _baditemcd = baditemcd;
    }

    /**
     * [get] todayPrintOnlyFlg <br>
     * @return The value of todayPrintOnlyFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTodayPrintOnlyFlg() {
        return filterStringParameter(_todayPrintOnlyFlg);
    }

    /**
     * [set] todayPrintOnlyFlg <br>
     * @param todayPrintOnlyFlg The value of todayPrintOnlyFlg. (NullAllowed)
     */
    public void setTodayPrintOnlyFlg(String todayPrintOnlyFlg) {
        _todayPrintOnlyFlg = todayPrintOnlyFlg;
    }
}
