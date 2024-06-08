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
 * The DB meta of T_ALLOC_LOT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TAllocLotDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TAllocLotDbm _instance = new TAllocLotDbm();
    private TAllocLotDbm() {}
    public static TAllocLotDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TAllocLot)et).getAllocInstBId(), (et, vl) -> ((TAllocLot)et).setAllocInstBId(ctl(vl)), "allocInstBId");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getCustomerId(), (et, vl) -> ((TAllocLot)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getProductId(), (et, vl) -> ((TAllocLot)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getLotId(), (et, vl) -> ((TAllocLot)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getDelFlg(), (et, vl) -> ((TAllocLot)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getVersionNo(), (et, vl) -> ((TAllocLot)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getControlNo(), (et, vl) -> ((TAllocLot)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getAddDt(), (et, vl) -> ((TAllocLot)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getAddUser(), (et, vl) -> ((TAllocLot)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getAddProcess(), (et, vl) -> ((TAllocLot)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getUpdDt(), (et, vl) -> ((TAllocLot)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getUpdUser(), (et, vl) -> ((TAllocLot)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TAllocLot)et).getUpdProcess(), (et, vl) -> ((TAllocLot)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TAllocLot)et).getTLot(), (et, vl) -> ((TAllocLot)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((TAllocLot)et).getMProduct(), (et, vl) -> ((TAllocLot)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TAllocLot)et).getTAllocInstB(), (et, vl) -> ((TAllocLot)et).setTAllocInstB((TAllocInstB)vl), "TAllocInstB");
        setupEfpg(_efpgMap, et -> ((TAllocLot)et).getMCustomer(), (et, vl) -> ((TAllocLot)et).setMCustomer((MCustomer)vl), "MCustomer");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_ALLOC_LOT";
    protected final String _tableDispName = "T_ALLOC_LOT";
    protected final String _tablePropertyName = "TAllocLot";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_ALLOC_LOT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAllocInstBId = cci("ALLOC_INST_B_ID", "ALLOC_INST_B_ID", null, null, Long.class, "allocInstBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "TAllocInstB", null, null, false);
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TLot", null, null, false);
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
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_ALLOC_INST_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstBId() { return _columnAllocInstBId; }
    /**
     * CUSTOMER_ID: {IX, NotNull, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * LOT_ID: {IX, NotNull, bigint(19), FK to T_LOT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
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
        ls.add(columnAllocInstBId());
        ls.add(columnCustomerId());
        ls.add(columnProductId());
        ls.add(columnLotId());
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
    protected UniqueInfo cpui() { return hpcpui(columnAllocInstBId()); }
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
    /**
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("T_ALLOC_LOT_FK1", "TLot", this, TLotDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TAllocLotList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_ALLOC_LOT_FK4", "MProduct", this, MProductDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TAllocLotList", false);
    }
    /**
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTAllocInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TAllocInstBDbm.getInstance().columnAllocInstBId());
        return cfi("T_ALLOC_LOT_FK3", "TAllocInstB", this, TAllocInstBDbm.getInstance(), mp, 2, null, true, false, false, false, null, null, false, "TAllocLotAsOne", false);
    }
    /**
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_ALLOC_LOT_FK2", "MCustomer", this, MCustomerDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TAllocLotList", false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TAllocLot"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TAllocLotCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TAllocLotBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TAllocLot> getEntityType() { return TAllocLot.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TAllocLot newEntity() { return new TAllocLot(); }
    public TAllocLot newMyEntity() { return new TAllocLot(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TAllocLot)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TAllocLot)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
