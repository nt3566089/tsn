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
 * The DB meta of T_CDRCATTSRB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCdrcattsrbDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCdrcattsrbDbm _instance = new TCdrcattsrbDbm();
    private TCdrcattsrbDbm() {}
    public static TCdrcattsrbDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getHoumenSortBlockId(), (et, vl) -> ((TCdrcattsrb)et).setHoumenSortBlockId(ctl(vl)), "houmenSortBlockId");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getZzorgncd(), (et, vl) -> ((TCdrcattsrb)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getDpcd(), (et, vl) -> ((TCdrcattsrb)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getDlvymd(), (et, vl) -> ((TCdrcattsrb)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getDrccd(), (et, vl) -> ((TCdrcattsrb)et).setDrccd((String)vl), "drccd");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getZzpstnid(), (et, vl) -> ((TCdrcattsrb)et).setZzpstnid((String)vl), "zzpstnid");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getSroprtcnt(), (et, vl) -> ((TCdrcattsrb)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getIoid(), (et, vl) -> ((TCdrcattsrb)et).setIoid((String)vl), "ioid");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getSrlin(), (et, vl) -> ((TCdrcattsrb)et).setSrlin((String)vl), "srlin");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getBlkcd(), (et, vl) -> ((TCdrcattsrb)et).setBlkcd((String)vl), "blkcd");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getBlksrrnks(), (et, vl) -> ((TCdrcattsrb)et).setBlksrrnks(ctl(vl)), "blksrrnks");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getBlksrrnk(), (et, vl) -> ((TCdrcattsrb)et).setBlksrrnk(ctl(vl)), "blksrrnk");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getBlkswunit(), (et, vl) -> ((TCdrcattsrb)et).setBlkswunit(ctl(vl)), "blkswunit");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getBlkswnum(), (et, vl) -> ((TCdrcattsrb)et).setBlkswnum(ctl(vl)), "blkswnum");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getComt(), (et, vl) -> ((TCdrcattsrb)et).setComt((String)vl), "comt");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getWrkmfg(), (et, vl) -> ((TCdrcattsrb)et).setWrkmfg((String)vl), "wrkmfg");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getSortDate(), (et, vl) -> ((TCdrcattsrb)et).setSortDate((String)vl), "sortDate");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getCenterId(), (et, vl) -> ((TCdrcattsrb)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getDelFlg(), (et, vl) -> ((TCdrcattsrb)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getVersionNo(), (et, vl) -> ((TCdrcattsrb)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getControlNo(), (et, vl) -> ((TCdrcattsrb)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getAddDt(), (et, vl) -> ((TCdrcattsrb)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getAddUser(), (et, vl) -> ((TCdrcattsrb)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getAddProcess(), (et, vl) -> ((TCdrcattsrb)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getUpdDt(), (et, vl) -> ((TCdrcattsrb)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getUpdUser(), (et, vl) -> ((TCdrcattsrb)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCdrcattsrb)et).getUpdProcess(), (et, vl) -> ((TCdrcattsrb)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CDRCATTSRB";
    protected final String _tableDispName = "T_CDRCATTSRB";
    protected final String _tablePropertyName = "TCdrcattsrb";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CDRCATTSRB", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHoumenSortBlockId = cci("HOUMEN_SORT_BLOCK_ID", "HOUMEN_SORT_BLOCK_ID", null, null, Long.class, "houmenSortBlockId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDrccd = cci("DRCCD", "DRCCD", null, null, String.class, "drccd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzpstnid = cci("ZZPSTNID", "ZZPSTNID", null, null, String.class, "zzpstnid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIoid = cci("IOID", "IOID", null, null, String.class, "ioid", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlin = cci("SRLIN", "SRLIN", null, null, String.class, "srlin", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlkcd = cci("BLKCD", "BLKCD", null, null, String.class, "blkcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlksrrnks = cci("BLKSRRNKS", "BLKSRRNKS", null, null, Long.class, "blksrrnks", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlksrrnk = cci("BLKSRRNK", "BLKSRRNK", null, null, Long.class, "blksrrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlkswunit = cci("BLKSWUNIT", "BLKSWUNIT", null, null, Long.class, "blkswunit", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlkswnum = cci("BLKSWNUM", "BLKSWNUM", null, null, Long.class, "blkswnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComt = cci("COMT", "COMT", null, null, String.class, "comt", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrkmfg = cci("WRKMFG", "WRKMFG", null, null, String.class, "wrkmfg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * HOUMEN_SORT_BLOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHoumenSortBlockId() { return _columnHoumenSortBlockId; }
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
     * SRLIN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrlin() { return _columnSrlin; }
    /**
     * BLKCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlkcd() { return _columnBlkcd; }
    /**
     * BLKSRRNKS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlksrrnks() { return _columnBlksrrnks; }
    /**
     * BLKSRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlksrrnk() { return _columnBlksrrnk; }
    /**
     * BLKSWUNIT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlkswunit() { return _columnBlkswunit; }
    /**
     * BLKSWNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlkswnum() { return _columnBlkswnum; }
    /**
     * COMT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComt() { return _columnComt; }
    /**
     * WRKMFG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrkmfg() { return _columnWrkmfg; }
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
        ls.add(columnHoumenSortBlockId());
        ls.add(columnZzorgncd());
        ls.add(columnDpcd());
        ls.add(columnDlvymd());
        ls.add(columnDrccd());
        ls.add(columnZzpstnid());
        ls.add(columnSroprtcnt());
        ls.add(columnIoid());
        ls.add(columnSrlin());
        ls.add(columnBlkcd());
        ls.add(columnBlksrrnks());
        ls.add(columnBlksrrnk());
        ls.add(columnBlkswunit());
        ls.add(columnBlkswnum());
        ls.add(columnComt());
        ls.add(columnWrkmfg());
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
    protected UniqueInfo cpui() { return hpcpui(columnHoumenSortBlockId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCdrcattsrb"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCdrcattsrbCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCdrcattsrbBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCdrcattsrb> getEntityType() { return TCdrcattsrb.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCdrcattsrb newEntity() { return new TCdrcattsrb(); }
    public TCdrcattsrb newMyEntity() { return new TCdrcattsrb(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCdrcattsrb)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCdrcattsrb)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
