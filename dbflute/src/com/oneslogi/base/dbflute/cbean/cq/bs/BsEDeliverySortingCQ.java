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
 * The base condition-query of E_DELIVERY_SORTING.
 * @author DBFlute(AutoGenerator)
 */
public class BsEDeliverySortingCQ extends AbstractBsEDeliverySortingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EDeliverySortingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEDeliverySortingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_DELIVERY_SORTING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EDeliverySortingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EDeliverySortingCIQ xcreateCIQ() {
        EDeliverySortingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EDeliverySortingCIQ xnewCIQ() {
        return new EDeliverySortingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_DELIVERY_SORTING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EDeliverySortingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EDeliverySortingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _deliverySortingId;
    public ConditionValue xdfgetDeliverySortingId()
    { if (_deliverySortingId == null) { _deliverySortingId = nCV(); }
      return _deliverySortingId; }
    protected ConditionValue xgetCValueDeliverySortingId() { return xdfgetDeliverySortingId(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_SORTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_DeliverySortingId_Asc() { regOBA("DELIVERY_SORTING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_SORTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_DeliverySortingId_Desc() { regOBD("DELIVERY_SORTING_ID"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _companyCd;
    public ConditionValue xdfgetCompanyCd()
    { if (_companyCd == null) { _companyCd = nCV(); }
      return _companyCd; }
    protected ConditionValue xgetCValueCompanyCd() { return xdfgetCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_CompanyCd_Asc() { regOBA("COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_CompanyCd_Desc() { regOBD("COMPANY_CD"); return this; }

    protected ConditionValue _refNo;
    public ConditionValue xdfgetRefNo()
    { if (_refNo == null) { _refNo = nCV(); }
      return _refNo; }
    protected ConditionValue xgetCValueRefNo() { return xdfgetRefNo(); }

    /**
     * Add order-by as ascend. <br>
     * REF_NO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_RefNo_Asc() { regOBA("REF_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REF_NO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_RefNo_Desc() { regOBD("REF_NO"); return this; }

    protected ConditionValue _shipCd;
    public ConditionValue xdfgetShipCd()
    { if (_shipCd == null) { _shipCd = nCV(); }
      return _shipCd; }
    protected ConditionValue xgetCValueShipCd() { return xdfgetShipCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ShipCd_Asc() { regOBA("SHIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ShipCd_Desc() { regOBD("SHIP_CD"); return this; }

    protected ConditionValue _shipSchDate;
    public ConditionValue xdfgetShipSchDate()
    { if (_shipSchDate == null) { _shipSchDate = nCV(); }
      return _shipSchDate; }
    protected ConditionValue xgetCValueShipSchDate() { return xdfgetShipSchDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_SCH_DATE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ShipSchDate_Asc() { regOBA("SHIP_SCH_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_SCH_DATE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ShipSchDate_Desc() { regOBD("SHIP_SCH_DATE"); return this; }

    protected ConditionValue _shipToCd;
    public ConditionValue xdfgetShipToCd()
    { if (_shipToCd == null) { _shipToCd = nCV(); }
      return _shipToCd; }
    protected ConditionValue xgetCValueShipToCd() { return xdfgetShipToCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_TO_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ShipToCd_Asc() { regOBA("SHIP_TO_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_TO_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ShipToCd_Desc() { regOBD("SHIP_TO_CD"); return this; }

    protected ConditionValue _shipToSchDate;
    public ConditionValue xdfgetShipToSchDate()
    { if (_shipToSchDate == null) { _shipToSchDate = nCV(); }
      return _shipToSchDate; }
    protected ConditionValue xgetCValueShipToSchDate() { return xdfgetShipToSchDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_TO_SCH_DATE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ShipToSchDate_Asc() { regOBA("SHIP_TO_SCH_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_TO_SCH_DATE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ShipToSchDate_Desc() { regOBD("SHIP_TO_SCH_DATE"); return this; }

    protected ConditionValue _fcflg;
    public ConditionValue xdfgetFcflg()
    { if (_fcflg == null) { _fcflg = nCV(); }
      return _fcflg; }
    protected ConditionValue xgetCValueFcflg() { return xdfgetFcflg(); }

    /**
     * Add order-by as ascend. <br>
     * FCFLG: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_Fcflg_Asc() { regOBA("FCFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FCFLG: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_Fcflg_Desc() { regOBD("FCFLG"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEDeliverySortingCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEDeliverySortingCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEDeliverySortingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEDeliverySortingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EDeliverySortingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EDeliverySortingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EDeliverySortingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EDeliverySortingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EDeliverySortingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EDeliverySortingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EDeliverySortingCQ> _myselfExistsMap;
    public Map<String, EDeliverySortingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EDeliverySortingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EDeliverySortingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EDeliverySortingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EDeliverySortingCB.class.getName(); }
    protected String xCQ() { return EDeliverySortingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
