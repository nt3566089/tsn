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
 * The condition-query for in-line of T_SHIPPING_INST_B.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstBCIQ extends AbstractBsTShippingInstBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTShippingInstBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TShippingInstBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTShippingInstBCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingInstBId() { return _myCQ.xdfgetShippingInstBId(); }
    public String keepShippingInstBId_ExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShippingInstBId_ExistsReferrer_TShippingInstSpareAsOne(TShippingInstSpareCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShippingInstBId_NotExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShippingInstBId_NotExistsReferrer_TShippingInstSpareAsOne(TShippingInstSpareCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShippingInstBId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShippingInstBId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstBId_QueryDerivedReferrer_TPickingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueShippingInstHId() { return _myCQ.xdfgetShippingInstHId(); }
    public String keepShippingInstHId_InScopeRelation_TShippingInstH(TShippingInstHCQ sq)
    { return _myCQ.keepShippingInstHId_InScopeRelation_TShippingInstH(sq); }
    public String keepShippingInstHId_NotInScopeRelation_TShippingInstH(TShippingInstHCQ sq)
    { return _myCQ.keepShippingInstHId_NotInScopeRelation_TShippingInstH(sq); }
    protected ConditionValue xgetCValueLineNo() { return _myCQ.xdfgetLineNo(); }
    protected ConditionValue xgetCValueWarehouseId() { return _myCQ.xdfgetWarehouseId(); }
    public String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq)
    { return _myCQ.keepWarehouseId_InScopeRelation_MWarehouse(sq); }
    public String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq)
    { return _myCQ.keepWarehouseId_NotInScopeRelation_MWarehouse(sq); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueStockTypeCd() { return _myCQ.xdfgetStockTypeCd(); }
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
    protected ConditionValue xgetCValueDepositCd() { return _myCQ.xdfgetDepositCd(); }
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
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
    protected ConditionValue xgetCValueInstNum() { return _myCQ.xdfgetInstNum(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueAllocInstBId() { return _myCQ.xdfgetAllocInstBId(); }
    public String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq)
    { return _myCQ.keepAllocInstBId_InScopeRelation_TAllocInstB(sq); }
    public String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq)
    { return _myCQ.keepAllocInstBId_NotInScopeRelation_TAllocInstB(sq); }
    protected ConditionValue xgetCValueAllocNum() { return _myCQ.xdfgetAllocNum(); }
    protected ConditionValue xgetCValueStockOutNum() { return _myCQ.xdfgetStockOutNum(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValuePrice() { return _myCQ.xdfgetPrice(); }
    protected ConditionValue xgetCValueTax() { return _myCQ.xdfgetTax(); }
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
    public String keepScalarCondition(TShippingInstBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TShippingInstBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TShippingInstBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TShippingInstBCB.class.getName(); }
    protected String xinCQ() { return TShippingInstBCQ.class.getName(); }
}
