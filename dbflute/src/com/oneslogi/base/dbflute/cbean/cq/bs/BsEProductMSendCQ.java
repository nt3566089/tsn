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
 * The base condition-query of E_PRODUCT_M_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsEProductMSendCQ extends AbstractBsEProductMSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EProductMSendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEProductMSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_PRODUCT_M_SEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EProductMSendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EProductMSendCIQ xcreateCIQ() {
        EProductMSendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EProductMSendCIQ xnewCIQ() {
        return new EProductMSendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_PRODUCT_M_SEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EProductMSendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EProductMSendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productMSendId;
    public ConditionValue xdfgetProductMSendId()
    { if (_productMSendId == null) { _productMSendId = nCV(); }
      return _productMSendId; }
    protected ConditionValue xgetCValueProductMSendId() { return xdfgetProductMSendId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_ProductMSendId_Asc() { regOBA("PRODUCT_M_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_ProductMSendId_Desc() { regOBD("PRODUCT_M_SEND_ID"); return this; }

    protected ConditionValue _companyCd;
    public ConditionValue xdfgetCompanyCd()
    { if (_companyCd == null) { _companyCd = nCV(); }
      return _companyCd; }
    protected ConditionValue xgetCValueCompanyCd() { return xdfgetCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_CompanyCd_Asc() { regOBA("COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_CompanyCd_Desc() { regOBD("COMPANY_CD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _brfnfl;
    public ConditionValue xdfgetBrfnfl()
    { if (_brfnfl == null) { _brfnfl = nCV(); }
      return _brfnfl; }
    protected ConditionValue xgetCValueBrfnfl() { return xdfgetBrfnfl(); }

    /**
     * Add order-by as ascend. <br>
     * BRFNFL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Brfnfl_Asc() { regOBA("BRFNFL"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRFNFL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Brfnfl_Desc() { regOBD("BRFNFL"); return this; }

    protected ConditionValue _brfnhf;
    public ConditionValue xdfgetBrfnhf()
    { if (_brfnhf == null) { _brfnhf = nCV(); }
      return _brfnhf; }
    protected ConditionValue xgetCValueBrfnhf() { return xdfgetBrfnhf(); }

    /**
     * Add order-by as ascend. <br>
     * BRFNHF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Brfnhf_Asc() { regOBA("BRFNHF"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRFNHF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Brfnhf_Desc() { regOBD("BRFNHF"); return this; }

    protected ConditionValue _branfl;
    public ConditionValue xdfgetBranfl()
    { if (_branfl == null) { _branfl = nCV(); }
      return _branfl; }
    protected ConditionValue xgetCValueBranfl() { return xdfgetBranfl(); }

    /**
     * Add order-by as ascend. <br>
     * BRANFL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Branfl_Asc() { regOBA("BRANFL"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRANFL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Branfl_Desc() { regOBD("BRANFL"); return this; }

    protected ConditionValue _branhf;
    public ConditionValue xdfgetBranhf()
    { if (_branhf == null) { _branhf = nCV(); }
      return _branhf; }
    protected ConditionValue xgetCValueBranhf() { return xdfgetBranhf(); }

    /**
     * Add order-by as ascend. <br>
     * BRANHF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Branhf_Asc() { regOBA("BRANHF"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRANHF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Branhf_Desc() { regOBD("BRANHF"); return this; }

    protected ConditionValue _ioidCls;
    public ConditionValue xdfgetIoidCls()
    { if (_ioidCls == null) { _ioidCls = nCV(); }
      return _ioidCls; }
    protected ConditionValue xgetCValueIoidCls() { return xdfgetIoidCls(); }

    /**
     * Add order-by as ascend. <br>
     * IOID_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_IoidCls_Asc() { regOBA("IOID_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * IOID_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_IoidCls_Desc() { regOBD("IOID_CLS"); return this; }

    protected ConditionValue _otrnk;
    public ConditionValue xdfgetOtrnk()
    { if (_otrnk == null) { _otrnk = nCV(); }
      return _otrnk; }
    protected ConditionValue xgetCValueOtrnk() { return xdfgetOtrnk(); }

    /**
     * Add order-by as ascend. <br>
     * OTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Otrnk_Asc() { regOBA("OTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Otrnk_Desc() { regOBD("OTRNK"); return this; }

    protected ConditionValue _brctg;
    public ConditionValue xdfgetBrctg()
    { if (_brctg == null) { _brctg = nCV(); }
      return _brctg; }
    protected ConditionValue xgetCValueBrctg() { return xdfgetBrctg(); }

    /**
     * Add order-by as ascend. <br>
     * BRCTG: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Brctg_Asc() { regOBA("BRCTG"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRCTG: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Brctg_Desc() { regOBD("BRCTG"); return this; }

    protected ConditionValue _numct;
    public ConditionValue xdfgetNumct()
    { if (_numct == null) { _numct = nCV(); }
      return _numct; }
    protected ConditionValue xgetCValueNumct() { return xdfgetNumct(); }

    /**
     * Add order-by as ascend. <br>
     * NUMCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Numct_Asc() { regOBA("NUMCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Numct_Desc() { regOBD("NUMCT"); return this; }

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
    public BsEProductMSendCQ addOrderBy_Ctnum_Asc() { regOBA("CTNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctnum_Desc() { regOBD("CTNUM"); return this; }

    protected ConditionValue _cbct;
    public ConditionValue xdfgetCbct()
    { if (_cbct == null) { _cbct = nCV(); }
      return _cbct; }
    protected ConditionValue xgetCValueCbct() { return xdfgetCbct(); }

    /**
     * Add order-by as ascend. <br>
     * CBCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Cbct_Asc() { regOBA("CBCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Cbct_Desc() { regOBD("CBCT"); return this; }

    protected ConditionValue _patcbqa;
    public ConditionValue xdfgetPatcbqa()
    { if (_patcbqa == null) { _patcbqa = nCV(); }
      return _patcbqa; }
    protected ConditionValue xgetCValuePatcbqa() { return xdfgetPatcbqa(); }

    /**
     * Add order-by as ascend. <br>
     * PATCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Patcbqa_Asc() { regOBA("PATCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * PATCBQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Patcbqa_Desc() { regOBD("PATCBQA"); return this; }

    protected ConditionValue _ctbcdid;
    public ConditionValue xdfgetCtbcdid()
    { if (_ctbcdid == null) { _ctbcdid = nCV(); }
      return _ctbcdid; }
    protected ConditionValue xgetCValueCtbcdid() { return xdfgetCtbcdid(); }

    /**
     * Add order-by as ascend. <br>
     * CTBCDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctbcdid_Asc() { regOBA("CTBCDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTBCDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctbcdid_Desc() { regOBD("CTBCDID"); return this; }

    protected ConditionValue _ctbcd;
    public ConditionValue xdfgetCtbcd()
    { if (_ctbcd == null) { _ctbcd = nCV(); }
      return _ctbcd; }
    protected ConditionValue xgetCValueCtbcd() { return xdfgetCtbcd(); }

    /**
     * Add order-by as ascend. <br>
     * CTBCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctbcd_Asc() { regOBA("CTBCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTBCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctbcd_Desc() { regOBD("CTBCD"); return this; }

    protected ConditionValue _cbbcdid;
    public ConditionValue xdfgetCbbcdid()
    { if (_cbbcdid == null) { _cbbcdid = nCV(); }
      return _cbbcdid; }
    protected ConditionValue xgetCValueCbbcdid() { return xdfgetCbbcdid(); }

    /**
     * Add order-by as ascend. <br>
     * CBBCDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Cbbcdid_Asc() { regOBA("CBBCDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBBCDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Cbbcdid_Desc() { regOBD("CBBCDID"); return this; }

    protected ConditionValue _cbbcd;
    public ConditionValue xdfgetCbbcd()
    { if (_cbbcd == null) { _cbbcd = nCV(); }
      return _cbbcd; }
    protected ConditionValue xgetCValueCbbcd() { return xdfgetCbbcd(); }

    /**
     * Add order-by as ascend. <br>
     * CBBCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Cbbcd_Asc() { regOBA("CBBCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBBCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Cbbcd_Desc() { regOBD("CBBCD"); return this; }

    protected ConditionValue _fwbrid;
    public ConditionValue xdfgetFwbrid()
    { if (_fwbrid == null) { _fwbrid = nCV(); }
      return _fwbrid; }
    protected ConditionValue xgetCValueFwbrid() { return xdfgetFwbrid(); }

    /**
     * Add order-by as ascend. <br>
     * FWBRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Fwbrid_Asc() { regOBA("FWBRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FWBRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Fwbrid_Desc() { regOBD("FWBRID"); return this; }

    protected ConditionValue _ctfm;
    public ConditionValue xdfgetCtfm()
    { if (_ctfm == null) { _ctfm = nCV(); }
      return _ctfm; }
    protected ConditionValue xgetCValueCtfm() { return xdfgetCtfm(); }

    /**
     * Add order-by as ascend. <br>
     * CTFM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctfm_Asc() { regOBA("CTFM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTFM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctfm_Desc() { regOBD("CTFM"); return this; }

    protected ConditionValue _ctszl;
    public ConditionValue xdfgetCtszl()
    { if (_ctszl == null) { _ctszl = nCV(); }
      return _ctszl; }
    protected ConditionValue xgetCValueCtszl() { return xdfgetCtszl(); }

    /**
     * Add order-by as ascend. <br>
     * CTSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctszl_Asc() { regOBA("CTSZL"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctszl_Desc() { regOBD("CTSZL"); return this; }

    protected ConditionValue _ctszw;
    public ConditionValue xdfgetCtszw()
    { if (_ctszw == null) { _ctszw = nCV(); }
      return _ctszw; }
    protected ConditionValue xgetCValueCtszw() { return xdfgetCtszw(); }

    /**
     * Add order-by as ascend. <br>
     * CTSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctszw_Asc() { regOBA("CTSZW"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctszw_Desc() { regOBD("CTSZW"); return this; }

    protected ConditionValue _ctszh;
    public ConditionValue xdfgetCtszh()
    { if (_ctszh == null) { _ctszh = nCV(); }
      return _ctszh; }
    protected ConditionValue xgetCValueCtszh() { return xdfgetCtszh(); }

    /**
     * Add order-by as ascend. <br>
     * CTSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctszh_Asc() { regOBA("CTSZH"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctszh_Desc() { regOBD("CTSZH"); return this; }

    protected ConditionValue _ctcc;
    public ConditionValue xdfgetCtcc()
    { if (_ctcc == null) { _ctcc = nCV(); }
      return _ctcc; }
    protected ConditionValue xgetCValueCtcc() { return xdfgetCtcc(); }

    /**
     * Add order-by as ascend. <br>
     * CTCC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctcc_Asc() { regOBA("CTCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTCC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctcc_Desc() { regOBD("CTCC"); return this; }

    protected ConditionValue _ctweight;
    public ConditionValue xdfgetCtweight()
    { if (_ctweight == null) { _ctweight = nCV(); }
      return _ctweight; }
    protected ConditionValue xgetCValueCtweight() { return xdfgetCtweight(); }

    /**
     * Add order-by as ascend. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctweight_Asc() { regOBA("CTWEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Ctweight_Desc() { regOBD("CTWEIGHT"); return this; }

    protected ConditionValue _zzfrdateh;
    public ConditionValue xdfgetZzfrdateh()
    { if (_zzfrdateh == null) { _zzfrdateh = nCV(); }
      return _zzfrdateh; }
    protected ConditionValue xgetCValueZzfrdateh() { return xdfgetZzfrdateh(); }

    /**
     * Add order-by as ascend. <br>
     * ZZFRDATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Zzfrdateh_Asc() { regOBA("ZZFRDATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZFRDATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Zzfrdateh_Desc() { regOBD("ZZFRDATEH"); return this; }

    protected ConditionValue _zztodateh;
    public ConditionValue xdfgetZztodateh()
    { if (_zztodateh == null) { _zztodateh = nCV(); }
      return _zztodateh; }
    protected ConditionValue xgetCValueZztodateh() { return xdfgetZztodateh(); }

    /**
     * Add order-by as ascend. <br>
     * ZZTODATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Zztodateh_Asc() { regOBA("ZZTODATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZTODATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_Zztodateh_Desc() { regOBD("ZZTODATEH"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

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
    public BsEProductMSendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEProductMSendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEProductMSendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEProductMSendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEProductMSendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEProductMSendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEProductMSendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEProductMSendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEProductMSendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductMSendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEProductMSendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEProductMSendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EProductMSendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EProductMSendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EProductMSendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EProductMSendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EProductMSendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EProductMSendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EProductMSendCQ> _myselfExistsMap;
    public Map<String, EProductMSendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EProductMSendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EProductMSendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EProductMSendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EProductMSendCB.class.getName(); }
    protected String xCQ() { return EProductMSendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
