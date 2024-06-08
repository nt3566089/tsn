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
 * The base condition-query of W_PRODUCT_SHAPE_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWProductShapeInputCQ extends AbstractBsWProductShapeInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WProductShapeInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWProductShapeInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_PRODUCT_SHAPE_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WProductShapeInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WProductShapeInputCIQ xcreateCIQ() {
        WProductShapeInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WProductShapeInputCIQ xnewCIQ() {
        return new WProductShapeInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_PRODUCT_SHAPE_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WProductShapeInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WProductShapeInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productShapeInputId;
    public ConditionValue xdfgetProductShapeInputId()
    { if (_productShapeInputId == null) { _productShapeInputId = nCV(); }
      return _productShapeInputId; }
    protected ConditionValue xgetCValueProductShapeInputId() { return xdfgetProductShapeInputId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_SHAPE_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ProductShapeInputId_Asc() { regOBA("PRODUCT_SHAPE_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_SHAPE_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ProductShapeInputId_Desc() { regOBD("PRODUCT_SHAPE_INPUT_ID"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _shapeCd;
    public ConditionValue xdfgetShapeCd()
    { if (_shapeCd == null) { _shapeCd = nCV(); }
      return _shapeCd; }
    protected ConditionValue xgetCValueShapeCd() { return xdfgetShapeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ShapeCd_Asc() { regOBA("SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ShapeCd_Desc() { regOBD("SHAPE_CD"); return this; }

    protected ConditionValue _unitNum;
    public ConditionValue xdfgetUnitNum()
    { if (_unitNum == null) { _unitNum = nCV(); }
      return _unitNum; }
    protected ConditionValue xgetCValueUnitNum() { return xdfgetUnitNum(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

    protected ConditionValue _length;
    public ConditionValue xdfgetLength()
    { if (_length == null) { _length = nCV(); }
      return _length; }
    protected ConditionValue xgetCValueLength() { return xdfgetLength(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_Length_Asc() { regOBA("LENGTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_Length_Desc() { regOBD("LENGTH"); return this; }

    protected ConditionValue _width;
    public ConditionValue xdfgetWidth()
    { if (_width == null) { _width = nCV(); }
      return _width; }
    protected ConditionValue xgetCValueWidth() { return xdfgetWidth(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_Width_Asc() { regOBA("WIDTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_Width_Desc() { regOBD("WIDTH"); return this; }

    protected ConditionValue _height;
    public ConditionValue xdfgetHeight()
    { if (_height == null) { _height = nCV(); }
      return _height; }
    protected ConditionValue xgetCValueHeight() { return xdfgetHeight(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_Height_Asc() { regOBA("HEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_Height_Desc() { regOBD("HEIGHT"); return this; }

    protected ConditionValue _volume;
    public ConditionValue xdfgetVolume()
    { if (_volume == null) { _volume = nCV(); }
      return _volume; }
    protected ConditionValue xgetCValueVolume() { return xdfgetVolume(); }

    /**
     * Add order-by as ascend. <br>
     * VOLUME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_Volume_Asc() { regOBA("VOLUME"); return this; }

    /**
     * Add order-by as descend. <br>
     * VOLUME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_Volume_Desc() { regOBD("VOLUME"); return this; }

    protected ConditionValue _netWeight;
    public ConditionValue xdfgetNetWeight()
    { if (_netWeight == null) { _netWeight = nCV(); }
      return _netWeight; }
    protected ConditionValue xgetCValueNetWeight() { return xdfgetNetWeight(); }

    /**
     * Add order-by as ascend. <br>
     * NET_WEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_NetWeight_Asc() { regOBA("NET_WEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NET_WEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_NetWeight_Desc() { regOBD("NET_WEIGHT"); return this; }

    protected ConditionValue _grossWeight;
    public ConditionValue xdfgetGrossWeight()
    { if (_grossWeight == null) { _grossWeight = nCV(); }
      return _grossWeight; }
    protected ConditionValue xgetCValueGrossWeight() { return xdfgetGrossWeight(); }

    /**
     * Add order-by as ascend. <br>
     * GROSS_WEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_GrossWeight_Asc() { regOBA("GROSS_WEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSS_WEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_GrossWeight_Desc() { regOBD("GROSS_WEIGHT"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMsg;
    public ConditionValue xdfgetErrorMsg()
    { if (_errorMsg == null) { _errorMsg = nCV(); }
      return _errorMsg; }
    protected ConditionValue xgetCValueErrorMsg() { return xdfgetErrorMsg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ErrorMsg_Asc() { regOBA("ERROR_MSG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ErrorMsg_Desc() { regOBD("ERROR_MSG"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWProductShapeInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWProductShapeInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWProductShapeInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWProductShapeInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WProductShapeInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WProductShapeInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WProductShapeInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WProductShapeInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WProductShapeInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WProductShapeInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WProductShapeInputCQ> _myselfExistsMap;
    public Map<String, WProductShapeInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WProductShapeInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WProductShapeInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WProductShapeInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WProductShapeInputCB.class.getName(); }
    protected String xCQ() { return WProductShapeInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
