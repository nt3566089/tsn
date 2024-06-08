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
 * The DB meta of P_USER_PRINT_SETTING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PUserPrintSettingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PUserPrintSettingDbm _instance = new PUserPrintSettingDbm();
    private PUserPrintSettingDbm() {}
    public static PUserPrintSettingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getUserPrintSettingId(), (et, vl) -> ((PUserPrintSetting)et).setUserPrintSettingId(ctl(vl)), "userPrintSettingId");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getUserId(), (et, vl) -> ((PUserPrintSetting)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getReportLayoutId(), (et, vl) -> ((PUserPrintSetting)et).setReportLayoutId(ctl(vl)), "reportLayoutId");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getPrinterGroupId(), (et, vl) -> ((PUserPrintSetting)et).setPrinterGroupId(ctl(vl)), "printerGroupId");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getPrinterId(), (et, vl) -> ((PUserPrintSetting)et).setPrinterId(ctl(vl)), "printerId");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getPrinterAttributeId(), (et, vl) -> ((PUserPrintSetting)et).setPrinterAttributeId(ctl(vl)), "printerAttributeId");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getDelFlg(), (et, vl) -> ((PUserPrintSetting)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getVersionNo(), (et, vl) -> ((PUserPrintSetting)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getControlNo(), (et, vl) -> ((PUserPrintSetting)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getAddDt(), (et, vl) -> ((PUserPrintSetting)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getAddUser(), (et, vl) -> ((PUserPrintSetting)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getAddProcess(), (et, vl) -> ((PUserPrintSetting)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getUpdDt(), (et, vl) -> ((PUserPrintSetting)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getUpdUser(), (et, vl) -> ((PUserPrintSetting)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PUserPrintSetting)et).getUpdProcess(), (et, vl) -> ((PUserPrintSetting)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_USER_PRINT_SETTING";
    protected final String _tableDispName = "P_USER_PRINT_SETTING";
    protected final String _tablePropertyName = "PUserPrintSetting";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_USER_PRINT_SETTING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserPrintSettingId = cci("USER_PRINT_SETTING_ID", "USER_PRINT_SETTING_ID", null, null, Long.class, "userPrintSettingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportLayoutId = cci("REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", null, null, Long.class, "reportLayoutId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterGroupId = cci("PRINTER_GROUP_ID", "PRINTER_GROUP_ID", null, null, Long.class, "printerGroupId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterId = cci("PRINTER_ID", "PRINTER_ID", null, null, Long.class, "printerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterAttributeId = cci("PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", null, null, Long.class, "printerAttributeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * USER_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserPrintSettingId() { return _columnUserPrintSettingId; }
    /**
     * USER_ID: {UQ+, IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutId() { return _columnReportLayoutId; }
    /**
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupId() { return _columnPrinterGroupId; }
    /**
     * PRINTER_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterId() { return _columnPrinterId; }
    /**
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterAttributeId() { return _columnPrinterAttributeId; }
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
        ls.add(columnUserPrintSettingId());
        ls.add(columnUserId());
        ls.add(columnReportLayoutId());
        ls.add(columnPrinterGroupId());
        ls.add(columnPrinterId());
        ls.add(columnPrinterAttributeId());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserPrintSettingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnUserId());
        ls.add(columnReportLayoutId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PUserPrintSetting"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PUserPrintSettingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PUserPrintSettingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PUserPrintSetting> getEntityType() { return PUserPrintSetting.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PUserPrintSetting newEntity() { return new PUserPrintSetting(); }
    public PUserPrintSetting newMyEntity() { return new PUserPrintSetting(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PUserPrintSetting)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PUserPrintSetting)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
