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
 * The base condition-query of E_RECEIVE_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public class BsEReceivePlanCQ extends AbstractBsEReceivePlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EReceivePlanCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEReceivePlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_RECEIVE_PLAN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EReceivePlanCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EReceivePlanCIQ xcreateCIQ() {
        EReceivePlanCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EReceivePlanCIQ xnewCIQ() {
        return new EReceivePlanCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_RECEIVE_PLAN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EReceivePlanCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EReceivePlanCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanId;
    public ConditionValue xdfgetReceivePlanId()
    { if (_receivePlanId == null) { _receivePlanId = nCV(); }
      return _receivePlanId; }
    protected ConditionValue xgetCValueReceivePlanId() { return xdfgetReceivePlanId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceivePlanId_Asc() { regOBA("RECEIVE_PLAN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceivePlanId_Desc() { regOBD("RECEIVE_PLAN_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _planClientReceiveNo;
    public ConditionValue xdfgetPlanClientReceiveNo()
    { if (_planClientReceiveNo == null) { _planClientReceiveNo = nCV(); }
      return _planClientReceiveNo; }
    protected ConditionValue xgetCValuePlanClientReceiveNo() { return xdfgetPlanClientReceiveNo(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanClientReceiveNo_Asc() { regOBA("PLAN_CLIENT_RECEIVE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanClientReceiveNo_Desc() { regOBD("PLAN_CLIENT_RECEIVE_NO"); return this; }

    protected ConditionValue _planSupplierCd;
    public ConditionValue xdfgetPlanSupplierCd()
    { if (_planSupplierCd == null) { _planSupplierCd = nCV(); }
      return _planSupplierCd; }
    protected ConditionValue xgetCValuePlanSupplierCd() { return xdfgetPlanSupplierCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanSupplierCd_Asc() { regOBA("PLAN_SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanSupplierCd_Desc() { regOBD("PLAN_SUPPLIER_CD"); return this; }

    protected ConditionValue _receivePlanDt;
    public ConditionValue xdfgetReceivePlanDt()
    { if (_receivePlanDt == null) { _receivePlanDt = nCV(); }
      return _receivePlanDt; }
    protected ConditionValue xgetCValueReceivePlanDt() { return xdfgetReceivePlanDt(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceivePlanDt_Asc() { regOBA("RECEIVE_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceivePlanDt_Desc() { regOBD("RECEIVE_PLAN_DT"); return this; }

    protected ConditionValue _processTypeCd;
    public ConditionValue xdfgetProcessTypeCd()
    { if (_processTypeCd == null) { _processTypeCd = nCV(); }
      return _processTypeCd; }
    protected ConditionValue xgetCValueProcessTypeCd() { return xdfgetProcessTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ProcessTypeCd_Asc() { regOBA("PROCESS_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ProcessTypeCd_Desc() { regOBD("PROCESS_TYPE_CD"); return this; }

    protected ConditionValue _stockTypeCd;
    public ConditionValue xdfgetStockTypeCd()
    { if (_stockTypeCd == null) { _stockTypeCd = nCV(); }
      return _stockTypeCd; }
    protected ConditionValue xgetCValueStockTypeCd() { return xdfgetStockTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_StockTypeCd_Asc() { regOBA("STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_StockTypeCd_Desc() { regOBD("STOCK_TYPE_CD"); return this; }

    protected ConditionValue _planDepositCd;
    public ConditionValue xdfgetPlanDepositCd()
    { if (_planDepositCd == null) { _planDepositCd = nCV(); }
      return _planDepositCd; }
    protected ConditionValue xgetCValuePlanDepositCd() { return xdfgetPlanDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanDepositCd_Asc() { regOBA("PLAN_DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanDepositCd_Desc() { regOBD("PLAN_DEPOSIT_CD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _planNum;
    public ConditionValue xdfgetPlanNum()
    { if (_planNum == null) { _planNum = nCV(); }
      return _planNum; }
    protected ConditionValue xgetCValuePlanNum() { return xdfgetPlanNum(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanNum_Asc() { regOBA("PLAN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanNum_Desc() { regOBD("PLAN_NUM"); return this; }

    protected ConditionValue _planWarehouseCd;
    public ConditionValue xdfgetPlanWarehouseCd()
    { if (_planWarehouseCd == null) { _planWarehouseCd = nCV(); }
      return _planWarehouseCd; }
    protected ConditionValue xgetCValuePlanWarehouseCd() { return xdfgetPlanWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanWarehouseCd_Asc() { regOBA("PLAN_WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanWarehouseCd_Desc() { regOBD("PLAN_WAREHOUSE_CD"); return this; }

    protected ConditionValue _planLocationCd;
    public ConditionValue xdfgetPlanLocationCd()
    { if (_planLocationCd == null) { _planLocationCd = nCV(); }
      return _planLocationCd; }
    protected ConditionValue xgetCValuePlanLocationCd() { return xdfgetPlanLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanLocationCd_Asc() { regOBA("PLAN_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanLocationCd_Desc() { regOBD("PLAN_LOCATION_CD"); return this; }

    protected ConditionValue _planLot;
    public ConditionValue xdfgetPlanLot()
    { if (_planLot == null) { _planLot = nCV(); }
      return _planLot; }
    protected ConditionValue xgetCValuePlanLot() { return xdfgetPlanLot(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LOT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanLot_Asc() { regOBA("PLAN_LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LOT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanLot_Desc() { regOBD("PLAN_LOT"); return this; }

    protected ConditionValue _planLimitDt;
    public ConditionValue xdfgetPlanLimitDt()
    { if (_planLimitDt == null) { _planLimitDt = nCV(); }
      return _planLimitDt; }
    protected ConditionValue xgetCValuePlanLimitDt() { return xdfgetPlanLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanLimitDt_Asc() { regOBA("PLAN_LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanLimitDt_Desc() { regOBD("PLAN_LIMIT_DT"); return this; }

    protected ConditionValue _planClientOrderNo;
    public ConditionValue xdfgetPlanClientOrderNo()
    { if (_planClientOrderNo == null) { _planClientOrderNo = nCV(); }
      return _planClientOrderNo; }
    protected ConditionValue xgetCValuePlanClientOrderNo() { return xdfgetPlanClientOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanClientOrderNo_Asc() { regOBA("PLAN_CLIENT_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_PlanClientOrderNo_Desc() { regOBD("PLAN_CLIENT_ORDER_NO"); return this; }

    protected ConditionValue _spareStr1;
    public ConditionValue xdfgetSpareStr1()
    { if (_spareStr1 == null) { _spareStr1 = nCV(); }
      return _spareStr1; }
    protected ConditionValue xgetCValueSpareStr1() { return xdfgetSpareStr1(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareStr1_Asc() { regOBA("SPARE_STR_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareStr1_Desc() { regOBD("SPARE_STR_1"); return this; }

    protected ConditionValue _spareStr2;
    public ConditionValue xdfgetSpareStr2()
    { if (_spareStr2 == null) { _spareStr2 = nCV(); }
      return _spareStr2; }
    protected ConditionValue xgetCValueSpareStr2() { return xdfgetSpareStr2(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareStr2_Asc() { regOBA("SPARE_STR_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareStr2_Desc() { regOBD("SPARE_STR_2"); return this; }

    protected ConditionValue _spareStr3;
    public ConditionValue xdfgetSpareStr3()
    { if (_spareStr3 == null) { _spareStr3 = nCV(); }
      return _spareStr3; }
    protected ConditionValue xgetCValueSpareStr3() { return xdfgetSpareStr3(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareStr3_Asc() { regOBA("SPARE_STR_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareStr3_Desc() { regOBD("SPARE_STR_3"); return this; }

    protected ConditionValue _spareNum1;
    public ConditionValue xdfgetSpareNum1()
    { if (_spareNum1 == null) { _spareNum1 = nCV(); }
      return _spareNum1; }
    protected ConditionValue xgetCValueSpareNum1() { return xdfgetSpareNum1(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareNum1_Asc() { regOBA("SPARE_NUM_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareNum1_Desc() { regOBD("SPARE_NUM_1"); return this; }

    protected ConditionValue _spareNum2;
    public ConditionValue xdfgetSpareNum2()
    { if (_spareNum2 == null) { _spareNum2 = nCV(); }
      return _spareNum2; }
    protected ConditionValue xgetCValueSpareNum2() { return xdfgetSpareNum2(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareNum2_Asc() { regOBA("SPARE_NUM_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareNum2_Desc() { regOBD("SPARE_NUM_2"); return this; }

    protected ConditionValue _spareNum3;
    public ConditionValue xdfgetSpareNum3()
    { if (_spareNum3 == null) { _spareNum3 = nCV(); }
      return _spareNum3; }
    protected ConditionValue xgetCValueSpareNum3() { return xdfgetSpareNum3(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareNum3_Asc() { regOBA("SPARE_NUM_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareNum3_Desc() { regOBD("SPARE_NUM_3"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEReceivePlanCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEReceivePlanCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, EReceivePlanCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EReceivePlanCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EReceivePlanCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EReceivePlanCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EReceivePlanCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EReceivePlanCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EReceivePlanCQ> _myselfExistsMap;
    public Map<String, EReceivePlanCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EReceivePlanCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EReceivePlanCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EReceivePlanCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EReceivePlanCB.class.getName(); }
    protected String xCQ() { return EReceivePlanCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
