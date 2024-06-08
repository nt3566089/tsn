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
 * The entity of P_PRINTER_GROUP as TABLE. <br>
 * プリンタグループマスタ
 * <pre>
 * [primary-key]
 *     PRINTER_GROUP_ID
 *
 * [column]
 *     PRINTER_GROUP_ID, PRINTER_GROUP_NM, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_GROUP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     P_LAYOUT_PRINT_SETTING, P_PRINTER, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     pLayoutPrintSettingList, pPrinterList, pUserAutoPrintSettingByPrinterGroupIdList, pTerminalAutoPrintSetByPrinterGroupIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long printerGroupId = entity.getPrinterGroupId();
 * String printerGroupNm = entity.getPrinterGroupNm();
 * String attribute1 = entity.getAttribute1();
 * String attribute2 = entity.getAttribute2();
 * String attribute3 = entity.getAttribute3();
 * String attribute4 = entity.getAttribute4();
 * String attribute5 = entity.getAttribute5();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPrinterGroupId(printerGroupId);
 * entity.setPrinterGroupNm(printerGroupNm);
 * entity.setAttribute1(attribute1);
 * entity.setAttribute2(attribute2);
 * entity.setAttribute3(attribute3);
 * entity.setAttribute4(attribute4);
 * entity.setAttribute5(attribute5);
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
public abstract class BsPPrinterGroup extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _printerGroupId;

    /** PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)} */
    protected String _printerGroupNm;

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
        return "P_PRINTER_GROUP";
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
        if (_printerGroupId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param printerGroupNm : UQ, NotNull, varchar(60). (NotNull)
     */
    public void uniqueBy(String printerGroupNm) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("printerGroupNm");
        setPrinterGroupNm(printerGroupNm);
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
    /** P_LAYOUT_PRINT_SETTING by PRINTER_GROUP_ID, named 'PLayoutPrintSettingList'. */
    protected List<PLayoutPrintSetting> _pLayoutPrintSettingList;

    /**
     * [get] P_LAYOUT_PRINT_SETTING by PRINTER_GROUP_ID, named 'PLayoutPrintSettingList'.
     * @return The entity list of referrer property 'PLayoutPrintSettingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PLayoutPrintSetting> getPLayoutPrintSettingList() {
        if (_pLayoutPrintSettingList == null) { _pLayoutPrintSettingList = newReferrerList(); }
        return _pLayoutPrintSettingList;
    }

    /**
     * [set] P_LAYOUT_PRINT_SETTING by PRINTER_GROUP_ID, named 'PLayoutPrintSettingList'.
     * @param pLayoutPrintSettingList The entity list of referrer property 'PLayoutPrintSettingList'. (NullAllowed)
     */
    public void setPLayoutPrintSettingList(List<PLayoutPrintSetting> pLayoutPrintSettingList) {
        _pLayoutPrintSettingList = pLayoutPrintSettingList;
    }

    /** P_PRINTER by PRINTER_GROUP_ID, named 'PPrinterList'. */
    protected List<PPrinter> _pPrinterList;

    /**
     * [get] P_PRINTER by PRINTER_GROUP_ID, named 'PPrinterList'.
     * @return The entity list of referrer property 'PPrinterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PPrinter> getPPrinterList() {
        if (_pPrinterList == null) { _pPrinterList = newReferrerList(); }
        return _pPrinterList;
    }

    /**
     * [set] P_PRINTER by PRINTER_GROUP_ID, named 'PPrinterList'.
     * @param pPrinterList The entity list of referrer property 'PPrinterList'. (NullAllowed)
     */
    public void setPPrinterList(List<PPrinter> pPrinterList) {
        _pPrinterList = pPrinterList;
    }

    /** P_USER_AUTO_PRINT_SETTING by PRINTER_GROUP_ID, named 'PUserAutoPrintSettingByPrinterGroupIdList'. */
    protected List<PUserAutoPrintSetting> _pUserAutoPrintSettingByPrinterGroupIdList;

    /**
     * [get] P_USER_AUTO_PRINT_SETTING by PRINTER_GROUP_ID, named 'PUserAutoPrintSettingByPrinterGroupIdList'.
     * @return The entity list of referrer property 'PUserAutoPrintSettingByPrinterGroupIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PUserAutoPrintSetting> getPUserAutoPrintSettingByPrinterGroupIdList() {
        if (_pUserAutoPrintSettingByPrinterGroupIdList == null) { _pUserAutoPrintSettingByPrinterGroupIdList = newReferrerList(); }
        return _pUserAutoPrintSettingByPrinterGroupIdList;
    }

    /**
     * [set] P_USER_AUTO_PRINT_SETTING by PRINTER_GROUP_ID, named 'PUserAutoPrintSettingByPrinterGroupIdList'.
     * @param pUserAutoPrintSettingByPrinterGroupIdList The entity list of referrer property 'PUserAutoPrintSettingByPrinterGroupIdList'. (NullAllowed)
     */
    public void setPUserAutoPrintSettingByPrinterGroupIdList(List<PUserAutoPrintSetting> pUserAutoPrintSettingByPrinterGroupIdList) {
        _pUserAutoPrintSettingByPrinterGroupIdList = pUserAutoPrintSettingByPrinterGroupIdList;
    }

    /** P_TERMINAL_AUTO_PRINT_SET by PRINTER_GROUP_ID, named 'PTerminalAutoPrintSetByPrinterGroupIdList'. */
    protected List<PTerminalAutoPrintSet> _pTerminalAutoPrintSetByPrinterGroupIdList;

    /**
     * [get] P_TERMINAL_AUTO_PRINT_SET by PRINTER_GROUP_ID, named 'PTerminalAutoPrintSetByPrinterGroupIdList'.
     * @return The entity list of referrer property 'PTerminalAutoPrintSetByPrinterGroupIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PTerminalAutoPrintSet> getPTerminalAutoPrintSetByPrinterGroupIdList() {
        if (_pTerminalAutoPrintSetByPrinterGroupIdList == null) { _pTerminalAutoPrintSetByPrinterGroupIdList = newReferrerList(); }
        return _pTerminalAutoPrintSetByPrinterGroupIdList;
    }

    /**
     * [set] P_TERMINAL_AUTO_PRINT_SET by PRINTER_GROUP_ID, named 'PTerminalAutoPrintSetByPrinterGroupIdList'.
     * @param pTerminalAutoPrintSetByPrinterGroupIdList The entity list of referrer property 'PTerminalAutoPrintSetByPrinterGroupIdList'. (NullAllowed)
     */
    public void setPTerminalAutoPrintSetByPrinterGroupIdList(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetByPrinterGroupIdList) {
        _pTerminalAutoPrintSetByPrinterGroupIdList = pTerminalAutoPrintSetByPrinterGroupIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPPrinterGroup) {
            BsPPrinterGroup other = (BsPPrinterGroup)obj;
            if (!xSV(_printerGroupId, other._printerGroupId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _printerGroupId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pLayoutPrintSettingList != null) { for (PLayoutPrintSetting et : _pLayoutPrintSettingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pLayoutPrintSettingList")); } } }
        if (_pPrinterList != null) { for (PPrinter et : _pPrinterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pPrinterList")); } } }
        if (_pUserAutoPrintSettingByPrinterGroupIdList != null) { for (PUserAutoPrintSetting et : _pUserAutoPrintSettingByPrinterGroupIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pUserAutoPrintSettingByPrinterGroupIdList")); } } }
        if (_pTerminalAutoPrintSetByPrinterGroupIdList != null) { for (PTerminalAutoPrintSet et : _pTerminalAutoPrintSetByPrinterGroupIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pTerminalAutoPrintSetByPrinterGroupIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_printerGroupId));
        sb.append(dm).append(xfND(_printerGroupNm));
        sb.append(dm).append(xfND(_attribute1));
        sb.append(dm).append(xfND(_attribute2));
        sb.append(dm).append(xfND(_attribute3));
        sb.append(dm).append(xfND(_attribute4));
        sb.append(dm).append(xfND(_attribute5));
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
        if (_pLayoutPrintSettingList != null && !_pLayoutPrintSettingList.isEmpty())
        { sb.append(dm).append("pLayoutPrintSettingList"); }
        if (_pPrinterList != null && !_pPrinterList.isEmpty())
        { sb.append(dm).append("pPrinterList"); }
        if (_pUserAutoPrintSettingByPrinterGroupIdList != null && !_pUserAutoPrintSettingByPrinterGroupIdList.isEmpty())
        { sb.append(dm).append("pUserAutoPrintSettingByPrinterGroupIdList"); }
        if (_pTerminalAutoPrintSetByPrinterGroupIdList != null && !_pTerminalAutoPrintSetByPrinterGroupIdList.isEmpty())
        { sb.append(dm).append("pTerminalAutoPrintSetByPrinterGroupIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PPrinterGroup clone() {
        return (PPrinterGroup)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrinterGroupId() {
        checkSpecifiedProperty("printerGroupId");
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        registerModifiedProperty("printerGroupId");
        _printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)} <br>
     * プリンタグループ名称
     * @return The value of the column 'PRINTER_GROUP_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getPrinterGroupNm() {
        checkSpecifiedProperty("printerGroupNm");
        return convertEmptyToNull(_printerGroupNm);
    }

    /**
     * [set] PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)} <br>
     * プリンタグループ名称
     * @param printerGroupNm The value of the column 'PRINTER_GROUP_NM'. (basically NotNull if update: for the constraint)
     */
    public void setPrinterGroupNm(String printerGroupNm) {
        registerModifiedProperty("printerGroupNm");
        _printerGroupNm = printerGroupNm;
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
