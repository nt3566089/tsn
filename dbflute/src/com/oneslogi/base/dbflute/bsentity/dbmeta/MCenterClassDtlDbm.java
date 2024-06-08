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
 * The DB meta of M_CENTER_CLASS_DTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCenterClassDtlDbm _instance = new MCenterClassDtlDbm();
    private MCenterClassDtlDbm() {}
    public static MCenterClassDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getCenterClassDtlId(), (et, vl) -> ((MCenterClassDtl)et).setCenterClassDtlId(ctl(vl)), "centerClassDtlId");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getCenterClassId(), (et, vl) -> ((MCenterClassDtl)et).setCenterClassId(ctl(vl)), "centerClassId");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getClassDtlCd(), (et, vl) -> ((MCenterClassDtl)et).setClassDtlCd((String)vl), "classDtlCd");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getDictId(), (et, vl) -> ((MCenterClassDtl)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getViewOrder(), (et, vl) -> ((MCenterClassDtl)et).setViewOrder(ctl(vl)), "viewOrder");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getDefaultFlg(), (et, vl) -> ((MCenterClassDtl)et).setDefaultFlg((String)vl), "defaultFlg");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getDelFlg(), (et, vl) -> ((MCenterClassDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getVersionNo(), (et, vl) -> ((MCenterClassDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getControlNo(), (et, vl) -> ((MCenterClassDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getAddDt(), (et, vl) -> ((MCenterClassDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getAddUser(), (et, vl) -> ((MCenterClassDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getAddProcess(), (et, vl) -> ((MCenterClassDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getUpdDt(), (et, vl) -> ((MCenterClassDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getUpdUser(), (et, vl) -> ((MCenterClassDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCenterClassDtl)et).getUpdProcess(), (et, vl) -> ((MCenterClassDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCenterClassDtl)et).getMCenterClass(), (et, vl) -> ((MCenterClassDtl)et).setMCenterClass((MCenterClass)vl), "MCenterClass");
        setupEfpg(_efpgMap, et -> ((MCenterClassDtl)et).getBDict(), (et, vl) -> ((MCenterClassDtl)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((MCenterClassDtl)et).getVDict(), (et, vl) -> ((MCenterClassDtl)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((MCenterClassDtl)et).getMCenterClassDtlSubAsOne(), (et, vl) -> ((MCenterClassDtl)et).setMCenterClassDtlSubAsOne((MCenterClassDtlSub)vl), "MCenterClassDtlSubAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CENTER_CLASS_DTL";
    protected final String _tableDispName = "M_CENTER_CLASS_DTL";
    protected final String _tablePropertyName = "MCenterClassDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CENTER_CLASS_DTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterClassDtlId = cci("CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", null, null, Long.class, "centerClassDtlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MCenterClassGrpDtlList", null, false);
    protected final ColumnInfo _columnCenterClassId = cci("CENTER_CLASS_ID", "CENTER_CLASS_ID", null, null, Long.class, "centerClassId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenterClass", null, null, false);
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
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterClassDtlId() { return _columnCenterClassDtlId; }
    /**
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterClassId() { return _columnCenterClassId; }
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
        ls.add(columnCenterClassDtlId());
        ls.add(columnCenterClassId());
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
    protected UniqueInfo cpui() { return hpcpui(columnCenterClassDtlId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterClassId());
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
     * M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClass() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterClassId(), MCenterClassDbm.getInstance().columnCenterClassId());
        return cfi("M_CENTER_CLASS_DTL_FK1", "MCenterClass", this, MCenterClassDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCenterClassDtlList", false);
    }
    /**
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("M_CENTER_CLASS_DTL_FK2", "BDict", this, BDictDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCenterClassDtlList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_M_CENTER_CLASS_DTL_DICT_ID", "VDict", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL_SUB by CENTER_CLASS_DTL_ID, named 'MCenterClassDtlSubAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlSubAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterClassDtlId(), MCenterClassDtlSubDbm.getInstance().columnCenterClassDtlId());
        return cfi("M_CENTER_CLASS_DTL_SUB_FK1", "MCenterClassDtlSubAsOne", this, MCenterClassDtlSubDbm.getInstance(), mp, 3, null, true, false, true, false, null, null, false, "MCenterClassDtl", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_DTL_ID, named 'MCenterClassGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterClassGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterClassDtlId(), MCenterClassGrpDtlDbm.getInstance().columnCenterClassDtlId());
        return cri("M_CENTER_CLASS_GRP_DTL_FK2", "MCenterClassGrpDtlList", this, MCenterClassGrpDtlDbm.getInstance(), mp, false, "MCenterClassDtl");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCenterClassDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCenterClassDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCenterClassDtl> getEntityType() { return MCenterClassDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCenterClassDtl newEntity() { return new MCenterClassDtl(); }
    public MCenterClassDtl newMyEntity() { return new MCenterClassDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCenterClassDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCenterClassDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
