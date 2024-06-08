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
 * The DB meta of T_CCOPAM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCcopamDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCcopamDbm _instance = new TCcopamDbm();
    private TCcopamDbm() {}
    public static TCcopamDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCcopam)et).getCcopamId(), (et, vl) -> ((TCcopam)et).setCcopamId(ctl(vl)), "ccopamId");
        setupEpg(_epgMap, et -> ((TCcopam)et).getCenterId(), (et, vl) -> ((TCcopam)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCcopam)et).getClientId(), (et, vl) -> ((TCcopam)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TCcopam)et).getZzorgncd(), (et, vl) -> ((TCcopam)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCcopam)et).getSnno1(), (et, vl) -> ((TCcopam)et).setSnno1((String)vl), "snno1");
        setupEpg(_epgMap, et -> ((TCcopam)et).getSnno2(), (et, vl) -> ((TCcopam)et).setSnno2((String)vl), "snno2");
        setupEpg(_epgMap, et -> ((TCcopam)et).getSnno3(), (et, vl) -> ((TCcopam)et).setSnno3((String)vl), "snno3");
        setupEpg(_epgMap, et -> ((TCcopam)et).getCarno(), (et, vl) -> ((TCcopam)et).setCarno((String)vl), "carno");
        setupEpg(_epgMap, et -> ((TCcopam)et).getSnymd(), (et, vl) -> ((TCcopam)et).setSnymd((String)vl), "snymd");
        setupEpg(_epgMap, et -> ((TCcopam)et).getArvymd(), (et, vl) -> ((TCcopam)et).setArvymd((String)vl), "arvymd");
        setupEpg(_epgMap, et -> ((TCcopam)et).getSfcd(), (et, vl) -> ((TCcopam)et).setSfcd((String)vl), "sfcd");
        setupEpg(_epgMap, et -> ((TCcopam)et).getStcd(), (et, vl) -> ((TCcopam)et).setStcd((String)vl), "stcd");
        setupEpg(_epgMap, et -> ((TCcopam)et).getGnlpltqa(), (et, vl) -> ((TCcopam)et).setGnlpltqa(ctl(vl)), "gnlpltqa");
        setupEpg(_epgMap, et -> ((TCcopam)et).getOtpltqa(), (et, vl) -> ((TCcopam)et).setOtpltqa(ctl(vl)), "otpltqa");
        setupEpg(_epgMap, et -> ((TCcopam)et).getPlncarknd(), (et, vl) -> ((TCcopam)et).setPlncarknd((String)vl), "plncarknd");
        setupEpg(_epgMap, et -> ((TCcopam)et).getAmcarknd(), (et, vl) -> ((TCcopam)et).setAmcarknd((String)vl), "amcarknd");
        setupEpg(_epgMap, et -> ((TCcopam)et).getSelno1(), (et, vl) -> ((TCcopam)et).setSelno1((String)vl), "selno1");
        setupEpg(_epgMap, et -> ((TCcopam)et).getSelno2(), (et, vl) -> ((TCcopam)et).setSelno2((String)vl), "selno2");
        setupEpg(_epgMap, et -> ((TCcopam)et).getSelno3(), (et, vl) -> ((TCcopam)et).setSelno3((String)vl), "selno3");
        setupEpg(_epgMap, et -> ((TCcopam)et).getTrannm(), (et, vl) -> ((TCcopam)et).setTrannm((String)vl), "trannm");
        setupEpg(_epgMap, et -> ((TCcopam)et).getChgid(), (et, vl) -> ((TCcopam)et).setChgid((String)vl), "chgid");
        setupEpg(_epgMap, et -> ((TCcopam)et).getTdrelayid(), (et, vl) -> ((TCcopam)et).setTdrelayid((String)vl), "tdrelayid");
        setupEpg(_epgMap, et -> ((TCcopam)et).getDelFlg(), (et, vl) -> ((TCcopam)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCcopam)et).getVersionNo(), (et, vl) -> ((TCcopam)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCcopam)et).getControlNo(), (et, vl) -> ((TCcopam)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCcopam)et).getAddDt(), (et, vl) -> ((TCcopam)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCcopam)et).getAddUser(), (et, vl) -> ((TCcopam)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCcopam)et).getAddProcess(), (et, vl) -> ((TCcopam)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCcopam)et).getUpdDt(), (et, vl) -> ((TCcopam)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCcopam)et).getUpdUser(), (et, vl) -> ((TCcopam)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCcopam)et).getUpdProcess(), (et, vl) -> ((TCcopam)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TCcopam)et).getMClient(), (et, vl) -> ((TCcopam)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TCcopam)et).getMCenter(), (et, vl) -> ((TCcopam)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CCOPAM";
    protected final String _tableDispName = "T_CCOPAM";
    protected final String _tablePropertyName = "TCcopam";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CCOPAM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCcopamId = cci("CCOPAM_ID", "CCOPAM_ID", null, null, Long.class, "ccopamId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnno1 = cci("SNNO1", "SNNO1", null, null, String.class, "snno1", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnno2 = cci("SNNO2", "SNNO2", null, null, String.class, "snno2", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnno3 = cci("SNNO3", "SNNO3", null, null, String.class, "snno3", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarno = cci("CARNO", "CARNO", null, null, String.class, "carno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnymd = cci("SNYMD", "SNYMD", null, null, String.class, "snymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArvymd = cci("ARVYMD", "ARVYMD", null, null, String.class, "arvymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSfcd = cci("SFCD", "SFCD", null, null, String.class, "sfcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStcd = cci("STCD", "STCD", null, null, String.class, "stcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGnlpltqa = cci("GNLPLTQA", "GNLPLTQA", null, null, Long.class, "gnlpltqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtpltqa = cci("OTPLTQA", "OTPLTQA", null, null, Long.class, "otpltqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlncarknd = cci("PLNCARKND", "PLNCARKND", null, null, String.class, "plncarknd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmcarknd = cci("AMCARKND", "AMCARKND", null, null, String.class, "amcarknd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelno1 = cci("SELNO1", "SELNO1", null, null, String.class, "selno1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelno2 = cci("SELNO2", "SELNO2", null, null, String.class, "selno2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelno3 = cci("SELNO3", "SELNO3", null, null, String.class, "selno3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrannm = cci("TRANNM", "TRANNM", null, null, String.class, "trannm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChgid = cci("CHGID", "CHGID", null, null, String.class, "chgid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdrelayid = cci("TDRELAYID", "TDRELAYID", null, null, String.class, "tdrelayid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCcopamId() { return _columnCcopamId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * SNNO1: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnno1() { return _columnSnno1; }
    /**
     * SNNO2: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnno2() { return _columnSnno2; }
    /**
     * SNNO3: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnno3() { return _columnSnno3; }
    /**
     * CARNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarno() { return _columnCarno; }
    /**
     * SNYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnymd() { return _columnSnymd; }
    /**
     * ARVYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArvymd() { return _columnArvymd; }
    /**
     * SFCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSfcd() { return _columnSfcd; }
    /**
     * STCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStcd() { return _columnStcd; }
    /**
     * GNLPLTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGnlpltqa() { return _columnGnlpltqa; }
    /**
     * OTPLTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtpltqa() { return _columnOtpltqa; }
    /**
     * PLNCARKND: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlncarknd() { return _columnPlncarknd; }
    /**
     * AMCARKND: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmcarknd() { return _columnAmcarknd; }
    /**
     * SELNO1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelno1() { return _columnSelno1; }
    /**
     * SELNO2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelno2() { return _columnSelno2; }
    /**
     * SELNO3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelno3() { return _columnSelno3; }
    /**
     * TRANNM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrannm() { return _columnTrannm; }
    /**
     * CHGID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChgid() { return _columnChgid; }
    /**
     * TDRELAYID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdrelayid() { return _columnTdrelayid; }
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
        ls.add(columnCcopamId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnZzorgncd());
        ls.add(columnSnno1());
        ls.add(columnSnno2());
        ls.add(columnSnno3());
        ls.add(columnCarno());
        ls.add(columnSnymd());
        ls.add(columnArvymd());
        ls.add(columnSfcd());
        ls.add(columnStcd());
        ls.add(columnGnlpltqa());
        ls.add(columnOtpltqa());
        ls.add(columnPlncarknd());
        ls.add(columnAmcarknd());
        ls.add(columnSelno1());
        ls.add(columnSelno2());
        ls.add(columnSelno3());
        ls.add(columnTrannm());
        ls.add(columnChgid());
        ls.add(columnTdrelayid());
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
    protected UniqueInfo cpui() { return hpcpui(columnCcopamId()); }
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
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_CCOPAM_FK2", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TCcopamList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_CCOPAM_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TCcopamList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCcopam"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCcopamCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCcopamBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCcopam> getEntityType() { return TCcopam.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCcopam newEntity() { return new TCcopam(); }
    public TCcopam newMyEntity() { return new TCcopam(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCcopam)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCcopam)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
