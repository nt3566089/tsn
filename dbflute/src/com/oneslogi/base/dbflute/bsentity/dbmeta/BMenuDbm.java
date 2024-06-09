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
 * The DB meta of B_MENU. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BMenuDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BMenuDbm _instance = new BMenuDbm();
    private BMenuDbm() {}
    public static BMenuDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BMenu)et).getMenuId(), (et, vl) -> ((BMenu)et).setMenuId(ctl(vl)), "menuId");
        setupEpg(_epgMap, et -> ((BMenu)et).getMenuGrpId(), (et, vl) -> ((BMenu)et).setMenuGrpId(ctl(vl)), "menuGrpId");
        setupEpg(_epgMap, et -> ((BMenu)et).getScreenId(), (et, vl) -> ((BMenu)et).setScreenId(ctl(vl)), "screenId");
        setupEpg(_epgMap, et -> ((BMenu)et).getDictId(), (et, vl) -> ((BMenu)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BMenu)et).getUrlPath(), (et, vl) -> ((BMenu)et).setUrlPath((String)vl), "urlPath");
        setupEpg(_epgMap, et -> ((BMenu)et).getViewOrder(), (et, vl) -> ((BMenu)et).setViewOrder(ctl(vl)), "viewOrder");
        setupEpg(_epgMap, et -> ((BMenu)et).getTargetWindow(), (et, vl) -> ((BMenu)et).setTargetWindow((String)vl), "targetWindow");
        setupEpg(_epgMap, et -> ((BMenu)et).getDelFlg(), (et, vl) -> ((BMenu)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BMenu)et).getVersionNo(), (et, vl) -> ((BMenu)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BMenu)et).getControlNo(), (et, vl) -> ((BMenu)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BMenu)et).getAddDt(), (et, vl) -> ((BMenu)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BMenu)et).getAddUser(), (et, vl) -> ((BMenu)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BMenu)et).getAddProcess(), (et, vl) -> ((BMenu)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BMenu)et).getUpdDt(), (et, vl) -> ((BMenu)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BMenu)et).getUpdUser(), (et, vl) -> ((BMenu)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BMenu)et).getUpdProcess(), (et, vl) -> ((BMenu)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BMenu)et).getBDict(), (et, vl) -> ((BMenu)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BMenu)et).getBMenuGrp(), (et, vl) -> ((BMenu)et).setBMenuGrp((BMenuGrp)vl), "BMenuGrp");
        setupEfpg(_efpgMap, et -> ((BMenu)et).getBScreen(), (et, vl) -> ((BMenu)et).setBScreen((BScreen)vl), "BScreen");
        setupEfpg(_efpgMap, et -> ((BMenu)et).getVDict(), (et, vl) -> ((BMenu)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((BMenu)et).getVHtDict(), (et, vl) -> ((BMenu)et).setVHtDict((VHtDict)vl), "VHtDict");
        setupEfpg(_efpgMap, et -> ((BMenu)et).getBClassDtlByTargetWindow(), (et, vl) -> ((BMenu)et).setBClassDtlByTargetWindow((BClassDtl)vl), "BClassDtlByTargetWindow");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_MENU";
    protected final String _tableDispName = "B_MENU";
    protected final String _tablePropertyName = "BMenu";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_MENU", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMenuId = cci("MENU_ID", "MENU_ID", null, null, Long.class, "menuId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMenuGrpId = cci("MENU_GRP_ID", "MENU_GRP_ID", null, null, Long.class, "menuGrpId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BMenuGrp", null, null, false);
    protected final ColumnInfo _columnScreenId = cci("SCREEN_ID", "SCREEN_ID", null, null, Long.class, "screenId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BScreen", null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict,VHtDict", null, null, false);
    protected final ColumnInfo _columnUrlPath = cci("URL_PATH", "URL_PATH", null, null, String.class, "urlPath", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnViewOrder = cci("VIEW_ORDER", "VIEW_ORDER", null, null, Long.class, "viewOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetWindow = cci("TARGET_WINDOW", "TARGET_WINDOW", null, null, String.class, "targetWindow", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByTargetWindow", null, CDef.DefMeta.TargetWindow, false);
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
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMenuId() { return _columnMenuId; }
    /**
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMenuGrpId() { return _columnMenuGrpId; }
    /**
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScreenId() { return _columnScreenId; }
    /**
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * URL_PATH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUrlPath() { return _columnUrlPath; }
    /**
     * VIEW_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnViewOrder() { return _columnViewOrder; }
    /**
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetWindow() { return _columnTargetWindow; }
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
        ls.add(columnMenuId());
        ls.add(columnMenuGrpId());
        ls.add(columnScreenId());
        ls.add(columnDictId());
        ls.add(columnUrlPath());
        ls.add(columnViewOrder());
        ls.add(columnTargetWindow());
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
    protected UniqueInfo cpui() { return hpcpui(columnMenuId()); }
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
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("B_MENU_FK1", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BMenuList", false);
    }
    /**
     * B_MENU_GRP by my MENU_GRP_ID, named 'BMenuGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBMenuGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMenuGrpId(), BMenuGrpDbm.getInstance().columnMenuGrpId());
        return cfi("B_MENU_FK2", "BMenuGrp", this, BMenuGrpDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BMenuList", false);
    }
    /**
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBScreen() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), BScreenDbm.getInstance().columnScreenId());
        return cfi("B_MENU_FK3", "BScreen", this, BScreenDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "BMenuList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_MENU_ID", "VDict", this, VDictDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVHtDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VHtDictDbm.getInstance().columnDictId());
        return cfi("FK_B_MENU_TO_V_HT_DICT", "VHtDict", this, VHtDictDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVHtDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my TARGET_WINDOW, named 'BClassDtlByTargetWindow'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTargetWindow() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTargetWindow(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_MENU_TARGET_WINDOW", "BClassDtlByTargetWindow", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'TARGET_WINDOW'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BMenu"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BMenuCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BMenuBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BMenu> getEntityType() { return BMenu.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BMenu newEntity() { return new BMenu(); }
    public BMenu newMyEntity() { return new BMenu(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BMenu)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BMenu)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
