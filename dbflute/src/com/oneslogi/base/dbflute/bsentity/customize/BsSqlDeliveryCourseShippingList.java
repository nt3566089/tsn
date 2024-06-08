package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlDeliveryCourseShippingList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, EMERGENCY_FLG, ERROR_FLG, CANCEL_FLG, STOCK_OUT_FLG, WORK_DT, SHIPPING_DT, MAX_UPD_DT, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, COUNT_SUPPLY_CUSTOMER_CD, PICKING_BATCH_NO, SHIPPING_STATUS, SHIPPING_STATUS_MAX, SHIPPING_STATUS_NM, SHIPPING_SLIP_NO, NUM, TSIH_NUM, COUNT_PRODUCT_CD, INST_NUM, ALLOC_NUM, COUNT_SHIPPING_PACKING_NO, SUM_GROSS_WEIGHT, PIC_LIST_STATUS1, PIC_LIST_STATUS2, CHK_STATUS, INVOICE_CREATE, PACKING_OUT, LOADING_STATUS, SHIPPING_FIXED
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
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String errorFlg = entity.getErrorFlg();
 * String cancelFlg = entity.getCancelFlg();
 * String stockOutFlg = entity.getStockOutFlg();
 * String workDt = entity.getWorkDt();
 * String shippingDt = entity.getShippingDt();
 * java.sql.Timestamp maxUpdDt = entity.getMaxUpdDt();
 * String pickingTime = entity.getPickingTime();
 * String stowageTime = entity.getStowageTime();
 * String shippingTime = entity.getShippingTime();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * Long countSupplyCustomerCd = entity.getCountSupplyCustomerCd();
 * String pickingBatchNo = entity.getPickingBatchNo();
 * String shippingStatus = entity.getShippingStatus();
 * String shippingStatusMax = entity.getShippingStatusMax();
 * String shippingStatusNm = entity.getShippingStatusNm();
 * Integer shippingSlipNo = entity.getShippingSlipNo();
 * Integer num = entity.getNum();
 * Long tsihNum = entity.getTsihNum();
 * Integer countProductCd = entity.getCountProductCd();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * Integer countShippingPackingNo = entity.getCountShippingPackingNo();
 * java.math.BigDecimal sumGrossWeight = entity.getSumGrossWeight();
 * Integer picListStatus1 = entity.getPicListStatus1();
 * Integer picListStatus2 = entity.getPicListStatus2();
 * Integer chkStatus = entity.getChkStatus();
 * Integer invoiceCreate = entity.getInvoiceCreate();
 * Integer packingOut = entity.getPackingOut();
 * Integer loadingStatus = entity.getLoadingStatus();
 * Integer shippingFixed = entity.getShippingFixed();
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setCancelFlg(cancelFlg);
 * entity.setStockOutFlg(stockOutFlg);
 * entity.setWorkDt(workDt);
 * entity.setShippingDt(shippingDt);
 * entity.setMaxUpdDt(maxUpdDt);
 * entity.setPickingTime(pickingTime);
 * entity.setStowageTime(stowageTime);
 * entity.setShippingTime(shippingTime);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setCountSupplyCustomerCd(countSupplyCustomerCd);
 * entity.setPickingBatchNo(pickingBatchNo);
 * entity.setShippingStatus(shippingStatus);
 * entity.setShippingStatusMax(shippingStatusMax);
 * entity.setShippingStatusNm(shippingStatusNm);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setNum(num);
 * entity.setTsihNum(tsihNum);
 * entity.setCountProductCd(countProductCd);
 * entity.setInstNum(instNum);
 * entity.setAllocNum(allocNum);
 * entity.setCountShippingPackingNo(countShippingPackingNo);
 * entity.setSumGrossWeight(sumGrossWeight);
 * entity.setPicListStatus1(picListStatus1);
 * entity.setPicListStatus2(picListStatus2);
 * entity.setChkStatus(chkStatus);
 * entity.setInvoiceCreate(invoiceCreate);
 * entity.setPackingOut(packingOut);
 * entity.setLoadingStatus(loadingStatus);
 * entity.setShippingFixed(shippingFixed);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlDeliveryCourseShippingList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
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

    /** ERROR_FLG: {varchar(1)} */
    protected String _errorFlg;

    /** CANCEL_FLG: {varchar(1)} */
    protected String _cancelFlg;

    /** STOCK_OUT_FLG: {varchar(1)} */
    protected String _stockOutFlg;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** SHIPPING_DT: {varchar(8)} */
    protected String _shippingDt;

    /** MAX_UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _maxUpdDt;

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

    /** COUNT_SUPPLY_CUSTOMER_CD: {int(10)} */
    protected Long _countSupplyCustomerCd;

    /** PICKING_BATCH_NO: {varchar(30)} */
    protected String _pickingBatchNo;

    /** SHIPPING_STATUS: {varchar(30), classification=ShippingStatus} */
    protected String _shippingStatus;

    /** SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus} */
    protected String _shippingStatusMax;

    /** SHIPPING_STATUS_NM: {int(10)} */
    protected String _shippingStatusNm;

    /** SHIPPING_SLIP_NO: {int(10)} */
    protected Integer _shippingSlipNo;

    /** NUM: {int(10)} */
    protected Integer _num;

    /** TSIH_NUM: {int(10)} */
    protected Long _tsihNum;

    /** COUNT_PRODUCT_CD: {int(10)} */
    protected Integer _countProductCd;

    /** INST_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _instNum;

    /** ALLOC_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _allocNum;

    /** COUNT_SHIPPING_PACKING_NO: {int(10)} */
    protected Integer _countShippingPackingNo;

    /** SUM_GROSS_WEIGHT: {decimal(38, 6)} */
    protected java.math.BigDecimal _sumGrossWeight;

    /** PIC_LIST_STATUS1: {int(10)} */
    protected Integer _picListStatus1;

    /** PIC_LIST_STATUS2: {int(10)} */
    protected Integer _picListStatus2;

    /** CHK_STATUS: {int(10)} */
    protected Integer _chkStatus;

    /** INVOICE_CREATE: {int(10)} */
    protected Integer _invoiceCreate;

    /** PACKING_OUT: {int(10)} */
    protected Integer _packingOut;

    /** LOADING_STATUS: {int(10)} */
    protected Integer _loadingStatus;

    /** SHIPPING_FIXED: {int(10)} */
    protected Integer _shippingFixed;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlDeliveryCourseShippingListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlDeliveryCourseShippingList";
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
     * Get the value of shippingStatus as the classification of ShippingStatus. <br>
     * SHIPPING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * 出荷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingStatus getShippingStatusAsShippingStatus() {
        return CDef.ShippingStatus.codeOf(getShippingStatus());
    }

    /**
     * Set the value of shippingStatus as the classification of ShippingStatus. <br>
     * SHIPPING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingStatusAsShippingStatus(CDef.ShippingStatus cdef) {
        setShippingStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of shippingStatusMax as the classification of ShippingStatus. <br>
     * SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus} <br>
     * 出荷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingStatus getShippingStatusMaxAsShippingStatus() {
        return CDef.ShippingStatus.codeOf(getShippingStatusMax());
    }

    /**
     * Set the value of shippingStatusMax as the classification of ShippingStatus. <br>
     * SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus cdef) {
        setShippingStatusMax(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of shippingStatus as $10 (10). <br>
     * $10: 未出荷
     */
    public void setShippingStatus_$10() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$10);
    }

    /**
     * Set the value of shippingStatus as $15 (15). <br>
     * $15: 出庫指示中
     */
    public void setShippingStatus_$15() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$15);
    }

    /**
     * Set the value of shippingStatus as $20 (20). <br>
     * $20: 出庫指示解除中
     */
    public void setShippingStatus_$20() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$20);
    }

    /**
     * Set the value of shippingStatus as $25 (25). <br>
     * $25: 出庫指示済
     */
    public void setShippingStatus_$25() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$25);
    }

    /**
     * Set the value of shippingStatus as $30 (30). <br>
     * $30: ピッキング中
     */
    public void setShippingStatus_$30() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$30);
    }

    /**
     * Set the value of shippingStatus as $35 (35). <br>
     * $35: ピッキング済
     */
    public void setShippingStatus_$35() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$35);
    }

    /**
     * Set the value of shippingStatus as $40 (40). <br>
     * $40: 出荷検品中
     */
    public void setShippingStatus_$40() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$40);
    }

    /**
     * Set the value of shippingStatus as $45 (45). <br>
     * $45: 出荷検品中断
     */
    public void setShippingStatus_$45() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$45);
    }

    /**
     * Set the value of shippingStatus as $50 (50). <br>
     * $50: 出荷検品済
     */
    public void setShippingStatus_$50() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$50);
    }

    /**
     * Set the value of shippingStatus as $55 (55). <br>
     * $55: 出荷確定済
     */
    public void setShippingStatus_$55() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$55);
    }

    /**
     * Set the value of shippingStatus as $90 (90). <br>
     * $90: キャンセル
     */
    public void setShippingStatus_$90() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$90);
    }

    /**
     * Set the value of shippingStatus as $99 (99). <br>
     * $99: エラー有
     */
    public void setShippingStatus_$99() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$99);
    }

    /**
     * Set the value of shippingStatusMax as $10 (10). <br>
     * $10: 未出荷
     */
    public void setShippingStatusMax_$10() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$10);
    }

    /**
     * Set the value of shippingStatusMax as $15 (15). <br>
     * $15: 出庫指示中
     */
    public void setShippingStatusMax_$15() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$15);
    }

    /**
     * Set the value of shippingStatusMax as $20 (20). <br>
     * $20: 出庫指示解除中
     */
    public void setShippingStatusMax_$20() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$20);
    }

    /**
     * Set the value of shippingStatusMax as $25 (25). <br>
     * $25: 出庫指示済
     */
    public void setShippingStatusMax_$25() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$25);
    }

    /**
     * Set the value of shippingStatusMax as $30 (30). <br>
     * $30: ピッキング中
     */
    public void setShippingStatusMax_$30() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$30);
    }

    /**
     * Set the value of shippingStatusMax as $35 (35). <br>
     * $35: ピッキング済
     */
    public void setShippingStatusMax_$35() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$35);
    }

    /**
     * Set the value of shippingStatusMax as $40 (40). <br>
     * $40: 出荷検品中
     */
    public void setShippingStatusMax_$40() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$40);
    }

    /**
     * Set the value of shippingStatusMax as $45 (45). <br>
     * $45: 出荷検品中断
     */
    public void setShippingStatusMax_$45() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$45);
    }

    /**
     * Set the value of shippingStatusMax as $50 (50). <br>
     * $50: 出荷検品済
     */
    public void setShippingStatusMax_$50() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$50);
    }

    /**
     * Set the value of shippingStatusMax as $55 (55). <br>
     * $55: 出荷確定済
     */
    public void setShippingStatusMax_$55() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$55);
    }

    /**
     * Set the value of shippingStatusMax as $90 (90). <br>
     * $90: キャンセル
     */
    public void setShippingStatusMax_$90() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$90);
    }

    /**
     * Set the value of shippingStatusMax as $99 (99). <br>
     * $99: エラー有
     */
    public void setShippingStatusMax_$99() {
        setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.$99);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of shippingStatus $10? <br>
     * $10: 未出荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$10() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$10) : false;
    }

    /**
     * Is the value of shippingStatus $15? <br>
     * $15: 出庫指示中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$15() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$15) : false;
    }

    /**
     * Is the value of shippingStatus $20? <br>
     * $20: 出庫指示解除中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$20() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$20) : false;
    }

    /**
     * Is the value of shippingStatus $25? <br>
     * $25: 出庫指示済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$25() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$25) : false;
    }

    /**
     * Is the value of shippingStatus $30? <br>
     * $30: ピッキング中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$30() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$30) : false;
    }

    /**
     * Is the value of shippingStatus $35? <br>
     * $35: ピッキング済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$35() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$35) : false;
    }

    /**
     * Is the value of shippingStatus $40? <br>
     * $40: 出荷検品中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$40() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$40) : false;
    }

    /**
     * Is the value of shippingStatus $45? <br>
     * $45: 出荷検品中断
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$45() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$45) : false;
    }

    /**
     * Is the value of shippingStatus $50? <br>
     * $50: 出荷検品済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$50() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$50) : false;
    }

    /**
     * Is the value of shippingStatus $55? <br>
     * $55: 出荷確定済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$55() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$55) : false;
    }

    /**
     * Is the value of shippingStatus $90? <br>
     * $90: キャンセル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$90() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$90) : false;
    }

    /**
     * Is the value of shippingStatus $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$99() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$99) : false;
    }

    /**
     * Is the value of shippingStatusMax $10? <br>
     * $10: 未出荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$10() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$10) : false;
    }

    /**
     * Is the value of shippingStatusMax $15? <br>
     * $15: 出庫指示中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$15() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$15) : false;
    }

    /**
     * Is the value of shippingStatusMax $20? <br>
     * $20: 出庫指示解除中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$20() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$20) : false;
    }

    /**
     * Is the value of shippingStatusMax $25? <br>
     * $25: 出庫指示済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$25() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$25) : false;
    }

    /**
     * Is the value of shippingStatusMax $30? <br>
     * $30: ピッキング中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$30() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$30) : false;
    }

    /**
     * Is the value of shippingStatusMax $35? <br>
     * $35: ピッキング済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$35() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$35) : false;
    }

    /**
     * Is the value of shippingStatusMax $40? <br>
     * $40: 出荷検品中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$40() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$40) : false;
    }

    /**
     * Is the value of shippingStatusMax $45? <br>
     * $45: 出荷検品中断
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$45() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$45) : false;
    }

    /**
     * Is the value of shippingStatusMax $50? <br>
     * $50: 出荷検品済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$50() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$50) : false;
    }

    /**
     * Is the value of shippingStatusMax $55? <br>
     * $55: 出荷確定済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$55() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$55) : false;
    }

    /**
     * Is the value of shippingStatusMax $90? <br>
     * $90: キャンセル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$90() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$90) : false;
    }

    /**
     * Is the value of shippingStatusMax $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatusMax$99() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$99) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'shippingStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingStatusName() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'shippingStatusMax' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingStatusMaxName() {
        CDef.ShippingStatus cdef = getShippingStatusMaxAsShippingStatus();
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
        if (obj instanceof BsSqlDeliveryCourseShippingList) {
            BsSqlDeliveryCourseShippingList other = (BsSqlDeliveryCourseShippingList)obj;
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_emergencyFlg, other._emergencyFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_cancelFlg, other._cancelFlg)) { return false; }
            if (!xSV(_stockOutFlg, other._stockOutFlg)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_maxUpdDt, other._maxUpdDt)) { return false; }
            if (!xSV(_pickingTime, other._pickingTime)) { return false; }
            if (!xSV(_stowageTime, other._stowageTime)) { return false; }
            if (!xSV(_shippingTime, other._shippingTime)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_carrierCd, other._carrierCd)) { return false; }
            if (!xSV(_carrierNm, other._carrierNm)) { return false; }
            if (!xSV(_countSupplyCustomerCd, other._countSupplyCustomerCd)) { return false; }
            if (!xSV(_pickingBatchNo, other._pickingBatchNo)) { return false; }
            if (!xSV(_shippingStatus, other._shippingStatus)) { return false; }
            if (!xSV(_shippingStatusMax, other._shippingStatusMax)) { return false; }
            if (!xSV(_shippingStatusNm, other._shippingStatusNm)) { return false; }
            if (!xSV(_shippingSlipNo, other._shippingSlipNo)) { return false; }
            if (!xSV(_num, other._num)) { return false; }
            if (!xSV(_tsihNum, other._tsihNum)) { return false; }
            if (!xSV(_countProductCd, other._countProductCd)) { return false; }
            if (!xSV(_instNum, other._instNum)) { return false; }
            if (!xSV(_allocNum, other._allocNum)) { return false; }
            if (!xSV(_countShippingPackingNo, other._countShippingPackingNo)) { return false; }
            if (!xSV(_sumGrossWeight, other._sumGrossWeight)) { return false; }
            if (!xSV(_picListStatus1, other._picListStatus1)) { return false; }
            if (!xSV(_picListStatus2, other._picListStatus2)) { return false; }
            if (!xSV(_chkStatus, other._chkStatus)) { return false; }
            if (!xSV(_invoiceCreate, other._invoiceCreate)) { return false; }
            if (!xSV(_packingOut, other._packingOut)) { return false; }
            if (!xSV(_loadingStatus, other._loadingStatus)) { return false; }
            if (!xSV(_shippingFixed, other._shippingFixed)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _emergencyFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _cancelFlg);
        hs = xCH(hs, _stockOutFlg);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _maxUpdDt);
        hs = xCH(hs, _pickingTime);
        hs = xCH(hs, _stowageTime);
        hs = xCH(hs, _shippingTime);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _carrierCd);
        hs = xCH(hs, _carrierNm);
        hs = xCH(hs, _countSupplyCustomerCd);
        hs = xCH(hs, _pickingBatchNo);
        hs = xCH(hs, _shippingStatus);
        hs = xCH(hs, _shippingStatusMax);
        hs = xCH(hs, _shippingStatusNm);
        hs = xCH(hs, _shippingSlipNo);
        hs = xCH(hs, _num);
        hs = xCH(hs, _tsihNum);
        hs = xCH(hs, _countProductCd);
        hs = xCH(hs, _instNum);
        hs = xCH(hs, _allocNum);
        hs = xCH(hs, _countShippingPackingNo);
        hs = xCH(hs, _sumGrossWeight);
        hs = xCH(hs, _picListStatus1);
        hs = xCH(hs, _picListStatus2);
        hs = xCH(hs, _chkStatus);
        hs = xCH(hs, _invoiceCreate);
        hs = xCH(hs, _packingOut);
        hs = xCH(hs, _loadingStatus);
        hs = xCH(hs, _shippingFixed);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_cancelFlg));
        sb.append(dm).append(xfND(_stockOutFlg));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_maxUpdDt));
        sb.append(dm).append(xfND(_pickingTime));
        sb.append(dm).append(xfND(_stowageTime));
        sb.append(dm).append(xfND(_shippingTime));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_countSupplyCustomerCd));
        sb.append(dm).append(xfND(_pickingBatchNo));
        sb.append(dm).append(xfND(_shippingStatus));
        sb.append(dm).append(xfND(_shippingStatusMax));
        sb.append(dm).append(xfND(_shippingStatusNm));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_num));
        sb.append(dm).append(xfND(_tsihNum));
        sb.append(dm).append(xfND(_countProductCd));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_countShippingPackingNo));
        sb.append(dm).append(xfND(_sumGrossWeight));
        sb.append(dm).append(xfND(_picListStatus1));
        sb.append(dm).append(xfND(_picListStatus2));
        sb.append(dm).append(xfND(_chkStatus));
        sb.append(dm).append(xfND(_invoiceCreate));
        sb.append(dm).append(xfND(_packingOut));
        sb.append(dm).append(xfND(_loadingStatus));
        sb.append(dm).append(xfND(_shippingFixed));
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
    public SqlDeliveryCourseShippingList clone() {
        return (SqlDeliveryCourseShippingList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] ERROR_FLG: {varchar(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {varchar(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] CANCEL_FLG: {varchar(1)} <br>
     * @return The value of the column 'CANCEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCancelFlg() {
        checkSpecifiedProperty("cancelFlg");
        return convertEmptyToNull(_cancelFlg);
    }

    /**
     * [set] CANCEL_FLG: {varchar(1)} <br>
     * @param cancelFlg The value of the column 'CANCEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCancelFlg(String cancelFlg) {
        registerModifiedProperty("cancelFlg");
        _cancelFlg = cancelFlg;
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
     * [get] MAX_UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'MAX_UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getMaxUpdDt() {
        checkSpecifiedProperty("maxUpdDt");
        return _maxUpdDt;
    }

    /**
     * [set] MAX_UPD_DT: {datetime2(26, 6)} <br>
     * @param maxUpdDt The value of the column 'MAX_UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxUpdDt(java.sql.Timestamp maxUpdDt) {
        registerModifiedProperty("maxUpdDt");
        _maxUpdDt = maxUpdDt;
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
     * [get] COUNT_SUPPLY_CUSTOMER_CD: {int(10)} <br>
     * @return The value of the column 'COUNT_SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCountSupplyCustomerCd() {
        checkSpecifiedProperty("countSupplyCustomerCd");
        return _countSupplyCustomerCd;
    }

    /**
     * [set] COUNT_SUPPLY_CUSTOMER_CD: {int(10)} <br>
     * @param countSupplyCustomerCd The value of the column 'COUNT_SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCountSupplyCustomerCd(Long countSupplyCustomerCd) {
        registerModifiedProperty("countSupplyCustomerCd");
        _countSupplyCustomerCd = countSupplyCustomerCd;
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
     * [get] SHIPPING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス
     * @return The value of the column 'SHIPPING_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStatus() {
        checkSpecifiedProperty("shippingStatus");
        return convertEmptyToNull(_shippingStatus);
    }

    /**
     * [set] SHIPPING_STATUS: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス
     * @param shippingStatus The value of the column 'SHIPPING_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStatus(String shippingStatus) {
        registerModifiedProperty("shippingStatus");
        _shippingStatus = shippingStatus;
    }

    /**
     * [get] SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス最大値
     * @return The value of the column 'SHIPPING_STATUS_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStatusMax() {
        checkSpecifiedProperty("shippingStatusMax");
        return convertEmptyToNull(_shippingStatusMax);
    }

    /**
     * [set] SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus} <br>
     * // cls(ShippingStatus) 出荷ステータス最大値
     * @param shippingStatusMax The value of the column 'SHIPPING_STATUS_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStatusMax(String shippingStatusMax) {
        registerModifiedProperty("shippingStatusMax");
        _shippingStatusMax = shippingStatusMax;
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
     * [get] SHIPPING_SLIP_NO: {int(10)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {int(10)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(Integer shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] NUM: {int(10)} <br>
     * @return The value of the column 'NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNum() {
        checkSpecifiedProperty("num");
        return _num;
    }

    /**
     * [set] NUM: {int(10)} <br>
     * @param num The value of the column 'NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum(Integer num) {
        registerModifiedProperty("num");
        _num = num;
    }

    /**
     * [get] TSIH_NUM: {int(10)} <br>
     * @return The value of the column 'TSIH_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTsihNum() {
        checkSpecifiedProperty("tsihNum");
        return _tsihNum;
    }

    /**
     * [set] TSIH_NUM: {int(10)} <br>
     * @param tsihNum The value of the column 'TSIH_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTsihNum(Long tsihNum) {
        registerModifiedProperty("tsihNum");
        _tsihNum = tsihNum;
    }

    /**
     * [get] COUNT_PRODUCT_CD: {int(10)} <br>
     * @return The value of the column 'COUNT_PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCountProductCd() {
        checkSpecifiedProperty("countProductCd");
        return _countProductCd;
    }

    /**
     * [set] COUNT_PRODUCT_CD: {int(10)} <br>
     * @param countProductCd The value of the column 'COUNT_PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCountProductCd(Integer countProductCd) {
        registerModifiedProperty("countProductCd");
        _countProductCd = countProductCd;
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
     * [get] COUNT_SHIPPING_PACKING_NO: {int(10)} <br>
     * @return The value of the column 'COUNT_SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCountShippingPackingNo() {
        checkSpecifiedProperty("countShippingPackingNo");
        return _countShippingPackingNo;
    }

    /**
     * [set] COUNT_SHIPPING_PACKING_NO: {int(10)} <br>
     * @param countShippingPackingNo The value of the column 'COUNT_SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCountShippingPackingNo(Integer countShippingPackingNo) {
        registerModifiedProperty("countShippingPackingNo");
        _countShippingPackingNo = countShippingPackingNo;
    }

    /**
     * [get] SUM_GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @return The value of the column 'SUM_GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumGrossWeight() {
        checkSpecifiedProperty("sumGrossWeight");
        return _sumGrossWeight;
    }

    /**
     * [set] SUM_GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @param sumGrossWeight The value of the column 'SUM_GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumGrossWeight(java.math.BigDecimal sumGrossWeight) {
        registerModifiedProperty("sumGrossWeight");
        _sumGrossWeight = sumGrossWeight;
    }

    /**
     * [get] PIC_LIST_STATUS1: {int(10)} <br>
     * @return The value of the column 'PIC_LIST_STATUS1'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPicListStatus1() {
        checkSpecifiedProperty("picListStatus1");
        return _picListStatus1;
    }

    /**
     * [set] PIC_LIST_STATUS1: {int(10)} <br>
     * @param picListStatus1 The value of the column 'PIC_LIST_STATUS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicListStatus1(Integer picListStatus1) {
        registerModifiedProperty("picListStatus1");
        _picListStatus1 = picListStatus1;
    }

    /**
     * [get] PIC_LIST_STATUS2: {int(10)} <br>
     * @return The value of the column 'PIC_LIST_STATUS2'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPicListStatus2() {
        checkSpecifiedProperty("picListStatus2");
        return _picListStatus2;
    }

    /**
     * [set] PIC_LIST_STATUS2: {int(10)} <br>
     * @param picListStatus2 The value of the column 'PIC_LIST_STATUS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicListStatus2(Integer picListStatus2) {
        registerModifiedProperty("picListStatus2");
        _picListStatus2 = picListStatus2;
    }

    /**
     * [get] CHK_STATUS: {int(10)} <br>
     * @return The value of the column 'CHK_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getChkStatus() {
        checkSpecifiedProperty("chkStatus");
        return _chkStatus;
    }

    /**
     * [set] CHK_STATUS: {int(10)} <br>
     * @param chkStatus The value of the column 'CHK_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChkStatus(Integer chkStatus) {
        registerModifiedProperty("chkStatus");
        _chkStatus = chkStatus;
    }

    /**
     * [get] INVOICE_CREATE: {int(10)} <br>
     * @return The value of the column 'INVOICE_CREATE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getInvoiceCreate() {
        checkSpecifiedProperty("invoiceCreate");
        return _invoiceCreate;
    }

    /**
     * [set] INVOICE_CREATE: {int(10)} <br>
     * @param invoiceCreate The value of the column 'INVOICE_CREATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreate(Integer invoiceCreate) {
        registerModifiedProperty("invoiceCreate");
        _invoiceCreate = invoiceCreate;
    }

    /**
     * [get] PACKING_OUT: {int(10)} <br>
     * @return The value of the column 'PACKING_OUT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPackingOut() {
        checkSpecifiedProperty("packingOut");
        return _packingOut;
    }

    /**
     * [set] PACKING_OUT: {int(10)} <br>
     * @param packingOut The value of the column 'PACKING_OUT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingOut(Integer packingOut) {
        registerModifiedProperty("packingOut");
        _packingOut = packingOut;
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
     * [get] SHIPPING_FIXED: {int(10)} <br>
     * @return The value of the column 'SHIPPING_FIXED'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getShippingFixed() {
        checkSpecifiedProperty("shippingFixed");
        return _shippingFixed;
    }

    /**
     * [set] SHIPPING_FIXED: {int(10)} <br>
     * @param shippingFixed The value of the column 'SHIPPING_FIXED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingFixed(Integer shippingFixed) {
        registerModifiedProperty("shippingFixed");
        _shippingFixed = shippingFixed;
    }
}
