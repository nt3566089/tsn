package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_BONDED_SHIPPING_PLAN_BULK_INPUT as TABLE. <br>
 * 出庫指示受信テーブル（需給）
 * <pre>
 * [primary-key]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [column]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SBWAREHOUSECD, CUSTORDERNO, ORDERTYPE, SHIPCD, CarryoutPlanCd, ShipToCd, ShipToNm, ReceivePlanYm, ShTypeCd, ShTypeNm, Refno, PickingComment, PhoneNo, BATJMfYm, RmaNo, OwnerOrderNo, PalletNo, PRODUCT_CD, DesignCd, ManufactureYm, FirmcarryNo, Qty, InOutKbn, StockType, CustomsReleaseDate, SupplierCvNo, IfItemCd, SendFlg, PalletOrder, PalletType, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
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
public abstract class BsEBondedShippingPlanBulkInputDto implements Serializable {

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
    /** BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _bondedShippingPlanBulkInputId;

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

    /** SBWAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _sbwarehousecd;

    /** CUSTORDERNO: {varchar(255)} */
    @JsonKey
    protected String _custorderno;

    /** ORDERTYPE: {varchar(255)} */
    @JsonKey
    protected String _ordertype;

    /** SHIPCD: {varchar(255)} */
    @JsonKey
    protected String _shipcd;

    /** CarryoutPlanCd: {varchar(255)} */
    @JsonKey
    protected String _carryoutplancd;

    /** ShipToCd: {varchar(255)} */
    @JsonKey
    protected String _shiptocd;

    /** ShipToNm: {varchar(255)} */
    @JsonKey
    protected String _shiptonm;

    /** ReceivePlanYm: {varchar(255)} */
    @JsonKey
    protected String _receiveplanym;

    /** ShTypeCd: {varchar(255)} */
    @JsonKey
    protected String _shtypecd;

    /** ShTypeNm: {varchar(255)} */
    @JsonKey
    protected String _shtypenm;

    /** Refno: {varchar(255)} */
    @JsonKey
    protected String _refno;

    /** PickingComment: {varchar(255)} */
    @JsonKey
    protected String _pickingcomment;

    /** PhoneNo: {varchar(255)} */
    @JsonKey
    protected String _phoneno;

    /** BATJMfYm: {varchar(255)} */
    @JsonKey
    protected String _batjmfym;

    /** RmaNo: {varchar(255)} */
    @JsonKey
    protected String _rmano;

    /** OwnerOrderNo: {varchar(255)} */
    @JsonKey
    protected String _ownerorderno;

    /** PalletNo: {varchar(255)} */
    @JsonKey
    protected String _palletno;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** DesignCd: {varchar(255)} */
    @JsonKey
    protected String _designcd;

    /** ManufactureYm: {varchar(255)} */
    @JsonKey
    protected String _manufactureym;

    /** FirmcarryNo: {varchar(255)} */
    @JsonKey
    protected String _firmcarryno;

    /** Qty: {varchar(255)} */
    @JsonKey
    protected String _qty;

    /** InOutKbn: {varchar(255)} */
    @JsonKey
    protected String _inoutkbn;

    /** StockType: {varchar(255)} */
    @JsonKey
    protected String _stocktype;

    /** CustomsReleaseDate: {varchar(255)} */
    @JsonKey
    protected String _customsreleasedate;

    /** SupplierCvNo: {varchar(255)} */
    @JsonKey
    protected String _suppliercvno;

    /** IfItemCd: {varchar(255)} */
    @JsonKey
    protected String _ifitemcd;

    /** SendFlg: {varchar(255)} */
    @JsonKey
    protected String _sendflg;

    /** PalletOrder: {varchar(255)} */
    @JsonKey
    protected String _palletorder;

    /** PalletType: {varchar(255)} */
    @JsonKey
    protected String _pallettype;

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
    public BsEBondedShippingPlanBulkInputDto() {
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
        if (other == null || !(other instanceof BsEBondedShippingPlanBulkInputDto)) { return false; }
        final BsEBondedShippingPlanBulkInputDto otherEntity = (BsEBondedShippingPlanBulkInputDto)other;
        if (!helpComparingValue(getBondedShippingPlanBulkInputId(), otherEntity.getBondedShippingPlanBulkInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_BONDED_SHIPPING_PLAN_BULK_INPUT");
        result = xCH(result, getBondedShippingPlanBulkInputId());
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
        sb.append(c).append(getBondedShippingPlanBulkInputId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getSbwarehousecd());
        sb.append(c).append(getCustorderno());
        sb.append(c).append(getOrdertype());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getCarryoutplancd());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getShiptonm());
        sb.append(c).append(getReceiveplanym());
        sb.append(c).append(getShtypecd());
        sb.append(c).append(getShtypenm());
        sb.append(c).append(getRefno());
        sb.append(c).append(getPickingcomment());
        sb.append(c).append(getPhoneno());
        sb.append(c).append(getBatjmfym());
        sb.append(c).append(getRmano());
        sb.append(c).append(getOwnerorderno());
        sb.append(c).append(getPalletno());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getManufactureym());
        sb.append(c).append(getFirmcarryno());
        sb.append(c).append(getQty());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getStocktype());
        sb.append(c).append(getCustomsreleasedate());
        sb.append(c).append(getSuppliercvno());
        sb.append(c).append(getIfitemcd());
        sb.append(c).append(getSendflg());
        sb.append(c).append(getPalletorder());
        sb.append(c).append(getPallettype());
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
     * [get] BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指示受信（需給）ID
     * @return The value of the column 'BONDED_SHIPPING_PLAN_BULK_INPUT_ID'. (NullAllowed)
     */
    public Long getBondedShippingPlanBulkInputId() {
        return _bondedShippingPlanBulkInputId;
    }

    /**
     * [set] BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指示受信（需給）ID
     * @param bondedShippingPlanBulkInputId The value of the column 'BONDED_SHIPPING_PLAN_BULK_INPUT_ID'. (NullAllowed)
     */
    public void setBondedShippingPlanBulkInputId(Long bondedShippingPlanBulkInputId) {
        __modifiedProperties.add("bondedShippingPlanBulkInputId");
        this._bondedShippingPlanBulkInputId = bondedShippingPlanBulkInputId;
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
     * [get] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public String getSbwarehousecd() {
        return _sbwarehousecd;
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        __modifiedProperties.add("sbwarehousecd");
        this._sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] CUSTORDERNO: {varchar(255)} <br>
     * 依頼番号
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public String getCustorderno() {
        return _custorderno;
    }

    /**
     * [set] CUSTORDERNO: {varchar(255)} <br>
     * 依頼番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public void setCustorderno(String custorderno) {
        __modifiedProperties.add("custorderno");
        this._custorderno = custorderno;
    }

    /**
     * [get] ORDERTYPE: {varchar(255)} <br>
     * 依頼種別
     * @return The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public String getOrdertype() {
        return _ordertype;
    }

    /**
     * [set] ORDERTYPE: {varchar(255)} <br>
     * 依頼種別
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public void setOrdertype(String ordertype) {
        __modifiedProperties.add("ordertype");
        this._ordertype = ordertype;
    }

    /**
     * [get] SHIPCD: {varchar(255)} <br>
     * 発地CD
     * @return The value of the column 'SHIPCD'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] SHIPCD: {varchar(255)} <br>
     * 発地CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed)
     */
    public void setShipcd(String shipcd) {
        __modifiedProperties.add("shipcd");
        this._shipcd = shipcd;
    }

    /**
     * [get] CarryoutPlanCd: {varchar(255)} <br>
     * 払出予定日
     * @return The value of the column 'CarryoutPlanCd'. (NullAllowed)
     */
    public String getCarryoutplancd() {
        return _carryoutplancd;
    }

    /**
     * [set] CarryoutPlanCd: {varchar(255)} <br>
     * 払出予定日
     * @param carryoutplancd The value of the column 'CarryoutPlanCd'. (NullAllowed)
     */
    public void setCarryoutplancd(String carryoutplancd) {
        __modifiedProperties.add("carryoutplancd");
        this._carryoutplancd = carryoutplancd;
    }

    /**
     * [get] ShipToCd: {varchar(255)} <br>
     * 着地CD
     * @return The value of the column 'ShipToCd'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] ShipToCd: {varchar(255)} <br>
     * 着地CD
     * @param shiptocd The value of the column 'ShipToCd'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] ShipToNm: {varchar(255)} <br>
     * 着地名称
     * @return The value of the column 'ShipToNm'. (NullAllowed)
     */
    public String getShiptonm() {
        return _shiptonm;
    }

    /**
     * [set] ShipToNm: {varchar(255)} <br>
     * 着地名称
     * @param shiptonm The value of the column 'ShipToNm'. (NullAllowed)
     */
    public void setShiptonm(String shiptonm) {
        __modifiedProperties.add("shiptonm");
        this._shiptonm = shiptonm;
    }

    /**
     * [get] ReceivePlanYm: {varchar(255)} <br>
     * 受入予定日
     * @return The value of the column 'ReceivePlanYm'. (NullAllowed)
     */
    public String getReceiveplanym() {
        return _receiveplanym;
    }

    /**
     * [set] ReceivePlanYm: {varchar(255)} <br>
     * 受入予定日
     * @param receiveplanym The value of the column 'ReceivePlanYm'. (NullAllowed)
     */
    public void setReceiveplanym(String receiveplanym) {
        __modifiedProperties.add("receiveplanym");
        this._receiveplanym = receiveplanym;
    }

    /**
     * [get] ShTypeCd: {varchar(255)} <br>
     * 輸送形態CD
     * @return The value of the column 'ShTypeCd'. (NullAllowed)
     */
    public String getShtypecd() {
        return _shtypecd;
    }

    /**
     * [set] ShTypeCd: {varchar(255)} <br>
     * 輸送形態CD
     * @param shtypecd The value of the column 'ShTypeCd'. (NullAllowed)
     */
    public void setShtypecd(String shtypecd) {
        __modifiedProperties.add("shtypecd");
        this._shtypecd = shtypecd;
    }

    /**
     * [get] ShTypeNm: {varchar(255)} <br>
     * 輸送形態名
     * @return The value of the column 'ShTypeNm'. (NullAllowed)
     */
    public String getShtypenm() {
        return _shtypenm;
    }

    /**
     * [set] ShTypeNm: {varchar(255)} <br>
     * 輸送形態名
     * @param shtypenm The value of the column 'ShTypeNm'. (NullAllowed)
     */
    public void setShtypenm(String shtypenm) {
        __modifiedProperties.add("shtypenm");
        this._shtypenm = shtypenm;
    }

    /**
     * [get] Refno: {varchar(255)} <br>
     * 整理番号
     * @return The value of the column 'Refno'. (NullAllowed)
     */
    public String getRefno() {
        return _refno;
    }

    /**
     * [set] Refno: {varchar(255)} <br>
     * 整理番号
     * @param refno The value of the column 'Refno'. (NullAllowed)
     */
    public void setRefno(String refno) {
        __modifiedProperties.add("refno");
        this._refno = refno;
    }

    /**
     * [get] PickingComment: {varchar(255)} <br>
     * 出庫時備考
     * @return The value of the column 'PickingComment'. (NullAllowed)
     */
    public String getPickingcomment() {
        return _pickingcomment;
    }

    /**
     * [set] PickingComment: {varchar(255)} <br>
     * 出庫時備考
     * @param pickingcomment The value of the column 'PickingComment'. (NullAllowed)
     */
    public void setPickingcomment(String pickingcomment) {
        __modifiedProperties.add("pickingcomment");
        this._pickingcomment = pickingcomment;
    }

    /**
     * [get] PhoneNo: {varchar(255)} <br>
     * 車記号
     * @return The value of the column 'PhoneNo'. (NullAllowed)
     */
    public String getPhoneno() {
        return _phoneno;
    }

    /**
     * [set] PhoneNo: {varchar(255)} <br>
     * 車記号
     * @param phoneno The value of the column 'PhoneNo'. (NullAllowed)
     */
    public void setPhoneno(String phoneno) {
        __modifiedProperties.add("phoneno");
        this._phoneno = phoneno;
    }

    /**
     * [get] BATJMfYm: {varchar(255)} <br>
     * BATJ製造月記号
     * @return The value of the column 'BATJMfYm'. (NullAllowed)
     */
    public String getBatjmfym() {
        return _batjmfym;
    }

    /**
     * [set] BATJMfYm: {varchar(255)} <br>
     * BATJ製造月記号
     * @param batjmfym The value of the column 'BATJMfYm'. (NullAllowed)
     */
    public void setBatjmfym(String batjmfym) {
        __modifiedProperties.add("batjmfym");
        this._batjmfym = batjmfym;
    }

    /**
     * [get] RmaNo: {varchar(255)} <br>
     * 問合番号
     * @return The value of the column 'RmaNo'. (NullAllowed)
     */
    public String getRmano() {
        return _rmano;
    }

    /**
     * [set] RmaNo: {varchar(255)} <br>
     * 問合番号
     * @param rmano The value of the column 'RmaNo'. (NullAllowed)
     */
    public void setRmano(String rmano) {
        __modifiedProperties.add("rmano");
        this._rmano = rmano;
    }

    /**
     * [get] OwnerOrderNo: {varchar(255)} <br>
     * 車割キー
     * @return The value of the column 'OwnerOrderNo'. (NullAllowed)
     */
    public String getOwnerorderno() {
        return _ownerorderno;
    }

    /**
     * [set] OwnerOrderNo: {varchar(255)} <br>
     * 車割キー
     * @param ownerorderno The value of the column 'OwnerOrderNo'. (NullAllowed)
     */
    public void setOwnerorderno(String ownerorderno) {
        __modifiedProperties.add("ownerorderno");
        this._ownerorderno = ownerorderno;
    }

    /**
     * [get] PalletNo: {varchar(255)} <br>
     * パレット番号
     * @return The value of the column 'PalletNo'. (NullAllowed)
     */
    public String getPalletno() {
        return _palletno;
    }

    /**
     * [set] PalletNo: {varchar(255)} <br>
     * パレット番号
     * @param palletno The value of the column 'PalletNo'. (NullAllowed)
     */
    public void setPalletno(String palletno) {
        __modifiedProperties.add("palletno");
        this._palletno = palletno;
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
     * [get] DesignCd: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DesignCd'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DesignCd: {varchar(255)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DesignCd'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] ManufactureYm: {varchar(255)} <br>
     * 製造年月
     * @return The value of the column 'ManufactureYm'. (NullAllowed)
     */
    public String getManufactureym() {
        return _manufactureym;
    }

    /**
     * [set] ManufactureYm: {varchar(255)} <br>
     * 製造年月
     * @param manufactureym The value of the column 'ManufactureYm'. (NullAllowed)
     */
    public void setManufactureym(String manufactureym) {
        __modifiedProperties.add("manufactureym");
        this._manufactureym = manufactureym;
    }

    /**
     * [get] FirmcarryNo: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'FirmcarryNo'. (NullAllowed)
     */
    public String getFirmcarryno() {
        return _firmcarryno;
    }

    /**
     * [set] FirmcarryNo: {varchar(255)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FirmcarryNo'. (NullAllowed)
     */
    public void setFirmcarryno(String firmcarryno) {
        __modifiedProperties.add("firmcarryno");
        this._firmcarryno = firmcarryno;
    }

    /**
     * [get] Qty: {varchar(255)} <br>
     * 個数（個装）
     * @return The value of the column 'Qty'. (NullAllowed)
     */
    public String getQty() {
        return _qty;
    }

    /**
     * [set] Qty: {varchar(255)} <br>
     * 個数（個装）
     * @param qty The value of the column 'Qty'. (NullAllowed)
     */
    public void setQty(String qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] InOutKbn: {varchar(255)} <br>
     * 出庫時外貨・内貨区分
     * @return The value of the column 'InOutKbn'. (NullAllowed)
     */
    public String getInoutkbn() {
        return _inoutkbn;
    }

    /**
     * [set] InOutKbn: {varchar(255)} <br>
     * 出庫時外貨・内貨区分
     * @param inoutkbn The value of the column 'InOutKbn'. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        __modifiedProperties.add("inoutkbn");
        this._inoutkbn = inoutkbn;
    }

    /**
     * [get] StockType: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'StockType'. (NullAllowed)
     */
    public String getStocktype() {
        return _stocktype;
    }

    /**
     * [set] StockType: {varchar(255)} <br>
     * 在庫区分
     * @param stocktype The value of the column 'StockType'. (NullAllowed)
     */
    public void setStocktype(String stocktype) {
        __modifiedProperties.add("stocktype");
        this._stocktype = stocktype;
    }

    /**
     * [get] CustomsReleaseDate: {varchar(255)} <br>
     * 通関日
     * @return The value of the column 'CustomsReleaseDate'. (NullAllowed)
     */
    public String getCustomsreleasedate() {
        return _customsreleasedate;
    }

    /**
     * [set] CustomsReleaseDate: {varchar(255)} <br>
     * 通関日
     * @param customsreleasedate The value of the column 'CustomsReleaseDate'. (NullAllowed)
     */
    public void setCustomsreleasedate(String customsreleasedate) {
        __modifiedProperties.add("customsreleasedate");
        this._customsreleasedate = customsreleasedate;
    }

    /**
     * [get] SupplierCvNo: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SupplierCvNo'. (NullAllowed)
     */
    public String getSuppliercvno() {
        return _suppliercvno;
    }

    /**
     * [set] SupplierCvNo: {varchar(255)} <br>
     * 保税管理番号
     * @param suppliercvno The value of the column 'SupplierCvNo'. (NullAllowed)
     */
    public void setSuppliercvno(String suppliercvno) {
        __modifiedProperties.add("suppliercvno");
        this._suppliercvno = suppliercvno;
    }

    /**
     * [get] IfItemCd: {varchar(255)} <br>
     * 需給CD
     * @return The value of the column 'IfItemCd'. (NullAllowed)
     */
    public String getIfitemcd() {
        return _ifitemcd;
    }

    /**
     * [set] IfItemCd: {varchar(255)} <br>
     * 需給CD
     * @param ifitemcd The value of the column 'IfItemCd'. (NullAllowed)
     */
    public void setIfitemcd(String ifitemcd) {
        __modifiedProperties.add("ifitemcd");
        this._ifitemcd = ifitemcd;
    }

    /**
     * [get] SendFlg: {varchar(255)} <br>
     * 送信済フラグ
     * @return The value of the column 'SendFlg'. (NullAllowed)
     */
    public String getSendflg() {
        return _sendflg;
    }

    /**
     * [set] SendFlg: {varchar(255)} <br>
     * 送信済フラグ
     * @param sendflg The value of the column 'SendFlg'. (NullAllowed)
     */
    public void setSendflg(String sendflg) {
        __modifiedProperties.add("sendflg");
        this._sendflg = sendflg;
    }

    /**
     * [get] PalletOrder: {varchar(255)} <br>
     * パレタイズ順
     * @return The value of the column 'PalletOrder'. (NullAllowed)
     */
    public String getPalletorder() {
        return _palletorder;
    }

    /**
     * [set] PalletOrder: {varchar(255)} <br>
     * パレタイズ順
     * @param palletorder The value of the column 'PalletOrder'. (NullAllowed)
     */
    public void setPalletorder(String palletorder) {
        __modifiedProperties.add("palletorder");
        this._palletorder = palletorder;
    }

    /**
     * [get] PalletType: {varchar(255)} <br>
     * パレット種別
     * @return The value of the column 'PalletType'. (NullAllowed)
     */
    public String getPallettype() {
        return _pallettype;
    }

    /**
     * [set] PalletType: {varchar(255)} <br>
     * パレット種別
     * @param pallettype The value of the column 'PalletType'. (NullAllowed)
     */
    public void setPallettype(String pallettype) {
        __modifiedProperties.add("pallettype");
        this._pallettype = pallettype;
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
