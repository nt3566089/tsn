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
 * The base condition-query of E_TSN_MFCOMPANY.
 * @author DBFlute(AutoGenerator)
 */
public class BsETsnMfcompanyCQ extends AbstractBsETsnMfcompanyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ETsnMfcompanyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsETsnMfcompanyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_TSN_MFCOMPANY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ETsnMfcompanyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ETsnMfcompanyCIQ xcreateCIQ() {
        ETsnMfcompanyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ETsnMfcompanyCIQ xnewCIQ() {
        return new ETsnMfcompanyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_TSN_MFCOMPANY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ETsnMfcompanyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ETsnMfcompanyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tsnMfcompanyId;
    public ConditionValue xdfgetTsnMfcompanyId()
    { if (_tsnMfcompanyId == null) { _tsnMfcompanyId = nCV(); }
      return _tsnMfcompanyId; }
    protected ConditionValue xgetCValueTsnMfcompanyId() { return xdfgetTsnMfcompanyId(); }

    /**
     * Add order-by as ascend. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_TsnMfcompanyId_Asc() { regOBA("TSN_MFCOMPANY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_TsnMfcompanyId_Desc() { regOBD("TSN_MFCOMPANY_ID"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _zzorgncd;
    public ConditionValue xdfgetZzorgncd()
    { if (_zzorgncd == null) { _zzorgncd = nCV(); }
      return _zzorgncd; }
    protected ConditionValue xgetCValueZzorgncd() { return xdfgetZzorgncd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

    protected ConditionValue _zzorgnid;
    public ConditionValue xdfgetZzorgnid()
    { if (_zzorgnid == null) { _zzorgnid = nCV(); }
      return _zzorgnid; }
    protected ConditionValue xgetCValueZzorgnid() { return xdfgetZzorgnid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORGNID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzorgnid_Asc() { regOBA("ZZORGNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzorgnid_Desc() { regOBD("ZZORGNID"); return this; }

    protected ConditionValue _orgnmkjf;
    public ConditionValue xdfgetOrgnmkjf()
    { if (_orgnmkjf == null) { _orgnmkjf = nCV(); }
      return _orgnmkjf; }
    protected ConditionValue xgetCValueOrgnmkjf() { return xdfgetOrgnmkjf(); }

    /**
     * Add order-by as ascend. <br>
     * ORGNMKJF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgnmkjf_Asc() { regOBA("ORGNMKJF"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGNMKJF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgnmkjf_Desc() { regOBD("ORGNMKJF"); return this; }

    protected ConditionValue _jtonfnf;
    public ConditionValue xdfgetJtonfnf()
    { if (_jtonfnf == null) { _jtonfnf = nCV(); }
      return _jtonfnf; }
    protected ConditionValue xgetCValueJtonfnf() { return xdfgetJtonfnf(); }

    /**
     * Add order-by as ascend. <br>
     * JTONFNF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Jtonfnf_Asc() { regOBA("JTONFNF"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTONFNF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Jtonfnf_Desc() { regOBD("JTONFNF"); return this; }

    protected ConditionValue _onfnha;
    public ConditionValue xdfgetOnfnha()
    { if (_onfnha == null) { _onfnha = nCV(); }
      return _onfnha; }
    protected ConditionValue xgetCValueOnfnha() { return xdfgetOnfnha(); }

    /**
     * Add order-by as ascend. <br>
     * ONFNHA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Onfnha_Asc() { regOBA("ONFNHA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ONFNHA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Onfnha_Desc() { regOBD("ONFNHA"); return this; }

    protected ConditionValue _jtonfnh;
    public ConditionValue xdfgetJtonfnh()
    { if (_jtonfnh == null) { _jtonfnh = nCV(); }
      return _jtonfnh; }
    protected ConditionValue xgetCValueJtonfnh() { return xdfgetJtonfnh(); }

    /**
     * Add order-by as ascend. <br>
     * JTONFNH: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Jtonfnh_Asc() { regOBA("JTONFNH"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTONFNH: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Jtonfnh_Desc() { regOBD("JTONFNH"); return this; }

    protected ConditionValue _zzorgnam;
    public ConditionValue xdfgetZzorgnam()
    { if (_zzorgnam == null) { _zzorgnam = nCV(); }
      return _zzorgnam; }
    protected ConditionValue xgetCValueZzorgnam() { return xdfgetZzorgnam(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORGNAM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzorgnam_Asc() { regOBA("ZZORGNAM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNAM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzorgnam_Desc() { regOBD("ZZORGNAM"); return this; }

    protected ConditionValue _jtonanf;
    public ConditionValue xdfgetJtonanf()
    { if (_jtonanf == null) { _jtonanf = nCV(); }
      return _jtonanf; }
    protected ConditionValue xgetCValueJtonanf() { return xdfgetJtonanf(); }

    /**
     * Add order-by as ascend. <br>
     * JTONANF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Jtonanf_Asc() { regOBA("JTONANF"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTONANF: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Jtonanf_Desc() { regOBD("JTONANF"); return this; }

    protected ConditionValue _onanha;
    public ConditionValue xdfgetOnanha()
    { if (_onanha == null) { _onanha = nCV(); }
      return _onanha; }
    protected ConditionValue xgetCValueOnanha() { return xdfgetOnanha(); }

    /**
     * Add order-by as ascend. <br>
     * ONANHA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Onanha_Asc() { regOBA("ONANHA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ONANHA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Onanha_Desc() { regOBD("ONANHA"); return this; }

    protected ConditionValue _jtonanh;
    public ConditionValue xdfgetJtonanh()
    { if (_jtonanh == null) { _jtonanh = nCV(); }
      return _jtonanh; }
    protected ConditionValue xgetCValueJtonanh() { return xdfgetJtonanh(); }

    /**
     * Add order-by as ascend. <br>
     * JTONANH: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Jtonanh_Asc() { regOBA("JTONANH"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTONANH: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Jtonanh_Desc() { regOBD("JTONANH"); return this; }

    protected ConditionValue _anwhnm;
    public ConditionValue xdfgetAnwhnm()
    { if (_anwhnm == null) { _anwhnm = nCV(); }
      return _anwhnm; }
    protected ConditionValue xgetCValueAnwhnm() { return xdfgetAnwhnm(); }

    /**
     * Add order-by as ascend. <br>
     * ANWHNM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Anwhnm_Asc() { regOBA("ANWHNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ANWHNM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Anwhnm_Desc() { regOBD("ANWHNM"); return this; }

    protected ConditionValue _ioorid;
    public ConditionValue xdfgetIoorid()
    { if (_ioorid == null) { _ioorid = nCV(); }
      return _ioorid; }
    protected ConditionValue xgetCValueIoorid() { return xdfgetIoorid(); }

    /**
     * Add order-by as ascend. <br>
     * IOORID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Ioorid_Asc() { regOBA("IOORID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IOORID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Ioorid_Desc() { regOBD("IOORID"); return this; }

    protected ConditionValue _orgpsno;
    public ConditionValue xdfgetOrgpsno()
    { if (_orgpsno == null) { _orgpsno = nCV(); }
      return _orgpsno; }
    protected ConditionValue xgetCValueOrgpsno() { return xdfgetOrgpsno(); }

    /**
     * Add order-by as ascend. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgpsno_Asc() { regOBA("ORGPSNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgpsno_Desc() { regOBD("ORGPSNO"); return this; }

    protected ConditionValue _advcd;
    public ConditionValue xdfgetAdvcd()
    { if (_advcd == null) { _advcd = nCV(); }
      return _advcd; }
    protected ConditionValue xgetCValueAdvcd() { return xdfgetAdvcd(); }

    /**
     * Add order-by as ascend. <br>
     * ADVCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Advcd_Asc() { regOBA("ADVCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADVCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Advcd_Desc() { regOBD("ADVCD"); return this; }

    protected ConditionValue _counc;
    public ConditionValue xdfgetCounc()
    { if (_counc == null) { _counc = nCV(); }
      return _counc; }
    protected ConditionValue xgetCValueCounc() { return xdfgetCounc(); }

    /**
     * Add order-by as ascend. <br>
     * COUNC: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Counc_Asc() { regOBA("COUNC"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNC: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Counc_Desc() { regOBD("COUNC"); return this; }

    protected ConditionValue _orgadr1;
    public ConditionValue xdfgetOrgadr1()
    { if (_orgadr1 == null) { _orgadr1 = nCV(); }
      return _orgadr1; }
    protected ConditionValue xgetCValueOrgadr1() { return xdfgetOrgadr1(); }

    /**
     * Add order-by as ascend. <br>
     * ORGADR1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgadr1_Asc() { regOBA("ORGADR1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGADR1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgadr1_Desc() { regOBD("ORGADR1"); return this; }

    protected ConditionValue _orgtel;
    public ConditionValue xdfgetOrgtel()
    { if (_orgtel == null) { _orgtel = nCV(); }
      return _orgtel; }
    protected ConditionValue xgetCValueOrgtel() { return xdfgetOrgtel(); }

    /**
     * Add order-by as ascend. <br>
     * ORGTEL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgtel_Asc() { regOBA("ORGTEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGTEL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgtel_Desc() { regOBD("ORGTEL"); return this; }

    protected ConditionValue _ortl2;
    public ConditionValue xdfgetOrtl2()
    { if (_ortl2 == null) { _ortl2 = nCV(); }
      return _ortl2; }
    protected ConditionValue xgetCValueOrtl2() { return xdfgetOrtl2(); }

    /**
     * Add order-by as ascend. <br>
     * ORTL2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Ortl2_Asc() { regOBA("ORTL2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORTL2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Ortl2_Desc() { regOBD("ORTL2"); return this; }

    protected ConditionValue _orgfax;
    public ConditionValue xdfgetOrgfax()
    { if (_orgfax == null) { _orgfax = nCV(); }
      return _orgfax; }
    protected ConditionValue xgetCValueOrgfax() { return xdfgetOrgfax(); }

    /**
     * Add order-by as ascend. <br>
     * ORGFAX: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgfax_Asc() { regOBA("ORGFAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGFAX: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orgfax_Desc() { regOBD("ORGFAX"); return this; }

    protected ConditionValue _zzhorgcd;
    public ConditionValue xdfgetZzhorgcd()
    { if (_zzhorgcd == null) { _zzhorgcd = nCV(); }
      return _zzhorgcd; }
    protected ConditionValue xgetCValueZzhorgcd() { return xdfgetZzhorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZHORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzhorgcd_Asc() { regOBA("ZZHORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZHORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzhorgcd_Desc() { regOBD("ZZHORGCD"); return this; }

    protected ConditionValue _zzbasecd;
    public ConditionValue xdfgetZzbasecd()
    { if (_zzbasecd == null) { _zzbasecd = nCV(); }
      return _zzbasecd; }
    protected ConditionValue xgetCValueZzbasecd() { return xdfgetZzbasecd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZBASECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzbasecd_Asc() { regOBA("ZZBASECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZBASECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzbasecd_Desc() { regOBD("ZZBASECD"); return this; }

    protected ConditionValue _csadmag;
    public ConditionValue xdfgetCsadmag()
    { if (_csadmag == null) { _csadmag = nCV(); }
      return _csadmag; }
    protected ConditionValue xgetCValueCsadmag() { return xdfgetCsadmag(); }

    /**
     * Add order-by as ascend. <br>
     * CSADMAG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Csadmag_Asc() { regOBA("CSADMAG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSADMAG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Csadmag_Desc() { regOBD("CSADMAG"); return this; }

    protected ConditionValue _taxocd;
    public ConditionValue xdfgetTaxocd()
    { if (_taxocd == null) { _taxocd = nCV(); }
      return _taxocd; }
    protected ConditionValue xgetCValueTaxocd() { return xdfgetTaxocd(); }

    /**
     * Add order-by as ascend. <br>
     * TAXOCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Taxocd_Asc() { regOBA("TAXOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXOCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Taxocd_Desc() { regOBD("TAXOCD"); return this; }

    protected ConditionValue _uptaxid;
    public ConditionValue xdfgetUptaxid()
    { if (_uptaxid == null) { _uptaxid = nCV(); }
      return _uptaxid; }
    protected ConditionValue xgetCValueUptaxid() { return xdfgetUptaxid(); }

    /**
     * Add order-by as ascend. <br>
     * UPTAXID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Uptaxid_Asc() { regOBA("UPTAXID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPTAXID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Uptaxid_Desc() { regOBD("UPTAXID"); return this; }

    protected ConditionValue _statcid;
    public ConditionValue xdfgetStatcid()
    { if (_statcid == null) { _statcid = nCV(); }
      return _statcid; }
    protected ConditionValue xgetCValueStatcid() { return xdfgetStatcid(); }

    /**
     * Add order-by as ascend. <br>
     * STATCID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Statcid_Asc() { regOBA("STATCID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATCID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Statcid_Desc() { regOBD("STATCID"); return this; }

    protected ConditionValue _stlndid;
    public ConditionValue xdfgetStlndid()
    { if (_stlndid == null) { _stlndid = nCV(); }
      return _stlndid; }
    protected ConditionValue xgetCValueStlndid() { return xdfgetStlndid(); }

    /**
     * Add order-by as ascend. <br>
     * STLNDID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Stlndid_Asc() { regOBA("STLNDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STLNDID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Stlndid_Desc() { regOBD("STLNDID"); return this; }

    protected ConditionValue _zzwhmgid;
    public ConditionValue xdfgetZzwhmgid()
    { if (_zzwhmgid == null) { _zzwhmgid = nCV(); }
      return _zzwhmgid; }
    protected ConditionValue xgetCValueZzwhmgid() { return xdfgetZzwhmgid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZWHMGID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzwhmgid_Asc() { regOBA("ZZWHMGID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZWHMGID: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzwhmgid_Desc() { regOBD("ZZWHMGID"); return this; }

    protected ConditionValue _tscpnm;
    public ConditionValue xdfgetTscpnm()
    { if (_tscpnm == null) { _tscpnm = nCV(); }
      return _tscpnm; }
    protected ConditionValue xgetCValueTscpnm() { return xdfgetTscpnm(); }

    /**
     * Add order-by as ascend. <br>
     * TSCPNM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Tscpnm_Asc() { regOBA("TSCPNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSCPNM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Tscpnm_Desc() { regOBD("TSCPNM"); return this; }

    protected ConditionValue _depcd;
    public ConditionValue xdfgetDepcd()
    { if (_depcd == null) { _depcd = nCV(); }
      return _depcd; }
    protected ConditionValue xgetCValueDepcd() { return xdfgetDepcd(); }

    /**
     * Add order-by as ascend. <br>
     * DEPCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Depcd_Asc() { regOBA("DEPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Depcd_Desc() { regOBD("DEPCD"); return this; }

    protected ConditionValue _cnlid;
    public ConditionValue xdfgetCnlid()
    { if (_cnlid == null) { _cnlid = nCV(); }
      return _cnlid; }
    protected ConditionValue xgetCValueCnlid() { return xdfgetCnlid(); }

    /**
     * Add order-by as ascend. <br>
     * CNLID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Cnlid_Asc() { regOBA("CNLID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CNLID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Cnlid_Desc() { regOBD("CNLID"); return this; }

    protected ConditionValue _otrnk;
    public ConditionValue xdfgetOtrnk()
    { if (_otrnk == null) { _otrnk = nCV(); }
      return _otrnk; }
    protected ConditionValue xgetCValueOtrnk() { return xdfgetOtrnk(); }

    /**
     * Add order-by as ascend. <br>
     * OTRNK: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Otrnk_Asc() { regOBA("OTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTRNK: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Otrnk_Desc() { regOBD("OTRNK"); return this; }

    protected ConditionValue _orattid1;
    public ConditionValue xdfgetOrattid1()
    { if (_orattid1 == null) { _orattid1 = nCV(); }
      return _orattid1; }
    protected ConditionValue xgetCValueOrattid1() { return xdfgetOrattid1(); }

    /**
     * Add order-by as ascend. <br>
     * ORATTID1: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orattid1_Asc() { regOBA("ORATTID1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORATTID1: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orattid1_Desc() { regOBD("ORATTID1"); return this; }

    protected ConditionValue _orattid2;
    public ConditionValue xdfgetOrattid2()
    { if (_orattid2 == null) { _orattid2 = nCV(); }
      return _orattid2; }
    protected ConditionValue xgetCValueOrattid2() { return xdfgetOrattid2(); }

    /**
     * Add order-by as ascend. <br>
     * ORATTID2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orattid2_Asc() { regOBA("ORATTID2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORATTID2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orattid2_Desc() { regOBD("ORATTID2"); return this; }

    protected ConditionValue _orattid3;
    public ConditionValue xdfgetOrattid3()
    { if (_orattid3 == null) { _orattid3 = nCV(); }
      return _orattid3; }
    protected ConditionValue xgetCValueOrattid3() { return xdfgetOrattid3(); }

    /**
     * Add order-by as ascend. <br>
     * ORATTID3: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orattid3_Asc() { regOBA("ORATTID3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORATTID3: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orattid3_Desc() { regOBD("ORATTID3"); return this; }

    protected ConditionValue _attid1;
    public ConditionValue xdfgetAttid1()
    { if (_attid1 == null) { _attid1 = nCV(); }
      return _attid1; }
    protected ConditionValue xgetCValueAttid1() { return xdfgetAttid1(); }

    /**
     * Add order-by as ascend. <br>
     * ATTID1: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Attid1_Asc() { regOBA("ATTID1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTID1: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Attid1_Desc() { regOBD("ATTID1"); return this; }

    protected ConditionValue _attid2;
    public ConditionValue xdfgetAttid2()
    { if (_attid2 == null) { _attid2 = nCV(); }
      return _attid2; }
    protected ConditionValue xgetCValueAttid2() { return xdfgetAttid2(); }

    /**
     * Add order-by as ascend. <br>
     * ATTID2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Attid2_Asc() { regOBA("ATTID2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTID2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Attid2_Desc() { regOBD("ATTID2"); return this; }

    protected ConditionValue _attid3;
    public ConditionValue xdfgetAttid3()
    { if (_attid3 == null) { _attid3 = nCV(); }
      return _attid3; }
    protected ConditionValue xgetCValueAttid3() { return xdfgetAttid3(); }

    /**
     * Add order-by as ascend. <br>
     * ATTID3: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Attid3_Asc() { regOBA("ATTID3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTID3: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Attid3_Desc() { regOBD("ATTID3"); return this; }

    protected ConditionValue _orattid4;
    public ConditionValue xdfgetOrattid4()
    { if (_orattid4 == null) { _orattid4 = nCV(); }
      return _orattid4; }
    protected ConditionValue xgetCValueOrattid4() { return xdfgetOrattid4(); }

    /**
     * Add order-by as ascend. <br>
     * ORATTID4: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orattid4_Asc() { regOBA("ORATTID4"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORATTID4: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Orattid4_Desc() { regOBD("ORATTID4"); return this; }

    protected ConditionValue _bsdid;
    public ConditionValue xdfgetBsdid()
    { if (_bsdid == null) { _bsdid = nCV(); }
      return _bsdid; }
    protected ConditionValue xgetCValueBsdid() { return xdfgetBsdid(); }

    /**
     * Add order-by as ascend. <br>
     * BSDID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Bsdid_Asc() { regOBA("BSDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BSDID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Bsdid_Desc() { regOBD("BSDID"); return this; }

    protected ConditionValue _rpbcd;
    public ConditionValue xdfgetRpbcd()
    { if (_rpbcd == null) { _rpbcd = nCV(); }
      return _rpbcd; }
    protected ConditionValue xgetCValueRpbcd() { return xdfgetRpbcd(); }

    /**
     * Add order-by as ascend. <br>
     * RPBCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Rpbcd_Asc() { regOBA("RPBCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RPBCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Rpbcd_Desc() { regOBD("RPBCD"); return this; }

    protected ConditionValue _fauorgcd;
    public ConditionValue xdfgetFauorgcd()
    { if (_fauorgcd == null) { _fauorgcd = nCV(); }
      return _fauorgcd; }
    protected ConditionValue xgetCValueFauorgcd() { return xdfgetFauorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * FAUORGCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Fauorgcd_Asc() { regOBA("FAUORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAUORGCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Fauorgcd_Desc() { regOBD("FAUORGCD"); return this; }

    protected ConditionValue _auorgcd;
    public ConditionValue xdfgetAuorgcd()
    { if (_auorgcd == null) { _auorgcd = nCV(); }
      return _auorgcd; }
    protected ConditionValue xgetCValueAuorgcd() { return xdfgetAuorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * AUORGCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Auorgcd_Asc() { regOBA("AUORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUORGCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Auorgcd_Desc() { regOBD("AUORGCD"); return this; }

    protected ConditionValue _cstctcd;
    public ConditionValue xdfgetCstctcd()
    { if (_cstctcd == null) { _cstctcd = nCV(); }
      return _cstctcd; }
    protected ConditionValue xgetCValueCstctcd() { return xdfgetCstctcd(); }

    /**
     * Add order-by as ascend. <br>
     * CSTCTCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Cstctcd_Asc() { regOBA("CSTCTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSTCTCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Cstctcd_Desc() { regOBD("CSTCTCD"); return this; }

    protected ConditionValue _bizarcd;
    public ConditionValue xdfgetBizarcd()
    { if (_bizarcd == null) { _bizarcd = nCV(); }
      return _bizarcd; }
    protected ConditionValue xgetCValueBizarcd() { return xdfgetBizarcd(); }

    /**
     * Add order-by as ascend. <br>
     * BIZARCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Bizarcd_Asc() { regOBA("BIZARCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BIZARCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Bizarcd_Desc() { regOBD("BIZARCD"); return this; }

    protected ConditionValue _fwctcd;
    public ConditionValue xdfgetFwctcd()
    { if (_fwctcd == null) { _fwctcd = nCV(); }
      return _fwctcd; }
    protected ConditionValue xgetCValueFwctcd() { return xdfgetFwctcd(); }

    /**
     * Add order-by as ascend. <br>
     * FWCTCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Fwctcd_Asc() { regOBA("FWCTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FWCTCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Fwctcd_Desc() { regOBD("FWCTCD"); return this; }

    protected ConditionValue _rdvdid;
    public ConditionValue xdfgetRdvdid()
    { if (_rdvdid == null) { _rdvdid = nCV(); }
      return _rdvdid; }
    protected ConditionValue xgetCValueRdvdid() { return xdfgetRdvdid(); }

    /**
     * Add order-by as ascend. <br>
     * RDVDID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Rdvdid_Asc() { regOBA("RDVDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RDVDID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Rdvdid_Desc() { regOBD("RDVDID"); return this; }

    protected ConditionValue _zzablymd;
    public ConditionValue xdfgetZzablymd()
    { if (_zzablymd == null) { _zzablymd = nCV(); }
      return _zzablymd; }
    protected ConditionValue xgetCValueZzablymd() { return xdfgetZzablymd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZABLYMD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzablymd_Asc() { regOBA("ZZABLYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZABLYMD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzablymd_Desc() { regOBD("ZZABLYMD"); return this; }

    protected ConditionValue _bptnid;
    public ConditionValue xdfgetBptnid()
    { if (_bptnid == null) { _bptnid = nCV(); }
      return _bptnid; }
    protected ConditionValue xgetCValueBptnid() { return xdfgetBptnid(); }

    /**
     * Add order-by as ascend. <br>
     * BPTNID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Bptnid_Asc() { regOBA("BPTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BPTNID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Bptnid_Desc() { regOBD("BPTNID"); return this; }

    protected ConditionValue _snkhg;
    public ConditionValue xdfgetSnkhg()
    { if (_snkhg == null) { _snkhg = nCV(); }
      return _snkhg; }
    protected ConditionValue xgetCValueSnkhg() { return xdfgetSnkhg(); }

    /**
     * Add order-by as ascend. <br>
     * SNKHG: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Snkhg_Asc() { regOBA("SNKHG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNKHG: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Snkhg_Desc() { regOBD("SNKHG"); return this; }

    protected ConditionValue _txcansfg;
    public ConditionValue xdfgetTxcansfg()
    { if (_txcansfg == null) { _txcansfg = nCV(); }
      return _txcansfg; }
    protected ConditionValue xgetCValueTxcansfg() { return xdfgetTxcansfg(); }

    /**
     * Add order-by as ascend. <br>
     * TXCANSFG: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Txcansfg_Asc() { regOBA("TXCANSFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TXCANSFG: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Txcansfg_Desc() { regOBD("TXCANSFG"); return this; }

    protected ConditionValue _csnpt;
    public ConditionValue xdfgetCsnpt()
    { if (_csnpt == null) { _csnpt = nCV(); }
      return _csnpt; }
    protected ConditionValue xgetCValueCsnpt() { return xdfgetCsnpt(); }

    /**
     * Add order-by as ascend. <br>
     * CSNPT: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Csnpt_Asc() { regOBA("CSNPT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSNPT: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Csnpt_Desc() { regOBD("CSNPT"); return this; }

    protected ConditionValue _tbsocstm;
    public ConditionValue xdfgetTbsocstm()
    { if (_tbsocstm == null) { _tbsocstm = nCV(); }
      return _tbsocstm; }
    protected ConditionValue xgetCValueTbsocstm() { return xdfgetTbsocstm(); }

    /**
     * Add order-by as ascend. <br>
     * TBSOCSTM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Tbsocstm_Asc() { regOBA("TBSOCSTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TBSOCSTM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Tbsocstm_Desc() { regOBD("TBSOCSTM"); return this; }

    protected ConditionValue _odtscd;
    public ConditionValue xdfgetOdtscd()
    { if (_odtscd == null) { _odtscd = nCV(); }
      return _odtscd; }
    protected ConditionValue xgetCValueOdtscd() { return xdfgetOdtscd(); }

    /**
     * Add order-by as ascend. <br>
     * ODTSCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Odtscd_Asc() { regOBA("ODTSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ODTSCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Odtscd_Desc() { regOBD("ODTSCD"); return this; }

    protected ConditionValue _lnarcd;
    public ConditionValue xdfgetLnarcd()
    { if (_lnarcd == null) { _lnarcd = nCV(); }
      return _lnarcd; }
    protected ConditionValue xgetCValueLnarcd() { return xdfgetLnarcd(); }

    /**
     * Add order-by as ascend. <br>
     * LNARCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Lnarcd_Asc() { regOBA("LNARCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LNARCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Lnarcd_Desc() { regOBD("LNARCD"); return this; }

    protected ConditionValue _sasasid;
    public ConditionValue xdfgetSasasid()
    { if (_sasasid == null) { _sasasid = nCV(); }
      return _sasasid; }
    protected ConditionValue xgetCValueSasasid() { return xdfgetSasasid(); }

    /**
     * Add order-by as ascend. <br>
     * SASASID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Sasasid_Asc() { regOBA("SASASID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SASASID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Sasasid_Desc() { regOBD("SASASID"); return this; }

    protected ConditionValue _cmlrasid;
    public ConditionValue xdfgetCmlrasid()
    { if (_cmlrasid == null) { _cmlrasid = nCV(); }
      return _cmlrasid; }
    protected ConditionValue xgetCValueCmlrasid() { return xdfgetCmlrasid(); }

    /**
     * Add order-by as ascend. <br>
     * CMLRASID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Cmlrasid_Asc() { regOBA("CMLRASID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CMLRASID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Cmlrasid_Desc() { regOBD("CMLRASID"); return this; }

    protected ConditionValue _csoid;
    public ConditionValue xdfgetCsoid()
    { if (_csoid == null) { _csoid = nCV(); }
      return _csoid; }
    protected ConditionValue xgetCValueCsoid() { return xdfgetCsoid(); }

    /**
     * Add order-by as ascend. <br>
     * CSOID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Csoid_Asc() { regOBA("CSOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSOID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Csoid_Desc() { regOBD("CSOID"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Upmn_Asc() { regOBA("UPMN"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Upmn_Desc() { regOBD("UPMN"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Chngyd_Asc() { regOBA("CHNGYD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Chngyd_Desc() { regOBD("CHNGYD"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Updtm_Asc() { regOBA("UPDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDTM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Updtm_Desc() { regOBD("UPDTM"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Updis_Asc() { regOBA("UPDIS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDIS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Updis_Desc() { regOBD("UPDIS"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Upbmn_Asc() { regOBA("UPBMN"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPBMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Upbmn_Desc() { regOBD("UPBMN"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Bchngyd_Asc() { regOBA("BCHNGYD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BCHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Bchngyd_Desc() { regOBD("BCHNGYD"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Bupdtm_Asc() { regOBA("BUPDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BUPDTM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Bupdtm_Desc() { regOBD("BUPDTM"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Upobmn_Asc() { regOBA("UPOBMN"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPOBMN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Upobmn_Desc() { regOBD("UPOBMN"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Obchngyd_Asc() { regOBA("OBCHNGYD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OBCHNGYD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Obchngyd_Desc() { regOBD("OBCHNGYD"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Obupdtm_Asc() { regOBA("OBUPDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * OBUPDTM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Obupdtm_Desc() { regOBD("OBUPDTM"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Zzfrdateh_Asc() { regOBA("ZZFRDATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZFRDATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zzfrdateh_Desc() { regOBD("ZZFRDATEH"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Zztodateh_Asc() { regOBA("ZZTODATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZTODATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Zztodateh_Desc() { regOBD("ZZTODATEH"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Rcdupdps_Asc() { regOBA("RCDUPDPS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCDUPDPS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Rcdupdps_Desc() { regOBD("RCDUPDPS"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Updusrid_Asc() { regOBA("UPDUSRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDUSRID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Updusrid_Desc() { regOBD("UPDUSRID"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Updpocd_Asc() { regOBA("UPDPOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDPOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Updpocd_Desc() { regOBD("UPDPOCD"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Otcmpfg_Asc() { regOBA("OTCMPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTCMPFG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Otcmpfg_Desc() { regOBD("OTCMPFG"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Tmcmpfg_Asc() { regOBA("TMCMPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TMCMPFG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Tmcmpfg_Desc() { regOBD("TMCMPFG"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_Stmid_Asc() { regOBA("STMID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STMID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_Stmid_Desc() { regOBD("STMID"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsETsnMfcompanyCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETsnMfcompanyCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsETsnMfcompanyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsETsnMfcompanyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ETsnMfcompanyCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ETsnMfcompanyCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ETsnMfcompanyCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ETsnMfcompanyCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ETsnMfcompanyCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ETsnMfcompanyCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ETsnMfcompanyCQ> _myselfExistsMap;
    public Map<String, ETsnMfcompanyCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ETsnMfcompanyCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ETsnMfcompanyCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ETsnMfcompanyCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ETsnMfcompanyCB.class.getName(); }
    protected String xCQ() { return ETsnMfcompanyCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
