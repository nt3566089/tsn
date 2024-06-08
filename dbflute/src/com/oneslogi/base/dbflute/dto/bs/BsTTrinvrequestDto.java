package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRINVREQUEST as TABLE. <br>
 * 在庫照会要求情報
 * <pre>
 * [primary-key]
 *     TRINVREQUEST_ID
 *
 * [column]
 *     TRINVREQUEST_ID, INVINQKEY, QUESTLINENO, INVINQNO, INVINQDATE, COMPANYCD, PRODUCT_CD, STS, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVREQUEST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient, mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrinvrequestDto implements Serializable {

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
    /** TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trinvrequestId;

    /** INVINQKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _invinqkey;

    /** QUESTLINENO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _questlineno;

    /** INVINQNO: {varchar(30)} */
    @JsonKey
    protected String _invinqno;

    /** INVINQDATE: {IX, varchar(8)} */
    @JsonKey
    protected String _invinqdate;

    /** COMPANYCD: {varchar(30)} */
    @JsonKey
    protected String _companycd;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** STS: {varchar(30)} */
    @JsonKey
    protected String _sts;

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
    public BsTTrinvrequestDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrinvrequestDto)) { return false; }
        final BsTTrinvrequestDto otherEntity = (BsTTrinvrequestDto)other;
        if (!helpComparingValue(getTrinvrequestId(), otherEntity.getTrinvrequestId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRINVREQUEST");
        result = xCH(result, getTrinvrequestId());
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
        sb.append(c).append(getTrinvrequestId());
        sb.append(c).append(getInvinqkey());
        sb.append(c).append(getQuestlineno());
        sb.append(c).append(getInvinqno());
        sb.append(c).append(getInvinqdate());
        sb.append(c).append(getCompanycd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getSts());
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
     * [get] TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫照会要求情報ID
     * @return The value of the column 'TRINVREQUEST_ID'. (NullAllowed)
     */
    public Long getTrinvrequestId() {
        return _trinvrequestId;
    }

    /**
     * [set] TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫照会要求情報ID
     * @param trinvrequestId The value of the column 'TRINVREQUEST_ID'. (NullAllowed)
     */
    public void setTrinvrequestId(Long trinvrequestId) {
        __modifiedProperties.add("trinvrequestId");
        this._trinvrequestId = trinvrequestId;
    }

    /**
     * [get] INVINQKEY: {NotNull, decimal(16, 6)} <br>
     * 在庫照会キー
     * @return The value of the column 'INVINQKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getInvinqkey() {
        return _invinqkey;
    }

    /**
     * [set] INVINQKEY: {NotNull, decimal(16, 6)} <br>
     * 在庫照会キー
     * @param invinqkey The value of the column 'INVINQKEY'. (NullAllowed)
     */
    public void setInvinqkey(java.math.BigDecimal invinqkey) {
        __modifiedProperties.add("invinqkey");
        this._invinqkey = invinqkey;
    }

    /**
     * [get] QUESTLINENO: {NotNull, decimal(16, 6)} <br>
     * 在庫照会要求行No.
     * @return The value of the column 'QUESTLINENO'. (NullAllowed)
     */
    public java.math.BigDecimal getQuestlineno() {
        return _questlineno;
    }

    /**
     * [set] QUESTLINENO: {NotNull, decimal(16, 6)} <br>
     * 在庫照会要求行No.
     * @param questlineno The value of the column 'QUESTLINENO'. (NullAllowed)
     */
    public void setQuestlineno(java.math.BigDecimal questlineno) {
        __modifiedProperties.add("questlineno");
        this._questlineno = questlineno;
    }

    /**
     * [get] INVINQNO: {varchar(30)} <br>
     * 在庫照会No.
     * @return The value of the column 'INVINQNO'. (NullAllowed)
     */
    public String getInvinqno() {
        return _invinqno;
    }

    /**
     * [set] INVINQNO: {varchar(30)} <br>
     * 在庫照会No.
     * @param invinqno The value of the column 'INVINQNO'. (NullAllowed)
     */
    public void setInvinqno(String invinqno) {
        __modifiedProperties.add("invinqno");
        this._invinqno = invinqno;
    }

    /**
     * [get] INVINQDATE: {IX, varchar(8)} <br>
     * 在庫照会日
     * @return The value of the column 'INVINQDATE'. (NullAllowed)
     */
    public String getInvinqdate() {
        return _invinqdate;
    }

    /**
     * [set] INVINQDATE: {IX, varchar(8)} <br>
     * 在庫照会日
     * @param invinqdate The value of the column 'INVINQDATE'. (NullAllowed)
     */
    public void setInvinqdate(String invinqdate) {
        __modifiedProperties.add("invinqdate");
        this._invinqdate = invinqdate;
    }

    /**
     * [get] COMPANYCD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public String getCompanycd() {
        return _companycd;
    }

    /**
     * [set] COMPANYCD: {varchar(30)} <br>
     * 組織CD
     * @param companycd The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public void setCompanycd(String companycd) {
        __modifiedProperties.add("companycd");
        this._companycd = companycd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] STS: {varchar(30)} <br>
     * ステータス
     * @return The value of the column 'STS'. (NullAllowed)
     */
    public String getSts() {
        return _sts;
    }

    /**
     * [set] STS: {varchar(30)} <br>
     * ステータス
     * @param sts The value of the column 'STS'. (NullAllowed)
     */
    public void setSts(String sts) {
        __modifiedProperties.add("sts");
        this._sts = sts;
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
