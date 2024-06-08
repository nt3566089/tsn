package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WORK_DT, SHIPPING_DT, PICKING_BATCH_NO, PICKING_WORK_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SLIP_NO, LINE_NO, PRODUCT_ID, INST_NUM, ALLOC_NUM, STOCK_OUT_FLG, OPL_OUT_FLG, OPL_OUT_NM, TPL_OUT_FLG, TPL_OUT_NM, MLT_OUT_FLG, MLT_OUT_NM, SPL_OUT_FLG, SPL_OUT_NM, PL1_OUT_FLG, PL1_OUT_NM, PL1_OUT_DT, PL_OUT_FLG, PL_OUT_NM, SL_OUT_FLG, SL_OUT_NM, PL2_OUT_FLG, PL2_OUT_NM, PL2_OUT_DT, CASE_OUT_FLG, CASE_OUT_NM, CASE_OUT_DT, PICKING_GROUP_NO, EMERGENCY_FLG, UPD_DT, NUM, PACKING_CNT, PACKING_CASE_CNT, PACKING_MIXED_CNT, MULTI_PIC_FLG, MULTI_PIC_FLG_NM, TAG_OUT_FLG, TAG_OUT_FLG_NM, TAG_OUT_DT, SGL_ROW_PIC_FLG, SGL_ROW_PIC_NM, CASE_PIC_FLG, CASE_PIC_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSqlPickingListPrintDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** SHIPPING_DT: {varchar(8)} */
    @JsonKey
    protected String _shippingDt;

    /** PICKING_BATCH_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingBatchNo;

    /** PICKING_WORK_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(60)} */
    @JsonKey
    protected String _carrierNm;

    /** SLIP_NO: {int(10)} */
    @JsonKey
    protected Long _slipNo;

    /** LINE_NO: {int(10)} */
    @JsonKey
    protected Long _lineNo;

    /** PRODUCT_ID: {int(10)} */
    @JsonKey
    protected Long _productId;

    /** INST_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

    /** ALLOC_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    /** STOCK_OUT_FLG: {char(1)} */
    @JsonKey
    protected String _stockOutFlg;

    /** OPL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _oplOutFlg;

    /** OPL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _oplOutNm;

    /** TPL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _tplOutFlg;

    /** TPL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _tplOutNm;

    /** MLT_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _mltOutFlg;

    /** MLT_OUT_NM: {int(10)} */
    @JsonKey
    protected String _mltOutNm;

    /** SPL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _splOutFlg;

    /** SPL_OUT_NM: {int(10)} */
    @JsonKey
    protected Integer _splOutNm;

    /** PL1_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _pl1OutFlg;

    /** PL1_OUT_NM: {int(10)} */
    @JsonKey
    protected Integer _pl1OutNm;

    /** PL1_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _pl1OutDt;

    /** PL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _plOutFlg;

    /** PL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _plOutNm;

    /** SL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _slOutFlg;

    /** SL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _slOutNm;

    /** PL2_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _pl2OutFlg;

    /** PL2_OUT_NM: {int(10)} */
    @JsonKey
    protected Integer _pl2OutNm;

    /** PL2_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _pl2OutDt;

    /** CASE_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _caseOutFlg;

    /** CASE_OUT_NM: {int(10)} */
    @JsonKey
    protected String _caseOutNm;

    /** CASE_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _caseOutDt;

    /** PICKING_GROUP_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingGroupNo;

    /** EMERGENCY_FLG: {char(1)} */
    @JsonKey
    protected String _emergencyFlg;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** NUM: {int(10)} */
    @JsonKey
    protected Long _num;

    /** PACKING_CNT: {int(10)} */
    @JsonKey
    protected Long _packingCnt;

    /** PACKING_CASE_CNT: {int(10)} */
    @JsonKey
    protected Integer _packingCaseCnt;

    /** PACKING_MIXED_CNT: {int(10)} */
    @JsonKey
    protected Integer _packingMixedCnt;

    /** MULTI_PIC_FLG: {char(1), classification=MultiPicFlg} */
    @JsonKey
    protected String _multiPicFlg;

    /** MULTI_PIC_FLG_NM: {int(10)} */
    @JsonKey
    protected Integer _multiPicFlgNm;

    /** TAG_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _tagOutFlg;

    /** TAG_OUT_FLG_NM: {int(10)} */
    @JsonKey
    protected Integer _tagOutFlgNm;

    /** TAG_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _tagOutDt;

    /** SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg} */
    @JsonKey
    protected String _sglRowPicFlg;

    /** SGL_ROW_PIC_NM: {int(10)} */
    @JsonKey
    protected String _sglRowPicNm;

    /** CASE_PIC_FLG: {varchar(1)} */
    @JsonKey
    protected String _casePicFlg;

    /** CASE_PIC_NM: {int(10)} */
    @JsonKey
    protected String _casePicNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlPickingListPrintDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSqlPickingListPrintDto)) { return false; }
        final BsSqlPickingListPrintDto otherEntity = (BsSqlPickingListPrintDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getPickingBatchNo(), otherEntity.getPickingBatchNo())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getCarrierCd(), otherEntity.getCarrierCd())) { return false; }
        if (!helpComparingValue(getCarrierNm(), otherEntity.getCarrierNm())) { return false; }
        if (!helpComparingValue(getSlipNo(), otherEntity.getSlipNo())) { return false; }
        if (!helpComparingValue(getLineNo(), otherEntity.getLineNo())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getInstNum(), otherEntity.getInstNum())) { return false; }
        if (!helpComparingValue(getAllocNum(), otherEntity.getAllocNum())) { return false; }
        if (!helpComparingValue(getStockOutFlg(), otherEntity.getStockOutFlg())) { return false; }
        if (!helpComparingValue(getOplOutFlg(), otherEntity.getOplOutFlg())) { return false; }
        if (!helpComparingValue(getOplOutNm(), otherEntity.getOplOutNm())) { return false; }
        if (!helpComparingValue(getTplOutFlg(), otherEntity.getTplOutFlg())) { return false; }
        if (!helpComparingValue(getTplOutNm(), otherEntity.getTplOutNm())) { return false; }
        if (!helpComparingValue(getMltOutFlg(), otherEntity.getMltOutFlg())) { return false; }
        if (!helpComparingValue(getMltOutNm(), otherEntity.getMltOutNm())) { return false; }
        if (!helpComparingValue(getSplOutFlg(), otherEntity.getSplOutFlg())) { return false; }
        if (!helpComparingValue(getSplOutNm(), otherEntity.getSplOutNm())) { return false; }
        if (!helpComparingValue(getPl1OutFlg(), otherEntity.getPl1OutFlg())) { return false; }
        if (!helpComparingValue(getPl1OutNm(), otherEntity.getPl1OutNm())) { return false; }
        if (!helpComparingValue(getPl1OutDt(), otherEntity.getPl1OutDt())) { return false; }
        if (!helpComparingValue(getPlOutFlg(), otherEntity.getPlOutFlg())) { return false; }
        if (!helpComparingValue(getPlOutNm(), otherEntity.getPlOutNm())) { return false; }
        if (!helpComparingValue(getSlOutFlg(), otherEntity.getSlOutFlg())) { return false; }
        if (!helpComparingValue(getSlOutNm(), otherEntity.getSlOutNm())) { return false; }
        if (!helpComparingValue(getPl2OutFlg(), otherEntity.getPl2OutFlg())) { return false; }
        if (!helpComparingValue(getPl2OutNm(), otherEntity.getPl2OutNm())) { return false; }
        if (!helpComparingValue(getPl2OutDt(), otherEntity.getPl2OutDt())) { return false; }
        if (!helpComparingValue(getCaseOutFlg(), otherEntity.getCaseOutFlg())) { return false; }
        if (!helpComparingValue(getCaseOutNm(), otherEntity.getCaseOutNm())) { return false; }
        if (!helpComparingValue(getCaseOutDt(), otherEntity.getCaseOutDt())) { return false; }
        if (!helpComparingValue(getPickingGroupNo(), otherEntity.getPickingGroupNo())) { return false; }
        if (!helpComparingValue(getEmergencyFlg(), otherEntity.getEmergencyFlg())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getNum(), otherEntity.getNum())) { return false; }
        if (!helpComparingValue(getPackingCnt(), otherEntity.getPackingCnt())) { return false; }
        if (!helpComparingValue(getPackingCaseCnt(), otherEntity.getPackingCaseCnt())) { return false; }
        if (!helpComparingValue(getPackingMixedCnt(), otherEntity.getPackingMixedCnt())) { return false; }
        if (!helpComparingValue(getMultiPicFlg(), otherEntity.getMultiPicFlg())) { return false; }
        if (!helpComparingValue(getMultiPicFlgNm(), otherEntity.getMultiPicFlgNm())) { return false; }
        if (!helpComparingValue(getTagOutFlg(), otherEntity.getTagOutFlg())) { return false; }
        if (!helpComparingValue(getTagOutFlgNm(), otherEntity.getTagOutFlgNm())) { return false; }
        if (!helpComparingValue(getTagOutDt(), otherEntity.getTagOutDt())) { return false; }
        if (!helpComparingValue(getSglRowPicFlg(), otherEntity.getSglRowPicFlg())) { return false; }
        if (!helpComparingValue(getSglRowPicNm(), otherEntity.getSglRowPicNm())) { return false; }
        if (!helpComparingValue(getCasePicFlg(), otherEntity.getCasePicFlg())) { return false; }
        if (!helpComparingValue(getCasePicNm(), otherEntity.getCasePicNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlPickingListPrint");
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getWorkDt());
        result = xCH(result, getShippingDt());
        result = xCH(result, getPickingBatchNo());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getCarrierCd());
        result = xCH(result, getCarrierNm());
        result = xCH(result, getSlipNo());
        result = xCH(result, getLineNo());
        result = xCH(result, getProductId());
        result = xCH(result, getInstNum());
        result = xCH(result, getAllocNum());
        result = xCH(result, getStockOutFlg());
        result = xCH(result, getOplOutFlg());
        result = xCH(result, getOplOutNm());
        result = xCH(result, getTplOutFlg());
        result = xCH(result, getTplOutNm());
        result = xCH(result, getMltOutFlg());
        result = xCH(result, getMltOutNm());
        result = xCH(result, getSplOutFlg());
        result = xCH(result, getSplOutNm());
        result = xCH(result, getPl1OutFlg());
        result = xCH(result, getPl1OutNm());
        result = xCH(result, getPl1OutDt());
        result = xCH(result, getPlOutFlg());
        result = xCH(result, getPlOutNm());
        result = xCH(result, getSlOutFlg());
        result = xCH(result, getSlOutNm());
        result = xCH(result, getPl2OutFlg());
        result = xCH(result, getPl2OutNm());
        result = xCH(result, getPl2OutDt());
        result = xCH(result, getCaseOutFlg());
        result = xCH(result, getCaseOutNm());
        result = xCH(result, getCaseOutDt());
        result = xCH(result, getPickingGroupNo());
        result = xCH(result, getEmergencyFlg());
        result = xCH(result, getUpdDt());
        result = xCH(result, getNum());
        result = xCH(result, getPackingCnt());
        result = xCH(result, getPackingCaseCnt());
        result = xCH(result, getPackingMixedCnt());
        result = xCH(result, getMultiPicFlg());
        result = xCH(result, getMultiPicFlgNm());
        result = xCH(result, getTagOutFlg());
        result = xCH(result, getTagOutFlgNm());
        result = xCH(result, getTagOutDt());
        result = xCH(result, getSglRowPicFlg());
        result = xCH(result, getSglRowPicNm());
        result = xCH(result, getCasePicFlg());
        result = xCH(result, getCasePicNm());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getSlipNo());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getProductId());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getAllocNum());
        sb.append(c).append(getStockOutFlg());
        sb.append(c).append(getOplOutFlg());
        sb.append(c).append(getOplOutNm());
        sb.append(c).append(getTplOutFlg());
        sb.append(c).append(getTplOutNm());
        sb.append(c).append(getMltOutFlg());
        sb.append(c).append(getMltOutNm());
        sb.append(c).append(getSplOutFlg());
        sb.append(c).append(getSplOutNm());
        sb.append(c).append(getPl1OutFlg());
        sb.append(c).append(getPl1OutNm());
        sb.append(c).append(getPl1OutDt());
        sb.append(c).append(getPlOutFlg());
        sb.append(c).append(getPlOutNm());
        sb.append(c).append(getSlOutFlg());
        sb.append(c).append(getSlOutNm());
        sb.append(c).append(getPl2OutFlg());
        sb.append(c).append(getPl2OutNm());
        sb.append(c).append(getPl2OutDt());
        sb.append(c).append(getCaseOutFlg());
        sb.append(c).append(getCaseOutNm());
        sb.append(c).append(getCaseOutDt());
        sb.append(c).append(getPickingGroupNo());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getNum());
        sb.append(c).append(getPackingCnt());
        sb.append(c).append(getPackingCaseCnt());
        sb.append(c).append(getPackingMixedCnt());
        sb.append(c).append(getMultiPicFlg());
        sb.append(c).append(getMultiPicFlgNm());
        sb.append(c).append(getTagOutFlg());
        sb.append(c).append(getTagOutFlgNm());
        sb.append(c).append(getTagOutDt());
        sb.append(c).append(getSglRowPicFlg());
        sb.append(c).append(getSglRowPicNm());
        sb.append(c).append(getCasePicFlg());
        sb.append(c).append(getCasePicNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] SHIPPING_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {varchar(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] PICKING_BATCH_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public String getPickingBatchNo() {
        return _pickingBatchNo;
    }

    /**
     * [set] PICKING_BATCH_NO: {varchar(30)} <br>
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        __modifiedProperties.add("pickingBatchNo");
        this._pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {varchar(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {varchar(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] SLIP_NO: {int(10)} <br>
     * @return The value of the column 'SLIP_NO'. (NullAllowed)
     */
    public Long getSlipNo() {
        return _slipNo;
    }

    /**
     * [set] SLIP_NO: {int(10)} <br>
     * @param slipNo The value of the column 'SLIP_NO'. (NullAllowed)
     */
    public void setSlipNo(Long slipNo) {
        __modifiedProperties.add("slipNo");
        this._slipNo = slipNo;
    }

    /**
     * [get] LINE_NO: {int(10)} <br>
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {int(10)} <br>
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] PRODUCT_ID: {int(10)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {int(10)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] INST_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'INST_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInstNum() {
        return _instNum;
    }

    /**
     * [set] INST_NUM: {decimal(38, 6)} <br>
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        __modifiedProperties.add("instNum");
        this._instNum = instNum;
    }

    /**
     * [get] ALLOC_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum() {
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {decimal(38, 6)} <br>
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        __modifiedProperties.add("allocNum");
        this._allocNum = allocNum;
    }

    /**
     * [get] STOCK_OUT_FLG: {char(1)} <br>
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public String getStockOutFlg() {
        return _stockOutFlg;
    }

    /**
     * [set] STOCK_OUT_FLG: {char(1)} <br>
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public void setStockOutFlg(String stockOutFlg) {
        __modifiedProperties.add("stockOutFlg");
        this._stockOutFlg = stockOutFlg;
    }

    /**
     * [get] OPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'OPL_OUT_FLG'. (NullAllowed)
     */
    public String getOplOutFlg() {
        return _oplOutFlg;
    }

    /**
     * [set] OPL_OUT_FLG: {varchar(1)} <br>
     * @param oplOutFlg The value of the column 'OPL_OUT_FLG'. (NullAllowed)
     */
    public void setOplOutFlg(String oplOutFlg) {
        __modifiedProperties.add("oplOutFlg");
        this._oplOutFlg = oplOutFlg;
    }

    /**
     * [get] OPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'OPL_OUT_NM'. (NullAllowed)
     */
    public String getOplOutNm() {
        return _oplOutNm;
    }

    /**
     * [set] OPL_OUT_NM: {int(10)} <br>
     * @param oplOutNm The value of the column 'OPL_OUT_NM'. (NullAllowed)
     */
    public void setOplOutNm(String oplOutNm) {
        __modifiedProperties.add("oplOutNm");
        this._oplOutNm = oplOutNm;
    }

    /**
     * [get] TPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'TPL_OUT_FLG'. (NullAllowed)
     */
    public String getTplOutFlg() {
        return _tplOutFlg;
    }

    /**
     * [set] TPL_OUT_FLG: {varchar(1)} <br>
     * @param tplOutFlg The value of the column 'TPL_OUT_FLG'. (NullAllowed)
     */
    public void setTplOutFlg(String tplOutFlg) {
        __modifiedProperties.add("tplOutFlg");
        this._tplOutFlg = tplOutFlg;
    }

    /**
     * [get] TPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'TPL_OUT_NM'. (NullAllowed)
     */
    public String getTplOutNm() {
        return _tplOutNm;
    }

    /**
     * [set] TPL_OUT_NM: {int(10)} <br>
     * @param tplOutNm The value of the column 'TPL_OUT_NM'. (NullAllowed)
     */
    public void setTplOutNm(String tplOutNm) {
        __modifiedProperties.add("tplOutNm");
        this._tplOutNm = tplOutNm;
    }

    /**
     * [get] MLT_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'MLT_OUT_FLG'. (NullAllowed)
     */
    public String getMltOutFlg() {
        return _mltOutFlg;
    }

    /**
     * [set] MLT_OUT_FLG: {varchar(1)} <br>
     * @param mltOutFlg The value of the column 'MLT_OUT_FLG'. (NullAllowed)
     */
    public void setMltOutFlg(String mltOutFlg) {
        __modifiedProperties.add("mltOutFlg");
        this._mltOutFlg = mltOutFlg;
    }

    /**
     * [get] MLT_OUT_NM: {int(10)} <br>
     * @return The value of the column 'MLT_OUT_NM'. (NullAllowed)
     */
    public String getMltOutNm() {
        return _mltOutNm;
    }

    /**
     * [set] MLT_OUT_NM: {int(10)} <br>
     * @param mltOutNm The value of the column 'MLT_OUT_NM'. (NullAllowed)
     */
    public void setMltOutNm(String mltOutNm) {
        __modifiedProperties.add("mltOutNm");
        this._mltOutNm = mltOutNm;
    }

    /**
     * [get] SPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'SPL_OUT_FLG'. (NullAllowed)
     */
    public String getSplOutFlg() {
        return _splOutFlg;
    }

    /**
     * [set] SPL_OUT_FLG: {varchar(1)} <br>
     * @param splOutFlg The value of the column 'SPL_OUT_FLG'. (NullAllowed)
     */
    public void setSplOutFlg(String splOutFlg) {
        __modifiedProperties.add("splOutFlg");
        this._splOutFlg = splOutFlg;
    }

    /**
     * [get] SPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'SPL_OUT_NM'. (NullAllowed)
     */
    public Integer getSplOutNm() {
        return _splOutNm;
    }

    /**
     * [set] SPL_OUT_NM: {int(10)} <br>
     * @param splOutNm The value of the column 'SPL_OUT_NM'. (NullAllowed)
     */
    public void setSplOutNm(Integer splOutNm) {
        __modifiedProperties.add("splOutNm");
        this._splOutNm = splOutNm;
    }

    /**
     * [get] PL1_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL1_OUT_FLG'. (NullAllowed)
     */
    public String getPl1OutFlg() {
        return _pl1OutFlg;
    }

    /**
     * [set] PL1_OUT_FLG: {varchar(1)} <br>
     * @param pl1OutFlg The value of the column 'PL1_OUT_FLG'. (NullAllowed)
     */
    public void setPl1OutFlg(String pl1OutFlg) {
        __modifiedProperties.add("pl1OutFlg");
        this._pl1OutFlg = pl1OutFlg;
    }

    /**
     * [get] PL1_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL1_OUT_NM'. (NullAllowed)
     */
    public Integer getPl1OutNm() {
        return _pl1OutNm;
    }

    /**
     * [set] PL1_OUT_NM: {int(10)} <br>
     * @param pl1OutNm The value of the column 'PL1_OUT_NM'. (NullAllowed)
     */
    public void setPl1OutNm(Integer pl1OutNm) {
        __modifiedProperties.add("pl1OutNm");
        this._pl1OutNm = pl1OutNm;
    }

    /**
     * [get] PL1_OUT_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'PL1_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPl1OutDt() {
        return _pl1OutDt;
    }

    /**
     * [set] PL1_OUT_DT: {datetime2(26, 6)} <br>
     * @param pl1OutDt The value of the column 'PL1_OUT_DT'. (NullAllowed)
     */
    public void setPl1OutDt(java.sql.Timestamp pl1OutDt) {
        __modifiedProperties.add("pl1OutDt");
        this._pl1OutDt = pl1OutDt;
    }

    /**
     * [get] PL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL_OUT_FLG'. (NullAllowed)
     */
    public String getPlOutFlg() {
        return _plOutFlg;
    }

    /**
     * [set] PL_OUT_FLG: {varchar(1)} <br>
     * @param plOutFlg The value of the column 'PL_OUT_FLG'. (NullAllowed)
     */
    public void setPlOutFlg(String plOutFlg) {
        __modifiedProperties.add("plOutFlg");
        this._plOutFlg = plOutFlg;
    }

    /**
     * [get] PL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL_OUT_NM'. (NullAllowed)
     */
    public String getPlOutNm() {
        return _plOutNm;
    }

    /**
     * [set] PL_OUT_NM: {int(10)} <br>
     * @param plOutNm The value of the column 'PL_OUT_NM'. (NullAllowed)
     */
    public void setPlOutNm(String plOutNm) {
        __modifiedProperties.add("plOutNm");
        this._plOutNm = plOutNm;
    }

    /**
     * [get] SL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'SL_OUT_FLG'. (NullAllowed)
     */
    public String getSlOutFlg() {
        return _slOutFlg;
    }

    /**
     * [set] SL_OUT_FLG: {varchar(1)} <br>
     * @param slOutFlg The value of the column 'SL_OUT_FLG'. (NullAllowed)
     */
    public void setSlOutFlg(String slOutFlg) {
        __modifiedProperties.add("slOutFlg");
        this._slOutFlg = slOutFlg;
    }

    /**
     * [get] SL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'SL_OUT_NM'. (NullAllowed)
     */
    public String getSlOutNm() {
        return _slOutNm;
    }

    /**
     * [set] SL_OUT_NM: {int(10)} <br>
     * @param slOutNm The value of the column 'SL_OUT_NM'. (NullAllowed)
     */
    public void setSlOutNm(String slOutNm) {
        __modifiedProperties.add("slOutNm");
        this._slOutNm = slOutNm;
    }

    /**
     * [get] PL2_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL2_OUT_FLG'. (NullAllowed)
     */
    public String getPl2OutFlg() {
        return _pl2OutFlg;
    }

    /**
     * [set] PL2_OUT_FLG: {varchar(1)} <br>
     * @param pl2OutFlg The value of the column 'PL2_OUT_FLG'. (NullAllowed)
     */
    public void setPl2OutFlg(String pl2OutFlg) {
        __modifiedProperties.add("pl2OutFlg");
        this._pl2OutFlg = pl2OutFlg;
    }

    /**
     * [get] PL2_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL2_OUT_NM'. (NullAllowed)
     */
    public Integer getPl2OutNm() {
        return _pl2OutNm;
    }

    /**
     * [set] PL2_OUT_NM: {int(10)} <br>
     * @param pl2OutNm The value of the column 'PL2_OUT_NM'. (NullAllowed)
     */
    public void setPl2OutNm(Integer pl2OutNm) {
        __modifiedProperties.add("pl2OutNm");
        this._pl2OutNm = pl2OutNm;
    }

    /**
     * [get] PL2_OUT_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'PL2_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPl2OutDt() {
        return _pl2OutDt;
    }

    /**
     * [set] PL2_OUT_DT: {datetime2(26, 6)} <br>
     * @param pl2OutDt The value of the column 'PL2_OUT_DT'. (NullAllowed)
     */
    public void setPl2OutDt(java.sql.Timestamp pl2OutDt) {
        __modifiedProperties.add("pl2OutDt");
        this._pl2OutDt = pl2OutDt;
    }

    /**
     * [get] CASE_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'CASE_OUT_FLG'. (NullAllowed)
     */
    public String getCaseOutFlg() {
        return _caseOutFlg;
    }

    /**
     * [set] CASE_OUT_FLG: {varchar(1)} <br>
     * @param caseOutFlg The value of the column 'CASE_OUT_FLG'. (NullAllowed)
     */
    public void setCaseOutFlg(String caseOutFlg) {
        __modifiedProperties.add("caseOutFlg");
        this._caseOutFlg = caseOutFlg;
    }

    /**
     * [get] CASE_OUT_NM: {int(10)} <br>
     * @return The value of the column 'CASE_OUT_NM'. (NullAllowed)
     */
    public String getCaseOutNm() {
        return _caseOutNm;
    }

    /**
     * [set] CASE_OUT_NM: {int(10)} <br>
     * @param caseOutNm The value of the column 'CASE_OUT_NM'. (NullAllowed)
     */
    public void setCaseOutNm(String caseOutNm) {
        __modifiedProperties.add("caseOutNm");
        this._caseOutNm = caseOutNm;
    }

    /**
     * [get] CASE_OUT_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'CASE_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getCaseOutDt() {
        return _caseOutDt;
    }

    /**
     * [set] CASE_OUT_DT: {datetime2(26, 6)} <br>
     * @param caseOutDt The value of the column 'CASE_OUT_DT'. (NullAllowed)
     */
    public void setCaseOutDt(java.sql.Timestamp caseOutDt) {
        __modifiedProperties.add("caseOutDt");
        this._caseOutDt = caseOutDt;
    }

    /**
     * [get] PICKING_GROUP_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public String getPickingGroupNo() {
        return _pickingGroupNo;
    }

    /**
     * [set] PICKING_GROUP_NO: {varchar(30)} <br>
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        __modifiedProperties.add("pickingGroupNo");
        this._pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] EMERGENCY_FLG: {char(1)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {char(1)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] NUM: {int(10)} <br>
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public Long getNum() {
        return _num;
    }

    /**
     * [set] NUM: {int(10)} <br>
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(Long num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

    /**
     * [get] PACKING_CNT: {int(10)} <br>
     * @return The value of the column 'PACKING_CNT'. (NullAllowed)
     */
    public Long getPackingCnt() {
        return _packingCnt;
    }

    /**
     * [set] PACKING_CNT: {int(10)} <br>
     * @param packingCnt The value of the column 'PACKING_CNT'. (NullAllowed)
     */
    public void setPackingCnt(Long packingCnt) {
        __modifiedProperties.add("packingCnt");
        this._packingCnt = packingCnt;
    }

    /**
     * [get] PACKING_CASE_CNT: {int(10)} <br>
     * @return The value of the column 'PACKING_CASE_CNT'. (NullAllowed)
     */
    public Integer getPackingCaseCnt() {
        return _packingCaseCnt;
    }

    /**
     * [set] PACKING_CASE_CNT: {int(10)} <br>
     * @param packingCaseCnt The value of the column 'PACKING_CASE_CNT'. (NullAllowed)
     */
    public void setPackingCaseCnt(Integer packingCaseCnt) {
        __modifiedProperties.add("packingCaseCnt");
        this._packingCaseCnt = packingCaseCnt;
    }

    /**
     * [get] PACKING_MIXED_CNT: {int(10)} <br>
     * @return The value of the column 'PACKING_MIXED_CNT'. (NullAllowed)
     */
    public Integer getPackingMixedCnt() {
        return _packingMixedCnt;
    }

    /**
     * [set] PACKING_MIXED_CNT: {int(10)} <br>
     * @param packingMixedCnt The value of the column 'PACKING_MIXED_CNT'. (NullAllowed)
     */
    public void setPackingMixedCnt(Integer packingMixedCnt) {
        __modifiedProperties.add("packingMixedCnt");
        this._packingMixedCnt = packingMixedCnt;
    }

    /**
     * [get] MULTI_PIC_FLG: {char(1), classification=MultiPicFlg} <br>
     * // cls(MultiPicFlg) マルチピック計算フラグ
     * @return The value of the column 'MULTI_PIC_FLG'. (NullAllowed)
     */
    public String getMultiPicFlg() {
        return _multiPicFlg;
    }

    /**
     * [set] MULTI_PIC_FLG: {char(1), classification=MultiPicFlg} <br>
     * // cls(MultiPicFlg) マルチピック計算フラグ
     * @param multiPicFlg The value of the column 'MULTI_PIC_FLG'. (NullAllowed)
     */
    public void setMultiPicFlg(String multiPicFlg) {
        __modifiedProperties.add("multiPicFlg");
        this._multiPicFlg = multiPicFlg;
    }

    /**
     * [get] MULTI_PIC_FLG_NM: {int(10)} <br>
     * @return The value of the column 'MULTI_PIC_FLG_NM'. (NullAllowed)
     */
    public Integer getMultiPicFlgNm() {
        return _multiPicFlgNm;
    }

    /**
     * [set] MULTI_PIC_FLG_NM: {int(10)} <br>
     * @param multiPicFlgNm The value of the column 'MULTI_PIC_FLG_NM'. (NullAllowed)
     */
    public void setMultiPicFlgNm(Integer multiPicFlgNm) {
        __modifiedProperties.add("multiPicFlgNm");
        this._multiPicFlgNm = multiPicFlgNm;
    }

    /**
     * [get] TAG_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public String getTagOutFlg() {
        return _tagOutFlg;
    }

    /**
     * [set] TAG_OUT_FLG: {varchar(1)} <br>
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public void setTagOutFlg(String tagOutFlg) {
        __modifiedProperties.add("tagOutFlg");
        this._tagOutFlg = tagOutFlg;
    }

    /**
     * [get] TAG_OUT_FLG_NM: {int(10)} <br>
     * @return The value of the column 'TAG_OUT_FLG_NM'. (NullAllowed)
     */
    public Integer getTagOutFlgNm() {
        return _tagOutFlgNm;
    }

    /**
     * [set] TAG_OUT_FLG_NM: {int(10)} <br>
     * @param tagOutFlgNm The value of the column 'TAG_OUT_FLG_NM'. (NullAllowed)
     */
    public void setTagOutFlgNm(Integer tagOutFlgNm) {
        __modifiedProperties.add("tagOutFlgNm");
        this._tagOutFlgNm = tagOutFlgNm;
    }

    /**
     * [get] TAG_OUT_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'TAG_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getTagOutDt() {
        return _tagOutDt;
    }

    /**
     * [set] TAG_OUT_DT: {datetime2(26, 6)} <br>
     * @param tagOutDt The value of the column 'TAG_OUT_DT'. (NullAllowed)
     */
    public void setTagOutDt(java.sql.Timestamp tagOutDt) {
        __modifiedProperties.add("tagOutDt");
        this._tagOutDt = tagOutDt;
    }

    /**
     * [get] SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg} <br>
     * // cls(SglRowPicFlg)
     * @return The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed)
     */
    public String getSglRowPicFlg() {
        return _sglRowPicFlg;
    }

    /**
     * [set] SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg} <br>
     * // cls(SglRowPicFlg)
     * @param sglRowPicFlg The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed)
     */
    public void setSglRowPicFlg(String sglRowPicFlg) {
        __modifiedProperties.add("sglRowPicFlg");
        this._sglRowPicFlg = sglRowPicFlg;
    }

    /**
     * [get] SGL_ROW_PIC_NM: {int(10)} <br>
     * @return The value of the column 'SGL_ROW_PIC_NM'. (NullAllowed)
     */
    public String getSglRowPicNm() {
        return _sglRowPicNm;
    }

    /**
     * [set] SGL_ROW_PIC_NM: {int(10)} <br>
     * @param sglRowPicNm The value of the column 'SGL_ROW_PIC_NM'. (NullAllowed)
     */
    public void setSglRowPicNm(String sglRowPicNm) {
        __modifiedProperties.add("sglRowPicNm");
        this._sglRowPicNm = sglRowPicNm;
    }

    /**
     * [get] CASE_PIC_FLG: {varchar(1)} <br>
     * @return The value of the column 'CASE_PIC_FLG'. (NullAllowed)
     */
    public String getCasePicFlg() {
        return _casePicFlg;
    }

    /**
     * [set] CASE_PIC_FLG: {varchar(1)} <br>
     * @param casePicFlg The value of the column 'CASE_PIC_FLG'. (NullAllowed)
     */
    public void setCasePicFlg(String casePicFlg) {
        __modifiedProperties.add("casePicFlg");
        this._casePicFlg = casePicFlg;
    }

    /**
     * [get] CASE_PIC_NM: {int(10)} <br>
     * @return The value of the column 'CASE_PIC_NM'. (NullAllowed)
     */
    public String getCasePicNm() {
        return _casePicNm;
    }

    /**
     * [set] CASE_PIC_NM: {int(10)} <br>
     * @param casePicNm The value of the column 'CASE_PIC_NM'. (NullAllowed)
     */
    public void setCasePicNm(String casePicNm) {
        __modifiedProperties.add("casePicNm");
        this._casePicNm = casePicNm;
    }

}
