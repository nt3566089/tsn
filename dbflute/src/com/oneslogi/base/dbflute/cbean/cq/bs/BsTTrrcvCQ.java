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
 * The base condition-query of T_TRRCV.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrrcvCQ extends AbstractBsTTrrcvCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrrcvCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrrcvCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRRCV) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrrcvCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrrcvCIQ xcreateCIQ() {
        TTrrcvCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrrcvCIQ xnewCIQ() {
        return new TTrrcvCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRRCV on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrrcvCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrrcvCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    public Map<String, TTrrcvdetailCQ> xdfgetReceivePlanHId_ExistsReferrer_TTrrcvdetailList() { return xgetSQueMap("receivePlanHId_ExistsReferrer_TTrrcvdetailList"); }
    public String keepReceivePlanHId_ExistsReferrer_TTrrcvdetailList(TTrrcvdetailCQ sq) { return xkeepSQue("receivePlanHId_ExistsReferrer_TTrrcvdetailList", sq); }

    public Map<String, TTrrcvextendCQ> xdfgetReceivePlanHId_ExistsReferrer_TTrrcvextendAsOne() { return xgetSQueMap("receivePlanHId_ExistsReferrer_TTrrcvextendAsOne"); }
    public String keepReceivePlanHId_ExistsReferrer_TTrrcvextendAsOne(TTrrcvextendCQ sq) { return xkeepSQue("receivePlanHId_ExistsReferrer_TTrrcvextendAsOne", sq); }

    public Map<String, TTrrcvdetailCQ> xdfgetReceivePlanHId_NotExistsReferrer_TTrrcvdetailList() { return xgetSQueMap("receivePlanHId_NotExistsReferrer_TTrrcvdetailList"); }
    public String keepReceivePlanHId_NotExistsReferrer_TTrrcvdetailList(TTrrcvdetailCQ sq) { return xkeepSQue("receivePlanHId_NotExistsReferrer_TTrrcvdetailList", sq); }

    public Map<String, TTrrcvextendCQ> xdfgetReceivePlanHId_NotExistsReferrer_TTrrcvextendAsOne() { return xgetSQueMap("receivePlanHId_NotExistsReferrer_TTrrcvextendAsOne"); }
    public String keepReceivePlanHId_NotExistsReferrer_TTrrcvextendAsOne(TTrrcvextendCQ sq) { return xkeepSQue("receivePlanHId_NotExistsReferrer_TTrrcvextendAsOne", sq); }

    public Map<String, TTrrcvdetailCQ> xdfgetReceivePlanHId_SpecifyDerivedReferrer_TTrrcvdetailList() { return xgetSQueMap("receivePlanHId_SpecifyDerivedReferrer_TTrrcvdetailList"); }
    public String keepReceivePlanHId_SpecifyDerivedReferrer_TTrrcvdetailList(TTrrcvdetailCQ sq) { return xkeepSQue("receivePlanHId_SpecifyDerivedReferrer_TTrrcvdetailList", sq); }

    public Map<String, TTrrcvdetailCQ> xdfgetReceivePlanHId_QueryDerivedReferrer_TTrrcvdetailList() { return xgetSQueMap("receivePlanHId_QueryDerivedReferrer_TTrrcvdetailList"); }
    public String keepReceivePlanHId_QueryDerivedReferrer_TTrrcvdetailList(TTrrcvdetailCQ sq) { return xkeepSQue("receivePlanHId_QueryDerivedReferrer_TTrrcvdetailList", sq); }
    public Map<String, Object> xdfgetReceivePlanHId_QueryDerivedReferrer_TTrrcvdetailListParameter() { return xgetSQuePmMap("receivePlanHId_QueryDerivedReferrer_TTrrcvdetailList"); }
    public String keepReceivePlanHId_QueryDerivedReferrer_TTrrcvdetailListParameter(Object pm) { return xkeepSQuePm("receivePlanHId_QueryDerivedReferrer_TTrrcvdetailList", pm); }

    public Map<String, TReceivePlanHCQ> getReceivePlanHId_InScopeRelation_TReceivePlanH() { return xgetSQueMap("receivePlanHId_InScopeRelation_TReceivePlanH"); }
    public String keepReceivePlanHId_InScopeRelation_TReceivePlanH(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_InScopeRelation_TReceivePlanH", sq); }

    public Map<String, TReceivePlanHCQ> getReceivePlanHId_NotInScopeRelation_TReceivePlanH() { return xgetSQueMap("receivePlanHId_NotInScopeRelation_TReceivePlanH"); }
    public String keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_NotInScopeRelation_TReceivePlanH", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {PK, IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {PK, IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _prekey;
    public ConditionValue xdfgetPrekey()
    { if (_prekey == null) { _prekey = nCV(); }
      return _prekey; }
    protected ConditionValue xgetCValuePrekey() { return xdfgetPrekey(); }

    /**
     * Add order-by as ascend. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Prekey_Asc() { regOBA("PREKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Prekey_Desc() { regOBD("PREKEY"); return this; }

    protected ConditionValue _templateflg;
    public ConditionValue xdfgetTemplateflg()
    { if (_templateflg == null) { _templateflg = nCV(); }
      return _templateflg; }
    protected ConditionValue xgetCValueTemplateflg() { return xdfgetTemplateflg(); }

    /**
     * Add order-by as ascend. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Templateflg_Asc() { regOBA("TEMPLATEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Templateflg_Desc() { regOBD("TEMPLATEFLG"); return this; }

    protected ConditionValue _rcvinspectflg;
    public ConditionValue xdfgetRcvinspectflg()
    { if (_rcvinspectflg == null) { _rcvinspectflg = nCV(); }
      return _rcvinspectflg; }
    protected ConditionValue xgetCValueRcvinspectflg() { return xdfgetRcvinspectflg(); }

    /**
     * Add order-by as ascend. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Rcvinspectflg_Asc() { regOBA("RCVINSPECTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Rcvinspectflg_Desc() { regOBD("RCVINSPECTFLG"); return this; }

    protected ConditionValue _supplierrcvno;
    public ConditionValue xdfgetSupplierrcvno()
    { if (_supplierrcvno == null) { _supplierrcvno = nCV(); }
      return _supplierrcvno; }
    protected ConditionValue xgetCValueSupplierrcvno() { return xdfgetSupplierrcvno(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Supplierrcvno_Asc() { regOBA("SUPPLIERRCVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Supplierrcvno_Desc() { regOBD("SUPPLIERRCVNO"); return this; }

    protected ConditionValue _rmano;
    public ConditionValue xdfgetRmano()
    { if (_rmano == null) { _rmano = nCV(); }
      return _rmano; }
    protected ConditionValue xgetCValueRmano() { return xdfgetRmano(); }

    /**
     * Add order-by as ascend. <br>
     * RMANO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Rmano_Asc() { regOBA("RMANO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RMANO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Rmano_Desc() { regOBD("RMANO"); return this; }

    protected ConditionValue _rcvtype;
    public ConditionValue xdfgetRcvtype()
    { if (_rcvtype == null) { _rcvtype = nCV(); }
      return _rcvtype; }
    protected ConditionValue xgetCValueRcvtype() { return xdfgetRcvtype(); }

    /**
     * Add order-by as ascend. <br>
     * RCVTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Rcvtype_Asc() { regOBA("RCVTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Rcvtype_Desc() { regOBD("RCVTYPE"); return this; }

    protected ConditionValue _itemcd;
    public ConditionValue xdfgetItemcd()
    { if (_itemcd == null) { _itemcd = nCV(); }
      return _itemcd; }
    protected ConditionValue xgetCValueItemcd() { return xdfgetItemcd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Itemcd_Asc() { regOBA("ITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Itemcd_Desc() { regOBD("ITEMCD"); return this; }

    protected ConditionValue _partflg;
    public ConditionValue xdfgetPartflg()
    { if (_partflg == null) { _partflg = nCV(); }
      return _partflg; }
    protected ConditionValue xgetCValuePartflg() { return xdfgetPartflg(); }

    /**
     * Add order-by as ascend. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Partflg_Asc() { regOBA("PARTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Partflg_Desc() { regOBD("PARTFLG"); return this; }

    protected ConditionValue _receiveSts;
    public ConditionValue xdfgetReceiveSts()
    { if (_receiveSts == null) { _receiveSts = nCV(); }
      return _receiveSts; }
    protected ConditionValue xgetCValueReceiveSts() { return xdfgetReceiveSts(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_STS: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_ReceiveSts_Asc() { regOBA("RECEIVE_STS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_STS: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_ReceiveSts_Desc() { regOBD("RECEIVE_STS"); return this; }

    protected ConditionValue _priorities;
    public ConditionValue xdfgetPriorities()
    { if (_priorities == null) { _priorities = nCV(); }
      return _priorities; }
    protected ConditionValue xgetCValuePriorities() { return xdfgetPriorities(); }

    /**
     * Add order-by as ascend. <br>
     * PRIORITIES: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Priorities_Asc() { regOBA("PRIORITIES"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRIORITIES: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Priorities_Desc() { regOBD("PRIORITIES"); return this; }

    protected ConditionValue _companycd;
    public ConditionValue xdfgetCompanycd()
    { if (_companycd == null) { _companycd = nCV(); }
      return _companycd; }
    protected ConditionValue xgetCValueCompanycd() { return xdfgetCompanycd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANYCD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Companycd_Asc() { regOBA("COMPANYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANYCD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Companycd_Desc() { regOBD("COMPANYCD"); return this; }

    protected ConditionValue _receivedate;
    public ConditionValue xdfgetReceivedate()
    { if (_receivedate == null) { _receivedate = nCV(); }
      return _receivedate; }
    protected ConditionValue xgetCValueReceivedate() { return xdfgetReceivedate(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _logisticscd;
    public ConditionValue xdfgetLogisticscd()
    { if (_logisticscd == null) { _logisticscd = nCV(); }
      return _logisticscd; }
    protected ConditionValue xgetCValueLogisticscd() { return xdfgetLogisticscd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Logisticscd_Asc() { regOBA("LOGISTICSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Logisticscd_Desc() { regOBD("LOGISTICSCD"); return this; }

    protected ConditionValue _suppliercd;
    public ConditionValue xdfgetSuppliercd()
    { if (_suppliercd == null) { _suppliercd = nCV(); }
      return _suppliercd; }
    protected ConditionValue xgetCValueSuppliercd() { return xdfgetSuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERCD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _suppliername;
    public ConditionValue xdfgetSuppliername()
    { if (_suppliername == null) { _suppliername = nCV(); }
      return _suppliername; }
    protected ConditionValue xgetCValueSuppliername() { return xdfgetSuppliername(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Suppliername_Asc() { regOBA("SUPPLIERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Suppliername_Desc() { regOBD("SUPPLIERNAME"); return this; }

    protected ConditionValue _address1;
    public ConditionValue xdfgetAddress1()
    { if (_address1 == null) { _address1 = nCV(); }
      return _address1; }
    protected ConditionValue xgetCValueAddress1() { return xdfgetAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

    protected ConditionValue _address3;
    public ConditionValue xdfgetAddress3()
    { if (_address3 == null) { _address3 = nCV(); }
      return _address3; }
    protected ConditionValue xgetCValueAddress3() { return xdfgetAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

    protected ConditionValue _postno;
    public ConditionValue xdfgetPostno()
    { if (_postno == null) { _postno = nCV(); }
      return _postno; }
    protected ConditionValue xgetCValuePostno() { return xdfgetPostno(); }

    /**
     * Add order-by as ascend. <br>
     * POSTNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Postno_Asc() { regOBA("POSTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * POSTNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Postno_Desc() { regOBD("POSTNO"); return this; }

    protected ConditionValue _countrycd;
    public ConditionValue xdfgetCountrycd()
    { if (_countrycd == null) { _countrycd = nCV(); }
      return _countrycd; }
    protected ConditionValue xgetCValueCountrycd() { return xdfgetCountrycd(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRYCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Countrycd_Asc() { regOBA("COUNTRYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRYCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Countrycd_Desc() { regOBD("COUNTRYCD"); return this; }

    protected ConditionValue _portcd;
    public ConditionValue xdfgetPortcd()
    { if (_portcd == null) { _portcd = nCV(); }
      return _portcd; }
    protected ConditionValue xgetCValuePortcd() { return xdfgetPortcd(); }

    /**
     * Add order-by as ascend. <br>
     * PORTCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Portcd_Asc() { regOBA("PORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PORTCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Portcd_Desc() { regOBD("PORTCD"); return this; }

    protected ConditionValue _districtcd;
    public ConditionValue xdfgetDistrictcd()
    { if (_districtcd == null) { _districtcd = nCV(); }
      return _districtcd; }
    protected ConditionValue xgetCValueDistrictcd() { return xdfgetDistrictcd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTRICTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Districtcd_Asc() { regOBA("DISTRICTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRICTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Districtcd_Desc() { regOBD("DISTRICTCD"); return this; }

    protected ConditionValue _supplierphone;
    public ConditionValue xdfgetSupplierphone()
    { if (_supplierphone == null) { _supplierphone = nCV(); }
      return _supplierphone; }
    protected ConditionValue xgetCValueSupplierphone() { return xdfgetSupplierphone(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Supplierphone_Asc() { regOBA("SUPPLIERPHONE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Supplierphone_Desc() { regOBD("SUPPLIERPHONE"); return this; }

    protected ConditionValue _fax1;
    public ConditionValue xdfgetFax1()
    { if (_fax1 == null) { _fax1 = nCV(); }
      return _fax1; }
    protected ConditionValue xgetCValueFax1() { return xdfgetFax1(); }

    /**
     * Add order-by as ascend. <br>
     * FAX1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fax1_Asc() { regOBA("FAX1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAX1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fax1_Desc() { regOBD("FAX1"); return this; }

    protected ConditionValue _email;
    public ConditionValue xdfgetEmail()
    { if (_email == null) { _email = nCV(); }
      return _email; }
    protected ConditionValue xgetCValueEmail() { return xdfgetEmail(); }

    /**
     * Add order-by as ascend. <br>
     * EMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Email_Asc() { regOBA("EMAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Email_Desc() { regOBD("EMAIL"); return this; }

    protected ConditionValue _refname;
    public ConditionValue xdfgetRefname()
    { if (_refname == null) { _refname = nCV(); }
      return _refname; }
    protected ConditionValue xgetCValueRefname() { return xdfgetRefname(); }

    /**
     * Add order-by as ascend. <br>
     * REFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Refname_Asc() { regOBA("REFNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Refname_Desc() { regOBD("REFNAME"); return this; }

    protected ConditionValue _fromcd;
    public ConditionValue xdfgetFromcd()
    { if (_fromcd == null) { _fromcd = nCV(); }
      return _fromcd; }
    protected ConditionValue xgetCValueFromcd() { return xdfgetFromcd(); }

    /**
     * Add order-by as ascend. <br>
     * FROMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromcd_Asc() { regOBA("FROMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromcd_Desc() { regOBD("FROMCD"); return this; }

    protected ConditionValue _fromsub;
    public ConditionValue xdfgetFromsub()
    { if (_fromsub == null) { _fromsub = nCV(); }
      return _fromsub; }
    protected ConditionValue xgetCValueFromsub() { return xdfgetFromsub(); }

    /**
     * Add order-by as ascend. <br>
     * FROMSUB: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromsub_Asc() { regOBA("FROMSUB"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMSUB: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromsub_Desc() { regOBD("FROMSUB"); return this; }

    protected ConditionValue _fromname;
    public ConditionValue xdfgetFromname()
    { if (_fromname == null) { _fromname = nCV(); }
      return _fromname; }
    protected ConditionValue xgetCValueFromname() { return xdfgetFromname(); }

    /**
     * Add order-by as ascend. <br>
     * FROMNAME: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromname_Asc() { regOBA("FROMNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMNAME: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromname_Desc() { regOBD("FROMNAME"); return this; }

    protected ConditionValue _fromaddress1;
    public ConditionValue xdfgetFromaddress1()
    { if (_fromaddress1 == null) { _fromaddress1 = nCV(); }
      return _fromaddress1; }
    protected ConditionValue xgetCValueFromaddress1() { return xdfgetFromaddress1(); }

    /**
     * Add order-by as ascend. <br>
     * FROMADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromaddress1_Asc() { regOBA("FROMADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromaddress1_Desc() { regOBD("FROMADDRESS1"); return this; }

    protected ConditionValue _fromaddress2;
    public ConditionValue xdfgetFromaddress2()
    { if (_fromaddress2 == null) { _fromaddress2 = nCV(); }
      return _fromaddress2; }
    protected ConditionValue xgetCValueFromaddress2() { return xdfgetFromaddress2(); }

    /**
     * Add order-by as ascend. <br>
     * FROMADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromaddress2_Asc() { regOBA("FROMADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromaddress2_Desc() { regOBD("FROMADDRESS2"); return this; }

    protected ConditionValue _fromaddress3;
    public ConditionValue xdfgetFromaddress3()
    { if (_fromaddress3 == null) { _fromaddress3 = nCV(); }
      return _fromaddress3; }
    protected ConditionValue xgetCValueFromaddress3() { return xdfgetFromaddress3(); }

    /**
     * Add order-by as ascend. <br>
     * FROMADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromaddress3_Asc() { regOBA("FROMADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromaddress3_Desc() { regOBD("FROMADDRESS3"); return this; }

    protected ConditionValue _frompostno;
    public ConditionValue xdfgetFrompostno()
    { if (_frompostno == null) { _frompostno = nCV(); }
      return _frompostno; }
    protected ConditionValue xgetCValueFrompostno() { return xdfgetFrompostno(); }

    /**
     * Add order-by as ascend. <br>
     * FROMPOSTNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Frompostno_Asc() { regOBA("FROMPOSTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMPOSTNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Frompostno_Desc() { regOBD("FROMPOSTNO"); return this; }

    protected ConditionValue _fromcountrycd;
    public ConditionValue xdfgetFromcountrycd()
    { if (_fromcountrycd == null) { _fromcountrycd = nCV(); }
      return _fromcountrycd; }
    protected ConditionValue xgetCValueFromcountrycd() { return xdfgetFromcountrycd(); }

    /**
     * Add order-by as ascend. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromcountrycd_Asc() { regOBA("FROMCOUNTRYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromcountrycd_Desc() { regOBD("FROMCOUNTRYCD"); return this; }

    protected ConditionValue _fromportcd;
    public ConditionValue xdfgetFromportcd()
    { if (_fromportcd == null) { _fromportcd = nCV(); }
      return _fromportcd; }
    protected ConditionValue xgetCValueFromportcd() { return xdfgetFromportcd(); }

    /**
     * Add order-by as ascend. <br>
     * FROMPORTCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromportcd_Asc() { regOBA("FROMPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMPORTCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromportcd_Desc() { regOBD("FROMPORTCD"); return this; }

    protected ConditionValue _fromdistrictcd;
    public ConditionValue xdfgetFromdistrictcd()
    { if (_fromdistrictcd == null) { _fromdistrictcd = nCV(); }
      return _fromdistrictcd; }
    protected ConditionValue xgetCValueFromdistrictcd() { return xdfgetFromdistrictcd(); }

    /**
     * Add order-by as ascend. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromdistrictcd_Asc() { regOBA("FROMDISTRICTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromdistrictcd_Desc() { regOBD("FROMDISTRICTCD"); return this; }

    protected ConditionValue _fromphone;
    public ConditionValue xdfgetFromphone()
    { if (_fromphone == null) { _fromphone = nCV(); }
      return _fromphone; }
    protected ConditionValue xgetCValueFromphone() { return xdfgetFromphone(); }

    /**
     * Add order-by as ascend. <br>
     * FROMPHONE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromphone_Asc() { regOBA("FROMPHONE"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMPHONE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromphone_Desc() { regOBD("FROMPHONE"); return this; }

    protected ConditionValue _fromfax;
    public ConditionValue xdfgetFromfax()
    { if (_fromfax == null) { _fromfax = nCV(); }
      return _fromfax; }
    protected ConditionValue xgetCValueFromfax() { return xdfgetFromfax(); }

    /**
     * Add order-by as ascend. <br>
     * FROMFAX: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromfax_Asc() { regOBA("FROMFAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMFAX: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromfax_Desc() { regOBD("FROMFAX"); return this; }

    protected ConditionValue _fromemail;
    public ConditionValue xdfgetFromemail()
    { if (_fromemail == null) { _fromemail = nCV(); }
      return _fromemail; }
    protected ConditionValue xgetCValueFromemail() { return xdfgetFromemail(); }

    /**
     * Add order-by as ascend. <br>
     * FROMEMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromemail_Asc() { regOBA("FROMEMAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMEMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromemail_Desc() { regOBD("FROMEMAIL"); return this; }

    protected ConditionValue _fromrefname;
    public ConditionValue xdfgetFromrefname()
    { if (_fromrefname == null) { _fromrefname = nCV(); }
      return _fromrefname; }
    protected ConditionValue xgetCValueFromrefname() { return xdfgetFromrefname(); }

    /**
     * Add order-by as ascend. <br>
     * FROMREFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromrefname_Asc() { regOBA("FROMREFNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMREFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Fromrefname_Desc() { regOBD("FROMREFNAME"); return this; }

    protected ConditionValue _carriercd;
    public ConditionValue xdfgetCarriercd()
    { if (_carriercd == null) { _carriercd = nCV(); }
      return _carriercd; }
    protected ConditionValue xgetCValueCarriercd() { return xdfgetCarriercd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carriercd_Asc() { regOBA("CARRIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carriercd_Desc() { regOBD("CARRIERCD"); return this; }

    protected ConditionValue _carriername;
    public ConditionValue xdfgetCarriername()
    { if (_carriername == null) { _carriername = nCV(); }
      return _carriername; }
    protected ConditionValue xgetCValueCarriername() { return xdfgetCarriername(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carriername_Asc() { regOBA("CARRIERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carriername_Desc() { regOBD("CARRIERNAME"); return this; }

    protected ConditionValue _carrierwbno;
    public ConditionValue xdfgetCarrierwbno()
    { if (_carrierwbno == null) { _carrierwbno = nCV(); }
      return _carrierwbno; }
    protected ConditionValue xgetCValueCarrierwbno() { return xdfgetCarrierwbno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERWBNO: {IX+, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carrierwbno_Asc() { regOBA("CARRIERWBNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERWBNO: {IX+, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carrierwbno_Desc() { regOBD("CARRIERWBNO"); return this; }

    protected ConditionValue _deliverycd;
    public ConditionValue xdfgetDeliverycd()
    { if (_deliverycd == null) { _deliverycd = nCV(); }
      return _deliverycd; }
    protected ConditionValue xgetCValueDeliverycd() { return xdfgetDeliverycd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Deliverycd_Asc() { regOBA("DELIVERYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Deliverycd_Desc() { regOBD("DELIVERYCD"); return this; }

    protected ConditionValue _carrierno;
    public ConditionValue xdfgetCarrierno()
    { if (_carrierno == null) { _carrierno = nCV(); }
      return _carrierno; }
    protected ConditionValue xgetCValueCarrierno() { return xdfgetCarrierno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

    protected ConditionValue _carriersname;
    public ConditionValue xdfgetCarriersname()
    { if (_carriersname == null) { _carriersname = nCV(); }
      return _carriersname; }
    protected ConditionValue xgetCValueCarriersname() { return xdfgetCarriersname(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERSNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carriersname_Asc() { regOBA("CARRIERSNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carriersname_Desc() { regOBD("CARRIERSNAME"); return this; }

    protected ConditionValue _carrierseq;
    public ConditionValue xdfgetCarrierseq()
    { if (_carrierseq == null) { _carrierseq = nCV(); }
      return _carrierseq; }
    protected ConditionValue xgetCValueCarrierseq() { return xdfgetCarrierseq(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERSEQ: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carrierseq_Asc() { regOBA("CARRIERSEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSEQ: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Carrierseq_Desc() { regOBD("CARRIERSEQ"); return this; }

    protected ConditionValue _expectedtime;
    public ConditionValue xdfgetExpectedtime()
    { if (_expectedtime == null) { _expectedtime = nCV(); }
      return _expectedtime; }
    protected ConditionValue xgetCValueExpectedtime() { return xdfgetExpectedtime(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Expectedtime_Asc() { regOBA("EXPECTEDTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Expectedtime_Desc() { regOBD("EXPECTEDTIME"); return this; }

    protected ConditionValue _notes;
    public ConditionValue xdfgetNotes()
    { if (_notes == null) { _notes = nCV(); }
      return _notes; }
    protected ConditionValue xgetCValueNotes() { return xdfgetNotes(); }

    /**
     * Add order-by as ascend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _otherrefno1;
    public ConditionValue xdfgetOtherrefno1()
    { if (_otherrefno1 == null) { _otherrefno1 = nCV(); }
      return _otherrefno1; }
    protected ConditionValue xgetCValueOtherrefno1() { return xdfgetOtherrefno1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Otherrefno1_Asc() { regOBA("OTHERREFNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Otherrefno1_Desc() { regOBD("OTHERREFNO1"); return this; }

    protected ConditionValue _otherrefno2;
    public ConditionValue xdfgetOtherrefno2()
    { if (_otherrefno2 == null) { _otherrefno2 = nCV(); }
      return _otherrefno2; }
    protected ConditionValue xgetCValueOtherrefno2() { return xdfgetOtherrefno2(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Otherrefno2_Asc() { regOBA("OTHERREFNO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Otherrefno2_Desc() { regOBD("OTHERREFNO2"); return this; }

    protected ConditionValue _otherrefno3;
    public ConditionValue xdfgetOtherrefno3()
    { if (_otherrefno3 == null) { _otherrefno3 = nCV(); }
      return _otherrefno3; }
    protected ConditionValue xgetCValueOtherrefno3() { return xdfgetOtherrefno3(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Otherrefno3_Asc() { regOBA("OTHERREFNO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Otherrefno3_Desc() { regOBD("OTHERREFNO3"); return this; }

    protected ConditionValue _allocgroup;
    public ConditionValue xdfgetAllocgroup()
    { if (_allocgroup == null) { _allocgroup = nCV(); }
      return _allocgroup; }
    protected ConditionValue xgetCValueAllocgroup() { return xdfgetAllocgroup(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOCGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Allocgroup_Asc() { regOBA("ALLOCGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Allocgroup_Desc() { regOBD("ALLOCGROUP"); return this; }

    protected ConditionValue _tracceptId;
    public ConditionValue xdfgetTracceptId()
    { if (_tracceptId == null) { _tracceptId = nCV(); }
      return _tracceptId; }
    protected ConditionValue xgetCValueTracceptId() { return xdfgetTracceptId(); }

    /**
     * Add order-by as ascend. <br>
     * TRACCEPT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_TracceptId_Asc() { regOBA("TRACCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACCEPT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_TracceptId_Desc() { regOBD("TRACCEPT_ID"); return this; }

    protected ConditionValue _acceptusercd;
    public ConditionValue xdfgetAcceptusercd()
    { if (_acceptusercd == null) { _acceptusercd = nCV(); }
      return _acceptusercd; }
    protected ConditionValue xgetCValueAcceptusercd() { return xdfgetAcceptusercd(); }

    /**
     * Add order-by as ascend. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Acceptusercd_Asc() { regOBA("ACCEPTUSERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Acceptusercd_Desc() { regOBD("ACCEPTUSERCD"); return this; }

    protected ConditionValue _inspectedusercd;
    public ConditionValue xdfgetInspectedusercd()
    { if (_inspectedusercd == null) { _inspectedusercd = nCV(); }
      return _inspectedusercd; }
    protected ConditionValue xgetCValueInspectedusercd() { return xdfgetInspectedusercd(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Inspectedusercd_Asc() { regOBA("INSPECTEDUSERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Inspectedusercd_Desc() { regOBD("INSPECTEDUSERCD"); return this; }

    protected ConditionValue _receivedusercd;
    public ConditionValue xdfgetReceivedusercd()
    { if (_receivedusercd == null) { _receivedusercd = nCV(); }
      return _receivedusercd; }
    protected ConditionValue xgetCValueReceivedusercd() { return xdfgetReceivedusercd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Receivedusercd_Asc() { regOBA("RECEIVEDUSERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Receivedusercd_Desc() { regOBD("RECEIVEDUSERCD"); return this; }

    protected ConditionValue _movekey;
    public ConditionValue xdfgetMovekey()
    { if (_movekey == null) { _movekey = nCV(); }
      return _movekey; }
    protected ConditionValue xgetCValueMovekey() { return xdfgetMovekey(); }

    /**
     * Add order-by as ascend. <br>
     * MOVEKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Movekey_Asc() { regOBA("MOVEKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVEKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Movekey_Desc() { regOBD("MOVEKEY"); return this; }

    protected ConditionValue _assykey;
    public ConditionValue xdfgetAssykey()
    { if (_assykey == null) { _assykey = nCV(); }
      return _assykey; }
    protected ConditionValue xgetCValueAssykey() { return xdfgetAssykey(); }

    /**
     * Add order-by as ascend. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Assykey_Asc() { regOBA("ASSYKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Assykey_Desc() { regOBD("ASSYKEY"); return this; }

    protected ConditionValue _producekey;
    public ConditionValue xdfgetProducekey()
    { if (_producekey == null) { _producekey = nCV(); }
      return _producekey; }
    protected ConditionValue xgetCValueProducekey() { return xdfgetProducekey(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCEKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Producekey_Asc() { regOBA("PRODUCEKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCEKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_Producekey_Desc() { regOBD("PRODUCEKEY"); return this; }

    protected ConditionValue _terminalCd;
    public ConditionValue xdfgetTerminalCd()
    { if (_terminalCd == null) { _terminalCd = nCV(); }
      return _terminalCd; }
    protected ConditionValue xgetCValueTerminalCd() { return xdfgetTerminalCd(); }

    /**
     * Add order-by as ascend. <br>
     * TERMINAL_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_TerminalCd_Asc() { regOBA("TERMINAL_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TERMINAL_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_TerminalCd_Desc() { regOBD("TERMINAL_CD"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _fcFlg;
    public ConditionValue xdfgetFcFlg()
    { if (_fcFlg == null) { _fcFlg = nCV(); }
      return _fcFlg; }
    protected ConditionValue xgetCValueFcFlg() { return xdfgetFcFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FC_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_FcFlg_Asc() { regOBA("FC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FC_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_FcFlg_Desc() { regOBD("FC_FLG"); return this; }

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
    public BsTTrrcvCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrrcvCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrrcvCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrrcvCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrrcvCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrrcvCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrrcvCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrrcvCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrrcvCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrrcvCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrrcvCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrrcvCQ bq = (TTrrcvCQ)bqs;
        TTrrcvCQ uq = (TTrrcvCQ)uqs;
        if (bq.hasConditionQueryTReceivePlanH()) {
            uq.queryTReceivePlanH().reflectRelationOnUnionQuery(bq.queryTReceivePlanH(), uq.queryTReceivePlanH());
        }
        if (bq.hasConditionQueryTTrrcvextendAsOne()) {
            uq.queryTTrrcvextendAsOne().reflectRelationOnUnionQuery(bq.queryTTrrcvextendAsOne(), uq.queryTTrrcvextendAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanHCQ queryTReceivePlanH() {
        return xdfgetConditionQueryTReceivePlanH();
    }
    public TReceivePlanHCQ xdfgetConditionQueryTReceivePlanH() {
        String prop = "tReceivePlanH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanH()); xsetupOuterJoinTReceivePlanH(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanHCQ xcreateQueryTReceivePlanH() {
        String nrp = xresolveNRP("T_TRRCV", "tReceivePlanH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanH", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanH() { xregOutJo("tReceivePlanH"); }
    public boolean hasConditionQueryTReceivePlanH() { return xhasQueRlMap("tReceivePlanH"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_TRRCVEXTEND by RECEIVE_PLAN_H_ID, named 'TTrrcvextendAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrrcvextendCQ queryTTrrcvextendAsOne() { return xdfgetConditionQueryTTrrcvextendAsOne(); }
    public TTrrcvextendCQ xdfgetConditionQueryTTrrcvextendAsOne() {
        String prop = "tTrrcvextendAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrrcvextendAsOne()); xsetupOuterJoinTTrrcvextendAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TTrrcvextendCQ xcreateQueryTTrrcvextendAsOne() {
        String nrp = xresolveNRP("T_TRRCV", "tTrrcvextendAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrrcvextendCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrrcvextendAsOne", nrp);
    }
    protected void xsetupOuterJoinTTrrcvextendAsOne() { xregOutJo("tTrrcvextendAsOne"); }
    public boolean hasConditionQueryTTrrcvextendAsOne() { return xhasQueRlMap("tTrrcvextendAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrrcvCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrrcvCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrrcvCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrrcvCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrrcvCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrrcvCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrrcvCQ> _myselfExistsMap;
    public Map<String, TTrrcvCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrrcvCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrrcvCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrrcvCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrrcvCB.class.getName(); }
    protected String xCQ() { return TTrrcvCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
