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
 * The condition-query for in-line of E_SHIPPING_INST.
 * @author DBFlute(AutoGenerator)
 */
public class EShippingInstCIQ extends AbstractBsEShippingInstCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShippingInstCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShippingInstCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShippingInstCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingInstId() { return _myCQ.xdfgetShippingInstId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueEmergencyFlg() { return _myCQ.xdfgetEmergencyFlg(); }
    protected ConditionValue xgetCValueClientShippingNo() { return _myCQ.xdfgetClientShippingNo(); }
    protected ConditionValue xgetCValueSupplyCustomerCd() { return _myCQ.xdfgetSupplyCustomerCd(); }
    protected ConditionValue xgetCValueSupplyCustomerNm() { return _myCQ.xdfgetSupplyCustomerNm(); }
    protected ConditionValue xgetCValueProcessTypeCd() { return _myCQ.xdfgetProcessTypeCd(); }
    protected ConditionValue xgetCValueDelivPlanDt() { return _myCQ.xdfgetDelivPlanDt(); }
    protected ConditionValue xgetCValueWorkDt() { return _myCQ.xdfgetWorkDt(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return _myCQ.xdfgetDeliveryCourseCd(); }
    protected ConditionValue xgetCValueDelivDt() { return _myCQ.xdfgetDelivDt(); }
    protected ConditionValue xgetCValueDelivTz() { return _myCQ.xdfgetDelivTz(); }
    protected ConditionValue xgetCValueDelivCustomerCd() { return _myCQ.xdfgetDelivCustomerCd(); }
    protected ConditionValue xgetCValueDelivCustomerNm() { return _myCQ.xdfgetDelivCustomerNm(); }
    protected ConditionValue xgetCValueDelivZipCd() { return _myCQ.xdfgetDelivZipCd(); }
    protected ConditionValue xgetCValueDelivAddress1() { return _myCQ.xdfgetDelivAddress1(); }
    protected ConditionValue xgetCValueDelivAddress2() { return _myCQ.xdfgetDelivAddress2(); }
    protected ConditionValue xgetCValueDelivAddress3() { return _myCQ.xdfgetDelivAddress3(); }
    protected ConditionValue xgetCValueDelivTelNo() { return _myCQ.xdfgetDelivTelNo(); }
    protected ConditionValue xgetCValueDelivAddressSupply() { return _myCQ.xdfgetDelivAddressSupply(); }
    protected ConditionValue xgetCValuePickingWorkMessage() { return _myCQ.xdfgetPickingWorkMessage(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueDepositCd() { return _myCQ.xdfgetDepositCd(); }
    protected ConditionValue xgetCValueStockTypeCd() { return _myCQ.xdfgetStockTypeCd(); }
    protected ConditionValue xgetCValueInstNum() { return _myCQ.xdfgetInstNum(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueTotalPrice() { return _myCQ.xdfgetTotalPrice(); }
    protected ConditionValue xgetCValueTotalTax() { return _myCQ.xdfgetTotalTax(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValuePrice() { return _myCQ.xdfgetPrice(); }
    protected ConditionValue xgetCValueTax() { return _myCQ.xdfgetTax(); }
    protected ConditionValue xgetCValueSpareStr1() { return _myCQ.xdfgetSpareStr1(); }
    protected ConditionValue xgetCValueSpareStr2() { return _myCQ.xdfgetSpareStr2(); }
    protected ConditionValue xgetCValueSpareStr3() { return _myCQ.xdfgetSpareStr3(); }
    protected ConditionValue xgetCValueSpareNum1() { return _myCQ.xdfgetSpareNum1(); }
    protected ConditionValue xgetCValueSpareNum2() { return _myCQ.xdfgetSpareNum2(); }
    protected ConditionValue xgetCValueSpareNum3() { return _myCQ.xdfgetSpareNum3(); }
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
    public String keepScalarCondition(EShippingInstCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShippingInstCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShippingInstCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShippingInstCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShippingInstCB.class.getName(); }
    protected String xinCQ() { return EShippingInstCQ.class.getName(); }
}
