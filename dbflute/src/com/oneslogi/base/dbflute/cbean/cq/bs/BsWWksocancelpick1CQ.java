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
 * The base condition-query of W_WKSOCANCELPICK1.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWksocancelpick1CQ extends AbstractBsWWksocancelpick1CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWksocancelpick1CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWksocancelpick1CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKSOCANCELPICK1) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWksocancelpick1CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWksocancelpick1CIQ xcreateCIQ() {
        WWksocancelpick1CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWksocancelpick1CIQ xnewCIQ() {
        return new WWksocancelpick1CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKSOCANCELPICK1 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWksocancelpick1CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWksocancelpick1CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printkey;
    public ConditionValue xdfgetPrintkey()
    { if (_printkey == null) { _printkey = nCV(); }
      return _printkey; }
    protected ConditionValue xgetCValuePrintkey() { return xdfgetPrintkey(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Printkey_Asc() { regOBA("PRINTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Printkey_Desc() { regOBD("PRINTKEY"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _warehouseSname;
    public ConditionValue xdfgetWarehouseSname()
    { if (_warehouseSname == null) { _warehouseSname = nCV(); }
      return _warehouseSname; }
    protected ConditionValue xgetCValueWarehouseSname() { return xdfgetWarehouseSname(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_WarehouseSname_Asc() { regOBA("WAREHOUSE_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_WarehouseSname_Desc() { regOBD("WAREHOUSE_SNAME"); return this; }

    protected ConditionValue _pickeddate;
    public ConditionValue xdfgetPickeddate()
    { if (_pickeddate == null) { _pickeddate = nCV(); }
      return _pickeddate; }
    protected ConditionValue xgetCValuePickeddate() { return xdfgetPickeddate(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Pickeddate_Asc() { regOBA("PICKEDDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Pickeddate_Desc() { regOBD("PICKEDDATE"); return this; }

    protected ConditionValue _workallocateid;
    public ConditionValue xdfgetWorkallocateid()
    { if (_workallocateid == null) { _workallocateid = nCV(); }
      return _workallocateid; }
    protected ConditionValue xgetCValueWorkallocateid() { return xdfgetWorkallocateid(); }

    /**
     * Add order-by as ascend. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Workallocateid_Asc() { regOBA("WORKALLOCATEID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Workallocateid_Desc() { regOBD("WORKALLOCATEID"); return this; }

    protected ConditionValue _floor;
    public ConditionValue xdfgetFloor()
    { if (_floor == null) { _floor = nCV(); }
      return _floor; }
    protected ConditionValue xgetCValueFloor() { return xdfgetFloor(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Floor_Asc() { regOBA("FLOOR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Floor_Desc() { regOBD("FLOOR"); return this; }

    protected ConditionValue _loccd;
    public ConditionValue xdfgetLoccd()
    { if (_loccd == null) { _loccd = nCV(); }
      return _loccd; }
    protected ConditionValue xgetCValueLoccd() { return xdfgetLoccd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemSname;
    public ConditionValue xdfgetItemSname()
    { if (_itemSname == null) { _itemSname = nCV(); }
      return _itemSname; }
    protected ConditionValue xgetCValueItemSname() { return xdfgetItemSname(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_ItemSname_Asc() { regOBA("ITEM_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_ItemSname_Desc() { regOBD("ITEM_SNAME"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _lot4;
    public ConditionValue xdfgetLot4()
    { if (_lot4 == null) { _lot4 = nCV(); }
      return _lot4; }
    protected ConditionValue xgetCValueLot4() { return xdfgetLot4(); }

    /**
     * Add order-by as ascend. <br>
     * LOT4: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _pickedqtyC;
    public ConditionValue xdfgetPickedqtyC()
    { if (_pickedqtyC == null) { _pickedqtyC = nCV(); }
      return _pickedqtyC; }
    protected ConditionValue xgetCValuePickedqtyC() { return xdfgetPickedqtyC(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_PickedqtyC_Asc() { regOBA("PICKEDQTY_C"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_PickedqtyC_Desc() { regOBD("PICKEDQTY_C"); return this; }

    protected ConditionValue _pickedqtyP;
    public ConditionValue xdfgetPickedqtyP()
    { if (_pickedqtyP == null) { _pickedqtyP = nCV(); }
      return _pickedqtyP; }
    protected ConditionValue xgetCValuePickedqtyP() { return xdfgetPickedqtyP(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_PickedqtyP_Asc() { regOBA("PICKEDQTY_P"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_PickedqtyP_Desc() { regOBD("PICKEDQTY_P"); return this; }

    protected ConditionValue _usernum3;
    public ConditionValue xdfgetUsernum3()
    { if (_usernum3 == null) { _usernum3 = nCV(); }
      return _usernum3; }
    protected ConditionValue xgetCValueUsernum3() { return xdfgetUsernum3(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Usernum3_Asc() { regOBA("USERNUM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Usernum3_Desc() { regOBD("USERNUM3"); return this; }

    protected ConditionValue _printpageno;
    public ConditionValue xdfgetPrintpageno()
    { if (_printpageno == null) { _printpageno = nCV(); }
      return _printpageno; }
    protected ConditionValue xgetCValuePrintpageno() { return xdfgetPrintpageno(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Printpageno_Asc() { regOBA("PRINTPAGENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Printpageno_Desc() { regOBD("PRINTPAGENO"); return this; }

    protected ConditionValue _seqsortkey;
    public ConditionValue xdfgetSeqsortkey()
    { if (_seqsortkey == null) { _seqsortkey = nCV(); }
      return _seqsortkey; }
    protected ConditionValue xgetCValueSeqsortkey() { return xdfgetSeqsortkey(); }

    /**
     * Add order-by as ascend. <br>
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Seqsortkey_Asc() { regOBA("SEQSORTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_Seqsortkey_Desc() { regOBD("SEQSORTKEY"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWksocancelpick1CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWksocancelpick1CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWksocancelpick1CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWksocancelpick1CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WWksocancelpick1CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWksocancelpick1CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWksocancelpick1CB.class.getName(); }
    protected String xCQ() { return WWksocancelpick1CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
