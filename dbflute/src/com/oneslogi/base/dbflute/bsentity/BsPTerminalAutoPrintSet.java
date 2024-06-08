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
 * The entity of P_TERMINAL_AUTO_PRINT_SET as TABLE. <br>
 * 端末別自動印刷設定マスタ
 * <pre>
 * [primary-key]
 *     TERMINAL_AUTO_PRINT_SET_ID
 *
 * [column]
 *     TERMINAL_AUTO_PRINT_SET_ID, TERMINAL_ASSIGN_CD, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TERMINAL_AUTO_PRINT_SET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_REPORT_LAYOUT(ByReportLayoutId), P_PRINTER_GROUP(ByPrinterGroupId), P_PRINTER(ByPrinterId), P_PRINTER_ATTRIBUTE(ByPrinterAttributeId)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pReportLayoutByReportLayoutId, pPrinterGroupByPrinterGroupId, pPrinterByPrinterId, pPrinterAttributeByPrinterAttributeId
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long terminalAutoPrintSetId = entity.getTerminalAutoPrintSetId();
 * String terminalAssignCd = entity.getTerminalAssignCd();
 * Long reportLayoutId = entity.getReportLayoutId();
 * Long printerGroupId = entity.getPrinterGroupId();
 * Long printerId = entity.getPrinterId();
 * Long printerAttributeId = entity.getPrinterAttributeId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTerminalAutoPrintSetId(terminalAutoPrintSetId);
 * entity.setTerminalAssignCd(terminalAssignCd);
 * entity.setReportLayoutId(reportLayoutId);
 * entity.setPrinterGroupId(printerGroupId);
 * entity.setPrinterId(printerId);
 * entity.setPrinterAttributeId(printerAttributeId);
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
public abstract class BsPTerminalAutoPrintSet extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _terminalAutoPrintSetId;

    /** TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)} */
    protected String _terminalAssignCd;

    /** REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} */
    protected Long _reportLayoutId;

    /** PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP} */
    protected Long _printerGroupId;

    /** PRINTER_ID: {IX, bigint(19), FK to P_PRINTER} */
    protected Long _printerId;

    /** PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE} */
    protected Long _printerAttributeId;

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
        return "P_TERMINAL_AUTO_PRINT_SET";
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
        if (_terminalAutoPrintSetId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param terminalAssignCd : UQ+, IX, NotNull, varchar(100). (NotNull)
     * @param reportLayoutId : +UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT. (NotNull)
     */
    public void uniqueBy(String terminalAssignCd, Long reportLayoutId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("terminalAssignCd");
        __uniqueDrivenProperties.addPropertyName("reportLayoutId");
        setTerminalAssignCd(terminalAssignCd);setReportLayoutId(reportLayoutId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
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
    /** P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'. */
    protected PReportLayout _pReportLayoutByReportLayoutId;

    /**
     * [get] P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'. <br>
     * @return The entity of foreign property 'PReportLayoutByReportLayoutId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PReportLayout getPReportLayoutByReportLayoutId() {
        return _pReportLayoutByReportLayoutId;
    }

    /**
     * [set] P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * @param pReportLayoutByReportLayoutId The entity of foreign property 'PReportLayoutByReportLayoutId'. (NullAllowed)
     */
    public void setPReportLayoutByReportLayoutId(PReportLayout pReportLayoutByReportLayoutId) {
        _pReportLayoutByReportLayoutId = pReportLayoutByReportLayoutId;
    }

    /** P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'. */
    protected PPrinterGroup _pPrinterGroupByPrinterGroupId;

    /**
     * [get] P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'. <br>
     * @return The entity of foreign property 'PPrinterGroupByPrinterGroupId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PPrinterGroup getPPrinterGroupByPrinterGroupId() {
        return _pPrinterGroupByPrinterGroupId;
    }

    /**
     * [set] P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     * @param pPrinterGroupByPrinterGroupId The entity of foreign property 'PPrinterGroupByPrinterGroupId'. (NullAllowed)
     */
    public void setPPrinterGroupByPrinterGroupId(PPrinterGroup pPrinterGroupByPrinterGroupId) {
        _pPrinterGroupByPrinterGroupId = pPrinterGroupByPrinterGroupId;
    }

    /** P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'. */
    protected PPrinter _pPrinterByPrinterId;

    /**
     * [get] P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'. <br>
     * @return The entity of foreign property 'PPrinterByPrinterId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PPrinter getPPrinterByPrinterId() {
        return _pPrinterByPrinterId;
    }

    /**
     * [set] P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * @param pPrinterByPrinterId The entity of foreign property 'PPrinterByPrinterId'. (NullAllowed)
     */
    public void setPPrinterByPrinterId(PPrinter pPrinterByPrinterId) {
        _pPrinterByPrinterId = pPrinterByPrinterId;
    }

    /** P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'. */
    protected PPrinterAttribute _pPrinterAttributeByPrinterAttributeId;

    /**
     * [get] P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'. <br>
     * @return The entity of foreign property 'PPrinterAttributeByPrinterAttributeId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PPrinterAttribute getPPrinterAttributeByPrinterAttributeId() {
        return _pPrinterAttributeByPrinterAttributeId;
    }

    /**
     * [set] P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * @param pPrinterAttributeByPrinterAttributeId The entity of foreign property 'PPrinterAttributeByPrinterAttributeId'. (NullAllowed)
     */
    public void setPPrinterAttributeByPrinterAttributeId(PPrinterAttribute pPrinterAttributeByPrinterAttributeId) {
        _pPrinterAttributeByPrinterAttributeId = pPrinterAttributeByPrinterAttributeId;
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
        if (obj instanceof BsPTerminalAutoPrintSet) {
            BsPTerminalAutoPrintSet other = (BsPTerminalAutoPrintSet)obj;
            if (!xSV(_terminalAutoPrintSetId, other._terminalAutoPrintSetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _terminalAutoPrintSetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pReportLayoutByReportLayoutId != null)
        { sb.append(li).append(xbRDS(_pReportLayoutByReportLayoutId, "pReportLayoutByReportLayoutId")); }
        if (_pPrinterGroupByPrinterGroupId != null)
        { sb.append(li).append(xbRDS(_pPrinterGroupByPrinterGroupId, "pPrinterGroupByPrinterGroupId")); }
        if (_pPrinterByPrinterId != null)
        { sb.append(li).append(xbRDS(_pPrinterByPrinterId, "pPrinterByPrinterId")); }
        if (_pPrinterAttributeByPrinterAttributeId != null)
        { sb.append(li).append(xbRDS(_pPrinterAttributeByPrinterAttributeId, "pPrinterAttributeByPrinterAttributeId")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_terminalAutoPrintSetId));
        sb.append(dm).append(xfND(_terminalAssignCd));
        sb.append(dm).append(xfND(_reportLayoutId));
        sb.append(dm).append(xfND(_printerGroupId));
        sb.append(dm).append(xfND(_printerId));
        sb.append(dm).append(xfND(_printerAttributeId));
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
        if (_pReportLayoutByReportLayoutId != null)
        { sb.append(dm).append("pReportLayoutByReportLayoutId"); }
        if (_pPrinterGroupByPrinterGroupId != null)
        { sb.append(dm).append("pPrinterGroupByPrinterGroupId"); }
        if (_pPrinterByPrinterId != null)
        { sb.append(dm).append("pPrinterByPrinterId"); }
        if (_pPrinterAttributeByPrinterAttributeId != null)
        { sb.append(dm).append("pPrinterAttributeByPrinterAttributeId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PTerminalAutoPrintSet clone() {
        return (PTerminalAutoPrintSet)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 端末別自動印刷設定ID
     * @return The value of the column 'TERMINAL_AUTO_PRINT_SET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTerminalAutoPrintSetId() {
        checkSpecifiedProperty("terminalAutoPrintSetId");
        return _terminalAutoPrintSetId;
    }

    /**
     * [set] TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 端末別自動印刷設定ID
     * @param terminalAutoPrintSetId The value of the column 'TERMINAL_AUTO_PRINT_SET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTerminalAutoPrintSetId(Long terminalAutoPrintSetId) {
        registerModifiedProperty("terminalAutoPrintSetId");
        _terminalAutoPrintSetId = terminalAutoPrintSetId;
    }

    /**
     * [get] TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)} <br>
     * 端末識別CD
     * @return The value of the column 'TERMINAL_ASSIGN_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getTerminalAssignCd() {
        checkSpecifiedProperty("terminalAssignCd");
        return convertEmptyToNull(_terminalAssignCd);
    }

    /**
     * [set] TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)} <br>
     * 端末識別CD
     * @param terminalAssignCd The value of the column 'TERMINAL_ASSIGN_CD'. (basically NotNull if update: for the constraint)
     */
    public void setTerminalAssignCd(String terminalAssignCd) {
        registerModifiedProperty("terminalAssignCd");
        _terminalAssignCd = terminalAssignCd;
    }

    /**
     * [get] REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} <br>
     * 帳票レイアウトID
     * @return The value of the column 'REPORT_LAYOUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReportLayoutId() {
        checkSpecifiedProperty("reportLayoutId");
        return _reportLayoutId;
    }

    /**
     * [set] REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} <br>
     * 帳票レイアウトID
     * @param reportLayoutId The value of the column 'REPORT_LAYOUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReportLayoutId(Long reportLayoutId) {
        registerModifiedProperty("reportLayoutId");
        _reportLayoutId = reportLayoutId;
    }

    /**
     * [get] PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrinterGroupId() {
        checkSpecifiedProperty("printerGroupId");
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        registerModifiedProperty("printerGroupId");
        _printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINTER_ID: {IX, bigint(19), FK to P_PRINTER} <br>
     * プリンタID
     * @return The value of the column 'PRINTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrinterId() {
        checkSpecifiedProperty("printerId");
        return _printerId;
    }

    /**
     * [set] PRINTER_ID: {IX, bigint(19), FK to P_PRINTER} <br>
     * プリンタID
     * @param printerId The value of the column 'PRINTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrinterId(Long printerId) {
        registerModifiedProperty("printerId");
        _printerId = printerId;
    }

    /**
     * [get] PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE} <br>
     * プリンタ属性ID
     * @return The value of the column 'PRINTER_ATTRIBUTE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrinterAttributeId() {
        checkSpecifiedProperty("printerAttributeId");
        return _printerAttributeId;
    }

    /**
     * [set] PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE} <br>
     * プリンタ属性ID
     * @param printerAttributeId The value of the column 'PRINTER_ATTRIBUTE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrinterAttributeId(Long printerAttributeId) {
        registerModifiedProperty("printerAttributeId");
        _printerAttributeId = printerAttributeId;
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
