package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_STOCK_REPORT as TABLE. <br>
 * 在庫日報
 * <pre>
 * [primary-key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, STORE_NUM_DAY, PICKING_NUM_DAY, MOVE_PLS_NUM_DAY, MOVE_MNS_NUM_DAY, ADJ_PLS_NUM_DAY, ADJ_MNS_NUM_DAY, P_CHARGE_NUM_DAY, P_ALLOC_NUM_DAY, P_MOVE_NUM_DAY, P_TRANSIT_NUM_DAY, STORE_NUM_MONTH, PICKING_NUM_MONTH, MOVE_PLS_NUM_MONTH, MOVE_MNS_NUM_MONTH, ADJ_PLS_NUM_MONTH, ADJ_MNS_NUM_MONTH, P_CHARGE_NUM_MONTH, P_ALLOC_NUM_MONTH, P_MOVE_NUM_MONTH, P_TRANSIT_NUM_MONTH, CHARGE_NUM_10, ALLOC_NUM_10, MOVE_NUM_10, TRANSIT_NUM_10, CHARGE_NUM_15, ALLOC_NUM_15, MOVE_NUM_15, TRANSIT_NUM_15, CHARGE_NUM_20, ALLOC_NUM_20, MOVE_NUM_20, TRANSIT_NUM_20, CHARGE_NUM_LAST, ALLOC_NUM_LAST, MOVE_NUM_LAST, TRANSIT_NUM_LAST, LAST_STORE_DT, LAST_PICKING_DT, LASTRECEIVEDATE, LASTSHIPDATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_STOCK
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tStock
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTStockReportDto implements Serializable {

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
    /** STOCK_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STOCK} */
    @JsonKey
    protected Long _stockId;

    /** STORE_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _storeNumDay;

    /** PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pickingNumDay;

    /** MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _movePlsNumDay;

    /** MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _moveMnsNumDay;

    /** ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _adjPlsNumDay;

    /** ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _adjMnsNumDay;

    /** P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pChargeNumDay;

    /** P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pAllocNumDay;

    /** P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pMoveNumDay;

    /** P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pTransitNumDay;

    /** STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _storeNumMonth;

    /** PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pickingNumMonth;

    /** MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _movePlsNumMonth;

    /** MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _moveMnsNumMonth;

    /** ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _adjPlsNumMonth;

    /** ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _adjMnsNumMonth;

    /** P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pChargeNumMonth;

    /** P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pAllocNumMonth;

    /** P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pMoveNumMonth;

    /** P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _pTransitNumMonth;

    /** CHARGE_NUM_10: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum10;

    /** ALLOC_NUM_10: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _allocNum10;

    /** MOVE_NUM_10: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _moveNum10;

    /** TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _transitNum10;

    /** CHARGE_NUM_15: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum15;

    /** ALLOC_NUM_15: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _allocNum15;

    /** MOVE_NUM_15: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _moveNum15;

    /** TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _transitNum15;

    /** CHARGE_NUM_20: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum20;

    /** ALLOC_NUM_20: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _allocNum20;

    /** MOVE_NUM_20: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _moveNum20;

    /** TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _transitNum20;

    /** CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _chargeNumLast;

    /** ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _allocNumLast;

    /** MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _moveNumLast;

    /** TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _transitNumLast;

    /** LAST_STORE_DT: {varchar(8)} */
    @JsonKey
    protected String _lastStoreDt;

    /** LAST_PICKING_DT: {varchar(8)} */
    @JsonKey
    protected String _lastPickingDt;

    /** LASTRECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _lastreceivedate;

    /** LASTSHIPDATE: {varchar(8)} */
    @JsonKey
    protected String _lastshipdate;

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
    public BsTStockReportDto() {
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTStockReportDto)) { return false; }
        final BsTStockReportDto otherEntity = (BsTStockReportDto)other;
        if (!helpComparingValue(getStockId(), otherEntity.getStockId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_STOCK_REPORT");
        result = xCH(result, getStockId());
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
        sb.append(c).append(getStockId());
        sb.append(c).append(getStoreNumDay());
        sb.append(c).append(getPickingNumDay());
        sb.append(c).append(getMovePlsNumDay());
        sb.append(c).append(getMoveMnsNumDay());
        sb.append(c).append(getAdjPlsNumDay());
        sb.append(c).append(getAdjMnsNumDay());
        sb.append(c).append(getPChargeNumDay());
        sb.append(c).append(getPAllocNumDay());
        sb.append(c).append(getPMoveNumDay());
        sb.append(c).append(getPTransitNumDay());
        sb.append(c).append(getStoreNumMonth());
        sb.append(c).append(getPickingNumMonth());
        sb.append(c).append(getMovePlsNumMonth());
        sb.append(c).append(getMoveMnsNumMonth());
        sb.append(c).append(getAdjPlsNumMonth());
        sb.append(c).append(getAdjMnsNumMonth());
        sb.append(c).append(getPChargeNumMonth());
        sb.append(c).append(getPAllocNumMonth());
        sb.append(c).append(getPMoveNumMonth());
        sb.append(c).append(getPTransitNumMonth());
        sb.append(c).append(getChargeNum10());
        sb.append(c).append(getAllocNum10());
        sb.append(c).append(getMoveNum10());
        sb.append(c).append(getTransitNum10());
        sb.append(c).append(getChargeNum15());
        sb.append(c).append(getAllocNum15());
        sb.append(c).append(getMoveNum15());
        sb.append(c).append(getTransitNum15());
        sb.append(c).append(getChargeNum20());
        sb.append(c).append(getAllocNum20());
        sb.append(c).append(getMoveNum20());
        sb.append(c).append(getTransitNum20());
        sb.append(c).append(getChargeNumLast());
        sb.append(c).append(getAllocNumLast());
        sb.append(c).append(getMoveNumLast());
        sb.append(c).append(getTransitNumLast());
        sb.append(c).append(getLastStoreDt());
        sb.append(c).append(getLastPickingDt());
        sb.append(c).append(getLastreceivedate());
        sb.append(c).append(getLastshipdate());
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
     * [get] STOCK_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] STORE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日入庫数
     * @return The value of the column 'STORE_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getStoreNumDay() {
        return _storeNumDay;
    }

    /**
     * [set] STORE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日入庫数
     * @param storeNumDay The value of the column 'STORE_NUM_DAY'. (NullAllowed)
     */
    public void setStoreNumDay(java.math.BigDecimal storeNumDay) {
        __modifiedProperties.add("storeNumDay");
        this._storeNumDay = storeNumDay;
    }

    /**
     * [get] PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日出庫数
     * @return The value of the column 'PICKING_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getPickingNumDay() {
        return _pickingNumDay;
    }

    /**
     * [set] PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日出庫数
     * @param pickingNumDay The value of the column 'PICKING_NUM_DAY'. (NullAllowed)
     */
    public void setPickingNumDay(java.math.BigDecimal pickingNumDay) {
        __modifiedProperties.add("pickingNumDay");
        this._pickingNumDay = pickingNumDay;
    }

    /**
     * [get] MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日移動数＋
     * @return The value of the column 'MOVE_PLS_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getMovePlsNumDay() {
        return _movePlsNumDay;
    }

    /**
     * [set] MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日移動数＋
     * @param movePlsNumDay The value of the column 'MOVE_PLS_NUM_DAY'. (NullAllowed)
     */
    public void setMovePlsNumDay(java.math.BigDecimal movePlsNumDay) {
        __modifiedProperties.add("movePlsNumDay");
        this._movePlsNumDay = movePlsNumDay;
    }

    /**
     * [get] MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日移動数－
     * @return The value of the column 'MOVE_MNS_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveMnsNumDay() {
        return _moveMnsNumDay;
    }

    /**
     * [set] MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日移動数－
     * @param moveMnsNumDay The value of the column 'MOVE_MNS_NUM_DAY'. (NullAllowed)
     */
    public void setMoveMnsNumDay(java.math.BigDecimal moveMnsNumDay) {
        __modifiedProperties.add("moveMnsNumDay");
        this._moveMnsNumDay = moveMnsNumDay;
    }

    /**
     * [get] ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日調整数＋
     * @return The value of the column 'ADJ_PLS_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getAdjPlsNumDay() {
        return _adjPlsNumDay;
    }

    /**
     * [set] ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日調整数＋
     * @param adjPlsNumDay The value of the column 'ADJ_PLS_NUM_DAY'. (NullAllowed)
     */
    public void setAdjPlsNumDay(java.math.BigDecimal adjPlsNumDay) {
        __modifiedProperties.add("adjPlsNumDay");
        this._adjPlsNumDay = adjPlsNumDay;
    }

    /**
     * [get] ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日調整数－
     * @return The value of the column 'ADJ_MNS_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getAdjMnsNumDay() {
        return _adjMnsNumDay;
    }

    /**
     * [set] ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日調整数－
     * @param adjMnsNumDay The value of the column 'ADJ_MNS_NUM_DAY'. (NullAllowed)
     */
    public void setAdjMnsNumDay(java.math.BigDecimal adjMnsNumDay) {
        __modifiedProperties.add("adjMnsNumDay");
        this._adjMnsNumDay = adjMnsNumDay;
    }

    /**
     * [get] P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日引当可能数
     * @return The value of the column 'P_CHARGE_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getPChargeNumDay() {
        return _pChargeNumDay;
    }

    /**
     * [set] P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日引当可能数
     * @param pChargeNumDay The value of the column 'P_CHARGE_NUM_DAY'. (NullAllowed)
     */
    public void setPChargeNumDay(java.math.BigDecimal pChargeNumDay) {
        __modifiedProperties.add("PChargeNumDay");
        this._pChargeNumDay = pChargeNumDay;
    }

    /**
     * [get] P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日引当済数
     * @return The value of the column 'P_ALLOC_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getPAllocNumDay() {
        return _pAllocNumDay;
    }

    /**
     * [set] P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日引当済数
     * @param pAllocNumDay The value of the column 'P_ALLOC_NUM_DAY'. (NullAllowed)
     */
    public void setPAllocNumDay(java.math.BigDecimal pAllocNumDay) {
        __modifiedProperties.add("PAllocNumDay");
        this._pAllocNumDay = pAllocNumDay;
    }

    /**
     * [get] P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日移動中数
     * @return The value of the column 'P_MOVE_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getPMoveNumDay() {
        return _pMoveNumDay;
    }

    /**
     * [set] P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日移動中数
     * @param pMoveNumDay The value of the column 'P_MOVE_NUM_DAY'. (NullAllowed)
     */
    public void setPMoveNumDay(java.math.BigDecimal pMoveNumDay) {
        __modifiedProperties.add("PMoveNumDay");
        this._pMoveNumDay = pMoveNumDay;
    }

    /**
     * [get] P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日積送中数
     * @return The value of the column 'P_TRANSIT_NUM_DAY'. (NullAllowed)
     */
    public java.math.BigDecimal getPTransitNumDay() {
        return _pTransitNumDay;
    }

    /**
     * [set] P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日積送中数
     * @param pTransitNumDay The value of the column 'P_TRANSIT_NUM_DAY'. (NullAllowed)
     */
    public void setPTransitNumDay(java.math.BigDecimal pTransitNumDay) {
        __modifiedProperties.add("PTransitNumDay");
        this._pTransitNumDay = pTransitNumDay;
    }

    /**
     * [get] STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月入庫数
     * @return The value of the column 'STORE_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getStoreNumMonth() {
        return _storeNumMonth;
    }

    /**
     * [set] STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月入庫数
     * @param storeNumMonth The value of the column 'STORE_NUM_MONTH'. (NullAllowed)
     */
    public void setStoreNumMonth(java.math.BigDecimal storeNumMonth) {
        __modifiedProperties.add("storeNumMonth");
        this._storeNumMonth = storeNumMonth;
    }

    /**
     * [get] PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月出庫数
     * @return The value of the column 'PICKING_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getPickingNumMonth() {
        return _pickingNumMonth;
    }

    /**
     * [set] PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月出庫数
     * @param pickingNumMonth The value of the column 'PICKING_NUM_MONTH'. (NullAllowed)
     */
    public void setPickingNumMonth(java.math.BigDecimal pickingNumMonth) {
        __modifiedProperties.add("pickingNumMonth");
        this._pickingNumMonth = pickingNumMonth;
    }

    /**
     * [get] MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月移動数＋
     * @return The value of the column 'MOVE_PLS_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getMovePlsNumMonth() {
        return _movePlsNumMonth;
    }

    /**
     * [set] MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月移動数＋
     * @param movePlsNumMonth The value of the column 'MOVE_PLS_NUM_MONTH'. (NullAllowed)
     */
    public void setMovePlsNumMonth(java.math.BigDecimal movePlsNumMonth) {
        __modifiedProperties.add("movePlsNumMonth");
        this._movePlsNumMonth = movePlsNumMonth;
    }

    /**
     * [get] MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月移動数－
     * @return The value of the column 'MOVE_MNS_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveMnsNumMonth() {
        return _moveMnsNumMonth;
    }

    /**
     * [set] MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月移動数－
     * @param moveMnsNumMonth The value of the column 'MOVE_MNS_NUM_MONTH'. (NullAllowed)
     */
    public void setMoveMnsNumMonth(java.math.BigDecimal moveMnsNumMonth) {
        __modifiedProperties.add("moveMnsNumMonth");
        this._moveMnsNumMonth = moveMnsNumMonth;
    }

    /**
     * [get] ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月調整数＋
     * @return The value of the column 'ADJ_PLS_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getAdjPlsNumMonth() {
        return _adjPlsNumMonth;
    }

    /**
     * [set] ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月調整数＋
     * @param adjPlsNumMonth The value of the column 'ADJ_PLS_NUM_MONTH'. (NullAllowed)
     */
    public void setAdjPlsNumMonth(java.math.BigDecimal adjPlsNumMonth) {
        __modifiedProperties.add("adjPlsNumMonth");
        this._adjPlsNumMonth = adjPlsNumMonth;
    }

    /**
     * [get] ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月調整数－
     * @return The value of the column 'ADJ_MNS_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getAdjMnsNumMonth() {
        return _adjMnsNumMonth;
    }

    /**
     * [set] ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月調整数－
     * @param adjMnsNumMonth The value of the column 'ADJ_MNS_NUM_MONTH'. (NullAllowed)
     */
    public void setAdjMnsNumMonth(java.math.BigDecimal adjMnsNumMonth) {
        __modifiedProperties.add("adjMnsNumMonth");
        this._adjMnsNumMonth = adjMnsNumMonth;
    }

    /**
     * [get] P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月引当可能数
     * @return The value of the column 'P_CHARGE_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getPChargeNumMonth() {
        return _pChargeNumMonth;
    }

    /**
     * [set] P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月引当可能数
     * @param pChargeNumMonth The value of the column 'P_CHARGE_NUM_MONTH'. (NullAllowed)
     */
    public void setPChargeNumMonth(java.math.BigDecimal pChargeNumMonth) {
        __modifiedProperties.add("PChargeNumMonth");
        this._pChargeNumMonth = pChargeNumMonth;
    }

    /**
     * [get] P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月引当済数
     * @return The value of the column 'P_ALLOC_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getPAllocNumMonth() {
        return _pAllocNumMonth;
    }

    /**
     * [set] P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月引当済数
     * @param pAllocNumMonth The value of the column 'P_ALLOC_NUM_MONTH'. (NullAllowed)
     */
    public void setPAllocNumMonth(java.math.BigDecimal pAllocNumMonth) {
        __modifiedProperties.add("PAllocNumMonth");
        this._pAllocNumMonth = pAllocNumMonth;
    }

    /**
     * [get] P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月移動中数
     * @return The value of the column 'P_MOVE_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getPMoveNumMonth() {
        return _pMoveNumMonth;
    }

    /**
     * [set] P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月移動中数
     * @param pMoveNumMonth The value of the column 'P_MOVE_NUM_MONTH'. (NullAllowed)
     */
    public void setPMoveNumMonth(java.math.BigDecimal pMoveNumMonth) {
        __modifiedProperties.add("PMoveNumMonth");
        this._pMoveNumMonth = pMoveNumMonth;
    }

    /**
     * [get] P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月積送中数
     * @return The value of the column 'P_TRANSIT_NUM_MONTH'. (NullAllowed)
     */
    public java.math.BigDecimal getPTransitNumMonth() {
        return _pTransitNumMonth;
    }

    /**
     * [set] P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月積送中数
     * @param pTransitNumMonth The value of the column 'P_TRANSIT_NUM_MONTH'. (NullAllowed)
     */
    public void setPTransitNumMonth(java.math.BigDecimal pTransitNumMonth) {
        __modifiedProperties.add("PTransitNumMonth");
        this._pTransitNumMonth = pTransitNumMonth;
    }

    /**
     * [get] CHARGE_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残引当可能数
     * @return The value of the column 'CHARGE_NUM_10'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum10() {
        return _chargeNum10;
    }

    /**
     * [set] CHARGE_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残引当可能数
     * @param chargeNum10 The value of the column 'CHARGE_NUM_10'. (NullAllowed)
     */
    public void setChargeNum10(java.math.BigDecimal chargeNum10) {
        __modifiedProperties.add("chargeNum10");
        this._chargeNum10 = chargeNum10;
    }

    /**
     * [get] ALLOC_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残引当済数
     * @return The value of the column 'ALLOC_NUM_10'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum10() {
        return _allocNum10;
    }

    /**
     * [set] ALLOC_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残引当済数
     * @param allocNum10 The value of the column 'ALLOC_NUM_10'. (NullAllowed)
     */
    public void setAllocNum10(java.math.BigDecimal allocNum10) {
        __modifiedProperties.add("allocNum10");
        this._allocNum10 = allocNum10;
    }

    /**
     * [get] MOVE_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残移動中数
     * @return The value of the column 'MOVE_NUM_10'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNum10() {
        return _moveNum10;
    }

    /**
     * [set] MOVE_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残移動中数
     * @param moveNum10 The value of the column 'MOVE_NUM_10'. (NullAllowed)
     */
    public void setMoveNum10(java.math.BigDecimal moveNum10) {
        __modifiedProperties.add("moveNum10");
        this._moveNum10 = moveNum10;
    }

    /**
     * [get] TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残積送中数
     * @return The value of the column 'TRANSIT_NUM_10'. (NullAllowed)
     */
    public java.math.BigDecimal getTransitNum10() {
        return _transitNum10;
    }

    /**
     * [set] TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残積送中数
     * @param transitNum10 The value of the column 'TRANSIT_NUM_10'. (NullAllowed)
     */
    public void setTransitNum10(java.math.BigDecimal transitNum10) {
        __modifiedProperties.add("transitNum10");
        this._transitNum10 = transitNum10;
    }

    /**
     * [get] CHARGE_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残引当可能数
     * @return The value of the column 'CHARGE_NUM_15'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum15() {
        return _chargeNum15;
    }

    /**
     * [set] CHARGE_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残引当可能数
     * @param chargeNum15 The value of the column 'CHARGE_NUM_15'. (NullAllowed)
     */
    public void setChargeNum15(java.math.BigDecimal chargeNum15) {
        __modifiedProperties.add("chargeNum15");
        this._chargeNum15 = chargeNum15;
    }

    /**
     * [get] ALLOC_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残引当済数
     * @return The value of the column 'ALLOC_NUM_15'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum15() {
        return _allocNum15;
    }

    /**
     * [set] ALLOC_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残引当済数
     * @param allocNum15 The value of the column 'ALLOC_NUM_15'. (NullAllowed)
     */
    public void setAllocNum15(java.math.BigDecimal allocNum15) {
        __modifiedProperties.add("allocNum15");
        this._allocNum15 = allocNum15;
    }

    /**
     * [get] MOVE_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残移動中数
     * @return The value of the column 'MOVE_NUM_15'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNum15() {
        return _moveNum15;
    }

    /**
     * [set] MOVE_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残移動中数
     * @param moveNum15 The value of the column 'MOVE_NUM_15'. (NullAllowed)
     */
    public void setMoveNum15(java.math.BigDecimal moveNum15) {
        __modifiedProperties.add("moveNum15");
        this._moveNum15 = moveNum15;
    }

    /**
     * [get] TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残積送中数
     * @return The value of the column 'TRANSIT_NUM_15'. (NullAllowed)
     */
    public java.math.BigDecimal getTransitNum15() {
        return _transitNum15;
    }

    /**
     * [set] TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残積送中数
     * @param transitNum15 The value of the column 'TRANSIT_NUM_15'. (NullAllowed)
     */
    public void setTransitNum15(java.math.BigDecimal transitNum15) {
        __modifiedProperties.add("transitNum15");
        this._transitNum15 = transitNum15;
    }

    /**
     * [get] CHARGE_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残引当可能数
     * @return The value of the column 'CHARGE_NUM_20'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum20() {
        return _chargeNum20;
    }

    /**
     * [set] CHARGE_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残引当可能数
     * @param chargeNum20 The value of the column 'CHARGE_NUM_20'. (NullAllowed)
     */
    public void setChargeNum20(java.math.BigDecimal chargeNum20) {
        __modifiedProperties.add("chargeNum20");
        this._chargeNum20 = chargeNum20;
    }

    /**
     * [get] ALLOC_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残引当済数
     * @return The value of the column 'ALLOC_NUM_20'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum20() {
        return _allocNum20;
    }

    /**
     * [set] ALLOC_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残引当済数
     * @param allocNum20 The value of the column 'ALLOC_NUM_20'. (NullAllowed)
     */
    public void setAllocNum20(java.math.BigDecimal allocNum20) {
        __modifiedProperties.add("allocNum20");
        this._allocNum20 = allocNum20;
    }

    /**
     * [get] MOVE_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残移動中数
     * @return The value of the column 'MOVE_NUM_20'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNum20() {
        return _moveNum20;
    }

    /**
     * [set] MOVE_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残移動中数
     * @param moveNum20 The value of the column 'MOVE_NUM_20'. (NullAllowed)
     */
    public void setMoveNum20(java.math.BigDecimal moveNum20) {
        __modifiedProperties.add("moveNum20");
        this._moveNum20 = moveNum20;
    }

    /**
     * [get] TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残積送中数
     * @return The value of the column 'TRANSIT_NUM_20'. (NullAllowed)
     */
    public java.math.BigDecimal getTransitNum20() {
        return _transitNum20;
    }

    /**
     * [set] TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残積送中数
     * @param transitNum20 The value of the column 'TRANSIT_NUM_20'. (NullAllowed)
     */
    public void setTransitNum20(java.math.BigDecimal transitNum20) {
        __modifiedProperties.add("transitNum20");
        this._transitNum20 = transitNum20;
    }

    /**
     * [get] CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残引当可能数
     * @return The value of the column 'CHARGE_NUM_LAST'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNumLast() {
        return _chargeNumLast;
    }

    /**
     * [set] CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残引当可能数
     * @param chargeNumLast The value of the column 'CHARGE_NUM_LAST'. (NullAllowed)
     */
    public void setChargeNumLast(java.math.BigDecimal chargeNumLast) {
        __modifiedProperties.add("chargeNumLast");
        this._chargeNumLast = chargeNumLast;
    }

    /**
     * [get] ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残引当済数
     * @return The value of the column 'ALLOC_NUM_LAST'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNumLast() {
        return _allocNumLast;
    }

    /**
     * [set] ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残引当済数
     * @param allocNumLast The value of the column 'ALLOC_NUM_LAST'. (NullAllowed)
     */
    public void setAllocNumLast(java.math.BigDecimal allocNumLast) {
        __modifiedProperties.add("allocNumLast");
        this._allocNumLast = allocNumLast;
    }

    /**
     * [get] MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残移動中数
     * @return The value of the column 'MOVE_NUM_LAST'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNumLast() {
        return _moveNumLast;
    }

    /**
     * [set] MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残移動中数
     * @param moveNumLast The value of the column 'MOVE_NUM_LAST'. (NullAllowed)
     */
    public void setMoveNumLast(java.math.BigDecimal moveNumLast) {
        __modifiedProperties.add("moveNumLast");
        this._moveNumLast = moveNumLast;
    }

    /**
     * [get] TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残積送中数
     * @return The value of the column 'TRANSIT_NUM_LAST'. (NullAllowed)
     */
    public java.math.BigDecimal getTransitNumLast() {
        return _transitNumLast;
    }

    /**
     * [set] TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残積送中数
     * @param transitNumLast The value of the column 'TRANSIT_NUM_LAST'. (NullAllowed)
     */
    public void setTransitNumLast(java.math.BigDecimal transitNumLast) {
        __modifiedProperties.add("transitNumLast");
        this._transitNumLast = transitNumLast;
    }

    /**
     * [get] LAST_STORE_DT: {varchar(8)} <br>
     * 最新入庫年月日
     * @return The value of the column 'LAST_STORE_DT'. (NullAllowed)
     */
    public String getLastStoreDt() {
        return _lastStoreDt;
    }

    /**
     * [set] LAST_STORE_DT: {varchar(8)} <br>
     * 最新入庫年月日
     * @param lastStoreDt The value of the column 'LAST_STORE_DT'. (NullAllowed)
     */
    public void setLastStoreDt(String lastStoreDt) {
        __modifiedProperties.add("lastStoreDt");
        this._lastStoreDt = lastStoreDt;
    }

    /**
     * [get] LAST_PICKING_DT: {varchar(8)} <br>
     * 最新出庫年月日
     * @return The value of the column 'LAST_PICKING_DT'. (NullAllowed)
     */
    public String getLastPickingDt() {
        return _lastPickingDt;
    }

    /**
     * [set] LAST_PICKING_DT: {varchar(8)} <br>
     * 最新出庫年月日
     * @param lastPickingDt The value of the column 'LAST_PICKING_DT'. (NullAllowed)
     */
    public void setLastPickingDt(String lastPickingDt) {
        __modifiedProperties.add("lastPickingDt");
        this._lastPickingDt = lastPickingDt;
    }

    /**
     * [get] LASTRECEIVEDATE: {varchar(8)} <br>
     * 最終入荷日
     * @return The value of the column 'LASTRECEIVEDATE'. (NullAllowed)
     */
    public String getLastreceivedate() {
        return _lastreceivedate;
    }

    /**
     * [set] LASTRECEIVEDATE: {varchar(8)} <br>
     * 最終入荷日
     * @param lastreceivedate The value of the column 'LASTRECEIVEDATE'. (NullAllowed)
     */
    public void setLastreceivedate(String lastreceivedate) {
        __modifiedProperties.add("lastreceivedate");
        this._lastreceivedate = lastreceivedate;
    }

    /**
     * [get] LASTSHIPDATE: {varchar(8)} <br>
     * 最終出荷日
     * @return The value of the column 'LASTSHIPDATE'. (NullAllowed)
     */
    public String getLastshipdate() {
        return _lastshipdate;
    }

    /**
     * [set] LASTSHIPDATE: {varchar(8)} <br>
     * 最終出荷日
     * @param lastshipdate The value of the column 'LASTSHIPDATE'. (NullAllowed)
     */
    public void setLastshipdate(String lastshipdate) {
        __modifiedProperties.add("lastshipdate");
        this._lastshipdate = lastshipdate;
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
