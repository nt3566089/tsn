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
 * The DB meta of B_CLASS_DTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BClassDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BClassDtlDbm _instance = new BClassDtlDbm();
    private BClassDtlDbm() {}
    public static BClassDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BClassDtl)et).getClassDtlId(), (et, vl) -> ((BClassDtl)et).setClassDtlId(ctl(vl)), "classDtlId");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getClassId(), (et, vl) -> ((BClassDtl)et).setClassId(ctl(vl)), "classId");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getClassDtlCd(), (et, vl) -> ((BClassDtl)et).setClassDtlCd((String)vl), "classDtlCd");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getDictId(), (et, vl) -> ((BClassDtl)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getViewOrder(), (et, vl) -> ((BClassDtl)et).setViewOrder(ctl(vl)), "viewOrder");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getDefaultFlg(), (et, vl) -> ((BClassDtl)et).setDefaultFlg((String)vl), "defaultFlg");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getDelFlg(), (et, vl) -> ((BClassDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getVersionNo(), (et, vl) -> ((BClassDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getControlNo(), (et, vl) -> ((BClassDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getAddDt(), (et, vl) -> ((BClassDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getAddUser(), (et, vl) -> ((BClassDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getAddProcess(), (et, vl) -> ((BClassDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getUpdDt(), (et, vl) -> ((BClassDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getUpdUser(), (et, vl) -> ((BClassDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BClassDtl)et).getUpdProcess(), (et, vl) -> ((BClassDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BClassDtl)et).getBClass(), (et, vl) -> ((BClassDtl)et).setBClass((BClass)vl), "BClass");
        setupEfpg(_efpgMap, et -> ((BClassDtl)et).getBDict(), (et, vl) -> ((BClassDtl)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BClassDtl)et).getVDict(), (et, vl) -> ((BClassDtl)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((BClassDtl)et).getBClassDtlSubAsOne(), (et, vl) -> ((BClassDtl)et).setBClassDtlSubAsOne((BClassDtlSub)vl), "BClassDtlSubAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_CLASS_DTL";
    protected final String _tableDispName = "B_CLASS_DTL";
    protected final String _tablePropertyName = "BClassDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_CLASS_DTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClassDtlId = cci("CLASS_DTL_ID", "CLASS_DTL_ID", null, null, Long.class, "classDtlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BClassGrpDtlList", null, false);
    protected final ColumnInfo _columnClassId = cci("CLASS_ID", "CLASS_ID", null, null, Long.class, "classId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BClass", null, null, false);
    protected final ColumnInfo _columnClassDtlCd = cci("CLASS_DTL_CD", "CLASS_DTL_CD", null, null, String.class, "classDtlCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict", null, null, false);
    protected final ColumnInfo _columnViewOrder = cci("VIEW_ORDER", "VIEW_ORDER", null, null, Long.class, "viewOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassDtlId() { return _columnClassDtlId; }
    /**
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassId() { return _columnClassId; }
    /**
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassDtlCd() { return _columnClassDtlCd; }
    /**
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * VIEW_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnViewOrder() { return _columnViewOrder; }
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
        ls.add(columnClassDtlId());
        ls.add(columnClassId());
        ls.add(columnClassDtlCd());
        ls.add(columnDictId());
        ls.add(columnViewOrder());
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
    protected UniqueInfo cpui() { return hpcpui(columnClassDtlId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClassId());
        ls.add(columnClassDtlCd());
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
        return cfi("B_CLASS_DTL_FK1", "BClass", this, BClassDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BClassDtlList", false);
    }
    /**
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("B_CLASS_DTL_FK2", "BDict", this, BDictDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BClassDtlList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_CLASS_DTL_DICT_ID", "VDict", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CLASS_DTL_SUB by CLASS_DTL_ID, named 'BClassDtlSubAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignBClassDtlSubAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassDtlId(), BClassDtlSubDbm.getInstance().columnClassDtlId());
        return cfi("B_CLASS_DTL_SUB_FK1", "BClassDtlSubAsOne", this, BClassDtlSubDbm.getInstance(), mp, 3, null, true, false, true, false, null, null, false, "BClassDtl", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_CLASS_GRP_DTL by CLASS_DTL_ID, named 'BClassGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBClassGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassDtlId(), BClassGrpDtlDbm.getInstance().columnClassDtlId());
        return cri("B_CLASS_GRP_DTL_FK2", "BClassGrpDtlList", this, BClassGrpDtlDbm.getInstance(), mp, false, "BClassDtl");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BClassDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BClassDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BClassDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BClassDtl> getEntityType() { return BClassDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BClassDtl newEntity() { return new BClassDtl(); }
    public BClassDtl newMyEntity() { return new BClassDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BClassDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BClassDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
