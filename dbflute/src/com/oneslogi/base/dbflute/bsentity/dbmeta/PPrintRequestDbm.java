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
 * The DB meta of P_PRINT_REQUEST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PPrintRequestDbm _instance = new PPrintRequestDbm();
    private PPrintRequestDbm() {}
    public static PPrintRequestDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrintRequestId(), (et, vl) -> ((PPrintRequest)et).setPrintRequestId(ctl(vl)), "printRequestId");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getReportCd(), (et, vl) -> ((PPrintRequest)et).setReportCd((String)vl), "reportCd");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getReportNm(), (et, vl) -> ((PPrintRequest)et).setReportNm((String)vl), "reportNm");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getReportLayoutNm(), (et, vl) -> ((PPrintRequest)et).setReportLayoutNm((String)vl), "reportLayoutNm");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrinterGroupId(), (et, vl) -> ((PPrintRequest)et).setPrinterGroupId(ctl(vl)), "printerGroupId");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrinterGroupNm(), (et, vl) -> ((PPrintRequest)et).setPrinterGroupNm((String)vl), "printerGroupNm");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrinterNm(), (et, vl) -> ((PPrintRequest)et).setPrinterNm((String)vl), "printerNm");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getTrayNm(), (et, vl) -> ((PPrintRequest)et).setTrayNm((String)vl), "trayNm");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrintNum(), (et, vl) -> ((PPrintRequest)et).setPrintNum(ctl(vl)), "printNum");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getDocumentPageSize(), (et, vl) -> ((PPrintRequest)et).setDocumentPageSize(ctl(vl)), "documentPageSize");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getSheetCollate(), (et, vl) -> ((PPrintRequest)et).setSheetCollate((String)vl), "sheetCollate");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrintStatus(), (et, vl) -> ((PPrintRequest)et).setPrintStatus((String)vl), "printStatus");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getFirstPrintDt(), (et, vl) -> ((PPrintRequest)et).setFirstPrintDt(cttp(vl)), "firstPrintDt");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getLatestPrintDt(), (et, vl) -> ((PPrintRequest)et).setLatestPrintDt(cttp(vl)), "latestPrintDt");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrintedCount(), (et, vl) -> ((PPrintRequest)et).setPrintedCount(ctl(vl)), "printedCount");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrintedFlg(), (et, vl) -> ((PPrintRequest)et).setPrintedFlg((String)vl), "printedFlg");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getQueueAddDt(), (et, vl) -> ((PPrintRequest)et).setQueueAddDt(cttp(vl)), "queueAddDt");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getPrintDataType(), (et, vl) -> ((PPrintRequest)et).setPrintDataType((String)vl), "printDataType");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getDelFlg(), (et, vl) -> ((PPrintRequest)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getVersionNo(), (et, vl) -> ((PPrintRequest)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getControlNo(), (et, vl) -> ((PPrintRequest)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getAddDt(), (et, vl) -> ((PPrintRequest)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getAddUser(), (et, vl) -> ((PPrintRequest)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getAddProcess(), (et, vl) -> ((PPrintRequest)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getUpdDt(), (et, vl) -> ((PPrintRequest)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getUpdUser(), (et, vl) -> ((PPrintRequest)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PPrintRequest)et).getUpdProcess(), (et, vl) -> ((PPrintRequest)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PPrintRequest)et).getBClassDtlByPrintStatus(), (et, vl) -> ((PPrintRequest)et).setBClassDtlByPrintStatus((BClassDtl)vl), "BClassDtlByPrintStatus");
        setupEfpg(_efpgMap, et -> ((PPrintRequest)et).getBClassDtlBySheetCollate(), (et, vl) -> ((PPrintRequest)et).setBClassDtlBySheetCollate((BClassDtl)vl), "BClassDtlBySheetCollate");
        setupEfpg(_efpgMap, et -> ((PPrintRequest)et).getBClassDtlByPrintedFlg(), (et, vl) -> ((PPrintRequest)et).setBClassDtlByPrintedFlg((BClassDtl)vl), "BClassDtlByPrintedFlg");
        setupEfpg(_efpgMap, et -> ((PPrintRequest)et).getBClassDtlByPrintDataType(), (et, vl) -> ((PPrintRequest)et).setBClassDtlByPrintDataType((BClassDtl)vl), "BClassDtlByPrintDataType");
        setupEfpg(_efpgMap, et -> ((PPrintRequest)et).getPPrintRequestDataAsOne(), (et, vl) -> ((PPrintRequest)et).setPPrintRequestDataAsOne((PPrintRequestData)vl), "PPrintRequestDataAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_PRINT_REQUEST";
    protected final String _tableDispName = "P_PRINT_REQUEST";
    protected final String _tablePropertyName = "PPrintRequest";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_PRINT_REQUEST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrintRequestId = cci("PRINT_REQUEST_ID", "PRINT_REQUEST_ID", null, null, Long.class, "printRequestId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "PPrintQueueList,PPrintRequestBinaryList,PPrintRequestHistList", null, false);
    protected final ColumnInfo _columnReportCd = cci("REPORT_CD", "REPORT_CD", null, null, String.class, "reportCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportNm = cci("REPORT_NM", "REPORT_NM", null, null, String.class, "reportNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportLayoutNm = cci("REPORT_LAYOUT_NM", "REPORT_LAYOUT_NM", null, null, String.class, "reportLayoutNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterGroupId = cci("PRINTER_GROUP_ID", "PRINTER_GROUP_ID", null, null, Long.class, "printerGroupId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterGroupNm = cci("PRINTER_GROUP_NM", "PRINTER_GROUP_NM", null, null, String.class, "printerGroupNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterNm = cci("PRINTER_NM", "PRINTER_NM", null, null, String.class, "printerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrayNm = cci("TRAY_NM", "TRAY_NM", null, null, String.class, "trayNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintNum = cci("PRINT_NUM", "PRINT_NUM", null, null, Long.class, "printNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDocumentPageSize = cci("DOCUMENT_PAGE_SIZE", "DOCUMENT_PAGE_SIZE", null, null, Long.class, "documentPageSize", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSheetCollate = cci("SHEET_COLLATE", "SHEET_COLLATE", null, null, String.class, "sheetCollate", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySheetCollate", null, CDef.DefMeta.SheetCollate, false);
    protected final ColumnInfo _columnPrintStatus = cci("PRINT_STATUS", "PRINT_STATUS", null, null, String.class, "printStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPrintStatus", null, CDef.DefMeta.PrintStatus, false);
    protected final ColumnInfo _columnFirstPrintDt = cci("FIRST_PRINT_DT", "FIRST_PRINT_DT", null, null, java.sql.Timestamp.class, "firstPrintDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLatestPrintDt = cci("LATEST_PRINT_DT", "LATEST_PRINT_DT", null, null, java.sql.Timestamp.class, "latestPrintDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedCount = cci("PRINTED_COUNT", "PRINTED_COUNT", null, null, Long.class, "printedCount", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedFlg = cci("PRINTED_FLG", "PRINTED_FLG", null, null, String.class, "printedFlg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, "BClassDtlByPrintedFlg", null, CDef.DefMeta.PrintedFlg, false);
    protected final ColumnInfo _columnQueueAddDt = cci("QUEUE_ADD_DT", "QUEUE_ADD_DT", null, null, java.sql.Timestamp.class, "queueAddDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintDataType = cci("PRINT_DATA_TYPE", "PRINT_DATA_TYPE", null, null, String.class, "printDataType", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByPrintDataType", null, CDef.DefMeta.PrintDataType, false);
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
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintRequestId() { return _columnPrintRequestId; }
    /**
     * REPORT_CD: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportCd() { return _columnReportCd; }
    /**
     * REPORT_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportNm() { return _columnReportNm; }
    /**
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutNm() { return _columnReportLayoutNm; }
    /**
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupId() { return _columnPrinterGroupId; }
    /**
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupNm() { return _columnPrinterGroupNm; }
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
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDocumentPageSize() { return _columnDocumentPageSize; }
    /**
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSheetCollate() { return _columnSheetCollate; }
    /**
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintStatus() { return _columnPrintStatus; }
    /**
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstPrintDt() { return _columnFirstPrintDt; }
    /**
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLatestPrintDt() { return _columnLatestPrintDt; }
    /**
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedCount() { return _columnPrintedCount; }
    /**
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedFlg() { return _columnPrintedFlg; }
    /**
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQueueAddDt() { return _columnQueueAddDt; }
    /**
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintDataType() { return _columnPrintDataType; }
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
        ls.add(columnPrintRequestId());
        ls.add(columnReportCd());
        ls.add(columnReportNm());
        ls.add(columnReportLayoutNm());
        ls.add(columnPrinterGroupId());
        ls.add(columnPrinterGroupNm());
        ls.add(columnPrinterNm());
        ls.add(columnTrayNm());
        ls.add(columnPrintNum());
        ls.add(columnDocumentPageSize());
        ls.add(columnSheetCollate());
        ls.add(columnPrintStatus());
        ls.add(columnFirstPrintDt());
        ls.add(columnLatestPrintDt());
        ls.add(columnPrintedCount());
        ls.add(columnPrintedFlg());
        ls.add(columnQueueAddDt());
        ls.add(columnPrintDataType());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrintRequestId()); }
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
     * B_CLASS_DTL by my PRINT_STATUS, named 'BClassDtlByPrintStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPrintStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINT_REQUEST_PRINT_STATUS", "BClassDtlByPrintStatus", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRINT_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySheetCollate() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSheetCollate(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINT_REQUEST_SHEET_COLLATE", "BClassDtlBySheetCollate", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SHEET_COLLATE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PRINTED_FLG, named 'BClassDtlByPrintedFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPrintedFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintedFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINT_REQUEST_PRINTED_FLG", "BClassDtlByPrintedFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRINTED_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PRINT_DATA_TYPE, named 'BClassDtlByPrintDataType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPrintDataType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintDataType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINT_REQUEST_PRINT_DATA_TYPE", "BClassDtlByPrintDataType", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRINT_DATA_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * P_PRINT_REQUEST_DATA by PRINT_REQUEST_ID, named 'PPrintRequestDataAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignPPrintRequestDataAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintRequestId(), PPrintRequestDataDbm.getInstance().columnPrintRequestId());
        return cfi("P_PRINT_REQUEST_DATA_FK1", "PPrintRequestDataAsOne", this, PPrintRequestDataDbm.getInstance(), mp, 4, null, true, false, true, false, null, null, false, "PPrintRequest", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * P_PRINT_QUEUE by PRINT_REQUEST_ID, named 'PPrintQueueList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPPrintQueueList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintRequestId(), PPrintQueueDbm.getInstance().columnPrintRequestId());
        return cri("P_PRINT_QUEUE_FK1", "PPrintQueueList", this, PPrintQueueDbm.getInstance(), mp, false, "PPrintRequest");
    }
    /**
     * P_PRINT_REQUEST_BINARY by PRINT_REQUEST_ID, named 'PPrintRequestBinaryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPPrintRequestBinaryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintRequestId(), PPrintRequestBinaryDbm.getInstance().columnPrintRequestId());
        return cri("P_PRINT_REQUEST_BINARY_FK1", "PPrintRequestBinaryList", this, PPrintRequestBinaryDbm.getInstance(), mp, false, "PPrintRequest");
    }
    /**
     * P_PRINT_REQUEST_HIST by PRINT_REQUEST_ID, named 'PPrintRequestHistList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPPrintRequestHistList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintRequestId(), PPrintRequestHistDbm.getInstance().columnPrintRequestId());
        return cri("P_PRINT_REQUEST_HIST_FK1", "PPrintRequestHistList", this, PPrintRequestHistDbm.getInstance(), mp, false, "PPrintRequest");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PPrintRequest"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PPrintRequestCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PPrintRequestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PPrintRequest> getEntityType() { return PPrintRequest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PPrintRequest newEntity() { return new PPrintRequest(); }
    public PPrintRequest newMyEntity() { return new PPrintRequest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PPrintRequest)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PPrintRequest)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
