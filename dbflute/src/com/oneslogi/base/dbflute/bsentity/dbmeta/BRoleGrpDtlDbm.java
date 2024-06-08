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
 * The DB meta of B_ROLE_GRP_DTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BRoleGrpDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BRoleGrpDtlDbm _instance = new BRoleGrpDtlDbm();
    private BRoleGrpDtlDbm() {}
    public static BRoleGrpDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getRoleGrpDtlId(), (et, vl) -> ((BRoleGrpDtl)et).setRoleGrpDtlId(ctl(vl)), "roleGrpDtlId");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getRoleGrpId(), (et, vl) -> ((BRoleGrpDtl)et).setRoleGrpId(ctl(vl)), "roleGrpId");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getRoleId(), (et, vl) -> ((BRoleGrpDtl)et).setRoleId(ctl(vl)), "roleId");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getApplyOrder(), (et, vl) -> ((BRoleGrpDtl)et).setApplyOrder(ctl(vl)), "applyOrder");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getDelFlg(), (et, vl) -> ((BRoleGrpDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getVersionNo(), (et, vl) -> ((BRoleGrpDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getControlNo(), (et, vl) -> ((BRoleGrpDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getAddDt(), (et, vl) -> ((BRoleGrpDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getAddUser(), (et, vl) -> ((BRoleGrpDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getAddProcess(), (et, vl) -> ((BRoleGrpDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getUpdDt(), (et, vl) -> ((BRoleGrpDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getUpdUser(), (et, vl) -> ((BRoleGrpDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BRoleGrpDtl)et).getUpdProcess(), (et, vl) -> ((BRoleGrpDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BRoleGrpDtl)et).getBRole(), (et, vl) -> ((BRoleGrpDtl)et).setBRole((BRole)vl), "BRole");
        setupEfpg(_efpgMap, et -> ((BRoleGrpDtl)et).getBRoleGrp(), (et, vl) -> ((BRoleGrpDtl)et).setBRoleGrp((BRoleGrp)vl), "BRoleGrp");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_ROLE_GRP_DTL";
    protected final String _tableDispName = "B_ROLE_GRP_DTL";
    protected final String _tablePropertyName = "BRoleGrpDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_ROLE_GRP_DTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRoleGrpDtlId = cci("ROLE_GRP_DTL_ID", "ROLE_GRP_DTL_ID", null, null, Long.class, "roleGrpDtlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRoleGrpId = cci("ROLE_GRP_ID", "ROLE_GRP_ID", null, null, Long.class, "roleGrpId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BRoleGrp", null, null, false);
    protected final ColumnInfo _columnRoleId = cci("ROLE_ID", "ROLE_ID", null, null, Long.class, "roleId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BRole", null, null, false);
    protected final ColumnInfo _columnApplyOrder = cci("APPLY_ORDER", "APPLY_ORDER", null, null, Long.class, "applyOrder", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleGrpDtlId() { return _columnRoleGrpDtlId; }
    /**
     * ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleGrpId() { return _columnRoleGrpId; }
    /**
     * ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleId() { return _columnRoleId; }
    /**
     * APPLY_ORDER: {+UQ, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnApplyOrder() { return _columnApplyOrder; }
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
        ls.add(columnRoleGrpDtlId());
        ls.add(columnRoleGrpId());
        ls.add(columnRoleId());
        ls.add(columnApplyOrder());
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
    protected UniqueInfo cpui() { return hpcpui(columnRoleGrpDtlId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnRoleGrpId());
        ls.add(columnRoleId());
        ls.add(columnApplyOrder());
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
        return cfi("B_ROLE_GRP_DTL_FK1", "BRole", this, BRoleDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BRoleGrpDtlList", false);
    }
    /**
     * B_ROLE_GRP by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBRoleGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleGrpId(), BRoleGrpDbm.getInstance().columnRoleGrpId());
        return cfi("B_ROLE_GRP_DTL_FK2", "BRoleGrp", this, BRoleGrpDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BRoleGrpDtlList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BRoleGrpDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BRoleGrpDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BRoleGrpDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BRoleGrpDtl> getEntityType() { return BRoleGrpDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BRoleGrpDtl newEntity() { return new BRoleGrpDtl(); }
    public BRoleGrpDtl newMyEntity() { return new BRoleGrpDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BRoleGrpDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BRoleGrpDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
