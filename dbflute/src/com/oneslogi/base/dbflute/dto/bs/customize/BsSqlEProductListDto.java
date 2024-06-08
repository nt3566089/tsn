package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlEProductList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LOT_REVERSE_FLG, LIMIT_DT_MANAG_FLG, LIMIT_DT_REVERSE_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, SHIPPING_STOP_FLG, FIXED_POINT, SHAPE_GRP_CD, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, MESSAGE_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlEProductListDto implements Serializable {

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
    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** RECEIVE_CD: {varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {char(1)} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {char(1)} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** CLIENT_CD: {varchar(255)} */
    @JsonKey
    protected String _clientCd;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_ABBR: {varchar(255)} */
    @JsonKey
    protected String _productAbbr;

    /** JAN_CD: {varchar(255)} */
    @JsonKey
    protected String _janCd;

    /** LOT_MANAG_FLG: {varchar(255)} */
    @JsonKey
    protected String _lotManagFlg;

    /** LOT_REVERSE_FLG: {varchar(255)} */
    @JsonKey
    protected String _lotReverseFlg;

    /** LIMIT_DT_MANAG_FLG: {varchar(255)} */
    @JsonKey
    protected String _limitDtManagFlg;

    /** LIMIT_DT_REVERSE_FLG: {varchar(255)} */
    @JsonKey
    protected String _limitDtReverseFlg;

    /** RECEIVE_LIMIT_NUM: {varchar(255)} */
    @JsonKey
    protected String _receiveLimitNum;

    /** SHIPPING_LIMIT_NUM: {varchar(255)} */
    @JsonKey
    protected String _shippingLimitNum;

    /** MERGE_CLS: {varchar(255)} */
    @JsonKey
    protected String _mergeCls;

    /** SHIPPING_STOP_FLG: {varchar(255)} */
    @JsonKey
    protected String _shippingStopFlg;

    /** FIXED_POINT: {varchar(255)} */
    @JsonKey
    protected String _fixedPoint;

    /** SHAPE_GRP_CD: {varchar(255)} */
    @JsonKey
    protected String _shapeGrpCd;

    /** LENGTH: {varchar(255)} */
    @JsonKey
    protected String _length;

    /** WIDTH: {varchar(255)} */
    @JsonKey
    protected String _width;

    /** HEIGHT: {varchar(255)} */
    @JsonKey
    protected String _height;

    /** VOLUME: {varchar(255)} */
    @JsonKey
    protected String _volume;

    /** NET_WEIGHT: {varchar(255)} */
    @JsonKey
    protected String _netWeight;

    /** GROSS_WEIGHT: {varchar(255)} */
    @JsonKey
    protected String _grossWeight;

    /** MESSAGE_NM: {varchar(4000)} */
    @JsonKey
    protected String _messageNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlEProductListDto() {
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
        if (other == null || !(other instanceof BsSqlEProductListDto)) { return false; }
        final BsSqlEProductListDto otherEntity = (BsSqlEProductListDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getReceiveCd(), otherEntity.getReceiveCd())) { return false; }
        if (!helpComparingValue(getReceiveRowId(), otherEntity.getReceiveRowId())) { return false; }
        if (!helpComparingValue(getImportFlg(), otherEntity.getImportFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getErrorMessageCd(), otherEntity.getErrorMessageCd())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getJanCd(), otherEntity.getJanCd())) { return false; }
        if (!helpComparingValue(getLotManagFlg(), otherEntity.getLotManagFlg())) { return false; }
        if (!helpComparingValue(getLotReverseFlg(), otherEntity.getLotReverseFlg())) { return false; }
        if (!helpComparingValue(getLimitDtManagFlg(), otherEntity.getLimitDtManagFlg())) { return false; }
        if (!helpComparingValue(getLimitDtReverseFlg(), otherEntity.getLimitDtReverseFlg())) { return false; }
        if (!helpComparingValue(getReceiveLimitNum(), otherEntity.getReceiveLimitNum())) { return false; }
        if (!helpComparingValue(getShippingLimitNum(), otherEntity.getShippingLimitNum())) { return false; }
        if (!helpComparingValue(getMergeCls(), otherEntity.getMergeCls())) { return false; }
        if (!helpComparingValue(getShippingStopFlg(), otherEntity.getShippingStopFlg())) { return false; }
        if (!helpComparingValue(getFixedPoint(), otherEntity.getFixedPoint())) { return false; }
        if (!helpComparingValue(getShapeGrpCd(), otherEntity.getShapeGrpCd())) { return false; }
        if (!helpComparingValue(getLength(), otherEntity.getLength())) { return false; }
        if (!helpComparingValue(getWidth(), otherEntity.getWidth())) { return false; }
        if (!helpComparingValue(getHeight(), otherEntity.getHeight())) { return false; }
        if (!helpComparingValue(getVolume(), otherEntity.getVolume())) { return false; }
        if (!helpComparingValue(getNetWeight(), otherEntity.getNetWeight())) { return false; }
        if (!helpComparingValue(getGrossWeight(), otherEntity.getGrossWeight())) { return false; }
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlEProductList");
        result = xCH(result, getProductId());
        result = xCH(result, getReceiveCd());
        result = xCH(result, getReceiveRowId());
        result = xCH(result, getImportFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getErrorMessageCd());
        result = xCH(result, getClientCd());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getJanCd());
        result = xCH(result, getLotManagFlg());
        result = xCH(result, getLotReverseFlg());
        result = xCH(result, getLimitDtManagFlg());
        result = xCH(result, getLimitDtReverseFlg());
        result = xCH(result, getReceiveLimitNum());
        result = xCH(result, getShippingLimitNum());
        result = xCH(result, getMergeCls());
        result = xCH(result, getShippingStopFlg());
        result = xCH(result, getFixedPoint());
        result = xCH(result, getShapeGrpCd());
        result = xCH(result, getLength());
        result = xCH(result, getWidth());
        result = xCH(result, getHeight());
        result = xCH(result, getVolume());
        result = xCH(result, getNetWeight());
        result = xCH(result, getGrossWeight());
        result = xCH(result, getMessageNm());
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
        sb.append(c).append(getProductId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getLotManagFlg());
        sb.append(c).append(getLotReverseFlg());
        sb.append(c).append(getLimitDtManagFlg());
        sb.append(c).append(getLimitDtReverseFlg());
        sb.append(c).append(getReceiveLimitNum());
        sb.append(c).append(getShippingLimitNum());
        sb.append(c).append(getMergeCls());
        sb.append(c).append(getShippingStopFlg());
        sb.append(c).append(getFixedPoint());
        sb.append(c).append(getShapeGrpCd());
        sb.append(c).append(getLength());
        sb.append(c).append(getWidth());
        sb.append(c).append(getHeight());
        sb.append(c).append(getVolume());
        sb.append(c).append(getNetWeight());
        sb.append(c).append(getGrossWeight());
        sb.append(c).append(getMessageNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] RECEIVE_CD: {varchar(30)} <br>
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {varchar(30)} <br>
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(255)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {varchar(255)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {varchar(255)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {varchar(255)} <br>
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public String getLotManagFlg() {
        return _lotManagFlg;
    }

    /**
     * [set] LOT_MANAG_FLG: {varchar(255)} <br>
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public void setLotManagFlg(String lotManagFlg) {
        __modifiedProperties.add("lotManagFlg");
        this._lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LOT_REVERSE_FLG: {varchar(255)} <br>
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLotReverseFlg() {
        return _lotReverseFlg;
    }

    /**
     * [set] LOT_REVERSE_FLG: {varchar(255)} <br>
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        __modifiedProperties.add("lotReverseFlg");
        this._lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {varchar(255)} <br>
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getLimitDtManagFlg() {
        return _limitDtManagFlg;
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {varchar(255)} <br>
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        __modifiedProperties.add("limitDtManagFlg");
        this._limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {varchar(255)} <br>
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLimitDtReverseFlg() {
        return _limitDtReverseFlg;
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {varchar(255)} <br>
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        __modifiedProperties.add("limitDtReverseFlg");
        this._limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] RECEIVE_LIMIT_NUM: {varchar(255)} <br>
     * @return The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed)
     */
    public String getReceiveLimitNum() {
        return _receiveLimitNum;
    }

    /**
     * [set] RECEIVE_LIMIT_NUM: {varchar(255)} <br>
     * @param receiveLimitNum The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed)
     */
    public void setReceiveLimitNum(String receiveLimitNum) {
        __modifiedProperties.add("receiveLimitNum");
        this._receiveLimitNum = receiveLimitNum;
    }

    /**
     * [get] SHIPPING_LIMIT_NUM: {varchar(255)} <br>
     * @return The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed)
     */
    public String getShippingLimitNum() {
        return _shippingLimitNum;
    }

    /**
     * [set] SHIPPING_LIMIT_NUM: {varchar(255)} <br>
     * @param shippingLimitNum The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed)
     */
    public void setShippingLimitNum(String shippingLimitNum) {
        __modifiedProperties.add("shippingLimitNum");
        this._shippingLimitNum = shippingLimitNum;
    }

    /**
     * [get] MERGE_CLS: {varchar(255)} <br>
     * @return The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public String getMergeCls() {
        return _mergeCls;
    }

    /**
     * [set] MERGE_CLS: {varchar(255)} <br>
     * @param mergeCls The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public void setMergeCls(String mergeCls) {
        __modifiedProperties.add("mergeCls");
        this._mergeCls = mergeCls;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {varchar(255)} <br>
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public String getShippingStopFlg() {
        return _shippingStopFlg;
    }

    /**
     * [set] SHIPPING_STOP_FLG: {varchar(255)} <br>
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        __modifiedProperties.add("shippingStopFlg");
        this._shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] FIXED_POINT: {varchar(255)} <br>
     * @return The value of the column 'FIXED_POINT'. (NullAllowed)
     */
    public String getFixedPoint() {
        return _fixedPoint;
    }

    /**
     * [set] FIXED_POINT: {varchar(255)} <br>
     * @param fixedPoint The value of the column 'FIXED_POINT'. (NullAllowed)
     */
    public void setFixedPoint(String fixedPoint) {
        __modifiedProperties.add("fixedPoint");
        this._fixedPoint = fixedPoint;
    }

    /**
     * [get] SHAPE_GRP_CD: {varchar(255)} <br>
     * @return The value of the column 'SHAPE_GRP_CD'. (NullAllowed)
     */
    public String getShapeGrpCd() {
        return _shapeGrpCd;
    }

    /**
     * [set] SHAPE_GRP_CD: {varchar(255)} <br>
     * @param shapeGrpCd The value of the column 'SHAPE_GRP_CD'. (NullAllowed)
     */
    public void setShapeGrpCd(String shapeGrpCd) {
        __modifiedProperties.add("shapeGrpCd");
        this._shapeGrpCd = shapeGrpCd;
    }

    /**
     * [get] LENGTH: {varchar(255)} <br>
     * @return The value of the column 'LENGTH'. (NullAllowed)
     */
    public String getLength() {
        return _length;
    }

    /**
     * [set] LENGTH: {varchar(255)} <br>
     * @param length The value of the column 'LENGTH'. (NullAllowed)
     */
    public void setLength(String length) {
        __modifiedProperties.add("length");
        this._length = length;
    }

    /**
     * [get] WIDTH: {varchar(255)} <br>
     * @return The value of the column 'WIDTH'. (NullAllowed)
     */
    public String getWidth() {
        return _width;
    }

    /**
     * [set] WIDTH: {varchar(255)} <br>
     * @param width The value of the column 'WIDTH'. (NullAllowed)
     */
    public void setWidth(String width) {
        __modifiedProperties.add("width");
        this._width = width;
    }

    /**
     * [get] HEIGHT: {varchar(255)} <br>
     * @return The value of the column 'HEIGHT'. (NullAllowed)
     */
    public String getHeight() {
        return _height;
    }

    /**
     * [set] HEIGHT: {varchar(255)} <br>
     * @param height The value of the column 'HEIGHT'. (NullAllowed)
     */
    public void setHeight(String height) {
        __modifiedProperties.add("height");
        this._height = height;
    }

    /**
     * [get] VOLUME: {varchar(255)} <br>
     * @return The value of the column 'VOLUME'. (NullAllowed)
     */
    public String getVolume() {
        return _volume;
    }

    /**
     * [set] VOLUME: {varchar(255)} <br>
     * @param volume The value of the column 'VOLUME'. (NullAllowed)
     */
    public void setVolume(String volume) {
        __modifiedProperties.add("volume");
        this._volume = volume;
    }

    /**
     * [get] NET_WEIGHT: {varchar(255)} <br>
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public String getNetWeight() {
        return _netWeight;
    }

    /**
     * [set] NET_WEIGHT: {varchar(255)} <br>
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public void setNetWeight(String netWeight) {
        __modifiedProperties.add("netWeight");
        this._netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {varchar(255)} <br>
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public String getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {varchar(255)} <br>
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(String grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public String getMessageNm() {
        return _messageNm;
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public void setMessageNm(String messageNm) {
        __modifiedProperties.add("messageNm");
        this._messageNm = messageNm;
    }

}
