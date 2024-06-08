package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of E_LOCATION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ELocationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ELocationDbm _instance = new ELocationDbm();
    private ELocationDbm() {}
    public static ELocationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ELocation)et).getLocationId(), (et, vl) -> ((ELocation)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((ELocation)et).getReceiveCd(), (et, vl) -> ((ELocation)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getReceiveRowId(), (et, vl) -> ((ELocation)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ELocation)et).getImportFlg(), (et, vl) -> ((ELocation)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ELocation)et).getErrorFlg(), (et, vl) -> ((ELocation)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ELocation)et).getErrorMessageCd(), (et, vl) -> ((ELocation)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getCenterCd(), (et, vl) -> ((ELocation)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getLocationCd(), (et, vl) -> ((ELocation)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getLocationNm(), (et, vl) -> ((ELocation)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((ELocation)et).getWarehouseCd(), (et, vl) -> ((ELocation)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getZoneCd(), (et, vl) -> ((ELocation)et).setZoneCd((String)vl), "zoneCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getLocationType(), (et, vl) -> ((ELocation)et).setLocationType((String)vl), "locationType");
        setupEpg(_epgMap, et -> ((ELocation)et).getPickingLocationFlg(), (et, vl) -> ((ELocation)et).setPickingLocationFlg((String)vl), "pickingLocationFlg");
        setupEpg(_epgMap, et -> ((ELocation)et).getAllocNgFlg(), (et, vl) -> ((ELocation)et).setAllocNgFlg((String)vl), "allocNgFlg");
        setupEpg(_epgMap, et -> ((ELocation)et).getPickingOrder(), (et, vl) -> ((ELocation)et).setPickingOrder((String)vl), "pickingOrder");
        setupEpg(_epgMap, et -> ((ELocation)et).getAllocOrder(), (et, vl) -> ((ELocation)et).setAllocOrder((String)vl), "allocOrder");
        setupEpg(_epgMap, et -> ((ELocation)et).getClientCd(), (et, vl) -> ((ELocation)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getReplenishProductCd(), (et, vl) -> ((ELocation)et).setReplenishProductCd((String)vl), "replenishProductCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getReplenishStockTypeCd(), (et, vl) -> ((ELocation)et).setReplenishStockTypeCd((String)vl), "replenishStockTypeCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getReplenishDepositCd(), (et, vl) -> ((ELocation)et).setReplenishDepositCd((String)vl), "replenishDepositCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getReplenishPNum(), (et, vl) -> ((ELocation)et).setReplenishPNum((String)vl), "replenishPNum");
        setupEpg(_epgMap, et -> ((ELocation)et).getReplenishPProductShapeCd(), (et, vl) -> ((ELocation)et).setReplenishPProductShapeCd((String)vl), "replenishPProductShapeCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getMaxStoreNum(), (et, vl) -> ((ELocation)et).setMaxStoreNum((String)vl), "maxStoreNum");
        setupEpg(_epgMap, et -> ((ELocation)et).getMaxStoreProductShapeCd(), (et, vl) -> ((ELocation)et).setMaxStoreProductShapeCd((String)vl), "maxStoreProductShapeCd");
        setupEpg(_epgMap, et -> ((ELocation)et).getDelFlg(), (et, vl) -> ((ELocation)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ELocation)et).getVersionNo(), (et, vl) -> ((ELocation)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ELocation)et).getControlNo(), (et, vl) -> ((ELocation)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ELocation)et).getAddDt(), (et, vl) -> ((ELocation)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ELocation)et).getAddUser(), (et, vl) -> ((ELocation)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ELocation)et).getAddProcess(), (et, vl) -> ((ELocation)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ELocation)et).getUpdDt(), (et, vl) -> ((ELocation)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ELocation)et).getUpdUser(), (et, vl) -> ((ELocation)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ELocation)et).getUpdProcess(), (et, vl) -> ((ELocation)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_LOCATION";
    protected final String _tableDispName = "E_LOCATION";
    protected final String _tablePropertyName = "ELocation";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_LOCATION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneCd = cci("ZONE_CD", "ZONE_CD", null, null, String.class, "zoneCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationType = cci("LOCATION_TYPE", "LOCATION_TYPE", null, null, String.class, "locationType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingLocationFlg = cci("PICKING_LOCATION_FLG", "PICKING_LOCATION_FLG", null, null, String.class, "pickingLocationFlg", null, false, false, false, "varchar", 255, 0, null, "1", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNgFlg = cci("ALLOC_NG_FLG", "ALLOC_NG_FLG", null, null, String.class, "allocNgFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingOrder = cci("PICKING_ORDER", "PICKING_ORDER", null, null, String.class, "pickingOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, String.class, "allocOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishProductCd = cci("REPLENISH_PRODUCT_CD", "REPLENISH_PRODUCT_CD", null, null, String.class, "replenishProductCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishStockTypeCd = cci("REPLENISH_STOCK_TYPE_CD", "REPLENISH_STOCK_TYPE_CD", null, null, String.class, "replenishStockTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishDepositCd = cci("REPLENISH_DEPOSIT_CD", "REPLENISH_DEPOSIT_CD", null, null, String.class, "replenishDepositCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPNum = cci("REPLENISH_P_NUM", "REPLENISH_P_NUM", null, null, String.class, "replenishPNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPProductShapeCd = cci("REPLENISH_P_PRODUCT_SHAPE_CD", "REPLENISH_P_PRODUCT_SHAPE_CD", null, null, String.class, "replenishPProductShapeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreNum = cci("MAX_STORE_NUM", "MAX_STORE_NUM", null, null, String.class, "maxStoreNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreProductShapeCd = cci("MAX_STORE_PRODUCT_SHAPE_CD", "MAX_STORE_PRODUCT_SHAPE_CD", null, null, String.class, "maxStoreProductShapeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * LOCATION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOCATION_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * ZONE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneCd() { return _columnZoneCd; }
    /**
     * LOCATION_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationType() { return _columnLocationType; }
    /**
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingLocationFlg() { return _columnPickingLocationFlg; }
    /**
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNgFlg() { return _columnAllocNgFlg; }
    /**
     * PICKING_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingOrder() { return _columnPickingOrder; }
    /**
     * ALLOC_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishProductCd() { return _columnReplenishProductCd; }
    /**
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishStockTypeCd() { return _columnReplenishStockTypeCd; }
    /**
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishDepositCd() { return _columnReplenishDepositCd; }
    /**
     * REPLENISH_P_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPNum() { return _columnReplenishPNum; }
    /**
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPProductShapeCd() { return _columnReplenishPProductShapeCd; }
    /**
     * MAX_STORE_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreNum() { return _columnMaxStoreNum; }
    /**
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreProductShapeCd() { return _columnMaxStoreProductShapeCd; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLocationId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnCenterCd());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnWarehouseCd());
        ls.add(columnZoneCd());
        ls.add(columnLocationType());
        ls.add(columnPickingLocationFlg());
        ls.add(columnAllocNgFlg());
        ls.add(columnPickingOrder());
        ls.add(columnAllocOrder());
        ls.add(columnClientCd());
        ls.add(columnReplenishProductCd());
        ls.add(columnReplenishStockTypeCd());
        ls.add(columnReplenishDepositCd());
        ls.add(columnReplenishPNum());
        ls.add(columnReplenishPProductShapeCd());
        ls.add(columnMaxStoreNum());
        ls.add(columnMaxStoreProductShapeCd());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLocationId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        return hpcui(ls);
    }

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
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ELocation"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ELocationCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ELocationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ELocation> getEntityType() { return ELocation.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ELocation newEntity() { return new ELocation(); }
    public ELocation newMyEntity() { return new ELocation(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ELocation)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ELocation)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
