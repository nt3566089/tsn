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
 * The base condition-query of T_TRFLEXIBILITYDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrflexibilitydetailCQ extends AbstractBsTTrflexibilitydetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrflexibilitydetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrflexibilitydetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRFLEXIBILITYDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrflexibilitydetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrflexibilitydetailCIQ xcreateCIQ() {
        TTrflexibilitydetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrflexibilitydetailCIQ xnewCIQ() {
        return new TTrflexibilitydetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRFLEXIBILITYDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrflexibilitydetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrflexibilitydetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _flexibleTransportDetailInfoId;
    public ConditionValue xdfgetFlexibleTransportDetailInfoId()
    { if (_flexibleTransportDetailInfoId == null) { _flexibleTransportDetailInfoId = nCV(); }
      return _flexibleTransportDetailInfoId; }
    protected ConditionValue xgetCValueFlexibleTransportDetailInfoId() { return xdfgetFlexibleTransportDetailInfoId(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_FlexibleTransportDetailInfoId_Asc() { regOBA("FLEXIBLE_TRANSPORT_DETAIL_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_FlexibleTransportDetailInfoId_Desc() { regOBD("FLEXIBLE_TRANSPORT_DETAIL_INFO_ID"); return this; }

    protected ConditionValue _flexibleTransportInfoId;
    public ConditionValue xdfgetFlexibleTransportInfoId()
    { if (_flexibleTransportInfoId == null) { _flexibleTransportInfoId = nCV(); }
      return _flexibleTransportInfoId; }
    protected ConditionValue xgetCValueFlexibleTransportInfoId() { return xdfgetFlexibleTransportInfoId(); }

    public Map<String, TTrflexibilityCQ> getFlexibleTransportInfoId_InScopeRelation_TTrflexibility() { return xgetSQueMap("flexibleTransportInfoId_InScopeRelation_TTrflexibility"); }
    public String keepFlexibleTransportInfoId_InScopeRelation_TTrflexibility(TTrflexibilityCQ sq) { return xkeepSQue("flexibleTransportInfoId_InScopeRelation_TTrflexibility", sq); }

    public Map<String, TTrflexibilityCQ> getFlexibleTransportInfoId_NotInScopeRelation_TTrflexibility() { return xgetSQueMap("flexibleTransportInfoId_NotInScopeRelation_TTrflexibility"); }
    public String keepFlexibleTransportInfoId_NotInScopeRelation_TTrflexibility(TTrflexibilityCQ sq) { return xkeepSQue("flexibleTransportInfoId_NotInScopeRelation_TTrflexibility", sq); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_FlexibleTransportInfoId_Asc() { regOBA("FLEXIBLE_TRANSPORT_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_FlexibleTransportInfoId_Desc() { regOBD("FLEXIBLE_TRANSPORT_INFO_ID"); return this; }

    protected ConditionValue _flexibitylineno;
    public ConditionValue xdfgetFlexibitylineno()
    { if (_flexibitylineno == null) { _flexibitylineno = nCV(); }
      return _flexibitylineno; }
    protected ConditionValue xgetCValueFlexibitylineno() { return xdfgetFlexibitylineno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Flexibitylineno_Asc() { regOBA("FLEXIBITYLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Flexibitylineno_Desc() { regOBD("FLEXIBITYLINENO"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _stddifflg;
    public ConditionValue xdfgetStddifflg()
    { if (_stddifflg == null) { _stddifflg = nCV(); }
      return _stddifflg; }
    protected ConditionValue xgetCValueStddifflg() { return xdfgetStddifflg(); }

    /**
     * Add order-by as ascend. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Stddifflg_Asc() { regOBA("STDDIFFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Stddifflg_Desc() { regOBD("STDDIFFLG"); return this; }

    protected ConditionValue _flexpicklistno;
    public ConditionValue xdfgetFlexpicklistno()
    { if (_flexpicklistno == null) { _flexpicklistno = nCV(); }
      return _flexpicklistno; }
    protected ConditionValue xgetCValueFlexpicklistno() { return xdfgetFlexpicklistno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Flexpicklistno_Asc() { regOBA("FLEXPICKLISTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Flexpicklistno_Desc() { regOBD("FLEXPICKLISTNO"); return this; }

    protected ConditionValue _printedflg;
    public ConditionValue xdfgetPrintedflg()
    { if (_printedflg == null) { _printedflg = nCV(); }
      return _printedflg; }
    protected ConditionValue xgetCValuePrintedflg() { return xdfgetPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Printedflg_Asc() { regOBA("PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Printedflg_Desc() { regOBD("PRINTEDFLG"); return this; }

    protected ConditionValue _completeflg;
    public ConditionValue xdfgetCompleteflg()
    { if (_completeflg == null) { _completeflg = nCV(); }
      return _completeflg; }
    protected ConditionValue xgetCValueCompleteflg() { return xdfgetCompleteflg(); }

    /**
     * Add order-by as ascend. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Completeflg_Asc() { regOBA("COMPLETEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Completeflg_Desc() { regOBD("COMPLETEFLG"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_Manufacturedate_Asc() { regOBA("MANUFACTUREDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Manufacturedate_Desc() { regOBD("MANUFACTUREDATE"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_Designcd_Asc() { regOBA("DESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Designcd_Desc() { regOBD("DESIGNCD"); return this; }

    protected ConditionValue _qtycase;
    public ConditionValue xdfgetQtycase()
    { if (_qtycase == null) { _qtycase = nCV(); }
      return _qtycase; }
    protected ConditionValue xgetCValueQtycase() { return xdfgetQtycase(); }

    /**
     * Add order-by as ascend. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Qtycase_Asc() { regOBA("QTYCASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Qtycase_Desc() { regOBD("QTYCASE"); return this; }

    protected ConditionValue _qtybowl;
    public ConditionValue xdfgetQtybowl()
    { if (_qtybowl == null) { _qtybowl = nCV(); }
      return _qtybowl; }
    protected ConditionValue xgetCValueQtybowl() { return xdfgetQtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Qtybowl_Asc() { regOBA("QTYBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Qtybowl_Desc() { regOBD("QTYBOWL"); return this; }

    protected ConditionValue _htqtycase;
    public ConditionValue xdfgetHtqtycase()
    { if (_htqtycase == null) { _htqtycase = nCV(); }
      return _htqtycase; }
    protected ConditionValue xgetCValueHtqtycase() { return xdfgetHtqtycase(); }

    /**
     * Add order-by as ascend. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Htqtycase_Asc() { regOBA("HTQTYCASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Htqtycase_Desc() { regOBD("HTQTYCASE"); return this; }

    protected ConditionValue _htqtybowl;
    public ConditionValue xdfgetHtqtybowl()
    { if (_htqtybowl == null) { _htqtybowl = nCV(); }
      return _htqtybowl; }
    protected ConditionValue xgetCValueHtqtybowl() { return xdfgetHtqtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Htqtybowl_Asc() { regOBA("HTQTYBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Htqtybowl_Desc() { regOBD("HTQTYBOWL"); return this; }

    protected ConditionValue _nvExtdata1;
    public ConditionValue xdfgetNvExtdata1()
    { if (_nvExtdata1 == null) { _nvExtdata1 = nCV(); }
      return _nvExtdata1; }
    protected ConditionValue xgetCValueNvExtdata1() { return xdfgetNvExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrflexibilitydetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilitydetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrflexibilitydetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrflexibilitydetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrflexibilitydetailCQ bq = (TTrflexibilitydetailCQ)bqs;
        TTrflexibilitydetailCQ uq = (TTrflexibilitydetailCQ)uqs;
        if (bq.hasConditionQueryTTrflexibility()) {
            uq.queryTTrflexibility().reflectRelationOnUnionQuery(bq.queryTTrflexibility(), uq.queryTTrflexibility());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_TRFLEXIBILITY by my FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibility'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrflexibilityCQ queryTTrflexibility() {
        return xdfgetConditionQueryTTrflexibility();
    }
    public TTrflexibilityCQ xdfgetConditionQueryTTrflexibility() {
        String prop = "tTrflexibility";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrflexibility()); xsetupOuterJoinTTrflexibility(); }
        return xgetQueRlMap(prop);
    }
    protected TTrflexibilityCQ xcreateQueryTTrflexibility() {
        String nrp = xresolveNRP("T_TRFLEXIBILITYDETAIL", "tTrflexibility"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrflexibilityCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrflexibility", nrp);
    }
    protected void xsetupOuterJoinTTrflexibility() { xregOutJo("tTrflexibility"); }
    public boolean hasConditionQueryTTrflexibility() { return xhasQueRlMap("tTrflexibility"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrflexibilitydetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrflexibilitydetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrflexibilitydetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrflexibilitydetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrflexibilitydetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrflexibilitydetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrflexibilitydetailCQ> _myselfExistsMap;
    public Map<String, TTrflexibilitydetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrflexibilitydetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrflexibilitydetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrflexibilitydetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrflexibilitydetailCB.class.getName(); }
    protected String xCQ() { return TTrflexibilitydetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
