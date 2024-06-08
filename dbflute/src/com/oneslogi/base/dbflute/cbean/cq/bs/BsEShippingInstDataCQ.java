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
 * The base condition-query of E_SHIPPING_INST_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsEShippingInstDataCQ extends AbstractBsEShippingInstDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EShippingInstDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShippingInstDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_SHIPPING_INST_DATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EShippingInstDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EShippingInstDataCIQ xcreateCIQ() {
        EShippingInstDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EShippingInstDataCIQ xnewCIQ() {
        return new EShippingInstDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_SHIPPING_INST_DATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EShippingInstDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EShippingInstDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstDataId;
    public ConditionValue xdfgetShippingInstDataId()
    { if (_shippingInstDataId == null) { _shippingInstDataId = nCV(); }
      return _shippingInstDataId; }
    protected ConditionValue xgetCValueShippingInstDataId() { return xdfgetShippingInstDataId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ShippingInstDataId_Asc() { regOBA("SHIPPING_INST_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ShippingInstDataId_Desc() { regOBD("SHIPPING_INST_DATA_ID"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _instructionsDate;
    public ConditionValue xdfgetInstructionsDate()
    { if (_instructionsDate == null) { _instructionsDate = nCV(); }
      return _instructionsDate; }
    protected ConditionValue xgetCValueInstructionsDate() { return xdfgetInstructionsDate(); }

    /**
     * Add order-by as ascend. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_InstructionsDate_Asc() { regOBA("INSTRUCTIONS_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_InstructionsDate_Desc() { regOBD("INSTRUCTIONS_DATE"); return this; }

    protected ConditionValue _ownerDirectNo;
    public ConditionValue xdfgetOwnerDirectNo()
    { if (_ownerDirectNo == null) { _ownerDirectNo = nCV(); }
      return _ownerDirectNo; }
    protected ConditionValue xgetCValueOwnerDirectNo() { return xdfgetOwnerDirectNo(); }

    /**
     * Add order-by as ascend. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_OwnerDirectNo_Asc() { regOBA("OWNER_DIRECT_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNER_DIRECT_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_OwnerDirectNo_Desc() { regOBD("OWNER_DIRECT_NO"); return this; }

    protected ConditionValue _salesType;
    public ConditionValue xdfgetSalesType()
    { if (_salesType == null) { _salesType = nCV(); }
      return _salesType; }
    protected ConditionValue xgetCValueSalesType() { return xdfgetSalesType(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_SalesType_Asc() { regOBA("SALES_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_SalesType_Desc() { regOBD("SALES_TYPE"); return this; }

    protected ConditionValue _shiptoCode;
    public ConditionValue xdfgetShiptoCode()
    { if (_shiptoCode == null) { _shiptoCode = nCV(); }
      return _shiptoCode; }
    protected ConditionValue xgetCValueShiptoCode() { return xdfgetShiptoCode(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ShiptoCode_Asc() { regOBA("SHIPTO_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTO_CODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ShiptoCode_Desc() { regOBD("SHIPTO_CODE"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _expectQty;
    public ConditionValue xdfgetExpectQty()
    { if (_expectQty == null) { _expectQty = nCV(); }
      return _expectQty; }
    protected ConditionValue xgetCValueExpectQty() { return xdfgetExpectQty(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECT_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ExpectQty_Asc() { regOBA("EXPECT_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECT_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ExpectQty_Desc() { regOBD("EXPECT_QTY"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_PRICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

    protected ConditionValue _planPriceTotal;
    public ConditionValue xdfgetPlanPriceTotal()
    { if (_planPriceTotal == null) { _planPriceTotal = nCV(); }
      return _planPriceTotal; }
    protected ConditionValue xgetCValuePlanPriceTotal() { return xdfgetPlanPriceTotal(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanPriceTotal_Asc() { regOBA("PLAN_PRICE_TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanPriceTotal_Desc() { regOBD("PLAN_PRICE_TOTAL"); return this; }

    protected ConditionValue _planName;
    public ConditionValue xdfgetPlanName()
    { if (_planName == null) { _planName = nCV(); }
      return _planName; }
    protected ConditionValue xgetCValuePlanName() { return xdfgetPlanName(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanName_Asc() { regOBA("PLAN_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanName_Desc() { regOBD("PLAN_NAME"); return this; }

    protected ConditionValue _planpost;
    public ConditionValue xdfgetPlanpost()
    { if (_planpost == null) { _planpost = nCV(); }
      return _planpost; }
    protected ConditionValue xgetCValuePlanpost() { return xdfgetPlanpost(); }

    /**
     * Add order-by as ascend. <br>
     * PLANPOST: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Planpost_Asc() { regOBA("PLANPOST"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANPOST: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Planpost_Desc() { regOBD("PLANPOST"); return this; }

    protected ConditionValue _planAdress1;
    public ConditionValue xdfgetPlanAdress1()
    { if (_planAdress1 == null) { _planAdress1 = nCV(); }
      return _planAdress1; }
    protected ConditionValue xgetCValuePlanAdress1() { return xdfgetPlanAdress1(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanAdress1_Asc() { regOBA("PLAN_ADRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_ADRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanAdress1_Desc() { regOBD("PLAN_ADRESS1"); return this; }

    protected ConditionValue _planAdress2;
    public ConditionValue xdfgetPlanAdress2()
    { if (_planAdress2 == null) { _planAdress2 = nCV(); }
      return _planAdress2; }
    protected ConditionValue xgetCValuePlanAdress2() { return xdfgetPlanAdress2(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanAdress2_Asc() { regOBA("PLAN_ADRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_ADRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanAdress2_Desc() { regOBD("PLAN_ADRESS2"); return this; }

    protected ConditionValue _planProductName;
    public ConditionValue xdfgetPlanProductName()
    { if (_planProductName == null) { _planProductName = nCV(); }
      return _planProductName; }
    protected ConditionValue xgetCValuePlanProductName() { return xdfgetPlanProductName(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanProductName_Asc() { regOBA("PLAN_PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PlanProductName_Desc() { regOBD("PLAN_PRODUCT_NAME"); return this; }

    protected ConditionValue _warehousePlant;
    public ConditionValue xdfgetWarehousePlant()
    { if (_warehousePlant == null) { _warehousePlant = nCV(); }
      return _warehousePlant; }
    protected ConditionValue xgetCValueWarehousePlant() { return xdfgetWarehousePlant(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_WarehousePlant_Asc() { regOBA("WAREHOUSE_PLANT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_PLANT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_WarehousePlant_Desc() { regOBD("WAREHOUSE_PLANT"); return this; }

    protected ConditionValue _warehousePlantName;
    public ConditionValue xdfgetWarehousePlantName()
    { if (_warehousePlantName == null) { _warehousePlantName = nCV(); }
      return _warehousePlantName; }
    protected ConditionValue xgetCValueWarehousePlantName() { return xdfgetWarehousePlantName(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_WarehousePlantName_Asc() { regOBA("WAREHOUSE_PLANT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_WarehousePlantName_Desc() { regOBD("WAREHOUSE_PLANT_NAME"); return this; }

    protected ConditionValue _orderDate;
    public ConditionValue xdfgetOrderDate()
    { if (_orderDate == null) { _orderDate = nCV(); }
      return _orderDate; }
    protected ConditionValue xgetCValueOrderDate() { return xdfgetOrderDate(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_OrderDate_Asc() { regOBA("ORDER_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_OrderDate_Desc() { regOBD("ORDER_DATE"); return this; }

    protected ConditionValue _deliveryDate;
    public ConditionValue xdfgetDeliveryDate()
    { if (_deliveryDate == null) { _deliveryDate = nCV(); }
      return _deliveryDate; }
    protected ConditionValue xgetCValueDeliveryDate() { return xdfgetDeliveryDate(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_DeliveryDate_Asc() { regOBA("DELIVERY_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_DeliveryDate_Desc() { regOBD("DELIVERY_DATE"); return this; }

    protected ConditionValue _purchaseNo;
    public ConditionValue xdfgetPurchaseNo()
    { if (_purchaseNo == null) { _purchaseNo = nCV(); }
      return _purchaseNo; }
    protected ConditionValue xgetCValuePurchaseNo() { return xdfgetPurchaseNo(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PurchaseNo_Asc() { regOBA("PURCHASE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_PurchaseNo_Desc() { regOBD("PURCHASE_NO"); return this; }

    protected ConditionValue _orderNumber;
    public ConditionValue xdfgetOrderNumber()
    { if (_orderNumber == null) { _orderNumber = nCV(); }
      return _orderNumber; }
    protected ConditionValue xgetCValueOrderNumber() { return xdfgetOrderNumber(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_OrderNumber_Asc() { regOBA("ORDER_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_OrderNumber_Desc() { regOBD("ORDER_NUMBER"); return this; }

    protected ConditionValue _itemLineNo;
    public ConditionValue xdfgetItemLineNo()
    { if (_itemLineNo == null) { _itemLineNo = nCV(); }
      return _itemLineNo; }
    protected ConditionValue xgetCValueItemLineNo() { return xdfgetItemLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ItemLineNo_Asc() { regOBA("ITEM_LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_LINE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ItemLineNo_Desc() { regOBD("ITEM_LINE_NO"); return this; }

    protected ConditionValue _skuCode;
    public ConditionValue xdfgetSkuCode()
    { if (_skuCode == null) { _skuCode = nCV(); }
      return _skuCode; }
    protected ConditionValue xgetCValueSkuCode() { return xdfgetSkuCode(); }

    /**
     * Add order-by as ascend. <br>
     * SKU_CODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_SkuCode_Asc() { regOBA("SKU_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKU_CODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_SkuCode_Desc() { regOBD("SKU_CODE"); return this; }

    protected ConditionValue _cardboard;
    public ConditionValue xdfgetCardboard()
    { if (_cardboard == null) { _cardboard = nCV(); }
      return _cardboard; }
    protected ConditionValue xgetCValueCardboard() { return xdfgetCardboard(); }

    /**
     * Add order-by as ascend. <br>
     * CARDBOARD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Cardboard_Asc() { regOBA("CARDBOARD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARDBOARD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Cardboard_Desc() { regOBD("CARDBOARD"); return this; }

    protected ConditionValue _carton;
    public ConditionValue xdfgetCarton()
    { if (_carton == null) { _carton = nCV(); }
      return _carton; }
    protected ConditionValue xgetCValueCarton() { return xdfgetCarton(); }

    /**
     * Add order-by as ascend. <br>
     * CARTON: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Carton_Asc() { regOBA("CARTON"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARTON: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Carton_Desc() { regOBD("CARTON"); return this; }

    protected ConditionValue _totalQty;
    public ConditionValue xdfgetTotalQty()
    { if (_totalQty == null) { _totalQty = nCV(); }
      return _totalQty; }
    protected ConditionValue xgetCValueTotalQty() { return xdfgetTotalQty(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_TotalQty_Asc() { regOBA("TOTAL_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_TotalQty_Desc() { regOBD("TOTAL_QTY"); return this; }

    protected ConditionValue _note;
    public ConditionValue xdfgetNote()
    { if (_note == null) { _note = nCV(); }
      return _note; }
    protected ConditionValue xgetCValueNote() { return xdfgetNote(); }

    /**
     * Add order-by as ascend. <br>
     * NOTE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Note_Asc() { regOBA("NOTE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Note_Desc() { regOBD("NOTE"); return this; }

    protected ConditionValue _reserve2;
    public ConditionValue xdfgetReserve2()
    { if (_reserve2 == null) { _reserve2 = nCV(); }
      return _reserve2; }
    protected ConditionValue xgetCValueReserve2() { return xdfgetReserve2(); }

    /**
     * Add order-by as ascend. <br>
     * RESERVE2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Reserve2_Asc() { regOBA("RESERVE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESERVE2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Reserve2_Desc() { regOBD("RESERVE2"); return this; }

    protected ConditionValue _reserve3;
    public ConditionValue xdfgetReserve3()
    { if (_reserve3 == null) { _reserve3 = nCV(); }
      return _reserve3; }
    protected ConditionValue xgetCValueReserve3() { return xdfgetReserve3(); }

    /**
     * Add order-by as ascend. <br>
     * RESERVE3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Reserve3_Asc() { regOBA("RESERVE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESERVE3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Reserve3_Desc() { regOBD("RESERVE3"); return this; }

    protected ConditionValue _reserve;
    public ConditionValue xdfgetReserve()
    { if (_reserve == null) { _reserve = nCV(); }
      return _reserve; }
    protected ConditionValue xgetCValueReserve() { return xdfgetReserve(); }

    /**
     * Add order-by as ascend. <br>
     * RESERVE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Reserve_Asc() { regOBA("RESERVE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESERVE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_Reserve_Desc() { regOBD("RESERVE"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEShippingInstDataCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingInstDataCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEShippingInstDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEShippingInstDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EShippingInstDataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EShippingInstDataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EShippingInstDataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EShippingInstDataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EShippingInstDataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EShippingInstDataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EShippingInstDataCQ> _myselfExistsMap;
    public Map<String, EShippingInstDataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EShippingInstDataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EShippingInstDataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EShippingInstDataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EShippingInstDataCB.class.getName(); }
    protected String xCQ() { return EShippingInstDataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
