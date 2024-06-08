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
 * The condition-query for in-line of T_STOCK.
 * @author DBFlute(AutoGenerator)
 */
public class TStockCIQ extends AbstractBsTStockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTStockCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TStockCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTStockCQ myCQ) {
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
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_TStockReportAsOne(TStockReportCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_TTrimallocstockList(TTrimallocstockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_TStockReportAsOne(TStockReportCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_TTrimallocstockList(TTrimallocstockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_TTrimallocstockList(TTrimallocstockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TPalletListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TPickingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TStockInoutListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TTrimallocstockList(TTrimallocstockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TTrimallocstockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_TTrpickdetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueWarehouseId() { return _myCQ.xdfgetWarehouseId(); }
    public String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq)
    { return _myCQ.keepWarehouseId_InScopeRelation_MWarehouse(sq); }
    public String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq)
    { return _myCQ.keepWarehouseId_NotInScopeRelation_MWarehouse(sq); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    public String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepLocationId_InScopeRelation_MLocation(sq); }
    public String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepLocationId_NotInScopeRelation_MLocation(sq); }
    protected ConditionValue xgetCValueDepositId() { return _myCQ.xdfgetDepositId(); }
    public String keepDepositId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepDepositId_InScopeRelation_MCustomer(sq); }
    public String keepDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepDepositId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    public String keepLotId_InScopeRelation_TLot(TLotCQ sq)
    { return _myCQ.keepLotId_InScopeRelation_TLot(sq); }
    public String keepLotId_NotInScopeRelation_TLot(TLotCQ sq)
    { return _myCQ.keepLotId_NotInScopeRelation_TLot(sq); }
    protected ConditionValue xgetCValueShapeId() { return _myCQ.xdfgetShapeId(); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_InScopeRelation_MShape(sq); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_NotInScopeRelation_MShape(sq); }
    protected ConditionValue xgetCValueStoreNoId() { return _myCQ.xdfgetStoreNoId(); }
    public String keepStoreNoId_InScopeRelation_TStoreNo(TStoreNoCQ sq)
    { return _myCQ.keepStoreNoId_InScopeRelation_TStoreNo(sq); }
    public String keepStoreNoId_NotInScopeRelation_TStoreNo(TStoreNoCQ sq)
    { return _myCQ.keepStoreNoId_NotInScopeRelation_TStoreNo(sq); }
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
    protected ConditionValue xgetCValueChargeNum() { return _myCQ.xdfgetChargeNum(); }
    protected ConditionValue xgetCValueAllocNum() { return _myCQ.xdfgetAllocNum(); }
    protected ConditionValue xgetCValueMoveNum() { return _myCQ.xdfgetMoveNum(); }
    protected ConditionValue xgetCValueTransitNum() { return _myCQ.xdfgetTransitNum(); }
    protected ConditionValue xgetCValueCompanycd() { return _myCQ.xdfgetCompanycd(); }
    protected ConditionValue xgetCValueLogicflg1() { return _myCQ.xdfgetLogicflg1(); }
    protected ConditionValue xgetCValueLogicflg2() { return _myCQ.xdfgetLogicflg2(); }
    protected ConditionValue xgetCValueLogicflg3() { return _myCQ.xdfgetLogicflg3(); }
    protected ConditionValue xgetCValueTagcd() { return _myCQ.xdfgetTagcd(); }
    protected ConditionValue xgetCValueQty2avg() { return _myCQ.xdfgetQty2avg(); }
    protected ConditionValue xgetCValueQty3avg() { return _myCQ.xdfgetQty3avg(); }
    protected ConditionValue xgetCValueQty1instructed() { return _myCQ.xdfgetQty1instructed(); }
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
    public String keepScalarCondition(TStockCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TStockCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TStockCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TStockCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TStockCB.class.getName(); }
    protected String xinCQ() { return TStockCQ.class.getName(); }
}
