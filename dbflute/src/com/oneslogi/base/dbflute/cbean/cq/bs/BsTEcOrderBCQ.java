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
 * The base condition-query of T_EC_ORDER_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTEcOrderBCQ extends AbstractBsTEcOrderBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TEcOrderBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcOrderBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_EC_ORDER_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TEcOrderBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TEcOrderBCIQ xcreateCIQ() {
        TEcOrderBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TEcOrderBCIQ xnewCIQ() {
        return new TEcOrderBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_EC_ORDER_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TEcOrderBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TEcOrderBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ecOrderBId;
    public ConditionValue xdfgetEcOrderBId()
    { if (_ecOrderBId == null) { _ecOrderBId = nCV(); }
      return _ecOrderBId; }
    protected ConditionValue xgetCValueEcOrderBId() { return xdfgetEcOrderBId(); }

    public Map<String, TAmazonOrderCQ> xdfgetEcOrderBId_ExistsReferrer_TAmazonOrderList() { return xgetSQueMap("ecOrderBId_ExistsReferrer_TAmazonOrderList"); }
    public String keepEcOrderBId_ExistsReferrer_TAmazonOrderList(TAmazonOrderCQ sq) { return xkeepSQue("ecOrderBId_ExistsReferrer_TAmazonOrderList", sq); }

    public Map<String, TRakutenOrderCQ> xdfgetEcOrderBId_ExistsReferrer_TRakutenOrderList() { return xgetSQueMap("ecOrderBId_ExistsReferrer_TRakutenOrderList"); }
    public String keepEcOrderBId_ExistsReferrer_TRakutenOrderList(TRakutenOrderCQ sq) { return xkeepSQue("ecOrderBId_ExistsReferrer_TRakutenOrderList", sq); }

    public Map<String, TYahooOrderCQ> xdfgetEcOrderBId_ExistsReferrer_TYahooOrderList() { return xgetSQueMap("ecOrderBId_ExistsReferrer_TYahooOrderList"); }
    public String keepEcOrderBId_ExistsReferrer_TYahooOrderList(TYahooOrderCQ sq) { return xkeepSQue("ecOrderBId_ExistsReferrer_TYahooOrderList", sq); }

    public Map<String, TAmazonOrderCQ> xdfgetEcOrderBId_NotExistsReferrer_TAmazonOrderList() { return xgetSQueMap("ecOrderBId_NotExistsReferrer_TAmazonOrderList"); }
    public String keepEcOrderBId_NotExistsReferrer_TAmazonOrderList(TAmazonOrderCQ sq) { return xkeepSQue("ecOrderBId_NotExistsReferrer_TAmazonOrderList", sq); }

    public Map<String, TRakutenOrderCQ> xdfgetEcOrderBId_NotExistsReferrer_TRakutenOrderList() { return xgetSQueMap("ecOrderBId_NotExistsReferrer_TRakutenOrderList"); }
    public String keepEcOrderBId_NotExistsReferrer_TRakutenOrderList(TRakutenOrderCQ sq) { return xkeepSQue("ecOrderBId_NotExistsReferrer_TRakutenOrderList", sq); }

    public Map<String, TYahooOrderCQ> xdfgetEcOrderBId_NotExistsReferrer_TYahooOrderList() { return xgetSQueMap("ecOrderBId_NotExistsReferrer_TYahooOrderList"); }
    public String keepEcOrderBId_NotExistsReferrer_TYahooOrderList(TYahooOrderCQ sq) { return xkeepSQue("ecOrderBId_NotExistsReferrer_TYahooOrderList", sq); }

    public Map<String, TAmazonOrderCQ> xdfgetEcOrderBId_SpecifyDerivedReferrer_TAmazonOrderList() { return xgetSQueMap("ecOrderBId_SpecifyDerivedReferrer_TAmazonOrderList"); }
    public String keepEcOrderBId_SpecifyDerivedReferrer_TAmazonOrderList(TAmazonOrderCQ sq) { return xkeepSQue("ecOrderBId_SpecifyDerivedReferrer_TAmazonOrderList", sq); }

    public Map<String, TRakutenOrderCQ> xdfgetEcOrderBId_SpecifyDerivedReferrer_TRakutenOrderList() { return xgetSQueMap("ecOrderBId_SpecifyDerivedReferrer_TRakutenOrderList"); }
    public String keepEcOrderBId_SpecifyDerivedReferrer_TRakutenOrderList(TRakutenOrderCQ sq) { return xkeepSQue("ecOrderBId_SpecifyDerivedReferrer_TRakutenOrderList", sq); }

    public Map<String, TYahooOrderCQ> xdfgetEcOrderBId_SpecifyDerivedReferrer_TYahooOrderList() { return xgetSQueMap("ecOrderBId_SpecifyDerivedReferrer_TYahooOrderList"); }
    public String keepEcOrderBId_SpecifyDerivedReferrer_TYahooOrderList(TYahooOrderCQ sq) { return xkeepSQue("ecOrderBId_SpecifyDerivedReferrer_TYahooOrderList", sq); }

    public Map<String, TAmazonOrderCQ> xdfgetEcOrderBId_QueryDerivedReferrer_TAmazonOrderList() { return xgetSQueMap("ecOrderBId_QueryDerivedReferrer_TAmazonOrderList"); }
    public String keepEcOrderBId_QueryDerivedReferrer_TAmazonOrderList(TAmazonOrderCQ sq) { return xkeepSQue("ecOrderBId_QueryDerivedReferrer_TAmazonOrderList", sq); }
    public Map<String, Object> xdfgetEcOrderBId_QueryDerivedReferrer_TAmazonOrderListParameter() { return xgetSQuePmMap("ecOrderBId_QueryDerivedReferrer_TAmazonOrderList"); }
    public String keepEcOrderBId_QueryDerivedReferrer_TAmazonOrderListParameter(Object pm) { return xkeepSQuePm("ecOrderBId_QueryDerivedReferrer_TAmazonOrderList", pm); }

    public Map<String, TRakutenOrderCQ> xdfgetEcOrderBId_QueryDerivedReferrer_TRakutenOrderList() { return xgetSQueMap("ecOrderBId_QueryDerivedReferrer_TRakutenOrderList"); }
    public String keepEcOrderBId_QueryDerivedReferrer_TRakutenOrderList(TRakutenOrderCQ sq) { return xkeepSQue("ecOrderBId_QueryDerivedReferrer_TRakutenOrderList", sq); }
    public Map<String, Object> xdfgetEcOrderBId_QueryDerivedReferrer_TRakutenOrderListParameter() { return xgetSQuePmMap("ecOrderBId_QueryDerivedReferrer_TRakutenOrderList"); }
    public String keepEcOrderBId_QueryDerivedReferrer_TRakutenOrderListParameter(Object pm) { return xkeepSQuePm("ecOrderBId_QueryDerivedReferrer_TRakutenOrderList", pm); }

    public Map<String, TYahooOrderCQ> xdfgetEcOrderBId_QueryDerivedReferrer_TYahooOrderList() { return xgetSQueMap("ecOrderBId_QueryDerivedReferrer_TYahooOrderList"); }
    public String keepEcOrderBId_QueryDerivedReferrer_TYahooOrderList(TYahooOrderCQ sq) { return xkeepSQue("ecOrderBId_QueryDerivedReferrer_TYahooOrderList", sq); }
    public Map<String, Object> xdfgetEcOrderBId_QueryDerivedReferrer_TYahooOrderListParameter() { return xgetSQuePmMap("ecOrderBId_QueryDerivedReferrer_TYahooOrderList"); }
    public String keepEcOrderBId_QueryDerivedReferrer_TYahooOrderListParameter(Object pm) { return xkeepSQuePm("ecOrderBId_QueryDerivedReferrer_TYahooOrderList", pm); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_EcOrderBId_Asc() { regOBA("EC_ORDER_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_EcOrderBId_Desc() { regOBD("EC_ORDER_B_ID"); return this; }

    protected ConditionValue _ecOrderHId;
    public ConditionValue xdfgetEcOrderHId()
    { if (_ecOrderHId == null) { _ecOrderHId = nCV(); }
      return _ecOrderHId; }
    protected ConditionValue xgetCValueEcOrderHId() { return xdfgetEcOrderHId(); }

    public Map<String, TEcOrderHCQ> getEcOrderHId_InScopeRelation_TEcOrderH() { return xgetSQueMap("ecOrderHId_InScopeRelation_TEcOrderH"); }
    public String keepEcOrderHId_InScopeRelation_TEcOrderH(TEcOrderHCQ sq) { return xkeepSQue("ecOrderHId_InScopeRelation_TEcOrderH", sq); }

    public Map<String, TEcOrderHCQ> getEcOrderHId_NotInScopeRelation_TEcOrderH() { return xgetSQueMap("ecOrderHId_NotInScopeRelation_TEcOrderH"); }
    public String keepEcOrderHId_NotInScopeRelation_TEcOrderH(TEcOrderHCQ sq) { return xkeepSQue("ecOrderHId_NotInScopeRelation_TEcOrderH", sq); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_EcOrderHId_Asc() { regOBA("EC_ORDER_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_EcOrderHId_Desc() { regOBD("EC_ORDER_H_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _productOption;
    public ConditionValue xdfgetProductOption()
    { if (_productOption == null) { _productOption = nCV(); }
      return _productOption; }
    protected ConditionValue xgetCValueProductOption() { return xdfgetProductOption(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_ProductOption_Asc() { regOBA("PRODUCT_OPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_ProductOption_Desc() { regOBD("PRODUCT_OPTION"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_OrderNum_Asc() { regOBA("ORDER_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_OrderNum_Desc() { regOBD("ORDER_NUM"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

    protected ConditionValue _unitTotalPrice;
    public ConditionValue xdfgetUnitTotalPrice()
    { if (_unitTotalPrice == null) { _unitTotalPrice = nCV(); }
      return _unitTotalPrice; }
    protected ConditionValue xgetCValueUnitTotalPrice() { return xdfgetUnitTotalPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_UnitTotalPrice_Asc() { regOBA("UNIT_TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_UnitTotalPrice_Desc() { regOBD("UNIT_TOTAL_PRICE"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTEcOrderBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTEcOrderBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTEcOrderBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTEcOrderBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TEcOrderBCQ bq = (TEcOrderBCQ)bqs;
        TEcOrderBCQ uq = (TEcOrderBCQ)uqs;
        if (bq.hasConditionQueryTEcOrderH()) {
            uq.queryTEcOrderH().reflectRelationOnUnionQuery(bq.queryTEcOrderH(), uq.queryTEcOrderH());
        }
        if (bq.hasConditionQueryBClassDtlByErrorFlg()) {
            uq.queryBClassDtlByErrorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorFlg(), uq.queryBClassDtlByErrorFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TEcOrderHCQ queryTEcOrderH() {
        return xdfgetConditionQueryTEcOrderH();
    }
    public TEcOrderHCQ xdfgetConditionQueryTEcOrderH() {
        String prop = "tEcOrderH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTEcOrderH()); xsetupOuterJoinTEcOrderH(); }
        return xgetQueRlMap(prop);
    }
    protected TEcOrderHCQ xcreateQueryTEcOrderH() {
        String nrp = xresolveNRP("T_EC_ORDER_B", "tEcOrderH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TEcOrderHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tEcOrderH", nrp);
    }
    protected void xsetupOuterJoinTEcOrderH() { xregOutJo("tEcOrderH"); }
    public boolean hasConditionQueryTEcOrderH() { return xhasQueRlMap("tEcOrderH"); }

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
        String nrp = xresolveNRP("T_EC_ORDER_B", "bClassDtlByErrorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByErrorFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByErrorFlg() { xregOutJo("bClassDtlByErrorFlg"); }
    public boolean hasConditionQueryBClassDtlByErrorFlg() { return xhasQueRlMap("bClassDtlByErrorFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TEcOrderBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TEcOrderBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TEcOrderBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TEcOrderBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TEcOrderBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TEcOrderBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TEcOrderBCQ> _myselfExistsMap;
    public Map<String, TEcOrderBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TEcOrderBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TEcOrderBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TEcOrderBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TEcOrderBCB.class.getName(); }
    protected String xCQ() { return TEcOrderBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
