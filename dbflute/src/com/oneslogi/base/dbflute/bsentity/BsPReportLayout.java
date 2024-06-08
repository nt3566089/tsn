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
 * The entity of P_REPORT_LAYOUT as TABLE. <br>
 * 帳票レイアウトマスタ
 * <pre>
 * [primary-key]
 *     REPORT_LAYOUT_ID
 *
 * [column]
 *     REPORT_LAYOUT_ID, REPORT_ID, REPORT_LAYOUT_NM, REPORT_LAYOUT_DATA, UPDATABLE, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, AUTO_PRINT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_REPORT, B_CLASS_DTL(ByUpdatable), P_LAYOUT_PRINT_SETTING(AsOne), P_SUBREP_LAYOUT(AsOne)
 *
 * [referrer table]
 *     P_REPORT_LAYOUT_ITEM, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET, P_LAYOUT_PRINT_SETTING, P_SUBREP_LAYOUT
 *
 * [foreign property]
 *     pReport, bClassDtlByUpdatable, bClassDtlByAutoPrintTargetFlg, pLayoutPrintSettingAsOne, pSubrepLayoutAsOne
 *
 * [referrer property]
 *     pReportLayoutItemList, pUserAutoPrintSettingByReportLayoutIdList, pTerminalAutoPrintSetByReportLayoutIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long reportLayoutId = entity.getReportLayoutId();
 * Long reportId = entity.getReportId();
 * String reportLayoutNm = entity.getReportLayoutNm();
 * String reportLayoutData = entity.getReportLayoutData();
 * String updatable = entity.getUpdatable();
 * String attribute1 = entity.getAttribute1();
 * String attribute2 = entity.getAttribute2();
 * String attribute3 = entity.getAttribute3();
 * String attribute4 = entity.getAttribute4();
 * String attribute5 = entity.getAttribute5();
 * String autoPrintTargetFlg = entity.getAutoPrintTargetFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReportLayoutId(reportLayoutId);
 * entity.setReportId(reportId);
 * entity.setReportLayoutNm(reportLayoutNm);
 * entity.setReportLayoutData(reportLayoutData);
 * entity.setUpdatable(updatable);
 * entity.setAttribute1(attribute1);
 * entity.setAttribute2(attribute2);
 * entity.setAttribute3(attribute3);
 * entity.setAttribute4(attribute4);
 * entity.setAttribute5(attribute5);
 * entity.setAutoPrintTargetFlg(autoPrintTargetFlg);
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
public abstract class BsPReportLayout extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _reportLayoutId;

    /** REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT} */
    protected Long _reportId;

    /** REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)} */
    protected String _reportLayoutNm;

    /** REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)} */
    protected String _reportLayoutData;

    /** UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} */
    protected String _updatable;

    /** ATTRIBUTE1: {varchar(100)} */
    protected String _attribute1;

    /** ATTRIBUTE2: {varchar(100)} */
    protected String _attribute2;

    /** ATTRIBUTE3: {varchar(100)} */
    protected String _attribute3;

    /** ATTRIBUTE4: {varchar(100)} */
    protected String _attribute4;

    /** ATTRIBUTE5: {varchar(100)} */
    protected String _attribute5;

    /** AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} */
    protected String _autoPrintTargetFlg;

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
        return "P_REPORT_LAYOUT";
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
        if (_reportLayoutId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param reportId : UQ+, IX, NotNull, bigint(19), FK to P_REPORT. (NotNull)
     * @param reportLayoutNm : +UQ, NotNull, varchar(60). (NotNull)
     */
    public void uniqueBy(Long reportId, String reportLayoutNm) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("reportId");
        __uniqueDrivenProperties.addPropertyName("reportLayoutNm");
        setReportId(reportId);setReportLayoutNm(reportLayoutNm);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of updatable as the classification of Updatable. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Updatable getUpdatableAsUpdatable() {
        return CDef.Updatable.codeOf(getUpdatable());
    }

    /**
     * Set the value of updatable as the classification of Updatable. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUpdatableAsUpdatable(CDef.Updatable cdef) {
        setUpdatable(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of autoPrintTargetFlg as the classification of AutoPrintTargetFlg. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AutoPrintTargetFlg getAutoPrintTargetFlgAsAutoPrintTargetFlg() {
        return CDef.AutoPrintTargetFlg.codeOf(getAutoPrintTargetFlg());
    }

    /**
     * Set the value of autoPrintTargetFlg as the classification of AutoPrintTargetFlg. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAutoPrintTargetFlgAsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg cdef) {
        setAutoPrintTargetFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of updatable as $0 (0). <br>
     * $0: 更新不可
     */
    public void setUpdatable_$0() {
        setUpdatableAsUpdatable(CDef.Updatable.$0);
    }

    /**
     * Set the value of updatable as $1 (1). <br>
     * $1: 更新可能
     */
    public void setUpdatable_$1() {
        setUpdatableAsUpdatable(CDef.Updatable.$1);
    }

    /**
     * Set the value of autoPrintTargetFlg as $0 (0). <br>
     * $0: 自動印刷対象外
     */
    public void setAutoPrintTargetFlg_$0() {
        setAutoPrintTargetFlgAsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg.$0);
    }

    /**
     * Set the value of autoPrintTargetFlg as $1 (1). <br>
     * $1: 自動印刷対象
     */
    public void setAutoPrintTargetFlg_$1() {
        setAutoPrintTargetFlgAsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg.$1);
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
     * Is the value of updatable $0? <br>
     * $0: 更新不可
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUpdatable$0() {
        CDef.Updatable cdef = getUpdatableAsUpdatable();
        return cdef != null ? cdef.equals(CDef.Updatable.$0) : false;
    }

    /**
     * Is the value of updatable $1? <br>
     * $1: 更新可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUpdatable$1() {
        CDef.Updatable cdef = getUpdatableAsUpdatable();
        return cdef != null ? cdef.equals(CDef.Updatable.$1) : false;
    }

    /**
     * Is the value of autoPrintTargetFlg $0? <br>
     * $0: 自動印刷対象外
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAutoPrintTargetFlg$0() {
        CDef.AutoPrintTargetFlg cdef = getAutoPrintTargetFlgAsAutoPrintTargetFlg();
        return cdef != null ? cdef.equals(CDef.AutoPrintTargetFlg.$0) : false;
    }

    /**
     * Is the value of autoPrintTargetFlg $1? <br>
     * $1: 自動印刷対象
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAutoPrintTargetFlg$1() {
        CDef.AutoPrintTargetFlg cdef = getAutoPrintTargetFlgAsAutoPrintTargetFlg();
        return cdef != null ? cdef.equals(CDef.AutoPrintTargetFlg.$1) : false;
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
     * Get the value of the column 'updatable' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getUpdatableName() {
        CDef.Updatable cdef = getUpdatableAsUpdatable();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'autoPrintTargetFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAutoPrintTargetFlgName() {
        CDef.AutoPrintTargetFlg cdef = getAutoPrintTargetFlgAsAutoPrintTargetFlg();
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
    /** P_REPORT by my REPORT_ID, named 'PReport'. */
    protected PReport _pReport;

    /**
     * [get] P_REPORT by my REPORT_ID, named 'PReport'. <br>
     * @return The entity of foreign property 'PReport'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PReport getPReport() {
        return _pReport;
    }

    /**
     * [set] P_REPORT by my REPORT_ID, named 'PReport'.
     * @param pReport The entity of foreign property 'PReport'. (NullAllowed)
     */
    public void setPReport(PReport pReport) {
        _pReport = pReport;
    }

    /** B_CLASS_DTL by my UPDATABLE, named 'BClassDtlByUpdatable'. */
    protected BClassDtl _bClassDtlByUpdatable;

    /**
     * [get] B_CLASS_DTL by my UPDATABLE, named 'BClassDtlByUpdatable'. <br>
     * @return The entity of foreign property 'BClassDtlByUpdatable'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByUpdatable() {
        return _bClassDtlByUpdatable;
    }

    /**
     * [set] B_CLASS_DTL by my UPDATABLE, named 'BClassDtlByUpdatable'.
     * @param bClassDtlByUpdatable The entity of foreign property 'BClassDtlByUpdatable'. (NullAllowed)
     */
    public void setBClassDtlByUpdatable(BClassDtl bClassDtlByUpdatable) {
        _bClassDtlByUpdatable = bClassDtlByUpdatable;
    }

    /** B_CLASS_DTL by my AUTO_PRINT_TARGET_FLG, named 'BClassDtlByAutoPrintTargetFlg'. */
    protected BClassDtl _bClassDtlByAutoPrintTargetFlg;

    /**
     * [get] B_CLASS_DTL by my AUTO_PRINT_TARGET_FLG, named 'BClassDtlByAutoPrintTargetFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByAutoPrintTargetFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAutoPrintTargetFlg() {
        return _bClassDtlByAutoPrintTargetFlg;
    }

    /**
     * [set] B_CLASS_DTL by my AUTO_PRINT_TARGET_FLG, named 'BClassDtlByAutoPrintTargetFlg'.
     * @param bClassDtlByAutoPrintTargetFlg The entity of foreign property 'BClassDtlByAutoPrintTargetFlg'. (NullAllowed)
     */
    public void setBClassDtlByAutoPrintTargetFlg(BClassDtl bClassDtlByAutoPrintTargetFlg) {
        _bClassDtlByAutoPrintTargetFlg = bClassDtlByAutoPrintTargetFlg;
    }

    /** P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'. */
    protected PLayoutPrintSetting _pLayoutPrintSettingAsOne;

    /**
     * [get] P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'PLayoutPrintSettingAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public PLayoutPrintSetting getPLayoutPrintSettingAsOne() {
        return _pLayoutPrintSettingAsOne;
    }

    /**
     * [set] P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
     * @param PLayoutPrintSettingAsOne The entity of foreign property(referrer-as-one) 'PLayoutPrintSettingAsOne'. (NullAllowed)
     */
    public void setPLayoutPrintSettingAsOne(PLayoutPrintSetting PLayoutPrintSettingAsOne) {
        _pLayoutPrintSettingAsOne = PLayoutPrintSettingAsOne;
    }

    /** P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'. */
    protected PSubrepLayout _pSubrepLayoutAsOne;

    /**
     * [get] P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'PSubrepLayoutAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public PSubrepLayout getPSubrepLayoutAsOne() {
        return _pSubrepLayoutAsOne;
    }

    /**
     * [set] P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
     * @param PSubrepLayoutAsOne The entity of foreign property(referrer-as-one) 'PSubrepLayoutAsOne'. (NullAllowed)
     */
    public void setPSubrepLayoutAsOne(PSubrepLayout PSubrepLayoutAsOne) {
        _pSubrepLayoutAsOne = PSubrepLayoutAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemList'. */
    protected List<PReportLayoutItem> _pReportLayoutItemList;

    /**
     * [get] P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemList'.
     * @return The entity list of referrer property 'PReportLayoutItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PReportLayoutItem> getPReportLayoutItemList() {
        if (_pReportLayoutItemList == null) { _pReportLayoutItemList = newReferrerList(); }
        return _pReportLayoutItemList;
    }

    /**
     * [set] P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemList'.
     * @param pReportLayoutItemList The entity list of referrer property 'PReportLayoutItemList'. (NullAllowed)
     */
    public void setPReportLayoutItemList(List<PReportLayoutItem> pReportLayoutItemList) {
        _pReportLayoutItemList = pReportLayoutItemList;
    }

    /** P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingByReportLayoutIdList'. */
    protected List<PUserAutoPrintSetting> _pUserAutoPrintSettingByReportLayoutIdList;

    /**
     * [get] P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingByReportLayoutIdList'.
     * @return The entity list of referrer property 'PUserAutoPrintSettingByReportLayoutIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PUserAutoPrintSetting> getPUserAutoPrintSettingByReportLayoutIdList() {
        if (_pUserAutoPrintSettingByReportLayoutIdList == null) { _pUserAutoPrintSettingByReportLayoutIdList = newReferrerList(); }
        return _pUserAutoPrintSettingByReportLayoutIdList;
    }

    /**
     * [set] P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingByReportLayoutIdList'.
     * @param pUserAutoPrintSettingByReportLayoutIdList The entity list of referrer property 'PUserAutoPrintSettingByReportLayoutIdList'. (NullAllowed)
     */
    public void setPUserAutoPrintSettingByReportLayoutIdList(List<PUserAutoPrintSetting> pUserAutoPrintSettingByReportLayoutIdList) {
        _pUserAutoPrintSettingByReportLayoutIdList = pUserAutoPrintSettingByReportLayoutIdList;
    }

    /** P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetByReportLayoutIdList'. */
    protected List<PTerminalAutoPrintSet> _pTerminalAutoPrintSetByReportLayoutIdList;

    /**
     * [get] P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetByReportLayoutIdList'.
     * @return The entity list of referrer property 'PTerminalAutoPrintSetByReportLayoutIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PTerminalAutoPrintSet> getPTerminalAutoPrintSetByReportLayoutIdList() {
        if (_pTerminalAutoPrintSetByReportLayoutIdList == null) { _pTerminalAutoPrintSetByReportLayoutIdList = newReferrerList(); }
        return _pTerminalAutoPrintSetByReportLayoutIdList;
    }

    /**
     * [set] P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetByReportLayoutIdList'.
     * @param pTerminalAutoPrintSetByReportLayoutIdList The entity list of referrer property 'PTerminalAutoPrintSetByReportLayoutIdList'. (NullAllowed)
     */
    public void setPTerminalAutoPrintSetByReportLayoutIdList(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetByReportLayoutIdList) {
        _pTerminalAutoPrintSetByReportLayoutIdList = pTerminalAutoPrintSetByReportLayoutIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPReportLayout) {
            BsPReportLayout other = (BsPReportLayout)obj;
            if (!xSV(_reportLayoutId, other._reportLayoutId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _reportLayoutId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pReport != null)
        { sb.append(li).append(xbRDS(_pReport, "pReport")); }
        if (_bClassDtlByUpdatable != null)
        { sb.append(li).append(xbRDS(_bClassDtlByUpdatable, "bClassDtlByUpdatable")); }
        if (_bClassDtlByAutoPrintTargetFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAutoPrintTargetFlg, "bClassDtlByAutoPrintTargetFlg")); }
        if (_pLayoutPrintSettingAsOne != null)
        { sb.append(li).append(xbRDS(_pLayoutPrintSettingAsOne, "pLayoutPrintSettingAsOne")); }
        if (_pSubrepLayoutAsOne != null)
        { sb.append(li).append(xbRDS(_pSubrepLayoutAsOne, "pSubrepLayoutAsOne")); }
        if (_pReportLayoutItemList != null) { for (PReportLayoutItem et : _pReportLayoutItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pReportLayoutItemList")); } } }
        if (_pUserAutoPrintSettingByReportLayoutIdList != null) { for (PUserAutoPrintSetting et : _pUserAutoPrintSettingByReportLayoutIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pUserAutoPrintSettingByReportLayoutIdList")); } } }
        if (_pTerminalAutoPrintSetByReportLayoutIdList != null) { for (PTerminalAutoPrintSet et : _pTerminalAutoPrintSetByReportLayoutIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pTerminalAutoPrintSetByReportLayoutIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_reportLayoutId));
        sb.append(dm).append(xfND(_reportId));
        sb.append(dm).append(xfND(_reportLayoutNm));
        sb.append(dm).append(xfND(_reportLayoutData));
        sb.append(dm).append(xfND(_updatable));
        sb.append(dm).append(xfND(_attribute1));
        sb.append(dm).append(xfND(_attribute2));
        sb.append(dm).append(xfND(_attribute3));
        sb.append(dm).append(xfND(_attribute4));
        sb.append(dm).append(xfND(_attribute5));
        sb.append(dm).append(xfND(_autoPrintTargetFlg));
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
        if (_pReport != null)
        { sb.append(dm).append("pReport"); }
        if (_bClassDtlByUpdatable != null)
        { sb.append(dm).append("bClassDtlByUpdatable"); }
        if (_bClassDtlByAutoPrintTargetFlg != null)
        { sb.append(dm).append("bClassDtlByAutoPrintTargetFlg"); }
        if (_pLayoutPrintSettingAsOne != null)
        { sb.append(dm).append("pLayoutPrintSettingAsOne"); }
        if (_pSubrepLayoutAsOne != null)
        { sb.append(dm).append("pSubrepLayoutAsOne"); }
        if (_pReportLayoutItemList != null && !_pReportLayoutItemList.isEmpty())
        { sb.append(dm).append("pReportLayoutItemList"); }
        if (_pUserAutoPrintSettingByReportLayoutIdList != null && !_pUserAutoPrintSettingByReportLayoutIdList.isEmpty())
        { sb.append(dm).append("pUserAutoPrintSettingByReportLayoutIdList"); }
        if (_pTerminalAutoPrintSetByReportLayoutIdList != null && !_pTerminalAutoPrintSetByReportLayoutIdList.isEmpty())
        { sb.append(dm).append("pTerminalAutoPrintSetByReportLayoutIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PReportLayout clone() {
        return (PReportLayout)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 帳票レイアウトID
     * @return The value of the column 'REPORT_LAYOUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReportLayoutId() {
        checkSpecifiedProperty("reportLayoutId");
        return _reportLayoutId;
    }

    /**
     * [set] REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 帳票レイアウトID
     * @param reportLayoutId The value of the column 'REPORT_LAYOUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReportLayoutId(Long reportLayoutId) {
        registerModifiedProperty("reportLayoutId");
        _reportLayoutId = reportLayoutId;
    }

    /**
     * [get] REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT} <br>
     * 帳票ID
     * @return The value of the column 'REPORT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReportId() {
        checkSpecifiedProperty("reportId");
        return _reportId;
    }

    /**
     * [set] REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT} <br>
     * 帳票ID
     * @param reportId The value of the column 'REPORT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReportId(Long reportId) {
        registerModifiedProperty("reportId");
        _reportId = reportId;
    }

    /**
     * [get] REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)} <br>
     * 帳票レイアウト名称
     * @return The value of the column 'REPORT_LAYOUT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getReportLayoutNm() {
        checkSpecifiedProperty("reportLayoutNm");
        return convertEmptyToNull(_reportLayoutNm);
    }

    /**
     * [set] REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)} <br>
     * 帳票レイアウト名称
     * @param reportLayoutNm The value of the column 'REPORT_LAYOUT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setReportLayoutNm(String reportLayoutNm) {
        registerModifiedProperty("reportLayoutNm");
        _reportLayoutNm = reportLayoutNm;
    }

    /**
     * [get] REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)} <br>
     * 帳票レイアウトデータ
     * @return The value of the column 'REPORT_LAYOUT_DATA'. (basically NotNull if selected: for the constraint)
     */
    public String getReportLayoutData() {
        checkSpecifiedProperty("reportLayoutData");
        return convertEmptyToNull(_reportLayoutData);
    }

    /**
     * [set] REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)} <br>
     * 帳票レイアウトデータ
     * @param reportLayoutData The value of the column 'REPORT_LAYOUT_DATA'. (basically NotNull if update: for the constraint)
     */
    public void setReportLayoutData(String reportLayoutData) {
        registerModifiedProperty("reportLayoutData");
        _reportLayoutData = reportLayoutData;
    }

    /**
     * [get] UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @return The value of the column 'UPDATABLE'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdatable() {
        checkSpecifiedProperty("updatable");
        return convertEmptyToNull(_updatable);
    }

    /**
     * [set] UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @param updatable The value of the column 'UPDATABLE'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatable(String updatable) {
        registerModifiedProperty("updatable");
        _updatable = updatable;
    }

    /**
     * [get] ATTRIBUTE1: {varchar(100)} <br>
     * 属性1
     * @return The value of the column 'ATTRIBUTE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute1() {
        checkSpecifiedProperty("attribute1");
        return convertEmptyToNull(_attribute1);
    }

    /**
     * [set] ATTRIBUTE1: {varchar(100)} <br>
     * 属性1
     * @param attribute1 The value of the column 'ATTRIBUTE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute1(String attribute1) {
        registerModifiedProperty("attribute1");
        _attribute1 = attribute1;
    }

    /**
     * [get] ATTRIBUTE2: {varchar(100)} <br>
     * 属性2
     * @return The value of the column 'ATTRIBUTE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute2() {
        checkSpecifiedProperty("attribute2");
        return convertEmptyToNull(_attribute2);
    }

    /**
     * [set] ATTRIBUTE2: {varchar(100)} <br>
     * 属性2
     * @param attribute2 The value of the column 'ATTRIBUTE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute2(String attribute2) {
        registerModifiedProperty("attribute2");
        _attribute2 = attribute2;
    }

    /**
     * [get] ATTRIBUTE3: {varchar(100)} <br>
     * 属性3
     * @return The value of the column 'ATTRIBUTE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute3() {
        checkSpecifiedProperty("attribute3");
        return convertEmptyToNull(_attribute3);
    }

    /**
     * [set] ATTRIBUTE3: {varchar(100)} <br>
     * 属性3
     * @param attribute3 The value of the column 'ATTRIBUTE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute3(String attribute3) {
        registerModifiedProperty("attribute3");
        _attribute3 = attribute3;
    }

    /**
     * [get] ATTRIBUTE4: {varchar(100)} <br>
     * 属性4
     * @return The value of the column 'ATTRIBUTE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute4() {
        checkSpecifiedProperty("attribute4");
        return convertEmptyToNull(_attribute4);
    }

    /**
     * [set] ATTRIBUTE4: {varchar(100)} <br>
     * 属性4
     * @param attribute4 The value of the column 'ATTRIBUTE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute4(String attribute4) {
        registerModifiedProperty("attribute4");
        _attribute4 = attribute4;
    }

    /**
     * [get] ATTRIBUTE5: {varchar(100)} <br>
     * 属性5
     * @return The value of the column 'ATTRIBUTE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute5() {
        checkSpecifiedProperty("attribute5");
        return convertEmptyToNull(_attribute5);
    }

    /**
     * [set] ATTRIBUTE5: {varchar(100)} <br>
     * 属性5
     * @param attribute5 The value of the column 'ATTRIBUTE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute5(String attribute5) {
        registerModifiedProperty("attribute5");
        _attribute5 = attribute5;
    }

    /**
     * [get] AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @return The value of the column 'AUTO_PRINT_TARGET_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getAutoPrintTargetFlg() {
        checkSpecifiedProperty("autoPrintTargetFlg");
        return convertEmptyToNull(_autoPrintTargetFlg);
    }

    /**
     * [set] AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @param autoPrintTargetFlg The value of the column 'AUTO_PRINT_TARGET_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setAutoPrintTargetFlg(String autoPrintTargetFlg) {
        registerModifiedProperty("autoPrintTargetFlg");
        _autoPrintTargetFlg = autoPrintTargetFlg;
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
