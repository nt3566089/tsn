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
 * The DB meta of W_WKSORTSUB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWksortsubDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWksortsubDbm _instance = new WWksortsubDbm();
    private WWksortsubDbm() {}
    public static WWksortsubDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWksortsub)et).getSortsubkey(), (et, vl) -> ((WWksortsub)et).setSortsubkey(ctb(vl)), "sortsubkey");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getSortsublineno(), (et, vl) -> ((WWksortsub)et).setSortsublineno(ctl(vl)), "sortsublineno");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getSokey(), (et, vl) -> ((WWksortsub)et).setSokey(ctb(vl)), "sokey");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getPlno(), (et, vl) -> ((WWksortsub)et).setPlno((String)vl), "plno");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getSymbolno(), (et, vl) -> ((WWksortsub)et).setSymbolno(ctb(vl)), "symbolno");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getLotkey(), (et, vl) -> ((WWksortsub)et).setLotkey(ctb(vl)), "lotkey");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getLoccd(), (et, vl) -> ((WWksortsub)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getQty(), (et, vl) -> ((WWksortsub)et).setQty(ctb(vl)), "qty");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getPickedflg(), (et, vl) -> ((WWksortsub)et).setPickedflg(ctb(vl)), "pickedflg");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getSortedflg(), (et, vl) -> ((WWksortsub)et).setSortedflg(ctb(vl)), "sortedflg");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getManualsymbolno(), (et, vl) -> ((WWksortsub)et).setManualsymbolno((String)vl), "manualsymbolno");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getAssortseq(), (et, vl) -> ((WWksortsub)et).setAssortseq(ctl(vl)), "assortseq");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getDelFlg(), (et, vl) -> ((WWksortsub)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getVersionNo(), (et, vl) -> ((WWksortsub)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getControlNo(), (et, vl) -> ((WWksortsub)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getAddDt(), (et, vl) -> ((WWksortsub)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getAddUser(), (et, vl) -> ((WWksortsub)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getAddProcess(), (et, vl) -> ((WWksortsub)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getUpdDt(), (et, vl) -> ((WWksortsub)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getUpdUser(), (et, vl) -> ((WWksortsub)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWksortsub)et).getUpdProcess(), (et, vl) -> ((WWksortsub)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKSORTSUB";
    protected final String _tableDispName = "W_WKSORTSUB";
    protected final String _tablePropertyName = "WWksortsub";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKSORTSUB", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSortsubkey = cci("SORTSUBKEY", "SORTSUBKEY", null, null, java.math.BigDecimal.class, "sortsubkey", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortsublineno = cci("SORTSUBLINENO", "SORTSUBLINENO", null, null, Long.class, "sortsublineno", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSokey = cci("SOKEY", "SOKEY", null, null, java.math.BigDecimal.class, "sokey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlno = cci("PLNO", "PLNO", null, null, String.class, "plno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolno = cci("SYMBOLNO", "SYMBOLNO", null, null, java.math.BigDecimal.class, "symbolno", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotkey = cci("LOTKEY", "LOTKEY", null, null, java.math.BigDecimal.class, "lotkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, java.math.BigDecimal.class, "qty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedflg = cci("PICKEDFLG", "PICKEDFLG", null, null, java.math.BigDecimal.class, "pickedflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedflg = cci("SORTEDFLG", "SORTEDFLG", null, null, java.math.BigDecimal.class, "sortedflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManualsymbolno = cci("MANUALSYMBOLNO", "MANUALSYMBOLNO", null, null, String.class, "manualsymbolno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortseq = cci("ASSORTSEQ", "ASSORTSEQ", null, null, Long.class, "assortseq", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SORTSUBKEY: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortsubkey() { return _columnSortsubkey; }
    /**
     * SORTSUBLINENO: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortsublineno() { return _columnSortsublineno; }
    /**
     * SOKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSokey() { return _columnSokey; }
    /**
     * PLNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlno() { return _columnPlno; }
    /**
     * SYMBOLNO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolno() { return _columnSymbolno; }
    /**
     * LOTKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotkey() { return _columnLotkey; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * QTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * PICKEDFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedflg() { return _columnPickedflg; }
    /**
     * SORTEDFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedflg() { return _columnSortedflg; }
    /**
     * MANUALSYMBOLNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManualsymbolno() { return _columnManualsymbolno; }
    /**
     * ASSORTSEQ: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortseq() { return _columnAssortseq; }
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
        ls.add(columnSortsubkey());
        ls.add(columnSortsublineno());
        ls.add(columnSokey());
        ls.add(columnPlno());
        ls.add(columnSymbolno());
        ls.add(columnLotkey());
        ls.add(columnLoccd());
        ls.add(columnQty());
        ls.add(columnPickedflg());
        ls.add(columnSortedflg());
        ls.add(columnManualsymbolno());
        ls.add(columnAssortseq());
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
        ls.add(columnSortsubkey());
        ls.add(columnSortsublineno());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWksortsub"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWksortsubCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWksortsubBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWksortsub> getEntityType() { return WWksortsub.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWksortsub newEntity() { return new WWksortsub(); }
    public WWksortsub newMyEntity() { return new WWksortsub(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWksortsub)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWksortsub)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
