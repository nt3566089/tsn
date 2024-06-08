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
 * The DB meta of B_ARG_VALID. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BArgValidDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BArgValidDbm _instance = new BArgValidDbm();
    private BArgValidDbm() {}
    public static BArgValidDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BArgValid)et).getArgId(), (et, vl) -> ((BArgValid)et).setArgId(ctl(vl)), "argId");
        setupEpg(_epgMap, et -> ((BArgValid)et).getInputLimit(), (et, vl) -> ((BArgValid)et).setInputLimit((String)vl), "inputLimit");
        setupEpg(_epgMap, et -> ((BArgValid)et).getLimitMessageCd(), (et, vl) -> ((BArgValid)et).setLimitMessageCd((String)vl), "limitMessageCd");
        setupEpg(_epgMap, et -> ((BArgValid)et).getMinChars(), (et, vl) -> ((BArgValid)et).setMinChars(ctl(vl)), "minChars");
        setupEpg(_epgMap, et -> ((BArgValid)et).getMaxChars(), (et, vl) -> ((BArgValid)et).setMaxChars(ctl(vl)), "maxChars");
        setupEpg(_epgMap, et -> ((BArgValid)et).getMinNumber(), (et, vl) -> ((BArgValid)et).setMinNumber(ctb(vl)), "minNumber");
        setupEpg(_epgMap, et -> ((BArgValid)et).getMaxNumber(), (et, vl) -> ((BArgValid)et).setMaxNumber(ctb(vl)), "maxNumber");
        setupEpg(_epgMap, et -> ((BArgValid)et).getIntegerLength(), (et, vl) -> ((BArgValid)et).setIntegerLength(ctl(vl)), "integerLength");
        setupEpg(_epgMap, et -> ((BArgValid)et).getDecimalLength(), (et, vl) -> ((BArgValid)et).setDecimalLength(ctl(vl)), "decimalLength");
        setupEpg(_epgMap, et -> ((BArgValid)et).getDelFlg(), (et, vl) -> ((BArgValid)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BArgValid)et).getVersionNo(), (et, vl) -> ((BArgValid)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BArgValid)et).getControlNo(), (et, vl) -> ((BArgValid)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BArgValid)et).getAddDt(), (et, vl) -> ((BArgValid)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BArgValid)et).getAddUser(), (et, vl) -> ((BArgValid)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BArgValid)et).getAddProcess(), (et, vl) -> ((BArgValid)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BArgValid)et).getUpdDt(), (et, vl) -> ((BArgValid)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BArgValid)et).getUpdUser(), (et, vl) -> ((BArgValid)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BArgValid)et).getUpdProcess(), (et, vl) -> ((BArgValid)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BArgValid)et).getBArg(), (et, vl) -> ((BArgValid)et).setBArg((BArg)vl), "BArg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_ARG_VALID";
    protected final String _tableDispName = "B_ARG_VALID";
    protected final String _tablePropertyName = "BArgValid";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_ARG_VALID", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnArgId = cci("ARG_ID", "ARG_ID", null, null, Long.class, "argId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "BArg", null, null, false);
    protected final ColumnInfo _columnInputLimit = cci("INPUT_LIMIT", "INPUT_LIMIT", null, null, String.class, "inputLimit", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitMessageCd = cci("LIMIT_MESSAGE_CD", "LIMIT_MESSAGE_CD", null, null, String.class, "limitMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinChars = cci("MIN_CHARS", "MIN_CHARS", null, null, Long.class, "minChars", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxChars = cci("MAX_CHARS", "MAX_CHARS", null, null, Long.class, "maxChars", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinNumber = cci("MIN_NUMBER", "MIN_NUMBER", null, null, java.math.BigDecimal.class, "minNumber", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxNumber = cci("MAX_NUMBER", "MAX_NUMBER", null, null, java.math.BigDecimal.class, "maxNumber", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIntegerLength = cci("INTEGER_LENGTH", "INTEGER_LENGTH", null, null, Long.class, "integerLength", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDecimalLength = cci("DECIMAL_LENGTH", "DECIMAL_LENGTH", null, null, Long.class, "decimalLength", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArgId() { return _columnArgId; }
    /**
     * INPUT_LIMIT: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputLimit() { return _columnInputLimit; }
    /**
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitMessageCd() { return _columnLimitMessageCd; }
    /**
     * MIN_CHARS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinChars() { return _columnMinChars; }
    /**
     * MAX_CHARS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxChars() { return _columnMaxChars; }
    /**
     * MIN_NUMBER: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinNumber() { return _columnMinNumber; }
    /**
     * MAX_NUMBER: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxNumber() { return _columnMaxNumber; }
    /**
     * INTEGER_LENGTH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIntegerLength() { return _columnIntegerLength; }
    /**
     * DECIMAL_LENGTH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDecimalLength() { return _columnDecimalLength; }
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
        ls.add(columnArgId());
        ls.add(columnInputLimit());
        ls.add(columnLimitMessageCd());
        ls.add(columnMinChars());
        ls.add(columnMaxChars());
        ls.add(columnMinNumber());
        ls.add(columnMaxNumber());
        ls.add(columnIntegerLength());
        ls.add(columnDecimalLength());
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
    protected UniqueInfo cpui() { return hpcpui(columnArgId()); }
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
     * B_ARG by my ARG_ID, named 'BArg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBArg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnArgId(), BArgDbm.getInstance().columnArgId());
        return cfi("B_ARG_VALID_FK1", "BArg", this, BArgDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "BArgValidAsOne", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BArgValid"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BArgValidCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BArgValidBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BArgValid> getEntityType() { return BArgValid.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BArgValid newEntity() { return new BArgValid(); }
    public BArgValid newMyEntity() { return new BArgValid(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BArgValid)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BArgValid)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
