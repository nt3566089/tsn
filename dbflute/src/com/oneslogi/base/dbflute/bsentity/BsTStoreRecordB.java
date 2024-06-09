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
 * The entity of T_STORE_RECORD_B as TABLE. <br>
 * 入庫実績ボディ
 * <pre>
 * [primary-key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, STORE_RECORD_H_ID, RECEIVE_PLAN_B_ID, PROCESS_NO, CLIENT_ORDER_NO, LOT, LIMIT_DT, STORE_DT, STORE_NUM, STORE_FLG, STORE_LOCATION_ID, INPUT_TYPE, HT_STORE_INSPECTION_DT, HT_STORE_INSPECTION_USER_ID, STORE_RECORD_B_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_RECEIVE_PLAN_B, M_LOCATION, T_STORE_RECORD_H, B_CLASS_DTL(ByInputType)
 *
 * [referrer table]
 *     T_STOCK_INOUT
 *
 * [foreign property]
 *     tReceivePlanB, mLocation, tStoreRecordH, bClassDtlByInputType, bClassDtlByStoreFlg
 *
 * [referrer property]
 *     tStockInoutList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long storeRecordBId = entity.getStoreRecordBId();
 * Long storeRecordHId = entity.getStoreRecordHId();
 * Long receivePlanBId = entity.getReceivePlanBId();
 * String processNo = entity.getProcessNo();
 * String clientOrderNo = entity.getClientOrderNo();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * String storeDt = entity.getStoreDt();
 * java.math.BigDecimal storeNum = entity.getStoreNum();
 * String storeFlg = entity.getStoreFlg();
 * Long storeLocationId = entity.getStoreLocationId();
 * String inputType = entity.getInputType();
 * String htStoreInspectionDt = entity.getHtStoreInspectionDt();
 * String htStoreInspectionUserId = entity.getHtStoreInspectionUserId();
 * String storeRecordBComment = entity.getStoreRecordBComment();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStoreRecordBId(storeRecordBId);
 * entity.setStoreRecordHId(storeRecordHId);
 * entity.setReceivePlanBId(receivePlanBId);
 * entity.setProcessNo(processNo);
 * entity.setClientOrderNo(clientOrderNo);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setStoreDt(storeDt);
 * entity.setStoreNum(storeNum);
 * entity.setStoreFlg(storeFlg);
 * entity.setStoreLocationId(storeLocationId);
 * entity.setInputType(inputType);
 * entity.setHtStoreInspectionDt(htStoreInspectionDt);
 * entity.setHtStoreInspectionUserId(htStoreInspectionUserId);
 * entity.setStoreRecordBComment(storeRecordBComment);
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
public abstract class BsTStoreRecordB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _storeRecordBId;

    /** STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to T_STORE_RECORD_H} */
    protected Long _storeRecordHId;

    /** RECEIVE_PLAN_B_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B} */
    protected Long _receivePlanBId;

    /** PROCESS_NO: {NotNull, varchar(30)} */
    protected String _processNo;

    /** CLIENT_ORDER_NO: {IX, varchar(30)} */
    protected String _clientOrderNo;

    /** LOT: {varchar(30)} */
    protected String _lot;

    /** LIMIT_DT: {varchar(8)} */
    protected String _limitDt;

    /** STORE_DT: {IX, NotNull, varchar(8)} */
    protected String _storeDt;

    /** STORE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _storeNum;

    /** STORE_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} */
    protected String _storeFlg;

    /** STORE_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} */
    protected Long _storeLocationId;

    /** INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} */
    protected String _inputType;

    /** HT_STORE_INSPECTION_DT: {varchar(8)} */
    protected String _htStoreInspectionDt;

    /** HT_STORE_INSPECTION_USER_ID: {varchar(30)} */
    protected String _htStoreInspectionUserId;

    /** STORE_RECORD_B_COMMENT: {varchar(255)} */
    protected String _storeRecordBComment;

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
        return "T_STORE_RECORD_B";
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
        if (_storeRecordBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of storeFlg as the classification of StoreFlg. <br>
     * STORE_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StoreFlg getStoreFlgAsStoreFlg() {
        return CDef.StoreFlg.codeOf(getStoreFlg());
    }

    /**
     * Set the value of storeFlg as the classification of StoreFlg. <br>
     * STORE_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStoreFlgAsStoreFlg(CDef.StoreFlg cdef) {
        setStoreFlg(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of storeFlg as $0 (0). <br>
     * $0: 未格納
     */
    public void setStoreFlg_$0() {
        setStoreFlgAsStoreFlg(CDef.StoreFlg.$0);
    }

    /**
     * Set the value of storeFlg as $1 (1). <br>
     * $1: 格納
     */
    public void setStoreFlg_$1() {
        setStoreFlgAsStoreFlg(CDef.StoreFlg.$1);
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
     * Is the value of storeFlg $0? <br>
     * $0: 未格納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreFlg$0() {
        CDef.StoreFlg cdef = getStoreFlgAsStoreFlg();
        return cdef != null ? cdef.equals(CDef.StoreFlg.$0) : false;
    }

    /**
     * Is the value of storeFlg $1? <br>
     * $1: 格納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreFlg$1() {
        CDef.StoreFlg cdef = getStoreFlgAsStoreFlg();
        return cdef != null ? cdef.equals(CDef.StoreFlg.$1) : false;
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
     * Get the value of the column 'storeFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStoreFlgName() {
        CDef.StoreFlg cdef = getStoreFlgAsStoreFlg();
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
    /** T_RECEIVE_PLAN_B by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'. */
    protected TReceivePlanB _tReceivePlanB;

    /**
     * [get] T_RECEIVE_PLAN_B by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'. <br>
     * @return The entity of foreign property 'TReceivePlanB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TReceivePlanB getTReceivePlanB() {
        return _tReceivePlanB;
    }

    /**
     * [set] T_RECEIVE_PLAN_B by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @param tReceivePlanB The entity of foreign property 'TReceivePlanB'. (NullAllowed)
     */
    public void setTReceivePlanB(TReceivePlanB tReceivePlanB) {
        _tReceivePlanB = tReceivePlanB;
    }

    /** M_LOCATION by my STORE_LOCATION_ID, named 'MLocation'. */
    protected MLocation _mLocation;

    /**
     * [get] M_LOCATION by my STORE_LOCATION_ID, named 'MLocation'. <br>
     * @return The entity of foreign property 'MLocation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MLocation getMLocation() {
        return _mLocation;
    }

    /**
     * [set] M_LOCATION by my STORE_LOCATION_ID, named 'MLocation'.
     * @param mLocation The entity of foreign property 'MLocation'. (NullAllowed)
     */
    public void setMLocation(MLocation mLocation) {
        _mLocation = mLocation;
    }

    /** T_STORE_RECORD_H by my STORE_RECORD_H_ID, named 'TStoreRecordH'. */
    protected TStoreRecordH _tStoreRecordH;

    /**
     * [get] T_STORE_RECORD_H by my STORE_RECORD_H_ID, named 'TStoreRecordH'. <br>
     * @return The entity of foreign property 'TStoreRecordH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStoreRecordH getTStoreRecordH() {
        return _tStoreRecordH;
    }

    /**
     * [set] T_STORE_RECORD_H by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @param tStoreRecordH The entity of foreign property 'TStoreRecordH'. (NullAllowed)
     */
    public void setTStoreRecordH(TStoreRecordH tStoreRecordH) {
        _tStoreRecordH = tStoreRecordH;
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

    /** B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'. */
    protected BClassDtl _bClassDtlByStoreFlg;

    /**
     * [get] B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStoreFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStoreFlg() {
        return _bClassDtlByStoreFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * @param bClassDtlByStoreFlg The entity of foreign property 'BClassDtlByStoreFlg'. (NullAllowed)
     */
    public void setBClassDtlByStoreFlg(BClassDtl bClassDtlByStoreFlg) {
        _bClassDtlByStoreFlg = bClassDtlByStoreFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_STOCK_INOUT by STORE_RECORD_B_ID, named 'TStockInoutList'. */
    protected List<TStockInout> _tStockInoutList;

    /**
     * [get] T_STOCK_INOUT by STORE_RECORD_B_ID, named 'TStockInoutList'.
     * @return The entity list of referrer property 'TStockInoutList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStockInout> getTStockInoutList() {
        if (_tStockInoutList == null) { _tStockInoutList = newReferrerList(); }
        return _tStockInoutList;
    }

    /**
     * [set] T_STOCK_INOUT by STORE_RECORD_B_ID, named 'TStockInoutList'.
     * @param tStockInoutList The entity list of referrer property 'TStockInoutList'. (NullAllowed)
     */
    public void setTStockInoutList(List<TStockInout> tStockInoutList) {
        _tStockInoutList = tStockInoutList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTStoreRecordB) {
            BsTStoreRecordB other = (BsTStoreRecordB)obj;
            if (!xSV(_storeRecordBId, other._storeRecordBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _storeRecordBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tReceivePlanB != null)
        { sb.append(li).append(xbRDS(_tReceivePlanB, "tReceivePlanB")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_tStoreRecordH != null)
        { sb.append(li).append(xbRDS(_tStoreRecordH, "tStoreRecordH")); }
        if (_bClassDtlByInputType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInputType, "bClassDtlByInputType")); }
        if (_bClassDtlByStoreFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStoreFlg, "bClassDtlByStoreFlg")); }
        if (_tStockInoutList != null) { for (TStockInout et : _tStockInoutList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockInoutList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_storeRecordBId));
        sb.append(dm).append(xfND(_storeRecordHId));
        sb.append(dm).append(xfND(_receivePlanBId));
        sb.append(dm).append(xfND(_processNo));
        sb.append(dm).append(xfND(_clientOrderNo));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_storeNum));
        sb.append(dm).append(xfND(_storeFlg));
        sb.append(dm).append(xfND(_storeLocationId));
        sb.append(dm).append(xfND(_inputType));
        sb.append(dm).append(xfND(_htStoreInspectionDt));
        sb.append(dm).append(xfND(_htStoreInspectionUserId));
        sb.append(dm).append(xfND(_storeRecordBComment));
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
        if (_tReceivePlanB != null)
        { sb.append(dm).append("tReceivePlanB"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_tStoreRecordH != null)
        { sb.append(dm).append("tStoreRecordH"); }
        if (_bClassDtlByInputType != null)
        { sb.append(dm).append("bClassDtlByInputType"); }
        if (_bClassDtlByStoreFlg != null)
        { sb.append(dm).append("bClassDtlByStoreFlg"); }
        if (_tStockInoutList != null && !_tStockInoutList.isEmpty())
        { sb.append(dm).append("tStockInoutList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TStoreRecordB clone() {
        return (TStoreRecordB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績ボディID
     * @return The value of the column 'STORE_RECORD_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreRecordBId() {
        checkSpecifiedProperty("storeRecordBId");
        return _storeRecordBId;
    }

    /**
     * [set] STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績ボディID
     * @param storeRecordBId The value of the column 'STORE_RECORD_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStoreRecordBId(Long storeRecordBId) {
        registerModifiedProperty("storeRecordBId");
        _storeRecordBId = storeRecordBId;
    }

    /**
     * [get] STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to T_STORE_RECORD_H} <br>
     * 入庫実績ヘッダID
     * @return The value of the column 'STORE_RECORD_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreRecordHId() {
        checkSpecifiedProperty("storeRecordHId");
        return _storeRecordHId;
    }

    /**
     * [set] STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to T_STORE_RECORD_H} <br>
     * 入庫実績ヘッダID
     * @param storeRecordHId The value of the column 'STORE_RECORD_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        registerModifiedProperty("storeRecordHId");
        _storeRecordHId = storeRecordHId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
    }

    /**
     * [get] PROCESS_NO: {NotNull, varchar(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getProcessNo() {
        checkSpecifiedProperty("processNo");
        return convertEmptyToNull(_processNo);
    }

    /**
     * [set] PROCESS_NO: {NotNull, varchar(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (basically NotNull if update: for the constraint)
     */
    public void setProcessNo(String processNo) {
        registerModifiedProperty("processNo");
        _processNo = processNo;
    }

    /**
     * [get] CLIENT_ORDER_NO: {IX, varchar(30)} <br>
     * 顧客発注No.
     * @return The value of the column 'CLIENT_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientOrderNo() {
        checkSpecifiedProperty("clientOrderNo");
        return convertEmptyToNull(_clientOrderNo);
    }

    /**
     * [set] CLIENT_ORDER_NO: {IX, varchar(30)} <br>
     * 顧客発注No.
     * @param clientOrderNo The value of the column 'CLIENT_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientOrderNo(String clientOrderNo) {
        registerModifiedProperty("clientOrderNo");
        _clientOrderNo = clientOrderNo;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {varchar(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {varchar(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] STORE_DT: {IX, NotNull, varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {IX, NotNull, varchar(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (basically NotNull if update: for the constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] STORE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫数
     * @return The value of the column 'STORE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getStoreNum() {
        checkSpecifiedProperty("storeNum");
        return _storeNum;
    }

    /**
     * [set] STORE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫数
     * @param storeNum The value of the column 'STORE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setStoreNum(java.math.BigDecimal storeNum) {
        registerModifiedProperty("storeNum");
        _storeNum = storeNum;
    }

    /**
     * [get] STORE_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 入庫格納フラグ
     * @return The value of the column 'STORE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getStoreFlg() {
        checkSpecifiedProperty("storeFlg");
        return convertEmptyToNull(_storeFlg);
    }

    /**
     * [set] STORE_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 入庫格納フラグ
     * @param storeFlg The value of the column 'STORE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setStoreFlg(String storeFlg) {
        registerModifiedProperty("storeFlg");
        _storeFlg = storeFlg;
    }

    /**
     * [get] STORE_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} <br>
     * 入庫格納ロケーションID
     * @return The value of the column 'STORE_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreLocationId() {
        checkSpecifiedProperty("storeLocationId");
        return _storeLocationId;
    }

    /**
     * [set] STORE_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} <br>
     * 入庫格納ロケーションID
     * @param storeLocationId The value of the column 'STORE_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLocationId(Long storeLocationId) {
        registerModifiedProperty("storeLocationId");
        _storeLocationId = storeLocationId;
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
     * [get] HT_STORE_INSPECTION_DT: {varchar(8)} <br>
     * HT検品完了日
     * @return The value of the column 'HT_STORE_INSPECTION_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtStoreInspectionDt() {
        checkSpecifiedProperty("htStoreInspectionDt");
        return convertEmptyToNull(_htStoreInspectionDt);
    }

    /**
     * [set] HT_STORE_INSPECTION_DT: {varchar(8)} <br>
     * HT検品完了日
     * @param htStoreInspectionDt The value of the column 'HT_STORE_INSPECTION_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtStoreInspectionDt(String htStoreInspectionDt) {
        registerModifiedProperty("htStoreInspectionDt");
        _htStoreInspectionDt = htStoreInspectionDt;
    }

    /**
     * [get] HT_STORE_INSPECTION_USER_ID: {varchar(30)} <br>
     * HT検品担当者ID
     * @return The value of the column 'HT_STORE_INSPECTION_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtStoreInspectionUserId() {
        checkSpecifiedProperty("htStoreInspectionUserId");
        return convertEmptyToNull(_htStoreInspectionUserId);
    }

    /**
     * [set] HT_STORE_INSPECTION_USER_ID: {varchar(30)} <br>
     * HT検品担当者ID
     * @param htStoreInspectionUserId The value of the column 'HT_STORE_INSPECTION_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtStoreInspectionUserId(String htStoreInspectionUserId) {
        registerModifiedProperty("htStoreInspectionUserId");
        _htStoreInspectionUserId = htStoreInspectionUserId;
    }

    /**
     * [get] STORE_RECORD_B_COMMENT: {varchar(255)} <br>
     * 入庫実績ボディ備考
     * @return The value of the column 'STORE_RECORD_B_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreRecordBComment() {
        checkSpecifiedProperty("storeRecordBComment");
        return convertEmptyToNull(_storeRecordBComment);
    }

    /**
     * [set] STORE_RECORD_B_COMMENT: {varchar(255)} <br>
     * 入庫実績ボディ備考
     * @param storeRecordBComment The value of the column 'STORE_RECORD_B_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreRecordBComment(String storeRecordBComment) {
        registerModifiedProperty("storeRecordBComment");
        _storeRecordBComment = storeRecordBComment;
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
