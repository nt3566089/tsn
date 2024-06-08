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
 * The DB meta of M_CDRCATT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCdrcattDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCdrcattDbm _instance = new MCdrcattDbm();
    private MCdrcattDbm() {}
    public static MCdrcattDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getCdrcattid(), (et, vl) -> ((MCdrcatt)et).setCdrcattid(ctl(vl)), "cdrcattid");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getCenterId(), (et, vl) -> ((MCdrcatt)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getClientId(), (et, vl) -> ((MCdrcatt)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getDpcd(), (et, vl) -> ((MCdrcatt)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getDrccd(), (et, vl) -> ((MCdrcatt)et).setDrccd((String)vl), "drccd");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getZzpstnid(), (et, vl) -> ((MCdrcatt)et).setZzpstnid((String)vl), "zzpstnid");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getSrlin(), (et, vl) -> ((MCdrcatt)et).setSrlin((String)vl), "srlin");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getSrrnk(), (et, vl) -> ((MCdrcatt)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getSnmprtrnkad(), (et, vl) -> ((MCdrcatt)et).setSnmprtrnkad((String)vl), "snmprtrnkad");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getSrwkdy(), (et, vl) -> ((MCdrcatt)et).setSrwkdy(ctb(vl)), "srwkdy");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getComt(), (et, vl) -> ((MCdrcatt)et).setComt((String)vl), "comt");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getSprprsid(), (et, vl) -> ((MCdrcatt)et).setSprprsid((String)vl), "sprprsid");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getOddvid(), (et, vl) -> ((MCdrcatt)et).setOddvid((String)vl), "oddvid");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getHdrdbxusid(), (et, vl) -> ((MCdrcatt)et).setHdrdbxusid((String)vl), "hdrdbxusid");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getZzfrdateh(), (et, vl) -> ((MCdrcatt)et).setZzfrdateh((String)vl), "zzfrdateh");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getZztodateh(), (et, vl) -> ((MCdrcatt)et).setZztodateh((String)vl), "zztodateh");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getGrtnid(), (et, vl) -> ((MCdrcatt)et).setGrtnid((String)vl), "grtnid");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getIkeiincldflg(), (et, vl) -> ((MCdrcatt)et).setIkeiincldflg((String)vl), "ikeiincldflg");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getRemoteisland(), (et, vl) -> ((MCdrcatt)et).setRemoteisland((String)vl), "remoteisland");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getDelFlg(), (et, vl) -> ((MCdrcatt)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getVersionNo(), (et, vl) -> ((MCdrcatt)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getControlNo(), (et, vl) -> ((MCdrcatt)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getAddDt(), (et, vl) -> ((MCdrcatt)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getAddUser(), (et, vl) -> ((MCdrcatt)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getAddProcess(), (et, vl) -> ((MCdrcatt)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getUpdDt(), (et, vl) -> ((MCdrcatt)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getUpdUser(), (et, vl) -> ((MCdrcatt)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCdrcatt)et).getUpdProcess(), (et, vl) -> ((MCdrcatt)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCdrcatt)et).getMCenter(), (et, vl) -> ((MCdrcatt)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MCdrcatt)et).getMClient(), (et, vl) -> ((MCdrcatt)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CDRCATT";
    protected final String _tableDispName = "M_CDRCATT";
    protected final String _tablePropertyName = "MCdrcatt";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CDRCATT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCdrcattid = cci("CDRCATTID", "CDRCATTID", null, null, Long.class, "cdrcattid", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDrccd = cci("DRCCD", "DRCCD", null, null, String.class, "drccd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzpstnid = cci("ZZPSTNID", "ZZPSTNID", null, null, String.class, "zzpstnid", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlin = cci("SRLIN", "SRLIN", null, null, String.class, "srlin", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnmprtrnkad = cci("SNMPRTRNKAD", "SNMPRTRNKAD", null, null, String.class, "snmprtrnkad", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrwkdy = cci("SRWKDY", "SRWKDY", null, null, java.math.BigDecimal.class, "srwkdy", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComt = cci("COMT", "COMT", null, null, String.class, "comt", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprprsid = cci("SPRPRSID", "SPRPRSID", null, null, String.class, "sprprsid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOddvid = cci("ODDVID", "ODDVID", null, null, String.class, "oddvid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdbxusid = cci("HDRDBXUSID", "HDRDBXUSID", null, null, String.class, "hdrdbxusid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzfrdateh = cci("ZZFRDATEH", "ZZFRDATEH", null, null, String.class, "zzfrdateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztodateh = cci("ZZTODATEH", "ZZTODATEH", null, null, String.class, "zztodateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrtnid = cci("GRTNID", "GRTNID", null, null, String.class, "grtnid", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIkeiincldflg = cci("IKEIINCLDFLG", "IKEIINCLDFLG", null, null, String.class, "ikeiincldflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemoteisland = cci("REMOTEISLAND", "REMOTEISLAND", null, null, String.class, "remoteisland", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CDRCATTID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCdrcattid() { return _columnCdrcattid; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * DPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * DRCCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDrccd() { return _columnDrccd; }
    /**
     * ZZPSTNID: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzpstnid() { return _columnZzpstnid; }
    /**
     * SRLIN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrlin() { return _columnSrlin; }
    /**
     * SRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * SNMPRTRNKAD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnmprtrnkad() { return _columnSnmprtrnkad; }
    /**
     * SRWKDY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrwkdy() { return _columnSrwkdy; }
    /**
     * COMT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComt() { return _columnComt; }
    /**
     * SPRPRSID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprprsid() { return _columnSprprsid; }
    /**
     * ODDVID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOddvid() { return _columnOddvid; }
    /**
     * HDRDBXUSID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdrdbxusid() { return _columnHdrdbxusid; }
    /**
     * ZZFRDATEH: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzfrdateh() { return _columnZzfrdateh; }
    /**
     * ZZTODATEH: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZztodateh() { return _columnZztodateh; }
    /**
     * GRTNID: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrtnid() { return _columnGrtnid; }
    /**
     * IKEIINCLDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIkeiincldflg() { return _columnIkeiincldflg; }
    /**
     * REMOTEISLAND: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemoteisland() { return _columnRemoteisland; }
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
        ls.add(columnCdrcattid());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnDpcd());
        ls.add(columnDrccd());
        ls.add(columnZzpstnid());
        ls.add(columnSrlin());
        ls.add(columnSrrnk());
        ls.add(columnSnmprtrnkad());
        ls.add(columnSrwkdy());
        ls.add(columnComt());
        ls.add(columnSprprsid());
        ls.add(columnOddvid());
        ls.add(columnHdrdbxusid());
        ls.add(columnZzfrdateh());
        ls.add(columnZztodateh());
        ls.add(columnGrtnid());
        ls.add(columnIkeiincldflg());
        ls.add(columnRemoteisland());
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
    protected UniqueInfo cpui() { return hpcpui(columnCdrcattid()); }
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_CDRCATT_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCdrcattList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_CDRCATT_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCdrcattList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCdrcatt"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCdrcattCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCdrcattBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCdrcatt> getEntityType() { return MCdrcatt.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCdrcatt newEntity() { return new MCdrcatt(); }
    public MCdrcatt newMyEntity() { return new MCdrcatt(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCdrcatt)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCdrcatt)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
