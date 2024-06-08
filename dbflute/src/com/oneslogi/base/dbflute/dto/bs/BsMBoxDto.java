package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_BOX as TABLE. <br>
 * 荷材マスタ
 * <pre>
 * [primary-key]
 *     BOX_ID
 *
 * [column]
 *     BOX_ID, CENTER_ID, BOX_CD, BOX_NM, LENGTH, WIDTH, HEIGHT, VOLUME, VOLUME_RATE, PERMIT_VOLUME, PERMIT_WEIGHT, BOX_TYPE, BXOSZL, BXOSZW, BXOSZH, BXWEIGHT, bxcpy, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     M_BOX_GRP, M_BOX_GRP_DTL, M_CARRIER_BOX, M_PARAM, T_PACKING_H, W_HT_SHIPPING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign-property]
 *     mCenter, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mBoxGrpList, mBoxGrpDtlList, mCarrierBoxList, mParamList, tPackingHList, wHtShippingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMBoxDto implements Serializable {

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
    /** BOX_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _boxId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** BOX_CD: {+UQ, IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _boxCd;

    /** BOX_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _boxNm;

    /** LENGTH: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _length;

    /** WIDTH: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _width;

    /** HEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _height;

    /** VOLUME: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _volume;

    /** VOLUME_RATE: {bigint(19)} */
    @JsonKey
    protected Long _volumeRate;

    /** PERMIT_VOLUME: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _permitVolume;

    /** PERMIT_WEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _permitWeight;

    /** BOX_TYPE: {varchar(30)} */
    @JsonKey
    protected String _boxType;

    /** BXOSZL: {bigint(19)} */
    @JsonKey
    protected Long _bxoszl;

    /** BXOSZW: {bigint(19)} */
    @JsonKey
    protected Long _bxoszw;

    /** BXOSZH: {bigint(19)} */
    @JsonKey
    protected Long _bxoszh;

    /** BXWEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _bxweight;

    /** bxcpy: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _bxcpy;

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
    public BsMBoxDto() {
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
    protected List<MBoxGrpDto> _mBoxGrpList;

    public List<MBoxGrpDto> getMBoxGrpList() {
        if (_mBoxGrpList == null) { _mBoxGrpList = new ArrayList<MBoxGrpDto>(); }
        return _mBoxGrpList;
    }

    public void setMBoxGrpList(List<MBoxGrpDto> mBoxGrpList) {
        this._mBoxGrpList = mBoxGrpList;
    }

    protected List<MBoxGrpDtlDto> _mBoxGrpDtlList;

    public List<MBoxGrpDtlDto> getMBoxGrpDtlList() {
        if (_mBoxGrpDtlList == null) { _mBoxGrpDtlList = new ArrayList<MBoxGrpDtlDto>(); }
        return _mBoxGrpDtlList;
    }

    public void setMBoxGrpDtlList(List<MBoxGrpDtlDto> mBoxGrpDtlList) {
        this._mBoxGrpDtlList = mBoxGrpDtlList;
    }

    protected List<MCarrierBoxDto> _mCarrierBoxList;

    public List<MCarrierBoxDto> getMCarrierBoxList() {
        if (_mCarrierBoxList == null) { _mCarrierBoxList = new ArrayList<MCarrierBoxDto>(); }
        return _mCarrierBoxList;
    }

    public void setMCarrierBoxList(List<MCarrierBoxDto> mCarrierBoxList) {
        this._mCarrierBoxList = mCarrierBoxList;
    }

    protected List<MParamDto> _mParamList;

    public List<MParamDto> getMParamList() {
        if (_mParamList == null) { _mParamList = new ArrayList<MParamDto>(); }
        return _mParamList;
    }

    public void setMParamList(List<MParamDto> mParamList) {
        this._mParamList = mParamList;
    }

    protected List<TPackingHDto> _tPackingHList;

    public List<TPackingHDto> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = new ArrayList<TPackingHDto>(); }
        return _tPackingHList;
    }

    public void setTPackingHList(List<TPackingHDto> tPackingHList) {
        this._tPackingHList = tPackingHList;
    }

    protected List<WHtShippingDto> _wHtShippingList;

    public List<WHtShippingDto> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = new ArrayList<WHtShippingDto>(); }
        return _wHtShippingList;
    }

    public void setWHtShippingList(List<WHtShippingDto> wHtShippingList) {
        this._wHtShippingList = wHtShippingList;
    }

    protected List<WSglRowShipInspHDto> _wSglRowShipInspHList;

    public List<WSglRowShipInspHDto> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = new ArrayList<WSglRowShipInspHDto>(); }
        return _wSglRowShipInspHList;
    }

    public void setWSglRowShipInspHList(List<WSglRowShipInspHDto> wSglRowShipInspHList) {
        this._wSglRowShipInspHList = wSglRowShipInspHList;
    }

    protected List<WShippingInterruptDto> _wShippingInterruptList;

    public List<WShippingInterruptDto> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = new ArrayList<WShippingInterruptDto>(); }
        return _wShippingInterruptList;
    }

    public void setWShippingInterruptList(List<WShippingInterruptDto> wShippingInterruptList) {
        this._wShippingInterruptList = wShippingInterruptList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMBoxDto)) { return false; }
        final BsMBoxDto otherEntity = (BsMBoxDto)other;
        if (!helpComparingValue(getBoxId(), otherEntity.getBoxId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_BOX");
        result = xCH(result, getBoxId());
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
        sb.append(c).append(getBoxId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getBoxCd());
        sb.append(c).append(getBoxNm());
        sb.append(c).append(getLength());
        sb.append(c).append(getWidth());
        sb.append(c).append(getHeight());
        sb.append(c).append(getVolume());
        sb.append(c).append(getVolumeRate());
        sb.append(c).append(getPermitVolume());
        sb.append(c).append(getPermitWeight());
        sb.append(c).append(getBoxType());
        sb.append(c).append(getBxoszl());
        sb.append(c).append(getBxoszw());
        sb.append(c).append(getBxoszh());
        sb.append(c).append(getBxweight());
        sb.append(c).append(getBxcpy());
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
     * [get] BOX_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed)
     */
    public Long getBoxId() {
        return _boxId;
    }

    /**
     * [set] BOX_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed)
     */
    public void setBoxId(Long boxId) {
        __modifiedProperties.add("boxId");
        this._boxId = boxId;
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
     * [get] BOX_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 荷材CD
     * @return The value of the column 'BOX_CD'. (NullAllowed)
     */
    public String getBoxCd() {
        return _boxCd;
    }

    /**
     * [set] BOX_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 荷材CD
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed)
     */
    public void setBoxCd(String boxCd) {
        __modifiedProperties.add("boxCd");
        this._boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {NotNull, varchar(60)} <br>
     * 荷材名称
     * @return The value of the column 'BOX_NM'. (NullAllowed)
     */
    public String getBoxNm() {
        return _boxNm;
    }

    /**
     * [set] BOX_NM: {NotNull, varchar(60)} <br>
     * 荷材名称
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed)
     */
    public void setBoxNm(String boxNm) {
        __modifiedProperties.add("boxNm");
        this._boxNm = boxNm;
    }

    /**
     * [get] LENGTH: {decimal(16, 6)} <br>
     * 縦(mm)
     * @return The value of the column 'LENGTH'. (NullAllowed)
     */
    public java.math.BigDecimal getLength() {
        return _length;
    }

    /**
     * [set] LENGTH: {decimal(16, 6)} <br>
     * 縦(mm)
     * @param length The value of the column 'LENGTH'. (NullAllowed)
     */
    public void setLength(java.math.BigDecimal length) {
        __modifiedProperties.add("length");
        this._length = length;
    }

    /**
     * [get] WIDTH: {decimal(16, 6)} <br>
     * 横(mm)
     * @return The value of the column 'WIDTH'. (NullAllowed)
     */
    public java.math.BigDecimal getWidth() {
        return _width;
    }

    /**
     * [set] WIDTH: {decimal(16, 6)} <br>
     * 横(mm)
     * @param width The value of the column 'WIDTH'. (NullAllowed)
     */
    public void setWidth(java.math.BigDecimal width) {
        __modifiedProperties.add("width");
        this._width = width;
    }

    /**
     * [get] HEIGHT: {decimal(16, 6)} <br>
     * 高さ(mm)
     * @return The value of the column 'HEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getHeight() {
        return _height;
    }

    /**
     * [set] HEIGHT: {decimal(16, 6)} <br>
     * 高さ(mm)
     * @param height The value of the column 'HEIGHT'. (NullAllowed)
     */
    public void setHeight(java.math.BigDecimal height) {
        __modifiedProperties.add("height");
        this._height = height;
    }

    /**
     * [get] VOLUME: {decimal(16, 6)} <br>
     * 容積(mm3)
     * @return The value of the column 'VOLUME'. (NullAllowed)
     */
    public java.math.BigDecimal getVolume() {
        return _volume;
    }

    /**
     * [set] VOLUME: {decimal(16, 6)} <br>
     * 容積(mm3)
     * @param volume The value of the column 'VOLUME'. (NullAllowed)
     */
    public void setVolume(java.math.BigDecimal volume) {
        __modifiedProperties.add("volume");
        this._volume = volume;
    }

    /**
     * [get] VOLUME_RATE: {bigint(19)} <br>
     * 容積率(%)
     * @return The value of the column 'VOLUME_RATE'. (NullAllowed)
     */
    public Long getVolumeRate() {
        return _volumeRate;
    }

    /**
     * [set] VOLUME_RATE: {bigint(19)} <br>
     * 容積率(%)
     * @param volumeRate The value of the column 'VOLUME_RATE'. (NullAllowed)
     */
    public void setVolumeRate(Long volumeRate) {
        __modifiedProperties.add("volumeRate");
        this._volumeRate = volumeRate;
    }

    /**
     * [get] PERMIT_VOLUME: {decimal(16, 6)} <br>
     * 許容容積(mm3)
     * @return The value of the column 'PERMIT_VOLUME'. (NullAllowed)
     */
    public java.math.BigDecimal getPermitVolume() {
        return _permitVolume;
    }

    /**
     * [set] PERMIT_VOLUME: {decimal(16, 6)} <br>
     * 許容容積(mm3)
     * @param permitVolume The value of the column 'PERMIT_VOLUME'. (NullAllowed)
     */
    public void setPermitVolume(java.math.BigDecimal permitVolume) {
        __modifiedProperties.add("permitVolume");
        this._permitVolume = permitVolume;
    }

    /**
     * [get] PERMIT_WEIGHT: {decimal(16, 6)} <br>
     * 許容重量(g)
     * @return The value of the column 'PERMIT_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getPermitWeight() {
        return _permitWeight;
    }

    /**
     * [set] PERMIT_WEIGHT: {decimal(16, 6)} <br>
     * 許容重量(g)
     * @param permitWeight The value of the column 'PERMIT_WEIGHT'. (NullAllowed)
     */
    public void setPermitWeight(java.math.BigDecimal permitWeight) {
        __modifiedProperties.add("permitWeight");
        this._permitWeight = permitWeight;
    }

    /**
     * [get] BOX_TYPE: {varchar(30)} <br>
     * 箱種別
     * @return The value of the column 'BOX_TYPE'. (NullAllowed)
     */
    public String getBoxType() {
        return _boxType;
    }

    /**
     * [set] BOX_TYPE: {varchar(30)} <br>
     * 箱種別
     * @param boxType The value of the column 'BOX_TYPE'. (NullAllowed)
     */
    public void setBoxType(String boxType) {
        __modifiedProperties.add("boxType");
        this._boxType = boxType;
    }

    /**
     * [get] BXOSZL: {bigint(19)} <br>
     * 箱外寸(L)(㎜)
     * @return The value of the column 'BXOSZL'. (NullAllowed)
     */
    public Long getBxoszl() {
        return _bxoszl;
    }

    /**
     * [set] BXOSZL: {bigint(19)} <br>
     * 箱外寸(L)(㎜)
     * @param bxoszl The value of the column 'BXOSZL'. (NullAllowed)
     */
    public void setBxoszl(Long bxoszl) {
        __modifiedProperties.add("bxoszl");
        this._bxoszl = bxoszl;
    }

    /**
     * [get] BXOSZW: {bigint(19)} <br>
     * 箱外寸(W)(㎜)
     * @return The value of the column 'BXOSZW'. (NullAllowed)
     */
    public Long getBxoszw() {
        return _bxoszw;
    }

    /**
     * [set] BXOSZW: {bigint(19)} <br>
     * 箱外寸(W)(㎜)
     * @param bxoszw The value of the column 'BXOSZW'. (NullAllowed)
     */
    public void setBxoszw(Long bxoszw) {
        __modifiedProperties.add("bxoszw");
        this._bxoszw = bxoszw;
    }

    /**
     * [get] BXOSZH: {bigint(19)} <br>
     * 箱外寸(H)(㎜)
     * @return The value of the column 'BXOSZH'. (NullAllowed)
     */
    public Long getBxoszh() {
        return _bxoszh;
    }

    /**
     * [set] BXOSZH: {bigint(19)} <br>
     * 箱外寸(H)(㎜)
     * @param bxoszh The value of the column 'BXOSZH'. (NullAllowed)
     */
    public void setBxoszh(Long bxoszh) {
        __modifiedProperties.add("bxoszh");
        this._bxoszh = bxoszh;
    }

    /**
     * [get] BXWEIGHT: {decimal(16, 6)} <br>
     * 空箱重量(g)
     * @return The value of the column 'BXWEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getBxweight() {
        return _bxweight;
    }

    /**
     * [set] BXWEIGHT: {decimal(16, 6)} <br>
     * 空箱重量(g)
     * @param bxweight The value of the column 'BXWEIGHT'. (NullAllowed)
     */
    public void setBxweight(java.math.BigDecimal bxweight) {
        __modifiedProperties.add("bxweight");
        this._bxweight = bxweight;
    }

    /**
     * [get] bxcpy: {decimal(16, 6)} <br>
     * 容積(cm3)
     * @return The value of the column 'bxcpy'. (NullAllowed)
     */
    public java.math.BigDecimal getBxcpy() {
        return _bxcpy;
    }

    /**
     * [set] bxcpy: {decimal(16, 6)} <br>
     * 容積(cm3)
     * @param bxcpy The value of the column 'bxcpy'. (NullAllowed)
     */
    public void setBxcpy(java.math.BigDecimal bxcpy) {
        __modifiedProperties.add("bxcpy");
        this._bxcpy = bxcpy;
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
