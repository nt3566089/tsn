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
 * The base condition-query of T_TRPALLETSYMBOLJT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrpalletsymboljtCQ extends AbstractBsTTrpalletsymboljtCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrpalletsymboljtCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpalletsymboljtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRPALLETSYMBOLJT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrpalletsymboljtCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrpalletsymboljtCIQ xcreateCIQ() {
        TTrpalletsymboljtCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrpalletsymboljtCIQ xnewCIQ() {
        return new TTrpalletsymboljtCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRPALLETSYMBOLJT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrpalletsymboljtCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrpalletsymboljtCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _palletIndividualInfoId;
    public ConditionValue xdfgetPalletIndividualInfoId()
    { if (_palletIndividualInfoId == null) { _palletIndividualInfoId = nCV(); }
      return _palletIndividualInfoId; }
    protected ConditionValue xgetCValuePalletIndividualInfoId() { return xdfgetPalletIndividualInfoId(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_INDIVIDUAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_PalletIndividualInfoId_Asc() { regOBA("PALLET_INDIVIDUAL_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_INDIVIDUAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_PalletIndividualInfoId_Desc() { regOBD("PALLET_INDIVIDUAL_INFO_ID"); return this; }

    protected ConditionValue _palletsymbolkey;
    public ConditionValue xdfgetPalletsymbolkey()
    { if (_palletsymbolkey == null) { _palletsymbolkey = nCV(); }
      return _palletsymbolkey; }
    protected ConditionValue xgetCValuePalletsymbolkey() { return xdfgetPalletsymbolkey(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETSYMBOLKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Palletsymbolkey_Asc() { regOBA("PALLETSYMBOLKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETSYMBOLKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Palletsymbolkey_Desc() { regOBD("PALLETSYMBOLKEY"); return this; }

    protected ConditionValue _palletkey;
    public ConditionValue xdfgetPalletkey()
    { if (_palletkey == null) { _palletkey = nCV(); }
      return _palletkey; }
    protected ConditionValue xgetCValuePalletkey() { return xdfgetPalletkey(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETKEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Palletkey_Asc() { regOBA("PALLETKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETKEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Palletkey_Desc() { regOBD("PALLETKEY"); return this; }

    protected ConditionValue _sojtid;
    public ConditionValue xdfgetSojtid()
    { if (_sojtid == null) { _sojtid = nCV(); }
      return _sojtid; }
    protected ConditionValue xgetCValueSojtid() { return xdfgetSojtid(); }

    /**
     * Add order-by as ascend. <br>
     * SOJTID: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Sojtid_Asc() { regOBA("SOJTID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOJTID: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Sojtid_Desc() { regOBD("SOJTID"); return this; }

    protected ConditionValue _sojtlineno;
    public ConditionValue xdfgetSojtlineno()
    { if (_sojtlineno == null) { _sojtlineno = nCV(); }
      return _sojtlineno; }
    protected ConditionValue xgetCValueSojtlineno() { return xdfgetSojtlineno(); }

    /**
     * Add order-by as ascend. <br>
     * SOJTLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Sojtlineno_Asc() { regOBA("SOJTLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOJTLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Sojtlineno_Desc() { regOBD("SOJTLINENO"); return this; }

    protected ConditionValue _ownersono;
    public ConditionValue xdfgetOwnersono()
    { if (_ownersono == null) { _ownersono = nCV(); }
      return _ownersono; }
    protected ConditionValue xgetCValueOwnersono() { return xdfgetOwnersono(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Ownersono_Asc() { regOBA("OWNERSONO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Ownersono_Desc() { regOBD("OWNERSONO"); return this; }

    protected ConditionValue _sopalletno;
    public ConditionValue xdfgetSopalletno()
    { if (_sopalletno == null) { _sopalletno = nCV(); }
      return _sopalletno; }
    protected ConditionValue xgetCValueSopalletno() { return xdfgetSopalletno(); }

    /**
     * Add order-by as ascend. <br>
     * SOPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Sopalletno_Asc() { regOBA("SOPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Sopalletno_Desc() { regOBD("SOPALLETNO"); return this; }

    protected ConditionValue _rcvid;
    public ConditionValue xdfgetRcvid()
    { if (_rcvid == null) { _rcvid = nCV(); }
      return _rcvid; }
    protected ConditionValue xgetCValueRcvid() { return xdfgetRcvid(); }

    /**
     * Add order-by as ascend. <br>
     * RCVID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Rcvid_Asc() { regOBA("RCVID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Rcvid_Desc() { regOBD("RCVID"); return this; }

    protected ConditionValue _centerSymbolId;
    public ConditionValue xdfgetCenterSymbolId()
    { if (_centerSymbolId == null) { _centerSymbolId = nCV(); }
      return _centerSymbolId; }
    protected ConditionValue xgetCValueCenterSymbolId() { return xdfgetCenterSymbolId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_CenterSymbolId_Asc() { regOBA("CENTER_SYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_CenterSymbolId_Desc() { regOBD("CENTER_SYMBOL_ID"); return this; }

    protected ConditionValue _sortedqty1;
    public ConditionValue xdfgetSortedqty1()
    { if (_sortedqty1 == null) { _sortedqty1 = nCV(); }
      return _sortedqty1; }
    protected ConditionValue xgetCValueSortedqty1() { return xdfgetSortedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * SORTEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Sortedqty1_Asc() { regOBA("SORTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Sortedqty1_Desc() { regOBD("SORTEDQTY1"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _packedflg;
    public ConditionValue xdfgetPackedflg()
    { if (_packedflg == null) { _packedflg = nCV(); }
      return _packedflg; }
    protected ConditionValue xgetCValuePackedflg() { return xdfgetPackedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PACKEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Packedflg_Asc() { regOBA("PACKEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_Packedflg_Desc() { regOBD("PACKEDFLG"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrpalletsymboljtCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpalletsymboljtCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrpalletsymboljtCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrpalletsymboljtCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrpalletsymboljtCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrpalletsymboljtCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrpalletsymboljtCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrpalletsymboljtCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrpalletsymboljtCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrpalletsymboljtCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrpalletsymboljtCQ> _myselfExistsMap;
    public Map<String, TTrpalletsymboljtCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrpalletsymboljtCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrpalletsymboljtCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrpalletsymboljtCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrpalletsymboljtCB.class.getName(); }
    protected String xCQ() { return TTrpalletsymboljtCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
