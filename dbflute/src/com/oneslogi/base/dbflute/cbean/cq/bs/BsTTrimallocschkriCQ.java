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
 * The base condition-query of T_TRIMALLOCSCHKRI.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrimallocschkriCQ extends AbstractBsTTrimallocschkriCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrimallocschkriCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrimallocschkriCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRIMALLOCSCHKRI) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrimallocschkriCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrimallocschkriCIQ xcreateCIQ() {
        TTrimallocschkriCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrimallocschkriCIQ xnewCIQ() {
        return new TTrimallocschkriCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRIMALLOCSCHKRI on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrimallocschkriCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrimallocschkriCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trimallocschId;
    public ConditionValue xdfgetTrimallocschId()
    { if (_trimallocschId == null) { _trimallocschId = nCV(); }
      return _trimallocschId; }
    protected ConditionValue xgetCValueTrimallocschId() { return xdfgetTrimallocschId(); }

    public Map<String, TTrimallocadjustCQ> xdfgetTrimallocschId_ExistsReferrer_TTrimallocadjustList() { return xgetSQueMap("trimallocschId_ExistsReferrer_TTrimallocadjustList"); }
    public String keepTrimallocschId_ExistsReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq) { return xkeepSQue("trimallocschId_ExistsReferrer_TTrimallocadjustList", sq); }

    public Map<String, TTrimallocadjustCQ> xdfgetTrimallocschId_NotExistsReferrer_TTrimallocadjustList() { return xgetSQueMap("trimallocschId_NotExistsReferrer_TTrimallocadjustList"); }
    public String keepTrimallocschId_NotExistsReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq) { return xkeepSQue("trimallocschId_NotExistsReferrer_TTrimallocadjustList", sq); }

    public Map<String, TTrimallocadjustCQ> xdfgetTrimallocschId_SpecifyDerivedReferrer_TTrimallocadjustList() { return xgetSQueMap("trimallocschId_SpecifyDerivedReferrer_TTrimallocadjustList"); }
    public String keepTrimallocschId_SpecifyDerivedReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq) { return xkeepSQue("trimallocschId_SpecifyDerivedReferrer_TTrimallocadjustList", sq); }

    public Map<String, TTrimallocadjustCQ> xdfgetTrimallocschId_QueryDerivedReferrer_TTrimallocadjustList() { return xgetSQueMap("trimallocschId_QueryDerivedReferrer_TTrimallocadjustList"); }
    public String keepTrimallocschId_QueryDerivedReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq) { return xkeepSQue("trimallocschId_QueryDerivedReferrer_TTrimallocadjustList", sq); }
    public Map<String, Object> xdfgetTrimallocschId_QueryDerivedReferrer_TTrimallocadjustListParameter() { return xgetSQuePmMap("trimallocschId_QueryDerivedReferrer_TTrimallocadjustList"); }
    public String keepTrimallocschId_QueryDerivedReferrer_TTrimallocadjustListParameter(Object pm) { return xkeepSQuePm("trimallocschId_QueryDerivedReferrer_TTrimallocadjustList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_TrimallocschId_Asc() { regOBA("TRIMALLOCSCH_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_TrimallocschId_Desc() { regOBD("TRIMALLOCSCH_ID"); return this; }

    protected ConditionValue _trimallocHId;
    public ConditionValue xdfgetTrimallocHId()
    { if (_trimallocHId == null) { _trimallocHId = nCV(); }
      return _trimallocHId; }
    protected ConditionValue xgetCValueTrimallocHId() { return xdfgetTrimallocHId(); }

    public Map<String, TTrimallocHCQ> getTrimallocHId_InScopeRelation_TTrimallocH() { return xgetSQueMap("trimallocHId_InScopeRelation_TTrimallocH"); }
    public String keepTrimallocHId_InScopeRelation_TTrimallocH(TTrimallocHCQ sq) { return xkeepSQue("trimallocHId_InScopeRelation_TTrimallocH", sq); }

    public Map<String, TTrimallocHCQ> getTrimallocHId_NotInScopeRelation_TTrimallocH() { return xgetSQueMap("trimallocHId_NotInScopeRelation_TTrimallocH"); }
    public String keepTrimallocHId_NotInScopeRelation_TTrimallocH(TTrimallocHCQ sq) { return xkeepSQue("trimallocHId_NotInScopeRelation_TTrimallocH", sq); }

    /**
     * Add order-by as ascend. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_TrimallocHId_Asc() { regOBA("TRIMALLOC_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_TrimallocHId_Desc() { regOBD("TRIMALLOC_H_ID"); return this; }

    protected ConditionValue _trsodetailId;
    public ConditionValue xdfgetTrsodetailId()
    { if (_trsodetailId == null) { _trsodetailId = nCV(); }
      return _trsodetailId; }
    protected ConditionValue xgetCValueTrsodetailId() { return xdfgetTrsodetailId(); }

    public Map<String, TYtrsodetailCQ> getTrsodetailId_InScopeRelation_TYtrsodetail() { return xgetSQueMap("trsodetailId_InScopeRelation_TYtrsodetail"); }
    public String keepTrsodetailId_InScopeRelation_TYtrsodetail(TYtrsodetailCQ sq) { return xkeepSQue("trsodetailId_InScopeRelation_TYtrsodetail", sq); }

    public Map<String, TYtrsodetailCQ> getTrsodetailId_NotInScopeRelation_TYtrsodetail() { return xgetSQueMap("trsodetailId_NotInScopeRelation_TYtrsodetail"); }
    public String keepTrsodetailId_NotInScopeRelation_TYtrsodetail(TYtrsodetailCQ sq) { return xkeepSQue("trsodetailId_NotInScopeRelation_TYtrsodetail", sq); }

    /**
     * Add order-by as ascend. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_TrsodetailId_Asc() { regOBA("TRSODETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_TrsodetailId_Desc() { regOBD("TRSODETAIL_ID"); return this; }

    protected ConditionValue _allocImpKey;
    public ConditionValue xdfgetAllocImpKey()
    { if (_allocImpKey == null) { _allocImpKey = nCV(); }
      return _allocImpKey; }
    protected ConditionValue xgetCValueAllocImpKey() { return xdfgetAllocImpKey(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AllocImpKey_Asc() { regOBA("ALLOC_IMP_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AllocImpKey_Desc() { regOBD("ALLOC_IMP_KEY"); return this; }

    protected ConditionValue _alcImpResgNo;
    public ConditionValue xdfgetAlcImpResgNo()
    { if (_alcImpResgNo == null) { _alcImpResgNo = nCV(); }
      return _alcImpResgNo; }
    protected ConditionValue xgetCValueAlcImpResgNo() { return xdfgetAlcImpResgNo(); }

    /**
     * Add order-by as ascend. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AlcImpResgNo_Asc() { regOBA("ALC_IMP_RESG_No"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AlcImpResgNo_Desc() { regOBD("ALC_IMP_RESG_No"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _expectQty;
    public ConditionValue xdfgetExpectQty()
    { if (_expectQty == null) { _expectQty = nCV(); }
      return _expectQty; }
    protected ConditionValue xgetCValueExpectQty() { return xdfgetExpectQty(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_ExpectQty_Asc() { regOBA("EXPECT_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_ExpectQty_Desc() { regOBD("EXPECT_QTY"); return this; }

    protected ConditionValue _manufacturedate;
    public ConditionValue xdfgetManufacturedate()
    { if (_manufacturedate == null) { _manufacturedate = nCV(); }
      return _manufacturedate; }
    protected ConditionValue xgetCValueManufacturedate() { return xdfgetManufacturedate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_Manufacturedate_Asc() { regOBA("MANUFACTUREDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_Manufacturedate_Desc() { regOBD("MANUFACTUREDATE"); return this; }

    protected ConditionValue _designFlg;
    public ConditionValue xdfgetDesignFlg()
    { if (_designFlg == null) { _designFlg = nCV(); }
      return _designFlg; }
    protected ConditionValue xgetCValueDesignFlg() { return xdfgetDesignFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_DesignFlg_Asc() { regOBA("DESIGN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_DesignFlg_Desc() { regOBD("DESIGN_FLG"); return this; }

    protected ConditionValue _alcimexpFlg;
    public ConditionValue xdfgetAlcimexpFlg()
    { if (_alcimexpFlg == null) { _alcimexpFlg = nCV(); }
      return _alcimexpFlg; }
    protected ConditionValue xgetCValueAlcimexpFlg() { return xdfgetAlcimexpFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AlcimexpFlg_Asc() { regOBA("ALCIMEXP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AlcimexpFlg_Desc() { regOBD("ALCIMEXP_FLG"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrimallocschkriCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrimallocschkriCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrimallocschkriCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrimallocschkriCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrimallocschkriCQ bq = (TTrimallocschkriCQ)bqs;
        TTrimallocschkriCQ uq = (TTrimallocschkriCQ)uqs;
        if (bq.hasConditionQueryTYtrsodetail()) {
            uq.queryTYtrsodetail().reflectRelationOnUnionQuery(bq.queryTYtrsodetail(), uq.queryTYtrsodetail());
        }
        if (bq.hasConditionQueryTTrimallocH()) {
            uq.queryTTrimallocH().reflectRelationOnUnionQuery(bq.queryTTrimallocH(), uq.queryTTrimallocH());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @return The instance of condition-query. (NotNull)
     */
    public TYtrsodetailCQ queryTYtrsodetail() {
        return xdfgetConditionQueryTYtrsodetail();
    }
    public TYtrsodetailCQ xdfgetConditionQueryTYtrsodetail() {
        String prop = "tYtrsodetail";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTYtrsodetail()); xsetupOuterJoinTYtrsodetail(); }
        return xgetQueRlMap(prop);
    }
    protected TYtrsodetailCQ xcreateQueryTYtrsodetail() {
        String nrp = xresolveNRP("T_TRIMALLOCSCHKRI", "tYtrsodetail"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TYtrsodetailCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tYtrsodetail", nrp);
    }
    protected void xsetupOuterJoinTYtrsodetail() { xregOutJo("tYtrsodetail"); }
    public boolean hasConditionQueryTYtrsodetail() { return xhasQueRlMap("tYtrsodetail"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_TRIMALLOC_H by my TRIMALLOC_H_ID, named 'TTrimallocH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrimallocHCQ queryTTrimallocH() {
        return xdfgetConditionQueryTTrimallocH();
    }
    public TTrimallocHCQ xdfgetConditionQueryTTrimallocH() {
        String prop = "tTrimallocH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrimallocH()); xsetupOuterJoinTTrimallocH(); }
        return xgetQueRlMap(prop);
    }
    protected TTrimallocHCQ xcreateQueryTTrimallocH() {
        String nrp = xresolveNRP("T_TRIMALLOCSCHKRI", "tTrimallocH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrimallocHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrimallocH", nrp);
    }
    protected void xsetupOuterJoinTTrimallocH() { xregOutJo("tTrimallocH"); }
    public boolean hasConditionQueryTTrimallocH() { return xhasQueRlMap("tTrimallocH"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrimallocschkriCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrimallocschkriCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrimallocschkriCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrimallocschkriCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrimallocschkriCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrimallocschkriCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrimallocschkriCQ> _myselfExistsMap;
    public Map<String, TTrimallocschkriCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrimallocschkriCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrimallocschkriCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrimallocschkriCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrimallocschkriCB.class.getName(); }
    protected String xCQ() { return TTrimallocschkriCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
