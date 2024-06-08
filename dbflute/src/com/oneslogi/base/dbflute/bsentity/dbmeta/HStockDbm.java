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
 * The DB meta of H_STOCK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HStockDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HStockDbm _instance = new HStockDbm();
    private HStockDbm() {}
    public static HStockDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HStock)et).getStockId(), (et, vl) -> ((HStock)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((HStock)et).getClientId(), (et, vl) -> ((HStock)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((HStock)et).getClientCd(), (et, vl) -> ((HStock)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((HStock)et).getClientNm(), (et, vl) -> ((HStock)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((HStock)et).getCenterId(), (et, vl) -> ((HStock)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((HStock)et).getCenterCd(), (et, vl) -> ((HStock)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((HStock)et).getCenterNm(), (et, vl) -> ((HStock)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((HStock)et).getWarehouseId(), (et, vl) -> ((HStock)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((HStock)et).getWarehouseCd(), (et, vl) -> ((HStock)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((HStock)et).getWarehouseNm(), (et, vl) -> ((HStock)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((HStock)et).getProductId(), (et, vl) -> ((HStock)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((HStock)et).getProductCd(), (et, vl) -> ((HStock)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((HStock)et).getProductNm(), (et, vl) -> ((HStock)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((HStock)et).getProductAbbr(), (et, vl) -> ((HStock)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((HStock)et).getJanCd(), (et, vl) -> ((HStock)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((HStock)et).getStockTypeId(), (et, vl) -> ((HStock)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((HStock)et).getZoneId(), (et, vl) -> ((HStock)et).setZoneId(ctl(vl)), "zoneId");
        setupEpg(_epgMap, et -> ((HStock)et).getZoneCd(), (et, vl) -> ((HStock)et).setZoneCd((String)vl), "zoneCd");
        setupEpg(_epgMap, et -> ((HStock)et).getZoneNm(), (et, vl) -> ((HStock)et).setZoneNm((String)vl), "zoneNm");
        setupEpg(_epgMap, et -> ((HStock)et).getLocationId(), (et, vl) -> ((HStock)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((HStock)et).getLocationCd(), (et, vl) -> ((HStock)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((HStock)et).getLocationNm(), (et, vl) -> ((HStock)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((HStock)et).getDepositId(), (et, vl) -> ((HStock)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((HStock)et).getDepositCd(), (et, vl) -> ((HStock)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((HStock)et).getDepositNm(), (et, vl) -> ((HStock)et).setDepositNm((String)vl), "depositNm");
        setupEpg(_epgMap, et -> ((HStock)et).getDepositAbbr(), (et, vl) -> ((HStock)et).setDepositAbbr((String)vl), "depositAbbr");
        setupEpg(_epgMap, et -> ((HStock)et).getLotId(), (et, vl) -> ((HStock)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((HStock)et).getLot(), (et, vl) -> ((HStock)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((HStock)et).getLimitDt(), (et, vl) -> ((HStock)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((HStock)et).getShapeId(), (et, vl) -> ((HStock)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((HStock)et).getStoreNoId(), (et, vl) -> ((HStock)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((HStock)et).getStoreLabelNo(), (et, vl) -> ((HStock)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((HStock)et).getOldStoreNumId(), (et, vl) -> ((HStock)et).setOldStoreNumId(ctl(vl)), "oldStoreNumId");
        setupEpg(_epgMap, et -> ((HStock)et).getOldStoreLabelNo(), (et, vl) -> ((HStock)et).setOldStoreLabelNo((String)vl), "oldStoreLabelNo");
        setupEpg(_epgMap, et -> ((HStock)et).getSupplierId(), (et, vl) -> ((HStock)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((HStock)et).getSupplierCd(), (et, vl) -> ((HStock)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((HStock)et).getSupplierNm(), (et, vl) -> ((HStock)et).setSupplierNm((String)vl), "supplierNm");
        setupEpg(_epgMap, et -> ((HStock)et).getSupplierAbbr(), (et, vl) -> ((HStock)et).setSupplierAbbr((String)vl), "supplierAbbr");
        setupEpg(_epgMap, et -> ((HStock)et).getStoreDt(), (et, vl) -> ((HStock)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((HStock)et).getUnitNum(), (et, vl) -> ((HStock)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((HStock)et).getDelFlg(), (et, vl) -> ((HStock)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HStock)et).getVersionNo(), (et, vl) -> ((HStock)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HStock)et).getControlNo(), (et, vl) -> ((HStock)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HStock)et).getAddDt(), (et, vl) -> ((HStock)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HStock)et).getAddUser(), (et, vl) -> ((HStock)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HStock)et).getAddProcess(), (et, vl) -> ((HStock)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HStock)et).getUpdDt(), (et, vl) -> ((HStock)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HStock)et).getUpdUser(), (et, vl) -> ((HStock)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HStock)et).getUpdProcess(), (et, vl) -> ((HStock)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HStock)et).getMStockType(), (et, vl) -> ((HStock)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((HStock)et).getMShape(), (et, vl) -> ((HStock)et).setMShape((MShape)vl), "MShape");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_STOCK";
    protected final String _tableDispName = "H_STOCK";
    protected final String _tablePropertyName = "HStock";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_STOCK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "HInventoryBList,HMoveBList,HPackingBList,HReceiveBList,HStockInoutList,HStockReportList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("WAREHOUSE_NM", "WAREHOUSE_NM", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnZoneId = cci("ZONE_ID", "ZONE_ID", null, null, Long.class, "zoneId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneCd = cci("ZONE_CD", "ZONE_CD", null, null, String.class, "zoneCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneNm = cci("ZONE_NM", "ZONE_NM", null, null, String.class, "zoneNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositNm = cci("DEPOSIT_NM", "DEPOSIT_NM", null, null, String.class, "depositNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositAbbr = cci("DEPOSIT_ABBR", "DEPOSIT_ABBR", null, null, String.class, "depositAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOldStoreNumId = cci("OLD_STORE_NUM_ID", "OLD_STORE_NUM_ID", null, null, Long.class, "oldStoreNumId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOldStoreLabelNo = cci("OLD_STORE_LABEL_NO", "OLD_STORE_LABEL_NO", null, null, String.class, "oldStoreLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierNm = cci("SUPPLIER_NM", "SUPPLIER_NM", null, null, String.class, "supplierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierAbbr = cci("SUPPLIER_ABBR", "SUPPLIER_ABBR", null, null, String.class, "supplierAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
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
     * WAREHOUSE_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
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
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {IX, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * JAN_CD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * STOCK_TYPE_ID: {IX, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * ZONE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneId() { return _columnZoneId; }
    /**
     * ZONE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneCd() { return _columnZoneCd; }
    /**
     * ZONE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneNm() { return _columnZoneNm; }
    /**
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOCATION_CD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOCATION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * DEPOSIT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * DEPOSIT_CD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
    /**
     * DEPOSIT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositNm() { return _columnDepositNm; }
    /**
     * DEPOSIT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositAbbr() { return _columnDepositAbbr; }
    /**
     * LOT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * LOT: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMIT_DT: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * STORE_NO_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoId() { return _columnStoreNoId; }
    /**
     * STORE_LABEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * OLD_STORE_NUM_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOldStoreNumId() { return _columnOldStoreNumId; }
    /**
     * OLD_STORE_LABEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOldStoreLabelNo() { return _columnOldStoreLabelNo; }
    /**
     * SUPPLIER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierId() { return _columnSupplierId; }
    /**
     * SUPPLIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * SUPPLIER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierNm() { return _columnSupplierNm; }
    /**
     * SUPPLIER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierAbbr() { return _columnSupplierAbbr; }
    /**
     * STORE_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * UNIT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
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
        ls.add(columnStockId());
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnWarehouseId());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseNm());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnJanCd());
        ls.add(columnStockTypeId());
        ls.add(columnZoneId());
        ls.add(columnZoneCd());
        ls.add(columnZoneNm());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnDepositId());
        ls.add(columnDepositCd());
        ls.add(columnDepositNm());
        ls.add(columnDepositAbbr());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnShapeId());
        ls.add(columnStoreNoId());
        ls.add(columnStoreLabelNo());
        ls.add(columnOldStoreNumId());
        ls.add(columnOldStoreLabelNo());
        ls.add(columnSupplierId());
        ls.add(columnSupplierCd());
        ls.add(columnSupplierNm());
        ls.add(columnSupplierAbbr());
        ls.add(columnStoreDt());
        ls.add(columnUnitNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnStockId()); }
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
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("H_STOCK_FK2", "MStockType", this, MStockTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HStockList", false);
    }
    /**
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("H_STOCK_FK1", "MShape", this, MShapeDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "HStockList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * H_INVENTORY_B by STOCK_ID, named 'HInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HInventoryBDbm.getInstance().columnStockId());
        return cri("H_INVENTORY_B_FK1", "HInventoryBList", this, HInventoryBDbm.getInstance(), mp, false, "HStock");
    }
    /**
     * H_MOVE_B by STOCK_ID, named 'HMoveBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHMoveBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HMoveBDbm.getInstance().columnStockId());
        return cri("H_MOVE_B_FK1", "HMoveBList", this, HMoveBDbm.getInstance(), mp, false, "HStock");
    }
    /**
     * H_PACKING_B by STOCK_ID, named 'HPackingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHPackingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HPackingBDbm.getInstance().columnStockId());
        return cri("H_PACKING_B_FK1", "HPackingBList", this, HPackingBDbm.getInstance(), mp, false, "HStock");
    }
    /**
     * H_RECEIVE_B by STOCK_ID, named 'HReceiveBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHReceiveBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HReceiveBDbm.getInstance().columnStockId());
        return cri("H_RECEIVE_B_FK1", "HReceiveBList", this, HReceiveBDbm.getInstance(), mp, false, "HStock");
    }
    /**
     * H_STOCK_INOUT by STOCK_ID, named 'HStockInoutList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHStockInoutList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HStockInoutDbm.getInstance().columnStockId());
        return cri("H_STOCK_INOUT_FK1", "HStockInoutList", this, HStockInoutDbm.getInstance(), mp, false, "HStock");
    }
    /**
     * H_STOCK_REPORT by STOCK_ID, named 'HStockReportList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHStockReportList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HStockReportDbm.getInstance().columnStockId());
        return cri("H_STOCK_REPORT_FK1", "HStockReportList", this, HStockReportDbm.getInstance(), mp, false, "HStock");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HStock"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HStockCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HStockBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HStock> getEntityType() { return HStock.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HStock newEntity() { return new HStock(); }
    public HStock newMyEntity() { return new HStock(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HStock)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HStock)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
