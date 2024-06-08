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
 * The base condition-query of M_DATA_INPUT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMDataInputTypeCQ extends AbstractBsMDataInputTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MDataInputTypeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMDataInputTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_DATA_INPUT_TYPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MDataInputTypeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MDataInputTypeCIQ xcreateCIQ() {
        MDataInputTypeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MDataInputTypeCIQ xnewCIQ() {
        return new MDataInputTypeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_DATA_INPUT_TYPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MDataInputTypeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MDataInputTypeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dataInputTypeId;
    public ConditionValue xdfgetDataInputTypeId()
    { if (_dataInputTypeId == null) { _dataInputTypeId = nCV(); }
      return _dataInputTypeId; }
    protected ConditionValue xgetCValueDataInputTypeId() { return xdfgetDataInputTypeId(); }

    public Map<String, MDataInputTypeBCQ> xdfgetDataInputTypeId_ExistsReferrer_MDataInputTypeBList() { return xgetSQueMap("dataInputTypeId_ExistsReferrer_MDataInputTypeBList"); }
    public String keepDataInputTypeId_ExistsReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq) { return xkeepSQue("dataInputTypeId_ExistsReferrer_MDataInputTypeBList", sq); }

    public Map<String, MDataInputTypeBCQ> xdfgetDataInputTypeId_NotExistsReferrer_MDataInputTypeBList() { return xgetSQueMap("dataInputTypeId_NotExistsReferrer_MDataInputTypeBList"); }
    public String keepDataInputTypeId_NotExistsReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq) { return xkeepSQue("dataInputTypeId_NotExistsReferrer_MDataInputTypeBList", sq); }

    public Map<String, MDataInputTypeBCQ> xdfgetDataInputTypeId_SpecifyDerivedReferrer_MDataInputTypeBList() { return xgetSQueMap("dataInputTypeId_SpecifyDerivedReferrer_MDataInputTypeBList"); }
    public String keepDataInputTypeId_SpecifyDerivedReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq) { return xkeepSQue("dataInputTypeId_SpecifyDerivedReferrer_MDataInputTypeBList", sq); }

    public Map<String, MDataInputTypeBCQ> xdfgetDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList() { return xgetSQueMap("dataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList"); }
    public String keepDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq) { return xkeepSQue("dataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList", sq); }
    public Map<String, Object> xdfgetDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBListParameter() { return xgetSQuePmMap("dataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList"); }
    public String keepDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBListParameter(Object pm) { return xkeepSQuePm("dataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_DataInputTypeId_Asc() { regOBA("DATA_INPUT_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_DataInputTypeId_Desc() { regOBD("DATA_INPUT_TYPE_ID"); return this; }

    protected ConditionValue _dataInputTypeCd;
    public ConditionValue xdfgetDataInputTypeCd()
    { if (_dataInputTypeCd == null) { _dataInputTypeCd = nCV(); }
      return _dataInputTypeCd; }
    protected ConditionValue xgetCValueDataInputTypeCd() { return xdfgetDataInputTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_DataInputTypeCd_Asc() { regOBA("DATA_INPUT_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_DataInputTypeCd_Desc() { regOBD("DATA_INPUT_TYPE_CD"); return this; }

    protected ConditionValue _dataInputTypeNm;
    public ConditionValue xdfgetDataInputTypeNm()
    { if (_dataInputTypeNm == null) { _dataInputTypeNm = nCV(); }
      return _dataInputTypeNm; }
    protected ConditionValue xgetCValueDataInputTypeNm() { return xdfgetDataInputTypeNm(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_DataInputTypeNm_Asc() { regOBA("DATA_INPUT_TYPE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_DataInputTypeNm_Desc() { regOBD("DATA_INPUT_TYPE_NM"); return this; }

    protected ConditionValue _characterCd;
    public ConditionValue xdfgetCharacterCd()
    { if (_characterCd == null) { _characterCd = nCV(); }
      return _characterCd; }
    protected ConditionValue xgetCValueCharacterCd() { return xdfgetCharacterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_CharacterCd_Asc() { regOBA("CHARACTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_CharacterCd_Desc() { regOBD("CHARACTER_CD"); return this; }

    protected ConditionValue _lineFeedCd;
    public ConditionValue xdfgetLineFeedCd()
    { if (_lineFeedCd == null) { _lineFeedCd = nCV(); }
      return _lineFeedCd; }
    protected ConditionValue xgetCValueLineFeedCd() { return xdfgetLineFeedCd(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_LineFeedCd_Asc() { regOBA("LINE_FEED_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_LineFeedCd_Desc() { regOBD("LINE_FEED_CD"); return this; }

    protected ConditionValue _delimiter;
    public ConditionValue xdfgetDelimiter()
    { if (_delimiter == null) { _delimiter = nCV(); }
      return _delimiter; }
    protected ConditionValue xgetCValueDelimiter() { return xdfgetDelimiter(); }

    /**
     * Add order-by as ascend. <br>
     * DELIMITER: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_Delimiter_Asc() { regOBA("DELIMITER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIMITER: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_Delimiter_Desc() { regOBD("DELIMITER"); return this; }

    protected ConditionValue _skippingRows;
    public ConditionValue xdfgetSkippingRows()
    { if (_skippingRows == null) { _skippingRows = nCV(); }
      return _skippingRows; }
    protected ConditionValue xgetCValueSkippingRows() { return xdfgetSkippingRows(); }

    /**
     * Add order-by as ascend. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_SkippingRows_Asc() { regOBA("SKIPPING_ROWS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_SkippingRows_Desc() { regOBD("SKIPPING_ROWS"); return this; }

    protected ConditionValue _uploadTableNm;
    public ConditionValue xdfgetUploadTableNm()
    { if (_uploadTableNm == null) { _uploadTableNm = nCV(); }
      return _uploadTableNm; }
    protected ConditionValue xgetCValueUploadTableNm() { return xdfgetUploadTableNm(); }

    /**
     * Add order-by as ascend. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_UploadTableNm_Asc() { regOBA("UPLOAD_TABLE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_UploadTableNm_Desc() { regOBD("UPLOAD_TABLE_NM"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMDataInputTypeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMDataInputTypeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMDataInputTypeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMDataInputTypeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MDataInputTypeCQ bq = (MDataInputTypeCQ)bqs;
        MDataInputTypeCQ uq = (MDataInputTypeCQ)uqs;
        if (bq.hasConditionQueryBClassDtlByDataInputTypeCd()) {
            uq.queryBClassDtlByDataInputTypeCd().reflectRelationOnUnionQuery(bq.queryBClassDtlByDataInputTypeCd(), uq.queryBClassDtlByDataInputTypeCd());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DATA_INPUT_TYPE_CD, named 'BClassDtlByDataInputTypeCd'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDataInputTypeCd() {
        return xdfgetConditionQueryBClassDtlByDataInputTypeCd();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDataInputTypeCd() {
        String prop = "bClassDtlByDataInputTypeCd";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDataInputTypeCd()); xsetupOuterJoinBClassDtlByDataInputTypeCd(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDataInputTypeCd() {
        String nrp = xresolveNRP("M_DATA_INPUT_TYPE", "bClassDtlByDataInputTypeCd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDataInputTypeCd", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDataInputTypeCd() { xregOutJo("bClassDtlByDataInputTypeCd"); }
    public boolean hasConditionQueryBClassDtlByDataInputTypeCd() { return xhasQueRlMap("bClassDtlByDataInputTypeCd"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MDataInputTypeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MDataInputTypeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MDataInputTypeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MDataInputTypeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MDataInputTypeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MDataInputTypeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MDataInputTypeCQ> _myselfExistsMap;
    public Map<String, MDataInputTypeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MDataInputTypeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MDataInputTypeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MDataInputTypeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MDataInputTypeCB.class.getName(); }
    protected String xCQ() { return MDataInputTypeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
