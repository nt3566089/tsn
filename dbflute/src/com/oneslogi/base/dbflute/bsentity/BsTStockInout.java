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
 * The entity of T_STOCK_INOUT as TABLE. <br>
 * 在庫受払
 * <pre>
 * [primary-key]
 *     STOCK_INOUT_ID
 *
 * [column]
 *     STOCK_INOUT_ID, FS_STOCK_INOUT_ID, BF_STOCK_INOUT_ID, MOVE_RECORD_B_ID, STORE_RECORD_B_ID, ALLOC_INST_B_ID, PROCESS_DT, PROCESS_TYPE_ID, PROCESS_NO, CORRECT_TYPE, STOCK_ID, INOUT_TYPE, STOCK_INOUT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_INOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_B, T_STOCK_INOUT, T_STORE_RECORD_B, M_PROCESS_TYPE, T_MOVE_RECORD_B, T_STOCK, B_CLASS_DTL(ByCorrectType)
 *
 * [referrer table]
 *     T_STOCK_INOUT
 *
 * [foreign property]
 *     tAllocInstB, tStockInoutByFsStockInoutIdSelf, tStoreRecordB, mProcessType, tMoveRecordB, tStock, tStockInoutByBfStockInoutIdSelf, bClassDtlByCorrectType, bClassDtlByInoutType
 *
 * [referrer property]
 *     tStockInoutByFsStockInoutIdSelfList, tStockInoutByBfStockInoutIdSelfList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stockInoutId = entity.getStockInoutId();
 * Long fsStockInoutId = entity.getFsStockInoutId();
 * Long bfStockInoutId = entity.getBfStockInoutId();
 * Long moveRecordBId = entity.getMoveRecordBId();
 * Long storeRecordBId = entity.getStoreRecordBId();
 * Long allocInstBId = entity.getAllocInstBId();
 * String processDt = entity.getProcessDt();
 * Long processTypeId = entity.getProcessTypeId();
 * String processNo = entity.getProcessNo();
 * String correctType = entity.getCorrectType();
 * Long stockId = entity.getStockId();
 * String inoutType = entity.getInoutType();
 * java.math.BigDecimal stockInoutNum = entity.getStockInoutNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStockInoutId(stockInoutId);
 * entity.setFsStockInoutId(fsStockInoutId);
 * entity.setBfStockInoutId(bfStockInoutId);
 * entity.setMoveRecordBId(moveRecordBId);
 * entity.setStoreRecordBId(storeRecordBId);
 * entity.setAllocInstBId(allocInstBId);
 * entity.setProcessDt(processDt);
 * entity.setProcessTypeId(processTypeId);
 * entity.setProcessNo(processNo);
 * entity.setCorrectType(correctType);
 * entity.setStockId(stockId);
 * entity.setInoutType(inoutType);
 * entity.setStockInoutNum(stockInoutNum);
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
public abstract class BsTStockInout extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _stockInoutId;

    /** FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} */
    protected Long _fsStockInoutId;

    /** BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} */
    protected Long _bfStockInoutId;

    /** MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B} */
    protected Long _moveRecordBId;

    /** STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B} */
    protected Long _storeRecordBId;

    /** ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} */
    protected Long _allocInstBId;

    /** PROCESS_DT: {IX, NotNull, varchar(8)} */
    protected String _processDt;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    protected Long _processTypeId;

    /** PROCESS_NO: {NotNull, varchar(30)} */
    protected String _processNo;

    /** CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} */
    protected String _correctType;

    /** STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK} */
    protected Long _stockId;

    /** INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} */
    protected String _inoutType;

    /** STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _stockInoutNum;

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
        return "T_STOCK_INOUT";
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
        if (_stockInoutId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of correctType as the classification of CorrectType. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CorrectType getCorrectTypeAsCorrectType() {
        return CDef.CorrectType.codeOf(getCorrectType());
    }

    /**
     * Set the value of correctType as the classification of CorrectType. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCorrectTypeAsCorrectType(CDef.CorrectType cdef) {
        setCorrectType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of inoutType as the classification of InoutType. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InoutType getInoutTypeAsInoutType() {
        return CDef.InoutType.codeOf(getInoutType());
    }

    /**
     * Set the value of inoutType as the classification of InoutType. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInoutTypeAsInoutType(CDef.InoutType cdef) {
        setInoutType(cdef != null ? cdef.code() : null);
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
     * Set the value of correctType as $0 (0). <br>
     * $0: 黒
     */
    public void setCorrectType_$0() {
        setCorrectTypeAsCorrectType(CDef.CorrectType.$0);
    }

    /**
     * Set the value of correctType as $1 (1). <br>
     * $1: 赤
     */
    public void setCorrectType_$1() {
        setCorrectTypeAsCorrectType(CDef.CorrectType.$1);
    }

    /**
     * Set the value of inoutType as $0 (0). <br>
     * $0: 入庫
     */
    public void setInoutType_$0() {
        setInoutTypeAsInoutType(CDef.InoutType.$0);
    }

    /**
     * Set the value of inoutType as $1 (1). <br>
     * $1: 出庫
     */
    public void setInoutType_$1() {
        setInoutTypeAsInoutType(CDef.InoutType.$1);
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
     * Is the value of correctType $0? <br>
     * $0: 黒
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCorrectType$0() {
        CDef.CorrectType cdef = getCorrectTypeAsCorrectType();
        return cdef != null ? cdef.equals(CDef.CorrectType.$0) : false;
    }

    /**
     * Is the value of correctType $1? <br>
     * $1: 赤
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCorrectType$1() {
        CDef.CorrectType cdef = getCorrectTypeAsCorrectType();
        return cdef != null ? cdef.equals(CDef.CorrectType.$1) : false;
    }

    /**
     * Is the value of inoutType $0? <br>
     * $0: 入庫
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInoutType$0() {
        CDef.InoutType cdef = getInoutTypeAsInoutType();
        return cdef != null ? cdef.equals(CDef.InoutType.$0) : false;
    }

    /**
     * Is the value of inoutType $1? <br>
     * $1: 出庫
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInoutType$1() {
        CDef.InoutType cdef = getInoutTypeAsInoutType();
        return cdef != null ? cdef.equals(CDef.InoutType.$1) : false;
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
     * Get the value of the column 'correctType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCorrectTypeName() {
        CDef.CorrectType cdef = getCorrectTypeAsCorrectType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'inoutType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInoutTypeName() {
        CDef.InoutType cdef = getInoutTypeAsInoutType();
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
    /** T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'. */
    protected TAllocInstB _tAllocInstB;

    /**
     * [get] T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'. <br>
     * @return The entity of foreign property 'TAllocInstB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TAllocInstB getTAllocInstB() {
        return _tAllocInstB;
    }

    /**
     * [set] T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param tAllocInstB The entity of foreign property 'TAllocInstB'. (NullAllowed)
     */
    public void setTAllocInstB(TAllocInstB tAllocInstB) {
        _tAllocInstB = tAllocInstB;
    }

    /** T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'. */
    protected TStockInout _tStockInoutByFsStockInoutIdSelf;

    /**
     * [get] T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'. <br>
     * @return The entity of foreign property 'TStockInoutByFsStockInoutIdSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStockInout getTStockInoutByFsStockInoutIdSelf() {
        return _tStockInoutByFsStockInoutIdSelf;
    }

    /**
     * [set] T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'.
     * @param tStockInoutByFsStockInoutIdSelf The entity of foreign property 'TStockInoutByFsStockInoutIdSelf'. (NullAllowed)
     */
    public void setTStockInoutByFsStockInoutIdSelf(TStockInout tStockInoutByFsStockInoutIdSelf) {
        _tStockInoutByFsStockInoutIdSelf = tStockInoutByFsStockInoutIdSelf;
    }

    /** T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'. */
    protected TStoreRecordB _tStoreRecordB;

    /**
     * [get] T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'. <br>
     * @return The entity of foreign property 'TStoreRecordB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStoreRecordB getTStoreRecordB() {
        return _tStoreRecordB;
    }

    /**
     * [set] T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'.
     * @param tStoreRecordB The entity of foreign property 'TStoreRecordB'. (NullAllowed)
     */
    public void setTStoreRecordB(TStoreRecordB tStoreRecordB) {
        _tStoreRecordB = tStoreRecordB;
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

    /** T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'. */
    protected TMoveRecordB _tMoveRecordB;

    /**
     * [get] T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'. <br>
     * @return The entity of foreign property 'TMoveRecordB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TMoveRecordB getTMoveRecordB() {
        return _tMoveRecordB;
    }

    /**
     * [set] T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'.
     * @param tMoveRecordB The entity of foreign property 'TMoveRecordB'. (NullAllowed)
     */
    public void setTMoveRecordB(TMoveRecordB tMoveRecordB) {
        _tMoveRecordB = tMoveRecordB;
    }

    /** T_STOCK by my STOCK_ID, named 'TStock'. */
    protected TStock _tStock;

    /**
     * [get] T_STOCK by my STOCK_ID, named 'TStock'. <br>
     * @return The entity of foreign property 'TStock'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStock getTStock() {
        return _tStock;
    }

    /**
     * [set] T_STOCK by my STOCK_ID, named 'TStock'.
     * @param tStock The entity of foreign property 'TStock'. (NullAllowed)
     */
    public void setTStock(TStock tStock) {
        _tStock = tStock;
    }

    /** T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'. */
    protected TStockInout _tStockInoutByBfStockInoutIdSelf;

    /**
     * [get] T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'. <br>
     * @return The entity of foreign property 'TStockInoutByBfStockInoutIdSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStockInout getTStockInoutByBfStockInoutIdSelf() {
        return _tStockInoutByBfStockInoutIdSelf;
    }

    /**
     * [set] T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'.
     * @param tStockInoutByBfStockInoutIdSelf The entity of foreign property 'TStockInoutByBfStockInoutIdSelf'. (NullAllowed)
     */
    public void setTStockInoutByBfStockInoutIdSelf(TStockInout tStockInoutByBfStockInoutIdSelf) {
        _tStockInoutByBfStockInoutIdSelf = tStockInoutByBfStockInoutIdSelf;
    }

    /** B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'. */
    protected BClassDtl _bClassDtlByCorrectType;

    /**
     * [get] B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'. <br>
     * @return The entity of foreign property 'BClassDtlByCorrectType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCorrectType() {
        return _bClassDtlByCorrectType;
    }

    /**
     * [set] B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'.
     * @param bClassDtlByCorrectType The entity of foreign property 'BClassDtlByCorrectType'. (NullAllowed)
     */
    public void setBClassDtlByCorrectType(BClassDtl bClassDtlByCorrectType) {
        _bClassDtlByCorrectType = bClassDtlByCorrectType;
    }

    /** B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'. */
    protected BClassDtl _bClassDtlByInoutType;

    /**
     * [get] B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'. <br>
     * @return The entity of foreign property 'BClassDtlByInoutType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInoutType() {
        return _bClassDtlByInoutType;
    }

    /**
     * [set] B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @param bClassDtlByInoutType The entity of foreign property 'BClassDtlByInoutType'. (NullAllowed)
     */
    public void setBClassDtlByInoutType(BClassDtl bClassDtlByInoutType) {
        _bClassDtlByInoutType = bClassDtlByInoutType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfList'. */
    protected List<TStockInout> _tStockInoutByFsStockInoutIdSelfList;

    /**
     * [get] T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfList'.
     * @return The entity list of referrer property 'TStockInoutByFsStockInoutIdSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStockInout> getTStockInoutByFsStockInoutIdSelfList() {
        if (_tStockInoutByFsStockInoutIdSelfList == null) { _tStockInoutByFsStockInoutIdSelfList = newReferrerList(); }
        return _tStockInoutByFsStockInoutIdSelfList;
    }

    /**
     * [set] T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfList'.
     * @param tStockInoutByFsStockInoutIdSelfList The entity list of referrer property 'TStockInoutByFsStockInoutIdSelfList'. (NullAllowed)
     */
    public void setTStockInoutByFsStockInoutIdSelfList(List<TStockInout> tStockInoutByFsStockInoutIdSelfList) {
        _tStockInoutByFsStockInoutIdSelfList = tStockInoutByFsStockInoutIdSelfList;
    }

    /** T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfList'. */
    protected List<TStockInout> _tStockInoutByBfStockInoutIdSelfList;

    /**
     * [get] T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfList'.
     * @return The entity list of referrer property 'TStockInoutByBfStockInoutIdSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStockInout> getTStockInoutByBfStockInoutIdSelfList() {
        if (_tStockInoutByBfStockInoutIdSelfList == null) { _tStockInoutByBfStockInoutIdSelfList = newReferrerList(); }
        return _tStockInoutByBfStockInoutIdSelfList;
    }

    /**
     * [set] T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfList'.
     * @param tStockInoutByBfStockInoutIdSelfList The entity list of referrer property 'TStockInoutByBfStockInoutIdSelfList'. (NullAllowed)
     */
    public void setTStockInoutByBfStockInoutIdSelfList(List<TStockInout> tStockInoutByBfStockInoutIdSelfList) {
        _tStockInoutByBfStockInoutIdSelfList = tStockInoutByBfStockInoutIdSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTStockInout) {
            BsTStockInout other = (BsTStockInout)obj;
            if (!xSV(_stockInoutId, other._stockInoutId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stockInoutId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tAllocInstB != null)
        { sb.append(li).append(xbRDS(_tAllocInstB, "tAllocInstB")); }
        if (_tStockInoutByFsStockInoutIdSelf != null)
        { sb.append(li).append(xbRDS(_tStockInoutByFsStockInoutIdSelf, "tStockInoutByFsStockInoutIdSelf")); }
        if (_tStoreRecordB != null)
        { sb.append(li).append(xbRDS(_tStoreRecordB, "tStoreRecordB")); }
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_tMoveRecordB != null)
        { sb.append(li).append(xbRDS(_tMoveRecordB, "tMoveRecordB")); }
        if (_tStock != null)
        { sb.append(li).append(xbRDS(_tStock, "tStock")); }
        if (_tStockInoutByBfStockInoutIdSelf != null)
        { sb.append(li).append(xbRDS(_tStockInoutByBfStockInoutIdSelf, "tStockInoutByBfStockInoutIdSelf")); }
        if (_bClassDtlByCorrectType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCorrectType, "bClassDtlByCorrectType")); }
        if (_bClassDtlByInoutType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInoutType, "bClassDtlByInoutType")); }
        if (_tStockInoutByFsStockInoutIdSelfList != null) { for (TStockInout et : _tStockInoutByFsStockInoutIdSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockInoutByFsStockInoutIdSelfList")); } } }
        if (_tStockInoutByBfStockInoutIdSelfList != null) { for (TStockInout et : _tStockInoutByBfStockInoutIdSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockInoutByBfStockInoutIdSelfList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stockInoutId));
        sb.append(dm).append(xfND(_fsStockInoutId));
        sb.append(dm).append(xfND(_bfStockInoutId));
        sb.append(dm).append(xfND(_moveRecordBId));
        sb.append(dm).append(xfND(_storeRecordBId));
        sb.append(dm).append(xfND(_allocInstBId));
        sb.append(dm).append(xfND(_processDt));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_processNo));
        sb.append(dm).append(xfND(_correctType));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_inoutType));
        sb.append(dm).append(xfND(_stockInoutNum));
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
        if (_tAllocInstB != null)
        { sb.append(dm).append("tAllocInstB"); }
        if (_tStockInoutByFsStockInoutIdSelf != null)
        { sb.append(dm).append("tStockInoutByFsStockInoutIdSelf"); }
        if (_tStoreRecordB != null)
        { sb.append(dm).append("tStoreRecordB"); }
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_tMoveRecordB != null)
        { sb.append(dm).append("tMoveRecordB"); }
        if (_tStock != null)
        { sb.append(dm).append("tStock"); }
        if (_tStockInoutByBfStockInoutIdSelf != null)
        { sb.append(dm).append("tStockInoutByBfStockInoutIdSelf"); }
        if (_bClassDtlByCorrectType != null)
        { sb.append(dm).append("bClassDtlByCorrectType"); }
        if (_bClassDtlByInoutType != null)
        { sb.append(dm).append("bClassDtlByInoutType"); }
        if (_tStockInoutByFsStockInoutIdSelfList != null && !_tStockInoutByFsStockInoutIdSelfList.isEmpty())
        { sb.append(dm).append("tStockInoutByFsStockInoutIdSelfList"); }
        if (_tStockInoutByBfStockInoutIdSelfList != null && !_tStockInoutByBfStockInoutIdSelfList.isEmpty())
        { sb.append(dm).append("tStockInoutByBfStockInoutIdSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TStockInout clone() {
        return (TStockInout)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫受払ID
     * @return The value of the column 'STOCK_INOUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockInoutId() {
        checkSpecifiedProperty("stockInoutId");
        return _stockInoutId;
    }

    /**
     * [set] STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫受払ID
     * @param stockInoutId The value of the column 'STOCK_INOUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockInoutId(Long stockInoutId) {
        registerModifiedProperty("stockInoutId");
        _stockInoutId = stockInoutId;
    }

    /**
     * [get] FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} <br>
     * 初回在庫受払ID
     * @return The value of the column 'FS_STOCK_INOUT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFsStockInoutId() {
        checkSpecifiedProperty("fsStockInoutId");
        return _fsStockInoutId;
    }

    /**
     * [set] FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} <br>
     * 初回在庫受払ID
     * @param fsStockInoutId The value of the column 'FS_STOCK_INOUT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFsStockInoutId(Long fsStockInoutId) {
        registerModifiedProperty("fsStockInoutId");
        _fsStockInoutId = fsStockInoutId;
    }

    /**
     * [get] BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} <br>
     * 前回在庫受払ID
     * @return The value of the column 'BF_STOCK_INOUT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBfStockInoutId() {
        checkSpecifiedProperty("bfStockInoutId");
        return _bfStockInoutId;
    }

    /**
     * [set] BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT} <br>
     * 前回在庫受払ID
     * @param bfStockInoutId The value of the column 'BF_STOCK_INOUT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBfStockInoutId(Long bfStockInoutId) {
        registerModifiedProperty("bfStockInoutId");
        _bfStockInoutId = bfStockInoutId;
    }

    /**
     * [get] MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B} <br>
     * 在庫移動実績ボディID
     * @return The value of the column 'MOVE_RECORD_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMoveRecordBId() {
        checkSpecifiedProperty("moveRecordBId");
        return _moveRecordBId;
    }

    /**
     * [set] MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B} <br>
     * 在庫移動実績ボディID
     * @param moveRecordBId The value of the column 'MOVE_RECORD_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveRecordBId(Long moveRecordBId) {
        registerModifiedProperty("moveRecordBId");
        _moveRecordBId = moveRecordBId;
    }

    /**
     * [get] STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B} <br>
     * 入庫実績ボディID
     * @return The value of the column 'STORE_RECORD_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreRecordBId() {
        checkSpecifiedProperty("storeRecordBId");
        return _storeRecordBId;
    }

    /**
     * [set] STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B} <br>
     * 入庫実績ボディID
     * @param storeRecordBId The value of the column 'STORE_RECORD_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreRecordBId(Long storeRecordBId) {
        registerModifiedProperty("storeRecordBId");
        _storeRecordBId = storeRecordBId;
    }

    /**
     * [get] ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstBId() {
        checkSpecifiedProperty("allocInstBId");
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} <br>
     * 引当指示ボディID
     * @param allocInstBId The value of the column 'ALLOC_INST_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstBId(Long allocInstBId) {
        registerModifiedProperty("allocInstBId");
        _allocInstBId = allocInstBId;
    }

    /**
     * [get] PROCESS_DT: {IX, NotNull, varchar(8)} <br>
     * 処理日
     * @return The value of the column 'PROCESS_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getProcessDt() {
        checkSpecifiedProperty("processDt");
        return convertEmptyToNull(_processDt);
    }

    /**
     * [set] PROCESS_DT: {IX, NotNull, varchar(8)} <br>
     * 処理日
     * @param processDt The value of the column 'PROCESS_DT'. (basically NotNull if update: for the constraint)
     */
    public void setProcessDt(String processDt) {
        registerModifiedProperty("processDt");
        _processDt = processDt;
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
     * [get] CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @return The value of the column 'CORRECT_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getCorrectType() {
        checkSpecifiedProperty("correctType");
        return convertEmptyToNull(_correctType);
    }

    /**
     * [set] CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param correctType The value of the column 'CORRECT_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setCorrectType(String correctType) {
        registerModifiedProperty("correctType");
        _correctType = correctType;
    }

    /**
     * [get] STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @return The value of the column 'INOUT_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getInoutType() {
        checkSpecifiedProperty("inoutType");
        return convertEmptyToNull(_inoutType);
    }

    /**
     * [set] INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param inoutType The value of the column 'INOUT_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setInoutType(String inoutType) {
        registerModifiedProperty("inoutType");
        _inoutType = inoutType;
    }

    /**
     * [get] STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 受払数
     * @return The value of the column 'STOCK_INOUT_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getStockInoutNum() {
        checkSpecifiedProperty("stockInoutNum");
        return _stockInoutNum;
    }

    /**
     * [set] STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 受払数
     * @param stockInoutNum The value of the column 'STOCK_INOUT_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setStockInoutNum(java.math.BigDecimal stockInoutNum) {
        registerModifiedProperty("stockInoutNum");
        _stockInoutNum = stockInoutNum;
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
