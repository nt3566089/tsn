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
 * The entity of T_INVENTORY_INP_HIST as TABLE. <br>
 * 棚卸入力履歴
 * <pre>
 * [primary-key]
 *     INVENTORY_INP_HIST_ID
 *
 * [column]
 *     INVENTORY_INP_HIST_ID, INPUT_DT, INVENTORY_B_ID, INVENTORY_NUM, LAST_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_INP_HIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_INVENTORY_B, B_CLASS_DTL(ByLastFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tInventoryB, bClassDtlByLastFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long inventoryInpHistId = entity.getInventoryInpHistId();
 * java.sql.Timestamp inputDt = entity.getInputDt();
 * Long inventoryBId = entity.getInventoryBId();
 * java.math.BigDecimal inventoryNum = entity.getInventoryNum();
 * String lastFlg = entity.getLastFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setInventoryInpHistId(inventoryInpHistId);
 * entity.setInputDt(inputDt);
 * entity.setInventoryBId(inventoryBId);
 * entity.setInventoryNum(inventoryNum);
 * entity.setLastFlg(lastFlg);
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
public abstract class BsTInventoryInpHist extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _inventoryInpHistId;

    /** INPUT_DT: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _inputDt;

    /** INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B} */
    protected Long _inventoryBId;

    /** INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _inventoryNum;

    /** LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} */
    protected String _lastFlg;

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
        return "T_INVENTORY_INP_HIST";
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
        if (_inventoryInpHistId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of lastFlg as the classification of LastFlg. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LastFlg getLastFlgAsLastFlg() {
        return CDef.LastFlg.codeOf(getLastFlg());
    }

    /**
     * Set the value of lastFlg as the classification of LastFlg. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLastFlgAsLastFlg(CDef.LastFlg cdef) {
        setLastFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of lastFlg as $0 (0). <br>
     * $0: 最新でない
     */
    public void setLastFlg_$0() {
        setLastFlgAsLastFlg(CDef.LastFlg.$0);
    }

    /**
     * Set the value of lastFlg as $1 (1). <br>
     * $1: 最新
     */
    public void setLastFlg_$1() {
        setLastFlgAsLastFlg(CDef.LastFlg.$1);
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
     * Is the value of lastFlg $0? <br>
     * $0: 最新でない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLastFlg$0() {
        CDef.LastFlg cdef = getLastFlgAsLastFlg();
        return cdef != null ? cdef.equals(CDef.LastFlg.$0) : false;
    }

    /**
     * Is the value of lastFlg $1? <br>
     * $1: 最新
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLastFlg$1() {
        CDef.LastFlg cdef = getLastFlgAsLastFlg();
        return cdef != null ? cdef.equals(CDef.LastFlg.$1) : false;
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
     * Get the value of the column 'lastFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLastFlgName() {
        CDef.LastFlg cdef = getLastFlgAsLastFlg();
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
    /** T_INVENTORY_B by my INVENTORY_B_ID, named 'TInventoryB'. */
    protected TInventoryB _tInventoryB;

    /**
     * [get] T_INVENTORY_B by my INVENTORY_B_ID, named 'TInventoryB'. <br>
     * @return The entity of foreign property 'TInventoryB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TInventoryB getTInventoryB() {
        return _tInventoryB;
    }

    /**
     * [set] T_INVENTORY_B by my INVENTORY_B_ID, named 'TInventoryB'.
     * @param tInventoryB The entity of foreign property 'TInventoryB'. (NullAllowed)
     */
    public void setTInventoryB(TInventoryB tInventoryB) {
        _tInventoryB = tInventoryB;
    }

    /** B_CLASS_DTL by my LAST_FLG, named 'BClassDtlByLastFlg'. */
    protected BClassDtl _bClassDtlByLastFlg;

    /**
     * [get] B_CLASS_DTL by my LAST_FLG, named 'BClassDtlByLastFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLastFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLastFlg() {
        return _bClassDtlByLastFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LAST_FLG, named 'BClassDtlByLastFlg'.
     * @param bClassDtlByLastFlg The entity of foreign property 'BClassDtlByLastFlg'. (NullAllowed)
     */
    public void setBClassDtlByLastFlg(BClassDtl bClassDtlByLastFlg) {
        _bClassDtlByLastFlg = bClassDtlByLastFlg;
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
        if (obj instanceof BsTInventoryInpHist) {
            BsTInventoryInpHist other = (BsTInventoryInpHist)obj;
            if (!xSV(_inventoryInpHistId, other._inventoryInpHistId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryInpHistId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tInventoryB != null)
        { sb.append(li).append(xbRDS(_tInventoryB, "tInventoryB")); }
        if (_bClassDtlByLastFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLastFlg, "bClassDtlByLastFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryInpHistId));
        sb.append(dm).append(xfND(_inputDt));
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_lastFlg));
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
        if (_tInventoryB != null)
        { sb.append(dm).append("tInventoryB"); }
        if (_bClassDtlByLastFlg != null)
        { sb.append(dm).append("bClassDtlByLastFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TInventoryInpHist clone() {
        return (TInventoryInpHist)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸入力履歴ID
     * @return The value of the column 'INVENTORY_INP_HIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryInpHistId() {
        checkSpecifiedProperty("inventoryInpHistId");
        return _inventoryInpHistId;
    }

    /**
     * [set] INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸入力履歴ID
     * @param inventoryInpHistId The value of the column 'INVENTORY_INP_HIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryInpHistId(Long inventoryInpHistId) {
        registerModifiedProperty("inventoryInpHistId");
        _inventoryInpHistId = inventoryInpHistId;
    }

    /**
     * [get] INPUT_DT: {NotNull, datetime2(26, 6)} <br>
     * 入力日時
     * @return The value of the column 'INPUT_DT'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getInputDt() {
        checkSpecifiedProperty("inputDt");
        return _inputDt;
    }

    /**
     * [set] INPUT_DT: {NotNull, datetime2(26, 6)} <br>
     * 入力日時
     * @param inputDt The value of the column 'INPUT_DT'. (basically NotNull if update: for the constraint)
     */
    public void setInputDt(java.sql.Timestamp inputDt) {
        registerModifiedProperty("inputDt");
        _inputDt = inputDt;
    }

    /**
     * [get] INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 棚卸数
     * @return The value of the column 'INVENTORY_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 棚卸数
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @return The value of the column 'LAST_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastFlg() {
        checkSpecifiedProperty("lastFlg");
        return convertEmptyToNull(_lastFlg);
    }

    /**
     * [set] LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @param lastFlg The value of the column 'LAST_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastFlg(String lastFlg) {
        registerModifiedProperty("lastFlg");
        _lastFlg = lastFlg;
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
