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
 * The base condition-query of T_EC_ORDER_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTEcOrderHCQ extends AbstractBsTEcOrderHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TEcOrderHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcOrderHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_EC_ORDER_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TEcOrderHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TEcOrderHCIQ xcreateCIQ() {
        TEcOrderHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TEcOrderHCIQ xnewCIQ() {
        return new TEcOrderHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_EC_ORDER_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TEcOrderHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TEcOrderHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ecOrderHId;
    public ConditionValue xdfgetEcOrderHId()
    { if (_ecOrderHId == null) { _ecOrderHId = nCV(); }
      return _ecOrderHId; }
    protected ConditionValue xgetCValueEcOrderHId() { return xdfgetEcOrderHId(); }

    public Map<String, TEcOrderBCQ> xdfgetEcOrderHId_ExistsReferrer_TEcOrderBList() { return xgetSQueMap("ecOrderHId_ExistsReferrer_TEcOrderBList"); }
    public String keepEcOrderHId_ExistsReferrer_TEcOrderBList(TEcOrderBCQ sq) { return xkeepSQue("ecOrderHId_ExistsReferrer_TEcOrderBList", sq); }

    public Map<String, TEcOrderRCQ> xdfgetEcOrderHId_ExistsReferrer_TEcOrderRAsOne() { return xgetSQueMap("ecOrderHId_ExistsReferrer_TEcOrderRAsOne"); }
    public String keepEcOrderHId_ExistsReferrer_TEcOrderRAsOne(TEcOrderRCQ sq) { return xkeepSQue("ecOrderHId_ExistsReferrer_TEcOrderRAsOne", sq); }

    public Map<String, TEcOrderBCQ> xdfgetEcOrderHId_NotExistsReferrer_TEcOrderBList() { return xgetSQueMap("ecOrderHId_NotExistsReferrer_TEcOrderBList"); }
    public String keepEcOrderHId_NotExistsReferrer_TEcOrderBList(TEcOrderBCQ sq) { return xkeepSQue("ecOrderHId_NotExistsReferrer_TEcOrderBList", sq); }

    public Map<String, TEcOrderRCQ> xdfgetEcOrderHId_NotExistsReferrer_TEcOrderRAsOne() { return xgetSQueMap("ecOrderHId_NotExistsReferrer_TEcOrderRAsOne"); }
    public String keepEcOrderHId_NotExistsReferrer_TEcOrderRAsOne(TEcOrderRCQ sq) { return xkeepSQue("ecOrderHId_NotExistsReferrer_TEcOrderRAsOne", sq); }

    public Map<String, TEcOrderBCQ> xdfgetEcOrderHId_SpecifyDerivedReferrer_TEcOrderBList() { return xgetSQueMap("ecOrderHId_SpecifyDerivedReferrer_TEcOrderBList"); }
    public String keepEcOrderHId_SpecifyDerivedReferrer_TEcOrderBList(TEcOrderBCQ sq) { return xkeepSQue("ecOrderHId_SpecifyDerivedReferrer_TEcOrderBList", sq); }

    public Map<String, TEcOrderBCQ> xdfgetEcOrderHId_QueryDerivedReferrer_TEcOrderBList() { return xgetSQueMap("ecOrderHId_QueryDerivedReferrer_TEcOrderBList"); }
    public String keepEcOrderHId_QueryDerivedReferrer_TEcOrderBList(TEcOrderBCQ sq) { return xkeepSQue("ecOrderHId_QueryDerivedReferrer_TEcOrderBList", sq); }
    public Map<String, Object> xdfgetEcOrderHId_QueryDerivedReferrer_TEcOrderBListParameter() { return xgetSQuePmMap("ecOrderHId_QueryDerivedReferrer_TEcOrderBList"); }
    public String keepEcOrderHId_QueryDerivedReferrer_TEcOrderBListParameter(Object pm) { return xkeepSQuePm("ecOrderHId_QueryDerivedReferrer_TEcOrderBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_EcOrderHId_Asc() { regOBA("EC_ORDER_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_EcOrderHId_Desc() { regOBD("EC_ORDER_H_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _importDt;
    public ConditionValue xdfgetImportDt()
    { if (_importDt == null) { _importDt = nCV(); }
      return _importDt; }
    protected ConditionValue xgetCValueImportDt() { return xdfgetImportDt(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ImportDt_Asc() { regOBA("IMPORT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ImportDt_Desc() { regOBD("IMPORT_DT"); return this; }

    protected ConditionValue _orderNo;
    public ConditionValue xdfgetOrderNo()
    { if (_orderNo == null) { _orderNo = nCV(); }
      return _orderNo; }
    protected ConditionValue xgetCValueOrderNo() { return xdfgetOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderNo_Asc() { regOBA("ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_NO: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderNo_Desc() { regOBD("ORDER_NO"); return this; }

    protected ConditionValue _priorityFlg;
    public ConditionValue xdfgetPriorityFlg()
    { if (_priorityFlg == null) { _priorityFlg = nCV(); }
      return _priorityFlg; }
    protected ConditionValue xgetCValuePriorityFlg() { return xdfgetPriorityFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_PriorityFlg_Asc() { regOBA("PRIORITY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_PriorityFlg_Desc() { regOBD("PRIORITY_FLG"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_OrderDt_Asc() { regOBA("ORDER_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderDt_Desc() { regOBD("ORDER_DT"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_OrderTime_Asc() { regOBA("ORDER_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderTime_Desc() { regOBD("ORDER_TIME"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelivDt_Asc() { regOBA("DELIV_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_DT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivDt_Desc() { regOBD("DELIV_DT"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelivTz_Asc() { regOBA("DELIV_TZ"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TZ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivTz_Desc() { regOBD("DELIV_TZ"); return this; }

    protected ConditionValue _comment1;
    public ConditionValue xdfgetComment1()
    { if (_comment1 == null) { _comment1 = nCV(); }
      return _comment1; }
    protected ConditionValue xgetCValueComment1() { return xdfgetComment1(); }

    /**
     * Add order-by as ascend. <br>
     * COMMENT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Comment1_Asc() { regOBA("COMMENT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMENT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Comment1_Desc() { regOBD("COMMENT1"); return this; }

    protected ConditionValue _comment2;
    public ConditionValue xdfgetComment2()
    { if (_comment2 == null) { _comment2 = nCV(); }
      return _comment2; }
    protected ConditionValue xgetCValueComment2() { return xdfgetComment2(); }

    /**
     * Add order-by as ascend. <br>
     * COMMENT2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Comment2_Asc() { regOBA("COMMENT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMENT2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Comment2_Desc() { regOBD("COMMENT2"); return this; }

    protected ConditionValue _giftFlg;
    public ConditionValue xdfgetGiftFlg()
    { if (_giftFlg == null) { _giftFlg = nCV(); }
      return _giftFlg; }
    protected ConditionValue xgetCValueGiftFlg() { return xdfgetGiftFlg(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_GiftFlg_Asc() { regOBA("GIFT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_GiftFlg_Desc() { regOBD("GIFT_FLG"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_Noshi_Asc() { regOBA("NOSHI"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHI: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Noshi_Desc() { regOBD("NOSHI"); return this; }

    protected ConditionValue _orderZipCd;
    public ConditionValue xdfgetOrderZipCd()
    { if (_orderZipCd == null) { _orderZipCd = nCV(); }
      return _orderZipCd; }
    protected ConditionValue xgetCValueOrderZipCd() { return xdfgetOrderZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderZipCd_Asc() { regOBA("ORDER_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderZipCd_Desc() { regOBD("ORDER_ZIP_CD"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_OrderAddress1_Asc() { regOBA("ORDER_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderAddress1_Desc() { regOBD("ORDER_ADDRESS1"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_OrderAddress2_Asc() { regOBA("ORDER_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderAddress2_Desc() { regOBD("ORDER_ADDRESS2"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_OrderAddress3_Asc() { regOBA("ORDER_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderAddress3_Desc() { regOBD("ORDER_ADDRESS3"); return this; }

    protected ConditionValue _orderCustomerNm;
    public ConditionValue xdfgetOrderCustomerNm()
    { if (_orderCustomerNm == null) { _orderCustomerNm = nCV(); }
      return _orderCustomerNm; }
    protected ConditionValue xgetCValueOrderCustomerNm() { return xdfgetOrderCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderCustomerNm_Asc() { regOBA("ORDER_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderCustomerNm_Desc() { regOBD("ORDER_CUSTOMER_NM"); return this; }

    protected ConditionValue _orderCustomerNmKana;
    public ConditionValue xdfgetOrderCustomerNmKana()
    { if (_orderCustomerNmKana == null) { _orderCustomerNmKana = nCV(); }
      return _orderCustomerNmKana; }
    protected ConditionValue xgetCValueOrderCustomerNmKana() { return xdfgetOrderCustomerNmKana(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderCustomerNmKana_Asc() { regOBA("ORDER_CUSTOMER_NM_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderCustomerNmKana_Desc() { regOBD("ORDER_CUSTOMER_NM_KANA"); return this; }

    protected ConditionValue _orderTelNo;
    public ConditionValue xdfgetOrderTelNo()
    { if (_orderTelNo == null) { _orderTelNo = nCV(); }
      return _orderTelNo; }
    protected ConditionValue xgetCValueOrderTelNo() { return xdfgetOrderTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderTelNo_Asc() { regOBA("ORDER_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OrderTelNo_Desc() { regOBD("ORDER_TEL_NO"); return this; }

    protected ConditionValue _delivMatchFlg;
    public ConditionValue xdfgetDelivMatchFlg()
    { if (_delivMatchFlg == null) { _delivMatchFlg = nCV(); }
      return _delivMatchFlg; }
    protected ConditionValue xgetCValueDelivMatchFlg() { return xdfgetDelivMatchFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivMatchFlg_Asc() { regOBA("DELIV_MATCH_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivMatchFlg_Desc() { regOBD("DELIV_MATCH_FLG"); return this; }

    protected ConditionValue _mergeId;
    public ConditionValue xdfgetMergeId()
    { if (_mergeId == null) { _mergeId = nCV(); }
      return _mergeId; }
    protected ConditionValue xgetCValueMergeId() { return xdfgetMergeId(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeId_Asc() { regOBA("MERGE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_ID: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeId_Desc() { regOBD("MERGE_ID"); return this; }

    protected ConditionValue _mergeStatus;
    public ConditionValue xdfgetMergeStatus()
    { if (_mergeStatus == null) { _mergeStatus = nCV(); }
      return _mergeStatus; }
    protected ConditionValue xgetCValueMergeStatus() { return xdfgetMergeStatus(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeStatus_Asc() { regOBA("MERGE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeStatus_Desc() { regOBD("MERGE_STATUS"); return this; }

    protected ConditionValue _delivZipCd;
    public ConditionValue xdfgetDelivZipCd()
    { if (_delivZipCd == null) { _delivZipCd = nCV(); }
      return _delivZipCd; }
    protected ConditionValue xgetCValueDelivZipCd() { return xdfgetDelivZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivZipCd_Asc() { regOBA("DELIV_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivZipCd_Desc() { regOBD("DELIV_ZIP_CD"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelivAddress1_Asc() { regOBA("DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivAddress1_Desc() { regOBD("DELIV_ADDRESS1"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelivAddress2_Asc() { regOBA("DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivAddress2_Desc() { regOBD("DELIV_ADDRESS2"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelivAddress3_Asc() { regOBA("DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivAddress3_Desc() { regOBD("DELIV_ADDRESS3"); return this; }

    protected ConditionValue _invoiceDelivAddress1;
    public ConditionValue xdfgetInvoiceDelivAddress1()
    { if (_invoiceDelivAddress1 == null) { _invoiceDelivAddress1 = nCV(); }
      return _invoiceDelivAddress1; }
    protected ConditionValue xgetCValueInvoiceDelivAddress1() { return xdfgetInvoiceDelivAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_InvoiceDelivAddress1_Asc() { regOBA("INVOICE_DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_InvoiceDelivAddress1_Desc() { regOBD("INVOICE_DELIV_ADDRESS1"); return this; }

    protected ConditionValue _invoiceDelivAddress2;
    public ConditionValue xdfgetInvoiceDelivAddress2()
    { if (_invoiceDelivAddress2 == null) { _invoiceDelivAddress2 = nCV(); }
      return _invoiceDelivAddress2; }
    protected ConditionValue xgetCValueInvoiceDelivAddress2() { return xdfgetInvoiceDelivAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_InvoiceDelivAddress2_Asc() { regOBA("INVOICE_DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_InvoiceDelivAddress2_Desc() { regOBD("INVOICE_DELIV_ADDRESS2"); return this; }

    protected ConditionValue _invoiceDelivAddress3;
    public ConditionValue xdfgetInvoiceDelivAddress3()
    { if (_invoiceDelivAddress3 == null) { _invoiceDelivAddress3 = nCV(); }
      return _invoiceDelivAddress3; }
    protected ConditionValue xgetCValueInvoiceDelivAddress3() { return xdfgetInvoiceDelivAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_InvoiceDelivAddress3_Asc() { regOBA("INVOICE_DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_InvoiceDelivAddress3_Desc() { regOBD("INVOICE_DELIV_ADDRESS3"); return this; }

    protected ConditionValue _delivCustomerNm;
    public ConditionValue xdfgetDelivCustomerNm()
    { if (_delivCustomerNm == null) { _delivCustomerNm = nCV(); }
      return _delivCustomerNm; }
    protected ConditionValue xgetCValueDelivCustomerNm() { return xdfgetDelivCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivCustomerNm_Asc() { regOBA("DELIV_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivCustomerNm_Desc() { regOBD("DELIV_CUSTOMER_NM"); return this; }

    protected ConditionValue _delivCustomerNmKana;
    public ConditionValue xdfgetDelivCustomerNmKana()
    { if (_delivCustomerNmKana == null) { _delivCustomerNmKana = nCV(); }
      return _delivCustomerNmKana; }
    protected ConditionValue xgetCValueDelivCustomerNmKana() { return xdfgetDelivCustomerNmKana(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivCustomerNmKana_Asc() { regOBA("DELIV_CUSTOMER_NM_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivCustomerNmKana_Desc() { regOBD("DELIV_CUSTOMER_NM_KANA"); return this; }

    protected ConditionValue _delivTelNo;
    public ConditionValue xdfgetDelivTelNo()
    { if (_delivTelNo == null) { _delivTelNo = nCV(); }
      return _delivTelNo; }
    protected ConditionValue xgetCValueDelivTelNo() { return xdfgetDelivTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivTelNo_Asc() { regOBA("DELIV_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivTelNo_Desc() { regOBD("DELIV_TEL_NO"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelivMethod_Asc() { regOBA("DELIV_METHOD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_METHOD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivMethod_Desc() { regOBD("DELIV_METHOD"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelivType_Asc() { regOBA("DELIV_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivType_Desc() { regOBD("DELIV_TYPE"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelivCompany_Asc() { regOBA("DELIV_COMPANY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelivCompany_Desc() { regOBD("DELIV_COMPANY"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_PaymentMethod_Asc() { regOBA("PAYMENT_METHOD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_PaymentMethod_Desc() { regOBD("PAYMENT_METHOD"); return this; }

    protected ConditionValue _cardType;
    public ConditionValue xdfgetCardType()
    { if (_cardType == null) { _cardType = nCV(); }
      return _cardType; }
    protected ConditionValue xgetCValueCardType() { return xdfgetCardType(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_CardType_Asc() { regOBA("CARD_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_CardType_Desc() { regOBD("CARD_TYPE"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_Total_Asc() { regOBA("TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Total_Desc() { regOBD("TOTAL"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_Tax_Asc() { regOBA("TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Tax_Desc() { regOBD("TAX"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_Carriage_Asc() { regOBA("CARRIAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Carriage_Desc() { regOBD("CARRIAGE"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_Cod_Asc() { regOBA("COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Cod_Desc() { regOBD("COD"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_TotalAmount_Asc() { regOBA("TOTAL_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_TotalAmount_Desc() { regOBD("TOTAL_AMOUNT"); return this; }

    protected ConditionValue _couponDiscount;
    public ConditionValue xdfgetCouponDiscount()
    { if (_couponDiscount == null) { _couponDiscount = nCV(); }
      return _couponDiscount; }
    protected ConditionValue xgetCValueCouponDiscount() { return xdfgetCouponDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_CouponDiscount_Asc() { regOBA("COUPON_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_CouponDiscount_Desc() { regOBD("COUPON_DISCOUNT"); return this; }

    protected ConditionValue _pointDiscount;
    public ConditionValue xdfgetPointDiscount()
    { if (_pointDiscount == null) { _pointDiscount = nCV(); }
      return _pointDiscount; }
    protected ConditionValue xgetCValuePointDiscount() { return xdfgetPointDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_PointDiscount_Asc() { regOBA("POINT_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_PointDiscount_Desc() { regOBD("POINT_DISCOUNT"); return this; }

    protected ConditionValue _otherDiscount;
    public ConditionValue xdfgetOtherDiscount()
    { if (_otherDiscount == null) { _otherDiscount = nCV(); }
      return _otherDiscount; }
    protected ConditionValue xgetCValueOtherDiscount() { return xdfgetOtherDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OtherDiscount_Asc() { regOBA("OTHER_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_OtherDiscount_Desc() { regOBD("OTHER_DISCOUNT"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_AmountBilled_Asc() { regOBA("AMOUNT_BILLED"); return this; }

    /**
     * Add order-by as descend. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_AmountBilled_Desc() { regOBD("AMOUNT_BILLED"); return this; }

    protected ConditionValue _mergeTotal;
    public ConditionValue xdfgetMergeTotal()
    { if (_mergeTotal == null) { _mergeTotal = nCV(); }
      return _mergeTotal; }
    protected ConditionValue xgetCValueMergeTotal() { return xdfgetMergeTotal(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeTotal_Asc() { regOBA("MERGE_TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeTotal_Desc() { regOBD("MERGE_TOTAL"); return this; }

    protected ConditionValue _mergeCarriage;
    public ConditionValue xdfgetMergeCarriage()
    { if (_mergeCarriage == null) { _mergeCarriage = nCV(); }
      return _mergeCarriage; }
    protected ConditionValue xgetCValueMergeCarriage() { return xdfgetMergeCarriage(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeCarriage_Asc() { regOBA("MERGE_CARRIAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_CARRIAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeCarriage_Desc() { regOBD("MERGE_CARRIAGE"); return this; }

    protected ConditionValue _mergeCod;
    public ConditionValue xdfgetMergeCod()
    { if (_mergeCod == null) { _mergeCod = nCV(); }
      return _mergeCod; }
    protected ConditionValue xgetCValueMergeCod() { return xdfgetMergeCod(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeCod_Asc() { regOBA("MERGE_COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeCod_Desc() { regOBD("MERGE_COD"); return this; }

    protected ConditionValue _mergeTax;
    public ConditionValue xdfgetMergeTax()
    { if (_mergeTax == null) { _mergeTax = nCV(); }
      return _mergeTax; }
    protected ConditionValue xgetCValueMergeTax() { return xdfgetMergeTax(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeTax_Asc() { regOBA("MERGE_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeTax_Desc() { regOBD("MERGE_TAX"); return this; }

    protected ConditionValue _mergeAmountBilled;
    public ConditionValue xdfgetMergeAmountBilled()
    { if (_mergeAmountBilled == null) { _mergeAmountBilled = nCV(); }
      return _mergeAmountBilled; }
    protected ConditionValue xgetCValueMergeAmountBilled() { return xdfgetMergeAmountBilled(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeAmountBilled_Asc() { regOBA("MERGE_AMOUNT_BILLED"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeAmountBilled_Desc() { regOBD("MERGE_AMOUNT_BILLED"); return this; }

    protected ConditionValue _mergeTotalAmount;
    public ConditionValue xdfgetMergeTotalAmount()
    { if (_mergeTotalAmount == null) { _mergeTotalAmount = nCV(); }
      return _mergeTotalAmount; }
    protected ConditionValue xgetCValueMergeTotalAmount() { return xdfgetMergeTotalAmount(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeTotalAmount_Asc() { regOBA("MERGE_TOTAL_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeTotalAmount_Desc() { regOBD("MERGE_TOTAL_AMOUNT"); return this; }

    protected ConditionValue _mergeCouponDiscount;
    public ConditionValue xdfgetMergeCouponDiscount()
    { if (_mergeCouponDiscount == null) { _mergeCouponDiscount = nCV(); }
      return _mergeCouponDiscount; }
    protected ConditionValue xgetCValueMergeCouponDiscount() { return xdfgetMergeCouponDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeCouponDiscount_Asc() { regOBA("MERGE_COUPON_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeCouponDiscount_Desc() { regOBD("MERGE_COUPON_DISCOUNT"); return this; }

    protected ConditionValue _mergePointDiscount;
    public ConditionValue xdfgetMergePointDiscount()
    { if (_mergePointDiscount == null) { _mergePointDiscount = nCV(); }
      return _mergePointDiscount; }
    protected ConditionValue xgetCValueMergePointDiscount() { return xdfgetMergePointDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergePointDiscount_Asc() { regOBA("MERGE_POINT_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergePointDiscount_Desc() { regOBD("MERGE_POINT_DISCOUNT"); return this; }

    protected ConditionValue _mergeOtherDiscount;
    public ConditionValue xdfgetMergeOtherDiscount()
    { if (_mergeOtherDiscount == null) { _mergeOtherDiscount = nCV(); }
      return _mergeOtherDiscount; }
    protected ConditionValue xgetCValueMergeOtherDiscount() { return xdfgetMergeOtherDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeOtherDiscount_Asc() { regOBA("MERGE_OTHER_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_MergeOtherDiscount_Desc() { regOBD("MERGE_OTHER_DISCOUNT"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_PackingQty_Asc() { regOBA("PACKING_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_PackingQty_Desc() { regOBD("PACKING_QTY"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_SlipItemNm1_Asc() { regOBA("SLIP_ITEM_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_SlipItemNm1_Desc() { regOBD("SLIP_ITEM_NM1"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_SlipItemNm2_Asc() { regOBA("SLIP_ITEM_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_SlipItemNm2_Desc() { regOBD("SLIP_ITEM_NM2"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_SlipItemNm3_Asc() { regOBA("SLIP_ITEM_NM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_SlipItemNm3_Desc() { regOBD("SLIP_ITEM_NM3"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_SlipItemNm4_Asc() { regOBA("SLIP_ITEM_NM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_SlipItemNm4_Desc() { regOBD("SLIP_ITEM_NM4"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_SlipItemNm5_Asc() { regOBA("SLIP_ITEM_NM5"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_SlipItemNm5_Desc() { regOBD("SLIP_ITEM_NM5"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_SlipItemCd1_Asc() { regOBA("SLIP_ITEM_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_SlipItemCd1_Desc() { regOBD("SLIP_ITEM_CD1"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_SlipItemCd2_Asc() { regOBA("SLIP_ITEM_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_SlipItemCd2_Desc() { regOBD("SLIP_ITEM_CD2"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_FreightHandling1_Asc() { regOBA("FREIGHT_HANDLING1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_FreightHandling1_Desc() { regOBD("FREIGHT_HANDLING1"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_FreightHandling2_Asc() { regOBA("FREIGHT_HANDLING2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_FreightHandling2_Desc() { regOBD("FREIGHT_HANDLING2"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_Article_Asc() { regOBA("ARTICLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_Article_Desc() { regOBD("ARTICLE"); return this; }

    protected ConditionValue _receiveId;
    public ConditionValue xdfgetReceiveId()
    { if (_receiveId == null) { _receiveId = nCV(); }
      return _receiveId; }
    protected ConditionValue xgetCValueReceiveId() { return xdfgetReceiveId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ReceiveId_Asc() { regOBA("RECEIVE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ReceiveId_Desc() { regOBD("RECEIVE_ID"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _importTypeId;
    public ConditionValue xdfgetImportTypeId()
    { if (_importTypeId == null) { _importTypeId = nCV(); }
      return _importTypeId; }
    protected ConditionValue xgetCValueImportTypeId() { return xdfgetImportTypeId(); }

    public Map<String, MImportTypeCQ> getImportTypeId_InScopeRelation_MImportType() { return xgetSQueMap("importTypeId_InScopeRelation_MImportType"); }
    public String keepImportTypeId_InScopeRelation_MImportType(MImportTypeCQ sq) { return xkeepSQue("importTypeId_InScopeRelation_MImportType", sq); }

    public Map<String, MImportTypeCQ> getImportTypeId_NotInScopeRelation_MImportType() { return xgetSQueMap("importTypeId_NotInScopeRelation_MImportType"); }
    public String keepImportTypeId_NotInScopeRelation_MImportType(MImportTypeCQ sq) { return xkeepSQue("importTypeId_NotInScopeRelation_MImportType", sq); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ImportTypeId_Asc() { regOBA("IMPORT_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ImportTypeId_Desc() { regOBD("IMPORT_TYPE_ID"); return this; }

    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    public Map<String, TShippingInstHCQ> getShippingInstHId_InScopeRelation_TShippingInstH() { return xgetSQueMap("shippingInstHId_InScopeRelation_TShippingInstH"); }
    public String keepShippingInstHId_InScopeRelation_TShippingInstH(TShippingInstHCQ sq) { return xkeepSQue("shippingInstHId_InScopeRelation_TShippingInstH", sq); }

    public Map<String, TShippingInstHCQ> getShippingInstHId_NotInScopeRelation_TShippingInstH() { return xgetSQueMap("shippingInstHId_NotInScopeRelation_TShippingInstH"); }
    public String keepShippingInstHId_NotInScopeRelation_TShippingInstH(TShippingInstHCQ sq) { return xkeepSQue("shippingInstHId_NotInScopeRelation_TShippingInstH", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTEcOrderHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTEcOrderHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTEcOrderHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTEcOrderHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TEcOrderHCQ bq = (TEcOrderHCQ)bqs;
        TEcOrderHCQ uq = (TEcOrderHCQ)uqs;
        if (bq.hasConditionQueryMImportType()) {
            uq.queryMImportType().reflectRelationOnUnionQuery(bq.queryMImportType(), uq.queryMImportType());
        }
        if (bq.hasConditionQueryTShippingInstH()) {
            uq.queryTShippingInstH().reflectRelationOnUnionQuery(bq.queryTShippingInstH(), uq.queryTShippingInstH());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryBClassDtlByDelivMatchFlg()) {
            uq.queryBClassDtlByDelivMatchFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelivMatchFlg(), uq.queryBClassDtlByDelivMatchFlg());
        }
        if (bq.hasConditionQueryBClassDtlByErrorFlg()) {
            uq.queryBClassDtlByErrorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorFlg(), uq.queryBClassDtlByErrorFlg());
        }
        if (bq.hasConditionQueryBClassDtlByGiftFlg()) {
            uq.queryBClassDtlByGiftFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByGiftFlg(), uq.queryBClassDtlByGiftFlg());
        }
        if (bq.hasConditionQueryBClassDtlByImportFlg()) {
            uq.queryBClassDtlByImportFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByImportFlg(), uq.queryBClassDtlByImportFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPriorityFlg()) {
            uq.queryBClassDtlByPriorityFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPriorityFlg(), uq.queryBClassDtlByPriorityFlg());
        }
        if (bq.hasConditionQueryTEcOrderRAsOne()) {
            uq.queryTEcOrderRAsOne().reflectRelationOnUnionQuery(bq.queryTEcOrderRAsOne(), uq.queryTEcOrderRAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MImportTypeCQ queryMImportType() {
        return xdfgetConditionQueryMImportType();
    }
    public MImportTypeCQ xdfgetConditionQueryMImportType() {
        String prop = "mImportType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMImportType()); xsetupOuterJoinMImportType(); }
        return xgetQueRlMap(prop);
    }
    protected MImportTypeCQ xcreateQueryMImportType() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "mImportType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MImportTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mImportType", nrp);
    }
    protected void xsetupOuterJoinMImportType() { xregOutJo("mImportType"); }
    public boolean hasConditionQueryMImportType() { return xhasQueRlMap("mImportType"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TShippingInstHCQ queryTShippingInstH() {
        return xdfgetConditionQueryTShippingInstH();
    }
    public TShippingInstHCQ xdfgetConditionQueryTShippingInstH() {
        String prop = "tShippingInstH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTShippingInstH()); xsetupOuterJoinTShippingInstH(); }
        return xgetQueRlMap(prop);
    }
    protected TShippingInstHCQ xcreateQueryTShippingInstH() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "tShippingInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TShippingInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tShippingInstH", nrp);
    }
    protected void xsetupOuterJoinTShippingInstH() { xregOutJo("tShippingInstH"); }
    public boolean hasConditionQueryTShippingInstH() { return xhasQueRlMap("tShippingInstH"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DELIV_MATCH_FLG, named 'BClassDtlByDelivMatchFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelivMatchFlg() {
        return xdfgetConditionQueryBClassDtlByDelivMatchFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelivMatchFlg() {
        String prop = "bClassDtlByDelivMatchFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelivMatchFlg()); xsetupOuterJoinBClassDtlByDelivMatchFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelivMatchFlg() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "bClassDtlByDelivMatchFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelivMatchFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelivMatchFlg() { xregOutJo("bClassDtlByDelivMatchFlg"); }
    public boolean hasConditionQueryBClassDtlByDelivMatchFlg() { return xhasQueRlMap("bClassDtlByDelivMatchFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByErrorFlg() {
        return xdfgetConditionQueryBClassDtlByErrorFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByErrorFlg() {
        String prop = "bClassDtlByErrorFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByErrorFlg()); xsetupOuterJoinBClassDtlByErrorFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByErrorFlg() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "bClassDtlByErrorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByErrorFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByErrorFlg() { xregOutJo("bClassDtlByErrorFlg"); }
    public boolean hasConditionQueryBClassDtlByErrorFlg() { return xhasQueRlMap("bClassDtlByErrorFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my GIFT_FLG, named 'BClassDtlByGiftFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByGiftFlg() {
        return xdfgetConditionQueryBClassDtlByGiftFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByGiftFlg() {
        String prop = "bClassDtlByGiftFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByGiftFlg()); xsetupOuterJoinBClassDtlByGiftFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByGiftFlg() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "bClassDtlByGiftFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByGiftFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByGiftFlg() { xregOutJo("bClassDtlByGiftFlg"); }
    public boolean hasConditionQueryBClassDtlByGiftFlg() { return xhasQueRlMap("bClassDtlByGiftFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my IMPORT_FLG, named 'BClassDtlByImportFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByImportFlg() {
        return xdfgetConditionQueryBClassDtlByImportFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByImportFlg() {
        String prop = "bClassDtlByImportFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByImportFlg()); xsetupOuterJoinBClassDtlByImportFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByImportFlg() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "bClassDtlByImportFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByImportFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByImportFlg() { xregOutJo("bClassDtlByImportFlg"); }
    public boolean hasConditionQueryBClassDtlByImportFlg() { return xhasQueRlMap("bClassDtlByImportFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRIORITY_FLG, named 'BClassDtlByPriorityFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPriorityFlg() {
        return xdfgetConditionQueryBClassDtlByPriorityFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPriorityFlg() {
        String prop = "bClassDtlByPriorityFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPriorityFlg()); xsetupOuterJoinBClassDtlByPriorityFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPriorityFlg() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "bClassDtlByPriorityFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPriorityFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPriorityFlg() { xregOutJo("bClassDtlByPriorityFlg"); }
    public boolean hasConditionQueryBClassDtlByPriorityFlg() { return xhasQueRlMap("bClassDtlByPriorityFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TEcOrderRCQ queryTEcOrderRAsOne() { return xdfgetConditionQueryTEcOrderRAsOne(); }
    public TEcOrderRCQ xdfgetConditionQueryTEcOrderRAsOne() {
        String prop = "tEcOrderRAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTEcOrderRAsOne()); xsetupOuterJoinTEcOrderRAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TEcOrderRCQ xcreateQueryTEcOrderRAsOne() {
        String nrp = xresolveNRP("T_EC_ORDER_H", "tEcOrderRAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TEcOrderRCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tEcOrderRAsOne", nrp);
    }
    protected void xsetupOuterJoinTEcOrderRAsOne() { xregOutJo("tEcOrderRAsOne"); }
    public boolean hasConditionQueryTEcOrderRAsOne() { return xhasQueRlMap("tEcOrderRAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TEcOrderHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TEcOrderHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TEcOrderHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TEcOrderHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TEcOrderHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TEcOrderHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TEcOrderHCQ> _myselfExistsMap;
    public Map<String, TEcOrderHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TEcOrderHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TEcOrderHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TEcOrderHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TEcOrderHCB.class.getName(); }
    protected String xCQ() { return TEcOrderHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
