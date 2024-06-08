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
 * The DB meta of T_CSRSTINF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCsrstinfDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCsrstinfDbm _instance = new TCsrstinfDbm();
    private TCsrstinfDbm() {}
    public static TCsrstinfDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSortStatisticsInfoId(), (et, vl) -> ((TCsrstinf)et).setSortStatisticsInfoId(ctl(vl)), "sortStatisticsInfoId");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getZzorgncd(), (et, vl) -> ((TCsrstinf)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSroprtymd(), (et, vl) -> ((TCsrstinf)et).setSroprtymd((String)vl), "sroprtymd");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSroprtcnt(), (et, vl) -> ((TCsrstinf)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getLinblk(), (et, vl) -> ((TCsrstinf)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getDlvymd(), (et, vl) -> ((TCsrstinf)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getDpcd(), (et, vl) -> ((TCsrstinf)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getDed(), (et, vl) -> ((TCsrstinf)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getPstnid(), (et, vl) -> ((TCsrstinf)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSrlincd(), (et, vl) -> ((TCsrstinf)et).setSrlincd((String)vl), "srlincd");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSrrnk(), (et, vl) -> ((TCsrstinf)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSrpat(), (et, vl) -> ((TCsrstinf)et).setSrpat(ctl(vl)), "srpat");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getTtbrqa(), (et, vl) -> ((TCsrstinf)et).setTtbrqa(ctl(vl)), "ttbrqa");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getShpqa(), (et, vl) -> ((TCsrstinf)et).setShpqa(ctl(vl)), "shpqa");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqasftpcl(), (et, vl) -> ((TCsrstinf)et).setSprqasftpcl(ctl(vl)), "sprqasftpcl");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqatsnbox(), (et, vl) -> ((TCsrstinf)et).setSprqatsnbox(ctl(vl)), "sprqatsnbox");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqajtbox(), (et, vl) -> ((TCsrstinf)et).setSprqajtbox(ctl(vl)), "sprqajtbox");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqa100box(), (et, vl) -> ((TCsrstinf)et).setSprqa100box(ctl(vl)), "sprqa100box");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqahl(), (et, vl) -> ((TCsrstinf)et).setSprqahl(ctl(vl)), "sprqahl");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqaful(), (et, vl) -> ((TCsrstinf)et).setSprqaful(ctl(vl)), "sprqaful");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqahlbgbox(), (et, vl) -> ((TCsrstinf)et).setSprqahlbgbox(ctl(vl)), "sprqahlbgbox");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqahl12box(), (et, vl) -> ((TCsrstinf)et).setSprqahl12box(ctl(vl)), "sprqahl12box");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getSprqahl5box(), (et, vl) -> ((TCsrstinf)et).setSprqahl5box(ctl(vl)), "sprqahl5box");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getDelFlg(), (et, vl) -> ((TCsrstinf)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getVersionNo(), (et, vl) -> ((TCsrstinf)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getControlNo(), (et, vl) -> ((TCsrstinf)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getAddDt(), (et, vl) -> ((TCsrstinf)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getAddUser(), (et, vl) -> ((TCsrstinf)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getAddProcess(), (et, vl) -> ((TCsrstinf)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getUpdDt(), (et, vl) -> ((TCsrstinf)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getUpdUser(), (et, vl) -> ((TCsrstinf)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCsrstinf)et).getUpdProcess(), (et, vl) -> ((TCsrstinf)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CSRSTINF";
    protected final String _tableDispName = "T_CSRSTINF";
    protected final String _tablePropertyName = "TCsrstinf";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CSRSTINF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSortStatisticsInfoId = cci("SORT_STATISTICS_INFO_ID", "SORT_STATISTICS_INFO_ID", null, null, Long.class, "sortStatisticsInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtymd = cci("SROPRTYMD", "SROPRTYMD", null, null, String.class, "sroprtymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlincd = cci("SRLINCD", "SRLINCD", null, null, String.class, "srlincd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrpat = cci("SRPAT", "SRPAT", null, null, Long.class, "srpat", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTtbrqa = cci("TTBRQA", "TTBRQA", null, null, Long.class, "ttbrqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShpqa = cci("SHPQA", "SHPQA", null, null, Long.class, "shpqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqasftpcl = cci("SPRQASFTPCL", "SPRQASFTPCL", null, null, Long.class, "sprqasftpcl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqatsnbox = cci("SPRQATSNBOX", "SPRQATSNBOX", null, null, Long.class, "sprqatsnbox", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqajtbox = cci("SPRQAJTBOX", "SPRQAJTBOX", null, null, Long.class, "sprqajtbox", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqa100box = cci("SPRQA100BOX", "SPRQA100BOX", null, null, Long.class, "sprqa100box", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqahl = cci("SPRQAHL", "SPRQAHL", null, null, Long.class, "sprqahl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqaful = cci("SPRQAFUL", "SPRQAFUL", null, null, Long.class, "sprqaful", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqahlbgbox = cci("SPRQAHLBGBOX", "SPRQAHLBGBOX", null, null, Long.class, "sprqahlbgbox", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqahl12box = cci("SPRQAHL12BOX", "SPRQAHL12BOX", null, null, Long.class, "sprqahl12box", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqahl5box = cci("SPRQAHL5BOX", "SPRQAHL5BOX", null, null, Long.class, "sprqahl5box", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortStatisticsInfoId() { return _columnSortStatisticsInfoId; }
    /**
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * SROPRTYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtymd() { return _columnSroprtymd; }
    /**
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * LINBLK: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
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
     * SRLINCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrlincd() { return _columnSrlincd; }
    /**
     * SRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * SRPAT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrpat() { return _columnSrpat; }
    /**
     * TTBRQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTtbrqa() { return _columnTtbrqa; }
    /**
     * SHPQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShpqa() { return _columnShpqa; }
    /**
     * SPRQASFTPCL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqasftpcl() { return _columnSprqasftpcl; }
    /**
     * SPRQATSNBOX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqatsnbox() { return _columnSprqatsnbox; }
    /**
     * SPRQAJTBOX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqajtbox() { return _columnSprqajtbox; }
    /**
     * SPRQA100BOX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqa100box() { return _columnSprqa100box; }
    /**
     * SPRQAHL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqahl() { return _columnSprqahl; }
    /**
     * SPRQAFUL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqaful() { return _columnSprqaful; }
    /**
     * SPRQAHLBGBOX: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqahlbgbox() { return _columnSprqahlbgbox; }
    /**
     * SPRQAHL12BOX: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqahl12box() { return _columnSprqahl12box; }
    /**
     * SPRQAHL5BOX: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqahl5box() { return _columnSprqahl5box; }
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
        ls.add(columnSortStatisticsInfoId());
        ls.add(columnZzorgncd());
        ls.add(columnSroprtymd());
        ls.add(columnSroprtcnt());
        ls.add(columnLinblk());
        ls.add(columnDlvymd());
        ls.add(columnDpcd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnSrlincd());
        ls.add(columnSrrnk());
        ls.add(columnSrpat());
        ls.add(columnTtbrqa());
        ls.add(columnShpqa());
        ls.add(columnSprqasftpcl());
        ls.add(columnSprqatsnbox());
        ls.add(columnSprqajtbox());
        ls.add(columnSprqa100box());
        ls.add(columnSprqahl());
        ls.add(columnSprqaful());
        ls.add(columnSprqahlbgbox());
        ls.add(columnSprqahl12box());
        ls.add(columnSprqahl5box());
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
    protected UniqueInfo cpui() { return hpcpui(columnSortStatisticsInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCsrstinf"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCsrstinfCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCsrstinfBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCsrstinf> getEntityType() { return TCsrstinf.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCsrstinf newEntity() { return new TCsrstinf(); }
    public TCsrstinf newMyEntity() { return new TCsrstinf(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCsrstinf)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCsrstinf)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
