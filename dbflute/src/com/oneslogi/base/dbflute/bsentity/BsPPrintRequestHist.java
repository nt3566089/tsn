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
 * The entity of P_PRINT_REQUEST_HIST as TABLE. <br>
 * 印刷履歴情報
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_HIST_ID
 *
 * [column]
 *     PRINT_REQUEST_HIST_ID, PRINT_REQUEST_ID, PRINT_REQUEST_NO, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_RESULT_CLASS, PROCESS_INFO, QUEUE_ADD_DT, PRINT_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_HIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(BySheetCollate)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrintRequest, bClassDtlBySheetCollate, bClassDtlByPrintResultClass
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long printRequestHistId = entity.getPrintRequestHistId();
 * Long printRequestId = entity.getPrintRequestId();
 * Long printRequestNo = entity.getPrintRequestNo();
 * String printerNm = entity.getPrinterNm();
 * String trayNm = entity.getTrayNm();
 * Long printNum = entity.getPrintNum();
 * Long documentPageSize = entity.getDocumentPageSize();
 * String sheetCollate = entity.getSheetCollate();
 * String printResultClass = entity.getPrintResultClass();
 * String processInfo = entity.getProcessInfo();
 * java.sql.Timestamp queueAddDt = entity.getQueueAddDt();
 * java.sql.Timestamp printDt = entity.getPrintDt();
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
 * entity.setPrintRequestHistId(printRequestHistId);
 * entity.setPrintRequestId(printRequestId);
 * entity.setPrintRequestNo(printRequestNo);
 * entity.setPrinterNm(printerNm);
 * entity.setTrayNm(trayNm);
 * entity.setPrintNum(printNum);
 * entity.setDocumentPageSize(documentPageSize);
 * entity.setSheetCollate(sheetCollate);
 * entity.setPrintResultClass(printResultClass);
 * entity.setProcessInfo(processInfo);
 * entity.setQueueAddDt(queueAddDt);
 * entity.setPrintDt(printDt);
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
public abstract class BsPPrintRequestHist extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _printRequestHistId;

    /** PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} */
    protected Long _printRequestId;

    /** PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)} */
    protected Long _printRequestNo;

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

    /** PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} */
    protected String _printResultClass;

    /** PROCESS_INFO: {varchar(2147483647)} */
    protected String _processInfo;

    /** QUEUE_ADD_DT: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _queueAddDt;

    /** PRINT_DT: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _printDt;

    /** PRINT_DATA_TYPE: {NotNull, char(1)} */
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
        return "P_PRINT_REQUEST_HIST";
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
        if (_printRequestHistId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param printRequestId : UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST. (NotNull)
     * @param printRequestNo : +UQ, NotNull, bigint(19). (NotNull)
     */
    public void uniqueBy(Long printRequestId, Long printRequestNo) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("printRequestId");
        __uniqueDrivenProperties.addPropertyName("printRequestNo");
        setPrintRequestId(printRequestId);setPrintRequestNo(printRequestNo);
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
     * Get the value of printResultClass as the classification of PrintResultClass. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PrintResultClass getPrintResultClassAsPrintResultClass() {
        return CDef.PrintResultClass.codeOf(getPrintResultClass());
    }

    /**
     * Set the value of printResultClass as the classification of PrintResultClass. <br>
     * PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPrintResultClassAsPrintResultClass(CDef.PrintResultClass cdef) {
        setPrintResultClass(cdef != null ? cdef.code() : null);
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
     * Set the value of printResultClass as $0 (0). <br>
     * $0: 印刷成功
     */
    public void setPrintResultClass_$0() {
        setPrintResultClassAsPrintResultClass(CDef.PrintResultClass.$0);
    }

    /**
     * Set the value of printResultClass as $9 (9). <br>
     * $9: 印刷失敗
     */
    public void setPrintResultClass_$9() {
        setPrintResultClassAsPrintResultClass(CDef.PrintResultClass.$9);
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
     * Is the value of printResultClass $0? <br>
     * $0: 印刷成功
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintResultClass$0() {
        CDef.PrintResultClass cdef = getPrintResultClassAsPrintResultClass();
        return cdef != null ? cdef.equals(CDef.PrintResultClass.$0) : false;
    }

    /**
     * Is the value of printResultClass $9? <br>
     * $9: 印刷失敗
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintResultClass$9() {
        CDef.PrintResultClass cdef = getPrintResultClassAsPrintResultClass();
        return cdef != null ? cdef.equals(CDef.PrintResultClass.$9) : false;
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
     * Get the value of the column 'printResultClass' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPrintResultClassName() {
        CDef.PrintResultClass cdef = getPrintResultClassAsPrintResultClass();
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
    /** P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'. */
    protected PPrintRequest _pPrintRequest;

    /**
     * [get] P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'. <br>
     * @return The entity of foreign property 'PPrintRequest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PPrintRequest getPPrintRequest() {
        return _pPrintRequest;
    }

    /**
     * [set] P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @param pPrintRequest The entity of foreign property 'PPrintRequest'. (NullAllowed)
     */
    public void setPPrintRequest(PPrintRequest pPrintRequest) {
        _pPrintRequest = pPrintRequest;
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

    /** B_CLASS_DTL by my PRINT_RESULT_CLASS, named 'BClassDtlByPrintResultClass'. */
    protected BClassDtl _bClassDtlByPrintResultClass;

    /**
     * [get] B_CLASS_DTL by my PRINT_RESULT_CLASS, named 'BClassDtlByPrintResultClass'. <br>
     * @return The entity of foreign property 'BClassDtlByPrintResultClass'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPrintResultClass() {
        return _bClassDtlByPrintResultClass;
    }

    /**
     * [set] B_CLASS_DTL by my PRINT_RESULT_CLASS, named 'BClassDtlByPrintResultClass'.
     * @param bClassDtlByPrintResultClass The entity of foreign property 'BClassDtlByPrintResultClass'. (NullAllowed)
     */
    public void setBClassDtlByPrintResultClass(BClassDtl bClassDtlByPrintResultClass) {
        _bClassDtlByPrintResultClass = bClassDtlByPrintResultClass;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPPrintRequestHist) {
            BsPPrintRequestHist other = (BsPPrintRequestHist)obj;
            if (!xSV(_printRequestHistId, other._printRequestHistId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printRequestHistId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pPrintRequest != null)
        { sb.append(li).append(xbRDS(_pPrintRequest, "pPrintRequest")); }
        if (_bClassDtlBySheetCollate != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySheetCollate, "bClassDtlBySheetCollate")); }
        if (_bClassDtlByPrintResultClass != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPrintResultClass, "bClassDtlByPrintResultClass")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printRequestHistId));
        sb.append(dm).append(xfND(_printRequestId));
        sb.append(dm).append(xfND(_printRequestNo));
        sb.append(dm).append(xfND(_printerNm));
        sb.append(dm).append(xfND(_trayNm));
        sb.append(dm).append(xfND(_printNum));
        sb.append(dm).append(xfND(_documentPageSize));
        sb.append(dm).append(xfND(_sheetCollate));
        sb.append(dm).append(xfND(_printResultClass));
        sb.append(dm).append(xfND(_processInfo));
        sb.append(dm).append(xfND(_queueAddDt));
        sb.append(dm).append(xfND(_printDt));
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
        if (_pPrintRequest != null)
        { sb.append(dm).append("pPrintRequest"); }
        if (_bClassDtlBySheetCollate != null)
        { sb.append(dm).append("bClassDtlBySheetCollate"); }
        if (_bClassDtlByPrintResultClass != null)
        { sb.append(dm).append("bClassDtlByPrintResultClass"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PPrintRequestHist clone() {
        return (PPrintRequestHist)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷履歴ID
     * @return The value of the column 'PRINT_REQUEST_HIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintRequestHistId() {
        checkSpecifiedProperty("printRequestHistId");
        return _printRequestHistId;
    }

    /**
     * [set] PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷履歴ID
     * @param printRequestHistId The value of the column 'PRINT_REQUEST_HIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintRequestHistId(Long printRequestHistId) {
        registerModifiedProperty("printRequestHistId");
        _printRequestHistId = printRequestHistId;
    }

    /**
     * [get] PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintRequestId() {
        checkSpecifiedProperty("printRequestId");
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintRequestId(Long printRequestId) {
        registerModifiedProperty("printRequestId");
        _printRequestId = printRequestId;
    }

    /**
     * [get] PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)} <br>
     * 印刷No.
     * @return The value of the column 'PRINT_REQUEST_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintRequestNo() {
        checkSpecifiedProperty("printRequestNo");
        return _printRequestNo;
    }

    /**
     * [set] PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)} <br>
     * 印刷No.
     * @param printRequestNo The value of the column 'PRINT_REQUEST_NO'. (basically NotNull if update: for the constraint)
     */
    public void setPrintRequestNo(Long printRequestNo) {
        registerModifiedProperty("printRequestNo");
        _printRequestNo = printRequestNo;
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
     * [get] PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @return The value of the column 'PRINT_RESULT_CLASS'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintResultClass() {
        checkSpecifiedProperty("printResultClass");
        return convertEmptyToNull(_printResultClass);
    }

    /**
     * [set] PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @param printResultClass The value of the column 'PRINT_RESULT_CLASS'. (basically NotNull if update: for the constraint)
     */
    public void setPrintResultClass(String printResultClass) {
        registerModifiedProperty("printResultClass");
        _printResultClass = printResultClass;
    }

    /**
     * [get] PROCESS_INFO: {varchar(2147483647)} <br>
     * 処理情報
     * @return The value of the column 'PROCESS_INFO'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessInfo() {
        checkSpecifiedProperty("processInfo");
        return convertEmptyToNull(_processInfo);
    }

    /**
     * [set] PROCESS_INFO: {varchar(2147483647)} <br>
     * 処理情報
     * @param processInfo The value of the column 'PROCESS_INFO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessInfo(String processInfo) {
        registerModifiedProperty("processInfo");
        _processInfo = processInfo;
    }

    /**
     * [get] QUEUE_ADD_DT: {NotNull, datetime2(26, 6)} <br>
     * キュー登録日時
     * @return The value of the column 'QUEUE_ADD_DT'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getQueueAddDt() {
        checkSpecifiedProperty("queueAddDt");
        return _queueAddDt;
    }

    /**
     * [set] QUEUE_ADD_DT: {NotNull, datetime2(26, 6)} <br>
     * キュー登録日時
     * @param queueAddDt The value of the column 'QUEUE_ADD_DT'. (basically NotNull if update: for the constraint)
     */
    public void setQueueAddDt(java.sql.Timestamp queueAddDt) {
        registerModifiedProperty("queueAddDt");
        _queueAddDt = queueAddDt;
    }

    /**
     * [get] PRINT_DT: {NotNull, datetime2(26, 6)} <br>
     * 印刷日時
     * @return The value of the column 'PRINT_DT'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPrintDt() {
        checkSpecifiedProperty("printDt");
        return _printDt;
    }

    /**
     * [set] PRINT_DT: {NotNull, datetime2(26, 6)} <br>
     * 印刷日時
     * @param printDt The value of the column 'PRINT_DT'. (basically NotNull if update: for the constraint)
     */
    public void setPrintDt(java.sql.Timestamp printDt) {
        registerModifiedProperty("printDt");
        _printDt = printDt;
    }

    /**
     * [get] PRINT_DATA_TYPE: {NotNull, char(1)} <br>
     * 印刷データタイプ
     * @return The value of the column 'PRINT_DATA_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintDataType() {
        checkSpecifiedProperty("printDataType");
        return convertEmptyToNull(_printDataType);
    }

    /**
     * [set] PRINT_DATA_TYPE: {NotNull, char(1)} <br>
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
