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
 * The DB meta of B_DML_LOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BDmlLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BDmlLogDbm _instance = new BDmlLogDbm();
    private BDmlLogDbm() {}
    public static BDmlLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BDmlLog)et).getDmlLogId(), (et, vl) -> ((BDmlLog)et).setDmlLogId(ctl(vl)), "dmlLogId");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getDmlKbn(), (et, vl) -> ((BDmlLog)et).setDmlKbn((String)vl), "dmlKbn");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getDmlTableNm(), (et, vl) -> ((BDmlLog)et).setDmlTableNm((String)vl), "dmlTableNm");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getDmlColumnNm(), (et, vl) -> ((BDmlLog)et).setDmlColumnNm((String)vl), "dmlColumnNm");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getDmlRowId(), (et, vl) -> ((BDmlLog)et).setDmlRowId(ctl(vl)), "dmlRowId");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getDmlBeforeValue(), (et, vl) -> ((BDmlLog)et).setDmlBeforeValue((String)vl), "dmlBeforeValue");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getDmlAfterValue(), (et, vl) -> ((BDmlLog)et).setDmlAfterValue((String)vl), "dmlAfterValue");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getDelFlg(), (et, vl) -> ((BDmlLog)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getVersionNo(), (et, vl) -> ((BDmlLog)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getControlNo(), (et, vl) -> ((BDmlLog)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getAddDt(), (et, vl) -> ((BDmlLog)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getAddUser(), (et, vl) -> ((BDmlLog)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getAddProcess(), (et, vl) -> ((BDmlLog)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getUpdDt(), (et, vl) -> ((BDmlLog)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getUpdUser(), (et, vl) -> ((BDmlLog)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BDmlLog)et).getUpdProcess(), (et, vl) -> ((BDmlLog)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_DML_LOG";
    protected final String _tableDispName = "B_DML_LOG";
    protected final String _tablePropertyName = "BDmlLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_DML_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDmlLogId = cci("DML_LOG_ID", "DML_LOG_ID", null, null, Long.class, "dmlLogId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmlKbn = cci("DML_KBN", "DML_KBN", null, null, String.class, "dmlKbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmlTableNm = cci("DML_TABLE_NM", "DML_TABLE_NM", null, null, String.class, "dmlTableNm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmlColumnNm = cci("DML_COLUMN_NM", "DML_COLUMN_NM", null, null, String.class, "dmlColumnNm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmlRowId = cci("DML_ROW_ID", "DML_ROW_ID", null, null, Long.class, "dmlRowId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmlBeforeValue = cci("DML_BEFORE_VALUE", "DML_BEFORE_VALUE", null, null, String.class, "dmlBeforeValue", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmlAfterValue = cci("DML_AFTER_VALUE", "DML_AFTER_VALUE", null, null, String.class, "dmlAfterValue", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmlLogId() { return _columnDmlLogId; }
    /**
     * DML_KBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmlKbn() { return _columnDmlKbn; }
    /**
     * DML_TABLE_NM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmlTableNm() { return _columnDmlTableNm; }
    /**
     * DML_COLUMN_NM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmlColumnNm() { return _columnDmlColumnNm; }
    /**
     * DML_ROW_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmlRowId() { return _columnDmlRowId; }
    /**
     * DML_BEFORE_VALUE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmlBeforeValue() { return _columnDmlBeforeValue; }
    /**
     * DML_AFTER_VALUE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmlAfterValue() { return _columnDmlAfterValue; }
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
        ls.add(columnDmlLogId());
        ls.add(columnDmlKbn());
        ls.add(columnDmlTableNm());
        ls.add(columnDmlColumnNm());
        ls.add(columnDmlRowId());
        ls.add(columnDmlBeforeValue());
        ls.add(columnDmlAfterValue());
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
    protected UniqueInfo cpui() { return hpcpui(columnDmlLogId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BDmlLog"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BDmlLogCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BDmlLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BDmlLog> getEntityType() { return BDmlLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BDmlLog newEntity() { return new BDmlLog(); }
    public BDmlLog newMyEntity() { return new BDmlLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BDmlLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BDmlLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
