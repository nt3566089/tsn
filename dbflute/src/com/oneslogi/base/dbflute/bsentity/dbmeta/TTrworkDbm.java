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
 * The DB meta of T_TRWORK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrworkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrworkDbm _instance = new TTrworkDbm();
    private TTrworkDbm() {}
    public static TTrworkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrwork)et).getSequenceno(), (et, vl) -> ((TTrwork)et).setSequenceno(ctl(vl)), "sequenceno");
        setupEpg(_epgMap, et -> ((TTrwork)et).getClientCd(), (et, vl) -> ((TTrwork)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((TTrwork)et).getCenterCd(), (et, vl) -> ((TTrwork)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TTrwork)et).getUsercd(), (et, vl) -> ((TTrwork)et).setUsercd((String)vl), "usercd");
        setupEpg(_epgMap, et -> ((TTrwork)et).getTaskType(), (et, vl) -> ((TTrwork)et).setTaskType((String)vl), "taskType");
        setupEpg(_epgMap, et -> ((TTrwork)et).getTaskTypeDetail(), (et, vl) -> ((TTrwork)et).setTaskTypeDetail((String)vl), "taskTypeDetail");
        setupEpg(_epgMap, et -> ((TTrwork)et).getWorkDt(), (et, vl) -> ((TTrwork)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((TTrwork)et).getWorktime(), (et, vl) -> ((TTrwork)et).setWorktime(cttp(vl)), "worktime");
        setupEpg(_epgMap, et -> ((TTrwork)et).getStartEnd(), (et, vl) -> ((TTrwork)et).setStartEnd((String)vl), "startEnd");
        setupEpg(_epgMap, et -> ((TTrwork)et).getWorkPalletQty(), (et, vl) -> ((TTrwork)et).setWorkPalletQty(ctl(vl)), "workPalletQty");
        setupEpg(_epgMap, et -> ((TTrwork)et).getWorkCaseQty(), (et, vl) -> ((TTrwork)et).setWorkCaseQty(ctl(vl)), "workCaseQty");
        setupEpg(_epgMap, et -> ((TTrwork)et).getWorkCartonQty(), (et, vl) -> ((TTrwork)et).setWorkCartonQty(ctl(vl)), "workCartonQty");
        setupEpg(_epgMap, et -> ((TTrwork)et).getWorkQty(), (et, vl) -> ((TTrwork)et).setWorkQty(ctl(vl)), "workQty");
        setupEpg(_epgMap, et -> ((TTrwork)et).getErrcd(), (et, vl) -> ((TTrwork)et).setErrcd((String)vl), "errcd");
        setupEpg(_epgMap, et -> ((TTrwork)et).getDelFlg(), (et, vl) -> ((TTrwork)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrwork)et).getVersionNo(), (et, vl) -> ((TTrwork)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrwork)et).getControlNo(), (et, vl) -> ((TTrwork)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrwork)et).getAddDt(), (et, vl) -> ((TTrwork)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrwork)et).getAddUser(), (et, vl) -> ((TTrwork)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrwork)et).getAddProcess(), (et, vl) -> ((TTrwork)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrwork)et).getUpdDt(), (et, vl) -> ((TTrwork)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrwork)et).getUpdUser(), (et, vl) -> ((TTrwork)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrwork)et).getUpdProcess(), (et, vl) -> ((TTrwork)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRWORK";
    protected final String _tableDispName = "T_TRWORK";
    protected final String _tablePropertyName = "TTrwork";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRWORK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSequenceno = cci("SEQUENCENO", "SEQUENCENO", null, null, Long.class, "sequenceno", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsercd = cci("USERCD", "USERCD", null, null, String.class, "usercd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaskType = cci("TASK_TYPE", "TASK_TYPE", null, null, String.class, "taskType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaskTypeDetail = cci("TASK_TYPE_DETAIL", "TASK_TYPE_DETAIL", null, null, String.class, "taskTypeDetail", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorktime = cci("WORKTIME", "WORKTIME", null, null, java.sql.Timestamp.class, "worktime", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartEnd = cci("START_END", "START_END", null, null, String.class, "startEnd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkPalletQty = cci("WORK_PALLET_QTY", "WORK_PALLET_QTY", null, null, Long.class, "workPalletQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkCaseQty = cci("WORK_CASE_QTY", "WORK_CASE_QTY", null, null, Long.class, "workCaseQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkCartonQty = cci("WORK_CARTON_QTY", "WORK_CARTON_QTY", null, null, Long.class, "workCartonQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkQty = cci("WORK_QTY", "WORK_QTY", null, null, Long.class, "workQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrcd = cci("ERRCD", "ERRCD", null, null, String.class, "errcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSequenceno() { return _columnSequenceno; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * USERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsercd() { return _columnUsercd; }
    /**
     * TASK_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaskType() { return _columnTaskType; }
    /**
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaskTypeDetail() { return _columnTaskTypeDetail; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorktime() { return _columnWorktime; }
    /**
     * START_END: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartEnd() { return _columnStartEnd; }
    /**
     * WORK_PALLET_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkPalletQty() { return _columnWorkPalletQty; }
    /**
     * WORK_CASE_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkCaseQty() { return _columnWorkCaseQty; }
    /**
     * WORK_CARTON_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkCartonQty() { return _columnWorkCartonQty; }
    /**
     * WORK_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkQty() { return _columnWorkQty; }
    /**
     * ERRCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrcd() { return _columnErrcd; }
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
        ls.add(columnSequenceno());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnUsercd());
        ls.add(columnTaskType());
        ls.add(columnTaskTypeDetail());
        ls.add(columnWorkDt());
        ls.add(columnWorktime());
        ls.add(columnStartEnd());
        ls.add(columnWorkPalletQty());
        ls.add(columnWorkCaseQty());
        ls.add(columnWorkCartonQty());
        ls.add(columnWorkQty());
        ls.add(columnErrcd());
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
    protected UniqueInfo cpui() { return hpcpui(columnSequenceno()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrwork"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrworkCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrworkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrwork> getEntityType() { return TTrwork.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrwork newEntity() { return new TTrwork(); }
    public TTrwork newMyEntity() { return new TTrwork(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrwork)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrwork)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
