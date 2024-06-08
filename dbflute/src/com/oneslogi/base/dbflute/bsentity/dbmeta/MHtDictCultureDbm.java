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
 * The DB meta of M_HT_DICT_CULTURE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MHtDictCultureDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MHtDictCultureDbm _instance = new MHtDictCultureDbm();
    private MHtDictCultureDbm() {}
    public static MHtDictCultureDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getDictCultureId(), (et, vl) -> ((MHtDictCulture)et).setDictCultureId(ctl(vl)), "dictCultureId");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getDictNm(), (et, vl) -> ((MHtDictCulture)et).setDictNm((String)vl), "dictNm");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getDelFlg(), (et, vl) -> ((MHtDictCulture)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getVersionNo(), (et, vl) -> ((MHtDictCulture)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getControlNo(), (et, vl) -> ((MHtDictCulture)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getAddDt(), (et, vl) -> ((MHtDictCulture)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getAddUser(), (et, vl) -> ((MHtDictCulture)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getAddProcess(), (et, vl) -> ((MHtDictCulture)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getUpdDt(), (et, vl) -> ((MHtDictCulture)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getUpdUser(), (et, vl) -> ((MHtDictCulture)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MHtDictCulture)et).getUpdProcess(), (et, vl) -> ((MHtDictCulture)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MHtDictCulture)et).getBDictCulture(), (et, vl) -> ((MHtDictCulture)et).setBDictCulture((BDictCulture)vl), "BDictCulture");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_HT_DICT_CULTURE";
    protected final String _tableDispName = "M_HT_DICT_CULTURE";
    protected final String _tablePropertyName = "MHtDictCulture";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_HT_DICT_CULTURE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDictCultureId = cci("DICT_CULTURE_ID", "DICT_CULTURE_ID", null, null, Long.class, "dictCultureId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "BDictCulture", null, null, false);
    protected final ColumnInfo _columnDictNm = cci("DICT_NM", "DICT_NM", null, null, String.class, "dictNm", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * DICT_CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_DICT_CULTURE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictCultureId() { return _columnDictCultureId; }
    /**
     * DICT_NM: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictNm() { return _columnDictNm; }
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
        ls.add(columnDictCultureId());
        ls.add(columnDictNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnDictCultureId()); }
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
     * B_DICT_CULTURE by my DICT_CULTURE_ID, named 'BDictCulture'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDictCulture() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictCultureId(), BDictCultureDbm.getInstance().columnDictCultureId());
        return cfi("M_HT_DICT_CULTURE_FK1", "BDictCulture", this, BDictCultureDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "MHtDictCultureAsOne", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MHtDictCulture"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MHtDictCultureCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MHtDictCultureBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MHtDictCulture> getEntityType() { return MHtDictCulture.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MHtDictCulture newEntity() { return new MHtDictCulture(); }
    public MHtDictCulture newMyEntity() { return new MHtDictCulture(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MHtDictCulture)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MHtDictCulture)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
