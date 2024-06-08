package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlReceiveDataList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     receive_plan_h_id, receive_plan_b_id, receive_status, product_id, product_cd, plan_lot, plan_limit_dt, plan_location_cd, plan_store_label_no, plan_num, store_record_h_id, store_record_b_id, lot, limit_dt, store_dt, store_num, store_location_cd, product_nm, product_abbr, jan_cd, receive_status_nm, receive_plan_dt, plan_client_receive_no, receive_slip_no, line_no, center_id, client_id, plan_supplier_cd, store_supplier_cd
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
public abstract class BsSqlReceiveDataListDto implements Serializable {

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
    /** receive_plan_h_id: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** receive_plan_b_id: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanBId;

    /** receive_status: {varchar(30)} */
    @JsonKey
    protected String _receiveStatus;

    /** product_id: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** product_cd: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** plan_lot: {varchar(30)} */
    @JsonKey
    protected String _planLot;

    /** plan_limit_dt: {varchar(8)} */
    @JsonKey
    protected String _planLimitDt;

    /** plan_location_cd: {varchar(30)} */
    @JsonKey
    protected String _planLocationCd;

    /** plan_store_label_no: {varchar(30)} */
    @JsonKey
    protected String _planStoreLabelNo;

    /** plan_num: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _planNum;

    /** store_record_h_id: {bigint(19)} */
    @JsonKey
    protected Long _storeRecordHId;

    /** store_record_b_id: {bigint(19)} */
    @JsonKey
    protected Long _storeRecordBId;

    /** lot: {varchar(30)} */
    @JsonKey
    protected String _lot;

    /** limit_dt: {varchar(8)} */
    @JsonKey
    protected String _limitDt;

    /** store_dt: {varchar(8)} */
    @JsonKey
    protected String _storeDt;

    /** store_num: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _storeNum;

    /** store_location_cd: {varchar(30)} */
    @JsonKey
    protected String _storeLocationCd;

    /** product_nm: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** product_abbr: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** jan_cd: {varchar(30)} */
    @JsonKey
    protected String _janCd;

    /** receive_status_nm: {varchar(100)} */
    @JsonKey
    protected String _receiveStatusNm;

    /** receive_plan_dt: {varchar(8)} */
    @JsonKey
    protected String _receivePlanDt;

    /** plan_client_receive_no: {varchar(30)} */
    @JsonKey
    protected String _planClientReceiveNo;

    /** receive_slip_no: {varchar(30)} */
    @JsonKey
    protected String _receiveSlipNo;

    /** line_no: {bigint(19)} */
    @JsonKey
    protected Long _lineNo;

    /** center_id: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** client_id: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** plan_supplier_cd: {varchar(30)} */
    @JsonKey
    protected String _planSupplierCd;

    /** store_supplier_cd: {varchar(30)} */
    @JsonKey
    protected String _storeSupplierCd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlReceiveDataListDto() {
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
        if (other == null || !(other instanceof BsSqlReceiveDataListDto)) { return false; }
        final BsSqlReceiveDataListDto otherEntity = (BsSqlReceiveDataListDto)other;
        if (!helpComparingValue(getReceivePlanHId(), otherEntity.getReceivePlanHId())) { return false; }
        if (!helpComparingValue(getReceivePlanBId(), otherEntity.getReceivePlanBId())) { return false; }
        if (!helpComparingValue(getReceiveStatus(), otherEntity.getReceiveStatus())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getPlanLot(), otherEntity.getPlanLot())) { return false; }
        if (!helpComparingValue(getPlanLimitDt(), otherEntity.getPlanLimitDt())) { return false; }
        if (!helpComparingValue(getPlanLocationCd(), otherEntity.getPlanLocationCd())) { return false; }
        if (!helpComparingValue(getPlanStoreLabelNo(), otherEntity.getPlanStoreLabelNo())) { return false; }
        if (!helpComparingValue(getPlanNum(), otherEntity.getPlanNum())) { return false; }
        if (!helpComparingValue(getStoreRecordHId(), otherEntity.getStoreRecordHId())) { return false; }
        if (!helpComparingValue(getStoreRecordBId(), otherEntity.getStoreRecordBId())) { return false; }
        if (!helpComparingValue(getLot(), otherEntity.getLot())) { return false; }
        if (!helpComparingValue(getLimitDt(), otherEntity.getLimitDt())) { return false; }
        if (!helpComparingValue(getStoreDt(), otherEntity.getStoreDt())) { return false; }
        if (!helpComparingValue(getStoreNum(), otherEntity.getStoreNum())) { return false; }
        if (!helpComparingValue(getStoreLocationCd(), otherEntity.getStoreLocationCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getJanCd(), otherEntity.getJanCd())) { return false; }
        if (!helpComparingValue(getReceiveStatusNm(), otherEntity.getReceiveStatusNm())) { return false; }
        if (!helpComparingValue(getReceivePlanDt(), otherEntity.getReceivePlanDt())) { return false; }
        if (!helpComparingValue(getPlanClientReceiveNo(), otherEntity.getPlanClientReceiveNo())) { return false; }
        if (!helpComparingValue(getReceiveSlipNo(), otherEntity.getReceiveSlipNo())) { return false; }
        if (!helpComparingValue(getLineNo(), otherEntity.getLineNo())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getPlanSupplierCd(), otherEntity.getPlanSupplierCd())) { return false; }
        if (!helpComparingValue(getStoreSupplierCd(), otherEntity.getStoreSupplierCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlReceiveDataList");
        result = xCH(result, getReceivePlanHId());
        result = xCH(result, getReceivePlanBId());
        result = xCH(result, getReceiveStatus());
        result = xCH(result, getProductId());
        result = xCH(result, getProductCd());
        result = xCH(result, getPlanLot());
        result = xCH(result, getPlanLimitDt());
        result = xCH(result, getPlanLocationCd());
        result = xCH(result, getPlanStoreLabelNo());
        result = xCH(result, getPlanNum());
        result = xCH(result, getStoreRecordHId());
        result = xCH(result, getStoreRecordBId());
        result = xCH(result, getLot());
        result = xCH(result, getLimitDt());
        result = xCH(result, getStoreDt());
        result = xCH(result, getStoreNum());
        result = xCH(result, getStoreLocationCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getJanCd());
        result = xCH(result, getReceiveStatusNm());
        result = xCH(result, getReceivePlanDt());
        result = xCH(result, getPlanClientReceiveNo());
        result = xCH(result, getReceiveSlipNo());
        result = xCH(result, getLineNo());
        result = xCH(result, getCenterId());
        result = xCH(result, getClientId());
        result = xCH(result, getPlanSupplierCd());
        result = xCH(result, getStoreSupplierCd());
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
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getReceivePlanBId());
        sb.append(c).append(getReceiveStatus());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getPlanLot());
        sb.append(c).append(getPlanLimitDt());
        sb.append(c).append(getPlanLocationCd());
        sb.append(c).append(getPlanStoreLabelNo());
        sb.append(c).append(getPlanNum());
        sb.append(c).append(getStoreRecordHId());
        sb.append(c).append(getStoreRecordBId());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getStoreNum());
        sb.append(c).append(getStoreLocationCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getReceiveStatusNm());
        sb.append(c).append(getReceivePlanDt());
        sb.append(c).append(getPlanClientReceiveNo());
        sb.append(c).append(getReceiveSlipNo());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getPlanSupplierCd());
        sb.append(c).append(getStoreSupplierCd());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] receive_plan_h_id: {bigint(19)} <br>
     * @return The value of the column 'receive_plan_h_id'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] receive_plan_h_id: {bigint(19)} <br>
     * @param receivePlanHId The value of the column 'receive_plan_h_id'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] receive_plan_b_id: {bigint(19)} <br>
     * @return The value of the column 'receive_plan_b_id'. (NullAllowed)
     */
    public Long getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] receive_plan_b_id: {bigint(19)} <br>
     * @param receivePlanBId The value of the column 'receive_plan_b_id'. (NullAllowed)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
    }

    /**
     * [get] receive_status: {varchar(30)} <br>
     * @return The value of the column 'receive_status'. (NullAllowed)
     */
    public String getReceiveStatus() {
        return _receiveStatus;
    }

    /**
     * [set] receive_status: {varchar(30)} <br>
     * @param receiveStatus The value of the column 'receive_status'. (NullAllowed)
     */
    public void setReceiveStatus(String receiveStatus) {
        __modifiedProperties.add("receiveStatus");
        this._receiveStatus = receiveStatus;
    }

    /**
     * [get] product_id: {bigint(19)} <br>
     * @return The value of the column 'product_id'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] product_id: {bigint(19)} <br>
     * @param productId The value of the column 'product_id'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] product_cd: {varchar(100)} <br>
     * @return The value of the column 'product_cd'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] product_cd: {varchar(100)} <br>
     * @param productCd The value of the column 'product_cd'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] plan_lot: {varchar(30)} <br>
     * @return The value of the column 'plan_lot'. (NullAllowed)
     */
    public String getPlanLot() {
        return _planLot;
    }

    /**
     * [set] plan_lot: {varchar(30)} <br>
     * @param planLot The value of the column 'plan_lot'. (NullAllowed)
     */
    public void setPlanLot(String planLot) {
        __modifiedProperties.add("planLot");
        this._planLot = planLot;
    }

    /**
     * [get] plan_limit_dt: {varchar(8)} <br>
     * @return The value of the column 'plan_limit_dt'. (NullAllowed)
     */
    public String getPlanLimitDt() {
        return _planLimitDt;
    }

    /**
     * [set] plan_limit_dt: {varchar(8)} <br>
     * @param planLimitDt The value of the column 'plan_limit_dt'. (NullAllowed)
     */
    public void setPlanLimitDt(String planLimitDt) {
        __modifiedProperties.add("planLimitDt");
        this._planLimitDt = planLimitDt;
    }

    /**
     * [get] plan_location_cd: {varchar(30)} <br>
     * @return The value of the column 'plan_location_cd'. (NullAllowed)
     */
    public String getPlanLocationCd() {
        return _planLocationCd;
    }

    /**
     * [set] plan_location_cd: {varchar(30)} <br>
     * @param planLocationCd The value of the column 'plan_location_cd'. (NullAllowed)
     */
    public void setPlanLocationCd(String planLocationCd) {
        __modifiedProperties.add("planLocationCd");
        this._planLocationCd = planLocationCd;
    }

    /**
     * [get] plan_store_label_no: {varchar(30)} <br>
     * @return The value of the column 'plan_store_label_no'. (NullAllowed)
     */
    public String getPlanStoreLabelNo() {
        return _planStoreLabelNo;
    }

    /**
     * [set] plan_store_label_no: {varchar(30)} <br>
     * @param planStoreLabelNo The value of the column 'plan_store_label_no'. (NullAllowed)
     */
    public void setPlanStoreLabelNo(String planStoreLabelNo) {
        __modifiedProperties.add("planStoreLabelNo");
        this._planStoreLabelNo = planStoreLabelNo;
    }

    /**
     * [get] plan_num: {decimal(16, 6)} <br>
     * @return The value of the column 'plan_num'. (NullAllowed)
     */
    public java.math.BigDecimal getPlanNum() {
        return _planNum;
    }

    /**
     * [set] plan_num: {decimal(16, 6)} <br>
     * @param planNum The value of the column 'plan_num'. (NullAllowed)
     */
    public void setPlanNum(java.math.BigDecimal planNum) {
        __modifiedProperties.add("planNum");
        this._planNum = planNum;
    }

    /**
     * [get] store_record_h_id: {bigint(19)} <br>
     * @return The value of the column 'store_record_h_id'. (NullAllowed)
     */
    public Long getStoreRecordHId() {
        return _storeRecordHId;
    }

    /**
     * [set] store_record_h_id: {bigint(19)} <br>
     * @param storeRecordHId The value of the column 'store_record_h_id'. (NullAllowed)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        __modifiedProperties.add("storeRecordHId");
        this._storeRecordHId = storeRecordHId;
    }

    /**
     * [get] store_record_b_id: {bigint(19)} <br>
     * @return The value of the column 'store_record_b_id'. (NullAllowed)
     */
    public Long getStoreRecordBId() {
        return _storeRecordBId;
    }

    /**
     * [set] store_record_b_id: {bigint(19)} <br>
     * @param storeRecordBId The value of the column 'store_record_b_id'. (NullAllowed)
     */
    public void setStoreRecordBId(Long storeRecordBId) {
        __modifiedProperties.add("storeRecordBId");
        this._storeRecordBId = storeRecordBId;
    }

    /**
     * [get] lot: {varchar(30)} <br>
     * @return The value of the column 'lot'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] lot: {varchar(30)} <br>
     * @param lot The value of the column 'lot'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] limit_dt: {varchar(8)} <br>
     * @return The value of the column 'limit_dt'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] limit_dt: {varchar(8)} <br>
     * @param limitDt The value of the column 'limit_dt'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] store_dt: {varchar(8)} <br>
     * @return The value of the column 'store_dt'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] store_dt: {varchar(8)} <br>
     * @param storeDt The value of the column 'store_dt'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] store_num: {decimal(16, 6)} <br>
     * @return The value of the column 'store_num'. (NullAllowed)
     */
    public java.math.BigDecimal getStoreNum() {
        return _storeNum;
    }

    /**
     * [set] store_num: {decimal(16, 6)} <br>
     * @param storeNum The value of the column 'store_num'. (NullAllowed)
     */
    public void setStoreNum(java.math.BigDecimal storeNum) {
        __modifiedProperties.add("storeNum");
        this._storeNum = storeNum;
    }

    /**
     * [get] store_location_cd: {varchar(30)} <br>
     * @return The value of the column 'store_location_cd'. (NullAllowed)
     */
    public String getStoreLocationCd() {
        return _storeLocationCd;
    }

    /**
     * [set] store_location_cd: {varchar(30)} <br>
     * @param storeLocationCd The value of the column 'store_location_cd'. (NullAllowed)
     */
    public void setStoreLocationCd(String storeLocationCd) {
        __modifiedProperties.add("storeLocationCd");
        this._storeLocationCd = storeLocationCd;
    }

    /**
     * [get] product_nm: {varchar(255)} <br>
     * @return The value of the column 'product_nm'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] product_nm: {varchar(255)} <br>
     * @param productNm The value of the column 'product_nm'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] product_abbr: {varchar(60)} <br>
     * @return The value of the column 'product_abbr'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] product_abbr: {varchar(60)} <br>
     * @param productAbbr The value of the column 'product_abbr'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] jan_cd: {varchar(30)} <br>
     * @return The value of the column 'jan_cd'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] jan_cd: {varchar(30)} <br>
     * @param janCd The value of the column 'jan_cd'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] receive_status_nm: {varchar(100)} <br>
     * @return The value of the column 'receive_status_nm'. (NullAllowed)
     */
    public String getReceiveStatusNm() {
        return _receiveStatusNm;
    }

    /**
     * [set] receive_status_nm: {varchar(100)} <br>
     * @param receiveStatusNm The value of the column 'receive_status_nm'. (NullAllowed)
     */
    public void setReceiveStatusNm(String receiveStatusNm) {
        __modifiedProperties.add("receiveStatusNm");
        this._receiveStatusNm = receiveStatusNm;
    }

    /**
     * [get] receive_plan_dt: {varchar(8)} <br>
     * @return The value of the column 'receive_plan_dt'. (NullAllowed)
     */
    public String getReceivePlanDt() {
        return _receivePlanDt;
    }

    /**
     * [set] receive_plan_dt: {varchar(8)} <br>
     * @param receivePlanDt The value of the column 'receive_plan_dt'. (NullAllowed)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        __modifiedProperties.add("receivePlanDt");
        this._receivePlanDt = receivePlanDt;
    }

    /**
     * [get] plan_client_receive_no: {varchar(30)} <br>
     * @return The value of the column 'plan_client_receive_no'. (NullAllowed)
     */
    public String getPlanClientReceiveNo() {
        return _planClientReceiveNo;
    }

    /**
     * [set] plan_client_receive_no: {varchar(30)} <br>
     * @param planClientReceiveNo The value of the column 'plan_client_receive_no'. (NullAllowed)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        __modifiedProperties.add("planClientReceiveNo");
        this._planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] receive_slip_no: {varchar(30)} <br>
     * @return The value of the column 'receive_slip_no'. (NullAllowed)
     */
    public String getReceiveSlipNo() {
        return _receiveSlipNo;
    }

    /**
     * [set] receive_slip_no: {varchar(30)} <br>
     * @param receiveSlipNo The value of the column 'receive_slip_no'. (NullAllowed)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        __modifiedProperties.add("receiveSlipNo");
        this._receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] line_no: {bigint(19)} <br>
     * @return The value of the column 'line_no'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] line_no: {bigint(19)} <br>
     * @param lineNo The value of the column 'line_no'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] center_id: {bigint(19)} <br>
     * @return The value of the column 'center_id'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] center_id: {bigint(19)} <br>
     * @param centerId The value of the column 'center_id'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] client_id: {bigint(19)} <br>
     * @return The value of the column 'client_id'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] client_id: {bigint(19)} <br>
     * @param clientId The value of the column 'client_id'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] plan_supplier_cd: {varchar(30)} <br>
     * @return The value of the column 'plan_supplier_cd'. (NullAllowed)
     */
    public String getPlanSupplierCd() {
        return _planSupplierCd;
    }

    /**
     * [set] plan_supplier_cd: {varchar(30)} <br>
     * @param planSupplierCd The value of the column 'plan_supplier_cd'. (NullAllowed)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        __modifiedProperties.add("planSupplierCd");
        this._planSupplierCd = planSupplierCd;
    }

    /**
     * [get] store_supplier_cd: {varchar(30)} <br>
     * @return The value of the column 'store_supplier_cd'. (NullAllowed)
     */
    public String getStoreSupplierCd() {
        return _storeSupplierCd;
    }

    /**
     * [set] store_supplier_cd: {varchar(30)} <br>
     * @param storeSupplierCd The value of the column 'store_supplier_cd'. (NullAllowed)
     */
    public void setStoreSupplierCd(String storeSupplierCd) {
        __modifiedProperties.add("storeSupplierCd");
        this._storeSupplierCd = storeSupplierCd;
    }

}
