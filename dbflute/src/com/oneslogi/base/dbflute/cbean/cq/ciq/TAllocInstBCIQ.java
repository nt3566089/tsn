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
 * The condition-query for in-line of T_ALLOC_INST_B.
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstBCIQ extends AbstractBsTAllocInstBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTAllocInstBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TAllocInstBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTAllocInstBCQ myCQ) {
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
    protected ConditionValue xgetCValueAllocInstBId() { return _myCQ.xdfgetAllocInstBId(); }
    public String keepAllocInstBId_ExistsReferrer_TAllocLotAsOne(TAllocLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstBId_ExistsReferrer_TPackingBList(TPackingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstBId_ExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstBId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstBId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstBId_NotExistsReferrer_TAllocLotAsOne(TAllocLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstBId_NotExistsReferrer_TPackingBList(TPackingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstBId_NotExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstBId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstBId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstBId_SpecifyDerivedReferrer_TPackingBList(TPackingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAllocInstBId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAllocInstBId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAllocInstBId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAllocInstBId_QueryDerivedReferrer_TPackingBList(TPackingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstBId_QueryDerivedReferrer_TPackingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstBId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstBId_QueryDerivedReferrer_TPickingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstBId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstBId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstBId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstBId_QueryDerivedReferrer_TStockInoutListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueAllocInstHId() { return _myCQ.xdfgetAllocInstHId(); }
    public String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq)
    { return _myCQ.keepAllocInstHId_InScopeRelation_TAllocInstH(sq); }
    public String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq)
    { return _myCQ.keepAllocInstHId_NotInScopeRelation_TAllocInstH(sq); }
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
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
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
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueStoreNoId() { return _myCQ.xdfgetStoreNoId(); }
    public String keepStoreNoId_InScopeRelation_TStoreNo(TStoreNoCQ sq)
    { return _myCQ.keepStoreNoId_InScopeRelation_TStoreNo(sq); }
    public String keepStoreNoId_NotInScopeRelation_TStoreNo(TStoreNoCQ sq)
    { return _myCQ.keepStoreNoId_NotInScopeRelation_TStoreNo(sq); }
    protected ConditionValue xgetCValueStoreLabelNo() { return _myCQ.xdfgetStoreLabelNo(); }
    protected ConditionValue xgetCValueShapeId() { return _myCQ.xdfgetShapeId(); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_InScopeRelation_MShape(sq); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_NotInScopeRelation_MShape(sq); }
    protected ConditionValue xgetCValueShapeCd() { return _myCQ.xdfgetShapeCd(); }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return _myCQ.xdfgetLimitDtReverseFlg(); }
    protected ConditionValue xgetCValueShippingLimitDt() { return _myCQ.xdfgetShippingLimitDt(); }
    protected ConditionValue xgetCValueLotManagFlg() { return _myCQ.xdfgetLotManagFlg(); }
    protected ConditionValue xgetCValueLimitDtManagFlg() { return _myCQ.xdfgetLimitDtManagFlg(); }
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
    protected ConditionValue xgetCValueInstNum() { return _myCQ.xdfgetInstNum(); }
    protected ConditionValue xgetCValueProcessNo() { return _myCQ.xdfgetProcessNo(); }
    protected ConditionValue xgetCValueAllocNum() { return _myCQ.xdfgetAllocNum(); }
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
    public String keepScalarCondition(TAllocInstBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TAllocInstBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TAllocInstBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TAllocInstBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TAllocInstBCB.class.getName(); }
    protected String xinCQ() { return TAllocInstBCQ.class.getName(); }
}
