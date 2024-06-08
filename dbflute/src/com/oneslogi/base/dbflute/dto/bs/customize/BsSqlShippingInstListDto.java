package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShippingInstList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPPING_INST_H_ID, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WORK_DT, SHIPPING_DT, PICKING_BATCH_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, BOL_NO, BOL_OUT_FLG, BOL_OUT_NM, SHIPPING_SLIP_NO, CLIENT_SHIPPING_NO, SHIPPING_STATUS, SHIPPING_STATUS_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SLIP_NO, LINE_NO, PRODUCT_ID, INST_NUM, ALLOC_NUM, STOCK_OUT_FLG, OPL_OUT_FLG, MLT_OUT_FLG, TPL_OUT_FLG, PL_OUT_FLG, SPL_OUT_FLG, PL1_OUT_FLG, PL2_OUT_FLG, CASE_OUT_FLG, INSPECTION_OUT_FLG, SL_OUT_FLG, PACKING_OUT_FLG, INVOICE_CREATE_FLG, STW_OUT_FLG, OPL_OUT_NM, MLT_OUT_NM, TPL_OUT_NM, PL_OUT_NM, SPL_OUT_NM, PL1_OUT_NM, PL2_OUT_NM, CASE_OUT_NM, INSPECTION_OUT_NM, SL_OUT_NM, PACKING_OUT_NM, INVOICE_CREATE_NM, STW_OUT_NM, PICKING_NUM, INSPECTION_NUM, LOADING_STATUS, PICKING_WORK_NO, DELIV_UNIT_NO, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, DELIV_TZ_NM, MESSAGE_NM, PICKING_WORK_MESSAGE, PICKING_WORK_MESSAGE_COUNT, EMERGENCY_FLG, UPD_DT, PICKING_WORK_NO_CNT, UPD_DT_H, SHIPPING_STOP_CS, SHIPPING_STOP_CS_NM, SHIPPING_STOP_PD, SHIPPING_STOP_PD_NM, FORCE_FIXED_FLG, FORCE_FIXED_FLG_NM, NUM, VERSION_NO, CONTROL_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsSqlShippingInstListDto implements Serializable {

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
    /** SHIPPING_INST_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _shippingInstHId;

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

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _delivCustomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** BOL_NO: {varchar(30)} */
    @JsonKey
    protected String _bolNo;

    /** BOL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _bolOutFlg;

    /** BOL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _bolOutNm;

    /** SHIPPING_SLIP_NO: {varchar(30)} */
    @JsonKey
    protected String _shippingSlipNo;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** SHIPPING_STATUS: {varchar(30)} */
    @JsonKey
    protected String _shippingStatus;

    /** SHIPPING_STATUS_NM: {int(10)} */
    @JsonKey
    protected String _shippingStatusNm;

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

    /** STOCK_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _stockOutFlg;

    /** OPL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _oplOutFlg;

    /** MLT_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _mltOutFlg;

    /** TPL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _tplOutFlg;

    /** PL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _plOutFlg;

    /** SPL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _splOutFlg;

    /** PL1_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _pl1OutFlg;

    /** PL2_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _pl2OutFlg;

    /** CASE_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _caseOutFlg;

    /** INSPECTION_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _inspectionOutFlg;

    /** SL_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _slOutFlg;

    /** PACKING_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _packingOutFlg;

    /** INVOICE_CREATE_FLG: {varchar(1)} */
    @JsonKey
    protected String _invoiceCreateFlg;

    /** STW_OUT_FLG: {varchar(1)} */
    @JsonKey
    protected String _stwOutFlg;

    /** OPL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _oplOutNm;

    /** MLT_OUT_NM: {int(10)} */
    @JsonKey
    protected String _mltOutNm;

    /** TPL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _tplOutNm;

    /** PL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _plOutNm;

    /** SPL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _splOutNm;

    /** PL1_OUT_NM: {int(10)} */
    @JsonKey
    protected String _pl1OutNm;

    /** PL2_OUT_NM: {int(10)} */
    @JsonKey
    protected String _pl2OutNm;

    /** CASE_OUT_NM: {int(10)} */
    @JsonKey
    protected String _caseOutNm;

    /** INSPECTION_OUT_NM: {int(10)} */
    @JsonKey
    protected String _inspectionOutNm;

    /** SL_OUT_NM: {int(10)} */
    @JsonKey
    protected String _slOutNm;

    /** PACKING_OUT_NM: {int(10)} */
    @JsonKey
    protected String _packingOutNm;

    /** INVOICE_CREATE_NM: {int(10)} */
    @JsonKey
    protected String _invoiceCreateNm;

    /** STW_OUT_NM: {int(10)} */
    @JsonKey
    protected String _stwOutNm;

    /** PICKING_NUM: {decimal(38)} */
    @JsonKey
    protected java.math.BigDecimal _pickingNum;

    /** INSPECTION_NUM: {decimal(38)} */
    @JsonKey
    protected java.math.BigDecimal _inspectionNum;

    /** LOADING_STATUS: {int(10)} */
    @JsonKey
    protected Integer _loadingStatus;

    /** PICKING_WORK_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** DELIV_UNIT_NO: {varchar(30)} */
    @JsonKey
    protected String _delivUnitNo;

    /** DELIV_PLAN_DT: {varchar(8)} */
    @JsonKey
    protected String _delivPlanDt;

    /** DELIV_DT: {varchar(8)} */
    @JsonKey
    protected String _delivDt;

    /** DELIV_TZ: {varchar(30)} */
    @JsonKey
    protected String _delivTz;

    /** DELIV_TZ_NM: {int(10)} */
    @JsonKey
    protected String _delivTzNm;

    /** MESSAGE_NM: {varchar(4000)} */
    @JsonKey
    protected String _messageNm;

    /** PICKING_WORK_MESSAGE: {varchar(255)} */
    @JsonKey
    protected String _pickingWorkMessage;

    /** PICKING_WORK_MESSAGE_COUNT: {int(10)} */
    @JsonKey
    protected Long _pickingWorkMessageCount;

    /** EMERGENCY_FLG: {char(1)} */
    @JsonKey
    protected String _emergencyFlg;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** PICKING_WORK_NO_CNT: {int(10)} */
    @JsonKey
    protected Long _pickingWorkNoCnt;

    /** UPD_DT_H: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDtH;

    /** SHIPPING_STOP_CS: {char(1)} */
    @JsonKey
    protected String _shippingStopCs;

    /** SHIPPING_STOP_CS_NM: {int(10)} */
    @JsonKey
    protected String _shippingStopCsNm;

    /** SHIPPING_STOP_PD: {char(1)} */
    @JsonKey
    protected String _shippingStopPd;

    /** SHIPPING_STOP_PD_NM: {int(10)} */
    @JsonKey
    protected String _shippingStopPdNm;

    /** FORCE_FIXED_FLG: {char(1)} */
    @JsonKey
    protected String _forceFixedFlg;

    /** FORCE_FIXED_FLG_NM: {int(10)} */
    @JsonKey
    protected String _forceFixedFlgNm;

    /** NUM: {int(10)} */
    @JsonKey
    protected Long _num;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShippingInstListDto() {
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
        if (other == null || !(other instanceof BsSqlShippingInstListDto)) { return false; }
        final BsSqlShippingInstListDto otherEntity = (BsSqlShippingInstListDto)other;
        if (!helpComparingValue(getShippingInstHId(), otherEntity.getShippingInstHId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getPickingBatchNo(), otherEntity.getPickingBatchNo())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getDelivCustomerCd(), otherEntity.getDelivCustomerCd())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getBolNo(), otherEntity.getBolNo())) { return false; }
        if (!helpComparingValue(getBolOutFlg(), otherEntity.getBolOutFlg())) { return false; }
        if (!helpComparingValue(getBolOutNm(), otherEntity.getBolOutNm())) { return false; }
        if (!helpComparingValue(getShippingSlipNo(), otherEntity.getShippingSlipNo())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        if (!helpComparingValue(getShippingStatus(), otherEntity.getShippingStatus())) { return false; }
        if (!helpComparingValue(getShippingStatusNm(), otherEntity.getShippingStatusNm())) { return false; }
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
        if (!helpComparingValue(getMltOutFlg(), otherEntity.getMltOutFlg())) { return false; }
        if (!helpComparingValue(getTplOutFlg(), otherEntity.getTplOutFlg())) { return false; }
        if (!helpComparingValue(getPlOutFlg(), otherEntity.getPlOutFlg())) { return false; }
        if (!helpComparingValue(getSplOutFlg(), otherEntity.getSplOutFlg())) { return false; }
        if (!helpComparingValue(getPl1OutFlg(), otherEntity.getPl1OutFlg())) { return false; }
        if (!helpComparingValue(getPl2OutFlg(), otherEntity.getPl2OutFlg())) { return false; }
        if (!helpComparingValue(getCaseOutFlg(), otherEntity.getCaseOutFlg())) { return false; }
        if (!helpComparingValue(getInspectionOutFlg(), otherEntity.getInspectionOutFlg())) { return false; }
        if (!helpComparingValue(getSlOutFlg(), otherEntity.getSlOutFlg())) { return false; }
        if (!helpComparingValue(getPackingOutFlg(), otherEntity.getPackingOutFlg())) { return false; }
        if (!helpComparingValue(getInvoiceCreateFlg(), otherEntity.getInvoiceCreateFlg())) { return false; }
        if (!helpComparingValue(getStwOutFlg(), otherEntity.getStwOutFlg())) { return false; }
        if (!helpComparingValue(getOplOutNm(), otherEntity.getOplOutNm())) { return false; }
        if (!helpComparingValue(getMltOutNm(), otherEntity.getMltOutNm())) { return false; }
        if (!helpComparingValue(getTplOutNm(), otherEntity.getTplOutNm())) { return false; }
        if (!helpComparingValue(getPlOutNm(), otherEntity.getPlOutNm())) { return false; }
        if (!helpComparingValue(getSplOutNm(), otherEntity.getSplOutNm())) { return false; }
        if (!helpComparingValue(getPl1OutNm(), otherEntity.getPl1OutNm())) { return false; }
        if (!helpComparingValue(getPl2OutNm(), otherEntity.getPl2OutNm())) { return false; }
        if (!helpComparingValue(getCaseOutNm(), otherEntity.getCaseOutNm())) { return false; }
        if (!helpComparingValue(getInspectionOutNm(), otherEntity.getInspectionOutNm())) { return false; }
        if (!helpComparingValue(getSlOutNm(), otherEntity.getSlOutNm())) { return false; }
        if (!helpComparingValue(getPackingOutNm(), otherEntity.getPackingOutNm())) { return false; }
        if (!helpComparingValue(getInvoiceCreateNm(), otherEntity.getInvoiceCreateNm())) { return false; }
        if (!helpComparingValue(getStwOutNm(), otherEntity.getStwOutNm())) { return false; }
        if (!helpComparingValue(getPickingNum(), otherEntity.getPickingNum())) { return false; }
        if (!helpComparingValue(getInspectionNum(), otherEntity.getInspectionNum())) { return false; }
        if (!helpComparingValue(getLoadingStatus(), otherEntity.getLoadingStatus())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getDelivUnitNo(), otherEntity.getDelivUnitNo())) { return false; }
        if (!helpComparingValue(getDelivPlanDt(), otherEntity.getDelivPlanDt())) { return false; }
        if (!helpComparingValue(getDelivDt(), otherEntity.getDelivDt())) { return false; }
        if (!helpComparingValue(getDelivTz(), otherEntity.getDelivTz())) { return false; }
        if (!helpComparingValue(getDelivTzNm(), otherEntity.getDelivTzNm())) { return false; }
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        if (!helpComparingValue(getPickingWorkMessage(), otherEntity.getPickingWorkMessage())) { return false; }
        if (!helpComparingValue(getPickingWorkMessageCount(), otherEntity.getPickingWorkMessageCount())) { return false; }
        if (!helpComparingValue(getEmergencyFlg(), otherEntity.getEmergencyFlg())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getPickingWorkNoCnt(), otherEntity.getPickingWorkNoCnt())) { return false; }
        if (!helpComparingValue(getUpdDtH(), otherEntity.getUpdDtH())) { return false; }
        if (!helpComparingValue(getShippingStopCs(), otherEntity.getShippingStopCs())) { return false; }
        if (!helpComparingValue(getShippingStopCsNm(), otherEntity.getShippingStopCsNm())) { return false; }
        if (!helpComparingValue(getShippingStopPd(), otherEntity.getShippingStopPd())) { return false; }
        if (!helpComparingValue(getShippingStopPdNm(), otherEntity.getShippingStopPdNm())) { return false; }
        if (!helpComparingValue(getForceFixedFlg(), otherEntity.getForceFixedFlg())) { return false; }
        if (!helpComparingValue(getForceFixedFlgNm(), otherEntity.getForceFixedFlgNm())) { return false; }
        if (!helpComparingValue(getNum(), otherEntity.getNum())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShippingInstList");
        result = xCH(result, getShippingInstHId());
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getWorkDt());
        result = xCH(result, getShippingDt());
        result = xCH(result, getPickingBatchNo());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getDelivCustomerCd());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getBolNo());
        result = xCH(result, getBolOutFlg());
        result = xCH(result, getBolOutNm());
        result = xCH(result, getShippingSlipNo());
        result = xCH(result, getClientShippingNo());
        result = xCH(result, getShippingStatus());
        result = xCH(result, getShippingStatusNm());
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
        result = xCH(result, getMltOutFlg());
        result = xCH(result, getTplOutFlg());
        result = xCH(result, getPlOutFlg());
        result = xCH(result, getSplOutFlg());
        result = xCH(result, getPl1OutFlg());
        result = xCH(result, getPl2OutFlg());
        result = xCH(result, getCaseOutFlg());
        result = xCH(result, getInspectionOutFlg());
        result = xCH(result, getSlOutFlg());
        result = xCH(result, getPackingOutFlg());
        result = xCH(result, getInvoiceCreateFlg());
        result = xCH(result, getStwOutFlg());
        result = xCH(result, getOplOutNm());
        result = xCH(result, getMltOutNm());
        result = xCH(result, getTplOutNm());
        result = xCH(result, getPlOutNm());
        result = xCH(result, getSplOutNm());
        result = xCH(result, getPl1OutNm());
        result = xCH(result, getPl2OutNm());
        result = xCH(result, getCaseOutNm());
        result = xCH(result, getInspectionOutNm());
        result = xCH(result, getSlOutNm());
        result = xCH(result, getPackingOutNm());
        result = xCH(result, getInvoiceCreateNm());
        result = xCH(result, getStwOutNm());
        result = xCH(result, getPickingNum());
        result = xCH(result, getInspectionNum());
        result = xCH(result, getLoadingStatus());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getDelivUnitNo());
        result = xCH(result, getDelivPlanDt());
        result = xCH(result, getDelivDt());
        result = xCH(result, getDelivTz());
        result = xCH(result, getDelivTzNm());
        result = xCH(result, getMessageNm());
        result = xCH(result, getPickingWorkMessage());
        result = xCH(result, getPickingWorkMessageCount());
        result = xCH(result, getEmergencyFlg());
        result = xCH(result, getUpdDt());
        result = xCH(result, getPickingWorkNoCnt());
        result = xCH(result, getUpdDtH());
        result = xCH(result, getShippingStopCs());
        result = xCH(result, getShippingStopCsNm());
        result = xCH(result, getShippingStopPd());
        result = xCH(result, getShippingStopPdNm());
        result = xCH(result, getForceFixedFlg());
        result = xCH(result, getForceFixedFlgNm());
        result = xCH(result, getNum());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
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
        sb.append(c).append(getShippingInstHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getDelivCustomerCd());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getBolNo());
        sb.append(c).append(getBolOutFlg());
        sb.append(c).append(getBolOutNm());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getShippingStatus());
        sb.append(c).append(getShippingStatusNm());
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
        sb.append(c).append(getMltOutFlg());
        sb.append(c).append(getTplOutFlg());
        sb.append(c).append(getPlOutFlg());
        sb.append(c).append(getSplOutFlg());
        sb.append(c).append(getPl1OutFlg());
        sb.append(c).append(getPl2OutFlg());
        sb.append(c).append(getCaseOutFlg());
        sb.append(c).append(getInspectionOutFlg());
        sb.append(c).append(getSlOutFlg());
        sb.append(c).append(getPackingOutFlg());
        sb.append(c).append(getInvoiceCreateFlg());
        sb.append(c).append(getStwOutFlg());
        sb.append(c).append(getOplOutNm());
        sb.append(c).append(getMltOutNm());
        sb.append(c).append(getTplOutNm());
        sb.append(c).append(getPlOutNm());
        sb.append(c).append(getSplOutNm());
        sb.append(c).append(getPl1OutNm());
        sb.append(c).append(getPl2OutNm());
        sb.append(c).append(getCaseOutNm());
        sb.append(c).append(getInspectionOutNm());
        sb.append(c).append(getSlOutNm());
        sb.append(c).append(getPackingOutNm());
        sb.append(c).append(getInvoiceCreateNm());
        sb.append(c).append(getStwOutNm());
        sb.append(c).append(getPickingNum());
        sb.append(c).append(getInspectionNum());
        sb.append(c).append(getLoadingStatus());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getDelivUnitNo());
        sb.append(c).append(getDelivPlanDt());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getDelivTzNm());
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getPickingWorkMessage());
        sb.append(c).append(getPickingWorkMessageCount());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getPickingWorkNoCnt());
        sb.append(c).append(getUpdDtH());
        sb.append(c).append(getShippingStopCs());
        sb.append(c).append(getShippingStopCsNm());
        sb.append(c).append(getShippingStopPd());
        sb.append(c).append(getShippingStopPdNm());
        sb.append(c).append(getForceFixedFlg());
        sb.append(c).append(getForceFixedFlgNm());
        sb.append(c).append(getNum());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public Long getShippingInstHId() {
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {bigint(19)} <br>
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        __modifiedProperties.add("shippingInstHId");
        this._shippingInstHId = shippingInstHId;
    }

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
     * [get] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDelivCustomerCd() {
        return _delivCustomerCd;
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        __modifiedProperties.add("delivCustomerCd");
        this._delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] BOL_NO: {varchar(30)} <br>
     * @return The value of the column 'BOL_NO'. (NullAllowed)
     */
    public String getBolNo() {
        return _bolNo;
    }

    /**
     * [set] BOL_NO: {varchar(30)} <br>
     * @param bolNo The value of the column 'BOL_NO'. (NullAllowed)
     */
    public void setBolNo(String bolNo) {
        __modifiedProperties.add("bolNo");
        this._bolNo = bolNo;
    }

    /**
     * [get] BOL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'BOL_OUT_FLG'. (NullAllowed)
     */
    public String getBolOutFlg() {
        return _bolOutFlg;
    }

    /**
     * [set] BOL_OUT_FLG: {varchar(1)} <br>
     * @param bolOutFlg The value of the column 'BOL_OUT_FLG'. (NullAllowed)
     */
    public void setBolOutFlg(String bolOutFlg) {
        __modifiedProperties.add("bolOutFlg");
        this._bolOutFlg = bolOutFlg;
    }

    /**
     * [get] BOL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'BOL_OUT_NM'. (NullAllowed)
     */
    public String getBolOutNm() {
        return _bolOutNm;
    }

    /**
     * [set] BOL_OUT_NM: {int(10)} <br>
     * @param bolOutNm The value of the column 'BOL_OUT_NM'. (NullAllowed)
     */
    public void setBolOutNm(String bolOutNm) {
        __modifiedProperties.add("bolOutNm");
        this._bolOutNm = bolOutNm;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public String getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SHIPPING_STATUS: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_STATUS'. (NullAllowed)
     */
    public String getShippingStatus() {
        return _shippingStatus;
    }

    /**
     * [set] SHIPPING_STATUS: {varchar(30)} <br>
     * @param shippingStatus The value of the column 'SHIPPING_STATUS'. (NullAllowed)
     */
    public void setShippingStatus(String shippingStatus) {
        __modifiedProperties.add("shippingStatus");
        this._shippingStatus = shippingStatus;
    }

    /**
     * [get] SHIPPING_STATUS_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STATUS_NM'. (NullAllowed)
     */
    public String getShippingStatusNm() {
        return _shippingStatusNm;
    }

    /**
     * [set] SHIPPING_STATUS_NM: {int(10)} <br>
     * @param shippingStatusNm The value of the column 'SHIPPING_STATUS_NM'. (NullAllowed)
     */
    public void setShippingStatusNm(String shippingStatusNm) {
        __modifiedProperties.add("shippingStatusNm");
        this._shippingStatusNm = shippingStatusNm;
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
     * [get] STOCK_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public String getStockOutFlg() {
        return _stockOutFlg;
    }

    /**
     * [set] STOCK_OUT_FLG: {varchar(1)} <br>
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
     * [get] INSPECTION_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'INSPECTION_OUT_FLG'. (NullAllowed)
     */
    public String getInspectionOutFlg() {
        return _inspectionOutFlg;
    }

    /**
     * [set] INSPECTION_OUT_FLG: {varchar(1)} <br>
     * @param inspectionOutFlg The value of the column 'INSPECTION_OUT_FLG'. (NullAllowed)
     */
    public void setInspectionOutFlg(String inspectionOutFlg) {
        __modifiedProperties.add("inspectionOutFlg");
        this._inspectionOutFlg = inspectionOutFlg;
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
     * [get] PACKING_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PACKING_OUT_FLG'. (NullAllowed)
     */
    public String getPackingOutFlg() {
        return _packingOutFlg;
    }

    /**
     * [set] PACKING_OUT_FLG: {varchar(1)} <br>
     * @param packingOutFlg The value of the column 'PACKING_OUT_FLG'. (NullAllowed)
     */
    public void setPackingOutFlg(String packingOutFlg) {
        __modifiedProperties.add("packingOutFlg");
        this._packingOutFlg = packingOutFlg;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {varchar(1)} <br>
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public String getInvoiceCreateFlg() {
        return _invoiceCreateFlg;
    }

    /**
     * [set] INVOICE_CREATE_FLG: {varchar(1)} <br>
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        __modifiedProperties.add("invoiceCreateFlg");
        this._invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] STW_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'STW_OUT_FLG'. (NullAllowed)
     */
    public String getStwOutFlg() {
        return _stwOutFlg;
    }

    /**
     * [set] STW_OUT_FLG: {varchar(1)} <br>
     * @param stwOutFlg The value of the column 'STW_OUT_FLG'. (NullAllowed)
     */
    public void setStwOutFlg(String stwOutFlg) {
        __modifiedProperties.add("stwOutFlg");
        this._stwOutFlg = stwOutFlg;
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
     * [get] SPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'SPL_OUT_NM'. (NullAllowed)
     */
    public String getSplOutNm() {
        return _splOutNm;
    }

    /**
     * [set] SPL_OUT_NM: {int(10)} <br>
     * @param splOutNm The value of the column 'SPL_OUT_NM'. (NullAllowed)
     */
    public void setSplOutNm(String splOutNm) {
        __modifiedProperties.add("splOutNm");
        this._splOutNm = splOutNm;
    }

    /**
     * [get] PL1_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL1_OUT_NM'. (NullAllowed)
     */
    public String getPl1OutNm() {
        return _pl1OutNm;
    }

    /**
     * [set] PL1_OUT_NM: {int(10)} <br>
     * @param pl1OutNm The value of the column 'PL1_OUT_NM'. (NullAllowed)
     */
    public void setPl1OutNm(String pl1OutNm) {
        __modifiedProperties.add("pl1OutNm");
        this._pl1OutNm = pl1OutNm;
    }

    /**
     * [get] PL2_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL2_OUT_NM'. (NullAllowed)
     */
    public String getPl2OutNm() {
        return _pl2OutNm;
    }

    /**
     * [set] PL2_OUT_NM: {int(10)} <br>
     * @param pl2OutNm The value of the column 'PL2_OUT_NM'. (NullAllowed)
     */
    public void setPl2OutNm(String pl2OutNm) {
        __modifiedProperties.add("pl2OutNm");
        this._pl2OutNm = pl2OutNm;
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
     * [get] INSPECTION_OUT_NM: {int(10)} <br>
     * @return The value of the column 'INSPECTION_OUT_NM'. (NullAllowed)
     */
    public String getInspectionOutNm() {
        return _inspectionOutNm;
    }

    /**
     * [set] INSPECTION_OUT_NM: {int(10)} <br>
     * @param inspectionOutNm The value of the column 'INSPECTION_OUT_NM'. (NullAllowed)
     */
    public void setInspectionOutNm(String inspectionOutNm) {
        __modifiedProperties.add("inspectionOutNm");
        this._inspectionOutNm = inspectionOutNm;
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
     * [get] PACKING_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PACKING_OUT_NM'. (NullAllowed)
     */
    public String getPackingOutNm() {
        return _packingOutNm;
    }

    /**
     * [set] PACKING_OUT_NM: {int(10)} <br>
     * @param packingOutNm The value of the column 'PACKING_OUT_NM'. (NullAllowed)
     */
    public void setPackingOutNm(String packingOutNm) {
        __modifiedProperties.add("packingOutNm");
        this._packingOutNm = packingOutNm;
    }

    /**
     * [get] INVOICE_CREATE_NM: {int(10)} <br>
     * @return The value of the column 'INVOICE_CREATE_NM'. (NullAllowed)
     */
    public String getInvoiceCreateNm() {
        return _invoiceCreateNm;
    }

    /**
     * [set] INVOICE_CREATE_NM: {int(10)} <br>
     * @param invoiceCreateNm The value of the column 'INVOICE_CREATE_NM'. (NullAllowed)
     */
    public void setInvoiceCreateNm(String invoiceCreateNm) {
        __modifiedProperties.add("invoiceCreateNm");
        this._invoiceCreateNm = invoiceCreateNm;
    }

    /**
     * [get] STW_OUT_NM: {int(10)} <br>
     * @return The value of the column 'STW_OUT_NM'. (NullAllowed)
     */
    public String getStwOutNm() {
        return _stwOutNm;
    }

    /**
     * [set] STW_OUT_NM: {int(10)} <br>
     * @param stwOutNm The value of the column 'STW_OUT_NM'. (NullAllowed)
     */
    public void setStwOutNm(String stwOutNm) {
        __modifiedProperties.add("stwOutNm");
        this._stwOutNm = stwOutNm;
    }

    /**
     * [get] PICKING_NUM: {decimal(38)} <br>
     * @return The value of the column 'PICKING_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPickingNum() {
        return _pickingNum;
    }

    /**
     * [set] PICKING_NUM: {decimal(38)} <br>
     * @param pickingNum The value of the column 'PICKING_NUM'. (NullAllowed)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        __modifiedProperties.add("pickingNum");
        this._pickingNum = pickingNum;
    }

    /**
     * [get] INSPECTION_NUM: {decimal(38)} <br>
     * @return The value of the column 'INSPECTION_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInspectionNum() {
        return _inspectionNum;
    }

    /**
     * [set] INSPECTION_NUM: {decimal(38)} <br>
     * @param inspectionNum The value of the column 'INSPECTION_NUM'. (NullAllowed)
     */
    public void setInspectionNum(java.math.BigDecimal inspectionNum) {
        __modifiedProperties.add("inspectionNum");
        this._inspectionNum = inspectionNum;
    }

    /**
     * [get] LOADING_STATUS: {int(10)} <br>
     * @return The value of the column 'LOADING_STATUS'. (NullAllowed)
     */
    public Integer getLoadingStatus() {
        return _loadingStatus;
    }

    /**
     * [set] LOADING_STATUS: {int(10)} <br>
     * @param loadingStatus The value of the column 'LOADING_STATUS'. (NullAllowed)
     */
    public void setLoadingStatus(Integer loadingStatus) {
        __modifiedProperties.add("loadingStatus");
        this._loadingStatus = loadingStatus;
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
     * [get] DELIV_UNIT_NO: {varchar(30)} <br>
     * @return The value of the column 'DELIV_UNIT_NO'. (NullAllowed)
     */
    public String getDelivUnitNo() {
        return _delivUnitNo;
    }

    /**
     * [set] DELIV_UNIT_NO: {varchar(30)} <br>
     * @param delivUnitNo The value of the column 'DELIV_UNIT_NO'. (NullAllowed)
     */
    public void setDelivUnitNo(String delivUnitNo) {
        __modifiedProperties.add("delivUnitNo");
        this._delivUnitNo = delivUnitNo;
    }

    /**
     * [get] DELIV_PLAN_DT: {varchar(8)} <br>
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed)
     */
    public String getDelivPlanDt() {
        return _delivPlanDt;
    }

    /**
     * [set] DELIV_PLAN_DT: {varchar(8)} <br>
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        __modifiedProperties.add("delivPlanDt");
        this._delivPlanDt = delivPlanDt;
    }

    /**
     * [get] DELIV_DT: {varchar(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {varchar(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(30)} <br>
     * @return The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public String getDelivTz() {
        return _delivTz;
    }

    /**
     * [set] DELIV_TZ: {varchar(30)} <br>
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public void setDelivTz(String delivTz) {
        __modifiedProperties.add("delivTz");
        this._delivTz = delivTz;
    }

    /**
     * [get] DELIV_TZ_NM: {int(10)} <br>
     * @return The value of the column 'DELIV_TZ_NM'. (NullAllowed)
     */
    public String getDelivTzNm() {
        return _delivTzNm;
    }

    /**
     * [set] DELIV_TZ_NM: {int(10)} <br>
     * @param delivTzNm The value of the column 'DELIV_TZ_NM'. (NullAllowed)
     */
    public void setDelivTzNm(String delivTzNm) {
        __modifiedProperties.add("delivTzNm");
        this._delivTzNm = delivTzNm;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public String getMessageNm() {
        return _messageNm;
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public void setMessageNm(String messageNm) {
        __modifiedProperties.add("messageNm");
        this._messageNm = messageNm;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public String getPickingWorkMessage() {
        return _pickingWorkMessage;
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        __modifiedProperties.add("pickingWorkMessage");
        this._pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] PICKING_WORK_MESSAGE_COUNT: {int(10)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed)
     */
    public Long getPickingWorkMessageCount() {
        return _pickingWorkMessageCount;
    }

    /**
     * [set] PICKING_WORK_MESSAGE_COUNT: {int(10)} <br>
     * @param pickingWorkMessageCount The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed)
     */
    public void setPickingWorkMessageCount(Long pickingWorkMessageCount) {
        __modifiedProperties.add("pickingWorkMessageCount");
        this._pickingWorkMessageCount = pickingWorkMessageCount;
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
     * [get] PICKING_WORK_NO_CNT: {int(10)} <br>
     * @return The value of the column 'PICKING_WORK_NO_CNT'. (NullAllowed)
     */
    public Long getPickingWorkNoCnt() {
        return _pickingWorkNoCnt;
    }

    /**
     * [set] PICKING_WORK_NO_CNT: {int(10)} <br>
     * @param pickingWorkNoCnt The value of the column 'PICKING_WORK_NO_CNT'. (NullAllowed)
     */
    public void setPickingWorkNoCnt(Long pickingWorkNoCnt) {
        __modifiedProperties.add("pickingWorkNoCnt");
        this._pickingWorkNoCnt = pickingWorkNoCnt;
    }

    /**
     * [get] UPD_DT_H: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT_H'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDtH() {
        return _updDtH;
    }

    /**
     * [set] UPD_DT_H: {datetime2(26, 6)} <br>
     * @param updDtH The value of the column 'UPD_DT_H'. (NullAllowed)
     */
    public void setUpdDtH(java.sql.Timestamp updDtH) {
        __modifiedProperties.add("updDtH");
        this._updDtH = updDtH;
    }

    /**
     * [get] SHIPPING_STOP_CS: {char(1)} <br>
     * @return The value of the column 'SHIPPING_STOP_CS'. (NullAllowed)
     */
    public String getShippingStopCs() {
        return _shippingStopCs;
    }

    /**
     * [set] SHIPPING_STOP_CS: {char(1)} <br>
     * @param shippingStopCs The value of the column 'SHIPPING_STOP_CS'. (NullAllowed)
     */
    public void setShippingStopCs(String shippingStopCs) {
        __modifiedProperties.add("shippingStopCs");
        this._shippingStopCs = shippingStopCs;
    }

    /**
     * [get] SHIPPING_STOP_CS_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STOP_CS_NM'. (NullAllowed)
     */
    public String getShippingStopCsNm() {
        return _shippingStopCsNm;
    }

    /**
     * [set] SHIPPING_STOP_CS_NM: {int(10)} <br>
     * @param shippingStopCsNm The value of the column 'SHIPPING_STOP_CS_NM'. (NullAllowed)
     */
    public void setShippingStopCsNm(String shippingStopCsNm) {
        __modifiedProperties.add("shippingStopCsNm");
        this._shippingStopCsNm = shippingStopCsNm;
    }

    /**
     * [get] SHIPPING_STOP_PD: {char(1)} <br>
     * @return The value of the column 'SHIPPING_STOP_PD'. (NullAllowed)
     */
    public String getShippingStopPd() {
        return _shippingStopPd;
    }

    /**
     * [set] SHIPPING_STOP_PD: {char(1)} <br>
     * @param shippingStopPd The value of the column 'SHIPPING_STOP_PD'. (NullAllowed)
     */
    public void setShippingStopPd(String shippingStopPd) {
        __modifiedProperties.add("shippingStopPd");
        this._shippingStopPd = shippingStopPd;
    }

    /**
     * [get] SHIPPING_STOP_PD_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STOP_PD_NM'. (NullAllowed)
     */
    public String getShippingStopPdNm() {
        return _shippingStopPdNm;
    }

    /**
     * [set] SHIPPING_STOP_PD_NM: {int(10)} <br>
     * @param shippingStopPdNm The value of the column 'SHIPPING_STOP_PD_NM'. (NullAllowed)
     */
    public void setShippingStopPdNm(String shippingStopPdNm) {
        __modifiedProperties.add("shippingStopPdNm");
        this._shippingStopPdNm = shippingStopPdNm;
    }

    /**
     * [get] FORCE_FIXED_FLG: {char(1)} <br>
     * @return The value of the column 'FORCE_FIXED_FLG'. (NullAllowed)
     */
    public String getForceFixedFlg() {
        return _forceFixedFlg;
    }

    /**
     * [set] FORCE_FIXED_FLG: {char(1)} <br>
     * @param forceFixedFlg The value of the column 'FORCE_FIXED_FLG'. (NullAllowed)
     */
    public void setForceFixedFlg(String forceFixedFlg) {
        __modifiedProperties.add("forceFixedFlg");
        this._forceFixedFlg = forceFixedFlg;
    }

    /**
     * [get] FORCE_FIXED_FLG_NM: {int(10)} <br>
     * @return The value of the column 'FORCE_FIXED_FLG_NM'. (NullAllowed)
     */
    public String getForceFixedFlgNm() {
        return _forceFixedFlgNm;
    }

    /**
     * [set] FORCE_FIXED_FLG_NM: {int(10)} <br>
     * @param forceFixedFlgNm The value of the column 'FORCE_FIXED_FLG_NM'. (NullAllowed)
     */
    public void setForceFixedFlgNm(String forceFixedFlgNm) {
        __modifiedProperties.add("forceFixedFlgNm");
        this._forceFixedFlgNm = forceFixedFlgNm;
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
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

}
