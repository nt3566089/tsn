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
 * The entity of B_ROLE_GRP as TABLE. <br>
 * 権限グループマスタ
 * <pre>
 * [primary-key]
 *     ROLE_GRP_ID
 *
 * [column]
 *     ROLE_GRP_ID, ROLE_GRP_CD, DICT_ID, ROLE_CONTROL_CLASS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByRoleControlClass)
 *
 * [referrer table]
 *     B_ROLE_GRP_DTL, B_USER
 *
 * [foreign property]
 *     bDict, vDict, bClassDtlByRoleControlClass
 *
 * [referrer property]
 *     bRoleGrpDtlList, bUserList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long roleGrpId = entity.getRoleGrpId();
 * String roleGrpCd = entity.getRoleGrpCd();
 * Long dictId = entity.getDictId();
 * String roleControlClass = entity.getRoleControlClass();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setRoleGrpId(roleGrpId);
 * entity.setRoleGrpCd(roleGrpCd);
 * entity.setDictId(dictId);
 * entity.setRoleControlClass(roleControlClass);
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
public abstract class BsBRoleGrp extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _roleGrpId;

    /** ROLE_GRP_CD: {UQ+, NotNull, varchar(30)} */
    protected String _roleGrpCd;

    /** DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT} */
    protected Long _dictId;

    /** ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} */
    protected String _roleControlClass;

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
        return "B_ROLE_GRP";
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
        if (_roleGrpId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param roleGrpCd : UQ+, NotNull, varchar(30). (NotNull)
     * @param dictId : +UQ, IX, bigint(19), FK to B_DICT. (NotNull)
     */
    public void uniqueBy(String roleGrpCd, Long dictId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("roleGrpCd");
        __uniqueDrivenProperties.addPropertyName("dictId");
        setRoleGrpCd(roleGrpCd);setDictId(dictId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of roleControlClass as the classification of RoleControlClass. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} <br>
     * 権限制御区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.RoleControlClass getRoleControlClassAsRoleControlClass() {
        return CDef.RoleControlClass.codeOf(getRoleControlClass());
    }

    /**
     * Set the value of roleControlClass as the classification of RoleControlClass. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} <br>
     * 権限制御区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRoleControlClassAsRoleControlClass(CDef.RoleControlClass cdef) {
        setRoleControlClass(cdef != null ? cdef.code() : null);
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
     * Set the value of roleControlClass as $1 (1). <br>
     * $1: 許可を指定
     */
    public void setRoleControlClass_$1() {
        setRoleControlClassAsRoleControlClass(CDef.RoleControlClass.$1);
    }

    /**
     * Set the value of roleControlClass as $2 (2). <br>
     * $2: 拒否を指定
     */
    public void setRoleControlClass_$2() {
        setRoleControlClassAsRoleControlClass(CDef.RoleControlClass.$2);
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
     * Is the value of roleControlClass $1? <br>
     * $1: 許可を指定
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRoleControlClass$1() {
        CDef.RoleControlClass cdef = getRoleControlClassAsRoleControlClass();
        return cdef != null ? cdef.equals(CDef.RoleControlClass.$1) : false;
    }

    /**
     * Is the value of roleControlClass $2? <br>
     * $2: 拒否を指定
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRoleControlClass$2() {
        CDef.RoleControlClass cdef = getRoleControlClassAsRoleControlClass();
        return cdef != null ? cdef.equals(CDef.RoleControlClass.$2) : false;
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
     * Get the value of the column 'roleControlClass' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getRoleControlClassName() {
        CDef.RoleControlClass cdef = getRoleControlClassAsRoleControlClass();
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

    /** B_CLASS_DTL by my ROLE_CONTROL_CLASS, named 'BClassDtlByRoleControlClass'. */
    protected BClassDtl _bClassDtlByRoleControlClass;

    /**
     * [get] B_CLASS_DTL by my ROLE_CONTROL_CLASS, named 'BClassDtlByRoleControlClass'. <br>
     * @return The entity of foreign property 'BClassDtlByRoleControlClass'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByRoleControlClass() {
        return _bClassDtlByRoleControlClass;
    }

    /**
     * [set] B_CLASS_DTL by my ROLE_CONTROL_CLASS, named 'BClassDtlByRoleControlClass'.
     * @param bClassDtlByRoleControlClass The entity of foreign property 'BClassDtlByRoleControlClass'. (NullAllowed)
     */
    public void setBClassDtlByRoleControlClass(BClassDtl bClassDtlByRoleControlClass) {
        _bClassDtlByRoleControlClass = bClassDtlByRoleControlClass;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlList'. */
    protected List<BRoleGrpDtl> _bRoleGrpDtlList;

    /**
     * [get] B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlList'.
     * @return The entity list of referrer property 'BRoleGrpDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BRoleGrpDtl> getBRoleGrpDtlList() {
        if (_bRoleGrpDtlList == null) { _bRoleGrpDtlList = newReferrerList(); }
        return _bRoleGrpDtlList;
    }

    /**
     * [set] B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlList'.
     * @param bRoleGrpDtlList The entity list of referrer property 'BRoleGrpDtlList'. (NullAllowed)
     */
    public void setBRoleGrpDtlList(List<BRoleGrpDtl> bRoleGrpDtlList) {
        _bRoleGrpDtlList = bRoleGrpDtlList;
    }

    /** B_USER by ROLE_GRP_ID, named 'BUserList'. */
    protected List<BUser> _bUserList;

    /**
     * [get] B_USER by ROLE_GRP_ID, named 'BUserList'.
     * @return The entity list of referrer property 'BUserList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BUser> getBUserList() {
        if (_bUserList == null) { _bUserList = newReferrerList(); }
        return _bUserList;
    }

    /**
     * [set] B_USER by ROLE_GRP_ID, named 'BUserList'.
     * @param bUserList The entity list of referrer property 'BUserList'. (NullAllowed)
     */
    public void setBUserList(List<BUser> bUserList) {
        _bUserList = bUserList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBRoleGrp) {
            BsBRoleGrp other = (BsBRoleGrp)obj;
            if (!xSV(_roleGrpId, other._roleGrpId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _roleGrpId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_bClassDtlByRoleControlClass != null)
        { sb.append(li).append(xbRDS(_bClassDtlByRoleControlClass, "bClassDtlByRoleControlClass")); }
        if (_bRoleGrpDtlList != null) { for (BRoleGrpDtl et : _bRoleGrpDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bRoleGrpDtlList")); } } }
        if (_bUserList != null) { for (BUser et : _bUserList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bUserList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_roleGrpId));
        sb.append(dm).append(xfND(_roleGrpCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_roleControlClass));
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
        if (_bClassDtlByRoleControlClass != null)
        { sb.append(dm).append("bClassDtlByRoleControlClass"); }
        if (_bRoleGrpDtlList != null && !_bRoleGrpDtlList.isEmpty())
        { sb.append(dm).append("bRoleGrpDtlList"); }
        if (_bUserList != null && !_bUserList.isEmpty())
        { sb.append(dm).append("bUserList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BRoleGrp clone() {
        return (BRoleGrp)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 権限グループID
     * @return The value of the column 'ROLE_GRP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRoleGrpId() {
        checkSpecifiedProperty("roleGrpId");
        return _roleGrpId;
    }

    /**
     * [set] ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 権限グループID
     * @param roleGrpId The value of the column 'ROLE_GRP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRoleGrpId(Long roleGrpId) {
        registerModifiedProperty("roleGrpId");
        _roleGrpId = roleGrpId;
    }

    /**
     * [get] ROLE_GRP_CD: {UQ+, NotNull, varchar(30)} <br>
     * 権限グループCD
     * @return The value of the column 'ROLE_GRP_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getRoleGrpCd() {
        checkSpecifiedProperty("roleGrpCd");
        return convertEmptyToNull(_roleGrpCd);
    }

    /**
     * [set] ROLE_GRP_CD: {UQ+, NotNull, varchar(30)} <br>
     * 権限グループCD
     * @param roleGrpCd The value of the column 'ROLE_GRP_CD'. (basically NotNull if update: for the constraint)
     */
    public void setRoleGrpCd(String roleGrpCd) {
        registerModifiedProperty("roleGrpCd");
        _roleGrpCd = roleGrpCd;
    }

    /**
     * [get] DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
    }

    /**
     * [get] ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} <br>
     * 権限制御区分
     * @return The value of the column 'ROLE_CONTROL_CLASS'. (basically NotNull if selected: for the constraint)
     */
    public String getRoleControlClass() {
        checkSpecifiedProperty("roleControlClass");
        return convertEmptyToNull(_roleControlClass);
    }

    /**
     * [set] ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} <br>
     * 権限制御区分
     * @param roleControlClass The value of the column 'ROLE_CONTROL_CLASS'. (basically NotNull if update: for the constraint)
     */
    public void setRoleControlClass(String roleControlClass) {
        registerModifiedProperty("roleControlClass");
        _roleControlClass = roleControlClass;
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
