package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShippingInstList. <br>
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInstHId = entity.getShippingInstHId();
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String workDt = entity.getWorkDt();
 * String shippingDt = entity.getShippingDt();
 * String pickingBatchNo = entity.getPickingBatchNo();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String delivCustomerCd = entity.getDelivCustomerCd();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String bolNo = entity.getBolNo();
 * String bolOutFlg = entity.getBolOutFlg();
 * String bolOutNm = entity.getBolOutNm();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String clientShippingNo = entity.getClientShippingNo();
 * String shippingStatus = entity.getShippingStatus();
 * String shippingStatusNm = entity.getShippingStatusNm();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * Long slipNo = entity.getSlipNo();
 * Long lineNo = entity.getLineNo();
 * Long productId = entity.getProductId();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * String stockOutFlg = entity.getStockOutFlg();
 * String oplOutFlg = entity.getOplOutFlg();
 * String mltOutFlg = entity.getMltOutFlg();
 * String tplOutFlg = entity.getTplOutFlg();
 * String plOutFlg = entity.getPlOutFlg();
 * String splOutFlg = entity.getSplOutFlg();
 * String pl1OutFlg = entity.getPl1OutFlg();
 * String pl2OutFlg = entity.getPl2OutFlg();
 * String caseOutFlg = entity.getCaseOutFlg();
 * String inspectionOutFlg = entity.getInspectionOutFlg();
 * String slOutFlg = entity.getSlOutFlg();
 * String packingOutFlg = entity.getPackingOutFlg();
 * String invoiceCreateFlg = entity.getInvoiceCreateFlg();
 * String stwOutFlg = entity.getStwOutFlg();
 * String oplOutNm = entity.getOplOutNm();
 * String mltOutNm = entity.getMltOutNm();
 * String tplOutNm = entity.getTplOutNm();
 * String plOutNm = entity.getPlOutNm();
 * String splOutNm = entity.getSplOutNm();
 * String pl1OutNm = entity.getPl1OutNm();
 * String pl2OutNm = entity.getPl2OutNm();
 * String caseOutNm = entity.getCaseOutNm();
 * String inspectionOutNm = entity.getInspectionOutNm();
 * String slOutNm = entity.getSlOutNm();
 * String packingOutNm = entity.getPackingOutNm();
 * String invoiceCreateNm = entity.getInvoiceCreateNm();
 * String stwOutNm = entity.getStwOutNm();
 * java.math.BigDecimal pickingNum = entity.getPickingNum();
 * java.math.BigDecimal inspectionNum = entity.getInspectionNum();
 * Integer loadingStatus = entity.getLoadingStatus();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String delivUnitNo = entity.getDelivUnitNo();
 * String delivPlanDt = entity.getDelivPlanDt();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * String delivTzNm = entity.getDelivTzNm();
 * String messageNm = entity.getMessageNm();
 * String pickingWorkMessage = entity.getPickingWorkMessage();
 * Long pickingWorkMessageCount = entity.getPickingWorkMessageCount();
 * String emergencyFlg = entity.getEmergencyFlg();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * Long pickingWorkNoCnt = entity.getPickingWorkNoCnt();
 * java.sql.Timestamp updDtH = entity.getUpdDtH();
 * String shippingStopCs = entity.getShippingStopCs();
 * String shippingStopCsNm = entity.getShippingStopCsNm();
 * String shippingStopPd = entity.getShippingStopPd();
 * String shippingStopPdNm = entity.getShippingStopPdNm();
 * String forceFixedFlg = entity.getForceFixedFlg();
 * String forceFixedFlgNm = entity.getForceFixedFlgNm();
 * Long num = entity.getNum();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * entity.setShippingInstHId(shippingInstHId);
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setWorkDt(workDt);
 * entity.setShippingDt(shippingDt);
 * entity.setPickingBatchNo(pickingBatchNo);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setDelivCustomerCd(delivCustomerCd);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setBolNo(bolNo);
 * entity.setBolOutFlg(bolOutFlg);
 * entity.setBolOutNm(bolOutNm);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setShippingStatus(shippingStatus);
 * entity.setShippingStatusNm(shippingStatusNm);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setSlipNo(slipNo);
 * entity.setLineNo(lineNo);
 * entity.setProductId(productId);
 * entity.setInstNum(instNum);
 * entity.setAllocNum(allocNum);
 * entity.setStockOutFlg(stockOutFlg);
 * entity.setOplOutFlg(oplOutFlg);
 * entity.setMltOutFlg(mltOutFlg);
 * entity.setTplOutFlg(tplOutFlg);
 * entity.setPlOutFlg(plOutFlg);
 * entity.setSplOutFlg(splOutFlg);
 * entity.setPl1OutFlg(pl1OutFlg);
 * entity.setPl2OutFlg(pl2OutFlg);
 * entity.setCaseOutFlg(caseOutFlg);
 * entity.setInspectionOutFlg(inspectionOutFlg);
 * entity.setSlOutFlg(slOutFlg);
 * entity.setPackingOutFlg(packingOutFlg);
 * entity.setInvoiceCreateFlg(invoiceCreateFlg);
 * entity.setStwOutFlg(stwOutFlg);
 * entity.setOplOutNm(oplOutNm);
 * entity.setMltOutNm(mltOutNm);
 * entity.setTplOutNm(tplOutNm);
 * entity.setPlOutNm(plOutNm);
 * entity.setSplOutNm(splOutNm);
 * entity.setPl1OutNm(pl1OutNm);
 * entity.setPl2OutNm(pl2OutNm);
 * entity.setCaseOutNm(caseOutNm);
 * entity.setInspectionOutNm(inspectionOutNm);
 * entity.setSlOutNm(slOutNm);
 * entity.setPackingOutNm(packingOutNm);
 * entity.setInvoiceCreateNm(invoiceCreateNm);
 * entity.setStwOutNm(stwOutNm);
 * entity.setPickingNum(pickingNum);
 * entity.setInspectionNum(inspectionNum);
 * entity.setLoadingStatus(loadingStatus);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setDelivUnitNo(delivUnitNo);
 * entity.setDelivPlanDt(delivPlanDt);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setDelivTzNm(delivTzNm);
 * entity.setMessageNm(messageNm);
 * entity.setPickingWorkMessage(pickingWorkMessage);
 * entity.setPickingWorkMessageCount(pickingWorkMessageCount);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setUpdDt(updDt);
 * entity.setPickingWorkNoCnt(pickingWorkNoCnt);
 * entity.setUpdDtH(updDtH);
 * entity.setShippingStopCs(shippingStopCs);
 * entity.setShippingStopCsNm(shippingStopCsNm);
 * entity.setShippingStopPd(shippingStopPd);
 * entity.setShippingStopPdNm(shippingStopPdNm);
 * entity.setForceFixedFlg(forceFixedFlg);
 * entity.setForceFixedFlgNm(forceFixedFlgNm);
 * entity.setNum(num);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShippingInstList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_H_ID: {bigint(19)} */
    protected Long _shippingInstHId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** SHIPPING_DT: {varchar(8)} */
    protected String _shippingDt;

    /** PICKING_BATCH_NO: {varchar(30)} */
    protected String _pickingBatchNo;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_CD: {varchar(30)} */
    protected String _delivCustomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** BOL_NO: {varchar(30)} */
    protected String _bolNo;

    /** BOL_OUT_FLG: {varchar(1)} */
    protected String _bolOutFlg;

    /** BOL_OUT_NM: {int(10)} */
    protected String _bolOutNm;

    /** SHIPPING_SLIP_NO: {varchar(30)} */
    protected String _shippingSlipNo;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    protected String _clientShippingNo;

    /** SHIPPING_STATUS: {varchar(30)} */
    protected String _shippingStatus;

    /** SHIPPING_STATUS_NM: {int(10)} */
    protected String _shippingStatusNm;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(60)} */
    protected String _carrierNm;

    /** SLIP_NO: {int(10)} */
    protected Long _slipNo;

    /** LINE_NO: {int(10)} */
    protected Long _lineNo;

    /** PRODUCT_ID: {int(10)} */
    protected Long _productId;

    /** INST_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _instNum;

    /** ALLOC_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _allocNum;

    /** STOCK_OUT_FLG: {varchar(1)} */
    protected String _stockOutFlg;

    /** OPL_OUT_FLG: {varchar(1)} */
    protected String _oplOutFlg;

    /** MLT_OUT_FLG: {varchar(1)} */
    protected String _mltOutFlg;

    /** TPL_OUT_FLG: {varchar(1)} */
    protected String _tplOutFlg;

    /** PL_OUT_FLG: {varchar(1)} */
    protected String _plOutFlg;

    /** SPL_OUT_FLG: {varchar(1)} */
    protected String _splOutFlg;

    /** PL1_OUT_FLG: {varchar(1)} */
    protected String _pl1OutFlg;

    /** PL2_OUT_FLG: {varchar(1)} */
    protected String _pl2OutFlg;

    /** CASE_OUT_FLG: {varchar(1)} */
    protected String _caseOutFlg;

    /** INSPECTION_OUT_FLG: {varchar(1)} */
    protected String _inspectionOutFlg;

    /** SL_OUT_FLG: {varchar(1)} */
    protected String _slOutFlg;

    /** PACKING_OUT_FLG: {varchar(1)} */
    protected String _packingOutFlg;

    /** INVOICE_CREATE_FLG: {varchar(1)} */
    protected String _invoiceCreateFlg;

    /** STW_OUT_FLG: {varchar(1)} */
    protected String _stwOutFlg;

    /** OPL_OUT_NM: {int(10)} */
    protected String _oplOutNm;

    /** MLT_OUT_NM: {int(10)} */
    protected String _mltOutNm;

    /** TPL_OUT_NM: {int(10)} */
    protected String _tplOutNm;

    /** PL_OUT_NM: {int(10)} */
    protected String _plOutNm;

    /** SPL_OUT_NM: {int(10)} */
    protected String _splOutNm;

    /** PL1_OUT_NM: {int(10)} */
    protected String _pl1OutNm;

    /** PL2_OUT_NM: {int(10)} */
    protected String _pl2OutNm;

    /** CASE_OUT_NM: {int(10)} */
    protected String _caseOutNm;

    /** INSPECTION_OUT_NM: {int(10)} */
    protected String _inspectionOutNm;

    /** SL_OUT_NM: {int(10)} */
    protected String _slOutNm;

    /** PACKING_OUT_NM: {int(10)} */
    protected String _packingOutNm;

    /** INVOICE_CREATE_NM: {int(10)} */
    protected String _invoiceCreateNm;

    /** STW_OUT_NM: {int(10)} */
    protected String _stwOutNm;

    /** PICKING_NUM: {decimal(38)} */
    protected java.math.BigDecimal _pickingNum;

    /** INSPECTION_NUM: {decimal(38)} */
    protected java.math.BigDecimal _inspectionNum;

    /** LOADING_STATUS: {int(10)} */
    protected Integer _loadingStatus;

    /** PICKING_WORK_NO: {varchar(30)} */
    protected String _pickingWorkNo;

    /** DELIV_UNIT_NO: {varchar(30)} */
    protected String _delivUnitNo;

    /** DELIV_PLAN_DT: {varchar(8)} */
    protected String _delivPlanDt;

    /** DELIV_DT: {varchar(8)} */
    protected String _delivDt;

    /** DELIV_TZ: {varchar(30)} */
    protected String _delivTz;

    /** DELIV_TZ_NM: {int(10)} */
    protected String _delivTzNm;

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** PICKING_WORK_MESSAGE: {varchar(255)} */
    protected String _pickingWorkMessage;

    /** PICKING_WORK_MESSAGE_COUNT: {int(10)} */
    protected Long _pickingWorkMessageCount;

    /** EMERGENCY_FLG: {char(1)} */
    protected String _emergencyFlg;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** PICKING_WORK_NO_CNT: {int(10)} */
    protected Long _pickingWorkNoCnt;

    /** UPD_DT_H: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDtH;

    /** SHIPPING_STOP_CS: {char(1)} */
    protected String _shippingStopCs;

    /** SHIPPING_STOP_CS_NM: {int(10)} */
    protected String _shippingStopCsNm;

    /** SHIPPING_STOP_PD: {char(1)} */
    protected String _shippingStopPd;

    /** SHIPPING_STOP_PD_NM: {int(10)} */
    protected String _shippingStopPdNm;

    /** FORCE_FIXED_FLG: {char(1)} */
    protected String _forceFixedFlg;

    /** FORCE_FIXED_FLG_NM: {int(10)} */
    protected String _forceFixedFlgNm;

    /** NUM: {int(10)} */
    protected Long _num;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShippingInstListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShippingInstList";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlShippingInstList) {
            BsSqlShippingInstList other = (BsSqlShippingInstList)obj;
            if (!xSV(_shippingInstHId, other._shippingInstHId)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_pickingBatchNo, other._pickingBatchNo)) { return false; }
            if (!xSV(_supplyCustomerCd, other._supplyCustomerCd)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_delivCustomerCd, other._delivCustomerCd)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_bolNo, other._bolNo)) { return false; }
            if (!xSV(_bolOutFlg, other._bolOutFlg)) { return false; }
            if (!xSV(_bolOutNm, other._bolOutNm)) { return false; }
            if (!xSV(_shippingSlipNo, other._shippingSlipNo)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            if (!xSV(_shippingStatus, other._shippingStatus)) { return false; }
            if (!xSV(_shippingStatusNm, other._shippingStatusNm)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_carrierCd, other._carrierCd)) { return false; }
            if (!xSV(_carrierNm, other._carrierNm)) { return false; }
            if (!xSV(_slipNo, other._slipNo)) { return false; }
            if (!xSV(_lineNo, other._lineNo)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_instNum, other._instNum)) { return false; }
            if (!xSV(_allocNum, other._allocNum)) { return false; }
            if (!xSV(_stockOutFlg, other._stockOutFlg)) { return false; }
            if (!xSV(_oplOutFlg, other._oplOutFlg)) { return false; }
            if (!xSV(_mltOutFlg, other._mltOutFlg)) { return false; }
            if (!xSV(_tplOutFlg, other._tplOutFlg)) { return false; }
            if (!xSV(_plOutFlg, other._plOutFlg)) { return false; }
            if (!xSV(_splOutFlg, other._splOutFlg)) { return false; }
            if (!xSV(_pl1OutFlg, other._pl1OutFlg)) { return false; }
            if (!xSV(_pl2OutFlg, other._pl2OutFlg)) { return false; }
            if (!xSV(_caseOutFlg, other._caseOutFlg)) { return false; }
            if (!xSV(_inspectionOutFlg, other._inspectionOutFlg)) { return false; }
            if (!xSV(_slOutFlg, other._slOutFlg)) { return false; }
            if (!xSV(_packingOutFlg, other._packingOutFlg)) { return false; }
            if (!xSV(_invoiceCreateFlg, other._invoiceCreateFlg)) { return false; }
            if (!xSV(_stwOutFlg, other._stwOutFlg)) { return false; }
            if (!xSV(_oplOutNm, other._oplOutNm)) { return false; }
            if (!xSV(_mltOutNm, other._mltOutNm)) { return false; }
            if (!xSV(_tplOutNm, other._tplOutNm)) { return false; }
            if (!xSV(_plOutNm, other._plOutNm)) { return false; }
            if (!xSV(_splOutNm, other._splOutNm)) { return false; }
            if (!xSV(_pl1OutNm, other._pl1OutNm)) { return false; }
            if (!xSV(_pl2OutNm, other._pl2OutNm)) { return false; }
            if (!xSV(_caseOutNm, other._caseOutNm)) { return false; }
            if (!xSV(_inspectionOutNm, other._inspectionOutNm)) { return false; }
            if (!xSV(_slOutNm, other._slOutNm)) { return false; }
            if (!xSV(_packingOutNm, other._packingOutNm)) { return false; }
            if (!xSV(_invoiceCreateNm, other._invoiceCreateNm)) { return false; }
            if (!xSV(_stwOutNm, other._stwOutNm)) { return false; }
            if (!xSV(_pickingNum, other._pickingNum)) { return false; }
            if (!xSV(_inspectionNum, other._inspectionNum)) { return false; }
            if (!xSV(_loadingStatus, other._loadingStatus)) { return false; }
            if (!xSV(_pickingWorkNo, other._pickingWorkNo)) { return false; }
            if (!xSV(_delivUnitNo, other._delivUnitNo)) { return false; }
            if (!xSV(_delivPlanDt, other._delivPlanDt)) { return false; }
            if (!xSV(_delivDt, other._delivDt)) { return false; }
            if (!xSV(_delivTz, other._delivTz)) { return false; }
            if (!xSV(_delivTzNm, other._delivTzNm)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_pickingWorkMessage, other._pickingWorkMessage)) { return false; }
            if (!xSV(_pickingWorkMessageCount, other._pickingWorkMessageCount)) { return false; }
            if (!xSV(_emergencyFlg, other._emergencyFlg)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_pickingWorkNoCnt, other._pickingWorkNoCnt)) { return false; }
            if (!xSV(_updDtH, other._updDtH)) { return false; }
            if (!xSV(_shippingStopCs, other._shippingStopCs)) { return false; }
            if (!xSV(_shippingStopCsNm, other._shippingStopCsNm)) { return false; }
            if (!xSV(_shippingStopPd, other._shippingStopPd)) { return false; }
            if (!xSV(_shippingStopPdNm, other._shippingStopPdNm)) { return false; }
            if (!xSV(_forceFixedFlg, other._forceFixedFlg)) { return false; }
            if (!xSV(_forceFixedFlgNm, other._forceFixedFlgNm)) { return false; }
            if (!xSV(_num, other._num)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstHId);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _pickingBatchNo);
        hs = xCH(hs, _supplyCustomerCd);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _delivCustomerCd);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _bolNo);
        hs = xCH(hs, _bolOutFlg);
        hs = xCH(hs, _bolOutNm);
        hs = xCH(hs, _shippingSlipNo);
        hs = xCH(hs, _clientShippingNo);
        hs = xCH(hs, _shippingStatus);
        hs = xCH(hs, _shippingStatusNm);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _carrierCd);
        hs = xCH(hs, _carrierNm);
        hs = xCH(hs, _slipNo);
        hs = xCH(hs, _lineNo);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _instNum);
        hs = xCH(hs, _allocNum);
        hs = xCH(hs, _stockOutFlg);
        hs = xCH(hs, _oplOutFlg);
        hs = xCH(hs, _mltOutFlg);
        hs = xCH(hs, _tplOutFlg);
        hs = xCH(hs, _plOutFlg);
        hs = xCH(hs, _splOutFlg);
        hs = xCH(hs, _pl1OutFlg);
        hs = xCH(hs, _pl2OutFlg);
        hs = xCH(hs, _caseOutFlg);
        hs = xCH(hs, _inspectionOutFlg);
        hs = xCH(hs, _slOutFlg);
        hs = xCH(hs, _packingOutFlg);
        hs = xCH(hs, _invoiceCreateFlg);
        hs = xCH(hs, _stwOutFlg);
        hs = xCH(hs, _oplOutNm);
        hs = xCH(hs, _mltOutNm);
        hs = xCH(hs, _tplOutNm);
        hs = xCH(hs, _plOutNm);
        hs = xCH(hs, _splOutNm);
        hs = xCH(hs, _pl1OutNm);
        hs = xCH(hs, _pl2OutNm);
        hs = xCH(hs, _caseOutNm);
        hs = xCH(hs, _inspectionOutNm);
        hs = xCH(hs, _slOutNm);
        hs = xCH(hs, _packingOutNm);
        hs = xCH(hs, _invoiceCreateNm);
        hs = xCH(hs, _stwOutNm);
        hs = xCH(hs, _pickingNum);
        hs = xCH(hs, _inspectionNum);
        hs = xCH(hs, _loadingStatus);
        hs = xCH(hs, _pickingWorkNo);
        hs = xCH(hs, _delivUnitNo);
        hs = xCH(hs, _delivPlanDt);
        hs = xCH(hs, _delivDt);
        hs = xCH(hs, _delivTz);
        hs = xCH(hs, _delivTzNm);
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _pickingWorkMessage);
        hs = xCH(hs, _pickingWorkMessageCount);
        hs = xCH(hs, _emergencyFlg);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _pickingWorkNoCnt);
        hs = xCH(hs, _updDtH);
        hs = xCH(hs, _shippingStopCs);
        hs = xCH(hs, _shippingStopCsNm);
        hs = xCH(hs, _shippingStopPd);
        hs = xCH(hs, _shippingStopPdNm);
        hs = xCH(hs, _forceFixedFlg);
        hs = xCH(hs, _forceFixedFlgNm);
        hs = xCH(hs, _num);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_pickingBatchNo));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_delivCustomerCd));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_bolNo));
        sb.append(dm).append(xfND(_bolOutFlg));
        sb.append(dm).append(xfND(_bolOutNm));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_shippingStatus));
        sb.append(dm).append(xfND(_shippingStatusNm));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_slipNo));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_stockOutFlg));
        sb.append(dm).append(xfND(_oplOutFlg));
        sb.append(dm).append(xfND(_mltOutFlg));
        sb.append(dm).append(xfND(_tplOutFlg));
        sb.append(dm).append(xfND(_plOutFlg));
        sb.append(dm).append(xfND(_splOutFlg));
        sb.append(dm).append(xfND(_pl1OutFlg));
        sb.append(dm).append(xfND(_pl2OutFlg));
        sb.append(dm).append(xfND(_caseOutFlg));
        sb.append(dm).append(xfND(_inspectionOutFlg));
        sb.append(dm).append(xfND(_slOutFlg));
        sb.append(dm).append(xfND(_packingOutFlg));
        sb.append(dm).append(xfND(_invoiceCreateFlg));
        sb.append(dm).append(xfND(_stwOutFlg));
        sb.append(dm).append(xfND(_oplOutNm));
        sb.append(dm).append(xfND(_mltOutNm));
        sb.append(dm).append(xfND(_tplOutNm));
        sb.append(dm).append(xfND(_plOutNm));
        sb.append(dm).append(xfND(_splOutNm));
        sb.append(dm).append(xfND(_pl1OutNm));
        sb.append(dm).append(xfND(_pl2OutNm));
        sb.append(dm).append(xfND(_caseOutNm));
        sb.append(dm).append(xfND(_inspectionOutNm));
        sb.append(dm).append(xfND(_slOutNm));
        sb.append(dm).append(xfND(_packingOutNm));
        sb.append(dm).append(xfND(_invoiceCreateNm));
        sb.append(dm).append(xfND(_stwOutNm));
        sb.append(dm).append(xfND(_pickingNum));
        sb.append(dm).append(xfND(_inspectionNum));
        sb.append(dm).append(xfND(_loadingStatus));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_delivUnitNo));
        sb.append(dm).append(xfND(_delivPlanDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_delivTzNm));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_pickingWorkMessage));
        sb.append(dm).append(xfND(_pickingWorkMessageCount));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_pickingWorkNoCnt));
        sb.append(dm).append(xfND(_updDtH));
        sb.append(dm).append(xfND(_shippingStopCs));
        sb.append(dm).append(xfND(_shippingStopCsNm));
        sb.append(dm).append(xfND(_shippingStopPd));
        sb.append(dm).append(xfND(_shippingStopPdNm));
        sb.append(dm).append(xfND(_forceFixedFlg));
        sb.append(dm).append(xfND(_forceFixedFlgNm));
        sb.append(dm).append(xfND(_num));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlShippingInstList clone() {
        return (SqlShippingInstList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingInstHId() {
        checkSpecifiedProperty("shippingInstHId");
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {bigint(19)} <br>
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        registerModifiedProperty("shippingInstHId");
        _shippingInstHId = shippingInstHId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] SHIPPING_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {varchar(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] PICKING_BATCH_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingBatchNo() {
        checkSpecifiedProperty("pickingBatchNo");
        return convertEmptyToNull(_pickingBatchNo);
    }

    /**
     * [set] PICKING_BATCH_NO: {varchar(30)} <br>
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        registerModifiedProperty("pickingBatchNo");
        _pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerCd() {
        checkSpecifiedProperty("delivCustomerCd");
        return convertEmptyToNull(_delivCustomerCd);
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        registerModifiedProperty("delivCustomerCd");
        _delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] BOL_NO: {varchar(30)} <br>
     * @return The value of the column 'BOL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBolNo() {
        checkSpecifiedProperty("bolNo");
        return convertEmptyToNull(_bolNo);
    }

    /**
     * [set] BOL_NO: {varchar(30)} <br>
     * @param bolNo The value of the column 'BOL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolNo(String bolNo) {
        registerModifiedProperty("bolNo");
        _bolNo = bolNo;
    }

    /**
     * [get] BOL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'BOL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getBolOutFlg() {
        checkSpecifiedProperty("bolOutFlg");
        return convertEmptyToNull(_bolOutFlg);
    }

    /**
     * [set] BOL_OUT_FLG: {varchar(1)} <br>
     * @param bolOutFlg The value of the column 'BOL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolOutFlg(String bolOutFlg) {
        registerModifiedProperty("bolOutFlg");
        _bolOutFlg = bolOutFlg;
    }

    /**
     * [get] BOL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'BOL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBolOutNm() {
        checkSpecifiedProperty("bolOutNm");
        return convertEmptyToNull(_bolOutNm);
    }

    /**
     * [set] BOL_OUT_NM: {int(10)} <br>
     * @param bolOutNm The value of the column 'BOL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolOutNm(String bolOutNm) {
        registerModifiedProperty("bolOutNm");
        _bolOutNm = bolOutNm;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return convertEmptyToNull(_shippingSlipNo);
    }

    /**
     * [set] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SHIPPING_STATUS: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStatus() {
        checkSpecifiedProperty("shippingStatus");
        return convertEmptyToNull(_shippingStatus);
    }

    /**
     * [set] SHIPPING_STATUS: {varchar(30)} <br>
     * @param shippingStatus The value of the column 'SHIPPING_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStatus(String shippingStatus) {
        registerModifiedProperty("shippingStatus");
        _shippingStatus = shippingStatus;
    }

    /**
     * [get] SHIPPING_STATUS_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STATUS_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStatusNm() {
        checkSpecifiedProperty("shippingStatusNm");
        return convertEmptyToNull(_shippingStatusNm);
    }

    /**
     * [set] SHIPPING_STATUS_NM: {int(10)} <br>
     * @param shippingStatusNm The value of the column 'SHIPPING_STATUS_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStatusNm(String shippingStatusNm) {
        registerModifiedProperty("shippingStatusNm");
        _shippingStatusNm = shippingStatusNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {varchar(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {varchar(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] SLIP_NO: {int(10)} <br>
     * @return The value of the column 'SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlipNo() {
        checkSpecifiedProperty("slipNo");
        return _slipNo;
    }

    /**
     * [set] SLIP_NO: {int(10)} <br>
     * @param slipNo The value of the column 'SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipNo(Long slipNo) {
        registerModifiedProperty("slipNo");
        _slipNo = slipNo;
    }

    /**
     * [get] LINE_NO: {int(10)} <br>
     * @return The value of the column 'LINE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {int(10)} <br>
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
    }

    /**
     * [get] PRODUCT_ID: {int(10)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {int(10)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] INST_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'INST_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInstNum() {
        checkSpecifiedProperty("instNum");
        return _instNum;
    }

    /**
     * [set] INST_NUM: {decimal(38, 6)} <br>
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] ALLOC_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocNum() {
        checkSpecifiedProperty("allocNum");
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {decimal(38, 6)} <br>
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        registerModifiedProperty("allocNum");
        _allocNum = allocNum;
    }

    /**
     * [get] STOCK_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockOutFlg() {
        checkSpecifiedProperty("stockOutFlg");
        return convertEmptyToNull(_stockOutFlg);
    }

    /**
     * [set] STOCK_OUT_FLG: {varchar(1)} <br>
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutFlg(String stockOutFlg) {
        registerModifiedProperty("stockOutFlg");
        _stockOutFlg = stockOutFlg;
    }

    /**
     * [get] OPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'OPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOplOutFlg() {
        checkSpecifiedProperty("oplOutFlg");
        return convertEmptyToNull(_oplOutFlg);
    }

    /**
     * [set] OPL_OUT_FLG: {varchar(1)} <br>
     * @param oplOutFlg The value of the column 'OPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOplOutFlg(String oplOutFlg) {
        registerModifiedProperty("oplOutFlg");
        _oplOutFlg = oplOutFlg;
    }

    /**
     * [get] MLT_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'MLT_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMltOutFlg() {
        checkSpecifiedProperty("mltOutFlg");
        return convertEmptyToNull(_mltOutFlg);
    }

    /**
     * [set] MLT_OUT_FLG: {varchar(1)} <br>
     * @param mltOutFlg The value of the column 'MLT_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMltOutFlg(String mltOutFlg) {
        registerModifiedProperty("mltOutFlg");
        _mltOutFlg = mltOutFlg;
    }

    /**
     * [get] TPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'TPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTplOutFlg() {
        checkSpecifiedProperty("tplOutFlg");
        return convertEmptyToNull(_tplOutFlg);
    }

    /**
     * [set] TPL_OUT_FLG: {varchar(1)} <br>
     * @param tplOutFlg The value of the column 'TPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTplOutFlg(String tplOutFlg) {
        registerModifiedProperty("tplOutFlg");
        _tplOutFlg = tplOutFlg;
    }

    /**
     * [get] PL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlOutFlg() {
        checkSpecifiedProperty("plOutFlg");
        return convertEmptyToNull(_plOutFlg);
    }

    /**
     * [set] PL_OUT_FLG: {varchar(1)} <br>
     * @param plOutFlg The value of the column 'PL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlOutFlg(String plOutFlg) {
        registerModifiedProperty("plOutFlg");
        _plOutFlg = plOutFlg;
    }

    /**
     * [get] SPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'SPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplOutFlg() {
        checkSpecifiedProperty("splOutFlg");
        return convertEmptyToNull(_splOutFlg);
    }

    /**
     * [set] SPL_OUT_FLG: {varchar(1)} <br>
     * @param splOutFlg The value of the column 'SPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplOutFlg(String splOutFlg) {
        registerModifiedProperty("splOutFlg");
        _splOutFlg = splOutFlg;
    }

    /**
     * [get] PL1_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL1_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPl1OutFlg() {
        checkSpecifiedProperty("pl1OutFlg");
        return convertEmptyToNull(_pl1OutFlg);
    }

    /**
     * [set] PL1_OUT_FLG: {varchar(1)} <br>
     * @param pl1OutFlg The value of the column 'PL1_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl1OutFlg(String pl1OutFlg) {
        registerModifiedProperty("pl1OutFlg");
        _pl1OutFlg = pl1OutFlg;
    }

    /**
     * [get] PL2_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL2_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPl2OutFlg() {
        checkSpecifiedProperty("pl2OutFlg");
        return convertEmptyToNull(_pl2OutFlg);
    }

    /**
     * [set] PL2_OUT_FLG: {varchar(1)} <br>
     * @param pl2OutFlg The value of the column 'PL2_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl2OutFlg(String pl2OutFlg) {
        registerModifiedProperty("pl2OutFlg");
        _pl2OutFlg = pl2OutFlg;
    }

    /**
     * [get] CASE_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'CASE_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseOutFlg() {
        checkSpecifiedProperty("caseOutFlg");
        return convertEmptyToNull(_caseOutFlg);
    }

    /**
     * [set] CASE_OUT_FLG: {varchar(1)} <br>
     * @param caseOutFlg The value of the column 'CASE_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutFlg(String caseOutFlg) {
        registerModifiedProperty("caseOutFlg");
        _caseOutFlg = caseOutFlg;
    }

    /**
     * [get] INSPECTION_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'INSPECTION_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectionOutFlg() {
        checkSpecifiedProperty("inspectionOutFlg");
        return convertEmptyToNull(_inspectionOutFlg);
    }

    /**
     * [set] INSPECTION_OUT_FLG: {varchar(1)} <br>
     * @param inspectionOutFlg The value of the column 'INSPECTION_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionOutFlg(String inspectionOutFlg) {
        registerModifiedProperty("inspectionOutFlg");
        _inspectionOutFlg = inspectionOutFlg;
    }

    /**
     * [get] SL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'SL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlOutFlg() {
        checkSpecifiedProperty("slOutFlg");
        return convertEmptyToNull(_slOutFlg);
    }

    /**
     * [set] SL_OUT_FLG: {varchar(1)} <br>
     * @param slOutFlg The value of the column 'SL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlOutFlg(String slOutFlg) {
        registerModifiedProperty("slOutFlg");
        _slOutFlg = slOutFlg;
    }

    /**
     * [get] PACKING_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PACKING_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingOutFlg() {
        checkSpecifiedProperty("packingOutFlg");
        return convertEmptyToNull(_packingOutFlg);
    }

    /**
     * [set] PACKING_OUT_FLG: {varchar(1)} <br>
     * @param packingOutFlg The value of the column 'PACKING_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingOutFlg(String packingOutFlg) {
        registerModifiedProperty("packingOutFlg");
        _packingOutFlg = packingOutFlg;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {varchar(1)} <br>
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceCreateFlg() {
        checkSpecifiedProperty("invoiceCreateFlg");
        return convertEmptyToNull(_invoiceCreateFlg);
    }

    /**
     * [set] INVOICE_CREATE_FLG: {varchar(1)} <br>
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        registerModifiedProperty("invoiceCreateFlg");
        _invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] STW_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'STW_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStwOutFlg() {
        checkSpecifiedProperty("stwOutFlg");
        return convertEmptyToNull(_stwOutFlg);
    }

    /**
     * [set] STW_OUT_FLG: {varchar(1)} <br>
     * @param stwOutFlg The value of the column 'STW_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStwOutFlg(String stwOutFlg) {
        registerModifiedProperty("stwOutFlg");
        _stwOutFlg = stwOutFlg;
    }

    /**
     * [get] OPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'OPL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOplOutNm() {
        checkSpecifiedProperty("oplOutNm");
        return convertEmptyToNull(_oplOutNm);
    }

    /**
     * [set] OPL_OUT_NM: {int(10)} <br>
     * @param oplOutNm The value of the column 'OPL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOplOutNm(String oplOutNm) {
        registerModifiedProperty("oplOutNm");
        _oplOutNm = oplOutNm;
    }

    /**
     * [get] MLT_OUT_NM: {int(10)} <br>
     * @return The value of the column 'MLT_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMltOutNm() {
        checkSpecifiedProperty("mltOutNm");
        return convertEmptyToNull(_mltOutNm);
    }

    /**
     * [set] MLT_OUT_NM: {int(10)} <br>
     * @param mltOutNm The value of the column 'MLT_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMltOutNm(String mltOutNm) {
        registerModifiedProperty("mltOutNm");
        _mltOutNm = mltOutNm;
    }

    /**
     * [get] TPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'TPL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTplOutNm() {
        checkSpecifiedProperty("tplOutNm");
        return convertEmptyToNull(_tplOutNm);
    }

    /**
     * [set] TPL_OUT_NM: {int(10)} <br>
     * @param tplOutNm The value of the column 'TPL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTplOutNm(String tplOutNm) {
        registerModifiedProperty("tplOutNm");
        _tplOutNm = tplOutNm;
    }

    /**
     * [get] PL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlOutNm() {
        checkSpecifiedProperty("plOutNm");
        return convertEmptyToNull(_plOutNm);
    }

    /**
     * [set] PL_OUT_NM: {int(10)} <br>
     * @param plOutNm The value of the column 'PL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlOutNm(String plOutNm) {
        registerModifiedProperty("plOutNm");
        _plOutNm = plOutNm;
    }

    /**
     * [get] SPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'SPL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplOutNm() {
        checkSpecifiedProperty("splOutNm");
        return convertEmptyToNull(_splOutNm);
    }

    /**
     * [set] SPL_OUT_NM: {int(10)} <br>
     * @param splOutNm The value of the column 'SPL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplOutNm(String splOutNm) {
        registerModifiedProperty("splOutNm");
        _splOutNm = splOutNm;
    }

    /**
     * [get] PL1_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL1_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPl1OutNm() {
        checkSpecifiedProperty("pl1OutNm");
        return convertEmptyToNull(_pl1OutNm);
    }

    /**
     * [set] PL1_OUT_NM: {int(10)} <br>
     * @param pl1OutNm The value of the column 'PL1_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl1OutNm(String pl1OutNm) {
        registerModifiedProperty("pl1OutNm");
        _pl1OutNm = pl1OutNm;
    }

    /**
     * [get] PL2_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL2_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPl2OutNm() {
        checkSpecifiedProperty("pl2OutNm");
        return convertEmptyToNull(_pl2OutNm);
    }

    /**
     * [set] PL2_OUT_NM: {int(10)} <br>
     * @param pl2OutNm The value of the column 'PL2_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl2OutNm(String pl2OutNm) {
        registerModifiedProperty("pl2OutNm");
        _pl2OutNm = pl2OutNm;
    }

    /**
     * [get] CASE_OUT_NM: {int(10)} <br>
     * @return The value of the column 'CASE_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseOutNm() {
        checkSpecifiedProperty("caseOutNm");
        return convertEmptyToNull(_caseOutNm);
    }

    /**
     * [set] CASE_OUT_NM: {int(10)} <br>
     * @param caseOutNm The value of the column 'CASE_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutNm(String caseOutNm) {
        registerModifiedProperty("caseOutNm");
        _caseOutNm = caseOutNm;
    }

    /**
     * [get] INSPECTION_OUT_NM: {int(10)} <br>
     * @return The value of the column 'INSPECTION_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectionOutNm() {
        checkSpecifiedProperty("inspectionOutNm");
        return convertEmptyToNull(_inspectionOutNm);
    }

    /**
     * [set] INSPECTION_OUT_NM: {int(10)} <br>
     * @param inspectionOutNm The value of the column 'INSPECTION_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionOutNm(String inspectionOutNm) {
        registerModifiedProperty("inspectionOutNm");
        _inspectionOutNm = inspectionOutNm;
    }

    /**
     * [get] SL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'SL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlOutNm() {
        checkSpecifiedProperty("slOutNm");
        return convertEmptyToNull(_slOutNm);
    }

    /**
     * [set] SL_OUT_NM: {int(10)} <br>
     * @param slOutNm The value of the column 'SL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlOutNm(String slOutNm) {
        registerModifiedProperty("slOutNm");
        _slOutNm = slOutNm;
    }

    /**
     * [get] PACKING_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PACKING_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingOutNm() {
        checkSpecifiedProperty("packingOutNm");
        return convertEmptyToNull(_packingOutNm);
    }

    /**
     * [set] PACKING_OUT_NM: {int(10)} <br>
     * @param packingOutNm The value of the column 'PACKING_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingOutNm(String packingOutNm) {
        registerModifiedProperty("packingOutNm");
        _packingOutNm = packingOutNm;
    }

    /**
     * [get] INVOICE_CREATE_NM: {int(10)} <br>
     * @return The value of the column 'INVOICE_CREATE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceCreateNm() {
        checkSpecifiedProperty("invoiceCreateNm");
        return convertEmptyToNull(_invoiceCreateNm);
    }

    /**
     * [set] INVOICE_CREATE_NM: {int(10)} <br>
     * @param invoiceCreateNm The value of the column 'INVOICE_CREATE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateNm(String invoiceCreateNm) {
        registerModifiedProperty("invoiceCreateNm");
        _invoiceCreateNm = invoiceCreateNm;
    }

    /**
     * [get] STW_OUT_NM: {int(10)} <br>
     * @return The value of the column 'STW_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStwOutNm() {
        checkSpecifiedProperty("stwOutNm");
        return convertEmptyToNull(_stwOutNm);
    }

    /**
     * [set] STW_OUT_NM: {int(10)} <br>
     * @param stwOutNm The value of the column 'STW_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStwOutNm(String stwOutNm) {
        registerModifiedProperty("stwOutNm");
        _stwOutNm = stwOutNm;
    }

    /**
     * [get] PICKING_NUM: {decimal(38)} <br>
     * @return The value of the column 'PICKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickingNum() {
        checkSpecifiedProperty("pickingNum");
        return _pickingNum;
    }

    /**
     * [set] PICKING_NUM: {decimal(38)} <br>
     * @param pickingNum The value of the column 'PICKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        registerModifiedProperty("pickingNum");
        _pickingNum = pickingNum;
    }

    /**
     * [get] INSPECTION_NUM: {decimal(38)} <br>
     * @return The value of the column 'INSPECTION_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInspectionNum() {
        checkSpecifiedProperty("inspectionNum");
        return _inspectionNum;
    }

    /**
     * [set] INSPECTION_NUM: {decimal(38)} <br>
     * @param inspectionNum The value of the column 'INSPECTION_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionNum(java.math.BigDecimal inspectionNum) {
        registerModifiedProperty("inspectionNum");
        _inspectionNum = inspectionNum;
    }

    /**
     * [get] LOADING_STATUS: {int(10)} <br>
     * @return The value of the column 'LOADING_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getLoadingStatus() {
        checkSpecifiedProperty("loadingStatus");
        return _loadingStatus;
    }

    /**
     * [set] LOADING_STATUS: {int(10)} <br>
     * @param loadingStatus The value of the column 'LOADING_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoadingStatus(Integer loadingStatus) {
        registerModifiedProperty("loadingStatus");
        _loadingStatus = loadingStatus;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] DELIV_UNIT_NO: {varchar(30)} <br>
     * @return The value of the column 'DELIV_UNIT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivUnitNo() {
        checkSpecifiedProperty("delivUnitNo");
        return convertEmptyToNull(_delivUnitNo);
    }

    /**
     * [set] DELIV_UNIT_NO: {varchar(30)} <br>
     * @param delivUnitNo The value of the column 'DELIV_UNIT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivUnitNo(String delivUnitNo) {
        registerModifiedProperty("delivUnitNo");
        _delivUnitNo = delivUnitNo;
    }

    /**
     * [get] DELIV_PLAN_DT: {varchar(8)} <br>
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivPlanDt() {
        checkSpecifiedProperty("delivPlanDt");
        return convertEmptyToNull(_delivPlanDt);
    }

    /**
     * [set] DELIV_PLAN_DT: {varchar(8)} <br>
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        registerModifiedProperty("delivPlanDt");
        _delivPlanDt = delivPlanDt;
    }

    /**
     * [get] DELIV_DT: {varchar(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {varchar(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(30)} <br>
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {varchar(30)} <br>
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] DELIV_TZ_NM: {int(10)} <br>
     * @return The value of the column 'DELIV_TZ_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTzNm() {
        checkSpecifiedProperty("delivTzNm");
        return convertEmptyToNull(_delivTzNm);
    }

    /**
     * [set] DELIV_TZ_NM: {int(10)} <br>
     * @param delivTzNm The value of the column 'DELIV_TZ_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTzNm(String delivTzNm) {
        registerModifiedProperty("delivTzNm");
        _delivTzNm = delivTzNm;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageNm() {
        checkSpecifiedProperty("messageNm");
        return convertEmptyToNull(_messageNm);
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageNm(String messageNm) {
        registerModifiedProperty("messageNm");
        _messageNm = messageNm;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkMessage() {
        checkSpecifiedProperty("pickingWorkMessage");
        return convertEmptyToNull(_pickingWorkMessage);
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        registerModifiedProperty("pickingWorkMessage");
        _pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] PICKING_WORK_MESSAGE_COUNT: {int(10)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingWorkMessageCount() {
        checkSpecifiedProperty("pickingWorkMessageCount");
        return _pickingWorkMessageCount;
    }

    /**
     * [set] PICKING_WORK_MESSAGE_COUNT: {int(10)} <br>
     * @param pickingWorkMessageCount The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessageCount(Long pickingWorkMessageCount) {
        registerModifiedProperty("pickingWorkMessageCount");
        _pickingWorkMessageCount = pickingWorkMessageCount;
    }

    /**
     * [get] EMERGENCY_FLG: {char(1)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {char(1)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] PICKING_WORK_NO_CNT: {int(10)} <br>
     * @return The value of the column 'PICKING_WORK_NO_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingWorkNoCnt() {
        checkSpecifiedProperty("pickingWorkNoCnt");
        return _pickingWorkNoCnt;
    }

    /**
     * [set] PICKING_WORK_NO_CNT: {int(10)} <br>
     * @param pickingWorkNoCnt The value of the column 'PICKING_WORK_NO_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNoCnt(Long pickingWorkNoCnt) {
        registerModifiedProperty("pickingWorkNoCnt");
        _pickingWorkNoCnt = pickingWorkNoCnt;
    }

    /**
     * [get] UPD_DT_H: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT_H'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDtH() {
        checkSpecifiedProperty("updDtH");
        return _updDtH;
    }

    /**
     * [set] UPD_DT_H: {datetime2(26, 6)} <br>
     * @param updDtH The value of the column 'UPD_DT_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDtH(java.sql.Timestamp updDtH) {
        registerModifiedProperty("updDtH");
        _updDtH = updDtH;
    }

    /**
     * [get] SHIPPING_STOP_CS: {char(1)} <br>
     * @return The value of the column 'SHIPPING_STOP_CS'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopCs() {
        checkSpecifiedProperty("shippingStopCs");
        return convertEmptyToNull(_shippingStopCs);
    }

    /**
     * [set] SHIPPING_STOP_CS: {char(1)} <br>
     * @param shippingStopCs The value of the column 'SHIPPING_STOP_CS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopCs(String shippingStopCs) {
        registerModifiedProperty("shippingStopCs");
        _shippingStopCs = shippingStopCs;
    }

    /**
     * [get] SHIPPING_STOP_CS_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STOP_CS_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopCsNm() {
        checkSpecifiedProperty("shippingStopCsNm");
        return convertEmptyToNull(_shippingStopCsNm);
    }

    /**
     * [set] SHIPPING_STOP_CS_NM: {int(10)} <br>
     * @param shippingStopCsNm The value of the column 'SHIPPING_STOP_CS_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopCsNm(String shippingStopCsNm) {
        registerModifiedProperty("shippingStopCsNm");
        _shippingStopCsNm = shippingStopCsNm;
    }

    /**
     * [get] SHIPPING_STOP_PD: {char(1)} <br>
     * @return The value of the column 'SHIPPING_STOP_PD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopPd() {
        checkSpecifiedProperty("shippingStopPd");
        return convertEmptyToNull(_shippingStopPd);
    }

    /**
     * [set] SHIPPING_STOP_PD: {char(1)} <br>
     * @param shippingStopPd The value of the column 'SHIPPING_STOP_PD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopPd(String shippingStopPd) {
        registerModifiedProperty("shippingStopPd");
        _shippingStopPd = shippingStopPd;
    }

    /**
     * [get] SHIPPING_STOP_PD_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STOP_PD_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopPdNm() {
        checkSpecifiedProperty("shippingStopPdNm");
        return convertEmptyToNull(_shippingStopPdNm);
    }

    /**
     * [set] SHIPPING_STOP_PD_NM: {int(10)} <br>
     * @param shippingStopPdNm The value of the column 'SHIPPING_STOP_PD_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopPdNm(String shippingStopPdNm) {
        registerModifiedProperty("shippingStopPdNm");
        _shippingStopPdNm = shippingStopPdNm;
    }

    /**
     * [get] FORCE_FIXED_FLG: {char(1)} <br>
     * @return The value of the column 'FORCE_FIXED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForceFixedFlg() {
        checkSpecifiedProperty("forceFixedFlg");
        return convertEmptyToNull(_forceFixedFlg);
    }

    /**
     * [set] FORCE_FIXED_FLG: {char(1)} <br>
     * @param forceFixedFlg The value of the column 'FORCE_FIXED_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForceFixedFlg(String forceFixedFlg) {
        registerModifiedProperty("forceFixedFlg");
        _forceFixedFlg = forceFixedFlg;
    }

    /**
     * [get] FORCE_FIXED_FLG_NM: {int(10)} <br>
     * @return The value of the column 'FORCE_FIXED_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getForceFixedFlgNm() {
        checkSpecifiedProperty("forceFixedFlgNm");
        return convertEmptyToNull(_forceFixedFlgNm);
    }

    /**
     * [set] FORCE_FIXED_FLG_NM: {int(10)} <br>
     * @param forceFixedFlgNm The value of the column 'FORCE_FIXED_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForceFixedFlgNm(String forceFixedFlgNm) {
        registerModifiedProperty("forceFixedFlgNm");
        _forceFixedFlgNm = forceFixedFlgNm;
    }

    /**
     * [get] NUM: {int(10)} <br>
     * @return The value of the column 'NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNum() {
        checkSpecifiedProperty("num");
        return _num;
    }

    /**
     * [set] NUM: {int(10)} <br>
     * @param num The value of the column 'NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum(Long num) {
        registerModifiedProperty("num");
        _num = num;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }
}
