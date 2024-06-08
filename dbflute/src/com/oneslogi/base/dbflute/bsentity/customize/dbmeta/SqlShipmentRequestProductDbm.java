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
 * The DB meta of SqlShipmentRequestProduct. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShipmentRequestProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShipmentRequestProductDbm _instance = new SqlShipmentRequestProductDbm();
    private SqlShipmentRequestProductDbm() {}
    public static SqlShipmentRequestProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getClientId(), (et, vl) -> ((SqlShipmentRequestProduct)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getClientCd(), (et, vl) -> ((SqlShipmentRequestProduct)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getCenterId(), (et, vl) -> ((SqlShipmentRequestProduct)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getCenterCd(), (et, vl) -> ((SqlShipmentRequestProduct)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getWarehouseId(), (et, vl) -> ((SqlShipmentRequestProduct)et).setWarehouseId((String)vl), "warehouseId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getProductAbbr(), (et, vl) -> ((SqlShipmentRequestProduct)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getProductNm(), (et, vl) -> ((SqlShipmentRequestProduct)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getCounntryOfOrigin(), (et, vl) -> ((SqlShipmentRequestProduct)et).setCounntryOfOrigin((String)vl), "counntryOfOrigin");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getUnitVal(), (et, vl) -> ((SqlShipmentRequestProduct)et).setUnitVal(ctb(vl)), "unitVal");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getPackingNum(), (et, vl) -> ((SqlShipmentRequestProduct)et).setPackingNum(ctb(vl)), "packingNum");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getHtsCd(), (et, vl) -> ((SqlShipmentRequestProduct)et).setHtsCd((String)vl), "htsCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestProduct)et).getProductCd(), (et, vl) -> ((SqlShipmentRequestProduct)et).setProductCd((String)vl), "productCd");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShipmentRequestProduct";
    protected final String _tableDispName = "SqlShipmentRequestProduct";
    protected final String _tablePropertyName = "sqlShipmentRequestProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShipmentRequestProduct", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, String.class, "warehouseId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCounntryOfOrigin = cci("COUNNTRY_OF_ORIGIN", "COUNNTRY_OF_ORIGIN", null, null, String.class, "counntryOfOrigin", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitVal = cci("UNIT_VAL", "UNIT_VAL", null, null, java.math.BigDecimal.class, "unitVal", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum = cci("PACKING_NUM", "PACKING_NUM", null, null, java.math.BigDecimal.class, "packingNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtsCd = cci("HTS_CD", "HTS_CD", null, null, String.class, "htsCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * WAREHOUSE_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCounntryOfOrigin() { return _columnCounntryOfOrigin; }
    /**
     * UNIT_VAL: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitVal() { return _columnUnitVal; }
    /**
     * PACKING_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum() { return _columnPackingNum; }
    /**
     * HTS_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtsCd() { return _columnHtsCd; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnWarehouseId());
        ls.add(columnProductAbbr());
        ls.add(columnProductNm());
        ls.add(columnCounntryOfOrigin());
        ls.add(columnUnitVal());
        ls.add(columnPackingNum());
        ls.add(columnHtsCd());
        ls.add(columnProductCd());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShipmentRequestProduct"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShipmentRequestProduct> getEntityType() { return SqlShipmentRequestProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShipmentRequestProduct newEntity() { return new SqlShipmentRequestProduct(); }
    public SqlShipmentRequestProduct newMyEntity() { return new SqlShipmentRequestProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShipmentRequestProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShipmentRequestProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
