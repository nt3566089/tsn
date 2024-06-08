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
 * The DB meta of B_MENU_GRP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BMenuGrpDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BMenuGrpDbm _instance = new BMenuGrpDbm();
    private BMenuGrpDbm() {}
    public static BMenuGrpDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getMenuGrpId(), (et, vl) -> ((BMenuGrp)et).setMenuGrpId(ctl(vl)), "menuGrpId");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getMenuGrpCd(), (et, vl) -> ((BMenuGrp)et).setMenuGrpCd((String)vl), "menuGrpCd");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getDictId(), (et, vl) -> ((BMenuGrp)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getParentMenuGrpId(), (et, vl) -> ((BMenuGrp)et).setParentMenuGrpId(ctl(vl)), "parentMenuGrpId");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getViewOrder(), (et, vl) -> ((BMenuGrp)et).setViewOrder(ctl(vl)), "viewOrder");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getVisibleType(), (et, vl) -> ((BMenuGrp)et).setVisibleType((String)vl), "visibleType");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getDelFlg(), (et, vl) -> ((BMenuGrp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getVersionNo(), (et, vl) -> ((BMenuGrp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getControlNo(), (et, vl) -> ((BMenuGrp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getAddDt(), (et, vl) -> ((BMenuGrp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getAddUser(), (et, vl) -> ((BMenuGrp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getAddProcess(), (et, vl) -> ((BMenuGrp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getUpdDt(), (et, vl) -> ((BMenuGrp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getUpdUser(), (et, vl) -> ((BMenuGrp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BMenuGrp)et).getUpdProcess(), (et, vl) -> ((BMenuGrp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BMenuGrp)et).getBDict(), (et, vl) -> ((BMenuGrp)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BMenuGrp)et).getBMenuGrpSelf(), (et, vl) -> ((BMenuGrp)et).setBMenuGrpSelf((BMenuGrp)vl), "BMenuGrpSelf");
        setupEfpg(_efpgMap, et -> ((BMenuGrp)et).getVDict(), (et, vl) -> ((BMenuGrp)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((BMenuGrp)et).getVHtDict(), (et, vl) -> ((BMenuGrp)et).setVHtDict((VHtDict)vl), "VHtDict");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_MENU_GRP";
    protected final String _tableDispName = "B_MENU_GRP";
    protected final String _tablePropertyName = "BMenuGrp";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_MENU_GRP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMenuGrpId = cci("MENU_GRP_ID", "MENU_GRP_ID", null, null, Long.class, "menuGrpId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BMenuList,BMenuGrpSelfList", null, false);
    protected final ColumnInfo _columnMenuGrpCd = cci("MENU_GRP_CD", "MENU_GRP_CD", null, null, String.class, "menuGrpCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict,VHtDict", null, null, false);
    protected final ColumnInfo _columnParentMenuGrpId = cci("PARENT_MENU_GRP_ID", "PARENT_MENU_GRP_ID", null, null, Long.class, "parentMenuGrpId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BMenuGrpSelf", null, null, false);
    protected final ColumnInfo _columnViewOrder = cci("VIEW_ORDER", "VIEW_ORDER", null, null, Long.class, "viewOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVisibleType = cci("VISIBLE_TYPE", "VISIBLE_TYPE", null, null, String.class, "visibleType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMenuGrpId() { return _columnMenuGrpId; }
    /**
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMenuGrpCd() { return _columnMenuGrpCd; }
    /**
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentMenuGrpId() { return _columnParentMenuGrpId; }
    /**
     * VIEW_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnViewOrder() { return _columnViewOrder; }
    /**
     * VISIBLE_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVisibleType() { return _columnVisibleType; }
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
        ls.add(columnMenuGrpId());
        ls.add(columnMenuGrpCd());
        ls.add(columnDictId());
        ls.add(columnParentMenuGrpId());
        ls.add(columnViewOrder());
        ls.add(columnVisibleType());
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
    protected UniqueInfo cpui() { return hpcpui(columnMenuGrpId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnMenuGrpCd()); }

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
        return cfi("B_MENU_GRP_FK2", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BMenuGrpList", false);
    }
    /**
     * B_MENU_GRP by my PARENT_MENU_GRP_ID, named 'BMenuGrpSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBMenuGrpSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentMenuGrpId(), BMenuGrpDbm.getInstance().columnMenuGrpId());
        return cfi("B_MENU_GRP_FK1", "BMenuGrpSelf", this, BMenuGrpDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BMenuGrpSelfList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_MENU_GRP_ID", "VDict", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVHtDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VHtDictDbm.getInstance().columnDictId());
        return cfi("FK_B_MENU_GRP_TO_V_HT_DICT", "VHtDict", this, VHtDictDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVHtDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_MENU by MENU_GRP_ID, named 'BMenuList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBMenuList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMenuGrpId(), BMenuDbm.getInstance().columnMenuGrpId());
        return cri("B_MENU_FK2", "BMenuList", this, BMenuDbm.getInstance(), mp, false, "BMenuGrp");
    }
    /**
     * B_MENU_GRP by PARENT_MENU_GRP_ID, named 'BMenuGrpSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBMenuGrpSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMenuGrpId(), BMenuGrpDbm.getInstance().columnParentMenuGrpId());
        return cri("B_MENU_GRP_FK1", "BMenuGrpSelfList", this, BMenuGrpDbm.getInstance(), mp, false, "BMenuGrpSelf");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BMenuGrp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BMenuGrpCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BMenuGrpBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BMenuGrp> getEntityType() { return BMenuGrp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BMenuGrp newEntity() { return new BMenuGrp(); }
    public BMenuGrp newMyEntity() { return new BMenuGrp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BMenuGrp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BMenuGrp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
