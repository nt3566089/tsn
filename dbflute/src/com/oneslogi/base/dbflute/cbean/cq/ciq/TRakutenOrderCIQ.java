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
 * The condition-query for in-line of T_RAKUTEN_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class TRakutenOrderCIQ extends AbstractBsTRakutenOrderCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTRakutenOrderCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TRakutenOrderCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTRakutenOrderCQ myCQ) {
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
    protected ConditionValue xgetCValueRakutenOrderId() { return _myCQ.xdfgetRakutenOrderId(); }
    protected ConditionValue xgetCValueOrderNo() { return _myCQ.xdfgetOrderNo(); }
    protected ConditionValue xgetCValueOrderStatus() { return _myCQ.xdfgetOrderStatus(); }
    protected ConditionValue xgetCValueCardStatus() { return _myCQ.xdfgetCardStatus(); }
    protected ConditionValue xgetCValuePaymentDt() { return _myCQ.xdfgetPaymentDt(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueDelivTz() { return _myCQ.xdfgetDelivTz(); }
    protected ConditionValue xgetCValueDelivDt() { return _myCQ.xdfgetDelivDt(); }
    protected ConditionValue xgetCValuePersonInCharge() { return _myCQ.xdfgetPersonInCharge(); }
    protected ConditionValue xgetCValueSingleMemo() { return _myCQ.xdfgetSingleMemo(); }
    protected ConditionValue xgetCValueMailInput() { return _myCQ.xdfgetMailInput(); }
    protected ConditionValue xgetCValueFirstPayment() { return _myCQ.xdfgetFirstPayment(); }
    protected ConditionValue xgetCValueTerminal() { return _myCQ.xdfgetTerminal(); }
    protected ConditionValue xgetCValueMailCarrierCd() { return _myCQ.xdfgetMailCarrierCd(); }
    protected ConditionValue xgetCValueGiftFlg() { return _myCQ.xdfgetGiftFlg(); }
    protected ConditionValue xgetCValueRakutenOrderComment() { return _myCQ.xdfgetRakutenOrderComment(); }
    protected ConditionValue xgetCValueOrderDatetime() { return _myCQ.xdfgetOrderDatetime(); }
    protected ConditionValue xgetCValueMultiDelivFlg() { return _myCQ.xdfgetMultiDelivFlg(); }
    protected ConditionValue xgetCValueAlertFlg() { return _myCQ.xdfgetAlertFlg(); }
    protected ConditionValue xgetCValueMemberFlg() { return _myCQ.xdfgetMemberFlg(); }
    protected ConditionValue xgetCValueTotal() { return _myCQ.xdfgetTotal(); }
    protected ConditionValue xgetCValueTax() { return _myCQ.xdfgetTax(); }
    protected ConditionValue xgetCValueCarriage() { return _myCQ.xdfgetCarriage(); }
    protected ConditionValue xgetCValueCod() { return _myCQ.xdfgetCod(); }
    protected ConditionValue xgetCValueAmountBilled() { return _myCQ.xdfgetAmountBilled(); }
    protected ConditionValue xgetCValueTotalAmount() { return _myCQ.xdfgetTotalAmount(); }
    protected ConditionValue xgetCValueCombineId() { return _myCQ.xdfgetCombineId(); }
    protected ConditionValue xgetCValueCombineStatus() { return _myCQ.xdfgetCombineStatus(); }
    protected ConditionValue xgetCValueCombineTotal() { return _myCQ.xdfgetCombineTotal(); }
    protected ConditionValue xgetCValueCombineCarriage() { return _myCQ.xdfgetCombineCarriage(); }
    protected ConditionValue xgetCValueCombineCod() { return _myCQ.xdfgetCombineCod(); }
    protected ConditionValue xgetCValueCombineTax() { return _myCQ.xdfgetCombineTax(); }
    protected ConditionValue xgetCValueCombineBilled() { return _myCQ.xdfgetCombineBilled(); }
    protected ConditionValue xgetCValueCombineAmount() { return _myCQ.xdfgetCombineAmount(); }
    protected ConditionValue xgetCValueCombineBankFee() { return _myCQ.xdfgetCombineBankFee(); }
    protected ConditionValue xgetCValueCombinePointUse() { return _myCQ.xdfgetCombinePointUse(); }
    protected ConditionValue xgetCValueMailFlg() { return _myCQ.xdfgetMailFlg(); }
    protected ConditionValue xgetCValueOrderDt() { return _myCQ.xdfgetOrderDt(); }
    protected ConditionValue xgetCValueOrderTime() { return _myCQ.xdfgetOrderTime(); }
    protected ConditionValue xgetCValueMobilePaymentNo() { return _myCQ.xdfgetMobilePaymentNo(); }
    protected ConditionValue xgetCValueHistoryModFlg() { return _myCQ.xdfgetHistoryModFlg(); }
    protected ConditionValue xgetCValueHistoryIconFlg() { return _myCQ.xdfgetHistoryIconFlg(); }
    protected ConditionValue xgetCValueHistoryMailFlg() { return _myCQ.xdfgetHistoryMailFlg(); }
    protected ConditionValue xgetCValueDelivMatchFlg() { return _myCQ.xdfgetDelivMatchFlg(); }
    protected ConditionValue xgetCValuePointUseFlg() { return _myCQ.xdfgetPointUseFlg(); }
    protected ConditionValue xgetCValueOrderZipCd1() { return _myCQ.xdfgetOrderZipCd1(); }
    protected ConditionValue xgetCValueOrderZipCd2() { return _myCQ.xdfgetOrderZipCd2(); }
    protected ConditionValue xgetCValueOrderAddress1() { return _myCQ.xdfgetOrderAddress1(); }
    protected ConditionValue xgetCValueOrderAddress2() { return _myCQ.xdfgetOrderAddress2(); }
    protected ConditionValue xgetCValueOrderAddress3() { return _myCQ.xdfgetOrderAddress3(); }
    protected ConditionValue xgetCValueOrderCustomerNm1() { return _myCQ.xdfgetOrderCustomerNm1(); }
    protected ConditionValue xgetCValueOrderCustomerNm2() { return _myCQ.xdfgetOrderCustomerNm2(); }
    protected ConditionValue xgetCValueOrderCustomerKn1() { return _myCQ.xdfgetOrderCustomerKn1(); }
    protected ConditionValue xgetCValueOrderCustomerKn2() { return _myCQ.xdfgetOrderCustomerKn2(); }
    protected ConditionValue xgetCValueOrderTelNo1() { return _myCQ.xdfgetOrderTelNo1(); }
    protected ConditionValue xgetCValueOrderTelNo2() { return _myCQ.xdfgetOrderTelNo2(); }
    protected ConditionValue xgetCValueOrderTelNo3() { return _myCQ.xdfgetOrderTelNo3(); }
    protected ConditionValue xgetCValueMailAddress() { return _myCQ.xdfgetMailAddress(); }
    protected ConditionValue xgetCValueOrderSex() { return _myCQ.xdfgetOrderSex(); }
    protected ConditionValue xgetCValueOrderBirthday() { return _myCQ.xdfgetOrderBirthday(); }
    protected ConditionValue xgetCValuePaymentMethod() { return _myCQ.xdfgetPaymentMethod(); }
    protected ConditionValue xgetCValueCardType() { return _myCQ.xdfgetCardType(); }
    protected ConditionValue xgetCValueCardNo() { return _myCQ.xdfgetCardNo(); }
    protected ConditionValue xgetCValueCardNm() { return _myCQ.xdfgetCardNm(); }
    protected ConditionValue xgetCValueCardAvailable() { return _myCQ.xdfgetCardAvailable(); }
    protected ConditionValue xgetCValueCardInst() { return _myCQ.xdfgetCardInst(); }
    protected ConditionValue xgetCValueCardInstComment() { return _myCQ.xdfgetCardInstComment(); }
    protected ConditionValue xgetCValueDelivMethod() { return _myCQ.xdfgetDelivMethod(); }
    protected ConditionValue xgetCValueDelivType() { return _myCQ.xdfgetDelivType(); }
    protected ConditionValue xgetCValuePointUse() { return _myCQ.xdfgetPointUse(); }
    protected ConditionValue xgetCValuePointCondition() { return _myCQ.xdfgetPointCondition(); }
    protected ConditionValue xgetCValuePointStatus() { return _myCQ.xdfgetPointStatus(); }
    protected ConditionValue xgetCValueBankStatus() { return _myCQ.xdfgetBankStatus(); }
    protected ConditionValue xgetCValueBankFeeFlg() { return _myCQ.xdfgetBankFeeFlg(); }
    protected ConditionValue xgetCValueBankFee() { return _myCQ.xdfgetBankFee(); }
    protected ConditionValue xgetCValueWrappingTitleP() { return _myCQ.xdfgetWrappingTitleP(); }
    protected ConditionValue xgetCValueWrappingNmP() { return _myCQ.xdfgetWrappingNmP(); }
    protected ConditionValue xgetCValueWrappingFeeP() { return _myCQ.xdfgetWrappingFeeP(); }
    protected ConditionValue xgetCValueWrappingTaxP() { return _myCQ.xdfgetWrappingTaxP(); }
    protected ConditionValue xgetCValueWrappingTitleR() { return _myCQ.xdfgetWrappingTitleR(); }
    protected ConditionValue xgetCValueWrappingNmR() { return _myCQ.xdfgetWrappingNmR(); }
    protected ConditionValue xgetCValueWrappingFeeR() { return _myCQ.xdfgetWrappingFeeR(); }
    protected ConditionValue xgetCValueWrappingTaxR() { return _myCQ.xdfgetWrappingTaxR(); }
    protected ConditionValue xgetCValueDelivCarriage() { return _myCQ.xdfgetDelivCarriage(); }
    protected ConditionValue xgetCValueDelivCod() { return _myCQ.xdfgetDelivCod(); }
    protected ConditionValue xgetCValueDelivTax() { return _myCQ.xdfgetDelivTax(); }
    protected ConditionValue xgetCValueCarrierTraceNum() { return _myCQ.xdfgetCarrierTraceNum(); }
    protected ConditionValue xgetCValueDelivTotal() { return _myCQ.xdfgetDelivTotal(); }
    protected ConditionValue xgetCValueNoshi() { return _myCQ.xdfgetNoshi(); }
    protected ConditionValue xgetCValueDelivZipCd1() { return _myCQ.xdfgetDelivZipCd1(); }
    protected ConditionValue xgetCValueDelivZipCd2() { return _myCQ.xdfgetDelivZipCd2(); }
    protected ConditionValue xgetCValueDelivAddress1() { return _myCQ.xdfgetDelivAddress1(); }
    protected ConditionValue xgetCValueDelivAddress2() { return _myCQ.xdfgetDelivAddress2(); }
    protected ConditionValue xgetCValueDelivAddress3() { return _myCQ.xdfgetDelivAddress3(); }
    protected ConditionValue xgetCValueDelivCustomerNm1() { return _myCQ.xdfgetDelivCustomerNm1(); }
    protected ConditionValue xgetCValueDelivCustomerNm2() { return _myCQ.xdfgetDelivCustomerNm2(); }
    protected ConditionValue xgetCValueDelivCustomerKn1() { return _myCQ.xdfgetDelivCustomerKn1(); }
    protected ConditionValue xgetCValueDelivCustomerKn2() { return _myCQ.xdfgetDelivCustomerKn2(); }
    protected ConditionValue xgetCValueDelivTelNo1() { return _myCQ.xdfgetDelivTelNo1(); }
    protected ConditionValue xgetCValueDelivTelNo2() { return _myCQ.xdfgetDelivTelNo2(); }
    protected ConditionValue xgetCValueDelivTelNo3() { return _myCQ.xdfgetDelivTelNo3(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueProductNo() { return _myCQ.xdfgetProductNo(); }
    protected ConditionValue xgetCValueProductUrl() { return _myCQ.xdfgetProductUrl(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValueOrderNum() { return _myCQ.xdfgetOrderNum(); }
    protected ConditionValue xgetCValueProductCarriage() { return _myCQ.xdfgetProductCarriage(); }
    protected ConditionValue xgetCValueProductTax() { return _myCQ.xdfgetProductTax(); }
    protected ConditionValue xgetCValueProductCod() { return _myCQ.xdfgetProductCod(); }
    protected ConditionValue xgetCValueItemChoice() { return _myCQ.xdfgetItemChoice(); }
    protected ConditionValue xgetCValuePointScale() { return _myCQ.xdfgetPointScale(); }
    protected ConditionValue xgetCValuePointType() { return _myCQ.xdfgetPointType(); }
    protected ConditionValue xgetCValueRecordNumber() { return _myCQ.xdfgetRecordNumber(); }
    protected ConditionValue xgetCValueDeliveryInfo() { return _myCQ.xdfgetDeliveryInfo(); }
    protected ConditionValue xgetCValueStockType() { return _myCQ.xdfgetStockType(); }
    protected ConditionValue xgetCValueWrappingTypeP() { return _myCQ.xdfgetWrappingTypeP(); }
    protected ConditionValue xgetCValueWrappingTypeR() { return _myCQ.xdfgetWrappingTypeR(); }
    protected ConditionValue xgetCValueTomorrowFlg() { return _myCQ.xdfgetTomorrowFlg(); }
    protected ConditionValue xgetCValueCouponUse() { return _myCQ.xdfgetCouponUse(); }
    protected ConditionValue xgetCValueShopCouponUse() { return _myCQ.xdfgetShopCouponUse(); }
    protected ConditionValue xgetCValueRakutenCouponUse() { return _myCQ.xdfgetRakutenCouponUse(); }
    protected ConditionValue xgetCValueCombineCouponUse() { return _myCQ.xdfgetCombineCouponUse(); }
    protected ConditionValue xgetCValueDelivCompany() { return _myCQ.xdfgetDelivCompany(); }
    protected ConditionValue xgetCValuePhamaceFlg() { return _myCQ.xdfgetPhamaceFlg(); }
    protected ConditionValue xgetCValuePackingQty() { return _myCQ.xdfgetPackingQty(); }
    protected ConditionValue xgetCValueSlipItemNm1() { return _myCQ.xdfgetSlipItemNm1(); }
    protected ConditionValue xgetCValueSlipItemNm2() { return _myCQ.xdfgetSlipItemNm2(); }
    protected ConditionValue xgetCValueSlipItemNm3() { return _myCQ.xdfgetSlipItemNm3(); }
    protected ConditionValue xgetCValueSlipItemNm4() { return _myCQ.xdfgetSlipItemNm4(); }
    protected ConditionValue xgetCValueSlipItemNm5() { return _myCQ.xdfgetSlipItemNm5(); }
    protected ConditionValue xgetCValueSlipItemCd1() { return _myCQ.xdfgetSlipItemCd1(); }
    protected ConditionValue xgetCValueSlipItemCd2() { return _myCQ.xdfgetSlipItemCd2(); }
    protected ConditionValue xgetCValueFreightHandling1() { return _myCQ.xdfgetFreightHandling1(); }
    protected ConditionValue xgetCValueFreightHandling2() { return _myCQ.xdfgetFreightHandling2(); }
    protected ConditionValue xgetCValueArticle() { return _myCQ.xdfgetArticle(); }
    protected ConditionValue xgetCValueReceiveId() { return _myCQ.xdfgetReceiveId(); }
    protected ConditionValue xgetCValueRowNo() { return _myCQ.xdfgetRowNo(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueImportTypeId() { return _myCQ.xdfgetImportTypeId(); }
    protected ConditionValue xgetCValueEcOrderBId() { return _myCQ.xdfgetEcOrderBId(); }
    public String keepEcOrderBId_InScopeRelation_TEcOrderB(TEcOrderBCQ sq)
    { return _myCQ.keepEcOrderBId_InScopeRelation_TEcOrderB(sq); }
    public String keepEcOrderBId_NotInScopeRelation_TEcOrderB(TEcOrderBCQ sq)
    { return _myCQ.keepEcOrderBId_NotInScopeRelation_TEcOrderB(sq); }
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
    public String keepScalarCondition(TRakutenOrderCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TRakutenOrderCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TRakutenOrderCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TRakutenOrderCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TRakutenOrderCB.class.getName(); }
    protected String xinCQ() { return TRakutenOrderCQ.class.getName(); }
}
