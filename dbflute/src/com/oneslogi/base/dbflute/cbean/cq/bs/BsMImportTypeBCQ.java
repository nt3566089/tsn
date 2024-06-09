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
 * The base condition-query of M_IMPORT_TYPE_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsMImportTypeBCQ extends AbstractBsMImportTypeBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MImportTypeBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMImportTypeBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_IMPORT_TYPE_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MImportTypeBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MImportTypeBCIQ xcreateCIQ() {
        MImportTypeBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MImportTypeBCIQ xnewCIQ() {
        return new MImportTypeBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_IMPORT_TYPE_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MImportTypeBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MImportTypeBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _importTypeBId;
    public ConditionValue xdfgetImportTypeBId()
    { if (_importTypeBId == null) { _importTypeBId = nCV(); }
      return _importTypeBId; }
    protected ConditionValue xgetCValueImportTypeBId() { return xdfgetImportTypeBId(); }

    public Map<String, MImportTypeBCopyBCQ> xdfgetImportTypeBId_ExistsReferrer_MImportTypeBCopyBList() { return xgetSQueMap("importTypeBId_ExistsReferrer_MImportTypeBCopyBList"); }
    public String keepImportTypeBId_ExistsReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq) { return xkeepSQue("importTypeBId_ExistsReferrer_MImportTypeBCopyBList", sq); }

    public Map<String, MImportTypeBCopyHCQ> xdfgetImportTypeBId_ExistsReferrer_MImportTypeBCopyHList() { return xgetSQueMap("importTypeBId_ExistsReferrer_MImportTypeBCopyHList"); }
    public String keepImportTypeBId_ExistsReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq) { return xkeepSQue("importTypeBId_ExistsReferrer_MImportTypeBCopyHList", sq); }

    public Map<String, MImportTypeBCopyBCQ> xdfgetImportTypeBId_NotExistsReferrer_MImportTypeBCopyBList() { return xgetSQueMap("importTypeBId_NotExistsReferrer_MImportTypeBCopyBList"); }
    public String keepImportTypeBId_NotExistsReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq) { return xkeepSQue("importTypeBId_NotExistsReferrer_MImportTypeBCopyBList", sq); }

    public Map<String, MImportTypeBCopyHCQ> xdfgetImportTypeBId_NotExistsReferrer_MImportTypeBCopyHList() { return xgetSQueMap("importTypeBId_NotExistsReferrer_MImportTypeBCopyHList"); }
    public String keepImportTypeBId_NotExistsReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq) { return xkeepSQue("importTypeBId_NotExistsReferrer_MImportTypeBCopyHList", sq); }

    public Map<String, MImportTypeBCopyBCQ> xdfgetImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyBList() { return xgetSQueMap("importTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyBList"); }
    public String keepImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq) { return xkeepSQue("importTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyBList", sq); }

    public Map<String, MImportTypeBCopyHCQ> xdfgetImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyHList() { return xgetSQueMap("importTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyHList"); }
    public String keepImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq) { return xkeepSQue("importTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyHList", sq); }

    public Map<String, MImportTypeBCopyBCQ> xdfgetImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList() { return xgetSQueMap("importTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList"); }
    public String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq) { return xkeepSQue("importTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList", sq); }
    public Map<String, Object> xdfgetImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBListParameter() { return xgetSQuePmMap("importTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList"); }
    public String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBListParameter(Object pm) { return xkeepSQuePm("importTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList", pm); }

    public Map<String, MImportTypeBCopyHCQ> xdfgetImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList() { return xgetSQueMap("importTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList"); }
    public String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq) { return xkeepSQue("importTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList", sq); }
    public Map<String, Object> xdfgetImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHListParameter() { return xgetSQuePmMap("importTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList"); }
    public String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHListParameter(Object pm) { return xkeepSQuePm("importTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList", pm); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_ImportTypeBId_Asc() { regOBA("IMPORT_TYPE_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_ImportTypeBId_Desc() { regOBD("IMPORT_TYPE_B_ID"); return this; }

    protected ConditionValue _importTypeId;
    public ConditionValue xdfgetImportTypeId()
    { if (_importTypeId == null) { _importTypeId = nCV(); }
      return _importTypeId; }
    protected ConditionValue xgetCValueImportTypeId() { return xdfgetImportTypeId(); }

    public Map<String, MImportTypeCQ> getImportTypeId_InScopeRelation_MImportType() { return xgetSQueMap("importTypeId_InScopeRelation_MImportType"); }
    public String keepImportTypeId_InScopeRelation_MImportType(MImportTypeCQ sq) { return xkeepSQue("importTypeId_InScopeRelation_MImportType", sq); }

    public Map<String, MImportTypeCQ> getImportTypeId_NotInScopeRelation_MImportType() { return xgetSQueMap("importTypeId_NotInScopeRelation_MImportType"); }
    public String keepImportTypeId_NotInScopeRelation_MImportType(MImportTypeCQ sq) { return xkeepSQue("importTypeId_NotInScopeRelation_MImportType", sq); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_ImportTypeId_Asc() { regOBA("IMPORT_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_ImportTypeId_Desc() { regOBD("IMPORT_TYPE_ID"); return this; }

    protected ConditionValue _columnNo;
    public ConditionValue xdfgetColumnNo()
    { if (_columnNo == null) { _columnNo = nCV(); }
      return _columnNo; }
    protected ConditionValue xgetCValueColumnNo() { return xdfgetColumnNo(); }

    /**
     * Add order-by as ascend. <br>
     * COLUMN_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_ColumnNo_Asc() { regOBA("COLUMN_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLUMN_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_ColumnNo_Desc() { regOBD("COLUMN_NO"); return this; }

    protected ConditionValue _ediColumnId;
    public ConditionValue xdfgetEdiColumnId()
    { if (_ediColumnId == null) { _ediColumnId = nCV(); }
      return _ediColumnId; }
    protected ConditionValue xgetCValueEdiColumnId() { return xdfgetEdiColumnId(); }

    public Map<String, MEdiColumnCQ> getEdiColumnId_InScopeRelation_MEdiColumn() { return xgetSQueMap("ediColumnId_InScopeRelation_MEdiColumn"); }
    public String keepEdiColumnId_InScopeRelation_MEdiColumn(MEdiColumnCQ sq) { return xkeepSQue("ediColumnId_InScopeRelation_MEdiColumn", sq); }

    public Map<String, MEdiColumnCQ> getEdiColumnId_NotInScopeRelation_MEdiColumn() { return xgetSQueMap("ediColumnId_NotInScopeRelation_MEdiColumn"); }
    public String keepEdiColumnId_NotInScopeRelation_MEdiColumn(MEdiColumnCQ sq) { return xkeepSQue("ediColumnId_NotInScopeRelation_MEdiColumn", sq); }

    /**
     * Add order-by as ascend. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_EdiColumnId_Asc() { regOBA("EDI_COLUMN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_EdiColumnId_Desc() { regOBD("EDI_COLUMN_ID"); return this; }

    protected ConditionValue _uploadColumnNm;
    public ConditionValue xdfgetUploadColumnNm()
    { if (_uploadColumnNm == null) { _uploadColumnNm = nCV(); }
      return _uploadColumnNm; }
    protected ConditionValue xgetCValueUploadColumnNm() { return xdfgetUploadColumnNm(); }

    /**
     * Add order-by as ascend. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_UploadColumnNm_Asc() { regOBA("UPLOAD_COLUMN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_UploadColumnNm_Desc() { regOBD("UPLOAD_COLUMN_NM"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMImportTypeBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMImportTypeBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMImportTypeBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMImportTypeBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MImportTypeBCQ bq = (MImportTypeBCQ)bqs;
        MImportTypeBCQ uq = (MImportTypeBCQ)uqs;
        if (bq.hasConditionQueryMEdiColumn()) {
            uq.queryMEdiColumn().reflectRelationOnUnionQuery(bq.queryMEdiColumn(), uq.queryMEdiColumn());
        }
        if (bq.hasConditionQueryMImportType()) {
            uq.queryMImportType().reflectRelationOnUnionQuery(bq.queryMImportType(), uq.queryMImportType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_EDI_COLUMN by my EDI_COLUMN_ID, named 'MEdiColumn'.
     * @return The instance of condition-query. (NotNull)
     */
    public MEdiColumnCQ queryMEdiColumn() {
        return xdfgetConditionQueryMEdiColumn();
    }
    public MEdiColumnCQ xdfgetConditionQueryMEdiColumn() {
        String prop = "mEdiColumn";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMEdiColumn()); xsetupOuterJoinMEdiColumn(); }
        return xgetQueRlMap(prop);
    }
    protected MEdiColumnCQ xcreateQueryMEdiColumn() {
        String nrp = xresolveNRP("M_IMPORT_TYPE_B", "mEdiColumn"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MEdiColumnCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mEdiColumn", nrp);
    }
    protected void xsetupOuterJoinMEdiColumn() { xregOutJo("mEdiColumn"); }
    public boolean hasConditionQueryMEdiColumn() { return xhasQueRlMap("mEdiColumn"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MImportTypeCQ queryMImportType() {
        return xdfgetConditionQueryMImportType();
    }
    public MImportTypeCQ xdfgetConditionQueryMImportType() {
        String prop = "mImportType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMImportType()); xsetupOuterJoinMImportType(); }
        return xgetQueRlMap(prop);
    }
    protected MImportTypeCQ xcreateQueryMImportType() {
        String nrp = xresolveNRP("M_IMPORT_TYPE_B", "mImportType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MImportTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mImportType", nrp);
    }
    protected void xsetupOuterJoinMImportType() { xregOutJo("mImportType"); }
    public boolean hasConditionQueryMImportType() { return xhasQueRlMap("mImportType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MImportTypeBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MImportTypeBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MImportTypeBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MImportTypeBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MImportTypeBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MImportTypeBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MImportTypeBCQ> _myselfExistsMap;
    public Map<String, MImportTypeBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MImportTypeBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MImportTypeBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MImportTypeBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MImportTypeBCB.class.getName(); }
    protected String xCQ() { return MImportTypeBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
