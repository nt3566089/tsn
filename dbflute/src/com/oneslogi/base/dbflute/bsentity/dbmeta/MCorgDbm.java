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
 * The DB meta of M_CORG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCorgDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCorgDbm _instance = new MCorgDbm();
    private MCorgDbm() {}
    public static MCorgDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCorg)et).getCorgId(), (et, vl) -> ((MCorg)et).setCorgId(ctl(vl)), "corgId");
        setupEpg(_epgMap, et -> ((MCorg)et).getCenterId(), (et, vl) -> ((MCorg)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCorg)et).getOrgid(), (et, vl) -> ((MCorg)et).setOrgid((String)vl), "orgid");
        setupEpg(_epgMap, et -> ((MCorg)et).getOrgnmkjf(), (et, vl) -> ((MCorg)et).setOrgnmkjf((String)vl), "orgnmkjf");
        setupEpg(_epgMap, et -> ((MCorg)et).getOrgnmknf(), (et, vl) -> ((MCorg)et).setOrgnmknf((String)vl), "orgnmknf");
        setupEpg(_epgMap, et -> ((MCorg)et).getOrgnmkj(), (et, vl) -> ((MCorg)et).setOrgnmkj((String)vl), "orgnmkj");
        setupEpg(_epgMap, et -> ((MCorg)et).getOrgnmkn(), (et, vl) -> ((MCorg)et).setOrgnmkn((String)vl), "orgnmkn");
        setupEpg(_epgMap, et -> ((MCorg)et).getUporgncd(), (et, vl) -> ((MCorg)et).setUporgncd((String)vl), "uporgncd");
        setupEpg(_epgMap, et -> ((MCorg)et).getZzbasecd(), (et, vl) -> ((MCorg)et).setZzbasecd((String)vl), "zzbasecd");
        setupEpg(_epgMap, et -> ((MCorg)et).getZzcomacd(), (et, vl) -> ((MCorg)et).setZzcomacd((String)vl), "zzcomacd");
        setupEpg(_epgMap, et -> ((MCorg)et).getZzwhmgid(), (et, vl) -> ((MCorg)et).setZzwhmgid((String)vl), "zzwhmgid");
        setupEpg(_epgMap, et -> ((MCorg)et).getOtrnk(), (et, vl) -> ((MCorg)et).setOtrnk(ctl(vl)), "otrnk");
        setupEpg(_epgMap, et -> ((MCorg)et).getRdvdid(), (et, vl) -> ((MCorg)et).setRdvdid((String)vl), "rdvdid");
        setupEpg(_epgMap, et -> ((MCorg)et).getZzablymd(), (et, vl) -> ((MCorg)et).setZzablymd((String)vl), "zzablymd");
        setupEpg(_epgMap, et -> ((MCorg)et).getZzfrdateh(), (et, vl) -> ((MCorg)et).setZzfrdateh((String)vl), "zzfrdateh");
        setupEpg(_epgMap, et -> ((MCorg)et).getZztodateh(), (et, vl) -> ((MCorg)et).setZztodateh((String)vl), "zztodateh");
        setupEpg(_epgMap, et -> ((MCorg)et).getSasasid(), (et, vl) -> ((MCorg)et).setSasasid((String)vl), "sasasid");
        setupEpg(_epgMap, et -> ((MCorg)et).getCmlrasid(), (et, vl) -> ((MCorg)et).setCmlrasid((String)vl), "cmlrasid");
        setupEpg(_epgMap, et -> ((MCorg)et).getAnwhnm(), (et, vl) -> ((MCorg)et).setAnwhnm((String)vl), "anwhnm");
        setupEpg(_epgMap, et -> ((MCorg)et).getOdtscd(), (et, vl) -> ((MCorg)et).setOdtscd((String)vl), "odtscd");
        setupEpg(_epgMap, et -> ((MCorg)et).getLnarcd(), (et, vl) -> ((MCorg)et).setLnarcd((String)vl), "lnarcd");
        setupEpg(_epgMap, et -> ((MCorg)et).getDelFlg(), (et, vl) -> ((MCorg)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCorg)et).getVersionNo(), (et, vl) -> ((MCorg)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCorg)et).getControlNo(), (et, vl) -> ((MCorg)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCorg)et).getAddDt(), (et, vl) -> ((MCorg)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCorg)et).getAddUser(), (et, vl) -> ((MCorg)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCorg)et).getAddProcess(), (et, vl) -> ((MCorg)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCorg)et).getUpdDt(), (et, vl) -> ((MCorg)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCorg)et).getUpdUser(), (et, vl) -> ((MCorg)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCorg)et).getUpdProcess(), (et, vl) -> ((MCorg)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCorg)et).getMCenter(), (et, vl) -> ((MCorg)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CORG";
    protected final String _tableDispName = "M_CORG";
    protected final String _tablePropertyName = "MCorg";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CORG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCorgId = cci("CORG_ID", "CORG_ID", null, null, Long.class, "corgId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnOrgid = cci("ORGID", "ORGID", null, null, String.class, "orgid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgnmkjf = cci("ORGNMKJF", "ORGNMKJF", null, null, String.class, "orgnmkjf", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgnmknf = cci("ORGNMKNF", "ORGNMKNF", null, null, String.class, "orgnmknf", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgnmkj = cci("ORGNMKJ", "ORGNMKJ", null, null, String.class, "orgnmkj", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgnmkn = cci("ORGNMKN", "ORGNMKN", null, null, String.class, "orgnmkn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUporgncd = cci("UPORGNCD", "UPORGNCD", null, null, String.class, "uporgncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzbasecd = cci("ZZBASECD", "ZZBASECD", null, null, String.class, "zzbasecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzcomacd = cci("ZZCOMACD", "ZZCOMACD", null, null, String.class, "zzcomacd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzwhmgid = cci("ZZWHMGID", "ZZWHMGID", null, null, String.class, "zzwhmgid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtrnk = cci("OTRNK", "OTRNK", null, null, Long.class, "otrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRdvdid = cci("RDVDID", "RDVDID", null, null, String.class, "rdvdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzablymd = cci("ZZABLYMD", "ZZABLYMD", null, null, String.class, "zzablymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzfrdateh = cci("ZZFRDATEH", "ZZFRDATEH", null, null, String.class, "zzfrdateh", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztodateh = cci("ZZTODATEH", "ZZTODATEH", null, null, String.class, "zztodateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSasasid = cci("SASASID", "SASASID", null, null, String.class, "sasasid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmlrasid = cci("CMLRASID", "CMLRASID", null, null, String.class, "cmlrasid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAnwhnm = cci("ANWHNM", "ANWHNM", null, null, String.class, "anwhnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOdtscd = cci("ODTSCD", "ODTSCD", null, null, String.class, "odtscd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLnarcd = cci("LNARCD", "LNARCD", null, null, String.class, "lnarcd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgId() { return _columnCorgId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * ORGID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgid() { return _columnOrgid; }
    /**
     * ORGNMKJF: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgnmkjf() { return _columnOrgnmkjf; }
    /**
     * ORGNMKNF: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgnmknf() { return _columnOrgnmknf; }
    /**
     * ORGNMKJ: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgnmkj() { return _columnOrgnmkj; }
    /**
     * ORGNMKN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgnmkn() { return _columnOrgnmkn; }
    /**
     * UPORGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUporgncd() { return _columnUporgncd; }
    /**
     * ZZBASECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzbasecd() { return _columnZzbasecd; }
    /**
     * ZZCOMACD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzcomacd() { return _columnZzcomacd; }
    /**
     * ZZWHMGID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzwhmgid() { return _columnZzwhmgid; }
    /**
     * OTRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtrnk() { return _columnOtrnk; }
    /**
     * RDVDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRdvdid() { return _columnRdvdid; }
    /**
     * ZZABLYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzablymd() { return _columnZzablymd; }
    /**
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzfrdateh() { return _columnZzfrdateh; }
    /**
     * ZZTODATEH: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZztodateh() { return _columnZztodateh; }
    /**
     * SASASID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSasasid() { return _columnSasasid; }
    /**
     * CMLRASID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmlrasid() { return _columnCmlrasid; }
    /**
     * ANWHNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAnwhnm() { return _columnAnwhnm; }
    /**
     * ODTSCD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOdtscd() { return _columnOdtscd; }
    /**
     * LNARCD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLnarcd() { return _columnLnarcd; }
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
        ls.add(columnCorgId());
        ls.add(columnCenterId());
        ls.add(columnOrgid());
        ls.add(columnOrgnmkjf());
        ls.add(columnOrgnmknf());
        ls.add(columnOrgnmkj());
        ls.add(columnOrgnmkn());
        ls.add(columnUporgncd());
        ls.add(columnZzbasecd());
        ls.add(columnZzcomacd());
        ls.add(columnZzwhmgid());
        ls.add(columnOtrnk());
        ls.add(columnRdvdid());
        ls.add(columnZzablymd());
        ls.add(columnZzfrdateh());
        ls.add(columnZztodateh());
        ls.add(columnSasasid());
        ls.add(columnCmlrasid());
        ls.add(columnAnwhnm());
        ls.add(columnOdtscd());
        ls.add(columnLnarcd());
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
    protected UniqueInfo cpui() { return hpcpui(columnCorgId()); }
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
        return cfi("M_CORG_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCorgList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCorg"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCorgCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCorgBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCorg> getEntityType() { return MCorg.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCorg newEntity() { return new MCorg(); }
    public MCorg newMyEntity() { return new MCorg(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCorg)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCorg)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
