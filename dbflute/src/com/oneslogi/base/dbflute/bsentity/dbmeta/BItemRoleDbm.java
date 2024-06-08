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
 * The DB meta of B_ITEM_ROLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BItemRoleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BItemRoleDbm _instance = new BItemRoleDbm();
    private BItemRoleDbm() {}
    public static BItemRoleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BItemRole)et).getItemRoleId(), (et, vl) -> ((BItemRole)et).setItemRoleId(ctl(vl)), "itemRoleId");
        setupEpg(_epgMap, et -> ((BItemRole)et).getRoleId(), (et, vl) -> ((BItemRole)et).setRoleId(ctl(vl)), "roleId");
        setupEpg(_epgMap, et -> ((BItemRole)et).getItemId(), (et, vl) -> ((BItemRole)et).setItemId(ctl(vl)), "itemId");
        setupEpg(_epgMap, et -> ((BItemRole)et).getVisible(), (et, vl) -> ((BItemRole)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((BItemRole)et).getEditable(), (et, vl) -> ((BItemRole)et).setEditable((String)vl), "editable");
        setupEpg(_epgMap, et -> ((BItemRole)et).getDelFlg(), (et, vl) -> ((BItemRole)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BItemRole)et).getVersionNo(), (et, vl) -> ((BItemRole)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BItemRole)et).getControlNo(), (et, vl) -> ((BItemRole)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BItemRole)et).getAddDt(), (et, vl) -> ((BItemRole)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BItemRole)et).getAddUser(), (et, vl) -> ((BItemRole)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BItemRole)et).getAddProcess(), (et, vl) -> ((BItemRole)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BItemRole)et).getUpdDt(), (et, vl) -> ((BItemRole)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BItemRole)et).getUpdUser(), (et, vl) -> ((BItemRole)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BItemRole)et).getUpdProcess(), (et, vl) -> ((BItemRole)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BItemRole)et).getBRole(), (et, vl) -> ((BItemRole)et).setBRole((BRole)vl), "BRole");
        setupEfpg(_efpgMap, et -> ((BItemRole)et).getBItem(), (et, vl) -> ((BItemRole)et).setBItem((BItem)vl), "BItem");
        setupEfpg(_efpgMap, et -> ((BItemRole)et).getBClassDtlByVisible(), (et, vl) -> ((BItemRole)et).setBClassDtlByVisible((BClassDtl)vl), "BClassDtlByVisible");
        setupEfpg(_efpgMap, et -> ((BItemRole)et).getBClassDtlByEditable(), (et, vl) -> ((BItemRole)et).setBClassDtlByEditable((BClassDtl)vl), "BClassDtlByEditable");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_ITEM_ROLE";
    protected final String _tableDispName = "B_ITEM_ROLE";
    protected final String _tablePropertyName = "BItemRole";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_ITEM_ROLE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnItemRoleId = cci("ITEM_ROLE_ID", "ITEM_ROLE_ID", null, null, Long.class, "itemRoleId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRoleId = cci("ROLE_ID", "ROLE_ID", null, null, Long.class, "roleId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BRole", null, null, false);
    protected final ColumnInfo _columnItemId = cci("ITEM_ID", "ITEM_ID", null, null, Long.class, "itemId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BItem", null, null, false);
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
     * ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemRoleId() { return _columnItemRoleId; }
    /**
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleId() { return _columnRoleId; }
    /**
     * ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemId() { return _columnItemId; }
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
        ls.add(columnItemRoleId());
        ls.add(columnRoleId());
        ls.add(columnItemId());
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
    protected UniqueInfo cpui() { return hpcpui(columnItemRoleId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnRoleId());
        ls.add(columnItemId());
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
        return cfi("B_ITEM_ROLE_FK1", "BRole", this, BRoleDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BItemRoleList", false);
    }
    /**
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBItem() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), BItemDbm.getInstance().columnItemId());
        return cfi("B_ITEM_ROLE_FK2", "BItem", this, BItemDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BItemRoleList", false);
    }
    /**
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByVisible() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVisible(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ITEM_ROLE_VISIBLE", "BClassDtlByVisible", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'VISIBLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByEditable() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEditable(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ITEM_ROLE_EDITABLE", "BClassDtlByEditable", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'EDITABLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BItemRole"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BItemRoleCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BItemRoleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BItemRole> getEntityType() { return BItemRole.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BItemRole newEntity() { return new BItemRole(); }
    public BItemRole newMyEntity() { return new BItemRole(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BItemRole)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BItemRole)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
