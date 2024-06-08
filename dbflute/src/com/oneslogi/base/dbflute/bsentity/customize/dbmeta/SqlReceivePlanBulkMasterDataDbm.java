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
 * The DB meta of SqlReceivePlanBulkMasterData. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlReceivePlanBulkMasterDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlReceivePlanBulkMasterDataDbm _instance = new SqlReceivePlanBulkMasterDataDbm();
    private SqlReceivePlanBulkMasterDataDbm() {}
    public static SqlReceivePlanBulkMasterDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getReceivePlanHId(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getReceivePlanBId(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setReceivePlanBId(ctl(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getProductId(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getLocationId(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getLocZoneWarehouseId(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setLocZoneWarehouseId(ctl(vl)), "locZoneWarehouseId");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getMwWarehouseId(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setMwWarehouseId(ctl(vl)), "mwWarehouseId");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getSupplyCustomerId(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setSupplyCustomerId(ctl(vl)), "supplyCustomerId");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getSupplyVendorFlg(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setSupplyVendorFlg((String)vl), "supplyVendorFlg");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getDepositCustomerId(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setDepositCustomerId(ctl(vl)), "depositCustomerId");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getDepositFlg(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setDepositFlg((String)vl), "depositFlg");
        setupEpg(_epgMap, et -> ((SqlReceivePlanBulkMasterData)et).getDecimalExistFlg(), (et, vl) -> ((SqlReceivePlanBulkMasterData)et).setDecimalExistFlg((String)vl), "decimalExistFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlReceivePlanBulkMasterData";
    protected final String _tableDispName = "SqlReceivePlanBulkMasterData";
    protected final String _tablePropertyName = "sqlReceivePlanBulkMasterData";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlReceivePlanBulkMasterData", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, Long.class, "receivePlanBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocZoneWarehouseId = cci("LOC_ZONE_WAREHOUSE_ID", "LOC_ZONE_WAREHOUSE_ID", null, null, Long.class, "locZoneWarehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMwWarehouseId = cci("MW_WAREHOUSE_ID", "MW_WAREHOUSE_ID", null, null, Long.class, "mwWarehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerId = cci("SUPPLY_CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", null, null, Long.class, "supplyCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyVendorFlg = cci("SUPPLY_VENDOR_FLG", "SUPPLY_VENDOR_FLG", null, null, String.class, "supplyVendorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCustomerId = cci("DEPOSIT_CUSTOMER_ID", "DEPOSIT_CUSTOMER_ID", null, null, Long.class, "depositCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositFlg = cci("DEPOSIT_FLG", "DEPOSIT_FLG", null, null, String.class, "depositFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DepositFlg, false);
    protected final ColumnInfo _columnDecimalExistFlg = cci("DECIMAL_EXIST_FLG", "DECIMAL_EXIST_FLG", null, null, String.class, "decimalExistFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DecimalExistFlg, false);

    /**
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * RECEIVE_PLAN_B_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
    /**
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOC_ZONE_WAREHOUSE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocZoneWarehouseId() { return _columnLocZoneWarehouseId; }
    /**
     * MW_WAREHOUSE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMwWarehouseId() { return _columnMwWarehouseId; }
    /**
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerId() { return _columnSupplyCustomerId; }
    /**
     * SUPPLY_VENDOR_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyVendorFlg() { return _columnSupplyVendorFlg; }
    /**
     * DEPOSIT_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCustomerId() { return _columnDepositCustomerId; }
    /**
     * DEPOSIT_FLG: {char(1), classification=DepositFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositFlg() { return _columnDepositFlg; }
    /**
     * DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDecimalExistFlg() { return _columnDecimalExistFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnReceivePlanHId());
        ls.add(columnReceivePlanBId());
        ls.add(columnProductId());
        ls.add(columnLocationId());
        ls.add(columnLocZoneWarehouseId());
        ls.add(columnMwWarehouseId());
        ls.add(columnSupplyCustomerId());
        ls.add(columnSupplyVendorFlg());
        ls.add(columnDepositCustomerId());
        ls.add(columnDepositFlg());
        ls.add(columnDecimalExistFlg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlReceivePlanBulkMasterData"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlReceivePlanBulkMasterData> getEntityType() { return SqlReceivePlanBulkMasterData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlReceivePlanBulkMasterData newEntity() { return new SqlReceivePlanBulkMasterData(); }
    public SqlReceivePlanBulkMasterData newMyEntity() { return new SqlReceivePlanBulkMasterData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlReceivePlanBulkMasterData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlReceivePlanBulkMasterData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
