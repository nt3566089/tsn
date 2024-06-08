package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_PRODUCT as TABLE. <br>
 * 商品マスタ受信
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LOT_REVERSE_FLG, LIMIT_DT_MANAG_FLG, LIMIT_DT_REVERSE_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, SHIPPING_STOP_FLG, FIXED_POINT, SHAPE_GRP_CD, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
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
public abstract class BsEProductDto implements Serializable {

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
    /** PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _productId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} */
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

    /** LOT_MANAG_FLG: {varchar(255), default=[0]} */
    @JsonKey
    protected String _lotManagFlg;

    /** LOT_REVERSE_FLG: {varchar(255), default=[0]} */
    @JsonKey
    protected String _lotReverseFlg;

    /** LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]} */
    @JsonKey
    protected String _limitDtManagFlg;

    /** LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]} */
    @JsonKey
    protected String _limitDtReverseFlg;

    /** RECEIVE_LIMIT_NUM: {varchar(255), default=[(0)]} */
    @JsonKey
    protected String _receiveLimitNum;

    /** SHIPPING_LIMIT_NUM: {varchar(255), default=[(0)]} */
    @JsonKey
    protected String _shippingLimitNum;

    /** MERGE_CLS: {varchar(255), default=[02]} */
    @JsonKey
    protected String _mergeCls;

    /** SHIPPING_STOP_FLG: {varchar(255), default=[0]} */
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
    public BsEProductDto() {
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
        if (other == null || !(other instanceof BsEProductDto)) { return false; }
        final BsEProductDto otherEntity = (BsEProductDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_PRODUCT");
        result = xCH(result, getProductId());
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
     * [get] PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品マスタ受信ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品マスタ受信ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
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
     * [get] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(255)} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(255)} <br>
     * 商品略称
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {varchar(255)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {varchar(255)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {varchar(255), default=[0]} <br>
     * ロット管理フラグ
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public String getLotManagFlg() {
        return _lotManagFlg;
    }

    /**
     * [set] LOT_MANAG_FLG: {varchar(255), default=[0]} <br>
     * ロット管理フラグ
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public void setLotManagFlg(String lotManagFlg) {
        __modifiedProperties.add("lotManagFlg");
        this._lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LOT_REVERSE_FLG: {varchar(255), default=[0]} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLotReverseFlg() {
        return _lotReverseFlg;
    }

    /**
     * [set] LOT_REVERSE_FLG: {varchar(255), default=[0]} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        __modifiedProperties.add("lotReverseFlg");
        this._lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]} <br>
     * 期限日管理フラグ
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getLimitDtManagFlg() {
        return _limitDtManagFlg;
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]} <br>
     * 期限日管理フラグ
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        __modifiedProperties.add("limitDtManagFlg");
        this._limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLimitDtReverseFlg() {
        return _limitDtReverseFlg;
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        __modifiedProperties.add("limitDtReverseFlg");
        this._limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] RECEIVE_LIMIT_NUM: {varchar(255), default=[(0)]} <br>
     * 入荷期限日数
     * @return The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed)
     */
    public String getReceiveLimitNum() {
        return _receiveLimitNum;
    }

    /**
     * [set] RECEIVE_LIMIT_NUM: {varchar(255), default=[(0)]} <br>
     * 入荷期限日数
     * @param receiveLimitNum The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed)
     */
    public void setReceiveLimitNum(String receiveLimitNum) {
        __modifiedProperties.add("receiveLimitNum");
        this._receiveLimitNum = receiveLimitNum;
    }

    /**
     * [get] SHIPPING_LIMIT_NUM: {varchar(255), default=[(0)]} <br>
     * 出荷期限日数
     * @return The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed)
     */
    public String getShippingLimitNum() {
        return _shippingLimitNum;
    }

    /**
     * [set] SHIPPING_LIMIT_NUM: {varchar(255), default=[(0)]} <br>
     * 出荷期限日数
     * @param shippingLimitNum The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed)
     */
    public void setShippingLimitNum(String shippingLimitNum) {
        __modifiedProperties.add("shippingLimitNum");
        this._shippingLimitNum = shippingLimitNum;
    }

    /**
     * [get] MERGE_CLS: {varchar(255), default=[02]} <br>
     * 入庫No.マージ区分
     * @return The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public String getMergeCls() {
        return _mergeCls;
    }

    /**
     * [set] MERGE_CLS: {varchar(255), default=[02]} <br>
     * 入庫No.マージ区分
     * @param mergeCls The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public void setMergeCls(String mergeCls) {
        __modifiedProperties.add("mergeCls");
        this._mergeCls = mergeCls;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {varchar(255), default=[0]} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public String getShippingStopFlg() {
        return _shippingStopFlg;
    }

    /**
     * [set] SHIPPING_STOP_FLG: {varchar(255), default=[0]} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        __modifiedProperties.add("shippingStopFlg");
        this._shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] FIXED_POINT: {varchar(255)} <br>
     * 定点
     * @return The value of the column 'FIXED_POINT'. (NullAllowed)
     */
    public String getFixedPoint() {
        return _fixedPoint;
    }

    /**
     * [set] FIXED_POINT: {varchar(255)} <br>
     * 定点
     * @param fixedPoint The value of the column 'FIXED_POINT'. (NullAllowed)
     */
    public void setFixedPoint(String fixedPoint) {
        __modifiedProperties.add("fixedPoint");
        this._fixedPoint = fixedPoint;
    }

    /**
     * [get] SHAPE_GRP_CD: {varchar(255)} <br>
     * 荷姿グループCD
     * @return The value of the column 'SHAPE_GRP_CD'. (NullAllowed)
     */
    public String getShapeGrpCd() {
        return _shapeGrpCd;
    }

    /**
     * [set] SHAPE_GRP_CD: {varchar(255)} <br>
     * 荷姿グループCD
     * @param shapeGrpCd The value of the column 'SHAPE_GRP_CD'. (NullAllowed)
     */
    public void setShapeGrpCd(String shapeGrpCd) {
        __modifiedProperties.add("shapeGrpCd");
        this._shapeGrpCd = shapeGrpCd;
    }

    /**
     * [get] LENGTH: {varchar(255)} <br>
     * 縦(mm)
     * @return The value of the column 'LENGTH'. (NullAllowed)
     */
    public String getLength() {
        return _length;
    }

    /**
     * [set] LENGTH: {varchar(255)} <br>
     * 縦(mm)
     * @param length The value of the column 'LENGTH'. (NullAllowed)
     */
    public void setLength(String length) {
        __modifiedProperties.add("length");
        this._length = length;
    }

    /**
     * [get] WIDTH: {varchar(255)} <br>
     * 横(mm)
     * @return The value of the column 'WIDTH'. (NullAllowed)
     */
    public String getWidth() {
        return _width;
    }

    /**
     * [set] WIDTH: {varchar(255)} <br>
     * 横(mm)
     * @param width The value of the column 'WIDTH'. (NullAllowed)
     */
    public void setWidth(String width) {
        __modifiedProperties.add("width");
        this._width = width;
    }

    /**
     * [get] HEIGHT: {varchar(255)} <br>
     * 高さ(mm)
     * @return The value of the column 'HEIGHT'. (NullAllowed)
     */
    public String getHeight() {
        return _height;
    }

    /**
     * [set] HEIGHT: {varchar(255)} <br>
     * 高さ(mm)
     * @param height The value of the column 'HEIGHT'. (NullAllowed)
     */
    public void setHeight(String height) {
        __modifiedProperties.add("height");
        this._height = height;
    }

    /**
     * [get] VOLUME: {varchar(255)} <br>
     * 容積(mm3)
     * @return The value of the column 'VOLUME'. (NullAllowed)
     */
    public String getVolume() {
        return _volume;
    }

    /**
     * [set] VOLUME: {varchar(255)} <br>
     * 容積(mm3)
     * @param volume The value of the column 'VOLUME'. (NullAllowed)
     */
    public void setVolume(String volume) {
        __modifiedProperties.add("volume");
        this._volume = volume;
    }

    /**
     * [get] NET_WEIGHT: {varchar(255)} <br>
     * 商品重量(g)
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public String getNetWeight() {
        return _netWeight;
    }

    /**
     * [set] NET_WEIGHT: {varchar(255)} <br>
     * 商品重量(g)
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public void setNetWeight(String netWeight) {
        __modifiedProperties.add("netWeight");
        this._netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {varchar(255)} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public String getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {varchar(255)} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(String grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
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
