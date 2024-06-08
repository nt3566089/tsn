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
 * The base condition-query of E_STOCK_RECORD_RECEIVE.
 * @author DBFlute(AutoGenerator)
 */
public class BsEStockRecordReceiveCQ extends AbstractBsEStockRecordReceiveCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EStockRecordReceiveCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEStockRecordReceiveCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_STOCK_RECORD_RECEIVE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EStockRecordReceiveCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EStockRecordReceiveCIQ xcreateCIQ() {
        EStockRecordReceiveCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EStockRecordReceiveCIQ xnewCIQ() {
        return new EStockRecordReceiveCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_STOCK_RECORD_RECEIVE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EStockRecordReceiveCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EStockRecordReceiveCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stockRecordReceiveId;
    public ConditionValue xdfgetStockRecordReceiveId()
    { if (_stockRecordReceiveId == null) { _stockRecordReceiveId = nCV(); }
      return _stockRecordReceiveId; }
    protected ConditionValue xgetCValueStockRecordReceiveId() { return xdfgetStockRecordReceiveId(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StockRecordReceiveId_Asc() { regOBA("STOCK_RECORD_RECEIVE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StockRecordReceiveId_Desc() { regOBD("STOCK_RECORD_RECEIVE_ID"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _stockDate;
    public ConditionValue xdfgetStockDate()
    { if (_stockDate == null) { _stockDate = nCV(); }
      return _stockDate; }
    protected ConditionValue xgetCValueStockDate() { return xdfgetStockDate(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StockDate_Asc() { regOBA("STOCK_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StockDate_Desc() { regOBD("STOCK_DATE"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _companyCd;
    public ConditionValue xdfgetCompanyCd()
    { if (_companyCd == null) { _companyCd = nCV(); }
      return _companyCd; }
    protected ConditionValue xgetCValueCompanyCd() { return xdfgetCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_CompanyCd_Asc() { regOBA("COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_CompanyCd_Desc() { regOBD("COMPANY_CD"); return this; }

    protected ConditionValue _stockQtySign;
    public ConditionValue xdfgetStockQtySign()
    { if (_stockQtySign == null) { _stockQtySign = nCV(); }
      return _stockQtySign; }
    protected ConditionValue xgetCValueStockQtySign() { return xdfgetStockQtySign(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StockQtySign_Asc() { regOBA("STOCK_QTY_SIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StockQtySign_Desc() { regOBD("STOCK_QTY_SIGN"); return this; }

    protected ConditionValue _stockQty;
    public ConditionValue xdfgetStockQty()
    { if (_stockQty == null) { _stockQty = nCV(); }
      return _stockQty; }
    protected ConditionValue xgetCValueStockQty() { return xdfgetStockQty(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StockQty_Asc() { regOBA("STOCK_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StockQty_Desc() { regOBD("STOCK_QTY"); return this; }

    protected ConditionValue _damageItemQtySign;
    public ConditionValue xdfgetDamageItemQtySign()
    { if (_damageItemQtySign == null) { _damageItemQtySign = nCV(); }
      return _damageItemQtySign; }
    protected ConditionValue xgetCValueDamageItemQtySign() { return xdfgetDamageItemQtySign(); }

    /**
     * Add order-by as ascend. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_DamageItemQtySign_Asc() { regOBA("DAMAGE_ITEM_QTY_SIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_DamageItemQtySign_Desc() { regOBD("DAMAGE_ITEM_QTY_SIGN"); return this; }

    protected ConditionValue _damageItemQty;
    public ConditionValue xdfgetDamageItemQty()
    { if (_damageItemQty == null) { _damageItemQty = nCV(); }
      return _damageItemQty; }
    protected ConditionValue xgetCValueDamageItemQty() { return xdfgetDamageItemQty(); }

    /**
     * Add order-by as ascend. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_DamageItemQty_Asc() { regOBA("DAMAGE_ITEM_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_DamageItemQty_Desc() { regOBD("DAMAGE_ITEM_QTY"); return this; }

    protected ConditionValue _refundItemQtySign;
    public ConditionValue xdfgetRefundItemQtySign()
    { if (_refundItemQtySign == null) { _refundItemQtySign = nCV(); }
      return _refundItemQtySign; }
    protected ConditionValue xgetCValueRefundItemQtySign() { return xdfgetRefundItemQtySign(); }

    /**
     * Add order-by as ascend. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_RefundItemQtySign_Asc() { regOBA("REFUND_ITEM_QTY_SIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_RefundItemQtySign_Desc() { regOBD("REFUND_ITEM_QTY_SIGN"); return this; }

    protected ConditionValue _refundItemQty;
    public ConditionValue xdfgetRefundItemQty()
    { if (_refundItemQty == null) { _refundItemQty = nCV(); }
      return _refundItemQty; }
    protected ConditionValue xgetCValueRefundItemQty() { return xdfgetRefundItemQty(); }

    /**
     * Add order-by as ascend. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_RefundItemQty_Asc() { regOBA("REFUND_ITEM_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFUND_ITEM_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_RefundItemQty_Desc() { regOBD("REFUND_ITEM_QTY"); return this; }

    protected ConditionValue _storageLocation;
    public ConditionValue xdfgetStorageLocation()
    { if (_storageLocation == null) { _storageLocation = nCV(); }
      return _storageLocation; }
    protected ConditionValue xgetCValueStorageLocation() { return xdfgetStorageLocation(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StorageLocation_Asc() { regOBA("STORAGE_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_LOCATION: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_StorageLocation_Desc() { regOBD("STORAGE_LOCATION"); return this; }

    protected ConditionValue _skuCd;
    public ConditionValue xdfgetSkuCd()
    { if (_skuCd == null) { _skuCd = nCV(); }
      return _skuCd; }
    protected ConditionValue xgetCValueSkuCd() { return xdfgetSkuCd(); }

    /**
     * Add order-by as ascend. <br>
     * SKU_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_SkuCd_Asc() { regOBA("SKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKU_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_SkuCd_Desc() { regOBD("SKU_CD"); return this; }

    protected ConditionValue _quantityUnit;
    public ConditionValue xdfgetQuantityUnit()
    { if (_quantityUnit == null) { _quantityUnit = nCV(); }
      return _quantityUnit; }
    protected ConditionValue xgetCValueQuantityUnit() { return xdfgetQuantityUnit(); }

    /**
     * Add order-by as ascend. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_QuantityUnit_Asc() { regOBA("QUANTITY_UNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUANTITY_UNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_QuantityUnit_Desc() { regOBD("QUANTITY_UNIT"); return this; }

    protected ConditionValue _batNo;
    public ConditionValue xdfgetBatNo()
    { if (_batNo == null) { _batNo = nCV(); }
      return _batNo; }
    protected ConditionValue xgetCValueBatNo() { return xdfgetBatNo(); }

    /**
     * Add order-by as ascend. <br>
     * BAT_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_BatNo_Asc() { regOBA("BAT_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BAT_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_BatNo_Desc() { regOBD("BAT_NO"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEStockRecordReceiveCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEStockRecordReceiveCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEStockRecordReceiveCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEStockRecordReceiveCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EStockRecordReceiveCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EStockRecordReceiveCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EStockRecordReceiveCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EStockRecordReceiveCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EStockRecordReceiveCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EStockRecordReceiveCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EStockRecordReceiveCQ> _myselfExistsMap;
    public Map<String, EStockRecordReceiveCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EStockRecordReceiveCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EStockRecordReceiveCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EStockRecordReceiveCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EStockRecordReceiveCB.class.getName(); }
    protected String xCQ() { return EStockRecordReceiveCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
