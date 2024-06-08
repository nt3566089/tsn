package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of T_SHIPPING_INST_H as TABLE. <br>
 * 出荷指示ヘッダ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_DELIVERY_COURSE, M_CUSTOMER, M_PROCESS_TYPE, M_CLIENT, M_CENTER, T_ALLOC_INST_H, M_ZIP(ForDeliv), B_CLASS_DTL(ByDelivTz)
 *
 * [referrer table]
 *     T_EC_ORDER_H, T_SHIPPING_INST_B
 *
 * [foreign property]
 *     mDeliveryCourse, mCustomerBySupplyCustomerId, mProcessType, mClient, mCenter, mCustomerByDelivCustomerId, tAllocInstH, mZipForDeliv, bClassDtlByDelivTz, bClassDtlByEmergencyFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByShippingStatus, bClassDtlByStockOutFlg
 *
 * [referrer property]
 *     tEcOrderHList, tShippingInstBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInstHId = entity.getShippingInstHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long processTypeId = entity.getProcessTypeId();
 * String inputType = entity.getInputType();
 * String shippingDt = entity.getShippingDt();
 * String workDt = entity.getWorkDt();
 * String delivPlanDt = entity.getDelivPlanDt();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * String clientShippingNo = entity.getClientShippingNo();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String shippingStatus = entity.getShippingStatus();
 * Long supplyCustomerId = entity.getSupplyCustomerId();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * Long delivCustomerId = entity.getDelivCustomerId();
 * String delivCustomerCd = entity.getDelivCustomerCd();
 * String delivZipCd = entity.getDelivZipCd();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String delivAddressSupply = entity.getDelivAddressSupply();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivTelNo = entity.getDelivTelNo();
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String pickingWorkMessage = entity.getPickingWorkMessage();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String pickingBatchNo = entity.getPickingBatchNo();
 * String stockOutFlg = entity.getStockOutFlg();
 * Long allocInstHId = entity.getAllocInstHId();
 * Long cod = entity.getCod();
 * Long codTax = entity.getCodTax();
 * java.math.BigDecimal totalPrice = entity.getTotalPrice();
 * java.math.BigDecimal totalTax = entity.getTotalTax();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingInstHId(shippingInstHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setProcessTypeId(processTypeId);
 * entity.setInputType(inputType);
 * entity.setShippingDt(shippingDt);
 * entity.setWorkDt(workDt);
 * entity.setDelivPlanDt(delivPlanDt);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setShippingStatus(shippingStatus);
 * entity.setSupplyCustomerId(supplyCustomerId);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setDelivCustomerId(delivCustomerId);
 * entity.setDelivCustomerCd(delivCustomerCd);
 * entity.setDelivZipCd(delivZipCd);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setDelivAddressSupply(delivAddressSupply);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setPickingWorkMessage(pickingWorkMessage);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setPickingBatchNo(pickingBatchNo);
 * entity.setStockOutFlg(stockOutFlg);
 * entity.setAllocInstHId(allocInstHId);
 * entity.setCod(cod);
 * entity.setCodTax(codTax);
 * entity.setTotalPrice(totalPrice);
 * entity.setTotalTax(totalTax);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingInstH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shippingInstHId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    protected Long _processTypeId;

    /** INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} */
    protected String _inputType;

    /** SHIPPING_DT: {IX, NotNull, varchar(8)} */
    protected String _shippingDt;

    /** WORK_DT: {IX, varchar(8)} */
    protected String _workDt;

    /** DELIV_PLAN_DT: {varchar(8)} */
    protected String _delivPlanDt;

    /** DELIV_DT: {varchar(8)} */
    protected String _delivDt;

    /** DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} */
    protected String _delivTz;

    /** CLIENT_SHIPPING_NO: {IX, varchar(30)} */
    protected String _clientShippingNo;

    /** SHIPPING_SLIP_NO: {IX, varchar(30)} */
    protected String _shippingSlipNo;

    /** SHIPPING_STATUS: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=ShippingStatus} */
    protected String _shippingStatus;

    /** SUPPLY_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_CD: {IX, varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _delivCustomerId;

    /** DELIV_CUSTOMER_CD: {varchar(30)} */
    protected String _delivCustomerCd;

    /** DELIV_ZIP_CD: {varchar(30), FK to M_ZIP} */
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {varchar(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    protected String _delivAddress3;

    /** DELIV_ADDRESS_SUPPLY: {varchar(60)} */
    protected String _delivAddressSupply;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** DELIV_TEL_NO: {varchar(255)} */
    protected String _delivTelNo;

    /** DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} */
    protected Long _deliveryCourseId;

    /** DELIVERY_COURSE_CD: {IX, varchar(30)} */
    protected String _deliveryCourseCd;

    /** EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} */
    protected String _emergencyFlg;

    /** PICKING_WORK_MESSAGE: {varchar(255)} */
    protected String _pickingWorkMessage;

    /** ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** PICKING_BATCH_NO: {IX, varchar(30)} */
    protected String _pickingBatchNo;

    /** STOCK_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutFlg} */
    protected String _stockOutFlg;

    /** ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} */
    protected Long _allocInstHId;

    /** COD: {bigint(19)} */
    protected Long _cod;

    /** COD_TAX: {bigint(19)} */
    protected Long _codTax;

    /** TOTAL_PRICE: {decimal(16, 6)} */
    protected java.math.BigDecimal _totalPrice;

    /** TOTAL_TAX: {decimal(16, 6)} */
    protected java.math.BigDecimal _totalTax;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "T_SHIPPING_INST_H";
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
        if (_shippingInstHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InputType getInputTypeAsInputType() {
        return CDef.InputType.codeOf(getInputType());
    }

    /**
     * Set the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInputTypeAsInputType(CDef.InputType cdef) {
        setInputType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delivTz as the classification of DelivTz. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelivTz getDelivTzAsDelivTz() {
        return CDef.DelivTz.codeOf(getDelivTz());
    }

    /**
     * Set the value of delivTz as the classification of DelivTz. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelivTzAsDelivTz(CDef.DelivTz cdef) {
        setDelivTz(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of shippingStatus as the classification of ShippingStatus. <br>
     * SHIPPING_STATUS: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingStatus getShippingStatusAsShippingStatus() {
        return CDef.ShippingStatus.codeOf(getShippingStatus());
    }

    /**
     * Set the value of shippingStatus as the classification of ShippingStatus. <br>
     * SHIPPING_STATUS: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingStatusAsShippingStatus(CDef.ShippingStatus cdef) {
        setShippingStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of emergencyFlg as the classification of EmergencyFlg. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EmergencyFlg getEmergencyFlgAsEmergencyFlg() {
        return CDef.EmergencyFlg.codeOf(getEmergencyFlg());
    }

    /**
     * Set the value of emergencyFlg as the classification of EmergencyFlg. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg cdef) {
        setEmergencyFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ErrorFlg getErrorFlgAsErrorFlg() {
        return CDef.ErrorFlg.codeOf(getErrorFlg());
    }

    /**
     * Set the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setErrorFlgAsErrorFlg(CDef.ErrorFlg cdef) {
        setErrorFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockOutFlg as the classification of StockOutFlg. <br>
     * STOCK_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockOutFlg getStockOutFlgAsStockOutFlg() {
        return CDef.StockOutFlg.codeOf(getStockOutFlg());
    }

    /**
     * Set the value of stockOutFlg as the classification of StockOutFlg. <br>
     * STOCK_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockOutFlgAsStockOutFlg(CDef.StockOutFlg cdef) {
        setStockOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of inputType as $00 (00). <br>
     * $00: 画面入力
     */
    public void setInputType_$00() {
        setInputTypeAsInputType(CDef.InputType.$00);
    }

    /**
     * Set the value of inputType as $10 (10). <br>
     * $10: アップロード
     */
    public void setInputType_$10() {
        setInputTypeAsInputType(CDef.InputType.$10);
    }

    /**
     * Set the value of inputType as $20 (20). <br>
     * $20: EDI
     */
    public void setInputType_$20() {
        setInputTypeAsInputType(CDef.InputType.$20);
    }

    /**
     * Set the value of inputType as $30 (30). <br>
     * $30: HT
     */
    public void setInputType_$30() {
        setInputTypeAsInputType(CDef.InputType.$30);
    }

    /**
     * Set the value of delivTz as $A (A). <br>
     * $A: 午前中
     */
    public void setDelivTz_$A() {
        setDelivTzAsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * Set the value of delivTz as $B (B). <br>
     * $B: 12時～14時
     */
    public void setDelivTz_$B() {
        setDelivTzAsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * Set the value of delivTz as $C (C). <br>
     * $C: 14時～16時
     */
    public void setDelivTz_$C() {
        setDelivTzAsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * Set the value of delivTz as $D (D). <br>
     * $D: 16時～18時
     */
    public void setDelivTz_$D() {
        setDelivTzAsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * Set the value of delivTz as $E (E). <br>
     * $E: 18時～20時
     */
    public void setDelivTz_$E() {
        setDelivTzAsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * Set the value of delivTz as $F (F). <br>
     * $F: 18時～21時
     */
    public void setDelivTz_$F() {
        setDelivTzAsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * Set the value of delivTz as $G (G). <br>
     * $G: 19時～21時
     */
    public void setDelivTz_$G() {
        setDelivTzAsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * Set the value of delivTz as $H (H). <br>
     * $H: 20時～21時
     */
    public void setDelivTz_$H() {
        setDelivTzAsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * Set the value of delivTz as $I (I). <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_$I() {
        setDelivTzAsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * Set the value of delivTz as $J (J). <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_$J() {
        setDelivTzAsDelivTz(CDef.DelivTz.$J);
    }

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
     * Set the value of emergencyFlg as $0 (0). <br>
     * $0: 通常
     */
    public void setEmergencyFlg_$0() {
        setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * Set the value of emergencyFlg as $1 (1). <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_$1() {
        setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

    /**
     * Set the value of errorFlg as $0 (0). <br>
     * $0: エラー無
     */
    public void setErrorFlg_$0() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Set the value of errorFlg as $1 (1). <br>
     * $1: エラー有
     */
    public void setErrorFlg_$1() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$1);
    }

    /**
     * Set the value of stockOutFlg as $0 (0). <br>
     * $0: 欠品無
     */
    public void setStockOutFlg_$0() {
        setStockOutFlgAsStockOutFlg(CDef.StockOutFlg.$0);
    }

    /**
     * Set the value of stockOutFlg as $1 (1). <br>
     * $1: 欠品有
     */
    public void setStockOutFlg_$1() {
        setStockOutFlgAsStockOutFlg(CDef.StockOutFlg.$1);
    }

    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of inputType $00? <br>
     * $00: 画面入力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$00() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$00) : false;
    }

    /**
     * Is the value of inputType $10? <br>
     * $10: アップロード
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$10() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$10) : false;
    }

    /**
     * Is the value of inputType $20? <br>
     * $20: EDI
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$20() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$20) : false;
    }

    /**
     * Is the value of inputType $30? <br>
     * $30: HT
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$30() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$30) : false;
    }

    /**
     * Is the value of delivTz $A? <br>
     * $A: 午前中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$A() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$A) : false;
    }

    /**
     * Is the value of delivTz $B? <br>
     * $B: 12時～14時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$B() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$B) : false;
    }

    /**
     * Is the value of delivTz $C? <br>
     * $C: 14時～16時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$C() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$C) : false;
    }

    /**
     * Is the value of delivTz $D? <br>
     * $D: 16時～18時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$D() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$D) : false;
    }

    /**
     * Is the value of delivTz $E? <br>
     * $E: 18時～20時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$E() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$E) : false;
    }

    /**
     * Is the value of delivTz $F? <br>
     * $F: 18時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$F() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$F) : false;
    }

    /**
     * Is the value of delivTz $G? <br>
     * $G: 19時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$G() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$G) : false;
    }

    /**
     * Is the value of delivTz $H? <br>
     * $H: 20時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$H() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$H) : false;
    }

    /**
     * Is the value of delivTz $I? <br>
     * $I: 午前10時まで
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$I() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$I) : false;
    }

    /**
     * Is the value of delivTz $J? <br>
     * $J: 午後5時まで
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$J() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$J) : false;
    }

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
     * Is the value of emergencyFlg $0? <br>
     * $0: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmergencyFlg$0() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.equals(CDef.EmergencyFlg.$0) : false;
    }

    /**
     * Is the value of emergencyFlg $1? <br>
     * $1: 緊急
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmergencyFlg$1() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.equals(CDef.EmergencyFlg.$1) : false;
    }

    /**
     * Is the value of errorFlg $0? <br>
     * $0: エラー無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$0() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$0) : false;
    }

    /**
     * Is the value of errorFlg $1? <br>
     * $1: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$1() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$1) : false;
    }

    /**
     * Is the value of stockOutFlg $0? <br>
     * $0: 欠品無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutFlg$0() {
        CDef.StockOutFlg cdef = getStockOutFlgAsStockOutFlg();
        return cdef != null ? cdef.equals(CDef.StockOutFlg.$0) : false;
    }

    /**
     * Is the value of stockOutFlg $1? <br>
     * $1: 欠品有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutFlg$1() {
        CDef.StockOutFlg cdef = getStockOutFlgAsStockOutFlg();
        return cdef != null ? cdef.equals(CDef.StockOutFlg.$1) : false;
    }

    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'inputType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInputTypeName() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delivTz' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelivTzName() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'shippingStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingStatusName() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'emergencyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEmergencyFlgName() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'errorFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getErrorFlgName() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockOutFlgName() {
        CDef.StockOutFlg cdef = getStockOutFlgAsStockOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. */
    protected MDeliveryCourse _mDeliveryCourse;

    /**
     * [get] M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. <br>
     * @return The entity of foreign property 'MDeliveryCourse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MDeliveryCourse getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    /**
     * [set] M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param mDeliveryCourse The entity of foreign property 'MDeliveryCourse'. (NullAllowed)
     */
    public void setMDeliveryCourse(MDeliveryCourse mDeliveryCourse) {
        _mDeliveryCourse = mDeliveryCourse;
    }

    /** M_CUSTOMER by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'. */
    protected MCustomer _mCustomerBySupplyCustomerId;

    /**
     * [get] M_CUSTOMER by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'. <br>
     * @return The entity of foreign property 'MCustomerBySupplyCustomerId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerBySupplyCustomerId() {
        return _mCustomerBySupplyCustomerId;
    }

    /**
     * [set] M_CUSTOMER by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @param mCustomerBySupplyCustomerId The entity of foreign property 'MCustomerBySupplyCustomerId'. (NullAllowed)
     */
    public void setMCustomerBySupplyCustomerId(MCustomer mCustomerBySupplyCustomerId) {
        _mCustomerBySupplyCustomerId = mCustomerBySupplyCustomerId;
    }

    /** M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'. */
    protected MProcessType _mProcessType;

    /**
     * [get] M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'. <br>
     * @return The entity of foreign property 'MProcessType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProcessType getMProcessType() {
        return _mProcessType;
    }

    /**
     * [set] M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param mProcessType The entity of foreign property 'MProcessType'. (NullAllowed)
     */
    public void setMProcessType(MProcessType mProcessType) {
        _mProcessType = mProcessType;
    }

    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'. */
    protected MCustomer _mCustomerByDelivCustomerId;

    /**
     * [get] M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'. <br>
     * @return The entity of foreign property 'MCustomerByDelivCustomerId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByDelivCustomerId() {
        return _mCustomerByDelivCustomerId;
    }

    /**
     * [set] M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @param mCustomerByDelivCustomerId The entity of foreign property 'MCustomerByDelivCustomerId'. (NullAllowed)
     */
    public void setMCustomerByDelivCustomerId(MCustomer mCustomerByDelivCustomerId) {
        _mCustomerByDelivCustomerId = mCustomerByDelivCustomerId;
    }

    /** T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'. */
    protected TAllocInstH _tAllocInstH;

    /**
     * [get] T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'. <br>
     * @return The entity of foreign property 'TAllocInstH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TAllocInstH getTAllocInstH() {
        return _tAllocInstH;
    }

    /**
     * [set] T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @param tAllocInstH The entity of foreign property 'TAllocInstH'. (NullAllowed)
     */
    public void setTAllocInstH(TAllocInstH tAllocInstH) {
        _tAllocInstH = tAllocInstH;
    }

    /** M_ZIP by my DELIV_ZIP_CD, named 'MZipForDeliv'. */
    protected MZip _mZipForDeliv;

    /**
     * [get] M_ZIP by my DELIV_ZIP_CD, named 'MZipForDeliv'. <br>
     * @return The entity of foreign property 'MZipForDeliv'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MZip getMZipForDeliv() {
        return _mZipForDeliv;
    }

    /**
     * [set] M_ZIP by my DELIV_ZIP_CD, named 'MZipForDeliv'.
     * @param mZipForDeliv The entity of foreign property 'MZipForDeliv'. (NullAllowed)
     */
    public void setMZipForDeliv(MZip mZipForDeliv) {
        _mZipForDeliv = mZipForDeliv;
    }

    /** B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'. */
    protected BClassDtl _bClassDtlByDelivTz;

    /**
     * [get] B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'. <br>
     * @return The entity of foreign property 'BClassDtlByDelivTz'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelivTz() {
        return _bClassDtlByDelivTz;
    }

    /**
     * [set] B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * @param bClassDtlByDelivTz The entity of foreign property 'BClassDtlByDelivTz'. (NullAllowed)
     */
    public void setBClassDtlByDelivTz(BClassDtl bClassDtlByDelivTz) {
        _bClassDtlByDelivTz = bClassDtlByDelivTz;
    }

    /** B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'. */
    protected BClassDtl _bClassDtlByEmergencyFlg;

    /**
     * [get] B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByEmergencyFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByEmergencyFlg() {
        return _bClassDtlByEmergencyFlg;
    }

    /**
     * [set] B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @param bClassDtlByEmergencyFlg The entity of foreign property 'BClassDtlByEmergencyFlg'. (NullAllowed)
     */
    public void setBClassDtlByEmergencyFlg(BClassDtl bClassDtlByEmergencyFlg) {
        _bClassDtlByEmergencyFlg = bClassDtlByEmergencyFlg;
    }

    /** B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'. */
    protected BClassDtl _bClassDtlByErrorFlg;

    /**
     * [get] B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    /**
     * [set] B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @param bClassDtlByErrorFlg The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed)
     */
    public void setBClassDtlByErrorFlg(BClassDtl bClassDtlByErrorFlg) {
        _bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    /** B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'. */
    protected BClassDtl _bClassDtlByInputType;

    /**
     * [get] B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'. <br>
     * @return The entity of foreign property 'BClassDtlByInputType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    /**
     * [set] B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @param bClassDtlByInputType The entity of foreign property 'BClassDtlByInputType'. (NullAllowed)
     */
    public void setBClassDtlByInputType(BClassDtl bClassDtlByInputType) {
        _bClassDtlByInputType = bClassDtlByInputType;
    }

    /** B_CLASS_DTL by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'. */
    protected BClassDtl _bClassDtlByShippingStatus;

    /**
     * [get] B_CLASS_DTL by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByShippingStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByShippingStatus() {
        return _bClassDtlByShippingStatus;
    }

    /**
     * [set] B_CLASS_DTL by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'.
     * @param bClassDtlByShippingStatus The entity of foreign property 'BClassDtlByShippingStatus'. (NullAllowed)
     */
    public void setBClassDtlByShippingStatus(BClassDtl bClassDtlByShippingStatus) {
        _bClassDtlByShippingStatus = bClassDtlByShippingStatus;
    }

    /** B_CLASS_DTL by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'. */
    protected BClassDtl _bClassDtlByStockOutFlg;

    /**
     * [get] B_CLASS_DTL by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockOutFlg() {
        return _bClassDtlByStockOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'.
     * @param bClassDtlByStockOutFlg The entity of foreign property 'BClassDtlByStockOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockOutFlg(BClassDtl bClassDtlByStockOutFlg) {
        _bClassDtlByStockOutFlg = bClassDtlByStockOutFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_EC_ORDER_H by SHIPPING_INST_H_ID, named 'TEcOrderHList'. */
    protected List<TEcOrderH> _tEcOrderHList;

    /**
     * [get] T_EC_ORDER_H by SHIPPING_INST_H_ID, named 'TEcOrderHList'.
     * @return The entity list of referrer property 'TEcOrderHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderH> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = newReferrerList(); }
        return _tEcOrderHList;
    }

    /**
     * [set] T_EC_ORDER_H by SHIPPING_INST_H_ID, named 'TEcOrderHList'.
     * @param tEcOrderHList The entity list of referrer property 'TEcOrderHList'. (NullAllowed)
     */
    public void setTEcOrderHList(List<TEcOrderH> tEcOrderHList) {
        _tEcOrderHList = tEcOrderHList;
    }

    /** T_SHIPPING_INST_B by SHIPPING_INST_H_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] T_SHIPPING_INST_B by SHIPPING_INST_H_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] T_SHIPPING_INST_B by SHIPPING_INST_H_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTShippingInstH) {
            BsTShippingInstH other = (BsTShippingInstH)obj;
            if (!xSV(_shippingInstHId, other._shippingInstHId)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mDeliveryCourse != null)
        { sb.append(li).append(xbRDS(_mDeliveryCourse, "mDeliveryCourse")); }
        if (_mCustomerBySupplyCustomerId != null)
        { sb.append(li).append(xbRDS(_mCustomerBySupplyCustomerId, "mCustomerBySupplyCustomerId")); }
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mCustomerByDelivCustomerId != null)
        { sb.append(li).append(xbRDS(_mCustomerByDelivCustomerId, "mCustomerByDelivCustomerId")); }
        if (_tAllocInstH != null)
        { sb.append(li).append(xbRDS(_tAllocInstH, "tAllocInstH")); }
        if (_mZipForDeliv != null)
        { sb.append(li).append(xbRDS(_mZipForDeliv, "mZipForDeliv")); }
        if (_bClassDtlByDelivTz != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelivTz, "bClassDtlByDelivTz")); }
        if (_bClassDtlByEmergencyFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEmergencyFlg, "bClassDtlByEmergencyFlg")); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorFlg, "bClassDtlByErrorFlg")); }
        if (_bClassDtlByInputType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInputType, "bClassDtlByInputType")); }
        if (_bClassDtlByShippingStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByShippingStatus, "bClassDtlByShippingStatus")); }
        if (_bClassDtlByStockOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockOutFlg, "bClassDtlByStockOutFlg")); }
        if (_tEcOrderHList != null) { for (TEcOrderH et : _tEcOrderHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tEcOrderHList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_inputType));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_delivPlanDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_shippingStatus));
        sb.append(dm).append(xfND(_supplyCustomerId));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_delivCustomerId));
        sb.append(dm).append(xfND(_delivCustomerCd));
        sb.append(dm).append(xfND(_delivZipCd));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_delivAddressSupply));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_pickingWorkMessage));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_pickingBatchNo));
        sb.append(dm).append(xfND(_stockOutFlg));
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_cod));
        sb.append(dm).append(xfND(_codTax));
        sb.append(dm).append(xfND(_totalPrice));
        sb.append(dm).append(xfND(_totalTax));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mDeliveryCourse != null)
        { sb.append(dm).append("mDeliveryCourse"); }
        if (_mCustomerBySupplyCustomerId != null)
        { sb.append(dm).append("mCustomerBySupplyCustomerId"); }
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mCustomerByDelivCustomerId != null)
        { sb.append(dm).append("mCustomerByDelivCustomerId"); }
        if (_tAllocInstH != null)
        { sb.append(dm).append("tAllocInstH"); }
        if (_mZipForDeliv != null)
        { sb.append(dm).append("mZipForDeliv"); }
        if (_bClassDtlByDelivTz != null)
        { sb.append(dm).append("bClassDtlByDelivTz"); }
        if (_bClassDtlByEmergencyFlg != null)
        { sb.append(dm).append("bClassDtlByEmergencyFlg"); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(dm).append("bClassDtlByErrorFlg"); }
        if (_bClassDtlByInputType != null)
        { sb.append(dm).append("bClassDtlByInputType"); }
        if (_bClassDtlByShippingStatus != null)
        { sb.append(dm).append("bClassDtlByShippingStatus"); }
        if (_bClassDtlByStockOutFlg != null)
        { sb.append(dm).append("bClassDtlByStockOutFlg"); }
        if (_tEcOrderHList != null && !_tEcOrderHList.isEmpty())
        { sb.append(dm).append("tEcOrderHList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TShippingInstH clone() {
        return (TShippingInstH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstHId() {
        checkSpecifiedProperty("shippingInstHId");
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        registerModifiedProperty("shippingInstHId");
        _shippingInstHId = shippingInstHId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProcessTypeId() {
        checkSpecifiedProperty("processTypeId");
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProcessTypeId(Long processTypeId) {
        registerModifiedProperty("processTypeId");
        _processTypeId = processTypeId;
    }

    /**
     * [get] INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInputType() {
        checkSpecifiedProperty("inputType");
        return convertEmptyToNull(_inputType);
    }

    /**
     * [set] INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInputType(String inputType) {
        registerModifiedProperty("inputType");
        _inputType = inputType;
    }

    /**
     * [get] SHIPPING_DT: {IX, NotNull, varchar(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {IX, NotNull, varchar(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (basically NotNull if update: for the constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] WORK_DT: {IX, varchar(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {IX, varchar(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] DELIV_PLAN_DT: {varchar(8)} <br>
     * 納品予定日
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivPlanDt() {
        checkSpecifiedProperty("delivPlanDt");
        return convertEmptyToNull(_delivPlanDt);
    }

    /**
     * [set] DELIV_PLAN_DT: {varchar(8)} <br>
     * 納品予定日
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        registerModifiedProperty("delivPlanDt");
        _delivPlanDt = delivPlanDt;
    }

    /**
     * [get] DELIV_DT: {varchar(8)} <br>
     * 納品指定日
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {varchar(8)} <br>
     * 納品指定日
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {IX, varchar(30)} <br>
     * 顧客出荷指示No.
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {IX, varchar(30)} <br>
     * 顧客出荷指示No.
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {IX, varchar(30)} <br>
     * WMS出荷伝票No.
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return convertEmptyToNull(_shippingSlipNo);
    }

    /**
     * [set] SHIPPING_SLIP_NO: {IX, varchar(30)} <br>
     * WMS出荷伝票No.
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_STATUS: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @return The value of the column 'SHIPPING_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getShippingStatus() {
        checkSpecifiedProperty("shippingStatus");
        return convertEmptyToNull(_shippingStatus);
    }

    /**
     * [set] SHIPPING_STATUS: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param shippingStatus The value of the column 'SHIPPING_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setShippingStatus(String shippingStatus) {
        registerModifiedProperty("shippingStatus");
        _shippingStatus = shippingStatus;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 納品先ID
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplyCustomerId() {
        checkSpecifiedProperty("supplyCustomerId");
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 納品先ID
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        registerModifiedProperty("supplyCustomerId");
        _supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {IX, varchar(30)} <br>
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {IX, varchar(30)} <br>
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * 納品先名称
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * 納品先名称
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 届先ID
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivCustomerId() {
        checkSpecifiedProperty("delivCustomerId");
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 届先ID
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        registerModifiedProperty("delivCustomerId");
        _delivCustomerId = delivCustomerId;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * 届先CD
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerCd() {
        checkSpecifiedProperty("delivCustomerCd");
        return convertEmptyToNull(_delivCustomerCd);
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * 届先CD
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        registerModifiedProperty("delivCustomerCd");
        _delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_ZIP_CD: {varchar(30), FK to M_ZIP} <br>
     * 届先郵便番号
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(30), FK to M_ZIP} <br>
     * 届先郵便番号
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * 届先住所1
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * 届先住所1
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * 届先住所2
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * 届先住所2
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * 届先住所3
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * 届先住所3
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {varchar(60)} <br>
     * 届先住所補足
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddressSupply() {
        checkSpecifiedProperty("delivAddressSupply");
        return convertEmptyToNull(_delivAddressSupply);
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {varchar(60)} <br>
     * 届先住所補足
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        registerModifiedProperty("delivAddressSupply");
        _delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * 届先名称
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * 届先名称
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * 届先電話番号
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * 届先電話番号
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {IX, varchar(30)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {IX, varchar(30)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * 出庫作業メッセージ
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkMessage() {
        checkSpecifiedProperty("pickingWorkMessage");
        return convertEmptyToNull(_pickingWorkMessage);
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * 出庫作業メッセージ
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        registerModifiedProperty("pickingWorkMessage");
        _pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] PICKING_BATCH_NO: {IX, varchar(30)} <br>
     * 出庫指示バッチNo.
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingBatchNo() {
        checkSpecifiedProperty("pickingBatchNo");
        return convertEmptyToNull(_pickingBatchNo);
    }

    /**
     * [set] PICKING_BATCH_NO: {IX, varchar(30)} <br>
     * 出庫指示バッチNo.
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        registerModifiedProperty("pickingBatchNo");
        _pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] STOCK_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockOutFlg() {
        checkSpecifiedProperty("stockOutFlg");
        return convertEmptyToNull(_stockOutFlg);
    }

    /**
     * [set] STOCK_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutFlg(String stockOutFlg) {
        registerModifiedProperty("stockOutFlg");
        _stockOutFlg = stockOutFlg;
    }

    /**
     * [get] ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstHId() {
        checkSpecifiedProperty("allocInstHId");
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstHId(Long allocInstHId) {
        registerModifiedProperty("allocInstHId");
        _allocInstHId = allocInstHId;
    }

    /**
     * [get] COD: {bigint(19)} <br>
     * 代引請求額
     * @return The value of the column 'COD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCod() {
        checkSpecifiedProperty("cod");
        return _cod;
    }

    /**
     * [set] COD: {bigint(19)} <br>
     * 代引請求額
     * @param cod The value of the column 'COD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCod(Long cod) {
        registerModifiedProperty("cod");
        _cod = cod;
    }

    /**
     * [get] COD_TAX: {bigint(19)} <br>
     * 代引消費税
     * @return The value of the column 'COD_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCodTax() {
        checkSpecifiedProperty("codTax");
        return _codTax;
    }

    /**
     * [set] COD_TAX: {bigint(19)} <br>
     * 代引消費税
     * @param codTax The value of the column 'COD_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodTax(Long codTax) {
        registerModifiedProperty("codTax");
        _codTax = codTax;
    }

    /**
     * [get] TOTAL_PRICE: {decimal(16, 6)} <br>
     * 合計金額
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalPrice() {
        checkSpecifiedProperty("totalPrice");
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {decimal(16, 6)} <br>
     * 合計金額
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        registerModifiedProperty("totalPrice");
        _totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {decimal(16, 6)} <br>
     * 合計消費税
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalTax() {
        checkSpecifiedProperty("totalTax");
        return _totalTax;
    }

    /**
     * [set] TOTAL_TAX: {decimal(16, 6)} <br>
     * 合計消費税
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalTax(java.math.BigDecimal totalTax) {
        registerModifiedProperty("totalTax");
        _totalTax = totalTax;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
