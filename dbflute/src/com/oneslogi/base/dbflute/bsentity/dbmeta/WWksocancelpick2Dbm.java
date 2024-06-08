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
 * The DB meta of W_WKSOCANCELPICK2. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWksocancelpick2Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWksocancelpick2Dbm _instance = new WWksocancelpick2Dbm();
    private WWksocancelpick2Dbm() {}
    public static WWksocancelpick2Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getPrintkey(), (et, vl) -> ((WWksocancelpick2)et).setPrintkey(ctl(vl)), "printkey");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getWarehousecd(), (et, vl) -> ((WWksocancelpick2)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getWarehouseSname(), (et, vl) -> ((WWksocancelpick2)et).setWarehouseSname((String)vl), "warehouseSname");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getPickeddate(), (et, vl) -> ((WWksocancelpick2)et).setPickeddate((String)vl), "pickeddate");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getWorkallocateid(), (et, vl) -> ((WWksocancelpick2)et).setWorkallocateid(ctb(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getFloor(), (et, vl) -> ((WWksocancelpick2)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getLoccd(), (et, vl) -> ((WWksocancelpick2)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getProductCd(), (et, vl) -> ((WWksocancelpick2)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getItemSname(), (et, vl) -> ((WWksocancelpick2)et).setItemSname((String)vl), "itemSname");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getLot1(), (et, vl) -> ((WWksocancelpick2)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getLot4(), (et, vl) -> ((WWksocancelpick2)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getLot3(), (et, vl) -> ((WWksocancelpick2)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getPickedqtyC(), (et, vl) -> ((WWksocancelpick2)et).setPickedqtyC(ctb(vl)), "pickedqtyC");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getPickedqtyB(), (et, vl) -> ((WWksocancelpick2)et).setPickedqtyB(ctb(vl)), "pickedqtyB");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getPickedqtyP(), (et, vl) -> ((WWksocancelpick2)et).setPickedqtyP(ctb(vl)), "pickedqtyP");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getPickedqtyC2(), (et, vl) -> ((WWksocancelpick2)et).setPickedqtyC2(ctb(vl)), "pickedqtyC2");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getUsernum3(), (et, vl) -> ((WWksocancelpick2)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getPrintpageno(), (et, vl) -> ((WWksocancelpick2)et).setPrintpageno(ctl(vl)), "printpageno");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getSeqsortkey(), (et, vl) -> ((WWksocancelpick2)et).setSeqsortkey(ctb(vl)), "seqsortkey");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getDelFlg(), (et, vl) -> ((WWksocancelpick2)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getVersionNo(), (et, vl) -> ((WWksocancelpick2)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getControlNo(), (et, vl) -> ((WWksocancelpick2)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getAddDt(), (et, vl) -> ((WWksocancelpick2)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getAddUser(), (et, vl) -> ((WWksocancelpick2)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getAddProcess(), (et, vl) -> ((WWksocancelpick2)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getUpdDt(), (et, vl) -> ((WWksocancelpick2)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getUpdUser(), (et, vl) -> ((WWksocancelpick2)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWksocancelpick2)et).getUpdProcess(), (et, vl) -> ((WWksocancelpick2)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKSOCANCELPICK2";
    protected final String _tableDispName = "W_WKSOCANCELPICK2";
    protected final String _tablePropertyName = "WWksocancelpick2";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKSOCANCELPICK2", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrintkey = cci("PRINTKEY", "PRINTKEY", null, null, Long.class, "printkey", null, false, false, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseSname = cci("WAREHOUSE_SNAME", "WAREHOUSE_SNAME", null, null, String.class, "warehouseSname", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickeddate = cci("PICKEDDATE", "PICKEDDATE", null, null, String.class, "pickeddate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, java.math.BigDecimal.class, "workallocateid", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemSname = cci("ITEM_SNAME", "ITEM_SNAME", null, null, String.class, "itemSname", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqtyC = cci("PICKEDQTY_C", "PICKEDQTY_C", null, null, java.math.BigDecimal.class, "pickedqtyC", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqtyB = cci("PICKEDQTY_B", "PICKEDQTY_B", null, null, java.math.BigDecimal.class, "pickedqtyB", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqtyP = cci("PICKEDQTY_P", "PICKEDQTY_P", null, null, java.math.BigDecimal.class, "pickedqtyP", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqtyC2 = cci("PICKEDQTY_C2", "PICKEDQTY_C2", null, null, java.math.BigDecimal.class, "pickedqtyC2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintpageno = cci("PRINTPAGENO", "PRINTPAGENO", null, null, Long.class, "printpageno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqsortkey = cci("SEQSORTKEY", "SEQSORTKEY", null, null, java.math.BigDecimal.class, "seqsortkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintkey() { return _columnPrintkey; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseSname() { return _columnWarehouseSname; }
    /**
     * PICKEDDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickeddate() { return _columnPickeddate; }
    /**
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * FLOOR: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * LOCCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemSname() { return _columnItemSname; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqtyC() { return _columnPickedqtyC; }
    /**
     * PICKEDQTY_B: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqtyB() { return _columnPickedqtyB; }
    /**
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqtyP() { return _columnPickedqtyP; }
    /**
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqtyC2() { return _columnPickedqtyC2; }
    /**
     * USERNUM3: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintpageno() { return _columnPrintpageno; }
    /**
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqsortkey() { return _columnSeqsortkey; }
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
        ls.add(columnPrintkey());
        ls.add(columnWarehousecd());
        ls.add(columnWarehouseSname());
        ls.add(columnPickeddate());
        ls.add(columnWorkallocateid());
        ls.add(columnFloor());
        ls.add(columnLoccd());
        ls.add(columnProductCd());
        ls.add(columnItemSname());
        ls.add(columnLot1());
        ls.add(columnLot4());
        ls.add(columnLot3());
        ls.add(columnPickedqtyC());
        ls.add(columnPickedqtyB());
        ls.add(columnPickedqtyP());
        ls.add(columnPickedqtyC2());
        ls.add(columnUsernum3());
        ls.add(columnPrintpageno());
        ls.add(columnSeqsortkey());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWksocancelpick2"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWksocancelpick2CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWksocancelpick2Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWksocancelpick2> getEntityType() { return WWksocancelpick2.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWksocancelpick2 newEntity() { return new WWksocancelpick2(); }
    public WWksocancelpick2 newMyEntity() { return new WWksocancelpick2(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWksocancelpick2)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWksocancelpick2)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
