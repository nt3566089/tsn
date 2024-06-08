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
 * The base condition-query of T_CSRWHADM.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCsrwhadmCQ extends AbstractBsTCsrwhadmCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCsrwhadmCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCsrwhadmCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CSRWHADM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCsrwhadmCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCsrwhadmCIQ xcreateCIQ() {
        TCsrwhadmCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCsrwhadmCIQ xnewCIQ() {
        return new TCsrwhadmCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CSRWHADM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCsrwhadmCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCsrwhadmCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sortPlaceManageId;
    public ConditionValue xdfgetSortPlaceManageId()
    { if (_sortPlaceManageId == null) { _sortPlaceManageId = nCV(); }
      return _sortPlaceManageId; }
    protected ConditionValue xgetCValueSortPlaceManageId() { return xdfgetSortPlaceManageId(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_SortPlaceManageId_Asc() { regOBA("SORT_PLACE_MANAGE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_SortPlaceManageId_Desc() { regOBD("SORT_PLACE_MANAGE_ID"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

    protected ConditionValue _srymd;
    public ConditionValue xdfgetSrymd()
    { if (_srymd == null) { _srymd = nCV(); }
      return _srymd; }
    protected ConditionValue xgetCValueSrymd() { return xdfgetSrymd(); }

    /**
     * Add order-by as ascend. <br>
     * SRYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Srymd_Asc() { regOBA("SRYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Srymd_Desc() { regOBD("SRYMD"); return this; }

    protected ConditionValue _sroprtcnt;
    public ConditionValue xdfgetSroprtcnt()
    { if (_sroprtcnt == null) { _sroprtcnt = nCV(); }
      return _sroprtcnt; }
    protected ConditionValue xgetCValueSroprtcnt() { return xdfgetSroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _presplcnt;
    public ConditionValue xdfgetPresplcnt()
    { if (_presplcnt == null) { _presplcnt = nCV(); }
      return _presplcnt; }
    protected ConditionValue xgetCValuePresplcnt() { return xdfgetPresplcnt(); }

    /**
     * Add order-by as ascend. <br>
     * PRESPLCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Presplcnt_Asc() { regOBA("PRESPLCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRESPLCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Presplcnt_Desc() { regOBD("PRESPLCNT"); return this; }

    protected ConditionValue _srpmtfg;
    public ConditionValue xdfgetSrpmtfg()
    { if (_srpmtfg == null) { _srpmtfg = nCV(); }
      return _srpmtfg; }
    protected ConditionValue xgetCValueSrpmtfg() { return xdfgetSrpmtfg(); }

    /**
     * Add order-by as ascend. <br>
     * SRPMTFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Srpmtfg_Asc() { regOBA("SRPMTFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRPMTFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Srpmtfg_Desc() { regOBD("SRPMTFG"); return this; }

    protected ConditionValue _mntpmtfg;
    public ConditionValue xdfgetMntpmtfg()
    { if (_mntpmtfg == null) { _mntpmtfg = nCV(); }
      return _mntpmtfg; }
    protected ConditionValue xgetCValueMntpmtfg() { return xdfgetMntpmtfg(); }

    /**
     * Add order-by as ascend. <br>
     * MNTPMTFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Mntpmtfg_Asc() { regOBA("MNTPMTFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MNTPMTFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Mntpmtfg_Desc() { regOBD("MNTPMTFG"); return this; }

    protected ConditionValue _cordrcvcnt;
    public ConditionValue xdfgetCordrcvcnt()
    { if (_cordrcvcnt == null) { _cordrcvcnt = nCV(); }
      return _cordrcvcnt; }
    protected ConditionValue xgetCValueCordrcvcnt() { return xdfgetCordrcvcnt(); }

    /**
     * Add order-by as ascend. <br>
     * CORDRCVCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Cordrcvcnt_Asc() { regOBA("CORDRCVCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CORDRCVCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Cordrcvcnt_Desc() { regOBD("CORDRCVCNT"); return this; }

    protected ConditionValue _refvalue;
    public ConditionValue xdfgetRefvalue()
    { if (_refvalue == null) { _refvalue = nCV(); }
      return _refvalue; }
    protected ConditionValue xgetCValueRefvalue() { return xdfgetRefvalue(); }

    /**
     * Add order-by as ascend. <br>
     * REFVALUE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Refvalue_Asc() { regOBA("REFVALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFVALUE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Refvalue_Desc() { regOBD("REFVALUE"); return this; }

    protected ConditionValue _sftpclmgn;
    public ConditionValue xdfgetSftpclmgn()
    { if (_sftpclmgn == null) { _sftpclmgn = nCV(); }
      return _sftpclmgn; }
    protected ConditionValue xgetCValueSftpclmgn() { return xdfgetSftpclmgn(); }

    /**
     * Add order-by as ascend. <br>
     * SFTPCLMGN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Sftpclmgn_Asc() { regOBA("SFTPCLMGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFTPCLMGN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Sftpclmgn_Desc() { regOBD("SFTPCLMGN"); return this; }

    protected ConditionValue _tdayesrcompfg;
    public ConditionValue xdfgetTdayesrcompfg()
    { if (_tdayesrcompfg == null) { _tdayesrcompfg = nCV(); }
      return _tdayesrcompfg; }
    protected ConditionValue xgetCValueTdayesrcompfg() { return xdfgetTdayesrcompfg(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Tdayesrcompfg_Asc() { regOBA("TDAYESRCOMPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYESRCOMPFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Tdayesrcompfg_Desc() { regOBD("TDAYESRCOMPFG"); return this; }

    protected ConditionValue _locidfrnk;
    public ConditionValue xdfgetLocidfrnk()
    { if (_locidfrnk == null) { _locidfrnk = nCV(); }
      return _locidfrnk; }
    protected ConditionValue xgetCValueLocidfrnk() { return xdfgetLocidfrnk(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFRNK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfrnk_Asc() { regOBA("LOCIDFRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFRNK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfrnk_Desc() { regOBD("LOCIDFRNK"); return this; }

    protected ConditionValue _locidfbrctg1;
    public ConditionValue xdfgetLocidfbrctg1()
    { if (_locidfbrctg1 == null) { _locidfbrctg1 = nCV(); }
      return _locidfbrctg1; }
    protected ConditionValue xgetCValueLocidfbrctg1() { return xdfgetLocidfbrctg1(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg1_Asc() { regOBA("LOCIDFBRCTG1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg1_Desc() { regOBD("LOCIDFBRCTG1"); return this; }

    protected ConditionValue _locidfbrctg2;
    public ConditionValue xdfgetLocidfbrctg2()
    { if (_locidfbrctg2 == null) { _locidfbrctg2 = nCV(); }
      return _locidfbrctg2; }
    protected ConditionValue xgetCValueLocidfbrctg2() { return xdfgetLocidfbrctg2(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg2_Asc() { regOBA("LOCIDFBRCTG2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg2_Desc() { regOBD("LOCIDFBRCTG2"); return this; }

    protected ConditionValue _locidfbrctg3;
    public ConditionValue xdfgetLocidfbrctg3()
    { if (_locidfbrctg3 == null) { _locidfbrctg3 = nCV(); }
      return _locidfbrctg3; }
    protected ConditionValue xgetCValueLocidfbrctg3() { return xdfgetLocidfbrctg3(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg3_Asc() { regOBA("LOCIDFBRCTG3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg3_Desc() { regOBD("LOCIDFBRCTG3"); return this; }

    protected ConditionValue _locidfbrctg4;
    public ConditionValue xdfgetLocidfbrctg4()
    { if (_locidfbrctg4 == null) { _locidfbrctg4 = nCV(); }
      return _locidfbrctg4; }
    protected ConditionValue xgetCValueLocidfbrctg4() { return xdfgetLocidfbrctg4(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg4_Asc() { regOBA("LOCIDFBRCTG4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg4_Desc() { regOBD("LOCIDFBRCTG4"); return this; }

    protected ConditionValue _locidfbrctg5;
    public ConditionValue xdfgetLocidfbrctg5()
    { if (_locidfbrctg5 == null) { _locidfbrctg5 = nCV(); }
      return _locidfbrctg5; }
    protected ConditionValue xgetCValueLocidfbrctg5() { return xdfgetLocidfbrctg5(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg5_Asc() { regOBA("LOCIDFBRCTG5"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg5_Desc() { regOBD("LOCIDFBRCTG5"); return this; }

    protected ConditionValue _locidfbrctg6;
    public ConditionValue xdfgetLocidfbrctg6()
    { if (_locidfbrctg6 == null) { _locidfbrctg6 = nCV(); }
      return _locidfbrctg6; }
    protected ConditionValue xgetCValueLocidfbrctg6() { return xdfgetLocidfbrctg6(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg6_Asc() { regOBA("LOCIDFBRCTG6"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg6_Desc() { regOBD("LOCIDFBRCTG6"); return this; }

    protected ConditionValue _locidfbrctg7;
    public ConditionValue xdfgetLocidfbrctg7()
    { if (_locidfbrctg7 == null) { _locidfbrctg7 = nCV(); }
      return _locidfbrctg7; }
    protected ConditionValue xgetCValueLocidfbrctg7() { return xdfgetLocidfbrctg7(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg7_Asc() { regOBA("LOCIDFBRCTG7"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg7_Desc() { regOBD("LOCIDFBRCTG7"); return this; }

    protected ConditionValue _locidfbrctg8;
    public ConditionValue xdfgetLocidfbrctg8()
    { if (_locidfbrctg8 == null) { _locidfbrctg8 = nCV(); }
      return _locidfbrctg8; }
    protected ConditionValue xgetCValueLocidfbrctg8() { return xdfgetLocidfbrctg8(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg8_Asc() { regOBA("LOCIDFBRCTG8"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg8_Desc() { regOBD("LOCIDFBRCTG8"); return this; }

    protected ConditionValue _locidfbrctg9;
    public ConditionValue xdfgetLocidfbrctg9()
    { if (_locidfbrctg9 == null) { _locidfbrctg9 = nCV(); }
      return _locidfbrctg9; }
    protected ConditionValue xgetCValueLocidfbrctg9() { return xdfgetLocidfbrctg9(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg9_Asc() { regOBA("LOCIDFBRCTG9"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg9_Desc() { regOBD("LOCIDFBRCTG9"); return this; }

    protected ConditionValue _locidfbrctg10;
    public ConditionValue xdfgetLocidfbrctg10()
    { if (_locidfbrctg10 == null) { _locidfbrctg10 = nCV(); }
      return _locidfbrctg10; }
    protected ConditionValue xgetCValueLocidfbrctg10() { return xdfgetLocidfbrctg10(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg10_Asc() { regOBA("LOCIDFBRCTG10"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_Locidfbrctg10_Desc() { regOBD("LOCIDFBRCTG10"); return this; }

    protected ConditionValue _sortingFlg;
    public ConditionValue xdfgetSortingFlg()
    { if (_sortingFlg == null) { _sortingFlg = nCV(); }
      return _sortingFlg; }
    protected ConditionValue xgetCValueSortingFlg() { return xdfgetSortingFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SORTING_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_SortingFlg_Asc() { regOBA("SORTING_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTING_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_SortingFlg_Desc() { regOBD("SORTING_FLG"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCsrwhadmCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCsrwhadmCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCsrwhadmCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCsrwhadmCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TCsrwhadmCQ bq = (TCsrwhadmCQ)bqs;
        TCsrwhadmCQ uq = (TCsrwhadmCQ)uqs;
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
        String nrp = xresolveNRP("T_CSRWHADM", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TCsrwhadmCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCsrwhadmCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCsrwhadmCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCsrwhadmCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCsrwhadmCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCsrwhadmCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCsrwhadmCQ> _myselfExistsMap;
    public Map<String, TCsrwhadmCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCsrwhadmCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCsrwhadmCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCsrwhadmCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCsrwhadmCB.class.getName(); }
    protected String xCQ() { return TCsrwhadmCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
