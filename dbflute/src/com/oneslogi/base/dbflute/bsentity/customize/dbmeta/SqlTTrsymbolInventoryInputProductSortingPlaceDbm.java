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
 * The DB meta of SqlTTrsymbolInventoryInputProductSortingPlace. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTTrsymbolInventoryInputProductSortingPlaceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTTrsymbolInventoryInputProductSortingPlaceDbm _instance = new SqlTTrsymbolInventoryInputProductSortingPlaceDbm();
    private SqlTTrsymbolInventoryInputProductSortingPlaceDbm() {}
    public static SqlTTrsymbolInventoryInputProductSortingPlaceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).getTrsymbolId(), (et, vl) -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).getCasecd(), (et, vl) -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).setCasecd(ctl(vl)), "casecd");
        setupEpg(_epgMap, et -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).getLot4(), (et, vl) -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).getProductCd(), (et, vl) -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).getReceivedqty(), (et, vl) -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).setReceivedqty(ctb(vl)), "receivedqty");
        setupEpg(_epgMap, et -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).getLot3(), (et, vl) -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).getSotedunit(), (et, vl) -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).setSotedunit((String)vl), "sotedunit");
        setupEpg(_epgMap, et -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).getAssortedunit(), (et, vl) -> ((SqlTTrsymbolInventoryInputProductSortingPlace)et).setAssortedunit((String)vl), "assortedunit");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTTrsymbolInventoryInputProductSortingPlace";
    protected final String _tableDispName = "SqlTTrsymbolInventoryInputProductSortingPlace";
    protected final String _tablePropertyName = "sqlTTrsymbolInventoryInputProductSortingPlace";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTTrsymbolInventoryInputProductSortingPlace", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecd = cci("CASECD", "CASECD", null, null, Long.class, "casecd", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty = cci("RECEIVEDQTY", "RECEIVEDQTY", null, null, java.math.BigDecimal.class, "receivedqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedunit = cci("SOTEDUNIT", "SOTEDUNIT", null, null, String.class, "sotedunit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedunit = cci("ASSORTEDUNIT", "ASSORTEDUNIT", null, null, String.class, "assortedunit", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TRSYMBOL_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * CASECD: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecd() { return _columnCasecd; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * RECEIVEDQTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty() { return _columnReceivedqty; }
    /**
     * LOT3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * SOTEDUNIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedunit() { return _columnSotedunit; }
    /**
     * ASSORTEDUNIT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedunit() { return _columnAssortedunit; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTrsymbolId());
        ls.add(columnCasecd());
        ls.add(columnLot4());
        ls.add(columnProductCd());
        ls.add(columnReceivedqty());
        ls.add(columnLot3());
        ls.add(columnSotedunit());
        ls.add(columnAssortedunit());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTTrsymbolInventoryInputProductSortingPlace"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTTrsymbolInventoryInputProductSortingPlace> getEntityType() { return SqlTTrsymbolInventoryInputProductSortingPlace.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTTrsymbolInventoryInputProductSortingPlace newEntity() { return new SqlTTrsymbolInventoryInputProductSortingPlace(); }
    public SqlTTrsymbolInventoryInputProductSortingPlace newMyEntity() { return new SqlTTrsymbolInventoryInputProductSortingPlace(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTTrsymbolInventoryInputProductSortingPlace)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTTrsymbolInventoryInputProductSortingPlace)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
