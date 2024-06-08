package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlLogList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlLogListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlLogListDbm _instance = new SqlLogListDbm();
    private SqlLogListDbm() {}
    public static SqlLogListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlLogList)et).getMessageNm(), (et, vl) -> ((SqlLogList)et).setMessageNm((String)vl), "messageNm");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getDictNm(), (et, vl) -> ((SqlLogList)et).setDictNm((String)vl), "dictNm");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getProcessStartDt(), (et, vl) -> ((SqlLogList)et).setProcessStartDt(cttp(vl)), "processStartDt");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getProcessEndDt(), (et, vl) -> ((SqlLogList)et).setProcessEndDt(cttp(vl)), "processEndDt");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getLogGroupCd(), (et, vl) -> ((SqlLogList)et).setLogGroupCd((String)vl), "logGroupCd");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getLogId(), (et, vl) -> ((SqlLogList)et).setLogId(ctl(vl)), "logId");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getLogGroupNm(), (et, vl) -> ((SqlLogList)et).setLogGroupNm((String)vl), "logGroupNm");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getPgmCd(), (et, vl) -> ((SqlLogList)et).setPgmCd((String)vl), "pgmCd");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getPgmNm(), (et, vl) -> ((SqlLogList)et).setPgmNm((String)vl), "pgmNm");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getAttribute1(), (et, vl) -> ((SqlLogList)et).setAttribute1((String)vl), "attribute1");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getCenterNm(), (et, vl) -> ((SqlLogList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getAttribute2(), (et, vl) -> ((SqlLogList)et).setAttribute2((String)vl), "attribute2");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getClientNm(), (et, vl) -> ((SqlLogList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getAttribute3(), (et, vl) -> ((SqlLogList)et).setAttribute3((String)vl), "attribute3");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getAttribute3Nm(), (et, vl) -> ((SqlLogList)et).setAttribute3Nm((String)vl), "attribute3Nm");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getAttribute4(), (et, vl) -> ((SqlLogList)et).setAttribute4((String)vl), "attribute4");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getAttribute4Nm(), (et, vl) -> ((SqlLogList)et).setAttribute4Nm((String)vl), "attribute4Nm");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getAttribute5(), (et, vl) -> ((SqlLogList)et).setAttribute5((String)vl), "attribute5");
        setupEpg(_epgMap, et -> ((SqlLogList)et).getAttribute5Nm(), (et, vl) -> ((SqlLogList)et).setAttribute5Nm((String)vl), "attribute5Nm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlLogList";
    protected final String _tableDispName = "SqlLogList";
    protected final String _tablePropertyName = "sqlLogList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlLogList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMessageNm = cci("MESSAGE_NM", "MESSAGE_NM", null, null, String.class, "messageNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictNm = cci("DICT_NM", "DICT_NM", null, null, String.class, "dictNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessStartDt = cci("PROCESS_START_DT", "PROCESS_START_DT", null, null, java.sql.Timestamp.class, "processStartDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessEndDt = cci("PROCESS_END_DT", "PROCESS_END_DT", null, null, java.sql.Timestamp.class, "processEndDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogGroupCd = cci("LOG_GROUP_CD", "LOG_GROUP_CD", null, null, String.class, "logGroupCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogId = cci("LOG_ID", "LOG_ID", null, null, Long.class, "logId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogGroupNm = cci("LOG_GROUP_NM", "LOG_GROUP_NM", null, null, String.class, "logGroupNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPgmCd = cci("PGM_CD", "PGM_CD", null, null, String.class, "pgmCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPgmNm = cci("PGM_NM", "PGM_NM", null, null, String.class, "pgmNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute1 = cci("ATTRIBUTE1", "ATTRIBUTE1", null, null, String.class, "attribute1", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute2 = cci("ATTRIBUTE2", "ATTRIBUTE2", null, null, String.class, "attribute2", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute3 = cci("ATTRIBUTE3", "ATTRIBUTE3", null, null, String.class, "attribute3", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute3Nm = cci("ATTRIBUTE3_NM", "ATTRIBUTE3_NM", null, null, String.class, "attribute3Nm", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute4 = cci("ATTRIBUTE4", "ATTRIBUTE4", null, null, String.class, "attribute4", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute4Nm = cci("ATTRIBUTE4_NM", "ATTRIBUTE4_NM", null, null, String.class, "attribute4Nm", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute5 = cci("ATTRIBUTE5", "ATTRIBUTE5", null, null, String.class, "attribute5", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute5Nm = cci("ATTRIBUTE5_NM", "ATTRIBUTE5_NM", null, null, String.class, "attribute5Nm", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);

    /**
     * MESSAGE_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNm() { return _columnMessageNm; }
    /**
     * DICT_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictNm() { return _columnDictNm; }
    /**
     * PROCESS_START_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessStartDt() { return _columnProcessStartDt; }
    /**
     * PROCESS_END_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessEndDt() { return _columnProcessEndDt; }
    /**
     * LOG_GROUP_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogGroupCd() { return _columnLogGroupCd; }
    /**
     * LOG_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogId() { return _columnLogId; }
    /**
     * LOG_GROUP_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogGroupNm() { return _columnLogGroupNm; }
    /**
     * PGM_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPgmCd() { return _columnPgmCd; }
    /**
     * PGM_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPgmNm() { return _columnPgmNm; }
    /**
     * ATTRIBUTE1: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute1() { return _columnAttribute1; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * ATTRIBUTE2: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute2() { return _columnAttribute2; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * ATTRIBUTE3: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute3() { return _columnAttribute3; }
    /**
     * ATTRIBUTE3_NM: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute3Nm() { return _columnAttribute3Nm; }
    /**
     * ATTRIBUTE4: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute4() { return _columnAttribute4; }
    /**
     * ATTRIBUTE4_NM: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute4Nm() { return _columnAttribute4Nm; }
    /**
     * ATTRIBUTE5: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute5() { return _columnAttribute5; }
    /**
     * ATTRIBUTE5_NM: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute5Nm() { return _columnAttribute5Nm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMessageNm());
        ls.add(columnDictNm());
        ls.add(columnProcessStartDt());
        ls.add(columnProcessEndDt());
        ls.add(columnLogGroupCd());
        ls.add(columnLogId());
        ls.add(columnLogGroupNm());
        ls.add(columnPgmCd());
        ls.add(columnPgmNm());
        ls.add(columnAttribute1());
        ls.add(columnCenterNm());
        ls.add(columnAttribute2());
        ls.add(columnClientNm());
        ls.add(columnAttribute3());
        ls.add(columnAttribute3Nm());
        ls.add(columnAttribute4());
        ls.add(columnAttribute4Nm());
        ls.add(columnAttribute5());
        ls.add(columnAttribute5Nm());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlLogList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlLogList> getEntityType() { return SqlLogList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlLogList newEntity() { return new SqlLogList(); }
    public SqlLogList newMyEntity() { return new SqlLogList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlLogList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlLogList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
