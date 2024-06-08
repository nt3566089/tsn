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
 * The DB meta of T_DRCDIZQA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TDrcdizqaDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TDrcdizqaDbm _instance = new TDrcdizqaDbm();
    private TDrcdizqaDbm() {}
    public static TDrcdizqaDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getHoumenRemainingId(), (et, vl) -> ((TDrcdizqa)et).setHoumenRemainingId(ctl(vl)), "houmenRemainingId");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getZzorgncd(), (et, vl) -> ((TDrcdizqa)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getLinblk(), (et, vl) -> ((TDrcdizqa)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getSrrnk(), (et, vl) -> ((TDrcdizqa)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getLocid(), (et, vl) -> ((TDrcdizqa)et).setLocid((String)vl), "locid");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getZzmatnr(), (et, vl) -> ((TDrcdizqa)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getDlvymd(), (et, vl) -> ((TDrcdizqa)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getDpcd(), (et, vl) -> ((TDrcdizqa)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getDed(), (et, vl) -> ((TDrcdizqa)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getPstnid(), (et, vl) -> ((TDrcdizqa)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getComt(), (et, vl) -> ((TDrcdizqa)et).setComt((String)vl), "comt");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getSroprtcnt(), (et, vl) -> ((TDrcdizqa)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getCsroprtcnt(), (et, vl) -> ((TDrcdizqa)et).setCsroprtcnt(ctl(vl)), "csroprtcnt");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getCinladdrcsrrnk(), (et, vl) -> ((TDrcdizqa)et).setCinladdrcsrrnk(ctl(vl)), "cinladdrcsrrnk");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getZqacp(), (et, vl) -> ((TDrcdizqa)et).setZqacp(ctl(vl)), "zqacp");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getZqactqa(), (et, vl) -> ((TDrcdizqa)et).setZqactqa(ctl(vl)), "zqactqa");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getSsqa(), (et, vl) -> ((TDrcdizqa)et).setSsqa(ctl(vl)), "ssqa");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getDscb(), (et, vl) -> ((TDrcdizqa)et).setDscb(ctl(vl)), "dscb");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getDsct(), (et, vl) -> ((TDrcdizqa)et).setDsct(ctl(vl)), "dsct");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getSrlin(), (et, vl) -> ((TDrcdizqa)et).setSrlin((String)vl), "srlin");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getStockdate(), (et, vl) -> ((TDrcdizqa)et).setStockdate((String)vl), "stockdate");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getCenterId(), (et, vl) -> ((TDrcdizqa)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getClientId(), (et, vl) -> ((TDrcdizqa)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getDelFlg(), (et, vl) -> ((TDrcdizqa)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getVersionNo(), (et, vl) -> ((TDrcdizqa)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getControlNo(), (et, vl) -> ((TDrcdizqa)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getAddDt(), (et, vl) -> ((TDrcdizqa)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getAddUser(), (et, vl) -> ((TDrcdizqa)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getAddProcess(), (et, vl) -> ((TDrcdizqa)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getUpdDt(), (et, vl) -> ((TDrcdizqa)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getUpdUser(), (et, vl) -> ((TDrcdizqa)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TDrcdizqa)et).getUpdProcess(), (et, vl) -> ((TDrcdizqa)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_DRCDIZQA";
    protected final String _tableDispName = "T_DRCDIZQA";
    protected final String _tablePropertyName = "TDrcdizqa";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_DRCDIZQA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHoumenRemainingId = cci("HOUMEN_REMAINING_ID", "HOUMEN_REMAINING_ID", null, null, Long.class, "houmenRemainingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocid = cci("LOCID", "LOCID", null, null, String.class, "locid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComt = cci("COMT", "COMT", null, null, String.class, "comt", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsroprtcnt = cci("CSROPRTCNT", "CSROPRTCNT", null, null, Long.class, "csroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCinladdrcsrrnk = cci("CINLADDRCSRRNK", "CINLADDRCSRRNK", null, null, Long.class, "cinladdrcsrrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZqacp = cci("ZQACP", "ZQACP", null, null, Long.class, "zqacp", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZqactqa = cci("ZQACTQA", "ZQACTQA", null, null, Long.class, "zqactqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSsqa = cci("SSQA", "SSQA", null, null, Long.class, "ssqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDscb = cci("DSCB", "DSCB", null, null, Long.class, "dscb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDsct = cci("DSCT", "DSCT", null, null, Long.class, "dsct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlin = cci("SRLIN", "SRLIN", null, null, String.class, "srlin", null, false, false, true, "varchar", 30, 0, null, "  ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockdate = cci("STOCKDATE", "STOCKDATE", null, null, String.class, "stockdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * HOUMEN_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHoumenRemainingId() { return _columnHoumenRemainingId; }
    /**
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * LINBLK: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * SRRNK: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * LOCID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocid() { return _columnLocid; }
    /**
     * ZZMATNR: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnr() { return _columnZzmatnr; }
    /**
     * DLVYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvymd() { return _columnDlvymd; }
    /**
     * DPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * DED: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * PSTNID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPstnid() { return _columnPstnid; }
    /**
     * COMT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComt() { return _columnComt; }
    /**
     * SROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * CSROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsroprtcnt() { return _columnCsroprtcnt; }
    /**
     * CINLADDRCSRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCinladdrcsrrnk() { return _columnCinladdrcsrrnk; }
    /**
     * ZQACP: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZqacp() { return _columnZqacp; }
    /**
     * ZQACTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZqactqa() { return _columnZqactqa; }
    /**
     * SSQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSsqa() { return _columnSsqa; }
    /**
     * DSCB: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDscb() { return _columnDscb; }
    /**
     * DSCT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDsct() { return _columnDsct; }
    /**
     * SRLIN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrlin() { return _columnSrlin; }
    /**
     * STOCKDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockdate() { return _columnStockdate; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnHoumenRemainingId());
        ls.add(columnZzorgncd());
        ls.add(columnLinblk());
        ls.add(columnSrrnk());
        ls.add(columnLocid());
        ls.add(columnZzmatnr());
        ls.add(columnDlvymd());
        ls.add(columnDpcd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnComt());
        ls.add(columnSroprtcnt());
        ls.add(columnCsroprtcnt());
        ls.add(columnCinladdrcsrrnk());
        ls.add(columnZqacp());
        ls.add(columnZqactqa());
        ls.add(columnSsqa());
        ls.add(columnDscb());
        ls.add(columnDsct());
        ls.add(columnSrlin());
        ls.add(columnStockdate());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnHoumenRemainingId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TDrcdizqa"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TDrcdizqaCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TDrcdizqaBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TDrcdizqa> getEntityType() { return TDrcdizqa.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TDrcdizqa newEntity() { return new TDrcdizqa(); }
    public TDrcdizqa newMyEntity() { return new TDrcdizqa(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TDrcdizqa)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TDrcdizqa)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
