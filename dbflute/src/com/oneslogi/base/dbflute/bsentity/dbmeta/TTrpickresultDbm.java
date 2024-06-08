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
 * The DB meta of T_TRPICKRESULT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpickresultDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpickresultDbm _instance = new TTrpickresultDbm();
    private TTrpickresultDbm() {}
    public static TTrpickresultDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getPickingDetailId(), (et, vl) -> ((TTrpickresult)et).setPickingDetailId(ctl(vl)), "pickingDetailId");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getWorkallocateid(), (et, vl) -> ((TTrpickresult)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getFloor(), (et, vl) -> ((TTrpickresult)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getListkbn(), (et, vl) -> ((TTrpickresult)et).setListkbn(ctl(vl)), "listkbn");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getLocationId(), (et, vl) -> ((TTrpickresult)et).setLocationId((String)vl), "locationId");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getLotId(), (et, vl) -> ((TTrpickresult)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getPalletId(), (et, vl) -> ((TTrpickresult)et).setPalletId(ctl(vl)), "palletId");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getCenterSymbolId(), (et, vl) -> ((TTrpickresult)et).setCenterSymbolId(ctl(vl)), "centerSymbolId");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getPickedqty1(), (et, vl) -> ((TTrpickresult)et).setPickedqty1(ctl(vl)), "pickedqty1");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getSortedqty1(), (et, vl) -> ((TTrpickresult)et).setSortedqty1(ctl(vl)), "sortedqty1");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getDelFlg(), (et, vl) -> ((TTrpickresult)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getVersionNo(), (et, vl) -> ((TTrpickresult)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getControlNo(), (et, vl) -> ((TTrpickresult)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getAddDt(), (et, vl) -> ((TTrpickresult)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getAddUser(), (et, vl) -> ((TTrpickresult)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getAddProcess(), (et, vl) -> ((TTrpickresult)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getUpdDt(), (et, vl) -> ((TTrpickresult)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getUpdUser(), (et, vl) -> ((TTrpickresult)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpickresult)et).getUpdProcess(), (et, vl) -> ((TTrpickresult)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPICKRESULT";
    protected final String _tableDispName = "T_TRPICKRESULT";
    protected final String _tablePropertyName = "TTrpickresult";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPICKRESULT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingDetailId = cci("PICKING_DETAIL_ID", "PICKING_DETAIL_ID", null, null, Long.class, "pickingDetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, Long.class, "listkbn", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, String.class, "locationId", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletId = cci("PALLET_ID", "PALLET_ID", null, null, Long.class, "palletId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterSymbolId = cci("CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", null, null, Long.class, "centerSymbolId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqty1 = cci("PICKEDQTY1", "PICKEDQTY1", null, null, Long.class, "pickedqty1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedqty1 = cci("SORTEDQTY1", "SORTEDQTY1", null, null, Long.class, "sortedqty1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingDetailId() { return _columnPickingDetailId; }
    /**
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * FLOOR: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * LISTKBN: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * LOCATION_ID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletId() { return _columnPalletId; }
    /**
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterSymbolId() { return _columnCenterSymbolId; }
    /**
     * PICKEDQTY1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqty1() { return _columnPickedqty1; }
    /**
     * SORTEDQTY1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedqty1() { return _columnSortedqty1; }
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
        ls.add(columnPickingDetailId());
        ls.add(columnWorkallocateid());
        ls.add(columnFloor());
        ls.add(columnListkbn());
        ls.add(columnLocationId());
        ls.add(columnLotId());
        ls.add(columnPalletId());
        ls.add(columnCenterSymbolId());
        ls.add(columnPickedqty1());
        ls.add(columnSortedqty1());
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
    protected UniqueInfo cpui() { return hpcpui(columnPickingDetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpickresult"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpickresultCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpickresultBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpickresult> getEntityType() { return TTrpickresult.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpickresult newEntity() { return new TTrpickresult(); }
    public TTrpickresult newMyEntity() { return new TTrpickresult(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpickresult)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpickresult)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
