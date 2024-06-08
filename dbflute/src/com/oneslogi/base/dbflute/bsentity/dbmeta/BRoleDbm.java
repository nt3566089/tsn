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
 * The DB meta of B_ROLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BRoleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BRoleDbm _instance = new BRoleDbm();
    private BRoleDbm() {}
    public static BRoleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BRole)et).getRoleId(), (et, vl) -> ((BRole)et).setRoleId(ctl(vl)), "roleId");
        setupEpg(_epgMap, et -> ((BRole)et).getRoleCd(), (et, vl) -> ((BRole)et).setRoleCd((String)vl), "roleCd");
        setupEpg(_epgMap, et -> ((BRole)et).getDictId(), (et, vl) -> ((BRole)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BRole)et).getDelFlg(), (et, vl) -> ((BRole)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BRole)et).getVersionNo(), (et, vl) -> ((BRole)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BRole)et).getControlNo(), (et, vl) -> ((BRole)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BRole)et).getAddDt(), (et, vl) -> ((BRole)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BRole)et).getAddUser(), (et, vl) -> ((BRole)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BRole)et).getAddProcess(), (et, vl) -> ((BRole)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BRole)et).getUpdDt(), (et, vl) -> ((BRole)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BRole)et).getUpdUser(), (et, vl) -> ((BRole)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BRole)et).getUpdProcess(), (et, vl) -> ((BRole)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BRole)et).getBDict(), (et, vl) -> ((BRole)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BRole)et).getVDict(), (et, vl) -> ((BRole)et).setVDict((VDict)vl), "VDict");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_ROLE";
    protected final String _tableDispName = "B_ROLE";
    protected final String _tablePropertyName = "BRole";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_ROLE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRoleId = cci("ROLE_ID", "ROLE_ID", null, null, Long.class, "roleId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BColRoleList,BFuncRoleList,BItemRoleList,BRoleGrpDtlList,BScreenRoleList", null, false);
    protected final ColumnInfo _columnRoleCd = cci("ROLE_CD", "ROLE_CD", null, null, String.class, "roleCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict", null, null, false);
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
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleId() { return _columnRoleId; }
    /**
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleCd() { return _columnRoleCd; }
    /**
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
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
        ls.add(columnRoleId());
        ls.add(columnRoleCd());
        ls.add(columnDictId());
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
    protected UniqueInfo cpui() { return hpcpui(columnRoleId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnRoleCd()); }

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
        return cfi("B_ROLE_FK1", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BRoleList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_ROLE_ID", "VDict", this, VDictDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_COL_ROLE by ROLE_ID, named 'BColRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBColRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), BColRoleDbm.getInstance().columnRoleId());
        return cri("B_COL_ROLE_FK2", "BColRoleList", this, BColRoleDbm.getInstance(), mp, false, "BRole");
    }
    /**
     * B_FUNC_ROLE by ROLE_ID, named 'BFuncRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBFuncRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), BFuncRoleDbm.getInstance().columnRoleId());
        return cri("B_FUNC_ROLE_FK2", "BFuncRoleList", this, BFuncRoleDbm.getInstance(), mp, false, "BRole");
    }
    /**
     * B_ITEM_ROLE by ROLE_ID, named 'BItemRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBItemRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), BItemRoleDbm.getInstance().columnRoleId());
        return cri("B_ITEM_ROLE_FK1", "BItemRoleList", this, BItemRoleDbm.getInstance(), mp, false, "BRole");
    }
    /**
     * B_ROLE_GRP_DTL by ROLE_ID, named 'BRoleGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBRoleGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), BRoleGrpDtlDbm.getInstance().columnRoleId());
        return cri("B_ROLE_GRP_DTL_FK1", "BRoleGrpDtlList", this, BRoleGrpDtlDbm.getInstance(), mp, false, "BRole");
    }
    /**
     * B_SCREEN_ROLE by ROLE_ID, named 'BScreenRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBScreenRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), BScreenRoleDbm.getInstance().columnRoleId());
        return cri("B_SCREEN_ROLE_FK2", "BScreenRoleList", this, BScreenRoleDbm.getInstance(), mp, false, "BRole");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BRole"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BRoleCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BRoleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BRole> getEntityType() { return BRole.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BRole newEntity() { return new BRole(); }
    public BRole newMyEntity() { return new BRole(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BRole)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BRole)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
