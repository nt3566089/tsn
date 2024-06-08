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
 * The DB meta of M_DATA_INPUT_TYPE_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MDataInputTypeBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MDataInputTypeBDbm _instance = new MDataInputTypeBDbm();
    private MDataInputTypeBDbm() {}
    public static MDataInputTypeBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getDataInputTypeBId(), (et, vl) -> ((MDataInputTypeB)et).setDataInputTypeBId(ctl(vl)), "dataInputTypeBId");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getDataInputTypeId(), (et, vl) -> ((MDataInputTypeB)et).setDataInputTypeId(ctl(vl)), "dataInputTypeId");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getColNo(), (et, vl) -> ((MDataInputTypeB)et).setColNo(ctl(vl)), "colNo");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getColNm(), (et, vl) -> ((MDataInputTypeB)et).setColNm((String)vl), "colNm");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getUploadColumnNm(), (et, vl) -> ((MDataInputTypeB)et).setUploadColumnNm((String)vl), "uploadColumnNm");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getDelFlg(), (et, vl) -> ((MDataInputTypeB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getVersionNo(), (et, vl) -> ((MDataInputTypeB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getControlNo(), (et, vl) -> ((MDataInputTypeB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getAddDt(), (et, vl) -> ((MDataInputTypeB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getAddUser(), (et, vl) -> ((MDataInputTypeB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getAddProcess(), (et, vl) -> ((MDataInputTypeB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getUpdDt(), (et, vl) -> ((MDataInputTypeB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getUpdUser(), (et, vl) -> ((MDataInputTypeB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MDataInputTypeB)et).getUpdProcess(), (et, vl) -> ((MDataInputTypeB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MDataInputTypeB)et).getMDataInputType(), (et, vl) -> ((MDataInputTypeB)et).setMDataInputType((MDataInputType)vl), "MDataInputType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_DATA_INPUT_TYPE_B";
    protected final String _tableDispName = "M_DATA_INPUT_TYPE_B";
    protected final String _tablePropertyName = "MDataInputTypeB";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_DATA_INPUT_TYPE_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDataInputTypeBId = cci("DATA_INPUT_TYPE_B_ID", "DATA_INPUT_TYPE_B_ID", null, null, Long.class, "dataInputTypeBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataInputTypeId = cci("DATA_INPUT_TYPE_ID", "DATA_INPUT_TYPE_ID", null, null, Long.class, "dataInputTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MDataInputType", null, null, false);
    protected final ColumnInfo _columnColNo = cci("COL_NO", "COL_NO", null, null, Long.class, "colNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColNm = cci("COL_NM", "COL_NM", null, null, String.class, "colNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataInputTypeBId() { return _columnDataInputTypeBId; }
    /**
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataInputTypeId() { return _columnDataInputTypeId; }
    /**
     * COL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColNo() { return _columnColNo; }
    /**
     * COL_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColNm() { return _columnColNm; }
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
        ls.add(columnDataInputTypeBId());
        ls.add(columnDataInputTypeId());
        ls.add(columnColNo());
        ls.add(columnColNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnDataInputTypeBId()); }
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
     * M_DATA_INPUT_TYPE by my DATA_INPUT_TYPE_ID, named 'MDataInputType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMDataInputType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDataInputTypeId(), MDataInputTypeDbm.getInstance().columnDataInputTypeId());
        return cfi("M_DATA_INPUT_TYPE_B_FK1", "MDataInputType", this, MDataInputTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MDataInputTypeBList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MDataInputTypeB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MDataInputTypeBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MDataInputTypeBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MDataInputTypeB> getEntityType() { return MDataInputTypeB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MDataInputTypeB newEntity() { return new MDataInputTypeB(); }
    public MDataInputTypeB newMyEntity() { return new MDataInputTypeB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MDataInputTypeB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MDataInputTypeB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
