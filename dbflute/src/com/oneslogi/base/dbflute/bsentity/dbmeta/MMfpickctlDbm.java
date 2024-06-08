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
 * The DB meta of M_MFPICKCTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MMfpickctlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MMfpickctlDbm _instance = new MMfpickctlDbm();
    private MMfpickctlDbm() {}
    public static MMfpickctlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getMfpickctlId(), (et, vl) -> ((MMfpickctl)et).setMfpickctlId(ctl(vl)), "mfpickctlId");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getClientId(), (et, vl) -> ((MMfpickctl)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getProductCd(), (et, vl) -> ((MMfpickctl)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getPickfrdate(), (et, vl) -> ((MMfpickctl)et).setPickfrdate((String)vl), "pickfrdate");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getPicktodate(), (et, vl) -> ((MMfpickctl)et).setPicktodate((String)vl), "picktodate");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getPickrank1(), (et, vl) -> ((MMfpickctl)et).setPickrank1((String)vl), "pickrank1");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getPickrank2(), (et, vl) -> ((MMfpickctl)et).setPickrank2((String)vl), "pickrank2");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getPickrank3(), (et, vl) -> ((MMfpickctl)et).setPickrank3((String)vl), "pickrank3");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getPickrank4(), (et, vl) -> ((MMfpickctl)et).setPickrank4((String)vl), "pickrank4");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getPickrank5(), (et, vl) -> ((MMfpickctl)et).setPickrank5((String)vl), "pickrank5");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getValidtype(), (et, vl) -> ((MMfpickctl)et).setValidtype((String)vl), "validtype");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getDelFlg(), (et, vl) -> ((MMfpickctl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getVersionNo(), (et, vl) -> ((MMfpickctl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getControlNo(), (et, vl) -> ((MMfpickctl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getAddDt(), (et, vl) -> ((MMfpickctl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getAddUser(), (et, vl) -> ((MMfpickctl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getAddProcess(), (et, vl) -> ((MMfpickctl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getUpdDt(), (et, vl) -> ((MMfpickctl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getUpdUser(), (et, vl) -> ((MMfpickctl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MMfpickctl)et).getUpdProcess(), (et, vl) -> ((MMfpickctl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MMfpickctl)et).getMClient(), (et, vl) -> ((MMfpickctl)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_MFPICKCTL";
    protected final String _tableDispName = "M_MFPICKCTL";
    protected final String _tablePropertyName = "MMfpickctl";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_MFPICKCTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfpickctlId = cci("MFPICKCTL_ID", "MFPICKCTL_ID", null, null, Long.class, "mfpickctlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickfrdate = cci("PICKFRDATE", "PICKFRDATE", null, null, String.class, "pickfrdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicktodate = cci("PICKTODATE", "PICKTODATE", null, null, String.class, "picktodate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank1 = cci("PICKRANK1", "PICKRANK1", null, null, String.class, "pickrank1", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank2 = cci("PICKRANK2", "PICKRANK2", null, null, String.class, "pickrank2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank3 = cci("PICKRANK3", "PICKRANK3", null, null, String.class, "pickrank3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank4 = cci("PICKRANK4", "PICKRANK4", null, null, String.class, "pickrank4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank5 = cci("PICKRANK5", "PICKRANK5", null, null, String.class, "pickrank5", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidtype = cci("VALIDTYPE", "VALIDTYPE", null, null, String.class, "validtype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfpickctlId() { return _columnMfpickctlId; }
    /**
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PICKFRDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickfrdate() { return _columnPickfrdate; }
    /**
     * PICKTODATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicktodate() { return _columnPicktodate; }
    /**
     * PICKRANK1: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank1() { return _columnPickrank1; }
    /**
     * PICKRANK2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank2() { return _columnPickrank2; }
    /**
     * PICKRANK3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank3() { return _columnPickrank3; }
    /**
     * PICKRANK4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank4() { return _columnPickrank4; }
    /**
     * PICKRANK5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank5() { return _columnPickrank5; }
    /**
     * VALIDTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidtype() { return _columnValidtype; }
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
        ls.add(columnMfpickctlId());
        ls.add(columnClientId());
        ls.add(columnProductCd());
        ls.add(columnPickfrdate());
        ls.add(columnPicktodate());
        ls.add(columnPickrank1());
        ls.add(columnPickrank2());
        ls.add(columnPickrank3());
        ls.add(columnPickrank4());
        ls.add(columnPickrank5());
        ls.add(columnValidtype());
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
    protected UniqueInfo cpui() { return hpcpui(columnMfpickctlId()); }
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
        return cfi("M_MFPICKCTL_FK1", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MMfpickctlList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MMfpickctl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MMfpickctlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MMfpickctlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MMfpickctl> getEntityType() { return MMfpickctl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MMfpickctl newEntity() { return new MMfpickctl(); }
    public MMfpickctl newMyEntity() { return new MMfpickctl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MMfpickctl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MMfpickctl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
