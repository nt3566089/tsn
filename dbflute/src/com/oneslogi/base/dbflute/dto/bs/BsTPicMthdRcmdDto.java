package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_PIC_MTHD_RCMD as TABLE. <br>
 * ピッキング提案
 * <pre>
 * [primary-key]
 *     PIC_MTHD_RCMD_ID
 *
 * [column]
 *     PIC_MTHD_RCMD_ID, CLIENT_ID, CENTER_ID, PICKING_BATCH_NO, RCMD_PICKING_CLS, PACKING_NUM, WORK_VOLUME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, EMERGENCY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PIC_MTHD_RCMD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT, B_CLASS_DTL(ByRcmdPickingCls)
 *
 * [referrer-table]
 *     T_PIC_MTHD_RCMD_CART, T_PIC_MTHD_RCMD_DATA
 *
 * [foreign-property]
 *     mCenter, mClient, bClassDtlByRcmdPickingCls, bClassDtlByEmergencyFlg
 *
 * [referrer-property]
 *     tPicMthdRcmdCartList, tPicMthdRcmdDataList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPicMthdRcmdDto implements Serializable {

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
    /** PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _picMthdRcmdId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** PICKING_BATCH_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingBatchNo;

    /** RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} */
    @JsonKey
    protected String _rcmdPickingCls;

    /** PACKING_NUM: {bigint(19)} */
    @JsonKey
    protected Long _packingNum;

    /** WORK_VOLUME: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _workVolume;

    /** DELIVERY_COURSE_CD: {varchar(100)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(255)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(100)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(255)} */
    @JsonKey
    protected String _carrierNm;

    /** EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} */
    @JsonKey
    protected String _emergencyFlg;

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
    public BsTPicMthdRcmdDto() {
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

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected BClassDtlDto _bClassDtlByRcmdPickingCls;

    public BClassDtlDto getBClassDtlByRcmdPickingCls() {
        return _bClassDtlByRcmdPickingCls;
    }

    public void setBClassDtlByRcmdPickingCls(BClassDtlDto bClassDtlByRcmdPickingCls) {
        this._bClassDtlByRcmdPickingCls = bClassDtlByRcmdPickingCls;
    }

    protected BClassDtlDto _bClassDtlByEmergencyFlg;

    public BClassDtlDto getBClassDtlByEmergencyFlg() {
        return _bClassDtlByEmergencyFlg;
    }

    public void setBClassDtlByEmergencyFlg(BClassDtlDto bClassDtlByEmergencyFlg) {
        this._bClassDtlByEmergencyFlg = bClassDtlByEmergencyFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TPicMthdRcmdCartDto> _tPicMthdRcmdCartList;

    public List<TPicMthdRcmdCartDto> getTPicMthdRcmdCartList() {
        if (_tPicMthdRcmdCartList == null) { _tPicMthdRcmdCartList = new ArrayList<TPicMthdRcmdCartDto>(); }
        return _tPicMthdRcmdCartList;
    }

    public void setTPicMthdRcmdCartList(List<TPicMthdRcmdCartDto> tPicMthdRcmdCartList) {
        this._tPicMthdRcmdCartList = tPicMthdRcmdCartList;
    }

    protected List<TPicMthdRcmdDataDto> _tPicMthdRcmdDataList;

    public List<TPicMthdRcmdDataDto> getTPicMthdRcmdDataList() {
        if (_tPicMthdRcmdDataList == null) { _tPicMthdRcmdDataList = new ArrayList<TPicMthdRcmdDataDto>(); }
        return _tPicMthdRcmdDataList;
    }

    public void setTPicMthdRcmdDataList(List<TPicMthdRcmdDataDto> tPicMthdRcmdDataList) {
        this._tPicMthdRcmdDataList = tPicMthdRcmdDataList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPicMthdRcmdDto)) { return false; }
        final BsTPicMthdRcmdDto otherEntity = (BsTPicMthdRcmdDto)other;
        if (!helpComparingValue(getPicMthdRcmdId(), otherEntity.getPicMthdRcmdId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_PIC_MTHD_RCMD");
        result = xCH(result, getPicMthdRcmdId());
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
        sb.append(c).append(getPicMthdRcmdId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getRcmdPickingCls());
        sb.append(c).append(getPackingNum());
        sb.append(c).append(getWorkVolume());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getEmergencyFlg());
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
     * [get] PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング提案ID
     * @return The value of the column 'PIC_MTHD_RCMD_ID'. (NullAllowed)
     */
    public Long getPicMthdRcmdId() {
        return _picMthdRcmdId;
    }

    /**
     * [set] PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング提案ID
     * @param picMthdRcmdId The value of the column 'PIC_MTHD_RCMD_ID'. (NullAllowed)
     */
    public void setPicMthdRcmdId(Long picMthdRcmdId) {
        __modifiedProperties.add("picMthdRcmdId");
        this._picMthdRcmdId = picMthdRcmdId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] PICKING_BATCH_NO: {varchar(30)} <br>
     * ピッキングバッチNo.
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public String getPickingBatchNo() {
        return _pickingBatchNo;
    }

    /**
     * [set] PICKING_BATCH_NO: {varchar(30)} <br>
     * ピッキングバッチNo.
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        __modifiedProperties.add("pickingBatchNo");
        this._pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @return The value of the column 'RCMD_PICKING_CLS'. (NullAllowed)
     */
    public String getRcmdPickingCls() {
        return _rcmdPickingCls;
    }

    /**
     * [set] RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @param rcmdPickingCls The value of the column 'RCMD_PICKING_CLS'. (NullAllowed)
     */
    public void setRcmdPickingCls(String rcmdPickingCls) {
        __modifiedProperties.add("rcmdPickingCls");
        this._rcmdPickingCls = rcmdPickingCls;
    }

    /**
     * [get] PACKING_NUM: {bigint(19)} <br>
     * 梱包数
     * @return The value of the column 'PACKING_NUM'. (NullAllowed)
     */
    public Long getPackingNum() {
        return _packingNum;
    }

    /**
     * [set] PACKING_NUM: {bigint(19)} <br>
     * 梱包数
     * @param packingNum The value of the column 'PACKING_NUM'. (NullAllowed)
     */
    public void setPackingNum(Long packingNum) {
        __modifiedProperties.add("packingNum");
        this._packingNum = packingNum;
    }

    /**
     * [get] WORK_VOLUME: {decimal(16, 6)} <br>
     * 仕事量
     * @return The value of the column 'WORK_VOLUME'. (NullAllowed)
     */
    public java.math.BigDecimal getWorkVolume() {
        return _workVolume;
    }

    /**
     * [set] WORK_VOLUME: {decimal(16, 6)} <br>
     * 仕事量
     * @param workVolume The value of the column 'WORK_VOLUME'. (NullAllowed)
     */
    public void setWorkVolume(java.math.BigDecimal workVolume) {
        __modifiedProperties.add("workVolume");
        this._workVolume = workVolume;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(100)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(100)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(255)} <br>
     * 配送コース名称
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(255)} <br>
     * 配送コース名称
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {varchar(100)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {varchar(100)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {varchar(255)} <br>
     * 運送業者名称
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {varchar(255)} <br>
     * 運送業者名称
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
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
