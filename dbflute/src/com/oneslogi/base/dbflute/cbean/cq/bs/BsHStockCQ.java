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
 * The base condition-query of H_STOCK.
 * @author DBFlute(AutoGenerator)
 */
public class BsHStockCQ extends AbstractBsHStockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HStockCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_STOCK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HStockCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HStockCIQ xcreateCIQ() {
        HStockCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HStockCIQ xnewCIQ() {
        return new HStockCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_STOCK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HStockCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HStockCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, HInventoryBCQ> xdfgetStockId_ExistsReferrer_HInventoryBList() { return xgetSQueMap("stockId_ExistsReferrer_HInventoryBList"); }
    public String keepStockId_ExistsReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("stockId_ExistsReferrer_HInventoryBList", sq); }

    public Map<String, HMoveBCQ> xdfgetStockId_ExistsReferrer_HMoveBList() { return xgetSQueMap("stockId_ExistsReferrer_HMoveBList"); }
    public String keepStockId_ExistsReferrer_HMoveBList(HMoveBCQ sq) { return xkeepSQue("stockId_ExistsReferrer_HMoveBList", sq); }

    public Map<String, HPackingBCQ> xdfgetStockId_ExistsReferrer_HPackingBList() { return xgetSQueMap("stockId_ExistsReferrer_HPackingBList"); }
    public String keepStockId_ExistsReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("stockId_ExistsReferrer_HPackingBList", sq); }

    public Map<String, HReceiveBCQ> xdfgetStockId_ExistsReferrer_HReceiveBList() { return xgetSQueMap("stockId_ExistsReferrer_HReceiveBList"); }
    public String keepStockId_ExistsReferrer_HReceiveBList(HReceiveBCQ sq) { return xkeepSQue("stockId_ExistsReferrer_HReceiveBList", sq); }

    public Map<String, HStockInoutCQ> xdfgetStockId_ExistsReferrer_HStockInoutList() { return xgetSQueMap("stockId_ExistsReferrer_HStockInoutList"); }
    public String keepStockId_ExistsReferrer_HStockInoutList(HStockInoutCQ sq) { return xkeepSQue("stockId_ExistsReferrer_HStockInoutList", sq); }

    public Map<String, HStockReportCQ> xdfgetStockId_ExistsReferrer_HStockReportList() { return xgetSQueMap("stockId_ExistsReferrer_HStockReportList"); }
    public String keepStockId_ExistsReferrer_HStockReportList(HStockReportCQ sq) { return xkeepSQue("stockId_ExistsReferrer_HStockReportList", sq); }

    public Map<String, HInventoryBCQ> xdfgetStockId_NotExistsReferrer_HInventoryBList() { return xgetSQueMap("stockId_NotExistsReferrer_HInventoryBList"); }
    public String keepStockId_NotExistsReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_HInventoryBList", sq); }

    public Map<String, HMoveBCQ> xdfgetStockId_NotExistsReferrer_HMoveBList() { return xgetSQueMap("stockId_NotExistsReferrer_HMoveBList"); }
    public String keepStockId_NotExistsReferrer_HMoveBList(HMoveBCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_HMoveBList", sq); }

    public Map<String, HPackingBCQ> xdfgetStockId_NotExistsReferrer_HPackingBList() { return xgetSQueMap("stockId_NotExistsReferrer_HPackingBList"); }
    public String keepStockId_NotExistsReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_HPackingBList", sq); }

    public Map<String, HReceiveBCQ> xdfgetStockId_NotExistsReferrer_HReceiveBList() { return xgetSQueMap("stockId_NotExistsReferrer_HReceiveBList"); }
    public String keepStockId_NotExistsReferrer_HReceiveBList(HReceiveBCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_HReceiveBList", sq); }

    public Map<String, HStockInoutCQ> xdfgetStockId_NotExistsReferrer_HStockInoutList() { return xgetSQueMap("stockId_NotExistsReferrer_HStockInoutList"); }
    public String keepStockId_NotExistsReferrer_HStockInoutList(HStockInoutCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_HStockInoutList", sq); }

    public Map<String, HStockReportCQ> xdfgetStockId_NotExistsReferrer_HStockReportList() { return xgetSQueMap("stockId_NotExistsReferrer_HStockReportList"); }
    public String keepStockId_NotExistsReferrer_HStockReportList(HStockReportCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_HStockReportList", sq); }

    public Map<String, HInventoryBCQ> xdfgetStockId_SpecifyDerivedReferrer_HInventoryBList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_HInventoryBList"); }
    public String keepStockId_SpecifyDerivedReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_HInventoryBList", sq); }

    public Map<String, HMoveBCQ> xdfgetStockId_SpecifyDerivedReferrer_HMoveBList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_HMoveBList"); }
    public String keepStockId_SpecifyDerivedReferrer_HMoveBList(HMoveBCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_HMoveBList", sq); }

    public Map<String, HPackingBCQ> xdfgetStockId_SpecifyDerivedReferrer_HPackingBList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_HPackingBList"); }
    public String keepStockId_SpecifyDerivedReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_HPackingBList", sq); }

    public Map<String, HReceiveBCQ> xdfgetStockId_SpecifyDerivedReferrer_HReceiveBList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_HReceiveBList"); }
    public String keepStockId_SpecifyDerivedReferrer_HReceiveBList(HReceiveBCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_HReceiveBList", sq); }

    public Map<String, HStockInoutCQ> xdfgetStockId_SpecifyDerivedReferrer_HStockInoutList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_HStockInoutList"); }
    public String keepStockId_SpecifyDerivedReferrer_HStockInoutList(HStockInoutCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_HStockInoutList", sq); }

    public Map<String, HStockReportCQ> xdfgetStockId_SpecifyDerivedReferrer_HStockReportList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_HStockReportList"); }
    public String keepStockId_SpecifyDerivedReferrer_HStockReportList(HStockReportCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_HStockReportList", sq); }

    public Map<String, HInventoryBCQ> xdfgetStockId_QueryDerivedReferrer_HInventoryBList() { return xgetSQueMap("stockId_QueryDerivedReferrer_HInventoryBList"); }
    public String keepStockId_QueryDerivedReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_HInventoryBList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_HInventoryBListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_HInventoryBList"); }
    public String keepStockId_QueryDerivedReferrer_HInventoryBListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_HInventoryBList", pm); }

    public Map<String, HMoveBCQ> xdfgetStockId_QueryDerivedReferrer_HMoveBList() { return xgetSQueMap("stockId_QueryDerivedReferrer_HMoveBList"); }
    public String keepStockId_QueryDerivedReferrer_HMoveBList(HMoveBCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_HMoveBList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_HMoveBListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_HMoveBList"); }
    public String keepStockId_QueryDerivedReferrer_HMoveBListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_HMoveBList", pm); }

    public Map<String, HPackingBCQ> xdfgetStockId_QueryDerivedReferrer_HPackingBList() { return xgetSQueMap("stockId_QueryDerivedReferrer_HPackingBList"); }
    public String keepStockId_QueryDerivedReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_HPackingBList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_HPackingBListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_HPackingBList"); }
    public String keepStockId_QueryDerivedReferrer_HPackingBListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_HPackingBList", pm); }

    public Map<String, HReceiveBCQ> xdfgetStockId_QueryDerivedReferrer_HReceiveBList() { return xgetSQueMap("stockId_QueryDerivedReferrer_HReceiveBList"); }
    public String keepStockId_QueryDerivedReferrer_HReceiveBList(HReceiveBCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_HReceiveBList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_HReceiveBListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_HReceiveBList"); }
    public String keepStockId_QueryDerivedReferrer_HReceiveBListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_HReceiveBList", pm); }

    public Map<String, HStockInoutCQ> xdfgetStockId_QueryDerivedReferrer_HStockInoutList() { return xgetSQueMap("stockId_QueryDerivedReferrer_HStockInoutList"); }
    public String keepStockId_QueryDerivedReferrer_HStockInoutList(HStockInoutCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_HStockInoutList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_HStockInoutListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_HStockInoutList"); }
    public String keepStockId_QueryDerivedReferrer_HStockInoutListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_HStockInoutList", pm); }

    public Map<String, HStockReportCQ> xdfgetStockId_QueryDerivedReferrer_HStockReportList() { return xgetSQueMap("stockId_QueryDerivedReferrer_HStockReportList"); }
    public String keepStockId_QueryDerivedReferrer_HStockReportList(HStockReportCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_HStockReportList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_HStockReportListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_HStockReportList"); }
    public String keepStockId_QueryDerivedReferrer_HStockReportListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_HStockReportList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _clientNm;
    public ConditionValue xdfgetClientNm()
    { if (_clientNm == null) { _clientNm = nCV(); }
      return _clientNm; }
    protected ConditionValue xgetCValueClientNm() { return xdfgetClientNm(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ClientNm_Asc() { regOBA("CLIENT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ClientNm_Desc() { regOBD("CLIENT_NM"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _centerNm;
    public ConditionValue xdfgetCenterNm()
    { if (_centerNm == null) { _centerNm = nCV(); }
      return _centerNm; }
    protected ConditionValue xgetCValueCenterNm() { return xdfgetCenterNm(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_CenterNm_Asc() { regOBA("CENTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_CenterNm_Desc() { regOBD("CENTER_NM"); return this; }

    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

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
    public BsHStockCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

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
    public BsHStockCQ addOrderBy_WarehouseNm_Asc() { regOBA("WAREHOUSE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_WarehouseNm_Desc() { regOBD("WAREHOUSE_NM"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsHStockCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsHStockCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _productAbbr;
    public ConditionValue xdfgetProductAbbr()
    { if (_productAbbr == null) { _productAbbr = nCV(); }
      return _productAbbr; }
    protected ConditionValue xgetCValueProductAbbr() { return xdfgetProductAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ProductAbbr_Asc() { regOBA("PRODUCT_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ProductAbbr_Desc() { regOBD("PRODUCT_ABBR"); return this; }

    protected ConditionValue _janCd;
    public ConditionValue xdfgetJanCd()
    { if (_janCd == null) { _janCd = nCV(); }
      return _janCd; }
    protected ConditionValue xgetCValueJanCd() { return xdfgetJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * JAN_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

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
     * STOCK_TYPE_ID: {IX, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _zoneId;
    public ConditionValue xdfgetZoneId()
    { if (_zoneId == null) { _zoneId = nCV(); }
      return _zoneId; }
    protected ConditionValue xgetCValueZoneId() { return xdfgetZoneId(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ZoneId_Asc() { regOBA("ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ZoneId_Desc() { regOBD("ZONE_ID"); return this; }

    protected ConditionValue _zoneCd;
    public ConditionValue xdfgetZoneCd()
    { if (_zoneCd == null) { _zoneCd = nCV(); }
      return _zoneCd; }
    protected ConditionValue xgetCValueZoneCd() { return xdfgetZoneCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ZoneCd_Asc() { regOBA("ZONE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ZoneCd_Desc() { regOBD("ZONE_CD"); return this; }

    protected ConditionValue _zoneNm;
    public ConditionValue xdfgetZoneNm()
    { if (_zoneNm == null) { _zoneNm = nCV(); }
      return _zoneNm; }
    protected ConditionValue xgetCValueZoneNm() { return xdfgetZoneNm(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ZoneNm_Asc() { regOBA("ZONE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ZoneNm_Desc() { regOBD("ZONE_NM"); return this; }

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
    public BsHStockCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

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
    public BsHStockCQ addOrderBy_LocationNm_Asc() { regOBA("LOCATION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_LocationNm_Desc() { regOBD("LOCATION_NM"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _depositCd;
    public ConditionValue xdfgetDepositCd()
    { if (_depositCd == null) { _depositCd = nCV(); }
      return _depositCd; }
    protected ConditionValue xgetCValueDepositCd() { return xdfgetDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_DepositCd_Asc() { regOBA("DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_DepositCd_Desc() { regOBD("DEPOSIT_CD"); return this; }

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
    public BsHStockCQ addOrderBy_DepositNm_Asc() { regOBA("DEPOSIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_DepositNm_Desc() { regOBD("DEPOSIT_NM"); return this; }

    protected ConditionValue _depositAbbr;
    public ConditionValue xdfgetDepositAbbr()
    { if (_depositAbbr == null) { _depositAbbr = nCV(); }
      return _depositAbbr; }
    protected ConditionValue xgetCValueDepositAbbr() { return xdfgetDepositAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_DepositAbbr_Asc() { regOBA("DEPOSIT_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_DepositAbbr_Desc() { regOBD("DEPOSIT_ABBR"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

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
    public BsHStockCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

    protected ConditionValue _storeNoId;
    public ConditionValue xdfgetStoreNoId()
    { if (_storeNoId == null) { _storeNoId = nCV(); }
      return _storeNoId; }
    protected ConditionValue xgetCValueStoreNoId() { return xdfgetStoreNoId(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

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
    public BsHStockCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

    protected ConditionValue _oldStoreNumId;
    public ConditionValue xdfgetOldStoreNumId()
    { if (_oldStoreNumId == null) { _oldStoreNumId = nCV(); }
      return _oldStoreNumId; }
    protected ConditionValue xgetCValueOldStoreNumId() { return xdfgetOldStoreNumId(); }

    /**
     * Add order-by as ascend. <br>
     * OLD_STORE_NUM_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_OldStoreNumId_Asc() { regOBA("OLD_STORE_NUM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * OLD_STORE_NUM_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_OldStoreNumId_Desc() { regOBD("OLD_STORE_NUM_ID"); return this; }

    protected ConditionValue _oldStoreLabelNo;
    public ConditionValue xdfgetOldStoreLabelNo()
    { if (_oldStoreLabelNo == null) { _oldStoreLabelNo = nCV(); }
      return _oldStoreLabelNo; }
    protected ConditionValue xgetCValueOldStoreLabelNo() { return xdfgetOldStoreLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * OLD_STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_OldStoreLabelNo_Asc() { regOBA("OLD_STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OLD_STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_OldStoreLabelNo_Desc() { regOBD("OLD_STORE_LABEL_NO"); return this; }

    protected ConditionValue _supplierId;
    public ConditionValue xdfgetSupplierId()
    { if (_supplierId == null) { _supplierId = nCV(); }
      return _supplierId; }
    protected ConditionValue xgetCValueSupplierId() { return xdfgetSupplierId(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_SupplierId_Asc() { regOBA("SUPPLIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_SupplierId_Desc() { regOBD("SUPPLIER_ID"); return this; }

    protected ConditionValue _supplierCd;
    public ConditionValue xdfgetSupplierCd()
    { if (_supplierCd == null) { _supplierCd = nCV(); }
      return _supplierCd; }
    protected ConditionValue xgetCValueSupplierCd() { return xdfgetSupplierCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_SupplierCd_Asc() { regOBA("SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_SupplierCd_Desc() { regOBD("SUPPLIER_CD"); return this; }

    protected ConditionValue _supplierNm;
    public ConditionValue xdfgetSupplierNm()
    { if (_supplierNm == null) { _supplierNm = nCV(); }
      return _supplierNm; }
    protected ConditionValue xgetCValueSupplierNm() { return xdfgetSupplierNm(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_SupplierNm_Asc() { regOBA("SUPPLIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_SupplierNm_Desc() { regOBD("SUPPLIER_NM"); return this; }

    protected ConditionValue _supplierAbbr;
    public ConditionValue xdfgetSupplierAbbr()
    { if (_supplierAbbr == null) { _supplierAbbr = nCV(); }
      return _supplierAbbr; }
    protected ConditionValue xgetCValueSupplierAbbr() { return xdfgetSupplierAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_SupplierAbbr_Asc() { regOBA("SUPPLIER_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_SupplierAbbr_Desc() { regOBD("SUPPLIER_ABBR"); return this; }

    protected ConditionValue _storeDt;
    public ConditionValue xdfgetStoreDt()
    { if (_storeDt == null) { _storeDt = nCV(); }
      return _storeDt; }
    protected ConditionValue xgetCValueStoreDt() { return xdfgetStoreDt(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

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
    public BsHStockCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

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
    public BsHStockCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHStockCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHStockCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHStockCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHStockCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHStockCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHStockCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHStockCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHStockCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHStockCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHStockCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHStockCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HStockCQ bq = (HStockCQ)bqs;
        HStockCQ uq = (HStockCQ)uqs;
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("H_STOCK", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

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
        String nrp = xresolveNRP("H_STOCK", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HStockCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HStockCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HStockCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HStockCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HStockCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HStockCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HStockCQ> _myselfExistsMap;
    public Map<String, HStockCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HStockCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HStockCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HStockCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HStockCB.class.getName(); }
    protected String xCQ() { return HStockCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
