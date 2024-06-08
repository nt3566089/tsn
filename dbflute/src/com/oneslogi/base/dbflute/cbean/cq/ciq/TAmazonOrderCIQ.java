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
 * The condition-query for in-line of T_AMAZON_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class TAmazonOrderCIQ extends AbstractBsTAmazonOrderCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTAmazonOrderCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TAmazonOrderCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTAmazonOrderCQ myCQ) {
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
    protected ConditionValue xgetCValueAmazonOrderId() { return _myCQ.xdfgetAmazonOrderId(); }
    protected ConditionValue xgetCValueOrderId() { return _myCQ.xdfgetOrderId(); }
    protected ConditionValue xgetCValueOrderItemId() { return _myCQ.xdfgetOrderItemId(); }
    protected ConditionValue xgetCValuePurchaseDate() { return _myCQ.xdfgetPurchaseDate(); }
    protected ConditionValue xgetCValuePaymentsDate() { return _myCQ.xdfgetPaymentsDate(); }
    protected ConditionValue xgetCValueBuyerEmail() { return _myCQ.xdfgetBuyerEmail(); }
    protected ConditionValue xgetCValueBuyerName() { return _myCQ.xdfgetBuyerName(); }
    protected ConditionValue xgetCValueBuyerPhoneNumber() { return _myCQ.xdfgetBuyerPhoneNumber(); }
    protected ConditionValue xgetCValueSku() { return _myCQ.xdfgetSku(); }
    protected ConditionValue xgetCValueProductName() { return _myCQ.xdfgetProductName(); }
    protected ConditionValue xgetCValueQuantityPurchased() { return _myCQ.xdfgetQuantityPurchased(); }
    protected ConditionValue xgetCValueCurrency() { return _myCQ.xdfgetCurrency(); }
    protected ConditionValue xgetCValueItemPrice() { return _myCQ.xdfgetItemPrice(); }
    protected ConditionValue xgetCValueItemTax() { return _myCQ.xdfgetItemTax(); }
    protected ConditionValue xgetCValueShippingPrice() { return _myCQ.xdfgetShippingPrice(); }
    protected ConditionValue xgetCValueShippingTax() { return _myCQ.xdfgetShippingTax(); }
    protected ConditionValue xgetCValueGiftWrapPrice() { return _myCQ.xdfgetGiftWrapPrice(); }
    protected ConditionValue xgetCValueGiftWrapTax() { return _myCQ.xdfgetGiftWrapTax(); }
    protected ConditionValue xgetCValueShipServiceLevel() { return _myCQ.xdfgetShipServiceLevel(); }
    protected ConditionValue xgetCValueRecipientName() { return _myCQ.xdfgetRecipientName(); }
    protected ConditionValue xgetCValueShipAddress1() { return _myCQ.xdfgetShipAddress1(); }
    protected ConditionValue xgetCValueShipAddress2() { return _myCQ.xdfgetShipAddress2(); }
    protected ConditionValue xgetCValueShipAddress3() { return _myCQ.xdfgetShipAddress3(); }
    protected ConditionValue xgetCValueShipCity() { return _myCQ.xdfgetShipCity(); }
    protected ConditionValue xgetCValueShipState() { return _myCQ.xdfgetShipState(); }
    protected ConditionValue xgetCValueShipPostalCode() { return _myCQ.xdfgetShipPostalCode(); }
    protected ConditionValue xgetCValueShipCountry() { return _myCQ.xdfgetShipCountry(); }
    protected ConditionValue xgetCValueShipPhoneNumber() { return _myCQ.xdfgetShipPhoneNumber(); }
    protected ConditionValue xgetCValueGiftWrapType() { return _myCQ.xdfgetGiftWrapType(); }
    protected ConditionValue xgetCValueGiftMassageText() { return _myCQ.xdfgetGiftMassageText(); }
    protected ConditionValue xgetCValueItemPromotionDiscount() { return _myCQ.xdfgetItemPromotionDiscount(); }
    protected ConditionValue xgetCValueItemPromotionId() { return _myCQ.xdfgetItemPromotionId(); }
    protected ConditionValue xgetCValueShipPromotionDiscount() { return _myCQ.xdfgetShipPromotionDiscount(); }
    protected ConditionValue xgetCValueShipPromotionId() { return _myCQ.xdfgetShipPromotionId(); }
    protected ConditionValue xgetCValueDeliveryStartDate() { return _myCQ.xdfgetDeliveryStartDate(); }
    protected ConditionValue xgetCValueDeliveryEndDate() { return _myCQ.xdfgetDeliveryEndDate(); }
    protected ConditionValue xgetCValueDeliveryTimeZone() { return _myCQ.xdfgetDeliveryTimeZone(); }
    protected ConditionValue xgetCValueDeliveryInstructions() { return _myCQ.xdfgetDeliveryInstructions(); }
    protected ConditionValue xgetCValuePaymentMethod() { return _myCQ.xdfgetPaymentMethod(); }
    protected ConditionValue xgetCValueCodCollectibleAmount() { return _myCQ.xdfgetCodCollectibleAmount(); }
    protected ConditionValue xgetCValueAlreadyPaid() { return _myCQ.xdfgetAlreadyPaid(); }
    protected ConditionValue xgetCValuePaymentMethodFee() { return _myCQ.xdfgetPaymentMethodFee(); }
    protected ConditionValue xgetCValueScheduledDeliStDate() { return _myCQ.xdfgetScheduledDeliStDate(); }
    protected ConditionValue xgetCValueScheduledDeliEdDate() { return _myCQ.xdfgetScheduledDeliEdDate(); }
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
    public String keepScalarCondition(TAmazonOrderCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TAmazonOrderCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TAmazonOrderCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TAmazonOrderCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TAmazonOrderCB.class.getName(); }
    protected String xinCQ() { return TAmazonOrderCQ.class.getName(); }
}
