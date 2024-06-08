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
 * The DB meta of M_CRELAYBS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCrelaybsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCrelaybsDbm _instance = new MCrelaybsDbm();
    private MCrelaybsDbm() {}
    public static MCrelaybsDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getCrelaybsId(), (et, vl) -> ((MCrelaybs)et).setCrelaybsId(ctl(vl)), "crelaybsId");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybscd(), (et, vl) -> ((MCrelaybs)et).setRlybscd((String)vl), "rlybscd");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getDlvdpcd(), (et, vl) -> ((MCrelaybs)et).setDlvdpcd((String)vl), "dlvdpcd");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybsnm(), (et, vl) -> ((MCrelaybs)et).setRlybsnm((String)vl), "rlybsnm");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybssnm(), (et, vl) -> ((MCrelaybs)et).setRlybssnm((String)vl), "rlybssnm");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybsp(), (et, vl) -> ((MCrelaybs)et).setRlybsp((String)vl), "rlybsp");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybsacd(), (et, vl) -> ((MCrelaybs)et).setRlybsacd((String)vl), "rlybsacd");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybsccd(), (et, vl) -> ((MCrelaybs)et).setRlybsccd((String)vl), "rlybsccd");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybsar(), (et, vl) -> ((MCrelaybs)et).setRlybsar((String)vl), "rlybsar");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybstl(), (et, vl) -> ((MCrelaybs)et).setRlybstl((String)vl), "rlybstl");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybsfn(), (et, vl) -> ((MCrelaybs)et).setRlybsfn((String)vl), "rlybsfn");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlybsid(), (et, vl) -> ((MCrelaybs)et).setRlybsid((String)vl), "rlybsid");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRlyshan(), (et, vl) -> ((MCrelaybs)et).setRlyshan((String)vl), "rlyshan");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getDelymd(), (et, vl) -> ((MCrelaybs)et).setDelymd((String)vl), "delymd");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getChngyd(), (et, vl) -> ((MCrelaybs)et).setChngyd((String)vl), "chngyd");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getUpdtm(), (et, vl) -> ((MCrelaybs)et).setUpdtm((String)vl), "updtm");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getZzfrdateh(), (et, vl) -> ((MCrelaybs)et).setZzfrdateh((String)vl), "zzfrdateh");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getZztodateh(), (et, vl) -> ((MCrelaybs)et).setZztodateh((String)vl), "zztodateh");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getRcdupdps(), (et, vl) -> ((MCrelaybs)et).setRcdupdps((String)vl), "rcdupdps");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getUpdpocd(), (et, vl) -> ((MCrelaybs)et).setUpdpocd((String)vl), "updpocd");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getOtcmpfg(), (et, vl) -> ((MCrelaybs)et).setOtcmpfg((String)vl), "otcmpfg");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getTmcmpfg(), (et, vl) -> ((MCrelaybs)et).setTmcmpfg((String)vl), "tmcmpfg");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getStmid(), (et, vl) -> ((MCrelaybs)et).setStmid((String)vl), "stmid");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getDelFlg(), (et, vl) -> ((MCrelaybs)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getVersionNo(), (et, vl) -> ((MCrelaybs)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getControlNo(), (et, vl) -> ((MCrelaybs)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getAddDt(), (et, vl) -> ((MCrelaybs)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getAddUser(), (et, vl) -> ((MCrelaybs)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getAddProcess(), (et, vl) -> ((MCrelaybs)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getUpdDt(), (et, vl) -> ((MCrelaybs)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getUpdUser(), (et, vl) -> ((MCrelaybs)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCrelaybs)et).getUpdProcess(), (et, vl) -> ((MCrelaybs)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CRELAYBS";
    protected final String _tableDispName = "M_CRELAYBS";
    protected final String _tablePropertyName = "MCrelaybs";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CRELAYBS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCrelaybsId = cci("CRELAYBS_ID", "CRELAYBS_ID", null, null, Long.class, "crelaybsId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybscd = cci("RLYBSCD", "RLYBSCD", null, null, String.class, "rlybscd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvdpcd = cci("DLVDPCD", "DLVDPCD", null, null, String.class, "dlvdpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybsnm = cci("RLYBSNM", "RLYBSNM", null, null, String.class, "rlybsnm", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybssnm = cci("RLYBSSNM", "RLYBSSNM", null, null, String.class, "rlybssnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybsp = cci("RLYBSP", "RLYBSP", null, null, String.class, "rlybsp", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybsacd = cci("RLYBSACD", "RLYBSACD", null, null, String.class, "rlybsacd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybsccd = cci("RLYBSCCD", "RLYBSCCD", null, null, String.class, "rlybsccd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybsar = cci("RLYBSAR", "RLYBSAR", null, null, String.class, "rlybsar", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybstl = cci("RLYBSTL", "RLYBSTL", null, null, String.class, "rlybstl", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybsfn = cci("RLYBSFN", "RLYBSFN", null, null, String.class, "rlybsfn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybsid = cci("RLYBSID", "RLYBSID", null, null, String.class, "rlybsid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlyshan = cci("RLYSHAN", "RLYSHAN", null, null, String.class, "rlyshan", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelymd = cci("DELYMD", "DELYMD", null, null, String.class, "delymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChngyd = cci("CHNGYD", "CHNGYD", null, null, String.class, "chngyd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdtm = cci("UPDTM", "UPDTM", null, null, String.class, "updtm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzfrdateh = cci("ZZFRDATEH", "ZZFRDATEH", null, null, String.class, "zzfrdateh", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztodateh = cci("ZZTODATEH", "ZZTODATEH", null, null, String.class, "zztodateh", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcdupdps = cci("RCDUPDPS", "RCDUPDPS", null, null, String.class, "rcdupdps", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdpocd = cci("UPDPOCD", "UPDPOCD", null, null, String.class, "updpocd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtcmpfg = cci("OTCMPFG", "OTCMPFG", null, null, String.class, "otcmpfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTmcmpfg = cci("TMCMPFG", "TMCMPFG", null, null, String.class, "tmcmpfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStmid = cci("STMID", "STMID", null, null, String.class, "stmid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCrelaybsId() { return _columnCrelaybsId; }
    /**
     * RLYBSCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybscd() { return _columnRlybscd; }
    /**
     * DLVDPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvdpcd() { return _columnDlvdpcd; }
    /**
     * RLYBSNM: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybsnm() { return _columnRlybsnm; }
    /**
     * RLYBSSNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybssnm() { return _columnRlybssnm; }
    /**
     * RLYBSP: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybsp() { return _columnRlybsp; }
    /**
     * RLYBSACD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybsacd() { return _columnRlybsacd; }
    /**
     * RLYBSCCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybsccd() { return _columnRlybsccd; }
    /**
     * RLYBSAR: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybsar() { return _columnRlybsar; }
    /**
     * RLYBSTL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybstl() { return _columnRlybstl; }
    /**
     * RLYBSFN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybsfn() { return _columnRlybsfn; }
    /**
     * RLYBSID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybsid() { return _columnRlybsid; }
    /**
     * RLYSHAN: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlyshan() { return _columnRlyshan; }
    /**
     * DELYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelymd() { return _columnDelymd; }
    /**
     * CHNGYD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChngyd() { return _columnChngyd; }
    /**
     * UPDTM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdtm() { return _columnUpdtm; }
    /**
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzfrdateh() { return _columnZzfrdateh; }
    /**
     * ZZTODATEH: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZztodateh() { return _columnZztodateh; }
    /**
     * RCDUPDPS: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcdupdps() { return _columnRcdupdps; }
    /**
     * UPDPOCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdpocd() { return _columnUpdpocd; }
    /**
     * OTCMPFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtcmpfg() { return _columnOtcmpfg; }
    /**
     * TMCMPFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTmcmpfg() { return _columnTmcmpfg; }
    /**
     * STMID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStmid() { return _columnStmid; }
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
        ls.add(columnCrelaybsId());
        ls.add(columnRlybscd());
        ls.add(columnDlvdpcd());
        ls.add(columnRlybsnm());
        ls.add(columnRlybssnm());
        ls.add(columnRlybsp());
        ls.add(columnRlybsacd());
        ls.add(columnRlybsccd());
        ls.add(columnRlybsar());
        ls.add(columnRlybstl());
        ls.add(columnRlybsfn());
        ls.add(columnRlybsid());
        ls.add(columnRlyshan());
        ls.add(columnDelymd());
        ls.add(columnChngyd());
        ls.add(columnUpdtm());
        ls.add(columnZzfrdateh());
        ls.add(columnZztodateh());
        ls.add(columnRcdupdps());
        ls.add(columnUpdpocd());
        ls.add(columnOtcmpfg());
        ls.add(columnTmcmpfg());
        ls.add(columnStmid());
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
    protected UniqueInfo cpui() { return hpcpui(columnCrelaybsId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCrelaybs"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCrelaybsCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCrelaybsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCrelaybs> getEntityType() { return MCrelaybs.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCrelaybs newEntity() { return new MCrelaybs(); }
    public MCrelaybs newMyEntity() { return new MCrelaybs(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCrelaybs)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCrelaybs)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
