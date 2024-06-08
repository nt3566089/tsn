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
 * The base condition-query of W_HT_INVENTORY_INPUT_PROD.
 * @author DBFlute(AutoGenerator)
 */
public class BsWHtInventoryInputProdCQ extends AbstractBsWHtInventoryInputProdCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WHtInventoryInputProdCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWHtInventoryInputProdCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_HT_INVENTORY_INPUT_PROD) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WHtInventoryInputProdCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WHtInventoryInputProdCIQ xcreateCIQ() {
        WHtInventoryInputProdCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WHtInventoryInputProdCIQ xnewCIQ() {
        return new WHtInventoryInputProdCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_HT_INVENTORY_INPUT_PROD on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WHtInventoryInputProdCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WHtInventoryInputProdCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _htInventoryInputProdId;
    public ConditionValue xdfgetHtInventoryInputProdId()
    { if (_htInventoryInputProdId == null) { _htInventoryInputProdId = nCV(); }
      return _htInventoryInputProdId; }
    protected ConditionValue xgetCValueHtInventoryInputProdId() { return xdfgetHtInventoryInputProdId(); }

    /**
     * Add order-by as ascend. <br>
     * HT_INVENTORY_INPUT_PROD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_HtInventoryInputProdId_Asc() { regOBA("HT_INVENTORY_INPUT_PROD_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_INVENTORY_INPUT_PROD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_HtInventoryInputProdId_Desc() { regOBD("HT_INVENTORY_INPUT_PROD_ID"); return this; }

    protected ConditionValue _macAddress;
    public ConditionValue xdfgetMacAddress()
    { if (_macAddress == null) { _macAddress = nCV(); }
      return _macAddress; }
    protected ConditionValue xgetCValueMacAddress() { return xdfgetMacAddress(); }

    /**
     * Add order-by as ascend. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_MacAddress_Asc() { regOBA("MAC_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_MacAddress_Desc() { regOBD("MAC_ADDRESS"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    public Map<String, MWarehouseCQ> getWarehouseId_InScopeRelation_MWarehouse() { return xgetSQueMap("warehouseId_InScopeRelation_MWarehouse"); }
    public String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("warehouseId_InScopeRelation_MWarehouse", sq); }

    public Map<String, MWarehouseCQ> getWarehouseId_NotInScopeRelation_MWarehouse() { return xgetSQueMap("warehouseId_NotInScopeRelation_MWarehouse"); }
    public String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("warehouseId_NotInScopeRelation_MWarehouse", sq); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

    protected ConditionValue _inventoryHId;
    public ConditionValue xdfgetInventoryHId()
    { if (_inventoryHId == null) { _inventoryHId = nCV(); }
      return _inventoryHId; }
    protected ConditionValue xgetCValueInventoryHId() { return xdfgetInventoryHId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_H_ID: {UQ+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_InventoryHId_Asc() { regOBA("INVENTORY_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_H_ID: {UQ+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_InventoryHId_Desc() { regOBD("INVENTORY_H_ID"); return this; }

    protected ConditionValue _rcvLabelNo;
    public ConditionValue xdfgetRcvLabelNo()
    { if (_rcvLabelNo == null) { _rcvLabelNo = nCV(); }
      return _rcvLabelNo; }
    protected ConditionValue xgetCValueRcvLabelNo() { return xdfgetRcvLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_RcvLabelNo_Asc() { regOBA("RCV_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_RcvLabelNo_Desc() { regOBD("RCV_LABEL_NO"); return this; }

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
     * PRODUCT_ID: {+UQ, NotNull, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {+UQ, NotNull, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _locId;
    public ConditionValue xdfgetLocId()
    { if (_locId == null) { _locId = nCV(); }
      return _locId; }
    protected ConditionValue xgetCValueLocId() { return xdfgetLocId(); }

    public Map<String, MLocationCQ> getLocId_InScopeRelation_MLocation() { return xgetSQueMap("locId_InScopeRelation_MLocation"); }
    public String keepLocId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getLocId_NotInScopeRelation_MLocation() { return xgetSQueMap("locId_NotInScopeRelation_MLocation"); }
    public String keepLocId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOC_ID: {+UQ, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LocId_Asc() { regOBA("LOC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC_ID: {+UQ, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LocId_Desc() { regOBD("LOC_ID"); return this; }

    protected ConditionValue _locCd;
    public ConditionValue xdfgetLocCd()
    { if (_locCd == null) { _locCd = nCV(); }
      return _locCd; }
    protected ConditionValue xgetCValueLocCd() { return xdfgetLocCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOC_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LocCd_Asc() { regOBA("LOC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LocCd_Desc() { regOBD("LOC_CD"); return this; }

    protected ConditionValue _locNm;
    public ConditionValue xdfgetLocNm()
    { if (_locNm == null) { _locNm = nCV(); }
      return _locNm; }
    protected ConditionValue xgetCValueLocNm() { return xdfgetLocNm(); }

    /**
     * Add order-by as ascend. <br>
     * LOC_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LocNm_Asc() { regOBA("LOC_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LocNm_Desc() { regOBD("LOC_NM"); return this; }

    protected ConditionValue _janCd;
    public ConditionValue xdfgetJanCd()
    { if (_janCd == null) { _janCd = nCV(); }
      return _janCd; }
    protected ConditionValue xgetCValueJanCd() { return xdfgetJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * JAN_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _consignmentClsId;
    public ConditionValue xdfgetConsignmentClsId()
    { if (_consignmentClsId == null) { _consignmentClsId = nCV(); }
      return _consignmentClsId; }
    protected ConditionValue xgetCValueConsignmentClsId() { return xdfgetConsignmentClsId(); }

    public Map<String, MCustomerCQ> getConsignmentClsId_InScopeRelation_MCustomer() { return xgetSQueMap("consignmentClsId_InScopeRelation_MCustomer"); }
    public String keepConsignmentClsId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("consignmentClsId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getConsignmentClsId_NotInScopeRelation_MCustomer() { return xgetSQueMap("consignmentClsId_NotInScopeRelation_MCustomer"); }
    public String keepConsignmentClsId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("consignmentClsId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * CONSIGNMENT_CLS_ID: {+UQ, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ConsignmentClsId_Asc() { regOBA("CONSIGNMENT_CLS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONSIGNMENT_CLS_ID: {+UQ, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ConsignmentClsId_Desc() { regOBD("CONSIGNMENT_CLS_ID"); return this; }

    protected ConditionValue _consignmentClsNm;
    public ConditionValue xdfgetConsignmentClsNm()
    { if (_consignmentClsNm == null) { _consignmentClsNm = nCV(); }
      return _consignmentClsNm; }
    protected ConditionValue xgetCValueConsignmentClsNm() { return xdfgetConsignmentClsNm(); }

    /**
     * Add order-by as ascend. <br>
     * CONSIGNMENT_CLS_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ConsignmentClsNm_Asc() { regOBA("CONSIGNMENT_CLS_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONSIGNMENT_CLS_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ConsignmentClsNm_Desc() { regOBD("CONSIGNMENT_CLS_NM"); return this; }

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
     * STOCK_TYPE_ID: {+UQ, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {+UQ, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _stkClsNm;
    public ConditionValue xdfgetStkClsNm()
    { if (_stkClsNm == null) { _stkClsNm = nCV(); }
      return _stkClsNm; }
    protected ConditionValue xgetCValueStkClsNm() { return xdfgetStkClsNm(); }

    /**
     * Add order-by as ascend. <br>
     * STK_CLS_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_StkClsNm_Asc() { regOBA("STK_CLS_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STK_CLS_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_StkClsNm_Desc() { regOBD("STK_CLS_NM"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    public Map<String, TLotCQ> getLotId_InScopeRelation_TLot() { return xgetSQueMap("lotId_InScopeRelation_TLot"); }
    public String keepLotId_InScopeRelation_TLot(TLotCQ sq) { return xkeepSQue("lotId_InScopeRelation_TLot", sq); }

    public Map<String, TLotCQ> getLotId_NotInScopeRelation_TLot() { return xgetSQueMap("lotId_NotInScopeRelation_TLot"); }
    public String keepLotId_NotInScopeRelation_TLot(TLotCQ sq) { return xkeepSQue("lotId_NotInScopeRelation_TLot", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {+UQ, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {+UQ, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {+UQ, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {+UQ, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _inventoryBVersionNo;
    public ConditionValue xdfgetInventoryBVersionNo()
    { if (_inventoryBVersionNo == null) { _inventoryBVersionNo = nCV(); }
      return _inventoryBVersionNo; }
    protected ConditionValue xgetCValueInventoryBVersionNo() { return xdfgetInventoryBVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_B_VERSION_NO: {+UQ, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_InventoryBVersionNo_Asc() { regOBA("INVENTORY_B_VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_B_VERSION_NO: {+UQ, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_InventoryBVersionNo_Desc() { regOBD("INVENTORY_B_VERSION_NO"); return this; }

    protected ConditionValue _crDt;
    public ConditionValue xdfgetCrDt()
    { if (_crDt == null) { _crDt = nCV(); }
      return _crDt; }
    protected ConditionValue xgetCValueCrDt() { return xdfgetCrDt(); }

    /**
     * Add order-by as ascend. <br>
     * CR_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_CrDt_Asc() { regOBA("CR_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CR_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_CrDt_Desc() { regOBD("CR_DT"); return this; }

    protected ConditionValue _workStartDt;
    public ConditionValue xdfgetWorkStartDt()
    { if (_workStartDt == null) { _workStartDt = nCV(); }
      return _workStartDt; }
    protected ConditionValue xgetCValueWorkStartDt() { return xdfgetWorkStartDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_WorkStartDt_Asc() { regOBA("WORK_START_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_WorkStartDt_Desc() { regOBD("WORK_START_DT"); return this; }

    protected ConditionValue _workEndDt;
    public ConditionValue xdfgetWorkEndDt()
    { if (_workEndDt == null) { _workEndDt = nCV(); }
      return _workEndDt; }
    protected ConditionValue xgetCValueWorkEndDt() { return xdfgetWorkEndDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_WorkEndDt_Asc() { regOBA("WORK_END_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_WorkEndDt_Desc() { regOBD("WORK_END_DT"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWHtInventoryInputProdCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWHtInventoryInputProdCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWHtInventoryInputProdCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWHtInventoryInputProdCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WHtInventoryInputProdCQ bq = (WHtInventoryInputProdCQ)bqs;
        WHtInventoryInputProdCQ uq = (WHtInventoryInputProdCQ)uqs;
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryTLot()) {
            uq.queryTLot().reflectRelationOnUnionQuery(bq.queryTLot(), uq.queryTLot());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
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
        String nrp = xresolveNRP("W_HT_INVENTORY_INPUT_PROD", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("W_HT_INVENTORY_INPUT_PROD", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("W_HT_INVENTORY_INPUT_PROD", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my CONSIGNMENT_CLS_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("W_HT_INVENTORY_INPUT_PROD", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The instance of condition-query. (NotNull)
     */
    public MWarehouseCQ queryMWarehouse() {
        return xdfgetConditionQueryMWarehouse();
    }
    public MWarehouseCQ xdfgetConditionQueryMWarehouse() {
        String prop = "mWarehouse";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMWarehouse()); xsetupOuterJoinMWarehouse(); }
        return xgetQueRlMap(prop);
    }
    protected MWarehouseCQ xcreateQueryMWarehouse() {
        String nrp = xresolveNRP("W_HT_INVENTORY_INPUT_PROD", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The instance of condition-query. (NotNull)
     */
    public TLotCQ queryTLot() {
        return xdfgetConditionQueryTLot();
    }
    public TLotCQ xdfgetConditionQueryTLot() {
        String prop = "tLot";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTLot()); xsetupOuterJoinTLot(); }
        return xgetQueRlMap(prop);
    }
    protected TLotCQ xcreateQueryTLot() {
        String nrp = xresolveNRP("W_HT_INVENTORY_INPUT_PROD", "tLot"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tLot", nrp);
    }
    protected void xsetupOuterJoinTLot() { xregOutJo("tLot"); }
    public boolean hasConditionQueryTLot() { return xhasQueRlMap("tLot"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_LOCATION by my LOC_ID, named 'MLocation'.
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
        String nrp = xresolveNRP("W_HT_INVENTORY_INPUT_PROD", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

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
        String nrp = xresolveNRP("W_HT_INVENTORY_INPUT_PROD", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, WHtInventoryInputProdCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WHtInventoryInputProdCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WHtInventoryInputProdCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WHtInventoryInputProdCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WHtInventoryInputProdCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WHtInventoryInputProdCQ> _myselfExistsMap;
    public Map<String, WHtInventoryInputProdCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WHtInventoryInputProdCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WHtInventoryInputProdCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WHtInventoryInputProdCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WHtInventoryInputProdCB.class.getName(); }
    protected String xCQ() { return WHtInventoryInputProdCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
