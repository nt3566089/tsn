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
 * The DB meta of W_LOCATION_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WLocationInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WLocationInputDbm _instance = new WLocationInputDbm();
    private WLocationInputDbm() {}
    public static WLocationInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WLocationInput)et).getLocationInputId(), (et, vl) -> ((WLocationInput)et).setLocationInputId(ctl(vl)), "locationInputId");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getCenterCd(), (et, vl) -> ((WLocationInput)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getWarehouseCd(), (et, vl) -> ((WLocationInput)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getZoneCd(), (et, vl) -> ((WLocationInput)et).setZoneCd((String)vl), "zoneCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getLocationCd(), (et, vl) -> ((WLocationInput)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getLocationNm(), (et, vl) -> ((WLocationInput)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getPickingLocationFlg(), (et, vl) -> ((WLocationInput)et).setPickingLocationFlg((String)vl), "pickingLocationFlg");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getPickingOrder(), (et, vl) -> ((WLocationInput)et).setPickingOrder((String)vl), "pickingOrder");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getLocationType(), (et, vl) -> ((WLocationInput)et).setLocationType((String)vl), "locationType");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getAllocOrder(), (et, vl) -> ((WLocationInput)et).setAllocOrder((String)vl), "allocOrder");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getAllocNgFlg(), (et, vl) -> ((WLocationInput)et).setAllocNgFlg((String)vl), "allocNgFlg");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getRestockProductCd(), (et, vl) -> ((WLocationInput)et).setRestockProductCd((String)vl), "restockProductCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getRestockStockTypeCd(), (et, vl) -> ((WLocationInput)et).setRestockStockTypeCd((String)vl), "restockStockTypeCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getRestockDepositCd(), (et, vl) -> ((WLocationInput)et).setRestockDepositCd((String)vl), "restockDepositCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getRestockShapeCd(), (et, vl) -> ((WLocationInput)et).setRestockShapeCd((String)vl), "restockShapeCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getRestockPointNum(), (et, vl) -> ((WLocationInput)et).setRestockPointNum((String)vl), "restockPointNum");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getMaxStoreShapeCd(), (et, vl) -> ((WLocationInput)et).setMaxStoreShapeCd((String)vl), "maxStoreShapeCd");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getMaxStoreNum(), (et, vl) -> ((WLocationInput)et).setMaxStoreNum((String)vl), "maxStoreNum");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getLineNo(), (et, vl) -> ((WLocationInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getWorkFlg(), (et, vl) -> ((WLocationInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getErrorFlg(), (et, vl) -> ((WLocationInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getErrorMsg(), (et, vl) -> ((WLocationInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getDelFlg(), (et, vl) -> ((WLocationInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getVersionNo(), (et, vl) -> ((WLocationInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getControlNo(), (et, vl) -> ((WLocationInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getAddDt(), (et, vl) -> ((WLocationInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getAddUser(), (et, vl) -> ((WLocationInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getAddProcess(), (et, vl) -> ((WLocationInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getUpdDt(), (et, vl) -> ((WLocationInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getUpdUser(), (et, vl) -> ((WLocationInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WLocationInput)et).getUpdProcess(), (et, vl) -> ((WLocationInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_LOCATION_INPUT";
    protected final String _tableDispName = "W_LOCATION_INPUT";
    protected final String _tablePropertyName = "WLocationInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_LOCATION_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocationInputId = cci("LOCATION_INPUT_ID", "LOCATION_INPUT_ID", null, null, Long.class, "locationInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneCd = cci("ZONE_CD", "ZONE_CD", null, null, String.class, "zoneCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingLocationFlg = cci("PICKING_LOCATION_FLG", "PICKING_LOCATION_FLG", null, null, String.class, "pickingLocationFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingOrder = cci("PICKING_ORDER", "PICKING_ORDER", null, null, String.class, "pickingOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationType = cci("LOCATION_TYPE", "LOCATION_TYPE", null, null, String.class, "locationType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, String.class, "allocOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNgFlg = cci("ALLOC_NG_FLG", "ALLOC_NG_FLG", null, null, String.class, "allocNgFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockProductCd = cci("RESTOCK_PRODUCT_CD", "RESTOCK_PRODUCT_CD", null, null, String.class, "restockProductCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockStockTypeCd = cci("RESTOCK_STOCK_TYPE_CD", "RESTOCK_STOCK_TYPE_CD", null, null, String.class, "restockStockTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockDepositCd = cci("RESTOCK_DEPOSIT_CD", "RESTOCK_DEPOSIT_CD", null, null, String.class, "restockDepositCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockShapeCd = cci("RESTOCK_SHAPE_CD", "RESTOCK_SHAPE_CD", null, null, String.class, "restockShapeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockPointNum = cci("RESTOCK_POINT_NUM", "RESTOCK_POINT_NUM", null, null, String.class, "restockPointNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreShapeCd = cci("MAX_STORE_SHAPE_CD", "MAX_STORE_SHAPE_CD", null, null, String.class, "maxStoreShapeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreNum = cci("MAX_STORE_NUM", "MAX_STORE_NUM", null, null, String.class, "maxStoreNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMsg = cci("ERROR_MSG", "ERROR_MSG", null, null, String.class, "errorMsg", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationInputId() { return _columnLocationInputId; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
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
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingLocationFlg() { return _columnPickingLocationFlg; }
    /**
     * PICKING_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingOrder() { return _columnPickingOrder; }
    /**
     * LOCATION_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationType() { return _columnLocationType; }
    /**
     * ALLOC_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * ALLOC_NG_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNgFlg() { return _columnAllocNgFlg; }
    /**
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockProductCd() { return _columnRestockProductCd; }
    /**
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockStockTypeCd() { return _columnRestockStockTypeCd; }
    /**
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockDepositCd() { return _columnRestockDepositCd; }
    /**
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockShapeCd() { return _columnRestockShapeCd; }
    /**
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockPointNum() { return _columnRestockPointNum; }
    /**
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreShapeCd() { return _columnMaxStoreShapeCd; }
    /**
     * MAX_STORE_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreNum() { return _columnMaxStoreNum; }
    /**
     * LINE_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WORK_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MSG: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMsg() { return _columnErrorMsg; }
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
        ls.add(columnLocationInputId());
        ls.add(columnCenterCd());
        ls.add(columnWarehouseCd());
        ls.add(columnZoneCd());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnPickingLocationFlg());
        ls.add(columnPickingOrder());
        ls.add(columnLocationType());
        ls.add(columnAllocOrder());
        ls.add(columnAllocNgFlg());
        ls.add(columnRestockProductCd());
        ls.add(columnRestockStockTypeCd());
        ls.add(columnRestockDepositCd());
        ls.add(columnRestockShapeCd());
        ls.add(columnRestockPointNum());
        ls.add(columnMaxStoreShapeCd());
        ls.add(columnMaxStoreNum());
        ls.add(columnLineNo());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMsg());
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
    protected UniqueInfo cpui() { return hpcpui(columnLocationInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WLocationInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WLocationInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WLocationInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WLocationInput> getEntityType() { return WLocationInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WLocationInput newEntity() { return new WLocationInput(); }
    public WLocationInput newMyEntity() { return new WLocationInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WLocationInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WLocationInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
