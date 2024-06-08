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
 * The DB meta of T_PALLET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPalletDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPalletDbm _instance = new TPalletDbm();
    private TPalletDbm() {}
    public static TPalletDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPallet)et).getPalletId(), (et, vl) -> ((TPallet)et).setPalletId(ctl(vl)), "palletId");
        setupEpg(_epgMap, et -> ((TPallet)et).getCenterId(), (et, vl) -> ((TPallet)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TPallet)et).getClientId(), (et, vl) -> ((TPallet)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TPallet)et).getStockId(), (et, vl) -> ((TPallet)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TPallet)et).getTrpalletId(), (et, vl) -> ((TPallet)et).setTrpalletId(ctl(vl)), "trpalletId");
        setupEpg(_epgMap, et -> ((TPallet)et).getDummyPalletKbn(), (et, vl) -> ((TPallet)et).setDummyPalletKbn(ctl(vl)), "dummyPalletKbn");
        setupEpg(_epgMap, et -> ((TPallet)et).getDelFlg(), (et, vl) -> ((TPallet)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPallet)et).getVersionNo(), (et, vl) -> ((TPallet)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPallet)et).getControlNo(), (et, vl) -> ((TPallet)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPallet)et).getAddDt(), (et, vl) -> ((TPallet)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPallet)et).getAddUser(), (et, vl) -> ((TPallet)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPallet)et).getAddProcess(), (et, vl) -> ((TPallet)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPallet)et).getUpdDt(), (et, vl) -> ((TPallet)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPallet)et).getUpdUser(), (et, vl) -> ((TPallet)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPallet)et).getUpdProcess(), (et, vl) -> ((TPallet)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPallet)et).getMClient(), (et, vl) -> ((TPallet)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TPallet)et).getTTrpallet(), (et, vl) -> ((TPallet)et).setTTrpallet((TTrpallet)vl), "TTrpallet");
        setupEfpg(_efpgMap, et -> ((TPallet)et).getMCenter(), (et, vl) -> ((TPallet)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TPallet)et).getTStock(), (et, vl) -> ((TPallet)et).setTStock((TStock)vl), "TStock");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PALLET";
    protected final String _tableDispName = "T_PALLET";
    protected final String _tablePropertyName = "TPallet";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PALLET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPalletId = cci("PALLET_ID", "PALLET_ID", null, null, Long.class, "palletId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TCenterSymbolList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnTrpalletId = cci("TRPALLET_ID", "TRPALLET_ID", null, null, Long.class, "trpalletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TTrpallet", null, null, false);
    protected final ColumnInfo _columnDummyPalletKbn = cci("DUMMY_PALLET_KBN", "DUMMY_PALLET_KBN", null, null, Long.class, "dummyPalletKbn", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * PALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletId() { return _columnPalletId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * STOCK_ID: {bigint(19), FK to T_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * TRPALLET_ID: {bigint(19), FK to T_TRPALLET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletId() { return _columnTrpalletId; }
    /**
     * DUMMY_PALLET_KBN: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDummyPalletKbn() { return _columnDummyPalletKbn; }
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
        ls.add(columnPalletId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnStockId());
        ls.add(columnTrpalletId());
        ls.add(columnDummyPalletKbn());
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
    protected UniqueInfo cpui() { return hpcpui(columnPalletId()); }
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
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_PALLET_FK4", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPalletList", false);
    }
    /**
     * T_TRPALLET by my TRPALLET_ID, named 'TTrpallet'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrpallet() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrpalletId(), TTrpalletDbm.getInstance().columnTrpalletId());
        return cfi("T_PALLET_FK1", "TTrpallet", this, TTrpalletDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPalletList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_PALLET_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TPalletList", false);
    }
    /**
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockDbm.getInstance().columnStockId());
        return cfi("T_PALLET_FK3", "TStock", this, TStockDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TPalletList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_CENTER_SYMBOL by PALLET_ID, named 'TCenterSymbolList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCenterSymbolList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPalletId(), TCenterSymbolDbm.getInstance().columnPalletId());
        return cri("T_CENTER_SYMBOL_FK2", "TCenterSymbolList", this, TCenterSymbolDbm.getInstance(), mp, false, "TPallet");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPallet"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPalletCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPalletBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPallet> getEntityType() { return TPallet.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPallet newEntity() { return new TPallet(); }
    public TPallet newMyEntity() { return new TPallet(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPallet)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPallet)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
