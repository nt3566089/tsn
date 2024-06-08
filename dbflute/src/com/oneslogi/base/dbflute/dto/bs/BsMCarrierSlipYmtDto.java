package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CARRIER_SLIP_YMT as TABLE. <br>
 * ヤマト送り状マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_SLIP_YMT_ID
 *
 * [column]
 *     CARRIER_SLIP_YMT_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, SLIP_TYPE, COOL_CLS, HONORIFIC, PACKING_SHOW_FLG, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_ADDRESS3, SLIP_CLIENT_ADDRESS4, SLIP_CLIENT_NM, SLIP_ITEM_CD1, SLIP_ITEM_NM1, SLIP_ITEM_CD2, SLIP_ITEM_NM2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, BILLING_CUSTOMER_CD, FARE_NO, SEND_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_YMT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer-table]
 *     M_DELIVERY_COURSE
 *
 * [foreign-property]
 *     mCenter, bClassDtlByCharacterCd, bClassDtlByCoolCls, bClassDtlByDelFlg, bClassDtlByPackingShowFlg, bClassDtlBySlipType
 *
 * [referrer-property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCarrierSlipYmtDto implements Serializable {

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
    /** CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _carrierSlipYmtId;

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

    /** SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} */
    @JsonKey
    protected String _slipType;

    /** COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} */
    @JsonKey
    protected String _coolCls;

    /** HONORIFIC: {varchar(30)} */
    @JsonKey
    protected String _honorific;

    /** PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} */
    @JsonKey
    protected String _packingShowFlg;

    /** SLIP_CLIENT_TEL_NO: {varchar(30)} */
    @JsonKey
    protected String _slipClientTelNo;

    /** SLIP_CLIENT_ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _slipClientZipCd;

    /** SLIP_CLIENT_ADDRESS1: {varchar(60)} */
    @JsonKey
    protected String _slipClientAddress1;

    /** SLIP_CLIENT_ADDRESS2: {varchar(60)} */
    @JsonKey
    protected String _slipClientAddress2;

    /** SLIP_CLIENT_ADDRESS3: {varchar(60)} */
    @JsonKey
    protected String _slipClientAddress3;

    /** SLIP_CLIENT_ADDRESS4: {varchar(60)} */
    @JsonKey
    protected String _slipClientAddress4;

    /** SLIP_CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _slipClientNm;

    /** SLIP_ITEM_CD1: {varchar(30)} */
    @JsonKey
    protected String _slipItemCd1;

    /** SLIP_ITEM_NM1: {varchar(60)} */
    @JsonKey
    protected String _slipItemNm1;

    /** SLIP_ITEM_CD2: {varchar(30)} */
    @JsonKey
    protected String _slipItemCd2;

    /** SLIP_ITEM_NM2: {varchar(60)} */
    @JsonKey
    protected String _slipItemNm2;

    /** FREIGHT_HANDLING1: {varchar(60)} */
    @JsonKey
    protected String _freightHandling1;

    /** FREIGHT_HANDLING2: {varchar(60)} */
    @JsonKey
    protected String _freightHandling2;

    /** ARTICLE: {varchar(255)} */
    @JsonKey
    protected String _article;

    /** BILLING_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _billingCustomerCd;

    /** FARE_NO: {varchar(30)} */
    @JsonKey
    protected String _fareNo;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

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
    public BsMCarrierSlipYmtDto() {
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

    protected BClassDtlDto _bClassDtlByCharacterCd;

    public BClassDtlDto getBClassDtlByCharacterCd() {
        return _bClassDtlByCharacterCd;
    }

    public void setBClassDtlByCharacterCd(BClassDtlDto bClassDtlByCharacterCd) {
        this._bClassDtlByCharacterCd = bClassDtlByCharacterCd;
    }

    protected BClassDtlDto _bClassDtlByCoolCls;

    public BClassDtlDto getBClassDtlByCoolCls() {
        return _bClassDtlByCoolCls;
    }

    public void setBClassDtlByCoolCls(BClassDtlDto bClassDtlByCoolCls) {
        this._bClassDtlByCoolCls = bClassDtlByCoolCls;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected BClassDtlDto _bClassDtlByPackingShowFlg;

    public BClassDtlDto getBClassDtlByPackingShowFlg() {
        return _bClassDtlByPackingShowFlg;
    }

    public void setBClassDtlByPackingShowFlg(BClassDtlDto bClassDtlByPackingShowFlg) {
        this._bClassDtlByPackingShowFlg = bClassDtlByPackingShowFlg;
    }

    protected BClassDtlDto _bClassDtlBySlipType;

    public BClassDtlDto getBClassDtlBySlipType() {
        return _bClassDtlBySlipType;
    }

    public void setBClassDtlBySlipType(BClassDtlDto bClassDtlBySlipType) {
        this._bClassDtlBySlipType = bClassDtlBySlipType;
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
        if (other == null || !(other instanceof BsMCarrierSlipYmtDto)) { return false; }
        final BsMCarrierSlipYmtDto otherEntity = (BsMCarrierSlipYmtDto)other;
        if (!helpComparingValue(getCarrierSlipYmtId(), otherEntity.getCarrierSlipYmtId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CARRIER_SLIP_YMT");
        result = xCH(result, getCarrierSlipYmtId());
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
        sb.append(c).append(getCarrierSlipYmtId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getTagType());
        sb.append(c).append(getTagNm());
        sb.append(c).append(getCharacterCd());
        sb.append(c).append(getSlipType());
        sb.append(c).append(getCoolCls());
        sb.append(c).append(getHonorific());
        sb.append(c).append(getPackingShowFlg());
        sb.append(c).append(getSlipClientTelNo());
        sb.append(c).append(getSlipClientZipCd());
        sb.append(c).append(getSlipClientAddress1());
        sb.append(c).append(getSlipClientAddress2());
        sb.append(c).append(getSlipClientAddress3());
        sb.append(c).append(getSlipClientAddress4());
        sb.append(c).append(getSlipClientNm());
        sb.append(c).append(getSlipItemCd1());
        sb.append(c).append(getSlipItemNm1());
        sb.append(c).append(getSlipItemCd2());
        sb.append(c).append(getSlipItemNm2());
        sb.append(c).append(getFreightHandling1());
        sb.append(c).append(getFreightHandling2());
        sb.append(c).append(getArticle());
        sb.append(c).append(getBillingCustomerCd());
        sb.append(c).append(getFareNo());
        sb.append(c).append(getSendCd());
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
     * [get] CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_YMT_ID'. (NullAllowed)
     */
    public Long getCarrierSlipYmtId() {
        return _carrierSlipYmtId;
    }

    /**
     * [set] CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @param carrierSlipYmtId The value of the column 'CARRIER_SLIP_YMT_ID'. (NullAllowed)
     */
    public void setCarrierSlipYmtId(Long carrierSlipYmtId) {
        __modifiedProperties.add("carrierSlipYmtId");
        this._carrierSlipYmtId = carrierSlipYmtId;
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
     * [get] SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @return The value of the column 'SLIP_TYPE'. (NullAllowed)
     */
    public String getSlipType() {
        return _slipType;
    }

    /**
     * [set] SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @param slipType The value of the column 'SLIP_TYPE'. (NullAllowed)
     */
    public void setSlipType(String slipType) {
        __modifiedProperties.add("slipType");
        this._slipType = slipType;
    }

    /**
     * [get] COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @return The value of the column 'COOL_CLS'. (NullAllowed)
     */
    public String getCoolCls() {
        return _coolCls;
    }

    /**
     * [set] COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @param coolCls The value of the column 'COOL_CLS'. (NullAllowed)
     */
    public void setCoolCls(String coolCls) {
        __modifiedProperties.add("coolCls");
        this._coolCls = coolCls;
    }

    /**
     * [get] HONORIFIC: {varchar(30)} <br>
     * 敬称
     * @return The value of the column 'HONORIFIC'. (NullAllowed)
     */
    public String getHonorific() {
        return _honorific;
    }

    /**
     * [set] HONORIFIC: {varchar(30)} <br>
     * 敬称
     * @param honorific The value of the column 'HONORIFIC'. (NullAllowed)
     */
    public void setHonorific(String honorific) {
        __modifiedProperties.add("honorific");
        this._honorific = honorific;
    }

    /**
     * [get] PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @return The value of the column 'PACKING_SHOW_FLG'. (NullAllowed)
     */
    public String getPackingShowFlg() {
        return _packingShowFlg;
    }

    /**
     * [set] PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @param packingShowFlg The value of the column 'PACKING_SHOW_FLG'. (NullAllowed)
     */
    public void setPackingShowFlg(String packingShowFlg) {
        __modifiedProperties.add("packingShowFlg");
        this._packingShowFlg = packingShowFlg;
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
     * [get] SLIP_CLIENT_ADDRESS1: {varchar(60)} <br>
     * ご依頼主住所(都道府県)
     * @return The value of the column 'SLIP_CLIENT_ADDRESS1'. (NullAllowed)
     */
    public String getSlipClientAddress1() {
        return _slipClientAddress1;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS1: {varchar(60)} <br>
     * ご依頼主住所(都道府県)
     * @param slipClientAddress1 The value of the column 'SLIP_CLIENT_ADDRESS1'. (NullAllowed)
     */
    public void setSlipClientAddress1(String slipClientAddress1) {
        __modifiedProperties.add("slipClientAddress1");
        this._slipClientAddress1 = slipClientAddress1;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS2: {varchar(60)} <br>
     * ご依頼主住所(市区郡町村)
     * @return The value of the column 'SLIP_CLIENT_ADDRESS2'. (NullAllowed)
     */
    public String getSlipClientAddress2() {
        return _slipClientAddress2;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS2: {varchar(60)} <br>
     * ご依頼主住所(市区郡町村)
     * @param slipClientAddress2 The value of the column 'SLIP_CLIENT_ADDRESS2'. (NullAllowed)
     */
    public void setSlipClientAddress2(String slipClientAddress2) {
        __modifiedProperties.add("slipClientAddress2");
        this._slipClientAddress2 = slipClientAddress2;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS3: {varchar(60)} <br>
     * ご依頼主住所(町域)
     * @return The value of the column 'SLIP_CLIENT_ADDRESS3'. (NullAllowed)
     */
    public String getSlipClientAddress3() {
        return _slipClientAddress3;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS3: {varchar(60)} <br>
     * ご依頼主住所(町域)
     * @param slipClientAddress3 The value of the column 'SLIP_CLIENT_ADDRESS3'. (NullAllowed)
     */
    public void setSlipClientAddress3(String slipClientAddress3) {
        __modifiedProperties.add("slipClientAddress3");
        this._slipClientAddress3 = slipClientAddress3;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS4: {varchar(60)} <br>
     * ご依頼主住所(アパートマンション名)
     * @return The value of the column 'SLIP_CLIENT_ADDRESS4'. (NullAllowed)
     */
    public String getSlipClientAddress4() {
        return _slipClientAddress4;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS4: {varchar(60)} <br>
     * ご依頼主住所(アパートマンション名)
     * @param slipClientAddress4 The value of the column 'SLIP_CLIENT_ADDRESS4'. (NullAllowed)
     */
    public void setSlipClientAddress4(String slipClientAddress4) {
        __modifiedProperties.add("slipClientAddress4");
        this._slipClientAddress4 = slipClientAddress4;
    }

    /**
     * [get] SLIP_CLIENT_NM: {varchar(60)} <br>
     * ご依頼主名
     * @return The value of the column 'SLIP_CLIENT_NM'. (NullAllowed)
     */
    public String getSlipClientNm() {
        return _slipClientNm;
    }

    /**
     * [set] SLIP_CLIENT_NM: {varchar(60)} <br>
     * ご依頼主名
     * @param slipClientNm The value of the column 'SLIP_CLIENT_NM'. (NullAllowed)
     */
    public void setSlipClientNm(String slipClientNm) {
        __modifiedProperties.add("slipClientNm");
        this._slipClientNm = slipClientNm;
    }

    /**
     * [get] SLIP_ITEM_CD1: {varchar(30)} <br>
     * 品名CD1
     * @return The value of the column 'SLIP_ITEM_CD1'. (NullAllowed)
     */
    public String getSlipItemCd1() {
        return _slipItemCd1;
    }

    /**
     * [set] SLIP_ITEM_CD1: {varchar(30)} <br>
     * 品名CD1
     * @param slipItemCd1 The value of the column 'SLIP_ITEM_CD1'. (NullAllowed)
     */
    public void setSlipItemCd1(String slipItemCd1) {
        __modifiedProperties.add("slipItemCd1");
        this._slipItemCd1 = slipItemCd1;
    }

    /**
     * [get] SLIP_ITEM_NM1: {varchar(60)} <br>
     * 品名1
     * @return The value of the column 'SLIP_ITEM_NM1'. (NullAllowed)
     */
    public String getSlipItemNm1() {
        return _slipItemNm1;
    }

    /**
     * [set] SLIP_ITEM_NM1: {varchar(60)} <br>
     * 品名1
     * @param slipItemNm1 The value of the column 'SLIP_ITEM_NM1'. (NullAllowed)
     */
    public void setSlipItemNm1(String slipItemNm1) {
        __modifiedProperties.add("slipItemNm1");
        this._slipItemNm1 = slipItemNm1;
    }

    /**
     * [get] SLIP_ITEM_CD2: {varchar(30)} <br>
     * 品名CD2
     * @return The value of the column 'SLIP_ITEM_CD2'. (NullAllowed)
     */
    public String getSlipItemCd2() {
        return _slipItemCd2;
    }

    /**
     * [set] SLIP_ITEM_CD2: {varchar(30)} <br>
     * 品名CD2
     * @param slipItemCd2 The value of the column 'SLIP_ITEM_CD2'. (NullAllowed)
     */
    public void setSlipItemCd2(String slipItemCd2) {
        __modifiedProperties.add("slipItemCd2");
        this._slipItemCd2 = slipItemCd2;
    }

    /**
     * [get] SLIP_ITEM_NM2: {varchar(60)} <br>
     * 品名2
     * @return The value of the column 'SLIP_ITEM_NM2'. (NullAllowed)
     */
    public String getSlipItemNm2() {
        return _slipItemNm2;
    }

    /**
     * [set] SLIP_ITEM_NM2: {varchar(60)} <br>
     * 品名2
     * @param slipItemNm2 The value of the column 'SLIP_ITEM_NM2'. (NullAllowed)
     */
    public void setSlipItemNm2(String slipItemNm2) {
        __modifiedProperties.add("slipItemNm2");
        this._slipItemNm2 = slipItemNm2;
    }

    /**
     * [get] FREIGHT_HANDLING1: {varchar(60)} <br>
     * 荷扱い1
     * @return The value of the column 'FREIGHT_HANDLING1'. (NullAllowed)
     */
    public String getFreightHandling1() {
        return _freightHandling1;
    }

    /**
     * [set] FREIGHT_HANDLING1: {varchar(60)} <br>
     * 荷扱い1
     * @param freightHandling1 The value of the column 'FREIGHT_HANDLING1'. (NullAllowed)
     */
    public void setFreightHandling1(String freightHandling1) {
        __modifiedProperties.add("freightHandling1");
        this._freightHandling1 = freightHandling1;
    }

    /**
     * [get] FREIGHT_HANDLING2: {varchar(60)} <br>
     * 荷扱い2
     * @return The value of the column 'FREIGHT_HANDLING2'. (NullAllowed)
     */
    public String getFreightHandling2() {
        return _freightHandling2;
    }

    /**
     * [set] FREIGHT_HANDLING2: {varchar(60)} <br>
     * 荷扱い2
     * @param freightHandling2 The value of the column 'FREIGHT_HANDLING2'. (NullAllowed)
     */
    public void setFreightHandling2(String freightHandling2) {
        __modifiedProperties.add("freightHandling2");
        this._freightHandling2 = freightHandling2;
    }

    /**
     * [get] ARTICLE: {varchar(255)} <br>
     * 記事
     * @return The value of the column 'ARTICLE'. (NullAllowed)
     */
    public String getArticle() {
        return _article;
    }

    /**
     * [set] ARTICLE: {varchar(255)} <br>
     * 記事
     * @param article The value of the column 'ARTICLE'. (NullAllowed)
     */
    public void setArticle(String article) {
        __modifiedProperties.add("article");
        this._article = article;
    }

    /**
     * [get] BILLING_CUSTOMER_CD: {varchar(30)} <br>
     * ご請求先顧客CD
     * @return The value of the column 'BILLING_CUSTOMER_CD'. (NullAllowed)
     */
    public String getBillingCustomerCd() {
        return _billingCustomerCd;
    }

    /**
     * [set] BILLING_CUSTOMER_CD: {varchar(30)} <br>
     * ご請求先顧客CD
     * @param billingCustomerCd The value of the column 'BILLING_CUSTOMER_CD'. (NullAllowed)
     */
    public void setBillingCustomerCd(String billingCustomerCd) {
        __modifiedProperties.add("billingCustomerCd");
        this._billingCustomerCd = billingCustomerCd;
    }

    /**
     * [get] FARE_NO: {varchar(30)} <br>
     * 運賃管理番号
     * @return The value of the column 'FARE_NO'. (NullAllowed)
     */
    public String getFareNo() {
        return _fareNo;
    }

    /**
     * [set] FARE_NO: {varchar(30)} <br>
     * 運賃管理番号
     * @param fareNo The value of the column 'FARE_NO'. (NullAllowed)
     */
    public void setFareNo(String fareNo) {
        __modifiedProperties.add("fareNo");
        this._fareNo = fareNo;
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
