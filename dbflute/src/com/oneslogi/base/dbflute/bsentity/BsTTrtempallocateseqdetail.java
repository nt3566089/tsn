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
 * The entity of T_TRTEMPALLOCATESEQDETAIL as TABLE. <br>
 * 仮引当順明細
 * <pre>
 * [primary-key]
 *     TEMPORARY_ALLOC_DETAIL_ID
 *
 * [column]
 *     TEMPORARY_ALLOC_DETAIL_ID, TEMPORARY_ALLOC_ID, ALLOCATESEQ, LOT_ID, LOCATION_ID, LISTKBN, DETAILLINENO, PALLET_ID, TEMPPICKEDQTY1, TEMPPICKEDQTY2, TEMPPICKEDQTY3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TEMPORARY_ALLOC_DETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRTEMPALLOCATESEQ
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrtempallocateseq
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long temporaryAllocDetailId = entity.getTemporaryAllocDetailId();
 * Long temporaryAllocId = entity.getTemporaryAllocId();
 * Long allocateseq = entity.getAllocateseq();
 * Long lotId = entity.getLotId();
 * String locationId = entity.getLocationId();
 * String listkbn = entity.getListkbn();
 * Long detaillineno = entity.getDetaillineno();
 * Long palletId = entity.getPalletId();
 * Long temppickedqty1 = entity.getTemppickedqty1();
 * Long temppickedqty2 = entity.getTemppickedqty2();
 * Long temppickedqty3 = entity.getTemppickedqty3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTemporaryAllocDetailId(temporaryAllocDetailId);
 * entity.setTemporaryAllocId(temporaryAllocId);
 * entity.setAllocateseq(allocateseq);
 * entity.setLotId(lotId);
 * entity.setLocationId(locationId);
 * entity.setListkbn(listkbn);
 * entity.setDetaillineno(detaillineno);
 * entity.setPalletId(palletId);
 * entity.setTemppickedqty1(temppickedqty1);
 * entity.setTemppickedqty2(temppickedqty2);
 * entity.setTemppickedqty3(temppickedqty3);
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
public abstract class BsTTrtempallocateseqdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _temporaryAllocDetailId;

    /** TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ} */
    protected Long _temporaryAllocId;

    /** ALLOCATESEQ: {NotNull, bigint(19)} */
    protected Long _allocateseq;

    /** LOT_ID: {NotNull, bigint(19)} */
    protected Long _lotId;

    /** LOCATION_ID: {NotNull, varchar(30)} */
    protected String _locationId;

    /** LISTKBN: {NotNull, char(1)} */
    protected String _listkbn;

    /** DETAILLINENO: {NotNull, bigint(19)} */
    protected Long _detaillineno;

    /** PALLET_ID: {bigint(19)} */
    protected Long _palletId;

    /** TEMPPICKEDQTY1: {bigint(19)} */
    protected Long _temppickedqty1;

    /** TEMPPICKEDQTY2: {bigint(19)} */
    protected Long _temppickedqty2;

    /** TEMPPICKEDQTY3: {bigint(19)} */
    protected Long _temppickedqty3;

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
        return "T_TRTEMPALLOCATESEQDETAIL";
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
        if (_temporaryAllocDetailId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
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
    /** T_TRTEMPALLOCATESEQ by my TEMPORARY_ALLOC_ID, named 'TTrtempallocateseq'. */
    protected TTrtempallocateseq _tTrtempallocateseq;

    /**
     * [get] T_TRTEMPALLOCATESEQ by my TEMPORARY_ALLOC_ID, named 'TTrtempallocateseq'. <br>
     * @return The entity of foreign property 'TTrtempallocateseq'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TTrtempallocateseq getTTrtempallocateseq() {
        return _tTrtempallocateseq;
    }

    /**
     * [set] T_TRTEMPALLOCATESEQ by my TEMPORARY_ALLOC_ID, named 'TTrtempallocateseq'.
     * @param tTrtempallocateseq The entity of foreign property 'TTrtempallocateseq'. (NullAllowed)
     */
    public void setTTrtempallocateseq(TTrtempallocateseq tTrtempallocateseq) {
        _tTrtempallocateseq = tTrtempallocateseq;
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
        if (obj instanceof BsTTrtempallocateseqdetail) {
            BsTTrtempallocateseqdetail other = (BsTTrtempallocateseqdetail)obj;
            if (!xSV(_temporaryAllocDetailId, other._temporaryAllocDetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _temporaryAllocDetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tTrtempallocateseq != null)
        { sb.append(li).append(xbRDS(_tTrtempallocateseq, "tTrtempallocateseq")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_temporaryAllocDetailId));
        sb.append(dm).append(xfND(_temporaryAllocId));
        sb.append(dm).append(xfND(_allocateseq));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_listkbn));
        sb.append(dm).append(xfND(_detaillineno));
        sb.append(dm).append(xfND(_palletId));
        sb.append(dm).append(xfND(_temppickedqty1));
        sb.append(dm).append(xfND(_temppickedqty2));
        sb.append(dm).append(xfND(_temppickedqty3));
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
        if (_tTrtempallocateseq != null)
        { sb.append(dm).append("tTrtempallocateseq"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrtempallocateseqdetail clone() {
        return (TTrtempallocateseqdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仮引当順明細ID
     * @return The value of the column 'TEMPORARY_ALLOC_DETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTemporaryAllocDetailId() {
        checkSpecifiedProperty("temporaryAllocDetailId");
        return _temporaryAllocDetailId;
    }

    /**
     * [set] TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仮引当順明細ID
     * @param temporaryAllocDetailId The value of the column 'TEMPORARY_ALLOC_DETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTemporaryAllocDetailId(Long temporaryAllocDetailId) {
        registerModifiedProperty("temporaryAllocDetailId");
        _temporaryAllocDetailId = temporaryAllocDetailId;
    }

    /**
     * [get] TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ} <br>
     * 仮引当順ID
     * @return The value of the column 'TEMPORARY_ALLOC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTemporaryAllocId() {
        checkSpecifiedProperty("temporaryAllocId");
        return _temporaryAllocId;
    }

    /**
     * [set] TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ} <br>
     * 仮引当順ID
     * @param temporaryAllocId The value of the column 'TEMPORARY_ALLOC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTemporaryAllocId(Long temporaryAllocId) {
        registerModifiedProperty("temporaryAllocId");
        _temporaryAllocId = temporaryAllocId;
    }

    /**
     * [get] ALLOCATESEQ: {NotNull, bigint(19)} <br>
     * 実引当順
     * @return The value of the column 'ALLOCATESEQ'. (basically NotNull if selected: for the constraint)
     */
    public Long getAllocateseq() {
        checkSpecifiedProperty("allocateseq");
        return _allocateseq;
    }

    /**
     * [set] ALLOCATESEQ: {NotNull, bigint(19)} <br>
     * 実引当順
     * @param allocateseq The value of the column 'ALLOCATESEQ'. (basically NotNull if update: for the constraint)
     */
    public void setAllocateseq(Long allocateseq) {
        registerModifiedProperty("allocateseq");
        _allocateseq = allocateseq;
    }

    /**
     * [get] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] LOCATION_ID: {NotNull, varchar(30)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getLocationId() {
        checkSpecifiedProperty("locationId");
        return convertEmptyToNull(_locationId);
    }

    /**
     * [set] LOCATION_ID: {NotNull, varchar(30)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(String locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LISTKBN: {NotNull, char(1)} <br>
     * 単品・端数区分
     * @return The value of the column 'LISTKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getListkbn() {
        checkSpecifiedProperty("listkbn");
        return convertEmptyToNull(_listkbn);
    }

    /**
     * [set] LISTKBN: {NotNull, char(1)} <br>
     * 単品・端数区分
     * @param listkbn The value of the column 'LISTKBN'. (basically NotNull if update: for the constraint)
     */
    public void setListkbn(String listkbn) {
        registerModifiedProperty("listkbn");
        _listkbn = listkbn;
    }

    /**
     * [get] DETAILLINENO: {NotNull, bigint(19)} <br>
     * 行No
     * @return The value of the column 'DETAILLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getDetaillineno() {
        checkSpecifiedProperty("detaillineno");
        return _detaillineno;
    }

    /**
     * [set] DETAILLINENO: {NotNull, bigint(19)} <br>
     * 行No
     * @param detaillineno The value of the column 'DETAILLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setDetaillineno(Long detaillineno) {
        registerModifiedProperty("detaillineno");
        _detaillineno = detaillineno;
    }

    /**
     * [get] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPalletId() {
        checkSpecifiedProperty("palletId");
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletId(Long palletId) {
        registerModifiedProperty("palletId");
        _palletId = palletId;
    }

    /**
     * [get] TEMPPICKEDQTY1: {bigint(19)} <br>
     * 引当数（個装）
     * @return The value of the column 'TEMPPICKEDQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTemppickedqty1() {
        checkSpecifiedProperty("temppickedqty1");
        return _temppickedqty1;
    }

    /**
     * [set] TEMPPICKEDQTY1: {bigint(19)} <br>
     * 引当数（個装）
     * @param temppickedqty1 The value of the column 'TEMPPICKEDQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTemppickedqty1(Long temppickedqty1) {
        registerModifiedProperty("temppickedqty1");
        _temppickedqty1 = temppickedqty1;
    }

    /**
     * [get] TEMPPICKEDQTY2: {bigint(19)} <br>
     * 引当数（ケース）
     * @return The value of the column 'TEMPPICKEDQTY2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTemppickedqty2() {
        checkSpecifiedProperty("temppickedqty2");
        return _temppickedqty2;
    }

    /**
     * [set] TEMPPICKEDQTY2: {bigint(19)} <br>
     * 引当数（ケース）
     * @param temppickedqty2 The value of the column 'TEMPPICKEDQTY2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTemppickedqty2(Long temppickedqty2) {
        registerModifiedProperty("temppickedqty2");
        _temppickedqty2 = temppickedqty2;
    }

    /**
     * [get] TEMPPICKEDQTY3: {bigint(19)} <br>
     * 引当数（カートン）
     * @return The value of the column 'TEMPPICKEDQTY3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTemppickedqty3() {
        checkSpecifiedProperty("temppickedqty3");
        return _temppickedqty3;
    }

    /**
     * [set] TEMPPICKEDQTY3: {bigint(19)} <br>
     * 引当数（カートン）
     * @param temppickedqty3 The value of the column 'TEMPPICKEDQTY3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTemppickedqty3(Long temppickedqty3) {
        registerModifiedProperty("temppickedqty3");
        _temppickedqty3 = temppickedqty3;
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
