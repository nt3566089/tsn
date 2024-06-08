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
 * The entity of B_CULTURE as TABLE. <br>
 * カルチャマスタ
 * <pre>
 * [primary-key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, CULTURE_CD, DICT_ID, LANG_CULTURE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_CULTURE, V_DICT, B_CULTURE_ATTRIBUTE(AsOne)
 *
 * [referrer table]
 *     B_CULTURE, B_DICT_CULTURE, B_INFO, B_MESSAGE, B_USER, M_CENTER, B_CULTURE_ATTRIBUTE
 *
 * [foreign property]
 *     bDict, bCultureSelf, vDict, bCultureAttributeAsOne
 *
 * [referrer property]
 *     bCultureSelfList, bDictCultureList, bInfoList, bMessageList, bUserList, mCenterList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long cultureId = entity.getCultureId();
 * String cultureCd = entity.getCultureCd();
 * Long dictId = entity.getDictId();
 * Long langCultureId = entity.getLangCultureId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCultureId(cultureId);
 * entity.setCultureCd(cultureCd);
 * entity.setDictId(dictId);
 * entity.setLangCultureId(langCultureId);
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
public abstract class BsBCulture extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _cultureId;

    /** CULTURE_CD: {UQ, NotNull, varchar(30)} */
    protected String _cultureCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    protected Long _dictId;

    /** LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE} */
    protected Long _langCultureId;

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
        return "B_CULTURE";
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
        if (_cultureId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param cultureCd : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String cultureCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("cultureCd");
        setCultureCd(cultureCd);
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

    /** B_CULTURE by my LANG_CULTURE_ID, named 'BCultureSelf'. */
    protected BCulture _bCultureSelf;

    /**
     * [get] B_CULTURE by my LANG_CULTURE_ID, named 'BCultureSelf'. <br>
     * @return The entity of foreign property 'BCultureSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BCulture getBCultureSelf() {
        return _bCultureSelf;
    }

    /**
     * [set] B_CULTURE by my LANG_CULTURE_ID, named 'BCultureSelf'.
     * @param bCultureSelf The entity of foreign property 'BCultureSelf'. (NullAllowed)
     */
    public void setBCultureSelf(BCulture bCultureSelf) {
        _bCultureSelf = bCultureSelf;
    }

    /** V_DICT by my DICT_ID, named 'VDict'. */
    protected VDict _vDict;

    /**
     * [get] V_DICT by my DICT_ID, named 'VDict'. <br>
     * @return The entity of foreign property 'VDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VDict getVDict() {
        return _vDict;
    }

    /**
     * [set] V_DICT by my DICT_ID, named 'VDict'.
     * @param vDict The entity of foreign property 'VDict'. (NullAllowed)
     */
    public void setVDict(VDict vDict) {
        _vDict = vDict;
    }

    /** B_CULTURE_ATTRIBUTE by CULTURE_ID, named 'BCultureAttributeAsOne'. */
    protected BCultureAttribute _bCultureAttributeAsOne;

    /**
     * [get] B_CULTURE_ATTRIBUTE by CULTURE_ID, named 'BCultureAttributeAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'BCultureAttributeAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public BCultureAttribute getBCultureAttributeAsOne() {
        return _bCultureAttributeAsOne;
    }

    /**
     * [set] B_CULTURE_ATTRIBUTE by CULTURE_ID, named 'BCultureAttributeAsOne'.
     * @param BCultureAttributeAsOne The entity of foreign property(referrer-as-one) 'BCultureAttributeAsOne'. (NullAllowed)
     */
    public void setBCultureAttributeAsOne(BCultureAttribute BCultureAttributeAsOne) {
        _bCultureAttributeAsOne = BCultureAttributeAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfList'. */
    protected List<BCulture> _bCultureSelfList;

    /**
     * [get] B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfList'.
     * @return The entity list of referrer property 'BCultureSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BCulture> getBCultureSelfList() {
        if (_bCultureSelfList == null) { _bCultureSelfList = newReferrerList(); }
        return _bCultureSelfList;
    }

    /**
     * [set] B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfList'.
     * @param bCultureSelfList The entity list of referrer property 'BCultureSelfList'. (NullAllowed)
     */
    public void setBCultureSelfList(List<BCulture> bCultureSelfList) {
        _bCultureSelfList = bCultureSelfList;
    }

    /** B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureList'. */
    protected List<BDictCulture> _bDictCultureList;

    /**
     * [get] B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureList'.
     * @return The entity list of referrer property 'BDictCultureList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BDictCulture> getBDictCultureList() {
        if (_bDictCultureList == null) { _bDictCultureList = newReferrerList(); }
        return _bDictCultureList;
    }

    /**
     * [set] B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureList'.
     * @param bDictCultureList The entity list of referrer property 'BDictCultureList'. (NullAllowed)
     */
    public void setBDictCultureList(List<BDictCulture> bDictCultureList) {
        _bDictCultureList = bDictCultureList;
    }

    /** B_INFO by CULTURE_ID, named 'BInfoList'. */
    protected List<BInfo> _bInfoList;

    /**
     * [get] B_INFO by CULTURE_ID, named 'BInfoList'.
     * @return The entity list of referrer property 'BInfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BInfo> getBInfoList() {
        if (_bInfoList == null) { _bInfoList = newReferrerList(); }
        return _bInfoList;
    }

    /**
     * [set] B_INFO by CULTURE_ID, named 'BInfoList'.
     * @param bInfoList The entity list of referrer property 'BInfoList'. (NullAllowed)
     */
    public void setBInfoList(List<BInfo> bInfoList) {
        _bInfoList = bInfoList;
    }

    /** B_MESSAGE by CULTURE_ID, named 'BMessageList'. */
    protected List<BMessage> _bMessageList;

    /**
     * [get] B_MESSAGE by CULTURE_ID, named 'BMessageList'.
     * @return The entity list of referrer property 'BMessageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BMessage> getBMessageList() {
        if (_bMessageList == null) { _bMessageList = newReferrerList(); }
        return _bMessageList;
    }

    /**
     * [set] B_MESSAGE by CULTURE_ID, named 'BMessageList'.
     * @param bMessageList The entity list of referrer property 'BMessageList'. (NullAllowed)
     */
    public void setBMessageList(List<BMessage> bMessageList) {
        _bMessageList = bMessageList;
    }

    /** B_USER by CULTURE_ID, named 'BUserList'. */
    protected List<BUser> _bUserList;

    /**
     * [get] B_USER by CULTURE_ID, named 'BUserList'.
     * @return The entity list of referrer property 'BUserList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BUser> getBUserList() {
        if (_bUserList == null) { _bUserList = newReferrerList(); }
        return _bUserList;
    }

    /**
     * [set] B_USER by CULTURE_ID, named 'BUserList'.
     * @param bUserList The entity list of referrer property 'BUserList'. (NullAllowed)
     */
    public void setBUserList(List<BUser> bUserList) {
        _bUserList = bUserList;
    }

    /** M_CENTER by CULTURE_ID, named 'MCenterList'. */
    protected List<MCenter> _mCenterList;

    /**
     * [get] M_CENTER by CULTURE_ID, named 'MCenterList'.
     * @return The entity list of referrer property 'MCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenter> getMCenterList() {
        if (_mCenterList == null) { _mCenterList = newReferrerList(); }
        return _mCenterList;
    }

    /**
     * [set] M_CENTER by CULTURE_ID, named 'MCenterList'.
     * @param mCenterList The entity list of referrer property 'MCenterList'. (NullAllowed)
     */
    public void setMCenterList(List<MCenter> mCenterList) {
        _mCenterList = mCenterList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBCulture) {
            BsBCulture other = (BsBCulture)obj;
            if (!xSV(_cultureId, other._cultureId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cultureId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_bCultureSelf != null)
        { sb.append(li).append(xbRDS(_bCultureSelf, "bCultureSelf")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_bCultureAttributeAsOne != null)
        { sb.append(li).append(xbRDS(_bCultureAttributeAsOne, "bCultureAttributeAsOne")); }
        if (_bCultureSelfList != null) { for (BCulture et : _bCultureSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bCultureSelfList")); } } }
        if (_bDictCultureList != null) { for (BDictCulture et : _bDictCultureList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bDictCultureList")); } } }
        if (_bInfoList != null) { for (BInfo et : _bInfoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bInfoList")); } } }
        if (_bMessageList != null) { for (BMessage et : _bMessageList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bMessageList")); } } }
        if (_bUserList != null) { for (BUser et : _bUserList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bUserList")); } } }
        if (_mCenterList != null) { for (MCenter et : _mCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_cultureId));
        sb.append(dm).append(xfND(_cultureCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_langCultureId));
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
        if (_bCultureSelf != null)
        { sb.append(dm).append("bCultureSelf"); }
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_bCultureAttributeAsOne != null)
        { sb.append(dm).append("bCultureAttributeAsOne"); }
        if (_bCultureSelfList != null && !_bCultureSelfList.isEmpty())
        { sb.append(dm).append("bCultureSelfList"); }
        if (_bDictCultureList != null && !_bDictCultureList.isEmpty())
        { sb.append(dm).append("bDictCultureList"); }
        if (_bInfoList != null && !_bInfoList.isEmpty())
        { sb.append(dm).append("bInfoList"); }
        if (_bMessageList != null && !_bMessageList.isEmpty())
        { sb.append(dm).append("bMessageList"); }
        if (_bUserList != null && !_bUserList.isEmpty())
        { sb.append(dm).append("bUserList"); }
        if (_mCenterList != null && !_mCenterList.isEmpty())
        { sb.append(dm).append("mCenterList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BCulture clone() {
        return (BCulture)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCultureId() {
        checkSpecifiedProperty("cultureId");
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCultureId(Long cultureId) {
        registerModifiedProperty("cultureId");
        _cultureId = cultureId;
    }

    /**
     * [get] CULTURE_CD: {UQ, NotNull, varchar(30)} <br>
     * カルチャCD
     * @return The value of the column 'CULTURE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCultureCd() {
        checkSpecifiedProperty("cultureCd");
        return convertEmptyToNull(_cultureCd);
    }

    /**
     * [set] CULTURE_CD: {UQ, NotNull, varchar(30)} <br>
     * カルチャCD
     * @param cultureCd The value of the column 'CULTURE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCultureCd(String cultureCd) {
        registerModifiedProperty("cultureCd");
        _cultureCd = cultureCd;
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
     * [get] LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE} <br>
     * 言語カルチャID
     * @return The value of the column 'LANG_CULTURE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLangCultureId() {
        checkSpecifiedProperty("langCultureId");
        return _langCultureId;
    }

    /**
     * [set] LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE} <br>
     * 言語カルチャID
     * @param langCultureId The value of the column 'LANG_CULTURE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLangCultureId(Long langCultureId) {
        registerModifiedProperty("langCultureId");
        _langCultureId = langCultureId;
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
