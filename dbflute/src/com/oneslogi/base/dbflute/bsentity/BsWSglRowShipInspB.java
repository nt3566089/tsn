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
 * The entity of W_SGL_ROW_SHIP_INSP_B as TABLE. <br>
 * 単行出荷検品ワークボディ
 * <pre>
 * [primary-key]
 *     SGL_ROW_SHIP_INSP_B_ID
 *
 * [column]
 *     SGL_ROW_SHIP_INSP_B_ID, SGL_ROW_SHIP_INSP_H_ID, PICKING_H_ID, USER_ID, INSPECTED_NUM, INSPECTION_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SGL_ROW_SHIP_INSP_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, W_SGL_ROW_SHIP_INSP_H, T_PICKING_H, B_CLASS_DTL(ByInspectionFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, wSglRowShipInspH, tPickingH, bClassDtlByInspectionFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long sglRowShipInspBId = entity.getSglRowShipInspBId();
 * Long sglRowShipInspHId = entity.getSglRowShipInspHId();
 * Long pickingHId = entity.getPickingHId();
 * Long userId = entity.getUserId();
 * Long inspectedNum = entity.getInspectedNum();
 * String inspectionFlg = entity.getInspectionFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSglRowShipInspBId(sglRowShipInspBId);
 * entity.setSglRowShipInspHId(sglRowShipInspHId);
 * entity.setPickingHId(pickingHId);
 * entity.setUserId(userId);
 * entity.setInspectedNum(inspectedNum);
 * entity.setInspectionFlg(inspectionFlg);
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
public abstract class BsWSglRowShipInspB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sglRowShipInspBId;

    /** SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H} */
    protected Long _sglRowShipInspHId;

    /** PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H} */
    protected Long _pickingHId;

    /** USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _userId;

    /** INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]} */
    protected Long _inspectedNum;

    /** INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} */
    protected String _inspectionFlg;

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
        return "W_SGL_ROW_SHIP_INSP_B";
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
        if (_sglRowShipInspBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param sglRowShipInspHId : UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H. (NotNull)
     * @param pickingHId : +UQ, IX, NotNull, bigint(19), FK to T_PICKING_H. (NotNull)
     */
    public void uniqueBy(Long sglRowShipInspHId, Long pickingHId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("sglRowShipInspHId");
        __uniqueDrivenProperties.addPropertyName("pickingHId");
        setSglRowShipInspHId(sglRowShipInspHId);setPickingHId(pickingHId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of inspectionFlg as the classification of InspectionFlg. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InspectionFlg getInspectionFlgAsInspectionFlg() {
        return CDef.InspectionFlg.codeOf(getInspectionFlg());
    }

    /**
     * Set the value of inspectionFlg as the classification of InspectionFlg. <br>
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInspectionFlgAsInspectionFlg(CDef.InspectionFlg cdef) {
        setInspectionFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of inspectionFlg as $0 (0). <br>
     * $0: 未検品
     */
    public void setInspectionFlg_$0() {
        setInspectionFlgAsInspectionFlg(CDef.InspectionFlg.$0);
    }

    /**
     * Set the value of inspectionFlg as $1 (1). <br>
     * $1: 検品済
     */
    public void setInspectionFlg_$1() {
        setInspectionFlgAsInspectionFlg(CDef.InspectionFlg.$1);
    }

    /**
     * Set the value of inspectionFlg as $7 (7). <br>
     * $7: 検品作業中
     */
    public void setInspectionFlg_$7() {
        setInspectionFlgAsInspectionFlg(CDef.InspectionFlg.$7);
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
     * Is the value of inspectionFlg $0? <br>
     * $0: 未検品
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspectionFlg$0() {
        CDef.InspectionFlg cdef = getInspectionFlgAsInspectionFlg();
        return cdef != null ? cdef.equals(CDef.InspectionFlg.$0) : false;
    }

    /**
     * Is the value of inspectionFlg $1? <br>
     * $1: 検品済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspectionFlg$1() {
        CDef.InspectionFlg cdef = getInspectionFlgAsInspectionFlg();
        return cdef != null ? cdef.equals(CDef.InspectionFlg.$1) : false;
    }

    /**
     * Is the value of inspectionFlg $7? <br>
     * $7: 検品作業中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspectionFlg$7() {
        CDef.InspectionFlg cdef = getInspectionFlgAsInspectionFlg();
        return cdef != null ? cdef.equals(CDef.InspectionFlg.$7) : false;
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
     * Get the value of the column 'inspectionFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInspectionFlgName() {
        CDef.InspectionFlg cdef = getInspectionFlgAsInspectionFlg();
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
    /** B_USER by my USER_ID, named 'BUser'. */
    protected BUser _bUser;

    /**
     * [get] B_USER by my USER_ID, named 'BUser'. <br>
     * @return The entity of foreign property 'BUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUser() {
        return _bUser;
    }

    /**
     * [set] B_USER by my USER_ID, named 'BUser'.
     * @param bUser The entity of foreign property 'BUser'. (NullAllowed)
     */
    public void setBUser(BUser bUser) {
        _bUser = bUser;
    }

    /** W_SGL_ROW_SHIP_INSP_H by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'. */
    protected WSglRowShipInspH _wSglRowShipInspH;

    /**
     * [get] W_SGL_ROW_SHIP_INSP_H by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'. <br>
     * @return The entity of foreign property 'WSglRowShipInspH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WSglRowShipInspH getWSglRowShipInspH() {
        return _wSglRowShipInspH;
    }

    /**
     * [set] W_SGL_ROW_SHIP_INSP_H by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'.
     * @param wSglRowShipInspH The entity of foreign property 'WSglRowShipInspH'. (NullAllowed)
     */
    public void setWSglRowShipInspH(WSglRowShipInspH wSglRowShipInspH) {
        _wSglRowShipInspH = wSglRowShipInspH;
    }

    /** T_PICKING_H by my PICKING_H_ID, named 'TPickingH'. */
    protected TPickingH _tPickingH;

    /**
     * [get] T_PICKING_H by my PICKING_H_ID, named 'TPickingH'. <br>
     * @return The entity of foreign property 'TPickingH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPickingH getTPickingH() {
        return _tPickingH;
    }

    /**
     * [set] T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param tPickingH The entity of foreign property 'TPickingH'. (NullAllowed)
     */
    public void setTPickingH(TPickingH tPickingH) {
        _tPickingH = tPickingH;
    }

    /** B_CLASS_DTL by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'. */
    protected BClassDtl _bClassDtlByInspectionFlg;

    /**
     * [get] B_CLASS_DTL by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInspectionFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInspectionFlg() {
        return _bClassDtlByInspectionFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'.
     * @param bClassDtlByInspectionFlg The entity of foreign property 'BClassDtlByInspectionFlg'. (NullAllowed)
     */
    public void setBClassDtlByInspectionFlg(BClassDtl bClassDtlByInspectionFlg) {
        _bClassDtlByInspectionFlg = bClassDtlByInspectionFlg;
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
        if (obj instanceof BsWSglRowShipInspB) {
            BsWSglRowShipInspB other = (BsWSglRowShipInspB)obj;
            if (!xSV(_sglRowShipInspBId, other._sglRowShipInspBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sglRowShipInspBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bUser != null)
        { sb.append(li).append(xbRDS(_bUser, "bUser")); }
        if (_wSglRowShipInspH != null)
        { sb.append(li).append(xbRDS(_wSglRowShipInspH, "wSglRowShipInspH")); }
        if (_tPickingH != null)
        { sb.append(li).append(xbRDS(_tPickingH, "tPickingH")); }
        if (_bClassDtlByInspectionFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInspectionFlg, "bClassDtlByInspectionFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sglRowShipInspBId));
        sb.append(dm).append(xfND(_sglRowShipInspHId));
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_inspectedNum));
        sb.append(dm).append(xfND(_inspectionFlg));
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
        if (_bUser != null)
        { sb.append(dm).append("bUser"); }
        if (_wSglRowShipInspH != null)
        { sb.append(dm).append("wSglRowShipInspH"); }
        if (_tPickingH != null)
        { sb.append(dm).append("tPickingH"); }
        if (_bClassDtlByInspectionFlg != null)
        { sb.append(dm).append("bClassDtlByInspectionFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WSglRowShipInspB clone() {
        return (WSglRowShipInspB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 単行出荷検品ワークボディID
     * @return The value of the column 'SGL_ROW_SHIP_INSP_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSglRowShipInspBId() {
        checkSpecifiedProperty("sglRowShipInspBId");
        return _sglRowShipInspBId;
    }

    /**
     * [set] SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 単行出荷検品ワークボディID
     * @param sglRowShipInspBId The value of the column 'SGL_ROW_SHIP_INSP_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSglRowShipInspBId(Long sglRowShipInspBId) {
        registerModifiedProperty("sglRowShipInspBId");
        _sglRowShipInspBId = sglRowShipInspBId;
    }

    /**
     * [get] SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H} <br>
     * 単行出荷検品ワークヘッダID
     * @return The value of the column 'SGL_ROW_SHIP_INSP_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSglRowShipInspHId() {
        checkSpecifiedProperty("sglRowShipInspHId");
        return _sglRowShipInspHId;
    }

    /**
     * [set] SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H} <br>
     * 単行出荷検品ワークヘッダID
     * @param sglRowShipInspHId The value of the column 'SGL_ROW_SHIP_INSP_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSglRowShipInspHId(Long sglRowShipInspHId) {
        registerModifiedProperty("sglRowShipInspHId");
        _sglRowShipInspHId = sglRowShipInspHId;
    }

    /**
     * [get] PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
    }

    /**
     * [get] USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * ユーザID
     * @return The value of the column 'USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * ユーザID
     * @param userId The value of the column 'USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数
     * @return The value of the column 'INSPECTED_NUM'. (basically NotNull if selected: for the constraint)
     */
    public Long getInspectedNum() {
        checkSpecifiedProperty("inspectedNum");
        return _inspectedNum;
    }

    /**
     * [set] INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数
     * @param inspectedNum The value of the column 'INSPECTED_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInspectedNum(Long inspectedNum) {
        registerModifiedProperty("inspectedNum");
        _inspectedNum = inspectedNum;
    }

    /**
     * [get] INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @return The value of the column 'INSPECTION_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectionFlg() {
        checkSpecifiedProperty("inspectionFlg");
        return convertEmptyToNull(_inspectionFlg);
    }

    /**
     * [set] INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param inspectionFlg The value of the column 'INSPECTION_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionFlg(String inspectionFlg) {
        registerModifiedProperty("inspectionFlg");
        _inspectionFlg = inspectionFlg;
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
