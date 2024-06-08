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
 * The base class for typed parameter-bean of SqlCasePickingNoList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlCasePickingNoList</span>" on TPackingBBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlCasePickingNoListPmb extends SimplePagingBean implements EntityHandlingPmb<TPackingBBhv, SqlCasePickingNoList>, AutoPagingHandlingPmb<TPackingBBhv, SqlCasePickingNoList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of casePickingNo. */
    protected String _casePickingNo;

    /** The parameter of emergencyFlg. */
    protected String _emergencyFlg;

    /** The parameter of stockOutFlg. */
    protected String _stockOutFlg;

    /** The parameter of pickingBatchNo. */
    protected String _pickingBatchNo;

    /** The parameter of pickingWorkNo:likeSuffix. */
    protected String _pickingWorkNo;

    /** The option of like-search for pickingWorkNo. */
    protected LikeSearchOption _pickingWorkNoInternalLikeSearchOption;

    /** The parameter of workDtFrom. */
    protected String _workDtFrom;

    /** The parameter of workDtTo. */
    protected String _workDtTo;

    /** The parameter of shippingDtFrom. */
    protected String _shippingDtFrom;

    /** The parameter of shippingDtTo. */
    protected String _shippingDtTo;

    /** The parameter of supplyCustomerCd:likePrefix. */
    protected String _supplyCustomerCd;

    /** The option of like-search for supplyCustomerCd. */
    protected LikeSearchOption _supplyCustomerCdInternalLikeSearchOption;

    /** The parameter of deliveryCourseCd:likePrefix. */
    protected String _deliveryCourseCd;

    /** The option of like-search for deliveryCourseCd. */
    protected LikeSearchOption _deliveryCourseCdInternalLikeSearchOption;

    /** The parameter of cultureId. */
    protected Long _cultureId;

    /** The parameter of updUserCd. */
    protected String _updUserCd;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlCasePickingNoList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlCasePickingNoList</span>" on TPackingBBhv.
     */
    public BsSqlCasePickingNoListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlCasePickingNoList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlCasePickingNoList> getEntityType() { return SqlCasePickingNoList.class; }

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
        sb.append(dm).append(_casePickingNo);
        sb.append(dm).append(_emergencyFlg);
        sb.append(dm).append(_stockOutFlg);
        sb.append(dm).append(_pickingBatchNo);
        sb.append(dm).append(_pickingWorkNo);
        sb.append(dm).append(_workDtFrom);
        sb.append(dm).append(_workDtTo);
        sb.append(dm).append(_shippingDtFrom);
        sb.append(dm).append(_shippingDtTo);
        sb.append(dm).append(_supplyCustomerCd);
        sb.append(dm).append(_deliveryCourseCd);
        sb.append(dm).append(_cultureId);
        sb.append(dm).append(_updUserCd);
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
     * [get] casePickingNo <br>
     * @return The value of casePickingNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCasePickingNo() {
        return filterStringParameter(_casePickingNo);
    }

    /**
     * [set] casePickingNo <br>
     * @param casePickingNo The value of casePickingNo. (NullAllowed)
     */
    public void setCasePickingNo(String casePickingNo) {
        _casePickingNo = casePickingNo;
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
     * [get] stockOutFlg <br>
     * @return The value of stockOutFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getStockOutFlg() {
        return filterStringParameter(_stockOutFlg);
    }

    /**
     * [set] stockOutFlg <br>
     * @param stockOutFlg The value of stockOutFlg. (NullAllowed)
     */
    public void setStockOutFlg(String stockOutFlg) {
        _stockOutFlg = stockOutFlg;
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
     * [get] updUserCd <br>
     * @return The value of updUserCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getUpdUserCd() {
        return filterStringParameter(_updUserCd);
    }

    /**
     * [set] updUserCd <br>
     * @param updUserCd The value of updUserCd. (NullAllowed)
     */
    public void setUpdUserCd(String updUserCd) {
        _updUserCd = updUserCd;
    }
}
