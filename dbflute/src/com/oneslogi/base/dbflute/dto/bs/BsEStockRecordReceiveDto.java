package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_STOCK_RECORD_RECEIVE as TABLE. <br>
 * 在庫実績(適品)(国免)受信テーブル
 * <pre>
 * [primary-key]
 *     STOCK_RECORD_RECEIVE_ID
 *
 * [column]
 *     STOCK_RECORD_RECEIVE_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, STOCK_DATE, WAREHOUSE_CD, PRODUCT_CD, COMPANY_CD, STOCK_QTY_SIGN, STOCK_QTY, DAMAGE_ITEM_QTY_SIGN, DAMAGE_ITEM_QTY, REFUND_ITEM_QTY_SIGN, REFUND_ITEM_QTY, STORAGE_LOCATION, SKU_CD, QUANTITY_UNIT, BAT_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_RECORD_RECEIVE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsEStockRecordReceiveDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _stockRecordReceiveId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** STOCK_DATE: {varchar(255)} */
    @JsonKey
    protected String _stockDate;

    /** WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _warehouseCd;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** COMPANY_CD: {varchar(255)} */
    @JsonKey
    protected String _companyCd;

    /** STOCK_QTY_SIGN: {varchar(255)} */
    @JsonKey
    protected String _stockQtySign;

    /** STOCK_QTY: {varchar(255)} */
    @JsonKey
    protected String _stockQty;

    /** DAMAGE_ITEM_QTY_SIGN: {varchar(255)} */
    @JsonKey
    protected String _damageItemQtySign;

    /** DAMAGE_ITEM_QTY: {varchar(255)} */
    @JsonKey
    protected String _damageItemQty;

    /** REFUND_ITEM_QTY_SIGN: {varchar(255)} */
    @JsonKey
    protected String _refundItemQtySign;

    /** REFUND_ITEM_QTY: {varchar(255)} */
    @JsonKey
    protected String _refundItemQty;

    /** STORAGE_LOCATION: {varchar(255)} */
    @JsonKey
    protected String _storageLocation;

    /** SKU_CD: {varchar(255)} */
    @JsonKey
    protected String _skuCd;

    /** QUANTITY_UNIT: {varchar(255)} */
    @JsonKey
    protected String _quantityUnit;

    /** BAT_NO: {varchar(255)} */
    @JsonKey
    protected String _batNo;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEStockRecordReceiveDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsEStockRecordReceiveDto)) { return false; }
        final BsEStockRecordReceiveDto otherEntity = (BsEStockRecordReceiveDto)other;
        if (!helpComparingValue(getStockRecordReceiveId(), otherEntity.getStockRecordReceiveId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_STOCK_RECORD_RECEIVE");
        result = xCH(result, getStockRecordReceiveId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getStockRecordReceiveId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getStockDate());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getCompanyCd());
        sb.append(c).append(getStockQtySign());
        sb.append(c).append(getStockQty());
        sb.append(c).append(getDamageItemQtySign());
        sb.append(c).append(getDamageItemQty());
        sb.append(c).append(getRefundItemQtySign());
        sb.append(c).append(getRefundItemQty());
        sb.append(c).append(getStorageLocation());
        sb.append(c).append(getSkuCd());
        sb.append(c).append(getQuantityUnit());
        sb.append(c).append(getBatNo());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫実績(適品)(国免)受信ID
     * @return The value of the column 'STOCK_RECORD_RECEIVE_ID'. (NullAllowed)
     */
    public Long getStockRecordReceiveId() {
        return _stockRecordReceiveId;
    }

    /**
     * [set] STOCK_RECORD_RECEIVE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫実績(適品)(国免)受信ID
     * @param stockRecordReceiveId The value of the column 'STOCK_RECORD_RECEIVE_ID'. (NullAllowed)
     */
    public void setStockRecordReceiveId(Long stockRecordReceiveId) {
        __modifiedProperties.add("stockRecordReceiveId");
        this._stockRecordReceiveId = stockRecordReceiveId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] STOCK_DATE: {varchar(255)} <br>
     * 在庫年月日
     * @return The value of the column 'STOCK_DATE'. (NullAllowed)
     */
    public String getStockDate() {
        return _stockDate;
    }

    /**
     * [set] STOCK_DATE: {varchar(255)} <br>
     * 在庫年月日
     * @param stockDate The value of the column 'STOCK_DATE'. (NullAllowed)
     */
    public void setStockDate(String stockDate) {
        __modifiedProperties.add("stockDate");
        this._stockDate = stockDate;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 保管場所CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 保管場所CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] COMPANY_CD: {varchar(255)} <br>
     * 会社CD
     * @return The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public String getCompanyCd() {
        return _companyCd;
    }

    /**
     * [set] COMPANY_CD: {varchar(255)} <br>
     * 会社CD
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public void setCompanyCd(String companyCd) {
        __modifiedProperties.add("companyCd");
        this._companyCd = companyCd;
    }

    /**
     * [get] STOCK_QTY_SIGN: {varchar(255)} <br>
     * 倉庫在庫数量(符号)
     * @return The value of the column 'STOCK_QTY_SIGN'. (NullAllowed)
     */
    public String getStockQtySign() {
        return _stockQtySign;
    }

    /**
     * [set] STOCK_QTY_SIGN: {varchar(255)} <br>
     * 倉庫在庫数量(符号)
     * @param stockQtySign The value of the column 'STOCK_QTY_SIGN'. (NullAllowed)
     */
    public void setStockQtySign(String stockQtySign) {
        __modifiedProperties.add("stockQtySign");
        this._stockQtySign = stockQtySign;
    }

    /**
     * [get] STOCK_QTY: {varchar(255)} <br>
     * 倉庫在庫数量
     * @return The value of the column 'STOCK_QTY'. (NullAllowed)
     */
    public String getStockQty() {
        return _stockQty;
    }

    /**
     * [set] STOCK_QTY: {varchar(255)} <br>
     * 倉庫在庫数量
     * @param stockQty The value of the column 'STOCK_QTY'. (NullAllowed)
     */
    public void setStockQty(String stockQty) {
        __modifiedProperties.add("stockQty");
        this._stockQty = stockQty;
    }

    /**
     * [get] DAMAGE_ITEM_QTY_SIGN: {varchar(255)} <br>
     * かし品在庫数量(符号)
     * @return The value of the column 'DAMAGE_ITEM_QTY_SIGN'. (NullAllowed)
     */
    public String getDamageItemQtySign() {
        return _damageItemQtySign;
    }

    /**
     * [set] DAMAGE_ITEM_QTY_SIGN: {varchar(255)} <br>
     * かし品在庫数量(符号)
     * @param damageItemQtySign The value of the column 'DAMAGE_ITEM_QTY_SIGN'. (NullAllowed)
     */
    public void setDamageItemQtySign(String damageItemQtySign) {
        __modifiedProperties.add("damageItemQtySign");
        this._damageItemQtySign = damageItemQtySign;
    }

    /**
     * [get] DAMAGE_ITEM_QTY: {varchar(255)} <br>
     * かし品在庫数量
     * @return The value of the column 'DAMAGE_ITEM_QTY'. (NullAllowed)
     */
    public String getDamageItemQty() {
        return _damageItemQty;
    }

    /**
     * [set] DAMAGE_ITEM_QTY: {varchar(255)} <br>
     * かし品在庫数量
     * @param damageItemQty The value of the column 'DAMAGE_ITEM_QTY'. (NullAllowed)
     */
    public void setDamageItemQty(String damageItemQty) {
        __modifiedProperties.add("damageItemQty");
        this._damageItemQty = damageItemQty;
    }

    /**
     * [get] REFUND_ITEM_QTY_SIGN: {varchar(255)} <br>
     * 保留中在庫数量(符号)
     * @return The value of the column 'REFUND_ITEM_QTY_SIGN'. (NullAllowed)
     */
    public String getRefundItemQtySign() {
        return _refundItemQtySign;
    }

    /**
     * [set] REFUND_ITEM_QTY_SIGN: {varchar(255)} <br>
     * 保留中在庫数量(符号)
     * @param refundItemQtySign The value of the column 'REFUND_ITEM_QTY_SIGN'. (NullAllowed)
     */
    public void setRefundItemQtySign(String refundItemQtySign) {
        __modifiedProperties.add("refundItemQtySign");
        this._refundItemQtySign = refundItemQtySign;
    }

    /**
     * [get] REFUND_ITEM_QTY: {varchar(255)} <br>
     * 保留中在庫数量
     * @return The value of the column 'REFUND_ITEM_QTY'. (NullAllowed)
     */
    public String getRefundItemQty() {
        return _refundItemQty;
    }

    /**
     * [set] REFUND_ITEM_QTY: {varchar(255)} <br>
     * 保留中在庫数量
     * @param refundItemQty The value of the column 'REFUND_ITEM_QTY'. (NullAllowed)
     */
    public void setRefundItemQty(String refundItemQty) {
        __modifiedProperties.add("refundItemQty");
        this._refundItemQty = refundItemQty;
    }

    /**
     * [get] STORAGE_LOCATION: {varchar(255)} <br>
     * 保管場所
     * @return The value of the column 'STORAGE_LOCATION'. (NullAllowed)
     */
    public String getStorageLocation() {
        return _storageLocation;
    }

    /**
     * [set] STORAGE_LOCATION: {varchar(255)} <br>
     * 保管場所
     * @param storageLocation The value of the column 'STORAGE_LOCATION'. (NullAllowed)
     */
    public void setStorageLocation(String storageLocation) {
        __modifiedProperties.add("storageLocation");
        this._storageLocation = storageLocation;
    }

    /**
     * [get] SKU_CD: {varchar(255)} <br>
     * 品目CD
     * @return The value of the column 'SKU_CD'. (NullAllowed)
     */
    public String getSkuCd() {
        return _skuCd;
    }

    /**
     * [set] SKU_CD: {varchar(255)} <br>
     * 品目CD
     * @param skuCd The value of the column 'SKU_CD'. (NullAllowed)
     */
    public void setSkuCd(String skuCd) {
        __modifiedProperties.add("skuCd");
        this._skuCd = skuCd;
    }

    /**
     * [get] QUANTITY_UNIT: {varchar(255)} <br>
     * 基本数量単位
     * @return The value of the column 'QUANTITY_UNIT'. (NullAllowed)
     */
    public String getQuantityUnit() {
        return _quantityUnit;
    }

    /**
     * [set] QUANTITY_UNIT: {varchar(255)} <br>
     * 基本数量単位
     * @param quantityUnit The value of the column 'QUANTITY_UNIT'. (NullAllowed)
     */
    public void setQuantityUnit(String quantityUnit) {
        __modifiedProperties.add("quantityUnit");
        this._quantityUnit = quantityUnit;
    }

    /**
     * [get] BAT_NO: {varchar(255)} <br>
     * バッチNo
     * @return The value of the column 'BAT_NO'. (NullAllowed)
     */
    public String getBatNo() {
        return _batNo;
    }

    /**
     * [set] BAT_NO: {varchar(255)} <br>
     * バッチNo
     * @param batNo The value of the column 'BAT_NO'. (NullAllowed)
     */
    public void setBatNo(String batNo) {
        __modifiedProperties.add("batNo");
        this._batNo = batNo;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}