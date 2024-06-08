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
 * The DB meta of P_PRINT_REQUEST_HIST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestHistDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PPrintRequestHistDbm _instance = new PPrintRequestHistDbm();
    private PPrintRequestHistDbm() {}
    public static PPrintRequestHistDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getPrintRequestHistId(), (et, vl) -> ((PPrintRequestHist)et).setPrintRequestHistId(ctl(vl)), "printRequestHistId");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getPrintRequestId(), (et, vl) -> ((PPrintRequestHist)et).setPrintRequestId(ctl(vl)), "printRequestId");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getPrintRequestNo(), (et, vl) -> ((PPrintRequestHist)et).setPrintRequestNo(ctl(vl)), "printRequestNo");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getPrinterNm(), (et, vl) -> ((PPrintRequestHist)et).setPrinterNm((String)vl), "printerNm");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getTrayNm(), (et, vl) -> ((PPrintRequestHist)et).setTrayNm((String)vl), "trayNm");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getPrintNum(), (et, vl) -> ((PPrintRequestHist)et).setPrintNum(ctl(vl)), "printNum");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getDocumentPageSize(), (et, vl) -> ((PPrintRequestHist)et).setDocumentPageSize(ctl(vl)), "documentPageSize");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getSheetCollate(), (et, vl) -> ((PPrintRequestHist)et).setSheetCollate((String)vl), "sheetCollate");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getPrintResultClass(), (et, vl) -> ((PPrintRequestHist)et).setPrintResultClass((String)vl), "printResultClass");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getProcessInfo(), (et, vl) -> ((PPrintRequestHist)et).setProcessInfo((String)vl), "processInfo");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getQueueAddDt(), (et, vl) -> ((PPrintRequestHist)et).setQueueAddDt(cttp(vl)), "queueAddDt");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getPrintDt(), (et, vl) -> ((PPrintRequestHist)et).setPrintDt(cttp(vl)), "printDt");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getPrintDataType(), (et, vl) -> ((PPrintRequestHist)et).setPrintDataType((String)vl), "printDataType");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getDelFlg(), (et, vl) -> ((PPrintRequestHist)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getVersionNo(), (et, vl) -> ((PPrintRequestHist)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getControlNo(), (et, vl) -> ((PPrintRequestHist)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getAddDt(), (et, vl) -> ((PPrintRequestHist)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getAddUser(), (et, vl) -> ((PPrintRequestHist)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getAddProcess(), (et, vl) -> ((PPrintRequestHist)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getUpdDt(), (et, vl) -> ((PPrintRequestHist)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getUpdUser(), (et, vl) -> ((PPrintRequestHist)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PPrintRequestHist)et).getUpdProcess(), (et, vl) -> ((PPrintRequestHist)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PPrintRequestHist)et).getPPrintRequest(), (et, vl) -> ((PPrintRequestHist)et).setPPrintRequest((PPrintRequest)vl), "PPrintRequest");
        setupEfpg(_efpgMap, et -> ((PPrintRequestHist)et).getBClassDtlBySheetCollate(), (et, vl) -> ((PPrintRequestHist)et).setBClassDtlBySheetCollate((BClassDtl)vl), "BClassDtlBySheetCollate");
        setupEfpg(_efpgMap, et -> ((PPrintRequestHist)et).getBClassDtlByPrintResultClass(), (et, vl) -> ((PPrintRequestHist)et).setBClassDtlByPrintResultClass((BClassDtl)vl), "BClassDtlByPrintResultClass");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_PRINT_REQUEST_HIST";
    protected final String _tableDispName = "P_PRINT_REQUEST_HIST";
    protected final String _tablePropertyName = "PPrintRequestHist";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_PRINT_REQUEST_HIST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrintRequestHistId = cci("PRINT_REQUEST_HIST_ID", "PRINT_REQUEST_HIST_ID", null, null, Long.class, "printRequestHistId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintRequestId = cci("PRINT_REQUEST_ID", "PRINT_REQUEST_ID", null, null, Long.class, "printRequestId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PPrintRequest", null, null, false);
    protected final ColumnInfo _columnPrintRequestNo = cci("PRINT_REQUEST_NO", "PRINT_REQUEST_NO", null, null, Long.class, "printRequestNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterNm = cci("PRINTER_NM", "PRINTER_NM", null, null, String.class, "printerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrayNm = cci("TRAY_NM", "TRAY_NM", null, null, String.class, "trayNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintNum = cci("PRINT_NUM", "PRINT_NUM", null, null, Long.class, "printNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDocumentPageSize = cci("DOCUMENT_PAGE_SIZE", "DOCUMENT_PAGE_SIZE", null, null, Long.class, "documentPageSize", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSheetCollate = cci("SHEET_COLLATE", "SHEET_COLLATE", null, null, String.class, "sheetCollate", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySheetCollate", null, CDef.DefMeta.SheetCollate, false);
    protected final ColumnInfo _columnPrintResultClass = cci("PRINT_RESULT_CLASS", "PRINT_RESULT_CLASS", null, null, String.class, "printResultClass", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPrintResultClass", null, CDef.DefMeta.PrintResultClass, false);
    protected final ColumnInfo _columnProcessInfo = cci("PROCESS_INFO", "PROCESS_INFO", null, null, String.class, "processInfo", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQueueAddDt = cci("QUEUE_ADD_DT", "QUEUE_ADD_DT", null, null, java.sql.Timestamp.class, "queueAddDt", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintDt = cci("PRINT_DT", "PRINT_DT", null, null, java.sql.Timestamp.class, "printDt", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintDataType = cci("PRINT_DATA_TYPE", "PRINT_DATA_TYPE", null, null, String.class, "printDataType", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintRequestHistId() { return _columnPrintRequestHistId; }
    /**
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintRequestId() { return _columnPrintRequestId; }
    /**
     * PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintRequestNo() { return _columnPrintRequestNo; }
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
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintResultClass() { return _columnPrintResultClass; }
    /**
     * PROCESS_INFO: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessInfo() { return _columnProcessInfo; }
    /**
     * QUEUE_ADD_DT: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQueueAddDt() { return _columnQueueAddDt; }
    /**
     * PRINT_DT: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintDt() { return _columnPrintDt; }
    /**
     * PRINT_DATA_TYPE: {NotNull, char(1)}
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
        ls.add(columnPrintRequestHistId());
        ls.add(columnPrintRequestId());
        ls.add(columnPrintRequestNo());
        ls.add(columnPrinterNm());
        ls.add(columnTrayNm());
        ls.add(columnPrintNum());
        ls.add(columnDocumentPageSize());
        ls.add(columnSheetCollate());
        ls.add(columnPrintResultClass());
        ls.add(columnProcessInfo());
        ls.add(columnQueueAddDt());
        ls.add(columnPrintDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrintRequestHistId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPrintRequestId());
        ls.add(columnPrintRequestNo());
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
     * P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrintRequest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintRequestId(), PPrintRequestDbm.getInstance().columnPrintRequestId());
        return cfi("P_PRINT_REQUEST_HIST_FK1", "PPrintRequest", this, PPrintRequestDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "PPrintRequestHistList", false);
    }
    /**
     * B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySheetCollate() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSheetCollate(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINT_REQUEST_HIST_SHEET_COLLATE", "BClassDtlBySheetCollate", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SHEET_COLLATE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PRINT_RESULT_CLASS, named 'BClassDtlByPrintResultClass'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPrintResultClass() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintResultClass(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_PRINT_REQUEST_HIST_PRINT_RESULT_CLASS", "BClassDtlByPrintResultClass", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRINT_RESULT_CLASS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PPrintRequestHist"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PPrintRequestHistCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PPrintRequestHistBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PPrintRequestHist> getEntityType() { return PPrintRequestHist.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PPrintRequestHist newEntity() { return new PPrintRequestHist(); }
    public PPrintRequestHist newMyEntity() { return new PPrintRequestHist(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PPrintRequestHist)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PPrintRequestHist)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
