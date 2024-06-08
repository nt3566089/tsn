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
 * The entity of B_FUNC as TABLE. <br>
 * 機能マスタ
 * <pre>
 * [primary-key]
 *     FUNC_ID
 *
 * [column]
 *     FUNC_ID, CLASS_CD, METHOD_CD, FUNC_CD, FUNC_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FUNC_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     B_ARG, B_FUNC_ROLE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     bArgList, bFuncRoleList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long funcId = entity.getFuncId();
 * String classCd = entity.getClassCd();
 * String methodCd = entity.getMethodCd();
 * String funcCd = entity.getFuncCd();
 * String funcNm = entity.getFuncNm();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setFuncId(funcId);
 * entity.setClassCd(classCd);
 * entity.setMethodCd(methodCd);
 * entity.setFuncCd(funcCd);
 * entity.setFuncNm(funcNm);
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
public abstract class BsBFunc extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FUNC_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _funcId;

    /** CLASS_CD: {UQ+, NotNull, varchar(100)} */
    protected String _classCd;

    /** METHOD_CD: {+UQ, NotNull, varchar(100)} */
    protected String _methodCd;

    /** FUNC_CD: {varchar(100)} */
    protected String _funcCd;

    /** FUNC_NM: {varchar(60)} */
    protected String _funcNm;

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
        return "B_FUNC";
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
        if (_funcId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param classCd : UQ+, NotNull, varchar(100). (NotNull)
     * @param methodCd : +UQ, NotNull, varchar(100). (NotNull)
     */
    public void uniqueBy(String classCd, String methodCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("classCd");
        __uniqueDrivenProperties.addPropertyName("methodCd");
        setClassCd(classCd);setMethodCd(methodCd);
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
    /** B_ARG by FUNC_ID, named 'BArgList'. */
    protected List<BArg> _bArgList;

    /**
     * [get] B_ARG by FUNC_ID, named 'BArgList'.
     * @return The entity list of referrer property 'BArgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BArg> getBArgList() {
        if (_bArgList == null) { _bArgList = newReferrerList(); }
        return _bArgList;
    }

    /**
     * [set] B_ARG by FUNC_ID, named 'BArgList'.
     * @param bArgList The entity list of referrer property 'BArgList'. (NullAllowed)
     */
    public void setBArgList(List<BArg> bArgList) {
        _bArgList = bArgList;
    }

    /** B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleList'. */
    protected List<BFuncRole> _bFuncRoleList;

    /**
     * [get] B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleList'.
     * @return The entity list of referrer property 'BFuncRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BFuncRole> getBFuncRoleList() {
        if (_bFuncRoleList == null) { _bFuncRoleList = newReferrerList(); }
        return _bFuncRoleList;
    }

    /**
     * [set] B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleList'.
     * @param bFuncRoleList The entity list of referrer property 'BFuncRoleList'. (NullAllowed)
     */
    public void setBFuncRoleList(List<BFuncRole> bFuncRoleList) {
        _bFuncRoleList = bFuncRoleList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBFunc) {
            BsBFunc other = (BsBFunc)obj;
            if (!xSV(_funcId, other._funcId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _funcId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bArgList != null) { for (BArg et : _bArgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bArgList")); } } }
        if (_bFuncRoleList != null) { for (BFuncRole et : _bFuncRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bFuncRoleList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_funcId));
        sb.append(dm).append(xfND(_classCd));
        sb.append(dm).append(xfND(_methodCd));
        sb.append(dm).append(xfND(_funcCd));
        sb.append(dm).append(xfND(_funcNm));
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
        if (_bArgList != null && !_bArgList.isEmpty())
        { sb.append(dm).append("bArgList"); }
        if (_bFuncRoleList != null && !_bFuncRoleList.isEmpty())
        { sb.append(dm).append("bFuncRoleList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BFunc clone() {
        return (BFunc)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FUNC_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 機能ID
     * @return The value of the column 'FUNC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFuncId() {
        checkSpecifiedProperty("funcId");
        return _funcId;
    }

    /**
     * [set] FUNC_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 機能ID
     * @param funcId The value of the column 'FUNC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFuncId(Long funcId) {
        registerModifiedProperty("funcId");
        _funcId = funcId;
    }

    /**
     * [get] CLASS_CD: {UQ+, NotNull, varchar(100)} <br>
     * クラス名
     * @return The value of the column 'CLASS_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getClassCd() {
        checkSpecifiedProperty("classCd");
        return convertEmptyToNull(_classCd);
    }

    /**
     * [set] CLASS_CD: {UQ+, NotNull, varchar(100)} <br>
     * クラス名
     * @param classCd The value of the column 'CLASS_CD'. (basically NotNull if update: for the constraint)
     */
    public void setClassCd(String classCd) {
        registerModifiedProperty("classCd");
        _classCd = classCd;
    }

    /**
     * [get] METHOD_CD: {+UQ, NotNull, varchar(100)} <br>
     * メソッド名
     * @return The value of the column 'METHOD_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getMethodCd() {
        checkSpecifiedProperty("methodCd");
        return convertEmptyToNull(_methodCd);
    }

    /**
     * [set] METHOD_CD: {+UQ, NotNull, varchar(100)} <br>
     * メソッド名
     * @param methodCd The value of the column 'METHOD_CD'. (basically NotNull if update: for the constraint)
     */
    public void setMethodCd(String methodCd) {
        registerModifiedProperty("methodCd");
        _methodCd = methodCd;
    }

    /**
     * [get] FUNC_CD: {varchar(100)} <br>
     * 機能名
     * @return The value of the column 'FUNC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFuncCd() {
        checkSpecifiedProperty("funcCd");
        return convertEmptyToNull(_funcCd);
    }

    /**
     * [set] FUNC_CD: {varchar(100)} <br>
     * 機能名
     * @param funcCd The value of the column 'FUNC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFuncCd(String funcCd) {
        registerModifiedProperty("funcCd");
        _funcCd = funcCd;
    }

    /**
     * [get] FUNC_NM: {varchar(60)} <br>
     * 機能名称
     * @return The value of the column 'FUNC_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getFuncNm() {
        checkSpecifiedProperty("funcNm");
        return convertEmptyToNull(_funcNm);
    }

    /**
     * [set] FUNC_NM: {varchar(60)} <br>
     * 機能名称
     * @param funcNm The value of the column 'FUNC_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFuncNm(String funcNm) {
        registerModifiedProperty("funcNm");
        _funcNm = funcNm;
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
