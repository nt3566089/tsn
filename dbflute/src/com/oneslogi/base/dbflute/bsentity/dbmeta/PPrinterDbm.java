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
 * The DB meta of P_PRINTER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PPrinterDbm _instance = new PPrinterDbm();
    private PPrinterDbm() {}
    public static PPrinterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PPrinter)et).getPrinterId(), (et, vl) -> ((PPrinter)et).setPrinterId(ctl(vl)), "printerId");
        setupEpg(_epgMap, et -> ((PPrinter)et).getPrinterGroupId(), (et, vl) -> ((PPrinter)et).setPrinterGroupId(ctl(vl)), "printerGroupId");
        setupEpg(_epgMap, et -> ((PPrinter)et).getPrinterNm(), (et, vl) -> ((PPrinter)et).setPrinterNm((String)vl), "printerNm");
        setupEpg(_epgMap, et -> ((PPrinter)et).getVisible(), (et, vl) -> ((PPrinter)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((PPrinter)et).getAddTerminal(), (et, vl) -> ((PPrinter)et).setAddTerminal((String)vl), "addTerminal");
        setupEpg(_epgMap, et -> ((PPrinter)et).getUpdTerminal(), (et, vl) -> ((PPrinter)et).setUpdTerminal((String)vl), "updTerminal");
        setupEpg(_epgMap, et -> ((PPrinter)et).getDelFlg(), (et, vl) -> ((PPrinter)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PPrinter)et).getVersionNo(), (et, vl) -> ((PPrinter)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PPrinter)et).getControlNo(), (et, vl) -> ((PPrinter)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PPrinter)et).getAddDt(), (et, vl) -> ((PPrinter)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PPrinter)et).getAddUser(), (et, vl) -> ((PPrinter)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PPrinter)et).getAddProcess(), (et, vl) -> ((PPrinter)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PPrinter)et).getUpdDt(), (et, vl) -> ((PPrinter)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PPrinter)et).getUpdUser(), (et, vl) -> ((PPrinter)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PPrinter)et).getUpdProcess(), (et, vl) -> ((PPrinter)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PPrinter)et).getPPrinterGroup(), (et, vl) -> ((PPrinter)et).setPPrinterGroup((PPrinterGroup)vl), "PPrinterGroup");
        setupEfpg(_efpgMap, et -> ((PPrinter)et).getBClassDtlByVisible(), (et, vl) -> ((PPrinter)et).setBClassDtlByVisible((BClassDtl)vl), "BClassDtlByVisible");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_PRINTER";
    protected final String _tableDispName = "P_PRINTER";
    protected final String _tablePropertyName = "PPrinter";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_PRINTER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrinterId = cci("PRINTER_ID", "PRINTER_ID", null, null, Long.class, "printerId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "PLayoutPrintSettingList,PPrinterAttributeList,PUserAutoPrintSettingByPrinterIdList,PTerminalAutoPrintSetByPrinterIdList", null, false);
    protected final ColumnInfo _columnPrinterGroupId = cci("PRINTER_GROUP_ID", "PRINTER_GROUP_ID", null, null, Long.class, "printerGroupId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PPrinterGroup", null, null, false);
    protected final ColumnInfo _columnPrinterNm = cci("PRINTER_NM", "PRINTER_NM", null, null, String.class, "printerNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * PRINTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterId() { return _columnPrinterId; }
    /**
     * PRINTER_GROUP_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINTER_GROUP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupId() { return _columnPrinterGroupId; }
    /**
     * PRINTER_NM: {+UQ, NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterNm() { return _columnPrinterNm; }
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
        ls.add(columnPrinterId());
        ls.add(columnPrinterGroupId());
        ls.add(columnPrinterNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrinterId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPrinterGroupId());
        ls.add(columnPrinterNm());
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
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterGroup() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterGroupId(), PPrinterGroupDbm.getInstance().columnPrinterGroupId());
        return cfi("P_PRINTER_FK1", "PPrinterGroup", this, PPrinterGroupDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "PPrinterList", false);
    }
    /**
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByVisible() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVisible(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINTER_VISIBLE", "BClassDtlByVisible", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'VISIBLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * P_LAYOUT_PRINT_SETTING by PRINTER_ID, named 'PLayoutPrintSettingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPLayoutPrintSettingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterId(), PLayoutPrintSettingDbm.getInstance().columnPrinterId());
        return cri("P_LAYOUT_PRINT_SETTING_FK3", "PLayoutPrintSettingList", this, PLayoutPrintSettingDbm.getInstance(), mp, false, "PPrinter");
    }
    /**
     * P_PRINTER_ATTRIBUTE by PRINTER_ID, named 'PPrinterAttributeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPPrinterAttributeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterId(), PPrinterAttributeDbm.getInstance().columnPrinterId());
        return cri("P_PRINTER_ATTRIBUTE_FK1", "PPrinterAttributeList", this, PPrinterAttributeDbm.getInstance(), mp, false, "PPrinter");
    }
    /**
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ID, named 'PUserAutoPrintSettingByPrinterIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPUserAutoPrintSettingByPrinterIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterId(), PUserAutoPrintSettingDbm.getInstance().columnPrinterId());
        return cri("FK_P_USER_AUTO_PRINT_SETTING_TO_P_PRINTER_BY_P_PRINTER_ID", "PUserAutoPrintSettingByPrinterIdList", this, PUserAutoPrintSettingDbm.getInstance(), mp, false, "PPrinterByPrinterId");
    }
    /**
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ID, named 'PTerminalAutoPrintSetByPrinterIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPTerminalAutoPrintSetByPrinterIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterId(), PTerminalAutoPrintSetDbm.getInstance().columnPrinterId());
        return cri("FK_P_TERMINAL_AUTO_PRINT_SET_TO_P_PRINTER_BY_P_PRINTER_ID", "PTerminalAutoPrintSetByPrinterIdList", this, PTerminalAutoPrintSetDbm.getInstance(), mp, false, "PPrinterByPrinterId");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PPrinter"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PPrinterCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PPrinterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PPrinter> getEntityType() { return PPrinter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PPrinter newEntity() { return new PPrinter(); }
    public PPrinter newMyEntity() { return new PPrinter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PPrinter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PPrinter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
