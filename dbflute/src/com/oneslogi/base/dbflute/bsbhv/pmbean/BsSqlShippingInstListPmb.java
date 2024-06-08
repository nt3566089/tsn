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
 * The base class for typed parameter-bean of SqlShippingInstList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlShippingInstList</span>" on TShippingInstHBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlShippingInstListPmb extends SimplePagingBean implements EntityHandlingPmb<TShippingInstHBhv, SqlShippingInstList>, AutoPagingHandlingPmb<TShippingInstHBhv, SqlShippingInstList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of pickingWorkNo:likeSuffix. */
    protected String _pickingWorkNo;

    /** The option of like-search for pickingWorkNo. */
    protected LikeSearchOption _pickingWorkNoInternalLikeSearchOption;

    /** The parameter of cultureId. */
    protected Long _cultureId;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of supplyCustomerCd:likePrefix. */
    protected String _supplyCustomerCd;

    /** The option of like-search for supplyCustomerCd. */
    protected LikeSearchOption _supplyCustomerCdInternalLikeSearchOption;

    /** The parameter of pickingBatchNo. */
    protected String _pickingBatchNo;

    /** The parameter of shippingStatus. */
    protected String _shippingStatus;

    /** The parameter of clientShippingNo:likePrefix. */
    protected String _clientShippingNo;

    /** The option of like-search for clientShippingNo. */
    protected LikeSearchOption _clientShippingNoInternalLikeSearchOption;

    /** The parameter of shippingSlipNo:likePrefix. */
    protected String _shippingSlipNo;

    /** The option of like-search for shippingSlipNo. */
    protected LikeSearchOption _shippingSlipNoInternalLikeSearchOption;

    /** The parameter of emergencyFlg. */
    protected String _emergencyFlg;

    /** The parameter of deliveryCourseCd:likePrefix. */
    protected String _deliveryCourseCd;

    /** The option of like-search for deliveryCourseCd. */
    protected LikeSearchOption _deliveryCourseCdInternalLikeSearchOption;

    /** The parameter of carrierCd. */
    protected String _carrierCd;

    /** The parameter of noAllcDisplayFlg. */
    protected Integer _noAllcDisplayFlg;

    /** The parameter of shippingDtTo. */
    protected String _shippingDtTo;

    /** The parameter of takingShippingFlg. */
    protected String _takingShippingFlg;

    /** The parameter of workDtTo. */
    protected String _workDtTo;

    /** The parameter of shippingDtFrom. */
    protected String _shippingDtFrom;

    /** The parameter of workDtFrom. */
    protected String _workDtFrom;

    /** The parameter of pickingWorkMessageFlg. */
    protected String _pickingWorkMessageFlg;

    /** The parameter of pickingWorkMessage:likeContain. */
    protected String _pickingWorkMessage;

    /** The option of like-search for pickingWorkMessage. */
    protected LikeSearchOption _pickingWorkMessageInternalLikeSearchOption;

    /** The parameter of cancelDisplay. */
    protected String _cancelDisplay;

    /** The parameter of noStockOutFlg. */
    protected String _noStockOutFlg;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlShippingInstList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlShippingInstList</span>" on TShippingInstHBhv.
     */
    public BsSqlShippingInstListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlShippingInstList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlShippingInstList> getEntityType() { return SqlShippingInstList.class; }

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
        sb.append(dm).append(_pickingWorkNo);
        sb.append(dm).append(_cultureId);
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_supplyCustomerCd);
        sb.append(dm).append(_pickingBatchNo);
        sb.append(dm).append(_shippingStatus);
        sb.append(dm).append(_clientShippingNo);
        sb.append(dm).append(_shippingSlipNo);
        sb.append(dm).append(_emergencyFlg);
        sb.append(dm).append(_deliveryCourseCd);
        sb.append(dm).append(_carrierCd);
        sb.append(dm).append(_noAllcDisplayFlg);
        sb.append(dm).append(_shippingDtTo);
        sb.append(dm).append(_takingShippingFlg);
        sb.append(dm).append(_workDtTo);
        sb.append(dm).append(_shippingDtFrom);
        sb.append(dm).append(_workDtFrom);
        sb.append(dm).append(_pickingWorkMessageFlg);
        sb.append(dm).append(_pickingWorkMessage);
        sb.append(dm).append(_cancelDisplay);
        sb.append(dm).append(_noStockOutFlg);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] pickingBatchNo <br>
     * @return The value of pickingBatchNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickingBatchNo() {
        return filterStringParameter(_pickingBatchNo);
    }

    /**
     * [set] pickingBatchNo <br>
     * @param pickingBatchNo The value of pickingBatchNo. (NullAllowed)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        _pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] shippingStatus <br>
     * @return The value of shippingStatus. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShippingStatus() {
        return filterStringParameter(_shippingStatus);
    }

    /**
     * [set] shippingStatus <br>
     * @param shippingStatus The value of shippingStatus. (NullAllowed)
     */
    public void setShippingStatus(String shippingStatus) {
        _shippingStatus = shippingStatus;
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
     * [get] shippingSlipNo:likePrefix <br>
     * @return The value of shippingSlipNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShippingSlipNo() {
        return filterStringParameter(_shippingSlipNo);
    }

    /**
     * [set as prefixSearch] shippingSlipNo:likePrefix <br>
     * @param shippingSlipNo The value of shippingSlipNo. (NullAllowed)
     */
    public void setShippingSlipNo_PrefixSearch(String shippingSlipNo) {
        _shippingSlipNo = shippingSlipNo;
        _shippingSlipNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for shippingSlipNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for shippingSlipNo. (NullAllowed)
     */
    public LikeSearchOption getShippingSlipNoInternalLikeSearchOption() {
        return _shippingSlipNoInternalLikeSearchOption;
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
     * [get] noAllcDisplayFlg <br>
     * @return The value of noAllcDisplayFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getNoAllcDisplayFlg() {
        return _noAllcDisplayFlg;
    }

    /**
     * [set] noAllcDisplayFlg <br>
     * @param noAllcDisplayFlg The value of noAllcDisplayFlg. (NullAllowed)
     */
    public void setNoAllcDisplayFlg(Integer noAllcDisplayFlg) {
        _noAllcDisplayFlg = noAllcDisplayFlg;
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
     * [get] takingShippingFlg <br>
     * @return The value of takingShippingFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTakingShippingFlg() {
        return filterStringParameter(_takingShippingFlg);
    }

    /**
     * [set] takingShippingFlg <br>
     * @param takingShippingFlg The value of takingShippingFlg. (NullAllowed)
     */
    public void setTakingShippingFlg(String takingShippingFlg) {
        _takingShippingFlg = takingShippingFlg;
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
     * [get] pickingWorkMessageFlg <br>
     * @return The value of pickingWorkMessageFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickingWorkMessageFlg() {
        return filterStringParameter(_pickingWorkMessageFlg);
    }

    /**
     * [set] pickingWorkMessageFlg <br>
     * @param pickingWorkMessageFlg The value of pickingWorkMessageFlg. (NullAllowed)
     */
    public void setPickingWorkMessageFlg(String pickingWorkMessageFlg) {
        _pickingWorkMessageFlg = pickingWorkMessageFlg;
    }

    /**
     * [get] pickingWorkMessage:likeContain <br>
     * @return The value of pickingWorkMessage. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickingWorkMessage() {
        return filterStringParameter(_pickingWorkMessage);
    }

    /**
     * [set as containSearch] pickingWorkMessage:likeContain <br>
     * @param pickingWorkMessage The value of pickingWorkMessage. (NullAllowed)
     */
    public void setPickingWorkMessage_ContainSearch(String pickingWorkMessage) {
        _pickingWorkMessage = pickingWorkMessage;
        _pickingWorkMessageInternalLikeSearchOption = new LikeSearchOption().likeContain();
    }

    /**
     * Get the internal option of likeSearch for pickingWorkMessage. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for pickingWorkMessage. (NullAllowed)
     */
    public LikeSearchOption getPickingWorkMessageInternalLikeSearchOption() {
        return _pickingWorkMessageInternalLikeSearchOption;
    }

    /**
     * [get] cancelDisplay <br>
     * @return The value of cancelDisplay. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCancelDisplay() {
        return filterStringParameter(_cancelDisplay);
    }

    /**
     * [set] cancelDisplay <br>
     * @param cancelDisplay The value of cancelDisplay. (NullAllowed)
     */
    public void setCancelDisplay(String cancelDisplay) {
        _cancelDisplay = cancelDisplay;
    }

    /**
     * [get] noStockOutFlg <br>
     * @return The value of noStockOutFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getNoStockOutFlg() {
        return filterStringParameter(_noStockOutFlg);
    }

    /**
     * [set] noStockOutFlg <br>
     * @param noStockOutFlg The value of noStockOutFlg. (NullAllowed)
     */
    public void setNoStockOutFlg(String noStockOutFlg) {
        _noStockOutFlg = noStockOutFlg;
    }
}
