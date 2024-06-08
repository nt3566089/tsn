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
 * The base condition-query of E_PRIMARY_SHIPPING_DTL_INFO.
 * @author DBFlute(AutoGenerator)
 */
public class BsEPrimaryShippingDtlInfoCQ extends AbstractBsEPrimaryShippingDtlInfoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EPrimaryShippingDtlInfoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEPrimaryShippingDtlInfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_PRIMARY_SHIPPING_DTL_INFO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EPrimaryShippingDtlInfoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EPrimaryShippingDtlInfoCIQ xcreateCIQ() {
        EPrimaryShippingDtlInfoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EPrimaryShippingDtlInfoCIQ xnewCIQ() {
        return new EPrimaryShippingDtlInfoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_PRIMARY_SHIPPING_DTL_INFO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EPrimaryShippingDtlInfoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EPrimaryShippingDtlInfoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _primaryShippingDtlInfoId;
    public ConditionValue xdfgetPrimaryShippingDtlInfoId()
    { if (_primaryShippingDtlInfoId == null) { _primaryShippingDtlInfoId = nCV(); }
      return _primaryShippingDtlInfoId; }
    protected ConditionValue xgetCValuePrimaryShippingDtlInfoId() { return xdfgetPrimaryShippingDtlInfoId(); }

    /**
     * Add order-by as ascend. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_PrimaryShippingDtlInfoId_Asc() { regOBA("PRIMARY_SHIPPING_DTL_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_PrimaryShippingDtlInfoId_Desc() { regOBD("PRIMARY_SHIPPING_DTL_INFO_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _zzbukrs;
    public ConditionValue xdfgetZzbukrs()
    { if (_zzbukrs == null) { _zzbukrs = nCV(); }
      return _zzbukrs; }
    protected ConditionValue xgetCValueZzbukrs() { return xdfgetZzbukrs(); }

    /**
     * Add order-by as ascend. <br>
     * ZZBUKRS: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzbukrs_Asc() { regOBA("ZZBUKRS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZBUKRS: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzbukrs_Desc() { regOBD("ZZBUKRS"); return this; }

    protected ConditionValue _zzsndymd;
    public ConditionValue xdfgetZzsndymd()
    { if (_zzsndymd == null) { _zzsndymd = nCV(); }
      return _zzsndymd; }
    protected ConditionValue xgetCValueZzsndymd() { return xdfgetZzsndymd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZSNDYMD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzsndymd_Asc() { regOBA("ZZSNDYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZSNDYMD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzsndymd_Desc() { regOBD("ZZSNDYMD"); return this; }

    protected ConditionValue _rcdid;
    public ConditionValue xdfgetRcdid()
    { if (_rcdid == null) { _rcdid = nCV(); }
      return _rcdid; }
    protected ConditionValue xgetCValueRcdid() { return xdfgetRcdid(); }

    /**
     * Add order-by as ascend. <br>
     * RCDID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Rcdid_Asc() { regOBA("RCDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCDID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Rcdid_Desc() { regOBD("RCDID"); return this; }

    protected ConditionValue _zzrefeno;
    public ConditionValue xdfgetZzrefeno()
    { if (_zzrefeno == null) { _zzrefeno = nCV(); }
      return _zzrefeno; }
    protected ConditionValue xgetCValueZzrefeno() { return xdfgetZzrefeno(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFENO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefeno_Asc() { regOBA("ZZREFENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFENO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefeno_Desc() { regOBD("ZZREFENO"); return this; }

    protected ConditionValue _bnwhcd;
    public ConditionValue xdfgetBnwhcd()
    { if (_bnwhcd == null) { _bnwhcd = nCV(); }
      return _bnwhcd; }
    protected ConditionValue xgetCValueBnwhcd() { return xdfgetBnwhcd(); }

    /**
     * Add order-by as ascend. <br>
     * BNWHCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Bnwhcd_Asc() { regOBA("BNWHCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BNWHCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Bnwhcd_Desc() { regOBD("BNWHCD"); return this; }

    protected ConditionValue _hdrid;
    public ConditionValue xdfgetHdrid()
    { if (_hdrid == null) { _hdrid = nCV(); }
      return _hdrid; }
    protected ConditionValue xgetCValueHdrid() { return xdfgetHdrid(); }

    /**
     * Add order-by as ascend. <br>
     * HDRID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Hdrid_Asc() { regOBA("HDRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDRID: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Hdrid_Desc() { regOBD("HDRID"); return this; }

    protected ConditionValue _dtlno;
    public ConditionValue xdfgetDtlno()
    { if (_dtlno == null) { _dtlno = nCV(); }
      return _dtlno; }
    protected ConditionValue xgetCValueDtlno() { return xdfgetDtlno(); }

    /**
     * Add order-by as ascend. <br>
     * DTLNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Dtlno_Asc() { regOBA("DTLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DTLNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Dtlno_Desc() { regOBD("DTLNO"); return this; }

    protected ConditionValue _spndda;
    public ConditionValue xdfgetSpndda()
    { if (_spndda == null) { _spndda = nCV(); }
      return _spndda; }
    protected ConditionValue xgetCValueSpndda() { return xdfgetSpndda(); }

    /**
     * Add order-by as ascend. <br>
     * SPNDDA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Spndda_Asc() { regOBA("SPNDDA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPNDDA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Spndda_Desc() { regOBD("SPNDDA"); return this; }

    protected ConditionValue _pdlgtm;
    public ConditionValue xdfgetPdlgtm()
    { if (_pdlgtm == null) { _pdlgtm = nCV(); }
      return _pdlgtm; }
    protected ConditionValue xgetCValuePdlgtm() { return xdfgetPdlgtm(); }

    /**
     * Add order-by as ascend. <br>
     * PDLGTM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Pdlgtm_Asc() { regOBA("PDLGTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PDLGTM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Pdlgtm_Desc() { regOBD("PDLGTM"); return this; }

    protected ConditionValue _zzsendno;
    public ConditionValue xdfgetZzsendno()
    { if (_zzsendno == null) { _zzsendno = nCV(); }
      return _zzsendno; }
    protected ConditionValue xgetCValueZzsendno() { return xdfgetZzsendno(); }

    /**
     * Add order-by as ascend. <br>
     * ZZSENDNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzsendno_Asc() { regOBA("ZZSENDNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZSENDNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzsendno_Desc() { regOBD("ZZSENDNO"); return this; }

    protected ConditionValue _prcsorg;
    public ConditionValue xdfgetPrcsorg()
    { if (_prcsorg == null) { _prcsorg = nCV(); }
      return _prcsorg; }
    protected ConditionValue xgetCValuePrcsorg() { return xdfgetPrcsorg(); }

    /**
     * Add order-by as ascend. <br>
     * PRCSORG: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Prcsorg_Asc() { regOBA("PRCSORG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRCSORG: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Prcsorg_Desc() { regOBD("PRCSORG"); return this; }

    protected ConditionValue _ekgrp;
    public ConditionValue xdfgetEkgrp()
    { if (_ekgrp == null) { _ekgrp = nCV(); }
      return _ekgrp; }
    protected ConditionValue xgetCValueEkgrp() { return xdfgetEkgrp(); }

    /**
     * Add order-by as ascend. <br>
     * EKGRP: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Ekgrp_Asc() { regOBA("EKGRP"); return this; }

    /**
     * Add order-by as descend. <br>
     * EKGRP: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Ekgrp_Desc() { regOBD("EKGRP"); return this; }

    protected ConditionValue _spcd;
    public ConditionValue xdfgetSpcd()
    { if (_spcd == null) { _spcd = nCV(); }
      return _spcd; }
    protected ConditionValue xgetCValueSpcd() { return xdfgetSpcd(); }

    /**
     * Add order-by as ascend. <br>
     * SPCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Spcd_Asc() { regOBA("SPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Spcd_Desc() { regOBD("SPCD"); return this; }

    protected ConditionValue _spskplcd;
    public ConditionValue xdfgetSpskplcd()
    { if (_spskplcd == null) { _spskplcd = nCV(); }
      return _spskplcd; }
    protected ConditionValue xgetCValueSpskplcd() { return xdfgetSpskplcd(); }

    /**
     * Add order-by as ascend. <br>
     * SPSKPLCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Spskplcd_Asc() { regOBA("SPSKPLCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPSKPLCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Spskplcd_Desc() { regOBD("SPSKPLCD"); return this; }

    protected ConditionValue _rccd;
    public ConditionValue xdfgetRccd()
    { if (_rccd == null) { _rccd = nCV(); }
      return _rccd; }
    protected ConditionValue xgetCValueRccd() { return xdfgetRccd(); }

    /**
     * Add order-by as ascend. <br>
     * RCCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Rccd_Asc() { regOBA("RCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Rccd_Desc() { regOBD("RCCD"); return this; }

    protected ConditionValue _rcskplcd;
    public ConditionValue xdfgetRcskplcd()
    { if (_rcskplcd == null) { _rcskplcd = nCV(); }
      return _rcskplcd; }
    protected ConditionValue xgetCValueRcskplcd() { return xdfgetRcskplcd(); }

    /**
     * Add order-by as ascend. <br>
     * RCSKPLCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Rcskplcd_Asc() { regOBA("RCSKPLCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCSKPLCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Rcskplcd_Desc() { regOBD("RCSKPLCD"); return this; }

    protected ConditionValue _zzrcvymd;
    public ConditionValue xdfgetZzrcvymd()
    { if (_zzrcvymd == null) { _zzrcvymd = nCV(); }
      return _zzrcvymd; }
    protected ConditionValue xgetCValueZzrcvymd() { return xdfgetZzrcvymd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZRCVYMD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrcvymd_Asc() { regOBA("ZZRCVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZRCVYMD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrcvymd_Desc() { regOBD("ZZRCVYMD"); return this; }

    protected ConditionValue _zzshtype;
    public ConditionValue xdfgetZzshtype()
    { if (_zzshtype == null) { _zzshtype = nCV(); }
      return _zzshtype; }
    protected ConditionValue xgetCValueZzshtype() { return xdfgetZzshtype(); }

    /**
     * Add order-by as ascend. <br>
     * ZZSHTYPE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzshtype_Asc() { regOBA("ZZSHTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZSHTYPE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzshtype_Desc() { regOBD("ZZSHTYPE"); return this; }

    protected ConditionValue _agcd;
    public ConditionValue xdfgetAgcd()
    { if (_agcd == null) { _agcd = nCV(); }
      return _agcd; }
    protected ConditionValue xgetCValueAgcd() { return xdfgetAgcd(); }

    /**
     * Add order-by as ascend. <br>
     * AGCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Agcd_Asc() { regOBA("AGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * AGCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Agcd_Desc() { regOBD("AGCD"); return this; }

    protected ConditionValue _zzcbxqty;
    public ConditionValue xdfgetZzcbxqty()
    { if (_zzcbxqty == null) { _zzcbxqty = nCV(); }
      return _zzcbxqty; }
    protected ConditionValue xgetCValueZzcbxqty() { return xdfgetZzcbxqty(); }

    /**
     * Add order-by as ascend. <br>
     * ZZCBXQTY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzcbxqty_Asc() { regOBA("ZZCBXQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZCBXQTY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzcbxqty_Desc() { regOBD("ZZCBXQTY"); return this; }

    protected ConditionValue _zzpltqty;
    public ConditionValue xdfgetZzpltqty()
    { if (_zzpltqty == null) { _zzpltqty = nCV(); }
      return _zzpltqty; }
    protected ConditionValue xgetCValueZzpltqty() { return xdfgetZzpltqty(); }

    /**
     * Add order-by as ascend. <br>
     * ZZPLTQTY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzpltqty_Asc() { regOBA("ZZPLTQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZPLTQTY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzpltqty_Desc() { regOBD("ZZPLTQTY"); return this; }

    protected ConditionValue _zztplqty;
    public ConditionValue xdfgetZztplqty()
    { if (_zztplqty == null) { _zztplqty = nCV(); }
      return _zztplqty; }
    protected ConditionValue xgetCValueZztplqty() { return xdfgetZztplqty(); }

    /**
     * Add order-by as ascend. <br>
     * ZZTPLQTY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zztplqty_Asc() { regOBA("ZZTPLQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZTPLQTY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zztplqty_Desc() { regOBD("ZZTPLQTY"); return this; }

    protected ConditionValue _zzshpcls;
    public ConditionValue xdfgetZzshpcls()
    { if (_zzshpcls == null) { _zzshpcls = nCV(); }
      return _zzshpcls; }
    protected ConditionValue xgetCValueZzshpcls() { return xdfgetZzshpcls(); }

    /**
     * Add order-by as ascend. <br>
     * ZZSHPCLS: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzshpcls_Asc() { regOBA("ZZSHPCLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZSHPCLS: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzshpcls_Desc() { regOBD("ZZSHPCLS"); return this; }

    protected ConditionValue _zzrefe01;
    public ConditionValue xdfgetZzrefe01()
    { if (_zzrefe01 == null) { _zzrefe01 = nCV(); }
      return _zzrefe01; }
    protected ConditionValue xgetCValueZzrefe01() { return xdfgetZzrefe01(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE01: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe01_Asc() { regOBA("ZZREFE01"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE01: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe01_Desc() { regOBD("ZZREFE01"); return this; }

    protected ConditionValue _zzrefe02;
    public ConditionValue xdfgetZzrefe02()
    { if (_zzrefe02 == null) { _zzrefe02 = nCV(); }
      return _zzrefe02; }
    protected ConditionValue xgetCValueZzrefe02() { return xdfgetZzrefe02(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE02: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe02_Asc() { regOBA("ZZREFE02"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE02: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe02_Desc() { regOBD("ZZREFE02"); return this; }

    protected ConditionValue _zzrefe03;
    public ConditionValue xdfgetZzrefe03()
    { if (_zzrefe03 == null) { _zzrefe03 = nCV(); }
      return _zzrefe03; }
    protected ConditionValue xgetCValueZzrefe03() { return xdfgetZzrefe03(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE03: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe03_Asc() { regOBA("ZZREFE03"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE03: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe03_Desc() { regOBD("ZZREFE03"); return this; }

    protected ConditionValue _zzrefe04;
    public ConditionValue xdfgetZzrefe04()
    { if (_zzrefe04 == null) { _zzrefe04 = nCV(); }
      return _zzrefe04; }
    protected ConditionValue xgetCValueZzrefe04() { return xdfgetZzrefe04(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE04: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe04_Asc() { regOBA("ZZREFE04"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE04: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe04_Desc() { regOBD("ZZREFE04"); return this; }

    protected ConditionValue _zzrefe05;
    public ConditionValue xdfgetZzrefe05()
    { if (_zzrefe05 == null) { _zzrefe05 = nCV(); }
      return _zzrefe05; }
    protected ConditionValue xgetCValueZzrefe05() { return xdfgetZzrefe05(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE05: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe05_Asc() { regOBA("ZZREFE05"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE05: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe05_Desc() { regOBD("ZZREFE05"); return this; }

    protected ConditionValue _zzrefe06;
    public ConditionValue xdfgetZzrefe06()
    { if (_zzrefe06 == null) { _zzrefe06 = nCV(); }
      return _zzrefe06; }
    protected ConditionValue xgetCValueZzrefe06() { return xdfgetZzrefe06(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE06: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe06_Asc() { regOBA("ZZREFE06"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE06: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe06_Desc() { regOBD("ZZREFE06"); return this; }

    protected ConditionValue _zzrefe07;
    public ConditionValue xdfgetZzrefe07()
    { if (_zzrefe07 == null) { _zzrefe07 = nCV(); }
      return _zzrefe07; }
    protected ConditionValue xgetCValueZzrefe07() { return xdfgetZzrefe07(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE07: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe07_Asc() { regOBA("ZZREFE07"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE07: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe07_Desc() { regOBD("ZZREFE07"); return this; }

    protected ConditionValue _zzrefe08;
    public ConditionValue xdfgetZzrefe08()
    { if (_zzrefe08 == null) { _zzrefe08 = nCV(); }
      return _zzrefe08; }
    protected ConditionValue xgetCValueZzrefe08() { return xdfgetZzrefe08(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE08: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe08_Asc() { regOBA("ZZREFE08"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE08: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe08_Desc() { regOBD("ZZREFE08"); return this; }

    protected ConditionValue _zzrefe09;
    public ConditionValue xdfgetZzrefe09()
    { if (_zzrefe09 == null) { _zzrefe09 = nCV(); }
      return _zzrefe09; }
    protected ConditionValue xgetCValueZzrefe09() { return xdfgetZzrefe09(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE09: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe09_Asc() { regOBA("ZZREFE09"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE09: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe09_Desc() { regOBD("ZZREFE09"); return this; }

    protected ConditionValue _zzrefe10;
    public ConditionValue xdfgetZzrefe10()
    { if (_zzrefe10 == null) { _zzrefe10 = nCV(); }
      return _zzrefe10; }
    protected ConditionValue xgetCValueZzrefe10() { return xdfgetZzrefe10(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFE10: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe10_Asc() { regOBA("ZZREFE10"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFE10: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefe10_Desc() { regOBD("ZZREFE10"); return this; }

    protected ConditionValue _dtlqa;
    public ConditionValue xdfgetDtlqa()
    { if (_dtlqa == null) { _dtlqa = nCV(); }
      return _dtlqa; }
    protected ConditionValue xgetCValueDtlqa() { return xdfgetDtlqa(); }

    /**
     * Add order-by as ascend. <br>
     * DTLQA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Dtlqa_Asc() { regOBA("DTLQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DTLQA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Dtlqa_Desc() { regOBD("DTLQA"); return this; }

    protected ConditionValue _zzrefeno2;
    public ConditionValue xdfgetZzrefeno2()
    { if (_zzrefeno2 == null) { _zzrefeno2 = nCV(); }
      return _zzrefeno2; }
    protected ConditionValue xgetCValueZzrefeno2() { return xdfgetZzrefeno2(); }

    /**
     * Add order-by as ascend. <br>
     * ZZREFENO2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefeno2_Asc() { regOBA("ZZREFENO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZREFENO2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzrefeno2_Desc() { regOBD("ZZREFENO2"); return this; }

    protected ConditionValue _oprtno;
    public ConditionValue xdfgetOprtno()
    { if (_oprtno == null) { _oprtno = nCV(); }
      return _oprtno; }
    protected ConditionValue xgetCValueOprtno() { return xdfgetOprtno(); }

    /**
     * Add order-by as ascend. <br>
     * OPRTNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Oprtno_Asc() { regOBA("OPRTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPRTNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Oprtno_Desc() { regOBD("OPRTNO"); return this; }

    protected ConditionValue _blocknm;
    public ConditionValue xdfgetBlocknm()
    { if (_blocknm == null) { _blocknm = nCV(); }
      return _blocknm; }
    protected ConditionValue xgetCValueBlocknm() { return xdfgetBlocknm(); }

    /**
     * Add order-by as ascend. <br>
     * BLOCKNM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Blocknm_Asc() { regOBA("BLOCKNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLOCKNM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Blocknm_Desc() { regOBD("BLOCKNM"); return this; }

    protected ConditionValue _zzmatnr;
    public ConditionValue xdfgetZzmatnr()
    { if (_zzmatnr == null) { _zzmatnr = nCV(); }
      return _zzmatnr; }
    protected ConditionValue xgetCValueZzmatnr() { return xdfgetZzmatnr(); }

    /**
     * Add order-by as ascend. <br>
     * ZZMATNR: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzmatnr_Asc() { regOBA("ZZMATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNR: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Zzmatnr_Desc() { regOBD("ZZMATNR"); return this; }

    protected ConditionValue _lotno;
    public ConditionValue xdfgetLotno()
    { if (_lotno == null) { _lotno = nCV(); }
      return _lotno; }
    protected ConditionValue xgetCValueLotno() { return xdfgetLotno(); }

    /**
     * Add order-by as ascend. <br>
     * LOTNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Lotno_Asc() { regOBA("LOTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Lotno_Desc() { regOBD("LOTNO"); return this; }

    protected ConditionValue _quanty;
    public ConditionValue xdfgetQuanty()
    { if (_quanty == null) { _quanty = nCV(); }
      return _quanty; }
    protected ConditionValue xgetCValueQuanty() { return xdfgetQuanty(); }

    /**
     * Add order-by as ascend. <br>
     * QUANTY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Quanty_Asc() { regOBA("QUANTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUANTY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Quanty_Desc() { regOBD("QUANTY"); return this; }

    protected ConditionValue _grpcsd;
    public ConditionValue xdfgetGrpcsd()
    { if (_grpcsd == null) { _grpcsd = nCV(); }
      return _grpcsd; }
    protected ConditionValue xgetCValueGrpcsd() { return xdfgetGrpcsd(); }

    /**
     * Add order-by as ascend. <br>
     * GRPCSD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Grpcsd_Asc() { regOBA("GRPCSD"); return this; }

    /**
     * Add order-by as descend. <br>
     * GRPCSD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Grpcsd_Desc() { regOBD("GRPCSD"); return this; }

    protected ConditionValue _sfpoqa;
    public ConditionValue xdfgetSfpoqa()
    { if (_sfpoqa == null) { _sfpoqa = nCV(); }
      return _sfpoqa; }
    protected ConditionValue xgetCValueSfpoqa() { return xdfgetSfpoqa(); }

    /**
     * Add order-by as ascend. <br>
     * SFPOQA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Sfpoqa_Asc() { regOBA("SFPOQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFPOQA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Sfpoqa_Desc() { regOBD("SFPOQA"); return this; }

    protected ConditionValue _dsskplcd;
    public ConditionValue xdfgetDsskplcd()
    { if (_dsskplcd == null) { _dsskplcd = nCV(); }
      return _dsskplcd; }
    protected ConditionValue xgetCValueDsskplcd() { return xdfgetDsskplcd(); }

    /**
     * Add order-by as ascend. <br>
     * DSSKPLCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Dsskplcd_Asc() { regOBA("DSSKPLCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSSKPLCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Dsskplcd_Desc() { regOBD("DSSKPLCD"); return this; }

    protected ConditionValue _mfinf;
    public ConditionValue xdfgetMfinf()
    { if (_mfinf == null) { _mfinf = nCV(); }
      return _mfinf; }
    protected ConditionValue xgetCValueMfinf() { return xdfgetMfinf(); }

    /**
     * Add order-by as ascend. <br>
     * MFINF: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Mfinf_Asc() { regOBA("MFINF"); return this; }

    /**
     * Add order-by as descend. <br>
     * MFINF: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Mfinf_Desc() { regOBD("MFINF"); return this; }

    protected ConditionValue _sfthdes;
    public ConditionValue xdfgetSfthdes()
    { if (_sfthdes == null) { _sfthdes = nCV(); }
      return _sfthdes; }
    protected ConditionValue xgetCValueSfthdes() { return xdfgetSfthdes(); }

    /**
     * Add order-by as ascend. <br>
     * SFTHDES: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Sfthdes_Asc() { regOBA("SFTHDES"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFTHDES: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Sfthdes_Desc() { regOBD("SFTHDES"); return this; }

    protected ConditionValue _cnfatcl;
    public ConditionValue xdfgetCnfatcl()
    { if (_cnfatcl == null) { _cnfatcl = nCV(); }
      return _cnfatcl; }
    protected ConditionValue xgetCValueCnfatcl() { return xdfgetCnfatcl(); }

    /**
     * Add order-by as ascend. <br>
     * CNFATCL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Cnfatcl_Asc() { regOBA("CNFATCL"); return this; }

    /**
     * Add order-by as descend. <br>
     * CNFATCL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Cnfatcl_Desc() { regOBD("CNFATCL"); return this; }

    protected ConditionValue _lastgr;
    public ConditionValue xdfgetLastgr()
    { if (_lastgr == null) { _lastgr = nCV(); }
      return _lastgr; }
    protected ConditionValue xgetCValueLastgr() { return xdfgetLastgr(); }

    /**
     * Add order-by as ascend. <br>
     * LASTGR: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Lastgr_Asc() { regOBA("LASTGR"); return this; }

    /**
     * Add order-by as descend. <br>
     * LASTGR: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Lastgr_Desc() { regOBD("LASTGR"); return this; }

    protected ConditionValue _sflastdes;
    public ConditionValue xdfgetSflastdes()
    { if (_sflastdes == null) { _sflastdes = nCV(); }
      return _sflastdes; }
    protected ConditionValue xgetCValueSflastdes() { return xdfgetSflastdes(); }

    /**
     * Add order-by as ascend. <br>
     * SFLASTDES: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Sflastdes_Asc() { regOBA("SFLASTDES"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFLASTDES: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Sflastdes_Desc() { regOBD("SFLASTDES"); return this; }

    protected ConditionValue _shno;
    public ConditionValue xdfgetShno()
    { if (_shno == null) { _shno = nCV(); }
      return _shno; }
    protected ConditionValue xgetCValueShno() { return xdfgetShno(); }

    /**
     * Add order-by as ascend. <br>
     * SHNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Shno_Asc() { regOBA("SHNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Shno_Desc() { regOBD("SHNO"); return this; }

    protected ConditionValue _pltno;
    public ConditionValue xdfgetPltno()
    { if (_pltno == null) { _pltno = nCV(); }
      return _pltno; }
    protected ConditionValue xgetCValuePltno() { return xdfgetPltno(); }

    /**
     * Add order-by as ascend. <br>
     * PLTNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Pltno_Asc() { regOBA("PLTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLTNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Pltno_Desc() { regOBD("PLTNO"); return this; }

    protected ConditionValue _tradelivno;
    public ConditionValue xdfgetTradelivno()
    { if (_tradelivno == null) { _tradelivno = nCV(); }
      return _tradelivno; }
    protected ConditionValue xgetCValueTradelivno() { return xdfgetTradelivno(); }

    /**
     * Add order-by as ascend. <br>
     * TRADELIVNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Tradelivno_Asc() { regOBA("TRADELIVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRADELIVNO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Tradelivno_Desc() { regOBD("TRADELIVNO"); return this; }

    protected ConditionValue _batjmfym;
    public ConditionValue xdfgetBatjmfym()
    { if (_batjmfym == null) { _batjmfym = nCV(); }
      return _batjmfym; }
    protected ConditionValue xgetCValueBatjmfym() { return xdfgetBatjmfym(); }

    /**
     * Add order-by as ascend. <br>
     * BATJMFYM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Batjmfym_Asc() { regOBA("BATJMFYM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATJMFYM: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Batjmfym_Desc() { regOBD("BATJMFYM"); return this; }

    protected ConditionValue _sffil;
    public ConditionValue xdfgetSffil()
    { if (_sffil == null) { _sffil = nCV(); }
      return _sffil; }
    protected ConditionValue xgetCValueSffil() { return xdfgetSffil(); }

    /**
     * Add order-by as ascend. <br>
     * SFFIL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Sffil_Asc() { regOBA("SFFIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFFIL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_Sffil_Desc() { regOBD("SFFIL"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEPrimaryShippingDtlInfoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEPrimaryShippingDtlInfoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EPrimaryShippingDtlInfoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EPrimaryShippingDtlInfoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EPrimaryShippingDtlInfoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EPrimaryShippingDtlInfoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EPrimaryShippingDtlInfoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EPrimaryShippingDtlInfoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EPrimaryShippingDtlInfoCQ> _myselfExistsMap;
    public Map<String, EPrimaryShippingDtlInfoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EPrimaryShippingDtlInfoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EPrimaryShippingDtlInfoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EPrimaryShippingDtlInfoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EPrimaryShippingDtlInfoCB.class.getName(); }
    protected String xCQ() { return EPrimaryShippingDtlInfoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
