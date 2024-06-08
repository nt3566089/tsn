package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_COMMON_CARRIER as TABLE. <br>
 * 共通運送業者マスタ
 * <pre>
 * [primary-key]
 *     COMMON_CARRIER_ID
 *
 * [column]
 *     COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, ARRIVAL_STORE_BARCODE, ARRIVAL_STORE_START_BIT, ARRIVAL_STORE_END_BIT, ARRIVAL_STORE_FORMAT, TRACKING_BARCODE, TRACKING_START_BIT, TRACKING_END_BIT, BOL_OUTPUT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COMMON_CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByArrivalStoreFormat)
 *
 * [referrer-table]
 *     M_CARRIER, M_CARRIER_ZIP
 *
 * [foreign-property]
 *     bClassDtlByArrivalStoreFormat, bClassDtlByBolOutputTargetFlg
 *
 * [referrer-property]
 *     mCarrierList, mCarrierZipList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCommonCarrierDto implements Serializable {

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
    /** COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _commonCarrierId;

    /** CARRIER_CD: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _carrierNm;

    /** CARRIER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _carrierAbbr;

    /** ARRIVAL_STORE_BARCODE: {varchar(30)} */
    @JsonKey
    protected String _arrivalStoreBarcode;

    /** ARRIVAL_STORE_START_BIT: {varchar(30)} */
    @JsonKey
    protected String _arrivalStoreStartBit;

    /** ARRIVAL_STORE_END_BIT: {varchar(30)} */
    @JsonKey
    protected String _arrivalStoreEndBit;

    /** ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} */
    @JsonKey
    protected String _arrivalStoreFormat;

    /** TRACKING_BARCODE: {varchar(30)} */
    @JsonKey
    protected String _trackingBarcode;

    /** TRACKING_START_BIT: {varchar(30)} */
    @JsonKey
    protected String _trackingStartBit;

    /** TRACKING_END_BIT: {varchar(30)} */
    @JsonKey
    protected String _trackingEndBit;

    /** BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} */
    @JsonKey
    protected String _bolOutputTargetFlg;

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
    public BsMCommonCarrierDto() {
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
    protected BClassDtlDto _bClassDtlByArrivalStoreFormat;

    public BClassDtlDto getBClassDtlByArrivalStoreFormat() {
        return _bClassDtlByArrivalStoreFormat;
    }

    public void setBClassDtlByArrivalStoreFormat(BClassDtlDto bClassDtlByArrivalStoreFormat) {
        this._bClassDtlByArrivalStoreFormat = bClassDtlByArrivalStoreFormat;
    }

    protected BClassDtlDto _bClassDtlByBolOutputTargetFlg;

    public BClassDtlDto getBClassDtlByBolOutputTargetFlg() {
        return _bClassDtlByBolOutputTargetFlg;
    }

    public void setBClassDtlByBolOutputTargetFlg(BClassDtlDto bClassDtlByBolOutputTargetFlg) {
        this._bClassDtlByBolOutputTargetFlg = bClassDtlByBolOutputTargetFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MCarrierDto> _mCarrierList;

    public List<MCarrierDto> getMCarrierList() {
        if (_mCarrierList == null) { _mCarrierList = new ArrayList<MCarrierDto>(); }
        return _mCarrierList;
    }

    public void setMCarrierList(List<MCarrierDto> mCarrierList) {
        this._mCarrierList = mCarrierList;
    }

    protected List<MCarrierZipDto> _mCarrierZipList;

    public List<MCarrierZipDto> getMCarrierZipList() {
        if (_mCarrierZipList == null) { _mCarrierZipList = new ArrayList<MCarrierZipDto>(); }
        return _mCarrierZipList;
    }

    public void setMCarrierZipList(List<MCarrierZipDto> mCarrierZipList) {
        this._mCarrierZipList = mCarrierZipList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCommonCarrierDto)) { return false; }
        final BsMCommonCarrierDto otherEntity = (BsMCommonCarrierDto)other;
        if (!helpComparingValue(getCommonCarrierId(), otherEntity.getCommonCarrierId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_COMMON_CARRIER");
        result = xCH(result, getCommonCarrierId());
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
        sb.append(c).append(getCommonCarrierId());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getCarrierAbbr());
        sb.append(c).append(getArrivalStoreBarcode());
        sb.append(c).append(getArrivalStoreStartBit());
        sb.append(c).append(getArrivalStoreEndBit());
        sb.append(c).append(getArrivalStoreFormat());
        sb.append(c).append(getTrackingBarcode());
        sb.append(c).append(getTrackingStartBit());
        sb.append(c).append(getTrackingEndBit());
        sb.append(c).append(getBolOutputTargetFlg());
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
     * [get] COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通運送業者ID
     * @return The value of the column 'COMMON_CARRIER_ID'. (NullAllowed)
     */
    public Long getCommonCarrierId() {
        return _commonCarrierId;
    }

    /**
     * [set] COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通運送業者ID
     * @param commonCarrierId The value of the column 'COMMON_CARRIER_ID'. (NullAllowed)
     */
    public void setCommonCarrierId(Long commonCarrierId) {
        __modifiedProperties.add("commonCarrierId");
        this._commonCarrierId = commonCarrierId;
    }

    /**
     * [get] CARRIER_CD: {IX, NotNull, varchar(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {IX, NotNull, varchar(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {NotNull, varchar(60)} <br>
     * 運送業者名称
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {NotNull, varchar(60)} <br>
     * 運送業者名称
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] CARRIER_ABBR: {varchar(60)} <br>
     * 運送業者略称
     * @return The value of the column 'CARRIER_ABBR'. (NullAllowed)
     */
    public String getCarrierAbbr() {
        return _carrierAbbr;
    }

    /**
     * [set] CARRIER_ABBR: {varchar(60)} <br>
     * 運送業者略称
     * @param carrierAbbr The value of the column 'CARRIER_ABBR'. (NullAllowed)
     */
    public void setCarrierAbbr(String carrierAbbr) {
        __modifiedProperties.add("carrierAbbr");
        this._carrierAbbr = carrierAbbr;
    }

    /**
     * [get] ARRIVAL_STORE_BARCODE: {varchar(30)} <br>
     * 着店CDバーコード種別
     * @return The value of the column 'ARRIVAL_STORE_BARCODE'. (NullAllowed)
     */
    public String getArrivalStoreBarcode() {
        return _arrivalStoreBarcode;
    }

    /**
     * [set] ARRIVAL_STORE_BARCODE: {varchar(30)} <br>
     * 着店CDバーコード種別
     * @param arrivalStoreBarcode The value of the column 'ARRIVAL_STORE_BARCODE'. (NullAllowed)
     */
    public void setArrivalStoreBarcode(String arrivalStoreBarcode) {
        __modifiedProperties.add("arrivalStoreBarcode");
        this._arrivalStoreBarcode = arrivalStoreBarcode;
    }

    /**
     * [get] ARRIVAL_STORE_START_BIT: {varchar(30)} <br>
     * 着店CDスタートビット
     * @return The value of the column 'ARRIVAL_STORE_START_BIT'. (NullAllowed)
     */
    public String getArrivalStoreStartBit() {
        return _arrivalStoreStartBit;
    }

    /**
     * [set] ARRIVAL_STORE_START_BIT: {varchar(30)} <br>
     * 着店CDスタートビット
     * @param arrivalStoreStartBit The value of the column 'ARRIVAL_STORE_START_BIT'. (NullAllowed)
     */
    public void setArrivalStoreStartBit(String arrivalStoreStartBit) {
        __modifiedProperties.add("arrivalStoreStartBit");
        this._arrivalStoreStartBit = arrivalStoreStartBit;
    }

    /**
     * [get] ARRIVAL_STORE_END_BIT: {varchar(30)} <br>
     * 着店CDエンドビット
     * @return The value of the column 'ARRIVAL_STORE_END_BIT'. (NullAllowed)
     */
    public String getArrivalStoreEndBit() {
        return _arrivalStoreEndBit;
    }

    /**
     * [set] ARRIVAL_STORE_END_BIT: {varchar(30)} <br>
     * 着店CDエンドビット
     * @param arrivalStoreEndBit The value of the column 'ARRIVAL_STORE_END_BIT'. (NullAllowed)
     */
    public void setArrivalStoreEndBit(String arrivalStoreEndBit) {
        __modifiedProperties.add("arrivalStoreEndBit");
        this._arrivalStoreEndBit = arrivalStoreEndBit;
    }

    /**
     * [get] ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @return The value of the column 'ARRIVAL_STORE_FORMAT'. (NullAllowed)
     */
    public String getArrivalStoreFormat() {
        return _arrivalStoreFormat;
    }

    /**
     * [set] ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @param arrivalStoreFormat The value of the column 'ARRIVAL_STORE_FORMAT'. (NullAllowed)
     */
    public void setArrivalStoreFormat(String arrivalStoreFormat) {
        __modifiedProperties.add("arrivalStoreFormat");
        this._arrivalStoreFormat = arrivalStoreFormat;
    }

    /**
     * [get] TRACKING_BARCODE: {varchar(30)} <br>
     * 追跡番号バーコード種別
     * @return The value of the column 'TRACKING_BARCODE'. (NullAllowed)
     */
    public String getTrackingBarcode() {
        return _trackingBarcode;
    }

    /**
     * [set] TRACKING_BARCODE: {varchar(30)} <br>
     * 追跡番号バーコード種別
     * @param trackingBarcode The value of the column 'TRACKING_BARCODE'. (NullAllowed)
     */
    public void setTrackingBarcode(String trackingBarcode) {
        __modifiedProperties.add("trackingBarcode");
        this._trackingBarcode = trackingBarcode;
    }

    /**
     * [get] TRACKING_START_BIT: {varchar(30)} <br>
     * 追跡番号スタートビット
     * @return The value of the column 'TRACKING_START_BIT'. (NullAllowed)
     */
    public String getTrackingStartBit() {
        return _trackingStartBit;
    }

    /**
     * [set] TRACKING_START_BIT: {varchar(30)} <br>
     * 追跡番号スタートビット
     * @param trackingStartBit The value of the column 'TRACKING_START_BIT'. (NullAllowed)
     */
    public void setTrackingStartBit(String trackingStartBit) {
        __modifiedProperties.add("trackingStartBit");
        this._trackingStartBit = trackingStartBit;
    }

    /**
     * [get] TRACKING_END_BIT: {varchar(30)} <br>
     * 追跡番号エンドビット
     * @return The value of the column 'TRACKING_END_BIT'. (NullAllowed)
     */
    public String getTrackingEndBit() {
        return _trackingEndBit;
    }

    /**
     * [set] TRACKING_END_BIT: {varchar(30)} <br>
     * 追跡番号エンドビット
     * @param trackingEndBit The value of the column 'TRACKING_END_BIT'. (NullAllowed)
     */
    public void setTrackingEndBit(String trackingEndBit) {
        __modifiedProperties.add("trackingEndBit");
        this._trackingEndBit = trackingEndBit;
    }

    /**
     * [get] BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @return The value of the column 'BOL_OUTPUT_TARGET_FLG'. (NullAllowed)
     */
    public String getBolOutputTargetFlg() {
        return _bolOutputTargetFlg;
    }

    /**
     * [set] BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @param bolOutputTargetFlg The value of the column 'BOL_OUTPUT_TARGET_FLG'. (NullAllowed)
     */
    public void setBolOutputTargetFlg(String bolOutputTargetFlg) {
        __modifiedProperties.add("bolOutputTargetFlg");
        this._bolOutputTargetFlg = bolOutputTargetFlg;
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
