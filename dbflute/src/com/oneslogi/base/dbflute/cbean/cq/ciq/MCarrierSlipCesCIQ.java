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
 * The condition-query for in-line of M_CARRIER_SLIP_CES.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipCesCIQ extends AbstractBsMCarrierSlipCesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCarrierSlipCesCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCarrierSlipCesCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCarrierSlipCesCQ myCQ) {
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
    protected ConditionValue xgetCValueCustomerId() { return _myCQ.xdfgetCustomerId(); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_InScopeRelation_MCustomer(sq); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueCollectAccountNoBillTo() { return _myCQ.xdfgetCollectAccountNoBillTo(); }
    protected ConditionValue xgetCValueCollectZipCdBillTo() { return _myCQ.xdfgetCollectZipCdBillTo(); }
    protected ConditionValue xgetCValueCollectCountryCdBillTo() { return _myCQ.xdfgetCollectCountryCdBillTo(); }
    protected ConditionValue xgetCValuePaymentTermCdTaxesTo() { return _myCQ.xdfgetPaymentTermCdTaxesTo(); }
    protected ConditionValue xgetCValueCollectAccountNoTaxesTo() { return _myCQ.xdfgetCollectAccountNoTaxesTo(); }
    protected ConditionValue xgetCValueCollectZipCdTaxesTo() { return _myCQ.xdfgetCollectZipCdTaxesTo(); }
    protected ConditionValue xgetCValueCollectCountryCdTaxesTo() { return _myCQ.xdfgetCollectCountryCdTaxesTo(); }
    protected ConditionValue xgetCValueCodPaymentTermCd() { return _myCQ.xdfgetCodPaymentTermCd(); }
    protected ConditionValue xgetCValueCodAmount() { return _myCQ.xdfgetCodAmount(); }
    protected ConditionValue xgetCValueCodFeePayer() { return _myCQ.xdfgetCodFeePayer(); }
    protected ConditionValue xgetCValueTermsOfSales() { return _myCQ.xdfgetTermsOfSales(); }
    protected ConditionValue xgetCValueBrokerName() { return _myCQ.xdfgetBrokerName(); }
    protected ConditionValue xgetCValueBrokerPhoneNo() { return _myCQ.xdfgetBrokerPhoneNo(); }
    protected ConditionValue xgetCValueBrokerFaxNo() { return _myCQ.xdfgetBrokerFaxNo(); }
    protected ConditionValue xgetCValueSatDeliveryFlg() { return _myCQ.xdfgetSatDeliveryFlg(); }
    protected ConditionValue xgetCValueResidentialDeliveryFlg() { return _myCQ.xdfgetResidentialDeliveryFlg(); }
    protected ConditionValue xgetCValueCodFlg() { return _myCQ.xdfgetCodFlg(); }
    protected ConditionValue xgetCValueSignatureRequiredFlg() { return _myCQ.xdfgetSignatureRequiredFlg(); }
    protected ConditionValue xgetCValueSignatureReleaseFlg() { return _myCQ.xdfgetSignatureReleaseFlg(); }
    protected ConditionValue xgetCValueCallBeforeDeliveryFlg() { return _myCQ.xdfgetCallBeforeDeliveryFlg(); }
    protected ConditionValue xgetCValueFreezableProtectionFlg() { return _myCQ.xdfgetFreezableProtectionFlg(); }
    protected ConditionValue xgetCValueGuaranteedPlusFlg() { return _myCQ.xdfgetGuaranteedPlusFlg(); }
    protected ConditionValue xgetCValueResidentialPickupFlg() { return _myCQ.xdfgetResidentialPickupFlg(); }
    protected ConditionValue xgetCValueDoNotStackStackFlg() { return _myCQ.xdfgetDoNotStackStackFlg(); }
    protected ConditionValue xgetCValueLimitedAccessDeliveryFlg() { return _myCQ.xdfgetLimitedAccessDeliveryFlg(); }
    protected ConditionValue xgetCValueLimitedAccessPickupFlg() { return _myCQ.xdfgetLimitedAccessPickupFlg(); }
    protected ConditionValue xgetCValueOverSizedFlg() { return _myCQ.xdfgetOverSizedFlg(); }
    protected ConditionValue xgetCValuePoisonFlg() { return _myCQ.xdfgetPoisonFlg(); }
    protected ConditionValue xgetCValueFoogFlg() { return _myCQ.xdfgetFoogFlg(); }
    protected ConditionValue xgetCValueLiftgateDeliveryPrepaidFlg() { return _myCQ.xdfgetLiftgateDeliveryPrepaidFlg(); }
    protected ConditionValue xgetCValueLiftgateDeliveryCollectFlg() { return _myCQ.xdfgetLiftgateDeliveryCollectFlg(); }
    protected ConditionValue xgetCValueLiftgatePickupPrepaidFlg() { return _myCQ.xdfgetLiftgatePickupPrepaidFlg(); }
    protected ConditionValue xgetCValueLiftgatePickupCollectFlg() { return _myCQ.xdfgetLiftgatePickupCollectFlg(); }
    protected ConditionValue xgetCValueInsideDeliveryPrepaidFlg() { return _myCQ.xdfgetInsideDeliveryPrepaidFlg(); }
    protected ConditionValue xgetCValueInsideDeliveryCollectFlg() { return _myCQ.xdfgetInsideDeliveryCollectFlg(); }
    protected ConditionValue xgetCValueInsidePickupPrepaidFlg() { return _myCQ.xdfgetInsidePickupPrepaidFlg(); }
    protected ConditionValue xgetCValueInsidePickupCollectFlg() { return _myCQ.xdfgetInsidePickupCollectFlg(); }
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
    public String keepScalarCondition(MCarrierSlipCesCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCarrierSlipCesCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCarrierSlipCesCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCarrierSlipCesCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCarrierSlipCesCB.class.getName(); }
    protected String xinCQ() { return MCarrierSlipCesCQ.class.getName(); }
}
