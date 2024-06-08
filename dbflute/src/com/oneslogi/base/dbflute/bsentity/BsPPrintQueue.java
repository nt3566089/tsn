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
 * The entity of P_PRINT_QUEUE as TABLE. <br>
 * 印刷キュー情報
 * <pre>
 * [primary-key]
 *     PRINT_QUEUE_ID
 *
 * [column]
 *     PRINT_QUEUE_ID, PRINT_REQUEST_ID, PRINTER_GROUP_ID, PRINT_QUEUE_STATUS, PRINTER_NM, TRAY_NM, PRINT_NUM, SHEET_COLLATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_QUEUE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(ByPrintQueueStatus)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrintRequest, bClassDtlByPrintQueueStatus
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long printQueueId = entity.getPrintQueueId();
 * Long printRequestId = entity.getPrintRequestId();
 * Long printerGroupId = entity.getPrinterGroupId();
 * String printQueueStatus = entity.getPrintQueueStatus();
 * String printerNm = entity.getPrinterNm();
 * String trayNm = entity.getTrayNm();
 * Long printNum = entity.getPrintNum();
 * String sheetCollate = entity.getSheetCollate();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPrintQueueId(printQueueId);
 * entity.setPrintRequestId(printRequestId);
 * entity.setPrinterGroupId(printerGroupId);
 * entity.setPrintQueueStatus(printQueueStatus);
 * entity.setPrinterNm(printerNm);
 * entity.setTrayNm(trayNm);
 * entity.setPrintNum(printNum);
 * entity.setSheetCollate(sheetCollate);
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
public abstract class BsPPrintQueue extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _printQueueId;

    /** PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} */
    protected Long _printRequestId;

    /** PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)} */
    protected Long _printerGroupId;

    /** PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} */
    protected String _printQueueStatus;

    /** PRINTER_NM: {varchar(60)} */
    protected String _printerNm;

    /** TRAY_NM: {varchar(60)} */
    protected String _trayNm;

    /** PRINT_NUM: {bigint(19)} */
    protected Long _printNum;

    /** SHEET_COLLATE: {char(1)} */
    protected String _sheetCollate;

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
        return "P_PRINT_QUEUE";
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
        if (_printQueueId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of printQueueStatus as the classification of PrintQueueStatus. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PrintQueueStatus getPrintQueueStatusAsPrintQueueStatus() {
        return CDef.PrintQueueStatus.codeOf(getPrintQueueStatus());
    }

    /**
     * Set the value of printQueueStatus as the classification of PrintQueueStatus. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPrintQueueStatusAsPrintQueueStatus(CDef.PrintQueueStatus cdef) {
        setPrintQueueStatus(cdef != null ? cdef.code() : null);
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
     * Set the value of printQueueStatus as $0 (0). <br>
     * $0: 未印刷
     */
    public void setPrintQueueStatus_$0() {
        setPrintQueueStatusAsPrintQueueStatus(CDef.PrintQueueStatus.$0);
    }

    /**
     * Set the value of printQueueStatus as $1 (1). <br>
     * $1: 印刷中
     */
    public void setPrintQueueStatus_$1() {
        setPrintQueueStatusAsPrintQueueStatus(CDef.PrintQueueStatus.$1);
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
     * Is the value of printQueueStatus $0? <br>
     * $0: 未印刷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintQueueStatus$0() {
        CDef.PrintQueueStatus cdef = getPrintQueueStatusAsPrintQueueStatus();
        return cdef != null ? cdef.equals(CDef.PrintQueueStatus.$0) : false;
    }

    /**
     * Is the value of printQueueStatus $1? <br>
     * $1: 印刷中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintQueueStatus$1() {
        CDef.PrintQueueStatus cdef = getPrintQueueStatusAsPrintQueueStatus();
        return cdef != null ? cdef.equals(CDef.PrintQueueStatus.$1) : false;
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
     * Get the value of the column 'printQueueStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPrintQueueStatusName() {
        CDef.PrintQueueStatus cdef = getPrintQueueStatusAsPrintQueueStatus();
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

    /** B_CLASS_DTL by my PRINT_QUEUE_STATUS, named 'BClassDtlByPrintQueueStatus'. */
    protected BClassDtl _bClassDtlByPrintQueueStatus;

    /**
     * [get] B_CLASS_DTL by my PRINT_QUEUE_STATUS, named 'BClassDtlByPrintQueueStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByPrintQueueStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPrintQueueStatus() {
        return _bClassDtlByPrintQueueStatus;
    }

    /**
     * [set] B_CLASS_DTL by my PRINT_QUEUE_STATUS, named 'BClassDtlByPrintQueueStatus'.
     * @param bClassDtlByPrintQueueStatus The entity of foreign property 'BClassDtlByPrintQueueStatus'. (NullAllowed)
     */
    public void setBClassDtlByPrintQueueStatus(BClassDtl bClassDtlByPrintQueueStatus) {
        _bClassDtlByPrintQueueStatus = bClassDtlByPrintQueueStatus;
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
        if (obj instanceof BsPPrintQueue) {
            BsPPrintQueue other = (BsPPrintQueue)obj;
            if (!xSV(_printQueueId, other._printQueueId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printQueueId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pPrintRequest != null)
        { sb.append(li).append(xbRDS(_pPrintRequest, "pPrintRequest")); }
        if (_bClassDtlByPrintQueueStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPrintQueueStatus, "bClassDtlByPrintQueueStatus")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printQueueId));
        sb.append(dm).append(xfND(_printRequestId));
        sb.append(dm).append(xfND(_printerGroupId));
        sb.append(dm).append(xfND(_printQueueStatus));
        sb.append(dm).append(xfND(_printerNm));
        sb.append(dm).append(xfND(_trayNm));
        sb.append(dm).append(xfND(_printNum));
        sb.append(dm).append(xfND(_sheetCollate));
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
        if (_bClassDtlByPrintQueueStatus != null)
        { sb.append(dm).append("bClassDtlByPrintQueueStatus"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PPrintQueue clone() {
        return (PPrintQueue)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷キューID
     * @return The value of the column 'PRINT_QUEUE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintQueueId() {
        checkSpecifiedProperty("printQueueId");
        return _printQueueId;
    }

    /**
     * [set] PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷キューID
     * @param printQueueId The value of the column 'PRINT_QUEUE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintQueueId(Long printQueueId) {
        registerModifiedProperty("printQueueId");
        _printQueueId = printQueueId;
    }

    /**
     * [get] PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintRequestId() {
        checkSpecifiedProperty("printRequestId");
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintRequestId(Long printRequestId) {
        registerModifiedProperty("printRequestId");
        _printRequestId = printRequestId;
    }

    /**
     * [get] PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrinterGroupId() {
        checkSpecifiedProperty("printerGroupId");
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        registerModifiedProperty("printerGroupId");
        _printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @return The value of the column 'PRINT_QUEUE_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintQueueStatus() {
        checkSpecifiedProperty("printQueueStatus");
        return convertEmptyToNull(_printQueueStatus);
    }

    /**
     * [set] PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @param printQueueStatus The value of the column 'PRINT_QUEUE_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setPrintQueueStatus(String printQueueStatus) {
        registerModifiedProperty("printQueueStatus");
        _printQueueStatus = printQueueStatus;
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
     * [get] SHEET_COLLATE: {char(1)} <br>
     * 部単位印刷要否
     * @return The value of the column 'SHEET_COLLATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSheetCollate() {
        checkSpecifiedProperty("sheetCollate");
        return convertEmptyToNull(_sheetCollate);
    }

    /**
     * [set] SHEET_COLLATE: {char(1)} <br>
     * 部単位印刷要否
     * @param sheetCollate The value of the column 'SHEET_COLLATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSheetCollate(String sheetCollate) {
        registerModifiedProperty("sheetCollate");
        _sheetCollate = sheetCollate;
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
