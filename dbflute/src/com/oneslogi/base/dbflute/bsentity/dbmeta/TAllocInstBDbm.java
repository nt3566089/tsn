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
 * The DB meta of T_ALLOC_INST_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TAllocInstBDbm _instance = new TAllocInstBDbm();
    private TAllocInstBDbm() {}
    public static TAllocInstBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getAllocInstBId(), (et, vl) -> ((TAllocInstB)et).setAllocInstBId(ctl(vl)), "allocInstBId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getAllocInstHId(), (et, vl) -> ((TAllocInstB)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getWarehouseId(), (et, vl) -> ((TAllocInstB)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getProductId(), (et, vl) -> ((TAllocInstB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getStockTypeId(), (et, vl) -> ((TAllocInstB)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getLocationId(), (et, vl) -> ((TAllocInstB)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getLocationCd(), (et, vl) -> ((TAllocInstB)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getDepositId(), (et, vl) -> ((TAllocInstB)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getLotId(), (et, vl) -> ((TAllocInstB)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getLot(), (et, vl) -> ((TAllocInstB)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getLimitDt(), (et, vl) -> ((TAllocInstB)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getStoreNoId(), (et, vl) -> ((TAllocInstB)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getStoreLabelNo(), (et, vl) -> ((TAllocInstB)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getShapeId(), (et, vl) -> ((TAllocInstB)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getShapeCd(), (et, vl) -> ((TAllocInstB)et).setShapeCd((String)vl), "shapeCd");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getLimitDtReverseFlg(), (et, vl) -> ((TAllocInstB)et).setLimitDtReverseFlg((String)vl), "limitDtReverseFlg");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getShippingLimitDt(), (et, vl) -> ((TAllocInstB)et).setShippingLimitDt((String)vl), "shippingLimitDt");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getLotManagFlg(), (et, vl) -> ((TAllocInstB)et).setLotManagFlg((String)vl), "lotManagFlg");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getLimitDtManagFlg(), (et, vl) -> ((TAllocInstB)et).setLimitDtManagFlg((String)vl), "limitDtManagFlg");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getUnitNum(), (et, vl) -> ((TAllocInstB)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getInstNum(), (et, vl) -> ((TAllocInstB)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getProcessNo(), (et, vl) -> ((TAllocInstB)et).setProcessNo((String)vl), "processNo");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getAllocNum(), (et, vl) -> ((TAllocInstB)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getDelFlg(), (et, vl) -> ((TAllocInstB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getVersionNo(), (et, vl) -> ((TAllocInstB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getControlNo(), (et, vl) -> ((TAllocInstB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getAddDt(), (et, vl) -> ((TAllocInstB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getAddUser(), (et, vl) -> ((TAllocInstB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getAddProcess(), (et, vl) -> ((TAllocInstB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getUpdDt(), (et, vl) -> ((TAllocInstB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getUpdUser(), (et, vl) -> ((TAllocInstB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TAllocInstB)et).getUpdProcess(), (et, vl) -> ((TAllocInstB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getTLot(), (et, vl) -> ((TAllocInstB)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getMWarehouse(), (et, vl) -> ((TAllocInstB)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getMCustomer(), (et, vl) -> ((TAllocInstB)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getMLocation(), (et, vl) -> ((TAllocInstB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getMProduct(), (et, vl) -> ((TAllocInstB)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getMShape(), (et, vl) -> ((TAllocInstB)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getTStoreNo(), (et, vl) -> ((TAllocInstB)et).setTStoreNo((TStoreNo)vl), "TStoreNo");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getMStockType(), (et, vl) -> ((TAllocInstB)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getTAllocInstH(), (et, vl) -> ((TAllocInstB)et).setTAllocInstH((TAllocInstH)vl), "TAllocInstH");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getBClassDtlByLimitDtManagFlg(), (et, vl) -> ((TAllocInstB)et).setBClassDtlByLimitDtManagFlg((BClassDtl)vl), "BClassDtlByLimitDtManagFlg");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getBClassDtlByLimitDtReverseFlg(), (et, vl) -> ((TAllocInstB)et).setBClassDtlByLimitDtReverseFlg((BClassDtl)vl), "BClassDtlByLimitDtReverseFlg");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getBClassDtlByLotManagFlg(), (et, vl) -> ((TAllocInstB)et).setBClassDtlByLotManagFlg((BClassDtl)vl), "BClassDtlByLotManagFlg");
        setupEfpg(_efpgMap, et -> ((TAllocInstB)et).getTAllocLotAsOne(), (et, vl) -> ((TAllocInstB)et).setTAllocLotAsOne((TAllocLot)vl), "TAllocLotAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_ALLOC_INST_B";
    protected final String _tableDispName = "T_ALLOC_INST_B";
    protected final String _tablePropertyName = "TAllocInstB";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_ALLOC_INST_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAllocInstBId = cci("ALLOC_INST_B_ID", "ALLOC_INST_B_ID", null, null, Long.class, "allocInstBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TPackingBList,TPickingBList,TShippingInstBList,TStockInoutList", null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TAllocInstH", null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStoreNo", null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnShapeCd = cci("SHAPE_CD", "SHAPE_CD", null, null, String.class, "shapeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDtReverseFlg = cci("LIMIT_DT_REVERSE_FLG", "LIMIT_DT_REVERSE_FLG", null, null, String.class, "limitDtReverseFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLimitDtReverseFlg", null, CDef.DefMeta.LimitDtReverseFlg, false);
    protected final ColumnInfo _columnShippingLimitDt = cci("SHIPPING_LIMIT_DT", "SHIPPING_LIMIT_DT", null, null, String.class, "shippingLimitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagFlg = cci("LOT_MANAG_FLG", "LOT_MANAG_FLG", null, null, String.class, "lotManagFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLotManagFlg", null, CDef.DefMeta.LotManagFlg, false);
    protected final ColumnInfo _columnLimitDtManagFlg = cci("LIMIT_DT_MANAG_FLG", "LIMIT_DT_MANAG_FLG", null, null, String.class, "limitDtManagFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLimitDtManagFlg", null, CDef.DefMeta.LimitDtManagFlg, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessNo = cci("PROCESS_NO", "PROCESS_NO", null, null, String.class, "processNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
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
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstBId() { return _columnAllocInstBId; }
    /**
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
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
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtReverseFlg() { return _columnLimitDtReverseFlg; }
    /**
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingLimitDt() { return _columnShippingLimitDt; }
    /**
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagFlg() { return _columnLotManagFlg; }
    /**
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtManagFlg() { return _columnLimitDtManagFlg; }
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
     * PROCESS_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessNo() { return _columnProcessNo; }
    /**
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }
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
        ls.add(columnAllocInstBId());
        ls.add(columnAllocInstHId());
        ls.add(columnWarehouseId());
        ls.add(columnProductId());
        ls.add(columnStockTypeId());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnDepositId());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnStoreNoId());
        ls.add(columnStoreLabelNo());
        ls.add(columnShapeId());
        ls.add(columnShapeCd());
        ls.add(columnLimitDtReverseFlg());
        ls.add(columnShippingLimitDt());
        ls.add(columnLotManagFlg());
        ls.add(columnLimitDtManagFlg());
        ls.add(columnUnitNum());
        ls.add(columnInstNum());
        ls.add(columnProcessNo());
        ls.add(columnAllocNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnAllocInstBId()); }
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
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("T_ALLOC_INST_B_FK8", "TLot", this, TLotDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("T_ALLOC_INST_B_FK9", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_ALLOC_INST_B_FK4", "MCustomer", this, MCustomerDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_ALLOC_INST_B_FK5", "MLocation", this, MLocationDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_ALLOC_INST_B_FK2", "MProduct", this, MProductDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("T_ALLOC_INST_B_FK6", "MShape", this, MShapeDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreNo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStoreNoDbm.getInstance().columnStoreNoId());
        return cfi("T_ALLOC_INST_B_FK7", "TStoreNo", this, TStoreNoDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("T_ALLOC_INST_B_FK3", "MStockType", this, MStockTypeDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTAllocInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstHId(), TAllocInstHDbm.getInstance().columnAllocInstHId());
        return cfi("T_ALLOC_INST_B_FK1", "TAllocInstH", this, TAllocInstHDbm.getInstance(), mp, 8, null, false, false, false, false, null, null, false, "TAllocInstBList", false);
    }
    /**
     * B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitDtManagFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitDtManagFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_ALLOC_INST_B_LIMIT_DT_MANAG_FLG", "BClassDtlByLimitDtManagFlg", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMIT_DT_MANAG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitDtReverseFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitDtReverseFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_ALLOC_INST_B_LIMIT_DT_REVERSE_FLG", "BClassDtlByLimitDtReverseFlg", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMIT_DT_REVERSE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLotManagFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotManagFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_ALLOC_INST_B_LOT_MANAG_FLG", "BClassDtlByLotManagFlg", this, BClassDtlDbm.getInstance(), mp, 11, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOT_MANAG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_ALLOC_LOT by ALLOC_INST_B_ID, named 'TAllocLotAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTAllocLotAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TAllocLotDbm.getInstance().columnAllocInstBId());
        return cfi("T_ALLOC_LOT_FK3", "TAllocLotAsOne", this, TAllocLotDbm.getInstance(), mp, 12, null, true, false, true, false, null, null, false, "TAllocInstB", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_PACKING_B by ALLOC_INST_B_ID, named 'TPackingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TPackingBDbm.getInstance().columnAllocInstBId());
        return cri("T_PACKING_B_FK1", "TPackingBList", this, TPackingBDbm.getInstance(), mp, false, "TAllocInstB");
    }
    /**
     * T_PICKING_B by ALLOC_INST_B_ID, named 'TPickingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TPickingBDbm.getInstance().columnAllocInstBId());
        return cri("T_PICKING_B_FK2", "TPickingBList", this, TPickingBDbm.getInstance(), mp, false, "TAllocInstB");
    }
    /**
     * T_SHIPPING_INST_B by ALLOC_INST_B_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TShippingInstBDbm.getInstance().columnAllocInstBId());
        return cri("T_SHIPPING_INST_B_FK4", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "TAllocInstB");
    }
    /**
     * T_STOCK_INOUT by ALLOC_INST_B_ID, named 'TStockInoutList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockInoutList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TStockInoutDbm.getInstance().columnAllocInstBId());
        return cri("T_STOCK_INOUT_FK5", "TStockInoutList", this, TStockInoutDbm.getInstance(), mp, false, "TAllocInstB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TAllocInstB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TAllocInstBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TAllocInstB> getEntityType() { return TAllocInstB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TAllocInstB newEntity() { return new TAllocInstB(); }
    public TAllocInstB newMyEntity() { return new TAllocInstB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TAllocInstB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TAllocInstB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
