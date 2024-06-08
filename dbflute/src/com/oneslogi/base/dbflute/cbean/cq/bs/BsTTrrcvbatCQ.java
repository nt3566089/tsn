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
 * The base condition-query of T_TRRCVBAT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrrcvbatCQ extends AbstractBsTTrrcvbatCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrrcvbatCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrrcvbatCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRRCVBAT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrrcvbatCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrrcvbatCIQ xcreateCIQ() {
        TTrrcvbatCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrrcvbatCIQ xnewCIQ() {
        return new TTrrcvbatCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRRCVBAT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrrcvbatCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrrcvbatCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trrcvbatId;
    public ConditionValue xdfgetTrrcvbatId()
    { if (_trrcvbatId == null) { _trrcvbatId = nCV(); }
      return _trrcvbatId; }
    protected ConditionValue xgetCValueTrrcvbatId() { return xdfgetTrrcvbatId(); }

    /**
     * Add order-by as ascend. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_TrrcvbatId_Asc() { regOBA("TRRCVBAT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_TrrcvbatId_Desc() { regOBD("TRRCVBAT_ID"); return this; }

    protected ConditionValue _batno;
    public ConditionValue xdfgetBatno()
    { if (_batno == null) { _batno = nCV(); }
      return _batno; }
    protected ConditionValue xgetCValueBatno() { return xdfgetBatno(); }

    /**
     * Add order-by as ascend. <br>
     * BATNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batno_Asc() { regOBA("BATNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batno_Desc() { regOBD("BATNO"); return this; }

    protected ConditionValue _batdelino;
    public ConditionValue xdfgetBatdelino()
    { if (_batdelino == null) { _batdelino = nCV(); }
      return _batdelino; }
    protected ConditionValue xgetCValueBatdelino() { return xdfgetBatdelino(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELINO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batdelino_Asc() { regOBA("BATDELINO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELINO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batdelino_Desc() { regOBD("BATDELINO"); return this; }

    protected ConditionValue _batdelidetailno;
    public ConditionValue xdfgetBatdelidetailno()
    { if (_batdelidetailno == null) { _batdelidetailno = nCV(); }
      return _batdelidetailno; }
    protected ConditionValue xgetCValueBatdelidetailno() { return xdfgetBatdelidetailno(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batdelidetailno_Asc() { regOBA("BATDELIDETAILNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batdelidetailno_Desc() { regOBD("BATDELIDETAILNO"); return this; }

    protected ConditionValue _batwarehousecd;
    public ConditionValue xdfgetBatwarehousecd()
    { if (_batwarehousecd == null) { _batwarehousecd = nCV(); }
      return _batwarehousecd; }
    protected ConditionValue xgetCValueBatwarehousecd() { return xdfgetBatwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batwarehousecd_Asc() { regOBA("BATWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batwarehousecd_Desc() { regOBD("BATWAREHOUSECD"); return this; }

    protected ConditionValue _batkeepwarehousecd;
    public ConditionValue xdfgetBatkeepwarehousecd()
    { if (_batkeepwarehousecd == null) { _batkeepwarehousecd = nCV(); }
      return _batkeepwarehousecd; }
    protected ConditionValue xgetCValueBatkeepwarehousecd() { return xdfgetBatkeepwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batkeepwarehousecd_Asc() { regOBA("BATKEEPWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batkeepwarehousecd_Desc() { regOBD("BATKEEPWAREHOUSECD"); return this; }

    protected ConditionValue _batpartnernorcv;
    public ConditionValue xdfgetBatpartnernorcv()
    { if (_batpartnernorcv == null) { _batpartnernorcv = nCV(); }
      return _batpartnernorcv; }
    protected ConditionValue xgetCValueBatpartnernorcv() { return xdfgetBatpartnernorcv(); }

    /**
     * Add order-by as ascend. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batpartnernorcv_Asc() { regOBA("BATPARTNERNORCV"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batpartnernorcv_Desc() { regOBD("BATPARTNERNORCV"); return this; }

    protected ConditionValue _batpartnernosnd;
    public ConditionValue xdfgetBatpartnernosnd()
    { if (_batpartnernosnd == null) { _batpartnernosnd = nCV(); }
      return _batpartnernosnd; }
    protected ConditionValue xgetCValueBatpartnernosnd() { return xdfgetBatpartnernosnd(); }

    /**
     * Add order-by as ascend. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batpartnernosnd_Asc() { regOBA("BATPARTNERNOSND"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batpartnernosnd_Desc() { regOBD("BATPARTNERNOSND"); return this; }

    protected ConditionValue _batdelidetailnum;
    public ConditionValue xdfgetBatdelidetailnum()
    { if (_batdelidetailnum == null) { _batdelidetailnum = nCV(); }
      return _batdelidetailnum; }
    protected ConditionValue xgetCValueBatdelidetailnum() { return xdfgetBatdelidetailnum(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batdelidetailnum_Asc() { regOBA("BATDELIDETAILNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Batdelidetailnum_Desc() { regOBD("BATDELIDETAILNUM"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _lot3;
    public ConditionValue xdfgetLot3()
    { if (_lot3 == null) { _lot3 = nCV(); }
      return _lot3; }
    protected ConditionValue xgetCValueLot3() { return xdfgetLot3(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _dataMakeFlg;
    public ConditionValue xdfgetDataMakeFlg()
    { if (_dataMakeFlg == null) { _dataMakeFlg = nCV(); }
      return _dataMakeFlg; }
    protected ConditionValue xgetCValueDataMakeFlg() { return xdfgetDataMakeFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DataMakeFlg_Asc() { regOBA("DATA_MAKE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_MAKE_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DataMakeFlg_Desc() { regOBD("DATA_MAKE_FLG"); return this; }

    protected ConditionValue _vaExtdata1;
    public ConditionValue xdfgetVaExtdata1()
    { if (_vaExtdata1 == null) { _vaExtdata1 = nCV(); }
      return _vaExtdata1; }
    protected ConditionValue xgetCValueVaExtdata1() { return xdfgetVaExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

    protected ConditionValue _vaExtdata2;
    public ConditionValue xdfgetVaExtdata2()
    { if (_vaExtdata2 == null) { _vaExtdata2 = nCV(); }
      return _vaExtdata2; }
    protected ConditionValue xgetCValueVaExtdata2() { return xdfgetVaExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

    protected ConditionValue _vaExtdata3;
    public ConditionValue xdfgetVaExtdata3()
    { if (_vaExtdata3 == null) { _vaExtdata3 = nCV(); }
      return _vaExtdata3; }
    protected ConditionValue xgetCValueVaExtdata3() { return xdfgetVaExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

    protected ConditionValue _nvExtdata1;
    public ConditionValue xdfgetNvExtdata1()
    { if (_nvExtdata1 == null) { _nvExtdata1 = nCV(); }
      return _nvExtdata1; }
    protected ConditionValue xgetCValueNvExtdata1() { return xdfgetNvExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

    protected ConditionValue _nvExtdata2;
    public ConditionValue xdfgetNvExtdata2()
    { if (_nvExtdata2 == null) { _nvExtdata2 = nCV(); }
      return _nvExtdata2; }
    protected ConditionValue xgetCValueNvExtdata2() { return xdfgetNvExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_EXTDATA2"); return this; }

    protected ConditionValue _nvExtdata3;
    public ConditionValue xdfgetNvExtdata3()
    { if (_nvExtdata3 == null) { _nvExtdata3 = nCV(); }
      return _nvExtdata3; }
    protected ConditionValue xgetCValueNvExtdata3() { return xdfgetNvExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_EXTDATA3"); return this; }

    protected ConditionValue _nmExtdata1;
    public ConditionValue xdfgetNmExtdata1()
    { if (_nmExtdata1 == null) { _nmExtdata1 = nCV(); }
      return _nmExtdata1; }
    protected ConditionValue xgetCValueNmExtdata1() { return xdfgetNmExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

    protected ConditionValue _nmExtdata2;
    public ConditionValue xdfgetNmExtdata2()
    { if (_nmExtdata2 == null) { _nmExtdata2 = nCV(); }
      return _nmExtdata2; }
    protected ConditionValue xgetCValueNmExtdata2() { return xdfgetNmExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_EXTDATA2"); return this; }

    protected ConditionValue _nmExtdata3;
    public ConditionValue xdfgetNmExtdata3()
    { if (_nmExtdata3 == null) { _nmExtdata3 = nCV(); }
      return _nmExtdata3; }
    protected ConditionValue xgetCValueNmExtdata3() { return xdfgetNmExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_EXTDATA3"); return this; }

    protected ConditionValue _dtExtdata1;
    public ConditionValue xdfgetDtExtdata1()
    { if (_dtExtdata1 == null) { _dtExtdata1 = nCV(); }
      return _dtExtdata1; }
    protected ConditionValue xgetCValueDtExtdata1() { return xdfgetDtExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

    protected ConditionValue _dtExtdata2;
    public ConditionValue xdfgetDtExtdata2()
    { if (_dtExtdata2 == null) { _dtExtdata2 = nCV(); }
      return _dtExtdata2; }
    protected ConditionValue xgetCValueDtExtdata2() { return xdfgetDtExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

    protected ConditionValue _dtExtdata3;
    public ConditionValue xdfgetDtExtdata3()
    { if (_dtExtdata3 == null) { _dtExtdata3 = nCV(); }
      return _dtExtdata3; }
    protected ConditionValue xgetCValueDtExtdata3() { return xdfgetDtExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_EXTDATA3"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrrcvbatCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvbatCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrrcvbatCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrrcvbatCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrrcvbatCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrrcvbatCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrrcvbatCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrrcvbatCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrrcvbatCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrrcvbatCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrrcvbatCQ> _myselfExistsMap;
    public Map<String, TTrrcvbatCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrrcvbatCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrrcvbatCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrrcvbatCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrrcvbatCB.class.getName(); }
    protected String xCQ() { return TTrrcvbatCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}