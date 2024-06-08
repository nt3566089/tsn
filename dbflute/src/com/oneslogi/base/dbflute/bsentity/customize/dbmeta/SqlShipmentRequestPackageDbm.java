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
 * The DB meta of SqlShipmentRequestPackage. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShipmentRequestPackageDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShipmentRequestPackageDbm _instance = new SqlShipmentRequestPackageDbm();
    private SqlShipmentRequestPackageDbm() {}
    public static SqlShipmentRequestPackageDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getClientId(), (et, vl) -> ((SqlShipmentRequestPackage)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getClientCd(), (et, vl) -> ((SqlShipmentRequestPackage)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getCenterId(), (et, vl) -> ((SqlShipmentRequestPackage)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getCenterCd(), (et, vl) -> ((SqlShipmentRequestPackage)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getWarehouseId(), (et, vl) -> ((SqlShipmentRequestPackage)et).setWarehouseId((String)vl), "warehouseId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getCompId(), (et, vl) -> ((SqlShipmentRequestPackage)et).setCompId(ctl(vl)), "compId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getCompCd(), (et, vl) -> ((SqlShipmentRequestPackage)et).setCompCd((String)vl), "compCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getProductAbbr(), (et, vl) -> ((SqlShipmentRequestPackage)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getGrossWeight(), (et, vl) -> ((SqlShipmentRequestPackage)et).setGrossWeight(ctb(vl)), "grossWeight");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getLength(), (et, vl) -> ((SqlShipmentRequestPackage)et).setLength(ctb(vl)), "length");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getWidth(), (et, vl) -> ((SqlShipmentRequestPackage)et).setWidth(ctb(vl)), "width");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getHeight(), (et, vl) -> ((SqlShipmentRequestPackage)et).setHeight(ctb(vl)), "height");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getNmfcCode(), (et, vl) -> ((SqlShipmentRequestPackage)et).setNmfcCode((String)vl), "nmfcCode");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getFreightCls(), (et, vl) -> ((SqlShipmentRequestPackage)et).setFreightCls((String)vl), "freightCls");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getShippingPackingNo(), (et, vl) -> ((SqlShipmentRequestPackage)et).setShippingPackingNo((String)vl), "shippingPackingNo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestPackage)et).getClientShippingNo(), (et, vl) -> ((SqlShipmentRequestPackage)et).setClientShippingNo((String)vl), "clientShippingNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShipmentRequestPackage";
    protected final String _tableDispName = "SqlShipmentRequestPackage";
    protected final String _tablePropertyName = "sqlShipmentRequestPackage";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShipmentRequestPackage", _tableDbName);
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
    protected final ColumnInfo _columnCompId = cci("COMP_ID", "COMP_ID", null, null, Long.class, "compId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompCd = cci("COMP_CD", "COMP_CD", null, null, String.class, "compCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossWeight = cci("GROSS_WEIGHT", "GROSS_WEIGHT", null, null, java.math.BigDecimal.class, "grossWeight", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength = cci("LENGTH", "LENGTH", null, null, java.math.BigDecimal.class, "length", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth = cci("WIDTH", "WIDTH", null, null, java.math.BigDecimal.class, "width", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight = cci("HEIGHT", "HEIGHT", null, null, java.math.BigDecimal.class, "height", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmfcCode = cci("NMFC_CODE", "NMFC_CODE", null, null, String.class, "nmfcCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightCls = cci("FREIGHT_CLS", "FREIGHT_CLS", null, null, String.class, "freightCls", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPackingNo = cci("SHIPPING_PACKING_NO", "SHIPPING_PACKING_NO", null, null, String.class, "shippingPackingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

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
     * COMP_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompId() { return _columnCompId; }
    /**
     * COMP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompCd() { return _columnCompCd; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * GROSS_WEIGHT: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossWeight() { return _columnGrossWeight; }
    /**
     * LENGTH: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength() { return _columnLength; }
    /**
     * WIDTH: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth() { return _columnWidth; }
    /**
     * HEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight() { return _columnHeight; }
    /**
     * NMFC_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmfcCode() { return _columnNmfcCode; }
    /**
     * FREIGHT_CLS: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightCls() { return _columnFreightCls; }
    /**
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo() { return _columnShippingPackingNo; }
    /**
     * CLIENT_SHIPPING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnWarehouseId());
        ls.add(columnCompId());
        ls.add(columnCompCd());
        ls.add(columnProductAbbr());
        ls.add(columnGrossWeight());
        ls.add(columnLength());
        ls.add(columnWidth());
        ls.add(columnHeight());
        ls.add(columnNmfcCode());
        ls.add(columnFreightCls());
        ls.add(columnShippingPackingNo());
        ls.add(columnClientShippingNo());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShipmentRequestPackage"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShipmentRequestPackage> getEntityType() { return SqlShipmentRequestPackage.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShipmentRequestPackage newEntity() { return new SqlShipmentRequestPackage(); }
    public SqlShipmentRequestPackage newMyEntity() { return new SqlShipmentRequestPackage(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShipmentRequestPackage)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShipmentRequestPackage)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
