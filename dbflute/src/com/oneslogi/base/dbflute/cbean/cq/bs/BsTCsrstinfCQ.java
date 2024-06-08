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
 * The base condition-query of T_CSRSTINF.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCsrstinfCQ extends AbstractBsTCsrstinfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCsrstinfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCsrstinfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CSRSTINF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCsrstinfCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCsrstinfCIQ xcreateCIQ() {
        TCsrstinfCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCsrstinfCIQ xnewCIQ() {
        return new TCsrstinfCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CSRSTINF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCsrstinfCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCsrstinfCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sortStatisticsInfoId;
    public ConditionValue xdfgetSortStatisticsInfoId()
    { if (_sortStatisticsInfoId == null) { _sortStatisticsInfoId = nCV(); }
      return _sortStatisticsInfoId; }
    protected ConditionValue xgetCValueSortStatisticsInfoId() { return xdfgetSortStatisticsInfoId(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_SortStatisticsInfoId_Asc() { regOBA("SORT_STATISTICS_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_SortStatisticsInfoId_Desc() { regOBD("SORT_STATISTICS_INFO_ID"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_Sroprtymd_Asc() { regOBA("SROPRTYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sroprtymd_Desc() { regOBD("SROPRTYMD"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_Linblk_Asc() { regOBA("LINBLK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Linblk_Desc() { regOBD("LINBLK"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

    protected ConditionValue _pstnid;
    public ConditionValue xdfgetPstnid()
    { if (_pstnid == null) { _pstnid = nCV(); }
      return _pstnid; }
    protected ConditionValue xgetCValuePstnid() { return xdfgetPstnid(); }

    /**
     * Add order-by as ascend. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

    protected ConditionValue _srlincd;
    public ConditionValue xdfgetSrlincd()
    { if (_srlincd == null) { _srlincd = nCV(); }
      return _srlincd; }
    protected ConditionValue xgetCValueSrlincd() { return xdfgetSrlincd(); }

    /**
     * Add order-by as ascend. <br>
     * SRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Srlincd_Asc() { regOBA("SRLINCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Srlincd_Desc() { regOBD("SRLINCD"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

    protected ConditionValue _srpat;
    public ConditionValue xdfgetSrpat()
    { if (_srpat == null) { _srpat = nCV(); }
      return _srpat; }
    protected ConditionValue xgetCValueSrpat() { return xdfgetSrpat(); }

    /**
     * Add order-by as ascend. <br>
     * SRPAT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Srpat_Asc() { regOBA("SRPAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRPAT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Srpat_Desc() { regOBD("SRPAT"); return this; }

    protected ConditionValue _ttbrqa;
    public ConditionValue xdfgetTtbrqa()
    { if (_ttbrqa == null) { _ttbrqa = nCV(); }
      return _ttbrqa; }
    protected ConditionValue xgetCValueTtbrqa() { return xdfgetTtbrqa(); }

    /**
     * Add order-by as ascend. <br>
     * TTBRQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Ttbrqa_Asc() { regOBA("TTBRQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTBRQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Ttbrqa_Desc() { regOBD("TTBRQA"); return this; }

    protected ConditionValue _shpqa;
    public ConditionValue xdfgetShpqa()
    { if (_shpqa == null) { _shpqa = nCV(); }
      return _shpqa; }
    protected ConditionValue xgetCValueShpqa() { return xdfgetShpqa(); }

    /**
     * Add order-by as ascend. <br>
     * SHPQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Shpqa_Asc() { regOBA("SHPQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHPQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Shpqa_Desc() { regOBD("SHPQA"); return this; }

    protected ConditionValue _sprqasftpcl;
    public ConditionValue xdfgetSprqasftpcl()
    { if (_sprqasftpcl == null) { _sprqasftpcl = nCV(); }
      return _sprqasftpcl; }
    protected ConditionValue xgetCValueSprqasftpcl() { return xdfgetSprqasftpcl(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqasftpcl_Asc() { regOBA("SPRQASFTPCL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQASFTPCL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqasftpcl_Desc() { regOBD("SPRQASFTPCL"); return this; }

    protected ConditionValue _sprqatsnbox;
    public ConditionValue xdfgetSprqatsnbox()
    { if (_sprqatsnbox == null) { _sprqatsnbox = nCV(); }
      return _sprqatsnbox; }
    protected ConditionValue xgetCValueSprqatsnbox() { return xdfgetSprqatsnbox(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqatsnbox_Asc() { regOBA("SPRQATSNBOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQATSNBOX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqatsnbox_Desc() { regOBD("SPRQATSNBOX"); return this; }

    protected ConditionValue _sprqajtbox;
    public ConditionValue xdfgetSprqajtbox()
    { if (_sprqajtbox == null) { _sprqajtbox = nCV(); }
      return _sprqajtbox; }
    protected ConditionValue xgetCValueSprqajtbox() { return xdfgetSprqajtbox(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqajtbox_Asc() { regOBA("SPRQAJTBOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAJTBOX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqajtbox_Desc() { regOBD("SPRQAJTBOX"); return this; }

    protected ConditionValue _sprqa100box;
    public ConditionValue xdfgetSprqa100box()
    { if (_sprqa100box == null) { _sprqa100box = nCV(); }
      return _sprqa100box; }
    protected ConditionValue xgetCValueSprqa100box() { return xdfgetSprqa100box(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQA100BOX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqa100box_Asc() { regOBA("SPRQA100BOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQA100BOX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqa100box_Desc() { regOBD("SPRQA100BOX"); return this; }

    protected ConditionValue _sprqahl;
    public ConditionValue xdfgetSprqahl()
    { if (_sprqahl == null) { _sprqahl = nCV(); }
      return _sprqahl; }
    protected ConditionValue xgetCValueSprqahl() { return xdfgetSprqahl(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAHL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqahl_Asc() { regOBA("SPRQAHL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAHL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqahl_Desc() { regOBD("SPRQAHL"); return this; }

    protected ConditionValue _sprqaful;
    public ConditionValue xdfgetSprqaful()
    { if (_sprqaful == null) { _sprqaful = nCV(); }
      return _sprqaful; }
    protected ConditionValue xgetCValueSprqaful() { return xdfgetSprqaful(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAFUL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqaful_Asc() { regOBA("SPRQAFUL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAFUL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqaful_Desc() { regOBD("SPRQAFUL"); return this; }

    protected ConditionValue _sprqahlbgbox;
    public ConditionValue xdfgetSprqahlbgbox()
    { if (_sprqahlbgbox == null) { _sprqahlbgbox = nCV(); }
      return _sprqahlbgbox; }
    protected ConditionValue xgetCValueSprqahlbgbox() { return xdfgetSprqahlbgbox(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqahlbgbox_Asc() { regOBA("SPRQAHLBGBOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqahlbgbox_Desc() { regOBD("SPRQAHLBGBOX"); return this; }

    protected ConditionValue _sprqahl12box;
    public ConditionValue xdfgetSprqahl12box()
    { if (_sprqahl12box == null) { _sprqahl12box = nCV(); }
      return _sprqahl12box; }
    protected ConditionValue xgetCValueSprqahl12box() { return xdfgetSprqahl12box(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqahl12box_Asc() { regOBA("SPRQAHL12BOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqahl12box_Desc() { regOBD("SPRQAHL12BOX"); return this; }

    protected ConditionValue _sprqahl5box;
    public ConditionValue xdfgetSprqahl5box()
    { if (_sprqahl5box == null) { _sprqahl5box = nCV(); }
      return _sprqahl5box; }
    protected ConditionValue xgetCValueSprqahl5box() { return xdfgetSprqahl5box(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqahl5box_Asc() { regOBA("SPRQAHL5BOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_Sprqahl5box_Desc() { regOBD("SPRQAHL5BOX"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCsrstinfCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCsrstinfCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCsrstinfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCsrstinfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TCsrstinfCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCsrstinfCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCsrstinfCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCsrstinfCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCsrstinfCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCsrstinfCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCsrstinfCQ> _myselfExistsMap;
    public Map<String, TCsrstinfCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCsrstinfCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCsrstinfCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCsrstinfCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCsrstinfCB.class.getName(); }
    protected String xCQ() { return TCsrstinfCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
