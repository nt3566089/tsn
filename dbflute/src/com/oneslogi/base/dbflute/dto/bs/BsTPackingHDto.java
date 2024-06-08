package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_PACKING_H as TABLE. <br>
 * 梱包ヘッダ
 * <pre>
 * [primary-key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PACKING_STATUS, ALLOC_INST_H_ID, PICKING_H_ID, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, BOX_ID, GROSS_WEIGHT, TOTAL_VOLUME, MIXED_FLG, MULTI_PIC_FLG, CART_NO, BUCKET_COL_NO, BUCKET_ROW_NO, SEEDING_NO, LOADING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_PICKING_H, M_CENTER, M_BOX, T_ALLOC_INST_H, M_CLIENT, M_PROCESS_TYPE, B_USER(ByUpdUser), B_CLASS_DTL(ByLoadingFlg), T_PACKING_R(AsOne)
 *
 * [referrer-table]
 *     T_PACKING_B, T_PIC_MTHD_RCMD_CART, T_PACKING_R
 *
 * [foreign-property]
 *     tPickingH, mCenter, mBox, tAllocInstH, mClient, mProcessType, bUserByUpdUser, bClassDtlByLoadingFlg, bClassDtlByMixedFlg, bClassDtlByMultiPicFlg, bClassDtlByPackingStatus, tPackingRAsOne
 *
 * [referrer-property]
 *     tPackingBList, tPicMthdRcmdCartList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPackingHDto implements Serializable {

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
    /** PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _packingHId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    @JsonKey
    protected Long _processTypeId;

    /** PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} */
    @JsonKey
    protected String _packingStatus;

    /** ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H} */
    @JsonKey
    protected Long _allocInstHId;

    /** PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} */
    @JsonKey
    protected Long _pickingHId;

    /** SHIPPING_PACKING_NO: {varchar(30)} */
    @JsonKey
    protected String _shippingPackingNo;

    /** CARRIER_TRACE_NUM: {varchar(30)} */
    @JsonKey
    protected String _carrierTraceNum;

    /** BOX_ID: {IX, bigint(19), FK to M_BOX} */
    @JsonKey
    protected Long _boxId;

    /** GROSS_WEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _grossWeight;

    /** TOTAL_VOLUME: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _totalVolume;

    /** MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} */
    @JsonKey
    protected String _mixedFlg;

    /** MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} */
    @JsonKey
    protected String _multiPicFlg;

    /** CART_NO: {bigint(19)} */
    @JsonKey
    protected Long _cartNo;

    /** BUCKET_COL_NO: {bigint(19)} */
    @JsonKey
    protected Long _bucketColNo;

    /** BUCKET_ROW_NO: {bigint(19)} */
    @JsonKey
    protected Long _bucketRowNo;

    /** SEEDING_NO: {varchar(30)} */
    @JsonKey
    protected String _seedingNo;

    /** LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} */
    @JsonKey
    protected String _loadingFlg;

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

    /** UPD_USER: {varchar(255), FK to B_USER} */
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
    public BsTPackingHDto() {
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
    protected TPickingHDto _tPickingH;

    public TPickingHDto getTPickingH() {
        return _tPickingH;
    }

    public void setTPickingH(TPickingHDto tPickingH) {
        this._tPickingH = tPickingH;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MBoxDto _mBox;

    public MBoxDto getMBox() {
        return _mBox;
    }

    public void setMBox(MBoxDto mBox) {
        this._mBox = mBox;
    }

    protected TAllocInstHDto _tAllocInstH;

    public TAllocInstHDto getTAllocInstH() {
        return _tAllocInstH;
    }

    public void setTAllocInstH(TAllocInstHDto tAllocInstH) {
        this._tAllocInstH = tAllocInstH;
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

    protected BUserDto _bUserByUpdUser;

    public BUserDto getBUserByUpdUser() {
        return _bUserByUpdUser;
    }

    public void setBUserByUpdUser(BUserDto bUserByUpdUser) {
        this._bUserByUpdUser = bUserByUpdUser;
    }

    protected BClassDtlDto _bClassDtlByLoadingFlg;

    public BClassDtlDto getBClassDtlByLoadingFlg() {
        return _bClassDtlByLoadingFlg;
    }

    public void setBClassDtlByLoadingFlg(BClassDtlDto bClassDtlByLoadingFlg) {
        this._bClassDtlByLoadingFlg = bClassDtlByLoadingFlg;
    }

    protected BClassDtlDto _bClassDtlByMixedFlg;

    public BClassDtlDto getBClassDtlByMixedFlg() {
        return _bClassDtlByMixedFlg;
    }

    public void setBClassDtlByMixedFlg(BClassDtlDto bClassDtlByMixedFlg) {
        this._bClassDtlByMixedFlg = bClassDtlByMixedFlg;
    }

    protected BClassDtlDto _bClassDtlByMultiPicFlg;

    public BClassDtlDto getBClassDtlByMultiPicFlg() {
        return _bClassDtlByMultiPicFlg;
    }

    public void setBClassDtlByMultiPicFlg(BClassDtlDto bClassDtlByMultiPicFlg) {
        this._bClassDtlByMultiPicFlg = bClassDtlByMultiPicFlg;
    }

    protected BClassDtlDto _bClassDtlByPackingStatus;

    public BClassDtlDto getBClassDtlByPackingStatus() {
        return _bClassDtlByPackingStatus;
    }

    public void setBClassDtlByPackingStatus(BClassDtlDto bClassDtlByPackingStatus) {
        this._bClassDtlByPackingStatus = bClassDtlByPackingStatus;
    }

    protected TPackingRDto _tPackingRAsOne;

    public TPackingRDto getTPackingRAsOne() {
        return _tPackingRAsOne;
    }

    public void setTPackingRAsOne(TPackingRDto TPackingRAsOne) {
        this._tPackingRAsOne = TPackingRAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TPackingBDto> _tPackingBList;

    public List<TPackingBDto> getTPackingBList() {
        if (_tPackingBList == null) { _tPackingBList = new ArrayList<TPackingBDto>(); }
        return _tPackingBList;
    }

    public void setTPackingBList(List<TPackingBDto> tPackingBList) {
        this._tPackingBList = tPackingBList;
    }

    protected List<TPicMthdRcmdCartDto> _tPicMthdRcmdCartList;

    public List<TPicMthdRcmdCartDto> getTPicMthdRcmdCartList() {
        if (_tPicMthdRcmdCartList == null) { _tPicMthdRcmdCartList = new ArrayList<TPicMthdRcmdCartDto>(); }
        return _tPicMthdRcmdCartList;
    }

    public void setTPicMthdRcmdCartList(List<TPicMthdRcmdCartDto> tPicMthdRcmdCartList) {
        this._tPicMthdRcmdCartList = tPicMthdRcmdCartList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPackingHDto)) { return false; }
        final BsTPackingHDto otherEntity = (BsTPackingHDto)other;
        if (!helpComparingValue(getPackingHId(), otherEntity.getPackingHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_PACKING_H");
        result = xCH(result, getPackingHId());
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
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getPackingStatus());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getShippingPackingNo());
        sb.append(c).append(getCarrierTraceNum());
        sb.append(c).append(getBoxId());
        sb.append(c).append(getGrossWeight());
        sb.append(c).append(getTotalVolume());
        sb.append(c).append(getMixedFlg());
        sb.append(c).append(getMultiPicFlg());
        sb.append(c).append(getCartNo());
        sb.append(c).append(getBucketColNo());
        sb.append(c).append(getBucketRowNo());
        sb.append(c).append(getSeedingNo());
        sb.append(c).append(getLoadingFlg());
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
     * [get] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public Long getPackingHId() {
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public void setPackingHId(Long packingHId) {
        __modifiedProperties.add("packingHId");
        this._packingHId = packingHId;
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
     * [get] PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @return The value of the column 'PACKING_STATUS'. (NullAllowed)
     */
    public String getPackingStatus() {
        return _packingStatus;
    }

    /**
     * [set] PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @param packingStatus The value of the column 'PACKING_STATUS'. (NullAllowed)
     */
    public void setPackingStatus(String packingStatus) {
        __modifiedProperties.add("packingStatus");
        this._packingStatus = packingStatus;
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
     * [get] PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * 出荷梱包No.
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public String getShippingPackingNo() {
        return _shippingPackingNo;
    }

    /**
     * [set] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * 出荷梱包No.
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        __modifiedProperties.add("shippingPackingNo");
        this._shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * 貨物追跡No.
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public String getCarrierTraceNum() {
        return _carrierTraceNum;
    }

    /**
     * [set] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * 貨物追跡No.
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        __modifiedProperties.add("carrierTraceNum");
        this._carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed)
     */
    public Long getBoxId() {
        return _boxId;
    }

    /**
     * [set] BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed)
     */
    public void setBoxId(Long boxId) {
        __modifiedProperties.add("boxId");
        this._boxId = boxId;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] TOTAL_VOLUME: {decimal(16, 6)} <br>
     * 総容積(mm3)
     * @return The value of the column 'TOTAL_VOLUME'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalVolume() {
        return _totalVolume;
    }

    /**
     * [set] TOTAL_VOLUME: {decimal(16, 6)} <br>
     * 総容積(mm3)
     * @param totalVolume The value of the column 'TOTAL_VOLUME'. (NullAllowed)
     */
    public void setTotalVolume(java.math.BigDecimal totalVolume) {
        __modifiedProperties.add("totalVolume");
        this._totalVolume = totalVolume;
    }

    /**
     * [get] MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @return The value of the column 'MIXED_FLG'. (NullAllowed)
     */
    public String getMixedFlg() {
        return _mixedFlg;
    }

    /**
     * [set] MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @param mixedFlg The value of the column 'MIXED_FLG'. (NullAllowed)
     */
    public void setMixedFlg(String mixedFlg) {
        __modifiedProperties.add("mixedFlg");
        this._mixedFlg = mixedFlg;
    }

    /**
     * [get] MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @return The value of the column 'MULTI_PIC_FLG'. (NullAllowed)
     */
    public String getMultiPicFlg() {
        return _multiPicFlg;
    }

    /**
     * [set] MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @param multiPicFlg The value of the column 'MULTI_PIC_FLG'. (NullAllowed)
     */
    public void setMultiPicFlg(String multiPicFlg) {
        __modifiedProperties.add("multiPicFlg");
        this._multiPicFlg = multiPicFlg;
    }

    /**
     * [get] CART_NO: {bigint(19)} <br>
     * 台車№
     * @return The value of the column 'CART_NO'. (NullAllowed)
     */
    public Long getCartNo() {
        return _cartNo;
    }

    /**
     * [set] CART_NO: {bigint(19)} <br>
     * 台車№
     * @param cartNo The value of the column 'CART_NO'. (NullAllowed)
     */
    public void setCartNo(Long cartNo) {
        __modifiedProperties.add("cartNo");
        this._cartNo = cartNo;
    }

    /**
     * [get] BUCKET_COL_NO: {bigint(19)} <br>
     * バケット列№
     * @return The value of the column 'BUCKET_COL_NO'. (NullAllowed)
     */
    public Long getBucketColNo() {
        return _bucketColNo;
    }

    /**
     * [set] BUCKET_COL_NO: {bigint(19)} <br>
     * バケット列№
     * @param bucketColNo The value of the column 'BUCKET_COL_NO'. (NullAllowed)
     */
    public void setBucketColNo(Long bucketColNo) {
        __modifiedProperties.add("bucketColNo");
        this._bucketColNo = bucketColNo;
    }

    /**
     * [get] BUCKET_ROW_NO: {bigint(19)} <br>
     * バケット段№
     * @return The value of the column 'BUCKET_ROW_NO'. (NullAllowed)
     */
    public Long getBucketRowNo() {
        return _bucketRowNo;
    }

    /**
     * [set] BUCKET_ROW_NO: {bigint(19)} <br>
     * バケット段№
     * @param bucketRowNo The value of the column 'BUCKET_ROW_NO'. (NullAllowed)
     */
    public void setBucketRowNo(Long bucketRowNo) {
        __modifiedProperties.add("bucketRowNo");
        this._bucketRowNo = bucketRowNo;
    }

    /**
     * [get] SEEDING_NO: {varchar(30)} <br>
     * 種蒔きNo.
     * @return The value of the column 'SEEDING_NO'. (NullAllowed)
     */
    public String getSeedingNo() {
        return _seedingNo;
    }

    /**
     * [set] SEEDING_NO: {varchar(30)} <br>
     * 種蒔きNo.
     * @param seedingNo The value of the column 'SEEDING_NO'. (NullAllowed)
     */
    public void setSeedingNo(String seedingNo) {
        __modifiedProperties.add("seedingNo");
        this._seedingNo = seedingNo;
    }

    /**
     * [get] LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @return The value of the column 'LOADING_FLG'. (NullAllowed)
     */
    public String getLoadingFlg() {
        return _loadingFlg;
    }

    /**
     * [set] LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @param loadingFlg The value of the column 'LOADING_FLG'. (NullAllowed)
     */
    public void setLoadingFlg(String loadingFlg) {
        __modifiedProperties.add("loadingFlg");
        this._loadingFlg = loadingFlg;
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
     * [get] UPD_USER: {varchar(255), FK to B_USER} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255), FK to B_USER} <br>
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
