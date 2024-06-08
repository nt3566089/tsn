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
 * The entity of P_PRINTER as TABLE. <br>
 * プリンタマスタ
 * <pre>
 * [primary-key]
 *     PRINTER_ID
 *
 * [column]
 *     PRINTER_ID, PRINTER_GROUP_ID, PRINTER_NM, VISIBLE, ADD_TERMINAL, UPD_TERMINAL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINTER_GROUP, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     P_LAYOUT_PRINT_SETTING, P_PRINTER_ATTRIBUTE, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign property]
 *     pPrinterGroup, bClassDtlByVisible
 *
 * [referrer property]
 *     pLayoutPrintSettingList, pPrinterAttributeList, pUserAutoPrintSettingByPrinterIdList, pTerminalAutoPrintSetByPrinterIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long printerId = entity.getPrinterId();
 * Long printerGroupId = entity.getPrinterGroupId();
 * String printerNm = entity.getPrinterNm();
 * String visible = entity.getVisible();
 * String addTerminal = entity.getAddTerminal();
 * String updTerminal = entity.getUpdTerminal();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPrinterId(printerId);
 * entity.setPrinterGroupId(printerGroupId);
 * entity.setPrinterNm(printerNm);
 * entity.setVisible(visible);
 * entity.setAddTerminal(addTerminal);
 * entity.setUpdTerminal(updTerminal);
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
public abstract class BsPPrinter extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINTER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _printerId;

    /** PRINTER_GROUP_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINTER_GROUP} */
    protected Long _printerGroupId;

    /** PRINTER_NM: {+UQ, NotNull, varchar(60)} */
    protected String _printerNm;

    /** VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} */
    protected String _visible;

    /** ADD_TERMINAL: {varchar(60)} */
    protected String _addTerminal;

    /** UPD_TERMINAL: {varchar(60)} */
    protected String _updTerminal;

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
        return "P_PRINTER";
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
        if (_printerId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param printerGroupId : UQ+, IX, NotNull, bigint(19), FK to P_PRINTER_GROUP. (NotNull)
     * @param printerNm : +UQ, NotNull, varchar(60). (NotNull)
     */
    public void uniqueBy(Long printerGroupId, String printerNm) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("printerGroupId");
        __uniqueDrivenProperties.addPropertyName("printerNm");
        setPrinterGroupId(printerGroupId);setPrinterNm(printerNm);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of visible as the classification of Visible. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Visible getVisibleAsVisible() {
        return CDef.Visible.codeOf(getVisible());
    }

    /**
     * Set the value of visible as the classification of Visible. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setVisibleAsVisible(CDef.Visible cdef) {
        setVisible(cdef != null ? cdef.code() : null);
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
     * Set the value of visible as $0 (0). <br>
     * $0: 非表示
     */
    public void setVisible_$0() {
        setVisibleAsVisible(CDef.Visible.$0);
    }

    /**
     * Set the value of visible as $1 (1). <br>
     * $1: 表示
     */
    public void setVisible_$1() {
        setVisibleAsVisible(CDef.Visible.$1);
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
     * Is the value of visible $0? <br>
     * $0: 非表示
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isVisible$0() {
        CDef.Visible cdef = getVisibleAsVisible();
        return cdef != null ? cdef.equals(CDef.Visible.$0) : false;
    }

    /**
     * Is the value of visible $1? <br>
     * $1: 表示
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isVisible$1() {
        CDef.Visible cdef = getVisibleAsVisible();
        return cdef != null ? cdef.equals(CDef.Visible.$1) : false;
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
     * Get the value of the column 'visible' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getVisibleName() {
        CDef.Visible cdef = getVisibleAsVisible();
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

    /** B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'. */
    protected BClassDtl _bClassDtlByVisible;

    /**
     * [get] B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'. <br>
     * @return The entity of foreign property 'BClassDtlByVisible'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByVisible() {
        return _bClassDtlByVisible;
    }

    /**
     * [set] B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @param bClassDtlByVisible The entity of foreign property 'BClassDtlByVisible'. (NullAllowed)
     */
    public void setBClassDtlByVisible(BClassDtl bClassDtlByVisible) {
        _bClassDtlByVisible = bClassDtlByVisible;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** P_LAYOUT_PRINT_SETTING by PRINTER_ID, named 'PLayoutPrintSettingList'. */
    protected List<PLayoutPrintSetting> _pLayoutPrintSettingList;

    /**
     * [get] P_LAYOUT_PRINT_SETTING by PRINTER_ID, named 'PLayoutPrintSettingList'.
     * @return The entity list of referrer property 'PLayoutPrintSettingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PLayoutPrintSetting> getPLayoutPrintSettingList() {
        if (_pLayoutPrintSettingList == null) { _pLayoutPrintSettingList = newReferrerList(); }
        return _pLayoutPrintSettingList;
    }

    /**
     * [set] P_LAYOUT_PRINT_SETTING by PRINTER_ID, named 'PLayoutPrintSettingList'.
     * @param pLayoutPrintSettingList The entity list of referrer property 'PLayoutPrintSettingList'. (NullAllowed)
     */
    public void setPLayoutPrintSettingList(List<PLayoutPrintSetting> pLayoutPrintSettingList) {
        _pLayoutPrintSettingList = pLayoutPrintSettingList;
    }

    /** P_PRINTER_ATTRIBUTE by PRINTER_ID, named 'PPrinterAttributeList'. */
    protected List<PPrinterAttribute> _pPrinterAttributeList;

    /**
     * [get] P_PRINTER_ATTRIBUTE by PRINTER_ID, named 'PPrinterAttributeList'.
     * @return The entity list of referrer property 'PPrinterAttributeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PPrinterAttribute> getPPrinterAttributeList() {
        if (_pPrinterAttributeList == null) { _pPrinterAttributeList = newReferrerList(); }
        return _pPrinterAttributeList;
    }

    /**
     * [set] P_PRINTER_ATTRIBUTE by PRINTER_ID, named 'PPrinterAttributeList'.
     * @param pPrinterAttributeList The entity list of referrer property 'PPrinterAttributeList'. (NullAllowed)
     */
    public void setPPrinterAttributeList(List<PPrinterAttribute> pPrinterAttributeList) {
        _pPrinterAttributeList = pPrinterAttributeList;
    }

    /** P_USER_AUTO_PRINT_SETTING by PRINTER_ID, named 'PUserAutoPrintSettingByPrinterIdList'. */
    protected List<PUserAutoPrintSetting> _pUserAutoPrintSettingByPrinterIdList;

    /**
     * [get] P_USER_AUTO_PRINT_SETTING by PRINTER_ID, named 'PUserAutoPrintSettingByPrinterIdList'.
     * @return The entity list of referrer property 'PUserAutoPrintSettingByPrinterIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PUserAutoPrintSetting> getPUserAutoPrintSettingByPrinterIdList() {
        if (_pUserAutoPrintSettingByPrinterIdList == null) { _pUserAutoPrintSettingByPrinterIdList = newReferrerList(); }
        return _pUserAutoPrintSettingByPrinterIdList;
    }

    /**
     * [set] P_USER_AUTO_PRINT_SETTING by PRINTER_ID, named 'PUserAutoPrintSettingByPrinterIdList'.
     * @param pUserAutoPrintSettingByPrinterIdList The entity list of referrer property 'PUserAutoPrintSettingByPrinterIdList'. (NullAllowed)
     */
    public void setPUserAutoPrintSettingByPrinterIdList(List<PUserAutoPrintSetting> pUserAutoPrintSettingByPrinterIdList) {
        _pUserAutoPrintSettingByPrinterIdList = pUserAutoPrintSettingByPrinterIdList;
    }

    /** P_TERMINAL_AUTO_PRINT_SET by PRINTER_ID, named 'PTerminalAutoPrintSetByPrinterIdList'. */
    protected List<PTerminalAutoPrintSet> _pTerminalAutoPrintSetByPrinterIdList;

    /**
     * [get] P_TERMINAL_AUTO_PRINT_SET by PRINTER_ID, named 'PTerminalAutoPrintSetByPrinterIdList'.
     * @return The entity list of referrer property 'PTerminalAutoPrintSetByPrinterIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PTerminalAutoPrintSet> getPTerminalAutoPrintSetByPrinterIdList() {
        if (_pTerminalAutoPrintSetByPrinterIdList == null) { _pTerminalAutoPrintSetByPrinterIdList = newReferrerList(); }
        return _pTerminalAutoPrintSetByPrinterIdList;
    }

    /**
     * [set] P_TERMINAL_AUTO_PRINT_SET by PRINTER_ID, named 'PTerminalAutoPrintSetByPrinterIdList'.
     * @param pTerminalAutoPrintSetByPrinterIdList The entity list of referrer property 'PTerminalAutoPrintSetByPrinterIdList'. (NullAllowed)
     */
    public void setPTerminalAutoPrintSetByPrinterIdList(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetByPrinterIdList) {
        _pTerminalAutoPrintSetByPrinterIdList = pTerminalAutoPrintSetByPrinterIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPPrinter) {
            BsPPrinter other = (BsPPrinter)obj;
            if (!xSV(_printerId, other._printerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pPrinterGroup != null)
        { sb.append(li).append(xbRDS(_pPrinterGroup, "pPrinterGroup")); }
        if (_bClassDtlByVisible != null)
        { sb.append(li).append(xbRDS(_bClassDtlByVisible, "bClassDtlByVisible")); }
        if (_pLayoutPrintSettingList != null) { for (PLayoutPrintSetting et : _pLayoutPrintSettingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pLayoutPrintSettingList")); } } }
        if (_pPrinterAttributeList != null) { for (PPrinterAttribute et : _pPrinterAttributeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pPrinterAttributeList")); } } }
        if (_pUserAutoPrintSettingByPrinterIdList != null) { for (PUserAutoPrintSetting et : _pUserAutoPrintSettingByPrinterIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pUserAutoPrintSettingByPrinterIdList")); } } }
        if (_pTerminalAutoPrintSetByPrinterIdList != null) { for (PTerminalAutoPrintSet et : _pTerminalAutoPrintSetByPrinterIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pTerminalAutoPrintSetByPrinterIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printerId));
        sb.append(dm).append(xfND(_printerGroupId));
        sb.append(dm).append(xfND(_printerNm));
        sb.append(dm).append(xfND(_visible));
        sb.append(dm).append(xfND(_addTerminal));
        sb.append(dm).append(xfND(_updTerminal));
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
        if (_bClassDtlByVisible != null)
        { sb.append(dm).append("bClassDtlByVisible"); }
        if (_pLayoutPrintSettingList != null && !_pLayoutPrintSettingList.isEmpty())
        { sb.append(dm).append("pLayoutPrintSettingList"); }
        if (_pPrinterAttributeList != null && !_pPrinterAttributeList.isEmpty())
        { sb.append(dm).append("pPrinterAttributeList"); }
        if (_pUserAutoPrintSettingByPrinterIdList != null && !_pUserAutoPrintSettingByPrinterIdList.isEmpty())
        { sb.append(dm).append("pUserAutoPrintSettingByPrinterIdList"); }
        if (_pTerminalAutoPrintSetByPrinterIdList != null && !_pTerminalAutoPrintSetByPrinterIdList.isEmpty())
        { sb.append(dm).append("pTerminalAutoPrintSetByPrinterIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PPrinter clone() {
        return (PPrinter)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * プリンタID
     * @return The value of the column 'PRINTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrinterId() {
        checkSpecifiedProperty("printerId");
        return _printerId;
    }

    /**
     * [set] PRINTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * プリンタID
     * @param printerId The value of the column 'PRINTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterId(Long printerId) {
        registerModifiedProperty("printerId");
        _printerId = printerId;
    }

    /**
     * [get] PRINTER_GROUP_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINTER_GROUP} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrinterGroupId() {
        checkSpecifiedProperty("printerGroupId");
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINTER_GROUP} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        registerModifiedProperty("printerGroupId");
        _printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINTER_NM: {+UQ, NotNull, varchar(60)} <br>
     * プリンタ名称
     * @return The value of the column 'PRINTER_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getPrinterNm() {
        checkSpecifiedProperty("printerNm");
        return convertEmptyToNull(_printerNm);
    }

    /**
     * [set] PRINTER_NM: {+UQ, NotNull, varchar(60)} <br>
     * プリンタ名称
     * @param printerNm The value of the column 'PRINTER_NM'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterNm(String printerNm) {
        registerModifiedProperty("printerNm");
        _printerNm = printerNm;
    }

    /**
     * [get] VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @return The value of the column 'VISIBLE'. (basically NotNull if selected: for the constraint)
     */
    public String getVisible() {
        checkSpecifiedProperty("visible");
        return convertEmptyToNull(_visible);
    }

    /**
     * [set] VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param visible The value of the column 'VISIBLE'. (basically NotNull if update: for the constraint)
     */
    public void setVisible(String visible) {
        registerModifiedProperty("visible");
        _visible = visible;
    }

    /**
     * [get] ADD_TERMINAL: {varchar(60)} <br>
     * 登録端末
     * @return The value of the column 'ADD_TERMINAL'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddTerminal() {
        checkSpecifiedProperty("addTerminal");
        return convertEmptyToNull(_addTerminal);
    }

    /**
     * [set] ADD_TERMINAL: {varchar(60)} <br>
     * 登録端末
     * @param addTerminal The value of the column 'ADD_TERMINAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddTerminal(String addTerminal) {
        registerModifiedProperty("addTerminal");
        _addTerminal = addTerminal;
    }

    /**
     * [get] UPD_TERMINAL: {varchar(60)} <br>
     * 更新端末
     * @return The value of the column 'UPD_TERMINAL'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdTerminal() {
        checkSpecifiedProperty("updTerminal");
        return convertEmptyToNull(_updTerminal);
    }

    /**
     * [set] UPD_TERMINAL: {varchar(60)} <br>
     * 更新端末
     * @param updTerminal The value of the column 'UPD_TERMINAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdTerminal(String updTerminal) {
        registerModifiedProperty("updTerminal");
        _updTerminal = updTerminal;
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
