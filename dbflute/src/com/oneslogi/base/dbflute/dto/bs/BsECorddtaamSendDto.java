package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_CORDDTAAM_SEND as TABLE. <br>
 * さしず実績送信テーブル
 * <pre>
 * [primary-key]
 *     CORDDTAAM_SEND_ID
 *
 * [column]
 *     CORDDTAAM_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, DELIVAY_CENTER_CD, DELIVERY_DATETIME, DIRECTION_CD, PISTON_TYPE, CAP_DIRECTION_CD, CAP_PISTON_TYPE, SORT_LINE_CD, SORT_ORDER, CUSTOMER_CD, CUSTOMER_NM, PRODUCT_CD, SLQACB, SLQACT, LINE_BLOCK, LOCATION_NO, LOCATION_TYPE, DELIVERY_PRINT_RANK, DELIVERY_SEQ_NO, DELIVERY_BRANCH_NO, SORT_WORK_DT, CSROPRTCNT, CUTTOPDIRASSORD, PRODUCT_TYPE, BOX_NO, BOX_NO_SEQ_NO, BOX_TYPE, MERGE_BOX_VISIBLE_TYPE, DM_VISIBLE_TYPE, TOTAL_BOX_CNT, BOX_CARTON_SUM, BOX_CARTON_SORT_NUM, TTTOPDEDRNK, LINE_BLOCK_BOX_NO, LINE_BLOCK_TOTAL_BOX_CNT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CORDDTAAM_SEND_ID
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
public abstract class BsECorddtaamSendDto implements Serializable {

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
    /** CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _corddtaamSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _workFlg;

    /** CENTER_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** DELIVAY_CENTER_CD: {varchar(255)} */
    @JsonKey
    protected String _delivayCenterCd;

    /** DELIVERY_DATETIME: {varchar(255)} */
    @JsonKey
    protected String _deliveryDatetime;

    /** DIRECTION_CD: {varchar(255)} */
    @JsonKey
    protected String _directionCd;

    /** PISTON_TYPE: {varchar(255)} */
    @JsonKey
    protected String _pistonType;

    /** CAP_DIRECTION_CD: {varchar(255)} */
    @JsonKey
    protected String _capDirectionCd;

    /** CAP_PISTON_TYPE: {varchar(255)} */
    @JsonKey
    protected String _capPistonType;

    /** SORT_LINE_CD: {varchar(255)} */
    @JsonKey
    protected String _sortLineCd;

    /** SORT_ORDER: {varchar(255)} */
    @JsonKey
    protected String _sortOrder;

    /** CUSTOMER_CD: {varchar(255)} */
    @JsonKey
    protected String _customerCd;

    /** CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _customerNm;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** SLQACB: {varchar(255)} */
    @JsonKey
    protected String _slqacb;

    /** SLQACT: {varchar(255)} */
    @JsonKey
    protected String _slqact;

    /** LINE_BLOCK: {varchar(255)} */
    @JsonKey
    protected String _lineBlock;

    /** LOCATION_NO: {varchar(255)} */
    @JsonKey
    protected String _locationNo;

    /** LOCATION_TYPE: {varchar(255)} */
    @JsonKey
    protected String _locationType;

    /** DELIVERY_PRINT_RANK: {varchar(255)} */
    @JsonKey
    protected String _deliveryPrintRank;

    /** DELIVERY_SEQ_NO: {varchar(255)} */
    @JsonKey
    protected String _deliverySeqNo;

    /** DELIVERY_BRANCH_NO: {varchar(255)} */
    @JsonKey
    protected String _deliveryBranchNo;

    /** SORT_WORK_DT: {varchar(255)} */
    @JsonKey
    protected String _sortWorkDt;

    /** CSROPRTCNT: {varchar(255)} */
    @JsonKey
    protected String _csroprtcnt;

    /** CUTTOPDIRASSORD: {varchar(255)} */
    @JsonKey
    protected String _cuttopdirassord;

    /** PRODUCT_TYPE: {varchar(255)} */
    @JsonKey
    protected String _productType;

    /** BOX_NO: {varchar(255)} */
    @JsonKey
    protected String _boxNo;

    /** BOX_NO_SEQ_NO: {varchar(255)} */
    @JsonKey
    protected String _boxNoSeqNo;

    /** BOX_TYPE: {varchar(255)} */
    @JsonKey
    protected String _boxType;

    /** MERGE_BOX_VISIBLE_TYPE: {varchar(255)} */
    @JsonKey
    protected String _mergeBoxVisibleType;

    /** DM_VISIBLE_TYPE: {varchar(255)} */
    @JsonKey
    protected String _dmVisibleType;

    /** TOTAL_BOX_CNT: {varchar(255)} */
    @JsonKey
    protected String _totalBoxCnt;

    /** BOX_CARTON_SUM: {varchar(255)} */
    @JsonKey
    protected String _boxCartonSum;

    /** BOX_CARTON_SORT_NUM: {varchar(255)} */
    @JsonKey
    protected String _boxCartonSortNum;

    /** TTTOPDEDRNK: {varchar(255)} */
    @JsonKey
    protected String _tttopdedrnk;

    /** LINE_BLOCK_BOX_NO: {varchar(255)} */
    @JsonKey
    protected String _lineBlockBoxNo;

    /** LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)} */
    @JsonKey
    protected String _lineBlockTotalBoxCnt;

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
    public BsECorddtaamSendDto() {
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
        if (other == null || !(other instanceof BsECorddtaamSendDto)) { return false; }
        final BsECorddtaamSendDto otherEntity = (BsECorddtaamSendDto)other;
        if (!helpComparingValue(getCorddtaamSendId(), otherEntity.getCorddtaamSendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_CORDDTAAM_SEND");
        result = xCH(result, getCorddtaamSendId());
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
        sb.append(c).append(getCorddtaamSendId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getDelivayCenterCd());
        sb.append(c).append(getDeliveryDatetime());
        sb.append(c).append(getDirectionCd());
        sb.append(c).append(getPistonType());
        sb.append(c).append(getCapDirectionCd());
        sb.append(c).append(getCapPistonType());
        sb.append(c).append(getSortLineCd());
        sb.append(c).append(getSortOrder());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getSlqacb());
        sb.append(c).append(getSlqact());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getLocationNo());
        sb.append(c).append(getLocationType());
        sb.append(c).append(getDeliveryPrintRank());
        sb.append(c).append(getDeliverySeqNo());
        sb.append(c).append(getDeliveryBranchNo());
        sb.append(c).append(getSortWorkDt());
        sb.append(c).append(getCsroprtcnt());
        sb.append(c).append(getCuttopdirassord());
        sb.append(c).append(getProductType());
        sb.append(c).append(getBoxNo());
        sb.append(c).append(getBoxNoSeqNo());
        sb.append(c).append(getBoxType());
        sb.append(c).append(getMergeBoxVisibleType());
        sb.append(c).append(getDmVisibleType());
        sb.append(c).append(getTotalBoxCnt());
        sb.append(c).append(getBoxCartonSum());
        sb.append(c).append(getBoxCartonSortNum());
        sb.append(c).append(getTttopdedrnk());
        sb.append(c).append(getLineBlockBoxNo());
        sb.append(c).append(getLineBlockTotalBoxCnt());
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
     * [get] CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず実績送信ID
     * @return The value of the column 'CORDDTAAM_SEND_ID'. (NullAllowed)
     */
    public Long getCorddtaamSendId() {
        return _corddtaamSendId;
    }

    /**
     * [set] CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず実績送信ID
     * @param corddtaamSendId The value of the column 'CORDDTAAM_SEND_ID'. (NullAllowed)
     */
    public void setCorddtaamSendId(Long corddtaamSendId) {
        __modifiedProperties.add("corddtaamSendId");
        this._corddtaamSendId = corddtaamSendId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public Long getSendRowId() {
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public void setSendRowId(Long sendRowId) {
        __modifiedProperties.add("sendRowId");
        this._sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] DELIVAY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点CD
     * @return The value of the column 'DELIVAY_CENTER_CD'. (NullAllowed)
     */
    public String getDelivayCenterCd() {
        return _delivayCenterCd;
    }

    /**
     * [set] DELIVAY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点CD
     * @param delivayCenterCd The value of the column 'DELIVAY_CENTER_CD'. (NullAllowed)
     */
    public void setDelivayCenterCd(String delivayCenterCd) {
        __modifiedProperties.add("delivayCenterCd");
        this._delivayCenterCd = delivayCenterCd;
    }

    /**
     * [get] DELIVERY_DATETIME: {varchar(255)} <br>
     * 配達年月日
     * @return The value of the column 'DELIVERY_DATETIME'. (NullAllowed)
     */
    public String getDeliveryDatetime() {
        return _deliveryDatetime;
    }

    /**
     * [set] DELIVERY_DATETIME: {varchar(255)} <br>
     * 配達年月日
     * @param deliveryDatetime The value of the column 'DELIVERY_DATETIME'. (NullAllowed)
     */
    public void setDeliveryDatetime(String deliveryDatetime) {
        __modifiedProperties.add("deliveryDatetime");
        this._deliveryDatetime = deliveryDatetime;
    }

    /**
     * [get] DIRECTION_CD: {varchar(255)} <br>
     * 配達方面
     * @return The value of the column 'DIRECTION_CD'. (NullAllowed)
     */
    public String getDirectionCd() {
        return _directionCd;
    }

    /**
     * [set] DIRECTION_CD: {varchar(255)} <br>
     * 配達方面
     * @param directionCd The value of the column 'DIRECTION_CD'. (NullAllowed)
     */
    public void setDirectionCd(String directionCd) {
        __modifiedProperties.add("directionCd");
        this._directionCd = directionCd;
    }

    /**
     * [get] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTON_TYPE'. (NullAllowed)
     */
    public String getPistonType() {
        return _pistonType;
    }

    /**
     * [set] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @param pistonType The value of the column 'PISTON_TYPE'. (NullAllowed)
     */
    public void setPistonType(String pistonType) {
        __modifiedProperties.add("pistonType");
        this._pistonType = pistonType;
    }

    /**
     * [get] CAP_DIRECTION_CD: {varchar(255)} <br>
     * CAP用配達方面
     * @return The value of the column 'CAP_DIRECTION_CD'. (NullAllowed)
     */
    public String getCapDirectionCd() {
        return _capDirectionCd;
    }

    /**
     * [set] CAP_DIRECTION_CD: {varchar(255)} <br>
     * CAP用配達方面
     * @param capDirectionCd The value of the column 'CAP_DIRECTION_CD'. (NullAllowed)
     */
    public void setCapDirectionCd(String capDirectionCd) {
        __modifiedProperties.add("capDirectionCd");
        this._capDirectionCd = capDirectionCd;
    }

    /**
     * [get] CAP_PISTON_TYPE: {varchar(255)} <br>
     * CAP用ピストン区分
     * @return The value of the column 'CAP_PISTON_TYPE'. (NullAllowed)
     */
    public String getCapPistonType() {
        return _capPistonType;
    }

    /**
     * [set] CAP_PISTON_TYPE: {varchar(255)} <br>
     * CAP用ピストン区分
     * @param capPistonType The value of the column 'CAP_PISTON_TYPE'. (NullAllowed)
     */
    public void setCapPistonType(String capPistonType) {
        __modifiedProperties.add("capPistonType");
        this._capPistonType = capPistonType;
    }

    /**
     * [get] SORT_LINE_CD: {varchar(255)} <br>
     * 仕分ラインCD
     * @return The value of the column 'SORT_LINE_CD'. (NullAllowed)
     */
    public String getSortLineCd() {
        return _sortLineCd;
    }

    /**
     * [set] SORT_LINE_CD: {varchar(255)} <br>
     * 仕分ラインCD
     * @param sortLineCd The value of the column 'SORT_LINE_CD'. (NullAllowed)
     */
    public void setSortLineCd(String sortLineCd) {
        __modifiedProperties.add("sortLineCd");
        this._sortLineCd = sortLineCd;
    }

    /**
     * [get] SORT_ORDER: {varchar(255)} <br>
     * 仕分順
     * @return The value of the column 'SORT_ORDER'. (NullAllowed)
     */
    public String getSortOrder() {
        return _sortOrder;
    }

    /**
     * [set] SORT_ORDER: {varchar(255)} <br>
     * 仕分順
     * @param sortOrder The value of the column 'SORT_ORDER'. (NullAllowed)
     */
    public void setSortOrder(String sortOrder) {
        __modifiedProperties.add("sortOrder");
        this._sortOrder = sortOrder;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {varchar(255)} <br>
     * お得意様名
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {varchar(255)} <br>
     * お得意様名
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
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
     * [get] SLQACB: {varchar(255)} <br>
     * 販売数量(ケース)
     * @return The value of the column 'SLQACB'. (NullAllowed)
     */
    public String getSlqacb() {
        return _slqacb;
    }

    /**
     * [set] SLQACB: {varchar(255)} <br>
     * 販売数量(ケース)
     * @param slqacb The value of the column 'SLQACB'. (NullAllowed)
     */
    public void setSlqacb(String slqacb) {
        __modifiedProperties.add("slqacb");
        this._slqacb = slqacb;
    }

    /**
     * [get] SLQACT: {varchar(255)} <br>
     * 販売数量(カートン)
     * @return The value of the column 'SLQACT'. (NullAllowed)
     */
    public String getSlqact() {
        return _slqact;
    }

    /**
     * [set] SLQACT: {varchar(255)} <br>
     * 販売数量(カートン)
     * @param slqact The value of the column 'SLQACT'. (NullAllowed)
     */
    public void setSlqact(String slqact) {
        __modifiedProperties.add("slqact");
        this._slqact = slqact;
    }

    /**
     * [get] LINE_BLOCK: {varchar(255)} <br>
     * ライン/ブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(255)} <br>
     * ライン/ブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] LOCATION_NO: {varchar(255)} <br>
     * ロケーションNo.
     * @return The value of the column 'LOCATION_NO'. (NullAllowed)
     */
    public String getLocationNo() {
        return _locationNo;
    }

    /**
     * [set] LOCATION_NO: {varchar(255)} <br>
     * ロケーションNo.
     * @param locationNo The value of the column 'LOCATION_NO'. (NullAllowed)
     */
    public void setLocationNo(String locationNo) {
        __modifiedProperties.add("locationNo");
        this._locationNo = locationNo;
    }

    /**
     * [get] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public String getLocationType() {
        return _locationType;
    }

    /**
     * [set] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション区分
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public void setLocationType(String locationType) {
        __modifiedProperties.add("locationType");
        this._locationType = locationType;
    }

    /**
     * [get] DELIVERY_PRINT_RANK: {varchar(255)} <br>
     * 配達通番印刷順
     * @return The value of the column 'DELIVERY_PRINT_RANK'. (NullAllowed)
     */
    public String getDeliveryPrintRank() {
        return _deliveryPrintRank;
    }

    /**
     * [set] DELIVERY_PRINT_RANK: {varchar(255)} <br>
     * 配達通番印刷順
     * @param deliveryPrintRank The value of the column 'DELIVERY_PRINT_RANK'. (NullAllowed)
     */
    public void setDeliveryPrintRank(String deliveryPrintRank) {
        __modifiedProperties.add("deliveryPrintRank");
        this._deliveryPrintRank = deliveryPrintRank;
    }

    /**
     * [get] DELIVERY_SEQ_NO: {varchar(255)} <br>
     * 配達通番
     * @return The value of the column 'DELIVERY_SEQ_NO'. (NullAllowed)
     */
    public String getDeliverySeqNo() {
        return _deliverySeqNo;
    }

    /**
     * [set] DELIVERY_SEQ_NO: {varchar(255)} <br>
     * 配達通番
     * @param deliverySeqNo The value of the column 'DELIVERY_SEQ_NO'. (NullAllowed)
     */
    public void setDeliverySeqNo(String deliverySeqNo) {
        __modifiedProperties.add("deliverySeqNo");
        this._deliverySeqNo = deliverySeqNo;
    }

    /**
     * [get] DELIVERY_BRANCH_NO: {varchar(255)} <br>
     * 配達通番枝番
     * @return The value of the column 'DELIVERY_BRANCH_NO'. (NullAllowed)
     */
    public String getDeliveryBranchNo() {
        return _deliveryBranchNo;
    }

    /**
     * [set] DELIVERY_BRANCH_NO: {varchar(255)} <br>
     * 配達通番枝番
     * @param deliveryBranchNo The value of the column 'DELIVERY_BRANCH_NO'. (NullAllowed)
     */
    public void setDeliveryBranchNo(String deliveryBranchNo) {
        __modifiedProperties.add("deliveryBranchNo");
        this._deliveryBranchNo = deliveryBranchNo;
    }

    /**
     * [get] SORT_WORK_DT: {varchar(255)} <br>
     * 仕分作業回数
     * @return The value of the column 'SORT_WORK_DT'. (NullAllowed)
     */
    public String getSortWorkDt() {
        return _sortWorkDt;
    }

    /**
     * [set] SORT_WORK_DT: {varchar(255)} <br>
     * 仕分作業回数
     * @param sortWorkDt The value of the column 'SORT_WORK_DT'. (NullAllowed)
     */
    public void setSortWorkDt(String sortWorkDt) {
        __modifiedProperties.add("sortWorkDt");
        this._sortWorkDt = sortWorkDt;
    }

    /**
     * [get] CSROPRTCNT: {varchar(255)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'CSROPRTCNT'. (NullAllowed)
     */
    public String getCsroprtcnt() {
        return _csroprtcnt;
    }

    /**
     * [set] CSROPRTCNT: {varchar(255)} <br>
     * 今回仕分作業回数
     * @param csroprtcnt The value of the column 'CSROPRTCNT'. (NullAllowed)
     */
    public void setCsroprtcnt(String csroprtcnt) {
        __modifiedProperties.add("csroprtcnt");
        this._csroprtcnt = csroprtcnt;
    }

    /**
     * [get] CUTTOPDIRASSORD: {varchar(255)} <br>
     * 今回先頭方面仕分順
     * @return The value of the column 'CUTTOPDIRASSORD'. (NullAllowed)
     */
    public String getCuttopdirassord() {
        return _cuttopdirassord;
    }

    /**
     * [set] CUTTOPDIRASSORD: {varchar(255)} <br>
     * 今回先頭方面仕分順
     * @param cuttopdirassord The value of the column 'CUTTOPDIRASSORD'. (NullAllowed)
     */
    public void setCuttopdirassord(String cuttopdirassord) {
        __modifiedProperties.add("cuttopdirassord");
        this._cuttopdirassord = cuttopdirassord;
    }

    /**
     * [get] PRODUCT_TYPE: {varchar(255)} <br>
     * 商品タイプ
     * @return The value of the column 'PRODUCT_TYPE'. (NullAllowed)
     */
    public String getProductType() {
        return _productType;
    }

    /**
     * [set] PRODUCT_TYPE: {varchar(255)} <br>
     * 商品タイプ
     * @param productType The value of the column 'PRODUCT_TYPE'. (NullAllowed)
     */
    public void setProductType(String productType) {
        __modifiedProperties.add("productType");
        this._productType = productType;
    }

    /**
     * [get] BOX_NO: {varchar(255)} <br>
     * 箱No.
     * @return The value of the column 'BOX_NO'. (NullAllowed)
     */
    public String getBoxNo() {
        return _boxNo;
    }

    /**
     * [set] BOX_NO: {varchar(255)} <br>
     * 箱No.
     * @param boxNo The value of the column 'BOX_NO'. (NullAllowed)
     */
    public void setBoxNo(String boxNo) {
        __modifiedProperties.add("boxNo");
        this._boxNo = boxNo;
    }

    /**
     * [get] BOX_NO_SEQ_NO: {varchar(255)} <br>
     * 箱No.(通番)
     * @return The value of the column 'BOX_NO_SEQ_NO'. (NullAllowed)
     */
    public String getBoxNoSeqNo() {
        return _boxNoSeqNo;
    }

    /**
     * [set] BOX_NO_SEQ_NO: {varchar(255)} <br>
     * 箱No.(通番)
     * @param boxNoSeqNo The value of the column 'BOX_NO_SEQ_NO'. (NullAllowed)
     */
    public void setBoxNoSeqNo(String boxNoSeqNo) {
        __modifiedProperties.add("boxNoSeqNo");
        this._boxNoSeqNo = boxNoSeqNo;
    }

    /**
     * [get] BOX_TYPE: {varchar(255)} <br>
     * 箱タイプ
     * @return The value of the column 'BOX_TYPE'. (NullAllowed)
     */
    public String getBoxType() {
        return _boxType;
    }

    /**
     * [set] BOX_TYPE: {varchar(255)} <br>
     * 箱タイプ
     * @param boxType The value of the column 'BOX_TYPE'. (NullAllowed)
     */
    public void setBoxType(String boxType) {
        __modifiedProperties.add("boxType");
        this._boxType = boxType;
    }

    /**
     * [get] MERGE_BOX_VISIBLE_TYPE: {varchar(255)} <br>
     * マージ箱表示区分
     * @return The value of the column 'MERGE_BOX_VISIBLE_TYPE'. (NullAllowed)
     */
    public String getMergeBoxVisibleType() {
        return _mergeBoxVisibleType;
    }

    /**
     * [set] MERGE_BOX_VISIBLE_TYPE: {varchar(255)} <br>
     * マージ箱表示区分
     * @param mergeBoxVisibleType The value of the column 'MERGE_BOX_VISIBLE_TYPE'. (NullAllowed)
     */
    public void setMergeBoxVisibleType(String mergeBoxVisibleType) {
        __modifiedProperties.add("mergeBoxVisibleType");
        this._mergeBoxVisibleType = mergeBoxVisibleType;
    }

    /**
     * [get] DM_VISIBLE_TYPE: {varchar(255)} <br>
     * DM表示区分
     * @return The value of the column 'DM_VISIBLE_TYPE'. (NullAllowed)
     */
    public String getDmVisibleType() {
        return _dmVisibleType;
    }

    /**
     * [set] DM_VISIBLE_TYPE: {varchar(255)} <br>
     * DM表示区分
     * @param dmVisibleType The value of the column 'DM_VISIBLE_TYPE'. (NullAllowed)
     */
    public void setDmVisibleType(String dmVisibleType) {
        __modifiedProperties.add("dmVisibleType");
        this._dmVisibleType = dmVisibleType;
    }

    /**
     * [get] TOTAL_BOX_CNT: {varchar(255)} <br>
     * トータル箱数
     * @return The value of the column 'TOTAL_BOX_CNT'. (NullAllowed)
     */
    public String getTotalBoxCnt() {
        return _totalBoxCnt;
    }

    /**
     * [set] TOTAL_BOX_CNT: {varchar(255)} <br>
     * トータル箱数
     * @param totalBoxCnt The value of the column 'TOTAL_BOX_CNT'. (NullAllowed)
     */
    public void setTotalBoxCnt(String totalBoxCnt) {
        __modifiedProperties.add("totalBoxCnt");
        this._totalBoxCnt = totalBoxCnt;
    }

    /**
     * [get] BOX_CARTON_SUM: {varchar(255)} <br>
     * 箱内カートン数(総量)
     * @return The value of the column 'BOX_CARTON_SUM'. (NullAllowed)
     */
    public String getBoxCartonSum() {
        return _boxCartonSum;
    }

    /**
     * [set] BOX_CARTON_SUM: {varchar(255)} <br>
     * 箱内カートン数(総量)
     * @param boxCartonSum The value of the column 'BOX_CARTON_SUM'. (NullAllowed)
     */
    public void setBoxCartonSum(String boxCartonSum) {
        __modifiedProperties.add("boxCartonSum");
        this._boxCartonSum = boxCartonSum;
    }

    /**
     * [get] BOX_CARTON_SORT_NUM: {varchar(255)} <br>
     * 箱内カートン数(該当仕分場分)
     * @return The value of the column 'BOX_CARTON_SORT_NUM'. (NullAllowed)
     */
    public String getBoxCartonSortNum() {
        return _boxCartonSortNum;
    }

    /**
     * [set] BOX_CARTON_SORT_NUM: {varchar(255)} <br>
     * 箱内カートン数(該当仕分場分)
     * @param boxCartonSortNum The value of the column 'BOX_CARTON_SORT_NUM'. (NullAllowed)
     */
    public void setBoxCartonSortNum(String boxCartonSortNum) {
        __modifiedProperties.add("boxCartonSortNum");
        this._boxCartonSortNum = boxCartonSortNum;
    }

    /**
     * [get] TTTOPDEDRNK: {varchar(255)} <br>
     * 方面先頭個口区分
     * @return The value of the column 'TTTOPDEDRNK'. (NullAllowed)
     */
    public String getTttopdedrnk() {
        return _tttopdedrnk;
    }

    /**
     * [set] TTTOPDEDRNK: {varchar(255)} <br>
     * 方面先頭個口区分
     * @param tttopdedrnk The value of the column 'TTTOPDEDRNK'. (NullAllowed)
     */
    public void setTttopdedrnk(String tttopdedrnk) {
        __modifiedProperties.add("tttopdedrnk");
        this._tttopdedrnk = tttopdedrnk;
    }

    /**
     * [get] LINE_BLOCK_BOX_NO: {varchar(255)} <br>
     * ライン/ブロック箱No
     * @return The value of the column 'LINE_BLOCK_BOX_NO'. (NullAllowed)
     */
    public String getLineBlockBoxNo() {
        return _lineBlockBoxNo;
    }

    /**
     * [set] LINE_BLOCK_BOX_NO: {varchar(255)} <br>
     * ライン/ブロック箱No
     * @param lineBlockBoxNo The value of the column 'LINE_BLOCK_BOX_NO'. (NullAllowed)
     */
    public void setLineBlockBoxNo(String lineBlockBoxNo) {
        __modifiedProperties.add("lineBlockBoxNo");
        this._lineBlockBoxNo = lineBlockBoxNo;
    }

    /**
     * [get] LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)} <br>
     * ライン/ブロックトータル箱数
     * @return The value of the column 'LINE_BLOCK_TOTAL_BOX_CNT'. (NullAllowed)
     */
    public String getLineBlockTotalBoxCnt() {
        return _lineBlockTotalBoxCnt;
    }

    /**
     * [set] LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)} <br>
     * ライン/ブロックトータル箱数
     * @param lineBlockTotalBoxCnt The value of the column 'LINE_BLOCK_TOTAL_BOX_CNT'. (NullAllowed)
     */
    public void setLineBlockTotalBoxCnt(String lineBlockTotalBoxCnt) {
        __modifiedProperties.add("lineBlockTotalBoxCnt");
        this._lineBlockTotalBoxCnt = lineBlockTotalBoxCnt;
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
