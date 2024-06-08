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
 * The DB meta of T_TRIMALLOCADJUST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocadjustDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrimallocadjustDbm _instance = new TTrimallocadjustDbm();
    private TTrimallocadjustDbm() {}
    public static TTrimallocadjustDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getTrimallocadjustId(), (et, vl) -> ((TTrimallocadjust)et).setTrimallocadjustId(ctl(vl)), "trimallocadjustId");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getTrimallocstockId(), (et, vl) -> ((TTrimallocadjust)et).setTrimallocstockId(ctl(vl)), "trimallocstockId");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getTrimallocschId(), (et, vl) -> ((TTrimallocadjust)et).setTrimallocschId(ctl(vl)), "trimallocschId");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getAllocImpKey(), (et, vl) -> ((TTrimallocadjust)et).setAllocImpKey(ctl(vl)), "allocImpKey");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getAlcImpResgNo(), (et, vl) -> ((TTrimallocadjust)et).setAlcImpResgNo(ctl(vl)), "alcImpResgNo");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getAlcImpStkgNo(), (et, vl) -> ((TTrimallocadjust)et).setAlcImpStkgNo(ctl(vl)), "alcImpStkgNo");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getAdjustedQty(), (et, vl) -> ((TTrimallocadjust)et).setAdjustedQty(ctl(vl)), "adjustedQty");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getDelFlg(), (et, vl) -> ((TTrimallocadjust)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getVersionNo(), (et, vl) -> ((TTrimallocadjust)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getControlNo(), (et, vl) -> ((TTrimallocadjust)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getAddDt(), (et, vl) -> ((TTrimallocadjust)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getAddUser(), (et, vl) -> ((TTrimallocadjust)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getAddProcess(), (et, vl) -> ((TTrimallocadjust)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getUpdDt(), (et, vl) -> ((TTrimallocadjust)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getUpdUser(), (et, vl) -> ((TTrimallocadjust)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrimallocadjust)et).getUpdProcess(), (et, vl) -> ((TTrimallocadjust)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrimallocadjust)et).getTTrimallocstock(), (et, vl) -> ((TTrimallocadjust)et).setTTrimallocstock((TTrimallocstock)vl), "TTrimallocstock");
        setupEfpg(_efpgMap, et -> ((TTrimallocadjust)et).getTTrimallocschkri(), (et, vl) -> ((TTrimallocadjust)et).setTTrimallocschkri((TTrimallocschkri)vl), "TTrimallocschkri");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRIMALLOCADJUST";
    protected final String _tableDispName = "T_TRIMALLOCADJUST";
    protected final String _tablePropertyName = "TTrimallocadjust";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRIMALLOCADJUST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrimallocadjustId = cci("TRIMALLOCADJUST_ID", "TRIMALLOCADJUST_ID", null, null, Long.class, "trimallocadjustId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrimallocstockId = cci("TRIMALLOCSTOCK_ID", "TRIMALLOCSTOCK_ID", null, null, Long.class, "trimallocstockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TTrimallocstock", null, null, false);
    protected final ColumnInfo _columnTrimallocschId = cci("TRIMALLOCSCH_ID", "TRIMALLOCSCH_ID", null, null, Long.class, "trimallocschId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TTrimallocschkri", null, null, false);
    protected final ColumnInfo _columnAllocImpKey = cci("ALLOC_IMP_KEY", "ALLOC_IMP_KEY", null, null, Long.class, "allocImpKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlcImpResgNo = cci("ALC_IMP_RESG_NO", "ALC_IMP_RESG_NO", null, null, Long.class, "alcImpResgNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlcImpStkgNo = cci("ALC_IMP_STKG_NO", "ALC_IMP_STKG_NO", null, null, Long.class, "alcImpStkgNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedQty = cci("ADJUSTED_QTY", "ADJUSTED_QTY", null, null, Long.class, "adjustedQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrimallocadjustId() { return _columnTrimallocadjustId; }
    /**
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrimallocstockId() { return _columnTrimallocstockId; }
    /**
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrimallocschId() { return _columnTrimallocschId; }
    /**
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocImpKey() { return _columnAllocImpKey; }
    /**
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlcImpResgNo() { return _columnAlcImpResgNo; }
    /**
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlcImpStkgNo() { return _columnAlcImpStkgNo; }
    /**
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedQty() { return _columnAdjustedQty; }
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
        ls.add(columnTrimallocadjustId());
        ls.add(columnTrimallocstockId());
        ls.add(columnTrimallocschId());
        ls.add(columnAllocImpKey());
        ls.add(columnAlcImpResgNo());
        ls.add(columnAlcImpStkgNo());
        ls.add(columnAdjustedQty());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrimallocadjustId()); }
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
     * T_TRIMALLOCSTOCK by my TRIMALLOCSTOCK_ID, named 'TTrimallocstock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrimallocstock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrimallocstockId(), TTrimallocstockDbm.getInstance().columnTrimallocstockId());
        return cfi("T_TRIMALLOCADJUST_FK1", "TTrimallocstock", this, TTrimallocstockDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrimallocadjustList", false);
    }
    /**
     * T_TRIMALLOCSCHKRI by my TRIMALLOCSCH_ID, named 'TTrimallocschkri'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrimallocschkri() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrimallocschId(), TTrimallocschkriDbm.getInstance().columnTrimallocschId());
        return cfi("T_TRIMALLOCADJUST_FK2", "TTrimallocschkri", this, TTrimallocschkriDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrimallocadjustList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrimallocadjust"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrimallocadjustCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrimallocadjustBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrimallocadjust> getEntityType() { return TTrimallocadjust.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrimallocadjust newEntity() { return new TTrimallocadjust(); }
    public TTrimallocadjust newMyEntity() { return new TTrimallocadjust(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrimallocadjust)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrimallocadjust)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
