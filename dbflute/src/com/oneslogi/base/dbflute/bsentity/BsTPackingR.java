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
 * The entity of T_PACKING_R as TABLE. <br>
 * 梱包帳票
 * <pre>
 * [primary-key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, STW_OUT_FLG, STW_OUT_USER_ID, STW_OUT_DT, TAG_OUT_FLG, TAG_OUT_USER_ID, TAG_OUT_DT, TAG_DL_URL, INSPECTION_OUT_FLG, INSPECTION_OUT_USER_ID, INSPECTION_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, T_PACKING_H, B_CLASS_DTL(ByStwOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUserByTagOutUserId, bUserByInspectionOutUserId, tPackingH, bUserByStwOutUserId, bClassDtlByStwOutFlg, bClassDtlByTagOutFlg, bClassDtlByInspectionOutFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long packingHId = entity.getPackingHId();
 * String stwOutFlg = entity.getStwOutFlg();
 * Long stwOutUserId = entity.getStwOutUserId();
 * java.sql.Timestamp stwOutDt = entity.getStwOutDt();
 * String tagOutFlg = entity.getTagOutFlg();
 * Long tagOutUserId = entity.getTagOutUserId();
 * java.sql.Timestamp tagOutDt = entity.getTagOutDt();
 * String tagDlUrl = entity.getTagDlUrl();
 * String inspectionOutFlg = entity.getInspectionOutFlg();
 * Long inspectionOutUserId = entity.getInspectionOutUserId();
 * java.sql.Timestamp inspectionOutDt = entity.getInspectionOutDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPackingHId(packingHId);
 * entity.setStwOutFlg(stwOutFlg);
 * entity.setStwOutUserId(stwOutUserId);
 * entity.setStwOutDt(stwOutDt);
 * entity.setTagOutFlg(tagOutFlg);
 * entity.setTagOutUserId(tagOutUserId);
 * entity.setTagOutDt(tagOutDt);
 * entity.setTagDlUrl(tagDlUrl);
 * entity.setInspectionOutFlg(inspectionOutFlg);
 * entity.setInspectionOutUserId(inspectionOutUserId);
 * entity.setInspectionOutDt(inspectionOutDt);
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
public abstract class BsTPackingR extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H} */
    protected Long _packingHId;

    /** STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _stwOutFlg;

    /** STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _stwOutUserId;

    /** STW_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _stwOutDt;

    /** TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _tagOutFlg;

    /** TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _tagOutUserId;

    /** TAG_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _tagOutDt;

    /** TAG_DL_URL: {varchar(255)} */
    protected String _tagDlUrl;

    /** INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _inspectionOutFlg;

    /** INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _inspectionOutUserId;

    /** INSPECTION_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _inspectionOutDt;

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
        return "T_PACKING_R";
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
        if (_packingHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of stwOutFlg as the classification of ListOutFlg. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getStwOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getStwOutFlg());
    }

    /**
     * Set the value of stwOutFlg as the classification of ListOutFlg. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStwOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setStwOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of tagOutFlg as the classification of ListOutFlg. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getTagOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getTagOutFlg());
    }

    /**
     * Set the value of tagOutFlg as the classification of ListOutFlg. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTagOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setTagOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of inspectionOutFlg as the classification of ListOutFlg. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getInspectionOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getInspectionOutFlg());
    }

    /**
     * Set the value of inspectionOutFlg as the classification of ListOutFlg. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInspectionOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setInspectionOutFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of stwOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setStwOutFlg_$0() {
        setStwOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of stwOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setStwOutFlg_$1() {
        setStwOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of tagOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setTagOutFlg_$0() {
        setTagOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of tagOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setTagOutFlg_$1() {
        setTagOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of inspectionOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setInspectionOutFlg_$0() {
        setInspectionOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of inspectionOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setInspectionOutFlg_$1() {
        setInspectionOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
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
     * Is the value of stwOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStwOutFlg$0() {
        CDef.ListOutFlg cdef = getStwOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of stwOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStwOutFlg$1() {
        CDef.ListOutFlg cdef = getStwOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of tagOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagOutFlg$0() {
        CDef.ListOutFlg cdef = getTagOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of tagOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagOutFlg$1() {
        CDef.ListOutFlg cdef = getTagOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of inspectionOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspectionOutFlg$0() {
        CDef.ListOutFlg cdef = getInspectionOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of inspectionOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspectionOutFlg$1() {
        CDef.ListOutFlg cdef = getInspectionOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
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
     * Get the value of the column 'stwOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStwOutFlgName() {
        CDef.ListOutFlg cdef = getStwOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'tagOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTagOutFlgName() {
        CDef.ListOutFlg cdef = getTagOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'inspectionOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInspectionOutFlgName() {
        CDef.ListOutFlg cdef = getInspectionOutFlgAsListOutFlg();
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
    /** B_USER by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'. */
    protected BUser _bUserByTagOutUserId;

    /**
     * [get] B_USER by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'. <br>
     * @return The entity of foreign property 'BUserByTagOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByTagOutUserId() {
        return _bUserByTagOutUserId;
    }

    /**
     * [set] B_USER by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @param bUserByTagOutUserId The entity of foreign property 'BUserByTagOutUserId'. (NullAllowed)
     */
    public void setBUserByTagOutUserId(BUser bUserByTagOutUserId) {
        _bUserByTagOutUserId = bUserByTagOutUserId;
    }

    /** B_USER by my INSPECTION_OUT_USER_ID, named 'BUserByInspectionOutUserId'. */
    protected BUser _bUserByInspectionOutUserId;

    /**
     * [get] B_USER by my INSPECTION_OUT_USER_ID, named 'BUserByInspectionOutUserId'. <br>
     * @return The entity of foreign property 'BUserByInspectionOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByInspectionOutUserId() {
        return _bUserByInspectionOutUserId;
    }

    /**
     * [set] B_USER by my INSPECTION_OUT_USER_ID, named 'BUserByInspectionOutUserId'.
     * @param bUserByInspectionOutUserId The entity of foreign property 'BUserByInspectionOutUserId'. (NullAllowed)
     */
    public void setBUserByInspectionOutUserId(BUser bUserByInspectionOutUserId) {
        _bUserByInspectionOutUserId = bUserByInspectionOutUserId;
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

    /** B_USER by my STW_OUT_USER_ID, named 'BUserByStwOutUserId'. */
    protected BUser _bUserByStwOutUserId;

    /**
     * [get] B_USER by my STW_OUT_USER_ID, named 'BUserByStwOutUserId'. <br>
     * @return The entity of foreign property 'BUserByStwOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByStwOutUserId() {
        return _bUserByStwOutUserId;
    }

    /**
     * [set] B_USER by my STW_OUT_USER_ID, named 'BUserByStwOutUserId'.
     * @param bUserByStwOutUserId The entity of foreign property 'BUserByStwOutUserId'. (NullAllowed)
     */
    public void setBUserByStwOutUserId(BUser bUserByStwOutUserId) {
        _bUserByStwOutUserId = bUserByStwOutUserId;
    }

    /** B_CLASS_DTL by my STW_OUT_FLG, named 'BClassDtlByStwOutFlg'. */
    protected BClassDtl _bClassDtlByStwOutFlg;

    /**
     * [get] B_CLASS_DTL by my STW_OUT_FLG, named 'BClassDtlByStwOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStwOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStwOutFlg() {
        return _bClassDtlByStwOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STW_OUT_FLG, named 'BClassDtlByStwOutFlg'.
     * @param bClassDtlByStwOutFlg The entity of foreign property 'BClassDtlByStwOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByStwOutFlg(BClassDtl bClassDtlByStwOutFlg) {
        _bClassDtlByStwOutFlg = bClassDtlByStwOutFlg;
    }

    /** B_CLASS_DTL by my TAG_OUT_FLG, named 'BClassDtlByTagOutFlg'. */
    protected BClassDtl _bClassDtlByTagOutFlg;

    /**
     * [get] B_CLASS_DTL by my TAG_OUT_FLG, named 'BClassDtlByTagOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByTagOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByTagOutFlg() {
        return _bClassDtlByTagOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my TAG_OUT_FLG, named 'BClassDtlByTagOutFlg'.
     * @param bClassDtlByTagOutFlg The entity of foreign property 'BClassDtlByTagOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByTagOutFlg(BClassDtl bClassDtlByTagOutFlg) {
        _bClassDtlByTagOutFlg = bClassDtlByTagOutFlg;
    }

    /** B_CLASS_DTL by my INSPECTION_OUT_FLG, named 'BClassDtlByInspectionOutFlg'. */
    protected BClassDtl _bClassDtlByInspectionOutFlg;

    /**
     * [get] B_CLASS_DTL by my INSPECTION_OUT_FLG, named 'BClassDtlByInspectionOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInspectionOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInspectionOutFlg() {
        return _bClassDtlByInspectionOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSPECTION_OUT_FLG, named 'BClassDtlByInspectionOutFlg'.
     * @param bClassDtlByInspectionOutFlg The entity of foreign property 'BClassDtlByInspectionOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByInspectionOutFlg(BClassDtl bClassDtlByInspectionOutFlg) {
        _bClassDtlByInspectionOutFlg = bClassDtlByInspectionOutFlg;
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
        if (obj instanceof BsTPackingR) {
            BsTPackingR other = (BsTPackingR)obj;
            if (!xSV(_packingHId, other._packingHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _packingHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bUserByTagOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByTagOutUserId, "bUserByTagOutUserId")); }
        if (_bUserByInspectionOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByInspectionOutUserId, "bUserByInspectionOutUserId")); }
        if (_tPackingH != null)
        { sb.append(li).append(xbRDS(_tPackingH, "tPackingH")); }
        if (_bUserByStwOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByStwOutUserId, "bUserByStwOutUserId")); }
        if (_bClassDtlByStwOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStwOutFlg, "bClassDtlByStwOutFlg")); }
        if (_bClassDtlByTagOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTagOutFlg, "bClassDtlByTagOutFlg")); }
        if (_bClassDtlByInspectionOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInspectionOutFlg, "bClassDtlByInspectionOutFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_packingHId));
        sb.append(dm).append(xfND(_stwOutFlg));
        sb.append(dm).append(xfND(_stwOutUserId));
        sb.append(dm).append(xfND(_stwOutDt));
        sb.append(dm).append(xfND(_tagOutFlg));
        sb.append(dm).append(xfND(_tagOutUserId));
        sb.append(dm).append(xfND(_tagOutDt));
        sb.append(dm).append(xfND(_tagDlUrl));
        sb.append(dm).append(xfND(_inspectionOutFlg));
        sb.append(dm).append(xfND(_inspectionOutUserId));
        sb.append(dm).append(xfND(_inspectionOutDt));
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
        if (_bUserByTagOutUserId != null)
        { sb.append(dm).append("bUserByTagOutUserId"); }
        if (_bUserByInspectionOutUserId != null)
        { sb.append(dm).append("bUserByInspectionOutUserId"); }
        if (_tPackingH != null)
        { sb.append(dm).append("tPackingH"); }
        if (_bUserByStwOutUserId != null)
        { sb.append(dm).append("bUserByStwOutUserId"); }
        if (_bClassDtlByStwOutFlg != null)
        { sb.append(dm).append("bClassDtlByStwOutFlg"); }
        if (_bClassDtlByTagOutFlg != null)
        { sb.append(dm).append("bClassDtlByTagOutFlg"); }
        if (_bClassDtlByInspectionOutFlg != null)
        { sb.append(dm).append("bClassDtlByInspectionOutFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TPackingR clone() {
        return (TPackingR)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPackingHId() {
        checkSpecifiedProperty("packingHId");
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPackingHId(Long packingHId) {
        registerModifiedProperty("packingHId");
        _packingHId = packingHId;
    }

    /**
     * [get] STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 積込リスト出力フラグ
     * @return The value of the column 'STW_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStwOutFlg() {
        checkSpecifiedProperty("stwOutFlg");
        return convertEmptyToNull(_stwOutFlg);
    }

    /**
     * [set] STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 積込リスト出力フラグ
     * @param stwOutFlg The value of the column 'STW_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStwOutFlg(String stwOutFlg) {
        registerModifiedProperty("stwOutFlg");
        _stwOutFlg = stwOutFlg;
    }

    /**
     * [get] STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 積込リスト出力者ID
     * @return The value of the column 'STW_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStwOutUserId() {
        checkSpecifiedProperty("stwOutUserId");
        return _stwOutUserId;
    }

    /**
     * [set] STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 積込リスト出力者ID
     * @param stwOutUserId The value of the column 'STW_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStwOutUserId(Long stwOutUserId) {
        registerModifiedProperty("stwOutUserId");
        _stwOutUserId = stwOutUserId;
    }

    /**
     * [get] STW_OUT_DT: {datetime2(26, 6)} <br>
     * 積込リスト出力日時
     * @return The value of the column 'STW_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getStwOutDt() {
        checkSpecifiedProperty("stwOutDt");
        return _stwOutDt;
    }

    /**
     * [set] STW_OUT_DT: {datetime2(26, 6)} <br>
     * 積込リスト出力日時
     * @param stwOutDt The value of the column 'STW_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStwOutDt(java.sql.Timestamp stwOutDt) {
        registerModifiedProperty("stwOutDt");
        _stwOutDt = stwOutDt;
    }

    /**
     * [get] TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 荷札出力フラグ
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagOutFlg() {
        checkSpecifiedProperty("tagOutFlg");
        return convertEmptyToNull(_tagOutFlg);
    }

    /**
     * [set] TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 荷札出力フラグ
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutFlg(String tagOutFlg) {
        registerModifiedProperty("tagOutFlg");
        _tagOutFlg = tagOutFlg;
    }

    /**
     * [get] TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 荷札出力者ID
     * @return The value of the column 'TAG_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTagOutUserId() {
        checkSpecifiedProperty("tagOutUserId");
        return _tagOutUserId;
    }

    /**
     * [set] TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 荷札出力者ID
     * @param tagOutUserId The value of the column 'TAG_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutUserId(Long tagOutUserId) {
        registerModifiedProperty("tagOutUserId");
        _tagOutUserId = tagOutUserId;
    }

    /**
     * [get] TAG_OUT_DT: {datetime2(26, 6)} <br>
     * 荷札出力日時
     * @return The value of the column 'TAG_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTagOutDt() {
        checkSpecifiedProperty("tagOutDt");
        return _tagOutDt;
    }

    /**
     * [set] TAG_OUT_DT: {datetime2(26, 6)} <br>
     * 荷札出力日時
     * @param tagOutDt The value of the column 'TAG_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutDt(java.sql.Timestamp tagOutDt) {
        registerModifiedProperty("tagOutDt");
        _tagOutDt = tagOutDt;
    }

    /**
     * [get] TAG_DL_URL: {varchar(255)} <br>
     * 荷札ダウンロードURL
     * @return The value of the column 'TAG_DL_URL'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagDlUrl() {
        checkSpecifiedProperty("tagDlUrl");
        return convertEmptyToNull(_tagDlUrl);
    }

    /**
     * [set] TAG_DL_URL: {varchar(255)} <br>
     * 荷札ダウンロードURL
     * @param tagDlUrl The value of the column 'TAG_DL_URL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagDlUrl(String tagDlUrl) {
        registerModifiedProperty("tagDlUrl");
        _tagDlUrl = tagDlUrl;
    }

    /**
     * [get] INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * SD検品ラベル出力フラグ
     * @return The value of the column 'INSPECTION_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectionOutFlg() {
        checkSpecifiedProperty("inspectionOutFlg");
        return convertEmptyToNull(_inspectionOutFlg);
    }

    /**
     * [set] INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * SD検品ラベル出力フラグ
     * @param inspectionOutFlg The value of the column 'INSPECTION_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionOutFlg(String inspectionOutFlg) {
        registerModifiedProperty("inspectionOutFlg");
        _inspectionOutFlg = inspectionOutFlg;
    }

    /**
     * [get] INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * SD検品ラベル出力者ID
     * @return The value of the column 'INSPECTION_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInspectionOutUserId() {
        checkSpecifiedProperty("inspectionOutUserId");
        return _inspectionOutUserId;
    }

    /**
     * [set] INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * SD検品ラベル出力者ID
     * @param inspectionOutUserId The value of the column 'INSPECTION_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionOutUserId(Long inspectionOutUserId) {
        registerModifiedProperty("inspectionOutUserId");
        _inspectionOutUserId = inspectionOutUserId;
    }

    /**
     * [get] INSPECTION_OUT_DT: {datetime2(26, 6)} <br>
     * SD検品ラベル出力日時
     * @return The value of the column 'INSPECTION_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getInspectionOutDt() {
        checkSpecifiedProperty("inspectionOutDt");
        return _inspectionOutDt;
    }

    /**
     * [set] INSPECTION_OUT_DT: {datetime2(26, 6)} <br>
     * SD検品ラベル出力日時
     * @param inspectionOutDt The value of the column 'INSPECTION_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionOutDt(java.sql.Timestamp inspectionOutDt) {
        registerModifiedProperty("inspectionOutDt");
        _inspectionOutDt = inspectionOutDt;
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
