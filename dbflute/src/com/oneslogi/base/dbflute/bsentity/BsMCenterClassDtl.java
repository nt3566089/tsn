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
 * The entity of M_CENTER_CLASS_DTL as TABLE. <br>
 * 拠点区分値明細マスタ
 * <pre>
 * [primary-key]
 *     CENTER_CLASS_DTL_ID
 *
 * [column]
 *     CENTER_CLASS_DTL_ID, CENTER_CLASS_ID, CLASS_DTL_CD, DICT_ID, VIEW_ORDER, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER_CLASS, B_DICT, V_DICT, M_CENTER_CLASS_DTL_SUB(AsOne)
 *
 * [referrer table]
 *     M_CENTER_CLASS_GRP_DTL, M_CENTER_CLASS_DTL_SUB
 *
 * [foreign property]
 *     mCenterClass, bDict, vDict, mCenterClassDtlSubAsOne
 *
 * [referrer property]
 *     mCenterClassGrpDtlList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long centerClassDtlId = entity.getCenterClassDtlId();
 * Long centerClassId = entity.getCenterClassId();
 * String classDtlCd = entity.getClassDtlCd();
 * Long dictId = entity.getDictId();
 * Long viewOrder = entity.getViewOrder();
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
 * entity.setCenterClassDtlId(centerClassDtlId);
 * entity.setCenterClassId(centerClassId);
 * entity.setClassDtlCd(classDtlCd);
 * entity.setDictId(dictId);
 * entity.setViewOrder(viewOrder);
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
public abstract class BsMCenterClassDtl extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _centerClassDtlId;

    /** CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS} */
    protected Long _centerClassId;

    /** CLASS_DTL_CD: {+UQ, NotNull, varchar(100)} */
    protected String _classDtlCd;

    /** DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} */
    protected Long _dictId;

    /** VIEW_ORDER: {bigint(19)} */
    protected Long _viewOrder;

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
        return "M_CENTER_CLASS_DTL";
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

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerClassId : UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS. (NotNull)
     * @param classDtlCd : +UQ, NotNull, varchar(100). (NotNull)
     */
    public void uniqueBy(Long centerClassId, String classDtlCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerClassId");
        __uniqueDrivenProperties.addPropertyName("classDtlCd");
        setCenterClassId(centerClassId);setClassDtlCd(classDtlCd);
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
    /** M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'. */
    protected MCenterClass _mCenterClass;

    /**
     * [get] M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'. <br>
     * @return The entity of foreign property 'MCenterClass'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClass getMCenterClass() {
        return _mCenterClass;
    }

    /**
     * [set] M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @param mCenterClass The entity of foreign property 'MCenterClass'. (NullAllowed)
     */
    public void setMCenterClass(MCenterClass mCenterClass) {
        _mCenterClass = mCenterClass;
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

    /** M_CENTER_CLASS_DTL_SUB by CENTER_CLASS_DTL_ID, named 'MCenterClassDtlSubAsOne'. */
    protected MCenterClassDtlSub _mCenterClassDtlSubAsOne;

    /**
     * [get] M_CENTER_CLASS_DTL_SUB by CENTER_CLASS_DTL_ID, named 'MCenterClassDtlSubAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MCenterClassDtlSubAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MCenterClassDtlSub getMCenterClassDtlSubAsOne() {
        return _mCenterClassDtlSubAsOne;
    }

    /**
     * [set] M_CENTER_CLASS_DTL_SUB by CENTER_CLASS_DTL_ID, named 'MCenterClassDtlSubAsOne'.
     * @param MCenterClassDtlSubAsOne The entity of foreign property(referrer-as-one) 'MCenterClassDtlSubAsOne'. (NullAllowed)
     */
    public void setMCenterClassDtlSubAsOne(MCenterClassDtlSub MCenterClassDtlSubAsOne) {
        _mCenterClassDtlSubAsOne = MCenterClassDtlSubAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_DTL_ID, named 'MCenterClassGrpDtlList'. */
    protected List<MCenterClassGrpDtl> _mCenterClassGrpDtlList;

    /**
     * [get] M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_DTL_ID, named 'MCenterClassGrpDtlList'.
     * @return The entity list of referrer property 'MCenterClassGrpDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterClassGrpDtl> getMCenterClassGrpDtlList() {
        if (_mCenterClassGrpDtlList == null) { _mCenterClassGrpDtlList = newReferrerList(); }
        return _mCenterClassGrpDtlList;
    }

    /**
     * [set] M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_DTL_ID, named 'MCenterClassGrpDtlList'.
     * @param mCenterClassGrpDtlList The entity list of referrer property 'MCenterClassGrpDtlList'. (NullAllowed)
     */
    public void setMCenterClassGrpDtlList(List<MCenterClassGrpDtl> mCenterClassGrpDtlList) {
        _mCenterClassGrpDtlList = mCenterClassGrpDtlList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCenterClassDtl) {
            BsMCenterClassDtl other = (BsMCenterClassDtl)obj;
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
        if (_mCenterClass != null)
        { sb.append(li).append(xbRDS(_mCenterClass, "mCenterClass")); }
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_mCenterClassDtlSubAsOne != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlSubAsOne, "mCenterClassDtlSubAsOne")); }
        if (_mCenterClassGrpDtlList != null) { for (MCenterClassGrpDtl et : _mCenterClassGrpDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterClassGrpDtlList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerClassDtlId));
        sb.append(dm).append(xfND(_centerClassId));
        sb.append(dm).append(xfND(_classDtlCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_viewOrder));
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
        if (_mCenterClass != null)
        { sb.append(dm).append("mCenterClass"); }
        if (_bDict != null)
        { sb.append(dm).append("bDict"); }
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_mCenterClassDtlSubAsOne != null)
        { sb.append(dm).append("mCenterClassDtlSubAsOne"); }
        if (_mCenterClassGrpDtlList != null && !_mCenterClassGrpDtlList.isEmpty())
        { sb.append(dm).append("mCenterClassGrpDtlList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCenterClassDtl clone() {
        return (MCenterClassDtl)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点区分値明細ID
     * @return The value of the column 'CENTER_CLASS_DTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterClassDtlId() {
        checkSpecifiedProperty("centerClassDtlId");
        return _centerClassDtlId;
    }

    /**
     * [set] CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点区分値明細ID
     * @param centerClassDtlId The value of the column 'CENTER_CLASS_DTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterClassDtlId(Long centerClassDtlId) {
        registerModifiedProperty("centerClassDtlId");
        _centerClassDtlId = centerClassDtlId;
    }

    /**
     * [get] CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS} <br>
     * 拠点区分値ID
     * @return The value of the column 'CENTER_CLASS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterClassId() {
        checkSpecifiedProperty("centerClassId");
        return _centerClassId;
    }

    /**
     * [set] CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS} <br>
     * 拠点区分値ID
     * @param centerClassId The value of the column 'CENTER_CLASS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterClassId(Long centerClassId) {
        registerModifiedProperty("centerClassId");
        _centerClassId = centerClassId;
    }

    /**
     * [get] CLASS_DTL_CD: {+UQ, NotNull, varchar(100)} <br>
     * 区分値明細CD
     * @return The value of the column 'CLASS_DTL_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getClassDtlCd() {
        checkSpecifiedProperty("classDtlCd");
        return convertEmptyToNull(_classDtlCd);
    }

    /**
     * [set] CLASS_DTL_CD: {+UQ, NotNull, varchar(100)} <br>
     * 区分値明細CD
     * @param classDtlCd The value of the column 'CLASS_DTL_CD'. (basically NotNull if update: for the constraint)
     */
    public void setClassDtlCd(String classDtlCd) {
        registerModifiedProperty("classDtlCd");
        _classDtlCd = classDtlCd;
    }

    /**
     * [get] DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
    }

    /**
     * [get] VIEW_ORDER: {bigint(19)} <br>
     * 表示順
     * @return The value of the column 'VIEW_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getViewOrder() {
        checkSpecifiedProperty("viewOrder");
        return _viewOrder;
    }

    /**
     * [set] VIEW_ORDER: {bigint(19)} <br>
     * 表示順
     * @param viewOrder The value of the column 'VIEW_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setViewOrder(Long viewOrder) {
        registerModifiedProperty("viewOrder");
        _viewOrder = viewOrder;
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
