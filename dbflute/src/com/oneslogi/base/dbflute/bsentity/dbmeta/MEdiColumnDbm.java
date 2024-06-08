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
 * The DB meta of M_EDI_COLUMN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MEdiColumnDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MEdiColumnDbm _instance = new MEdiColumnDbm();
    private MEdiColumnDbm() {}
    public static MEdiColumnDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getEdiColumnId(), (et, vl) -> ((MEdiColumn)et).setEdiColumnId(ctl(vl)), "ediColumnId");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getEdiId(), (et, vl) -> ((MEdiColumn)et).setEdiId(ctl(vl)), "ediId");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getEdiColumnNm(), (et, vl) -> ((MEdiColumn)et).setEdiColumnNm((String)vl), "ediColumnNm");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getDelFlg(), (et, vl) -> ((MEdiColumn)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getVersionNo(), (et, vl) -> ((MEdiColumn)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getControlNo(), (et, vl) -> ((MEdiColumn)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getAddDt(), (et, vl) -> ((MEdiColumn)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getAddUser(), (et, vl) -> ((MEdiColumn)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getAddProcess(), (et, vl) -> ((MEdiColumn)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getUpdDt(), (et, vl) -> ((MEdiColumn)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getUpdUser(), (et, vl) -> ((MEdiColumn)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MEdiColumn)et).getUpdProcess(), (et, vl) -> ((MEdiColumn)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MEdiColumn)et).getMEdi(), (et, vl) -> ((MEdiColumn)et).setMEdi((MEdi)vl), "MEdi");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_EDI_COLUMN";
    protected final String _tableDispName = "M_EDI_COLUMN";
    protected final String _tablePropertyName = "MEdiColumn";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_EDI_COLUMN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEdiColumnId = cci("EDI_COLUMN_ID", "EDI_COLUMN_ID", null, null, Long.class, "ediColumnId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MImportTypeBList", null, false);
    protected final ColumnInfo _columnEdiId = cci("EDI_ID", "EDI_ID", null, null, Long.class, "ediId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MEdi", null, null, false);
    protected final ColumnInfo _columnEdiColumnNm = cci("EDI_COLUMN_NM", "EDI_COLUMN_NM", null, null, String.class, "ediColumnNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEdiColumnId() { return _columnEdiColumnId; }
    /**
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEdiId() { return _columnEdiId; }
    /**
     * EDI_COLUMN_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEdiColumnNm() { return _columnEdiColumnNm; }
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
        ls.add(columnEdiColumnId());
        ls.add(columnEdiId());
        ls.add(columnEdiColumnNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnEdiColumnId()); }
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
     * M_EDI by my EDI_ID, named 'MEdi'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMEdi() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEdiId(), MEdiDbm.getInstance().columnEdiId());
        return cfi("M_EDI_COLUMN_FK1", "MEdi", this, MEdiDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MEdiColumnList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_IMPORT_TYPE_B by EDI_COLUMN_ID, named 'MImportTypeBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMImportTypeBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEdiColumnId(), MImportTypeBDbm.getInstance().columnEdiColumnId());
        return cri("M_IMPORT_TYPE_B_FK2", "MImportTypeBList", this, MImportTypeBDbm.getInstance(), mp, false, "MEdiColumn");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MEdiColumn"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MEdiColumnCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MEdiColumnBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MEdiColumn> getEntityType() { return MEdiColumn.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MEdiColumn newEntity() { return new MEdiColumn(); }
    public MEdiColumn newMyEntity() { return new MEdiColumn(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MEdiColumn)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MEdiColumn)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
