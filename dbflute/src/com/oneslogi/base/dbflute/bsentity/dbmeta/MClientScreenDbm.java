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
 * The DB meta of M_CLIENT_SCREEN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MClientScreenDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MClientScreenDbm _instance = new MClientScreenDbm();
    private MClientScreenDbm() {}
    public static MClientScreenDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MClientScreen)et).getClientScreenId(), (et, vl) -> ((MClientScreen)et).setClientScreenId(ctl(vl)), "clientScreenId");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getClientId(), (et, vl) -> ((MClientScreen)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getScreenId(), (et, vl) -> ((MClientScreen)et).setScreenId(ctl(vl)), "screenId");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getDictId(), (et, vl) -> ((MClientScreen)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getVisible(), (et, vl) -> ((MClientScreen)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getDelFlg(), (et, vl) -> ((MClientScreen)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getVersionNo(), (et, vl) -> ((MClientScreen)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getControlNo(), (et, vl) -> ((MClientScreen)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getAddDt(), (et, vl) -> ((MClientScreen)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getAddUser(), (et, vl) -> ((MClientScreen)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getAddProcess(), (et, vl) -> ((MClientScreen)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getUpdDt(), (et, vl) -> ((MClientScreen)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getUpdUser(), (et, vl) -> ((MClientScreen)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MClientScreen)et).getUpdProcess(), (et, vl) -> ((MClientScreen)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MClientScreen)et).getBDict(), (et, vl) -> ((MClientScreen)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((MClientScreen)et).getMClient(), (et, vl) -> ((MClientScreen)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MClientScreen)et).getBScreen(), (et, vl) -> ((MClientScreen)et).setBScreen((BScreen)vl), "BScreen");
        setupEfpg(_efpgMap, et -> ((MClientScreen)et).getVDict(), (et, vl) -> ((MClientScreen)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((MClientScreen)et).getVHtDict(), (et, vl) -> ((MClientScreen)et).setVHtDict((VHtDict)vl), "VHtDict");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CLIENT_SCREEN";
    protected final String _tableDispName = "M_CLIENT_SCREEN";
    protected final String _tablePropertyName = "MClientScreen";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CLIENT_SCREEN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientScreenId = cci("CLIENT_SCREEN_ID", "CLIENT_SCREEN_ID", null, null, Long.class, "clientScreenId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnScreenId = cci("SCREEN_ID", "SCREEN_ID", null, null, Long.class, "screenId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BScreen", null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict,VHtDict", null, null, false);
    protected final ColumnInfo _columnVisible = cci("VISIBLE", "VISIBLE", null, null, String.class, "visible", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * CLIENT_SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientScreenId() { return _columnClientScreenId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScreenId() { return _columnScreenId; }
    /**
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * VISIBLE: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVisible() { return _columnVisible; }
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
        ls.add(columnClientScreenId());
        ls.add(columnClientId());
        ls.add(columnScreenId());
        ls.add(columnDictId());
        ls.add(columnVisible());
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
    protected UniqueInfo cpui() { return hpcpui(columnClientScreenId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnScreenId());
        ls.add(columnDictId());
        return hpcui(ls);
    }

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
        return cfi("M_CLIENT_SCREEN_FK2", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MClientScreenList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_CLIENT_SCREEN_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MClientScreenList", false);
    }
    /**
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBScreen() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), BScreenDbm.getInstance().columnScreenId());
        return cfi("M_CLIENT_SCREEN_FK3", "BScreen", this, BScreenDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MClientScreenList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_M_CLIENT_SCREEN_ID", "VDict", this, VDictDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVHtDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VHtDictDbm.getInstance().columnDictId());
        return cfi("FK_M_CLIENT_SCREEN_TO_V_HT_DICT", "VHtDict", this, VHtDictDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVHtDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MClientScreen"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MClientScreenCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MClientScreenBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MClientScreen> getEntityType() { return MClientScreen.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MClientScreen newEntity() { return new MClientScreen(); }
    public MClientScreen newMyEntity() { return new MClientScreen(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MClientScreen)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MClientScreen)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
