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
 * The base condition-query of M_CBLK.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCblkCQ extends AbstractBsMCblkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCblkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCblkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CBLK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCblkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCblkCIQ xcreateCIQ() {
        MCblkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCblkCIQ xnewCIQ() {
        return new MCblkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CBLK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCblkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCblkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cblkId;
    public ConditionValue xdfgetCblkId()
    { if (_cblkId == null) { _cblkId = nCV(); }
      return _cblkId; }
    protected ConditionValue xgetCValueCblkId() { return xdfgetCblkId(); }

    /**
     * Add order-by as ascend. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_CblkId_Asc() { regOBA("CBLK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_CblkId_Desc() { regOBD("CBLK_ID"); return this; }

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
    public BsMCblkCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _blkcd;
    public ConditionValue xdfgetBlkcd()
    { if (_blkcd == null) { _blkcd = nCV(); }
      return _blkcd; }
    protected ConditionValue xgetCValueBlkcd() { return xdfgetBlkcd(); }

    /**
     * Add order-by as ascend. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Blkcd_Asc() { regOBA("BLKCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLKCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Blkcd_Desc() { regOBD("BLKCD"); return this; }

    protected ConditionValue _blknm;
    public ConditionValue xdfgetBlknm()
    { if (_blknm == null) { _blknm = nCV(); }
      return _blknm; }
    protected ConditionValue xgetCValueBlknm() { return xdfgetBlknm(); }

    /**
     * Add order-by as ascend. <br>
     * BLKNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Blknm_Asc() { regOBA("BLKNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLKNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Blknm_Desc() { regOBD("BLKNM"); return this; }

    protected ConditionValue _srdtlmkfg;
    public ConditionValue xdfgetSrdtlmkfg()
    { if (_srdtlmkfg == null) { _srdtlmkfg = nCV(); }
      return _srdtlmkfg; }
    protected ConditionValue xgetCValueSrdtlmkfg() { return xdfgetSrdtlmkfg(); }

    /**
     * Add order-by as ascend. <br>
     * SRDTLMKFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Srdtlmkfg_Asc() { regOBA("SRDTLMKFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRDTLMKFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Srdtlmkfg_Desc() { regOBD("SRDTLMKFG"); return this; }

    protected ConditionValue _aminpfg;
    public ConditionValue xdfgetAminpfg()
    { if (_aminpfg == null) { _aminpfg = nCV(); }
      return _aminpfg; }
    protected ConditionValue xgetCValueAminpfg() { return xdfgetAminpfg(); }

    /**
     * Add order-by as ascend. <br>
     * AMINPFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Aminpfg_Asc() { regOBA("AMINPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * AMINPFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Aminpfg_Desc() { regOBD("AMINPFG"); return this; }

    protected ConditionValue _lblmkfg;
    public ConditionValue xdfgetLblmkfg()
    { if (_lblmkfg == null) { _lblmkfg = nCV(); }
      return _lblmkfg; }
    protected ConditionValue xgetCValueLblmkfg() { return xdfgetLblmkfg(); }

    /**
     * Add order-by as ascend. <br>
     * LBLMKFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Lblmkfg_Asc() { regOBA("LBLMKFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBLMKFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Lblmkfg_Desc() { regOBD("LBLMKFG"); return this; }

    protected ConditionValue _lbldfg;
    public ConditionValue xdfgetLbldfg()
    { if (_lbldfg == null) { _lbldfg = nCV(); }
      return _lbldfg; }
    protected ConditionValue xgetCValueLbldfg() { return xdfgetLbldfg(); }

    /**
     * Add order-by as ascend. <br>
     * LBLDFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Lbldfg_Asc() { regOBA("LBLDFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBLDFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Lbldfg_Desc() { regOBD("LBLDFG"); return this; }

    protected ConditionValue _bcddfg;
    public ConditionValue xdfgetBcddfg()
    { if (_bcddfg == null) { _bcddfg = nCV(); }
      return _bcddfg; }
    protected ConditionValue xgetCValueBcddfg() { return xdfgetBcddfg(); }

    /**
     * Add order-by as ascend. <br>
     * BCDDFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Bcddfg_Asc() { regOBA("BCDDFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * BCDDFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Bcddfg_Desc() { regOBD("BCDDFG"); return this; }

    protected ConditionValue _locidfrnk;
    public ConditionValue xdfgetLocidfrnk()
    { if (_locidfrnk == null) { _locidfrnk = nCV(); }
      return _locidfrnk; }
    protected ConditionValue xgetCValueLocidfrnk() { return xdfgetLocidfrnk(); }

    /**
     * Add order-by as ascend. <br>
     * LOCIDFRNK: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfrnk_Asc() { regOBA("LOCIDFRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFRNK: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfrnk_Desc() { regOBD("LOCIDFRNK"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg1_Asc() { regOBA("LOCIDFBRCTG1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg1_Desc() { regOBD("LOCIDFBRCTG1"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg2_Asc() { regOBA("LOCIDFBRCTG2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg2_Desc() { regOBD("LOCIDFBRCTG2"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg3_Asc() { regOBA("LOCIDFBRCTG3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg3_Desc() { regOBD("LOCIDFBRCTG3"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg4_Asc() { regOBA("LOCIDFBRCTG4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG4: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg4_Desc() { regOBD("LOCIDFBRCTG4"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg5_Asc() { regOBA("LOCIDFBRCTG5"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG5: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg5_Desc() { regOBD("LOCIDFBRCTG5"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg6_Asc() { regOBA("LOCIDFBRCTG6"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG6: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg6_Desc() { regOBD("LOCIDFBRCTG6"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg7_Asc() { regOBA("LOCIDFBRCTG7"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG7: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg7_Desc() { regOBD("LOCIDFBRCTG7"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg8_Asc() { regOBA("LOCIDFBRCTG8"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG8: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg8_Desc() { regOBD("LOCIDFBRCTG8"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg9_Asc() { regOBA("LOCIDFBRCTG9"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG9: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg9_Desc() { regOBD("LOCIDFBRCTG9"); return this; }

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
    public BsMCblkCQ addOrderBy_Locidfbrctg10_Asc() { regOBA("LOCIDFBRCTG10"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCIDFBRCTG10: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Locidfbrctg10_Desc() { regOBD("LOCIDFBRCTG10"); return this; }

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
    public BsMCblkCQ addOrderBy_Sftpclrsfid_Asc() { regOBA("SFTPCLRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFTPCLRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Sftpclrsfid_Desc() { regOBD("SFTPCLRSFID"); return this; }

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
    public BsMCblkCQ addOrderBy_Tsnboxrsfid_Asc() { regOBA("TSNBOXRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSNBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Tsnboxrsfid_Desc() { regOBD("TSNBOXRSFID"); return this; }

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
    public BsMCblkCQ addOrderBy_Jtboxrsfid_Asc() { regOBA("JTBOXRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Jtboxrsfid_Desc() { regOBD("JTBOXRSFID"); return this; }

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
    public BsMCblkCQ addOrderBy_Hdrdboxrsfid_Asc() { regOBA("HDRDBOXRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDRDBOXRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Hdrdboxrsfid_Desc() { regOBD("HDRDBOXRSFID"); return this; }

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
    public BsMCblkCQ addOrderBy_Odrdvrsfid_Asc() { regOBA("ODRDVRSFID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ODRDVRSFID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Odrdvrsfid_Desc() { regOBD("ODRDVRSFID"); return this; }

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
    public BsMCblkCQ addOrderBy_Pkgrt_Asc() { regOBA("PKGRT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PKGRT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Pkgrt_Desc() { regOBD("PKGRT"); return this; }

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
    public BsMCblkCQ addOrderBy_Sprprsid_Asc() { regOBA("SPRPRSID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRPRSID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_Sprprsid_Desc() { regOBD("SPRPRSID"); return this; }

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
    public BsMCblkCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCblkCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCblkCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCblkCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCblkCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCblkCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCblkCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCblkCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCblkCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCblkCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCblkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCblkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCblkCQ bq = (MCblkCQ)bqs;
        MCblkCQ uq = (MCblkCQ)uqs;
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
        String nrp = xresolveNRP("M_CBLK", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, MCblkCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCblkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCblkCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCblkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCblkCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCblkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCblkCQ> _myselfExistsMap;
    public Map<String, MCblkCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCblkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCblkCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCblkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCblkCB.class.getName(); }
    protected String xCQ() { return MCblkCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
