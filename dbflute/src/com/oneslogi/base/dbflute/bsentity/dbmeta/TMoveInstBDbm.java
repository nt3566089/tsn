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
 * The DB meta of T_MOVE_INST_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TMoveInstBDbm _instance = new TMoveInstBDbm();
    private TMoveInstBDbm() {}
    public static TMoveInstBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getMoveInstBId(), (et, vl) -> ((TMoveInstB)et).setMoveInstBId(ctl(vl)), "moveInstBId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getMoveInstHId(), (et, vl) -> ((TMoveInstB)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getMoveInstStatus(), (et, vl) -> ((TMoveInstB)et).setMoveInstStatus((String)vl), "moveInstStatus");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getInoutType(), (et, vl) -> ((TMoveInstB)et).setInoutType((String)vl), "inoutType");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getWarehouseId(), (et, vl) -> ((TMoveInstB)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getWarehouseCd(), (et, vl) -> ((TMoveInstB)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getProductId(), (et, vl) -> ((TMoveInstB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getProductCd(), (et, vl) -> ((TMoveInstB)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getStockTypeId(), (et, vl) -> ((TMoveInstB)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getStockTypeCd(), (et, vl) -> ((TMoveInstB)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLocationId(), (et, vl) -> ((TMoveInstB)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLocationCd(), (et, vl) -> ((TMoveInstB)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getDepositId(), (et, vl) -> ((TMoveInstB)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getDepositCd(), (et, vl) -> ((TMoveInstB)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLotId(), (et, vl) -> ((TMoveInstB)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLot(), (et, vl) -> ((TMoveInstB)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLimitDt(), (et, vl) -> ((TMoveInstB)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getStoreNoId(), (et, vl) -> ((TMoveInstB)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getStoreLabelNo(), (et, vl) -> ((TMoveInstB)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getStoreDt(), (et, vl) -> ((TMoveInstB)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getSupplierId(), (et, vl) -> ((TMoveInstB)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getSupplierCd(), (et, vl) -> ((TMoveInstB)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getShapeId(), (et, vl) -> ((TMoveInstB)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getShapeCd(), (et, vl) -> ((TMoveInstB)et).setShapeCd((String)vl), "shapeCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getUnitNum(), (et, vl) -> ((TMoveInstB)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getInstNum(), (et, vl) -> ((TMoveInstB)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLot1(), (et, vl) -> ((TMoveInstB)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLot2(), (et, vl) -> ((TMoveInstB)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLot3(), (et, vl) -> ((TMoveInstB)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getLot4(), (et, vl) -> ((TMoveInstB)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getDamageflg(), (et, vl) -> ((TMoveInstB)et).setDamageflg((String)vl), "damageflg");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getNoshippingflg(), (et, vl) -> ((TMoveInstB)et).setNoshippingflg((String)vl), "noshippingflg");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getForeigncargoflg(), (et, vl) -> ((TMoveInstB)et).setForeigncargoflg((String)vl), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getCustomsreleaseflg(), (et, vl) -> ((TMoveInstB)et).setCustomsreleaseflg((String)vl), "customsreleaseflg");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getTaxflg(), (et, vl) -> ((TMoveInstB)et).setTaxflg((String)vl), "taxflg");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getTranceportCd(), (et, vl) -> ((TMoveInstB)et).setTranceportCd((String)vl), "tranceportCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getSourceCd(), (et, vl) -> ((TMoveInstB)et).setSourceCd((String)vl), "sourceCd");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getSourceNm(), (et, vl) -> ((TMoveInstB)et).setSourceNm((String)vl), "sourceNm");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getSchDt(), (et, vl) -> ((TMoveInstB)et).setSchDt((String)vl), "schDt");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getDelFlg(), (et, vl) -> ((TMoveInstB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getVersionNo(), (et, vl) -> ((TMoveInstB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getControlNo(), (et, vl) -> ((TMoveInstB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getAddDt(), (et, vl) -> ((TMoveInstB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getAddUser(), (et, vl) -> ((TMoveInstB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getAddProcess(), (et, vl) -> ((TMoveInstB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getUpdDt(), (et, vl) -> ((TMoveInstB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getUpdUser(), (et, vl) -> ((TMoveInstB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TMoveInstB)et).getUpdProcess(), (et, vl) -> ((TMoveInstB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getMCustomerByDepositId(), (et, vl) -> ((TMoveInstB)et).setMCustomerByDepositId((MCustomer)vl), "MCustomerByDepositId");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getMLocation(), (et, vl) -> ((TMoveInstB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getTLot(), (et, vl) -> ((TMoveInstB)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getTMoveInstH(), (et, vl) -> ((TMoveInstB)et).setTMoveInstH((TMoveInstH)vl), "TMoveInstH");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getMProduct(), (et, vl) -> ((TMoveInstB)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getMShape(), (et, vl) -> ((TMoveInstB)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getMStockType(), (et, vl) -> ((TMoveInstB)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getTStoreNo(), (et, vl) -> ((TMoveInstB)et).setTStoreNo((TStoreNo)vl), "TStoreNo");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getMCustomerBySupplierId(), (et, vl) -> ((TMoveInstB)et).setMCustomerBySupplierId((MCustomer)vl), "MCustomerBySupplierId");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getMWarehouse(), (et, vl) -> ((TMoveInstB)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getBClassDtlByInoutType(), (et, vl) -> ((TMoveInstB)et).setBClassDtlByInoutType((BClassDtl)vl), "BClassDtlByInoutType");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getBClassDtlByMoveInstStatus(), (et, vl) -> ((TMoveInstB)et).setBClassDtlByMoveInstStatus((BClassDtl)vl), "BClassDtlByMoveInstStatus");
        setupEfpg(_efpgMap, et -> ((TMoveInstB)et).getTMoveInstBSubAsOne(), (et, vl) -> ((TMoveInstB)et).setTMoveInstBSubAsOne((TMoveInstBSub)vl), "TMoveInstBSubAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_MOVE_INST_B";
    protected final String _tableDispName = "T_MOVE_INST_B";
    protected final String _tablePropertyName = "TMoveInstB";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_MOVE_INST_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMoveInstBId = cci("MOVE_INST_B_ID", "MOVE_INST_B_ID", null, null, Long.class, "moveInstBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TMoveRecordBList", null, false);
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TMoveInstH", null, null, false);
    protected final ColumnInfo _columnMoveInstStatus = cci("MOVE_INST_STATUS", "MOVE_INST_STATUS", null, null, String.class, "moveInstStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByMoveInstStatus", null, CDef.DefMeta.MoveInstStatus, false);
    protected final ColumnInfo _columnInoutType = cci("INOUT_TYPE", "INOUT_TYPE", null, null, String.class, "inoutType", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByInoutType", null, CDef.DefMeta.InoutType, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerByDepositId", null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStoreNo", null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerBySupplierId", null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnShapeCd = cci("SHAPE_CD", "SHAPE_CD", null, null, String.class, "shapeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageflg = cci("DAMAGEFLG", "DAMAGEFLG", null, null, String.class, "damageflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshippingflg = cci("NOSHIPPINGFLG", "NOSHIPPINGFLG", null, null, String.class, "noshippingflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, String.class, "foreigncargoflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomsreleaseflg = cci("CUSTOMSRELEASEFLG", "CUSTOMSRELEASEFLG", null, null, String.class, "customsreleaseflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxflg = cci("TAXFLG", "TAXFLG", null, null, String.class, "taxflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTranceportCd = cci("TRANCEPORT_CD", "TRANCEPORT_CD", null, null, String.class, "tranceportCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceCd = cci("SOURCE_CD", "SOURCE_CD", null, null, String.class, "sourceCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceNm = cci("SOURCE_NM", "SOURCE_NM", null, null, String.class, "sourceNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchDt = cci("SCH_DT", "SCH_DT", null, null, String.class, "schDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstBId() { return _columnMoveInstBId; }
    /**
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstHId() { return _columnMoveInstHId; }
    /**
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstStatus() { return _columnMoveInstStatus; }
    /**
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutType() { return _columnInoutType; }
    /**
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {IX, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * DEPOSIT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
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
     * SHAPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeCd() { return _columnShapeCd; }
    /**
     * UNIT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * LOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * LOT3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * DAMAGEFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageflg() { return _columnDamageflg; }
    /**
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshippingflg() { return _columnNoshippingflg; }
    /**
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomsreleaseflg() { return _columnCustomsreleaseflg; }
    /**
     * TAXFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxflg() { return _columnTaxflg; }
    /**
     * TRANCEPORT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTranceportCd() { return _columnTranceportCd; }
    /**
     * SOURCE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCd() { return _columnSourceCd; }
    /**
     * SOURCE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceNm() { return _columnSourceNm; }
    /**
     * SCH_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchDt() { return _columnSchDt; }
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
        ls.add(columnMoveInstBId());
        ls.add(columnMoveInstHId());
        ls.add(columnMoveInstStatus());
        ls.add(columnInoutType());
        ls.add(columnWarehouseId());
        ls.add(columnWarehouseCd());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnStockTypeId());
        ls.add(columnStockTypeCd());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnDepositId());
        ls.add(columnDepositCd());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnStoreNoId());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnSupplierId());
        ls.add(columnSupplierCd());
        ls.add(columnShapeId());
        ls.add(columnShapeCd());
        ls.add(columnUnitNum());
        ls.add(columnInstNum());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnDamageflg());
        ls.add(columnNoshippingflg());
        ls.add(columnForeigncargoflg());
        ls.add(columnCustomsreleaseflg());
        ls.add(columnTaxflg());
        ls.add(columnTranceportCd());
        ls.add(columnSourceCd());
        ls.add(columnSourceNm());
        ls.add(columnSchDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnMoveInstBId()); }
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
        return cfi("T_MOVE_INST_B_FK9", "MCustomerByDepositId", this, MCustomerDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TMoveInstBByDepositIdList", false);
    }
    /**
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_MOVE_INST_B_FK8", "MLocation", this, MLocationDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TMoveInstBList", false);
    }
    /**
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("T_MOVE_INST_B_FK3", "TLot", this, TLotDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TMoveInstBList", false);
    }
    /**
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTMoveInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), TMoveInstHDbm.getInstance().columnMoveInstHId());
        return cfi("T_MOVE_INST_B_FK1", "TMoveInstH", this, TMoveInstHDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TMoveInstBList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_MOVE_INST_B_FK6", "MProduct", this, MProductDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TMoveInstBList", false);
    }
    /**
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("T_MOVE_INST_B_FK7", "MShape", this, MShapeDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TMoveInstBList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("T_MOVE_INST_B_FK10", "MStockType", this, MStockTypeDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TMoveInstBList", false);
    }
    /**
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreNo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStoreNoDbm.getInstance().columnStoreNoId());
        return cfi("T_MOVE_INST_B_FK5", "TStoreNo", this, TStoreNoDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "TMoveInstBList", false);
    }
    /**
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerBySupplierId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSupplierId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_MOVE_INST_B_FK4", "MCustomerBySupplierId", this, MCustomerDbm.getInstance(), mp, 8, null, false, false, false, false, null, null, false, "TMoveInstBBySupplierIdList", false);
    }
    /**
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("T_MOVE_INST_B_FK2", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 9, null, false, false, false, false, null, null, false, "TMoveInstBList", false);
    }
    /**
     * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInoutType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInoutType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_MOVE_INST_B_INOUT_TYPE", "BClassDtlByInoutType", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INOUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMoveInstStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_MOVE_INST_B_MOVE_INST_STATUS", "BClassDtlByMoveInstStatus", this, BClassDtlDbm.getInstance(), mp, 11, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MOVE_INST_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTMoveInstBSubAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstBId(), TMoveInstBSubDbm.getInstance().columnTMoveInstBSubId());
        return cfi("T_MOVE_INST_B_SUB_FK1", "TMoveInstBSubAsOne", this, TMoveInstBSubDbm.getInstance(), mp, 12, null, true, false, true, false, null, null, false, "TMoveInstB", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstBId(), TMoveRecordBDbm.getInstance().columnMoveInstBId());
        return cri("T_MOVE_RECORD_B_FK3", "TMoveRecordBList", this, TMoveRecordBDbm.getInstance(), mp, false, "TMoveInstB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TMoveInstB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TMoveInstBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TMoveInstB> getEntityType() { return TMoveInstB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TMoveInstB newEntity() { return new TMoveInstB(); }
    public TMoveInstB newMyEntity() { return new TMoveInstB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TMoveInstB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TMoveInstB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
