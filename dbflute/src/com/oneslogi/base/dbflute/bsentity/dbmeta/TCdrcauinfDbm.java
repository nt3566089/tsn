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
 * The DB meta of T_CDRCAUINF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCdrcauinfDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCdrcauinfDbm _instance = new TCdrcauinfDbm();
    private TCdrcauinfDbm() {}
    public static TCdrcauinfDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getHoumenTotalInfoId(), (et, vl) -> ((TCdrcauinf)et).setHoumenTotalInfoId(ctl(vl)), "houmenTotalInfoId");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getZzorgncd(), (et, vl) -> ((TCdrcauinf)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getSroprtymd(), (et, vl) -> ((TCdrcauinf)et).setSroprtymd((String)vl), "sroprtymd");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getSroprtcnt(), (et, vl) -> ((TCdrcauinf)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getDlvymd(), (et, vl) -> ((TCdrcauinf)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getDpcd(), (et, vl) -> ((TCdrcauinf)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getZzpstnid(), (et, vl) -> ((TCdrcauinf)et).setZzpstnid((String)vl), "zzpstnid");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getDed(), (et, vl) -> ((TCdrcauinf)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getZzmatnr(), (et, vl) -> ((TCdrcauinf)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getCbqa(), (et, vl) -> ((TCdrcauinf)et).setCbqa(ctl(vl)), "cbqa");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getCtnum(), (et, vl) -> ((TCdrcauinf)et).setCtnum(ctl(vl)), "ctnum");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getZqacp(), (et, vl) -> ((TCdrcauinf)et).setZqacp(ctl(vl)), "zqacp");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getZqactqa(), (et, vl) -> ((TCdrcauinf)et).setZqactqa(ctl(vl)), "zqactqa");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getSsqa(), (et, vl) -> ((TCdrcauinf)et).setSsqa(ctl(vl)), "ssqa");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getSrrnk(), (et, vl) -> ((TCdrcauinf)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getCenterId(), (et, vl) -> ((TCdrcauinf)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getDelFlg(), (et, vl) -> ((TCdrcauinf)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getVersionNo(), (et, vl) -> ((TCdrcauinf)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getControlNo(), (et, vl) -> ((TCdrcauinf)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getAddDt(), (et, vl) -> ((TCdrcauinf)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getAddUser(), (et, vl) -> ((TCdrcauinf)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getAddProcess(), (et, vl) -> ((TCdrcauinf)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getUpdDt(), (et, vl) -> ((TCdrcauinf)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getUpdUser(), (et, vl) -> ((TCdrcauinf)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCdrcauinf)et).getUpdProcess(), (et, vl) -> ((TCdrcauinf)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CDRCAUINF";
    protected final String _tableDispName = "T_CDRCAUINF";
    protected final String _tablePropertyName = "TCdrcauinf";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CDRCAUINF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHoumenTotalInfoId = cci("HOUMEN_TOTAL_INFO_ID", "HOUMEN_TOTAL_INFO_ID", null, null, Long.class, "houmenTotalInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtymd = cci("SROPRTYMD", "SROPRTYMD", null, null, String.class, "sroprtymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzpstnid = cci("ZZPSTNID", "ZZPSTNID", null, null, String.class, "zzpstnid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbqa = cci("CBQA", "CBQA", null, null, Long.class, "cbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtnum = cci("CTNUM", "CTNUM", null, null, Long.class, "ctnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZqacp = cci("ZQACP", "ZQACP", null, null, Long.class, "zqacp", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZqactqa = cci("ZQACTQA", "ZQACTQA", null, null, Long.class, "zqactqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSsqa = cci("SSQA", "SSQA", null, null, Long.class, "ssqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * HOUMEN_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHoumenTotalInfoId() { return _columnHoumenTotalInfoId; }
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
     * ZZPSTNID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzpstnid() { return _columnZzpstnid; }
    /**
     * DED: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * ZZMATNR: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnr() { return _columnZzmatnr; }
    /**
     * CBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbqa() { return _columnCbqa; }
    /**
     * CTNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtnum() { return _columnCtnum; }
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
     * SRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
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
        ls.add(columnHoumenTotalInfoId());
        ls.add(columnZzorgncd());
        ls.add(columnSroprtymd());
        ls.add(columnSroprtcnt());
        ls.add(columnDlvymd());
        ls.add(columnDpcd());
        ls.add(columnZzpstnid());
        ls.add(columnDed());
        ls.add(columnZzmatnr());
        ls.add(columnCbqa());
        ls.add(columnCtnum());
        ls.add(columnZqacp());
        ls.add(columnZqactqa());
        ls.add(columnSsqa());
        ls.add(columnSrrnk());
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
    protected UniqueInfo cpui() { return hpcpui(columnHoumenTotalInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCdrcauinf"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCdrcauinfCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCdrcauinfBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCdrcauinf> getEntityType() { return TCdrcauinf.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCdrcauinf newEntity() { return new TCdrcauinf(); }
    public TCdrcauinf newMyEntity() { return new TCdrcauinf(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCdrcauinf)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCdrcauinf)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
