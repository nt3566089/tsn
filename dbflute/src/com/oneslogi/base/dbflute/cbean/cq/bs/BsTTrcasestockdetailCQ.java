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
 * The base condition-query of T_TRCASESTOCKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrcasestockdetailCQ extends AbstractBsTTrcasestockdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrcasestockdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrcasestockdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRCASESTOCKDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrcasestockdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrcasestockdetailCIQ xcreateCIQ() {
        TTrcasestockdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrcasestockdetailCIQ xnewCIQ() {
        return new TTrcasestockdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRCASESTOCKDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrcasestockdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrcasestockdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trcasestockdetailId;
    public ConditionValue xdfgetTrcasestockdetailId()
    { if (_trcasestockdetailId == null) { _trcasestockdetailId = nCV(); }
      return _trcasestockdetailId; }
    protected ConditionValue xgetCValueTrcasestockdetailId() { return xdfgetTrcasestockdetailId(); }

    /**
     * Add order-by as ascend. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_TrcasestockdetailId_Asc() { regOBA("TRCASESTOCKDETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_TrcasestockdetailId_Desc() { regOBD("TRCASESTOCKDETAIL_ID"); return this; }

    protected ConditionValue _casestockdetailno;
    public ConditionValue xdfgetCasestockdetailno()
    { if (_casestockdetailno == null) { _casestockdetailno = nCV(); }
      return _casestockdetailno; }
    protected ConditionValue xgetCValueCasestockdetailno() { return xdfgetCasestockdetailno(); }

    /**
     * Add order-by as ascend. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Casestockdetailno_Asc() { regOBA("CASESTOCKDETAILNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Casestockdetailno_Desc() { regOBD("CASESTOCKDETAILNO"); return this; }

    protected ConditionValue _centerSymbolId;
    public ConditionValue xdfgetCenterSymbolId()
    { if (_centerSymbolId == null) { _centerSymbolId = nCV(); }
      return _centerSymbolId; }
    protected ConditionValue xgetCValueCenterSymbolId() { return xdfgetCenterSymbolId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_CenterSymbolId_Asc() { regOBA("CENTER_SYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_CenterSymbolId_Desc() { regOBD("CENTER_SYMBOL_ID"); return this; }

    protected ConditionValue _sortstockdate;
    public ConditionValue xdfgetSortstockdate()
    { if (_sortstockdate == null) { _sortstockdate = nCV(); }
      return _sortstockdate; }
    protected ConditionValue xgetCValueSortstockdate() { return xdfgetSortstockdate(); }

    /**
     * Add order-by as ascend. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Sortstockdate_Asc() { regOBA("SORTSTOCKDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Sortstockdate_Desc() { regOBD("SORTSTOCKDATE"); return this; }

    protected ConditionValue _worktime;
    public ConditionValue xdfgetWorktime()
    { if (_worktime == null) { _worktime = nCV(); }
      return _worktime; }
    protected ConditionValue xgetCValueWorktime() { return xdfgetWorktime(); }

    /**
     * Add order-by as ascend. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Worktime_Asc() { regOBA("WORKTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKTIME: {NotNull, varchar(6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Worktime_Desc() { regOBD("WORKTIME"); return this; }

    protected ConditionValue _sortstockkbn;
    public ConditionValue xdfgetSortstockkbn()
    { if (_sortstockkbn == null) { _sortstockkbn = nCV(); }
      return _sortstockkbn; }
    protected ConditionValue xgetCValueSortstockkbn() { return xdfgetSortstockkbn(); }

    /**
     * Add order-by as ascend. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Sortstockkbn_Asc() { regOBA("SORTSTOCKKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Sortstockkbn_Desc() { regOBD("SORTSTOCKKBN"); return this; }

    protected ConditionValue _operatetimes;
    public ConditionValue xdfgetOperatetimes()
    { if (_operatetimes == null) { _operatetimes = nCV(); }
      return _operatetimes; }
    protected ConditionValue xgetCValueOperatetimes() { return xdfgetOperatetimes(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Operatetimes_Asc() { regOBA("OPERATETIMES"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Operatetimes_Desc() { regOBD("OPERATETIMES"); return this; }

    protected ConditionValue _sotedunit;
    public ConditionValue xdfgetSotedunit()
    { if (_sotedunit == null) { _sotedunit = nCV(); }
      return _sotedunit; }
    protected ConditionValue xgetCValueSotedunit() { return xdfgetSotedunit(); }

    /**
     * Add order-by as ascend. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Sotedunit_Asc() { regOBA("SOTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Sotedunit_Desc() { regOBD("SOTEDUNIT"); return this; }

    protected ConditionValue _sortloccd;
    public ConditionValue xdfgetSortloccd()
    { if (_sortloccd == null) { _sortloccd = nCV(); }
      return _sortloccd; }
    protected ConditionValue xgetCValueSortloccd() { return xdfgetSortloccd(); }

    /**
     * Add order-by as ascend. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Sortloccd_Asc() { regOBA("SORTLOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTLOCCD: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Sortloccd_Desc() { regOBD("SORTLOCCD"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _operateqty;
    public ConditionValue xdfgetOperateqty()
    { if (_operateqty == null) { _operateqty = nCV(); }
      return _operateqty; }
    protected ConditionValue xgetCValueOperateqty() { return xdfgetOperateqty(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATEQTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Operateqty_Asc() { regOBA("OPERATEQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATEQTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Operateqty_Desc() { regOBD("OPERATEQTY"); return this; }

    protected ConditionValue _manufacturedate;
    public ConditionValue xdfgetManufacturedate()
    { if (_manufacturedate == null) { _manufacturedate = nCV(); }
      return _manufacturedate; }
    protected ConditionValue xgetCValueManufacturedate() { return xdfgetManufacturedate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Manufacturedate_Asc() { regOBA("MANUFACTUREDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Manufacturedate_Desc() { regOBD("MANUFACTUREDATE"); return this; }

    protected ConditionValue _confirmno;
    public ConditionValue xdfgetConfirmno()
    { if (_confirmno == null) { _confirmno = nCV(); }
      return _confirmno; }
    protected ConditionValue xgetCValueConfirmno() { return xdfgetConfirmno(); }

    /**
     * Add order-by as ascend. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Confirmno_Asc() { regOBA("CONFIRMNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONFIRMNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Confirmno_Desc() { regOBD("CONFIRMNO"); return this; }

    protected ConditionValue _printdatetime;
    public ConditionValue xdfgetPrintdatetime()
    { if (_printdatetime == null) { _printdatetime = nCV(); }
      return _printdatetime; }
    protected ConditionValue xgetCValuePrintdatetime() { return xdfgetPrintdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Printdatetime_Asc() { regOBA("PRINTDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Printdatetime_Desc() { regOBD("PRINTDATETIME"); return this; }

    protected ConditionValue _printedflg;
    public ConditionValue xdfgetPrintedflg()
    { if (_printedflg == null) { _printedflg = nCV(); }
      return _printedflg; }
    protected ConditionValue xgetCValuePrintedflg() { return xdfgetPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Printedflg_Asc() { regOBA("PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_Printedflg_Desc() { regOBD("PRINTEDFLG"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrcasestockdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrcasestockdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrcasestockdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrcasestockdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrcasestockdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrcasestockdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrcasestockdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrcasestockdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrcasestockdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrcasestockdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrcasestockdetailCQ> _myselfExistsMap;
    public Map<String, TTrcasestockdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrcasestockdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrcasestockdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrcasestockdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrcasestockdetailCB.class.getName(); }
    protected String xCQ() { return TTrcasestockdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
