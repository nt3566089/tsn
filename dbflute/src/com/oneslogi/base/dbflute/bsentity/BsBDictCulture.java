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
 * The entity of B_DICT_CULTURE as TABLE. <br>
 * 辞書カルチャマスタ
 * <pre>
 * [primary-key]
 *     DICT_CULTURE_ID
 *
 * [column]
 *     DICT_CULTURE_ID, DICT_ID, CULTURE_ID, DICT_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DICT_CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_CULTURE, M_HT_DICT_CULTURE(AsOne)
 *
 * [referrer table]
 *     M_HT_DICT_CULTURE
 *
 * [foreign property]
 *     bDict, bCulture, mHtDictCultureAsOne
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long dictCultureId = entity.getDictCultureId();
 * Long dictId = entity.getDictId();
 * Long cultureId = entity.getCultureId();
 * String dictNm = entity.getDictNm();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setDictCultureId(dictCultureId);
 * entity.setDictId(dictId);
 * entity.setCultureId(cultureId);
 * entity.setDictNm(dictNm);
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
public abstract class BsBDictCulture extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DICT_CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _dictCultureId;

    /** DICT_ID: {UQ+, IX, NotNull, bigint(19), FK to B_DICT} */
    protected Long _dictId;

    /** CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} */
    protected Long _cultureId;

    /** DICT_NM: {NotNull, varchar(100)} */
    protected String _dictNm;

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
        return "B_DICT_CULTURE";
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
        if (_dictCultureId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param dictId : UQ+, IX, NotNull, bigint(19), FK to B_DICT. (NotNull)
     * @param cultureId : +UQ, IX, NotNull, bigint(19), FK to B_CULTURE. (NotNull)
     */
    public void uniqueBy(Long dictId, Long cultureId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("dictId");
        __uniqueDrivenProperties.addPropertyName("cultureId");
        setDictId(dictId);setCultureId(cultureId);
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

    /** B_CULTURE by my CULTURE_ID, named 'BCulture'. */
    protected BCulture _bCulture;

    /**
     * [get] B_CULTURE by my CULTURE_ID, named 'BCulture'. <br>
     * @return The entity of foreign property 'BCulture'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BCulture getBCulture() {
        return _bCulture;
    }

    /**
     * [set] B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param bCulture The entity of foreign property 'BCulture'. (NullAllowed)
     */
    public void setBCulture(BCulture bCulture) {
        _bCulture = bCulture;
    }

    /** M_HT_DICT_CULTURE by DICT_CULTURE_ID, named 'MHtDictCultureAsOne'. */
    protected MHtDictCulture _mHtDictCultureAsOne;

    /**
     * [get] M_HT_DICT_CULTURE by DICT_CULTURE_ID, named 'MHtDictCultureAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MHtDictCultureAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MHtDictCulture getMHtDictCultureAsOne() {
        return _mHtDictCultureAsOne;
    }

    /**
     * [set] M_HT_DICT_CULTURE by DICT_CULTURE_ID, named 'MHtDictCultureAsOne'.
     * @param MHtDictCultureAsOne The entity of foreign property(referrer-as-one) 'MHtDictCultureAsOne'. (NullAllowed)
     */
    public void setMHtDictCultureAsOne(MHtDictCulture MHtDictCultureAsOne) {
        _mHtDictCultureAsOne = MHtDictCultureAsOne;
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
        if (obj instanceof BsBDictCulture) {
            BsBDictCulture other = (BsBDictCulture)obj;
            if (!xSV(_dictCultureId, other._dictCultureId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dictCultureId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_bCulture != null)
        { sb.append(li).append(xbRDS(_bCulture, "bCulture")); }
        if (_mHtDictCultureAsOne != null)
        { sb.append(li).append(xbRDS(_mHtDictCultureAsOne, "mHtDictCultureAsOne")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dictCultureId));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_cultureId));
        sb.append(dm).append(xfND(_dictNm));
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
        if (_bDict != null)
        { sb.append(dm).append("bDict"); }
        if (_bCulture != null)
        { sb.append(dm).append("bCulture"); }
        if (_mHtDictCultureAsOne != null)
        { sb.append(dm).append("mHtDictCultureAsOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BDictCulture clone() {
        return (BDictCulture)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DICT_CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 辞書カルチャID
     * @return The value of the column 'DICT_CULTURE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDictCultureId() {
        checkSpecifiedProperty("dictCultureId");
        return _dictCultureId;
    }

    /**
     * [set] DICT_CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 辞書カルチャID
     * @param dictCultureId The value of the column 'DICT_CULTURE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDictCultureId(Long dictCultureId) {
        registerModifiedProperty("dictCultureId");
        _dictCultureId = dictCultureId;
    }

    /**
     * [get] DICT_ID: {UQ+, IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {UQ+, IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
    }

    /**
     * [get] CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCultureId() {
        checkSpecifiedProperty("cultureId");
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCultureId(Long cultureId) {
        registerModifiedProperty("cultureId");
        _cultureId = cultureId;
    }

    /**
     * [get] DICT_NM: {NotNull, varchar(100)} <br>
     * 辞書名
     * @return The value of the column 'DICT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getDictNm() {
        checkSpecifiedProperty("dictNm");
        return convertEmptyToNull(_dictNm);
    }

    /**
     * [set] DICT_NM: {NotNull, varchar(100)} <br>
     * 辞書名
     * @param dictNm The value of the column 'DICT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setDictNm(String dictNm) {
        registerModifiedProperty("dictNm");
        _dictNm = dictNm;
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