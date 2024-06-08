package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CARRIER_SLIP_YUPK as TABLE. <br>
 * ゆうパック送り状マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_SLIP_YUPK_ID
 *
 * [column]
 *     CARRIER_SLIP_YUPK_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, POST_TYPE, COOL_TYPE, COD_TYPE, CARRIER_TYPE, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_ADDRESS3, SLIP_CLIENT_NM1, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_MAIL, NO_UPSIDE_DOWN_CLS, NO_STOCK_CLS, SLIP_PRODUCT_SIZE_CLS, SLIP_PRODUCT_NO, SLIP_ITEM_NM, SHIP_RESERVE_DATA_MARK, DELI_CERT_PRE_YEARS, SEND_NM, PRODUCT_TYPE_CODE, POST_BIZ_CARD_CUSTOMER_NO, SHIPPING_COMPANY_CODE, SHIPMENT_CODE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_YUPK_ID
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
 *     mCenter, bClassDtlByCharacterCd, bClassDtlByCodType, bClassDtlByCoolType, bClassDtlByDelFlg, bClassDtlByNoStockCls, bClassDtlByNoUpsideDownCls, bClassDtlByPostType
 *
 * [referrer-property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCarrierSlipYupkDto implements Serializable {

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
    /** CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _carrierSlipYupkId;

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

    /** POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} */
    @JsonKey
    protected String _postType;

    /** COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} */
    @JsonKey
    protected String _coolType;

    /** COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} */
    @JsonKey
    protected String _codType;

    /** CARRIER_TYPE: {varchar(30)} */
    @JsonKey
    protected String _carrierType;

    /** SLIP_CLIENT_ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _slipClientZipCd;

    /** SLIP_CLIENT_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _slipClientAddress1;

    /** SLIP_CLIENT_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _slipClientAddress2;

    /** SLIP_CLIENT_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _slipClientAddress3;

    /** SLIP_CLIENT_NM1: {varchar(255)} */
    @JsonKey
    protected String _slipClientNm1;

    /** SLIP_CLIENT_TEL_NO: {varchar(30)} */
    @JsonKey
    protected String _slipClientTelNo;

    /** SLIP_CLIENT_MAIL: {varchar(255)} */
    @JsonKey
    protected String _slipClientMail;

    /** NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} */
    @JsonKey
    protected String _noUpsideDownCls;

    /** NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} */
    @JsonKey
    protected String _noStockCls;

    /** SLIP_PRODUCT_SIZE_CLS: {varchar(30)} */
    @JsonKey
    protected String _slipProductSizeCls;

    /** SLIP_PRODUCT_NO: {varchar(30)} */
    @JsonKey
    protected String _slipProductNo;

    /** SLIP_ITEM_NM: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm;

    /** SHIP_RESERVE_DATA_MARK: {varchar(30)} */
    @JsonKey
    protected String _shipReserveDataMark;

    /** DELI_CERT_PRE_YEARS: {bigint(19)} */
    @JsonKey
    protected Long _deliCertPreYears;

    /** SEND_NM: {varchar(60)} */
    @JsonKey
    protected String _sendNm;

    /** PRODUCT_TYPE_CODE: {varchar(30)} */
    @JsonKey
    protected String _productTypeCode;

    /** POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)} */
    @JsonKey
    protected String _postBizCardCustomerNo;

    /** SHIPPING_COMPANY_CODE: {varchar(30)} */
    @JsonKey
    protected String _shippingCompanyCode;

    /** SHIPMENT_CODE: {varchar(30)} */
    @JsonKey
    protected String _shipmentCode;

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
    public BsMCarrierSlipYupkDto() {
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

    protected BClassDtlDto _bClassDtlByCodType;

    public BClassDtlDto getBClassDtlByCodType() {
        return _bClassDtlByCodType;
    }

    public void setBClassDtlByCodType(BClassDtlDto bClassDtlByCodType) {
        this._bClassDtlByCodType = bClassDtlByCodType;
    }

    protected BClassDtlDto _bClassDtlByCoolType;

    public BClassDtlDto getBClassDtlByCoolType() {
        return _bClassDtlByCoolType;
    }

    public void setBClassDtlByCoolType(BClassDtlDto bClassDtlByCoolType) {
        this._bClassDtlByCoolType = bClassDtlByCoolType;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected BClassDtlDto _bClassDtlByNoStockCls;

    public BClassDtlDto getBClassDtlByNoStockCls() {
        return _bClassDtlByNoStockCls;
    }

    public void setBClassDtlByNoStockCls(BClassDtlDto bClassDtlByNoStockCls) {
        this._bClassDtlByNoStockCls = bClassDtlByNoStockCls;
    }

    protected BClassDtlDto _bClassDtlByNoUpsideDownCls;

    public BClassDtlDto getBClassDtlByNoUpsideDownCls() {
        return _bClassDtlByNoUpsideDownCls;
    }

    public void setBClassDtlByNoUpsideDownCls(BClassDtlDto bClassDtlByNoUpsideDownCls) {
        this._bClassDtlByNoUpsideDownCls = bClassDtlByNoUpsideDownCls;
    }

    protected BClassDtlDto _bClassDtlByPostType;

    public BClassDtlDto getBClassDtlByPostType() {
        return _bClassDtlByPostType;
    }

    public void setBClassDtlByPostType(BClassDtlDto bClassDtlByPostType) {
        this._bClassDtlByPostType = bClassDtlByPostType;
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
        if (other == null || !(other instanceof BsMCarrierSlipYupkDto)) { return false; }
        final BsMCarrierSlipYupkDto otherEntity = (BsMCarrierSlipYupkDto)other;
        if (!helpComparingValue(getCarrierSlipYupkId(), otherEntity.getCarrierSlipYupkId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CARRIER_SLIP_YUPK");
        result = xCH(result, getCarrierSlipYupkId());
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
        sb.append(c).append(getCarrierSlipYupkId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getTagType());
        sb.append(c).append(getTagNm());
        sb.append(c).append(getCharacterCd());
        sb.append(c).append(getPostType());
        sb.append(c).append(getCoolType());
        sb.append(c).append(getCodType());
        sb.append(c).append(getCarrierType());
        sb.append(c).append(getSlipClientZipCd());
        sb.append(c).append(getSlipClientAddress1());
        sb.append(c).append(getSlipClientAddress2());
        sb.append(c).append(getSlipClientAddress3());
        sb.append(c).append(getSlipClientNm1());
        sb.append(c).append(getSlipClientTelNo());
        sb.append(c).append(getSlipClientMail());
        sb.append(c).append(getNoUpsideDownCls());
        sb.append(c).append(getNoStockCls());
        sb.append(c).append(getSlipProductSizeCls());
        sb.append(c).append(getSlipProductNo());
        sb.append(c).append(getSlipItemNm());
        sb.append(c).append(getShipReserveDataMark());
        sb.append(c).append(getDeliCertPreYears());
        sb.append(c).append(getSendNm());
        sb.append(c).append(getProductTypeCode());
        sb.append(c).append(getPostBizCardCustomerNo());
        sb.append(c).append(getShippingCompanyCode());
        sb.append(c).append(getShipmentCode());
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
     * [get] CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_YUPK_ID'. (NullAllowed)
     */
    public Long getCarrierSlipYupkId() {
        return _carrierSlipYupkId;
    }

    /**
     * [set] CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @param carrierSlipYupkId The value of the column 'CARRIER_SLIP_YUPK_ID'. (NullAllowed)
     */
    public void setCarrierSlipYupkId(Long carrierSlipYupkId) {
        __modifiedProperties.add("carrierSlipYupkId");
        this._carrierSlipYupkId = carrierSlipYupkId;
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
     * [get] POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @return The value of the column 'POST_TYPE'. (NullAllowed)
     */
    public String getPostType() {
        return _postType;
    }

    /**
     * [set] POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @param postType The value of the column 'POST_TYPE'. (NullAllowed)
     */
    public void setPostType(String postType) {
        __modifiedProperties.add("postType");
        this._postType = postType;
    }

    /**
     * [get] COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @return The value of the column 'COOL_TYPE'. (NullAllowed)
     */
    public String getCoolType() {
        return _coolType;
    }

    /**
     * [set] COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @param coolType The value of the column 'COOL_TYPE'. (NullAllowed)
     */
    public void setCoolType(String coolType) {
        __modifiedProperties.add("coolType");
        this._coolType = coolType;
    }

    /**
     * [get] COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引
     * @return The value of the column 'COD_TYPE'. (NullAllowed)
     */
    public String getCodType() {
        return _codType;
    }

    /**
     * [set] COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引
     * @param codType The value of the column 'COD_TYPE'. (NullAllowed)
     */
    public void setCodType(String codType) {
        __modifiedProperties.add("codType");
        this._codType = codType;
    }

    /**
     * [get] CARRIER_TYPE: {varchar(30)} <br>
     * 送り状種別
     * @return The value of the column 'CARRIER_TYPE'. (NullAllowed)
     */
    public String getCarrierType() {
        return _carrierType;
    }

    /**
     * [set] CARRIER_TYPE: {varchar(30)} <br>
     * 送り状種別
     * @param carrierType The value of the column 'CARRIER_TYPE'. (NullAllowed)
     */
    public void setCarrierType(String carrierType) {
        __modifiedProperties.add("carrierType");
        this._carrierType = carrierType;
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
     * [get] SLIP_CLIENT_ADDRESS3: {varchar(255)} <br>
     * ご依頼主住所3
     * @return The value of the column 'SLIP_CLIENT_ADDRESS3'. (NullAllowed)
     */
    public String getSlipClientAddress3() {
        return _slipClientAddress3;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS3: {varchar(255)} <br>
     * ご依頼主住所3
     * @param slipClientAddress3 The value of the column 'SLIP_CLIENT_ADDRESS3'. (NullAllowed)
     */
    public void setSlipClientAddress3(String slipClientAddress3) {
        __modifiedProperties.add("slipClientAddress3");
        this._slipClientAddress3 = slipClientAddress3;
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
     * [get] SLIP_CLIENT_MAIL: {varchar(255)} <br>
     * ご依頼主メールアドレス1
     * @return The value of the column 'SLIP_CLIENT_MAIL'. (NullAllowed)
     */
    public String getSlipClientMail() {
        return _slipClientMail;
    }

    /**
     * [set] SLIP_CLIENT_MAIL: {varchar(255)} <br>
     * ご依頼主メールアドレス1
     * @param slipClientMail The value of the column 'SLIP_CLIENT_MAIL'. (NullAllowed)
     */
    public void setSlipClientMail(String slipClientMail) {
        __modifiedProperties.add("slipClientMail");
        this._slipClientMail = slipClientMail;
    }

    /**
     * [get] NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @return The value of the column 'NO_UPSIDE_DOWN_CLS'. (NullAllowed)
     */
    public String getNoUpsideDownCls() {
        return _noUpsideDownCls;
    }

    /**
     * [set] NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @param noUpsideDownCls The value of the column 'NO_UPSIDE_DOWN_CLS'. (NullAllowed)
     */
    public void setNoUpsideDownCls(String noUpsideDownCls) {
        __modifiedProperties.add("noUpsideDownCls");
        this._noUpsideDownCls = noUpsideDownCls;
    }

    /**
     * [get] NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @return The value of the column 'NO_STOCK_CLS'. (NullAllowed)
     */
    public String getNoStockCls() {
        return _noStockCls;
    }

    /**
     * [set] NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @param noStockCls The value of the column 'NO_STOCK_CLS'. (NullAllowed)
     */
    public void setNoStockCls(String noStockCls) {
        __modifiedProperties.add("noStockCls");
        this._noStockCls = noStockCls;
    }

    /**
     * [get] SLIP_PRODUCT_SIZE_CLS: {varchar(30)} <br>
     * 商品サイズ区分
     * @return The value of the column 'SLIP_PRODUCT_SIZE_CLS'. (NullAllowed)
     */
    public String getSlipProductSizeCls() {
        return _slipProductSizeCls;
    }

    /**
     * [set] SLIP_PRODUCT_SIZE_CLS: {varchar(30)} <br>
     * 商品サイズ区分
     * @param slipProductSizeCls The value of the column 'SLIP_PRODUCT_SIZE_CLS'. (NullAllowed)
     */
    public void setSlipProductSizeCls(String slipProductSizeCls) {
        __modifiedProperties.add("slipProductSizeCls");
        this._slipProductSizeCls = slipProductSizeCls;
    }

    /**
     * [get] SLIP_PRODUCT_NO: {varchar(30)} <br>
     * 商品番号(明細)
     * @return The value of the column 'SLIP_PRODUCT_NO'. (NullAllowed)
     */
    public String getSlipProductNo() {
        return _slipProductNo;
    }

    /**
     * [set] SLIP_PRODUCT_NO: {varchar(30)} <br>
     * 商品番号(明細)
     * @param slipProductNo The value of the column 'SLIP_PRODUCT_NO'. (NullAllowed)
     */
    public void setSlipProductNo(String slipProductNo) {
        __modifiedProperties.add("slipProductNo");
        this._slipProductNo = slipProductNo;
    }

    /**
     * [get] SLIP_ITEM_NM: {varchar(255)} <br>
     * 品名(明細)
     * @return The value of the column 'SLIP_ITEM_NM'. (NullAllowed)
     */
    public String getSlipItemNm() {
        return _slipItemNm;
    }

    /**
     * [set] SLIP_ITEM_NM: {varchar(255)} <br>
     * 品名(明細)
     * @param slipItemNm The value of the column 'SLIP_ITEM_NM'. (NullAllowed)
     */
    public void setSlipItemNm(String slipItemNm) {
        __modifiedProperties.add("slipItemNm");
        this._slipItemNm = slipItemNm;
    }

    /**
     * [get] SHIP_RESERVE_DATA_MARK: {varchar(30)} <br>
     * 発送予約データマーク
     * @return The value of the column 'SHIP_RESERVE_DATA_MARK'. (NullAllowed)
     */
    public String getShipReserveDataMark() {
        return _shipReserveDataMark;
    }

    /**
     * [set] SHIP_RESERVE_DATA_MARK: {varchar(30)} <br>
     * 発送予約データマーク
     * @param shipReserveDataMark The value of the column 'SHIP_RESERVE_DATA_MARK'. (NullAllowed)
     */
    public void setShipReserveDataMark(String shipReserveDataMark) {
        __modifiedProperties.add("shipReserveDataMark");
        this._shipReserveDataMark = shipReserveDataMark;
    }

    /**
     * [get] DELI_CERT_PRE_YEARS: {bigint(19)} <br>
     * 配達証保存年数
     * @return The value of the column 'DELI_CERT_PRE_YEARS'. (NullAllowed)
     */
    public Long getDeliCertPreYears() {
        return _deliCertPreYears;
    }

    /**
     * [set] DELI_CERT_PRE_YEARS: {bigint(19)} <br>
     * 配達証保存年数
     * @param deliCertPreYears The value of the column 'DELI_CERT_PRE_YEARS'. (NullAllowed)
     */
    public void setDeliCertPreYears(Long deliCertPreYears) {
        __modifiedProperties.add("deliCertPreYears");
        this._deliCertPreYears = deliCertPreYears;
    }

    /**
     * [get] SEND_NM: {varchar(60)} <br>
     * 発店名称
     * @return The value of the column 'SEND_NM'. (NullAllowed)
     */
    public String getSendNm() {
        return _sendNm;
    }

    /**
     * [set] SEND_NM: {varchar(60)} <br>
     * 発店名称
     * @param sendNm The value of the column 'SEND_NM'. (NullAllowed)
     */
    public void setSendNm(String sendNm) {
        __modifiedProperties.add("sendNm");
        this._sendNm = sendNm;
    }

    /**
     * [get] PRODUCT_TYPE_CODE: {varchar(30)} <br>
     * 商品種別CD
     * @return The value of the column 'PRODUCT_TYPE_CODE'. (NullAllowed)
     */
    public String getProductTypeCode() {
        return _productTypeCode;
    }

    /**
     * [set] PRODUCT_TYPE_CODE: {varchar(30)} <br>
     * 商品種別CD
     * @param productTypeCode The value of the column 'PRODUCT_TYPE_CODE'. (NullAllowed)
     */
    public void setProductTypeCode(String productTypeCode) {
        __modifiedProperties.add("productTypeCode");
        this._productTypeCode = productTypeCode;
    }

    /**
     * [get] POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)} <br>
     * ゆうびんビズカードお客さま番号
     * @return The value of the column 'POST_BIZ_CARD_CUSTOMER_NO'. (NullAllowed)
     */
    public String getPostBizCardCustomerNo() {
        return _postBizCardCustomerNo;
    }

    /**
     * [set] POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)} <br>
     * ゆうびんビズカードお客さま番号
     * @param postBizCardCustomerNo The value of the column 'POST_BIZ_CARD_CUSTOMER_NO'. (NullAllowed)
     */
    public void setPostBizCardCustomerNo(String postBizCardCustomerNo) {
        __modifiedProperties.add("postBizCardCustomerNo");
        this._postBizCardCustomerNo = postBizCardCustomerNo;
    }

    /**
     * [get] SHIPPING_COMPANY_CODE: {varchar(30)} <br>
     * 発送会社CD
     * @return The value of the column 'SHIPPING_COMPANY_CODE'. (NullAllowed)
     */
    public String getShippingCompanyCode() {
        return _shippingCompanyCode;
    }

    /**
     * [set] SHIPPING_COMPANY_CODE: {varchar(30)} <br>
     * 発送会社CD
     * @param shippingCompanyCode The value of the column 'SHIPPING_COMPANY_CODE'. (NullAllowed)
     */
    public void setShippingCompanyCode(String shippingCompanyCode) {
        __modifiedProperties.add("shippingCompanyCode");
        this._shippingCompanyCode = shippingCompanyCode;
    }

    /**
     * [get] SHIPMENT_CODE: {varchar(30)} <br>
     * 発送局CD
     * @return The value of the column 'SHIPMENT_CODE'. (NullAllowed)
     */
    public String getShipmentCode() {
        return _shipmentCode;
    }

    /**
     * [set] SHIPMENT_CODE: {varchar(30)} <br>
     * 発送局CD
     * @param shipmentCode The value of the column 'SHIPMENT_CODE'. (NullAllowed)
     */
    public void setShipmentCode(String shipmentCode) {
        __modifiedProperties.add("shipmentCode");
        this._shipmentCode = shipmentCode;
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
