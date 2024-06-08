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
 * The base condition-query of H_RECEIVE_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsHReceiveBCQ extends AbstractBsHReceiveBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HReceiveBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHReceiveBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_RECEIVE_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HReceiveBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HReceiveBCIQ xcreateCIQ() {
        HReceiveBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HReceiveBCIQ xnewCIQ() {
        return new HReceiveBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_RECEIVE_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HReceiveBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HReceiveBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _storeRecordBId;
    public ConditionValue xdfgetStoreRecordBId()
    { if (_storeRecordBId == null) { _storeRecordBId = nCV(); }
      return _storeRecordBId; }
    protected ConditionValue xgetCValueStoreRecordBId() { return xdfgetStoreRecordBId(); }

    public Map<String, HReceiveSpareCQ> xdfgetStoreRecordBId_ExistsReferrer_HReceiveSpareAsOne() { return xgetSQueMap("storeRecordBId_ExistsReferrer_HReceiveSpareAsOne"); }
    public String keepStoreRecordBId_ExistsReferrer_HReceiveSpareAsOne(HReceiveSpareCQ sq) { return xkeepSQue("storeRecordBId_ExistsReferrer_HReceiveSpareAsOne", sq); }

    public Map<String, HReceiveSpareCQ> xdfgetStoreRecordBId_NotExistsReferrer_HReceiveSpareAsOne() { return xgetSQueMap("storeRecordBId_NotExistsReferrer_HReceiveSpareAsOne"); }
    public String keepStoreRecordBId_NotExistsReferrer_HReceiveSpareAsOne(HReceiveSpareCQ sq) { return xkeepSQue("storeRecordBId_NotExistsReferrer_HReceiveSpareAsOne", sq); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreRecordBId_Asc() { regOBA("STORE_RECORD_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreRecordBId_Desc() { regOBD("STORE_RECORD_B_ID"); return this; }

    protected ConditionValue _storeRecordHId;
    public ConditionValue xdfgetStoreRecordHId()
    { if (_storeRecordHId == null) { _storeRecordHId = nCV(); }
      return _storeRecordHId; }
    protected ConditionValue xgetCValueStoreRecordHId() { return xdfgetStoreRecordHId(); }

    public Map<String, HReceiveHCQ> getStoreRecordHId_InScopeRelation_HReceiveH() { return xgetSQueMap("storeRecordHId_InScopeRelation_HReceiveH"); }
    public String keepStoreRecordHId_InScopeRelation_HReceiveH(HReceiveHCQ sq) { return xkeepSQue("storeRecordHId_InScopeRelation_HReceiveH", sq); }

    public Map<String, HReceiveHCQ> getStoreRecordHId_NotInScopeRelation_HReceiveH() { return xgetSQueMap("storeRecordHId_NotInScopeRelation_HReceiveH"); }
    public String keepStoreRecordHId_NotInScopeRelation_HReceiveH(HReceiveHCQ sq) { return xkeepSQue("storeRecordHId_NotInScopeRelation_HReceiveH", sq); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreRecordHId_Asc() { regOBA("STORE_RECORD_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreRecordHId_Desc() { regOBD("STORE_RECORD_H_ID"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, HStockCQ> getStockId_InScopeRelation_HStock() { return xgetSQueMap("stockId_InScopeRelation_HStock"); }
    public String keepStockId_InScopeRelation_HStock(HStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_HStock", sq); }

    public Map<String, HStockCQ> getStockId_NotInScopeRelation_HStock() { return xgetSQueMap("stockId_NotInScopeRelation_HStock"); }
    public String keepStockId_NotInScopeRelation_HStock(HStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_HStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _planNum;
    public ConditionValue xdfgetPlanNum()
    { if (_planNum == null) { _planNum = nCV(); }
      return _planNum; }
    protected ConditionValue xgetCValuePlanNum() { return xdfgetPlanNum(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_PlanNum_Asc() { regOBA("PLAN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_PlanNum_Desc() { regOBD("PLAN_NUM"); return this; }

    protected ConditionValue _processNo;
    public ConditionValue xdfgetProcessNo()
    { if (_processNo == null) { _processNo = nCV(); }
      return _processNo; }
    protected ConditionValue xgetCValueProcessNo() { return xdfgetProcessNo(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_ProcessNo_Asc() { regOBA("PROCESS_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_ProcessNo_Desc() { regOBD("PROCESS_NO"); return this; }

    protected ConditionValue _storeDt;
    public ConditionValue xdfgetStoreDt()
    { if (_storeDt == null) { _storeDt = nCV(); }
      return _storeDt; }
    protected ConditionValue xgetCValueStoreDt() { return xdfgetStoreDt(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

    protected ConditionValue _storeNum;
    public ConditionValue xdfgetStoreNum()
    { if (_storeNum == null) { _storeNum = nCV(); }
      return _storeNum; }
    protected ConditionValue xgetCValueStoreNum() { return xdfgetStoreNum(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreNum_Asc() { regOBA("STORE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreNum_Desc() { regOBD("STORE_NUM"); return this; }

    protected ConditionValue _storeFlg;
    public ConditionValue xdfgetStoreFlg()
    { if (_storeFlg == null) { _storeFlg = nCV(); }
      return _storeFlg; }
    protected ConditionValue xgetCValueStoreFlg() { return xdfgetStoreFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreFlg_Asc() { regOBA("STORE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreFlg_Desc() { regOBD("STORE_FLG"); return this; }

    protected ConditionValue _storeLocationId;
    public ConditionValue xdfgetStoreLocationId()
    { if (_storeLocationId == null) { _storeLocationId = nCV(); }
      return _storeLocationId; }
    protected ConditionValue xgetCValueStoreLocationId() { return xdfgetStoreLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreLocationId_Asc() { regOBA("STORE_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreLocationId_Desc() { regOBD("STORE_LOCATION_ID"); return this; }

    protected ConditionValue _storeLocationCd;
    public ConditionValue xdfgetStoreLocationCd()
    { if (_storeLocationCd == null) { _storeLocationCd = nCV(); }
      return _storeLocationCd; }
    protected ConditionValue xgetCValueStoreLocationCd() { return xdfgetStoreLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreLocationCd_Asc() { regOBA("STORE_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreLocationCd_Desc() { regOBD("STORE_LOCATION_CD"); return this; }

    protected ConditionValue _storeLocationNm;
    public ConditionValue xdfgetStoreLocationNm()
    { if (_storeLocationNm == null) { _storeLocationNm = nCV(); }
      return _storeLocationNm; }
    protected ConditionValue xgetCValueStoreLocationNm() { return xdfgetStoreLocationNm(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreLocationNm_Asc() { regOBA("STORE_LOCATION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LOCATION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_StoreLocationNm_Desc() { regOBD("STORE_LOCATION_NM"); return this; }

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
    public BsHReceiveBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHReceiveBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHReceiveBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHReceiveBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHReceiveBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHReceiveBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHReceiveBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHReceiveBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHReceiveBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHReceiveBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHReceiveBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHReceiveBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HReceiveBCQ bq = (HReceiveBCQ)bqs;
        HReceiveBCQ uq = (HReceiveBCQ)uqs;
        if (bq.hasConditionQueryHStock()) {
            uq.queryHStock().reflectRelationOnUnionQuery(bq.queryHStock(), uq.queryHStock());
        }
        if (bq.hasConditionQueryHReceiveH()) {
            uq.queryHReceiveH().reflectRelationOnUnionQuery(bq.queryHReceiveH(), uq.queryHReceiveH());
        }
        if (bq.hasConditionQueryBClassDtlByStoreFlg()) {
            uq.queryBClassDtlByStoreFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStoreFlg(), uq.queryBClassDtlByStoreFlg());
        }
        if (bq.hasConditionQueryHReceiveSpareAsOne()) {
            uq.queryHReceiveSpareAsOne().reflectRelationOnUnionQuery(bq.queryHReceiveSpareAsOne(), uq.queryHReceiveSpareAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public HStockCQ queryHStock() {
        return xdfgetConditionQueryHStock();
    }
    public HStockCQ xdfgetConditionQueryHStock() {
        String prop = "hStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHStock()); xsetupOuterJoinHStock(); }
        return xgetQueRlMap(prop);
    }
    protected HStockCQ xcreateQueryHStock() {
        String nrp = xresolveNRP("H_RECEIVE_B", "hStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hStock", nrp);
    }
    protected void xsetupOuterJoinHStock() { xregOutJo("hStock"); }
    public boolean hasConditionQueryHStock() { return xhasQueRlMap("hStock"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'.
     * @return The instance of condition-query. (NotNull)
     */
    public HReceiveHCQ queryHReceiveH() {
        return xdfgetConditionQueryHReceiveH();
    }
    public HReceiveHCQ xdfgetConditionQueryHReceiveH() {
        String prop = "hReceiveH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHReceiveH()); xsetupOuterJoinHReceiveH(); }
        return xgetQueRlMap(prop);
    }
    protected HReceiveHCQ xcreateQueryHReceiveH() {
        String nrp = xresolveNRP("H_RECEIVE_B", "hReceiveH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HReceiveHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hReceiveH", nrp);
    }
    protected void xsetupOuterJoinHReceiveH() { xregOutJo("hReceiveH"); }
    public boolean hasConditionQueryHReceiveH() { return xhasQueRlMap("hReceiveH"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStoreFlg() {
        return xdfgetConditionQueryBClassDtlByStoreFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStoreFlg() {
        String prop = "bClassDtlByStoreFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStoreFlg()); xsetupOuterJoinBClassDtlByStoreFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStoreFlg() {
        String nrp = xresolveNRP("H_RECEIVE_B", "bClassDtlByStoreFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStoreFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStoreFlg() { xregOutJo("bClassDtlByStoreFlg"); }
    public boolean hasConditionQueryBClassDtlByStoreFlg() { return xhasQueRlMap("bClassDtlByStoreFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public HReceiveSpareCQ queryHReceiveSpareAsOne() { return xdfgetConditionQueryHReceiveSpareAsOne(); }
    public HReceiveSpareCQ xdfgetConditionQueryHReceiveSpareAsOne() {
        String prop = "hReceiveSpareAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHReceiveSpareAsOne()); xsetupOuterJoinHReceiveSpareAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected HReceiveSpareCQ xcreateQueryHReceiveSpareAsOne() {
        String nrp = xresolveNRP("H_RECEIVE_B", "hReceiveSpareAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HReceiveSpareCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hReceiveSpareAsOne", nrp);
    }
    protected void xsetupOuterJoinHReceiveSpareAsOne() { xregOutJo("hReceiveSpareAsOne"); }
    public boolean hasConditionQueryHReceiveSpareAsOne() { return xhasQueRlMap("hReceiveSpareAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HReceiveBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HReceiveBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HReceiveBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HReceiveBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HReceiveBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HReceiveBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HReceiveBCQ> _myselfExistsMap;
    public Map<String, HReceiveBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HReceiveBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HReceiveBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HReceiveBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HReceiveBCB.class.getName(); }
    protected String xCQ() { return HReceiveBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
