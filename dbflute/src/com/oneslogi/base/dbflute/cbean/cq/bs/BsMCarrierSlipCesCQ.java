package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of M_CARRIER_SLIP_CES.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierSlipCesCQ extends AbstractBsMCarrierSlipCesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierSlipCesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipCesCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CARRIER_SLIP_CES) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCarrierSlipCesCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCarrierSlipCesCIQ xcreateCIQ() {
        MCarrierSlipCesCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCarrierSlipCesCIQ xnewCIQ() {
        return new MCarrierSlipCesCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CARRIER_SLIP_CES on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCarrierSlipCesCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCarrierSlipCesCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _customerId;
    public ConditionValue xdfgetCustomerId()
    { if (_customerId == null) { _customerId = nCV(); }
      return _customerId; }
    protected ConditionValue xgetCValueCustomerId() { return xdfgetCustomerId(); }

    public Map<String, MCustomerCQ> getCustomerId_InScopeRelation_MCustomer() { return xgetSQueMap("customerId_InScopeRelation_MCustomer"); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getCustomerId_NotInScopeRelation_MCustomer() { return xgetSQueMap("customerId_NotInScopeRelation_MCustomer"); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CustomerId_Asc() { regOBA("CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CustomerId_Desc() { regOBD("CUSTOMER_ID"); return this; }

    protected ConditionValue _collectAccountNoBillTo;
    public ConditionValue xdfgetCollectAccountNoBillTo()
    { if (_collectAccountNoBillTo == null) { _collectAccountNoBillTo = nCV(); }
      return _collectAccountNoBillTo; }
    protected ConditionValue xgetCValueCollectAccountNoBillTo() { return xdfgetCollectAccountNoBillTo(); }

    /**
     * Add order-by as ascend. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectAccountNoBillTo_Asc() { regOBA("COLLECT_ACCOUNT_NO_BILL_TO"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectAccountNoBillTo_Desc() { regOBD("COLLECT_ACCOUNT_NO_BILL_TO"); return this; }

    protected ConditionValue _collectZipCdBillTo;
    public ConditionValue xdfgetCollectZipCdBillTo()
    { if (_collectZipCdBillTo == null) { _collectZipCdBillTo = nCV(); }
      return _collectZipCdBillTo; }
    protected ConditionValue xgetCValueCollectZipCdBillTo() { return xdfgetCollectZipCdBillTo(); }

    /**
     * Add order-by as ascend. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectZipCdBillTo_Asc() { regOBA("COLLECT_ZIP_CD_BILL_TO"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectZipCdBillTo_Desc() { regOBD("COLLECT_ZIP_CD_BILL_TO"); return this; }

    protected ConditionValue _collectCountryCdBillTo;
    public ConditionValue xdfgetCollectCountryCdBillTo()
    { if (_collectCountryCdBillTo == null) { _collectCountryCdBillTo = nCV(); }
      return _collectCountryCdBillTo; }
    protected ConditionValue xgetCValueCollectCountryCdBillTo() { return xdfgetCollectCountryCdBillTo(); }

    /**
     * Add order-by as ascend. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectCountryCdBillTo_Asc() { regOBA("COLLECT_COUNTRY_CD_BILL_TO"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectCountryCdBillTo_Desc() { regOBD("COLLECT_COUNTRY_CD_BILL_TO"); return this; }

    protected ConditionValue _paymentTermCdTaxesTo;
    public ConditionValue xdfgetPaymentTermCdTaxesTo()
    { if (_paymentTermCdTaxesTo == null) { _paymentTermCdTaxesTo = nCV(); }
      return _paymentTermCdTaxesTo; }
    protected ConditionValue xgetCValuePaymentTermCdTaxesTo() { return xdfgetPaymentTermCdTaxesTo(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_PaymentTermCdTaxesTo_Asc() { regOBA("PAYMENT_TERM_CD_TAXES_TO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_PaymentTermCdTaxesTo_Desc() { regOBD("PAYMENT_TERM_CD_TAXES_TO"); return this; }

    protected ConditionValue _collectAccountNoTaxesTo;
    public ConditionValue xdfgetCollectAccountNoTaxesTo()
    { if (_collectAccountNoTaxesTo == null) { _collectAccountNoTaxesTo = nCV(); }
      return _collectAccountNoTaxesTo; }
    protected ConditionValue xgetCValueCollectAccountNoTaxesTo() { return xdfgetCollectAccountNoTaxesTo(); }

    /**
     * Add order-by as ascend. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectAccountNoTaxesTo_Asc() { regOBA("COLLECT_ACCOUNT_NO_TAXES_TO"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectAccountNoTaxesTo_Desc() { regOBD("COLLECT_ACCOUNT_NO_TAXES_TO"); return this; }

    protected ConditionValue _collectZipCdTaxesTo;
    public ConditionValue xdfgetCollectZipCdTaxesTo()
    { if (_collectZipCdTaxesTo == null) { _collectZipCdTaxesTo = nCV(); }
      return _collectZipCdTaxesTo; }
    protected ConditionValue xgetCValueCollectZipCdTaxesTo() { return xdfgetCollectZipCdTaxesTo(); }

    /**
     * Add order-by as ascend. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectZipCdTaxesTo_Asc() { regOBA("COLLECT_ZIP_CD_TAXES_TO"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectZipCdTaxesTo_Desc() { regOBD("COLLECT_ZIP_CD_TAXES_TO"); return this; }

    protected ConditionValue _collectCountryCdTaxesTo;
    public ConditionValue xdfgetCollectCountryCdTaxesTo()
    { if (_collectCountryCdTaxesTo == null) { _collectCountryCdTaxesTo = nCV(); }
      return _collectCountryCdTaxesTo; }
    protected ConditionValue xgetCValueCollectCountryCdTaxesTo() { return xdfgetCollectCountryCdTaxesTo(); }

    /**
     * Add order-by as ascend. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectCountryCdTaxesTo_Asc() { regOBA("COLLECT_COUNTRY_CD_TAXES_TO"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CollectCountryCdTaxesTo_Desc() { regOBD("COLLECT_COUNTRY_CD_TAXES_TO"); return this; }

    protected ConditionValue _codPaymentTermCd;
    public ConditionValue xdfgetCodPaymentTermCd()
    { if (_codPaymentTermCd == null) { _codPaymentTermCd = nCV(); }
      return _codPaymentTermCd; }
    protected ConditionValue xgetCValueCodPaymentTermCd() { return xdfgetCodPaymentTermCd(); }

    /**
     * Add order-by as ascend. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CodPaymentTermCd_Asc() { regOBA("COD_PAYMENT_TERM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CodPaymentTermCd_Desc() { regOBD("COD_PAYMENT_TERM_CD"); return this; }

    protected ConditionValue _codAmount;
    public ConditionValue xdfgetCodAmount()
    { if (_codAmount == null) { _codAmount = nCV(); }
      return _codAmount; }
    protected ConditionValue xgetCValueCodAmount() { return xdfgetCodAmount(); }

    /**
     * Add order-by as ascend. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CodAmount_Asc() { regOBA("COD_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CodAmount_Desc() { regOBD("COD_AMOUNT"); return this; }

    protected ConditionValue _codFeePayer;
    public ConditionValue xdfgetCodFeePayer()
    { if (_codFeePayer == null) { _codFeePayer = nCV(); }
      return _codFeePayer; }
    protected ConditionValue xgetCValueCodFeePayer() { return xdfgetCodFeePayer(); }

    /**
     * Add order-by as ascend. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CodFeePayer_Asc() { regOBA("COD_FEE_PAYER"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CodFeePayer_Desc() { regOBD("COD_FEE_PAYER"); return this; }

    protected ConditionValue _termsOfSales;
    public ConditionValue xdfgetTermsOfSales()
    { if (_termsOfSales == null) { _termsOfSales = nCV(); }
      return _termsOfSales; }
    protected ConditionValue xgetCValueTermsOfSales() { return xdfgetTermsOfSales(); }

    /**
     * Add order-by as ascend. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_TermsOfSales_Asc() { regOBA("TERMS_OF_SALES"); return this; }

    /**
     * Add order-by as descend. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_TermsOfSales_Desc() { regOBD("TERMS_OF_SALES"); return this; }

    protected ConditionValue _brokerName;
    public ConditionValue xdfgetBrokerName()
    { if (_brokerName == null) { _brokerName = nCV(); }
      return _brokerName; }
    protected ConditionValue xgetCValueBrokerName() { return xdfgetBrokerName(); }

    /**
     * Add order-by as ascend. <br>
     * BROKER_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_BrokerName_Asc() { regOBA("BROKER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BROKER_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_BrokerName_Desc() { regOBD("BROKER_NAME"); return this; }

    protected ConditionValue _brokerPhoneNo;
    public ConditionValue xdfgetBrokerPhoneNo()
    { if (_brokerPhoneNo == null) { _brokerPhoneNo = nCV(); }
      return _brokerPhoneNo; }
    protected ConditionValue xgetCValueBrokerPhoneNo() { return xdfgetBrokerPhoneNo(); }

    /**
     * Add order-by as ascend. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_BrokerPhoneNo_Asc() { regOBA("BROKER_PHONE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_BrokerPhoneNo_Desc() { regOBD("BROKER_PHONE_NO"); return this; }

    protected ConditionValue _brokerFaxNo;
    public ConditionValue xdfgetBrokerFaxNo()
    { if (_brokerFaxNo == null) { _brokerFaxNo = nCV(); }
      return _brokerFaxNo; }
    protected ConditionValue xgetCValueBrokerFaxNo() { return xdfgetBrokerFaxNo(); }

    /**
     * Add order-by as ascend. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_BrokerFaxNo_Asc() { regOBA("BROKER_FAX_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_BrokerFaxNo_Desc() { regOBD("BROKER_FAX_NO"); return this; }

    protected ConditionValue _satDeliveryFlg;
    public ConditionValue xdfgetSatDeliveryFlg()
    { if (_satDeliveryFlg == null) { _satDeliveryFlg = nCV(); }
      return _satDeliveryFlg; }
    protected ConditionValue xgetCValueSatDeliveryFlg() { return xdfgetSatDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_SatDeliveryFlg_Asc() { regOBA("SAT_DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_SatDeliveryFlg_Desc() { regOBD("SAT_DELIVERY_FLG"); return this; }

    protected ConditionValue _residentialDeliveryFlg;
    public ConditionValue xdfgetResidentialDeliveryFlg()
    { if (_residentialDeliveryFlg == null) { _residentialDeliveryFlg = nCV(); }
      return _residentialDeliveryFlg; }
    protected ConditionValue xgetCValueResidentialDeliveryFlg() { return xdfgetResidentialDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_ResidentialDeliveryFlg_Asc() { regOBA("RESIDENTIAL_DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_ResidentialDeliveryFlg_Desc() { regOBD("RESIDENTIAL_DELIVERY_FLG"); return this; }

    protected ConditionValue _codFlg;
    public ConditionValue xdfgetCodFlg()
    { if (_codFlg == null) { _codFlg = nCV(); }
      return _codFlg; }
    protected ConditionValue xgetCValueCodFlg() { return xdfgetCodFlg(); }

    /**
     * Add order-by as ascend. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CodFlg_Asc() { regOBA("COD_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CodFlg_Desc() { regOBD("COD_FLG"); return this; }

    protected ConditionValue _signatureRequiredFlg;
    public ConditionValue xdfgetSignatureRequiredFlg()
    { if (_signatureRequiredFlg == null) { _signatureRequiredFlg = nCV(); }
      return _signatureRequiredFlg; }
    protected ConditionValue xgetCValueSignatureRequiredFlg() { return xdfgetSignatureRequiredFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_SignatureRequiredFlg_Asc() { regOBA("SIGNATURE_REQUIRED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_SignatureRequiredFlg_Desc() { regOBD("SIGNATURE_REQUIRED_FLG"); return this; }

    protected ConditionValue _signatureReleaseFlg;
    public ConditionValue xdfgetSignatureReleaseFlg()
    { if (_signatureReleaseFlg == null) { _signatureReleaseFlg = nCV(); }
      return _signatureReleaseFlg; }
    protected ConditionValue xgetCValueSignatureReleaseFlg() { return xdfgetSignatureReleaseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_SignatureReleaseFlg_Asc() { regOBA("SIGNATURE_RELEASE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_SignatureReleaseFlg_Desc() { regOBD("SIGNATURE_RELEASE_FLG"); return this; }

    protected ConditionValue _callBeforeDeliveryFlg;
    public ConditionValue xdfgetCallBeforeDeliveryFlg()
    { if (_callBeforeDeliveryFlg == null) { _callBeforeDeliveryFlg = nCV(); }
      return _callBeforeDeliveryFlg; }
    protected ConditionValue xgetCValueCallBeforeDeliveryFlg() { return xdfgetCallBeforeDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CallBeforeDeliveryFlg_Asc() { regOBA("CALL_BEFORE_DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_CallBeforeDeliveryFlg_Desc() { regOBD("CALL_BEFORE_DELIVERY_FLG"); return this; }

    protected ConditionValue _freezableProtectionFlg;
    public ConditionValue xdfgetFreezableProtectionFlg()
    { if (_freezableProtectionFlg == null) { _freezableProtectionFlg = nCV(); }
      return _freezableProtectionFlg; }
    protected ConditionValue xgetCValueFreezableProtectionFlg() { return xdfgetFreezableProtectionFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_FreezableProtectionFlg_Asc() { regOBA("FREEZABLE_PROTECTION_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_FreezableProtectionFlg_Desc() { regOBD("FREEZABLE_PROTECTION_FLG"); return this; }

    protected ConditionValue _guaranteedPlusFlg;
    public ConditionValue xdfgetGuaranteedPlusFlg()
    { if (_guaranteedPlusFlg == null) { _guaranteedPlusFlg = nCV(); }
      return _guaranteedPlusFlg; }
    protected ConditionValue xgetCValueGuaranteedPlusFlg() { return xdfgetGuaranteedPlusFlg(); }

    /**
     * Add order-by as ascend. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_GuaranteedPlusFlg_Asc() { regOBA("GUARANTEED_PLUS_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_GuaranteedPlusFlg_Desc() { regOBD("GUARANTEED_PLUS_FLG"); return this; }

    protected ConditionValue _residentialPickupFlg;
    public ConditionValue xdfgetResidentialPickupFlg()
    { if (_residentialPickupFlg == null) { _residentialPickupFlg = nCV(); }
      return _residentialPickupFlg; }
    protected ConditionValue xgetCValueResidentialPickupFlg() { return xdfgetResidentialPickupFlg(); }

    /**
     * Add order-by as ascend. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_ResidentialPickupFlg_Asc() { regOBA("RESIDENTIAL_PICKUP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_ResidentialPickupFlg_Desc() { regOBD("RESIDENTIAL_PICKUP_FLG"); return this; }

    protected ConditionValue _doNotStackStackFlg;
    public ConditionValue xdfgetDoNotStackStackFlg()
    { if (_doNotStackStackFlg == null) { _doNotStackStackFlg = nCV(); }
      return _doNotStackStackFlg; }
    protected ConditionValue xgetCValueDoNotStackStackFlg() { return xdfgetDoNotStackStackFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_DoNotStackStackFlg_Asc() { regOBA("DO_NOT_STACK_STACK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_DoNotStackStackFlg_Desc() { regOBD("DO_NOT_STACK_STACK_FLG"); return this; }

    protected ConditionValue _limitedAccessDeliveryFlg;
    public ConditionValue xdfgetLimitedAccessDeliveryFlg()
    { if (_limitedAccessDeliveryFlg == null) { _limitedAccessDeliveryFlg = nCV(); }
      return _limitedAccessDeliveryFlg; }
    protected ConditionValue xgetCValueLimitedAccessDeliveryFlg() { return xdfgetLimitedAccessDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LimitedAccessDeliveryFlg_Asc() { regOBA("LIMITED_ACCESS_DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LimitedAccessDeliveryFlg_Desc() { regOBD("LIMITED_ACCESS_DELIVERY_FLG"); return this; }

    protected ConditionValue _limitedAccessPickupFlg;
    public ConditionValue xdfgetLimitedAccessPickupFlg()
    { if (_limitedAccessPickupFlg == null) { _limitedAccessPickupFlg = nCV(); }
      return _limitedAccessPickupFlg; }
    protected ConditionValue xgetCValueLimitedAccessPickupFlg() { return xdfgetLimitedAccessPickupFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LimitedAccessPickupFlg_Asc() { regOBA("LIMITED_ACCESS_PICKUP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LimitedAccessPickupFlg_Desc() { regOBD("LIMITED_ACCESS_PICKUP_FLG"); return this; }

    protected ConditionValue _overSizedFlg;
    public ConditionValue xdfgetOverSizedFlg()
    { if (_overSizedFlg == null) { _overSizedFlg = nCV(); }
      return _overSizedFlg; }
    protected ConditionValue xgetCValueOverSizedFlg() { return xdfgetOverSizedFlg(); }

    /**
     * Add order-by as ascend. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_OverSizedFlg_Asc() { regOBA("OVER_SIZED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_OverSizedFlg_Desc() { regOBD("OVER_SIZED_FLG"); return this; }

    protected ConditionValue _poisonFlg;
    public ConditionValue xdfgetPoisonFlg()
    { if (_poisonFlg == null) { _poisonFlg = nCV(); }
      return _poisonFlg; }
    protected ConditionValue xgetCValuePoisonFlg() { return xdfgetPoisonFlg(); }

    /**
     * Add order-by as ascend. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_PoisonFlg_Asc() { regOBA("POISON_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_PoisonFlg_Desc() { regOBD("POISON_FLG"); return this; }

    protected ConditionValue _foogFlg;
    public ConditionValue xdfgetFoogFlg()
    { if (_foogFlg == null) { _foogFlg = nCV(); }
      return _foogFlg; }
    protected ConditionValue xgetCValueFoogFlg() { return xdfgetFoogFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_FoogFlg_Asc() { regOBA("FOOG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_FoogFlg_Desc() { regOBD("FOOG_FLG"); return this; }

    protected ConditionValue _liftgateDeliveryPrepaidFlg;
    public ConditionValue xdfgetLiftgateDeliveryPrepaidFlg()
    { if (_liftgateDeliveryPrepaidFlg == null) { _liftgateDeliveryPrepaidFlg = nCV(); }
      return _liftgateDeliveryPrepaidFlg; }
    protected ConditionValue xgetCValueLiftgateDeliveryPrepaidFlg() { return xdfgetLiftgateDeliveryPrepaidFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LiftgateDeliveryPrepaidFlg_Asc() { regOBA("LIFTGATE_DELIVERY_PREPAID_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LiftgateDeliveryPrepaidFlg_Desc() { regOBD("LIFTGATE_DELIVERY_PREPAID_FLG"); return this; }

    protected ConditionValue _liftgateDeliveryCollectFlg;
    public ConditionValue xdfgetLiftgateDeliveryCollectFlg()
    { if (_liftgateDeliveryCollectFlg == null) { _liftgateDeliveryCollectFlg = nCV(); }
      return _liftgateDeliveryCollectFlg; }
    protected ConditionValue xgetCValueLiftgateDeliveryCollectFlg() { return xdfgetLiftgateDeliveryCollectFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LiftgateDeliveryCollectFlg_Asc() { regOBA("LIFTGATE_DELIVERY_COLLECT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LiftgateDeliveryCollectFlg_Desc() { regOBD("LIFTGATE_DELIVERY_COLLECT_FLG"); return this; }

    protected ConditionValue _liftgatePickupPrepaidFlg;
    public ConditionValue xdfgetLiftgatePickupPrepaidFlg()
    { if (_liftgatePickupPrepaidFlg == null) { _liftgatePickupPrepaidFlg = nCV(); }
      return _liftgatePickupPrepaidFlg; }
    protected ConditionValue xgetCValueLiftgatePickupPrepaidFlg() { return xdfgetLiftgatePickupPrepaidFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LiftgatePickupPrepaidFlg_Asc() { regOBA("LIFTGATE_PICKUP_PREPAID_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LiftgatePickupPrepaidFlg_Desc() { regOBD("LIFTGATE_PICKUP_PREPAID_FLG"); return this; }

    protected ConditionValue _liftgatePickupCollectFlg;
    public ConditionValue xdfgetLiftgatePickupCollectFlg()
    { if (_liftgatePickupCollectFlg == null) { _liftgatePickupCollectFlg = nCV(); }
      return _liftgatePickupCollectFlg; }
    protected ConditionValue xgetCValueLiftgatePickupCollectFlg() { return xdfgetLiftgatePickupCollectFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LiftgatePickupCollectFlg_Asc() { regOBA("LIFTGATE_PICKUP_COLLECT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_LiftgatePickupCollectFlg_Desc() { regOBD("LIFTGATE_PICKUP_COLLECT_FLG"); return this; }

    protected ConditionValue _insideDeliveryPrepaidFlg;
    public ConditionValue xdfgetInsideDeliveryPrepaidFlg()
    { if (_insideDeliveryPrepaidFlg == null) { _insideDeliveryPrepaidFlg = nCV(); }
      return _insideDeliveryPrepaidFlg; }
    protected ConditionValue xgetCValueInsideDeliveryPrepaidFlg() { return xdfgetInsideDeliveryPrepaidFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_InsideDeliveryPrepaidFlg_Asc() { regOBA("INSIDE_DELIVERY_PREPAID_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_InsideDeliveryPrepaidFlg_Desc() { regOBD("INSIDE_DELIVERY_PREPAID_FLG"); return this; }

    protected ConditionValue _insideDeliveryCollectFlg;
    public ConditionValue xdfgetInsideDeliveryCollectFlg()
    { if (_insideDeliveryCollectFlg == null) { _insideDeliveryCollectFlg = nCV(); }
      return _insideDeliveryCollectFlg; }
    protected ConditionValue xgetCValueInsideDeliveryCollectFlg() { return xdfgetInsideDeliveryCollectFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_InsideDeliveryCollectFlg_Asc() { regOBA("INSIDE_DELIVERY_COLLECT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_InsideDeliveryCollectFlg_Desc() { regOBD("INSIDE_DELIVERY_COLLECT_FLG"); return this; }

    protected ConditionValue _insidePickupPrepaidFlg;
    public ConditionValue xdfgetInsidePickupPrepaidFlg()
    { if (_insidePickupPrepaidFlg == null) { _insidePickupPrepaidFlg = nCV(); }
      return _insidePickupPrepaidFlg; }
    protected ConditionValue xgetCValueInsidePickupPrepaidFlg() { return xdfgetInsidePickupPrepaidFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_InsidePickupPrepaidFlg_Asc() { regOBA("INSIDE_PICKUP_PREPAID_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_InsidePickupPrepaidFlg_Desc() { regOBD("INSIDE_PICKUP_PREPAID_FLG"); return this; }

    protected ConditionValue _insidePickupCollectFlg;
    public ConditionValue xdfgetInsidePickupCollectFlg()
    { if (_insidePickupCollectFlg == null) { _insidePickupCollectFlg = nCV(); }
      return _insidePickupCollectFlg; }
    protected ConditionValue xgetCValueInsidePickupCollectFlg() { return xdfgetInsidePickupCollectFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_InsidePickupCollectFlg_Asc() { regOBA("INSIDE_PICKUP_COLLECT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_InsidePickupCollectFlg_Desc() { regOBD("INSIDE_PICKUP_COLLECT_FLG"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMCarrierSlipCesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCarrierSlipCesCQ bq = (MCarrierSlipCesCQ)bqs;
        MCarrierSlipCesCQ uq = (MCarrierSlipCesCQ)uqs;
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryBClassDtlBySatDeliveryFlg()) {
            uq.queryBClassDtlBySatDeliveryFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlBySatDeliveryFlg(), uq.queryBClassDtlBySatDeliveryFlg());
        }
        if (bq.hasConditionQueryBClassDtlByResidentialDeliveryFlg()) {
            uq.queryBClassDtlByResidentialDeliveryFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByResidentialDeliveryFlg(), uq.queryBClassDtlByResidentialDeliveryFlg());
        }
        if (bq.hasConditionQueryBClassDtlByCodFlg()) {
            uq.queryBClassDtlByCodFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByCodFlg(), uq.queryBClassDtlByCodFlg());
        }
        if (bq.hasConditionQueryBClassDtlBySignatureRequiredFlg()) {
            uq.queryBClassDtlBySignatureRequiredFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlBySignatureRequiredFlg(), uq.queryBClassDtlBySignatureRequiredFlg());
        }
        if (bq.hasConditionQueryBClassDtlBySignatureReleaseFlg()) {
            uq.queryBClassDtlBySignatureReleaseFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlBySignatureReleaseFlg(), uq.queryBClassDtlBySignatureReleaseFlg());
        }
        if (bq.hasConditionQueryBClassDtlByCallBeforeDeliveryFlg()) {
            uq.queryBClassDtlByCallBeforeDeliveryFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByCallBeforeDeliveryFlg(), uq.queryBClassDtlByCallBeforeDeliveryFlg());
        }
        if (bq.hasConditionQueryBClassDtlByFreezableProtectionFlg()) {
            uq.queryBClassDtlByFreezableProtectionFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByFreezableProtectionFlg(), uq.queryBClassDtlByFreezableProtectionFlg());
        }
        if (bq.hasConditionQueryBClassDtlByGuaranteedPlusFlg()) {
            uq.queryBClassDtlByGuaranteedPlusFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByGuaranteedPlusFlg(), uq.queryBClassDtlByGuaranteedPlusFlg());
        }
        if (bq.hasConditionQueryBClassDtlByResidentialPickupFlg()) {
            uq.queryBClassDtlByResidentialPickupFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByResidentialPickupFlg(), uq.queryBClassDtlByResidentialPickupFlg());
        }
        if (bq.hasConditionQueryBClassDtlByDoNotStackStackFlg()) {
            uq.queryBClassDtlByDoNotStackStackFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDoNotStackStackFlg(), uq.queryBClassDtlByDoNotStackStackFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLimitedAccessDeliveryFlg()) {
            uq.queryBClassDtlByLimitedAccessDeliveryFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitedAccessDeliveryFlg(), uq.queryBClassDtlByLimitedAccessDeliveryFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLimitedAccessPickupFlg()) {
            uq.queryBClassDtlByLimitedAccessPickupFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitedAccessPickupFlg(), uq.queryBClassDtlByLimitedAccessPickupFlg());
        }
        if (bq.hasConditionQueryBClassDtlByOverSizedFlg()) {
            uq.queryBClassDtlByOverSizedFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByOverSizedFlg(), uq.queryBClassDtlByOverSizedFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPoisonFlg()) {
            uq.queryBClassDtlByPoisonFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPoisonFlg(), uq.queryBClassDtlByPoisonFlg());
        }
        if (bq.hasConditionQueryBClassDtlByFoogFlg()) {
            uq.queryBClassDtlByFoogFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByFoogFlg(), uq.queryBClassDtlByFoogFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLiftgateDeliveryPrepaidFlg()) {
            uq.queryBClassDtlByLiftgateDeliveryPrepaidFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLiftgateDeliveryPrepaidFlg(), uq.queryBClassDtlByLiftgateDeliveryPrepaidFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLiftgateDeliveryCollectFlg()) {
            uq.queryBClassDtlByLiftgateDeliveryCollectFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLiftgateDeliveryCollectFlg(), uq.queryBClassDtlByLiftgateDeliveryCollectFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLiftgatePickupPrepaidFlg()) {
            uq.queryBClassDtlByLiftgatePickupPrepaidFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLiftgatePickupPrepaidFlg(), uq.queryBClassDtlByLiftgatePickupPrepaidFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLiftgatePickupCollectFlg()) {
            uq.queryBClassDtlByLiftgatePickupCollectFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLiftgatePickupCollectFlg(), uq.queryBClassDtlByLiftgatePickupCollectFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInsideDeliveryPrepaidFlg()) {
            uq.queryBClassDtlByInsideDeliveryPrepaidFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInsideDeliveryPrepaidFlg(), uq.queryBClassDtlByInsideDeliveryPrepaidFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInsideDeliveryCollectFlg()) {
            uq.queryBClassDtlByInsideDeliveryCollectFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInsideDeliveryCollectFlg(), uq.queryBClassDtlByInsideDeliveryCollectFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInsidePickupPrepaidFlg()) {
            uq.queryBClassDtlByInsidePickupPrepaidFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInsidePickupPrepaidFlg(), uq.queryBClassDtlByInsidePickupPrepaidFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInsidePickupCollectFlg()) {
            uq.queryBClassDtlByInsidePickupCollectFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInsidePickupCollectFlg(), uq.queryBClassDtlByInsidePickupCollectFlg());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SAT_DELIVERY_FLG, named 'BClassDtlBySatDeliveryFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySatDeliveryFlg() {
        return xdfgetConditionQueryBClassDtlBySatDeliveryFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySatDeliveryFlg() {
        String prop = "bClassDtlBySatDeliveryFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySatDeliveryFlg()); xsetupOuterJoinBClassDtlBySatDeliveryFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySatDeliveryFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlBySatDeliveryFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySatDeliveryFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySatDeliveryFlg() { xregOutJo("bClassDtlBySatDeliveryFlg"); }
    public boolean hasConditionQueryBClassDtlBySatDeliveryFlg() { return xhasQueRlMap("bClassDtlBySatDeliveryFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RESIDENTIAL_DELIVERY_FLG, named 'BClassDtlByResidentialDeliveryFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByResidentialDeliveryFlg() {
        return xdfgetConditionQueryBClassDtlByResidentialDeliveryFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByResidentialDeliveryFlg() {
        String prop = "bClassDtlByResidentialDeliveryFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByResidentialDeliveryFlg()); xsetupOuterJoinBClassDtlByResidentialDeliveryFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByResidentialDeliveryFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByResidentialDeliveryFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByResidentialDeliveryFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByResidentialDeliveryFlg() { xregOutJo("bClassDtlByResidentialDeliveryFlg"); }
    public boolean hasConditionQueryBClassDtlByResidentialDeliveryFlg() { return xhasQueRlMap("bClassDtlByResidentialDeliveryFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my COD_FLG, named 'BClassDtlByCodFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCodFlg() {
        return xdfgetConditionQueryBClassDtlByCodFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCodFlg() {
        String prop = "bClassDtlByCodFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCodFlg()); xsetupOuterJoinBClassDtlByCodFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCodFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByCodFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCodFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCodFlg() { xregOutJo("bClassDtlByCodFlg"); }
    public boolean hasConditionQueryBClassDtlByCodFlg() { return xhasQueRlMap("bClassDtlByCodFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SIGNATURE_REQUIRED_FLG, named 'BClassDtlBySignatureRequiredFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySignatureRequiredFlg() {
        return xdfgetConditionQueryBClassDtlBySignatureRequiredFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySignatureRequiredFlg() {
        String prop = "bClassDtlBySignatureRequiredFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySignatureRequiredFlg()); xsetupOuterJoinBClassDtlBySignatureRequiredFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySignatureRequiredFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlBySignatureRequiredFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySignatureRequiredFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySignatureRequiredFlg() { xregOutJo("bClassDtlBySignatureRequiredFlg"); }
    public boolean hasConditionQueryBClassDtlBySignatureRequiredFlg() { return xhasQueRlMap("bClassDtlBySignatureRequiredFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SIGNATURE_RELEASE_FLG, named 'BClassDtlBySignatureReleaseFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySignatureReleaseFlg() {
        return xdfgetConditionQueryBClassDtlBySignatureReleaseFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySignatureReleaseFlg() {
        String prop = "bClassDtlBySignatureReleaseFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySignatureReleaseFlg()); xsetupOuterJoinBClassDtlBySignatureReleaseFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySignatureReleaseFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlBySignatureReleaseFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySignatureReleaseFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySignatureReleaseFlg() { xregOutJo("bClassDtlBySignatureReleaseFlg"); }
    public boolean hasConditionQueryBClassDtlBySignatureReleaseFlg() { return xhasQueRlMap("bClassDtlBySignatureReleaseFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CALL_BEFORE_DELIVERY_FLG, named 'BClassDtlByCallBeforeDeliveryFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCallBeforeDeliveryFlg() {
        return xdfgetConditionQueryBClassDtlByCallBeforeDeliveryFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCallBeforeDeliveryFlg() {
        String prop = "bClassDtlByCallBeforeDeliveryFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCallBeforeDeliveryFlg()); xsetupOuterJoinBClassDtlByCallBeforeDeliveryFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCallBeforeDeliveryFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByCallBeforeDeliveryFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCallBeforeDeliveryFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCallBeforeDeliveryFlg() { xregOutJo("bClassDtlByCallBeforeDeliveryFlg"); }
    public boolean hasConditionQueryBClassDtlByCallBeforeDeliveryFlg() { return xhasQueRlMap("bClassDtlByCallBeforeDeliveryFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my FREEZABLE_PROTECTION_FLG, named 'BClassDtlByFreezableProtectionFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByFreezableProtectionFlg() {
        return xdfgetConditionQueryBClassDtlByFreezableProtectionFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByFreezableProtectionFlg() {
        String prop = "bClassDtlByFreezableProtectionFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByFreezableProtectionFlg()); xsetupOuterJoinBClassDtlByFreezableProtectionFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByFreezableProtectionFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByFreezableProtectionFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByFreezableProtectionFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByFreezableProtectionFlg() { xregOutJo("bClassDtlByFreezableProtectionFlg"); }
    public boolean hasConditionQueryBClassDtlByFreezableProtectionFlg() { return xhasQueRlMap("bClassDtlByFreezableProtectionFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my GUARANTEED_PLUS_FLG, named 'BClassDtlByGuaranteedPlusFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByGuaranteedPlusFlg() {
        return xdfgetConditionQueryBClassDtlByGuaranteedPlusFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByGuaranteedPlusFlg() {
        String prop = "bClassDtlByGuaranteedPlusFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByGuaranteedPlusFlg()); xsetupOuterJoinBClassDtlByGuaranteedPlusFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByGuaranteedPlusFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByGuaranteedPlusFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByGuaranteedPlusFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByGuaranteedPlusFlg() { xregOutJo("bClassDtlByGuaranteedPlusFlg"); }
    public boolean hasConditionQueryBClassDtlByGuaranteedPlusFlg() { return xhasQueRlMap("bClassDtlByGuaranteedPlusFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RESIDENTIAL_PICKUP_FLG, named 'BClassDtlByResidentialPickupFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByResidentialPickupFlg() {
        return xdfgetConditionQueryBClassDtlByResidentialPickupFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByResidentialPickupFlg() {
        String prop = "bClassDtlByResidentialPickupFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByResidentialPickupFlg()); xsetupOuterJoinBClassDtlByResidentialPickupFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByResidentialPickupFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByResidentialPickupFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByResidentialPickupFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByResidentialPickupFlg() { xregOutJo("bClassDtlByResidentialPickupFlg"); }
    public boolean hasConditionQueryBClassDtlByResidentialPickupFlg() { return xhasQueRlMap("bClassDtlByResidentialPickupFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DO_NOT_STACK_STACK_FLG, named 'BClassDtlByDoNotStackStackFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDoNotStackStackFlg() {
        return xdfgetConditionQueryBClassDtlByDoNotStackStackFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDoNotStackStackFlg() {
        String prop = "bClassDtlByDoNotStackStackFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDoNotStackStackFlg()); xsetupOuterJoinBClassDtlByDoNotStackStackFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDoNotStackStackFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByDoNotStackStackFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDoNotStackStackFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDoNotStackStackFlg() { xregOutJo("bClassDtlByDoNotStackStackFlg"); }
    public boolean hasConditionQueryBClassDtlByDoNotStackStackFlg() { return xhasQueRlMap("bClassDtlByDoNotStackStackFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIMITED_ACCESS_DELIVERY_FLG, named 'BClassDtlByLimitedAccessDeliveryFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitedAccessDeliveryFlg() {
        return xdfgetConditionQueryBClassDtlByLimitedAccessDeliveryFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitedAccessDeliveryFlg() {
        String prop = "bClassDtlByLimitedAccessDeliveryFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitedAccessDeliveryFlg()); xsetupOuterJoinBClassDtlByLimitedAccessDeliveryFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitedAccessDeliveryFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByLimitedAccessDeliveryFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitedAccessDeliveryFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitedAccessDeliveryFlg() { xregOutJo("bClassDtlByLimitedAccessDeliveryFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitedAccessDeliveryFlg() { return xhasQueRlMap("bClassDtlByLimitedAccessDeliveryFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIMITED_ACCESS_PICKUP_FLG, named 'BClassDtlByLimitedAccessPickupFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitedAccessPickupFlg() {
        return xdfgetConditionQueryBClassDtlByLimitedAccessPickupFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitedAccessPickupFlg() {
        String prop = "bClassDtlByLimitedAccessPickupFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitedAccessPickupFlg()); xsetupOuterJoinBClassDtlByLimitedAccessPickupFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitedAccessPickupFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByLimitedAccessPickupFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitedAccessPickupFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitedAccessPickupFlg() { xregOutJo("bClassDtlByLimitedAccessPickupFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitedAccessPickupFlg() { return xhasQueRlMap("bClassDtlByLimitedAccessPickupFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my OVER_SIZED_FLG, named 'BClassDtlByOverSizedFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByOverSizedFlg() {
        return xdfgetConditionQueryBClassDtlByOverSizedFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByOverSizedFlg() {
        String prop = "bClassDtlByOverSizedFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByOverSizedFlg()); xsetupOuterJoinBClassDtlByOverSizedFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByOverSizedFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByOverSizedFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByOverSizedFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByOverSizedFlg() { xregOutJo("bClassDtlByOverSizedFlg"); }
    public boolean hasConditionQueryBClassDtlByOverSizedFlg() { return xhasQueRlMap("bClassDtlByOverSizedFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my POISON_FLG, named 'BClassDtlByPoisonFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPoisonFlg() {
        return xdfgetConditionQueryBClassDtlByPoisonFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPoisonFlg() {
        String prop = "bClassDtlByPoisonFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPoisonFlg()); xsetupOuterJoinBClassDtlByPoisonFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPoisonFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByPoisonFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPoisonFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPoisonFlg() { xregOutJo("bClassDtlByPoisonFlg"); }
    public boolean hasConditionQueryBClassDtlByPoisonFlg() { return xhasQueRlMap("bClassDtlByPoisonFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my FOOG_FLG, named 'BClassDtlByFoogFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByFoogFlg() {
        return xdfgetConditionQueryBClassDtlByFoogFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByFoogFlg() {
        String prop = "bClassDtlByFoogFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByFoogFlg()); xsetupOuterJoinBClassDtlByFoogFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByFoogFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByFoogFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByFoogFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByFoogFlg() { xregOutJo("bClassDtlByFoogFlg"); }
    public boolean hasConditionQueryBClassDtlByFoogFlg() { return xhasQueRlMap("bClassDtlByFoogFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIFTGATE_DELIVERY_PREPAID_FLG, named 'BClassDtlByLiftgateDeliveryPrepaidFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLiftgateDeliveryPrepaidFlg() {
        return xdfgetConditionQueryBClassDtlByLiftgateDeliveryPrepaidFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLiftgateDeliveryPrepaidFlg() {
        String prop = "bClassDtlByLiftgateDeliveryPrepaidFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLiftgateDeliveryPrepaidFlg()); xsetupOuterJoinBClassDtlByLiftgateDeliveryPrepaidFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLiftgateDeliveryPrepaidFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByLiftgateDeliveryPrepaidFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLiftgateDeliveryPrepaidFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLiftgateDeliveryPrepaidFlg() { xregOutJo("bClassDtlByLiftgateDeliveryPrepaidFlg"); }
    public boolean hasConditionQueryBClassDtlByLiftgateDeliveryPrepaidFlg() { return xhasQueRlMap("bClassDtlByLiftgateDeliveryPrepaidFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIFTGATE_DELIVERY_COLLECT_FLG, named 'BClassDtlByLiftgateDeliveryCollectFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLiftgateDeliveryCollectFlg() {
        return xdfgetConditionQueryBClassDtlByLiftgateDeliveryCollectFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLiftgateDeliveryCollectFlg() {
        String prop = "bClassDtlByLiftgateDeliveryCollectFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLiftgateDeliveryCollectFlg()); xsetupOuterJoinBClassDtlByLiftgateDeliveryCollectFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLiftgateDeliveryCollectFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByLiftgateDeliveryCollectFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLiftgateDeliveryCollectFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLiftgateDeliveryCollectFlg() { xregOutJo("bClassDtlByLiftgateDeliveryCollectFlg"); }
    public boolean hasConditionQueryBClassDtlByLiftgateDeliveryCollectFlg() { return xhasQueRlMap("bClassDtlByLiftgateDeliveryCollectFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIFTGATE_PICKUP_PREPAID_FLG, named 'BClassDtlByLiftgatePickupPrepaidFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLiftgatePickupPrepaidFlg() {
        return xdfgetConditionQueryBClassDtlByLiftgatePickupPrepaidFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLiftgatePickupPrepaidFlg() {
        String prop = "bClassDtlByLiftgatePickupPrepaidFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLiftgatePickupPrepaidFlg()); xsetupOuterJoinBClassDtlByLiftgatePickupPrepaidFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLiftgatePickupPrepaidFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByLiftgatePickupPrepaidFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLiftgatePickupPrepaidFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLiftgatePickupPrepaidFlg() { xregOutJo("bClassDtlByLiftgatePickupPrepaidFlg"); }
    public boolean hasConditionQueryBClassDtlByLiftgatePickupPrepaidFlg() { return xhasQueRlMap("bClassDtlByLiftgatePickupPrepaidFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIFTGATE_PICKUP_COLLECT_FLG, named 'BClassDtlByLiftgatePickupCollectFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLiftgatePickupCollectFlg() {
        return xdfgetConditionQueryBClassDtlByLiftgatePickupCollectFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLiftgatePickupCollectFlg() {
        String prop = "bClassDtlByLiftgatePickupCollectFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLiftgatePickupCollectFlg()); xsetupOuterJoinBClassDtlByLiftgatePickupCollectFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLiftgatePickupCollectFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByLiftgatePickupCollectFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLiftgatePickupCollectFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLiftgatePickupCollectFlg() { xregOutJo("bClassDtlByLiftgatePickupCollectFlg"); }
    public boolean hasConditionQueryBClassDtlByLiftgatePickupCollectFlg() { return xhasQueRlMap("bClassDtlByLiftgatePickupCollectFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSIDE_DELIVERY_PREPAID_FLG, named 'BClassDtlByInsideDeliveryPrepaidFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInsideDeliveryPrepaidFlg() {
        return xdfgetConditionQueryBClassDtlByInsideDeliveryPrepaidFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInsideDeliveryPrepaidFlg() {
        String prop = "bClassDtlByInsideDeliveryPrepaidFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInsideDeliveryPrepaidFlg()); xsetupOuterJoinBClassDtlByInsideDeliveryPrepaidFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInsideDeliveryPrepaidFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByInsideDeliveryPrepaidFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInsideDeliveryPrepaidFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInsideDeliveryPrepaidFlg() { xregOutJo("bClassDtlByInsideDeliveryPrepaidFlg"); }
    public boolean hasConditionQueryBClassDtlByInsideDeliveryPrepaidFlg() { return xhasQueRlMap("bClassDtlByInsideDeliveryPrepaidFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSIDE_DELIVERY_COLLECT_FLG, named 'BClassDtlByInsideDeliveryCollectFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInsideDeliveryCollectFlg() {
        return xdfgetConditionQueryBClassDtlByInsideDeliveryCollectFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInsideDeliveryCollectFlg() {
        String prop = "bClassDtlByInsideDeliveryCollectFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInsideDeliveryCollectFlg()); xsetupOuterJoinBClassDtlByInsideDeliveryCollectFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInsideDeliveryCollectFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByInsideDeliveryCollectFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInsideDeliveryCollectFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInsideDeliveryCollectFlg() { xregOutJo("bClassDtlByInsideDeliveryCollectFlg"); }
    public boolean hasConditionQueryBClassDtlByInsideDeliveryCollectFlg() { return xhasQueRlMap("bClassDtlByInsideDeliveryCollectFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSIDE_PICKUP_PREPAID_FLG, named 'BClassDtlByInsidePickupPrepaidFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInsidePickupPrepaidFlg() {
        return xdfgetConditionQueryBClassDtlByInsidePickupPrepaidFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInsidePickupPrepaidFlg() {
        String prop = "bClassDtlByInsidePickupPrepaidFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInsidePickupPrepaidFlg()); xsetupOuterJoinBClassDtlByInsidePickupPrepaidFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInsidePickupPrepaidFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByInsidePickupPrepaidFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInsidePickupPrepaidFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInsidePickupPrepaidFlg() { xregOutJo("bClassDtlByInsidePickupPrepaidFlg"); }
    public boolean hasConditionQueryBClassDtlByInsidePickupPrepaidFlg() { return xhasQueRlMap("bClassDtlByInsidePickupPrepaidFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSIDE_PICKUP_COLLECT_FLG, named 'BClassDtlByInsidePickupCollectFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInsidePickupCollectFlg() {
        return xdfgetConditionQueryBClassDtlByInsidePickupCollectFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInsidePickupCollectFlg() {
        String prop = "bClassDtlByInsidePickupCollectFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInsidePickupCollectFlg()); xsetupOuterJoinBClassDtlByInsidePickupCollectFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInsidePickupCollectFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByInsidePickupCollectFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInsidePickupCollectFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInsidePickupCollectFlg() { xregOutJo("bClassDtlByInsidePickupCollectFlg"); }
    public boolean hasConditionQueryBClassDtlByInsidePickupCollectFlg() { return xhasQueRlMap("bClassDtlByInsidePickupCollectFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_CES", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCarrierSlipCesCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCarrierSlipCesCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCarrierSlipCesCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCarrierSlipCesCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCarrierSlipCesCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCarrierSlipCesCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCarrierSlipCesCQ> _myselfExistsMap;
    public Map<String, MCarrierSlipCesCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCarrierSlipCesCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCarrierSlipCesCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCarrierSlipCesCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCarrierSlipCesCB.class.getName(); }
    protected String xCQ() { return MCarrierSlipCesCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
