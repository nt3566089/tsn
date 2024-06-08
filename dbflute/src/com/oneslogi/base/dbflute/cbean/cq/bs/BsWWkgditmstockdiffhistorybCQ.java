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
 * The base condition-query of W_WKGDITMSTOCKDIFFHISTORYB.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWkgditmstockdiffhistorybCQ extends AbstractBsWWkgditmstockdiffhistorybCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWkgditmstockdiffhistorybCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWkgditmstockdiffhistorybCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKGDITMSTOCKDIFFHISTORYB) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWkgditmstockdiffhistorybCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWkgditmstockdiffhistorybCIQ xcreateCIQ() {
        WWkgditmstockdiffhistorybCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWkgditmstockdiffhistorybCIQ xnewCIQ() {
        return new WWkgditmstockdiffhistorybCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKGDITMSTOCKDIFFHISTORYB on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWkgditmstockdiffhistorybCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWkgditmstockdiffhistorybCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printkey;
    public ConditionValue xdfgetPrintkey()
    { if (_printkey == null) { _printkey = nCV(); }
      return _printkey; }
    protected ConditionValue xgetCValuePrintkey() { return xdfgetPrintkey(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Printkey_Asc() { regOBA("PRINTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Printkey_Desc() { regOBD("PRINTKEY"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _warehousename;
    public ConditionValue xdfgetWarehousename()
    { if (_warehousename == null) { _warehousename = nCV(); }
      return _warehousename; }
    protected ConditionValue xgetCValueWarehousename() { return xdfgetWarehousename(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Warehousename_Asc() { regOBA("WAREHOUSENAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Warehousename_Desc() { regOBD("WAREHOUSENAME"); return this; }

    protected ConditionValue _diffadddate;
    public ConditionValue xdfgetDiffadddate()
    { if (_diffadddate == null) { _diffadddate = nCV(); }
      return _diffadddate; }
    protected ConditionValue xgetCValueDiffadddate() { return xdfgetDiffadddate(); }

    /**
     * Add order-by as ascend. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Diffadddate_Asc() { regOBA("DIFFADDDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Diffadddate_Desc() { regOBD("DIFFADDDATE"); return this; }

    protected ConditionValue _diffoccarea;
    public ConditionValue xdfgetDiffoccarea()
    { if (_diffoccarea == null) { _diffoccarea = nCV(); }
      return _diffoccarea; }
    protected ConditionValue xgetCValueDiffoccarea() { return xdfgetDiffoccarea(); }

    /**
     * Add order-by as ascend. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Diffoccarea_Asc() { regOBA("DIFFOCCAREA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Diffoccarea_Desc() { regOBD("DIFFOCCAREA"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemname;
    public ConditionValue xdfgetItemname()
    { if (_itemname == null) { _itemname = nCV(); }
      return _itemname; }
    protected ConditionValue xgetCValueItemname() { return xdfgetItemname(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Itemname_Asc() { regOBA("ITEMNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Itemname_Desc() { regOBD("ITEMNAME"); return this; }

    protected ConditionValue _diffqty;
    public ConditionValue xdfgetDiffqty()
    { if (_diffqty == null) { _diffqty = nCV(); }
      return _diffqty; }
    protected ConditionValue xgetCValueDiffqty() { return xdfgetDiffqty(); }

    /**
     * Add order-by as ascend. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Diffqty_Asc() { regOBA("DIFFQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Diffqty_Desc() { regOBD("DIFFQTY"); return this; }

    protected ConditionValue _inoutkbn;
    public ConditionValue xdfgetInoutkbn()
    { if (_inoutkbn == null) { _inoutkbn = nCV(); }
      return _inoutkbn; }
    protected ConditionValue xgetCValueInoutkbn() { return xdfgetInoutkbn(); }

    /**
     * Add order-by as ascend. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Inoutkbn_Asc() { regOBA("INOUTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Inoutkbn_Desc() { regOBD("INOUTKBN"); return this; }

    protected ConditionValue _itemorderby;
    public ConditionValue xdfgetItemorderby()
    { if (_itemorderby == null) { _itemorderby = nCV(); }
      return _itemorderby; }
    protected ConditionValue xgetCValueItemorderby() { return xdfgetItemorderby(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMORDERBY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Itemorderby_Asc() { regOBA("ITEMORDERBY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMORDERBY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_Itemorderby_Desc() { regOBD("ITEMORDERBY"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkgditmstockdiffhistorybCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWkgditmstockdiffhistorybCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WWkgditmstockdiffhistorybCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWkgditmstockdiffhistorybCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWkgditmstockdiffhistorybCB.class.getName(); }
    protected String xCQ() { return WWkgditmstockdiffhistorybCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
