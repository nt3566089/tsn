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
 * The condition-query for in-line of T_INVENTORY_B.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryBCIQ extends AbstractBsTInventoryBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTInventoryBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TInventoryBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTInventoryBCQ myCQ) {
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
    protected ConditionValue xgetCValueInventoryBId() { return _myCQ.xdfgetInventoryBId(); }
    public String keepInventoryBId_ExistsReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepInventoryBId_ExistsReferrer_TInventoryRAsOne(TInventoryRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepInventoryBId_NotExistsReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepInventoryBId_NotExistsReferrer_TInventoryRAsOne(TInventoryRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepInventoryBId_SpecifyDerivedReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepInventoryBId_QueryDerivedReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepInventoryBId_QueryDerivedReferrer_TInventoryInpHistListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueInventoryHId() { return _myCQ.xdfgetInventoryHId(); }
    public String keepInventoryHId_InScopeRelation_TInventoryH(TInventoryHCQ sq)
    { return _myCQ.keepInventoryHId_InScopeRelation_TInventoryH(sq); }
    public String keepInventoryHId_NotInScopeRelation_TInventoryH(TInventoryHCQ sq)
    { return _myCQ.keepInventoryHId_NotInScopeRelation_TInventoryH(sq); }
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_InScopeRelation_TStock(sq); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_NotInScopeRelation_TStock(sq); }
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
    public String keepDepositId_InScopeRelation_MCustomerByDepositId(MCustomerCQ sq)
    { return _myCQ.keepDepositId_InScopeRelation_MCustomerByDepositId(sq); }
    public String keepDepositId_NotInScopeRelation_MCustomerByDepositId(MCustomerCQ sq)
    { return _myCQ.keepDepositId_NotInScopeRelation_MCustomerByDepositId(sq); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    public String keepLotId_InScopeRelation_TLot(TLotCQ sq)
    { return _myCQ.keepLotId_InScopeRelation_TLot(sq); }
    public String keepLotId_NotInScopeRelation_TLot(TLotCQ sq)
    { return _myCQ.keepLotId_NotInScopeRelation_TLot(sq); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueStoreNoId() { return _myCQ.xdfgetStoreNoId(); }
    public String keepStoreNoId_InScopeRelation_TStoreNo(TStoreNoCQ sq)
    { return _myCQ.keepStoreNoId_InScopeRelation_TStoreNo(sq); }
    public String keepStoreNoId_NotInScopeRelation_TStoreNo(TStoreNoCQ sq)
    { return _myCQ.keepStoreNoId_NotInScopeRelation_TStoreNo(sq); }
    protected ConditionValue xgetCValueStoreLabelNo() { return _myCQ.xdfgetStoreLabelNo(); }
    protected ConditionValue xgetCValueStoreDt() { return _myCQ.xdfgetStoreDt(); }
    protected ConditionValue xgetCValueSupplierId() { return _myCQ.xdfgetSupplierId(); }
    public String keepSupplierId_InScopeRelation_MCustomerBySupplierId(MCustomerCQ sq)
    { return _myCQ.keepSupplierId_InScopeRelation_MCustomerBySupplierId(sq); }
    public String keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(MCustomerCQ sq)
    { return _myCQ.keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(sq); }
    protected ConditionValue xgetCValueSupplierCd() { return _myCQ.xdfgetSupplierCd(); }
    protected ConditionValue xgetCValueShapeId() { return _myCQ.xdfgetShapeId(); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_InScopeRelation_MShape(sq); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_NotInScopeRelation_MShape(sq); }
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
    protected ConditionValue xgetCValueChargeNum() { return _myCQ.xdfgetChargeNum(); }
    protected ConditionValue xgetCValueAllocNum() { return _myCQ.xdfgetAllocNum(); }
    protected ConditionValue xgetCValueMoveNum() { return _myCQ.xdfgetMoveNum(); }
    protected ConditionValue xgetCValueInventoryNum() { return _myCQ.xdfgetInventoryNum(); }
    protected ConditionValue xgetCValueInputType() { return _myCQ.xdfgetInputType(); }
    protected ConditionValue xgetCValueStockAdjustFlg() { return _myCQ.xdfgetStockAdjustFlg(); }
    protected ConditionValue xgetCValueMoveInstHId() { return _myCQ.xdfgetMoveInstHId(); }
    public String keepMoveInstHId_InScopeRelation_TMoveInstH(TMoveInstHCQ sq)
    { return _myCQ.keepMoveInstHId_InScopeRelation_TMoveInstH(sq); }
    public String keepMoveInstHId_NotInScopeRelation_TMoveInstH(TMoveInstHCQ sq)
    { return _myCQ.keepMoveInstHId_NotInScopeRelation_TMoveInstH(sq); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueFirmtransportCd() { return _myCQ.xdfgetFirmtransportCd(); }
    protected ConditionValue xgetCValueManufactureDt() { return _myCQ.xdfgetManufactureDt(); }
    protected ConditionValue xgetCValueManufactureSymbol() { return _myCQ.xdfgetManufactureSymbol(); }
    protected ConditionValue xgetCValueFcflg() { return _myCQ.xdfgetFcflg(); }
    protected ConditionValue xgetCValueDiffqtyHenpin() { return _myCQ.xdfgetDiffqtyHenpin(); }
    protected ConditionValue xgetCValueDiffqtyTaxrefond() { return _myCQ.xdfgetDiffqtyTaxrefond(); }
    protected ConditionValue xgetCValueSuffererQty() { return _myCQ.xdfgetSuffererQty(); }
    protected ConditionValue xgetCValueMonthStatussu() { return _myCQ.xdfgetMonthStatussu(); }
    protected ConditionValue xgetCValueBlukRecivedQty() { return _myCQ.xdfgetBlukRecivedQty(); }
    protected ConditionValue xgetCValueRefunditemQty() { return _myCQ.xdfgetRefunditemQty(); }
    protected ConditionValue xgetCValueInventoryInputFlg() { return _myCQ.xdfgetInventoryInputFlg(); }
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
    public String keepScalarCondition(TInventoryBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TInventoryBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TInventoryBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TInventoryBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TInventoryBCB.class.getName(); }
    protected String xinCQ() { return TInventoryBCQ.class.getName(); }
}
