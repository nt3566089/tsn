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
 * The DB meta of T_INVENTORY_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TInventoryBDbm _instance = new TInventoryBDbm();
    private TInventoryBDbm() {}
    public static TInventoryBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryBId(), (et, vl) -> ((TInventoryB)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryHId(), (et, vl) -> ((TInventoryB)et).setInventoryHId(ctl(vl)), "inventoryHId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStockId(), (et, vl) -> ((TInventoryB)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getWarehouseId(), (et, vl) -> ((TInventoryB)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getProductId(), (et, vl) -> ((TInventoryB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStockTypeId(), (et, vl) -> ((TInventoryB)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getLocationId(), (et, vl) -> ((TInventoryB)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getDepositId(), (et, vl) -> ((TInventoryB)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getLotId(), (et, vl) -> ((TInventoryB)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getLot(), (et, vl) -> ((TInventoryB)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getLimitDt(), (et, vl) -> ((TInventoryB)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStoreNoId(), (et, vl) -> ((TInventoryB)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStoreLabelNo(), (et, vl) -> ((TInventoryB)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStoreDt(), (et, vl) -> ((TInventoryB)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getSupplierId(), (et, vl) -> ((TInventoryB)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getSupplierCd(), (et, vl) -> ((TInventoryB)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getShapeId(), (et, vl) -> ((TInventoryB)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getUnitNum(), (et, vl) -> ((TInventoryB)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getChargeNum(), (et, vl) -> ((TInventoryB)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAllocNum(), (et, vl) -> ((TInventoryB)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getMoveNum(), (et, vl) -> ((TInventoryB)et).setMoveNum(ctb(vl)), "moveNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryNum(), (et, vl) -> ((TInventoryB)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInputType(), (et, vl) -> ((TInventoryB)et).setInputType((String)vl), "inputType");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStockAdjustFlg(), (et, vl) -> ((TInventoryB)et).setStockAdjustFlg((String)vl), "stockAdjustFlg");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getMoveInstHId(), (et, vl) -> ((TInventoryB)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getProductCd(), (et, vl) -> ((TInventoryB)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getFirmtransportCd(), (et, vl) -> ((TInventoryB)et).setFirmtransportCd((String)vl), "firmtransportCd");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getManufactureDt(), (et, vl) -> ((TInventoryB)et).setManufactureDt((String)vl), "manufactureDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getManufactureSymbol(), (et, vl) -> ((TInventoryB)et).setManufactureSymbol((String)vl), "manufactureSymbol");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getFcflg(), (et, vl) -> ((TInventoryB)et).setFcflg((String)vl), "fcflg");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getDiffqtyHenpin(), (et, vl) -> ((TInventoryB)et).setDiffqtyHenpin(ctl(vl)), "diffqtyHenpin");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getDiffqtyTaxrefond(), (et, vl) -> ((TInventoryB)et).setDiffqtyTaxrefond(ctl(vl)), "diffqtyTaxrefond");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getSuffererQty(), (et, vl) -> ((TInventoryB)et).setSuffererQty(ctl(vl)), "suffererQty");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getMonthStatussu(), (et, vl) -> ((TInventoryB)et).setMonthStatussu(ctl(vl)), "monthStatussu");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getBlukRecivedQty(), (et, vl) -> ((TInventoryB)et).setBlukRecivedQty(ctl(vl)), "blukRecivedQty");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getRefunditemQty(), (et, vl) -> ((TInventoryB)et).setRefunditemQty(ctl(vl)), "refunditemQty");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryInputFlg(), (et, vl) -> ((TInventoryB)et).setInventoryInputFlg((String)vl), "inventoryInputFlg");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getDelFlg(), (et, vl) -> ((TInventoryB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getVersionNo(), (et, vl) -> ((TInventoryB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getControlNo(), (et, vl) -> ((TInventoryB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAddDt(), (et, vl) -> ((TInventoryB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAddUser(), (et, vl) -> ((TInventoryB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAddProcess(), (et, vl) -> ((TInventoryB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getUpdDt(), (et, vl) -> ((TInventoryB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getUpdUser(), (et, vl) -> ((TInventoryB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getUpdProcess(), (et, vl) -> ((TInventoryB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMCustomerByDepositId(), (et, vl) -> ((TInventoryB)et).setMCustomerByDepositId((MCustomer)vl), "MCustomerByDepositId");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTInventoryH(), (et, vl) -> ((TInventoryB)et).setTInventoryH((TInventoryH)vl), "TInventoryH");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMStockType(), (et, vl) -> ((TInventoryB)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMLocation(), (et, vl) -> ((TInventoryB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMWarehouse(), (et, vl) -> ((TInventoryB)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTStoreNo(), (et, vl) -> ((TInventoryB)et).setTStoreNo((TStoreNo)vl), "TStoreNo");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMCustomerBySupplierId(), (et, vl) -> ((TInventoryB)et).setMCustomerBySupplierId((MCustomer)vl), "MCustomerBySupplierId");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTMoveInstH(), (et, vl) -> ((TInventoryB)et).setTMoveInstH((TMoveInstH)vl), "TMoveInstH");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTLot(), (et, vl) -> ((TInventoryB)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTStock(), (et, vl) -> ((TInventoryB)et).setTStock((TStock)vl), "TStock");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMShape(), (et, vl) -> ((TInventoryB)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMProduct(), (et, vl) -> ((TInventoryB)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getBClassDtlByInputType(), (et, vl) -> ((TInventoryB)et).setBClassDtlByInputType((BClassDtl)vl), "BClassDtlByInputType");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getBClassDtlByStockAdjustFlg(), (et, vl) -> ((TInventoryB)et).setBClassDtlByStockAdjustFlg((BClassDtl)vl), "BClassDtlByStockAdjustFlg");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTInventoryRAsOne(), (et, vl) -> ((TInventoryB)et).setTInventoryRAsOne((TInventoryR)vl), "TInventoryRAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_INVENTORY_B";
    protected final String _tableDispName = "T_INVENTORY_B";
    protected final String _tablePropertyName = "TInventoryB";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_INVENTORY_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TInventoryInpHistList", null, false);
    protected final ColumnInfo _columnInventoryHId = cci("INVENTORY_H_ID", "INVENTORY_H_ID", null, null, Long.class, "inventoryHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TInventoryH", null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerByDepositId", null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStoreNo", null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerBySupplierId", null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum = cci("MOVE_NUM", "MOVE_NUM", null, null, java.math.BigDecimal.class, "moveNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInputType = cci("INPUT_TYPE", "INPUT_TYPE", null, null, String.class, "inputType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByInputType", null, CDef.DefMeta.InputType, false);
    protected final ColumnInfo _columnStockAdjustFlg = cci("STOCK_ADJUST_FLG", "STOCK_ADJUST_FLG", null, null, String.class, "stockAdjustFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByStockAdjustFlg", null, CDef.DefMeta.StockMoveFlg, false);
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TMoveInstH", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmtransportCd = cci("FIRMTRANSPORT_CD", "FIRMTRANSPORT_CD", null, null, String.class, "firmtransportCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureDt = cci("MANUFACTURE_DT", "MANUFACTURE_DT", null, null, String.class, "manufactureDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureSymbol = cci("MANUFACTURE_SYMBOL", "MANUFACTURE_SYMBOL", null, null, String.class, "manufactureSymbol", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFcflg = cci("FCFLG", "FCFLG", null, null, String.class, "fcflg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffqtyHenpin = cci("DIFFQTY_HENPIN", "DIFFQTY_HENPIN", null, null, Long.class, "diffqtyHenpin", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffqtyTaxrefond = cci("DIFFQTY_TAXREFOND", "DIFFQTY_TAXREFOND", null, null, Long.class, "diffqtyTaxrefond", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuffererQty = cci("SUFFERER_QTY", "SUFFERER_QTY", null, null, Long.class, "suffererQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonthStatussu = cci("MONTH_STATUSSU", "MONTH_STATUSSU", null, null, Long.class, "monthStatussu", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlukRecivedQty = cci("BLUK_RECIVED_QTY", "BLUK_RECIVED_QTY", null, null, Long.class, "blukRecivedQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefunditemQty = cci("REFUNDITEM_QTY", "REFUNDITEM_QTY", null, null, Long.class, "refunditemQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryInputFlg = cci("INVENTORY_INPUT_FLG", "INVENTORY_INPUT_FLG", null, null, String.class, "inventoryInputFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryHId() { return _columnInventoryHId; }
    /**
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
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
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoId() { return _columnStoreNoId; }
    /**
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * STORE_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierId() { return _columnSupplierId; }
    /**
     * SUPPLIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * UNIT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }
    /**
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum() { return _columnMoveNum; }
    /**
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
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
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstHId() { return _columnMoveInstHId; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmtransportCd() { return _columnFirmtransportCd; }
    /**
     * MANUFACTURE_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureDt() { return _columnManufactureDt; }
    /**
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureSymbol() { return _columnManufactureSymbol; }
    /**
     * FCFLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFcflg() { return _columnFcflg; }
    /**
     * DIFFQTY_HENPIN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffqtyHenpin() { return _columnDiffqtyHenpin; }
    /**
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffqtyTaxrefond() { return _columnDiffqtyTaxrefond; }
    /**
     * SUFFERER_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuffererQty() { return _columnSuffererQty; }
    /**
     * MONTH_STATUSSU: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMonthStatussu() { return _columnMonthStatussu; }
    /**
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlukRecivedQty() { return _columnBlukRecivedQty; }
    /**
     * REFUNDITEM_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefunditemQty() { return _columnRefunditemQty; }
    /**
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInputFlg() { return _columnInventoryInputFlg; }
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
        ls.add(columnProductId());
        ls.add(columnStockTypeId());
        ls.add(columnLocationId());
        ls.add(columnDepositId());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnStoreNoId());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnSupplierId());
        ls.add(columnSupplierCd());
        ls.add(columnShapeId());
        ls.add(columnUnitNum());
        ls.add(columnChargeNum());
        ls.add(columnAllocNum());
        ls.add(columnMoveNum());
        ls.add(columnInventoryNum());
        ls.add(columnInputType());
        ls.add(columnStockAdjustFlg());
        ls.add(columnMoveInstHId());
        ls.add(columnProductCd());
        ls.add(columnFirmtransportCd());
        ls.add(columnManufactureDt());
        ls.add(columnManufactureSymbol());
        ls.add(columnFcflg());
        ls.add(columnDiffqtyHenpin());
        ls.add(columnDiffqtyTaxrefond());
        ls.add(columnSuffererQty());
        ls.add(columnMonthStatussu());
        ls.add(columnBlukRecivedQty());
        ls.add(columnRefunditemQty());
        ls.add(columnInventoryInputFlg());
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
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerByDepositId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_INVENTORY_B_FK12", "MCustomerByDepositId", this, MCustomerDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TInventoryBByDepositIdList", false);
    }
    /**
     * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTInventoryH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryHId(), TInventoryHDbm.getInstance().columnInventoryHId());
        return cfi("T_INVENTORY_B_FK1", "TInventoryH", this, TInventoryHDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("T_INVENTORY_B_FK10", "MStockType", this, MStockTypeDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_INVENTORY_B_FK9", "MLocation", this, MLocationDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("T_INVENTORY_B_FK4", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreNo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStoreNoDbm.getInstance().columnStoreNoId());
        return cfi("T_INVENTORY_B_FK2", "TStoreNo", this, TStoreNoDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerBySupplierId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSupplierId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_INVENTORY_B_FK8", "MCustomerBySupplierId", this, MCustomerDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TInventoryBBySupplierIdList", false);
    }
    /**
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTMoveInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), TMoveInstHDbm.getInstance().columnMoveInstHId());
        return cfi("T_INVENTORY_B_FK7", "TMoveInstH", this, TMoveInstHDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("T_INVENTORY_B_FK11", "TLot", this, TLotDbm.getInstance(), mp, 8, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockDbm.getInstance().columnStockId());
        return cfi("T_INVENTORY_B_FK6", "TStock", this, TStockDbm.getInstance(), mp, 9, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("T_INVENTORY_B_FK5", "MShape", this, MShapeDbm.getInstance(), mp, 10, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_INVENTORY_B_FK3", "MProduct", this, MProductDbm.getInstance(), mp, 11, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInputType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInputType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_INVENTORY_B_INPUT_TYPE", "BClassDtlByInputType", this, BClassDtlDbm.getInstance(), mp, 12, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INPUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockAdjustFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockAdjustFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_INVENTORY_B_STOCK_ADJUST_FLG", "BClassDtlByStockAdjustFlg", this, BClassDtlDbm.getInstance(), mp, 13, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_MOVE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTInventoryRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryBId(), TInventoryRDbm.getInstance().columnInventoryBId());
        return cfi("T_INVENTORY_R_FK1", "TInventoryRAsOne", this, TInventoryRDbm.getInstance(), mp, 14, null, true, false, true, false, null, null, false, "TInventoryB", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryInpHistList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryBId(), TInventoryInpHistDbm.getInstance().columnInventoryBId());
        return cri("T_INVENTORY_INP_HIST_FK1", "TInventoryInpHistList", this, TInventoryInpHistDbm.getInstance(), mp, false, "TInventoryB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TInventoryB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TInventoryBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TInventoryBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TInventoryB> getEntityType() { return TInventoryB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TInventoryB newEntity() { return new TInventoryB(); }
    public TInventoryB newMyEntity() { return new TInventoryB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TInventoryB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TInventoryB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
