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
 * The DB meta of B_CLASS_GRP_DTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BClassGrpDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BClassGrpDtlDbm _instance = new BClassGrpDtlDbm();
    private BClassGrpDtlDbm() {}
    public static BClassGrpDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getClassGrpDtlId(), (et, vl) -> ((BClassGrpDtl)et).setClassGrpDtlId(ctl(vl)), "classGrpDtlId");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getClassGrpId(), (et, vl) -> ((BClassGrpDtl)et).setClassGrpId(ctl(vl)), "classGrpId");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getClassDtlId(), (et, vl) -> ((BClassGrpDtl)et).setClassDtlId(ctl(vl)), "classDtlId");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getDefaultFlg(), (et, vl) -> ((BClassGrpDtl)et).setDefaultFlg((String)vl), "defaultFlg");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getDelFlg(), (et, vl) -> ((BClassGrpDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getVersionNo(), (et, vl) -> ((BClassGrpDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getControlNo(), (et, vl) -> ((BClassGrpDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getAddDt(), (et, vl) -> ((BClassGrpDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getAddUser(), (et, vl) -> ((BClassGrpDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getAddProcess(), (et, vl) -> ((BClassGrpDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getUpdDt(), (et, vl) -> ((BClassGrpDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getUpdUser(), (et, vl) -> ((BClassGrpDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BClassGrpDtl)et).getUpdProcess(), (et, vl) -> ((BClassGrpDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BClassGrpDtl)et).getBClassDtl(), (et, vl) -> ((BClassGrpDtl)et).setBClassDtl((BClassDtl)vl), "BClassDtl");
        setupEfpg(_efpgMap, et -> ((BClassGrpDtl)et).getBClassGrp(), (et, vl) -> ((BClassGrpDtl)et).setBClassGrp((BClassGrp)vl), "BClassGrp");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_CLASS_GRP_DTL";
    protected final String _tableDispName = "B_CLASS_GRP_DTL";
    protected final String _tablePropertyName = "BClassGrpDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_CLASS_GRP_DTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClassGrpDtlId = cci("CLASS_GRP_DTL_ID", "CLASS_GRP_DTL_ID", null, null, Long.class, "classGrpDtlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClassGrpId = cci("CLASS_GRP_ID", "CLASS_GRP_ID", null, null, Long.class, "classGrpId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BClassGrp", null, null, false);
    protected final ColumnInfo _columnClassDtlId = cci("CLASS_DTL_ID", "CLASS_DTL_ID", null, null, Long.class, "classDtlId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BClassDtl", null, null, false);
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
     * CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassGrpDtlId() { return _columnClassGrpDtlId; }
    /**
     * CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassGrpId() { return _columnClassGrpId; }
    /**
     * CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CLASS_DTL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassDtlId() { return _columnClassDtlId; }
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
        ls.add(columnClassGrpDtlId());
        ls.add(columnClassGrpId());
        ls.add(columnClassDtlId());
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
    protected UniqueInfo cpui() { return hpcpui(columnClassGrpDtlId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClassGrpId());
        ls.add(columnClassDtlId());
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
     * B_CLASS_DTL by my CLASS_DTL_ID, named 'BClassDtl'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtl() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassDtlId(), BClassDtlDbm.getInstance().columnClassDtlId());
        return cfi("B_CLASS_GRP_DTL_FK2", "BClassDtl", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BClassGrpDtlList", false);
    }
    /**
     * B_CLASS_GRP by my CLASS_GRP_ID, named 'BClassGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassGrpId(), BClassGrpDbm.getInstance().columnClassGrpId());
        return cfi("B_CLASS_GRP_DTL_FK1", "BClassGrp", this, BClassGrpDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BClassGrpDtlList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BClassGrpDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BClassGrpDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BClassGrpDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BClassGrpDtl> getEntityType() { return BClassGrpDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BClassGrpDtl newEntity() { return new BClassGrpDtl(); }
    public BClassGrpDtl newMyEntity() { return new BClassGrpDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BClassGrpDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BClassGrpDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
