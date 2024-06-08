package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlNotGoodItemDiffReportList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlNotGoodItemDiffReportListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlNotGoodItemDiffReportListDbm _instance = new SqlNotGoodItemDiffReportListDbm();
    private SqlNotGoodItemDiffReportListDbm() {}
    public static SqlNotGoodItemDiffReportListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getCenterCd(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getCenterNm(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getStockdate(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setStockdate((String)vl), "stockdate");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getProductCd(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getProductAbbr(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getDiffoccArea(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setDiffoccArea((String)vl), "diffoccArea");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getDiffQty1(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setDiffQty1(ctb(vl)), "diffQty1");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getCggdid(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getUserCd(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getUserNm(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getDictNm(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setDictNm((String)vl), "dictNm");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getPrintcount(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setPrintcount(ctl(vl)), "printcount");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemDiffReportList)et).getEmtpyflag(), (et, vl) -> ((SqlNotGoodItemDiffReportList)et).setEmtpyflag((String)vl), "emtpyflag");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlNotGoodItemDiffReportList";
    protected final String _tableDispName = "SqlNotGoodItemDiffReportList";
    protected final String _tablePropertyName = "sqlNotGoodItemDiffReportList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlNotGoodItemDiffReportList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockdate = cci("STOCKDATE", "STOCKDATE", null, null, String.class, "stockdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffoccArea = cci("DIFFOCC_AREA", "DIFFOCC_AREA", null, null, String.class, "diffoccArea", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffQty1 = cci("DIFF_QTY_1", "DIFF_QTY_1", null, null, java.math.BigDecimal.class, "diffQty1", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictNm = cci("DICT_NM", "DICT_NM", null, null, String.class, "dictNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintcount = cci("PRINTCOUNT", "PRINTCOUNT", null, null, Long.class, "printcount", null, false, false, false, "numeric", 11, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmtpyflag = cci("EMTPYFLAG", "EMTPYFLAG", null, null, String.class, "emtpyflag", null, false, false, false, "varchar", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * STOCKDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockdate() { return _columnStockdate; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * DIFFOCC_AREA: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffoccArea() { return _columnDiffoccArea; }
    /**
     * DIFF_QTY_1: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffQty1() { return _columnDiffQty1; }
    /**
     * CGGDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * USER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * USER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }
    /**
     * DICT_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictNm() { return _columnDictNm; }
    /**
     * PRINTCOUNT: {numeric(11)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintcount() { return _columnPrintcount; }
    /**
     * EMTPYFLAG: {varchar(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmtpyflag() { return _columnEmtpyflag; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnStockdate());
        ls.add(columnProductCd());
        ls.add(columnProductAbbr());
        ls.add(columnDiffoccArea());
        ls.add(columnDiffQty1());
        ls.add(columnCggdid());
        ls.add(columnUserCd());
        ls.add(columnUserNm());
        ls.add(columnDictNm());
        ls.add(columnPrintcount());
        ls.add(columnEmtpyflag());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlNotGoodItemDiffReportList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlNotGoodItemDiffReportList> getEntityType() { return SqlNotGoodItemDiffReportList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlNotGoodItemDiffReportList newEntity() { return new SqlNotGoodItemDiffReportList(); }
    public SqlNotGoodItemDiffReportList newMyEntity() { return new SqlNotGoodItemDiffReportList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlNotGoodItemDiffReportList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlNotGoodItemDiffReportList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
