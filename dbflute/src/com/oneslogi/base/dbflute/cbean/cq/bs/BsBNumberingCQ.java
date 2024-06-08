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
 * The base condition-query of B_NUMBERING.
 * @author DBFlute(AutoGenerator)
 */
public class BsBNumberingCQ extends AbstractBsBNumberingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BNumberingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBNumberingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_NUMBERING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BNumberingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BNumberingCIQ xcreateCIQ() {
        BNumberingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BNumberingCIQ xnewCIQ() {
        return new BNumberingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_NUMBERING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BNumberingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BNumberingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _numberingId;
    public ConditionValue xdfgetNumberingId()
    { if (_numberingId == null) { _numberingId = nCV(); }
      return _numberingId; }
    protected ConditionValue xgetCValueNumberingId() { return xdfgetNumberingId(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBERING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_NumberingId_Asc() { regOBA("NUMBERING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBERING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_NumberingId_Desc() { regOBD("NUMBERING_ID"); return this; }

    protected ConditionValue _bizCd;
    public ConditionValue xdfgetBizCd()
    { if (_bizCd == null) { _bizCd = nCV(); }
      return _bizCd; }
    protected ConditionValue xgetCValueBizCd() { return xdfgetBizCd(); }

    /**
     * Add order-by as ascend. <br>
     * BIZ_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_BizCd_Asc() { regOBA("BIZ_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BIZ_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_BizCd_Desc() { regOBD("BIZ_CD"); return this; }

    protected ConditionValue _bizNm;
    public ConditionValue xdfgetBizNm()
    { if (_bizNm == null) { _bizNm = nCV(); }
      return _bizNm; }
    protected ConditionValue xgetCValueBizNm() { return xdfgetBizNm(); }

    /**
     * Add order-by as ascend. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_BizNm_Asc() { regOBA("BIZ_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BIZ_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_BizNm_Desc() { regOBD("BIZ_NM"); return this; }

    protected ConditionValue _length;
    public ConditionValue xdfgetLength()
    { if (_length == null) { _length = nCV(); }
      return _length; }
    protected ConditionValue xgetCValueLength() { return xdfgetLength(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_Length_Asc() { regOBA("LENGTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_Length_Desc() { regOBD("LENGTH"); return this; }

    protected ConditionValue _fixedValue;
    public ConditionValue xdfgetFixedValue()
    { if (_fixedValue == null) { _fixedValue = nCV(); }
      return _fixedValue; }
    protected ConditionValue xgetCValueFixedValue() { return xdfgetFixedValue(); }

    /**
     * Add order-by as ascend. <br>
     * FIXED_VALUE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_FixedValue_Asc() { regOBA("FIXED_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIXED_VALUE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_FixedValue_Desc() { regOBD("FIXED_VALUE"); return this; }

    protected ConditionValue _fixedDtFormat;
    public ConditionValue xdfgetFixedDtFormat()
    { if (_fixedDtFormat == null) { _fixedDtFormat = nCV(); }
      return _fixedDtFormat; }
    protected ConditionValue xgetCValueFixedDtFormat() { return xdfgetFixedDtFormat(); }

    /**
     * Add order-by as ascend. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_FixedDtFormat_Asc() { regOBA("FIXED_DT_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIXED_DT_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_FixedDtFormat_Desc() { regOBD("FIXED_DT_FORMAT"); return this; }

    protected ConditionValue _presentNumber;
    public ConditionValue xdfgetPresentNumber()
    { if (_presentNumber == null) { _presentNumber = nCV(); }
      return _presentNumber; }
    protected ConditionValue xgetCValuePresentNumber() { return xdfgetPresentNumber(); }

    /**
     * Add order-by as ascend. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_PresentNumber_Asc() { regOBA("PRESENT_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_PresentNumber_Desc() { regOBD("PRESENT_NUMBER"); return this; }

    protected ConditionValue _incNumber;
    public ConditionValue xdfgetIncNumber()
    { if (_incNumber == null) { _incNumber = nCV(); }
      return _incNumber; }
    protected ConditionValue xgetCValueIncNumber() { return xdfgetIncNumber(); }

    /**
     * Add order-by as ascend. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_IncNumber_Asc() { regOBA("INC_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * INC_NUMBER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_IncNumber_Desc() { regOBD("INC_NUMBER"); return this; }

    protected ConditionValue _minNumber;
    public ConditionValue xdfgetMinNumber()
    { if (_minNumber == null) { _minNumber = nCV(); }
      return _minNumber; }
    protected ConditionValue xgetCValueMinNumber() { return xdfgetMinNumber(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_MinNumber_Asc() { regOBA("MIN_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_MinNumber_Desc() { regOBD("MIN_NUMBER"); return this; }

    protected ConditionValue _maxNumber;
    public ConditionValue xdfgetMaxNumber()
    { if (_maxNumber == null) { _maxNumber = nCV(); }
      return _maxNumber; }
    protected ConditionValue xgetCValueMaxNumber() { return xdfgetMaxNumber(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_MaxNumber_Asc() { regOBA("MAX_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_MaxNumber_Desc() { regOBD("MAX_NUMBER"); return this; }

    protected ConditionValue _checkDigit;
    public ConditionValue xdfgetCheckDigit()
    { if (_checkDigit == null) { _checkDigit = nCV(); }
      return _checkDigit; }
    protected ConditionValue xgetCValueCheckDigit() { return xdfgetCheckDigit(); }

    /**
     * Add order-by as ascend. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_CheckDigit_Asc() { regOBA("CHECK_DIGIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_CheckDigit_Desc() { regOBD("CHECK_DIGIT"); return this; }

    protected ConditionValue _systemType;
    public ConditionValue xdfgetSystemType()
    { if (_systemType == null) { _systemType = nCV(); }
      return _systemType; }
    protected ConditionValue xgetCValueSystemType() { return xdfgetSystemType(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_SystemType_Asc() { regOBA("SYSTEM_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_SystemType_Desc() { regOBD("SYSTEM_TYPE"); return this; }

    protected ConditionValue _cashCount;
    public ConditionValue xdfgetCashCount()
    { if (_cashCount == null) { _cashCount = nCV(); }
      return _cashCount; }
    protected ConditionValue xgetCValueCashCount() { return xdfgetCashCount(); }

    /**
     * Add order-by as ascend. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_CashCount_Asc() { regOBA("CASH_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_CashCount_Desc() { regOBD("CASH_COUNT"); return this; }

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
    public BsBNumberingCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBNumberingCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBNumberingCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBNumberingCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBNumberingCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBNumberingCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBNumberingCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBNumberingCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBNumberingCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBNumberingCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBNumberingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBNumberingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BNumberingCQ bq = (BNumberingCQ)bqs;
        BNumberingCQ uq = (BNumberingCQ)uqs;
        if (bq.hasConditionQueryBClassDtlByCheckDigit()) {
            uq.queryBClassDtlByCheckDigit().reflectRelationOnUnionQuery(bq.queryBClassDtlByCheckDigit(), uq.queryBClassDtlByCheckDigit());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CHECK_DIGIT, named 'BClassDtlByCheckDigit'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCheckDigit() {
        return xdfgetConditionQueryBClassDtlByCheckDigit();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCheckDigit() {
        String prop = "bClassDtlByCheckDigit";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCheckDigit()); xsetupOuterJoinBClassDtlByCheckDigit(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCheckDigit() {
        String nrp = xresolveNRP("B_NUMBERING", "bClassDtlByCheckDigit"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCheckDigit", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCheckDigit() { xregOutJo("bClassDtlByCheckDigit"); }
    public boolean hasConditionQueryBClassDtlByCheckDigit() { return xhasQueRlMap("bClassDtlByCheckDigit"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BNumberingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BNumberingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BNumberingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BNumberingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BNumberingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BNumberingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BNumberingCQ> _myselfExistsMap;
    public Map<String, BNumberingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BNumberingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BNumberingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BNumberingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BNumberingCB.class.getName(); }
    protected String xCQ() { return BNumberingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
