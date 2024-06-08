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
 * The entity of T_RECEIVE_PLAN_SPARE as TABLE. <br>
 * 入荷予定予備
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_RECEIVE_PLAN_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tReceivePlanB
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long receivePlanBId = entity.getReceivePlanBId();
 * String spareStr1 = entity.getSpareStr1();
 * String spareStr2 = entity.getSpareStr2();
 * String spareStr3 = entity.getSpareStr3();
 * java.math.BigDecimal spareNum1 = entity.getSpareNum1();
 * java.math.BigDecimal spareNum2 = entity.getSpareNum2();
 * java.math.BigDecimal spareNum3 = entity.getSpareNum3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReceivePlanBId(receivePlanBId);
 * entity.setSpareStr1(spareStr1);
 * entity.setSpareStr2(spareStr2);
 * entity.setSpareStr3(spareStr3);
 * entity.setSpareNum1(spareNum1);
 * entity.setSpareNum2(spareNum2);
 * entity.setSpareNum3(spareNum3);
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
public abstract class BsTReceivePlanSpare extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_B} */
    protected Long _receivePlanBId;

    /** SPARE_STR_1: {varchar(255)} */
    protected String _spareStr1;

    /** SPARE_STR_2: {varchar(255)} */
    protected String _spareStr2;

    /** SPARE_STR_3: {varchar(255)} */
    protected String _spareStr3;

    /** SPARE_NUM_1: {decimal(16, 6)} */
    protected java.math.BigDecimal _spareNum1;

    /** SPARE_NUM_2: {decimal(16, 6)} */
    protected java.math.BigDecimal _spareNum2;

    /** SPARE_NUM_3: {decimal(16, 6)} */
    protected java.math.BigDecimal _spareNum3;

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
        return "T_RECEIVE_PLAN_SPARE";
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
        if (_receivePlanBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
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
        if (obj instanceof BsTReceivePlanSpare) {
            BsTReceivePlanSpare other = (BsTReceivePlanSpare)obj;
            if (!xSV(_receivePlanBId, other._receivePlanBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tReceivePlanB != null)
        { sb.append(li).append(xbRDS(_tReceivePlanB, "tReceivePlanB")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanBId));
        sb.append(dm).append(xfND(_spareStr1));
        sb.append(dm).append(xfND(_spareStr2));
        sb.append(dm).append(xfND(_spareStr3));
        sb.append(dm).append(xfND(_spareNum1));
        sb.append(dm).append(xfND(_spareNum2));
        sb.append(dm).append(xfND(_spareNum3));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TReceivePlanSpare clone() {
        return (TReceivePlanSpare)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_B} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_B} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr1() {
        checkSpecifiedProperty("spareStr1");
        return convertEmptyToNull(_spareStr1);
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr1(String spareStr1) {
        registerModifiedProperty("spareStr1");
        _spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr2() {
        checkSpecifiedProperty("spareStr2");
        return convertEmptyToNull(_spareStr2);
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr2(String spareStr2) {
        registerModifiedProperty("spareStr2");
        _spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr3() {
        checkSpecifiedProperty("spareStr3");
        return convertEmptyToNull(_spareStr3);
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr3(String spareStr3) {
        registerModifiedProperty("spareStr3");
        _spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {decimal(16, 6)} <br>
     * 予備項目１（数値）
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSpareNum1() {
        checkSpecifiedProperty("spareNum1");
        return _spareNum1;
    }

    /**
     * [set] SPARE_NUM_1: {decimal(16, 6)} <br>
     * 予備項目１（数値）
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum1(java.math.BigDecimal spareNum1) {
        registerModifiedProperty("spareNum1");
        _spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {decimal(16, 6)} <br>
     * 予備項目２（数値）
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSpareNum2() {
        checkSpecifiedProperty("spareNum2");
        return _spareNum2;
    }

    /**
     * [set] SPARE_NUM_2: {decimal(16, 6)} <br>
     * 予備項目２（数値）
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum2(java.math.BigDecimal spareNum2) {
        registerModifiedProperty("spareNum2");
        _spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {decimal(16, 6)} <br>
     * 予備項目３（数値）
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSpareNum3() {
        checkSpecifiedProperty("spareNum3");
        return _spareNum3;
    }

    /**
     * [set] SPARE_NUM_3: {decimal(16, 6)} <br>
     * 予備項目３（数値）
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum3(java.math.BigDecimal spareNum3) {
        registerModifiedProperty("spareNum3");
        _spareNum3 = spareNum3;
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
