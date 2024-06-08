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
 * The DB meta of SqlCasePickingDataList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlCasePickingDataListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlCasePickingDataListDbm _instance = new SqlCasePickingDataListDbm();
    private SqlCasePickingDataListDbm() {}
    public static SqlCasePickingDataListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getCenterId(), (et, vl) -> ((SqlCasePickingDataList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getCasePickingNo(), (et, vl) -> ((SqlCasePickingDataList)et).setCasePickingNo((String)vl), "casePickingNo");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getStockId(), (et, vl) -> ((SqlCasePickingDataList)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getProductCd(), (et, vl) -> ((SqlCasePickingDataList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getProductNm(), (et, vl) -> ((SqlCasePickingDataList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getJanCd(), (et, vl) -> ((SqlCasePickingDataList)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getLocationCd(), (et, vl) -> ((SqlCasePickingDataList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getLocationNm(), (et, vl) -> ((SqlCasePickingDataList)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getSumPickingNum(), (et, vl) -> ((SqlCasePickingDataList)et).setSumPickingNum(ctb(vl)), "sumPickingNum");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getPickingWorkNo(), (et, vl) -> ((SqlCasePickingDataList)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getWarehouseNm(), (et, vl) -> ((SqlCasePickingDataList)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getClientCd(), (et, vl) -> ((SqlCasePickingDataList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getClientNm(), (et, vl) -> ((SqlCasePickingDataList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getCenterCd(), (et, vl) -> ((SqlCasePickingDataList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getCenterNm(), (et, vl) -> ((SqlCasePickingDataList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getWarehouseCd(), (et, vl) -> ((SqlCasePickingDataList)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getWorkDt(), (et, vl) -> ((SqlCasePickingDataList)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getPickingBatchNo(), (et, vl) -> ((SqlCasePickingDataList)et).setPickingBatchNo((String)vl), "pickingBatchNo");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getZonePickingOrder(), (et, vl) -> ((SqlCasePickingDataList)et).setZonePickingOrder(ctl(vl)), "zonePickingOrder");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getZoneCd(), (et, vl) -> ((SqlCasePickingDataList)et).setZoneCd((String)vl), "zoneCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getZoneNm(), (et, vl) -> ((SqlCasePickingDataList)et).setZoneNm((String)vl), "zoneNm");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getLocationPickingOrder(), (et, vl) -> ((SqlCasePickingDataList)et).setLocationPickingOrder(ctl(vl)), "locationPickingOrder");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getLimitDt(), (et, vl) -> ((SqlCasePickingDataList)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getLot(), (et, vl) -> ((SqlCasePickingDataList)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getStoreLabelNo(), (et, vl) -> ((SqlCasePickingDataList)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getStoreDt(), (et, vl) -> ((SqlCasePickingDataList)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getClientId(), (et, vl) -> ((SqlCasePickingDataList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getStockTypeCd(), (et, vl) -> ((SqlCasePickingDataList)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getStockTypeNm(), (et, vl) -> ((SqlCasePickingDataList)et).setStockTypeNm((String)vl), "stockTypeNm");
        setupEpg(_epgMap, et -> ((SqlCasePickingDataList)et).getProductId(), (et, vl) -> ((SqlCasePickingDataList)et).setProductId(ctl(vl)), "productId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlCasePickingDataList";
    protected final String _tableDispName = "SqlCasePickingDataList";
    protected final String _tablePropertyName = "sqlCasePickingDataList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlCasePickingDataList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterId = cci("center_id", "center_id", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePickingNo = cci("case_picking_no", "case_picking_no", null, null, String.class, "casePickingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockId = cci("stock_id", "stock_id", null, null, Long.class, "stockId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("product_cd", "product_cd", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("product_nm", "product_nm", null, null, String.class, "productNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("jan_cd", "jan_cd", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("location_cd", "location_cd", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("location_nm", "location_nm", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumPickingNum = cci("sum_picking_num", "sum_picking_num", null, null, java.math.BigDecimal.class, "sumPickingNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("picking_work_no", "picking_work_no", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("warehouse_nm", "warehouse_nm", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("client_cd", "client_cd", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("client_nm", "client_nm", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("center_cd", "center_cd", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("center_nm", "center_nm", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("warehouse_cd", "warehouse_cd", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("work_dt", "work_dt", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingBatchNo = cci("picking_batch_no", "picking_batch_no", null, null, String.class, "pickingBatchNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZonePickingOrder = cci("zone_picking_order", "zone_picking_order", null, null, Long.class, "zonePickingOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneCd = cci("zone_cd", "zone_cd", null, null, String.class, "zoneCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneNm = cci("zone_nm", "zone_nm", null, null, String.class, "zoneNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationPickingOrder = cci("location_picking_order", "location_picking_order", null, null, Long.class, "locationPickingOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("limit_dt", "limit_dt", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("lot", "lot", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("store_label_no", "store_label_no", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("store_dt", "store_dt", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("client_id", "client_id", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("stock_type_cd", "stock_type_cd", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeNm = cci("stock_type_nm", "stock_type_nm", null, null, String.class, "stockTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("product_id", "product_id", null, null, Long.class, "productId", null, true, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * center_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * case_picking_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePickingNo() { return _columnCasePickingNo; }
    /**
     * stock_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * product_cd: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * product_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * jan_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * location_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * location_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * sum_picking_num: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumPickingNum() { return _columnSumPickingNum; }
    /**
     * picking_work_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * warehouse_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseNm() { return _columnWarehouseNm; }
    /**
     * client_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * client_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * center_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * center_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * warehouse_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * work_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * picking_batch_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBatchNo() { return _columnPickingBatchNo; }
    /**
     * zone_picking_order: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZonePickingOrder() { return _columnZonePickingOrder; }
    /**
     * zone_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneCd() { return _columnZoneCd; }
    /**
     * zone_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneNm() { return _columnZoneNm; }
    /**
     * location_picking_order: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationPickingOrder() { return _columnLocationPickingOrder; }
    /**
     * limit_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * lot: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * store_label_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * store_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * client_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * stock_type_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * stock_type_nm: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeNm() { return _columnStockTypeNm; }
    /**
     * product_id: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterId());
        ls.add(columnCasePickingNo());
        ls.add(columnStockId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnJanCd());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnSumPickingNum());
        ls.add(columnPickingWorkNo());
        ls.add(columnWarehouseNm());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnWarehouseCd());
        ls.add(columnWorkDt());
        ls.add(columnPickingBatchNo());
        ls.add(columnZonePickingOrder());
        ls.add(columnZoneCd());
        ls.add(columnZoneNm());
        ls.add(columnLocationPickingOrder());
        ls.add(columnLimitDt());
        ls.add(columnLot());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnClientId());
        ls.add(columnStockTypeCd());
        ls.add(columnStockTypeNm());
        ls.add(columnProductId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlCasePickingDataList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlCasePickingDataList> getEntityType() { return SqlCasePickingDataList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlCasePickingDataList newEntity() { return new SqlCasePickingDataList(); }
    public SqlCasePickingDataList newMyEntity() { return new SqlCasePickingDataList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlCasePickingDataList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlCasePickingDataList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
