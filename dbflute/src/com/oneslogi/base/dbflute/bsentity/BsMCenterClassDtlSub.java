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
 * The entity of M_CENTER_CLASS_DTL_SUB as TABLE. <br>
 * 拠点区分値明細マスタサブ
 * <pre>
 * [primary-key]
 *     CENTER_CLASS_DTL_ID
 *
 * [column]
 *     CENTER_CLASS_DTL_ID, OTHERCD1, OTHERCD2, OTHERCD3, OTHERCD4, OTHERCD5, OTHER1_COMMENT, OTHER2_COMMENT, OTHER3_COMMENT, OTHER4_COMMENT, OTHER5_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     M_CENTER_CLASS_DTL
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenterClassDtl
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long centerClassDtlId = entity.getCenterClassDtlId();
 * String othercd1 = entity.getOthercd1();
 * String othercd2 = entity.getOthercd2();
 * String othercd3 = entity.getOthercd3();
 * String othercd4 = entity.getOthercd4();
 * String othercd5 = entity.getOthercd5();
 * String other1Comment = entity.getOther1Comment();
 * String other2Comment = entity.getOther2Comment();
 * String other3Comment = entity.getOther3Comment();
 * String other4Comment = entity.getOther4Comment();
 * String other5Comment = entity.getOther5Comment();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCenterClassDtlId(centerClassDtlId);
 * entity.setOthercd1(othercd1);
 * entity.setOthercd2(othercd2);
 * entity.setOthercd3(othercd3);
 * entity.setOthercd4(othercd4);
 * entity.setOthercd5(othercd5);
 * entity.setOther1Comment(other1Comment);
 * entity.setOther2Comment(other2Comment);
 * entity.setOther3Comment(other3Comment);
 * entity.setOther4Comment(other4Comment);
 * entity.setOther5Comment(other5Comment);
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
public abstract class BsMCenterClassDtlSub extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} */
    protected Long _centerClassDtlId;

    /** OTHERCD1: {varchar(30)} */
    protected String _othercd1;

    /** OTHERCD2: {varchar(30)} */
    protected String _othercd2;

    /** OTHERCD3: {varchar(30)} */
    protected String _othercd3;

    /** OTHERCD4: {varchar(30)} */
    protected String _othercd4;

    /** OTHERCD5: {varchar(30)} */
    protected String _othercd5;

    /** OTHER1_COMMENT: {varchar(60)} */
    protected String _other1Comment;

    /** OTHER2_COMMENT: {varchar(60)} */
    protected String _other2Comment;

    /** OTHER3_COMMENT: {varchar(60)} */
    protected String _other3Comment;

    /** OTHER4_COMMENT: {varchar(60)} */
    protected String _other4Comment;

    /** OTHER5_COMMENT: {varchar(60)} */
    protected String _other5Comment;

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
        return "M_CENTER_CLASS_DTL_SUB";
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
        if (_centerClassDtlId == null) { return false; }
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
    /** M_CENTER_CLASS_DTL by my CENTER_CLASS_DTL_ID, named 'MCenterClassDtl'. */
    protected MCenterClassDtl _mCenterClassDtl;

    /**
     * [get] M_CENTER_CLASS_DTL by my CENTER_CLASS_DTL_ID, named 'MCenterClassDtl'. <br>
     * @return The entity of foreign property 'MCenterClassDtl'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtl() {
        return _mCenterClassDtl;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my CENTER_CLASS_DTL_ID, named 'MCenterClassDtl'.
     * @param mCenterClassDtl The entity of foreign property 'MCenterClassDtl'. (NullAllowed)
     */
    public void setMCenterClassDtl(MCenterClassDtl mCenterClassDtl) {
        _mCenterClassDtl = mCenterClassDtl;
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
        if (obj instanceof BsMCenterClassDtlSub) {
            BsMCenterClassDtlSub other = (BsMCenterClassDtlSub)obj;
            if (!xSV(_centerClassDtlId, other._centerClassDtlId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerClassDtlId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenterClassDtl != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtl, "mCenterClassDtl")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerClassDtlId));
        sb.append(dm).append(xfND(_othercd1));
        sb.append(dm).append(xfND(_othercd2));
        sb.append(dm).append(xfND(_othercd3));
        sb.append(dm).append(xfND(_othercd4));
        sb.append(dm).append(xfND(_othercd5));
        sb.append(dm).append(xfND(_other1Comment));
        sb.append(dm).append(xfND(_other2Comment));
        sb.append(dm).append(xfND(_other3Comment));
        sb.append(dm).append(xfND(_other4Comment));
        sb.append(dm).append(xfND(_other5Comment));
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
        if (_mCenterClassDtl != null)
        { sb.append(dm).append("mCenterClassDtl"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCenterClassDtlSub clone() {
        return (MCenterClassDtlSub)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} <br>
     * 拠点区分値明細ID
     * @return The value of the column 'CENTER_CLASS_DTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterClassDtlId() {
        checkSpecifiedProperty("centerClassDtlId");
        return _centerClassDtlId;
    }

    /**
     * [set] CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} <br>
     * 拠点区分値明細ID
     * @param centerClassDtlId The value of the column 'CENTER_CLASS_DTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterClassDtlId(Long centerClassDtlId) {
        registerModifiedProperty("centerClassDtlId");
        _centerClassDtlId = centerClassDtlId;
    }

    /**
     * [get] OTHERCD1: {varchar(30)} <br>
     * その他CD１
     * @return The value of the column 'OTHERCD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd1() {
        checkSpecifiedProperty("othercd1");
        return convertEmptyToNull(_othercd1);
    }

    /**
     * [set] OTHERCD1: {varchar(30)} <br>
     * その他CD１
     * @param othercd1 The value of the column 'OTHERCD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd1(String othercd1) {
        registerModifiedProperty("othercd1");
        _othercd1 = othercd1;
    }

    /**
     * [get] OTHERCD2: {varchar(30)} <br>
     * その他CD２
     * @return The value of the column 'OTHERCD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd2() {
        checkSpecifiedProperty("othercd2");
        return convertEmptyToNull(_othercd2);
    }

    /**
     * [set] OTHERCD2: {varchar(30)} <br>
     * その他CD２
     * @param othercd2 The value of the column 'OTHERCD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd2(String othercd2) {
        registerModifiedProperty("othercd2");
        _othercd2 = othercd2;
    }

    /**
     * [get] OTHERCD3: {varchar(30)} <br>
     * その他CD３
     * @return The value of the column 'OTHERCD3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd3() {
        checkSpecifiedProperty("othercd3");
        return convertEmptyToNull(_othercd3);
    }

    /**
     * [set] OTHERCD3: {varchar(30)} <br>
     * その他CD３
     * @param othercd3 The value of the column 'OTHERCD3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd3(String othercd3) {
        registerModifiedProperty("othercd3");
        _othercd3 = othercd3;
    }

    /**
     * [get] OTHERCD4: {varchar(30)} <br>
     * その他CD４
     * @return The value of the column 'OTHERCD4'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd4() {
        checkSpecifiedProperty("othercd4");
        return convertEmptyToNull(_othercd4);
    }

    /**
     * [set] OTHERCD4: {varchar(30)} <br>
     * その他CD４
     * @param othercd4 The value of the column 'OTHERCD4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd4(String othercd4) {
        registerModifiedProperty("othercd4");
        _othercd4 = othercd4;
    }

    /**
     * [get] OTHERCD5: {varchar(30)} <br>
     * その他CD５
     * @return The value of the column 'OTHERCD5'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd5() {
        checkSpecifiedProperty("othercd5");
        return convertEmptyToNull(_othercd5);
    }

    /**
     * [set] OTHERCD5: {varchar(30)} <br>
     * その他CD５
     * @param othercd5 The value of the column 'OTHERCD5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd5(String othercd5) {
        registerModifiedProperty("othercd5");
        _othercd5 = othercd5;
    }

    /**
     * [get] OTHER1_COMMENT: {varchar(60)} <br>
     * その他CD１解説
     * @return The value of the column 'OTHER1_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOther1Comment() {
        checkSpecifiedProperty("other1Comment");
        return convertEmptyToNull(_other1Comment);
    }

    /**
     * [set] OTHER1_COMMENT: {varchar(60)} <br>
     * その他CD１解説
     * @param other1Comment The value of the column 'OTHER1_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOther1Comment(String other1Comment) {
        registerModifiedProperty("other1Comment");
        _other1Comment = other1Comment;
    }

    /**
     * [get] OTHER2_COMMENT: {varchar(60)} <br>
     * その他CD２解説
     * @return The value of the column 'OTHER2_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOther2Comment() {
        checkSpecifiedProperty("other2Comment");
        return convertEmptyToNull(_other2Comment);
    }

    /**
     * [set] OTHER2_COMMENT: {varchar(60)} <br>
     * その他CD２解説
     * @param other2Comment The value of the column 'OTHER2_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOther2Comment(String other2Comment) {
        registerModifiedProperty("other2Comment");
        _other2Comment = other2Comment;
    }

    /**
     * [get] OTHER3_COMMENT: {varchar(60)} <br>
     * その他CD３解説
     * @return The value of the column 'OTHER3_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOther3Comment() {
        checkSpecifiedProperty("other3Comment");
        return convertEmptyToNull(_other3Comment);
    }

    /**
     * [set] OTHER3_COMMENT: {varchar(60)} <br>
     * その他CD３解説
     * @param other3Comment The value of the column 'OTHER3_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOther3Comment(String other3Comment) {
        registerModifiedProperty("other3Comment");
        _other3Comment = other3Comment;
    }

    /**
     * [get] OTHER4_COMMENT: {varchar(60)} <br>
     * その他CD４解説
     * @return The value of the column 'OTHER4_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOther4Comment() {
        checkSpecifiedProperty("other4Comment");
        return convertEmptyToNull(_other4Comment);
    }

    /**
     * [set] OTHER4_COMMENT: {varchar(60)} <br>
     * その他CD４解説
     * @param other4Comment The value of the column 'OTHER4_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOther4Comment(String other4Comment) {
        registerModifiedProperty("other4Comment");
        _other4Comment = other4Comment;
    }

    /**
     * [get] OTHER5_COMMENT: {varchar(60)} <br>
     * その他CD５解説
     * @return The value of the column 'OTHER5_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOther5Comment() {
        checkSpecifiedProperty("other5Comment");
        return convertEmptyToNull(_other5Comment);
    }

    /**
     * [set] OTHER5_COMMENT: {varchar(60)} <br>
     * その他CD５解説
     * @param other5Comment The value of the column 'OTHER5_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOther5Comment(String other5Comment) {
        registerModifiedProperty("other5Comment");
        _other5Comment = other5Comment;
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
