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
 * The DB meta of B_SCREEN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BScreenDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BScreenDbm _instance = new BScreenDbm();
    private BScreenDbm() {}
    public static BScreenDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BScreen)et).getScreenId(), (et, vl) -> ((BScreen)et).setScreenId(ctl(vl)), "screenId");
        setupEpg(_epgMap, et -> ((BScreen)et).getScreenCd(), (et, vl) -> ((BScreen)et).setScreenCd((String)vl), "screenCd");
        setupEpg(_epgMap, et -> ((BScreen)et).getDictId(), (et, vl) -> ((BScreen)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BScreen)et).getSystemType(), (et, vl) -> ((BScreen)et).setSystemType((String)vl), "systemType");
        setupEpg(_epgMap, et -> ((BScreen)et).getDelFlg(), (et, vl) -> ((BScreen)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BScreen)et).getVersionNo(), (et, vl) -> ((BScreen)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BScreen)et).getControlNo(), (et, vl) -> ((BScreen)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BScreen)et).getAddDt(), (et, vl) -> ((BScreen)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BScreen)et).getAddUser(), (et, vl) -> ((BScreen)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BScreen)et).getAddProcess(), (et, vl) -> ((BScreen)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BScreen)et).getUpdDt(), (et, vl) -> ((BScreen)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BScreen)et).getUpdUser(), (et, vl) -> ((BScreen)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BScreen)et).getUpdProcess(), (et, vl) -> ((BScreen)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BScreen)et).getBDict(), (et, vl) -> ((BScreen)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BScreen)et).getVDict(), (et, vl) -> ((BScreen)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((BScreen)et).getVHtDict(), (et, vl) -> ((BScreen)et).setVHtDict((VHtDict)vl), "VHtDict");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_SCREEN";
    protected final String _tableDispName = "B_SCREEN";
    protected final String _tablePropertyName = "BScreen";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_SCREEN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnScreenId = cci("SCREEN_ID", "SCREEN_ID", null, null, Long.class, "screenId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BItemList,BMenuList,BScreenRoleList,MCenterScreenList,MClientScreenList", null, false);
    protected final ColumnInfo _columnScreenCd = cci("SCREEN_CD", "SCREEN_CD", null, null, String.class, "screenCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict,VHtDict", null, null, false);
    protected final ColumnInfo _columnSystemType = cci("SYSTEM_TYPE", "SYSTEM_TYPE", null, null, String.class, "systemType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScreenId() { return _columnScreenId; }
    /**
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScreenCd() { return _columnScreenCd; }
    /**
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * SYSTEM_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemType() { return _columnSystemType; }
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
        ls.add(columnScreenId());
        ls.add(columnScreenCd());
        ls.add(columnDictId());
        ls.add(columnSystemType());
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
    protected UniqueInfo cpui() { return hpcpui(columnScreenId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnScreenCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("B_SCREEN_FK1", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BScreenList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_SCREEN_ID", "VDict", this, VDictDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVHtDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VHtDictDbm.getInstance().columnDictId());
        return cfi("FK_B_SCREEN_TO_V_HT_DICT", "VHtDict", this, VHtDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVHtDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_ITEM by SCREEN_ID, named 'BItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), BItemDbm.getInstance().columnScreenId());
        return cri("B_ITEM_FK2", "BItemList", this, BItemDbm.getInstance(), mp, false, "BScreen");
    }
    /**
     * B_MENU by SCREEN_ID, named 'BMenuList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBMenuList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), BMenuDbm.getInstance().columnScreenId());
        return cri("B_MENU_FK3", "BMenuList", this, BMenuDbm.getInstance(), mp, false, "BScreen");
    }
    /**
     * B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBScreenRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), BScreenRoleDbm.getInstance().columnScreenId());
        return cri("B_SCREEN_ROLE_FK1", "BScreenRoleList", this, BScreenRoleDbm.getInstance(), mp, false, "BScreen");
    }
    /**
     * M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), MCenterScreenDbm.getInstance().columnScreenId());
        return cri("M_CENTER_SCREEN_FK2", "MCenterScreenList", this, MCenterScreenDbm.getInstance(), mp, false, "BScreen");
    }
    /**
     * M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), MClientScreenDbm.getInstance().columnScreenId());
        return cri("M_CLIENT_SCREEN_FK3", "MClientScreenList", this, MClientScreenDbm.getInstance(), mp, false, "BScreen");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BScreen"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BScreenCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BScreenBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BScreen> getEntityType() { return BScreen.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BScreen newEntity() { return new BScreen(); }
    public BScreen newMyEntity() { return new BScreen(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BScreen)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BScreen)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
