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
 * The condition-query for in-line of E_RETURNED_RECEIVE_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public class EReturnedReceivePlanCIQ extends AbstractBsEReturnedReceivePlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEReturnedReceivePlanCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EReturnedReceivePlanCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEReturnedReceivePlanCQ myCQ) {
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
    protected ConditionValue xgetCValueReturnedReceivePlanId() { return _myCQ.xdfgetReturnedReceivePlanId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueHeaderFlg() { return _myCQ.xdfgetHeaderFlg(); }
    protected ConditionValue xgetCValueSortBsCd() { return _myCQ.xdfgetSortBsCd(); }
    protected ConditionValue xgetCValueDelivayCenterCd() { return _myCQ.xdfgetDelivayCenterCd(); }
    protected ConditionValue xgetCValueOrderGroup() { return _myCQ.xdfgetOrderGroup(); }
    protected ConditionValue xgetCValueSaleDatetime() { return _myCQ.xdfgetSaleDatetime(); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueSlipType() { return _myCQ.xdfgetSlipType(); }
    protected ConditionValue xgetCValueSlipNo() { return _myCQ.xdfgetSlipNo(); }
    protected ConditionValue xgetCValueSequenceNo() { return _myCQ.xdfgetSequenceNo(); }
    protected ConditionValue xgetCValueOrderDate() { return _myCQ.xdfgetOrderDate(); }
    protected ConditionValue xgetCValueShipingDate() { return _myCQ.xdfgetShipingDate(); }
    protected ConditionValue xgetCValueOtorgcd() { return _myCQ.xdfgetOtorgcd(); }
    protected ConditionValue xgetCValueOrdorgcd() { return _myCQ.xdfgetOrdorgcd(); }
    protected ConditionValue xgetCValueRlybscd() { return _myCQ.xdfgetRlybscd(); }
    protected ConditionValue xgetCValueDirectionCd() { return _myCQ.xdfgetDirectionCd(); }
    protected ConditionValue xgetCValuePistonId() { return _myCQ.xdfgetPistonId(); }
    protected ConditionValue xgetCValueDelivalyRank() { return _myCQ.xdfgetDelivalyRank(); }
    protected ConditionValue xgetCValueBulkDelivalyNo() { return _myCQ.xdfgetBulkDelivalyNo(); }
    protected ConditionValue xgetCValueDivmtd() { return _myCQ.xdfgetDivmtd(); }
    protected ConditionValue xgetCValueZzhdvrid() { return _myCQ.xdfgetZzhdvrid(); }
    protected ConditionValue xgetCValueCustomerNm() { return _myCQ.xdfgetCustomerNm(); }
    protected ConditionValue xgetCValueHeaderPriceSale() { return _myCQ.xdfgetHeaderPriceSale(); }
    protected ConditionValue xgetCValueZregprcc() { return _myCQ.xdfgetZregprcc(); }
    protected ConditionValue xgetCValueTax() { return _myCQ.xdfgetTax(); }
    protected ConditionValue xgetCValueZzgodfpc() { return _myCQ.xdfgetZzgodfpc(); }
    protected ConditionValue xgetCValueZzgodspc() { return _myCQ.xdfgetZzgodspc(); }
    protected ConditionValue xgetCValueZzgodctx() { return _myCQ.xdfgetZzgodctx(); }
    protected ConditionValue xgetCValueCompanyCd() { return _myCQ.xdfgetCompanyCd(); }
    protected ConditionValue xgetCValueSaleType() { return _myCQ.xdfgetSaleType(); }
    protected ConditionValue xgetCValueHvrtReason() { return _myCQ.xdfgetHvrtReason(); }
    protected ConditionValue xgetCValueHvrtInoutDate() { return _myCQ.xdfgetHvrtInoutDate(); }
    protected ConditionValue xgetCValueCngPrtSlipNo() { return _myCQ.xdfgetCngPrtSlipNo(); }
    protected ConditionValue xgetCValueProcessType() { return _myCQ.xdfgetProcessType(); }
    protected ConditionValue xgetCValueEosOrdAftFlg() { return _myCQ.xdfgetEosOrdAftFlg(); }
    protected ConditionValue xgetCValueEosSlipNo() { return _myCQ.xdfgetEosSlipNo(); }
    protected ConditionValue xgetCValueHdrdBxType() { return _myCQ.xdfgetHdrdBxType(); }
    protected ConditionValue xgetCValueInotRfslType() { return _myCQ.xdfgetInotRfslType(); }
    protected ConditionValue xgetCValueBxMntRfslType() { return _myCQ.xdfgetBxMntRfslType(); }
    protected ConditionValue xgetCValueReportMerfeTiming() { return _myCQ.xdfgetReportMerfeTiming(); }
    protected ConditionValue xgetCValueReportOutDatetime() { return _myCQ.xdfgetReportOutDatetime(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueKwmeng() { return _myCQ.xdfgetKwmeng(); }
    protected ConditionValue xgetCValueStatusCd() { return _myCQ.xdfgetStatusCd(); }
    protected ConditionValue xgetCValueStgVal() { return _myCQ.xdfgetStgVal(); }
    protected ConditionValue xgetCValueDetailPriceSale() { return _myCQ.xdfgetDetailPriceSale(); }
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
    public String keepScalarCondition(EReturnedReceivePlanCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EReturnedReceivePlanCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EReturnedReceivePlanCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EReturnedReceivePlanCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EReturnedReceivePlanCB.class.getName(); }
    protected String xinCQ() { return EReturnedReceivePlanCQ.class.getName(); }
}
