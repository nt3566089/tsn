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
 * The base condition-query of T_RAKUTEN_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class BsTRakutenOrderCQ extends AbstractBsTRakutenOrderCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TRakutenOrderCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRakutenOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_RAKUTEN_ORDER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TRakutenOrderCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TRakutenOrderCIQ xcreateCIQ() {
        TRakutenOrderCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TRakutenOrderCIQ xnewCIQ() {
        return new TRakutenOrderCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_RAKUTEN_ORDER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TRakutenOrderCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TRakutenOrderCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _rakutenOrderId;
    public ConditionValue xdfgetRakutenOrderId()
    { if (_rakutenOrderId == null) { _rakutenOrderId = nCV(); }
      return _rakutenOrderId; }
    protected ConditionValue xgetCValueRakutenOrderId() { return xdfgetRakutenOrderId(); }

    /**
     * Add order-by as ascend. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RakutenOrderId_Asc() { regOBA("RAKUTEN_ORDER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RakutenOrderId_Desc() { regOBD("RAKUTEN_ORDER_ID"); return this; }

    protected ConditionValue _orderNo;
    public ConditionValue xdfgetOrderNo()
    { if (_orderNo == null) { _orderNo = nCV(); }
      return _orderNo; }
    protected ConditionValue xgetCValueOrderNo() { return xdfgetOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_NO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderNo_Asc() { regOBA("ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_NO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderNo_Desc() { regOBD("ORDER_NO"); return this; }

    protected ConditionValue _orderStatus;
    public ConditionValue xdfgetOrderStatus()
    { if (_orderStatus == null) { _orderStatus = nCV(); }
      return _orderStatus; }
    protected ConditionValue xgetCValueOrderStatus() { return xdfgetOrderStatus(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderStatus_Asc() { regOBA("ORDER_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderStatus_Desc() { regOBD("ORDER_STATUS"); return this; }

    protected ConditionValue _cardStatus;
    public ConditionValue xdfgetCardStatus()
    { if (_cardStatus == null) { _cardStatus = nCV(); }
      return _cardStatus; }
    protected ConditionValue xgetCValueCardStatus() { return xdfgetCardStatus(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardStatus_Asc() { regOBA("CARD_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardStatus_Desc() { regOBD("CARD_STATUS"); return this; }

    protected ConditionValue _paymentDt;
    public ConditionValue xdfgetPaymentDt()
    { if (_paymentDt == null) { _paymentDt = nCV(); }
      return _paymentDt; }
    protected ConditionValue xgetCValuePaymentDt() { return xdfgetPaymentDt(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PaymentDt_Asc() { regOBA("PAYMENT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PaymentDt_Desc() { regOBD("PAYMENT_DT"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _delivTz;
    public ConditionValue xdfgetDelivTz()
    { if (_delivTz == null) { _delivTz = nCV(); }
      return _delivTz; }
    protected ConditionValue xgetCValueDelivTz() { return xdfgetDelivTz(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TZ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTz_Asc() { regOBA("DELIV_TZ"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TZ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTz_Desc() { regOBD("DELIV_TZ"); return this; }

    protected ConditionValue _delivDt;
    public ConditionValue xdfgetDelivDt()
    { if (_delivDt == null) { _delivDt = nCV(); }
      return _delivDt; }
    protected ConditionValue xgetCValueDelivDt() { return xdfgetDelivDt(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivDt_Asc() { regOBA("DELIV_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivDt_Desc() { regOBD("DELIV_DT"); return this; }

    protected ConditionValue _personInCharge;
    public ConditionValue xdfgetPersonInCharge()
    { if (_personInCharge == null) { _personInCharge = nCV(); }
      return _personInCharge; }
    protected ConditionValue xgetCValuePersonInCharge() { return xdfgetPersonInCharge(); }

    /**
     * Add order-by as ascend. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PersonInCharge_Asc() { regOBA("PERSON_IN_CHARGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PersonInCharge_Desc() { regOBD("PERSON_IN_CHARGE"); return this; }

    protected ConditionValue _singleMemo;
    public ConditionValue xdfgetSingleMemo()
    { if (_singleMemo == null) { _singleMemo = nCV(); }
      return _singleMemo; }
    protected ConditionValue xgetCValueSingleMemo() { return xdfgetSingleMemo(); }

    /**
     * Add order-by as ascend. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SingleMemo_Asc() { regOBA("SINGLE_MEMO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SingleMemo_Desc() { regOBD("SINGLE_MEMO"); return this; }

    protected ConditionValue _mailInput;
    public ConditionValue xdfgetMailInput()
    { if (_mailInput == null) { _mailInput = nCV(); }
      return _mailInput; }
    protected ConditionValue xgetCValueMailInput() { return xdfgetMailInput(); }

    /**
     * Add order-by as ascend. <br>
     * MAIL_INPUT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MailInput_Asc() { regOBA("MAIL_INPUT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAIL_INPUT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MailInput_Desc() { regOBD("MAIL_INPUT"); return this; }

    protected ConditionValue _firstPayment;
    public ConditionValue xdfgetFirstPayment()
    { if (_firstPayment == null) { _firstPayment = nCV(); }
      return _firstPayment; }
    protected ConditionValue xgetCValueFirstPayment() { return xdfgetFirstPayment(); }

    /**
     * Add order-by as ascend. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_FirstPayment_Asc() { regOBA("FIRST_PAYMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_FirstPayment_Desc() { regOBD("FIRST_PAYMENT"); return this; }

    protected ConditionValue _terminal;
    public ConditionValue xdfgetTerminal()
    { if (_terminal == null) { _terminal = nCV(); }
      return _terminal; }
    protected ConditionValue xgetCValueTerminal() { return xdfgetTerminal(); }

    /**
     * Add order-by as ascend. <br>
     * TERMINAL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Terminal_Asc() { regOBA("TERMINAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TERMINAL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Terminal_Desc() { regOBD("TERMINAL"); return this; }

    protected ConditionValue _mailCarrierCd;
    public ConditionValue xdfgetMailCarrierCd()
    { if (_mailCarrierCd == null) { _mailCarrierCd = nCV(); }
      return _mailCarrierCd; }
    protected ConditionValue xgetCValueMailCarrierCd() { return xdfgetMailCarrierCd(); }

    /**
     * Add order-by as ascend. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MailCarrierCd_Asc() { regOBA("MAIL_CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MailCarrierCd_Desc() { regOBD("MAIL_CARRIER_CD"); return this; }

    protected ConditionValue _giftFlg;
    public ConditionValue xdfgetGiftFlg()
    { if (_giftFlg == null) { _giftFlg = nCV(); }
      return _giftFlg; }
    protected ConditionValue xgetCValueGiftFlg() { return xdfgetGiftFlg(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_GiftFlg_Asc() { regOBA("GIFT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_GiftFlg_Desc() { regOBD("GIFT_FLG"); return this; }

    protected ConditionValue _rakutenOrderComment;
    public ConditionValue xdfgetRakutenOrderComment()
    { if (_rakutenOrderComment == null) { _rakutenOrderComment = nCV(); }
      return _rakutenOrderComment; }
    protected ConditionValue xgetCValueRakutenOrderComment() { return xdfgetRakutenOrderComment(); }

    /**
     * Add order-by as ascend. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RakutenOrderComment_Asc() { regOBA("RAKUTEN_ORDER_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RakutenOrderComment_Desc() { regOBD("RAKUTEN_ORDER_COMMENT"); return this; }

    protected ConditionValue _orderDatetime;
    public ConditionValue xdfgetOrderDatetime()
    { if (_orderDatetime == null) { _orderDatetime = nCV(); }
      return _orderDatetime; }
    protected ConditionValue xgetCValueOrderDatetime() { return xdfgetOrderDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderDatetime_Asc() { regOBA("ORDER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderDatetime_Desc() { regOBD("ORDER_DATETIME"); return this; }

    protected ConditionValue _multiDelivFlg;
    public ConditionValue xdfgetMultiDelivFlg()
    { if (_multiDelivFlg == null) { _multiDelivFlg = nCV(); }
      return _multiDelivFlg; }
    protected ConditionValue xgetCValueMultiDelivFlg() { return xdfgetMultiDelivFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MultiDelivFlg_Asc() { regOBA("MULTI_DELIV_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MultiDelivFlg_Desc() { regOBD("MULTI_DELIV_FLG"); return this; }

    protected ConditionValue _alertFlg;
    public ConditionValue xdfgetAlertFlg()
    { if (_alertFlg == null) { _alertFlg = nCV(); }
      return _alertFlg; }
    protected ConditionValue xgetCValueAlertFlg() { return xdfgetAlertFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ALERT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_AlertFlg_Asc() { regOBA("ALERT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALERT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_AlertFlg_Desc() { regOBD("ALERT_FLG"); return this; }

    protected ConditionValue _memberFlg;
    public ConditionValue xdfgetMemberFlg()
    { if (_memberFlg == null) { _memberFlg = nCV(); }
      return _memberFlg; }
    protected ConditionValue xgetCValueMemberFlg() { return xdfgetMemberFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MemberFlg_Asc() { regOBA("MEMBER_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MemberFlg_Desc() { regOBD("MEMBER_FLG"); return this; }

    protected ConditionValue _total;
    public ConditionValue xdfgetTotal()
    { if (_total == null) { _total = nCV(); }
      return _total; }
    protected ConditionValue xgetCValueTotal() { return xdfgetTotal(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Total_Asc() { regOBA("TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Total_Desc() { regOBD("TOTAL"); return this; }

    protected ConditionValue _tax;
    public ConditionValue xdfgetTax()
    { if (_tax == null) { _tax = nCV(); }
      return _tax; }
    protected ConditionValue xgetCValueTax() { return xdfgetTax(); }

    /**
     * Add order-by as ascend. <br>
     * TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Tax_Asc() { regOBA("TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Tax_Desc() { regOBD("TAX"); return this; }

    protected ConditionValue _carriage;
    public ConditionValue xdfgetCarriage()
    { if (_carriage == null) { _carriage = nCV(); }
      return _carriage; }
    protected ConditionValue xgetCValueCarriage() { return xdfgetCarriage(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Carriage_Asc() { regOBA("CARRIAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Carriage_Desc() { regOBD("CARRIAGE"); return this; }

    protected ConditionValue _cod;
    public ConditionValue xdfgetCod()
    { if (_cod == null) { _cod = nCV(); }
      return _cod; }
    protected ConditionValue xgetCValueCod() { return xdfgetCod(); }

    /**
     * Add order-by as ascend. <br>
     * COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Cod_Asc() { regOBA("COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Cod_Desc() { regOBD("COD"); return this; }

    protected ConditionValue _amountBilled;
    public ConditionValue xdfgetAmountBilled()
    { if (_amountBilled == null) { _amountBilled = nCV(); }
      return _amountBilled; }
    protected ConditionValue xgetCValueAmountBilled() { return xdfgetAmountBilled(); }

    /**
     * Add order-by as ascend. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_AmountBilled_Asc() { regOBA("AMOUNT_BILLED"); return this; }

    /**
     * Add order-by as descend. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_AmountBilled_Desc() { regOBD("AMOUNT_BILLED"); return this; }

    protected ConditionValue _totalAmount;
    public ConditionValue xdfgetTotalAmount()
    { if (_totalAmount == null) { _totalAmount = nCV(); }
      return _totalAmount; }
    protected ConditionValue xgetCValueTotalAmount() { return xdfgetTotalAmount(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_TotalAmount_Asc() { regOBA("TOTAL_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_TotalAmount_Desc() { regOBD("TOTAL_AMOUNT"); return this; }

    protected ConditionValue _combineId;
    public ConditionValue xdfgetCombineId()
    { if (_combineId == null) { _combineId = nCV(); }
      return _combineId; }
    protected ConditionValue xgetCValueCombineId() { return xdfgetCombineId(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineId_Asc() { regOBA("COMBINE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineId_Desc() { regOBD("COMBINE_ID"); return this; }

    protected ConditionValue _combineStatus;
    public ConditionValue xdfgetCombineStatus()
    { if (_combineStatus == null) { _combineStatus = nCV(); }
      return _combineStatus; }
    protected ConditionValue xgetCValueCombineStatus() { return xdfgetCombineStatus(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineStatus_Asc() { regOBA("COMBINE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineStatus_Desc() { regOBD("COMBINE_STATUS"); return this; }

    protected ConditionValue _combineTotal;
    public ConditionValue xdfgetCombineTotal()
    { if (_combineTotal == null) { _combineTotal = nCV(); }
      return _combineTotal; }
    protected ConditionValue xgetCValueCombineTotal() { return xdfgetCombineTotal(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineTotal_Asc() { regOBA("COMBINE_TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineTotal_Desc() { regOBD("COMBINE_TOTAL"); return this; }

    protected ConditionValue _combineCarriage;
    public ConditionValue xdfgetCombineCarriage()
    { if (_combineCarriage == null) { _combineCarriage = nCV(); }
      return _combineCarriage; }
    protected ConditionValue xgetCValueCombineCarriage() { return xdfgetCombineCarriage(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineCarriage_Asc() { regOBA("COMBINE_CARRIAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineCarriage_Desc() { regOBD("COMBINE_CARRIAGE"); return this; }

    protected ConditionValue _combineCod;
    public ConditionValue xdfgetCombineCod()
    { if (_combineCod == null) { _combineCod = nCV(); }
      return _combineCod; }
    protected ConditionValue xgetCValueCombineCod() { return xdfgetCombineCod(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineCod_Asc() { regOBA("COMBINE_COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineCod_Desc() { regOBD("COMBINE_COD"); return this; }

    protected ConditionValue _combineTax;
    public ConditionValue xdfgetCombineTax()
    { if (_combineTax == null) { _combineTax = nCV(); }
      return _combineTax; }
    protected ConditionValue xgetCValueCombineTax() { return xdfgetCombineTax(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineTax_Asc() { regOBA("COMBINE_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineTax_Desc() { regOBD("COMBINE_TAX"); return this; }

    protected ConditionValue _combineBilled;
    public ConditionValue xdfgetCombineBilled()
    { if (_combineBilled == null) { _combineBilled = nCV(); }
      return _combineBilled; }
    protected ConditionValue xgetCValueCombineBilled() { return xdfgetCombineBilled(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineBilled_Asc() { regOBA("COMBINE_BILLED"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineBilled_Desc() { regOBD("COMBINE_BILLED"); return this; }

    protected ConditionValue _combineAmount;
    public ConditionValue xdfgetCombineAmount()
    { if (_combineAmount == null) { _combineAmount = nCV(); }
      return _combineAmount; }
    protected ConditionValue xgetCValueCombineAmount() { return xdfgetCombineAmount(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineAmount_Asc() { regOBA("COMBINE_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineAmount_Desc() { regOBD("COMBINE_AMOUNT"); return this; }

    protected ConditionValue _combineBankFee;
    public ConditionValue xdfgetCombineBankFee()
    { if (_combineBankFee == null) { _combineBankFee = nCV(); }
      return _combineBankFee; }
    protected ConditionValue xgetCValueCombineBankFee() { return xdfgetCombineBankFee(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineBankFee_Asc() { regOBA("COMBINE_BANK_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineBankFee_Desc() { regOBD("COMBINE_BANK_FEE"); return this; }

    protected ConditionValue _combinePointUse;
    public ConditionValue xdfgetCombinePointUse()
    { if (_combinePointUse == null) { _combinePointUse = nCV(); }
      return _combinePointUse; }
    protected ConditionValue xgetCValueCombinePointUse() { return xdfgetCombinePointUse(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombinePointUse_Asc() { regOBA("COMBINE_POINT_USE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombinePointUse_Desc() { regOBD("COMBINE_POINT_USE"); return this; }

    protected ConditionValue _mailFlg;
    public ConditionValue xdfgetMailFlg()
    { if (_mailFlg == null) { _mailFlg = nCV(); }
      return _mailFlg; }
    protected ConditionValue xgetCValueMailFlg() { return xdfgetMailFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MAIL_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MailFlg_Asc() { regOBA("MAIL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAIL_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MailFlg_Desc() { regOBD("MAIL_FLG"); return this; }

    protected ConditionValue _orderDt;
    public ConditionValue xdfgetOrderDt()
    { if (_orderDt == null) { _orderDt = nCV(); }
      return _orderDt; }
    protected ConditionValue xgetCValueOrderDt() { return xdfgetOrderDt(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderDt_Asc() { regOBA("ORDER_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderDt_Desc() { regOBD("ORDER_DT"); return this; }

    protected ConditionValue _orderTime;
    public ConditionValue xdfgetOrderTime()
    { if (_orderTime == null) { _orderTime = nCV(); }
      return _orderTime; }
    protected ConditionValue xgetCValueOrderTime() { return xdfgetOrderTime(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderTime_Asc() { regOBA("ORDER_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderTime_Desc() { regOBD("ORDER_TIME"); return this; }

    protected ConditionValue _mobilePaymentNo;
    public ConditionValue xdfgetMobilePaymentNo()
    { if (_mobilePaymentNo == null) { _mobilePaymentNo = nCV(); }
      return _mobilePaymentNo; }
    protected ConditionValue xgetCValueMobilePaymentNo() { return xdfgetMobilePaymentNo(); }

    /**
     * Add order-by as ascend. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MobilePaymentNo_Asc() { regOBA("MOBILE_PAYMENT_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MobilePaymentNo_Desc() { regOBD("MOBILE_PAYMENT_NO"); return this; }

    protected ConditionValue _historyModFlg;
    public ConditionValue xdfgetHistoryModFlg()
    { if (_historyModFlg == null) { _historyModFlg = nCV(); }
      return _historyModFlg; }
    protected ConditionValue xgetCValueHistoryModFlg() { return xdfgetHistoryModFlg(); }

    /**
     * Add order-by as ascend. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_HistoryModFlg_Asc() { regOBA("HISTORY_MOD_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_HistoryModFlg_Desc() { regOBD("HISTORY_MOD_FLG"); return this; }

    protected ConditionValue _historyIconFlg;
    public ConditionValue xdfgetHistoryIconFlg()
    { if (_historyIconFlg == null) { _historyIconFlg = nCV(); }
      return _historyIconFlg; }
    protected ConditionValue xgetCValueHistoryIconFlg() { return xdfgetHistoryIconFlg(); }

    /**
     * Add order-by as ascend. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_HistoryIconFlg_Asc() { regOBA("HISTORY_ICON_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_HistoryIconFlg_Desc() { regOBD("HISTORY_ICON_FLG"); return this; }

    protected ConditionValue _historyMailFlg;
    public ConditionValue xdfgetHistoryMailFlg()
    { if (_historyMailFlg == null) { _historyMailFlg = nCV(); }
      return _historyMailFlg; }
    protected ConditionValue xgetCValueHistoryMailFlg() { return xdfgetHistoryMailFlg(); }

    /**
     * Add order-by as ascend. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_HistoryMailFlg_Asc() { regOBA("HISTORY_MAIL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_HistoryMailFlg_Desc() { regOBD("HISTORY_MAIL_FLG"); return this; }

    protected ConditionValue _delivMatchFlg;
    public ConditionValue xdfgetDelivMatchFlg()
    { if (_delivMatchFlg == null) { _delivMatchFlg = nCV(); }
      return _delivMatchFlg; }
    protected ConditionValue xgetCValueDelivMatchFlg() { return xdfgetDelivMatchFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivMatchFlg_Asc() { regOBA("DELIV_MATCH_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivMatchFlg_Desc() { regOBD("DELIV_MATCH_FLG"); return this; }

    protected ConditionValue _pointUseFlg;
    public ConditionValue xdfgetPointUseFlg()
    { if (_pointUseFlg == null) { _pointUseFlg = nCV(); }
      return _pointUseFlg; }
    protected ConditionValue xgetCValuePointUseFlg() { return xdfgetPointUseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_USE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointUseFlg_Asc() { regOBA("POINT_USE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_USE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointUseFlg_Desc() { regOBD("POINT_USE_FLG"); return this; }

    protected ConditionValue _orderZipCd1;
    public ConditionValue xdfgetOrderZipCd1()
    { if (_orderZipCd1 == null) { _orderZipCd1 = nCV(); }
      return _orderZipCd1; }
    protected ConditionValue xgetCValueOrderZipCd1() { return xdfgetOrderZipCd1(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderZipCd1_Asc() { regOBA("ORDER_ZIP_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderZipCd1_Desc() { regOBD("ORDER_ZIP_CD1"); return this; }

    protected ConditionValue _orderZipCd2;
    public ConditionValue xdfgetOrderZipCd2()
    { if (_orderZipCd2 == null) { _orderZipCd2 = nCV(); }
      return _orderZipCd2; }
    protected ConditionValue xgetCValueOrderZipCd2() { return xdfgetOrderZipCd2(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderZipCd2_Asc() { regOBA("ORDER_ZIP_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderZipCd2_Desc() { regOBD("ORDER_ZIP_CD2"); return this; }

    protected ConditionValue _orderAddress1;
    public ConditionValue xdfgetOrderAddress1()
    { if (_orderAddress1 == null) { _orderAddress1 = nCV(); }
      return _orderAddress1; }
    protected ConditionValue xgetCValueOrderAddress1() { return xdfgetOrderAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderAddress1_Asc() { regOBA("ORDER_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderAddress1_Desc() { regOBD("ORDER_ADDRESS1"); return this; }

    protected ConditionValue _orderAddress2;
    public ConditionValue xdfgetOrderAddress2()
    { if (_orderAddress2 == null) { _orderAddress2 = nCV(); }
      return _orderAddress2; }
    protected ConditionValue xgetCValueOrderAddress2() { return xdfgetOrderAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderAddress2_Asc() { regOBA("ORDER_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderAddress2_Desc() { regOBD("ORDER_ADDRESS2"); return this; }

    protected ConditionValue _orderAddress3;
    public ConditionValue xdfgetOrderAddress3()
    { if (_orderAddress3 == null) { _orderAddress3 = nCV(); }
      return _orderAddress3; }
    protected ConditionValue xgetCValueOrderAddress3() { return xdfgetOrderAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderAddress3_Asc() { regOBA("ORDER_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderAddress3_Desc() { regOBD("ORDER_ADDRESS3"); return this; }

    protected ConditionValue _orderCustomerNm1;
    public ConditionValue xdfgetOrderCustomerNm1()
    { if (_orderCustomerNm1 == null) { _orderCustomerNm1 = nCV(); }
      return _orderCustomerNm1; }
    protected ConditionValue xgetCValueOrderCustomerNm1() { return xdfgetOrderCustomerNm1(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderCustomerNm1_Asc() { regOBA("ORDER_CUSTOMER_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderCustomerNm1_Desc() { regOBD("ORDER_CUSTOMER_NM1"); return this; }

    protected ConditionValue _orderCustomerNm2;
    public ConditionValue xdfgetOrderCustomerNm2()
    { if (_orderCustomerNm2 == null) { _orderCustomerNm2 = nCV(); }
      return _orderCustomerNm2; }
    protected ConditionValue xgetCValueOrderCustomerNm2() { return xdfgetOrderCustomerNm2(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderCustomerNm2_Asc() { regOBA("ORDER_CUSTOMER_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderCustomerNm2_Desc() { regOBD("ORDER_CUSTOMER_NM2"); return this; }

    protected ConditionValue _orderCustomerKn1;
    public ConditionValue xdfgetOrderCustomerKn1()
    { if (_orderCustomerKn1 == null) { _orderCustomerKn1 = nCV(); }
      return _orderCustomerKn1; }
    protected ConditionValue xgetCValueOrderCustomerKn1() { return xdfgetOrderCustomerKn1(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderCustomerKn1_Asc() { regOBA("ORDER_CUSTOMER_KN1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderCustomerKn1_Desc() { regOBD("ORDER_CUSTOMER_KN1"); return this; }

    protected ConditionValue _orderCustomerKn2;
    public ConditionValue xdfgetOrderCustomerKn2()
    { if (_orderCustomerKn2 == null) { _orderCustomerKn2 = nCV(); }
      return _orderCustomerKn2; }
    protected ConditionValue xgetCValueOrderCustomerKn2() { return xdfgetOrderCustomerKn2(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderCustomerKn2_Asc() { regOBA("ORDER_CUSTOMER_KN2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderCustomerKn2_Desc() { regOBD("ORDER_CUSTOMER_KN2"); return this; }

    protected ConditionValue _orderTelNo1;
    public ConditionValue xdfgetOrderTelNo1()
    { if (_orderTelNo1 == null) { _orderTelNo1 = nCV(); }
      return _orderTelNo1; }
    protected ConditionValue xgetCValueOrderTelNo1() { return xdfgetOrderTelNo1(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderTelNo1_Asc() { regOBA("ORDER_TEL_NO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderTelNo1_Desc() { regOBD("ORDER_TEL_NO1"); return this; }

    protected ConditionValue _orderTelNo2;
    public ConditionValue xdfgetOrderTelNo2()
    { if (_orderTelNo2 == null) { _orderTelNo2 = nCV(); }
      return _orderTelNo2; }
    protected ConditionValue xgetCValueOrderTelNo2() { return xdfgetOrderTelNo2(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderTelNo2_Asc() { regOBA("ORDER_TEL_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderTelNo2_Desc() { regOBD("ORDER_TEL_NO2"); return this; }

    protected ConditionValue _orderTelNo3;
    public ConditionValue xdfgetOrderTelNo3()
    { if (_orderTelNo3 == null) { _orderTelNo3 = nCV(); }
      return _orderTelNo3; }
    protected ConditionValue xgetCValueOrderTelNo3() { return xdfgetOrderTelNo3(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderTelNo3_Asc() { regOBA("ORDER_TEL_NO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderTelNo3_Desc() { regOBD("ORDER_TEL_NO3"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue xdfgetMailAddress()
    { if (_mailAddress == null) { _mailAddress = nCV(); }
      return _mailAddress; }
    protected ConditionValue xgetCValueMailAddress() { return xdfgetMailAddress(); }

    /**
     * Add order-by as ascend. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MailAddress_Asc() { regOBA("MAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_MailAddress_Desc() { regOBD("MAIL_ADDRESS"); return this; }

    protected ConditionValue _orderSex;
    public ConditionValue xdfgetOrderSex()
    { if (_orderSex == null) { _orderSex = nCV(); }
      return _orderSex; }
    protected ConditionValue xgetCValueOrderSex() { return xdfgetOrderSex(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_SEX: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderSex_Asc() { regOBA("ORDER_SEX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_SEX: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderSex_Desc() { regOBD("ORDER_SEX"); return this; }

    protected ConditionValue _orderBirthday;
    public ConditionValue xdfgetOrderBirthday()
    { if (_orderBirthday == null) { _orderBirthday = nCV(); }
      return _orderBirthday; }
    protected ConditionValue xgetCValueOrderBirthday() { return xdfgetOrderBirthday(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderBirthday_Asc() { regOBA("ORDER_BIRTHDAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderBirthday_Desc() { regOBD("ORDER_BIRTHDAY"); return this; }

    protected ConditionValue _paymentMethod;
    public ConditionValue xdfgetPaymentMethod()
    { if (_paymentMethod == null) { _paymentMethod = nCV(); }
      return _paymentMethod; }
    protected ConditionValue xgetCValuePaymentMethod() { return xdfgetPaymentMethod(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PaymentMethod_Asc() { regOBA("PAYMENT_METHOD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PaymentMethod_Desc() { regOBD("PAYMENT_METHOD"); return this; }

    protected ConditionValue _cardType;
    public ConditionValue xdfgetCardType()
    { if (_cardType == null) { _cardType = nCV(); }
      return _cardType; }
    protected ConditionValue xgetCValueCardType() { return xdfgetCardType(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_TYPE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardType_Asc() { regOBA("CARD_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_TYPE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardType_Desc() { regOBD("CARD_TYPE"); return this; }

    protected ConditionValue _cardNo;
    public ConditionValue xdfgetCardNo()
    { if (_cardNo == null) { _cardNo = nCV(); }
      return _cardNo; }
    protected ConditionValue xgetCValueCardNo() { return xdfgetCardNo(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardNo_Asc() { regOBA("CARD_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardNo_Desc() { regOBD("CARD_NO"); return this; }

    protected ConditionValue _cardNm;
    public ConditionValue xdfgetCardNm()
    { if (_cardNm == null) { _cardNm = nCV(); }
      return _cardNm; }
    protected ConditionValue xgetCValueCardNm() { return xdfgetCardNm(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardNm_Asc() { regOBA("CARD_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardNm_Desc() { regOBD("CARD_NM"); return this; }

    protected ConditionValue _cardAvailable;
    public ConditionValue xdfgetCardAvailable()
    { if (_cardAvailable == null) { _cardAvailable = nCV(); }
      return _cardAvailable; }
    protected ConditionValue xgetCValueCardAvailable() { return xdfgetCardAvailable(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardAvailable_Asc() { regOBA("CARD_AVAILABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardAvailable_Desc() { regOBD("CARD_AVAILABLE"); return this; }

    protected ConditionValue _cardInst;
    public ConditionValue xdfgetCardInst()
    { if (_cardInst == null) { _cardInst = nCV(); }
      return _cardInst; }
    protected ConditionValue xgetCValueCardInst() { return xdfgetCardInst(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_INST: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardInst_Asc() { regOBA("CARD_INST"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_INST: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardInst_Desc() { regOBD("CARD_INST"); return this; }

    protected ConditionValue _cardInstComment;
    public ConditionValue xdfgetCardInstComment()
    { if (_cardInstComment == null) { _cardInstComment = nCV(); }
      return _cardInstComment; }
    protected ConditionValue xgetCValueCardInstComment() { return xdfgetCardInstComment(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardInstComment_Asc() { regOBA("CARD_INST_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CardInstComment_Desc() { regOBD("CARD_INST_COMMENT"); return this; }

    protected ConditionValue _delivMethod;
    public ConditionValue xdfgetDelivMethod()
    { if (_delivMethod == null) { _delivMethod = nCV(); }
      return _delivMethod; }
    protected ConditionValue xgetCValueDelivMethod() { return xdfgetDelivMethod(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_METHOD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivMethod_Asc() { regOBA("DELIV_METHOD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_METHOD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivMethod_Desc() { regOBD("DELIV_METHOD"); return this; }

    protected ConditionValue _delivType;
    public ConditionValue xdfgetDelivType()
    { if (_delivType == null) { _delivType = nCV(); }
      return _delivType; }
    protected ConditionValue xgetCValueDelivType() { return xdfgetDelivType(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivType_Asc() { regOBA("DELIV_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivType_Desc() { regOBD("DELIV_TYPE"); return this; }

    protected ConditionValue _pointUse;
    public ConditionValue xdfgetPointUse()
    { if (_pointUse == null) { _pointUse = nCV(); }
      return _pointUse; }
    protected ConditionValue xgetCValuePointUse() { return xdfgetPointUse(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointUse_Asc() { regOBA("POINT_USE"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointUse_Desc() { regOBD("POINT_USE"); return this; }

    protected ConditionValue _pointCondition;
    public ConditionValue xdfgetPointCondition()
    { if (_pointCondition == null) { _pointCondition = nCV(); }
      return _pointCondition; }
    protected ConditionValue xgetCValuePointCondition() { return xdfgetPointCondition(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_CONDITION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointCondition_Asc() { regOBA("POINT_CONDITION"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_CONDITION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointCondition_Desc() { regOBD("POINT_CONDITION"); return this; }

    protected ConditionValue _pointStatus;
    public ConditionValue xdfgetPointStatus()
    { if (_pointStatus == null) { _pointStatus = nCV(); }
      return _pointStatus; }
    protected ConditionValue xgetCValuePointStatus() { return xdfgetPointStatus(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointStatus_Asc() { regOBA("POINT_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointStatus_Desc() { regOBD("POINT_STATUS"); return this; }

    protected ConditionValue _bankStatus;
    public ConditionValue xdfgetBankStatus()
    { if (_bankStatus == null) { _bankStatus = nCV(); }
      return _bankStatus; }
    protected ConditionValue xgetCValueBankStatus() { return xdfgetBankStatus(); }

    /**
     * Add order-by as ascend. <br>
     * BANK_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_BankStatus_Asc() { regOBA("BANK_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * BANK_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_BankStatus_Desc() { regOBD("BANK_STATUS"); return this; }

    protected ConditionValue _bankFeeFlg;
    public ConditionValue xdfgetBankFeeFlg()
    { if (_bankFeeFlg == null) { _bankFeeFlg = nCV(); }
      return _bankFeeFlg; }
    protected ConditionValue xgetCValueBankFeeFlg() { return xdfgetBankFeeFlg(); }

    /**
     * Add order-by as ascend. <br>
     * BANK_FEE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_BankFeeFlg_Asc() { regOBA("BANK_FEE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * BANK_FEE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_BankFeeFlg_Desc() { regOBD("BANK_FEE_FLG"); return this; }

    protected ConditionValue _bankFee;
    public ConditionValue xdfgetBankFee()
    { if (_bankFee == null) { _bankFee = nCV(); }
      return _bankFee; }
    protected ConditionValue xgetCValueBankFee() { return xdfgetBankFee(); }

    /**
     * Add order-by as ascend. <br>
     * BANK_FEE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_BankFee_Asc() { regOBA("BANK_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BANK_FEE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_BankFee_Desc() { regOBD("BANK_FEE"); return this; }

    protected ConditionValue _wrappingTitleP;
    public ConditionValue xdfgetWrappingTitleP()
    { if (_wrappingTitleP == null) { _wrappingTitleP = nCV(); }
      return _wrappingTitleP; }
    protected ConditionValue xgetCValueWrappingTitleP() { return xdfgetWrappingTitleP(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTitleP_Asc() { regOBA("WRAPPING_TITLE_P"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTitleP_Desc() { regOBD("WRAPPING_TITLE_P"); return this; }

    protected ConditionValue _wrappingNmP;
    public ConditionValue xdfgetWrappingNmP()
    { if (_wrappingNmP == null) { _wrappingNmP = nCV(); }
      return _wrappingNmP; }
    protected ConditionValue xgetCValueWrappingNmP() { return xdfgetWrappingNmP(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingNmP_Asc() { regOBA("WRAPPING_NM_P"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingNmP_Desc() { regOBD("WRAPPING_NM_P"); return this; }

    protected ConditionValue _wrappingFeeP;
    public ConditionValue xdfgetWrappingFeeP()
    { if (_wrappingFeeP == null) { _wrappingFeeP = nCV(); }
      return _wrappingFeeP; }
    protected ConditionValue xgetCValueWrappingFeeP() { return xdfgetWrappingFeeP(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingFeeP_Asc() { regOBA("WRAPPING_FEE_P"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingFeeP_Desc() { regOBD("WRAPPING_FEE_P"); return this; }

    protected ConditionValue _wrappingTaxP;
    public ConditionValue xdfgetWrappingTaxP()
    { if (_wrappingTaxP == null) { _wrappingTaxP = nCV(); }
      return _wrappingTaxP; }
    protected ConditionValue xgetCValueWrappingTaxP() { return xdfgetWrappingTaxP(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTaxP_Asc() { regOBA("WRAPPING_TAX_P"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTaxP_Desc() { regOBD("WRAPPING_TAX_P"); return this; }

    protected ConditionValue _wrappingTitleR;
    public ConditionValue xdfgetWrappingTitleR()
    { if (_wrappingTitleR == null) { _wrappingTitleR = nCV(); }
      return _wrappingTitleR; }
    protected ConditionValue xgetCValueWrappingTitleR() { return xdfgetWrappingTitleR(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTitleR_Asc() { regOBA("WRAPPING_TITLE_R"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTitleR_Desc() { regOBD("WRAPPING_TITLE_R"); return this; }

    protected ConditionValue _wrappingNmR;
    public ConditionValue xdfgetWrappingNmR()
    { if (_wrappingNmR == null) { _wrappingNmR = nCV(); }
      return _wrappingNmR; }
    protected ConditionValue xgetCValueWrappingNmR() { return xdfgetWrappingNmR(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingNmR_Asc() { regOBA("WRAPPING_NM_R"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingNmR_Desc() { regOBD("WRAPPING_NM_R"); return this; }

    protected ConditionValue _wrappingFeeR;
    public ConditionValue xdfgetWrappingFeeR()
    { if (_wrappingFeeR == null) { _wrappingFeeR = nCV(); }
      return _wrappingFeeR; }
    protected ConditionValue xgetCValueWrappingFeeR() { return xdfgetWrappingFeeR(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingFeeR_Asc() { regOBA("WRAPPING_FEE_R"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingFeeR_Desc() { regOBD("WRAPPING_FEE_R"); return this; }

    protected ConditionValue _wrappingTaxR;
    public ConditionValue xdfgetWrappingTaxR()
    { if (_wrappingTaxR == null) { _wrappingTaxR = nCV(); }
      return _wrappingTaxR; }
    protected ConditionValue xgetCValueWrappingTaxR() { return xdfgetWrappingTaxR(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTaxR_Asc() { regOBA("WRAPPING_TAX_R"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTaxR_Desc() { regOBD("WRAPPING_TAX_R"); return this; }

    protected ConditionValue _delivCarriage;
    public ConditionValue xdfgetDelivCarriage()
    { if (_delivCarriage == null) { _delivCarriage = nCV(); }
      return _delivCarriage; }
    protected ConditionValue xgetCValueDelivCarriage() { return xdfgetDelivCarriage(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCarriage_Asc() { regOBA("DELIV_CARRIAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCarriage_Desc() { regOBD("DELIV_CARRIAGE"); return this; }

    protected ConditionValue _delivCod;
    public ConditionValue xdfgetDelivCod()
    { if (_delivCod == null) { _delivCod = nCV(); }
      return _delivCod; }
    protected ConditionValue xgetCValueDelivCod() { return xdfgetDelivCod(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCod_Asc() { regOBA("DELIV_COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCod_Desc() { regOBD("DELIV_COD"); return this; }

    protected ConditionValue _delivTax;
    public ConditionValue xdfgetDelivTax()
    { if (_delivTax == null) { _delivTax = nCV(); }
      return _delivTax; }
    protected ConditionValue xgetCValueDelivTax() { return xdfgetDelivTax(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTax_Asc() { regOBA("DELIV_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTax_Desc() { regOBD("DELIV_TAX"); return this; }

    protected ConditionValue _carrierTraceNum;
    public ConditionValue xdfgetCarrierTraceNum()
    { if (_carrierTraceNum == null) { _carrierTraceNum = nCV(); }
      return _carrierTraceNum; }
    protected ConditionValue xgetCValueCarrierTraceNum() { return xdfgetCarrierTraceNum(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CarrierTraceNum_Asc() { regOBA("CARRIER_TRACE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CarrierTraceNum_Desc() { regOBD("CARRIER_TRACE_NUM"); return this; }

    protected ConditionValue _delivTotal;
    public ConditionValue xdfgetDelivTotal()
    { if (_delivTotal == null) { _delivTotal = nCV(); }
      return _delivTotal; }
    protected ConditionValue xgetCValueDelivTotal() { return xdfgetDelivTotal(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTotal_Asc() { regOBA("DELIV_TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTotal_Desc() { regOBD("DELIV_TOTAL"); return this; }

    protected ConditionValue _noshi;
    public ConditionValue xdfgetNoshi()
    { if (_noshi == null) { _noshi = nCV(); }
      return _noshi; }
    protected ConditionValue xgetCValueNoshi() { return xdfgetNoshi(); }

    /**
     * Add order-by as ascend. <br>
     * NOSHI: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Noshi_Asc() { regOBA("NOSHI"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHI: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Noshi_Desc() { regOBD("NOSHI"); return this; }

    protected ConditionValue _delivZipCd1;
    public ConditionValue xdfgetDelivZipCd1()
    { if (_delivZipCd1 == null) { _delivZipCd1 = nCV(); }
      return _delivZipCd1; }
    protected ConditionValue xgetCValueDelivZipCd1() { return xdfgetDelivZipCd1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivZipCd1_Asc() { regOBA("DELIV_ZIP_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivZipCd1_Desc() { regOBD("DELIV_ZIP_CD1"); return this; }

    protected ConditionValue _delivZipCd2;
    public ConditionValue xdfgetDelivZipCd2()
    { if (_delivZipCd2 == null) { _delivZipCd2 = nCV(); }
      return _delivZipCd2; }
    protected ConditionValue xgetCValueDelivZipCd2() { return xdfgetDelivZipCd2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivZipCd2_Asc() { regOBA("DELIV_ZIP_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivZipCd2_Desc() { regOBD("DELIV_ZIP_CD2"); return this; }

    protected ConditionValue _delivAddress1;
    public ConditionValue xdfgetDelivAddress1()
    { if (_delivAddress1 == null) { _delivAddress1 = nCV(); }
      return _delivAddress1; }
    protected ConditionValue xgetCValueDelivAddress1() { return xdfgetDelivAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivAddress1_Asc() { regOBA("DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivAddress1_Desc() { regOBD("DELIV_ADDRESS1"); return this; }

    protected ConditionValue _delivAddress2;
    public ConditionValue xdfgetDelivAddress2()
    { if (_delivAddress2 == null) { _delivAddress2 = nCV(); }
      return _delivAddress2; }
    protected ConditionValue xgetCValueDelivAddress2() { return xdfgetDelivAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivAddress2_Asc() { regOBA("DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivAddress2_Desc() { regOBD("DELIV_ADDRESS2"); return this; }

    protected ConditionValue _delivAddress3;
    public ConditionValue xdfgetDelivAddress3()
    { if (_delivAddress3 == null) { _delivAddress3 = nCV(); }
      return _delivAddress3; }
    protected ConditionValue xgetCValueDelivAddress3() { return xdfgetDelivAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivAddress3_Asc() { regOBA("DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivAddress3_Desc() { regOBD("DELIV_ADDRESS3"); return this; }

    protected ConditionValue _delivCustomerNm1;
    public ConditionValue xdfgetDelivCustomerNm1()
    { if (_delivCustomerNm1 == null) { _delivCustomerNm1 = nCV(); }
      return _delivCustomerNm1; }
    protected ConditionValue xgetCValueDelivCustomerNm1() { return xdfgetDelivCustomerNm1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCustomerNm1_Asc() { regOBA("DELIV_CUSTOMER_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCustomerNm1_Desc() { regOBD("DELIV_CUSTOMER_NM1"); return this; }

    protected ConditionValue _delivCustomerNm2;
    public ConditionValue xdfgetDelivCustomerNm2()
    { if (_delivCustomerNm2 == null) { _delivCustomerNm2 = nCV(); }
      return _delivCustomerNm2; }
    protected ConditionValue xgetCValueDelivCustomerNm2() { return xdfgetDelivCustomerNm2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCustomerNm2_Asc() { regOBA("DELIV_CUSTOMER_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCustomerNm2_Desc() { regOBD("DELIV_CUSTOMER_NM2"); return this; }

    protected ConditionValue _delivCustomerKn1;
    public ConditionValue xdfgetDelivCustomerKn1()
    { if (_delivCustomerKn1 == null) { _delivCustomerKn1 = nCV(); }
      return _delivCustomerKn1; }
    protected ConditionValue xgetCValueDelivCustomerKn1() { return xdfgetDelivCustomerKn1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCustomerKn1_Asc() { regOBA("DELIV_CUSTOMER_KN1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCustomerKn1_Desc() { regOBD("DELIV_CUSTOMER_KN1"); return this; }

    protected ConditionValue _delivCustomerKn2;
    public ConditionValue xdfgetDelivCustomerKn2()
    { if (_delivCustomerKn2 == null) { _delivCustomerKn2 = nCV(); }
      return _delivCustomerKn2; }
    protected ConditionValue xgetCValueDelivCustomerKn2() { return xdfgetDelivCustomerKn2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCustomerKn2_Asc() { regOBA("DELIV_CUSTOMER_KN2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCustomerKn2_Desc() { regOBD("DELIV_CUSTOMER_KN2"); return this; }

    protected ConditionValue _delivTelNo1;
    public ConditionValue xdfgetDelivTelNo1()
    { if (_delivTelNo1 == null) { _delivTelNo1 = nCV(); }
      return _delivTelNo1; }
    protected ConditionValue xgetCValueDelivTelNo1() { return xdfgetDelivTelNo1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTelNo1_Asc() { regOBA("DELIV_TEL_NO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTelNo1_Desc() { regOBD("DELIV_TEL_NO1"); return this; }

    protected ConditionValue _delivTelNo2;
    public ConditionValue xdfgetDelivTelNo2()
    { if (_delivTelNo2 == null) { _delivTelNo2 = nCV(); }
      return _delivTelNo2; }
    protected ConditionValue xgetCValueDelivTelNo2() { return xdfgetDelivTelNo2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTelNo2_Asc() { regOBA("DELIV_TEL_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTelNo2_Desc() { regOBD("DELIV_TEL_NO2"); return this; }

    protected ConditionValue _delivTelNo3;
    public ConditionValue xdfgetDelivTelNo3()
    { if (_delivTelNo3 == null) { _delivTelNo3 = nCV(); }
      return _delivTelNo3; }
    protected ConditionValue xgetCValueDelivTelNo3() { return xdfgetDelivTelNo3(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTelNo3_Asc() { regOBA("DELIV_TEL_NO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivTelNo3_Desc() { regOBD("DELIV_TEL_NO3"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _productNo;
    public ConditionValue xdfgetProductNo()
    { if (_productNo == null) { _productNo = nCV(); }
      return _productNo; }
    protected ConditionValue xgetCValueProductNo() { return xdfgetProductNo(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductNo_Asc() { regOBA("PRODUCT_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductNo_Desc() { regOBD("PRODUCT_NO"); return this; }

    protected ConditionValue _productUrl;
    public ConditionValue xdfgetProductUrl()
    { if (_productUrl == null) { _productUrl = nCV(); }
      return _productUrl; }
    protected ConditionValue xgetCValueProductUrl() { return xdfgetProductUrl(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_URL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductUrl_Asc() { regOBA("PRODUCT_URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_URL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductUrl_Desc() { regOBD("PRODUCT_URL"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

    protected ConditionValue _orderNum;
    public ConditionValue xdfgetOrderNum()
    { if (_orderNum == null) { _orderNum = nCV(); }
      return _orderNum; }
    protected ConditionValue xgetCValueOrderNum() { return xdfgetOrderNum(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderNum_Asc() { regOBA("ORDER_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_OrderNum_Desc() { regOBD("ORDER_NUM"); return this; }

    protected ConditionValue _productCarriage;
    public ConditionValue xdfgetProductCarriage()
    { if (_productCarriage == null) { _productCarriage = nCV(); }
      return _productCarriage; }
    protected ConditionValue xgetCValueProductCarriage() { return xdfgetProductCarriage(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductCarriage_Asc() { regOBA("PRODUCT_CARRIAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductCarriage_Desc() { regOBD("PRODUCT_CARRIAGE"); return this; }

    protected ConditionValue _productTax;
    public ConditionValue xdfgetProductTax()
    { if (_productTax == null) { _productTax = nCV(); }
      return _productTax; }
    protected ConditionValue xgetCValueProductTax() { return xdfgetProductTax(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductTax_Asc() { regOBA("PRODUCT_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductTax_Desc() { regOBD("PRODUCT_TAX"); return this; }

    protected ConditionValue _productCod;
    public ConditionValue xdfgetProductCod()
    { if (_productCod == null) { _productCod = nCV(); }
      return _productCod; }
    protected ConditionValue xgetCValueProductCod() { return xdfgetProductCod(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductCod_Asc() { regOBA("PRODUCT_COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ProductCod_Desc() { regOBD("PRODUCT_COD"); return this; }

    protected ConditionValue _itemChoice;
    public ConditionValue xdfgetItemChoice()
    { if (_itemChoice == null) { _itemChoice = nCV(); }
      return _itemChoice; }
    protected ConditionValue xgetCValueItemChoice() { return xdfgetItemChoice(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ItemChoice_Asc() { regOBA("ITEM_CHOICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ItemChoice_Desc() { regOBD("ITEM_CHOICE"); return this; }

    protected ConditionValue _pointScale;
    public ConditionValue xdfgetPointScale()
    { if (_pointScale == null) { _pointScale = nCV(); }
      return _pointScale; }
    protected ConditionValue xgetCValuePointScale() { return xdfgetPointScale(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointScale_Asc() { regOBA("POINT_SCALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointScale_Desc() { regOBD("POINT_SCALE"); return this; }

    protected ConditionValue _pointType;
    public ConditionValue xdfgetPointType()
    { if (_pointType == null) { _pointType = nCV(); }
      return _pointType; }
    protected ConditionValue xgetCValuePointType() { return xdfgetPointType(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_TYPE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointType_Asc() { regOBA("POINT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_TYPE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PointType_Desc() { regOBD("POINT_TYPE"); return this; }

    protected ConditionValue _recordNumber;
    public ConditionValue xdfgetRecordNumber()
    { if (_recordNumber == null) { _recordNumber = nCV(); }
      return _recordNumber; }
    protected ConditionValue xgetCValueRecordNumber() { return xdfgetRecordNumber(); }

    /**
     * Add order-by as ascend. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RecordNumber_Asc() { regOBA("RECORD_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RecordNumber_Desc() { regOBD("RECORD_NUMBER"); return this; }

    protected ConditionValue _deliveryInfo;
    public ConditionValue xdfgetDeliveryInfo()
    { if (_deliveryInfo == null) { _deliveryInfo = nCV(); }
      return _deliveryInfo; }
    protected ConditionValue xgetCValueDeliveryInfo() { return xdfgetDeliveryInfo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DeliveryInfo_Asc() { regOBA("DELIVERY_INFO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DeliveryInfo_Desc() { regOBD("DELIVERY_INFO"); return this; }

    protected ConditionValue _stockType;
    public ConditionValue xdfgetStockType()
    { if (_stockType == null) { _stockType = nCV(); }
      return _stockType; }
    protected ConditionValue xgetCValueStockType() { return xdfgetStockType(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_StockType_Asc() { regOBA("STOCK_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_StockType_Desc() { regOBD("STOCK_TYPE"); return this; }

    protected ConditionValue _wrappingTypeP;
    public ConditionValue xdfgetWrappingTypeP()
    { if (_wrappingTypeP == null) { _wrappingTypeP = nCV(); }
      return _wrappingTypeP; }
    protected ConditionValue xgetCValueWrappingTypeP() { return xdfgetWrappingTypeP(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTypeP_Asc() { regOBA("WRAPPING_TYPE_P"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTypeP_Desc() { regOBD("WRAPPING_TYPE_P"); return this; }

    protected ConditionValue _wrappingTypeR;
    public ConditionValue xdfgetWrappingTypeR()
    { if (_wrappingTypeR == null) { _wrappingTypeR = nCV(); }
      return _wrappingTypeR; }
    protected ConditionValue xgetCValueWrappingTypeR() { return xdfgetWrappingTypeR(); }

    /**
     * Add order-by as ascend. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTypeR_Asc() { regOBA("WRAPPING_TYPE_R"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_WrappingTypeR_Desc() { regOBD("WRAPPING_TYPE_R"); return this; }

    protected ConditionValue _tomorrowFlg;
    public ConditionValue xdfgetTomorrowFlg()
    { if (_tomorrowFlg == null) { _tomorrowFlg = nCV(); }
      return _tomorrowFlg; }
    protected ConditionValue xgetCValueTomorrowFlg() { return xdfgetTomorrowFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_TomorrowFlg_Asc() { regOBA("TOMORROW_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_TomorrowFlg_Desc() { regOBD("TOMORROW_FLG"); return this; }

    protected ConditionValue _couponUse;
    public ConditionValue xdfgetCouponUse()
    { if (_couponUse == null) { _couponUse = nCV(); }
      return _couponUse; }
    protected ConditionValue xgetCValueCouponUse() { return xdfgetCouponUse(); }

    /**
     * Add order-by as ascend. <br>
     * COUPON_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CouponUse_Asc() { regOBA("COUPON_USE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUPON_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CouponUse_Desc() { regOBD("COUPON_USE"); return this; }

    protected ConditionValue _shopCouponUse;
    public ConditionValue xdfgetShopCouponUse()
    { if (_shopCouponUse == null) { _shopCouponUse = nCV(); }
      return _shopCouponUse; }
    protected ConditionValue xgetCValueShopCouponUse() { return xdfgetShopCouponUse(); }

    /**
     * Add order-by as ascend. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ShopCouponUse_Asc() { regOBA("SHOP_COUPON_USE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ShopCouponUse_Desc() { regOBD("SHOP_COUPON_USE"); return this; }

    protected ConditionValue _rakutenCouponUse;
    public ConditionValue xdfgetRakutenCouponUse()
    { if (_rakutenCouponUse == null) { _rakutenCouponUse = nCV(); }
      return _rakutenCouponUse; }
    protected ConditionValue xgetCValueRakutenCouponUse() { return xdfgetRakutenCouponUse(); }

    /**
     * Add order-by as ascend. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RakutenCouponUse_Asc() { regOBA("RAKUTEN_COUPON_USE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RakutenCouponUse_Desc() { regOBD("RAKUTEN_COUPON_USE"); return this; }

    protected ConditionValue _combineCouponUse;
    public ConditionValue xdfgetCombineCouponUse()
    { if (_combineCouponUse == null) { _combineCouponUse = nCV(); }
      return _combineCouponUse; }
    protected ConditionValue xgetCValueCombineCouponUse() { return xdfgetCombineCouponUse(); }

    /**
     * Add order-by as ascend. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineCouponUse_Asc() { regOBA("COMBINE_COUPON_USE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_CombineCouponUse_Desc() { regOBD("COMBINE_COUPON_USE"); return this; }

    protected ConditionValue _delivCompany;
    public ConditionValue xdfgetDelivCompany()
    { if (_delivCompany == null) { _delivCompany = nCV(); }
      return _delivCompany; }
    protected ConditionValue xgetCValueDelivCompany() { return xdfgetDelivCompany(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCompany_Asc() { regOBA("DELIV_COMPANY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelivCompany_Desc() { regOBD("DELIV_COMPANY"); return this; }

    protected ConditionValue _phamaceFlg;
    public ConditionValue xdfgetPhamaceFlg()
    { if (_phamaceFlg == null) { _phamaceFlg = nCV(); }
      return _phamaceFlg; }
    protected ConditionValue xgetCValuePhamaceFlg() { return xdfgetPhamaceFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PHAMACE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PhamaceFlg_Asc() { regOBA("PHAMACE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHAMACE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PhamaceFlg_Desc() { regOBD("PHAMACE_FLG"); return this; }

    protected ConditionValue _packingQty;
    public ConditionValue xdfgetPackingQty()
    { if (_packingQty == null) { _packingQty = nCV(); }
      return _packingQty; }
    protected ConditionValue xgetCValuePackingQty() { return xdfgetPackingQty(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PackingQty_Asc() { regOBA("PACKING_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_PackingQty_Desc() { regOBD("PACKING_QTY"); return this; }

    protected ConditionValue _slipItemNm1;
    public ConditionValue xdfgetSlipItemNm1()
    { if (_slipItemNm1 == null) { _slipItemNm1 = nCV(); }
      return _slipItemNm1; }
    protected ConditionValue xgetCValueSlipItemNm1() { return xdfgetSlipItemNm1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm1_Asc() { regOBA("SLIP_ITEM_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm1_Desc() { regOBD("SLIP_ITEM_NM1"); return this; }

    protected ConditionValue _slipItemNm2;
    public ConditionValue xdfgetSlipItemNm2()
    { if (_slipItemNm2 == null) { _slipItemNm2 = nCV(); }
      return _slipItemNm2; }
    protected ConditionValue xgetCValueSlipItemNm2() { return xdfgetSlipItemNm2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm2_Asc() { regOBA("SLIP_ITEM_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm2_Desc() { regOBD("SLIP_ITEM_NM2"); return this; }

    protected ConditionValue _slipItemNm3;
    public ConditionValue xdfgetSlipItemNm3()
    { if (_slipItemNm3 == null) { _slipItemNm3 = nCV(); }
      return _slipItemNm3; }
    protected ConditionValue xgetCValueSlipItemNm3() { return xdfgetSlipItemNm3(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm3_Asc() { regOBA("SLIP_ITEM_NM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm3_Desc() { regOBD("SLIP_ITEM_NM3"); return this; }

    protected ConditionValue _slipItemNm4;
    public ConditionValue xdfgetSlipItemNm4()
    { if (_slipItemNm4 == null) { _slipItemNm4 = nCV(); }
      return _slipItemNm4; }
    protected ConditionValue xgetCValueSlipItemNm4() { return xdfgetSlipItemNm4(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm4_Asc() { regOBA("SLIP_ITEM_NM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm4_Desc() { regOBD("SLIP_ITEM_NM4"); return this; }

    protected ConditionValue _slipItemNm5;
    public ConditionValue xdfgetSlipItemNm5()
    { if (_slipItemNm5 == null) { _slipItemNm5 = nCV(); }
      return _slipItemNm5; }
    protected ConditionValue xgetCValueSlipItemNm5() { return xdfgetSlipItemNm5(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm5_Asc() { regOBA("SLIP_ITEM_NM5"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemNm5_Desc() { regOBD("SLIP_ITEM_NM5"); return this; }

    protected ConditionValue _slipItemCd1;
    public ConditionValue xdfgetSlipItemCd1()
    { if (_slipItemCd1 == null) { _slipItemCd1 = nCV(); }
      return _slipItemCd1; }
    protected ConditionValue xgetCValueSlipItemCd1() { return xdfgetSlipItemCd1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemCd1_Asc() { regOBA("SLIP_ITEM_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemCd1_Desc() { regOBD("SLIP_ITEM_CD1"); return this; }

    protected ConditionValue _slipItemCd2;
    public ConditionValue xdfgetSlipItemCd2()
    { if (_slipItemCd2 == null) { _slipItemCd2 = nCV(); }
      return _slipItemCd2; }
    protected ConditionValue xgetCValueSlipItemCd2() { return xdfgetSlipItemCd2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemCd2_Asc() { regOBA("SLIP_ITEM_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_SlipItemCd2_Desc() { regOBD("SLIP_ITEM_CD2"); return this; }

    protected ConditionValue _freightHandling1;
    public ConditionValue xdfgetFreightHandling1()
    { if (_freightHandling1 == null) { _freightHandling1 = nCV(); }
      return _freightHandling1; }
    protected ConditionValue xgetCValueFreightHandling1() { return xdfgetFreightHandling1(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_FreightHandling1_Asc() { regOBA("FREIGHT_HANDLING1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_FreightHandling1_Desc() { regOBD("FREIGHT_HANDLING1"); return this; }

    protected ConditionValue _freightHandling2;
    public ConditionValue xdfgetFreightHandling2()
    { if (_freightHandling2 == null) { _freightHandling2 = nCV(); }
      return _freightHandling2; }
    protected ConditionValue xgetCValueFreightHandling2() { return xdfgetFreightHandling2(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_FreightHandling2_Asc() { regOBA("FREIGHT_HANDLING2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_FreightHandling2_Desc() { regOBD("FREIGHT_HANDLING2"); return this; }

    protected ConditionValue _article;
    public ConditionValue xdfgetArticle()
    { if (_article == null) { _article = nCV(); }
      return _article; }
    protected ConditionValue xgetCValueArticle() { return xdfgetArticle(); }

    /**
     * Add order-by as ascend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Article_Asc() { regOBA("ARTICLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_Article_Desc() { regOBD("ARTICLE"); return this; }

    protected ConditionValue _receiveId;
    public ConditionValue xdfgetReceiveId()
    { if (_receiveId == null) { _receiveId = nCV(); }
      return _receiveId; }
    protected ConditionValue xgetCValueReceiveId() { return xdfgetReceiveId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ReceiveId_Asc() { regOBA("RECEIVE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ReceiveId_Desc() { regOBD("RECEIVE_ID"); return this; }

    protected ConditionValue _rowNo;
    public ConditionValue xdfgetRowNo()
    { if (_rowNo == null) { _rowNo = nCV(); }
      return _rowNo; }
    protected ConditionValue xgetCValueRowNo() { return xdfgetRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * ROW_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _importTypeId;
    public ConditionValue xdfgetImportTypeId()
    { if (_importTypeId == null) { _importTypeId = nCV(); }
      return _importTypeId; }
    protected ConditionValue xgetCValueImportTypeId() { return xdfgetImportTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ImportTypeId_Asc() { regOBA("IMPORT_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ImportTypeId_Desc() { regOBD("IMPORT_TYPE_ID"); return this; }

    protected ConditionValue _ecOrderBId;
    public ConditionValue xdfgetEcOrderBId()
    { if (_ecOrderBId == null) { _ecOrderBId = nCV(); }
      return _ecOrderBId; }
    protected ConditionValue xgetCValueEcOrderBId() { return xdfgetEcOrderBId(); }

    public Map<String, TEcOrderBCQ> getEcOrderBId_InScopeRelation_TEcOrderB() { return xgetSQueMap("ecOrderBId_InScopeRelation_TEcOrderB"); }
    public String keepEcOrderBId_InScopeRelation_TEcOrderB(TEcOrderBCQ sq) { return xkeepSQue("ecOrderBId_InScopeRelation_TEcOrderB", sq); }

    public Map<String, TEcOrderBCQ> getEcOrderBId_NotInScopeRelation_TEcOrderB() { return xgetSQueMap("ecOrderBId_NotInScopeRelation_TEcOrderB"); }
    public String keepEcOrderBId_NotInScopeRelation_TEcOrderB(TEcOrderBCQ sq) { return xkeepSQue("ecOrderBId_NotInScopeRelation_TEcOrderB", sq); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_EcOrderBId_Asc() { regOBA("EC_ORDER_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_EcOrderBId_Desc() { regOBD("EC_ORDER_B_ID"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTRakutenOrderCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTRakutenOrderCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTRakutenOrderCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTRakutenOrderCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTRakutenOrderCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTRakutenOrderCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTRakutenOrderCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTRakutenOrderCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTRakutenOrderCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTRakutenOrderCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTRakutenOrderCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TRakutenOrderCQ bq = (TRakutenOrderCQ)bqs;
        TRakutenOrderCQ uq = (TRakutenOrderCQ)uqs;
        if (bq.hasConditionQueryTEcOrderB()) {
            uq.queryTEcOrderB().reflectRelationOnUnionQuery(bq.queryTEcOrderB(), uq.queryTEcOrderB());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TEcOrderBCQ queryTEcOrderB() {
        return xdfgetConditionQueryTEcOrderB();
    }
    public TEcOrderBCQ xdfgetConditionQueryTEcOrderB() {
        String prop = "tEcOrderB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTEcOrderB()); xsetupOuterJoinTEcOrderB(); }
        return xgetQueRlMap(prop);
    }
    protected TEcOrderBCQ xcreateQueryTEcOrderB() {
        String nrp = xresolveNRP("T_RAKUTEN_ORDER", "tEcOrderB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TEcOrderBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tEcOrderB", nrp);
    }
    protected void xsetupOuterJoinTEcOrderB() { xregOutJo("tEcOrderB"); }
    public boolean hasConditionQueryTEcOrderB() { return xhasQueRlMap("tEcOrderB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TRakutenOrderCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TRakutenOrderCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TRakutenOrderCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TRakutenOrderCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TRakutenOrderCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TRakutenOrderCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TRakutenOrderCQ> _myselfExistsMap;
    public Map<String, TRakutenOrderCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TRakutenOrderCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TRakutenOrderCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TRakutenOrderCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TRakutenOrderCB.class.getName(); }
    protected String xCQ() { return TRakutenOrderCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
