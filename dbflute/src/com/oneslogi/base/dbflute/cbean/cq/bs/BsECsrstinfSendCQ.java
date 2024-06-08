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
 * The base condition-query of E_CSRSTINF_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsECsrstinfSendCQ extends AbstractBsECsrstinfSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ECsrstinfSendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsECsrstinfSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_CSRSTINF_SEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ECsrstinfSendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ECsrstinfSendCIQ xcreateCIQ() {
        ECsrstinfSendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ECsrstinfSendCIQ xnewCIQ() {
        return new ECsrstinfSendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_CSRSTINF_SEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ECsrstinfSendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ECsrstinfSendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _csrstinfSendId;
    public ConditionValue xdfgetCsrstinfSendId()
    { if (_csrstinfSendId == null) { _csrstinfSendId = nCV(); }
      return _csrstinfSendId; }
    protected ConditionValue xgetCValueCsrstinfSendId() { return xdfgetCsrstinfSendId(); }

    /**
     * Add order-by as ascend. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_CsrstinfSendId_Asc() { regOBA("CSRSTINF_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_CsrstinfSendId_Desc() { regOBD("CSRSTINF_SEND_ID"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendRowCd;
    public ConditionValue xdfgetSendRowCd()
    { if (_sendRowCd == null) { _sendRowCd = nCV(); }
      return _sendRowCd; }
    protected ConditionValue xgetCValueSendRowCd() { return xdfgetSendRowCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_SendRowCd_Asc() { regOBA("SEND_ROW_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_SendRowCd_Desc() { regOBD("SEND_ROW_CD"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _sroprtymd;
    public ConditionValue xdfgetSroprtymd()
    { if (_sroprtymd == null) { _sroprtymd = nCV(); }
      return _sroprtymd; }
    protected ConditionValue xgetCValueSroprtymd() { return xdfgetSroprtymd(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sroprtymd_Asc() { regOBA("SROPRTYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sroprtymd_Desc() { regOBD("SROPRTYMD"); return this; }

    protected ConditionValue _sroprtcnt;
    public ConditionValue xdfgetSroprtcnt()
    { if (_sroprtcnt == null) { _sroprtcnt = nCV(); }
      return _sroprtcnt; }
    protected ConditionValue xgetCValueSroprtcnt() { return xdfgetSroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTCNT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _linblk;
    public ConditionValue xdfgetLinblk()
    { if (_linblk == null) { _linblk = nCV(); }
      return _linblk; }
    protected ConditionValue xgetCValueLinblk() { return xdfgetLinblk(); }

    /**
     * Add order-by as ascend. <br>
     * LINBLK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Linblk_Asc() { regOBA("LINBLK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Linblk_Desc() { regOBD("LINBLK"); return this; }

    protected ConditionValue _dlvymd;
    public ConditionValue xdfgetDlvymd()
    { if (_dlvymd == null) { _dlvymd = nCV(); }
      return _dlvymd; }
    protected ConditionValue xgetCValueDlvymd() { return xdfgetDlvymd(); }

    /**
     * Add order-by as ascend. <br>
     * DLVYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

    protected ConditionValue _dpcd;
    public ConditionValue xdfgetDpcd()
    { if (_dpcd == null) { _dpcd = nCV(); }
      return _dpcd; }
    protected ConditionValue xgetCValueDpcd() { return xdfgetDpcd(); }

    /**
     * Add order-by as ascend. <br>
     * DPCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

    protected ConditionValue _pstnid;
    public ConditionValue xdfgetPstnid()
    { if (_pstnid == null) { _pstnid = nCV(); }
      return _pstnid; }
    protected ConditionValue xgetCValuePstnid() { return xdfgetPstnid(); }

    /**
     * Add order-by as ascend. <br>
     * PSTNID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

    protected ConditionValue _srlincd;
    public ConditionValue xdfgetSrlincd()
    { if (_srlincd == null) { _srlincd = nCV(); }
      return _srlincd; }
    protected ConditionValue xgetCValueSrlincd() { return xdfgetSrlincd(); }

    /**
     * Add order-by as ascend. <br>
     * SRLINCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Srlincd_Asc() { regOBA("SRLINCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRLINCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Srlincd_Desc() { regOBD("SRLINCD"); return this; }

    protected ConditionValue _srrnk;
    public ConditionValue xdfgetSrrnk()
    { if (_srrnk == null) { _srrnk = nCV(); }
      return _srrnk; }
    protected ConditionValue xgetCValueSrrnk() { return xdfgetSrrnk(); }

    /**
     * Add order-by as ascend. <br>
     * SRRNK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

    protected ConditionValue _srpat;
    public ConditionValue xdfgetSrpat()
    { if (_srpat == null) { _srpat = nCV(); }
      return _srpat; }
    protected ConditionValue xgetCValueSrpat() { return xdfgetSrpat(); }

    /**
     * Add order-by as ascend. <br>
     * SRPAT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Srpat_Asc() { regOBA("SRPAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRPAT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Srpat_Desc() { regOBD("SRPAT"); return this; }

    protected ConditionValue _ttbrqa;
    public ConditionValue xdfgetTtbrqa()
    { if (_ttbrqa == null) { _ttbrqa = nCV(); }
      return _ttbrqa; }
    protected ConditionValue xgetCValueTtbrqa() { return xdfgetTtbrqa(); }

    /**
     * Add order-by as ascend. <br>
     * TTBRQA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Ttbrqa_Asc() { regOBA("TTBRQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTBRQA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Ttbrqa_Desc() { regOBD("TTBRQA"); return this; }

    protected ConditionValue _shpqa;
    public ConditionValue xdfgetShpqa()
    { if (_shpqa == null) { _shpqa = nCV(); }
      return _shpqa; }
    protected ConditionValue xgetCValueShpqa() { return xdfgetShpqa(); }

    /**
     * Add order-by as ascend. <br>
     * SHPQA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Shpqa_Asc() { regOBA("SHPQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHPQA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Shpqa_Desc() { regOBD("SHPQA"); return this; }

    protected ConditionValue _sprqasftpcl;
    public ConditionValue xdfgetSprqasftpcl()
    { if (_sprqasftpcl == null) { _sprqasftpcl = nCV(); }
      return _sprqasftpcl; }
    protected ConditionValue xgetCValueSprqasftpcl() { return xdfgetSprqasftpcl(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqasftpcl_Asc() { regOBA("SPRQASFTPCL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqasftpcl_Desc() { regOBD("SPRQASFTPCL"); return this; }

    protected ConditionValue _sprqatsnbox;
    public ConditionValue xdfgetSprqatsnbox()
    { if (_sprqatsnbox == null) { _sprqatsnbox = nCV(); }
      return _sprqatsnbox; }
    protected ConditionValue xgetCValueSprqatsnbox() { return xdfgetSprqatsnbox(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqatsnbox_Asc() { regOBA("SPRQATSNBOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqatsnbox_Desc() { regOBD("SPRQATSNBOX"); return this; }

    protected ConditionValue _sprqajtbox;
    public ConditionValue xdfgetSprqajtbox()
    { if (_sprqajtbox == null) { _sprqajtbox = nCV(); }
      return _sprqajtbox; }
    protected ConditionValue xgetCValueSprqajtbox() { return xdfgetSprqajtbox(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqajtbox_Asc() { regOBA("SPRQAJTBOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqajtbox_Desc() { regOBD("SPRQAJTBOX"); return this; }

    protected ConditionValue _sprqa100box;
    public ConditionValue xdfgetSprqa100box()
    { if (_sprqa100box == null) { _sprqa100box = nCV(); }
      return _sprqa100box; }
    protected ConditionValue xgetCValueSprqa100box() { return xdfgetSprqa100box(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQA100BOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqa100box_Asc() { regOBA("SPRQA100BOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQA100BOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqa100box_Desc() { regOBD("SPRQA100BOX"); return this; }

    protected ConditionValue _sprqahl;
    public ConditionValue xdfgetSprqahl()
    { if (_sprqahl == null) { _sprqahl = nCV(); }
      return _sprqahl; }
    protected ConditionValue xgetCValueSprqahl() { return xdfgetSprqahl(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAHL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqahl_Asc() { regOBA("SPRQAHL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAHL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqahl_Desc() { regOBD("SPRQAHL"); return this; }

    protected ConditionValue _sprqahlbgbox;
    public ConditionValue xdfgetSprqahlbgbox()
    { if (_sprqahlbgbox == null) { _sprqahlbgbox = nCV(); }
      return _sprqahlbgbox; }
    protected ConditionValue xgetCValueSprqahlbgbox() { return xdfgetSprqahlbgbox(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqahlbgbox_Asc() { regOBA("SPRQAHLBGBOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqahlbgbox_Desc() { regOBD("SPRQAHLBGBOX"); return this; }

    protected ConditionValue _sprqahl12box;
    public ConditionValue xdfgetSprqahl12box()
    { if (_sprqahl12box == null) { _sprqahl12box = nCV(); }
      return _sprqahl12box; }
    protected ConditionValue xgetCValueSprqahl12box() { return xdfgetSprqahl12box(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqahl12box_Asc() { regOBA("SPRQAHL12BOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqahl12box_Desc() { regOBD("SPRQAHL12BOX"); return this; }

    protected ConditionValue _sprqahl5box;
    public ConditionValue xdfgetSprqahl5box()
    { if (_sprqahl5box == null) { _sprqahl5box = nCV(); }
      return _sprqahl5box; }
    protected ConditionValue xgetCValueSprqahl5box() { return xdfgetSprqahl5box(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqahl5box_Asc() { regOBA("SPRQAHL5BOX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqahl5box_Desc() { regOBD("SPRQAHL5BOX"); return this; }

    protected ConditionValue _sprqaful;
    public ConditionValue xdfgetSprqaful()
    { if (_sprqaful == null) { _sprqaful = nCV(); }
      return _sprqaful; }
    protected ConditionValue xgetCValueSprqaful() { return xdfgetSprqaful(); }

    /**
     * Add order-by as ascend. <br>
     * SPRQAFUL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqaful_Asc() { regOBA("SPRQAFUL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRQAFUL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Sprqaful_Desc() { regOBD("SPRQAFUL"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsECsrstinfSendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsECsrstinfSendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsECsrstinfSendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsECsrstinfSendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ECsrstinfSendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ECsrstinfSendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ECsrstinfSendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ECsrstinfSendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ECsrstinfSendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ECsrstinfSendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ECsrstinfSendCQ> _myselfExistsMap;
    public Map<String, ECsrstinfSendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ECsrstinfSendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ECsrstinfSendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ECsrstinfSendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ECsrstinfSendCB.class.getName(); }
    protected String xCQ() { return ECsrstinfSendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
