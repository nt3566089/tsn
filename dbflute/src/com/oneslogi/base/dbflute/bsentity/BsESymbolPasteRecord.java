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
 * The entity of E_SYMBOL_PASTE_RECORD as TABLE. <br>
 * シンボル貼付実績受信テーブル
 * <pre>
 * [primary-key]
 *     E_SYMBOL_PASTE_RECORD_ID
 *
 * [column]
 *     E_SYMBOL_PASTE_RECORD_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, RCV_KEY, PRODUCT_CD, FIRMTRANSPORT_NO, MANUFACTUR_DATE, PRINTER_NO, MAKE_NO, DESIGN_CD, STOCK_TYPE, MAKER_CASE_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     E_SYMBOL_PASTE_RECORD_ID
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
 * Long eSymbolPasteRecordId = entity.getESymbolPasteRecordId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String rcvKey = entity.getRcvKey();
 * String productCd = entity.getProductCd();
 * String firmtransportNo = entity.getFirmtransportNo();
 * String manufacturDate = entity.getManufacturDate();
 * String printerNo = entity.getPrinterNo();
 * String makeNo = entity.getMakeNo();
 * String designCd = entity.getDesignCd();
 * String stockType = entity.getStockType();
 * String makerCaseNo = entity.getMakerCaseNo();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setESymbolPasteRecordId(eSymbolPasteRecordId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setRcvKey(rcvKey);
 * entity.setProductCd(productCd);
 * entity.setFirmtransportNo(firmtransportNo);
 * entity.setManufacturDate(manufacturDate);
 * entity.setPrinterNo(printerNo);
 * entity.setMakeNo(makeNo);
 * entity.setDesignCd(designCd);
 * entity.setStockType(stockType);
 * entity.setMakerCaseNo(makerCaseNo);
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
public abstract class BsESymbolPasteRecord extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _eSymbolPasteRecordId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** RCV_KEY: {varchar(255)} */
    protected String _rcvKey;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** FIRMTRANSPORT_NO: {varchar(255)} */
    protected String _firmtransportNo;

    /** MANUFACTUR_DATE: {varchar(255)} */
    protected String _manufacturDate;

    /** PRINTER_NO: {varchar(255)} */
    protected String _printerNo;

    /** MAKE_NO: {varchar(255)} */
    protected String _makeNo;

    /** DESIGN_CD: {varchar(255)} */
    protected String _designCd;

    /** STOCK_TYPE: {varchar(255)} */
    protected String _stockType;

    /** MAKER_CASE_NO: {varchar(255)} */
    protected String _makerCaseNo;

    /** DEL_FLG: {char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {bigint(19), default=[(0)]} */
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
        return "E_SYMBOL_PASTE_RECORD";
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
        if (_eSymbolPasteRecordId == null) { return false; }
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
     * DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
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
        if (obj instanceof BsESymbolPasteRecord) {
            BsESymbolPasteRecord other = (BsESymbolPasteRecord)obj;
            if (!xSV(_eSymbolPasteRecordId, other._eSymbolPasteRecordId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _eSymbolPasteRecordId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_eSymbolPasteRecordId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_rcvKey));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_firmtransportNo));
        sb.append(dm).append(xfND(_manufacturDate));
        sb.append(dm).append(xfND(_printerNo));
        sb.append(dm).append(xfND(_makeNo));
        sb.append(dm).append(xfND(_designCd));
        sb.append(dm).append(xfND(_stockType));
        sb.append(dm).append(xfND(_makerCaseNo));
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
    public ESymbolPasteRecord clone() {
        return (ESymbolPasteRecord)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * シンボル貼付実績受信ID
     * @return The value of the column 'E_SYMBOL_PASTE_RECORD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getESymbolPasteRecordId() {
        checkSpecifiedProperty("ESymbolPasteRecordId");
        return _eSymbolPasteRecordId;
    }

    /**
     * [set] E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * シンボル貼付実績受信ID
     * @param eSymbolPasteRecordId The value of the column 'E_SYMBOL_PASTE_RECORD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setESymbolPasteRecordId(Long eSymbolPasteRecordId) {
        registerModifiedProperty("ESymbolPasteRecordId");
        _eSymbolPasteRecordId = eSymbolPasteRecordId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'RCV_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvKey() {
        checkSpecifiedProperty("rcvKey");
        return convertEmptyToNull(_rcvKey);
    }

    /**
     * [set] RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @param rcvKey The value of the column 'RCV_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvKey(String rcvKey) {
        registerModifiedProperty("rcvKey");
        _rcvKey = rcvKey;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] FIRMTRANSPORT_NO: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMTRANSPORT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmtransportNo() {
        checkSpecifiedProperty("firmtransportNo");
        return convertEmptyToNull(_firmtransportNo);
    }

    /**
     * [set] FIRMTRANSPORT_NO: {varchar(255)} <br>
     * 商社搬入番号
     * @param firmtransportNo The value of the column 'FIRMTRANSPORT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmtransportNo(String firmtransportNo) {
        registerModifiedProperty("firmtransportNo");
        _firmtransportNo = firmtransportNo;
    }

    /**
     * [get] MANUFACTUR_DATE: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUR_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturDate() {
        checkSpecifiedProperty("manufacturDate");
        return convertEmptyToNull(_manufacturDate);
    }

    /**
     * [set] MANUFACTUR_DATE: {varchar(255)} <br>
     * 製造年月日
     * @param manufacturDate The value of the column 'MANUFACTUR_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturDate(String manufacturDate) {
        registerModifiedProperty("manufacturDate");
        _manufacturDate = manufacturDate;
    }

    /**
     * [get] PRINTER_NO: {varchar(255)} <br>
     * 印刷機番号
     * @return The value of the column 'PRINTER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrinterNo() {
        checkSpecifiedProperty("printerNo");
        return convertEmptyToNull(_printerNo);
    }

    /**
     * [set] PRINTER_NO: {varchar(255)} <br>
     * 印刷機番号
     * @param printerNo The value of the column 'PRINTER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrinterNo(String printerNo) {
        registerModifiedProperty("printerNo");
        _printerNo = printerNo;
    }

    /**
     * [get] MAKE_NO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'MAKE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakeNo() {
        checkSpecifiedProperty("makeNo");
        return convertEmptyToNull(_makeNo);
    }

    /**
     * [set] MAKE_NO: {varchar(255)} <br>
     * 生出番号
     * @param makeNo The value of the column 'MAKE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakeNo(String makeNo) {
        registerModifiedProperty("makeNo");
        _makeNo = makeNo;
    }

    /**
     * [get] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignCd() {
        checkSpecifiedProperty("designCd");
        return convertEmptyToNull(_designCd);
    }

    /**
     * [set] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignCd(String designCd) {
        registerModifiedProperty("designCd");
        _designCd = designCd;
    }

    /**
     * [get] STOCK_TYPE: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'STOCK_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockType() {
        checkSpecifiedProperty("stockType");
        return convertEmptyToNull(_stockType);
    }

    /**
     * [set] STOCK_TYPE: {varchar(255)} <br>
     * 在庫区分
     * @param stockType The value of the column 'STOCK_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockType(String stockType) {
        registerModifiedProperty("stockType");
        _stockType = stockType;
    }

    /**
     * [get] MAKER_CASE_NO: {varchar(255)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKER_CASE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakerCaseNo() {
        checkSpecifiedProperty("makerCaseNo");
        return convertEmptyToNull(_makerCaseNo);
    }

    /**
     * [set] MAKER_CASE_NO: {varchar(255)} <br>
     * メーカーケースCD
     * @param makerCaseNo The value of the column 'MAKER_CASE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakerCaseNo(String makerCaseNo) {
        registerModifiedProperty("makerCaseNo");
        _makerCaseNo = makerCaseNo;
    }

    /**
     * [get] DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
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
