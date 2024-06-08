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
 * The DB meta of B_CLASS_GRP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BClassGrpDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BClassGrpDbm _instance = new BClassGrpDbm();
    private BClassGrpDbm() {}
    public static BClassGrpDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BClassGrp)et).getClassGrpId(), (et, vl) -> ((BClassGrp)et).setClassGrpId(ctl(vl)), "classGrpId");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getClassGrpCd(), (et, vl) -> ((BClassGrp)et).setClassGrpCd((String)vl), "classGrpCd");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getClassGrpComment(), (et, vl) -> ((BClassGrp)et).setClassGrpComment((String)vl), "classGrpComment");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getClassId(), (et, vl) -> ((BClassGrp)et).setClassId(ctl(vl)), "classId");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getDelFlg(), (et, vl) -> ((BClassGrp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getVersionNo(), (et, vl) -> ((BClassGrp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getControlNo(), (et, vl) -> ((BClassGrp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getAddDt(), (et, vl) -> ((BClassGrp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getAddUser(), (et, vl) -> ((BClassGrp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getAddProcess(), (et, vl) -> ((BClassGrp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getUpdDt(), (et, vl) -> ((BClassGrp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getUpdUser(), (et, vl) -> ((BClassGrp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BClassGrp)et).getUpdProcess(), (et, vl) -> ((BClassGrp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BClassGrp)et).getBClass(), (et, vl) -> ((BClassGrp)et).setBClass((BClass)vl), "BClass");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_CLASS_GRP";
    protected final String _tableDispName = "B_CLASS_GRP";
    protected final String _tablePropertyName = "BClassGrp";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_CLASS_GRP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClassGrpId = cci("CLASS_GRP_ID", "CLASS_GRP_ID", null, null, Long.class, "classGrpId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, "BClassGrpDtlList", null, false);
    protected final ColumnInfo _columnClassGrpCd = cci("CLASS_GRP_CD", "CLASS_GRP_CD", null, null, String.class, "classGrpCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClassGrpComment = cci("CLASS_GRP_COMMENT", "CLASS_GRP_COMMENT", null, null, String.class, "classGrpComment", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClassId = cci("CLASS_ID", "CLASS_ID", null, null, Long.class, "classId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BClass", null, null, false);
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
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassGrpId() { return _columnClassGrpId; }
    /**
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassGrpCd() { return _columnClassGrpCd; }
    /**
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassGrpComment() { return _columnClassGrpComment; }
    /**
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassId() { return _columnClassId; }
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
        ls.add(columnClassGrpId());
        ls.add(columnClassGrpCd());
        ls.add(columnClassGrpComment());
        ls.add(columnClassId());
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
    protected UniqueInfo cpui() { return hpcpui(columnClassGrpId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClassId());
        ls.add(columnClassGrpCd());
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
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClass() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassId(), BClassDbm.getInstance().columnClassId());
        return cfi("B_CLASS_GRP_FK1", "BClass", this, BClassDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BClassGrpList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_CLASS_GRP_DTL by CLASS_GRP_ID, named 'BClassGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBClassGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassGrpId(), BClassGrpDtlDbm.getInstance().columnClassGrpId());
        return cri("B_CLASS_GRP_DTL_FK1", "BClassGrpDtlList", this, BClassGrpDtlDbm.getInstance(), mp, false, "BClassGrp");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BClassGrp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BClassGrpCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BClassGrpBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BClassGrp> getEntityType() { return BClassGrp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BClassGrp newEntity() { return new BClassGrp(); }
    public BClassGrp newMyEntity() { return new BClassGrp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BClassGrp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BClassGrp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
