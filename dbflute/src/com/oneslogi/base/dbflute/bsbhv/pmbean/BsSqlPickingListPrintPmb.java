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
 * The base class for typed parameter-bean of SqlPickingListPrint. <br>
 * This is related to "<span style="color: #AD4747">selectSqlPickingListPrint</span>" on TPickingHBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlPickingListPrintPmb extends SimplePagingBean implements EntityHandlingPmb<TPickingHBhv, SqlPickingListPrint>, AutoPagingHandlingPmb<TPickingHBhv, SqlPickingListPrint>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
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

    /** The parameter of deliveryCourseCd:likePrefix. */
    protected String _deliveryCourseCd;

    /** The option of like-search for deliveryCourseCd. */
    protected LikeSearchOption _deliveryCourseCdInternalLikeSearchOption;

    /** The parameter of dtFrom. */
    protected String _dtFrom;

    /** The parameter of takingShippingFlg. */
    protected String _takingShippingFlg;

    /** The parameter of dtTo. */
    protected String _dtTo;

    /** The parameter of pickingWorkNo:likeSuffix. */
    protected String _pickingWorkNo;

    /** The option of like-search for pickingWorkNo. */
    protected LikeSearchOption _pickingWorkNoInternalLikeSearchOption;

    /** The parameter of picCls. */
    protected String _picCls;

    /** The parameter of listOutKbn. */
    protected String _listOutKbn;

    /** The parameter of pickingGroupNo. */
    protected String _pickingGroupNo;

    /** The parameter of sglRowPicFlg. */
    protected String _sglRowPicFlg;

    /** The parameter of casePicFlg. */
    protected String _casePicFlg;

    /** The parameter of noStockOutFlg. */
    protected String _noStockOutFlg;

    /** The parameter of emergencyFlg. */
    protected String _emergencyFlg;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlPickingListPrint. <br>
     * This is related to "<span style="color: #AD4747">selectSqlPickingListPrint</span>" on TPickingHBhv.
     */
    public BsSqlPickingListPrintPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlPickingListPrint"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlPickingListPrint> getEntityType() { return SqlPickingListPrint.class; }

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
        sb.append(dm).append(_cultureId);
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_supplyCustomerCd);
        sb.append(dm).append(_pickingBatchNo);
        sb.append(dm).append(_deliveryCourseCd);
        sb.append(dm).append(_dtFrom);
        sb.append(dm).append(_takingShippingFlg);
        sb.append(dm).append(_dtTo);
        sb.append(dm).append(_pickingWorkNo);
        sb.append(dm).append(_picCls);
        sb.append(dm).append(_listOutKbn);
        sb.append(dm).append(_pickingGroupNo);
        sb.append(dm).append(_sglRowPicFlg);
        sb.append(dm).append(_casePicFlg);
        sb.append(dm).append(_noStockOutFlg);
        sb.append(dm).append(_emergencyFlg);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] picCls <br>
     * @return The value of picCls. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPicCls() {
        return filterStringParameter(_picCls);
    }

    /**
     * [set] picCls <br>
     * @param picCls The value of picCls. (NullAllowed)
     */
    public void setPicCls(String picCls) {
        _picCls = picCls;
    }

    /**
     * [get] listOutKbn <br>
     * @return The value of listOutKbn. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getListOutKbn() {
        return filterStringParameter(_listOutKbn);
    }

    /**
     * [set] listOutKbn <br>
     * @param listOutKbn The value of listOutKbn. (NullAllowed)
     */
    public void setListOutKbn(String listOutKbn) {
        _listOutKbn = listOutKbn;
    }

    /**
     * [get] pickingGroupNo <br>
     * @return The value of pickingGroupNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickingGroupNo() {
        return filterStringParameter(_pickingGroupNo);
    }

    /**
     * [set] pickingGroupNo <br>
     * @param pickingGroupNo The value of pickingGroupNo. (NullAllowed)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        _pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] sglRowPicFlg <br>
     * @return The value of sglRowPicFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSglRowPicFlg() {
        return filterStringParameter(_sglRowPicFlg);
    }

    /**
     * [set] sglRowPicFlg <br>
     * @param sglRowPicFlg The value of sglRowPicFlg. (NullAllowed)
     */
    public void setSglRowPicFlg(String sglRowPicFlg) {
        _sglRowPicFlg = sglRowPicFlg;
    }

    /**
     * [get] casePicFlg <br>
     * @return The value of casePicFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCasePicFlg() {
        return filterStringParameter(_casePicFlg);
    }

    /**
     * [set] casePicFlg <br>
     * @param casePicFlg The value of casePicFlg. (NullAllowed)
     */
    public void setCasePicFlg(String casePicFlg) {
        _casePicFlg = casePicFlg;
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
