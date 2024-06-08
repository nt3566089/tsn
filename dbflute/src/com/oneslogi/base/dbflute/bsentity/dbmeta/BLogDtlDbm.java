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
 * The DB meta of B_LOG_DTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BLogDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BLogDtlDbm _instance = new BLogDtlDbm();
    private BLogDtlDbm() {}
    public static BLogDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BLogDtl)et).getLogDtlId(), (et, vl) -> ((BLogDtl)et).setLogDtlId(ctl(vl)), "logDtlId");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getLogId(), (et, vl) -> ((BLogDtl)et).setLogId(ctl(vl)), "logId");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getLogDtlType(), (et, vl) -> ((BLogDtl)et).setLogDtlType((String)vl), "logDtlType");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getLogDtlStatus(), (et, vl) -> ((BLogDtl)et).setLogDtlStatus((String)vl), "logDtlStatus");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getLogDtlSectionId(), (et, vl) -> ((BLogDtl)et).setLogDtlSectionId(ctl(vl)), "logDtlSectionId");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getLogDtlSectionNm(), (et, vl) -> ((BLogDtl)et).setLogDtlSectionNm((String)vl), "logDtlSectionNm");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getProcessInfo(), (et, vl) -> ((BLogDtl)et).setProcessInfo((String)vl), "processInfo");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getProcessDt(), (et, vl) -> ((BLogDtl)et).setProcessDt(cttp(vl)), "processDt");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getMessageReplaceString1(), (et, vl) -> ((BLogDtl)et).setMessageReplaceString1((String)vl), "messageReplaceString1");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getMessageReplaceString2(), (et, vl) -> ((BLogDtl)et).setMessageReplaceString2((String)vl), "messageReplaceString2");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getMessageReplaceString3(), (et, vl) -> ((BLogDtl)et).setMessageReplaceString3((String)vl), "messageReplaceString3");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getMessageReplaceString4(), (et, vl) -> ((BLogDtl)et).setMessageReplaceString4((String)vl), "messageReplaceString4");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getMessageReplaceString5(), (et, vl) -> ((BLogDtl)et).setMessageReplaceString5((String)vl), "messageReplaceString5");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getDelFlg(), (et, vl) -> ((BLogDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getVersionNo(), (et, vl) -> ((BLogDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getControlNo(), (et, vl) -> ((BLogDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getAddDt(), (et, vl) -> ((BLogDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getAddUser(), (et, vl) -> ((BLogDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getAddProcess(), (et, vl) -> ((BLogDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getUpdDt(), (et, vl) -> ((BLogDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getUpdUser(), (et, vl) -> ((BLogDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BLogDtl)et).getUpdProcess(), (et, vl) -> ((BLogDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BLogDtl)et).getBLog(), (et, vl) -> ((BLogDtl)et).setBLog((BLog)vl), "BLog");
        setupEfpg(_efpgMap, et -> ((BLogDtl)et).getBClassDtlByLogDtlType(), (et, vl) -> ((BLogDtl)et).setBClassDtlByLogDtlType((BClassDtl)vl), "BClassDtlByLogDtlType");
        setupEfpg(_efpgMap, et -> ((BLogDtl)et).getBClassDtlByLogDtlStatus(), (et, vl) -> ((BLogDtl)et).setBClassDtlByLogDtlStatus((BClassDtl)vl), "BClassDtlByLogDtlStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_LOG_DTL";
    protected final String _tableDispName = "B_LOG_DTL";
    protected final String _tablePropertyName = "BLogDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_LOG_DTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLogDtlId = cci("LOG_DTL_ID", "LOG_DTL_ID", null, null, Long.class, "logDtlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogId = cci("LOG_ID", "LOG_ID", null, null, Long.class, "logId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BLog", null, null, false);
    protected final ColumnInfo _columnLogDtlType = cci("LOG_DTL_TYPE", "LOG_DTL_TYPE", null, null, String.class, "logDtlType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByLogDtlType", null, CDef.DefMeta.LogDtlType, false);
    protected final ColumnInfo _columnLogDtlStatus = cci("LOG_DTL_STATUS", "LOG_DTL_STATUS", null, null, String.class, "logDtlStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByLogDtlStatus", null, CDef.DefMeta.LogDtlStatus, false);
    protected final ColumnInfo _columnLogDtlSectionId = cci("LOG_DTL_SECTION_ID", "LOG_DTL_SECTION_ID", null, null, Long.class, "logDtlSectionId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogDtlSectionNm = cci("LOG_DTL_SECTION_NM", "LOG_DTL_SECTION_NM", null, null, String.class, "logDtlSectionNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessInfo = cci("PROCESS_INFO", "PROCESS_INFO", null, null, String.class, "processInfo", null, false, false, true, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessDt = cci("PROCESS_DT", "PROCESS_DT", null, null, java.sql.Timestamp.class, "processDt", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageReplaceString1 = cci("MESSAGE_REPLACE_STRING1", "MESSAGE_REPLACE_STRING1", null, null, String.class, "messageReplaceString1", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageReplaceString2 = cci("MESSAGE_REPLACE_STRING2", "MESSAGE_REPLACE_STRING2", null, null, String.class, "messageReplaceString2", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageReplaceString3 = cci("MESSAGE_REPLACE_STRING3", "MESSAGE_REPLACE_STRING3", null, null, String.class, "messageReplaceString3", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageReplaceString4 = cci("MESSAGE_REPLACE_STRING4", "MESSAGE_REPLACE_STRING4", null, null, String.class, "messageReplaceString4", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageReplaceString5 = cci("MESSAGE_REPLACE_STRING5", "MESSAGE_REPLACE_STRING5", null, null, String.class, "messageReplaceString5", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogDtlId() { return _columnLogDtlId; }
    /**
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogId() { return _columnLogId; }
    /**
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogDtlType() { return _columnLogDtlType; }
    /**
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogDtlStatus() { return _columnLogDtlStatus; }
    /**
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogDtlSectionId() { return _columnLogDtlSectionId; }
    /**
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogDtlSectionNm() { return _columnLogDtlSectionNm; }
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
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageReplaceString1() { return _columnMessageReplaceString1; }
    /**
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageReplaceString2() { return _columnMessageReplaceString2; }
    /**
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageReplaceString3() { return _columnMessageReplaceString3; }
    /**
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageReplaceString4() { return _columnMessageReplaceString4; }
    /**
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageReplaceString5() { return _columnMessageReplaceString5; }
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
        ls.add(columnLogDtlId());
        ls.add(columnLogId());
        ls.add(columnLogDtlType());
        ls.add(columnLogDtlStatus());
        ls.add(columnLogDtlSectionId());
        ls.add(columnLogDtlSectionNm());
        ls.add(columnProcessInfo());
        ls.add(columnProcessDt());
        ls.add(columnMessageReplaceString1());
        ls.add(columnMessageReplaceString2());
        ls.add(columnMessageReplaceString3());
        ls.add(columnMessageReplaceString4());
        ls.add(columnMessageReplaceString5());
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
    protected UniqueInfo cpui() { return hpcpui(columnLogDtlId()); }
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
     * B_LOG by my LOG_ID, named 'BLog'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBLog() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLogId(), BLogDbm.getInstance().columnLogId());
        return cfi("B_LOG_DTL_FK1", "BLog", this, BLogDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BLogDtlList", false);
    }
    /**
     * B_CLASS_DTL by my LOG_DTL_TYPE, named 'BClassDtlByLogDtlType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLogDtlType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLogDtlType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_LOG_DTL_LOG_DTL_TYPE", "BClassDtlByLogDtlType", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOG_DTL_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LOG_DTL_STATUS, named 'BClassDtlByLogDtlStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLogDtlStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLogDtlStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_LOG_DTL_LOG_DTL_STATUS", "BClassDtlByLogDtlStatus", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOG_DTL_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BLogDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BLogDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BLogDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BLogDtl> getEntityType() { return BLogDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BLogDtl newEntity() { return new BLogDtl(); }
    public BLogDtl newMyEntity() { return new BLogDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BLogDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BLogDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
