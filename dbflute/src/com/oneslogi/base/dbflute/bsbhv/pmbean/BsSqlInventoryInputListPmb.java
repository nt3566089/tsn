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
 * The base class for typed parameter-bean of SqlInventoryInputList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlInventoryInputList</span>" on TInventoryHBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlInventoryInputListPmb extends SimplePagingBean implements EntityHandlingPmb<TInventoryHBhv, SqlInventoryInputList>, AutoPagingHandlingPmb<TInventoryHBhv, SqlInventoryInputList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of inventoryInstKbn. */
    protected String _inventoryInstKbn;

    /** The parameter of inventoryInstAddDt. */
    protected String _inventoryInstAddDt;

    /** The parameter of locationGrp. */
    protected String _locationGrp;

    /** The parameter of productCd:likePrefix. */
    protected String _productCd;

    /** The option of like-search for productCd. */
    protected LikeSearchOption _productCdInternalLikeSearchOption;

    /** The parameter of capProduct. */
    protected Long _capProduct;

    /** The parameter of cggdid. */
    protected String _cggdid;

    /** The parameter of inventoryInstKey. */
    protected Long _inventoryInstKey;

    /** The parameter of stockTakingInput. */
    protected String _stockTakingInput;

    /** The parameter of unmatch. */
    protected String _unmatch;

    /** The parameter of fromLocationCd. */
    protected String _fromLocationCd;

    /** The parameter of toLocationCd. */
    protected String _toLocationCd;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlInventoryInputList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlInventoryInputList</span>" on TInventoryHBhv.
     */
    public BsSqlInventoryInputListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlInventoryInputList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlInventoryInputList> getEntityType() { return SqlInventoryInputList.class; }

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
        sb.append(dm).append(_inventoryInstKbn);
        sb.append(dm).append(_inventoryInstAddDt);
        sb.append(dm).append(_locationGrp);
        sb.append(dm).append(_productCd);
        sb.append(dm).append(_capProduct);
        sb.append(dm).append(_cggdid);
        sb.append(dm).append(_inventoryInstKey);
        sb.append(dm).append(_stockTakingInput);
        sb.append(dm).append(_unmatch);
        sb.append(dm).append(_fromLocationCd);
        sb.append(dm).append(_toLocationCd);
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
     * [get] inventoryInstKbn <br>
     * @return The value of inventoryInstKbn. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInventoryInstKbn() {
        return filterStringParameter(_inventoryInstKbn);
    }

    /**
     * [set] inventoryInstKbn <br>
     * @param inventoryInstKbn The value of inventoryInstKbn. (NullAllowed)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        _inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] inventoryInstAddDt <br>
     * @return The value of inventoryInstAddDt. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInventoryInstAddDt() {
        return filterStringParameter(_inventoryInstAddDt);
    }

    /**
     * [set] inventoryInstAddDt <br>
     * @param inventoryInstAddDt The value of inventoryInstAddDt. (NullAllowed)
     */
    public void setInventoryInstAddDt(String inventoryInstAddDt) {
        _inventoryInstAddDt = inventoryInstAddDt;
    }

    /**
     * [get] locationGrp <br>
     * @return The value of locationGrp. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLocationGrp() {
        return filterStringParameter(_locationGrp);
    }

    /**
     * [set] locationGrp <br>
     * @param locationGrp The value of locationGrp. (NullAllowed)
     */
    public void setLocationGrp(String locationGrp) {
        _locationGrp = locationGrp;
    }

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
     * [get] capProduct <br>
     * @return The value of capProduct. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getCapProduct() {
        return _capProduct;
    }

    /**
     * [set] capProduct <br>
     * @param capProduct The value of capProduct. (NullAllowed)
     */
    public void setCapProduct(Long capProduct) {
        _capProduct = capProduct;
    }

    /**
     * [get] cggdid <br>
     * @return The value of cggdid. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCggdid() {
        return filterStringParameter(_cggdid);
    }

    /**
     * [set] cggdid <br>
     * @param cggdid The value of cggdid. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        _cggdid = cggdid;
    }

    /**
     * [get] inventoryInstKey <br>
     * @return The value of inventoryInstKey. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getInventoryInstKey() {
        return _inventoryInstKey;
    }

    /**
     * [set] inventoryInstKey <br>
     * @param inventoryInstKey The value of inventoryInstKey. (NullAllowed)
     */
    public void setInventoryInstKey(Long inventoryInstKey) {
        _inventoryInstKey = inventoryInstKey;
    }

    /**
     * [get] stockTakingInput <br>
     * @return The value of stockTakingInput. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getStockTakingInput() {
        return filterStringParameter(_stockTakingInput);
    }

    /**
     * [set] stockTakingInput <br>
     * @param stockTakingInput The value of stockTakingInput. (NullAllowed)
     */
    public void setStockTakingInput(String stockTakingInput) {
        _stockTakingInput = stockTakingInput;
    }

    /**
     * [get] unmatch <br>
     * @return The value of unmatch. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getUnmatch() {
        return filterStringParameter(_unmatch);
    }

    /**
     * [set] unmatch <br>
     * @param unmatch The value of unmatch. (NullAllowed)
     */
    public void setUnmatch(String unmatch) {
        _unmatch = unmatch;
    }

    /**
     * [get] fromLocationCd <br>
     * @return The value of fromLocationCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getFromLocationCd() {
        return filterStringParameter(_fromLocationCd);
    }

    /**
     * [set] fromLocationCd <br>
     * @param fromLocationCd The value of fromLocationCd. (NullAllowed)
     */
    public void setFromLocationCd(String fromLocationCd) {
        _fromLocationCd = fromLocationCd;
    }

    /**
     * [get] toLocationCd <br>
     * @return The value of toLocationCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getToLocationCd() {
        return filterStringParameter(_toLocationCd);
    }

    /**
     * [set] toLocationCd <br>
     * @param toLocationCd The value of toLocationCd. (NullAllowed)
     */
    public void setToLocationCd(String toLocationCd) {
        _toLocationCd = toLocationCd;
    }
}
