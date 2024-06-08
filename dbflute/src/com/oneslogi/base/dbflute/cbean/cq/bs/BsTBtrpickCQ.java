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
 * The base condition-query of T_BTRPICK.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBtrpickCQ extends AbstractBsTBtrpickCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBtrpickCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBtrpickCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_BTRPICK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBtrpickCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBtrpickCIQ xcreateCIQ() {
        TBtrpickCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBtrpickCIQ xnewCIQ() {
        return new TBtrpickCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_BTRPICK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBtrpickCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBtrpickCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pickingInstId;
    public ConditionValue xdfgetPickingInstId()
    { if (_pickingInstId == null) { _pickingInstId = nCV(); }
      return _pickingInstId; }
    protected ConditionValue xgetCValuePickingInstId() { return xdfgetPickingInstId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_PickingInstId_Asc() { regOBA("PICKING_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_PickingInstId_Desc() { regOBD("PICKING_INST_ID"); return this; }

    protected ConditionValue _pickbatchkey;
    public ConditionValue xdfgetPickbatchkey()
    { if (_pickbatchkey == null) { _pickbatchkey = nCV(); }
      return _pickbatchkey; }
    protected ConditionValue xgetCValuePickbatchkey() { return xdfgetPickbatchkey(); }

    /**
     * Add order-by as ascend. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickbatchkey_Asc() { regOBA("PICKBATCHKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickbatchkey_Desc() { regOBD("PICKBATCHKEY"); return this; }

    protected ConditionValue _pickbatchtype;
    public ConditionValue xdfgetPickbatchtype()
    { if (_pickbatchtype == null) { _pickbatchtype = nCV(); }
      return _pickbatchtype; }
    protected ConditionValue xgetCValuePickbatchtype() { return xdfgetPickbatchtype(); }

    /**
     * Add order-by as ascend. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickbatchtype_Asc() { regOBA("PICKBATCHTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickbatchtype_Desc() { regOBD("PICKBATCHTYPE"); return this; }

    protected ConditionValue _pickbatchgroup;
    public ConditionValue xdfgetPickbatchgroup()
    { if (_pickbatchgroup == null) { _pickbatchgroup = nCV(); }
      return _pickbatchgroup; }
    protected ConditionValue xgetCValuePickbatchgroup() { return xdfgetPickbatchgroup(); }

    /**
     * Add order-by as ascend. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickbatchgroup_Asc() { regOBA("PICKBATCHGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickbatchgroup_Desc() { regOBD("PICKBATCHGROUP"); return this; }

    protected ConditionValue _pickdate;
    public ConditionValue xdfgetPickdate()
    { if (_pickdate == null) { _pickdate = nCV(); }
      return _pickdate; }
    protected ConditionValue xgetCValuePickdate() { return xdfgetPickdate(); }

    /**
     * Add order-by as ascend. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickdate_Asc() { regOBA("PICKDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickdate_Desc() { regOBD("PICKDATE"); return this; }

    protected ConditionValue _pickstartdate;
    public ConditionValue xdfgetPickstartdate()
    { if (_pickstartdate == null) { _pickstartdate = nCV(); }
      return _pickstartdate; }
    protected ConditionValue xgetCValuePickstartdate() { return xdfgetPickstartdate(); }

    /**
     * Add order-by as ascend. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickstartdate_Asc() { regOBA("PICKSTARTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickstartdate_Desc() { regOBD("PICKSTARTDATE"); return this; }

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
    public BsTBtrpickCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _shipdate;
    public ConditionValue xdfgetShipdate()
    { if (_shipdate == null) { _shipdate = nCV(); }
      return _shipdate; }
    protected ConditionValue xgetCValueShipdate() { return xdfgetShipdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Shipdate_Asc() { regOBA("SHIPDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Shipdate_Desc() { regOBD("SHIPDATE"); return this; }

    protected ConditionValue _delivschdate;
    public ConditionValue xdfgetDelivschdate()
    { if (_delivschdate == null) { _delivschdate = nCV(); }
      return _delivschdate; }
    protected ConditionValue xgetCValueDelivschdate() { return xdfgetDelivschdate(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Delivschdate_Asc() { regOBA("DELIVSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Delivschdate_Desc() { regOBD("DELIVSCHDATE"); return this; }

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
    public BsTBtrpickCQ addOrderBy_Allocgroup_Asc() { regOBA("ALLOCGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Allocgroup_Desc() { regOBD("ALLOCGROUP"); return this; }

    protected ConditionValue _soid;
    public ConditionValue xdfgetSoid()
    { if (_soid == null) { _soid = nCV(); }
      return _soid; }
    protected ConditionValue xgetCValueSoid() { return xdfgetSoid(); }

    /**
     * Add order-by as ascend. <br>
     * SOID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

    protected ConditionValue _picklinetotal;
    public ConditionValue xdfgetPicklinetotal()
    { if (_picklinetotal == null) { _picklinetotal = nCV(); }
      return _picklinetotal; }
    protected ConditionValue xgetCValuePicklinetotal() { return xdfgetPicklinetotal(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Picklinetotal_Asc() { regOBA("PICKLINETOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Picklinetotal_Desc() { regOBD("PICKLINETOTAL"); return this; }

    protected ConditionValue _pickingway;
    public ConditionValue xdfgetPickingway()
    { if (_pickingway == null) { _pickingway = nCV(); }
      return _pickingway; }
    protected ConditionValue xgetCValuePickingway() { return xdfgetPickingway(); }

    /**
     * Add order-by as ascend. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickingway_Asc() { regOBA("PICKINGWAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Pickingway_Desc() { regOBD("PICKINGWAY"); return this; }

    protected ConditionValue _execkey;
    public ConditionValue xdfgetExeckey()
    { if (_execkey == null) { _execkey = nCV(); }
      return _execkey; }
    protected ConditionValue xgetCValueExeckey() { return xdfgetExeckey(); }

    /**
     * Add order-by as ascend. <br>
     * EXECKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Execkey_Asc() { regOBA("EXECKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXECKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_Execkey_Desc() { regOBD("EXECKEY"); return this; }

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
    public BsTBtrpickCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTBtrpickCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTBtrpickCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBtrpickCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBtrpickCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBtrpickCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBtrpickCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBtrpickCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBtrpickCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBtrpickCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBtrpickCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTBtrpickCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBtrpickCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBtrpickCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBtrpickCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBtrpickCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBtrpickCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBtrpickCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBtrpickCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBtrpickCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBtrpickCQ> _myselfExistsMap;
    public Map<String, TBtrpickCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBtrpickCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBtrpickCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBtrpickCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBtrpickCB.class.getName(); }
    protected String xCQ() { return TBtrpickCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
