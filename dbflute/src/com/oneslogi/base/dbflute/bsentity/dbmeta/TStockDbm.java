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
 * The DB meta of T_STOCK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStockDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStockDbm _instance = new TStockDbm();
    private TStockDbm() {}
    public static TStockDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TStock)et).getStockId(), (et, vl) -> ((TStock)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TStock)et).getClientId(), (et, vl) -> ((TStock)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TStock)et).getWarehouseId(), (et, vl) -> ((TStock)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((TStock)et).getProductId(), (et, vl) -> ((TStock)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TStock)et).getStockTypeId(), (et, vl) -> ((TStock)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TStock)et).getLocationId(), (et, vl) -> ((TStock)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TStock)et).getDepositId(), (et, vl) -> ((TStock)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TStock)et).getLotId(), (et, vl) -> ((TStock)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TStock)et).getShapeId(), (et, vl) -> ((TStock)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((TStock)et).getStoreNoId(), (et, vl) -> ((TStock)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((TStock)et).getUnitNum(), (et, vl) -> ((TStock)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((TStock)et).getChargeNum(), (et, vl) -> ((TStock)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((TStock)et).getAllocNum(), (et, vl) -> ((TStock)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((TStock)et).getMoveNum(), (et, vl) -> ((TStock)et).setMoveNum(ctb(vl)), "moveNum");
        setupEpg(_epgMap, et -> ((TStock)et).getTransitNum(), (et, vl) -> ((TStock)et).setTransitNum(ctb(vl)), "transitNum");
        setupEpg(_epgMap, et -> ((TStock)et).getCompanycd(), (et, vl) -> ((TStock)et).setCompanycd((String)vl), "companycd");
        setupEpg(_epgMap, et -> ((TStock)et).getLogicflg1(), (et, vl) -> ((TStock)et).setLogicflg1((String)vl), "logicflg1");
        setupEpg(_epgMap, et -> ((TStock)et).getLogicflg2(), (et, vl) -> ((TStock)et).setLogicflg2((String)vl), "logicflg2");
        setupEpg(_epgMap, et -> ((TStock)et).getLogicflg3(), (et, vl) -> ((TStock)et).setLogicflg3((String)vl), "logicflg3");
        setupEpg(_epgMap, et -> ((TStock)et).getTagcd(), (et, vl) -> ((TStock)et).setTagcd((String)vl), "tagcd");
        setupEpg(_epgMap, et -> ((TStock)et).getQty2avg(), (et, vl) -> ((TStock)et).setQty2avg(ctb(vl)), "qty2avg");
        setupEpg(_epgMap, et -> ((TStock)et).getQty3avg(), (et, vl) -> ((TStock)et).setQty3avg(ctb(vl)), "qty3avg");
        setupEpg(_epgMap, et -> ((TStock)et).getQty1instructed(), (et, vl) -> ((TStock)et).setQty1instructed(ctl(vl)), "qty1instructed");
        setupEpg(_epgMap, et -> ((TStock)et).getDelFlg(), (et, vl) -> ((TStock)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TStock)et).getVersionNo(), (et, vl) -> ((TStock)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TStock)et).getControlNo(), (et, vl) -> ((TStock)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TStock)et).getAddDt(), (et, vl) -> ((TStock)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TStock)et).getAddUser(), (et, vl) -> ((TStock)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TStock)et).getAddProcess(), (et, vl) -> ((TStock)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TStock)et).getUpdDt(), (et, vl) -> ((TStock)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TStock)et).getUpdUser(), (et, vl) -> ((TStock)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TStock)et).getUpdProcess(), (et, vl) -> ((TStock)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TStock)et).getMShape(), (et, vl) -> ((TStock)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((TStock)et).getTLot(), (et, vl) -> ((TStock)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((TStock)et).getMStockType(), (et, vl) -> ((TStock)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TStock)et).getMClient(), (et, vl) -> ((TStock)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TStock)et).getMProduct(), (et, vl) -> ((TStock)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TStock)et).getMWarehouse(), (et, vl) -> ((TStock)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((TStock)et).getMCustomer(), (et, vl) -> ((TStock)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((TStock)et).getTStoreNo(), (et, vl) -> ((TStock)et).setTStoreNo((TStoreNo)vl), "TStoreNo");
        setupEfpg(_efpgMap, et -> ((TStock)et).getMLocation(), (et, vl) -> ((TStock)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TStock)et).getTStockReportAsOne(), (et, vl) -> ((TStock)et).setTStockReportAsOne((TStockReport)vl), "TStockReportAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_STOCK";
    protected final String _tableDispName = "T_STOCK";
    protected final String _tablePropertyName = "TStock";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_STOCK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TInventoryBList,TPalletList,TPickingBList,TStockInoutList,TTrimallocstockList,TTrpickdetailList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TStoreNo", null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum = cci("MOVE_NUM", "MOVE_NUM", null, null, java.math.BigDecimal.class, "moveNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransitNum = cci("TRANSIT_NUM", "TRANSIT_NUM", null, null, java.math.BigDecimal.class, "transitNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanycd = cci("COMPANYCD", "COMPANYCD", null, null, String.class, "companycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg1 = cci("LOGICFLG1", "LOGICFLG1", null, null, String.class, "logicflg1", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg2 = cci("LOGICFLG2", "LOGICFLG2", null, null, String.class, "logicflg2", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg3 = cci("LOGICFLG3", "LOGICFLG3", null, null, String.class, "logicflg3", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagcd = cci("TAGCD", "TAGCD", null, null, String.class, "tagcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty2avg = cci("QTY2AVG", "QTY2AVG", null, null, java.math.BigDecimal.class, "qty2avg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty3avg = cci("QTY3AVG", "QTY3AVG", null, null, java.math.BigDecimal.class, "qty3avg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty1instructed = cci("QTY1INSTRUCTED", "QTY1INSTRUCTED", null, null, Long.class, "qty1instructed", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoId() { return _columnStoreNoId; }
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
     * TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransitNum() { return _columnTransitNum; }
    /**
     * COMPANYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanycd() { return _columnCompanycd; }
    /**
     * LOGICFLG1: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg1() { return _columnLogicflg1; }
    /**
     * LOGICFLG2: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg2() { return _columnLogicflg2; }
    /**
     * LOGICFLG3: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg3() { return _columnLogicflg3; }
    /**
     * TAGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagcd() { return _columnTagcd; }
    /**
     * QTY2AVG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty2avg() { return _columnQty2avg; }
    /**
     * QTY3AVG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty3avg() { return _columnQty3avg; }
    /**
     * QTY1INSTRUCTED: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty1instructed() { return _columnQty1instructed; }
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
        ls.add(columnWarehouseId());
        ls.add(columnProductId());
        ls.add(columnStockTypeId());
        ls.add(columnLocationId());
        ls.add(columnDepositId());
        ls.add(columnLotId());
        ls.add(columnShapeId());
        ls.add(columnStoreNoId());
        ls.add(columnUnitNum());
        ls.add(columnChargeNum());
        ls.add(columnAllocNum());
        ls.add(columnMoveNum());
        ls.add(columnTransitNum());
        ls.add(columnCompanycd());
        ls.add(columnLogicflg1());
        ls.add(columnLogicflg2());
        ls.add(columnLogicflg3());
        ls.add(columnTagcd());
        ls.add(columnQty2avg());
        ls.add(columnQty3avg());
        ls.add(columnQty1instructed());
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

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnStoreNoId());
        ls.add(columnLocationId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("T_STOCK_FK2", "MShape", this, MShapeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("T_STOCK_FK3", "TLot", this, TLotDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("T_STOCK_FK6", "MStockType", this, MStockTypeDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_STOCK_FK5", "MClient", this, MClientDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_STOCK_FK8", "MProduct", this, MProductDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("T_STOCK_FK4", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_STOCK_FK9", "MCustomer", this, MCustomerDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreNo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStoreNoDbm.getInstance().columnStoreNoId());
        return cfi("T_STOCK_FK1", "TStoreNo", this, TStoreNoDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_STOCK_FK7", "MLocation", this, MLocationDbm.getInstance(), mp, 8, null, false, false, false, false, null, null, false, "TStockList", false);
    }
    /**
     * T_STOCK_REPORT by STOCK_ID, named 'TStockReportAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTStockReportAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockReportDbm.getInstance().columnStockId());
        return cfi("T_STOCK_REPORT_FK1", "TStockReportAsOne", this, TStockReportDbm.getInstance(), mp, 9, null, true, false, true, false, null, null, false, "TStock", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_INVENTORY_B by STOCK_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TInventoryBDbm.getInstance().columnStockId());
        return cri("T_INVENTORY_B_FK6", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "TStock");
    }
    /**
     * T_PALLET by STOCK_ID, named 'TPalletList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPalletList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TPalletDbm.getInstance().columnStockId());
        return cri("T_PALLET_FK3", "TPalletList", this, TPalletDbm.getInstance(), mp, false, "TStock");
    }
    /**
     * T_PICKING_B by STOCK_ID, named 'TPickingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TPickingBDbm.getInstance().columnStockId());
        return cri("T_PICKING_B_FK3", "TPickingBList", this, TPickingBDbm.getInstance(), mp, false, "TStock");
    }
    /**
     * T_STOCK_INOUT by STOCK_ID, named 'TStockInoutList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockInoutList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockInoutDbm.getInstance().columnStockId());
        return cri("T_STOCK_INOUT_FK4", "TStockInoutList", this, TStockInoutDbm.getInstance(), mp, false, "TStock");
    }
    /**
     * T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrimallocstockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TTrimallocstockDbm.getInstance().columnStockId());
        return cri("T_TRIMALLOCSTOCK_FK1", "TTrimallocstockList", this, TTrimallocstockDbm.getInstance(), mp, false, "TStock");
    }
    /**
     * T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrpickdetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TTrpickdetailDbm.getInstance().columnStockId());
        return cri("T_TRPICKDETAIL_FK2", "TTrpickdetailList", this, TTrpickdetailDbm.getInstance(), mp, false, "TStock");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TStock"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TStockCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TStockBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStock> getEntityType() { return TStock.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TStock newEntity() { return new TStock(); }
    public TStock newMyEntity() { return new TStock(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TStock)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TStock)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
