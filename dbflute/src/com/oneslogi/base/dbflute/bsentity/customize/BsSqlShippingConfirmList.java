package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShippingConfirmList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     ALLOC_INST_H_ID, PICKING_H_ID, UPD_DT, PICKING, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, EMERGENCY_FLG, STOCK_OUT_FLG, WORK_DT, SHIPPING_DT, SHIPPING_H_UPD_DT, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, PICKING_BATCH_NO, PICKING_WORK_NO, PICKING_STATUS, PICKING_STATUS_NM, BOL_NO, SHIPPING_SLIP_NO, SHIPPING_H_COUNT, INST_NUM, ALLOC_NUM, PACKING_H_ID, GROSS_WEIGHT, TOTAL_VOLUME, INVOICE_CREATE_FLG, INVOICE_CREATE_FLG_NM, FORCE_FIXED_FLG, FORCE_FIXED_FLG_NM, SHIPPING_STOP_FLG, SHIPPING_STOP_FLG_NM, STOP_FLG, STOP_FLG_NM, CENTER_TRANSIT_FLG
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
 * Long allocInstHId = entity.getAllocInstHId();
 * Long pickingHId = entity.getPickingHId();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * Long picking = entity.getPicking();
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String stockOutFlg = entity.getStockOutFlg();
 * String workDt = entity.getWorkDt();
 * String shippingDt = entity.getShippingDt();
 * java.sql.Timestamp shippingHUpdDt = entity.getShippingHUpdDt();
 * String pickingTime = entity.getPickingTime();
 * String stowageTime = entity.getStowageTime();
 * String shippingTime = entity.getShippingTime();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String delivCustomerCd = entity.getDelivCustomerCd();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String pickingBatchNo = entity.getPickingBatchNo();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String pickingStatus = entity.getPickingStatus();
 * String pickingStatusNm = entity.getPickingStatusNm();
 * String bolNo = entity.getBolNo();
 * Long shippingSlipNo = entity.getShippingSlipNo();
 * Long shippingHCount = entity.getShippingHCount();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * Long packingHId = entity.getPackingHId();
 * java.math.BigDecimal grossWeight = entity.getGrossWeight();
 * java.math.BigDecimal totalVolume = entity.getTotalVolume();
 * String invoiceCreateFlg = entity.getInvoiceCreateFlg();
 * String invoiceCreateFlgNm = entity.getInvoiceCreateFlgNm();
 * String forceFixedFlg = entity.getForceFixedFlg();
 * String forceFixedFlgNm = entity.getForceFixedFlgNm();
 * String shippingStopFlg = entity.getShippingStopFlg();
 * String shippingStopFlgNm = entity.getShippingStopFlgNm();
 * String stopFlg = entity.getStopFlg();
 * String stopFlgNm = entity.getStopFlgNm();
 * String centerTransitFlg = entity.getCenterTransitFlg();
 * entity.setAllocInstHId(allocInstHId);
 * entity.setPickingHId(pickingHId);
 * entity.setUpdDt(updDt);
 * entity.setPicking(picking);
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setStockOutFlg(stockOutFlg);
 * entity.setWorkDt(workDt);
 * entity.setShippingDt(shippingDt);
 * entity.setShippingHUpdDt(shippingHUpdDt);
 * entity.setPickingTime(pickingTime);
 * entity.setStowageTime(stowageTime);
 * entity.setShippingTime(shippingTime);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setDelivCustomerCd(delivCustomerCd);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setPickingBatchNo(pickingBatchNo);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setPickingStatus(pickingStatus);
 * entity.setPickingStatusNm(pickingStatusNm);
 * entity.setBolNo(bolNo);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setShippingHCount(shippingHCount);
 * entity.setInstNum(instNum);
 * entity.setAllocNum(allocNum);
 * entity.setPackingHId(packingHId);
 * entity.setGrossWeight(grossWeight);
 * entity.setTotalVolume(totalVolume);
 * entity.setInvoiceCreateFlg(invoiceCreateFlg);
 * entity.setInvoiceCreateFlgNm(invoiceCreateFlgNm);
 * entity.setForceFixedFlg(forceFixedFlg);
 * entity.setForceFixedFlgNm(forceFixedFlgNm);
 * entity.setShippingStopFlg(shippingStopFlg);
 * entity.setShippingStopFlgNm(shippingStopFlgNm);
 * entity.setStopFlg(stopFlg);
 * entity.setStopFlgNm(stopFlgNm);
 * entity.setCenterTransitFlg(centerTransitFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShippingConfirmList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ALLOC_INST_H_ID: {bigint(19)} */
    protected Long _allocInstHId;

    /** PICKING_H_ID: {bigint(19)} */
    protected Long _pickingHId;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** PICKING: {int(10)} */
    protected Long _picking;

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

    /** EMERGENCY_FLG: {char(1)} */
    protected String _emergencyFlg;

    /** STOCK_OUT_FLG: {char(1)} */
    protected String _stockOutFlg;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** SHIPPING_DT: {varchar(8)} */
    protected String _shippingDt;

    /** SHIPPING_H_UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _shippingHUpdDt;

    /** PICKING_TIME: {varchar(60)} */
    protected String _pickingTime;

    /** STOWAGE_TIME: {varchar(60)} */
    protected String _stowageTime;

    /** SHIPPING_TIME: {varchar(60)} */
    protected String _shippingTime;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(60)} */
    protected String _carrierNm;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_CD: {varchar(30)} */
    protected String _delivCustomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** PICKING_BATCH_NO: {varchar(30)} */
    protected String _pickingBatchNo;

    /** PICKING_WORK_NO: {varchar(30)} */
    protected String _pickingWorkNo;

    /** PICKING_STATUS: {varchar(30), classification=ShippingStatus} */
    protected String _pickingStatus;

    /** PICKING_STATUS_NM: {int(10)} */
    protected String _pickingStatusNm;

    /** BOL_NO: {varchar(30)} */
    protected String _bolNo;

    /** SHIPPING_SLIP_NO: {int(10)} */
    protected Long _shippingSlipNo;

    /** SHIPPING_H_COUNT: {int(10)} */
    protected Long _shippingHCount;

    /** INST_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _instNum;

    /** ALLOC_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _allocNum;

    /** PACKING_H_ID: {int(10)} */
    protected Long _packingHId;

    /** GROSS_WEIGHT: {decimal(38, 6)} */
    protected java.math.BigDecimal _grossWeight;

    /** TOTAL_VOLUME: {decimal(38, 6)} */
    protected java.math.BigDecimal _totalVolume;

    /** INVOICE_CREATE_FLG: {varchar(1)} */
    protected String _invoiceCreateFlg;

    /** INVOICE_CREATE_FLG_NM: {int(10)} */
    protected String _invoiceCreateFlgNm;

    /** FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg} */
    protected String _forceFixedFlg;

    /** FORCE_FIXED_FLG_NM: {int(10)} */
    protected String _forceFixedFlgNm;

    /** SHIPPING_STOP_FLG: {char(1)} */
    protected String _shippingStopFlg;

    /** SHIPPING_STOP_FLG_NM: {int(10)} */
    protected String _shippingStopFlgNm;

    /** STOP_FLG: {char(1)} */
    protected String _stopFlg;

    /** STOP_FLG_NM: {int(10)} */
    protected String _stopFlgNm;

    /** CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg} */
    protected String _centerTransitFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShippingConfirmListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShippingConfirmList";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of pickingStatus as the classification of ShippingStatus. <br>
     * PICKING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * 出荷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingStatus getPickingStatusAsShippingStatus() {
        return CDef.ShippingStatus.codeOf(getPickingStatus());
    }

    /**
     * Set the value of pickingStatus as the classification of ShippingStatus. <br>
     * PICKING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPickingStatusAsShippingStatus(CDef.ShippingStatus cdef) {
        setPickingStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of forceFixedFlg as the classification of ForceFixedFlg. <br>
     * FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ForceFixedFlg getForceFixedFlgAsForceFixedFlg() {
        return CDef.ForceFixedFlg.codeOf(getForceFixedFlg());
    }

    /**
     * Set the value of forceFixedFlg as the classification of ForceFixedFlg. <br>
     * FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setForceFixedFlgAsForceFixedFlg(CDef.ForceFixedFlg cdef) {
        setForceFixedFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of centerTransitFlg as the classification of CenterTransitFlg. <br>
     * CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterTransitFlg getCenterTransitFlgAsCenterTransitFlg() {
        return CDef.CenterTransitFlg.codeOf(getCenterTransitFlg());
    }

    /**
     * Set the value of centerTransitFlg as the classification of CenterTransitFlg. <br>
     * CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg cdef) {
        setCenterTransitFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of pickingStatus as $10 (10). <br>
     * $10: 未出荷
     */
    public void setPickingStatus_$10() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$10);
    }

    /**
     * Set the value of pickingStatus as $15 (15). <br>
     * $15: 出庫指示中
     */
    public void setPickingStatus_$15() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$15);
    }

    /**
     * Set the value of pickingStatus as $20 (20). <br>
     * $20: 出庫指示解除中
     */
    public void setPickingStatus_$20() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$20);
    }

    /**
     * Set the value of pickingStatus as $25 (25). <br>
     * $25: 出庫指示済
     */
    public void setPickingStatus_$25() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$25);
    }

    /**
     * Set the value of pickingStatus as $30 (30). <br>
     * $30: ピッキング中
     */
    public void setPickingStatus_$30() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$30);
    }

    /**
     * Set the value of pickingStatus as $35 (35). <br>
     * $35: ピッキング済
     */
    public void setPickingStatus_$35() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$35);
    }

    /**
     * Set the value of pickingStatus as $40 (40). <br>
     * $40: 出荷検品中
     */
    public void setPickingStatus_$40() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$40);
    }

    /**
     * Set the value of pickingStatus as $45 (45). <br>
     * $45: 出荷検品中断
     */
    public void setPickingStatus_$45() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$45);
    }

    /**
     * Set the value of pickingStatus as $50 (50). <br>
     * $50: 出荷検品済
     */
    public void setPickingStatus_$50() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$50);
    }

    /**
     * Set the value of pickingStatus as $55 (55). <br>
     * $55: 出荷確定済
     */
    public void setPickingStatus_$55() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$55);
    }

    /**
     * Set the value of pickingStatus as $90 (90). <br>
     * $90: キャンセル
     */
    public void setPickingStatus_$90() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$90);
    }

    /**
     * Set the value of pickingStatus as $99 (99). <br>
     * $99: エラー有
     */
    public void setPickingStatus_$99() {
        setPickingStatusAsShippingStatus(CDef.ShippingStatus.$99);
    }

    /**
     * Set the value of forceFixedFlg as $0 (0). <br>
     * $0: 通常確定
     */
    public void setForceFixedFlg_$0() {
        setForceFixedFlgAsForceFixedFlg(CDef.ForceFixedFlg.$0);
    }

    /**
     * Set the value of forceFixedFlg as $1 (1). <br>
     * $1: 強制確定
     */
    public void setForceFixedFlg_$1() {
        setForceFixedFlgAsForceFixedFlg(CDef.ForceFixedFlg.$1);
    }

    /**
     * Set the value of centerTransitFlg as $0 (0). <br>
     * $0: 通常
     */
    public void setCenterTransitFlg_$0() {
        setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg.$0);
    }

    /**
     * Set the value of centerTransitFlg as $1 (1). <br>
     * $1: センタ間移動
     */
    public void setCenterTransitFlg_$1() {
        setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of pickingStatus $10? <br>
     * $10: 未出荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$10() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$10) : false;
    }

    /**
     * Is the value of pickingStatus $15? <br>
     * $15: 出庫指示中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$15() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$15) : false;
    }

    /**
     * Is the value of pickingStatus $20? <br>
     * $20: 出庫指示解除中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$20() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$20) : false;
    }

    /**
     * Is the value of pickingStatus $25? <br>
     * $25: 出庫指示済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$25() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$25) : false;
    }

    /**
     * Is the value of pickingStatus $30? <br>
     * $30: ピッキング中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$30() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$30) : false;
    }

    /**
     * Is the value of pickingStatus $35? <br>
     * $35: ピッキング済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$35() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$35) : false;
    }

    /**
     * Is the value of pickingStatus $40? <br>
     * $40: 出荷検品中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$40() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$40) : false;
    }

    /**
     * Is the value of pickingStatus $45? <br>
     * $45: 出荷検品中断
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$45() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$45) : false;
    }

    /**
     * Is the value of pickingStatus $50? <br>
     * $50: 出荷検品済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$50() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$50) : false;
    }

    /**
     * Is the value of pickingStatus $55? <br>
     * $55: 出荷確定済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$55() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$55) : false;
    }

    /**
     * Is the value of pickingStatus $90? <br>
     * $90: キャンセル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$90() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$90) : false;
    }

    /**
     * Is the value of pickingStatus $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$99() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$99) : false;
    }

    /**
     * Is the value of forceFixedFlg $0? <br>
     * $0: 通常確定
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isForceFixedFlg$0() {
        CDef.ForceFixedFlg cdef = getForceFixedFlgAsForceFixedFlg();
        return cdef != null ? cdef.equals(CDef.ForceFixedFlg.$0) : false;
    }

    /**
     * Is the value of forceFixedFlg $1? <br>
     * $1: 強制確定
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isForceFixedFlg$1() {
        CDef.ForceFixedFlg cdef = getForceFixedFlgAsForceFixedFlg();
        return cdef != null ? cdef.equals(CDef.ForceFixedFlg.$1) : false;
    }

    /**
     * Is the value of centerTransitFlg $0? <br>
     * $0: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCenterTransitFlg$0() {
        CDef.CenterTransitFlg cdef = getCenterTransitFlgAsCenterTransitFlg();
        return cdef != null ? cdef.equals(CDef.CenterTransitFlg.$0) : false;
    }

    /**
     * Is the value of centerTransitFlg $1? <br>
     * $1: センタ間移動
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCenterTransitFlg$1() {
        CDef.CenterTransitFlg cdef = getCenterTransitFlgAsCenterTransitFlg();
        return cdef != null ? cdef.equals(CDef.CenterTransitFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'pickingStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPickingStatusName() {
        CDef.ShippingStatus cdef = getPickingStatusAsShippingStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'forceFixedFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getForceFixedFlgName() {
        CDef.ForceFixedFlg cdef = getForceFixedFlgAsForceFixedFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'centerTransitFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCenterTransitFlgName() {
        CDef.CenterTransitFlg cdef = getCenterTransitFlgAsCenterTransitFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsSqlShippingConfirmList) {
            BsSqlShippingConfirmList other = (BsSqlShippingConfirmList)obj;
            if (!xSV(_allocInstHId, other._allocInstHId)) { return false; }
            if (!xSV(_pickingHId, other._pickingHId)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_picking, other._picking)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_emergencyFlg, other._emergencyFlg)) { return false; }
            if (!xSV(_stockOutFlg, other._stockOutFlg)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_shippingHUpdDt, other._shippingHUpdDt)) { return false; }
            if (!xSV(_pickingTime, other._pickingTime)) { return false; }
            if (!xSV(_stowageTime, other._stowageTime)) { return false; }
            if (!xSV(_shippingTime, other._shippingTime)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_carrierCd, other._carrierCd)) { return false; }
            if (!xSV(_carrierNm, other._carrierNm)) { return false; }
            if (!xSV(_supplyCustomerCd, other._supplyCustomerCd)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_delivCustomerCd, other._delivCustomerCd)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_pickingBatchNo, other._pickingBatchNo)) { return false; }
            if (!xSV(_pickingWorkNo, other._pickingWorkNo)) { return false; }
            if (!xSV(_pickingStatus, other._pickingStatus)) { return false; }
            if (!xSV(_pickingStatusNm, other._pickingStatusNm)) { return false; }
            if (!xSV(_bolNo, other._bolNo)) { return false; }
            if (!xSV(_shippingSlipNo, other._shippingSlipNo)) { return false; }
            if (!xSV(_shippingHCount, other._shippingHCount)) { return false; }
            if (!xSV(_instNum, other._instNum)) { return false; }
            if (!xSV(_allocNum, other._allocNum)) { return false; }
            if (!xSV(_packingHId, other._packingHId)) { return false; }
            if (!xSV(_grossWeight, other._grossWeight)) { return false; }
            if (!xSV(_totalVolume, other._totalVolume)) { return false; }
            if (!xSV(_invoiceCreateFlg, other._invoiceCreateFlg)) { return false; }
            if (!xSV(_invoiceCreateFlgNm, other._invoiceCreateFlgNm)) { return false; }
            if (!xSV(_forceFixedFlg, other._forceFixedFlg)) { return false; }
            if (!xSV(_forceFixedFlgNm, other._forceFixedFlgNm)) { return false; }
            if (!xSV(_shippingStopFlg, other._shippingStopFlg)) { return false; }
            if (!xSV(_shippingStopFlgNm, other._shippingStopFlgNm)) { return false; }
            if (!xSV(_stopFlg, other._stopFlg)) { return false; }
            if (!xSV(_stopFlgNm, other._stopFlgNm)) { return false; }
            if (!xSV(_centerTransitFlg, other._centerTransitFlg)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _allocInstHId);
        hs = xCH(hs, _pickingHId);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _picking);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _emergencyFlg);
        hs = xCH(hs, _stockOutFlg);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _shippingHUpdDt);
        hs = xCH(hs, _pickingTime);
        hs = xCH(hs, _stowageTime);
        hs = xCH(hs, _shippingTime);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _carrierCd);
        hs = xCH(hs, _carrierNm);
        hs = xCH(hs, _supplyCustomerCd);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _delivCustomerCd);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _pickingBatchNo);
        hs = xCH(hs, _pickingWorkNo);
        hs = xCH(hs, _pickingStatus);
        hs = xCH(hs, _pickingStatusNm);
        hs = xCH(hs, _bolNo);
        hs = xCH(hs, _shippingSlipNo);
        hs = xCH(hs, _shippingHCount);
        hs = xCH(hs, _instNum);
        hs = xCH(hs, _allocNum);
        hs = xCH(hs, _packingHId);
        hs = xCH(hs, _grossWeight);
        hs = xCH(hs, _totalVolume);
        hs = xCH(hs, _invoiceCreateFlg);
        hs = xCH(hs, _invoiceCreateFlgNm);
        hs = xCH(hs, _forceFixedFlg);
        hs = xCH(hs, _forceFixedFlgNm);
        hs = xCH(hs, _shippingStopFlg);
        hs = xCH(hs, _shippingStopFlgNm);
        hs = xCH(hs, _stopFlg);
        hs = xCH(hs, _stopFlgNm);
        hs = xCH(hs, _centerTransitFlg);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_picking));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_stockOutFlg));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_shippingHUpdDt));
        sb.append(dm).append(xfND(_pickingTime));
        sb.append(dm).append(xfND(_stowageTime));
        sb.append(dm).append(xfND(_shippingTime));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_delivCustomerCd));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_pickingBatchNo));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_pickingStatus));
        sb.append(dm).append(xfND(_pickingStatusNm));
        sb.append(dm).append(xfND(_bolNo));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_shippingHCount));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_packingHId));
        sb.append(dm).append(xfND(_grossWeight));
        sb.append(dm).append(xfND(_totalVolume));
        sb.append(dm).append(xfND(_invoiceCreateFlg));
        sb.append(dm).append(xfND(_invoiceCreateFlgNm));
        sb.append(dm).append(xfND(_forceFixedFlg));
        sb.append(dm).append(xfND(_forceFixedFlgNm));
        sb.append(dm).append(xfND(_shippingStopFlg));
        sb.append(dm).append(xfND(_shippingStopFlgNm));
        sb.append(dm).append(xfND(_stopFlg));
        sb.append(dm).append(xfND(_stopFlgNm));
        sb.append(dm).append(xfND(_centerTransitFlg));
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
    public SqlShippingConfirmList clone() {
        return (SqlShippingConfirmList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstHId() {
        checkSpecifiedProperty("allocInstHId");
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstHId(Long allocInstHId) {
        registerModifiedProperty("allocInstHId");
        _allocInstHId = allocInstHId;
    }

    /**
     * [get] PICKING_H_ID: {bigint(19)} <br>
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {bigint(19)} <br>
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
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
     * [get] PICKING: {int(10)} <br>
     * @return The value of the column 'PICKING'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPicking() {
        checkSpecifiedProperty("picking");
        return _picking;
    }

    /**
     * [set] PICKING: {int(10)} <br>
     * @param picking The value of the column 'PICKING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicking(Long picking) {
        registerModifiedProperty("picking");
        _picking = picking;
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
     * [get] STOCK_OUT_FLG: {char(1)} <br>
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockOutFlg() {
        checkSpecifiedProperty("stockOutFlg");
        return convertEmptyToNull(_stockOutFlg);
    }

    /**
     * [set] STOCK_OUT_FLG: {char(1)} <br>
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutFlg(String stockOutFlg) {
        registerModifiedProperty("stockOutFlg");
        _stockOutFlg = stockOutFlg;
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
     * [get] SHIPPING_H_UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'SHIPPING_H_UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getShippingHUpdDt() {
        checkSpecifiedProperty("shippingHUpdDt");
        return _shippingHUpdDt;
    }

    /**
     * [set] SHIPPING_H_UPD_DT: {datetime2(26, 6)} <br>
     * @param shippingHUpdDt The value of the column 'SHIPPING_H_UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingHUpdDt(java.sql.Timestamp shippingHUpdDt) {
        registerModifiedProperty("shippingHUpdDt");
        _shippingHUpdDt = shippingHUpdDt;
    }

    /**
     * [get] PICKING_TIME: {varchar(60)} <br>
     * @return The value of the column 'PICKING_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingTime() {
        checkSpecifiedProperty("pickingTime");
        return convertEmptyToNull(_pickingTime);
    }

    /**
     * [set] PICKING_TIME: {varchar(60)} <br>
     * @param pickingTime The value of the column 'PICKING_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingTime(String pickingTime) {
        registerModifiedProperty("pickingTime");
        _pickingTime = pickingTime;
    }

    /**
     * [get] STOWAGE_TIME: {varchar(60)} <br>
     * @return The value of the column 'STOWAGE_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getStowageTime() {
        checkSpecifiedProperty("stowageTime");
        return convertEmptyToNull(_stowageTime);
    }

    /**
     * [set] STOWAGE_TIME: {varchar(60)} <br>
     * @param stowageTime The value of the column 'STOWAGE_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStowageTime(String stowageTime) {
        registerModifiedProperty("stowageTime");
        _stowageTime = stowageTime;
    }

    /**
     * [get] SHIPPING_TIME: {varchar(60)} <br>
     * @return The value of the column 'SHIPPING_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingTime() {
        checkSpecifiedProperty("shippingTime");
        return convertEmptyToNull(_shippingTime);
    }

    /**
     * [set] SHIPPING_TIME: {varchar(60)} <br>
     * @param shippingTime The value of the column 'SHIPPING_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingTime(String shippingTime) {
        registerModifiedProperty("shippingTime");
        _shippingTime = shippingTime;
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
     * [get] PICKING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス
     * @return The value of the column 'PICKING_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingStatus() {
        checkSpecifiedProperty("pickingStatus");
        return convertEmptyToNull(_pickingStatus);
    }

    /**
     * [set] PICKING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス
     * @param pickingStatus The value of the column 'PICKING_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingStatus(String pickingStatus) {
        registerModifiedProperty("pickingStatus");
        _pickingStatus = pickingStatus;
    }

    /**
     * [get] PICKING_STATUS_NM: {int(10)} <br>
     * @return The value of the column 'PICKING_STATUS_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingStatusNm() {
        checkSpecifiedProperty("pickingStatusNm");
        return convertEmptyToNull(_pickingStatusNm);
    }

    /**
     * [set] PICKING_STATUS_NM: {int(10)} <br>
     * @param pickingStatusNm The value of the column 'PICKING_STATUS_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingStatusNm(String pickingStatusNm) {
        registerModifiedProperty("pickingStatusNm");
        _pickingStatusNm = pickingStatusNm;
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
     * [get] SHIPPING_SLIP_NO: {int(10)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {int(10)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(Long shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_H_COUNT: {int(10)} <br>
     * @return The value of the column 'SHIPPING_H_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingHCount() {
        checkSpecifiedProperty("shippingHCount");
        return _shippingHCount;
    }

    /**
     * [set] SHIPPING_H_COUNT: {int(10)} <br>
     * @param shippingHCount The value of the column 'SHIPPING_H_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingHCount(Long shippingHCount) {
        registerModifiedProperty("shippingHCount");
        _shippingHCount = shippingHCount;
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
     * [get] PACKING_H_ID: {int(10)} <br>
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPackingHId() {
        checkSpecifiedProperty("packingHId");
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {int(10)} <br>
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingHId(Long packingHId) {
        registerModifiedProperty("packingHId");
        _packingHId = packingHId;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getGrossWeight() {
        checkSpecifiedProperty("grossWeight");
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        registerModifiedProperty("grossWeight");
        _grossWeight = grossWeight;
    }

    /**
     * [get] TOTAL_VOLUME: {decimal(38, 6)} <br>
     * @return The value of the column 'TOTAL_VOLUME'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalVolume() {
        checkSpecifiedProperty("totalVolume");
        return _totalVolume;
    }

    /**
     * [set] TOTAL_VOLUME: {decimal(38, 6)} <br>
     * @param totalVolume The value of the column 'TOTAL_VOLUME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalVolume(java.math.BigDecimal totalVolume) {
        registerModifiedProperty("totalVolume");
        _totalVolume = totalVolume;
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
     * [get] INVOICE_CREATE_FLG_NM: {int(10)} <br>
     * @return The value of the column 'INVOICE_CREATE_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceCreateFlgNm() {
        checkSpecifiedProperty("invoiceCreateFlgNm");
        return convertEmptyToNull(_invoiceCreateFlgNm);
    }

    /**
     * [set] INVOICE_CREATE_FLG_NM: {int(10)} <br>
     * @param invoiceCreateFlgNm The value of the column 'INVOICE_CREATE_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateFlgNm(String invoiceCreateFlgNm) {
        registerModifiedProperty("invoiceCreateFlgNm");
        _invoiceCreateFlgNm = invoiceCreateFlgNm;
    }

    /**
     * [get] FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg} <br>
     * // cls(ForceFixedFlg) 強制確定フラグ
     * @return The value of the column 'FORCE_FIXED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForceFixedFlg() {
        checkSpecifiedProperty("forceFixedFlg");
        return convertEmptyToNull(_forceFixedFlg);
    }

    /**
     * [set] FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg} <br>
     * // cls(ForceFixedFlg) 強制確定フラグ
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
     * [get] SHIPPING_STOP_FLG: {char(1)} <br>
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopFlg() {
        checkSpecifiedProperty("shippingStopFlg");
        return convertEmptyToNull(_shippingStopFlg);
    }

    /**
     * [set] SHIPPING_STOP_FLG: {char(1)} <br>
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        registerModifiedProperty("shippingStopFlg");
        _shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG_NM: {int(10)} <br>
     * @return The value of the column 'SHIPPING_STOP_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopFlgNm() {
        checkSpecifiedProperty("shippingStopFlgNm");
        return convertEmptyToNull(_shippingStopFlgNm);
    }

    /**
     * [set] SHIPPING_STOP_FLG_NM: {int(10)} <br>
     * @param shippingStopFlgNm The value of the column 'SHIPPING_STOP_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopFlgNm(String shippingStopFlgNm) {
        registerModifiedProperty("shippingStopFlgNm");
        _shippingStopFlgNm = shippingStopFlgNm;
    }

    /**
     * [get] STOP_FLG: {char(1)} <br>
     * @return The value of the column 'STOP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStopFlg() {
        checkSpecifiedProperty("stopFlg");
        return convertEmptyToNull(_stopFlg);
    }

    /**
     * [set] STOP_FLG: {char(1)} <br>
     * @param stopFlg The value of the column 'STOP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStopFlg(String stopFlg) {
        registerModifiedProperty("stopFlg");
        _stopFlg = stopFlg;
    }

    /**
     * [get] STOP_FLG_NM: {int(10)} <br>
     * @return The value of the column 'STOP_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStopFlgNm() {
        checkSpecifiedProperty("stopFlgNm");
        return convertEmptyToNull(_stopFlgNm);
    }

    /**
     * [set] STOP_FLG_NM: {int(10)} <br>
     * @param stopFlgNm The value of the column 'STOP_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStopFlgNm(String stopFlgNm) {
        registerModifiedProperty("stopFlgNm");
        _stopFlgNm = stopFlgNm;
    }

    /**
     * [get] CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg} <br>
     * // cls(CenterTransitFlg) センタ間移動フラグ
     * @return The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterTransitFlg() {
        checkSpecifiedProperty("centerTransitFlg");
        return convertEmptyToNull(_centerTransitFlg);
    }

    /**
     * [set] CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg} <br>
     * // cls(CenterTransitFlg) センタ間移動フラグ
     * @param centerTransitFlg The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterTransitFlg(String centerTransitFlg) {
        registerModifiedProperty("centerTransitFlg");
        _centerTransitFlg = centerTransitFlg;
    }
}
