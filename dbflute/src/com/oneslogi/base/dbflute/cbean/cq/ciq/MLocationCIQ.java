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
 * The condition-query for in-line of M_LOCATION.
 * @author DBFlute(AutoGenerator)
 */
public class MLocationCIQ extends AbstractBsMLocationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMLocationCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MLocationCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMLocationCQ myCQ) {
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
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    public String keepLocationId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TMoveRecordBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TReceivePlanBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TStoreRecordBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_TTrpickdetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLocationId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueZoneId() { return _myCQ.xdfgetZoneId(); }
    public String keepZoneId_InScopeRelation_MZone(MZoneCQ sq)
    { return _myCQ.keepZoneId_InScopeRelation_MZone(sq); }
    public String keepZoneId_NotInScopeRelation_MZone(MZoneCQ sq)
    { return _myCQ.keepZoneId_NotInScopeRelation_MZone(sq); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueLocationNm() { return _myCQ.xdfgetLocationNm(); }
    protected ConditionValue xgetCValuePickingLocationFlg() { return _myCQ.xdfgetPickingLocationFlg(); }
    protected ConditionValue xgetCValuePickingOrder() { return _myCQ.xdfgetPickingOrder(); }
    protected ConditionValue xgetCValueLocationType() { return _myCQ.xdfgetLocationType(); }
    protected ConditionValue xgetCValueAllocOrder() { return _myCQ.xdfgetAllocOrder(); }
    protected ConditionValue xgetCValueAllocNgFlg() { return _myCQ.xdfgetAllocNgFlg(); }
    protected ConditionValue xgetCValueReplenishProductId() { return _myCQ.xdfgetReplenishProductId(); }
    public String keepReplenishProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepReplenishProductId_InScopeRelation_MProduct(sq); }
    public String keepReplenishProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepReplenishProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueReplenishStockTypeId() { return _myCQ.xdfgetReplenishStockTypeId(); }
    public String keepReplenishStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepReplenishStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepReplenishStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepReplenishStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueReplenishDepositId() { return _myCQ.xdfgetReplenishDepositId(); }
    public String keepReplenishDepositId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepReplenishDepositId_InScopeRelation_MCustomer(sq); }
    public String keepReplenishDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepReplenishDepositId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueReplenishPNum() { return _myCQ.xdfgetReplenishPNum(); }
    protected ConditionValue xgetCValueReplenishPProductShapeId() { return _myCQ.xdfgetReplenishPProductShapeId(); }
    public String keepReplenishPProductShapeId_InScopeRelation_MProductShapeByReplenishPProductShapeId(MProductShapeCQ sq)
    { return _myCQ.keepReplenishPProductShapeId_InScopeRelation_MProductShapeByReplenishPProductShapeId(sq); }
    public String keepReplenishPProductShapeId_NotInScopeRelation_MProductShapeByReplenishPProductShapeId(MProductShapeCQ sq)
    { return _myCQ.keepReplenishPProductShapeId_NotInScopeRelation_MProductShapeByReplenishPProductShapeId(sq); }
    protected ConditionValue xgetCValueMaxStoreNum() { return _myCQ.xdfgetMaxStoreNum(); }
    protected ConditionValue xgetCValueMaxStoreProductShapeId() { return _myCQ.xdfgetMaxStoreProductShapeId(); }
    public String keepMaxStoreProductShapeId_InScopeRelation_MProductShapeByMaxStoreProductShapeId(MProductShapeCQ sq)
    { return _myCQ.keepMaxStoreProductShapeId_InScopeRelation_MProductShapeByMaxStoreProductShapeId(sq); }
    public String keepMaxStoreProductShapeId_NotInScopeRelation_MProductShapeByMaxStoreProductShapeId(MProductShapeCQ sq)
    { return _myCQ.keepMaxStoreProductShapeId_NotInScopeRelation_MProductShapeByMaxStoreProductShapeId(sq); }
    protected ConditionValue xgetCValueLocgroup() { return _myCQ.xdfgetLocgroup(); }
    protected ConditionValue xgetCValuePalletecapacity() { return _myCQ.xdfgetPalletecapacity(); }
    protected ConditionValue xgetCValueCapacity() { return _myCQ.xdfgetCapacity(); }
    protected ConditionValue xgetCValueLinblk() { return _myCQ.xdfgetLinblk(); }
    protected ConditionValue xgetCValueLocid() { return _myCQ.xdfgetLocid(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueSplrevun() { return _myCQ.xdfgetSplrevun(); }
    protected ConditionValue xgetCValueSplrevctqa() { return _myCQ.xdfgetSplrevctqa(); }
    protected ConditionValue xgetCValueBssplpt() { return _myCQ.xdfgetBssplpt(); }
    protected ConditionValue xgetCValueTosplmd() { return _myCQ.xdfgetTosplmd(); }
    protected ConditionValue xgetCValuePresplmd() { return _myCQ.xdfgetPresplmd(); }
    protected ConditionValue xgetCValueVirtuallocflg() { return _myCQ.xdfgetVirtuallocflg(); }
    protected ConditionValue xgetCValueRootoutseq() { return _myCQ.xdfgetRootoutseq(); }
    protected ConditionValue xgetCValueFloor() { return _myCQ.xdfgetFloor(); }
    protected ConditionValue xgetCValueZne() { return _myCQ.xdfgetZne(); }
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
    public String keepScalarCondition(MLocationCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MLocationCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MLocationCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MLocationCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MLocationCB.class.getName(); }
    protected String xinCQ() { return MLocationCQ.class.getName(); }
}
