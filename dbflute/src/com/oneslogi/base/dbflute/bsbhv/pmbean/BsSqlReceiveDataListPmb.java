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
 * The base class for typed parameter-bean of SqlReceiveDataList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlReceiveDataList</span>" on TReceivePlanBBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlReceiveDataListPmb extends SimplePagingBean implements EntityHandlingPmb<TReceivePlanBBhv, SqlReceiveDataList>, AutoPagingHandlingPmb<TReceivePlanBBhv, SqlReceiveDataList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of receiveStatus. */
    protected String _receiveStatus;

    /** The parameter of receivePlanDtFrom. */
    protected String _receivePlanDtFrom;

    /** The parameter of receivePlanDtTo. */
    protected String _receivePlanDtTo;

    /** The parameter of supplierCd:likePrefix. */
    protected String _supplierCd;

    /** The option of like-search for supplierCd. */
    protected LikeSearchOption _supplierCdInternalLikeSearchOption;

    /** The parameter of receiveSlipNo:likePrefix. */
    protected String _receiveSlipNo;

    /** The option of like-search for receiveSlipNo. */
    protected LikeSearchOption _receiveSlipNoInternalLikeSearchOption;

    /** The parameter of planClientReceiveNo:likePrefix. */
    protected String _planClientReceiveNo;

    /** The option of like-search for planClientReceiveNo. */
    protected LikeSearchOption _planClientReceiveNoInternalLikeSearchOption;

    /** The parameter of planClientOrderNo:likePrefix. */
    protected String _planClientOrderNo;

    /** The option of like-search for planClientOrderNo. */
    protected LikeSearchOption _planClientOrderNoInternalLikeSearchOption;

    /** The parameter of productCd:likePrefix. */
    protected String _productCd;

    /** The option of like-search for productCd. */
    protected LikeSearchOption _productCdInternalLikeSearchOption;

    /** The parameter of cultureId. */
    protected Long _cultureId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlReceiveDataList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlReceiveDataList</span>" on TReceivePlanBBhv.
     */
    public BsSqlReceiveDataListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlReceiveDataList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlReceiveDataList> getEntityType() { return SqlReceiveDataList.class; }

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
        sb.append(dm).append(_receiveStatus);
        sb.append(dm).append(_receivePlanDtFrom);
        sb.append(dm).append(_receivePlanDtTo);
        sb.append(dm).append(_supplierCd);
        sb.append(dm).append(_receiveSlipNo);
        sb.append(dm).append(_planClientReceiveNo);
        sb.append(dm).append(_planClientOrderNo);
        sb.append(dm).append(_productCd);
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
     * [get] receiveStatus <br>
     * @return The value of receiveStatus. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceiveStatus() {
        return filterStringParameter(_receiveStatus);
    }

    /**
     * [set] receiveStatus <br>
     * @param receiveStatus The value of receiveStatus. (NullAllowed)
     */
    public void setReceiveStatus(String receiveStatus) {
        _receiveStatus = receiveStatus;
    }

    /**
     * [get] receivePlanDtFrom <br>
     * @return The value of receivePlanDtFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceivePlanDtFrom() {
        return filterStringParameter(_receivePlanDtFrom);
    }

    /**
     * [set] receivePlanDtFrom <br>
     * @param receivePlanDtFrom The value of receivePlanDtFrom. (NullAllowed)
     */
    public void setReceivePlanDtFrom(String receivePlanDtFrom) {
        _receivePlanDtFrom = receivePlanDtFrom;
    }

    /**
     * [get] receivePlanDtTo <br>
     * @return The value of receivePlanDtTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceivePlanDtTo() {
        return filterStringParameter(_receivePlanDtTo);
    }

    /**
     * [set] receivePlanDtTo <br>
     * @param receivePlanDtTo The value of receivePlanDtTo. (NullAllowed)
     */
    public void setReceivePlanDtTo(String receivePlanDtTo) {
        _receivePlanDtTo = receivePlanDtTo;
    }

    /**
     * [get] supplierCd:likePrefix <br>
     * @return The value of supplierCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSupplierCd() {
        return filterStringParameter(_supplierCd);
    }

    /**
     * [set as prefixSearch] supplierCd:likePrefix <br>
     * @param supplierCd The value of supplierCd. (NullAllowed)
     */
    public void setSupplierCd_PrefixSearch(String supplierCd) {
        _supplierCd = supplierCd;
        _supplierCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for supplierCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for supplierCd. (NullAllowed)
     */
    public LikeSearchOption getSupplierCdInternalLikeSearchOption() {
        return _supplierCdInternalLikeSearchOption;
    }

    /**
     * [get] receiveSlipNo:likePrefix <br>
     * @return The value of receiveSlipNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceiveSlipNo() {
        return filterStringParameter(_receiveSlipNo);
    }

    /**
     * [set as prefixSearch] receiveSlipNo:likePrefix <br>
     * @param receiveSlipNo The value of receiveSlipNo. (NullAllowed)
     */
    public void setReceiveSlipNo_PrefixSearch(String receiveSlipNo) {
        _receiveSlipNo = receiveSlipNo;
        _receiveSlipNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for receiveSlipNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for receiveSlipNo. (NullAllowed)
     */
    public LikeSearchOption getReceiveSlipNoInternalLikeSearchOption() {
        return _receiveSlipNoInternalLikeSearchOption;
    }

    /**
     * [get] planClientReceiveNo:likePrefix <br>
     * @return The value of planClientReceiveNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPlanClientReceiveNo() {
        return filterStringParameter(_planClientReceiveNo);
    }

    /**
     * [set as prefixSearch] planClientReceiveNo:likePrefix <br>
     * @param planClientReceiveNo The value of planClientReceiveNo. (NullAllowed)
     */
    public void setPlanClientReceiveNo_PrefixSearch(String planClientReceiveNo) {
        _planClientReceiveNo = planClientReceiveNo;
        _planClientReceiveNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for planClientReceiveNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for planClientReceiveNo. (NullAllowed)
     */
    public LikeSearchOption getPlanClientReceiveNoInternalLikeSearchOption() {
        return _planClientReceiveNoInternalLikeSearchOption;
    }

    /**
     * [get] planClientOrderNo:likePrefix <br>
     * @return The value of planClientOrderNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPlanClientOrderNo() {
        return filterStringParameter(_planClientOrderNo);
    }

    /**
     * [set as prefixSearch] planClientOrderNo:likePrefix <br>
     * @param planClientOrderNo The value of planClientOrderNo. (NullAllowed)
     */
    public void setPlanClientOrderNo_PrefixSearch(String planClientOrderNo) {
        _planClientOrderNo = planClientOrderNo;
        _planClientOrderNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for planClientOrderNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for planClientOrderNo. (NullAllowed)
     */
    public LikeSearchOption getPlanClientOrderNoInternalLikeSearchOption() {
        return _planClientOrderNoInternalLikeSearchOption;
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
