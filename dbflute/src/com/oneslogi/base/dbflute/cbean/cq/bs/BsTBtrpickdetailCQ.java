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
 * The base condition-query of T_BTRPICKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBtrpickdetailCQ extends AbstractBsTBtrpickdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBtrpickdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBtrpickdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_BTRPICKDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBtrpickdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBtrpickdetailCIQ xcreateCIQ() {
        TBtrpickdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBtrpickdetailCIQ xnewCIQ() {
        return new TBtrpickdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_BTRPICKDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBtrpickdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBtrpickdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pickingInstDetailId;
    public ConditionValue xdfgetPickingInstDetailId()
    { if (_pickingInstDetailId == null) { _pickingInstDetailId = nCV(); }
      return _pickingInstDetailId; }
    protected ConditionValue xgetCValuePickingInstDetailId() { return xdfgetPickingInstDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_PickingInstDetailId_Asc() { regOBA("PICKING_INST_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_PickingInstDetailId_Desc() { regOBD("PICKING_INST_DETAIL_ID"); return this; }

    protected ConditionValue _pickingInstId;
    public ConditionValue xdfgetPickingInstId()
    { if (_pickingInstId == null) { _pickingInstId = nCV(); }
      return _pickingInstId; }
    protected ConditionValue xgetCValuePickingInstId() { return xdfgetPickingInstId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_PickingInstId_Asc() { regOBA("PICKING_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_PickingInstId_Desc() { regOBD("PICKING_INST_ID"); return this; }

    protected ConditionValue _pickbatchlineno;
    public ConditionValue xdfgetPickbatchlineno()
    { if (_pickbatchlineno == null) { _pickbatchlineno = nCV(); }
      return _pickbatchlineno; }
    protected ConditionValue xgetCValuePickbatchlineno() { return xdfgetPickbatchlineno(); }

    /**
     * Add order-by as ascend. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pickbatchlineno_Asc() { regOBA("PICKBATCHLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKBATCHLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pickbatchlineno_Desc() { regOBD("PICKBATCHLINENO"); return this; }

    protected ConditionValue _soid;
    public ConditionValue xdfgetSoid()
    { if (_soid == null) { _soid = nCV(); }
      return _soid; }
    protected ConditionValue xgetCValueSoid() { return xdfgetSoid(); }

    /**
     * Add order-by as ascend. <br>
     * SOID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

    protected ConditionValue _sodetailid;
    public ConditionValue xdfgetSodetailid()
    { if (_sodetailid == null) { _sodetailid = nCV(); }
      return _sodetailid; }
    protected ConditionValue xgetCValueSodetailid() { return xdfgetSodetailid(); }

    /**
     * Add order-by as ascend. <br>
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Sodetailid_Asc() { regOBA("SODETAILID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Sodetailid_Desc() { regOBD("SODETAILID"); return this; }

    protected ConditionValue _sts;
    public ConditionValue xdfgetSts()
    { if (_sts == null) { _sts = nCV(); }
      return _sts; }
    protected ConditionValue xgetCValueSts() { return xdfgetSts(); }

    /**
     * Add order-by as ascend. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Sts_Asc() { regOBA("STS"); return this; }

    /**
     * Add order-by as descend. <br>
     * STS: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Sts_Desc() { regOBD("STS"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _ifProductId;
    public ConditionValue xdfgetIfProductId()
    { if (_ifProductId == null) { _ifProductId = nCV(); }
      return _ifProductId; }
    protected ConditionValue xgetCValueIfProductId() { return xdfgetIfProductId(); }

    /**
     * Add order-by as ascend. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_IfProductId_Asc() { regOBA("IF_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IF_PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_IfProductId_Desc() { regOBD("IF_PRODUCT_ID"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locgroup;
    public ConditionValue xdfgetLocgroup()
    { if (_locgroup == null) { _locgroup = nCV(); }
      return _locgroup; }
    protected ConditionValue xgetCValueLocgroup() { return xdfgetLocgroup(); }

    /**
     * Add order-by as ascend. <br>
     * LOCGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Locgroup_Asc() { regOBA("LOCGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Locgroup_Desc() { regOBD("LOCGROUP"); return this; }

    protected ConditionValue _loctype;
    public ConditionValue xdfgetLoctype()
    { if (_loctype == null) { _loctype = nCV(); }
      return _loctype; }
    protected ConditionValue xgetCValueLoctype() { return xdfgetLoctype(); }

    /**
     * Add order-by as ascend. <br>
     * LOCTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Loctype_Asc() { regOBA("LOCTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Loctype_Desc() { regOBD("LOCTYPE"); return this; }

    protected ConditionValue _picktype;
    public ConditionValue xdfgetPicktype()
    { if (_picktype == null) { _picktype = nCV(); }
      return _picktype; }
    protected ConditionValue xgetCValuePicktype() { return xdfgetPicktype(); }

    /**
     * Add order-by as ascend. <br>
     * PICKTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Picktype_Asc() { regOBA("PICKTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Picktype_Desc() { regOBD("PICKTYPE"); return this; }

    protected ConditionValue _alloctype;
    public ConditionValue xdfgetAlloctype()
    { if (_alloctype == null) { _alloctype = nCV(); }
      return _alloctype; }
    protected ConditionValue xgetCValueAlloctype() { return xdfgetAlloctype(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOCTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Alloctype_Asc() { regOBA("ALLOCTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Alloctype_Desc() { regOBD("ALLOCTYPE"); return this; }

    protected ConditionValue _tagcd;
    public ConditionValue xdfgetTagcd()
    { if (_tagcd == null) { _tagcd = nCV(); }
      return _tagcd; }
    protected ConditionValue xgetCValueTagcd() { return xdfgetTagcd(); }

    /**
     * Add order-by as ascend. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Tagcd_Asc() { regOBA("TAGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAGCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Tagcd_Desc() { regOBD("TAGCD"); return this; }

    protected ConditionValue _actualtagcd;
    public ConditionValue xdfgetActualtagcd()
    { if (_actualtagcd == null) { _actualtagcd = nCV(); }
      return _actualtagcd; }
    protected ConditionValue xgetCValueActualtagcd() { return xdfgetActualtagcd(); }

    /**
     * Add order-by as ascend. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Actualtagcd_Asc() { regOBA("ACTUALTAGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTUALTAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Actualtagcd_Desc() { regOBD("ACTUALTAGCD"); return this; }

    protected ConditionValue _fromLocationId;
    public ConditionValue xdfgetFromLocationId()
    { if (_fromLocationId == null) { _fromLocationId = nCV(); }
      return _fromLocationId; }
    protected ConditionValue xgetCValueFromLocationId() { return xdfgetFromLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_FromLocationId_Asc() { regOBA("FROM_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROM_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_FromLocationId_Desc() { regOBD("FROM_LOCATION_ID"); return this; }

    protected ConditionValue _fromtagcd;
    public ConditionValue xdfgetFromtagcd()
    { if (_fromtagcd == null) { _fromtagcd = nCV(); }
      return _fromtagcd; }
    protected ConditionValue xgetCValueFromtagcd() { return xdfgetFromtagcd(); }

    /**
     * Add order-by as ascend. <br>
     * FROMTAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Fromtagcd_Asc() { regOBA("FROMTAGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMTAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Fromtagcd_Desc() { regOBD("FROMTAGCD"); return this; }

    protected ConditionValue _toLocationId;
    public ConditionValue xdfgetToLocationId()
    { if (_toLocationId == null) { _toLocationId = nCV(); }
      return _toLocationId; }
    protected ConditionValue xgetCValueToLocationId() { return xdfgetToLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_ToLocationId_Asc() { regOBA("TO_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TO_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_ToLocationId_Desc() { regOBD("TO_LOCATION_ID"); return this; }

    protected ConditionValue _totagcd;
    public ConditionValue xdfgetTotagcd()
    { if (_totagcd == null) { _totagcd = nCV(); }
      return _totagcd; }
    protected ConditionValue xgetCValueTotagcd() { return xdfgetTotagcd(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Totagcd_Asc() { regOBA("TOTAGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Totagcd_Desc() { regOBD("TOTAGCD"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _pickedqty1;
    public ConditionValue xdfgetPickedqty1()
    { if (_pickedqty1 == null) { _pickedqty1 = nCV(); }
      return _pickedqty1; }
    protected ConditionValue xgetCValuePickedqty1() { return xdfgetPickedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pickedqty1_Asc() { regOBA("PICKEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pickedqty1_Desc() { regOBD("PICKEDQTY1"); return this; }

    protected ConditionValue _pallettype;
    public ConditionValue xdfgetPallettype()
    { if (_pallettype == null) { _pallettype = nCV(); }
      return _pallettype; }
    protected ConditionValue xgetCValuePallettype() { return xdfgetPallettype(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pallettype_Asc() { regOBA("PALLETTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pallettype_Desc() { regOBD("PALLETTYPE"); return this; }

    protected ConditionValue _sortedqty1;
    public ConditionValue xdfgetSortedqty1()
    { if (_sortedqty1 == null) { _sortedqty1 = nCV(); }
      return _sortedqty1; }
    protected ConditionValue xgetCValueSortedqty1() { return xdfgetSortedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Sortedqty1_Asc() { regOBA("SORTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Sortedqty1_Desc() { regOBD("SORTEDQTY1"); return this; }

    protected ConditionValue _shippedqty1;
    public ConditionValue xdfgetShippedqty1()
    { if (_shippedqty1 == null) { _shippedqty1 = nCV(); }
      return _shippedqty1; }
    protected ConditionValue xgetCValueShippedqty1() { return xdfgetShippedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Shippedqty1_Asc() { regOBA("SHIPPEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Shippedqty1_Desc() { regOBD("SHIPPEDQTY1"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {IX+, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

    protected ConditionValue _rcvlineno;
    public ConditionValue xdfgetRcvlineno()
    { if (_rcvlineno == null) { _rcvlineno = nCV(); }
      return _rcvlineno; }
    protected ConditionValue xgetCValueRcvlineno() { return xdfgetRcvlineno(); }

    /**
     * Add order-by as ascend. <br>
     * RCVLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Rcvlineno_Asc() { regOBA("RCVLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Rcvlineno_Desc() { regOBD("RCVLINENO"); return this; }

    protected ConditionValue _pickusercd;
    public ConditionValue xdfgetPickusercd()
    { if (_pickusercd == null) { _pickusercd = nCV(); }
      return _pickusercd; }
    protected ConditionValue xgetCValuePickusercd() { return xdfgetPickusercd(); }

    /**
     * Add order-by as ascend. <br>
     * PICKUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pickusercd_Asc() { regOBA("PICKUSERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pickusercd_Desc() { regOBD("PICKUSERCD"); return this; }

    protected ConditionValue _lotreserveflg;
    public ConditionValue xdfgetLotreserveflg()
    { if (_lotreserveflg == null) { _lotreserveflg = nCV(); }
      return _lotreserveflg; }
    protected ConditionValue xgetCValueLotreserveflg() { return xdfgetLotreserveflg(); }

    /**
     * Add order-by as ascend. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Lotreserveflg_Asc() { regOBA("LOTRESERVEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Lotreserveflg_Desc() { regOBD("LOTRESERVEFLG"); return this; }

    protected ConditionValue _labelprintedflg;
    public ConditionValue xdfgetLabelprintedflg()
    { if (_labelprintedflg == null) { _labelprintedflg = nCV(); }
      return _labelprintedflg; }
    protected ConditionValue xgetCValueLabelprintedflg() { return xdfgetLabelprintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Labelprintedflg_Asc() { regOBA("LABELPRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Labelprintedflg_Desc() { regOBD("LABELPRINTEDFLG"); return this; }

    protected ConditionValue _allocstyletype;
    public ConditionValue xdfgetAllocstyletype()
    { if (_allocstyletype == null) { _allocstyletype = nCV(); }
      return _allocstyletype; }
    protected ConditionValue xgetCValueAllocstyletype() { return xdfgetAllocstyletype(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Allocstyletype_Asc() { regOBA("ALLOCSTYLETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCSTYLETYPE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Allocstyletype_Desc() { regOBD("ALLOCSTYLETYPE"); return this; }

    protected ConditionValue _fullpalletkey;
    public ConditionValue xdfgetFullpalletkey()
    { if (_fullpalletkey == null) { _fullpalletkey = nCV(); }
      return _fullpalletkey; }
    protected ConditionValue xgetCValueFullpalletkey() { return xdfgetFullpalletkey(); }

    /**
     * Add order-by as ascend. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Fullpalletkey_Asc() { regOBA("FULLPALLETKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * FULLPALLETKEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Fullpalletkey_Desc() { regOBD("FULLPALLETKEY"); return this; }

    protected ConditionValue _pickingunit;
    public ConditionValue xdfgetPickingunit()
    { if (_pickingunit == null) { _pickingunit = nCV(); }
      return _pickingunit; }
    protected ConditionValue xgetCValuePickingunit() { return xdfgetPickingunit(); }

    /**
     * Add order-by as ascend. <br>
     * PICKINGUNIT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pickingunit_Asc() { regOBA("PICKINGUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKINGUNIT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Pickingunit_Desc() { regOBD("PICKINGUNIT"); return this; }

    protected ConditionValue _workallocateid;
    public ConditionValue xdfgetWorkallocateid()
    { if (_workallocateid == null) { _workallocateid = nCV(); }
      return _workallocateid; }
    protected ConditionValue xgetCValueWorkallocateid() { return xdfgetWorkallocateid(); }

    /**
     * Add order-by as ascend. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Workallocateid_Asc() { regOBA("WORKALLOCATEID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKALLOCATEID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Workallocateid_Desc() { regOBD("WORKALLOCATEID"); return this; }

    protected ConditionValue _workallocatename;
    public ConditionValue xdfgetWorkallocatename()
    { if (_workallocatename == null) { _workallocatename = nCV(); }
      return _workallocatename; }
    protected ConditionValue xgetCValueWorkallocatename() { return xdfgetWorkallocatename(); }

    /**
     * Add order-by as ascend. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Workallocatename_Asc() { regOBA("WORKALLOCATENAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKALLOCATENAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Workallocatename_Desc() { regOBD("WORKALLOCATENAME"); return this; }

    protected ConditionValue _alertflg;
    public ConditionValue xdfgetAlertflg()
    { if (_alertflg == null) { _alertflg = nCV(); }
      return _alertflg; }
    protected ConditionValue xgetCValueAlertflg() { return xdfgetAlertflg(); }

    /**
     * Add order-by as ascend. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Alertflg_Asc() { regOBA("ALERTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_Alertflg_Desc() { regOBD("ALERTFLG"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBtrpickdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTBtrpickdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBtrpickdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBtrpickdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBtrpickdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBtrpickdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBtrpickdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBtrpickdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBtrpickdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBtrpickdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBtrpickdetailCQ> _myselfExistsMap;
    public Map<String, TBtrpickdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBtrpickdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBtrpickdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBtrpickdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBtrpickdetailCB.class.getName(); }
    protected String xCQ() { return TBtrpickdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
