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
 * The DB meta of T_TRSOJT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsojtDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsojtDbm _instance = new TTrsojtDbm();
    private TTrsojtDbm() {}
    public static TTrsojtDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsojt)et).getSojtid(), (et, vl) -> ((TTrsojt)et).setSojtid(ctl(vl)), "sojtid");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getSojtkey(), (et, vl) -> ((TTrsojt)et).setSojtkey(ctb(vl)), "sojtkey");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getOwnersono(), (et, vl) -> ((TTrsojt)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getCustomerCd(), (et, vl) -> ((TTrsojt)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getOrderdate(), (et, vl) -> ((TTrsojt)et).setOrderdate((String)vl), "orderdate");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getPlanseq(), (et, vl) -> ((TTrsojt)et).setPlanseq(ctl(vl)), "planseq");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getPlanrcvdatetime(), (et, vl) -> ((TTrsojt)et).setPlanrcvdatetime(cttp(vl)), "planrcvdatetime");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getBeforeplanseq(), (et, vl) -> ((TTrsojt)et).setBeforeplanseq(ctl(vl)), "beforeplanseq");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getPlanrcvflg(), (et, vl) -> ((TTrsojt)et).setPlanrcvflg((String)vl), "planrcvflg");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getHtopeflg(), (et, vl) -> ((TTrsojt)et).setHtopeflg((String)vl), "htopeflg");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getTrsoadddate(), (et, vl) -> ((TTrsojt)et).setTrsoadddate(cttp(vl)), "trsoadddate");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getTrsoaddflg(), (et, vl) -> ((TTrsojt)et).setTrsoaddflg((String)vl), "trsoaddflg");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getSoid(), (et, vl) -> ((TTrsojt)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getPlanname(), (et, vl) -> ((TTrsojt)et).setPlanname((String)vl), "planname");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getPlanpost(), (et, vl) -> ((TTrsojt)et).setPlanpost((String)vl), "planpost");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getPlanaddress(), (et, vl) -> ((TTrsojt)et).setPlanaddress((String)vl), "planaddress");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getPlanwarehousename(), (et, vl) -> ((TTrsojt)et).setPlanwarehousename((String)vl), "planwarehousename");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getCenterId(), (et, vl) -> ((TTrsojt)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getClientId(), (et, vl) -> ((TTrsojt)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getDelFlg(), (et, vl) -> ((TTrsojt)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getVersionNo(), (et, vl) -> ((TTrsojt)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getControlNo(), (et, vl) -> ((TTrsojt)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getAddDt(), (et, vl) -> ((TTrsojt)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getAddUser(), (et, vl) -> ((TTrsojt)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getAddProcess(), (et, vl) -> ((TTrsojt)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getUpdDt(), (et, vl) -> ((TTrsojt)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getUpdUser(), (et, vl) -> ((TTrsojt)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsojt)et).getUpdProcess(), (et, vl) -> ((TTrsojt)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSOJT";
    protected final String _tableDispName = "T_TRSOJT";
    protected final String _tablePropertyName = "TTrsojt";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSOJT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSojtid = cci("SOJTID", "SOJTID", null, null, Long.class, "sojtid", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSojtkey = cci("SOJTKEY", "SOJTKEY", null, null, java.math.BigDecimal.class, "sojtkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderdate = cci("ORDERDATE", "ORDERDATE", null, null, String.class, "orderdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanseq = cci("PLANSEQ", "PLANSEQ", null, null, Long.class, "planseq", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanrcvdatetime = cci("PLANRCVDATETIME", "PLANRCVDATETIME", null, null, java.sql.Timestamp.class, "planrcvdatetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBeforeplanseq = cci("BEFOREPLANSEQ", "BEFOREPLANSEQ", null, null, Long.class, "beforeplanseq", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanrcvflg = cci("PLANRCVFLG", "PLANRCVFLG", null, null, String.class, "planrcvflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtopeflg = cci("HTOPEFLG", "HTOPEFLG", null, null, String.class, "htopeflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsoadddate = cci("TRSOADDDATE", "TRSOADDDATE", null, null, java.sql.Timestamp.class, "trsoadddate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsoaddflg = cci("TRSOADDFLG", "TRSOADDFLG", null, null, String.class, "trsoaddflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanname = cci("PLANNAME", "PLANNAME", null, null, String.class, "planname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanpost = cci("PLANPOST", "PLANPOST", null, null, String.class, "planpost", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanaddress = cci("PLANADDRESS", "PLANADDRESS", null, null, String.class, "planaddress", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanwarehousename = cci("PLANWAREHOUSENAME", "PLANWAREHOUSENAME", null, null, String.class, "planwarehousename", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SOJTID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtid() { return _columnSojtid; }
    /**
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtkey() { return _columnSojtkey; }
    /**
     * OWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * CUSTOMER_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * ORDERDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderdate() { return _columnOrderdate; }
    /**
     * PLANSEQ: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanseq() { return _columnPlanseq; }
    /**
     * PLANRCVDATETIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanrcvdatetime() { return _columnPlanrcvdatetime; }
    /**
     * BEFOREPLANSEQ: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeforeplanseq() { return _columnBeforeplanseq; }
    /**
     * PLANRCVFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanrcvflg() { return _columnPlanrcvflg; }
    /**
     * HTOPEFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtopeflg() { return _columnHtopeflg; }
    /**
     * TRSOADDDATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsoadddate() { return _columnTrsoadddate; }
    /**
     * TRSOADDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsoaddflg() { return _columnTrsoaddflg; }
    /**
     * SOID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * PLANNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanname() { return _columnPlanname; }
    /**
     * PLANPOST: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanpost() { return _columnPlanpost; }
    /**
     * PLANADDRESS: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanaddress() { return _columnPlanaddress; }
    /**
     * PLANWAREHOUSENAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanwarehousename() { return _columnPlanwarehousename; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
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
        ls.add(columnSojtid());
        ls.add(columnSojtkey());
        ls.add(columnOwnersono());
        ls.add(columnCustomerCd());
        ls.add(columnOrderdate());
        ls.add(columnPlanseq());
        ls.add(columnPlanrcvdatetime());
        ls.add(columnBeforeplanseq());
        ls.add(columnPlanrcvflg());
        ls.add(columnHtopeflg());
        ls.add(columnTrsoadddate());
        ls.add(columnTrsoaddflg());
        ls.add(columnSoid());
        ls.add(columnPlanname());
        ls.add(columnPlanpost());
        ls.add(columnPlanaddress());
        ls.add(columnPlanwarehousename());
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
    protected UniqueInfo cpui() { return hpcpui(columnSojtid()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsojt"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsojtCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsojtBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsojt> getEntityType() { return TTrsojt.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsojt newEntity() { return new TTrsojt(); }
    public TTrsojt newMyEntity() { return new TTrsojt(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsojt)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsojt)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
