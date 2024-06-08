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
 * The entity of T_PACKING_H as TABLE. <br>
 * 梱包ヘッダ
 * <pre>
 * [primary-key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PACKING_STATUS, ALLOC_INST_H_ID, PICKING_H_ID, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, BOX_ID, GROSS_WEIGHT, TOTAL_VOLUME, MIXED_FLG, MULTI_PIC_FLG, CART_NO, BUCKET_COL_NO, BUCKET_ROW_NO, SEEDING_NO, LOADING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_PICKING_H, M_CENTER, M_BOX, T_ALLOC_INST_H, M_CLIENT, M_PROCESS_TYPE, B_USER(ByUpdUser), B_CLASS_DTL(ByLoadingFlg), T_PACKING_R(AsOne)
 *
 * [referrer table]
 *     T_PACKING_B, T_PIC_MTHD_RCMD_CART, T_PACKING_R
 *
 * [foreign property]
 *     tPickingH, mCenter, mBox, tAllocInstH, mClient, mProcessType, bUserByUpdUser, bClassDtlByLoadingFlg, bClassDtlByMixedFlg, bClassDtlByMultiPicFlg, bClassDtlByPackingStatus, tPackingRAsOne
 *
 * [referrer property]
 *     tPackingBList, tPicMthdRcmdCartList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long packingHId = entity.getPackingHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long processTypeId = entity.getProcessTypeId();
 * String packingStatus = entity.getPackingStatus();
 * Long allocInstHId = entity.getAllocInstHId();
 * Long pickingHId = entity.getPickingHId();
 * String shippingPackingNo = entity.getShippingPackingNo();
 * String carrierTraceNum = entity.getCarrierTraceNum();
 * Long boxId = entity.getBoxId();
 * java.math.BigDecimal grossWeight = entity.getGrossWeight();
 * java.math.BigDecimal totalVolume = entity.getTotalVolume();
 * String mixedFlg = entity.getMixedFlg();
 * String multiPicFlg = entity.getMultiPicFlg();
 * Long cartNo = entity.getCartNo();
 * Long bucketColNo = entity.getBucketColNo();
 * Long bucketRowNo = entity.getBucketRowNo();
 * String seedingNo = entity.getSeedingNo();
 * String loadingFlg = entity.getLoadingFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPackingHId(packingHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setProcessTypeId(processTypeId);
 * entity.setPackingStatus(packingStatus);
 * entity.setAllocInstHId(allocInstHId);
 * entity.setPickingHId(pickingHId);
 * entity.setShippingPackingNo(shippingPackingNo);
 * entity.setCarrierTraceNum(carrierTraceNum);
 * entity.setBoxId(boxId);
 * entity.setGrossWeight(grossWeight);
 * entity.setTotalVolume(totalVolume);
 * entity.setMixedFlg(mixedFlg);
 * entity.setMultiPicFlg(multiPicFlg);
 * entity.setCartNo(cartNo);
 * entity.setBucketColNo(bucketColNo);
 * entity.setBucketRowNo(bucketRowNo);
 * entity.setSeedingNo(seedingNo);
 * entity.setLoadingFlg(loadingFlg);
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
public abstract class BsTPackingH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _packingHId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    protected Long _processTypeId;

    /** PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} */
    protected String _packingStatus;

    /** ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} */
    protected Long _allocInstHId;

    /** PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} */
    protected Long _pickingHId;

    /** SHIPPING_PACKING_NO: {varchar(30)} */
    protected String _shippingPackingNo;

    /** CARRIER_TRACE_NUM: {varchar(30)} */
    protected String _carrierTraceNum;

    /** BOX_ID: {IX, bigint(19), FK to M_BOX} */
    protected Long _boxId;

    /** GROSS_WEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _grossWeight;

    /** TOTAL_VOLUME: {decimal(16, 6)} */
    protected java.math.BigDecimal _totalVolume;

    /** MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} */
    protected String _mixedFlg;

    /** MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} */
    protected String _multiPicFlg;

    /** CART_NO: {bigint(19)} */
    protected Long _cartNo;

    /** BUCKET_COL_NO: {bigint(19)} */
    protected Long _bucketColNo;

    /** BUCKET_ROW_NO: {bigint(19)} */
    protected Long _bucketRowNo;

    /** SEEDING_NO: {varchar(30)} */
    protected String _seedingNo;

    /** LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} */
    protected String _loadingFlg;

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

    /** UPD_USER: {varchar(255), FK to B_USER} */
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
        return "T_PACKING_H";
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
        if (_packingHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of packingStatus as the classification of PackingStatus. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PackingStatus getPackingStatusAsPackingStatus() {
        return CDef.PackingStatus.codeOf(getPackingStatus());
    }

    /**
     * Set the value of packingStatus as the classification of PackingStatus. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingStatusAsPackingStatus(CDef.PackingStatus cdef) {
        setPackingStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of mixedFlg as the classification of MixedFlg. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MixedFlg getMixedFlgAsMixedFlg() {
        return CDef.MixedFlg.codeOf(getMixedFlg());
    }

    /**
     * Set the value of mixedFlg as the classification of MixedFlg. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMixedFlgAsMixedFlg(CDef.MixedFlg cdef) {
        setMixedFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of multiPicFlg as the classification of MultiPicFlg. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MultiPicFlg getMultiPicFlgAsMultiPicFlg() {
        return CDef.MultiPicFlg.codeOf(getMultiPicFlg());
    }

    /**
     * Set the value of multiPicFlg as the classification of MultiPicFlg. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMultiPicFlgAsMultiPicFlg(CDef.MultiPicFlg cdef) {
        setMultiPicFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of loadingFlg as the classification of LoadingFlg. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LoadingFlg getLoadingFlgAsLoadingFlg() {
        return CDef.LoadingFlg.codeOf(getLoadingFlg());
    }

    /**
     * Set the value of loadingFlg as the classification of LoadingFlg. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLoadingFlgAsLoadingFlg(CDef.LoadingFlg cdef) {
        setLoadingFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of packingStatus as $10 (10). <br>
     * $10: 未出荷
     */
    public void setPackingStatus_$10() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$10);
    }

    /**
     * Set the value of packingStatus as $15 (15). <br>
     * $15: 出庫指示中
     */
    public void setPackingStatus_$15() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$15);
    }

    /**
     * Set the value of packingStatus as $20 (20). <br>
     * $20: 出庫指示解除中
     */
    public void setPackingStatus_$20() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$20);
    }

    /**
     * Set the value of packingStatus as $25 (25). <br>
     * $25: 出庫指示済
     */
    public void setPackingStatus_$25() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$25);
    }

    /**
     * Set the value of packingStatus as $30 (30). <br>
     * $30: ピッキング中
     */
    public void setPackingStatus_$30() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$30);
    }

    /**
     * Set the value of packingStatus as $35 (35). <br>
     * $35: ピッキング済
     */
    public void setPackingStatus_$35() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$35);
    }

    /**
     * Set the value of packingStatus as $40 (40). <br>
     * $40: 出荷検品中
     */
    public void setPackingStatus_$40() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$40);
    }

    /**
     * Set the value of packingStatus as $45 (45). <br>
     * $45: 出荷検品中断
     */
    public void setPackingStatus_$45() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$45);
    }

    /**
     * Set the value of packingStatus as $50 (50). <br>
     * $50: 出荷検品済
     */
    public void setPackingStatus_$50() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$50);
    }

    /**
     * Set the value of packingStatus as $55 (55). <br>
     * $55: 出荷確定済
     */
    public void setPackingStatus_$55() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$55);
    }

    /**
     * Set the value of packingStatus as $90 (90). <br>
     * $90: キャンセル
     */
    public void setPackingStatus_$90() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$90);
    }

    /**
     * Set the value of packingStatus as $99 (99). <br>
     * $99: エラー有
     */
    public void setPackingStatus_$99() {
        setPackingStatusAsPackingStatus(CDef.PackingStatus.$99);
    }

    /**
     * Set the value of mixedFlg as $0 (0). <br>
     * $0: 単品
     */
    public void setMixedFlg_$0() {
        setMixedFlgAsMixedFlg(CDef.MixedFlg.$0);
    }

    /**
     * Set the value of mixedFlg as $1 (1). <br>
     * $1: 混載
     */
    public void setMixedFlg_$1() {
        setMixedFlgAsMixedFlg(CDef.MixedFlg.$1);
    }

    /**
     * Set the value of multiPicFlg as $0 (0). <br>
     * $0: 計算無
     */
    public void setMultiPicFlg_$0() {
        setMultiPicFlgAsMultiPicFlg(CDef.MultiPicFlg.$0);
    }

    /**
     * Set the value of multiPicFlg as $1 (1). <br>
     * $1: 計算有
     */
    public void setMultiPicFlg_$1() {
        setMultiPicFlgAsMultiPicFlg(CDef.MultiPicFlg.$1);
    }

    /**
     * Set the value of loadingFlg as $0 (0). <br>
     * $0: 未検品
     */
    public void setLoadingFlg_$0() {
        setLoadingFlgAsLoadingFlg(CDef.LoadingFlg.$0);
    }

    /**
     * Set the value of loadingFlg as $1 (1). <br>
     * $1: 検品済
     */
    public void setLoadingFlg_$1() {
        setLoadingFlgAsLoadingFlg(CDef.LoadingFlg.$1);
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
     * Is the value of packingStatus $10? <br>
     * $10: 未出荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$10() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$10) : false;
    }

    /**
     * Is the value of packingStatus $15? <br>
     * $15: 出庫指示中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$15() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$15) : false;
    }

    /**
     * Is the value of packingStatus $20? <br>
     * $20: 出庫指示解除中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$20() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$20) : false;
    }

    /**
     * Is the value of packingStatus $25? <br>
     * $25: 出庫指示済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$25() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$25) : false;
    }

    /**
     * Is the value of packingStatus $30? <br>
     * $30: ピッキング中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$30() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$30) : false;
    }

    /**
     * Is the value of packingStatus $35? <br>
     * $35: ピッキング済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$35() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$35) : false;
    }

    /**
     * Is the value of packingStatus $40? <br>
     * $40: 出荷検品中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$40() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$40) : false;
    }

    /**
     * Is the value of packingStatus $45? <br>
     * $45: 出荷検品中断
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$45() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$45) : false;
    }

    /**
     * Is the value of packingStatus $50? <br>
     * $50: 出荷検品済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$50() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$50) : false;
    }

    /**
     * Is the value of packingStatus $55? <br>
     * $55: 出荷確定済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$55() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$55) : false;
    }

    /**
     * Is the value of packingStatus $90? <br>
     * $90: キャンセル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$90() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$90) : false;
    }

    /**
     * Is the value of packingStatus $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingStatus$99() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.equals(CDef.PackingStatus.$99) : false;
    }

    /**
     * Is the value of mixedFlg $0? <br>
     * $0: 単品
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMixedFlg$0() {
        CDef.MixedFlg cdef = getMixedFlgAsMixedFlg();
        return cdef != null ? cdef.equals(CDef.MixedFlg.$0) : false;
    }

    /**
     * Is the value of mixedFlg $1? <br>
     * $1: 混載
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMixedFlg$1() {
        CDef.MixedFlg cdef = getMixedFlgAsMixedFlg();
        return cdef != null ? cdef.equals(CDef.MixedFlg.$1) : false;
    }

    /**
     * Is the value of multiPicFlg $0? <br>
     * $0: 計算無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMultiPicFlg$0() {
        CDef.MultiPicFlg cdef = getMultiPicFlgAsMultiPicFlg();
        return cdef != null ? cdef.equals(CDef.MultiPicFlg.$0) : false;
    }

    /**
     * Is the value of multiPicFlg $1? <br>
     * $1: 計算有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMultiPicFlg$1() {
        CDef.MultiPicFlg cdef = getMultiPicFlgAsMultiPicFlg();
        return cdef != null ? cdef.equals(CDef.MultiPicFlg.$1) : false;
    }

    /**
     * Is the value of loadingFlg $0? <br>
     * $0: 未検品
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoadingFlg$0() {
        CDef.LoadingFlg cdef = getLoadingFlgAsLoadingFlg();
        return cdef != null ? cdef.equals(CDef.LoadingFlg.$0) : false;
    }

    /**
     * Is the value of loadingFlg $1? <br>
     * $1: 検品済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoadingFlg$1() {
        CDef.LoadingFlg cdef = getLoadingFlgAsLoadingFlg();
        return cdef != null ? cdef.equals(CDef.LoadingFlg.$1) : false;
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
     * Get the value of the column 'packingStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingStatusName() {
        CDef.PackingStatus cdef = getPackingStatusAsPackingStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'mixedFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMixedFlgName() {
        CDef.MixedFlg cdef = getMixedFlgAsMixedFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'multiPicFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMultiPicFlgName() {
        CDef.MultiPicFlg cdef = getMultiPicFlgAsMultiPicFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'loadingFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLoadingFlgName() {
        CDef.LoadingFlg cdef = getLoadingFlgAsLoadingFlg();
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

    /** M_BOX by my BOX_ID, named 'MBox'. */
    protected MBox _mBox;

    /**
     * [get] M_BOX by my BOX_ID, named 'MBox'. <br>
     * @return The entity of foreign property 'MBox'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MBox getMBox() {
        return _mBox;
    }

    /**
     * [set] M_BOX by my BOX_ID, named 'MBox'.
     * @param mBox The entity of foreign property 'MBox'. (NullAllowed)
     */
    public void setMBox(MBox mBox) {
        _mBox = mBox;
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

    /** B_USER by my UPD_USER, named 'BUserByUpdUser'. */
    protected BUser _bUserByUpdUser;

    /**
     * [get] B_USER by my UPD_USER, named 'BUserByUpdUser'. <br>
     * @return The entity of foreign property 'BUserByUpdUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByUpdUser() {
        return _bUserByUpdUser;
    }

    /**
     * [set] B_USER by my UPD_USER, named 'BUserByUpdUser'.
     * @param bUserByUpdUser The entity of foreign property 'BUserByUpdUser'. (NullAllowed)
     */
    public void setBUserByUpdUser(BUser bUserByUpdUser) {
        _bUserByUpdUser = bUserByUpdUser;
    }

    /** B_CLASS_DTL by my LOADING_FLG, named 'BClassDtlByLoadingFlg'. */
    protected BClassDtl _bClassDtlByLoadingFlg;

    /**
     * [get] B_CLASS_DTL by my LOADING_FLG, named 'BClassDtlByLoadingFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLoadingFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLoadingFlg() {
        return _bClassDtlByLoadingFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LOADING_FLG, named 'BClassDtlByLoadingFlg'.
     * @param bClassDtlByLoadingFlg The entity of foreign property 'BClassDtlByLoadingFlg'. (NullAllowed)
     */
    public void setBClassDtlByLoadingFlg(BClassDtl bClassDtlByLoadingFlg) {
        _bClassDtlByLoadingFlg = bClassDtlByLoadingFlg;
    }

    /** B_CLASS_DTL by my MIXED_FLG, named 'BClassDtlByMixedFlg'. */
    protected BClassDtl _bClassDtlByMixedFlg;

    /**
     * [get] B_CLASS_DTL by my MIXED_FLG, named 'BClassDtlByMixedFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByMixedFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMixedFlg() {
        return _bClassDtlByMixedFlg;
    }

    /**
     * [set] B_CLASS_DTL by my MIXED_FLG, named 'BClassDtlByMixedFlg'.
     * @param bClassDtlByMixedFlg The entity of foreign property 'BClassDtlByMixedFlg'. (NullAllowed)
     */
    public void setBClassDtlByMixedFlg(BClassDtl bClassDtlByMixedFlg) {
        _bClassDtlByMixedFlg = bClassDtlByMixedFlg;
    }

    /** B_CLASS_DTL by my MULTI_PIC_FLG, named 'BClassDtlByMultiPicFlg'. */
    protected BClassDtl _bClassDtlByMultiPicFlg;

    /**
     * [get] B_CLASS_DTL by my MULTI_PIC_FLG, named 'BClassDtlByMultiPicFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByMultiPicFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMultiPicFlg() {
        return _bClassDtlByMultiPicFlg;
    }

    /**
     * [set] B_CLASS_DTL by my MULTI_PIC_FLG, named 'BClassDtlByMultiPicFlg'.
     * @param bClassDtlByMultiPicFlg The entity of foreign property 'BClassDtlByMultiPicFlg'. (NullAllowed)
     */
    public void setBClassDtlByMultiPicFlg(BClassDtl bClassDtlByMultiPicFlg) {
        _bClassDtlByMultiPicFlg = bClassDtlByMultiPicFlg;
    }

    /** B_CLASS_DTL by my PACKING_STATUS, named 'BClassDtlByPackingStatus'. */
    protected BClassDtl _bClassDtlByPackingStatus;

    /**
     * [get] B_CLASS_DTL by my PACKING_STATUS, named 'BClassDtlByPackingStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByPackingStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPackingStatus() {
        return _bClassDtlByPackingStatus;
    }

    /**
     * [set] B_CLASS_DTL by my PACKING_STATUS, named 'BClassDtlByPackingStatus'.
     * @param bClassDtlByPackingStatus The entity of foreign property 'BClassDtlByPackingStatus'. (NullAllowed)
     */
    public void setBClassDtlByPackingStatus(BClassDtl bClassDtlByPackingStatus) {
        _bClassDtlByPackingStatus = bClassDtlByPackingStatus;
    }

    /** T_PACKING_R by PACKING_H_ID, named 'TPackingRAsOne'. */
    protected TPackingR _tPackingRAsOne;

    /**
     * [get] T_PACKING_R by PACKING_H_ID, named 'TPackingRAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TPackingRAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TPackingR getTPackingRAsOne() {
        return _tPackingRAsOne;
    }

    /**
     * [set] T_PACKING_R by PACKING_H_ID, named 'TPackingRAsOne'.
     * @param TPackingRAsOne The entity of foreign property(referrer-as-one) 'TPackingRAsOne'. (NullAllowed)
     */
    public void setTPackingRAsOne(TPackingR TPackingRAsOne) {
        _tPackingRAsOne = TPackingRAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_PACKING_B by PACKING_H_ID, named 'TPackingBList'. */
    protected List<TPackingB> _tPackingBList;

    /**
     * [get] T_PACKING_B by PACKING_H_ID, named 'TPackingBList'.
     * @return The entity list of referrer property 'TPackingBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingB> getTPackingBList() {
        if (_tPackingBList == null) { _tPackingBList = newReferrerList(); }
        return _tPackingBList;
    }

    /**
     * [set] T_PACKING_B by PACKING_H_ID, named 'TPackingBList'.
     * @param tPackingBList The entity list of referrer property 'TPackingBList'. (NullAllowed)
     */
    public void setTPackingBList(List<TPackingB> tPackingBList) {
        _tPackingBList = tPackingBList;
    }

    /** T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartList'. */
    protected List<TPicMthdRcmdCart> _tPicMthdRcmdCartList;

    /**
     * [get] T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartList'.
     * @return The entity list of referrer property 'TPicMthdRcmdCartList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPicMthdRcmdCart> getTPicMthdRcmdCartList() {
        if (_tPicMthdRcmdCartList == null) { _tPicMthdRcmdCartList = newReferrerList(); }
        return _tPicMthdRcmdCartList;
    }

    /**
     * [set] T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartList'.
     * @param tPicMthdRcmdCartList The entity list of referrer property 'TPicMthdRcmdCartList'. (NullAllowed)
     */
    public void setTPicMthdRcmdCartList(List<TPicMthdRcmdCart> tPicMthdRcmdCartList) {
        _tPicMthdRcmdCartList = tPicMthdRcmdCartList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTPackingH) {
            BsTPackingH other = (BsTPackingH)obj;
            if (!xSV(_packingHId, other._packingHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _packingHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tPickingH != null)
        { sb.append(li).append(xbRDS(_tPickingH, "tPickingH")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mBox != null)
        { sb.append(li).append(xbRDS(_mBox, "mBox")); }
        if (_tAllocInstH != null)
        { sb.append(li).append(xbRDS(_tAllocInstH, "tAllocInstH")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_bUserByUpdUser != null)
        { sb.append(li).append(xbRDS(_bUserByUpdUser, "bUserByUpdUser")); }
        if (_bClassDtlByLoadingFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLoadingFlg, "bClassDtlByLoadingFlg")); }
        if (_bClassDtlByMixedFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMixedFlg, "bClassDtlByMixedFlg")); }
        if (_bClassDtlByMultiPicFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMultiPicFlg, "bClassDtlByMultiPicFlg")); }
        if (_bClassDtlByPackingStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPackingStatus, "bClassDtlByPackingStatus")); }
        if (_tPackingRAsOne != null)
        { sb.append(li).append(xbRDS(_tPackingRAsOne, "tPackingRAsOne")); }
        if (_tPackingBList != null) { for (TPackingB et : _tPackingBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingBList")); } } }
        if (_tPicMthdRcmdCartList != null) { for (TPicMthdRcmdCart et : _tPicMthdRcmdCartList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPicMthdRcmdCartList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_packingHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_packingStatus));
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_shippingPackingNo));
        sb.append(dm).append(xfND(_carrierTraceNum));
        sb.append(dm).append(xfND(_boxId));
        sb.append(dm).append(xfND(_grossWeight));
        sb.append(dm).append(xfND(_totalVolume));
        sb.append(dm).append(xfND(_mixedFlg));
        sb.append(dm).append(xfND(_multiPicFlg));
        sb.append(dm).append(xfND(_cartNo));
        sb.append(dm).append(xfND(_bucketColNo));
        sb.append(dm).append(xfND(_bucketRowNo));
        sb.append(dm).append(xfND(_seedingNo));
        sb.append(dm).append(xfND(_loadingFlg));
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
        if (_tPickingH != null)
        { sb.append(dm).append("tPickingH"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mBox != null)
        { sb.append(dm).append("mBox"); }
        if (_tAllocInstH != null)
        { sb.append(dm).append("tAllocInstH"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_bUserByUpdUser != null)
        { sb.append(dm).append("bUserByUpdUser"); }
        if (_bClassDtlByLoadingFlg != null)
        { sb.append(dm).append("bClassDtlByLoadingFlg"); }
        if (_bClassDtlByMixedFlg != null)
        { sb.append(dm).append("bClassDtlByMixedFlg"); }
        if (_bClassDtlByMultiPicFlg != null)
        { sb.append(dm).append("bClassDtlByMultiPicFlg"); }
        if (_bClassDtlByPackingStatus != null)
        { sb.append(dm).append("bClassDtlByPackingStatus"); }
        if (_tPackingRAsOne != null)
        { sb.append(dm).append("tPackingRAsOne"); }
        if (_tPackingBList != null && !_tPackingBList.isEmpty())
        { sb.append(dm).append("tPackingBList"); }
        if (_tPicMthdRcmdCartList != null && !_tPicMthdRcmdCartList.isEmpty())
        { sb.append(dm).append("tPicMthdRcmdCartList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TPackingH clone() {
        return (TPackingH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPackingHId() {
        checkSpecifiedProperty("packingHId");
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPackingHId(Long packingHId) {
        registerModifiedProperty("packingHId");
        _packingHId = packingHId;
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
     * [get] PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @return The value of the column 'PACKING_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingStatus() {
        checkSpecifiedProperty("packingStatus");
        return convertEmptyToNull(_packingStatus);
    }

    /**
     * [set] PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @param packingStatus The value of the column 'PACKING_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingStatus(String packingStatus) {
        registerModifiedProperty("packingStatus");
        _packingStatus = packingStatus;
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
     * [get] PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * 出荷梱包No.
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPackingNo() {
        checkSpecifiedProperty("shippingPackingNo");
        return convertEmptyToNull(_shippingPackingNo);
    }

    /**
     * [set] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * 出荷梱包No.
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        registerModifiedProperty("shippingPackingNo");
        _shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * 貨物追跡No.
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierTraceNum() {
        checkSpecifiedProperty("carrierTraceNum");
        return convertEmptyToNull(_carrierTraceNum);
    }

    /**
     * [set] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * 貨物追跡No.
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        registerModifiedProperty("carrierTraceNum");
        _carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxId() {
        checkSpecifiedProperty("boxId");
        return _boxId;
    }

    /**
     * [set] BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxId(Long boxId) {
        registerModifiedProperty("boxId");
        _boxId = boxId;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getGrossWeight() {
        checkSpecifiedProperty("grossWeight");
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        registerModifiedProperty("grossWeight");
        _grossWeight = grossWeight;
    }

    /**
     * [get] TOTAL_VOLUME: {decimal(16, 6)} <br>
     * 総容積(mm3)
     * @return The value of the column 'TOTAL_VOLUME'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalVolume() {
        checkSpecifiedProperty("totalVolume");
        return _totalVolume;
    }

    /**
     * [set] TOTAL_VOLUME: {decimal(16, 6)} <br>
     * 総容積(mm3)
     * @param totalVolume The value of the column 'TOTAL_VOLUME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalVolume(java.math.BigDecimal totalVolume) {
        registerModifiedProperty("totalVolume");
        _totalVolume = totalVolume;
    }

    /**
     * [get] MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @return The value of the column 'MIXED_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getMixedFlg() {
        checkSpecifiedProperty("mixedFlg");
        return convertEmptyToNull(_mixedFlg);
    }

    /**
     * [set] MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @param mixedFlg The value of the column 'MIXED_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setMixedFlg(String mixedFlg) {
        registerModifiedProperty("mixedFlg");
        _mixedFlg = mixedFlg;
    }

    /**
     * [get] MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @return The value of the column 'MULTI_PIC_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getMultiPicFlg() {
        checkSpecifiedProperty("multiPicFlg");
        return convertEmptyToNull(_multiPicFlg);
    }

    /**
     * [set] MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @param multiPicFlg The value of the column 'MULTI_PIC_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setMultiPicFlg(String multiPicFlg) {
        registerModifiedProperty("multiPicFlg");
        _multiPicFlg = multiPicFlg;
    }

    /**
     * [get] CART_NO: {bigint(19)} <br>
     * 台車№
     * @return The value of the column 'CART_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCartNo() {
        checkSpecifiedProperty("cartNo");
        return _cartNo;
    }

    /**
     * [set] CART_NO: {bigint(19)} <br>
     * 台車№
     * @param cartNo The value of the column 'CART_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCartNo(Long cartNo) {
        registerModifiedProperty("cartNo");
        _cartNo = cartNo;
    }

    /**
     * [get] BUCKET_COL_NO: {bigint(19)} <br>
     * バケット列№
     * @return The value of the column 'BUCKET_COL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBucketColNo() {
        checkSpecifiedProperty("bucketColNo");
        return _bucketColNo;
    }

    /**
     * [set] BUCKET_COL_NO: {bigint(19)} <br>
     * バケット列№
     * @param bucketColNo The value of the column 'BUCKET_COL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBucketColNo(Long bucketColNo) {
        registerModifiedProperty("bucketColNo");
        _bucketColNo = bucketColNo;
    }

    /**
     * [get] BUCKET_ROW_NO: {bigint(19)} <br>
     * バケット段№
     * @return The value of the column 'BUCKET_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBucketRowNo() {
        checkSpecifiedProperty("bucketRowNo");
        return _bucketRowNo;
    }

    /**
     * [set] BUCKET_ROW_NO: {bigint(19)} <br>
     * バケット段№
     * @param bucketRowNo The value of the column 'BUCKET_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBucketRowNo(Long bucketRowNo) {
        registerModifiedProperty("bucketRowNo");
        _bucketRowNo = bucketRowNo;
    }

    /**
     * [get] SEEDING_NO: {varchar(30)} <br>
     * 種蒔きNo.
     * @return The value of the column 'SEEDING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSeedingNo() {
        checkSpecifiedProperty("seedingNo");
        return convertEmptyToNull(_seedingNo);
    }

    /**
     * [set] SEEDING_NO: {varchar(30)} <br>
     * 種蒔きNo.
     * @param seedingNo The value of the column 'SEEDING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeedingNo(String seedingNo) {
        registerModifiedProperty("seedingNo");
        _seedingNo = seedingNo;
    }

    /**
     * [get] LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @return The value of the column 'LOADING_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getLoadingFlg() {
        checkSpecifiedProperty("loadingFlg");
        return convertEmptyToNull(_loadingFlg);
    }

    /**
     * [set] LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @param loadingFlg The value of the column 'LOADING_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLoadingFlg(String loadingFlg) {
        registerModifiedProperty("loadingFlg");
        _loadingFlg = loadingFlg;
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
     * [get] UPD_USER: {varchar(255), FK to B_USER} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255), FK to B_USER} <br>
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
