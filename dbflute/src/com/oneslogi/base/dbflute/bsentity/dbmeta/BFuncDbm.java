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
 * The DB meta of B_FUNC. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BFuncDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BFuncDbm _instance = new BFuncDbm();
    private BFuncDbm() {}
    public static BFuncDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BFunc)et).getFuncId(), (et, vl) -> ((BFunc)et).setFuncId(ctl(vl)), "funcId");
        setupEpg(_epgMap, et -> ((BFunc)et).getClassCd(), (et, vl) -> ((BFunc)et).setClassCd((String)vl), "classCd");
        setupEpg(_epgMap, et -> ((BFunc)et).getMethodCd(), (et, vl) -> ((BFunc)et).setMethodCd((String)vl), "methodCd");
        setupEpg(_epgMap, et -> ((BFunc)et).getFuncCd(), (et, vl) -> ((BFunc)et).setFuncCd((String)vl), "funcCd");
        setupEpg(_epgMap, et -> ((BFunc)et).getFuncNm(), (et, vl) -> ((BFunc)et).setFuncNm((String)vl), "funcNm");
        setupEpg(_epgMap, et -> ((BFunc)et).getDelFlg(), (et, vl) -> ((BFunc)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BFunc)et).getVersionNo(), (et, vl) -> ((BFunc)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BFunc)et).getControlNo(), (et, vl) -> ((BFunc)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BFunc)et).getAddDt(), (et, vl) -> ((BFunc)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BFunc)et).getAddUser(), (et, vl) -> ((BFunc)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BFunc)et).getAddProcess(), (et, vl) -> ((BFunc)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BFunc)et).getUpdDt(), (et, vl) -> ((BFunc)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BFunc)et).getUpdUser(), (et, vl) -> ((BFunc)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BFunc)et).getUpdProcess(), (et, vl) -> ((BFunc)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_FUNC";
    protected final String _tableDispName = "B_FUNC";
    protected final String _tablePropertyName = "BFunc";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_FUNC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFuncId = cci("FUNC_ID", "FUNC_ID", null, null, Long.class, "funcId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BArgList,BFuncRoleList", null, false);
    protected final ColumnInfo _columnClassCd = cci("CLASS_CD", "CLASS_CD", null, null, String.class, "classCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMethodCd = cci("METHOD_CD", "METHOD_CD", null, null, String.class, "methodCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFuncCd = cci("FUNC_CD", "FUNC_CD", null, null, String.class, "funcCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFuncNm = cci("FUNC_NM", "FUNC_NM", null, null, String.class, "funcNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFuncId() { return _columnFuncId; }
    /**
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassCd() { return _columnClassCd; }
    /**
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMethodCd() { return _columnMethodCd; }
    /**
     * FUNC_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFuncCd() { return _columnFuncCd; }
    /**
     * FUNC_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFuncNm() { return _columnFuncNm; }
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
        ls.add(columnFuncId());
        ls.add(columnClassCd());
        ls.add(columnMethodCd());
        ls.add(columnFuncCd());
        ls.add(columnFuncNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnFuncId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClassCd());
        ls.add(columnMethodCd());
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_ARG by FUNC_ID, named 'BArgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBArgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFuncId(), BArgDbm.getInstance().columnFuncId());
        return cri("B_ARG_FK1", "BArgList", this, BArgDbm.getInstance(), mp, false, "BFunc");
    }
    /**
     * B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBFuncRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFuncId(), BFuncRoleDbm.getInstance().columnFuncId());
        return cri("B_FUNC_ROLE_FK1", "BFuncRoleList", this, BFuncRoleDbm.getInstance(), mp, false, "BFunc");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BFunc"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BFuncCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BFuncBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BFunc> getEntityType() { return BFunc.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BFunc newEntity() { return new BFunc(); }
    public BFunc newMyEntity() { return new BFunc(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BFunc)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BFunc)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
