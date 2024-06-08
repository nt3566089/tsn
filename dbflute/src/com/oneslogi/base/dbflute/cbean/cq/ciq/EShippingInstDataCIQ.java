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
 * The condition-query for in-line of E_SHIPPING_INST_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class EShippingInstDataCIQ extends AbstractBsEShippingInstDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShippingInstDataCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShippingInstDataCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShippingInstDataCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingInstDataId() { return _myCQ.xdfgetShippingInstDataId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueInstructionsDate() { return _myCQ.xdfgetInstructionsDate(); }
    protected ConditionValue xgetCValueOwnerDirectNo() { return _myCQ.xdfgetOwnerDirectNo(); }
    protected ConditionValue xgetCValueSalesType() { return _myCQ.xdfgetSalesType(); }
    protected ConditionValue xgetCValueShiptoCode() { return _myCQ.xdfgetShiptoCode(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueExpectQty() { return _myCQ.xdfgetExpectQty(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValuePlanPriceTotal() { return _myCQ.xdfgetPlanPriceTotal(); }
    protected ConditionValue xgetCValuePlanName() { return _myCQ.xdfgetPlanName(); }
    protected ConditionValue xgetCValuePlanpost() { return _myCQ.xdfgetPlanpost(); }
    protected ConditionValue xgetCValuePlanAdress1() { return _myCQ.xdfgetPlanAdress1(); }
    protected ConditionValue xgetCValuePlanAdress2() { return _myCQ.xdfgetPlanAdress2(); }
    protected ConditionValue xgetCValuePlanProductName() { return _myCQ.xdfgetPlanProductName(); }
    protected ConditionValue xgetCValueWarehousePlant() { return _myCQ.xdfgetWarehousePlant(); }
    protected ConditionValue xgetCValueWarehousePlantName() { return _myCQ.xdfgetWarehousePlantName(); }
    protected ConditionValue xgetCValueOrderDate() { return _myCQ.xdfgetOrderDate(); }
    protected ConditionValue xgetCValueDeliveryDate() { return _myCQ.xdfgetDeliveryDate(); }
    protected ConditionValue xgetCValuePurchaseNo() { return _myCQ.xdfgetPurchaseNo(); }
    protected ConditionValue xgetCValueOrderNumber() { return _myCQ.xdfgetOrderNumber(); }
    protected ConditionValue xgetCValueItemLineNo() { return _myCQ.xdfgetItemLineNo(); }
    protected ConditionValue xgetCValueSkuCode() { return _myCQ.xdfgetSkuCode(); }
    protected ConditionValue xgetCValueCardboard() { return _myCQ.xdfgetCardboard(); }
    protected ConditionValue xgetCValueCarton() { return _myCQ.xdfgetCarton(); }
    protected ConditionValue xgetCValueTotalQty() { return _myCQ.xdfgetTotalQty(); }
    protected ConditionValue xgetCValueNote() { return _myCQ.xdfgetNote(); }
    protected ConditionValue xgetCValueReserve2() { return _myCQ.xdfgetReserve2(); }
    protected ConditionValue xgetCValueReserve3() { return _myCQ.xdfgetReserve3(); }
    protected ConditionValue xgetCValueReserve() { return _myCQ.xdfgetReserve(); }
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
    public String keepScalarCondition(EShippingInstDataCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShippingInstDataCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShippingInstDataCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShippingInstDataCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShippingInstDataCB.class.getName(); }
    protected String xinCQ() { return EShippingInstDataCQ.class.getName(); }
}
