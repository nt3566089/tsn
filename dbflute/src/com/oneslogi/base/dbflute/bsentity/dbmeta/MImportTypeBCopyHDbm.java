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
 * The DB meta of M_IMPORT_TYPE_B_COPY_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeBCopyHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MImportTypeBCopyHDbm _instance = new MImportTypeBCopyHDbm();
    private MImportTypeBCopyHDbm() {}
    public static MImportTypeBCopyHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getImportTypeBCopyHId(), (et, vl) -> ((MImportTypeBCopyH)et).setImportTypeBCopyHId(ctl(vl)), "importTypeBCopyHId");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getImportTypeBId(), (et, vl) -> ((MImportTypeBCopyH)et).setImportTypeBId(ctl(vl)), "importTypeBId");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getCopyHColumnNm(), (et, vl) -> ((MImportTypeBCopyH)et).setCopyHColumnNm((String)vl), "copyHColumnNm");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getDelFlg(), (et, vl) -> ((MImportTypeBCopyH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getVersionNo(), (et, vl) -> ((MImportTypeBCopyH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getControlNo(), (et, vl) -> ((MImportTypeBCopyH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getAddDt(), (et, vl) -> ((MImportTypeBCopyH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getAddUser(), (et, vl) -> ((MImportTypeBCopyH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getAddProcess(), (et, vl) -> ((MImportTypeBCopyH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getUpdDt(), (et, vl) -> ((MImportTypeBCopyH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getUpdUser(), (et, vl) -> ((MImportTypeBCopyH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MImportTypeBCopyH)et).getUpdProcess(), (et, vl) -> ((MImportTypeBCopyH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MImportTypeBCopyH)et).getMImportTypeB(), (et, vl) -> ((MImportTypeBCopyH)et).setMImportTypeB((MImportTypeB)vl), "MImportTypeB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_IMPORT_TYPE_B_COPY_H";
    protected final String _tableDispName = "M_IMPORT_TYPE_B_COPY_H";
    protected final String _tablePropertyName = "MImportTypeBCopyH";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_IMPORT_TYPE_B_COPY_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnImportTypeBCopyHId = cci("IMPORT_TYPE_B_COPY_H_ID", "IMPORT_TYPE_B_COPY_H_ID", null, null, Long.class, "importTypeBCopyHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportTypeBId = cci("IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", null, null, Long.class, "importTypeBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MImportTypeB", null, null, false);
    protected final ColumnInfo _columnCopyHColumnNm = cci("COPY_H_COLUMN_NM", "COPY_H_COLUMN_NM", null, null, String.class, "copyHColumnNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * IMPORT_TYPE_B_COPY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeBCopyHId() { return _columnImportTypeBCopyHId; }
    /**
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeBId() { return _columnImportTypeBId; }
    /**
     * COPY_H_COLUMN_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCopyHColumnNm() { return _columnCopyHColumnNm; }
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
        ls.add(columnImportTypeBCopyHId());
        ls.add(columnImportTypeBId());
        ls.add(columnCopyHColumnNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnImportTypeBCopyHId()); }
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
     * M_IMPORT_TYPE_B by my IMPORT_TYPE_B_ID, named 'MImportTypeB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMImportTypeB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImportTypeBId(), MImportTypeBDbm.getInstance().columnImportTypeBId());
        return cfi("M_IMPORT_TYPE_B_COPY_H_FK1", "MImportTypeB", this, MImportTypeBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MImportTypeBCopyHList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MImportTypeBCopyH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MImportTypeBCopyHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MImportTypeBCopyHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MImportTypeBCopyH> getEntityType() { return MImportTypeBCopyH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MImportTypeBCopyH newEntity() { return new MImportTypeBCopyH(); }
    public MImportTypeBCopyH newMyEntity() { return new MImportTypeBCopyH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MImportTypeBCopyH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MImportTypeBCopyH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
