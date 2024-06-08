package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of T_TRPICKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrpickdetailCQ extends AbstractBsTTrpickdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrpickdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpickdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRPICKDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrpickdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrpickdetailCIQ xcreateCIQ() {
        TTrpickdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrpickdetailCIQ xnewCIQ() {
        return new TTrpickdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRPICKDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrpickdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrpickdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trpickdetailId;
    public ConditionValue xdfgetTrpickdetailId()
    { if (_trpickdetailId == null) { _trpickdetailId = nCV(); }
      return _trpickdetailId; }
    protected ConditionValue xgetCValueTrpickdetailId() { return xdfgetTrpickdetailId(); }

    public Map<String, TTrPicklistCQ> xdfgetTrpickdetailId_ExistsReferrer_TTrPicklistList() { return xgetSQueMap("trpickdetailId_ExistsReferrer_TTrPicklistList"); }
    public String keepTrpickdetailId_ExistsReferrer_TTrPicklistList(TTrPicklistCQ sq) { return xkeepSQue("trpickdetailId_ExistsReferrer_TTrPicklistList", sq); }

    public Map<String, TTrPicklistCQ> xdfgetTrpickdetailId_NotExistsReferrer_TTrPicklistList() { return xgetSQueMap("trpickdetailId_NotExistsReferrer_TTrPicklistList"); }
    public String keepTrpickdetailId_NotExistsReferrer_TTrPicklistList(TTrPicklistCQ sq) { return xkeepSQue("trpickdetailId_NotExistsReferrer_TTrPicklistList", sq); }

    public Map<String, TTrPicklistCQ> xdfgetTrpickdetailId_SpecifyDerivedReferrer_TTrPicklistList() { return xgetSQueMap("trpickdetailId_SpecifyDerivedReferrer_TTrPicklistList"); }
    public String keepTrpickdetailId_SpecifyDerivedReferrer_TTrPicklistList(TTrPicklistCQ sq) { return xkeepSQue("trpickdetailId_SpecifyDerivedReferrer_TTrPicklistList", sq); }

    public Map<String, TTrPicklistCQ> xdfgetTrpickdetailId_QueryDerivedReferrer_TTrPicklistList() { return xgetSQueMap("trpickdetailId_QueryDerivedReferrer_TTrPicklistList"); }
    public String keepTrpickdetailId_QueryDerivedReferrer_TTrPicklistList(TTrPicklistCQ sq) { return xkeepSQue("trpickdetailId_QueryDerivedReferrer_TTrPicklistList", sq); }
    public Map<String, Object> xdfgetTrpickdetailId_QueryDerivedReferrer_TTrPicklistListParameter() { return xgetSQuePmMap("trpickdetailId_QueryDerivedReferrer_TTrPicklistList"); }
    public String keepTrpickdetailId_QueryDerivedReferrer_TTrPicklistListParameter(Object pm) { return xkeepSQuePm("trpickdetailId_QueryDerivedReferrer_TTrPicklistList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_TrpickdetailId_Asc() { regOBA("TRPICKDETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_TrpickdetailId_Desc() { regOBD("TRPICKDETAIL_ID"); return this; }

    protected ConditionValue _trsodetailId;
    public ConditionValue xdfgetTrsodetailId()
    { if (_trsodetailId == null) { _trsodetailId = nCV(); }
      return _trsodetailId; }
    protected ConditionValue xgetCValueTrsodetailId() { return xdfgetTrsodetailId(); }

    public Map<String, TYtrsodetailCQ> getTrsodetailId_InScopeRelation_TYtrsodetail() { return xgetSQueMap("trsodetailId_InScopeRelation_TYtrsodetail"); }
    public String keepTrsodetailId_InScopeRelation_TYtrsodetail(TYtrsodetailCQ sq) { return xkeepSQue("trsodetailId_InScopeRelation_TYtrsodetail", sq); }

    public Map<String, TYtrsodetailCQ> getTrsodetailId_NotInScopeRelation_TYtrsodetail() { return xgetSQueMap("trsodetailId_NotInScopeRelation_TYtrsodetail"); }
    public String keepTrsodetailId_NotInScopeRelation_TYtrsodetail(TYtrsodetailCQ sq) { return xkeepSQue("trsodetailId_NotInScopeRelation_TYtrsodetail", sq); }

    /**
     * Add order-by as ascend. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_TrsodetailId_Asc() { regOBA("TRSODETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_TrsodetailId_Desc() { regOBD("TRSODETAIL_ID"); return this; }

    protected ConditionValue _moveInstHId;
    public ConditionValue xdfgetMoveInstHId()
    { if (_moveInstHId == null) { _moveInstHId = nCV(); }
      return _moveInstHId; }
    protected ConditionValue xgetCValueMoveInstHId() { return xdfgetMoveInstHId(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_MoveInstHId_Asc() { regOBA("MOVE_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_MoveInstHId_Desc() { regOBD("MOVE_INST_H_ID"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, TStockCQ> getStockId_InScopeRelation_TStock() { return xgetSQueMap("stockId_InScopeRelation_TStock"); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_TStock", sq); }

    public Map<String, TStockCQ> getStockId_NotInScopeRelation_TStock() { return xgetSQueMap("stockId_NotInScopeRelation_TStock"); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_TStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    public Map<String, MLocationCQ> getLocationId_InScopeRelation_MLocation() { return xgetSQueMap("locationId_InScopeRelation_MLocation"); }
    public String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locationId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getLocationId_NotInScopeRelation_MLocation() { return xgetSQueMap("locationId_NotInScopeRelation_MLocation"); }
    public String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locationId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _pickBatchKey;
    public ConditionValue xdfgetPickBatchKey()
    { if (_pickBatchKey == null) { _pickBatchKey = nCV(); }
      return _pickBatchKey; }
    protected ConditionValue xgetCValuePickBatchKey() { return xdfgetPickBatchKey(); }

    /**
     * Add order-by as ascend. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PickBatchKey_Asc() { regOBA("PICK_BATCH_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PickBatchKey_Desc() { regOBD("PICK_BATCH_KEY"); return this; }

    protected ConditionValue _pickBatchLineNo;
    public ConditionValue xdfgetPickBatchLineNo()
    { if (_pickBatchLineNo == null) { _pickBatchLineNo = nCV(); }
      return _pickBatchLineNo; }
    protected ConditionValue xgetCValuePickBatchLineNo() { return xdfgetPickBatchLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PickBatchLineNo_Asc() { regOBA("PICK_BATCH_LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PickBatchLineNo_Desc() { regOBD("PICK_BATCH_LINE_NO"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _ifitemCd;
    public ConditionValue xdfgetIfitemCd()
    { if (_ifitemCd == null) { _ifitemCd = nCV(); }
      return _ifitemCd; }
    protected ConditionValue xgetCValueIfitemCd() { return xdfgetIfitemCd(); }

    /**
     * Add order-by as ascend. <br>
     * IFITEM_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_IfitemCd_Asc() { regOBA("IFITEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFITEM_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_IfitemCd_Desc() { regOBD("IFITEM_CD"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _expectQty;
    public ConditionValue xdfgetExpectQty()
    { if (_expectQty == null) { _expectQty = nCV(); }
      return _expectQty; }
    protected ConditionValue xgetCValueExpectQty() { return xdfgetExpectQty(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ExpectQty_Asc() { regOBA("EXPECT_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ExpectQty_Desc() { regOBD("EXPECT_QTY"); return this; }

    protected ConditionValue _pickedQty;
    public ConditionValue xdfgetPickedQty()
    { if (_pickedQty == null) { _pickedQty = nCV(); }
      return _pickedQty; }
    protected ConditionValue xgetCValuePickedQty() { return xdfgetPickedQty(); }

    /**
     * Add order-by as ascend. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PickedQty_Asc() { regOBA("PICKED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PickedQty_Desc() { regOBD("PICKED_QTY"); return this; }

    protected ConditionValue _sortedQty;
    public ConditionValue xdfgetSortedQty()
    { if (_sortedQty == null) { _sortedQty = nCV(); }
      return _sortedQty; }
    protected ConditionValue xgetCValueSortedQty() { return xdfgetSortedQty(); }

    /**
     * Add order-by as ascend. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_SortedQty_Asc() { regOBA("SORTED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_SortedQty_Desc() { regOBD("SORTED_QTY"); return this; }

    protected ConditionValue _shippedQty;
    public ConditionValue xdfgetShippedQty()
    { if (_shippedQty == null) { _shippedQty = nCV(); }
      return _shippedQty; }
    protected ConditionValue xgetCValueShippedQty() { return xdfgetShippedQty(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ShippedQty_Asc() { regOBA("SHIPPED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ShippedQty_Desc() { regOBD("SHIPPED_QTY"); return this; }

    protected ConditionValue _pickUserCd;
    public ConditionValue xdfgetPickUserCd()
    { if (_pickUserCd == null) { _pickUserCd = nCV(); }
      return _pickUserCd; }
    protected ConditionValue xgetCValuePickUserCd() { return xdfgetPickUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * PICK_USER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PickUserCd_Asc() { regOBA("PICK_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICK_USER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PickUserCd_Desc() { regOBD("PICK_USER_CD"); return this; }

    protected ConditionValue _labelPrintedFlg;
    public ConditionValue xdfgetLabelPrintedFlg()
    { if (_labelPrintedFlg == null) { _labelPrintedFlg = nCV(); }
      return _labelPrintedFlg; }
    protected ConditionValue xgetCValueLabelPrintedFlg() { return xdfgetLabelPrintedFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_LabelPrintedFlg_Asc() { regOBA("LABEL_PRINTED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_LabelPrintedFlg_Desc() { regOBD("LABEL_PRINTED_FLG"); return this; }

    protected ConditionValue _monthFlg;
    public ConditionValue xdfgetMonthFlg()
    { if (_monthFlg == null) { _monthFlg = nCV(); }
      return _monthFlg; }
    protected ConditionValue xgetCValueMonthFlg() { return xdfgetMonthFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MONTH_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_MonthFlg_Asc() { regOBA("MONTH_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_MonthFlg_Desc() { regOBD("MONTH_FLG"); return this; }

    protected ConditionValue _plBatchKey;
    public ConditionValue xdfgetPlBatchKey()
    { if (_plBatchKey == null) { _plBatchKey = nCV(); }
      return _plBatchKey; }
    protected ConditionValue xgetCValuePlBatchKey() { return xdfgetPlBatchKey(); }

    /**
     * Add order-by as ascend. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PlBatchKey_Asc() { regOBA("PL_BATCH_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_PlBatchKey_Desc() { regOBD("PL_BATCH_KEY"); return this; }

    protected ConditionValue _workallocatename;
    public ConditionValue xdfgetWorkallocatename()
    { if (_workallocatename == null) { _workallocatename = nCV(); }
      return _workallocatename; }
    protected ConditionValue xgetCValueWorkallocatename() { return xdfgetWorkallocatename(); }

    /**
     * Add order-by as ascend. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_Workallocatename_Asc() { regOBA("WORKALLOCATENAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_Workallocatename_Desc() { regOBD("WORKALLOCATENAME"); return this; }

    protected ConditionValue _alertflg;
    public ConditionValue xdfgetAlertflg()
    { if (_alertflg == null) { _alertflg = nCV(); }
      return _alertflg; }
    protected ConditionValue xgetCValueAlertflg() { return xdfgetAlertflg(); }

    /**
     * Add order-by as ascend. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_Alertflg_Asc() { regOBA("ALERTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_Alertflg_Desc() { regOBD("ALERTFLG"); return this; }

    protected ConditionValue _reverseFlg;
    public ConditionValue xdfgetReverseFlg()
    { if (_reverseFlg == null) { _reverseFlg = nCV(); }
      return _reverseFlg; }
    protected ConditionValue xgetCValueReverseFlg() { return xdfgetReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * REVERSE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ReverseFlg_Asc() { regOBA("REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * REVERSE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ReverseFlg_Desc() { regOBD("REVERSE_FLG"); return this; }

    protected ConditionValue _reverseListOutputFlg;
    public ConditionValue xdfgetReverseListOutputFlg()
    { if (_reverseListOutputFlg == null) { _reverseListOutputFlg = nCV(); }
      return _reverseListOutputFlg; }
    protected ConditionValue xgetCValueReverseListOutputFlg() { return xdfgetReverseListOutputFlg(); }

    /**
     * Add order-by as ascend. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ReverseListOutputFlg_Asc() { regOBA("REVERSE_LIST_OUTPUT__FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ReverseListOutputFlg_Desc() { regOBD("REVERSE_LIST_OUTPUT__FLG"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTTrpickdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrpickdetailCQ bq = (TTrpickdetailCQ)bqs;
        TTrpickdetailCQ uq = (TTrpickdetailCQ)uqs;
        if (bq.hasConditionQueryTStock()) {
            uq.queryTStock().reflectRelationOnUnionQuery(bq.queryTStock(), uq.queryTStock());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryTYtrsodetail()) {
            uq.queryTYtrsodetail().reflectRelationOnUnionQuery(bq.queryTYtrsodetail(), uq.queryTYtrsodetail());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockCQ queryTStock() {
        return xdfgetConditionQueryTStock();
    }
    public TStockCQ xdfgetConditionQueryTStock() {
        String prop = "tStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStock()); xsetupOuterJoinTStock(); }
        return xgetQueRlMap(prop);
    }
    protected TStockCQ xcreateQueryTStock() {
        String nrp = xresolveNRP("T_TRPICKDETAIL", "tStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStock", nrp);
    }
    protected void xsetupOuterJoinTStock() { xregOutJo("tStock"); }
    public boolean hasConditionQueryTStock() { return xhasQueRlMap("tStock"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The instance of condition-query. (NotNull)
     */
    public MLocationCQ queryMLocation() {
        return xdfgetConditionQueryMLocation();
    }
    public MLocationCQ xdfgetConditionQueryMLocation() {
        String prop = "mLocation";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMLocation()); xsetupOuterJoinMLocation(); }
        return xgetQueRlMap(prop);
    }
    protected MLocationCQ xcreateQueryMLocation() {
        String nrp = xresolveNRP("T_TRPICKDETAIL", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @return The instance of condition-query. (NotNull)
     */
    public TYtrsodetailCQ queryTYtrsodetail() {
        return xdfgetConditionQueryTYtrsodetail();
    }
    public TYtrsodetailCQ xdfgetConditionQueryTYtrsodetail() {
        String prop = "tYtrsodetail";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTYtrsodetail()); xsetupOuterJoinTYtrsodetail(); }
        return xgetQueRlMap(prop);
    }
    protected TYtrsodetailCQ xcreateQueryTYtrsodetail() {
        String nrp = xresolveNRP("T_TRPICKDETAIL", "tYtrsodetail"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TYtrsodetailCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tYtrsodetail", nrp);
    }
    protected void xsetupOuterJoinTYtrsodetail() { xregOutJo("tYtrsodetail"); }
    public boolean hasConditionQueryTYtrsodetail() { return xhasQueRlMap("tYtrsodetail"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrpickdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrpickdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrpickdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrpickdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrpickdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrpickdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrpickdetailCQ> _myselfExistsMap;
    public Map<String, TTrpickdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrpickdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrpickdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrpickdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrpickdetailCB.class.getName(); }
    protected String xCQ() { return TTrpickdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
