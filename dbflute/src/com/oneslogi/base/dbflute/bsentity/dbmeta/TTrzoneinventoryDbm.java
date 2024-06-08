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
 * The DB meta of T_TRZONEINVENTORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrzoneinventoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrzoneinventoryDbm _instance = new TTrzoneinventoryDbm();
    private TTrzoneinventoryDbm() {}
    public static TTrzoneinventoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getTrzoneinventorykey(), (et, vl) -> ((TTrzoneinventory)et).setTrzoneinventorykey(ctb(vl)), "trzoneinventorykey");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getWarehousecd(), (et, vl) -> ((TTrzoneinventory)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getFloor(), (et, vl) -> ((TTrzoneinventory)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getZone(), (et, vl) -> ((TTrzoneinventory)et).setZone((String)vl), "zone");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getPalletcapacity(), (et, vl) -> ((TTrzoneinventory)et).setPalletcapacity(ctb(vl)), "palletcapacity");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getPalletspace(), (et, vl) -> ((TTrzoneinventory)et).setPalletspace(ctb(vl)), "palletspace");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getZoneinvflg(), (et, vl) -> ((TTrzoneinventory)et).setZoneinvflg(ctb(vl)), "zoneinvflg");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getQty1allocated(), (et, vl) -> ((TTrzoneinventory)et).setQty1allocated(ctb(vl)), "qty1allocated");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getRcvqty(), (et, vl) -> ((TTrzoneinventory)et).setRcvqty(ctb(vl)), "rcvqty");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getDelFlg(), (et, vl) -> ((TTrzoneinventory)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getVersionNo(), (et, vl) -> ((TTrzoneinventory)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getControlNo(), (et, vl) -> ((TTrzoneinventory)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getAddDt(), (et, vl) -> ((TTrzoneinventory)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getAddUser(), (et, vl) -> ((TTrzoneinventory)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getAddProcess(), (et, vl) -> ((TTrzoneinventory)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getUpdDt(), (et, vl) -> ((TTrzoneinventory)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getUpdUser(), (et, vl) -> ((TTrzoneinventory)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrzoneinventory)et).getUpdProcess(), (et, vl) -> ((TTrzoneinventory)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRZONEINVENTORY";
    protected final String _tableDispName = "T_TRZONEINVENTORY";
    protected final String _tablePropertyName = "TTrzoneinventory";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRZONEINVENTORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrzoneinventorykey = cci("TRZONEINVENTORYKEY", "TRZONEINVENTORYKEY", null, null, java.math.BigDecimal.class, "trzoneinventorykey", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, true, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, true, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZone = cci("ZONE", "ZONE", null, null, String.class, "zone", null, true, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletcapacity = cci("PALLETCAPACITY", "PALLETCAPACITY", null, null, java.math.BigDecimal.class, "palletcapacity", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletspace = cci("PALLETSPACE", "PALLETSPACE", null, null, java.math.BigDecimal.class, "palletspace", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneinvflg = cci("ZONEINVFLG", "ZONEINVFLG", null, null, java.math.BigDecimal.class, "zoneinvflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty1allocated = cci("QTY1ALLOCATED", "QTY1ALLOCATED", null, null, java.math.BigDecimal.class, "qty1allocated", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvqty = cci("RCVQTY", "RCVQTY", null, null, java.math.BigDecimal.class, "rcvqty", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
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
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrzoneinventorykey() { return _columnTrzoneinventorykey; }
    /**
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * FLOOR: {PK, NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * ZONE: {PK, NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZone() { return _columnZone; }
    /**
     * PALLETCAPACITY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletcapacity() { return _columnPalletcapacity; }
    /**
     * PALLETSPACE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletspace() { return _columnPalletspace; }
    /**
     * ZONEINVFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneinvflg() { return _columnZoneinvflg; }
    /**
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty1allocated() { return _columnQty1allocated; }
    /**
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvqty() { return _columnRcvqty; }
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
        ls.add(columnTrzoneinventorykey());
        ls.add(columnWarehousecd());
        ls.add(columnFloor());
        ls.add(columnZone());
        ls.add(columnPalletcapacity());
        ls.add(columnPalletspace());
        ls.add(columnZoneinvflg());
        ls.add(columnQty1allocated());
        ls.add(columnRcvqty());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnTrzoneinventorykey());
        ls.add(columnWarehousecd());
        ls.add(columnFloor());
        ls.add(columnZone());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrzoneinventory"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrzoneinventoryCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrzoneinventoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrzoneinventory> getEntityType() { return TTrzoneinventory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrzoneinventory newEntity() { return new TTrzoneinventory(); }
    public TTrzoneinventory newMyEntity() { return new TTrzoneinventory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrzoneinventory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrzoneinventory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
