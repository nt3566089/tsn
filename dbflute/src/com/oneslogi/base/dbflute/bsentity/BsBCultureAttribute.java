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
 * The entity of B_CULTURE_ATTRIBUTE as TABLE. <br>
 * カルチャ属性マスタ
 * <pre>
 * [primary-key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, DATE_TIME_FORMAT_DISPLAY, DATE_TIME_FORMAT_REPORT, DATE_TIME_FORMAT_EXCEL, DATE_TIME_FORMAT_TEXT, DATE_FORMAT_DISPLAY, DATE_FORMAT_REPORT, DATE_FORMAT_EXCEL, DATE_FORMAT_TEXT, TIME_FORMAT_DISPLAY, TIME_FORMAT_REPORT, TIME_FORMAT_EXCEL, TIME_FORMAT_TEXT, NUMBER_FORMAT_DISPLAY, NUMBER_FORMAT_REPORT, NUMBER_FORMAT_EXCEL, NUMBER_FORMAT_TEXT, CURRENCY_FORMAT_REPORT, FONT_NAME_EXCEL, FONT_SIZE_EXCEL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CULTURE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bCulture
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long cultureId = entity.getCultureId();
 * String dateTimeFormatDisplay = entity.getDateTimeFormatDisplay();
 * String dateTimeFormatReport = entity.getDateTimeFormatReport();
 * String dateTimeFormatExcel = entity.getDateTimeFormatExcel();
 * String dateTimeFormatText = entity.getDateTimeFormatText();
 * String dateFormatDisplay = entity.getDateFormatDisplay();
 * String dateFormatReport = entity.getDateFormatReport();
 * String dateFormatExcel = entity.getDateFormatExcel();
 * String dateFormatText = entity.getDateFormatText();
 * String timeFormatDisplay = entity.getTimeFormatDisplay();
 * String timeFormatReport = entity.getTimeFormatReport();
 * String timeFormatExcel = entity.getTimeFormatExcel();
 * String timeFormatText = entity.getTimeFormatText();
 * String numberFormatDisplay = entity.getNumberFormatDisplay();
 * String numberFormatReport = entity.getNumberFormatReport();
 * String numberFormatExcel = entity.getNumberFormatExcel();
 * String numberFormatText = entity.getNumberFormatText();
 * String currencyFormatReport = entity.getCurrencyFormatReport();
 * String fontNameExcel = entity.getFontNameExcel();
 * java.math.BigDecimal fontSizeExcel = entity.getFontSizeExcel();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCultureId(cultureId);
 * entity.setDateTimeFormatDisplay(dateTimeFormatDisplay);
 * entity.setDateTimeFormatReport(dateTimeFormatReport);
 * entity.setDateTimeFormatExcel(dateTimeFormatExcel);
 * entity.setDateTimeFormatText(dateTimeFormatText);
 * entity.setDateFormatDisplay(dateFormatDisplay);
 * entity.setDateFormatReport(dateFormatReport);
 * entity.setDateFormatExcel(dateFormatExcel);
 * entity.setDateFormatText(dateFormatText);
 * entity.setTimeFormatDisplay(timeFormatDisplay);
 * entity.setTimeFormatReport(timeFormatReport);
 * entity.setTimeFormatExcel(timeFormatExcel);
 * entity.setTimeFormatText(timeFormatText);
 * entity.setNumberFormatDisplay(numberFormatDisplay);
 * entity.setNumberFormatReport(numberFormatReport);
 * entity.setNumberFormatExcel(numberFormatExcel);
 * entity.setNumberFormatText(numberFormatText);
 * entity.setCurrencyFormatReport(currencyFormatReport);
 * entity.setFontNameExcel(fontNameExcel);
 * entity.setFontSizeExcel(fontSizeExcel);
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
public abstract class BsBCultureAttribute extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE} */
    protected Long _cultureId;

    /** DATE_TIME_FORMAT_DISPLAY: {varchar(30)} */
    protected String _dateTimeFormatDisplay;

    /** DATE_TIME_FORMAT_REPORT: {varchar(30)} */
    protected String _dateTimeFormatReport;

    /** DATE_TIME_FORMAT_EXCEL: {varchar(30)} */
    protected String _dateTimeFormatExcel;

    /** DATE_TIME_FORMAT_TEXT: {varchar(30)} */
    protected String _dateTimeFormatText;

    /** DATE_FORMAT_DISPLAY: {varchar(30)} */
    protected String _dateFormatDisplay;

    /** DATE_FORMAT_REPORT: {varchar(30)} */
    protected String _dateFormatReport;

    /** DATE_FORMAT_EXCEL: {varchar(30)} */
    protected String _dateFormatExcel;

    /** DATE_FORMAT_TEXT: {varchar(30)} */
    protected String _dateFormatText;

    /** TIME_FORMAT_DISPLAY: {varchar(30)} */
    protected String _timeFormatDisplay;

    /** TIME_FORMAT_REPORT: {varchar(30)} */
    protected String _timeFormatReport;

    /** TIME_FORMAT_EXCEL: {varchar(30)} */
    protected String _timeFormatExcel;

    /** TIME_FORMAT_TEXT: {varchar(30)} */
    protected String _timeFormatText;

    /** NUMBER_FORMAT_DISPLAY: {varchar(30)} */
    protected String _numberFormatDisplay;

    /** NUMBER_FORMAT_REPORT: {varchar(30)} */
    protected String _numberFormatReport;

    /** NUMBER_FORMAT_EXCEL: {varchar(30)} */
    protected String _numberFormatExcel;

    /** NUMBER_FORMAT_TEXT: {varchar(30)} */
    protected String _numberFormatText;

    /** CURRENCY_FORMAT_REPORT: {varchar(30)} */
    protected String _currencyFormatReport;

    /** FONT_NAME_EXCEL: {varchar(60)} */
    protected String _fontNameExcel;

    /** FONT_SIZE_EXCEL: {decimal(16, 6)} */
    protected java.math.BigDecimal _fontSizeExcel;

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
        return "B_CULTURE_ATTRIBUTE";
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
        if (_cultureId == null) { return false; }
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
    /** B_CULTURE by my CULTURE_ID, named 'BCulture'. */
    protected BCulture _bCulture;

    /**
     * [get] B_CULTURE by my CULTURE_ID, named 'BCulture'. <br>
     * @return The entity of foreign property 'BCulture'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BCulture getBCulture() {
        return _bCulture;
    }

    /**
     * [set] B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param bCulture The entity of foreign property 'BCulture'. (NullAllowed)
     */
    public void setBCulture(BCulture bCulture) {
        _bCulture = bCulture;
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
        if (obj instanceof BsBCultureAttribute) {
            BsBCultureAttribute other = (BsBCultureAttribute)obj;
            if (!xSV(_cultureId, other._cultureId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cultureId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bCulture != null)
        { sb.append(li).append(xbRDS(_bCulture, "bCulture")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_cultureId));
        sb.append(dm).append(xfND(_dateTimeFormatDisplay));
        sb.append(dm).append(xfND(_dateTimeFormatReport));
        sb.append(dm).append(xfND(_dateTimeFormatExcel));
        sb.append(dm).append(xfND(_dateTimeFormatText));
        sb.append(dm).append(xfND(_dateFormatDisplay));
        sb.append(dm).append(xfND(_dateFormatReport));
        sb.append(dm).append(xfND(_dateFormatExcel));
        sb.append(dm).append(xfND(_dateFormatText));
        sb.append(dm).append(xfND(_timeFormatDisplay));
        sb.append(dm).append(xfND(_timeFormatReport));
        sb.append(dm).append(xfND(_timeFormatExcel));
        sb.append(dm).append(xfND(_timeFormatText));
        sb.append(dm).append(xfND(_numberFormatDisplay));
        sb.append(dm).append(xfND(_numberFormatReport));
        sb.append(dm).append(xfND(_numberFormatExcel));
        sb.append(dm).append(xfND(_numberFormatText));
        sb.append(dm).append(xfND(_currencyFormatReport));
        sb.append(dm).append(xfND(_fontNameExcel));
        sb.append(dm).append(xfND(_fontSizeExcel));
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
        if (_bCulture != null)
        { sb.append(dm).append("bCulture"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BCultureAttribute clone() {
        return (BCultureAttribute)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCultureId() {
        checkSpecifiedProperty("cultureId");
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCultureId(Long cultureId) {
        registerModifiedProperty("cultureId");
        _cultureId = cultureId;
    }

    /**
     * [get] DATE_TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * 日時書式（画面）
     * @return The value of the column 'DATE_TIME_FORMAT_DISPLAY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateTimeFormatDisplay() {
        checkSpecifiedProperty("dateTimeFormatDisplay");
        return convertEmptyToNull(_dateTimeFormatDisplay);
    }

    /**
     * [set] DATE_TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * 日時書式（画面）
     * @param dateTimeFormatDisplay The value of the column 'DATE_TIME_FORMAT_DISPLAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateTimeFormatDisplay(String dateTimeFormatDisplay) {
        registerModifiedProperty("dateTimeFormatDisplay");
        _dateTimeFormatDisplay = dateTimeFormatDisplay;
    }

    /**
     * [get] DATE_TIME_FORMAT_REPORT: {varchar(30)} <br>
     * 日時書式（帳票）
     * @return The value of the column 'DATE_TIME_FORMAT_REPORT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateTimeFormatReport() {
        checkSpecifiedProperty("dateTimeFormatReport");
        return convertEmptyToNull(_dateTimeFormatReport);
    }

    /**
     * [set] DATE_TIME_FORMAT_REPORT: {varchar(30)} <br>
     * 日時書式（帳票）
     * @param dateTimeFormatReport The value of the column 'DATE_TIME_FORMAT_REPORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateTimeFormatReport(String dateTimeFormatReport) {
        registerModifiedProperty("dateTimeFormatReport");
        _dateTimeFormatReport = dateTimeFormatReport;
    }

    /**
     * [get] DATE_TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * 日時書式（Excel）
     * @return The value of the column 'DATE_TIME_FORMAT_EXCEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateTimeFormatExcel() {
        checkSpecifiedProperty("dateTimeFormatExcel");
        return convertEmptyToNull(_dateTimeFormatExcel);
    }

    /**
     * [set] DATE_TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * 日時書式（Excel）
     * @param dateTimeFormatExcel The value of the column 'DATE_TIME_FORMAT_EXCEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateTimeFormatExcel(String dateTimeFormatExcel) {
        registerModifiedProperty("dateTimeFormatExcel");
        _dateTimeFormatExcel = dateTimeFormatExcel;
    }

    /**
     * [get] DATE_TIME_FORMAT_TEXT: {varchar(30)} <br>
     * 日時書式（Text）
     * @return The value of the column 'DATE_TIME_FORMAT_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateTimeFormatText() {
        checkSpecifiedProperty("dateTimeFormatText");
        return convertEmptyToNull(_dateTimeFormatText);
    }

    /**
     * [set] DATE_TIME_FORMAT_TEXT: {varchar(30)} <br>
     * 日時書式（Text）
     * @param dateTimeFormatText The value of the column 'DATE_TIME_FORMAT_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateTimeFormatText(String dateTimeFormatText) {
        registerModifiedProperty("dateTimeFormatText");
        _dateTimeFormatText = dateTimeFormatText;
    }

    /**
     * [get] DATE_FORMAT_DISPLAY: {varchar(30)} <br>
     * 日付書式（画面）
     * @return The value of the column 'DATE_FORMAT_DISPLAY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateFormatDisplay() {
        checkSpecifiedProperty("dateFormatDisplay");
        return convertEmptyToNull(_dateFormatDisplay);
    }

    /**
     * [set] DATE_FORMAT_DISPLAY: {varchar(30)} <br>
     * 日付書式（画面）
     * @param dateFormatDisplay The value of the column 'DATE_FORMAT_DISPLAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateFormatDisplay(String dateFormatDisplay) {
        registerModifiedProperty("dateFormatDisplay");
        _dateFormatDisplay = dateFormatDisplay;
    }

    /**
     * [get] DATE_FORMAT_REPORT: {varchar(30)} <br>
     * 日付書式（帳票）
     * @return The value of the column 'DATE_FORMAT_REPORT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateFormatReport() {
        checkSpecifiedProperty("dateFormatReport");
        return convertEmptyToNull(_dateFormatReport);
    }

    /**
     * [set] DATE_FORMAT_REPORT: {varchar(30)} <br>
     * 日付書式（帳票）
     * @param dateFormatReport The value of the column 'DATE_FORMAT_REPORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateFormatReport(String dateFormatReport) {
        registerModifiedProperty("dateFormatReport");
        _dateFormatReport = dateFormatReport;
    }

    /**
     * [get] DATE_FORMAT_EXCEL: {varchar(30)} <br>
     * 日付書式（Excel）
     * @return The value of the column 'DATE_FORMAT_EXCEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateFormatExcel() {
        checkSpecifiedProperty("dateFormatExcel");
        return convertEmptyToNull(_dateFormatExcel);
    }

    /**
     * [set] DATE_FORMAT_EXCEL: {varchar(30)} <br>
     * 日付書式（Excel）
     * @param dateFormatExcel The value of the column 'DATE_FORMAT_EXCEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateFormatExcel(String dateFormatExcel) {
        registerModifiedProperty("dateFormatExcel");
        _dateFormatExcel = dateFormatExcel;
    }

    /**
     * [get] DATE_FORMAT_TEXT: {varchar(30)} <br>
     * 日付書式（Text）
     * @return The value of the column 'DATE_FORMAT_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDateFormatText() {
        checkSpecifiedProperty("dateFormatText");
        return convertEmptyToNull(_dateFormatText);
    }

    /**
     * [set] DATE_FORMAT_TEXT: {varchar(30)} <br>
     * 日付書式（Text）
     * @param dateFormatText The value of the column 'DATE_FORMAT_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateFormatText(String dateFormatText) {
        registerModifiedProperty("dateFormatText");
        _dateFormatText = dateFormatText;
    }

    /**
     * [get] TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * 時間書式（画面）
     * @return The value of the column 'TIME_FORMAT_DISPLAY'. (NullAllowed even if selected: for no constraint)
     */
    public String getTimeFormatDisplay() {
        checkSpecifiedProperty("timeFormatDisplay");
        return convertEmptyToNull(_timeFormatDisplay);
    }

    /**
     * [set] TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * 時間書式（画面）
     * @param timeFormatDisplay The value of the column 'TIME_FORMAT_DISPLAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimeFormatDisplay(String timeFormatDisplay) {
        registerModifiedProperty("timeFormatDisplay");
        _timeFormatDisplay = timeFormatDisplay;
    }

    /**
     * [get] TIME_FORMAT_REPORT: {varchar(30)} <br>
     * 時間書式（帳票）
     * @return The value of the column 'TIME_FORMAT_REPORT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTimeFormatReport() {
        checkSpecifiedProperty("timeFormatReport");
        return convertEmptyToNull(_timeFormatReport);
    }

    /**
     * [set] TIME_FORMAT_REPORT: {varchar(30)} <br>
     * 時間書式（帳票）
     * @param timeFormatReport The value of the column 'TIME_FORMAT_REPORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimeFormatReport(String timeFormatReport) {
        registerModifiedProperty("timeFormatReport");
        _timeFormatReport = timeFormatReport;
    }

    /**
     * [get] TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * 時間書式（Excel）
     * @return The value of the column 'TIME_FORMAT_EXCEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getTimeFormatExcel() {
        checkSpecifiedProperty("timeFormatExcel");
        return convertEmptyToNull(_timeFormatExcel);
    }

    /**
     * [set] TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * 時間書式（Excel）
     * @param timeFormatExcel The value of the column 'TIME_FORMAT_EXCEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimeFormatExcel(String timeFormatExcel) {
        registerModifiedProperty("timeFormatExcel");
        _timeFormatExcel = timeFormatExcel;
    }

    /**
     * [get] TIME_FORMAT_TEXT: {varchar(30)} <br>
     * 時間書式（Text）
     * @return The value of the column 'TIME_FORMAT_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTimeFormatText() {
        checkSpecifiedProperty("timeFormatText");
        return convertEmptyToNull(_timeFormatText);
    }

    /**
     * [set] TIME_FORMAT_TEXT: {varchar(30)} <br>
     * 時間書式（Text）
     * @param timeFormatText The value of the column 'TIME_FORMAT_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimeFormatText(String timeFormatText) {
        registerModifiedProperty("timeFormatText");
        _timeFormatText = timeFormatText;
    }

    /**
     * [get] NUMBER_FORMAT_DISPLAY: {varchar(30)} <br>
     * 数値書式（画面）
     * @return The value of the column 'NUMBER_FORMAT_DISPLAY'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberFormatDisplay() {
        checkSpecifiedProperty("numberFormatDisplay");
        return convertEmptyToNull(_numberFormatDisplay);
    }

    /**
     * [set] NUMBER_FORMAT_DISPLAY: {varchar(30)} <br>
     * 数値書式（画面）
     * @param numberFormatDisplay The value of the column 'NUMBER_FORMAT_DISPLAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberFormatDisplay(String numberFormatDisplay) {
        registerModifiedProperty("numberFormatDisplay");
        _numberFormatDisplay = numberFormatDisplay;
    }

    /**
     * [get] NUMBER_FORMAT_REPORT: {varchar(30)} <br>
     * 数値書式（帳票）
     * @return The value of the column 'NUMBER_FORMAT_REPORT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberFormatReport() {
        checkSpecifiedProperty("numberFormatReport");
        return convertEmptyToNull(_numberFormatReport);
    }

    /**
     * [set] NUMBER_FORMAT_REPORT: {varchar(30)} <br>
     * 数値書式（帳票）
     * @param numberFormatReport The value of the column 'NUMBER_FORMAT_REPORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberFormatReport(String numberFormatReport) {
        registerModifiedProperty("numberFormatReport");
        _numberFormatReport = numberFormatReport;
    }

    /**
     * [get] NUMBER_FORMAT_EXCEL: {varchar(30)} <br>
     * 数値書式（Excel）
     * @return The value of the column 'NUMBER_FORMAT_EXCEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberFormatExcel() {
        checkSpecifiedProperty("numberFormatExcel");
        return convertEmptyToNull(_numberFormatExcel);
    }

    /**
     * [set] NUMBER_FORMAT_EXCEL: {varchar(30)} <br>
     * 数値書式（Excel）
     * @param numberFormatExcel The value of the column 'NUMBER_FORMAT_EXCEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberFormatExcel(String numberFormatExcel) {
        registerModifiedProperty("numberFormatExcel");
        _numberFormatExcel = numberFormatExcel;
    }

    /**
     * [get] NUMBER_FORMAT_TEXT: {varchar(30)} <br>
     * 数値書式（Text）
     * @return The value of the column 'NUMBER_FORMAT_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberFormatText() {
        checkSpecifiedProperty("numberFormatText");
        return convertEmptyToNull(_numberFormatText);
    }

    /**
     * [set] NUMBER_FORMAT_TEXT: {varchar(30)} <br>
     * 数値書式（Text）
     * @param numberFormatText The value of the column 'NUMBER_FORMAT_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberFormatText(String numberFormatText) {
        registerModifiedProperty("numberFormatText");
        _numberFormatText = numberFormatText;
    }

    /**
     * [get] CURRENCY_FORMAT_REPORT: {varchar(30)} <br>
     * 通貨書式（帳票）
     * @return The value of the column 'CURRENCY_FORMAT_REPORT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCurrencyFormatReport() {
        checkSpecifiedProperty("currencyFormatReport");
        return convertEmptyToNull(_currencyFormatReport);
    }

    /**
     * [set] CURRENCY_FORMAT_REPORT: {varchar(30)} <br>
     * 通貨書式（帳票）
     * @param currencyFormatReport The value of the column 'CURRENCY_FORMAT_REPORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCurrencyFormatReport(String currencyFormatReport) {
        registerModifiedProperty("currencyFormatReport");
        _currencyFormatReport = currencyFormatReport;
    }

    /**
     * [get] FONT_NAME_EXCEL: {varchar(60)} <br>
     * フォント名称（Excel）
     * @return The value of the column 'FONT_NAME_EXCEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getFontNameExcel() {
        checkSpecifiedProperty("fontNameExcel");
        return convertEmptyToNull(_fontNameExcel);
    }

    /**
     * [set] FONT_NAME_EXCEL: {varchar(60)} <br>
     * フォント名称（Excel）
     * @param fontNameExcel The value of the column 'FONT_NAME_EXCEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFontNameExcel(String fontNameExcel) {
        registerModifiedProperty("fontNameExcel");
        _fontNameExcel = fontNameExcel;
    }

    /**
     * [get] FONT_SIZE_EXCEL: {decimal(16, 6)} <br>
     * フォントサイズ（Excel）
     * @return The value of the column 'FONT_SIZE_EXCEL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getFontSizeExcel() {
        checkSpecifiedProperty("fontSizeExcel");
        return _fontSizeExcel;
    }

    /**
     * [set] FONT_SIZE_EXCEL: {decimal(16, 6)} <br>
     * フォントサイズ（Excel）
     * @param fontSizeExcel The value of the column 'FONT_SIZE_EXCEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFontSizeExcel(java.math.BigDecimal fontSizeExcel) {
        registerModifiedProperty("fontSizeExcel");
        _fontSizeExcel = fontSizeExcel;
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
