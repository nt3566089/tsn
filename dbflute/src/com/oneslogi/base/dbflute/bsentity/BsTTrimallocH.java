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
 * The entity of T_TRIMALLOC_H as TABLE. <br>
 * 山出し引当不能情報ヘッダ
 * <pre>
 * [primary-key]
 *     TRIMALLOC_H_ID
 *
 * [column]
 *     TRIMALLOC_H_ID, ALLOC_IMP_KEY, WAREHOUSECD, PRODUCT_CD, SHIPSCH_DATE, PICK_BATCH_KEY, RESTOCK_FLG, PRIORITIES, PICKADJUST_STS, ALCIMRSN_FLG, QTY_ADJUST_FLG, CENTER_ID, CLIENT_ID, RCV_STKEXA_DATE, STOCK_SHORTAGE_QTY, STOCK_SUM_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOC_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_TRIMALLOCSCHKRI
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tTrimallocschkriList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trimallocHId = entity.getTrimallocHId();
 * Long allocImpKey = entity.getAllocImpKey();
 * String warehousecd = entity.getWarehousecd();
 * String productCd = entity.getProductCd();
 * String shipschDate = entity.getShipschDate();
 * Long pickBatchKey = entity.getPickBatchKey();
 * String restockFlg = entity.getRestockFlg();
 * Long priorities = entity.getPriorities();
 * Long pickadjustSts = entity.getPickadjustSts();
 * String alcimrsnFlg = entity.getAlcimrsnFlg();
 * String qtyAdjustFlg = entity.getQtyAdjustFlg();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String rcvStkexaDate = entity.getRcvStkexaDate();
 * Long stockShortageQty = entity.getStockShortageQty();
 * Long stockSumQty = entity.getStockSumQty();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrimallocHId(trimallocHId);
 * entity.setAllocImpKey(allocImpKey);
 * entity.setWarehousecd(warehousecd);
 * entity.setProductCd(productCd);
 * entity.setShipschDate(shipschDate);
 * entity.setPickBatchKey(pickBatchKey);
 * entity.setRestockFlg(restockFlg);
 * entity.setPriorities(priorities);
 * entity.setPickadjustSts(pickadjustSts);
 * entity.setAlcimrsnFlg(alcimrsnFlg);
 * entity.setQtyAdjustFlg(qtyAdjustFlg);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setRcvStkexaDate(rcvStkexaDate);
 * entity.setStockShortageQty(stockShortageQty);
 * entity.setStockSumQty(stockSumQty);
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
public abstract class BsTTrimallocH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trimallocHId;

    /** ALLOC_IMP_KEY: {NotNull, bigint(19)} */
    protected Long _allocImpKey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** SHIPSCH_DATE: {NotNull, varchar(8)} */
    protected String _shipschDate;

    /** PICK_BATCH_KEY: {NotNull, bigint(19)} */
    protected Long _pickBatchKey;

    /** RESTOCK_FLG: {varchar(30)} */
    protected String _restockFlg;

    /** PRIORITIES: {bigint(19)} */
    protected Long _priorities;

    /** PICKADJUST_STS: {bigint(19)} */
    protected Long _pickadjustSts;

    /** ALCIMRSN_FLG: {varchar(30)} */
    protected String _alcimrsnFlg;

    /** QTY_ADJUST_FLG: {char(1)} */
    protected String _qtyAdjustFlg;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** RCV_STKEXA_DATE: {NotNull, varchar(8)} */
    protected String _rcvStkexaDate;

    /** STOCK_SHORTAGE_QTY: {NotNull, bigint(19)} */
    protected Long _stockShortageQty;

    /** STOCK_SUM_QTY: {NotNull, bigint(19)} */
    protected Long _stockSumQty;

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
        return "T_TRIMALLOC_H";
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
        if (_trimallocHId == null) { return false; }
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_TRIMALLOCSCHKRI by TRIMALLOC_H_ID, named 'TTrimallocschkriList'. */
    protected List<TTrimallocschkri> _tTrimallocschkriList;

    /**
     * [get] T_TRIMALLOCSCHKRI by TRIMALLOC_H_ID, named 'TTrimallocschkriList'.
     * @return The entity list of referrer property 'TTrimallocschkriList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrimallocschkri> getTTrimallocschkriList() {
        if (_tTrimallocschkriList == null) { _tTrimallocschkriList = newReferrerList(); }
        return _tTrimallocschkriList;
    }

    /**
     * [set] T_TRIMALLOCSCHKRI by TRIMALLOC_H_ID, named 'TTrimallocschkriList'.
     * @param tTrimallocschkriList The entity list of referrer property 'TTrimallocschkriList'. (NullAllowed)
     */
    public void setTTrimallocschkriList(List<TTrimallocschkri> tTrimallocschkriList) {
        _tTrimallocschkriList = tTrimallocschkriList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrimallocH) {
            BsTTrimallocH other = (BsTTrimallocH)obj;
            if (!xSV(_trimallocHId, other._trimallocHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trimallocHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tTrimallocschkriList != null) { for (TTrimallocschkri et : _tTrimallocschkriList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrimallocschkriList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trimallocHId));
        sb.append(dm).append(xfND(_allocImpKey));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_shipschDate));
        sb.append(dm).append(xfND(_pickBatchKey));
        sb.append(dm).append(xfND(_restockFlg));
        sb.append(dm).append(xfND(_priorities));
        sb.append(dm).append(xfND(_pickadjustSts));
        sb.append(dm).append(xfND(_alcimrsnFlg));
        sb.append(dm).append(xfND(_qtyAdjustFlg));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_rcvStkexaDate));
        sb.append(dm).append(xfND(_stockShortageQty));
        sb.append(dm).append(xfND(_stockSumQty));
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
        if (_tTrimallocschkriList != null && !_tTrimallocschkriList.isEmpty())
        { sb.append(dm).append("tTrimallocschkriList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrimallocH clone() {
        return (TTrimallocH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能情報ヘッダID
     * @return The value of the column 'TRIMALLOC_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrimallocHId() {
        checkSpecifiedProperty("trimallocHId");
        return _trimallocHId;
    }

    /**
     * [set] TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能情報ヘッダID
     * @param trimallocHId The value of the column 'TRIMALLOC_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrimallocHId(Long trimallocHId) {
        registerModifiedProperty("trimallocHId");
        _trimallocHId = trimallocHId;
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
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] SHIPSCH_DATE: {NotNull, varchar(8)} <br>
     * 山出し日
     * @return The value of the column 'SHIPSCH_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getShipschDate() {
        checkSpecifiedProperty("shipschDate");
        return convertEmptyToNull(_shipschDate);
    }

    /**
     * [set] SHIPSCH_DATE: {NotNull, varchar(8)} <br>
     * 山出し日
     * @param shipschDate The value of the column 'SHIPSCH_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setShipschDate(String shipschDate) {
        registerModifiedProperty("shipschDate");
        _shipschDate = shipschDate;
    }

    /**
     * [get] PICK_BATCH_KEY: {NotNull, bigint(19)} <br>
     * 引当バッチキー
     * @return The value of the column 'PICK_BATCH_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickBatchKey() {
        checkSpecifiedProperty("pickBatchKey");
        return _pickBatchKey;
    }

    /**
     * [set] PICK_BATCH_KEY: {NotNull, bigint(19)} <br>
     * 引当バッチキー
     * @param pickBatchKey The value of the column 'PICK_BATCH_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setPickBatchKey(Long pickBatchKey) {
        registerModifiedProperty("pickBatchKey");
        _pickBatchKey = pickBatchKey;
    }

    /**
     * [get] RESTOCK_FLG: {varchar(30)} <br>
     * 補充区分
     * @return The value of the column 'RESTOCK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getRestockFlg() {
        checkSpecifiedProperty("restockFlg");
        return convertEmptyToNull(_restockFlg);
    }

    /**
     * [set] RESTOCK_FLG: {varchar(30)} <br>
     * 補充区分
     * @param restockFlg The value of the column 'RESTOCK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockFlg(String restockFlg) {
        registerModifiedProperty("restockFlg");
        _restockFlg = restockFlg;
    }

    /**
     * [get] PRIORITIES: {bigint(19)} <br>
     * 補充回数
     * @return The value of the column 'PRIORITIES'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPriorities() {
        checkSpecifiedProperty("priorities");
        return _priorities;
    }

    /**
     * [set] PRIORITIES: {bigint(19)} <br>
     * 補充回数
     * @param priorities The value of the column 'PRIORITIES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriorities(Long priorities) {
        registerModifiedProperty("priorities");
        _priorities = priorities;
    }

    /**
     * [get] PICKADJUST_STS: {bigint(19)} <br>
     * 引当調整ステータス
     * @return The value of the column 'PICKADJUST_STS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickadjustSts() {
        checkSpecifiedProperty("pickadjustSts");
        return _pickadjustSts;
    }

    /**
     * [set] PICKADJUST_STS: {bigint(19)} <br>
     * 引当調整ステータス
     * @param pickadjustSts The value of the column 'PICKADJUST_STS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickadjustSts(Long pickadjustSts) {
        registerModifiedProperty("pickadjustSts");
        _pickadjustSts = pickadjustSts;
    }

    /**
     * [get] ALCIMRSN_FLG: {varchar(30)} <br>
     * 引当不能理由区分
     * @return The value of the column 'ALCIMRSN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAlcimrsnFlg() {
        checkSpecifiedProperty("alcimrsnFlg");
        return convertEmptyToNull(_alcimrsnFlg);
    }

    /**
     * [set] ALCIMRSN_FLG: {varchar(30)} <br>
     * 引当不能理由区分
     * @param alcimrsnFlg The value of the column 'ALCIMRSN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAlcimrsnFlg(String alcimrsnFlg) {
        registerModifiedProperty("alcimrsnFlg");
        _alcimrsnFlg = alcimrsnFlg;
    }

    /**
     * [get] QTY_ADJUST_FLG: {char(1)} <br>
     * 数量調整未済フラグ
     * @return The value of the column 'QTY_ADJUST_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getQtyAdjustFlg() {
        checkSpecifiedProperty("qtyAdjustFlg");
        return convertEmptyToNull(_qtyAdjustFlg);
    }

    /**
     * [set] QTY_ADJUST_FLG: {char(1)} <br>
     * 数量調整未済フラグ
     * @param qtyAdjustFlg The value of the column 'QTY_ADJUST_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQtyAdjustFlg(String qtyAdjustFlg) {
        registerModifiedProperty("qtyAdjustFlg");
        _qtyAdjustFlg = qtyAdjustFlg;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] RCV_STKEXA_DATE: {NotNull, varchar(8)} <br>
     * 引取場製造年月日
     * @return The value of the column 'RCV_STKEXA_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvStkexaDate() {
        checkSpecifiedProperty("rcvStkexaDate");
        return convertEmptyToNull(_rcvStkexaDate);
    }

    /**
     * [set] RCV_STKEXA_DATE: {NotNull, varchar(8)} <br>
     * 引取場製造年月日
     * @param rcvStkexaDate The value of the column 'RCV_STKEXA_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setRcvStkexaDate(String rcvStkexaDate) {
        registerModifiedProperty("rcvStkexaDate");
        _rcvStkexaDate = rcvStkexaDate;
    }

    /**
     * [get] STOCK_SHORTAGE_QTY: {NotNull, bigint(19)} <br>
     * 在庫不足数量(個装)
     * @return The value of the column 'STOCK_SHORTAGE_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockShortageQty() {
        checkSpecifiedProperty("stockShortageQty");
        return _stockShortageQty;
    }

    /**
     * [set] STOCK_SHORTAGE_QTY: {NotNull, bigint(19)} <br>
     * 在庫不足数量(個装)
     * @param stockShortageQty The value of the column 'STOCK_SHORTAGE_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setStockShortageQty(Long stockShortageQty) {
        registerModifiedProperty("stockShortageQty");
        _stockShortageQty = stockShortageQty;
    }

    /**
     * [get] STOCK_SUM_QTY: {NotNull, bigint(19)} <br>
     * 保管場在庫数量(個装)
     * @return The value of the column 'STOCK_SUM_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockSumQty() {
        checkSpecifiedProperty("stockSumQty");
        return _stockSumQty;
    }

    /**
     * [set] STOCK_SUM_QTY: {NotNull, bigint(19)} <br>
     * 保管場在庫数量(個装)
     * @param stockSumQty The value of the column 'STOCK_SUM_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setStockSumQty(Long stockSumQty) {
        registerModifiedProperty("stockSumQty");
        _stockSumQty = stockSumQty;
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
