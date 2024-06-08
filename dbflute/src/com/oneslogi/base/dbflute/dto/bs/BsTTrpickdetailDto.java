package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRPICKDETAIL as TABLE. <br>
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
 * [foreign-table]
 *     T_STOCK, M_LOCATION, T_YTRSODETAIL
 *
 * [referrer-table]
 *     T_TR_PICKLIST
 *
 * [foreign-property]
 *     tStock, mLocation, tYtrsodetail
 *
 * [referrer-property]
 *     tTrPicklistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrpickdetailDto implements Serializable {

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
    /** TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trpickdetailId;

    /** TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL} */
    @JsonKey
    protected Long _trsodetailId;

    /** MOVE_INST_H_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _moveInstHId;

    /** STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} */
    @JsonKey
    protected Long _stockId;

    /** LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION} */
    @JsonKey
    protected Long _locationId;

    /** PICK_BATCH_KEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _pickBatchKey;

    /** PICK_BATCH_LINE_NO: {bigint(19)} */
    @JsonKey
    protected Long _pickBatchLineNo;

    /** PRODUCT_CD: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** IFITEM_CD: {varchar(30)} */
    @JsonKey
    protected String _ifitemCd;

    /** LOT_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** LOCATION_CD: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _expectQty;

    /** PICKED_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _pickedQty;

    /** SORTED_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sortedQty;

    /** SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _shippedQty;

    /** PICK_USER_CD: {varchar(30)} */
    @JsonKey
    protected String _pickUserCd;

    /** LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _labelPrintedFlg;

    /** MONTH_FLG: {varchar(30)} */
    @JsonKey
    protected String _monthFlg;

    /** PL_BATCH_KEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _plBatchKey;

    /** WORKALLOCATENAME: {varchar(255)} */
    @JsonKey
    protected String _workallocatename;

    /** ALERTFLG: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _alertflg;

    /** REVERSE_FLG: {char(1)} */
    @JsonKey
    protected String _reverseFlg;

    /** REVERSE_LIST_OUTPUT__FLG: {char(1)} */
    @JsonKey
    protected String _reverseListOutputFlg;

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
    public BsTTrpickdetailDto() {
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
    protected TStockDto _tStock;

    public TStockDto getTStock() {
        return _tStock;
    }

    public void setTStock(TStockDto tStock) {
        this._tStock = tStock;
    }

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected TYtrsodetailDto _tYtrsodetail;

    public TYtrsodetailDto getTYtrsodetail() {
        return _tYtrsodetail;
    }

    public void setTYtrsodetail(TYtrsodetailDto tYtrsodetail) {
        this._tYtrsodetail = tYtrsodetail;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TTrPicklistDto> _tTrPicklistList;

    public List<TTrPicklistDto> getTTrPicklistList() {
        if (_tTrPicklistList == null) { _tTrPicklistList = new ArrayList<TTrPicklistDto>(); }
        return _tTrPicklistList;
    }

    public void setTTrPicklistList(List<TTrPicklistDto> tTrPicklistList) {
        this._tTrPicklistList = tTrPicklistList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrpickdetailDto)) { return false; }
        final BsTTrpickdetailDto otherEntity = (BsTTrpickdetailDto)other;
        if (!helpComparingValue(getTrpickdetailId(), otherEntity.getTrpickdetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRPICKDETAIL");
        result = xCH(result, getTrpickdetailId());
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
        sb.append(c).append(getTrpickdetailId());
        sb.append(c).append(getTrsodetailId());
        sb.append(c).append(getMoveInstHId());
        sb.append(c).append(getStockId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getPickBatchKey());
        sb.append(c).append(getPickBatchLineNo());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getIfitemCd());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getExpectQty());
        sb.append(c).append(getPickedQty());
        sb.append(c).append(getSortedQty());
        sb.append(c).append(getShippedQty());
        sb.append(c).append(getPickUserCd());
        sb.append(c).append(getLabelPrintedFlg());
        sb.append(c).append(getMonthFlg());
        sb.append(c).append(getPlBatchKey());
        sb.append(c).append(getWorkallocatename());
        sb.append(c).append(getAlertflg());
        sb.append(c).append(getReverseFlg());
        sb.append(c).append(getReverseListOutputFlg());
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
     * [get] TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示詳細ボディID
     * @return The value of the column 'TRPICKDETAIL_ID'. (NullAllowed)
     */
    public Long getTrpickdetailId() {
        return _trpickdetailId;
    }

    /**
     * [set] TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示詳細ボディID
     * @param trpickdetailId The value of the column 'TRPICKDETAIL_ID'. (NullAllowed)
     */
    public void setTrpickdetailId(Long trpickdetailId) {
        __modifiedProperties.add("trpickdetailId");
        this._trpickdetailId = trpickdetailId;
    }

    /**
     * [get] TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL} <br>
     * 山出し指示ボディID
     * @return The value of the column 'TRSODETAIL_ID'. (NullAllowed)
     */
    public Long getTrsodetailId() {
        return _trsodetailId;
    }

    /**
     * [set] TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL} <br>
     * 山出し指示ボディID
     * @param trsodetailId The value of the column 'TRSODETAIL_ID'. (NullAllowed)
     */
    public void setTrsodetailId(Long trsodetailId) {
        __modifiedProperties.add("trsodetailId");
        this._trsodetailId = trsodetailId;
    }

    /**
     * [get] MOVE_INST_H_ID: {NotNull, bigint(19)} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public Long getMoveInstHId() {
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {NotNull, bigint(19)} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public void setMoveInstHId(Long moveInstHId) {
        __modifiedProperties.add("moveInstHId");
        this._moveInstHId = moveInstHId;
    }

    /**
     * [get] STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] PICK_BATCH_KEY: {IX, bigint(19)} <br>
     * 引当バッチキー
     * @return The value of the column 'PICK_BATCH_KEY'. (NullAllowed)
     */
    public Long getPickBatchKey() {
        return _pickBatchKey;
    }

    /**
     * [set] PICK_BATCH_KEY: {IX, bigint(19)} <br>
     * 引当バッチキー
     * @param pickBatchKey The value of the column 'PICK_BATCH_KEY'. (NullAllowed)
     */
    public void setPickBatchKey(Long pickBatchKey) {
        __modifiedProperties.add("pickBatchKey");
        this._pickBatchKey = pickBatchKey;
    }

    /**
     * [get] PICK_BATCH_LINE_NO: {bigint(19)} <br>
     * 引当バッチ行No.
     * @return The value of the column 'PICK_BATCH_LINE_NO'. (NullAllowed)
     */
    public Long getPickBatchLineNo() {
        return _pickBatchLineNo;
    }

    /**
     * [set] PICK_BATCH_LINE_NO: {bigint(19)} <br>
     * 引当バッチ行No.
     * @param pickBatchLineNo The value of the column 'PICK_BATCH_LINE_NO'. (NullAllowed)
     */
    public void setPickBatchLineNo(Long pickBatchLineNo) {
        __modifiedProperties.add("pickBatchLineNo");
        this._pickBatchLineNo = pickBatchLineNo;
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
     * [get] IFITEM_CD: {varchar(30)} <br>
     * I/F銘柄CD
     * @return The value of the column 'IFITEM_CD'. (NullAllowed)
     */
    public String getIfitemCd() {
        return _ifitemCd;
    }

    /**
     * [set] IFITEM_CD: {varchar(30)} <br>
     * I/F銘柄CD
     * @param ifitemCd The value of the column 'IFITEM_CD'. (NullAllowed)
     */
    public void setIfitemCd(String ifitemCd) {
        __modifiedProperties.add("ifitemCd");
        this._ifitemCd = ifitemCd;
    }

    /**
     * [get] LOT_ID: {IX, NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] LOCATION_CD: {IX, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {IX, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング予定数量
     * @return The value of the column 'EXPECT_QTY'. (NullAllowed)
     */
    public Long getExpectQty() {
        return _expectQty;
    }

    /**
     * [set] EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング予定数量
     * @param expectQty The value of the column 'EXPECT_QTY'. (NullAllowed)
     */
    public void setExpectQty(Long expectQty) {
        __modifiedProperties.add("expectQty");
        this._expectQty = expectQty;
    }

    /**
     * [get] PICKED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量
     * @return The value of the column 'PICKED_QTY'. (NullAllowed)
     */
    public Long getPickedQty() {
        return _pickedQty;
    }

    /**
     * [set] PICKED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量
     * @param pickedQty The value of the column 'PICKED_QTY'. (NullAllowed)
     */
    public void setPickedQty(Long pickedQty) {
        __modifiedProperties.add("pickedQty");
        this._pickedQty = pickedQty;
    }

    /**
     * [get] SORTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量
     * @return The value of the column 'SORTED_QTY'. (NullAllowed)
     */
    public Long getSortedQty() {
        return _sortedQty;
    }

    /**
     * [set] SORTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量
     * @param sortedQty The value of the column 'SORTED_QTY'. (NullAllowed)
     */
    public void setSortedQty(Long sortedQty) {
        __modifiedProperties.add("sortedQty");
        this._sortedQty = sortedQty;
    }

    /**
     * [get] SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷実績数量
     * @return The value of the column 'SHIPPED_QTY'. (NullAllowed)
     */
    public Long getShippedQty() {
        return _shippedQty;
    }

    /**
     * [set] SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷実績数量
     * @param shippedQty The value of the column 'SHIPPED_QTY'. (NullAllowed)
     */
    public void setShippedQty(Long shippedQty) {
        __modifiedProperties.add("shippedQty");
        this._shippedQty = shippedQty;
    }

    /**
     * [get] PICK_USER_CD: {varchar(30)} <br>
     * ピッキング担当者
     * @return The value of the column 'PICK_USER_CD'. (NullAllowed)
     */
    public String getPickUserCd() {
        return _pickUserCd;
    }

    /**
     * [set] PICK_USER_CD: {varchar(30)} <br>
     * ピッキング担当者
     * @param pickUserCd The value of the column 'PICK_USER_CD'. (NullAllowed)
     */
    public void setPickUserCd(String pickUserCd) {
        __modifiedProperties.add("pickUserCd");
        this._pickUserCd = pickUserCd;
    }

    /**
     * [get] LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * 山出しリスト出力済区分
     * @return The value of the column 'LABEL_PRINTED_FLG'. (NullAllowed)
     */
    public Long getLabelPrintedFlg() {
        return _labelPrintedFlg;
    }

    /**
     * [set] LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * 山出しリスト出力済区分
     * @param labelPrintedFlg The value of the column 'LABEL_PRINTED_FLG'. (NullAllowed)
     */
    public void setLabelPrintedFlg(Long labelPrintedFlg) {
        __modifiedProperties.add("labelPrintedFlg");
        this._labelPrintedFlg = labelPrintedFlg;
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
     * [get] PL_BATCH_KEY: {IX, bigint(19)} <br>
     * 山出しリストバッチキー
     * @return The value of the column 'PL_BATCH_KEY'. (NullAllowed)
     */
    public Long getPlBatchKey() {
        return _plBatchKey;
    }

    /**
     * [set] PL_BATCH_KEY: {IX, bigint(19)} <br>
     * 山出しリストバッチキー
     * @param plBatchKey The value of the column 'PL_BATCH_KEY'. (NullAllowed)
     */
    public void setPlBatchKey(Long plBatchKey) {
        __modifiedProperties.add("plBatchKey");
        this._plBatchKey = plBatchKey;
    }

    /**
     * [get] WORKALLOCATENAME: {varchar(255)} <br>
     * 作業割付名称
     * @return The value of the column 'WORKALLOCATENAME'. (NullAllowed)
     */
    public String getWorkallocatename() {
        return _workallocatename;
    }

    /**
     * [set] WORKALLOCATENAME: {varchar(255)} <br>
     * 作業割付名称
     * @param workallocatename The value of the column 'WORKALLOCATENAME'. (NullAllowed)
     */
    public void setWorkallocatename(String workallocatename) {
        __modifiedProperties.add("workallocatename");
        this._workallocatename = workallocatename;
    }

    /**
     * [get] ALERTFLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング不足フラグ
     * @return The value of the column 'ALERTFLG'. (NullAllowed)
     */
    public Long getAlertflg() {
        return _alertflg;
    }

    /**
     * [set] ALERTFLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング不足フラグ
     * @param alertflg The value of the column 'ALERTFLG'. (NullAllowed)
     */
    public void setAlertflg(Long alertflg) {
        __modifiedProperties.add("alertflg");
        this._alertflg = alertflg;
    }

    /**
     * [get] REVERSE_FLG: {char(1)} <br>
     * 逆転フラグ
     * @return The value of the column 'REVERSE_FLG'. (NullAllowed)
     */
    public String getReverseFlg() {
        return _reverseFlg;
    }

    /**
     * [set] REVERSE_FLG: {char(1)} <br>
     * 逆転フラグ
     * @param reverseFlg The value of the column 'REVERSE_FLG'. (NullAllowed)
     */
    public void setReverseFlg(String reverseFlg) {
        __modifiedProperties.add("reverseFlg");
        this._reverseFlg = reverseFlg;
    }

    /**
     * [get] REVERSE_LIST_OUTPUT__FLG: {char(1)} <br>
     * 逆転リスト出力済フラグ
     * @return The value of the column 'REVERSE_LIST_OUTPUT__FLG'. (NullAllowed)
     */
    public String getReverseListOutputFlg() {
        return _reverseListOutputFlg;
    }

    /**
     * [set] REVERSE_LIST_OUTPUT__FLG: {char(1)} <br>
     * 逆転リスト出力済フラグ
     * @param reverseListOutputFlg The value of the column 'REVERSE_LIST_OUTPUT__FLG'. (NullAllowed)
     */
    public void setReverseListOutputFlg(String reverseListOutputFlg) {
        __modifiedProperties.add("reverseListOutputFlg");
        this._reverseListOutputFlg = reverseListOutputFlg;
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
