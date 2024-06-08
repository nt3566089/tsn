package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CARRIER_ZIP as TABLE. <br>
 * 運送業者郵便番号マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_ZIP_ID
 *
 * [column]
 *     CARRIER_ZIP_ID, COMMON_CARRIER_ID, ZIP_ID, ARRIVAL_STORE_CD, ARRIVAL_STORE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ZIP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_COMMON_CARRIER, M_ZIP
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCommonCarrier, mZip
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCarrierZipDto implements Serializable {

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
    /** CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _carrierZipId;

    /** COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER} */
    @JsonKey
    protected Long _commonCarrierId;

    /** ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP} */
    @JsonKey
    protected Long _zipId;

    /** ARRIVAL_STORE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _arrivalStoreCd;

    /** ARRIVAL_STORE_NM: {varchar(255)} */
    @JsonKey
    protected String _arrivalStoreNm;

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
    public BsMCarrierZipDto() {
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
    protected MCommonCarrierDto _mCommonCarrier;

    public MCommonCarrierDto getMCommonCarrier() {
        return _mCommonCarrier;
    }

    public void setMCommonCarrier(MCommonCarrierDto mCommonCarrier) {
        this._mCommonCarrier = mCommonCarrier;
    }

    protected MZipDto _mZip;

    public MZipDto getMZip() {
        return _mZip;
    }

    public void setMZip(MZipDto mZip) {
        this._mZip = mZip;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCarrierZipDto)) { return false; }
        final BsMCarrierZipDto otherEntity = (BsMCarrierZipDto)other;
        if (!helpComparingValue(getCarrierZipId(), otherEntity.getCarrierZipId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CARRIER_ZIP");
        result = xCH(result, getCarrierZipId());
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
        sb.append(c).append(getCarrierZipId());
        sb.append(c).append(getCommonCarrierId());
        sb.append(c).append(getZipId());
        sb.append(c).append(getArrivalStoreCd());
        sb.append(c).append(getArrivalStoreNm());
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
     * [get] CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 運送業者郵便番号ID
     * @return The value of the column 'CARRIER_ZIP_ID'. (NullAllowed)
     */
    public Long getCarrierZipId() {
        return _carrierZipId;
    }

    /**
     * [set] CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 運送業者郵便番号ID
     * @param carrierZipId The value of the column 'CARRIER_ZIP_ID'. (NullAllowed)
     */
    public void setCarrierZipId(Long carrierZipId) {
        __modifiedProperties.add("carrierZipId");
        this._carrierZipId = carrierZipId;
    }

    /**
     * [get] COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER} <br>
     * 共通運送業者ID
     * @return The value of the column 'COMMON_CARRIER_ID'. (NullAllowed)
     */
    public Long getCommonCarrierId() {
        return _commonCarrierId;
    }

    /**
     * [set] COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER} <br>
     * 共通運送業者ID
     * @param commonCarrierId The value of the column 'COMMON_CARRIER_ID'. (NullAllowed)
     */
    public void setCommonCarrierId(Long commonCarrierId) {
        __modifiedProperties.add("commonCarrierId");
        this._commonCarrierId = commonCarrierId;
    }

    /**
     * [get] ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP} <br>
     * 郵便番号ID
     * @return The value of the column 'ZIP_ID'. (NullAllowed)
     */
    public Long getZipId() {
        return _zipId;
    }

    /**
     * [set] ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP} <br>
     * 郵便番号ID
     * @param zipId The value of the column 'ZIP_ID'. (NullAllowed)
     */
    public void setZipId(Long zipId) {
        __modifiedProperties.add("zipId");
        this._zipId = zipId;
    }

    /**
     * [get] ARRIVAL_STORE_CD: {NotNull, varchar(30)} <br>
     * 着店CD
     * @return The value of the column 'ARRIVAL_STORE_CD'. (NullAllowed)
     */
    public String getArrivalStoreCd() {
        return _arrivalStoreCd;
    }

    /**
     * [set] ARRIVAL_STORE_CD: {NotNull, varchar(30)} <br>
     * 着店CD
     * @param arrivalStoreCd The value of the column 'ARRIVAL_STORE_CD'. (NullAllowed)
     */
    public void setArrivalStoreCd(String arrivalStoreCd) {
        __modifiedProperties.add("arrivalStoreCd");
        this._arrivalStoreCd = arrivalStoreCd;
    }

    /**
     * [get] ARRIVAL_STORE_NM: {varchar(255)} <br>
     * 着店名称
     * @return The value of the column 'ARRIVAL_STORE_NM'. (NullAllowed)
     */
    public String getArrivalStoreNm() {
        return _arrivalStoreNm;
    }

    /**
     * [set] ARRIVAL_STORE_NM: {varchar(255)} <br>
     * 着店名称
     * @param arrivalStoreNm The value of the column 'ARRIVAL_STORE_NM'. (NullAllowed)
     */
    public void setArrivalStoreNm(String arrivalStoreNm) {
        __modifiedProperties.add("arrivalStoreNm");
        this._arrivalStoreNm = arrivalStoreNm;
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
