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
 * The entity of T_STORE_RECORD_R as TABLE. <br>
 * 入庫実績帳票
 * <pre>
 * [primary-key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, RECEIVE_RECORD_OUT_FLG, RECEIVE_RECORD_OUT_USER_ID, RECEIVE_RECORD_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, T_STORE_RECORD_H, B_CLASS_DTL(ByReceiveRecordOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, tStoreRecordH, bClassDtlByReceiveRecordOutFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long storeRecordHId = entity.getStoreRecordHId();
 * String receiveRecordOutFlg = entity.getReceiveRecordOutFlg();
 * Long receiveRecordOutUserId = entity.getReceiveRecordOutUserId();
 * java.sql.Timestamp receiveRecordOutDt = entity.getReceiveRecordOutDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStoreRecordHId(storeRecordHId);
 * entity.setReceiveRecordOutFlg(receiveRecordOutFlg);
 * entity.setReceiveRecordOutUserId(receiveRecordOutUserId);
 * entity.setReceiveRecordOutDt(receiveRecordOutDt);
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
public abstract class BsTStoreRecordR extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H} */
    protected Long _storeRecordHId;

    /** RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _receiveRecordOutFlg;

    /** RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _receiveRecordOutUserId;

    /** RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _receiveRecordOutDt;

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
        return "T_STORE_RECORD_R";
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
        if (_storeRecordHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of receiveRecordOutFlg as the classification of ListOutFlg. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getReceiveRecordOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getReceiveRecordOutFlg());
    }

    /**
     * Set the value of receiveRecordOutFlg as the classification of ListOutFlg. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReceiveRecordOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setReceiveRecordOutFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of receiveRecordOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setReceiveRecordOutFlg_$0() {
        setReceiveRecordOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of receiveRecordOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setReceiveRecordOutFlg_$1() {
        setReceiveRecordOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
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
     * Is the value of receiveRecordOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveRecordOutFlg$0() {
        CDef.ListOutFlg cdef = getReceiveRecordOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of receiveRecordOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveRecordOutFlg$1() {
        CDef.ListOutFlg cdef = getReceiveRecordOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
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
     * Get the value of the column 'receiveRecordOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReceiveRecordOutFlgName() {
        CDef.ListOutFlg cdef = getReceiveRecordOutFlgAsListOutFlg();
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
    /** B_USER by my RECEIVE_RECORD_OUT_USER_ID, named 'BUser'. */
    protected BUser _bUser;

    /**
     * [get] B_USER by my RECEIVE_RECORD_OUT_USER_ID, named 'BUser'. <br>
     * @return The entity of foreign property 'BUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUser() {
        return _bUser;
    }

    /**
     * [set] B_USER by my RECEIVE_RECORD_OUT_USER_ID, named 'BUser'.
     * @param bUser The entity of foreign property 'BUser'. (NullAllowed)
     */
    public void setBUser(BUser bUser) {
        _bUser = bUser;
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

    /** B_CLASS_DTL by my RECEIVE_RECORD_OUT_FLG, named 'BClassDtlByReceiveRecordOutFlg'. */
    protected BClassDtl _bClassDtlByReceiveRecordOutFlg;

    /**
     * [get] B_CLASS_DTL by my RECEIVE_RECORD_OUT_FLG, named 'BClassDtlByReceiveRecordOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByReceiveRecordOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReceiveRecordOutFlg() {
        return _bClassDtlByReceiveRecordOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my RECEIVE_RECORD_OUT_FLG, named 'BClassDtlByReceiveRecordOutFlg'.
     * @param bClassDtlByReceiveRecordOutFlg The entity of foreign property 'BClassDtlByReceiveRecordOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByReceiveRecordOutFlg(BClassDtl bClassDtlByReceiveRecordOutFlg) {
        _bClassDtlByReceiveRecordOutFlg = bClassDtlByReceiveRecordOutFlg;
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
        if (obj instanceof BsTStoreRecordR) {
            BsTStoreRecordR other = (BsTStoreRecordR)obj;
            if (!xSV(_storeRecordHId, other._storeRecordHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _storeRecordHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bUser != null)
        { sb.append(li).append(xbRDS(_bUser, "bUser")); }
        if (_tStoreRecordH != null)
        { sb.append(li).append(xbRDS(_tStoreRecordH, "tStoreRecordH")); }
        if (_bClassDtlByReceiveRecordOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReceiveRecordOutFlg, "bClassDtlByReceiveRecordOutFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_storeRecordHId));
        sb.append(dm).append(xfND(_receiveRecordOutFlg));
        sb.append(dm).append(xfND(_receiveRecordOutUserId));
        sb.append(dm).append(xfND(_receiveRecordOutDt));
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
        if (_bUser != null)
        { sb.append(dm).append("bUser"); }
        if (_tStoreRecordH != null)
        { sb.append(dm).append("tStoreRecordH"); }
        if (_bClassDtlByReceiveRecordOutFlg != null)
        { sb.append(dm).append("bClassDtlByReceiveRecordOutFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TStoreRecordR clone() {
        return (TStoreRecordR)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H} <br>
     * 入庫実績ヘッダID
     * @return The value of the column 'STORE_RECORD_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreRecordHId() {
        checkSpecifiedProperty("storeRecordHId");
        return _storeRecordHId;
    }

    /**
     * [set] STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H} <br>
     * 入庫実績ヘッダID
     * @param storeRecordHId The value of the column 'STORE_RECORD_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        registerModifiedProperty("storeRecordHId");
        _storeRecordHId = storeRecordHId;
    }

    /**
     * [get] RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 入荷実績出力フラグ
     * @return The value of the column 'RECEIVE_RECORD_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveRecordOutFlg() {
        checkSpecifiedProperty("receiveRecordOutFlg");
        return convertEmptyToNull(_receiveRecordOutFlg);
    }

    /**
     * [set] RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 入荷実績出力フラグ
     * @param receiveRecordOutFlg The value of the column 'RECEIVE_RECORD_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRecordOutFlg(String receiveRecordOutFlg) {
        registerModifiedProperty("receiveRecordOutFlg");
        _receiveRecordOutFlg = receiveRecordOutFlg;
    }

    /**
     * [get] RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 入荷実績出力者ID
     * @return The value of the column 'RECEIVE_RECORD_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveRecordOutUserId() {
        checkSpecifiedProperty("receiveRecordOutUserId");
        return _receiveRecordOutUserId;
    }

    /**
     * [set] RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 入荷実績出力者ID
     * @param receiveRecordOutUserId The value of the column 'RECEIVE_RECORD_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRecordOutUserId(Long receiveRecordOutUserId) {
        registerModifiedProperty("receiveRecordOutUserId");
        _receiveRecordOutUserId = receiveRecordOutUserId;
    }

    /**
     * [get] RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)} <br>
     * 入荷実績出力日時
     * @return The value of the column 'RECEIVE_RECORD_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getReceiveRecordOutDt() {
        checkSpecifiedProperty("receiveRecordOutDt");
        return _receiveRecordOutDt;
    }

    /**
     * [set] RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)} <br>
     * 入荷実績出力日時
     * @param receiveRecordOutDt The value of the column 'RECEIVE_RECORD_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRecordOutDt(java.sql.Timestamp receiveRecordOutDt) {
        registerModifiedProperty("receiveRecordOutDt");
        _receiveRecordOutDt = receiveRecordOutDt;
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
