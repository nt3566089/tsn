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
 * The DB meta of W_WKPALLETSYMBOLJT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkpalletsymboljtDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkpalletsymboljtDbm _instance = new WWkpalletsymboljtDbm();
    private WWkpalletsymboljtDbm() {}
    public static WWkpalletsymboljtDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getWksojtkey(), (et, vl) -> ((WWkpalletsymboljt)et).setWksojtkey(ctb(vl)), "wksojtkey");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getPalletno(), (et, vl) -> ((WWkpalletsymboljt)et).setPalletno(ctb(vl)), "palletno");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getOwnersono(), (et, vl) -> ((WWkpalletsymboljt)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getSopalletno(), (et, vl) -> ((WWkpalletsymboljt)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getRcvkey(), (et, vl) -> ((WWkpalletsymboljt)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getSymbolno(), (et, vl) -> ((WWkpalletsymboljt)et).setSymbolno(ctb(vl)), "symbolno");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getSortedqty1(), (et, vl) -> ((WWkpalletsymboljt)et).setSortedqty1(ctb(vl)), "sortedqty1");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getLotkey(), (et, vl) -> ((WWkpalletsymboljt)et).setLotkey(ctl(vl)), "lotkey");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getPackedflg(), (et, vl) -> ((WWkpalletsymboljt)et).setPackedflg((String)vl), "packedflg");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getEnterflg(), (et, vl) -> ((WWkpalletsymboljt)et).setEnterflg(ctb(vl)), "enterflg");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getActflg(), (et, vl) -> ((WWkpalletsymboljt)et).setActflg(ctb(vl)), "actflg");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getDelFlg(), (et, vl) -> ((WWkpalletsymboljt)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getVersionNo(), (et, vl) -> ((WWkpalletsymboljt)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getControlNo(), (et, vl) -> ((WWkpalletsymboljt)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getAddDt(), (et, vl) -> ((WWkpalletsymboljt)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getAddUser(), (et, vl) -> ((WWkpalletsymboljt)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getAddProcess(), (et, vl) -> ((WWkpalletsymboljt)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getUpdDt(), (et, vl) -> ((WWkpalletsymboljt)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getUpdUser(), (et, vl) -> ((WWkpalletsymboljt)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkpalletsymboljt)et).getUpdProcess(), (et, vl) -> ((WWkpalletsymboljt)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKPALLETSYMBOLJT";
    protected final String _tableDispName = "W_WKPALLETSYMBOLJT";
    protected final String _tablePropertyName = "WWkpalletsymboljt";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKPALLETSYMBOLJT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWksojtkey = cci("WKSOJTKEY", "WKSOJTKEY", null, null, java.math.BigDecimal.class, "wksojtkey", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletno = cci("PALLETNO", "PALLETNO", null, null, java.math.BigDecimal.class, "palletno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolno = cci("SYMBOLNO", "SYMBOLNO", null, null, java.math.BigDecimal.class, "symbolno", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedqty1 = cci("SORTEDQTY1", "SORTEDQTY1", null, null, java.math.BigDecimal.class, "sortedqty1", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotkey = cci("LOTKEY", "LOTKEY", null, null, Long.class, "lotkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackedflg = cci("PACKEDFLG", "PACKEDFLG", null, null, String.class, "packedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEnterflg = cci("ENTERFLG", "ENTERFLG", null, null, java.math.BigDecimal.class, "enterflg", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActflg = cci("ACTFLG", "ACTFLG", null, null, java.math.BigDecimal.class, "actflg", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * WKSOJTKEY: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWksojtkey() { return _columnWksojtkey; }
    /**
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletno() { return _columnPalletno; }
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
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolno() { return _columnSymbolno; }
    /**
     * SORTEDQTY1: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedqty1() { return _columnSortedqty1; }
    /**
     * LOTKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotkey() { return _columnLotkey; }
    /**
     * PACKEDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackedflg() { return _columnPackedflg; }
    /**
     * ENTERFLG: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEnterflg() { return _columnEnterflg; }
    /**
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActflg() { return _columnActflg; }
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
        ls.add(columnWksojtkey());
        ls.add(columnPalletno());
        ls.add(columnOwnersono());
        ls.add(columnSopalletno());
        ls.add(columnRcvkey());
        ls.add(columnSymbolno());
        ls.add(columnSortedqty1());
        ls.add(columnLotkey());
        ls.add(columnPackedflg());
        ls.add(columnEnterflg());
        ls.add(columnActflg());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnWksojtkey());
        ls.add(columnSymbolno());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkpalletsymboljt"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkpalletsymboljtCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkpalletsymboljtBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkpalletsymboljt> getEntityType() { return WWkpalletsymboljt.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkpalletsymboljt newEntity() { return new WWkpalletsymboljt(); }
    public WWkpalletsymboljt newMyEntity() { return new WWkpalletsymboljt(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkpalletsymboljt)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkpalletsymboljt)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
