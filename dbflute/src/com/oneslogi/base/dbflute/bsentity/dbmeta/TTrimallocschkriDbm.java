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
 * The DB meta of T_TRIMALLOCSCHKRI. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocschkriDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrimallocschkriDbm _instance = new TTrimallocschkriDbm();
    private TTrimallocschkriDbm() {}
    public static TTrimallocschkriDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getTrimallocschId(), (et, vl) -> ((TTrimallocschkri)et).setTrimallocschId(ctl(vl)), "trimallocschId");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getTrimallocHId(), (et, vl) -> ((TTrimallocschkri)et).setTrimallocHId(ctl(vl)), "trimallocHId");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getTrsodetailId(), (et, vl) -> ((TTrimallocschkri)et).setTrsodetailId(ctl(vl)), "trsodetailId");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getAllocImpKey(), (et, vl) -> ((TTrimallocschkri)et).setAllocImpKey(ctl(vl)), "allocImpKey");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getAlcImpResgNo(), (et, vl) -> ((TTrimallocschkri)et).setAlcImpResgNo(ctl(vl)), "alcImpResgNo");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getLocationId(), (et, vl) -> ((TTrimallocschkri)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getLocationCd(), (et, vl) -> ((TTrimallocschkri)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getExpectQty(), (et, vl) -> ((TTrimallocschkri)et).setExpectQty(ctl(vl)), "expectQty");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getManufacturedate(), (et, vl) -> ((TTrimallocschkri)et).setManufacturedate((String)vl), "manufacturedate");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getDesignFlg(), (et, vl) -> ((TTrimallocschkri)et).setDesignFlg((String)vl), "designFlg");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getAlcimexpFlg(), (et, vl) -> ((TTrimallocschkri)et).setAlcimexpFlg((String)vl), "alcimexpFlg");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getDelFlg(), (et, vl) -> ((TTrimallocschkri)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getVersionNo(), (et, vl) -> ((TTrimallocschkri)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getControlNo(), (et, vl) -> ((TTrimallocschkri)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getAddDt(), (et, vl) -> ((TTrimallocschkri)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getAddUser(), (et, vl) -> ((TTrimallocschkri)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getAddProcess(), (et, vl) -> ((TTrimallocschkri)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getUpdDt(), (et, vl) -> ((TTrimallocschkri)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getUpdUser(), (et, vl) -> ((TTrimallocschkri)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrimallocschkri)et).getUpdProcess(), (et, vl) -> ((TTrimallocschkri)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrimallocschkri)et).getTYtrsodetail(), (et, vl) -> ((TTrimallocschkri)et).setTYtrsodetail((TYtrsodetail)vl), "TYtrsodetail");
        setupEfpg(_efpgMap, et -> ((TTrimallocschkri)et).getTTrimallocH(), (et, vl) -> ((TTrimallocschkri)et).setTTrimallocH((TTrimallocH)vl), "TTrimallocH");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRIMALLOCSCHKRI";
    protected final String _tableDispName = "T_TRIMALLOCSCHKRI";
    protected final String _tablePropertyName = "TTrimallocschkri";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRIMALLOCSCHKRI", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrimallocschId = cci("TRIMALLOCSCH_ID", "TRIMALLOCSCH_ID", null, null, Long.class, "trimallocschId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TTrimallocadjustList", null, false);
    protected final ColumnInfo _columnTrimallocHId = cci("TRIMALLOC_H_ID", "TRIMALLOC_H_ID", null, null, Long.class, "trimallocHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TTrimallocH", null, null, false);
    protected final ColumnInfo _columnTrsodetailId = cci("TRSODETAIL_ID", "TRSODETAIL_ID", null, null, Long.class, "trsodetailId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TYtrsodetail", null, null, false);
    protected final ColumnInfo _columnAllocImpKey = cci("ALLOC_IMP_KEY", "ALLOC_IMP_KEY", null, null, Long.class, "allocImpKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlcImpResgNo = cci("ALC_IMP_RESG_No", "ALC_IMP_RESG_No", null, null, Long.class, "alcImpResgNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectQty = cci("EXPECT_QTY", "EXPECT_QTY", null, null, Long.class, "expectQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturedate = cci("MANUFACTUREDATE", "MANUFACTUREDATE", null, null, String.class, "manufacturedate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignFlg = cci("DESIGN_FLG", "DESIGN_FLG", null, null, String.class, "designFlg", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlcimexpFlg = cci("ALCIMEXP_FLG", "ALCIMEXP_FLG", null, null, String.class, "alcimexpFlg", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrimallocschId() { return _columnTrimallocschId; }
    /**
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrimallocHId() { return _columnTrimallocHId; }
    /**
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsodetailId() { return _columnTrsodetailId; }
    /**
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocImpKey() { return _columnAllocImpKey; }
    /**
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlcImpResgNo() { return _columnAlcImpResgNo; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectQty() { return _columnExpectQty; }
    /**
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturedate() { return _columnManufacturedate; }
    /**
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignFlg() { return _columnDesignFlg; }
    /**
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlcimexpFlg() { return _columnAlcimexpFlg; }
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
        ls.add(columnTrimallocschId());
        ls.add(columnTrimallocHId());
        ls.add(columnTrsodetailId());
        ls.add(columnAllocImpKey());
        ls.add(columnAlcImpResgNo());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnExpectQty());
        ls.add(columnManufacturedate());
        ls.add(columnDesignFlg());
        ls.add(columnAlcimexpFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrimallocschId()); }
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
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTYtrsodetail() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrsodetailId(), TYtrsodetailDbm.getInstance().columnTrsodetailId());
        return cfi("T_TRIMALLOCSCHKRI_FK2", "TYtrsodetail", this, TYtrsodetailDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrimallocschkriList", false);
    }
    /**
     * T_TRIMALLOC_H by my TRIMALLOC_H_ID, named 'TTrimallocH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrimallocH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrimallocHId(), TTrimallocHDbm.getInstance().columnTrimallocHId());
        return cfi("T_TRIMALLOCSCHKRI_FK1", "TTrimallocH", this, TTrimallocHDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrimallocschkriList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrimallocadjustList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrimallocschId(), TTrimallocadjustDbm.getInstance().columnTrimallocschId());
        return cri("T_TRIMALLOCADJUST_FK2", "TTrimallocadjustList", this, TTrimallocadjustDbm.getInstance(), mp, false, "TTrimallocschkri");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrimallocschkri"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrimallocschkriCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrimallocschkriBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrimallocschkri> getEntityType() { return TTrimallocschkri.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrimallocschkri newEntity() { return new TTrimallocschkri(); }
    public TTrimallocschkri newMyEntity() { return new TTrimallocschkri(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrimallocschkri)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrimallocschkri)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
