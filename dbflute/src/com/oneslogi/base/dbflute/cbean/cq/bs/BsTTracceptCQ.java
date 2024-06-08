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
 * The base condition-query of T_TRACCEPT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTracceptCQ extends AbstractBsTTracceptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTracceptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTracceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRACCEPT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTracceptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTracceptCIQ xcreateCIQ() {
        TTracceptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTracceptCIQ xnewCIQ() {
        return new TTracceptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRACCEPT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTracceptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTracceptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tracceptId;
    public ConditionValue xdfgetTracceptId()
    { if (_tracceptId == null) { _tracceptId = nCV(); }
      return _tracceptId; }
    protected ConditionValue xgetCValueTracceptId() { return xdfgetTracceptId(); }

    /**
     * Add order-by as ascend. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_TracceptId_Asc() { regOBA("TRACCEPT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_TracceptId_Desc() { regOBD("TRACCEPT_ID"); return this; }

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
    public BsTTracceptCQ addOrderBy_Prekey_Asc() { regOBA("PREKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Prekey_Desc() { regOBD("PREKEY"); return this; }

    protected ConditionValue _accepttype;
    public ConditionValue xdfgetAccepttype()
    { if (_accepttype == null) { _accepttype = nCV(); }
      return _accepttype; }
    protected ConditionValue xgetCValueAccepttype() { return xdfgetAccepttype(); }

    /**
     * Add order-by as ascend. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Accepttype_Asc() { regOBA("ACCEPTTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Accepttype_Desc() { regOBD("ACCEPTTYPE"); return this; }

    protected ConditionValue _acceptgroup;
    public ConditionValue xdfgetAcceptgroup()
    { if (_acceptgroup == null) { _acceptgroup = nCV(); }
      return _acceptgroup; }
    protected ConditionValue xgetCValueAcceptgroup() { return xdfgetAcceptgroup(); }

    /**
     * Add order-by as ascend. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Acceptgroup_Asc() { regOBA("ACCEPTGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Acceptgroup_Desc() { regOBD("ACCEPTGROUP"); return this; }

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
    public BsTTracceptCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

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
    public BsTTracceptCQ addOrderBy_Logisticscd_Asc() { regOBA("LOGISTICSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Logisticscd_Desc() { regOBD("LOGISTICSCD"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

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
    public BsTTracceptCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

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
    public BsTTracceptCQ addOrderBy_Inspectedusercd_Asc() { regOBA("INSPECTEDUSERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Inspectedusercd_Desc() { regOBD("INSPECTEDUSERCD"); return this; }

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
    public BsTTracceptCQ addOrderBy_Carriercd_Asc() { regOBA("CARRIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Carriercd_Desc() { regOBD("CARRIERCD"); return this; }

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
    public BsTTracceptCQ addOrderBy_Carriername_Asc() { regOBA("CARRIERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Carriername_Desc() { regOBD("CARRIERNAME"); return this; }

    protected ConditionValue _carrierwbno;
    public ConditionValue xdfgetCarrierwbno()
    { if (_carrierwbno == null) { _carrierwbno = nCV(); }
      return _carrierwbno; }
    protected ConditionValue xgetCValueCarrierwbno() { return xdfgetCarrierwbno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERWBNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Carrierwbno_Asc() { regOBA("CARRIERWBNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERWBNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Carrierwbno_Desc() { regOBD("CARRIERWBNO"); return this; }

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
    public BsTTracceptCQ addOrderBy_Deliverycd_Asc() { regOBA("DELIVERYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Deliverycd_Desc() { regOBD("DELIVERYCD"); return this; }

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
    public BsTTracceptCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

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
    public BsTTracceptCQ addOrderBy_Carriersname_Asc() { regOBA("CARRIERSNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Carriersname_Desc() { regOBD("CARRIERSNAME"); return this; }

    protected ConditionValue _actualtime;
    public ConditionValue xdfgetActualtime()
    { if (_actualtime == null) { _actualtime = nCV(); }
      return _actualtime; }
    protected ConditionValue xgetCValueActualtime() { return xdfgetActualtime(); }

    /**
     * Add order-by as ascend. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Actualtime_Asc() { regOBA("ACTUALTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Actualtime_Desc() { regOBD("ACTUALTIME"); return this; }

    protected ConditionValue _completetime;
    public ConditionValue xdfgetCompletetime()
    { if (_completetime == null) { _completetime = nCV(); }
      return _completetime; }
    protected ConditionValue xgetCValueCompletetime() { return xdfgetCompletetime(); }

    /**
     * Add order-by as ascend. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Completetime_Asc() { regOBA("COMPLETETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Completetime_Desc() { regOBD("COMPLETETIME"); return this; }

    protected ConditionValue _acceptlinetotal;
    public ConditionValue xdfgetAcceptlinetotal()
    { if (_acceptlinetotal == null) { _acceptlinetotal = nCV(); }
      return _acceptlinetotal; }
    protected ConditionValue xgetCValueAcceptlinetotal() { return xdfgetAcceptlinetotal(); }

    /**
     * Add order-by as ascend. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Acceptlinetotal_Asc() { regOBA("ACCEPTLINETOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Acceptlinetotal_Desc() { regOBD("ACCEPTLINETOTAL"); return this; }

    protected ConditionValue _taglabelprintflg;
    public ConditionValue xdfgetTaglabelprintflg()
    { if (_taglabelprintflg == null) { _taglabelprintflg = nCV(); }
      return _taglabelprintflg; }
    protected ConditionValue xgetCValueTaglabelprintflg() { return xdfgetTaglabelprintflg(); }

    /**
     * Add order-by as ascend. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Taglabelprintflg_Asc() { regOBA("TAGLABELPRINTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_Taglabelprintflg_Desc() { regOBD("TAGLABELPRINTFLG"); return this; }

    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

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
    public BsTTracceptCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTracceptCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTracceptCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTracceptCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTracceptCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTracceptCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTracceptCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTracceptCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTracceptCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTracceptCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTracceptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTracceptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTracceptCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTracceptCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTracceptCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTracceptCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTracceptCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTracceptCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTracceptCQ> _myselfExistsMap;
    public Map<String, TTracceptCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTracceptCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTracceptCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTracceptCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTracceptCB.class.getName(); }
    protected String xCQ() { return TTracceptCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
