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
 * The base condition-query of T_CDRCAUINF.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCdrcauinfCQ extends AbstractBsTCdrcauinfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCdrcauinfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCdrcauinfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CDRCAUINF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCdrcauinfCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCdrcauinfCIQ xcreateCIQ() {
        TCdrcauinfCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCdrcauinfCIQ xnewCIQ() {
        return new TCdrcauinfCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CDRCAUINF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCdrcauinfCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCdrcauinfCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _houmenTotalInfoId;
    public ConditionValue xdfgetHoumenTotalInfoId()
    { if (_houmenTotalInfoId == null) { _houmenTotalInfoId = nCV(); }
      return _houmenTotalInfoId; }
    protected ConditionValue xgetCValueHoumenTotalInfoId() { return xdfgetHoumenTotalInfoId(); }

    /**
     * Add order-by as ascend. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_HoumenTotalInfoId_Asc() { regOBA("HOUMEN_TOTAL_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_HoumenTotalInfoId_Desc() { regOBD("HOUMEN_TOTAL_INFO_ID"); return this; }

    protected ConditionValue _zzorgncd;
    public ConditionValue xdfgetZzorgncd()
    { if (_zzorgncd == null) { _zzorgncd = nCV(); }
      return _zzorgncd; }
    protected ConditionValue xgetCValueZzorgncd() { return xdfgetZzorgncd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

    protected ConditionValue _sroprtymd;
    public ConditionValue xdfgetSroprtymd()
    { if (_sroprtymd == null) { _sroprtymd = nCV(); }
      return _sroprtymd; }
    protected ConditionValue xgetCValueSroprtymd() { return xdfgetSroprtymd(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Sroprtymd_Asc() { regOBA("SROPRTYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Sroprtymd_Desc() { regOBD("SROPRTYMD"); return this; }

    protected ConditionValue _sroprtcnt;
    public ConditionValue xdfgetSroprtcnt()
    { if (_sroprtcnt == null) { _sroprtcnt = nCV(); }
      return _sroprtcnt; }
    protected ConditionValue xgetCValueSroprtcnt() { return xdfgetSroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _dlvymd;
    public ConditionValue xdfgetDlvymd()
    { if (_dlvymd == null) { _dlvymd = nCV(); }
      return _dlvymd; }
    protected ConditionValue xgetCValueDlvymd() { return xdfgetDlvymd(); }

    /**
     * Add order-by as ascend. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

    protected ConditionValue _dpcd;
    public ConditionValue xdfgetDpcd()
    { if (_dpcd == null) { _dpcd = nCV(); }
      return _dpcd; }
    protected ConditionValue xgetCValueDpcd() { return xdfgetDpcd(); }

    /**
     * Add order-by as ascend. <br>
     * DPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

    protected ConditionValue _zzpstnid;
    public ConditionValue xdfgetZzpstnid()
    { if (_zzpstnid == null) { _zzpstnid = nCV(); }
      return _zzpstnid; }
    protected ConditionValue xgetCValueZzpstnid() { return xdfgetZzpstnid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zzpstnid_Asc() { regOBA("ZZPSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zzpstnid_Desc() { regOBD("ZZPSTNID"); return this; }

    protected ConditionValue _ded;
    public ConditionValue xdfgetDed()
    { if (_ded == null) { _ded = nCV(); }
      return _ded; }
    protected ConditionValue xgetCValueDed() { return xdfgetDed(); }

    /**
     * Add order-by as ascend. <br>
     * DED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

    protected ConditionValue _zzmatnr;
    public ConditionValue xdfgetZzmatnr()
    { if (_zzmatnr == null) { _zzmatnr = nCV(); }
      return _zzmatnr; }
    protected ConditionValue xgetCValueZzmatnr() { return xdfgetZzmatnr(); }

    /**
     * Add order-by as ascend. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zzmatnr_Asc() { regOBA("ZZMATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zzmatnr_Desc() { regOBD("ZZMATNR"); return this; }

    protected ConditionValue _cbqa;
    public ConditionValue xdfgetCbqa()
    { if (_cbqa == null) { _cbqa = nCV(); }
      return _cbqa; }
    protected ConditionValue xgetCValueCbqa() { return xdfgetCbqa(); }

    /**
     * Add order-by as ascend. <br>
     * CBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Cbqa_Asc() { regOBA("CBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Cbqa_Desc() { regOBD("CBQA"); return this; }

    protected ConditionValue _ctnum;
    public ConditionValue xdfgetCtnum()
    { if (_ctnum == null) { _ctnum = nCV(); }
      return _ctnum; }
    protected ConditionValue xgetCValueCtnum() { return xdfgetCtnum(); }

    /**
     * Add order-by as ascend. <br>
     * CTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Ctnum_Asc() { regOBA("CTNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Ctnum_Desc() { regOBD("CTNUM"); return this; }

    protected ConditionValue _zqacp;
    public ConditionValue xdfgetZqacp()
    { if (_zqacp == null) { _zqacp = nCV(); }
      return _zqacp; }
    protected ConditionValue xgetCValueZqacp() { return xdfgetZqacp(); }

    /**
     * Add order-by as ascend. <br>
     * ZQACP: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zqacp_Asc() { regOBA("ZQACP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZQACP: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zqacp_Desc() { regOBD("ZQACP"); return this; }

    protected ConditionValue _zqactqa;
    public ConditionValue xdfgetZqactqa()
    { if (_zqactqa == null) { _zqactqa = nCV(); }
      return _zqactqa; }
    protected ConditionValue xgetCValueZqactqa() { return xdfgetZqactqa(); }

    /**
     * Add order-by as ascend. <br>
     * ZQACTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zqactqa_Asc() { regOBA("ZQACTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZQACTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Zqactqa_Desc() { regOBD("ZQACTQA"); return this; }

    protected ConditionValue _ssqa;
    public ConditionValue xdfgetSsqa()
    { if (_ssqa == null) { _ssqa = nCV(); }
      return _ssqa; }
    protected ConditionValue xgetCValueSsqa() { return xdfgetSsqa(); }

    /**
     * Add order-by as ascend. <br>
     * SSQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Ssqa_Asc() { regOBA("SSQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Ssqa_Desc() { regOBD("SSQA"); return this; }

    protected ConditionValue _srrnk;
    public ConditionValue xdfgetSrrnk()
    { if (_srrnk == null) { _srrnk = nCV(); }
      return _srrnk; }
    protected ConditionValue xgetCValueSrrnk() { return xdfgetSrrnk(); }

    /**
     * Add order-by as ascend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCdrcauinfCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCdrcauinfCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCdrcauinfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCdrcauinfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TCdrcauinfCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCdrcauinfCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCdrcauinfCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCdrcauinfCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCdrcauinfCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCdrcauinfCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCdrcauinfCQ> _myselfExistsMap;
    public Map<String, TCdrcauinfCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCdrcauinfCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCdrcauinfCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCdrcauinfCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCdrcauinfCB.class.getName(); }
    protected String xCQ() { return TCdrcauinfCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
