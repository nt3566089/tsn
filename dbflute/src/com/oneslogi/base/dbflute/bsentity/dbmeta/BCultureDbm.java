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
 * The DB meta of B_CULTURE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BCultureDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BCultureDbm _instance = new BCultureDbm();
    private BCultureDbm() {}
    public static BCultureDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BCulture)et).getCultureId(), (et, vl) -> ((BCulture)et).setCultureId(ctl(vl)), "cultureId");
        setupEpg(_epgMap, et -> ((BCulture)et).getCultureCd(), (et, vl) -> ((BCulture)et).setCultureCd((String)vl), "cultureCd");
        setupEpg(_epgMap, et -> ((BCulture)et).getDictId(), (et, vl) -> ((BCulture)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BCulture)et).getLangCultureId(), (et, vl) -> ((BCulture)et).setLangCultureId(ctl(vl)), "langCultureId");
        setupEpg(_epgMap, et -> ((BCulture)et).getDelFlg(), (et, vl) -> ((BCulture)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BCulture)et).getVersionNo(), (et, vl) -> ((BCulture)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BCulture)et).getControlNo(), (et, vl) -> ((BCulture)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BCulture)et).getAddDt(), (et, vl) -> ((BCulture)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BCulture)et).getAddUser(), (et, vl) -> ((BCulture)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BCulture)et).getAddProcess(), (et, vl) -> ((BCulture)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BCulture)et).getUpdDt(), (et, vl) -> ((BCulture)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BCulture)et).getUpdUser(), (et, vl) -> ((BCulture)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BCulture)et).getUpdProcess(), (et, vl) -> ((BCulture)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BCulture)et).getBDict(), (et, vl) -> ((BCulture)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BCulture)et).getBCultureSelf(), (et, vl) -> ((BCulture)et).setBCultureSelf((BCulture)vl), "BCultureSelf");
        setupEfpg(_efpgMap, et -> ((BCulture)et).getVDict(), (et, vl) -> ((BCulture)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((BCulture)et).getBCultureAttributeAsOne(), (et, vl) -> ((BCulture)et).setBCultureAttributeAsOne((BCultureAttribute)vl), "BCultureAttributeAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_CULTURE";
    protected final String _tableDispName = "B_CULTURE";
    protected final String _tablePropertyName = "BCulture";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_CULTURE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCultureId = cci("CULTURE_ID", "CULTURE_ID", null, null, Long.class, "cultureId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BCultureSelfList,BDictCultureList,BInfoList,BMessageList,BUserList,MCenterList", null, false);
    protected final ColumnInfo _columnCultureCd = cci("CULTURE_CD", "CULTURE_CD", null, null, String.class, "cultureCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict", null, null, false);
    protected final ColumnInfo _columnLangCultureId = cci("LANG_CULTURE_ID", "LANG_CULTURE_ID", null, null, Long.class, "langCultureId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BCultureSelf", null, null, false);
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
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureId() { return _columnCultureId; }
    /**
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureCd() { return _columnCultureCd; }
    /**
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLangCultureId() { return _columnLangCultureId; }
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
        ls.add(columnCultureId());
        ls.add(columnCultureCd());
        ls.add(columnDictId());
        ls.add(columnLangCultureId());
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
    protected UniqueInfo cpui() { return hpcpui(columnCultureId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnCultureCd()); }

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
        return cfi("B_CULTURE_FK1", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BCultureList", false);
    }
    /**
     * B_CULTURE by my LANG_CULTURE_ID, named 'BCultureSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBCultureSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLangCultureId(), BCultureDbm.getInstance().columnCultureId());
        return cfi("B_CULTURE_FK2", "BCultureSelf", this, BCultureDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BCultureSelfList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_CULTURE_ID", "VDict", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CULTURE_ATTRIBUTE by CULTURE_ID, named 'BCultureAttributeAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignBCultureAttributeAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BCultureAttributeDbm.getInstance().columnCultureId());
        return cfi("B_CULTURE_ATTRIBUTE_FK1", "BCultureAttributeAsOne", this, BCultureAttributeDbm.getInstance(), mp, 3, null, true, false, true, false, null, null, false, "BCulture", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBCultureSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BCultureDbm.getInstance().columnLangCultureId());
        return cri("B_CULTURE_FK2", "BCultureSelfList", this, BCultureDbm.getInstance(), mp, false, "BCultureSelf");
    }
    /**
     * B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBDictCultureList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BDictCultureDbm.getInstance().columnCultureId());
        return cri("B_DICT_CULTURE_FK2", "BDictCultureList", this, BDictCultureDbm.getInstance(), mp, false, "BCulture");
    }
    /**
     * B_INFO by CULTURE_ID, named 'BInfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBInfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BInfoDbm.getInstance().columnCultureId());
        return cri("B_INFO_FK1", "BInfoList", this, BInfoDbm.getInstance(), mp, false, "BCulture");
    }
    /**
     * B_MESSAGE by CULTURE_ID, named 'BMessageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBMessageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BMessageDbm.getInstance().columnCultureId());
        return cri("B_MESSAGE_FK1", "BMessageList", this, BMessageDbm.getInstance(), mp, false, "BCulture");
    }
    /**
     * B_USER by CULTURE_ID, named 'BUserList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBUserList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BUserDbm.getInstance().columnCultureId());
        return cri("B_USER_FK2", "BUserList", this, BUserDbm.getInstance(), mp, false, "BCulture");
    }
    /**
     * M_CENTER by CULTURE_ID, named 'MCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), MCenterDbm.getInstance().columnCultureId());
        return cri("M_CENTER_FK2", "MCenterList", this, MCenterDbm.getInstance(), mp, false, "BCulture");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BCulture"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BCultureCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BCultureBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BCulture> getEntityType() { return BCulture.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BCulture newEntity() { return new BCulture(); }
    public BCulture newMyEntity() { return new BCulture(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BCulture)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BCulture)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
