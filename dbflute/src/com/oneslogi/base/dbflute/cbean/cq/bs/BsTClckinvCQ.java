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
 * The base condition-query of T_CLCKINV.
 * @author DBFlute(AutoGenerator)
 */
public class BsTClckinvCQ extends AbstractBsTClckinvCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TClckinvCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTClckinvCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CLCKINV) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TClckinvCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TClckinvCIQ xcreateCIQ() {
        TClckinvCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TClckinvCIQ xnewCIQ() {
        return new TClckinvCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CLCKINV on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TClckinvCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TClckinvCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _clckinvId;
    public ConditionValue xdfgetClckinvId()
    { if (_clckinvId == null) { _clckinvId = nCV(); }
      return _clckinvId; }
    protected ConditionValue xgetCValueClckinvId() { return xdfgetClckinvId(); }

    /**
     * Add order-by as ascend. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_ClckinvId_Asc() { regOBA("CLCKINV_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_ClckinvId_Desc() { regOBD("CLCKINV_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTClckinvCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _presrcbqa;
    public ConditionValue xdfgetPresrcbqa()
    { if (_presrcbqa == null) { _presrcbqa = nCV(); }
      return _presrcbqa; }
    protected ConditionValue xgetCValuePresrcbqa() { return xdfgetPresrcbqa(); }

    /**
     * Add order-by as ascend. <br>
     * PRESRCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Presrcbqa_Asc() { regOBA("PRESRCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRESRCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Presrcbqa_Desc() { regOBD("PRESRCBQA"); return this; }

    protected ConditionValue _presrctqa;
    public ConditionValue xdfgetPresrctqa()
    { if (_presrctqa == null) { _presrctqa = nCV(); }
      return _presrctqa; }
    protected ConditionValue xgetCValuePresrctqa() { return xdfgetPresrctqa(); }

    /**
     * Add order-by as ascend. <br>
     * PRESRCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Presrctqa_Asc() { regOBA("PRESRCTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRESRCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Presrctqa_Desc() { regOBD("PRESRCTQA"); return this; }

    protected ConditionValue _lckcbivq;
    public ConditionValue xdfgetLckcbivq()
    { if (_lckcbivq == null) { _lckcbivq = nCV(); }
      return _lckcbivq; }
    protected ConditionValue xgetCValueLckcbivq() { return xdfgetLckcbivq(); }

    /**
     * Add order-by as ascend. <br>
     * LCKCBIVQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Lckcbivq_Asc() { regOBA("LCKCBIVQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * LCKCBIVQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Lckcbivq_Desc() { regOBD("LCKCBIVQ"); return this; }

    protected ConditionValue _lckctivq;
    public ConditionValue xdfgetLckctivq()
    { if (_lckctivq == null) { _lckctivq = nCV(); }
      return _lckctivq; }
    protected ConditionValue xgetCValueLckctivq() { return xdfgetLckctivq(); }

    /**
     * Add order-by as ascend. <br>
     * LCKCTIVQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Lckctivq_Asc() { regOBA("LCKCTIVQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * LCKCTIVQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Lckctivq_Desc() { regOBD("LCKCTIVQ"); return this; }

    protected ConditionValue _dscbqa;
    public ConditionValue xdfgetDscbqa()
    { if (_dscbqa == null) { _dscbqa = nCV(); }
      return _dscbqa; }
    protected ConditionValue xgetCValueDscbqa() { return xdfgetDscbqa(); }

    /**
     * Add order-by as ascend. <br>
     * DSCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Dscbqa_Asc() { regOBA("DSCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Dscbqa_Desc() { regOBD("DSCBQA"); return this; }

    protected ConditionValue _dsctqa;
    public ConditionValue xdfgetDsctqa()
    { if (_dsctqa == null) { _dsctqa = nCV(); }
      return _dsctqa; }
    protected ConditionValue xgetCValueDsctqa() { return xdfgetDsctqa(); }

    /**
     * Add order-by as ascend. <br>
     * DSCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Dsctqa_Asc() { regOBA("DSCTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Dsctqa_Desc() { regOBD("DSCTQA"); return this; }

    protected ConditionValue _tosplcbqa;
    public ConditionValue xdfgetTosplcbqa()
    { if (_tosplcbqa == null) { _tosplcbqa = nCV(); }
      return _tosplcbqa; }
    protected ConditionValue xgetCValueTosplcbqa() { return xdfgetTosplcbqa(); }

    /**
     * Add order-by as ascend. <br>
     * TOSPLCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tosplcbqa_Asc() { regOBA("TOSPLCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOSPLCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tosplcbqa_Desc() { regOBD("TOSPLCBQA"); return this; }

    protected ConditionValue _tosplctqa;
    public ConditionValue xdfgetTosplctqa()
    { if (_tosplctqa == null) { _tosplctqa = nCV(); }
      return _tosplctqa; }
    protected ConditionValue xgetCValueTosplctqa() { return xdfgetTosplctqa(); }

    /**
     * Add order-by as ascend. <br>
     * TOSPLCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tosplctqa_Asc() { regOBA("TOSPLCTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOSPLCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tosplctqa_Desc() { regOBD("TOSPLCTQA"); return this; }

    protected ConditionValue _presplcbqa;
    public ConditionValue xdfgetPresplcbqa()
    { if (_presplcbqa == null) { _presplcbqa = nCV(); }
      return _presplcbqa; }
    protected ConditionValue xgetCValuePresplcbqa() { return xdfgetPresplcbqa(); }

    /**
     * Add order-by as ascend. <br>
     * PRESPLCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Presplcbqa_Asc() { regOBA("PRESPLCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRESPLCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Presplcbqa_Desc() { regOBD("PRESPLCBQA"); return this; }

    protected ConditionValue _presplctqa;
    public ConditionValue xdfgetPresplctqa()
    { if (_presplctqa == null) { _presplctqa = nCV(); }
      return _presplctqa; }
    protected ConditionValue xgetCValuePresplctqa() { return xdfgetPresplctqa(); }

    /**
     * Add order-by as ascend. <br>
     * PRESPLCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Presplctqa_Asc() { regOBA("PRESPLCTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRESPLCTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Presplctqa_Desc() { regOBD("PRESPLCTQA"); return this; }

    protected ConditionValue _tstinvcb;
    public ConditionValue xdfgetTstinvcb()
    { if (_tstinvcb == null) { _tstinvcb = nCV(); }
      return _tstinvcb; }
    protected ConditionValue xgetCValueTstinvcb() { return xdfgetTstinvcb(); }

    /**
     * Add order-by as ascend. <br>
     * TSTINVCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tstinvcb_Asc() { regOBA("TSTINVCB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSTINVCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tstinvcb_Desc() { regOBD("TSTINVCB"); return this; }

    protected ConditionValue _tstinvct;
    public ConditionValue xdfgetTstinvct()
    { if (_tstinvct == null) { _tstinvct = nCV(); }
      return _tstinvct; }
    protected ConditionValue xgetCValueTstinvct() { return xdfgetTstinvct(); }

    /**
     * Add order-by as ascend. <br>
     * TSTINVCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tstinvct_Asc() { regOBA("TSTINVCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSTINVCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tstinvct_Desc() { regOBD("TSTINVCT"); return this; }

    protected ConditionValue _tsplcb;
    public ConditionValue xdfgetTsplcb()
    { if (_tsplcb == null) { _tsplcb = nCV(); }
      return _tsplcb; }
    protected ConditionValue xgetCValueTsplcb() { return xdfgetTsplcb(); }

    /**
     * Add order-by as ascend. <br>
     * TSPLCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tsplcb_Asc() { regOBA("TSPLCB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSPLCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tsplcb_Desc() { regOBD("TSPLCB"); return this; }

    protected ConditionValue _tsplct;
    public ConditionValue xdfgetTsplct()
    { if (_tsplct == null) { _tsplct = nCV(); }
      return _tsplct; }
    protected ConditionValue xgetCValueTsplct() { return xdfgetTsplct(); }

    /**
     * Add order-by as ascend. <br>
     * TSPLCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tsplct_Asc() { regOBA("TSPLCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSPLCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tsplct_Desc() { regOBD("TSPLCT"); return this; }

    protected ConditionValue _tpresplcb;
    public ConditionValue xdfgetTpresplcb()
    { if (_tpresplcb == null) { _tpresplcb = nCV(); }
      return _tpresplcb; }
    protected ConditionValue xgetCValueTpresplcb() { return xdfgetTpresplcb(); }

    /**
     * Add order-by as ascend. <br>
     * TPRESPLCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tpresplcb_Asc() { regOBA("TPRESPLCB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TPRESPLCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tpresplcb_Desc() { regOBD("TPRESPLCB"); return this; }

    protected ConditionValue _tpresplct;
    public ConditionValue xdfgetTpresplct()
    { if (_tpresplct == null) { _tpresplct = nCV(); }
      return _tpresplct; }
    protected ConditionValue xgetCValueTpresplct() { return xdfgetTpresplct(); }

    /**
     * Add order-by as ascend. <br>
     * TPRESPLCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tpresplct_Asc() { regOBA("TPRESPLCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TPRESPLCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tpresplct_Desc() { regOBD("TPRESPLCT"); return this; }

    protected ConditionValue _tinvmdtcb;
    public ConditionValue xdfgetTinvmdtcb()
    { if (_tinvmdtcb == null) { _tinvmdtcb = nCV(); }
      return _tinvmdtcb; }
    protected ConditionValue xgetCValueTinvmdtcb() { return xdfgetTinvmdtcb(); }

    /**
     * Add order-by as ascend. <br>
     * TINVMDTCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tinvmdtcb_Asc() { regOBA("TINVMDTCB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TINVMDTCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tinvmdtcb_Desc() { regOBD("TINVMDTCB"); return this; }

    protected ConditionValue _tinvmdtct;
    public ConditionValue xdfgetTinvmdtct()
    { if (_tinvmdtct == null) { _tinvmdtct = nCV(); }
      return _tinvmdtct; }
    protected ConditionValue xgetCValueTinvmdtct() { return xdfgetTinvmdtct(); }

    /**
     * Add order-by as ascend. <br>
     * TINVMDTCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tinvmdtct_Asc() { regOBA("TINVMDTCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TINVMDTCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Tinvmdtct_Desc() { regOBD("TINVMDTCT"); return this; }

    protected ConditionValue _csplnun;
    public ConditionValue xdfgetCsplnun()
    { if (_csplnun == null) { _csplnun = nCV(); }
      return _csplnun; }
    protected ConditionValue xgetCValueCsplnun() { return xdfgetCsplnun(); }

    /**
     * Add order-by as ascend. <br>
     * CSPLNUN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Csplnun_Asc() { regOBA("CSPLNUN"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSPLNUN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Csplnun_Desc() { regOBD("CSPLNUN"); return this; }

    protected ConditionValue _upfg;
    public ConditionValue xdfgetUpfg()
    { if (_upfg == null) { _upfg = nCV(); }
      return _upfg; }
    protected ConditionValue xgetCValueUpfg() { return xdfgetUpfg(); }

    /**
     * Add order-by as ascend. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Upfg_Asc() { regOBA("UPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_Upfg_Desc() { regOBD("UPFG"); return this; }

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
    public BsTClckinvCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTClckinvCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTClckinvCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTClckinvCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTClckinvCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTClckinvCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTClckinvCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTClckinvCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTClckinvCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTClckinvCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTClckinvCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTClckinvCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TClckinvCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TClckinvCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TClckinvCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TClckinvCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TClckinvCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TClckinvCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TClckinvCQ> _myselfExistsMap;
    public Map<String, TClckinvCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TClckinvCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TClckinvCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TClckinvCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TClckinvCB.class.getName(); }
    protected String xCQ() { return TClckinvCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
