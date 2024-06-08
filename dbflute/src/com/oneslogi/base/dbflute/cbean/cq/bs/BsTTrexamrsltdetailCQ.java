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
 * The base condition-query of T_TREXAMRSLTDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrexamrsltdetailCQ extends AbstractBsTTrexamrsltdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrexamrsltdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrexamrsltdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TREXAMRSLTDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrexamrsltdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrexamrsltdetailCIQ xcreateCIQ() {
        TTrexamrsltdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrexamrsltdetailCIQ xnewCIQ() {
        return new TTrexamrsltdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TREXAMRSLTDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrexamrsltdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrexamrsltdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trexamrsltdetailId;
    public ConditionValue xdfgetTrexamrsltdetailId()
    { if (_trexamrsltdetailId == null) { _trexamrsltdetailId = nCV(); }
      return _trexamrsltdetailId; }
    protected ConditionValue xgetCValueTrexamrsltdetailId() { return xdfgetTrexamrsltdetailId(); }

    /**
     * Add order-by as ascend. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_TrexamrsltdetailId_Asc() { regOBA("TREXAMRSLTDETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_TrexamrsltdetailId_Desc() { regOBD("TREXAMRSLTDETAIL_ID"); return this; }

    protected ConditionValue _trexamresultId;
    public ConditionValue xdfgetTrexamresultId()
    { if (_trexamresultId == null) { _trexamresultId = nCV(); }
      return _trexamresultId; }
    protected ConditionValue xgetCValueTrexamresultId() { return xdfgetTrexamresultId(); }

    /**
     * Add order-by as ascend. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_TrexamresultId_Asc() { regOBA("TREXAMRESULT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_TrexamresultId_Desc() { regOBD("TREXAMRESULT_ID"); return this; }

    protected ConditionValue _examlineno;
    public ConditionValue xdfgetExamlineno()
    { if (_examlineno == null) { _examlineno = nCV(); }
      return _examlineno; }
    protected ConditionValue xgetCValueExamlineno() { return xdfgetExamlineno(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Examlineno_Asc() { regOBA("EXAMLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Examlineno_Desc() { regOBD("EXAMLINENO"); return this; }

    protected ConditionValue _zaikoinvId;
    public ConditionValue xdfgetZaikoinvId()
    { if (_zaikoinvId == null) { _zaikoinvId = nCV(); }
      return _zaikoinvId; }
    protected ConditionValue xgetCValueZaikoinvId() { return xdfgetZaikoinvId(); }

    /**
     * Add order-by as ascend. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_ZaikoinvId_Asc() { regOBA("ZAIKOINV_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZAIKOINV_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_ZaikoinvId_Desc() { regOBD("ZAIKOINV_ID"); return this; }

    protected ConditionValue _zaikoinv;
    public ConditionValue xdfgetZaikoinv()
    { if (_zaikoinv == null) { _zaikoinv = nCV(); }
      return _zaikoinv; }
    protected ConditionValue xgetCValueZaikoinv() { return xdfgetZaikoinv(); }

    /**
     * Add order-by as ascend. <br>
     * ZAIKOINV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Zaikoinv_Asc() { regOBA("ZAIKOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZAIKOINV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Zaikoinv_Desc() { regOBD("ZAIKOINV"); return this; }

    protected ConditionValue _examqty;
    public ConditionValue xdfgetExamqty()
    { if (_examqty == null) { _examqty = nCV(); }
      return _examqty; }
    protected ConditionValue xgetCValueExamqty() { return xdfgetExamqty(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Examqty_Asc() { regOBA("EXAMQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Examqty_Desc() { regOBD("EXAMQTY"); return this; }

    protected ConditionValue _res40qty1;
    public ConditionValue xdfgetRes40qty1()
    { if (_res40qty1 == null) { _res40qty1 = nCV(); }
      return _res40qty1; }
    protected ConditionValue xgetCValueRes40qty1() { return xdfgetRes40qty1(); }

    /**
     * Add order-by as ascend. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Res40qty1_Asc() { regOBA("RES40QTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Res40qty1_Desc() { regOBD("RES40QTY1"); return this; }

    protected ConditionValue _res40qty2;
    public ConditionValue xdfgetRes40qty2()
    { if (_res40qty2 == null) { _res40qty2 = nCV(); }
      return _res40qty2; }
    protected ConditionValue xgetCValueRes40qty2() { return xdfgetRes40qty2(); }

    /**
     * Add order-by as ascend. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Res40qty2_Asc() { regOBA("RES40QTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Res40qty2_Desc() { regOBD("RES40QTY2"); return this; }

    protected ConditionValue _inferiorqty;
    public ConditionValue xdfgetInferiorqty()
    { if (_inferiorqty == null) { _inferiorqty = nCV(); }
      return _inferiorqty; }
    protected ConditionValue xgetCValueInferiorqty() { return xdfgetInferiorqty(); }

    /**
     * Add order-by as ascend. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Inferiorqty_Asc() { regOBA("INFERIORQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Inferiorqty_Desc() { regOBD("INFERIORQTY"); return this; }

    protected ConditionValue _aftzaikoinvId;
    public ConditionValue xdfgetAftzaikoinvId()
    { if (_aftzaikoinvId == null) { _aftzaikoinvId = nCV(); }
      return _aftzaikoinvId; }
    protected ConditionValue xgetCValueAftzaikoinvId() { return xdfgetAftzaikoinvId(); }

    /**
     * Add order-by as ascend. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_AftzaikoinvId_Asc() { regOBA("AFTZAIKOINV_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTZAIKOINV_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_AftzaikoinvId_Desc() { regOBD("AFTZAIKOINV_ID"); return this; }

    protected ConditionValue _aftzaikoinv;
    public ConditionValue xdfgetAftzaikoinv()
    { if (_aftzaikoinv == null) { _aftzaikoinv = nCV(); }
      return _aftzaikoinv; }
    protected ConditionValue xgetCValueAftzaikoinv() { return xdfgetAftzaikoinv(); }

    /**
     * Add order-by as ascend. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Aftzaikoinv_Asc() { regOBA("AFTZAIKOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Aftzaikoinv_Desc() { regOBD("AFTZAIKOINV"); return this; }

    protected ConditionValue _reservationflg;
    public ConditionValue xdfgetReservationflg()
    { if (_reservationflg == null) { _reservationflg = nCV(); }
      return _reservationflg; }
    protected ConditionValue xgetCValueReservationflg() { return xdfgetReservationflg(); }

    /**
     * Add order-by as ascend. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Reservationflg_Asc() { regOBA("RESERVATIONFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Reservationflg_Desc() { regOBD("RESERVATIONFLG"); return this; }

    protected ConditionValue _examdetailsts;
    public ConditionValue xdfgetExamdetailsts()
    { if (_examdetailsts == null) { _examdetailsts = nCV(); }
      return _examdetailsts; }
    protected ConditionValue xgetCValueExamdetailsts() { return xdfgetExamdetailsts(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Examdetailsts_Asc() { regOBA("EXAMDETAILSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Examdetailsts_Desc() { regOBD("EXAMDETAILSTS"); return this; }

    protected ConditionValue _examdate;
    public ConditionValue xdfgetExamdate()
    { if (_examdate == null) { _examdate = nCV(); }
      return _examdate; }
    protected ConditionValue xgetCValueExamdate() { return xdfgetExamdate(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Examdate_Asc() { regOBA("EXAMDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Examdate_Desc() { regOBD("EXAMDATE"); return this; }

    protected ConditionValue _notexamqty;
    public ConditionValue xdfgetNotexamqty()
    { if (_notexamqty == null) { _notexamqty = nCV(); }
      return _notexamqty; }
    protected ConditionValue xgetCValueNotexamqty() { return xdfgetNotexamqty(); }

    /**
     * Add order-by as ascend. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Notexamqty_Asc() { regOBA("NOTEXAMQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_Notexamqty_Desc() { regOBD("NOTEXAMQTY"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrexamrsltdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrexamrsltdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrexamrsltdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrexamrsltdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrexamrsltdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrexamrsltdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrexamrsltdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrexamrsltdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrexamrsltdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrexamrsltdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrexamrsltdetailCQ> _myselfExistsMap;
    public Map<String, TTrexamrsltdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrexamrsltdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrexamrsltdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrexamrsltdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrexamrsltdetailCB.class.getName(); }
    protected String xCQ() { return TTrexamrsltdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
