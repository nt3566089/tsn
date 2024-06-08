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
 * The entity of E_SORTING_NONCONF_STOCK as TABLE. <br>
 * 仕分不適品在庫実績受信テーブル
 * <pre>
 * [primary-key]
 *     SORTING_NONCONF_STOCK_ID
 *
 * [column]
 *     SORTING_NONCONF_STOCK_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, STOCK_DATE, WAREHOUSE_CD, PRODUCT_CD, COMPANY_CD, STOCK_QTY_SIGN, STOCK_QTY, PENDING_ITEM_QTY_SIGN, PENDING_ITEM_QTY, INSPECTION_ITEM_QTY_SIGN, INSPECTION_ITEM_QTY, PRODUCT_NM, OUTPUT_ORDER, INOUT_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORTING_NONCONF_STOCK_ID
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
 * Long sortingNonconfStockId = entity.getSortingNonconfStockId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String stockDate = entity.getStockDate();
 * String warehouseCd = entity.getWarehouseCd();
 * String productCd = entity.getProductCd();
 * String companyCd = entity.getCompanyCd();
 * String stockQtySign = entity.getStockQtySign();
 * String stockQty = entity.getStockQty();
 * String pendingItemQtySign = entity.getPendingItemQtySign();
 * String pendingItemQty = entity.getPendingItemQty();
 * String inspectionItemQtySign = entity.getInspectionItemQtySign();
 * String inspectionItemQty = entity.getInspectionItemQty();
 * String productNm = entity.getProductNm();
 * String outputOrder = entity.getOutputOrder();
 * String inoutType = entity.getInoutType();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSortingNonconfStockId(sortingNonconfStockId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setStockDate(stockDate);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setProductCd(productCd);
 * entity.setCompanyCd(companyCd);
 * entity.setStockQtySign(stockQtySign);
 * entity.setStockQty(stockQty);
 * entity.setPendingItemQtySign(pendingItemQtySign);
 * entity.setPendingItemQty(pendingItemQty);
 * entity.setInspectionItemQtySign(inspectionItemQtySign);
 * entity.setInspectionItemQty(inspectionItemQty);
 * entity.setProductNm(productNm);
 * entity.setOutputOrder(outputOrder);
 * entity.setInoutType(inoutType);
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
public abstract class BsESortingNonconfStock extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SORTING_NONCONF_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sortingNonconfStockId;

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

    /** STOCK_DATE: {varchar(255)} */
    protected String _stockDate;

    /** WAREHOUSE_CD: {varchar(255)} */
    protected String _warehouseCd;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** COMPANY_CD: {varchar(255)} */
    protected String _companyCd;

    /** STOCK_QTY_SIGN: {varchar(255)} */
    protected String _stockQtySign;

    /** STOCK_QTY: {varchar(255)} */
    protected String _stockQty;

    /** PENDING_ITEM_QTY_SIGN: {varchar(255)} */
    protected String _pendingItemQtySign;

    /** PENDING_ITEM_QTY: {varchar(255)} */
    protected String _pendingItemQty;

    /** INSPECTION_ITEM_QTY_SIGN: {varchar(255)} */
    protected String _inspectionItemQtySign;

    /** INSPECTION_ITEM_QTY: {varchar(255)} */
    protected String _inspectionItemQty;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** OUTPUT_ORDER: {varchar(255)} */
    protected String _outputOrder;

    /** INOUT_TYPE: {varchar(255)} */
    protected String _inoutType;

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
        return "E_SORTING_NONCONF_STOCK";
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
        if (_sortingNonconfStockId == null) { return false; }
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
        if (obj instanceof BsESortingNonconfStock) {
            BsESortingNonconfStock other = (BsESortingNonconfStock)obj;
            if (!xSV(_sortingNonconfStockId, other._sortingNonconfStockId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sortingNonconfStockId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sortingNonconfStockId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_stockDate));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_companyCd));
        sb.append(dm).append(xfND(_stockQtySign));
        sb.append(dm).append(xfND(_stockQty));
        sb.append(dm).append(xfND(_pendingItemQtySign));
        sb.append(dm).append(xfND(_pendingItemQty));
        sb.append(dm).append(xfND(_inspectionItemQtySign));
        sb.append(dm).append(xfND(_inspectionItemQty));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_outputOrder));
        sb.append(dm).append(xfND(_inoutType));
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
    public ESortingNonconfStock clone() {
        return (ESortingNonconfStock)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SORTING_NONCONF_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分不適品在庫実績受信ID
     * @return The value of the column 'SORTING_NONCONF_STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortingNonconfStockId() {
        checkSpecifiedProperty("sortingNonconfStockId");
        return _sortingNonconfStockId;
    }

    /**
     * [set] SORTING_NONCONF_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分不適品在庫実績受信ID
     * @param sortingNonconfStockId The value of the column 'SORTING_NONCONF_STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSortingNonconfStockId(Long sortingNonconfStockId) {
        registerModifiedProperty("sortingNonconfStockId");
        _sortingNonconfStockId = sortingNonconfStockId;
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
     * [get] STOCK_DATE: {varchar(255)} <br>
     * 在庫年月日
     * @return The value of the column 'STOCK_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockDate() {
        checkSpecifiedProperty("stockDate");
        return convertEmptyToNull(_stockDate);
    }

    /**
     * [set] STOCK_DATE: {varchar(255)} <br>
     * 在庫年月日
     * @param stockDate The value of the column 'STOCK_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockDate(String stockDate) {
        registerModifiedProperty("stockDate");
        _stockDate = stockDate;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 保管場所CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 保管場所CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
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
     * [get] COMPANY_CD: {varchar(255)} <br>
     * 会社CD
     * @return The value of the column 'COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyCd() {
        checkSpecifiedProperty("companyCd");
        return convertEmptyToNull(_companyCd);
    }

    /**
     * [set] COMPANY_CD: {varchar(255)} <br>
     * 会社CD
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyCd(String companyCd) {
        registerModifiedProperty("companyCd");
        _companyCd = companyCd;
    }

    /**
     * [get] STOCK_QTY_SIGN: {varchar(255)} <br>
     * 利用可能在庫数量(符号)
     * @return The value of the column 'STOCK_QTY_SIGN'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockQtySign() {
        checkSpecifiedProperty("stockQtySign");
        return convertEmptyToNull(_stockQtySign);
    }

    /**
     * [set] STOCK_QTY_SIGN: {varchar(255)} <br>
     * 利用可能在庫数量(符号)
     * @param stockQtySign The value of the column 'STOCK_QTY_SIGN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockQtySign(String stockQtySign) {
        registerModifiedProperty("stockQtySign");
        _stockQtySign = stockQtySign;
    }

    /**
     * [get] STOCK_QTY: {varchar(255)} <br>
     * 利用可能在庫数量
     * @return The value of the column 'STOCK_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockQty() {
        checkSpecifiedProperty("stockQty");
        return convertEmptyToNull(_stockQty);
    }

    /**
     * [set] STOCK_QTY: {varchar(255)} <br>
     * 利用可能在庫数量
     * @param stockQty The value of the column 'STOCK_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockQty(String stockQty) {
        registerModifiedProperty("stockQty");
        _stockQty = stockQty;
    }

    /**
     * [get] PENDING_ITEM_QTY_SIGN: {varchar(255)} <br>
     * 保留在庫数量(符号)
     * @return The value of the column 'PENDING_ITEM_QTY_SIGN'. (NullAllowed even if selected: for no constraint)
     */
    public String getPendingItemQtySign() {
        checkSpecifiedProperty("pendingItemQtySign");
        return convertEmptyToNull(_pendingItemQtySign);
    }

    /**
     * [set] PENDING_ITEM_QTY_SIGN: {varchar(255)} <br>
     * 保留在庫数量(符号)
     * @param pendingItemQtySign The value of the column 'PENDING_ITEM_QTY_SIGN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPendingItemQtySign(String pendingItemQtySign) {
        registerModifiedProperty("pendingItemQtySign");
        _pendingItemQtySign = pendingItemQtySign;
    }

    /**
     * [get] PENDING_ITEM_QTY: {varchar(255)} <br>
     * 保留在庫数量
     * @return The value of the column 'PENDING_ITEM_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPendingItemQty() {
        checkSpecifiedProperty("pendingItemQty");
        return convertEmptyToNull(_pendingItemQty);
    }

    /**
     * [set] PENDING_ITEM_QTY: {varchar(255)} <br>
     * 保留在庫数量
     * @param pendingItemQty The value of the column 'PENDING_ITEM_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPendingItemQty(String pendingItemQty) {
        registerModifiedProperty("pendingItemQty");
        _pendingItemQty = pendingItemQty;
    }

    /**
     * [get] INSPECTION_ITEM_QTY_SIGN: {varchar(255)} <br>
     * 品質検査中在庫数量(符号)
     * @return The value of the column 'INSPECTION_ITEM_QTY_SIGN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectionItemQtySign() {
        checkSpecifiedProperty("inspectionItemQtySign");
        return convertEmptyToNull(_inspectionItemQtySign);
    }

    /**
     * [set] INSPECTION_ITEM_QTY_SIGN: {varchar(255)} <br>
     * 品質検査中在庫数量(符号)
     * @param inspectionItemQtySign The value of the column 'INSPECTION_ITEM_QTY_SIGN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionItemQtySign(String inspectionItemQtySign) {
        registerModifiedProperty("inspectionItemQtySign");
        _inspectionItemQtySign = inspectionItemQtySign;
    }

    /**
     * [get] INSPECTION_ITEM_QTY: {varchar(255)} <br>
     * 品質検査中在庫数量
     * @return The value of the column 'INSPECTION_ITEM_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectionItemQty() {
        checkSpecifiedProperty("inspectionItemQty");
        return convertEmptyToNull(_inspectionItemQty);
    }

    /**
     * [set] INSPECTION_ITEM_QTY: {varchar(255)} <br>
     * 品質検査中在庫数量
     * @param inspectionItemQty The value of the column 'INSPECTION_ITEM_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionItemQty(String inspectionItemQty) {
        registerModifiedProperty("inspectionItemQty");
        _inspectionItemQty = inspectionItemQty;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 銘柄名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 銘柄名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] OUTPUT_ORDER: {varchar(255)} <br>
     * 銘柄出力順
     * @return The value of the column 'OUTPUT_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getOutputOrder() {
        checkSpecifiedProperty("outputOrder");
        return convertEmptyToNull(_outputOrder);
    }

    /**
     * [set] OUTPUT_ORDER: {varchar(255)} <br>
     * 銘柄出力順
     * @param outputOrder The value of the column 'OUTPUT_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutputOrder(String outputOrder) {
        registerModifiedProperty("outputOrder");
        _outputOrder = outputOrder;
    }

    /**
     * [get] INOUT_TYPE: {varchar(255)} <br>
     * 内外区分
     * @return The value of the column 'INOUT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutType() {
        checkSpecifiedProperty("inoutType");
        return convertEmptyToNull(_inoutType);
    }

    /**
     * [set] INOUT_TYPE: {varchar(255)} <br>
     * 内外区分
     * @param inoutType The value of the column 'INOUT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutType(String inoutType) {
        registerModifiedProperty("inoutType");
        _inoutType = inoutType;
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
