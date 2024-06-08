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
 * The base class for typed parameter-bean of SqlAllocateControlMasterList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlAllocateControlMasterList</span>" on MMfpickctlBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlAllocateControlMasterListPmb extends SimplePagingBean implements EntityHandlingPmb<MMfpickctlBhv, SqlAllocateControlMasterList>, AutoPagingHandlingPmb<MMfpickctlBhv, SqlAllocateControlMasterList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of productCd:likePrefix. */
    protected String _productCd;

    /** The option of like-search for productCd. */
    protected LikeSearchOption _productCdInternalLikeSearchOption;

    /** The parameter of pickfrdateFrom. */
    protected String _pickfrdateFrom;

    /** The parameter of pickfrdateTo. */
    protected String _pickfrdateTo;

    /** The parameter of picktodateFrom. */
    protected String _picktodateFrom;

    /** The parameter of picktodateTo. */
    protected String _picktodateTo;

    /** The parameter of designflg. */
    protected String _designflg;

    /** The parameter of validtype. */
    protected String _validtype;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlAllocateControlMasterList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlAllocateControlMasterList</span>" on MMfpickctlBhv.
     */
    public BsSqlAllocateControlMasterListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlAllocateControlMasterList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlAllocateControlMasterList> getEntityType() { return SqlAllocateControlMasterList.class; }

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
        sb.append(dm).append(_productCd);
        sb.append(dm).append(_pickfrdateFrom);
        sb.append(dm).append(_pickfrdateTo);
        sb.append(dm).append(_picktodateFrom);
        sb.append(dm).append(_picktodateTo);
        sb.append(dm).append(_designflg);
        sb.append(dm).append(_validtype);
        sb.append(dm).append(_clientId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] productCd:likePrefix <br>
     * @return The value of productCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getProductCd() {
        return filterStringParameter(_productCd);
    }

    /**
     * [set as prefixSearch] productCd:likePrefix <br>
     * @param productCd The value of productCd. (NullAllowed)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        _productCd = productCd;
        _productCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for productCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for productCd. (NullAllowed)
     */
    public LikeSearchOption getProductCdInternalLikeSearchOption() {
        return _productCdInternalLikeSearchOption;
    }

    /**
     * [get] pickfrdateFrom <br>
     * @return The value of pickfrdateFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickfrdateFrom() {
        return filterStringParameter(_pickfrdateFrom);
    }

    /**
     * [set] pickfrdateFrom <br>
     * @param pickfrdateFrom The value of pickfrdateFrom. (NullAllowed)
     */
    public void setPickfrdateFrom(String pickfrdateFrom) {
        _pickfrdateFrom = pickfrdateFrom;
    }

    /**
     * [get] pickfrdateTo <br>
     * @return The value of pickfrdateTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickfrdateTo() {
        return filterStringParameter(_pickfrdateTo);
    }

    /**
     * [set] pickfrdateTo <br>
     * @param pickfrdateTo The value of pickfrdateTo. (NullAllowed)
     */
    public void setPickfrdateTo(String pickfrdateTo) {
        _pickfrdateTo = pickfrdateTo;
    }

    /**
     * [get] picktodateFrom <br>
     * @return The value of picktodateFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPicktodateFrom() {
        return filterStringParameter(_picktodateFrom);
    }

    /**
     * [set] picktodateFrom <br>
     * @param picktodateFrom The value of picktodateFrom. (NullAllowed)
     */
    public void setPicktodateFrom(String picktodateFrom) {
        _picktodateFrom = picktodateFrom;
    }

    /**
     * [get] picktodateTo <br>
     * @return The value of picktodateTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPicktodateTo() {
        return filterStringParameter(_picktodateTo);
    }

    /**
     * [set] picktodateTo <br>
     * @param picktodateTo The value of picktodateTo. (NullAllowed)
     */
    public void setPicktodateTo(String picktodateTo) {
        _picktodateTo = picktodateTo;
    }

    /**
     * [get] designflg <br>
     * @return The value of designflg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDesignflg() {
        return filterStringParameter(_designflg);
    }

    /**
     * [set] designflg <br>
     * @param designflg The value of designflg. (NullAllowed)
     */
    public void setDesignflg(String designflg) {
        _designflg = designflg;
    }

    /**
     * [get] validtype <br>
     * @return The value of validtype. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getValidtype() {
        return filterStringParameter(_validtype);
    }

    /**
     * [set] validtype <br>
     * @param validtype The value of validtype. (NullAllowed)
     */
    public void setValidtype(String validtype) {
        _validtype = validtype;
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
