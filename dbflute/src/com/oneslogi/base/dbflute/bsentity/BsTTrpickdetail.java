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
 * The entity of T_TRPICKDETAIL as TABLE. <br>
 * 山出し指示詳細ボディ
 * <pre>
 * [primary-key]
 *     TRPICKDETAIL_ID
 *
 * [column]
 *     TRPICKDETAIL_ID, TRSODETAIL_ID, MOVE_INST_H_ID, STOCK_ID, LOCATION_ID, PICK_BATCH_KEY, PICK_BATCH_LINE_NO, PRODUCT_CD, IFITEM_CD, LOT_ID, LOCATION_CD, EXPECT_QTY, PICKED_QTY, SORTED_QTY, SHIPPED_QTY, PICK_USER_CD, LABEL_PRINTED_FLG, MONTH_FLG, PL_BATCH_KEY, WORKALLOCATENAME, ALERTFLG, REVERSE_FLG, REVERSE_LIST_OUTPUT__FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPICKDETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_STOCK, M_LOCATION, T_YTRSODETAIL
 *
 * [referrer table]
 *     T_TR_PICKLIST
 *
 * [foreign property]
 *     tStock, mLocation, tYtrsodetail
 *
 * [referrer property]
 *     tTrPicklistList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trpickdetailId = entity.getTrpickdetailId();
 * Long trsodetailId = entity.getTrsodetailId();
 * Long moveInstHId = entity.getMoveInstHId();
 * Long stockId = entity.getStockId();
 * Long locationId = entity.getLocationId();
 * Long pickBatchKey = entity.getPickBatchKey();
 * Long pickBatchLineNo = entity.getPickBatchLineNo();
 * String productCd = entity.getProductCd();
 * String ifitemCd = entity.getIfitemCd();
 * Long lotId = entity.getLotId();
 * String locationCd = entity.getLocationCd();
 * Long expectQty = entity.getExpectQty();
 * Long pickedQty = entity.getPickedQty();
 * Long sortedQty = entity.getSortedQty();
 * Long shippedQty = entity.getShippedQty();
 * String pickUserCd = entity.getPickUserCd();
 * Long labelPrintedFlg = entity.getLabelPrintedFlg();
 * String monthFlg = entity.getMonthFlg();
 * Long plBatchKey = entity.getPlBatchKey();
 * String workallocatename = entity.getWorkallocatename();
 * Long alertflg = entity.getAlertflg();
 * String reverseFlg = entity.getReverseFlg();
 * String reverseListOutputFlg = entity.getReverseListOutputFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrpickdetailId(trpickdetailId);
 * entity.setTrsodetailId(trsodetailId);
 * entity.setMoveInstHId(moveInstHId);
 * entity.setStockId(stockId);
 * entity.setLocationId(locationId);
 * entity.setPickBatchKey(pickBatchKey);
 * entity.setPickBatchLineNo(pickBatchLineNo);
 * entity.setProductCd(productCd);
 * entity.setIfitemCd(ifitemCd);
 * entity.setLotId(lotId);
 * entity.setLocationCd(locationCd);
 * entity.setExpectQty(expectQty);
 * entity.setPickedQty(pickedQty);
 * entity.setSortedQty(sortedQty);
 * entity.setShippedQty(shippedQty);
 * entity.setPickUserCd(pickUserCd);
 * entity.setLabelPrintedFlg(labelPrintedFlg);
 * entity.setMonthFlg(monthFlg);
 * entity.setPlBatchKey(plBatchKey);
 * entity.setWorkallocatename(workallocatename);
 * entity.setAlertflg(alertflg);
 * entity.setReverseFlg(reverseFlg);
 * entity.setReverseListOutputFlg(reverseListOutputFlg);
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
public abstract class BsTTrpickdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trpickdetailId;

    /** TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL} */
    protected Long _trsodetailId;

    /** MOVE_INST_H_ID: {NotNull, bigint(19)} */
    protected Long _moveInstHId;

    /** STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} */
    protected Long _stockId;

    /** LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION} */
    protected Long _locationId;

    /** PICK_BATCH_KEY: {IX, bigint(19)} */
    protected Long _pickBatchKey;

    /** PICK_BATCH_LINE_NO: {bigint(19)} */
    protected Long _pickBatchLineNo;

    /** PRODUCT_CD: {IX, NotNull, varchar(30)} */
    protected String _productCd;

    /** IFITEM_CD: {varchar(30)} */
    protected String _ifitemCd;

    /** LOT_ID: {IX, NotNull, bigint(19)} */
    protected Long _lotId;

    /** LOCATION_CD: {IX, NotNull, varchar(30)} */
    protected String _locationCd;

    /** EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _expectQty;

    /** PICKED_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _pickedQty;

    /** SORTED_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _sortedQty;

    /** SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _shippedQty;

    /** PICK_USER_CD: {varchar(30)} */
    protected String _pickUserCd;

    /** LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]} */
    protected Long _labelPrintedFlg;

    /** MONTH_FLG: {varchar(30)} */
    protected String _monthFlg;

    /** PL_BATCH_KEY: {IX, bigint(19)} */
    protected Long _plBatchKey;

    /** WORKALLOCATENAME: {varchar(255)} */
    protected String _workallocatename;

    /** ALERTFLG: {NotNull, bigint(19), default=[(0)]} */
    protected Long _alertflg;

    /** REVERSE_FLG: {char(1)} */
    protected String _reverseFlg;

    /** REVERSE_LIST_OUTPUT__FLG: {char(1)} */
    protected String _reverseListOutputFlg;

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
        return "T_TRPICKDETAIL";
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
        if (_trpickdetailId == null) { return false; }
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

    /** M_LOCATION by my LOCATION_ID, named 'MLocation'. */
    protected MLocation _mLocation;

    /**
     * [get] M_LOCATION by my LOCATION_ID, named 'MLocation'. <br>
     * @return The entity of foreign property 'MLocation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MLocation getMLocation() {
        return _mLocation;
    }

    /**
     * [set] M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @param mLocation The entity of foreign property 'MLocation'. (NullAllowed)
     */
    public void setMLocation(MLocation mLocation) {
        _mLocation = mLocation;
    }

    /** T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'. */
    protected TYtrsodetail _tYtrsodetail;

    /**
     * [get] T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'. <br>
     * @return The entity of foreign property 'TYtrsodetail'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TYtrsodetail getTYtrsodetail() {
        return _tYtrsodetail;
    }

    /**
     * [set] T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @param tYtrsodetail The entity of foreign property 'TYtrsodetail'. (NullAllowed)
     */
    public void setTYtrsodetail(TYtrsodetail tYtrsodetail) {
        _tYtrsodetail = tYtrsodetail;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_TR_PICKLIST by TRPICKDETAIL_ID, named 'TTrPicklistList'. */
    protected List<TTrPicklist> _tTrPicklistList;

    /**
     * [get] T_TR_PICKLIST by TRPICKDETAIL_ID, named 'TTrPicklistList'.
     * @return The entity list of referrer property 'TTrPicklistList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrPicklist> getTTrPicklistList() {
        if (_tTrPicklistList == null) { _tTrPicklistList = newReferrerList(); }
        return _tTrPicklistList;
    }

    /**
     * [set] T_TR_PICKLIST by TRPICKDETAIL_ID, named 'TTrPicklistList'.
     * @param tTrPicklistList The entity list of referrer property 'TTrPicklistList'. (NullAllowed)
     */
    public void setTTrPicklistList(List<TTrPicklist> tTrPicklistList) {
        _tTrPicklistList = tTrPicklistList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrpickdetail) {
            BsTTrpickdetail other = (BsTTrpickdetail)obj;
            if (!xSV(_trpickdetailId, other._trpickdetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trpickdetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tStock != null)
        { sb.append(li).append(xbRDS(_tStock, "tStock")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_tYtrsodetail != null)
        { sb.append(li).append(xbRDS(_tYtrsodetail, "tYtrsodetail")); }
        if (_tTrPicklistList != null) { for (TTrPicklist et : _tTrPicklistList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrPicklistList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trpickdetailId));
        sb.append(dm).append(xfND(_trsodetailId));
        sb.append(dm).append(xfND(_moveInstHId));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_pickBatchKey));
        sb.append(dm).append(xfND(_pickBatchLineNo));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_ifitemCd));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_expectQty));
        sb.append(dm).append(xfND(_pickedQty));
        sb.append(dm).append(xfND(_sortedQty));
        sb.append(dm).append(xfND(_shippedQty));
        sb.append(dm).append(xfND(_pickUserCd));
        sb.append(dm).append(xfND(_labelPrintedFlg));
        sb.append(dm).append(xfND(_monthFlg));
        sb.append(dm).append(xfND(_plBatchKey));
        sb.append(dm).append(xfND(_workallocatename));
        sb.append(dm).append(xfND(_alertflg));
        sb.append(dm).append(xfND(_reverseFlg));
        sb.append(dm).append(xfND(_reverseListOutputFlg));
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
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_tYtrsodetail != null)
        { sb.append(dm).append("tYtrsodetail"); }
        if (_tTrPicklistList != null && !_tTrPicklistList.isEmpty())
        { sb.append(dm).append("tTrPicklistList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrpickdetail clone() {
        return (TTrpickdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示詳細ボディID
     * @return The value of the column 'TRPICKDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrpickdetailId() {
        checkSpecifiedProperty("trpickdetailId");
        return _trpickdetailId;
    }

    /**
     * [set] TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示詳細ボディID
     * @param trpickdetailId The value of the column 'TRPICKDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrpickdetailId(Long trpickdetailId) {
        registerModifiedProperty("trpickdetailId");
        _trpickdetailId = trpickdetailId;
    }

    /**
     * [get] TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL} <br>
     * 山出し指示ボディID
     * @return The value of the column 'TRSODETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsodetailId() {
        checkSpecifiedProperty("trsodetailId");
        return _trsodetailId;
    }

    /**
     * [set] TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL} <br>
     * 山出し指示ボディID
     * @param trsodetailId The value of the column 'TRSODETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsodetailId(Long trsodetailId) {
        registerModifiedProperty("trsodetailId");
        _trsodetailId = trsodetailId;
    }

    /**
     * [get] MOVE_INST_H_ID: {NotNull, bigint(19)} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoveInstHId() {
        checkSpecifiedProperty("moveInstHId");
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {NotNull, bigint(19)} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMoveInstHId(Long moveInstHId) {
        registerModifiedProperty("moveInstHId");
        _moveInstHId = moveInstHId;
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
     * [get] LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] PICK_BATCH_KEY: {IX, bigint(19)} <br>
     * 引当バッチキー
     * @return The value of the column 'PICK_BATCH_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickBatchKey() {
        checkSpecifiedProperty("pickBatchKey");
        return _pickBatchKey;
    }

    /**
     * [set] PICK_BATCH_KEY: {IX, bigint(19)} <br>
     * 引当バッチキー
     * @param pickBatchKey The value of the column 'PICK_BATCH_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickBatchKey(Long pickBatchKey) {
        registerModifiedProperty("pickBatchKey");
        _pickBatchKey = pickBatchKey;
    }

    /**
     * [get] PICK_BATCH_LINE_NO: {bigint(19)} <br>
     * 引当バッチ行No.
     * @return The value of the column 'PICK_BATCH_LINE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickBatchLineNo() {
        checkSpecifiedProperty("pickBatchLineNo");
        return _pickBatchLineNo;
    }

    /**
     * [set] PICK_BATCH_LINE_NO: {bigint(19)} <br>
     * 引当バッチ行No.
     * @param pickBatchLineNo The value of the column 'PICK_BATCH_LINE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickBatchLineNo(Long pickBatchLineNo) {
        registerModifiedProperty("pickBatchLineNo");
        _pickBatchLineNo = pickBatchLineNo;
    }

    /**
     * [get] PRODUCT_CD: {IX, NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {IX, NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] IFITEM_CD: {varchar(30)} <br>
     * I/F銘柄CD
     * @return The value of the column 'IFITEM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemCd() {
        checkSpecifiedProperty("ifitemCd");
        return convertEmptyToNull(_ifitemCd);
    }

    /**
     * [set] IFITEM_CD: {varchar(30)} <br>
     * I/F銘柄CD
     * @param ifitemCd The value of the column 'IFITEM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemCd(String ifitemCd) {
        registerModifiedProperty("ifitemCd");
        _ifitemCd = ifitemCd;
    }

    /**
     * [get] LOT_ID: {IX, NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] LOCATION_CD: {IX, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {IX, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (basically NotNull if update: for the constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング予定数量
     * @return The value of the column 'EXPECT_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectQty() {
        checkSpecifiedProperty("expectQty");
        return _expectQty;
    }

    /**
     * [set] EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング予定数量
     * @param expectQty The value of the column 'EXPECT_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setExpectQty(Long expectQty) {
        registerModifiedProperty("expectQty");
        _expectQty = expectQty;
    }

    /**
     * [get] PICKED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量
     * @return The value of the column 'PICKED_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickedQty() {
        checkSpecifiedProperty("pickedQty");
        return _pickedQty;
    }

    /**
     * [set] PICKED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量
     * @param pickedQty The value of the column 'PICKED_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setPickedQty(Long pickedQty) {
        registerModifiedProperty("pickedQty");
        _pickedQty = pickedQty;
    }

    /**
     * [get] SORTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量
     * @return The value of the column 'SORTED_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortedQty() {
        checkSpecifiedProperty("sortedQty");
        return _sortedQty;
    }

    /**
     * [set] SORTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量
     * @param sortedQty The value of the column 'SORTED_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setSortedQty(Long sortedQty) {
        registerModifiedProperty("sortedQty");
        _sortedQty = sortedQty;
    }

    /**
     * [get] SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷実績数量
     * @return The value of the column 'SHIPPED_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippedQty() {
        checkSpecifiedProperty("shippedQty");
        return _shippedQty;
    }

    /**
     * [set] SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷実績数量
     * @param shippedQty The value of the column 'SHIPPED_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setShippedQty(Long shippedQty) {
        registerModifiedProperty("shippedQty");
        _shippedQty = shippedQty;
    }

    /**
     * [get] PICK_USER_CD: {varchar(30)} <br>
     * ピッキング担当者
     * @return The value of the column 'PICK_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickUserCd() {
        checkSpecifiedProperty("pickUserCd");
        return convertEmptyToNull(_pickUserCd);
    }

    /**
     * [set] PICK_USER_CD: {varchar(30)} <br>
     * ピッキング担当者
     * @param pickUserCd The value of the column 'PICK_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickUserCd(String pickUserCd) {
        registerModifiedProperty("pickUserCd");
        _pickUserCd = pickUserCd;
    }

    /**
     * [get] LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * 山出しリスト出力済区分
     * @return The value of the column 'LABEL_PRINTED_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getLabelPrintedFlg() {
        checkSpecifiedProperty("labelPrintedFlg");
        return _labelPrintedFlg;
    }

    /**
     * [set] LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * 山出しリスト出力済区分
     * @param labelPrintedFlg The value of the column 'LABEL_PRINTED_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLabelPrintedFlg(Long labelPrintedFlg) {
        registerModifiedProperty("labelPrintedFlg");
        _labelPrintedFlg = labelPrintedFlg;
    }

    /**
     * [get] MONTH_FLG: {varchar(30)} <br>
     * 月替りデ変区分
     * @return The value of the column 'MONTH_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMonthFlg() {
        checkSpecifiedProperty("monthFlg");
        return convertEmptyToNull(_monthFlg);
    }

    /**
     * [set] MONTH_FLG: {varchar(30)} <br>
     * 月替りデ変区分
     * @param monthFlg The value of the column 'MONTH_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMonthFlg(String monthFlg) {
        registerModifiedProperty("monthFlg");
        _monthFlg = monthFlg;
    }

    /**
     * [get] PL_BATCH_KEY: {IX, bigint(19)} <br>
     * 山出しリストバッチキー
     * @return The value of the column 'PL_BATCH_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlBatchKey() {
        checkSpecifiedProperty("plBatchKey");
        return _plBatchKey;
    }

    /**
     * [set] PL_BATCH_KEY: {IX, bigint(19)} <br>
     * 山出しリストバッチキー
     * @param plBatchKey The value of the column 'PL_BATCH_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlBatchKey(Long plBatchKey) {
        registerModifiedProperty("plBatchKey");
        _plBatchKey = plBatchKey;
    }

    /**
     * [get] WORKALLOCATENAME: {varchar(255)} <br>
     * 作業割付名称
     * @return The value of the column 'WORKALLOCATENAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkallocatename() {
        checkSpecifiedProperty("workallocatename");
        return convertEmptyToNull(_workallocatename);
    }

    /**
     * [set] WORKALLOCATENAME: {varchar(255)} <br>
     * 作業割付名称
     * @param workallocatename The value of the column 'WORKALLOCATENAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkallocatename(String workallocatename) {
        registerModifiedProperty("workallocatename");
        _workallocatename = workallocatename;
    }

    /**
     * [get] ALERTFLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング不足フラグ
     * @return The value of the column 'ALERTFLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getAlertflg() {
        checkSpecifiedProperty("alertflg");
        return _alertflg;
    }

    /**
     * [set] ALERTFLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング不足フラグ
     * @param alertflg The value of the column 'ALERTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setAlertflg(Long alertflg) {
        registerModifiedProperty("alertflg");
        _alertflg = alertflg;
    }

    /**
     * [get] REVERSE_FLG: {char(1)} <br>
     * 逆転フラグ
     * @return The value of the column 'REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getReverseFlg() {
        checkSpecifiedProperty("reverseFlg");
        return convertEmptyToNull(_reverseFlg);
    }

    /**
     * [set] REVERSE_FLG: {char(1)} <br>
     * 逆転フラグ
     * @param reverseFlg The value of the column 'REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReverseFlg(String reverseFlg) {
        registerModifiedProperty("reverseFlg");
        _reverseFlg = reverseFlg;
    }

    /**
     * [get] REVERSE_LIST_OUTPUT__FLG: {char(1)} <br>
     * 逆転リスト出力済フラグ
     * @return The value of the column 'REVERSE_LIST_OUTPUT__FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getReverseListOutputFlg() {
        checkSpecifiedProperty("reverseListOutputFlg");
        return convertEmptyToNull(_reverseListOutputFlg);
    }

    /**
     * [set] REVERSE_LIST_OUTPUT__FLG: {char(1)} <br>
     * 逆転リスト出力済フラグ
     * @param reverseListOutputFlg The value of the column 'REVERSE_LIST_OUTPUT__FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReverseListOutputFlg(String reverseListOutputFlg) {
        registerModifiedProperty("reverseListOutputFlg");
        _reverseListOutputFlg = reverseListOutputFlg;
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
