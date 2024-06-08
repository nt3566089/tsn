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
 * The DB meta of T_TRIMALLOCSTOCK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocstockDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrimallocstockDbm _instance = new TTrimallocstockDbm();
    private TTrimallocstockDbm() {}
    public static TTrimallocstockDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getTrimallocstockId(), (et, vl) -> ((TTrimallocstock)et).setTrimallocstockId(ctl(vl)), "trimallocstockId");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getTrimallocHId(), (et, vl) -> ((TTrimallocstock)et).setTrimallocHId(ctl(vl)), "trimallocHId");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getStockId(), (et, vl) -> ((TTrimallocstock)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getAllocImpKey(), (et, vl) -> ((TTrimallocstock)et).setAllocImpKey(ctl(vl)), "allocImpKey");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getAlcImpStkgNo(), (et, vl) -> ((TTrimallocstock)et).setAlcImpStkgNo(ctl(vl)), "alcImpStkgNo");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getLocationCd(), (et, vl) -> ((TTrimallocstock)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getDesignFlg(), (et, vl) -> ((TTrimallocstock)et).setDesignFlg((String)vl), "designFlg");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getManufacturedate(), (et, vl) -> ((TTrimallocstock)et).setManufacturedate((String)vl), "manufacturedate");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getMonthFlg(), (et, vl) -> ((TTrimallocstock)et).setMonthFlg(ctl(vl)), "monthFlg");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getQty(), (et, vl) -> ((TTrimallocstock)et).setQty(ctl(vl)), "qty");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getDelFlg(), (et, vl) -> ((TTrimallocstock)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getVersionNo(), (et, vl) -> ((TTrimallocstock)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getControlNo(), (et, vl) -> ((TTrimallocstock)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getAddDt(), (et, vl) -> ((TTrimallocstock)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getAddUser(), (et, vl) -> ((TTrimallocstock)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getAddProcess(), (et, vl) -> ((TTrimallocstock)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getUpdDt(), (et, vl) -> ((TTrimallocstock)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getUpdUser(), (et, vl) -> ((TTrimallocstock)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrimallocstock)et).getUpdProcess(), (et, vl) -> ((TTrimallocstock)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrimallocstock)et).getTStock(), (et, vl) -> ((TTrimallocstock)et).setTStock((TStock)vl), "TStock");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRIMALLOCSTOCK";
    protected final String _tableDispName = "T_TRIMALLOCSTOCK";
    protected final String _tablePropertyName = "TTrimallocstock";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRIMALLOCSTOCK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrimallocstockId = cci("TRIMALLOCSTOCK_ID", "TRIMALLOCSTOCK_ID", null, null, Long.class, "trimallocstockId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TTrimallocadjustList", null, false);
    protected final ColumnInfo _columnTrimallocHId = cci("TRIMALLOC_H_ID", "TRIMALLOC_H_ID", null, null, Long.class, "trimallocHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnAllocImpKey = cci("ALLOC_IMP_KEY", "ALLOC_IMP_KEY", null, null, Long.class, "allocImpKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlcImpStkgNo = cci("ALC_IMP_STKG_NO", "ALC_IMP_STKG_NO", null, null, Long.class, "alcImpStkgNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignFlg = cci("DESIGN_FLG", "DESIGN_FLG", null, null, String.class, "designFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturedate = cci("MANUFACTUREDATE", "MANUFACTUREDATE", null, null, String.class, "manufacturedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonthFlg = cci("MONTH_FLG", "MONTH_FLG", null, null, Long.class, "monthFlg", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, Long.class, "qty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrimallocstockId() { return _columnTrimallocstockId; }
    /**
     * TRIMALLOC_H_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrimallocHId() { return _columnTrimallocHId; }
    /**
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocImpKey() { return _columnAllocImpKey; }
    /**
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlcImpStkgNo() { return _columnAlcImpStkgNo; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * DESIGN_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignFlg() { return _columnDesignFlg; }
    /**
     * MANUFACTUREDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturedate() { return _columnManufacturedate; }
    /**
     * MONTH_FLG: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMonthFlg() { return _columnMonthFlg; }
    /**
     * QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
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
        ls.add(columnTrimallocstockId());
        ls.add(columnTrimallocHId());
        ls.add(columnStockId());
        ls.add(columnAllocImpKey());
        ls.add(columnAlcImpStkgNo());
        ls.add(columnLocationCd());
        ls.add(columnDesignFlg());
        ls.add(columnManufacturedate());
        ls.add(columnMonthFlg());
        ls.add(columnQty());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrimallocstockId()); }
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
        return cfi("T_TRIMALLOCSTOCK_FK1", "TStock", this, TStockDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrimallocstockList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_TRIMALLOCADJUST by TRIMALLOCSTOCK_ID, named 'TTrimallocadjustList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrimallocadjustList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrimallocstockId(), TTrimallocadjustDbm.getInstance().columnTrimallocstockId());
        return cri("T_TRIMALLOCADJUST_FK1", "TTrimallocadjustList", this, TTrimallocadjustDbm.getInstance(), mp, false, "TTrimallocstock");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrimallocstock"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrimallocstockCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrimallocstockBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrimallocstock> getEntityType() { return TTrimallocstock.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrimallocstock newEntity() { return new TTrimallocstock(); }
    public TTrimallocstock newMyEntity() { return new TTrimallocstock(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrimallocstock)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrimallocstock)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
