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
 * The DB meta of T_CCUSAUINF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCcusauinfDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCcusauinfDbm _instance = new TCcusauinfDbm();
    private TCcusauinfDbm() {}
    public static TCcusauinfDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getClientTotalInfoId(), (et, vl) -> ((TCcusauinf)et).setClientTotalInfoId(ctl(vl)), "clientTotalInfoId");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getZzorgncd(), (et, vl) -> ((TCcusauinf)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getDpcd(), (et, vl) -> ((TCcusauinf)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getDlvymd(), (et, vl) -> ((TCcusauinf)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getDed(), (et, vl) -> ((TCcusauinf)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getZzpstnid(), (et, vl) -> ((TCcusauinf)et).setZzpstnid((String)vl), "zzpstnid");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getSroprtymd(), (et, vl) -> ((TCcusauinf)et).setSroprtymd((String)vl), "sroprtymd");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getSroprtcnt(), (et, vl) -> ((TCcusauinf)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getDlvsnm(), (et, vl) -> ((TCcusauinf)et).setDlvsnm(ctl(vl)), "dlvsnm");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getDlvdtlsnm(), (et, vl) -> ((TCcusauinf)et).setDlvdtlsnm(ctl(vl)), "dlvdtlsnm");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getSscd(), (et, vl) -> ((TCcusauinf)et).setSscd((String)vl), "sscd");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getSsnm(), (et, vl) -> ((TCcusauinf)et).setSsnm((String)vl), "ssnm");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getSrqacb(), (et, vl) -> ((TCcusauinf)et).setSrqacb(ctl(vl)), "srqacb");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getSrqacblin(), (et, vl) -> ((TCcusauinf)et).setSrqacblin(ctl(vl)), "srqacblin");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getSrqacbblk(), (et, vl) -> ((TCcusauinf)et).setSrqacbblk(ctl(vl)), "srqacbblk");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getSrqacbdm(), (et, vl) -> ((TCcusauinf)et).setSrqacbdm(ctl(vl)), "srqacbdm");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getCenterId(), (et, vl) -> ((TCcusauinf)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getDelFlg(), (et, vl) -> ((TCcusauinf)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getVersionNo(), (et, vl) -> ((TCcusauinf)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getControlNo(), (et, vl) -> ((TCcusauinf)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getAddDt(), (et, vl) -> ((TCcusauinf)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getAddUser(), (et, vl) -> ((TCcusauinf)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getAddProcess(), (et, vl) -> ((TCcusauinf)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getUpdDt(), (et, vl) -> ((TCcusauinf)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getUpdUser(), (et, vl) -> ((TCcusauinf)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCcusauinf)et).getUpdProcess(), (et, vl) -> ((TCcusauinf)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CCUSAUINF";
    protected final String _tableDispName = "T_CCUSAUINF";
    protected final String _tablePropertyName = "TCcusauinf";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CCUSAUINF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientTotalInfoId = cci("CLIENT_TOTAL_INFO_ID", "CLIENT_TOTAL_INFO_ID", null, null, Long.class, "clientTotalInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzpstnid = cci("ZZPSTNID", "ZZPSTNID", null, null, String.class, "zzpstnid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtymd = cci("SROPRTYMD", "SROPRTYMD", null, null, String.class, "sroprtymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvsnm = cci("DLVSNM", "DLVSNM", null, null, Long.class, "dlvsnm", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvdtlsnm = cci("DLVDTLSNM", "DLVDTLSNM", null, null, Long.class, "dlvdtlsnm", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscd = cci("SSCD", "SSCD", null, null, String.class, "sscd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSsnm = cci("SSNM", "SSNM", null, null, String.class, "ssnm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrqacb = cci("SRQACB", "SRQACB", null, null, Long.class, "srqacb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrqacblin = cci("SRQACBLIN", "SRQACBLIN", null, null, Long.class, "srqacblin", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrqacbblk = cci("SRQACBBLK", "SRQACBBLK", null, null, Long.class, "srqacbblk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrqacbdm = cci("SRQACBDM", "SRQACBDM", null, null, Long.class, "srqacbdm", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientTotalInfoId() { return _columnClientTotalInfoId; }
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
     * DED: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * ZZPSTNID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzpstnid() { return _columnZzpstnid; }
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
     * DLVSNM: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvsnm() { return _columnDlvsnm; }
    /**
     * DLVDTLSNM: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvdtlsnm() { return _columnDlvdtlsnm; }
    /**
     * SSCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscd() { return _columnSscd; }
    /**
     * SSNM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSsnm() { return _columnSsnm; }
    /**
     * SRQACB: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrqacb() { return _columnSrqacb; }
    /**
     * SRQACBLIN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrqacblin() { return _columnSrqacblin; }
    /**
     * SRQACBBLK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrqacbblk() { return _columnSrqacbblk; }
    /**
     * SRQACBDM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrqacbdm() { return _columnSrqacbdm; }
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
        ls.add(columnClientTotalInfoId());
        ls.add(columnZzorgncd());
        ls.add(columnDpcd());
        ls.add(columnDlvymd());
        ls.add(columnDed());
        ls.add(columnZzpstnid());
        ls.add(columnSroprtymd());
        ls.add(columnSroprtcnt());
        ls.add(columnDlvsnm());
        ls.add(columnDlvdtlsnm());
        ls.add(columnSscd());
        ls.add(columnSsnm());
        ls.add(columnSrqacb());
        ls.add(columnSrqacblin());
        ls.add(columnSrqacbblk());
        ls.add(columnSrqacbdm());
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
    protected UniqueInfo cpui() { return hpcpui(columnClientTotalInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCcusauinf"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCcusauinfCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCcusauinfBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCcusauinf> getEntityType() { return TCcusauinf.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCcusauinf newEntity() { return new TCcusauinf(); }
    public TCcusauinf newMyEntity() { return new TCcusauinf(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCcusauinf)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCcusauinf)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
