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
 * The DB meta of B_SYSTEM_LOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BSystemLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BSystemLogDbm _instance = new BSystemLogDbm();
    private BSystemLogDbm() {}
    public static BSystemLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BSystemLog)et).getSystemLogId(), (et, vl) -> ((BSystemLog)et).setSystemLogId(ctl(vl)), "systemLogId");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getSystemLogProcessId(), (et, vl) -> ((BSystemLog)et).setSystemLogProcessId(ctl(vl)), "systemLogProcessId");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getSystemLogType(), (et, vl) -> ((BSystemLog)et).setSystemLogType((String)vl), "systemLogType");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getSystemLogStatus(), (et, vl) -> ((BSystemLog)et).setSystemLogStatus((String)vl), "systemLogStatus");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getClassCd(), (et, vl) -> ((BSystemLog)et).setClassCd((String)vl), "classCd");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getMethodCd(), (et, vl) -> ((BSystemLog)et).setMethodCd((String)vl), "methodCd");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getProcessInfo(), (et, vl) -> ((BSystemLog)et).setProcessInfo((String)vl), "processInfo");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getProcessDt(), (et, vl) -> ((BSystemLog)et).setProcessDt(cttp(vl)), "processDt");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getDelFlg(), (et, vl) -> ((BSystemLog)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getVersionNo(), (et, vl) -> ((BSystemLog)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getControlNo(), (et, vl) -> ((BSystemLog)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getAddDt(), (et, vl) -> ((BSystemLog)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getAddUser(), (et, vl) -> ((BSystemLog)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getAddProcess(), (et, vl) -> ((BSystemLog)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getUpdDt(), (et, vl) -> ((BSystemLog)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getUpdUser(), (et, vl) -> ((BSystemLog)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BSystemLog)et).getUpdProcess(), (et, vl) -> ((BSystemLog)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BSystemLog)et).getBClassDtlBySystemLogType(), (et, vl) -> ((BSystemLog)et).setBClassDtlBySystemLogType((BClassDtl)vl), "BClassDtlBySystemLogType");
        setupEfpg(_efpgMap, et -> ((BSystemLog)et).getBClassDtlBySystemLogStatus(), (et, vl) -> ((BSystemLog)et).setBClassDtlBySystemLogStatus((BClassDtl)vl), "BClassDtlBySystemLogStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_SYSTEM_LOG";
    protected final String _tableDispName = "B_SYSTEM_LOG";
    protected final String _tablePropertyName = "BSystemLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_SYSTEM_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSystemLogId = cci("SYSTEM_LOG_ID", "SYSTEM_LOG_ID", null, null, Long.class, "systemLogId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSystemLogProcessId = cci("SYSTEM_LOG_PROCESS_ID", "SYSTEM_LOG_PROCESS_ID", null, null, Long.class, "systemLogProcessId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSystemLogType = cci("SYSTEM_LOG_TYPE", "SYSTEM_LOG_TYPE", null, null, String.class, "systemLogType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlBySystemLogType", null, CDef.DefMeta.SystemLogType, false);
    protected final ColumnInfo _columnSystemLogStatus = cci("SYSTEM_LOG_STATUS", "SYSTEM_LOG_STATUS", null, null, String.class, "systemLogStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlBySystemLogStatus", null, CDef.DefMeta.SystemLogStatus, false);
    protected final ColumnInfo _columnClassCd = cci("CLASS_CD", "CLASS_CD", null, null, String.class, "classCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMethodCd = cci("METHOD_CD", "METHOD_CD", null, null, String.class, "methodCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessInfo = cci("PROCESS_INFO", "PROCESS_INFO", null, null, String.class, "processInfo", null, false, false, true, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessDt = cci("PROCESS_DT", "PROCESS_DT", null, null, java.sql.Timestamp.class, "processDt", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemLogId() { return _columnSystemLogId; }
    /**
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemLogProcessId() { return _columnSystemLogProcessId; }
    /**
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemLogType() { return _columnSystemLogType; }
    /**
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemLogStatus() { return _columnSystemLogStatus; }
    /**
     * CLASS_CD: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassCd() { return _columnClassCd; }
    /**
     * METHOD_CD: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMethodCd() { return _columnMethodCd; }
    /**
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessInfo() { return _columnProcessInfo; }
    /**
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessDt() { return _columnProcessDt; }
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
        ls.add(columnSystemLogId());
        ls.add(columnSystemLogProcessId());
        ls.add(columnSystemLogType());
        ls.add(columnSystemLogStatus());
        ls.add(columnClassCd());
        ls.add(columnMethodCd());
        ls.add(columnProcessInfo());
        ls.add(columnProcessDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnSystemLogId()); }
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
     * B_CLASS_DTL by my SYSTEM_LOG_TYPE, named 'BClassDtlBySystemLogType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySystemLogType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSystemLogType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_SYSTEM_LOG_SYSTEM_LOG_TYPE", "BClassDtlBySystemLogType", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SYSTEM_LOG_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SYSTEM_LOG_STATUS, named 'BClassDtlBySystemLogStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySystemLogStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSystemLogStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_SYSTEM_LOG_SYSTEM_LOG_STATUS", "BClassDtlBySystemLogStatus", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SYSTEM_LOG_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BSystemLog"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BSystemLogCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BSystemLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BSystemLog> getEntityType() { return BSystemLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BSystemLog newEntity() { return new BSystemLog(); }
    public BSystemLog newMyEntity() { return new BSystemLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BSystemLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BSystemLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
