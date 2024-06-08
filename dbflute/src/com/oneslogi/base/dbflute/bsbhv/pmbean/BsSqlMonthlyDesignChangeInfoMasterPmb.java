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
 * The base class for typed parameter-bean of SqlMonthlyDesignChangeInfoMaster. <br>
 * This is related to "<span style="color: #AD4747">selectSqlMonthlyDesignChangeInfoMaster</span>" on MMfmonthchgBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlMonthlyDesignChangeInfoMasterPmb extends SimplePagingBean implements EntityHandlingPmb<MMfmonthchgBhv, SqlMonthlyDesignChangeInfoMaster>, AutoPagingHandlingPmb<MMfmonthchgBhv, SqlMonthlyDesignChangeInfoMaster>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of productCd:likePrefix. */
    protected String _productCd;

    /** The option of like-search for productCd. */
    protected LikeSearchOption _productCdInternalLikeSearchOption;

    /** The parameter of sotedunit. */
    protected String _sotedunit;

    /** The parameter of delFlg. */
    protected String _delFlg;

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
     * Constructor for the typed parameter-bean of SqlMonthlyDesignChangeInfoMaster. <br>
     * This is related to "<span style="color: #AD4747">selectSqlMonthlyDesignChangeInfoMaster</span>" on MMfmonthchgBhv.
     */
    public BsSqlMonthlyDesignChangeInfoMasterPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlMonthlyDesignChangeInfoMaster"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlMonthlyDesignChangeInfoMaster> getEntityType() { return SqlMonthlyDesignChangeInfoMaster.class; }

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
        sb.append(dm).append(_sotedunit);
        sb.append(dm).append(_delFlg);
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
     * [get] sotedunit <br>
     * @return The value of sotedunit. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSotedunit() {
        return filterStringParameter(_sotedunit);
    }

    /**
     * [set] sotedunit <br>
     * @param sotedunit The value of sotedunit. (NullAllowed)
     */
    public void setSotedunit(String sotedunit) {
        _sotedunit = sotedunit;
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
