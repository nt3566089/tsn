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
 * The entity of T_TRCASEADOPTINVDETAIL as TABLE. <br>
 * 引取場ケース内在庫調査明細情報
 * <pre>
 * [primary-key]
 *     T_TRCASEADOPTINVDETAIL_ID
 *
 * [column]
 *     T_TRCASEADOPTINVDETAIL_ID, CENTER_ID, CLIENT_ID, INVENTORY_KEY, INVENTORY_B_ID, PRODUCT_CD, QR_DATA, CASE_INV_QTY, MANUFACTURE_DATE, DESIGN_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_TRCASEADOPTINVDETAIL_ID
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
 * Long tTrcaseadoptinvdetailId = entity.getTTrcaseadoptinvdetailId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long inventoryKey = entity.getInventoryKey();
 * Long inventoryBId = entity.getInventoryBId();
 * String productCd = entity.getProductCd();
 * String qrData = entity.getQrData();
 * Long caseInvQty = entity.getCaseInvQty();
 * String manufactureDate = entity.getManufactureDate();
 * String designFlg = entity.getDesignFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTTrcaseadoptinvdetailId(tTrcaseadoptinvdetailId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setInventoryKey(inventoryKey);
 * entity.setInventoryBId(inventoryBId);
 * entity.setProductCd(productCd);
 * entity.setQrData(qrData);
 * entity.setCaseInvQty(caseInvQty);
 * entity.setManufactureDate(manufactureDate);
 * entity.setDesignFlg(designFlg);
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
public abstract class BsTTrcaseadoptinvdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _tTrcaseadoptinvdetailId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** INVENTORY_KEY: {NotNull, bigint(19)} */
    protected Long _inventoryKey;

    /** INVENTORY_B_ID: {NotNull, bigint(19)} */
    protected Long _inventoryBId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** QR_DATA: {NotNull, varchar(255)} */
    protected String _qrData;

    /** CASE_INV_QTY: {NotNull, bigint(19)} */
    protected Long _caseInvQty;

    /** MANUFACTURE_DATE: {varchar(8)} */
    protected String _manufactureDate;

    /** DESIGN_FLG: {varchar(30)} */
    protected String _designFlg;

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
        return "T_TRCASEADOPTINVDETAIL";
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
        if (_tTrcaseadoptinvdetailId == null) { return false; }
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
        if (obj instanceof BsTTrcaseadoptinvdetail) {
            BsTTrcaseadoptinvdetail other = (BsTTrcaseadoptinvdetail)obj;
            if (!xSV(_tTrcaseadoptinvdetailId, other._tTrcaseadoptinvdetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tTrcaseadoptinvdetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tTrcaseadoptinvdetailId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_inventoryKey));
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_qrData));
        sb.append(dm).append(xfND(_caseInvQty));
        sb.append(dm).append(xfND(_manufactureDate));
        sb.append(dm).append(xfND(_designFlg));
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
    public TTrcaseadoptinvdetail clone() {
        return (TTrcaseadoptinvdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 引取場ケース内在庫調査明細情報ID
     * @return The value of the column 'T_TRCASEADOPTINVDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTTrcaseadoptinvdetailId() {
        checkSpecifiedProperty("TTrcaseadoptinvdetailId");
        return _tTrcaseadoptinvdetailId;
    }

    /**
     * [set] T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 引取場ケース内在庫調査明細情報ID
     * @param tTrcaseadoptinvdetailId The value of the column 'T_TRCASEADOPTINVDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTTrcaseadoptinvdetailId(Long tTrcaseadoptinvdetailId) {
        registerModifiedProperty("TTrcaseadoptinvdetailId");
        _tTrcaseadoptinvdetailId = tTrcaseadoptinvdetailId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] INVENTORY_KEY: {NotNull, bigint(19)} <br>
     * 在庫調査指示キー
     * @return The value of the column 'INVENTORY_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryKey() {
        checkSpecifiedProperty("inventoryKey");
        return _inventoryKey;
    }

    /**
     * [set] INVENTORY_KEY: {NotNull, bigint(19)} <br>
     * 在庫調査指示キー
     * @param inventoryKey The value of the column 'INVENTORY_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryKey(Long inventoryKey) {
        registerModifiedProperty("inventoryKey");
        _inventoryKey = inventoryKey;
    }

    /**
     * [get] INVENTORY_B_ID: {NotNull, bigint(19)} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {NotNull, bigint(19)} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] QR_DATA: {NotNull, varchar(255)} <br>
     * 2次元データ
     * @return The value of the column 'QR_DATA'. (basically NotNull if selected: for the constraint)
     */
    public String getQrData() {
        checkSpecifiedProperty("qrData");
        return convertEmptyToNull(_qrData);
    }

    /**
     * [set] QR_DATA: {NotNull, varchar(255)} <br>
     * 2次元データ
     * @param qrData The value of the column 'QR_DATA'. (basically NotNull if update: for the constraint)
     */
    public void setQrData(String qrData) {
        registerModifiedProperty("qrData");
        _qrData = qrData;
    }

    /**
     * [get] CASE_INV_QTY: {NotNull, bigint(19)} <br>
     * 在庫調査数量(個装)
     * @return The value of the column 'CASE_INV_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getCaseInvQty() {
        checkSpecifiedProperty("caseInvQty");
        return _caseInvQty;
    }

    /**
     * [set] CASE_INV_QTY: {NotNull, bigint(19)} <br>
     * 在庫調査数量(個装)
     * @param caseInvQty The value of the column 'CASE_INV_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setCaseInvQty(Long caseInvQty) {
        registerModifiedProperty("caseInvQty");
        _caseInvQty = caseInvQty;
    }

    /**
     * [get] MANUFACTURE_DATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufactureDate() {
        checkSpecifiedProperty("manufactureDate");
        return convertEmptyToNull(_manufactureDate);
    }

    /**
     * [set] MANUFACTURE_DATE: {varchar(8)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufactureDate(String manufactureDate) {
        registerModifiedProperty("manufactureDate");
        _manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignFlg() {
        checkSpecifiedProperty("designFlg");
        return convertEmptyToNull(_designFlg);
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignFlg(String designFlg) {
        registerModifiedProperty("designFlg");
        _designFlg = designFlg;
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
