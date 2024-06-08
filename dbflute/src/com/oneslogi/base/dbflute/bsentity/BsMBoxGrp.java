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
 * The entity of M_BOX_GRP as TABLE. <br>
 * 荷材グループマスタ
 * <pre>
 * [primary-key]
 *     BOX_GRP_ID
 *
 * [column]
 *     BOX_GRP_ID, CENTER_ID, BOX_GRP_CD, BOX_GRP_NM, STANDARD_BOX_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_BOX, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_BOX_GRP_DTL, M_PARAM
 *
 * [foreign property]
 *     mCenter, mBox, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBoxGrpDtlList, mParamList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long boxGrpId = entity.getBoxGrpId();
 * Long centerId = entity.getCenterId();
 * String boxGrpCd = entity.getBoxGrpCd();
 * String boxGrpNm = entity.getBoxGrpNm();
 * Long standardBoxId = entity.getStandardBoxId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBoxGrpId(boxGrpId);
 * entity.setCenterId(centerId);
 * entity.setBoxGrpCd(boxGrpCd);
 * entity.setBoxGrpNm(boxGrpNm);
 * entity.setStandardBoxId(standardBoxId);
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
public abstract class BsMBoxGrp extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _boxGrpId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)} */
    protected String _boxGrpCd;

    /** BOX_GRP_NM: {NotNull, varchar(255)} */
    protected String _boxGrpNm;

    /** STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX} */
    protected Long _standardBoxId;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
        return "M_BOX_GRP";
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
        if (_boxGrpId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param boxGrpCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(Long centerId, String boxGrpCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("boxGrpCd");
        setCenterId(centerId);setBoxGrpCd(boxGrpCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** M_BOX by my STANDARD_BOX_ID, named 'MBox'. */
    protected MBox _mBox;

    /**
     * [get] M_BOX by my STANDARD_BOX_ID, named 'MBox'. <br>
     * @return The entity of foreign property 'MBox'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MBox getMBox() {
        return _mBox;
    }

    /**
     * [set] M_BOX by my STANDARD_BOX_ID, named 'MBox'.
     * @param mBox The entity of foreign property 'MBox'. (NullAllowed)
     */
    public void setMBox(MBox mBox) {
        _mBox = mBox;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlList'. */
    protected List<MBoxGrpDtl> _mBoxGrpDtlList;

    /**
     * [get] M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlList'.
     * @return The entity list of referrer property 'MBoxGrpDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBoxGrpDtl> getMBoxGrpDtlList() {
        if (_mBoxGrpDtlList == null) { _mBoxGrpDtlList = newReferrerList(); }
        return _mBoxGrpDtlList;
    }

    /**
     * [set] M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlList'.
     * @param mBoxGrpDtlList The entity list of referrer property 'MBoxGrpDtlList'. (NullAllowed)
     */
    public void setMBoxGrpDtlList(List<MBoxGrpDtl> mBoxGrpDtlList) {
        _mBoxGrpDtlList = mBoxGrpDtlList;
    }

    /** M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamList'. */
    protected List<MParam> _mParamList;

    /**
     * [get] M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamList'.
     * @return The entity list of referrer property 'MParamList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MParam> getMParamList() {
        if (_mParamList == null) { _mParamList = newReferrerList(); }
        return _mParamList;
    }

    /**
     * [set] M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamList'.
     * @param mParamList The entity list of referrer property 'MParamList'. (NullAllowed)
     */
    public void setMParamList(List<MParam> mParamList) {
        _mParamList = mParamList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMBoxGrp) {
            BsMBoxGrp other = (BsMBoxGrp)obj;
            if (!xSV(_boxGrpId, other._boxGrpId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _boxGrpId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mBox != null)
        { sb.append(li).append(xbRDS(_mBox, "mBox")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mBoxGrpDtlList != null) { for (MBoxGrpDtl et : _mBoxGrpDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBoxGrpDtlList")); } } }
        if (_mParamList != null) { for (MParam et : _mParamList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mParamList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_boxGrpId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_boxGrpCd));
        sb.append(dm).append(xfND(_boxGrpNm));
        sb.append(dm).append(xfND(_standardBoxId));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mBox != null)
        { sb.append(dm).append("mBox"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mBoxGrpDtlList != null && !_mBoxGrpDtlList.isEmpty())
        { sb.append(dm).append("mBoxGrpDtlList"); }
        if (_mParamList != null && !_mParamList.isEmpty())
        { sb.append(dm).append("mParamList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MBoxGrp clone() {
        return (MBoxGrp)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷材グループID
     * @return The value of the column 'BOX_GRP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBoxGrpId() {
        checkSpecifiedProperty("boxGrpId");
        return _boxGrpId;
    }

    /**
     * [set] BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷材グループID
     * @param boxGrpId The value of the column 'BOX_GRP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBoxGrpId(Long boxGrpId) {
        registerModifiedProperty("boxGrpId");
        _boxGrpId = boxGrpId;
    }

    /**
     * [get] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 荷材グループCD
     * @return The value of the column 'BOX_GRP_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getBoxGrpCd() {
        checkSpecifiedProperty("boxGrpCd");
        return convertEmptyToNull(_boxGrpCd);
    }

    /**
     * [set] BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 荷材グループCD
     * @param boxGrpCd The value of the column 'BOX_GRP_CD'. (basically NotNull if update: for the constraint)
     */
    public void setBoxGrpCd(String boxGrpCd) {
        registerModifiedProperty("boxGrpCd");
        _boxGrpCd = boxGrpCd;
    }

    /**
     * [get] BOX_GRP_NM: {NotNull, varchar(255)} <br>
     * 荷材グループ名称
     * @return The value of the column 'BOX_GRP_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getBoxGrpNm() {
        checkSpecifiedProperty("boxGrpNm");
        return convertEmptyToNull(_boxGrpNm);
    }

    /**
     * [set] BOX_GRP_NM: {NotNull, varchar(255)} <br>
     * 荷材グループ名称
     * @param boxGrpNm The value of the column 'BOX_GRP_NM'. (basically NotNull if update: for the constraint)
     */
    public void setBoxGrpNm(String boxGrpNm) {
        registerModifiedProperty("boxGrpNm");
        _boxGrpNm = boxGrpNm;
    }

    /**
     * [get] STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX} <br>
     * 基準荷材ID
     * @return The value of the column 'STANDARD_BOX_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStandardBoxId() {
        checkSpecifiedProperty("standardBoxId");
        return _standardBoxId;
    }

    /**
     * [set] STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX} <br>
     * 基準荷材ID
     * @param standardBoxId The value of the column 'STANDARD_BOX_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStandardBoxId(Long standardBoxId) {
        registerModifiedProperty("standardBoxId");
        _standardBoxId = standardBoxId;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
