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
 * The DB meta of B_SYSTEM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BSystemDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BSystemDbm _instance = new BSystemDbm();
    private BSystemDbm() {}
    public static BSystemDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BSystem)et).getSystemId(), (et, vl) -> ((BSystem)et).setSystemId(ctl(vl)), "systemId");
        setupEpg(_epgMap, et -> ((BSystem)et).getSystemNm(), (et, vl) -> ((BSystem)et).setSystemNm((String)vl), "systemNm");
        setupEpg(_epgMap, et -> ((BSystem)et).getTimeZoneId(), (et, vl) -> ((BSystem)et).setTimeZoneId(ctl(vl)), "timeZoneId");
        setupEpg(_epgMap, et -> ((BSystem)et).getPassword(), (et, vl) -> ((BSystem)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((BSystem)et).getSalt(), (et, vl) -> ((BSystem)et).setSalt((String)vl), "salt");
        setupEpg(_epgMap, et -> ((BSystem)et).getDelFlg(), (et, vl) -> ((BSystem)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BSystem)et).getVersionNo(), (et, vl) -> ((BSystem)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BSystem)et).getControlNo(), (et, vl) -> ((BSystem)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BSystem)et).getAddDt(), (et, vl) -> ((BSystem)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BSystem)et).getAddUser(), (et, vl) -> ((BSystem)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BSystem)et).getAddProcess(), (et, vl) -> ((BSystem)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BSystem)et).getUpdDt(), (et, vl) -> ((BSystem)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BSystem)et).getUpdUser(), (et, vl) -> ((BSystem)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BSystem)et).getUpdProcess(), (et, vl) -> ((BSystem)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BSystem)et).getBTimeZone(), (et, vl) -> ((BSystem)et).setBTimeZone((BTimeZone)vl), "BTimeZone");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_SYSTEM";
    protected final String _tableDispName = "B_SYSTEM";
    protected final String _tablePropertyName = "BSystem";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_SYSTEM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSystemId = cci("SYSTEM_ID", "SYSTEM_ID", null, null, Long.class, "systemId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSystemNm = cci("SYSTEM_NM", "SYSTEM_NM", null, null, String.class, "systemNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimeZoneId = cci("TIME_ZONE_ID", "TIME_ZONE_ID", null, null, Long.class, "timeZoneId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BTimeZone", null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalt = cci("SALT", "SALT", null, null, String.class, "salt", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemId() { return _columnSystemId; }
    /**
     * SYSTEM_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemNm() { return _columnSystemNm; }
    /**
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeZoneId() { return _columnTimeZoneId; }
    /**
     * PASSWORD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * SALT: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalt() { return _columnSalt; }
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
        ls.add(columnSystemId());
        ls.add(columnSystemNm());
        ls.add(columnTimeZoneId());
        ls.add(columnPassword());
        ls.add(columnSalt());
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
    protected UniqueInfo cpui() { return hpcpui(columnSystemId()); }
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
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBTimeZone() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTimeZoneId(), BTimeZoneDbm.getInstance().columnTimeZoneId());
        return cfi("B_SYSTEM_FK1", "BTimeZone", this, BTimeZoneDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BSystemList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BSystem"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BSystemCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BSystemBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BSystem> getEntityType() { return BSystem.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BSystem newEntity() { return new BSystem(); }
    public BSystem newMyEntity() { return new BSystem(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BSystem)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BSystem)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
