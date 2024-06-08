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
 * The base condition-query of T_TRMANUFACTUREDATEDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrmanufacturedatedetailCQ extends AbstractBsTTrmanufacturedatedetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrmanufacturedatedetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrmanufacturedatedetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRMANUFACTUREDATEDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrmanufacturedatedetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrmanufacturedatedetailCIQ xcreateCIQ() {
        TTrmanufacturedatedetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrmanufacturedatedetailCIQ xnewCIQ() {
        return new TTrmanufacturedatedetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRMANUFACTUREDATEDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrmanufacturedatedetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrmanufacturedatedetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trmanufacturedatedetailId;
    public ConditionValue xdfgetTrmanufacturedatedetailId()
    { if (_trmanufacturedatedetailId == null) { _trmanufacturedatedetailId = nCV(); }
      return _trmanufacturedatedetailId; }
    protected ConditionValue xgetCValueTrmanufacturedatedetailId() { return xdfgetTrmanufacturedatedetailId(); }

    /**
     * Add order-by as ascend. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_TrmanufacturedatedetailId_Asc() { regOBA("TRMANUFACTUREDATEDETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_TrmanufacturedatedetailId_Desc() { regOBD("TRMANUFACTUREDATEDETAIL_ID"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _ownerCd;
    public ConditionValue xdfgetOwnerCd()
    { if (_ownerCd == null) { _ownerCd = nCV(); }
      return _ownerCd; }
    protected ConditionValue xgetCValueOwnerCd() { return xdfgetOwnerCd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_OwnerCd_Asc() { regOBA("OWNER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_OwnerCd_Desc() { regOBD("OWNER_CD"); return this; }

    protected ConditionValue _inventoryKbn;
    public ConditionValue xdfgetInventoryKbn()
    { if (_inventoryKbn == null) { _inventoryKbn = nCV(); }
      return _inventoryKbn; }
    protected ConditionValue xgetCValueInventoryKbn() { return xdfgetInventoryKbn(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InventoryKbn_Asc() { regOBA("INVENTORY_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InventoryKbn_Desc() { regOBD("INVENTORY_KBN"); return this; }

    protected ConditionValue _lineBlock;
    public ConditionValue xdfgetLineBlock()
    { if (_lineBlock == null) { _lineBlock = nCV(); }
      return _lineBlock; }
    protected ConditionValue xgetCValueLineBlock() { return xdfgetLineBlock(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_LineBlock_Asc() { regOBA("LINE_BLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_LineBlock_Desc() { regOBD("LINE_BLOCK"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _inventoryKey;
    public ConditionValue xdfgetInventoryKey()
    { if (_inventoryKey == null) { _inventoryKey = nCV(); }
      return _inventoryKey; }
    protected ConditionValue xgetCValueInventoryKey() { return xdfgetInventoryKey(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InventoryKey_Asc() { regOBA("INVENTORY_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InventoryKey_Desc() { regOBD("INVENTORY_KEY"); return this; }

    protected ConditionValue _inventoryBId;
    public ConditionValue xdfgetInventoryBId()
    { if (_inventoryBId == null) { _inventoryBId = nCV(); }
      return _inventoryBId; }
    protected ConditionValue xgetCValueInventoryBId() { return xdfgetInventoryBId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InventoryBId_Asc() { regOBA("INVENTORY_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InventoryBId_Desc() { regOBD("INVENTORY_B_ID"); return this; }

    protected ConditionValue _inventoryDate;
    public ConditionValue xdfgetInventoryDate()
    { if (_inventoryDate == null) { _inventoryDate = nCV(); }
      return _inventoryDate; }
    protected ConditionValue xgetCValueInventoryDate() { return xdfgetInventoryDate(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InventoryDate_Asc() { regOBA("INVENTORY_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InventoryDate_Desc() { regOBD("INVENTORY_DATE"); return this; }

    protected ConditionValue _bfManufactureDate;
    public ConditionValue xdfgetBfManufactureDate()
    { if (_bfManufactureDate == null) { _bfManufactureDate = nCV(); }
      return _bfManufactureDate; }
    protected ConditionValue xgetCValueBfManufactureDate() { return xdfgetBfManufactureDate(); }

    /**
     * Add order-by as ascend. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_BfManufactureDate_Asc() { regOBA("BF_MANUFACTURE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_BfManufactureDate_Desc() { regOBD("BF_MANUFACTURE_DATE"); return this; }

    protected ConditionValue _afManufactureDate;
    public ConditionValue xdfgetAfManufactureDate()
    { if (_afManufactureDate == null) { _afManufactureDate = nCV(); }
      return _afManufactureDate; }
    protected ConditionValue xgetCValueAfManufactureDate() { return xdfgetAfManufactureDate(); }

    /**
     * Add order-by as ascend. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_AfManufactureDate_Asc() { regOBA("AF_MANUFACTURE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_AfManufactureDate_Desc() { regOBD("AF_MANUFACTURE_DATE"); return this; }

    protected ConditionValue _designFlg;
    public ConditionValue xdfgetDesignFlg()
    { if (_designFlg == null) { _designFlg = nCV(); }
      return _designFlg; }
    protected ConditionValue xgetCValueDesignFlg() { return xdfgetDesignFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_DesignFlg_Asc() { regOBA("DESIGN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_DesignFlg_Desc() { regOBD("DESIGN_FLG"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_Printedflg_Asc() { regOBA("PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_Printedflg_Desc() { regOBD("PRINTEDFLG"); return this; }

    protected ConditionValue _insideOutsideKbn;
    public ConditionValue xdfgetInsideOutsideKbn()
    { if (_insideOutsideKbn == null) { _insideOutsideKbn = nCV(); }
      return _insideOutsideKbn; }
    protected ConditionValue xgetCValueInsideOutsideKbn() { return xdfgetInsideOutsideKbn(); }

    /**
     * Add order-by as ascend. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InsideOutsideKbn_Asc() { regOBA("INSIDE_OUTSIDE_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_InsideOutsideKbn_Desc() { regOBD("INSIDE_OUTSIDE_KBN"); return this; }

    protected ConditionValue _rmano;
    public ConditionValue xdfgetRmano()
    { if (_rmano == null) { _rmano = nCV(); }
      return _rmano; }
    protected ConditionValue xgetCValueRmano() { return xdfgetRmano(); }

    /**
     * Add order-by as ascend. <br>
     * RMANO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_Rmano_Asc() { regOBA("RMANO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RMANO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_Rmano_Desc() { regOBD("RMANO"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrmanufacturedatedetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrmanufacturedatedetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrmanufacturedatedetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrmanufacturedatedetailCQ bq = (TTrmanufacturedatedetailCQ)bqs;
        TTrmanufacturedatedetailCQ uq = (TTrmanufacturedatedetailCQ)uqs;
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
        String nrp = xresolveNRP("T_TRMANUFACTUREDATEDETAIL", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_TRMANUFACTUREDATEDETAIL", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TTrmanufacturedatedetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrmanufacturedatedetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrmanufacturedatedetailCQ> _myselfExistsMap;
    public Map<String, TTrmanufacturedatedetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrmanufacturedatedetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrmanufacturedatedetailCB.class.getName(); }
    protected String xCQ() { return TTrmanufacturedatedetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
