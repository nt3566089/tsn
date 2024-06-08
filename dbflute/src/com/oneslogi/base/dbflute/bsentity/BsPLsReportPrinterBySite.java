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
 * The entity of P_LS_REPORT_PRINTER_BY_SITE as TABLE. <br>
 * 拠点別帳票プリンタ設定
 * <pre>
 * [primary-key]
 *     WAREHOUSE_CD
 *
 * [column]
 *     WAREHOUSE_CD, REPORT_FORM_NAME, PRINTER_GROUP, LINE_NO, REPORT_SERVER_NAME, REPORT_PRINTER_NAME, FLOOR, AUTO_FLG, TERMINAL_CD, PRITER_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long warehouseCd = entity.getWarehouseCd();
 * String reportFormName = entity.getReportFormName();
 * String printerGroup = entity.getPrinterGroup();
 * Long lineNo = entity.getLineNo();
 * String reportServerName = entity.getReportServerName();
 * String reportPrinterName = entity.getReportPrinterName();
 * String floor = entity.getFloor();
 * String autoFlg = entity.getAutoFlg();
 * String terminalCd = entity.getTerminalCd();
 * String priterNo = entity.getPriterNo();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWarehouseCd(warehouseCd);
 * entity.setReportFormName(reportFormName);
 * entity.setPrinterGroup(printerGroup);
 * entity.setLineNo(lineNo);
 * entity.setReportServerName(reportServerName);
 * entity.setReportPrinterName(reportPrinterName);
 * entity.setFloor(floor);
 * entity.setAutoFlg(autoFlg);
 * entity.setTerminalCd(terminalCd);
 * entity.setPriterNo(priterNo);
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
public abstract class BsPLsReportPrinterBySite extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WAREHOUSE_CD: {PK, NotNull, bigint(19)} */
    protected Long _warehouseCd;

    /** REPORT_FORM_NAME: {NotNull, varchar(255)} */
    protected String _reportFormName;

    /** PRINTER_GROUP: {NotNull, varchar(255)} */
    protected String _printerGroup;

    /** LINE_NO: {NotNull, bigint(19)} */
    protected Long _lineNo;

    /** REPORT_SERVER_NAME: {NotNull, varchar(255)} */
    protected String _reportServerName;

    /** REPORT_PRINTER_NAME: {NotNull, varchar(255)} */
    protected String _reportPrinterName;

    /** FLOOR: {varchar(255)} */
    protected String _floor;

    /** AUTO_FLG: {char(1), default=[0]} */
    protected String _autoFlg;

    /** TERMINAL_CD: {varchar(255)} */
    protected String _terminalCd;

    /** PRITER_NO: {varchar(255)} */
    protected String _priterNo;

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
        return "P_LS_REPORT_PRINTER_BY_SITE";
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
        if (_warehouseCd == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
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
        if (obj instanceof BsPLsReportPrinterBySite) {
            BsPLsReportPrinterBySite other = (BsPLsReportPrinterBySite)obj;
            if (!xSV(_warehouseCd, other._warehouseCd)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _warehouseCd);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_reportFormName));
        sb.append(dm).append(xfND(_printerGroup));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_reportServerName));
        sb.append(dm).append(xfND(_reportPrinterName));
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_autoFlg));
        sb.append(dm).append(xfND(_terminalCd));
        sb.append(dm).append(xfND(_priterNo));
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
        return "";
    }

    @Override
    public PLsReportPrinterBySite clone() {
        return (PLsReportPrinterBySite)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WAREHOUSE_CD: {PK, NotNull, bigint(19)} <br>
     * 拠点コード
     * @return The value of the column 'WAREHOUSE_CD'. (basically NotNull if selected: for the constraint)
     */
    public Long getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {PK, NotNull, bigint(19)} <br>
     * 拠点コード
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseCd(Long warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] REPORT_FORM_NAME: {NotNull, varchar(255)} <br>
     * 帳票フォーム名称
     * @return The value of the column 'REPORT_FORM_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReportFormName() {
        checkSpecifiedProperty("reportFormName");
        return convertEmptyToNull(_reportFormName);
    }

    /**
     * [set] REPORT_FORM_NAME: {NotNull, varchar(255)} <br>
     * 帳票フォーム名称
     * @param reportFormName The value of the column 'REPORT_FORM_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReportFormName(String reportFormName) {
        registerModifiedProperty("reportFormName");
        _reportFormName = reportFormName;
    }

    /**
     * [get] PRINTER_GROUP: {NotNull, varchar(255)} <br>
     * プリンタグループ
     * @return The value of the column 'PRINTER_GROUP'. (basically NotNull if selected: for the constraint)
     */
    public String getPrinterGroup() {
        checkSpecifiedProperty("printerGroup");
        return convertEmptyToNull(_printerGroup);
    }

    /**
     * [set] PRINTER_GROUP: {NotNull, varchar(255)} <br>
     * プリンタグループ
     * @param printerGroup The value of the column 'PRINTER_GROUP'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterGroup(String printerGroup) {
        registerModifiedProperty("printerGroup");
        _printerGroup = printerGroup;
    }

    /**
     * [get] LINE_NO: {NotNull, bigint(19)} <br>
     * 行No.
     * @return The value of the column 'LINE_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, bigint(19)} <br>
     * 行No.
     * @param lineNo The value of the column 'LINE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
    }

    /**
     * [get] REPORT_SERVER_NAME: {NotNull, varchar(255)} <br>
     * 帳票サーバ名称
     * @return The value of the column 'REPORT_SERVER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReportServerName() {
        checkSpecifiedProperty("reportServerName");
        return convertEmptyToNull(_reportServerName);
    }

    /**
     * [set] REPORT_SERVER_NAME: {NotNull, varchar(255)} <br>
     * 帳票サーバ名称
     * @param reportServerName The value of the column 'REPORT_SERVER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReportServerName(String reportServerName) {
        registerModifiedProperty("reportServerName");
        _reportServerName = reportServerName;
    }

    /**
     * [get] REPORT_PRINTER_NAME: {NotNull, varchar(255)} <br>
     * 帳票プリンタ名称
     * @return The value of the column 'REPORT_PRINTER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReportPrinterName() {
        checkSpecifiedProperty("reportPrinterName");
        return convertEmptyToNull(_reportPrinterName);
    }

    /**
     * [set] REPORT_PRINTER_NAME: {NotNull, varchar(255)} <br>
     * 帳票プリンタ名称
     * @param reportPrinterName The value of the column 'REPORT_PRINTER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReportPrinterName(String reportPrinterName) {
        registerModifiedProperty("reportPrinterName");
        _reportPrinterName = reportPrinterName;
    }

    /**
     * [get] FLOOR: {varchar(255)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed even if selected: for no constraint)
     */
    public String getFloor() {
        checkSpecifiedProperty("floor");
        return convertEmptyToNull(_floor);
    }

    /**
     * [set] FLOOR: {varchar(255)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloor(String floor) {
        registerModifiedProperty("floor");
        _floor = floor;
    }

    /**
     * [get] AUTO_FLG: {char(1), default=[0]} <br>
     * デフォルトプリンタ
     * @return The value of the column 'AUTO_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAutoFlg() {
        checkSpecifiedProperty("autoFlg");
        return convertEmptyToNull(_autoFlg);
    }

    /**
     * [set] AUTO_FLG: {char(1), default=[0]} <br>
     * デフォルトプリンタ
     * @param autoFlg The value of the column 'AUTO_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAutoFlg(String autoFlg) {
        registerModifiedProperty("autoFlg");
        _autoFlg = autoFlg;
    }

    /**
     * [get] TERMINAL_CD: {varchar(255)} <br>
     * 端末コード
     * @return The value of the column 'TERMINAL_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTerminalCd() {
        checkSpecifiedProperty("terminalCd");
        return convertEmptyToNull(_terminalCd);
    }

    /**
     * [set] TERMINAL_CD: {varchar(255)} <br>
     * 端末コード
     * @param terminalCd The value of the column 'TERMINAL_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTerminalCd(String terminalCd) {
        registerModifiedProperty("terminalCd");
        _terminalCd = terminalCd;
    }

    /**
     * [get] PRITER_NO: {varchar(255)} <br>
     * ラインNo
     * @return The value of the column 'PRITER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriterNo() {
        checkSpecifiedProperty("priterNo");
        return convertEmptyToNull(_priterNo);
    }

    /**
     * [set] PRITER_NO: {varchar(255)} <br>
     * ラインNo
     * @param priterNo The value of the column 'PRITER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriterNo(String priterNo) {
        registerModifiedProperty("priterNo");
        _priterNo = priterNo;
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
