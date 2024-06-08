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
 * The DB meta of T_TRCASESTOCKDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrcasestockdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrcasestockdetailDbm _instance = new TTrcasestockdetailDbm();
    private TTrcasestockdetailDbm() {}
    public static TTrcasestockdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getTrcasestockdetailId(), (et, vl) -> ((TTrcasestockdetail)et).setTrcasestockdetailId(ctl(vl)), "trcasestockdetailId");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getCasestockdetailno(), (et, vl) -> ((TTrcasestockdetail)et).setCasestockdetailno(ctl(vl)), "casestockdetailno");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getCenterSymbolId(), (et, vl) -> ((TTrcasestockdetail)et).setCenterSymbolId(ctb(vl)), "centerSymbolId");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getSortstockdate(), (et, vl) -> ((TTrcasestockdetail)et).setSortstockdate((String)vl), "sortstockdate");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getWorktime(), (et, vl) -> ((TTrcasestockdetail)et).setWorktime((String)vl), "worktime");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getSortstockkbn(), (et, vl) -> ((TTrcasestockdetail)et).setSortstockkbn((String)vl), "sortstockkbn");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getOperatetimes(), (et, vl) -> ((TTrcasestockdetail)et).setOperatetimes(ctb(vl)), "operatetimes");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getSotedunit(), (et, vl) -> ((TTrcasestockdetail)et).setSotedunit((String)vl), "sotedunit");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getSortloccd(), (et, vl) -> ((TTrcasestockdetail)et).setSortloccd((String)vl), "sortloccd");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getProductCd(), (et, vl) -> ((TTrcasestockdetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getOperateqty(), (et, vl) -> ((TTrcasestockdetail)et).setOperateqty((String)vl), "operateqty");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getManufacturedate(), (et, vl) -> ((TTrcasestockdetail)et).setManufacturedate((String)vl), "manufacturedate");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getConfirmno(), (et, vl) -> ((TTrcasestockdetail)et).setConfirmno(ctb(vl)), "confirmno");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getPrintdatetime(), (et, vl) -> ((TTrcasestockdetail)et).setPrintdatetime(cttp(vl)), "printdatetime");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getPrintedflg(), (et, vl) -> ((TTrcasestockdetail)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getDelFlg(), (et, vl) -> ((TTrcasestockdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getVersionNo(), (et, vl) -> ((TTrcasestockdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getControlNo(), (et, vl) -> ((TTrcasestockdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getAddDt(), (et, vl) -> ((TTrcasestockdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getAddUser(), (et, vl) -> ((TTrcasestockdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getAddProcess(), (et, vl) -> ((TTrcasestockdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getUpdDt(), (et, vl) -> ((TTrcasestockdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getUpdUser(), (et, vl) -> ((TTrcasestockdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrcasestockdetail)et).getUpdProcess(), (et, vl) -> ((TTrcasestockdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRCASESTOCKDETAIL";
    protected final String _tableDispName = "T_TRCASESTOCKDETAIL";
    protected final String _tablePropertyName = "TTrcasestockdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRCASESTOCKDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrcasestockdetailId = cci("TRCASESTOCKDETAIL_ID", "TRCASESTOCKDETAIL_ID", null, null, Long.class, "trcasestockdetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasestockdetailno = cci("CASESTOCKDETAILNO", "CASESTOCKDETAILNO", null, null, Long.class, "casestockdetailno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterSymbolId = cci("CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", null, null, java.math.BigDecimal.class, "centerSymbolId", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortstockdate = cci("SORTSTOCKDATE", "SORTSTOCKDATE", null, null, String.class, "sortstockdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorktime = cci("WORKTIME", "WORKTIME", null, null, String.class, "worktime", null, false, false, true, "varchar", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortstockkbn = cci("SORTSTOCKKBN", "SORTSTOCKKBN", null, null, String.class, "sortstockkbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperatetimes = cci("OPERATETIMES", "OPERATETIMES", null, null, java.math.BigDecimal.class, "operatetimes", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedunit = cci("SOTEDUNIT", "SOTEDUNIT", null, null, String.class, "sotedunit", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortloccd = cci("SORTLOCCD", "SORTLOCCD", null, null, String.class, "sortloccd", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperateqty = cci("OPERATEQTY", "OPERATEQTY", null, null, String.class, "operateqty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturedate = cci("MANUFACTUREDATE", "MANUFACTUREDATE", null, null, String.class, "manufacturedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnConfirmno = cci("CONFIRMNO", "CONFIRMNO", null, null, java.math.BigDecimal.class, "confirmno", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintdatetime = cci("PRINTDATETIME", "PRINTDATETIME", null, null, java.sql.Timestamp.class, "printdatetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrcasestockdetailId() { return _columnTrcasestockdetailId; }
    /**
     * CASESTOCKDETAILNO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasestockdetailno() { return _columnCasestockdetailno; }
    /**
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterSymbolId() { return _columnCenterSymbolId; }
    /**
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortstockdate() { return _columnSortstockdate; }
    /**
     * WORKTIME: {NotNull, varchar(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorktime() { return _columnWorktime; }
    /**
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortstockkbn() { return _columnSortstockkbn; }
    /**
     * OPERATETIMES: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperatetimes() { return _columnOperatetimes; }
    /**
     * SOTEDUNIT: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedunit() { return _columnSotedunit; }
    /**
     * SORTLOCCD: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortloccd() { return _columnSortloccd; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * OPERATEQTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperateqty() { return _columnOperateqty; }
    /**
     * MANUFACTUREDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturedate() { return _columnManufacturedate; }
    /**
     * CONFIRMNO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConfirmno() { return _columnConfirmno; }
    /**
     * PRINTDATETIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintdatetime() { return _columnPrintdatetime; }
    /**
     * PRINTEDFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
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
        ls.add(columnTrcasestockdetailId());
        ls.add(columnCasestockdetailno());
        ls.add(columnCenterSymbolId());
        ls.add(columnSortstockdate());
        ls.add(columnWorktime());
        ls.add(columnSortstockkbn());
        ls.add(columnOperatetimes());
        ls.add(columnSotedunit());
        ls.add(columnSortloccd());
        ls.add(columnProductCd());
        ls.add(columnOperateqty());
        ls.add(columnManufacturedate());
        ls.add(columnConfirmno());
        ls.add(columnPrintdatetime());
        ls.add(columnPrintedflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrcasestockdetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrcasestockdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrcasestockdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrcasestockdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrcasestockdetail> getEntityType() { return TTrcasestockdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrcasestockdetail newEntity() { return new TTrcasestockdetail(); }
    public TTrcasestockdetail newMyEntity() { return new TTrcasestockdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrcasestockdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrcasestockdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
