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
 * The base condition-query of T_PACKING_R.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPackingRCQ extends AbstractBsTPackingRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPackingRCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPackingRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_PACKING_R) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPackingRCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPackingRCIQ xcreateCIQ() {
        TPackingRCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPackingRCIQ xnewCIQ() {
        return new TPackingRCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_PACKING_R on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPackingRCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPackingRCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _packingHId;
    public ConditionValue xdfgetPackingHId()
    { if (_packingHId == null) { _packingHId = nCV(); }
      return _packingHId; }
    protected ConditionValue xgetCValuePackingHId() { return xdfgetPackingHId(); }

    public Map<String, TPackingHCQ> getPackingHId_InScopeRelation_TPackingH() { return xgetSQueMap("packingHId_InScopeRelation_TPackingH"); }
    public String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq) { return xkeepSQue("packingHId_InScopeRelation_TPackingH", sq); }

    public Map<String, TPackingHCQ> getPackingHId_NotInScopeRelation_TPackingH() { return xgetSQueMap("packingHId_NotInScopeRelation_TPackingH"); }
    public String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq) { return xkeepSQue("packingHId_NotInScopeRelation_TPackingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_PackingHId_Asc() { regOBA("PACKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_PackingHId_Desc() { regOBD("PACKING_H_ID"); return this; }

    protected ConditionValue _stwOutFlg;
    public ConditionValue xdfgetStwOutFlg()
    { if (_stwOutFlg == null) { _stwOutFlg = nCV(); }
      return _stwOutFlg; }
    protected ConditionValue xgetCValueStwOutFlg() { return xdfgetStwOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_StwOutFlg_Asc() { regOBA("STW_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_StwOutFlg_Desc() { regOBD("STW_OUT_FLG"); return this; }

    protected ConditionValue _stwOutUserId;
    public ConditionValue xdfgetStwOutUserId()
    { if (_stwOutUserId == null) { _stwOutUserId = nCV(); }
      return _stwOutUserId; }
    protected ConditionValue xgetCValueStwOutUserId() { return xdfgetStwOutUserId(); }

    public Map<String, BUserCQ> getStwOutUserId_InScopeRelation_BUserByStwOutUserId() { return xgetSQueMap("stwOutUserId_InScopeRelation_BUserByStwOutUserId"); }
    public String keepStwOutUserId_InScopeRelation_BUserByStwOutUserId(BUserCQ sq) { return xkeepSQue("stwOutUserId_InScopeRelation_BUserByStwOutUserId", sq); }

    public Map<String, BUserCQ> getStwOutUserId_NotInScopeRelation_BUserByStwOutUserId() { return xgetSQueMap("stwOutUserId_NotInScopeRelation_BUserByStwOutUserId"); }
    public String keepStwOutUserId_NotInScopeRelation_BUserByStwOutUserId(BUserCQ sq) { return xkeepSQue("stwOutUserId_NotInScopeRelation_BUserByStwOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_StwOutUserId_Asc() { regOBA("STW_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_StwOutUserId_Desc() { regOBD("STW_OUT_USER_ID"); return this; }

    protected ConditionValue _stwOutDt;
    public ConditionValue xdfgetStwOutDt()
    { if (_stwOutDt == null) { _stwOutDt = nCV(); }
      return _stwOutDt; }
    protected ConditionValue xgetCValueStwOutDt() { return xdfgetStwOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_StwOutDt_Asc() { regOBA("STW_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STW_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_StwOutDt_Desc() { regOBD("STW_OUT_DT"); return this; }

    protected ConditionValue _tagOutFlg;
    public ConditionValue xdfgetTagOutFlg()
    { if (_tagOutFlg == null) { _tagOutFlg = nCV(); }
      return _tagOutFlg; }
    protected ConditionValue xgetCValueTagOutFlg() { return xdfgetTagOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_TagOutFlg_Asc() { regOBA("TAG_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_TagOutFlg_Desc() { regOBD("TAG_OUT_FLG"); return this; }

    protected ConditionValue _tagOutUserId;
    public ConditionValue xdfgetTagOutUserId()
    { if (_tagOutUserId == null) { _tagOutUserId = nCV(); }
      return _tagOutUserId; }
    protected ConditionValue xgetCValueTagOutUserId() { return xdfgetTagOutUserId(); }

    public Map<String, BUserCQ> getTagOutUserId_InScopeRelation_BUserByTagOutUserId() { return xgetSQueMap("tagOutUserId_InScopeRelation_BUserByTagOutUserId"); }
    public String keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(BUserCQ sq) { return xkeepSQue("tagOutUserId_InScopeRelation_BUserByTagOutUserId", sq); }

    public Map<String, BUserCQ> getTagOutUserId_NotInScopeRelation_BUserByTagOutUserId() { return xgetSQueMap("tagOutUserId_NotInScopeRelation_BUserByTagOutUserId"); }
    public String keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(BUserCQ sq) { return xkeepSQue("tagOutUserId_NotInScopeRelation_BUserByTagOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_TagOutUserId_Asc() { regOBA("TAG_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_TagOutUserId_Desc() { regOBD("TAG_OUT_USER_ID"); return this; }

    protected ConditionValue _tagOutDt;
    public ConditionValue xdfgetTagOutDt()
    { if (_tagOutDt == null) { _tagOutDt = nCV(); }
      return _tagOutDt; }
    protected ConditionValue xgetCValueTagOutDt() { return xdfgetTagOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_TagOutDt_Asc() { regOBA("TAG_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_TagOutDt_Desc() { regOBD("TAG_OUT_DT"); return this; }

    protected ConditionValue _tagDlUrl;
    public ConditionValue xdfgetTagDlUrl()
    { if (_tagDlUrl == null) { _tagDlUrl = nCV(); }
      return _tagDlUrl; }
    protected ConditionValue xgetCValueTagDlUrl() { return xdfgetTagDlUrl(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_DL_URL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_TagDlUrl_Asc() { regOBA("TAG_DL_URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_DL_URL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_TagDlUrl_Desc() { regOBD("TAG_DL_URL"); return this; }

    protected ConditionValue _inspectionOutFlg;
    public ConditionValue xdfgetInspectionOutFlg()
    { if (_inspectionOutFlg == null) { _inspectionOutFlg = nCV(); }
      return _inspectionOutFlg; }
    protected ConditionValue xgetCValueInspectionOutFlg() { return xdfgetInspectionOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_InspectionOutFlg_Asc() { regOBA("INSPECTION_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_InspectionOutFlg_Desc() { regOBD("INSPECTION_OUT_FLG"); return this; }

    protected ConditionValue _inspectionOutUserId;
    public ConditionValue xdfgetInspectionOutUserId()
    { if (_inspectionOutUserId == null) { _inspectionOutUserId = nCV(); }
      return _inspectionOutUserId; }
    protected ConditionValue xgetCValueInspectionOutUserId() { return xdfgetInspectionOutUserId(); }

    public Map<String, BUserCQ> getInspectionOutUserId_InScopeRelation_BUserByInspectionOutUserId() { return xgetSQueMap("inspectionOutUserId_InScopeRelation_BUserByInspectionOutUserId"); }
    public String keepInspectionOutUserId_InScopeRelation_BUserByInspectionOutUserId(BUserCQ sq) { return xkeepSQue("inspectionOutUserId_InScopeRelation_BUserByInspectionOutUserId", sq); }

    public Map<String, BUserCQ> getInspectionOutUserId_NotInScopeRelation_BUserByInspectionOutUserId() { return xgetSQueMap("inspectionOutUserId_NotInScopeRelation_BUserByInspectionOutUserId"); }
    public String keepInspectionOutUserId_NotInScopeRelation_BUserByInspectionOutUserId(BUserCQ sq) { return xkeepSQue("inspectionOutUserId_NotInScopeRelation_BUserByInspectionOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_InspectionOutUserId_Asc() { regOBA("INSPECTION_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_InspectionOutUserId_Desc() { regOBD("INSPECTION_OUT_USER_ID"); return this; }

    protected ConditionValue _inspectionOutDt;
    public ConditionValue xdfgetInspectionOutDt()
    { if (_inspectionOutDt == null) { _inspectionOutDt = nCV(); }
      return _inspectionOutDt; }
    protected ConditionValue xgetCValueInspectionOutDt() { return xdfgetInspectionOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_InspectionOutDt_Asc() { regOBA("INSPECTION_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_InspectionOutDt_Desc() { regOBD("INSPECTION_OUT_DT"); return this; }

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
    public BsTPackingRCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPackingRCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPackingRCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPackingRCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPackingRCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPackingRCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPackingRCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPackingRCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPackingRCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPackingRCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPackingRCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPackingRCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPackingRCQ bq = (TPackingRCQ)bqs;
        TPackingRCQ uq = (TPackingRCQ)uqs;
        if (bq.hasConditionQueryBUserByInspectionOutUserId()) {
            uq.queryBUserByInspectionOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByInspectionOutUserId(), uq.queryBUserByInspectionOutUserId());
        }
        if (bq.hasConditionQueryTPackingH()) {
            uq.queryTPackingH().reflectRelationOnUnionQuery(bq.queryTPackingH(), uq.queryTPackingH());
        }
        if (bq.hasConditionQueryBUserByStwOutUserId()) {
            uq.queryBUserByStwOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByStwOutUserId(), uq.queryBUserByStwOutUserId());
        }
        if (bq.hasConditionQueryBUserByTagOutUserId()) {
            uq.queryBUserByTagOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByTagOutUserId(), uq.queryBUserByTagOutUserId());
        }
        if (bq.hasConditionQueryBClassDtlByStwOutFlg()) {
            uq.queryBClassDtlByStwOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStwOutFlg(), uq.queryBClassDtlByStwOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByTagOutFlg()) {
            uq.queryBClassDtlByTagOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByTagOutFlg(), uq.queryBClassDtlByTagOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInspectionOutFlg()) {
            uq.queryBClassDtlByInspectionOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInspectionOutFlg(), uq.queryBClassDtlByInspectionOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my INSPECTION_OUT_USER_ID, named 'BUserByInspectionOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByInspectionOutUserId() {
        return xdfgetConditionQueryBUserByInspectionOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByInspectionOutUserId() {
        String prop = "bUserByInspectionOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByInspectionOutUserId()); xsetupOuterJoinBUserByInspectionOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByInspectionOutUserId() {
        String nrp = xresolveNRP("T_PACKING_R", "bUserByInspectionOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByInspectionOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByInspectionOutUserId() { xregOutJo("bUserByInspectionOutUserId"); }
    public boolean hasConditionQueryBUserByInspectionOutUserId() { return xhasQueRlMap("bUserByInspectionOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPackingHCQ queryTPackingH() {
        return xdfgetConditionQueryTPackingH();
    }
    public TPackingHCQ xdfgetConditionQueryTPackingH() {
        String prop = "tPackingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPackingH()); xsetupOuterJoinTPackingH(); }
        return xgetQueRlMap(prop);
    }
    protected TPackingHCQ xcreateQueryTPackingH() {
        String nrp = xresolveNRP("T_PACKING_R", "tPackingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPackingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPackingH", nrp);
    }
    protected void xsetupOuterJoinTPackingH() { xregOutJo("tPackingH"); }
    public boolean hasConditionQueryTPackingH() { return xhasQueRlMap("tPackingH"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my STW_OUT_USER_ID, named 'BUserByStwOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByStwOutUserId() {
        return xdfgetConditionQueryBUserByStwOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByStwOutUserId() {
        String prop = "bUserByStwOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByStwOutUserId()); xsetupOuterJoinBUserByStwOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByStwOutUserId() {
        String nrp = xresolveNRP("T_PACKING_R", "bUserByStwOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByStwOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByStwOutUserId() { xregOutJo("bUserByStwOutUserId"); }
    public boolean hasConditionQueryBUserByStwOutUserId() { return xhasQueRlMap("bUserByStwOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByTagOutUserId() {
        return xdfgetConditionQueryBUserByTagOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByTagOutUserId() {
        String prop = "bUserByTagOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByTagOutUserId()); xsetupOuterJoinBUserByTagOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByTagOutUserId() {
        String nrp = xresolveNRP("T_PACKING_R", "bUserByTagOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByTagOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByTagOutUserId() { xregOutJo("bUserByTagOutUserId"); }
    public boolean hasConditionQueryBUserByTagOutUserId() { return xhasQueRlMap("bUserByTagOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STW_OUT_FLG, named 'BClassDtlByStwOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStwOutFlg() {
        return xdfgetConditionQueryBClassDtlByStwOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStwOutFlg() {
        String prop = "bClassDtlByStwOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStwOutFlg()); xsetupOuterJoinBClassDtlByStwOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStwOutFlg() {
        String nrp = xresolveNRP("T_PACKING_R", "bClassDtlByStwOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStwOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStwOutFlg() { xregOutJo("bClassDtlByStwOutFlg"); }
    public boolean hasConditionQueryBClassDtlByStwOutFlg() { return xhasQueRlMap("bClassDtlByStwOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my TAG_OUT_FLG, named 'BClassDtlByTagOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTagOutFlg() {
        return xdfgetConditionQueryBClassDtlByTagOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTagOutFlg() {
        String prop = "bClassDtlByTagOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTagOutFlg()); xsetupOuterJoinBClassDtlByTagOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTagOutFlg() {
        String nrp = xresolveNRP("T_PACKING_R", "bClassDtlByTagOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTagOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTagOutFlg() { xregOutJo("bClassDtlByTagOutFlg"); }
    public boolean hasConditionQueryBClassDtlByTagOutFlg() { return xhasQueRlMap("bClassDtlByTagOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSPECTION_OUT_FLG, named 'BClassDtlByInspectionOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInspectionOutFlg() {
        return xdfgetConditionQueryBClassDtlByInspectionOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInspectionOutFlg() {
        String prop = "bClassDtlByInspectionOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInspectionOutFlg()); xsetupOuterJoinBClassDtlByInspectionOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInspectionOutFlg() {
        String nrp = xresolveNRP("T_PACKING_R", "bClassDtlByInspectionOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInspectionOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInspectionOutFlg() { xregOutJo("bClassDtlByInspectionOutFlg"); }
    public boolean hasConditionQueryBClassDtlByInspectionOutFlg() { return xhasQueRlMap("bClassDtlByInspectionOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TPackingRCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPackingRCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPackingRCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPackingRCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPackingRCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPackingRCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPackingRCQ> _myselfExistsMap;
    public Map<String, TPackingRCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPackingRCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPackingRCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPackingRCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPackingRCB.class.getName(); }
    protected String xCQ() { return TPackingRCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
