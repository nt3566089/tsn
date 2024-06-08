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
 * The base condition-query of T_TRSOJT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsojtCQ extends AbstractBsTTrsojtCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsojtCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsojtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSOJT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrsojtCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrsojtCIQ xcreateCIQ() {
        TTrsojtCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrsojtCIQ xnewCIQ() {
        return new TTrsojtCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSOJT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrsojtCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrsojtCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sojtid;
    public ConditionValue xdfgetSojtid()
    { if (_sojtid == null) { _sojtid = nCV(); }
      return _sojtid; }
    protected ConditionValue xgetCValueSojtid() { return xdfgetSojtid(); }

    /**
     * Add order-by as ascend. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Sojtid_Asc() { regOBA("SOJTID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Sojtid_Desc() { regOBD("SOJTID"); return this; }

    protected ConditionValue _sojtkey;
    public ConditionValue xdfgetSojtkey()
    { if (_sojtkey == null) { _sojtkey = nCV(); }
      return _sojtkey; }
    protected ConditionValue xgetCValueSojtkey() { return xdfgetSojtkey(); }

    /**
     * Add order-by as ascend. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Sojtkey_Asc() { regOBA("SOJTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Sojtkey_Desc() { regOBD("SOJTKEY"); return this; }

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
    public BsTTrsojtCQ addOrderBy_Ownersono_Asc() { regOBA("OWNERSONO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Ownersono_Desc() { regOBD("OWNERSONO"); return this; }

    protected ConditionValue _customerCd;
    public ConditionValue xdfgetCustomerCd()
    { if (_customerCd == null) { _customerCd = nCV(); }
      return _customerCd; }
    protected ConditionValue xgetCValueCustomerCd() { return xdfgetCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _orderdate;
    public ConditionValue xdfgetOrderdate()
    { if (_orderdate == null) { _orderdate = nCV(); }
      return _orderdate; }
    protected ConditionValue xgetCValueOrderdate() { return xdfgetOrderdate(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Orderdate_Asc() { regOBA("ORDERDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Orderdate_Desc() { regOBD("ORDERDATE"); return this; }

    protected ConditionValue _planseq;
    public ConditionValue xdfgetPlanseq()
    { if (_planseq == null) { _planseq = nCV(); }
      return _planseq; }
    protected ConditionValue xgetCValuePlanseq() { return xdfgetPlanseq(); }

    /**
     * Add order-by as ascend. <br>
     * PLANSEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planseq_Asc() { regOBA("PLANSEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANSEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planseq_Desc() { regOBD("PLANSEQ"); return this; }

    protected ConditionValue _planrcvdatetime;
    public ConditionValue xdfgetPlanrcvdatetime()
    { if (_planrcvdatetime == null) { _planrcvdatetime = nCV(); }
      return _planrcvdatetime; }
    protected ConditionValue xgetCValuePlanrcvdatetime() { return xdfgetPlanrcvdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planrcvdatetime_Asc() { regOBA("PLANRCVDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planrcvdatetime_Desc() { regOBD("PLANRCVDATETIME"); return this; }

    protected ConditionValue _beforeplanseq;
    public ConditionValue xdfgetBeforeplanseq()
    { if (_beforeplanseq == null) { _beforeplanseq = nCV(); }
      return _beforeplanseq; }
    protected ConditionValue xgetCValueBeforeplanseq() { return xdfgetBeforeplanseq(); }

    /**
     * Add order-by as ascend. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Beforeplanseq_Asc() { regOBA("BEFOREPLANSEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * BEFOREPLANSEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Beforeplanseq_Desc() { regOBD("BEFOREPLANSEQ"); return this; }

    protected ConditionValue _planrcvflg;
    public ConditionValue xdfgetPlanrcvflg()
    { if (_planrcvflg == null) { _planrcvflg = nCV(); }
      return _planrcvflg; }
    protected ConditionValue xgetCValuePlanrcvflg() { return xdfgetPlanrcvflg(); }

    /**
     * Add order-by as ascend. <br>
     * PLANRCVFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planrcvflg_Asc() { regOBA("PLANRCVFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANRCVFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planrcvflg_Desc() { regOBD("PLANRCVFLG"); return this; }

    protected ConditionValue _htopeflg;
    public ConditionValue xdfgetHtopeflg()
    { if (_htopeflg == null) { _htopeflg = nCV(); }
      return _htopeflg; }
    protected ConditionValue xgetCValueHtopeflg() { return xdfgetHtopeflg(); }

    /**
     * Add order-by as ascend. <br>
     * HTOPEFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Htopeflg_Asc() { regOBA("HTOPEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * HTOPEFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Htopeflg_Desc() { regOBD("HTOPEFLG"); return this; }

    protected ConditionValue _trsoadddate;
    public ConditionValue xdfgetTrsoadddate()
    { if (_trsoadddate == null) { _trsoadddate = nCV(); }
      return _trsoadddate; }
    protected ConditionValue xgetCValueTrsoadddate() { return xdfgetTrsoadddate(); }

    /**
     * Add order-by as ascend. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Trsoadddate_Asc() { regOBA("TRSOADDDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSOADDDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Trsoadddate_Desc() { regOBD("TRSOADDDATE"); return this; }

    protected ConditionValue _trsoaddflg;
    public ConditionValue xdfgetTrsoaddflg()
    { if (_trsoaddflg == null) { _trsoaddflg = nCV(); }
      return _trsoaddflg; }
    protected ConditionValue xgetCValueTrsoaddflg() { return xdfgetTrsoaddflg(); }

    /**
     * Add order-by as ascend. <br>
     * TRSOADDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Trsoaddflg_Asc() { regOBA("TRSOADDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSOADDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Trsoaddflg_Desc() { regOBD("TRSOADDFLG"); return this; }

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
    public BsTTrsojtCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

    protected ConditionValue _planname;
    public ConditionValue xdfgetPlanname()
    { if (_planname == null) { _planname = nCV(); }
      return _planname; }
    protected ConditionValue xgetCValuePlanname() { return xdfgetPlanname(); }

    /**
     * Add order-by as ascend. <br>
     * PLANNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planname_Asc() { regOBA("PLANNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planname_Desc() { regOBD("PLANNAME"); return this; }

    protected ConditionValue _planpost;
    public ConditionValue xdfgetPlanpost()
    { if (_planpost == null) { _planpost = nCV(); }
      return _planpost; }
    protected ConditionValue xgetCValuePlanpost() { return xdfgetPlanpost(); }

    /**
     * Add order-by as ascend. <br>
     * PLANPOST: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planpost_Asc() { regOBA("PLANPOST"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANPOST: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planpost_Desc() { regOBD("PLANPOST"); return this; }

    protected ConditionValue _planaddress;
    public ConditionValue xdfgetPlanaddress()
    { if (_planaddress == null) { _planaddress = nCV(); }
      return _planaddress; }
    protected ConditionValue xgetCValuePlanaddress() { return xdfgetPlanaddress(); }

    /**
     * Add order-by as ascend. <br>
     * PLANADDRESS: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planaddress_Asc() { regOBA("PLANADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANADDRESS: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planaddress_Desc() { regOBD("PLANADDRESS"); return this; }

    protected ConditionValue _planwarehousename;
    public ConditionValue xdfgetPlanwarehousename()
    { if (_planwarehousename == null) { _planwarehousename = nCV(); }
      return _planwarehousename; }
    protected ConditionValue xgetCValuePlanwarehousename() { return xdfgetPlanwarehousename(); }

    /**
     * Add order-by as ascend. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planwarehousename_Asc() { regOBA("PLANWAREHOUSENAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANWAREHOUSENAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_Planwarehousename_Desc() { regOBD("PLANWAREHOUSENAME"); return this; }

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
    public BsTTrsojtCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTTrsojtCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrsojtCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrsojtCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrsojtCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrsojtCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrsojtCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrsojtCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrsojtCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrsojtCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrsojtCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsojtCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrsojtCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrsojtCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrsojtCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrsojtCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrsojtCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrsojtCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrsojtCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrsojtCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrsojtCQ> _myselfExistsMap;
    public Map<String, TTrsojtCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrsojtCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrsojtCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrsojtCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrsojtCB.class.getName(); }
    protected String xCQ() { return TTrsojtCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}