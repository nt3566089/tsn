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
 * The base condition-query of H_SHIPPING_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsHShippingBCQ extends AbstractBsHShippingBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HShippingBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHShippingBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_SHIPPING_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HShippingBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HShippingBCIQ xcreateCIQ() {
        HShippingBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HShippingBCIQ xnewCIQ() {
        return new HShippingBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_SHIPPING_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HShippingBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HShippingBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstBId;
    public ConditionValue xdfgetShippingInstBId()
    { if (_shippingInstBId == null) { _shippingInstBId = nCV(); }
      return _shippingInstBId; }
    protected ConditionValue xgetCValueShippingInstBId() { return xdfgetShippingInstBId(); }

    public Map<String, HPackingBCQ> xdfgetShippingInstBId_ExistsReferrer_HPackingBList() { return xgetSQueMap("shippingInstBId_ExistsReferrer_HPackingBList"); }
    public String keepShippingInstBId_ExistsReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("shippingInstBId_ExistsReferrer_HPackingBList", sq); }

    public Map<String, HShippingSpareCQ> xdfgetShippingInstBId_ExistsReferrer_HShippingSpareAsOne() { return xgetSQueMap("shippingInstBId_ExistsReferrer_HShippingSpareAsOne"); }
    public String keepShippingInstBId_ExistsReferrer_HShippingSpareAsOne(HShippingSpareCQ sq) { return xkeepSQue("shippingInstBId_ExistsReferrer_HShippingSpareAsOne", sq); }

    public Map<String, HPackingBCQ> xdfgetShippingInstBId_NotExistsReferrer_HPackingBList() { return xgetSQueMap("shippingInstBId_NotExistsReferrer_HPackingBList"); }
    public String keepShippingInstBId_NotExistsReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("shippingInstBId_NotExistsReferrer_HPackingBList", sq); }

    public Map<String, HShippingSpareCQ> xdfgetShippingInstBId_NotExistsReferrer_HShippingSpareAsOne() { return xgetSQueMap("shippingInstBId_NotExistsReferrer_HShippingSpareAsOne"); }
    public String keepShippingInstBId_NotExistsReferrer_HShippingSpareAsOne(HShippingSpareCQ sq) { return xkeepSQue("shippingInstBId_NotExistsReferrer_HShippingSpareAsOne", sq); }

    public Map<String, HPackingBCQ> xdfgetShippingInstBId_SpecifyDerivedReferrer_HPackingBList() { return xgetSQueMap("shippingInstBId_SpecifyDerivedReferrer_HPackingBList"); }
    public String keepShippingInstBId_SpecifyDerivedReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("shippingInstBId_SpecifyDerivedReferrer_HPackingBList", sq); }

    public Map<String, HPackingBCQ> xdfgetShippingInstBId_QueryDerivedReferrer_HPackingBList() { return xgetSQueMap("shippingInstBId_QueryDerivedReferrer_HPackingBList"); }
    public String keepShippingInstBId_QueryDerivedReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("shippingInstBId_QueryDerivedReferrer_HPackingBList", sq); }
    public Map<String, Object> xdfgetShippingInstBId_QueryDerivedReferrer_HPackingBListParameter() { return xgetSQuePmMap("shippingInstBId_QueryDerivedReferrer_HPackingBList"); }
    public String keepShippingInstBId_QueryDerivedReferrer_HPackingBListParameter(Object pm) { return xkeepSQuePm("shippingInstBId_QueryDerivedReferrer_HPackingBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShippingInstBId_Asc() { regOBA("SHIPPING_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShippingInstBId_Desc() { regOBD("SHIPPING_INST_B_ID"); return this; }

    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    public Map<String, HShippingHCQ> getShippingInstHId_InScopeRelation_HShippingH() { return xgetSQueMap("shippingInstHId_InScopeRelation_HShippingH"); }
    public String keepShippingInstHId_InScopeRelation_HShippingH(HShippingHCQ sq) { return xkeepSQue("shippingInstHId_InScopeRelation_HShippingH", sq); }

    public Map<String, HShippingHCQ> getShippingInstHId_NotInScopeRelation_HShippingH() { return xgetSQueMap("shippingInstHId_NotInScopeRelation_HShippingH"); }
    public String keepShippingInstHId_NotInScopeRelation_HShippingH(HShippingHCQ sq) { return xkeepSQue("shippingInstHId_NotInScopeRelation_HShippingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _warehouseNm;
    public ConditionValue xdfgetWarehouseNm()
    { if (_warehouseNm == null) { _warehouseNm = nCV(); }
      return _warehouseNm; }
    protected ConditionValue xgetCValueWarehouseNm() { return xdfgetWarehouseNm(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_WarehouseNm_Asc() { regOBA("WAREHOUSE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_WarehouseNm_Desc() { regOBD("WAREHOUSE_NM"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _stockTypeId;
    public ConditionValue xdfgetStockTypeId()
    { if (_stockTypeId == null) { _stockTypeId = nCV(); }
      return _stockTypeId; }
    protected ConditionValue xgetCValueStockTypeId() { return xdfgetStockTypeId(); }

    public Map<String, MStockTypeCQ> getStockTypeId_InScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_InScopeRelation_MStockType"); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_InScopeRelation_MStockType", sq); }

    public Map<String, MStockTypeCQ> getStockTypeId_NotInScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_NotInScopeRelation_MStockType"); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_NotInScopeRelation_MStockType", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _locationNm;
    public ConditionValue xdfgetLocationNm()
    { if (_locationNm == null) { _locationNm = nCV(); }
      return _locationNm; }
    protected ConditionValue xgetCValueLocationNm() { return xdfgetLocationNm(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LocationNm_Asc() { regOBA("LOCATION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LocationNm_Desc() { regOBD("LOCATION_NM"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _depositCd;
    public ConditionValue xdfgetDepositCd()
    { if (_depositCd == null) { _depositCd = nCV(); }
      return _depositCd; }
    protected ConditionValue xgetCValueDepositCd() { return xdfgetDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_DepositCd_Asc() { regOBA("DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_DepositCd_Desc() { regOBD("DEPOSIT_CD"); return this; }

    protected ConditionValue _depositNm;
    public ConditionValue xdfgetDepositNm()
    { if (_depositNm == null) { _depositNm = nCV(); }
      return _depositNm; }
    protected ConditionValue xgetCValueDepositNm() { return xdfgetDepositNm(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_DepositNm_Asc() { regOBA("DEPOSIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_DepositNm_Desc() { regOBD("DEPOSIT_NM"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _storeNoId;
    public ConditionValue xdfgetStoreNoId()
    { if (_storeNoId == null) { _storeNoId = nCV(); }
      return _storeNoId; }
    protected ConditionValue xgetCValueStoreNoId() { return xdfgetStoreNoId(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

    protected ConditionValue _storeLabelNo;
    public ConditionValue xdfgetStoreLabelNo()
    { if (_storeLabelNo == null) { _storeLabelNo = nCV(); }
      return _storeLabelNo; }
    protected ConditionValue xgetCValueStoreLabelNo() { return xdfgetStoreLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

    protected ConditionValue _shapeId;
    public ConditionValue xdfgetShapeId()
    { if (_shapeId == null) { _shapeId = nCV(); }
      return _shapeId; }
    protected ConditionValue xgetCValueShapeId() { return xdfgetShapeId(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

    protected ConditionValue _shapeCd;
    public ConditionValue xdfgetShapeCd()
    { if (_shapeCd == null) { _shapeCd = nCV(); }
      return _shapeCd; }
    protected ConditionValue xgetCValueShapeCd() { return xdfgetShapeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShapeCd_Asc() { regOBA("SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShapeCd_Desc() { regOBD("SHAPE_CD"); return this; }

    protected ConditionValue _shapeNm;
    public ConditionValue xdfgetShapeNm()
    { if (_shapeNm == null) { _shapeNm = nCV(); }
      return _shapeNm; }
    protected ConditionValue xgetCValueShapeNm() { return xdfgetShapeNm(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShapeNm_Asc() { regOBA("SHAPE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShapeNm_Desc() { regOBD("SHAPE_NM"); return this; }

    protected ConditionValue _unitNum;
    public ConditionValue xdfgetUnitNum()
    { if (_unitNum == null) { _unitNum = nCV(); }
      return _unitNum; }
    protected ConditionValue xgetCValueUnitNum() { return xdfgetUnitNum(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

    protected ConditionValue _instNum;
    public ConditionValue xdfgetInstNum()
    { if (_instNum == null) { _instNum = nCV(); }
      return _instNum; }
    protected ConditionValue xgetCValueInstNum() { return xdfgetInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * INST_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

    protected ConditionValue _shippingNum;
    public ConditionValue xdfgetShippingNum()
    { if (_shippingNum == null) { _shippingNum = nCV(); }
      return _shippingNum; }
    protected ConditionValue xgetCValueShippingNum() { return xdfgetShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShippingNum_Asc() { regOBA("SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ShippingNum_Desc() { regOBD("SHIPPING_NUM"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_PRICE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

    protected ConditionValue _price;
    public ConditionValue xdfgetPrice()
    { if (_price == null) { _price = nCV(); }
      return _price; }
    protected ConditionValue xgetCValuePrice() { return xdfgetPrice(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_Price_Asc() { regOBA("PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_Price_Desc() { regOBD("PRICE"); return this; }

    protected ConditionValue _tax;
    public ConditionValue xdfgetTax()
    { if (_tax == null) { _tax = nCV(); }
      return _tax; }
    protected ConditionValue xgetCValueTax() { return xdfgetTax(); }

    /**
     * Add order-by as ascend. <br>
     * TAX: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_Tax_Asc() { regOBA("TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAX: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_Tax_Desc() { regOBD("TAX"); return this; }

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
    public BsHShippingBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHShippingBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHShippingBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHShippingBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHShippingBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHShippingBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHShippingBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHShippingBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHShippingBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHShippingBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHShippingBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHShippingBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HShippingBCQ bq = (HShippingBCQ)bqs;
        HShippingBCQ uq = (HShippingBCQ)uqs;
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryHShippingH()) {
            uq.queryHShippingH().reflectRelationOnUnionQuery(bq.queryHShippingH(), uq.queryHShippingH());
        }
        if (bq.hasConditionQueryHShippingSpareAsOne()) {
            uq.queryHShippingSpareAsOne().reflectRelationOnUnionQuery(bq.queryHShippingSpareAsOne(), uq.queryHShippingSpareAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MStockTypeCQ queryMStockType() {
        return xdfgetConditionQueryMStockType();
    }
    public MStockTypeCQ xdfgetConditionQueryMStockType() {
        String prop = "mStockType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMStockType()); xsetupOuterJoinMStockType(); }
        return xgetQueRlMap(prop);
    }
    protected MStockTypeCQ xcreateQueryMStockType() {
        String nrp = xresolveNRP("H_SHIPPING_B", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_SHIPPING_H by my SHIPPING_INST_H_ID, named 'HShippingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public HShippingHCQ queryHShippingH() {
        return xdfgetConditionQueryHShippingH();
    }
    public HShippingHCQ xdfgetConditionQueryHShippingH() {
        String prop = "hShippingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHShippingH()); xsetupOuterJoinHShippingH(); }
        return xgetQueRlMap(prop);
    }
    protected HShippingHCQ xcreateQueryHShippingH() {
        String nrp = xresolveNRP("H_SHIPPING_B", "hShippingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HShippingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hShippingH", nrp);
    }
    protected void xsetupOuterJoinHShippingH() { xregOutJo("hShippingH"); }
    public boolean hasConditionQueryHShippingH() { return xhasQueRlMap("hShippingH"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_SHIPPING_SPARE by SHIPPING_INST_B_ID, named 'HShippingSpareAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public HShippingSpareCQ queryHShippingSpareAsOne() { return xdfgetConditionQueryHShippingSpareAsOne(); }
    public HShippingSpareCQ xdfgetConditionQueryHShippingSpareAsOne() {
        String prop = "hShippingSpareAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHShippingSpareAsOne()); xsetupOuterJoinHShippingSpareAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected HShippingSpareCQ xcreateQueryHShippingSpareAsOne() {
        String nrp = xresolveNRP("H_SHIPPING_B", "hShippingSpareAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HShippingSpareCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hShippingSpareAsOne", nrp);
    }
    protected void xsetupOuterJoinHShippingSpareAsOne() { xregOutJo("hShippingSpareAsOne"); }
    public boolean hasConditionQueryHShippingSpareAsOne() { return xhasQueRlMap("hShippingSpareAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HShippingBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HShippingBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HShippingBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HShippingBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HShippingBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HShippingBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HShippingBCQ> _myselfExistsMap;
    public Map<String, HShippingBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HShippingBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HShippingBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HShippingBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HShippingBCB.class.getName(); }
    protected String xCQ() { return HShippingBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
