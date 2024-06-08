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
 * The base condition-query of M_BOX_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BsMBoxGrpCQ extends AbstractBsMBoxGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MBoxGrpCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMBoxGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_BOX_GRP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MBoxGrpCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MBoxGrpCIQ xcreateCIQ() {
        MBoxGrpCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MBoxGrpCIQ xnewCIQ() {
        return new MBoxGrpCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_BOX_GRP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MBoxGrpCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MBoxGrpCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _boxGrpId;
    public ConditionValue xdfgetBoxGrpId()
    { if (_boxGrpId == null) { _boxGrpId = nCV(); }
      return _boxGrpId; }
    protected ConditionValue xgetCValueBoxGrpId() { return xdfgetBoxGrpId(); }

    public Map<String, MBoxGrpDtlCQ> xdfgetBoxGrpId_ExistsReferrer_MBoxGrpDtlList() { return xgetSQueMap("boxGrpId_ExistsReferrer_MBoxGrpDtlList"); }
    public String keepBoxGrpId_ExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq) { return xkeepSQue("boxGrpId_ExistsReferrer_MBoxGrpDtlList", sq); }

    public Map<String, MParamCQ> xdfgetBoxGrpId_ExistsReferrer_MParamList() { return xgetSQueMap("boxGrpId_ExistsReferrer_MParamList"); }
    public String keepBoxGrpId_ExistsReferrer_MParamList(MParamCQ sq) { return xkeepSQue("boxGrpId_ExistsReferrer_MParamList", sq); }

    public Map<String, MBoxGrpDtlCQ> xdfgetBoxGrpId_NotExistsReferrer_MBoxGrpDtlList() { return xgetSQueMap("boxGrpId_NotExistsReferrer_MBoxGrpDtlList"); }
    public String keepBoxGrpId_NotExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq) { return xkeepSQue("boxGrpId_NotExistsReferrer_MBoxGrpDtlList", sq); }

    public Map<String, MParamCQ> xdfgetBoxGrpId_NotExistsReferrer_MParamList() { return xgetSQueMap("boxGrpId_NotExistsReferrer_MParamList"); }
    public String keepBoxGrpId_NotExistsReferrer_MParamList(MParamCQ sq) { return xkeepSQue("boxGrpId_NotExistsReferrer_MParamList", sq); }

    public Map<String, MBoxGrpDtlCQ> xdfgetBoxGrpId_SpecifyDerivedReferrer_MBoxGrpDtlList() { return xgetSQueMap("boxGrpId_SpecifyDerivedReferrer_MBoxGrpDtlList"); }
    public String keepBoxGrpId_SpecifyDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq) { return xkeepSQue("boxGrpId_SpecifyDerivedReferrer_MBoxGrpDtlList", sq); }

    public Map<String, MParamCQ> xdfgetBoxGrpId_SpecifyDerivedReferrer_MParamList() { return xgetSQueMap("boxGrpId_SpecifyDerivedReferrer_MParamList"); }
    public String keepBoxGrpId_SpecifyDerivedReferrer_MParamList(MParamCQ sq) { return xkeepSQue("boxGrpId_SpecifyDerivedReferrer_MParamList", sq); }

    public Map<String, MBoxGrpDtlCQ> xdfgetBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlList() { return xgetSQueMap("boxGrpId_QueryDerivedReferrer_MBoxGrpDtlList"); }
    public String keepBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq) { return xkeepSQue("boxGrpId_QueryDerivedReferrer_MBoxGrpDtlList", sq); }
    public Map<String, Object> xdfgetBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlListParameter() { return xgetSQuePmMap("boxGrpId_QueryDerivedReferrer_MBoxGrpDtlList"); }
    public String keepBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlListParameter(Object pm) { return xkeepSQuePm("boxGrpId_QueryDerivedReferrer_MBoxGrpDtlList", pm); }

    public Map<String, MParamCQ> xdfgetBoxGrpId_QueryDerivedReferrer_MParamList() { return xgetSQueMap("boxGrpId_QueryDerivedReferrer_MParamList"); }
    public String keepBoxGrpId_QueryDerivedReferrer_MParamList(MParamCQ sq) { return xkeepSQue("boxGrpId_QueryDerivedReferrer_MParamList", sq); }
    public Map<String, Object> xdfgetBoxGrpId_QueryDerivedReferrer_MParamListParameter() { return xgetSQuePmMap("boxGrpId_QueryDerivedReferrer_MParamList"); }
    public String keepBoxGrpId_QueryDerivedReferrer_MParamListParameter(Object pm) { return xkeepSQuePm("boxGrpId_QueryDerivedReferrer_MParamList", pm); }

    /**
     * Add order-by as ascend. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_BoxGrpId_Asc() { regOBA("BOX_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_BoxGrpId_Desc() { regOBD("BOX_GRP_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _boxGrpCd;
    public ConditionValue xdfgetBoxGrpCd()
    { if (_boxGrpCd == null) { _boxGrpCd = nCV(); }
      return _boxGrpCd; }
    protected ConditionValue xgetCValueBoxGrpCd() { return xdfgetBoxGrpCd(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_BoxGrpCd_Asc() { regOBA("BOX_GRP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_BoxGrpCd_Desc() { regOBD("BOX_GRP_CD"); return this; }

    protected ConditionValue _boxGrpNm;
    public ConditionValue xdfgetBoxGrpNm()
    { if (_boxGrpNm == null) { _boxGrpNm = nCV(); }
      return _boxGrpNm; }
    protected ConditionValue xgetCValueBoxGrpNm() { return xdfgetBoxGrpNm(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_BoxGrpNm_Asc() { regOBA("BOX_GRP_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_BoxGrpNm_Desc() { regOBD("BOX_GRP_NM"); return this; }

    protected ConditionValue _standardBoxId;
    public ConditionValue xdfgetStandardBoxId()
    { if (_standardBoxId == null) { _standardBoxId = nCV(); }
      return _standardBoxId; }
    protected ConditionValue xgetCValueStandardBoxId() { return xdfgetStandardBoxId(); }

    public Map<String, MBoxCQ> getStandardBoxId_InScopeRelation_MBox() { return xgetSQueMap("standardBoxId_InScopeRelation_MBox"); }
    public String keepStandardBoxId_InScopeRelation_MBox(MBoxCQ sq) { return xkeepSQue("standardBoxId_InScopeRelation_MBox", sq); }

    public Map<String, MBoxCQ> getStandardBoxId_NotInScopeRelation_MBox() { return xgetSQueMap("standardBoxId_NotInScopeRelation_MBox"); }
    public String keepStandardBoxId_NotInScopeRelation_MBox(MBoxCQ sq) { return xkeepSQue("standardBoxId_NotInScopeRelation_MBox", sq); }

    /**
     * Add order-by as ascend. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_StandardBoxId_Asc() { regOBA("STANDARD_BOX_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_StandardBoxId_Desc() { regOBD("STANDARD_BOX_ID"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMBoxGrpCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMBoxGrpCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMBoxGrpCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMBoxGrpCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMBoxGrpCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMBoxGrpCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMBoxGrpCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMBoxGrpCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMBoxGrpCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMBoxGrpCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMBoxGrpCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MBoxGrpCQ bq = (MBoxGrpCQ)bqs;
        MBoxGrpCQ uq = (MBoxGrpCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMBox()) {
            uq.queryMBox().reflectRelationOnUnionQuery(bq.queryMBox(), uq.queryMBox());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("M_BOX_GRP", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_BOX by my STANDARD_BOX_ID, named 'MBox'.
     * @return The instance of condition-query. (NotNull)
     */
    public MBoxCQ queryMBox() {
        return xdfgetConditionQueryMBox();
    }
    public MBoxCQ xdfgetConditionQueryMBox() {
        String prop = "mBox";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMBox()); xsetupOuterJoinMBox(); }
        return xgetQueRlMap(prop);
    }
    protected MBoxCQ xcreateQueryMBox() {
        String nrp = xresolveNRP("M_BOX_GRP", "mBox"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MBoxCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mBox", nrp);
    }
    protected void xsetupOuterJoinMBox() { xregOutJo("mBox"); }
    public boolean hasConditionQueryMBox() { return xhasQueRlMap("mBox"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_BOX_GRP", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MBoxGrpCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MBoxGrpCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MBoxGrpCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MBoxGrpCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MBoxGrpCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MBoxGrpCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MBoxGrpCQ> _myselfExistsMap;
    public Map<String, MBoxGrpCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MBoxGrpCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MBoxGrpCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MBoxGrpCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MBoxGrpCB.class.getName(); }
    protected String xCQ() { return MBoxGrpCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
