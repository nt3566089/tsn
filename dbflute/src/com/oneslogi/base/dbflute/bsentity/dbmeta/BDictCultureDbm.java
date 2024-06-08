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
 * The DB meta of B_DICT_CULTURE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BDictCultureDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BDictCultureDbm _instance = new BDictCultureDbm();
    private BDictCultureDbm() {}
    public static BDictCultureDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BDictCulture)et).getDictCultureId(), (et, vl) -> ((BDictCulture)et).setDictCultureId(ctl(vl)), "dictCultureId");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getDictId(), (et, vl) -> ((BDictCulture)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getCultureId(), (et, vl) -> ((BDictCulture)et).setCultureId(ctl(vl)), "cultureId");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getDictNm(), (et, vl) -> ((BDictCulture)et).setDictNm((String)vl), "dictNm");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getDelFlg(), (et, vl) -> ((BDictCulture)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getVersionNo(), (et, vl) -> ((BDictCulture)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getControlNo(), (et, vl) -> ((BDictCulture)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getAddDt(), (et, vl) -> ((BDictCulture)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getAddUser(), (et, vl) -> ((BDictCulture)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getAddProcess(), (et, vl) -> ((BDictCulture)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getUpdDt(), (et, vl) -> ((BDictCulture)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getUpdUser(), (et, vl) -> ((BDictCulture)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BDictCulture)et).getUpdProcess(), (et, vl) -> ((BDictCulture)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BDictCulture)et).getBDict(), (et, vl) -> ((BDictCulture)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BDictCulture)et).getBCulture(), (et, vl) -> ((BDictCulture)et).setBCulture((BCulture)vl), "BCulture");
        setupEfpg(_efpgMap, et -> ((BDictCulture)et).getMHtDictCultureAsOne(), (et, vl) -> ((BDictCulture)et).setMHtDictCultureAsOne((MHtDictCulture)vl), "MHtDictCultureAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_DICT_CULTURE";
    protected final String _tableDispName = "B_DICT_CULTURE";
    protected final String _tablePropertyName = "BDictCulture";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_DICT_CULTURE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDictCultureId = cci("DICT_CULTURE_ID", "DICT_CULTURE_ID", null, null, Long.class, "dictCultureId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "", null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BDict", null, null, false);
    protected final ColumnInfo _columnCultureId = cci("CULTURE_ID", "CULTURE_ID", null, null, Long.class, "cultureId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BCulture", null, null, false);
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
     * DICT_CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictCultureId() { return _columnDictCultureId; }
    /**
     * DICT_ID: {UQ+, IX, NotNull, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureId() { return _columnCultureId; }
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
        ls.add(columnDictId());
        ls.add(columnCultureId());
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

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnDictId());
        ls.add(columnCultureId());
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
        return cfi("B_DICT_CULTURE_FK1", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BDictCultureList", false);
    }
    /**
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBCulture() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BCultureDbm.getInstance().columnCultureId());
        return cfi("B_DICT_CULTURE_FK2", "BCulture", this, BCultureDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BDictCultureList", false);
    }
    /**
     * M_HT_DICT_CULTURE by DICT_CULTURE_ID, named 'MHtDictCultureAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMHtDictCultureAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictCultureId(), MHtDictCultureDbm.getInstance().columnDictCultureId());
        return cfi("M_HT_DICT_CULTURE_FK1", "MHtDictCultureAsOne", this, MHtDictCultureDbm.getInstance(), mp, 2, null, true, false, true, false, null, null, false, "BDictCulture", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BDictCulture"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BDictCultureCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BDictCultureBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BDictCulture> getEntityType() { return BDictCulture.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BDictCulture newEntity() { return new BDictCulture(); }
    public BDictCulture newMyEntity() { return new BDictCulture(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BDictCulture)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BDictCulture)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
