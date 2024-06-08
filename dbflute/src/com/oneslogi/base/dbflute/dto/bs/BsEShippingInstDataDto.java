package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_SHIPPING_INST_DATA as TABLE. <br>
 * 出荷指図情報受信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_DATA_ID
 *
 * [column]
 *     SHIPPING_INST_DATA_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INSTRUCTIONS_DATE, OWNER_DIRECT_NO, SALES_TYPE, SHIPTO_CODE, PRODUCT_CD, EXPECT_QTY, UNIT_PRICE, PLAN_PRICE_TOTAL, PLAN_NAME, PLANPOST, PLAN_ADRESS1, PLAN_ADRESS2, PLAN_PRODUCT_NAME, WAREHOUSE_PLANT, WAREHOUSE_PLANT_NAME, ORDER_DATE, DELIVERY_DATE, PURCHASE_NO, ORDER_NUMBER, ITEM_LINE_NO, SKU_CODE, CARDBOARD, CARTON, TOTAL_QTY, NOTE, RESERVE2, RESERVE3, RESERVE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_DATA_ID
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
public abstract class BsEShippingInstDataDto implements Serializable {

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
    /** SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shippingInstDataId;

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

    /** INSTRUCTIONS_DATE: {varchar(255)} */
    @JsonKey
    protected String _instructionsDate;

    /** OWNER_DIRECT_NO: {varchar(255)} */
    @JsonKey
    protected String _ownerDirectNo;

    /** SALES_TYPE: {varchar(255)} */
    @JsonKey
    protected String _salesType;

    /** SHIPTO_CODE: {varchar(255)} */
    @JsonKey
    protected String _shiptoCode;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** EXPECT_QTY: {varchar(255)} */
    @JsonKey
    protected String _expectQty;

    /** UNIT_PRICE: {varchar(255)} */
    @JsonKey
    protected String _unitPrice;

    /** PLAN_PRICE_TOTAL: {varchar(255)} */
    @JsonKey
    protected String _planPriceTotal;

    /** PLAN_NAME: {varchar(255)} */
    @JsonKey
    protected String _planName;

    /** PLANPOST: {varchar(255)} */
    @JsonKey
    protected String _planpost;

    /** PLAN_ADRESS1: {varchar(255)} */
    @JsonKey
    protected String _planAdress1;

    /** PLAN_ADRESS2: {varchar(255)} */
    @JsonKey
    protected String _planAdress2;

    /** PLAN_PRODUCT_NAME: {varchar(255)} */
    @JsonKey
    protected String _planProductName;

    /** WAREHOUSE_PLANT: {varchar(255)} */
    @JsonKey
    protected String _warehousePlant;

    /** WAREHOUSE_PLANT_NAME: {varchar(255)} */
    @JsonKey
    protected String _warehousePlantName;

    /** ORDER_DATE: {varchar(255)} */
    @JsonKey
    protected String _orderDate;

    /** DELIVERY_DATE: {varchar(255)} */
    @JsonKey
    protected String _deliveryDate;

    /** PURCHASE_NO: {varchar(255)} */
    @JsonKey
    protected String _purchaseNo;

    /** ORDER_NUMBER: {varchar(255)} */
    @JsonKey
    protected String _orderNumber;

    /** ITEM_LINE_NO: {varchar(255)} */
    @JsonKey
    protected String _itemLineNo;

    /** SKU_CODE: {varchar(255)} */
    @JsonKey
    protected String _skuCode;

    /** CARDBOARD: {varchar(255)} */
    @JsonKey
    protected String _cardboard;

    /** CARTON: {varchar(255)} */
    @JsonKey
    protected String _carton;

    /** TOTAL_QTY: {varchar(255)} */
    @JsonKey
    protected String _totalQty;

    /** NOTE: {varchar(255)} */
    @JsonKey
    protected String _note;

    /** RESERVE2: {varchar(255)} */
    @JsonKey
    protected String _reserve2;

    /** RESERVE3: {varchar(255)} */
    @JsonKey
    protected String _reserve3;

    /** RESERVE: {varchar(255)} */
    @JsonKey
    protected String _reserve;

    /** DEL_FLG: {char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {bigint(19), default=[(0)]} */
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
    public BsEShippingInstDataDto() {
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
        if (other == null || !(other instanceof BsEShippingInstDataDto)) { return false; }
        final BsEShippingInstDataDto otherEntity = (BsEShippingInstDataDto)other;
        if (!helpComparingValue(getShippingInstDataId(), otherEntity.getShippingInstDataId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_SHIPPING_INST_DATA");
        result = xCH(result, getShippingInstDataId());
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
        sb.append(c).append(getShippingInstDataId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getInstructionsDate());
        sb.append(c).append(getOwnerDirectNo());
        sb.append(c).append(getSalesType());
        sb.append(c).append(getShiptoCode());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getExpectQty());
        sb.append(c).append(getUnitPrice());
        sb.append(c).append(getPlanPriceTotal());
        sb.append(c).append(getPlanName());
        sb.append(c).append(getPlanpost());
        sb.append(c).append(getPlanAdress1());
        sb.append(c).append(getPlanAdress2());
        sb.append(c).append(getPlanProductName());
        sb.append(c).append(getWarehousePlant());
        sb.append(c).append(getWarehousePlantName());
        sb.append(c).append(getOrderDate());
        sb.append(c).append(getDeliveryDate());
        sb.append(c).append(getPurchaseNo());
        sb.append(c).append(getOrderNumber());
        sb.append(c).append(getItemLineNo());
        sb.append(c).append(getSkuCode());
        sb.append(c).append(getCardboard());
        sb.append(c).append(getCarton());
        sb.append(c).append(getTotalQty());
        sb.append(c).append(getNote());
        sb.append(c).append(getReserve2());
        sb.append(c).append(getReserve3());
        sb.append(c).append(getReserve());
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
     * [get] SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出荷指図情報受信ID
     * @return The value of the column 'SHIPPING_INST_DATA_ID'. (NullAllowed)
     */
    public Long getShippingInstDataId() {
        return _shippingInstDataId;
    }

    /**
     * [set] SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出荷指図情報受信ID
     * @param shippingInstDataId The value of the column 'SHIPPING_INST_DATA_ID'. (NullAllowed)
     */
    public void setShippingInstDataId(Long shippingInstDataId) {
        __modifiedProperties.add("shippingInstDataId");
        this._shippingInstDataId = shippingInstDataId;
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
     * [get] INSTRUCTIONS_DATE: {varchar(255)} <br>
     * 指図日
     * @return The value of the column 'INSTRUCTIONS_DATE'. (NullAllowed)
     */
    public String getInstructionsDate() {
        return _instructionsDate;
    }

    /**
     * [set] INSTRUCTIONS_DATE: {varchar(255)} <br>
     * 指図日
     * @param instructionsDate The value of the column 'INSTRUCTIONS_DATE'. (NullAllowed)
     */
    public void setInstructionsDate(String instructionsDate) {
        __modifiedProperties.add("instructionsDate");
        this._instructionsDate = instructionsDate;
    }

    /**
     * [get] OWNER_DIRECT_NO: {varchar(255)} <br>
     * 出荷伝票番号
     * @return The value of the column 'OWNER_DIRECT_NO'. (NullAllowed)
     */
    public String getOwnerDirectNo() {
        return _ownerDirectNo;
    }

    /**
     * [set] OWNER_DIRECT_NO: {varchar(255)} <br>
     * 出荷伝票番号
     * @param ownerDirectNo The value of the column 'OWNER_DIRECT_NO'. (NullAllowed)
     */
    public void setOwnerDirectNo(String ownerDirectNo) {
        __modifiedProperties.add("ownerDirectNo");
        this._ownerDirectNo = ownerDirectNo;
    }

    /**
     * [get] SALES_TYPE: {varchar(255)} <br>
     * 売上種別
     * @return The value of the column 'SALES_TYPE'. (NullAllowed)
     */
    public String getSalesType() {
        return _salesType;
    }

    /**
     * [set] SALES_TYPE: {varchar(255)} <br>
     * 売上種別
     * @param salesType The value of the column 'SALES_TYPE'. (NullAllowed)
     */
    public void setSalesType(String salesType) {
        __modifiedProperties.add("salesType");
        this._salesType = salesType;
    }

    /**
     * [get] SHIPTO_CODE: {varchar(255)} <br>
     * 出荷先コード
     * @return The value of the column 'SHIPTO_CODE'. (NullAllowed)
     */
    public String getShiptoCode() {
        return _shiptoCode;
    }

    /**
     * [set] SHIPTO_CODE: {varchar(255)} <br>
     * 出荷先コード
     * @param shiptoCode The value of the column 'SHIPTO_CODE'. (NullAllowed)
     */
    public void setShiptoCode(String shiptoCode) {
        __modifiedProperties.add("shiptoCode");
        this._shiptoCode = shiptoCode;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄コード
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄コード
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] EXPECT_QTY: {varchar(255)} <br>
     * 受注数量
     * @return The value of the column 'EXPECT_QTY'. (NullAllowed)
     */
    public String getExpectQty() {
        return _expectQty;
    }

    /**
     * [set] EXPECT_QTY: {varchar(255)} <br>
     * 受注数量
     * @param expectQty The value of the column 'EXPECT_QTY'. (NullAllowed)
     */
    public void setExpectQty(String expectQty) {
        __modifiedProperties.add("expectQty");
        this._expectQty = expectQty;
    }

    /**
     * [get] UNIT_PRICE: {varchar(255)} <br>
     * 単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public String getUnitPrice() {
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {varchar(255)} <br>
     * 単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public void setUnitPrice(String unitPrice) {
        __modifiedProperties.add("unitPrice");
        this._unitPrice = unitPrice;
    }

    /**
     * [get] PLAN_PRICE_TOTAL: {varchar(255)} <br>
     * 売上金額
     * @return The value of the column 'PLAN_PRICE_TOTAL'. (NullAllowed)
     */
    public String getPlanPriceTotal() {
        return _planPriceTotal;
    }

    /**
     * [set] PLAN_PRICE_TOTAL: {varchar(255)} <br>
     * 売上金額
     * @param planPriceTotal The value of the column 'PLAN_PRICE_TOTAL'. (NullAllowed)
     */
    public void setPlanPriceTotal(String planPriceTotal) {
        __modifiedProperties.add("planPriceTotal");
        this._planPriceTotal = planPriceTotal;
    }

    /**
     * [get] PLAN_NAME: {varchar(255)} <br>
     * 出荷先名称
     * @return The value of the column 'PLAN_NAME'. (NullAllowed)
     */
    public String getPlanName() {
        return _planName;
    }

    /**
     * [set] PLAN_NAME: {varchar(255)} <br>
     * 出荷先名称
     * @param planName The value of the column 'PLAN_NAME'. (NullAllowed)
     */
    public void setPlanName(String planName) {
        __modifiedProperties.add("planName");
        this._planName = planName;
    }

    /**
     * [get] PLANPOST: {varchar(255)} <br>
     * 出荷先郵便番号
     * @return The value of the column 'PLANPOST'. (NullAllowed)
     */
    public String getPlanpost() {
        return _planpost;
    }

    /**
     * [set] PLANPOST: {varchar(255)} <br>
     * 出荷先郵便番号
     * @param planpost The value of the column 'PLANPOST'. (NullAllowed)
     */
    public void setPlanpost(String planpost) {
        __modifiedProperties.add("planpost");
        this._planpost = planpost;
    }

    /**
     * [get] PLAN_ADRESS1: {varchar(255)} <br>
     * 出荷先住所1
     * @return The value of the column 'PLAN_ADRESS1'. (NullAllowed)
     */
    public String getPlanAdress1() {
        return _planAdress1;
    }

    /**
     * [set] PLAN_ADRESS1: {varchar(255)} <br>
     * 出荷先住所1
     * @param planAdress1 The value of the column 'PLAN_ADRESS1'. (NullAllowed)
     */
    public void setPlanAdress1(String planAdress1) {
        __modifiedProperties.add("planAdress1");
        this._planAdress1 = planAdress1;
    }

    /**
     * [get] PLAN_ADRESS2: {varchar(255)} <br>
     * 出荷先住所2
     * @return The value of the column 'PLAN_ADRESS2'. (NullAllowed)
     */
    public String getPlanAdress2() {
        return _planAdress2;
    }

    /**
     * [set] PLAN_ADRESS2: {varchar(255)} <br>
     * 出荷先住所2
     * @param planAdress2 The value of the column 'PLAN_ADRESS2'. (NullAllowed)
     */
    public void setPlanAdress2(String planAdress2) {
        __modifiedProperties.add("planAdress2");
        this._planAdress2 = planAdress2;
    }

    /**
     * [get] PLAN_PRODUCT_NAME: {varchar(255)} <br>
     * 銘柄テキスト
     * @return The value of the column 'PLAN_PRODUCT_NAME'. (NullAllowed)
     */
    public String getPlanProductName() {
        return _planProductName;
    }

    /**
     * [set] PLAN_PRODUCT_NAME: {varchar(255)} <br>
     * 銘柄テキスト
     * @param planProductName The value of the column 'PLAN_PRODUCT_NAME'. (NullAllowed)
     */
    public void setPlanProductName(String planProductName) {
        __modifiedProperties.add("planProductName");
        this._planProductName = planProductName;
    }

    /**
     * [get] WAREHOUSE_PLANT: {varchar(255)} <br>
     * 出荷プラント
     * @return The value of the column 'WAREHOUSE_PLANT'. (NullAllowed)
     */
    public String getWarehousePlant() {
        return _warehousePlant;
    }

    /**
     * [set] WAREHOUSE_PLANT: {varchar(255)} <br>
     * 出荷プラント
     * @param warehousePlant The value of the column 'WAREHOUSE_PLANT'. (NullAllowed)
     */
    public void setWarehousePlant(String warehousePlant) {
        __modifiedProperties.add("warehousePlant");
        this._warehousePlant = warehousePlant;
    }

    /**
     * [get] WAREHOUSE_PLANT_NAME: {varchar(255)} <br>
     * 出荷プラント名称
     * @return The value of the column 'WAREHOUSE_PLANT_NAME'. (NullAllowed)
     */
    public String getWarehousePlantName() {
        return _warehousePlantName;
    }

    /**
     * [set] WAREHOUSE_PLANT_NAME: {varchar(255)} <br>
     * 出荷プラント名称
     * @param warehousePlantName The value of the column 'WAREHOUSE_PLANT_NAME'. (NullAllowed)
     */
    public void setWarehousePlantName(String warehousePlantName) {
        __modifiedProperties.add("warehousePlantName");
        this._warehousePlantName = warehousePlantName;
    }

    /**
     * [get] ORDER_DATE: {varchar(255)} <br>
     * 受注日
     * @return The value of the column 'ORDER_DATE'. (NullAllowed)
     */
    public String getOrderDate() {
        return _orderDate;
    }

    /**
     * [set] ORDER_DATE: {varchar(255)} <br>
     * 受注日
     * @param orderDate The value of the column 'ORDER_DATE'. (NullAllowed)
     */
    public void setOrderDate(String orderDate) {
        __modifiedProperties.add("orderDate");
        this._orderDate = orderDate;
    }

    /**
     * [get] DELIVERY_DATE: {varchar(255)} <br>
     * 納品日
     * @return The value of the column 'DELIVERY_DATE'. (NullAllowed)
     */
    public String getDeliveryDate() {
        return _deliveryDate;
    }

    /**
     * [set] DELIVERY_DATE: {varchar(255)} <br>
     * 納品日
     * @param deliveryDate The value of the column 'DELIVERY_DATE'. (NullAllowed)
     */
    public void setDeliveryDate(String deliveryDate) {
        __modifiedProperties.add("deliveryDate");
        this._deliveryDate = deliveryDate;
    }

    /**
     * [get] PURCHASE_NO: {varchar(255)} <br>
     * 発注番号
     * @return The value of the column 'PURCHASE_NO'. (NullAllowed)
     */
    public String getPurchaseNo() {
        return _purchaseNo;
    }

    /**
     * [set] PURCHASE_NO: {varchar(255)} <br>
     * 発注番号
     * @param purchaseNo The value of the column 'PURCHASE_NO'. (NullAllowed)
     */
    public void setPurchaseNo(String purchaseNo) {
        __modifiedProperties.add("purchaseNo");
        this._purchaseNo = purchaseNo;
    }

    /**
     * [get] ORDER_NUMBER: {varchar(255)} <br>
     * 受注番号
     * @return The value of the column 'ORDER_NUMBER'. (NullAllowed)
     */
    public String getOrderNumber() {
        return _orderNumber;
    }

    /**
     * [set] ORDER_NUMBER: {varchar(255)} <br>
     * 受注番号
     * @param orderNumber The value of the column 'ORDER_NUMBER'. (NullAllowed)
     */
    public void setOrderNumber(String orderNumber) {
        __modifiedProperties.add("orderNumber");
        this._orderNumber = orderNumber;
    }

    /**
     * [get] ITEM_LINE_NO: {varchar(255)} <br>
     * No.
     * @return The value of the column 'ITEM_LINE_NO'. (NullAllowed)
     */
    public String getItemLineNo() {
        return _itemLineNo;
    }

    /**
     * [set] ITEM_LINE_NO: {varchar(255)} <br>
     * No.
     * @param itemLineNo The value of the column 'ITEM_LINE_NO'. (NullAllowed)
     */
    public void setItemLineNo(String itemLineNo) {
        __modifiedProperties.add("itemLineNo");
        this._itemLineNo = itemLineNo;
    }

    /**
     * [get] SKU_CODE: {varchar(255)} <br>
     * SKU Code
     * @return The value of the column 'SKU_CODE'. (NullAllowed)
     */
    public String getSkuCode() {
        return _skuCode;
    }

    /**
     * [set] SKU_CODE: {varchar(255)} <br>
     * SKU Code
     * @param skuCode The value of the column 'SKU_CODE'. (NullAllowed)
     */
    public void setSkuCode(String skuCode) {
        __modifiedProperties.add("skuCode");
        this._skuCode = skuCode;
    }

    /**
     * [get] CARDBOARD: {varchar(255)} <br>
     * 段ボール
     * @return The value of the column 'CARDBOARD'. (NullAllowed)
     */
    public String getCardboard() {
        return _cardboard;
    }

    /**
     * [set] CARDBOARD: {varchar(255)} <br>
     * 段ボール
     * @param cardboard The value of the column 'CARDBOARD'. (NullAllowed)
     */
    public void setCardboard(String cardboard) {
        __modifiedProperties.add("cardboard");
        this._cardboard = cardboard;
    }

    /**
     * [get] CARTON: {varchar(255)} <br>
     * カートン
     * @return The value of the column 'CARTON'. (NullAllowed)
     */
    public String getCarton() {
        return _carton;
    }

    /**
     * [set] CARTON: {varchar(255)} <br>
     * カートン
     * @param carton The value of the column 'CARTON'. (NullAllowed)
     */
    public void setCarton(String carton) {
        __modifiedProperties.add("carton");
        this._carton = carton;
    }

    /**
     * [get] TOTAL_QTY: {varchar(255)} <br>
     * 合計
     * @return The value of the column 'TOTAL_QTY'. (NullAllowed)
     */
    public String getTotalQty() {
        return _totalQty;
    }

    /**
     * [set] TOTAL_QTY: {varchar(255)} <br>
     * 合計
     * @param totalQty The value of the column 'TOTAL_QTY'. (NullAllowed)
     */
    public void setTotalQty(String totalQty) {
        __modifiedProperties.add("totalQty");
        this._totalQty = totalQty;
    }

    /**
     * [get] NOTE: {varchar(255)} <br>
     * 備考
     * @return The value of the column 'NOTE'. (NullAllowed)
     */
    public String getNote() {
        return _note;
    }

    /**
     * [set] NOTE: {varchar(255)} <br>
     * 備考
     * @param note The value of the column 'NOTE'. (NullAllowed)
     */
    public void setNote(String note) {
        __modifiedProperties.add("note");
        this._note = note;
    }

    /**
     * [get] RESERVE2: {varchar(255)} <br>
     * 予備2
     * @return The value of the column 'RESERVE2'. (NullAllowed)
     */
    public String getReserve2() {
        return _reserve2;
    }

    /**
     * [set] RESERVE2: {varchar(255)} <br>
     * 予備2
     * @param reserve2 The value of the column 'RESERVE2'. (NullAllowed)
     */
    public void setReserve2(String reserve2) {
        __modifiedProperties.add("reserve2");
        this._reserve2 = reserve2;
    }

    /**
     * [get] RESERVE3: {varchar(255)} <br>
     * 予備3
     * @return The value of the column 'RESERVE3'. (NullAllowed)
     */
    public String getReserve3() {
        return _reserve3;
    }

    /**
     * [set] RESERVE3: {varchar(255)} <br>
     * 予備3
     * @param reserve3 The value of the column 'RESERVE3'. (NullAllowed)
     */
    public void setReserve3(String reserve3) {
        __modifiedProperties.add("reserve3");
        this._reserve3 = reserve3;
    }

    /**
     * [get] RESERVE: {varchar(255)} <br>
     * 予備
     * @return The value of the column 'RESERVE'. (NullAllowed)
     */
    public String getReserve() {
        return _reserve;
    }

    /**
     * [set] RESERVE: {varchar(255)} <br>
     * 予備
     * @param reserve The value of the column 'RESERVE'. (NullAllowed)
     */
    public void setReserve(String reserve) {
        __modifiedProperties.add("reserve");
        this._reserve = reserve;
    }

    /**
     * [get] DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19), default=[(0)]} <br>
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
