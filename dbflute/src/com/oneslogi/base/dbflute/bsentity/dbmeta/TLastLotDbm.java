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
 * The DB meta of T_LAST_LOT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TLastLotDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TLastLotDbm _instance = new TLastLotDbm();
    private TLastLotDbm() {}
    public static TLastLotDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TLastLot)et).getLastLotId(), (et, vl) -> ((TLastLot)et).setLastLotId(ctl(vl)), "lastLotId");
        setupEpg(_epgMap, et -> ((TLastLot)et).getCustomerId(), (et, vl) -> ((TLastLot)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((TLastLot)et).getProductId(), (et, vl) -> ((TLastLot)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TLastLot)et).getLotId(), (et, vl) -> ((TLastLot)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TLastLot)et).getDelFlg(), (et, vl) -> ((TLastLot)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TLastLot)et).getVersionNo(), (et, vl) -> ((TLastLot)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TLastLot)et).getControlNo(), (et, vl) -> ((TLastLot)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TLastLot)et).getAddDt(), (et, vl) -> ((TLastLot)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TLastLot)et).getAddUser(), (et, vl) -> ((TLastLot)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TLastLot)et).getAddProcess(), (et, vl) -> ((TLastLot)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TLastLot)et).getUpdDt(), (et, vl) -> ((TLastLot)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TLastLot)et).getUpdUser(), (et, vl) -> ((TLastLot)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TLastLot)et).getUpdProcess(), (et, vl) -> ((TLastLot)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TLastLot)et).getMCustomer(), (et, vl) -> ((TLastLot)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((TLastLot)et).getMProduct(), (et, vl) -> ((TLastLot)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TLastLot)et).getTLot(), (et, vl) -> ((TLastLot)et).setTLot((TLot)vl), "TLot");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_LAST_LOT";
    protected final String _tableDispName = "T_LAST_LOT";
    protected final String _tablePropertyName = "TLastLot";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_LAST_LOT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLastLotId = cci("LAST_LOT_ID", "LAST_LOT_ID", null, null, Long.class, "lastLotId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * LAST_LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastLotId() { return _columnLastLotId; }
    /**
     * CUSTOMER_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
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
        ls.add(columnLastLotId());
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
    protected UniqueInfo cpui() { return hpcpui(columnLastLotId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCustomerId());
        ls.add(columnProductId());
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
    /**
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_LAST_LOT_FK1", "MCustomer", this, MCustomerDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TLastLotList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_LAST_LOT_FK3", "MProduct", this, MProductDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TLastLotList", false);
    }
    /**
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("T_LAST_LOT_FK2", "TLot", this, TLotDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TLastLotList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TLastLot"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TLastLotCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TLastLotBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TLastLot> getEntityType() { return TLastLot.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TLastLot newEntity() { return new TLastLot(); }
    public TLastLot newMyEntity() { return new TLastLot(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TLastLot)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TLastLot)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
