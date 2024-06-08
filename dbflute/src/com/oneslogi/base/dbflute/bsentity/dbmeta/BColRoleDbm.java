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
 * The DB meta of B_COL_ROLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BColRoleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BColRoleDbm _instance = new BColRoleDbm();
    private BColRoleDbm() {}
    public static BColRoleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BColRole)et).getColRoleId(), (et, vl) -> ((BColRole)et).setColRoleId(ctl(vl)), "colRoleId");
        setupEpg(_epgMap, et -> ((BColRole)et).getColId(), (et, vl) -> ((BColRole)et).setColId(ctl(vl)), "colId");
        setupEpg(_epgMap, et -> ((BColRole)et).getRoleId(), (et, vl) -> ((BColRole)et).setRoleId(ctl(vl)), "roleId");
        setupEpg(_epgMap, et -> ((BColRole)et).getVisible(), (et, vl) -> ((BColRole)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((BColRole)et).getEditable(), (et, vl) -> ((BColRole)et).setEditable((String)vl), "editable");
        setupEpg(_epgMap, et -> ((BColRole)et).getDelFlg(), (et, vl) -> ((BColRole)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BColRole)et).getVersionNo(), (et, vl) -> ((BColRole)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BColRole)et).getControlNo(), (et, vl) -> ((BColRole)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BColRole)et).getAddDt(), (et, vl) -> ((BColRole)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BColRole)et).getAddUser(), (et, vl) -> ((BColRole)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BColRole)et).getAddProcess(), (et, vl) -> ((BColRole)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BColRole)et).getUpdDt(), (et, vl) -> ((BColRole)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BColRole)et).getUpdUser(), (et, vl) -> ((BColRole)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BColRole)et).getUpdProcess(), (et, vl) -> ((BColRole)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BColRole)et).getBCol(), (et, vl) -> ((BColRole)et).setBCol((BCol)vl), "BCol");
        setupEfpg(_efpgMap, et -> ((BColRole)et).getBRole(), (et, vl) -> ((BColRole)et).setBRole((BRole)vl), "BRole");
        setupEfpg(_efpgMap, et -> ((BColRole)et).getBClassDtlByVisible(), (et, vl) -> ((BColRole)et).setBClassDtlByVisible((BClassDtl)vl), "BClassDtlByVisible");
        setupEfpg(_efpgMap, et -> ((BColRole)et).getBClassDtlByEditable(), (et, vl) -> ((BColRole)et).setBClassDtlByEditable((BClassDtl)vl), "BClassDtlByEditable");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_COL_ROLE";
    protected final String _tableDispName = "B_COL_ROLE";
    protected final String _tablePropertyName = "BColRole";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_COL_ROLE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnColRoleId = cci("COL_ROLE_ID", "COL_ROLE_ID", null, null, Long.class, "colRoleId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColId = cci("COL_ID", "COL_ID", null, null, Long.class, "colId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BCol", null, null, false);
    protected final ColumnInfo _columnRoleId = cci("ROLE_ID", "ROLE_ID", null, null, Long.class, "roleId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BRole", null, null, false);
    protected final ColumnInfo _columnVisible = cci("VISIBLE", "VISIBLE", null, null, String.class, "visible", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByVisible", null, CDef.DefMeta.Visible, false);
    protected final ColumnInfo _columnEditable = cci("EDITABLE", "EDITABLE", null, null, String.class, "editable", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByEditable", null, CDef.DefMeta.Editable, false);
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
     * COL_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColRoleId() { return _columnColRoleId; }
    /**
     * COL_ID: {+UQ, IX, NotNull, bigint(19), FK to B_COL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColId() { return _columnColId; }
    /**
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleId() { return _columnRoleId; }
    /**
     * VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVisible() { return _columnVisible; }
    /**
     * EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEditable() { return _columnEditable; }
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
        ls.add(columnColRoleId());
        ls.add(columnColId());
        ls.add(columnRoleId());
        ls.add(columnVisible());
        ls.add(columnEditable());
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
    protected UniqueInfo cpui() { return hpcpui(columnColRoleId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnRoleId());
        ls.add(columnColId());
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
     * B_COL by my COL_ID, named 'BCol'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBCol() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnColId(), BColDbm.getInstance().columnColId());
        return cfi("B_COL_ROLE_FK1", "BCol", this, BColDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BColRoleList", false);
    }
    /**
     * B_ROLE by my ROLE_ID, named 'BRole'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBRole() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), BRoleDbm.getInstance().columnRoleId());
        return cfi("B_COL_ROLE_FK2", "BRole", this, BRoleDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BColRoleList", false);
    }
    /**
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByVisible() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVisible(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_COL_ROLE_VISIBLE", "BClassDtlByVisible", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'VISIBLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByEditable() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEditable(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_COL_ROLE_EDITABLE", "BClassDtlByEditable", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'EDITABLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BColRole"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BColRoleCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BColRoleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BColRole> getEntityType() { return BColRole.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BColRole newEntity() { return new BColRole(); }
    public BColRole newMyEntity() { return new BColRole(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BColRole)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BColRole)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
