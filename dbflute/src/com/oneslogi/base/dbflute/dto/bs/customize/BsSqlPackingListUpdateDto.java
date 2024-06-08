package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlPackingListUpdate. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PACKING_H_ID, CENTER_ID, CENTER_CD, CENTER_NM, CLIENT_ID, CLIENT_CD, CLIENT_NM, BOX_CD, BOX_NM, PRODUCT_CD, JAN_CD, PRODUCT_NM, PRODUCT_ID, PRODUCT_ABBR, PACKING_NUM_SUM, DELIV_DT, DELIV_TZ, DELIV_ZIP_CD, DELIV_TEL_NO, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_CUSTOMER_NM, VERSION_NO, PROCESS_TYPE_ID, ALLOC_INST_H_ID, PICKING_H_ID, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, PICKING_NUM_SUM, UPD_DT, COUNT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsSqlPackingListUpdateDto implements Serializable {

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
    /** PACKING_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _packingHId;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** BOX_CD: {varchar(30)} */
    @JsonKey
    protected String _boxCd;

    /** BOX_NM: {varchar(60)} */
    @JsonKey
    protected String _boxNm;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** JAN_CD: {varchar(30)} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** PACKING_NUM_SUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNumSum;

    /** DELIV_DT: {varchar(8)} */
    @JsonKey
    protected String _delivDt;

    /** DELIV_TZ: {varchar(30)} */
    @JsonKey
    protected String _delivTz;

    /** DELIV_ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _delivZipCd;

    /** DELIV_TEL_NO: {varchar(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** DELIV_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _delivAddress3;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** PROCESS_TYPE_ID: {bigint(19)} */
    @JsonKey
    protected Long _processTypeId;

    /** ALLOC_INST_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _allocInstHId;

    /** PICKING_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _pickingHId;

    /** SHIPPING_PACKING_NO: {varchar(30)} */
    @JsonKey
    protected String _shippingPackingNo;

    /** CARRIER_TRACE_NUM: {varchar(30)} */
    @JsonKey
    protected String _carrierTraceNum;

    /** PICKING_NUM_SUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pickingNumSum;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** COUNT: {int(10)} */
    @JsonKey
    protected Long _count;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlPackingListUpdateDto() {
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
        if (other == null || !(other instanceof BsSqlPackingListUpdateDto)) { return false; }
        final BsSqlPackingListUpdateDto otherEntity = (BsSqlPackingListUpdateDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlPackingListUpdate");
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
        sb.append(c).append(getPackingHId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getBoxCd());
        sb.append(c).append(getBoxNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getPackingNumSum());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getDelivZipCd());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getShippingPackingNo());
        sb.append(c).append(getCarrierTraceNum());
        sb.append(c).append(getPickingNumSum());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getCount());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PACKING_H_ID: {bigint(19)} <br>
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public Long getPackingHId() {
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {bigint(19)} <br>
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public void setPackingHId(Long packingHId) {
        __modifiedProperties.add("packingHId");
        this._packingHId = packingHId;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] BOX_CD: {varchar(30)} <br>
     * @return The value of the column 'BOX_CD'. (NullAllowed)
     */
    public String getBoxCd() {
        return _boxCd;
    }

    /**
     * [set] BOX_CD: {varchar(30)} <br>
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed)
     */
    public void setBoxCd(String boxCd) {
        __modifiedProperties.add("boxCd");
        this._boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {varchar(60)} <br>
     * @return The value of the column 'BOX_NM'. (NullAllowed)
     */
    public String getBoxNm() {
        return _boxNm;
    }

    /**
     * [set] BOX_NM: {varchar(60)} <br>
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed)
     */
    public void setBoxNm(String boxNm) {
        __modifiedProperties.add("boxNm");
        this._boxNm = boxNm;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
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
     * [get] PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] PACKING_NUM_SUM: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_SUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNumSum() {
        return _packingNumSum;
    }

    /**
     * [set] PACKING_NUM_SUM: {decimal(38, 6)} <br>
     * @param packingNumSum The value of the column 'PACKING_NUM_SUM'. (NullAllowed)
     */
    public void setPackingNumSum(java.math.BigDecimal packingNumSum) {
        __modifiedProperties.add("packingNumSum");
        this._packingNumSum = packingNumSum;
    }

    /**
     * [get] DELIV_DT: {varchar(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {varchar(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(30)} <br>
     * @return The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public String getDelivTz() {
        return _delivTz;
    }

    /**
     * [set] DELIV_TZ: {varchar(30)} <br>
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public void setDelivTz(String delivTz) {
        __modifiedProperties.add("delivTz");
        this._delivTz = delivTz;
    }

    /**
     * [get] DELIV_ZIP_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public String getDelivZipCd() {
        return _delivZipCd;
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(30)} <br>
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public void setDelivZipCd(String delivZipCd) {
        __modifiedProperties.add("delivZipCd");
        this._delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public String getDelivTelNo() {
        return _delivTelNo;
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public void setDelivTelNo(String delivTelNo) {
        __modifiedProperties.add("delivTelNo");
        this._delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public String getDelivAddress1() {
        return _delivAddress1;
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public void setDelivAddress1(String delivAddress1) {
        __modifiedProperties.add("delivAddress1");
        this._delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public String getDelivAddress2() {
        return _delivAddress2;
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public void setDelivAddress2(String delivAddress2) {
        __modifiedProperties.add("delivAddress2");
        this._delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public String getDelivAddress3() {
        return _delivAddress3;
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public void setDelivAddress3(String delivAddress3) {
        __modifiedProperties.add("delivAddress3");
        this._delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] PROCESS_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {bigint(19)} <br>
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] PICKING_H_ID: {bigint(19)} <br>
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {bigint(19)} <br>
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public String getShippingPackingNo() {
        return _shippingPackingNo;
    }

    /**
     * [set] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        __modifiedProperties.add("shippingPackingNo");
        this._shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public String getCarrierTraceNum() {
        return _carrierTraceNum;
    }

    /**
     * [set] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        __modifiedProperties.add("carrierTraceNum");
        this._carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] PICKING_NUM_SUM: {decimal(38, 6)} <br>
     * @return The value of the column 'PICKING_NUM_SUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPickingNumSum() {
        return _pickingNumSum;
    }

    /**
     * [set] PICKING_NUM_SUM: {decimal(38, 6)} <br>
     * @param pickingNumSum The value of the column 'PICKING_NUM_SUM'. (NullAllowed)
     */
    public void setPickingNumSum(java.math.BigDecimal pickingNumSum) {
        __modifiedProperties.add("pickingNumSum");
        this._pickingNumSum = pickingNumSum;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] COUNT: {int(10)} <br>
     * @return The value of the column 'COUNT'. (NullAllowed)
     */
    public Long getCount() {
        return _count;
    }

    /**
     * [set] COUNT: {int(10)} <br>
     * @param count The value of the column 'COUNT'. (NullAllowed)
     */
    public void setCount(Long count) {
        __modifiedProperties.add("count");
        this._count = count;
    }

}
