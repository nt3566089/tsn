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
 * The entity of T_TRPICKLISTEXP as TABLE. <br>
 * 山出しリスト拡張情報
 * <pre>
 * [primary-key]
 *     T_TRPICKLISTEXP_ID
 *
 * [column]
 *     T_TRPICKLISTEXP_ID, T_TRPICKLIST_ID, PICKLIST_KEY, PICKLIST_G_NO, CASE_CD, DUMMY_CASE_KBN, READ_SD_KBN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TR_PICKLIST
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrPicklist
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tTrpicklistexpId = entity.getTTrpicklistexpId();
 * Long tTrpicklistId = entity.getTTrpicklistId();
 * Long picklistKey = entity.getPicklistKey();
 * Long picklistGNo = entity.getPicklistGNo();
 * Long caseCd = entity.getCaseCd();
 * String dummyCaseKbn = entity.getDummyCaseKbn();
 * String readSdKbn = entity.getReadSdKbn();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTTrpicklistexpId(tTrpicklistexpId);
 * entity.setTTrpicklistId(tTrpicklistId);
 * entity.setPicklistKey(picklistKey);
 * entity.setPicklistGNo(picklistGNo);
 * entity.setCaseCd(caseCd);
 * entity.setDummyCaseKbn(dummyCaseKbn);
 * entity.setReadSdKbn(readSdKbn);
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
public abstract class BsTTrpicklistexp extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)} */
    protected Long _tTrpicklistexpId;

    /** T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST} */
    protected Long _tTrpicklistId;

    /** PICKLIST_KEY: {NotNull, bigint(19)} */
    protected Long _picklistKey;

    /** PICKLIST_G_NO: {NotNull, bigint(19)} */
    protected Long _picklistGNo;

    /** CASE_CD: {NotNull, bigint(19)} */
    protected Long _caseCd;

    /** DUMMY_CASE_KBN: {char(1)} */
    protected String _dummyCaseKbn;

    /** READ_SD_KBN: {char(1)} */
    protected String _readSdKbn;

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
        return "T_TRPICKLISTEXP";
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
        if (_tTrpicklistexpId == null) { return false; }
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
    /** T_TR_PICKLIST by my T_TRPICKLIST_ID, named 'TTrPicklist'. */
    protected TTrPicklist _tTrPicklist;

    /**
     * [get] T_TR_PICKLIST by my T_TRPICKLIST_ID, named 'TTrPicklist'. <br>
     * @return The entity of foreign property 'TTrPicklist'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TTrPicklist getTTrPicklist() {
        return _tTrPicklist;
    }

    /**
     * [set] T_TR_PICKLIST by my T_TRPICKLIST_ID, named 'TTrPicklist'.
     * @param tTrPicklist The entity of foreign property 'TTrPicklist'. (NullAllowed)
     */
    public void setTTrPicklist(TTrPicklist tTrPicklist) {
        _tTrPicklist = tTrPicklist;
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
        if (obj instanceof BsTTrpicklistexp) {
            BsTTrpicklistexp other = (BsTTrpicklistexp)obj;
            if (!xSV(_tTrpicklistexpId, other._tTrpicklistexpId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tTrpicklistexpId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tTrPicklist != null)
        { sb.append(li).append(xbRDS(_tTrPicklist, "tTrPicklist")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tTrpicklistexpId));
        sb.append(dm).append(xfND(_tTrpicklistId));
        sb.append(dm).append(xfND(_picklistKey));
        sb.append(dm).append(xfND(_picklistGNo));
        sb.append(dm).append(xfND(_caseCd));
        sb.append(dm).append(xfND(_dummyCaseKbn));
        sb.append(dm).append(xfND(_readSdKbn));
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
        if (_tTrPicklist != null)
        { sb.append(dm).append("tTrPicklist"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrpicklistexp clone() {
        return (TTrpicklistexp)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)} <br>
     * 山出しリスト拡張ID
     * @return The value of the column 'T_TRPICKLISTEXP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTTrpicklistexpId() {
        checkSpecifiedProperty("TTrpicklistexpId");
        return _tTrpicklistexpId;
    }

    /**
     * [set] T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)} <br>
     * 山出しリスト拡張ID
     * @param tTrpicklistexpId The value of the column 'T_TRPICKLISTEXP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTTrpicklistexpId(Long tTrpicklistexpId) {
        registerModifiedProperty("TTrpicklistexpId");
        _tTrpicklistexpId = tTrpicklistexpId;
    }

    /**
     * [get] T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST} <br>
     * 山出しリストID
     * @return The value of the column 'T_TRPICKLIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTTrpicklistId() {
        checkSpecifiedProperty("TTrpicklistId");
        return _tTrpicklistId;
    }

    /**
     * [set] T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST} <br>
     * 山出しリストID
     * @param tTrpicklistId The value of the column 'T_TRPICKLIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTTrpicklistId(Long tTrpicklistId) {
        registerModifiedProperty("TTrpicklistId");
        _tTrpicklistId = tTrpicklistId;
    }

    /**
     * [get] PICKLIST_KEY: {NotNull, bigint(19)} <br>
     * 山出しリストNo.
     * @return The value of the column 'PICKLIST_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPicklistKey() {
        checkSpecifiedProperty("picklistKey");
        return _picklistKey;
    }

    /**
     * [set] PICKLIST_KEY: {NotNull, bigint(19)} <br>
     * 山出しリストNo.
     * @param picklistKey The value of the column 'PICKLIST_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setPicklistKey(Long picklistKey) {
        registerModifiedProperty("picklistKey");
        _picklistKey = picklistKey;
    }

    /**
     * [get] PICKLIST_G_NO: {NotNull, bigint(19)} <br>
     * 山出しリスト明細行No.
     * @return The value of the column 'PICKLIST_G_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getPicklistGNo() {
        checkSpecifiedProperty("picklistGNo");
        return _picklistGNo;
    }

    /**
     * [set] PICKLIST_G_NO: {NotNull, bigint(19)} <br>
     * 山出しリスト明細行No.
     * @param picklistGNo The value of the column 'PICKLIST_G_NO'. (basically NotNull if update: for the constraint)
     */
    public void setPicklistGNo(Long picklistGNo) {
        registerModifiedProperty("picklistGNo");
        _picklistGNo = picklistGNo;
    }

    /**
     * [get] CASE_CD: {NotNull, bigint(19)} <br>
     * ケースCD
     * @return The value of the column 'CASE_CD'. (basically NotNull if selected: for the constraint)
     */
    public Long getCaseCd() {
        checkSpecifiedProperty("caseCd");
        return _caseCd;
    }

    /**
     * [set] CASE_CD: {NotNull, bigint(19)} <br>
     * ケースCD
     * @param caseCd The value of the column 'CASE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCaseCd(Long caseCd) {
        registerModifiedProperty("caseCd");
        _caseCd = caseCd;
    }

    /**
     * [get] DUMMY_CASE_KBN: {char(1)} <br>
     * ダミーケース作成区分
     * @return The value of the column 'DUMMY_CASE_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDummyCaseKbn() {
        checkSpecifiedProperty("dummyCaseKbn");
        return convertEmptyToNull(_dummyCaseKbn);
    }

    /**
     * [set] DUMMY_CASE_KBN: {char(1)} <br>
     * ダミーケース作成区分
     * @param dummyCaseKbn The value of the column 'DUMMY_CASE_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDummyCaseKbn(String dummyCaseKbn) {
        registerModifiedProperty("dummyCaseKbn");
        _dummyCaseKbn = dummyCaseKbn;
    }

    /**
     * [get] READ_SD_KBN: {char(1)} <br>
     * SD読込区分
     * @return The value of the column 'READ_SD_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getReadSdKbn() {
        checkSpecifiedProperty("readSdKbn");
        return convertEmptyToNull(_readSdKbn);
    }

    /**
     * [set] READ_SD_KBN: {char(1)} <br>
     * SD読込区分
     * @param readSdKbn The value of the column 'READ_SD_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReadSdKbn(String readSdKbn) {
        registerModifiedProperty("readSdKbn");
        _readSdKbn = readSdKbn;
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
