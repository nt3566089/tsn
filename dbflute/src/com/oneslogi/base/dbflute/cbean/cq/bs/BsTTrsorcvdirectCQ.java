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
 * The base condition-query of T_TRSORCVDIRECT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsorcvdirectCQ extends AbstractBsTTrsorcvdirectCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsorcvdirectCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsorcvdirectCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSORCVDIRECT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrsorcvdirectCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrsorcvdirectCIQ xcreateCIQ() {
        TTrsorcvdirectCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrsorcvdirectCIQ xnewCIQ() {
        return new TTrsorcvdirectCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSORCVDIRECT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrsorcvdirectCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrsorcvdirectCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sojtlineid;
    public ConditionValue xdfgetSojtlineid()
    { if (_sojtlineid == null) { _sojtlineid = nCV(); }
      return _sojtlineid; }
    protected ConditionValue xgetCValueSojtlineid() { return xdfgetSojtlineid(); }

    /**
     * Add order-by as ascend. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Sojtlineid_Asc() { regOBA("SOJTLINEID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Sojtlineid_Desc() { regOBD("SOJTLINEID"); return this; }

    protected ConditionValue _sorcvdirectkey;
    public ConditionValue xdfgetSorcvdirectkey()
    { if (_sorcvdirectkey == null) { _sorcvdirectkey = nCV(); }
      return _sorcvdirectkey; }
    protected ConditionValue xgetCValueSorcvdirectkey() { return xdfgetSorcvdirectkey(); }

    /**
     * Add order-by as ascend. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Sorcvdirectkey_Asc() { regOBA("SoRcvDirectKey"); return this; }

    /**
     * Add order-by as descend. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Sorcvdirectkey_Desc() { regOBD("SoRcvDirectKey"); return this; }

    protected ConditionValue _instructionsdate;
    public ConditionValue xdfgetInstructionsdate()
    { if (_instructionsdate == null) { _instructionsdate = nCV(); }
      return _instructionsdate; }
    protected ConditionValue xgetCValueInstructionsdate() { return xdfgetInstructionsdate(); }

    /**
     * Add order-by as ascend. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Instructionsdate_Asc() { regOBA("InstructionsDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Instructionsdate_Desc() { regOBD("InstructionsDate"); return this; }

    protected ConditionValue _ownerdirectno;
    public ConditionValue xdfgetOwnerdirectno()
    { if (_ownerdirectno == null) { _ownerdirectno = nCV(); }
      return _ownerdirectno; }
    protected ConditionValue xgetCValueOwnerdirectno() { return xdfgetOwnerdirectno(); }

    /**
     * Add order-by as ascend. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Ownerdirectno_Asc() { regOBA("OwnerDirectNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Ownerdirectno_Desc() { regOBD("OwnerDirectNo"); return this; }

    protected ConditionValue _salestype;
    public ConditionValue xdfgetSalestype()
    { if (_salestype == null) { _salestype = nCV(); }
      return _salestype; }
    protected ConditionValue xgetCValueSalestype() { return xdfgetSalestype(); }

    /**
     * Add order-by as ascend. <br>
     * SalesType: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Salestype_Asc() { regOBA("SalesType"); return this; }

    /**
     * Add order-by as descend. <br>
     * SalesType: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Salestype_Desc() { regOBD("SalesType"); return this; }

    protected ConditionValue _salestypecd;
    public ConditionValue xdfgetSalestypecd()
    { if (_salestypecd == null) { _salestypecd = nCV(); }
      return _salestypecd; }
    protected ConditionValue xgetCValueSalestypecd() { return xdfgetSalestypecd(); }

    /**
     * Add order-by as ascend. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Salestypecd_Asc() { regOBA("SalesTypeCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Salestypecd_Desc() { regOBD("SalesTypeCd"); return this; }

    protected ConditionValue _shiptocode;
    public ConditionValue xdfgetShiptocode()
    { if (_shiptocode == null) { _shiptocode = nCV(); }
      return _shiptocode; }
    protected ConditionValue xgetCValueShiptocode() { return xdfgetShiptocode(); }

    /**
     * Add order-by as ascend. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Shiptocode_Asc() { regOBA("ShipToCode"); return this; }

    /**
     * Add order-by as descend. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Shiptocode_Desc() { regOBD("ShipToCode"); return this; }

    protected ConditionValue _originalpono;
    public ConditionValue xdfgetOriginalpono()
    { if (_originalpono == null) { _originalpono = nCV(); }
      return _originalpono; }
    protected ConditionValue xgetCValueOriginalpono() { return xdfgetOriginalpono(); }

    /**
     * Add order-by as ascend. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Originalpono_Asc() { regOBA("OriginalPONo"); return this; }

    /**
     * Add order-by as descend. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Originalpono_Desc() { regOBD("OriginalPONo"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _expectqty;
    public ConditionValue xdfgetExpectqty()
    { if (_expectqty == null) { _expectqty = nCV(); }
      return _expectqty; }
    protected ConditionValue xgetCValueExpectqty() { return xdfgetExpectqty(); }

    /**
     * Add order-by as ascend. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Expectqty_Asc() { regOBA("ExpectQty"); return this; }

    /**
     * Add order-by as descend. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Expectqty_Desc() { regOBD("ExpectQty"); return this; }

    protected ConditionValue _planprice;
    public ConditionValue xdfgetPlanprice()
    { if (_planprice == null) { _planprice = nCV(); }
      return _planprice; }
    protected ConditionValue xgetCValuePlanprice() { return xdfgetPlanprice(); }

    /**
     * Add order-by as ascend. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planprice_Asc() { regOBA("PlanPrice"); return this; }

    /**
     * Add order-by as descend. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planprice_Desc() { regOBD("PlanPrice"); return this; }

    protected ConditionValue _planpricetotal;
    public ConditionValue xdfgetPlanpricetotal()
    { if (_planpricetotal == null) { _planpricetotal = nCV(); }
      return _planpricetotal; }
    protected ConditionValue xgetCValuePlanpricetotal() { return xdfgetPlanpricetotal(); }

    /**
     * Add order-by as ascend. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planpricetotal_Asc() { regOBA("PlanPriceTotal"); return this; }

    /**
     * Add order-by as descend. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planpricetotal_Desc() { regOBD("PlanPriceTotal"); return this; }

    protected ConditionValue _planname;
    public ConditionValue xdfgetPlanname()
    { if (_planname == null) { _planname = nCV(); }
      return _planname; }
    protected ConditionValue xgetCValuePlanname() { return xdfgetPlanname(); }

    /**
     * Add order-by as ascend. <br>
     * PlanName: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planname_Asc() { regOBA("PlanName"); return this; }

    /**
     * Add order-by as descend. <br>
     * PlanName: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planname_Desc() { regOBD("PlanName"); return this; }

    protected ConditionValue _planpost;
    public ConditionValue xdfgetPlanpost()
    { if (_planpost == null) { _planpost = nCV(); }
      return _planpost; }
    protected ConditionValue xgetCValuePlanpost() { return xdfgetPlanpost(); }

    /**
     * Add order-by as ascend. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planpost_Asc() { regOBA("PlanPost"); return this; }

    /**
     * Add order-by as descend. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planpost_Desc() { regOBD("PlanPost"); return this; }

    protected ConditionValue _planaddress1;
    public ConditionValue xdfgetPlanaddress1()
    { if (_planaddress1 == null) { _planaddress1 = nCV(); }
      return _planaddress1; }
    protected ConditionValue xgetCValuePlanaddress1() { return xdfgetPlanaddress1(); }

    /**
     * Add order-by as ascend. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planaddress1_Asc() { regOBA("PlanAddress1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planaddress1_Desc() { regOBD("PlanAddress1"); return this; }

    protected ConditionValue _planaddress2;
    public ConditionValue xdfgetPlanaddress2()
    { if (_planaddress2 == null) { _planaddress2 = nCV(); }
      return _planaddress2; }
    protected ConditionValue xgetCValuePlanaddress2() { return xdfgetPlanaddress2(); }

    /**
     * Add order-by as ascend. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planaddress2_Asc() { regOBA("PlanAddress2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planaddress2_Desc() { regOBD("PlanAddress2"); return this; }

    protected ConditionValue _planitemname;
    public ConditionValue xdfgetPlanitemname()
    { if (_planitemname == null) { _planitemname = nCV(); }
      return _planitemname; }
    protected ConditionValue xgetCValuePlanitemname() { return xdfgetPlanitemname(); }

    /**
     * Add order-by as ascend. <br>
     * PlanItemName: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planitemname_Asc() { regOBA("PlanItemName"); return this; }

    /**
     * Add order-by as descend. <br>
     * PlanItemName: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Planitemname_Desc() { regOBD("PlanItemName"); return this; }

    protected ConditionValue _warehouseplant;
    public ConditionValue xdfgetWarehouseplant()
    { if (_warehouseplant == null) { _warehouseplant = nCV(); }
      return _warehouseplant; }
    protected ConditionValue xgetCValueWarehouseplant() { return xdfgetWarehouseplant(); }

    /**
     * Add order-by as ascend. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Warehouseplant_Asc() { regOBA("WareHousePlant"); return this; }

    /**
     * Add order-by as descend. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Warehouseplant_Desc() { regOBD("WareHousePlant"); return this; }

    protected ConditionValue _warehouseplantname;
    public ConditionValue xdfgetWarehouseplantname()
    { if (_warehouseplantname == null) { _warehouseplantname = nCV(); }
      return _warehouseplantname; }
    protected ConditionValue xgetCValueWarehouseplantname() { return xdfgetWarehouseplantname(); }

    /**
     * Add order-by as ascend. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Warehouseplantname_Asc() { regOBA("WareHousePlantName"); return this; }

    /**
     * Add order-by as descend. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Warehouseplantname_Desc() { regOBD("WareHousePlantName"); return this; }

    protected ConditionValue _warehousename;
    public ConditionValue xdfgetWarehousename()
    { if (_warehousename == null) { _warehousename = nCV(); }
      return _warehousename; }
    protected ConditionValue xgetCValueWarehousename() { return xdfgetWarehousename(); }

    /**
     * Add order-by as ascend. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Warehousename_Asc() { regOBA("WareHouseName"); return this; }

    /**
     * Add order-by as descend. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Warehousename_Desc() { regOBD("WareHouseName"); return this; }

    protected ConditionValue _orderdate;
    public ConditionValue xdfgetOrderdate()
    { if (_orderdate == null) { _orderdate = nCV(); }
      return _orderdate; }
    protected ConditionValue xgetCValueOrderdate() { return xdfgetOrderdate(); }

    /**
     * Add order-by as ascend. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Orderdate_Asc() { regOBA("OrderDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Orderdate_Desc() { regOBD("OrderDate"); return this; }

    protected ConditionValue _deliverydate;
    public ConditionValue xdfgetDeliverydate()
    { if (_deliverydate == null) { _deliverydate = nCV(); }
      return _deliverydate; }
    protected ConditionValue xgetCValueDeliverydate() { return xdfgetDeliverydate(); }

    /**
     * Add order-by as ascend. <br>
     * DeliveryDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Deliverydate_Asc() { regOBA("DeliveryDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * DeliveryDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Deliverydate_Desc() { regOBD("DeliveryDate"); return this; }

    protected ConditionValue _purchasenumber;
    public ConditionValue xdfgetPurchasenumber()
    { if (_purchasenumber == null) { _purchasenumber = nCV(); }
      return _purchasenumber; }
    protected ConditionValue xgetCValuePurchasenumber() { return xdfgetPurchasenumber(); }

    /**
     * Add order-by as ascend. <br>
     * PurchaseNumber: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Purchasenumber_Asc() { regOBA("PurchaseNumber"); return this; }

    /**
     * Add order-by as descend. <br>
     * PurchaseNumber: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Purchasenumber_Desc() { regOBD("PurchaseNumber"); return this; }

    protected ConditionValue _ordernumber;
    public ConditionValue xdfgetOrdernumber()
    { if (_ordernumber == null) { _ordernumber = nCV(); }
      return _ordernumber; }
    protected ConditionValue xgetCValueOrdernumber() { return xdfgetOrdernumber(); }

    /**
     * Add order-by as ascend. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Ordernumber_Asc() { regOBA("OrderNumber"); return this; }

    /**
     * Add order-by as descend. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Ordernumber_Desc() { regOBD("OrderNumber"); return this; }

    protected ConditionValue _itemlineno;
    public ConditionValue xdfgetItemlineno()
    { if (_itemlineno == null) { _itemlineno = nCV(); }
      return _itemlineno; }
    protected ConditionValue xgetCValueItemlineno() { return xdfgetItemlineno(); }

    /**
     * Add order-by as ascend. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Itemlineno_Asc() { regOBA("ItemLineNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Itemlineno_Desc() { regOBD("ItemLineNo"); return this; }

    protected ConditionValue _skucode;
    public ConditionValue xdfgetSkucode()
    { if (_skucode == null) { _skucode = nCV(); }
      return _skucode; }
    protected ConditionValue xgetCValueSkucode() { return xdfgetSkucode(); }

    /**
     * Add order-by as ascend. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Skucode_Asc() { regOBA("SkuCode"); return this; }

    /**
     * Add order-by as descend. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Skucode_Desc() { regOBD("SkuCode"); return this; }

    protected ConditionValue _cardboard;
    public ConditionValue xdfgetCardboard()
    { if (_cardboard == null) { _cardboard = nCV(); }
      return _cardboard; }
    protected ConditionValue xgetCValueCardboard() { return xdfgetCardboard(); }

    /**
     * Add order-by as ascend. <br>
     * CardBoard: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Cardboard_Asc() { regOBA("CardBoard"); return this; }

    /**
     * Add order-by as descend. <br>
     * CardBoard: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Cardboard_Desc() { regOBD("CardBoard"); return this; }

    protected ConditionValue _carton;
    public ConditionValue xdfgetCarton()
    { if (_carton == null) { _carton = nCV(); }
      return _carton; }
    protected ConditionValue xgetCValueCarton() { return xdfgetCarton(); }

    /**
     * Add order-by as ascend. <br>
     * CarTon: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Carton_Asc() { regOBA("CarTon"); return this; }

    /**
     * Add order-by as descend. <br>
     * CarTon: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Carton_Desc() { regOBD("CarTon"); return this; }

    protected ConditionValue _totalexpectqty;
    public ConditionValue xdfgetTotalexpectqty()
    { if (_totalexpectqty == null) { _totalexpectqty = nCV(); }
      return _totalexpectqty; }
    protected ConditionValue xgetCValueTotalexpectqty() { return xdfgetTotalexpectqty(); }

    /**
     * Add order-by as ascend. <br>
     * TotalExpectQty: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Totalexpectqty_Asc() { regOBA("TotalExpectQty"); return this; }

    /**
     * Add order-by as descend. <br>
     * TotalExpectQty: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Totalexpectqty_Desc() { regOBD("TotalExpectQty"); return this; }

    protected ConditionValue _totalcardboardqty;
    public ConditionValue xdfgetTotalcardboardqty()
    { if (_totalcardboardqty == null) { _totalcardboardqty = nCV(); }
      return _totalcardboardqty; }
    protected ConditionValue xgetCValueTotalcardboardqty() { return xdfgetTotalcardboardqty(); }

    /**
     * Add order-by as ascend. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Totalcardboardqty_Asc() { regOBA("TotalCardBoardQty"); return this; }

    /**
     * Add order-by as descend. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Totalcardboardqty_Desc() { regOBD("TotalCardBoardQty"); return this; }

    protected ConditionValue _totalcartonqty;
    public ConditionValue xdfgetTotalcartonqty()
    { if (_totalcartonqty == null) { _totalcartonqty = nCV(); }
      return _totalcartonqty; }
    protected ConditionValue xgetCValueTotalcartonqty() { return xdfgetTotalcartonqty(); }

    /**
     * Add order-by as ascend. <br>
     * TotalCarTonQty: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Totalcartonqty_Asc() { regOBA("TotalCarTonQty"); return this; }

    /**
     * Add order-by as descend. <br>
     * TotalCarTonQty: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Totalcartonqty_Desc() { regOBD("TotalCarTonQty"); return this; }

    protected ConditionValue _note;
    public ConditionValue xdfgetNote()
    { if (_note == null) { _note = nCV(); }
      return _note; }
    protected ConditionValue xgetCValueNote() { return xdfgetNote(); }

    /**
     * Add order-by as ascend. <br>
     * Note: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Note_Asc() { regOBA("Note"); return this; }

    /**
     * Add order-by as descend. <br>
     * Note: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Note_Desc() { regOBD("Note"); return this; }

    protected ConditionValue _reserve2;
    public ConditionValue xdfgetReserve2()
    { if (_reserve2 == null) { _reserve2 = nCV(); }
      return _reserve2; }
    protected ConditionValue xgetCValueReserve2() { return xdfgetReserve2(); }

    /**
     * Add order-by as ascend. <br>
     * Reserve2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Reserve2_Asc() { regOBA("Reserve2"); return this; }

    /**
     * Add order-by as descend. <br>
     * Reserve2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Reserve2_Desc() { regOBD("Reserve2"); return this; }

    protected ConditionValue _reserve3;
    public ConditionValue xdfgetReserve3()
    { if (_reserve3 == null) { _reserve3 = nCV(); }
      return _reserve3; }
    protected ConditionValue xgetCValueReserve3() { return xdfgetReserve3(); }

    /**
     * Add order-by as ascend. <br>
     * Reserve3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Reserve3_Asc() { regOBA("Reserve3"); return this; }

    /**
     * Add order-by as descend. <br>
     * Reserve3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Reserve3_Desc() { regOBD("Reserve3"); return this; }

    protected ConditionValue _reserve;
    public ConditionValue xdfgetReserve()
    { if (_reserve == null) { _reserve = nCV(); }
      return _reserve; }
    protected ConditionValue xgetCValueReserve() { return xdfgetReserve(); }

    /**
     * Add order-by as ascend. <br>
     * Reserve: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Reserve_Asc() { regOBA("Reserve"); return this; }

    /**
     * Add order-by as descend. <br>
     * Reserve: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Reserve_Desc() { regOBD("Reserve"); return this; }

    protected ConditionValue _centerid;
    public ConditionValue xdfgetCenterid()
    { if (_centerid == null) { _centerid = nCV(); }
      return _centerid; }
    protected ConditionValue xgetCValueCenterid() { return xdfgetCenterid(); }

    /**
     * Add order-by as ascend. <br>
     * CenterId: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Centerid_Asc() { regOBA("CenterId"); return this; }

    /**
     * Add order-by as descend. <br>
     * CenterId: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Centerid_Desc() { regOBD("CenterId"); return this; }

    protected ConditionValue _clientid;
    public ConditionValue xdfgetClientid()
    { if (_clientid == null) { _clientid = nCV(); }
      return _clientid; }
    protected ConditionValue xgetCValueClientid() { return xdfgetClientid(); }

    /**
     * Add order-by as ascend. <br>
     * ClientId: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Clientid_Asc() { regOBA("ClientId"); return this; }

    /**
     * Add order-by as descend. <br>
     * ClientId: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_Clientid_Desc() { regOBD("ClientId"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrsorcvdirectCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsorcvdirectCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrsorcvdirectCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrsorcvdirectCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrsorcvdirectCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrsorcvdirectCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrsorcvdirectCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrsorcvdirectCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrsorcvdirectCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrsorcvdirectCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrsorcvdirectCQ> _myselfExistsMap;
    public Map<String, TTrsorcvdirectCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrsorcvdirectCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrsorcvdirectCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrsorcvdirectCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrsorcvdirectCB.class.getName(); }
    protected String xCQ() { return TTrsorcvdirectCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
