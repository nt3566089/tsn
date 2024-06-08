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
 * The DB meta of B_SCREEN_ROLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BScreenRoleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BScreenRoleDbm _instance = new BScreenRoleDbm();
    private BScreenRoleDbm() {}
    public static BScreenRoleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BScreenRole)et).getScreenRoleId(), (et, vl) -> ((BScreenRole)et).setScreenRoleId(ctl(vl)), "screenRoleId");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getRoleId(), (et, vl) -> ((BScreenRole)et).setRoleId(ctl(vl)), "roleId");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getScreenId(), (et, vl) -> ((BScreenRole)et).setScreenId(ctl(vl)), "screenId");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getVisible(), (et, vl) -> ((BScreenRole)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getDelFlg(), (et, vl) -> ((BScreenRole)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getVersionNo(), (et, vl) -> ((BScreenRole)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getControlNo(), (et, vl) -> ((BScreenRole)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getAddDt(), (et, vl) -> ((BScreenRole)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getAddUser(), (et, vl) -> ((BScreenRole)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getAddProcess(), (et, vl) -> ((BScreenRole)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getUpdDt(), (et, vl) -> ((BScreenRole)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getUpdUser(), (et, vl) -> ((BScreenRole)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BScreenRole)et).getUpdProcess(), (et, vl) -> ((BScreenRole)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BScreenRole)et).getBRole(), (et, vl) -> ((BScreenRole)et).setBRole((BRole)vl), "BRole");
        setupEfpg(_efpgMap, et -> ((BScreenRole)et).getBScreen(), (et, vl) -> ((BScreenRole)et).setBScreen((BScreen)vl), "BScreen");
        setupEfpg(_efpgMap, et -> ((BScreenRole)et).getBClassDtlByVisible(), (et, vl) -> ((BScreenRole)et).setBClassDtlByVisible((BClassDtl)vl), "BClassDtlByVisible");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_SCREEN_ROLE";
    protected final String _tableDispName = "B_SCREEN_ROLE";
    protected final String _tablePropertyName = "BScreenRole";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_SCREEN_ROLE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnScreenRoleId = cci("SCREEN_ROLE_ID", "SCREEN_ROLE_ID", null, null, Long.class, "screenRoleId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRoleId = cci("ROLE_ID", "ROLE_ID", null, null, Long.class, "roleId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BRole", null, null, false);
    protected final ColumnInfo _columnScreenId = cci("SCREEN_ID", "SCREEN_ID", null, null, Long.class, "screenId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BScreen", null, null, false);
    protected final ColumnInfo _columnVisible = cci("VISIBLE", "VISIBLE", null, null, String.class, "visible", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByVisible", null, CDef.DefMeta.Visible, false);
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
     * SCREEN_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScreenRoleId() { return _columnScreenRoleId; }
    /**
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleId() { return _columnRoleId; }
    /**
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScreenId() { return _columnScreenId; }
    /**
     * VISIBLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Visible}
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
        ls.add(columnScreenRoleId());
        ls.add(columnRoleId());
        ls.add(columnScreenId());
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
    protected UniqueInfo cpui() { return hpcpui(columnScreenRoleId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnRoleId());
        ls.add(columnScreenId());
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
     * B_ROLE by my ROLE_ID, named 'BRole'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBRole() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), BRoleDbm.getInstance().columnRoleId());
        return cfi("B_SCREEN_ROLE_FK2", "BRole", this, BRoleDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BScreenRoleList", false);
    }
    /**
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBScreen() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), BScreenDbm.getInstance().columnScreenId());
        return cfi("B_SCREEN_ROLE_FK1", "BScreen", this, BScreenDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BScreenRoleList", false);
    }
    /**
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByVisible() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVisible(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_SCREEN_ROLE_VISIBLE", "BClassDtlByVisible", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'VISIBLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BScreenRole"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BScreenRoleCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BScreenRoleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BScreenRole> getEntityType() { return BScreenRole.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BScreenRole newEntity() { return new BScreenRole(); }
    public BScreenRole newMyEntity() { return new BScreenRole(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BScreenRole)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BScreenRole)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
