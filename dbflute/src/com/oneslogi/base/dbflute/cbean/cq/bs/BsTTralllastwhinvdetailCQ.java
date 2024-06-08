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
 * The base condition-query of T_TRALLLASTWHINVDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTralllastwhinvdetailCQ extends AbstractBsTTralllastwhinvdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTralllastwhinvdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTralllastwhinvdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRALLLASTWHINVDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTralllastwhinvdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTralllastwhinvdetailCIQ xcreateCIQ() {
        TTralllastwhinvdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTralllastwhinvdetailCIQ xnewCIQ() {
        return new TTralllastwhinvdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRALLLASTWHINVDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTralllastwhinvdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTralllastwhinvdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _alllastwhinvdetailkey;
    public ConditionValue xdfgetAlllastwhinvdetailkey()
    { if (_alllastwhinvdetailkey == null) { _alllastwhinvdetailkey = nCV(); }
      return _alllastwhinvdetailkey; }
    protected ConditionValue xgetCValueAlllastwhinvdetailkey() { return xdfgetAlllastwhinvdetailkey(); }

    /**
     * Add order-by as ascend. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Alllastwhinvdetailkey_Asc() { regOBA("ALLLASTWHINVDETAILKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Alllastwhinvdetailkey_Desc() { regOBD("ALLLASTWHINVDETAILKEY"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productdate;
    public ConditionValue xdfgetProductdate()
    { if (_productdate == null) { _productdate = nCV(); }
      return _productdate; }
    protected ConditionValue xgetCValueProductdate() { return xdfgetProductdate(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Productdate_Asc() { regOBA("PRODUCTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Productdate_Desc() { regOBD("PRODUCTDATE"); return this; }

    protected ConditionValue _designcd;
    public ConditionValue xdfgetDesigncd()
    { if (_designcd == null) { _designcd = nCV(); }
      return _designcd; }
    protected ConditionValue xgetCValueDesigncd() { return xdfgetDesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Designcd_Asc() { regOBA("DESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Designcd_Desc() { regOBD("DESIGNCD"); return this; }

    protected ConditionValue _invnum;
    public ConditionValue xdfgetInvnum()
    { if (_invnum == null) { _invnum = nCV(); }
      return _invnum; }
    protected ConditionValue xgetCValueInvnum() { return xdfgetInvnum(); }

    /**
     * Add order-by as ascend. <br>
     * INVNUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Invnum_Asc() { regOBA("INVNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVNUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Invnum_Desc() { regOBD("INVNUM"); return this; }

    protected ConditionValue _invkbncd;
    public ConditionValue xdfgetInvkbncd()
    { if (_invkbncd == null) { _invkbncd = nCV(); }
      return _invkbncd; }
    protected ConditionValue xgetCValueInvkbncd() { return xdfgetInvkbncd(); }

    /**
     * Add order-by as ascend. <br>
     * INVKBNCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Invkbncd_Asc() { regOBA("INVKBNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVKBNCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Invkbncd_Desc() { regOBD("INVKBNCD"); return this; }

    protected ConditionValue _invkbn;
    public ConditionValue xdfgetInvkbn()
    { if (_invkbn == null) { _invkbn = nCV(); }
      return _invkbn; }
    protected ConditionValue xgetCValueInvkbn() { return xdfgetInvkbn(); }

    /**
     * Add order-by as ascend. <br>
     * INVKBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Invkbn_Asc() { regOBA("INVKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVKBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Invkbn_Desc() { regOBD("INVKBN"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_Firmcarryno_Asc() { regOBA("FIRMCARRYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Firmcarryno_Desc() { regOBD("FIRMCARRYNO"); return this; }

    protected ConditionValue _assortedunit;
    public ConditionValue xdfgetAssortedunit()
    { if (_assortedunit == null) { _assortedunit = nCV(); }
      return _assortedunit; }
    protected ConditionValue xgetCValueAssortedunit() { return xdfgetAssortedunit(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Assortedunit_Asc() { regOBA("ASSORTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Assortedunit_Desc() { regOBD("ASSORTEDUNIT"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Schdate_Asc() { regOBA("SCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Schdate_Desc() { regOBD("SCHDATE"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _outputtype;
    public ConditionValue xdfgetOutputtype()
    { if (_outputtype == null) { _outputtype = nCV(); }
      return _outputtype; }
    protected ConditionValue xgetCValueOutputtype() { return xdfgetOutputtype(); }

    /**
     * Add order-by as ascend. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Outputtype_Asc() { regOBA("OUTPUTTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Outputtype_Desc() { regOBD("OUTPUTTYPE"); return this; }

    protected ConditionValue _outputorg;
    public ConditionValue xdfgetOutputorg()
    { if (_outputorg == null) { _outputorg = nCV(); }
      return _outputorg; }
    protected ConditionValue xgetCValueOutputorg() { return xdfgetOutputorg(); }

    /**
     * Add order-by as ascend. <br>
     * OUTPUTORG: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Outputorg_Asc() { regOBA("OUTPUTORG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OUTPUTORG: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Outputorg_Desc() { regOBD("OUTPUTORG"); return this; }

    protected ConditionValue _usetype;
    public ConditionValue xdfgetUsetype()
    { if (_usetype == null) { _usetype = nCV(); }
      return _usetype; }
    protected ConditionValue xgetCValueUsetype() { return xdfgetUsetype(); }

    /**
     * Add order-by as ascend. <br>
     * USETYPE: {IX+, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Usetype_Asc() { regOBA("USETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * USETYPE: {IX+, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Usetype_Desc() { regOBD("USETYPE"); return this; }

    protected ConditionValue _procflg;
    public ConditionValue xdfgetProcflg()
    { if (_procflg == null) { _procflg = nCV(); }
      return _procflg; }
    protected ConditionValue xgetCValueProcflg() { return xdfgetProcflg(); }

    /**
     * Add order-by as ascend. <br>
     * PROCFLG: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Procflg_Asc() { regOBA("PROCFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCFLG: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_Procflg_Desc() { regOBD("PROCFLG"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTralllastwhinvdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTralllastwhinvdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTralllastwhinvdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTralllastwhinvdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTralllastwhinvdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTralllastwhinvdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTralllastwhinvdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTralllastwhinvdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTralllastwhinvdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTralllastwhinvdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTralllastwhinvdetailCQ> _myselfExistsMap;
    public Map<String, TTralllastwhinvdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTralllastwhinvdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTralllastwhinvdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTralllastwhinvdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTralllastwhinvdetailCB.class.getName(); }
    protected String xCQ() { return TTralllastwhinvdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
