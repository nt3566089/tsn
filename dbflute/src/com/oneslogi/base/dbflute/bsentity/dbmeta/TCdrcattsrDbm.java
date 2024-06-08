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
 * The DB meta of T_CDRCATTSR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCdrcattsrDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCdrcattsrDbm _instance = new TCdrcattsrDbm();
    private TCdrcattsrDbm() {}
    public static TCdrcattsrDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getHoumenSortId(), (et, vl) -> ((TCdrcattsr)et).setHoumenSortId(ctl(vl)), "houmenSortId");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getZzorgncd(), (et, vl) -> ((TCdrcattsr)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getDpcd(), (et, vl) -> ((TCdrcattsr)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getDlvymd(), (et, vl) -> ((TCdrcattsr)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getDrccd(), (et, vl) -> ((TCdrcattsr)et).setDrccd((String)vl), "drccd");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getZzpstnid(), (et, vl) -> ((TCdrcattsr)et).setZzpstnid((String)vl), "zzpstnid");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getSrlin(), (et, vl) -> ((TCdrcattsr)et).setSrlin((String)vl), "srlin");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getSrrnk(), (et, vl) -> ((TCdrcattsr)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getSnmprtrnkad(), (et, vl) -> ((TCdrcattsr)et).setSnmprtrnkad((String)vl), "snmprtrnkad");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getSrwkdy(), (et, vl) -> ((TCdrcattsr)et).setSrwkdy(ctb(vl)), "srwkdy");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getComt(), (et, vl) -> ((TCdrcattsr)et).setComt((String)vl), "comt");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getSprprsid(), (et, vl) -> ((TCdrcattsr)et).setSprprsid((String)vl), "sprprsid");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getOddvid(), (et, vl) -> ((TCdrcattsr)et).setOddvid((String)vl), "oddvid");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getHdrdbxusid(), (et, vl) -> ((TCdrcattsr)et).setHdrdbxusid((String)vl), "hdrdbxusid");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getSroprtcnt(), (et, vl) -> ((TCdrcattsr)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getIoid(), (et, vl) -> ((TCdrcattsr)et).setIoid((String)vl), "ioid");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getWrkmfg(), (et, vl) -> ((TCdrcattsr)et).setWrkmfg((String)vl), "wrkmfg");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getIkeiincldflg(), (et, vl) -> ((TCdrcattsr)et).setIkeiincldflg((String)vl), "ikeiincldflg");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getSortDate(), (et, vl) -> ((TCdrcattsr)et).setSortDate((String)vl), "sortDate");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getCenterId(), (et, vl) -> ((TCdrcattsr)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getDelFlg(), (et, vl) -> ((TCdrcattsr)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getVersionNo(), (et, vl) -> ((TCdrcattsr)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getControlNo(), (et, vl) -> ((TCdrcattsr)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getAddDt(), (et, vl) -> ((TCdrcattsr)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getAddUser(), (et, vl) -> ((TCdrcattsr)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getAddProcess(), (et, vl) -> ((TCdrcattsr)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getUpdDt(), (et, vl) -> ((TCdrcattsr)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getUpdUser(), (et, vl) -> ((TCdrcattsr)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCdrcattsr)et).getUpdProcess(), (et, vl) -> ((TCdrcattsr)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CDRCATTSR";
    protected final String _tableDispName = "T_CDRCATTSR";
    protected final String _tablePropertyName = "TCdrcattsr";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CDRCATTSR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHoumenSortId = cci("HOUMEN_SORT_ID", "HOUMEN_SORT_ID", null, null, Long.class, "houmenSortId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDrccd = cci("DRCCD", "DRCCD", null, null, String.class, "drccd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzpstnid = cci("ZZPSTNID", "ZZPSTNID", null, null, String.class, "zzpstnid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlin = cci("SRLIN", "SRLIN", null, null, String.class, "srlin", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnmprtrnkad = cci("SNMPRTRNKAD", "SNMPRTRNKAD", null, null, String.class, "snmprtrnkad", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrwkdy = cci("SRWKDY", "SRWKDY", null, null, java.math.BigDecimal.class, "srwkdy", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComt = cci("COMT", "COMT", null, null, String.class, "comt", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprprsid = cci("SPRPRSID", "SPRPRSID", null, null, String.class, "sprprsid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOddvid = cci("ODDVID", "ODDVID", null, null, String.class, "oddvid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdbxusid = cci("HDRDBXUSID", "HDRDBXUSID", null, null, String.class, "hdrdbxusid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIoid = cci("IOID", "IOID", null, null, String.class, "ioid", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrkmfg = cci("WRKMFG", "WRKMFG", null, null, String.class, "wrkmfg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIkeiincldflg = cci("IKEIINCLDFLG", "IKEIINCLDFLG", null, null, String.class, "ikeiincldflg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortDate = cci("SORT_DATE", "SORT_DATE", null, null, String.class, "sortDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * HOUMEN_SORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHoumenSortId() { return _columnHoumenSortId; }
    /**
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * DPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * DLVYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvymd() { return _columnDlvymd; }
    /**
     * DRCCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDrccd() { return _columnDrccd; }
    /**
     * ZZPSTNID: {NotNull, varchar(30)}
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
     * SRWKDY: {decimal(16, 6)}
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
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * IOID: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIoid() { return _columnIoid; }
    /**
     * WRKMFG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrkmfg() { return _columnWrkmfg; }
    /**
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIkeiincldflg() { return _columnIkeiincldflg; }
    /**
     * SORT_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortDate() { return _columnSortDate; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
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
        ls.add(columnHoumenSortId());
        ls.add(columnZzorgncd());
        ls.add(columnDpcd());
        ls.add(columnDlvymd());
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
        ls.add(columnSroprtcnt());
        ls.add(columnIoid());
        ls.add(columnWrkmfg());
        ls.add(columnIkeiincldflg());
        ls.add(columnSortDate());
        ls.add(columnCenterId());
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
    protected UniqueInfo cpui() { return hpcpui(columnHoumenSortId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCdrcattsr"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCdrcattsrCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCdrcattsrBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCdrcattsr> getEntityType() { return TCdrcattsr.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCdrcattsr newEntity() { return new TCdrcattsr(); }
    public TCdrcattsr newMyEntity() { return new TCdrcattsr(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCdrcattsr)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCdrcattsr)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
