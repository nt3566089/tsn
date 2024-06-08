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
 * The DB meta of T_TRIMALLOC_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrimallocHDbm _instance = new TTrimallocHDbm();
    private TTrimallocHDbm() {}
    public static TTrimallocHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getTrimallocHId(), (et, vl) -> ((TTrimallocH)et).setTrimallocHId(ctl(vl)), "trimallocHId");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getAllocImpKey(), (et, vl) -> ((TTrimallocH)et).setAllocImpKey(ctl(vl)), "allocImpKey");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getWarehousecd(), (et, vl) -> ((TTrimallocH)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getProductCd(), (et, vl) -> ((TTrimallocH)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getShipschDate(), (et, vl) -> ((TTrimallocH)et).setShipschDate((String)vl), "shipschDate");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getPickBatchKey(), (et, vl) -> ((TTrimallocH)et).setPickBatchKey(ctl(vl)), "pickBatchKey");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getRestockFlg(), (et, vl) -> ((TTrimallocH)et).setRestockFlg((String)vl), "restockFlg");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getPriorities(), (et, vl) -> ((TTrimallocH)et).setPriorities(ctl(vl)), "priorities");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getPickadjustSts(), (et, vl) -> ((TTrimallocH)et).setPickadjustSts(ctl(vl)), "pickadjustSts");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getAlcimrsnFlg(), (et, vl) -> ((TTrimallocH)et).setAlcimrsnFlg((String)vl), "alcimrsnFlg");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getQtyAdjustFlg(), (et, vl) -> ((TTrimallocH)et).setQtyAdjustFlg((String)vl), "qtyAdjustFlg");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getCenterId(), (et, vl) -> ((TTrimallocH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getClientId(), (et, vl) -> ((TTrimallocH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getRcvStkexaDate(), (et, vl) -> ((TTrimallocH)et).setRcvStkexaDate((String)vl), "rcvStkexaDate");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getStockShortageQty(), (et, vl) -> ((TTrimallocH)et).setStockShortageQty(ctl(vl)), "stockShortageQty");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getStockSumQty(), (et, vl) -> ((TTrimallocH)et).setStockSumQty(ctl(vl)), "stockSumQty");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getDelFlg(), (et, vl) -> ((TTrimallocH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getVersionNo(), (et, vl) -> ((TTrimallocH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getControlNo(), (et, vl) -> ((TTrimallocH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getAddDt(), (et, vl) -> ((TTrimallocH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getAddUser(), (et, vl) -> ((TTrimallocH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getAddProcess(), (et, vl) -> ((TTrimallocH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getUpdDt(), (et, vl) -> ((TTrimallocH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getUpdUser(), (et, vl) -> ((TTrimallocH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrimallocH)et).getUpdProcess(), (et, vl) -> ((TTrimallocH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRIMALLOC_H";
    protected final String _tableDispName = "T_TRIMALLOC_H";
    protected final String _tablePropertyName = "TTrimallocH";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRIMALLOC_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrimallocHId = cci("TRIMALLOC_H_ID", "TRIMALLOC_H_ID", null, null, Long.class, "trimallocHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TTrimallocschkriList", null, false);
    protected final ColumnInfo _columnAllocImpKey = cci("ALLOC_IMP_KEY", "ALLOC_IMP_KEY", null, null, Long.class, "allocImpKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschDate = cci("SHIPSCH_DATE", "SHIPSCH_DATE", null, null, String.class, "shipschDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickBatchKey = cci("PICK_BATCH_KEY", "PICK_BATCH_KEY", null, null, Long.class, "pickBatchKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockFlg = cci("RESTOCK_FLG", "RESTOCK_FLG", null, null, String.class, "restockFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriorities = cci("PRIORITIES", "PRIORITIES", null, null, Long.class, "priorities", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickadjustSts = cci("PICKADJUST_STS", "PICKADJUST_STS", null, null, Long.class, "pickadjustSts", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlcimrsnFlg = cci("ALCIMRSN_FLG", "ALCIMRSN_FLG", null, null, String.class, "alcimrsnFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtyAdjustFlg = cci("QTY_ADJUST_FLG", "QTY_ADJUST_FLG", null, null, String.class, "qtyAdjustFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvStkexaDate = cci("RCV_STKEXA_DATE", "RCV_STKEXA_DATE", null, null, String.class, "rcvStkexaDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockShortageQty = cci("STOCK_SHORTAGE_QTY", "STOCK_SHORTAGE_QTY", null, null, Long.class, "stockShortageQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockSumQty = cci("STOCK_SUM_QTY", "STOCK_SUM_QTY", null, null, Long.class, "stockSumQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrimallocHId() { return _columnTrimallocHId; }
    /**
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocImpKey() { return _columnAllocImpKey; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschDate() { return _columnShipschDate; }
    /**
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickBatchKey() { return _columnPickBatchKey; }
    /**
     * RESTOCK_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockFlg() { return _columnRestockFlg; }
    /**
     * PRIORITIES: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriorities() { return _columnPriorities; }
    /**
     * PICKADJUST_STS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickadjustSts() { return _columnPickadjustSts; }
    /**
     * ALCIMRSN_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlcimrsnFlg() { return _columnAlcimrsnFlg; }
    /**
     * QTY_ADJUST_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtyAdjustFlg() { return _columnQtyAdjustFlg; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvStkexaDate() { return _columnRcvStkexaDate; }
    /**
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockShortageQty() { return _columnStockShortageQty; }
    /**
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockSumQty() { return _columnStockSumQty; }
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
        ls.add(columnTrimallocHId());
        ls.add(columnAllocImpKey());
        ls.add(columnWarehousecd());
        ls.add(columnProductCd());
        ls.add(columnShipschDate());
        ls.add(columnPickBatchKey());
        ls.add(columnRestockFlg());
        ls.add(columnPriorities());
        ls.add(columnPickadjustSts());
        ls.add(columnAlcimrsnFlg());
        ls.add(columnQtyAdjustFlg());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnRcvStkexaDate());
        ls.add(columnStockShortageQty());
        ls.add(columnStockSumQty());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrimallocHId()); }
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
    /**
     * T_TRIMALLOCSCHKRI by TRIMALLOC_H_ID, named 'TTrimallocschkriList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrimallocschkriList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrimallocHId(), TTrimallocschkriDbm.getInstance().columnTrimallocHId());
        return cri("T_TRIMALLOCSCHKRI_FK1", "TTrimallocschkriList", this, TTrimallocschkriDbm.getInstance(), mp, false, "TTrimallocH");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrimallocH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrimallocHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrimallocHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrimallocH> getEntityType() { return TTrimallocH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrimallocH newEntity() { return new TTrimallocH(); }
    public TTrimallocH newMyEntity() { return new TTrimallocH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrimallocH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrimallocH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
