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
 * The entity of B_ARG as TABLE. <br>
 * 引数マスタ
 * <pre>
 * [primary-key]
 *     ARG_ID
 *
 * [column]
 *     ARG_ID, FUNC_ID, ARG_CD, DICT_ID, ARG_TYPE, NECESSARY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     B_FUNC, B_DICT, V_HT_DICT, B_ARG_VALID(AsOne)
 *
 * [referrer table]
 *     B_ARG_VALID
 *
 * [foreign property]
 *     bFunc, bDict, vHtDict, bArgValidAsOne
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long argId = entity.getArgId();
 * Long funcId = entity.getFuncId();
 * String argCd = entity.getArgCd();
 * Long dictId = entity.getDictId();
 * String argType = entity.getArgType();
 * String necessary = entity.getNecessary();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setArgId(argId);
 * entity.setFuncId(funcId);
 * entity.setArgCd(argCd);
 * entity.setDictId(dictId);
 * entity.setArgType(argType);
 * entity.setNecessary(necessary);
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
public abstract class BsBArg extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ARG_ID: {PK, NotNull, bigint(19)} */
    protected Long _argId;

    /** FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC} */
    protected Long _funcId;

    /** ARG_CD: {+UQ, NotNull, varchar(100)} */
    protected String _argCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    protected Long _dictId;

    /** ARG_TYPE: {varchar(30)} */
    protected String _argType;

    /** NECESSARY: {NotNull, char(1), default=[0]} */
    protected String _necessary;

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
        return "B_ARG";
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
        if (_argId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param funcId : UQ+, IX, NotNull, bigint(19), FK to B_FUNC. (NotNull)
     * @param argCd : +UQ, NotNull, varchar(100). (NotNull)
     */
    public void uniqueBy(Long funcId, String argCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("funcId");
        __uniqueDrivenProperties.addPropertyName("argCd");
        setFuncId(funcId);setArgCd(argCd);
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
    /** B_FUNC by my FUNC_ID, named 'BFunc'. */
    protected BFunc _bFunc;

    /**
     * [get] B_FUNC by my FUNC_ID, named 'BFunc'. <br>
     * @return The entity of foreign property 'BFunc'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BFunc getBFunc() {
        return _bFunc;
    }

    /**
     * [set] B_FUNC by my FUNC_ID, named 'BFunc'.
     * @param bFunc The entity of foreign property 'BFunc'. (NullAllowed)
     */
    public void setBFunc(BFunc bFunc) {
        _bFunc = bFunc;
    }

    /** B_DICT by my DICT_ID, named 'BDict'. */
    protected BDict _bDict;

    /**
     * [get] B_DICT by my DICT_ID, named 'BDict'. <br>
     * @return The entity of foreign property 'BDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BDict getBDict() {
        return _bDict;
    }

    /**
     * [set] B_DICT by my DICT_ID, named 'BDict'.
     * @param bDict The entity of foreign property 'BDict'. (NullAllowed)
     */
    public void setBDict(BDict bDict) {
        _bDict = bDict;
    }

    /** V_HT_DICT by my DICT_ID, named 'VHtDict'. */
    protected VHtDict _vHtDict;

    /**
     * [get] V_HT_DICT by my DICT_ID, named 'VHtDict'. <br>
     * @return The entity of foreign property 'VHtDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VHtDict getVHtDict() {
        return _vHtDict;
    }

    /**
     * [set] V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @param vHtDict The entity of foreign property 'VHtDict'. (NullAllowed)
     */
    public void setVHtDict(VHtDict vHtDict) {
        _vHtDict = vHtDict;
    }

    /** B_ARG_VALID by ARG_ID, named 'BArgValidAsOne'. */
    protected BArgValid _bArgValidAsOne;

    /**
     * [get] B_ARG_VALID by ARG_ID, named 'BArgValidAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'BArgValidAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public BArgValid getBArgValidAsOne() {
        return _bArgValidAsOne;
    }

    /**
     * [set] B_ARG_VALID by ARG_ID, named 'BArgValidAsOne'.
     * @param BArgValidAsOne The entity of foreign property(referrer-as-one) 'BArgValidAsOne'. (NullAllowed)
     */
    public void setBArgValidAsOne(BArgValid BArgValidAsOne) {
        _bArgValidAsOne = BArgValidAsOne;
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
        if (obj instanceof BsBArg) {
            BsBArg other = (BsBArg)obj;
            if (!xSV(_argId, other._argId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _argId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bFunc != null)
        { sb.append(li).append(xbRDS(_bFunc, "bFunc")); }
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_vHtDict != null)
        { sb.append(li).append(xbRDS(_vHtDict, "vHtDict")); }
        if (_bArgValidAsOne != null)
        { sb.append(li).append(xbRDS(_bArgValidAsOne, "bArgValidAsOne")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_argId));
        sb.append(dm).append(xfND(_funcId));
        sb.append(dm).append(xfND(_argCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_argType));
        sb.append(dm).append(xfND(_necessary));
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
        if (_bFunc != null)
        { sb.append(dm).append("bFunc"); }
        if (_bDict != null)
        { sb.append(dm).append("bDict"); }
        if (_vHtDict != null)
        { sb.append(dm).append("vHtDict"); }
        if (_bArgValidAsOne != null)
        { sb.append(dm).append("bArgValidAsOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BArg clone() {
        return (BArg)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ARG_ID: {PK, NotNull, bigint(19)} <br>
     * 引数ID
     * @return The value of the column 'ARG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getArgId() {
        checkSpecifiedProperty("argId");
        return _argId;
    }

    /**
     * [set] ARG_ID: {PK, NotNull, bigint(19)} <br>
     * 引数ID
     * @param argId The value of the column 'ARG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setArgId(Long argId) {
        registerModifiedProperty("argId");
        _argId = argId;
    }

    /**
     * [get] FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC} <br>
     * 機能ID
     * @return The value of the column 'FUNC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFuncId() {
        checkSpecifiedProperty("funcId");
        return _funcId;
    }

    /**
     * [set] FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC} <br>
     * 機能ID
     * @param funcId The value of the column 'FUNC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFuncId(Long funcId) {
        registerModifiedProperty("funcId");
        _funcId = funcId;
    }

    /**
     * [get] ARG_CD: {+UQ, NotNull, varchar(100)} <br>
     * 引数CD
     * @return The value of the column 'ARG_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getArgCd() {
        checkSpecifiedProperty("argCd");
        return convertEmptyToNull(_argCd);
    }

    /**
     * [set] ARG_CD: {+UQ, NotNull, varchar(100)} <br>
     * 引数CD
     * @param argCd The value of the column 'ARG_CD'. (basically NotNull if update: for the constraint)
     */
    public void setArgCd(String argCd) {
        registerModifiedProperty("argCd");
        _argCd = argCd;
    }

    /**
     * [get] DICT_ID: {IX, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
    }

    /**
     * [get] ARG_TYPE: {varchar(30)} <br>
     * 引数型
     * @return The value of the column 'ARG_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArgType() {
        checkSpecifiedProperty("argType");
        return convertEmptyToNull(_argType);
    }

    /**
     * [set] ARG_TYPE: {varchar(30)} <br>
     * 引数型
     * @param argType The value of the column 'ARG_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArgType(String argType) {
        registerModifiedProperty("argType");
        _argType = argType;
    }

    /**
     * [get] NECESSARY: {NotNull, char(1), default=[0]} <br>
     * 必須
     * @return The value of the column 'NECESSARY'. (basically NotNull if selected: for the constraint)
     */
    public String getNecessary() {
        checkSpecifiedProperty("necessary");
        return convertEmptyToNull(_necessary);
    }

    /**
     * [set] NECESSARY: {NotNull, char(1), default=[0]} <br>
     * 必須
     * @param necessary The value of the column 'NECESSARY'. (basically NotNull if update: for the constraint)
     */
    public void setNecessary(String necessary) {
        registerModifiedProperty("necessary");
        _necessary = necessary;
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
