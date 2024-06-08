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
 * The base condition-query of E_STOCK_INQUIRY_ANSWER.
 * @author DBFlute(AutoGenerator)
 */
public class BsEStockInquiryAnswerCQ extends AbstractBsEStockInquiryAnswerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EStockInquiryAnswerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEStockInquiryAnswerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_STOCK_INQUIRY_ANSWER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EStockInquiryAnswerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EStockInquiryAnswerCIQ xcreateCIQ() {
        EStockInquiryAnswerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EStockInquiryAnswerCIQ xnewCIQ() {
        return new EStockInquiryAnswerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_STOCK_INQUIRY_ANSWER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EStockInquiryAnswerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EStockInquiryAnswerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trinvreanswerId;
    public ConditionValue xdfgetTrinvreanswerId()
    { if (_trinvreanswerId == null) { _trinvreanswerId = nCV(); }
      return _trinvreanswerId; }
    protected ConditionValue xgetCValueTrinvreanswerId() { return xdfgetTrinvreanswerId(); }

    /**
     * Add order-by as ascend. <br>
     * TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_TrinvreanswerId_Asc() { regOBA("TRINVREANSWER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_TrinvreanswerId_Desc() { regOBD("TRINVREANSWER_ID"); return this; }

    protected ConditionValue _invinqno;
    public ConditionValue xdfgetInvinqno()
    { if (_invinqno == null) { _invinqno = nCV(); }
      return _invinqno; }
    protected ConditionValue xgetCValueInvinqno() { return xdfgetInvinqno(); }

    /**
     * Add order-by as ascend. <br>
     * INVINQNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Invinqno_Asc() { regOBA("INVINQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVINQNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Invinqno_Desc() { regOBD("INVINQNO"); return this; }

    protected ConditionValue _invinqdate;
    public ConditionValue xdfgetInvinqdate()
    { if (_invinqdate == null) { _invinqdate = nCV(); }
      return _invinqdate; }
    protected ConditionValue xgetCValueInvinqdate() { return xdfgetInvinqdate(); }

    /**
     * Add order-by as ascend. <br>
     * INVINQDATE: {UQ+, IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Invinqdate_Asc() { regOBA("INVINQDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVINQDATE: {UQ+, IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Invinqdate_Desc() { regOBD("INVINQDATE"); return this; }

    protected ConditionValue _companycd;
    public ConditionValue xdfgetCompanycd()
    { if (_companycd == null) { _companycd = nCV(); }
      return _companycd; }
    protected ConditionValue xgetCValueCompanycd() { return xdfgetCompanycd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANYCD: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Companycd_Asc() { regOBA("COMPANYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANYCD: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Companycd_Desc() { regOBD("COMPANYCD"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _manufacturdate;
    public ConditionValue xdfgetManufacturdate()
    { if (_manufacturdate == null) { _manufacturdate = nCV(); }
      return _manufacturdate; }
    protected ConditionValue xgetCValueManufacturdate() { return xdfgetManufacturdate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Manufacturdate_Asc() { regOBA("MANUFACTURDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Manufacturdate_Desc() { regOBD("MANUFACTURDATE"); return this; }

    protected ConditionValue _designcd;
    public ConditionValue xdfgetDesigncd()
    { if (_designcd == null) { _designcd = nCV(); }
      return _designcd; }
    protected ConditionValue xgetCValueDesigncd() { return xdfgetDesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Designcd_Asc() { regOBA("DESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Designcd_Desc() { regOBD("DESIGNCD"); return this; }

    protected ConditionValue _stockkbn;
    public ConditionValue xdfgetStockkbn()
    { if (_stockkbn == null) { _stockkbn = nCV(); }
      return _stockkbn; }
    protected ConditionValue xgetCValueStockkbn() { return xdfgetStockkbn(); }

    /**
     * Add order-by as ascend. <br>
     * STOCKKBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Stockkbn_Asc() { regOBA("STOCKKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCKKBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Stockkbn_Desc() { regOBD("STOCKKBN"); return this; }

    protected ConditionValue _stockqty;
    public ConditionValue xdfgetStockqty()
    { if (_stockqty == null) { _stockqty = nCV(); }
      return _stockqty; }
    protected ConditionValue xgetCValueStockqty() { return xdfgetStockqty(); }

    /**
     * Add order-by as ascend. <br>
     * STOCKQTY: {bigint(19), default=[0000000000000]}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Stockqty_Asc() { regOBA("STOCKQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCKQTY: {bigint(19), default=[0000000000000]}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Stockqty_Desc() { regOBD("STOCKQTY"); return this; }

    protected ConditionValue _transportcd;
    public ConditionValue xdfgetTransportcd()
    { if (_transportcd == null) { _transportcd = nCV(); }
      return _transportcd; }
    protected ConditionValue xgetCValueTransportcd() { return xdfgetTransportcd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

    protected ConditionValue _firmcarryno;
    public ConditionValue xdfgetFirmcarryno()
    { if (_firmcarryno == null) { _firmcarryno = nCV(); }
      return _firmcarryno; }
    protected ConditionValue xgetCValueFirmcarryno() { return xdfgetFirmcarryno(); }

    /**
     * Add order-by as ascend. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Firmcarryno_Asc() { regOBA("FIRMCARRYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Firmcarryno_Desc() { regOBD("FIRMCARRYNO"); return this; }

    protected ConditionValue _shipcd;
    public ConditionValue xdfgetShipcd()
    { if (_shipcd == null) { _shipcd = nCV(); }
      return _shipcd; }
    protected ConditionValue xgetCValueShipcd() { return xdfgetShipcd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Shipcd_Asc() { regOBA("SHIPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Shipcd_Desc() { regOBD("SHIPCD"); return this; }

    protected ConditionValue _shipschdate;
    public ConditionValue xdfgetShipschdate()
    { if (_shipschdate == null) { _shipschdate = nCV(); }
      return _shipschdate; }
    protected ConditionValue xgetCValueShipschdate() { return xdfgetShipschdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Shipschdate_Asc() { regOBA("SHIPSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Shipschdate_Desc() { regOBD("SHIPSCHDATE"); return this; }

    protected ConditionValue _receivedate;
    public ConditionValue xdfgetReceivedate()
    { if (_receivedate == null) { _receivedate = nCV(); }
      return _receivedate; }
    protected ConditionValue xgetCValueReceivedate() { return xdfgetReceivedate(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _rcvschdate;
    public ConditionValue xdfgetRcvschdate()
    { if (_rcvschdate == null) { _rcvschdate = nCV(); }
      return _rcvschdate; }
    protected ConditionValue xgetCValueRcvschdate() { return xdfgetRcvschdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Rcvschdate_Asc() { regOBA("RCVSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Rcvschdate_Desc() { regOBD("RCVSCHDATE"); return this; }

    protected ConditionValue _expectqty;
    public ConditionValue xdfgetExpectqty()
    { if (_expectqty == null) { _expectqty = nCV(); }
      return _expectqty; }
    protected ConditionValue xgetCValueExpectqty() { return xdfgetExpectqty(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Expectqty_Asc() { regOBA("EXPECTQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Expectqty_Desc() { regOBD("EXPECTQTY"); return this; }

    protected ConditionValue _getdate;
    public ConditionValue xdfgetGetdate()
    { if (_getdate == null) { _getdate = nCV(); }
      return _getdate; }
    protected ConditionValue xgetCValueGetdate() { return xdfgetGetdate(); }

    /**
     * Add order-by as ascend. <br>
     * GETDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Getdate_Asc() { regOBA("GETDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GETDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_Getdate_Desc() { regOBD("GETDATE"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEStockInquiryAnswerCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEStockInquiryAnswerCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEStockInquiryAnswerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEStockInquiryAnswerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EStockInquiryAnswerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EStockInquiryAnswerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EStockInquiryAnswerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EStockInquiryAnswerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EStockInquiryAnswerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EStockInquiryAnswerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EStockInquiryAnswerCQ> _myselfExistsMap;
    public Map<String, EStockInquiryAnswerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EStockInquiryAnswerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EStockInquiryAnswerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EStockInquiryAnswerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EStockInquiryAnswerCB.class.getName(); }
    protected String xCQ() { return EStockInquiryAnswerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
