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
 * The DB meta of SqlDeliverySlipListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlDeliverySlipListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlDeliverySlipListPrintDbm _instance = new SqlDeliverySlipListPrintDbm();
    private SqlDeliverySlipListPrintDbm() {}
    public static SqlDeliverySlipListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getClientCd(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getClientNm(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getCenterCd(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getCenterNm(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getSupplyCustomerCd(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getSupplyCustomerNm(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getShippingDt(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getDelivDt(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getShippingSlipNo(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getClientShippingNo(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getProductCd(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getProductNm(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getTelNo(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setTelNo((String)vl), "telNo");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getLot(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getLimitDt(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getPickingNum(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setPickingNum(ctb(vl)), "pickingNum");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getPackingOutFlg(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setPackingOutFlg((String)vl), "packingOutFlg");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getPickingWorkNo(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getTotalPrice(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setTotalPrice(ctb(vl)), "totalPrice");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getTotalTax(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setTotalTax(ctb(vl)), "totalTax");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getPrice(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setPrice(ctb(vl)), "price");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getTax(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setTax(ctb(vl)), "tax");
        setupEpg(_epgMap, et -> ((SqlDeliverySlipListPrint)et).getShippingInstBId(), (et, vl) -> ((SqlDeliverySlipListPrint)et).setShippingInstBId(ctl(vl)), "shippingInstBId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlDeliverySlipListPrint";
    protected final String _tableDispName = "SqlDeliverySlipListPrint";
    protected final String _tablePropertyName = "sqlDeliverySlipListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlDeliverySlipListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo = cci("TEL_NO", "TEL_NO", null, null, String.class, "telNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingNum = cci("PICKING_NUM", "PICKING_NUM", null, null, java.math.BigDecimal.class, "pickingNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingOutFlg = cci("PACKING_OUT_FLG", "PACKING_OUT_FLG", null, null, String.class, "packingOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalPrice = cci("TOTAL_PRICE", "TOTAL_PRICE", null, null, java.math.BigDecimal.class, "totalPrice", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalTax = cci("TOTAL_TAX", "TOTAL_TAX", null, null, java.math.BigDecimal.class, "totalTax", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice = cci("PRICE", "PRICE", null, null, java.math.BigDecimal.class, "price", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTax = cci("TAX", "TAX", null, null, java.math.BigDecimal.class, "tax", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingInstBId = cci("SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", null, null, Long.class, "shippingInstBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
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
     * SUPPLY_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * SHIPPING_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * DELIV_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * SHIPPING_SLIP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * CLIENT_SHIPPING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
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
     * TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo() { return _columnTelNo; }
    /**
     * LOT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMIT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * PICKING_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNum() { return _columnPickingNum; }
    /**
     * PACKING_OUT_FLG: {char(1), classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutFlg() { return _columnPackingOutFlg; }
    /**
     * PICKING_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * TOTAL_PRICE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalPrice() { return _columnTotalPrice; }
    /**
     * TOTAL_TAX: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalTax() { return _columnTotalTax; }
    /**
     * PRICE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice() { return _columnPrice; }
    /**
     * TAX: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTax() { return _columnTax; }
    /**
     * SHIPPING_INST_B_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstBId() { return _columnShippingInstBId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnShippingDt());
        ls.add(columnDelivDt());
        ls.add(columnShippingSlipNo());
        ls.add(columnClientShippingNo());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnTelNo());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnPickingNum());
        ls.add(columnPackingOutFlg());
        ls.add(columnPickingWorkNo());
        ls.add(columnTotalPrice());
        ls.add(columnTotalTax());
        ls.add(columnPrice());
        ls.add(columnTax());
        ls.add(columnShippingInstBId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlDeliverySlipListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlDeliverySlipListPrint> getEntityType() { return SqlDeliverySlipListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlDeliverySlipListPrint newEntity() { return new SqlDeliverySlipListPrint(); }
    public SqlDeliverySlipListPrint newMyEntity() { return new SqlDeliverySlipListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlDeliverySlipListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlDeliverySlipListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
