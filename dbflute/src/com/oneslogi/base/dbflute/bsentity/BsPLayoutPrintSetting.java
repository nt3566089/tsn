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
 * The entity of P_LAYOUT_PRINT_SETTING as TABLE. <br>
 * レイアウト別印刷設定マスタ
 * <pre>
 * [primary-key]
 *     LAYOUT_PRINT_SETTING_ID
 *
 * [column]
 *     LAYOUT_PRINT_SETTING_ID, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, PRINT_NUM, SHEET_COLLATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAYOUT_PRINT_SETTING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINTER_GROUP, P_PRINTER_ATTRIBUTE, P_REPORT_LAYOUT, P_PRINTER, B_CLASS_DTL(BySheetCollate)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrinterGroup, pPrinterAttribute, pReportLayout, pPrinter, bClassDtlBySheetCollate
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long layoutPrintSettingId = entity.getLayoutPrintSettingId();
 * Long reportLayoutId = entity.getReportLayoutId();
 * Long printerGroupId = entity.getPrinterGroupId();
 * Long printerId = entity.getPrinterId();
 * Long printerAttributeId = entity.getPrinterAttributeId();
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
 * entity.setLayoutPrintSettingId(layoutPrintSettingId);
 * entity.setReportLayoutId(reportLayoutId);
 * entity.setPrinterGroupId(printerGroupId);
 * entity.setPrinterId(printerId);
 * entity.setPrinterAttributeId(printerAttributeId);
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
public abstract class BsPLayoutPrintSetting extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _layoutPrintSettingId;

    /** REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT} */
    protected Long _reportLayoutId;

    /** PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP} */
    protected Long _printerGroupId;

    /** PRINTER_ID: {IX, bigint(19), FK to P_PRINTER} */
    protected Long _printerId;

    /** PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE} */
    protected Long _printerAttributeId;

    /** PRINT_NUM: {bigint(19)} */
    protected Long _printNum;

    /** SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} */
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
        return "P_LAYOUT_PRINT_SETTING";
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
        if (_layoutPrintSettingId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param reportLayoutId : UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT. (NotNull)
     */
    public void uniqueBy(Long reportLayoutId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("reportLayoutId");
        setReportLayoutId(reportLayoutId);
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
    /** P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'. */
    protected PPrinterGroup _pPrinterGroup;

    /**
     * [get] P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'. <br>
     * @return The entity of foreign property 'PPrinterGroup'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PPrinterGroup getPPrinterGroup() {
        return _pPrinterGroup;
    }

    /**
     * [set] P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     * @param pPrinterGroup The entity of foreign property 'PPrinterGroup'. (NullAllowed)
     */
    public void setPPrinterGroup(PPrinterGroup pPrinterGroup) {
        _pPrinterGroup = pPrinterGroup;
    }

    /** P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'. */
    protected PPrinterAttribute _pPrinterAttribute;

    /**
     * [get] P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'. <br>
     * @return The entity of foreign property 'PPrinterAttribute'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PPrinterAttribute getPPrinterAttribute() {
        return _pPrinterAttribute;
    }

    /**
     * [set] P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'.
     * @param pPrinterAttribute The entity of foreign property 'PPrinterAttribute'. (NullAllowed)
     */
    public void setPPrinterAttribute(PPrinterAttribute pPrinterAttribute) {
        _pPrinterAttribute = pPrinterAttribute;
    }

    /** P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'. */
    protected PReportLayout _pReportLayout;

    /**
     * [get] P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'. <br>
     * @return The entity of foreign property 'PReportLayout'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PReportLayout getPReportLayout() {
        return _pReportLayout;
    }

    /**
     * [set] P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @param pReportLayout The entity of foreign property 'PReportLayout'. (NullAllowed)
     */
    public void setPReportLayout(PReportLayout pReportLayout) {
        _pReportLayout = pReportLayout;
    }

    /** P_PRINTER by my PRINTER_ID, named 'PPrinter'. */
    protected PPrinter _pPrinter;

    /**
     * [get] P_PRINTER by my PRINTER_ID, named 'PPrinter'. <br>
     * @return The entity of foreign property 'PPrinter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PPrinter getPPrinter() {
        return _pPrinter;
    }

    /**
     * [set] P_PRINTER by my PRINTER_ID, named 'PPrinter'.
     * @param pPrinter The entity of foreign property 'PPrinter'. (NullAllowed)
     */
    public void setPPrinter(PPrinter pPrinter) {
        _pPrinter = pPrinter;
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
        if (obj instanceof BsPLayoutPrintSetting) {
            BsPLayoutPrintSetting other = (BsPLayoutPrintSetting)obj;
            if (!xSV(_layoutPrintSettingId, other._layoutPrintSettingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _layoutPrintSettingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pPrinterGroup != null)
        { sb.append(li).append(xbRDS(_pPrinterGroup, "pPrinterGroup")); }
        if (_pPrinterAttribute != null)
        { sb.append(li).append(xbRDS(_pPrinterAttribute, "pPrinterAttribute")); }
        if (_pReportLayout != null)
        { sb.append(li).append(xbRDS(_pReportLayout, "pReportLayout")); }
        if (_pPrinter != null)
        { sb.append(li).append(xbRDS(_pPrinter, "pPrinter")); }
        if (_bClassDtlBySheetCollate != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySheetCollate, "bClassDtlBySheetCollate")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_layoutPrintSettingId));
        sb.append(dm).append(xfND(_reportLayoutId));
        sb.append(dm).append(xfND(_printerGroupId));
        sb.append(dm).append(xfND(_printerId));
        sb.append(dm).append(xfND(_printerAttributeId));
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
        if (_pPrinterGroup != null)
        { sb.append(dm).append("pPrinterGroup"); }
        if (_pPrinterAttribute != null)
        { sb.append(dm).append("pPrinterAttribute"); }
        if (_pReportLayout != null)
        { sb.append(dm).append("pReportLayout"); }
        if (_pPrinter != null)
        { sb.append(dm).append("pPrinter"); }
        if (_bClassDtlBySheetCollate != null)
        { sb.append(dm).append("bClassDtlBySheetCollate"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PLayoutPrintSetting clone() {
        return (PLayoutPrintSetting)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * レイアウト別印刷設定ID
     * @return The value of the column 'LAYOUT_PRINT_SETTING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLayoutPrintSettingId() {
        checkSpecifiedProperty("layoutPrintSettingId");
        return _layoutPrintSettingId;
    }

    /**
     * [set] LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * レイアウト別印刷設定ID
     * @param layoutPrintSettingId The value of the column 'LAYOUT_PRINT_SETTING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLayoutPrintSettingId(Long layoutPrintSettingId) {
        registerModifiedProperty("layoutPrintSettingId");
        _layoutPrintSettingId = layoutPrintSettingId;
    }

    /**
     * [get] REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT} <br>
     * 帳票レイアウトID
     * @return The value of the column 'REPORT_LAYOUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReportLayoutId() {
        checkSpecifiedProperty("reportLayoutId");
        return _reportLayoutId;
    }

    /**
     * [set] REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT} <br>
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
