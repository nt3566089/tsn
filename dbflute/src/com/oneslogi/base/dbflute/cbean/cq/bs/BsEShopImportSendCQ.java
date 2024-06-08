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
 * The base condition-query of E_SHOP_IMPORT_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsEShopImportSendCQ extends AbstractBsEShopImportSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EShopImportSendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShopImportSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_SHOP_IMPORT_SEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EShopImportSendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EShopImportSendCIQ xcreateCIQ() {
        EShopImportSendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EShopImportSendCIQ xnewCIQ() {
        return new EShopImportSendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_SHOP_IMPORT_SEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EShopImportSendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EShopImportSendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shopImportSendId;
    public ConditionValue xdfgetShopImportSendId()
    { if (_shopImportSendId == null) { _shopImportSendId = nCV(); }
      return _shopImportSendId; }
    protected ConditionValue xgetCValueShopImportSendId() { return xdfgetShopImportSendId(); }

    /**
     * Add order-by as ascend. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShopImportSendId_Asc() { regOBA("SHOP_IMPORT_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShopImportSendId_Desc() { regOBD("SHOP_IMPORT_SEND_ID"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _symbolPosKey;
    public ConditionValue xdfgetSymbolPosKey()
    { if (_symbolPosKey == null) { _symbolPosKey = nCV(); }
      return _symbolPosKey; }
    protected ConditionValue xgetCValueSymbolPosKey() { return xdfgetSymbolPosKey(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SymbolPosKey_Asc() { regOBA("SYMBOL_POS_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SymbolPosKey_Desc() { regOBD("SYMBOL_POS_KEY"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _warehouseSname;
    public ConditionValue xdfgetWarehouseSname()
    { if (_warehouseSname == null) { _warehouseSname = nCV(); }
      return _warehouseSname; }
    protected ConditionValue xgetCValueWarehouseSname() { return xdfgetWarehouseSname(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_WarehouseSname_Asc() { regOBA("WAREHOUSE_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_WarehouseSname_Desc() { regOBD("WAREHOUSE_SNAME"); return this; }

    protected ConditionValue _factoryCd;
    public ConditionValue xdfgetFactoryCd()
    { if (_factoryCd == null) { _factoryCd = nCV(); }
      return _factoryCd; }
    protected ConditionValue xgetCValueFactoryCd() { return xdfgetFactoryCd(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_FactoryCd_Asc() { regOBA("FACTORY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_FactoryCd_Desc() { regOBD("FACTORY_CD"); return this; }

    protected ConditionValue _factorySname;
    public ConditionValue xdfgetFactorySname()
    { if (_factorySname == null) { _factorySname = nCV(); }
      return _factorySname; }
    protected ConditionValue xgetCValueFactorySname() { return xdfgetFactorySname(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_FactorySname_Asc() { regOBA("FACTORY_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_FactorySname_Desc() { regOBD("FACTORY_SNAME"); return this; }

    protected ConditionValue _itemCdCase;
    public ConditionValue xdfgetItemCdCase()
    { if (_itemCdCase == null) { _itemCdCase = nCV(); }
      return _itemCdCase; }
    protected ConditionValue xgetCValueItemCdCase() { return xdfgetItemCdCase(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ItemCdCase_Asc() { regOBA("ITEM_CD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ItemCdCase_Desc() { regOBD("ITEM_CD_CASE"); return this; }

    protected ConditionValue _itemSnameCase;
    public ConditionValue xdfgetItemSnameCase()
    { if (_itemSnameCase == null) { _itemSnameCase = nCV(); }
      return _itemSnameCase; }
    protected ConditionValue xgetCValueItemSnameCase() { return xdfgetItemSnameCase(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ItemSnameCase_Asc() { regOBA("ITEM_SNAME_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ItemSnameCase_Desc() { regOBD("ITEM_SNAME_CASE"); return this; }

    protected ConditionValue _itemCdWh;
    public ConditionValue xdfgetItemCdWh()
    { if (_itemCdWh == null) { _itemCdWh = nCV(); }
      return _itemCdWh; }
    protected ConditionValue xgetCValueItemCdWh() { return xdfgetItemCdWh(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ItemCdWh_Asc() { regOBA("ITEM_CD_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ItemCdWh_Desc() { regOBD("ITEM_CD_WH"); return this; }

    protected ConditionValue _itemSnameWh;
    public ConditionValue xdfgetItemSnameWh()
    { if (_itemSnameWh == null) { _itemSnameWh = nCV(); }
      return _itemSnameWh; }
    protected ConditionValue xgetCValueItemSnameWh() { return xdfgetItemSnameWh(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ItemSnameWh_Asc() { regOBA("ITEM_SNAME_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ItemSnameWh_Desc() { regOBD("ITEM_SNAME_WH"); return this; }

    protected ConditionValue _rcvKey;
    public ConditionValue xdfgetRcvKey()
    { if (_rcvKey == null) { _rcvKey = nCV(); }
      return _rcvKey; }
    protected ConditionValue xgetCValueRcvKey() { return xdfgetRcvKey(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_RcvKey_Asc() { regOBA("RCV_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_RcvKey_Desc() { regOBD("RCV_KEY"); return this; }

    protected ConditionValue _machineNo;
    public ConditionValue xdfgetMachineNo()
    { if (_machineNo == null) { _machineNo = nCV(); }
      return _machineNo; }
    protected ConditionValue xgetCValueMachineNo() { return xdfgetMachineNo(); }

    /**
     * Add order-by as ascend. <br>
     * MACHINE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_MachineNo_Asc() { regOBA("MACHINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHINE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_MachineNo_Desc() { regOBD("MACHINE_NO"); return this; }

    protected ConditionValue _createNo;
    public ConditionValue xdfgetCreateNo()
    { if (_createNo == null) { _createNo = nCV(); }
      return _createNo; }
    protected ConditionValue xgetCValueCreateNo() { return xdfgetCreateNo(); }

    /**
     * Add order-by as ascend. <br>
     * CREATE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CreateNo_Asc() { regOBA("CREATE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CreateNo_Desc() { regOBD("CREATE_NO"); return this; }

    protected ConditionValue _limitDateNow;
    public ConditionValue xdfgetLimitDateNow()
    { if (_limitDateNow == null) { _limitDateNow = nCV(); }
      return _limitDateNow; }
    protected ConditionValue xgetCValueLimitDateNow() { return xdfgetLimitDateNow(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LimitDateNow_Asc() { regOBA("LIMIT_DATE_NOW"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LimitDateNow_Desc() { regOBD("LIMIT_DATE_NOW"); return this; }

    protected ConditionValue _designCdCase;
    public ConditionValue xdfgetDesignCdCase()
    { if (_designCdCase == null) { _designCdCase = nCV(); }
      return _designCdCase; }
    protected ConditionValue xgetCValueDesignCdCase() { return xdfgetDesignCdCase(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DesignCdCase_Asc() { regOBA("DESIGN_CD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DesignCdCase_Desc() { regOBD("DESIGN_CD_CASE"); return this; }

    protected ConditionValue _firmtransportNo;
    public ConditionValue xdfgetFirmtransportNo()
    { if (_firmtransportNo == null) { _firmtransportNo = nCV(); }
      return _firmtransportNo; }
    protected ConditionValue xgetCValueFirmtransportNo() { return xdfgetFirmtransportNo(); }

    /**
     * Add order-by as ascend. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_FirmtransportNo_Asc() { regOBA("FIRMTRANSPORT_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_FirmtransportNo_Desc() { regOBD("FIRMTRANSPORT_NO"); return this; }

    protected ConditionValue _manufactureCd;
    public ConditionValue xdfgetManufactureCd()
    { if (_manufactureCd == null) { _manufactureCd = nCV(); }
      return _manufactureCd; }
    protected ConditionValue xgetCValueManufactureCd() { return xdfgetManufactureCd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ManufactureCd_Asc() { regOBA("MANUFACTURE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ManufactureCd_Desc() { regOBD("MANUFACTURE_CD"); return this; }

    protected ConditionValue _otherLot1;
    public ConditionValue xdfgetOtherLot1()
    { if (_otherLot1 == null) { _otherLot1 = nCV(); }
      return _otherLot1; }
    protected ConditionValue xgetCValueOtherLot1() { return xdfgetOtherLot1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER_LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_OtherLot1_Asc() { regOBA("OTHER_LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER_LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_OtherLot1_Desc() { regOBD("OTHER_LOT1"); return this; }

    protected ConditionValue _caseCreateType;
    public ConditionValue xdfgetCaseCreateType()
    { if (_caseCreateType == null) { _caseCreateType = nCV(); }
      return _caseCreateType; }
    protected ConditionValue xgetCValueCaseCreateType() { return xdfgetCaseCreateType(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseCreateType_Asc() { regOBA("CASE_CREATE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseCreateType_Desc() { regOBD("CASE_CREATE_TYPE"); return this; }

    protected ConditionValue _codeSname;
    public ConditionValue xdfgetCodeSname()
    { if (_codeSname == null) { _codeSname = nCV(); }
      return _codeSname; }
    protected ConditionValue xgetCValueCodeSname() { return xdfgetCodeSname(); }

    /**
     * Add order-by as ascend. <br>
     * CODE_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CodeSname_Asc() { regOBA("CODE_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CODE_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CodeSname_Desc() { regOBD("CODE_SNAME"); return this; }

    protected ConditionValue _receiveDate;
    public ConditionValue xdfgetReceiveDate()
    { if (_receiveDate == null) { _receiveDate = nCV(); }
      return _receiveDate; }
    protected ConditionValue xgetCValueReceiveDate() { return xdfgetReceiveDate(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ReceiveDate_Asc() { regOBA("RECEIVE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ReceiveDate_Desc() { regOBD("RECEIVE_DATE"); return this; }

    protected ConditionValue _arrivalPortDate;
    public ConditionValue xdfgetArrivalPortDate()
    { if (_arrivalPortDate == null) { _arrivalPortDate = nCV(); }
      return _arrivalPortDate; }
    protected ConditionValue xgetCValueArrivalPortDate() { return xdfgetArrivalPortDate(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ArrivalPortDate_Asc() { regOBA("ARRIVAL_PORT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ArrivalPortDate_Desc() { regOBD("ARRIVAL_PORT_DATE"); return this; }

    protected ConditionValue _shipName;
    public ConditionValue xdfgetShipName()
    { if (_shipName == null) { _shipName = nCV(); }
      return _shipName; }
    protected ConditionValue xgetCValueShipName() { return xdfgetShipName(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipName_Asc() { regOBA("SHIP_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipName_Desc() { regOBD("SHIP_NAME"); return this; }

    protected ConditionValue _initNum;
    public ConditionValue xdfgetInitNum()
    { if (_initNum == null) { _initNum = nCV(); }
      return _initNum; }
    protected ConditionValue xgetCValueInitNum() { return xdfgetInitNum(); }

    /**
     * Add order-by as ascend. <br>
     * INIT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_InitNum_Asc() { regOBA("INIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INIT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_InitNum_Desc() { regOBD("INIT_NUM"); return this; }

    protected ConditionValue _mixedFlg;
    public ConditionValue xdfgetMixedFlg()
    { if (_mixedFlg == null) { _mixedFlg = nCV(); }
      return _mixedFlg; }
    protected ConditionValue xgetCValueMixedFlg() { return xdfgetMixedFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MIXED_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_MixedFlg_Asc() { regOBA("MIXED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIXED_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_MixedFlg_Desc() { regOBD("MIXED_FLG"); return this; }

    protected ConditionValue _lendFlg;
    public ConditionValue xdfgetLendFlg()
    { if (_lendFlg == null) { _lendFlg = nCV(); }
      return _lendFlg; }
    protected ConditionValue xgetCValueLendFlg() { return xdfgetLendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LEND_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LendFlg_Asc() { regOBA("LEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LEND_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LendFlg_Desc() { regOBD("LEND_FLG"); return this; }

    protected ConditionValue _locGroup;
    public ConditionValue xdfgetLocGroup()
    { if (_locGroup == null) { _locGroup = nCV(); }
      return _locGroup; }
    protected ConditionValue xgetCValueLocGroup() { return xdfgetLocGroup(); }

    /**
     * Add order-by as ascend. <br>
     * LOC_GROUP: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LocGroup_Asc() { regOBA("LOC_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC_GROUP: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LocGroup_Desc() { regOBD("LOC_GROUP"); return this; }

    protected ConditionValue _locCd;
    public ConditionValue xdfgetLocCd()
    { if (_locCd == null) { _locCd = nCV(); }
      return _locCd; }
    protected ConditionValue xgetCValueLocCd() { return xdfgetLocCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOC_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LocCd_Asc() { regOBA("LOC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LocCd_Desc() { regOBD("LOC_CD"); return this; }

    protected ConditionValue _shipDate;
    public ConditionValue xdfgetShipDate()
    { if (_shipDate == null) { _shipDate = nCV(); }
      return _shipDate; }
    protected ConditionValue xgetCValueShipDate() { return xdfgetShipDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipDate_Asc() { regOBA("SHIP_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipDate_Desc() { regOBD("SHIP_DATE"); return this; }

    protected ConditionValue _currentLocationCd;
    public ConditionValue xdfgetCurrentLocationCd()
    { if (_currentLocationCd == null) { _currentLocationCd = nCV(); }
      return _currentLocationCd; }
    protected ConditionValue xgetCValueCurrentLocationCd() { return xdfgetCurrentLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CurrentLocationCd_Asc() { regOBA("CURRENT_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CurrentLocationCd_Desc() { regOBD("CURRENT_LOCATION_CD"); return this; }

    protected ConditionValue _currentLocationSname;
    public ConditionValue xdfgetCurrentLocationSname()
    { if (_currentLocationSname == null) { _currentLocationSname = nCV(); }
      return _currentLocationSname; }
    protected ConditionValue xgetCValueCurrentLocationSname() { return xdfgetCurrentLocationSname(); }

    /**
     * Add order-by as ascend. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CurrentLocationSname_Asc() { regOBA("CURRENT_LOCATION_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CurrentLocationSname_Desc() { regOBD("CURRENT_LOCATION_SNAME"); return this; }

    protected ConditionValue _shipToCd;
    public ConditionValue xdfgetShipToCd()
    { if (_shipToCd == null) { _shipToCd = nCV(); }
      return _shipToCd; }
    protected ConditionValue xgetCValueShipToCd() { return xdfgetShipToCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipToCd_Asc() { regOBA("SHIP_TO_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipToCd_Desc() { regOBD("SHIP_TO_CD"); return this; }

    protected ConditionValue _shipToSname;
    public ConditionValue xdfgetShipToSname()
    { if (_shipToSname == null) { _shipToSname = nCV(); }
      return _shipToSname; }
    protected ConditionValue xgetCValueShipToSname() { return xdfgetShipToSname(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipToSname_Asc() { regOBA("SHIP_TO_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipToSname_Desc() { regOBD("SHIP_TO_SNAME"); return this; }

    protected ConditionValue _createDatetime;
    public ConditionValue xdfgetCreateDatetime()
    { if (_createDatetime == null) { _createDatetime = nCV(); }
      return _createDatetime; }
    protected ConditionValue xgetCValueCreateDatetime() { return xdfgetCreateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CreateDatetime_Asc() { regOBA("CREATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CreateDatetime_Desc() { regOBD("CREATE_DATETIME"); return this; }

    protected ConditionValue _traceType;
    public ConditionValue xdfgetTraceType()
    { if (_traceType == null) { _traceType = nCV(); }
      return _traceType; }
    protected ConditionValue xgetCValueTraceType() { return xdfgetTraceType(); }

    /**
     * Add order-by as ascend. <br>
     * TRACE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_TraceType_Asc() { regOBA("TRACE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_TraceType_Desc() { regOBD("TRACE_TYPE"); return this; }

    protected ConditionValue _traceTypeSname;
    public ConditionValue xdfgetTraceTypeSname()
    { if (_traceTypeSname == null) { _traceTypeSname = nCV(); }
      return _traceTypeSname; }
    protected ConditionValue xgetCValueTraceTypeSname() { return xdfgetTraceTypeSname(); }

    /**
     * Add order-by as ascend. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_TraceTypeSname_Asc() { regOBA("TRACE_TYPE_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_TraceTypeSname_Desc() { regOBD("TRACE_TYPE_SNAME"); return this; }

    protected ConditionValue _examSts;
    public ConditionValue xdfgetExamSts()
    { if (_examSts == null) { _examSts = nCV(); }
      return _examSts; }
    protected ConditionValue xgetCValueExamSts() { return xdfgetExamSts(); }

    /**
     * Add order-by as ascend. <br>
     * EXAM_STS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ExamSts_Asc() { regOBA("EXAM_STS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAM_STS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ExamSts_Desc() { regOBD("EXAM_STS"); return this; }

    protected ConditionValue _caseInNum;
    public ConditionValue xdfgetCaseInNum()
    { if (_caseInNum == null) { _caseInNum = nCV(); }
      return _caseInNum; }
    protected ConditionValue xgetCValueCaseInNum() { return xdfgetCaseInNum(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseInNum_Asc() { regOBA("CASE_IN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseInNum_Desc() { regOBD("CASE_IN_NUM"); return this; }

    protected ConditionValue _shippingNum;
    public ConditionValue xdfgetShippingNum()
    { if (_shippingNum == null) { _shippingNum = nCV(); }
      return _shippingNum; }
    protected ConditionValue xgetCValueShippingNum() { return xdfgetShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShippingNum_Asc() { regOBA("SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShippingNum_Desc() { regOBD("SHIPPING_NUM"); return this; }

    protected ConditionValue _assortDatetime;
    public ConditionValue xdfgetAssortDatetime()
    { if (_assortDatetime == null) { _assortDatetime = nCV(); }
      return _assortDatetime; }
    protected ConditionValue xgetCValueAssortDatetime() { return xdfgetAssortDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortDatetime_Asc() { regOBA("ASSORT_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortDatetime_Desc() { regOBD("ASSORT_DATETIME"); return this; }

    protected ConditionValue _lineBlock;
    public ConditionValue xdfgetLineBlock()
    { if (_lineBlock == null) { _lineBlock = nCV(); }
      return _lineBlock; }
    protected ConditionValue xgetCValueLineBlock() { return xdfgetLineBlock(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_BLOCK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LineBlock_Asc() { regOBA("LINE_BLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_LineBlock_Desc() { regOBD("LINE_BLOCK"); return this; }

    protected ConditionValue _assortedUnit;
    public ConditionValue xdfgetAssortedUnit()
    { if (_assortedUnit == null) { _assortedUnit = nCV(); }
      return _assortedUnit; }
    protected ConditionValue xgetCValueAssortedUnit() { return xdfgetAssortedUnit(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortedUnit_Asc() { regOBA("ASSORTED_UNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortedUnit_Desc() { regOBD("ASSORTED_UNIT"); return this; }

    protected ConditionValue _assortedIndex;
    public ConditionValue xdfgetAssortedIndex()
    { if (_assortedIndex == null) { _assortedIndex = nCV(); }
      return _assortedIndex; }
    protected ConditionValue xgetCValueAssortedIndex() { return xdfgetAssortedIndex(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortedIndex_Asc() { regOBA("ASSORTED_INDEX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortedIndex_Desc() { regOBD("ASSORTED_INDEX"); return this; }

    protected ConditionValue _operationCode;
    public ConditionValue xdfgetOperationCode()
    { if (_operationCode == null) { _operationCode = nCV(); }
      return _operationCode; }
    protected ConditionValue xgetCValueOperationCode() { return xdfgetOperationCode(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATION_CODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_OperationCode_Asc() { regOBA("OPERATION_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATION_CODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_OperationCode_Desc() { regOBD("OPERATION_CODE"); return this; }

    protected ConditionValue _operationNum;
    public ConditionValue xdfgetOperationNum()
    { if (_operationNum == null) { _operationNum = nCV(); }
      return _operationNum; }
    protected ConditionValue xgetCValueOperationNum() { return xdfgetOperationNum(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATION_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_OperationNum_Asc() { regOBA("OPERATION_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATION_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_OperationNum_Desc() { regOBD("OPERATION_NUM"); return this; }

    protected ConditionValue _assortNum;
    public ConditionValue xdfgetAssortNum()
    { if (_assortNum == null) { _assortNum = nCV(); }
      return _assortNum; }
    protected ConditionValue xgetCValueAssortNum() { return xdfgetAssortNum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortNum_Asc() { regOBA("ASSORT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortNum_Desc() { regOBD("ASSORT_NUM"); return this; }

    protected ConditionValue _assortDifNum;
    public ConditionValue xdfgetAssortDifNum()
    { if (_assortDifNum == null) { _assortDifNum = nCV(); }
      return _assortDifNum; }
    protected ConditionValue xgetCValueAssortDifNum() { return xdfgetAssortDifNum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortDifNum_Asc() { regOBA("ASSORT_DIF_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AssortDifNum_Desc() { regOBD("ASSORT_DIF_NUM"); return this; }

    protected ConditionValue _directionCd;
    public ConditionValue xdfgetDirectionCd()
    { if (_directionCd == null) { _directionCd = nCV(); }
      return _directionCd; }
    protected ConditionValue xgetCValueDirectionCd() { return xdfgetDirectionCd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DirectionCd_Asc() { regOBA("DIRECTION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DirectionCd_Desc() { regOBD("DIRECTION_CD"); return this; }

    protected ConditionValue _pistonType;
    public ConditionValue xdfgetPistonType()
    { if (_pistonType == null) { _pistonType = nCV(); }
      return _pistonType; }
    protected ConditionValue xgetCValuePistonType() { return xdfgetPistonType(); }

    /**
     * Add order-by as ascend. <br>
     * PISTON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_PistonType_Asc() { regOBA("PISTON_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_PistonType_Desc() { regOBD("PISTON_TYPE"); return this; }

    protected ConditionValue _customerCd;
    public ConditionValue xdfgetCustomerCd()
    { if (_customerCd == null) { _customerCd = nCV(); }
      return _customerCd; }
    protected ConditionValue xgetCValueCustomerCd() { return xdfgetCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _directionNum;
    public ConditionValue xdfgetDirectionNum()
    { if (_directionNum == null) { _directionNum = nCV(); }
      return _directionNum; }
    protected ConditionValue xgetCValueDirectionNum() { return xdfgetDirectionNum(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DirectionNum_Asc() { regOBA("DIRECTION_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DirectionNum_Desc() { regOBD("DIRECTION_NUM"); return this; }

    protected ConditionValue _supplierRcvNo;
    public ConditionValue xdfgetSupplierRcvNo()
    { if (_supplierRcvNo == null) { _supplierRcvNo = nCV(); }
      return _supplierRcvNo; }
    protected ConditionValue xgetCValueSupplierRcvNo() { return xdfgetSupplierRcvNo(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SupplierRcvNo_Asc() { regOBA("SUPPLIER_RCV_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SupplierRcvNo_Desc() { regOBD("SUPPLIER_RCV_NO"); return this; }

    protected ConditionValue _tokuhanCd;
    public ConditionValue xdfgetTokuhanCd()
    { if (_tokuhanCd == null) { _tokuhanCd = nCV(); }
      return _tokuhanCd; }
    protected ConditionValue xgetCValueTokuhanCd() { return xdfgetTokuhanCd(); }

    /**
     * Add order-by as ascend. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_TokuhanCd_Asc() { regOBA("TOKUHAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_TokuhanCd_Desc() { regOBD("TOKUHAN_CD"); return this; }

    protected ConditionValue _tokuhanSname;
    public ConditionValue xdfgetTokuhanSname()
    { if (_tokuhanSname == null) { _tokuhanSname = nCV(); }
      return _tokuhanSname; }
    protected ConditionValue xgetCValueTokuhanSname() { return xdfgetTokuhanSname(); }

    /**
     * Add order-by as ascend. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_TokuhanSname_Asc() { regOBA("TOKUHAN_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_TokuhanSname_Desc() { regOBD("TOKUHAN_SNAME"); return this; }

    protected ConditionValue _makerCaseNo;
    public ConditionValue xdfgetMakerCaseNo()
    { if (_makerCaseNo == null) { _makerCaseNo = nCV(); }
      return _makerCaseNo; }
    protected ConditionValue xgetCValueMakerCaseNo() { return xdfgetMakerCaseNo(); }

    /**
     * Add order-by as ascend. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_MakerCaseNo_Asc() { regOBA("MAKER_CASE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_MakerCaseNo_Desc() { regOBD("MAKER_CASE_NO"); return this; }

    protected ConditionValue _caseItfNo;
    public ConditionValue xdfgetCaseItfNo()
    { if (_caseItfNo == null) { _caseItfNo = nCV(); }
      return _caseItfNo; }
    protected ConditionValue xgetCValueCaseItfNo() { return xdfgetCaseItfNo(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseItfNo_Asc() { regOBA("CASE_ITF_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseItfNo_Desc() { regOBD("CASE_ITF_NO"); return this; }

    protected ConditionValue _caseBarcodeValiant;
    public ConditionValue xdfgetCaseBarcodeValiant()
    { if (_caseBarcodeValiant == null) { _caseBarcodeValiant = nCV(); }
      return _caseBarcodeValiant; }
    protected ConditionValue xgetCValueCaseBarcodeValiant() { return xdfgetCaseBarcodeValiant(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseBarcodeValiant_Asc() { regOBA("CASE_BARCODE_VALIANT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseBarcodeValiant_Desc() { regOBD("CASE_BARCODE_VALIANT"); return this; }

    protected ConditionValue _caseLot4;
    public ConditionValue xdfgetCaseLot4()
    { if (_caseLot4 == null) { _caseLot4 = nCV(); }
      return _caseLot4; }
    protected ConditionValue xgetCValueCaseLot4() { return xdfgetCaseLot4(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_LOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseLot4_Asc() { regOBA("CASE_LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_LOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseLot4_Desc() { regOBD("CASE_LOT4"); return this; }

    protected ConditionValue _caseCenterNo;
    public ConditionValue xdfgetCaseCenterNo()
    { if (_caseCenterNo == null) { _caseCenterNo = nCV(); }
      return _caseCenterNo; }
    protected ConditionValue xgetCValueCaseCenterNo() { return xdfgetCaseCenterNo(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseCenterNo_Asc() { regOBA("CASE_CENTER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseCenterNo_Desc() { regOBD("CASE_CENTER_NO"); return this; }

    protected ConditionValue _casePackNo;
    public ConditionValue xdfgetCasePackNo()
    { if (_casePackNo == null) { _casePackNo = nCV(); }
      return _casePackNo; }
    protected ConditionValue xgetCValueCasePackNo() { return xdfgetCasePackNo(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CasePackNo_Asc() { regOBA("CASE_PACK_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CasePackNo_Desc() { regOBD("CASE_PACK_NO"); return this; }

    protected ConditionValue _casePackTime;
    public ConditionValue xdfgetCasePackTime()
    { if (_casePackTime == null) { _casePackTime = nCV(); }
      return _casePackTime; }
    protected ConditionValue xgetCValueCasePackTime() { return xdfgetCasePackTime(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CasePackTime_Asc() { regOBA("CASE_PACK_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CasePackTime_Desc() { regOBD("CASE_PACK_TIME"); return this; }

    protected ConditionValue _senderLocation;
    public ConditionValue xdfgetSenderLocation()
    { if (_senderLocation == null) { _senderLocation = nCV(); }
      return _senderLocation; }
    protected ConditionValue xgetCValueSenderLocation() { return xdfgetSenderLocation(); }

    /**
     * Add order-by as ascend. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SenderLocation_Asc() { regOBA("SENDER_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SenderLocation_Desc() { regOBD("SENDER_LOCATION"); return this; }

    protected ConditionValue _receiverLocation;
    public ConditionValue xdfgetReceiverLocation()
    { if (_receiverLocation == null) { _receiverLocation = nCV(); }
      return _receiverLocation; }
    protected ConditionValue xgetCValueReceiverLocation() { return xdfgetReceiverLocation(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ReceiverLocation_Asc() { regOBA("RECEIVER_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ReceiverLocation_Desc() { regOBD("RECEIVER_LOCATION"); return this; }

    protected ConditionValue _shipmentId;
    public ConditionValue xdfgetShipmentId()
    { if (_shipmentId == null) { _shipmentId = nCV(); }
      return _shipmentId; }
    protected ConditionValue xgetCValueShipmentId() { return xdfgetShipmentId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipmentId_Asc() { regOBA("SHIPMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipmentId_Desc() { regOBD("SHIPMENT_ID"); return this; }

    protected ConditionValue _shipmentDate;
    public ConditionValue xdfgetShipmentDate()
    { if (_shipmentDate == null) { _shipmentDate = nCV(); }
      return _shipmentDate; }
    protected ConditionValue xgetCValueShipmentDate() { return xdfgetShipmentDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipmentDate_Asc() { regOBA("SHIPMENT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ShipmentDate_Desc() { regOBD("SHIPMENT_DATE"); return this; }

    protected ConditionValue _numberOfPallets;
    public ConditionValue xdfgetNumberOfPallets()
    { if (_numberOfPallets == null) { _numberOfPallets = nCV(); }
      return _numberOfPallets; }
    protected ConditionValue xgetCValueNumberOfPallets() { return xdfgetNumberOfPallets(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_NumberOfPallets_Asc() { regOBA("NUMBER_OF_PALLETS"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_NumberOfPallets_Desc() { regOBD("NUMBER_OF_PALLETS"); return this; }

    protected ConditionValue _carrierNo;
    public ConditionValue xdfgetCarrierNo()
    { if (_carrierNo == null) { _carrierNo = nCV(); }
      return _carrierNo; }
    protected ConditionValue xgetCValueCarrierNo() { return xdfgetCarrierNo(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CarrierNo_Asc() { regOBA("CARRIER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CarrierNo_Desc() { regOBD("CARRIER_NO"); return this; }

    protected ConditionValue _orderNo;
    public ConditionValue xdfgetOrderNo()
    { if (_orderNo == null) { _orderNo = nCV(); }
      return _orderNo; }
    protected ConditionValue xgetCValueOrderNo() { return xdfgetOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_OrderNo_Asc() { regOBA("ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_OrderNo_Desc() { regOBD("ORDER_NO"); return this; }

    protected ConditionValue _srcCd;
    public ConditionValue xdfgetSrcCd()
    { if (_srcCd == null) { _srcCd = nCV(); }
      return _srcCd; }
    protected ConditionValue xgetCValueSrcCd() { return xdfgetSrcCd(); }

    /**
     * Add order-by as ascend. <br>
     * SRC_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SrcCd_Asc() { regOBA("SRC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRC_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SrcCd_Desc() { regOBD("SRC_CD"); return this; }

    protected ConditionValue _blNo;
    public ConditionValue xdfgetBlNo()
    { if (_blNo == null) { _blNo = nCV(); }
      return _blNo; }
    protected ConditionValue xgetCValueBlNo() { return xdfgetBlNo(); }

    /**
     * Add order-by as ascend. <br>
     * BL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_BlNo_Asc() { regOBA("BL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_BlNo_Desc() { regOBD("BL_NO"); return this; }

    protected ConditionValue _invoiceNo;
    public ConditionValue xdfgetInvoiceNo()
    { if (_invoiceNo == null) { _invoiceNo = nCV(); }
      return _invoiceNo; }
    protected ConditionValue xgetCValueInvoiceNo() { return xdfgetInvoiceNo(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_InvoiceNo_Asc() { regOBA("INVOICE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_InvoiceNo_Desc() { regOBD("INVOICE_NO"); return this; }

    protected ConditionValue _sscc;
    public ConditionValue xdfgetSscc()
    { if (_sscc == null) { _sscc = nCV(); }
      return _sscc; }
    protected ConditionValue xgetCValueSscc() { return xdfgetSscc(); }

    /**
     * Add order-by as ascend. <br>
     * SSCC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_Sscc_Asc() { regOBA("SSCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSCC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_Sscc_Desc() { regOBD("SSCC"); return this; }

    protected ConditionValue _caseNo;
    public ConditionValue xdfgetCaseNo()
    { if (_caseNo == null) { _caseNo = nCV(); }
      return _caseNo; }
    protected ConditionValue xgetCValueCaseNo() { return xdfgetCaseNo(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseNo_Asc() { regOBA("CASE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_CaseNo_Desc() { regOBD("CASE_NO"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_InvNum_Asc() { regOBA("INV_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INV_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_InvNum_Desc() { regOBD("INV_NUM"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_SortNum_Asc() { regOBA("SORT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SortNum_Desc() { regOBD("SORT_NUM"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_AdoptNum_Asc() { regOBA("ADOPT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADOPT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AdoptNum_Desc() { regOBD("ADOPT_NUM"); return this; }

    protected ConditionValue _deliveryDatetime;
    public ConditionValue xdfgetDeliveryDatetime()
    { if (_deliveryDatetime == null) { _deliveryDatetime = nCV(); }
      return _deliveryDatetime; }
    protected ConditionValue xgetCValueDeliveryDatetime() { return xdfgetDeliveryDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DeliveryDatetime_Asc() { regOBA("DELIVERY_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DeliveryDatetime_Desc() { regOBD("DELIVERY_DATETIME"); return this; }

    protected ConditionValue _spareStr;
    public ConditionValue xdfgetSpareStr()
    { if (_spareStr == null) { _spareStr = nCV(); }
      return _spareStr; }
    protected ConditionValue xgetCValueSpareStr() { return xdfgetSpareStr(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEShopImportSendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShopImportSendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEShopImportSendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEShopImportSendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EShopImportSendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EShopImportSendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EShopImportSendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EShopImportSendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EShopImportSendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EShopImportSendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EShopImportSendCQ> _myselfExistsMap;
    public Map<String, EShopImportSendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EShopImportSendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EShopImportSendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EShopImportSendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EShopImportSendCB.class.getName(); }
    protected String xCQ() { return EShopImportSendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
