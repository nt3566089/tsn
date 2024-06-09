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
 * The DB meta of M_IMPORT_TYPE_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MImportTypeBDbm _instance = new MImportTypeBDbm();
    private MImportTypeBDbm() {}
    public static MImportTypeBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getImportTypeBId(), (et, vl) -> ((MImportTypeB)et).setImportTypeBId(ctl(vl)), "importTypeBId");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getImportTypeId(), (et, vl) -> ((MImportTypeB)et).setImportTypeId(ctl(vl)), "importTypeId");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getColumnNo(), (et, vl) -> ((MImportTypeB)et).setColumnNo(ctl(vl)), "columnNo");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getEdiColumnId(), (et, vl) -> ((MImportTypeB)et).setEdiColumnId(ctl(vl)), "ediColumnId");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getUploadColumnNm(), (et, vl) -> ((MImportTypeB)et).setUploadColumnNm((String)vl), "uploadColumnNm");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getDelFlg(), (et, vl) -> ((MImportTypeB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getVersionNo(), (et, vl) -> ((MImportTypeB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getControlNo(), (et, vl) -> ((MImportTypeB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getAddDt(), (et, vl) -> ((MImportTypeB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getAddUser(), (et, vl) -> ((MImportTypeB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getAddProcess(), (et, vl) -> ((MImportTypeB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getUpdDt(), (et, vl) -> ((MImportTypeB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getUpdUser(), (et, vl) -> ((MImportTypeB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MImportTypeB)et).getUpdProcess(), (et, vl) -> ((MImportTypeB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MImportTypeB)et).getMEdiColumn(), (et, vl) -> ((MImportTypeB)et).setMEdiColumn((MEdiColumn)vl), "MEdiColumn");
        setupEfpg(_efpgMap, et -> ((MImportTypeB)et).getMImportType(), (et, vl) -> ((MImportTypeB)et).setMImportType((MImportType)vl), "MImportType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_IMPORT_TYPE_B";
    protected final String _tableDispName = "M_IMPORT_TYPE_B";
    protected final String _tablePropertyName = "MImportTypeB";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_IMPORT_TYPE_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnImportTypeBId = cci("IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", null, null, Long.class, "importTypeBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MImportTypeBCopyBList,MImportTypeBCopyHList", null, false);
    protected final ColumnInfo _columnImportTypeId = cci("IMPORT_TYPE_ID", "IMPORT_TYPE_ID", null, null, Long.class, "importTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MImportType", null, null, false);
    protected final ColumnInfo _columnColumnNo = cci("COLUMN_NO", "COLUMN_NO", null, null, Long.class, "columnNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEdiColumnId = cci("EDI_COLUMN_ID", "EDI_COLUMN_ID", null, null, Long.class, "ediColumnId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MEdiColumn", null, null, false);
    protected final ColumnInfo _columnUploadColumnNm = cci("UPLOAD_COLUMN_NM", "UPLOAD_COLUMN_NM", null, null, String.class, "uploadColumnNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeBId() { return _columnImportTypeBId; }
    /**
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeId() { return _columnImportTypeId; }
    /**
     * COLUMN_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColumnNo() { return _columnColumnNo; }
    /**
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEdiColumnId() { return _columnEdiColumnId; }
    /**
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUploadColumnNm() { return _columnUploadColumnNm; }
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
        ls.add(columnImportTypeBId());
        ls.add(columnImportTypeId());
        ls.add(columnColumnNo());
        ls.add(columnEdiColumnId());
        ls.add(columnUploadColumnNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnImportTypeBId()); }
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
     * M_EDI_COLUMN by my EDI_COLUMN_ID, named 'MEdiColumn'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMEdiColumn() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEdiColumnId(), MEdiColumnDbm.getInstance().columnEdiColumnId());
        return cfi("M_IMPORT_TYPE_B_FK2", "MEdiColumn", this, MEdiColumnDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MImportTypeBList", false);
    }
    /**
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMImportType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImportTypeId(), MImportTypeDbm.getInstance().columnImportTypeId());
        return cfi("M_IMPORT_TYPE_B_FK1", "MImportType", this, MImportTypeDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MImportTypeBList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_IMPORT_TYPE_B_COPY_B by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMImportTypeBCopyBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImportTypeBId(), MImportTypeBCopyBDbm.getInstance().columnImportTypeBId());
        return cri("M_IMPORT_TYPE_B_COPY_B_FK1", "MImportTypeBCopyBList", this, MImportTypeBCopyBDbm.getInstance(), mp, false, "MImportTypeB");
    }
    /**
     * M_IMPORT_TYPE_B_COPY_H by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMImportTypeBCopyHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImportTypeBId(), MImportTypeBCopyHDbm.getInstance().columnImportTypeBId());
        return cri("M_IMPORT_TYPE_B_COPY_H_FK1", "MImportTypeBCopyHList", this, MImportTypeBCopyHDbm.getInstance(), mp, false, "MImportTypeB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MImportTypeB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MImportTypeBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MImportTypeBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MImportTypeB> getEntityType() { return MImportTypeB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MImportTypeB newEntity() { return new MImportTypeB(); }
    public MImportTypeB newMyEntity() { return new MImportTypeB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MImportTypeB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MImportTypeB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
