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
 * The base condition-query of T_TRCASEDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrcasedetailCQ extends AbstractBsTTrcasedetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrcasedetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrcasedetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRCASEDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrcasedetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrcasedetailCIQ xcreateCIQ() {
        TTrcasedetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrcasedetailCIQ xnewCIQ() {
        return new TTrcasedetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRCASEDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrcasedetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrcasedetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trcasedetailId;
    public ConditionValue xdfgetTrcasedetailId()
    { if (_trcasedetailId == null) { _trcasedetailId = nCV(); }
      return _trcasedetailId; }
    protected ConditionValue xgetCValueTrcasedetailId() { return xdfgetTrcasedetailId(); }

    /**
     * Add order-by as ascend. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_TrcasedetailId_Asc() { regOBA("TRCASEDETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_TrcasedetailId_Desc() { regOBD("TRCASEDETAIL_ID"); return this; }

    protected ConditionValue _casedetailno;
    public ConditionValue xdfgetCasedetailno()
    { if (_casedetailno == null) { _casedetailno = nCV(); }
      return _casedetailno; }
    protected ConditionValue xgetCValueCasedetailno() { return xdfgetCasedetailno(); }

    /**
     * Add order-by as ascend. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Casedetailno_Asc() { regOBA("CASEDETAILNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Casedetailno_Desc() { regOBD("CASEDETAILNO"); return this; }

    protected ConditionValue _trsymbolId;
    public ConditionValue xdfgetTrsymbolId()
    { if (_trsymbolId == null) { _trsymbolId = nCV(); }
      return _trsymbolId; }
    protected ConditionValue xgetCValueTrsymbolId() { return xdfgetTrsymbolId(); }

    /**
     * Add order-by as ascend. <br>
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_TrsymbolId_Asc() { regOBA("TRSYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_TrsymbolId_Desc() { regOBD("TRSYMBOL_ID"); return this; }

    protected ConditionValue _createdatetime;
    public ConditionValue xdfgetCreatedatetime()
    { if (_createdatetime == null) { _createdatetime = nCV(); }
      return _createdatetime; }
    protected ConditionValue xgetCValueCreatedatetime() { return xdfgetCreatedatetime(); }

    /**
     * Add order-by as ascend. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Createdatetime_Asc() { regOBA("CREATEDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Createdatetime_Desc() { regOBD("CREATEDATETIME"); return this; }

    protected ConditionValue _tracetypedt;
    public ConditionValue xdfgetTracetypedt()
    { if (_tracetypedt == null) { _tracetypedt = nCV(); }
      return _tracetypedt; }
    protected ConditionValue xgetCValueTracetypedt() { return xdfgetTracetypedt(); }

    /**
     * Add order-by as ascend. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Tracetypedt_Asc() { regOBA("TRACETYPEDT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Tracetypedt_Desc() { regOBD("TRACETYPEDT"); return this; }

    protected ConditionValue _operationnum;
    public ConditionValue xdfgetOperationnum()
    { if (_operationnum == null) { _operationnum = nCV(); }
      return _operationnum; }
    protected ConditionValue xgetCValueOperationnum() { return xdfgetOperationnum(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Operationnum_Asc() { regOBA("OPERATIONNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Operationnum_Desc() { regOBD("OPERATIONNUM"); return this; }

    protected ConditionValue _assortinitnum;
    public ConditionValue xdfgetAssortinitnum()
    { if (_assortinitnum == null) { _assortinitnum = nCV(); }
      return _assortinitnum; }
    protected ConditionValue xgetCValueAssortinitnum() { return xdfgetAssortinitnum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortinitnum_Asc() { regOBA("ASSORTINITNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTINITNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortinitnum_Desc() { regOBD("ASSORTINITNUM"); return this; }

    protected ConditionValue _assortnum;
    public ConditionValue xdfgetAssortnum()
    { if (_assortnum == null) { _assortnum = nCV(); }
      return _assortnum; }
    protected ConditionValue xgetCValueAssortnum() { return xdfgetAssortnum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortnum_Asc() { regOBA("ASSORTNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortnum_Desc() { regOBD("ASSORTNUM"); return this; }

    protected ConditionValue _assortedcd;
    public ConditionValue xdfgetAssortedcd()
    { if (_assortedcd == null) { _assortedcd = nCV(); }
      return _assortedcd; }
    protected ConditionValue xgetCValueAssortedcd() { return xdfgetAssortedcd(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortedcd_Asc() { regOBA("ASSORTEDCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortedcd_Desc() { regOBD("ASSORTEDCD"); return this; }

    protected ConditionValue _assortedunit;
    public ConditionValue xdfgetAssortedunit()
    { if (_assortedunit == null) { _assortedunit = nCV(); }
      return _assortedunit; }
    protected ConditionValue xgetCValueAssortedunit() { return xdfgetAssortedunit(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortedunit_Asc() { regOBA("ASSORTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortedunit_Desc() { regOBD("ASSORTEDUNIT"); return this; }

    protected ConditionValue _assortedindex;
    public ConditionValue xdfgetAssortedindex()
    { if (_assortedindex == null) { _assortedindex = nCV(); }
      return _assortedindex; }
    protected ConditionValue xgetCValueAssortedindex() { return xdfgetAssortedindex(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortedindex_Asc() { regOBA("ASSORTEDINDEX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortedindex_Desc() { regOBD("ASSORTEDINDEX"); return this; }

    protected ConditionValue _assortdifnum;
    public ConditionValue xdfgetAssortdifnum()
    { if (_assortdifnum == null) { _assortdifnum = nCV(); }
      return _assortdifnum; }
    protected ConditionValue xgetCValueAssortdifnum() { return xdfgetAssortdifnum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortdifnum_Asc() { regOBA("ASSORTDIFNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Assortdifnum_Desc() { regOBD("ASSORTDIFNUM"); return this; }

    protected ConditionValue _directioncd;
    public ConditionValue xdfgetDirectioncd()
    { if (_directioncd == null) { _directioncd = nCV(); }
      return _directioncd; }
    protected ConditionValue xgetCValueDirectioncd() { return xdfgetDirectioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Directioncd_Asc() { regOBA("DIRECTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Directioncd_Desc() { regOBD("DIRECTIONCD"); return this; }

    protected ConditionValue _pistontype;
    public ConditionValue xdfgetPistontype()
    { if (_pistontype == null) { _pistontype = nCV(); }
      return _pistontype; }
    protected ConditionValue xgetCValuePistontype() { return xdfgetPistontype(); }

    /**
     * Add order-by as ascend. <br>
     * PISTONTYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Pistontype_Asc() { regOBA("PISTONTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTONTYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Pistontype_Desc() { regOBD("PISTONTYPE"); return this; }

    protected ConditionValue _directionnum;
    public ConditionValue xdfgetDirectionnum()
    { if (_directionnum == null) { _directionnum = nCV(); }
      return _directionnum; }
    protected ConditionValue xgetCValueDirectionnum() { return xdfgetDirectionnum(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Directionnum_Asc() { regOBA("DIRECTIONNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Directionnum_Desc() { regOBD("DIRECTIONNUM"); return this; }

    protected ConditionValue _shiporder;
    public ConditionValue xdfgetShiporder()
    { if (_shiporder == null) { _shiporder = nCV(); }
      return _shiporder; }
    protected ConditionValue xgetCValueShiporder() { return xdfgetShiporder(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Shiporder_Asc() { regOBA("SHIPORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Shiporder_Desc() { regOBD("SHIPORDER"); return this; }

    protected ConditionValue _customercd;
    public ConditionValue xdfgetCustomercd()
    { if (_customercd == null) { _customercd = nCV(); }
      return _customercd; }
    protected ConditionValue xgetCValueCustomercd() { return xdfgetCustomercd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Customercd_Asc() { regOBA("CUSTOMERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMERCD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Customercd_Desc() { regOBD("CUSTOMERCD"); return this; }

    protected ConditionValue _caseserial;
    public ConditionValue xdfgetCaseserial()
    { if (_caseserial == null) { _caseserial = nCV(); }
      return _caseserial; }
    protected ConditionValue xgetCValueCaseserial() { return xdfgetCaseserial(); }

    /**
     * Add order-by as ascend. <br>
     * CASESERIAL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Caseserial_Asc() { regOBA("CASESERIAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASESERIAL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Caseserial_Desc() { regOBD("CASESERIAL"); return this; }

    protected ConditionValue _distwarehousecd;
    public ConditionValue xdfgetDistwarehousecd()
    { if (_distwarehousecd == null) { _distwarehousecd = nCV(); }
      return _distwarehousecd; }
    protected ConditionValue xgetCValueDistwarehousecd() { return xdfgetDistwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Distwarehousecd_Asc() { regOBA("DISTWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Distwarehousecd_Desc() { regOBD("DISTWAREHOUSECD"); return this; }

    protected ConditionValue _sendsts;
    public ConditionValue xdfgetSendsts()
    { if (_sendsts == null) { _sendsts = nCV(); }
      return _sendsts; }
    protected ConditionValue xgetCValueSendsts() { return xdfgetSendsts(); }

    /**
     * Add order-by as ascend. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Sendsts_Asc() { regOBA("SENDSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_Sendsts_Desc() { regOBD("SENDSTS"); return this; }

    protected ConditionValue _dtExtdata1;
    public ConditionValue xdfgetDtExtdata1()
    { if (_dtExtdata1 == null) { _dtExtdata1 = nCV(); }
      return _dtExtdata1; }
    protected ConditionValue xgetCValueDtExtdata1() { return xdfgetDtExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

    protected ConditionValue _dtExtdata2;
    public ConditionValue xdfgetDtExtdata2()
    { if (_dtExtdata2 == null) { _dtExtdata2 = nCV(); }
      return _dtExtdata2; }
    protected ConditionValue xgetCValueDtExtdata2() { return xdfgetDtExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrcasedetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrcasedetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrcasedetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrcasedetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrcasedetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrcasedetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrcasedetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrcasedetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrcasedetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrcasedetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrcasedetailCQ> _myselfExistsMap;
    public Map<String, TTrcasedetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrcasedetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrcasedetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrcasedetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrcasedetailCB.class.getName(); }
    protected String xCQ() { return TTrcasedetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
