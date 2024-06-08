package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CENTER_CUSTOMER as TABLE. <br>
 * 拠点取引先マスタ
 * <pre>
 * [primary-key]
 *     CENTER_CUSTOMER_ID
 *
 * [column]
 *     CENTER_CUSTOMER_ID, CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID, DELIVERY_ORDER, DELIVERY_READ_TIME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CUSTOMER, M_DELIVERY_COURSE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     T_ALLOC_INST_H
 *
 * [foreign-property]
 *     mCenter, mCustomer, mDeliveryCourse, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     tAllocInstHByDelivCustomerIdList, tAllocInstHBySupplyCustomerIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCenterCustomerDto implements Serializable {

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
    /** CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _centerCustomerId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _customerId;

    /** DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** DELIVERY_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _deliveryOrder;

    /** DELIVERY_READ_TIME: {bigint(19)} */
    @JsonKey
    protected Long _deliveryReadTime;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
    public BsMCenterCustomerDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected MDeliveryCourseDto _mDeliveryCourse;

    public MDeliveryCourseDto getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    public void setMDeliveryCourse(MDeliveryCourseDto mDeliveryCourse) {
        this._mDeliveryCourse = mDeliveryCourse;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TAllocInstHDto> _tAllocInstHByDelivCustomerIdList;

    public List<TAllocInstHDto> getTAllocInstHByDelivCustomerIdList() {
        if (_tAllocInstHByDelivCustomerIdList == null) { _tAllocInstHByDelivCustomerIdList = new ArrayList<TAllocInstHDto>(); }
        return _tAllocInstHByDelivCustomerIdList;
    }

    public void setTAllocInstHByDelivCustomerIdList(List<TAllocInstHDto> tAllocInstHByDelivCustomerIdList) {
        this._tAllocInstHByDelivCustomerIdList = tAllocInstHByDelivCustomerIdList;
    }

    protected List<TAllocInstHDto> _tAllocInstHBySupplyCustomerIdList;

    public List<TAllocInstHDto> getTAllocInstHBySupplyCustomerIdList() {
        if (_tAllocInstHBySupplyCustomerIdList == null) { _tAllocInstHBySupplyCustomerIdList = new ArrayList<TAllocInstHDto>(); }
        return _tAllocInstHBySupplyCustomerIdList;
    }

    public void setTAllocInstHBySupplyCustomerIdList(List<TAllocInstHDto> tAllocInstHBySupplyCustomerIdList) {
        this._tAllocInstHBySupplyCustomerIdList = tAllocInstHBySupplyCustomerIdList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCenterCustomerDto)) { return false; }
        final BsMCenterCustomerDto otherEntity = (BsMCenterCustomerDto)other;
        if (!helpComparingValue(getCenterCustomerId(), otherEntity.getCenterCustomerId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CENTER_CUSTOMER");
        result = xCH(result, getCenterCustomerId());
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
        sb.append(c).append(getCenterCustomerId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCustomerId());
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getDeliveryOrder());
        sb.append(c).append(getDeliveryReadTime());
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
     * [get] CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点取引先ID
     * @return The value of the column 'CENTER_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCenterCustomerId() {
        return _centerCustomerId;
    }

    /**
     * [set] CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点取引先ID
     * @param centerCustomerId The value of the column 'CENTER_CUSTOMER_ID'. (NullAllowed)
     */
    public void setCenterCustomerId(Long centerCustomerId) {
        __modifiedProperties.add("centerCustomerId");
        this._centerCustomerId = centerCustomerId;
    }

    /**
     * [get] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER} <br>
     * 取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER} <br>
     * 取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(Long customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_ORDER: {bigint(19)} <br>
     * 配送順
     * @return The value of the column 'DELIVERY_ORDER'. (NullAllowed)
     */
    public Long getDeliveryOrder() {
        return _deliveryOrder;
    }

    /**
     * [set] DELIVERY_ORDER: {bigint(19)} <br>
     * 配送順
     * @param deliveryOrder The value of the column 'DELIVERY_ORDER'. (NullAllowed)
     */
    public void setDeliveryOrder(Long deliveryOrder) {
        __modifiedProperties.add("deliveryOrder");
        this._deliveryOrder = deliveryOrder;
    }

    /**
     * [get] DELIVERY_READ_TIME: {bigint(19)} <br>
     * 配送リードタイム
     * @return The value of the column 'DELIVERY_READ_TIME'. (NullAllowed)
     */
    public Long getDeliveryReadTime() {
        return _deliveryReadTime;
    }

    /**
     * [set] DELIVERY_READ_TIME: {bigint(19)} <br>
     * 配送リードタイム
     * @param deliveryReadTime The value of the column 'DELIVERY_READ_TIME'. (NullAllowed)
     */
    public void setDeliveryReadTime(Long deliveryReadTime) {
        __modifiedProperties.add("deliveryReadTime");
        this._deliveryReadTime = deliveryReadTime;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
