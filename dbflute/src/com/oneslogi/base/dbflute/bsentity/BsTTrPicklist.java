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
 * The entity of T_TR_PICKLIST as TABLE. <br>
 * 山出しリスト
 * <pre>
 * [primary-key]
 *     T_TR_PICKLIST_ID
 *
 * [column]
 *     T_TR_PICKLIST_ID, TRPICKDETAIL_ID, PICK_LIST_KEY, PICKLIST_G_NO, PL_BATCH_KEY, STOCK_ID, LOT_ID, PICKLIST_DATE, PRODUCT_CD, MANUFACTURE_DATE, DESIGN_FLG, MONTH_FLG, DAILY_FLG, FRONT_RACK_FLG, LOC_FLG, STD_DIF_FLG, ORDER_TYPE, SHIP_TOSUB, RMA_NO, SOTED_LOCATION_ID, SOTED_LOCATION_CD, ALLOC_LOCATION_ID, ALLOC_LOCATION_CD, ROOT_OUT_SEQ, DIRECTION_COMMENT, QTY_CASE, QTY_BOWL, QTY, HT_QTY_CASE, HT_QTY_BOWL, HT_QTY, COMPLETE_STS, START_TIME, END_TIME, USER_CD, SUPPLIERCD, SCHDATE, CASE_OUT_NUMBER, CENTER_ID, CLIENT_ID, LINE_BLOCK, SORTING_RACK_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_TR_PICKLIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRPICKDETAIL
 *
 * [referrer table]
 *     T_TRPICKLISTEXP
 *
 * [foreign property]
 *     tTrpickdetail
 *
 * [referrer property]
 *     tTrpicklistexpList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tTrPicklistId = entity.getTTrPicklistId();
 * Long trpickdetailId = entity.getTrpickdetailId();
 * Long pickListKey = entity.getPickListKey();
 * Long picklistGNo = entity.getPicklistGNo();
 * Long plBatchKey = entity.getPlBatchKey();
 * Long stockId = entity.getStockId();
 * Long lotId = entity.getLotId();
 * String picklistDate = entity.getPicklistDate();
 * String productCd = entity.getProductCd();
 * String manufactureDate = entity.getManufactureDate();
 * String designFlg = entity.getDesignFlg();
 * String monthFlg = entity.getMonthFlg();
 * String dailyFlg = entity.getDailyFlg();
 * String frontRackFlg = entity.getFrontRackFlg();
 * String locFlg = entity.getLocFlg();
 * String stdDifFlg = entity.getStdDifFlg();
 * String orderType = entity.getOrderType();
 * String shipTosub = entity.getShipTosub();
 * String rmaNo = entity.getRmaNo();
 * Long sotedLocationId = entity.getSotedLocationId();
 * String sotedLocationCd = entity.getSotedLocationCd();
 * Long allocLocationId = entity.getAllocLocationId();
 * String allocLocationCd = entity.getAllocLocationCd();
 * Long rootOutSeq = entity.getRootOutSeq();
 * String directionComment = entity.getDirectionComment();
 * Long qtyCase = entity.getQtyCase();
 * Long qtyBowl = entity.getQtyBowl();
 * Long qty = entity.getQty();
 * Long htQtyCase = entity.getHtQtyCase();
 * Long htQtyBowl = entity.getHtQtyBowl();
 * Long htQty = entity.getHtQty();
 * String completeSts = entity.getCompleteSts();
 * java.sql.Timestamp startTime = entity.getStartTime();
 * java.sql.Timestamp endTime = entity.getEndTime();
 * String userCd = entity.getUserCd();
 * String suppliercd = entity.getSuppliercd();
 * String schdate = entity.getSchdate();
 * Long caseOutNumber = entity.getCaseOutNumber();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String lineBlock = entity.getLineBlock();
 * String sortingRackNo = entity.getSortingRackNo();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTTrPicklistId(tTrPicklistId);
 * entity.setTrpickdetailId(trpickdetailId);
 * entity.setPickListKey(pickListKey);
 * entity.setPicklistGNo(picklistGNo);
 * entity.setPlBatchKey(plBatchKey);
 * entity.setStockId(stockId);
 * entity.setLotId(lotId);
 * entity.setPicklistDate(picklistDate);
 * entity.setProductCd(productCd);
 * entity.setManufactureDate(manufactureDate);
 * entity.setDesignFlg(designFlg);
 * entity.setMonthFlg(monthFlg);
 * entity.setDailyFlg(dailyFlg);
 * entity.setFrontRackFlg(frontRackFlg);
 * entity.setLocFlg(locFlg);
 * entity.setStdDifFlg(stdDifFlg);
 * entity.setOrderType(orderType);
 * entity.setShipTosub(shipTosub);
 * entity.setRmaNo(rmaNo);
 * entity.setSotedLocationId(sotedLocationId);
 * entity.setSotedLocationCd(sotedLocationCd);
 * entity.setAllocLocationId(allocLocationId);
 * entity.setAllocLocationCd(allocLocationCd);
 * entity.setRootOutSeq(rootOutSeq);
 * entity.setDirectionComment(directionComment);
 * entity.setQtyCase(qtyCase);
 * entity.setQtyBowl(qtyBowl);
 * entity.setQty(qty);
 * entity.setHtQtyCase(htQtyCase);
 * entity.setHtQtyBowl(htQtyBowl);
 * entity.setHtQty(htQty);
 * entity.setCompleteSts(completeSts);
 * entity.setStartTime(startTime);
 * entity.setEndTime(endTime);
 * entity.setUserCd(userCd);
 * entity.setSuppliercd(suppliercd);
 * entity.setSchdate(schdate);
 * entity.setCaseOutNumber(caseOutNumber);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setLineBlock(lineBlock);
 * entity.setSortingRackNo(sortingRackNo);
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
public abstract class BsTTrPicklist extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _tTrPicklistId;

    /** TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL} */
    protected Long _trpickdetailId;

    /** PICK_LIST_KEY: {NotNull, bigint(19)} */
    protected Long _pickListKey;

    /** PICKLIST_G_NO: {NotNull, bigint(19)} */
    protected Long _picklistGNo;

    /** PL_BATCH_KEY: {IX, NotNull, bigint(19)} */
    protected Long _plBatchKey;

    /** STOCK_ID: {NotNull, bigint(19)} */
    protected Long _stockId;

    /** LOT_ID: {bigint(19)} */
    protected Long _lotId;

    /** PICKLIST_DATE: {IX, NotNull, varchar(8)} */
    protected String _picklistDate;

    /** PRODUCT_CD: {IX, NotNull, varchar(30)} */
    protected String _productCd;

    /** MANUFACTURE_DATE: {IX, NotNull, varchar(8)} */
    protected String _manufactureDate;

    /** DESIGN_FLG: {NotNull, varchar(30)} */
    protected String _designFlg;

    /** MONTH_FLG: {varchar(30)} */
    protected String _monthFlg;

    /** DAILY_FLG: {varchar(30)} */
    protected String _dailyFlg;

    /** FRONT_RACK_FLG: {varchar(30)} */
    protected String _frontRackFlg;

    /** LOC_FLG: {varchar(30)} */
    protected String _locFlg;

    /** STD_DIF_FLG: {varchar(30)} */
    protected String _stdDifFlg;

    /** ORDER_TYPE: {IX, varchar(30)} */
    protected String _orderType;

    /** SHIP_TOSUB: {varchar(30)} */
    protected String _shipTosub;

    /** RMA_NO: {varchar(30)} */
    protected String _rmaNo;

    /** SOTED_LOCATION_ID: {bigint(19)} */
    protected Long _sotedLocationId;

    /** SOTED_LOCATION_CD: {varchar(30)} */
    protected String _sotedLocationCd;

    /** ALLOC_LOCATION_ID: {bigint(19)} */
    protected Long _allocLocationId;

    /** ALLOC_LOCATION_CD: {varchar(30)} */
    protected String _allocLocationCd;

    /** ROOT_OUT_SEQ: {bigint(19)} */
    protected Long _rootOutSeq;

    /** DIRECTION_COMMENT: {varchar(30)} */
    protected String _directionComment;

    /** QTY_CASE: {NotNull, bigint(19)} */
    protected Long _qtyCase;

    /** QTY_BOWL: {NotNull, bigint(19)} */
    protected Long _qtyBowl;

    /** QTY: {NotNull, bigint(19)} */
    protected Long _qty;

    /** HT_QTY_CASE: {NotNull, bigint(19)} */
    protected Long _htQtyCase;

    /** HT_QTY_BOWL: {NotNull, bigint(19)} */
    protected Long _htQtyBowl;

    /** HT_QTY: {NotNull, bigint(19)} */
    protected Long _htQty;

    /** COMPLETE_STS: {varchar(30)} */
    protected String _completeSts;

    /** START_TIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _startTime;

    /** END_TIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _endTime;

    /** USER_CD: {varchar(30)} */
    protected String _userCd;

    /** SUPPLIERCD: {varchar(30)} */
    protected String _suppliercd;

    /** SCHDATE: {varchar(8)} */
    protected String _schdate;

    /** CASE_OUT_NUMBER: {bigint(19)} */
    protected Long _caseOutNumber;

    /** CENTER_ID: {IX, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** LINE_BLOCK: {varchar(30)} */
    protected String _lineBlock;

    /** SORTING_RACK_NO: {varchar(30)} */
    protected String _sortingRackNo;

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
        return "T_TR_PICKLIST";
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
        if (_tTrPicklistId == null) { return false; }
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
    /** T_TRPICKDETAIL by my TRPICKDETAIL_ID, named 'TTrpickdetail'. */
    protected TTrpickdetail _tTrpickdetail;

    /**
     * [get] T_TRPICKDETAIL by my TRPICKDETAIL_ID, named 'TTrpickdetail'. <br>
     * @return The entity of foreign property 'TTrpickdetail'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TTrpickdetail getTTrpickdetail() {
        return _tTrpickdetail;
    }

    /**
     * [set] T_TRPICKDETAIL by my TRPICKDETAIL_ID, named 'TTrpickdetail'.
     * @param tTrpickdetail The entity of foreign property 'TTrpickdetail'. (NullAllowed)
     */
    public void setTTrpickdetail(TTrpickdetail tTrpickdetail) {
        _tTrpickdetail = tTrpickdetail;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_TRPICKLISTEXP by T_TRPICKLIST_ID, named 'TTrpicklistexpList'. */
    protected List<TTrpicklistexp> _tTrpicklistexpList;

    /**
     * [get] T_TRPICKLISTEXP by T_TRPICKLIST_ID, named 'TTrpicklistexpList'.
     * @return The entity list of referrer property 'TTrpicklistexpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrpicklistexp> getTTrpicklistexpList() {
        if (_tTrpicklistexpList == null) { _tTrpicklistexpList = newReferrerList(); }
        return _tTrpicklistexpList;
    }

    /**
     * [set] T_TRPICKLISTEXP by T_TRPICKLIST_ID, named 'TTrpicklistexpList'.
     * @param tTrpicklistexpList The entity list of referrer property 'TTrpicklistexpList'. (NullAllowed)
     */
    public void setTTrpicklistexpList(List<TTrpicklistexp> tTrpicklistexpList) {
        _tTrpicklistexpList = tTrpicklistexpList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrPicklist) {
            BsTTrPicklist other = (BsTTrPicklist)obj;
            if (!xSV(_tTrPicklistId, other._tTrPicklistId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tTrPicklistId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tTrpickdetail != null)
        { sb.append(li).append(xbRDS(_tTrpickdetail, "tTrpickdetail")); }
        if (_tTrpicklistexpList != null) { for (TTrpicklistexp et : _tTrpicklistexpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrpicklistexpList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tTrPicklistId));
        sb.append(dm).append(xfND(_trpickdetailId));
        sb.append(dm).append(xfND(_pickListKey));
        sb.append(dm).append(xfND(_picklistGNo));
        sb.append(dm).append(xfND(_plBatchKey));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_picklistDate));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_manufactureDate));
        sb.append(dm).append(xfND(_designFlg));
        sb.append(dm).append(xfND(_monthFlg));
        sb.append(dm).append(xfND(_dailyFlg));
        sb.append(dm).append(xfND(_frontRackFlg));
        sb.append(dm).append(xfND(_locFlg));
        sb.append(dm).append(xfND(_stdDifFlg));
        sb.append(dm).append(xfND(_orderType));
        sb.append(dm).append(xfND(_shipTosub));
        sb.append(dm).append(xfND(_rmaNo));
        sb.append(dm).append(xfND(_sotedLocationId));
        sb.append(dm).append(xfND(_sotedLocationCd));
        sb.append(dm).append(xfND(_allocLocationId));
        sb.append(dm).append(xfND(_allocLocationCd));
        sb.append(dm).append(xfND(_rootOutSeq));
        sb.append(dm).append(xfND(_directionComment));
        sb.append(dm).append(xfND(_qtyCase));
        sb.append(dm).append(xfND(_qtyBowl));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_htQtyCase));
        sb.append(dm).append(xfND(_htQtyBowl));
        sb.append(dm).append(xfND(_htQty));
        sb.append(dm).append(xfND(_completeSts));
        sb.append(dm).append(xfND(_startTime));
        sb.append(dm).append(xfND(_endTime));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_caseOutNumber));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_sortingRackNo));
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
        if (_tTrpickdetail != null)
        { sb.append(dm).append("tTrpickdetail"); }
        if (_tTrpicklistexpList != null && !_tTrpicklistexpList.isEmpty())
        { sb.append(dm).append("tTrpicklistexpList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrPicklist clone() {
        return (TTrPicklist)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出しリストID
     * @return The value of the column 'T_TR_PICKLIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTTrPicklistId() {
        checkSpecifiedProperty("TTrPicklistId");
        return _tTrPicklistId;
    }

    /**
     * [set] T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出しリストID
     * @param tTrPicklistId The value of the column 'T_TR_PICKLIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTTrPicklistId(Long tTrPicklistId) {
        registerModifiedProperty("TTrPicklistId");
        _tTrPicklistId = tTrPicklistId;
    }

    /**
     * [get] TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL} <br>
     * 山出し指示詳細ボディID
     * @return The value of the column 'TRPICKDETAIL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrpickdetailId() {
        checkSpecifiedProperty("trpickdetailId");
        return _trpickdetailId;
    }

    /**
     * [set] TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL} <br>
     * 山出し指示詳細ボディID
     * @param trpickdetailId The value of the column 'TRPICKDETAIL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrpickdetailId(Long trpickdetailId) {
        registerModifiedProperty("trpickdetailId");
        _trpickdetailId = trpickdetailId;
    }

    /**
     * [get] PICK_LIST_KEY: {NotNull, bigint(19)} <br>
     * 山出しリストNo.
     * @return The value of the column 'PICK_LIST_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickListKey() {
        checkSpecifiedProperty("pickListKey");
        return _pickListKey;
    }

    /**
     * [set] PICK_LIST_KEY: {NotNull, bigint(19)} <br>
     * 山出しリストNo.
     * @param pickListKey The value of the column 'PICK_LIST_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setPickListKey(Long pickListKey) {
        registerModifiedProperty("pickListKey");
        _pickListKey = pickListKey;
    }

    /**
     * [get] PICKLIST_G_NO: {NotNull, bigint(19)} <br>
     * 山出しリスト明細行No.
     * @return The value of the column 'PICKLIST_G_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getPicklistGNo() {
        checkSpecifiedProperty("picklistGNo");
        return _picklistGNo;
    }

    /**
     * [set] PICKLIST_G_NO: {NotNull, bigint(19)} <br>
     * 山出しリスト明細行No.
     * @param picklistGNo The value of the column 'PICKLIST_G_NO'. (basically NotNull if update: for the constraint)
     */
    public void setPicklistGNo(Long picklistGNo) {
        registerModifiedProperty("picklistGNo");
        _picklistGNo = picklistGNo;
    }

    /**
     * [get] PL_BATCH_KEY: {IX, NotNull, bigint(19)} <br>
     * 山出しリストバッチキー
     * @return The value of the column 'PL_BATCH_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPlBatchKey() {
        checkSpecifiedProperty("plBatchKey");
        return _plBatchKey;
    }

    /**
     * [set] PL_BATCH_KEY: {IX, NotNull, bigint(19)} <br>
     * 山出しリストバッチキー
     * @param plBatchKey The value of the column 'PL_BATCH_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setPlBatchKey(Long plBatchKey) {
        registerModifiedProperty("plBatchKey");
        _plBatchKey = plBatchKey;
    }

    /**
     * [get] STOCK_ID: {NotNull, bigint(19)} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {NotNull, bigint(19)} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] PICKLIST_DATE: {IX, NotNull, varchar(8)} <br>
     * 山出し日
     * @return The value of the column 'PICKLIST_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getPicklistDate() {
        checkSpecifiedProperty("picklistDate");
        return convertEmptyToNull(_picklistDate);
    }

    /**
     * [set] PICKLIST_DATE: {IX, NotNull, varchar(8)} <br>
     * 山出し日
     * @param picklistDate The value of the column 'PICKLIST_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setPicklistDate(String picklistDate) {
        registerModifiedProperty("picklistDate");
        _picklistDate = picklistDate;
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
     * [get] MANUFACTURE_DATE: {IX, NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getManufactureDate() {
        checkSpecifiedProperty("manufactureDate");
        return convertEmptyToNull(_manufactureDate);
    }

    /**
     * [set] MANUFACTURE_DATE: {IX, NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setManufactureDate(String manufactureDate) {
        registerModifiedProperty("manufactureDate");
        _manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_FLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDesignFlg() {
        checkSpecifiedProperty("designFlg");
        return convertEmptyToNull(_designFlg);
    }

    /**
     * [set] DESIGN_FLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDesignFlg(String designFlg) {
        registerModifiedProperty("designFlg");
        _designFlg = designFlg;
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
     * [get] DAILY_FLG: {varchar(30)} <br>
     * 日替わり区分
     * @return The value of the column 'DAILY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDailyFlg() {
        checkSpecifiedProperty("dailyFlg");
        return convertEmptyToNull(_dailyFlg);
    }

    /**
     * [set] DAILY_FLG: {varchar(30)} <br>
     * 日替わり区分
     * @param dailyFlg The value of the column 'DAILY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDailyFlg(String dailyFlg) {
        registerModifiedProperty("dailyFlg");
        _dailyFlg = dailyFlg;
    }

    /**
     * [get] FRONT_RACK_FLG: {varchar(30)} <br>
     * フロントラック区分
     * @return The value of the column 'FRONT_RACK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFrontRackFlg() {
        checkSpecifiedProperty("frontRackFlg");
        return convertEmptyToNull(_frontRackFlg);
    }

    /**
     * [set] FRONT_RACK_FLG: {varchar(30)} <br>
     * フロントラック区分
     * @param frontRackFlg The value of the column 'FRONT_RACK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFrontRackFlg(String frontRackFlg) {
        registerModifiedProperty("frontRackFlg");
        _frontRackFlg = frontRackFlg;
    }

    /**
     * [get] LOC_FLG: {varchar(30)} <br>
     * ロケ区分
     * @return The value of the column 'LOC_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocFlg() {
        checkSpecifiedProperty("locFlg");
        return convertEmptyToNull(_locFlg);
    }

    /**
     * [set] LOC_FLG: {varchar(30)} <br>
     * ロケ区分
     * @param locFlg The value of the column 'LOC_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocFlg(String locFlg) {
        registerModifiedProperty("locFlg");
        _locFlg = locFlg;
    }

    /**
     * [get] STD_DIF_FLG: {varchar(30)} <br>
     * 通常異型品区分
     * @return The value of the column 'STD_DIF_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStdDifFlg() {
        checkSpecifiedProperty("stdDifFlg");
        return convertEmptyToNull(_stdDifFlg);
    }

    /**
     * [set] STD_DIF_FLG: {varchar(30)} <br>
     * 通常異型品区分
     * @param stdDifFlg The value of the column 'STD_DIF_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStdDifFlg(String stdDifFlg) {
        registerModifiedProperty("stdDifFlg");
        _stdDifFlg = stdDifFlg;
    }

    /**
     * [get] ORDER_TYPE: {IX, varchar(30)} <br>
     * 補充区分
     * @return The value of the column 'ORDER_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderType() {
        checkSpecifiedProperty("orderType");
        return convertEmptyToNull(_orderType);
    }

    /**
     * [set] ORDER_TYPE: {IX, varchar(30)} <br>
     * 補充区分
     * @param orderType The value of the column 'ORDER_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderType(String orderType) {
        registerModifiedProperty("orderType");
        _orderType = orderType;
    }

    /**
     * [get] SHIP_TOSUB: {varchar(30)} <br>
     * ソート用補充区分
     * @return The value of the column 'SHIP_TOSUB'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipTosub() {
        checkSpecifiedProperty("shipTosub");
        return convertEmptyToNull(_shipTosub);
    }

    /**
     * [set] SHIP_TOSUB: {varchar(30)} <br>
     * ソート用補充区分
     * @param shipTosub The value of the column 'SHIP_TOSUB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipTosub(String shipTosub) {
        registerModifiedProperty("shipTosub");
        _shipTosub = shipTosub;
    }

    /**
     * [get] RMA_NO: {varchar(30)} <br>
     * 補充先ソートキー
     * @return The value of the column 'RMA_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmaNo() {
        checkSpecifiedProperty("rmaNo");
        return convertEmptyToNull(_rmaNo);
    }

    /**
     * [set] RMA_NO: {varchar(30)} <br>
     * 補充先ソートキー
     * @param rmaNo The value of the column 'RMA_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmaNo(String rmaNo) {
        registerModifiedProperty("rmaNo");
        _rmaNo = rmaNo;
    }

    /**
     * [get] SOTED_LOCATION_ID: {bigint(19)} <br>
     * 仕分ロケID
     * @return The value of the column 'SOTED_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSotedLocationId() {
        checkSpecifiedProperty("sotedLocationId");
        return _sotedLocationId;
    }

    /**
     * [set] SOTED_LOCATION_ID: {bigint(19)} <br>
     * 仕分ロケID
     * @param sotedLocationId The value of the column 'SOTED_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedLocationId(Long sotedLocationId) {
        registerModifiedProperty("sotedLocationId");
        _sotedLocationId = sotedLocationId;
    }

    /**
     * [get] SOTED_LOCATION_CD: {varchar(30)} <br>
     * 仕分ロケ
     * @return The value of the column 'SOTED_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotedLocationCd() {
        checkSpecifiedProperty("sotedLocationCd");
        return convertEmptyToNull(_sotedLocationCd);
    }

    /**
     * [set] SOTED_LOCATION_CD: {varchar(30)} <br>
     * 仕分ロケ
     * @param sotedLocationCd The value of the column 'SOTED_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedLocationCd(String sotedLocationCd) {
        registerModifiedProperty("sotedLocationCd");
        _sotedLocationCd = sotedLocationCd;
    }

    /**
     * [get] ALLOC_LOCATION_ID: {bigint(19)} <br>
     * 引当ロケID
     * @return The value of the column 'ALLOC_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocLocationId() {
        checkSpecifiedProperty("allocLocationId");
        return _allocLocationId;
    }

    /**
     * [set] ALLOC_LOCATION_ID: {bigint(19)} <br>
     * 引当ロケID
     * @param allocLocationId The value of the column 'ALLOC_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocLocationId(Long allocLocationId) {
        registerModifiedProperty("allocLocationId");
        _allocLocationId = allocLocationId;
    }

    /**
     * [get] ALLOC_LOCATION_CD: {varchar(30)} <br>
     * 引当ロケ
     * @return The value of the column 'ALLOC_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocLocationCd() {
        checkSpecifiedProperty("allocLocationCd");
        return convertEmptyToNull(_allocLocationCd);
    }

    /**
     * [set] ALLOC_LOCATION_CD: {varchar(30)} <br>
     * 引当ロケ
     * @param allocLocationCd The value of the column 'ALLOC_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocLocationCd(String allocLocationCd) {
        registerModifiedProperty("allocLocationCd");
        _allocLocationCd = allocLocationCd;
    }

    /**
     * [get] ROOT_OUT_SEQ: {bigint(19)} <br>
     * 山出しルート順
     * @return The value of the column 'ROOT_OUT_SEQ'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRootOutSeq() {
        checkSpecifiedProperty("rootOutSeq");
        return _rootOutSeq;
    }

    /**
     * [set] ROOT_OUT_SEQ: {bigint(19)} <br>
     * 山出しルート順
     * @param rootOutSeq The value of the column 'ROOT_OUT_SEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRootOutSeq(Long rootOutSeq) {
        registerModifiedProperty("rootOutSeq");
        _rootOutSeq = rootOutSeq;
    }

    /**
     * [get] DIRECTION_COMMENT: {varchar(30)} <br>
     * コメント
     * @return The value of the column 'DIRECTION_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionComment() {
        checkSpecifiedProperty("directionComment");
        return convertEmptyToNull(_directionComment);
    }

    /**
     * [set] DIRECTION_COMMENT: {varchar(30)} <br>
     * コメント
     * @param directionComment The value of the column 'DIRECTION_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionComment(String directionComment) {
        registerModifiedProperty("directionComment");
        _directionComment = directionComment;
    }

    /**
     * [get] QTY_CASE: {NotNull, bigint(19)} <br>
     * 指示数量(ケース)
     * @return The value of the column 'QTY_CASE'. (basically NotNull if selected: for the constraint)
     */
    public Long getQtyCase() {
        checkSpecifiedProperty("qtyCase");
        return _qtyCase;
    }

    /**
     * [set] QTY_CASE: {NotNull, bigint(19)} <br>
     * 指示数量(ケース)
     * @param qtyCase The value of the column 'QTY_CASE'. (basically NotNull if update: for the constraint)
     */
    public void setQtyCase(Long qtyCase) {
        registerModifiedProperty("qtyCase");
        _qtyCase = qtyCase;
    }

    /**
     * [get] QTY_BOWL: {NotNull, bigint(19)} <br>
     * 指示数量(カートン)
     * @return The value of the column 'QTY_BOWL'. (basically NotNull if selected: for the constraint)
     */
    public Long getQtyBowl() {
        checkSpecifiedProperty("qtyBowl");
        return _qtyBowl;
    }

    /**
     * [set] QTY_BOWL: {NotNull, bigint(19)} <br>
     * 指示数量(カートン)
     * @param qtyBowl The value of the column 'QTY_BOWL'. (basically NotNull if update: for the constraint)
     */
    public void setQtyBowl(Long qtyBowl) {
        registerModifiedProperty("qtyBowl");
        _qtyBowl = qtyBowl;
    }

    /**
     * [get] QTY: {NotNull, bigint(19)} <br>
     * 指示数量(個装換算)
     * @return The value of the column 'QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19)} <br>
     * 指示数量(個装換算)
     * @param qty The value of the column 'QTY'. (basically NotNull if update: for the constraint)
     */
    public void setQty(Long qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] HT_QTY_CASE: {NotNull, bigint(19)} <br>
     * 実績数量(ケース)
     * @return The value of the column 'HT_QTY_CASE'. (basically NotNull if selected: for the constraint)
     */
    public Long getHtQtyCase() {
        checkSpecifiedProperty("htQtyCase");
        return _htQtyCase;
    }

    /**
     * [set] HT_QTY_CASE: {NotNull, bigint(19)} <br>
     * 実績数量(ケース)
     * @param htQtyCase The value of the column 'HT_QTY_CASE'. (basically NotNull if update: for the constraint)
     */
    public void setHtQtyCase(Long htQtyCase) {
        registerModifiedProperty("htQtyCase");
        _htQtyCase = htQtyCase;
    }

    /**
     * [get] HT_QTY_BOWL: {NotNull, bigint(19)} <br>
     * 実績数量(カートン)
     * @return The value of the column 'HT_QTY_BOWL'. (basically NotNull if selected: for the constraint)
     */
    public Long getHtQtyBowl() {
        checkSpecifiedProperty("htQtyBowl");
        return _htQtyBowl;
    }

    /**
     * [set] HT_QTY_BOWL: {NotNull, bigint(19)} <br>
     * 実績数量(カートン)
     * @param htQtyBowl The value of the column 'HT_QTY_BOWL'. (basically NotNull if update: for the constraint)
     */
    public void setHtQtyBowl(Long htQtyBowl) {
        registerModifiedProperty("htQtyBowl");
        _htQtyBowl = htQtyBowl;
    }

    /**
     * [get] HT_QTY: {NotNull, bigint(19)} <br>
     * 実績数量(個装換算)
     * @return The value of the column 'HT_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getHtQty() {
        checkSpecifiedProperty("htQty");
        return _htQty;
    }

    /**
     * [set] HT_QTY: {NotNull, bigint(19)} <br>
     * 実績数量(個装換算)
     * @param htQty The value of the column 'HT_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setHtQty(Long htQty) {
        registerModifiedProperty("htQty");
        _htQty = htQty;
    }

    /**
     * [get] COMPLETE_STS: {varchar(30)} <br>
     * 完了ステータス
     * @return The value of the column 'COMPLETE_STS'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompleteSts() {
        checkSpecifiedProperty("completeSts");
        return convertEmptyToNull(_completeSts);
    }

    /**
     * [set] COMPLETE_STS: {varchar(30)} <br>
     * 完了ステータス
     * @param completeSts The value of the column 'COMPLETE_STS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompleteSts(String completeSts) {
        registerModifiedProperty("completeSts");
        _completeSts = completeSts;
    }

    /**
     * [get] START_TIME: {datetime2(26, 6)} <br>
     * 開始時刻
     * @return The value of the column 'START_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getStartTime() {
        checkSpecifiedProperty("startTime");
        return _startTime;
    }

    /**
     * [set] START_TIME: {datetime2(26, 6)} <br>
     * 開始時刻
     * @param startTime The value of the column 'START_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartTime(java.sql.Timestamp startTime) {
        registerModifiedProperty("startTime");
        _startTime = startTime;
    }

    /**
     * [get] END_TIME: {datetime2(26, 6)} <br>
     * 終了時刻
     * @return The value of the column 'END_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getEndTime() {
        checkSpecifiedProperty("endTime");
        return _endTime;
    }

    /**
     * [set] END_TIME: {datetime2(26, 6)} <br>
     * 終了時刻
     * @param endTime The value of the column 'END_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEndTime(java.sql.Timestamp endTime) {
        registerModifiedProperty("endTime");
        _endTime = endTime;
    }

    /**
     * [get] USER_CD: {varchar(30)} <br>
     * 作業者
     * @return The value of the column 'USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserCd() {
        checkSpecifiedProperty("userCd");
        return convertEmptyToNull(_userCd);
    }

    /**
     * [set] USER_CD: {varchar(30)} <br>
     * 作業者
     * @param userCd The value of the column 'USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserCd(String userCd) {
        registerModifiedProperty("userCd");
        _userCd = userCd;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 発送元CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchdate() {
        checkSpecifiedProperty("schdate");
        return convertEmptyToNull(_schdate);
    }

    /**
     * [set] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchdate(String schdate) {
        registerModifiedProperty("schdate");
        _schdate = schdate;
    }

    /**
     * [get] CASE_OUT_NUMBER: {bigint(19)} <br>
     * ケースはり紙出力済枚数
     * @return The value of the column 'CASE_OUT_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseOutNumber() {
        checkSpecifiedProperty("caseOutNumber");
        return _caseOutNumber;
    }

    /**
     * [set] CASE_OUT_NUMBER: {bigint(19)} <br>
     * ケースはり紙出力済枚数
     * @param caseOutNumber The value of the column 'CASE_OUT_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutNumber(Long caseOutNumber) {
        registerModifiedProperty("caseOutNumber");
        _caseOutNumber = caseOutNumber;
    }

    /**
     * [get] CENTER_ID: {IX, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * 補充先
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * 補充先
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] SORTING_RACK_NO: {varchar(30)} <br>
     * 仕分ラック番号
     * @return The value of the column 'SORTING_RACK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortingRackNo() {
        checkSpecifiedProperty("sortingRackNo");
        return convertEmptyToNull(_sortingRackNo);
    }

    /**
     * [set] SORTING_RACK_NO: {varchar(30)} <br>
     * 仕分ラック番号
     * @param sortingRackNo The value of the column 'SORTING_RACK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortingRackNo(String sortingRackNo) {
        registerModifiedProperty("sortingRackNo");
        _sortingRackNo = sortingRackNo;
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
