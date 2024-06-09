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
 * The base condition-query of M_CUSTOMER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCustomerCQ extends AbstractBsMCustomerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCustomerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCustomerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CUSTOMER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCustomerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCustomerCIQ xcreateCIQ() {
        MCustomerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCustomerCIQ xnewCIQ() {
        return new MCustomerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CUSTOMER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCustomerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCustomerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _customerId;
    public ConditionValue xdfgetCustomerId()
    { if (_customerId == null) { _customerId = nCV(); }
      return _customerId; }
    protected ConditionValue xgetCValueCustomerId() { return xdfgetCustomerId(); }

    public Map<String, MCarrierSlipCesCQ> xdfgetCustomerId_ExistsReferrer_MCarrierSlipCesAsOne() { return xgetSQueMap("customerId_ExistsReferrer_MCarrierSlipCesAsOne"); }
    public String keepCustomerId_ExistsReferrer_MCarrierSlipCesAsOne(MCarrierSlipCesCQ sq) { return xkeepSQue("customerId_ExistsReferrer_MCarrierSlipCesAsOne", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCustomerId_ExistsReferrer_MCenterCustomerList() { return xgetSQueMap("customerId_ExistsReferrer_MCenterCustomerList"); }
    public String keepCustomerId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("customerId_ExistsReferrer_MCenterCustomerList", sq); }

    public Map<String, MClientCQ> xdfgetCustomerId_ExistsReferrer_MClientList() { return xgetSQueMap("customerId_ExistsReferrer_MClientList"); }
    public String keepCustomerId_ExistsReferrer_MClientList(MClientCQ sq) { return xkeepSQue("customerId_ExistsReferrer_MClientList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCustomerId_ExistsReferrer_MClientCenterList() { return xgetSQueMap("customerId_ExistsReferrer_MClientCenterList"); }
    public String keepCustomerId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("customerId_ExistsReferrer_MClientCenterList", sq); }

    public Map<String, MCustomerCQ> xdfgetCustomerId_ExistsReferrer_MCustomerSelfList() { return xgetSQueMap("customerId_ExistsReferrer_MCustomerSelfList"); }
    public String keepCustomerId_ExistsReferrer_MCustomerSelfList(MCustomerCQ sq) { return xkeepSQue("customerId_ExistsReferrer_MCustomerSelfList", sq); }

    public Map<String, MLocationCQ> xdfgetCustomerId_ExistsReferrer_MLocationList() { return xgetSQueMap("customerId_ExistsReferrer_MLocationList"); }
    public String keepCustomerId_ExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("customerId_ExistsReferrer_MLocationList", sq); }

    public Map<String, MUserDepositCQ> xdfgetCustomerId_ExistsReferrer_MUserDepositList() { return xgetSQueMap("customerId_ExistsReferrer_MUserDepositList"); }
    public String keepCustomerId_ExistsReferrer_MUserDepositList(MUserDepositCQ sq) { return xkeepSQue("customerId_ExistsReferrer_MUserDepositList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetCustomerId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("customerId_ExistsReferrer_TAllocInstBList"); }
    public String keepCustomerId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCustomerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList() { return xgetSQueMap("customerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepCustomerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCustomerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList() { return xgetSQueMap("customerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList", sq); }

    public Map<String, TAllocLotCQ> xdfgetCustomerId_ExistsReferrer_TAllocLotList() { return xgetSQueMap("customerId_ExistsReferrer_TAllocLotList"); }
    public String keepCustomerId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetCustomerId_ExistsReferrer_TInventoryBByDepositIdList() { return xgetSQueMap("customerId_ExistsReferrer_TInventoryBByDepositIdList"); }
    public String keepCustomerId_ExistsReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TInventoryBByDepositIdList", sq); }

    public Map<String, TInventoryBCQ> xdfgetCustomerId_ExistsReferrer_TInventoryBBySupplierIdList() { return xgetSQueMap("customerId_ExistsReferrer_TInventoryBBySupplierIdList"); }
    public String keepCustomerId_ExistsReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TInventoryBBySupplierIdList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetCustomerId_ExistsReferrer_TInventoryInstList() { return xgetSQueMap("customerId_ExistsReferrer_TInventoryInstList"); }
    public String keepCustomerId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TInventoryInstList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetCustomerId_ExistsReferrer_TKeepingLotList() { return xgetSQueMap("customerId_ExistsReferrer_TKeepingLotList"); }
    public String keepCustomerId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetCustomerId_ExistsReferrer_TLastLotList() { return xgetSQueMap("customerId_ExistsReferrer_TLastLotList"); }
    public String keepCustomerId_ExistsReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TLastLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetCustomerId_ExistsReferrer_TMoveInstBByDepositIdList() { return xgetSQueMap("customerId_ExistsReferrer_TMoveInstBByDepositIdList"); }
    public String keepCustomerId_ExistsReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TMoveInstBByDepositIdList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetCustomerId_ExistsReferrer_TMoveInstBBySupplierIdList() { return xgetSQueMap("customerId_ExistsReferrer_TMoveInstBBySupplierIdList"); }
    public String keepCustomerId_ExistsReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TMoveInstBBySupplierIdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCustomerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList() { return xgetSQueMap("customerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList"); }
    public String keepCustomerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCustomerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList() { return xgetSQueMap("customerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList"); }
    public String keepCustomerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetCustomerId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("customerId_ExistsReferrer_TShippingInstBList"); }
    public String keepCustomerId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCustomerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList() { return xgetSQueMap("customerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList"); }
    public String keepCustomerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCustomerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList() { return xgetSQueMap("customerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList", sq); }

    public Map<String, TStockCQ> xdfgetCustomerId_ExistsReferrer_TStockList() { return xgetSQueMap("customerId_ExistsReferrer_TStockList"); }
    public String keepCustomerId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TStockList", sq); }

    public Map<String, TStoreNoCQ> xdfgetCustomerId_ExistsReferrer_TStoreNoList() { return xgetSQueMap("customerId_ExistsReferrer_TStoreNoList"); }
    public String keepCustomerId_ExistsReferrer_TStoreNoList(TStoreNoCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TStoreNoList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCustomerId_ExistsReferrer_TStoreRecordHByDepositIdList() { return xgetSQueMap("customerId_ExistsReferrer_TStoreRecordHByDepositIdList"); }
    public String keepCustomerId_ExistsReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TStoreRecordHByDepositIdList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCustomerId_ExistsReferrer_TStoreRecordHBySupplierIdList() { return xgetSQueMap("customerId_ExistsReferrer_TStoreRecordHBySupplierIdList"); }
    public String keepCustomerId_ExistsReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq) { return xkeepSQue("customerId_ExistsReferrer_TStoreRecordHBySupplierIdList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCustomerId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("customerId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepCustomerId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("customerId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCustomerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList() { return xgetSQueMap("customerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList"); }
    public String keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("customerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCustomerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList() { return xgetSQueMap("customerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList"); }
    public String keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("customerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCustomerId_ExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("customerId_ExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepCustomerId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("customerId_ExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCustomerId_ExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("customerId_ExistsReferrer_WHtSerialShippingInspList"); }
    public String keepCustomerId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("customerId_ExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, MCarrierSlipCesCQ> xdfgetCustomerId_NotExistsReferrer_MCarrierSlipCesAsOne() { return xgetSQueMap("customerId_NotExistsReferrer_MCarrierSlipCesAsOne"); }
    public String keepCustomerId_NotExistsReferrer_MCarrierSlipCesAsOne(MCarrierSlipCesCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_MCarrierSlipCesAsOne", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCustomerId_NotExistsReferrer_MCenterCustomerList() { return xgetSQueMap("customerId_NotExistsReferrer_MCenterCustomerList"); }
    public String keepCustomerId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_MCenterCustomerList", sq); }

    public Map<String, MClientCQ> xdfgetCustomerId_NotExistsReferrer_MClientList() { return xgetSQueMap("customerId_NotExistsReferrer_MClientList"); }
    public String keepCustomerId_NotExistsReferrer_MClientList(MClientCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_MClientList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCustomerId_NotExistsReferrer_MClientCenterList() { return xgetSQueMap("customerId_NotExistsReferrer_MClientCenterList"); }
    public String keepCustomerId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_MClientCenterList", sq); }

    public Map<String, MCustomerCQ> xdfgetCustomerId_NotExistsReferrer_MCustomerSelfList() { return xgetSQueMap("customerId_NotExistsReferrer_MCustomerSelfList"); }
    public String keepCustomerId_NotExistsReferrer_MCustomerSelfList(MCustomerCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_MCustomerSelfList", sq); }

    public Map<String, MLocationCQ> xdfgetCustomerId_NotExistsReferrer_MLocationList() { return xgetSQueMap("customerId_NotExistsReferrer_MLocationList"); }
    public String keepCustomerId_NotExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_MLocationList", sq); }

    public Map<String, MUserDepositCQ> xdfgetCustomerId_NotExistsReferrer_MUserDepositList() { return xgetSQueMap("customerId_NotExistsReferrer_MUserDepositList"); }
    public String keepCustomerId_NotExistsReferrer_MUserDepositList(MUserDepositCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_MUserDepositList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetCustomerId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("customerId_NotExistsReferrer_TAllocInstBList"); }
    public String keepCustomerId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepCustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList", sq); }

    public Map<String, TAllocLotCQ> xdfgetCustomerId_NotExistsReferrer_TAllocLotList() { return xgetSQueMap("customerId_NotExistsReferrer_TAllocLotList"); }
    public String keepCustomerId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetCustomerId_NotExistsReferrer_TInventoryBByDepositIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TInventoryBByDepositIdList"); }
    public String keepCustomerId_NotExistsReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TInventoryBByDepositIdList", sq); }

    public Map<String, TInventoryBCQ> xdfgetCustomerId_NotExistsReferrer_TInventoryBBySupplierIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TInventoryBBySupplierIdList"); }
    public String keepCustomerId_NotExistsReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TInventoryBBySupplierIdList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetCustomerId_NotExistsReferrer_TInventoryInstList() { return xgetSQueMap("customerId_NotExistsReferrer_TInventoryInstList"); }
    public String keepCustomerId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TInventoryInstList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetCustomerId_NotExistsReferrer_TKeepingLotList() { return xgetSQueMap("customerId_NotExistsReferrer_TKeepingLotList"); }
    public String keepCustomerId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetCustomerId_NotExistsReferrer_TLastLotList() { return xgetSQueMap("customerId_NotExistsReferrer_TLastLotList"); }
    public String keepCustomerId_NotExistsReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TLastLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetCustomerId_NotExistsReferrer_TMoveInstBByDepositIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TMoveInstBByDepositIdList"); }
    public String keepCustomerId_NotExistsReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TMoveInstBByDepositIdList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetCustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TMoveInstBBySupplierIdList"); }
    public String keepCustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TMoveInstBBySupplierIdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList"); }
    public String keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList"); }
    public String keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetCustomerId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("customerId_NotExistsReferrer_TShippingInstBList"); }
    public String keepCustomerId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList"); }
    public String keepCustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList", sq); }

    public Map<String, TStockCQ> xdfgetCustomerId_NotExistsReferrer_TStockList() { return xgetSQueMap("customerId_NotExistsReferrer_TStockList"); }
    public String keepCustomerId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TStockList", sq); }

    public Map<String, TStoreNoCQ> xdfgetCustomerId_NotExistsReferrer_TStoreNoList() { return xgetSQueMap("customerId_NotExistsReferrer_TStoreNoList"); }
    public String keepCustomerId_NotExistsReferrer_TStoreNoList(TStoreNoCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TStoreNoList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TStoreRecordHByDepositIdList"); }
    public String keepCustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TStoreRecordHByDepositIdList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList() { return xgetSQueMap("customerId_NotExistsReferrer_TStoreRecordHBySupplierIdList"); }
    public String keepCustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_TStoreRecordHBySupplierIdList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCustomerId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("customerId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepCustomerId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList() { return xgetSQueMap("customerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList"); }
    public String keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList() { return xgetSQueMap("customerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList"); }
    public String keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCustomerId_NotExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("customerId_NotExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepCustomerId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCustomerId_NotExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("customerId_NotExistsReferrer_WHtSerialShippingInspList"); }
    public String keepCustomerId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("customerId_NotExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCustomerId_SpecifyDerivedReferrer_MCenterCustomerList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_MCenterCustomerList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_MCenterCustomerList", sq); }

    public Map<String, MClientCQ> xdfgetCustomerId_SpecifyDerivedReferrer_MClientList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_MClientList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_MClientList(MClientCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_MClientList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCustomerId_SpecifyDerivedReferrer_MClientCenterList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_MClientCenterList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_MClientCenterList", sq); }

    public Map<String, MCustomerCQ> xdfgetCustomerId_SpecifyDerivedReferrer_MCustomerSelfList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_MCustomerSelfList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_MCustomerSelfList(MCustomerCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_MCustomerSelfList", sq); }

    public Map<String, MLocationCQ> xdfgetCustomerId_SpecifyDerivedReferrer_MLocationList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_MLocationList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_MLocationList", sq); }

    public Map<String, MUserDepositCQ> xdfgetCustomerId_SpecifyDerivedReferrer_MUserDepositList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_MUserDepositList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_MUserDepositList(MUserDepositCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_MUserDepositList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList", sq); }

    public Map<String, TAllocLotCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TAllocLotList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TAllocLotList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList", sq); }

    public Map<String, TInventoryBCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TInventoryInstList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TInventoryInstList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TInventoryInstList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TKeepingLotList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TKeepingLotList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TLastLotList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TLastLotList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TLastLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList", sq); }

    public Map<String, TStockCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TStockList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, TStoreNoCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TStoreNoList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TStoreNoList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TStoreNoList(TStoreNoCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TStoreNoList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCustomerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCustomerId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCustomerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCustomerId_SpecifyDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("customerId_SpecifyDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("customerId_SpecifyDerivedReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCustomerId_QueryDerivedReferrer_MCenterCustomerList() { return xgetSQueMap("customerId_QueryDerivedReferrer_MCenterCustomerList"); }
    public String keepCustomerId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_MCenterCustomerList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_MCenterCustomerListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_MCenterCustomerList"); }
    public String keepCustomerId_QueryDerivedReferrer_MCenterCustomerListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_MCenterCustomerList", pm); }

    public Map<String, MClientCQ> xdfgetCustomerId_QueryDerivedReferrer_MClientList() { return xgetSQueMap("customerId_QueryDerivedReferrer_MClientList"); }
    public String keepCustomerId_QueryDerivedReferrer_MClientList(MClientCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_MClientList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_MClientListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_MClientList"); }
    public String keepCustomerId_QueryDerivedReferrer_MClientListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_MClientList", pm); }

    public Map<String, MClientCenterCQ> xdfgetCustomerId_QueryDerivedReferrer_MClientCenterList() { return xgetSQueMap("customerId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepCustomerId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_MClientCenterList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_MClientCenterListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepCustomerId_QueryDerivedReferrer_MClientCenterListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_MClientCenterList", pm); }

    public Map<String, MCustomerCQ> xdfgetCustomerId_QueryDerivedReferrer_MCustomerSelfList() { return xgetSQueMap("customerId_QueryDerivedReferrer_MCustomerSelfList"); }
    public String keepCustomerId_QueryDerivedReferrer_MCustomerSelfList(MCustomerCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_MCustomerSelfList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_MCustomerSelfListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_MCustomerSelfList"); }
    public String keepCustomerId_QueryDerivedReferrer_MCustomerSelfListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_MCustomerSelfList", pm); }

    public Map<String, MLocationCQ> xdfgetCustomerId_QueryDerivedReferrer_MLocationList() { return xgetSQueMap("customerId_QueryDerivedReferrer_MLocationList"); }
    public String keepCustomerId_QueryDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_MLocationList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_MLocationListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_MLocationList"); }
    public String keepCustomerId_QueryDerivedReferrer_MLocationListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_MLocationList", pm); }

    public Map<String, MUserDepositCQ> xdfgetCustomerId_QueryDerivedReferrer_MUserDepositList() { return xgetSQueMap("customerId_QueryDerivedReferrer_MUserDepositList"); }
    public String keepCustomerId_QueryDerivedReferrer_MUserDepositList(MUserDepositCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_MUserDepositList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_MUserDepositListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_MUserDepositList"); }
    public String keepCustomerId_QueryDerivedReferrer_MUserDepositListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_MUserDepositList", pm); }

    public Map<String, TAllocInstBCQ> xdfgetCustomerId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TAllocInstHCQ> xdfgetCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList", pm); }

    public Map<String, TAllocInstHCQ> xdfgetCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList", pm); }

    public Map<String, TAllocLotCQ> xdfgetCustomerId_QueryDerivedReferrer_TAllocLotList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TAllocLotList"); }
    public String keepCustomerId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TAllocLotList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TAllocLotListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TAllocLotList"); }
    public String keepCustomerId_QueryDerivedReferrer_TAllocLotListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TAllocLotList", pm); }

    public Map<String, TInventoryBCQ> xdfgetCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TInventoryBByDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TInventoryBByDepositIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TInventoryBByDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TInventoryBByDepositIdList", pm); }

    public Map<String, TInventoryBCQ> xdfgetCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TInventoryBBySupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TInventoryBBySupplierIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TInventoryBBySupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TInventoryBBySupplierIdList", pm); }

    public Map<String, TInventoryInstCQ> xdfgetCustomerId_QueryDerivedReferrer_TInventoryInstList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TInventoryInstList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TInventoryInstListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryInstListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TInventoryInstList", pm); }

    public Map<String, TKeepingLotCQ> xdfgetCustomerId_QueryDerivedReferrer_TKeepingLotList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TKeepingLotList"); }
    public String keepCustomerId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TKeepingLotList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TKeepingLotListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TKeepingLotList"); }
    public String keepCustomerId_QueryDerivedReferrer_TKeepingLotListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TKeepingLotList", pm); }

    public Map<String, TLastLotCQ> xdfgetCustomerId_QueryDerivedReferrer_TLastLotList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TLastLotList"); }
    public String keepCustomerId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TLastLotList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TLastLotListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TLastLotList"); }
    public String keepCustomerId_QueryDerivedReferrer_TLastLotListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TLastLotList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TMoveInstBByDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TMoveInstBByDepositIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TMoveInstBByDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TMoveInstBByDepositIdList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetCustomerId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList", pm); }

    public Map<String, TStockCQ> xdfgetCustomerId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TStockList"); }
    public String keepCustomerId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TStockList"); }
    public String keepCustomerId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, TStoreNoCQ> xdfgetCustomerId_QueryDerivedReferrer_TStoreNoList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TStoreNoList"); }
    public String keepCustomerId_QueryDerivedReferrer_TStoreNoList(TStoreNoCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TStoreNoList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TStoreNoListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TStoreNoList"); }
    public String keepCustomerId_QueryDerivedReferrer_TStoreNoListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TStoreNoList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCustomerId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList() { return xgetSQueMap("customerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList", pm); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("customerId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_WHtSerialReceiveInspList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_WHtSerialReceiveInspList", pm); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCustomerId_QueryDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("customerId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("customerId_QueryDerivedReferrer_WHtSerialShippingInspList", sq); }
    public Map<String, Object> xdfgetCustomerId_QueryDerivedReferrer_WHtSerialShippingInspListParameter() { return xgetSQuePmMap("customerId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object pm) { return xkeepSQuePm("customerId_QueryDerivedReferrer_WHtSerialShippingInspList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_CustomerId_Asc() { regOBA("CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_CustomerId_Desc() { regOBD("CUSTOMER_ID"); return this; }

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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _customerCd;
    public ConditionValue xdfgetCustomerCd()
    { if (_customerCd == null) { _customerCd = nCV(); }
      return _customerCd; }
    protected ConditionValue xgetCValueCustomerCd() { return xdfgetCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _customerNm;
    public ConditionValue xdfgetCustomerNm()
    { if (_customerNm == null) { _customerNm = nCV(); }
      return _customerNm; }
    protected ConditionValue xgetCValueCustomerNm() { return xdfgetCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_CustomerNm_Asc() { regOBA("CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_CustomerNm_Desc() { regOBD("CUSTOMER_NM"); return this; }

    protected ConditionValue _customerAbbr;
    public ConditionValue xdfgetCustomerAbbr()
    { if (_customerAbbr == null) { _customerAbbr = nCV(); }
      return _customerAbbr; }
    protected ConditionValue xgetCValueCustomerAbbr() { return xdfgetCustomerAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_CustomerAbbr_Asc() { regOBA("CUSTOMER_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_CustomerAbbr_Desc() { regOBD("CUSTOMER_ABBR"); return this; }

    protected ConditionValue _zipCd;
    public ConditionValue xdfgetZipCd()
    { if (_zipCd == null) { _zipCd = nCV(); }
      return _zipCd; }
    protected ConditionValue xgetCValueZipCd() { return xdfgetZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ZipCd_Asc() { regOBA("ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ZipCd_Desc() { regOBD("ZIP_CD"); return this; }

    protected ConditionValue _telNo;
    public ConditionValue xdfgetTelNo()
    { if (_telNo == null) { _telNo = nCV(); }
      return _telNo; }
    protected ConditionValue xgetCValueTelNo() { return xdfgetTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * TEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_TelNo_Asc() { regOBA("TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_TelNo_Desc() { regOBD("TEL_NO"); return this; }

    protected ConditionValue _address1;
    public ConditionValue xdfgetAddress1()
    { if (_address1 == null) { _address1 = nCV(); }
      return _address1; }
    protected ConditionValue xgetCValueAddress1() { return xdfgetAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

    protected ConditionValue _address3;
    public ConditionValue xdfgetAddress3()
    { if (_address3 == null) { _address3 = nCV(); }
      return _address3; }
    protected ConditionValue xgetCValueAddress3() { return xdfgetAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

    protected ConditionValue _vendorFlg;
    public ConditionValue xdfgetVendorFlg()
    { if (_vendorFlg == null) { _vendorFlg = nCV(); }
      return _vendorFlg; }
    protected ConditionValue xgetCValueVendorFlg() { return xdfgetVendorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_VendorFlg_Asc() { regOBA("VENDOR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_VendorFlg_Desc() { regOBD("VENDOR_FLG"); return this; }

    protected ConditionValue _deliveryFlg;
    public ConditionValue xdfgetDeliveryFlg()
    { if (_deliveryFlg == null) { _deliveryFlg = nCV(); }
      return _deliveryFlg; }
    protected ConditionValue xgetCValueDeliveryFlg() { return xdfgetDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DeliveryFlg_Asc() { regOBA("DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DeliveryFlg_Desc() { regOBD("DELIVERY_FLG"); return this; }

    protected ConditionValue _onetimeFlg;
    public ConditionValue xdfgetOnetimeFlg()
    { if (_onetimeFlg == null) { _onetimeFlg = nCV(); }
      return _onetimeFlg; }
    protected ConditionValue xgetCValueOnetimeFlg() { return xdfgetOnetimeFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_OnetimeFlg_Asc() { regOBA("ONETIME_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_OnetimeFlg_Desc() { regOBD("ONETIME_FLG"); return this; }

    protected ConditionValue _depositFlg;
    public ConditionValue xdfgetDepositFlg()
    { if (_depositFlg == null) { _depositFlg = nCV(); }
      return _depositFlg; }
    protected ConditionValue xgetCValueDepositFlg() { return xdfgetDepositFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DepositFlg_Asc() { regOBA("DEPOSIT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DepositFlg_Desc() { regOBD("DEPOSIT_FLG"); return this; }

    protected ConditionValue _allocOrder;
    public ConditionValue xdfgetAllocOrder()
    { if (_allocOrder == null) { _allocOrder = nCV(); }
      return _allocOrder; }
    protected ConditionValue xgetCValueAllocOrder() { return xdfgetAllocOrder(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_AllocOrder_Asc() { regOBA("ALLOC_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_AllocOrder_Desc() { regOBD("ALLOC_ORDER"); return this; }

    protected ConditionValue _lotReverseFlg;
    public ConditionValue xdfgetLotReverseFlg()
    { if (_lotReverseFlg == null) { _lotReverseFlg = nCV(); }
      return _lotReverseFlg; }
    protected ConditionValue xgetCValueLotReverseFlg() { return xdfgetLotReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_LotReverseFlg_Asc() { regOBA("LOT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_LotReverseFlg_Desc() { regOBD("LOT_REVERSE_FLG"); return this; }

    protected ConditionValue _limitDtReverseFlg;
    public ConditionValue xdfgetLimitDtReverseFlg()
    { if (_limitDtReverseFlg == null) { _limitDtReverseFlg = nCV(); }
      return _limitDtReverseFlg; }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return xdfgetLimitDtReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_LimitDtReverseFlg_Asc() { regOBA("LIMIT_DT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_LimitDtReverseFlg_Desc() { regOBD("LIMIT_DT_REVERSE_FLG"); return this; }

    protected ConditionValue _shippingStopFlg;
    public ConditionValue xdfgetShippingStopFlg()
    { if (_shippingStopFlg == null) { _shippingStopFlg = nCV(); }
      return _shippingStopFlg; }
    protected ConditionValue xgetCValueShippingStopFlg() { return xdfgetShippingStopFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ShippingStopFlg_Asc() { regOBA("SHIPPING_STOP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ShippingStopFlg_Desc() { regOBD("SHIPPING_STOP_FLG"); return this; }

    protected ConditionValue _delivCustomerId;
    public ConditionValue xdfgetDelivCustomerId()
    { if (_delivCustomerId == null) { _delivCustomerId = nCV(); }
      return _delivCustomerId; }
    protected ConditionValue xgetCValueDelivCustomerId() { return xdfgetDelivCustomerId(); }

    public Map<String, MCustomerCQ> getDelivCustomerId_InScopeRelation_MCustomerSelf() { return xgetSQueMap("delivCustomerId_InScopeRelation_MCustomerSelf"); }
    public String keepDelivCustomerId_InScopeRelation_MCustomerSelf(MCustomerCQ sq) { return xkeepSQue("delivCustomerId_InScopeRelation_MCustomerSelf", sq); }

    public Map<String, MCustomerCQ> getDelivCustomerId_NotInScopeRelation_MCustomerSelf() { return xgetSQueMap("delivCustomerId_NotInScopeRelation_MCustomerSelf"); }
    public String keepDelivCustomerId_NotInScopeRelation_MCustomerSelf(MCustomerCQ sq) { return xkeepSQue("delivCustomerId_NotInScopeRelation_MCustomerSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DelivCustomerId_Asc() { regOBA("DELIV_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DelivCustomerId_Desc() { regOBD("DELIV_CUSTOMER_ID"); return this; }

    protected ConditionValue _showPriority;
    public ConditionValue xdfgetShowPriority()
    { if (_showPriority == null) { _showPriority = nCV(); }
      return _showPriority; }
    protected ConditionValue xgetCValueShowPriority() { return xdfgetShowPriority(); }

    /**
     * Add order-by as ascend. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ShowPriority_Asc() { regOBA("SHOW_PRIORITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHOW_PRIORITY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ShowPriority_Desc() { regOBD("SHOW_PRIORITY"); return this; }

    protected ConditionValue _marketType;
    public ConditionValue xdfgetMarketType()
    { if (_marketType == null) { _marketType = nCV(); }
      return _marketType; }
    protected ConditionValue xgetCValueMarketType() { return xdfgetMarketType(); }

    /**
     * Add order-by as ascend. <br>
     * MARKET_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_MarketType_Asc() { regOBA("MARKET_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MARKET_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_MarketType_Desc() { regOBD("MARKET_TYPE"); return this; }

    protected ConditionValue _logisticsCd;
    public ConditionValue xdfgetLogisticsCd()
    { if (_logisticsCd == null) { _logisticsCd = nCV(); }
      return _logisticsCd; }
    protected ConditionValue xgetCValueLogisticsCd() { return xdfgetLogisticsCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_LogisticsCd_Asc() { regOBA("LOGISTICS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGISTICS_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_LogisticsCd_Desc() { regOBD("LOGISTICS_CD"); return this; }

    protected ConditionValue _faxNo;
    public ConditionValue xdfgetFaxNo()
    { if (_faxNo == null) { _faxNo = nCV(); }
      return _faxNo; }
    protected ConditionValue xgetCValueFaxNo() { return xdfgetFaxNo(); }

    /**
     * Add order-by as ascend. <br>
     * FAX_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_FaxNo_Asc() { regOBA("FAX_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAX_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_FaxNo_Desc() { regOBD("FAX_NO"); return this; }

    protected ConditionValue _deliveryTime;
    public ConditionValue xdfgetDeliveryTime()
    { if (_deliveryTime == null) { _deliveryTime = nCV(); }
      return _deliveryTime; }
    protected ConditionValue xgetCValueDeliveryTime() { return xdfgetDeliveryTime(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DeliveryTime_Asc() { regOBA("DELIVERY_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DeliveryTime_Desc() { regOBD("DELIVERY_TIME"); return this; }

    protected ConditionValue _comments;
    public ConditionValue xdfgetComments()
    { if (_comments == null) { _comments = nCV(); }
      return _comments; }
    protected ConditionValue xgetCValueComments() { return xdfgetComments(); }

    /**
     * Add order-by as ascend. <br>
     * COMMENTS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Comments_Asc() { regOBA("COMMENTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMENTS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Comments_Desc() { regOBD("COMMENTS"); return this; }

    protected ConditionValue _specialAgentsCd2;
    public ConditionValue xdfgetSpecialAgentsCd2()
    { if (_specialAgentsCd2 == null) { _specialAgentsCd2 = nCV(); }
      return _specialAgentsCd2; }
    protected ConditionValue xgetCValueSpecialAgentsCd2() { return xdfgetSpecialAgentsCd2(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_SpecialAgentsCd2_Asc() { regOBA("SPECIAL_AGENTS_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_SpecialAgentsCd2_Desc() { regOBD("SPECIAL_AGENTS_CD2"); return this; }

    protected ConditionValue _specialAgentsFlg;
    public ConditionValue xdfgetSpecialAgentsFlg()
    { if (_specialAgentsFlg == null) { _specialAgentsFlg = nCV(); }
      return _specialAgentsFlg; }
    protected ConditionValue xgetCValueSpecialAgentsFlg() { return xdfgetSpecialAgentsFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_SpecialAgentsFlg_Asc() { regOBA("SPECIAL_AGENTS_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_SpecialAgentsFlg_Desc() { regOBD("SPECIAL_AGENTS_FLG"); return this; }

    protected ConditionValue _othercolumn1;
    public ConditionValue xdfgetOthercolumn1()
    { if (_othercolumn1 == null) { _othercolumn1 = nCV(); }
      return _othercolumn1; }
    protected ConditionValue xgetCValueOthercolumn1() { return xdfgetOthercolumn1(); }

    /**
     * Add order-by as ascend. <br>
     * OtherColumn1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Othercolumn1_Asc() { regOBA("OtherColumn1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OtherColumn1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Othercolumn1_Desc() { regOBD("OtherColumn1"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * NAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _aName;
    public ConditionValue xdfgetAName()
    { if (_aName == null) { _aName = nCV(); }
      return _aName; }
    protected ConditionValue xgetCValueAName() { return xdfgetAName(); }

    /**
     * Add order-by as ascend. <br>
     * A_NAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_AName_Asc() { regOBA("A_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * A_NAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_AName_Desc() { regOBD("A_NAME"); return this; }

    protected ConditionValue _ssName;
    public ConditionValue xdfgetSsName()
    { if (_ssName == null) { _ssName = nCV(); }
      return _ssName; }
    protected ConditionValue xgetCValueSsName() { return xdfgetSsName(); }

    /**
     * Add order-by as ascend. <br>
     * SS_NAME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_SsName_Asc() { regOBA("SS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SS_NAME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_SsName_Desc() { regOBD("SS_NAME"); return this; }

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
    public BsMCustomerCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCustomerCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCustomerCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCustomerCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCustomerCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCustomerCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCustomerCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCustomerCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCustomerCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCustomerCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCustomerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCustomerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCustomerCQ bq = (MCustomerCQ)bqs;
        MCustomerCQ uq = (MCustomerCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMCustomerSelf()) {
            uq.queryMCustomerSelf().reflectRelationOnUnionQuery(bq.queryMCustomerSelf(), uq.queryMCustomerSelf());
        }
        if (bq.hasConditionQueryMClientCenterByClientId()) {
            uq.queryMClientCenterByClientId().reflectRelationOnUnionQuery(bq.queryMClientCenterByClientId(), uq.queryMClientCenterByClientId());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBClassDtlByDeliveryFlg()) {
            uq.queryBClassDtlByDeliveryFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDeliveryFlg(), uq.queryBClassDtlByDeliveryFlg());
        }
        if (bq.hasConditionQueryBClassDtlByDepositFlg()) {
            uq.queryBClassDtlByDepositFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDepositFlg(), uq.queryBClassDtlByDepositFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLimitDtReverseFlg()) {
            uq.queryBClassDtlByLimitDtReverseFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitDtReverseFlg(), uq.queryBClassDtlByLimitDtReverseFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLotReverseFlg()) {
            uq.queryBClassDtlByLotReverseFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLotReverseFlg(), uq.queryBClassDtlByLotReverseFlg());
        }
        if (bq.hasConditionQueryBClassDtlByOnetimeFlg()) {
            uq.queryBClassDtlByOnetimeFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByOnetimeFlg(), uq.queryBClassDtlByOnetimeFlg());
        }
        if (bq.hasConditionQueryBClassDtlByShippingStopFlg()) {
            uq.queryBClassDtlByShippingStopFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByShippingStopFlg(), uq.queryBClassDtlByShippingStopFlg());
        }
        if (bq.hasConditionQueryBClassDtlByVendorFlg()) {
            uq.queryBClassDtlByVendorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByVendorFlg(), uq.queryBClassDtlByVendorFlg());
        }
        if (bq.hasConditionQueryMCarrierSlipCesAsOne()) {
            uq.queryMCarrierSlipCesAsOne().reflectRelationOnUnionQuery(bq.queryMCarrierSlipCesAsOne(), uq.queryMCarrierSlipCesAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("M_CUSTOMER", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerSelf() {
        return xdfgetConditionQueryMCustomerSelf();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerSelf() {
        String prop = "mCustomerSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerSelf()); xsetupOuterJoinMCustomerSelf(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerSelf() {
        String nrp = xresolveNRP("M_CUSTOMER", "mCustomerSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerSelf", nrp);
    }
    protected void xsetupOuterJoinMCustomerSelf() { xregOutJo("mCustomerSelf"); }
    public boolean hasConditionQueryMCustomerSelf() { return xhasQueRlMap("mCustomerSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT_CENTER by my CUSTOMER_ID, CLIENT_ID, named 'MClientCenterByClientId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCenterCQ queryMClientCenterByClientId() {
        return xdfgetConditionQueryMClientCenterByClientId();
    }
    public MClientCenterCQ xdfgetConditionQueryMClientCenterByClientId() {
        String prop = "mClientCenterByClientId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClientCenterByClientId()); xsetupOuterJoinMClientCenterByClientId(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCenterCQ xcreateQueryMClientCenterByClientId() {
        String nrp = xresolveNRP("M_CUSTOMER", "mClientCenterByClientId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClientCenterByClientId", nrp);
    }
    protected void xsetupOuterJoinMClientCenterByClientId() { xregOutJo("mClientCenterByClientId"); }
    public boolean hasConditionQueryMClientCenterByClientId() { return xhasQueRlMap("mClientCenterByClientId"); }

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
        String nrp = xresolveNRP("M_CUSTOMER", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DELIVERY_FLG, named 'BClassDtlByDeliveryFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDeliveryFlg() {
        return xdfgetConditionQueryBClassDtlByDeliveryFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDeliveryFlg() {
        String prop = "bClassDtlByDeliveryFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDeliveryFlg()); xsetupOuterJoinBClassDtlByDeliveryFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDeliveryFlg() {
        String nrp = xresolveNRP("M_CUSTOMER", "bClassDtlByDeliveryFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDeliveryFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDeliveryFlg() { xregOutJo("bClassDtlByDeliveryFlg"); }
    public boolean hasConditionQueryBClassDtlByDeliveryFlg() { return xhasQueRlMap("bClassDtlByDeliveryFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEPOSIT_FLG, named 'BClassDtlByDepositFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDepositFlg() {
        return xdfgetConditionQueryBClassDtlByDepositFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDepositFlg() {
        String prop = "bClassDtlByDepositFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDepositFlg()); xsetupOuterJoinBClassDtlByDepositFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDepositFlg() {
        String nrp = xresolveNRP("M_CUSTOMER", "bClassDtlByDepositFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDepositFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDepositFlg() { xregOutJo("bClassDtlByDepositFlg"); }
    public boolean hasConditionQueryBClassDtlByDepositFlg() { return xhasQueRlMap("bClassDtlByDepositFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitDtReverseFlg() {
        return xdfgetConditionQueryBClassDtlByLimitDtReverseFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitDtReverseFlg() {
        String prop = "bClassDtlByLimitDtReverseFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitDtReverseFlg()); xsetupOuterJoinBClassDtlByLimitDtReverseFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitDtReverseFlg() {
        String nrp = xresolveNRP("M_CUSTOMER", "bClassDtlByLimitDtReverseFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitDtReverseFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitDtReverseFlg() { xregOutJo("bClassDtlByLimitDtReverseFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitDtReverseFlg() { return xhasQueRlMap("bClassDtlByLimitDtReverseFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLotReverseFlg() {
        return xdfgetConditionQueryBClassDtlByLotReverseFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLotReverseFlg() {
        String prop = "bClassDtlByLotReverseFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLotReverseFlg()); xsetupOuterJoinBClassDtlByLotReverseFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLotReverseFlg() {
        String nrp = xresolveNRP("M_CUSTOMER", "bClassDtlByLotReverseFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLotReverseFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLotReverseFlg() { xregOutJo("bClassDtlByLotReverseFlg"); }
    public boolean hasConditionQueryBClassDtlByLotReverseFlg() { return xhasQueRlMap("bClassDtlByLotReverseFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ONETIME_FLG, named 'BClassDtlByOnetimeFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByOnetimeFlg() {
        return xdfgetConditionQueryBClassDtlByOnetimeFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByOnetimeFlg() {
        String prop = "bClassDtlByOnetimeFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByOnetimeFlg()); xsetupOuterJoinBClassDtlByOnetimeFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByOnetimeFlg() {
        String nrp = xresolveNRP("M_CUSTOMER", "bClassDtlByOnetimeFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByOnetimeFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByOnetimeFlg() { xregOutJo("bClassDtlByOnetimeFlg"); }
    public boolean hasConditionQueryBClassDtlByOnetimeFlg() { return xhasQueRlMap("bClassDtlByOnetimeFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByShippingStopFlg() {
        return xdfgetConditionQueryBClassDtlByShippingStopFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByShippingStopFlg() {
        String prop = "bClassDtlByShippingStopFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByShippingStopFlg()); xsetupOuterJoinBClassDtlByShippingStopFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByShippingStopFlg() {
        String nrp = xresolveNRP("M_CUSTOMER", "bClassDtlByShippingStopFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByShippingStopFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByShippingStopFlg() { xregOutJo("bClassDtlByShippingStopFlg"); }
    public boolean hasConditionQueryBClassDtlByShippingStopFlg() { return xhasQueRlMap("bClassDtlByShippingStopFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my VENDOR_FLG, named 'BClassDtlByVendorFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByVendorFlg() {
        return xdfgetConditionQueryBClassDtlByVendorFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByVendorFlg() {
        String prop = "bClassDtlByVendorFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByVendorFlg()); xsetupOuterJoinBClassDtlByVendorFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByVendorFlg() {
        String nrp = xresolveNRP("M_CUSTOMER", "bClassDtlByVendorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByVendorFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByVendorFlg() { xregOutJo("bClassDtlByVendorFlg"); }
    public boolean hasConditionQueryBClassDtlByVendorFlg() { return xhasQueRlMap("bClassDtlByVendorFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CARRIER_SLIP_CES by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierSlipCesCQ queryMCarrierSlipCesAsOne() { return xdfgetConditionQueryMCarrierSlipCesAsOne(); }
    public MCarrierSlipCesCQ xdfgetConditionQueryMCarrierSlipCesAsOne() {
        String prop = "mCarrierSlipCesAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrierSlipCesAsOne()); xsetupOuterJoinMCarrierSlipCesAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierSlipCesCQ xcreateQueryMCarrierSlipCesAsOne() {
        String nrp = xresolveNRP("M_CUSTOMER", "mCarrierSlipCesAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierSlipCesCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrierSlipCesAsOne", nrp);
    }
    protected void xsetupOuterJoinMCarrierSlipCesAsOne() { xregOutJo("mCarrierSlipCesAsOne"); }
    public boolean hasConditionQueryMCarrierSlipCesAsOne() { return xhasQueRlMap("mCarrierSlipCesAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCustomerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCustomerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCustomerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCustomerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCustomerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCustomerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCustomerCQ> _myselfExistsMap;
    public Map<String, MCustomerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCustomerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCustomerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCustomerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCustomerCB.class.getName(); }
    protected String xCQ() { return MCustomerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
