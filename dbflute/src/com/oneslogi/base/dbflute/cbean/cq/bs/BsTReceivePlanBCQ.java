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
 * The base condition-query of T_RECEIVE_PLAN_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReceivePlanBCQ extends AbstractBsTReceivePlanBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReceivePlanBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_RECEIVE_PLAN_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TReceivePlanBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TReceivePlanBCIQ xcreateCIQ() {
        TReceivePlanBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TReceivePlanBCIQ xnewCIQ() {
        return new TReceivePlanBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_RECEIVE_PLAN_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TReceivePlanBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TReceivePlanBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanBId;
    public ConditionValue xdfgetReceivePlanBId()
    { if (_receivePlanBId == null) { _receivePlanBId = nCV(); }
      return _receivePlanBId; }
    protected ConditionValue xgetCValueReceivePlanBId() { return xdfgetReceivePlanBId(); }

    public Map<String, TReceivePlanSpareCQ> xdfgetReceivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne() { return xgetSQueMap("receivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne"); }
    public String keepReceivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne(TReceivePlanSpareCQ sq) { return xkeepSQue("receivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetReceivePlanBId_ExistsReferrer_TStoreRecordBList() { return xgetSQueMap("receivePlanBId_ExistsReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("receivePlanBId_ExistsReferrer_TStoreRecordBList", sq); }

    public Map<String, TTrrcvdetailCQ> xdfgetReceivePlanBId_ExistsReferrer_TTrrcvdetailAsOne() { return xgetSQueMap("receivePlanBId_ExistsReferrer_TTrrcvdetailAsOne"); }
    public String keepReceivePlanBId_ExistsReferrer_TTrrcvdetailAsOne(TTrrcvdetailCQ sq) { return xkeepSQue("receivePlanBId_ExistsReferrer_TTrrcvdetailAsOne", sq); }

    public Map<String, TReceivePlanSpareCQ> xdfgetReceivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne() { return xgetSQueMap("receivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne"); }
    public String keepReceivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne(TReceivePlanSpareCQ sq) { return xkeepSQue("receivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetReceivePlanBId_NotExistsReferrer_TStoreRecordBList() { return xgetSQueMap("receivePlanBId_NotExistsReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("receivePlanBId_NotExistsReferrer_TStoreRecordBList", sq); }

    public Map<String, TTrrcvdetailCQ> xdfgetReceivePlanBId_NotExistsReferrer_TTrrcvdetailAsOne() { return xgetSQueMap("receivePlanBId_NotExistsReferrer_TTrrcvdetailAsOne"); }
    public String keepReceivePlanBId_NotExistsReferrer_TTrrcvdetailAsOne(TTrrcvdetailCQ sq) { return xkeepSQue("receivePlanBId_NotExistsReferrer_TTrrcvdetailAsOne", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetReceivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList() { return xgetSQueMap("receivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("receivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetReceivePlanBId_QueryDerivedReferrer_TStoreRecordBList() { return xgetSQueMap("receivePlanBId_QueryDerivedReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("receivePlanBId_QueryDerivedReferrer_TStoreRecordBList", sq); }
    public Map<String, Object> xdfgetReceivePlanBId_QueryDerivedReferrer_TStoreRecordBListParameter() { return xgetSQuePmMap("receivePlanBId_QueryDerivedReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBListParameter(Object pm) { return xkeepSQuePm("receivePlanBId_QueryDerivedReferrer_TStoreRecordBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    public Map<String, TReceivePlanHCQ> getReceivePlanHId_InScopeRelation_TReceivePlanH() { return xgetSQueMap("receivePlanHId_InScopeRelation_TReceivePlanH"); }
    public String keepReceivePlanHId_InScopeRelation_TReceivePlanH(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_InScopeRelation_TReceivePlanH", sq); }

    public Map<String, TReceivePlanHCQ> getReceivePlanHId_NotInScopeRelation_TReceivePlanH() { return xgetSQueMap("receivePlanHId_NotInScopeRelation_TReceivePlanH"); }
    public String keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_NotInScopeRelation_TReceivePlanH", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _receiveStatus;
    public ConditionValue xdfgetReceiveStatus()
    { if (_receiveStatus == null) { _receiveStatus = nCV(); }
      return _receiveStatus; }
    protected ConditionValue xgetCValueReceiveStatus() { return xdfgetReceiveStatus(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceiveStatus_Asc() { regOBA("RECEIVE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceiveStatus_Desc() { regOBD("RECEIVE_STATUS"); return this; }

    protected ConditionValue _planClientOrderNo;
    public ConditionValue xdfgetPlanClientOrderNo()
    { if (_planClientOrderNo == null) { _planClientOrderNo = nCV(); }
      return _planClientOrderNo; }
    protected ConditionValue xgetCValuePlanClientOrderNo() { return xdfgetPlanClientOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanClientOrderNo_Asc() { regOBA("PLAN_CLIENT_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanClientOrderNo_Desc() { regOBD("PLAN_CLIENT_ORDER_NO"); return this; }

    protected ConditionValue _planWarehouseId;
    public ConditionValue xdfgetPlanWarehouseId()
    { if (_planWarehouseId == null) { _planWarehouseId = nCV(); }
      return _planWarehouseId; }
    protected ConditionValue xgetCValuePlanWarehouseId() { return xdfgetPlanWarehouseId(); }

    public Map<String, MWarehouseCQ> getPlanWarehouseId_InScopeRelation_MWarehouse() { return xgetSQueMap("planWarehouseId_InScopeRelation_MWarehouse"); }
    public String keepPlanWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("planWarehouseId_InScopeRelation_MWarehouse", sq); }

    public Map<String, MWarehouseCQ> getPlanWarehouseId_NotInScopeRelation_MWarehouse() { return xgetSQueMap("planWarehouseId_NotInScopeRelation_MWarehouse"); }
    public String keepPlanWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("planWarehouseId_NotInScopeRelation_MWarehouse", sq); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanWarehouseId_Asc() { regOBA("PLAN_WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanWarehouseId_Desc() { regOBD("PLAN_WAREHOUSE_ID"); return this; }

    protected ConditionValue _planWarehouseCd;
    public ConditionValue xdfgetPlanWarehouseCd()
    { if (_planWarehouseCd == null) { _planWarehouseCd = nCV(); }
      return _planWarehouseCd; }
    protected ConditionValue xgetCValuePlanWarehouseCd() { return xdfgetPlanWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanWarehouseCd_Asc() { regOBA("PLAN_WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanWarehouseCd_Desc() { regOBD("PLAN_WAREHOUSE_CD"); return this; }

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
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _planLot;
    public ConditionValue xdfgetPlanLot()
    { if (_planLot == null) { _planLot = nCV(); }
      return _planLot; }
    protected ConditionValue xgetCValuePlanLot() { return xdfgetPlanLot(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLot_Asc() { regOBA("PLAN_LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLot_Desc() { regOBD("PLAN_LOT"); return this; }

    protected ConditionValue _planLimitDt;
    public ConditionValue xdfgetPlanLimitDt()
    { if (_planLimitDt == null) { _planLimitDt = nCV(); }
      return _planLimitDt; }
    protected ConditionValue xgetCValuePlanLimitDt() { return xdfgetPlanLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLimitDt_Asc() { regOBA("PLAN_LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLimitDt_Desc() { regOBD("PLAN_LIMIT_DT"); return this; }

    protected ConditionValue _planLocationId;
    public ConditionValue xdfgetPlanLocationId()
    { if (_planLocationId == null) { _planLocationId = nCV(); }
      return _planLocationId; }
    protected ConditionValue xgetCValuePlanLocationId() { return xdfgetPlanLocationId(); }

    public Map<String, MLocationCQ> getPlanLocationId_InScopeRelation_MLocation() { return xgetSQueMap("planLocationId_InScopeRelation_MLocation"); }
    public String keepPlanLocationId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("planLocationId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getPlanLocationId_NotInScopeRelation_MLocation() { return xgetSQueMap("planLocationId_NotInScopeRelation_MLocation"); }
    public String keepPlanLocationId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("planLocationId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLocationId_Asc() { regOBA("PLAN_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLocationId_Desc() { regOBD("PLAN_LOCATION_ID"); return this; }

    protected ConditionValue _planLocationCd;
    public ConditionValue xdfgetPlanLocationCd()
    { if (_planLocationCd == null) { _planLocationCd = nCV(); }
      return _planLocationCd; }
    protected ConditionValue xgetCValuePlanLocationCd() { return xdfgetPlanLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLocationCd_Asc() { regOBA("PLAN_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLocationCd_Desc() { regOBD("PLAN_LOCATION_CD"); return this; }

    protected ConditionValue _planStoreLabelNo;
    public ConditionValue xdfgetPlanStoreLabelNo()
    { if (_planStoreLabelNo == null) { _planStoreLabelNo = nCV(); }
      return _planStoreLabelNo; }
    protected ConditionValue xgetCValuePlanStoreLabelNo() { return xdfgetPlanStoreLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanStoreLabelNo_Asc() { regOBA("PLAN_STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanStoreLabelNo_Desc() { regOBD("PLAN_STORE_LABEL_NO"); return this; }

    protected ConditionValue _planNum;
    public ConditionValue xdfgetPlanNum()
    { if (_planNum == null) { _planNum = nCV(); }
      return _planNum; }
    protected ConditionValue xgetCValuePlanNum() { return xdfgetPlanNum(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanNum_Asc() { regOBA("PLAN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanNum_Desc() { regOBD("PLAN_NUM"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTReceivePlanBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTReceivePlanBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TReceivePlanBCQ bq = (TReceivePlanBCQ)bqs;
        TReceivePlanBCQ uq = (TReceivePlanBCQ)uqs;
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryTReceivePlanH()) {
            uq.queryTReceivePlanH().reflectRelationOnUnionQuery(bq.queryTReceivePlanH(), uq.queryTReceivePlanH());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryBClassDtlByErrorFlg()) {
            uq.queryBClassDtlByErrorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorFlg(), uq.queryBClassDtlByErrorFlg());
        }
        if (bq.hasConditionQueryBClassDtlByReceiveStatus()) {
            uq.queryBClassDtlByReceiveStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByReceiveStatus(), uq.queryBClassDtlByReceiveStatus());
        }
        if (bq.hasConditionQueryTReceivePlanSpareAsOne()) {
            uq.queryTReceivePlanSpareAsOne().reflectRelationOnUnionQuery(bq.queryTReceivePlanSpareAsOne(), uq.queryTReceivePlanSpareAsOne());
        }
        if (bq.hasConditionQueryTTrrcvdetailAsOne()) {
            uq.queryTTrrcvdetailAsOne().reflectRelationOnUnionQuery(bq.queryTTrrcvdetailAsOne(), uq.queryTTrrcvdetailAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_LOCATION by my PLAN_LOCATION_ID, named 'MLocation'.
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
        String nrp = xresolveNRP("T_RECEIVE_PLAN_B", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_WAREHOUSE by my PLAN_WAREHOUSE_ID, named 'MWarehouse'.
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
        String nrp = xresolveNRP("T_RECEIVE_PLAN_B", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanHCQ queryTReceivePlanH() {
        return xdfgetConditionQueryTReceivePlanH();
    }
    public TReceivePlanHCQ xdfgetConditionQueryTReceivePlanH() {
        String prop = "tReceivePlanH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanH()); xsetupOuterJoinTReceivePlanH(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanHCQ xcreateQueryTReceivePlanH() {
        String nrp = xresolveNRP("T_RECEIVE_PLAN_B", "tReceivePlanH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanH", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanH() { xregOutJo("tReceivePlanH"); }
    public boolean hasConditionQueryTReceivePlanH() { return xhasQueRlMap("tReceivePlanH"); }

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
        String nrp = xresolveNRP("T_RECEIVE_PLAN_B", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByErrorFlg() {
        return xdfgetConditionQueryBClassDtlByErrorFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByErrorFlg() {
        String prop = "bClassDtlByErrorFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByErrorFlg()); xsetupOuterJoinBClassDtlByErrorFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByErrorFlg() {
        String nrp = xresolveNRP("T_RECEIVE_PLAN_B", "bClassDtlByErrorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByErrorFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByErrorFlg() { xregOutJo("bClassDtlByErrorFlg"); }
    public boolean hasConditionQueryBClassDtlByErrorFlg() { return xhasQueRlMap("bClassDtlByErrorFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByReceiveStatus() {
        return xdfgetConditionQueryBClassDtlByReceiveStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByReceiveStatus() {
        String prop = "bClassDtlByReceiveStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByReceiveStatus()); xsetupOuterJoinBClassDtlByReceiveStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByReceiveStatus() {
        String nrp = xresolveNRP("T_RECEIVE_PLAN_B", "bClassDtlByReceiveStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByReceiveStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByReceiveStatus() { xregOutJo("bClassDtlByReceiveStatus"); }
    public boolean hasConditionQueryBClassDtlByReceiveStatus() { return xhasQueRlMap("bClassDtlByReceiveStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_RECEIVE_PLAN_SPARE by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanSpareCQ queryTReceivePlanSpareAsOne() { return xdfgetConditionQueryTReceivePlanSpareAsOne(); }
    public TReceivePlanSpareCQ xdfgetConditionQueryTReceivePlanSpareAsOne() {
        String prop = "tReceivePlanSpareAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanSpareAsOne()); xsetupOuterJoinTReceivePlanSpareAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanSpareCQ xcreateQueryTReceivePlanSpareAsOne() {
        String nrp = xresolveNRP("T_RECEIVE_PLAN_B", "tReceivePlanSpareAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanSpareCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanSpareAsOne", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanSpareAsOne() { xregOutJo("tReceivePlanSpareAsOne"); }
    public boolean hasConditionQueryTReceivePlanSpareAsOne() { return xhasQueRlMap("tReceivePlanSpareAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_TRRCVDETAIL by RECEIVE_PLAN_B_ID, named 'TTrrcvdetailAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrrcvdetailCQ queryTTrrcvdetailAsOne() { return xdfgetConditionQueryTTrrcvdetailAsOne(); }
    public TTrrcvdetailCQ xdfgetConditionQueryTTrrcvdetailAsOne() {
        String prop = "tTrrcvdetailAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrrcvdetailAsOne()); xsetupOuterJoinTTrrcvdetailAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TTrrcvdetailCQ xcreateQueryTTrrcvdetailAsOne() {
        String nrp = xresolveNRP("T_RECEIVE_PLAN_B", "tTrrcvdetailAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrrcvdetailCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrrcvdetailAsOne", nrp);
    }
    protected void xsetupOuterJoinTTrrcvdetailAsOne() { xregOutJo("tTrrcvdetailAsOne"); }
    public boolean hasConditionQueryTTrrcvdetailAsOne() { return xhasQueRlMap("tTrrcvdetailAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TReceivePlanBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TReceivePlanBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TReceivePlanBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TReceivePlanBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TReceivePlanBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TReceivePlanBCQ> _myselfExistsMap;
    public Map<String, TReceivePlanBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TReceivePlanBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TReceivePlanBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TReceivePlanBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TReceivePlanBCB.class.getName(); }
    protected String xCQ() { return TReceivePlanBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
