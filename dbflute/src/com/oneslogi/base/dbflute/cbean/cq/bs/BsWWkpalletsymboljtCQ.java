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
 * The base condition-query of W_WKPALLETSYMBOLJT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWkpalletsymboljtCQ extends AbstractBsWWkpalletsymboljtCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWkpalletsymboljtCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWkpalletsymboljtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKPALLETSYMBOLJT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWkpalletsymboljtCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWkpalletsymboljtCIQ xcreateCIQ() {
        WWkpalletsymboljtCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWkpalletsymboljtCIQ xnewCIQ() {
        return new WWkpalletsymboljtCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKPALLETSYMBOLJT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWkpalletsymboljtCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWkpalletsymboljtCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _wksojtkey;
    public ConditionValue xdfgetWksojtkey()
    { if (_wksojtkey == null) { _wksojtkey = nCV(); }
      return _wksojtkey; }
    protected ConditionValue xgetCValueWksojtkey() { return xdfgetWksojtkey(); }

    /**
     * Add order-by as ascend. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Wksojtkey_Asc() { regOBA("WKSOJTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Wksojtkey_Desc() { regOBD("WKSOJTKEY"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_Palletno_Asc() { regOBA("PALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Palletno_Desc() { regOBD("PALLETNO"); return this; }

    protected ConditionValue _ownersono;
    public ConditionValue xdfgetOwnersono()
    { if (_ownersono == null) { _ownersono = nCV(); }
      return _ownersono; }
    protected ConditionValue xgetCValueOwnersono() { return xdfgetOwnersono(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Ownersono_Asc() { regOBA("OWNERSONO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERSONO: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Ownersono_Desc() { regOBD("OWNERSONO"); return this; }

    protected ConditionValue _sopalletno;
    public ConditionValue xdfgetSopalletno()
    { if (_sopalletno == null) { _sopalletno = nCV(); }
      return _sopalletno; }
    protected ConditionValue xgetCValueSopalletno() { return xdfgetSopalletno(); }

    /**
     * Add order-by as ascend. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Sopalletno_Asc() { regOBA("SOPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOPALLETNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Sopalletno_Desc() { regOBD("SOPALLETNO"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_Symbolno_Asc() { regOBA("SYMBOLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Symbolno_Desc() { regOBD("SYMBOLNO"); return this; }

    protected ConditionValue _sortedqty1;
    public ConditionValue xdfgetSortedqty1()
    { if (_sortedqty1 == null) { _sortedqty1 = nCV(); }
      return _sortedqty1; }
    protected ConditionValue xgetCValueSortedqty1() { return xdfgetSortedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Sortedqty1_Asc() { regOBA("SORTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Sortedqty1_Desc() { regOBD("SORTEDQTY1"); return this; }

    protected ConditionValue _lotkey;
    public ConditionValue xdfgetLotkey()
    { if (_lotkey == null) { _lotkey = nCV(); }
      return _lotkey; }
    protected ConditionValue xgetCValueLotkey() { return xdfgetLotkey(); }

    /**
     * Add order-by as ascend. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Lotkey_Asc() { regOBA("LOTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Lotkey_Desc() { regOBD("LOTKEY"); return this; }

    protected ConditionValue _packedflg;
    public ConditionValue xdfgetPackedflg()
    { if (_packedflg == null) { _packedflg = nCV(); }
      return _packedflg; }
    protected ConditionValue xgetCValuePackedflg() { return xdfgetPackedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Packedflg_Asc() { regOBA("PACKEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Packedflg_Desc() { regOBD("PACKEDFLG"); return this; }

    protected ConditionValue _enterflg;
    public ConditionValue xdfgetEnterflg()
    { if (_enterflg == null) { _enterflg = nCV(); }
      return _enterflg; }
    protected ConditionValue xgetCValueEnterflg() { return xdfgetEnterflg(); }

    /**
     * Add order-by as ascend. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Enterflg_Asc() { regOBA("ENTERFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Enterflg_Desc() { regOBD("ENTERFLG"); return this; }

    protected ConditionValue _actflg;
    public ConditionValue xdfgetActflg()
    { if (_actflg == null) { _actflg = nCV(); }
      return _actflg; }
    protected ConditionValue xgetCValueActflg() { return xdfgetActflg(); }

    /**
     * Add order-by as ascend. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Actflg_Asc() { regOBA("ACTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_Actflg_Desc() { regOBD("ACTFLG"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWkpalletsymboljtCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletsymboljtCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWkpalletsymboljtCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWkpalletsymboljtCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WWkpalletsymboljtCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWkpalletsymboljtCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWkpalletsymboljtCB.class.getName(); }
    protected String xCQ() { return WWkpalletsymboljtCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
