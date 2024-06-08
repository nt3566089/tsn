package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TR_PICKLIST as TABLE. <br>
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
 * [foreign-table]
 *     T_TRPICKDETAIL
 *
 * [referrer-table]
 *     T_TRPICKLISTEXP
 *
 * [foreign-property]
 *     tTrpickdetail
 *
 * [referrer-property]
 *     tTrpicklistexpList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrPicklistDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _tTrPicklistId;

    /** TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL} */
    @JsonKey
    protected Long _trpickdetailId;

    /** PICK_LIST_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pickListKey;

    /** PICKLIST_G_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _picklistGNo;

    /** PL_BATCH_KEY: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _plBatchKey;

    /** STOCK_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _stockId;

    /** LOT_ID: {bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** PICKLIST_DATE: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _picklistDate;

    /** PRODUCT_CD: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** MANUFACTURE_DATE: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _manufactureDate;

    /** DESIGN_FLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _designFlg;

    /** MONTH_FLG: {varchar(30)} */
    @JsonKey
    protected String _monthFlg;

    /** DAILY_FLG: {varchar(30)} */
    @JsonKey
    protected String _dailyFlg;

    /** FRONT_RACK_FLG: {varchar(30)} */
    @JsonKey
    protected String _frontRackFlg;

    /** LOC_FLG: {varchar(30)} */
    @JsonKey
    protected String _locFlg;

    /** STD_DIF_FLG: {varchar(30)} */
    @JsonKey
    protected String _stdDifFlg;

    /** ORDER_TYPE: {IX, varchar(30)} */
    @JsonKey
    protected String _orderType;

    /** SHIP_TOSUB: {varchar(30)} */
    @JsonKey
    protected String _shipTosub;

    /** RMA_NO: {varchar(30)} */
    @JsonKey
    protected String _rmaNo;

    /** SOTED_LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _sotedLocationId;

    /** SOTED_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _sotedLocationCd;

    /** ALLOC_LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _allocLocationId;

    /** ALLOC_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _allocLocationCd;

    /** ROOT_OUT_SEQ: {bigint(19)} */
    @JsonKey
    protected Long _rootOutSeq;

    /** DIRECTION_COMMENT: {varchar(30)} */
    @JsonKey
    protected String _directionComment;

    /** QTY_CASE: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _qtyCase;

    /** QTY_BOWL: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _qtyBowl;

    /** QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _qty;

    /** HT_QTY_CASE: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _htQtyCase;

    /** HT_QTY_BOWL: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _htQtyBowl;

    /** HT_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _htQty;

    /** COMPLETE_STS: {varchar(30)} */
    @JsonKey
    protected String _completeSts;

    /** START_TIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _startTime;

    /** END_TIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _endTime;

    /** USER_CD: {varchar(30)} */
    @JsonKey
    protected String _userCd;

    /** SUPPLIERCD: {varchar(30)} */
    @JsonKey
    protected String _suppliercd;

    /** SCHDATE: {varchar(8)} */
    @JsonKey
    protected String _schdate;

    /** CASE_OUT_NUMBER: {bigint(19)} */
    @JsonKey
    protected Long _caseOutNumber;

    /** CENTER_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** LINE_BLOCK: {varchar(30)} */
    @JsonKey
    protected String _lineBlock;

    /** SORTING_RACK_NO: {varchar(30)} */
    @JsonKey
    protected String _sortingRackNo;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrPicklistDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected TTrpickdetailDto _tTrpickdetail;

    public TTrpickdetailDto getTTrpickdetail() {
        return _tTrpickdetail;
    }

    public void setTTrpickdetail(TTrpickdetailDto tTrpickdetail) {
        this._tTrpickdetail = tTrpickdetail;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TTrpicklistexpDto> _tTrpicklistexpList;

    public List<TTrpicklistexpDto> getTTrpicklistexpList() {
        if (_tTrpicklistexpList == null) { _tTrpicklistexpList = new ArrayList<TTrpicklistexpDto>(); }
        return _tTrpicklistexpList;
    }

    public void setTTrpicklistexpList(List<TTrpicklistexpDto> tTrpicklistexpList) {
        this._tTrpicklistexpList = tTrpicklistexpList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrPicklistDto)) { return false; }
        final BsTTrPicklistDto otherEntity = (BsTTrPicklistDto)other;
        if (!helpComparingValue(getTTrPicklistId(), otherEntity.getTTrPicklistId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TR_PICKLIST");
        result = xCH(result, getTTrPicklistId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getTTrPicklistId());
        sb.append(c).append(getTrpickdetailId());
        sb.append(c).append(getPickListKey());
        sb.append(c).append(getPicklistGNo());
        sb.append(c).append(getPlBatchKey());
        sb.append(c).append(getStockId());
        sb.append(c).append(getLotId());
        sb.append(c).append(getPicklistDate());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getManufactureDate());
        sb.append(c).append(getDesignFlg());
        sb.append(c).append(getMonthFlg());
        sb.append(c).append(getDailyFlg());
        sb.append(c).append(getFrontRackFlg());
        sb.append(c).append(getLocFlg());
        sb.append(c).append(getStdDifFlg());
        sb.append(c).append(getOrderType());
        sb.append(c).append(getShipTosub());
        sb.append(c).append(getRmaNo());
        sb.append(c).append(getSotedLocationId());
        sb.append(c).append(getSotedLocationCd());
        sb.append(c).append(getAllocLocationId());
        sb.append(c).append(getAllocLocationCd());
        sb.append(c).append(getRootOutSeq());
        sb.append(c).append(getDirectionComment());
        sb.append(c).append(getQtyCase());
        sb.append(c).append(getQtyBowl());
        sb.append(c).append(getQty());
        sb.append(c).append(getHtQtyCase());
        sb.append(c).append(getHtQtyBowl());
        sb.append(c).append(getHtQty());
        sb.append(c).append(getCompleteSts());
        sb.append(c).append(getStartTime());
        sb.append(c).append(getEndTime());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getSchdate());
        sb.append(c).append(getCaseOutNumber());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getSortingRackNo());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出しリストID
     * @return The value of the column 'T_TR_PICKLIST_ID'. (NullAllowed)
     */
    public Long getTTrPicklistId() {
        return _tTrPicklistId;
    }

    /**
     * [set] T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出しリストID
     * @param tTrPicklistId The value of the column 'T_TR_PICKLIST_ID'. (NullAllowed)
     */
    public void setTTrPicklistId(Long tTrPicklistId) {
        __modifiedProperties.add("TTrPicklistId");
        this._tTrPicklistId = tTrPicklistId;
    }

    /**
     * [get] TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL} <br>
     * 山出し指示詳細ボディID
     * @return The value of the column 'TRPICKDETAIL_ID'. (NullAllowed)
     */
    public Long getTrpickdetailId() {
        return _trpickdetailId;
    }

    /**
     * [set] TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL} <br>
     * 山出し指示詳細ボディID
     * @param trpickdetailId The value of the column 'TRPICKDETAIL_ID'. (NullAllowed)
     */
    public void setTrpickdetailId(Long trpickdetailId) {
        __modifiedProperties.add("trpickdetailId");
        this._trpickdetailId = trpickdetailId;
    }

    /**
     * [get] PICK_LIST_KEY: {NotNull, bigint(19)} <br>
     * 山出しリストNo.
     * @return The value of the column 'PICK_LIST_KEY'. (NullAllowed)
     */
    public Long getPickListKey() {
        return _pickListKey;
    }

    /**
     * [set] PICK_LIST_KEY: {NotNull, bigint(19)} <br>
     * 山出しリストNo.
     * @param pickListKey The value of the column 'PICK_LIST_KEY'. (NullAllowed)
     */
    public void setPickListKey(Long pickListKey) {
        __modifiedProperties.add("pickListKey");
        this._pickListKey = pickListKey;
    }

    /**
     * [get] PICKLIST_G_NO: {NotNull, bigint(19)} <br>
     * 山出しリスト明細行No.
     * @return The value of the column 'PICKLIST_G_NO'. (NullAllowed)
     */
    public Long getPicklistGNo() {
        return _picklistGNo;
    }

    /**
     * [set] PICKLIST_G_NO: {NotNull, bigint(19)} <br>
     * 山出しリスト明細行No.
     * @param picklistGNo The value of the column 'PICKLIST_G_NO'. (NullAllowed)
     */
    public void setPicklistGNo(Long picklistGNo) {
        __modifiedProperties.add("picklistGNo");
        this._picklistGNo = picklistGNo;
    }

    /**
     * [get] PL_BATCH_KEY: {IX, NotNull, bigint(19)} <br>
     * 山出しリストバッチキー
     * @return The value of the column 'PL_BATCH_KEY'. (NullAllowed)
     */
    public Long getPlBatchKey() {
        return _plBatchKey;
    }

    /**
     * [set] PL_BATCH_KEY: {IX, NotNull, bigint(19)} <br>
     * 山出しリストバッチキー
     * @param plBatchKey The value of the column 'PL_BATCH_KEY'. (NullAllowed)
     */
    public void setPlBatchKey(Long plBatchKey) {
        __modifiedProperties.add("plBatchKey");
        this._plBatchKey = plBatchKey;
    }

    /**
     * [get] STOCK_ID: {NotNull, bigint(19)} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {NotNull, bigint(19)} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] PICKLIST_DATE: {IX, NotNull, varchar(8)} <br>
     * 山出し日
     * @return The value of the column 'PICKLIST_DATE'. (NullAllowed)
     */
    public String getPicklistDate() {
        return _picklistDate;
    }

    /**
     * [set] PICKLIST_DATE: {IX, NotNull, varchar(8)} <br>
     * 山出し日
     * @param picklistDate The value of the column 'PICKLIST_DATE'. (NullAllowed)
     */
    public void setPicklistDate(String picklistDate) {
        __modifiedProperties.add("picklistDate");
        this._picklistDate = picklistDate;
    }

    /**
     * [get] PRODUCT_CD: {IX, NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {IX, NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] MANUFACTURE_DATE: {IX, NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getManufactureDate() {
        return _manufactureDate;
    }

    /**
     * [set] MANUFACTURE_DATE: {IX, NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setManufactureDate(String manufactureDate) {
        __modifiedProperties.add("manufactureDate");
        this._manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_FLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public String getDesignFlg() {
        return _designFlg;
    }

    /**
     * [set] DESIGN_FLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public void setDesignFlg(String designFlg) {
        __modifiedProperties.add("designFlg");
        this._designFlg = designFlg;
    }

    /**
     * [get] MONTH_FLG: {varchar(30)} <br>
     * 月替りデ変区分
     * @return The value of the column 'MONTH_FLG'. (NullAllowed)
     */
    public String getMonthFlg() {
        return _monthFlg;
    }

    /**
     * [set] MONTH_FLG: {varchar(30)} <br>
     * 月替りデ変区分
     * @param monthFlg The value of the column 'MONTH_FLG'. (NullAllowed)
     */
    public void setMonthFlg(String monthFlg) {
        __modifiedProperties.add("monthFlg");
        this._monthFlg = monthFlg;
    }

    /**
     * [get] DAILY_FLG: {varchar(30)} <br>
     * 日替わり区分
     * @return The value of the column 'DAILY_FLG'. (NullAllowed)
     */
    public String getDailyFlg() {
        return _dailyFlg;
    }

    /**
     * [set] DAILY_FLG: {varchar(30)} <br>
     * 日替わり区分
     * @param dailyFlg The value of the column 'DAILY_FLG'. (NullAllowed)
     */
    public void setDailyFlg(String dailyFlg) {
        __modifiedProperties.add("dailyFlg");
        this._dailyFlg = dailyFlg;
    }

    /**
     * [get] FRONT_RACK_FLG: {varchar(30)} <br>
     * フロントラック区分
     * @return The value of the column 'FRONT_RACK_FLG'. (NullAllowed)
     */
    public String getFrontRackFlg() {
        return _frontRackFlg;
    }

    /**
     * [set] FRONT_RACK_FLG: {varchar(30)} <br>
     * フロントラック区分
     * @param frontRackFlg The value of the column 'FRONT_RACK_FLG'. (NullAllowed)
     */
    public void setFrontRackFlg(String frontRackFlg) {
        __modifiedProperties.add("frontRackFlg");
        this._frontRackFlg = frontRackFlg;
    }

    /**
     * [get] LOC_FLG: {varchar(30)} <br>
     * ロケ区分
     * @return The value of the column 'LOC_FLG'. (NullAllowed)
     */
    public String getLocFlg() {
        return _locFlg;
    }

    /**
     * [set] LOC_FLG: {varchar(30)} <br>
     * ロケ区分
     * @param locFlg The value of the column 'LOC_FLG'. (NullAllowed)
     */
    public void setLocFlg(String locFlg) {
        __modifiedProperties.add("locFlg");
        this._locFlg = locFlg;
    }

    /**
     * [get] STD_DIF_FLG: {varchar(30)} <br>
     * 通常異型品区分
     * @return The value of the column 'STD_DIF_FLG'. (NullAllowed)
     */
    public String getStdDifFlg() {
        return _stdDifFlg;
    }

    /**
     * [set] STD_DIF_FLG: {varchar(30)} <br>
     * 通常異型品区分
     * @param stdDifFlg The value of the column 'STD_DIF_FLG'. (NullAllowed)
     */
    public void setStdDifFlg(String stdDifFlg) {
        __modifiedProperties.add("stdDifFlg");
        this._stdDifFlg = stdDifFlg;
    }

    /**
     * [get] ORDER_TYPE: {IX, varchar(30)} <br>
     * 補充区分
     * @return The value of the column 'ORDER_TYPE'. (NullAllowed)
     */
    public String getOrderType() {
        return _orderType;
    }

    /**
     * [set] ORDER_TYPE: {IX, varchar(30)} <br>
     * 補充区分
     * @param orderType The value of the column 'ORDER_TYPE'. (NullAllowed)
     */
    public void setOrderType(String orderType) {
        __modifiedProperties.add("orderType");
        this._orderType = orderType;
    }

    /**
     * [get] SHIP_TOSUB: {varchar(30)} <br>
     * ソート用補充区分
     * @return The value of the column 'SHIP_TOSUB'. (NullAllowed)
     */
    public String getShipTosub() {
        return _shipTosub;
    }

    /**
     * [set] SHIP_TOSUB: {varchar(30)} <br>
     * ソート用補充区分
     * @param shipTosub The value of the column 'SHIP_TOSUB'. (NullAllowed)
     */
    public void setShipTosub(String shipTosub) {
        __modifiedProperties.add("shipTosub");
        this._shipTosub = shipTosub;
    }

    /**
     * [get] RMA_NO: {varchar(30)} <br>
     * 補充先ソートキー
     * @return The value of the column 'RMA_NO'. (NullAllowed)
     */
    public String getRmaNo() {
        return _rmaNo;
    }

    /**
     * [set] RMA_NO: {varchar(30)} <br>
     * 補充先ソートキー
     * @param rmaNo The value of the column 'RMA_NO'. (NullAllowed)
     */
    public void setRmaNo(String rmaNo) {
        __modifiedProperties.add("rmaNo");
        this._rmaNo = rmaNo;
    }

    /**
     * [get] SOTED_LOCATION_ID: {bigint(19)} <br>
     * 仕分ロケID
     * @return The value of the column 'SOTED_LOCATION_ID'. (NullAllowed)
     */
    public Long getSotedLocationId() {
        return _sotedLocationId;
    }

    /**
     * [set] SOTED_LOCATION_ID: {bigint(19)} <br>
     * 仕分ロケID
     * @param sotedLocationId The value of the column 'SOTED_LOCATION_ID'. (NullAllowed)
     */
    public void setSotedLocationId(Long sotedLocationId) {
        __modifiedProperties.add("sotedLocationId");
        this._sotedLocationId = sotedLocationId;
    }

    /**
     * [get] SOTED_LOCATION_CD: {varchar(30)} <br>
     * 仕分ロケ
     * @return The value of the column 'SOTED_LOCATION_CD'. (NullAllowed)
     */
    public String getSotedLocationCd() {
        return _sotedLocationCd;
    }

    /**
     * [set] SOTED_LOCATION_CD: {varchar(30)} <br>
     * 仕分ロケ
     * @param sotedLocationCd The value of the column 'SOTED_LOCATION_CD'. (NullAllowed)
     */
    public void setSotedLocationCd(String sotedLocationCd) {
        __modifiedProperties.add("sotedLocationCd");
        this._sotedLocationCd = sotedLocationCd;
    }

    /**
     * [get] ALLOC_LOCATION_ID: {bigint(19)} <br>
     * 引当ロケID
     * @return The value of the column 'ALLOC_LOCATION_ID'. (NullAllowed)
     */
    public Long getAllocLocationId() {
        return _allocLocationId;
    }

    /**
     * [set] ALLOC_LOCATION_ID: {bigint(19)} <br>
     * 引当ロケID
     * @param allocLocationId The value of the column 'ALLOC_LOCATION_ID'. (NullAllowed)
     */
    public void setAllocLocationId(Long allocLocationId) {
        __modifiedProperties.add("allocLocationId");
        this._allocLocationId = allocLocationId;
    }

    /**
     * [get] ALLOC_LOCATION_CD: {varchar(30)} <br>
     * 引当ロケ
     * @return The value of the column 'ALLOC_LOCATION_CD'. (NullAllowed)
     */
    public String getAllocLocationCd() {
        return _allocLocationCd;
    }

    /**
     * [set] ALLOC_LOCATION_CD: {varchar(30)} <br>
     * 引当ロケ
     * @param allocLocationCd The value of the column 'ALLOC_LOCATION_CD'. (NullAllowed)
     */
    public void setAllocLocationCd(String allocLocationCd) {
        __modifiedProperties.add("allocLocationCd");
        this._allocLocationCd = allocLocationCd;
    }

    /**
     * [get] ROOT_OUT_SEQ: {bigint(19)} <br>
     * 山出しルート順
     * @return The value of the column 'ROOT_OUT_SEQ'. (NullAllowed)
     */
    public Long getRootOutSeq() {
        return _rootOutSeq;
    }

    /**
     * [set] ROOT_OUT_SEQ: {bigint(19)} <br>
     * 山出しルート順
     * @param rootOutSeq The value of the column 'ROOT_OUT_SEQ'. (NullAllowed)
     */
    public void setRootOutSeq(Long rootOutSeq) {
        __modifiedProperties.add("rootOutSeq");
        this._rootOutSeq = rootOutSeq;
    }

    /**
     * [get] DIRECTION_COMMENT: {varchar(30)} <br>
     * コメント
     * @return The value of the column 'DIRECTION_COMMENT'. (NullAllowed)
     */
    public String getDirectionComment() {
        return _directionComment;
    }

    /**
     * [set] DIRECTION_COMMENT: {varchar(30)} <br>
     * コメント
     * @param directionComment The value of the column 'DIRECTION_COMMENT'. (NullAllowed)
     */
    public void setDirectionComment(String directionComment) {
        __modifiedProperties.add("directionComment");
        this._directionComment = directionComment;
    }

    /**
     * [get] QTY_CASE: {NotNull, bigint(19)} <br>
     * 指示数量(ケース)
     * @return The value of the column 'QTY_CASE'. (NullAllowed)
     */
    public Long getQtyCase() {
        return _qtyCase;
    }

    /**
     * [set] QTY_CASE: {NotNull, bigint(19)} <br>
     * 指示数量(ケース)
     * @param qtyCase The value of the column 'QTY_CASE'. (NullAllowed)
     */
    public void setQtyCase(Long qtyCase) {
        __modifiedProperties.add("qtyCase");
        this._qtyCase = qtyCase;
    }

    /**
     * [get] QTY_BOWL: {NotNull, bigint(19)} <br>
     * 指示数量(カートン)
     * @return The value of the column 'QTY_BOWL'. (NullAllowed)
     */
    public Long getQtyBowl() {
        return _qtyBowl;
    }

    /**
     * [set] QTY_BOWL: {NotNull, bigint(19)} <br>
     * 指示数量(カートン)
     * @param qtyBowl The value of the column 'QTY_BOWL'. (NullAllowed)
     */
    public void setQtyBowl(Long qtyBowl) {
        __modifiedProperties.add("qtyBowl");
        this._qtyBowl = qtyBowl;
    }

    /**
     * [get] QTY: {NotNull, bigint(19)} <br>
     * 指示数量(個装換算)
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public Long getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19)} <br>
     * 指示数量(個装換算)
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(Long qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] HT_QTY_CASE: {NotNull, bigint(19)} <br>
     * 実績数量(ケース)
     * @return The value of the column 'HT_QTY_CASE'. (NullAllowed)
     */
    public Long getHtQtyCase() {
        return _htQtyCase;
    }

    /**
     * [set] HT_QTY_CASE: {NotNull, bigint(19)} <br>
     * 実績数量(ケース)
     * @param htQtyCase The value of the column 'HT_QTY_CASE'. (NullAllowed)
     */
    public void setHtQtyCase(Long htQtyCase) {
        __modifiedProperties.add("htQtyCase");
        this._htQtyCase = htQtyCase;
    }

    /**
     * [get] HT_QTY_BOWL: {NotNull, bigint(19)} <br>
     * 実績数量(カートン)
     * @return The value of the column 'HT_QTY_BOWL'. (NullAllowed)
     */
    public Long getHtQtyBowl() {
        return _htQtyBowl;
    }

    /**
     * [set] HT_QTY_BOWL: {NotNull, bigint(19)} <br>
     * 実績数量(カートン)
     * @param htQtyBowl The value of the column 'HT_QTY_BOWL'. (NullAllowed)
     */
    public void setHtQtyBowl(Long htQtyBowl) {
        __modifiedProperties.add("htQtyBowl");
        this._htQtyBowl = htQtyBowl;
    }

    /**
     * [get] HT_QTY: {NotNull, bigint(19)} <br>
     * 実績数量(個装換算)
     * @return The value of the column 'HT_QTY'. (NullAllowed)
     */
    public Long getHtQty() {
        return _htQty;
    }

    /**
     * [set] HT_QTY: {NotNull, bigint(19)} <br>
     * 実績数量(個装換算)
     * @param htQty The value of the column 'HT_QTY'. (NullAllowed)
     */
    public void setHtQty(Long htQty) {
        __modifiedProperties.add("htQty");
        this._htQty = htQty;
    }

    /**
     * [get] COMPLETE_STS: {varchar(30)} <br>
     * 完了ステータス
     * @return The value of the column 'COMPLETE_STS'. (NullAllowed)
     */
    public String getCompleteSts() {
        return _completeSts;
    }

    /**
     * [set] COMPLETE_STS: {varchar(30)} <br>
     * 完了ステータス
     * @param completeSts The value of the column 'COMPLETE_STS'. (NullAllowed)
     */
    public void setCompleteSts(String completeSts) {
        __modifiedProperties.add("completeSts");
        this._completeSts = completeSts;
    }

    /**
     * [get] START_TIME: {datetime2(26, 6)} <br>
     * 開始時刻
     * @return The value of the column 'START_TIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getStartTime() {
        return _startTime;
    }

    /**
     * [set] START_TIME: {datetime2(26, 6)} <br>
     * 開始時刻
     * @param startTime The value of the column 'START_TIME'. (NullAllowed)
     */
    public void setStartTime(java.sql.Timestamp startTime) {
        __modifiedProperties.add("startTime");
        this._startTime = startTime;
    }

    /**
     * [get] END_TIME: {datetime2(26, 6)} <br>
     * 終了時刻
     * @return The value of the column 'END_TIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getEndTime() {
        return _endTime;
    }

    /**
     * [set] END_TIME: {datetime2(26, 6)} <br>
     * 終了時刻
     * @param endTime The value of the column 'END_TIME'. (NullAllowed)
     */
    public void setEndTime(java.sql.Timestamp endTime) {
        __modifiedProperties.add("endTime");
        this._endTime = endTime;
    }

    /**
     * [get] USER_CD: {varchar(30)} <br>
     * 作業者
     * @return The value of the column 'USER_CD'. (NullAllowed)
     */
    public String getUserCd() {
        return _userCd;
    }

    /**
     * [set] USER_CD: {varchar(30)} <br>
     * 作業者
     * @param userCd The value of the column 'USER_CD'. (NullAllowed)
     */
    public void setUserCd(String userCd) {
        __modifiedProperties.add("userCd");
        this._userCd = userCd;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public String getSuppliercd() {
        return _suppliercd;
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 発送元CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public void setSuppliercd(String suppliercd) {
        __modifiedProperties.add("suppliercd");
        this._suppliercd = suppliercd;
    }

    /**
     * [get] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed)
     */
    public String getSchdate() {
        return _schdate;
    }

    /**
     * [set] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed)
     */
    public void setSchdate(String schdate) {
        __modifiedProperties.add("schdate");
        this._schdate = schdate;
    }

    /**
     * [get] CASE_OUT_NUMBER: {bigint(19)} <br>
     * ケースはり紙出力済枚数
     * @return The value of the column 'CASE_OUT_NUMBER'. (NullAllowed)
     */
    public Long getCaseOutNumber() {
        return _caseOutNumber;
    }

    /**
     * [set] CASE_OUT_NUMBER: {bigint(19)} <br>
     * ケースはり紙出力済枚数
     * @param caseOutNumber The value of the column 'CASE_OUT_NUMBER'. (NullAllowed)
     */
    public void setCaseOutNumber(Long caseOutNumber) {
        __modifiedProperties.add("caseOutNumber");
        this._caseOutNumber = caseOutNumber;
    }

    /**
     * [get] CENTER_ID: {IX, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * 補充先
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * 補充先
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] SORTING_RACK_NO: {varchar(30)} <br>
     * 仕分ラック番号
     * @return The value of the column 'SORTING_RACK_NO'. (NullAllowed)
     */
    public String getSortingRackNo() {
        return _sortingRackNo;
    }

    /**
     * [set] SORTING_RACK_NO: {varchar(30)} <br>
     * 仕分ラック番号
     * @param sortingRackNo The value of the column 'SORTING_RACK_NO'. (NullAllowed)
     */
    public void setSortingRackNo(String sortingRackNo) {
        __modifiedProperties.add("sortingRackNo");
        this._sortingRackNo = sortingRackNo;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
