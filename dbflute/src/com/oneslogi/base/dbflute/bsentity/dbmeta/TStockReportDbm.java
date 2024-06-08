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
 * The DB meta of T_STOCK_REPORT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStockReportDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStockReportDbm _instance = new TStockReportDbm();
    private TStockReportDbm() {}
    public static TStockReportDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TStockReport)et).getStockId(), (et, vl) -> ((TStockReport)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TStockReport)et).getStoreNumDay(), (et, vl) -> ((TStockReport)et).setStoreNumDay(ctb(vl)), "storeNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPickingNumDay(), (et, vl) -> ((TStockReport)et).setPickingNumDay(ctb(vl)), "pickingNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getMovePlsNumDay(), (et, vl) -> ((TStockReport)et).setMovePlsNumDay(ctb(vl)), "movePlsNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getMoveMnsNumDay(), (et, vl) -> ((TStockReport)et).setMoveMnsNumDay(ctb(vl)), "moveMnsNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAdjPlsNumDay(), (et, vl) -> ((TStockReport)et).setAdjPlsNumDay(ctb(vl)), "adjPlsNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAdjMnsNumDay(), (et, vl) -> ((TStockReport)et).setAdjMnsNumDay(ctb(vl)), "adjMnsNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPChargeNumDay(), (et, vl) -> ((TStockReport)et).setPChargeNumDay(ctb(vl)), "PChargeNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPAllocNumDay(), (et, vl) -> ((TStockReport)et).setPAllocNumDay(ctb(vl)), "PAllocNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPMoveNumDay(), (et, vl) -> ((TStockReport)et).setPMoveNumDay(ctb(vl)), "PMoveNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPTransitNumDay(), (et, vl) -> ((TStockReport)et).setPTransitNumDay(ctb(vl)), "PTransitNumDay");
        setupEpg(_epgMap, et -> ((TStockReport)et).getStoreNumMonth(), (et, vl) -> ((TStockReport)et).setStoreNumMonth(ctb(vl)), "storeNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPickingNumMonth(), (et, vl) -> ((TStockReport)et).setPickingNumMonth(ctb(vl)), "pickingNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getMovePlsNumMonth(), (et, vl) -> ((TStockReport)et).setMovePlsNumMonth(ctb(vl)), "movePlsNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getMoveMnsNumMonth(), (et, vl) -> ((TStockReport)et).setMoveMnsNumMonth(ctb(vl)), "moveMnsNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAdjPlsNumMonth(), (et, vl) -> ((TStockReport)et).setAdjPlsNumMonth(ctb(vl)), "adjPlsNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAdjMnsNumMonth(), (et, vl) -> ((TStockReport)et).setAdjMnsNumMonth(ctb(vl)), "adjMnsNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPChargeNumMonth(), (et, vl) -> ((TStockReport)et).setPChargeNumMonth(ctb(vl)), "PChargeNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPAllocNumMonth(), (et, vl) -> ((TStockReport)et).setPAllocNumMonth(ctb(vl)), "PAllocNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPMoveNumMonth(), (et, vl) -> ((TStockReport)et).setPMoveNumMonth(ctb(vl)), "PMoveNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getPTransitNumMonth(), (et, vl) -> ((TStockReport)et).setPTransitNumMonth(ctb(vl)), "PTransitNumMonth");
        setupEpg(_epgMap, et -> ((TStockReport)et).getChargeNum10(), (et, vl) -> ((TStockReport)et).setChargeNum10(ctb(vl)), "chargeNum10");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAllocNum10(), (et, vl) -> ((TStockReport)et).setAllocNum10(ctb(vl)), "allocNum10");
        setupEpg(_epgMap, et -> ((TStockReport)et).getMoveNum10(), (et, vl) -> ((TStockReport)et).setMoveNum10(ctb(vl)), "moveNum10");
        setupEpg(_epgMap, et -> ((TStockReport)et).getTransitNum10(), (et, vl) -> ((TStockReport)et).setTransitNum10(ctb(vl)), "transitNum10");
        setupEpg(_epgMap, et -> ((TStockReport)et).getChargeNum15(), (et, vl) -> ((TStockReport)et).setChargeNum15(ctb(vl)), "chargeNum15");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAllocNum15(), (et, vl) -> ((TStockReport)et).setAllocNum15(ctb(vl)), "allocNum15");
        setupEpg(_epgMap, et -> ((TStockReport)et).getMoveNum15(), (et, vl) -> ((TStockReport)et).setMoveNum15(ctb(vl)), "moveNum15");
        setupEpg(_epgMap, et -> ((TStockReport)et).getTransitNum15(), (et, vl) -> ((TStockReport)et).setTransitNum15(ctb(vl)), "transitNum15");
        setupEpg(_epgMap, et -> ((TStockReport)et).getChargeNum20(), (et, vl) -> ((TStockReport)et).setChargeNum20(ctb(vl)), "chargeNum20");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAllocNum20(), (et, vl) -> ((TStockReport)et).setAllocNum20(ctb(vl)), "allocNum20");
        setupEpg(_epgMap, et -> ((TStockReport)et).getMoveNum20(), (et, vl) -> ((TStockReport)et).setMoveNum20(ctb(vl)), "moveNum20");
        setupEpg(_epgMap, et -> ((TStockReport)et).getTransitNum20(), (et, vl) -> ((TStockReport)et).setTransitNum20(ctb(vl)), "transitNum20");
        setupEpg(_epgMap, et -> ((TStockReport)et).getChargeNumLast(), (et, vl) -> ((TStockReport)et).setChargeNumLast(ctb(vl)), "chargeNumLast");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAllocNumLast(), (et, vl) -> ((TStockReport)et).setAllocNumLast(ctb(vl)), "allocNumLast");
        setupEpg(_epgMap, et -> ((TStockReport)et).getMoveNumLast(), (et, vl) -> ((TStockReport)et).setMoveNumLast(ctb(vl)), "moveNumLast");
        setupEpg(_epgMap, et -> ((TStockReport)et).getTransitNumLast(), (et, vl) -> ((TStockReport)et).setTransitNumLast(ctb(vl)), "transitNumLast");
        setupEpg(_epgMap, et -> ((TStockReport)et).getLastStoreDt(), (et, vl) -> ((TStockReport)et).setLastStoreDt((String)vl), "lastStoreDt");
        setupEpg(_epgMap, et -> ((TStockReport)et).getLastPickingDt(), (et, vl) -> ((TStockReport)et).setLastPickingDt((String)vl), "lastPickingDt");
        setupEpg(_epgMap, et -> ((TStockReport)et).getLastreceivedate(), (et, vl) -> ((TStockReport)et).setLastreceivedate((String)vl), "lastreceivedate");
        setupEpg(_epgMap, et -> ((TStockReport)et).getLastshipdate(), (et, vl) -> ((TStockReport)et).setLastshipdate((String)vl), "lastshipdate");
        setupEpg(_epgMap, et -> ((TStockReport)et).getDelFlg(), (et, vl) -> ((TStockReport)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TStockReport)et).getVersionNo(), (et, vl) -> ((TStockReport)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TStockReport)et).getControlNo(), (et, vl) -> ((TStockReport)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAddDt(), (et, vl) -> ((TStockReport)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAddUser(), (et, vl) -> ((TStockReport)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TStockReport)et).getAddProcess(), (et, vl) -> ((TStockReport)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TStockReport)et).getUpdDt(), (et, vl) -> ((TStockReport)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TStockReport)et).getUpdUser(), (et, vl) -> ((TStockReport)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TStockReport)et).getUpdProcess(), (et, vl) -> ((TStockReport)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TStockReport)et).getTStock(), (et, vl) -> ((TStockReport)et).setTStock((TStock)vl), "TStock");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_STOCK_REPORT";
    protected final String _tableDispName = "T_STOCK_REPORT";
    protected final String _tablePropertyName = "TStockReport";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_STOCK_REPORT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnStoreNumDay = cci("STORE_NUM_DAY", "STORE_NUM_DAY", null, null, java.math.BigDecimal.class, "storeNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingNumDay = cci("PICKING_NUM_DAY", "PICKING_NUM_DAY", null, null, java.math.BigDecimal.class, "pickingNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMovePlsNumDay = cci("MOVE_PLS_NUM_DAY", "MOVE_PLS_NUM_DAY", null, null, java.math.BigDecimal.class, "movePlsNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveMnsNumDay = cci("MOVE_MNS_NUM_DAY", "MOVE_MNS_NUM_DAY", null, null, java.math.BigDecimal.class, "moveMnsNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjPlsNumDay = cci("ADJ_PLS_NUM_DAY", "ADJ_PLS_NUM_DAY", null, null, java.math.BigDecimal.class, "adjPlsNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjMnsNumDay = cci("ADJ_MNS_NUM_DAY", "ADJ_MNS_NUM_DAY", null, null, java.math.BigDecimal.class, "adjMnsNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPChargeNumDay = cci("P_CHARGE_NUM_DAY", "P_CHARGE_NUM_DAY", null, null, java.math.BigDecimal.class, "PChargeNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPAllocNumDay = cci("P_ALLOC_NUM_DAY", "P_ALLOC_NUM_DAY", null, null, java.math.BigDecimal.class, "PAllocNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPMoveNumDay = cci("P_MOVE_NUM_DAY", "P_MOVE_NUM_DAY", null, null, java.math.BigDecimal.class, "PMoveNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPTransitNumDay = cci("P_TRANSIT_NUM_DAY", "P_TRANSIT_NUM_DAY", null, null, java.math.BigDecimal.class, "PTransitNumDay", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNumMonth = cci("STORE_NUM_MONTH", "STORE_NUM_MONTH", null, null, java.math.BigDecimal.class, "storeNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingNumMonth = cci("PICKING_NUM_MONTH", "PICKING_NUM_MONTH", null, null, java.math.BigDecimal.class, "pickingNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMovePlsNumMonth = cci("MOVE_PLS_NUM_MONTH", "MOVE_PLS_NUM_MONTH", null, null, java.math.BigDecimal.class, "movePlsNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveMnsNumMonth = cci("MOVE_MNS_NUM_MONTH", "MOVE_MNS_NUM_MONTH", null, null, java.math.BigDecimal.class, "moveMnsNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjPlsNumMonth = cci("ADJ_PLS_NUM_MONTH", "ADJ_PLS_NUM_MONTH", null, null, java.math.BigDecimal.class, "adjPlsNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjMnsNumMonth = cci("ADJ_MNS_NUM_MONTH", "ADJ_MNS_NUM_MONTH", null, null, java.math.BigDecimal.class, "adjMnsNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPChargeNumMonth = cci("P_CHARGE_NUM_MONTH", "P_CHARGE_NUM_MONTH", null, null, java.math.BigDecimal.class, "PChargeNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPAllocNumMonth = cci("P_ALLOC_NUM_MONTH", "P_ALLOC_NUM_MONTH", null, null, java.math.BigDecimal.class, "PAllocNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPMoveNumMonth = cci("P_MOVE_NUM_MONTH", "P_MOVE_NUM_MONTH", null, null, java.math.BigDecimal.class, "PMoveNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPTransitNumMonth = cci("P_TRANSIT_NUM_MONTH", "P_TRANSIT_NUM_MONTH", null, null, java.math.BigDecimal.class, "PTransitNumMonth", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum10 = cci("CHARGE_NUM_10", "CHARGE_NUM_10", null, null, java.math.BigDecimal.class, "chargeNum10", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum10 = cci("ALLOC_NUM_10", "ALLOC_NUM_10", null, null, java.math.BigDecimal.class, "allocNum10", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum10 = cci("MOVE_NUM_10", "MOVE_NUM_10", null, null, java.math.BigDecimal.class, "moveNum10", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransitNum10 = cci("TRANSIT_NUM_10", "TRANSIT_NUM_10", null, null, java.math.BigDecimal.class, "transitNum10", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum15 = cci("CHARGE_NUM_15", "CHARGE_NUM_15", null, null, java.math.BigDecimal.class, "chargeNum15", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum15 = cci("ALLOC_NUM_15", "ALLOC_NUM_15", null, null, java.math.BigDecimal.class, "allocNum15", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum15 = cci("MOVE_NUM_15", "MOVE_NUM_15", null, null, java.math.BigDecimal.class, "moveNum15", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransitNum15 = cci("TRANSIT_NUM_15", "TRANSIT_NUM_15", null, null, java.math.BigDecimal.class, "transitNum15", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum20 = cci("CHARGE_NUM_20", "CHARGE_NUM_20", null, null, java.math.BigDecimal.class, "chargeNum20", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum20 = cci("ALLOC_NUM_20", "ALLOC_NUM_20", null, null, java.math.BigDecimal.class, "allocNum20", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum20 = cci("MOVE_NUM_20", "MOVE_NUM_20", null, null, java.math.BigDecimal.class, "moveNum20", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransitNum20 = cci("TRANSIT_NUM_20", "TRANSIT_NUM_20", null, null, java.math.BigDecimal.class, "transitNum20", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNumLast = cci("CHARGE_NUM_LAST", "CHARGE_NUM_LAST", null, null, java.math.BigDecimal.class, "chargeNumLast", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNumLast = cci("ALLOC_NUM_LAST", "ALLOC_NUM_LAST", null, null, java.math.BigDecimal.class, "allocNumLast", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNumLast = cci("MOVE_NUM_LAST", "MOVE_NUM_LAST", null, null, java.math.BigDecimal.class, "moveNumLast", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransitNumLast = cci("TRANSIT_NUM_LAST", "TRANSIT_NUM_LAST", null, null, java.math.BigDecimal.class, "transitNumLast", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastStoreDt = cci("LAST_STORE_DT", "LAST_STORE_DT", null, null, String.class, "lastStoreDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastPickingDt = cci("LAST_PICKING_DT", "LAST_PICKING_DT", null, null, String.class, "lastPickingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastreceivedate = cci("LASTRECEIVEDATE", "LASTRECEIVEDATE", null, null, String.class, "lastreceivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastshipdate = cci("LASTSHIPDATE", "LASTSHIPDATE", null, null, String.class, "lastshipdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNumDay() { return _columnStoreNumDay; }
    /**
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNumDay() { return _columnPickingNumDay; }
    /**
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMovePlsNumDay() { return _columnMovePlsNumDay; }
    /**
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveMnsNumDay() { return _columnMoveMnsNumDay; }
    /**
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjPlsNumDay() { return _columnAdjPlsNumDay; }
    /**
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjMnsNumDay() { return _columnAdjMnsNumDay; }
    /**
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPChargeNumDay() { return _columnPChargeNumDay; }
    /**
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPAllocNumDay() { return _columnPAllocNumDay; }
    /**
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPMoveNumDay() { return _columnPMoveNumDay; }
    /**
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPTransitNumDay() { return _columnPTransitNumDay; }
    /**
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNumMonth() { return _columnStoreNumMonth; }
    /**
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNumMonth() { return _columnPickingNumMonth; }
    /**
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMovePlsNumMonth() { return _columnMovePlsNumMonth; }
    /**
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveMnsNumMonth() { return _columnMoveMnsNumMonth; }
    /**
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjPlsNumMonth() { return _columnAdjPlsNumMonth; }
    /**
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjMnsNumMonth() { return _columnAdjMnsNumMonth; }
    /**
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPChargeNumMonth() { return _columnPChargeNumMonth; }
    /**
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPAllocNumMonth() { return _columnPAllocNumMonth; }
    /**
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPMoveNumMonth() { return _columnPMoveNumMonth; }
    /**
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPTransitNumMonth() { return _columnPTransitNumMonth; }
    /**
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum10() { return _columnChargeNum10; }
    /**
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum10() { return _columnAllocNum10; }
    /**
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum10() { return _columnMoveNum10; }
    /**
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransitNum10() { return _columnTransitNum10; }
    /**
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum15() { return _columnChargeNum15; }
    /**
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum15() { return _columnAllocNum15; }
    /**
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum15() { return _columnMoveNum15; }
    /**
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransitNum15() { return _columnTransitNum15; }
    /**
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum20() { return _columnChargeNum20; }
    /**
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum20() { return _columnAllocNum20; }
    /**
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum20() { return _columnMoveNum20; }
    /**
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransitNum20() { return _columnTransitNum20; }
    /**
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNumLast() { return _columnChargeNumLast; }
    /**
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNumLast() { return _columnAllocNumLast; }
    /**
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNumLast() { return _columnMoveNumLast; }
    /**
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransitNumLast() { return _columnTransitNumLast; }
    /**
     * LAST_STORE_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastStoreDt() { return _columnLastStoreDt; }
    /**
     * LAST_PICKING_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastPickingDt() { return _columnLastPickingDt; }
    /**
     * LASTRECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastreceivedate() { return _columnLastreceivedate; }
    /**
     * LASTSHIPDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastshipdate() { return _columnLastshipdate; }
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
        ls.add(columnStoreNumDay());
        ls.add(columnPickingNumDay());
        ls.add(columnMovePlsNumDay());
        ls.add(columnMoveMnsNumDay());
        ls.add(columnAdjPlsNumDay());
        ls.add(columnAdjMnsNumDay());
        ls.add(columnPChargeNumDay());
        ls.add(columnPAllocNumDay());
        ls.add(columnPMoveNumDay());
        ls.add(columnPTransitNumDay());
        ls.add(columnStoreNumMonth());
        ls.add(columnPickingNumMonth());
        ls.add(columnMovePlsNumMonth());
        ls.add(columnMoveMnsNumMonth());
        ls.add(columnAdjPlsNumMonth());
        ls.add(columnAdjMnsNumMonth());
        ls.add(columnPChargeNumMonth());
        ls.add(columnPAllocNumMonth());
        ls.add(columnPMoveNumMonth());
        ls.add(columnPTransitNumMonth());
        ls.add(columnChargeNum10());
        ls.add(columnAllocNum10());
        ls.add(columnMoveNum10());
        ls.add(columnTransitNum10());
        ls.add(columnChargeNum15());
        ls.add(columnAllocNum15());
        ls.add(columnMoveNum15());
        ls.add(columnTransitNum15());
        ls.add(columnChargeNum20());
        ls.add(columnAllocNum20());
        ls.add(columnMoveNum20());
        ls.add(columnTransitNum20());
        ls.add(columnChargeNumLast());
        ls.add(columnAllocNumLast());
        ls.add(columnMoveNumLast());
        ls.add(columnTransitNumLast());
        ls.add(columnLastStoreDt());
        ls.add(columnLastPickingDt());
        ls.add(columnLastreceivedate());
        ls.add(columnLastshipdate());
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
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockDbm.getInstance().columnStockId());
        return cfi("T_STOCK_REPORT_FK1", "TStock", this, TStockDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "TStockReportAsOne", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TStockReport"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TStockReportCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TStockReportBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStockReport> getEntityType() { return TStockReport.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TStockReport newEntity() { return new TStockReport(); }
    public TStockReport newMyEntity() { return new TStockReport(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TStockReport)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TStockReport)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
