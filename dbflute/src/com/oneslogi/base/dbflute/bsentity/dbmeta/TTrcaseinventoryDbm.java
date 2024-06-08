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
 * The DB meta of T_TRCASEINVENTORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrcaseinventoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrcaseinventoryDbm _instance = new TTrcaseinventoryDbm();
    private TTrcaseinventoryDbm() {}
    public static TTrcaseinventoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getTrcaseinventoryId(), (et, vl) -> ((TTrcaseinventory)et).setTrcaseinventoryId(ctl(vl)), "trcaseinventoryId");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getCaseinventoryno(), (et, vl) -> ((TTrcaseinventory)et).setCaseinventoryno(ctb(vl)), "caseinventoryno");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getCasecd(), (et, vl) -> ((TTrcaseinventory)et).setCasecd(ctb(vl)), "casecd");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getInventorykey(), (et, vl) -> ((TTrcaseinventory)et).setInventorykey((String)vl), "inventorykey");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getInventoryBId(), (et, vl) -> ((TTrcaseinventory)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getCaseinvqty(), (et, vl) -> ((TTrcaseinventory)et).setCaseinvqty(ctl(vl)), "caseinvqty");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getDefectivenum(), (et, vl) -> ((TTrcaseinventory)et).setDefectivenum(ctl(vl)), "defectivenum");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getTotalsortednum(), (et, vl) -> ((TTrcaseinventory)et).setTotalsortednum(ctb(vl)), "totalsortednum");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getSorteddifnum(), (et, vl) -> ((TTrcaseinventory)et).setSorteddifnum(ctl(vl)), "sorteddifnum");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getInventorydatetime(), (et, vl) -> ((TTrcaseinventory)et).setInventorydatetime((String)vl), "inventorydatetime");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getTracecreatests(), (et, vl) -> ((TTrcaseinventory)et).setTracecreatests(ctb(vl)), "tracecreatests");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getActflg(), (et, vl) -> ((TTrcaseinventory)et).setActflg(ctb(vl)), "actflg");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getCenterId(), (et, vl) -> ((TTrcaseinventory)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getClientId(), (et, vl) -> ((TTrcaseinventory)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getDelFlg(), (et, vl) -> ((TTrcaseinventory)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getVersionNo(), (et, vl) -> ((TTrcaseinventory)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getControlNo(), (et, vl) -> ((TTrcaseinventory)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getAddDt(), (et, vl) -> ((TTrcaseinventory)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getAddUser(), (et, vl) -> ((TTrcaseinventory)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getAddProcess(), (et, vl) -> ((TTrcaseinventory)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getUpdDt(), (et, vl) -> ((TTrcaseinventory)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getUpdUser(), (et, vl) -> ((TTrcaseinventory)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrcaseinventory)et).getUpdProcess(), (et, vl) -> ((TTrcaseinventory)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrcaseinventory)et).getMCenter(), (et, vl) -> ((TTrcaseinventory)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrcaseinventory)et).getMClient(), (et, vl) -> ((TTrcaseinventory)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRCASEINVENTORY";
    protected final String _tableDispName = "T_TRCASEINVENTORY";
    protected final String _tablePropertyName = "TTrcaseinventory";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRCASEINVENTORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrcaseinventoryId = cci("TRCASEINVENTORY_ID", "TRCASEINVENTORY_ID", null, null, Long.class, "trcaseinventoryId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinventoryno = cci("CASEINVENTORYNO", "CASEINVENTORYNO", null, null, java.math.BigDecimal.class, "caseinventoryno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecd = cci("CASECD", "CASECD", null, null, java.math.BigDecimal.class, "casecd", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventorykey = cci("INVENTORYKEY", "INVENTORYKEY", null, null, String.class, "inventorykey", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinvqty = cci("CASEINVQTY", "CASEINVQTY", null, null, Long.class, "caseinvqty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefectivenum = cci("DEFECTIVENUM", "DEFECTIVENUM", null, null, Long.class, "defectivenum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalsortednum = cci("TOTALSORTEDNUM", "TOTALSORTEDNUM", null, null, java.math.BigDecimal.class, "totalsortednum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSorteddifnum = cci("SORTEDDIFNUM", "SORTEDDIFNUM", null, null, Long.class, "sorteddifnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventorydatetime = cci("INVENTORYDATETIME", "INVENTORYDATETIME", null, null, String.class, "inventorydatetime", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracecreatests = cci("TRACECREATESTS", "TRACECREATESTS", null, null, java.math.BigDecimal.class, "tracecreatests", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActflg = cci("ACTFLG", "ACTFLG", null, null, java.math.BigDecimal.class, "actflg", null, false, false, true, "decimal", 16, 6, null, "(1)", false, null, null, null, null, null, false);
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
     * TRCASEINVENTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrcaseinventoryId() { return _columnTrcaseinventoryId; }
    /**
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinventoryno() { return _columnCaseinventoryno; }
    /**
     * CASECD: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecd() { return _columnCasecd; }
    /**
     * INVENTORYKEY: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventorykey() { return _columnInventorykey; }
    /**
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * CASEINVQTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinvqty() { return _columnCaseinvqty; }
    /**
     * DEFECTIVENUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefectivenum() { return _columnDefectivenum; }
    /**
     * TOTALSORTEDNUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalsortednum() { return _columnTotalsortednum; }
    /**
     * SORTEDDIFNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSorteddifnum() { return _columnSorteddifnum; }
    /**
     * INVENTORYDATETIME: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventorydatetime() { return _columnInventorydatetime; }
    /**
     * TRACECREATESTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracecreatests() { return _columnTracecreatests; }
    /**
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActflg() { return _columnActflg; }
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
        ls.add(columnTrcaseinventoryId());
        ls.add(columnCaseinventoryno());
        ls.add(columnCasecd());
        ls.add(columnInventorykey());
        ls.add(columnInventoryBId());
        ls.add(columnCaseinvqty());
        ls.add(columnDefectivenum());
        ls.add(columnTotalsortednum());
        ls.add(columnSorteddifnum());
        ls.add(columnInventorydatetime());
        ls.add(columnTracecreatests());
        ls.add(columnActflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrcaseinventoryId()); }
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_TRCASEINVENTORY_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrcaseinventoryList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRCASEINVENTORY_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrcaseinventoryList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrcaseinventory"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrcaseinventoryCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrcaseinventoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrcaseinventory> getEntityType() { return TTrcaseinventory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrcaseinventory newEntity() { return new TTrcaseinventory(); }
    public TTrcaseinventory newMyEntity() { return new TTrcaseinventory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrcaseinventory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrcaseinventory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
