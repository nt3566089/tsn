package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of P_PRINT_REQUEST as TABLE. <br>
 * 印刷情報
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_ID
 *
 * [column]
 *     PRINT_REQUEST_ID, REPORT_CD, REPORT_NM, REPORT_LAYOUT_NM, PRINTER_GROUP_ID, PRINTER_GROUP_NM, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_STATUS, FIRST_PRINT_DT, LATEST_PRINT_DT, PRINTED_COUNT, PRINTED_FLG, QUEUE_ADD_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByPrintStatus), P_PRINT_REQUEST_DATA(AsOne)
 *
 * [referrer table]
 *     P_PRINT_QUEUE, P_PRINT_REQUEST_BINARY, P_PRINT_REQUEST_HIST, P_PRINT_REQUEST_DATA
 *
 * [foreign property]
 *     bClassDtlByPrintStatus, bClassDtlBySheetCollate, bClassDtlByPrintedFlg, bClassDtlByPrintDataType, pPrintRequestDataAsOne
 *
 * [referrer property]
 *     pPrintQueueList, pPrintRequestBinaryList, pPrintRequestHistList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long printRequestId = entity.getPrintRequestId();
 * String reportCd = entity.getReportCd();
 * String reportNm = entity.getReportNm();
 * String reportLayoutNm = entity.getReportLayoutNm();
 * Long printerGroupId = entity.getPrinterGroupId();
 * String printerGroupNm = entity.getPrinterGroupNm();
 * String printerNm = entity.getPrinterNm();
 * String trayNm = entity.getTrayNm();
 * Long printNum = entity.getPrintNum();
 * Long documentPageSize = entity.getDocumentPageSize();
 * String sheetCollate = entity.getSheetCollate();
 * String printStatus = entity.getPrintStatus();
 * java.sql.Timestamp firstPrintDt = entity.getFirstPrintDt();
 * java.sql.Timestamp latestPrintDt = entity.getLatestPrintDt();
 * Long printedCount = entity.getPrintedCount();
 * String printedFlg = entity.getPrintedFlg();
 * java.sql.Timestamp queueAddDt = entity.getQueueAddDt();
 * String printDataType = entity.getPrintDataType();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPrintRequestId(printRequestId);
 * entity.setReportCd(reportCd);
 * entity.setReportNm(reportNm);
 * entity.setReportLayoutNm(reportLayoutNm);
 * entity.setPrinterGroupId(printerGroupId);
 * entity.setPrinterGroupNm(printerGroupNm);
 * entity.setPrinterNm(printerNm);
 * entity.setTrayNm(trayNm);
 * entity.setPrintNum(printNum);
 * entity.setDocumentPageSize(documentPageSize);
 * entity.setSheetCollate(sheetCollate);
 * entity.setPrintStatus(printStatus);
 * entity.setFirstPrintDt(firstPrintDt);
 * entity.setLatestPrintDt(latestPrintDt);
 * entity.setPrintedCount(printedCount);
 * entity.setPrintedFlg(printedFlg);
 * entity.setQueueAddDt(queueAddDt);
 * entity.setPrintDataType(printDataType);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrintRequest extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _printRequestId;

    /** REPORT_CD: {NotNull, varchar(100)} */
    protected String _reportCd;

    /** REPORT_NM: {NotNull, varchar(60)} */
    protected String _reportNm;

    /** REPORT_LAYOUT_NM: {varchar(60)} */
    protected String _reportLayoutNm;

    /** PRINTER_GROUP_ID: {NotNull, bigint(19)} */
    protected Long _printerGroupId;

    /** PRINTER_GROUP_NM: {NotNull, varchar(60)} */
    protected String _printerGroupNm;

    /** PRINTER_NM: {varchar(60)} */
    protected String _printerNm;

    /** TRAY_NM: {varchar(60)} */
    protected String _trayNm;

    /** PRINT_NUM: {bigint(19)} */
    protected Long _printNum;

    /** DOCUMENT_PAGE_SIZE: {bigint(19)} */
    protected Long _documentPageSize;

    /** SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} */
    protected String _sheetCollate;

    /** PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} */
    protected String _printStatus;

    /** FIRST_PRINT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _firstPrintDt;

    /** LATEST_PRINT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _latestPrintDt;

    /** PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]} */
    protected Long _printedCount;

    /** PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} */
    protected String _printedFlg;

    /** QUEUE_ADD_DT: {IX, datetime2(26, 6)} */
    protected java.sql.Timestamp _queueAddDt;

    /** PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} */
    protected String _printDataType;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "P_PRINT_REQUEST";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_printRequestId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of sheetCollate as the classification of SheetCollate. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SheetCollate getSheetCollateAsSheetCollate() {
        return CDef.SheetCollate.codeOf(getSheetCollate());
    }

    /**
     * Set the value of sheetCollate as the classification of SheetCollate. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSheetCollateAsSheetCollate(CDef.SheetCollate cdef) {
        setSheetCollate(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of printStatus as the classification of PrintStatus. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PrintStatus getPrintStatusAsPrintStatus() {
        return CDef.PrintStatus.codeOf(getPrintStatus());
    }

    /**
     * Set the value of printStatus as the classification of PrintStatus. <br>
     * PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPrintStatusAsPrintStatus(CDef.PrintStatus cdef) {
        setPrintStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of printedFlg as the classification of PrintedFlg. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PrintedFlg getPrintedFlgAsPrintedFlg() {
        return CDef.PrintedFlg.codeOf(getPrintedFlg());
    }

    /**
     * Set the value of printedFlg as the classification of PrintedFlg. <br>
     * PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPrintedFlgAsPrintedFlg(CDef.PrintedFlg cdef) {
        setPrintedFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of printDataType as the classification of PrintDataType. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PrintDataType getPrintDataTypeAsPrintDataType() {
        return CDef.PrintDataType.codeOf(getPrintDataType());
    }

    /**
     * Set the value of printDataType as the classification of PrintDataType. <br>
     * PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPrintDataTypeAsPrintDataType(CDef.PrintDataType cdef) {
        setPrintDataType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of sheetCollate as $0 (0). <br>
     * $0: ページ毎印刷
     */
    public void setSheetCollate_$0() {
        setSheetCollateAsSheetCollate(CDef.SheetCollate.$0);
    }

    /**
     * Set the value of sheetCollate as $1 (1). <br>
     * $1: 部単位で印刷
     */
    public void setSheetCollate_$1() {
        setSheetCollateAsSheetCollate(CDef.SheetCollate.$1);
    }

    /**
     * Set the value of printStatus as $0 (0). <br>
     * $0: 未印刷
     */
    public void setPrintStatus_$0() {
        setPrintStatusAsPrintStatus(CDef.PrintStatus.$0);
    }

    /**
     * Set the value of printStatus as $1 (1). <br>
     * $1: 印刷中
     */
    public void setPrintStatus_$1() {
        setPrintStatusAsPrintStatus(CDef.PrintStatus.$1);
    }

    /**
     * Set the value of printStatus as $2 (2). <br>
     * $2: 印刷済
     */
    public void setPrintStatus_$2() {
        setPrintStatusAsPrintStatus(CDef.PrintStatus.$2);
    }

    /**
     * Set the value of printStatus as $9 (9). <br>
     * $9: 印刷失敗
     */
    public void setPrintStatus_$9() {
        setPrintStatusAsPrintStatus(CDef.PrintStatus.$9);
    }

    /**
     * Set the value of printedFlg as $0 (0). <br>
     * $0: 有
     */
    public void setPrintedFlg_$0() {
        setPrintedFlgAsPrintedFlg(CDef.PrintedFlg.$0);
    }

    /**
     * Set the value of printedFlg as $1 (1). <br>
     * $1: 無
     */
    public void setPrintedFlg_$1() {
        setPrintedFlgAsPrintedFlg(CDef.PrintedFlg.$1);
    }

    /**
     * Set the value of printDataType as $1 (1). <br>
     * $1: 通常
     */
    public void setPrintDataType_$1() {
        setPrintDataTypeAsPrintDataType(CDef.PrintDataType.$1);
    }

    /**
     * Set the value of printDataType as $2 (2). <br>
     * $2: 保護PDF
     */
    public void setPrintDataType_$2() {
        setPrintDataTypeAsPrintDataType(CDef.PrintDataType.$2);
    }

    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of sheetCollate $0? <br>
     * $0: ページ毎印刷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSheetCollate$0() {
        CDef.SheetCollate cdef = getSheetCollateAsSheetCollate();
        return cdef != null ? cdef.equals(CDef.SheetCollate.$0) : false;
    }

    /**
     * Is the value of sheetCollate $1? <br>
     * $1: 部単位で印刷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSheetCollate$1() {
        CDef.SheetCollate cdef = getSheetCollateAsSheetCollate();
        return cdef != null ? cdef.equals(CDef.SheetCollate.$1) : false;
    }

    /**
     * Is the value of printStatus $0? <br>
     * $0: 未印刷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintStatus$0() {
        CDef.PrintStatus cdef = getPrintStatusAsPrintStatus();
        return cdef != null ? cdef.equals(CDef.PrintStatus.$0) : false;
    }

    /**
     * Is the value of printStatus $1? <br>
     * $1: 印刷中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintStatus$1() {
        CDef.PrintStatus cdef = getPrintStatusAsPrintStatus();
        return cdef != null ? cdef.equals(CDef.PrintStatus.$1) : false;
    }

    /**
     * Is the value of printStatus $2? <br>
     * $2: 印刷済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintStatus$2() {
        CDef.PrintStatus cdef = getPrintStatusAsPrintStatus();
        return cdef != null ? cdef.equals(CDef.PrintStatus.$2) : false;
    }

    /**
     * Is the value of printStatus $9? <br>
     * $9: 印刷失敗
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintStatus$9() {
        CDef.PrintStatus cdef = getPrintStatusAsPrintStatus();
        return cdef != null ? cdef.equals(CDef.PrintStatus.$9) : false;
    }

    /**
     * Is the value of printedFlg $0? <br>
     * $0: 有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintedFlg$0() {
        CDef.PrintedFlg cdef = getPrintedFlgAsPrintedFlg();
        return cdef != null ? cdef.equals(CDef.PrintedFlg.$0) : false;
    }

    /**
     * Is the value of printedFlg $1? <br>
     * $1: 無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintedFlg$1() {
        CDef.PrintedFlg cdef = getPrintedFlgAsPrintedFlg();
        return cdef != null ? cdef.equals(CDef.PrintedFlg.$1) : false;
    }

    /**
     * Is the value of printDataType $1? <br>
     * $1: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintDataType$1() {
        CDef.PrintDataType cdef = getPrintDataTypeAsPrintDataType();
        return cdef != null ? cdef.equals(CDef.PrintDataType.$1) : false;
    }

    /**
     * Is the value of printDataType $2? <br>
     * $2: 保護PDF
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintDataType$2() {
        CDef.PrintDataType cdef = getPrintDataTypeAsPrintDataType();
        return cdef != null ? cdef.equals(CDef.PrintDataType.$2) : false;
    }

    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'sheetCollate' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSheetCollateName() {
        CDef.SheetCollate cdef = getSheetCollateAsSheetCollate();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'printStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPrintStatusName() {
        CDef.PrintStatus cdef = getPrintStatusAsPrintStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'printedFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPrintedFlgName() {
        CDef.PrintedFlg cdef = getPrintedFlgAsPrintedFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'printDataType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPrintDataTypeName() {
        CDef.PrintDataType cdef = getPrintDataTypeAsPrintDataType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** B_CLASS_DTL by my PRINT_STATUS, named 'BClassDtlByPrintStatus'. */
    protected BClassDtl _bClassDtlByPrintStatus;

    /**
     * [get] B_CLASS_DTL by my PRINT_STATUS, named 'BClassDtlByPrintStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByPrintStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPrintStatus() {
        return _bClassDtlByPrintStatus;
    }

    /**
     * [set] B_CLASS_DTL by my PRINT_STATUS, named 'BClassDtlByPrintStatus'.
     * @param bClassDtlByPrintStatus The entity of foreign property 'BClassDtlByPrintStatus'. (NullAllowed)
     */
    public void setBClassDtlByPrintStatus(BClassDtl bClassDtlByPrintStatus) {
        _bClassDtlByPrintStatus = bClassDtlByPrintStatus;
    }

    /** B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'. */
    protected BClassDtl _bClassDtlBySheetCollate;

    /**
     * [get] B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'. <br>
     * @return The entity of foreign property 'BClassDtlBySheetCollate'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySheetCollate() {
        return _bClassDtlBySheetCollate;
    }

    /**
     * [set] B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * @param bClassDtlBySheetCollate The entity of foreign property 'BClassDtlBySheetCollate'. (NullAllowed)
     */
    public void setBClassDtlBySheetCollate(BClassDtl bClassDtlBySheetCollate) {
        _bClassDtlBySheetCollate = bClassDtlBySheetCollate;
    }

    /** B_CLASS_DTL by my PRINTED_FLG, named 'BClassDtlByPrintedFlg'. */
    protected BClassDtl _bClassDtlByPrintedFlg;

    /**
     * [get] B_CLASS_DTL by my PRINTED_FLG, named 'BClassDtlByPrintedFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPrintedFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPrintedFlg() {
        return _bClassDtlByPrintedFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PRINTED_FLG, named 'BClassDtlByPrintedFlg'.
     * @param bClassDtlByPrintedFlg The entity of foreign property 'BClassDtlByPrintedFlg'. (NullAllowed)
     */
    public void setBClassDtlByPrintedFlg(BClassDtl bClassDtlByPrintedFlg) {
        _bClassDtlByPrintedFlg = bClassDtlByPrintedFlg;
    }

    /** B_CLASS_DTL by my PRINT_DATA_TYPE, named 'BClassDtlByPrintDataType'. */
    protected BClassDtl _bClassDtlByPrintDataType;

    /**
     * [get] B_CLASS_DTL by my PRINT_DATA_TYPE, named 'BClassDtlByPrintDataType'. <br>
     * @return The entity of foreign property 'BClassDtlByPrintDataType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPrintDataType() {
        return _bClassDtlByPrintDataType;
    }

    /**
     * [set] B_CLASS_DTL by my PRINT_DATA_TYPE, named 'BClassDtlByPrintDataType'.
     * @param bClassDtlByPrintDataType The entity of foreign property 'BClassDtlByPrintDataType'. (NullAllowed)
     */
    public void setBClassDtlByPrintDataType(BClassDtl bClassDtlByPrintDataType) {
        _bClassDtlByPrintDataType = bClassDtlByPrintDataType;
    }

    /** P_PRINT_REQUEST_DATA by PRINT_REQUEST_ID, named 'PPrintRequestDataAsOne'. */
    protected PPrintRequestData _pPrintRequestDataAsOne;

    /**
     * [get] P_PRINT_REQUEST_DATA by PRINT_REQUEST_ID, named 'PPrintRequestDataAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'PPrintRequestDataAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public PPrintRequestData getPPrintRequestDataAsOne() {
        return _pPrintRequestDataAsOne;
    }

    /**
     * [set] P_PRINT_REQUEST_DATA by PRINT_REQUEST_ID, named 'PPrintRequestDataAsOne'.
     * @param PPrintRequestDataAsOne The entity of foreign property(referrer-as-one) 'PPrintRequestDataAsOne'. (NullAllowed)
     */
    public void setPPrintRequestDataAsOne(PPrintRequestData PPrintRequestDataAsOne) {
        _pPrintRequestDataAsOne = PPrintRequestDataAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** P_PRINT_QUEUE by PRINT_REQUEST_ID, named 'PPrintQueueList'. */
    protected List<PPrintQueue> _pPrintQueueList;

    /**
     * [get] P_PRINT_QUEUE by PRINT_REQUEST_ID, named 'PPrintQueueList'.
     * @return The entity list of referrer property 'PPrintQueueList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PPrintQueue> getPPrintQueueList() {
        if (_pPrintQueueList == null) { _pPrintQueueList = newReferrerList(); }
        return _pPrintQueueList;
    }

    /**
     * [set] P_PRINT_QUEUE by PRINT_REQUEST_ID, named 'PPrintQueueList'.
     * @param pPrintQueueList The entity list of referrer property 'PPrintQueueList'. (NullAllowed)
     */
    public void setPPrintQueueList(List<PPrintQueue> pPrintQueueList) {
        _pPrintQueueList = pPrintQueueList;
    }

    /** P_PRINT_REQUEST_BINARY by PRINT_REQUEST_ID, named 'PPrintRequestBinaryList'. */
    protected List<PPrintRequestBinary> _pPrintRequestBinaryList;

    /**
     * [get] P_PRINT_REQUEST_BINARY by PRINT_REQUEST_ID, named 'PPrintRequestBinaryList'.
     * @return The entity list of referrer property 'PPrintRequestBinaryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PPrintRequestBinary> getPPrintRequestBinaryList() {
        if (_pPrintRequestBinaryList == null) { _pPrintRequestBinaryList = newReferrerList(); }
        return _pPrintRequestBinaryList;
    }

    /**
     * [set] P_PRINT_REQUEST_BINARY by PRINT_REQUEST_ID, named 'PPrintRequestBinaryList'.
     * @param pPrintRequestBinaryList The entity list of referrer property 'PPrintRequestBinaryList'. (NullAllowed)
     */
    public void setPPrintRequestBinaryList(List<PPrintRequestBinary> pPrintRequestBinaryList) {
        _pPrintRequestBinaryList = pPrintRequestBinaryList;
    }

    /** P_PRINT_REQUEST_HIST by PRINT_REQUEST_ID, named 'PPrintRequestHistList'. */
    protected List<PPrintRequestHist> _pPrintRequestHistList;

    /**
     * [get] P_PRINT_REQUEST_HIST by PRINT_REQUEST_ID, named 'PPrintRequestHistList'.
     * @return The entity list of referrer property 'PPrintRequestHistList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PPrintRequestHist> getPPrintRequestHistList() {
        if (_pPrintRequestHistList == null) { _pPrintRequestHistList = newReferrerList(); }
        return _pPrintRequestHistList;
    }

    /**
     * [set] P_PRINT_REQUEST_HIST by PRINT_REQUEST_ID, named 'PPrintRequestHistList'.
     * @param pPrintRequestHistList The entity list of referrer property 'PPrintRequestHistList'. (NullAllowed)
     */
    public void setPPrintRequestHistList(List<PPrintRequestHist> pPrintRequestHistList) {
        _pPrintRequestHistList = pPrintRequestHistList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPPrintRequest) {
            BsPPrintRequest other = (BsPPrintRequest)obj;
            if (!xSV(_printRequestId, other._printRequestId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printRequestId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByPrintStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPrintStatus, "bClassDtlByPrintStatus")); }
        if (_bClassDtlBySheetCollate != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySheetCollate, "bClassDtlBySheetCollate")); }
        if (_bClassDtlByPrintedFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPrintedFlg, "bClassDtlByPrintedFlg")); }
        if (_bClassDtlByPrintDataType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPrintDataType, "bClassDtlByPrintDataType")); }
        if (_pPrintRequestDataAsOne != null)
        { sb.append(li).append(xbRDS(_pPrintRequestDataAsOne, "pPrintRequestDataAsOne")); }
        if (_pPrintQueueList != null) { for (PPrintQueue et : _pPrintQueueList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pPrintQueueList")); } } }
        if (_pPrintRequestBinaryList != null) { for (PPrintRequestBinary et : _pPrintRequestBinaryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pPrintRequestBinaryList")); } } }
        if (_pPrintRequestHistList != null) { for (PPrintRequestHist et : _pPrintRequestHistList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pPrintRequestHistList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printRequestId));
        sb.append(dm).append(xfND(_reportCd));
        sb.append(dm).append(xfND(_reportNm));
        sb.append(dm).append(xfND(_reportLayoutNm));
        sb.append(dm).append(xfND(_printerGroupId));
        sb.append(dm).append(xfND(_printerGroupNm));
        sb.append(dm).append(xfND(_printerNm));
        sb.append(dm).append(xfND(_trayNm));
        sb.append(dm).append(xfND(_printNum));
        sb.append(dm).append(xfND(_documentPageSize));
        sb.append(dm).append(xfND(_sheetCollate));
        sb.append(dm).append(xfND(_printStatus));
        sb.append(dm).append(xfND(_firstPrintDt));
        sb.append(dm).append(xfND(_latestPrintDt));
        sb.append(dm).append(xfND(_printedCount));
        sb.append(dm).append(xfND(_printedFlg));
        sb.append(dm).append(xfND(_queueAddDt));
        sb.append(dm).append(xfND(_printDataType));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByPrintStatus != null)
        { sb.append(dm).append("bClassDtlByPrintStatus"); }
        if (_bClassDtlBySheetCollate != null)
        { sb.append(dm).append("bClassDtlBySheetCollate"); }
        if (_bClassDtlByPrintedFlg != null)
        { sb.append(dm).append("bClassDtlByPrintedFlg"); }
        if (_bClassDtlByPrintDataType != null)
        { sb.append(dm).append("bClassDtlByPrintDataType"); }
        if (_pPrintRequestDataAsOne != null)
        { sb.append(dm).append("pPrintRequestDataAsOne"); }
        if (_pPrintQueueList != null && !_pPrintQueueList.isEmpty())
        { sb.append(dm).append("pPrintQueueList"); }
        if (_pPrintRequestBinaryList != null && !_pPrintRequestBinaryList.isEmpty())
        { sb.append(dm).append("pPrintRequestBinaryList"); }
        if (_pPrintRequestHistList != null && !_pPrintRequestHistList.isEmpty())
        { sb.append(dm).append("pPrintRequestHistList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PPrintRequest clone() {
        return (PPrintRequest)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintRequestId() {
        checkSpecifiedProperty("printRequestId");
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintRequestId(Long printRequestId) {
        registerModifiedProperty("printRequestId");
        _printRequestId = printRequestId;
    }

    /**
     * [get] REPORT_CD: {NotNull, varchar(100)} <br>
     * 帳票CD
     * @return The value of the column 'REPORT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReportCd() {
        checkSpecifiedProperty("reportCd");
        return convertEmptyToNull(_reportCd);
    }

    /**
     * [set] REPORT_CD: {NotNull, varchar(100)} <br>
     * 帳票CD
     * @param reportCd The value of the column 'REPORT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReportCd(String reportCd) {
        registerModifiedProperty("reportCd");
        _reportCd = reportCd;
    }

    /**
     * [get] REPORT_NM: {NotNull, varchar(60)} <br>
     * 帳票名称
     * @return The value of the column 'REPORT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getReportNm() {
        checkSpecifiedProperty("reportNm");
        return convertEmptyToNull(_reportNm);
    }

    /**
     * [set] REPORT_NM: {NotNull, varchar(60)} <br>
     * 帳票名称
     * @param reportNm The value of the column 'REPORT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setReportNm(String reportNm) {
        registerModifiedProperty("reportNm");
        _reportNm = reportNm;
    }

    /**
     * [get] REPORT_LAYOUT_NM: {varchar(60)} <br>
     * 帳票レイアウト名称
     * @return The value of the column 'REPORT_LAYOUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReportLayoutNm() {
        checkSpecifiedProperty("reportLayoutNm");
        return convertEmptyToNull(_reportLayoutNm);
    }

    /**
     * [set] REPORT_LAYOUT_NM: {varchar(60)} <br>
     * 帳票レイアウト名称
     * @param reportLayoutNm The value of the column 'REPORT_LAYOUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportLayoutNm(String reportLayoutNm) {
        registerModifiedProperty("reportLayoutNm");
        _reportLayoutNm = reportLayoutNm;
    }

    /**
     * [get] PRINTER_GROUP_ID: {NotNull, bigint(19)} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrinterGroupId() {
        checkSpecifiedProperty("printerGroupId");
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {NotNull, bigint(19)} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        registerModifiedProperty("printerGroupId");
        _printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINTER_GROUP_NM: {NotNull, varchar(60)} <br>
     * プリンタグループ名称
     * @return The value of the column 'PRINTER_GROUP_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getPrinterGroupNm() {
        checkSpecifiedProperty("printerGroupNm");
        return convertEmptyToNull(_printerGroupNm);
    }

    /**
     * [set] PRINTER_GROUP_NM: {NotNull, varchar(60)} <br>
     * プリンタグループ名称
     * @param printerGroupNm The value of the column 'PRINTER_GROUP_NM'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterGroupNm(String printerGroupNm) {
        registerModifiedProperty("printerGroupNm");
        _printerGroupNm = printerGroupNm;
    }

    /**
     * [get] PRINTER_NM: {varchar(60)} <br>
     * プリンタ名称
     * @return The value of the column 'PRINTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrinterNm() {
        checkSpecifiedProperty("printerNm");
        return convertEmptyToNull(_printerNm);
    }

    /**
     * [set] PRINTER_NM: {varchar(60)} <br>
     * プリンタ名称
     * @param printerNm The value of the column 'PRINTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrinterNm(String printerNm) {
        registerModifiedProperty("printerNm");
        _printerNm = printerNm;
    }

    /**
     * [get] TRAY_NM: {varchar(60)} <br>
     * トレイ名称
     * @return The value of the column 'TRAY_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrayNm() {
        checkSpecifiedProperty("trayNm");
        return convertEmptyToNull(_trayNm);
    }

    /**
     * [set] TRAY_NM: {varchar(60)} <br>
     * トレイ名称
     * @param trayNm The value of the column 'TRAY_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrayNm(String trayNm) {
        registerModifiedProperty("trayNm");
        _trayNm = trayNm;
    }

    /**
     * [get] PRINT_NUM: {bigint(19)} <br>
     * 印刷部数
     * @return The value of the column 'PRINT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrintNum() {
        checkSpecifiedProperty("printNum");
        return _printNum;
    }

    /**
     * [set] PRINT_NUM: {bigint(19)} <br>
     * 印刷部数
     * @param printNum The value of the column 'PRINT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintNum(Long printNum) {
        registerModifiedProperty("printNum");
        _printNum = printNum;
    }

    /**
     * [get] DOCUMENT_PAGE_SIZE: {bigint(19)} <br>
     * ページ総数
     * @return The value of the column 'DOCUMENT_PAGE_SIZE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDocumentPageSize() {
        checkSpecifiedProperty("documentPageSize");
        return _documentPageSize;
    }

    /**
     * [set] DOCUMENT_PAGE_SIZE: {bigint(19)} <br>
     * ページ総数
     * @param documentPageSize The value of the column 'DOCUMENT_PAGE_SIZE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDocumentPageSize(Long documentPageSize) {
        registerModifiedProperty("documentPageSize");
        _documentPageSize = documentPageSize;
    }

    /**
     * [get] SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @return The value of the column 'SHEET_COLLATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSheetCollate() {
        checkSpecifiedProperty("sheetCollate");
        return convertEmptyToNull(_sheetCollate);
    }

    /**
     * [set] SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @param sheetCollate The value of the column 'SHEET_COLLATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSheetCollate(String sheetCollate) {
        registerModifiedProperty("sheetCollate");
        _sheetCollate = sheetCollate;
    }

    /**
     * [get] PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @return The value of the column 'PRINT_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintStatus() {
        checkSpecifiedProperty("printStatus");
        return convertEmptyToNull(_printStatus);
    }

    /**
     * [set] PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @param printStatus The value of the column 'PRINT_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setPrintStatus(String printStatus) {
        registerModifiedProperty("printStatus");
        _printStatus = printStatus;
    }

    /**
     * [get] FIRST_PRINT_DT: {datetime2(26, 6)} <br>
     * 初回印刷日時
     * @return The value of the column 'FIRST_PRINT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFirstPrintDt() {
        checkSpecifiedProperty("firstPrintDt");
        return _firstPrintDt;
    }

    /**
     * [set] FIRST_PRINT_DT: {datetime2(26, 6)} <br>
     * 初回印刷日時
     * @param firstPrintDt The value of the column 'FIRST_PRINT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstPrintDt(java.sql.Timestamp firstPrintDt) {
        registerModifiedProperty("firstPrintDt");
        _firstPrintDt = firstPrintDt;
    }

    /**
     * [get] LATEST_PRINT_DT: {datetime2(26, 6)} <br>
     * 最終印刷日時
     * @return The value of the column 'LATEST_PRINT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getLatestPrintDt() {
        checkSpecifiedProperty("latestPrintDt");
        return _latestPrintDt;
    }

    /**
     * [set] LATEST_PRINT_DT: {datetime2(26, 6)} <br>
     * 最終印刷日時
     * @param latestPrintDt The value of the column 'LATEST_PRINT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLatestPrintDt(java.sql.Timestamp latestPrintDt) {
        registerModifiedProperty("latestPrintDt");
        _latestPrintDt = latestPrintDt;
    }

    /**
     * [get] PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]} <br>
     * 印刷回数
     * @return The value of the column 'PRINTED_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintedCount() {
        checkSpecifiedProperty("printedCount");
        return _printedCount;
    }

    /**
     * [set] PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]} <br>
     * 印刷回数
     * @param printedCount The value of the column 'PRINTED_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedCount(Long printedCount) {
        registerModifiedProperty("printedCount");
        _printedCount = printedCount;
    }

    /**
     * [get] PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @return The value of the column 'PRINTED_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintedFlg() {
        checkSpecifiedProperty("printedFlg");
        return convertEmptyToNull(_printedFlg);
    }

    /**
     * [set] PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @param printedFlg The value of the column 'PRINTED_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedFlg(String printedFlg) {
        registerModifiedProperty("printedFlg");
        _printedFlg = printedFlg;
    }

    /**
     * [get] QUEUE_ADD_DT: {IX, datetime2(26, 6)} <br>
     * キュー登録日時
     * @return The value of the column 'QUEUE_ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getQueueAddDt() {
        checkSpecifiedProperty("queueAddDt");
        return _queueAddDt;
    }

    /**
     * [set] QUEUE_ADD_DT: {IX, datetime2(26, 6)} <br>
     * キュー登録日時
     * @param queueAddDt The value of the column 'QUEUE_ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQueueAddDt(java.sql.Timestamp queueAddDt) {
        registerModifiedProperty("queueAddDt");
        _queueAddDt = queueAddDt;
    }

    /**
     * [get] PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @return The value of the column 'PRINT_DATA_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintDataType() {
        checkSpecifiedProperty("printDataType");
        return convertEmptyToNull(_printDataType);
    }

    /**
     * [set] PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @param printDataType The value of the column 'PRINT_DATA_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setPrintDataType(String printDataType) {
        registerModifiedProperty("printDataType");
        _printDataType = printDataType;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
