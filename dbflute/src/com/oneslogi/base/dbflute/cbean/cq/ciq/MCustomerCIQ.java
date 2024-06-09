package com.oneslogi.base.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.bs.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of M_CUSTOMER.
 * @author DBFlute(AutoGenerator)
 */
public class MCustomerCIQ extends AbstractBsMCustomerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCustomerCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCustomerCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCustomerCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueCustomerId() { return _myCQ.xdfgetCustomerId(); }
    public String keepCustomerId_ExistsReferrer_MCarrierSlipCesAsOne(MCarrierSlipCesCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_MClientList(MClientCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_MCustomerSelfList(MCustomerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_MUserDepositList(MUserDepositCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TStoreNoList(TStoreNoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_MCarrierSlipCesAsOne(MCarrierSlipCesCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_MClientList(MClientCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_MCustomerSelfList(MCustomerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_MUserDepositList(MUserDepositCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TStoreNoList(TStoreNoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_MClientList(MClientCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_MCustomerSelfList(MCustomerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_MUserDepositList(MUserDepositCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TStoreNoList(TStoreNoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MClientList(MClientCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MClientListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MClientCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MCustomerSelfList(MCustomerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MCustomerSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MLocationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MUserDepositList(MUserDepositCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_MUserDepositListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TAllocLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TInventoryInstListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TKeepingLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TLastLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TStoreNoList(TStoreNoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TStoreNoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueCustomerNm() { return _myCQ.xdfgetCustomerNm(); }
    protected ConditionValue xgetCValueCustomerAbbr() { return _myCQ.xdfgetCustomerAbbr(); }
    protected ConditionValue xgetCValueZipCd() { return _myCQ.xdfgetZipCd(); }
    protected ConditionValue xgetCValueTelNo() { return _myCQ.xdfgetTelNo(); }
    protected ConditionValue xgetCValueAddress1() { return _myCQ.xdfgetAddress1(); }
    protected ConditionValue xgetCValueAddress2() { return _myCQ.xdfgetAddress2(); }
    protected ConditionValue xgetCValueAddress3() { return _myCQ.xdfgetAddress3(); }
    protected ConditionValue xgetCValueVendorFlg() { return _myCQ.xdfgetVendorFlg(); }
    protected ConditionValue xgetCValueDeliveryFlg() { return _myCQ.xdfgetDeliveryFlg(); }
    protected ConditionValue xgetCValueOnetimeFlg() { return _myCQ.xdfgetOnetimeFlg(); }
    protected ConditionValue xgetCValueDepositFlg() { return _myCQ.xdfgetDepositFlg(); }
    protected ConditionValue xgetCValueAllocOrder() { return _myCQ.xdfgetAllocOrder(); }
    protected ConditionValue xgetCValueLotReverseFlg() { return _myCQ.xdfgetLotReverseFlg(); }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return _myCQ.xdfgetLimitDtReverseFlg(); }
    protected ConditionValue xgetCValueShippingStopFlg() { return _myCQ.xdfgetShippingStopFlg(); }
    protected ConditionValue xgetCValueDelivCustomerId() { return _myCQ.xdfgetDelivCustomerId(); }
    public String keepDelivCustomerId_InScopeRelation_MCustomerSelf(MCustomerCQ sq)
    { return _myCQ.keepDelivCustomerId_InScopeRelation_MCustomerSelf(sq); }
    public String keepDelivCustomerId_NotInScopeRelation_MCustomerSelf(MCustomerCQ sq)
    { return _myCQ.keepDelivCustomerId_NotInScopeRelation_MCustomerSelf(sq); }
    protected ConditionValue xgetCValueShowPriority() { return _myCQ.xdfgetShowPriority(); }
    protected ConditionValue xgetCValueMarketType() { return _myCQ.xdfgetMarketType(); }
    protected ConditionValue xgetCValueLogisticsCd() { return _myCQ.xdfgetLogisticsCd(); }
    protected ConditionValue xgetCValueFaxNo() { return _myCQ.xdfgetFaxNo(); }
    protected ConditionValue xgetCValueDeliveryTime() { return _myCQ.xdfgetDeliveryTime(); }
    protected ConditionValue xgetCValueComments() { return _myCQ.xdfgetComments(); }
    protected ConditionValue xgetCValueSpecialAgentsCd2() { return _myCQ.xdfgetSpecialAgentsCd2(); }
    protected ConditionValue xgetCValueSpecialAgentsFlg() { return _myCQ.xdfgetSpecialAgentsFlg(); }
    protected ConditionValue xgetCValueOthercolumn1() { return _myCQ.xdfgetOthercolumn1(); }
    protected ConditionValue xgetCValueName() { return _myCQ.xdfgetName(); }
    protected ConditionValue xgetCValueAName() { return _myCQ.xdfgetAName(); }
    protected ConditionValue xgetCValueSsName() { return _myCQ.xdfgetSsName(); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected ConditionValue xgetCValueControlNo() { return _myCQ.xdfgetControlNo(); }
    protected ConditionValue xgetCValueAddDt() { return _myCQ.xdfgetAddDt(); }
    protected ConditionValue xgetCValueAddUser() { return _myCQ.xdfgetAddUser(); }
    protected ConditionValue xgetCValueAddProcess() { return _myCQ.xdfgetAddProcess(); }
    protected ConditionValue xgetCValueUpdDt() { return _myCQ.xdfgetUpdDt(); }
    protected ConditionValue xgetCValueUpdUser() { return _myCQ.xdfgetUpdUser(); }
    protected ConditionValue xgetCValueUpdProcess() { return _myCQ.xdfgetUpdProcess(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MCustomerCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCustomerCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCustomerCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCustomerCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCustomerCB.class.getName(); }
    protected String xinCQ() { return MCustomerCQ.class.getName(); }
}
