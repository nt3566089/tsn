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
 * The entity of H_MOVE_B as TABLE. <br>
 * 在庫移動ボディ履歴
 * <pre>
 * [primary-key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, INOUT_TYPE, STOCK_ID, PROCESS_NO, MOVE_DT, MOVE_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_MOVE_H, H_STOCK, B_CLASS_DTL(ByInoutType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     hMoveH, hStock, bClassDtlByInoutType
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long moveRecordBId = entity.getMoveRecordBId();
 * Long moveInstHId = entity.getMoveInstHId();
 * String inoutType = entity.getInoutType();
 * Long stockId = entity.getStockId();
 * String processNo = entity.getProcessNo();
 * String moveDt = entity.getMoveDt();
 * java.math.BigDecimal moveNum = entity.getMoveNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMoveRecordBId(moveRecordBId);
 * entity.setMoveInstHId(moveInstHId);
 * entity.setInoutType(inoutType);
 * entity.setStockId(stockId);
 * entity.setProcessNo(processNo);
 * entity.setMoveDt(moveDt);
 * entity.setMoveNum(moveNum);
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
public abstract class BsHMoveB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _moveRecordBId;

    /** MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to H_MOVE_H} */
    protected Long _moveInstHId;

    /** INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType} */
    protected String _inoutType;

    /** STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} */
    protected Long _stockId;

    /** PROCESS_NO: {varchar(30)} */
    protected String _processNo;

    /** MOVE_DT: {IX, varchar(8)} */
    protected String _moveDt;

    /** MOVE_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _moveNum;

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
        return "H_MOVE_B";
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
        if (_moveRecordBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of inoutType as the classification of InoutType. <br>
     * INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InoutType getInoutTypeAsInoutType() {
        return CDef.InoutType.codeOf(getInoutType());
    }

    /**
     * Set the value of inoutType as the classification of InoutType. <br>
     * INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
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
    /** H_MOVE_H by my MOVE_INST_H_ID, named 'HMoveH'. */
    protected HMoveH _hMoveH;

    /**
     * [get] H_MOVE_H by my MOVE_INST_H_ID, named 'HMoveH'. <br>
     * @return The entity of foreign property 'HMoveH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public HMoveH getHMoveH() {
        return _hMoveH;
    }

    /**
     * [set] H_MOVE_H by my MOVE_INST_H_ID, named 'HMoveH'.
     * @param hMoveH The entity of foreign property 'HMoveH'. (NullAllowed)
     */
    public void setHMoveH(HMoveH hMoveH) {
        _hMoveH = hMoveH;
    }

    /** H_STOCK by my STOCK_ID, named 'HStock'. */
    protected HStock _hStock;

    /**
     * [get] H_STOCK by my STOCK_ID, named 'HStock'. <br>
     * @return The entity of foreign property 'HStock'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public HStock getHStock() {
        return _hStock;
    }

    /**
     * [set] H_STOCK by my STOCK_ID, named 'HStock'.
     * @param hStock The entity of foreign property 'HStock'. (NullAllowed)
     */
    public void setHStock(HStock hStock) {
        _hStock = hStock;
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsHMoveB) {
            BsHMoveB other = (BsHMoveB)obj;
            if (!xSV(_moveRecordBId, other._moveRecordBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _moveRecordBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_hMoveH != null)
        { sb.append(li).append(xbRDS(_hMoveH, "hMoveH")); }
        if (_hStock != null)
        { sb.append(li).append(xbRDS(_hStock, "hStock")); }
        if (_bClassDtlByInoutType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInoutType, "bClassDtlByInoutType")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_moveRecordBId));
        sb.append(dm).append(xfND(_moveInstHId));
        sb.append(dm).append(xfND(_inoutType));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_processNo));
        sb.append(dm).append(xfND(_moveDt));
        sb.append(dm).append(xfND(_moveNum));
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
        if (_hMoveH != null)
        { sb.append(dm).append("hMoveH"); }
        if (_hStock != null)
        { sb.append(dm).append("hStock"); }
        if (_bClassDtlByInoutType != null)
        { sb.append(dm).append("bClassDtlByInoutType"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public HMoveB clone() {
        return (HMoveB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫移動実績ボディID
     * @return The value of the column 'MOVE_RECORD_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoveRecordBId() {
        checkSpecifiedProperty("moveRecordBId");
        return _moveRecordBId;
    }

    /**
     * [set] MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫移動実績ボディID
     * @param moveRecordBId The value of the column 'MOVE_RECORD_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMoveRecordBId(Long moveRecordBId) {
        registerModifiedProperty("moveRecordBId");
        _moveRecordBId = moveRecordBId;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to H_MOVE_H} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoveInstHId() {
        checkSpecifiedProperty("moveInstHId");
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to H_MOVE_H} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMoveInstHId(Long moveInstHId) {
        registerModifiedProperty("moveInstHId");
        _moveInstHId = moveInstHId;
    }

    /**
     * [get] INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @return The value of the column 'INOUT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutType() {
        checkSpecifiedProperty("inoutType");
        return convertEmptyToNull(_inoutType);
    }

    /**
     * [set] INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param inoutType The value of the column 'INOUT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutType(String inoutType) {
        registerModifiedProperty("inoutType");
        _inoutType = inoutType;
    }

    /**
     * [get] STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] PROCESS_NO: {varchar(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessNo() {
        checkSpecifiedProperty("processNo");
        return convertEmptyToNull(_processNo);
    }

    /**
     * [set] PROCESS_NO: {varchar(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessNo(String processNo) {
        registerModifiedProperty("processNo");
        _processNo = processNo;
    }

    /**
     * [get] MOVE_DT: {IX, varchar(8)} <br>
     * 移動日
     * @return The value of the column 'MOVE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getMoveDt() {
        checkSpecifiedProperty("moveDt");
        return convertEmptyToNull(_moveDt);
    }

    /**
     * [set] MOVE_DT: {IX, varchar(8)} <br>
     * 移動日
     * @param moveDt The value of the column 'MOVE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveDt(String moveDt) {
        registerModifiedProperty("moveDt");
        _moveDt = moveDt;
    }

    /**
     * [get] MOVE_NUM: {decimal(16, 6)} <br>
     * 在庫移動実績数
     * @return The value of the column 'MOVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveNum() {
        checkSpecifiedProperty("moveNum");
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {decimal(16, 6)} <br>
     * 在庫移動実績数
     * @param moveNum The value of the column 'MOVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        registerModifiedProperty("moveNum");
        _moveNum = moveNum;
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
