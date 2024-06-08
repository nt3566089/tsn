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
 * The base class for typed parameter-bean of SqlBillOfLadingPrintSelect. <br>
 * This is related to "<span style="color: #AD4747">selectSqlBillOfLadingPrintSelect</span>" on TPickingHBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlBillOfLadingPrintSelectPmb extends SimplePagingBean implements EntityHandlingPmb<TPickingHBhv, SqlBillOfLadingPrintSelect>, AutoPagingHandlingPmb<TPickingHBhv, SqlBillOfLadingPrintSelect>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of dtFrom. */
    protected String _dtFrom;

    /** The parameter of dtTo. */
    protected String _dtTo;

    /** The parameter of supplyCustomerCd:likePrefix. */
    protected String _supplyCustomerCd;

    /** The option of like-search for supplyCustomerCd. */
    protected LikeSearchOption _supplyCustomerCdInternalLikeSearchOption;

    /** The parameter of pickingWorkNo:likeSuffix. */
    protected String _pickingWorkNo;

    /** The option of like-search for pickingWorkNo. */
    protected LikeSearchOption _pickingWorkNoInternalLikeSearchOption;

    /** The parameter of bolNo:likePrefix. */
    protected String _bolNo;

    /** The option of like-search for bolNo. */
    protected LikeSearchOption _bolNoInternalLikeSearchOption;

    /** The parameter of bolOutputTargetFlg. */
    protected String _bolOutputTargetFlg;

    /** The parameter of carrierCd. */
    protected String _carrierCd;

    /** The parameter of deliveryCourseCd:likePrefix. */
    protected String _deliveryCourseCd;

    /** The option of like-search for deliveryCourseCd. */
    protected LikeSearchOption _deliveryCourseCdInternalLikeSearchOption;

    /** The parameter of bolOutFlg. */
    protected String _bolOutFlg;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlBillOfLadingPrintSelect. <br>
     * This is related to "<span style="color: #AD4747">selectSqlBillOfLadingPrintSelect</span>" on TPickingHBhv.
     */
    public BsSqlBillOfLadingPrintSelectPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlBillOfLadingPrintSelect"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlBillOfLadingPrintSelect> getEntityType() { return SqlBillOfLadingPrintSelect.class; }

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
        sb.append(dm).append(_dtFrom);
        sb.append(dm).append(_dtTo);
        sb.append(dm).append(_supplyCustomerCd);
        sb.append(dm).append(_pickingWorkNo);
        sb.append(dm).append(_bolNo);
        sb.append(dm).append(_bolOutputTargetFlg);
        sb.append(dm).append(_carrierCd);
        sb.append(dm).append(_deliveryCourseCd);
        sb.append(dm).append(_bolOutFlg);
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
     * [get] dtFrom <br>
     * @return The value of dtFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDtFrom() {
        return filterStringParameter(_dtFrom);
    }

    /**
     * [set] dtFrom <br>
     * @param dtFrom The value of dtFrom. (NullAllowed)
     */
    public void setDtFrom(String dtFrom) {
        _dtFrom = dtFrom;
    }

    /**
     * [get] dtTo <br>
     * @return The value of dtTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDtTo() {
        return filterStringParameter(_dtTo);
    }

    /**
     * [set] dtTo <br>
     * @param dtTo The value of dtTo. (NullAllowed)
     */
    public void setDtTo(String dtTo) {
        _dtTo = dtTo;
    }

    /**
     * [get] supplyCustomerCd:likePrefix <br>
     * @return The value of supplyCustomerCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSupplyCustomerCd() {
        return filterStringParameter(_supplyCustomerCd);
    }

    /**
     * [set as prefixSearch] supplyCustomerCd:likePrefix <br>
     * @param supplyCustomerCd The value of supplyCustomerCd. (NullAllowed)
     */
    public void setSupplyCustomerCd_PrefixSearch(String supplyCustomerCd) {
        _supplyCustomerCd = supplyCustomerCd;
        _supplyCustomerCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for supplyCustomerCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for supplyCustomerCd. (NullAllowed)
     */
    public LikeSearchOption getSupplyCustomerCdInternalLikeSearchOption() {
        return _supplyCustomerCdInternalLikeSearchOption;
    }

    /**
     * [get] pickingWorkNo:likeSuffix <br>
     * @return The value of pickingWorkNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickingWorkNo() {
        return filterStringParameter(_pickingWorkNo);
    }

    /**
     * [set as suffixSearch] pickingWorkNo:likeSuffix <br>
     * @param pickingWorkNo The value of pickingWorkNo. (NullAllowed)
     */
    public void setPickingWorkNo_SuffixSearch(String pickingWorkNo) {
        _pickingWorkNo = pickingWorkNo;
        _pickingWorkNoInternalLikeSearchOption = new LikeSearchOption().likeSuffix();
    }

    /**
     * Get the internal option of likeSearch for pickingWorkNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for pickingWorkNo. (NullAllowed)
     */
    public LikeSearchOption getPickingWorkNoInternalLikeSearchOption() {
        return _pickingWorkNoInternalLikeSearchOption;
    }

    /**
     * [get] bolNo:likePrefix <br>
     * @return The value of bolNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBolNo() {
        return filterStringParameter(_bolNo);
    }

    /**
     * [set as prefixSearch] bolNo:likePrefix <br>
     * @param bolNo The value of bolNo. (NullAllowed)
     */
    public void setBolNo_PrefixSearch(String bolNo) {
        _bolNo = bolNo;
        _bolNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for bolNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for bolNo. (NullAllowed)
     */
    public LikeSearchOption getBolNoInternalLikeSearchOption() {
        return _bolNoInternalLikeSearchOption;
    }

    /**
     * [get] bolOutputTargetFlg <br>
     * @return The value of bolOutputTargetFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBolOutputTargetFlg() {
        return filterStringParameter(_bolOutputTargetFlg);
    }

    /**
     * [set] bolOutputTargetFlg <br>
     * @param bolOutputTargetFlg The value of bolOutputTargetFlg. (NullAllowed)
     */
    public void setBolOutputTargetFlg(String bolOutputTargetFlg) {
        _bolOutputTargetFlg = bolOutputTargetFlg;
    }

    /**
     * [get] carrierCd <br>
     * @return The value of carrierCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCarrierCd() {
        return filterStringParameter(_carrierCd);
    }

    /**
     * [set] carrierCd <br>
     * @param carrierCd The value of carrierCd. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        _carrierCd = carrierCd;
    }

    /**
     * [get] deliveryCourseCd:likePrefix <br>
     * @return The value of deliveryCourseCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDeliveryCourseCd() {
        return filterStringParameter(_deliveryCourseCd);
    }

    /**
     * [set as prefixSearch] deliveryCourseCd:likePrefix <br>
     * @param deliveryCourseCd The value of deliveryCourseCd. (NullAllowed)
     */
    public void setDeliveryCourseCd_PrefixSearch(String deliveryCourseCd) {
        _deliveryCourseCd = deliveryCourseCd;
        _deliveryCourseCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for deliveryCourseCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for deliveryCourseCd. (NullAllowed)
     */
    public LikeSearchOption getDeliveryCourseCdInternalLikeSearchOption() {
        return _deliveryCourseCdInternalLikeSearchOption;
    }

    /**
     * [get] bolOutFlg <br>
     * @return The value of bolOutFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBolOutFlg() {
        return filterStringParameter(_bolOutFlg);
    }

    /**
     * [set] bolOutFlg <br>
     * @param bolOutFlg The value of bolOutFlg. (NullAllowed)
     */
    public void setBolOutFlg(String bolOutFlg) {
        _bolOutFlg = bolOutFlg;
    }
}
