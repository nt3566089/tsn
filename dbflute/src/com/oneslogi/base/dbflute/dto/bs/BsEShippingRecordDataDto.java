package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_SHIPPING_RECORD_DATA as TABLE. <br>
 * 発送実績データ受信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_RECORD_DATA_ID
 *
 * [column]
 *     SHIPPING_RECORD_DATA_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, DATA_FLG, RECORD_DATA, TRANSPORTCD, ITEMCD_H, ORDERNO_H, CASEQTY, FRACTQTY, SHIPTOCD, FACTORYCD, ITEMCD_M, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO_M, MACHINENO, CREATENO, LIMITDATE, CASELOT4, DISTRIBUTIONCD, PALLETID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_DATA_ID
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
public abstract class BsEShippingRecordDataDto implements Serializable {

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
    /** SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shippingRecordDataId;

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

    /** DATA_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _dataFlg;

    /** RECORD_DATA: {varchar(255)} */
    @JsonKey
    protected String _recordData;

    /** TRANSPORTCD: {varchar(255)} */
    @JsonKey
    protected String _transportcd;

    /** ITEMCD_H: {varchar(255)} */
    @JsonKey
    protected String _itemcdH;

    /** ORDERNO_H: {varchar(255)} */
    @JsonKey
    protected String _ordernoH;

    /** CASEQTY: {varchar(255)} */
    @JsonKey
    protected String _caseqty;

    /** FRACTQTY: {varchar(255)} */
    @JsonKey
    protected String _fractqty;

    /** SHIPTOCD: {varchar(255)} */
    @JsonKey
    protected String _shiptocd;

    /** FACTORYCD: {varchar(255)} */
    @JsonKey
    protected String _factorycd;

    /** ITEMCD_M: {varchar(255)} */
    @JsonKey
    protected String _itemcdM;

    /** SKUCD: {varchar(255)} */
    @JsonKey
    protected String _skucd;

    /** DESTINATIONCD: {varchar(255)} */
    @JsonKey
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(255)} */
    @JsonKey
    protected String _manufacturecd;

    /** ORDERNO_M: {varchar(255)} */
    @JsonKey
    protected String _ordernoM;

    /** MACHINENO: {varchar(255)} */
    @JsonKey
    protected String _machineno;

    /** CREATENO: {varchar(255)} */
    @JsonKey
    protected String _createno;

    /** LIMITDATE: {varchar(255)} */
    @JsonKey
    protected String _limitdate;

    /** CASELOT4: {varchar(255)} */
    @JsonKey
    protected String _caselot4;

    /** DISTRIBUTIONCD: {varchar(255)} */
    @JsonKey
    protected String _distributioncd;

    /** PALLETID: {varchar(255)} */
    @JsonKey
    protected String _palletid;

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
    public BsEShippingRecordDataDto() {
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
        if (other == null || !(other instanceof BsEShippingRecordDataDto)) { return false; }
        final BsEShippingRecordDataDto otherEntity = (BsEShippingRecordDataDto)other;
        if (!helpComparingValue(getShippingRecordDataId(), otherEntity.getShippingRecordDataId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_SHIPPING_RECORD_DATA");
        result = xCH(result, getShippingRecordDataId());
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
        sb.append(c).append(getShippingRecordDataId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getDataFlg());
        sb.append(c).append(getRecordData());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getItemcdH());
        sb.append(c).append(getOrdernoH());
        sb.append(c).append(getCaseqty());
        sb.append(c).append(getFractqty());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getFactorycd());
        sb.append(c).append(getItemcdM());
        sb.append(c).append(getSkucd());
        sb.append(c).append(getDestinationcd());
        sb.append(c).append(getManufacturecd());
        sb.append(c).append(getOrdernoM());
        sb.append(c).append(getMachineno());
        sb.append(c).append(getCreateno());
        sb.append(c).append(getLimitdate());
        sb.append(c).append(getCaselot4());
        sb.append(c).append(getDistributioncd());
        sb.append(c).append(getPalletid());
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
     * [get] SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 発送実績データ受信ID
     * @return The value of the column 'SHIPPING_RECORD_DATA_ID'. (NullAllowed)
     */
    public Long getShippingRecordDataId() {
        return _shippingRecordDataId;
    }

    /**
     * [set] SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 発送実績データ受信ID
     * @param shippingRecordDataId The value of the column 'SHIPPING_RECORD_DATA_ID'. (NullAllowed)
     */
    public void setShippingRecordDataId(Long shippingRecordDataId) {
        __modifiedProperties.add("shippingRecordDataId");
        this._shippingRecordDataId = shippingRecordDataId;
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
     * [get] DATA_FLG: {NotNull, char(1), default=[0]} <br>
     * ヘッダフラグ
     * @return The value of the column 'DATA_FLG'. (NullAllowed)
     */
    public String getDataFlg() {
        return _dataFlg;
    }

    /**
     * [set] DATA_FLG: {NotNull, char(1), default=[0]} <br>
     * ヘッダフラグ
     * @param dataFlg The value of the column 'DATA_FLG'. (NullAllowed)
     */
    public void setDataFlg(String dataFlg) {
        __modifiedProperties.add("dataFlg");
        this._dataFlg = dataFlg;
    }

    /**
     * [get] RECORD_DATA: {varchar(255)} <br>
     * レコード長判定用項目
     * @return The value of the column 'RECORD_DATA'. (NullAllowed)
     */
    public String getRecordData() {
        return _recordData;
    }

    /**
     * [set] RECORD_DATA: {varchar(255)} <br>
     * レコード長判定用項目
     * @param recordData The value of the column 'RECORD_DATA'. (NullAllowed)
     */
    public void setRecordData(String recordData) {
        __modifiedProperties.add("recordData");
        this._recordData = recordData;
    }

    /**
     * [get] TRANSPORTCD: {varchar(255)} <br>
     * 輸送整理番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {varchar(255)} <br>
     * 輸送整理番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] ITEMCD_H: {varchar(255)} <br>
     * ヘッダ部銘柄CD
     * @return The value of the column 'ITEMCD_H'. (NullAllowed)
     */
    public String getItemcdH() {
        return _itemcdH;
    }

    /**
     * [set] ITEMCD_H: {varchar(255)} <br>
     * ヘッダ部銘柄CD
     * @param itemcdH The value of the column 'ITEMCD_H'. (NullAllowed)
     */
    public void setItemcdH(String itemcdH) {
        __modifiedProperties.add("itemcdH");
        this._itemcdH = itemcdH;
    }

    /**
     * [get] ORDERNO_H: {varchar(255)} <br>
     * ヘッダ部発注番号
     * @return The value of the column 'ORDERNO_H'. (NullAllowed)
     */
    public String getOrdernoH() {
        return _ordernoH;
    }

    /**
     * [set] ORDERNO_H: {varchar(255)} <br>
     * ヘッダ部発注番号
     * @param ordernoH The value of the column 'ORDERNO_H'. (NullAllowed)
     */
    public void setOrdernoH(String ordernoH) {
        __modifiedProperties.add("ordernoH");
        this._ordernoH = ordernoH;
    }

    /**
     * [get] CASEQTY: {varchar(255)} <br>
     * 段ボール数
     * @return The value of the column 'CASEQTY'. (NullAllowed)
     */
    public String getCaseqty() {
        return _caseqty;
    }

    /**
     * [set] CASEQTY: {varchar(255)} <br>
     * 段ボール数
     * @param caseqty The value of the column 'CASEQTY'. (NullAllowed)
     */
    public void setCaseqty(String caseqty) {
        __modifiedProperties.add("caseqty");
        this._caseqty = caseqty;
    }

    /**
     * [get] FRACTQTY: {varchar(255)} <br>
     * 個数
     * @return The value of the column 'FRACTQTY'. (NullAllowed)
     */
    public String getFractqty() {
        return _fractqty;
    }

    /**
     * [set] FRACTQTY: {varchar(255)} <br>
     * 個数
     * @param fractqty The value of the column 'FRACTQTY'. (NullAllowed)
     */
    public void setFractqty(String fractqty) {
        __modifiedProperties.add("fractqty");
        this._fractqty = fractqty;
    }

    /**
     * [get] SHIPTOCD: {varchar(255)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {varchar(255)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] FACTORYCD: {varchar(255)} <br>
     * 工場
     * @return The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public String getFactorycd() {
        return _factorycd;
    }

    /**
     * [set] FACTORYCD: {varchar(255)} <br>
     * 工場
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public void setFactorycd(String factorycd) {
        __modifiedProperties.add("factorycd");
        this._factorycd = factorycd;
    }

    /**
     * [get] ITEMCD_M: {varchar(255)} <br>
     * 明細部銘柄CD
     * @return The value of the column 'ITEMCD_M'. (NullAllowed)
     */
    public String getItemcdM() {
        return _itemcdM;
    }

    /**
     * [set] ITEMCD_M: {varchar(255)} <br>
     * 明細部銘柄CD
     * @param itemcdM The value of the column 'ITEMCD_M'. (NullAllowed)
     */
    public void setItemcdM(String itemcdM) {
        __modifiedProperties.add("itemcdM");
        this._itemcdM = itemcdM;
    }

    /**
     * [get] SKUCD: {varchar(255)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed)
     */
    public String getSkucd() {
        return _skucd;
    }

    /**
     * [set] SKUCD: {varchar(255)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed)
     */
    public void setSkucd(String skucd) {
        __modifiedProperties.add("skucd");
        this._skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(255)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public String getDestinationcd() {
        return _destinationcd;
    }

    /**
     * [set] DESTINATIONCD: {varchar(255)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public void setDestinationcd(String destinationcd) {
        __modifiedProperties.add("destinationcd");
        this._destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public String getManufacturecd() {
        return _manufacturecd;
    }

    /**
     * [set] MANUFACTURECD: {varchar(255)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public void setManufacturecd(String manufacturecd) {
        __modifiedProperties.add("manufacturecd");
        this._manufacturecd = manufacturecd;
    }

    /**
     * [get] ORDERNO_M: {varchar(255)} <br>
     * 明細部発注番号
     * @return The value of the column 'ORDERNO_M'. (NullAllowed)
     */
    public String getOrdernoM() {
        return _ordernoM;
    }

    /**
     * [set] ORDERNO_M: {varchar(255)} <br>
     * 明細部発注番号
     * @param ordernoM The value of the column 'ORDERNO_M'. (NullAllowed)
     */
    public void setOrdernoM(String ordernoM) {
        __modifiedProperties.add("ordernoM");
        this._ordernoM = ordernoM;
    }

    /**
     * [get] MACHINENO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed)
     */
    public String getMachineno() {
        return _machineno;
    }

    /**
     * [set] MACHINENO: {varchar(255)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed)
     */
    public void setMachineno(String machineno) {
        __modifiedProperties.add("machineno");
        this._machineno = machineno;
    }

    /**
     * [get] CREATENO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed)
     */
    public String getCreateno() {
        return _createno;
    }

    /**
     * [set] CREATENO: {varchar(255)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed)
     */
    public void setCreateno(String createno) {
        __modifiedProperties.add("createno");
        this._createno = createno;
    }

    /**
     * [get] LIMITDATE: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public String getLimitdate() {
        return _limitdate;
    }

    /**
     * [set] LIMITDATE: {varchar(255)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public void setLimitdate(String limitdate) {
        __modifiedProperties.add("limitdate");
        this._limitdate = limitdate;
    }

    /**
     * [get] CASELOT4: {varchar(255)} <br>
     * 実製造年月日
     * @return The value of the column 'CASELOT4'. (NullAllowed)
     */
    public String getCaselot4() {
        return _caselot4;
    }

    /**
     * [set] CASELOT4: {varchar(255)} <br>
     * 実製造年月日
     * @param caselot4 The value of the column 'CASELOT4'. (NullAllowed)
     */
    public void setCaselot4(String caselot4) {
        __modifiedProperties.add("caselot4");
        this._caselot4 = caselot4;
    }

    /**
     * [get] DISTRIBUTIONCD: {varchar(255)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public String getDistributioncd() {
        return _distributioncd;
    }

    /**
     * [set] DISTRIBUTIONCD: {varchar(255)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public void setDistributioncd(String distributioncd) {
        __modifiedProperties.add("distributioncd");
        this._distributioncd = distributioncd;
    }

    /**
     * [get] PALLETID: {varchar(255)} <br>
     * パレットID
     * @return The value of the column 'PALLETID'. (NullAllowed)
     */
    public String getPalletid() {
        return _palletid;
    }

    /**
     * [set] PALLETID: {varchar(255)} <br>
     * パレットID
     * @param palletid The value of the column 'PALLETID'. (NullAllowed)
     */
    public void setPalletid(String palletid) {
        __modifiedProperties.add("palletid");
        this._palletid = palletid;
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
