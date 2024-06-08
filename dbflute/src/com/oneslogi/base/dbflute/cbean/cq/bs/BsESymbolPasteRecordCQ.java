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
 * The base condition-query of E_SYMBOL_PASTE_RECORD.
 * @author DBFlute(AutoGenerator)
 */
public class BsESymbolPasteRecordCQ extends AbstractBsESymbolPasteRecordCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ESymbolPasteRecordCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsESymbolPasteRecordCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_SYMBOL_PASTE_RECORD) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ESymbolPasteRecordCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ESymbolPasteRecordCIQ xcreateCIQ() {
        ESymbolPasteRecordCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ESymbolPasteRecordCIQ xnewCIQ() {
        return new ESymbolPasteRecordCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_SYMBOL_PASTE_RECORD on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ESymbolPasteRecordCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ESymbolPasteRecordCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _eSymbolPasteRecordId;
    public ConditionValue xdfgetESymbolPasteRecordId()
    { if (_eSymbolPasteRecordId == null) { _eSymbolPasteRecordId = nCV(); }
      return _eSymbolPasteRecordId; }
    protected ConditionValue xgetCValueESymbolPasteRecordId() { return xdfgetESymbolPasteRecordId(); }

    /**
     * Add order-by as ascend. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ESymbolPasteRecordId_Asc() { regOBA("E_SYMBOL_PASTE_RECORD_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ESymbolPasteRecordId_Desc() { regOBD("E_SYMBOL_PASTE_RECORD_ID"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _rcvKey;
    public ConditionValue xdfgetRcvKey()
    { if (_rcvKey == null) { _rcvKey = nCV(); }
      return _rcvKey; }
    protected ConditionValue xgetCValueRcvKey() { return xdfgetRcvKey(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_RcvKey_Asc() { regOBA("RCV_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_RcvKey_Desc() { regOBD("RCV_KEY"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _firmtransportNo;
    public ConditionValue xdfgetFirmtransportNo()
    { if (_firmtransportNo == null) { _firmtransportNo = nCV(); }
      return _firmtransportNo; }
    protected ConditionValue xgetCValueFirmtransportNo() { return xdfgetFirmtransportNo(); }

    /**
     * Add order-by as ascend. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_FirmtransportNo_Asc() { regOBA("FIRMTRANSPORT_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_FirmtransportNo_Desc() { regOBD("FIRMTRANSPORT_NO"); return this; }

    protected ConditionValue _manufacturDate;
    public ConditionValue xdfgetManufacturDate()
    { if (_manufacturDate == null) { _manufacturDate = nCV(); }
      return _manufacturDate; }
    protected ConditionValue xgetCValueManufacturDate() { return xdfgetManufacturDate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ManufacturDate_Asc() { regOBA("MANUFACTUR_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ManufacturDate_Desc() { regOBD("MANUFACTUR_DATE"); return this; }

    protected ConditionValue _printerNo;
    public ConditionValue xdfgetPrinterNo()
    { if (_printerNo == null) { _printerNo = nCV(); }
      return _printerNo; }
    protected ConditionValue xgetCValuePrinterNo() { return xdfgetPrinterNo(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_PrinterNo_Asc() { regOBA("PRINTER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_PrinterNo_Desc() { regOBD("PRINTER_NO"); return this; }

    protected ConditionValue _makeNo;
    public ConditionValue xdfgetMakeNo()
    { if (_makeNo == null) { _makeNo = nCV(); }
      return _makeNo; }
    protected ConditionValue xgetCValueMakeNo() { return xdfgetMakeNo(); }

    /**
     * Add order-by as ascend. <br>
     * MAKE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_MakeNo_Asc() { regOBA("MAKE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_MakeNo_Desc() { regOBD("MAKE_NO"); return this; }

    protected ConditionValue _designCd;
    public ConditionValue xdfgetDesignCd()
    { if (_designCd == null) { _designCd = nCV(); }
      return _designCd; }
    protected ConditionValue xgetCValueDesignCd() { return xdfgetDesignCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_DesignCd_Asc() { regOBA("DESIGN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_DesignCd_Desc() { regOBD("DESIGN_CD"); return this; }

    protected ConditionValue _stockType;
    public ConditionValue xdfgetStockType()
    { if (_stockType == null) { _stockType = nCV(); }
      return _stockType; }
    protected ConditionValue xgetCValueStockType() { return xdfgetStockType(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_StockType_Asc() { regOBA("STOCK_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_StockType_Desc() { regOBD("STOCK_TYPE"); return this; }

    protected ConditionValue _makerCaseNo;
    public ConditionValue xdfgetMakerCaseNo()
    { if (_makerCaseNo == null) { _makerCaseNo = nCV(); }
      return _makerCaseNo; }
    protected ConditionValue xgetCValueMakerCaseNo() { return xdfgetMakerCaseNo(); }

    /**
     * Add order-by as ascend. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_MakerCaseNo_Asc() { regOBA("MAKER_CASE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_MakerCaseNo_Desc() { regOBD("MAKER_CASE_NO"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsESymbolPasteRecordCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsESymbolPasteRecordCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsESymbolPasteRecordCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsESymbolPasteRecordCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ESymbolPasteRecordCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ESymbolPasteRecordCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ESymbolPasteRecordCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ESymbolPasteRecordCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ESymbolPasteRecordCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ESymbolPasteRecordCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ESymbolPasteRecordCQ> _myselfExistsMap;
    public Map<String, ESymbolPasteRecordCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ESymbolPasteRecordCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ESymbolPasteRecordCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ESymbolPasteRecordCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ESymbolPasteRecordCB.class.getName(); }
    protected String xCQ() { return ESymbolPasteRecordCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}