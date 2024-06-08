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
 * The DB meta of M_CENTER_CLASS_GRP_DTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassGrpDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCenterClassGrpDtlDbm _instance = new MCenterClassGrpDtlDbm();
    private MCenterClassGrpDtlDbm() {}
    public static MCenterClassGrpDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getCenterClassGrpDtlId(), (et, vl) -> ((MCenterClassGrpDtl)et).setCenterClassGrpDtlId(ctl(vl)), "centerClassGrpDtlId");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getCenterClassGrpId(), (et, vl) -> ((MCenterClassGrpDtl)et).setCenterClassGrpId(ctl(vl)), "centerClassGrpId");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getCenterClassDtlId(), (et, vl) -> ((MCenterClassGrpDtl)et).setCenterClassDtlId(ctl(vl)), "centerClassDtlId");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getDefaultFlg(), (et, vl) -> ((MCenterClassGrpDtl)et).setDefaultFlg((String)vl), "defaultFlg");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getDelFlg(), (et, vl) -> ((MCenterClassGrpDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getVersionNo(), (et, vl) -> ((MCenterClassGrpDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getControlNo(), (et, vl) -> ((MCenterClassGrpDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getAddDt(), (et, vl) -> ((MCenterClassGrpDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getAddUser(), (et, vl) -> ((MCenterClassGrpDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getAddProcess(), (et, vl) -> ((MCenterClassGrpDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getUpdDt(), (et, vl) -> ((MCenterClassGrpDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getUpdUser(), (et, vl) -> ((MCenterClassGrpDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCenterClassGrpDtl)et).getUpdProcess(), (et, vl) -> ((MCenterClassGrpDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCenterClassGrpDtl)et).getMCenterClassDtl(), (et, vl) -> ((MCenterClassGrpDtl)et).setMCenterClassDtl((MCenterClassDtl)vl), "MCenterClassDtl");
        setupEfpg(_efpgMap, et -> ((MCenterClassGrpDtl)et).getMCenterClassGrp(), (et, vl) -> ((MCenterClassGrpDtl)et).setMCenterClassGrp((MCenterClassGrp)vl), "MCenterClassGrp");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CENTER_CLASS_GRP_DTL";
    protected final String _tableDispName = "M_CENTER_CLASS_GRP_DTL";
    protected final String _tablePropertyName = "MCenterClassGrpDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CENTER_CLASS_GRP_DTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterClassGrpDtlId = cci("CENTER_CLASS_GRP_DTL_ID", "CENTER_CLASS_GRP_DTL_ID", null, null, Long.class, "centerClassGrpDtlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterClassGrpId = cci("CENTER_CLASS_GRP_ID", "CENTER_CLASS_GRP_ID", null, null, Long.class, "centerClassGrpId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenterClassGrp", null, null, false);
    protected final ColumnInfo _columnCenterClassDtlId = cci("CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", null, null, Long.class, "centerClassDtlId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenterClassDtl", null, null, false);
    protected final ColumnInfo _columnDefaultFlg = cci("DEFAULT_FLG", "DEFAULT_FLG", null, null, String.class, "defaultFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * CENTER_CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterClassGrpDtlId() { return _columnCenterClassGrpDtlId; }
    /**
     * CENTER_CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterClassGrpId() { return _columnCenterClassGrpId; }
    /**
     * CENTER_CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterClassDtlId() { return _columnCenterClassDtlId; }
    /**
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultFlg() { return _columnDefaultFlg; }
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
        ls.add(columnCenterClassGrpDtlId());
        ls.add(columnCenterClassGrpId());
        ls.add(columnCenterClassDtlId());
        ls.add(columnDefaultFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnCenterClassGrpDtlId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterClassGrpId());
        ls.add(columnCenterClassDtlId());
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
     * M_CENTER_CLASS_DTL by my CENTER_CLASS_DTL_ID, named 'MCenterClassDtl'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtl() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterClassDtlId(), MCenterClassDtlDbm.getInstance().columnCenterClassDtlId());
        return cfi("M_CENTER_CLASS_GRP_DTL_FK2", "MCenterClassDtl", this, MCenterClassDtlDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCenterClassGrpDtlList", false);
    }
    /**
     * M_CENTER_CLASS_GRP by my CENTER_CLASS_GRP_ID, named 'MCenterClassGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterClassGrpId(), MCenterClassGrpDbm.getInstance().columnCenterClassGrpId());
        return cfi("M_CENTER_CLASS_GRP_DTL_FK1", "MCenterClassGrp", this, MCenterClassGrpDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCenterClassGrpDtlList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCenterClassGrpDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCenterClassGrpDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCenterClassGrpDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCenterClassGrpDtl> getEntityType() { return MCenterClassGrpDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCenterClassGrpDtl newEntity() { return new MCenterClassGrpDtl(); }
    public MCenterClassGrpDtl newMyEntity() { return new MCenterClassGrpDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCenterClassGrpDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCenterClassGrpDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
