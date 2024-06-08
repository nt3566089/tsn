package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CARRIER_SLIP_SGW as TABLE. <br>
 * 佐川送り状マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_SLIP_SGW_ID
 *
 * [column]
 *     CARRIER_SLIP_SGW_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, SLIP_CUSTOMER_CD, WEB_API_REQUEST_URL, CUSTOMER_ID, LOGIN_PASSWORD, DEPT_CONSIGNOR_NM, CONSIGNOR_TEL_NO, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_NM1, SLIP_CLIENT_NM2, SLIP_SHAPE_CD, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, TRANSPORT_TYPE_SPEED, TRANSPORT_TYPE_ITEM, SETTLEMENT_TYPE, SEAL_TYPE1, SEAL_TYPE2, SEAL_TYPE3, COD_CLS, SEND_CD, API_OKURI_CODE, API_BINSYU_CODE, API_DAIBIKI_FLG, API_DAIBIKI_TYPE, API_WEIGHT_CD_1, API_WEIGHT_CD_2, API_EIDOME_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_SGW_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CENTER_CLASS_DTL(ByApiBinsyuCode), B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer-table]
 *     M_DELIVERY_COURSE
 *
 * [foreign-property]
 *     mCenter, mCenterClassDtlByApiBinsyuCode, mCenterClassDtlByApiDaibikiFlg, mCenterClassDtlByApiDaibikiType, mCenterClassDtlByApiEidomeFlg, mCenterClassDtlByApiWeightCd1, mCenterClassDtlByApiWeightCd2, bClassDtlByCharacterCd, bClassDtlByCodCls, bClassDtlByDelFlg, mCenterClassDtlBySealType1, mCenterClassDtlBySealType2, mCenterClassDtlBySealType3, bClassDtlBySettlementType, mCenterClassDtlBySlipShapeCd, mCenterClassDtlByTransportTypeItem, mCenterClassDtlByTransportTypeSpeed
 *
 * [referrer-property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCarrierSlipSgwDto implements Serializable {

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
    /** CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _carrierSlipSgwId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** TAG_TYPE: {+UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _tagType;

    /** TAG_NM: {varchar(60)} */
    @JsonKey
    protected String _tagNm;

    /** CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} */
    @JsonKey
    protected String _characterCd;

    /** SLIP_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _slipCustomerCd;

    /** WEB_API_REQUEST_URL: {varchar(100)} */
    @JsonKey
    protected String _webApiRequestUrl;

    /** CUSTOMER_ID: {varchar(30)} */
    @JsonKey
    protected String _customerId;

    /** LOGIN_PASSWORD: {varchar(30)} */
    @JsonKey
    protected String _loginPassword;

    /** DEPT_CONSIGNOR_NM: {varchar(255)} */
    @JsonKey
    protected String _deptConsignorNm;

    /** CONSIGNOR_TEL_NO: {varchar(30)} */
    @JsonKey
    protected String _consignorTelNo;

    /** SLIP_CLIENT_TEL_NO: {varchar(30)} */
    @JsonKey
    protected String _slipClientTelNo;

    /** SLIP_CLIENT_ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _slipClientZipCd;

    /** SLIP_CLIENT_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _slipClientAddress1;

    /** SLIP_CLIENT_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _slipClientAddress2;

    /** SLIP_CLIENT_NM1: {varchar(255)} */
    @JsonKey
    protected String _slipClientNm1;

    /** SLIP_CLIENT_NM2: {varchar(255)} */
    @JsonKey
    protected String _slipClientNm2;

    /** SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} */
    @JsonKey
    protected String _slipShapeCd;

    /** SLIP_ITEM_NM1: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm1;

    /** SLIP_ITEM_NM2: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm2;

    /** SLIP_ITEM_NM3: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm3;

    /** SLIP_ITEM_NM4: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm4;

    /** SLIP_ITEM_NM5: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm5;

    /** TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} */
    @JsonKey
    protected String _transportTypeSpeed;

    /** TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} */
    @JsonKey
    protected String _transportTypeItem;

    /** SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} */
    @JsonKey
    protected String _settlementType;

    /** SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} */
    @JsonKey
    protected String _sealType1;

    /** SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} */
    @JsonKey
    protected String _sealType2;

    /** SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} */
    @JsonKey
    protected String _sealType3;

    /** COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} */
    @JsonKey
    protected String _codCls;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** API_OKURI_CODE: {varchar(30)} */
    @JsonKey
    protected String _apiOkuriCode;

    /** API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} */
    @JsonKey
    protected String _apiBinsyuCode;

    /** API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} */
    @JsonKey
    protected String _apiDaibikiFlg;

    /** API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} */
    @JsonKey
    protected String _apiDaibikiType;

    /** API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} */
    @JsonKey
    protected String _apiWeightCd1;

    /** API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} */
    @JsonKey
    protected String _apiWeightCd2;

    /** API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} */
    @JsonKey
    protected String _apiEidomeFlg;

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
    public BsMCarrierSlipSgwDto() {
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

    protected MCenterClassDtlDto _mCenterClassDtlByApiBinsyuCode;

    public MCenterClassDtlDto getMCenterClassDtlByApiBinsyuCode() {
        return _mCenterClassDtlByApiBinsyuCode;
    }

    public void setMCenterClassDtlByApiBinsyuCode(MCenterClassDtlDto mCenterClassDtlByApiBinsyuCode) {
        this._mCenterClassDtlByApiBinsyuCode = mCenterClassDtlByApiBinsyuCode;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByApiDaibikiFlg;

    public MCenterClassDtlDto getMCenterClassDtlByApiDaibikiFlg() {
        return _mCenterClassDtlByApiDaibikiFlg;
    }

    public void setMCenterClassDtlByApiDaibikiFlg(MCenterClassDtlDto mCenterClassDtlByApiDaibikiFlg) {
        this._mCenterClassDtlByApiDaibikiFlg = mCenterClassDtlByApiDaibikiFlg;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByApiDaibikiType;

    public MCenterClassDtlDto getMCenterClassDtlByApiDaibikiType() {
        return _mCenterClassDtlByApiDaibikiType;
    }

    public void setMCenterClassDtlByApiDaibikiType(MCenterClassDtlDto mCenterClassDtlByApiDaibikiType) {
        this._mCenterClassDtlByApiDaibikiType = mCenterClassDtlByApiDaibikiType;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByApiEidomeFlg;

    public MCenterClassDtlDto getMCenterClassDtlByApiEidomeFlg() {
        return _mCenterClassDtlByApiEidomeFlg;
    }

    public void setMCenterClassDtlByApiEidomeFlg(MCenterClassDtlDto mCenterClassDtlByApiEidomeFlg) {
        this._mCenterClassDtlByApiEidomeFlg = mCenterClassDtlByApiEidomeFlg;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByApiWeightCd1;

    public MCenterClassDtlDto getMCenterClassDtlByApiWeightCd1() {
        return _mCenterClassDtlByApiWeightCd1;
    }

    public void setMCenterClassDtlByApiWeightCd1(MCenterClassDtlDto mCenterClassDtlByApiWeightCd1) {
        this._mCenterClassDtlByApiWeightCd1 = mCenterClassDtlByApiWeightCd1;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByApiWeightCd2;

    public MCenterClassDtlDto getMCenterClassDtlByApiWeightCd2() {
        return _mCenterClassDtlByApiWeightCd2;
    }

    public void setMCenterClassDtlByApiWeightCd2(MCenterClassDtlDto mCenterClassDtlByApiWeightCd2) {
        this._mCenterClassDtlByApiWeightCd2 = mCenterClassDtlByApiWeightCd2;
    }

    protected BClassDtlDto _bClassDtlByCharacterCd;

    public BClassDtlDto getBClassDtlByCharacterCd() {
        return _bClassDtlByCharacterCd;
    }

    public void setBClassDtlByCharacterCd(BClassDtlDto bClassDtlByCharacterCd) {
        this._bClassDtlByCharacterCd = bClassDtlByCharacterCd;
    }

    protected BClassDtlDto _bClassDtlByCodCls;

    public BClassDtlDto getBClassDtlByCodCls() {
        return _bClassDtlByCodCls;
    }

    public void setBClassDtlByCodCls(BClassDtlDto bClassDtlByCodCls) {
        this._bClassDtlByCodCls = bClassDtlByCodCls;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected MCenterClassDtlDto _mCenterClassDtlBySealType1;

    public MCenterClassDtlDto getMCenterClassDtlBySealType1() {
        return _mCenterClassDtlBySealType1;
    }

    public void setMCenterClassDtlBySealType1(MCenterClassDtlDto mCenterClassDtlBySealType1) {
        this._mCenterClassDtlBySealType1 = mCenterClassDtlBySealType1;
    }

    protected MCenterClassDtlDto _mCenterClassDtlBySealType2;

    public MCenterClassDtlDto getMCenterClassDtlBySealType2() {
        return _mCenterClassDtlBySealType2;
    }

    public void setMCenterClassDtlBySealType2(MCenterClassDtlDto mCenterClassDtlBySealType2) {
        this._mCenterClassDtlBySealType2 = mCenterClassDtlBySealType2;
    }

    protected MCenterClassDtlDto _mCenterClassDtlBySealType3;

    public MCenterClassDtlDto getMCenterClassDtlBySealType3() {
        return _mCenterClassDtlBySealType3;
    }

    public void setMCenterClassDtlBySealType3(MCenterClassDtlDto mCenterClassDtlBySealType3) {
        this._mCenterClassDtlBySealType3 = mCenterClassDtlBySealType3;
    }

    protected BClassDtlDto _bClassDtlBySettlementType;

    public BClassDtlDto getBClassDtlBySettlementType() {
        return _bClassDtlBySettlementType;
    }

    public void setBClassDtlBySettlementType(BClassDtlDto bClassDtlBySettlementType) {
        this._bClassDtlBySettlementType = bClassDtlBySettlementType;
    }

    protected MCenterClassDtlDto _mCenterClassDtlBySlipShapeCd;

    public MCenterClassDtlDto getMCenterClassDtlBySlipShapeCd() {
        return _mCenterClassDtlBySlipShapeCd;
    }

    public void setMCenterClassDtlBySlipShapeCd(MCenterClassDtlDto mCenterClassDtlBySlipShapeCd) {
        this._mCenterClassDtlBySlipShapeCd = mCenterClassDtlBySlipShapeCd;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByTransportTypeItem;

    public MCenterClassDtlDto getMCenterClassDtlByTransportTypeItem() {
        return _mCenterClassDtlByTransportTypeItem;
    }

    public void setMCenterClassDtlByTransportTypeItem(MCenterClassDtlDto mCenterClassDtlByTransportTypeItem) {
        this._mCenterClassDtlByTransportTypeItem = mCenterClassDtlByTransportTypeItem;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByTransportTypeSpeed;

    public MCenterClassDtlDto getMCenterClassDtlByTransportTypeSpeed() {
        return _mCenterClassDtlByTransportTypeSpeed;
    }

    public void setMCenterClassDtlByTransportTypeSpeed(MCenterClassDtlDto mCenterClassDtlByTransportTypeSpeed) {
        this._mCenterClassDtlByTransportTypeSpeed = mCenterClassDtlByTransportTypeSpeed;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MDeliveryCourseDto> _mDeliveryCourseList;

    public List<MDeliveryCourseDto> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = new ArrayList<MDeliveryCourseDto>(); }
        return _mDeliveryCourseList;
    }

    public void setMDeliveryCourseList(List<MDeliveryCourseDto> mDeliveryCourseList) {
        this._mDeliveryCourseList = mDeliveryCourseList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCarrierSlipSgwDto)) { return false; }
        final BsMCarrierSlipSgwDto otherEntity = (BsMCarrierSlipSgwDto)other;
        if (!helpComparingValue(getCarrierSlipSgwId(), otherEntity.getCarrierSlipSgwId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CARRIER_SLIP_SGW");
        result = xCH(result, getCarrierSlipSgwId());
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
        sb.append(c).append(getCarrierSlipSgwId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getTagType());
        sb.append(c).append(getTagNm());
        sb.append(c).append(getCharacterCd());
        sb.append(c).append(getSlipCustomerCd());
        sb.append(c).append(getWebApiRequestUrl());
        sb.append(c).append(getCustomerId());
        sb.append(c).append(getLoginPassword());
        sb.append(c).append(getDeptConsignorNm());
        sb.append(c).append(getConsignorTelNo());
        sb.append(c).append(getSlipClientTelNo());
        sb.append(c).append(getSlipClientZipCd());
        sb.append(c).append(getSlipClientAddress1());
        sb.append(c).append(getSlipClientAddress2());
        sb.append(c).append(getSlipClientNm1());
        sb.append(c).append(getSlipClientNm2());
        sb.append(c).append(getSlipShapeCd());
        sb.append(c).append(getSlipItemNm1());
        sb.append(c).append(getSlipItemNm2());
        sb.append(c).append(getSlipItemNm3());
        sb.append(c).append(getSlipItemNm4());
        sb.append(c).append(getSlipItemNm5());
        sb.append(c).append(getTransportTypeSpeed());
        sb.append(c).append(getTransportTypeItem());
        sb.append(c).append(getSettlementType());
        sb.append(c).append(getSealType1());
        sb.append(c).append(getSealType2());
        sb.append(c).append(getSealType3());
        sb.append(c).append(getCodCls());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getApiOkuriCode());
        sb.append(c).append(getApiBinsyuCode());
        sb.append(c).append(getApiDaibikiFlg());
        sb.append(c).append(getApiDaibikiType());
        sb.append(c).append(getApiWeightCd1());
        sb.append(c).append(getApiWeightCd2());
        sb.append(c).append(getApiEidomeFlg());
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
     * [get] CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_SGW_ID'. (NullAllowed)
     */
    public Long getCarrierSlipSgwId() {
        return _carrierSlipSgwId;
    }

    /**
     * [set] CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @param carrierSlipSgwId The value of the column 'CARRIER_SLIP_SGW_ID'. (NullAllowed)
     */
    public void setCarrierSlipSgwId(Long carrierSlipSgwId) {
        __modifiedProperties.add("carrierSlipSgwId");
        this._carrierSlipSgwId = carrierSlipSgwId;
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
     * [get] TAG_TYPE: {+UQ, NotNull, varchar(30)} <br>
     * データ種別
     * @return The value of the column 'TAG_TYPE'. (NullAllowed)
     */
    public String getTagType() {
        return _tagType;
    }

    /**
     * [set] TAG_TYPE: {+UQ, NotNull, varchar(30)} <br>
     * データ種別
     * @param tagType The value of the column 'TAG_TYPE'. (NullAllowed)
     */
    public void setTagType(String tagType) {
        __modifiedProperties.add("tagType");
        this._tagType = tagType;
    }

    /**
     * [get] TAG_NM: {varchar(60)} <br>
     * データ種別名称
     * @return The value of the column 'TAG_NM'. (NullAllowed)
     */
    public String getTagNm() {
        return _tagNm;
    }

    /**
     * [set] TAG_NM: {varchar(60)} <br>
     * データ種別名称
     * @param tagNm The value of the column 'TAG_NM'. (NullAllowed)
     */
    public void setTagNm(String tagNm) {
        __modifiedProperties.add("tagNm");
        this._tagNm = tagNm;
    }

    /**
     * [get] CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字CD
     * @return The value of the column 'CHARACTER_CD'. (NullAllowed)
     */
    public String getCharacterCd() {
        return _characterCd;
    }

    /**
     * [set] CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字CD
     * @param characterCd The value of the column 'CHARACTER_CD'. (NullAllowed)
     */
    public void setCharacterCd(String characterCd) {
        __modifiedProperties.add("characterCd");
        this._characterCd = characterCd;
    }

    /**
     * [get] SLIP_CUSTOMER_CD: {varchar(30)} <br>
     * お客様CD
     * @return The value of the column 'SLIP_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSlipCustomerCd() {
        return _slipCustomerCd;
    }

    /**
     * [set] SLIP_CUSTOMER_CD: {varchar(30)} <br>
     * お客様CD
     * @param slipCustomerCd The value of the column 'SLIP_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSlipCustomerCd(String slipCustomerCd) {
        __modifiedProperties.add("slipCustomerCd");
        this._slipCustomerCd = slipCustomerCd;
    }

    /**
     * [get] WEB_API_REQUEST_URL: {varchar(100)} <br>
     * WebAPIリクエストURL
     * @return The value of the column 'WEB_API_REQUEST_URL'. (NullAllowed)
     */
    public String getWebApiRequestUrl() {
        return _webApiRequestUrl;
    }

    /**
     * [set] WEB_API_REQUEST_URL: {varchar(100)} <br>
     * WebAPIリクエストURL
     * @param webApiRequestUrl The value of the column 'WEB_API_REQUEST_URL'. (NullAllowed)
     */
    public void setWebApiRequestUrl(String webApiRequestUrl) {
        __modifiedProperties.add("webApiRequestUrl");
        this._webApiRequestUrl = webApiRequestUrl;
    }

    /**
     * [get] CUSTOMER_ID: {varchar(30)} <br>
     * カスタマーID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public String getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {varchar(30)} <br>
     * カスタマーID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(String customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] LOGIN_PASSWORD: {varchar(30)} <br>
     * ログインパスワード
     * @return The value of the column 'LOGIN_PASSWORD'. (NullAllowed)
     */
    public String getLoginPassword() {
        return _loginPassword;
    }

    /**
     * [set] LOGIN_PASSWORD: {varchar(30)} <br>
     * ログインパスワード
     * @param loginPassword The value of the column 'LOGIN_PASSWORD'. (NullAllowed)
     */
    public void setLoginPassword(String loginPassword) {
        __modifiedProperties.add("loginPassword");
        this._loginPassword = loginPassword;
    }

    /**
     * [get] DEPT_CONSIGNOR_NM: {varchar(255)} <br>
     * 部署・担当者
     * @return The value of the column 'DEPT_CONSIGNOR_NM'. (NullAllowed)
     */
    public String getDeptConsignorNm() {
        return _deptConsignorNm;
    }

    /**
     * [set] DEPT_CONSIGNOR_NM: {varchar(255)} <br>
     * 部署・担当者
     * @param deptConsignorNm The value of the column 'DEPT_CONSIGNOR_NM'. (NullAllowed)
     */
    public void setDeptConsignorNm(String deptConsignorNm) {
        __modifiedProperties.add("deptConsignorNm");
        this._deptConsignorNm = deptConsignorNm;
    }

    /**
     * [get] CONSIGNOR_TEL_NO: {varchar(30)} <br>
     * 荷送人電話番号
     * @return The value of the column 'CONSIGNOR_TEL_NO'. (NullAllowed)
     */
    public String getConsignorTelNo() {
        return _consignorTelNo;
    }

    /**
     * [set] CONSIGNOR_TEL_NO: {varchar(30)} <br>
     * 荷送人電話番号
     * @param consignorTelNo The value of the column 'CONSIGNOR_TEL_NO'. (NullAllowed)
     */
    public void setConsignorTelNo(String consignorTelNo) {
        __modifiedProperties.add("consignorTelNo");
        this._consignorTelNo = consignorTelNo;
    }

    /**
     * [get] SLIP_CLIENT_TEL_NO: {varchar(30)} <br>
     * ご依頼主電話番号
     * @return The value of the column 'SLIP_CLIENT_TEL_NO'. (NullAllowed)
     */
    public String getSlipClientTelNo() {
        return _slipClientTelNo;
    }

    /**
     * [set] SLIP_CLIENT_TEL_NO: {varchar(30)} <br>
     * ご依頼主電話番号
     * @param slipClientTelNo The value of the column 'SLIP_CLIENT_TEL_NO'. (NullAllowed)
     */
    public void setSlipClientTelNo(String slipClientTelNo) {
        __modifiedProperties.add("slipClientTelNo");
        this._slipClientTelNo = slipClientTelNo;
    }

    /**
     * [get] SLIP_CLIENT_ZIP_CD: {varchar(30)} <br>
     * ご依頼主郵便番号
     * @return The value of the column 'SLIP_CLIENT_ZIP_CD'. (NullAllowed)
     */
    public String getSlipClientZipCd() {
        return _slipClientZipCd;
    }

    /**
     * [set] SLIP_CLIENT_ZIP_CD: {varchar(30)} <br>
     * ご依頼主郵便番号
     * @param slipClientZipCd The value of the column 'SLIP_CLIENT_ZIP_CD'. (NullAllowed)
     */
    public void setSlipClientZipCd(String slipClientZipCd) {
        __modifiedProperties.add("slipClientZipCd");
        this._slipClientZipCd = slipClientZipCd;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS1: {varchar(255)} <br>
     * ご依頼主住所1
     * @return The value of the column 'SLIP_CLIENT_ADDRESS1'. (NullAllowed)
     */
    public String getSlipClientAddress1() {
        return _slipClientAddress1;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS1: {varchar(255)} <br>
     * ご依頼主住所1
     * @param slipClientAddress1 The value of the column 'SLIP_CLIENT_ADDRESS1'. (NullAllowed)
     */
    public void setSlipClientAddress1(String slipClientAddress1) {
        __modifiedProperties.add("slipClientAddress1");
        this._slipClientAddress1 = slipClientAddress1;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS2: {varchar(255)} <br>
     * ご依頼主住所2
     * @return The value of the column 'SLIP_CLIENT_ADDRESS2'. (NullAllowed)
     */
    public String getSlipClientAddress2() {
        return _slipClientAddress2;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS2: {varchar(255)} <br>
     * ご依頼主住所2
     * @param slipClientAddress2 The value of the column 'SLIP_CLIENT_ADDRESS2'. (NullAllowed)
     */
    public void setSlipClientAddress2(String slipClientAddress2) {
        __modifiedProperties.add("slipClientAddress2");
        this._slipClientAddress2 = slipClientAddress2;
    }

    /**
     * [get] SLIP_CLIENT_NM1: {varchar(255)} <br>
     * ご依頼主名称1
     * @return The value of the column 'SLIP_CLIENT_NM1'. (NullAllowed)
     */
    public String getSlipClientNm1() {
        return _slipClientNm1;
    }

    /**
     * [set] SLIP_CLIENT_NM1: {varchar(255)} <br>
     * ご依頼主名称1
     * @param slipClientNm1 The value of the column 'SLIP_CLIENT_NM1'. (NullAllowed)
     */
    public void setSlipClientNm1(String slipClientNm1) {
        __modifiedProperties.add("slipClientNm1");
        this._slipClientNm1 = slipClientNm1;
    }

    /**
     * [get] SLIP_CLIENT_NM2: {varchar(255)} <br>
     * ご依頼主名称2
     * @return The value of the column 'SLIP_CLIENT_NM2'. (NullAllowed)
     */
    public String getSlipClientNm2() {
        return _slipClientNm2;
    }

    /**
     * [set] SLIP_CLIENT_NM2: {varchar(255)} <br>
     * ご依頼主名称2
     * @param slipClientNm2 The value of the column 'SLIP_CLIENT_NM2'. (NullAllowed)
     */
    public void setSlipClientNm2(String slipClientNm2) {
        __modifiedProperties.add("slipClientNm2");
        this._slipClientNm2 = slipClientNm2;
    }

    /**
     * [get] SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿CD
     * @return The value of the column 'SLIP_SHAPE_CD'. (NullAllowed)
     */
    public String getSlipShapeCd() {
        return _slipShapeCd;
    }

    /**
     * [set] SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿CD
     * @param slipShapeCd The value of the column 'SLIP_SHAPE_CD'. (NullAllowed)
     */
    public void setSlipShapeCd(String slipShapeCd) {
        __modifiedProperties.add("slipShapeCd");
        this._slipShapeCd = slipShapeCd;
    }

    /**
     * [get] SLIP_ITEM_NM1: {varchar(255)} <br>
     * 品名1
     * @return The value of the column 'SLIP_ITEM_NM1'. (NullAllowed)
     */
    public String getSlipItemNm1() {
        return _slipItemNm1;
    }

    /**
     * [set] SLIP_ITEM_NM1: {varchar(255)} <br>
     * 品名1
     * @param slipItemNm1 The value of the column 'SLIP_ITEM_NM1'. (NullAllowed)
     */
    public void setSlipItemNm1(String slipItemNm1) {
        __modifiedProperties.add("slipItemNm1");
        this._slipItemNm1 = slipItemNm1;
    }

    /**
     * [get] SLIP_ITEM_NM2: {varchar(255)} <br>
     * 品名2
     * @return The value of the column 'SLIP_ITEM_NM2'. (NullAllowed)
     */
    public String getSlipItemNm2() {
        return _slipItemNm2;
    }

    /**
     * [set] SLIP_ITEM_NM2: {varchar(255)} <br>
     * 品名2
     * @param slipItemNm2 The value of the column 'SLIP_ITEM_NM2'. (NullAllowed)
     */
    public void setSlipItemNm2(String slipItemNm2) {
        __modifiedProperties.add("slipItemNm2");
        this._slipItemNm2 = slipItemNm2;
    }

    /**
     * [get] SLIP_ITEM_NM3: {varchar(255)} <br>
     * 品名3
     * @return The value of the column 'SLIP_ITEM_NM3'. (NullAllowed)
     */
    public String getSlipItemNm3() {
        return _slipItemNm3;
    }

    /**
     * [set] SLIP_ITEM_NM3: {varchar(255)} <br>
     * 品名3
     * @param slipItemNm3 The value of the column 'SLIP_ITEM_NM3'. (NullAllowed)
     */
    public void setSlipItemNm3(String slipItemNm3) {
        __modifiedProperties.add("slipItemNm3");
        this._slipItemNm3 = slipItemNm3;
    }

    /**
     * [get] SLIP_ITEM_NM4: {varchar(255)} <br>
     * 品名4
     * @return The value of the column 'SLIP_ITEM_NM4'. (NullAllowed)
     */
    public String getSlipItemNm4() {
        return _slipItemNm4;
    }

    /**
     * [set] SLIP_ITEM_NM4: {varchar(255)} <br>
     * 品名4
     * @param slipItemNm4 The value of the column 'SLIP_ITEM_NM4'. (NullAllowed)
     */
    public void setSlipItemNm4(String slipItemNm4) {
        __modifiedProperties.add("slipItemNm4");
        this._slipItemNm4 = slipItemNm4;
    }

    /**
     * [get] SLIP_ITEM_NM5: {varchar(255)} <br>
     * 品名5
     * @return The value of the column 'SLIP_ITEM_NM5'. (NullAllowed)
     */
    public String getSlipItemNm5() {
        return _slipItemNm5;
    }

    /**
     * [set] SLIP_ITEM_NM5: {varchar(255)} <br>
     * 品名5
     * @param slipItemNm5 The value of the column 'SLIP_ITEM_NM5'. (NullAllowed)
     */
    public void setSlipItemNm5(String slipItemNm5) {
        __modifiedProperties.add("slipItemNm5");
        this._slipItemNm5 = slipItemNm5;
    }

    /**
     * [get] TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @return The value of the column 'TRANSPORT_TYPE_SPEED'. (NullAllowed)
     */
    public String getTransportTypeSpeed() {
        return _transportTypeSpeed;
    }

    /**
     * [set] TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @param transportTypeSpeed The value of the column 'TRANSPORT_TYPE_SPEED'. (NullAllowed)
     */
    public void setTransportTypeSpeed(String transportTypeSpeed) {
        __modifiedProperties.add("transportTypeSpeed");
        this._transportTypeSpeed = transportTypeSpeed;
    }

    /**
     * [get] TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @return The value of the column 'TRANSPORT_TYPE_ITEM'. (NullAllowed)
     */
    public String getTransportTypeItem() {
        return _transportTypeItem;
    }

    /**
     * [set] TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @param transportTypeItem The value of the column 'TRANSPORT_TYPE_ITEM'. (NullAllowed)
     */
    public void setTransportTypeItem(String transportTypeItem) {
        __modifiedProperties.add("transportTypeItem");
        this._transportTypeItem = transportTypeItem;
    }

    /**
     * [get] SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @return The value of the column 'SETTLEMENT_TYPE'. (NullAllowed)
     */
    public String getSettlementType() {
        return _settlementType;
    }

    /**
     * [set] SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @param settlementType The value of the column 'SETTLEMENT_TYPE'. (NullAllowed)
     */
    public void setSettlementType(String settlementType) {
        __modifiedProperties.add("settlementType");
        this._settlementType = settlementType;
    }

    /**
     * [get] SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール1
     * @return The value of the column 'SEAL_TYPE1'. (NullAllowed)
     */
    public String getSealType1() {
        return _sealType1;
    }

    /**
     * [set] SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール1
     * @param sealType1 The value of the column 'SEAL_TYPE1'. (NullAllowed)
     */
    public void setSealType1(String sealType1) {
        __modifiedProperties.add("sealType1");
        this._sealType1 = sealType1;
    }

    /**
     * [get] SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール2
     * @return The value of the column 'SEAL_TYPE2'. (NullAllowed)
     */
    public String getSealType2() {
        return _sealType2;
    }

    /**
     * [set] SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール2
     * @param sealType2 The value of the column 'SEAL_TYPE2'. (NullAllowed)
     */
    public void setSealType2(String sealType2) {
        __modifiedProperties.add("sealType2");
        this._sealType2 = sealType2;
    }

    /**
     * [get] SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール3
     * @return The value of the column 'SEAL_TYPE3'. (NullAllowed)
     */
    public String getSealType3() {
        return _sealType3;
    }

    /**
     * [set] SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール3
     * @param sealType3 The value of the column 'SEAL_TYPE3'. (NullAllowed)
     */
    public void setSealType3(String sealType3) {
        __modifiedProperties.add("sealType3");
        this._sealType3 = sealType3;
    }

    /**
     * [get] COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @return The value of the column 'COD_CLS'. (NullAllowed)
     */
    public String getCodCls() {
        return _codCls;
    }

    /**
     * [set] COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @param codCls The value of the column 'COD_CLS'. (NullAllowed)
     */
    public void setCodCls(String codCls) {
        __modifiedProperties.add("codCls");
        this._codCls = codCls;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 発店CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 発店CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] API_OKURI_CODE: {varchar(30)} <br>
     * WebAPI送り状CD
     * @return The value of the column 'API_OKURI_CODE'. (NullAllowed)
     */
    public String getApiOkuriCode() {
        return _apiOkuriCode;
    }

    /**
     * [set] API_OKURI_CODE: {varchar(30)} <br>
     * WebAPI送り状CD
     * @param apiOkuriCode The value of the column 'API_OKURI_CODE'. (NullAllowed)
     */
    public void setApiOkuriCode(String apiOkuriCode) {
        __modifiedProperties.add("apiOkuriCode");
        this._apiOkuriCode = apiOkuriCode;
    }

    /**
     * [get] API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種CD
     * @return The value of the column 'API_BINSYU_CODE'. (NullAllowed)
     */
    public String getApiBinsyuCode() {
        return _apiBinsyuCode;
    }

    /**
     * [set] API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種CD
     * @param apiBinsyuCode The value of the column 'API_BINSYU_CODE'. (NullAllowed)
     */
    public void setApiBinsyuCode(String apiBinsyuCode) {
        __modifiedProperties.add("apiBinsyuCode");
        this._apiBinsyuCode = apiBinsyuCode;
    }

    /**
     * [get] API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @return The value of the column 'API_DAIBIKI_FLG'. (NullAllowed)
     */
    public String getApiDaibikiFlg() {
        return _apiDaibikiFlg;
    }

    /**
     * [set] API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @param apiDaibikiFlg The value of the column 'API_DAIBIKI_FLG'. (NullAllowed)
     */
    public void setApiDaibikiFlg(String apiDaibikiFlg) {
        __modifiedProperties.add("apiDaibikiFlg");
        this._apiDaibikiFlg = apiDaibikiFlg;
    }

    /**
     * [get] API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @return The value of the column 'API_DAIBIKI_TYPE'. (NullAllowed)
     */
    public String getApiDaibikiType() {
        return _apiDaibikiType;
    }

    /**
     * [set] API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @param apiDaibikiType The value of the column 'API_DAIBIKI_TYPE'. (NullAllowed)
     */
    public void setApiDaibikiType(String apiDaibikiType) {
        __modifiedProperties.add("apiDaibikiType");
        this._apiDaibikiType = apiDaibikiType;
    }

    /**
     * [get] API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量CD1
     * @return The value of the column 'API_WEIGHT_CD_1'. (NullAllowed)
     */
    public String getApiWeightCd1() {
        return _apiWeightCd1;
    }

    /**
     * [set] API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量CD1
     * @param apiWeightCd1 The value of the column 'API_WEIGHT_CD_1'. (NullAllowed)
     */
    public void setApiWeightCd1(String apiWeightCd1) {
        __modifiedProperties.add("apiWeightCd1");
        this._apiWeightCd1 = apiWeightCd1;
    }

    /**
     * [get] API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量CD2
     * @return The value of the column 'API_WEIGHT_CD_2'. (NullAllowed)
     */
    public String getApiWeightCd2() {
        return _apiWeightCd2;
    }

    /**
     * [set] API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量CD2
     * @param apiWeightCd2 The value of the column 'API_WEIGHT_CD_2'. (NullAllowed)
     */
    public void setApiWeightCd2(String apiWeightCd2) {
        __modifiedProperties.add("apiWeightCd2");
        this._apiWeightCd2 = apiWeightCd2;
    }

    /**
     * [get] API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @return The value of the column 'API_EIDOME_FLG'. (NullAllowed)
     */
    public String getApiEidomeFlg() {
        return _apiEidomeFlg;
    }

    /**
     * [set] API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @param apiEidomeFlg The value of the column 'API_EIDOME_FLG'. (NullAllowed)
     */
    public void setApiEidomeFlg(String apiEidomeFlg) {
        __modifiedProperties.add("apiEidomeFlg");
        this._apiEidomeFlg = apiEidomeFlg;
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
