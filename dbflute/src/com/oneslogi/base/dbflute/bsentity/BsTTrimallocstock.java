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
 * The entity of T_TRIMALLOCSTOCK as TABLE. <br>
 * 山出し引当不能在庫情報
 * <pre>
 * [primary-key]
 *     TRIMALLOCSTOCK_ID
 *
 * [column]
 *     TRIMALLOCSTOCK_ID, TRIMALLOC_H_ID, STOCK_ID, ALLOC_IMP_KEY, ALC_IMP_STKG_NO, LOCATION_CD, DESIGN_FLG, MANUFACTUREDATE, MONTH_FLG, QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSTOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_STOCK
 *
 * [referrer table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign property]
 *     tStock
 *
 * [referrer property]
 *     tTrimallocadjustList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trimallocstockId = entity.getTrimallocstockId();
 * Long trimallocHId = entity.getTrimallocHId();
 * Long stockId = entity.getStockId();
 * Long allocImpKey = entity.getAllocImpKey();
 * Long alcImpStkgNo = entity.getAlcImpStkgNo();
 * String locationCd = entity.getLocationCd();
 * String designFlg = entity.getDesignFlg();
 * String manufacturedate = entity.getManufacturedate();
 * Long monthFlg = entity.getMonthFlg();
 * Long qty = entity.getQty();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrimallocstockId(trimallocstockId);
 * entity.setTrimallocHId(trimallocHId);
 * entity.setStockId(stockId);
 * entity.setAllocImpKey(allocImpKey);
 * entity.setAlcImpStkgNo(alcImpStkgNo);
 * entity.setLocationCd(locationCd);
 * entity.setDesignFlg(designFlg);
 * entity.setManufacturedate(manufacturedate);
 * entity.setMonthFlg(monthFlg);
 * entity.setQty(qty);
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
public abstract class BsTTrimallocstock extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trimallocstockId;

    /** TRIMALLOC_H_ID: {NotNull, bigint(19)} */
    protected Long _trimallocHId;

    /** STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} */
    protected Long _stockId;

    /** ALLOC_IMP_KEY: {NotNull, bigint(19)} */
    protected Long _allocImpKey;

    /** ALC_IMP_STKG_NO: {NotNull, bigint(19)} */
    protected Long _alcImpStkgNo;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** DESIGN_FLG: {varchar(30)} */
    protected String _designFlg;

    /** MANUFACTUREDATE: {varchar(8)} */
    protected String _manufacturedate;

    /** MONTH_FLG: {NotNull, bigint(19)} */
    protected Long _monthFlg;

    /** QTY: {NotNull, bigint(19)} */
    protected Long _qty;

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
        return "T_TRIMALLOCSTOCK";
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
        if (_trimallocstockId == null) { return false; }
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
    /** T_STOCK by my STOCK_ID, named 'TStock'. */
    protected TStock _tStock;

    /**
     * [get] T_STOCK by my STOCK_ID, named 'TStock'. <br>
     * @return The entity of foreign property 'TStock'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStock getTStock() {
        return _tStock;
    }

    /**
     * [set] T_STOCK by my STOCK_ID, named 'TStock'.
     * @param tStock The entity of foreign property 'TStock'. (NullAllowed)
     */
    public void setTStock(TStock tStock) {
        _tStock = tStock;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_TRIMALLOCADJUST by TRIMALLOCSTOCK_ID, named 'TTrimallocadjustList'. */
    protected List<TTrimallocadjust> _tTrimallocadjustList;

    /**
     * [get] T_TRIMALLOCADJUST by TRIMALLOCSTOCK_ID, named 'TTrimallocadjustList'.
     * @return The entity list of referrer property 'TTrimallocadjustList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrimallocadjust> getTTrimallocadjustList() {
        if (_tTrimallocadjustList == null) { _tTrimallocadjustList = newReferrerList(); }
        return _tTrimallocadjustList;
    }

    /**
     * [set] T_TRIMALLOCADJUST by TRIMALLOCSTOCK_ID, named 'TTrimallocadjustList'.
     * @param tTrimallocadjustList The entity list of referrer property 'TTrimallocadjustList'. (NullAllowed)
     */
    public void setTTrimallocadjustList(List<TTrimallocadjust> tTrimallocadjustList) {
        _tTrimallocadjustList = tTrimallocadjustList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrimallocstock) {
            BsTTrimallocstock other = (BsTTrimallocstock)obj;
            if (!xSV(_trimallocstockId, other._trimallocstockId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trimallocstockId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tStock != null)
        { sb.append(li).append(xbRDS(_tStock, "tStock")); }
        if (_tTrimallocadjustList != null) { for (TTrimallocadjust et : _tTrimallocadjustList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrimallocadjustList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trimallocstockId));
        sb.append(dm).append(xfND(_trimallocHId));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_allocImpKey));
        sb.append(dm).append(xfND(_alcImpStkgNo));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_designFlg));
        sb.append(dm).append(xfND(_manufacturedate));
        sb.append(dm).append(xfND(_monthFlg));
        sb.append(dm).append(xfND(_qty));
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
        if (_tStock != null)
        { sb.append(dm).append("tStock"); }
        if (_tTrimallocadjustList != null && !_tTrimallocadjustList.isEmpty())
        { sb.append(dm).append("tTrimallocadjustList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrimallocstock clone() {
        return (TTrimallocstock)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能在庫情報ID
     * @return The value of the column 'TRIMALLOCSTOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrimallocstockId() {
        checkSpecifiedProperty("trimallocstockId");
        return _trimallocstockId;
    }

    /**
     * [set] TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能在庫情報ID
     * @param trimallocstockId The value of the column 'TRIMALLOCSTOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrimallocstockId(Long trimallocstockId) {
        registerModifiedProperty("trimallocstockId");
        _trimallocstockId = trimallocstockId;
    }

    /**
     * [get] TRIMALLOC_H_ID: {NotNull, bigint(19)} <br>
     * 山出し引当不能情報ヘッダID
     * @return The value of the column 'TRIMALLOC_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrimallocHId() {
        checkSpecifiedProperty("trimallocHId");
        return _trimallocHId;
    }

    /**
     * [set] TRIMALLOC_H_ID: {NotNull, bigint(19)} <br>
     * 山出し引当不能情報ヘッダID
     * @param trimallocHId The value of the column 'TRIMALLOC_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrimallocHId(Long trimallocHId) {
        registerModifiedProperty("trimallocHId");
        _trimallocHId = trimallocHId;
    }

    /**
     * [get] STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] ALLOC_IMP_KEY: {NotNull, bigint(19)} <br>
     * 引当不能キー
     * @return The value of the column 'ALLOC_IMP_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getAllocImpKey() {
        checkSpecifiedProperty("allocImpKey");
        return _allocImpKey;
    }

    /**
     * [set] ALLOC_IMP_KEY: {NotNull, bigint(19)} <br>
     * 引当不能キー
     * @param allocImpKey The value of the column 'ALLOC_IMP_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setAllocImpKey(Long allocImpKey) {
        registerModifiedProperty("allocImpKey");
        _allocImpKey = allocImpKey;
    }

    /**
     * [get] ALC_IMP_STKG_NO: {NotNull, bigint(19)} <br>
     * 引当不能在庫行№
     * @return The value of the column 'ALC_IMP_STKG_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getAlcImpStkgNo() {
        checkSpecifiedProperty("alcImpStkgNo");
        return _alcImpStkgNo;
    }

    /**
     * [set] ALC_IMP_STKG_NO: {NotNull, bigint(19)} <br>
     * 引当不能在庫行№
     * @param alcImpStkgNo The value of the column 'ALC_IMP_STKG_NO'. (basically NotNull if update: for the constraint)
     */
    public void setAlcImpStkgNo(Long alcImpStkgNo) {
        registerModifiedProperty("alcImpStkgNo");
        _alcImpStkgNo = alcImpStkgNo;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignFlg() {
        checkSpecifiedProperty("designFlg");
        return convertEmptyToNull(_designFlg);
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignFlg(String designFlg) {
        registerModifiedProperty("designFlg");
        _designFlg = designFlg;
    }

    /**
     * [get] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturedate() {
        checkSpecifiedProperty("manufacturedate");
        return convertEmptyToNull(_manufacturedate);
    }

    /**
     * [set] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturedate(String manufacturedate) {
        registerModifiedProperty("manufacturedate");
        _manufacturedate = manufacturedate;
    }

    /**
     * [get] MONTH_FLG: {NotNull, bigint(19)} <br>
     * 月替りデ変区分
     * @return The value of the column 'MONTH_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getMonthFlg() {
        checkSpecifiedProperty("monthFlg");
        return _monthFlg;
    }

    /**
     * [set] MONTH_FLG: {NotNull, bigint(19)} <br>
     * 月替りデ変区分
     * @param monthFlg The value of the column 'MONTH_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setMonthFlg(Long monthFlg) {
        registerModifiedProperty("monthFlg");
        _monthFlg = monthFlg;
    }

    /**
     * [get] QTY: {NotNull, bigint(19)} <br>
     * 在庫数量（個装）
     * @return The value of the column 'QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19)} <br>
     * 在庫数量（個装）
     * @param qty The value of the column 'QTY'. (basically NotNull if update: for the constraint)
     */
    public void setQty(Long qty) {
        registerModifiedProperty("qty");
        _qty = qty;
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
