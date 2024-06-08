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
 * The base condition-query of M_TSN_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsMTsnProductCQ extends AbstractBsMTsnProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MTsnProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMTsnProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_TSN_PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MTsnProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MTsnProductCIQ xcreateCIQ() {
        MTsnProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MTsnProductCIQ xnewCIQ() {
        return new MTsnProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_TSN_PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MTsnProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MTsnProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tsnProductId;
    public ConditionValue xdfgetTsnProductId()
    { if (_tsnProductId == null) { _tsnProductId = nCV(); }
      return _tsnProductId; }
    protected ConditionValue xgetCValueTsnProductId() { return xdfgetTsnProductId(); }

    /**
     * Add order-by as ascend. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_TsnProductId_Asc() { regOBA("TSN_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_TsnProductId_Desc() { regOBD("TSN_PRODUCT_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _zzmatnr;
    public ConditionValue xdfgetZzmatnr()
    { if (_zzmatnr == null) { _zzmatnr = nCV(); }
      return _zzmatnr; }
    protected ConditionValue xgetCValueZzmatnr() { return xdfgetZzmatnr(); }

    /**
     * Add order-by as ascend. <br>
     * ZZMATNR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzmatnr_Asc() { regOBA("ZZMATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzmatnr_Desc() { regOBD("ZZMATNR"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Brfnfl_Asc() { regOBA("BRFNFL"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRFNFL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brfnfl_Desc() { regOBD("BRFNFL"); return this; }

    protected ConditionValue _brfnhf;
    public ConditionValue xdfgetBrfnhf()
    { if (_brfnhf == null) { _brfnhf = nCV(); }
      return _brfnhf; }
    protected ConditionValue xgetCValueBrfnhf() { return xdfgetBrfnhf(); }

    /**
     * Add order-by as ascend. <br>
     * BRFNHF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brfnhf_Asc() { regOBA("BRFNHF"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRFNHF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brfnhf_Desc() { regOBD("BRFNHF"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Branfl_Asc() { regOBA("BRANFL"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRANFL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Branfl_Desc() { regOBD("BRANFL"); return this; }

    protected ConditionValue _branhf;
    public ConditionValue xdfgetBranhf()
    { if (_branhf == null) { _branhf = nCV(); }
      return _branhf; }
    protected ConditionValue xgetCValueBranhf() { return xdfgetBranhf(); }

    /**
     * Add order-by as ascend. <br>
     * BRANHF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Branhf_Asc() { regOBA("BRANHF"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRANHF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Branhf_Desc() { regOBD("BRANHF"); return this; }

    protected ConditionValue _sobrfnfl;
    public ConditionValue xdfgetSobrfnfl()
    { if (_sobrfnfl == null) { _sobrfnfl = nCV(); }
      return _sobrfnfl; }
    protected ConditionValue xgetCValueSobrfnfl() { return xdfgetSobrfnfl(); }

    /**
     * Add order-by as ascend. <br>
     * SOBRFNFL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sobrfnfl_Asc() { regOBA("SOBRFNFL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOBRFNFL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sobrfnfl_Desc() { regOBD("SOBRFNFL"); return this; }

    protected ConditionValue _sobrfnhf;
    public ConditionValue xdfgetSobrfnhf()
    { if (_sobrfnhf == null) { _sobrfnhf = nCV(); }
      return _sobrfnhf; }
    protected ConditionValue xgetCValueSobrfnhf() { return xdfgetSobrfnhf(); }

    /**
     * Add order-by as ascend. <br>
     * SOBRFNHF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sobrfnhf_Asc() { regOBA("SOBRFNHF"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOBRFNHF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sobrfnhf_Desc() { regOBD("SOBRFNHF"); return this; }

    protected ConditionValue _brkname;
    public ConditionValue xdfgetBrkname()
    { if (_brkname == null) { _brkname = nCV(); }
      return _brkname; }
    protected ConditionValue xgetCValueBrkname() { return xdfgetBrkname(); }

    /**
     * Add order-by as ascend. <br>
     * BRKNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brkname_Asc() { regOBA("BRKNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRKNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brkname_Desc() { regOBD("BRKNAME"); return this; }

    protected ConditionValue _cggdid;
    public ConditionValue xdfgetCggdid()
    { if (_cggdid == null) { _cggdid = nCV(); }
      return _cggdid; }
    protected ConditionValue xgetCValueCggdid() { return xdfgetCggdid(); }

    /**
     * Add order-by as ascend. <br>
     * CGGDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cggdid_Asc() { regOBA("CGGDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CGGDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cggdid_Desc() { regOBD("CGGDID"); return this; }

    protected ConditionValue _zzdevcid;
    public ConditionValue xdfgetZzdevcid()
    { if (_zzdevcid == null) { _zzdevcid = nCV(); }
      return _zzdevcid; }
    protected ConditionValue xgetCValueZzdevcid() { return xdfgetZzdevcid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZDEVCID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzdevcid_Asc() { regOBA("ZZDEVCID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZDEVCID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzdevcid_Desc() { regOBD("ZZDEVCID"); return this; }

    protected ConditionValue _usid;
    public ConditionValue xdfgetUsid()
    { if (_usid == null) { _usid = nCV(); }
      return _usid; }
    protected ConditionValue xgetCValueUsid() { return xdfgetUsid(); }

    /**
     * Add order-by as ascend. <br>
     * USID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Usid_Asc() { regOBA("USID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Usid_Desc() { regOBD("USID"); return this; }

    protected ConditionValue _cgrid;
    public ConditionValue xdfgetCgrid()
    { if (_cgrid == null) { _cgrid = nCV(); }
      return _cgrid; }
    protected ConditionValue xgetCValueCgrid() { return xdfgetCgrid(); }

    /**
     * Add order-by as ascend. <br>
     * CGRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cgrid_Asc() { regOBA("CGRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CGRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cgrid_Desc() { regOBD("CGRID"); return this; }

    protected ConditionValue _cbcccvce;
    public ConditionValue xdfgetCbcccvce()
    { if (_cbcccvce == null) { _cbcccvce = nCV(); }
      return _cbcccvce; }
    protected ConditionValue xgetCValueCbcccvce() { return xdfgetCbcccvce(); }

    /**
     * Add order-by as ascend. <br>
     * CBCCCVCE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbcccvce_Asc() { regOBA("CBCCCVCE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBCCCVCE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbcccvce_Desc() { regOBD("CBCCCVCE"); return this; }

    protected ConditionValue _sfcbqa;
    public ConditionValue xdfgetSfcbqa()
    { if (_sfcbqa == null) { _sfcbqa = nCV(); }
      return _sfcbqa; }
    protected ConditionValue xgetCValueSfcbqa() { return xdfgetSfcbqa(); }

    /**
     * Add order-by as ascend. <br>
     * SFCBQA: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sfcbqa_Asc() { regOBA("SFCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFCBQA: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sfcbqa_Desc() { regOBD("SFCBQA"); return this; }

    protected ConditionValue _ctnum;
    public ConditionValue xdfgetCtnum()
    { if (_ctnum == null) { _ctnum = nCV(); }
      return _ctnum; }
    protected ConditionValue xgetCValueCtnum() { return xdfgetCtnum(); }

    /**
     * Add order-by as ascend. <br>
     * CTNUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctnum_Asc() { regOBA("CTNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTNUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctnum_Desc() { regOBD("CTNUM"); return this; }

    protected ConditionValue _cbnum;
    public ConditionValue xdfgetCbnum()
    { if (_cbnum == null) { _cbnum = nCV(); }
      return _cbnum; }
    protected ConditionValue xgetCValueCbnum() { return xdfgetCbnum(); }

    /**
     * Add order-by as ascend. <br>
     * CBNUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbnum_Asc() { regOBA("CBNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBNUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbnum_Desc() { regOBD("CBNUM"); return this; }

    protected ConditionValue _patcbqa;
    public ConditionValue xdfgetPatcbqa()
    { if (_patcbqa == null) { _patcbqa = nCV(); }
      return _patcbqa; }
    protected ConditionValue xgetCValuePatcbqa() { return xdfgetPatcbqa(); }

    /**
     * Add order-by as ascend. <br>
     * PATCBQA: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Patcbqa_Asc() { regOBA("PATCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * PATCBQA: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Patcbqa_Desc() { regOBD("PATCBQA"); return this; }

    protected ConditionValue _zzseffid;
    public ConditionValue xdfgetZzseffid()
    { if (_zzseffid == null) { _zzseffid = nCV(); }
      return _zzseffid; }
    protected ConditionValue xgetCValueZzseffid() { return xdfgetZzseffid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZSEFFID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzseffid_Asc() { regOBA("ZZSEFFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZSEFFID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzseffid_Desc() { regOBD("ZZSEFFID"); return this; }

    protected ConditionValue _zzablymd;
    public ConditionValue xdfgetZzablymd()
    { if (_zzablymd == null) { _zzablymd = nCV(); }
      return _zzablymd; }
    protected ConditionValue xgetCValueZzablymd() { return xdfgetZzablymd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZABLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzablymd_Asc() { regOBA("ZZABLYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZABLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzablymd_Desc() { regOBD("ZZABLYMD"); return this; }

    protected ConditionValue _crspymd;
    public ConditionValue xdfgetCrspymd()
    { if (_crspymd == null) { _crspymd = nCV(); }
      return _crspymd; }
    protected ConditionValue xgetCValueCrspymd() { return xdfgetCrspymd(); }

    /**
     * Add order-by as ascend. <br>
     * CRSPYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Crspymd_Asc() { regOBA("CRSPYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CRSPYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Crspymd_Desc() { regOBD("CRSPYMD"); return this; }

    protected ConditionValue _seymd;
    public ConditionValue xdfgetSeymd()
    { if (_seymd == null) { _seymd = nCV(); }
      return _seymd; }
    protected ConditionValue xgetCValueSeymd() { return xdfgetSeymd(); }

    /**
     * Add order-by as ascend. <br>
     * SEYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Seymd_Asc() { regOBA("SEYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Seymd_Desc() { regOBD("SEYMD"); return this; }

    protected ConditionValue _dpbnyd;
    public ConditionValue xdfgetDpbnyd()
    { if (_dpbnyd == null) { _dpbnyd = nCV(); }
      return _dpbnyd; }
    protected ConditionValue xgetCValueDpbnyd() { return xdfgetDpbnyd(); }

    /**
     * Add order-by as ascend. <br>
     * DPBNYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Dpbnyd_Asc() { regOBA("DPBNYD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPBNYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Dpbnyd_Desc() { regOBD("DPBNYD"); return this; }

    protected ConditionValue _sobgnymd;
    public ConditionValue xdfgetSobgnymd()
    { if (_sobgnymd == null) { _sobgnymd = nCV(); }
      return _sobgnymd; }
    protected ConditionValue xgetCValueSobgnymd() { return xdfgetSobgnymd(); }

    /**
     * Add order-by as ascend. <br>
     * SOBGNYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sobgnymd_Asc() { regOBA("SOBGNYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOBGNYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sobgnymd_Desc() { regOBD("SOBGNYMD"); return this; }

    protected ConditionValue _exslymd;
    public ConditionValue xdfgetExslymd()
    { if (_exslymd == null) { _exslymd = nCV(); }
      return _exslymd; }
    protected ConditionValue xgetCValueExslymd() { return xdfgetExslymd(); }

    /**
     * Add order-by as ascend. <br>
     * EXSLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Exslymd_Asc() { regOBA("EXSLYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXSLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Exslymd_Desc() { regOBD("EXSLYMD"); return this; }

    protected ConditionValue _aubrid;
    public ConditionValue xdfgetAubrid()
    { if (_aubrid == null) { _aubrid = nCV(); }
      return _aubrid; }
    protected ConditionValue xgetCValueAubrid() { return xdfgetAubrid(); }

    /**
     * Add order-by as ascend. <br>
     * AUBRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Aubrid_Asc() { regOBA("AUBRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUBRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Aubrid_Desc() { regOBD("AUBRID"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Fwbrid_Asc() { regOBA("FWBRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FWBRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Fwbrid_Desc() { regOBD("FWBRID"); return this; }

    protected ConditionValue _brcrid;
    public ConditionValue xdfgetBrcrid()
    { if (_brcrid == null) { _brcrid = nCV(); }
      return _brcrid; }
    protected ConditionValue xgetCValueBrcrid() { return xdfgetBrcrid(); }

    /**
     * Add order-by as ascend. <br>
     * BRCRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brcrid_Asc() { regOBA("BRCRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRCRID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brcrid_Desc() { regOBD("BRCRID"); return this; }

    protected ConditionValue _pabrcd;
    public ConditionValue xdfgetPabrcd()
    { if (_pabrcd == null) { _pabrcd = nCV(); }
      return _pabrcd; }
    protected ConditionValue xgetCValuePabrcd() { return xdfgetPabrcd(); }

    /**
     * Add order-by as ascend. <br>
     * PABRCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Pabrcd_Asc() { regOBA("PABRCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PABRCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Pabrcd_Desc() { regOBD("PABRCD"); return this; }

    protected ConditionValue _aubrcd;
    public ConditionValue xdfgetAubrcd()
    { if (_aubrcd == null) { _aubrcd = nCV(); }
      return _aubrcd; }
    protected ConditionValue xgetCValueAubrcd() { return xdfgetAubrcd(); }

    /**
     * Add order-by as ascend. <br>
     * AUBRCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Aubrcd_Asc() { regOBA("AUBRCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUBRCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Aubrcd_Desc() { regOBD("AUBRCD"); return this; }

    protected ConditionValue _zzmatnra;
    public ConditionValue xdfgetZzmatnra()
    { if (_zzmatnra == null) { _zzmatnra = nCV(); }
      return _zzmatnra; }
    protected ConditionValue xgetCValueZzmatnra() { return xdfgetZzmatnra(); }

    /**
     * Add order-by as ascend. <br>
     * ZZMATNRA: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzmatnra_Asc() { regOBA("ZZMATNRA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNRA: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzmatnra_Desc() { regOBD("ZZMATNRA"); return this; }

    protected ConditionValue _mraucd;
    public ConditionValue xdfgetMraucd()
    { if (_mraucd == null) { _mraucd = nCV(); }
      return _mraucd; }
    protected ConditionValue xgetCValueMraucd() { return xdfgetMraucd(); }

    /**
     * Add order-by as ascend. <br>
     * MRAUCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Mraucd_Asc() { regOBA("MRAUCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MRAUCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Mraucd_Desc() { regOBD("MRAUCD"); return this; }

    protected ConditionValue _zzsomium;
    public ConditionValue xdfgetZzsomium()
    { if (_zzsomium == null) { _zzsomium = nCV(); }
      return _zzsomium; }
    protected ConditionValue xgetCValueZzsomium() { return xdfgetZzsomium(); }

    /**
     * Add order-by as ascend. <br>
     * ZZSOMIUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzsomium_Asc() { regOBA("ZZSOMIUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZSOMIUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzsomium_Desc() { regOBD("ZZSOMIUM"); return this; }

    protected ConditionValue _zzregprca;
    public ConditionValue xdfgetZzregprca()
    { if (_zzregprca == null) { _zzregprca = nCV(); }
      return _zzregprca; }
    protected ConditionValue xgetCValueZzregprca() { return xdfgetZzregprca(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREGPRCA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzregprca_Asc() { regOBA("ZZREGPRCA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREGPRCA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzregprca_Desc() { regOBD("ZZREGPRCA"); return this; }

    protected ConditionValue _tfpr;
    public ConditionValue xdfgetTfpr()
    { if (_tfpr == null) { _tfpr = nCV(); }
      return _tfpr; }
    protected ConditionValue xgetCValueTfpr() { return xdfgetTfpr(); }

    /**
     * Add order-by as ascend. <br>
     * TFPR: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Tfpr_Asc() { regOBA("TFPR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TFPR: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Tfpr_Desc() { regOBD("TFPR"); return this; }

    protected ConditionValue _mgrta;
    public ConditionValue xdfgetMgrta()
    { if (_mgrta == null) { _mgrta = nCV(); }
      return _mgrta; }
    protected ConditionValue xgetCValueMgrta() { return xdfgetMgrta(); }

    /**
     * Add order-by as ascend. <br>
     * MGRTA: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Mgrta_Asc() { regOBA("MGRTA"); return this; }

    /**
     * Add order-by as descend. <br>
     * MGRTA: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Mgrta_Desc() { regOBD("MGRTA"); return this; }

    protected ConditionValue _mgrtok;
    public ConditionValue xdfgetMgrtok()
    { if (_mgrtok == null) { _mgrtok = nCV(); }
      return _mgrtok; }
    protected ConditionValue xgetCValueMgrtok() { return xdfgetMgrtok(); }

    /**
     * Add order-by as ascend. <br>
     * MGRTOK: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Mgrtok_Asc() { regOBA("MGRTOK"); return this; }

    /**
     * Add order-by as descend. <br>
     * MGRTOK: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Mgrtok_Desc() { regOBD("MGRTOK"); return this; }

    protected ConditionValue _tlnpru;
    public ConditionValue xdfgetTlnpru()
    { if (_tlnpru == null) { _tlnpru = nCV(); }
      return _tlnpru; }
    protected ConditionValue xgetCValueTlnpru() { return xdfgetTlnpru(); }

    /**
     * Add order-by as ascend. <br>
     * TLNPRU: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Tlnpru_Asc() { regOBA("TLNPRU"); return this; }

    /**
     * Add order-by as descend. <br>
     * TLNPRU: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Tlnpru_Desc() { regOBD("TLNPRU"); return this; }

    protected ConditionValue _hanumwt;
    public ConditionValue xdfgetHanumwt()
    { if (_hanumwt == null) { _hanumwt = nCV(); }
      return _hanumwt; }
    protected ConditionValue xgetCValueHanumwt() { return xdfgetHanumwt(); }

    /**
     * Add order-by as ascend. <br>
     * HANUMWT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Hanumwt_Asc() { regOBA("HANUMWT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HANUMWT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Hanumwt_Desc() { regOBD("HANUMWT"); return this; }

    protected ConditionValue _cnscvct;
    public ConditionValue xdfgetCnscvct()
    { if (_cnscvct == null) { _cnscvct = nCV(); }
      return _cnscvct; }
    protected ConditionValue xgetCValueCnscvct() { return xdfgetCnscvct(); }

    /**
     * Add order-by as ascend. <br>
     * CNSCVCT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cnscvct_Asc() { regOBA("CNSCVCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CNSCVCT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cnscvct_Desc() { regOBD("CNSCVCT"); return this; }

    protected ConditionValue _cgtaxcct;
    public ConditionValue xdfgetCgtaxcct()
    { if (_cgtaxcct == null) { _cgtaxcct = nCV(); }
      return _cgtaxcct; }
    protected ConditionValue xgetCValueCgtaxcct() { return xdfgetCgtaxcct(); }

    /**
     * Add order-by as ascend. <br>
     * CGTAXCCT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cgtaxcct_Asc() { regOBA("CGTAXCCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CGTAXCCT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cgtaxcct_Desc() { regOBD("CGTAXCCT"); return this; }

    protected ConditionValue _ntxqart;
    public ConditionValue xdfgetNtxqart()
    { if (_ntxqart == null) { _ntxqart = nCV(); }
      return _ntxqart; }
    protected ConditionValue xgetCValueNtxqart() { return xdfgetNtxqart(); }

    /**
     * Add order-by as ascend. <br>
     * NTXQART: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ntxqart_Asc() { regOBA("NTXQART"); return this; }

    /**
     * Add order-by as descend. <br>
     * NTXQART: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ntxqart_Desc() { regOBD("NTXQART"); return this; }

    protected ConditionValue _ltxqart;
    public ConditionValue xdfgetLtxqart()
    { if (_ltxqart == null) { _ltxqart = nCV(); }
      return _ltxqart; }
    protected ConditionValue xgetCValueLtxqart() { return xdfgetLtxqart(); }

    /**
     * Add order-by as ascend. <br>
     * LTXQART: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ltxqart_Asc() { regOBA("LTXQART"); return this; }

    /**
     * Add order-by as descend. <br>
     * LTXQART: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ltxqart_Desc() { regOBD("LTXQART"); return this; }

    protected ConditionValue _advtaxrt;
    public ConditionValue xdfgetAdvtaxrt()
    { if (_advtaxrt == null) { _advtaxrt = nCV(); }
      return _advtaxrt; }
    protected ConditionValue xgetCValueAdvtaxrt() { return xdfgetAdvtaxrt(); }

    /**
     * Add order-by as ascend. <br>
     * ADVTAXRT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Advtaxrt_Asc() { regOBA("ADVTAXRT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADVTAXRT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Advtaxrt_Desc() { regOBD("ADVTAXRT"); return this; }

    protected ConditionValue _ctytaxrt;
    public ConditionValue xdfgetCtytaxrt()
    { if (_ctytaxrt == null) { _ctytaxrt = nCV(); }
      return _ctytaxrt; }
    protected ConditionValue xgetCValueCtytaxrt() { return xdfgetCtytaxrt(); }

    /**
     * Add order-by as ascend. <br>
     * CTYTAXRT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctytaxrt_Asc() { regOBA("CTYTAXRT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTYTAXRT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctytaxrt_Desc() { regOBD("CTYTAXRT"); return this; }

    protected ConditionValue _prfprt;
    public ConditionValue xdfgetPrfprt()
    { if (_prfprt == null) { _prfprt = nCV(); }
      return _prfprt; }
    protected ConditionValue xgetCValuePrfprt() { return xdfgetPrfprt(); }

    /**
     * Add order-by as ascend. <br>
     * PRFPRT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Prfprt_Asc() { regOBA("PRFPRT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRFPRT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Prfprt_Desc() { regOBD("PRFPRT"); return this; }

    protected ConditionValue _notax;
    public ConditionValue xdfgetNotax()
    { if (_notax == null) { _notax = nCV(); }
      return _notax; }
    protected ConditionValue xgetCValueNotax() { return xdfgetNotax(); }

    /**
     * Add order-by as ascend. <br>
     * NOTAX: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Notax_Asc() { regOBA("NOTAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTAX: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Notax_Desc() { regOBD("NOTAX"); return this; }

    protected ConditionValue _brkd;
    public ConditionValue xdfgetBrkd()
    { if (_brkd == null) { _brkd = nCV(); }
      return _brkd; }
    protected ConditionValue xgetCValueBrkd() { return xdfgetBrkd(); }

    /**
     * Add order-by as ascend. <br>
     * BRKD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brkd_Asc() { regOBA("BRKD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRKD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brkd_Desc() { regOBD("BRKD"); return this; }

    protected ConditionValue _fmlycd;
    public ConditionValue xdfgetFmlycd()
    { if (_fmlycd == null) { _fmlycd = nCV(); }
      return _fmlycd; }
    protected ConditionValue xgetCValueFmlycd() { return xdfgetFmlycd(); }

    /**
     * Add order-by as ascend. <br>
     * FMLYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Fmlycd_Asc() { regOBA("FMLYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FMLYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Fmlycd_Desc() { regOBD("FMLYCD"); return this; }

    protected ConditionValue _prgrcd;
    public ConditionValue xdfgetPrgrcd()
    { if (_prgrcd == null) { _prgrcd = nCV(); }
      return _prgrcd; }
    protected ConditionValue xgetCValuePrgrcd() { return xdfgetPrgrcd(); }

    /**
     * Add order-by as ascend. <br>
     * PRGRCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Prgrcd_Asc() { regOBA("PRGRCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRGRCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Prgrcd_Desc() { regOBD("PRGRCD"); return this; }

    protected ConditionValue _nctncls;
    public ConditionValue xdfgetNctncls()
    { if (_nctncls == null) { _nctncls = nCV(); }
      return _nctncls; }
    protected ConditionValue xgetCValueNctncls() { return xdfgetNctncls(); }

    /**
     * Add order-by as ascend. <br>
     * NCTNCLS: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Nctncls_Asc() { regOBA("NCTNCLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * NCTNCLS: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Nctncls_Desc() { regOBD("NCTNCLS"); return this; }

    protected ConditionValue _tarcls;
    public ConditionValue xdfgetTarcls()
    { if (_tarcls == null) { _tarcls = nCV(); }
      return _tarcls; }
    protected ConditionValue xgetCValueTarcls() { return xdfgetTarcls(); }

    /**
     * Add order-by as ascend. <br>
     * TARCLS: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Tarcls_Asc() { regOBA("TARCLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARCLS: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Tarcls_Desc() { regOBD("TARCLS"); return this; }

    protected ConditionValue _pdpkspcd;
    public ConditionValue xdfgetPdpkspcd()
    { if (_pdpkspcd == null) { _pdpkspcd = nCV(); }
      return _pdpkspcd; }
    protected ConditionValue xgetCValuePdpkspcd() { return xdfgetPdpkspcd(); }

    /**
     * Add order-by as ascend. <br>
     * PDPKSPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Pdpkspcd_Asc() { regOBA("PDPKSPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PDPKSPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Pdpkspcd_Desc() { regOBD("PDPKSPCD"); return this; }

    protected ConditionValue _fltid;
    public ConditionValue xdfgetFltid()
    { if (_fltid == null) { _fltid = nCV(); }
      return _fltid; }
    protected ConditionValue xgetCValueFltid() { return xdfgetFltid(); }

    /**
     * Add order-by as ascend. <br>
     * FLTID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Fltid_Asc() { regOBA("FLTID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLTID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Fltid_Desc() { regOBD("FLTID"); return this; }

    protected ConditionValue _ksubcdid;
    public ConditionValue xdfgetKsubcdid()
    { if (_ksubcdid == null) { _ksubcdid = nCV(); }
      return _ksubcdid; }
    protected ConditionValue xgetCValueKsubcdid() { return xdfgetKsubcdid(); }

    /**
     * Add order-by as ascend. <br>
     * KSUBCDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ksubcdid_Asc() { regOBA("KSUBCDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * KSUBCDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ksubcdid_Desc() { regOBD("KSUBCDID"); return this; }

    protected ConditionValue _ksubcd;
    public ConditionValue xdfgetKsubcd()
    { if (_ksubcd == null) { _ksubcd = nCV(); }
      return _ksubcd; }
    protected ConditionValue xgetCValueKsubcd() { return xdfgetKsubcd(); }

    /**
     * Add order-by as ascend. <br>
     * KSUBCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ksubcd_Asc() { regOBA("KSUBCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KSUBCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ksubcd_Desc() { regOBD("KSUBCD"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Ctbcdid_Asc() { regOBA("CTBCDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTBCDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctbcdid_Desc() { regOBD("CTBCDID"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Ctbcd_Asc() { regOBA("CTBCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTBCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctbcd_Desc() { regOBD("CTBCD"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Cbbcdid_Asc() { regOBA("CBBCDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBBCDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbbcdid_Desc() { regOBD("CBBCDID"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Cbbcd_Asc() { regOBA("CBBCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBBCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbbcd_Desc() { regOBD("CBBCD"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Ctfm_Asc() { regOBA("CTFM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTFM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctfm_Desc() { regOBD("CTFM"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Ctszl_Asc() { regOBA("CTSZL"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctszl_Desc() { regOBD("CTSZL"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Ctszw_Asc() { regOBA("CTSZW"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctszw_Desc() { regOBD("CTSZW"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Ctszh_Asc() { regOBA("CTSZH"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctszh_Desc() { regOBD("CTSZH"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Ctcc_Asc() { regOBA("CTCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTCC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctcc_Desc() { regOBD("CTCC"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Ctweight_Asc() { regOBA("CTWEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ctweight_Desc() { regOBD("CTWEIGHT"); return this; }

    protected ConditionValue _cbszl;
    public ConditionValue xdfgetCbszl()
    { if (_cbszl == null) { _cbszl = nCV(); }
      return _cbszl; }
    protected ConditionValue xgetCValueCbszl() { return xdfgetCbszl(); }

    /**
     * Add order-by as ascend. <br>
     * CBSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbszl_Asc() { regOBA("CBSZL"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbszl_Desc() { regOBD("CBSZL"); return this; }

    protected ConditionValue _cbszw;
    public ConditionValue xdfgetCbszw()
    { if (_cbszw == null) { _cbszw = nCV(); }
      return _cbszw; }
    protected ConditionValue xgetCValueCbszw() { return xdfgetCbszw(); }

    /**
     * Add order-by as ascend. <br>
     * CBSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbszw_Asc() { regOBA("CBSZW"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbszw_Desc() { regOBD("CBSZW"); return this; }

    protected ConditionValue _cbszh;
    public ConditionValue xdfgetCbszh()
    { if (_cbszh == null) { _cbszh = nCV(); }
      return _cbszh; }
    protected ConditionValue xgetCValueCbszh() { return xdfgetCbszh(); }

    /**
     * Add order-by as ascend. <br>
     * CBSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbszh_Asc() { regOBA("CBSZH"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbszh_Desc() { regOBD("CBSZH"); return this; }

    protected ConditionValue _cbcc;
    public ConditionValue xdfgetCbcc()
    { if (_cbcc == null) { _cbcc = nCV(); }
      return _cbcc; }
    protected ConditionValue xgetCValueCbcc() { return xdfgetCbcc(); }

    /**
     * Add order-by as ascend. <br>
     * CBCC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbcc_Asc() { regOBA("CBCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBCC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbcc_Desc() { regOBD("CBCC"); return this; }

    protected ConditionValue _cbwt;
    public ConditionValue xdfgetCbwt()
    { if (_cbwt == null) { _cbwt = nCV(); }
      return _cbwt; }
    protected ConditionValue xgetCValueCbwt() { return xdfgetCbwt(); }

    /**
     * Add order-by as ascend. <br>
     * CBWT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbwt_Asc() { regOBA("CBWT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBWT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cbwt_Desc() { regOBD("CBWT"); return this; }

    protected ConditionValue _bscdt;
    public ConditionValue xdfgetBscdt()
    { if (_bscdt == null) { _bscdt = nCV(); }
      return _bscdt; }
    protected ConditionValue xgetCValueBscdt() { return xdfgetBscdt(); }

    /**
     * Add order-by as ascend. <br>
     * BSCDT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdt_Asc() { regOBA("BSCDT"); return this; }

    /**
     * Add order-by as descend. <br>
     * BSCDT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdt_Desc() { regOBD("BSCDT"); return this; }

    protected ConditionValue _bscdk;
    public ConditionValue xdfgetBscdk()
    { if (_bscdk == null) { _bscdk = nCV(); }
      return _bscdk; }
    protected ConditionValue xgetCValueBscdk() { return xdfgetBscdk(); }

    /**
     * Add order-by as ascend. <br>
     * BSCDK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdk_Asc() { regOBA("BSCDK"); return this; }

    /**
     * Add order-by as descend. <br>
     * BSCDK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdk_Desc() { regOBD("BSCDK"); return this; }

    protected ConditionValue _bscdc;
    public ConditionValue xdfgetBscdc()
    { if (_bscdc == null) { _bscdc = nCV(); }
      return _bscdc; }
    protected ConditionValue xgetCValueBscdc() { return xdfgetBscdc(); }

    /**
     * Add order-by as ascend. <br>
     * BSCDC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdc_Asc() { regOBA("BSCDC"); return this; }

    /**
     * Add order-by as descend. <br>
     * BSCDC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdc_Desc() { regOBD("BSCDC"); return this; }

    protected ConditionValue _bscdq;
    public ConditionValue xdfgetBscdq()
    { if (_bscdq == null) { _bscdq = nCV(); }
      return _bscdq; }
    protected ConditionValue xgetCValueBscdq() { return xdfgetBscdq(); }

    /**
     * Add order-by as ascend. <br>
     * BSCDQ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdq_Asc() { regOBA("BSCDQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * BSCDQ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdq_Desc() { regOBD("BSCDQ"); return this; }

    protected ConditionValue _bscdh;
    public ConditionValue xdfgetBscdh()
    { if (_bscdh == null) { _bscdh = nCV(); }
      return _bscdh; }
    protected ConditionValue xgetCValueBscdh() { return xdfgetBscdh(); }

    /**
     * Add order-by as ascend. <br>
     * BSCDH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdh_Asc() { regOBA("BSCDH"); return this; }

    /**
     * Add order-by as descend. <br>
     * BSCDH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bscdh_Desc() { regOBD("BSCDH"); return this; }

    protected ConditionValue _spagcdt;
    public ConditionValue xdfgetSpagcdt()
    { if (_spagcdt == null) { _spagcdt = nCV(); }
      return _spagcdt; }
    protected ConditionValue xgetCValueSpagcdt() { return xdfgetSpagcdt(); }

    /**
     * Add order-by as ascend. <br>
     * SPAGCDT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdt_Asc() { regOBA("SPAGCDT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPAGCDT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdt_Desc() { regOBD("SPAGCDT"); return this; }

    protected ConditionValue _spagcdk;
    public ConditionValue xdfgetSpagcdk()
    { if (_spagcdk == null) { _spagcdk = nCV(); }
      return _spagcdk; }
    protected ConditionValue xgetCValueSpagcdk() { return xdfgetSpagcdk(); }

    /**
     * Add order-by as ascend. <br>
     * SPAGCDK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdk_Asc() { regOBA("SPAGCDK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPAGCDK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdk_Desc() { regOBD("SPAGCDK"); return this; }

    protected ConditionValue _spagcdc;
    public ConditionValue xdfgetSpagcdc()
    { if (_spagcdc == null) { _spagcdc = nCV(); }
      return _spagcdc; }
    protected ConditionValue xgetCValueSpagcdc() { return xdfgetSpagcdc(); }

    /**
     * Add order-by as ascend. <br>
     * SPAGCDC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdc_Asc() { regOBA("SPAGCDC"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPAGCDC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdc_Desc() { regOBD("SPAGCDC"); return this; }

    protected ConditionValue _spagcdq;
    public ConditionValue xdfgetSpagcdq()
    { if (_spagcdq == null) { _spagcdq = nCV(); }
      return _spagcdq; }
    protected ConditionValue xgetCValueSpagcdq() { return xdfgetSpagcdq(); }

    /**
     * Add order-by as ascend. <br>
     * SPAGCDQ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdq_Asc() { regOBA("SPAGCDQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPAGCDQ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdq_Desc() { regOBD("SPAGCDQ"); return this; }

    protected ConditionValue _spagcdh;
    public ConditionValue xdfgetSpagcdh()
    { if (_spagcdh == null) { _spagcdh = nCV(); }
      return _spagcdh; }
    protected ConditionValue xgetCValueSpagcdh() { return xdfgetSpagcdh(); }

    /**
     * Add order-by as ascend. <br>
     * SPAGCDH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdh_Asc() { regOBA("SPAGCDH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPAGCDH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Spagcdh_Desc() { regOBD("SPAGCDH"); return this; }

    protected ConditionValue _rbscd1;
    public ConditionValue xdfgetRbscd1()
    { if (_rbscd1 == null) { _rbscd1 = nCV(); }
      return _rbscd1; }
    protected ConditionValue xgetCValueRbscd1() { return xdfgetRbscd1(); }

    /**
     * Add order-by as ascend. <br>
     * RBSCD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd1_Asc() { regOBA("RBSCD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * RBSCD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd1_Desc() { regOBD("RBSCD1"); return this; }

    protected ConditionValue _rbscd2;
    public ConditionValue xdfgetRbscd2()
    { if (_rbscd2 == null) { _rbscd2 = nCV(); }
      return _rbscd2; }
    protected ConditionValue xgetCValueRbscd2() { return xdfgetRbscd2(); }

    /**
     * Add order-by as ascend. <br>
     * RBSCD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd2_Asc() { regOBA("RBSCD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * RBSCD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd2_Desc() { regOBD("RBSCD2"); return this; }

    protected ConditionValue _rbscd3;
    public ConditionValue xdfgetRbscd3()
    { if (_rbscd3 == null) { _rbscd3 = nCV(); }
      return _rbscd3; }
    protected ConditionValue xgetCValueRbscd3() { return xdfgetRbscd3(); }

    /**
     * Add order-by as ascend. <br>
     * RBSCD3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd3_Asc() { regOBA("RBSCD3"); return this; }

    /**
     * Add order-by as descend. <br>
     * RBSCD3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd3_Desc() { regOBD("RBSCD3"); return this; }

    protected ConditionValue _rbscd4;
    public ConditionValue xdfgetRbscd4()
    { if (_rbscd4 == null) { _rbscd4 = nCV(); }
      return _rbscd4; }
    protected ConditionValue xgetCValueRbscd4() { return xdfgetRbscd4(); }

    /**
     * Add order-by as ascend. <br>
     * RBSCD4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd4_Asc() { regOBA("RBSCD4"); return this; }

    /**
     * Add order-by as descend. <br>
     * RBSCD4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd4_Desc() { regOBD("RBSCD4"); return this; }

    protected ConditionValue _rbscd5;
    public ConditionValue xdfgetRbscd5()
    { if (_rbscd5 == null) { _rbscd5 = nCV(); }
      return _rbscd5; }
    protected ConditionValue xgetCValueRbscd5() { return xdfgetRbscd5(); }

    /**
     * Add order-by as ascend. <br>
     * RBSCD5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd5_Asc() { regOBA("RBSCD5"); return this; }

    /**
     * Add order-by as descend. <br>
     * RBSCD5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rbscd5_Desc() { regOBD("RBSCD5"); return this; }

    protected ConditionValue _ussbcd1;
    public ConditionValue xdfgetUssbcd1()
    { if (_ussbcd1 == null) { _ussbcd1 = nCV(); }
      return _ussbcd1; }
    protected ConditionValue xgetCValueUssbcd1() { return xdfgetUssbcd1(); }

    /**
     * Add order-by as ascend. <br>
     * USSBCD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd1_Asc() { regOBA("USSBCD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USSBCD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd1_Desc() { regOBD("USSBCD1"); return this; }

    protected ConditionValue _ussbcd2;
    public ConditionValue xdfgetUssbcd2()
    { if (_ussbcd2 == null) { _ussbcd2 = nCV(); }
      return _ussbcd2; }
    protected ConditionValue xgetCValueUssbcd2() { return xdfgetUssbcd2(); }

    /**
     * Add order-by as ascend. <br>
     * USSBCD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd2_Asc() { regOBA("USSBCD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * USSBCD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd2_Desc() { regOBD("USSBCD2"); return this; }

    protected ConditionValue _ussbcd3;
    public ConditionValue xdfgetUssbcd3()
    { if (_ussbcd3 == null) { _ussbcd3 = nCV(); }
      return _ussbcd3; }
    protected ConditionValue xgetCValueUssbcd3() { return xdfgetUssbcd3(); }

    /**
     * Add order-by as ascend. <br>
     * USSBCD3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd3_Asc() { regOBA("USSBCD3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USSBCD3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd3_Desc() { regOBD("USSBCD3"); return this; }

    protected ConditionValue _ussbcd4;
    public ConditionValue xdfgetUssbcd4()
    { if (_ussbcd4 == null) { _ussbcd4 = nCV(); }
      return _ussbcd4; }
    protected ConditionValue xgetCValueUssbcd4() { return xdfgetUssbcd4(); }

    /**
     * Add order-by as ascend. <br>
     * USSBCD4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd4_Asc() { regOBA("USSBCD4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USSBCD4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd4_Desc() { regOBD("USSBCD4"); return this; }

    protected ConditionValue _ussbcd5;
    public ConditionValue xdfgetUssbcd5()
    { if (_ussbcd5 == null) { _ussbcd5 = nCV(); }
      return _ussbcd5; }
    protected ConditionValue xgetCValueUssbcd5() { return xdfgetUssbcd5(); }

    /**
     * Add order-by as ascend. <br>
     * USSBCD5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd5_Asc() { regOBA("USSBCD5"); return this; }

    /**
     * Add order-by as descend. <br>
     * USSBCD5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Ussbcd5_Desc() { regOBD("USSBCD5"); return this; }

    protected ConditionValue _splcpcd;
    public ConditionValue xdfgetSplcpcd()
    { if (_splcpcd == null) { _splcpcd = nCV(); }
      return _splcpcd; }
    protected ConditionValue xgetCValueSplcpcd() { return xdfgetSplcpcd(); }

    /**
     * Add order-by as ascend. <br>
     * SPLCPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Splcpcd_Asc() { regOBA("SPLCPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPLCPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Splcpcd_Desc() { regOBD("SPLCPCD"); return this; }

    protected ConditionValue _makercd;
    public ConditionValue xdfgetMakercd()
    { if (_makercd == null) { _makercd = nCV(); }
      return _makercd; }
    protected ConditionValue xgetCValueMakercd() { return xdfgetMakercd(); }

    /**
     * Add order-by as ascend. <br>
     * MAKERCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Makercd_Asc() { regOBA("MAKERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKERCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Makercd_Desc() { regOBD("MAKERCD"); return this; }

    protected ConditionValue _land1;
    public ConditionValue xdfgetLand1()
    { if (_land1 == null) { _land1 = nCV(); }
      return _land1; }
    protected ConditionValue xgetCValueLand1() { return xdfgetLand1(); }

    /**
     * Add order-by as ascend. <br>
     * LAND1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Land1_Asc() { regOBA("LAND1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAND1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Land1_Desc() { regOBD("LAND1"); return this; }

    protected ConditionValue _cgclsdid;
    public ConditionValue xdfgetCgclsdid()
    { if (_cgclsdid == null) { _cgclsdid = nCV(); }
      return _cgclsdid; }
    protected ConditionValue xgetCValueCgclsdid() { return xdfgetCgclsdid(); }

    /**
     * Add order-by as ascend. <br>
     * CGCLSDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cgclsdid_Asc() { regOBA("CGCLSDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CGCLSDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Cgclsdid_Desc() { regOBD("CGCLSDID"); return this; }

    protected ConditionValue _gnlotrnk;
    public ConditionValue xdfgetGnlotrnk()
    { if (_gnlotrnk == null) { _gnlotrnk = nCV(); }
      return _gnlotrnk; }
    protected ConditionValue xgetCValueGnlotrnk() { return xdfgetGnlotrnk(); }

    /**
     * Add order-by as ascend. <br>
     * GNLOTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Gnlotrnk_Asc() { regOBA("GNLOTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * GNLOTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Gnlotrnk_Desc() { regOBD("GNLOTRNK"); return this; }

    protected ConditionValue _mrotrnk;
    public ConditionValue xdfgetMrotrnk()
    { if (_mrotrnk == null) { _mrotrnk = nCV(); }
      return _mrotrnk; }
    protected ConditionValue xgetCValueMrotrnk() { return xdfgetMrotrnk(); }

    /**
     * Add order-by as ascend. <br>
     * MROTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Mrotrnk_Asc() { regOBA("MROTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * MROTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Mrotrnk_Desc() { regOBD("MROTRNK"); return this; }

    protected ConditionValue _coid;
    public ConditionValue xdfgetCoid()
    { if (_coid == null) { _coid = nCV(); }
      return _coid; }
    protected ConditionValue xgetCValueCoid() { return xdfgetCoid(); }

    /**
     * Add order-by as ascend. <br>
     * COID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Coid_Asc() { regOBA("COID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Coid_Desc() { regOBD("COID"); return this; }

    protected ConditionValue _brwkid;
    public ConditionValue xdfgetBrwkid()
    { if (_brwkid == null) { _brwkid = nCV(); }
      return _brwkid; }
    protected ConditionValue xgetCValueBrwkid() { return xdfgetBrwkid(); }

    /**
     * Add order-by as ascend. <br>
     * BRWKID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brwkid_Asc() { regOBA("BRWKID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRWKID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Brwkid_Desc() { regOBD("BRWKID"); return this; }

    protected ConditionValue _shunid;
    public ConditionValue xdfgetShunid()
    { if (_shunid == null) { _shunid = nCV(); }
      return _shunid; }
    protected ConditionValue xgetCValueShunid() { return xdfgetShunid(); }

    /**
     * Add order-by as ascend. <br>
     * SHUNID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Shunid_Asc() { regOBA("SHUNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHUNID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Shunid_Desc() { regOBD("SHUNID"); return this; }

    protected ConditionValue _dstkbn;
    public ConditionValue xdfgetDstkbn()
    { if (_dstkbn == null) { _dstkbn = nCV(); }
      return _dstkbn; }
    protected ConditionValue xgetCValueDstkbn() { return xdfgetDstkbn(); }

    /**
     * Add order-by as ascend. <br>
     * DSTKBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Dstkbn_Asc() { regOBA("DSTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSTKBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Dstkbn_Desc() { regOBD("DSTKBN"); return this; }

    protected ConditionValue _reomatnr;
    public ConditionValue xdfgetReomatnr()
    { if (_reomatnr == null) { _reomatnr = nCV(); }
      return _reomatnr; }
    protected ConditionValue xgetCValueReomatnr() { return xdfgetReomatnr(); }

    /**
     * Add order-by as ascend. <br>
     * REOMATNR: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Reomatnr_Asc() { regOBA("REOMATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * REOMATNR: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Reomatnr_Desc() { regOBD("REOMATNR"); return this; }

    protected ConditionValue _dspeckb;
    public ConditionValue xdfgetDspeckb()
    { if (_dspeckb == null) { _dspeckb = nCV(); }
      return _dspeckb; }
    protected ConditionValue xgetCValueDspeckb() { return xdfgetDspeckb(); }

    /**
     * Add order-by as ascend. <br>
     * DSPECKB: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Dspeckb_Asc() { regOBA("DSPECKB"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSPECKB: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Dspeckb_Desc() { regOBD("DSPECKB"); return this; }

    protected ConditionValue _sgmid;
    public ConditionValue xdfgetSgmid()
    { if (_sgmid == null) { _sgmid = nCV(); }
      return _sgmid; }
    protected ConditionValue xgetCValueSgmid() { return xdfgetSgmid(); }

    /**
     * Add order-by as ascend. <br>
     * SGMID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sgmid_Asc() { regOBA("SGMID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SGMID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Sgmid_Desc() { regOBD("SGMID"); return this; }

    protected ConditionValue _makileng;
    public ConditionValue xdfgetMakileng()
    { if (_makileng == null) { _makileng = nCV(); }
      return _makileng; }
    protected ConditionValue xgetCValueMakileng() { return xdfgetMakileng(); }

    /**
     * Add order-by as ascend. <br>
     * MAKILENG: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Makileng_Asc() { regOBA("MAKILENG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKILENG: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Makileng_Desc() { regOBD("MAKILENG"); return this; }

    protected ConditionValue _makidia;
    public ConditionValue xdfgetMakidia()
    { if (_makidia == null) { _makidia = nCV(); }
      return _makidia; }
    protected ConditionValue xgetCValueMakidia() { return xdfgetMakidia(); }

    /**
     * Add order-by as ascend. <br>
     * MAKIDIA: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Makidia_Asc() { regOBA("MAKIDIA"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKIDIA: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Makidia_Desc() { regOBD("MAKIDIA"); return this; }

    protected ConditionValue _gdmsrp;
    public ConditionValue xdfgetGdmsrp()
    { if (_gdmsrp == null) { _gdmsrp = nCV(); }
      return _gdmsrp; }
    protected ConditionValue xgetCValueGdmsrp() { return xdfgetGdmsrp(); }

    /**
     * Add order-by as ascend. <br>
     * GDMSRP: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Gdmsrp_Asc() { regOBA("GDMSRP"); return this; }

    /**
     * Add order-by as descend. <br>
     * GDMSRP: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Gdmsrp_Desc() { regOBD("GDMSRP"); return this; }

    protected ConditionValue _gdslu;
    public ConditionValue xdfgetGdslu()
    { if (_gdslu == null) { _gdslu = nCV(); }
      return _gdslu; }
    protected ConditionValue xgetCValueGdslu() { return xdfgetGdslu(); }

    /**
     * Add order-by as ascend. <br>
     * GDSLU: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Gdslu_Asc() { regOBA("GDSLU"); return this; }

    /**
     * Add order-by as descend. <br>
     * GDSLU: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Gdslu_Desc() { regOBD("GDSLU"); return this; }

    protected ConditionValue _gdpru;
    public ConditionValue xdfgetGdpru()
    { if (_gdpru == null) { _gdpru = nCV(); }
      return _gdpru; }
    protected ConditionValue xgetCValueGdpru() { return xdfgetGdpru(); }

    /**
     * Add order-by as ascend. <br>
     * GDPRU: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Gdpru_Asc() { regOBA("GDPRU"); return this; }

    /**
     * Add order-by as descend. <br>
     * GDPRU: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Gdpru_Desc() { regOBD("GDPRU"); return this; }

    protected ConditionValue _exima;
    public ConditionValue xdfgetExima()
    { if (_exima == null) { _exima = nCV(); }
      return _exima; }
    protected ConditionValue xgetCValueExima() { return xdfgetExima(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMA: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Exima_Asc() { regOBA("EXIMA"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMA: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Exima_Desc() { regOBD("EXIMA"); return this; }

    protected ConditionValue _eximb;
    public ConditionValue xdfgetEximb()
    { if (_eximb == null) { _eximb = nCV(); }
      return _eximb; }
    protected ConditionValue xgetCValueEximb() { return xdfgetEximb(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMB: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximb_Asc() { regOBA("EXIMB"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMB: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximb_Desc() { regOBD("EXIMB"); return this; }

    protected ConditionValue _eximc;
    public ConditionValue xdfgetEximc()
    { if (_eximc == null) { _eximc = nCV(); }
      return _eximc; }
    protected ConditionValue xgetCValueEximc() { return xdfgetEximc(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMC: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximc_Asc() { regOBA("EXIMC"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMC: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximc_Desc() { regOBD("EXIMC"); return this; }

    protected ConditionValue _eximd;
    public ConditionValue xdfgetEximd()
    { if (_eximd == null) { _eximd = nCV(); }
      return _eximd; }
    protected ConditionValue xgetCValueEximd() { return xdfgetEximd(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMD: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximd_Asc() { regOBA("EXIMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMD: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximd_Desc() { regOBD("EXIMD"); return this; }

    protected ConditionValue _exime;
    public ConditionValue xdfgetExime()
    { if (_exime == null) { _exime = nCV(); }
      return _exime; }
    protected ConditionValue xgetCValueExime() { return xdfgetExime(); }

    /**
     * Add order-by as ascend. <br>
     * EXIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Exime_Asc() { regOBA("EXIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Exime_Desc() { regOBD("EXIME"); return this; }

    protected ConditionValue _eximf;
    public ConditionValue xdfgetEximf()
    { if (_eximf == null) { _eximf = nCV(); }
      return _eximf; }
    protected ConditionValue xgetCValueEximf() { return xdfgetEximf(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximf_Asc() { regOBA("EXIMF"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximf_Desc() { regOBD("EXIMF"); return this; }

    protected ConditionValue _eximg;
    public ConditionValue xdfgetEximg()
    { if (_eximg == null) { _eximg = nCV(); }
      return _eximg; }
    protected ConditionValue xgetCValueEximg() { return xdfgetEximg(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMG: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximg_Asc() { regOBA("EXIMG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMG: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximg_Desc() { regOBD("EXIMG"); return this; }

    protected ConditionValue _eximh;
    public ConditionValue xdfgetEximh()
    { if (_eximh == null) { _eximh = nCV(); }
      return _eximh; }
    protected ConditionValue xgetCValueEximh() { return xdfgetEximh(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMH: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximh_Asc() { regOBA("EXIMH"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMH: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximh_Desc() { regOBD("EXIMH"); return this; }

    protected ConditionValue _eximi;
    public ConditionValue xdfgetEximi()
    { if (_eximi == null) { _eximi = nCV(); }
      return _eximi; }
    protected ConditionValue xgetCValueEximi() { return xdfgetEximi(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMI: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximi_Asc() { regOBA("EXIMI"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMI: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximi_Desc() { regOBD("EXIMI"); return this; }

    protected ConditionValue _eximj;
    public ConditionValue xdfgetEximj()
    { if (_eximj == null) { _eximj = nCV(); }
      return _eximj; }
    protected ConditionValue xgetCValueEximj() { return xdfgetEximj(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMJ: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximj_Asc() { regOBA("EXIMJ"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMJ: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximj_Desc() { regOBD("EXIMJ"); return this; }

    protected ConditionValue _eximk;
    public ConditionValue xdfgetEximk()
    { if (_eximk == null) { _eximk = nCV(); }
      return _eximk; }
    protected ConditionValue xgetCValueEximk() { return xdfgetEximk(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMK: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximk_Asc() { regOBA("EXIMK"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMK: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximk_Desc() { regOBD("EXIMK"); return this; }

    protected ConditionValue _eximl;
    public ConditionValue xdfgetEximl()
    { if (_eximl == null) { _eximl = nCV(); }
      return _eximl; }
    protected ConditionValue xgetCValueEximl() { return xdfgetEximl(); }

    /**
     * Add order-by as ascend. <br>
     * EXIML: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximl_Asc() { regOBA("EXIML"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIML: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximl_Desc() { regOBD("EXIML"); return this; }

    protected ConditionValue _eximm;
    public ConditionValue xdfgetEximm()
    { if (_eximm == null) { _eximm = nCV(); }
      return _eximm; }
    protected ConditionValue xgetCValueEximm() { return xdfgetEximm(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximm_Asc() { regOBA("EXIMM"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximm_Desc() { regOBD("EXIMM"); return this; }

    protected ConditionValue _eximn;
    public ConditionValue xdfgetEximn()
    { if (_eximn == null) { _eximn = nCV(); }
      return _eximn; }
    protected ConditionValue xgetCValueEximn() { return xdfgetEximn(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMN: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximn_Asc() { regOBA("EXIMN"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMN: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximn_Desc() { regOBD("EXIMN"); return this; }

    protected ConditionValue _eximo;
    public ConditionValue xdfgetEximo()
    { if (_eximo == null) { _eximo = nCV(); }
      return _eximo; }
    protected ConditionValue xgetCValueEximo() { return xdfgetEximo(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximo_Asc() { regOBA("EXIMO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximo_Desc() { regOBD("EXIMO"); return this; }

    protected ConditionValue _eximp;
    public ConditionValue xdfgetEximp()
    { if (_eximp == null) { _eximp = nCV(); }
      return _eximp; }
    protected ConditionValue xgetCValueEximp() { return xdfgetEximp(); }

    /**
     * Add order-by as ascend. <br>
     * EXIMP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximp_Asc() { regOBA("EXIMP"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXIMP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Eximp_Desc() { regOBD("EXIMP"); return this; }

    protected ConditionValue _upmn;
    public ConditionValue xdfgetUpmn()
    { if (_upmn == null) { _upmn = nCV(); }
      return _upmn; }
    protected ConditionValue xgetCValueUpmn() { return xdfgetUpmn(); }

    /**
     * Add order-by as ascend. <br>
     * UPMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Upmn_Asc() { regOBA("UPMN"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Upmn_Desc() { regOBD("UPMN"); return this; }

    protected ConditionValue _chngyd;
    public ConditionValue xdfgetChngyd()
    { if (_chngyd == null) { _chngyd = nCV(); }
      return _chngyd; }
    protected ConditionValue xgetCValueChngyd() { return xdfgetChngyd(); }

    /**
     * Add order-by as ascend. <br>
     * CHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Chngyd_Asc() { regOBA("CHNGYD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Chngyd_Desc() { regOBD("CHNGYD"); return this; }

    protected ConditionValue _updtm;
    public ConditionValue xdfgetUpdtm()
    { if (_updtm == null) { _updtm = nCV(); }
      return _updtm; }
    protected ConditionValue xgetCValueUpdtm() { return xdfgetUpdtm(); }

    /**
     * Add order-by as ascend. <br>
     * UPDTM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Updtm_Asc() { regOBA("UPDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDTM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Updtm_Desc() { regOBD("UPDTM"); return this; }

    protected ConditionValue _updis;
    public ConditionValue xdfgetUpdis()
    { if (_updis == null) { _updis = nCV(); }
      return _updis; }
    protected ConditionValue xgetCValueUpdis() { return xdfgetUpdis(); }

    /**
     * Add order-by as ascend. <br>
     * UPDIS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Updis_Asc() { regOBA("UPDIS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDIS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Updis_Desc() { regOBD("UPDIS"); return this; }

    protected ConditionValue _upbmn;
    public ConditionValue xdfgetUpbmn()
    { if (_upbmn == null) { _upbmn = nCV(); }
      return _upbmn; }
    protected ConditionValue xgetCValueUpbmn() { return xdfgetUpbmn(); }

    /**
     * Add order-by as ascend. <br>
     * UPBMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Upbmn_Asc() { regOBA("UPBMN"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPBMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Upbmn_Desc() { regOBD("UPBMN"); return this; }

    protected ConditionValue _bchngyd;
    public ConditionValue xdfgetBchngyd()
    { if (_bchngyd == null) { _bchngyd = nCV(); }
      return _bchngyd; }
    protected ConditionValue xgetCValueBchngyd() { return xdfgetBchngyd(); }

    /**
     * Add order-by as ascend. <br>
     * BCHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bchngyd_Asc() { regOBA("BCHNGYD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BCHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bchngyd_Desc() { regOBD("BCHNGYD"); return this; }

    protected ConditionValue _bupdtm;
    public ConditionValue xdfgetBupdtm()
    { if (_bupdtm == null) { _bupdtm = nCV(); }
      return _bupdtm; }
    protected ConditionValue xgetCValueBupdtm() { return xdfgetBupdtm(); }

    /**
     * Add order-by as ascend. <br>
     * BUPDTM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bupdtm_Asc() { regOBA("BUPDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BUPDTM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Bupdtm_Desc() { regOBD("BUPDTM"); return this; }

    protected ConditionValue _upobmn;
    public ConditionValue xdfgetUpobmn()
    { if (_upobmn == null) { _upobmn = nCV(); }
      return _upobmn; }
    protected ConditionValue xgetCValueUpobmn() { return xdfgetUpobmn(); }

    /**
     * Add order-by as ascend. <br>
     * UPOBMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Upobmn_Asc() { regOBA("UPOBMN"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPOBMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Upobmn_Desc() { regOBD("UPOBMN"); return this; }

    protected ConditionValue _obchngyd;
    public ConditionValue xdfgetObchngyd()
    { if (_obchngyd == null) { _obchngyd = nCV(); }
      return _obchngyd; }
    protected ConditionValue xgetCValueObchngyd() { return xdfgetObchngyd(); }

    /**
     * Add order-by as ascend. <br>
     * OBCHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Obchngyd_Asc() { regOBA("OBCHNGYD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OBCHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Obchngyd_Desc() { regOBD("OBCHNGYD"); return this; }

    protected ConditionValue _obupdtm;
    public ConditionValue xdfgetObupdtm()
    { if (_obupdtm == null) { _obupdtm = nCV(); }
      return _obupdtm; }
    protected ConditionValue xgetCValueObupdtm() { return xdfgetObupdtm(); }

    /**
     * Add order-by as ascend. <br>
     * OBUPDTM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Obupdtm_Asc() { regOBA("OBUPDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * OBUPDTM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Obupdtm_Desc() { regOBD("OBUPDTM"); return this; }

    protected ConditionValue _aubrchfg;
    public ConditionValue xdfgetAubrchfg()
    { if (_aubrchfg == null) { _aubrchfg = nCV(); }
      return _aubrchfg; }
    protected ConditionValue xgetCValueAubrchfg() { return xdfgetAubrchfg(); }

    /**
     * Add order-by as ascend. <br>
     * AUBRCHFG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Aubrchfg_Asc() { regOBA("AUBRCHFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUBRCHFG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Aubrchfg_Desc() { regOBD("AUBRCHFG"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Zzfrdateh_Asc() { regOBA("ZZFRDATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZFRDATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zzfrdateh_Desc() { regOBD("ZZFRDATEH"); return this; }

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
    public BsMTsnProductCQ addOrderBy_Zztodateh_Asc() { regOBA("ZZTODATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZTODATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Zztodateh_Desc() { regOBD("ZZTODATEH"); return this; }

    protected ConditionValue _rcdupdps;
    public ConditionValue xdfgetRcdupdps()
    { if (_rcdupdps == null) { _rcdupdps = nCV(); }
      return _rcdupdps; }
    protected ConditionValue xgetCValueRcdupdps() { return xdfgetRcdupdps(); }

    /**
     * Add order-by as ascend. <br>
     * RCDUPDPS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rcdupdps_Asc() { regOBA("RCDUPDPS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCDUPDPS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Rcdupdps_Desc() { regOBD("RCDUPDPS"); return this; }

    protected ConditionValue _updusrid;
    public ConditionValue xdfgetUpdusrid()
    { if (_updusrid == null) { _updusrid = nCV(); }
      return _updusrid; }
    protected ConditionValue xgetCValueUpdusrid() { return xdfgetUpdusrid(); }

    /**
     * Add order-by as ascend. <br>
     * UPDUSRID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Updusrid_Asc() { regOBA("UPDUSRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDUSRID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Updusrid_Desc() { regOBD("UPDUSRID"); return this; }

    protected ConditionValue _updpocd;
    public ConditionValue xdfgetUpdpocd()
    { if (_updpocd == null) { _updpocd = nCV(); }
      return _updpocd; }
    protected ConditionValue xgetCValueUpdpocd() { return xdfgetUpdpocd(); }

    /**
     * Add order-by as ascend. <br>
     * UPDPOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Updpocd_Asc() { regOBA("UPDPOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDPOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Updpocd_Desc() { regOBD("UPDPOCD"); return this; }

    protected ConditionValue _otcmpfg;
    public ConditionValue xdfgetOtcmpfg()
    { if (_otcmpfg == null) { _otcmpfg = nCV(); }
      return _otcmpfg; }
    protected ConditionValue xgetCValueOtcmpfg() { return xdfgetOtcmpfg(); }

    /**
     * Add order-by as ascend. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Otcmpfg_Asc() { regOBA("OTCMPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Otcmpfg_Desc() { regOBD("OTCMPFG"); return this; }

    protected ConditionValue _tmcmpfg;
    public ConditionValue xdfgetTmcmpfg()
    { if (_tmcmpfg == null) { _tmcmpfg = nCV(); }
      return _tmcmpfg; }
    protected ConditionValue xgetCValueTmcmpfg() { return xdfgetTmcmpfg(); }

    /**
     * Add order-by as ascend. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Tmcmpfg_Asc() { regOBA("TMCMPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Tmcmpfg_Desc() { regOBD("TMCMPFG"); return this; }

    protected ConditionValue _stmid;
    public ConditionValue xdfgetStmid()
    { if (_stmid == null) { _stmid = nCV(); }
      return _stmid; }
    protected ConditionValue xgetCValueStmid() { return xdfgetStmid(); }

    /**
     * Add order-by as ascend. <br>
     * STMID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Stmid_Asc() { regOBA("STMID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STMID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_Stmid_Desc() { regOBD("STMID"); return this; }

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
    public BsMTsnProductCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMTsnProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMTsnProductCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMTsnProductCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMTsnProductCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMTsnProductCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMTsnProductCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMTsnProductCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMTsnProductCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMTsnProductCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMTsnProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMTsnProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MTsnProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MTsnProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MTsnProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MTsnProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MTsnProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MTsnProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MTsnProductCQ> _myselfExistsMap;
    public Map<String, MTsnProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MTsnProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MTsnProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MTsnProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MTsnProductCB.class.getName(); }
    protected String xCQ() { return MTsnProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
