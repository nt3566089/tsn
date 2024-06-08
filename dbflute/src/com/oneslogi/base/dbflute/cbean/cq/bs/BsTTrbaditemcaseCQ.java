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
 * The base condition-query of T_TRBADITEMCASE.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrbaditemcaseCQ extends AbstractBsTTrbaditemcaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrbaditemcaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrbaditemcaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRBADITEMCASE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrbaditemcaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrbaditemcaseCIQ xcreateCIQ() {
        TTrbaditemcaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrbaditemcaseCIQ xnewCIQ() {
        return new TTrbaditemcaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRBADITEMCASE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrbaditemcaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrbaditemcaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trbaditemcaseId;
    public ConditionValue xdfgetTrbaditemcaseId()
    { if (_trbaditemcaseId == null) { _trbaditemcaseId = nCV(); }
      return _trbaditemcaseId; }
    protected ConditionValue xgetCValueTrbaditemcaseId() { return xdfgetTrbaditemcaseId(); }

    /**
     * Add order-by as ascend. <br>
     * TRBADITEMCASE_ID: {PK, ID, IX+, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_TrbaditemcaseId_Asc() { regOBA("TRBADITEMCASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRBADITEMCASE_ID: {PK, ID, IX+, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_TrbaditemcaseId_Desc() { regOBD("TRBADITEMCASE_ID"); return this; }

    protected ConditionValue _targetmon;
    public ConditionValue xdfgetTargetmon()
    { if (_targetmon == null) { _targetmon = nCV(); }
      return _targetmon; }
    protected ConditionValue xgetCValueTargetmon() { return xdfgetTargetmon(); }

    /**
     * Add order-by as ascend. <br>
     * TARGETMON: {IX+, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Targetmon_Asc() { regOBA("TARGETMON"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARGETMON: {IX+, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Targetmon_Desc() { regOBD("TARGETMON"); return this; }

    protected ConditionValue _baditemcd;
    public ConditionValue xdfgetBaditemcd()
    { if (_baditemcd == null) { _baditemcd = nCV(); }
      return _baditemcd; }
    protected ConditionValue xgetCValueBaditemcd() { return xdfgetBaditemcd(); }

    /**
     * Add order-by as ascend. <br>
     * BADITEMCD: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Baditemcd_Asc() { regOBA("BADITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BADITEMCD: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Baditemcd_Desc() { regOBD("BADITEMCD"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemcd;
    public ConditionValue xdfgetItemcd()
    { if (_itemcd == null) { _itemcd = nCV(); }
      return _itemcd; }
    protected ConditionValue xgetCValueItemcd() { return xdfgetItemcd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Itemcd_Asc() { regOBA("ITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Itemcd_Desc() { regOBD("ITEMCD"); return this; }

    protected ConditionValue _lblkbn;
    public ConditionValue xdfgetLblkbn()
    { if (_lblkbn == null) { _lblkbn = nCV(); }
      return _lblkbn; }
    protected ConditionValue xgetCValueLblkbn() { return xdfgetLblkbn(); }

    /**
     * Add order-by as ascend. <br>
     * LBLKBN: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Lblkbn_Asc() { regOBA("LBLKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBLKBN: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Lblkbn_Desc() { regOBD("LBLKBN"); return this; }

    protected ConditionValue _inoutkbn;
    public ConditionValue xdfgetInoutkbn()
    { if (_inoutkbn == null) { _inoutkbn = nCV(); }
      return _inoutkbn; }
    protected ConditionValue xgetCValueInoutkbn() { return xdfgetInoutkbn(); }

    /**
     * Add order-by as ascend. <br>
     * INOUTKBN: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Inoutkbn_Asc() { regOBA("INOUTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUTKBN: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Inoutkbn_Desc() { regOBD("INOUTKBN"); return this; }

    protected ConditionValue _createddate;
    public ConditionValue xdfgetCreateddate()
    { if (_createddate == null) { _createddate = nCV(); }
      return _createddate; }
    protected ConditionValue xgetCValueCreateddate() { return xdfgetCreateddate(); }

    /**
     * Add order-by as ascend. <br>
     * CREATEDDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Createddate_Asc() { regOBA("CREATEDDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATEDDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Createddate_Desc() { regOBD("CREATEDDATE"); return this; }

    protected ConditionValue _reprintedflg;
    public ConditionValue xdfgetReprintedflg()
    { if (_reprintedflg == null) { _reprintedflg = nCV(); }
      return _reprintedflg; }
    protected ConditionValue xgetCValueReprintedflg() { return xdfgetReprintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * REPRINTEDFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Reprintedflg_Asc() { regOBA("REPRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPRINTEDFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Reprintedflg_Desc() { regOBD("REPRINTEDFLG"); return this; }

    protected ConditionValue _expitemcd;
    public ConditionValue xdfgetExpitemcd()
    { if (_expitemcd == null) { _expitemcd = nCV(); }
      return _expitemcd; }
    protected ConditionValue xgetCValueExpitemcd() { return xdfgetExpitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * EXPITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Expitemcd_Asc() { regOBA("EXPITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Expitemcd_Desc() { regOBD("EXPITEMCD"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _creatednum;
    public ConditionValue xdfgetCreatednum()
    { if (_creatednum == null) { _creatednum = nCV(); }
      return _creatednum; }
    protected ConditionValue xgetCValueCreatednum() { return xdfgetCreatednum(); }

    /**
     * Add order-by as ascend. <br>
     * CREATEDNUM: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Creatednum_Asc() { regOBA("CREATEDNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATEDNUM: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_Creatednum_Desc() { regOBD("CREATEDNUM"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

    protected ConditionValue _vaExtdata2;
    public ConditionValue xdfgetVaExtdata2()
    { if (_vaExtdata2 == null) { _vaExtdata2 = nCV(); }
      return _vaExtdata2; }
    protected ConditionValue xgetCValueVaExtdata2() { return xdfgetVaExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * VA_EXTDATA2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_EXTDATA2"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_EXTDATA3"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_EXTDATA2"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_EXTDATA3"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_EXTDATA3"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrbaditemcaseCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrbaditemcaseCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrbaditemcaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrbaditemcaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrbaditemcaseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrbaditemcaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrbaditemcaseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrbaditemcaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrbaditemcaseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrbaditemcaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrbaditemcaseCQ> _myselfExistsMap;
    public Map<String, TTrbaditemcaseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrbaditemcaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrbaditemcaseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrbaditemcaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrbaditemcaseCB.class.getName(); }
    protected String xCQ() { return TTrbaditemcaseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
