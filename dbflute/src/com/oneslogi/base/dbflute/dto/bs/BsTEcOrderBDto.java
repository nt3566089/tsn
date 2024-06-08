package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_EC_ORDER_B as TABLE. <br>
 * EC受注ボディ
 * <pre>
 * [primary-key]
 *     EC_ORDER_B_ID
 *
 * [column]
 *     EC_ORDER_B_ID, EC_ORDER_H_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_OPTION, ORDER_NUM, UNIT_PRICE, UNIT_TOTAL_PRICE, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_EC_ORDER_H, B_CLASS_DTL(ByErrorFlg)
 *
 * [referrer-table]
 *     T_AMAZON_ORDER, T_RAKUTEN_ORDER, T_YAHOO_ORDER
 *
 * [foreign-property]
 *     tEcOrderH, bClassDtlByErrorFlg
 *
 * [referrer-property]
 *     tAmazonOrderList, tRakutenOrderList, tYahooOrderList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTEcOrderBDto implements Serializable {

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
    /** EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _ecOrderBId;

    /** EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H} */
    @JsonKey
    protected Long _ecOrderHId;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_OPTION: {varchar(255)} */
    @JsonKey
    protected String _productOption;

    /** ORDER_NUM: {bigint(19)} */
    @JsonKey
    protected Long _orderNum;

    /** UNIT_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _unitPrice;

    /** UNIT_TOTAL_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _unitTotalPrice;

    /** ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

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
    public BsTEcOrderBDto() {
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
    protected TEcOrderHDto _tEcOrderH;

    public TEcOrderHDto getTEcOrderH() {
        return _tEcOrderH;
    }

    public void setTEcOrderH(TEcOrderHDto tEcOrderH) {
        this._tEcOrderH = tEcOrderH;
    }

    protected BClassDtlDto _bClassDtlByErrorFlg;

    public BClassDtlDto getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    public void setBClassDtlByErrorFlg(BClassDtlDto bClassDtlByErrorFlg) {
        this._bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TAmazonOrderDto> _tAmazonOrderList;

    public List<TAmazonOrderDto> getTAmazonOrderList() {
        if (_tAmazonOrderList == null) { _tAmazonOrderList = new ArrayList<TAmazonOrderDto>(); }
        return _tAmazonOrderList;
    }

    public void setTAmazonOrderList(List<TAmazonOrderDto> tAmazonOrderList) {
        this._tAmazonOrderList = tAmazonOrderList;
    }

    protected List<TRakutenOrderDto> _tRakutenOrderList;

    public List<TRakutenOrderDto> getTRakutenOrderList() {
        if (_tRakutenOrderList == null) { _tRakutenOrderList = new ArrayList<TRakutenOrderDto>(); }
        return _tRakutenOrderList;
    }

    public void setTRakutenOrderList(List<TRakutenOrderDto> tRakutenOrderList) {
        this._tRakutenOrderList = tRakutenOrderList;
    }

    protected List<TYahooOrderDto> _tYahooOrderList;

    public List<TYahooOrderDto> getTYahooOrderList() {
        if (_tYahooOrderList == null) { _tYahooOrderList = new ArrayList<TYahooOrderDto>(); }
        return _tYahooOrderList;
    }

    public void setTYahooOrderList(List<TYahooOrderDto> tYahooOrderList) {
        this._tYahooOrderList = tYahooOrderList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTEcOrderBDto)) { return false; }
        final BsTEcOrderBDto otherEntity = (BsTEcOrderBDto)other;
        if (!helpComparingValue(getEcOrderBId(), otherEntity.getEcOrderBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_EC_ORDER_B");
        result = xCH(result, getEcOrderBId());
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
        sb.append(c).append(getEcOrderBId());
        sb.append(c).append(getEcOrderHId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductOption());
        sb.append(c).append(getOrderNum());
        sb.append(c).append(getUnitPrice());
        sb.append(c).append(getUnitTotalPrice());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
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
     * [get] EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * EC受注ボディID
     * @return The value of the column 'EC_ORDER_B_ID'. (NullAllowed)
     */
    public Long getEcOrderBId() {
        return _ecOrderBId;
    }

    /**
     * [set] EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * EC受注ボディID
     * @param ecOrderBId The value of the column 'EC_ORDER_B_ID'. (NullAllowed)
     */
    public void setEcOrderBId(Long ecOrderBId) {
        __modifiedProperties.add("ecOrderBId");
        this._ecOrderBId = ecOrderBId;
    }

    /**
     * [get] EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H} <br>
     * EC受注ヘッダID
     * @return The value of the column 'EC_ORDER_H_ID'. (NullAllowed)
     */
    public Long getEcOrderHId() {
        return _ecOrderHId;
    }

    /**
     * [set] EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H} <br>
     * EC受注ヘッダID
     * @param ecOrderHId The value of the column 'EC_ORDER_H_ID'. (NullAllowed)
     */
    public void setEcOrderHId(Long ecOrderHId) {
        __modifiedProperties.add("ecOrderHId");
        this._ecOrderHId = ecOrderHId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
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
     * [get] PRODUCT_OPTION: {varchar(255)} <br>
     * 商品オプション
     * @return The value of the column 'PRODUCT_OPTION'. (NullAllowed)
     */
    public String getProductOption() {
        return _productOption;
    }

    /**
     * [set] PRODUCT_OPTION: {varchar(255)} <br>
     * 商品オプション
     * @param productOption The value of the column 'PRODUCT_OPTION'. (NullAllowed)
     */
    public void setProductOption(String productOption) {
        __modifiedProperties.add("productOption");
        this._productOption = productOption;
    }

    /**
     * [get] ORDER_NUM: {bigint(19)} <br>
     * 個数
     * @return The value of the column 'ORDER_NUM'. (NullAllowed)
     */
    public Long getOrderNum() {
        return _orderNum;
    }

    /**
     * [set] ORDER_NUM: {bigint(19)} <br>
     * 個数
     * @param orderNum The value of the column 'ORDER_NUM'. (NullAllowed)
     */
    public void setOrderNum(Long orderNum) {
        __modifiedProperties.add("orderNum");
        this._orderNum = orderNum;
    }

    /**
     * [get] UNIT_PRICE: {bigint(19)} <br>
     * 単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public Long getUnitPrice() {
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {bigint(19)} <br>
     * 単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public void setUnitPrice(Long unitPrice) {
        __modifiedProperties.add("unitPrice");
        this._unitPrice = unitPrice;
    }

    /**
     * [get] UNIT_TOTAL_PRICE: {bigint(19)} <br>
     * 小計
     * @return The value of the column 'UNIT_TOTAL_PRICE'. (NullAllowed)
     */
    public Long getUnitTotalPrice() {
        return _unitTotalPrice;
    }

    /**
     * [set] UNIT_TOTAL_PRICE: {bigint(19)} <br>
     * 小計
     * @param unitTotalPrice The value of the column 'UNIT_TOTAL_PRICE'. (NullAllowed)
     */
    public void setUnitTotalPrice(Long unitTotalPrice) {
        __modifiedProperties.add("unitTotalPrice");
        this._unitTotalPrice = unitTotalPrice;
    }

    /**
     * [get] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
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
