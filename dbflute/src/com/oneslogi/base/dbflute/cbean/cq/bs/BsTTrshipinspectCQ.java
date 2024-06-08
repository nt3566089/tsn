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
 * The base condition-query of T_TRSHIPINSPECT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrshipinspectCQ extends AbstractBsTTrshipinspectCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrshipinspectCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrshipinspectCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSHIPINSPECT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrshipinspectCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrshipinspectCIQ xcreateCIQ() {
        TTrshipinspectCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrshipinspectCIQ xnewCIQ() {
        return new TTrshipinspectCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSHIPINSPECT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrshipinspectCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrshipinspectCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInspectionId;
    public ConditionValue xdfgetShippingInspectionId()
    { if (_shippingInspectionId == null) { _shippingInspectionId = nCV(); }
      return _shippingInspectionId; }
    protected ConditionValue xgetCValueShippingInspectionId() { return xdfgetShippingInspectionId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_ShippingInspectionId_Asc() { regOBA("SHIPPING_INSPECTION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_ShippingInspectionId_Desc() { regOBD("SHIPPING_INSPECTION_ID"); return this; }

    protected ConditionValue _shipinspectkey;
    public ConditionValue xdfgetShipinspectkey()
    { if (_shipinspectkey == null) { _shipinspectkey = nCV(); }
      return _shipinspectkey; }
    protected ConditionValue xgetCValueShipinspectkey() { return xdfgetShipinspectkey(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Shipinspectkey_Asc() { regOBA("SHIPINSPECTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Shipinspectkey_Desc() { regOBD("SHIPINSPECTKEY"); return this; }

    protected ConditionValue _pickingInstDetailId;
    public ConditionValue xdfgetPickingInstDetailId()
    { if (_pickingInstDetailId == null) { _pickingInstDetailId = nCV(); }
      return _pickingInstDetailId; }
    protected ConditionValue xgetCValuePickingInstDetailId() { return xdfgetPickingInstDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_PickingInstDetailId_Asc() { regOBA("PICKING_INST_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_PickingInstDetailId_Desc() { regOBD("PICKING_INST_DETAIL_ID"); return this; }

    protected ConditionValue _tagcd;
    public ConditionValue xdfgetTagcd()
    { if (_tagcd == null) { _tagcd = nCV(); }
      return _tagcd; }
    protected ConditionValue xgetCValueTagcd() { return xdfgetTagcd(); }

    /**
     * Add order-by as ascend. <br>
     * TAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Tagcd_Asc() { regOBA("TAGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Tagcd_Desc() { regOBD("TAGCD"); return this; }

    protected ConditionValue _rootpackkey;
    public ConditionValue xdfgetRootpackkey()
    { if (_rootpackkey == null) { _rootpackkey = nCV(); }
      return _rootpackkey; }
    protected ConditionValue xgetCValueRootpackkey() { return xdfgetRootpackkey(); }

    /**
     * Add order-by as ascend. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Rootpackkey_Asc() { regOBA("ROOTPACKKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Rootpackkey_Desc() { regOBD("ROOTPACKKEY"); return this; }

    protected ConditionValue _packkey;
    public ConditionValue xdfgetPackkey()
    { if (_packkey == null) { _packkey = nCV(); }
      return _packkey; }
    protected ConditionValue xgetCValuePackkey() { return xdfgetPackkey(); }

    /**
     * Add order-by as ascend. <br>
     * PACKKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Packkey_Asc() { regOBA("PACKKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Packkey_Desc() { regOBD("PACKKEY"); return this; }

    protected ConditionValue _shippingInspectionRemainingId;
    public ConditionValue xdfgetShippingInspectionRemainingId()
    { if (_shippingInspectionRemainingId == null) { _shippingInspectionRemainingId = nCV(); }
      return _shippingInspectionRemainingId; }
    protected ConditionValue xgetCValueShippingInspectionRemainingId() { return xdfgetShippingInspectionRemainingId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_ShippingInspectionRemainingId_Asc() { regOBA("SHIPPING_INSPECTION_REMAINING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_ShippingInspectionRemainingId_Desc() { regOBD("SHIPPING_INSPECTION_REMAINING_ID"); return this; }

    protected ConditionValue _soid;
    public ConditionValue xdfgetSoid()
    { if (_soid == null) { _soid = nCV(); }
      return _soid; }
    protected ConditionValue xgetCValueSoid() { return xdfgetSoid(); }

    /**
     * Add order-by as ascend. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

    protected ConditionValue _sodetailid;
    public ConditionValue xdfgetSodetailid()
    { if (_sodetailid == null) { _sodetailid = nCV(); }
      return _sodetailid; }
    protected ConditionValue xgetCValueSodetailid() { return xdfgetSodetailid(); }

    /**
     * Add order-by as ascend. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Sodetailid_Asc() { regOBA("SODETAILID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Sodetailid_Desc() { regOBD("SODETAILID"); return this; }

    protected ConditionValue _deliverygroupkey;
    public ConditionValue xdfgetDeliverygroupkey()
    { if (_deliverygroupkey == null) { _deliverygroupkey = nCV(); }
      return _deliverygroupkey; }
    protected ConditionValue xgetCValueDeliverygroupkey() { return xdfgetDeliverygroupkey(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Deliverygroupkey_Asc() { regOBA("DELIVERYGROUPKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Deliverygroupkey_Desc() { regOBD("DELIVERYGROUPKEY"); return this; }

    protected ConditionValue _wbkey;
    public ConditionValue xdfgetWbkey()
    { if (_wbkey == null) { _wbkey = nCV(); }
      return _wbkey; }
    protected ConditionValue xgetCValueWbkey() { return xdfgetWbkey(); }

    /**
     * Add order-by as ascend. <br>
     * WBKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Wbkey_Asc() { regOBA("WBKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WBKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Wbkey_Desc() { regOBD("WBKEY"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _inspectedqty1;
    public ConditionValue xdfgetInspectedqty1()
    { if (_inspectedqty1 == null) { _inspectedqty1 = nCV(); }
      return _inspectedqty1; }
    protected ConditionValue xgetCValueInspectedqty1() { return xdfgetInspectedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Inspectedqty1_Asc() { regOBA("INSPECTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Inspectedqty1_Desc() { regOBD("INSPECTEDQTY1"); return this; }

    protected ConditionValue _inspectusercd;
    public ConditionValue xdfgetInspectusercd()
    { if (_inspectusercd == null) { _inspectusercd = nCV(); }
      return _inspectusercd; }
    protected ConditionValue xgetCValueInspectusercd() { return xdfgetInspectusercd(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Inspectusercd_Asc() { regOBA("INSPECTUSERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_Inspectusercd_Desc() { regOBD("INSPECTUSERCD"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrshipinspectCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrshipinspectCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrshipinspectCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrshipinspectCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrshipinspectCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrshipinspectCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrshipinspectCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrshipinspectCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrshipinspectCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrshipinspectCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrshipinspectCQ> _myselfExistsMap;
    public Map<String, TTrshipinspectCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrshipinspectCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrshipinspectCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrshipinspectCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrshipinspectCB.class.getName(); }
    protected String xCQ() { return TTrshipinspectCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
