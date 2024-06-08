package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRINVCORRECT as TABLE. <br>
 * 在庫調査補正情報
 * <pre>
 * [primary-key]
 *     TRINVCORRECT_ID
 *
 * [column]
 *     TRINVCORRECT_ID, CASEINVENTORYNO, CORRECTQTY, PUTDMYCASECD, PUTDMYCUTCASECD, PUTDMYCASEDETAILNO, PUTDMYDIRECTIONNO, PUTDMYDIRECTIONORDERGNO, ACTFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVCORRECT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrinvcorrectDto implements Serializable {

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
    /** TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trinvcorrectId;

    /** CASEINVENTORYNO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _caseinventoryno;

    /** CORRECTQTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _correctqty;

    /** PUTDMYCASECD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _putdmycasecd;

    /** PUTDMYCUTCASECD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _putdmycutcasecd;

    /** PUTDMYCASEDETAILNO: {bigint(19)} */
    @JsonKey
    protected Long _putdmycasedetailno;

    /** PUTDMYDIRECTIONNO: {bigint(19)} */
    @JsonKey
    protected Long _putdmydirectionno;

    /** PUTDMYDIRECTIONORDERGNO: {bigint(19)} */
    @JsonKey
    protected Long _putdmydirectionordergno;

    /** ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    @JsonKey
    protected java.math.BigDecimal _actflg;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
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
    public BsTTrinvcorrectDto() {
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

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrinvcorrectDto)) { return false; }
        final BsTTrinvcorrectDto otherEntity = (BsTTrinvcorrectDto)other;
        if (!helpComparingValue(getTrinvcorrectId(), otherEntity.getTrinvcorrectId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRINVCORRECT");
        result = xCH(result, getTrinvcorrectId());
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
        sb.append(c).append(getTrinvcorrectId());
        sb.append(c).append(getCaseinventoryno());
        sb.append(c).append(getCorrectqty());
        sb.append(c).append(getPutdmycasecd());
        sb.append(c).append(getPutdmycutcasecd());
        sb.append(c).append(getPutdmycasedetailno());
        sb.append(c).append(getPutdmydirectionno());
        sb.append(c).append(getPutdmydirectionordergno());
        sb.append(c).append(getActflg());
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
     * [get] TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫調査補正情報ID
     * @return The value of the column 'TRINVCORRECT_ID'. (NullAllowed)
     */
    public Long getTrinvcorrectId() {
        return _trinvcorrectId;
    }

    /**
     * [set] TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫調査補正情報ID
     * @param trinvcorrectId The value of the column 'TRINVCORRECT_ID'. (NullAllowed)
     */
    public void setTrinvcorrectId(Long trinvcorrectId) {
        __modifiedProperties.add("trinvcorrectId");
        this._trinvcorrectId = trinvcorrectId;
    }

    /**
     * [get] CASEINVENTORYNO: {NotNull, decimal(16, 6)} <br>
     * ケース在庫調査番号
     * @return The value of the column 'CASEINVENTORYNO'. (NullAllowed)
     */
    public java.math.BigDecimal getCaseinventoryno() {
        return _caseinventoryno;
    }

    /**
     * [set] CASEINVENTORYNO: {NotNull, decimal(16, 6)} <br>
     * ケース在庫調査番号
     * @param caseinventoryno The value of the column 'CASEINVENTORYNO'. (NullAllowed)
     */
    public void setCaseinventoryno(java.math.BigDecimal caseinventoryno) {
        __modifiedProperties.add("caseinventoryno");
        this._caseinventoryno = caseinventoryno;
    }

    /**
     * [get] CORRECTQTY: {decimal(16, 6)} <br>
     * 補正対象数量
     * @return The value of the column 'CORRECTQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getCorrectqty() {
        return _correctqty;
    }

    /**
     * [set] CORRECTQTY: {decimal(16, 6)} <br>
     * 補正対象数量
     * @param correctqty The value of the column 'CORRECTQTY'. (NullAllowed)
     */
    public void setCorrectqty(java.math.BigDecimal correctqty) {
        __modifiedProperties.add("correctqty");
        this._correctqty = correctqty;
    }

    /**
     * [get] PUTDMYCASECD: {decimal(16, 6)} <br>
     * 挿入ダミーケースCD
     * @return The value of the column 'PUTDMYCASECD'. (NullAllowed)
     */
    public java.math.BigDecimal getPutdmycasecd() {
        return _putdmycasecd;
    }

    /**
     * [set] PUTDMYCASECD: {decimal(16, 6)} <br>
     * 挿入ダミーケースCD
     * @param putdmycasecd The value of the column 'PUTDMYCASECD'. (NullAllowed)
     */
    public void setPutdmycasecd(java.math.BigDecimal putdmycasecd) {
        __modifiedProperties.add("putdmycasecd");
        this._putdmycasecd = putdmycasecd;
    }

    /**
     * [get] PUTDMYCUTCASECD: {decimal(16, 6)} <br>
     * 挿入ダミー分割ケースCD
     * @return The value of the column 'PUTDMYCUTCASECD'. (NullAllowed)
     */
    public java.math.BigDecimal getPutdmycutcasecd() {
        return _putdmycutcasecd;
    }

    /**
     * [set] PUTDMYCUTCASECD: {decimal(16, 6)} <br>
     * 挿入ダミー分割ケースCD
     * @param putdmycutcasecd The value of the column 'PUTDMYCUTCASECD'. (NullAllowed)
     */
    public void setPutdmycutcasecd(java.math.BigDecimal putdmycutcasecd) {
        __modifiedProperties.add("putdmycutcasecd");
        this._putdmycutcasecd = putdmycutcasecd;
    }

    /**
     * [get] PUTDMYCASEDETAILNO: {bigint(19)} <br>
     * 挿入ダミーケース明細番号
     * @return The value of the column 'PUTDMYCASEDETAILNO'. (NullAllowed)
     */
    public Long getPutdmycasedetailno() {
        return _putdmycasedetailno;
    }

    /**
     * [set] PUTDMYCASEDETAILNO: {bigint(19)} <br>
     * 挿入ダミーケース明細番号
     * @param putdmycasedetailno The value of the column 'PUTDMYCASEDETAILNO'. (NullAllowed)
     */
    public void setPutdmycasedetailno(Long putdmycasedetailno) {
        __modifiedProperties.add("putdmycasedetailno");
        this._putdmycasedetailno = putdmycasedetailno;
    }

    /**
     * [get] PUTDMYDIRECTIONNO: {bigint(19)} <br>
     * 挿入ダミーさしず番号
     * @return The value of the column 'PUTDMYDIRECTIONNO'. (NullAllowed)
     */
    public Long getPutdmydirectionno() {
        return _putdmydirectionno;
    }

    /**
     * [set] PUTDMYDIRECTIONNO: {bigint(19)} <br>
     * 挿入ダミーさしず番号
     * @param putdmydirectionno The value of the column 'PUTDMYDIRECTIONNO'. (NullAllowed)
     */
    public void setPutdmydirectionno(Long putdmydirectionno) {
        __modifiedProperties.add("putdmydirectionno");
        this._putdmydirectionno = putdmydirectionno;
    }

    /**
     * [get] PUTDMYDIRECTIONORDERGNO: {bigint(19)} <br>
     * 挿入ダミーさしず実績枝番号
     * @return The value of the column 'PUTDMYDIRECTIONORDERGNO'. (NullAllowed)
     */
    public Long getPutdmydirectionordergno() {
        return _putdmydirectionordergno;
    }

    /**
     * [set] PUTDMYDIRECTIONORDERGNO: {bigint(19)} <br>
     * 挿入ダミーさしず実績枝番号
     * @param putdmydirectionordergno The value of the column 'PUTDMYDIRECTIONORDERGNO'. (NullAllowed)
     */
    public void setPutdmydirectionordergno(Long putdmydirectionordergno) {
        __modifiedProperties.add("putdmydirectionordergno");
        this._putdmydirectionordergno = putdmydirectionordergno;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getActflg() {
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (NullAllowed)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        __modifiedProperties.add("actflg");
        this._actflg = actflg;
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
