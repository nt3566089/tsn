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
 * The DB meta of B_CULTURE_ATTRIBUTE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BCultureAttributeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BCultureAttributeDbm _instance = new BCultureAttributeDbm();
    private BCultureAttributeDbm() {}
    public static BCultureAttributeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getCultureId(), (et, vl) -> ((BCultureAttribute)et).setCultureId(ctl(vl)), "cultureId");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDateTimeFormatDisplay(), (et, vl) -> ((BCultureAttribute)et).setDateTimeFormatDisplay((String)vl), "dateTimeFormatDisplay");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDateTimeFormatReport(), (et, vl) -> ((BCultureAttribute)et).setDateTimeFormatReport((String)vl), "dateTimeFormatReport");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDateTimeFormatExcel(), (et, vl) -> ((BCultureAttribute)et).setDateTimeFormatExcel((String)vl), "dateTimeFormatExcel");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDateTimeFormatText(), (et, vl) -> ((BCultureAttribute)et).setDateTimeFormatText((String)vl), "dateTimeFormatText");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDateFormatDisplay(), (et, vl) -> ((BCultureAttribute)et).setDateFormatDisplay((String)vl), "dateFormatDisplay");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDateFormatReport(), (et, vl) -> ((BCultureAttribute)et).setDateFormatReport((String)vl), "dateFormatReport");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDateFormatExcel(), (et, vl) -> ((BCultureAttribute)et).setDateFormatExcel((String)vl), "dateFormatExcel");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDateFormatText(), (et, vl) -> ((BCultureAttribute)et).setDateFormatText((String)vl), "dateFormatText");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getTimeFormatDisplay(), (et, vl) -> ((BCultureAttribute)et).setTimeFormatDisplay((String)vl), "timeFormatDisplay");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getTimeFormatReport(), (et, vl) -> ((BCultureAttribute)et).setTimeFormatReport((String)vl), "timeFormatReport");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getTimeFormatExcel(), (et, vl) -> ((BCultureAttribute)et).setTimeFormatExcel((String)vl), "timeFormatExcel");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getTimeFormatText(), (et, vl) -> ((BCultureAttribute)et).setTimeFormatText((String)vl), "timeFormatText");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getNumberFormatDisplay(), (et, vl) -> ((BCultureAttribute)et).setNumberFormatDisplay((String)vl), "numberFormatDisplay");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getNumberFormatReport(), (et, vl) -> ((BCultureAttribute)et).setNumberFormatReport((String)vl), "numberFormatReport");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getNumberFormatExcel(), (et, vl) -> ((BCultureAttribute)et).setNumberFormatExcel((String)vl), "numberFormatExcel");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getNumberFormatText(), (et, vl) -> ((BCultureAttribute)et).setNumberFormatText((String)vl), "numberFormatText");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getCurrencyFormatReport(), (et, vl) -> ((BCultureAttribute)et).setCurrencyFormatReport((String)vl), "currencyFormatReport");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getFontNameExcel(), (et, vl) -> ((BCultureAttribute)et).setFontNameExcel((String)vl), "fontNameExcel");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getFontSizeExcel(), (et, vl) -> ((BCultureAttribute)et).setFontSizeExcel(ctb(vl)), "fontSizeExcel");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getDelFlg(), (et, vl) -> ((BCultureAttribute)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getVersionNo(), (et, vl) -> ((BCultureAttribute)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getControlNo(), (et, vl) -> ((BCultureAttribute)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getAddDt(), (et, vl) -> ((BCultureAttribute)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getAddUser(), (et, vl) -> ((BCultureAttribute)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getAddProcess(), (et, vl) -> ((BCultureAttribute)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getUpdDt(), (et, vl) -> ((BCultureAttribute)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getUpdUser(), (et, vl) -> ((BCultureAttribute)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BCultureAttribute)et).getUpdProcess(), (et, vl) -> ((BCultureAttribute)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BCultureAttribute)et).getBCulture(), (et, vl) -> ((BCultureAttribute)et).setBCulture((BCulture)vl), "BCulture");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_CULTURE_ATTRIBUTE";
    protected final String _tableDispName = "B_CULTURE_ATTRIBUTE";
    protected final String _tablePropertyName = "BCultureAttribute";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_CULTURE_ATTRIBUTE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCultureId = cci("CULTURE_ID", "CULTURE_ID", null, null, Long.class, "cultureId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "BCulture", null, null, false);
    protected final ColumnInfo _columnDateTimeFormatDisplay = cci("DATE_TIME_FORMAT_DISPLAY", "DATE_TIME_FORMAT_DISPLAY", null, null, String.class, "dateTimeFormatDisplay", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateTimeFormatReport = cci("DATE_TIME_FORMAT_REPORT", "DATE_TIME_FORMAT_REPORT", null, null, String.class, "dateTimeFormatReport", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateTimeFormatExcel = cci("DATE_TIME_FORMAT_EXCEL", "DATE_TIME_FORMAT_EXCEL", null, null, String.class, "dateTimeFormatExcel", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateTimeFormatText = cci("DATE_TIME_FORMAT_TEXT", "DATE_TIME_FORMAT_TEXT", null, null, String.class, "dateTimeFormatText", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateFormatDisplay = cci("DATE_FORMAT_DISPLAY", "DATE_FORMAT_DISPLAY", null, null, String.class, "dateFormatDisplay", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateFormatReport = cci("DATE_FORMAT_REPORT", "DATE_FORMAT_REPORT", null, null, String.class, "dateFormatReport", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateFormatExcel = cci("DATE_FORMAT_EXCEL", "DATE_FORMAT_EXCEL", null, null, String.class, "dateFormatExcel", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateFormatText = cci("DATE_FORMAT_TEXT", "DATE_FORMAT_TEXT", null, null, String.class, "dateFormatText", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimeFormatDisplay = cci("TIME_FORMAT_DISPLAY", "TIME_FORMAT_DISPLAY", null, null, String.class, "timeFormatDisplay", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimeFormatReport = cci("TIME_FORMAT_REPORT", "TIME_FORMAT_REPORT", null, null, String.class, "timeFormatReport", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimeFormatExcel = cci("TIME_FORMAT_EXCEL", "TIME_FORMAT_EXCEL", null, null, String.class, "timeFormatExcel", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimeFormatText = cci("TIME_FORMAT_TEXT", "TIME_FORMAT_TEXT", null, null, String.class, "timeFormatText", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberFormatDisplay = cci("NUMBER_FORMAT_DISPLAY", "NUMBER_FORMAT_DISPLAY", null, null, String.class, "numberFormatDisplay", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberFormatReport = cci("NUMBER_FORMAT_REPORT", "NUMBER_FORMAT_REPORT", null, null, String.class, "numberFormatReport", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberFormatExcel = cci("NUMBER_FORMAT_EXCEL", "NUMBER_FORMAT_EXCEL", null, null, String.class, "numberFormatExcel", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberFormatText = cci("NUMBER_FORMAT_TEXT", "NUMBER_FORMAT_TEXT", null, null, String.class, "numberFormatText", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCurrencyFormatReport = cci("CURRENCY_FORMAT_REPORT", "CURRENCY_FORMAT_REPORT", null, null, String.class, "currencyFormatReport", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFontNameExcel = cci("FONT_NAME_EXCEL", "FONT_NAME_EXCEL", null, null, String.class, "fontNameExcel", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFontSizeExcel = cci("FONT_SIZE_EXCEL", "FONT_SIZE_EXCEL", null, null, java.math.BigDecimal.class, "fontSizeExcel", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureId() { return _columnCultureId; }
    /**
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateTimeFormatDisplay() { return _columnDateTimeFormatDisplay; }
    /**
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateTimeFormatReport() { return _columnDateTimeFormatReport; }
    /**
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateTimeFormatExcel() { return _columnDateTimeFormatExcel; }
    /**
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateTimeFormatText() { return _columnDateTimeFormatText; }
    /**
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateFormatDisplay() { return _columnDateFormatDisplay; }
    /**
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateFormatReport() { return _columnDateFormatReport; }
    /**
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateFormatExcel() { return _columnDateFormatExcel; }
    /**
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateFormatText() { return _columnDateFormatText; }
    /**
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeFormatDisplay() { return _columnTimeFormatDisplay; }
    /**
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeFormatReport() { return _columnTimeFormatReport; }
    /**
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeFormatExcel() { return _columnTimeFormatExcel; }
    /**
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeFormatText() { return _columnTimeFormatText; }
    /**
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberFormatDisplay() { return _columnNumberFormatDisplay; }
    /**
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberFormatReport() { return _columnNumberFormatReport; }
    /**
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberFormatExcel() { return _columnNumberFormatExcel; }
    /**
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberFormatText() { return _columnNumberFormatText; }
    /**
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCurrencyFormatReport() { return _columnCurrencyFormatReport; }
    /**
     * FONT_NAME_EXCEL: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFontNameExcel() { return _columnFontNameExcel; }
    /**
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFontSizeExcel() { return _columnFontSizeExcel; }
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
        ls.add(columnDateTimeFormatDisplay());
        ls.add(columnDateTimeFormatReport());
        ls.add(columnDateTimeFormatExcel());
        ls.add(columnDateTimeFormatText());
        ls.add(columnDateFormatDisplay());
        ls.add(columnDateFormatReport());
        ls.add(columnDateFormatExcel());
        ls.add(columnDateFormatText());
        ls.add(columnTimeFormatDisplay());
        ls.add(columnTimeFormatReport());
        ls.add(columnTimeFormatExcel());
        ls.add(columnTimeFormatText());
        ls.add(columnNumberFormatDisplay());
        ls.add(columnNumberFormatReport());
        ls.add(columnNumberFormatExcel());
        ls.add(columnNumberFormatText());
        ls.add(columnCurrencyFormatReport());
        ls.add(columnFontNameExcel());
        ls.add(columnFontSizeExcel());
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

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBCulture() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BCultureDbm.getInstance().columnCultureId());
        return cfi("B_CULTURE_ATTRIBUTE_FK1", "BCulture", this, BCultureDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "BCultureAttributeAsOne", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BCultureAttribute"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BCultureAttributeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BCultureAttributeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BCultureAttribute> getEntityType() { return BCultureAttribute.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BCultureAttribute newEntity() { return new BCultureAttribute(); }
    public BCultureAttribute newMyEntity() { return new BCultureAttribute(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BCultureAttribute)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BCultureAttribute)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
