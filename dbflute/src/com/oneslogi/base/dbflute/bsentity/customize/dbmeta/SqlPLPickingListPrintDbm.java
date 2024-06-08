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
 * The DB meta of SqlPLPickingListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPLPickingListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPLPickingListPrintDbm _instance = new SqlPLPickingListPrintDbm();
    private SqlPLPickingListPrintDbm() {}
    public static SqlPLPickingListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getWmsShippingSlipNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setWmsShippingSlipNo((String)vl), "wmsShippingSlipNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getShippingSlipNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setShippingSlipNo(ctl(vl)), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getClientCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getClientNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getClientAbbr(), (et, vl) -> ((SqlPLPickingListPrint)et).setClientAbbr((String)vl), "clientAbbr");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getCenterCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getCenterNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getCenterAbbr(), (et, vl) -> ((SqlPLPickingListPrint)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getWarehouseCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getWarehouseNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getWarehouseAbbr(), (et, vl) -> ((SqlPLPickingListPrint)et).setWarehouseAbbr((String)vl), "warehouseAbbr");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getWorkDt(), (et, vl) -> ((SqlPLPickingListPrint)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getDelivDt(), (et, vl) -> ((SqlPLPickingListPrint)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getPickingGroupNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setPickingGroupNo((String)vl), "pickingGroupNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getCarrierCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getCarrierNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getDeliveryCourseCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getDeliveryCourseNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getSupplyCustomerCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getSupplyCustomerNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getPickingWorkNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getDelivUnitNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setDelivUnitNo((String)vl), "delivUnitNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getShippingPackingNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setShippingPackingNo((String)vl), "shippingPackingNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getBoxCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setBoxCd((String)vl), "boxCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getBoxNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setBoxNm((String)vl), "boxNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getPackingCalCls(), (et, vl) -> ((SqlPLPickingListPrint)et).setPackingCalCls((String)vl), "packingCalCls");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getPickingWorkMessage(), (et, vl) -> ((SqlPLPickingListPrint)et).setPickingWorkMessage((String)vl), "pickingWorkMessage");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getPickingWorkMessageCount(), (et, vl) -> ((SqlPLPickingListPrint)et).setPickingWorkMessageCount(ctl(vl)), "pickingWorkMessageCount");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getLocationCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getLocationNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getProductId(), (et, vl) -> ((SqlPLPickingListPrint)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getProductCd(), (et, vl) -> ((SqlPLPickingListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getProductNm(), (et, vl) -> ((SqlPLPickingListPrint)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getPlOutFlg(), (et, vl) -> ((SqlPLPickingListPrint)et).setPlOutFlg((String)vl), "plOutFlg");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getJancd(), (et, vl) -> ((SqlPLPickingListPrint)et).setJancd((String)vl), "jancd");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getStoreLabelNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getStoreDt(), (et, vl) -> ((SqlPLPickingListPrint)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getLot(), (et, vl) -> ((SqlPLPickingListPrint)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getLimitDt(), (et, vl) -> ((SqlPLPickingListPrint)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getPickingNum(), (et, vl) -> ((SqlPLPickingListPrint)et).setPickingNum(ctb(vl)), "pickingNum");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getTempNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setTempNo((String)vl), "tempNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getSeedingNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setSeedingNo((String)vl), "seedingNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getCartNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setCartNo(ctl(vl)), "cartNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getBucketColNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setBucketColNo(ctl(vl)), "bucketColNo");
        setupEpg(_epgMap, et -> ((SqlPLPickingListPrint)et).getBucketRowNo(), (et, vl) -> ((SqlPLPickingListPrint)et).setBucketRowNo(ctl(vl)), "bucketRowNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPLPickingListPrint";
    protected final String _tableDispName = "SqlPLPickingListPrint";
    protected final String _tablePropertyName = "sqlPLPickingListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPLPickingListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWmsShippingSlipNo = cci("WMS_SHIPPING_SLIP_NO", "WMS_SHIPPING_SLIP_NO", null, null, String.class, "wmsShippingSlipNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, Long.class, "shippingSlipNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAbbr = cci("CLIENT_ABBR", "CLIENT_ABBR", null, null, String.class, "clientAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("WAREHOUSE_NM", "WAREHOUSE_NM", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseAbbr = cci("WAREHOUSE_ABBR", "WAREHOUSE_ABBR", null, null, String.class, "warehouseAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingGroupNo = cci("PICKING_GROUP_NO", "PICKING_GROUP_NO", null, null, String.class, "pickingGroupNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivUnitNo = cci("DELIV_UNIT_NO", "DELIV_UNIT_NO", null, null, String.class, "delivUnitNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPackingNo = cci("SHIPPING_PACKING_NO", "SHIPPING_PACKING_NO", null, null, String.class, "shippingPackingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxCd = cci("BOX_CD", "BOX_CD", null, null, String.class, "boxCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNm = cci("BOX_NM", "BOX_NM", null, null, String.class, "boxNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingCalCls = cci("PACKING_CAL_CLS", "PACKING_CAL_CLS", null, null, String.class, "packingCalCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, CDef.DefMeta.PackingCalCls, false);
    protected final ColumnInfo _columnPickingWorkMessage = cci("PICKING_WORK_MESSAGE", "PICKING_WORK_MESSAGE", null, null, String.class, "pickingWorkMessage", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkMessageCount = cci("PICKING_WORK_MESSAGE_COUNT", "PICKING_WORK_MESSAGE_COUNT", null, null, Long.class, "pickingWorkMessageCount", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlOutFlg = cci("PL_OUT_FLG", "PL_OUT_FLG", null, null, String.class, "plOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnJancd = cci("JANCD", "JANCD", null, null, String.class, "jancd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingNum = cci("PICKING_NUM", "PICKING_NUM", null, null, java.math.BigDecimal.class, "pickingNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempNo = cci("TEMP_NO", "TEMP_NO", null, null, String.class, "tempNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeedingNo = cci("SEEDING_NO", "SEEDING_NO", null, null, String.class, "seedingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCartNo = cci("CART_NO", "CART_NO", null, null, Long.class, "cartNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBucketColNo = cci("BUCKET_COL_NO", "BUCKET_COL_NO", null, null, Long.class, "bucketColNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBucketRowNo = cci("BUCKET_ROW_NO", "BUCKET_ROW_NO", null, null, Long.class, "bucketRowNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * WMS_SHIPPING_SLIP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsShippingSlipNo() { return _columnWmsShippingSlipNo; }
    /**
     * SHIPPING_SLIP_NO: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * CLIENT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientAbbr() { return _columnClientAbbr; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * CENTER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
    /**
     * WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * WAREHOUSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseNm() { return _columnWarehouseNm; }
    /**
     * WAREHOUSE_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseAbbr() { return _columnWarehouseAbbr; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * DELIV_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * PICKING_GROUP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingGroupNo() { return _columnPickingGroupNo; }
    /**
     * CARRIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * SUPPLY_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * PICKING_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * DELIV_UNIT_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivUnitNo() { return _columnDelivUnitNo; }
    /**
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo() { return _columnShippingPackingNo; }
    /**
     * BOX_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCd() { return _columnBoxCd; }
    /**
     * BOX_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNm() { return _columnBoxNm; }
    /**
     * PACKING_CAL_CLS: {varchar(30), classification=PackingCalCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingCalCls() { return _columnPackingCalCls; }
    /**
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkMessage() { return _columnPickingWorkMessage; }
    /**
     * PICKING_WORK_MESSAGE_COUNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkMessageCount() { return _columnPickingWorkMessageCount; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOCATION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PL_OUT_FLG: {char(1), classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutFlg() { return _columnPlOutFlg; }
    /**
     * JANCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJancd() { return _columnJancd; }
    /**
     * STORE_LABEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * STORE_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * LOT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMIT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * PICKING_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNum() { return _columnPickingNum; }
    /**
     * TEMP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempNo() { return _columnTempNo; }
    /**
     * SEEDING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeedingNo() { return _columnSeedingNo; }
    /**
     * CART_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCartNo() { return _columnCartNo; }
    /**
     * BUCKET_COL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBucketColNo() { return _columnBucketColNo; }
    /**
     * BUCKET_ROW_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBucketRowNo() { return _columnBucketRowNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWmsShippingSlipNo());
        ls.add(columnShippingSlipNo());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnClientAbbr());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnCenterAbbr());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseNm());
        ls.add(columnWarehouseAbbr());
        ls.add(columnWorkDt());
        ls.add(columnDelivDt());
        ls.add(columnPickingGroupNo());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnPickingWorkNo());
        ls.add(columnDelivUnitNo());
        ls.add(columnShippingPackingNo());
        ls.add(columnBoxCd());
        ls.add(columnBoxNm());
        ls.add(columnPackingCalCls());
        ls.add(columnPickingWorkMessage());
        ls.add(columnPickingWorkMessageCount());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnPlOutFlg());
        ls.add(columnJancd());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnPickingNum());
        ls.add(columnTempNo());
        ls.add(columnSeedingNo());
        ls.add(columnCartNo());
        ls.add(columnBucketColNo());
        ls.add(columnBucketRowNo());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPLPickingListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPLPickingListPrint> getEntityType() { return SqlPLPickingListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPLPickingListPrint newEntity() { return new SqlPLPickingListPrint(); }
    public SqlPLPickingListPrint newMyEntity() { return new SqlPLPickingListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPLPickingListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPLPickingListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
