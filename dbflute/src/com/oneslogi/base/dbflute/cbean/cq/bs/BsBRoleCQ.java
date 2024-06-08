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
 * The base condition-query of B_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBRoleCQ extends AbstractBsBRoleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BRoleCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBRoleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_ROLE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BRoleCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BRoleCIQ xcreateCIQ() {
        BRoleCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BRoleCIQ xnewCIQ() {
        return new BRoleCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_ROLE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BRoleCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BRoleCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _roleId;
    public ConditionValue xdfgetRoleId()
    { if (_roleId == null) { _roleId = nCV(); }
      return _roleId; }
    protected ConditionValue xgetCValueRoleId() { return xdfgetRoleId(); }

    public Map<String, BColRoleCQ> xdfgetRoleId_ExistsReferrer_BColRoleList() { return xgetSQueMap("roleId_ExistsReferrer_BColRoleList"); }
    public String keepRoleId_ExistsReferrer_BColRoleList(BColRoleCQ sq) { return xkeepSQue("roleId_ExistsReferrer_BColRoleList", sq); }

    public Map<String, BFuncRoleCQ> xdfgetRoleId_ExistsReferrer_BFuncRoleList() { return xgetSQueMap("roleId_ExistsReferrer_BFuncRoleList"); }
    public String keepRoleId_ExistsReferrer_BFuncRoleList(BFuncRoleCQ sq) { return xkeepSQue("roleId_ExistsReferrer_BFuncRoleList", sq); }

    public Map<String, BItemRoleCQ> xdfgetRoleId_ExistsReferrer_BItemRoleList() { return xgetSQueMap("roleId_ExistsReferrer_BItemRoleList"); }
    public String keepRoleId_ExistsReferrer_BItemRoleList(BItemRoleCQ sq) { return xkeepSQue("roleId_ExistsReferrer_BItemRoleList", sq); }

    public Map<String, BRoleGrpDtlCQ> xdfgetRoleId_ExistsReferrer_BRoleGrpDtlList() { return xgetSQueMap("roleId_ExistsReferrer_BRoleGrpDtlList"); }
    public String keepRoleId_ExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq) { return xkeepSQue("roleId_ExistsReferrer_BRoleGrpDtlList", sq); }

    public Map<String, BScreenRoleCQ> xdfgetRoleId_ExistsReferrer_BScreenRoleList() { return xgetSQueMap("roleId_ExistsReferrer_BScreenRoleList"); }
    public String keepRoleId_ExistsReferrer_BScreenRoleList(BScreenRoleCQ sq) { return xkeepSQue("roleId_ExistsReferrer_BScreenRoleList", sq); }

    public Map<String, BColRoleCQ> xdfgetRoleId_NotExistsReferrer_BColRoleList() { return xgetSQueMap("roleId_NotExistsReferrer_BColRoleList"); }
    public String keepRoleId_NotExistsReferrer_BColRoleList(BColRoleCQ sq) { return xkeepSQue("roleId_NotExistsReferrer_BColRoleList", sq); }

    public Map<String, BFuncRoleCQ> xdfgetRoleId_NotExistsReferrer_BFuncRoleList() { return xgetSQueMap("roleId_NotExistsReferrer_BFuncRoleList"); }
    public String keepRoleId_NotExistsReferrer_BFuncRoleList(BFuncRoleCQ sq) { return xkeepSQue("roleId_NotExistsReferrer_BFuncRoleList", sq); }

    public Map<String, BItemRoleCQ> xdfgetRoleId_NotExistsReferrer_BItemRoleList() { return xgetSQueMap("roleId_NotExistsReferrer_BItemRoleList"); }
    public String keepRoleId_NotExistsReferrer_BItemRoleList(BItemRoleCQ sq) { return xkeepSQue("roleId_NotExistsReferrer_BItemRoleList", sq); }

    public Map<String, BRoleGrpDtlCQ> xdfgetRoleId_NotExistsReferrer_BRoleGrpDtlList() { return xgetSQueMap("roleId_NotExistsReferrer_BRoleGrpDtlList"); }
    public String keepRoleId_NotExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq) { return xkeepSQue("roleId_NotExistsReferrer_BRoleGrpDtlList", sq); }

    public Map<String, BScreenRoleCQ> xdfgetRoleId_NotExistsReferrer_BScreenRoleList() { return xgetSQueMap("roleId_NotExistsReferrer_BScreenRoleList"); }
    public String keepRoleId_NotExistsReferrer_BScreenRoleList(BScreenRoleCQ sq) { return xkeepSQue("roleId_NotExistsReferrer_BScreenRoleList", sq); }

    public Map<String, BColRoleCQ> xdfgetRoleId_SpecifyDerivedReferrer_BColRoleList() { return xgetSQueMap("roleId_SpecifyDerivedReferrer_BColRoleList"); }
    public String keepRoleId_SpecifyDerivedReferrer_BColRoleList(BColRoleCQ sq) { return xkeepSQue("roleId_SpecifyDerivedReferrer_BColRoleList", sq); }

    public Map<String, BFuncRoleCQ> xdfgetRoleId_SpecifyDerivedReferrer_BFuncRoleList() { return xgetSQueMap("roleId_SpecifyDerivedReferrer_BFuncRoleList"); }
    public String keepRoleId_SpecifyDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq) { return xkeepSQue("roleId_SpecifyDerivedReferrer_BFuncRoleList", sq); }

    public Map<String, BItemRoleCQ> xdfgetRoleId_SpecifyDerivedReferrer_BItemRoleList() { return xgetSQueMap("roleId_SpecifyDerivedReferrer_BItemRoleList"); }
    public String keepRoleId_SpecifyDerivedReferrer_BItemRoleList(BItemRoleCQ sq) { return xkeepSQue("roleId_SpecifyDerivedReferrer_BItemRoleList", sq); }

    public Map<String, BRoleGrpDtlCQ> xdfgetRoleId_SpecifyDerivedReferrer_BRoleGrpDtlList() { return xgetSQueMap("roleId_SpecifyDerivedReferrer_BRoleGrpDtlList"); }
    public String keepRoleId_SpecifyDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq) { return xkeepSQue("roleId_SpecifyDerivedReferrer_BRoleGrpDtlList", sq); }

    public Map<String, BScreenRoleCQ> xdfgetRoleId_SpecifyDerivedReferrer_BScreenRoleList() { return xgetSQueMap("roleId_SpecifyDerivedReferrer_BScreenRoleList"); }
    public String keepRoleId_SpecifyDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq) { return xkeepSQue("roleId_SpecifyDerivedReferrer_BScreenRoleList", sq); }

    public Map<String, BColRoleCQ> xdfgetRoleId_QueryDerivedReferrer_BColRoleList() { return xgetSQueMap("roleId_QueryDerivedReferrer_BColRoleList"); }
    public String keepRoleId_QueryDerivedReferrer_BColRoleList(BColRoleCQ sq) { return xkeepSQue("roleId_QueryDerivedReferrer_BColRoleList", sq); }
    public Map<String, Object> xdfgetRoleId_QueryDerivedReferrer_BColRoleListParameter() { return xgetSQuePmMap("roleId_QueryDerivedReferrer_BColRoleList"); }
    public String keepRoleId_QueryDerivedReferrer_BColRoleListParameter(Object pm) { return xkeepSQuePm("roleId_QueryDerivedReferrer_BColRoleList", pm); }

    public Map<String, BFuncRoleCQ> xdfgetRoleId_QueryDerivedReferrer_BFuncRoleList() { return xgetSQueMap("roleId_QueryDerivedReferrer_BFuncRoleList"); }
    public String keepRoleId_QueryDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq) { return xkeepSQue("roleId_QueryDerivedReferrer_BFuncRoleList", sq); }
    public Map<String, Object> xdfgetRoleId_QueryDerivedReferrer_BFuncRoleListParameter() { return xgetSQuePmMap("roleId_QueryDerivedReferrer_BFuncRoleList"); }
    public String keepRoleId_QueryDerivedReferrer_BFuncRoleListParameter(Object pm) { return xkeepSQuePm("roleId_QueryDerivedReferrer_BFuncRoleList", pm); }

    public Map<String, BItemRoleCQ> xdfgetRoleId_QueryDerivedReferrer_BItemRoleList() { return xgetSQueMap("roleId_QueryDerivedReferrer_BItemRoleList"); }
    public String keepRoleId_QueryDerivedReferrer_BItemRoleList(BItemRoleCQ sq) { return xkeepSQue("roleId_QueryDerivedReferrer_BItemRoleList", sq); }
    public Map<String, Object> xdfgetRoleId_QueryDerivedReferrer_BItemRoleListParameter() { return xgetSQuePmMap("roleId_QueryDerivedReferrer_BItemRoleList"); }
    public String keepRoleId_QueryDerivedReferrer_BItemRoleListParameter(Object pm) { return xkeepSQuePm("roleId_QueryDerivedReferrer_BItemRoleList", pm); }

    public Map<String, BRoleGrpDtlCQ> xdfgetRoleId_QueryDerivedReferrer_BRoleGrpDtlList() { return xgetSQueMap("roleId_QueryDerivedReferrer_BRoleGrpDtlList"); }
    public String keepRoleId_QueryDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq) { return xkeepSQue("roleId_QueryDerivedReferrer_BRoleGrpDtlList", sq); }
    public Map<String, Object> xdfgetRoleId_QueryDerivedReferrer_BRoleGrpDtlListParameter() { return xgetSQuePmMap("roleId_QueryDerivedReferrer_BRoleGrpDtlList"); }
    public String keepRoleId_QueryDerivedReferrer_BRoleGrpDtlListParameter(Object pm) { return xkeepSQuePm("roleId_QueryDerivedReferrer_BRoleGrpDtlList", pm); }

    public Map<String, BScreenRoleCQ> xdfgetRoleId_QueryDerivedReferrer_BScreenRoleList() { return xgetSQueMap("roleId_QueryDerivedReferrer_BScreenRoleList"); }
    public String keepRoleId_QueryDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq) { return xkeepSQue("roleId_QueryDerivedReferrer_BScreenRoleList", sq); }
    public Map<String, Object> xdfgetRoleId_QueryDerivedReferrer_BScreenRoleListParameter() { return xgetSQuePmMap("roleId_QueryDerivedReferrer_BScreenRoleList"); }
    public String keepRoleId_QueryDerivedReferrer_BScreenRoleListParameter(Object pm) { return xkeepSQuePm("roleId_QueryDerivedReferrer_BScreenRoleList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_RoleId_Asc() { regOBA("ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_RoleId_Desc() { regOBD("ROLE_ID"); return this; }

    protected ConditionValue _roleCd;
    public ConditionValue xdfgetRoleCd()
    { if (_roleCd == null) { _roleCd = nCV(); }
      return _roleCd; }
    protected ConditionValue xgetCValueRoleCd() { return xdfgetRoleCd(); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_RoleCd_Asc() { regOBA("ROLE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_RoleCd_Desc() { regOBD("ROLE_CD"); return this; }

    protected ConditionValue _dictId;
    public ConditionValue xdfgetDictId()
    { if (_dictId == null) { _dictId = nCV(); }
      return _dictId; }
    protected ConditionValue xgetCValueDictId() { return xdfgetDictId(); }

    public Map<String, BDictCQ> getDictId_InScopeRelation_BDict() { return xgetSQueMap("dictId_InScopeRelation_BDict"); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq) { return xkeepSQue("dictId_InScopeRelation_BDict", sq); }

    public Map<String, BDictCQ> getDictId_NotInScopeRelation_BDict() { return xgetSQueMap("dictId_NotInScopeRelation_BDict"); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq) { return xkeepSQue("dictId_NotInScopeRelation_BDict", sq); }

    /**
     * Add order-by as ascend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

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
    public BsBRoleCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBRoleCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBRoleCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBRoleCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBRoleCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBRoleCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBRoleCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBRoleCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBRoleCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBRoleCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBRoleCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBRoleCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BRoleCQ bq = (BRoleCQ)bqs;
        BRoleCQ uq = (BRoleCQ)uqs;
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public VDictCQ queryVDict(Long cultureId) {
        Map<String, Object> parameterMap = xdfgetParameterMapVDict();
        parameterMap.put("cultureId", cultureId);
        xassertFCDP("vDict", parameterMap);
        return xdfgetConditionQueryVDict();
    }
    public VDictCQ xdfgetConditionQueryVDict() {
        String prop = "vDict";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVDict()); xsetupOuterJoinVDict(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapVDict;
    public Map<String, Object> xdfgetParameterMapVDict()
    { if (_parameterMapVDict == null) { _parameterMapVDict = newLinkedHashMapSized(4); }
      return _parameterMapVDict; }
    public void xsetParameterMapVDict(Map<String, Object> parameterMap)
    { _parameterMapVDict = parameterMap; } // for UnionQuery
    protected VDictCQ xcreateQueryVDict() {
        String nrp = xresolveNRP("B_ROLE", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BRoleCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BRoleCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BRoleCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BRoleCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BRoleCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BRoleCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BRoleCQ> _myselfExistsMap;
    public Map<String, BRoleCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BRoleCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BRoleCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BRoleCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BRoleCB.class.getName(); }
    protected String xCQ() { return BRoleCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
