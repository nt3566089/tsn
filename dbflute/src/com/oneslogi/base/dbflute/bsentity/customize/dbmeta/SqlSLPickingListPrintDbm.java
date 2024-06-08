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
 * The DB meta of SqlSLPickingListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlSLPickingListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlSLPickingListPrintDbm _instance = new SqlSLPickingListPrintDbm();
    private SqlSLPickingListPrintDbm() {}
    public static SqlSLPickingListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getClientCd(), (et, vl) -> ((SqlSLPickingListPrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getClientNm(), (et, vl) -> ((SqlSLPickingListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getCenterId(), (et, vl) -> ((SqlSLPickingListPrint)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getCenterCd(), (et, vl) -> ((SqlSLPickingListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getCenterNm(), (et, vl) -> ((SqlSLPickingListPrint)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getPickingGroupNo(), (et, vl) -> ((SqlSLPickingListPrint)et).setPickingGroupNo((String)vl), "pickingGroupNo");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getWorkDt(), (et, vl) -> ((SqlSLPickingListPrint)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getSupplyCustomerCd(), (et, vl) -> ((SqlSLPickingListPrint)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getSupplyCustomerNm(), (et, vl) -> ((SqlSLPickingListPrint)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getSeedingNo(), (et, vl) -> ((SqlSLPickingListPrint)et).setSeedingNo((String)vl), "seedingNo");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getPickingHId(), (et, vl) -> ((SqlSLPickingListPrint)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getStockTypeCd(), (et, vl) -> ((SqlSLPickingListPrint)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getStockTypeNm(), (et, vl) -> ((SqlSLPickingListPrint)et).setStockTypeNm((String)vl), "stockTypeNm");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getTempNo(), (et, vl) -> ((SqlSLPickingListPrint)et).setTempNo((String)vl), "tempNo");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getProductId(), (et, vl) -> ((SqlSLPickingListPrint)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getProductCd(), (et, vl) -> ((SqlSLPickingListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getProductNm(), (et, vl) -> ((SqlSLPickingListPrint)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getLocationCd(), (et, vl) -> ((SqlSLPickingListPrint)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getLocationNm(), (et, vl) -> ((SqlSLPickingListPrint)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getJancd(), (et, vl) -> ((SqlSLPickingListPrint)et).setJancd((String)vl), "jancd");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getStoreLabelNo(), (et, vl) -> ((SqlSLPickingListPrint)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getStoreDt(), (et, vl) -> ((SqlSLPickingListPrint)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getLimitDt(), (et, vl) -> ((SqlSLPickingListPrint)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getLot(), (et, vl) -> ((SqlSLPickingListPrint)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getSumPickingNum(), (et, vl) -> ((SqlSLPickingListPrint)et).setSumPickingNum(ctb(vl)), "sumPickingNum");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getPickingWorkNo1(), (et, vl) -> ((SqlSLPickingListPrint)et).setPickingWorkNo1((String)vl), "pickingWorkNo1");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getPickingWorkNo2(), (et, vl) -> ((SqlSLPickingListPrint)et).setPickingWorkNo2((String)vl), "pickingWorkNo2");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getShippingPackingNo1(), (et, vl) -> ((SqlSLPickingListPrint)et).setShippingPackingNo1((String)vl), "shippingPackingNo1");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getShippingPackingNo2(), (et, vl) -> ((SqlSLPickingListPrint)et).setShippingPackingNo2((String)vl), "shippingPackingNo2");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getPackingCalCls(), (et, vl) -> ((SqlSLPickingListPrint)et).setPackingCalCls((String)vl), "packingCalCls");
        setupEpg(_epgMap, et -> ((SqlSLPickingListPrint)et).getSlOutFlg(), (et, vl) -> ((SqlSLPickingListPrint)et).setSlOutFlg((String)vl), "slOutFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlSLPickingListPrint";
    protected final String _tableDispName = "SqlSLPickingListPrint";
    protected final String _tablePropertyName = "sqlSLPickingListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlSLPickingListPrint", _tableDbName);
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
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingGroupNo = cci("PICKING_GROUP_NO", "PICKING_GROUP_NO", null, null, String.class, "pickingGroupNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeedingNo = cci("SEEDING_NO", "SEEDING_NO", null, null, String.class, "seedingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeNm = cci("STOCK_TYPE_NM", "STOCK_TYPE_NM", null, null, String.class, "stockTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempNo = cci("TEMP_NO", "TEMP_NO", null, null, String.class, "tempNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJancd = cci("JANCD", "JANCD", null, null, String.class, "jancd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumPickingNum = cci("SUM_PICKING_NUM", "SUM_PICKING_NUM", null, null, java.math.BigDecimal.class, "sumPickingNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo1 = cci("PICKING_WORK_NO1", "PICKING_WORK_NO1", null, null, String.class, "pickingWorkNo1", null, false, false, false, "varchar", 12, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo2 = cci("PICKING_WORK_NO2", "PICKING_WORK_NO2", null, null, String.class, "pickingWorkNo2", null, false, false, false, "varchar", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPackingNo1 = cci("SHIPPING_PACKING_NO1", "SHIPPING_PACKING_NO1", null, null, String.class, "shippingPackingNo1", null, false, false, false, "varchar", 12, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPackingNo2 = cci("SHIPPING_PACKING_NO2", "SHIPPING_PACKING_NO2", null, null, String.class, "shippingPackingNo2", null, false, false, false, "varchar", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingCalCls = cci("PACKING_CAL_CLS", "PACKING_CAL_CLS", null, null, String.class, "packingCalCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlOutFlg = cci("SL_OUT_FLG", "SL_OUT_FLG", null, null, String.class, "slOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);

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
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * PICKING_GROUP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingGroupNo() { return _columnPickingGroupNo; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
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
     * SEEDING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeedingNo() { return _columnSeedingNo; }
    /**
     * PICKING_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * STOCK_TYPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeNm() { return _columnStockTypeNm; }
    /**
     * TEMP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempNo() { return _columnTempNo; }
    /**
     * PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOCATION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * JANCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJancd() { return _columnJancd; }
    /**
     * STORE_LABEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * STORE_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * LIMIT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * LOT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * SUM_PICKING_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumPickingNum() { return _columnSumPickingNum; }
    /**
     * PICKING_WORK_NO1: {varchar(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo1() { return _columnPickingWorkNo1; }
    /**
     * PICKING_WORK_NO2: {varchar(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo2() { return _columnPickingWorkNo2; }
    /**
     * SHIPPING_PACKING_NO1: {varchar(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo1() { return _columnShippingPackingNo1; }
    /**
     * SHIPPING_PACKING_NO2: {varchar(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo2() { return _columnShippingPackingNo2; }
    /**
     * PACKING_CAL_CLS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingCalCls() { return _columnPackingCalCls; }
    /**
     * SL_OUT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlOutFlg() { return _columnSlOutFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnPickingGroupNo());
        ls.add(columnWorkDt());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnSeedingNo());
        ls.add(columnPickingHId());
        ls.add(columnStockTypeCd());
        ls.add(columnStockTypeNm());
        ls.add(columnTempNo());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnJancd());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnLimitDt());
        ls.add(columnLot());
        ls.add(columnSumPickingNum());
        ls.add(columnPickingWorkNo1());
        ls.add(columnPickingWorkNo2());
        ls.add(columnShippingPackingNo1());
        ls.add(columnShippingPackingNo2());
        ls.add(columnPackingCalCls());
        ls.add(columnSlOutFlg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlSLPickingListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlSLPickingListPrint> getEntityType() { return SqlSLPickingListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlSLPickingListPrint newEntity() { return new SqlSLPickingListPrint(); }
    public SqlSLPickingListPrint newMyEntity() { return new SqlSLPickingListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlSLPickingListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlSLPickingListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
