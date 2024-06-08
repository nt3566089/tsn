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
 * The DB meta of H_STOCK_REPORT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HStockReportDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HStockReportDbm _instance = new HStockReportDbm();
    private HStockReportDbm() {}
    public static HStockReportDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HStockReport)et).getStockReportId(), (et, vl) -> ((HStockReport)et).setStockReportId(ctl(vl)), "stockReportId");
        setupEpg(_epgMap, et -> ((HStockReport)et).getHistDt(), (et, vl) -> ((HStockReport)et).setHistDt((String)vl), "histDt");
        setupEpg(_epgMap, et -> ((HStockReport)et).getStockId(), (et, vl) -> ((HStockReport)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((HStockReport)et).getChargeNum(), (et, vl) -> ((HStockReport)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAllocNum(), (et, vl) -> ((HStockReport)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMoveNum(), (et, vl) -> ((HStockReport)et).setMoveNum(ctb(vl)), "moveNum");
        setupEpg(_epgMap, et -> ((HStockReport)et).getTransitNum(), (et, vl) -> ((HStockReport)et).setTransitNum(ctb(vl)), "transitNum");
        setupEpg(_epgMap, et -> ((HStockReport)et).getStoreNumDay(), (et, vl) -> ((HStockReport)et).setStoreNumDay(ctb(vl)), "storeNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPickingNumDay(), (et, vl) -> ((HStockReport)et).setPickingNumDay(ctb(vl)), "pickingNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMovePlsNumDay(), (et, vl) -> ((HStockReport)et).setMovePlsNumDay(ctb(vl)), "movePlsNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMoveMnsNumDay(), (et, vl) -> ((HStockReport)et).setMoveMnsNumDay(ctb(vl)), "moveMnsNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAdjPlsNumDay(), (et, vl) -> ((HStockReport)et).setAdjPlsNumDay(ctb(vl)), "adjPlsNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAdjMnsNumDay(), (et, vl) -> ((HStockReport)et).setAdjMnsNumDay(ctb(vl)), "adjMnsNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPChargeNumDay(), (et, vl) -> ((HStockReport)et).setPChargeNumDay(ctb(vl)), "PChargeNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPAllocNumDay(), (et, vl) -> ((HStockReport)et).setPAllocNumDay(ctb(vl)), "PAllocNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPMoveNumDay(), (et, vl) -> ((HStockReport)et).setPMoveNumDay(ctb(vl)), "PMoveNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPTransitNumDay(), (et, vl) -> ((HStockReport)et).setPTransitNumDay(ctb(vl)), "PTransitNumDay");
        setupEpg(_epgMap, et -> ((HStockReport)et).getStoreNumMonth(), (et, vl) -> ((HStockReport)et).setStoreNumMonth(ctb(vl)), "storeNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPickingNumMonth(), (et, vl) -> ((HStockReport)et).setPickingNumMonth(ctb(vl)), "pickingNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMovePlsNumMonth(), (et, vl) -> ((HStockReport)et).setMovePlsNumMonth(ctb(vl)), "movePlsNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMoveMnsNumMonth(), (et, vl) -> ((HStockReport)et).setMoveMnsNumMonth(ctb(vl)), "moveMnsNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAdjPlsNumMonth(), (et, vl) -> ((HStockReport)et).setAdjPlsNumMonth(ctb(vl)), "adjPlsNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAdjMnsNumMonth(), (et, vl) -> ((HStockReport)et).setAdjMnsNumMonth(ctb(vl)), "adjMnsNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPChargeNumMonth(), (et, vl) -> ((HStockReport)et).setPChargeNumMonth(ctb(vl)), "PChargeNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPAllocNumMonth(), (et, vl) -> ((HStockReport)et).setPAllocNumMonth(ctb(vl)), "PAllocNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPMoveNumMonth(), (et, vl) -> ((HStockReport)et).setPMoveNumMonth(ctb(vl)), "PMoveNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getPTransitNumMonth(), (et, vl) -> ((HStockReport)et).setPTransitNumMonth(ctb(vl)), "PTransitNumMonth");
        setupEpg(_epgMap, et -> ((HStockReport)et).getChargeNum10(), (et, vl) -> ((HStockReport)et).setChargeNum10(ctb(vl)), "chargeNum10");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAllocNum10(), (et, vl) -> ((HStockReport)et).setAllocNum10(ctb(vl)), "allocNum10");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMoveNum10(), (et, vl) -> ((HStockReport)et).setMoveNum10(ctb(vl)), "moveNum10");
        setupEpg(_epgMap, et -> ((HStockReport)et).getTransitNum10(), (et, vl) -> ((HStockReport)et).setTransitNum10(ctb(vl)), "transitNum10");
        setupEpg(_epgMap, et -> ((HStockReport)et).getChargeNum15(), (et, vl) -> ((HStockReport)et).setChargeNum15(ctb(vl)), "chargeNum15");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAllocNum15(), (et, vl) -> ((HStockReport)et).setAllocNum15(ctb(vl)), "allocNum15");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMoveNum15(), (et, vl) -> ((HStockReport)et).setMoveNum15(ctb(vl)), "moveNum15");
        setupEpg(_epgMap, et -> ((HStockReport)et).getTransitNum15(), (et, vl) -> ((HStockReport)et).setTransitNum15(ctb(vl)), "transitNum15");
        setupEpg(_epgMap, et -> ((HStockReport)et).getChargeNum20(), (et, vl) -> ((HStockReport)et).setChargeNum20(ctb(vl)), "chargeNum20");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAllocNum20(), (et, vl) -> ((HStockReport)et).setAllocNum20(ctb(vl)), "allocNum20");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMoveNum20(), (et, vl) -> ((HStockReport)et).setMoveNum20(ctb(vl)), "moveNum20");
        setupEpg(_epgMap, et -> ((HStockReport)et).getTransitNum20(), (et, vl) -> ((HStockReport)et).setTransitNum20(ctb(vl)), "transitNum20");
        setupEpg(_epgMap, et -> ((HStockReport)et).getChargeNumLast(), (et, vl) -> ((HStockReport)et).setChargeNumLast(ctb(vl)), "chargeNumLast");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAllocNumLast(), (et, vl) -> ((HStockReport)et).setAllocNumLast(ctb(vl)), "allocNumLast");
        setupEpg(_epgMap, et -> ((HStockReport)et).getMoveNumLast(), (et, vl) -> ((HStockReport)et).setMoveNumLast(ctb(vl)), "moveNumLast");
        setupEpg(_epgMap, et -> ((HStockReport)et).getTransitNumLast(), (et, vl) -> ((HStockReport)et).setTransitNumLast(ctb(vl)), "transitNumLast");
        setupEpg(_epgMap, et -> ((HStockReport)et).getLastStoreDt(), (et, vl) -> ((HStockReport)et).setLastStoreDt((String)vl), "lastStoreDt");
        setupEpg(_epgMap, et -> ((HStockReport)et).getLastPickingDt(), (et, vl) -> ((HStockReport)et).setLastPickingDt((String)vl), "lastPickingDt");
        setupEpg(_epgMap, et -> ((HStockReport)et).getDelFlg(), (et, vl) -> ((HStockReport)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HStockReport)et).getVersionNo(), (et, vl) -> ((HStockReport)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HStockReport)et).getControlNo(), (et, vl) -> ((HStockReport)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAddDt(), (et, vl) -> ((HStockReport)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAddUser(), (et, vl) -> ((HStockReport)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HStockReport)et).getAddProcess(), (et, vl) -> ((HStockReport)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HStockReport)et).getUpdDt(), (et, vl) -> ((HStockReport)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HStockReport)et).getUpdUser(), (et, vl) -> ((HStockReport)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HStockReport)et).getUpdProcess(), (et, vl) -> ((HStockReport)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HStockReport)et).getHStock(), (et, vl) -> ((HStockReport)et).setHStock((HStock)vl), "HStock");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_STOCK_REPORT";
    protected final String _tableDispName = "H_STOCK_REPORT";
    protected final String _tablePropertyName = "HStockReport";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_STOCK_REPORT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockReportId = cci("STOCK_REPORT_ID", "STOCK_REPORT_ID", null, null, Long.class, "stockReportId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistDt = cci("HIST_DT", "HIST_DT", null, null, String.class, "histDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HStock", null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum = cci("MOVE_NUM", "MOVE_NUM", null, null, java.math.BigDecimal.class, "moveNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransitNum = cci("TRANSIT_NUM", "TRANSIT_NUM", null, null, java.math.BigDecimal.class, "transitNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
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
     * STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockReportId() { return _columnStockReportId; }
    /**
     * HIST_DT: {UQ+, IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistDt() { return _columnHistDt; }
    /**
     * STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
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
        ls.add(columnStockReportId());
        ls.add(columnHistDt());
        ls.add(columnStockId());
        ls.add(columnChargeNum());
        ls.add(columnAllocNum());
        ls.add(columnMoveNum());
        ls.add(columnTransitNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnStockReportId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnHistDt());
        ls.add(columnStockId());
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
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HStockDbm.getInstance().columnStockId());
        return cfi("H_STOCK_REPORT_FK1", "HStock", this, HStockDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HStockReportList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HStockReport"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HStockReportCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HStockReportBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HStockReport> getEntityType() { return HStockReport.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HStockReport newEntity() { return new HStockReport(); }
    public HStockReport newMyEntity() { return new HStockReport(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HStockReport)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HStockReport)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
