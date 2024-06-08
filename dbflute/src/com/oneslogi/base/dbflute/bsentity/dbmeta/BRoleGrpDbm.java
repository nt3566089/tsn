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
 * The DB meta of B_ROLE_GRP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BRoleGrpDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BRoleGrpDbm _instance = new BRoleGrpDbm();
    private BRoleGrpDbm() {}
    public static BRoleGrpDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getRoleGrpId(), (et, vl) -> ((BRoleGrp)et).setRoleGrpId(ctl(vl)), "roleGrpId");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getRoleGrpCd(), (et, vl) -> ((BRoleGrp)et).setRoleGrpCd((String)vl), "roleGrpCd");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getDictId(), (et, vl) -> ((BRoleGrp)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getRoleControlClass(), (et, vl) -> ((BRoleGrp)et).setRoleControlClass((String)vl), "roleControlClass");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getDelFlg(), (et, vl) -> ((BRoleGrp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getVersionNo(), (et, vl) -> ((BRoleGrp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getControlNo(), (et, vl) -> ((BRoleGrp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getAddDt(), (et, vl) -> ((BRoleGrp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getAddUser(), (et, vl) -> ((BRoleGrp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getAddProcess(), (et, vl) -> ((BRoleGrp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getUpdDt(), (et, vl) -> ((BRoleGrp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getUpdUser(), (et, vl) -> ((BRoleGrp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BRoleGrp)et).getUpdProcess(), (et, vl) -> ((BRoleGrp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BRoleGrp)et).getBDict(), (et, vl) -> ((BRoleGrp)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BRoleGrp)et).getVDict(), (et, vl) -> ((BRoleGrp)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((BRoleGrp)et).getBClassDtlByRoleControlClass(), (et, vl) -> ((BRoleGrp)et).setBClassDtlByRoleControlClass((BClassDtl)vl), "BClassDtlByRoleControlClass");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_ROLE_GRP";
    protected final String _tableDispName = "B_ROLE_GRP";
    protected final String _tablePropertyName = "BRoleGrp";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_ROLE_GRP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRoleGrpId = cci("ROLE_GRP_ID", "ROLE_GRP_ID", null, null, Long.class, "roleGrpId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BRoleGrpDtlList,BUserList", null, false);
    protected final ColumnInfo _columnRoleGrpCd = cci("ROLE_GRP_CD", "ROLE_GRP_CD", null, null, String.class, "roleGrpCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict", null, null, false);
    protected final ColumnInfo _columnRoleControlClass = cci("ROLE_CONTROL_CLASS", "ROLE_CONTROL_CLASS", null, null, String.class, "roleControlClass", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByRoleControlClass", null, CDef.DefMeta.RoleControlClass, false);
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
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleGrpId() { return _columnRoleGrpId; }
    /**
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleGrpCd() { return _columnRoleGrpCd; }
    /**
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleControlClass() { return _columnRoleControlClass; }
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
        ls.add(columnRoleGrpId());
        ls.add(columnRoleGrpCd());
        ls.add(columnDictId());
        ls.add(columnRoleControlClass());
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
    protected UniqueInfo cpui() { return hpcpui(columnRoleGrpId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnRoleGrpCd());
        ls.add(columnDictId());
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
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("B_ROLE_GRP_FK1", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BRoleGrpList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_ROLE_GRP_ID", "VDict", this, VDictDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my ROLE_CONTROL_CLASS, named 'BClassDtlByRoleControlClass'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByRoleControlClass() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleControlClass(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ROLE_GRP_ROLE_CONTROL_CLASS", "BClassDtlByRoleControlClass", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ROLE_CONTROL_CLASS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBRoleGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleGrpId(), BRoleGrpDtlDbm.getInstance().columnRoleGrpId());
        return cri("B_ROLE_GRP_DTL_FK2", "BRoleGrpDtlList", this, BRoleGrpDtlDbm.getInstance(), mp, false, "BRoleGrp");
    }
    /**
     * B_USER by ROLE_GRP_ID, named 'BUserList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBUserList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleGrpId(), BUserDbm.getInstance().columnRoleGrpId());
        return cri("B_USER_FK1", "BUserList", this, BUserDbm.getInstance(), mp, false, "BRoleGrp");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BRoleGrp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BRoleGrpCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BRoleGrpBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BRoleGrp> getEntityType() { return BRoleGrp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BRoleGrp newEntity() { return new BRoleGrp(); }
    public BRoleGrp newMyEntity() { return new BRoleGrp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BRoleGrp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BRoleGrp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
