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
 * The base condition-query of E_PRODUCT_TRACKING_DOMES.
 * @author DBFlute(AutoGenerator)
 */
public class BsEProductTrackingDomesCQ extends AbstractBsEProductTrackingDomesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EProductTrackingDomesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEProductTrackingDomesCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_PRODUCT_TRACKING_DOMES) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EProductTrackingDomesCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EProductTrackingDomesCIQ xcreateCIQ() {
        EProductTrackingDomesCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EProductTrackingDomesCIQ xnewCIQ() {
        return new EProductTrackingDomesCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_PRODUCT_TRACKING_DOMES on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EProductTrackingDomesCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EProductTrackingDomesCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productTrackingDomesId;
    public ConditionValue xdfgetProductTrackingDomesId()
    { if (_productTrackingDomesId == null) { _productTrackingDomesId = nCV(); }
      return _productTrackingDomesId; }
    protected ConditionValue xgetCValueProductTrackingDomesId() { return xdfgetProductTrackingDomesId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ProductTrackingDomesId_Asc() { regOBA("PRODUCT_TRACKING_DOMES_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ProductTrackingDomesId_Desc() { regOBD("PRODUCT_TRACKING_DOMES_ID"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendRowId;
    public ConditionValue xdfgetSendRowId()
    { if (_sendRowId == null) { _sendRowId = nCV(); }
      return _sendRowId; }
    protected ConditionValue xgetCValueSendRowId() { return xdfgetSendRowId(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _usernum1;
    public ConditionValue xdfgetUsernum1()
    { if (_usernum1 == null) { _usernum1 = nCV(); }
      return _usernum1; }
    protected ConditionValue xgetCValueUsernum1() { return xdfgetUsernum1(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Usernum1_Asc() { regOBA("USERNUM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Usernum1_Desc() { regOBD("USERNUM1"); return this; }

    protected ConditionValue _itemAdmin;
    public ConditionValue xdfgetItemAdmin()
    { if (_itemAdmin == null) { _itemAdmin = nCV(); }
      return _itemAdmin; }
    protected ConditionValue xgetCValueItemAdmin() { return xdfgetItemAdmin(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ItemAdmin_Asc() { regOBA("ITEM_ADMIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ItemAdmin_Desc() { regOBD("ITEM_ADMIN"); return this; }

    protected ConditionValue _tracekey;
    public ConditionValue xdfgetTracekey()
    { if (_tracekey == null) { _tracekey = nCV(); }
      return _tracekey; }
    protected ConditionValue xgetCValueTracekey() { return xdfgetTracekey(); }

    /**
     * Add order-by as ascend. <br>
     * TRACEKEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Tracekey_Asc() { regOBA("TRACEKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACEKEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Tracekey_Desc() { regOBD("TRACEKEY"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _factorycd;
    public ConditionValue xdfgetFactorycd()
    { if (_factorycd == null) { _factorycd = nCV(); }
      return _factorycd; }
    protected ConditionValue xgetCValueFactorycd() { return xdfgetFactorycd(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORYCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Factorycd_Asc() { regOBA("FACTORYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORYCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Factorycd_Desc() { regOBD("FACTORYCD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _skucd;
    public ConditionValue xdfgetSkucd()
    { if (_skucd == null) { _skucd = nCV(); }
      return _skucd; }
    protected ConditionValue xgetCValueSkucd() { return xdfgetSkucd(); }

    /**
     * Add order-by as ascend. <br>
     * SKUCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Skucd_Asc() { regOBA("SKUCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKUCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Skucd_Desc() { regOBD("SKUCD"); return this; }

    protected ConditionValue _destinationcd;
    public ConditionValue xdfgetDestinationcd()
    { if (_destinationcd == null) { _destinationcd = nCV(); }
      return _destinationcd; }
    protected ConditionValue xgetCValueDestinationcd() { return xdfgetDestinationcd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Destinationcd_Asc() { regOBA("DESTINATIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Destinationcd_Desc() { regOBD("DESTINATIONCD"); return this; }

    protected ConditionValue _manufacturecd;
    public ConditionValue xdfgetManufacturecd()
    { if (_manufacturecd == null) { _manufacturecd = nCV(); }
      return _manufacturecd; }
    protected ConditionValue xgetCValueManufacturecd() { return xdfgetManufacturecd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Manufacturecd_Asc() { regOBA("MANUFACTURECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Manufacturecd_Desc() { regOBD("MANUFACTURECD"); return this; }

    protected ConditionValue _orderno;
    public ConditionValue xdfgetOrderno()
    { if (_orderno == null) { _orderno = nCV(); }
      return _orderno; }
    protected ConditionValue xgetCValueOrderno() { return xdfgetOrderno(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Orderno_Asc() { regOBA("ORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Orderno_Desc() { regOBD("ORDERNO"); return this; }

    protected ConditionValue _machinemo;
    public ConditionValue xdfgetMachinemo()
    { if (_machinemo == null) { _machinemo = nCV(); }
      return _machinemo; }
    protected ConditionValue xgetCValueMachinemo() { return xdfgetMachinemo(); }

    /**
     * Add order-by as ascend. <br>
     * MACHINEMO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Machinemo_Asc() { regOBA("MACHINEMO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHINEMO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Machinemo_Desc() { regOBD("MACHINEMO"); return this; }

    protected ConditionValue _createno;
    public ConditionValue xdfgetCreateno()
    { if (_createno == null) { _createno = nCV(); }
      return _createno; }
    protected ConditionValue xgetCValueCreateno() { return xdfgetCreateno(); }

    /**
     * Add order-by as ascend. <br>
     * CREATENO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Createno_Asc() { regOBA("CREATENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATENO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Createno_Desc() { regOBD("CREATENO"); return this; }

    protected ConditionValue _limitdate;
    public ConditionValue xdfgetLimitdate()
    { if (_limitdate == null) { _limitdate = nCV(); }
      return _limitdate; }
    protected ConditionValue xgetCValueLimitdate() { return xdfgetLimitdate(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Limitdate_Asc() { regOBA("LIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Limitdate_Desc() { regOBD("LIMITDATE"); return this; }

    protected ConditionValue _datetime;
    public ConditionValue xdfgetDatetime()
    { if (_datetime == null) { _datetime = nCV(); }
      return _datetime; }
    protected ConditionValue xgetCValueDatetime() { return xdfgetDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Datetime_Asc() { regOBA("DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Datetime_Desc() { regOBD("DATETIME"); return this; }

    protected ConditionValue _distributioncd;
    public ConditionValue xdfgetDistributioncd()
    { if (_distributioncd == null) { _distributioncd = nCV(); }
      return _distributioncd; }
    protected ConditionValue xgetCValueDistributioncd() { return xdfgetDistributioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Distributioncd_Asc() { regOBA("DISTRIBUTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Distributioncd_Desc() { regOBD("DISTRIBUTIONCD"); return this; }

    protected ConditionValue _transportcd;
    public ConditionValue xdfgetTransportcd()
    { if (_transportcd == null) { _transportcd = nCV(); }
      return _transportcd; }
    protected ConditionValue xgetCValueTransportcd() { return xdfgetTransportcd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

    protected ConditionValue _palletid;
    public ConditionValue xdfgetPalletid()
    { if (_palletid == null) { _palletid = nCV(); }
      return _palletid; }
    protected ConditionValue xgetCValuePalletid() { return xdfgetPalletid(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Palletid_Asc() { regOBA("PALLETID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Palletid_Desc() { regOBD("PALLETID"); return this; }

    protected ConditionValue _initnum;
    public ConditionValue xdfgetInitnum()
    { if (_initnum == null) { _initnum = nCV(); }
      return _initnum; }
    protected ConditionValue xgetCValueInitnum() { return xdfgetInitnum(); }

    /**
     * Add order-by as ascend. <br>
     * INITNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Initnum_Asc() { regOBA("INITNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INITNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Initnum_Desc() { regOBD("INITNUM"); return this; }

    protected ConditionValue _createdatetime;
    public ConditionValue xdfgetCreatedatetime()
    { if (_createdatetime == null) { _createdatetime = nCV(); }
      return _createdatetime; }
    protected ConditionValue xgetCValueCreatedatetime() { return xdfgetCreatedatetime(); }

    /**
     * Add order-by as ascend. <br>
     * CREATEDATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Createdatetime_Asc() { regOBA("CREATEDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATEDATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Createdatetime_Desc() { regOBD("CREATEDATETIME"); return this; }

    protected ConditionValue _assortdatetime;
    public ConditionValue xdfgetAssortdatetime()
    { if (_assortdatetime == null) { _assortdatetime = nCV(); }
      return _assortdatetime; }
    protected ConditionValue xgetCValueAssortdatetime() { return xdfgetAssortdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortdatetime_Asc() { regOBA("ASSORTDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortdatetime_Desc() { regOBD("ASSORTDATETIME"); return this; }

    protected ConditionValue _tracetype;
    public ConditionValue xdfgetTracetype()
    { if (_tracetype == null) { _tracetype = nCV(); }
      return _tracetype; }
    protected ConditionValue xgetCValueTracetype() { return xdfgetTracetype(); }

    /**
     * Add order-by as ascend. <br>
     * TRACETYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Tracetype_Asc() { regOBA("TRACETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACETYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Tracetype_Desc() { regOBD("TRACETYPE"); return this; }

    protected ConditionValue _lineblock;
    public ConditionValue xdfgetLineblock()
    { if (_lineblock == null) { _lineblock = nCV(); }
      return _lineblock; }
    protected ConditionValue xgetCValueLineblock() { return xdfgetLineblock(); }

    /**
     * Add order-by as ascend. <br>
     * LINEBLOCK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Lineblock_Asc() { regOBA("LINEBLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINEBLOCK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Lineblock_Desc() { regOBD("LINEBLOCK"); return this; }

    protected ConditionValue _assortedunit;
    public ConditionValue xdfgetAssortedunit()
    { if (_assortedunit == null) { _assortedunit = nCV(); }
      return _assortedunit; }
    protected ConditionValue xgetCValueAssortedunit() { return xdfgetAssortedunit(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortedunit_Asc() { regOBA("ASSORTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortedunit_Desc() { regOBD("ASSORTEDUNIT"); return this; }

    protected ConditionValue _assortedindex;
    public ConditionValue xdfgetAssortedindex()
    { if (_assortedindex == null) { _assortedindex = nCV(); }
      return _assortedindex; }
    protected ConditionValue xgetCValueAssortedindex() { return xdfgetAssortedindex(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortedindex_Asc() { regOBA("ASSORTEDINDEX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortedindex_Desc() { regOBD("ASSORTEDINDEX"); return this; }

    protected ConditionValue _operationcode;
    public ConditionValue xdfgetOperationcode()
    { if (_operationcode == null) { _operationcode = nCV(); }
      return _operationcode; }
    protected ConditionValue xgetCValueOperationcode() { return xdfgetOperationcode(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATIONCODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Operationcode_Asc() { regOBA("OPERATIONCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATIONCODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Operationcode_Desc() { regOBD("OPERATIONCODE"); return this; }

    protected ConditionValue _caseinnum;
    public ConditionValue xdfgetCaseinnum()
    { if (_caseinnum == null) { _caseinnum = nCV(); }
      return _caseinnum; }
    protected ConditionValue xgetCValueCaseinnum() { return xdfgetCaseinnum(); }

    /**
     * Add order-by as ascend. <br>
     * CASEINNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Caseinnum_Asc() { regOBA("CASEINNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEINNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Caseinnum_Desc() { regOBD("CASEINNUM"); return this; }

    protected ConditionValue _assortnum;
    public ConditionValue xdfgetAssortnum()
    { if (_assortnum == null) { _assortnum = nCV(); }
      return _assortnum; }
    protected ConditionValue xgetCValueAssortnum() { return xdfgetAssortnum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortnum_Asc() { regOBA("ASSORTNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortnum_Desc() { regOBD("ASSORTNUM"); return this; }

    protected ConditionValue _assortdifnum;
    public ConditionValue xdfgetAssortdifnum()
    { if (_assortdifnum == null) { _assortdifnum = nCV(); }
      return _assortdifnum; }
    protected ConditionValue xgetCValueAssortdifnum() { return xdfgetAssortdifnum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortdifnum_Asc() { regOBA("ASSORTDIFNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Assortdifnum_Desc() { regOBD("ASSORTDIFNUM"); return this; }

    protected ConditionValue _directioncd;
    public ConditionValue xdfgetDirectioncd()
    { if (_directioncd == null) { _directioncd = nCV(); }
      return _directioncd; }
    protected ConditionValue xgetCValueDirectioncd() { return xdfgetDirectioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Directioncd_Asc() { regOBA("DIRECTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Directioncd_Desc() { regOBD("DIRECTIONCD"); return this; }

    protected ConditionValue _pistontype;
    public ConditionValue xdfgetPistontype()
    { if (_pistontype == null) { _pistontype = nCV(); }
      return _pistontype; }
    protected ConditionValue xgetCValuePistontype() { return xdfgetPistontype(); }

    /**
     * Add order-by as ascend. <br>
     * PISTONTYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Pistontype_Asc() { regOBA("PISTONTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTONTYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Pistontype_Desc() { regOBD("PISTONTYPE"); return this; }

    protected ConditionValue _customercd;
    public ConditionValue xdfgetCustomercd()
    { if (_customercd == null) { _customercd = nCV(); }
      return _customercd; }
    protected ConditionValue xgetCValueCustomercd() { return xdfgetCustomercd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMERCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Customercd_Asc() { regOBA("CUSTOMERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMERCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Customercd_Desc() { regOBD("CUSTOMERCD"); return this; }

    protected ConditionValue _directionnum;
    public ConditionValue xdfgetDirectionnum()
    { if (_directionnum == null) { _directionnum = nCV(); }
      return _directionnum; }
    protected ConditionValue xgetCValueDirectionnum() { return xdfgetDirectionnum(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Directionnum_Asc() { regOBA("DIRECTIONNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Directionnum_Desc() { regOBD("DIRECTIONNUM"); return this; }

    protected ConditionValue _distwarehousecd;
    public ConditionValue xdfgetDistwarehousecd()
    { if (_distwarehousecd == null) { _distwarehousecd = nCV(); }
      return _distwarehousecd; }
    protected ConditionValue xgetCValueDistwarehousecd() { return xdfgetDistwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Distwarehousecd_Asc() { regOBA("DISTWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Distwarehousecd_Desc() { regOBD("DISTWAREHOUSECD"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RCVKEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

    protected ConditionValue _itemcdWh;
    public ConditionValue xdfgetItemcdWh()
    { if (_itemcdWh == null) { _itemcdWh = nCV(); }
      return _itemcdWh; }
    protected ConditionValue xgetCValueItemcdWh() { return xdfgetItemcdWh(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_WH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ItemcdWh_Asc() { regOBA("ITEMCD_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_WH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ItemcdWh_Desc() { regOBD("ITEMCD_WH"); return this; }

    protected ConditionValue _designcd;
    public ConditionValue xdfgetDesigncd()
    { if (_designcd == null) { _designcd = nCV(); }
      return _designcd; }
    protected ConditionValue xgetCValueDesigncd() { return xdfgetDesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Designcd_Asc() { regOBA("DESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Designcd_Desc() { regOBD("DESIGNCD"); return this; }

    protected ConditionValue _invNum;
    public ConditionValue xdfgetInvNum()
    { if (_invNum == null) { _invNum = nCV(); }
      return _invNum; }
    protected ConditionValue xgetCValueInvNum() { return xdfgetInvNum(); }

    /**
     * Add order-by as ascend. <br>
     * INV_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_InvNum_Asc() { regOBA("INV_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INV_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_InvNum_Desc() { regOBD("INV_NUM"); return this; }

    protected ConditionValue _sortNum;
    public ConditionValue xdfgetSortNum()
    { if (_sortNum == null) { _sortNum = nCV(); }
      return _sortNum; }
    protected ConditionValue xgetCValueSortNum() { return xdfgetSortNum(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_SortNum_Asc() { regOBA("SORT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_SortNum_Desc() { regOBD("SORT_NUM"); return this; }

    protected ConditionValue _adoptNum;
    public ConditionValue xdfgetAdoptNum()
    { if (_adoptNum == null) { _adoptNum = nCV(); }
      return _adoptNum; }
    protected ConditionValue xgetCValueAdoptNum() { return xdfgetAdoptNum(); }

    /**
     * Add order-by as ascend. <br>
     * ADOPT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_AdoptNum_Asc() { regOBA("ADOPT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADOPT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_AdoptNum_Desc() { regOBD("ADOPT_NUM"); return this; }

    protected ConditionValue _dtExtdata2;
    public ConditionValue xdfgetDtExtdata2()
    { if (_dtExtdata2 == null) { _dtExtdata2 = nCV(); }
      return _dtExtdata2; }
    protected ConditionValue xgetCValueDtExtdata2() { return xdfgetDtExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

    protected ConditionValue _reservearea;
    public ConditionValue xdfgetReservearea()
    { if (_reservearea == null) { _reservearea = nCV(); }
      return _reservearea; }
    protected ConditionValue xgetCValueReservearea() { return xdfgetReservearea(); }

    /**
     * Add order-by as ascend. <br>
     * RESERVEAREA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Reservearea_Asc() { regOBA("RESERVEAREA"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESERVEAREA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_Reservearea_Desc() { regOBD("RESERVEAREA"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEProductTrackingDomesCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductTrackingDomesCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEProductTrackingDomesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEProductTrackingDomesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EProductTrackingDomesCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EProductTrackingDomesCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EProductTrackingDomesCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EProductTrackingDomesCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EProductTrackingDomesCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EProductTrackingDomesCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EProductTrackingDomesCQ> _myselfExistsMap;
    public Map<String, EProductTrackingDomesCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EProductTrackingDomesCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EProductTrackingDomesCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EProductTrackingDomesCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EProductTrackingDomesCB.class.getName(); }
    protected String xCQ() { return EProductTrackingDomesCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
