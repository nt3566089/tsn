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
 * The base condition-query of T_PICKING_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPickingBCQ extends AbstractBsTPickingBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPickingBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_PICKING_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPickingBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPickingBCIQ xcreateCIQ() {
        TPickingBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPickingBCIQ xnewCIQ() {
        return new TPickingBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_PICKING_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPickingBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPickingBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pickingBId;
    public ConditionValue xdfgetPickingBId()
    { if (_pickingBId == null) { _pickingBId = nCV(); }
      return _pickingBId; }
    protected ConditionValue xgetCValuePickingBId() { return xdfgetPickingBId(); }

    public Map<String, TPackingBCQ> xdfgetPickingBId_ExistsReferrer_TPackingBList() { return xgetSQueMap("pickingBId_ExistsReferrer_TPackingBList"); }
    public String keepPickingBId_ExistsReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("pickingBId_ExistsReferrer_TPackingBList", sq); }

    public Map<String, TPackingBCQ> xdfgetPickingBId_NotExistsReferrer_TPackingBList() { return xgetSQueMap("pickingBId_NotExistsReferrer_TPackingBList"); }
    public String keepPickingBId_NotExistsReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("pickingBId_NotExistsReferrer_TPackingBList", sq); }

    public Map<String, TPackingBCQ> xdfgetPickingBId_SpecifyDerivedReferrer_TPackingBList() { return xgetSQueMap("pickingBId_SpecifyDerivedReferrer_TPackingBList"); }
    public String keepPickingBId_SpecifyDerivedReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("pickingBId_SpecifyDerivedReferrer_TPackingBList", sq); }

    public Map<String, TPackingBCQ> xdfgetPickingBId_QueryDerivedReferrer_TPackingBList() { return xgetSQueMap("pickingBId_QueryDerivedReferrer_TPackingBList"); }
    public String keepPickingBId_QueryDerivedReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("pickingBId_QueryDerivedReferrer_TPackingBList", sq); }
    public Map<String, Object> xdfgetPickingBId_QueryDerivedReferrer_TPackingBListParameter() { return xgetSQuePmMap("pickingBId_QueryDerivedReferrer_TPackingBList"); }
    public String keepPickingBId_QueryDerivedReferrer_TPackingBListParameter(Object pm) { return xkeepSQuePm("pickingBId_QueryDerivedReferrer_TPackingBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_PickingBId_Asc() { regOBA("PICKING_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_PickingBId_Desc() { regOBD("PICKING_B_ID"); return this; }

    protected ConditionValue _pickingHId;
    public ConditionValue xdfgetPickingHId()
    { if (_pickingHId == null) { _pickingHId = nCV(); }
      return _pickingHId; }
    protected ConditionValue xgetCValuePickingHId() { return xdfgetPickingHId(); }

    public Map<String, TPickingHCQ> getPickingHId_InScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_InScopeRelation_TPickingH"); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_InScopeRelation_TPickingH", sq); }

    public Map<String, TPickingHCQ> getPickingHId_NotInScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_NotInScopeRelation_TPickingH"); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_NotInScopeRelation_TPickingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_H_ID: {IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_PickingHId_Asc() { regOBA("PICKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_H_ID: {IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_PickingHId_Desc() { regOBD("PICKING_H_ID"); return this; }

    protected ConditionValue _shippingInstBId;
    public ConditionValue xdfgetShippingInstBId()
    { if (_shippingInstBId == null) { _shippingInstBId = nCV(); }
      return _shippingInstBId; }
    protected ConditionValue xgetCValueShippingInstBId() { return xdfgetShippingInstBId(); }

    public Map<String, TShippingInstBCQ> getShippingInstBId_InScopeRelation_TShippingInstB() { return xgetSQueMap("shippingInstBId_InScopeRelation_TShippingInstB"); }
    public String keepShippingInstBId_InScopeRelation_TShippingInstB(TShippingInstBCQ sq) { return xkeepSQue("shippingInstBId_InScopeRelation_TShippingInstB", sq); }

    public Map<String, TShippingInstBCQ> getShippingInstBId_NotInScopeRelation_TShippingInstB() { return xgetSQueMap("shippingInstBId_NotInScopeRelation_TShippingInstB"); }
    public String keepShippingInstBId_NotInScopeRelation_TShippingInstB(TShippingInstBCQ sq) { return xkeepSQue("shippingInstBId_NotInScopeRelation_TShippingInstB", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to T_SHIPPING_INST_B}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_ShippingInstBId_Asc() { regOBA("SHIPPING_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to T_SHIPPING_INST_B}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_ShippingInstBId_Desc() { regOBD("SHIPPING_INST_B_ID"); return this; }

    protected ConditionValue _allocInstBId;
    public ConditionValue xdfgetAllocInstBId()
    { if (_allocInstBId == null) { _allocInstBId = nCV(); }
      return _allocInstBId; }
    protected ConditionValue xgetCValueAllocInstBId() { return xdfgetAllocInstBId(); }

    public Map<String, TAllocInstBCQ> getAllocInstBId_InScopeRelation_TAllocInstB() { return xgetSQueMap("allocInstBId_InScopeRelation_TAllocInstB"); }
    public String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq) { return xkeepSQue("allocInstBId_InScopeRelation_TAllocInstB", sq); }

    public Map<String, TAllocInstBCQ> getAllocInstBId_NotInScopeRelation_TAllocInstB() { return xgetSQueMap("allocInstBId_NotInScopeRelation_TAllocInstB"); }
    public String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq) { return xkeepSQue("allocInstBId_NotInScopeRelation_TAllocInstB", sq); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_AllocInstBId_Asc() { regOBA("ALLOC_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_AllocInstBId_Desc() { regOBD("ALLOC_INST_B_ID"); return this; }

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
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _pickingNum;
    public ConditionValue xdfgetPickingNum()
    { if (_pickingNum == null) { _pickingNum = nCV(); }
      return _pickingNum; }
    protected ConditionValue xgetCValuePickingNum() { return xdfgetPickingNum(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_PickingNum_Asc() { regOBA("PICKING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_PickingNum_Desc() { regOBD("PICKING_NUM"); return this; }

    protected ConditionValue _tempNo;
    public ConditionValue xdfgetTempNo()
    { if (_tempNo == null) { _tempNo = nCV(); }
      return _tempNo; }
    protected ConditionValue xgetCValueTempNo() { return xdfgetTempNo(); }

    /**
     * Add order-by as ascend. <br>
     * TEMP_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_TempNo_Asc() { regOBA("TEMP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEMP_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_TempNo_Desc() { regOBD("TEMP_NO"); return this; }

    protected ConditionValue _transitNum;
    public ConditionValue xdfgetTransitNum()
    { if (_transitNum == null) { _transitNum = nCV(); }
      return _transitNum; }
    protected ConditionValue xgetCValueTransitNum() { return xdfgetTransitNum(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSIT_NUM: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_TransitNum_Asc() { regOBA("TRANSIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSIT_NUM: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_TransitNum_Desc() { regOBD("TRANSIT_NUM"); return this; }

    protected ConditionValue _shapeId;
    public ConditionValue xdfgetShapeId()
    { if (_shapeId == null) { _shapeId = nCV(); }
      return _shapeId; }
    protected ConditionValue xgetCValueShapeId() { return xdfgetShapeId(); }

    public Map<String, MShapeCQ> getShapeId_InScopeRelation_MShape() { return xgetSQueMap("shapeId_InScopeRelation_MShape"); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("shapeId_InScopeRelation_MShape", sq); }

    public Map<String, MShapeCQ> getShapeId_NotInScopeRelation_MShape() { return xgetSQueMap("shapeId_NotInScopeRelation_MShape"); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("shapeId_NotInScopeRelation_MShape", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

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
    public BsTPickingBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPickingBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPickingBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPickingBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPickingBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPickingBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPickingBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPickingBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPickingBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPickingBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPickingBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPickingBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPickingBCQ bq = (TPickingBCQ)bqs;
        TPickingBCQ uq = (TPickingBCQ)uqs;
        if (bq.hasConditionQueryTShippingInstB()) {
            uq.queryTShippingInstB().reflectRelationOnUnionQuery(bq.queryTShippingInstB(), uq.queryTShippingInstB());
        }
        if (bq.hasConditionQueryTPickingH()) {
            uq.queryTPickingH().reflectRelationOnUnionQuery(bq.queryTPickingH(), uq.queryTPickingH());
        }
        if (bq.hasConditionQueryTAllocInstB()) {
            uq.queryTAllocInstB().reflectRelationOnUnionQuery(bq.queryTAllocInstB(), uq.queryTAllocInstB());
        }
        if (bq.hasConditionQueryTStock()) {
            uq.queryTStock().reflectRelationOnUnionQuery(bq.queryTStock(), uq.queryTStock());
        }
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_SHIPPING_INST_B by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TShippingInstBCQ queryTShippingInstB() {
        return xdfgetConditionQueryTShippingInstB();
    }
    public TShippingInstBCQ xdfgetConditionQueryTShippingInstB() {
        String prop = "tShippingInstB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTShippingInstB()); xsetupOuterJoinTShippingInstB(); }
        return xgetQueRlMap(prop);
    }
    protected TShippingInstBCQ xcreateQueryTShippingInstB() {
        String nrp = xresolveNRP("T_PICKING_B", "tShippingInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TShippingInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tShippingInstB", nrp);
    }
    protected void xsetupOuterJoinTShippingInstB() { xregOutJo("tShippingInstB"); }
    public boolean hasConditionQueryTShippingInstB() { return xhasQueRlMap("tShippingInstB"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPickingHCQ queryTPickingH() {
        return xdfgetConditionQueryTPickingH();
    }
    public TPickingHCQ xdfgetConditionQueryTPickingH() {
        String prop = "tPickingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPickingH()); xsetupOuterJoinTPickingH(); }
        return xgetQueRlMap(prop);
    }
    protected TPickingHCQ xcreateQueryTPickingH() {
        String nrp = xresolveNRP("T_PICKING_B", "tPickingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingH", nrp);
    }
    protected void xsetupOuterJoinTPickingH() { xregOutJo("tPickingH"); }
    public boolean hasConditionQueryTPickingH() { return xhasQueRlMap("tPickingH"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TAllocInstBCQ queryTAllocInstB() {
        return xdfgetConditionQueryTAllocInstB();
    }
    public TAllocInstBCQ xdfgetConditionQueryTAllocInstB() {
        String prop = "tAllocInstB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTAllocInstB()); xsetupOuterJoinTAllocInstB(); }
        return xgetQueRlMap(prop);
    }
    protected TAllocInstBCQ xcreateQueryTAllocInstB() {
        String nrp = xresolveNRP("T_PICKING_B", "tAllocInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstB", nrp);
    }
    protected void xsetupOuterJoinTAllocInstB() { xregOutJo("tAllocInstB"); }
    public boolean hasConditionQueryTAllocInstB() { return xhasQueRlMap("tAllocInstB"); }

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
        String nrp = xresolveNRP("T_PICKING_B", "tStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStock", nrp);
    }
    protected void xsetupOuterJoinTStock() { xregOutJo("tStock"); }
    public boolean hasConditionQueryTStock() { return xhasQueRlMap("tStock"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShapeCQ queryMShape() {
        return xdfgetConditionQueryMShape();
    }
    public MShapeCQ xdfgetConditionQueryMShape() {
        String prop = "mShape";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShape()); xsetupOuterJoinMShape(); }
        return xgetQueRlMap(prop);
    }
    protected MShapeCQ xcreateQueryMShape() {
        String nrp = xresolveNRP("T_PICKING_B", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TPickingBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPickingBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPickingBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPickingBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPickingBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPickingBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPickingBCQ> _myselfExistsMap;
    public Map<String, TPickingBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPickingBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPickingBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPickingBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPickingBCB.class.getName(); }
    protected String xCQ() { return TPickingBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
