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
 * The DB meta of E_STOCK_RECORD_RECEIVE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EStockRecordReceiveDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EStockRecordReceiveDbm _instance = new EStockRecordReceiveDbm();
    private EStockRecordReceiveDbm() {}
    public static EStockRecordReceiveDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getStockRecordReceiveId(), (et, vl) -> ((EStockRecordReceive)et).setStockRecordReceiveId(ctl(vl)), "stockRecordReceiveId");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getReceiveCd(), (et, vl) -> ((EStockRecordReceive)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getReceiveRowId(), (et, vl) -> ((EStockRecordReceive)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getImportFlg(), (et, vl) -> ((EStockRecordReceive)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getErrorFlg(), (et, vl) -> ((EStockRecordReceive)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getErrorMessageCd(), (et, vl) -> ((EStockRecordReceive)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getStockDate(), (et, vl) -> ((EStockRecordReceive)et).setStockDate((String)vl), "stockDate");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getWarehouseCd(), (et, vl) -> ((EStockRecordReceive)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getProductCd(), (et, vl) -> ((EStockRecordReceive)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getCompanyCd(), (et, vl) -> ((EStockRecordReceive)et).setCompanyCd((String)vl), "companyCd");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getStockQtySign(), (et, vl) -> ((EStockRecordReceive)et).setStockQtySign((String)vl), "stockQtySign");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getStockQty(), (et, vl) -> ((EStockRecordReceive)et).setStockQty((String)vl), "stockQty");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getDamageItemQtySign(), (et, vl) -> ((EStockRecordReceive)et).setDamageItemQtySign((String)vl), "damageItemQtySign");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getDamageItemQty(), (et, vl) -> ((EStockRecordReceive)et).setDamageItemQty((String)vl), "damageItemQty");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getRefundItemQtySign(), (et, vl) -> ((EStockRecordReceive)et).setRefundItemQtySign((String)vl), "refundItemQtySign");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getRefundItemQty(), (et, vl) -> ((EStockRecordReceive)et).setRefundItemQty((String)vl), "refundItemQty");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getStorageLocation(), (et, vl) -> ((EStockRecordReceive)et).setStorageLocation((String)vl), "storageLocation");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getSkuCd(), (et, vl) -> ((EStockRecordReceive)et).setSkuCd((String)vl), "skuCd");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getQuantityUnit(), (et, vl) -> ((EStockRecordReceive)et).setQuantityUnit((String)vl), "quantityUnit");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getBatNo(), (et, vl) -> ((EStockRecordReceive)et).setBatNo((String)vl), "batNo");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getDelFlg(), (et, vl) -> ((EStockRecordReceive)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getVersionNo(), (et, vl) -> ((EStockRecordReceive)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getControlNo(), (et, vl) -> ((EStockRecordReceive)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getAddDt(), (et, vl) -> ((EStockRecordReceive)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getAddUser(), (et, vl) -> ((EStockRecordReceive)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getAddProcess(), (et, vl) -> ((EStockRecordReceive)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getUpdDt(), (et, vl) -> ((EStockRecordReceive)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getUpdUser(), (et, vl) -> ((EStockRecordReceive)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EStockRecordReceive)et).getUpdProcess(), (et, vl) -> ((EStockRecordReceive)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_STOCK_RECORD_RECEIVE";
    protected final String _tableDispName = "E_STOCK_RECORD_RECEIVE";
    protected final String _tablePropertyName = "EStockRecordReceive";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_STOCK_RECORD_RECEIVE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockRecordReceiveId = cci("STOCK_RECORD_RECEIVE_ID", "STOCK_RECORD_RECEIVE_ID", null, null, Long.class, "stockRecordReceiveId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnDamageItemQtySign = cci("DAMAGE_ITEM_QTY_SIGN", "DAMAGE_ITEM_QTY_SIGN", null, null, String.class, "damageItemQtySign", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageItemQty = cci("DAMAGE_ITEM_QTY", "DAMAGE_ITEM_QTY", null, null, String.class, "damageItemQty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefundItemQtySign = cci("REFUND_ITEM_QTY_SIGN", "REFUND_ITEM_QTY_SIGN", null, null, String.class, "refundItemQtySign", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefundItemQty = cci("REFUND_ITEM_QTY", "REFUND_ITEM_QTY", null, null, String.class, "refundItemQty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageLocation = cci("STORAGE_LOCATION", "STORAGE_LOCATION", null, null, String.class, "storageLocation", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkuCd = cci("SKU_CD", "SKU_CD", null, null, String.class, "skuCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuantityUnit = cci("QUANTITY_UNIT", "QUANTITY_UNIT", null, null, String.class, "quantityUnit", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatNo = cci("BAT_NO", "BAT_NO", null, null, String.class, "batNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockRecordReceiveId() { return _columnStockRecordReceiveId; }
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
     * DAMAGE_ITEM_QTY_SIGN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageItemQtySign() { return _columnDamageItemQtySign; }
    /**
     * DAMAGE_ITEM_QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageItemQty() { return _columnDamageItemQty; }
    /**
     * REFUND_ITEM_QTY_SIGN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefundItemQtySign() { return _columnRefundItemQtySign; }
    /**
     * REFUND_ITEM_QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefundItemQty() { return _columnRefundItemQty; }
    /**
     * STORAGE_LOCATION: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorageLocation() { return _columnStorageLocation; }
    /**
     * SKU_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkuCd() { return _columnSkuCd; }
    /**
     * QUANTITY_UNIT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuantityUnit() { return _columnQuantityUnit; }
    /**
     * BAT_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatNo() { return _columnBatNo; }
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
        ls.add(columnStockRecordReceiveId());
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
        ls.add(columnDamageItemQtySign());
        ls.add(columnDamageItemQty());
        ls.add(columnRefundItemQtySign());
        ls.add(columnRefundItemQty());
        ls.add(columnStorageLocation());
        ls.add(columnSkuCd());
        ls.add(columnQuantityUnit());
        ls.add(columnBatNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnStockRecordReceiveId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EStockRecordReceive"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EStockRecordReceiveCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EStockRecordReceiveBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EStockRecordReceive> getEntityType() { return EStockRecordReceive.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EStockRecordReceive newEntity() { return new EStockRecordReceive(); }
    public EStockRecordReceive newMyEntity() { return new EStockRecordReceive(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EStockRecordReceive)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EStockRecordReceive)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
