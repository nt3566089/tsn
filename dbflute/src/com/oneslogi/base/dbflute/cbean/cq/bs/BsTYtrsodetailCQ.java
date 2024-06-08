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
 * The base condition-query of T_YTRSODETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTYtrsodetailCQ extends AbstractBsTYtrsodetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TYtrsodetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTYtrsodetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_YTRSODETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TYtrsodetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TYtrsodetailCIQ xcreateCIQ() {
        TYtrsodetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TYtrsodetailCIQ xnewCIQ() {
        return new TYtrsodetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_YTRSODETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TYtrsodetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TYtrsodetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trsodetailId;
    public ConditionValue xdfgetTrsodetailId()
    { if (_trsodetailId == null) { _trsodetailId = nCV(); }
      return _trsodetailId; }
    protected ConditionValue xgetCValueTrsodetailId() { return xdfgetTrsodetailId(); }

    public Map<String, TTrimallocschkriCQ> xdfgetTrsodetailId_ExistsReferrer_TTrimallocschkriList() { return xgetSQueMap("trsodetailId_ExistsReferrer_TTrimallocschkriList"); }
    public String keepTrsodetailId_ExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq) { return xkeepSQue("trsodetailId_ExistsReferrer_TTrimallocschkriList", sq); }

    public Map<String, TTrpickdetailCQ> xdfgetTrsodetailId_ExistsReferrer_TTrpickdetailList() { return xgetSQueMap("trsodetailId_ExistsReferrer_TTrpickdetailList"); }
    public String keepTrsodetailId_ExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq) { return xkeepSQue("trsodetailId_ExistsReferrer_TTrpickdetailList", sq); }

    public Map<String, TTrimallocschkriCQ> xdfgetTrsodetailId_NotExistsReferrer_TTrimallocschkriList() { return xgetSQueMap("trsodetailId_NotExistsReferrer_TTrimallocschkriList"); }
    public String keepTrsodetailId_NotExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq) { return xkeepSQue("trsodetailId_NotExistsReferrer_TTrimallocschkriList", sq); }

    public Map<String, TTrpickdetailCQ> xdfgetTrsodetailId_NotExistsReferrer_TTrpickdetailList() { return xgetSQueMap("trsodetailId_NotExistsReferrer_TTrpickdetailList"); }
    public String keepTrsodetailId_NotExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq) { return xkeepSQue("trsodetailId_NotExistsReferrer_TTrpickdetailList", sq); }

    public Map<String, TTrimallocschkriCQ> xdfgetTrsodetailId_SpecifyDerivedReferrer_TTrimallocschkriList() { return xgetSQueMap("trsodetailId_SpecifyDerivedReferrer_TTrimallocschkriList"); }
    public String keepTrsodetailId_SpecifyDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq) { return xkeepSQue("trsodetailId_SpecifyDerivedReferrer_TTrimallocschkriList", sq); }

    public Map<String, TTrpickdetailCQ> xdfgetTrsodetailId_SpecifyDerivedReferrer_TTrpickdetailList() { return xgetSQueMap("trsodetailId_SpecifyDerivedReferrer_TTrpickdetailList"); }
    public String keepTrsodetailId_SpecifyDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq) { return xkeepSQue("trsodetailId_SpecifyDerivedReferrer_TTrpickdetailList", sq); }

    public Map<String, TTrimallocschkriCQ> xdfgetTrsodetailId_QueryDerivedReferrer_TTrimallocschkriList() { return xgetSQueMap("trsodetailId_QueryDerivedReferrer_TTrimallocschkriList"); }
    public String keepTrsodetailId_QueryDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq) { return xkeepSQue("trsodetailId_QueryDerivedReferrer_TTrimallocschkriList", sq); }
    public Map<String, Object> xdfgetTrsodetailId_QueryDerivedReferrer_TTrimallocschkriListParameter() { return xgetSQuePmMap("trsodetailId_QueryDerivedReferrer_TTrimallocschkriList"); }
    public String keepTrsodetailId_QueryDerivedReferrer_TTrimallocschkriListParameter(Object pm) { return xkeepSQuePm("trsodetailId_QueryDerivedReferrer_TTrimallocschkriList", pm); }

    public Map<String, TTrpickdetailCQ> xdfgetTrsodetailId_QueryDerivedReferrer_TTrpickdetailList() { return xgetSQueMap("trsodetailId_QueryDerivedReferrer_TTrpickdetailList"); }
    public String keepTrsodetailId_QueryDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq) { return xkeepSQue("trsodetailId_QueryDerivedReferrer_TTrpickdetailList", sq); }
    public Map<String, Object> xdfgetTrsodetailId_QueryDerivedReferrer_TTrpickdetailListParameter() { return xgetSQuePmMap("trsodetailId_QueryDerivedReferrer_TTrpickdetailList"); }
    public String keepTrsodetailId_QueryDerivedReferrer_TTrpickdetailListParameter(Object pm) { return xkeepSQuePm("trsodetailId_QueryDerivedReferrer_TTrpickdetailList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_TrsodetailId_Asc() { regOBA("TRSODETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_TrsodetailId_Desc() { regOBD("TRSODETAIL_ID"); return this; }

    protected ConditionValue _trsoId;
    public ConditionValue xdfgetTrsoId()
    { if (_trsoId == null) { _trsoId = nCV(); }
      return _trsoId; }
    protected ConditionValue xgetCValueTrsoId() { return xdfgetTrsoId(); }

    public Map<String, TYtrsoCQ> getTrsoId_InScopeRelation_TYtrso() { return xgetSQueMap("trsoId_InScopeRelation_TYtrso"); }
    public String keepTrsoId_InScopeRelation_TYtrso(TYtrsoCQ sq) { return xkeepSQue("trsoId_InScopeRelation_TYtrso", sq); }

    public Map<String, TYtrsoCQ> getTrsoId_NotInScopeRelation_TYtrso() { return xgetSQueMap("trsoId_NotInScopeRelation_TYtrso"); }
    public String keepTrsoId_NotInScopeRelation_TYtrso(TYtrsoCQ sq) { return xkeepSQue("trsoId_NotInScopeRelation_TYtrso", sq); }

    /**
     * Add order-by as ascend. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_TrsoId_Asc() { regOBA("TRSO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_TrsoId_Desc() { regOBD("TRSO_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, MProductCQ> getProductId_InScopeRelation_MProduct() { return xgetSQueMap("productId_InScopeRelation_MProduct"); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_InScopeRelation_MProduct", sq); }

    public Map<String, MProductCQ> getProductId_NotInScopeRelation_MProduct() { return xgetSQueMap("productId_NotInScopeRelation_MProduct"); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_MProduct", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _soLineNo;
    public ConditionValue xdfgetSoLineNo()
    { if (_soLineNo == null) { _soLineNo = nCV(); }
      return _soLineNo; }
    protected ConditionValue xgetCValueSoLineNo() { return xdfgetSoLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_SoLineNo_Asc() { regOBA("SO_LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_SoLineNo_Desc() { regOBD("SO_LINE_NO"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_IfitemCd_Asc() { regOBA("IFITEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFITEM_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_IfitemCd_Desc() { regOBD("IFITEM_CD"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _damageFlg;
    public ConditionValue xdfgetDamageFlg()
    { if (_damageFlg == null) { _damageFlg = nCV(); }
      return _damageFlg; }
    protected ConditionValue xgetCValueDamageFlg() { return xdfgetDamageFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_DamageFlg_Asc() { regOBA("DAMAGE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_DamageFlg_Desc() { regOBD("DAMAGE_FLG"); return this; }

    protected ConditionValue _noShippingFlg;
    public ConditionValue xdfgetNoShippingFlg()
    { if (_noShippingFlg == null) { _noShippingFlg = nCV(); }
      return _noShippingFlg; }
    protected ConditionValue xgetCValueNoShippingFlg() { return xdfgetNoShippingFlg(); }

    /**
     * Add order-by as ascend. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_NoShippingFlg_Asc() { regOBA("NO_SHIPPING_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_NoShippingFlg_Desc() { regOBD("NO_SHIPPING_FLG"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_ExpectQty_Asc() { regOBA("EXPECT_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_ExpectQty_Desc() { regOBD("EXPECT_QTY"); return this; }

    protected ConditionValue _allocQty;
    public ConditionValue xdfgetAllocQty()
    { if (_allocQty == null) { _allocQty = nCV(); }
      return _allocQty; }
    protected ConditionValue xgetCValueAllocQty() { return xdfgetAllocQty(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_AllocQty_Asc() { regOBA("ALLOC_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_AllocQty_Desc() { regOBD("ALLOC_QTY"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_PickedQty_Asc() { regOBA("PICKED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_PickedQty_Desc() { regOBD("PICKED_QTY"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_SortedQty_Asc() { regOBA("SORTED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_SortedQty_Desc() { regOBD("SORTED_QTY"); return this; }

    protected ConditionValue _inspectedQty;
    public ConditionValue xdfgetInspectedQty()
    { if (_inspectedQty == null) { _inspectedQty = nCV(); }
      return _inspectedQty; }
    protected ConditionValue xgetCValueInspectedQty() { return xdfgetInspectedQty(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_InspectedQty_Asc() { regOBA("INSPECTED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_InspectedQty_Desc() { regOBD("INSPECTED_QTY"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_ShippedQty_Asc() { regOBA("SHIPPED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_ShippedQty_Desc() { regOBD("SHIPPED_QTY"); return this; }

    protected ConditionValue _adjustQty;
    public ConditionValue xdfgetAdjustQty()
    { if (_adjustQty == null) { _adjustQty = nCV(); }
      return _adjustQty; }
    protected ConditionValue xgetCValueAdjustQty() { return xdfgetAdjustQty(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_AdjustQty_Asc() { regOBA("ADJUST_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_AdjustQty_Desc() { regOBD("ADJUST_QTY"); return this; }

    protected ConditionValue _locFlg;
    public ConditionValue xdfgetLocFlg()
    { if (_locFlg == null) { _locFlg = nCV(); }
      return _locFlg; }
    protected ConditionValue xgetCValueLocFlg() { return xdfgetLocFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_LocFlg_Asc() { regOBA("LOC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_LocFlg_Desc() { regOBD("LOC_FLG"); return this; }

    protected ConditionValue _stdDifFlg;
    public ConditionValue xdfgetStdDifFlg()
    { if (_stdDifFlg == null) { _stdDifFlg = nCV(); }
      return _stdDifFlg; }
    protected ConditionValue xgetCValueStdDifFlg() { return xdfgetStdDifFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_StdDifFlg_Asc() { regOBA("STD_DIF_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_StdDifFlg_Desc() { regOBD("STD_DIF_FLG"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTYtrsodetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTYtrsodetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTYtrsodetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTYtrsodetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TYtrsodetailCQ bq = (TYtrsodetailCQ)bqs;
        TYtrsodetailCQ uq = (TYtrsodetailCQ)uqs;
        if (bq.hasConditionQueryTYtrso()) {
            uq.queryTYtrso().reflectRelationOnUnionQuery(bq.queryTYtrso(), uq.queryTYtrso());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_YTRSO by my TRSO_ID, named 'TYtrso'.
     * @return The instance of condition-query. (NotNull)
     */
    public TYtrsoCQ queryTYtrso() {
        return xdfgetConditionQueryTYtrso();
    }
    public TYtrsoCQ xdfgetConditionQueryTYtrso() {
        String prop = "tYtrso";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTYtrso()); xsetupOuterJoinTYtrso(); }
        return xgetQueRlMap(prop);
    }
    protected TYtrsoCQ xcreateQueryTYtrso() {
        String nrp = xresolveNRP("T_YTRSODETAIL", "tYtrso"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TYtrsoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tYtrso", nrp);
    }
    protected void xsetupOuterJoinTYtrso() { xregOutJo("tYtrso"); }
    public boolean hasConditionQueryTYtrso() { return xhasQueRlMap("tYtrso"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProduct() {
        return xdfgetConditionQueryMProduct();
    }
    public MProductCQ xdfgetConditionQueryMProduct() {
        String prop = "mProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProduct()); xsetupOuterJoinMProduct(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProduct() {
        String nrp = xresolveNRP("T_YTRSODETAIL", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TYtrsodetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TYtrsodetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TYtrsodetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TYtrsodetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TYtrsodetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TYtrsodetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TYtrsodetailCQ> _myselfExistsMap;
    public Map<String, TYtrsodetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TYtrsodetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TYtrsodetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TYtrsodetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TYtrsodetailCB.class.getName(); }
    protected String xCQ() { return TYtrsodetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
