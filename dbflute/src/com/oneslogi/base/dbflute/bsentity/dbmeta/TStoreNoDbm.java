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
 * The DB meta of T_STORE_NO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStoreNoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStoreNoDbm _instance = new TStoreNoDbm();
    private TStoreNoDbm() {}
    public static TStoreNoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TStoreNo)et).getStoreNoId(), (et, vl) -> ((TStoreNo)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getStoreLabelNo(), (et, vl) -> ((TStoreNo)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getOldStoreNumId(), (et, vl) -> ((TStoreNo)et).setOldStoreNumId(ctl(vl)), "oldStoreNumId");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getSupplierId(), (et, vl) -> ((TStoreNo)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getStoreDt(), (et, vl) -> ((TStoreNo)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getDelFlg(), (et, vl) -> ((TStoreNo)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getVersionNo(), (et, vl) -> ((TStoreNo)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getControlNo(), (et, vl) -> ((TStoreNo)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getAddDt(), (et, vl) -> ((TStoreNo)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getAddUser(), (et, vl) -> ((TStoreNo)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getAddProcess(), (et, vl) -> ((TStoreNo)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getUpdDt(), (et, vl) -> ((TStoreNo)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getUpdUser(), (et, vl) -> ((TStoreNo)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TStoreNo)et).getUpdProcess(), (et, vl) -> ((TStoreNo)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TStoreNo)et).getTStoreNoSelf(), (et, vl) -> ((TStoreNo)et).setTStoreNoSelf((TStoreNo)vl), "TStoreNoSelf");
        setupEfpg(_efpgMap, et -> ((TStoreNo)et).getMCustomer(), (et, vl) -> ((TStoreNo)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((TStoreNo)et).getTStoreNoRAsOne(), (et, vl) -> ((TStoreNo)et).setTStoreNoRAsOne((TStoreNoR)vl), "TStoreNoRAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_STORE_NO";
    protected final String _tableDispName = "T_STORE_NO";
    protected final String _tablePropertyName = "TStoreNo";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_STORE_NO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TAllocInstBList,TInventoryBList,TMoveInstBList,TShippingInstBList,TStockList,TStoreNoSelfList", null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOldStoreNumId = cci("OLD_STORE_NUM_ID", "OLD_STORE_NUM_ID", null, null, Long.class, "oldStoreNumId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStoreNoSelf", null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * STORE_NO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoId() { return _columnStoreNoId; }
    /**
     * STORE_LABEL_NO: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * OLD_STORE_NUM_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOldStoreNumId() { return _columnOldStoreNumId; }
    /**
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierId() { return _columnSupplierId; }
    /**
     * STORE_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
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
        ls.add(columnStoreNoId());
        ls.add(columnStoreLabelNo());
        ls.add(columnOldStoreNumId());
        ls.add(columnSupplierId());
        ls.add(columnStoreDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnStoreNoId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnStoreLabelNo()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * T_STORE_NO by my OLD_STORE_NUM_ID, named 'TStoreNoSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreNoSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOldStoreNumId(), TStoreNoDbm.getInstance().columnStoreNoId());
        return cfi("T_STORE_NO_FK2", "TStoreNoSelf", this, TStoreNoDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TStoreNoSelfList", false);
    }
    /**
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSupplierId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_STORE_NO_FK1", "MCustomer", this, MCustomerDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TStoreNoList", false);
    }
    /**
     * T_STORE_NO_R by STORE_NO_ID, named 'TStoreNoRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTStoreNoRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStoreNoRDbm.getInstance().columnStoreNoId());
        return cfi("T_STORE_NO_R_FK1", "TStoreNoRAsOne", this, TStoreNoRDbm.getInstance(), mp, 2, null, true, false, true, false, null, null, false, "TStoreNo", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_ALLOC_INST_B by STORE_NO_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TAllocInstBDbm.getInstance().columnStoreNoId());
        return cri("T_ALLOC_INST_B_FK7", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "TStoreNo");
    }
    /**
     * T_INVENTORY_B by STORE_NO_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TInventoryBDbm.getInstance().columnStoreNoId());
        return cri("T_INVENTORY_B_FK2", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "TStoreNo");
    }
    /**
     * T_MOVE_INST_B by STORE_NO_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TMoveInstBDbm.getInstance().columnStoreNoId());
        return cri("T_MOVE_INST_B_FK5", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "TStoreNo");
    }
    /**
     * T_SHIPPING_INST_B by STORE_NO_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TShippingInstBDbm.getInstance().columnStoreNoId());
        return cri("T_SHIPPING_INST_B_FK8", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "TStoreNo");
    }
    /**
     * T_STOCK by STORE_NO_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStockDbm.getInstance().columnStoreNoId());
        return cri("T_STOCK_FK1", "TStockList", this, TStockDbm.getInstance(), mp, false, "TStoreNo");
    }
    /**
     * T_STORE_NO by OLD_STORE_NUM_ID, named 'TStoreNoSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreNoSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStoreNoDbm.getInstance().columnOldStoreNumId());
        return cri("T_STORE_NO_FK2", "TStoreNoSelfList", this, TStoreNoDbm.getInstance(), mp, false, "TStoreNoSelf");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TStoreNo"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TStoreNoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TStoreNoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStoreNo> getEntityType() { return TStoreNo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TStoreNo newEntity() { return new TStoreNo(); }
    public TStoreNo newMyEntity() { return new TStoreNo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TStoreNo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TStoreNo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
