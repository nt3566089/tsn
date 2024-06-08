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
 * The condition-query for in-line of T_EC_ORDER_H.
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderHCIQ extends AbstractBsTEcOrderHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTEcOrderHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TEcOrderHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTEcOrderHCQ myCQ) {
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
    protected ConditionValue xgetCValueEcOrderHId() { return _myCQ.xdfgetEcOrderHId(); }
    public String keepEcOrderHId_ExistsReferrer_TEcOrderBList(TEcOrderBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEcOrderHId_ExistsReferrer_TEcOrderRAsOne(TEcOrderRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEcOrderHId_NotExistsReferrer_TEcOrderBList(TEcOrderBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEcOrderHId_NotExistsReferrer_TEcOrderRAsOne(TEcOrderRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEcOrderHId_SpecifyDerivedReferrer_TEcOrderBList(TEcOrderBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepEcOrderHId_QueryDerivedReferrer_TEcOrderBList(TEcOrderBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEcOrderHId_QueryDerivedReferrer_TEcOrderBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
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
    protected ConditionValue xgetCValueImportDt() { return _myCQ.xdfgetImportDt(); }
    protected ConditionValue xgetCValueOrderNo() { return _myCQ.xdfgetOrderNo(); }
    protected ConditionValue xgetCValuePriorityFlg() { return _myCQ.xdfgetPriorityFlg(); }
    protected ConditionValue xgetCValueOrderDt() { return _myCQ.xdfgetOrderDt(); }
    protected ConditionValue xgetCValueOrderTime() { return _myCQ.xdfgetOrderTime(); }
    protected ConditionValue xgetCValueDelivDt() { return _myCQ.xdfgetDelivDt(); }
    protected ConditionValue xgetCValueDelivTz() { return _myCQ.xdfgetDelivTz(); }
    protected ConditionValue xgetCValueComment1() { return _myCQ.xdfgetComment1(); }
    protected ConditionValue xgetCValueComment2() { return _myCQ.xdfgetComment2(); }
    protected ConditionValue xgetCValueGiftFlg() { return _myCQ.xdfgetGiftFlg(); }
    protected ConditionValue xgetCValueNoshi() { return _myCQ.xdfgetNoshi(); }
    protected ConditionValue xgetCValueOrderZipCd() { return _myCQ.xdfgetOrderZipCd(); }
    protected ConditionValue xgetCValueOrderAddress1() { return _myCQ.xdfgetOrderAddress1(); }
    protected ConditionValue xgetCValueOrderAddress2() { return _myCQ.xdfgetOrderAddress2(); }
    protected ConditionValue xgetCValueOrderAddress3() { return _myCQ.xdfgetOrderAddress3(); }
    protected ConditionValue xgetCValueOrderCustomerNm() { return _myCQ.xdfgetOrderCustomerNm(); }
    protected ConditionValue xgetCValueOrderCustomerNmKana() { return _myCQ.xdfgetOrderCustomerNmKana(); }
    protected ConditionValue xgetCValueOrderTelNo() { return _myCQ.xdfgetOrderTelNo(); }
    protected ConditionValue xgetCValueDelivMatchFlg() { return _myCQ.xdfgetDelivMatchFlg(); }
    protected ConditionValue xgetCValueMergeId() { return _myCQ.xdfgetMergeId(); }
    protected ConditionValue xgetCValueMergeStatus() { return _myCQ.xdfgetMergeStatus(); }
    protected ConditionValue xgetCValueDelivZipCd() { return _myCQ.xdfgetDelivZipCd(); }
    protected ConditionValue xgetCValueDelivAddress1() { return _myCQ.xdfgetDelivAddress1(); }
    protected ConditionValue xgetCValueDelivAddress2() { return _myCQ.xdfgetDelivAddress2(); }
    protected ConditionValue xgetCValueDelivAddress3() { return _myCQ.xdfgetDelivAddress3(); }
    protected ConditionValue xgetCValueInvoiceDelivAddress1() { return _myCQ.xdfgetInvoiceDelivAddress1(); }
    protected ConditionValue xgetCValueInvoiceDelivAddress2() { return _myCQ.xdfgetInvoiceDelivAddress2(); }
    protected ConditionValue xgetCValueInvoiceDelivAddress3() { return _myCQ.xdfgetInvoiceDelivAddress3(); }
    protected ConditionValue xgetCValueDelivCustomerNm() { return _myCQ.xdfgetDelivCustomerNm(); }
    protected ConditionValue xgetCValueDelivCustomerNmKana() { return _myCQ.xdfgetDelivCustomerNmKana(); }
    protected ConditionValue xgetCValueDelivTelNo() { return _myCQ.xdfgetDelivTelNo(); }
    protected ConditionValue xgetCValueDelivMethod() { return _myCQ.xdfgetDelivMethod(); }
    protected ConditionValue xgetCValueDelivType() { return _myCQ.xdfgetDelivType(); }
    protected ConditionValue xgetCValueDelivCompany() { return _myCQ.xdfgetDelivCompany(); }
    protected ConditionValue xgetCValuePaymentMethod() { return _myCQ.xdfgetPaymentMethod(); }
    protected ConditionValue xgetCValueCardType() { return _myCQ.xdfgetCardType(); }
    protected ConditionValue xgetCValueTotal() { return _myCQ.xdfgetTotal(); }
    protected ConditionValue xgetCValueTax() { return _myCQ.xdfgetTax(); }
    protected ConditionValue xgetCValueCarriage() { return _myCQ.xdfgetCarriage(); }
    protected ConditionValue xgetCValueCod() { return _myCQ.xdfgetCod(); }
    protected ConditionValue xgetCValueTotalAmount() { return _myCQ.xdfgetTotalAmount(); }
    protected ConditionValue xgetCValueCouponDiscount() { return _myCQ.xdfgetCouponDiscount(); }
    protected ConditionValue xgetCValuePointDiscount() { return _myCQ.xdfgetPointDiscount(); }
    protected ConditionValue xgetCValueOtherDiscount() { return _myCQ.xdfgetOtherDiscount(); }
    protected ConditionValue xgetCValueAmountBilled() { return _myCQ.xdfgetAmountBilled(); }
    protected ConditionValue xgetCValueMergeTotal() { return _myCQ.xdfgetMergeTotal(); }
    protected ConditionValue xgetCValueMergeCarriage() { return _myCQ.xdfgetMergeCarriage(); }
    protected ConditionValue xgetCValueMergeCod() { return _myCQ.xdfgetMergeCod(); }
    protected ConditionValue xgetCValueMergeTax() { return _myCQ.xdfgetMergeTax(); }
    protected ConditionValue xgetCValueMergeAmountBilled() { return _myCQ.xdfgetMergeAmountBilled(); }
    protected ConditionValue xgetCValueMergeTotalAmount() { return _myCQ.xdfgetMergeTotalAmount(); }
    protected ConditionValue xgetCValueMergeCouponDiscount() { return _myCQ.xdfgetMergeCouponDiscount(); }
    protected ConditionValue xgetCValueMergePointDiscount() { return _myCQ.xdfgetMergePointDiscount(); }
    protected ConditionValue xgetCValueMergeOtherDiscount() { return _myCQ.xdfgetMergeOtherDiscount(); }
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
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueImportTypeId() { return _myCQ.xdfgetImportTypeId(); }
    public String keepImportTypeId_InScopeRelation_MImportType(MImportTypeCQ sq)
    { return _myCQ.keepImportTypeId_InScopeRelation_MImportType(sq); }
    public String keepImportTypeId_NotInScopeRelation_MImportType(MImportTypeCQ sq)
    { return _myCQ.keepImportTypeId_NotInScopeRelation_MImportType(sq); }
    protected ConditionValue xgetCValueShippingInstHId() { return _myCQ.xdfgetShippingInstHId(); }
    public String keepShippingInstHId_InScopeRelation_TShippingInstH(TShippingInstHCQ sq)
    { return _myCQ.keepShippingInstHId_InScopeRelation_TShippingInstH(sq); }
    public String keepShippingInstHId_NotInScopeRelation_TShippingInstH(TShippingInstHCQ sq)
    { return _myCQ.keepShippingInstHId_NotInScopeRelation_TShippingInstH(sq); }
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
    public String keepScalarCondition(TEcOrderHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TEcOrderHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TEcOrderHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TEcOrderHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TEcOrderHCB.class.getName(); }
    protected String xinCQ() { return TEcOrderHCQ.class.getName(); }
}
