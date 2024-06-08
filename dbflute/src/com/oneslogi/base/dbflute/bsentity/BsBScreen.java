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
 * The entity of B_SCREEN as TABLE. <br>
 * 画面マスタ
 * <pre>
 * [primary-key]
 *     SCREEN_ID
 *
 * [column]
 *     SCREEN_ID, SCREEN_CD, DICT_ID, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SCREEN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, V_HT_DICT
 *
 * [referrer table]
 *     B_ITEM, B_MENU, B_SCREEN_ROLE, M_CENTER_SCREEN, M_CLIENT_SCREEN
 *
 * [foreign property]
 *     bDict, vDict, vHtDict
 *
 * [referrer property]
 *     bItemList, bMenuList, bScreenRoleList, mCenterScreenList, mClientScreenList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long screenId = entity.getScreenId();
 * String screenCd = entity.getScreenCd();
 * Long dictId = entity.getDictId();
 * String systemType = entity.getSystemType();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setScreenId(screenId);
 * entity.setScreenCd(screenCd);
 * entity.setDictId(dictId);
 * entity.setSystemType(systemType);
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
public abstract class BsBScreen extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SCREEN_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _screenId;

    /** SCREEN_CD: {UQ, NotNull, varchar(100)} */
    protected String _screenCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    protected Long _dictId;

    /** SYSTEM_TYPE: {varchar(30)} */
    protected String _systemType;

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
        return "B_SCREEN";
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
        if (_screenId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param screenCd : UQ, NotNull, varchar(100). (NotNull)
     */
    public void uniqueBy(String screenCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("screenCd");
        setScreenCd(screenCd);
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** B_ITEM by SCREEN_ID, named 'BItemList'. */
    protected List<BItem> _bItemList;

    /**
     * [get] B_ITEM by SCREEN_ID, named 'BItemList'.
     * @return The entity list of referrer property 'BItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BItem> getBItemList() {
        if (_bItemList == null) { _bItemList = newReferrerList(); }
        return _bItemList;
    }

    /**
     * [set] B_ITEM by SCREEN_ID, named 'BItemList'.
     * @param bItemList The entity list of referrer property 'BItemList'. (NullAllowed)
     */
    public void setBItemList(List<BItem> bItemList) {
        _bItemList = bItemList;
    }

    /** B_MENU by SCREEN_ID, named 'BMenuList'. */
    protected List<BMenu> _bMenuList;

    /**
     * [get] B_MENU by SCREEN_ID, named 'BMenuList'.
     * @return The entity list of referrer property 'BMenuList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BMenu> getBMenuList() {
        if (_bMenuList == null) { _bMenuList = newReferrerList(); }
        return _bMenuList;
    }

    /**
     * [set] B_MENU by SCREEN_ID, named 'BMenuList'.
     * @param bMenuList The entity list of referrer property 'BMenuList'. (NullAllowed)
     */
    public void setBMenuList(List<BMenu> bMenuList) {
        _bMenuList = bMenuList;
    }

    /** B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleList'. */
    protected List<BScreenRole> _bScreenRoleList;

    /**
     * [get] B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleList'.
     * @return The entity list of referrer property 'BScreenRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BScreenRole> getBScreenRoleList() {
        if (_bScreenRoleList == null) { _bScreenRoleList = newReferrerList(); }
        return _bScreenRoleList;
    }

    /**
     * [set] B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleList'.
     * @param bScreenRoleList The entity list of referrer property 'BScreenRoleList'. (NullAllowed)
     */
    public void setBScreenRoleList(List<BScreenRole> bScreenRoleList) {
        _bScreenRoleList = bScreenRoleList;
    }

    /** M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenList'. */
    protected List<MCenterScreen> _mCenterScreenList;

    /**
     * [get] M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenList'.
     * @return The entity list of referrer property 'MCenterScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterScreen> getMCenterScreenList() {
        if (_mCenterScreenList == null) { _mCenterScreenList = newReferrerList(); }
        return _mCenterScreenList;
    }

    /**
     * [set] M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenList'.
     * @param mCenterScreenList The entity list of referrer property 'MCenterScreenList'. (NullAllowed)
     */
    public void setMCenterScreenList(List<MCenterScreen> mCenterScreenList) {
        _mCenterScreenList = mCenterScreenList;
    }

    /** M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenList'. */
    protected List<MClientScreen> _mClientScreenList;

    /**
     * [get] M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenList'.
     * @return The entity list of referrer property 'MClientScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientScreen> getMClientScreenList() {
        if (_mClientScreenList == null) { _mClientScreenList = newReferrerList(); }
        return _mClientScreenList;
    }

    /**
     * [set] M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenList'.
     * @param mClientScreenList The entity list of referrer property 'MClientScreenList'. (NullAllowed)
     */
    public void setMClientScreenList(List<MClientScreen> mClientScreenList) {
        _mClientScreenList = mClientScreenList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBScreen) {
            BsBScreen other = (BsBScreen)obj;
            if (!xSV(_screenId, other._screenId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _screenId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_vHtDict != null)
        { sb.append(li).append(xbRDS(_vHtDict, "vHtDict")); }
        if (_bItemList != null) { for (BItem et : _bItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bItemList")); } } }
        if (_bMenuList != null) { for (BMenu et : _bMenuList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bMenuList")); } } }
        if (_bScreenRoleList != null) { for (BScreenRole et : _bScreenRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bScreenRoleList")); } } }
        if (_mCenterScreenList != null) { for (MCenterScreen et : _mCenterScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterScreenList")); } } }
        if (_mClientScreenList != null) { for (MClientScreen et : _mClientScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientScreenList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_screenId));
        sb.append(dm).append(xfND(_screenCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_systemType));
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
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_vHtDict != null)
        { sb.append(dm).append("vHtDict"); }
        if (_bItemList != null && !_bItemList.isEmpty())
        { sb.append(dm).append("bItemList"); }
        if (_bMenuList != null && !_bMenuList.isEmpty())
        { sb.append(dm).append("bMenuList"); }
        if (_bScreenRoleList != null && !_bScreenRoleList.isEmpty())
        { sb.append(dm).append("bScreenRoleList"); }
        if (_mCenterScreenList != null && !_mCenterScreenList.isEmpty())
        { sb.append(dm).append("mCenterScreenList"); }
        if (_mClientScreenList != null && !_mClientScreenList.isEmpty())
        { sb.append(dm).append("mClientScreenList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BScreen clone() {
        return (BScreen)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SCREEN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 画面ID
     * @return The value of the column 'SCREEN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getScreenId() {
        checkSpecifiedProperty("screenId");
        return _screenId;
    }

    /**
     * [set] SCREEN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 画面ID
     * @param screenId The value of the column 'SCREEN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setScreenId(Long screenId) {
        registerModifiedProperty("screenId");
        _screenId = screenId;
    }

    /**
     * [get] SCREEN_CD: {UQ, NotNull, varchar(100)} <br>
     * 画面CD
     * @return The value of the column 'SCREEN_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getScreenCd() {
        checkSpecifiedProperty("screenCd");
        return convertEmptyToNull(_screenCd);
    }

    /**
     * [set] SCREEN_CD: {UQ, NotNull, varchar(100)} <br>
     * 画面CD
     * @param screenCd The value of the column 'SCREEN_CD'. (basically NotNull if update: for the constraint)
     */
    public void setScreenCd(String screenCd) {
        registerModifiedProperty("screenCd");
        _screenCd = screenCd;
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
     * [get] SYSTEM_TYPE: {varchar(30)} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSystemType() {
        checkSpecifiedProperty("systemType");
        return convertEmptyToNull(_systemType);
    }

    /**
     * [set] SYSTEM_TYPE: {varchar(30)} <br>
     * システム種別
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSystemType(String systemType) {
        registerModifiedProperty("systemType");
        _systemType = systemType;
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
