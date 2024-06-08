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
 * The entity of B_DML_LOG as TABLE. <br>
 * 変更ログ
 * <pre>
 * [primary-key]
 *     DML_LOG_ID
 *
 * [column]
 *     DML_LOG_ID, DML_KBN, DML_TABLE_NM, DML_COLUMN_NM, DML_ROW_ID, DML_BEFORE_VALUE, DML_AFTER_VALUE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DML_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
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
 * Long dmlLogId = entity.getDmlLogId();
 * String dmlKbn = entity.getDmlKbn();
 * String dmlTableNm = entity.getDmlTableNm();
 * String dmlColumnNm = entity.getDmlColumnNm();
 * Long dmlRowId = entity.getDmlRowId();
 * String dmlBeforeValue = entity.getDmlBeforeValue();
 * String dmlAfterValue = entity.getDmlAfterValue();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setDmlLogId(dmlLogId);
 * entity.setDmlKbn(dmlKbn);
 * entity.setDmlTableNm(dmlTableNm);
 * entity.setDmlColumnNm(dmlColumnNm);
 * entity.setDmlRowId(dmlRowId);
 * entity.setDmlBeforeValue(dmlBeforeValue);
 * entity.setDmlAfterValue(dmlAfterValue);
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
public abstract class BsBDmlLog extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _dmlLogId;

    /** DML_KBN: {varchar(30)} */
    protected String _dmlKbn;

    /** DML_TABLE_NM: {varchar(30)} */
    protected String _dmlTableNm;

    /** DML_COLUMN_NM: {varchar(30)} */
    protected String _dmlColumnNm;

    /** DML_ROW_ID: {bigint(19)} */
    protected Long _dmlRowId;

    /** DML_BEFORE_VALUE: {varchar(255)} */
    protected String _dmlBeforeValue;

    /** DML_AFTER_VALUE: {varchar(255)} */
    protected String _dmlAfterValue;

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
        return "B_DML_LOG";
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
        if (_dmlLogId == null) { return false; }
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
        if (obj instanceof BsBDmlLog) {
            BsBDmlLog other = (BsBDmlLog)obj;
            if (!xSV(_dmlLogId, other._dmlLogId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dmlLogId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dmlLogId));
        sb.append(dm).append(xfND(_dmlKbn));
        sb.append(dm).append(xfND(_dmlTableNm));
        sb.append(dm).append(xfND(_dmlColumnNm));
        sb.append(dm).append(xfND(_dmlRowId));
        sb.append(dm).append(xfND(_dmlBeforeValue));
        sb.append(dm).append(xfND(_dmlAfterValue));
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
        return "";
    }

    @Override
    public BDmlLog clone() {
        return (BDmlLog)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 変更ログID
     * @return The value of the column 'DML_LOG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDmlLogId() {
        checkSpecifiedProperty("dmlLogId");
        return _dmlLogId;
    }

    /**
     * [set] DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 変更ログID
     * @param dmlLogId The value of the column 'DML_LOG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDmlLogId(Long dmlLogId) {
        registerModifiedProperty("dmlLogId");
        _dmlLogId = dmlLogId;
    }

    /**
     * [get] DML_KBN: {varchar(30)} <br>
     * 変更区分
     * @return The value of the column 'DML_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDmlKbn() {
        checkSpecifiedProperty("dmlKbn");
        return convertEmptyToNull(_dmlKbn);
    }

    /**
     * [set] DML_KBN: {varchar(30)} <br>
     * 変更区分
     * @param dmlKbn The value of the column 'DML_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmlKbn(String dmlKbn) {
        registerModifiedProperty("dmlKbn");
        _dmlKbn = dmlKbn;
    }

    /**
     * [get] DML_TABLE_NM: {varchar(30)} <br>
     * 変更テーブル名
     * @return The value of the column 'DML_TABLE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDmlTableNm() {
        checkSpecifiedProperty("dmlTableNm");
        return convertEmptyToNull(_dmlTableNm);
    }

    /**
     * [set] DML_TABLE_NM: {varchar(30)} <br>
     * 変更テーブル名
     * @param dmlTableNm The value of the column 'DML_TABLE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmlTableNm(String dmlTableNm) {
        registerModifiedProperty("dmlTableNm");
        _dmlTableNm = dmlTableNm;
    }

    /**
     * [get] DML_COLUMN_NM: {varchar(30)} <br>
     * 変更列名
     * @return The value of the column 'DML_COLUMN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDmlColumnNm() {
        checkSpecifiedProperty("dmlColumnNm");
        return convertEmptyToNull(_dmlColumnNm);
    }

    /**
     * [set] DML_COLUMN_NM: {varchar(30)} <br>
     * 変更列名
     * @param dmlColumnNm The value of the column 'DML_COLUMN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmlColumnNm(String dmlColumnNm) {
        registerModifiedProperty("dmlColumnNm");
        _dmlColumnNm = dmlColumnNm;
    }

    /**
     * [get] DML_ROW_ID: {bigint(19)} <br>
     * 変更行ID
     * @return The value of the column 'DML_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDmlRowId() {
        checkSpecifiedProperty("dmlRowId");
        return _dmlRowId;
    }

    /**
     * [set] DML_ROW_ID: {bigint(19)} <br>
     * 変更行ID
     * @param dmlRowId The value of the column 'DML_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmlRowId(Long dmlRowId) {
        registerModifiedProperty("dmlRowId");
        _dmlRowId = dmlRowId;
    }

    /**
     * [get] DML_BEFORE_VALUE: {varchar(255)} <br>
     * 変更前値
     * @return The value of the column 'DML_BEFORE_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDmlBeforeValue() {
        checkSpecifiedProperty("dmlBeforeValue");
        return convertEmptyToNull(_dmlBeforeValue);
    }

    /**
     * [set] DML_BEFORE_VALUE: {varchar(255)} <br>
     * 変更前値
     * @param dmlBeforeValue The value of the column 'DML_BEFORE_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmlBeforeValue(String dmlBeforeValue) {
        registerModifiedProperty("dmlBeforeValue");
        _dmlBeforeValue = dmlBeforeValue;
    }

    /**
     * [get] DML_AFTER_VALUE: {varchar(255)} <br>
     * 変更後値
     * @return The value of the column 'DML_AFTER_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDmlAfterValue() {
        checkSpecifiedProperty("dmlAfterValue");
        return convertEmptyToNull(_dmlAfterValue);
    }

    /**
     * [set] DML_AFTER_VALUE: {varchar(255)} <br>
     * 変更後値
     * @param dmlAfterValue The value of the column 'DML_AFTER_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmlAfterValue(String dmlAfterValue) {
        registerModifiedProperty("dmlAfterValue");
        _dmlAfterValue = dmlAfterValue;
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
