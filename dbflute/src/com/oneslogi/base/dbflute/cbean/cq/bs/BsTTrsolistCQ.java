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
 * The base condition-query of T_TRSOLIST.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsolistCQ extends AbstractBsTTrsolistCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsolistCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsolistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSOLIST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrsolistCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrsolistCIQ xcreateCIQ() {
        TTrsolistCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrsolistCIQ xnewCIQ() {
        return new TTrsolistCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSOLIST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrsolistCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrsolistCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingListPrintId;
    public ConditionValue xdfgetShippingListPrintId()
    { if (_shippingListPrintId == null) { _shippingListPrintId = nCV(); }
      return _shippingListPrintId; }
    protected ConditionValue xgetCValueShippingListPrintId() { return xdfgetShippingListPrintId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_ShippingListPrintId_Asc() { regOBA("SHIPPING_LIST_PRINT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_ShippingListPrintId_Desc() { regOBD("SHIPPING_LIST_PRINT_ID"); return this; }

    protected ConditionValue _trsolistkey;
    public ConditionValue xdfgetTrsolistkey()
    { if (_trsolistkey == null) { _trsolistkey = nCV(); }
      return _trsolistkey; }
    protected ConditionValue xgetCValueTrsolistkey() { return xdfgetTrsolistkey(); }

    /**
     * Add order-by as ascend. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Trsolistkey_Asc() { regOBA("TRSOLISTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Trsolistkey_Desc() { regOBD("TRSOLISTKEY"); return this; }

    protected ConditionValue _listkbn;
    public ConditionValue xdfgetListkbn()
    { if (_listkbn == null) { _listkbn = nCV(); }
      return _listkbn; }
    protected ConditionValue xgetCValueListkbn() { return xdfgetListkbn(); }

    /**
     * Add order-by as ascend. <br>
     * LISTKBN: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Listkbn_Asc() { regOBA("LISTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * LISTKBN: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Listkbn_Desc() { regOBD("LISTKBN"); return this; }

    protected ConditionValue _printedflg;
    public ConditionValue xdfgetPrintedflg()
    { if (_printedflg == null) { _printedflg = nCV(); }
      return _printedflg; }
    protected ConditionValue xgetCValuePrintedflg() { return xdfgetPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Printedflg_Asc() { regOBA("PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Printedflg_Desc() { regOBD("PRINTEDFLG"); return this; }

    protected ConditionValue _trsoliststs;
    public ConditionValue xdfgetTrsoliststs()
    { if (_trsoliststs == null) { _trsoliststs = nCV(); }
      return _trsoliststs; }
    protected ConditionValue xgetCValueTrsoliststs() { return xdfgetTrsoliststs(); }

    /**
     * Add order-by as ascend. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Trsoliststs_Asc() { regOBA("TRSOLISTSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Trsoliststs_Desc() { regOBD("TRSOLISTSTS"); return this; }

    protected ConditionValue _printdatetime;
    public ConditionValue xdfgetPrintdatetime()
    { if (_printdatetime == null) { _printdatetime = nCV(); }
      return _printdatetime; }
    protected ConditionValue xgetCValuePrintdatetime() { return xdfgetPrintdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Printdatetime_Asc() { regOBA("PRINTDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Printdatetime_Desc() { regOBD("PRINTDATETIME"); return this; }

    protected ConditionValue _shipschdate;
    public ConditionValue xdfgetShipschdate()
    { if (_shipschdate == null) { _shipschdate = nCV(); }
      return _shipschdate; }
    protected ConditionValue xgetCValueShipschdate() { return xdfgetShipschdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Shipschdate_Asc() { regOBA("SHIPSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Shipschdate_Desc() { regOBD("SHIPSCHDATE"); return this; }

    protected ConditionValue _workallocateid;
    public ConditionValue xdfgetWorkallocateid()
    { if (_workallocateid == null) { _workallocateid = nCV(); }
      return _workallocateid; }
    protected ConditionValue xgetCValueWorkallocateid() { return xdfgetWorkallocateid(); }

    /**
     * Add order-by as ascend. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Workallocateid_Asc() { regOBA("WORKALLOCATEID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Workallocateid_Desc() { regOBD("WORKALLOCATEID"); return this; }

    protected ConditionValue _rmano;
    public ConditionValue xdfgetRmano()
    { if (_rmano == null) { _rmano = nCV(); }
      return _rmano; }
    protected ConditionValue xgetCValueRmano() { return xdfgetRmano(); }

    /**
     * Add order-by as ascend. <br>
     * RMANO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Rmano_Asc() { regOBA("RMANO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RMANO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Rmano_Desc() { regOBD("RMANO"); return this; }

    protected ConditionValue _ownersono;
    public ConditionValue xdfgetOwnersono()
    { if (_ownersono == null) { _ownersono = nCV(); }
      return _ownersono; }
    protected ConditionValue xgetCValueOwnersono() { return xdfgetOwnersono(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Ownersono_Asc() { regOBA("OWNERSONO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Ownersono_Desc() { regOBD("OWNERSONO"); return this; }

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
    public BsTTrsolistCQ addOrderBy_Shiptocd_Asc() { regOBA("SHIPTOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Shiptocd_Desc() { regOBD("SHIPTOCD"); return this; }

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
    public BsTTrsolistCQ addOrderBy_Itemcd_Asc() { regOBA("ITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Itemcd_Desc() { regOBD("ITEMCD"); return this; }

    protected ConditionValue _soid;
    public ConditionValue xdfgetSoid()
    { if (_soid == null) { _soid = nCV(); }
      return _soid; }
    protected ConditionValue xgetCValueSoid() { return xdfgetSoid(); }

    /**
     * Add order-by as ascend. <br>
     * SOID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

    protected ConditionValue _sodetailid;
    public ConditionValue xdfgetSodetailid()
    { if (_sodetailid == null) { _sodetailid = nCV(); }
      return _sodetailid; }
    protected ConditionValue xgetCValueSodetailid() { return xdfgetSodetailid(); }

    /**
     * Add order-by as ascend. <br>
     * SODETAILID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Sodetailid_Asc() { regOBA("SODETAILID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SODETAILID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Sodetailid_Desc() { regOBD("SODETAILID"); return this; }

    protected ConditionValue _sopalletno;
    public ConditionValue xdfgetSopalletno()
    { if (_sopalletno == null) { _sopalletno = nCV(); }
      return _sopalletno; }
    protected ConditionValue xgetCValueSopalletno() { return xdfgetSopalletno(); }

    /**
     * Add order-by as ascend. <br>
     * SOPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Sopalletno_Asc() { regOBA("SOPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Sopalletno_Desc() { regOBD("SOPALLETNO"); return this; }

    protected ConditionValue _floor;
    public ConditionValue xdfgetFloor()
    { if (_floor == null) { _floor = nCV(); }
      return _floor; }
    protected ConditionValue xgetCValueFloor() { return xdfgetFloor(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Floor_Asc() { regOBA("FLOOR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_Floor_Desc() { regOBD("FLOOR"); return this; }

    protected ConditionValue _pickingInstId;
    public ConditionValue xdfgetPickingInstId()
    { if (_pickingInstId == null) { _pickingInstId = nCV(); }
      return _pickingInstId; }
    protected ConditionValue xgetCValuePickingInstId() { return xdfgetPickingInstId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_PickingInstId_Asc() { regOBA("PICKING_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_PickingInstId_Desc() { regOBD("PICKING_INST_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTTrsolistCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrsolistCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrsolistCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrsolistCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrsolistCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrsolistCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrsolistCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrsolistCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrsolistCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrsolistCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsolistCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrsolistCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrsolistCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrsolistCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrsolistCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrsolistCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrsolistCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrsolistCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrsolistCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrsolistCQ> _myselfExistsMap;
    public Map<String, TTrsolistCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrsolistCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrsolistCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrsolistCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrsolistCB.class.getName(); }
    protected String xCQ() { return TTrsolistCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
