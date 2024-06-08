package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRFLEXIBILITY as TABLE. <br>
 * 融通輸送情報
 * <pre>
 * [primary-key]
 *     FLEXIBLE_TRANSPORT_INFO_ID
 *
 * [column]
 *     FLEXIBLE_TRANSPORT_INFO_ID, SUPPLIERCD, SHIPCD, SCHDATE, FLEXIBITYNO, TRANSPORTCD, RCVDATE, STS, INSTRACTDATETIME, VA_EXTDATA1, NM_EXTDATA1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FLEXIBLE_TRANSPORT_INFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     T_TRFLEXIBILITYDETAIL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     tTrflexibilitydetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrflexibilityDto implements Serializable {

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
    /** FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _flexibleTransportInfoId;

    /** SUPPLIERCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _suppliercd;

    /** SHIPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shipcd;

    /** SCHDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _schdate;

    /** FLEXIBITYNO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _flexibityno;

    /** TRANSPORTCD: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _transportcd;

    /** RCVDATE: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _rcvdate;

    /** STS: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _sts;

    /** INSTRACTDATETIME: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _instractdatetime;

    /** VA_EXTDATA1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

    /** NM_EXTDATA1: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata1;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

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
    public BsTTrflexibilityDto() {
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
    protected List<TTrflexibilitydetailDto> _tTrflexibilitydetailList;

    public List<TTrflexibilitydetailDto> getTTrflexibilitydetailList() {
        if (_tTrflexibilitydetailList == null) { _tTrflexibilitydetailList = new ArrayList<TTrflexibilitydetailDto>(); }
        return _tTrflexibilitydetailList;
    }

    public void setTTrflexibilitydetailList(List<TTrflexibilitydetailDto> tTrflexibilitydetailList) {
        this._tTrflexibilitydetailList = tTrflexibilitydetailList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrflexibilityDto)) { return false; }
        final BsTTrflexibilityDto otherEntity = (BsTTrflexibilityDto)other;
        if (!helpComparingValue(getFlexibleTransportInfoId(), otherEntity.getFlexibleTransportInfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRFLEXIBILITY");
        result = xCH(result, getFlexibleTransportInfoId());
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
        sb.append(c).append(getFlexibleTransportInfoId());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getSchdate());
        sb.append(c).append(getFlexibityno());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getRcvdate());
        sb.append(c).append(getSts());
        sb.append(c).append(getInstractdatetime());
        sb.append(c).append(getVaExtdata1());
        sb.append(c).append(getNmExtdata1());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
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
     * [get] FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送情報ID
     * @return The value of the column 'FLEXIBLE_TRANSPORT_INFO_ID'. (NullAllowed)
     */
    public Long getFlexibleTransportInfoId() {
        return _flexibleTransportInfoId;
    }

    /**
     * [set] FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送情報ID
     * @param flexibleTransportInfoId The value of the column 'FLEXIBLE_TRANSPORT_INFO_ID'. (NullAllowed)
     */
    public void setFlexibleTransportInfoId(Long flexibleTransportInfoId) {
        __modifiedProperties.add("flexibleTransportInfoId");
        this._flexibleTransportInfoId = flexibleTransportInfoId;
    }

    /**
     * [get] SUPPLIERCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public String getSuppliercd() {
        return _suppliercd;
    }

    /**
     * [set] SUPPLIERCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public void setSuppliercd(String suppliercd) {
        __modifiedProperties.add("suppliercd");
        this._suppliercd = suppliercd;
    }

    /**
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送先CD
     * @return The value of the column 'SHIPCD'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送先CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed)
     */
    public void setShipcd(String shipcd) {
        __modifiedProperties.add("shipcd");
        this._shipcd = shipcd;
    }

    /**
     * [get] SCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed)
     */
    public String getSchdate() {
        return _schdate;
    }

    /**
     * [set] SCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed)
     */
    public void setSchdate(String schdate) {
        __modifiedProperties.add("schdate");
        this._schdate = schdate;
    }

    /**
     * [get] FLEXIBITYNO: {NotNull, decimal(16, 6)} <br>
     * 融通No.
     * @return The value of the column 'FLEXIBITYNO'. (NullAllowed)
     */
    public java.math.BigDecimal getFlexibityno() {
        return _flexibityno;
    }

    /**
     * [set] FLEXIBITYNO: {NotNull, decimal(16, 6)} <br>
     * 融通No.
     * @param flexibityno The value of the column 'FLEXIBITYNO'. (NullAllowed)
     */
    public void setFlexibityno(java.math.BigDecimal flexibityno) {
        __modifiedProperties.add("flexibityno");
        this._flexibityno = flexibityno;
    }

    /**
     * [get] TRANSPORTCD: {IX, NotNull, varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {IX, NotNull, varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] RCVDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (NullAllowed)
     */
    public String getRcvdate() {
        return _rcvdate;
    }

    /**
     * [set] RCVDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (NullAllowed)
     */
    public void setRcvdate(String rcvdate) {
        __modifiedProperties.add("rcvdate");
        this._rcvdate = rcvdate;
    }

    /**
     * [get] STS: {IX, NotNull, bigint(19)} <br>
     * ステータス
     * @return The value of the column 'STS'. (NullAllowed)
     */
    public Long getSts() {
        return _sts;
    }

    /**
     * [set] STS: {IX, NotNull, bigint(19)} <br>
     * ステータス
     * @param sts The value of the column 'STS'. (NullAllowed)
     */
    public void setSts(Long sts) {
        __modifiedProperties.add("sts");
        this._sts = sts;
    }

    /**
     * [get] INSTRACTDATETIME: {NotNull, datetime2(26, 6)} <br>
     * 指示登録日時
     * @return The value of the column 'INSTRACTDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInstractdatetime() {
        return _instractdatetime;
    }

    /**
     * [set] INSTRACTDATETIME: {NotNull, datetime2(26, 6)} <br>
     * 指示登録日時
     * @param instractdatetime The value of the column 'INSTRACTDATETIME'. (NullAllowed)
     */
    public void setInstractdatetime(java.sql.Timestamp instractdatetime) {
        __modifiedProperties.add("instractdatetime");
        this._instractdatetime = instractdatetime;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 指示変更フラグ
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 指示変更フラグ
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 発送元融通ステータス
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public Long getNmExtdata1() {
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 発送元融通ステータス
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        __modifiedProperties.add("nmExtdata1");
        this._nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
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
