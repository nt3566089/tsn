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
 * The base condition-query of T_TRPACKRMDR.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrpackrmdrCQ extends AbstractBsTTrpackrmdrCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrpackrmdrCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpackrmdrCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRPACKRMDR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrpackrmdrCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrpackrmdrCIQ xcreateCIQ() {
        TTrpackrmdrCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrpackrmdrCIQ xnewCIQ() {
        return new TTrpackrmdrCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRPACKRMDR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrpackrmdrCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrpackrmdrCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _packingRemainingId;
    public ConditionValue xdfgetPackingRemainingId()
    { if (_packingRemainingId == null) { _packingRemainingId = nCV(); }
      return _packingRemainingId; }
    protected ConditionValue xgetCValuePackingRemainingId() { return xdfgetPackingRemainingId(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_PackingRemainingId_Asc() { regOBA("PACKING_REMAINING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_PackingRemainingId_Desc() { regOBD("PACKING_REMAINING_ID"); return this; }

    protected ConditionValue _packrmdrkey;
    public ConditionValue xdfgetPackrmdrkey()
    { if (_packrmdrkey == null) { _packrmdrkey = nCV(); }
      return _packrmdrkey; }
    protected ConditionValue xgetCValuePackrmdrkey() { return xdfgetPackrmdrkey(); }

    /**
     * Add order-by as ascend. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Packrmdrkey_Asc() { regOBA("PACKRMDRKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Packrmdrkey_Desc() { regOBD("PACKRMDRKEY"); return this; }

    protected ConditionValue _pickingInstDetailId;
    public ConditionValue xdfgetPickingInstDetailId()
    { if (_pickingInstDetailId == null) { _pickingInstDetailId = nCV(); }
      return _pickingInstDetailId; }
    protected ConditionValue xgetCValuePickingInstDetailId() { return xdfgetPickingInstDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_PickingInstDetailId_Asc() { regOBA("PICKING_INST_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_PickingInstDetailId_Desc() { regOBD("PICKING_INST_DETAIL_ID"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_Tagcd_Asc() { regOBA("TAGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Tagcd_Desc() { regOBD("TAGCD"); return this; }

    protected ConditionValue _sokey;
    public ConditionValue xdfgetSokey()
    { if (_sokey == null) { _sokey = nCV(); }
      return _sokey; }
    protected ConditionValue xgetCValueSokey() { return xdfgetSokey(); }

    /**
     * Add order-by as ascend. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Sokey_Asc() { regOBA("SOKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Sokey_Desc() { regOBD("SOKEY"); return this; }

    protected ConditionValue _solineno;
    public ConditionValue xdfgetSolineno()
    { if (_solineno == null) { _solineno = nCV(); }
      return _solineno; }
    protected ConditionValue xgetCValueSolineno() { return xdfgetSolineno(); }

    /**
     * Add order-by as ascend. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Solineno_Asc() { regOBA("SOLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Solineno_Desc() { regOBD("SOLINENO"); return this; }

    protected ConditionValue _actflg;
    public ConditionValue xdfgetActflg()
    { if (_actflg == null) { _actflg = nCV(); }
      return _actflg; }
    protected ConditionValue xgetCValueActflg() { return xdfgetActflg(); }

    /**
     * Add order-by as ascend. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Actflg_Asc() { regOBA("ACTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Actflg_Desc() { regOBD("ACTFLG"); return this; }

    protected ConditionValue _deliverygroupkey;
    public ConditionValue xdfgetDeliverygroupkey()
    { if (_deliverygroupkey == null) { _deliverygroupkey = nCV(); }
      return _deliverygroupkey; }
    protected ConditionValue xgetCValueDeliverygroupkey() { return xdfgetDeliverygroupkey(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Deliverygroupkey_Asc() { regOBA("DELIVERYGROUPKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Deliverygroupkey_Desc() { regOBD("DELIVERYGROUPKEY"); return this; }

    protected ConditionValue _wbkey;
    public ConditionValue xdfgetWbkey()
    { if (_wbkey == null) { _wbkey = nCV(); }
      return _wbkey; }
    protected ConditionValue xgetCValueWbkey() { return xdfgetWbkey(); }

    /**
     * Add order-by as ascend. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Wbkey_Asc() { regOBA("WBKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WBKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Wbkey_Desc() { regOBD("WBKEY"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _ownercd;
    public ConditionValue xdfgetOwnercd()
    { if (_ownercd == null) { _ownercd = nCV(); }
      return _ownercd; }
    protected ConditionValue xgetCValueOwnercd() { return xdfgetOwnercd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Ownercd_Asc() { regOBA("OWNERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Ownercd_Desc() { regOBD("OWNERCD"); return this; }

    protected ConditionValue _itemadmin;
    public ConditionValue xdfgetItemadmin()
    { if (_itemadmin == null) { _itemadmin = nCV(); }
      return _itemadmin; }
    protected ConditionValue xgetCValueItemadmin() { return xdfgetItemadmin(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Itemadmin_Asc() { regOBA("ITEMADMIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Itemadmin_Desc() { regOBD("ITEMADMIN"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _lotkey;
    public ConditionValue xdfgetLotkey()
    { if (_lotkey == null) { _lotkey = nCV(); }
      return _lotkey; }
    protected ConditionValue xgetCValueLotkey() { return xdfgetLotkey(); }

    /**
     * Add order-by as ascend. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Lotkey_Asc() { regOBA("LOTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Lotkey_Desc() { regOBD("LOTKEY"); return this; }

    protected ConditionValue _packedqty1;
    public ConditionValue xdfgetPackedqty1()
    { if (_packedqty1 == null) { _packedqty1 = nCV(); }
      return _packedqty1; }
    protected ConditionValue xgetCValuePackedqty1() { return xdfgetPackedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Packedqty1_Asc() { regOBA("PACKEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Packedqty1_Desc() { regOBD("PACKEDQTY1"); return this; }

    protected ConditionValue _packedqty2;
    public ConditionValue xdfgetPackedqty2()
    { if (_packedqty2 == null) { _packedqty2 = nCV(); }
      return _packedqty2; }
    protected ConditionValue xgetCValuePackedqty2() { return xdfgetPackedqty2(); }

    /**
     * Add order-by as ascend. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Packedqty2_Asc() { regOBA("PACKEDQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Packedqty2_Desc() { regOBD("PACKEDQTY2"); return this; }

    protected ConditionValue _packedqty3;
    public ConditionValue xdfgetPackedqty3()
    { if (_packedqty3 == null) { _packedqty3 = nCV(); }
      return _packedqty3; }
    protected ConditionValue xgetCValuePackedqty3() { return xdfgetPackedqty3(); }

    /**
     * Add order-by as ascend. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Packedqty3_Asc() { regOBA("PACKEDQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Packedqty3_Desc() { regOBD("PACKEDQTY3"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _expectqty2;
    public ConditionValue xdfgetExpectqty2()
    { if (_expectqty2 == null) { _expectqty2 = nCV(); }
      return _expectqty2; }
    protected ConditionValue xgetCValueExpectqty2() { return xdfgetExpectqty2(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Expectqty2_Asc() { regOBA("EXPECTQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Expectqty2_Desc() { regOBD("EXPECTQTY2"); return this; }

    protected ConditionValue _expectqty3;
    public ConditionValue xdfgetExpectqty3()
    { if (_expectqty3 == null) { _expectqty3 = nCV(); }
      return _expectqty3; }
    protected ConditionValue xgetCValueExpectqty3() { return xdfgetExpectqty3(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Expectqty3_Asc() { regOBA("EXPECTQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_Expectqty3_Desc() { regOBD("EXPECTQTY3"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrpackrmdrCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpackrmdrCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrpackrmdrCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrpackrmdrCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrpackrmdrCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrpackrmdrCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrpackrmdrCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrpackrmdrCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrpackrmdrCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrpackrmdrCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrpackrmdrCQ> _myselfExistsMap;
    public Map<String, TTrpackrmdrCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrpackrmdrCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrpackrmdrCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrpackrmdrCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrpackrmdrCB.class.getName(); }
    protected String xCQ() { return TTrpackrmdrCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
