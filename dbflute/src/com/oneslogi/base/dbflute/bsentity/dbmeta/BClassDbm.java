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
 * The DB meta of B_CLASS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BClassDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BClassDbm _instance = new BClassDbm();
    private BClassDbm() {}
    public static BClassDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BClass)et).getClassId(), (et, vl) -> ((BClass)et).setClassId(ctl(vl)), "classId");
        setupEpg(_epgMap, et -> ((BClass)et).getClassCd(), (et, vl) -> ((BClass)et).setClassCd((String)vl), "classCd");
        setupEpg(_epgMap, et -> ((BClass)et).getClassComment(), (et, vl) -> ((BClass)et).setClassComment((String)vl), "classComment");
        setupEpg(_epgMap, et -> ((BClass)et).getSystemType(), (et, vl) -> ((BClass)et).setSystemType((String)vl), "systemType");
        setupEpg(_epgMap, et -> ((BClass)et).getDelFlg(), (et, vl) -> ((BClass)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BClass)et).getVersionNo(), (et, vl) -> ((BClass)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BClass)et).getControlNo(), (et, vl) -> ((BClass)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BClass)et).getAddDt(), (et, vl) -> ((BClass)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BClass)et).getAddUser(), (et, vl) -> ((BClass)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BClass)et).getAddProcess(), (et, vl) -> ((BClass)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BClass)et).getUpdDt(), (et, vl) -> ((BClass)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BClass)et).getUpdUser(), (et, vl) -> ((BClass)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BClass)et).getUpdProcess(), (et, vl) -> ((BClass)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BClass)et).getBClassDtlBySystemType(), (et, vl) -> ((BClass)et).setBClassDtlBySystemType((BClassDtl)vl), "BClassDtlBySystemType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_CLASS";
    protected final String _tableDispName = "B_CLASS";
    protected final String _tablePropertyName = "BClass";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_CLASS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClassId = cci("CLASS_ID", "CLASS_ID", null, null, Long.class, "classId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BClassDtlList,BClassGrpList", null, false);
    protected final ColumnInfo _columnClassCd = cci("CLASS_CD", "CLASS_CD", null, null, String.class, "classCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClassComment = cci("CLASS_COMMENT", "CLASS_COMMENT", null, null, String.class, "classComment", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSystemType = cci("SYSTEM_TYPE", "SYSTEM_TYPE", null, null, String.class, "systemType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlBySystemType", null, CDef.DefMeta.SystemType, false);
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
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassId() { return _columnClassId; }
    /**
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassCd() { return _columnClassCd; }
    /**
     * CLASS_COMMENT: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassComment() { return _columnClassComment; }
    /**
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemType() { return _columnSystemType; }
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
        ls.add(columnClassId());
        ls.add(columnClassCd());
        ls.add(columnClassComment());
        ls.add(columnSystemType());
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
    protected UniqueInfo cpui() { return hpcpui(columnClassId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnClassCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySystemType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSystemType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_CLASS_SYSTEM_TYPE", "BClassDtlBySystemType", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SYSTEM_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_CLASS_DTL by CLASS_ID, named 'BClassDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBClassDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassId(), BClassDtlDbm.getInstance().columnClassId());
        return cri("B_CLASS_DTL_FK1", "BClassDtlList", this, BClassDtlDbm.getInstance(), mp, false, "BClass");
    }
    /**
     * B_CLASS_GRP by CLASS_ID, named 'BClassGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBClassGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassId(), BClassGrpDbm.getInstance().columnClassId());
        return cri("B_CLASS_GRP_FK1", "BClassGrpList", this, BClassGrpDbm.getInstance(), mp, false, "BClass");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BClass"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BClassCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BClassBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BClass> getEntityType() { return BClass.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BClass newEntity() { return new BClass(); }
    public BClass newMyEntity() { return new BClass(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BClass)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BClass)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
