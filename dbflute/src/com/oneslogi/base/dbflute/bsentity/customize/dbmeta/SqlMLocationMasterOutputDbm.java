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
 * The DB meta of SqlMLocationMasterOutput. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlMLocationMasterOutputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlMLocationMasterOutputDbm _instance = new SqlMLocationMasterOutputDbm();
    private SqlMLocationMasterOutputDbm() {}
    public static SqlMLocationMasterOutputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getLinBlk(), (et, vl) -> ((SqlMLocationMasterOutput)et).setLinBlk((String)vl), "linBlk");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getSortCenter(), (et, vl) -> ((SqlMLocationMasterOutput)et).setSortCenter((String)vl), "sortCenter");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getLocationCd(), (et, vl) -> ((SqlMLocationMasterOutput)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getProductCd(), (et, vl) -> ((SqlMLocationMasterOutput)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getProductNm(), (et, vl) -> ((SqlMLocationMasterOutput)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getStockBox(), (et, vl) -> ((SqlMLocationMasterOutput)et).setStockBox(ctb(vl)), "stockBox");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getStockCarton(), (et, vl) -> ((SqlMLocationMasterOutput)et).setStockCarton(ctb(vl)), "stockCarton");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getLocid(), (et, vl) -> ((SqlMLocationMasterOutput)et).setLocid((String)vl), "locid");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getLocidNm(), (et, vl) -> ((SqlMLocationMasterOutput)et).setLocidNm((String)vl), "locidNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getBrctg(), (et, vl) -> ((SqlMLocationMasterOutput)et).setBrctg(ctl(vl)), "brctg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getTosplmd(), (et, vl) -> ((SqlMLocationMasterOutput)et).setTosplmd((String)vl), "tosplmd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getPresplmd(), (et, vl) -> ((SqlMLocationMasterOutput)et).setPresplmd((String)vl), "presplmd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getSplrevun(), (et, vl) -> ((SqlMLocationMasterOutput)et).setSplrevun((String)vl), "splrevun");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getSplrevunNm(), (et, vl) -> ((SqlMLocationMasterOutput)et).setSplrevunNm((String)vl), "splrevunNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getSplrevctqa(), (et, vl) -> ((SqlMLocationMasterOutput)et).setSplrevctqa(ctl(vl)), "splrevctqa");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getReplenishPNum(), (et, vl) -> ((SqlMLocationMasterOutput)et).setReplenishPNum(ctb(vl)), "replenishPNum");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getBssplpt(), (et, vl) -> ((SqlMLocationMasterOutput)et).setBssplpt((String)vl), "bssplpt");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getToReplenishPNum(), (et, vl) -> ((SqlMLocationMasterOutput)et).setToReplenishPNum(ctb(vl)), "toReplenishPNum");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getToReplenishPQty(), (et, vl) -> ((SqlMLocationMasterOutput)et).setToReplenishPQty(ctl(vl)), "toReplenishPQty");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getPreReplenishPNum(), (et, vl) -> ((SqlMLocationMasterOutput)et).setPreReplenishPNum(ctb(vl)), "preReplenishPNum");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getPreReplenishPQty(), (et, vl) -> ((SqlMLocationMasterOutput)et).setPreReplenishPQty(ctl(vl)), "preReplenishPQty");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterOutput)et).getCreatedate(), (et, vl) -> ((SqlMLocationMasterOutput)et).setCreatedate((String)vl), "createdate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlMLocationMasterOutput";
    protected final String _tableDispName = "SqlMLocationMasterOutput";
    protected final String _tablePropertyName = "sqlMLocationMasterOutput";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlMLocationMasterOutput", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLinBlk = cci("LIN_BLK", "LIN_BLK", null, null, String.class, "linBlk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortCenter = cci("SORT_CENTER", "SORT_CENTER", null, null, String.class, "sortCenter", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockBox = cci("STOCK_BOX", "STOCK_BOX", null, null, java.math.BigDecimal.class, "stockBox", null, false, false, false, "decimal", 38, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockCarton = cci("STOCK_CARTON", "STOCK_CARTON", null, null, java.math.BigDecimal.class, "stockCarton", null, false, false, false, "decimal", 36, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocid = cci("LOCID", "LOCID", null, null, String.class, "locid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidNm = cci("LOCID_NM", "LOCID_NM", null, null, String.class, "locidNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrctg = cci("BRCTG", "BRCTG", null, null, Long.class, "brctg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTosplmd = cci("TOSPLMD", "TOSPLMD", null, null, String.class, "tosplmd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplmd = cci("PRESPLMD", "PRESPLMD", null, null, String.class, "presplmd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplrevun = cci("SPLREVUN", "SPLREVUN", null, null, String.class, "splrevun", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplrevunNm = cci("SPLREVUN_NM", "SPLREVUN_NM", null, null, String.class, "splrevunNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplrevctqa = cci("SPLREVCTQA", "SPLREVCTQA", null, null, Long.class, "splrevctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPNum = cci("REPLENISH_P_NUM", "REPLENISH_P_NUM", null, null, java.math.BigDecimal.class, "replenishPNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBssplpt = cci("BSSPLPT", "BSSPLPT", null, null, String.class, "bssplpt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToReplenishPNum = cci("TO_REPLENISH_P_NUM", "TO_REPLENISH_P_NUM", null, null, java.math.BigDecimal.class, "toReplenishPNum", null, false, false, false, "decimal", 36, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToReplenishPQty = cci("TO_REPLENISH_P_QTY", "TO_REPLENISH_P_QTY", null, null, Long.class, "toReplenishPQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPreReplenishPNum = cci("PRE_REPLENISH_P_NUM", "PRE_REPLENISH_P_NUM", null, null, java.math.BigDecimal.class, "preReplenishPNum", null, false, false, false, "decimal", 36, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPreReplenishPQty = cci("PRE_REPLENISH_P_QTY", "PRE_REPLENISH_P_QTY", null, null, Long.class, "preReplenishPQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedate = cci("CREATEDATE", "CREATEDATE", null, null, String.class, "createdate", null, false, false, false, "nvarchar", 4000, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LIN_BLK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinBlk() { return _columnLinBlk; }
    /**
     * SORT_CENTER: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortCenter() { return _columnSortCenter; }
    /**
     * LOCATION_CD: {varchar(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * STOCK_BOX: {decimal(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockBox() { return _columnStockBox; }
    /**
     * STOCK_CARTON: {decimal(36)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockCarton() { return _columnStockCarton; }
    /**
     * LOCID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocid() { return _columnLocid; }
    /**
     * LOCID_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidNm() { return _columnLocidNm; }
    /**
     * BRCTG: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrctg() { return _columnBrctg; }
    /**
     * TOSPLMD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTosplmd() { return _columnTosplmd; }
    /**
     * PRESPLMD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresplmd() { return _columnPresplmd; }
    /**
     * SPLREVUN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplrevun() { return _columnSplrevun; }
    /**
     * SPLREVUN_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplrevunNm() { return _columnSplrevunNm; }
    /**
     * SPLREVCTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplrevctqa() { return _columnSplrevctqa; }
    /**
     * REPLENISH_P_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPNum() { return _columnReplenishPNum; }
    /**
     * BSSPLPT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBssplpt() { return _columnBssplpt; }
    /**
     * TO_REPLENISH_P_NUM: {decimal(36)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToReplenishPNum() { return _columnToReplenishPNum; }
    /**
     * TO_REPLENISH_P_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToReplenishPQty() { return _columnToReplenishPQty; }
    /**
     * PRE_REPLENISH_P_NUM: {decimal(36)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPreReplenishPNum() { return _columnPreReplenishPNum; }
    /**
     * PRE_REPLENISH_P_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPreReplenishPQty() { return _columnPreReplenishPQty; }
    /**
     * CREATEDATE: {nvarchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedate() { return _columnCreatedate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLinBlk());
        ls.add(columnSortCenter());
        ls.add(columnLocationCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnStockBox());
        ls.add(columnStockCarton());
        ls.add(columnLocid());
        ls.add(columnLocidNm());
        ls.add(columnBrctg());
        ls.add(columnTosplmd());
        ls.add(columnPresplmd());
        ls.add(columnSplrevun());
        ls.add(columnSplrevunNm());
        ls.add(columnSplrevctqa());
        ls.add(columnReplenishPNum());
        ls.add(columnBssplpt());
        ls.add(columnToReplenishPNum());
        ls.add(columnToReplenishPQty());
        ls.add(columnPreReplenishPNum());
        ls.add(columnPreReplenishPQty());
        ls.add(columnCreatedate());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterOutput"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlMLocationMasterOutput> getEntityType() { return SqlMLocationMasterOutput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlMLocationMasterOutput newEntity() { return new SqlMLocationMasterOutput(); }
    public SqlMLocationMasterOutput newMyEntity() { return new SqlMLocationMasterOutput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlMLocationMasterOutput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlMLocationMasterOutput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
