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
 * The DB meta of SqlTrhanbaiinvRemoteIslandStockList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTrhanbaiinvRemoteIslandStockListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTrhanbaiinvRemoteIslandStockListDbm _instance = new SqlTrhanbaiinvRemoteIslandStockListDbm();
    private SqlTrhanbaiinvRemoteIslandStockListDbm() {}
    public static SqlTrhanbaiinvRemoteIslandStockListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTrhanbaiinvRemoteIslandStockList)et).getCenterId(), (et, vl) -> ((SqlTrhanbaiinvRemoteIslandStockList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlTrhanbaiinvRemoteIslandStockList)et).getClientId(), (et, vl) -> ((SqlTrhanbaiinvRemoteIslandStockList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlTrhanbaiinvRemoteIslandStockList)et).getProductId(), (et, vl) -> ((SqlTrhanbaiinvRemoteIslandStockList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlTrhanbaiinvRemoteIslandStockList)et).getUsernum1(), (et, vl) -> ((SqlTrhanbaiinvRemoteIslandStockList)et).setUsernum1(ctl(vl)), "usernum1");
        setupEpg(_epgMap, et -> ((SqlTrhanbaiinvRemoteIslandStockList)et).getStockNum(), (et, vl) -> ((SqlTrhanbaiinvRemoteIslandStockList)et).setStockNum(ctb(vl)), "stockNum");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTrhanbaiinvRemoteIslandStockList";
    protected final String _tableDispName = "SqlTrhanbaiinvRemoteIslandStockList";
    protected final String _tablePropertyName = "sqlTrhanbaiinvRemoteIslandStockList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTrhanbaiinvRemoteIslandStockList", _tableDbName);
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
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("USERNUM1", "USERNUM1", null, null, Long.class, "usernum1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockNum = cci("STOCK_NUM", "STOCK_NUM", null, null, java.math.BigDecimal.class, "stockNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);

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
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * USERNUM1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }
    /**
     * STOCK_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockNum() { return _columnStockNum; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnProductId());
        ls.add(columnUsernum1());
        ls.add(columnStockNum());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvRemoteIslandStockList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTrhanbaiinvRemoteIslandStockList> getEntityType() { return SqlTrhanbaiinvRemoteIslandStockList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTrhanbaiinvRemoteIslandStockList newEntity() { return new SqlTrhanbaiinvRemoteIslandStockList(); }
    public SqlTrhanbaiinvRemoteIslandStockList newMyEntity() { return new SqlTrhanbaiinvRemoteIslandStockList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTrhanbaiinvRemoteIslandStockList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTrhanbaiinvRemoteIslandStockList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
