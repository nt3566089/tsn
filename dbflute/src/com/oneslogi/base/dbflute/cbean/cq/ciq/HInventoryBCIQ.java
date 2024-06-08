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
 * The condition-query for in-line of H_INVENTORY_B.
 * @author DBFlute(AutoGenerator)
 */
public class HInventoryBCIQ extends AbstractBsHInventoryBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsHInventoryBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public HInventoryBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsHInventoryBCQ myCQ) {
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
    protected ConditionValue xgetCValueInventoryHId() { return _myCQ.xdfgetInventoryHId(); }
    public String keepInventoryHId_InScopeRelation_HInventoryH(HInventoryHCQ sq)
    { return _myCQ.keepInventoryHId_InScopeRelation_HInventoryH(sq); }
    public String keepInventoryHId_NotInScopeRelation_HInventoryH(HInventoryHCQ sq)
    { return _myCQ.keepInventoryHId_NotInScopeRelation_HInventoryH(sq); }
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_InScopeRelation_HStock(HStockCQ sq)
    { return _myCQ.keepStockId_InScopeRelation_HStock(sq); }
    public String keepStockId_NotInScopeRelation_HStock(HStockCQ sq)
    { return _myCQ.keepStockId_NotInScopeRelation_HStock(sq); }
    protected ConditionValue xgetCValueWarehouseId() { return _myCQ.xdfgetWarehouseId(); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueWarehouseNm() { return _myCQ.xdfgetWarehouseNm(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueLocationNm() { return _myCQ.xdfgetLocationNm(); }
    protected ConditionValue xgetCValueDepositId() { return _myCQ.xdfgetDepositId(); }
    protected ConditionValue xgetCValueDepositCd() { return _myCQ.xdfgetDepositCd(); }
    protected ConditionValue xgetCValueDepositNm() { return _myCQ.xdfgetDepositNm(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueShapeId() { return _myCQ.xdfgetShapeId(); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_InScopeRelation_MShape(sq); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_NotInScopeRelation_MShape(sq); }
    protected ConditionValue xgetCValueStoreNoId() { return _myCQ.xdfgetStoreNoId(); }
    protected ConditionValue xgetCValueStoreLabelNo() { return _myCQ.xdfgetStoreLabelNo(); }
    protected ConditionValue xgetCValueSupplierId() { return _myCQ.xdfgetSupplierId(); }
    protected ConditionValue xgetCValueSupplierCd() { return _myCQ.xdfgetSupplierCd(); }
    protected ConditionValue xgetCValueSupplierNm() { return _myCQ.xdfgetSupplierNm(); }
    protected ConditionValue xgetCValueStoreDt() { return _myCQ.xdfgetStoreDt(); }
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
    protected ConditionValue xgetCValueChargeNum() { return _myCQ.xdfgetChargeNum(); }
    protected ConditionValue xgetCValueAllocNum() { return _myCQ.xdfgetAllocNum(); }
    protected ConditionValue xgetCValueMoveNum() { return _myCQ.xdfgetMoveNum(); }
    protected ConditionValue xgetCValueInventoryNum() { return _myCQ.xdfgetInventoryNum(); }
    protected ConditionValue xgetCValueInputType() { return _myCQ.xdfgetInputType(); }
    protected ConditionValue xgetCValueStockAdjustFlg() { return _myCQ.xdfgetStockAdjustFlg(); }
    protected ConditionValue xgetCValueMoveInstHId() { return _myCQ.xdfgetMoveInstHId(); }
    public String keepMoveInstHId_InScopeRelation_HMoveH(HMoveHCQ sq)
    { return _myCQ.keepMoveInstHId_InScopeRelation_HMoveH(sq); }
    public String keepMoveInstHId_NotInScopeRelation_HMoveH(HMoveHCQ sq)
    { return _myCQ.keepMoveInstHId_NotInScopeRelation_HMoveH(sq); }
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
    public String keepScalarCondition(HInventoryBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(HInventoryBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(HInventoryBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(HInventoryBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return HInventoryBCB.class.getName(); }
    protected String xinCQ() { return HInventoryBCQ.class.getName(); }
}
