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
 * The DB meta of B_LOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BLogDbm _instance = new BLogDbm();
    private BLogDbm() {}
    public static BLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BLog)et).getLogId(), (et, vl) -> ((BLog)et).setLogId(ctl(vl)), "logId");
        setupEpg(_epgMap, et -> ((BLog)et).getLogStatus(), (et, vl) -> ((BLog)et).setLogStatus((String)vl), "logStatus");
        setupEpg(_epgMap, et -> ((BLog)et).getLogGroupCd(), (et, vl) -> ((BLog)et).setLogGroupCd((String)vl), "logGroupCd");
        setupEpg(_epgMap, et -> ((BLog)et).getLogGroupNm(), (et, vl) -> ((BLog)et).setLogGroupNm((String)vl), "logGroupNm");
        setupEpg(_epgMap, et -> ((BLog)et).getLogGroupProcessId(), (et, vl) -> ((BLog)et).setLogGroupProcessId(ctl(vl)), "logGroupProcessId");
        setupEpg(_epgMap, et -> ((BLog)et).getPgmCd(), (et, vl) -> ((BLog)et).setPgmCd((String)vl), "pgmCd");
        setupEpg(_epgMap, et -> ((BLog)et).getPgmNm(), (et, vl) -> ((BLog)et).setPgmNm((String)vl), "pgmNm");
        setupEpg(_epgMap, et -> ((BLog)et).getProcessStartDt(), (et, vl) -> ((BLog)et).setProcessStartDt(cttp(vl)), "processStartDt");
        setupEpg(_epgMap, et -> ((BLog)et).getProcessEndDt(), (et, vl) -> ((BLog)et).setProcessEndDt(cttp(vl)), "processEndDt");
        setupEpg(_epgMap, et -> ((BLog)et).getAttribute1(), (et, vl) -> ((BLog)et).setAttribute1((String)vl), "attribute1");
        setupEpg(_epgMap, et -> ((BLog)et).getAttribute2(), (et, vl) -> ((BLog)et).setAttribute2((String)vl), "attribute2");
        setupEpg(_epgMap, et -> ((BLog)et).getAttribute3(), (et, vl) -> ((BLog)et).setAttribute3((String)vl), "attribute3");
        setupEpg(_epgMap, et -> ((BLog)et).getAttribute4(), (et, vl) -> ((BLog)et).setAttribute4((String)vl), "attribute4");
        setupEpg(_epgMap, et -> ((BLog)et).getAttribute5(), (et, vl) -> ((BLog)et).setAttribute5((String)vl), "attribute5");
        setupEpg(_epgMap, et -> ((BLog)et).getDelFlg(), (et, vl) -> ((BLog)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BLog)et).getVersionNo(), (et, vl) -> ((BLog)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BLog)et).getControlNo(), (et, vl) -> ((BLog)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BLog)et).getAddDt(), (et, vl) -> ((BLog)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BLog)et).getAddUser(), (et, vl) -> ((BLog)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BLog)et).getAddProcess(), (et, vl) -> ((BLog)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BLog)et).getUpdDt(), (et, vl) -> ((BLog)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BLog)et).getUpdUser(), (et, vl) -> ((BLog)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BLog)et).getUpdProcess(), (et, vl) -> ((BLog)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BLog)et).getBClassDtlByLogStatus(), (et, vl) -> ((BLog)et).setBClassDtlByLogStatus((BClassDtl)vl), "BClassDtlByLogStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_LOG";
    protected final String _tableDispName = "B_LOG";
    protected final String _tablePropertyName = "BLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLogId = cci("LOG_ID", "LOG_ID", null, null, Long.class, "logId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BLogDtlList", null, false);
    protected final ColumnInfo _columnLogStatus = cci("LOG_STATUS", "LOG_STATUS", null, null, String.class, "logStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByLogStatus", null, CDef.DefMeta.LogStatus, false);
    protected final ColumnInfo _columnLogGroupCd = cci("LOG_GROUP_CD", "LOG_GROUP_CD", null, null, String.class, "logGroupCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogGroupNm = cci("LOG_GROUP_NM", "LOG_GROUP_NM", null, null, String.class, "logGroupNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogGroupProcessId = cci("LOG_GROUP_PROCESS_ID", "LOG_GROUP_PROCESS_ID", null, null, Long.class, "logGroupProcessId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPgmCd = cci("PGM_CD", "PGM_CD", null, null, String.class, "pgmCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPgmNm = cci("PGM_NM", "PGM_NM", null, null, String.class, "pgmNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessStartDt = cci("PROCESS_START_DT", "PROCESS_START_DT", null, null, java.sql.Timestamp.class, "processStartDt", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessEndDt = cci("PROCESS_END_DT", "PROCESS_END_DT", null, null, java.sql.Timestamp.class, "processEndDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute1 = cci("ATTRIBUTE1", "ATTRIBUTE1", null, null, String.class, "attribute1", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute2 = cci("ATTRIBUTE2", "ATTRIBUTE2", null, null, String.class, "attribute2", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute3 = cci("ATTRIBUTE3", "ATTRIBUTE3", null, null, String.class, "attribute3", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute4 = cci("ATTRIBUTE4", "ATTRIBUTE4", null, null, String.class, "attribute4", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute5 = cci("ATTRIBUTE5", "ATTRIBUTE5", null, null, String.class, "attribute5", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogId() { return _columnLogId; }
    /**
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogStatus() { return _columnLogStatus; }
    /**
     * LOG_GROUP_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogGroupCd() { return _columnLogGroupCd; }
    /**
     * LOG_GROUP_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogGroupNm() { return _columnLogGroupNm; }
    /**
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogGroupProcessId() { return _columnLogGroupProcessId; }
    /**
     * PGM_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPgmCd() { return _columnPgmCd; }
    /**
     * PGM_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPgmNm() { return _columnPgmNm; }
    /**
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessStartDt() { return _columnProcessStartDt; }
    /**
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessEndDt() { return _columnProcessEndDt; }
    /**
     * ATTRIBUTE1: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute1() { return _columnAttribute1; }
    /**
     * ATTRIBUTE2: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute2() { return _columnAttribute2; }
    /**
     * ATTRIBUTE3: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute3() { return _columnAttribute3; }
    /**
     * ATTRIBUTE4: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute4() { return _columnAttribute4; }
    /**
     * ATTRIBUTE5: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute5() { return _columnAttribute5; }
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
        ls.add(columnLogId());
        ls.add(columnLogStatus());
        ls.add(columnLogGroupCd());
        ls.add(columnLogGroupNm());
        ls.add(columnLogGroupProcessId());
        ls.add(columnPgmCd());
        ls.add(columnPgmNm());
        ls.add(columnProcessStartDt());
        ls.add(columnProcessEndDt());
        ls.add(columnAttribute1());
        ls.add(columnAttribute2());
        ls.add(columnAttribute3());
        ls.add(columnAttribute4());
        ls.add(columnAttribute5());
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
    protected UniqueInfo cpui() { return hpcpui(columnLogId()); }
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
     * B_CLASS_DTL by my LOG_STATUS, named 'BClassDtlByLogStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLogStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLogStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_LOG_LOG_STATUS", "BClassDtlByLogStatus", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOG_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_LOG_DTL by LOG_ID, named 'BLogDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBLogDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLogId(), BLogDtlDbm.getInstance().columnLogId());
        return cri("B_LOG_DTL_FK1", "BLogDtlList", this, BLogDtlDbm.getInstance(), mp, false, "BLog");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BLog"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BLogCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BLog> getEntityType() { return BLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BLog newEntity() { return new BLog(); }
    public BLog newMyEntity() { return new BLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
