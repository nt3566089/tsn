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
 * The DB meta of E_SORTING_NONCONF_STOCK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ESortingNonconfStockDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ESortingNonconfStockDbm _instance = new ESortingNonconfStockDbm();
    private ESortingNonconfStockDbm() {}
    public static ESortingNonconfStockDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getSortingNonconfStockId(), (et, vl) -> ((ESortingNonconfStock)et).setSortingNonconfStockId(ctl(vl)), "sortingNonconfStockId");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getReceiveCd(), (et, vl) -> ((ESortingNonconfStock)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getReceiveRowId(), (et, vl) -> ((ESortingNonconfStock)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getImportFlg(), (et, vl) -> ((ESortingNonconfStock)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getErrorFlg(), (et, vl) -> ((ESortingNonconfStock)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getErrorMessageCd(), (et, vl) -> ((ESortingNonconfStock)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getStockDate(), (et, vl) -> ((ESortingNonconfStock)et).setStockDate((String)vl), "stockDate");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getWarehouseCd(), (et, vl) -> ((ESortingNonconfStock)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getProductCd(), (et, vl) -> ((ESortingNonconfStock)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getCompanyCd(), (et, vl) -> ((ESortingNonconfStock)et).setCompanyCd((String)vl), "companyCd");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getStockQtySign(), (et, vl) -> ((ESortingNonconfStock)et).setStockQtySign((String)vl), "stockQtySign");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getStockQty(), (et, vl) -> ((ESortingNonconfStock)et).setStockQty((String)vl), "stockQty");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getPendingItemQtySign(), (et, vl) -> ((ESortingNonconfStock)et).setPendingItemQtySign((String)vl), "pendingItemQtySign");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getPendingItemQty(), (et, vl) -> ((ESortingNonconfStock)et).setPendingItemQty((String)vl), "pendingItemQty");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getInspectionItemQtySign(), (et, vl) -> ((ESortingNonconfStock)et).setInspectionItemQtySign((String)vl), "inspectionItemQtySign");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getInspectionItemQty(), (et, vl) -> ((ESortingNonconfStock)et).setInspectionItemQty((String)vl), "inspectionItemQty");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getProductNm(), (et, vl) -> ((ESortingNonconfStock)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getOutputOrder(), (et, vl) -> ((ESortingNonconfStock)et).setOutputOrder((String)vl), "outputOrder");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getInoutType(), (et, vl) -> ((ESortingNonconfStock)et).setInoutType((String)vl), "inoutType");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getDelFlg(), (et, vl) -> ((ESortingNonconfStock)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getVersionNo(), (et, vl) -> ((ESortingNonconfStock)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getControlNo(), (et, vl) -> ((ESortingNonconfStock)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getAddDt(), (et, vl) -> ((ESortingNonconfStock)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getAddUser(), (et, vl) -> ((ESortingNonconfStock)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getAddProcess(), (et, vl) -> ((ESortingNonconfStock)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getUpdDt(), (et, vl) -> ((ESortingNonconfStock)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getUpdUser(), (et, vl) -> ((ESortingNonconfStock)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ESortingNonconfStock)et).getUpdProcess(), (et, vl) -> ((ESortingNonconfStock)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SORTING_NONCONF_STOCK";
    protected final String _tableDispName = "E_SORTING_NONCONF_STOCK";
    protected final String _tablePropertyName = "ESortingNonconfStock";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SORTING_NONCONF_STOCK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSortingNonconfStockId = cci("SORTING_NONCONF_STOCK_ID", "SORTING_NONCONF_STOCK_ID", null, null, Long.class, "sortingNonconfStockId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockDate = cci("STOCK_DATE", "STOCK_DATE", null, null, String.class, "stockDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyCd = cci("COMPANY_CD", "COMPANY_CD", null, null, String.class, "companyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockQtySign = cci("STOCK_QTY_SIGN", "STOCK_QTY_SIGN", null, null, String.class, "stockQtySign", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockQty = cci("STOCK_QTY", "STOCK_QTY", null, null, String.class, "stockQty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPendingItemQtySign = cci("PENDING_ITEM_QTY_SIGN", "PENDING_ITEM_QTY_SIGN", null, null, String.class, "pendingItemQtySign", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPendingItemQty = cci("PENDING_ITEM_QTY", "PENDING_ITEM_QTY", null, null, String.class, "pendingItemQty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionItemQtySign = cci("INSPECTION_ITEM_QTY_SIGN", "INSPECTION_ITEM_QTY_SIGN", null, null, String.class, "inspectionItemQtySign", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionItemQty = cci("INSPECTION_ITEM_QTY", "INSPECTION_ITEM_QTY", null, null, String.class, "inspectionItemQty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutputOrder = cci("OUTPUT_ORDER", "OUTPUT_ORDER", null, null, String.class, "outputOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutType = cci("INOUT_TYPE", "INOUT_TYPE", null, null, String.class, "inoutType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * SORTING_NONCONF_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortingNonconfStockId() { return _columnSortingNonconfStockId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
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
     * STOCK_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockDate() { return _columnStockDate; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyCd() { return _columnCompanyCd; }
    /**
     * STOCK_QTY_SIGN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockQtySign() { return _columnStockQtySign; }
    /**
     * STOCK_QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockQty() { return _columnStockQty; }
    /**
     * PENDING_ITEM_QTY_SIGN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPendingItemQtySign() { return _columnPendingItemQtySign; }
    /**
     * PENDING_ITEM_QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPendingItemQty() { return _columnPendingItemQty; }
    /**
     * INSPECTION_ITEM_QTY_SIGN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionItemQtySign() { return _columnInspectionItemQtySign; }
    /**
     * INSPECTION_ITEM_QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionItemQty() { return _columnInspectionItemQty; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * OUTPUT_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutputOrder() { return _columnOutputOrder; }
    /**
     * INOUT_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutType() { return _columnInoutType; }
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
        ls.add(columnSortingNonconfStockId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnStockDate());
        ls.add(columnWarehouseCd());
        ls.add(columnProductCd());
        ls.add(columnCompanyCd());
        ls.add(columnStockQtySign());
        ls.add(columnStockQty());
        ls.add(columnPendingItemQtySign());
        ls.add(columnPendingItemQty());
        ls.add(columnInspectionItemQtySign());
        ls.add(columnInspectionItemQty());
        ls.add(columnProductNm());
        ls.add(columnOutputOrder());
        ls.add(columnInoutType());
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
    protected UniqueInfo cpui() { return hpcpui(columnSortingNonconfStockId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ESortingNonconfStock"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ESortingNonconfStockCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ESortingNonconfStockBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ESortingNonconfStock> getEntityType() { return ESortingNonconfStock.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ESortingNonconfStock newEntity() { return new ESortingNonconfStock(); }
    public ESortingNonconfStock newMyEntity() { return new ESortingNonconfStock(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ESortingNonconfStock)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ESortingNonconfStock)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
