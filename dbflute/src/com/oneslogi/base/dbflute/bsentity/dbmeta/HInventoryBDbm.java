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
 * The DB meta of H_INVENTORY_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HInventoryBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HInventoryBDbm _instance = new HInventoryBDbm();
    private HInventoryBDbm() {}
    public static HInventoryBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HInventoryB)et).getInventoryBId(), (et, vl) -> ((HInventoryB)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getInventoryHId(), (et, vl) -> ((HInventoryB)et).setInventoryHId(ctl(vl)), "inventoryHId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getStockId(), (et, vl) -> ((HInventoryB)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getWarehouseId(), (et, vl) -> ((HInventoryB)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getWarehouseCd(), (et, vl) -> ((HInventoryB)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getWarehouseNm(), (et, vl) -> ((HInventoryB)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getProductId(), (et, vl) -> ((HInventoryB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getProductCd(), (et, vl) -> ((HInventoryB)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getProductNm(), (et, vl) -> ((HInventoryB)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getStockTypeId(), (et, vl) -> ((HInventoryB)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getLocationId(), (et, vl) -> ((HInventoryB)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getLocationCd(), (et, vl) -> ((HInventoryB)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getLocationNm(), (et, vl) -> ((HInventoryB)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getDepositId(), (et, vl) -> ((HInventoryB)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getDepositCd(), (et, vl) -> ((HInventoryB)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getDepositNm(), (et, vl) -> ((HInventoryB)et).setDepositNm((String)vl), "depositNm");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getLotId(), (et, vl) -> ((HInventoryB)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getLot(), (et, vl) -> ((HInventoryB)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getLimitDt(), (et, vl) -> ((HInventoryB)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getShapeId(), (et, vl) -> ((HInventoryB)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getStoreNoId(), (et, vl) -> ((HInventoryB)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getStoreLabelNo(), (et, vl) -> ((HInventoryB)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getSupplierId(), (et, vl) -> ((HInventoryB)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getSupplierCd(), (et, vl) -> ((HInventoryB)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getSupplierNm(), (et, vl) -> ((HInventoryB)et).setSupplierNm((String)vl), "supplierNm");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getStoreDt(), (et, vl) -> ((HInventoryB)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getUnitNum(), (et, vl) -> ((HInventoryB)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getChargeNum(), (et, vl) -> ((HInventoryB)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getAllocNum(), (et, vl) -> ((HInventoryB)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getMoveNum(), (et, vl) -> ((HInventoryB)et).setMoveNum(ctb(vl)), "moveNum");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getInventoryNum(), (et, vl) -> ((HInventoryB)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getInputType(), (et, vl) -> ((HInventoryB)et).setInputType((String)vl), "inputType");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getStockAdjustFlg(), (et, vl) -> ((HInventoryB)et).setStockAdjustFlg((String)vl), "stockAdjustFlg");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getMoveInstHId(), (et, vl) -> ((HInventoryB)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getDelFlg(), (et, vl) -> ((HInventoryB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getVersionNo(), (et, vl) -> ((HInventoryB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getControlNo(), (et, vl) -> ((HInventoryB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getAddDt(), (et, vl) -> ((HInventoryB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getAddUser(), (et, vl) -> ((HInventoryB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getAddProcess(), (et, vl) -> ((HInventoryB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getUpdDt(), (et, vl) -> ((HInventoryB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getUpdUser(), (et, vl) -> ((HInventoryB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HInventoryB)et).getUpdProcess(), (et, vl) -> ((HInventoryB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HInventoryB)et).getHMoveH(), (et, vl) -> ((HInventoryB)et).setHMoveH((HMoveH)vl), "HMoveH");
        setupEfpg(_efpgMap, et -> ((HInventoryB)et).getHStock(), (et, vl) -> ((HInventoryB)et).setHStock((HStock)vl), "HStock");
        setupEfpg(_efpgMap, et -> ((HInventoryB)et).getMShape(), (et, vl) -> ((HInventoryB)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((HInventoryB)et).getHInventoryH(), (et, vl) -> ((HInventoryB)et).setHInventoryH((HInventoryH)vl), "HInventoryH");
        setupEfpg(_efpgMap, et -> ((HInventoryB)et).getMStockType(), (et, vl) -> ((HInventoryB)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((HInventoryB)et).getBClassDtlByInputType(), (et, vl) -> ((HInventoryB)et).setBClassDtlByInputType((BClassDtl)vl), "BClassDtlByInputType");
        setupEfpg(_efpgMap, et -> ((HInventoryB)et).getBClassDtlByStockAdjustFlg(), (et, vl) -> ((HInventoryB)et).setBClassDtlByStockAdjustFlg((BClassDtl)vl), "BClassDtlByStockAdjustFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_INVENTORY_B";
    protected final String _tableDispName = "H_INVENTORY_B";
    protected final String _tablePropertyName = "HInventoryB";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_INVENTORY_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryHId = cci("INVENTORY_H_ID", "INVENTORY_H_ID", null, null, Long.class, "inventoryHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HInventoryH", null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "HStock", null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("WAREHOUSE_NM", "WAREHOUSE_NM", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositNm = cci("DEPOSIT_NM", "DEPOSIT_NM", null, null, String.class, "depositNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierNm = cci("SUPPLIER_NM", "SUPPLIER_NM", null, null, String.class, "supplierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum = cci("MOVE_NUM", "MOVE_NUM", null, null, java.math.BigDecimal.class, "moveNum", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInputType = cci("INPUT_TYPE", "INPUT_TYPE", null, null, String.class, "inputType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByInputType", null, CDef.DefMeta.InputType, false);
    protected final ColumnInfo _columnStockAdjustFlg = cci("STOCK_ADJUST_FLG", "STOCK_ADJUST_FLG", null, null, String.class, "stockAdjustFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByStockAdjustFlg", null, CDef.DefMeta.StockMoveFlg, false);
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "HMoveH", null, null, false);
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
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to H_INVENTORY_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryHId() { return _columnInventoryHId; }
    /**
     * STOCK_ID: {IX, bigint(19), FK to H_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * WAREHOUSE_ID: {bigint(19)}
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
     * PRODUCT_ID: {bigint(19)}
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
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
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
     * DEPOSIT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * DEPOSIT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
    /**
     * DEPOSIT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositNm() { return _columnDepositNm; }
    /**
     * LOT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
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
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * STORE_NO_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoId() { return _columnStoreNoId; }
    /**
     * STORE_LABEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
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
     * CHARGE_NUM: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * ALLOC_NUM: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }
    /**
     * MOVE_NUM: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum() { return _columnMoveNum; }
    /**
     * INVENTORY_NUM: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputType() { return _columnInputType; }
    /**
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockAdjustFlg() { return _columnStockAdjustFlg; }
    /**
     * MOVE_INST_H_ID: {IX, bigint(19), FK to H_MOVE_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstHId() { return _columnMoveInstHId; }
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
        ls.add(columnInventoryBId());
        ls.add(columnInventoryHId());
        ls.add(columnStockId());
        ls.add(columnWarehouseId());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseNm());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnStockTypeId());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnDepositId());
        ls.add(columnDepositCd());
        ls.add(columnDepositNm());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnShapeId());
        ls.add(columnStoreNoId());
        ls.add(columnStoreLabelNo());
        ls.add(columnSupplierId());
        ls.add(columnSupplierCd());
        ls.add(columnSupplierNm());
        ls.add(columnStoreDt());
        ls.add(columnUnitNum());
        ls.add(columnChargeNum());
        ls.add(columnAllocNum());
        ls.add(columnMoveNum());
        ls.add(columnInventoryNum());
        ls.add(columnInputType());
        ls.add(columnStockAdjustFlg());
        ls.add(columnMoveInstHId());
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
    protected UniqueInfo cpui() { return hpcpui(columnInventoryBId()); }
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
     * H_MOVE_H by my MOVE_INST_H_ID, named 'HMoveH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHMoveH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), HMoveHDbm.getInstance().columnMoveInstHId());
        return cfi("H_INVENTORY_B_FK5", "HMoveH", this, HMoveHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HInventoryBList", false);
    }
    /**
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HStockDbm.getInstance().columnStockId());
        return cfi("H_INVENTORY_B_FK1", "HStock", this, HStockDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "HInventoryBList", false);
    }
    /**
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("H_INVENTORY_B_FK3", "MShape", this, MShapeDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "HInventoryBList", false);
    }
    /**
     * H_INVENTORY_H by my INVENTORY_H_ID, named 'HInventoryH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHInventoryH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryHId(), HInventoryHDbm.getInstance().columnInventoryHId());
        return cfi("H_INVENTORY_B_FK2", "HInventoryH", this, HInventoryHDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "HInventoryBList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("H_INVENTORY_B_FK4", "MStockType", this, MStockTypeDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "HInventoryBList", false);
    }
    /**
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInputType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInputType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_H_INVENTORY_B_INPUT_TYPE", "BClassDtlByInputType", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INPUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockAdjustFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockAdjustFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_H_INVENTORY_B_STOCK_ADJUST_FLG", "BClassDtlByStockAdjustFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_MOVE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HInventoryB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HInventoryBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HInventoryBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HInventoryB> getEntityType() { return HInventoryB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HInventoryB newEntity() { return new HInventoryB(); }
    public HInventoryB newMyEntity() { return new HInventoryB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HInventoryB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HInventoryB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
