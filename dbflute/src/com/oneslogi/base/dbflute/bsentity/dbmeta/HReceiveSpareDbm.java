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
 * The DB meta of H_RECEIVE_SPARE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveSpareDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HReceiveSpareDbm _instance = new HReceiveSpareDbm();
    private HReceiveSpareDbm() {}
    public static HReceiveSpareDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getStoreRecordBId(), (et, vl) -> ((HReceiveSpare)et).setStoreRecordBId(ctl(vl)), "storeRecordBId");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getSpareStr1(), (et, vl) -> ((HReceiveSpare)et).setSpareStr1((String)vl), "spareStr1");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getSpareStr2(), (et, vl) -> ((HReceiveSpare)et).setSpareStr2((String)vl), "spareStr2");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getSpareStr3(), (et, vl) -> ((HReceiveSpare)et).setSpareStr3((String)vl), "spareStr3");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getSpareNum1(), (et, vl) -> ((HReceiveSpare)et).setSpareNum1(ctb(vl)), "spareNum1");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getSpareNum2(), (et, vl) -> ((HReceiveSpare)et).setSpareNum2(ctb(vl)), "spareNum2");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getSpareNum3(), (et, vl) -> ((HReceiveSpare)et).setSpareNum3(ctb(vl)), "spareNum3");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getDelFlg(), (et, vl) -> ((HReceiveSpare)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getVersionNo(), (et, vl) -> ((HReceiveSpare)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getControlNo(), (et, vl) -> ((HReceiveSpare)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getAddDt(), (et, vl) -> ((HReceiveSpare)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getAddUser(), (et, vl) -> ((HReceiveSpare)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getAddProcess(), (et, vl) -> ((HReceiveSpare)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getUpdDt(), (et, vl) -> ((HReceiveSpare)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getUpdUser(), (et, vl) -> ((HReceiveSpare)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HReceiveSpare)et).getUpdProcess(), (et, vl) -> ((HReceiveSpare)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HReceiveSpare)et).getHReceiveB(), (et, vl) -> ((HReceiveSpare)et).setHReceiveB((HReceiveB)vl), "HReceiveB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_RECEIVE_SPARE";
    protected final String _tableDispName = "H_RECEIVE_SPARE";
    protected final String _tablePropertyName = "HReceiveSpare";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_RECEIVE_SPARE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStoreRecordBId = cci("STORE_RECORD_B_ID", "STORE_RECORD_B_ID", null, null, Long.class, "storeRecordBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "HReceiveB", null, null, false);
    protected final ColumnInfo _columnSpareStr1 = cci("SPARE_STR_1", "SPARE_STR_1", null, null, String.class, "spareStr1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr2 = cci("SPARE_STR_2", "SPARE_STR_2", null, null, String.class, "spareStr2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr3 = cci("SPARE_STR_3", "SPARE_STR_3", null, null, String.class, "spareStr3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum1 = cci("SPARE_NUM_1", "SPARE_NUM_1", null, null, java.math.BigDecimal.class, "spareNum1", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum2 = cci("SPARE_NUM_2", "SPARE_NUM_2", null, null, java.math.BigDecimal.class, "spareNum2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum3 = cci("SPARE_NUM_3", "SPARE_NUM_3", null, null, java.math.BigDecimal.class, "spareNum3", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_RECEIVE_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordBId() { return _columnStoreRecordBId; }
    /**
     * SPARE_STR_1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr1() { return _columnSpareStr1; }
    /**
     * SPARE_STR_2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr2() { return _columnSpareStr2; }
    /**
     * SPARE_STR_3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr3() { return _columnSpareStr3; }
    /**
     * SPARE_NUM_1: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum1() { return _columnSpareNum1; }
    /**
     * SPARE_NUM_2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum2() { return _columnSpareNum2; }
    /**
     * SPARE_NUM_3: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum3() { return _columnSpareNum3; }
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
        ls.add(columnStoreRecordBId());
        ls.add(columnSpareStr1());
        ls.add(columnSpareStr2());
        ls.add(columnSpareStr3());
        ls.add(columnSpareNum1());
        ls.add(columnSpareNum2());
        ls.add(columnSpareNum3());
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
    protected UniqueInfo cpui() { return hpcpui(columnStoreRecordBId()); }
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
     * H_RECEIVE_B by my STORE_RECORD_B_ID, named 'HReceiveB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHReceiveB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordBId(), HReceiveBDbm.getInstance().columnStoreRecordBId());
        return cfi("H_RECEIVE_SPARE_FK1", "HReceiveB", this, HReceiveBDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "HReceiveSpareAsOne", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HReceiveSpare"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HReceiveSpareCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HReceiveSpareBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HReceiveSpare> getEntityType() { return HReceiveSpare.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HReceiveSpare newEntity() { return new HReceiveSpare(); }
    public HReceiveSpare newMyEntity() { return new HReceiveSpare(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HReceiveSpare)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HReceiveSpare)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
