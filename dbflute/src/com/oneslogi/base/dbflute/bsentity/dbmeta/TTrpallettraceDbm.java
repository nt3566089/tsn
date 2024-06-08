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
 * The DB meta of T_TRPALLETTRACE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpallettraceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpallettraceDbm _instance = new TTrpallettraceDbm();
    private TTrpallettraceDbm() {}
    public static TTrpallettraceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getTrpallettraceId(), (et, vl) -> ((TTrpallettrace)et).setTrpallettraceId(ctl(vl)), "trpallettraceId");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getPallettraceno(), (et, vl) -> ((TTrpallettrace)et).setPallettraceno(ctb(vl)), "pallettraceno");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getPallettracetype(), (et, vl) -> ((TTrpallettrace)et).setPallettracetype((String)vl), "pallettracetype");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getParentpalletno(), (et, vl) -> ((TTrpallettrace)et).setParentpalletno(ctb(vl)), "parentpalletno");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getChildpalletno(), (et, vl) -> ((TTrpallettrace)et).setChildpalletno(ctb(vl)), "childpalletno");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getPicklistkey(), (et, vl) -> ((TTrpallettrace)et).setPicklistkey(ctl(vl)), "picklistkey");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getPicklistgno(), (et, vl) -> ((TTrpallettrace)et).setPicklistgno(ctl(vl)), "picklistgno");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getCreatedatetime(), (et, vl) -> ((TTrpallettrace)et).setCreatedatetime((String)vl), "createdatetime");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getCenterId(), (et, vl) -> ((TTrpallettrace)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getClientId(), (et, vl) -> ((TTrpallettrace)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getDelFlg(), (et, vl) -> ((TTrpallettrace)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getVersionNo(), (et, vl) -> ((TTrpallettrace)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getControlNo(), (et, vl) -> ((TTrpallettrace)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getAddDt(), (et, vl) -> ((TTrpallettrace)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getAddUser(), (et, vl) -> ((TTrpallettrace)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getAddProcess(), (et, vl) -> ((TTrpallettrace)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getUpdDt(), (et, vl) -> ((TTrpallettrace)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getUpdUser(), (et, vl) -> ((TTrpallettrace)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpallettrace)et).getUpdProcess(), (et, vl) -> ((TTrpallettrace)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrpallettrace)et).getMClient(), (et, vl) -> ((TTrpallettrace)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TTrpallettrace)et).getMCenter(), (et, vl) -> ((TTrpallettrace)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPALLETTRACE";
    protected final String _tableDispName = "T_TRPALLETTRACE";
    protected final String _tablePropertyName = "TTrpallettrace";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPALLETTRACE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrpallettraceId = cci("TRPALLETTRACE_ID", "TRPALLETTRACE_ID", null, null, Long.class, "trpallettraceId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPallettraceno = cci("PALLETTRACENO", "PALLETTRACENO", null, null, java.math.BigDecimal.class, "pallettraceno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPallettracetype = cci("PALLETTRACETYPE", "PALLETTRACETYPE", null, null, String.class, "pallettracetype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParentpalletno = cci("PARENTPALLETNO", "PARENTPALLETNO", null, null, java.math.BigDecimal.class, "parentpalletno", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChildpalletno = cci("CHILDPALLETNO", "CHILDPALLETNO", null, null, java.math.BigDecimal.class, "childpalletno", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistkey = cci("PICKLISTKEY", "PICKLISTKEY", null, null, Long.class, "picklistkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistgno = cci("PICKLISTGNO", "PICKLISTGNO", null, null, Long.class, "picklistgno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedatetime = cci("CREATEDATETIME", "CREATEDATETIME", null, null, String.class, "createdatetime", null, false, false, true, "varchar", 8, 0, null, "sysdatetime()", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
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
     * TRPALLETTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpallettraceId() { return _columnTrpallettraceId; }
    /**
     * PALLETTRACENO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPallettraceno() { return _columnPallettraceno; }
    /**
     * PALLETTRACETYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPallettracetype() { return _columnPallettracetype; }
    /**
     * PARENTPALLETNO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentpalletno() { return _columnParentpalletno; }
    /**
     * CHILDPALLETNO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChildpalletno() { return _columnChildpalletno; }
    /**
     * PICKLISTKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistkey() { return _columnPicklistkey; }
    /**
     * PICKLISTGNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistgno() { return _columnPicklistgno; }
    /**
     * CREATEDATETIME: {NotNull, varchar(8), default=[sysdatetime()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedatetime() { return _columnCreatedatetime; }
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
        ls.add(columnTrpallettraceId());
        ls.add(columnPallettraceno());
        ls.add(columnPallettracetype());
        ls.add(columnParentpalletno());
        ls.add(columnChildpalletno());
        ls.add(columnPicklistkey());
        ls.add(columnPicklistgno());
        ls.add(columnCreatedatetime());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrpallettraceId()); }
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
        return cfi("T_TRPALLETTRACE_FK1", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrpallettraceList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_TRPALLETTRACE_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrpallettraceList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpallettrace"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpallettraceCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpallettraceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpallettrace> getEntityType() { return TTrpallettrace.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpallettrace newEntity() { return new TTrpallettrace(); }
    public TTrpallettrace newMyEntity() { return new TTrpallettrace(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpallettrace)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpallettrace)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
