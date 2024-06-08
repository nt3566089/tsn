package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of P_PRINT_REQUEST.
 * @author DBFlute(AutoGenerator)
 */
public class BsPPrintRequestCQ extends AbstractBsPPrintRequestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PPrintRequestCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrintRequestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_PRINT_REQUEST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PPrintRequestCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PPrintRequestCIQ xcreateCIQ() {
        PPrintRequestCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PPrintRequestCIQ xnewCIQ() {
        return new PPrintRequestCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_PRINT_REQUEST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PPrintRequestCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PPrintRequestCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printRequestId;
    public ConditionValue xdfgetPrintRequestId()
    { if (_printRequestId == null) { _printRequestId = nCV(); }
      return _printRequestId; }
    protected ConditionValue xgetCValuePrintRequestId() { return xdfgetPrintRequestId(); }

    public Map<String, PPrintQueueCQ> xdfgetPrintRequestId_ExistsReferrer_PPrintQueueList() { return xgetSQueMap("printRequestId_ExistsReferrer_PPrintQueueList"); }
    public String keepPrintRequestId_ExistsReferrer_PPrintQueueList(PPrintQueueCQ sq) { return xkeepSQue("printRequestId_ExistsReferrer_PPrintQueueList", sq); }

    public Map<String, PPrintRequestBinaryCQ> xdfgetPrintRequestId_ExistsReferrer_PPrintRequestBinaryList() { return xgetSQueMap("printRequestId_ExistsReferrer_PPrintRequestBinaryList"); }
    public String keepPrintRequestId_ExistsReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq) { return xkeepSQue("printRequestId_ExistsReferrer_PPrintRequestBinaryList", sq); }

    public Map<String, PPrintRequestDataCQ> xdfgetPrintRequestId_ExistsReferrer_PPrintRequestDataAsOne() { return xgetSQueMap("printRequestId_ExistsReferrer_PPrintRequestDataAsOne"); }
    public String keepPrintRequestId_ExistsReferrer_PPrintRequestDataAsOne(PPrintRequestDataCQ sq) { return xkeepSQue("printRequestId_ExistsReferrer_PPrintRequestDataAsOne", sq); }

    public Map<String, PPrintRequestHistCQ> xdfgetPrintRequestId_ExistsReferrer_PPrintRequestHistList() { return xgetSQueMap("printRequestId_ExistsReferrer_PPrintRequestHistList"); }
    public String keepPrintRequestId_ExistsReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq) { return xkeepSQue("printRequestId_ExistsReferrer_PPrintRequestHistList", sq); }

    public Map<String, PPrintQueueCQ> xdfgetPrintRequestId_NotExistsReferrer_PPrintQueueList() { return xgetSQueMap("printRequestId_NotExistsReferrer_PPrintQueueList"); }
    public String keepPrintRequestId_NotExistsReferrer_PPrintQueueList(PPrintQueueCQ sq) { return xkeepSQue("printRequestId_NotExistsReferrer_PPrintQueueList", sq); }

    public Map<String, PPrintRequestBinaryCQ> xdfgetPrintRequestId_NotExistsReferrer_PPrintRequestBinaryList() { return xgetSQueMap("printRequestId_NotExistsReferrer_PPrintRequestBinaryList"); }
    public String keepPrintRequestId_NotExistsReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq) { return xkeepSQue("printRequestId_NotExistsReferrer_PPrintRequestBinaryList", sq); }

    public Map<String, PPrintRequestDataCQ> xdfgetPrintRequestId_NotExistsReferrer_PPrintRequestDataAsOne() { return xgetSQueMap("printRequestId_NotExistsReferrer_PPrintRequestDataAsOne"); }
    public String keepPrintRequestId_NotExistsReferrer_PPrintRequestDataAsOne(PPrintRequestDataCQ sq) { return xkeepSQue("printRequestId_NotExistsReferrer_PPrintRequestDataAsOne", sq); }

    public Map<String, PPrintRequestHistCQ> xdfgetPrintRequestId_NotExistsReferrer_PPrintRequestHistList() { return xgetSQueMap("printRequestId_NotExistsReferrer_PPrintRequestHistList"); }
    public String keepPrintRequestId_NotExistsReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq) { return xkeepSQue("printRequestId_NotExistsReferrer_PPrintRequestHistList", sq); }

    public Map<String, PPrintQueueCQ> xdfgetPrintRequestId_SpecifyDerivedReferrer_PPrintQueueList() { return xgetSQueMap("printRequestId_SpecifyDerivedReferrer_PPrintQueueList"); }
    public String keepPrintRequestId_SpecifyDerivedReferrer_PPrintQueueList(PPrintQueueCQ sq) { return xkeepSQue("printRequestId_SpecifyDerivedReferrer_PPrintQueueList", sq); }

    public Map<String, PPrintRequestBinaryCQ> xdfgetPrintRequestId_SpecifyDerivedReferrer_PPrintRequestBinaryList() { return xgetSQueMap("printRequestId_SpecifyDerivedReferrer_PPrintRequestBinaryList"); }
    public String keepPrintRequestId_SpecifyDerivedReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq) { return xkeepSQue("printRequestId_SpecifyDerivedReferrer_PPrintRequestBinaryList", sq); }

    public Map<String, PPrintRequestHistCQ> xdfgetPrintRequestId_SpecifyDerivedReferrer_PPrintRequestHistList() { return xgetSQueMap("printRequestId_SpecifyDerivedReferrer_PPrintRequestHistList"); }
    public String keepPrintRequestId_SpecifyDerivedReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq) { return xkeepSQue("printRequestId_SpecifyDerivedReferrer_PPrintRequestHistList", sq); }

    public Map<String, PPrintQueueCQ> xdfgetPrintRequestId_QueryDerivedReferrer_PPrintQueueList() { return xgetSQueMap("printRequestId_QueryDerivedReferrer_PPrintQueueList"); }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintQueueList(PPrintQueueCQ sq) { return xkeepSQue("printRequestId_QueryDerivedReferrer_PPrintQueueList", sq); }
    public Map<String, Object> xdfgetPrintRequestId_QueryDerivedReferrer_PPrintQueueListParameter() { return xgetSQuePmMap("printRequestId_QueryDerivedReferrer_PPrintQueueList"); }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintQueueListParameter(Object pm) { return xkeepSQuePm("printRequestId_QueryDerivedReferrer_PPrintQueueList", pm); }

    public Map<String, PPrintRequestBinaryCQ> xdfgetPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryList() { return xgetSQueMap("printRequestId_QueryDerivedReferrer_PPrintRequestBinaryList"); }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq) { return xkeepSQue("printRequestId_QueryDerivedReferrer_PPrintRequestBinaryList", sq); }
    public Map<String, Object> xdfgetPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryListParameter() { return xgetSQuePmMap("printRequestId_QueryDerivedReferrer_PPrintRequestBinaryList"); }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryListParameter(Object pm) { return xkeepSQuePm("printRequestId_QueryDerivedReferrer_PPrintRequestBinaryList", pm); }

    public Map<String, PPrintRequestHistCQ> xdfgetPrintRequestId_QueryDerivedReferrer_PPrintRequestHistList() { return xgetSQueMap("printRequestId_QueryDerivedReferrer_PPrintRequestHistList"); }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq) { return xkeepSQue("printRequestId_QueryDerivedReferrer_PPrintRequestHistList", sq); }
    public Map<String, Object> xdfgetPrintRequestId_QueryDerivedReferrer_PPrintRequestHistListParameter() { return xgetSQuePmMap("printRequestId_QueryDerivedReferrer_PPrintRequestHistList"); }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestHistListParameter(Object pm) { return xkeepSQuePm("printRequestId_QueryDerivedReferrer_PPrintRequestHistList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintRequestId_Asc() { regOBA("PRINT_REQUEST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintRequestId_Desc() { regOBD("PRINT_REQUEST_ID"); return this; }

    protected ConditionValue _reportCd;
    public ConditionValue xdfgetReportCd()
    { if (_reportCd == null) { _reportCd = nCV(); }
      return _reportCd; }
    protected ConditionValue xgetCValueReportCd() { return xdfgetReportCd(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_ReportCd_Asc() { regOBA("REPORT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_CD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_ReportCd_Desc() { regOBD("REPORT_CD"); return this; }

    protected ConditionValue _reportNm;
    public ConditionValue xdfgetReportNm()
    { if (_reportNm == null) { _reportNm = nCV(); }
      return _reportNm; }
    protected ConditionValue xgetCValueReportNm() { return xdfgetReportNm(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_ReportNm_Asc() { regOBA("REPORT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_ReportNm_Desc() { regOBD("REPORT_NM"); return this; }

    protected ConditionValue _reportLayoutNm;
    public ConditionValue xdfgetReportLayoutNm()
    { if (_reportLayoutNm == null) { _reportLayoutNm = nCV(); }
      return _reportLayoutNm; }
    protected ConditionValue xgetCValueReportLayoutNm() { return xdfgetReportLayoutNm(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_ReportLayoutNm_Asc() { regOBA("REPORT_LAYOUT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_ReportLayoutNm_Desc() { regOBD("REPORT_LAYOUT_NM"); return this; }

    protected ConditionValue _printerGroupId;
    public ConditionValue xdfgetPrinterGroupId()
    { if (_printerGroupId == null) { _printerGroupId = nCV(); }
      return _printerGroupId; }
    protected ConditionValue xgetCValuePrinterGroupId() { return xdfgetPrinterGroupId(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrinterGroupId_Asc() { regOBA("PRINTER_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrinterGroupId_Desc() { regOBD("PRINTER_GROUP_ID"); return this; }

    protected ConditionValue _printerGroupNm;
    public ConditionValue xdfgetPrinterGroupNm()
    { if (_printerGroupNm == null) { _printerGroupNm = nCV(); }
      return _printerGroupNm; }
    protected ConditionValue xgetCValuePrinterGroupNm() { return xdfgetPrinterGroupNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrinterGroupNm_Asc() { regOBA("PRINTER_GROUP_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrinterGroupNm_Desc() { regOBD("PRINTER_GROUP_NM"); return this; }

    protected ConditionValue _printerNm;
    public ConditionValue xdfgetPrinterNm()
    { if (_printerNm == null) { _printerNm = nCV(); }
      return _printerNm; }
    protected ConditionValue xgetCValuePrinterNm() { return xdfgetPrinterNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrinterNm_Asc() { regOBA("PRINTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrinterNm_Desc() { regOBD("PRINTER_NM"); return this; }

    protected ConditionValue _trayNm;
    public ConditionValue xdfgetTrayNm()
    { if (_trayNm == null) { _trayNm = nCV(); }
      return _trayNm; }
    protected ConditionValue xgetCValueTrayNm() { return xdfgetTrayNm(); }

    /**
     * Add order-by as ascend. <br>
     * TRAY_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_TrayNm_Asc() { regOBA("TRAY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRAY_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_TrayNm_Desc() { regOBD("TRAY_NM"); return this; }

    protected ConditionValue _printNum;
    public ConditionValue xdfgetPrintNum()
    { if (_printNum == null) { _printNum = nCV(); }
      return _printNum; }
    protected ConditionValue xgetCValuePrintNum() { return xdfgetPrintNum(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintNum_Asc() { regOBA("PRINT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintNum_Desc() { regOBD("PRINT_NUM"); return this; }

    protected ConditionValue _documentPageSize;
    public ConditionValue xdfgetDocumentPageSize()
    { if (_documentPageSize == null) { _documentPageSize = nCV(); }
      return _documentPageSize; }
    protected ConditionValue xgetCValueDocumentPageSize() { return xdfgetDocumentPageSize(); }

    /**
     * Add order-by as ascend. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_DocumentPageSize_Asc() { regOBA("DOCUMENT_PAGE_SIZE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DOCUMENT_PAGE_SIZE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_DocumentPageSize_Desc() { regOBD("DOCUMENT_PAGE_SIZE"); return this; }

    protected ConditionValue _sheetCollate;
    public ConditionValue xdfgetSheetCollate()
    { if (_sheetCollate == null) { _sheetCollate = nCV(); }
      return _sheetCollate; }
    protected ConditionValue xgetCValueSheetCollate() { return xdfgetSheetCollate(); }

    /**
     * Add order-by as ascend. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_SheetCollate_Asc() { regOBA("SHEET_COLLATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_SheetCollate_Desc() { regOBD("SHEET_COLLATE"); return this; }

    protected ConditionValue _printStatus;
    public ConditionValue xdfgetPrintStatus()
    { if (_printStatus == null) { _printStatus = nCV(); }
      return _printStatus; }
    protected ConditionValue xgetCValuePrintStatus() { return xdfgetPrintStatus(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintStatus_Asc() { regOBA("PRINT_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintStatus_Desc() { regOBD("PRINT_STATUS"); return this; }

    protected ConditionValue _firstPrintDt;
    public ConditionValue xdfgetFirstPrintDt()
    { if (_firstPrintDt == null) { _firstPrintDt = nCV(); }
      return _firstPrintDt; }
    protected ConditionValue xgetCValueFirstPrintDt() { return xdfgetFirstPrintDt(); }

    /**
     * Add order-by as ascend. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_FirstPrintDt_Asc() { regOBA("FIRST_PRINT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRST_PRINT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_FirstPrintDt_Desc() { regOBD("FIRST_PRINT_DT"); return this; }

    protected ConditionValue _latestPrintDt;
    public ConditionValue xdfgetLatestPrintDt()
    { if (_latestPrintDt == null) { _latestPrintDt = nCV(); }
      return _latestPrintDt; }
    protected ConditionValue xgetCValueLatestPrintDt() { return xdfgetLatestPrintDt(); }

    /**
     * Add order-by as ascend. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_LatestPrintDt_Asc() { regOBA("LATEST_PRINT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LATEST_PRINT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_LatestPrintDt_Desc() { regOBD("LATEST_PRINT_DT"); return this; }

    protected ConditionValue _printedCount;
    public ConditionValue xdfgetPrintedCount()
    { if (_printedCount == null) { _printedCount = nCV(); }
      return _printedCount; }
    protected ConditionValue xgetCValuePrintedCount() { return xdfgetPrintedCount(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintedCount_Asc() { regOBA("PRINTED_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintedCount_Desc() { regOBD("PRINTED_COUNT"); return this; }

    protected ConditionValue _printedFlg;
    public ConditionValue xdfgetPrintedFlg()
    { if (_printedFlg == null) { _printedFlg = nCV(); }
      return _printedFlg; }
    protected ConditionValue xgetCValuePrintedFlg() { return xdfgetPrintedFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintedFlg_Asc() { regOBA("PRINTED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintedFlg_Desc() { regOBD("PRINTED_FLG"); return this; }

    protected ConditionValue _queueAddDt;
    public ConditionValue xdfgetQueueAddDt()
    { if (_queueAddDt == null) { _queueAddDt = nCV(); }
      return _queueAddDt; }
    protected ConditionValue xgetCValueQueueAddDt() { return xdfgetQueueAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_QueueAddDt_Asc() { regOBA("QUEUE_ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUEUE_ADD_DT: {IX, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_QueueAddDt_Desc() { regOBD("QUEUE_ADD_DT"); return this; }

    protected ConditionValue _printDataType;
    public ConditionValue xdfgetPrintDataType()
    { if (_printDataType == null) { _printDataType = nCV(); }
      return _printDataType; }
    protected ConditionValue xgetCValuePrintDataType() { return xdfgetPrintDataType(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintDataType_Asc() { regOBA("PRINT_DATA_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_PrintDataType_Desc() { regOBD("PRINT_DATA_TYPE"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsPPrintRequestCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PPrintRequestCQ bq = (PPrintRequestCQ)bqs;
        PPrintRequestCQ uq = (PPrintRequestCQ)uqs;
        if (bq.hasConditionQueryBClassDtlByPrintStatus()) {
            uq.queryBClassDtlByPrintStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByPrintStatus(), uq.queryBClassDtlByPrintStatus());
        }
        if (bq.hasConditionQueryBClassDtlBySheetCollate()) {
            uq.queryBClassDtlBySheetCollate().reflectRelationOnUnionQuery(bq.queryBClassDtlBySheetCollate(), uq.queryBClassDtlBySheetCollate());
        }
        if (bq.hasConditionQueryBClassDtlByPrintedFlg()) {
            uq.queryBClassDtlByPrintedFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPrintedFlg(), uq.queryBClassDtlByPrintedFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPrintDataType()) {
            uq.queryBClassDtlByPrintDataType().reflectRelationOnUnionQuery(bq.queryBClassDtlByPrintDataType(), uq.queryBClassDtlByPrintDataType());
        }
        if (bq.hasConditionQueryPPrintRequestDataAsOne()) {
            uq.queryPPrintRequestDataAsOne().reflectRelationOnUnionQuery(bq.queryPPrintRequestDataAsOne(), uq.queryPPrintRequestDataAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRINT_STATUS, named 'BClassDtlByPrintStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPrintStatus() {
        return xdfgetConditionQueryBClassDtlByPrintStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPrintStatus() {
        String prop = "bClassDtlByPrintStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPrintStatus()); xsetupOuterJoinBClassDtlByPrintStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPrintStatus() {
        String nrp = xresolveNRP("P_PRINT_REQUEST", "bClassDtlByPrintStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPrintStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPrintStatus() { xregOutJo("bClassDtlByPrintStatus"); }
    public boolean hasConditionQueryBClassDtlByPrintStatus() { return xhasQueRlMap("bClassDtlByPrintStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySheetCollate() {
        return xdfgetConditionQueryBClassDtlBySheetCollate();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySheetCollate() {
        String prop = "bClassDtlBySheetCollate";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySheetCollate()); xsetupOuterJoinBClassDtlBySheetCollate(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySheetCollate() {
        String nrp = xresolveNRP("P_PRINT_REQUEST", "bClassDtlBySheetCollate"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySheetCollate", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySheetCollate() { xregOutJo("bClassDtlBySheetCollate"); }
    public boolean hasConditionQueryBClassDtlBySheetCollate() { return xhasQueRlMap("bClassDtlBySheetCollate"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRINTED_FLG, named 'BClassDtlByPrintedFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPrintedFlg() {
        return xdfgetConditionQueryBClassDtlByPrintedFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPrintedFlg() {
        String prop = "bClassDtlByPrintedFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPrintedFlg()); xsetupOuterJoinBClassDtlByPrintedFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPrintedFlg() {
        String nrp = xresolveNRP("P_PRINT_REQUEST", "bClassDtlByPrintedFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPrintedFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPrintedFlg() { xregOutJo("bClassDtlByPrintedFlg"); }
    public boolean hasConditionQueryBClassDtlByPrintedFlg() { return xhasQueRlMap("bClassDtlByPrintedFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRINT_DATA_TYPE, named 'BClassDtlByPrintDataType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPrintDataType() {
        return xdfgetConditionQueryBClassDtlByPrintDataType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPrintDataType() {
        String prop = "bClassDtlByPrintDataType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPrintDataType()); xsetupOuterJoinBClassDtlByPrintDataType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPrintDataType() {
        String nrp = xresolveNRP("P_PRINT_REQUEST", "bClassDtlByPrintDataType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPrintDataType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPrintDataType() { xregOutJo("bClassDtlByPrintDataType"); }
    public boolean hasConditionQueryBClassDtlByPrintDataType() { return xhasQueRlMap("bClassDtlByPrintDataType"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_PRINT_REQUEST_DATA by PRINT_REQUEST_ID, named 'PPrintRequestDataAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public PPrintRequestDataCQ queryPPrintRequestDataAsOne() { return xdfgetConditionQueryPPrintRequestDataAsOne(); }
    public PPrintRequestDataCQ xdfgetConditionQueryPPrintRequestDataAsOne() {
        String prop = "pPrintRequestDataAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPPrintRequestDataAsOne()); xsetupOuterJoinPPrintRequestDataAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected PPrintRequestDataCQ xcreateQueryPPrintRequestDataAsOne() {
        String nrp = xresolveNRP("P_PRINT_REQUEST", "pPrintRequestDataAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrintRequestDataCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrintRequestDataAsOne", nrp);
    }
    protected void xsetupOuterJoinPPrintRequestDataAsOne() { xregOutJo("pPrintRequestDataAsOne"); }
    public boolean hasConditionQueryPPrintRequestDataAsOne() { return xhasQueRlMap("pPrintRequestDataAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PPrintRequestCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PPrintRequestCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PPrintRequestCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PPrintRequestCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PPrintRequestCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PPrintRequestCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PPrintRequestCQ> _myselfExistsMap;
    public Map<String, PPrintRequestCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PPrintRequestCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PPrintRequestCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PPrintRequestCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PPrintRequestCB.class.getName(); }
    protected String xCQ() { return PPrintRequestCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
