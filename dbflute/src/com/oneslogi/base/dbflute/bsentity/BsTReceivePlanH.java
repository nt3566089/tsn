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
 * The entity of T_RECEIVE_PLAN_H as TABLE. <br>
 * 入荷予定ヘッダ
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, RECEIVE_PLAN_DT, PLAN_CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, PLAN_SUPPLIER_ID, PLAN_SUPPLIER_CD, PLAN_DEPOSIT_ID, PLAN_DEPOSIT_CD, RECEIVE_STATUS, INPUT_TYPE, RECEIVE_DELIVERY_STATUS, OLD_RECEIVE_PLAN_H_ID, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_TRANSIT_FLG, PICKING_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_RECEIVE_PLAN_H, M_CUSTOMER, M_CLIENT, M_STOCK_TYPE, M_CENTER, M_PROCESS_TYPE, T_PICKING_H, B_CLASS_DTL(ByCenterTransitFlg), T_RECEIVE_PLAN_R(AsOne), T_TRRCV(AsOne)
 *
 * [referrer table]
 *     T_RECEIVE_PLAN_B, T_RECEIVE_PLAN_H, T_STORE_RECORD_H, T_RECEIVE_PLAN_R, T_TRRCV
 *
 * [foreign property]
 *     tReceivePlanHSelf, mCustomerByPlanDepositId, mClient, mStockType, mCenter, mProcessType, mCustomerByPlanSupplierId, tPickingH, bClassDtlByCenterTransitFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByReceiveDeliveryStatus, bClassDtlByReceiveStatus, tReceivePlanRAsOne, tTrrcvAsOne
 *
 * [referrer property]
 *     tReceivePlanBList, tReceivePlanHSelfList, tStoreRecordHList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long receivePlanHId = entity.getReceivePlanHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long processTypeId = entity.getProcessTypeId();
 * Long stockTypeId = entity.getStockTypeId();
 * String receivePlanDt = entity.getReceivePlanDt();
 * String planClientReceiveNo = entity.getPlanClientReceiveNo();
 * String receiveSlipNo = entity.getReceiveSlipNo();
 * Long planSupplierId = entity.getPlanSupplierId();
 * String planSupplierCd = entity.getPlanSupplierCd();
 * Long planDepositId = entity.getPlanDepositId();
 * String planDepositCd = entity.getPlanDepositCd();
 * String receiveStatus = entity.getReceiveStatus();
 * String inputType = entity.getInputType();
 * String receiveDeliveryStatus = entity.getReceiveDeliveryStatus();
 * Long oldReceivePlanHId = entity.getOldReceivePlanHId();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String centerTransitFlg = entity.getCenterTransitFlg();
 * Long pickingHId = entity.getPickingHId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setProcessTypeId(processTypeId);
 * entity.setStockTypeId(stockTypeId);
 * entity.setReceivePlanDt(receivePlanDt);
 * entity.setPlanClientReceiveNo(planClientReceiveNo);
 * entity.setReceiveSlipNo(receiveSlipNo);
 * entity.setPlanSupplierId(planSupplierId);
 * entity.setPlanSupplierCd(planSupplierCd);
 * entity.setPlanDepositId(planDepositId);
 * entity.setPlanDepositCd(planDepositCd);
 * entity.setReceiveStatus(receiveStatus);
 * entity.setInputType(inputType);
 * entity.setReceiveDeliveryStatus(receiveDeliveryStatus);
 * entity.setOldReceivePlanHId(oldReceivePlanHId);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setCenterTransitFlg(centerTransitFlg);
 * entity.setPickingHId(pickingHId);
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
public abstract class BsTReceivePlanH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _receivePlanHId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, bigint(19), FK to M_PROCESS_TYPE} */
    protected Long _processTypeId;

    /** STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} */
    protected Long _stockTypeId;

    /** RECEIVE_PLAN_DT: {IX, NotNull, varchar(8)} */
    protected String _receivePlanDt;

    /** PLAN_CLIENT_RECEIVE_NO: {IX, varchar(30)} */
    protected String _planClientReceiveNo;

    /** RECEIVE_SLIP_NO: {IX, NotNull, varchar(30)} */
    protected String _receiveSlipNo;

    /** PLAN_SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _planSupplierId;

    /** PLAN_SUPPLIER_CD: {IX, varchar(30)} */
    protected String _planSupplierCd;

    /** PLAN_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _planDepositId;

    /** PLAN_DEPOSIT_CD: {varchar(30)} */
    protected String _planDepositCd;

    /** RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} */
    protected String _receiveStatus;

    /** INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} */
    protected String _inputType;

    /** RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} */
    protected String _receiveDeliveryStatus;

    /** OLD_RECEIVE_PLAN_H_ID: {IX, bigint(19), FK to T_RECEIVE_PLAN_H} */
    protected Long _oldReceivePlanHId;

    /** ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} */
    protected String _centerTransitFlg;

    /** PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} */
    protected Long _pickingHId;

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
        return "T_RECEIVE_PLAN_H";
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
        if (_receivePlanHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of receiveStatus as the classification of ReceiveStatus. <br>
     * RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReceiveStatus getReceiveStatusAsReceiveStatus() {
        return CDef.ReceiveStatus.codeOf(getReceiveStatus());
    }

    /**
     * Set the value of receiveStatus as the classification of ReceiveStatus. <br>
     * RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus cdef) {
        setReceiveStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InputType getInputTypeAsInputType() {
        return CDef.InputType.codeOf(getInputType());
    }

    /**
     * Set the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInputTypeAsInputType(CDef.InputType cdef) {
        setInputType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of receiveDeliveryStatus as the classification of ReceiveDeliveryStatus. <br>
     * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReceiveDeliveryStatus getReceiveDeliveryStatusAsReceiveDeliveryStatus() {
        return CDef.ReceiveDeliveryStatus.codeOf(getReceiveDeliveryStatus());
    }

    /**
     * Set the value of receiveDeliveryStatus as the classification of ReceiveDeliveryStatus. <br>
     * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus cdef) {
        setReceiveDeliveryStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ErrorFlg getErrorFlgAsErrorFlg() {
        return CDef.ErrorFlg.codeOf(getErrorFlg());
    }

    /**
     * Set the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setErrorFlgAsErrorFlg(CDef.ErrorFlg cdef) {
        setErrorFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of centerTransitFlg as the classification of CenterTransitFlg. <br>
     * CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterTransitFlg getCenterTransitFlgAsCenterTransitFlg() {
        return CDef.CenterTransitFlg.codeOf(getCenterTransitFlg());
    }

    /**
     * Set the value of centerTransitFlg as the classification of CenterTransitFlg. <br>
     * CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg cdef) {
        setCenterTransitFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of receiveStatus as $01 (01). <br>
     * $01: 未入荷
     */
    public void setReceiveStatus_$01() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$01);
    }

    /**
     * Set the value of receiveStatus as $02 (02). <br>
     * $02: 入荷中
     */
    public void setReceiveStatus_$02() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$02);
    }

    /**
     * Set the value of receiveStatus as $03 (03). <br>
     * $03: 入荷済
     */
    public void setReceiveStatus_$03() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$03);
    }

    /**
     * Set the value of receiveStatus as $90 (90). <br>
     * $90: 入荷削除
     */
    public void setReceiveStatus_$90() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$90);
    }

    /**
     * Set the value of receiveStatus as $99 (99). <br>
     * $99: エラー有
     */
    public void setReceiveStatus_$99() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$99);
    }

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
     * Set the value of receiveDeliveryStatus as $00 (00). <br>
     * $00: 未完
     */
    public void setReceiveDeliveryStatus_$00() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$00);
    }

    /**
     * Set the value of receiveDeliveryStatus as $01 (01). <br>
     * $01: 完納
     */
    public void setReceiveDeliveryStatus_$01() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$01);
    }

    /**
     * Set the value of receiveDeliveryStatus as $02 (02). <br>
     * $02: 分納
     */
    public void setReceiveDeliveryStatus_$02() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$02);
    }

    /**
     * Set the value of receiveDeliveryStatus as $09 (09). <br>
     * $09: 打切り
     */
    public void setReceiveDeliveryStatus_$09() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$09);
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
     * Is the value of receiveStatus $01? <br>
     * $01: 未入荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$01() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$01) : false;
    }

    /**
     * Is the value of receiveStatus $02? <br>
     * $02: 入荷中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$02() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$02) : false;
    }

    /**
     * Is the value of receiveStatus $03? <br>
     * $03: 入荷済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$03() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$03) : false;
    }

    /**
     * Is the value of receiveStatus $90? <br>
     * $90: 入荷削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$90() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$90) : false;
    }

    /**
     * Is the value of receiveStatus $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$99() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$99) : false;
    }

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
     * Is the value of receiveDeliveryStatus $00? <br>
     * $00: 未完
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$00() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$00) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $01? <br>
     * $01: 完納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$01() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$01) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $02? <br>
     * $02: 分納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$02() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$02) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $09? <br>
     * $09: 打切り
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$09() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$09) : false;
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
     * Get the value of the column 'receiveStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReceiveStatusName() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'inputType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInputTypeName() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'receiveDeliveryStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReceiveDeliveryStatusName() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
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
     * Get the value of the column 'centerTransitFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCenterTransitFlgName() {
        CDef.CenterTransitFlg cdef = getCenterTransitFlgAsCenterTransitFlg();
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
    /** T_RECEIVE_PLAN_H by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'. */
    protected TReceivePlanH _tReceivePlanHSelf;

    /**
     * [get] T_RECEIVE_PLAN_H by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'. <br>
     * @return The entity of foreign property 'TReceivePlanHSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TReceivePlanH getTReceivePlanHSelf() {
        return _tReceivePlanHSelf;
    }

    /**
     * [set] T_RECEIVE_PLAN_H by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
     * @param tReceivePlanHSelf The entity of foreign property 'TReceivePlanHSelf'. (NullAllowed)
     */
    public void setTReceivePlanHSelf(TReceivePlanH tReceivePlanHSelf) {
        _tReceivePlanHSelf = tReceivePlanHSelf;
    }

    /** M_CUSTOMER by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'. */
    protected MCustomer _mCustomerByPlanDepositId;

    /**
     * [get] M_CUSTOMER by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'. <br>
     * @return The entity of foreign property 'MCustomerByPlanDepositId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByPlanDepositId() {
        return _mCustomerByPlanDepositId;
    }

    /**
     * [set] M_CUSTOMER by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
     * @param mCustomerByPlanDepositId The entity of foreign property 'MCustomerByPlanDepositId'. (NullAllowed)
     */
    public void setMCustomerByPlanDepositId(MCustomer mCustomerByPlanDepositId) {
        _mCustomerByPlanDepositId = mCustomerByPlanDepositId;
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

    /** M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'. */
    protected MStockType _mStockType;

    /**
     * [get] M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'. <br>
     * @return The entity of foreign property 'MStockType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MStockType getMStockType() {
        return _mStockType;
    }

    /**
     * [set] M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @param mStockType The entity of foreign property 'MStockType'. (NullAllowed)
     */
    public void setMStockType(MStockType mStockType) {
        _mStockType = mStockType;
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

    /** M_CUSTOMER by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'. */
    protected MCustomer _mCustomerByPlanSupplierId;

    /**
     * [get] M_CUSTOMER by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'. <br>
     * @return The entity of foreign property 'MCustomerByPlanSupplierId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByPlanSupplierId() {
        return _mCustomerByPlanSupplierId;
    }

    /**
     * [set] M_CUSTOMER by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
     * @param mCustomerByPlanSupplierId The entity of foreign property 'MCustomerByPlanSupplierId'. (NullAllowed)
     */
    public void setMCustomerByPlanSupplierId(MCustomer mCustomerByPlanSupplierId) {
        _mCustomerByPlanSupplierId = mCustomerByPlanSupplierId;
    }

    /** T_PICKING_H by my PICKING_H_ID, named 'TPickingH'. */
    protected TPickingH _tPickingH;

    /**
     * [get] T_PICKING_H by my PICKING_H_ID, named 'TPickingH'. <br>
     * @return The entity of foreign property 'TPickingH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPickingH getTPickingH() {
        return _tPickingH;
    }

    /**
     * [set] T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param tPickingH The entity of foreign property 'TPickingH'. (NullAllowed)
     */
    public void setTPickingH(TPickingH tPickingH) {
        _tPickingH = tPickingH;
    }

    /** B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'. */
    protected BClassDtl _bClassDtlByCenterTransitFlg;

    /**
     * [get] B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCenterTransitFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCenterTransitFlg() {
        return _bClassDtlByCenterTransitFlg;
    }

    /**
     * [set] B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * @param bClassDtlByCenterTransitFlg The entity of foreign property 'BClassDtlByCenterTransitFlg'. (NullAllowed)
     */
    public void setBClassDtlByCenterTransitFlg(BClassDtl bClassDtlByCenterTransitFlg) {
        _bClassDtlByCenterTransitFlg = bClassDtlByCenterTransitFlg;
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

    /** B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'. */
    protected BClassDtl _bClassDtlByReceiveDeliveryStatus;

    /**
     * [get] B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByReceiveDeliveryStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReceiveDeliveryStatus() {
        return _bClassDtlByReceiveDeliveryStatus;
    }

    /**
     * [set] B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @param bClassDtlByReceiveDeliveryStatus The entity of foreign property 'BClassDtlByReceiveDeliveryStatus'. (NullAllowed)
     */
    public void setBClassDtlByReceiveDeliveryStatus(BClassDtl bClassDtlByReceiveDeliveryStatus) {
        _bClassDtlByReceiveDeliveryStatus = bClassDtlByReceiveDeliveryStatus;
    }

    /** B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'. */
    protected BClassDtl _bClassDtlByReceiveStatus;

    /**
     * [get] B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByReceiveStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReceiveStatus() {
        return _bClassDtlByReceiveStatus;
    }

    /**
     * [set] B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @param bClassDtlByReceiveStatus The entity of foreign property 'BClassDtlByReceiveStatus'. (NullAllowed)
     */
    public void setBClassDtlByReceiveStatus(BClassDtl bClassDtlByReceiveStatus) {
        _bClassDtlByReceiveStatus = bClassDtlByReceiveStatus;
    }

    /** T_RECEIVE_PLAN_R by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'. */
    protected TReceivePlanR _tReceivePlanRAsOne;

    /**
     * [get] T_RECEIVE_PLAN_R by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TReceivePlanRAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TReceivePlanR getTReceivePlanRAsOne() {
        return _tReceivePlanRAsOne;
    }

    /**
     * [set] T_RECEIVE_PLAN_R by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * @param TReceivePlanRAsOne The entity of foreign property(referrer-as-one) 'TReceivePlanRAsOne'. (NullAllowed)
     */
    public void setTReceivePlanRAsOne(TReceivePlanR TReceivePlanRAsOne) {
        _tReceivePlanRAsOne = TReceivePlanRAsOne;
    }

    /** T_TRRCV by RECEIVE_PLAN_H_ID, named 'TTrrcvAsOne'. */
    protected TTrrcv _tTrrcvAsOne;

    /**
     * [get] T_TRRCV by RECEIVE_PLAN_H_ID, named 'TTrrcvAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TTrrcvAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TTrrcv getTTrrcvAsOne() {
        return _tTrrcvAsOne;
    }

    /**
     * [set] T_TRRCV by RECEIVE_PLAN_H_ID, named 'TTrrcvAsOne'.
     * @param TTrrcvAsOne The entity of foreign property(referrer-as-one) 'TTrrcvAsOne'. (NullAllowed)
     */
    public void setTTrrcvAsOne(TTrrcv TTrrcvAsOne) {
        _tTrrcvAsOne = TTrrcvAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_RECEIVE_PLAN_B by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'. */
    protected List<TReceivePlanB> _tReceivePlanBList;

    /**
     * [get] T_RECEIVE_PLAN_B by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * @return The entity list of referrer property 'TReceivePlanBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanB> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = newReferrerList(); }
        return _tReceivePlanBList;
    }

    /**
     * [set] T_RECEIVE_PLAN_B by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * @param tReceivePlanBList The entity list of referrer property 'TReceivePlanBList'. (NullAllowed)
     */
    public void setTReceivePlanBList(List<TReceivePlanB> tReceivePlanBList) {
        _tReceivePlanBList = tReceivePlanBList;
    }

    /** T_RECEIVE_PLAN_H by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'. */
    protected List<TReceivePlanH> _tReceivePlanHSelfList;

    /**
     * [get] T_RECEIVE_PLAN_H by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * @return The entity list of referrer property 'TReceivePlanHSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHSelfList() {
        if (_tReceivePlanHSelfList == null) { _tReceivePlanHSelfList = newReferrerList(); }
        return _tReceivePlanHSelfList;
    }

    /**
     * [set] T_RECEIVE_PLAN_H by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * @param tReceivePlanHSelfList The entity list of referrer property 'TReceivePlanHSelfList'. (NullAllowed)
     */
    public void setTReceivePlanHSelfList(List<TReceivePlanH> tReceivePlanHSelfList) {
        _tReceivePlanHSelfList = tReceivePlanHSelfList;
    }

    /** T_STORE_RECORD_H by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'. */
    protected List<TStoreRecordH> _tStoreRecordHList;

    /**
     * [get] T_STORE_RECORD_H by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * @return The entity list of referrer property 'TStoreRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = newReferrerList(); }
        return _tStoreRecordHList;
    }

    /**
     * [set] T_STORE_RECORD_H by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * @param tStoreRecordHList The entity list of referrer property 'TStoreRecordHList'. (NullAllowed)
     */
    public void setTStoreRecordHList(List<TStoreRecordH> tStoreRecordHList) {
        _tStoreRecordHList = tStoreRecordHList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTReceivePlanH) {
            BsTReceivePlanH other = (BsTReceivePlanH)obj;
            if (!xSV(_receivePlanHId, other._receivePlanHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tReceivePlanHSelf != null)
        { sb.append(li).append(xbRDS(_tReceivePlanHSelf, "tReceivePlanHSelf")); }
        if (_mCustomerByPlanDepositId != null)
        { sb.append(li).append(xbRDS(_mCustomerByPlanDepositId, "mCustomerByPlanDepositId")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_mCustomerByPlanSupplierId != null)
        { sb.append(li).append(xbRDS(_mCustomerByPlanSupplierId, "mCustomerByPlanSupplierId")); }
        if (_tPickingH != null)
        { sb.append(li).append(xbRDS(_tPickingH, "tPickingH")); }
        if (_bClassDtlByCenterTransitFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCenterTransitFlg, "bClassDtlByCenterTransitFlg")); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorFlg, "bClassDtlByErrorFlg")); }
        if (_bClassDtlByInputType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInputType, "bClassDtlByInputType")); }
        if (_bClassDtlByReceiveDeliveryStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReceiveDeliveryStatus, "bClassDtlByReceiveDeliveryStatus")); }
        if (_bClassDtlByReceiveStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReceiveStatus, "bClassDtlByReceiveStatus")); }
        if (_tReceivePlanRAsOne != null)
        { sb.append(li).append(xbRDS(_tReceivePlanRAsOne, "tReceivePlanRAsOne")); }
        if (_tTrrcvAsOne != null)
        { sb.append(li).append(xbRDS(_tTrrcvAsOne, "tTrrcvAsOne")); }
        if (_tReceivePlanBList != null) { for (TReceivePlanB et : _tReceivePlanBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanBList")); } } }
        if (_tReceivePlanHSelfList != null) { for (TReceivePlanH et : _tReceivePlanHSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHSelfList")); } } }
        if (_tStoreRecordHList != null) { for (TStoreRecordH et : _tStoreRecordHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_receivePlanDt));
        sb.append(dm).append(xfND(_planClientReceiveNo));
        sb.append(dm).append(xfND(_receiveSlipNo));
        sb.append(dm).append(xfND(_planSupplierId));
        sb.append(dm).append(xfND(_planSupplierCd));
        sb.append(dm).append(xfND(_planDepositId));
        sb.append(dm).append(xfND(_planDepositCd));
        sb.append(dm).append(xfND(_receiveStatus));
        sb.append(dm).append(xfND(_inputType));
        sb.append(dm).append(xfND(_receiveDeliveryStatus));
        sb.append(dm).append(xfND(_oldReceivePlanHId));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_centerTransitFlg));
        sb.append(dm).append(xfND(_pickingHId));
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
        if (_tReceivePlanHSelf != null)
        { sb.append(dm).append("tReceivePlanHSelf"); }
        if (_mCustomerByPlanDepositId != null)
        { sb.append(dm).append("mCustomerByPlanDepositId"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_mCustomerByPlanSupplierId != null)
        { sb.append(dm).append("mCustomerByPlanSupplierId"); }
        if (_tPickingH != null)
        { sb.append(dm).append("tPickingH"); }
        if (_bClassDtlByCenterTransitFlg != null)
        { sb.append(dm).append("bClassDtlByCenterTransitFlg"); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(dm).append("bClassDtlByErrorFlg"); }
        if (_bClassDtlByInputType != null)
        { sb.append(dm).append("bClassDtlByInputType"); }
        if (_bClassDtlByReceiveDeliveryStatus != null)
        { sb.append(dm).append("bClassDtlByReceiveDeliveryStatus"); }
        if (_bClassDtlByReceiveStatus != null)
        { sb.append(dm).append("bClassDtlByReceiveStatus"); }
        if (_tReceivePlanRAsOne != null)
        { sb.append(dm).append("tReceivePlanRAsOne"); }
        if (_tTrrcvAsOne != null)
        { sb.append(dm).append("tTrrcvAsOne"); }
        if (_tReceivePlanBList != null && !_tReceivePlanBList.isEmpty())
        { sb.append(dm).append("tReceivePlanBList"); }
        if (_tReceivePlanHSelfList != null && !_tReceivePlanHSelfList.isEmpty())
        { sb.append(dm).append("tReceivePlanHSelfList"); }
        if (_tStoreRecordHList != null && !_tStoreRecordHList.isEmpty())
        { sb.append(dm).append("tStoreRecordHList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TReceivePlanH clone() {
        return (TReceivePlanH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
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
     * [get] PROCESS_TYPE_ID: {IX, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProcessTypeId() {
        checkSpecifiedProperty("processTypeId");
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeId(Long processTypeId) {
        registerModifiedProperty("processTypeId");
        _processTypeId = processTypeId;
    }

    /**
     * [get] STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {IX, NotNull, varchar(8)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getReceivePlanDt() {
        checkSpecifiedProperty("receivePlanDt");
        return convertEmptyToNull(_receivePlanDt);
    }

    /**
     * [set] RECEIVE_PLAN_DT: {IX, NotNull, varchar(8)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        registerModifiedProperty("receivePlanDt");
        _receivePlanDt = receivePlanDt;
    }

    /**
     * [get] PLAN_CLIENT_RECEIVE_NO: {IX, varchar(30)} <br>
     * 予定顧客入荷指示No.
     * @return The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanClientReceiveNo() {
        checkSpecifiedProperty("planClientReceiveNo");
        return convertEmptyToNull(_planClientReceiveNo);
    }

    /**
     * [set] PLAN_CLIENT_RECEIVE_NO: {IX, varchar(30)} <br>
     * 予定顧客入荷指示No.
     * @param planClientReceiveNo The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        registerModifiedProperty("planClientReceiveNo");
        _planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] RECEIVE_SLIP_NO: {IX, NotNull, varchar(30)} <br>
     * WMS入荷伝票No.
     * @return The value of the column 'RECEIVE_SLIP_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveSlipNo() {
        checkSpecifiedProperty("receiveSlipNo");
        return convertEmptyToNull(_receiveSlipNo);
    }

    /**
     * [set] RECEIVE_SLIP_NO: {IX, NotNull, varchar(30)} <br>
     * WMS入荷伝票No.
     * @param receiveSlipNo The value of the column 'RECEIVE_SLIP_NO'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        registerModifiedProperty("receiveSlipNo");
        _receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] PLAN_SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 予定仕入先ID
     * @return The value of the column 'PLAN_SUPPLIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlanSupplierId() {
        checkSpecifiedProperty("planSupplierId");
        return _planSupplierId;
    }

    /**
     * [set] PLAN_SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 予定仕入先ID
     * @param planSupplierId The value of the column 'PLAN_SUPPLIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanSupplierId(Long planSupplierId) {
        registerModifiedProperty("planSupplierId");
        _planSupplierId = planSupplierId;
    }

    /**
     * [get] PLAN_SUPPLIER_CD: {IX, varchar(30)} <br>
     * 予定仕入先CD
     * @return The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanSupplierCd() {
        checkSpecifiedProperty("planSupplierCd");
        return convertEmptyToNull(_planSupplierCd);
    }

    /**
     * [set] PLAN_SUPPLIER_CD: {IX, varchar(30)} <br>
     * 予定仕入先CD
     * @param planSupplierCd The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        registerModifiedProperty("planSupplierCd");
        _planSupplierCd = planSupplierCd;
    }

    /**
     * [get] PLAN_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 予定預託ID
     * @return The value of the column 'PLAN_DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlanDepositId() {
        checkSpecifiedProperty("planDepositId");
        return _planDepositId;
    }

    /**
     * [set] PLAN_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 予定預託ID
     * @param planDepositId The value of the column 'PLAN_DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanDepositId(Long planDepositId) {
        registerModifiedProperty("planDepositId");
        _planDepositId = planDepositId;
    }

    /**
     * [get] PLAN_DEPOSIT_CD: {varchar(30)} <br>
     * 予定預託CD
     * @return The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanDepositCd() {
        checkSpecifiedProperty("planDepositCd");
        return convertEmptyToNull(_planDepositCd);
    }

    /**
     * [set] PLAN_DEPOSIT_CD: {varchar(30)} <br>
     * 予定預託CD
     * @param planDepositCd The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanDepositCd(String planDepositCd) {
        registerModifiedProperty("planDepositCd");
        _planDepositCd = planDepositCd;
    }

    /**
     * [get] RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @return The value of the column 'RECEIVE_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveStatus() {
        checkSpecifiedProperty("receiveStatus");
        return convertEmptyToNull(_receiveStatus);
    }

    /**
     * [set] RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param receiveStatus The value of the column 'RECEIVE_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveStatus(String receiveStatus) {
        registerModifiedProperty("receiveStatus");
        _receiveStatus = receiveStatus;
    }

    /**
     * [get] INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getInputType() {
        checkSpecifiedProperty("inputType");
        return convertEmptyToNull(_inputType);
    }

    /**
     * [set] INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setInputType(String inputType) {
        registerModifiedProperty("inputType");
        _inputType = inputType;
    }

    /**
     * [get] RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @return The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDeliveryStatus() {
        checkSpecifiedProperty("receiveDeliveryStatus");
        return convertEmptyToNull(_receiveDeliveryStatus);
    }

    /**
     * [set] RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param receiveDeliveryStatus The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDeliveryStatus(String receiveDeliveryStatus) {
        registerModifiedProperty("receiveDeliveryStatus");
        _receiveDeliveryStatus = receiveDeliveryStatus;
    }

    /**
     * [get] OLD_RECEIVE_PLAN_H_ID: {IX, bigint(19), FK to T_RECEIVE_PLAN_H} <br>
     * 元入荷予定ヘッダID
     * @return The value of the column 'OLD_RECEIVE_PLAN_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOldReceivePlanHId() {
        checkSpecifiedProperty("oldReceivePlanHId");
        return _oldReceivePlanHId;
    }

    /**
     * [set] OLD_RECEIVE_PLAN_H_ID: {IX, bigint(19), FK to T_RECEIVE_PLAN_H} <br>
     * 元入荷予定ヘッダID
     * @param oldReceivePlanHId The value of the column 'OLD_RECEIVE_PLAN_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOldReceivePlanHId(Long oldReceivePlanHId) {
        registerModifiedProperty("oldReceivePlanHId");
        _oldReceivePlanHId = oldReceivePlanHId;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
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
     * [get] CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * 拠点間移動フラグ
     * @return The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterTransitFlg() {
        checkSpecifiedProperty("centerTransitFlg");
        return convertEmptyToNull(_centerTransitFlg);
    }

    /**
     * [set] CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * 拠点間移動フラグ
     * @param centerTransitFlg The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterTransitFlg(String centerTransitFlg) {
        registerModifiedProperty("centerTransitFlg");
        _centerTransitFlg = centerTransitFlg;
    }

    /**
     * [get] PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} <br>
     * 拠点間移動出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} <br>
     * 拠点間移動出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
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
