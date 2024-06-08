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
 * The entity of P_PRINT_SERVICE as TABLE. <br>
 * 印刷サービス情報
 * <pre>
 * [primary-key]
 *     PRINT_SERVICE_ID
 *
 * [column]
 *     PRINT_SERVICE_ID, PRINT_SERVICE_NM, TERMINAL_NM, MAC_ADDRESS, PRINTER_GROUP_ID, PRINT_SERVICE_STATUS, START_DT, END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_SERVICE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByPrintServiceStatus)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bClassDtlByPrintServiceStatus
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long printServiceId = entity.getPrintServiceId();
 * String printServiceNm = entity.getPrintServiceNm();
 * String terminalNm = entity.getTerminalNm();
 * String macAddress = entity.getMacAddress();
 * Long printerGroupId = entity.getPrinterGroupId();
 * String printServiceStatus = entity.getPrintServiceStatus();
 * java.sql.Timestamp startDt = entity.getStartDt();
 * java.sql.Timestamp endDt = entity.getEndDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPrintServiceId(printServiceId);
 * entity.setPrintServiceNm(printServiceNm);
 * entity.setTerminalNm(terminalNm);
 * entity.setMacAddress(macAddress);
 * entity.setPrinterGroupId(printerGroupId);
 * entity.setPrintServiceStatus(printServiceStatus);
 * entity.setStartDt(startDt);
 * entity.setEndDt(endDt);
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
public abstract class BsPPrintService extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _printServiceId;

    /** PRINT_SERVICE_NM: {NotNull, varchar(60)} */
    protected String _printServiceNm;

    /** TERMINAL_NM: {NotNull, varchar(60)} */
    protected String _terminalNm;

    /** MAC_ADDRESS: {UQ, NotNull, varchar(30)} */
    protected String _macAddress;

    /** PRINTER_GROUP_ID: {IX, bigint(19)} */
    protected Long _printerGroupId;

    /** PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} */
    protected String _printServiceStatus;

    /** START_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _startDt;

    /** END_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _endDt;

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
        return "P_PRINT_SERVICE";
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
        if (_printServiceId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param macAddress : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String macAddress) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("macAddress");
        setMacAddress(macAddress);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of printServiceStatus as the classification of PrintServiceStatus. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PrintServiceStatus getPrintServiceStatusAsPrintServiceStatus() {
        return CDef.PrintServiceStatus.codeOf(getPrintServiceStatus());
    }

    /**
     * Set the value of printServiceStatus as the classification of PrintServiceStatus. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPrintServiceStatusAsPrintServiceStatus(CDef.PrintServiceStatus cdef) {
        setPrintServiceStatus(cdef != null ? cdef.code() : null);
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
     * Set the value of printServiceStatus as $0 (0). <br>
     * $0: サービス中
     */
    public void setPrintServiceStatus_$0() {
        setPrintServiceStatusAsPrintServiceStatus(CDef.PrintServiceStatus.$0);
    }

    /**
     * Set the value of printServiceStatus as $1 (1). <br>
     * $1: サービス停止中
     */
    public void setPrintServiceStatus_$1() {
        setPrintServiceStatusAsPrintServiceStatus(CDef.PrintServiceStatus.$1);
    }

    /**
     * Set the value of printServiceStatus as $2 (2). <br>
     * $2: シャットダウン中
     */
    public void setPrintServiceStatus_$2() {
        setPrintServiceStatusAsPrintServiceStatus(CDef.PrintServiceStatus.$2);
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
     * Is the value of printServiceStatus $0? <br>
     * $0: サービス中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintServiceStatus$0() {
        CDef.PrintServiceStatus cdef = getPrintServiceStatusAsPrintServiceStatus();
        return cdef != null ? cdef.equals(CDef.PrintServiceStatus.$0) : false;
    }

    /**
     * Is the value of printServiceStatus $1? <br>
     * $1: サービス停止中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintServiceStatus$1() {
        CDef.PrintServiceStatus cdef = getPrintServiceStatusAsPrintServiceStatus();
        return cdef != null ? cdef.equals(CDef.PrintServiceStatus.$1) : false;
    }

    /**
     * Is the value of printServiceStatus $2? <br>
     * $2: シャットダウン中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPrintServiceStatus$2() {
        CDef.PrintServiceStatus cdef = getPrintServiceStatusAsPrintServiceStatus();
        return cdef != null ? cdef.equals(CDef.PrintServiceStatus.$2) : false;
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
     * Get the value of the column 'printServiceStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPrintServiceStatusName() {
        CDef.PrintServiceStatus cdef = getPrintServiceStatusAsPrintServiceStatus();
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
    /** B_CLASS_DTL by my PRINT_SERVICE_STATUS, named 'BClassDtlByPrintServiceStatus'. */
    protected BClassDtl _bClassDtlByPrintServiceStatus;

    /**
     * [get] B_CLASS_DTL by my PRINT_SERVICE_STATUS, named 'BClassDtlByPrintServiceStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByPrintServiceStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPrintServiceStatus() {
        return _bClassDtlByPrintServiceStatus;
    }

    /**
     * [set] B_CLASS_DTL by my PRINT_SERVICE_STATUS, named 'BClassDtlByPrintServiceStatus'.
     * @param bClassDtlByPrintServiceStatus The entity of foreign property 'BClassDtlByPrintServiceStatus'. (NullAllowed)
     */
    public void setBClassDtlByPrintServiceStatus(BClassDtl bClassDtlByPrintServiceStatus) {
        _bClassDtlByPrintServiceStatus = bClassDtlByPrintServiceStatus;
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
        if (obj instanceof BsPPrintService) {
            BsPPrintService other = (BsPPrintService)obj;
            if (!xSV(_printServiceId, other._printServiceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printServiceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByPrintServiceStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPrintServiceStatus, "bClassDtlByPrintServiceStatus")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printServiceId));
        sb.append(dm).append(xfND(_printServiceNm));
        sb.append(dm).append(xfND(_terminalNm));
        sb.append(dm).append(xfND(_macAddress));
        sb.append(dm).append(xfND(_printerGroupId));
        sb.append(dm).append(xfND(_printServiceStatus));
        sb.append(dm).append(xfND(_startDt));
        sb.append(dm).append(xfND(_endDt));
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
        if (_bClassDtlByPrintServiceStatus != null)
        { sb.append(dm).append("bClassDtlByPrintServiceStatus"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PPrintService clone() {
        return (PPrintService)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷サービスID
     * @return The value of the column 'PRINT_SERVICE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintServiceId() {
        checkSpecifiedProperty("printServiceId");
        return _printServiceId;
    }

    /**
     * [set] PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷サービスID
     * @param printServiceId The value of the column 'PRINT_SERVICE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintServiceId(Long printServiceId) {
        registerModifiedProperty("printServiceId");
        _printServiceId = printServiceId;
    }

    /**
     * [get] PRINT_SERVICE_NM: {NotNull, varchar(60)} <br>
     * 印刷サービス名称
     * @return The value of the column 'PRINT_SERVICE_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintServiceNm() {
        checkSpecifiedProperty("printServiceNm");
        return convertEmptyToNull(_printServiceNm);
    }

    /**
     * [set] PRINT_SERVICE_NM: {NotNull, varchar(60)} <br>
     * 印刷サービス名称
     * @param printServiceNm The value of the column 'PRINT_SERVICE_NM'. (basically NotNull if update: for the constraint)
     */
    public void setPrintServiceNm(String printServiceNm) {
        registerModifiedProperty("printServiceNm");
        _printServiceNm = printServiceNm;
    }

    /**
     * [get] TERMINAL_NM: {NotNull, varchar(60)} <br>
     * 端末名称
     * @return The value of the column 'TERMINAL_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getTerminalNm() {
        checkSpecifiedProperty("terminalNm");
        return convertEmptyToNull(_terminalNm);
    }

    /**
     * [set] TERMINAL_NM: {NotNull, varchar(60)} <br>
     * 端末名称
     * @param terminalNm The value of the column 'TERMINAL_NM'. (basically NotNull if update: for the constraint)
     */
    public void setTerminalNm(String terminalNm) {
        registerModifiedProperty("terminalNm");
        _terminalNm = terminalNm;
    }

    /**
     * [get] MAC_ADDRESS: {UQ, NotNull, varchar(30)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMacAddress() {
        checkSpecifiedProperty("macAddress");
        return convertEmptyToNull(_macAddress);
    }

    /**
     * [set] MAC_ADDRESS: {UQ, NotNull, varchar(30)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setMacAddress(String macAddress) {
        registerModifiedProperty("macAddress");
        _macAddress = macAddress;
    }

    /**
     * [get] PRINTER_GROUP_ID: {IX, bigint(19)} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrinterGroupId() {
        checkSpecifiedProperty("printerGroupId");
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {IX, bigint(19)} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        registerModifiedProperty("printerGroupId");
        _printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @return The value of the column 'PRINT_SERVICE_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintServiceStatus() {
        checkSpecifiedProperty("printServiceStatus");
        return convertEmptyToNull(_printServiceStatus);
    }

    /**
     * [set] PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @param printServiceStatus The value of the column 'PRINT_SERVICE_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setPrintServiceStatus(String printServiceStatus) {
        registerModifiedProperty("printServiceStatus");
        _printServiceStatus = printServiceStatus;
    }

    /**
     * [get] START_DT: {datetime2(26, 6)} <br>
     * 開始日時
     * @return The value of the column 'START_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getStartDt() {
        checkSpecifiedProperty("startDt");
        return _startDt;
    }

    /**
     * [set] START_DT: {datetime2(26, 6)} <br>
     * 開始日時
     * @param startDt The value of the column 'START_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartDt(java.sql.Timestamp startDt) {
        registerModifiedProperty("startDt");
        _startDt = startDt;
    }

    /**
     * [get] END_DT: {datetime2(26, 6)} <br>
     * 終了日時
     * @return The value of the column 'END_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getEndDt() {
        checkSpecifiedProperty("endDt");
        return _endDt;
    }

    /**
     * [set] END_DT: {datetime2(26, 6)} <br>
     * 終了日時
     * @param endDt The value of the column 'END_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEndDt(java.sql.Timestamp endDt) {
        registerModifiedProperty("endDt");
        _endDt = endDt;
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
