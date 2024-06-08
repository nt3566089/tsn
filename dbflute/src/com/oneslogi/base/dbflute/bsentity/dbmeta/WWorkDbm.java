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
 * The DB meta of W_WORK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWorkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWorkDbm _instance = new WWorkDbm();
    private WWorkDbm() {}
    public static WWorkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWork)et).getWorkId(), (et, vl) -> ((WWork)et).setWorkId(ctl(vl)), "workId");
        setupEpg(_epgMap, et -> ((WWork)et).getCenterCd(), (et, vl) -> ((WWork)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((WWork)et).getWorkUserCd(), (et, vl) -> ((WWork)et).setWorkUserCd((String)vl), "workUserCd");
        setupEpg(_epgMap, et -> ((WWork)et).getWorkDt(), (et, vl) -> ((WWork)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((WWork)et).getClockInFlg(), (et, vl) -> ((WWork)et).setClockInFlg((String)vl), "clockInFlg");
        setupEpg(_epgMap, et -> ((WWork)et).getClockOutFlg(), (et, vl) -> ((WWork)et).setClockOutFlg((String)vl), "clockOutFlg");
        setupEpg(_epgMap, et -> ((WWork)et).getEntryStartDt(), (et, vl) -> ((WWork)et).setEntryStartDt((String)vl), "entryStartDt");
        setupEpg(_epgMap, et -> ((WWork)et).getEntryStartTm(), (et, vl) -> ((WWork)et).setEntryStartTm((String)vl), "entryStartTm");
        setupEpg(_epgMap, et -> ((WWork)et).getEntryEndDt(), (et, vl) -> ((WWork)et).setEntryEndDt((String)vl), "entryEndDt");
        setupEpg(_epgMap, et -> ((WWork)et).getEntryEndTm(), (et, vl) -> ((WWork)et).setEntryEndTm((String)vl), "entryEndTm");
        setupEpg(_epgMap, et -> ((WWork)et).getBreakStartFlg(), (et, vl) -> ((WWork)et).setBreakStartFlg((String)vl), "breakStartFlg");
        setupEpg(_epgMap, et -> ((WWork)et).getBreakStartDt(), (et, vl) -> ((WWork)et).setBreakStartDt((String)vl), "breakStartDt");
        setupEpg(_epgMap, et -> ((WWork)et).getBreakStartTm(), (et, vl) -> ((WWork)et).setBreakStartTm((String)vl), "breakStartTm");
        setupEpg(_epgMap, et -> ((WWork)et).getBreakEndDt(), (et, vl) -> ((WWork)et).setBreakEndDt((String)vl), "breakEndDt");
        setupEpg(_epgMap, et -> ((WWork)et).getBreakEndTm(), (et, vl) -> ((WWork)et).setBreakEndTm((String)vl), "breakEndTm");
        setupEpg(_epgMap, et -> ((WWork)et).getForcedClockOutFlg(), (et, vl) -> ((WWork)et).setForcedClockOutFlg((String)vl), "forcedClockOutFlg");
        setupEpg(_epgMap, et -> ((WWork)et).getWorkFlg(), (et, vl) -> ((WWork)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WWork)et).getErrorFlg(), (et, vl) -> ((WWork)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WWork)et).getErrorMsg(), (et, vl) -> ((WWork)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WWork)et).getDelFlg(), (et, vl) -> ((WWork)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWork)et).getVersionNo(), (et, vl) -> ((WWork)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWork)et).getControlNo(), (et, vl) -> ((WWork)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWork)et).getAddDt(), (et, vl) -> ((WWork)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWork)et).getAddUser(), (et, vl) -> ((WWork)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWork)et).getAddProcess(), (et, vl) -> ((WWork)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWork)et).getUpdDt(), (et, vl) -> ((WWork)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWork)et).getUpdUser(), (et, vl) -> ((WWork)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWork)et).getUpdProcess(), (et, vl) -> ((WWork)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WORK";
    protected final String _tableDispName = "W_WORK";
    protected final String _tablePropertyName = "WWork";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WORK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWorkId = cci("WORK_ID", "WORK_ID", null, null, Long.class, "workId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkUserCd = cci("WORK_USER_CD", "WORK_USER_CD", null, null, String.class, "workUserCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClockInFlg = cci("CLOCK_IN_FLG", "CLOCK_IN_FLG", null, null, String.class, "clockInFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClockOutFlg = cci("CLOCK_OUT_FLG", "CLOCK_OUT_FLG", null, null, String.class, "clockOutFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEntryStartDt = cci("ENTRY_START_DT", "ENTRY_START_DT", null, null, String.class, "entryStartDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEntryStartTm = cci("ENTRY_START_TM", "ENTRY_START_TM", null, null, String.class, "entryStartTm", null, false, false, false, "varchar", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEntryEndDt = cci("ENTRY_END_DT", "ENTRY_END_DT", null, null, String.class, "entryEndDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEntryEndTm = cci("ENTRY_END_TM", "ENTRY_END_TM", null, null, String.class, "entryEndTm", null, false, false, false, "varchar", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBreakStartFlg = cci("BREAK_START_FLG", "BREAK_START_FLG", null, null, String.class, "breakStartFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBreakStartDt = cci("BREAK_START_DT", "BREAK_START_DT", null, null, String.class, "breakStartDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBreakStartTm = cci("BREAK_START_TM", "BREAK_START_TM", null, null, String.class, "breakStartTm", null, false, false, false, "varchar", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBreakEndDt = cci("BREAK_END_DT", "BREAK_END_DT", null, null, String.class, "breakEndDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBreakEndTm = cci("BREAK_END_TM", "BREAK_END_TM", null, null, String.class, "breakEndTm", null, false, false, false, "varchar", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForcedClockOutFlg = cci("FORCED_CLOCK_OUT_FLG", "FORCED_CLOCK_OUT_FLG", null, null, String.class, "forcedClockOutFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMsg = cci("ERROR_MSG", "ERROR_MSG", null, null, String.class, "errorMsg", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * WORK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkId() { return _columnWorkId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * WORK_USER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkUserCd() { return _columnWorkUserCd; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * CLOCK_IN_FLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClockInFlg() { return _columnClockInFlg; }
    /**
     * CLOCK_OUT_FLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClockOutFlg() { return _columnClockOutFlg; }
    /**
     * ENTRY_START_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryStartDt() { return _columnEntryStartDt; }
    /**
     * ENTRY_START_TM: {varchar(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryStartTm() { return _columnEntryStartTm; }
    /**
     * ENTRY_END_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryEndDt() { return _columnEntryEndDt; }
    /**
     * ENTRY_END_TM: {varchar(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryEndTm() { return _columnEntryEndTm; }
    /**
     * BREAK_START_FLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBreakStartFlg() { return _columnBreakStartFlg; }
    /**
     * BREAK_START_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBreakStartDt() { return _columnBreakStartDt; }
    /**
     * BREAK_START_TM: {varchar(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBreakStartTm() { return _columnBreakStartTm; }
    /**
     * BREAK_END_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBreakEndDt() { return _columnBreakEndDt; }
    /**
     * BREAK_END_TM: {varchar(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBreakEndTm() { return _columnBreakEndTm; }
    /**
     * FORCED_CLOCK_OUT_FLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForcedClockOutFlg() { return _columnForcedClockOutFlg; }
    /**
     * WORK_FLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MSG: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMsg() { return _columnErrorMsg; }
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
        ls.add(columnWorkId());
        ls.add(columnCenterCd());
        ls.add(columnWorkUserCd());
        ls.add(columnWorkDt());
        ls.add(columnClockInFlg());
        ls.add(columnClockOutFlg());
        ls.add(columnEntryStartDt());
        ls.add(columnEntryStartTm());
        ls.add(columnEntryEndDt());
        ls.add(columnEntryEndTm());
        ls.add(columnBreakStartFlg());
        ls.add(columnBreakStartDt());
        ls.add(columnBreakStartTm());
        ls.add(columnBreakEndDt());
        ls.add(columnBreakEndTm());
        ls.add(columnForcedClockOutFlg());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMsg());
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
    protected UniqueInfo cpui() { return hpcpui(columnWorkId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWork"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWorkCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWorkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWork> getEntityType() { return WWork.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWork newEntity() { return new WWork(); }
    public WWork newMyEntity() { return new WWork(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWork)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWork)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
