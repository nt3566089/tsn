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
 * The base condition-query of T_SPLINFO.
 * @author DBFlute(AutoGenerator)
 */
public class BsTSplinfoCQ extends AbstractBsTSplinfoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSplinfoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSplinfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_SPLINFO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TSplinfoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TSplinfoCIQ xcreateCIQ() {
        TSplinfoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TSplinfoCIQ xnewCIQ() {
        return new TSplinfoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_SPLINFO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TSplinfoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TSplinfoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _splinfoId;
    public ConditionValue xdfgetSplinfoId()
    { if (_splinfoId == null) { _splinfoId = nCV(); }
      return _splinfoId; }
    protected ConditionValue xgetCValueSplinfoId() { return xdfgetSplinfoId(); }

    /**
     * Add order-by as ascend. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_SplinfoId_Asc() { regOBA("SPLINFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_SplinfoId_Desc() { regOBD("SPLINFO_ID"); return this; }

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
    public BsTSplinfoCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _splymd;
    public ConditionValue xdfgetSplymd()
    { if (_splymd == null) { _splymd = nCV(); }
      return _splymd; }
    protected ConditionValue xgetCValueSplymd() { return xdfgetSplymd(); }

    /**
     * Add order-by as ascend. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Splymd_Asc() { regOBA("SPLYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPLYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Splymd_Desc() { regOBD("SPLYMD"); return this; }

    protected ConditionValue _upddtm;
    public ConditionValue xdfgetUpddtm()
    { if (_upddtm == null) { _upddtm = nCV(); }
      return _upddtm; }
    protected ConditionValue xgetCValueUpddtm() { return xdfgetUpddtm(); }

    /**
     * Add order-by as ascend. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Upddtm_Asc() { regOBA("UPDDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Upddtm_Desc() { regOBD("UPDDTM"); return this; }

    protected ConditionValue _csplnun;
    public ConditionValue xdfgetCsplnun()
    { if (_csplnun == null) { _csplnun = nCV(); }
      return _csplnun; }
    protected ConditionValue xgetCValueCsplnun() { return xdfgetCsplnun(); }

    /**
     * Add order-by as ascend. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Csplnun_Asc() { regOBA("CSPLNUN"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSPLNUN: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Csplnun_Desc() { regOBD("CSPLNUN"); return this; }

    protected ConditionValue _linblk;
    public ConditionValue xdfgetLinblk()
    { if (_linblk == null) { _linblk = nCV(); }
      return _linblk; }
    protected ConditionValue xgetCValueLinblk() { return xdfgetLinblk(); }

    /**
     * Add order-by as ascend. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Linblk_Asc() { regOBA("LINBLK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Linblk_Desc() { regOBD("LINBLK"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _splid;
    public ConditionValue xdfgetSplid()
    { if (_splid == null) { _splid = nCV(); }
      return _splid; }
    protected ConditionValue xgetCValueSplid() { return xdfgetSplid(); }

    /**
     * Add order-by as ascend. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Splid_Asc() { regOBA("SPLID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Splid_Desc() { regOBD("SPLID"); return this; }

    protected ConditionValue _dpcd;
    public ConditionValue xdfgetDpcd()
    { if (_dpcd == null) { _dpcd = nCV(); }
      return _dpcd; }
    protected ConditionValue xgetCValueDpcd() { return xdfgetDpcd(); }

    /**
     * Add order-by as ascend. <br>
     * DPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

    protected ConditionValue _ded;
    public ConditionValue xdfgetDed()
    { if (_ded == null) { _ded = nCV(); }
      return _ded; }
    protected ConditionValue xgetCValueDed() { return xdfgetDed(); }

    /**
     * Add order-by as ascend. <br>
     * DED: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

    protected ConditionValue _locKbn;
    public ConditionValue xdfgetLocKbn()
    { if (_locKbn == null) { _locKbn = nCV(); }
      return _locKbn; }
    protected ConditionValue xgetCValueLocKbn() { return xdfgetLocKbn(); }

    /**
     * Add order-by as ascend. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_LocKbn_Asc() { regOBA("LOC_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_LocKbn_Desc() { regOBD("LOC_KBN"); return this; }

    protected ConditionValue _precb;
    public ConditionValue xdfgetPrecb()
    { if (_precb == null) { _precb = nCV(); }
      return _precb; }
    protected ConditionValue xgetCValuePrecb() { return xdfgetPrecb(); }

    /**
     * Add order-by as ascend. <br>
     * PRECB: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Precb_Asc() { regOBA("PRECB"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRECB: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Precb_Desc() { regOBD("PRECB"); return this; }

    protected ConditionValue _prect;
    public ConditionValue xdfgetPrect()
    { if (_prect == null) { _prect = nCV(); }
      return _prect; }
    protected ConditionValue xgetCValuePrect() { return xdfgetPrect(); }

    /**
     * Add order-by as ascend. <br>
     * PRECT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Prect_Asc() { regOBA("PRECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRECT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Prect_Desc() { regOBD("PRECT"); return this; }

    protected ConditionValue _calcb;
    public ConditionValue xdfgetCalcb()
    { if (_calcb == null) { _calcb = nCV(); }
      return _calcb; }
    protected ConditionValue xgetCValueCalcb() { return xdfgetCalcb(); }

    /**
     * Add order-by as ascend. <br>
     * CALCB: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Calcb_Asc() { regOBA("CALCB"); return this; }

    /**
     * Add order-by as descend. <br>
     * CALCB: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Calcb_Desc() { regOBD("CALCB"); return this; }

    protected ConditionValue _calct;
    public ConditionValue xdfgetCalct()
    { if (_calct == null) { _calct = nCV(); }
      return _calct; }
    protected ConditionValue xgetCValueCalct() { return xdfgetCalct(); }

    /**
     * Add order-by as ascend. <br>
     * CALCT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Calct_Asc() { regOBA("CALCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CALCT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Calct_Desc() { regOBD("CALCT"); return this; }

    protected ConditionValue _reqcb;
    public ConditionValue xdfgetReqcb()
    { if (_reqcb == null) { _reqcb = nCV(); }
      return _reqcb; }
    protected ConditionValue xgetCValueReqcb() { return xdfgetReqcb(); }

    /**
     * Add order-by as ascend. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Reqcb_Asc() { regOBA("REQCB"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Reqcb_Desc() { regOBD("REQCB"); return this; }

    protected ConditionValue _reqct;
    public ConditionValue xdfgetReqct()
    { if (_reqct == null) { _reqct = nCV(); }
      return _reqct; }
    protected ConditionValue xgetCValueReqct() { return xdfgetReqct(); }

    /**
     * Add order-by as ascend. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Reqct_Asc() { regOBA("REQCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Reqct_Desc() { regOBD("REQCT"); return this; }

    protected ConditionValue _status;
    public ConditionValue xdfgetStatus()
    { if (_status == null) { _status = nCV(); }
      return _status; }
    protected ConditionValue xgetCValueStatus() { return xdfgetStatus(); }

    /**
     * Add order-by as ascend. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Status_Asc() { regOBA("STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Status_Desc() { regOBD("STATUS"); return this; }

    protected ConditionValue _rescb;
    public ConditionValue xdfgetRescb()
    { if (_rescb == null) { _rescb = nCV(); }
      return _rescb; }
    protected ConditionValue xgetCValueRescb() { return xdfgetRescb(); }

    /**
     * Add order-by as ascend. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Rescb_Asc() { regOBA("RESCB"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Rescb_Desc() { regOBD("RESCB"); return this; }

    protected ConditionValue _restb;
    public ConditionValue xdfgetRestb()
    { if (_restb == null) { _restb = nCV(); }
      return _restb; }
    protected ConditionValue xgetCValueRestb() { return xdfgetRestb(); }

    /**
     * Add order-by as ascend. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Restb_Asc() { regOBA("RESTB"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Restb_Desc() { regOBD("RESTB"); return this; }

    protected ConditionValue _abstosplcbqa;
    public ConditionValue xdfgetAbstosplcbqa()
    { if (_abstosplcbqa == null) { _abstosplcbqa = nCV(); }
      return _abstosplcbqa; }
    protected ConditionValue xgetCValueAbstosplcbqa() { return xdfgetAbstosplcbqa(); }

    /**
     * Add order-by as ascend. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Abstosplcbqa_Asc() { regOBA("ABSTOSPLCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ABSTOSPLCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Abstosplcbqa_Desc() { regOBD("ABSTOSPLCBQA"); return this; }

    protected ConditionValue _abstosplctqa;
    public ConditionValue xdfgetAbstosplctqa()
    { if (_abstosplctqa == null) { _abstosplctqa = nCV(); }
      return _abstosplctqa; }
    protected ConditionValue xgetCValueAbstosplctqa() { return xdfgetAbstosplctqa(); }

    /**
     * Add order-by as ascend. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Abstosplctqa_Asc() { regOBA("ABSTOSPLCTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ABSTOSPLCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Abstosplctqa_Desc() { regOBD("ABSTOSPLCTQA"); return this; }

    protected ConditionValue _abscbqa;
    public ConditionValue xdfgetAbscbqa()
    { if (_abscbqa == null) { _abscbqa = nCV(); }
      return _abscbqa; }
    protected ConditionValue xgetCValueAbscbqa() { return xdfgetAbscbqa(); }

    /**
     * Add order-by as ascend. <br>
     * ABSCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Abscbqa_Asc() { regOBA("ABSCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ABSCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Abscbqa_Desc() { regOBD("ABSCBQA"); return this; }

    protected ConditionValue _rescbqa;
    public ConditionValue xdfgetRescbqa()
    { if (_rescbqa == null) { _rescbqa = nCV(); }
      return _rescbqa; }
    protected ConditionValue xgetCValueRescbqa() { return xdfgetRescbqa(); }

    /**
     * Add order-by as ascend. <br>
     * RESCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Rescbqa_Asc() { regOBA("RESCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Rescbqa_Desc() { regOBD("RESCBQA"); return this; }

    protected ConditionValue _lbkbn;
    public ConditionValue xdfgetLbkbn()
    { if (_lbkbn == null) { _lbkbn = nCV(); }
      return _lbkbn; }
    protected ConditionValue xgetCValueLbkbn() { return xdfgetLbkbn(); }

    /**
     * Add order-by as ascend. <br>
     * LBKBN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Lbkbn_Asc() { regOBA("LBKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBKBN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Lbkbn_Desc() { regOBD("LBKBN"); return this; }

    protected ConditionValue _prtrnk;
    public ConditionValue xdfgetPrtrnk()
    { if (_prtrnk == null) { _prtrnk = nCV(); }
      return _prtrnk; }
    protected ConditionValue xgetCValuePrtrnk() { return xdfgetPrtrnk(); }

    /**
     * Add order-by as ascend. <br>
     * PRTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Prtrnk_Asc() { regOBA("PRTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_Prtrnk_Desc() { regOBD("PRTRNK"); return this; }

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
    public BsTSplinfoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTSplinfoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTSplinfoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTSplinfoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTSplinfoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTSplinfoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTSplinfoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTSplinfoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTSplinfoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTSplinfoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTSplinfoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTSplinfoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TSplinfoCQ bq = (TSplinfoCQ)bqs;
        TSplinfoCQ uq = (TSplinfoCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
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
        String nrp = xresolveNRP("T_SPLINFO", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_SPLINFO", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TSplinfoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TSplinfoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TSplinfoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TSplinfoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TSplinfoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TSplinfoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TSplinfoCQ> _myselfExistsMap;
    public Map<String, TSplinfoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TSplinfoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TSplinfoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TSplinfoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TSplinfoCB.class.getName(); }
    protected String xCQ() { return TSplinfoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
