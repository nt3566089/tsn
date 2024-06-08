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
 * The DB meta of B_ARG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BArgDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BArgDbm _instance = new BArgDbm();
    private BArgDbm() {}
    public static BArgDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BArg)et).getArgId(), (et, vl) -> ((BArg)et).setArgId(ctl(vl)), "argId");
        setupEpg(_epgMap, et -> ((BArg)et).getFuncId(), (et, vl) -> ((BArg)et).setFuncId(ctl(vl)), "funcId");
        setupEpg(_epgMap, et -> ((BArg)et).getArgCd(), (et, vl) -> ((BArg)et).setArgCd((String)vl), "argCd");
        setupEpg(_epgMap, et -> ((BArg)et).getDictId(), (et, vl) -> ((BArg)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BArg)et).getArgType(), (et, vl) -> ((BArg)et).setArgType((String)vl), "argType");
        setupEpg(_epgMap, et -> ((BArg)et).getNecessary(), (et, vl) -> ((BArg)et).setNecessary((String)vl), "necessary");
        setupEpg(_epgMap, et -> ((BArg)et).getDelFlg(), (et, vl) -> ((BArg)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BArg)et).getVersionNo(), (et, vl) -> ((BArg)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BArg)et).getControlNo(), (et, vl) -> ((BArg)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BArg)et).getAddDt(), (et, vl) -> ((BArg)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BArg)et).getAddUser(), (et, vl) -> ((BArg)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BArg)et).getAddProcess(), (et, vl) -> ((BArg)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BArg)et).getUpdDt(), (et, vl) -> ((BArg)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BArg)et).getUpdUser(), (et, vl) -> ((BArg)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BArg)et).getUpdProcess(), (et, vl) -> ((BArg)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BArg)et).getBFunc(), (et, vl) -> ((BArg)et).setBFunc((BFunc)vl), "BFunc");
        setupEfpg(_efpgMap, et -> ((BArg)et).getBDict(), (et, vl) -> ((BArg)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BArg)et).getVHtDict(), (et, vl) -> ((BArg)et).setVHtDict((VHtDict)vl), "VHtDict");
        setupEfpg(_efpgMap, et -> ((BArg)et).getBArgValidAsOne(), (et, vl) -> ((BArg)et).setBArgValidAsOne((BArgValid)vl), "BArgValidAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_ARG";
    protected final String _tableDispName = "B_ARG";
    protected final String _tablePropertyName = "BArg";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_ARG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnArgId = cci("ARG_ID", "ARG_ID", null, null, Long.class, "argId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, "", null, false);
    protected final ColumnInfo _columnFuncId = cci("FUNC_ID", "FUNC_ID", null, null, Long.class, "funcId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BFunc", null, null, false);
    protected final ColumnInfo _columnArgCd = cci("ARG_CD", "ARG_CD", null, null, String.class, "argCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VHtDict", null, null, false);
    protected final ColumnInfo _columnArgType = cci("ARG_TYPE", "ARG_TYPE", null, null, String.class, "argType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNecessary = cci("NECESSARY", "NECESSARY", null, null, String.class, "necessary", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArgId() { return _columnArgId; }
    /**
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFuncId() { return _columnFuncId; }
    /**
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArgCd() { return _columnArgCd; }
    /**
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * ARG_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArgType() { return _columnArgType; }
    /**
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNecessary() { return _columnNecessary; }
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
        ls.add(columnArgId());
        ls.add(columnFuncId());
        ls.add(columnArgCd());
        ls.add(columnDictId());
        ls.add(columnArgType());
        ls.add(columnNecessary());
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
    protected UniqueInfo cpui() { return hpcpui(columnArgId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnFuncId());
        ls.add(columnArgCd());
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
     * B_FUNC by my FUNC_ID, named 'BFunc'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBFunc() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFuncId(), BFuncDbm.getInstance().columnFuncId());
        return cfi("B_ARG_FK1", "BFunc", this, BFuncDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BArgList", false);
    }
    /**
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("B_ARG_FK2", "BDict", this, BDictDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BArgList", false);
    }
    /**
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVHtDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VHtDictDbm.getInstance().columnDictId());
        return cfi("FK_B_ARG_TO_V_HT_DICT", "VHtDict", this, VHtDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVHtDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_ARG_VALID by ARG_ID, named 'BArgValidAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignBArgValidAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnArgId(), BArgValidDbm.getInstance().columnArgId());
        return cfi("B_ARG_VALID_FK1", "BArgValidAsOne", this, BArgValidDbm.getInstance(), mp, 3, null, true, false, true, false, null, null, false, "BArg", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BArg"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BArgCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BArgBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BArg> getEntityType() { return BArg.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BArg newEntity() { return new BArg(); }
    public BArg newMyEntity() { return new BArg(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BArg)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BArg)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
