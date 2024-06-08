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
 * The DB meta of T_TRPACKRMDR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpackrmdrDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpackrmdrDbm _instance = new TTrpackrmdrDbm();
    private TTrpackrmdrDbm() {}
    public static TTrpackrmdrDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getPackingRemainingId(), (et, vl) -> ((TTrpackrmdr)et).setPackingRemainingId(ctl(vl)), "packingRemainingId");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getPackrmdrkey(), (et, vl) -> ((TTrpackrmdr)et).setPackrmdrkey(ctb(vl)), "packrmdrkey");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getPickingInstDetailId(), (et, vl) -> ((TTrpackrmdr)et).setPickingInstDetailId(ctl(vl)), "pickingInstDetailId");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getTagcd(), (et, vl) -> ((TTrpackrmdr)et).setTagcd((String)vl), "tagcd");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getSokey(), (et, vl) -> ((TTrpackrmdr)et).setSokey(ctb(vl)), "sokey");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getSolineno(), (et, vl) -> ((TTrpackrmdr)et).setSolineno(ctl(vl)), "solineno");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getActflg(), (et, vl) -> ((TTrpackrmdr)et).setActflg(ctb(vl)), "actflg");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getDeliverygroupkey(), (et, vl) -> ((TTrpackrmdr)et).setDeliverygroupkey(ctb(vl)), "deliverygroupkey");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getWbkey(), (et, vl) -> ((TTrpackrmdr)et).setWbkey(ctb(vl)), "wbkey");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getWarehousecd(), (et, vl) -> ((TTrpackrmdr)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getOwnercd(), (et, vl) -> ((TTrpackrmdr)et).setOwnercd((String)vl), "ownercd");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getItemadmin(), (et, vl) -> ((TTrpackrmdr)et).setItemadmin((String)vl), "itemadmin");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getProductCd(), (et, vl) -> ((TTrpackrmdr)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getLotkey(), (et, vl) -> ((TTrpackrmdr)et).setLotkey(ctl(vl)), "lotkey");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getPackedqty1(), (et, vl) -> ((TTrpackrmdr)et).setPackedqty1(ctb(vl)), "packedqty1");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getPackedqty2(), (et, vl) -> ((TTrpackrmdr)et).setPackedqty2(ctl(vl)), "packedqty2");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getPackedqty3(), (et, vl) -> ((TTrpackrmdr)et).setPackedqty3(ctl(vl)), "packedqty3");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getExpectqty1(), (et, vl) -> ((TTrpackrmdr)et).setExpectqty1(ctb(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getExpectqty2(), (et, vl) -> ((TTrpackrmdr)et).setExpectqty2(ctl(vl)), "expectqty2");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getExpectqty3(), (et, vl) -> ((TTrpackrmdr)et).setExpectqty3(ctl(vl)), "expectqty3");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getDelFlg(), (et, vl) -> ((TTrpackrmdr)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getVersionNo(), (et, vl) -> ((TTrpackrmdr)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getControlNo(), (et, vl) -> ((TTrpackrmdr)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getAddDt(), (et, vl) -> ((TTrpackrmdr)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getAddUser(), (et, vl) -> ((TTrpackrmdr)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getAddProcess(), (et, vl) -> ((TTrpackrmdr)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getUpdDt(), (et, vl) -> ((TTrpackrmdr)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getUpdUser(), (et, vl) -> ((TTrpackrmdr)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpackrmdr)et).getUpdProcess(), (et, vl) -> ((TTrpackrmdr)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPACKRMDR";
    protected final String _tableDispName = "T_TRPACKRMDR";
    protected final String _tablePropertyName = "TTrpackrmdr";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPACKRMDR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPackingRemainingId = cci("PACKING_REMAINING_ID", "PACKING_REMAINING_ID", null, null, Long.class, "packingRemainingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackrmdrkey = cci("PACKRMDRKEY", "PACKRMDRKEY", null, null, java.math.BigDecimal.class, "packrmdrkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingInstDetailId = cci("PICKING_INST_DETAIL_ID", "PICKING_INST_DETAIL_ID", null, null, Long.class, "pickingInstDetailId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagcd = cci("TAGCD", "TAGCD", null, null, String.class, "tagcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSokey = cci("SOKEY", "SOKEY", null, null, java.math.BigDecimal.class, "sokey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSolineno = cci("SOLINENO", "SOLINENO", null, null, Long.class, "solineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActflg = cci("ACTFLG", "ACTFLG", null, null, java.math.BigDecimal.class, "actflg", null, false, false, true, "decimal", 16, 6, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverygroupkey = cci("DELIVERYGROUPKEY", "DELIVERYGROUPKEY", null, null, java.math.BigDecimal.class, "deliverygroupkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWbkey = cci("WBKEY", "WBKEY", null, null, java.math.BigDecimal.class, "wbkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnercd = cci("OWNERCD", "OWNERCD", null, null, String.class, "ownercd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemadmin = cci("ITEMADMIN", "ITEMADMIN", null, null, String.class, "itemadmin", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotkey = cci("LOTKEY", "LOTKEY", null, null, Long.class, "lotkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackedqty1 = cci("PACKEDQTY1", "PACKEDQTY1", null, null, java.math.BigDecimal.class, "packedqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackedqty2 = cci("PACKEDQTY2", "PACKEDQTY2", null, null, Long.class, "packedqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackedqty3 = cci("PACKEDQTY3", "PACKEDQTY3", null, null, Long.class, "packedqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, java.math.BigDecimal.class, "expectqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty2 = cci("EXPECTQTY2", "EXPECTQTY2", null, null, Long.class, "expectqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty3 = cci("EXPECTQTY3", "EXPECTQTY3", null, null, Long.class, "expectqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingRemainingId() { return _columnPackingRemainingId; }
    /**
     * PACKRMDRKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackrmdrkey() { return _columnPackrmdrkey; }
    /**
     * PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingInstDetailId() { return _columnPickingInstDetailId; }
    /**
     * TAGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagcd() { return _columnTagcd; }
    /**
     * SOKEY: {IX+, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSokey() { return _columnSokey; }
    /**
     * SOLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSolineno() { return _columnSolineno; }
    /**
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActflg() { return _columnActflg; }
    /**
     * DELIVERYGROUPKEY: {IX, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverygroupkey() { return _columnDeliverygroupkey; }
    /**
     * WBKEY: {IX, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWbkey() { return _columnWbkey; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnercd() { return _columnOwnercd; }
    /**
     * ITEMADMIN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemadmin() { return _columnItemadmin; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotkey() { return _columnLotkey; }
    /**
     * PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackedqty1() { return _columnPackedqty1; }
    /**
     * PACKEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackedqty2() { return _columnPackedqty2; }
    /**
     * PACKEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackedqty3() { return _columnPackedqty3; }
    /**
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty2() { return _columnExpectqty2; }
    /**
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty3() { return _columnExpectqty3; }
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
        ls.add(columnPackingRemainingId());
        ls.add(columnPackrmdrkey());
        ls.add(columnPickingInstDetailId());
        ls.add(columnTagcd());
        ls.add(columnSokey());
        ls.add(columnSolineno());
        ls.add(columnActflg());
        ls.add(columnDeliverygroupkey());
        ls.add(columnWbkey());
        ls.add(columnWarehousecd());
        ls.add(columnOwnercd());
        ls.add(columnItemadmin());
        ls.add(columnProductCd());
        ls.add(columnLotkey());
        ls.add(columnPackedqty1());
        ls.add(columnPackedqty2());
        ls.add(columnPackedqty3());
        ls.add(columnExpectqty1());
        ls.add(columnExpectqty2());
        ls.add(columnExpectqty3());
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
    protected UniqueInfo cpui() { return hpcpui(columnPackingRemainingId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpackrmdr"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpackrmdrCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpackrmdrBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpackrmdr> getEntityType() { return TTrpackrmdr.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpackrmdr newEntity() { return new TTrpackrmdr(); }
    public TTrpackrmdr newMyEntity() { return new TTrpackrmdr(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpackrmdr)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpackrmdr)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
