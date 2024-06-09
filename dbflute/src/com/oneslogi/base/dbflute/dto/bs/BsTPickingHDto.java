package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_PICKING_H as TABLE. <br>
 * 出庫ヘッダ
 * <pre>
 * [primary-key]
 *     PICKING_H_ID
 *
 * [column]
 *     PICKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PICKING_STATUS, DELIV_UNIT_NO, PICKING_WORK_NO, ALLOC_INST_H_ID, FORCE_FIXED_FLG, PICKING_GROUP_NO, SGL_ROW_PIC_FLG, SHIPPING_FIXED_DT, CENTER_TRANSIT_FLG, PACKING_CAL_CLS, BOL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_ALLOC_INST_H, M_CENTER, M_CLIENT, M_PROCESS_TYPE, B_CLASS_DTL(ByCenterTransitFlg), T_PICKING_R(AsOne)
 *
 * [referrer-table]
 *     T_PACKING_H, T_PICKING_B, T_PIC_MTHD_RCMD_DATA, T_RECEIVE_PLAN_H, W_SGL_ROW_SHIP_INSP_B, T_PICKING_R
 *
 * [foreign-property]
 *     tAllocInstH, mCenter, mClient, mProcessType, bClassDtlByCenterTransitFlg, bClassDtlByForceFixedFlg, bClassDtlByPackingCalCls, bClassDtlByPickingStatus, bClassDtlBySglRowPicFlg, tPickingRAsOne
 *
 * [referrer-property]
 *     tPackingHList, tPickingBList, tPicMthdRcmdDataList, tReceivePlanHList, wSglRowShipInspBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPickingHDto implements Serializable {

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
    /** PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _pickingHId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    @JsonKey
    protected Long _processTypeId;

    /** PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus} */
    @JsonKey
    protected String _pickingStatus;

    /** DELIV_UNIT_NO: {varchar(30)} */
    @JsonKey
    protected String _delivUnitNo;

    /** PICKING_WORK_NO: {IX, varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} */
    @JsonKey
    protected Long _allocInstHId;

    /** FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} */
    @JsonKey
    protected String _forceFixedFlg;

    /** PICKING_GROUP_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingGroupNo;

    /** SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} */
    @JsonKey
    protected String _sglRowPicFlg;

    /** SHIPPING_FIXED_DT: {varchar(8)} */
    @JsonKey
    protected String _shippingFixedDt;

    /** CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} */
    @JsonKey
    protected String _centerTransitFlg;

    /** PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls} */
    @JsonKey
    protected String _packingCalCls;

    /** BOL_NO: {varchar(30)} */
    @JsonKey
    protected String _bolNo;

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
    public BsTPickingHDto() {
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
    protected TAllocInstHDto _tAllocInstH;

    public TAllocInstHDto getTAllocInstH() {
        return _tAllocInstH;
    }

    public void setTAllocInstH(TAllocInstHDto tAllocInstH) {
        this._tAllocInstH = tAllocInstH;
    }

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

    protected MProcessTypeDto _mProcessType;

    public MProcessTypeDto getMProcessType() {
        return _mProcessType;
    }

    public void setMProcessType(MProcessTypeDto mProcessType) {
        this._mProcessType = mProcessType;
    }

    protected BClassDtlDto _bClassDtlByCenterTransitFlg;

    public BClassDtlDto getBClassDtlByCenterTransitFlg() {
        return _bClassDtlByCenterTransitFlg;
    }

    public void setBClassDtlByCenterTransitFlg(BClassDtlDto bClassDtlByCenterTransitFlg) {
        this._bClassDtlByCenterTransitFlg = bClassDtlByCenterTransitFlg;
    }

    protected BClassDtlDto _bClassDtlByForceFixedFlg;

    public BClassDtlDto getBClassDtlByForceFixedFlg() {
        return _bClassDtlByForceFixedFlg;
    }

    public void setBClassDtlByForceFixedFlg(BClassDtlDto bClassDtlByForceFixedFlg) {
        this._bClassDtlByForceFixedFlg = bClassDtlByForceFixedFlg;
    }

    protected BClassDtlDto _bClassDtlByPackingCalCls;

    public BClassDtlDto getBClassDtlByPackingCalCls() {
        return _bClassDtlByPackingCalCls;
    }

    public void setBClassDtlByPackingCalCls(BClassDtlDto bClassDtlByPackingCalCls) {
        this._bClassDtlByPackingCalCls = bClassDtlByPackingCalCls;
    }

    protected BClassDtlDto _bClassDtlByPickingStatus;

    public BClassDtlDto getBClassDtlByPickingStatus() {
        return _bClassDtlByPickingStatus;
    }

    public void setBClassDtlByPickingStatus(BClassDtlDto bClassDtlByPickingStatus) {
        this._bClassDtlByPickingStatus = bClassDtlByPickingStatus;
    }

    protected BClassDtlDto _bClassDtlBySglRowPicFlg;

    public BClassDtlDto getBClassDtlBySglRowPicFlg() {
        return _bClassDtlBySglRowPicFlg;
    }

    public void setBClassDtlBySglRowPicFlg(BClassDtlDto bClassDtlBySglRowPicFlg) {
        this._bClassDtlBySglRowPicFlg = bClassDtlBySglRowPicFlg;
    }

    protected TPickingRDto _tPickingRAsOne;

    public TPickingRDto getTPickingRAsOne() {
        return _tPickingRAsOne;
    }

    public void setTPickingRAsOne(TPickingRDto TPickingRAsOne) {
        this._tPickingRAsOne = TPickingRAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TPackingHDto> _tPackingHList;

    public List<TPackingHDto> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = new ArrayList<TPackingHDto>(); }
        return _tPackingHList;
    }

    public void setTPackingHList(List<TPackingHDto> tPackingHList) {
        this._tPackingHList = tPackingHList;
    }

    protected List<TPickingBDto> _tPickingBList;

    public List<TPickingBDto> getTPickingBList() {
        if (_tPickingBList == null) { _tPickingBList = new ArrayList<TPickingBDto>(); }
        return _tPickingBList;
    }

    public void setTPickingBList(List<TPickingBDto> tPickingBList) {
        this._tPickingBList = tPickingBList;
    }

    protected List<TPicMthdRcmdDataDto> _tPicMthdRcmdDataList;

    public List<TPicMthdRcmdDataDto> getTPicMthdRcmdDataList() {
        if (_tPicMthdRcmdDataList == null) { _tPicMthdRcmdDataList = new ArrayList<TPicMthdRcmdDataDto>(); }
        return _tPicMthdRcmdDataList;
    }

    public void setTPicMthdRcmdDataList(List<TPicMthdRcmdDataDto> tPicMthdRcmdDataList) {
        this._tPicMthdRcmdDataList = tPicMthdRcmdDataList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHList;

    public List<TReceivePlanHDto> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHList;
    }

    public void setTReceivePlanHList(List<TReceivePlanHDto> tReceivePlanHList) {
        this._tReceivePlanHList = tReceivePlanHList;
    }

    protected List<WSglRowShipInspBDto> _wSglRowShipInspBList;

    public List<WSglRowShipInspBDto> getWSglRowShipInspBList() {
        if (_wSglRowShipInspBList == null) { _wSglRowShipInspBList = new ArrayList<WSglRowShipInspBDto>(); }
        return _wSglRowShipInspBList;
    }

    public void setWSglRowShipInspBList(List<WSglRowShipInspBDto> wSglRowShipInspBList) {
        this._wSglRowShipInspBList = wSglRowShipInspBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPickingHDto)) { return false; }
        final BsTPickingHDto otherEntity = (BsTPickingHDto)other;
        if (!helpComparingValue(getPickingHId(), otherEntity.getPickingHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_PICKING_H");
        result = xCH(result, getPickingHId());
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
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getPickingStatus());
        sb.append(c).append(getDelivUnitNo());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getForceFixedFlg());
        sb.append(c).append(getPickingGroupNo());
        sb.append(c).append(getSglRowPicFlg());
        sb.append(c).append(getShippingFixedDt());
        sb.append(c).append(getCenterTransitFlg());
        sb.append(c).append(getPackingCalCls());
        sb.append(c).append(getBolNo());
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
     * [get] PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
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
     * [get] PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @return The value of the column 'PICKING_STATUS'. (NullAllowed)
     */
    public String getPickingStatus() {
        return _pickingStatus;
    }

    /**
     * [set] PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @param pickingStatus The value of the column 'PICKING_STATUS'. (NullAllowed)
     */
    public void setPickingStatus(String pickingStatus) {
        __modifiedProperties.add("pickingStatus");
        this._pickingStatus = pickingStatus;
    }

    /**
     * [get] DELIV_UNIT_NO: {varchar(30)} <br>
     * 届先単位No.
     * @return The value of the column 'DELIV_UNIT_NO'. (NullAllowed)
     */
    public String getDelivUnitNo() {
        return _delivUnitNo;
    }

    /**
     * [set] DELIV_UNIT_NO: {varchar(30)} <br>
     * 届先単位No.
     * @param delivUnitNo The value of the column 'DELIV_UNIT_NO'. (NullAllowed)
     */
    public void setDelivUnitNo(String delivUnitNo) {
        __modifiedProperties.add("delivUnitNo");
        this._delivUnitNo = delivUnitNo;
    }

    /**
     * [get] PICKING_WORK_NO: {IX, varchar(30)} <br>
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {IX, varchar(30)} <br>
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @return The value of the column 'FORCE_FIXED_FLG'. (NullAllowed)
     */
    public String getForceFixedFlg() {
        return _forceFixedFlg;
    }

    /**
     * [set] FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @param forceFixedFlg The value of the column 'FORCE_FIXED_FLG'. (NullAllowed)
     */
    public void setForceFixedFlg(String forceFixedFlg) {
        __modifiedProperties.add("forceFixedFlg");
        this._forceFixedFlg = forceFixedFlg;
    }

    /**
     * [get] PICKING_GROUP_NO: {varchar(30)} <br>
     * ピッキンググループNo.
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public String getPickingGroupNo() {
        return _pickingGroupNo;
    }

    /**
     * [set] PICKING_GROUP_NO: {varchar(30)} <br>
     * ピッキンググループNo.
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        __modifiedProperties.add("pickingGroupNo");
        this._pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @return The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed)
     */
    public String getSglRowPicFlg() {
        return _sglRowPicFlg;
    }

    /**
     * [set] SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param sglRowPicFlg The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed)
     */
    public void setSglRowPicFlg(String sglRowPicFlg) {
        __modifiedProperties.add("sglRowPicFlg");
        this._sglRowPicFlg = sglRowPicFlg;
    }

    /**
     * [get] SHIPPING_FIXED_DT: {varchar(8)} <br>
     * 出荷確定日
     * @return The value of the column 'SHIPPING_FIXED_DT'. (NullAllowed)
     */
    public String getShippingFixedDt() {
        return _shippingFixedDt;
    }

    /**
     * [set] SHIPPING_FIXED_DT: {varchar(8)} <br>
     * 出荷確定日
     * @param shippingFixedDt The value of the column 'SHIPPING_FIXED_DT'. (NullAllowed)
     */
    public void setShippingFixedDt(String shippingFixedDt) {
        __modifiedProperties.add("shippingFixedDt");
        this._shippingFixedDt = shippingFixedDt;
    }

    /**
     * [get] CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * 拠点間移動フラグ
     * @return The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed)
     */
    public String getCenterTransitFlg() {
        return _centerTransitFlg;
    }

    /**
     * [set] CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * 拠点間移動フラグ
     * @param centerTransitFlg The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed)
     */
    public void setCenterTransitFlg(String centerTransitFlg) {
        __modifiedProperties.add("centerTransitFlg");
        this._centerTransitFlg = centerTransitFlg;
    }

    /**
     * [get] PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed)
     */
    public String getPackingCalCls() {
        return _packingCalCls;
    }

    /**
     * [set] PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed)
     */
    public void setPackingCalCls(String packingCalCls) {
        __modifiedProperties.add("packingCalCls");
        this._packingCalCls = packingCalCls;
    }

    /**
     * [get] BOL_NO: {varchar(30)} <br>
     * Bill of Lading No.
     * @return The value of the column 'BOL_NO'. (NullAllowed)
     */
    public String getBolNo() {
        return _bolNo;
    }

    /**
     * [set] BOL_NO: {varchar(30)} <br>
     * Bill of Lading No.
     * @param bolNo The value of the column 'BOL_NO'. (NullAllowed)
     */
    public void setBolNo(String bolNo) {
        __modifiedProperties.add("bolNo");
        this._bolNo = bolNo;
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
