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
 * The DB meta of E_MH_DRCDIZQA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EMhDrcdizqaDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EMhDrcdizqaDbm _instance = new EMhDrcdizqaDbm();
    private EMhDrcdizqaDbm() {}
    public static EMhDrcdizqaDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getMhDrcdizqaId(), (et, vl) -> ((EMhDrcdizqa)et).setMhDrcdizqaId(ctl(vl)), "mhDrcdizqaId");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getLinblk(), (et, vl) -> ((EMhDrcdizqa)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getZnecd(), (et, vl) -> ((EMhDrcdizqa)et).setZnecd((String)vl), "znecd");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getSrrnk(), (et, vl) -> ((EMhDrcdizqa)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getLocno(), (et, vl) -> ((EMhDrcdizqa)et).setLocno((String)vl), "locno");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getZzmatnr(), (et, vl) -> ((EMhDrcdizqa)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getDlvymd(), (et, vl) -> ((EMhDrcdizqa)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getDpcd(), (et, vl) -> ((EMhDrcdizqa)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getDed(), (et, vl) -> ((EMhDrcdizqa)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getPstnid(), (et, vl) -> ((EMhDrcdizqa)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getComt(), (et, vl) -> ((EMhDrcdizqa)et).setComt((String)vl), "comt");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getSroprtcnt(), (et, vl) -> ((EMhDrcdizqa)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getCsroprtcnt(), (et, vl) -> ((EMhDrcdizqa)et).setCsroprtcnt(ctl(vl)), "csroprtcnt");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getCinladdrcsrrnk(), (et, vl) -> ((EMhDrcdizqa)et).setCinladdrcsrrnk(ctl(vl)), "cinladdrcsrrnk");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getZqacp(), (et, vl) -> ((EMhDrcdizqa)et).setZqacp(ctl(vl)), "zqacp");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getZqactqa(), (et, vl) -> ((EMhDrcdizqa)et).setZqactqa(ctl(vl)), "zqactqa");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getSsqa(), (et, vl) -> ((EMhDrcdizqa)et).setSsqa(ctl(vl)), "ssqa");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getSendCd(), (et, vl) -> ((EMhDrcdizqa)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getWorkFlg(), (et, vl) -> ((EMhDrcdizqa)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getDelFlg(), (et, vl) -> ((EMhDrcdizqa)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getVersionNo(), (et, vl) -> ((EMhDrcdizqa)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getControlNo(), (et, vl) -> ((EMhDrcdizqa)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getAddDt(), (et, vl) -> ((EMhDrcdizqa)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getAddUser(), (et, vl) -> ((EMhDrcdizqa)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getAddProcess(), (et, vl) -> ((EMhDrcdizqa)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getUpdDt(), (et, vl) -> ((EMhDrcdizqa)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getUpdUser(), (et, vl) -> ((EMhDrcdizqa)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EMhDrcdizqa)et).getUpdProcess(), (et, vl) -> ((EMhDrcdizqa)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_MH_DRCDIZQA";
    protected final String _tableDispName = "E_MH_DRCDIZQA";
    protected final String _tablePropertyName = "EMhDrcdizqa";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_MH_DRCDIZQA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMhDrcdizqaId = cci("MH_DRCDIZQA_ID", "MH_DRCDIZQA_ID", null, null, Long.class, "mhDrcdizqaId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZnecd = cci("ZNECD", "ZNECD", null, null, String.class, "znecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocno = cci("LOCNO", "LOCNO", null, null, String.class, "locno", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComt = cci("COMT", "COMT", null, null, String.class, "comt", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsroprtcnt = cci("CSROPRTCNT", "CSROPRTCNT", null, null, Long.class, "csroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCinladdrcsrrnk = cci("CINLADDRCSRRNK", "CINLADDRCSRRNK", null, null, Long.class, "cinladdrcsrrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZqacp = cci("ZQACP", "ZQACP", null, null, Long.class, "zqacp", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZqactqa = cci("ZQACTQA", "ZQACTQA", null, null, Long.class, "zqactqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSsqa = cci("SSQA", "SSQA", null, null, Long.class, "ssqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMhDrcdizqaId() { return _columnMhDrcdizqaId; }
    /**
     * LINBLK: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * ZNECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZnecd() { return _columnZnecd; }
    /**
     * SRRNK: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * LOCNO: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocno() { return _columnLocno; }
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
     * PSTNID: {NotNull, char(1)}
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
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * WORK_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
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
        ls.add(columnMhDrcdizqaId());
        ls.add(columnLinblk());
        ls.add(columnZnecd());
        ls.add(columnSrrnk());
        ls.add(columnLocno());
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
        ls.add(columnSendCd());
        ls.add(columnWorkFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnMhDrcdizqaId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EMhDrcdizqa"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EMhDrcdizqaCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EMhDrcdizqaBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EMhDrcdizqa> getEntityType() { return EMhDrcdizqa.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EMhDrcdizqa newEntity() { return new EMhDrcdizqa(); }
    public EMhDrcdizqa newMyEntity() { return new EMhDrcdizqa(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EMhDrcdizqa)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EMhDrcdizqa)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
