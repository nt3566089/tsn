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
 * The DB meta of SqlELocationList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlELocationListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlELocationListDbm _instance = new SqlELocationListDbm();
    private SqlELocationListDbm() {}
    public static SqlELocationListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getLocationId(), (et, vl) -> ((SqlELocationList)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReceiveCd(), (et, vl) -> ((SqlELocationList)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReceiveRowId(), (et, vl) -> ((SqlELocationList)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getImportFlg(), (et, vl) -> ((SqlELocationList)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getErrorFlg(), (et, vl) -> ((SqlELocationList)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getErrorMessageCd(), (et, vl) -> ((SqlELocationList)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getCenterCd(), (et, vl) -> ((SqlELocationList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getLocationCd(), (et, vl) -> ((SqlELocationList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getLocationNm(), (et, vl) -> ((SqlELocationList)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getWarehouseCd(), (et, vl) -> ((SqlELocationList)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getZoneCd(), (et, vl) -> ((SqlELocationList)et).setZoneCd((String)vl), "zoneCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getLocationType(), (et, vl) -> ((SqlELocationList)et).setLocationType((String)vl), "locationType");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getPickingLocationFlg(), (et, vl) -> ((SqlELocationList)et).setPickingLocationFlg((String)vl), "pickingLocationFlg");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getAllocNgFlg(), (et, vl) -> ((SqlELocationList)et).setAllocNgFlg((String)vl), "allocNgFlg");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getPickingOrder(), (et, vl) -> ((SqlELocationList)et).setPickingOrder((String)vl), "pickingOrder");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getAllocOrder(), (et, vl) -> ((SqlELocationList)et).setAllocOrder((String)vl), "allocOrder");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getClientCd(), (et, vl) -> ((SqlELocationList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReplenishProductCd(), (et, vl) -> ((SqlELocationList)et).setReplenishProductCd((String)vl), "replenishProductCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReplenishStockTypeCd(), (et, vl) -> ((SqlELocationList)et).setReplenishStockTypeCd((String)vl), "replenishStockTypeCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReplenishDepositCd(), (et, vl) -> ((SqlELocationList)et).setReplenishDepositCd((String)vl), "replenishDepositCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReplenishDepositNm(), (et, vl) -> ((SqlELocationList)et).setReplenishDepositNm((String)vl), "replenishDepositNm");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReplenishPNum(), (et, vl) -> ((SqlELocationList)et).setReplenishPNum((String)vl), "replenishPNum");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReplenishPProductShapeCd(), (et, vl) -> ((SqlELocationList)et).setReplenishPProductShapeCd((String)vl), "replenishPProductShapeCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getMaxStoreNum(), (et, vl) -> ((SqlELocationList)et).setMaxStoreNum((String)vl), "maxStoreNum");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getMaxStoreProductShapeCd(), (et, vl) -> ((SqlELocationList)et).setMaxStoreProductShapeCd((String)vl), "maxStoreProductShapeCd");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getDelFlg(), (et, vl) -> ((SqlELocationList)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getVersionNo(), (et, vl) -> ((SqlELocationList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getControlNo(), (et, vl) -> ((SqlELocationList)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getAddDt(), (et, vl) -> ((SqlELocationList)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getAddUser(), (et, vl) -> ((SqlELocationList)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getAddProcess(), (et, vl) -> ((SqlELocationList)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getUpdDt(), (et, vl) -> ((SqlELocationList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getUpdUser(), (et, vl) -> ((SqlELocationList)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getUpdProcess(), (et, vl) -> ((SqlELocationList)et).setUpdProcess((String)vl), "updProcess");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getZoneId(), (et, vl) -> ((SqlELocationList)et).setZoneId(ctl(vl)), "zoneId");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getZoneNm(), (et, vl) -> ((SqlELocationList)et).setZoneNm((String)vl), "zoneNm");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getWarehouseNm(), (et, vl) -> ((SqlELocationList)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getWarehouseId(), (et, vl) -> ((SqlELocationList)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getProductId(), (et, vl) -> ((SqlELocationList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReplenishProductShapeId(), (et, vl) -> ((SqlELocationList)et).setReplenishProductShapeId(ctl(vl)), "replenishProductShapeId");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getReplenishProductShapeNm(), (et, vl) -> ((SqlELocationList)et).setReplenishProductShapeNm((String)vl), "replenishProductShapeNm");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getMaxStoreProductShapeId(), (et, vl) -> ((SqlELocationList)et).setMaxStoreProductShapeId(ctl(vl)), "maxStoreProductShapeId");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getMaxStoreProductShapeNm(), (et, vl) -> ((SqlELocationList)et).setMaxStoreProductShapeNm((String)vl), "maxStoreProductShapeNm");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getMessageNm(), (et, vl) -> ((SqlELocationList)et).setMessageNm((String)vl), "messageNm");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getMlocationId(), (et, vl) -> ((SqlELocationList)et).setMlocationId(ctl(vl)), "mlocationId");
        setupEpg(_epgMap, et -> ((SqlELocationList)et).getMversionNo(), (et, vl) -> ((SqlELocationList)et).setMversionNo(ctl(vl)), "mversionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlELocationList";
    protected final String _tableDispName = "SqlELocationList";
    protected final String _tablePropertyName = "sqlELocationList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlELocationList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneCd = cci("ZONE_CD", "ZONE_CD", null, null, String.class, "zoneCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationType = cci("LOCATION_TYPE", "LOCATION_TYPE", null, null, String.class, "locationType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingLocationFlg = cci("PICKING_LOCATION_FLG", "PICKING_LOCATION_FLG", null, null, String.class, "pickingLocationFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNgFlg = cci("ALLOC_NG_FLG", "ALLOC_NG_FLG", null, null, String.class, "allocNgFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingOrder = cci("PICKING_ORDER", "PICKING_ORDER", null, null, String.class, "pickingOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, String.class, "allocOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishProductCd = cci("REPLENISH_PRODUCT_CD", "REPLENISH_PRODUCT_CD", null, null, String.class, "replenishProductCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishStockTypeCd = cci("REPLENISH_STOCK_TYPE_CD", "REPLENISH_STOCK_TYPE_CD", null, null, String.class, "replenishStockTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishDepositCd = cci("REPLENISH_DEPOSIT_CD", "REPLENISH_DEPOSIT_CD", null, null, String.class, "replenishDepositCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishDepositNm = cci("REPLENISH_DEPOSIT_NM", "REPLENISH_DEPOSIT_NM", null, null, String.class, "replenishDepositNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPNum = cci("REPLENISH_P_NUM", "REPLENISH_P_NUM", null, null, String.class, "replenishPNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPProductShapeCd = cci("REPLENISH_P_PRODUCT_SHAPE_CD", "REPLENISH_P_PRODUCT_SHAPE_CD", null, null, String.class, "replenishPProductShapeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreNum = cci("MAX_STORE_NUM", "MAX_STORE_NUM", null, null, String.class, "maxStoreNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreProductShapeCd = cci("MAX_STORE_PRODUCT_SHAPE_CD", "MAX_STORE_PRODUCT_SHAPE_CD", null, null, String.class, "maxStoreProductShapeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneId = cci("ZONE_ID", "ZONE_ID", null, null, Long.class, "zoneId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneNm = cci("ZONE_NM", "ZONE_NM", null, null, String.class, "zoneNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("WAREHOUSE_NM", "WAREHOUSE_NM", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishProductShapeId = cci("REPLENISH_PRODUCT_SHAPE_ID", "REPLENISH_PRODUCT_SHAPE_ID", null, null, Long.class, "replenishProductShapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishProductShapeNm = cci("REPLENISH_PRODUCT_SHAPE_NM", "REPLENISH_PRODUCT_SHAPE_NM", null, null, String.class, "replenishProductShapeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreProductShapeId = cci("MAX_STORE_PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", null, null, Long.class, "maxStoreProductShapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreProductShapeNm = cci("MAX_STORE_PRODUCT_SHAPE_NM", "MAX_STORE_PRODUCT_SHAPE_NM", null, null, String.class, "maxStoreProductShapeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageNm = cci("MESSAGE_NM", "MESSAGE_NM", null, null, String.class, "messageNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMlocationId = cci("MLOCATION_ID", "MLOCATION_ID", null, null, Long.class, "mlocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMversionNo = cci("MVERSION_NO", "MVERSION_NO", null, null, Long.class, "mversionNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * RECEIVE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * LOCATION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOCATION_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * ZONE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneCd() { return _columnZoneCd; }
    /**
     * LOCATION_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationType() { return _columnLocationType; }
    /**
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingLocationFlg() { return _columnPickingLocationFlg; }
    /**
     * ALLOC_NG_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNgFlg() { return _columnAllocNgFlg; }
    /**
     * PICKING_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingOrder() { return _columnPickingOrder; }
    /**
     * ALLOC_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishProductCd() { return _columnReplenishProductCd; }
    /**
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishStockTypeCd() { return _columnReplenishStockTypeCd; }
    /**
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishDepositCd() { return _columnReplenishDepositCd; }
    /**
     * REPLENISH_DEPOSIT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishDepositNm() { return _columnReplenishDepositNm; }
    /**
     * REPLENISH_P_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPNum() { return _columnReplenishPNum; }
    /**
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPProductShapeCd() { return _columnReplenishPProductShapeCd; }
    /**
     * MAX_STORE_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreNum() { return _columnMaxStoreNum; }
    /**
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreProductShapeCd() { return _columnMaxStoreProductShapeCd; }
    /**
     * DEL_FLG: {char(1), classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {bigint(19)}
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
    /**
     * ZONE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneId() { return _columnZoneId; }
    /**
     * ZONE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneNm() { return _columnZoneNm; }
    /**
     * WAREHOUSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseNm() { return _columnWarehouseNm; }
    /**
     * WAREHOUSE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * REPLENISH_PRODUCT_SHAPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishProductShapeId() { return _columnReplenishProductShapeId; }
    /**
     * REPLENISH_PRODUCT_SHAPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishProductShapeNm() { return _columnReplenishProductShapeNm; }
    /**
     * MAX_STORE_PRODUCT_SHAPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreProductShapeId() { return _columnMaxStoreProductShapeId; }
    /**
     * MAX_STORE_PRODUCT_SHAPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreProductShapeNm() { return _columnMaxStoreProductShapeNm; }
    /**
     * MESSAGE_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNm() { return _columnMessageNm; }
    /**
     * MLOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMlocationId() { return _columnMlocationId; }
    /**
     * MVERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMversionNo() { return _columnMversionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLocationId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnCenterCd());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnWarehouseCd());
        ls.add(columnZoneCd());
        ls.add(columnLocationType());
        ls.add(columnPickingLocationFlg());
        ls.add(columnAllocNgFlg());
        ls.add(columnPickingOrder());
        ls.add(columnAllocOrder());
        ls.add(columnClientCd());
        ls.add(columnReplenishProductCd());
        ls.add(columnReplenishStockTypeCd());
        ls.add(columnReplenishDepositCd());
        ls.add(columnReplenishDepositNm());
        ls.add(columnReplenishPNum());
        ls.add(columnReplenishPProductShapeCd());
        ls.add(columnMaxStoreNum());
        ls.add(columnMaxStoreProductShapeCd());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        ls.add(columnZoneId());
        ls.add(columnZoneNm());
        ls.add(columnWarehouseNm());
        ls.add(columnWarehouseId());
        ls.add(columnProductId());
        ls.add(columnReplenishProductShapeId());
        ls.add(columnReplenishProductShapeNm());
        ls.add(columnMaxStoreProductShapeId());
        ls.add(columnMaxStoreProductShapeNm());
        ls.add(columnMessageNm());
        ls.add(columnMlocationId());
        ls.add(columnMversionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlELocationList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlELocationList> getEntityType() { return SqlELocationList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlELocationList newEntity() { return new SqlELocationList(); }
    public SqlELocationList newMyEntity() { return new SqlELocationList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlELocationList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlELocationList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
