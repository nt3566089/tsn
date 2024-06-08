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
 * The base condition-query of W_REPLENISH_INST_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWReplenishInstInputCQ extends AbstractBsWReplenishInstInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WReplenishInstInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWReplenishInstInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_REPLENISH_INST_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WReplenishInstInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WReplenishInstInputCIQ xcreateCIQ() {
        WReplenishInstInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WReplenishInstInputCIQ xnewCIQ() {
        return new WReplenishInstInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_REPLENISH_INST_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WReplenishInstInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WReplenishInstInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _replenishInstInputId;
    public ConditionValue xdfgetReplenishInstInputId()
    { if (_replenishInstInputId == null) { _replenishInstInputId = nCV(); }
      return _replenishInstInputId; }
    protected ConditionValue xgetCValueReplenishInstInputId() { return xdfgetReplenishInstInputId(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ReplenishInstInputId_Asc() { regOBA("REPLENISH_INST_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ReplenishInstInputId_Desc() { regOBD("REPLENISH_INST_INPUT_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _flexlnsNo;
    public ConditionValue xdfgetFlexlnsNo()
    { if (_flexlnsNo == null) { _flexlnsNo = nCV(); }
      return _flexlnsNo; }
    protected ConditionValue xgetCValueFlexlnsNo() { return xdfgetFlexlnsNo(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXLNS_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_FlexlnsNo_Asc() { regOBA("FLEXLNS_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXLNS_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_FlexlnsNo_Desc() { regOBD("FLEXLNS_NO"); return this; }

    protected ConditionValue _schDate;
    public ConditionValue xdfgetSchDate()
    { if (_schDate == null) { _schDate = nCV(); }
      return _schDate; }
    protected ConditionValue xgetCValueSchDate() { return xdfgetSchDate(); }

    /**
     * Add order-by as ascend. <br>
     * SCH_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_SchDate_Asc() { regOBA("SCH_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCH_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_SchDate_Desc() { regOBD("SCH_DATE"); return this; }

    protected ConditionValue _supplierCd;
    public ConditionValue xdfgetSupplierCd()
    { if (_supplierCd == null) { _supplierCd = nCV(); }
      return _supplierCd; }
    protected ConditionValue xgetCValueSupplierCd() { return xdfgetSupplierCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_SupplierCd_Asc() { regOBA("SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_SupplierCd_Desc() { regOBD("SUPPLIER_CD"); return this; }

    protected ConditionValue _rcvDate;
    public ConditionValue xdfgetRcvDate()
    { if (_rcvDate == null) { _rcvDate = nCV(); }
      return _rcvDate; }
    protected ConditionValue xgetCValueRcvDate() { return xdfgetRcvDate(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_RcvDate_Asc() { regOBA("RCV_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_RcvDate_Desc() { regOBD("RCV_DATE"); return this; }

    protected ConditionValue _shipCd;
    public ConditionValue xdfgetShipCd()
    { if (_shipCd == null) { _shipCd = nCV(); }
      return _shipCd; }
    protected ConditionValue xgetCValueShipCd() { return xdfgetShipCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ShipCd_Asc() { regOBA("SHIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ShipCd_Desc() { regOBD("SHIP_CD"); return this; }

    protected ConditionValue _itemCd;
    public ConditionValue xdfgetItemCd()
    { if (_itemCd == null) { _itemCd = nCV(); }
      return _itemCd; }
    protected ConditionValue xgetCValueItemCd() { return xdfgetItemCd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ItemCd_Asc() { regOBA("ITEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ItemCd_Desc() { regOBD("ITEM_CD"); return this; }

    protected ConditionValue _manufactureDate;
    public ConditionValue xdfgetManufactureDate()
    { if (_manufactureDate == null) { _manufactureDate = nCV(); }
      return _manufactureDate; }
    protected ConditionValue xgetCValueManufactureDate() { return xdfgetManufactureDate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURE_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ManufactureDate_Asc() { regOBA("MANUFACTURE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURE_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ManufactureDate_Desc() { regOBD("MANUFACTURE_DATE"); return this; }

    protected ConditionValue _designCd;
    public ConditionValue xdfgetDesignCd()
    { if (_designCd == null) { _designCd = nCV(); }
      return _designCd; }
    protected ConditionValue xgetCValueDesignCd() { return xdfgetDesignCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_DesignCd_Asc() { regOBA("DESIGN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_DesignCd_Desc() { regOBD("DESIGN_CD"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _flexUpdUserCd;
    public ConditionValue xdfgetFlexUpdUserCd()
    { if (_flexUpdUserCd == null) { _flexUpdUserCd = nCV(); }
      return _flexUpdUserCd; }
    protected ConditionValue xgetCValueFlexUpdUserCd() { return xdfgetFlexUpdUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * FLEX_UPD_USER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_FlexUpdUserCd_Asc() { regOBA("FLEX_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEX_UPD_USER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_FlexUpdUserCd_Desc() { regOBD("FLEX_UPD_USER_CD"); return this; }

    protected ConditionValue _flexibityno;
    public ConditionValue xdfgetFlexibityno()
    { if (_flexibityno == null) { _flexibityno = nCV(); }
      return _flexibityno; }
    protected ConditionValue xgetCValueFlexibityno() { return xdfgetFlexibityno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBITYNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_Flexibityno_Asc() { regOBA("FLEXIBITYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBITYNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_Flexibityno_Desc() { regOBD("FLEXIBITYNO"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMsg;
    public ConditionValue xdfgetErrorMsg()
    { if (_errorMsg == null) { _errorMsg = nCV(); }
      return _errorMsg; }
    protected ConditionValue xgetCValueErrorMsg() { return xdfgetErrorMsg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ErrorMsg_Asc() { regOBA("ERROR_MSG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ErrorMsg_Desc() { regOBD("ERROR_MSG"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWReplenishInstInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWReplenishInstInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWReplenishInstInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWReplenishInstInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WReplenishInstInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WReplenishInstInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WReplenishInstInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WReplenishInstInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WReplenishInstInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WReplenishInstInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WReplenishInstInputCQ> _myselfExistsMap;
    public Map<String, WReplenishInstInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WReplenishInstInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WReplenishInstInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WReplenishInstInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WReplenishInstInputCB.class.getName(); }
    protected String xCQ() { return WReplenishInstInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
