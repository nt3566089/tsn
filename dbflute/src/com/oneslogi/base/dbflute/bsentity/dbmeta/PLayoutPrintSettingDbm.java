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
 * The DB meta of P_LAYOUT_PRINT_SETTING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PLayoutPrintSettingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PLayoutPrintSettingDbm _instance = new PLayoutPrintSettingDbm();
    private PLayoutPrintSettingDbm() {}
    public static PLayoutPrintSettingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getLayoutPrintSettingId(), (et, vl) -> ((PLayoutPrintSetting)et).setLayoutPrintSettingId(ctl(vl)), "layoutPrintSettingId");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getReportLayoutId(), (et, vl) -> ((PLayoutPrintSetting)et).setReportLayoutId(ctl(vl)), "reportLayoutId");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getPrinterGroupId(), (et, vl) -> ((PLayoutPrintSetting)et).setPrinterGroupId(ctl(vl)), "printerGroupId");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getPrinterId(), (et, vl) -> ((PLayoutPrintSetting)et).setPrinterId(ctl(vl)), "printerId");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getPrinterAttributeId(), (et, vl) -> ((PLayoutPrintSetting)et).setPrinterAttributeId(ctl(vl)), "printerAttributeId");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getPrintNum(), (et, vl) -> ((PLayoutPrintSetting)et).setPrintNum(ctl(vl)), "printNum");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getSheetCollate(), (et, vl) -> ((PLayoutPrintSetting)et).setSheetCollate((String)vl), "sheetCollate");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getDelFlg(), (et, vl) -> ((PLayoutPrintSetting)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getVersionNo(), (et, vl) -> ((PLayoutPrintSetting)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getControlNo(), (et, vl) -> ((PLayoutPrintSetting)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getAddDt(), (et, vl) -> ((PLayoutPrintSetting)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getAddUser(), (et, vl) -> ((PLayoutPrintSetting)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getAddProcess(), (et, vl) -> ((PLayoutPrintSetting)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getUpdDt(), (et, vl) -> ((PLayoutPrintSetting)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getUpdUser(), (et, vl) -> ((PLayoutPrintSetting)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PLayoutPrintSetting)et).getUpdProcess(), (et, vl) -> ((PLayoutPrintSetting)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PLayoutPrintSetting)et).getPPrinterAttribute(), (et, vl) -> ((PLayoutPrintSetting)et).setPPrinterAttribute((PPrinterAttribute)vl), "PPrinterAttribute");
        setupEfpg(_efpgMap, et -> ((PLayoutPrintSetting)et).getPPrinterGroup(), (et, vl) -> ((PLayoutPrintSetting)et).setPPrinterGroup((PPrinterGroup)vl), "PPrinterGroup");
        setupEfpg(_efpgMap, et -> ((PLayoutPrintSetting)et).getPPrinter(), (et, vl) -> ((PLayoutPrintSetting)et).setPPrinter((PPrinter)vl), "PPrinter");
        setupEfpg(_efpgMap, et -> ((PLayoutPrintSetting)et).getPReportLayout(), (et, vl) -> ((PLayoutPrintSetting)et).setPReportLayout((PReportLayout)vl), "PReportLayout");
        setupEfpg(_efpgMap, et -> ((PLayoutPrintSetting)et).getBClassDtlBySheetCollate(), (et, vl) -> ((PLayoutPrintSetting)et).setBClassDtlBySheetCollate((BClassDtl)vl), "BClassDtlBySheetCollate");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_LAYOUT_PRINT_SETTING";
    protected final String _tableDispName = "P_LAYOUT_PRINT_SETTING";
    protected final String _tablePropertyName = "PLayoutPrintSetting";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_LAYOUT_PRINT_SETTING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLayoutPrintSettingId = cci("LAYOUT_PRINT_SETTING_ID", "LAYOUT_PRINT_SETTING_ID", null, null, Long.class, "layoutPrintSettingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportLayoutId = cci("REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", null, null, Long.class, "reportLayoutId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PReportLayout", null, null, false);
    protected final ColumnInfo _columnPrinterGroupId = cci("PRINTER_GROUP_ID", "PRINTER_GROUP_ID", null, null, Long.class, "printerGroupId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinterGroup", null, null, false);
    protected final ColumnInfo _columnPrinterId = cci("PRINTER_ID", "PRINTER_ID", null, null, Long.class, "printerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinter", null, null, false);
    protected final ColumnInfo _columnPrinterAttributeId = cci("PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", null, null, Long.class, "printerAttributeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinterAttribute", null, null, false);
    protected final ColumnInfo _columnPrintNum = cci("PRINT_NUM", "PRINT_NUM", null, null, Long.class, "printNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSheetCollate = cci("SHEET_COLLATE", "SHEET_COLLATE", null, null, String.class, "sheetCollate", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySheetCollate", null, CDef.DefMeta.SheetCollate, false);
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
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLayoutPrintSettingId() { return _columnLayoutPrintSettingId; }
    /**
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
     * PRINT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintNum() { return _columnPrintNum; }
    /**
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSheetCollate() { return _columnSheetCollate; }
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
        ls.add(columnLayoutPrintSettingId());
        ls.add(columnReportLayoutId());
        ls.add(columnPrinterGroupId());
        ls.add(columnPrinterId());
        ls.add(columnPrinterAttributeId());
        ls.add(columnPrintNum());
        ls.add(columnSheetCollate());
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
    protected UniqueInfo cpui() { return hpcpui(columnLayoutPrintSettingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnReportLayoutId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterAttribute() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterAttributeId(), PPrinterAttributeDbm.getInstance().columnPrinterAttributeId());
        return cfi("P_LAYOUT_PRINT_SETTING_FK1", "PPrinterAttribute", this, PPrinterAttributeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "PLayoutPrintSettingList", false);
    }
    /**
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterGroup() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterGroupId(), PPrinterGroupDbm.getInstance().columnPrinterGroupId());
        return cfi("P_LAYOUT_PRINT_SETTING_FK2", "PPrinterGroup", this, PPrinterGroupDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "PLayoutPrintSettingList", false);
    }
    /**
     * P_PRINTER by my PRINTER_ID, named 'PPrinter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterId(), PPrinterDbm.getInstance().columnPrinterId());
        return cfi("P_LAYOUT_PRINT_SETTING_FK3", "PPrinter", this, PPrinterDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "PLayoutPrintSettingList", false);
    }
    /**
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPReportLayout() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PReportLayoutDbm.getInstance().columnReportLayoutId());
        return cfi("P_LAYOUT_PRINT_SETTING_FK4", "PReportLayout", this, PReportLayoutDbm.getInstance(), mp, 3, null, true, false, false, false, null, null, false, "PLayoutPrintSettingAsOne", false);
    }
    /**
     * B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySheetCollate() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSheetCollate(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_LAYOUT_PRINT_SETTING_SHEET_COLLATE", "BClassDtlBySheetCollate", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SHEET_COLLATE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PLayoutPrintSetting"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PLayoutPrintSettingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PLayoutPrintSettingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PLayoutPrintSetting> getEntityType() { return PLayoutPrintSetting.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PLayoutPrintSetting newEntity() { return new PLayoutPrintSetting(); }
    public PLayoutPrintSetting newMyEntity() { return new PLayoutPrintSetting(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PLayoutPrintSetting)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PLayoutPrintSetting)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
