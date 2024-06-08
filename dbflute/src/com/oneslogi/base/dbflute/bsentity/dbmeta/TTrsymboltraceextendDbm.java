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
 * The DB meta of T_TRSYMBOLTRACEEXTEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsymboltraceextendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsymboltraceextendDbm _instance = new TTrsymboltraceextendDbm();
    private TTrsymboltraceextendDbm() {}
    public static TTrsymboltraceextendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getTrsymboltraceextendId(), (et, vl) -> ((TTrsymboltraceextend)et).setTrsymboltraceextendId(ctl(vl)), "trsymboltraceextendId");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getSymboltracekey(), (et, vl) -> ((TTrsymboltraceextend)et).setSymboltracekey(ctb(vl)), "symboltracekey");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getTrsymbolId(), (et, vl) -> ((TTrsymboltraceextend)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getTrpalletId(), (et, vl) -> ((TTrsymboltraceextend)et).setTrpalletId(ctl(vl)), "trpalletId");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getAssortflg(), (et, vl) -> ((TTrsymboltraceextend)et).setAssortflg(ctb(vl)), "assortflg");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getTrsymbolIdFrom(), (et, vl) -> ((TTrsymboltraceextend)et).setTrsymbolIdFrom(ctl(vl)), "trsymbolIdFrom");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getTrsymbolIdTo(), (et, vl) -> ((TTrsymboltraceextend)et).setTrsymbolIdTo(ctl(vl)), "trsymbolIdTo");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getQty(), (et, vl) -> ((TTrsymboltraceextend)et).setQty(ctb(vl)), "qty");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getCenterId(), (et, vl) -> ((TTrsymboltraceextend)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getClientId(), (et, vl) -> ((TTrsymboltraceextend)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getDelFlg(), (et, vl) -> ((TTrsymboltraceextend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getVersionNo(), (et, vl) -> ((TTrsymboltraceextend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getControlNo(), (et, vl) -> ((TTrsymboltraceextend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getAddDt(), (et, vl) -> ((TTrsymboltraceextend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getAddUser(), (et, vl) -> ((TTrsymboltraceextend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getAddProcess(), (et, vl) -> ((TTrsymboltraceextend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getUpdDt(), (et, vl) -> ((TTrsymboltraceextend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getUpdUser(), (et, vl) -> ((TTrsymboltraceextend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsymboltraceextend)et).getUpdProcess(), (et, vl) -> ((TTrsymboltraceextend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrsymboltraceextend)et).getMCenter(), (et, vl) -> ((TTrsymboltraceextend)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrsymboltraceextend)et).getMClient(), (et, vl) -> ((TTrsymboltraceextend)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSYMBOLTRACEEXTEND";
    protected final String _tableDispName = "T_TRSYMBOLTRACEEXTEND";
    protected final String _tablePropertyName = "TTrsymboltraceextend";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSYMBOLTRACEEXTEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsymboltraceextendId = cci("TRSYMBOLTRACEEXTEND_ID", "TRSYMBOLTRACEEXTEND_ID", null, null, Long.class, "trsymboltraceextendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymboltracekey = cci("SYMBOLTRACEKEY", "SYMBOLTRACEKEY", null, null, java.math.BigDecimal.class, "symboltracekey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrpalletId = cci("TRPALLET_ID", "TRPALLET_ID", null, null, Long.class, "trpalletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortflg = cci("ASSORTFLG", "ASSORTFLG", null, null, java.math.BigDecimal.class, "assortflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsymbolIdFrom = cci("TRSYMBOL_ID_FROM", "TRSYMBOL_ID_FROM", null, null, Long.class, "trsymbolIdFrom", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsymbolIdTo = cci("TRSYMBOL_ID_TO", "TRSYMBOL_ID_TO", null, null, Long.class, "trsymbolIdTo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, java.math.BigDecimal.class, "qty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * TRSYMBOLTRACEEXTEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymboltraceextendId() { return _columnTrsymboltraceextendId; }
    /**
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymboltracekey() { return _columnSymboltracekey; }
    /**
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * TRPALLET_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletId() { return _columnTrpalletId; }
    /**
     * ASSORTFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortflg() { return _columnAssortflg; }
    /**
     * TRSYMBOL_ID_FROM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolIdFrom() { return _columnTrsymbolIdFrom; }
    /**
     * TRSYMBOL_ID_TO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolIdTo() { return _columnTrsymbolIdTo; }
    /**
     * QTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
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
        ls.add(columnTrsymboltraceextendId());
        ls.add(columnSymboltracekey());
        ls.add(columnTrsymbolId());
        ls.add(columnTrpalletId());
        ls.add(columnAssortflg());
        ls.add(columnTrsymbolIdFrom());
        ls.add(columnTrsymbolIdTo());
        ls.add(columnQty());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrsymboltraceextendId()); }
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
        return cfi("T_TRSYMBOLTRACEEXTEND_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrsymboltraceextendList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRSYMBOLTRACEEXTEND_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrsymboltraceextendList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsymboltraceextend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsymboltraceextendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsymboltraceextendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsymboltraceextend> getEntityType() { return TTrsymboltraceextend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsymboltraceextend newEntity() { return new TTrsymboltraceextend(); }
    public TTrsymboltraceextend newMyEntity() { return new TTrsymboltraceextend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsymboltraceextend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsymboltraceextend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
