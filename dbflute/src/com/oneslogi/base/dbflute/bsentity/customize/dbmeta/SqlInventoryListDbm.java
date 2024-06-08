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
 * The DB meta of SqlInventoryList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryListDbm _instance = new SqlInventoryListDbm();
    private SqlInventoryListDbm() {}
    public static SqlInventoryListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getCenterId(), (et, vl) -> ((SqlInventoryList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getClientId(), (et, vl) -> ((SqlInventoryList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getUsernum1(), (et, vl) -> ((SqlInventoryList)et).setUsernum1(ctl(vl)), "usernum1");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getInventoryInstKbn(), (et, vl) -> ((SqlInventoryList)et).setInventoryInstKbn((String)vl), "inventoryInstKbn");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getProductId(), (et, vl) -> ((SqlInventoryList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getInvExpectNum(), (et, vl) -> ((SqlInventoryList)et).setInvExpectNum(ctb(vl)), "invExpectNum");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getInventoryNum(), (et, vl) -> ((SqlInventoryList)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getStoringSystemStockNum(), (et, vl) -> ((SqlInventoryList)et).setStoringSystemStockNum(ctb(vl)), "storingSystemStockNum");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getSortSystemStockNum(), (et, vl) -> ((SqlInventoryList)et).setSortSystemStockNum(ctb(vl)), "sortSystemStockNum");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getSortedSystemInventory(), (et, vl) -> ((SqlInventoryList)et).setSortedSystemInventory(ctb(vl)), "sortedSystemInventory");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getRemoteIslandSystemInventory(), (et, vl) -> ((SqlInventoryList)et).setRemoteIslandSystemInventory(ctb(vl)), "remoteIslandSystemInventory");
        setupEpg(_epgMap, et -> ((SqlInventoryList)et).getGoodItemSystemStockNum(), (et, vl) -> ((SqlInventoryList)et).setGoodItemSystemStockNum(ctl(vl)), "goodItemSystemStockNum");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryList";
    protected final String _tableDispName = "SqlInventoryList";
    protected final String _tablePropertyName = "sqlInventoryList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("USERNUM1", "USERNUM1", null, null, Long.class, "usernum1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryInstKbn = cci("INVENTORY_INST_KBN", "INVENTORY_INST_KBN", null, null, String.class, "inventoryInstKbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvExpectNum = cci("INV_EXPECT_NUM", "INV_EXPECT_NUM", null, null, java.math.BigDecimal.class, "invExpectNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoringSystemStockNum = cci("STORING_SYSTEM_STOCK_NUM", "STORING_SYSTEM_STOCK_NUM", null, null, java.math.BigDecimal.class, "storingSystemStockNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortSystemStockNum = cci("SORT_SYSTEM_STOCK_NUM", "SORT_SYSTEM_STOCK_NUM", null, null, java.math.BigDecimal.class, "sortSystemStockNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedSystemInventory = cci("SORTED_SYSTEM_INVENTORY", "SORTED_SYSTEM_INVENTORY", null, null, java.math.BigDecimal.class, "sortedSystemInventory", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemoteIslandSystemInventory = cci("REMOTE_ISLAND_SYSTEM_INVENTORY", "REMOTE_ISLAND_SYSTEM_INVENTORY", null, null, java.math.BigDecimal.class, "remoteIslandSystemInventory", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGoodItemSystemStockNum = cci("GOOD_ITEM_SYSTEM_STOCK_NUM", "GOOD_ITEM_SYSTEM_STOCK_NUM", null, null, Long.class, "goodItemSystemStockNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * USERNUM1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }
    /**
     * INVENTORY_INST_KBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInstKbn() { return _columnInventoryInstKbn; }
    /**
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * INV_EXPECT_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvExpectNum() { return _columnInvExpectNum; }
    /**
     * INVENTORY_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * STORING_SYSTEM_STOCK_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoringSystemStockNum() { return _columnStoringSystemStockNum; }
    /**
     * SORT_SYSTEM_STOCK_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortSystemStockNum() { return _columnSortSystemStockNum; }
    /**
     * SORTED_SYSTEM_INVENTORY: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedSystemInventory() { return _columnSortedSystemInventory; }
    /**
     * REMOTE_ISLAND_SYSTEM_INVENTORY: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemoteIslandSystemInventory() { return _columnRemoteIslandSystemInventory; }
    /**
     * GOOD_ITEM_SYSTEM_STOCK_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGoodItemSystemStockNum() { return _columnGoodItemSystemStockNum; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnUsernum1());
        ls.add(columnInventoryInstKbn());
        ls.add(columnProductId());
        ls.add(columnInvExpectNum());
        ls.add(columnInventoryNum());
        ls.add(columnStoringSystemStockNum());
        ls.add(columnSortSystemStockNum());
        ls.add(columnSortedSystemInventory());
        ls.add(columnRemoteIslandSystemInventory());
        ls.add(columnGoodItemSystemStockNum());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryList> getEntityType() { return SqlInventoryList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryList newEntity() { return new SqlInventoryList(); }
    public SqlInventoryList newMyEntity() { return new SqlInventoryList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
