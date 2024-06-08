package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of T_AMAZON_ORDER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TAmazonOrderDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TAmazonOrderDbm _instance = new TAmazonOrderDbm();
    private TAmazonOrderDbm() {}
    public static TAmazonOrderDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getAmazonOrderId(), (et, vl) -> ((TAmazonOrder)et).setAmazonOrderId(ctl(vl)), "amazonOrderId");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getOrderId(), (et, vl) -> ((TAmazonOrder)et).setOrderId((String)vl), "orderId");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getOrderItemId(), (et, vl) -> ((TAmazonOrder)et).setOrderItemId((String)vl), "orderItemId");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getPurchaseDate(), (et, vl) -> ((TAmazonOrder)et).setPurchaseDate((String)vl), "purchaseDate");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getPaymentsDate(), (et, vl) -> ((TAmazonOrder)et).setPaymentsDate((String)vl), "paymentsDate");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getBuyerEmail(), (et, vl) -> ((TAmazonOrder)et).setBuyerEmail((String)vl), "buyerEmail");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getBuyerName(), (et, vl) -> ((TAmazonOrder)et).setBuyerName((String)vl), "buyerName");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getBuyerPhoneNumber(), (et, vl) -> ((TAmazonOrder)et).setBuyerPhoneNumber((String)vl), "buyerPhoneNumber");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getSku(), (et, vl) -> ((TAmazonOrder)et).setSku((String)vl), "sku");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getProductName(), (et, vl) -> ((TAmazonOrder)et).setProductName((String)vl), "productName");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getQuantityPurchased(), (et, vl) -> ((TAmazonOrder)et).setQuantityPurchased(ctl(vl)), "quantityPurchased");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getCurrency(), (et, vl) -> ((TAmazonOrder)et).setCurrency((String)vl), "currency");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getItemPrice(), (et, vl) -> ((TAmazonOrder)et).setItemPrice(ctl(vl)), "itemPrice");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getItemTax(), (et, vl) -> ((TAmazonOrder)et).setItemTax(ctl(vl)), "itemTax");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShippingPrice(), (et, vl) -> ((TAmazonOrder)et).setShippingPrice(ctl(vl)), "shippingPrice");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShippingTax(), (et, vl) -> ((TAmazonOrder)et).setShippingTax(ctl(vl)), "shippingTax");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getGiftWrapPrice(), (et, vl) -> ((TAmazonOrder)et).setGiftWrapPrice(ctl(vl)), "giftWrapPrice");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getGiftWrapTax(), (et, vl) -> ((TAmazonOrder)et).setGiftWrapTax(ctl(vl)), "giftWrapTax");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipServiceLevel(), (et, vl) -> ((TAmazonOrder)et).setShipServiceLevel((String)vl), "shipServiceLevel");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getRecipientName(), (et, vl) -> ((TAmazonOrder)et).setRecipientName((String)vl), "recipientName");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipAddress1(), (et, vl) -> ((TAmazonOrder)et).setShipAddress1((String)vl), "shipAddress1");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipAddress2(), (et, vl) -> ((TAmazonOrder)et).setShipAddress2((String)vl), "shipAddress2");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipAddress3(), (et, vl) -> ((TAmazonOrder)et).setShipAddress3((String)vl), "shipAddress3");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipCity(), (et, vl) -> ((TAmazonOrder)et).setShipCity((String)vl), "shipCity");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipState(), (et, vl) -> ((TAmazonOrder)et).setShipState((String)vl), "shipState");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipPostalCode(), (et, vl) -> ((TAmazonOrder)et).setShipPostalCode((String)vl), "shipPostalCode");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipCountry(), (et, vl) -> ((TAmazonOrder)et).setShipCountry((String)vl), "shipCountry");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipPhoneNumber(), (et, vl) -> ((TAmazonOrder)et).setShipPhoneNumber((String)vl), "shipPhoneNumber");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getGiftWrapType(), (et, vl) -> ((TAmazonOrder)et).setGiftWrapType((String)vl), "giftWrapType");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getGiftMassageText(), (et, vl) -> ((TAmazonOrder)et).setGiftMassageText((String)vl), "giftMassageText");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getItemPromotionDiscount(), (et, vl) -> ((TAmazonOrder)et).setItemPromotionDiscount(ctl(vl)), "itemPromotionDiscount");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getItemPromotionId(), (et, vl) -> ((TAmazonOrder)et).setItemPromotionId((String)vl), "itemPromotionId");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipPromotionDiscount(), (et, vl) -> ((TAmazonOrder)et).setShipPromotionDiscount(ctl(vl)), "shipPromotionDiscount");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getShipPromotionId(), (et, vl) -> ((TAmazonOrder)et).setShipPromotionId((String)vl), "shipPromotionId");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getDeliveryStartDate(), (et, vl) -> ((TAmazonOrder)et).setDeliveryStartDate((String)vl), "deliveryStartDate");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getDeliveryEndDate(), (et, vl) -> ((TAmazonOrder)et).setDeliveryEndDate((String)vl), "deliveryEndDate");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getDeliveryTimeZone(), (et, vl) -> ((TAmazonOrder)et).setDeliveryTimeZone((String)vl), "deliveryTimeZone");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getDeliveryInstructions(), (et, vl) -> ((TAmazonOrder)et).setDeliveryInstructions((String)vl), "deliveryInstructions");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getPaymentMethod(), (et, vl) -> ((TAmazonOrder)et).setPaymentMethod((String)vl), "paymentMethod");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getCodCollectibleAmount(), (et, vl) -> ((TAmazonOrder)et).setCodCollectibleAmount(ctl(vl)), "codCollectibleAmount");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getAlreadyPaid(), (et, vl) -> ((TAmazonOrder)et).setAlreadyPaid(ctl(vl)), "alreadyPaid");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getPaymentMethodFee(), (et, vl) -> ((TAmazonOrder)et).setPaymentMethodFee(ctl(vl)), "paymentMethodFee");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getScheduledDeliStDate(), (et, vl) -> ((TAmazonOrder)et).setScheduledDeliStDate((String)vl), "scheduledDeliStDate");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getScheduledDeliEdDate(), (et, vl) -> ((TAmazonOrder)et).setScheduledDeliEdDate((String)vl), "scheduledDeliEdDate");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getPackingQty(), (et, vl) -> ((TAmazonOrder)et).setPackingQty(ctl(vl)), "packingQty");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getSlipItemNm1(), (et, vl) -> ((TAmazonOrder)et).setSlipItemNm1((String)vl), "slipItemNm1");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getSlipItemNm2(), (et, vl) -> ((TAmazonOrder)et).setSlipItemNm2((String)vl), "slipItemNm2");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getSlipItemNm3(), (et, vl) -> ((TAmazonOrder)et).setSlipItemNm3((String)vl), "slipItemNm3");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getSlipItemNm4(), (et, vl) -> ((TAmazonOrder)et).setSlipItemNm4((String)vl), "slipItemNm4");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getSlipItemNm5(), (et, vl) -> ((TAmazonOrder)et).setSlipItemNm5((String)vl), "slipItemNm5");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getSlipItemCd1(), (et, vl) -> ((TAmazonOrder)et).setSlipItemCd1((String)vl), "slipItemCd1");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getSlipItemCd2(), (et, vl) -> ((TAmazonOrder)et).setSlipItemCd2((String)vl), "slipItemCd2");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getFreightHandling1(), (et, vl) -> ((TAmazonOrder)et).setFreightHandling1((String)vl), "freightHandling1");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getFreightHandling2(), (et, vl) -> ((TAmazonOrder)et).setFreightHandling2((String)vl), "freightHandling2");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getArticle(), (et, vl) -> ((TAmazonOrder)et).setArticle((String)vl), "article");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getReceiveId(), (et, vl) -> ((TAmazonOrder)et).setReceiveId(ctl(vl)), "receiveId");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getRowNo(), (et, vl) -> ((TAmazonOrder)et).setRowNo(ctl(vl)), "rowNo");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getErrorFlg(), (et, vl) -> ((TAmazonOrder)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getImportFlg(), (et, vl) -> ((TAmazonOrder)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getImportTypeId(), (et, vl) -> ((TAmazonOrder)et).setImportTypeId(ctl(vl)), "importTypeId");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getEcOrderBId(), (et, vl) -> ((TAmazonOrder)et).setEcOrderBId(ctl(vl)), "ecOrderBId");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getDelFlg(), (et, vl) -> ((TAmazonOrder)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getVersionNo(), (et, vl) -> ((TAmazonOrder)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getControlNo(), (et, vl) -> ((TAmazonOrder)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getAddDt(), (et, vl) -> ((TAmazonOrder)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getAddUser(), (et, vl) -> ((TAmazonOrder)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getAddProcess(), (et, vl) -> ((TAmazonOrder)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getUpdDt(), (et, vl) -> ((TAmazonOrder)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getUpdUser(), (et, vl) -> ((TAmazonOrder)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TAmazonOrder)et).getUpdProcess(), (et, vl) -> ((TAmazonOrder)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TAmazonOrder)et).getTEcOrderB(), (et, vl) -> ((TAmazonOrder)et).setTEcOrderB((TEcOrderB)vl), "TEcOrderB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_AMAZON_ORDER";
    protected final String _tableDispName = "T_AMAZON_ORDER";
    protected final String _tablePropertyName = "TAmazonOrder";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_AMAZON_ORDER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAmazonOrderId = cci("AMAZON_ORDER_ID", "AMAZON_ORDER_ID", null, null, Long.class, "amazonOrderId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderId = cci("ORDER_ID", "ORDER_ID", null, null, String.class, "orderId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderItemId = cci("ORDER_ITEM_ID", "ORDER_ITEM_ID", null, null, String.class, "orderItemId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseDate = cci("PURCHASE_DATE", "PURCHASE_DATE", null, null, String.class, "purchaseDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentsDate = cci("PAYMENTS_DATE", "PAYMENTS_DATE", null, null, String.class, "paymentsDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBuyerEmail = cci("BUYER_EMAIL", "BUYER_EMAIL", null, null, String.class, "buyerEmail", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBuyerName = cci("BUYER_NAME", "BUYER_NAME", null, null, String.class, "buyerName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBuyerPhoneNumber = cci("BUYER_PHONE_NUMBER", "BUYER_PHONE_NUMBER", null, null, String.class, "buyerPhoneNumber", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSku = cci("SKU", "SKU", null, null, String.class, "sku", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductName = cci("PRODUCT_NAME", "PRODUCT_NAME", null, null, String.class, "productName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuantityPurchased = cci("QUANTITY_PURCHASED", "QUANTITY_PURCHASED", null, null, Long.class, "quantityPurchased", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCurrency = cci("CURRENCY", "CURRENCY", null, null, String.class, "currency", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemPrice = cci("ITEM_PRICE", "ITEM_PRICE", null, null, Long.class, "itemPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemTax = cci("ITEM_TAX", "ITEM_TAX", null, null, Long.class, "itemTax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPrice = cci("SHIPPING_PRICE", "SHIPPING_PRICE", null, null, Long.class, "shippingPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTax = cci("SHIPPING_TAX", "SHIPPING_TAX", null, null, Long.class, "shippingTax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftWrapPrice = cci("GIFT_WRAP_PRICE", "GIFT_WRAP_PRICE", null, null, Long.class, "giftWrapPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftWrapTax = cci("GIFT_WRAP_TAX", "GIFT_WRAP_TAX", null, null, Long.class, "giftWrapTax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipServiceLevel = cci("SHIP_SERVICE_LEVEL", "SHIP_SERVICE_LEVEL", null, null, String.class, "shipServiceLevel", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecipientName = cci("RECIPIENT_NAME", "RECIPIENT_NAME", null, null, String.class, "recipientName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipAddress1 = cci("SHIP_ADDRESS_1", "SHIP_ADDRESS_1", null, null, String.class, "shipAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipAddress2 = cci("SHIP_ADDRESS_2", "SHIP_ADDRESS_2", null, null, String.class, "shipAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipAddress3 = cci("SHIP_ADDRESS_3", "SHIP_ADDRESS_3", null, null, String.class, "shipAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCity = cci("SHIP_CITY", "SHIP_CITY", null, null, String.class, "shipCity", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipState = cci("SHIP_STATE", "SHIP_STATE", null, null, String.class, "shipState", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipPostalCode = cci("SHIP_POSTAL_CODE", "SHIP_POSTAL_CODE", null, null, String.class, "shipPostalCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCountry = cci("SHIP_COUNTRY", "SHIP_COUNTRY", null, null, String.class, "shipCountry", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipPhoneNumber = cci("SHIP_PHONE_NUMBER", "SHIP_PHONE_NUMBER", null, null, String.class, "shipPhoneNumber", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftWrapType = cci("GIFT_WRAP_TYPE", "GIFT_WRAP_TYPE", null, null, String.class, "giftWrapType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftMassageText = cci("GIFT_MASSAGE_TEXT", "GIFT_MASSAGE_TEXT", null, null, String.class, "giftMassageText", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemPromotionDiscount = cci("ITEM_PROMOTION_DISCOUNT", "ITEM_PROMOTION_DISCOUNT", null, null, Long.class, "itemPromotionDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemPromotionId = cci("ITEM_PROMOTION_ID", "ITEM_PROMOTION_ID", null, null, String.class, "itemPromotionId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipPromotionDiscount = cci("SHIP_PROMOTION_DISCOUNT", "SHIP_PROMOTION_DISCOUNT", null, null, Long.class, "shipPromotionDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipPromotionId = cci("SHIP_PROMOTION_ID", "SHIP_PROMOTION_ID", null, null, String.class, "shipPromotionId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryStartDate = cci("DELIVERY_START_DATE", "DELIVERY_START_DATE", null, null, String.class, "deliveryStartDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryEndDate = cci("DELIVERY_END_DATE", "DELIVERY_END_DATE", null, null, String.class, "deliveryEndDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryTimeZone = cci("DELIVERY_TIME_ZONE", "DELIVERY_TIME_ZONE", null, null, String.class, "deliveryTimeZone", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryInstructions = cci("DELIVERY_INSTRUCTIONS", "DELIVERY_INSTRUCTIONS", null, null, String.class, "deliveryInstructions", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentMethod = cci("PAYMENT_METHOD", "PAYMENT_METHOD", null, null, String.class, "paymentMethod", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodCollectibleAmount = cci("COD_COLLECTIBLE_AMOUNT", "COD_COLLECTIBLE_AMOUNT", null, null, Long.class, "codCollectibleAmount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlreadyPaid = cci("ALREADY_PAID", "ALREADY_PAID", null, null, Long.class, "alreadyPaid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentMethodFee = cci("PAYMENT_METHOD_FEE", "PAYMENT_METHOD_FEE", null, null, Long.class, "paymentMethodFee", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScheduledDeliStDate = cci("SCHEDULED_DELI_ST_DATE", "SCHEDULED_DELI_ST_DATE", null, null, String.class, "scheduledDeliStDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScheduledDeliEdDate = cci("SCHEDULED_DELI_ED_DATE", "SCHEDULED_DELI_ED_DATE", null, null, String.class, "scheduledDeliEdDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingQty = cci("PACKING_QTY", "PACKING_QTY", null, null, Long.class, "packingQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm1 = cci("SLIP_ITEM_NM1", "SLIP_ITEM_NM1", null, null, String.class, "slipItemNm1", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm2 = cci("SLIP_ITEM_NM2", "SLIP_ITEM_NM2", null, null, String.class, "slipItemNm2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm3 = cci("SLIP_ITEM_NM3", "SLIP_ITEM_NM3", null, null, String.class, "slipItemNm3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm4 = cci("SLIP_ITEM_NM4", "SLIP_ITEM_NM4", null, null, String.class, "slipItemNm4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm5 = cci("SLIP_ITEM_NM5", "SLIP_ITEM_NM5", null, null, String.class, "slipItemNm5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemCd1 = cci("SLIP_ITEM_CD1", "SLIP_ITEM_CD1", null, null, String.class, "slipItemCd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemCd2 = cci("SLIP_ITEM_CD2", "SLIP_ITEM_CD2", null, null, String.class, "slipItemCd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightHandling1 = cci("FREIGHT_HANDLING1", "FREIGHT_HANDLING1", null, null, String.class, "freightHandling1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightHandling2 = cci("FREIGHT_HANDLING2", "FREIGHT_HANDLING2", null, null, String.class, "freightHandling2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticle = cci("ARTICLE", "ARTICLE", null, null, String.class, "article", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveId = cci("RECEIVE_ID", "RECEIVE_ID", null, null, Long.class, "receiveId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNo = cci("ROW_NO", "ROW_NO", null, null, Long.class, "rowNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportTypeId = cci("IMPORT_TYPE_ID", "IMPORT_TYPE_ID", null, null, Long.class, "importTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcOrderBId = cci("EC_ORDER_B_ID", "EC_ORDER_B_ID", null, null, Long.class, "ecOrderBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TEcOrderB", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmazonOrderId() { return _columnAmazonOrderId; }
    /**
     * ORDER_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderId() { return _columnOrderId; }
    /**
     * ORDER_ITEM_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderItemId() { return _columnOrderItemId; }
    /**
     * PURCHASE_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseDate() { return _columnPurchaseDate; }
    /**
     * PAYMENTS_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentsDate() { return _columnPaymentsDate; }
    /**
     * BUYER_EMAIL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBuyerEmail() { return _columnBuyerEmail; }
    /**
     * BUYER_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBuyerName() { return _columnBuyerName; }
    /**
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBuyerPhoneNumber() { return _columnBuyerPhoneNumber; }
    /**
     * SKU: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSku() { return _columnSku; }
    /**
     * PRODUCT_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * QUANTITY_PURCHASED: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuantityPurchased() { return _columnQuantityPurchased; }
    /**
     * CURRENCY: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCurrency() { return _columnCurrency; }
    /**
     * ITEM_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemPrice() { return _columnItemPrice; }
    /**
     * ITEM_TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemTax() { return _columnItemTax; }
    /**
     * SHIPPING_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPrice() { return _columnShippingPrice; }
    /**
     * SHIPPING_TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTax() { return _columnShippingTax; }
    /**
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftWrapPrice() { return _columnGiftWrapPrice; }
    /**
     * GIFT_WRAP_TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftWrapTax() { return _columnGiftWrapTax; }
    /**
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipServiceLevel() { return _columnShipServiceLevel; }
    /**
     * RECIPIENT_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecipientName() { return _columnRecipientName; }
    /**
     * SHIP_ADDRESS_1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipAddress1() { return _columnShipAddress1; }
    /**
     * SHIP_ADDRESS_2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipAddress2() { return _columnShipAddress2; }
    /**
     * SHIP_ADDRESS_3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipAddress3() { return _columnShipAddress3; }
    /**
     * SHIP_CITY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCity() { return _columnShipCity; }
    /**
     * SHIP_STATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipState() { return _columnShipState; }
    /**
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipPostalCode() { return _columnShipPostalCode; }
    /**
     * SHIP_COUNTRY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCountry() { return _columnShipCountry; }
    /**
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipPhoneNumber() { return _columnShipPhoneNumber; }
    /**
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftWrapType() { return _columnGiftWrapType; }
    /**
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftMassageText() { return _columnGiftMassageText; }
    /**
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemPromotionDiscount() { return _columnItemPromotionDiscount; }
    /**
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemPromotionId() { return _columnItemPromotionId; }
    /**
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipPromotionDiscount() { return _columnShipPromotionDiscount; }
    /**
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipPromotionId() { return _columnShipPromotionId; }
    /**
     * DELIVERY_START_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryStartDate() { return _columnDeliveryStartDate; }
    /**
     * DELIVERY_END_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryEndDate() { return _columnDeliveryEndDate; }
    /**
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryTimeZone() { return _columnDeliveryTimeZone; }
    /**
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryInstructions() { return _columnDeliveryInstructions; }
    /**
     * PAYMENT_METHOD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethod() { return _columnPaymentMethod; }
    /**
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodCollectibleAmount() { return _columnCodCollectibleAmount; }
    /**
     * ALREADY_PAID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlreadyPaid() { return _columnAlreadyPaid; }
    /**
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethodFee() { return _columnPaymentMethodFee; }
    /**
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScheduledDeliStDate() { return _columnScheduledDeliStDate; }
    /**
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScheduledDeliEdDate() { return _columnScheduledDeliEdDate; }
    /**
     * PACKING_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingQty() { return _columnPackingQty; }
    /**
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm1() { return _columnSlipItemNm1; }
    /**
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm2() { return _columnSlipItemNm2; }
    /**
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm3() { return _columnSlipItemNm3; }
    /**
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm4() { return _columnSlipItemNm4; }
    /**
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm5() { return _columnSlipItemNm5; }
    /**
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemCd1() { return _columnSlipItemCd1; }
    /**
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemCd2() { return _columnSlipItemCd2; }
    /**
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightHandling1() { return _columnFreightHandling1; }
    /**
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightHandling2() { return _columnFreightHandling2; }
    /**
     * ARTICLE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticle() { return _columnArticle; }
    /**
     * RECEIVE_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveId() { return _columnReceiveId; }
    /**
     * ROW_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRowNo() { return _columnRowNo; }
    /**
     * ERROR_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * IMPORT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * IMPORT_TYPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeId() { return _columnImportTypeId; }
    /**
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderBId() { return _columnEcOrderBId; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnAmazonOrderId());
        ls.add(columnOrderId());
        ls.add(columnOrderItemId());
        ls.add(columnPurchaseDate());
        ls.add(columnPaymentsDate());
        ls.add(columnBuyerEmail());
        ls.add(columnBuyerName());
        ls.add(columnBuyerPhoneNumber());
        ls.add(columnSku());
        ls.add(columnProductName());
        ls.add(columnQuantityPurchased());
        ls.add(columnCurrency());
        ls.add(columnItemPrice());
        ls.add(columnItemTax());
        ls.add(columnShippingPrice());
        ls.add(columnShippingTax());
        ls.add(columnGiftWrapPrice());
        ls.add(columnGiftWrapTax());
        ls.add(columnShipServiceLevel());
        ls.add(columnRecipientName());
        ls.add(columnShipAddress1());
        ls.add(columnShipAddress2());
        ls.add(columnShipAddress3());
        ls.add(columnShipCity());
        ls.add(columnShipState());
        ls.add(columnShipPostalCode());
        ls.add(columnShipCountry());
        ls.add(columnShipPhoneNumber());
        ls.add(columnGiftWrapType());
        ls.add(columnGiftMassageText());
        ls.add(columnItemPromotionDiscount());
        ls.add(columnItemPromotionId());
        ls.add(columnShipPromotionDiscount());
        ls.add(columnShipPromotionId());
        ls.add(columnDeliveryStartDate());
        ls.add(columnDeliveryEndDate());
        ls.add(columnDeliveryTimeZone());
        ls.add(columnDeliveryInstructions());
        ls.add(columnPaymentMethod());
        ls.add(columnCodCollectibleAmount());
        ls.add(columnAlreadyPaid());
        ls.add(columnPaymentMethodFee());
        ls.add(columnScheduledDeliStDate());
        ls.add(columnScheduledDeliEdDate());
        ls.add(columnPackingQty());
        ls.add(columnSlipItemNm1());
        ls.add(columnSlipItemNm2());
        ls.add(columnSlipItemNm3());
        ls.add(columnSlipItemNm4());
        ls.add(columnSlipItemNm5());
        ls.add(columnSlipItemCd1());
        ls.add(columnSlipItemCd2());
        ls.add(columnFreightHandling1());
        ls.add(columnFreightHandling2());
        ls.add(columnArticle());
        ls.add(columnReceiveId());
        ls.add(columnRowNo());
        ls.add(columnErrorFlg());
        ls.add(columnImportFlg());
        ls.add(columnImportTypeId());
        ls.add(columnEcOrderBId());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnAmazonOrderId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTEcOrderB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderBId(), TEcOrderBDbm.getInstance().columnEcOrderBId());
        return cfi("T_AMAZON_ORDER_FK1", "TEcOrderB", this, TEcOrderBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TAmazonOrderList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TAmazonOrder"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TAmazonOrderCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TAmazonOrderBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TAmazonOrder> getEntityType() { return TAmazonOrder.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TAmazonOrder newEntity() { return new TAmazonOrder(); }
    public TAmazonOrder newMyEntity() { return new TAmazonOrder(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TAmazonOrder)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TAmazonOrder)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
