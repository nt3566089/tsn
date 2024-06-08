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
 * The base condition-query of T_TRTRACE.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrtraceCQ extends AbstractBsTTrtraceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrtraceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrtraceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRTRACE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrtraceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrtraceCIQ xcreateCIQ() {
        TTrtraceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrtraceCIQ xnewCIQ() {
        return new TTrtraceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRTRACE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrtraceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrtraceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trtraceId;
    public ConditionValue xdfgetTrtraceId()
    { if (_trtraceId == null) { _trtraceId = nCV(); }
      return _trtraceId; }
    protected ConditionValue xgetCValueTrtraceId() { return xdfgetTrtraceId(); }

    /**
     * Add order-by as ascend. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_TrtraceId_Asc() { regOBA("TRTRACE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_TrtraceId_Desc() { regOBD("TRTRACE_ID"); return this; }

    protected ConditionValue _tracekey;
    public ConditionValue xdfgetTracekey()
    { if (_tracekey == null) { _tracekey = nCV(); }
      return _tracekey; }
    protected ConditionValue xgetCValueTracekey() { return xdfgetTracekey(); }

    /**
     * Add order-by as ascend. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Tracekey_Asc() { regOBA("TRACEKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACEKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Tracekey_Desc() { regOBD("TRACEKEY"); return this; }

    protected ConditionValue _sndrcvdatetime;
    public ConditionValue xdfgetSndrcvdatetime()
    { if (_sndrcvdatetime == null) { _sndrcvdatetime = nCV(); }
      return _sndrcvdatetime; }
    protected ConditionValue xgetCValueSndrcvdatetime() { return xdfgetSndrcvdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Sndrcvdatetime_Asc() { regOBA("SNDRCVDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNDRCVDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Sndrcvdatetime_Desc() { regOBD("SNDRCVDATETIME"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _factorycd;
    public ConditionValue xdfgetFactorycd()
    { if (_factorycd == null) { _factorycd = nCV(); }
      return _factorycd; }
    protected ConditionValue xgetCValueFactorycd() { return xdfgetFactorycd(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Factorycd_Asc() { regOBA("FACTORYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Factorycd_Desc() { regOBD("FACTORYCD"); return this; }

    protected ConditionValue _itemcdCase;
    public ConditionValue xdfgetItemcdCase()
    { if (_itemcdCase == null) { _itemcdCase = nCV(); }
      return _itemcdCase; }
    protected ConditionValue xgetCValueItemcdCase() { return xdfgetItemcdCase(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ItemcdCase_Asc() { regOBA("ITEMCD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ItemcdCase_Desc() { regOBD("ITEMCD_CASE"); return this; }

    protected ConditionValue _skucd;
    public ConditionValue xdfgetSkucd()
    { if (_skucd == null) { _skucd = nCV(); }
      return _skucd; }
    protected ConditionValue xgetCValueSkucd() { return xdfgetSkucd(); }

    /**
     * Add order-by as ascend. <br>
     * SKUCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Skucd_Asc() { regOBA("SKUCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKUCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Skucd_Desc() { regOBD("SKUCD"); return this; }

    protected ConditionValue _destinationcd;
    public ConditionValue xdfgetDestinationcd()
    { if (_destinationcd == null) { _destinationcd = nCV(); }
      return _destinationcd; }
    protected ConditionValue xgetCValueDestinationcd() { return xdfgetDestinationcd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Destinationcd_Asc() { regOBA("DESTINATIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Destinationcd_Desc() { regOBD("DESTINATIONCD"); return this; }

    protected ConditionValue _manufacturecd;
    public ConditionValue xdfgetManufacturecd()
    { if (_manufacturecd == null) { _manufacturecd = nCV(); }
      return _manufacturecd; }
    protected ConditionValue xgetCValueManufacturecd() { return xdfgetManufacturecd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Manufacturecd_Asc() { regOBA("MANUFACTURECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Manufacturecd_Desc() { regOBD("MANUFACTURECD"); return this; }

    protected ConditionValue _orderno;
    public ConditionValue xdfgetOrderno()
    { if (_orderno == null) { _orderno = nCV(); }
      return _orderno; }
    protected ConditionValue xgetCValueOrderno() { return xdfgetOrderno(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Orderno_Asc() { regOBA("ORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Orderno_Desc() { regOBD("ORDERNO"); return this; }

    protected ConditionValue _machineno;
    public ConditionValue xdfgetMachineno()
    { if (_machineno == null) { _machineno = nCV(); }
      return _machineno; }
    protected ConditionValue xgetCValueMachineno() { return xdfgetMachineno(); }

    /**
     * Add order-by as ascend. <br>
     * MACHINENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Machineno_Asc() { regOBA("MACHINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHINENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Machineno_Desc() { regOBD("MACHINENO"); return this; }

    protected ConditionValue _createno;
    public ConditionValue xdfgetCreateno()
    { if (_createno == null) { _createno = nCV(); }
      return _createno; }
    protected ConditionValue xgetCValueCreateno() { return xdfgetCreateno(); }

    /**
     * Add order-by as ascend. <br>
     * CREATENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Createno_Asc() { regOBA("CREATENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Createno_Desc() { regOBD("CREATENO"); return this; }

    protected ConditionValue _limitdate;
    public ConditionValue xdfgetLimitdate()
    { if (_limitdate == null) { _limitdate = nCV(); }
      return _limitdate; }
    protected ConditionValue xgetCValueLimitdate() { return xdfgetLimitdate(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Limitdate_Asc() { regOBA("LIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Limitdate_Desc() { regOBD("LIMITDATE"); return this; }

    protected ConditionValue _datetime;
    public ConditionValue xdfgetDatetime()
    { if (_datetime == null) { _datetime = nCV(); }
      return _datetime; }
    protected ConditionValue xgetCValueDatetime() { return xdfgetDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * DATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Datetime_Asc() { regOBA("DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Datetime_Desc() { regOBD("DATETIME"); return this; }

    protected ConditionValue _distributioncd;
    public ConditionValue xdfgetDistributioncd()
    { if (_distributioncd == null) { _distributioncd = nCV(); }
      return _distributioncd; }
    protected ConditionValue xgetCValueDistributioncd() { return xdfgetDistributioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Distributioncd_Asc() { regOBA("DISTRIBUTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Distributioncd_Desc() { regOBD("DISTRIBUTIONCD"); return this; }

    protected ConditionValue _transportcd;
    public ConditionValue xdfgetTransportcd()
    { if (_transportcd == null) { _transportcd = nCV(); }
      return _transportcd; }
    protected ConditionValue xgetCValueTransportcd() { return xdfgetTransportcd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

    protected ConditionValue _palletid;
    public ConditionValue xdfgetPalletid()
    { if (_palletid == null) { _palletid = nCV(); }
      return _palletid; }
    protected ConditionValue xgetCValuePalletid() { return xdfgetPalletid(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Palletid_Asc() { regOBA("PALLETID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Palletid_Desc() { regOBD("PALLETID"); return this; }

    protected ConditionValue _initnum;
    public ConditionValue xdfgetInitnum()
    { if (_initnum == null) { _initnum = nCV(); }
      return _initnum; }
    protected ConditionValue xgetCValueInitnum() { return xdfgetInitnum(); }

    /**
     * Add order-by as ascend. <br>
     * INITNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Initnum_Asc() { regOBA("INITNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INITNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Initnum_Desc() { regOBD("INITNUM"); return this; }

    protected ConditionValue _createdatetime;
    public ConditionValue xdfgetCreatedatetime()
    { if (_createdatetime == null) { _createdatetime = nCV(); }
      return _createdatetime; }
    protected ConditionValue xgetCValueCreatedatetime() { return xdfgetCreatedatetime(); }

    /**
     * Add order-by as ascend. <br>
     * CREATEDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Createdatetime_Asc() { regOBA("CREATEDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATEDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Createdatetime_Desc() { regOBD("CREATEDATETIME"); return this; }

    protected ConditionValue _assortdatetime;
    public ConditionValue xdfgetAssortdatetime()
    { if (_assortdatetime == null) { _assortdatetime = nCV(); }
      return _assortdatetime; }
    protected ConditionValue xgetCValueAssortdatetime() { return xdfgetAssortdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortdatetime_Asc() { regOBA("ASSORTDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortdatetime_Desc() { regOBD("ASSORTDATETIME"); return this; }

    protected ConditionValue _tracetype;
    public ConditionValue xdfgetTracetype()
    { if (_tracetype == null) { _tracetype = nCV(); }
      return _tracetype; }
    protected ConditionValue xgetCValueTracetype() { return xdfgetTracetype(); }

    /**
     * Add order-by as ascend. <br>
     * TRACETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Tracetype_Asc() { regOBA("TRACETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Tracetype_Desc() { regOBD("TRACETYPE"); return this; }

    protected ConditionValue _lineblock;
    public ConditionValue xdfgetLineblock()
    { if (_lineblock == null) { _lineblock = nCV(); }
      return _lineblock; }
    protected ConditionValue xgetCValueLineblock() { return xdfgetLineblock(); }

    /**
     * Add order-by as ascend. <br>
     * LINEBLOCK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lineblock_Asc() { regOBA("LINEBLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINEBLOCK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lineblock_Desc() { regOBD("LINEBLOCK"); return this; }

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
    public BsTTrtraceCQ addOrderBy_Assortedunit_Asc() { regOBA("ASSORTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortedunit_Desc() { regOBD("ASSORTEDUNIT"); return this; }

    protected ConditionValue _assortedindex;
    public ConditionValue xdfgetAssortedindex()
    { if (_assortedindex == null) { _assortedindex = nCV(); }
      return _assortedindex; }
    protected ConditionValue xgetCValueAssortedindex() { return xdfgetAssortedindex(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortedindex_Asc() { regOBA("ASSORTEDINDEX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDINDEX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortedindex_Desc() { regOBD("ASSORTEDINDEX"); return this; }

    protected ConditionValue _operationcode;
    public ConditionValue xdfgetOperationcode()
    { if (_operationcode == null) { _operationcode = nCV(); }
      return _operationcode; }
    protected ConditionValue xgetCValueOperationcode() { return xdfgetOperationcode(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATIONCODE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Operationcode_Asc() { regOBA("OPERATIONCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATIONCODE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Operationcode_Desc() { regOBD("OPERATIONCODE"); return this; }

    protected ConditionValue _caseinnum;
    public ConditionValue xdfgetCaseinnum()
    { if (_caseinnum == null) { _caseinnum = nCV(); }
      return _caseinnum; }
    protected ConditionValue xgetCValueCaseinnum() { return xdfgetCaseinnum(); }

    /**
     * Add order-by as ascend. <br>
     * CASEINNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caseinnum_Asc() { regOBA("CASEINNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEINNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caseinnum_Desc() { regOBD("CASEINNUM"); return this; }

    protected ConditionValue _assortnum;
    public ConditionValue xdfgetAssortnum()
    { if (_assortnum == null) { _assortnum = nCV(); }
      return _assortnum; }
    protected ConditionValue xgetCValueAssortnum() { return xdfgetAssortnum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortnum_Asc() { regOBA("ASSORTNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortnum_Desc() { regOBD("ASSORTNUM"); return this; }

    protected ConditionValue _assortdifnum;
    public ConditionValue xdfgetAssortdifnum()
    { if (_assortdifnum == null) { _assortdifnum = nCV(); }
      return _assortdifnum; }
    protected ConditionValue xgetCValueAssortdifnum() { return xdfgetAssortdifnum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortdifnum_Asc() { regOBA("ASSORTDIFNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTDIFNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Assortdifnum_Desc() { regOBD("ASSORTDIFNUM"); return this; }

    protected ConditionValue _directioncd;
    public ConditionValue xdfgetDirectioncd()
    { if (_directioncd == null) { _directioncd = nCV(); }
      return _directioncd; }
    protected ConditionValue xgetCValueDirectioncd() { return xdfgetDirectioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Directioncd_Asc() { regOBA("DIRECTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Directioncd_Desc() { regOBD("DIRECTIONCD"); return this; }

    protected ConditionValue _pistontype;
    public ConditionValue xdfgetPistontype()
    { if (_pistontype == null) { _pistontype = nCV(); }
      return _pistontype; }
    protected ConditionValue xgetCValuePistontype() { return xdfgetPistontype(); }

    /**
     * Add order-by as ascend. <br>
     * PISTONTYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Pistontype_Asc() { regOBA("PISTONTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTONTYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Pistontype_Desc() { regOBD("PISTONTYPE"); return this; }

    protected ConditionValue _customercd;
    public ConditionValue xdfgetCustomercd()
    { if (_customercd == null) { _customercd = nCV(); }
      return _customercd; }
    protected ConditionValue xgetCValueCustomercd() { return xdfgetCustomercd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Customercd_Asc() { regOBA("CUSTOMERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Customercd_Desc() { regOBD("CUSTOMERCD"); return this; }

    protected ConditionValue _directionnum;
    public ConditionValue xdfgetDirectionnum()
    { if (_directionnum == null) { _directionnum = nCV(); }
      return _directionnum; }
    protected ConditionValue xgetCValueDirectionnum() { return xdfgetDirectionnum(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Directionnum_Asc() { regOBA("DIRECTIONNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Directionnum_Desc() { regOBD("DIRECTIONNUM"); return this; }

    protected ConditionValue _distwarehousecd;
    public ConditionValue xdfgetDistwarehousecd()
    { if (_distwarehousecd == null) { _distwarehousecd = nCV(); }
      return _distwarehousecd; }
    protected ConditionValue xgetCValueDistwarehousecd() { return xdfgetDistwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Distwarehousecd_Asc() { regOBA("DISTWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Distwarehousecd_Desc() { regOBD("DISTWAREHOUSECD"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RCVKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

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
    public BsTTrtraceCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemcdIn;
    public ConditionValue xdfgetItemcdIn()
    { if (_itemcdIn == null) { _itemcdIn = nCV(); }
      return _itemcdIn; }
    protected ConditionValue xgetCValueItemcdIn() { return xdfgetItemcdIn(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ItemcdIn_Asc() { regOBA("ITEMCD_IN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ItemcdIn_Desc() { regOBD("ITEMCD_IN"); return this; }

    protected ConditionValue _itemcdWh;
    public ConditionValue xdfgetItemcdWh()
    { if (_itemcdWh == null) { _itemcdWh = nCV(); }
      return _itemcdWh; }
    protected ConditionValue xgetCValueItemcdWh() { return xdfgetItemcdWh(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_WH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ItemcdWh_Asc() { regOBA("ITEMCD_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_WH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ItemcdWh_Desc() { regOBD("ITEMCD_WH"); return this; }

    protected ConditionValue _designcdCase;
    public ConditionValue xdfgetDesigncdCase()
    { if (_designcdCase == null) { _designcdCase = nCV(); }
      return _designcdCase; }
    protected ConditionValue xgetCValueDesigncdCase() { return xdfgetDesigncdCase(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DesigncdCase_Asc() { regOBA("DESIGNCD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DesigncdCase_Desc() { regOBD("DESIGNCD_CASE"); return this; }

    protected ConditionValue _designcdIn;
    public ConditionValue xdfgetDesigncdIn()
    { if (_designcdIn == null) { _designcdIn = nCV(); }
      return _designcdIn; }
    protected ConditionValue xgetCValueDesigncdIn() { return xdfgetDesigncdIn(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DesigncdIn_Asc() { regOBA("DESIGNCD_IN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DesigncdIn_Desc() { regOBD("DESIGNCD_IN"); return this; }

    protected ConditionValue _designcdWh;
    public ConditionValue xdfgetDesigncdWh()
    { if (_designcdWh == null) { _designcdWh = nCV(); }
      return _designcdWh; }
    protected ConditionValue xgetCValueDesigncdWh() { return xdfgetDesigncdWh(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DesigncdWh_Asc() { regOBA("DESIGNCD_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DesigncdWh_Desc() { regOBD("DESIGNCD_WH"); return this; }

    protected ConditionValue _sourcecasecd;
    public ConditionValue xdfgetSourcecasecd()
    { if (_sourcecasecd == null) { _sourcecasecd = nCV(); }
      return _sourcecasecd; }
    protected ConditionValue xgetCValueSourcecasecd() { return xdfgetSourcecasecd(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Sourcecasecd_Asc() { regOBA("SOURCECASECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCECASECD: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Sourcecasecd_Desc() { regOBD("SOURCECASECD"); return this; }

    protected ConditionValue _sendflg;
    public ConditionValue xdfgetSendflg()
    { if (_sendflg == null) { _sendflg = nCV(); }
      return _sendflg; }
    protected ConditionValue xgetCValueSendflg() { return xdfgetSendflg(); }

    /**
     * Add order-by as ascend. <br>
     * SENDFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Sendflg_Asc() { regOBA("SENDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Sendflg_Desc() { regOBD("SENDFLG"); return this; }

    protected ConditionValue _fromflg;
    public ConditionValue xdfgetFromflg()
    { if (_fromflg == null) { _fromflg = nCV(); }
      return _fromflg; }
    protected ConditionValue xgetCValueFromflg() { return xdfgetFromflg(); }

    /**
     * Add order-by as ascend. <br>
     * FROMFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Fromflg_Asc() { regOBA("FROMFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Fromflg_Desc() { regOBD("FROMFLG"); return this; }

    protected ConditionValue _supplierrcvno;
    public ConditionValue xdfgetSupplierrcvno()
    { if (_supplierrcvno == null) { _supplierrcvno = nCV(); }
      return _supplierrcvno; }
    protected ConditionValue xgetCValueSupplierrcvno() { return xdfgetSupplierrcvno(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Supplierrcvno_Asc() { regOBA("SUPPLIERRCVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Supplierrcvno_Desc() { regOBD("SUPPLIERRCVNO"); return this; }

    protected ConditionValue _mixedflg;
    public ConditionValue xdfgetMixedflg()
    { if (_mixedflg == null) { _mixedflg = nCV(); }
      return _mixedflg; }
    protected ConditionValue xgetCValueMixedflg() { return xdfgetMixedflg(); }

    /**
     * Add order-by as ascend. <br>
     * MIXEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Mixedflg_Asc() { regOBA("MIXEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIXEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Mixedflg_Desc() { regOBD("MIXEDFLG"); return this; }

    protected ConditionValue _symbolpastdate;
    public ConditionValue xdfgetSymbolpastdate()
    { if (_symbolpastdate == null) { _symbolpastdate = nCV(); }
      return _symbolpastdate; }
    protected ConditionValue xgetCValueSymbolpastdate() { return xdfgetSymbolpastdate(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Symbolpastdate_Asc() { regOBA("SYMBOLPASTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Symbolpastdate_Desc() { regOBD("SYMBOLPASTDATE"); return this; }

    protected ConditionValue _lot1;
    public ConditionValue xdfgetLot1()
    { if (_lot1 == null) { _lot1 = nCV(); }
      return _lot1; }
    protected ConditionValue xgetCValueLot1() { return xdfgetLot1(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _lot2;
    public ConditionValue xdfgetLot2()
    { if (_lot2 == null) { _lot2 = nCV(); }
      return _lot2; }
    protected ConditionValue xgetCValueLot2() { return xdfgetLot2(); }

    /**
     * Add order-by as ascend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

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
    public BsTTrtraceCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _lot4;
    public ConditionValue xdfgetLot4()
    { if (_lot4 == null) { _lot4 = nCV(); }
      return _lot4; }
    protected ConditionValue xgetCValueLot4() { return xdfgetLot4(); }

    /**
     * Add order-by as ascend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _otherlot1;
    public ConditionValue xdfgetOtherlot1()
    { if (_otherlot1 == null) { _otherlot1 = nCV(); }
      return _otherlot1; }
    protected ConditionValue xgetCValueOtherlot1() { return xdfgetOtherlot1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

    protected ConditionValue _makercaseno;
    public ConditionValue xdfgetMakercaseno()
    { if (_makercaseno == null) { _makercaseno = nCV(); }
      return _makercaseno; }
    protected ConditionValue xgetCValueMakercaseno() { return xdfgetMakercaseno(); }

    /**
     * Add order-by as ascend. <br>
     * MAKERCASENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Makercaseno_Asc() { regOBA("MAKERCASENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKERCASENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Makercaseno_Desc() { regOBD("MAKERCASENO"); return this; }

    protected ConditionValue _lendflg;
    public ConditionValue xdfgetLendflg()
    { if (_lendflg == null) { _lendflg = nCV(); }
      return _lendflg; }
    protected ConditionValue xgetCValueLendflg() { return xdfgetLendflg(); }

    /**
     * Add order-by as ascend. <br>
     * LENDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lendflg_Asc() { regOBA("LENDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Lendflg_Desc() { regOBD("LENDFLG"); return this; }

    protected ConditionValue _caseinnumcalc;
    public ConditionValue xdfgetCaseinnumcalc()
    { if (_caseinnumcalc == null) { _caseinnumcalc = nCV(); }
      return _caseinnumcalc; }
    protected ConditionValue xgetCValueCaseinnumcalc() { return xdfgetCaseinnumcalc(); }

    /**
     * Add order-by as ascend. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caseinnumcalc_Asc() { regOBA("CASEINNUMCALC"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEINNUMCALC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caseinnumcalc_Desc() { regOBD("CASEINNUMCALC"); return this; }

    protected ConditionValue _caseitfno;
    public ConditionValue xdfgetCaseitfno()
    { if (_caseitfno == null) { _caseitfno = nCV(); }
      return _caseitfno; }
    protected ConditionValue xgetCValueCaseitfno() { return xdfgetCaseitfno(); }

    /**
     * Add order-by as ascend. <br>
     * CASEITFNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caseitfno_Asc() { regOBA("CASEITFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEITFNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caseitfno_Desc() { regOBD("CASEITFNO"); return this; }

    protected ConditionValue _casebarcodevaliant;
    public ConditionValue xdfgetCasebarcodevaliant()
    { if (_casebarcodevaliant == null) { _casebarcodevaliant = nCV(); }
      return _casebarcodevaliant; }
    protected ConditionValue xgetCValueCasebarcodevaliant() { return xdfgetCasebarcodevaliant(); }

    /**
     * Add order-by as ascend. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casebarcodevaliant_Asc() { regOBA("CASEBARCODEVALIANT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casebarcodevaliant_Desc() { regOBD("CASEBARCODEVALIANT"); return this; }

    protected ConditionValue _caselot4;
    public ConditionValue xdfgetCaselot4()
    { if (_caselot4 == null) { _caselot4 = nCV(); }
      return _caselot4; }
    protected ConditionValue xgetCValueCaselot4() { return xdfgetCaselot4(); }

    /**
     * Add order-by as ascend. <br>
     * CASELOT4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caselot4_Asc() { regOBA("CASELOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASELOT4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caselot4_Desc() { regOBD("CASELOT4"); return this; }

    protected ConditionValue _casecenterno;
    public ConditionValue xdfgetCasecenterno()
    { if (_casecenterno == null) { _casecenterno = nCV(); }
      return _casecenterno; }
    protected ConditionValue xgetCValueCasecenterno() { return xdfgetCasecenterno(); }

    /**
     * Add order-by as ascend. <br>
     * CASECENTERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casecenterno_Asc() { regOBA("CASECENTERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASECENTERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casecenterno_Desc() { regOBD("CASECENTERNO"); return this; }

    protected ConditionValue _casepackno;
    public ConditionValue xdfgetCasepackno()
    { if (_casepackno == null) { _casepackno = nCV(); }
      return _casepackno; }
    protected ConditionValue xgetCValueCasepackno() { return xdfgetCasepackno(); }

    /**
     * Add order-by as ascend. <br>
     * CASEPACKNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casepackno_Asc() { regOBA("CASEPACKNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEPACKNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casepackno_Desc() { regOBD("CASEPACKNO"); return this; }

    protected ConditionValue _casepacktime;
    public ConditionValue xdfgetCasepacktime()
    { if (_casepacktime == null) { _casepacktime = nCV(); }
      return _casepacktime; }
    protected ConditionValue xgetCValueCasepacktime() { return xdfgetCasepacktime(); }

    /**
     * Add order-by as ascend. <br>
     * CASEPACKTIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casepacktime_Asc() { regOBA("CASEPACKTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEPACKTIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casepacktime_Desc() { regOBD("CASEPACKTIME"); return this; }

    protected ConditionValue _casebarcode;
    public ConditionValue xdfgetCasebarcode()
    { if (_casebarcode == null) { _casebarcode = nCV(); }
      return _casebarcode; }
    protected ConditionValue xgetCValueCasebarcode() { return xdfgetCasebarcode(); }

    /**
     * Add order-by as ascend. <br>
     * CASEBARCODE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casebarcode_Asc() { regOBA("CASEBARCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEBARCODE: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casebarcode_Desc() { regOBD("CASEBARCODE"); return this; }

    protected ConditionValue _otherrefno2;
    public ConditionValue xdfgetOtherrefno2()
    { if (_otherrefno2 == null) { _otherrefno2 = nCV(); }
      return _otherrefno2; }
    protected ConditionValue xgetCValueOtherrefno2() { return xdfgetOtherrefno2(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Otherrefno2_Asc() { regOBA("OTHERREFNO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Otherrefno2_Desc() { regOBD("OTHERREFNO2"); return this; }

    protected ConditionValue _ordertype;
    public ConditionValue xdfgetOrdertype()
    { if (_ordertype == null) { _ordertype = nCV(); }
      return _ordertype; }
    protected ConditionValue xgetCValueOrdertype() { return xdfgetOrdertype(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Ordertype_Asc() { regOBA("ORDERTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Ordertype_Desc() { regOBD("ORDERTYPE"); return this; }

    protected ConditionValue _limitdatenow;
    public ConditionValue xdfgetLimitdatenow()
    { if (_limitdatenow == null) { _limitdatenow = nCV(); }
      return _limitdatenow; }
    protected ConditionValue xgetCValueLimitdatenow() { return xdfgetLimitdatenow(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDATENOW: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Limitdatenow_Asc() { regOBA("LIMITDATENOW"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATENOW: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Limitdatenow_Desc() { regOBD("LIMITDATENOW"); return this; }

    protected ConditionValue _casecreatetype;
    public ConditionValue xdfgetCasecreatetype()
    { if (_casecreatetype == null) { _casecreatetype = nCV(); }
      return _casecreatetype; }
    protected ConditionValue xgetCValueCasecreatetype() { return xdfgetCasecreatetype(); }

    /**
     * Add order-by as ascend. <br>
     * CASECREATETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casecreatetype_Asc() { regOBA("CASECREATETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASECREATETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Casecreatetype_Desc() { regOBD("CASECREATETYPE"); return this; }

    protected ConditionValue _receivedate;
    public ConditionValue xdfgetReceivedate()
    { if (_receivedate == null) { _receivedate = nCV(); }
      return _receivedate; }
    protected ConditionValue xgetCValueReceivedate() { return xdfgetReceivedate(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _arrivalportdate;
    public ConditionValue xdfgetArrivalportdate()
    { if (_arrivalportdate == null) { _arrivalportdate = nCV(); }
      return _arrivalportdate; }
    protected ConditionValue xgetCValueArrivalportdate() { return xdfgetArrivalportdate(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Arrivalportdate_Asc() { regOBA("ARRIVALPORTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Arrivalportdate_Desc() { regOBD("ARRIVALPORTDATE"); return this; }

    protected ConditionValue _shipname;
    public ConditionValue xdfgetShipname()
    { if (_shipname == null) { _shipname = nCV(); }
      return _shipname; }
    protected ConditionValue xgetCValueShipname() { return xdfgetShipname(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Shipname_Asc() { regOBA("SHIPNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Shipname_Desc() { regOBD("SHIPNAME"); return this; }

    protected ConditionValue _locgroup;
    public ConditionValue xdfgetLocgroup()
    { if (_locgroup == null) { _locgroup = nCV(); }
      return _locgroup; }
    protected ConditionValue xgetCValueLocgroup() { return xdfgetLocgroup(); }

    /**
     * Add order-by as ascend. <br>
     * LOCGROUP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Locgroup_Asc() { regOBA("LOCGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCGROUP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Locgroup_Desc() { regOBD("LOCGROUP"); return this; }

    protected ConditionValue _loccd;
    public ConditionValue xdfgetLoccd()
    { if (_loccd == null) { _loccd = nCV(); }
      return _loccd; }
    protected ConditionValue xgetCValueLoccd() { return xdfgetLoccd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

    protected ConditionValue _shipdate;
    public ConditionValue xdfgetShipdate()
    { if (_shipdate == null) { _shipdate = nCV(); }
      return _shipdate; }
    protected ConditionValue xgetCValueShipdate() { return xdfgetShipdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Shipdate_Asc() { regOBA("SHIPDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Shipdate_Desc() { regOBD("SHIPDATE"); return this; }

    protected ConditionValue _shiptocd;
    public ConditionValue xdfgetShiptocd()
    { if (_shiptocd == null) { _shiptocd = nCV(); }
      return _shiptocd; }
    protected ConditionValue xgetCValueShiptocd() { return xdfgetShiptocd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Shiptocd_Asc() { regOBA("SHIPTOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Shiptocd_Desc() { regOBD("SHIPTOCD"); return this; }

    protected ConditionValue _examsts;
    public ConditionValue xdfgetExamsts()
    { if (_examsts == null) { _examsts = nCV(); }
      return _examsts; }
    protected ConditionValue xgetCValueExamsts() { return xdfgetExamsts(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMSTS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Examsts_Asc() { regOBA("EXAMSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMSTS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Examsts_Desc() { regOBD("EXAMSTS"); return this; }

    protected ConditionValue _tokuhancd;
    public ConditionValue xdfgetTokuhancd()
    { if (_tokuhancd == null) { _tokuhancd = nCV(); }
      return _tokuhancd; }
    protected ConditionValue xgetCValueTokuhancd() { return xdfgetTokuhancd(); }

    /**
     * Add order-by as ascend. <br>
     * TOKUHANCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Tokuhancd_Asc() { regOBA("TOKUHANCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOKUHANCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Tokuhancd_Desc() { regOBD("TOKUHANCD"); return this; }

    protected ConditionValue _senderLocation;
    public ConditionValue xdfgetSenderLocation()
    { if (_senderLocation == null) { _senderLocation = nCV(); }
      return _senderLocation; }
    protected ConditionValue xgetCValueSenderLocation() { return xdfgetSenderLocation(); }

    /**
     * Add order-by as ascend. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_SenderLocation_Asc() { regOBA("SENDER_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_SenderLocation_Desc() { regOBD("SENDER_LOCATION"); return this; }

    protected ConditionValue _receiverLocation;
    public ConditionValue xdfgetReceiverLocation()
    { if (_receiverLocation == null) { _receiverLocation = nCV(); }
      return _receiverLocation; }
    protected ConditionValue xgetCValueReceiverLocation() { return xdfgetReceiverLocation(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ReceiverLocation_Asc() { regOBA("RECEIVER_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ReceiverLocation_Desc() { regOBD("RECEIVER_LOCATION"); return this; }

    protected ConditionValue _shipmentId;
    public ConditionValue xdfgetShipmentId()
    { if (_shipmentId == null) { _shipmentId = nCV(); }
      return _shipmentId; }
    protected ConditionValue xgetCValueShipmentId() { return xdfgetShipmentId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ShipmentId_Asc() { regOBA("SHIPMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ShipmentId_Desc() { regOBD("SHIPMENT_ID"); return this; }

    protected ConditionValue _shipmentDate;
    public ConditionValue xdfgetShipmentDate()
    { if (_shipmentDate == null) { _shipmentDate = nCV(); }
      return _shipmentDate; }
    protected ConditionValue xgetCValueShipmentDate() { return xdfgetShipmentDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ShipmentDate_Asc() { regOBA("SHIPMENT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ShipmentDate_Desc() { regOBD("SHIPMENT_DATE"); return this; }

    protected ConditionValue _numberOfPallets;
    public ConditionValue xdfgetNumberOfPallets()
    { if (_numberOfPallets == null) { _numberOfPallets = nCV(); }
      return _numberOfPallets; }
    protected ConditionValue xgetCValueNumberOfPallets() { return xdfgetNumberOfPallets(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_NumberOfPallets_Asc() { regOBA("NUMBER_OF_PALLETS"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_NumberOfPallets_Desc() { regOBD("NUMBER_OF_PALLETS"); return this; }

    protected ConditionValue _carrierno;
    public ConditionValue xdfgetCarrierno()
    { if (_carrierno == null) { _carrierno = nCV(); }
      return _carrierno; }
    protected ConditionValue xgetCValueCarrierno() { return xdfgetCarrierno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

    protected ConditionValue _tkhnorderno;
    public ConditionValue xdfgetTkhnorderno()
    { if (_tkhnorderno == null) { _tkhnorderno = nCV(); }
      return _tkhnorderno; }
    protected ConditionValue xgetCValueTkhnorderno() { return xdfgetTkhnorderno(); }

    /**
     * Add order-by as ascend. <br>
     * TKHNORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Tkhnorderno_Asc() { regOBA("TKHNORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TKHNORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Tkhnorderno_Desc() { regOBD("TKHNORDERNO"); return this; }

    protected ConditionValue _srccd;
    public ConditionValue xdfgetSrccd()
    { if (_srccd == null) { _srccd = nCV(); }
      return _srccd; }
    protected ConditionValue xgetCValueSrccd() { return xdfgetSrccd(); }

    /**
     * Add order-by as ascend. <br>
     * SRCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Srccd_Asc() { regOBA("SRCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Srccd_Desc() { regOBD("SRCCD"); return this; }

    protected ConditionValue _blno;
    public ConditionValue xdfgetBlno()
    { if (_blno == null) { _blno = nCV(); }
      return _blno; }
    protected ConditionValue xgetCValueBlno() { return xdfgetBlno(); }

    /**
     * Add order-by as ascend. <br>
     * BLNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Blno_Asc() { regOBA("BLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Blno_Desc() { regOBD("BLNO"); return this; }

    protected ConditionValue _invoiceno;
    public ConditionValue xdfgetInvoiceno()
    { if (_invoiceno == null) { _invoiceno = nCV(); }
      return _invoiceno; }
    protected ConditionValue xgetCValueInvoiceno() { return xdfgetInvoiceno(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Invoiceno_Asc() { regOBA("INVOICENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Invoiceno_Desc() { regOBD("INVOICENO"); return this; }

    protected ConditionValue _sscc;
    public ConditionValue xdfgetSscc()
    { if (_sscc == null) { _sscc = nCV(); }
      return _sscc; }
    protected ConditionValue xgetCValueSscc() { return xdfgetSscc(); }

    /**
     * Add order-by as ascend. <br>
     * SSCC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Sscc_Asc() { regOBA("SSCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSCC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Sscc_Desc() { regOBD("SSCC"); return this; }

    protected ConditionValue _caseno;
    public ConditionValue xdfgetCaseno()
    { if (_caseno == null) { _caseno = nCV(); }
      return _caseno; }
    protected ConditionValue xgetCValueCaseno() { return xdfgetCaseno(); }

    /**
     * Add order-by as ascend. <br>
     * CASENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caseno_Asc() { regOBA("CASENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Caseno_Desc() { regOBD("CASENO"); return this; }

    protected ConditionValue _invNum;
    public ConditionValue xdfgetInvNum()
    { if (_invNum == null) { _invNum = nCV(); }
      return _invNum; }
    protected ConditionValue xgetCValueInvNum() { return xdfgetInvNum(); }

    /**
     * Add order-by as ascend. <br>
     * INV_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_InvNum_Asc() { regOBA("INV_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INV_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_InvNum_Desc() { regOBD("INV_NUM"); return this; }

    protected ConditionValue _sortNum;
    public ConditionValue xdfgetSortNum()
    { if (_sortNum == null) { _sortNum = nCV(); }
      return _sortNum; }
    protected ConditionValue xgetCValueSortNum() { return xdfgetSortNum(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_SortNum_Asc() { regOBA("SORT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_SortNum_Desc() { regOBD("SORT_NUM"); return this; }

    protected ConditionValue _adoptNum;
    public ConditionValue xdfgetAdoptNum()
    { if (_adoptNum == null) { _adoptNum = nCV(); }
      return _adoptNum; }
    protected ConditionValue xgetCValueAdoptNum() { return xdfgetAdoptNum(); }

    /**
     * Add order-by as ascend. <br>
     * ADOPT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_AdoptNum_Asc() { regOBA("ADOPT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADOPT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_AdoptNum_Desc() { regOBD("ADOPT_NUM"); return this; }

    protected ConditionValue _reservearea;
    public ConditionValue xdfgetReservearea()
    { if (_reservearea == null) { _reservearea = nCV(); }
      return _reservearea; }
    protected ConditionValue xgetCValueReservearea() { return xdfgetReservearea(); }

    /**
     * Add order-by as ascend. <br>
     * RESERVEAREA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Reservearea_Asc() { regOBA("RESERVEAREA"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESERVEAREA: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_Reservearea_Desc() { regOBD("RESERVEAREA"); return this; }

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
    public BsTTrtraceCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

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
    public BsTTrtraceCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

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
    public BsTTrtraceCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

    protected ConditionValue _dtExtdata2;
    public ConditionValue xdfgetDtExtdata2()
    { if (_dtExtdata2 == null) { _dtExtdata2 = nCV(); }
      return _dtExtdata2; }
    protected ConditionValue xgetCValueDtExtdata2() { return xdfgetDtExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

    protected ConditionValue _palletNo;
    public ConditionValue xdfgetPalletNo()
    { if (_palletNo == null) { _palletNo = nCV(); }
      return _palletNo; }
    protected ConditionValue xgetCValuePalletNo() { return xdfgetPalletNo(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_PalletNo_Asc() { regOBA("PALLET_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_PalletNo_Desc() { regOBD("PALLET_NO"); return this; }

    protected ConditionValue _pickListKey;
    public ConditionValue xdfgetPickListKey()
    { if (_pickListKey == null) { _pickListKey = nCV(); }
      return _pickListKey; }
    protected ConditionValue xgetCValuePickListKey() { return xdfgetPickListKey(); }

    /**
     * Add order-by as ascend. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_PickListKey_Asc() { regOBA("PICK_LIST_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICK_LIST_KEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_PickListKey_Desc() { regOBD("PICK_LIST_KEY"); return this; }

    protected ConditionValue _frontBackCaseCd;
    public ConditionValue xdfgetFrontBackCaseCd()
    { if (_frontBackCaseCd == null) { _frontBackCaseCd = nCV(); }
      return _frontBackCaseCd; }
    protected ConditionValue xgetCValueFrontBackCaseCd() { return xdfgetFrontBackCaseCd(); }

    /**
     * Add order-by as ascend. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_FrontBackCaseCd_Asc() { regOBA("FRONT_BACK_CASE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_FrontBackCaseCd_Desc() { regOBD("FRONT_BACK_CASE_CD"); return this; }

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
    public BsTTrtraceCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _transportPriority;
    public ConditionValue xdfgetTransportPriority()
    { if (_transportPriority == null) { _transportPriority = nCV(); }
      return _transportPriority; }
    protected ConditionValue xgetCValueTransportPriority() { return xdfgetTransportPriority(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_TransportPriority_Asc() { regOBA("TRANSPORT_PRIORITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_TransportPriority_Desc() { regOBD("TRANSPORT_PRIORITY"); return this; }

    protected ConditionValue _useType;
    public ConditionValue xdfgetUseType()
    { if (_useType == null) { _useType = nCV(); }
      return _useType; }
    protected ConditionValue xgetCValueUseType() { return xdfgetUseType(); }

    /**
     * Add order-by as ascend. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_UseType_Asc() { regOBA("USE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * USE_TYPE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_UseType_Desc() { regOBD("USE_TYPE"); return this; }

    protected ConditionValue _outputOrder;
    public ConditionValue xdfgetOutputOrder()
    { if (_outputOrder == null) { _outputOrder = nCV(); }
      return _outputOrder; }
    protected ConditionValue xgetCValueOutputOrder() { return xdfgetOutputOrder(); }

    /**
     * Add order-by as ascend. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_OutputOrder_Asc() { regOBA("OUTPUT_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * OUTPUT_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_OutputOrder_Desc() { regOBD("OUTPUT_ORDER"); return this; }

    protected ConditionValue _factoryOrder;
    public ConditionValue xdfgetFactoryOrder()
    { if (_factoryOrder == null) { _factoryOrder = nCV(); }
      return _factoryOrder; }
    protected ConditionValue xgetCValueFactoryOrder() { return xdfgetFactoryOrder(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_FactoryOrder_Asc() { regOBA("FACTORY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORY_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_FactoryOrder_Desc() { regOBD("FACTORY_ORDER"); return this; }

    protected ConditionValue _warehouseOrder;
    public ConditionValue xdfgetWarehouseOrder()
    { if (_warehouseOrder == null) { _warehouseOrder = nCV(); }
      return _warehouseOrder; }
    protected ConditionValue xgetCValueWarehouseOrder() { return xdfgetWarehouseOrder(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_WarehouseOrder_Asc() { regOBA("WAREHOUSE_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_WarehouseOrder_Desc() { regOBD("WAREHOUSE_ORDER"); return this; }

    protected ConditionValue _lineblockOrder;
    public ConditionValue xdfgetLineblockOrder()
    { if (_lineblockOrder == null) { _lineblockOrder = nCV(); }
      return _lineblockOrder; }
    protected ConditionValue xgetCValueLineblockOrder() { return xdfgetLineblockOrder(); }

    /**
     * Add order-by as ascend. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_LineblockOrder_Asc() { regOBA("LINEBLOCK_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINEBLOCK_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_LineblockOrder_Desc() { regOBD("LINEBLOCK_ORDER"); return this; }

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
    public BsTTrtraceCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrtraceCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrtraceCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrtraceCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrtraceCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrtraceCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrtraceCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrtraceCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrtraceCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrtraceCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrtraceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrtraceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrtraceCQ bq = (TTrtraceCQ)bqs;
        TTrtraceCQ uq = (TTrtraceCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
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
        String nrp = xresolveNRP("T_TRTRACE", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_TRTRACE", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrtraceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrtraceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrtraceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrtraceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrtraceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrtraceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrtraceCQ> _myselfExistsMap;
    public Map<String, TTrtraceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrtraceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrtraceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrtraceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrtraceCB.class.getName(); }
    protected String xCQ() { return TTrtraceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
