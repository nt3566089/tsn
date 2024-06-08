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
 * The DB meta of M_CENTER_CLASS_DTL_SUB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassDtlSubDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCenterClassDtlSubDbm _instance = new MCenterClassDtlSubDbm();
    private MCenterClassDtlSubDbm() {}
    public static MCenterClassDtlSubDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getCenterClassDtlId(), (et, vl) -> ((MCenterClassDtlSub)et).setCenterClassDtlId(ctl(vl)), "centerClassDtlId");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOthercd1(), (et, vl) -> ((MCenterClassDtlSub)et).setOthercd1((String)vl), "othercd1");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOthercd2(), (et, vl) -> ((MCenterClassDtlSub)et).setOthercd2((String)vl), "othercd2");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOthercd3(), (et, vl) -> ((MCenterClassDtlSub)et).setOthercd3((String)vl), "othercd3");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOthercd4(), (et, vl) -> ((MCenterClassDtlSub)et).setOthercd4((String)vl), "othercd4");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOthercd5(), (et, vl) -> ((MCenterClassDtlSub)et).setOthercd5((String)vl), "othercd5");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOther1Comment(), (et, vl) -> ((MCenterClassDtlSub)et).setOther1Comment((String)vl), "other1Comment");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOther2Comment(), (et, vl) -> ((MCenterClassDtlSub)et).setOther2Comment((String)vl), "other2Comment");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOther3Comment(), (et, vl) -> ((MCenterClassDtlSub)et).setOther3Comment((String)vl), "other3Comment");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOther4Comment(), (et, vl) -> ((MCenterClassDtlSub)et).setOther4Comment((String)vl), "other4Comment");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getOther5Comment(), (et, vl) -> ((MCenterClassDtlSub)et).setOther5Comment((String)vl), "other5Comment");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getDelFlg(), (et, vl) -> ((MCenterClassDtlSub)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getVersionNo(), (et, vl) -> ((MCenterClassDtlSub)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getControlNo(), (et, vl) -> ((MCenterClassDtlSub)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getAddDt(), (et, vl) -> ((MCenterClassDtlSub)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getAddUser(), (et, vl) -> ((MCenterClassDtlSub)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getAddProcess(), (et, vl) -> ((MCenterClassDtlSub)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getUpdDt(), (et, vl) -> ((MCenterClassDtlSub)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getUpdUser(), (et, vl) -> ((MCenterClassDtlSub)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCenterClassDtlSub)et).getUpdProcess(), (et, vl) -> ((MCenterClassDtlSub)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCenterClassDtlSub)et).getMCenterClassDtl(), (et, vl) -> ((MCenterClassDtlSub)et).setMCenterClassDtl((MCenterClassDtl)vl), "MCenterClassDtl");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CENTER_CLASS_DTL_SUB";
    protected final String _tableDispName = "M_CENTER_CLASS_DTL_SUB";
    protected final String _tablePropertyName = "MCenterClassDtlSub";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CENTER_CLASS_DTL_SUB", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterClassDtlId = cci("CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", null, null, Long.class, "centerClassDtlId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenterClassDtl", null, null, false);
    protected final ColumnInfo _columnOthercd1 = cci("OTHERCD1", "OTHERCD1", null, null, String.class, "othercd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd2 = cci("OTHERCD2", "OTHERCD2", null, null, String.class, "othercd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd3 = cci("OTHERCD3", "OTHERCD3", null, null, String.class, "othercd3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd4 = cci("OTHERCD4", "OTHERCD4", null, null, String.class, "othercd4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd5 = cci("OTHERCD5", "OTHERCD5", null, null, String.class, "othercd5", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOther1Comment = cci("OTHER1_COMMENT", "OTHER1_COMMENT", null, null, String.class, "other1Comment", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOther2Comment = cci("OTHER2_COMMENT", "OTHER2_COMMENT", null, null, String.class, "other2Comment", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOther3Comment = cci("OTHER3_COMMENT", "OTHER3_COMMENT", null, null, String.class, "other3Comment", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOther4Comment = cci("OTHER4_COMMENT", "OTHER4_COMMENT", null, null, String.class, "other4Comment", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOther5Comment = cci("OTHER5_COMMENT", "OTHER5_COMMENT", null, null, String.class, "other5Comment", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterClassDtlId() { return _columnCenterClassDtlId; }
    /**
     * OTHERCD1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd1() { return _columnOthercd1; }
    /**
     * OTHERCD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd2() { return _columnOthercd2; }
    /**
     * OTHERCD3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd3() { return _columnOthercd3; }
    /**
     * OTHERCD4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd4() { return _columnOthercd4; }
    /**
     * OTHERCD5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd5() { return _columnOthercd5; }
    /**
     * OTHER1_COMMENT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOther1Comment() { return _columnOther1Comment; }
    /**
     * OTHER2_COMMENT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOther2Comment() { return _columnOther2Comment; }
    /**
     * OTHER3_COMMENT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOther3Comment() { return _columnOther3Comment; }
    /**
     * OTHER4_COMMENT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOther4Comment() { return _columnOther4Comment; }
    /**
     * OTHER5_COMMENT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOther5Comment() { return _columnOther5Comment; }
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
        ls.add(columnOthercd1());
        ls.add(columnOthercd2());
        ls.add(columnOthercd3());
        ls.add(columnOthercd4());
        ls.add(columnOthercd5());
        ls.add(columnOther1Comment());
        ls.add(columnOther2Comment());
        ls.add(columnOther3Comment());
        ls.add(columnOther4Comment());
        ls.add(columnOther5Comment());
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
        return cfi("M_CENTER_CLASS_DTL_SUB_FK1", "MCenterClassDtl", this, MCenterClassDtlDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "MCenterClassDtlSubAsOne", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCenterClassDtlSub"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCenterClassDtlSubCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCenterClassDtlSubBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCenterClassDtlSub> getEntityType() { return MCenterClassDtlSub.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCenterClassDtlSub newEntity() { return new MCenterClassDtlSub(); }
    public MCenterClassDtlSub newMyEntity() { return new MCenterClassDtlSub(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCenterClassDtlSub)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCenterClassDtlSub)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
