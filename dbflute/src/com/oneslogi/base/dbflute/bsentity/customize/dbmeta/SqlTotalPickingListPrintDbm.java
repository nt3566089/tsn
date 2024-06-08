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
 * The DB meta of SqlTotalPickingListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTotalPickingListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTotalPickingListPrintDbm _instance = new SqlTotalPickingListPrintDbm();
    private SqlTotalPickingListPrintDbm() {}
    public static SqlTotalPickingListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getClientCd(), (et, vl) -> ((SqlTotalPickingListPrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getClientNm(), (et, vl) -> ((SqlTotalPickingListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getCenterId(), (et, vl) -> ((SqlTotalPickingListPrint)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getCenterCd(), (et, vl) -> ((SqlTotalPickingListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getCenterNm(), (et, vl) -> ((SqlTotalPickingListPrint)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getWarehouseCd(), (et, vl) -> ((SqlTotalPickingListPrint)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getWarehouseNm(), (et, vl) -> ((SqlTotalPickingListPrint)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getWorkDt(), (et, vl) -> ((SqlTotalPickingListPrint)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getPickingGroupNo(), (et, vl) -> ((SqlTotalPickingListPrint)et).setPickingGroupNo((String)vl), "pickingGroupNo");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getStockTypeCd(), (et, vl) -> ((SqlTotalPickingListPrint)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getStockTypeNm(), (et, vl) -> ((SqlTotalPickingListPrint)et).setStockTypeNm((String)vl), "stockTypeNm");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getPickingOrder(), (et, vl) -> ((SqlTotalPickingListPrint)et).setPickingOrder(ctl(vl)), "pickingOrder");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getZoneCd(), (et, vl) -> ((SqlTotalPickingListPrint)et).setZoneCd((String)vl), "zoneCd");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getZoneNm(), (et, vl) -> ((SqlTotalPickingListPrint)et).setZoneNm((String)vl), "zoneNm");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getProductCd(), (et, vl) -> ((SqlTotalPickingListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getProductId(), (et, vl) -> ((SqlTotalPickingListPrint)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getPickingHId(), (et, vl) -> ((SqlTotalPickingListPrint)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getProductNm(), (et, vl) -> ((SqlTotalPickingListPrint)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getJancd(), (et, vl) -> ((SqlTotalPickingListPrint)et).setJancd((String)vl), "jancd");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getSumPickingNum(), (et, vl) -> ((SqlTotalPickingListPrint)et).setSumPickingNum(ctb(vl)), "sumPickingNum");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getStoreLabelNo(), (et, vl) -> ((SqlTotalPickingListPrint)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getStoreDt(), (et, vl) -> ((SqlTotalPickingListPrint)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getLot(), (et, vl) -> ((SqlTotalPickingListPrint)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getLimtDt(), (et, vl) -> ((SqlTotalPickingListPrint)et).setLimtDt((String)vl), "limtDt");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getTempNo(), (et, vl) -> ((SqlTotalPickingListPrint)et).setTempNo((String)vl), "tempNo");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getChargeNum(), (et, vl) -> ((SqlTotalPickingListPrint)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getLocationCd(), (et, vl) -> ((SqlTotalPickingListPrint)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getLocationNm(), (et, vl) -> ((SqlTotalPickingListPrint)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlTotalPickingListPrint)et).getTplOutFlg(), (et, vl) -> ((SqlTotalPickingListPrint)et).setTplOutFlg((String)vl), "tplOutFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTotalPickingListPrint";
    protected final String _tableDispName = "SqlTotalPickingListPrint";
    protected final String _tablePropertyName = "sqlTotalPickingListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTotalPickingListPrint", _tableDbName);
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
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("WAREHOUSE_NM", "WAREHOUSE_NM", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingGroupNo = cci("PICKING_GROUP_NO", "PICKING_GROUP_NO", null, null, String.class, "pickingGroupNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeNm = cci("STOCK_TYPE_NM", "STOCK_TYPE_NM", null, null, String.class, "stockTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingOrder = cci("PICKING_ORDER", "PICKING_ORDER", null, null, Long.class, "pickingOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneCd = cci("ZONE_CD", "ZONE_CD", null, null, String.class, "zoneCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneNm = cci("ZONE_NM", "ZONE_NM", null, null, String.class, "zoneNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJancd = cci("JANCD", "JANCD", null, null, String.class, "jancd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumPickingNum = cci("SUM_PICKING_NUM", "SUM_PICKING_NUM", null, null, java.math.BigDecimal.class, "sumPickingNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimtDt = cci("LIMT_DT", "LIMT_DT", null, null, String.class, "limtDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempNo = cci("TEMP_NO", "TEMP_NO", null, null, String.class, "tempNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTplOutFlg = cci("TPL_OUT_FLG", "TPL_OUT_FLG", null, null, String.class, "tplOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);

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
     * WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * WAREHOUSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseNm() { return _columnWarehouseNm; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * PICKING_GROUP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingGroupNo() { return _columnPickingGroupNo; }
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
     * PICKING_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingOrder() { return _columnPickingOrder; }
    /**
     * ZONE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneCd() { return _columnZoneCd; }
    /**
     * ZONE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneNm() { return _columnZoneNm; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PICKING_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * PRODUCT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * JANCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJancd() { return _columnJancd; }
    /**
     * SUM_PICKING_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumPickingNum() { return _columnSumPickingNum; }
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
     * LOT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimtDt() { return _columnLimtDt; }
    /**
     * TEMP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempNo() { return _columnTempNo; }
    /**
     * CHARGE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
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
     * TPL_OUT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTplOutFlg() { return _columnTplOutFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseNm());
        ls.add(columnWorkDt());
        ls.add(columnPickingGroupNo());
        ls.add(columnStockTypeCd());
        ls.add(columnStockTypeNm());
        ls.add(columnPickingOrder());
        ls.add(columnZoneCd());
        ls.add(columnZoneNm());
        ls.add(columnProductCd());
        ls.add(columnProductId());
        ls.add(columnPickingHId());
        ls.add(columnProductNm());
        ls.add(columnJancd());
        ls.add(columnSumPickingNum());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnLot());
        ls.add(columnLimtDt());
        ls.add(columnTempNo());
        ls.add(columnChargeNum());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnTplOutFlg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTotalPickingListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTotalPickingListPrint> getEntityType() { return SqlTotalPickingListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTotalPickingListPrint newEntity() { return new SqlTotalPickingListPrint(); }
    public SqlTotalPickingListPrint newMyEntity() { return new SqlTotalPickingListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTotalPickingListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTotalPickingListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
