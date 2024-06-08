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
 * The entity of P_PRINT_REQUEST_DATA as TABLE. <br>
 * 印刷データ情報
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_ID
 *
 * [column]
 *     PRINT_REQUEST_ID, REPORT_LAYOUT_DATA, SUBREP_LAYOUT_DATA, REPORT_LAYOUT_BINARY, SUBREP_LAYOUT_BINARY, DATA_FOR_REPORT, CULTURE_CD, TIME_ZONE_CD, DATE_TIME_FORMAT, DATE_FORMAT, TIME_FORMAT, NUMBER_FORMAT, CURRENCY_FORMAT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     P_PRINT_REQUEST
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrintRequest
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long printRequestId = entity.getPrintRequestId();
 * String reportLayoutData = entity.getReportLayoutData();
 * String subrepLayoutData = entity.getSubrepLayoutData();
 * byte[] reportLayoutBinary = entity.getReportLayoutBinary();
 * byte[] subrepLayoutBinary = entity.getSubrepLayoutBinary();
 * String dataForReport = entity.getDataForReport();
 * String cultureCd = entity.getCultureCd();
 * String timeZoneCd = entity.getTimeZoneCd();
 * String dateTimeFormat = entity.getDateTimeFormat();
 * String dateFormat = entity.getDateFormat();
 * String timeFormat = entity.getTimeFormat();
 * String numberFormat = entity.getNumberFormat();
 * String currencyFormat = entity.getCurrencyFormat();
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
 * entity.setReportLayoutData(reportLayoutData);
 * entity.setSubrepLayoutData(subrepLayoutData);
 * entity.setReportLayoutBinary(reportLayoutBinary);
 * entity.setSubrepLayoutBinary(subrepLayoutBinary);
 * entity.setDataForReport(dataForReport);
 * entity.setCultureCd(cultureCd);
 * entity.setTimeZoneCd(timeZoneCd);
 * entity.setDateTimeFormat(dateTimeFormat);
 * entity.setDateFormat(dateFormat);
 * entity.setTimeFormat(timeFormat);
 * entity.setNumberFormat(numberFormat);
 * entity.setCurrencyFormat(currencyFormat);
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
public abstract class BsPPrintRequestData extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST} */
    protected Long _printRequestId;

    /** REPORT_LAYOUT_DATA: {varchar(2147483647)} */
    protected String _reportLayoutData;

    /** SUBREP_LAYOUT_DATA: {varchar(2147483647)} */
    protected String _subrepLayoutData;

    /** REPORT_LAYOUT_BINARY: {varbinary(2147483647)} */
    protected byte[] _reportLayoutBinary;

    /** SUBREP_LAYOUT_BINARY: {varbinary(2147483647)} */
    protected byte[] _subrepLayoutBinary;

    /** DATA_FOR_REPORT: {varchar(2147483647)} */
    protected String _dataForReport;

    /** CULTURE_CD: {varchar(30)} */
    protected String _cultureCd;

    /** TIME_ZONE_CD: {varchar(30)} */
    protected String _timeZoneCd;

    /** DATE_TIME_FORMAT: {varchar(30)} */
    protected String _dateTimeFormat;

    /** DATE_FORMAT: {varchar(30)} */
    protected String _dateFormat;

    /** TIME_FORMAT: {varchar(30)} */
    protected String _timeFormat;

    /** NUMBER_FORMAT: {varchar(30)} */
    protected String _numberFormat;

    /** CURRENCY_FORMAT: {varchar(30)} */
    protected String _currencyFormat;

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
        return "P_PRINT_REQUEST_DATA";
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
        if (obj instanceof BsPPrintRequestData) {
            BsPPrintRequestData other = (BsPPrintRequestData)obj;
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
        if (_pPrintRequest != null)
        { sb.append(li).append(xbRDS(_pPrintRequest, "pPrintRequest")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printRequestId));
        sb.append(dm).append(xfND(_reportLayoutData));
        sb.append(dm).append(xfND(_subrepLayoutData));
        sb.append(dm).append(xfBA(_reportLayoutBinary));
        sb.append(dm).append(xfBA(_subrepLayoutBinary));
        sb.append(dm).append(xfND(_dataForReport));
        sb.append(dm).append(xfND(_cultureCd));
        sb.append(dm).append(xfND(_timeZoneCd));
        sb.append(dm).append(xfND(_dateTimeFormat));
        sb.append(dm).append(xfND(_dateFormat));
        sb.append(dm).append(xfND(_timeFormat));
        sb.append(dm).append(xfND(_numberFormat));
        sb.append(dm).append(xfND(_currencyFormat));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PPrintRequestData clone() {
        return (PPrintRequestData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintRequestId() {
        checkSpecifiedProperty("printRequestId");
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrintRequestId(Long printRequestId) {
        registerModifiedProperty("printRequestId");
        _printRequestId = printRequestId;
    }

    /**
     * [get] REPORT_LAYOUT_DATA: {varchar(2147483647)} <br>
     * 帳票レイアウトデータ
     * @return The value of the column 'REPORT_LAYOUT_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public String getReportLayoutData() {
        checkSpecifiedProperty("reportLayoutData");
        return convertEmptyToNull(_reportLayoutData);
    }

    /**
     * [set] REPORT_LAYOUT_DATA: {varchar(2147483647)} <br>
     * 帳票レイアウトデータ
     * @param reportLayoutData The value of the column 'REPORT_LAYOUT_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportLayoutData(String reportLayoutData) {
        registerModifiedProperty("reportLayoutData");
        _reportLayoutData = reportLayoutData;
    }

    /**
     * [get] SUBREP_LAYOUT_DATA: {varchar(2147483647)} <br>
     * サブレポートレイアウトデータ
     * @return The value of the column 'SUBREP_LAYOUT_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public String getSubrepLayoutData() {
        checkSpecifiedProperty("subrepLayoutData");
        return convertEmptyToNull(_subrepLayoutData);
    }

    /**
     * [set] SUBREP_LAYOUT_DATA: {varchar(2147483647)} <br>
     * サブレポートレイアウトデータ
     * @param subrepLayoutData The value of the column 'SUBREP_LAYOUT_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubrepLayoutData(String subrepLayoutData) {
        registerModifiedProperty("subrepLayoutData");
        _subrepLayoutData = subrepLayoutData;
    }

    /**
     * [get] REPORT_LAYOUT_BINARY: {varbinary(2147483647)} <br>
     * 帳票レイアウトバイナリ
     * @return The value of the column 'REPORT_LAYOUT_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getReportLayoutBinary() {
        checkSpecifiedProperty("reportLayoutBinary");
        return _reportLayoutBinary;
    }

    /**
     * [set] REPORT_LAYOUT_BINARY: {varbinary(2147483647)} <br>
     * 帳票レイアウトバイナリ
     * @param reportLayoutBinary The value of the column 'REPORT_LAYOUT_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportLayoutBinary(byte[] reportLayoutBinary) {
        registerModifiedProperty("reportLayoutBinary");
        _reportLayoutBinary = reportLayoutBinary;
    }

    /**
     * [get] SUBREP_LAYOUT_BINARY: {varbinary(2147483647)} <br>
     * サブレポートレイアウトバイナリ
     * @return The value of the column 'SUBREP_LAYOUT_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getSubrepLayoutBinary() {
        checkSpecifiedProperty("subrepLayoutBinary");
        return _subrepLayoutBinary;
    }

    /**
     * [set] SUBREP_LAYOUT_BINARY: {varbinary(2147483647)} <br>
     * サブレポートレイアウトバイナリ
     * @param subrepLayoutBinary The value of the column 'SUBREP_LAYOUT_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubrepLayoutBinary(byte[] subrepLayoutBinary) {
        registerModifiedProperty("subrepLayoutBinary");
        _subrepLayoutBinary = subrepLayoutBinary;
    }

    /**
     * [get] DATA_FOR_REPORT: {varchar(2147483647)} <br>
     * 業務データ
     * @return The value of the column 'DATA_FOR_REPORT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataForReport() {
        checkSpecifiedProperty("dataForReport");
        return convertEmptyToNull(_dataForReport);
    }

    /**
     * [set] DATA_FOR_REPORT: {varchar(2147483647)} <br>
     * 業務データ
     * @param dataForReport The value of the column 'DATA_FOR_REPORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataForReport(String dataForReport) {
        registerModifiedProperty("dataForReport");
        _dataForReport = dataForReport;
    }

    /**
     * [get] CULTURE_CD: {varchar(30)} <br>
     * カルチャCD
     * @return The value of the column 'CULTURE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCultureCd() {
        checkSpecifiedProperty("cultureCd");
        return convertEmptyToNull(_cultureCd);
    }

    /**
     * [set] CULTURE_CD: {varchar(30)} <br>
     * カルチャCD
     * @param cultureCd The value of the column 'CULTURE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCultureCd(String cultureCd) {
        registerModifiedProperty("cultureCd");
        _cultureCd = cultureCd;
    }

    /**
     * [get] TIME_ZONE_CD: {varchar(30)} <br>
     * タイムゾーンCD
     * @return The value of the column 'TIME_ZONE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTimeZoneCd() {
        checkSpecifiedProperty("timeZoneCd");
        return convertEmptyToNull(_timeZoneCd);
    }

    /**
     * [set] TIME_ZONE_CD: {varchar(30)} <br>
     * タイムゾーンCD
     * @param timeZoneCd The value of the column 'TIME_ZONE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimeZoneCd(String timeZoneCd) {
        registerModifiedProperty("timeZoneCd");
        _timeZoneCd = timeZoneCd;
    }

    /**
     * [get] DATE_TIME_FORMAT: {varchar(30)} <br>
     * 日時書式
     * @return The value of the column 'DATE_TIME_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateTimeFormat() {
        checkSpecifiedProperty("dateTimeFormat");
        return convertEmptyToNull(_dateTimeFormat);
    }

    /**
     * [set] DATE_TIME_FORMAT: {varchar(30)} <br>
     * 日時書式
     * @param dateTimeFormat The value of the column 'DATE_TIME_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateTimeFormat(String dateTimeFormat) {
        registerModifiedProperty("dateTimeFormat");
        _dateTimeFormat = dateTimeFormat;
    }

    /**
     * [get] DATE_FORMAT: {varchar(30)} <br>
     * 日付書式
     * @return The value of the column 'DATE_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateFormat() {
        checkSpecifiedProperty("dateFormat");
        return convertEmptyToNull(_dateFormat);
    }

    /**
     * [set] DATE_FORMAT: {varchar(30)} <br>
     * 日付書式
     * @param dateFormat The value of the column 'DATE_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateFormat(String dateFormat) {
        registerModifiedProperty("dateFormat");
        _dateFormat = dateFormat;
    }

    /**
     * [get] TIME_FORMAT: {varchar(30)} <br>
     * 時間書式
     * @return The value of the column 'TIME_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTimeFormat() {
        checkSpecifiedProperty("timeFormat");
        return convertEmptyToNull(_timeFormat);
    }

    /**
     * [set] TIME_FORMAT: {varchar(30)} <br>
     * 時間書式
     * @param timeFormat The value of the column 'TIME_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimeFormat(String timeFormat) {
        registerModifiedProperty("timeFormat");
        _timeFormat = timeFormat;
    }

    /**
     * [get] NUMBER_FORMAT: {varchar(30)} <br>
     * 数値書式
     * @return The value of the column 'NUMBER_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberFormat() {
        checkSpecifiedProperty("numberFormat");
        return convertEmptyToNull(_numberFormat);
    }

    /**
     * [set] NUMBER_FORMAT: {varchar(30)} <br>
     * 数値書式
     * @param numberFormat The value of the column 'NUMBER_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberFormat(String numberFormat) {
        registerModifiedProperty("numberFormat");
        _numberFormat = numberFormat;
    }

    /**
     * [get] CURRENCY_FORMAT: {varchar(30)} <br>
     * 通貨書式
     * @return The value of the column 'CURRENCY_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCurrencyFormat() {
        checkSpecifiedProperty("currencyFormat");
        return convertEmptyToNull(_currencyFormat);
    }

    /**
     * [set] CURRENCY_FORMAT: {varchar(30)} <br>
     * 通貨書式
     * @param currencyFormat The value of the column 'CURRENCY_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCurrencyFormat(String currencyFormat) {
        registerModifiedProperty("currencyFormat");
        _currencyFormat = currencyFormat;
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
