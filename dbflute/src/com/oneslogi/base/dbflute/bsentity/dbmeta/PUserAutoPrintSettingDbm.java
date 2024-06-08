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
 * The DB meta of P_USER_AUTO_PRINT_SETTING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PUserAutoPrintSettingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PUserAutoPrintSettingDbm _instance = new PUserAutoPrintSettingDbm();
    private PUserAutoPrintSettingDbm() {}
    public static PUserAutoPrintSettingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getUserAutoPrintSettingId(), (et, vl) -> ((PUserAutoPrintSetting)et).setUserAutoPrintSettingId(ctl(vl)), "userAutoPrintSettingId");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getUserId(), (et, vl) -> ((PUserAutoPrintSetting)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getReportLayoutId(), (et, vl) -> ((PUserAutoPrintSetting)et).setReportLayoutId(ctl(vl)), "reportLayoutId");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getPrinterGroupId(), (et, vl) -> ((PUserAutoPrintSetting)et).setPrinterGroupId(ctl(vl)), "printerGroupId");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getPrinterId(), (et, vl) -> ((PUserAutoPrintSetting)et).setPrinterId(ctl(vl)), "printerId");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getPrinterAttributeId(), (et, vl) -> ((PUserAutoPrintSetting)et).setPrinterAttributeId(ctl(vl)), "printerAttributeId");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getDelFlg(), (et, vl) -> ((PUserAutoPrintSetting)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getVersionNo(), (et, vl) -> ((PUserAutoPrintSetting)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getControlNo(), (et, vl) -> ((PUserAutoPrintSetting)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getAddDt(), (et, vl) -> ((PUserAutoPrintSetting)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getAddUser(), (et, vl) -> ((PUserAutoPrintSetting)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getAddProcess(), (et, vl) -> ((PUserAutoPrintSetting)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getUpdDt(), (et, vl) -> ((PUserAutoPrintSetting)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getUpdUser(), (et, vl) -> ((PUserAutoPrintSetting)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PUserAutoPrintSetting)et).getUpdProcess(), (et, vl) -> ((PUserAutoPrintSetting)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PUserAutoPrintSetting)et).getPReportLayoutByReportLayoutId(), (et, vl) -> ((PUserAutoPrintSetting)et).setPReportLayoutByReportLayoutId((PReportLayout)vl), "PReportLayoutByReportLayoutId");
        setupEfpg(_efpgMap, et -> ((PUserAutoPrintSetting)et).getPPrinterGroupByPrinterGroupId(), (et, vl) -> ((PUserAutoPrintSetting)et).setPPrinterGroupByPrinterGroupId((PPrinterGroup)vl), "PPrinterGroupByPrinterGroupId");
        setupEfpg(_efpgMap, et -> ((PUserAutoPrintSetting)et).getPPrinterByPrinterId(), (et, vl) -> ((PUserAutoPrintSetting)et).setPPrinterByPrinterId((PPrinter)vl), "PPrinterByPrinterId");
        setupEfpg(_efpgMap, et -> ((PUserAutoPrintSetting)et).getPPrinterAttributeByPrinterAttributeId(), (et, vl) -> ((PUserAutoPrintSetting)et).setPPrinterAttributeByPrinterAttributeId((PPrinterAttribute)vl), "PPrinterAttributeByPrinterAttributeId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_USER_AUTO_PRINT_SETTING";
    protected final String _tableDispName = "P_USER_AUTO_PRINT_SETTING";
    protected final String _tablePropertyName = "PUserAutoPrintSetting";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_USER_AUTO_PRINT_SETTING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserAutoPrintSettingId = cci("USER_AUTO_PRINT_SETTING_ID", "USER_AUTO_PRINT_SETTING_ID", null, null, Long.class, "userAutoPrintSettingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportLayoutId = cci("REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", null, null, Long.class, "reportLayoutId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PReportLayoutByReportLayoutId", null, null, false);
    protected final ColumnInfo _columnPrinterGroupId = cci("PRINTER_GROUP_ID", "PRINTER_GROUP_ID", null, null, Long.class, "printerGroupId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinterGroupByPrinterGroupId", null, null, false);
    protected final ColumnInfo _columnPrinterId = cci("PRINTER_ID", "PRINTER_ID", null, null, Long.class, "printerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinterByPrinterId", null, null, false);
    protected final ColumnInfo _columnPrinterAttributeId = cci("PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", null, null, Long.class, "printerAttributeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinterAttributeByPrinterAttributeId", null, null, false);
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
     * USER_AUTO_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserAutoPrintSettingId() { return _columnUserAutoPrintSettingId; }
    /**
     * USER_ID: {UQ+, IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutId() { return _columnReportLayoutId; }
    /**
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupId() { return _columnPrinterGroupId; }
    /**
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterId() { return _columnPrinterId; }
    /**
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
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
        ls.add(columnUserAutoPrintSettingId());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserAutoPrintSettingId()); }
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
    /**
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPReportLayoutByReportLayoutId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PReportLayoutDbm.getInstance().columnReportLayoutId());
        return cfi("FK_P_USER_AUTO_PRINT_SETTING_TO_P_REPORT_LAYOUT_BY_REPORT_LAYOUT_ID", "PReportLayoutByReportLayoutId", this, PReportLayoutDbm.getInstance(), mp, 0, null, false, false, false, true, null, null, false, "PUserAutoPrintSettingByReportLayoutIdList", false);
    }
    /**
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterGroupByPrinterGroupId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterGroupId(), PPrinterGroupDbm.getInstance().columnPrinterGroupId());
        return cfi("FK_P_USER_AUTO_PRINT_SETTING_TO_P_PRINTER_GROUP_BY_P_PRINTER_GROUP_ID", "PPrinterGroupByPrinterGroupId", this, PPrinterGroupDbm.getInstance(), mp, 1, null, false, false, false, true, null, null, false, "PUserAutoPrintSettingByPrinterGroupIdList", false);
    }
    /**
     * P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterByPrinterId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterId(), PPrinterDbm.getInstance().columnPrinterId());
        return cfi("FK_P_USER_AUTO_PRINT_SETTING_TO_P_PRINTER_BY_P_PRINTER_ID", "PPrinterByPrinterId", this, PPrinterDbm.getInstance(), mp, 2, null, false, false, false, true, null, null, false, "PUserAutoPrintSettingByPrinterIdList", false);
    }
    /**
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterAttributeByPrinterAttributeId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterAttributeId(), PPrinterAttributeDbm.getInstance().columnPrinterAttributeId());
        return cfi("FK_P_USER_AUTO_PRINT_SETTING_TO_P_PRINTER_ATTRIBUTE_BY_P_PRINTER_ATTRIBUTE_ID", "PPrinterAttributeByPrinterAttributeId", this, PPrinterAttributeDbm.getInstance(), mp, 3, null, false, false, false, true, null, null, false, "PUserAutoPrintSettingByPrinterAttributeIdList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PUserAutoPrintSetting"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PUserAutoPrintSettingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PUserAutoPrintSettingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PUserAutoPrintSetting> getEntityType() { return PUserAutoPrintSetting.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PUserAutoPrintSetting newEntity() { return new PUserAutoPrintSetting(); }
    public PUserAutoPrintSetting newMyEntity() { return new PUserAutoPrintSetting(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PUserAutoPrintSetting)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PUserAutoPrintSetting)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
