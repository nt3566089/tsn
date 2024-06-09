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
 * The base condition-query of M_MFWHxITEM.
 * @author DBFlute(AutoGenerator)
 */
public class BsMMfwhxitemCQ extends AbstractBsMMfwhxitemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MMfwhxitemCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMMfwhxitemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_MFWHxITEM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MMfwhxitemCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MMfwhxitemCIQ xcreateCIQ() {
        MMfwhxitemCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MMfwhxitemCIQ xnewCIQ() {
        return new MMfwhxitemCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_MFWHxITEM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MMfwhxitemCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MMfwhxitemCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _mfwhItemId;
    public ConditionValue xdfgetMfwhItemId()
    { if (_mfwhItemId == null) { _mfwhItemId = nCV(); }
      return _mfwhItemId; }
    protected ConditionValue xgetCValueMfwhItemId() { return xdfgetMfwhItemId(); }

    /**
     * Add order-by as ascend. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_MfwhItemId_Asc() { regOBA("MFWH_ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_MfwhItemId_Desc() { regOBD("MFWH_ITEM_ID"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _slotlocname;
    public ConditionValue xdfgetSlotlocname()
    { if (_slotlocname == null) { _slotlocname = nCV(); }
      return _slotlocname; }
    protected ConditionValue xgetCValueSlotlocname() { return xdfgetSlotlocname(); }

    /**
     * Add order-by as ascend. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Slotlocname_Asc() { regOBA("SLOTLOCNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Slotlocname_Desc() { regOBD("SLOTLOCNAME"); return this; }

    protected ConditionValue _picklocname;
    public ConditionValue xdfgetPicklocname()
    { if (_picklocname == null) { _picklocname = nCV(); }
      return _picklocname; }
    protected ConditionValue xgetCValuePicklocname() { return xdfgetPicklocname(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLOCNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Picklocname_Asc() { regOBA("PICKLOCNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLOCNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Picklocname_Desc() { regOBD("PICKLOCNAME"); return this; }

    protected ConditionValue _physicaltype;
    public ConditionValue xdfgetPhysicaltype()
    { if (_physicaltype == null) { _physicaltype = nCV(); }
      return _physicaltype; }
    protected ConditionValue xgetCValuePhysicaltype() { return xdfgetPhysicaltype(); }

    /**
     * Add order-by as ascend. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Physicaltype_Asc() { regOBA("PHYSICALTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Physicaltype_Desc() { regOBD("PHYSICALTYPE"); return this; }

    protected ConditionValue _physicalcycle;
    public ConditionValue xdfgetPhysicalcycle()
    { if (_physicalcycle == null) { _physicalcycle = nCV(); }
      return _physicalcycle; }
    protected ConditionValue xgetCValuePhysicalcycle() { return xdfgetPhysicalcycle(); }

    /**
     * Add order-by as ascend. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Physicalcycle_Asc() { regOBA("PHYSICALCYCLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Physicalcycle_Desc() { regOBD("PHYSICALCYCLE"); return this; }

    protected ConditionValue _physicalgroup;
    public ConditionValue xdfgetPhysicalgroup()
    { if (_physicalgroup == null) { _physicalgroup = nCV(); }
      return _physicalgroup; }
    protected ConditionValue xgetCValuePhysicalgroup() { return xdfgetPhysicalgroup(); }

    /**
     * Add order-by as ascend. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Physicalgroup_Asc() { regOBA("PHYSICALGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Physicalgroup_Desc() { regOBD("PHYSICALGROUP"); return this; }

    protected ConditionValue _physicaldate;
    public ConditionValue xdfgetPhysicaldate()
    { if (_physicaldate == null) { _physicaldate = nCV(); }
      return _physicaldate; }
    protected ConditionValue xgetCValuePhysicaldate() { return xdfgetPhysicaldate(); }

    /**
     * Add order-by as ascend. <br>
     * PHYSICALDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Physicaldate_Asc() { regOBA("PHYSICALDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHYSICALDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Physicaldate_Desc() { regOBD("PHYSICALDATE"); return this; }

    protected ConditionValue _reordertype;
    public ConditionValue xdfgetReordertype()
    { if (_reordertype == null) { _reordertype = nCV(); }
      return _reordertype; }
    protected ConditionValue xgetCValueReordertype() { return xdfgetReordertype(); }

    /**
     * Add order-by as ascend. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reordertype_Asc() { regOBA("REORDERTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reordertype_Desc() { regOBD("REORDERTYPE"); return this; }

    protected ConditionValue _reorderinterval;
    public ConditionValue xdfgetReorderinterval()
    { if (_reorderinterval == null) { _reorderinterval = nCV(); }
      return _reorderinterval; }
    protected ConditionValue xgetCValueReorderinterval() { return xdfgetReorderinterval(); }

    /**
     * Add order-by as ascend. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderinterval_Asc() { regOBA("REORDERINTERVAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderinterval_Desc() { regOBD("REORDERINTERVAL"); return this; }

    protected ConditionValue _reorderpoint;
    public ConditionValue xdfgetReorderpoint()
    { if (_reorderpoint == null) { _reorderpoint = nCV(); }
      return _reorderpoint; }
    protected ConditionValue xgetCValueReorderpoint() { return xdfgetReorderpoint(); }

    /**
     * Add order-by as ascend. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderpoint_Asc() { regOBA("REORDERPOINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderpoint_Desc() { regOBD("REORDERPOINT"); return this; }

    protected ConditionValue _reorderqty;
    public ConditionValue xdfgetReorderqty()
    { if (_reorderqty == null) { _reorderqty = nCV(); }
      return _reorderqty; }
    protected ConditionValue xgetCValueReorderqty() { return xdfgetReorderqty(); }

    /**
     * Add order-by as ascend. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderqty_Asc() { regOBA("REORDERQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderqty_Desc() { regOBD("REORDERQTY"); return this; }

    protected ConditionValue _reorderleadtime;
    public ConditionValue xdfgetReorderleadtime()
    { if (_reorderleadtime == null) { _reorderleadtime = nCV(); }
      return _reorderleadtime; }
    protected ConditionValue xgetCValueReorderleadtime() { return xdfgetReorderleadtime(); }

    /**
     * Add order-by as ascend. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderleadtime_Asc() { regOBA("REORDERLEADTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderleadtime_Desc() { regOBD("REORDERLEADTIME"); return this; }

    protected ConditionValue _reorderlastday;
    public ConditionValue xdfgetReorderlastday()
    { if (_reorderlastday == null) { _reorderlastday = nCV(); }
      return _reorderlastday; }
    protected ConditionValue xgetCValueReorderlastday() { return xdfgetReorderlastday(); }

    /**
     * Add order-by as ascend. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderlastday_Asc() { regOBA("REORDERLASTDAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Reorderlastday_Desc() { regOBD("REORDERLASTDAY"); return this; }

    protected ConditionValue _suppliercd;
    public ConditionValue xdfgetSuppliercd()
    { if (_suppliercd == null) { _suppliercd = nCV(); }
      return _suppliercd; }
    protected ConditionValue xgetCValueSuppliercd() { return xdfgetSuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _replenishpoint;
    public ConditionValue xdfgetReplenishpoint()
    { if (_replenishpoint == null) { _replenishpoint = nCV(); }
      return _replenishpoint; }
    protected ConditionValue xgetCValueReplenishpoint() { return xdfgetReplenishpoint(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Replenishpoint_Asc() { regOBA("REPLENISHPOINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Replenishpoint_Desc() { regOBD("REPLENISHPOINT"); return this; }

    protected ConditionValue _maxqty;
    public ConditionValue xdfgetMaxqty()
    { if (_maxqty == null) { _maxqty = nCV(); }
      return _maxqty; }
    protected ConditionValue xgetCValueMaxqty() { return xdfgetMaxqty(); }

    /**
     * Add order-by as ascend. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Maxqty_Asc() { regOBA("MAXQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Maxqty_Desc() { regOBD("MAXQTY"); return this; }

    protected ConditionValue _causeloc;
    public ConditionValue xdfgetCauseloc()
    { if (_causeloc == null) { _causeloc = nCV(); }
      return _causeloc; }
    protected ConditionValue xgetCValueCauseloc() { return xdfgetCauseloc(); }

    /**
     * Add order-by as ascend. <br>
     * CAUSELOC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Causeloc_Asc() { regOBA("CAUSELOC"); return this; }

    /**
     * Add order-by as descend. <br>
     * CAUSELOC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Causeloc_Desc() { regOBD("CAUSELOC"); return this; }

    protected ConditionValue _shippingtype;
    public ConditionValue xdfgetShippingtype()
    { if (_shippingtype == null) { _shippingtype = nCV(); }
      return _shippingtype; }
    protected ConditionValue xgetCValueShippingtype() { return xdfgetShippingtype(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Shippingtype_Asc() { regOBA("SHIPPINGTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Shippingtype_Desc() { regOBD("SHIPPINGTYPE"); return this; }

    protected ConditionValue _slotpolicykey;
    public ConditionValue xdfgetSlotpolicykey()
    { if (_slotpolicykey == null) { _slotpolicykey = nCV(); }
      return _slotpolicykey; }
    protected ConditionValue xgetCValueSlotpolicykey() { return xdfgetSlotpolicykey(); }

    /**
     * Add order-by as ascend. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Slotpolicykey_Asc() { regOBA("SLOTPOLICYKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Slotpolicykey_Desc() { regOBD("SLOTPOLICYKEY"); return this; }

    protected ConditionValue _inworkingkey;
    public ConditionValue xdfgetInworkingkey()
    { if (_inworkingkey == null) { _inworkingkey = nCV(); }
      return _inworkingkey; }
    protected ConditionValue xgetCValueInworkingkey() { return xdfgetInworkingkey(); }

    /**
     * Add order-by as ascend. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Inworkingkey_Asc() { regOBA("INWORKINGKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Inworkingkey_Desc() { regOBD("INWORKINGKEY"); return this; }

    protected ConditionValue _outworkingkey;
    public ConditionValue xdfgetOutworkingkey()
    { if (_outworkingkey == null) { _outworkingkey = nCV(); }
      return _outworkingkey; }
    protected ConditionValue xgetCValueOutworkingkey() { return xdfgetOutworkingkey(); }

    /**
     * Add order-by as ascend. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Outworkingkey_Asc() { regOBA("OUTWORKINGKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Outworkingkey_Desc() { regOBD("OUTWORKINGKEY"); return this; }

    protected ConditionValue _processworkingkey;
    public ConditionValue xdfgetProcessworkingkey()
    { if (_processworkingkey == null) { _processworkingkey = nCV(); }
      return _processworkingkey; }
    protected ConditionValue xgetCValueProcessworkingkey() { return xdfgetProcessworkingkey(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Processworkingkey_Asc() { regOBA("PROCESSWORKINGKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Processworkingkey_Desc() { regOBD("PROCESSWORKINGKEY"); return this; }

    protected ConditionValue _useruse1;
    public ConditionValue xdfgetUseruse1()
    { if (_useruse1 == null) { _useruse1 = nCV(); }
      return _useruse1; }
    protected ConditionValue xgetCValueUseruse1() { return xdfgetUseruse1(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse1_Asc() { regOBA("USERUSE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse1_Desc() { regOBD("USERUSE1"); return this; }

    protected ConditionValue _useruse2;
    public ConditionValue xdfgetUseruse2()
    { if (_useruse2 == null) { _useruse2 = nCV(); }
      return _useruse2; }
    protected ConditionValue xgetCValueUseruse2() { return xdfgetUseruse2(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse2_Asc() { regOBA("USERUSE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse2_Desc() { regOBD("USERUSE2"); return this; }

    protected ConditionValue _useruse3;
    public ConditionValue xdfgetUseruse3()
    { if (_useruse3 == null) { _useruse3 = nCV(); }
      return _useruse3; }
    protected ConditionValue xgetCValueUseruse3() { return xdfgetUseruse3(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse3_Asc() { regOBA("USERUSE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse3_Desc() { regOBD("USERUSE3"); return this; }

    protected ConditionValue _useruse4;
    public ConditionValue xdfgetUseruse4()
    { if (_useruse4 == null) { _useruse4 = nCV(); }
      return _useruse4; }
    protected ConditionValue xgetCValueUseruse4() { return xdfgetUseruse4(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse4_Asc() { regOBA("USERUSE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse4_Desc() { regOBD("USERUSE4"); return this; }

    protected ConditionValue _useruse5;
    public ConditionValue xdfgetUseruse5()
    { if (_useruse5 == null) { _useruse5 = nCV(); }
      return _useruse5; }
    protected ConditionValue xgetCValueUseruse5() { return xdfgetUseruse5(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE5: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse5_Asc() { regOBA("USERUSE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE5: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Useruse5_Desc() { regOBD("USERUSE5"); return this; }

    protected ConditionValue _serialflg;
    public ConditionValue xdfgetSerialflg()
    { if (_serialflg == null) { _serialflg = nCV(); }
      return _serialflg; }
    protected ConditionValue xgetCValueSerialflg() { return xdfgetSerialflg(); }

    /**
     * Add order-by as ascend. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Serialflg_Asc() { regOBA("SERIALFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Serialflg_Desc() { regOBD("SERIALFLG"); return this; }

    protected ConditionValue _fullpalletflg;
    public ConditionValue xdfgetFullpalletflg()
    { if (_fullpalletflg == null) { _fullpalletflg = nCV(); }
      return _fullpalletflg; }
    protected ConditionValue xgetCValueFullpalletflg() { return xdfgetFullpalletflg(); }

    /**
     * Add order-by as ascend. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Fullpalletflg_Asc() { regOBA("FULLPALLETFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Fullpalletflg_Desc() { regOBD("FULLPALLETFLG"); return this; }

    protected ConditionValue _plslotlocname;
    public ConditionValue xdfgetPlslotlocname()
    { if (_plslotlocname == null) { _plslotlocname = nCV(); }
      return _plslotlocname; }
    protected ConditionValue xgetCValuePlslotlocname() { return xdfgetPlslotlocname(); }

    /**
     * Add order-by as ascend. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Plslotlocname_Asc() { regOBA("PLSLOTLOCNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_Plslotlocname_Desc() { regOBD("PLSLOTLOCNAME"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, MProductCQ> getProductId_InScopeRelation_MProduct() { return xgetSQueMap("productId_InScopeRelation_MProduct"); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_InScopeRelation_MProduct", sq); }

    public Map<String, MProductCQ> getProductId_NotInScopeRelation_MProduct() { return xgetSQueMap("productId_NotInScopeRelation_MProduct"); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_MProduct", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMMfwhxitemCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMMfwhxitemCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMMfwhxitemCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMMfwhxitemCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MMfwhxitemCQ bq = (MMfwhxitemCQ)bqs;
        MMfwhxitemCQ uq = (MMfwhxitemCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
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
        String nrp = xresolveNRP("M_MFWHxITEM", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("M_MFWHxITEM", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProduct() {
        return xdfgetConditionQueryMProduct();
    }
    public MProductCQ xdfgetConditionQueryMProduct() {
        String prop = "mProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProduct()); xsetupOuterJoinMProduct(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProduct() {
        String nrp = xresolveNRP("M_MFWHxITEM", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MMfwhxitemCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MMfwhxitemCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MMfwhxitemCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MMfwhxitemCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MMfwhxitemCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MMfwhxitemCQ> _myselfExistsMap;
    public Map<String, MMfwhxitemCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MMfwhxitemCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MMfwhxitemCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MMfwhxitemCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MMfwhxitemCB.class.getName(); }
    protected String xCQ() { return MMfwhxitemCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
