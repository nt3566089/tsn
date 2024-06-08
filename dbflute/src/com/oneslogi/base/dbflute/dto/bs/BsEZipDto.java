package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_ZIP as TABLE. <br>
 * 郵便番号マスタ受信
 * <pre>
 * [primary-key]
 *     ZIP_ID
 *
 * [column]
 *     ZIP_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZIP_CD, PUBLIC_CD, ZIP_CD5, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, COMPANY_KN, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, COMPANY_NM, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, HANDLING_ADDRESS, FLG5, FLG6, UPD_CD, COMPANY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_ID
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
public abstract class BsEZipDto implements Serializable {

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
    /** ZIP_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _zipId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** ZIP_CD: {varchar(255)} */
    @JsonKey
    protected String _zipCd;

    /** PUBLIC_CD: {varchar(255)} */
    @JsonKey
    protected String _publicCd;

    /** ZIP_CD5: {varchar(255)} */
    @JsonKey
    protected String _zipCd5;

    /** ADDRESS_KN1: {varchar(255)} */
    @JsonKey
    protected String _addressKn1;

    /** ADDRESS_KN2: {varchar(255)} */
    @JsonKey
    protected String _addressKn2;

    /** ADDRESS_KN3: {varchar(255)} */
    @JsonKey
    protected String _addressKn3;

    /** COMPANY_KN: {varchar(255)} */
    @JsonKey
    protected String _companyKn;

    /** ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _address3;

    /** ADDRESS4: {varchar(255)} */
    @JsonKey
    protected String _address4;

    /** COMPANY_NM: {varchar(255)} */
    @JsonKey
    protected String _companyNm;

    /** FLG1: {varchar(255)} */
    @JsonKey
    protected String _flg1;

    /** FLG2: {varchar(255)} */
    @JsonKey
    protected String _flg2;

    /** FLG3: {varchar(255)} */
    @JsonKey
    protected String _flg3;

    /** FLG4: {varchar(255)} */
    @JsonKey
    protected String _flg4;

    /** UPD_TYPE: {varchar(255)} */
    @JsonKey
    protected String _updType;

    /** REASON_TYPE: {varchar(255)} */
    @JsonKey
    protected String _reasonType;

    /** HANDLING_ADDRESS: {varchar(255)} */
    @JsonKey
    protected String _handlingAddress;

    /** FLG5: {varchar(255)} */
    @JsonKey
    protected String _flg5;

    /** FLG6: {varchar(255)} */
    @JsonKey
    protected String _flg6;

    /** UPD_CD: {varchar(255)} */
    @JsonKey
    protected String _updCd;

    /** COMPANY_FLG: {varchar(255), default=[0]} */
    @JsonKey
    protected String _companyFlg;

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
    public BsEZipDto() {
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
        if (other == null || !(other instanceof BsEZipDto)) { return false; }
        final BsEZipDto otherEntity = (BsEZipDto)other;
        if (!helpComparingValue(getZipId(), otherEntity.getZipId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_ZIP");
        result = xCH(result, getZipId());
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
        sb.append(c).append(getZipId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getZipCd());
        sb.append(c).append(getPublicCd());
        sb.append(c).append(getZipCd5());
        sb.append(c).append(getAddressKn1());
        sb.append(c).append(getAddressKn2());
        sb.append(c).append(getAddressKn3());
        sb.append(c).append(getCompanyKn());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getAddress4());
        sb.append(c).append(getCompanyNm());
        sb.append(c).append(getFlg1());
        sb.append(c).append(getFlg2());
        sb.append(c).append(getFlg3());
        sb.append(c).append(getFlg4());
        sb.append(c).append(getUpdType());
        sb.append(c).append(getReasonType());
        sb.append(c).append(getHandlingAddress());
        sb.append(c).append(getFlg5());
        sb.append(c).append(getFlg6());
        sb.append(c).append(getUpdCd());
        sb.append(c).append(getCompanyFlg());
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
     * [get] ZIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号マスタ受信ID
     * @return The value of the column 'ZIP_ID'. (NullAllowed)
     */
    public Long getZipId() {
        return _zipId;
    }

    /**
     * [set] ZIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号マスタ受信ID
     * @param zipId The value of the column 'ZIP_ID'. (NullAllowed)
     */
    public void setZipId(Long zipId) {
        __modifiedProperties.add("zipId");
        this._zipId = zipId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] ZIP_CD: {varchar(255)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public String getZipCd() {
        return _zipCd;
    }

    /**
     * [set] ZIP_CD: {varchar(255)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public void setZipCd(String zipCd) {
        __modifiedProperties.add("zipCd");
        this._zipCd = zipCd;
    }

    /**
     * [get] PUBLIC_CD: {varchar(255)} <br>
     * 全国地方公共団体CD
     * @return The value of the column 'PUBLIC_CD'. (NullAllowed)
     */
    public String getPublicCd() {
        return _publicCd;
    }

    /**
     * [set] PUBLIC_CD: {varchar(255)} <br>
     * 全国地方公共団体CD
     * @param publicCd The value of the column 'PUBLIC_CD'. (NullAllowed)
     */
    public void setPublicCd(String publicCd) {
        __modifiedProperties.add("publicCd");
        this._publicCd = publicCd;
    }

    /**
     * [get] ZIP_CD5: {varchar(255)} <br>
     * 旧郵便番号
     * @return The value of the column 'ZIP_CD5'. (NullAllowed)
     */
    public String getZipCd5() {
        return _zipCd5;
    }

    /**
     * [set] ZIP_CD5: {varchar(255)} <br>
     * 旧郵便番号
     * @param zipCd5 The value of the column 'ZIP_CD5'. (NullAllowed)
     */
    public void setZipCd5(String zipCd5) {
        __modifiedProperties.add("zipCd5");
        this._zipCd5 = zipCd5;
    }

    /**
     * [get] ADDRESS_KN1: {varchar(255)} <br>
     * 都道府県カナ
     * @return The value of the column 'ADDRESS_KN1'. (NullAllowed)
     */
    public String getAddressKn1() {
        return _addressKn1;
    }

    /**
     * [set] ADDRESS_KN1: {varchar(255)} <br>
     * 都道府県カナ
     * @param addressKn1 The value of the column 'ADDRESS_KN1'. (NullAllowed)
     */
    public void setAddressKn1(String addressKn1) {
        __modifiedProperties.add("addressKn1");
        this._addressKn1 = addressKn1;
    }

    /**
     * [get] ADDRESS_KN2: {varchar(255)} <br>
     * 市区町村カナ
     * @return The value of the column 'ADDRESS_KN2'. (NullAllowed)
     */
    public String getAddressKn2() {
        return _addressKn2;
    }

    /**
     * [set] ADDRESS_KN2: {varchar(255)} <br>
     * 市区町村カナ
     * @param addressKn2 The value of the column 'ADDRESS_KN2'. (NullAllowed)
     */
    public void setAddressKn2(String addressKn2) {
        __modifiedProperties.add("addressKn2");
        this._addressKn2 = addressKn2;
    }

    /**
     * [get] ADDRESS_KN3: {varchar(255)} <br>
     * 町域カナ
     * @return The value of the column 'ADDRESS_KN3'. (NullAllowed)
     */
    public String getAddressKn3() {
        return _addressKn3;
    }

    /**
     * [set] ADDRESS_KN3: {varchar(255)} <br>
     * 町域カナ
     * @param addressKn3 The value of the column 'ADDRESS_KN3'. (NullAllowed)
     */
    public void setAddressKn3(String addressKn3) {
        __modifiedProperties.add("addressKn3");
        this._addressKn3 = addressKn3;
    }

    /**
     * [get] COMPANY_KN: {varchar(255)} <br>
     * 大口事業所名カナ
     * @return The value of the column 'COMPANY_KN'. (NullAllowed)
     */
    public String getCompanyKn() {
        return _companyKn;
    }

    /**
     * [set] COMPANY_KN: {varchar(255)} <br>
     * 大口事業所名カナ
     * @param companyKn The value of the column 'COMPANY_KN'. (NullAllowed)
     */
    public void setCompanyKn(String companyKn) {
        __modifiedProperties.add("companyKn");
        this._companyKn = companyKn;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * 都道府県
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * 都道府県
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 市区町村
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 市区町村
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 町域
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 町域
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] ADDRESS4: {varchar(255)} <br>
     * 小字
     * @return The value of the column 'ADDRESS4'. (NullAllowed)
     */
    public String getAddress4() {
        return _address4;
    }

    /**
     * [set] ADDRESS4: {varchar(255)} <br>
     * 小字
     * @param address4 The value of the column 'ADDRESS4'. (NullAllowed)
     */
    public void setAddress4(String address4) {
        __modifiedProperties.add("address4");
        this._address4 = address4;
    }

    /**
     * [get] COMPANY_NM: {varchar(255)} <br>
     * 大口事業所名
     * @return The value of the column 'COMPANY_NM'. (NullAllowed)
     */
    public String getCompanyNm() {
        return _companyNm;
    }

    /**
     * [set] COMPANY_NM: {varchar(255)} <br>
     * 大口事業所名
     * @param companyNm The value of the column 'COMPANY_NM'. (NullAllowed)
     */
    public void setCompanyNm(String companyNm) {
        __modifiedProperties.add("companyNm");
        this._companyNm = companyNm;
    }

    /**
     * [get] FLG1: {varchar(255)} <br>
     * フラグ1
     * @return The value of the column 'FLG1'. (NullAllowed)
     */
    public String getFlg1() {
        return _flg1;
    }

    /**
     * [set] FLG1: {varchar(255)} <br>
     * フラグ1
     * @param flg1 The value of the column 'FLG1'. (NullAllowed)
     */
    public void setFlg1(String flg1) {
        __modifiedProperties.add("flg1");
        this._flg1 = flg1;
    }

    /**
     * [get] FLG2: {varchar(255)} <br>
     * フラグ2
     * @return The value of the column 'FLG2'. (NullAllowed)
     */
    public String getFlg2() {
        return _flg2;
    }

    /**
     * [set] FLG2: {varchar(255)} <br>
     * フラグ2
     * @param flg2 The value of the column 'FLG2'. (NullAllowed)
     */
    public void setFlg2(String flg2) {
        __modifiedProperties.add("flg2");
        this._flg2 = flg2;
    }

    /**
     * [get] FLG3: {varchar(255)} <br>
     * フラグ3
     * @return The value of the column 'FLG3'. (NullAllowed)
     */
    public String getFlg3() {
        return _flg3;
    }

    /**
     * [set] FLG3: {varchar(255)} <br>
     * フラグ3
     * @param flg3 The value of the column 'FLG3'. (NullAllowed)
     */
    public void setFlg3(String flg3) {
        __modifiedProperties.add("flg3");
        this._flg3 = flg3;
    }

    /**
     * [get] FLG4: {varchar(255)} <br>
     * フラグ4
     * @return The value of the column 'FLG4'. (NullAllowed)
     */
    public String getFlg4() {
        return _flg4;
    }

    /**
     * [set] FLG4: {varchar(255)} <br>
     * フラグ4
     * @param flg4 The value of the column 'FLG4'. (NullAllowed)
     */
    public void setFlg4(String flg4) {
        __modifiedProperties.add("flg4");
        this._flg4 = flg4;
    }

    /**
     * [get] UPD_TYPE: {varchar(255)} <br>
     * 更新区分
     * @return The value of the column 'UPD_TYPE'. (NullAllowed)
     */
    public String getUpdType() {
        return _updType;
    }

    /**
     * [set] UPD_TYPE: {varchar(255)} <br>
     * 更新区分
     * @param updType The value of the column 'UPD_TYPE'. (NullAllowed)
     */
    public void setUpdType(String updType) {
        __modifiedProperties.add("updType");
        this._updType = updType;
    }

    /**
     * [get] REASON_TYPE: {varchar(255)} <br>
     * 変更理由
     * @return The value of the column 'REASON_TYPE'. (NullAllowed)
     */
    public String getReasonType() {
        return _reasonType;
    }

    /**
     * [set] REASON_TYPE: {varchar(255)} <br>
     * 変更理由
     * @param reasonType The value of the column 'REASON_TYPE'. (NullAllowed)
     */
    public void setReasonType(String reasonType) {
        __modifiedProperties.add("reasonType");
        this._reasonType = reasonType;
    }

    /**
     * [get] HANDLING_ADDRESS: {varchar(255)} <br>
     * 取扱局
     * @return The value of the column 'HANDLING_ADDRESS'. (NullAllowed)
     */
    public String getHandlingAddress() {
        return _handlingAddress;
    }

    /**
     * [set] HANDLING_ADDRESS: {varchar(255)} <br>
     * 取扱局
     * @param handlingAddress The value of the column 'HANDLING_ADDRESS'. (NullAllowed)
     */
    public void setHandlingAddress(String handlingAddress) {
        __modifiedProperties.add("handlingAddress");
        this._handlingAddress = handlingAddress;
    }

    /**
     * [get] FLG5: {varchar(255)} <br>
     * フラグ5
     * @return The value of the column 'FLG5'. (NullAllowed)
     */
    public String getFlg5() {
        return _flg5;
    }

    /**
     * [set] FLG5: {varchar(255)} <br>
     * フラグ5
     * @param flg5 The value of the column 'FLG5'. (NullAllowed)
     */
    public void setFlg5(String flg5) {
        __modifiedProperties.add("flg5");
        this._flg5 = flg5;
    }

    /**
     * [get] FLG6: {varchar(255)} <br>
     * フラグ6
     * @return The value of the column 'FLG6'. (NullAllowed)
     */
    public String getFlg6() {
        return _flg6;
    }

    /**
     * [set] FLG6: {varchar(255)} <br>
     * フラグ6
     * @param flg6 The value of the column 'FLG6'. (NullAllowed)
     */
    public void setFlg6(String flg6) {
        __modifiedProperties.add("flg6");
        this._flg6 = flg6;
    }

    /**
     * [get] UPD_CD: {varchar(255)} <br>
     * 修正CD
     * @return The value of the column 'UPD_CD'. (NullAllowed)
     */
    public String getUpdCd() {
        return _updCd;
    }

    /**
     * [set] UPD_CD: {varchar(255)} <br>
     * 修正CD
     * @param updCd The value of the column 'UPD_CD'. (NullAllowed)
     */
    public void setUpdCd(String updCd) {
        __modifiedProperties.add("updCd");
        this._updCd = updCd;
    }

    /**
     * [get] COMPANY_FLG: {varchar(255), default=[0]} <br>
     * 大口事業所フラグ
     * @return The value of the column 'COMPANY_FLG'. (NullAllowed)
     */
    public String getCompanyFlg() {
        return _companyFlg;
    }

    /**
     * [set] COMPANY_FLG: {varchar(255), default=[0]} <br>
     * 大口事業所フラグ
     * @param companyFlg The value of the column 'COMPANY_FLG'. (NullAllowed)
     */
    public void setCompanyFlg(String companyFlg) {
        __modifiedProperties.add("companyFlg");
        this._companyFlg = companyFlg;
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
