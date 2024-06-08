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
 * The DB meta of E_SHIPPING_INST_DATA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShippingInstDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShippingInstDataDbm _instance = new EShippingInstDataDbm();
    private EShippingInstDataDbm() {}
    public static EShippingInstDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getShippingInstDataId(), (et, vl) -> ((EShippingInstData)et).setShippingInstDataId(ctl(vl)), "shippingInstDataId");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getReceiveCd(), (et, vl) -> ((EShippingInstData)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getReceiveRowId(), (et, vl) -> ((EShippingInstData)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getImportFlg(), (et, vl) -> ((EShippingInstData)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getErrorFlg(), (et, vl) -> ((EShippingInstData)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getErrorMessageCd(), (et, vl) -> ((EShippingInstData)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getInstructionsDate(), (et, vl) -> ((EShippingInstData)et).setInstructionsDate((String)vl), "instructionsDate");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getOwnerDirectNo(), (et, vl) -> ((EShippingInstData)et).setOwnerDirectNo((String)vl), "ownerDirectNo");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getSalesType(), (et, vl) -> ((EShippingInstData)et).setSalesType((String)vl), "salesType");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getShiptoCode(), (et, vl) -> ((EShippingInstData)et).setShiptoCode((String)vl), "shiptoCode");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getProductCd(), (et, vl) -> ((EShippingInstData)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getExpectQty(), (et, vl) -> ((EShippingInstData)et).setExpectQty((String)vl), "expectQty");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getUnitPrice(), (et, vl) -> ((EShippingInstData)et).setUnitPrice((String)vl), "unitPrice");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getPlanPriceTotal(), (et, vl) -> ((EShippingInstData)et).setPlanPriceTotal((String)vl), "planPriceTotal");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getPlanName(), (et, vl) -> ((EShippingInstData)et).setPlanName((String)vl), "planName");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getPlanpost(), (et, vl) -> ((EShippingInstData)et).setPlanpost((String)vl), "planpost");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getPlanAdress1(), (et, vl) -> ((EShippingInstData)et).setPlanAdress1((String)vl), "planAdress1");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getPlanAdress2(), (et, vl) -> ((EShippingInstData)et).setPlanAdress2((String)vl), "planAdress2");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getPlanProductName(), (et, vl) -> ((EShippingInstData)et).setPlanProductName((String)vl), "planProductName");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getWarehousePlant(), (et, vl) -> ((EShippingInstData)et).setWarehousePlant((String)vl), "warehousePlant");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getWarehousePlantName(), (et, vl) -> ((EShippingInstData)et).setWarehousePlantName((String)vl), "warehousePlantName");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getOrderDate(), (et, vl) -> ((EShippingInstData)et).setOrderDate((String)vl), "orderDate");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getDeliveryDate(), (et, vl) -> ((EShippingInstData)et).setDeliveryDate((String)vl), "deliveryDate");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getPurchaseNo(), (et, vl) -> ((EShippingInstData)et).setPurchaseNo((String)vl), "purchaseNo");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getOrderNumber(), (et, vl) -> ((EShippingInstData)et).setOrderNumber((String)vl), "orderNumber");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getItemLineNo(), (et, vl) -> ((EShippingInstData)et).setItemLineNo((String)vl), "itemLineNo");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getSkuCode(), (et, vl) -> ((EShippingInstData)et).setSkuCode((String)vl), "skuCode");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getCardboard(), (et, vl) -> ((EShippingInstData)et).setCardboard((String)vl), "cardboard");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getCarton(), (et, vl) -> ((EShippingInstData)et).setCarton((String)vl), "carton");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getTotalQty(), (et, vl) -> ((EShippingInstData)et).setTotalQty((String)vl), "totalQty");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getNote(), (et, vl) -> ((EShippingInstData)et).setNote((String)vl), "note");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getReserve2(), (et, vl) -> ((EShippingInstData)et).setReserve2((String)vl), "reserve2");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getReserve3(), (et, vl) -> ((EShippingInstData)et).setReserve3((String)vl), "reserve3");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getReserve(), (et, vl) -> ((EShippingInstData)et).setReserve((String)vl), "reserve");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getDelFlg(), (et, vl) -> ((EShippingInstData)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getVersionNo(), (et, vl) -> ((EShippingInstData)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getControlNo(), (et, vl) -> ((EShippingInstData)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getAddDt(), (et, vl) -> ((EShippingInstData)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getAddUser(), (et, vl) -> ((EShippingInstData)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getAddProcess(), (et, vl) -> ((EShippingInstData)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getUpdDt(), (et, vl) -> ((EShippingInstData)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getUpdUser(), (et, vl) -> ((EShippingInstData)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShippingInstData)et).getUpdProcess(), (et, vl) -> ((EShippingInstData)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SHIPPING_INST_DATA";
    protected final String _tableDispName = "E_SHIPPING_INST_DATA";
    protected final String _tablePropertyName = "EShippingInstData";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SHIPPING_INST_DATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstDataId = cci("SHIPPING_INST_DATA_ID", "SHIPPING_INST_DATA_ID", null, null, Long.class, "shippingInstDataId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructionsDate = cci("INSTRUCTIONS_DATE", "INSTRUCTIONS_DATE", null, null, String.class, "instructionsDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerDirectNo = cci("OWNER_DIRECT_NO", "OWNER_DIRECT_NO", null, null, String.class, "ownerDirectNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesType = cci("SALES_TYPE", "SALES_TYPE", null, null, String.class, "salesType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptoCode = cci("SHIPTO_CODE", "SHIPTO_CODE", null, null, String.class, "shiptoCode", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectQty = cci("EXPECT_QTY", "EXPECT_QTY", null, null, String.class, "expectQty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, String.class, "unitPrice", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanPriceTotal = cci("PLAN_PRICE_TOTAL", "PLAN_PRICE_TOTAL", null, null, String.class, "planPriceTotal", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanName = cci("PLAN_NAME", "PLAN_NAME", null, null, String.class, "planName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanpost = cci("PLANPOST", "PLANPOST", null, null, String.class, "planpost", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanAdress1 = cci("PLAN_ADRESS1", "PLAN_ADRESS1", null, null, String.class, "planAdress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanAdress2 = cci("PLAN_ADRESS2", "PLAN_ADRESS2", null, null, String.class, "planAdress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanProductName = cci("PLAN_PRODUCT_NAME", "PLAN_PRODUCT_NAME", null, null, String.class, "planProductName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousePlant = cci("WAREHOUSE_PLANT", "WAREHOUSE_PLANT", null, null, String.class, "warehousePlant", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousePlantName = cci("WAREHOUSE_PLANT_NAME", "WAREHOUSE_PLANT_NAME", null, null, String.class, "warehousePlantName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderDate = cci("ORDER_DATE", "ORDER_DATE", null, null, String.class, "orderDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryDate = cci("DELIVERY_DATE", "DELIVERY_DATE", null, null, String.class, "deliveryDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseNo = cci("PURCHASE_NO", "PURCHASE_NO", null, null, String.class, "purchaseNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNumber = cci("ORDER_NUMBER", "ORDER_NUMBER", null, null, String.class, "orderNumber", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemLineNo = cci("ITEM_LINE_NO", "ITEM_LINE_NO", null, null, String.class, "itemLineNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkuCode = cci("SKU_CODE", "SKU_CODE", null, null, String.class, "skuCode", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardboard = cci("CARDBOARD", "CARDBOARD", null, null, String.class, "cardboard", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarton = cci("CARTON", "CARTON", null, null, String.class, "carton", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalQty = cci("TOTAL_QTY", "TOTAL_QTY", null, null, String.class, "totalQty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNote = cci("NOTE", "NOTE", null, null, String.class, "note", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReserve2 = cci("RESERVE2", "RESERVE2", null, null, String.class, "reserve2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReserve3 = cci("RESERVE3", "RESERVE3", null, null, String.class, "reserve3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReserve = cci("RESERVE", "RESERVE", null, null, String.class, "reserve", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstDataId() { return _columnShippingInstDataId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * INSTRUCTIONS_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstructionsDate() { return _columnInstructionsDate; }
    /**
     * OWNER_DIRECT_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerDirectNo() { return _columnOwnerDirectNo; }
    /**
     * SALES_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesType() { return _columnSalesType; }
    /**
     * SHIPTO_CODE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptoCode() { return _columnShiptoCode; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * EXPECT_QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectQty() { return _columnExpectQty; }
    /**
     * UNIT_PRICE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * PLAN_PRICE_TOTAL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanPriceTotal() { return _columnPlanPriceTotal; }
    /**
     * PLAN_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanName() { return _columnPlanName; }
    /**
     * PLANPOST: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanpost() { return _columnPlanpost; }
    /**
     * PLAN_ADRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanAdress1() { return _columnPlanAdress1; }
    /**
     * PLAN_ADRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanAdress2() { return _columnPlanAdress2; }
    /**
     * PLAN_PRODUCT_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanProductName() { return _columnPlanProductName; }
    /**
     * WAREHOUSE_PLANT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousePlant() { return _columnWarehousePlant; }
    /**
     * WAREHOUSE_PLANT_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousePlantName() { return _columnWarehousePlantName; }
    /**
     * ORDER_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderDate() { return _columnOrderDate; }
    /**
     * DELIVERY_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryDate() { return _columnDeliveryDate; }
    /**
     * PURCHASE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseNo() { return _columnPurchaseNo; }
    /**
     * ORDER_NUMBER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNumber() { return _columnOrderNumber; }
    /**
     * ITEM_LINE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemLineNo() { return _columnItemLineNo; }
    /**
     * SKU_CODE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkuCode() { return _columnSkuCode; }
    /**
     * CARDBOARD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardboard() { return _columnCardboard; }
    /**
     * CARTON: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarton() { return _columnCarton; }
    /**
     * TOTAL_QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalQty() { return _columnTotalQty; }
    /**
     * NOTE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNote() { return _columnNote; }
    /**
     * RESERVE2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReserve2() { return _columnReserve2; }
    /**
     * RESERVE3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReserve3() { return _columnReserve3; }
    /**
     * RESERVE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReserve() { return _columnReserve; }
    /**
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {bigint(19), default=[(0)]}
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
        ls.add(columnShippingInstDataId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnInstructionsDate());
        ls.add(columnOwnerDirectNo());
        ls.add(columnSalesType());
        ls.add(columnShiptoCode());
        ls.add(columnProductCd());
        ls.add(columnExpectQty());
        ls.add(columnUnitPrice());
        ls.add(columnPlanPriceTotal());
        ls.add(columnPlanName());
        ls.add(columnPlanpost());
        ls.add(columnPlanAdress1());
        ls.add(columnPlanAdress2());
        ls.add(columnPlanProductName());
        ls.add(columnWarehousePlant());
        ls.add(columnWarehousePlantName());
        ls.add(columnOrderDate());
        ls.add(columnDeliveryDate());
        ls.add(columnPurchaseNo());
        ls.add(columnOrderNumber());
        ls.add(columnItemLineNo());
        ls.add(columnSkuCode());
        ls.add(columnCardboard());
        ls.add(columnCarton());
        ls.add(columnTotalQty());
        ls.add(columnNote());
        ls.add(columnReserve2());
        ls.add(columnReserve3());
        ls.add(columnReserve());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingInstDataId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShippingInstData"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShippingInstDataCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShippingInstDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShippingInstData> getEntityType() { return EShippingInstData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShippingInstData newEntity() { return new EShippingInstData(); }
    public EShippingInstData newMyEntity() { return new EShippingInstData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShippingInstData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShippingInstData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
