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
 * The base class for typed parameter-bean of SqlShippingTagDataOutput. <br>
 * This is related to "<span style="color: #AD4747">selectSqlShippingTagDataOutput</span>" on TPickingHBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlShippingTagDataOutputPmb extends SimplePagingBean implements EntityHandlingPmb<TPickingHBhv, SqlShippingTagDataOutput>, AutoPagingHandlingPmb<TPickingHBhv, SqlShippingTagDataOutput>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerClassCondition. */
    protected Long _centerClassCondition;

    /** The parameter of cultureId. */
    protected Long _cultureId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of carrierCd. */
    protected String _carrierCd;

    /** The parameter of customerCd:likePrefix. */
    protected String _customerCd;

    /** The option of like-search for customerCd. */
    protected LikeSearchOption _customerCdInternalLikeSearchOption;

    /** The parameter of pickingWorkNo:likeSuffix. */
    protected String _pickingWorkNo;

    /** The option of like-search for pickingWorkNo. */
    protected LikeSearchOption _pickingWorkNoInternalLikeSearchOption;

    /** The parameter of clientShippingNo:likePrefix. */
    protected String _clientShippingNo;

    /** The option of like-search for clientShippingNo. */
    protected LikeSearchOption _clientShippingNoInternalLikeSearchOption;

    /** The parameter of shippingDtFrom. */
    protected String _shippingDtFrom;

    /** The parameter of shippingDtTo. */
    protected String _shippingDtTo;

    /** The parameter of workDtFrom. */
    protected String _workDtFrom;

    /** The parameter of workDtTo. */
    protected String _workDtTo;

    /** The parameter of deliveryCourseCd:likePrefix. */
    protected String _deliveryCourseCd;

    /** The option of like-search for deliveryCourseCd. */
    protected LikeSearchOption _deliveryCourseCdInternalLikeSearchOption;

    /** The parameter of invoiceCreateFlg. */
    protected String _invoiceCreateFlg;

    /** The parameter of emergencyFlg. */
    protected String _emergencyFlg;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlShippingTagDataOutput. <br>
     * This is related to "<span style="color: #AD4747">selectSqlShippingTagDataOutput</span>" on TPickingHBhv.
     */
    public BsSqlShippingTagDataOutputPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlShippingTagDataOutput"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlShippingTagDataOutput> getEntityType() { return SqlShippingTagDataOutput.class; }

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
        sb.append(dm).append(_centerClassCondition);
        sb.append(dm).append(_cultureId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_carrierCd);
        sb.append(dm).append(_customerCd);
        sb.append(dm).append(_pickingWorkNo);
        sb.append(dm).append(_clientShippingNo);
        sb.append(dm).append(_shippingDtFrom);
        sb.append(dm).append(_shippingDtTo);
        sb.append(dm).append(_workDtFrom);
        sb.append(dm).append(_workDtTo);
        sb.append(dm).append(_deliveryCourseCd);
        sb.append(dm).append(_invoiceCreateFlg);
        sb.append(dm).append(_emergencyFlg);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] centerClassCondition <br>
     * @return The value of centerClassCondition. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getCenterClassCondition() {
        return _centerClassCondition;
    }

    /**
     * [set] centerClassCondition <br>
     * @param centerClassCondition The value of centerClassCondition. (NullAllowed)
     */
    public void setCenterClassCondition(Long centerClassCondition) {
        _centerClassCondition = centerClassCondition;
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
     * [get] customerCd:likePrefix <br>
     * @return The value of customerCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCustomerCd() {
        return filterStringParameter(_customerCd);
    }

    /**
     * [set as prefixSearch] customerCd:likePrefix <br>
     * @param customerCd The value of customerCd. (NullAllowed)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        _customerCd = customerCd;
        _customerCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for customerCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for customerCd. (NullAllowed)
     */
    public LikeSearchOption getCustomerCdInternalLikeSearchOption() {
        return _customerCdInternalLikeSearchOption;
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
     * [get] clientShippingNo:likePrefix <br>
     * @return The value of clientShippingNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getClientShippingNo() {
        return filterStringParameter(_clientShippingNo);
    }

    /**
     * [set as prefixSearch] clientShippingNo:likePrefix <br>
     * @param clientShippingNo The value of clientShippingNo. (NullAllowed)
     */
    public void setClientShippingNo_PrefixSearch(String clientShippingNo) {
        _clientShippingNo = clientShippingNo;
        _clientShippingNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for clientShippingNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for clientShippingNo. (NullAllowed)
     */
    public LikeSearchOption getClientShippingNoInternalLikeSearchOption() {
        return _clientShippingNoInternalLikeSearchOption;
    }

    /**
     * [get] shippingDtFrom <br>
     * @return The value of shippingDtFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShippingDtFrom() {
        return filterStringParameter(_shippingDtFrom);
    }

    /**
     * [set] shippingDtFrom <br>
     * @param shippingDtFrom The value of shippingDtFrom. (NullAllowed)
     */
    public void setShippingDtFrom(String shippingDtFrom) {
        _shippingDtFrom = shippingDtFrom;
    }

    /**
     * [get] shippingDtTo <br>
     * @return The value of shippingDtTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShippingDtTo() {
        return filterStringParameter(_shippingDtTo);
    }

    /**
     * [set] shippingDtTo <br>
     * @param shippingDtTo The value of shippingDtTo. (NullAllowed)
     */
    public void setShippingDtTo(String shippingDtTo) {
        _shippingDtTo = shippingDtTo;
    }

    /**
     * [get] workDtFrom <br>
     * @return The value of workDtFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getWorkDtFrom() {
        return filterStringParameter(_workDtFrom);
    }

    /**
     * [set] workDtFrom <br>
     * @param workDtFrom The value of workDtFrom. (NullAllowed)
     */
    public void setWorkDtFrom(String workDtFrom) {
        _workDtFrom = workDtFrom;
    }

    /**
     * [get] workDtTo <br>
     * @return The value of workDtTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getWorkDtTo() {
        return filterStringParameter(_workDtTo);
    }

    /**
     * [set] workDtTo <br>
     * @param workDtTo The value of workDtTo. (NullAllowed)
     */
    public void setWorkDtTo(String workDtTo) {
        _workDtTo = workDtTo;
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
     * [get] invoiceCreateFlg <br>
     * @return The value of invoiceCreateFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInvoiceCreateFlg() {
        return filterStringParameter(_invoiceCreateFlg);
    }

    /**
     * [set] invoiceCreateFlg <br>
     * @param invoiceCreateFlg The value of invoiceCreateFlg. (NullAllowed)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        _invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] emergencyFlg <br>
     * @return The value of emergencyFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getEmergencyFlg() {
        return filterStringParameter(_emergencyFlg);
    }

    /**
     * [set] emergencyFlg <br>
     * @param emergencyFlg The value of emergencyFlg. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        _emergencyFlg = emergencyFlg;
    }
}
