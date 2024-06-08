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
 * The base condition-query of M_SHAPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMShapeCQ extends AbstractBsMShapeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MShapeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMShapeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_SHAPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MShapeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MShapeCIQ xcreateCIQ() {
        MShapeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MShapeCIQ xnewCIQ() {
        return new MShapeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_SHAPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MShapeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MShapeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shapeId;
    public ConditionValue xdfgetShapeId()
    { if (_shapeId == null) { _shapeId = nCV(); }
      return _shapeId; }
    protected ConditionValue xgetCValueShapeId() { return xdfgetShapeId(); }

    public Map<String, HInventoryBCQ> xdfgetShapeId_ExistsReferrer_HInventoryBList() { return xgetSQueMap("shapeId_ExistsReferrer_HInventoryBList"); }
    public String keepShapeId_ExistsReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_HInventoryBList", sq); }

    public Map<String, HStockCQ> xdfgetShapeId_ExistsReferrer_HStockList() { return xgetSQueMap("shapeId_ExistsReferrer_HStockList"); }
    public String keepShapeId_ExistsReferrer_HStockList(HStockCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_HStockList", sq); }

    public Map<String, MShapeGrpDtlCQ> xdfgetShapeId_ExistsReferrer_MShapeGrpDtlList() { return xgetSQueMap("shapeId_ExistsReferrer_MShapeGrpDtlList"); }
    public String keepShapeId_ExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_MShapeGrpDtlList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetShapeId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("shapeId_ExistsReferrer_TAllocInstBList"); }
    public String keepShapeId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetShapeId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("shapeId_ExistsReferrer_TInventoryBList"); }
    public String keepShapeId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetShapeId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("shapeId_ExistsReferrer_TMoveInstBList"); }
    public String keepShapeId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TPickingBCQ> xdfgetShapeId_ExistsReferrer_TPickingBList() { return xgetSQueMap("shapeId_ExistsReferrer_TPickingBList"); }
    public String keepShapeId_ExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShapeId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("shapeId_ExistsReferrer_TShippingInstBList"); }
    public String keepShapeId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetShapeId_ExistsReferrer_TStockList() { return xgetSQueMap("shapeId_ExistsReferrer_TStockList"); }
    public String keepShapeId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("shapeId_ExistsReferrer_TStockList", sq); }

    public Map<String, HInventoryBCQ> xdfgetShapeId_NotExistsReferrer_HInventoryBList() { return xgetSQueMap("shapeId_NotExistsReferrer_HInventoryBList"); }
    public String keepShapeId_NotExistsReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_HInventoryBList", sq); }

    public Map<String, HStockCQ> xdfgetShapeId_NotExistsReferrer_HStockList() { return xgetSQueMap("shapeId_NotExistsReferrer_HStockList"); }
    public String keepShapeId_NotExistsReferrer_HStockList(HStockCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_HStockList", sq); }

    public Map<String, MShapeGrpDtlCQ> xdfgetShapeId_NotExistsReferrer_MShapeGrpDtlList() { return xgetSQueMap("shapeId_NotExistsReferrer_MShapeGrpDtlList"); }
    public String keepShapeId_NotExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_MShapeGrpDtlList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetShapeId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("shapeId_NotExistsReferrer_TAllocInstBList"); }
    public String keepShapeId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetShapeId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("shapeId_NotExistsReferrer_TInventoryBList"); }
    public String keepShapeId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetShapeId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("shapeId_NotExistsReferrer_TMoveInstBList"); }
    public String keepShapeId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TPickingBCQ> xdfgetShapeId_NotExistsReferrer_TPickingBList() { return xgetSQueMap("shapeId_NotExistsReferrer_TPickingBList"); }
    public String keepShapeId_NotExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShapeId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("shapeId_NotExistsReferrer_TShippingInstBList"); }
    public String keepShapeId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetShapeId_NotExistsReferrer_TStockList() { return xgetSQueMap("shapeId_NotExistsReferrer_TStockList"); }
    public String keepShapeId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("shapeId_NotExistsReferrer_TStockList", sq); }

    public Map<String, HInventoryBCQ> xdfgetShapeId_SpecifyDerivedReferrer_HInventoryBList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_HInventoryBList"); }
    public String keepShapeId_SpecifyDerivedReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_HInventoryBList", sq); }

    public Map<String, HStockCQ> xdfgetShapeId_SpecifyDerivedReferrer_HStockList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_HStockList"); }
    public String keepShapeId_SpecifyDerivedReferrer_HStockList(HStockCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_HStockList", sq); }

    public Map<String, MShapeGrpDtlCQ> xdfgetShapeId_SpecifyDerivedReferrer_MShapeGrpDtlList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_MShapeGrpDtlList"); }
    public String keepShapeId_SpecifyDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_MShapeGrpDtlList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetShapeId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepShapeId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetShapeId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepShapeId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetShapeId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepShapeId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TPickingBCQ> xdfgetShapeId_SpecifyDerivedReferrer_TPickingBList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_TPickingBList"); }
    public String keepShapeId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShapeId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepShapeId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetShapeId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("shapeId_SpecifyDerivedReferrer_TStockList"); }
    public String keepShapeId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("shapeId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, HInventoryBCQ> xdfgetShapeId_QueryDerivedReferrer_HInventoryBList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_HInventoryBList"); }
    public String keepShapeId_QueryDerivedReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_HInventoryBList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_HInventoryBListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_HInventoryBList"); }
    public String keepShapeId_QueryDerivedReferrer_HInventoryBListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_HInventoryBList", pm); }

    public Map<String, HStockCQ> xdfgetShapeId_QueryDerivedReferrer_HStockList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_HStockList"); }
    public String keepShapeId_QueryDerivedReferrer_HStockList(HStockCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_HStockList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_HStockListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_HStockList"); }
    public String keepShapeId_QueryDerivedReferrer_HStockListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_HStockList", pm); }

    public Map<String, MShapeGrpDtlCQ> xdfgetShapeId_QueryDerivedReferrer_MShapeGrpDtlList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_MShapeGrpDtlList"); }
    public String keepShapeId_QueryDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_MShapeGrpDtlList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_MShapeGrpDtlListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_MShapeGrpDtlList"); }
    public String keepShapeId_QueryDerivedReferrer_MShapeGrpDtlListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_MShapeGrpDtlList", pm); }

    public Map<String, TAllocInstBCQ> xdfgetShapeId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepShapeId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepShapeId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TInventoryBCQ> xdfgetShapeId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepShapeId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepShapeId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetShapeId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepShapeId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepShapeId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TPickingBCQ> xdfgetShapeId_QueryDerivedReferrer_TPickingBList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_TPickingBList"); }
    public String keepShapeId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_TPickingBList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_TPickingBListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_TPickingBList"); }
    public String keepShapeId_QueryDerivedReferrer_TPickingBListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_TPickingBList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetShapeId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepShapeId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepShapeId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockCQ> xdfgetShapeId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("shapeId_QueryDerivedReferrer_TStockList"); }
    public String keepShapeId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("shapeId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetShapeId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("shapeId_QueryDerivedReferrer_TStockList"); }
    public String keepShapeId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("shapeId_QueryDerivedReferrer_TStockList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

    protected ConditionValue _shapeCd;
    public ConditionValue xdfgetShapeCd()
    { if (_shapeCd == null) { _shapeCd = nCV(); }
      return _shapeCd; }
    protected ConditionValue xgetCValueShapeCd() { return xdfgetShapeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ShapeCd_Asc() { regOBA("SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ShapeCd_Desc() { regOBD("SHAPE_CD"); return this; }

    protected ConditionValue _shapeDictId;
    public ConditionValue xdfgetShapeDictId()
    { if (_shapeDictId == null) { _shapeDictId = nCV(); }
      return _shapeDictId; }
    protected ConditionValue xgetCValueShapeDictId() { return xdfgetShapeDictId(); }

    public Map<String, BDictCQ> getShapeDictId_InScopeRelation_BDictByShapeDictId() { return xgetSQueMap("shapeDictId_InScopeRelation_BDictByShapeDictId"); }
    public String keepShapeDictId_InScopeRelation_BDictByShapeDictId(BDictCQ sq) { return xkeepSQue("shapeDictId_InScopeRelation_BDictByShapeDictId", sq); }

    public Map<String, BDictCQ> getShapeDictId_NotInScopeRelation_BDictByShapeDictId() { return xgetSQueMap("shapeDictId_NotInScopeRelation_BDictByShapeDictId"); }
    public String keepShapeDictId_NotInScopeRelation_BDictByShapeDictId(BDictCQ sq) { return xkeepSQue("shapeDictId_NotInScopeRelation_BDictByShapeDictId", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ShapeDictId_Asc() { regOBA("SHAPE_DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ShapeDictId_Desc() { regOBD("SHAPE_DICT_ID"); return this; }

    protected ConditionValue _shapeUnitDictId;
    public ConditionValue xdfgetShapeUnitDictId()
    { if (_shapeUnitDictId == null) { _shapeUnitDictId = nCV(); }
      return _shapeUnitDictId; }
    protected ConditionValue xgetCValueShapeUnitDictId() { return xdfgetShapeUnitDictId(); }

    public Map<String, BDictCQ> getShapeUnitDictId_InScopeRelation_BDictByShapeUnitDictId() { return xgetSQueMap("shapeUnitDictId_InScopeRelation_BDictByShapeUnitDictId"); }
    public String keepShapeUnitDictId_InScopeRelation_BDictByShapeUnitDictId(BDictCQ sq) { return xkeepSQue("shapeUnitDictId_InScopeRelation_BDictByShapeUnitDictId", sq); }

    public Map<String, BDictCQ> getShapeUnitDictId_NotInScopeRelation_BDictByShapeUnitDictId() { return xgetSQueMap("shapeUnitDictId_NotInScopeRelation_BDictByShapeUnitDictId"); }
    public String keepShapeUnitDictId_NotInScopeRelation_BDictByShapeUnitDictId(BDictCQ sq) { return xkeepSQue("shapeUnitDictId_NotInScopeRelation_BDictByShapeUnitDictId", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ShapeUnitDictId_Asc() { regOBA("SHAPE_UNIT_DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ShapeUnitDictId_Desc() { regOBD("SHAPE_UNIT_DICT_ID"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMShapeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMShapeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMShapeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMShapeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMShapeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMShapeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMShapeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMShapeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMShapeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMShapeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMShapeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MShapeCQ bq = (MShapeCQ)bqs;
        MShapeCQ uq = (MShapeCQ)uqs;
        if (bq.hasConditionQueryVDictByShapeDictId()) {
            uq.xsetParameterMapVDictByShapeDictId(bq.xdfgetParameterMapVDictByShapeDictId());
            uq.xdfgetConditionQueryVDictByShapeDictId().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDictByShapeDictId(), uq.xdfgetConditionQueryVDictByShapeDictId());
        }
        if (bq.hasConditionQueryVDictByShapeUnitDictId()) {
            uq.xsetParameterMapVDictByShapeUnitDictId(bq.xdfgetParameterMapVDictByShapeUnitDictId());
            uq.xdfgetConditionQueryVDictByShapeUnitDictId().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDictByShapeUnitDictId(), uq.xdfgetConditionQueryVDictByShapeUnitDictId());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * V_DICT by my SHAPE_DICT_ID, named 'VDictByShapeDictId'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public VDictCQ queryVDictByShapeDictId(Long cultureId) {
        Map<String, Object> parameterMap = xdfgetParameterMapVDictByShapeDictId();
        parameterMap.put("cultureId", cultureId);
        xassertFCDP("vDictByShapeDictId", parameterMap);
        return xdfgetConditionQueryVDictByShapeDictId();
    }
    public VDictCQ xdfgetConditionQueryVDictByShapeDictId() {
        String prop = "vDictByShapeDictId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVDictByShapeDictId()); xsetupOuterJoinVDictByShapeDictId(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapVDictByShapeDictId;
    public Map<String, Object> xdfgetParameterMapVDictByShapeDictId()
    { if (_parameterMapVDictByShapeDictId == null) { _parameterMapVDictByShapeDictId = newLinkedHashMapSized(4); }
      return _parameterMapVDictByShapeDictId; }
    public void xsetParameterMapVDictByShapeDictId(Map<String, Object> parameterMap)
    { _parameterMapVDictByShapeDictId = parameterMap; } // for UnionQuery
    protected VDictCQ xcreateQueryVDictByShapeDictId() {
        String nrp = xresolveNRP("M_SHAPE", "vDictByShapeDictId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDictByShapeDictId", nrp);
    }
    protected void xsetupOuterJoinVDictByShapeDictId() { xregOutJo("vDictByShapeDictId"); }
    public boolean hasConditionQueryVDictByShapeDictId() { return xhasQueRlMap("vDictByShapeDictId"); }

    /**
     * Get the condition-query for relation table. <br>
     * V_DICT by my SHAPE_UNIT_DICT_ID, named 'VDictByShapeUnitDictId'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public VDictCQ queryVDictByShapeUnitDictId(Long cultureId) {
        Map<String, Object> parameterMap = xdfgetParameterMapVDictByShapeUnitDictId();
        parameterMap.put("cultureId", cultureId);
        xassertFCDP("vDictByShapeUnitDictId", parameterMap);
        return xdfgetConditionQueryVDictByShapeUnitDictId();
    }
    public VDictCQ xdfgetConditionQueryVDictByShapeUnitDictId() {
        String prop = "vDictByShapeUnitDictId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVDictByShapeUnitDictId()); xsetupOuterJoinVDictByShapeUnitDictId(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapVDictByShapeUnitDictId;
    public Map<String, Object> xdfgetParameterMapVDictByShapeUnitDictId()
    { if (_parameterMapVDictByShapeUnitDictId == null) { _parameterMapVDictByShapeUnitDictId = newLinkedHashMapSized(4); }
      return _parameterMapVDictByShapeUnitDictId; }
    public void xsetParameterMapVDictByShapeUnitDictId(Map<String, Object> parameterMap)
    { _parameterMapVDictByShapeUnitDictId = parameterMap; } // for UnionQuery
    protected VDictCQ xcreateQueryVDictByShapeUnitDictId() {
        String nrp = xresolveNRP("M_SHAPE", "vDictByShapeUnitDictId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDictByShapeUnitDictId", nrp);
    }
    protected void xsetupOuterJoinVDictByShapeUnitDictId() { xregOutJo("vDictByShapeUnitDictId"); }
    public boolean hasConditionQueryVDictByShapeUnitDictId() { return xhasQueRlMap("vDictByShapeUnitDictId"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_SHAPE", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDictByShapeDictId".equalsIgnoreCase(property)) { return _parameterMapVDictByShapeDictId; }
        if ("vDictByShapeUnitDictId".equalsIgnoreCase(property)) { return _parameterMapVDictByShapeUnitDictId; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MShapeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MShapeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MShapeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MShapeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MShapeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MShapeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MShapeCQ> _myselfExistsMap;
    public Map<String, MShapeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MShapeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MShapeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MShapeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MShapeCB.class.getName(); }
    protected String xCQ() { return MShapeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
