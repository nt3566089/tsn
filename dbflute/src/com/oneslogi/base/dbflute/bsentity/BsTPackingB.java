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
 * The entity of T_PACKING_B as TABLE. <br>
 * 梱包ボディ
 * <pre>
 * [primary-key]
 *     PACKING_B_ID
 *
 * [column]
 *     PACKING_B_ID, PACKING_H_ID, PICKING_B_ID, ALLOC_INST_B_ID, PACKING_NUM, PICKING_FLG, INSPECTION_FLG, CASE_PICKING_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_B, T_PACKING_H, T_PICKING_B, B_CLASS_DTL(ByInspectionFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tAllocInstB, tPackingH, tPickingB, bClassDtlByInspectionFlg, bClassDtlByPickingFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long packingBId = entity.getPackingBId();
 * Long packingHId = entity.getPackingHId();
 * Long pickingBId = entity.getPickingBId();
 * Long allocInstBId = entity.getAllocInstBId();
 * java.math.BigDecimal packingNum = entity.getPackingNum();
 * String pickingFlg = entity.getPickingFlg();
 * String inspectionFlg = entity.getInspectionFlg();
 * String casePickingNo = entity.getCasePickingNo();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPackingBId(packingBId);
 * entity.setPackingHId(packingHId);
 * entity.setPickingBId(pickingBId);
 * entity.setAllocInstBId(allocInstBId);
 * entity.setPackingNum(packingNum);
 * entity.setPickingFlg(pickingFlg);
 * entity.setInspectionFlg(inspectionFlg);
 * entity.setCasePickingNo(casePickingNo);
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
public abstract class BsTPackingB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _packingBId;

    /** PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H} */
    protected Long _packingHId;

    /** PICKING_B_ID: {IX, bigint(19), FK to T_PICKING_B} */
    protected Long _pickingBId;

    /** ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} */
    protected Long _allocInstBId;

    /** PACKING_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _packingNum;

    /** PICKING_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} */
    protected String _pickingFlg;

    /** INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} */
    protected String _inspectionFlg;

    /** CASE_PICKING_NO: {varchar(30)} */
    protected String _casePickingNo;

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
        return "T_PACKING_B";
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
        if (_packingBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of pickingFlg as the classification of PickingFlg. <br>
     * PICKING_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PickingFlg getPickingFlgAsPickingFlg() {
        return CDef.PickingFlg.codeOf(getPickingFlg());
    }

    /**
     * Set the value of pickingFlg as the classification of PickingFlg. <br>
     * PICKING_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPickingFlgAsPickingFlg(CDef.PickingFlg cdef) {
        setPickingFlg(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of pickingFlg as $0 (0). <br>
     * $0: 未出庫
     */
    public void setPickingFlg_$0() {
        setPickingFlgAsPickingFlg(CDef.PickingFlg.$0);
    }

    /**
     * Set the value of pickingFlg as $1 (1). <br>
     * $1: 出庫済
     */
    public void setPickingFlg_$1() {
        setPickingFlgAsPickingFlg(CDef.PickingFlg.$1);
    }

    /**
     * Set the value of pickingFlg as $7 (7). <br>
     * $7: 出庫作業中
     */
    public void setPickingFlg_$7() {
        setPickingFlgAsPickingFlg(CDef.PickingFlg.$7);
    }

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
     * Is the value of pickingFlg $0? <br>
     * $0: 未出庫
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingFlg$0() {
        CDef.PickingFlg cdef = getPickingFlgAsPickingFlg();
        return cdef != null ? cdef.equals(CDef.PickingFlg.$0) : false;
    }

    /**
     * Is the value of pickingFlg $1? <br>
     * $1: 出庫済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingFlg$1() {
        CDef.PickingFlg cdef = getPickingFlgAsPickingFlg();
        return cdef != null ? cdef.equals(CDef.PickingFlg.$1) : false;
    }

    /**
     * Is the value of pickingFlg $7? <br>
     * $7: 出庫作業中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingFlg$7() {
        CDef.PickingFlg cdef = getPickingFlgAsPickingFlg();
        return cdef != null ? cdef.equals(CDef.PickingFlg.$7) : false;
    }

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
     * Get the value of the column 'pickingFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPickingFlgName() {
        CDef.PickingFlg cdef = getPickingFlgAsPickingFlg();
        return cdef != null ? cdef.name() : null;
    }

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
    /** T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'. */
    protected TAllocInstB _tAllocInstB;

    /**
     * [get] T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'. <br>
     * @return The entity of foreign property 'TAllocInstB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TAllocInstB getTAllocInstB() {
        return _tAllocInstB;
    }

    /**
     * [set] T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param tAllocInstB The entity of foreign property 'TAllocInstB'. (NullAllowed)
     */
    public void setTAllocInstB(TAllocInstB tAllocInstB) {
        _tAllocInstB = tAllocInstB;
    }

    /** T_PACKING_H by my PACKING_H_ID, named 'TPackingH'. */
    protected TPackingH _tPackingH;

    /**
     * [get] T_PACKING_H by my PACKING_H_ID, named 'TPackingH'. <br>
     * @return The entity of foreign property 'TPackingH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPackingH getTPackingH() {
        return _tPackingH;
    }

    /**
     * [set] T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @param tPackingH The entity of foreign property 'TPackingH'. (NullAllowed)
     */
    public void setTPackingH(TPackingH tPackingH) {
        _tPackingH = tPackingH;
    }

    /** T_PICKING_B by my PICKING_B_ID, named 'TPickingB'. */
    protected TPickingB _tPickingB;

    /**
     * [get] T_PICKING_B by my PICKING_B_ID, named 'TPickingB'. <br>
     * @return The entity of foreign property 'TPickingB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPickingB getTPickingB() {
        return _tPickingB;
    }

    /**
     * [set] T_PICKING_B by my PICKING_B_ID, named 'TPickingB'.
     * @param tPickingB The entity of foreign property 'TPickingB'. (NullAllowed)
     */
    public void setTPickingB(TPickingB tPickingB) {
        _tPickingB = tPickingB;
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

    /** B_CLASS_DTL by my PICKING_FLG, named 'BClassDtlByPickingFlg'. */
    protected BClassDtl _bClassDtlByPickingFlg;

    /**
     * [get] B_CLASS_DTL by my PICKING_FLG, named 'BClassDtlByPickingFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPickingFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPickingFlg() {
        return _bClassDtlByPickingFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PICKING_FLG, named 'BClassDtlByPickingFlg'.
     * @param bClassDtlByPickingFlg The entity of foreign property 'BClassDtlByPickingFlg'. (NullAllowed)
     */
    public void setBClassDtlByPickingFlg(BClassDtl bClassDtlByPickingFlg) {
        _bClassDtlByPickingFlg = bClassDtlByPickingFlg;
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
        if (obj instanceof BsTPackingB) {
            BsTPackingB other = (BsTPackingB)obj;
            if (!xSV(_packingBId, other._packingBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _packingBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tAllocInstB != null)
        { sb.append(li).append(xbRDS(_tAllocInstB, "tAllocInstB")); }
        if (_tPackingH != null)
        { sb.append(li).append(xbRDS(_tPackingH, "tPackingH")); }
        if (_tPickingB != null)
        { sb.append(li).append(xbRDS(_tPickingB, "tPickingB")); }
        if (_bClassDtlByInspectionFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInspectionFlg, "bClassDtlByInspectionFlg")); }
        if (_bClassDtlByPickingFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPickingFlg, "bClassDtlByPickingFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_packingBId));
        sb.append(dm).append(xfND(_packingHId));
        sb.append(dm).append(xfND(_pickingBId));
        sb.append(dm).append(xfND(_allocInstBId));
        sb.append(dm).append(xfND(_packingNum));
        sb.append(dm).append(xfND(_pickingFlg));
        sb.append(dm).append(xfND(_inspectionFlg));
        sb.append(dm).append(xfND(_casePickingNo));
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
        if (_tAllocInstB != null)
        { sb.append(dm).append("tAllocInstB"); }
        if (_tPackingH != null)
        { sb.append(dm).append("tPackingH"); }
        if (_tPickingB != null)
        { sb.append(dm).append("tPickingB"); }
        if (_bClassDtlByInspectionFlg != null)
        { sb.append(dm).append("bClassDtlByInspectionFlg"); }
        if (_bClassDtlByPickingFlg != null)
        { sb.append(dm).append("bClassDtlByPickingFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TPackingB clone() {
        return (TPackingB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包ボディID
     * @return The value of the column 'PACKING_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPackingBId() {
        checkSpecifiedProperty("packingBId");
        return _packingBId;
    }

    /**
     * [set] PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包ボディID
     * @param packingBId The value of the column 'PACKING_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPackingBId(Long packingBId) {
        registerModifiedProperty("packingBId");
        _packingBId = packingBId;
    }

    /**
     * [get] PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPackingHId() {
        checkSpecifiedProperty("packingHId");
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPackingHId(Long packingHId) {
        registerModifiedProperty("packingHId");
        _packingHId = packingHId;
    }

    /**
     * [get] PICKING_B_ID: {IX, bigint(19), FK to T_PICKING_B} <br>
     * 出庫ボディID
     * @return The value of the column 'PICKING_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingBId() {
        checkSpecifiedProperty("pickingBId");
        return _pickingBId;
    }

    /**
     * [set] PICKING_B_ID: {IX, bigint(19), FK to T_PICKING_B} <br>
     * 出庫ボディID
     * @param pickingBId The value of the column 'PICKING_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingBId(Long pickingBId) {
        registerModifiedProperty("pickingBId");
        _pickingBId = pickingBId;
    }

    /**
     * [get] ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstBId() {
        checkSpecifiedProperty("allocInstBId");
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B} <br>
     * 引当指示ボディID
     * @param allocInstBId The value of the column 'ALLOC_INST_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstBId(Long allocInstBId) {
        registerModifiedProperty("allocInstBId");
        _allocInstBId = allocInstBId;
    }

    /**
     * [get] PACKING_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 梱包数
     * @return The value of the column 'PACKING_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPackingNum() {
        checkSpecifiedProperty("packingNum");
        return _packingNum;
    }

    /**
     * [set] PACKING_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 梱包数
     * @param packingNum The value of the column 'PACKING_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setPackingNum(java.math.BigDecimal packingNum) {
        registerModifiedProperty("packingNum");
        _packingNum = packingNum;
    }

    /**
     * [get] PICKING_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @return The value of the column 'PICKING_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingFlg() {
        checkSpecifiedProperty("pickingFlg");
        return convertEmptyToNull(_pickingFlg);
    }

    /**
     * [set] PICKING_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @param pickingFlg The value of the column 'PICKING_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingFlg(String pickingFlg) {
        registerModifiedProperty("pickingFlg");
        _pickingFlg = pickingFlg;
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
     * [get] CASE_PICKING_NO: {varchar(30)} <br>
     * ケースピッキングNo.
     * @return The value of the column 'CASE_PICKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePickingNo() {
        checkSpecifiedProperty("casePickingNo");
        return convertEmptyToNull(_casePickingNo);
    }

    /**
     * [set] CASE_PICKING_NO: {varchar(30)} <br>
     * ケースピッキングNo.
     * @param casePickingNo The value of the column 'CASE_PICKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePickingNo(String casePickingNo) {
        registerModifiedProperty("casePickingNo");
        _casePickingNo = casePickingNo;
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
