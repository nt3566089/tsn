package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRFLEXIBILACCEPTPLAN as TABLE. <br>
 * 融通輸送受払計画情報
 * <pre>
 * [primary-key]
 *     TRFLEXIBILACCEPTPLAN_ID
 *
 * [column]
 *     TRFLEXIBILACCEPTPLAN_ID, REFNO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, PRODUCT_ID, QTY, VA_EXTDATA1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRFLEXIBILACCEPTPLAN_ID
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
public abstract class BsTTrflexibilacceptplanDto implements Serializable {

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
    /** TRFLEXIBILACCEPTPLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trflexibilacceptplanId;

    /** REFNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _refno;

    /** SHIPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shipcd;

    /** SHIPSCHDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _shipschdate;

    /** SHIPTOCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shiptocd;

    /** SHIPTOSCHDATE: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _shiptoschdate;

    /** PRODUCT_ID: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productId;

    /** QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _qty;

    /** VA_EXTDATA1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

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
    public BsTTrflexibilacceptplanDto() {
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
        if (other == null || !(other instanceof BsTTrflexibilacceptplanDto)) { return false; }
        final BsTTrflexibilacceptplanDto otherEntity = (BsTTrflexibilacceptplanDto)other;
        if (!helpComparingValue(getTrflexibilacceptplanId(), otherEntity.getTrflexibilacceptplanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRFLEXIBILACCEPTPLAN");
        result = xCH(result, getTrflexibilacceptplanId());
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
        sb.append(c).append(getTrflexibilacceptplanId());
        sb.append(c).append(getRefno());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getShiptoschdate());
        sb.append(c).append(getProductId());
        sb.append(c).append(getQty());
        sb.append(c).append(getVaExtdata1());
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
     * [get] TRFLEXIBILACCEPTPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送受払計画情報ID
     * @return The value of the column 'TRFLEXIBILACCEPTPLAN_ID'. (NullAllowed)
     */
    public Long getTrflexibilacceptplanId() {
        return _trflexibilacceptplanId;
    }

    /**
     * [set] TRFLEXIBILACCEPTPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送受払計画情報ID
     * @param trflexibilacceptplanId The value of the column 'TRFLEXIBILACCEPTPLAN_ID'. (NullAllowed)
     */
    public void setTrflexibilacceptplanId(Long trflexibilacceptplanId) {
        __modifiedProperties.add("trflexibilacceptplanId");
        this._trflexibilacceptplanId = trflexibilacceptplanId;
    }

    /**
     * [get] REFNO: {NotNull, varchar(30)} <br>
     * 整理番号
     * @return The value of the column 'REFNO'. (NullAllowed)
     */
    public String getRefno() {
        return _refno;
    }

    /**
     * [set] REFNO: {NotNull, varchar(30)} <br>
     * 整理番号
     * @param refno The value of the column 'REFNO'. (NullAllowed)
     */
    public void setRefno(String refno) {
        __modifiedProperties.add("refno");
        this._refno = refno;
    }

    /**
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SHIPCD'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed)
     */
    public void setShipcd(String shipcd) {
        __modifiedProperties.add("shipcd");
        this._shipcd = shipcd;
    }

    /**
     * [get] SHIPSCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定年月日
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public String getShipschdate() {
        return _shipschdate;
    }

    /**
     * [set] SHIPSCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定年月日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public void setShipschdate(String shipschdate) {
        __modifiedProperties.add("shipschdate");
        this._shipschdate = shipschdate;
    }

    /**
     * [get] SHIPTOCD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] SHIPTOSCHDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定年月日
     * @return The value of the column 'SHIPTOSCHDATE'. (NullAllowed)
     */
    public String getShiptoschdate() {
        return _shiptoschdate;
    }

    /**
     * [set] SHIPTOSCHDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定年月日
     * @param shiptoschdate The value of the column 'SHIPTOSCHDATE'. (NullAllowed)
     */
    public void setShiptoschdate(String shiptoschdate) {
        __modifiedProperties.add("shiptoschdate");
        this._shiptoschdate = shiptoschdate;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, varchar(30)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public String getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, varchar(30)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(String productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] QTY: {NotNull, bigint(19)} <br>
     * 個数
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public Long getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19)} <br>
     * 個数
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(Long qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 受信フラグ
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 受信フラグ
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
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
