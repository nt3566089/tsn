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
 * The entity of T_PICKING_H as TABLE. <br>
 * 出庫ヘッダ
 * <pre>
 * [primary-key]
 *     PICKING_H_ID
 *
 * [column]
 *     PICKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PICKING_STATUS, DELIV_UNIT_NO, PICKING_WORK_NO, ALLOC_INST_H_ID, FORCE_FIXED_FLG, PICKING_GROUP_NO, SGL_ROW_PIC_FLG, SHIPPING_FIXED_DT, CENTER_TRANSIT_FLG, PACKING_CAL_CLS, BOL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_H, M_CENTER, M_CLIENT, M_PROCESS_TYPE, B_CLASS_DTL(ByCenterTransitFlg), T_PICKING_R(AsOne)
 *
 * [referrer table]
 *     T_PACKING_H, T_PICKING_B, T_PIC_MTHD_RCMD_DATA, T_RECEIVE_PLAN_H, W_SGL_ROW_SHIP_INSP_B, T_PICKING_R
 *
 * [foreign property]
 *     tAllocInstH, mCenter, mClient, mProcessType, bClassDtlByCenterTransitFlg, bClassDtlByForceFixedFlg, bClassDtlByPackingCalCls, bClassDtlByPickingStatus, bClassDtlBySglRowPicFlg, tPickingRAsOne
 *
 * [referrer property]
 *     tPackingHList, tPickingBList, tPicMthdRcmdDataList, tReceivePlanHList, wSglRowShipInspBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long pickingHId = entity.getPickingHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long processTypeId = entity.getProcessTypeId();
 * String pickingStatus = entity.getPickingStatus();
 * String delivUnitNo = entity.getDelivUnitNo();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * Long allocInstHId = entity.getAllocInstHId();
 * String forceFixedFlg = entity.getForceFixedFlg();
 * String pickingGroupNo = entity.getPickingGroupNo();
 * String sglRowPicFlg = entity.getSglRowPicFlg();
 * String shippingFixedDt = entity.getShippingFixedDt();
 * String centerTransitFlg = entity.getCenterTransitFlg();
 * String packingCalCls = entity.getPackingCalCls();
 * String bolNo = entity.getBolNo();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPickingHId(pickingHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setProcessTypeId(processTypeId);
 * entity.setPickingStatus(pickingStatus);
 * entity.setDelivUnitNo(delivUnitNo);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setAllocInstHId(allocInstHId);
 * entity.setForceFixedFlg(forceFixedFlg);
 * entity.setPickingGroupNo(pickingGroupNo);
 * entity.setSglRowPicFlg(sglRowPicFlg);
 * entity.setShippingFixedDt(shippingFixedDt);
 * entity.setCenterTransitFlg(centerTransitFlg);
 * entity.setPackingCalCls(packingCalCls);
 * entity.setBolNo(bolNo);
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
public abstract class BsTPickingH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _pickingHId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    protected Long _processTypeId;

    /** PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus} */
    protected String _pickingStatus;

    /** DELIV_UNIT_NO: {varchar(30)} */
    protected String _delivUnitNo;

    /** PICKING_WORK_NO: {IX, varchar(30)} */
    protected String _pickingWorkNo;

    /** ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} */
    protected Long _allocInstHId;

    /** FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} */
    protected String _forceFixedFlg;

    /** PICKING_GROUP_NO: {varchar(30)} */
    protected String _pickingGroupNo;

    /** SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} */
    protected String _sglRowPicFlg;

    /** SHIPPING_FIXED_DT: {varchar(8)} */
    protected String _shippingFixedDt;

    /** CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} */
    protected String _centerTransitFlg;

    /** PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls} */
    protected String _packingCalCls;

    /** BOL_NO: {varchar(30)} */
    protected String _bolNo;

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
        return "T_PICKING_H";
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
        if (_pickingHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of pickingStatus as the classification of PickingStatus. <br>
     * PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PickingStatus getPickingStatusAsPickingStatus() {
        return CDef.PickingStatus.codeOf(getPickingStatus());
    }

    /**
     * Set the value of pickingStatus as the classification of PickingStatus. <br>
     * PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPickingStatusAsPickingStatus(CDef.PickingStatus cdef) {
        setPickingStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of forceFixedFlg as the classification of ForceFixedFlg. <br>
     * FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ForceFixedFlg getForceFixedFlgAsForceFixedFlg() {
        return CDef.ForceFixedFlg.codeOf(getForceFixedFlg());
    }

    /**
     * Set the value of forceFixedFlg as the classification of ForceFixedFlg. <br>
     * FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setForceFixedFlgAsForceFixedFlg(CDef.ForceFixedFlg cdef) {
        setForceFixedFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of sglRowPicFlg as the classification of SglRowPicFlg. <br>
     * SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SglRowPicFlg getSglRowPicFlgAsSglRowPicFlg() {
        return CDef.SglRowPicFlg.codeOf(getSglRowPicFlg());
    }

    /**
     * Set the value of sglRowPicFlg as the classification of SglRowPicFlg. <br>
     * SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg cdef) {
        setSglRowPicFlg(cdef != null ? cdef.code() : null);
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
     * Get the value of packingCalCls as the classification of PackingCalCls. <br>
     * PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PackingCalCls getPackingCalClsAsPackingCalCls() {
        return CDef.PackingCalCls.codeOf(getPackingCalCls());
    }

    /**
     * Set the value of packingCalCls as the classification of PackingCalCls. <br>
     * PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingCalClsAsPackingCalCls(CDef.PackingCalCls cdef) {
        setPackingCalCls(cdef != null ? cdef.code() : null);
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
     * Set the value of pickingStatus as $10 (10). <br>
     * $10: 未出荷
     */
    public void setPickingStatus_$10() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$10);
    }

    /**
     * Set the value of pickingStatus as $15 (15). <br>
     * $15: 出庫指示中
     */
    public void setPickingStatus_$15() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$15);
    }

    /**
     * Set the value of pickingStatus as $20 (20). <br>
     * $20: 出庫指示解除中
     */
    public void setPickingStatus_$20() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$20);
    }

    /**
     * Set the value of pickingStatus as $25 (25). <br>
     * $25: 出庫指示済
     */
    public void setPickingStatus_$25() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$25);
    }

    /**
     * Set the value of pickingStatus as $30 (30). <br>
     * $30: ピッキング中
     */
    public void setPickingStatus_$30() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$30);
    }

    /**
     * Set the value of pickingStatus as $35 (35). <br>
     * $35: ピッキング済
     */
    public void setPickingStatus_$35() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$35);
    }

    /**
     * Set the value of pickingStatus as $40 (40). <br>
     * $40: 出荷検品中
     */
    public void setPickingStatus_$40() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$40);
    }

    /**
     * Set the value of pickingStatus as $45 (45). <br>
     * $45: 出荷検品中断
     */
    public void setPickingStatus_$45() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$45);
    }

    /**
     * Set the value of pickingStatus as $50 (50). <br>
     * $50: 出荷検品済
     */
    public void setPickingStatus_$50() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$50);
    }

    /**
     * Set the value of pickingStatus as $55 (55). <br>
     * $55: 出荷確定済
     */
    public void setPickingStatus_$55() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$55);
    }

    /**
     * Set the value of pickingStatus as $90 (90). <br>
     * $90: キャンセル
     */
    public void setPickingStatus_$90() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$90);
    }

    /**
     * Set the value of pickingStatus as $99 (99). <br>
     * $99: エラー有
     */
    public void setPickingStatus_$99() {
        setPickingStatusAsPickingStatus(CDef.PickingStatus.$99);
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
     * Set the value of sglRowPicFlg as $0 (0). <br>
     * $0: 単行ピック無
     */
    public void setSglRowPicFlg_$0() {
        setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.$0);
    }

    /**
     * Set the value of sglRowPicFlg as $1 (1). <br>
     * $1: 単行ピック有
     */
    public void setSglRowPicFlg_$1() {
        setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.$1);
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
     * Set the value of packingCalCls as $0 (0). <br>
     * $0: 梱包計算無
     */
    public void setPackingCalCls_$0() {
        setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.$0);
    }

    /**
     * Set the value of packingCalCls as $1 (1). <br>
     * $1: 容積と重量による梱包計算
     */
    public void setPackingCalCls_$1() {
        setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.$1);
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
     * Is the value of pickingStatus $10? <br>
     * $10: 未出荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$10() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$10) : false;
    }

    /**
     * Is the value of pickingStatus $15? <br>
     * $15: 出庫指示中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$15() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$15) : false;
    }

    /**
     * Is the value of pickingStatus $20? <br>
     * $20: 出庫指示解除中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$20() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$20) : false;
    }

    /**
     * Is the value of pickingStatus $25? <br>
     * $25: 出庫指示済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$25() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$25) : false;
    }

    /**
     * Is the value of pickingStatus $30? <br>
     * $30: ピッキング中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$30() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$30) : false;
    }

    /**
     * Is the value of pickingStatus $35? <br>
     * $35: ピッキング済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$35() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$35) : false;
    }

    /**
     * Is the value of pickingStatus $40? <br>
     * $40: 出荷検品中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$40() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$40) : false;
    }

    /**
     * Is the value of pickingStatus $45? <br>
     * $45: 出荷検品中断
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$45() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$45) : false;
    }

    /**
     * Is the value of pickingStatus $50? <br>
     * $50: 出荷検品済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$50() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$50) : false;
    }

    /**
     * Is the value of pickingStatus $55? <br>
     * $55: 出荷確定済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$55() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$55) : false;
    }

    /**
     * Is the value of pickingStatus $90? <br>
     * $90: キャンセル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$90() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$90) : false;
    }

    /**
     * Is the value of pickingStatus $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingStatus$99() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
        return cdef != null ? cdef.equals(CDef.PickingStatus.$99) : false;
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
     * Is the value of sglRowPicFlg $0? <br>
     * $0: 単行ピック無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowPicFlg$0() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
        return cdef != null ? cdef.equals(CDef.SglRowPicFlg.$0) : false;
    }

    /**
     * Is the value of sglRowPicFlg $1? <br>
     * $1: 単行ピック有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowPicFlg$1() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
        return cdef != null ? cdef.equals(CDef.SglRowPicFlg.$1) : false;
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
     * Is the value of packingCalCls $0? <br>
     * $0: 梱包計算無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingCalCls$0() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.equals(CDef.PackingCalCls.$0) : false;
    }

    /**
     * Is the value of packingCalCls $1? <br>
     * $1: 容積と重量による梱包計算
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingCalCls$1() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.equals(CDef.PackingCalCls.$1) : false;
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
     * Get the value of the column 'pickingStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPickingStatusName() {
        CDef.PickingStatus cdef = getPickingStatusAsPickingStatus();
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
     * Get the value of the column 'sglRowPicFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSglRowPicFlgName() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
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
     * Get the value of the column 'packingCalCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingCalClsName() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
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

    /** B_CLASS_DTL by my FORCE_FIXED_FLG, named 'BClassDtlByForceFixedFlg'. */
    protected BClassDtl _bClassDtlByForceFixedFlg;

    /**
     * [get] B_CLASS_DTL by my FORCE_FIXED_FLG, named 'BClassDtlByForceFixedFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByForceFixedFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByForceFixedFlg() {
        return _bClassDtlByForceFixedFlg;
    }

    /**
     * [set] B_CLASS_DTL by my FORCE_FIXED_FLG, named 'BClassDtlByForceFixedFlg'.
     * @param bClassDtlByForceFixedFlg The entity of foreign property 'BClassDtlByForceFixedFlg'. (NullAllowed)
     */
    public void setBClassDtlByForceFixedFlg(BClassDtl bClassDtlByForceFixedFlg) {
        _bClassDtlByForceFixedFlg = bClassDtlByForceFixedFlg;
    }

    /** B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'. */
    protected BClassDtl _bClassDtlByPackingCalCls;

    /**
     * [get] B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'. <br>
     * @return The entity of foreign property 'BClassDtlByPackingCalCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPackingCalCls() {
        return _bClassDtlByPackingCalCls;
    }

    /**
     * [set] B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * @param bClassDtlByPackingCalCls The entity of foreign property 'BClassDtlByPackingCalCls'. (NullAllowed)
     */
    public void setBClassDtlByPackingCalCls(BClassDtl bClassDtlByPackingCalCls) {
        _bClassDtlByPackingCalCls = bClassDtlByPackingCalCls;
    }

    /** B_CLASS_DTL by my PICKING_STATUS, named 'BClassDtlByPickingStatus'. */
    protected BClassDtl _bClassDtlByPickingStatus;

    /**
     * [get] B_CLASS_DTL by my PICKING_STATUS, named 'BClassDtlByPickingStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByPickingStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPickingStatus() {
        return _bClassDtlByPickingStatus;
    }

    /**
     * [set] B_CLASS_DTL by my PICKING_STATUS, named 'BClassDtlByPickingStatus'.
     * @param bClassDtlByPickingStatus The entity of foreign property 'BClassDtlByPickingStatus'. (NullAllowed)
     */
    public void setBClassDtlByPickingStatus(BClassDtl bClassDtlByPickingStatus) {
        _bClassDtlByPickingStatus = bClassDtlByPickingStatus;
    }

    /** B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'. */
    protected BClassDtl _bClassDtlBySglRowPicFlg;

    /**
     * [get] B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'. <br>
     * @return The entity of foreign property 'BClassDtlBySglRowPicFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySglRowPicFlg() {
        return _bClassDtlBySglRowPicFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * @param bClassDtlBySglRowPicFlg The entity of foreign property 'BClassDtlBySglRowPicFlg'. (NullAllowed)
     */
    public void setBClassDtlBySglRowPicFlg(BClassDtl bClassDtlBySglRowPicFlg) {
        _bClassDtlBySglRowPicFlg = bClassDtlBySglRowPicFlg;
    }

    /** T_PICKING_R by PICKING_H_ID, named 'TPickingRAsOne'. */
    protected TPickingR _tPickingRAsOne;

    /**
     * [get] T_PICKING_R by PICKING_H_ID, named 'TPickingRAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TPickingRAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TPickingR getTPickingRAsOne() {
        return _tPickingRAsOne;
    }

    /**
     * [set] T_PICKING_R by PICKING_H_ID, named 'TPickingRAsOne'.
     * @param TPickingRAsOne The entity of foreign property(referrer-as-one) 'TPickingRAsOne'. (NullAllowed)
     */
    public void setTPickingRAsOne(TPickingR TPickingRAsOne) {
        _tPickingRAsOne = TPickingRAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_PACKING_H by PICKING_H_ID, named 'TPackingHList'. */
    protected List<TPackingH> _tPackingHList;

    /**
     * [get] T_PACKING_H by PICKING_H_ID, named 'TPackingHList'.
     * @return The entity list of referrer property 'TPackingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = newReferrerList(); }
        return _tPackingHList;
    }

    /**
     * [set] T_PACKING_H by PICKING_H_ID, named 'TPackingHList'.
     * @param tPackingHList The entity list of referrer property 'TPackingHList'. (NullAllowed)
     */
    public void setTPackingHList(List<TPackingH> tPackingHList) {
        _tPackingHList = tPackingHList;
    }

    /** T_PICKING_B by PICKING_H_ID, named 'TPickingBList'. */
    protected List<TPickingB> _tPickingBList;

    /**
     * [get] T_PICKING_B by PICKING_H_ID, named 'TPickingBList'.
     * @return The entity list of referrer property 'TPickingBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingB> getTPickingBList() {
        if (_tPickingBList == null) { _tPickingBList = newReferrerList(); }
        return _tPickingBList;
    }

    /**
     * [set] T_PICKING_B by PICKING_H_ID, named 'TPickingBList'.
     * @param tPickingBList The entity list of referrer property 'TPickingBList'. (NullAllowed)
     */
    public void setTPickingBList(List<TPickingB> tPickingBList) {
        _tPickingBList = tPickingBList;
    }

    /** T_PIC_MTHD_RCMD_DATA by PICKING_H_ID, named 'TPicMthdRcmdDataList'. */
    protected List<TPicMthdRcmdData> _tPicMthdRcmdDataList;

    /**
     * [get] T_PIC_MTHD_RCMD_DATA by PICKING_H_ID, named 'TPicMthdRcmdDataList'.
     * @return The entity list of referrer property 'TPicMthdRcmdDataList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPicMthdRcmdData> getTPicMthdRcmdDataList() {
        if (_tPicMthdRcmdDataList == null) { _tPicMthdRcmdDataList = newReferrerList(); }
        return _tPicMthdRcmdDataList;
    }

    /**
     * [set] T_PIC_MTHD_RCMD_DATA by PICKING_H_ID, named 'TPicMthdRcmdDataList'.
     * @param tPicMthdRcmdDataList The entity list of referrer property 'TPicMthdRcmdDataList'. (NullAllowed)
     */
    public void setTPicMthdRcmdDataList(List<TPicMthdRcmdData> tPicMthdRcmdDataList) {
        _tPicMthdRcmdDataList = tPicMthdRcmdDataList;
    }

    /** T_RECEIVE_PLAN_H by PICKING_H_ID, named 'TReceivePlanHList'. */
    protected List<TReceivePlanH> _tReceivePlanHList;

    /**
     * [get] T_RECEIVE_PLAN_H by PICKING_H_ID, named 'TReceivePlanHList'.
     * @return The entity list of referrer property 'TReceivePlanHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = newReferrerList(); }
        return _tReceivePlanHList;
    }

    /**
     * [set] T_RECEIVE_PLAN_H by PICKING_H_ID, named 'TReceivePlanHList'.
     * @param tReceivePlanHList The entity list of referrer property 'TReceivePlanHList'. (NullAllowed)
     */
    public void setTReceivePlanHList(List<TReceivePlanH> tReceivePlanHList) {
        _tReceivePlanHList = tReceivePlanHList;
    }

    /** W_SGL_ROW_SHIP_INSP_B by PICKING_H_ID, named 'WSglRowShipInspBList'. */
    protected List<WSglRowShipInspB> _wSglRowShipInspBList;

    /**
     * [get] W_SGL_ROW_SHIP_INSP_B by PICKING_H_ID, named 'WSglRowShipInspBList'.
     * @return The entity list of referrer property 'WSglRowShipInspBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspB> getWSglRowShipInspBList() {
        if (_wSglRowShipInspBList == null) { _wSglRowShipInspBList = newReferrerList(); }
        return _wSglRowShipInspBList;
    }

    /**
     * [set] W_SGL_ROW_SHIP_INSP_B by PICKING_H_ID, named 'WSglRowShipInspBList'.
     * @param wSglRowShipInspBList The entity list of referrer property 'WSglRowShipInspBList'. (NullAllowed)
     */
    public void setWSglRowShipInspBList(List<WSglRowShipInspB> wSglRowShipInspBList) {
        _wSglRowShipInspBList = wSglRowShipInspBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTPickingH) {
            BsTPickingH other = (BsTPickingH)obj;
            if (!xSV(_pickingHId, other._pickingHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pickingHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tAllocInstH != null)
        { sb.append(li).append(xbRDS(_tAllocInstH, "tAllocInstH")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_bClassDtlByCenterTransitFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCenterTransitFlg, "bClassDtlByCenterTransitFlg")); }
        if (_bClassDtlByForceFixedFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByForceFixedFlg, "bClassDtlByForceFixedFlg")); }
        if (_bClassDtlByPackingCalCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPackingCalCls, "bClassDtlByPackingCalCls")); }
        if (_bClassDtlByPickingStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPickingStatus, "bClassDtlByPickingStatus")); }
        if (_bClassDtlBySglRowPicFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySglRowPicFlg, "bClassDtlBySglRowPicFlg")); }
        if (_tPickingRAsOne != null)
        { sb.append(li).append(xbRDS(_tPickingRAsOne, "tPickingRAsOne")); }
        if (_tPackingHList != null) { for (TPackingH et : _tPackingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingHList")); } } }
        if (_tPickingBList != null) { for (TPickingB et : _tPickingBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingBList")); } } }
        if (_tPicMthdRcmdDataList != null) { for (TPicMthdRcmdData et : _tPicMthdRcmdDataList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPicMthdRcmdDataList")); } } }
        if (_tReceivePlanHList != null) { for (TReceivePlanH et : _tReceivePlanHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHList")); } } }
        if (_wSglRowShipInspBList != null) { for (WSglRowShipInspB et : _wSglRowShipInspBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wSglRowShipInspBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_pickingStatus));
        sb.append(dm).append(xfND(_delivUnitNo));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_forceFixedFlg));
        sb.append(dm).append(xfND(_pickingGroupNo));
        sb.append(dm).append(xfND(_sglRowPicFlg));
        sb.append(dm).append(xfND(_shippingFixedDt));
        sb.append(dm).append(xfND(_centerTransitFlg));
        sb.append(dm).append(xfND(_packingCalCls));
        sb.append(dm).append(xfND(_bolNo));
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
        if (_tAllocInstH != null)
        { sb.append(dm).append("tAllocInstH"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_bClassDtlByCenterTransitFlg != null)
        { sb.append(dm).append("bClassDtlByCenterTransitFlg"); }
        if (_bClassDtlByForceFixedFlg != null)
        { sb.append(dm).append("bClassDtlByForceFixedFlg"); }
        if (_bClassDtlByPackingCalCls != null)
        { sb.append(dm).append("bClassDtlByPackingCalCls"); }
        if (_bClassDtlByPickingStatus != null)
        { sb.append(dm).append("bClassDtlByPickingStatus"); }
        if (_bClassDtlBySglRowPicFlg != null)
        { sb.append(dm).append("bClassDtlBySglRowPicFlg"); }
        if (_tPickingRAsOne != null)
        { sb.append(dm).append("tPickingRAsOne"); }
        if (_tPackingHList != null && !_tPackingHList.isEmpty())
        { sb.append(dm).append("tPackingHList"); }
        if (_tPickingBList != null && !_tPickingBList.isEmpty())
        { sb.append(dm).append("tPickingBList"); }
        if (_tPicMthdRcmdDataList != null && !_tPicMthdRcmdDataList.isEmpty())
        { sb.append(dm).append("tPicMthdRcmdDataList"); }
        if (_tReceivePlanHList != null && !_tReceivePlanHList.isEmpty())
        { sb.append(dm).append("tReceivePlanHList"); }
        if (_wSglRowShipInspBList != null && !_wSglRowShipInspBList.isEmpty())
        { sb.append(dm).append("wSglRowShipInspBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TPickingH clone() {
        return (TPickingH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
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
     * [get] PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @return The value of the column 'PICKING_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingStatus() {
        checkSpecifiedProperty("pickingStatus");
        return convertEmptyToNull(_pickingStatus);
    }

    /**
     * [set] PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @param pickingStatus The value of the column 'PICKING_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingStatus(String pickingStatus) {
        registerModifiedProperty("pickingStatus");
        _pickingStatus = pickingStatus;
    }

    /**
     * [get] DELIV_UNIT_NO: {varchar(30)} <br>
     * 届先単位No.
     * @return The value of the column 'DELIV_UNIT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivUnitNo() {
        checkSpecifiedProperty("delivUnitNo");
        return convertEmptyToNull(_delivUnitNo);
    }

    /**
     * [set] DELIV_UNIT_NO: {varchar(30)} <br>
     * 届先単位No.
     * @param delivUnitNo The value of the column 'DELIV_UNIT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivUnitNo(String delivUnitNo) {
        registerModifiedProperty("delivUnitNo");
        _delivUnitNo = delivUnitNo;
    }

    /**
     * [get] PICKING_WORK_NO: {IX, varchar(30)} <br>
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {IX, varchar(30)} <br>
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
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
     * [get] FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @return The value of the column 'FORCE_FIXED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForceFixedFlg() {
        checkSpecifiedProperty("forceFixedFlg");
        return convertEmptyToNull(_forceFixedFlg);
    }

    /**
     * [set] FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @param forceFixedFlg The value of the column 'FORCE_FIXED_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForceFixedFlg(String forceFixedFlg) {
        registerModifiedProperty("forceFixedFlg");
        _forceFixedFlg = forceFixedFlg;
    }

    /**
     * [get] PICKING_GROUP_NO: {varchar(30)} <br>
     * ピッキンググループNo.
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingGroupNo() {
        checkSpecifiedProperty("pickingGroupNo");
        return convertEmptyToNull(_pickingGroupNo);
    }

    /**
     * [set] PICKING_GROUP_NO: {varchar(30)} <br>
     * ピッキンググループNo.
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        registerModifiedProperty("pickingGroupNo");
        _pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @return The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSglRowPicFlg() {
        checkSpecifiedProperty("sglRowPicFlg");
        return convertEmptyToNull(_sglRowPicFlg);
    }

    /**
     * [set] SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param sglRowPicFlg The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSglRowPicFlg(String sglRowPicFlg) {
        registerModifiedProperty("sglRowPicFlg");
        _sglRowPicFlg = sglRowPicFlg;
    }

    /**
     * [get] SHIPPING_FIXED_DT: {varchar(8)} <br>
     * 出荷確定日
     * @return The value of the column 'SHIPPING_FIXED_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingFixedDt() {
        checkSpecifiedProperty("shippingFixedDt");
        return convertEmptyToNull(_shippingFixedDt);
    }

    /**
     * [set] SHIPPING_FIXED_DT: {varchar(8)} <br>
     * 出荷確定日
     * @param shippingFixedDt The value of the column 'SHIPPING_FIXED_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingFixedDt(String shippingFixedDt) {
        registerModifiedProperty("shippingFixedDt");
        _shippingFixedDt = shippingFixedDt;
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
     * [get] PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingCalCls() {
        checkSpecifiedProperty("packingCalCls");
        return convertEmptyToNull(_packingCalCls);
    }

    /**
     * [set] PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingCalCls(String packingCalCls) {
        registerModifiedProperty("packingCalCls");
        _packingCalCls = packingCalCls;
    }

    /**
     * [get] BOL_NO: {varchar(30)} <br>
     * Bill of Lading No.
     * @return The value of the column 'BOL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBolNo() {
        checkSpecifiedProperty("bolNo");
        return convertEmptyToNull(_bolNo);
    }

    /**
     * [set] BOL_NO: {varchar(30)} <br>
     * Bill of Lading No.
     * @param bolNo The value of the column 'BOL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolNo(String bolNo) {
        registerModifiedProperty("bolNo");
        _bolNo = bolNo;
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
