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
 * The entity of B_CLASS as TABLE. <br>
 * 区分値マスタ
 * <pre>
 * [primary-key]
 *     CLASS_ID
 *
 * [column]
 *     CLASS_ID, CLASS_CD, CLASS_COMMENT, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLASS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(BySystemType)
 *
 * [referrer table]
 *     B_CLASS_DTL, B_CLASS_GRP
 *
 * [foreign property]
 *     bClassDtlBySystemType
 *
 * [referrer property]
 *     bClassDtlList, bClassGrpList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long classId = entity.getClassId();
 * String classCd = entity.getClassCd();
 * String classComment = entity.getClassComment();
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
 * entity.setClassId(classId);
 * entity.setClassCd(classCd);
 * entity.setClassComment(classComment);
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
public abstract class BsBClass extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLASS_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _classId;

    /** CLASS_CD: {UQ, NotNull, varchar(30)} */
    protected String _classCd;

    /** CLASS_COMMENT: {varchar(100)} */
    protected String _classComment;

    /** SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} */
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
        return "B_CLASS";
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
        if (_classId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param classCd : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String classCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("classCd");
        setClassCd(classCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of systemType as the classification of SystemType. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SystemType getSystemTypeAsSystemType() {
        return CDef.SystemType.codeOf(getSystemType());
    }

    /**
     * Set the value of systemType as the classification of SystemType. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSystemTypeAsSystemType(CDef.SystemType cdef) {
        setSystemType(cdef != null ? cdef.code() : null);
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
     * Set the value of systemType as $base (base). <br>
     * $base: 基盤
     */
    public void setSystemType_$base() {
        setSystemTypeAsSystemType(CDef.SystemType.$base);
    }

    /**
     * Set the value of systemType as $wms (wms). <br>
     * $wms: WMS
     */
    public void setSystemType_$wms() {
        setSystemTypeAsSystemType(CDef.SystemType.$wms);
    }

    /**
     * Set the value of systemType as $tsn (tsn). <br>
     * $tsn: tsn
     */
    public void setSystemType_$tsn() {
        setSystemTypeAsSystemType(CDef.SystemType.$tsn);
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
     * Is the value of systemType $base? <br>
     * $base: 基盤
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemType$base() {
        CDef.SystemType cdef = getSystemTypeAsSystemType();
        return cdef != null ? cdef.equals(CDef.SystemType.$base) : false;
    }

    /**
     * Is the value of systemType $wms? <br>
     * $wms: WMS
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemType$wms() {
        CDef.SystemType cdef = getSystemTypeAsSystemType();
        return cdef != null ? cdef.equals(CDef.SystemType.$wms) : false;
    }

    /**
     * Is the value of systemType $tsn? <br>
     * $tsn: tsn
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemType$tsn() {
        CDef.SystemType cdef = getSystemTypeAsSystemType();
        return cdef != null ? cdef.equals(CDef.SystemType.$tsn) : false;
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
     * Get the value of the column 'systemType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSystemTypeName() {
        CDef.SystemType cdef = getSystemTypeAsSystemType();
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
    /** B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'. */
    protected BClassDtl _bClassDtlBySystemType;

    /**
     * [get] B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'. <br>
     * @return The entity of foreign property 'BClassDtlBySystemType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySystemType() {
        return _bClassDtlBySystemType;
    }

    /**
     * [set] B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @param bClassDtlBySystemType The entity of foreign property 'BClassDtlBySystemType'. (NullAllowed)
     */
    public void setBClassDtlBySystemType(BClassDtl bClassDtlBySystemType) {
        _bClassDtlBySystemType = bClassDtlBySystemType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** B_CLASS_DTL by CLASS_ID, named 'BClassDtlList'. */
    protected List<BClassDtl> _bClassDtlList;

    /**
     * [get] B_CLASS_DTL by CLASS_ID, named 'BClassDtlList'.
     * @return The entity list of referrer property 'BClassDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BClassDtl> getBClassDtlList() {
        if (_bClassDtlList == null) { _bClassDtlList = newReferrerList(); }
        return _bClassDtlList;
    }

    /**
     * [set] B_CLASS_DTL by CLASS_ID, named 'BClassDtlList'.
     * @param bClassDtlList The entity list of referrer property 'BClassDtlList'. (NullAllowed)
     */
    public void setBClassDtlList(List<BClassDtl> bClassDtlList) {
        _bClassDtlList = bClassDtlList;
    }

    /** B_CLASS_GRP by CLASS_ID, named 'BClassGrpList'. */
    protected List<BClassGrp> _bClassGrpList;

    /**
     * [get] B_CLASS_GRP by CLASS_ID, named 'BClassGrpList'.
     * @return The entity list of referrer property 'BClassGrpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BClassGrp> getBClassGrpList() {
        if (_bClassGrpList == null) { _bClassGrpList = newReferrerList(); }
        return _bClassGrpList;
    }

    /**
     * [set] B_CLASS_GRP by CLASS_ID, named 'BClassGrpList'.
     * @param bClassGrpList The entity list of referrer property 'BClassGrpList'. (NullAllowed)
     */
    public void setBClassGrpList(List<BClassGrp> bClassGrpList) {
        _bClassGrpList = bClassGrpList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBClass) {
            BsBClass other = (BsBClass)obj;
            if (!xSV(_classId, other._classId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _classId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlBySystemType != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySystemType, "bClassDtlBySystemType")); }
        if (_bClassDtlList != null) { for (BClassDtl et : _bClassDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bClassDtlList")); } } }
        if (_bClassGrpList != null) { for (BClassGrp et : _bClassGrpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bClassGrpList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_classId));
        sb.append(dm).append(xfND(_classCd));
        sb.append(dm).append(xfND(_classComment));
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
        if (_bClassDtlBySystemType != null)
        { sb.append(dm).append("bClassDtlBySystemType"); }
        if (_bClassDtlList != null && !_bClassDtlList.isEmpty())
        { sb.append(dm).append("bClassDtlList"); }
        if (_bClassGrpList != null && !_bClassGrpList.isEmpty())
        { sb.append(dm).append("bClassGrpList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BClass clone() {
        return (BClass)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLASS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 区分値ID
     * @return The value of the column 'CLASS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClassId() {
        checkSpecifiedProperty("classId");
        return _classId;
    }

    /**
     * [set] CLASS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 区分値ID
     * @param classId The value of the column 'CLASS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClassId(Long classId) {
        registerModifiedProperty("classId");
        _classId = classId;
    }

    /**
     * [get] CLASS_CD: {UQ, NotNull, varchar(30)} <br>
     * 区分値CD
     * @return The value of the column 'CLASS_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getClassCd() {
        checkSpecifiedProperty("classCd");
        return convertEmptyToNull(_classCd);
    }

    /**
     * [set] CLASS_CD: {UQ, NotNull, varchar(30)} <br>
     * 区分値CD
     * @param classCd The value of the column 'CLASS_CD'. (basically NotNull if update: for the constraint)
     */
    public void setClassCd(String classCd) {
        registerModifiedProperty("classCd");
        _classCd = classCd;
    }

    /**
     * [get] CLASS_COMMENT: {varchar(100)} <br>
     * 区分値解説
     * @return The value of the column 'CLASS_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getClassComment() {
        checkSpecifiedProperty("classComment");
        return convertEmptyToNull(_classComment);
    }

    /**
     * [set] CLASS_COMMENT: {varchar(100)} <br>
     * 区分値解説
     * @param classComment The value of the column 'CLASS_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClassComment(String classComment) {
        registerModifiedProperty("classComment");
        _classComment = classComment;
    }

    /**
     * [get] SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSystemType() {
        checkSpecifiedProperty("systemType");
        return convertEmptyToNull(_systemType);
    }

    /**
     * [set] SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
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
