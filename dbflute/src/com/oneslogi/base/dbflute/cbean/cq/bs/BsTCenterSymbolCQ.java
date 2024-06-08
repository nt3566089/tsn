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
 * The base condition-query of T_CENTER_SYMBOL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCenterSymbolCQ extends AbstractBsTCenterSymbolCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCenterSymbolCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCenterSymbolCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CENTER_SYMBOL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCenterSymbolCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCenterSymbolCIQ xcreateCIQ() {
        TCenterSymbolCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCenterSymbolCIQ xnewCIQ() {
        return new TCenterSymbolCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CENTER_SYMBOL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCenterSymbolCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCenterSymbolCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerSymbolId;
    public ConditionValue xdfgetCenterSymbolId()
    { if (_centerSymbolId == null) { _centerSymbolId = nCV(); }
      return _centerSymbolId; }
    protected ConditionValue xgetCValueCenterSymbolId() { return xdfgetCenterSymbolId(); }

    public Map<String, TCenterSymbolCQ> xdfgetCenterSymbolId_ExistsReferrer_TCenterSymbolSelfList() { return xgetSQueMap("centerSymbolId_ExistsReferrer_TCenterSymbolSelfList"); }
    public String keepCenterSymbolId_ExistsReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq) { return xkeepSQue("centerSymbolId_ExistsReferrer_TCenterSymbolSelfList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetCenterSymbolId_NotExistsReferrer_TCenterSymbolSelfList() { return xgetSQueMap("centerSymbolId_NotExistsReferrer_TCenterSymbolSelfList"); }
    public String keepCenterSymbolId_NotExistsReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq) { return xkeepSQue("centerSymbolId_NotExistsReferrer_TCenterSymbolSelfList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetCenterSymbolId_SpecifyDerivedReferrer_TCenterSymbolSelfList() { return xgetSQueMap("centerSymbolId_SpecifyDerivedReferrer_TCenterSymbolSelfList"); }
    public String keepCenterSymbolId_SpecifyDerivedReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq) { return xkeepSQue("centerSymbolId_SpecifyDerivedReferrer_TCenterSymbolSelfList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList() { return xgetSQueMap("centerSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList"); }
    public String keepCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq) { return xkeepSQue("centerSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList", sq); }
    public Map<String, Object> xdfgetCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfListParameter() { return xgetSQuePmMap("centerSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList"); }
    public String keepCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfListParameter(Object pm) { return xkeepSQuePm("centerSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_CenterSymbolId_Asc() { regOBA("CENTER_SYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_CenterSymbolId_Desc() { regOBD("CENTER_SYMBOL_ID"); return this; }

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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _palletId;
    public ConditionValue xdfgetPalletId()
    { if (_palletId == null) { _palletId = nCV(); }
      return _palletId; }
    protected ConditionValue xgetCValuePalletId() { return xdfgetPalletId(); }

    public Map<String, TPalletCQ> getPalletId_InScopeRelation_TPallet() { return xgetSQueMap("palletId_InScopeRelation_TPallet"); }
    public String keepPalletId_InScopeRelation_TPallet(TPalletCQ sq) { return xkeepSQue("palletId_InScopeRelation_TPallet", sq); }

    public Map<String, TPalletCQ> getPalletId_NotInScopeRelation_TPallet() { return xgetSQueMap("palletId_NotInScopeRelation_TPallet"); }
    public String keepPalletId_NotInScopeRelation_TPallet(TPalletCQ sq) { return xkeepSQue("palletId_NotInScopeRelation_TPallet", sq); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_PalletId_Asc() { regOBA("PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_PalletId_Desc() { regOBD("PALLET_ID"); return this; }

    protected ConditionValue _trsymbolId;
    public ConditionValue xdfgetTrsymbolId()
    { if (_trsymbolId == null) { _trsymbolId = nCV(); }
      return _trsymbolId; }
    protected ConditionValue xgetCValueTrsymbolId() { return xdfgetTrsymbolId(); }

    public Map<String, TTrsymbolCQ> getTrsymbolId_InScopeRelation_TTrsymbol() { return xgetSQueMap("trsymbolId_InScopeRelation_TTrsymbol"); }
    public String keepTrsymbolId_InScopeRelation_TTrsymbol(TTrsymbolCQ sq) { return xkeepSQue("trsymbolId_InScopeRelation_TTrsymbol", sq); }

    public Map<String, TTrsymbolCQ> getTrsymbolId_NotInScopeRelation_TTrsymbol() { return xgetSQueMap("trsymbolId_NotInScopeRelation_TTrsymbol"); }
    public String keepTrsymbolId_NotInScopeRelation_TTrsymbol(TTrsymbolCQ sq) { return xkeepSQue("trsymbolId_NotInScopeRelation_TTrsymbol", sq); }

    /**
     * Add order-by as ascend. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_TrsymbolId_Asc() { regOBA("TRSYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_TrsymbolId_Desc() { regOBD("TRSYMBOL_ID"); return this; }

    protected ConditionValue _childCenterSymbolId;
    public ConditionValue xdfgetChildCenterSymbolId()
    { if (_childCenterSymbolId == null) { _childCenterSymbolId = nCV(); }
      return _childCenterSymbolId; }
    protected ConditionValue xgetCValueChildCenterSymbolId() { return xdfgetChildCenterSymbolId(); }

    public Map<String, TCenterSymbolCQ> getChildCenterSymbolId_InScopeRelation_TCenterSymbolSelf() { return xgetSQueMap("childCenterSymbolId_InScopeRelation_TCenterSymbolSelf"); }
    public String keepChildCenterSymbolId_InScopeRelation_TCenterSymbolSelf(TCenterSymbolCQ sq) { return xkeepSQue("childCenterSymbolId_InScopeRelation_TCenterSymbolSelf", sq); }

    public Map<String, TCenterSymbolCQ> getChildCenterSymbolId_NotInScopeRelation_TCenterSymbolSelf() { return xgetSQueMap("childCenterSymbolId_NotInScopeRelation_TCenterSymbolSelf"); }
    public String keepChildCenterSymbolId_NotInScopeRelation_TCenterSymbolSelf(TCenterSymbolCQ sq) { return xkeepSQue("childCenterSymbolId_NotInScopeRelation_TCenterSymbolSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_ChildCenterSymbolId_Asc() { regOBA("CHILD_CENTER_SYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_ChildCenterSymbolId_Desc() { regOBD("CHILD_CENTER_SYMBOL_ID"); return this; }

    protected ConditionValue _sortstockNumber;
    public ConditionValue xdfgetSortstockNumber()
    { if (_sortstockNumber == null) { _sortstockNumber = nCV(); }
      return _sortstockNumber; }
    protected ConditionValue xgetCValueSortstockNumber() { return xdfgetSortstockNumber(); }

    /**
     * Add order-by as ascend. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_SortstockNumber_Asc() { regOBA("SORTSTOCK_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_SortstockNumber_Desc() { regOBD("SORTSTOCK_NUMBER"); return this; }

    protected ConditionValue _qrCode;
    public ConditionValue xdfgetQrCode()
    { if (_qrCode == null) { _qrCode = nCV(); }
      return _qrCode; }
    protected ConditionValue xgetCValueQrCode() { return xdfgetQrCode(); }

    /**
     * Add order-by as ascend. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_QrCode_Asc() { regOBA("QR_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QR_CODE: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_QrCode_Desc() { regOBD("QR_CODE"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _caseMoveSts;
    public ConditionValue xdfgetCaseMoveSts()
    { if (_caseMoveSts == null) { _caseMoveSts = nCV(); }
      return _caseMoveSts; }
    protected ConditionValue xgetCValueCaseMoveSts() { return xdfgetCaseMoveSts(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_CaseMoveSts_Asc() { regOBA("CASE_MOVE_STS"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_CaseMoveSts_Desc() { regOBD("CASE_MOVE_STS"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCenterSymbolCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCenterSymbolCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCenterSymbolCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCenterSymbolCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TCenterSymbolCQ bq = (TCenterSymbolCQ)bqs;
        TCenterSymbolCQ uq = (TCenterSymbolCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryTCenterSymbolSelf()) {
            uq.queryTCenterSymbolSelf().reflectRelationOnUnionQuery(bq.queryTCenterSymbolSelf(), uq.queryTCenterSymbolSelf());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryTTrsymbol()) {
            uq.queryTTrsymbol().reflectRelationOnUnionQuery(bq.queryTTrsymbol(), uq.queryTTrsymbol());
        }
        if (bq.hasConditionQueryTPallet()) {
            uq.queryTPallet().reflectRelationOnUnionQuery(bq.queryTPallet(), uq.queryTPallet());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("T_CENTER_SYMBOL", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_CENTER_SYMBOL by my CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public TCenterSymbolCQ queryTCenterSymbolSelf() {
        return xdfgetConditionQueryTCenterSymbolSelf();
    }
    public TCenterSymbolCQ xdfgetConditionQueryTCenterSymbolSelf() {
        String prop = "tCenterSymbolSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTCenterSymbolSelf()); xsetupOuterJoinTCenterSymbolSelf(); }
        return xgetQueRlMap(prop);
    }
    protected TCenterSymbolCQ xcreateQueryTCenterSymbolSelf() {
        String nrp = xresolveNRP("T_CENTER_SYMBOL", "tCenterSymbolSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TCenterSymbolCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tCenterSymbolSelf", nrp);
    }
    protected void xsetupOuterJoinTCenterSymbolSelf() { xregOutJo("tCenterSymbolSelf"); }
    public boolean hasConditionQueryTCenterSymbolSelf() { return xhasQueRlMap("tCenterSymbolSelf"); }

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
        String nrp = xresolveNRP("T_CENTER_SYMBOL", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_TRSYMBOL by my TRSYMBOL_ID, named 'TTrsymbol'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrsymbolCQ queryTTrsymbol() {
        return xdfgetConditionQueryTTrsymbol();
    }
    public TTrsymbolCQ xdfgetConditionQueryTTrsymbol() {
        String prop = "tTrsymbol";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrsymbol()); xsetupOuterJoinTTrsymbol(); }
        return xgetQueRlMap(prop);
    }
    protected TTrsymbolCQ xcreateQueryTTrsymbol() {
        String nrp = xresolveNRP("T_CENTER_SYMBOL", "tTrsymbol"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrsymbolCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrsymbol", nrp);
    }
    protected void xsetupOuterJoinTTrsymbol() { xregOutJo("tTrsymbol"); }
    public boolean hasConditionQueryTTrsymbol() { return xhasQueRlMap("tTrsymbol"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PALLET by my PALLET_ID, named 'TPallet'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPalletCQ queryTPallet() {
        return xdfgetConditionQueryTPallet();
    }
    public TPalletCQ xdfgetConditionQueryTPallet() {
        String prop = "tPallet";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPallet()); xsetupOuterJoinTPallet(); }
        return xgetQueRlMap(prop);
    }
    protected TPalletCQ xcreateQueryTPallet() {
        String nrp = xresolveNRP("T_CENTER_SYMBOL", "tPallet"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPalletCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPallet", nrp);
    }
    protected void xsetupOuterJoinTPallet() { xregOutJo("tPallet"); }
    public boolean hasConditionQueryTPallet() { return xhasQueRlMap("tPallet"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TCenterSymbolCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCenterSymbolCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCenterSymbolCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCenterSymbolCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCenterSymbolCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCenterSymbolCQ> _myselfExistsMap;
    public Map<String, TCenterSymbolCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCenterSymbolCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCenterSymbolCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCenterSymbolCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCenterSymbolCB.class.getName(); }
    protected String xCQ() { return TCenterSymbolCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
