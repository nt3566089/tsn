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
 * The base condition-query of W_WKSORTSUB.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWksortsubCQ extends AbstractBsWWksortsubCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWksortsubCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWksortsubCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKSORTSUB) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWksortsubCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWksortsubCIQ xcreateCIQ() {
        WWksortsubCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWksortsubCIQ xnewCIQ() {
        return new WWksortsubCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKSORTSUB on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWksortsubCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWksortsubCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sortsubkey;
    public ConditionValue xdfgetSortsubkey()
    { if (_sortsubkey == null) { _sortsubkey = nCV(); }
      return _sortsubkey; }
    protected ConditionValue xgetCValueSortsubkey() { return xdfgetSortsubkey(); }

    /**
     * Add order-by as ascend. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Sortsubkey_Asc() { regOBA("SORTSUBKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Sortsubkey_Desc() { regOBD("SORTSUBKEY"); return this; }

    protected ConditionValue _sortsublineno;
    public ConditionValue xdfgetSortsublineno()
    { if (_sortsublineno == null) { _sortsublineno = nCV(); }
      return _sortsublineno; }
    protected ConditionValue xgetCValueSortsublineno() { return xdfgetSortsublineno(); }

    /**
     * Add order-by as ascend. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Sortsublineno_Asc() { regOBA("SORTSUBLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Sortsublineno_Desc() { regOBD("SORTSUBLINENO"); return this; }

    protected ConditionValue _sokey;
    public ConditionValue xdfgetSokey()
    { if (_sokey == null) { _sokey = nCV(); }
      return _sokey; }
    protected ConditionValue xgetCValueSokey() { return xdfgetSokey(); }

    /**
     * Add order-by as ascend. <br>
     * SOKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Sokey_Asc() { regOBA("SOKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Sokey_Desc() { regOBD("SOKEY"); return this; }

    protected ConditionValue _plno;
    public ConditionValue xdfgetPlno()
    { if (_plno == null) { _plno = nCV(); }
      return _plno; }
    protected ConditionValue xgetCValuePlno() { return xdfgetPlno(); }

    /**
     * Add order-by as ascend. <br>
     * PLNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Plno_Asc() { regOBA("PLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Plno_Desc() { regOBD("PLNO"); return this; }

    protected ConditionValue _symbolno;
    public ConditionValue xdfgetSymbolno()
    { if (_symbolno == null) { _symbolno = nCV(); }
      return _symbolno; }
    protected ConditionValue xgetCValueSymbolno() { return xdfgetSymbolno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Symbolno_Asc() { regOBA("SYMBOLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Symbolno_Desc() { regOBD("SYMBOLNO"); return this; }

    protected ConditionValue _lotkey;
    public ConditionValue xdfgetLotkey()
    { if (_lotkey == null) { _lotkey = nCV(); }
      return _lotkey; }
    protected ConditionValue xgetCValueLotkey() { return xdfgetLotkey(); }

    /**
     * Add order-by as ascend. <br>
     * LOTKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Lotkey_Asc() { regOBA("LOTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Lotkey_Desc() { regOBD("LOTKEY"); return this; }

    protected ConditionValue _loccd;
    public ConditionValue xdfgetLoccd()
    { if (_loccd == null) { _loccd = nCV(); }
      return _loccd; }
    protected ConditionValue xgetCValueLoccd() { return xdfgetLoccd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _pickedflg;
    public ConditionValue xdfgetPickedflg()
    { if (_pickedflg == null) { _pickedflg = nCV(); }
      return _pickedflg; }
    protected ConditionValue xgetCValuePickedflg() { return xdfgetPickedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Pickedflg_Asc() { regOBA("PICKEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Pickedflg_Desc() { regOBD("PICKEDFLG"); return this; }

    protected ConditionValue _sortedflg;
    public ConditionValue xdfgetSortedflg()
    { if (_sortedflg == null) { _sortedflg = nCV(); }
      return _sortedflg; }
    protected ConditionValue xgetCValueSortedflg() { return xdfgetSortedflg(); }

    /**
     * Add order-by as ascend. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Sortedflg_Asc() { regOBA("SORTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTEDFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Sortedflg_Desc() { regOBD("SORTEDFLG"); return this; }

    protected ConditionValue _manualsymbolno;
    public ConditionValue xdfgetManualsymbolno()
    { if (_manualsymbolno == null) { _manualsymbolno = nCV(); }
      return _manualsymbolno; }
    protected ConditionValue xgetCValueManualsymbolno() { return xdfgetManualsymbolno(); }

    /**
     * Add order-by as ascend. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Manualsymbolno_Asc() { regOBA("MANUALSYMBOLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUALSYMBOLNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Manualsymbolno_Desc() { regOBD("MANUALSYMBOLNO"); return this; }

    protected ConditionValue _assortseq;
    public ConditionValue xdfgetAssortseq()
    { if (_assortseq == null) { _assortseq = nCV(); }
      return _assortseq; }
    protected ConditionValue xgetCValueAssortseq() { return xdfgetAssortseq(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTSEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Assortseq_Asc() { regOBA("ASSORTSEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTSEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_Assortseq_Desc() { regOBD("ASSORTSEQ"); return this; }

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
    public BsWWksortsubCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWksortsubCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWksortsubCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWksortsubCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWksortsubCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWksortsubCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWksortsubCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWksortsubCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWksortsubCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWksortsubCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWksortsubCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWksortsubCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WWksortsubCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWksortsubCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWksortsubCB.class.getName(); }
    protected String xCQ() { return WWksortsubCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
