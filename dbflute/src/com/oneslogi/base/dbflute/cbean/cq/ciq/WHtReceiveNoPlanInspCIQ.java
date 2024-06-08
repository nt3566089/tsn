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
 * The condition-query for in-line of W_HT_RECEIVE_NO_PLAN_INSP.
 * @author DBFlute(AutoGenerator)
 */
public class WHtReceiveNoPlanInspCIQ extends AbstractBsWHtReceiveNoPlanInspCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWHtReceiveNoPlanInspCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WHtReceiveNoPlanInspCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWHtReceiveNoPlanInspCQ myCQ) {
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
    protected ConditionValue xgetCValueHtReceiveNoPlanInspId() { return _myCQ.xdfgetHtReceiveNoPlanInspId(); }
    protected ConditionValue xgetCValueMacAddress() { return _myCQ.xdfgetMacAddress(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
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
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueDepositId() { return _myCQ.xdfgetDepositId(); }
    public String keepDepositId_InScopeRelation_MCustomerByDepositId(MCustomerCQ sq)
    { return _myCQ.keepDepositId_InScopeRelation_MCustomerByDepositId(sq); }
    public String keepDepositId_NotInScopeRelation_MCustomerByDepositId(MCustomerCQ sq)
    { return _myCQ.keepDepositId_NotInScopeRelation_MCustomerByDepositId(sq); }
    protected ConditionValue xgetCValueDepositNm() { return _myCQ.xdfgetDepositNm(); }
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueProcessTypeNm() { return _myCQ.xdfgetProcessTypeNm(); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueStockTypeNm() { return _myCQ.xdfgetStockTypeNm(); }
    protected ConditionValue xgetCValueClientReceiveNo() { return _myCQ.xdfgetClientReceiveNo(); }
    protected ConditionValue xgetCValueSupplierId() { return _myCQ.xdfgetSupplierId(); }
    public String keepSupplierId_InScopeRelation_MCustomerBySupplierId(MCustomerCQ sq)
    { return _myCQ.keepSupplierId_InScopeRelation_MCustomerBySupplierId(sq); }
    public String keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(MCustomerCQ sq)
    { return _myCQ.keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(sq); }
    protected ConditionValue xgetCValueSupplierCd() { return _myCQ.xdfgetSupplierCd(); }
    protected ConditionValue xgetCValueSupplierNm() { return _myCQ.xdfgetSupplierNm(); }
    protected ConditionValue xgetCValuePieceQtyRcv() { return _myCQ.xdfgetPieceQtyRcv(); }
    protected ConditionValue xgetCValueRcvLocId() { return _myCQ.xdfgetRcvLocId(); }
    public String keepRcvLocId_InScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepRcvLocId_InScopeRelation_MLocation(sq); }
    public String keepRcvLocId_NotInScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepRcvLocId_NotInScopeRelation_MLocation(sq); }
    protected ConditionValue xgetCValueRcvLocCd() { return _myCQ.xdfgetRcvLocCd(); }
    protected ConditionValue xgetCValueRcvLocNm() { return _myCQ.xdfgetRcvLocNm(); }
    protected ConditionValue xgetCValueHtWorkNo() { return _myCQ.xdfgetHtWorkNo(); }
    protected ConditionValue xgetCValueStoreNo() { return _myCQ.xdfgetStoreNo(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    public String keepLotId_InScopeRelation_TLot(TLotCQ sq)
    { return _myCQ.keepLotId_InScopeRelation_TLot(sq); }
    public String keepLotId_NotInScopeRelation_TLot(TLotCQ sq)
    { return _myCQ.keepLotId_NotInScopeRelation_TLot(sq); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueLabelSelect() { return _myCQ.xdfgetLabelSelect(); }
    protected ConditionValue xgetCValueWorkStartDt() { return _myCQ.xdfgetWorkStartDt(); }
    protected ConditionValue xgetCValueWorkEndDt() { return _myCQ.xdfgetWorkEndDt(); }
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
    public String keepScalarCondition(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WHtReceiveNoPlanInspCB.class.getName(); }
    protected String xinCQ() { return WHtReceiveNoPlanInspCQ.class.getName(); }
}
