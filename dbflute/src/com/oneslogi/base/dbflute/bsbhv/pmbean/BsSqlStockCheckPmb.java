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
 * The base class for typed parameter-bean of SqlStockCheck. <br>
 * This is related to "<span style="color: #AD4747">selectSqlStockCheck</span>" on TTrhanbaiinvBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlStockCheckPmb extends SimplePagingBean implements EntityHandlingPmb<TTrhanbaiinvBhv, SqlStockCheck>, AutoPagingHandlingPmb<TTrhanbaiinvBhv, SqlStockCheck>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of productCd:likePrefix. */
    protected String _productCd;

    /** The option of like-search for productCd. */
    protected LikeSearchOption _productCdInternalLikeSearchOption;

    /** The parameter of goodItemKbn. */
    protected String _goodItemKbn;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of inventoryKey. */
    protected Long _inventoryKey;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlStockCheck. <br>
     * This is related to "<span style="color: #AD4747">selectSqlStockCheck</span>" on TTrhanbaiinvBhv.
     */
    public BsSqlStockCheckPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlStockCheck"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlStockCheck> getEntityType() { return SqlStockCheck.class; }

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
        sb.append(dm).append(_goodItemKbn);
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_inventoryKey);
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
     * [get] goodItemKbn <br>
     * @return The value of goodItemKbn. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getGoodItemKbn() {
        return filterStringParameter(_goodItemKbn);
    }

    /**
     * [set] goodItemKbn <br>
     * @param goodItemKbn The value of goodItemKbn. (NullAllowed)
     */
    public void setGoodItemKbn(String goodItemKbn) {
        _goodItemKbn = goodItemKbn;
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

    /**
     * [get] inventoryKey <br>
     * @return The value of inventoryKey. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getInventoryKey() {
        return _inventoryKey;
    }

    /**
     * [set] inventoryKey <br>
     * @param inventoryKey The value of inventoryKey. (NullAllowed)
     */
    public void setInventoryKey(Long inventoryKey) {
        _inventoryKey = inventoryKey;
    }
}
