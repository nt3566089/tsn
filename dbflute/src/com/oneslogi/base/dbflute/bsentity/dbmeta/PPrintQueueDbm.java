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
 * The DB meta of P_PRINT_QUEUE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PPrintQueueDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PPrintQueueDbm _instance = new PPrintQueueDbm();
    private PPrintQueueDbm() {}
    public static PPrintQueueDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getPrintQueueId(), (et, vl) -> ((PPrintQueue)et).setPrintQueueId(ctl(vl)), "printQueueId");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getPrintRequestId(), (et, vl) -> ((PPrintQueue)et).setPrintRequestId(ctl(vl)), "printRequestId");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getPrinterGroupId(), (et, vl) -> ((PPrintQueue)et).setPrinterGroupId(ctl(vl)), "printerGroupId");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getPrintQueueStatus(), (et, vl) -> ((PPrintQueue)et).setPrintQueueStatus((String)vl), "printQueueStatus");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getPrinterNm(), (et, vl) -> ((PPrintQueue)et).setPrinterNm((String)vl), "printerNm");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getTrayNm(), (et, vl) -> ((PPrintQueue)et).setTrayNm((String)vl), "trayNm");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getPrintNum(), (et, vl) -> ((PPrintQueue)et).setPrintNum(ctl(vl)), "printNum");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getSheetCollate(), (et, vl) -> ((PPrintQueue)et).setSheetCollate((String)vl), "sheetCollate");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getDelFlg(), (et, vl) -> ((PPrintQueue)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getVersionNo(), (et, vl) -> ((PPrintQueue)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getControlNo(), (et, vl) -> ((PPrintQueue)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getAddDt(), (et, vl) -> ((PPrintQueue)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getAddUser(), (et, vl) -> ((PPrintQueue)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getAddProcess(), (et, vl) -> ((PPrintQueue)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getUpdDt(), (et, vl) -> ((PPrintQueue)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getUpdUser(), (et, vl) -> ((PPrintQueue)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PPrintQueue)et).getUpdProcess(), (et, vl) -> ((PPrintQueue)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PPrintQueue)et).getPPrintRequest(), (et, vl) -> ((PPrintQueue)et).setPPrintRequest((PPrintRequest)vl), "PPrintRequest");
        setupEfpg(_efpgMap, et -> ((PPrintQueue)et).getBClassDtlByPrintQueueStatus(), (et, vl) -> ((PPrintQueue)et).setBClassDtlByPrintQueueStatus((BClassDtl)vl), "BClassDtlByPrintQueueStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_PRINT_QUEUE";
    protected final String _tableDispName = "P_PRINT_QUEUE";
    protected final String _tablePropertyName = "PPrintQueue";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_PRINT_QUEUE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrintQueueId = cci("PRINT_QUEUE_ID", "PRINT_QUEUE_ID", null, null, Long.class, "printQueueId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintRequestId = cci("PRINT_REQUEST_ID", "PRINT_REQUEST_ID", null, null, Long.class, "printRequestId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PPrintRequest", null, null, false);
    protected final ColumnInfo _columnPrinterGroupId = cci("PRINTER_GROUP_ID", "PRINTER_GROUP_ID", null, null, Long.class, "printerGroupId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintQueueStatus = cci("PRINT_QUEUE_STATUS", "PRINT_QUEUE_STATUS", null, null, String.class, "printQueueStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPrintQueueStatus", null, CDef.DefMeta.PrintQueueStatus, false);
    protected final ColumnInfo _columnPrinterNm = cci("PRINTER_NM", "PRINTER_NM", null, null, String.class, "printerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrayNm = cci("TRAY_NM", "TRAY_NM", null, null, String.class, "trayNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintNum = cci("PRINT_NUM", "PRINT_NUM", null, null, Long.class, "printNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSheetCollate = cci("SHEET_COLLATE", "SHEET_COLLATE", null, null, String.class, "sheetCollate", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintQueueId() { return _columnPrintQueueId; }
    /**
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintRequestId() { return _columnPrintRequestId; }
    /**
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupId() { return _columnPrinterGroupId; }
    /**
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintQueueStatus() { return _columnPrintQueueStatus; }
    /**
     * PRINTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterNm() { return _columnPrinterNm; }
    /**
     * TRAY_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrayNm() { return _columnTrayNm; }
    /**
     * PRINT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintNum() { return _columnPrintNum; }
    /**
     * SHEET_COLLATE: {char(1)}
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
        ls.add(columnPrintQueueId());
        ls.add(columnPrintRequestId());
        ls.add(columnPrinterGroupId());
        ls.add(columnPrintQueueStatus());
        ls.add(columnPrinterNm());
        ls.add(columnTrayNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrintQueueId()); }
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
     * P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrintRequest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintRequestId(), PPrintRequestDbm.getInstance().columnPrintRequestId());
        return cfi("P_PRINT_QUEUE_FK1", "PPrintRequest", this, PPrintRequestDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "PPrintQueueList", false);
    }
    /**
     * B_CLASS_DTL by my PRINT_QUEUE_STATUS, named 'BClassDtlByPrintQueueStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPrintQueueStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintQueueStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINT_QUEUE_PRINT_QUEUE_STATUS", "BClassDtlByPrintQueueStatus", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRINT_QUEUE_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PPrintQueue"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PPrintQueueCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PPrintQueueBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PPrintQueue> getEntityType() { return PPrintQueue.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PPrintQueue newEntity() { return new PPrintQueue(); }
    public PPrintQueue newMyEntity() { return new PPrintQueue(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PPrintQueue)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PPrintQueue)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
