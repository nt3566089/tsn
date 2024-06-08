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
 * The base condition-query of W_WKPALLETIZE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWkpalletizeCQ extends AbstractBsWWkpalletizeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWkpalletizeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWkpalletizeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKPALLETIZE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWkpalletizeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWkpalletizeCIQ xcreateCIQ() {
        WWkpalletizeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWkpalletizeCIQ xnewCIQ() {
        return new WWkpalletizeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKPALLETIZE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWkpalletizeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWkpalletizeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _seqno;
    public ConditionValue xdfgetSeqno()
    { if (_seqno == null) { _seqno = nCV(); }
      return _seqno; }
    protected ConditionValue xgetCValueSeqno() { return xdfgetSeqno(); }

    /**
     * Add order-by as ascend. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Seqno_Asc() { regOBA("SEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Seqno_Desc() { regOBD("SEQNO"); return this; }

    protected ConditionValue _symbolno;
    public ConditionValue xdfgetSymbolno()
    { if (_symbolno == null) { _symbolno = nCV(); }
      return _symbolno; }
    protected ConditionValue xgetCValueSymbolno() { return xdfgetSymbolno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Symbolno_Asc() { regOBA("SYMBOLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Symbolno_Desc() { regOBD("SYMBOLNO"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _aname;
    public ConditionValue xdfgetAname()
    { if (_aname == null) { _aname = nCV(); }
      return _aname; }
    protected ConditionValue xgetCValueAname() { return xdfgetAname(); }

    /**
     * Add order-by as ascend. <br>
     * ANAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Aname_Asc() { regOBA("ANAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ANAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Aname_Desc() { regOBD("ANAME"); return this; }

    protected ConditionValue _lot3;
    public ConditionValue xdfgetLot3()
    { if (_lot3 == null) { _lot3 = nCV(); }
      return _lot3; }
    protected ConditionValue xgetCValueLot3() { return xdfgetLot3(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _lot1;
    public ConditionValue xdfgetLot1()
    { if (_lot1 == null) { _lot1 = nCV(); }
      return _lot1; }
    protected ConditionValue xgetCValueLot1() { return xdfgetLot1(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _lot4;
    public ConditionValue xdfgetLot4()
    { if (_lot4 == null) { _lot4 = nCV(); }
      return _lot4; }
    protected ConditionValue xgetCValueLot4() { return xdfgetLot4(); }

    /**
     * Add order-by as ascend. <br>
     * LOT4: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _lot2;
    public ConditionValue xdfgetLot2()
    { if (_lot2 == null) { _lot2 = nCV(); }
      return _lot2; }
    protected ConditionValue xgetCValueLot2() { return xdfgetLot2(); }

    /**
     * Add order-by as ascend. <br>
     * LOT2: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

    protected ConditionValue _restqty;
    public ConditionValue xdfgetRestqty()
    { if (_restqty == null) { _restqty = nCV(); }
      return _restqty; }
    protected ConditionValue xgetCValueRestqty() { return xdfgetRestqty(); }

    /**
     * Add order-by as ascend. <br>
     * RESTQTY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Restqty_Asc() { regOBA("RESTQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTQTY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Restqty_Desc() { regOBD("RESTQTY"); return this; }

    protected ConditionValue _palletno;
    public ConditionValue xdfgetPalletno()
    { if (_palletno == null) { _palletno = nCV(); }
      return _palletno; }
    protected ConditionValue xgetCValuePalletno() { return xdfgetPalletno(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Palletno_Asc() { regOBA("PALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Palletno_Desc() { regOBD("PALLETNO"); return this; }

    protected ConditionValue _loccd;
    public ConditionValue xdfgetLoccd()
    { if (_loccd == null) { _loccd = nCV(); }
      return _loccd; }
    protected ConditionValue xgetCValueLoccd() { return xdfgetLoccd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

    protected ConditionValue _lotkey;
    public ConditionValue xdfgetLotkey()
    { if (_lotkey == null) { _lotkey = nCV(); }
      return _lotkey; }
    protected ConditionValue xgetCValueLotkey() { return xdfgetLotkey(); }

    /**
     * Add order-by as ascend. <br>
     * LOTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lotkey_Asc() { regOBA("LOTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_Lotkey_Desc() { regOBD("LOTKEY"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWkpalletizeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletizeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWkpalletizeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWkpalletizeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WWkpalletizeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWkpalletizeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWkpalletizeCB.class.getName(); }
    protected String xCQ() { return WWkpalletizeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
