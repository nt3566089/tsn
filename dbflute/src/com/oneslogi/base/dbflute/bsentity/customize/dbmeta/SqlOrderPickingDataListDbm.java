package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlOrderPickingDataList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlOrderPickingDataListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlOrderPickingDataListDbm _instance = new SqlOrderPickingDataListDbm();
    private SqlOrderPickingDataListDbm() {}
    public static SqlOrderPickingDataListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getCenterId(), (et, vl) -> ((SqlOrderPickingDataList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getShippingPackingNo(), (et, vl) -> ((SqlOrderPickingDataList)et).setShippingPackingNo((String)vl), "shippingPackingNo");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getStockId(), (et, vl) -> ((SqlOrderPickingDataList)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getBoxCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setBoxCd((String)vl), "boxCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getBoxNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setBoxNm((String)vl), "boxNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getProductCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getProductNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getJanCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getLocationCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getLocationNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getPickingNum(), (et, vl) -> ((SqlOrderPickingDataList)et).setPickingNum(ctb(vl)), "pickingNum");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getPickingWorkNo(), (et, vl) -> ((SqlOrderPickingDataList)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getClientCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getClientNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getCenterCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getCenterNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getWarehouseCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getWarehouseAbbr(), (et, vl) -> ((SqlOrderPickingDataList)et).setWarehouseAbbr((String)vl), "warehouseAbbr");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getWorkDt(), (et, vl) -> ((SqlOrderPickingDataList)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getDelivDt(), (et, vl) -> ((SqlOrderPickingDataList)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getDeliveryCourseCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getDeliveryCourseNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getCarrierCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getCarrierNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getSupplyCustomerCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getSupplyCustomerNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getPickingBatchNo(), (et, vl) -> ((SqlOrderPickingDataList)et).setPickingBatchNo((String)vl), "pickingBatchNo");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getClientShippingNo(), (et, vl) -> ((SqlOrderPickingDataList)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getWmsShippingSlipNo(), (et, vl) -> ((SqlOrderPickingDataList)et).setWmsShippingSlipNo((String)vl), "wmsShippingSlipNo");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getPickingWorkMessage(), (et, vl) -> ((SqlOrderPickingDataList)et).setPickingWorkMessage((String)vl), "pickingWorkMessage");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getZonePickingOrder(), (et, vl) -> ((SqlOrderPickingDataList)et).setZonePickingOrder(ctl(vl)), "zonePickingOrder");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getZoneCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setZoneCd((String)vl), "zoneCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getZoneNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setZoneNm((String)vl), "zoneNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getLocationPickingOrder(), (et, vl) -> ((SqlOrderPickingDataList)et).setLocationPickingOrder(ctl(vl)), "locationPickingOrder");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getLimitDt(), (et, vl) -> ((SqlOrderPickingDataList)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getLot(), (et, vl) -> ((SqlOrderPickingDataList)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getStoreLabelNo(), (et, vl) -> ((SqlOrderPickingDataList)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getStoreDt(), (et, vl) -> ((SqlOrderPickingDataList)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getClientId(), (et, vl) -> ((SqlOrderPickingDataList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getStockTypeCd(), (et, vl) -> ((SqlOrderPickingDataList)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getStockTypeNm(), (et, vl) -> ((SqlOrderPickingDataList)et).setStockTypeNm((String)vl), "stockTypeNm");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getChargeNum(), (et, vl) -> ((SqlOrderPickingDataList)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((SqlOrderPickingDataList)et).getProductId(), (et, vl) -> ((SqlOrderPickingDataList)et).setProductId(ctl(vl)), "productId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlOrderPickingDataList";
    protected final String _tableDispName = "SqlOrderPickingDataList";
    protected final String _tablePropertyName = "sqlOrderPickingDataList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlOrderPickingDataList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterId = cci("center_id", "center_id", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPackingNo = cci("shipping_packing_no", "shipping_packing_no", null, null, String.class, "shippingPackingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockId = cci("stock_id", "stock_id", null, null, Long.class, "stockId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxCd = cci("box_cd", "box_cd", null, null, String.class, "boxCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNm = cci("box_nm", "box_nm", null, null, String.class, "boxNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("product_cd", "product_cd", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("product_nm", "product_nm", null, null, String.class, "productNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("jan_cd", "jan_cd", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("location_cd", "location_cd", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("location_nm", "location_nm", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingNum = cci("picking_num", "picking_num", null, null, java.math.BigDecimal.class, "pickingNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("picking_work_no", "picking_work_no", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("client_cd", "client_cd", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("client_nm", "client_nm", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("center_cd", "center_cd", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("center_nm", "center_nm", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("warehouse_cd", "warehouse_cd", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseAbbr = cci("warehouse_abbr", "warehouse_abbr", null, null, String.class, "warehouseAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("work_dt", "work_dt", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("deliv_dt", "deliv_dt", null, null, String.class, "delivDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("delivery_course_cd", "delivery_course_cd", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("delivery_course_nm", "delivery_course_nm", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("carrier_cd", "carrier_cd", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("carrier_nm", "carrier_nm", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("supply_customer_cd", "supply_customer_cd", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("supply_customer_nm", "supply_customer_nm", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingBatchNo = cci("picking_batch_no", "picking_batch_no", null, null, String.class, "pickingBatchNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("client_shipping_no", "client_shipping_no", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsShippingSlipNo = cci("wms_shipping_slip_no", "wms_shipping_slip_no", null, null, String.class, "wmsShippingSlipNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkMessage = cci("picking_work_message", "picking_work_message", null, null, String.class, "pickingWorkMessage", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZonePickingOrder = cci("zone_picking_order", "zone_picking_order", null, null, Long.class, "zonePickingOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneCd = cci("zone_cd", "zone_cd", null, null, String.class, "zoneCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneNm = cci("zone_nm", "zone_nm", null, null, String.class, "zoneNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationPickingOrder = cci("location_picking_order", "location_picking_order", null, null, Long.class, "locationPickingOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("limit_dt", "limit_dt", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("lot", "lot", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("store_label_no", "store_label_no", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("store_dt", "store_dt", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("client_id", "client_id", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("stock_type_cd", "stock_type_cd", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeNm = cci("stock_type_nm", "stock_type_nm", null, null, String.class, "stockTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("charge_num", "charge_num", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("product_id", "product_id", null, null, Long.class, "productId", null, true, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * center_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * shipping_packing_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo() { return _columnShippingPackingNo; }
    /**
     * stock_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * box_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCd() { return _columnBoxCd; }
    /**
     * box_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNm() { return _columnBoxNm; }
    /**
     * product_cd: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * product_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * jan_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * location_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * location_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * picking_num: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNum() { return _columnPickingNum; }
    /**
     * picking_work_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * client_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * client_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * center_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * center_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * warehouse_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * warehouse_abbr: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseAbbr() { return _columnWarehouseAbbr; }
    /**
     * work_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * deliv_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * delivery_course_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * delivery_course_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * carrier_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * carrier_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * supply_customer_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * supply_customer_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * picking_batch_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBatchNo() { return _columnPickingBatchNo; }
    /**
     * client_shipping_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
    /**
     * wms_shipping_slip_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsShippingSlipNo() { return _columnWmsShippingSlipNo; }
    /**
     * picking_work_message: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkMessage() { return _columnPickingWorkMessage; }
    /**
     * zone_picking_order: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZonePickingOrder() { return _columnZonePickingOrder; }
    /**
     * zone_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneCd() { return _columnZoneCd; }
    /**
     * zone_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneNm() { return _columnZoneNm; }
    /**
     * location_picking_order: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationPickingOrder() { return _columnLocationPickingOrder; }
    /**
     * limit_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * lot: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * store_label_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * store_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * client_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * stock_type_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * stock_type_nm: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeNm() { return _columnStockTypeNm; }
    /**
     * charge_num: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * product_id: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterId());
        ls.add(columnShippingPackingNo());
        ls.add(columnStockId());
        ls.add(columnBoxCd());
        ls.add(columnBoxNm());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnJanCd());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnPickingNum());
        ls.add(columnPickingWorkNo());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseAbbr());
        ls.add(columnWorkDt());
        ls.add(columnDelivDt());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnPickingBatchNo());
        ls.add(columnClientShippingNo());
        ls.add(columnWmsShippingSlipNo());
        ls.add(columnPickingWorkMessage());
        ls.add(columnZonePickingOrder());
        ls.add(columnZoneCd());
        ls.add(columnZoneNm());
        ls.add(columnLocationPickingOrder());
        ls.add(columnLimitDt());
        ls.add(columnLot());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnClientId());
        ls.add(columnStockTypeCd());
        ls.add(columnStockTypeNm());
        ls.add(columnChargeNum());
        ls.add(columnProductId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlOrderPickingDataList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlOrderPickingDataList> getEntityType() { return SqlOrderPickingDataList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlOrderPickingDataList newEntity() { return new SqlOrderPickingDataList(); }
    public SqlOrderPickingDataList newMyEntity() { return new SqlOrderPickingDataList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlOrderPickingDataList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlOrderPickingDataList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
