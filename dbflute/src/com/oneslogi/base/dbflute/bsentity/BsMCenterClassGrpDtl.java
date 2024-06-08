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
 * The entity of M_CENTER_CLASS_GRP_DTL as TABLE. <br>
 * 拠点区分値グループ明細マスタ
 * <pre>
 * [primary-key]
 *     CENTER_CLASS_GRP_DTL_ID
 *
 * [column]
 *     CENTER_CLASS_GRP_DTL_ID, CENTER_CLASS_GRP_ID, CENTER_CLASS_DTL_ID, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER_CLASS_DTL, M_CENTER_CLASS_GRP
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenterClassDtl, mCenterClassGrp
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long centerClassGrpDtlId = entity.getCenterClassGrpDtlId();
 * Long centerClassGrpId = entity.getCenterClassGrpId();
 * Long centerClassDtlId = entity.getCenterClassDtlId();
 * String defaultFlg = entity.getDefaultFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCenterClassGrpDtlId(centerClassGrpDtlId);
 * entity.setCenterClassGrpId(centerClassGrpId);
 * entity.setCenterClassDtlId(centerClassDtlId);
 * entity.setDefaultFlg(defaultFlg);
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
public abstract class BsMCenterClassGrpDtl extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _centerClassGrpDtlId;

    /** CENTER_CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_GRP} */
    protected Long _centerClassGrpId;

    /** CENTER_CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} */
    protected Long _centerClassDtlId;

    /** DEFAULT_FLG: {NotNull, char(1), default=[0]} */
    protected String _defaultFlg;

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
        return "M_CENTER_CLASS_GRP_DTL";
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
        if (_centerClassGrpDtlId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerClassGrpId : UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_GRP. (NotNull)
     * @param centerClassDtlId : +UQ, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL. (NotNull)
     */
    public void uniqueBy(Long centerClassGrpId, Long centerClassDtlId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerClassGrpId");
        __uniqueDrivenProperties.addPropertyName("centerClassDtlId");
        setCenterClassGrpId(centerClassGrpId);setCenterClassDtlId(centerClassDtlId);
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

    /** M_CENTER_CLASS_GRP by my CENTER_CLASS_GRP_ID, named 'MCenterClassGrp'. */
    protected MCenterClassGrp _mCenterClassGrp;

    /**
     * [get] M_CENTER_CLASS_GRP by my CENTER_CLASS_GRP_ID, named 'MCenterClassGrp'. <br>
     * @return The entity of foreign property 'MCenterClassGrp'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassGrp getMCenterClassGrp() {
        return _mCenterClassGrp;
    }

    /**
     * [set] M_CENTER_CLASS_GRP by my CENTER_CLASS_GRP_ID, named 'MCenterClassGrp'.
     * @param mCenterClassGrp The entity of foreign property 'MCenterClassGrp'. (NullAllowed)
     */
    public void setMCenterClassGrp(MCenterClassGrp mCenterClassGrp) {
        _mCenterClassGrp = mCenterClassGrp;
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
        if (obj instanceof BsMCenterClassGrpDtl) {
            BsMCenterClassGrpDtl other = (BsMCenterClassGrpDtl)obj;
            if (!xSV(_centerClassGrpDtlId, other._centerClassGrpDtlId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerClassGrpDtlId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenterClassDtl != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtl, "mCenterClassDtl")); }
        if (_mCenterClassGrp != null)
        { sb.append(li).append(xbRDS(_mCenterClassGrp, "mCenterClassGrp")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerClassGrpDtlId));
        sb.append(dm).append(xfND(_centerClassGrpId));
        sb.append(dm).append(xfND(_centerClassDtlId));
        sb.append(dm).append(xfND(_defaultFlg));
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
        if (_mCenterClassGrp != null)
        { sb.append(dm).append("mCenterClassGrp"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCenterClassGrpDtl clone() {
        return (MCenterClassGrpDtl)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点区分値グループ明細ID
     * @return The value of the column 'CENTER_CLASS_GRP_DTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterClassGrpDtlId() {
        checkSpecifiedProperty("centerClassGrpDtlId");
        return _centerClassGrpDtlId;
    }

    /**
     * [set] CENTER_CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点区分値グループ明細ID
     * @param centerClassGrpDtlId The value of the column 'CENTER_CLASS_GRP_DTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterClassGrpDtlId(Long centerClassGrpDtlId) {
        registerModifiedProperty("centerClassGrpDtlId");
        _centerClassGrpDtlId = centerClassGrpDtlId;
    }

    /**
     * [get] CENTER_CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_GRP} <br>
     * 拠点区分値グループID
     * @return The value of the column 'CENTER_CLASS_GRP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterClassGrpId() {
        checkSpecifiedProperty("centerClassGrpId");
        return _centerClassGrpId;
    }

    /**
     * [set] CENTER_CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_GRP} <br>
     * 拠点区分値グループID
     * @param centerClassGrpId The value of the column 'CENTER_CLASS_GRP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterClassGrpId(Long centerClassGrpId) {
        registerModifiedProperty("centerClassGrpId");
        _centerClassGrpId = centerClassGrpId;
    }

    /**
     * [get] CENTER_CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} <br>
     * 拠点区分値明細ID
     * @return The value of the column 'CENTER_CLASS_DTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterClassDtlId() {
        checkSpecifiedProperty("centerClassDtlId");
        return _centerClassDtlId;
    }

    /**
     * [set] CENTER_CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} <br>
     * 拠点区分値明細ID
     * @param centerClassDtlId The value of the column 'CENTER_CLASS_DTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterClassDtlId(Long centerClassDtlId) {
        registerModifiedProperty("centerClassDtlId");
        _centerClassDtlId = centerClassDtlId;
    }

    /**
     * [get] DEFAULT_FLG: {NotNull, char(1), default=[0]} <br>
     * デフォルトフラグ
     * @return The value of the column 'DEFAULT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDefaultFlg() {
        checkSpecifiedProperty("defaultFlg");
        return convertEmptyToNull(_defaultFlg);
    }

    /**
     * [set] DEFAULT_FLG: {NotNull, char(1), default=[0]} <br>
     * デフォルトフラグ
     * @param defaultFlg The value of the column 'DEFAULT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultFlg(String defaultFlg) {
        registerModifiedProperty("defaultFlg");
        _defaultFlg = defaultFlg;
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
