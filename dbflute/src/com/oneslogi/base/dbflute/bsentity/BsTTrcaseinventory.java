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
 * The entity of T_TRCASEINVENTORY as TABLE. <br>
 * ケース在庫調査情報
 * <pre>
 * [primary-key]
 *     TRCASEINVENTORY_ID
 *
 * [column]
 *     TRCASEINVENTORY_ID, CASEINVENTORYNO, CASECD, INVENTORYKEY, INVENTORY_B_ID, CASEINVQTY, DEFECTIVENUM, TOTALSORTEDNUM, SORTEDDIFNUM, INVENTORYDATETIME, TRACECREATESTS, ACTFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRCASEINVENTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trcaseinventoryId = entity.getTrcaseinventoryId();
 * java.math.BigDecimal caseinventoryno = entity.getCaseinventoryno();
 * java.math.BigDecimal casecd = entity.getCasecd();
 * String inventorykey = entity.getInventorykey();
 * Long inventoryBId = entity.getInventoryBId();
 * Long caseinvqty = entity.getCaseinvqty();
 * Long defectivenum = entity.getDefectivenum();
 * java.math.BigDecimal totalsortednum = entity.getTotalsortednum();
 * Long sorteddifnum = entity.getSorteddifnum();
 * String inventorydatetime = entity.getInventorydatetime();
 * java.math.BigDecimal tracecreatests = entity.getTracecreatests();
 * java.math.BigDecimal actflg = entity.getActflg();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrcaseinventoryId(trcaseinventoryId);
 * entity.setCaseinventoryno(caseinventoryno);
 * entity.setCasecd(casecd);
 * entity.setInventorykey(inventorykey);
 * entity.setInventoryBId(inventoryBId);
 * entity.setCaseinvqty(caseinvqty);
 * entity.setDefectivenum(defectivenum);
 * entity.setTotalsortednum(totalsortednum);
 * entity.setSorteddifnum(sorteddifnum);
 * entity.setInventorydatetime(inventorydatetime);
 * entity.setTracecreatests(tracecreatests);
 * entity.setActflg(actflg);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
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
public abstract class BsTTrcaseinventory extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trcaseinventoryId;

    /** CASEINVENTORYNO: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _caseinventoryno;

    /** CASECD: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _casecd;

    /** INVENTORYKEY: {NotNull, varchar(30)} */
    protected String _inventorykey;

    /** INVENTORY_B_ID: {NotNull, bigint(19)} */
    protected Long _inventoryBId;

    /** CASEINVQTY: {NotNull, bigint(19)} */
    protected Long _caseinvqty;

    /** DEFECTIVENUM: {bigint(19)} */
    protected Long _defectivenum;

    /** TOTALSORTEDNUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _totalsortednum;

    /** SORTEDDIFNUM: {bigint(19)} */
    protected Long _sorteddifnum;

    /** INVENTORYDATETIME: {NotNull, varchar(8)} */
    protected String _inventorydatetime;

    /** TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _tracecreatests;

    /** ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    protected java.math.BigDecimal _actflg;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

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
        return "T_TRCASEINVENTORY";
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
        if (_trcaseinventoryId == null) { return false; }
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

    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
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
        if (obj instanceof BsTTrcaseinventory) {
            BsTTrcaseinventory other = (BsTTrcaseinventory)obj;
            if (!xSV(_trcaseinventoryId, other._trcaseinventoryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trcaseinventoryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trcaseinventoryId));
        sb.append(dm).append(xfND(_caseinventoryno));
        sb.append(dm).append(xfND(_casecd));
        sb.append(dm).append(xfND(_inventorykey));
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_caseinvqty));
        sb.append(dm).append(xfND(_defectivenum));
        sb.append(dm).append(xfND(_totalsortednum));
        sb.append(dm).append(xfND(_sorteddifnum));
        sb.append(dm).append(xfND(_inventorydatetime));
        sb.append(dm).append(xfND(_tracecreatests));
        sb.append(dm).append(xfND(_actflg));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrcaseinventory clone() {
        return (TTrcaseinventory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ケース在庫調査情報ID
     * @return The value of the column 'TRCASEINVENTORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrcaseinventoryId() {
        checkSpecifiedProperty("trcaseinventoryId");
        return _trcaseinventoryId;
    }

    /**
     * [set] TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ケース在庫調査情報ID
     * @param trcaseinventoryId The value of the column 'TRCASEINVENTORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrcaseinventoryId(Long trcaseinventoryId) {
        registerModifiedProperty("trcaseinventoryId");
        _trcaseinventoryId = trcaseinventoryId;
    }

    /**
     * [get] CASEINVENTORYNO: {NotNull, decimal(16, 6)} <br>
     * ケース在庫調査番号
     * @return The value of the column 'CASEINVENTORYNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getCaseinventoryno() {
        checkSpecifiedProperty("caseinventoryno");
        return _caseinventoryno;
    }

    /**
     * [set] CASEINVENTORYNO: {NotNull, decimal(16, 6)} <br>
     * ケース在庫調査番号
     * @param caseinventoryno The value of the column 'CASEINVENTORYNO'. (basically NotNull if update: for the constraint)
     */
    public void setCaseinventoryno(java.math.BigDecimal caseinventoryno) {
        registerModifiedProperty("caseinventoryno");
        _caseinventoryno = caseinventoryno;
    }

    /**
     * [get] CASECD: {NotNull, decimal(16, 6)} <br>
     * ケースCD
     * @return The value of the column 'CASECD'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getCasecd() {
        checkSpecifiedProperty("casecd");
        return _casecd;
    }

    /**
     * [set] CASECD: {NotNull, decimal(16, 6)} <br>
     * ケースCD
     * @param casecd The value of the column 'CASECD'. (basically NotNull if update: for the constraint)
     */
    public void setCasecd(java.math.BigDecimal casecd) {
        registerModifiedProperty("casecd");
        _casecd = casecd;
    }

    /**
     * [get] INVENTORYKEY: {NotNull, varchar(30)} <br>
     * 在庫調査指示キー
     * @return The value of the column 'INVENTORYKEY'. (basically NotNull if selected: for the constraint)
     */
    public String getInventorykey() {
        checkSpecifiedProperty("inventorykey");
        return convertEmptyToNull(_inventorykey);
    }

    /**
     * [set] INVENTORYKEY: {NotNull, varchar(30)} <br>
     * 在庫調査指示キー
     * @param inventorykey The value of the column 'INVENTORYKEY'. (basically NotNull if update: for the constraint)
     */
    public void setInventorykey(String inventorykey) {
        registerModifiedProperty("inventorykey");
        _inventorykey = inventorykey;
    }

    /**
     * [get] INVENTORY_B_ID: {NotNull, bigint(19)} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {NotNull, bigint(19)} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] CASEINVQTY: {NotNull, bigint(19)} <br>
     * 在庫調査数量（個装）
     * @return The value of the column 'CASEINVQTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getCaseinvqty() {
        checkSpecifiedProperty("caseinvqty");
        return _caseinvqty;
    }

    /**
     * [set] CASEINVQTY: {NotNull, bigint(19)} <br>
     * 在庫調査数量（個装）
     * @param caseinvqty The value of the column 'CASEINVQTY'. (basically NotNull if update: for the constraint)
     */
    public void setCaseinvqty(Long caseinvqty) {
        registerModifiedProperty("caseinvqty");
        _caseinvqty = caseinvqty;
    }

    /**
     * [get] DEFECTIVENUM: {bigint(19)} <br>
     * 製品不良数量（カートン）
     * @return The value of the column 'DEFECTIVENUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDefectivenum() {
        checkSpecifiedProperty("defectivenum");
        return _defectivenum;
    }

    /**
     * [set] DEFECTIVENUM: {bigint(19)} <br>
     * 製品不良数量（カートン）
     * @param defectivenum The value of the column 'DEFECTIVENUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDefectivenum(Long defectivenum) {
        registerModifiedProperty("defectivenum");
        _defectivenum = defectivenum;
    }

    /**
     * [get] TOTALSORTEDNUM: {decimal(16, 6)} <br>
     * 仕分数量累計（カートン）
     * @return The value of the column 'TOTALSORTEDNUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalsortednum() {
        checkSpecifiedProperty("totalsortednum");
        return _totalsortednum;
    }

    /**
     * [set] TOTALSORTEDNUM: {decimal(16, 6)} <br>
     * 仕分数量累計（カートン）
     * @param totalsortednum The value of the column 'TOTALSORTEDNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalsortednum(java.math.BigDecimal totalsortednum) {
        registerModifiedProperty("totalsortednum");
        _totalsortednum = totalsortednum;
    }

    /**
     * [get] SORTEDDIFNUM: {bigint(19)} <br>
     * 仕分差異数量（カートン）
     * @return The value of the column 'SORTEDDIFNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSorteddifnum() {
        checkSpecifiedProperty("sorteddifnum");
        return _sorteddifnum;
    }

    /**
     * [set] SORTEDDIFNUM: {bigint(19)} <br>
     * 仕分差異数量（カートン）
     * @param sorteddifnum The value of the column 'SORTEDDIFNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSorteddifnum(Long sorteddifnum) {
        registerModifiedProperty("sorteddifnum");
        _sorteddifnum = sorteddifnum;
    }

    /**
     * [get] INVENTORYDATETIME: {NotNull, varchar(8)} <br>
     * 在庫調査日時
     * @return The value of the column 'INVENTORYDATETIME'. (basically NotNull if selected: for the constraint)
     */
    public String getInventorydatetime() {
        checkSpecifiedProperty("inventorydatetime");
        return convertEmptyToNull(_inventorydatetime);
    }

    /**
     * [set] INVENTORYDATETIME: {NotNull, varchar(8)} <br>
     * 在庫調査日時
     * @param inventorydatetime The value of the column 'INVENTORYDATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setInventorydatetime(String inventorydatetime) {
        registerModifiedProperty("inventorydatetime");
        _inventorydatetime = inventorydatetime;
    }

    /**
     * [get] TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 追跡情報作成状態
     * @return The value of the column 'TRACECREATESTS'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTracecreatests() {
        checkSpecifiedProperty("tracecreatests");
        return _tracecreatests;
    }

    /**
     * [set] TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 追跡情報作成状態
     * @param tracecreatests The value of the column 'TRACECREATESTS'. (basically NotNull if update: for the constraint)
     */
    public void setTracecreatests(java.math.BigDecimal tracecreatests) {
        registerModifiedProperty("tracecreatests");
        _tracecreatests = tracecreatests;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getActflg() {
        checkSpecifiedProperty("actflg");
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        registerModifiedProperty("actflg");
        _actflg = actflg;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
