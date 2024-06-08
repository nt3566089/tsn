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
 * The DB meta of P_PRINTER_ATTRIBUTE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterAttributeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PPrinterAttributeDbm _instance = new PPrinterAttributeDbm();
    private PPrinterAttributeDbm() {}
    public static PPrinterAttributeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getPrinterAttributeId(), (et, vl) -> ((PPrinterAttribute)et).setPrinterAttributeId(ctl(vl)), "printerAttributeId");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getPrinterId(), (et, vl) -> ((PPrinterAttribute)et).setPrinterId(ctl(vl)), "printerId");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getTrayNm(), (et, vl) -> ((PPrinterAttribute)et).setTrayNm((String)vl), "trayNm");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getVisible(), (et, vl) -> ((PPrinterAttribute)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getAddTerminal(), (et, vl) -> ((PPrinterAttribute)et).setAddTerminal((String)vl), "addTerminal");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getUpdTerminal(), (et, vl) -> ((PPrinterAttribute)et).setUpdTerminal((String)vl), "updTerminal");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getDelFlg(), (et, vl) -> ((PPrinterAttribute)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getVersionNo(), (et, vl) -> ((PPrinterAttribute)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getControlNo(), (et, vl) -> ((PPrinterAttribute)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getAddDt(), (et, vl) -> ((PPrinterAttribute)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getAddUser(), (et, vl) -> ((PPrinterAttribute)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getAddProcess(), (et, vl) -> ((PPrinterAttribute)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getUpdDt(), (et, vl) -> ((PPrinterAttribute)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getUpdUser(), (et, vl) -> ((PPrinterAttribute)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PPrinterAttribute)et).getUpdProcess(), (et, vl) -> ((PPrinterAttribute)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PPrinterAttribute)et).getPPrinter(), (et, vl) -> ((PPrinterAttribute)et).setPPrinter((PPrinter)vl), "PPrinter");
        setupEfpg(_efpgMap, et -> ((PPrinterAttribute)et).getBClassDtlByVisible(), (et, vl) -> ((PPrinterAttribute)et).setBClassDtlByVisible((BClassDtl)vl), "BClassDtlByVisible");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_PRINTER_ATTRIBUTE";
    protected final String _tableDispName = "P_PRINTER_ATTRIBUTE";
    protected final String _tablePropertyName = "PPrinterAttribute";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_PRINTER_ATTRIBUTE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrinterAttributeId = cci("PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", null, null, Long.class, "printerAttributeId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "PLayoutPrintSettingList,PUserAutoPrintSettingByPrinterAttributeIdList,PTerminalAutoPrintSetByPrinterAttributeIdList", null, false);
    protected final ColumnInfo _columnPrinterId = cci("PRINTER_ID", "PRINTER_ID", null, null, Long.class, "printerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PPrinter", null, null, false);
    protected final ColumnInfo _columnTrayNm = cci("TRAY_NM", "TRAY_NM", null, null, String.class, "trayNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVisible = cci("VISIBLE", "VISIBLE", null, null, String.class, "visible", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByVisible", null, CDef.DefMeta.Visible, false);
    protected final ColumnInfo _columnAddTerminal = cci("ADD_TERMINAL", "ADD_TERMINAL", null, null, String.class, "addTerminal", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTerminal = cci("UPD_TERMINAL", "UPD_TERMINAL", null, null, String.class, "updTerminal", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterAttributeId() { return _columnPrinterAttributeId; }
    /**
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterId() { return _columnPrinterId; }
    /**
     * TRAY_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrayNm() { return _columnTrayNm; }
    /**
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVisible() { return _columnVisible; }
    /**
     * ADD_TERMINAL: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddTerminal() { return _columnAddTerminal; }
    /**
     * UPD_TERMINAL: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdTerminal() { return _columnUpdTerminal; }
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
        ls.add(columnPrinterAttributeId());
        ls.add(columnPrinterId());
        ls.add(columnTrayNm());
        ls.add(columnVisible());
        ls.add(columnAddTerminal());
        ls.add(columnUpdTerminal());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrinterAttributeId()); }
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
     * P_PRINTER by my PRINTER_ID, named 'PPrinter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterId(), PPrinterDbm.getInstance().columnPrinterId());
        return cfi("P_PRINTER_ATTRIBUTE_FK1", "PPrinter", this, PPrinterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "PPrinterAttributeList", false);
    }
    /**
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByVisible() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVisible(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINTER_ATTRIBUTE_VISIBLE", "BClassDtlByVisible", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'VISIBLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * P_LAYOUT_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PLayoutPrintSettingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPLayoutPrintSettingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterAttributeId(), PLayoutPrintSettingDbm.getInstance().columnPrinterAttributeId());
        return cri("P_LAYOUT_PRINT_SETTING_FK1", "PLayoutPrintSettingList", this, PLayoutPrintSettingDbm.getInstance(), mp, false, "PPrinterAttribute");
    }
    /**
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PUserAutoPrintSettingByPrinterAttributeIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPUserAutoPrintSettingByPrinterAttributeIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterAttributeId(), PUserAutoPrintSettingDbm.getInstance().columnPrinterAttributeId());
        return cri("FK_P_USER_AUTO_PRINT_SETTING_TO_P_PRINTER_ATTRIBUTE_BY_P_PRINTER_ATTRIBUTE_ID", "PUserAutoPrintSettingByPrinterAttributeIdList", this, PUserAutoPrintSettingDbm.getInstance(), mp, false, "PPrinterAttributeByPrinterAttributeId");
    }
    /**
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ATTRIBUTE_ID, named 'PTerminalAutoPrintSetByPrinterAttributeIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPTerminalAutoPrintSetByPrinterAttributeIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterAttributeId(), PTerminalAutoPrintSetDbm.getInstance().columnPrinterAttributeId());
        return cri("FK_P_TERMINAL_AUTO_PRINT_SET_TO_P_PRINTER_ATTRIBUTE_BY_P_PRINTER_ATTRIBUTE_ID", "PTerminalAutoPrintSetByPrinterAttributeIdList", this, PTerminalAutoPrintSetDbm.getInstance(), mp, false, "PPrinterAttributeByPrinterAttributeId");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PPrinterAttribute"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PPrinterAttributeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PPrinterAttributeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PPrinterAttribute> getEntityType() { return PPrinterAttribute.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PPrinterAttribute newEntity() { return new PPrinterAttribute(); }
    public PPrinterAttribute newMyEntity() { return new PPrinterAttribute(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PPrinterAttribute)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PPrinterAttribute)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
