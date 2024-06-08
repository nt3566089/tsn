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
 * The DB meta of T_TRPALLETEXP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpalletexpDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpalletexpDbm _instance = new TTrpalletexpDbm();
    private TTrpalletexpDbm() {}
    public static TTrpalletexpDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getTrpalletexpId(), (et, vl) -> ((TTrpalletexp)et).setTrpalletexpId(ctl(vl)), "trpalletexpId");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getPalletno(), (et, vl) -> ((TTrpalletexp)et).setPalletno(ctl(vl)), "palletno");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getRtnrcvkbn(), (et, vl) -> ((TTrpalletexp)et).setRtnrcvkbn((String)vl), "rtnrcvkbn");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getVaExtdata1(), (et, vl) -> ((TTrpalletexp)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getVaExtdata2(), (et, vl) -> ((TTrpalletexp)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getVaExtdata3(), (et, vl) -> ((TTrpalletexp)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getNvExtdata1(), (et, vl) -> ((TTrpalletexp)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getNvExtdata2(), (et, vl) -> ((TTrpalletexp)et).setNvExtdata2((String)vl), "nvExtdata2");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getNvExtdata3(), (et, vl) -> ((TTrpalletexp)et).setNvExtdata3((String)vl), "nvExtdata3");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getNmExtdata1(), (et, vl) -> ((TTrpalletexp)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getNmExtdata2(), (et, vl) -> ((TTrpalletexp)et).setNmExtdata2(ctl(vl)), "nmExtdata2");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getNmExtdata3(), (et, vl) -> ((TTrpalletexp)et).setNmExtdata3(ctl(vl)), "nmExtdata3");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getDtExtdata1(), (et, vl) -> ((TTrpalletexp)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getDtExtdata2(), (et, vl) -> ((TTrpalletexp)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getDtExtdata3(), (et, vl) -> ((TTrpalletexp)et).setDtExtdata3((String)vl), "dtExtdata3");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getDelFlg(), (et, vl) -> ((TTrpalletexp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getVersionNo(), (et, vl) -> ((TTrpalletexp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getControlNo(), (et, vl) -> ((TTrpalletexp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getAddDt(), (et, vl) -> ((TTrpalletexp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getAddUser(), (et, vl) -> ((TTrpalletexp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getAddProcess(), (et, vl) -> ((TTrpalletexp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getUpdDt(), (et, vl) -> ((TTrpalletexp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getUpdUser(), (et, vl) -> ((TTrpalletexp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpalletexp)et).getUpdProcess(), (et, vl) -> ((TTrpalletexp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPALLETEXP";
    protected final String _tableDispName = "T_TRPALLETEXP";
    protected final String _tablePropertyName = "TTrpalletexp";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPALLETEXP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrpalletexpId = cci("TRPALLETEXP_ID", "TRPALLETEXP_ID", null, null, Long.class, "trpalletexpId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletno = cci("PALLETNO", "PALLETNO", null, null, Long.class, "palletno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRtnrcvkbn = cci("RTNRCVKBN", "RTNRCVKBN", null, null, String.class, "rtnrcvkbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata1 = cci("VA_EXTDATA1", "VA_EXTDATA1", null, null, String.class, "vaExtdata1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata2 = cci("VA_EXTDATA2", "VA_EXTDATA2", null, null, String.class, "vaExtdata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata3 = cci("VA_EXTDATA3", "VA_EXTDATA3", null, null, String.class, "vaExtdata3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata1 = cci("NV_EXTDATA1", "NV_EXTDATA1", null, null, String.class, "nvExtdata1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata2 = cci("NV_EXTDATA2", "NV_EXTDATA2", null, null, String.class, "nvExtdata2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata3 = cci("NV_EXTDATA3", "NV_EXTDATA3", null, null, String.class, "nvExtdata3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata1 = cci("NM_EXTDATA1", "NM_EXTDATA1", null, null, Long.class, "nmExtdata1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata2 = cci("NM_EXTDATA2", "NM_EXTDATA2", null, null, Long.class, "nmExtdata2", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata3 = cci("NM_EXTDATA3", "NM_EXTDATA3", null, null, Long.class, "nmExtdata3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata1 = cci("DT_EXTDATA1", "DT_EXTDATA1", null, null, String.class, "dtExtdata1", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata2 = cci("DT_EXTDATA2", "DT_EXTDATA2", null, null, String.class, "dtExtdata2", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata3 = cci("DT_EXTDATA3", "DT_EXTDATA3", null, null, String.class, "dtExtdata3", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * TRPALLETEXP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletexpId() { return _columnTrpalletexpId; }
    /**
     * PALLETNO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletno() { return _columnPalletno; }
    /**
     * RTNRCVKBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRtnrcvkbn() { return _columnRtnrcvkbn; }
    /**
     * VA_EXTDATA1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata1() { return _columnVaExtdata1; }
    /**
     * VA_EXTDATA2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata2() { return _columnVaExtdata2; }
    /**
     * VA_EXTDATA3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata3() { return _columnVaExtdata3; }
    /**
     * NV_EXTDATA1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata1() { return _columnNvExtdata1; }
    /**
     * NV_EXTDATA2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata2() { return _columnNvExtdata2; }
    /**
     * NV_EXTDATA3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata3() { return _columnNvExtdata3; }
    /**
     * NM_EXTDATA1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata1() { return _columnNmExtdata1; }
    /**
     * NM_EXTDATA2: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata2() { return _columnNmExtdata2; }
    /**
     * NM_EXTDATA3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata3() { return _columnNmExtdata3; }
    /**
     * DT_EXTDATA1: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata1() { return _columnDtExtdata1; }
    /**
     * DT_EXTDATA2: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata2() { return _columnDtExtdata2; }
    /**
     * DT_EXTDATA3: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata3() { return _columnDtExtdata3; }
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
        ls.add(columnTrpalletexpId());
        ls.add(columnPalletno());
        ls.add(columnRtnrcvkbn());
        ls.add(columnVaExtdata1());
        ls.add(columnVaExtdata2());
        ls.add(columnVaExtdata3());
        ls.add(columnNvExtdata1());
        ls.add(columnNvExtdata2());
        ls.add(columnNvExtdata3());
        ls.add(columnNmExtdata1());
        ls.add(columnNmExtdata2());
        ls.add(columnNmExtdata3());
        ls.add(columnDtExtdata1());
        ls.add(columnDtExtdata2());
        ls.add(columnDtExtdata3());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrpalletexpId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpalletexp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpalletexpCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpalletexpBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpalletexp> getEntityType() { return TTrpalletexp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpalletexp newEntity() { return new TTrpalletexp(); }
    public TTrpalletexp newMyEntity() { return new TTrpalletexp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpalletexp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpalletexp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
