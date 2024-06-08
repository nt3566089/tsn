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
 * The DB meta of M_CENTER_CLASS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCenterClassDbm _instance = new MCenterClassDbm();
    private MCenterClassDbm() {}
    public static MCenterClassDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCenterClass)et).getCenterClassId(), (et, vl) -> ((MCenterClass)et).setCenterClassId(ctl(vl)), "centerClassId");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getCenterId(), (et, vl) -> ((MCenterClass)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getClassCd(), (et, vl) -> ((MCenterClass)et).setClassCd((String)vl), "classCd");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getClassComment(), (et, vl) -> ((MCenterClass)et).setClassComment((String)vl), "classComment");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getSystemType(), (et, vl) -> ((MCenterClass)et).setSystemType((String)vl), "systemType");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getDelFlg(), (et, vl) -> ((MCenterClass)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getVersionNo(), (et, vl) -> ((MCenterClass)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getControlNo(), (et, vl) -> ((MCenterClass)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getAddDt(), (et, vl) -> ((MCenterClass)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getAddUser(), (et, vl) -> ((MCenterClass)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getAddProcess(), (et, vl) -> ((MCenterClass)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getUpdDt(), (et, vl) -> ((MCenterClass)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getUpdUser(), (et, vl) -> ((MCenterClass)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCenterClass)et).getUpdProcess(), (et, vl) -> ((MCenterClass)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCenterClass)et).getMCenter(), (et, vl) -> ((MCenterClass)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MCenterClass)et).getBClassDtlBySystemType(), (et, vl) -> ((MCenterClass)et).setBClassDtlBySystemType((BClassDtl)vl), "BClassDtlBySystemType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CENTER_CLASS";
    protected final String _tableDispName = "M_CENTER_CLASS";
    protected final String _tablePropertyName = "MCenterClass";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CENTER_CLASS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterClassId = cci("CENTER_CLASS_ID", "CENTER_CLASS_ID", null, null, Long.class, "centerClassId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MCenterClassDtlList,MCenterClassGrpList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClassCd = cci("CLASS_CD", "CLASS_CD", null, null, String.class, "classCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClassComment = cci("CLASS_COMMENT", "CLASS_COMMENT", null, null, String.class, "classComment", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * CENTER_CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterClassId() { return _columnCenterClassId; }
    /**
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLASS_CD: {+UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassCd() { return _columnClassCd; }
    /**
     * CLASS_COMMENT: {varchar(60)}
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
        ls.add(columnCenterClassId());
        ls.add(columnCenterId());
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
    protected UniqueInfo cpui() { return hpcpui(columnCenterClassId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnClassCd());
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_CENTER_CLASS_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCenterClassList", false);
    }
    /**
     * B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySystemType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSystemType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CENTER_CLASS_SYSTEM_TYPE", "BClassDtlBySystemType", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SYSTEM_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_CENTER_CLASS_DTL by CENTER_CLASS_ID, named 'MCenterClassDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterClassDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterClassId(), MCenterClassDtlDbm.getInstance().columnCenterClassId());
        return cri("M_CENTER_CLASS_DTL_FK1", "MCenterClassDtlList", this, MCenterClassDtlDbm.getInstance(), mp, false, "MCenterClass");
    }
    /**
     * M_CENTER_CLASS_GRP by CENTER_CLASS_ID, named 'MCenterClassGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterClassGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterClassId(), MCenterClassGrpDbm.getInstance().columnCenterClassId());
        return cri("M_CENTER_CLASS_GRP_FK1", "MCenterClassGrpList", this, MCenterClassGrpDbm.getInstance(), mp, false, "MCenterClass");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCenterClass"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCenterClassCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCenterClassBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCenterClass> getEntityType() { return MCenterClass.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCenterClass newEntity() { return new MCenterClass(); }
    public MCenterClass newMyEntity() { return new MCenterClass(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCenterClass)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCenterClass)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
