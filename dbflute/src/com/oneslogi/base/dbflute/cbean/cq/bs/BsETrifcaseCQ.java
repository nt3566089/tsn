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
 * The base condition-query of E_TRIFCASE.
 * @author DBFlute(AutoGenerator)
 */
public class BsETrifcaseCQ extends AbstractBsETrifcaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ETrifcaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsETrifcaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_TRIFCASE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ETrifcaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ETrifcaseCIQ xcreateCIQ() {
        ETrifcaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ETrifcaseCIQ xnewCIQ() {
        return new ETrifcaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_TRIFCASE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ETrifcaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ETrifcaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _jtsymbolno;
    public ConditionValue xdfgetJtsymbolno()
    { if (_jtsymbolno == null) { _jtsymbolno = nCV(); }
      return _jtsymbolno; }
    protected ConditionValue xgetCValueJtsymbolno() { return xdfgetJtsymbolno(); }

    /**
     * Add order-by as ascend. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Jtsymbolno_Asc() { regOBA("JTSYMBOLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Jtsymbolno_Desc() { regOBD("JTSYMBOLNO"); return this; }

    protected ConditionValue _factorycd;
    public ConditionValue xdfgetFactorycd()
    { if (_factorycd == null) { _factorycd = nCV(); }
      return _factorycd; }
    protected ConditionValue xgetCValueFactorycd() { return xdfgetFactorycd(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Factorycd_Asc() { regOBA("FACTORYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Factorycd_Desc() { regOBD("FACTORYCD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _machineno;
    public ConditionValue xdfgetMachineno()
    { if (_machineno == null) { _machineno = nCV(); }
      return _machineno; }
    protected ConditionValue xgetCValueMachineno() { return xdfgetMachineno(); }

    /**
     * Add order-by as ascend. <br>
     * MACHINENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Machineno_Asc() { regOBA("MACHINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHINENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Machineno_Desc() { regOBD("MACHINENO"); return this; }

    protected ConditionValue _limitdate;
    public ConditionValue xdfgetLimitdate()
    { if (_limitdate == null) { _limitdate = nCV(); }
      return _limitdate; }
    protected ConditionValue xgetCValueLimitdate() { return xdfgetLimitdate(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Limitdate_Asc() { regOBA("LIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Limitdate_Desc() { regOBD("LIMITDATE"); return this; }

    protected ConditionValue _orderno;
    public ConditionValue xdfgetOrderno()
    { if (_orderno == null) { _orderno = nCV(); }
      return _orderno; }
    protected ConditionValue xgetCValueOrderno() { return xdfgetOrderno(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Orderno_Asc() { regOBA("ORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Orderno_Desc() { regOBD("ORDERNO"); return this; }

    protected ConditionValue _createno;
    public ConditionValue xdfgetCreateno()
    { if (_createno == null) { _createno = nCV(); }
      return _createno; }
    protected ConditionValue xgetCValueCreateno() { return xdfgetCreateno(); }

    /**
     * Add order-by as ascend. <br>
     * CREATENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Createno_Asc() { regOBA("CREATENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Createno_Desc() { regOBD("CREATENO"); return this; }

    protected ConditionValue _skucd;
    public ConditionValue xdfgetSkucd()
    { if (_skucd == null) { _skucd = nCV(); }
      return _skucd; }
    protected ConditionValue xgetCValueSkucd() { return xdfgetSkucd(); }

    /**
     * Add order-by as ascend. <br>
     * SKUCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Skucd_Asc() { regOBA("SKUCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKUCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Skucd_Desc() { regOBD("SKUCD"); return this; }

    protected ConditionValue _destinationcd;
    public ConditionValue xdfgetDestinationcd()
    { if (_destinationcd == null) { _destinationcd = nCV(); }
      return _destinationcd; }
    protected ConditionValue xgetCValueDestinationcd() { return xdfgetDestinationcd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Destinationcd_Asc() { regOBA("DESTINATIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Destinationcd_Desc() { regOBD("DESTINATIONCD"); return this; }

    protected ConditionValue _manufacturecd;
    public ConditionValue xdfgetManufacturecd()
    { if (_manufacturecd == null) { _manufacturecd = nCV(); }
      return _manufacturecd; }
    protected ConditionValue xgetCValueManufacturecd() { return xdfgetManufacturecd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Manufacturecd_Asc() { regOBA("MANUFACTURECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Manufacturecd_Desc() { regOBD("MANUFACTURECD"); return this; }

    protected ConditionValue _datetime;
    public ConditionValue xdfgetDatetime()
    { if (_datetime == null) { _datetime = nCV(); }
      return _datetime; }
    protected ConditionValue xgetCValueDatetime() { return xdfgetDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * DATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Datetime_Asc() { regOBA("DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Datetime_Desc() { regOBD("DATETIME"); return this; }

    protected ConditionValue _distributioncd;
    public ConditionValue xdfgetDistributioncd()
    { if (_distributioncd == null) { _distributioncd = nCV(); }
      return _distributioncd; }
    protected ConditionValue xgetCValueDistributioncd() { return xdfgetDistributioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Distributioncd_Asc() { regOBA("DISTRIBUTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Distributioncd_Desc() { regOBD("DISTRIBUTIONCD"); return this; }

    protected ConditionValue _palletid;
    public ConditionValue xdfgetPalletid()
    { if (_palletid == null) { _palletid = nCV(); }
      return _palletid; }
    protected ConditionValue xgetCValuePalletid() { return xdfgetPalletid(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Palletid_Asc() { regOBA("PALLETID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Palletid_Desc() { regOBD("PALLETID"); return this; }

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
    public BsETrifcaseCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

    protected ConditionValue _shiptocd;
    public ConditionValue xdfgetShiptocd()
    { if (_shiptocd == null) { _shiptocd = nCV(); }
      return _shiptocd; }
    protected ConditionValue xgetCValueShiptocd() { return xdfgetShiptocd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Shiptocd_Asc() { regOBA("SHIPTOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Shiptocd_Desc() { regOBD("SHIPTOCD"); return this; }

    protected ConditionValue _headOrderno;
    public ConditionValue xdfgetHeadOrderno()
    { if (_headOrderno == null) { _headOrderno = nCV(); }
      return _headOrderno; }
    protected ConditionValue xgetCValueHeadOrderno() { return xdfgetHeadOrderno(); }

    /**
     * Add order-by as ascend. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_HeadOrderno_Asc() { regOBA("HEAD_ORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_HeadOrderno_Desc() { regOBD("HEAD_ORDERNO"); return this; }

    protected ConditionValue _caseqty;
    public ConditionValue xdfgetCaseqty()
    { if (_caseqty == null) { _caseqty = nCV(); }
      return _caseqty; }
    protected ConditionValue xgetCValueCaseqty() { return xdfgetCaseqty(); }

    /**
     * Add order-by as ascend. <br>
     * CASEQTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Caseqty_Asc() { regOBA("CASEQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEQTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Caseqty_Desc() { regOBD("CASEQTY"); return this; }

    protected ConditionValue _fractqty;
    public ConditionValue xdfgetFractqty()
    { if (_fractqty == null) { _fractqty = nCV(); }
      return _fractqty; }
    protected ConditionValue xgetCValueFractqty() { return xdfgetFractqty(); }

    /**
     * Add order-by as ascend. <br>
     * FRACTQTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Fractqty_Asc() { regOBA("FRACTQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * FRACTQTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Fractqty_Desc() { regOBD("FRACTQTY"); return this; }

    protected ConditionValue _symboladdflg;
    public ConditionValue xdfgetSymboladdflg()
    { if (_symboladdflg == null) { _symboladdflg = nCV(); }
      return _symboladdflg; }
    protected ConditionValue xgetCValueSymboladdflg() { return xdfgetSymboladdflg(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLADDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Symboladdflg_Asc() { regOBA("SYMBOLADDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLADDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_Symboladdflg_Desc() { regOBD("SYMBOLADDFLG"); return this; }

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
    public BsETrifcaseCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsETrifcaseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsETrifcaseCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsETrifcaseCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsETrifcaseCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsETrifcaseCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsETrifcaseCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsETrifcaseCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsETrifcaseCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifcaseCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsETrifcaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsETrifcaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ETrifcaseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ETrifcaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ETrifcaseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ETrifcaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ETrifcaseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ETrifcaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ETrifcaseCQ> _myselfExistsMap;
    public Map<String, ETrifcaseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ETrifcaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ETrifcaseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ETrifcaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ETrifcaseCB.class.getName(); }
    protected String xCQ() { return ETrifcaseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
