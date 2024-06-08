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
 * The DB meta of W_WKREKAKUNOU. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkrekakunouDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkrekakunouDbm _instance = new WWkrekakunouDbm();
    private WWkrekakunouDbm() {}
    public static WWkrekakunouDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getRekakunouId(), (et, vl) -> ((WWkrekakunou)et).setRekakunouId(ctl(vl)), "rekakunouId");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getCenterId(), (et, vl) -> ((WWkrekakunou)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getClientId(), (et, vl) -> ((WWkrekakunou)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getRekakunoukey(), (et, vl) -> ((WWkrekakunou)et).setRekakunoukey(ctb(vl)), "rekakunoukey");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getRekakunoulineno(), (et, vl) -> ((WWkrekakunou)et).setRekakunoulineno(ctl(vl)), "rekakunoulineno");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getPalletsymbolkey(), (et, vl) -> ((WWkrekakunou)et).setPalletsymbolkey(ctb(vl)), "palletsymbolkey");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getPalletkey(), (et, vl) -> ((WWkrekakunou)et).setPalletkey((String)vl), "palletkey");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getSojtkey(), (et, vl) -> ((WWkrekakunou)et).setSojtkey(ctb(vl)), "sojtkey");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getSojtlineno(), (et, vl) -> ((WWkrekakunou)et).setSojtlineno(ctl(vl)), "sojtlineno");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getOwnersono(), (et, vl) -> ((WWkrekakunou)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getSopalletno(), (et, vl) -> ((WWkrekakunou)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getRcvkey(), (et, vl) -> ((WWkrekakunou)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getTrsymbolId(), (et, vl) -> ((WWkrekakunou)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getSortedqty1(), (et, vl) -> ((WWkrekakunou)et).setSortedqty1(ctb(vl)), "sortedqty1");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getLotId(), (et, vl) -> ((WWkrekakunou)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getPackedflg(), (et, vl) -> ((WWkrekakunou)et).setPackedflg((String)vl), "packedflg");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getDelFlg(), (et, vl) -> ((WWkrekakunou)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getVersionNo(), (et, vl) -> ((WWkrekakunou)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getControlNo(), (et, vl) -> ((WWkrekakunou)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getAddDt(), (et, vl) -> ((WWkrekakunou)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getAddUser(), (et, vl) -> ((WWkrekakunou)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getAddProcess(), (et, vl) -> ((WWkrekakunou)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getUpdDt(), (et, vl) -> ((WWkrekakunou)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getUpdUser(), (et, vl) -> ((WWkrekakunou)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkrekakunou)et).getUpdProcess(), (et, vl) -> ((WWkrekakunou)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKREKAKUNOU";
    protected final String _tableDispName = "W_WKREKAKUNOU";
    protected final String _tablePropertyName = "WWkrekakunou";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKREKAKUNOU", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRekakunouId = cci("REKAKUNOU_ID", "REKAKUNOU_ID", null, null, Long.class, "rekakunouId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRekakunoukey = cci("REKAKUNOUKEY", "REKAKUNOUKEY", null, null, java.math.BigDecimal.class, "rekakunoukey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRekakunoulineno = cci("REKAKUNOULINENO", "REKAKUNOULINENO", null, null, Long.class, "rekakunoulineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletsymbolkey = cci("PALLETSYMBOLKEY", "PALLETSYMBOLKEY", null, null, java.math.BigDecimal.class, "palletsymbolkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletkey = cci("PALLETKEY", "PALLETKEY", null, null, String.class, "palletkey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSojtkey = cci("SOJTKEY", "SOJTKEY", null, null, java.math.BigDecimal.class, "sojtkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSojtlineno = cci("SOJTLINENO", "SOJTLINENO", null, null, Long.class, "sojtlineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedqty1 = cci("SORTEDQTY1", "SORTEDQTY1", null, null, java.math.BigDecimal.class, "sortedqty1", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackedflg = cci("PACKEDFLG", "PACKEDFLG", null, null, String.class, "packedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRekakunouId() { return _columnRekakunouId; }
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
     * REKAKUNOUKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRekakunoukey() { return _columnRekakunoukey; }
    /**
     * REKAKUNOULINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRekakunoulineno() { return _columnRekakunoulineno; }
    /**
     * PALLETSYMBOLKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletsymbolkey() { return _columnPalletsymbolkey; }
    /**
     * PALLETKEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletkey() { return _columnPalletkey; }
    /**
     * SOJTKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtkey() { return _columnSojtkey; }
    /**
     * SOJTLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtlineno() { return _columnSojtlineno; }
    /**
     * OWNERSONO: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * SOPALLETNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSopalletno() { return _columnSopalletno; }
    /**
     * RCVKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * TRSYMBOL_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedqty1() { return _columnSortedqty1; }
    /**
     * LOT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * PACKEDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackedflg() { return _columnPackedflg; }
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
        ls.add(columnRekakunouId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnRekakunoukey());
        ls.add(columnRekakunoulineno());
        ls.add(columnPalletsymbolkey());
        ls.add(columnPalletkey());
        ls.add(columnSojtkey());
        ls.add(columnSojtlineno());
        ls.add(columnOwnersono());
        ls.add(columnSopalletno());
        ls.add(columnRcvkey());
        ls.add(columnTrsymbolId());
        ls.add(columnSortedqty1());
        ls.add(columnLotId());
        ls.add(columnPackedflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnRekakunouId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkrekakunou"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkrekakunouCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkrekakunouBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkrekakunou> getEntityType() { return WWkrekakunou.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkrekakunou newEntity() { return new WWkrekakunou(); }
    public WWkrekakunou newMyEntity() { return new WWkrekakunou(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkrekakunou)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkrekakunou)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
