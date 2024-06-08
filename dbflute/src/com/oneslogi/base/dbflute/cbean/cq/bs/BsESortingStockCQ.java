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
 * The base condition-query of E_SORTING_STOCK.
 * @author DBFlute(AutoGenerator)
 */
public class BsESortingStockCQ extends AbstractBsESortingStockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ESortingStockCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsESortingStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_SORTING_STOCK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ESortingStockCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ESortingStockCIQ xcreateCIQ() {
        ESortingStockCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ESortingStockCIQ xnewCIQ() {
        return new ESortingStockCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_SORTING_STOCK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ESortingStockCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ESortingStockCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sortingStockId;
    public ConditionValue xdfgetSortingStockId()
    { if (_sortingStockId == null) { _sortingStockId = nCV(); }
      return _sortingStockId; }
    protected ConditionValue xgetCValueSortingStockId() { return xdfgetSortingStockId(); }

    /**
     * Add order-by as ascend. <br>
     * SORTING_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_SortingStockId_Asc() { regOBA("SORTING_STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTING_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_SortingStockId_Desc() { regOBD("SORTING_STOCK_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _stockDate;
    public ConditionValue xdfgetStockDate()
    { if (_stockDate == null) { _stockDate = nCV(); }
      return _stockDate; }
    protected ConditionValue xgetCValueStockDate() { return xdfgetStockDate(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_StockDate_Asc() { regOBA("STOCK_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_StockDate_Desc() { regOBD("STOCK_DATE"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _companyCd;
    public ConditionValue xdfgetCompanyCd()
    { if (_companyCd == null) { _companyCd = nCV(); }
      return _companyCd; }
    protected ConditionValue xgetCValueCompanyCd() { return xdfgetCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_CompanyCd_Asc() { regOBA("COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_CompanyCd_Desc() { regOBD("COMPANY_CD"); return this; }

    protected ConditionValue _stockQtySign;
    public ConditionValue xdfgetStockQtySign()
    { if (_stockQtySign == null) { _stockQtySign = nCV(); }
      return _stockQtySign; }
    protected ConditionValue xgetCValueStockQtySign() { return xdfgetStockQtySign(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_StockQtySign_Asc() { regOBA("STOCK_QTY_SIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_StockQtySign_Desc() { regOBD("STOCK_QTY_SIGN"); return this; }

    protected ConditionValue _stockQty;
    public ConditionValue xdfgetStockQty()
    { if (_stockQty == null) { _stockQty = nCV(); }
      return _stockQty; }
    protected ConditionValue xgetCValueStockQty() { return xdfgetStockQty(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_StockQty_Asc() { regOBA("STOCK_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_StockQty_Desc() { regOBD("STOCK_QTY"); return this; }

    protected ConditionValue _pendingItemQtySign;
    public ConditionValue xdfgetPendingItemQtySign()
    { if (_pendingItemQtySign == null) { _pendingItemQtySign = nCV(); }
      return _pendingItemQtySign; }
    protected ConditionValue xgetCValuePendingItemQtySign() { return xdfgetPendingItemQtySign(); }

    /**
     * Add order-by as ascend. <br>
     * PENDING_ITEM_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_PendingItemQtySign_Asc() { regOBA("PENDING_ITEM_QTY_SIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * PENDING_ITEM_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_PendingItemQtySign_Desc() { regOBD("PENDING_ITEM_QTY_SIGN"); return this; }

    protected ConditionValue _pendingItemQty;
    public ConditionValue xdfgetPendingItemQty()
    { if (_pendingItemQty == null) { _pendingItemQty = nCV(); }
      return _pendingItemQty; }
    protected ConditionValue xgetCValuePendingItemQty() { return xdfgetPendingItemQty(); }

    /**
     * Add order-by as ascend. <br>
     * PENDING_ITEM_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_PendingItemQty_Asc() { regOBA("PENDING_ITEM_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PENDING_ITEM_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_PendingItemQty_Desc() { regOBD("PENDING_ITEM_QTY"); return this; }

    protected ConditionValue _inspectionItemQtySign;
    public ConditionValue xdfgetInspectionItemQtySign()
    { if (_inspectionItemQtySign == null) { _inspectionItemQtySign = nCV(); }
      return _inspectionItemQtySign; }
    protected ConditionValue xgetCValueInspectionItemQtySign() { return xdfgetInspectionItemQtySign(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTION_ITEM_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_InspectionItemQtySign_Asc() { regOBA("INSPECTION_ITEM_QTY_SIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTION_ITEM_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_InspectionItemQtySign_Desc() { regOBD("INSPECTION_ITEM_QTY_SIGN"); return this; }

    protected ConditionValue _inspectionItemQty;
    public ConditionValue xdfgetInspectionItemQty()
    { if (_inspectionItemQty == null) { _inspectionItemQty = nCV(); }
      return _inspectionItemQty; }
    protected ConditionValue xgetCValueInspectionItemQty() { return xdfgetInspectionItemQty(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTION_ITEM_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_InspectionItemQty_Asc() { regOBA("INSPECTION_ITEM_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTION_ITEM_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_InspectionItemQty_Desc() { regOBD("INSPECTION_ITEM_QTY"); return this; }

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
    public BsESortingStockCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsESortingStockCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsESortingStockCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsESortingStockCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsESortingStockCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsESortingStockCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsESortingStockCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsESortingStockCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsESortingStockCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsESortingStockCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsESortingStockCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsESortingStockCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ESortingStockCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ESortingStockCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ESortingStockCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ESortingStockCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ESortingStockCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ESortingStockCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ESortingStockCQ> _myselfExistsMap;
    public Map<String, ESortingStockCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ESortingStockCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ESortingStockCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ESortingStockCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ESortingStockCB.class.getName(); }
    protected String xCQ() { return ESortingStockCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
