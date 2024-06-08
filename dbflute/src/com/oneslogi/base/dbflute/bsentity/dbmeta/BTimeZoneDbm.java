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
 * The DB meta of B_TIME_ZONE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BTimeZoneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BTimeZoneDbm _instance = new BTimeZoneDbm();
    private BTimeZoneDbm() {}
    public static BTimeZoneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BTimeZone)et).getTimeZoneId(), (et, vl) -> ((BTimeZone)et).setTimeZoneId(ctl(vl)), "timeZoneId");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getTimeZoneCd(), (et, vl) -> ((BTimeZone)et).setTimeZoneCd((String)vl), "timeZoneCd");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getDelFlg(), (et, vl) -> ((BTimeZone)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getVersionNo(), (et, vl) -> ((BTimeZone)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getControlNo(), (et, vl) -> ((BTimeZone)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getAddDt(), (et, vl) -> ((BTimeZone)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getAddUser(), (et, vl) -> ((BTimeZone)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getAddProcess(), (et, vl) -> ((BTimeZone)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getUpdDt(), (et, vl) -> ((BTimeZone)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getUpdUser(), (et, vl) -> ((BTimeZone)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BTimeZone)et).getUpdProcess(), (et, vl) -> ((BTimeZone)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_TIME_ZONE";
    protected final String _tableDispName = "B_TIME_ZONE";
    protected final String _tablePropertyName = "BTimeZone";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_TIME_ZONE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTimeZoneId = cci("TIME_ZONE_ID", "TIME_ZONE_ID", null, null, Long.class, "timeZoneId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BSystemList,MCenterList", null, false);
    protected final ColumnInfo _columnTimeZoneCd = cci("TIME_ZONE_CD", "TIME_ZONE_CD", null, null, String.class, "timeZoneCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeZoneId() { return _columnTimeZoneId; }
    /**
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeZoneCd() { return _columnTimeZoneCd; }
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
        ls.add(columnTimeZoneId());
        ls.add(columnTimeZoneCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnTimeZoneId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnTimeZoneCd()); }

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
    /**
     * B_SYSTEM by TIME_ZONE_ID, named 'BSystemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBSystemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTimeZoneId(), BSystemDbm.getInstance().columnTimeZoneId());
        return cri("B_SYSTEM_FK1", "BSystemList", this, BSystemDbm.getInstance(), mp, false, "BTimeZone");
    }
    /**
     * M_CENTER by TIME_ZONE_ID, named 'MCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTimeZoneId(), MCenterDbm.getInstance().columnTimeZoneId());
        return cri("M_CENTER_FK1", "MCenterList", this, MCenterDbm.getInstance(), mp, false, "BTimeZone");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BTimeZone"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BTimeZoneCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BTimeZoneBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BTimeZone> getEntityType() { return BTimeZone.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BTimeZone newEntity() { return new BTimeZone(); }
    public BTimeZone newMyEntity() { return new BTimeZone(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BTimeZone)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BTimeZone)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
