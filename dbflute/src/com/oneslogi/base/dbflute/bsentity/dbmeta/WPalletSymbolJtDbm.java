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
 * The DB meta of W_PALLET_SYMBOL_JT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WPalletSymbolJtDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WPalletSymbolJtDbm _instance = new WPalletSymbolJtDbm();
    private WPalletSymbolJtDbm() {}
    public static WPalletSymbolJtDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getWksojtkey(), (et, vl) -> ((WPalletSymbolJt)et).setWksojtkey(ctl(vl)), "wksojtkey");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getCenterId(), (et, vl) -> ((WPalletSymbolJt)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getClientId(), (et, vl) -> ((WPalletSymbolJt)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getTrpalletId(), (et, vl) -> ((WPalletSymbolJt)et).setTrpalletId(ctl(vl)), "trpalletId");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getPalletNo(), (et, vl) -> ((WPalletSymbolJt)et).setPalletNo(ctl(vl)), "palletNo");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getOwnerSoNo(), (et, vl) -> ((WPalletSymbolJt)et).setOwnerSoNo((String)vl), "ownerSoNo");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getSoPalletNo(), (et, vl) -> ((WPalletSymbolJt)et).setSoPalletNo((String)vl), "soPalletNo");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getTrsymbolId(), (et, vl) -> ((WPalletSymbolJt)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getSymbolNo(), (et, vl) -> ((WPalletSymbolJt)et).setSymbolNo(ctl(vl)), "symbolNo");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getSortedQty(), (et, vl) -> ((WPalletSymbolJt)et).setSortedQty(ctl(vl)), "sortedQty");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getEnterFlg(), (et, vl) -> ((WPalletSymbolJt)et).setEnterFlg((String)vl), "enterFlg");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getPackedFlg(), (et, vl) -> ((WPalletSymbolJt)et).setPackedFlg((String)vl), "packedFlg");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getRcvKey(), (et, vl) -> ((WPalletSymbolJt)et).setRcvKey(ctl(vl)), "rcvKey");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getDelFlg(), (et, vl) -> ((WPalletSymbolJt)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getVersionNo(), (et, vl) -> ((WPalletSymbolJt)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getControlNo(), (et, vl) -> ((WPalletSymbolJt)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getAddDt(), (et, vl) -> ((WPalletSymbolJt)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getAddUser(), (et, vl) -> ((WPalletSymbolJt)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getAddProcess(), (et, vl) -> ((WPalletSymbolJt)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getUpdDt(), (et, vl) -> ((WPalletSymbolJt)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getUpdUser(), (et, vl) -> ((WPalletSymbolJt)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WPalletSymbolJt)et).getUpdProcess(), (et, vl) -> ((WPalletSymbolJt)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_PALLET_SYMBOL_JT";
    protected final String _tableDispName = "W_PALLET_SYMBOL_JT";
    protected final String _tablePropertyName = "WPalletSymbolJt";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_PALLET_SYMBOL_JT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWksojtkey = cci("WKSOJTKEY", "WKSOJTKEY", null, null, Long.class, "wksojtkey", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrpalletId = cci("TRPALLET_ID", "TRPALLET_ID", null, null, Long.class, "trpalletId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletNo = cci("PALLET_NO", "PALLET_NO", null, null, Long.class, "palletNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerSoNo = cci("OWNER_SO_NO", "OWNER_SO_NO", null, null, String.class, "ownerSoNo", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoPalletNo = cci("SO_PALLET_NO", "SO_PALLET_NO", null, null, String.class, "soPalletNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolNo = cci("SYMBOL_NO", "SYMBOL_NO", null, null, Long.class, "symbolNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedQty = cci("SORTED_QTY", "SORTED_QTY", null, null, Long.class, "sortedQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEnterFlg = cci("ENTER_FLG", "ENTER_FLG", null, null, String.class, "enterFlg", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackedFlg = cci("PACKED_FLG", "PACKED_FLG", null, null, String.class, "packedFlg", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvKey = cci("RCV_KEY", "RCV_KEY", null, null, Long.class, "rcvKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWksojtkey() { return _columnWksojtkey; }
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
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletId() { return _columnTrpalletId; }
    /**
     * PALLET_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletNo() { return _columnPalletNo; }
    /**
     * OWNER_SO_NO: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerSoNo() { return _columnOwnerSoNo; }
    /**
     * SO_PALLET_NO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoPalletNo() { return _columnSoPalletNo; }
    /**
     * TRSYMBOL_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * SYMBOL_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolNo() { return _columnSymbolNo; }
    /**
     * SORTED_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedQty() { return _columnSortedQty; }
    /**
     * ENTER_FLG: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEnterFlg() { return _columnEnterFlg; }
    /**
     * PACKED_FLG: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackedFlg() { return _columnPackedFlg; }
    /**
     * RCV_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvKey() { return _columnRcvKey; }
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
        ls.add(columnWksojtkey());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnTrpalletId());
        ls.add(columnPalletNo());
        ls.add(columnOwnerSoNo());
        ls.add(columnSoPalletNo());
        ls.add(columnTrsymbolId());
        ls.add(columnSymbolNo());
        ls.add(columnSortedQty());
        ls.add(columnEnterFlg());
        ls.add(columnPackedFlg());
        ls.add(columnRcvKey());
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
    protected UniqueInfo cpui() { return hpcpui(columnWksojtkey()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WPalletSymbolJt"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WPalletSymbolJtCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WPalletSymbolJtBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WPalletSymbolJt> getEntityType() { return WPalletSymbolJt.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WPalletSymbolJt newEntity() { return new WPalletSymbolJt(); }
    public WPalletSymbolJt newMyEntity() { return new WPalletSymbolJt(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WPalletSymbolJt)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WPalletSymbolJt)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
