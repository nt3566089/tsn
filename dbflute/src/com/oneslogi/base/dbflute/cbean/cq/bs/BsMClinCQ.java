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
 * The base condition-query of M_CLIN.
 * @author DBFlute(AutoGenerator)
 */
public class BsMClinCQ extends AbstractBsMClinCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MClinCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMClinCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CLIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MClinCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MClinCIQ xcreateCIQ() {
        MClinCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MClinCIQ xnewCIQ() {
        return new MClinCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CLIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MClinCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MClinCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _clinId;
    public ConditionValue xdfgetClinId()
    { if (_clinId == null) { _clinId = nCV(); }
      return _clinId; }
    protected ConditionValue xgetCValueClinId() { return xdfgetClinId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_ClinId_Asc() { regOBA("CLIN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_ClinId_Desc() { regOBD("CLIN_ID"); return this; }

    protected ConditionValue _lincd;
    public ConditionValue xdfgetLincd()
    { if (_lincd == null) { _lincd = nCV(); }
      return _lincd; }
    protected ConditionValue xgetCValueLincd() { return xdfgetLincd(); }

    /**
     * Add order-by as ascend. <br>
     * LINCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Lincd_Asc() { regOBA("LINCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Lincd_Desc() { regOBD("LINCD"); return this; }

    protected ConditionValue _linnm;
    public ConditionValue xdfgetLinnm()
    { if (_linnm == null) { _linnm = nCV(); }
      return _linnm; }
    protected ConditionValue xgetCValueLinnm() { return xdfgetLinnm(); }

    /**
     * Add order-by as ascend. <br>
     * LINNM: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Linnm_Asc() { regOBA("LINNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINNM: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Linnm_Desc() { regOBD("LINNM"); return this; }

    protected ConditionValue _splctg;
    public ConditionValue xdfgetSplctg()
    { if (_splctg == null) { _splctg = nCV(); }
      return _splctg; }
    protected ConditionValue xgetCValueSplctg() { return xdfgetSplctg(); }

    /**
     * Add order-by as ascend. <br>
     * SPLCTG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Splctg_Asc() { regOBA("SPLCTG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPLCTG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Splctg_Desc() { regOBD("SPLCTG"); return this; }

    protected ConditionValue _linblk1;
    public ConditionValue xdfgetLinblk1()
    { if (_linblk1 == null) { _linblk1 = nCV(); }
      return _linblk1; }
    protected ConditionValue xgetCValueLinblk1() { return xdfgetLinblk1(); }

    /**
     * Add order-by as ascend. <br>
     * LINBLK1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Linblk1_Asc() { regOBA("LINBLK1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Linblk1_Desc() { regOBD("LINBLK1"); return this; }

    protected ConditionValue _linblk2;
    public ConditionValue xdfgetLinblk2()
    { if (_linblk2 == null) { _linblk2 = nCV(); }
      return _linblk2; }
    protected ConditionValue xgetCValueLinblk2() { return xdfgetLinblk2(); }

    /**
     * Add order-by as ascend. <br>
     * LINBLK2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Linblk2_Asc() { regOBA("LINBLK2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Linblk2_Desc() { regOBD("LINBLK2"); return this; }

    protected ConditionValue _sftpclrsfid;
    public ConditionValue xdfgetSftpclrsfid()
    { if (_sftpclrsfid == null) { _sftpclrsfid = nCV(); }
      return _sftpclrsfid; }
    protected ConditionValue xgetCValueSftpclrsfid() { return xdfgetSftpclrsfid(); }

    /**
     * Add order-by as ascend. <br>
     * SFTPCLRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Sftpclrsfid_Asc() { regOBA("SFTPCLRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFTPCLRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Sftpclrsfid_Desc() { regOBD("SFTPCLRSFID"); return this; }

    protected ConditionValue _tsnboxrsfid;
    public ConditionValue xdfgetTsnboxrsfid()
    { if (_tsnboxrsfid == null) { _tsnboxrsfid = nCV(); }
      return _tsnboxrsfid; }
    protected ConditionValue xgetCValueTsnboxrsfid() { return xdfgetTsnboxrsfid(); }

    /**
     * Add order-by as ascend. <br>
     * TSNBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Tsnboxrsfid_Asc() { regOBA("TSNBOXRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSNBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Tsnboxrsfid_Desc() { regOBD("TSNBOXRSFID"); return this; }

    protected ConditionValue _jtboxrsfid;
    public ConditionValue xdfgetJtboxrsfid()
    { if (_jtboxrsfid == null) { _jtboxrsfid = nCV(); }
      return _jtboxrsfid; }
    protected ConditionValue xgetCValueJtboxrsfid() { return xdfgetJtboxrsfid(); }

    /**
     * Add order-by as ascend. <br>
     * JTBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Jtboxrsfid_Asc() { regOBA("JTBOXRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Jtboxrsfid_Desc() { regOBD("JTBOXRSFID"); return this; }

    protected ConditionValue _hdrdboxrsfid;
    public ConditionValue xdfgetHdrdboxrsfid()
    { if (_hdrdboxrsfid == null) { _hdrdboxrsfid = nCV(); }
      return _hdrdboxrsfid; }
    protected ConditionValue xgetCValueHdrdboxrsfid() { return xdfgetHdrdboxrsfid(); }

    /**
     * Add order-by as ascend. <br>
     * HDRDBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Hdrdboxrsfid_Asc() { regOBA("HDRDBOXRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDRDBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Hdrdboxrsfid_Desc() { regOBD("HDRDBOXRSFID"); return this; }

    protected ConditionValue _odrdvrsfid;
    public ConditionValue xdfgetOdrdvrsfid()
    { if (_odrdvrsfid == null) { _odrdvrsfid = nCV(); }
      return _odrdvrsfid; }
    protected ConditionValue xgetCValueOdrdvrsfid() { return xdfgetOdrdvrsfid(); }

    /**
     * Add order-by as ascend. <br>
     * ODRDVRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Odrdvrsfid_Asc() { regOBA("ODRDVRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ODRDVRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Odrdvrsfid_Desc() { regOBD("ODRDVRSFID"); return this; }

    protected ConditionValue _pkgrt;
    public ConditionValue xdfgetPkgrt()
    { if (_pkgrt == null) { _pkgrt = nCV(); }
      return _pkgrt; }
    protected ConditionValue xgetCValuePkgrt() { return xdfgetPkgrt(); }

    /**
     * Add order-by as ascend. <br>
     * PKGRT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Pkgrt_Asc() { regOBA("PKGRT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PKGRT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Pkgrt_Desc() { regOBD("PKGRT"); return this; }

    protected ConditionValue _linblk3;
    public ConditionValue xdfgetLinblk3()
    { if (_linblk3 == null) { _linblk3 = nCV(); }
      return _linblk3; }
    protected ConditionValue xgetCValueLinblk3() { return xdfgetLinblk3(); }

    /**
     * Add order-by as ascend. <br>
     * LINBLK3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Linblk3_Asc() { regOBA("LINBLK3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Linblk3_Desc() { regOBD("LINBLK3"); return this; }

    protected ConditionValue _sprprsid;
    public ConditionValue xdfgetSprprsid()
    { if (_sprprsid == null) { _sprprsid = nCV(); }
      return _sprprsid; }
    protected ConditionValue xgetCValueSprprsid() { return xdfgetSprprsid(); }

    /**
     * Add order-by as ascend. <br>
     * SPRPRSID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Sprprsid_Asc() { regOBA("SPRPRSID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRPRSID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_Sprprsid_Desc() { regOBD("SPRPRSID"); return this; }

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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsMClinCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMClinCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMClinCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMClinCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMClinCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMClinCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMClinCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMClinCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMClinCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMClinCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMClinCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMClinCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MClinCQ bq = (MClinCQ)bqs;
        MClinCQ uq = (MClinCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
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
        String nrp = xresolveNRP("M_CLIN", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MClinCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MClinCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MClinCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MClinCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MClinCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MClinCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MClinCQ> _myselfExistsMap;
    public Map<String, MClinCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MClinCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MClinCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MClinCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MClinCB.class.getName(); }
    protected String xCQ() { return MClinCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
