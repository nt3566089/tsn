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
 * The condition-query for in-line of T_YAHOO_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class TYahooOrderCIQ extends AbstractBsTYahooOrderCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTYahooOrderCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TYahooOrderCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTYahooOrderCQ myCQ) {
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
    protected ConditionValue xgetCValueYahooOrderId() { return _myCQ.xdfgetYahooOrderId(); }
    protected ConditionValue xgetCValueOrderId() { return _myCQ.xdfgetOrderId(); }
    protected ConditionValue xgetCValueParentOrderId() { return _myCQ.xdfgetParentOrderId(); }
    protected ConditionValue xgetCValueDeviceType() { return _myCQ.xdfgetDeviceType(); }
    protected ConditionValue xgetCValueIsAffiliate() { return _myCQ.xdfgetIsAffiliate(); }
    protected ConditionValue xgetCValueFspLicenseCode() { return _myCQ.xdfgetFspLicenseCode(); }
    protected ConditionValue xgetCValueFspLicenseName() { return _myCQ.xdfgetFspLicenseName(); }
    protected ConditionValue xgetCValueOrderTime() { return _myCQ.xdfgetOrderTime(); }
    protected ConditionValue xgetCValueOrderTimeUnixEpoch() { return _myCQ.xdfgetOrderTimeUnixEpoch(); }
    protected ConditionValue xgetCValueUsePointType() { return _myCQ.xdfgetUsePointType(); }
    protected ConditionValue xgetCValueOrderStatus() { return _myCQ.xdfgetOrderStatus(); }
    protected ConditionValue xgetCValueStoreStatus() { return _myCQ.xdfgetStoreStatus(); }
    protected ConditionValue xgetCValueReferer() { return _myCQ.xdfgetReferer(); }
    protected ConditionValue xgetCValueEntryPoint() { return _myCQ.xdfgetEntryPoint(); }
    protected ConditionValue xgetCValueClink() { return _myCQ.xdfgetClink(); }
    protected ConditionValue xgetCValueSuspectMessage() { return _myCQ.xdfgetSuspectMessage(); }
    protected ConditionValue xgetCValueIsItemCoupon() { return _myCQ.xdfgetIsItemCoupon(); }
    protected ConditionValue xgetCValueIsShippingCoupon() { return _myCQ.xdfgetIsShippingCoupon(); }
    protected ConditionValue xgetCValueShipName() { return _myCQ.xdfgetShipName(); }
    protected ConditionValue xgetCValueShipFirstName() { return _myCQ.xdfgetShipFirstName(); }
    protected ConditionValue xgetCValueShipLastName() { return _myCQ.xdfgetShipLastName(); }
    protected ConditionValue xgetCValueShipAddress1() { return _myCQ.xdfgetShipAddress1(); }
    protected ConditionValue xgetCValueShipAddress2() { return _myCQ.xdfgetShipAddress2(); }
    protected ConditionValue xgetCValueShipCity() { return _myCQ.xdfgetShipCity(); }
    protected ConditionValue xgetCValueShipPrefecture() { return _myCQ.xdfgetShipPrefecture(); }
    protected ConditionValue xgetCValueShipZipCode() { return _myCQ.xdfgetShipZipCode(); }
    protected ConditionValue xgetCValueShipNameKana() { return _myCQ.xdfgetShipNameKana(); }
    protected ConditionValue xgetCValueShipFirstNameKana() { return _myCQ.xdfgetShipFirstNameKana(); }
    protected ConditionValue xgetCValueShipLastNameKana() { return _myCQ.xdfgetShipLastNameKana(); }
    protected ConditionValue xgetCValueShipAddress1Kana() { return _myCQ.xdfgetShipAddress1Kana(); }
    protected ConditionValue xgetCValueShipAddress2Kana() { return _myCQ.xdfgetShipAddress2Kana(); }
    protected ConditionValue xgetCValueShipCityKana() { return _myCQ.xdfgetShipCityKana(); }
    protected ConditionValue xgetCValueShipPrefectureKana() { return _myCQ.xdfgetShipPrefectureKana(); }
    protected ConditionValue xgetCValueShipSection1Field() { return _myCQ.xdfgetShipSection1Field(); }
    protected ConditionValue xgetCValueShipSection1Value() { return _myCQ.xdfgetShipSection1Value(); }
    protected ConditionValue xgetCValueShipSection2Field() { return _myCQ.xdfgetShipSection2Field(); }
    protected ConditionValue xgetCValueShipSection2Value() { return _myCQ.xdfgetShipSection2Value(); }
    protected ConditionValue xgetCValueShipPhoneNumber() { return _myCQ.xdfgetShipPhoneNumber(); }
    protected ConditionValue xgetCValueShipEmgPhoneNumber() { return _myCQ.xdfgetShipEmgPhoneNumber(); }
    protected ConditionValue xgetCValueShipMethod() { return _myCQ.xdfgetShipMethod(); }
    protected ConditionValue xgetCValueShipMethodName() { return _myCQ.xdfgetShipMethodName(); }
    protected ConditionValue xgetCValueShipRequestDate() { return _myCQ.xdfgetShipRequestDate(); }
    protected ConditionValue xgetCValueShipRequestTime() { return _myCQ.xdfgetShipRequestTime(); }
    protected ConditionValue xgetCValueShipNotes() { return _myCQ.xdfgetShipNotes(); }
    protected ConditionValue xgetCValueArriveType() { return _myCQ.xdfgetArriveType(); }
    protected ConditionValue xgetCValueShipInvoiceNumber1() { return _myCQ.xdfgetShipInvoiceNumber1(); }
    protected ConditionValue xgetCValueShipInvoiceNumber2() { return _myCQ.xdfgetShipInvoiceNumber2(); }
    protected ConditionValue xgetCValueShipUrl() { return _myCQ.xdfgetShipUrl(); }
    protected ConditionValue xgetCValueShipDate() { return _myCQ.xdfgetShipDate(); }
    protected ConditionValue xgetCValueGiftWrapType() { return _myCQ.xdfgetGiftWrapType(); }
    protected ConditionValue xgetCValueGiftWrapPaperType() { return _myCQ.xdfgetGiftWrapPaperType(); }
    protected ConditionValue xgetCValueGiftWrapName() { return _myCQ.xdfgetGiftWrapName(); }
    protected ConditionValue xgetCValueNeedBillSlip() { return _myCQ.xdfgetNeedBillSlip(); }
    protected ConditionValue xgetCValueNeedDetailedSlip() { return _myCQ.xdfgetNeedDetailedSlip(); }
    protected ConditionValue xgetCValueNeedReceipt() { return _myCQ.xdfgetNeedReceipt(); }
    protected ConditionValue xgetCValueOption1Field() { return _myCQ.xdfgetOption1Field(); }
    protected ConditionValue xgetCValueOption1Value() { return _myCQ.xdfgetOption1Value(); }
    protected ConditionValue xgetCValueOption2Field() { return _myCQ.xdfgetOption2Field(); }
    protected ConditionValue xgetCValueOption2Value() { return _myCQ.xdfgetOption2Value(); }
    protected ConditionValue xgetCValueGiftWrapMassage() { return _myCQ.xdfgetGiftWrapMassage(); }
    protected ConditionValue xgetCValueBillName() { return _myCQ.xdfgetBillName(); }
    protected ConditionValue xgetCValueBillFirstName() { return _myCQ.xdfgetBillFirstName(); }
    protected ConditionValue xgetCValueBillLastName() { return _myCQ.xdfgetBillLastName(); }
    protected ConditionValue xgetCValueBillAddress1() { return _myCQ.xdfgetBillAddress1(); }
    protected ConditionValue xgetCValueBillAddress2() { return _myCQ.xdfgetBillAddress2(); }
    protected ConditionValue xgetCValueBillCity() { return _myCQ.xdfgetBillCity(); }
    protected ConditionValue xgetCValueBillPrefecture() { return _myCQ.xdfgetBillPrefecture(); }
    protected ConditionValue xgetCValueBillZipCode() { return _myCQ.xdfgetBillZipCode(); }
    protected ConditionValue xgetCValueBillNameKana() { return _myCQ.xdfgetBillNameKana(); }
    protected ConditionValue xgetCValueBillFirstNameKana() { return _myCQ.xdfgetBillFirstNameKana(); }
    protected ConditionValue xgetCValueBillLastNameKana() { return _myCQ.xdfgetBillLastNameKana(); }
    protected ConditionValue xgetCValueBillAddress1Kana() { return _myCQ.xdfgetBillAddress1Kana(); }
    protected ConditionValue xgetCValueBillAddress2Kana() { return _myCQ.xdfgetBillAddress2Kana(); }
    protected ConditionValue xgetCValueBillCityKana() { return _myCQ.xdfgetBillCityKana(); }
    protected ConditionValue xgetCValueBillPrefectureKana() { return _myCQ.xdfgetBillPrefectureKana(); }
    protected ConditionValue xgetCValueBillSection1Field() { return _myCQ.xdfgetBillSection1Field(); }
    protected ConditionValue xgetCValueBillSection1Value() { return _myCQ.xdfgetBillSection1Value(); }
    protected ConditionValue xgetCValueBillSection2Field() { return _myCQ.xdfgetBillSection2Field(); }
    protected ConditionValue xgetCValueBillSection2Value() { return _myCQ.xdfgetBillSection2Value(); }
    protected ConditionValue xgetCValueBillPhoneNumber() { return _myCQ.xdfgetBillPhoneNumber(); }
    protected ConditionValue xgetCValueBillEmgPhoneNumber() { return _myCQ.xdfgetBillEmgPhoneNumber(); }
    protected ConditionValue xgetCValueBillMailAddress() { return _myCQ.xdfgetBillMailAddress(); }
    protected ConditionValue xgetCValuePayMathod() { return _myCQ.xdfgetPayMathod(); }
    protected ConditionValue xgetCValuePayMathodName() { return _myCQ.xdfgetPayMathodName(); }
    protected ConditionValue xgetCValuePayKind() { return _myCQ.xdfgetPayKind(); }
    protected ConditionValue xgetCValueCardPayCount() { return _myCQ.xdfgetCardPayCount(); }
    protected ConditionValue xgetCValueCardPayType() { return _myCQ.xdfgetCardPayType(); }
    protected ConditionValue xgetCValueSettleStatus() { return _myCQ.xdfgetSettleStatus(); }
    protected ConditionValue xgetCValueSettleId() { return _myCQ.xdfgetSettleId(); }
    protected ConditionValue xgetCValuePayNo() { return _myCQ.xdfgetPayNo(); }
    protected ConditionValue xgetCValuePayNoIssueDate() { return _myCQ.xdfgetPayNoIssueDate(); }
    protected ConditionValue xgetCValuePayDate() { return _myCQ.xdfgetPayDate(); }
    protected ConditionValue xgetCValueBuyerComments() { return _myCQ.xdfgetBuyerComments(); }
    protected ConditionValue xgetCValueAgeConfirm() { return _myCQ.xdfgetAgeConfirm(); }
    protected ConditionValue xgetCValueQuantityDetail() { return _myCQ.xdfgetQuantityDetail(); }
    protected ConditionValue xgetCValueShipCharge() { return _myCQ.xdfgetShipCharge(); }
    protected ConditionValue xgetCValuePayCharge() { return _myCQ.xdfgetPayCharge(); }
    protected ConditionValue xgetCValueGiftWrapCharge() { return _myCQ.xdfgetGiftWrapCharge(); }
    protected ConditionValue xgetCValueDiscount() { return _myCQ.xdfgetDiscount(); }
    protected ConditionValue xgetCValueAdjustments() { return _myCQ.xdfgetAdjustments(); }
    protected ConditionValue xgetCValueUsePoint() { return _myCQ.xdfgetUsePoint(); }
    protected ConditionValue xgetCValueGetPoint() { return _myCQ.xdfgetGetPoint(); }
    protected ConditionValue xgetCValueTotal() { return _myCQ.xdfgetTotal(); }
    protected ConditionValue xgetCValueTotalPrice() { return _myCQ.xdfgetTotalPrice(); }
    protected ConditionValue xgetCValueShippingCDiscount() { return _myCQ.xdfgetShippingCDiscount(); }
    protected ConditionValue xgetCValueItemCDiscount() { return _myCQ.xdfgetItemCDiscount(); }
    protected ConditionValue xgetCValueTotalMallCDiscount() { return _myCQ.xdfgetTotalMallCDiscount(); }
    protected ConditionValue xgetCValueGetPointCrgToStore() { return _myCQ.xdfgetGetPointCrgToStore(); }
    protected ConditionValue xgetCValueLineId() { return _myCQ.xdfgetLineId(); }
    protected ConditionValue xgetCValueQuantity() { return _myCQ.xdfgetQuantity(); }
    protected ConditionValue xgetCValueItemId() { return _myCQ.xdfgetItemId(); }
    protected ConditionValue xgetCValueSubCode() { return _myCQ.xdfgetSubCode(); }
    protected ConditionValue xgetCValueTitle() { return _myCQ.xdfgetTitle(); }
    protected ConditionValue xgetCValueItemOptionName() { return _myCQ.xdfgetItemOptionName(); }
    protected ConditionValue xgetCValueItemOptionValue() { return _myCQ.xdfgetItemOptionValue(); }
    protected ConditionValue xgetCValueSubCodeOption() { return _myCQ.xdfgetSubCodeOption(); }
    protected ConditionValue xgetCValueInscriptionName() { return _myCQ.xdfgetInscriptionName(); }
    protected ConditionValue xgetCValueInscriptionValue() { return _myCQ.xdfgetInscriptionValue(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValueUnitGetPoint() { return _myCQ.xdfgetUnitGetPoint(); }
    protected ConditionValue xgetCValueLineSubTotal() { return _myCQ.xdfgetLineSubTotal(); }
    protected ConditionValue xgetCValueLineGetPoint() { return _myCQ.xdfgetLineGetPoint(); }
    protected ConditionValue xgetCValuePointFspCode() { return _myCQ.xdfgetPointFspCode(); }
    protected ConditionValue xgetCValueItemCondition() { return _myCQ.xdfgetItemCondition(); }
    protected ConditionValue xgetCValueCouponId() { return _myCQ.xdfgetCouponId(); }
    protected ConditionValue xgetCValueCouponDiscount() { return _myCQ.xdfgetCouponDiscount(); }
    protected ConditionValue xgetCValueOriginalPrice() { return _myCQ.xdfgetOriginalPrice(); }
    protected ConditionValue xgetCValueIsGetPointFix() { return _myCQ.xdfgetIsGetPointFix(); }
    protected ConditionValue xgetCValueGetPointFixDate() { return _myCQ.xdfgetGetPointFixDate(); }
    protected ConditionValue xgetCValueReleaseDate() { return _myCQ.xdfgetReleaseDate(); }
    protected ConditionValue xgetCValueGetPointType() { return _myCQ.xdfgetGetPointType(); }
    protected ConditionValue xgetCValueJan() { return _myCQ.xdfgetJan(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValuePointChargedToStore() { return _myCQ.xdfgetPointChargedToStore(); }
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
    public String keepScalarCondition(TYahooOrderCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TYahooOrderCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TYahooOrderCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TYahooOrderCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TYahooOrderCB.class.getName(); }
    protected String xinCQ() { return TYahooOrderCQ.class.getName(); }
}
